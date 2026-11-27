package defpackage;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class ny5 extends v3b {
    public final wy5 A0;

    public ny5(wy5 wy5Var, Context context, PointF pointF, float f, float f2, qma qmaVar, TLRPC.Document document, Object obj) {
        super(context, pointF, f, f2, qmaVar, document, obj);
        this.A0 = wy5Var;
    }

    @Override
    public final void q(b29 b29Var) {
        PhotoViewer photoViewer = ((hc8) this.A0).d2;
        kfc kfcVar = photoViewer.G2;
        if (kfcVar == null) {
            return;
        }
        long S = kfcVar.S();
        long j = photoViewer.r8;
        long j2 = 0;
        if (j > 0) {
            j2 = j / 1000;
        }
        b29Var.P(S - j2);
    }
}
