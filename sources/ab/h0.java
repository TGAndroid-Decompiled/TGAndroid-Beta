package ab;

import a8.r7;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;
public final class h0 {
    public static WeakReference d;
    public final SharedPreferences f937a;
    public r7 f938b;
    public final ScheduledThreadPoolExecutor f939c;

    public h0(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f939c = scheduledThreadPoolExecutor;
        this.f937a = sharedPreferences;
    }

    public final synchronized g0 a() {
        g0 g0Var;
        String B = this.f938b.B();
        Pattern pattern = g0.d;
        g0Var = null;
        if (!TextUtils.isEmpty(B)) {
            String[] split = B.split("!", -1);
            if (split.length == 2) {
                g0Var = new g0(split[0], split[1]);
            }
        }
        return g0Var;
    }

    public final synchronized void b() {
        this.f938b = r7.m(this.f937a, this.f939c);
    }

    public final synchronized void c(g0 g0Var) {
        this.f938b.G(g0Var.f932c);
    }
}
