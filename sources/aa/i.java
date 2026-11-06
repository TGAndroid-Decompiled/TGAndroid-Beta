package aa;

import android.util.Log;
import java.io.IOException;
public final class i {
    public static final h d = new h(0);
    public static final a3.c f813e = new a3.c(8);
    public final ga.d f814a;
    public String f815b = null;
    public String f816c = null;

    public i(ga.d dVar) {
        this.f814a = dVar;
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
