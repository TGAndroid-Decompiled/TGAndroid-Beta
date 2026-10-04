package n2;

import android.os.Build;
import java.util.UUID;
public final class s implements h2.b {
    public static final boolean f16558c;
    public final UUID f16559a;
    public final byte[] f16560b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f16558c = z10;
            }
        }
        z10 = false;
        f16558c = z10;
    }

    public s(UUID uuid, byte[] bArr) {
        this.f16559a = uuid;
        this.f16560b = bArr;
    }
}
