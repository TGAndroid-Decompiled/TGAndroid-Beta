package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;
public final class mwb {
    public static WeakReference d;
    public final SharedPreferences a;
    public vk9 b;
    public final ScheduledThreadPoolExecutor c;

    public mwb(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.c = scheduledThreadPoolExecutor;
        this.a = sharedPreferences;
    }

    public final synchronized xtb a() {
        xtb xtbVar;
        String w = this.b.w();
        Pattern pattern = xtb.d;
        xtbVar = null;
        if (!TextUtils.isEmpty(w)) {
            String[] split = w.split("!", -1);
            if (split.length == 2) {
                xtbVar = new xtb(split[0], split[1]);
            }
        }
        return xtbVar;
    }

    public final synchronized void b() {
        this.b = vk9.k(this.a, this.c);
    }

    public final synchronized void c(xtb xtbVar) {
        this.b.z(xtbVar.c);
    }
}
