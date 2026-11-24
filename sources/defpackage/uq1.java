package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class uq1 extends ua2 {
    public final yv1 N;

    public uq1(yv1 yv1Var, Activity activity, int i, TLRPC.Document document, ylb ylbVar) {
        super(activity, i, document, ylbVar);
        this.N = yv1Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float y = getY();
        yv1 yv1Var = this.N;
        float y2 = yv1Var.g1.getY() + y;
        this.K = yv1Var.m1.getBackgroundSizeY();
        this.J = y2;
    }
}
