package bi;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.q41;
public final class y extends FrameLayout {
    public final int f5055a;
    public final ArrayList f5056b;
    public final q41 f5057c;
    public String d;
    public boolean f5058e;
    public boolean f5059f;
    public boolean h;
    public final a3.f f5060n;
    public final z f5061r;

    public y(z zVar, Context context, int i7) {
        super(context);
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        oi.q qVar;
        this.f5061r = zVar;
        this.f5056b = new ArrayList();
        this.d = "";
        this.f5060n = new a3.f(this, 15);
        this.f5055a = i7;
        setClipChildren(false);
        setClipToPadding(false);
        i10 = ((org.telegram.ui.ActionBar.f2) zVar).currentAccount;
        int classGuid = zVar.getClassGuid();
        ai.e eVar = new ai.e(this, 2);
        a1.c cVar = new a1.c(this, 10);
        f6Var = ((org.telegram.ui.ActionBar.f2) zVar).resourceProvider;
        q41 q41Var = new q41(context, i10, classGuid, true, eVar, cVar, null, f6Var);
        this.f5057c = q41Var;
        q41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        q41Var.f37190f3.f35528r = false;
        q41Var.setCaptureSectionsDecoratorAllowed(true);
        q41Var.setClipToPadding(false);
        q41Var.setOverScrollMode(0);
        addView(q41Var, c8.ha.c(-1.0f, -1));
        qVar = ((org.telegram.ui.ActionBar.f2) zVar).glassEngine;
        qVar.b(q41Var);
        q41Var.j(new ai.b(this, 2));
    }

    public final void a() {
        boolean z9;
        int i7;
        int i10;
        int i11;
        z zVar = this.f5061r;
        if (!zVar.O && !this.f5058e && !this.f5059f && !this.h) {
            boolean z10 = true;
            this.f5058e = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            int i12 = this.f5055a;
            if (i12 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            tL_payments_getStarsTransactions.inbound = z9;
            if (i12 != 2) {
                z10 = false;
            }
            tL_payments_getStarsTransactions.outbound = z10;
            i7 = ((org.telegram.ui.ActionBar.f2) zVar).currentAccount;
            tL_payments_getStarsTransactions.peer = qp.s1(i7).j1(zVar.f5110b);
            String str = this.d;
            tL_payments_getStarsTransactions.offset = str;
            tL_payments_getStarsTransactions.limit = 20;
            this.f5057c.f37190f3.O(false);
            i10 = ((org.telegram.ui.ActionBar.f2) zVar).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new j(1, this, str));
            i11 = ((org.telegram.ui.ActionBar.f2) zVar).currentAccount;
            ConnectionsManager.getInstance(i11).bindRequestToGuid(sendRequest, zVar.getClassGuid());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(this.f5060n);
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f5060n);
        super.onDetachedFromWindow();
    }
}
