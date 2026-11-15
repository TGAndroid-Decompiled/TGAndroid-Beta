package org.telegram.messenger;

import android.util.Log;
import java.util.Locale;
public final class d1 {
    public int f23017a;
    public String f23018b;
    public String f23019c;

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
        this.f23019c = sb2;
        this.f23018b = str;
        int i7 = 2;
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            while (i7 <= 7 && !Log.isLoggable(this.f23018b, i7)) {
                i7++;
            }
            this.f23017a = i7;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public void a(String str, Object... objArr) {
        if (this.f23017a <= 3) {
            Log.d(this.f23018b, b(str, objArr));
        }
    }

    public String b(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f23019c.concat(str);
    }

    public d1(String str, int i7, String str2) {
        this.f23018b = str;
        this.f23017a = i7;
        this.f23019c = str2;
    }
}
