package di;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h51;
public final class s extends FrameLayout {
    public final int f9713a;
    public final ArrayList f9714b;
    public final h51 f9715c;
    public String d;
    public boolean f9716e;
    public boolean f9717f;
    public boolean h;
    public final ca.r f9718n;
    public final t f9719r;

    public s(t tVar, Context context, int i7) {
        super(context);
        int i10;
        org.telegram.ui.ActionBar.h6 h6Var;
        ri.q qVar;
        this.f9719r = tVar;
        this.f9714b = new ArrayList();
        this.d = "";
        this.f9718n = new ca.r(this, 10);
        this.f9713a = i7;
        setClipChildren(false);
        setClipToPadding(false);
        i10 = ((org.telegram.ui.ActionBar.g2) tVar).currentAccount;
        int classGuid = tVar.getClassGuid();
        bi.b bVar = new bi.b(this, 14);
        a1.c cVar = new a1.c(this, 23);
        h6Var = ((org.telegram.ui.ActionBar.g2) tVar).resourceProvider;
        h51 h51Var = new h51(context, i10, classGuid, true, bVar, cVar, null, h6Var);
        this.f9715c = h51Var;
        h51Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        h51Var.f35789g3.f34062r = false;
        h51Var.setCaptureSectionsDecoratorAllowed(true);
        h51Var.setClipToPadding(false);
        h51Var.setOverScrollMode(0);
        addView(h51Var, c8.ma.c(-1.0f, -1));
        qVar = ((org.telegram.ui.ActionBar.g2) tVar).glassEngine;
        qVar.b(h51Var);
        h51Var.j(new bi.u1(this, 7));
    }

    public final void a() {
        boolean z10;
        int i7;
        int i10;
        int i11;
        t tVar = this.f9719r;
        if (!tVar.P && !this.f9716e && !this.f9717f && !this.h) {
            boolean z11 = true;
            this.f9716e = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            int i12 = this.f9713a;
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
            tL_payments_getStarsTransactions.peer = np.u1(i7).l1(tVar.f9771b);
            String str = this.d;
            tL_payments_getStarsTransactions.offset = str;
            tL_payments_getStarsTransactions.limit = 20;
            this.f9715c.f35789g3.O(false);
            i10 = ((org.telegram.ui.ActionBar.g2) tVar).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new bi.o1(4, this, str));
            i11 = ((org.telegram.ui.ActionBar.g2) tVar).currentAccount;
            ConnectionsManager.getInstance(i11).bindRequestToGuid(sendRequest, tVar.getClassGuid());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(this.f9718n);
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f9718n);
        super.onDetachedFromWindow();
    }
}
