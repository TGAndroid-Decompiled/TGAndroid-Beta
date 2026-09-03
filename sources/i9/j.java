package i9;

import android.util.Log;
import java.io.IOException;
public final class j {
    public static final i d = new i(0);
    public static final e5.e e = new e5.e(14);
    public final n9.b f7371a;
    public String f7372b = null;
    public String f7373c = null;

    public j(n9.b bVar) {
        this.f7371a = bVar;
    }

    public static void a(n9.b bVar, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                bVar.b(str, "aqs.".concat(str2)).createNewFile();
            } catch (IOException e6) {
                Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e6);
            }
        }
    }
}
