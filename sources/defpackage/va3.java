package defpackage;

import android.os.Handler;
public final class va3 implements or3 {
    public final mr3 a;
    public jr3 b;
    public boolean c;
    public final wa3 d;

    public va3(wa3 wa3Var, mr3 mr3Var) {
        this.d = wa3Var;
        this.a = mr3Var;
    }

    @Override
    public final void release() {
        Handler handler = this.d.K;
        handler.getClass();
        gcc.X(handler, new vd2(this, (byte) 26));
    }
}
