package defpackage;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class iw5 extends yza {
    public final rw5 A0;

    public iw5(rw5 rw5Var, Context context, PointF pointF, float f, float f2, via viaVar, TLRPC.Document document, Object obj) {
        super(context, pointF, f, f2, viaVar, document, obj);
        this.A0 = rw5Var;
    }

    @Override
    public final void q(oy8 oy8Var) {
        PhotoViewer photoViewer = ((q88) this.A0).j2;
        lbc lbcVar = photoViewer.G2;
        if (lbcVar == null) {
            return;
        }
        long S = lbcVar.S();
        long j = photoViewer.r8;
        long j2 = 0;
        if (j > 0) {
            j2 = j / 1000;
        }
        oy8Var.P(S - j2);
    }
}
