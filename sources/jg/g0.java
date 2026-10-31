package jg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.er0;
public final class g0 extends w2 {
    public final r0 f9980y0;

    public g0(r0 r0Var, Context context, PointF pointF, float f7, float f10, pu0 pu0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, pu0Var, document, obj);
        this.f9980y0 = r0Var;
    }

    @Override
    public final void q(bi0 bi0Var) {
        PhotoViewer photoViewer = ((er0) this.f9980y0).X1;
        u61 u61Var = photoViewer.F2;
        if (u61Var == null) {
            return;
        }
        long S = u61Var.S();
        long j10 = photoViewer.f33546m8;
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 / 1000;
        }
        bi0Var.U(S - j11);
    }
}
