package n2;

import android.os.Build;
import java.util.UUID;
public final class s implements h2.b {
    public static final boolean f17069c;
    public final UUID f17070a;
    public final byte[] f17071b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f17069c = z10;
            }
        }
        z10 = false;
        f17069c = z10;
    }

    public s(UUID uuid, byte[] bArr) {
        this.f17070a = uuid;
        this.f17071b = bArr;
    }
}
