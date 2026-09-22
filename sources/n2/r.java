package n2;

import android.os.Build;
import java.util.UUID;
public final class r implements h2.b {
    public static final boolean f15152c;
    public final UUID f15153a;
    public final byte[] f15154b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f15152c = z10;
            }
        }
        z10 = false;
        f15152c = z10;
    }

    public r(UUID uuid, byte[] bArr) {
        this.f15153a = uuid;
        this.f15154b = bArr;
    }
}
