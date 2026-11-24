package defpackage;

import android.os.Looper;
public final class w56 {
    public final mc5 a;
    public volatile u56 b;

    public w56(Looper looper, Object obj, String str) {
        this.a = new mc5(looper);
        fre.i(obj, "Listener must not be null");
        fre.f(str);
        this.b = new u56(obj, str);
    }

    public final void a(v56 v56Var) {
        this.a.execute(new tq4(this, v56Var, (byte) 15));
    }
}
