package b2;

import android.os.Bundle;
import android.os.IBinder;
import java.util.Arrays;
public final class l {
    public static final int f3262b = n.f3283a;
    public final i f3263a;

    public l(byte[] bArr) {
        f9.f0 t10 = f9.i0.t();
        int length = bArr.length;
        int i10 = f3262b;
        int g7 = e2.n0.g(length, i10);
        for (int i11 = 0; i11 < g7; i11++) {
            Bundle bundle = new Bundle();
            int i12 = i11 * i10;
            bundle.putByteArray("bytes", Arrays.copyOfRange(bArr, i12, Math.min(i12 + i10, bArr.length)));
            t10.c(bundle);
        }
        this.f3263a = new i(t10.f());
    }

    public static byte[] a(Bundle bundle) {
        IBinder binder = bundle.getBinder(m.f3270g);
        if (binder != null) {
            try {
                f9.i0 a2 = i.a(binder);
                if (a2.isEmpty()) {
                    return e2.n0.f9692b;
                }
                byte[] byteArray = ((Bundle) f9.o.m(a2)).getByteArray("bytes");
                if (byteArray != null) {
                    int size = a2.size() - 1;
                    int i10 = f3262b;
                    int i11 = size * i10;
                    byte[] bArr = new byte[byteArray.length + i11];
                    System.arraycopy(byteArray, 0, bArr, i11, byteArray.length);
                    for (int i12 = 0; i12 < size; i12++) {
                        byte[] byteArray2 = ((Bundle) a2.get(i12)).getByteArray("bytes");
                        if (byteArray2 != null && byteArray2.length == i10) {
                            System.arraycopy(byteArray2, 0, bArr, i12 * i10, i10);
                        }
                    }
                    return bArr;
                }
            } catch (RuntimeException e) {
                e2.a.m("BundleableByteArray", "Failed to read byte array from bundle list retriever", e);
                return null;
            }
        }
        return null;
    }
}
