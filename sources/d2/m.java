package d2;

import android.os.Build;
import android.os.IBinder;
import java.util.UUID;
public abstract class m {
    public static final int f8182a;
    public static final UUID f8183b;
    public static final UUID f8184c;
    public static final UUID d;
    public static final UUID f8185e;
    public static final UUID f8186f;

    static {
        int i3;
        if (Build.VERSION.SDK_INT >= 30) {
            i3 = IBinder.getSuggestedMaxIpcSizeBytes();
        } else {
            i3 = 65536;
        }
        f8182a = i3;
        f8183b = new UUID(0L, 0L);
        f8184c = new UUID(1186680826959645954L, -5988876978535335093L);
        d = new UUID(-2129748144642739255L, 8654423357094679310L);
        f8185e = new UUID(-1301668207276963122L, -6645017420763422227L);
        f8186f = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
