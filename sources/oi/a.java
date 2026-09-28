package oi;

import android.text.TextUtils;
import java.net.IDN;
import java.util.Locale;
public final class a {
    public int f15741a;
    public String f15742b;
    public int f15743c;
    public String d;
    public String e;
    public String f15744f;

    public final b a() {
        String str;
        String str2;
        if (this.f15741a == 3) {
            String str3 = this.f15742b;
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
                if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && b.f15745g.matcher(str2).matches()))) {
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
            this.f15742b = str3;
            if (str3 != null && str3.indexOf(47) >= 0) {
                String b10 = b.b(this.f15744f);
                if (b10 == null) {
                    b10 = this.f15744f.toLowerCase(Locale.US);
                }
                this.f15744f = b10;
            } else {
                this.f15744f = this.f15744f.toLowerCase(Locale.US);
            }
        }
        return new b(this);
    }
}
