package k2;

import android.text.TextUtils;
import j$.util.Objects;
import java.net.IDN;
import java.util.Locale;
public final class q0 {
    public int f14780a;
    public int f14781b;
    public Object f14782c;
    public Object d;
    public Object e;
    public Object f14783f;

    public q0(b2.w wVar, b2.w wVar2, int i10, int i11, o oVar, c2.j jVar) {
        this.f14782c = wVar;
        this.d = wVar2;
        this.f14780a = i10;
        this.f14781b = i11;
        this.e = oVar;
        this.f14783f = jVar;
    }

    public static boolean a(q0 q0Var) {
        return Objects.equals(((b2.w) q0Var.f14782c).f4128s, "audio/raw");
    }

    public qi.a b() {
        String str;
        String str2;
        if (this.f14780a == 3) {
            String str3 = (String) this.f14782c;
            if (TextUtils.isEmpty(str3)) {
                str3 = "";
            } else {
                int indexOf = str3.indexOf(47);
                if (indexOf >= 0) {
                    str = str3.substring(0, indexOf);
                } else {
                    str = str3;
                }
                if (indexOf >= 0) {
                    str2 = str3.substring(indexOf + 1);
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && qi.a.f44738g.matcher(str2).matches()))) {
                    try {
                        String lowerCase = IDN.toASCII(str, 3).toLowerCase(Locale.US);
                        if (str2 == null) {
                            str3 = lowerCase;
                        } else {
                            str3 = lowerCase + '/' + str2;
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
            this.f14782c = str3;
            if (str3 != null && str3.indexOf(47) >= 0) {
                String b10 = qi.a.b((String) this.f14783f);
                if (b10 == null) {
                    b10 = ((String) this.f14783f).toLowerCase(Locale.US);
                }
                this.f14783f = b10;
            } else {
                this.f14783f = ((String) this.f14783f).toLowerCase(Locale.US);
            }
        }
        return new qi.a(this);
    }
}
