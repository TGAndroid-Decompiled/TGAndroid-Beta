package ab;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import org.telegram.messenger.t0;
public final class d0 {
    public static d0 f917b;
    public final SharedPreferences f918a;

    public d0(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f918a = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                a();
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    public static d0 b() {
        if (f917b == null) {
            Point point = org.telegram.messenger.g0.f22567q;
            f917b = new d0(point.x, point.y);
        }
        return f917b;
    }

    public synchronized void a() {
        this.f918a.edit().clear().commit();
    }

    public d0(int i7, int i10) {
        this.f918a = t0.f25570b.getSharedPreferences(a8.p0.m(i7, i10, "pip_floating_", "_"), 0);
    }
}
