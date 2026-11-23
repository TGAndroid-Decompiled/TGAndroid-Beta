package j6;

import a8.p0;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
public final class b {
    public final String f17235a;
    public final boolean f17236b;
    public final String f17237c;

    public b(String str, String str2) {
        boolean z10;
        String p10;
        q6.m.g(str, "The log tag cannot be null or empty.");
        this.f17235a = str;
        if (str.length() <= 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f17236b = z10;
        if (TextUtils.isEmpty(str2)) {
            p10 = null;
        } else {
            p10 = p0.p("[", str2, "] ");
        }
        this.f17237c = p10;
    }

    public final void a(Exception exc, String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f17236b) {
            String str2 = this.f17235a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr), exc);
            }
        }
    }

    public final void b(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f17236b) {
            String str2 = this.f17235a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr));
            }
        }
    }

    public final void c(Object... objArr) {
        Log.e(this.f17235a, d("Bundle is null", objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.f17237c;
        if (!TextUtils.isEmpty(str2)) {
            return String.valueOf(str2).concat(String.valueOf(str));
        }
        return str;
    }
}
