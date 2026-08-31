package k6;

import android.content.Context;
public final class c {
    public static final c f10476b;
    public b f10477a;

    static {
        ?? obj = new Object();
        obj.f10477a = null;
        f10476b = obj;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f10476b;
        synchronized (cVar) {
            try {
                if (cVar.f10477a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f10477a = new b(context, 0);
                }
                bVar = cVar.f10477a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
