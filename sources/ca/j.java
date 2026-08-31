package ca;

import android.text.TextUtils;
import h7.u;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f2397b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f2398c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final u f2399a;

    public j(u uVar) {
        this.f2399a = uVar;
    }

    public final boolean a(da.b bVar) {
        if (!TextUtils.isEmpty(bVar.f4389c)) {
            long j10 = bVar.f4391f + bVar.f4390e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f2399a.getClass();
            if (j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f2397b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
