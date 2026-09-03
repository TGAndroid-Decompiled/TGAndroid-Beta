package f9;

import android.util.Log;
public final class b {
    public static final b f6095a = new Object();

    public boolean a(int i10) {
        if (4 > i10 && !Log.isLoggable("FirebaseCrashlytics", i10)) {
            return false;
        }
        return true;
    }

    public void b(String str) {
        if (a(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public void c(String str) {
        if (a(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void d(String str, Exception exc) {
        if (a(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }
}
