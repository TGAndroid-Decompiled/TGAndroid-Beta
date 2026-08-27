package h6;

import android.content.Context;
import v5.h;

public final class b {

    public static final b f8290b;

    public h f8291a;

    static {
        b bVar = new b();
        bVar.f8291a = null;
        f8290b = bVar;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f8290b;
        synchronized (bVar) {
            try {
                if (bVar.f8291a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f8291a = new h(context, 1);
                }
                hVar = bVar.f8291a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }
}
