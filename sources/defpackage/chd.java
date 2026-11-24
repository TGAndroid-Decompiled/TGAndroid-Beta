package defpackage;

import android.os.Build;
import android.util.Log;
import j$.util.Objects;
public final class chd extends ClassLoader {
    @Override
    public final Class loadClass(String str, boolean z) {
        if (Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            if (Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3))) {
                Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
                return hnd.class;
            }
            return hnd.class;
        }
        return super.loadClass(str, z);
    }
}
