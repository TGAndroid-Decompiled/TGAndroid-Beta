package defpackage;

import android.os.Looper;
public final class a86 {
    public final ne5 a;
    public volatile y76 b;

    public a86(Looper looper, Object obj, String str) {
        this.a = new ne5(looper);
        xve.i(obj, "Listener must not be null");
        xve.f(str);
        this.b = new y76(obj, str);
    }

    public final void a(z76 z76Var) {
        this.a.execute(new xs4(this, z76Var, (byte) 15));
    }
}
