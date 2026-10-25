package ma;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import ka.g;
public final class c implements ka.f {
    public static final SimpleDateFormat f18397a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f18397a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ((g) obj2).b(f18397a.format((Date) obj));
    }
}
