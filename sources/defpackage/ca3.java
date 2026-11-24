package defpackage;

import android.os.Handler;
public final class ca3 implements xq3 {
    public final vq3 a;
    public sq3 b;
    public boolean c;
    public final da3 d;

    public ca3(da3 da3Var, vq3 vq3Var) {
        this.d = da3Var;
        this.a = vq3Var;
    }

    @Override
    public final void release() {
        Handler handler = this.d.K;
        handler.getClass();
        g8c.X(handler, new mk2(this, (byte) 20));
    }
}
