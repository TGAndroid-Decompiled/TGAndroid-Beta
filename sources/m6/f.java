package m6;

import android.os.Build;
import android.util.Log;
import j$.util.Objects;
public final class f extends ClassLoader {
    @Override
    public final Class loadClass(String str, boolean z9) {
        if (Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            if (Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3))) {
                Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
                return g.class;
            }
            return g.class;
        }
        return super.loadClass(str, z9);
    }
}
