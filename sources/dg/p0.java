package dg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.mt0;
public final class p0 extends r3 {
    public final e1 f4724v0;

    public p0(e1 e1Var, Context context, PointF pointF, float f10, float f11, jv0 jv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, jv0Var, document, obj);
        this.f4724v0 = e1Var;
    }

    @Override
    public final void q(gj0 gj0Var) {
        PhotoViewer photoViewer = ((mt0) this.f4724v0).f36200l2;
        i71 i71Var = photoViewer.C2;
        if (i71Var == null) {
            return;
        }
        long n10 = i71Var.n();
        long j10 = photoViewer.f31750i8;
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 / 1000;
        }
        gj0Var.R(n10 - j11);
    }
}
