package g6;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
public final class b {
    public final String f10386a;
    public final boolean f10387b;
    public final String f10388c;

    public b(String str, String str2) {
        boolean z10;
        String p5;
        n6.l.g(str, "The log tag cannot be null or empty.");
        this.f10386a = str;
        if (str.length() <= 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10387b = z10;
        if (TextUtils.isEmpty(str2)) {
            p5 = null;
        } else {
            p5 = a4.a.p("[", str2, "] ");
        }
        this.f10388c = p5;
    }

    public final void a(Exception exc, String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f10387b) {
            String str2 = this.f10386a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr), exc);
            }
        }
    }

    public final void b(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f10387b) {
            String str2 = this.f10386a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr));
            }
        }
    }

    public final void c(Object... objArr) {
        Log.e(this.f10386a, d("Bundle is null", objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.f10388c;
        if (!TextUtils.isEmpty(str2)) {
            return String.valueOf(str2).concat(String.valueOf(str));
        }
        return str;
    }
}
