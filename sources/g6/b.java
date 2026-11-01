package g6;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
public final class b {
    public final String f7368a;
    public final boolean f7369b;
    public final String f7370c;

    public b(String str, String str2) {
        boolean z10;
        String n10;
        n6.l.f(str, "The log tag cannot be null or empty.");
        this.f7368a = str;
        if (str.length() <= 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f7369b = z10;
        if (TextUtils.isEmpty(str2)) {
            n10 = null;
        } else {
            n10 = a1.g.n("[", str2, "] ");
        }
        this.f7370c = n10;
    }

    public final void a(Exception exc, String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f7369b) {
            String str2 = this.f7368a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr), exc);
            }
        }
    }

    public final void b(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f7369b) {
            String str2 = this.f7368a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr));
            }
        }
    }

    public final void c(Object... objArr) {
        Log.e(this.f7368a, d("Bundle is null", objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.f7370c;
        if (!TextUtils.isEmpty(str2)) {
            return String.valueOf(str2).concat(String.valueOf(str));
        }
        return str;
    }
}
