package b2;

import android.os.Build;
import android.os.IBinder;
import java.util.UUID;
public abstract class m {
    public static final int f3827a;
    public static final UUID f3828b;
    public static final UUID f3829c;
    public static final UUID d;
    public static final UUID e;
    public static final UUID f3830f;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 30) {
            i10 = IBinder.getSuggestedMaxIpcSizeBytes();
        } else {
            i10 = 65536;
        }
        f3827a = i10;
        f3828b = new UUID(0L, 0L);
        f3829c = new UUID(1186680826959645954L, -5988876978535335093L);
        d = new UUID(-2129748144642739255L, 8654423357094679310L);
        e = new UUID(-1301668207276963122L, -6645017420763422227L);
        f3830f = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
