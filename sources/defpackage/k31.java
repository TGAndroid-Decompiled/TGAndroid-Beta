package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import java.util.Arrays;
public final class k31 {
    public static final int b = o51.a;
    public final f31 a;

    public k31(byte[] bArr) {
        mo5 p = po5.p();
        int length = bArr.length;
        int i = b;
        int g = gcc.g(length, i);
        for (int i2 = 0; i2 < g; i2++) {
            Bundle bundle = new Bundle();
            int i3 = i2 * i;
            bundle.putByteArray("bytes", Arrays.copyOfRange(bArr, i3, Math.min(i3 + i, bArr.length)));
            p.c(bundle);
        }
        this.a = new f31(p.f());
    }

    public static byte[] a(Bundle bundle) {
        IBinder binder = bundle.getBinder(l31.g);
        if (binder != null) {
            try {
                po5 a = f31.a(binder);
                if (a.isEmpty()) {
                    return gcc.b;
                }
                byte[] byteArray = ((Bundle) dqe.b(a)).getByteArray("bytes");
                if (byteArray != null) {
                    int size = a.size() - 1;
                    int i = b;
                    int i2 = size * i;
                    byte[] bArr = new byte[byteArray.length + i2];
                    System.arraycopy(byteArray, 0, bArr, i2, byteArray.length);
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] byteArray2 = ((Bundle) a.get(i3)).getByteArray("bytes");
                        if (byteArray2 != null && byteArray2.length == i) {
                            System.arraycopy(byteArray2, 0, bArr, i3 * i, i);
                        }
                    }
                    return bArr;
                }
            } catch (RuntimeException e) {
                efd.g("BundleableByteArray", "Failed to read byte array from bundle list retriever", e);
                return null;
            }
        }
        return null;
    }
}
