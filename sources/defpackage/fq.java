package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class fq {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static fq c;
    public hc9 a;

    public static synchronized fq a() {
        fq fqVar;
        synchronized (fq.class) {
            if (c == null) {
                c();
            }
            fqVar = c;
        }
        return fqVar;
    }

    public static synchronized void c() {
        synchronized (fq.class) {
            if (c == null) {
                ?? obj = new Object();
                c = obj;
                obj.a = hc9.d();
                c.a.l(new eq((byte) 0));
            }
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.g(context, i);
    }
}
