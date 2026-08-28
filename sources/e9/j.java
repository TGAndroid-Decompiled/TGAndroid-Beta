package e9;

import android.util.Log;
import java.io.IOException;
public final class j {
    public static final i d = new i(0);
    public static final a5.e f5007e = new a5.e(13);
    public final j9.c f5008a;
    public String f5009b = null;
    public String f5010c = null;

    public j(j9.c cVar) {
        this.f5008a = cVar;
    }

    public static void a(j9.c cVar, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                cVar.b(str, "aqs.".concat(str2)).createNewFile();
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e10);
            }
        }
    }
}
