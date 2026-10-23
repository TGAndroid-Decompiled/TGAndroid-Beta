package k2;

import android.text.TextUtils;
import j$.util.Objects;
import java.net.IDN;
import java.util.Locale;
public final class q0 {
    public int f14823a;
    public int f14824b;
    public Object f14825c;
    public Object d;
    public Object e;
    public Object f14826f;

    public q0(b2.w wVar, b2.w wVar2, int i10, int i11, p pVar, c2.j jVar) {
        this.f14825c = wVar;
        this.d = wVar2;
        this.f14823a = i10;
        this.f14824b = i11;
        this.e = pVar;
        this.f14826f = jVar;
    }

    public static boolean a(q0 q0Var) {
        return Objects.equals(((b2.w) q0Var.f14825c).f4135s, "audio/raw");
    }

    public qi.a b() {
        String str;
        String str2;
        if (this.f14823a == 3) {
            String str3 = (String) this.f14825c;
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
                if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && qi.a.f45162g.matcher(str2).matches()))) {
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
            this.f14825c = str3;
            if (str3 != null && str3.indexOf(47) >= 0) {
                String b10 = qi.a.b((String) this.f14826f);
                if (b10 == null) {
                    b10 = ((String) this.f14826f).toLowerCase(Locale.US);
                }
                this.f14826f = b10;
            } else {
                this.f14826f = ((String) this.f14826f).toLowerCase(Locale.US);
            }
        }
        return new qi.a(this);
    }
}
