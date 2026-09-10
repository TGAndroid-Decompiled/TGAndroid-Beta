package n7;

import com.google.android.gms.internal.vision.e2;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
public abstract class e1 implements Comparable {
    public static int c(byte b10) {
        return (b10 >> 5) & 7;
    }

    public static e1 d(byte... bArr) {
        bArr.getClass();
        g1 g1Var = new g1(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return a.k(g1Var);
        } finally {
            try {
                g1Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public int a() {
        return 0;
    }

    public final e1 b(Class cls) {
        if (cls.isInstance(this)) {
            return (e1) cls.cast(this);
        }
        throw new Exception(e2.i("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }

    public abstract int zza();
}
