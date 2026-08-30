package ca;

import android.text.TextUtils;
import h7.u;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f2206b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f2207c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final u f2208a;

    public j(u uVar) {
        this.f2208a = uVar;
    }

    public final boolean a(da.b bVar) {
        if (!TextUtils.isEmpty(bVar.f4308c)) {
            long j10 = bVar.f4309f + bVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f2208a.getClass();
            if (j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f2206b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
