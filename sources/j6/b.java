package j6;

import a8.p0;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
public final class b {
    public final String f16508a;
    public final boolean f16509b;
    public final String f16510c;

    public b(String str, String str2) {
        boolean z9;
        String p10;
        q6.m.f(str, "The log tag cannot be null or empty.");
        this.f16508a = str;
        if (str.length() <= 23) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f16509b = z9;
        if (TextUtils.isEmpty(str2)) {
            p10 = null;
        } else {
            p10 = p0.p("[", str2, "] ");
        }
        this.f16510c = p10;
    }

    public final void a(Exception exc, String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f16509b) {
            String str2 = this.f16508a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr), exc);
            }
        }
    }

    public final void b(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f16509b) {
            String str2 = this.f16508a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr));
            }
        }
    }

    public final void c(Object... objArr) {
        Log.e(this.f16508a, d("Bundle is null", objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.f16510c;
        if (!TextUtils.isEmpty(str2)) {
            return String.valueOf(str2).concat(String.valueOf(str));
        }
        return str;
    }
}
