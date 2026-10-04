package n2;

import android.os.Build;
import java.util.UUID;
public final class s implements h2.b {
    public static final boolean f16553c;
    public final UUID f16554a;
    public final byte[] f16555b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f16553c = z10;
            }
        }
        z10 = false;
        f16553c = z10;
    }

    public s(UUID uuid, byte[] bArr) {
        this.f16554a = uuid;
        this.f16555b = bArr;
    }
}
