package hc;

import ie.p;
import java.util.regex.Pattern;
import mc.h;
public final class c extends h {
    public static final Pattern f10406e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override
    public final p b() {
        String a2 = a(f10406e);
        if (a2 == null) {
            return null;
        }
        ?? pVar = new p();
        pVar.f10407g = e2.c.m(a2, 2, 2);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
