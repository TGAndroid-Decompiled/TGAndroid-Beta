package e2;

import android.os.Bundle;
import android.os.IBinder;
import java.util.Arrays;
public final class j {
    public static final int f10286b = l.f10338a;
    public final g f10287a;

    public j(byte[] bArr) {
        h9.f0 p10 = h9.i0.p();
        int length = bArr.length;
        int i7 = f10286b;
        int g10 = h2.m0.g(length, i7);
        for (int i10 = 0; i10 < g10; i10++) {
            Bundle bundle = new Bundle();
            int i11 = i10 * i7;
            bundle.putByteArray("bytes", Arrays.copyOfRange(bArr, i11, Math.min(i11 + i7, bArr.length)));
            p10.c(bundle);
        }
        this.f10287a = new g(p10.f());
    }

    public static byte[] a(Bundle bundle) {
        IBinder binder = bundle.getBinder(k.f10299g);
        if (binder != null) {
            try {
                h9.i0 a10 = g.a(binder);
                if (a10.isEmpty()) {
                    return h2.m0.f14113b;
                }
                byte[] byteArray = ((Bundle) h9.o.n(a10)).getByteArray("bytes");
                if (byteArray != null) {
                    int size = a10.size() - 1;
                    int i7 = f10286b;
                    int i10 = size * i7;
                    byte[] bArr = new byte[byteArray.length + i10];
                    System.arraycopy(byteArray, 0, bArr, i10, byteArray.length);
                    for (int i11 = 0; i11 < size; i11++) {
                        byte[] byteArray2 = ((Bundle) a10.get(i11)).getByteArray("bytes");
                        if (byteArray2 != null && byteArray2.length == i7) {
                            System.arraycopy(byteArray2, 0, bArr, i11 * i7, i7);
                        }
                    }
                    return bArr;
                }
            } catch (RuntimeException e10) {
                h2.a.m("BundleableByteArray", "Failed to read byte array from bundle list retriever", e10);
                return null;
            }
        }
        return null;
    }
}
