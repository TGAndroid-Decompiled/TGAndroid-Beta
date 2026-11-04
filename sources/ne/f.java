package ne;

import b8.id;
import b8.jd;
import e0.e0;
import v7.s;
public abstract class f {
    public static final g f20350a = new Object();

    public static final je.d a(je.d dVar, s module) {
        kotlin.jvm.internal.j.e(dVar, "<this>");
        kotlin.jvm.internal.j.e(module, "module");
        if (kotlin.jvm.internal.j.a(dVar.e(), je.e.f16243b)) {
            id.a(dVar);
            return dVar;
        } else if (dVar.isInline()) {
            return a(dVar.i(0), module);
        } else {
            return dVar;
        }
    }

    public static final byte b(char c2) {
        if (c2 < '~') {
            return c.f20347b[c2];
        }
        return (byte) 0;
    }

    public static final void c(e0 e0Var, String str) {
        e0Var.m(e0Var.f9225b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence d(int i3, CharSequence charSequence) {
        String str;
        int length;
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            String str2 = ".....";
            if (i3 == -1) {
                if (charSequence.length() - 60 > 0) {
                    return "....." + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i10 = i3 - 30;
                int i11 = i3 + 30;
                if (i10 > 0) {
                    str = ".....";
                } else {
                    str = "";
                }
                if (i11 >= charSequence.length()) {
                    str2 = "";
                }
                StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str);
                if (i10 < 0) {
                    i10 = 0;
                }
                int length2 = charSequence.length();
                if (i11 > length2) {
                    i11 = length2;
                }
                l10.append(charSequence.subSequence(i10, i11).toString());
                l10.append(str2);
                return l10.toString();
            }
        }
        return charSequence;
    }

    public static final void e(je.d dVar, me.b json) {
        kotlin.jvm.internal.j.e(dVar, "<this>");
        kotlin.jvm.internal.j.e(json, "json");
        if (kotlin.jvm.internal.j.a(dVar.e(), je.f.f16245b)) {
            json.f19277a.getClass();
        }
    }

    public static final j f(je.d desc, me.b bVar) {
        kotlin.jvm.internal.j.e(desc, "desc");
        jd e10 = desc.e();
        if (e10 instanceof je.a) {
            return j.f20362f;
        }
        if (kotlin.jvm.internal.j.a(e10, je.f.f16246c)) {
            return j.d;
        }
        if (kotlin.jvm.internal.j.a(e10, je.f.d)) {
            je.d a10 = a(desc.i(0), bVar.f19278b);
            jd e11 = a10.e();
            if (!(e11 instanceof je.c) && !kotlin.jvm.internal.j.a(e11, je.e.f16244c)) {
                bVar.f19277a.getClass();
                throw new d("Value of type '" + a10.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + a10.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
            }
            return j.f20361e;
        }
        return j.f20360c;
    }
}
