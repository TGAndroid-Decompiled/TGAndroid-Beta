package org.telegram.messenger;

import android.util.Log;
import java.util.Locale;
public final class d1 {
    public final String f22118a;
    public final String f22119b;
    public final int f22120c;

    public d1(String str, String... strArr) {
        String sb2;
        if (strArr.length == 0) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.f22119b = sb2;
        this.f22118a = str;
        int i3 = 2;
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            while (i3 <= 7 && !Log.isLoggable(this.f22118a, i3)) {
                i3++;
            }
            this.f22120c = i3;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public void a(String str, Object... objArr) {
        if (this.f22120c <= 3) {
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(this.f22118a, this.f22119b.concat(str));
        }
    }

    public d1(String str, int i3, String str2) {
        this.f22118a = str;
        this.f22120c = i3;
        this.f22119b = str2;
    }
}
