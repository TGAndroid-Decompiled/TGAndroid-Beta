package l6;

import android.os.Build;
import android.util.Log;
import j$.util.Objects;
public final class e extends ClassLoader {
    @Override
    public final Class loadClass(String str, boolean z10) {
        if (Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            if (Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3))) {
                Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
                return f.class;
            }
            return f.class;
        }
        return super.loadClass(str, z10);
    }
}
