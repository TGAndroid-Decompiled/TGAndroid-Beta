package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class fp {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static fp c;
    public ha9 a;

    public static synchronized fp a() {
        fp fpVar;
        synchronized (fp.class) {
            if (c == null) {
                c();
            }
            fpVar = c;
        }
        return fpVar;
    }

    public static synchronized void c() {
        synchronized (fp.class) {
            if (c == null) {
                ?? obj = new Object();
                c = obj;
                obj.a = ha9.d();
                c.a.l(new ep((byte) 0));
            }
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.g(context, i);
    }
}
