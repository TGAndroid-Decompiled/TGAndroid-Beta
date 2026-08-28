package g6;

import android.content.Context;
public final class c {
    public static final c f7119b;
    public b f7120a;

    static {
        ?? obj = new Object();
        obj.f7120a = null;
        f7119b = obj;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f7119b;
        synchronized (cVar) {
            try {
                if (cVar.f7120a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f7120a = new b(context, 0);
                }
                bVar = cVar.f7120a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
