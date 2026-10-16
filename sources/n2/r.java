package n2;

import android.os.Build;
import java.util.UUID;
public final class r implements h2.b {
    public static final boolean f15684c;
    public final UUID f15685a;
    public final byte[] f15686b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f15684c = z10;
            }
        }
        z10 = false;
        f15684c = z10;
    }

    public r(UUID uuid, byte[] bArr) {
        this.f15685a = uuid;
        this.f15686b = bArr;
    }
}
