package defpackage;

import android.os.Build;
import android.os.IBinder;
import java.util.UUID;
public abstract class g51 {
    public static final int a;
    public static final UUID b;
    public static final UUID c;
    public static final UUID d;
    public static final UUID e;
    public static final UUID f;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 30) {
            i = IBinder.getSuggestedMaxIpcSizeBytes();
        } else {
            i = 65536;
        }
        a = i;
        b = new UUID(0L, 0L);
        c = new UUID(1186680826959645954L, -5988876978535335093L);
        d = new UUID(-2129748144642739255L, 8654423357094679310L);
        e = new UUID(-1301668207276963122L, -6645017420763422227L);
        f = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
