package bi;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.zu;
public final class o9 {
    public final int f3450a;
    public final zu f3451b;
    public final b30 f3452c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.j5 f3453f;
    public final org.telegram.ui.Components.j5 f3454g;

    public o9(View view) {
        zu zuVar = new zu(1, view);
        this.f3450a = UserConfig.selectedAccount;
        this.f3451b = zuVar;
        es esVar = es.h;
        this.f3453f = new org.telegram.ui.Components.j5(zuVar, 350L, esVar);
        this.f3454g = new org.telegram.ui.Components.j5(zuVar, 350L, esVar);
        b30 b30Var = new b30();
        this.f3452c = b30Var;
        b30Var.f23371a = true;
        b30Var.f23372b = true;
        b(false);
        b30Var.f23373c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        b30Var.f23373c.setStyle(Paint.Style.STROKE);
        b30Var.f23373c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f3453f.a(this.d, false);
        int a10 = this.f3454g.a(this.e, false);
        b30 b30Var = this.f3452c;
        b30Var.d(a2, a10, 0, 0);
        b30Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return b30Var.f23373c;
    }

    public final void b(boolean z10) {
        d(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.hk, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ik, false), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        if (peerColor != null) {
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.g6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.g6.I.q()), z10);
        } else {
            b(z10);
        }
    }

    public final void d(int i10, int i11, boolean z10) {
        this.d = i10;
        this.e = i11;
        if (!z10) {
            this.f3453f.a(i10, true);
            this.f3454g.a(i11, true);
        }
        zu zuVar = this.f3451b;
        if (zuVar != null) {
            zuVar.run();
        }
    }
}
