package n2;

import android.os.Build;
import java.util.UUID;
public final class s implements h2.b {
    public static final boolean f13745c;
    public final UUID f13746a;
    public final byte[] f13747b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f13745c = z10;
            }
        }
        z10 = false;
        f13745c = z10;
    }

    public s(UUID uuid, byte[] bArr) {
        this.f13746a = uuid;
        this.f13747b = bArr;
    }
}
