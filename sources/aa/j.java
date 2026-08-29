package aa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f297b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f298c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final bb.a f299a;

    public j(bb.a aVar) {
        this.f299a = aVar;
    }

    public final boolean a(ba.b bVar) {
        if (!TextUtils.isEmpty(bVar.f2034c)) {
            long j10 = bVar.f2036f + bVar.f2035e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f299a.getClass();
            if (j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f297b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
