package ad;

import cf.p;
import com.google.android.gms.internal.vision.e2;
import fd.h;
import java.util.regex.Pattern;
public final class d extends h {
    public static final Pattern f420e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override
    public final p b() {
        String a2 = a(f420e);
        if (a2 == null) {
            return null;
        }
        ?? pVar = new p();
        pVar.f421g = e2.i(2, 2, a2);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
