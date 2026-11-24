package defpackage;

import android.os.Looper;
public final class w76 {
    public final ke5 a;
    public volatile u76 b;

    public w76(Looper looper, Object obj, String str) {
        this.a = new ke5(looper);
        ite.i(obj, "Listener must not be null");
        ite.f(str);
        this.b = new u76(obj, str);
    }

    public final void a(v76 v76Var) {
        this.a.execute(new us4(this, v76Var, (byte) 15));
    }
}
