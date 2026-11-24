package defpackage;

import android.os.Handler;
public final class ob3 implements hs3 {
    public final fs3 a;
    public cs3 b;
    public boolean c;
    public final pb3 d;

    public ob3(pb3 pb3Var, fs3 fs3Var) {
        this.d = pb3Var;
        this.a = fs3Var;
    }

    @Override
    public final void release() {
        Handler handler = this.d.K;
        handler.getClass();
        hac.X(handler, new xf2(this, (byte) 25));
    }
}
