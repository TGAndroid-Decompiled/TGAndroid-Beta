package i6;

import android.content.Context;
import androidx.biometric.t;
public final class b {
    public static final b f8255b;
    public t f8256a;

    static {
        ?? obj = new Object();
        obj.f8256a = null;
        f8255b = obj;
    }

    public static t a(Context context) {
        t tVar;
        b bVar = f8255b;
        synchronized (bVar) {
            try {
                if (bVar.f8256a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f8256a = new t(context, 2);
                }
                tVar = bVar.f8256a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
