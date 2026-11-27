package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class vp1 extends y92 {
    public final zu1 N;

    public vp1(zu1 zu1Var, Activity activity, int i, TLRPC.Document document, vnb vnbVar) {
        super(activity, i, document, vnbVar);
        this.N = zu1Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float y = getY();
        zu1 zu1Var = this.N;
        float y2 = zu1Var.g1.getY() + y;
        this.K = zu1Var.m1.getBackgroundSizeY();
        this.J = y2;
    }
}
