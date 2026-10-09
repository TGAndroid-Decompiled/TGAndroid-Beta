package oi;

import android.text.TextUtils;
import java.net.IDN;
import java.util.Locale;
public final class a {
    public int f17154a;
    public String f17155b;
    public int f17156c;
    public String d;
    public String f17157e;
    public String f17158f;

    public final b a() {
        String str;
        String str2;
        if (this.f17154a == 3) {
            String str3 = this.f17155b;
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
                if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && b.f17159g.matcher(str2).matches()))) {
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
            this.f17155b = str3;
            if (str3 != null && str3.indexOf(47) >= 0) {
                String b10 = b.b(this.f17158f);
                if (b10 == null) {
                    b10 = this.f17158f.toLowerCase(Locale.US);
                }
                this.f17158f = b10;
            } else {
                this.f17158f = this.f17158f.toLowerCase(Locale.US);
            }
        }
        return new b(this);
    }
}
