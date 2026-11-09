package bi;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.r41;
public final class y extends FrameLayout {
    public final int f5053a;
    public final ArrayList f5054b;
    public final r41 f5055c;
    public String d;
    public boolean f5056e;
    public boolean f5057f;
    public boolean h;
    public final a3.f f5058n;
    public final z f5059r;

    public y(z zVar, Context context, int i7) {
        super(context);
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        oi.q qVar;
        this.f5059r = zVar;
        this.f5054b = new ArrayList();
        this.d = "";
        this.f5058n = new a3.f(this, 15);
        this.f5053a = i7;
        setClipChildren(false);
        setClipToPadding(false);
        i10 = ((org.telegram.ui.ActionBar.f2) zVar).currentAccount;
        int classGuid = zVar.getClassGuid();
        ai.e eVar = new ai.e(this, 2);
        a1.c cVar = new a1.c(this, 10);
        g6Var = ((org.telegram.ui.ActionBar.f2) zVar).resourceProvider;
        r41 r41Var = new r41(context, i10, classGuid, true, eVar, cVar, null, g6Var);
        this.f5055c = r41Var;
        r41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        r41Var.f37556f3.f35945r = false;
        r41Var.setCaptureSectionsDecoratorAllowed(true);
        r41Var.setClipToPadding(false);
        r41Var.setOverScrollMode(0);
        addView(r41Var, c8.ha.c(-1.0f, -1));
        qVar = ((org.telegram.ui.ActionBar.f2) zVar).glassEngine;
        qVar.b(r41Var);
        r41Var.j(new ai.b(this, 2));
    }

    public final void a() {
        boolean z9;
        int i7;
        int i10;
        int i11;
        z zVar = this.f5059r;
        if (!zVar.O && !this.f5056e && !this.f5057f && !this.h) {
            boolean z10 = true;
            this.f5056e = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            int i12 = this.f5053a;
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
            tL_payments_getStarsTransactions.peer = qp.s1(i7).j1(zVar.f5108b);
            String str = this.d;
            tL_payments_getStarsTransactions.offset = str;
            tL_payments_getStarsTransactions.limit = 20;
            this.f5055c.f37556f3.O(false);
            i10 = ((org.telegram.ui.ActionBar.f2) zVar).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new j(1, this, str));
            i11 = ((org.telegram.ui.ActionBar.f2) zVar).currentAccount;
            ConnectionsManager.getInstance(i11).bindRequestToGuid(sendRequest, zVar.getClassGuid());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(this.f5058n);
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f5058n);
        super.onDetachedFromWindow();
    }
}
