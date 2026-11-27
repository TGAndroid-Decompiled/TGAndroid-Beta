package defpackage;

import org.telegram.messenger.voip.Instance;
public final class bq9 implements Instance.OnStateUpdatedListener {
    public final dq9 a;

    public bq9(dq9 dq9Var) {
        this.a = dq9Var;
    }

    @Override
    public final void onStateUpdated(int i, boolean z) {
        cc4.b("[LivePlayer] connectionState = " + i);
        dq9 dq9Var = this.a;
        boolean z2 = true;
        if (i != 3 && i != 1 && i != 2) {
            z2 = false;
        }
        if (dq9Var.G == z2) {
            return;
        }
        dq9Var.G = z2;
        hl.c3(new u96(dq9Var, (byte) 3));
    }
}
