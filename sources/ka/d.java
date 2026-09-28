package ka;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public final class d implements ia.f {
    public static final SimpleDateFormat f13553a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f13553a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ((ia.g) obj2).b(f13553a.format((Date) obj));
    }
}
