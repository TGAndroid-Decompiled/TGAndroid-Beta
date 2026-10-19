package la;

import j$.util.DesugarTimeZone;
import ja.g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public final class c implements ja.f {
    public static final SimpleDateFormat f15984a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f15984a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ((g) obj2).b(f15984a.format((Date) obj));
    }
}
