package la;

import j$.util.DesugarTimeZone;
import ja.g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public final class c implements ja.f {
    public static final SimpleDateFormat f15983a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f15983a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ((g) obj2).b(f15983a.format((Date) obj));
    }
}
