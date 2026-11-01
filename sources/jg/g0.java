package jg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cr0;
public final class g0 extends w2 {
    public final r0 f9981y0;

    public g0(r0 r0Var, Context context, PointF pointF, float f7, float f10, qu0 qu0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f7, f10, qu0Var, document, obj);
        this.f9981y0 = r0Var;
    }

    @Override
    public final void q(ci0 ci0Var) {
        PhotoViewer photoViewer = ((cr0) this.f9981y0).X1;
        v61 v61Var = photoViewer.F2;
        if (v61Var == null) {
            return;
        }
        long S = v61Var.S();
        long j10 = photoViewer.f33553m8;
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 / 1000;
        }
        ci0Var.U(S - j11);
    }
}
