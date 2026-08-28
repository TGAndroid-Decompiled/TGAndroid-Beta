package oa;

import java.util.Locale;
import java.util.StringTokenizer;
public class t0 extends la.u {
    @Override
    public final Object read(ta.a aVar) {
        String str;
        String str2;
        String str3 = null;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(aVar.v(), "_");
        if (stringTokenizer.hasMoreElements()) {
            str = stringTokenizer.nextToken();
        } else {
            str = null;
        }
        if (stringTokenizer.hasMoreElements()) {
            str2 = stringTokenizer.nextToken();
        } else {
            str2 = null;
        }
        if (stringTokenizer.hasMoreElements()) {
            str3 = stringTokenizer.nextToken();
        }
        if (str2 == null && str3 == null) {
            return new Locale(str);
        }
        if (str3 == null) {
            return new Locale(str, str2);
        }
        return new Locale(str, str2, str3);
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        String locale;
        Locale locale2 = (Locale) obj;
        if (locale2 == null) {
            locale = null;
        } else {
            locale = locale2.toString();
        }
        cVar.r(locale);
    }
}
