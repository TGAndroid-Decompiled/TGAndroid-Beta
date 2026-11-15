package di;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.u41;
public final class s extends FrameLayout {
    public final int f9357a;
    public final ArrayList f9358b;
    public final u41 f9359c;
    public String d;
    public boolean f9360e;
    public boolean f9361f;
    public boolean h;
    public final ch.w f9362n;
    public final t f9363r;

    public s(t tVar, Context context, int i7) {
        super(context);
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        ri.q qVar;
        this.f9363r = tVar;
        this.f9358b = new ArrayList();
        this.d = "";
        this.f9362n = new ch.w(this, 6);
        this.f9357a = i7;
        setClipChildren(false);
        setClipToPadding(false);
        i10 = ((org.telegram.ui.ActionBar.e2) tVar).currentAccount;
        int classGuid = tVar.getClassGuid();
        bi.b bVar = new bi.b(this, 13);
        a1.c cVar = new a1.c(this, 22);
        e6Var = ((org.telegram.ui.ActionBar.e2) tVar).resourceProvider;
        u41 u41Var = new u41(context, i10, classGuid, true, bVar, cVar, null, e6Var);
        this.f9359c = u41Var;
        u41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        u41Var.f39895g3.f38201r = false;
        u41Var.setCaptureSectionsDecoratorAllowed(true);
        u41Var.setClipToPadding(false);
        u41Var.setOverScrollMode(0);
        addView(u41Var, c8.ja.c(-1.0f, -1));
        qVar = ((org.telegram.ui.ActionBar.e2) tVar).glassEngine;
        qVar.b(u41Var);
        u41Var.j(new bi.z4(this, 6));
    }

    public final void a() {
        boolean z10;
        int i7;
        int i10;
        int i11;
        t tVar = this.f9363r;
        if (!tVar.P && !this.f9360e && !this.f9361f && !this.h) {
            boolean z11 = true;
            this.f9360e = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            int i12 = this.f9357a;
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
            i7 = ((org.telegram.ui.ActionBar.e2) tVar).currentAccount;
            tL_payments_getStarsTransactions.peer = np.s1(i7).j1(tVar.f9413b);
            String str = this.d;
            tL_payments_getStarsTransactions.offset = str;
            tL_payments_getStarsTransactions.limit = 20;
            this.f9359c.f39895g3.O(false);
            i10 = ((org.telegram.ui.ActionBar.e2) tVar).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new bi.v2(3, this, str));
            i11 = ((org.telegram.ui.ActionBar.e2) tVar).currentAccount;
            ConnectionsManager.getInstance(i11).bindRequestToGuid(sendRequest, tVar.getClassGuid());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(this.f9362n);
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f9362n);
        super.onDetachedFromWindow();
    }
}
