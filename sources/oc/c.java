package oc;

import java.util.regex.Pattern;
import le.p;
public final class c extends h {
    public static final Pattern f19473e = Pattern.compile("`+");
    public static final Pattern f19474f = Pattern.compile("^`+");

    @Override
    public final p b() {
        String a2;
        String a10 = a(f19474f);
        if (a10 == null) {
            return null;
        }
        int i10 = this.d;
        do {
            a2 = a(f19473e);
            if (a2 == null) {
                this.d = i10;
                return f(a10);
            }
        } while (!a2.equals(a10));
        le.d dVar = new le.d(0);
        String replace = this.f19481c.substring(i10, this.d - a10.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
            int length = replace.length();
            if (i7.k.b(' ', replace, 0, length) != length) {
                replace = com.google.android.recaptcha.internal.a.m(replace, 1, 1);
            }
        }
        dVar.h = replace;
        return dVar;
    }

    @Override
    public final char d() {
        return '`';
    }
}
