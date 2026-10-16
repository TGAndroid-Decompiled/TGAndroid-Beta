package k2;

import android.text.TextUtils;
import j$.util.Objects;
import java.net.IDN;
import java.util.Locale;
public final class p0 {
    public int f13976a;
    public int f13977b;
    public Object f13978c;
    public Object d;
    public Object e;
    public Object f13979f;

    public p0(b2.x xVar, b2.x xVar2, int i10, int i11, o oVar, c2.j jVar) {
        this.f13978c = xVar;
        this.d = xVar2;
        this.f13976a = i10;
        this.f13977b = i11;
        this.e = oVar;
        this.f13979f = jVar;
    }

    public static boolean a(p0 p0Var) {
        return Objects.equals(((b2.x) p0Var.f13978c).f2523s, "audio/raw");
    }

    public pi.a b() {
        String str;
        String str2;
        if (this.f13976a == 3) {
            String str3 = (String) this.f13978c;
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
                if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && pi.a.f42930g.matcher(str2).matches()))) {
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
            this.f13978c = str3;
            if (str3 != null && str3.indexOf(47) >= 0) {
                String b10 = pi.a.b((String) this.f13979f);
                if (b10 == null) {
                    b10 = ((String) this.f13979f).toLowerCase(Locale.US);
                }
                this.f13979f = b10;
            } else {
                this.f13979f = ((String) this.f13979f).toLowerCase(Locale.US);
            }
        }
        return new pi.a(this);
    }
}
