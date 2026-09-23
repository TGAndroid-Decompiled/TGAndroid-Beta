package ni;

import android.text.TextUtils;
import java.net.IDN;
import java.util.Locale;
public final class a {
    public int f15214a;
    public String f15215b;
    public int f15216c;
    public String d;
    public String e;
    public String f15217f;

    public final b a() {
        String str;
        String str2;
        if (this.f15214a == 3) {
            String str3 = this.f15215b;
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
                if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && b.f15218g.matcher(str2).matches()))) {
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
            this.f15215b = str3;
            if (str3 != null && str3.indexOf(47) >= 0) {
                String b10 = b.b(this.f15217f);
                if (b10 == null) {
                    b10 = this.f15217f.toLowerCase(Locale.US);
                }
                this.f15217f = b10;
            } else {
                this.f15217f = this.f15217f.toLowerCase(Locale.US);
            }
        }
        return new b(this);
    }
}
