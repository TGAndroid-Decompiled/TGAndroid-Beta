package n2;

import android.os.Build;
import java.util.UUID;
public final class s implements h2.b {
    public static final boolean f15128c;
    public final UUID f15129a;
    public final byte[] f15130b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f15128c = z10;
            }
        }
        z10 = false;
        f15128c = z10;
    }

    public s(UUID uuid, byte[] bArr) {
        this.f15129a = uuid;
        this.f15130b = bArr;
    }
}
