package n2;

import android.os.Build;
import java.util.UUID;
public final class s implements h2.b {
    public static final boolean f16563c;
    public final UUID f16564a;
    public final byte[] f16565b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f16563c = z10;
            }
        }
        z10 = false;
        f16563c = z10;
    }

    public s(UUID uuid, byte[] bArr) {
        this.f16564a = uuid;
        this.f16565b = bArr;
    }
}
