package g6;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
public final class b {
    public final String f9417a;
    public final boolean f9418b;
    public final String f9419c;

    public b(String str, String str2) {
        boolean z10;
        String p5;
        n6.l.g(str, "The log tag cannot be null or empty.");
        this.f9417a = str;
        if (str.length() <= 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9418b = z10;
        if (TextUtils.isEmpty(str2)) {
            p5 = null;
        } else {
            p5 = a4.a.p("[", str2, "] ");
        }
        this.f9419c = p5;
    }

    public final void a(Exception exc, String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f9418b) {
            String str2 = this.f9417a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr), exc);
            }
        }
    }

    public final void b(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f9418b) {
            String str2 = this.f9417a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr));
            }
        }
    }

    public final void c(Object... objArr) {
        Log.e(this.f9417a, d("Bundle is null", objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.f9419c;
        if (!TextUtils.isEmpty(str2)) {
            return String.valueOf(str2).concat(String.valueOf(str));
        }
        return str;
    }
}
