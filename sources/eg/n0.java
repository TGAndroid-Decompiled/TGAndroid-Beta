package eg;

import android.content.Context;
import android.graphics.PointF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ht0;
public final class n0 extends p3 {
    public final c1 f5377v0;

    public n0(c1 c1Var, Context context, PointF pointF, float f10, float f11, kv0 kv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF, f10, f11, kv0Var, document, obj);
        this.f5377v0 = c1Var;
    }

    @Override
    public final void q(ij0 ij0Var) {
        PhotoViewer photoViewer = ((ht0) this.f5377v0).f37617l2;
        k71 k71Var = photoViewer.C2;
        if (k71Var == null) {
            return;
        }
        long n10 = k71Var.n();
        long j10 = photoViewer.f34302i8;
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 / 1000;
        }
        ij0Var.R(n10 - j11);
    }
}
