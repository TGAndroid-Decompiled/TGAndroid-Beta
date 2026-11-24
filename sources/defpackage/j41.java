package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import java.util.Arrays;
public final class j41 {
    public static final int b = n61.a;
    public final e41 a;

    public j41(byte[] bArr) {
        jo5 p = mo5.p();
        int length = bArr.length;
        int i = b;
        int g = hac.g(length, i);
        for (int i2 = 0; i2 < g; i2++) {
            Bundle bundle = new Bundle();
            int i3 = i2 * i;
            bundle.putByteArray("bytes", Arrays.copyOfRange(bArr, i3, Math.min(i3 + i, bArr.length)));
            p.c(bundle);
        }
        this.a = new e41(p.f());
    }

    public static byte[] a(Bundle bundle) {
        IBinder binder = bundle.getBinder(k41.g);
        if (binder != null) {
            try {
                mo5 a = e41.a(binder);
                if (a.isEmpty()) {
                    return hac.b;
                }
                byte[] byteArray = ((Bundle) lne.b(a)).getByteArray("bytes");
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
                ncd.g("BundleableByteArray", "Failed to read byte array from bundle list retriever", e);
                return null;
            }
        }
        return null;
    }
}
