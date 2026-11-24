package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import org.telegram.messenger.a;
public final class qj4 {
    public static qj4 b;
    public final SharedPreferences a;

    public qj4(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    synchronized (this) {
                        isEmpty = sharedPreferences.getAll().isEmpty();
                    }
                    if (!isEmpty) {
                        Log.i("FirebaseMessaging", "App restored, clearing state");
                        a();
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
                }
            }
        }
    }

    public static qj4 b() {
        qj4 qj4Var = b;
        if (qj4Var == null) {
            Point point = gl.q;
            qj4 qj4Var2 = new qj4(point.x, point.y);
            b = qj4Var2;
            return qj4Var2;
        }
        return qj4Var;
    }

    public final synchronized void a() {
        this.a.edit().clear().commit();
    }

    public qj4(int i, int i2) {
        this.a = a.b.getSharedPreferences(b00.g(i, i2, "pip_floating_", "_"), 0);
    }
}
