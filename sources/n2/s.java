package n2;

import android.os.Build;
import java.util.UUID;
public final class s implements h2.b {
    public static final boolean f15143c;
    public final UUID f15144a;
    public final byte[] f15145b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f15143c = z10;
            }
        }
        z10 = false;
        f15143c = z10;
    }

    public s(UUID uuid, byte[] bArr) {
        this.f15144a = uuid;
        this.f15145b = bArr;
    }
}
