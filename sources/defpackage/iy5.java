package defpackage;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class iy5 extends z1b {
    public final ry5 A0;

    public iy5(ry5 ry5Var, Context context, PointF pointF, float f, float f2, xka xkaVar, TLRPC.Document document, Object obj) {
        super(context, pointF, f, f2, xkaVar, document, obj);
        this.A0 = ry5Var;
    }

    @Override
    public final void q(p09 p09Var) {
        PhotoViewer photoViewer = ((sa8) this.A0).j2;
        ndc ndcVar = photoViewer.G2;
        if (ndcVar == null) {
            return;
        }
        long S = ndcVar.S();
        long j = photoViewer.r8;
        long j2 = 0;
        if (j > 0) {
            j2 = j / 1000;
        }
        p09Var.P(S - j2);
    }
}
