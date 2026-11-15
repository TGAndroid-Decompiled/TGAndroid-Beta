package ab;

import a8.r7;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;
public final class h0 {
    public static WeakReference d;
    public final SharedPreferences f936a;
    public r7 f937b;
    public final ScheduledThreadPoolExecutor f938c;

    public h0(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f938c = scheduledThreadPoolExecutor;
        this.f936a = sharedPreferences;
    }

    public final synchronized g0 a() {
        g0 g0Var;
        String D = this.f937b.D();
        Pattern pattern = g0.d;
        g0Var = null;
        if (!TextUtils.isEmpty(D)) {
            String[] split = D.split("!", -1);
            if (split.length == 2) {
                g0Var = new g0(split[0], split[1]);
            }
        }
        return g0Var;
    }

    public final synchronized void b() {
        this.f937b = r7.m(this.f936a, this.f938c);
    }

    public final synchronized void c(g0 g0Var) {
        this.f937b.H(g0Var.f931c);
    }
}
