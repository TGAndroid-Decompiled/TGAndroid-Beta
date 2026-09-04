package n2;

import android.os.Build;
import java.util.UUID;
public final class r implements h2.a {
    public static final boolean f16410c;
    public final UUID f16411a;
    public final byte[] f16412b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f16410c = z10;
            }
        }
        z10 = false;
        f16410c = z10;
    }

    public r(UUID uuid, byte[] bArr) {
        this.f16411a = uuid;
        this.f16412b = bArr;
    }
}
