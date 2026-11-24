package defpackage;

import org.telegram.messenger.voip.Instance;
public final class lm9 implements Instance.OnStateUpdatedListener {
    public final nm9 a;

    public lm9(nm9 nm9Var) {
        this.a = nm9Var;
    }

    @Override
    public final void onStateUpdated(int i, boolean z) {
        fa4.b("[LivePlayer] connectionState = " + i);
        nm9 nm9Var = this.a;
        boolean z2 = true;
        if (i != 3 && i != 1 && i != 2) {
            z2 = false;
        }
        if (nm9Var.G == z2) {
            return;
        }
        nm9Var.G = z2;
        gl.c3(new r76(nm9Var, (byte) 8));
    }
}
