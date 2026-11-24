package defpackage;

import android.os.Build;
import java.util.UUID;
public final class lr4 {
    public static final boolean c;
    public final UUID a;
    public final byte[] b;

    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                c = z;
            }
        }
        z = false;
        c = z;
    }

    public lr4(UUID uuid, byte[] bArr) {
        this.a = uuid;
        this.b = bArr;
    }
}
