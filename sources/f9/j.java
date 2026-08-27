package f9;

import android.util.Log;
import java.io.IOException;

public final class j {
    public static final i d = new i(0);

    public static final a5.f f5939e = new a5.f(14);

    public final k9.c f5940a;

    public String f5941b = null;

    public String f5942c = null;

    public j(k9.c cVar) {
        this.f5940a = cVar;
    }

    public static void a(k9.c cVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            cVar.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e9) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e9);
        }
    }
}
