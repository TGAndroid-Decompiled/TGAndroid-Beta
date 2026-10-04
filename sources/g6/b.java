package g6;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
public final class b {
    public final String f10250a;
    public final boolean f10251b;
    public final String f10252c;

    public b(String str, String str2) {
        boolean z10;
        String q6;
        n6.l.g(str, "The log tag cannot be null or empty.");
        this.f10250a = str;
        if (str.length() <= 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10251b = z10;
        if (TextUtils.isEmpty(str2)) {
            q6 = null;
        } else {
            q6 = a4.a.q("[", str2, "] ");
        }
        this.f10252c = q6;
    }

    public final void a(Exception exc, String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f10251b) {
            String str2 = this.f10250a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr), exc);
            }
        }
    }

    public final void b(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f10251b) {
            String str2 = this.f10250a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr));
            }
        }
    }

    public final void c(Object... objArr) {
        Log.e(this.f10250a, d("Bundle is null", objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.f10252c;
        if (!TextUtils.isEmpty(str2)) {
            return String.valueOf(str2).concat(String.valueOf(str));
        }
        return str;
    }
}
