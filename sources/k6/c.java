package k6;

import android.content.Context;
public final class c {
    public static final c f9755b;
    public b f9756a;

    static {
        ?? obj = new Object();
        obj.f9756a = null;
        f9755b = obj;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f9755b;
        synchronized (cVar) {
            try {
                if (cVar.f9756a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f9756a = new b(context, 0);
                }
                bVar = cVar.f9756a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
