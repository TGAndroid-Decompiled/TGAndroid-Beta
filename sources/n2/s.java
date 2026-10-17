package n2;

import android.os.Build;
import java.util.UUID;
public final class s implements h2.b {
    public static final boolean f17063c;
    public final UUID f17064a;
    public final byte[] f17065b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f17063c = z10;
            }
        }
        z10 = false;
        f17063c = z10;
    }

    public s(UUID uuid, byte[] bArr) {
        this.f17064a = uuid;
        this.f17065b = bArr;
    }
}
