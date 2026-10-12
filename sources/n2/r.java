package n2;

import android.os.Build;
import java.util.UUID;
public final class r implements h2.b {
    public static final boolean f16277c;
    public final UUID f16278a;
    public final byte[] f16279b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f16277c = z10;
            }
        }
        z10 = false;
        f16277c = z10;
    }

    public r(UUID uuid, byte[] bArr) {
        this.f16278a = uuid;
        this.f16279b = bArr;
    }
}
