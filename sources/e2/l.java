package e2;

import android.os.Build;
import android.os.IBinder;
import java.util.UUID;
public abstract class l {
    public static final int f10482a;
    public static final UUID f10483b;
    public static final UUID f10484c;
    public static final UUID d;
    public static final UUID f10485e;
    public static final UUID f10486f;

    static {
        int i7;
        if (Build.VERSION.SDK_INT >= 30) {
            i7 = IBinder.getSuggestedMaxIpcSizeBytes();
        } else {
            i7 = 65536;
        }
        f10482a = i7;
        f10483b = new UUID(0L, 0L);
        f10484c = new UUID(1186680826959645954L, -5988876978535335093L);
        d = new UUID(-2129748144642739255L, 8654423357094679310L);
        f10485e = new UUID(-1301668207276963122L, -6645017420763422227L);
        f10486f = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
