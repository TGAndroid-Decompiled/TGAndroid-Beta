package g9;

import android.util.Log;
import java.io.IOException;
public final class j {
    public static final i d = new i(0);
    public static final c5.e f7161e = new c5.e(14);
    public final l9.b f7162a;
    public String f7163b = null;
    public String f7164c = null;

    public j(l9.b bVar) {
        this.f7162a = bVar;
    }

    public static void a(l9.b bVar, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                bVar.b(str, "aqs.".concat(str2)).createNewFile();
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e10);
            }
        }
    }
}
