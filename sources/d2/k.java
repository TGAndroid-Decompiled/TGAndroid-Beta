package d2;

import android.os.Bundle;
import android.os.IBinder;
import java.util.Arrays;
public final class k {
    public static final int f8155b = m.f8182a;
    public final h f8156a;

    public k(byte[] bArr) {
        g9.f0 p10 = g9.i0.p();
        int length = bArr.length;
        int i3 = f8155b;
        int g7 = g2.n0.g(length, i3);
        for (int i10 = 0; i10 < g7; i10++) {
            Bundle bundle = new Bundle();
            int i11 = i10 * i3;
            bundle.putByteArray("bytes", Arrays.copyOfRange(bArr, i11, Math.min(i11 + i3, bArr.length)));
            p10.c(bundle);
        }
        this.f8156a = new h(p10.f());
    }

    public static byte[] a(Bundle bundle) {
        IBinder binder = bundle.getBinder(l.f8169g);
        if (binder != null) {
            try {
                g9.i0 a10 = h.a(binder);
                if (a10.isEmpty()) {
                    return g2.n0.f11874b;
                }
                byte[] byteArray = ((Bundle) g9.o.n(a10)).getByteArray("bytes");
                if (byteArray != null) {
                    int size = a10.size() - 1;
                    int i3 = f8155b;
                    int i10 = size * i3;
                    byte[] bArr = new byte[byteArray.length + i10];
                    System.arraycopy(byteArray, 0, bArr, i10, byteArray.length);
                    for (int i11 = 0; i11 < size; i11++) {
                        byte[] byteArray2 = ((Bundle) a10.get(i11)).getByteArray("bytes");
                        if (byteArray2 != null && byteArray2.length == i3) {
                            System.arraycopy(byteArray2, 0, bArr, i11 * i3, i3);
                        }
                    }
                    return bArr;
                }
            } catch (RuntimeException e10) {
                g2.a.m("BundleableByteArray", "Failed to read byte array from bundle list retriever", e10);
                return null;
            }
        }
        return null;
    }
}
