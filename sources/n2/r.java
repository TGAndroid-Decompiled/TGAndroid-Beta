package n2;

import android.os.Build;
import java.util.UUID;
public final class r implements h2.b {
    public static final boolean f16528c;
    public final UUID f16529a;
    public final byte[] f16530b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f16528c = z10;
            }
        }
        z10 = false;
        f16528c = z10;
    }

    public r(UUID uuid, byte[] bArr) {
        this.f16529a = uuid;
        this.f16530b = bArr;
    }
}
