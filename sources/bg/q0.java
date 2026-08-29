package bg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ws0;
public final class q0 extends v3 {
    public final g1 f2462u0;

    public q0(g1 g1Var, Context context, PointF pointF, float f9, float f10, bv0 bv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f9, f10, bv0Var, document, obj);
        this.f2462u0 = g1Var;
    }

    @Override
    public final void q(xi0 xi0Var) {
        PhotoViewer photoViewer = ((ws0) this.f2462u0).f44369k2;
        x61 x61Var = photoViewer.B2;
        if (x61Var == null) {
            return;
        }
        long o10 = x61Var.o();
        long j10 = photoViewer.f35719h8;
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 / 1000;
        }
        xi0Var.R(o10 - j11);
    }
}
