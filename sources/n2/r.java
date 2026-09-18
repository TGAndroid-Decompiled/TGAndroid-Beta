package n2;

import android.os.Build;
import java.util.UUID;
public final class r implements h2.b {
    public static final boolean f14925c;
    public final UUID f14926a;
    public final byte[] f14927b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f14925c = z10;
            }
        }
        z10 = false;
        f14925c = z10;
    }

    public r(UUID uuid, byte[] bArr) {
        this.f14926a = uuid;
        this.f14927b = bArr;
    }
}
