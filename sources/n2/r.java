package n2;

import android.os.Build;
import java.util.UUID;
public final class r implements h2.b {
    public static final boolean f18634c;
    public final UUID f18635a;
    public final byte[] f18636b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f18634c = z10;
            }
        }
        z10 = false;
        f18634c = z10;
    }

    public r(UUID uuid, byte[] bArr) {
        this.f18635a = uuid;
        this.f18636b = bArr;
    }
}
