package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
public final class ce6 {
    public final String a;
    public final boolean b;
    public final String c;

    public ce6(String str, String str2) {
        boolean z;
        String o;
        ite.g(str, "The log tag cannot be null or empty.");
        this.a = str;
        if (str.length() <= 23) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
        if (TextUtils.isEmpty(str2)) {
            o = null;
        } else {
            o = kt6.o("[", str2, "] ");
        }
        this.c = o;
    }

    public final void a(Exception exc, String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.b) {
            String str2 = this.a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr), exc);
            }
        }
    }

    public final void b(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.b) {
            String str2 = this.a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr));
            }
        }
    }

    public final void c(Object... objArr) {
        Log.e(this.a, d("Bundle is null", objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.c;
        if (!TextUtils.isEmpty(str2)) {
            return String.valueOf(str2).concat(str);
        }
        return str;
    }
}
