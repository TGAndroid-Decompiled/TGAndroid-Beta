package jc;

import java.util.regex.Pattern;
import le.p;
import oc.h;
public final class c extends h {
    public static final Pattern f11441e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override
    public final p b() {
        String a2 = a(f11441e);
        if (a2 == null) {
            return null;
        }
        ?? pVar = new p();
        pVar.f11442g = com.google.android.recaptcha.internal.a.m(a2, 2, 2);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
