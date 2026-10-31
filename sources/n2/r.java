package n2;

import android.os.Build;
import java.util.UUID;
public final class r implements h2.b {
    public static final boolean f13471c;
    public final UUID f13472a;
    public final byte[] f13473b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f13471c = z10;
            }
        }
        z10 = false;
        f13471c = z10;
    }

    public r(UUID uuid, byte[] bArr) {
        this.f13472a = uuid;
        this.f13473b = bArr;
    }
}
