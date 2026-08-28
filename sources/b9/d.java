package b9;

import android.util.Log;
public final class d {
    public static final d f1664a = new Object();

    public boolean a(int i9) {
        if (4 > i9 && !Log.isLoggable("FirebaseCrashlytics", i9)) {
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
