package aa;

import android.util.Log;
import java.io.IOException;
public final class i {
    public static final h d = new h(0);
    public static final a3.c f812e = new a3.c(8);
    public final ga.d f813a;
    public String f814b = null;
    public String f815c = null;

    public i(ga.d dVar) {
        this.f813a = dVar;
    }

    public static void a(ga.d dVar, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                dVar.b(str, "aqs.".concat(str2)).createNewFile();
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e10);
            }
        }
    }
}
