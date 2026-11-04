package oa;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import ma.g;
public final class c implements ma.f {
    public static final SimpleDateFormat f20943a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f20943a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ((g) obj2).d(f20943a.format((Date) obj));
    }
}
