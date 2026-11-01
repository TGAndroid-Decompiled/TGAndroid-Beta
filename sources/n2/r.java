package n2;

import android.os.Build;
import java.util.UUID;
public final class r implements h2.b {
    public static final boolean f13472c;
    public final UUID f13473a;
    public final byte[] f13474b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f13472c = z10;
            }
        }
        z10 = false;
        f13472c = z10;
    }

    public r(UUID uuid, byte[] bArr) {
        this.f13473a = uuid;
        this.f13474b = bArr;
    }
}
