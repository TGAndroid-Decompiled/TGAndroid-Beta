package di;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g51;
public final class s extends FrameLayout {
    public final int f9674a;
    public final ArrayList f9675b;
    public final g51 f9676c;
    public String d;
    public boolean f9677e;
    public boolean f9678f;
    public boolean h;
    public final ca.r f9679n;
    public final t f9680r;

    public s(t tVar, Context context, int i7) {
        super(context);
        int i10;
        org.telegram.ui.ActionBar.i6 i6Var;
        ri.q qVar;
        this.f9680r = tVar;
        this.f9675b = new ArrayList();
        this.d = "";
        this.f9679n = new ca.r(this, 9);
        this.f9674a = i7;
        setClipChildren(false);
        setClipToPadding(false);
        i10 = ((org.telegram.ui.ActionBar.g2) tVar).currentAccount;
        int classGuid = tVar.getClassGuid();
        bi.b bVar = new bi.b(this, 14);
        a1.c cVar = new a1.c(this, 23);
        i6Var = ((org.telegram.ui.ActionBar.g2) tVar).resourceProvider;
        g51 g51Var = new g51(context, i10, classGuid, true, bVar, cVar, null, i6Var);
        this.f9676c = g51Var;
        g51Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        g51Var.f35323g3.f33631r = false;
        g51Var.setCaptureSectionsDecoratorAllowed(true);
        g51Var.setClipToPadding(false);
        g51Var.setOverScrollMode(0);
        addView(g51Var, c8.na.c(-1.0f, -1));
        qVar = ((org.telegram.ui.ActionBar.g2) tVar).glassEngine;
        qVar.b(g51Var);
        g51Var.j(new bi.v1(this, 7));
    }

    public final void a() {
        boolean z10;
        int i7;
        int i10;
        int i11;
        t tVar = this.f9680r;
        if (!tVar.P && !this.f9677e && !this.f9678f && !this.h) {
            boolean z11 = true;
            this.f9677e = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            int i12 = this.f9674a;
            if (i12 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tL_payments_getStarsTransactions.inbound = z10;
            if (i12 != 2) {
                z11 = false;
            }
            tL_payments_getStarsTransactions.outbound = z11;
            i7 = ((org.telegram.ui.ActionBar.g2) tVar).currentAccount;
            tL_payments_getStarsTransactions.peer = mp.u1(i7).l1(tVar.f9732b);
            String str = this.d;
            tL_payments_getStarsTransactions.offset = str;
            tL_payments_getStarsTransactions.limit = 20;
            this.f9676c.f35323g3.O(false);
            i10 = ((org.telegram.ui.ActionBar.g2) tVar).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new bi.o1(4, this, str));
            i11 = ((org.telegram.ui.ActionBar.g2) tVar).currentAccount;
            ConnectionsManager.getInstance(i11).bindRequestToGuid(sendRequest, tVar.getClassGuid());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(this.f9679n);
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f9679n);
        super.onDetachedFromWindow();
    }
}
