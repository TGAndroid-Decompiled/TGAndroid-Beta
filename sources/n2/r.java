package n2;

import android.os.Build;
import java.util.UUID;
public final class r implements h2.b {
    public static final boolean f16437c;
    public final UUID f16438a;
    public final byte[] f16439b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f16437c = z10;
            }
        }
        z10 = false;
        f16437c = z10;
    }

    public r(UUID uuid, byte[] bArr) {
        this.f16438a = uuid;
        this.f16439b = bArr;
    }
}
