package org.telegram.messenger;

import android.util.Log;
import java.util.Locale;
public final class d1 {
    public final String f21939a;
    public final String f21940b;
    public final int f21941c;

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
        this.f21940b = sb2;
        this.f21939a = str;
        int i7 = 2;
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            while (i7 <= 7 && !Log.isLoggable(this.f21939a, i7)) {
                i7++;
            }
            this.f21941c = i7;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public void a(String str, Object... objArr) {
        if (this.f21941c <= 3) {
            Log.d(this.f21939a, b(str, objArr));
        }
    }

    public String b(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f21940b.concat(str);
    }

    public d1(String str, int i7, String str2) {
        this.f21939a = str;
        this.f21941c = i7;
        this.f21940b = str2;
    }
}
