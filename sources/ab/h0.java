package ab;

import a8.r7;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;
public final class h0 {
    public static WeakReference d;
    public final SharedPreferences f935a;
    public r7 f936b;
    public final ScheduledThreadPoolExecutor f937c;

    public h0(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f937c = scheduledThreadPoolExecutor;
        this.f935a = sharedPreferences;
    }

    public final synchronized g0 a() {
        g0 g0Var;
        String H = this.f936b.H();
        Pattern pattern = g0.d;
        g0Var = null;
        if (!TextUtils.isEmpty(H)) {
            String[] split = H.split("!", -1);
            if (split.length == 2) {
                g0Var = new g0(split[0], split[1]);
            }
        }
        return g0Var;
    }

    public final synchronized void b() {
        this.f936b = r7.s(this.f935a, this.f937c);
    }

    public final synchronized void c(g0 g0Var) {
        this.f936b.J(g0Var.f930c);
    }
}
