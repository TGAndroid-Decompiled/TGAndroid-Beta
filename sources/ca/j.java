package ca;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f2230b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f2231c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final db.a f2232a;

    public j(db.a aVar) {
        this.f2232a = aVar;
    }

    public final boolean a(da.b bVar) {
        if (!TextUtils.isEmpty(bVar.f4289c)) {
            long j10 = bVar.f4290f + bVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f2232a.getClass();
            if (j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f2230b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
