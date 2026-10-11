package n2;

import android.os.Build;
import java.util.UUID;
public final class r implements h2.b {
    public static final boolean f16610c;
    public final UUID f16611a;
    public final byte[] f16612b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f16610c = z10;
            }
        }
        z10 = false;
        f16610c = z10;
    }

    public r(UUID uuid, byte[] bArr) {
        this.f16611a = uuid;
        this.f16612b = bArr;
    }
}
