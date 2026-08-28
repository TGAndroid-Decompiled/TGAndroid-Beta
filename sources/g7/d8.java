package g7;

import android.util.Log;
public abstract class d8 {
    public static void a(String str) {
        boolean isLoggable;
        if (Log.isLoggable("FirebaseAppIndex", 3)) {
            isLoggable = true;
        } else {
            isLoggable = Log.isLoggable("FirebaseAppIndex", 3);
        }
        if (isLoggable) {
            Log.d("FirebaseAppIndex", str);
        }
    }
}
