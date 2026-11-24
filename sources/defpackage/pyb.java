package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;
public final class pyb {
    public static WeakReference d;
    public final SharedPreferences a;
    public wm9 b;
    public final ScheduledThreadPoolExecutor c;

    public pyb(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.c = scheduledThreadPoolExecutor;
        this.a = sharedPreferences;
    }

    public final synchronized yvb a() {
        yvb yvbVar;
        String w = this.b.w();
        Pattern pattern = yvb.d;
        yvbVar = null;
        if (!TextUtils.isEmpty(w)) {
            String[] split = w.split("!", -1);
            if (split.length == 2) {
                yvbVar = new yvb(split[0], split[1]);
            }
        }
        return yvbVar;
    }

    public final synchronized void b() {
        this.b = wm9.h(this.a, this.c);
    }

    public final synchronized void c(yvb yvbVar) {
        this.b.z(yvbVar.c);
    }
}
