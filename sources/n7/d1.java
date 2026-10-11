package n7;

import com.google.android.gms.internal.vision.e2;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
public abstract class d1 implements Comparable {
    public static int c(byte b10) {
        return (b10 >> 5) & 7;
    }

    public static d1 d(byte... bArr) {
        bArr.getClass();
        f1 f1Var = new f1(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return a.k(f1Var);
        } finally {
            try {
                f1Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public int a() {
        return 0;
    }

    public final d1 b(Class cls) {
        if (cls.isInstance(this)) {
            return (d1) cls.cast(this);
        }
        throw new Exception(e2.j("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }

    public abstract int zza();
}
