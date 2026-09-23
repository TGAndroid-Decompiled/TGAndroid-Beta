package n2;

import android.os.Build;
import java.util.UUID;
public final class r implements h2.b {
    public static final boolean f14890c;
    public final UUID f14891a;
    public final byte[] f14892b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f14890c = z10;
            }
        }
        z10 = false;
        f14890c = z10;
    }

    public r(UUID uuid, byte[] bArr) {
        this.f14891a = uuid;
        this.f14892b = bArr;
    }
}
