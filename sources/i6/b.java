package i6;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
public final class b {
    public final String f14620a;
    public final boolean f14621b;
    public final String f14622c;

    public b(String str, String str2) {
        boolean z10;
        String q10;
        p6.m.f(str, "The log tag cannot be null or empty.");
        this.f14620a = str;
        if (str.length() <= 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14621b = z10;
        if (TextUtils.isEmpty(str2)) {
            q10 = null;
        } else {
            q10 = a1.g.q("[", str2, "] ");
        }
        this.f14622c = q10;
    }

    public final void a(Exception exc, String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f14621b) {
            String str2 = this.f14620a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr), exc);
            }
        }
    }

    public final void b(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f14621b) {
            String str2 = this.f14620a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr));
            }
        }
    }

    public final void c(Object... objArr) {
        Log.e(this.f14620a, d("Bundle is null", objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.f14622c;
        if (!TextUtils.isEmpty(str2)) {
            return String.valueOf(str2).concat(String.valueOf(str));
        }
        return str;
    }
}
