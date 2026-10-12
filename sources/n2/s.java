package n2;

import android.os.Build;
import java.util.UUID;
public final class s implements h2.b {
    public static final boolean f15973c;
    public final UUID f15974a;
    public final byte[] f15975b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f15973c = z10;
            }
        }
        z10 = false;
        f15973c = z10;
    }

    public s(UUID uuid, byte[] bArr) {
        this.f15974a = uuid;
        this.f15975b = bArr;
    }
}
