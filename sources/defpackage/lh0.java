package defpackage;

import android.util.Log;
import java.util.Locale;
public final class lh0 {
    public int a;
    public String b;
    public String c;

    public lh0(String str, String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.c = sb;
        this.b = str;
        int i = 2;
        fre.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i <= 7 && !Log.isLoggable(this.b, i)) {
            i++;
        }
        this.a = i;
    }

    public final void a(String str, Object... objArr) {
        if (this.a <= 3) {
            Log.d(this.b, b(str, objArr));
        }
    }

    public final String b(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.c.concat(str);
    }

    public lh0(String str, int i, String str2) {
        this.b = str;
        this.a = i;
        this.c = str2;
    }
}
