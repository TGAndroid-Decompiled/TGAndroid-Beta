package org.telegram.messenger;

import android.util.Log;
import java.util.Locale;
public final class g1 {
    public final String f15653a;
    public final String f15654b;
    public final int f15655c;

    public g1(String str, String... strArr) {
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
        this.f15654b = sb2;
        this.f15653a = str;
        int i10 = 2;
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            while (i10 <= 7 && !Log.isLoggable(this.f15653a, i10)) {
                i10++;
            }
            this.f15655c = i10;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public void a(String str, Object... objArr) {
        if (this.f15655c <= 3) {
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(this.f15653a, this.f15654b.concat(str));
        }
    }

    public g1(String str, int i10, String str2) {
        this.f15653a = str;
        this.f15655c = i10;
        this.f15654b = str2;
    }
}
