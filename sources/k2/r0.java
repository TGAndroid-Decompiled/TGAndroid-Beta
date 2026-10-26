package k2;

import android.text.TextUtils;
import j$.util.Objects;
import java.net.IDN;
import java.util.Locale;
public final class r0 {
    public int f16263a;
    public int f16264b;
    public Object f16265c;
    public Object d;
    public Object e;
    public Object f16266f;

    public r0(b2.x xVar, b2.x xVar2, int i10, int i11, p pVar, c2.k kVar) {
        this.f16265c = xVar;
        this.d = xVar2;
        this.f16263a = i10;
        this.f16264b = i11;
        this.e = pVar;
        this.f16266f = kVar;
    }

    public static boolean a(r0 r0Var) {
        return Objects.equals(((b2.x) r0Var.f16265c).f3586s, "audio/raw");
    }

    public ti.a b() {
        String str;
        String str2;
        if (this.f16263a == 3) {
            String str3 = (String) this.f16265c;
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
                if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && ti.a.f49168g.matcher(str2).matches()))) {
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
            this.f16265c = str3;
            if (str3 != null && str3.indexOf(47) >= 0) {
                String b10 = ti.a.b((String) this.f16266f);
                if (b10 == null) {
                    b10 = ((String) this.f16266f).toLowerCase(Locale.US);
                }
                this.f16266f = b10;
            } else {
                this.f16266f = ((String) this.f16266f).toLowerCase(Locale.US);
            }
        }
        return new ti.a(this);
    }
}
