package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class hp1 extends i92 {
    public final mu1 N;

    public hp1(mu1 mu1Var, Activity activity, int i, TLRPC.Document document, wjb wjbVar) {
        super(activity, i, document, wjbVar);
        this.N = mu1Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float y = getY();
        mu1 mu1Var = this.N;
        float y2 = mu1Var.g1.getY() + y;
        this.K = mu1Var.m1.getBackgroundSizeY();
        this.J = y2;
    }
}
