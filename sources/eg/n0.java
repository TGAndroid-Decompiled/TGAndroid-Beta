package eg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.mt0;
public final class n0 extends p3 {
    public final c1 f5377v0;

    public n0(c1 c1Var, Context context, PointF pointF, float f10, float f11, jv0 jv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, jv0Var, document, obj);
        this.f5377v0 = c1Var;
    }

    @Override
    public final void q(hj0 hj0Var) {
        PhotoViewer photoViewer = ((mt0) this.f5377v0).f39068l2;
        j71 j71Var = photoViewer.C2;
        if (j71Var == null) {
            return;
        }
        long n10 = j71Var.n();
        long j10 = photoViewer.f34302i8;
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 / 1000;
        }
        hj0Var.R(n10 - j11);
    }
}
