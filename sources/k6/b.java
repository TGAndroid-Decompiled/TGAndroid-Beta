package k6;

import android.content.Context;
public final class b {
    public static final b f9735b;
    public bb.b f9736a;

    static {
        ?? obj = new Object();
        obj.f9736a = null;
        f9735b = obj;
    }

    public static bb.b a(Context context) {
        bb.b bVar;
        b bVar2 = f9735b;
        synchronized (bVar2) {
            try {
                if (bVar2.f9736a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar2.f9736a = new bb.b(context, 21);
                }
                bVar = bVar2.f9736a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
