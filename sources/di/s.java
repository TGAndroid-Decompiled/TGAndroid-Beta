package di;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.e51;
public final class s extends FrameLayout {
    public final int f9682a;
    public final ArrayList f9683b;
    public final e51 f9684c;
    public String d;
    public boolean f9685e;
    public boolean f9686f;
    public boolean h;
    public final ca.r f9687n;
    public final t f9688r;

    public s(t tVar, Context context, int i7) {
        super(context);
        int i10;
        org.telegram.ui.ActionBar.i6 i6Var;
        ri.q qVar;
        this.f9688r = tVar;
        this.f9683b = new ArrayList();
        this.d = "";
        this.f9687n = new ca.r(this, 10);
        this.f9682a = i7;
        setClipChildren(false);
        setClipToPadding(false);
        i10 = ((org.telegram.ui.ActionBar.h2) tVar).currentAccount;
        int classGuid = tVar.getClassGuid();
        bi.b bVar = new bi.b(this, 14);
        a1.c cVar = new a1.c(this, 22);
        i6Var = ((org.telegram.ui.ActionBar.h2) tVar).resourceProvider;
        e51 e51Var = new e51(context, i10, classGuid, true, bVar, cVar, null, i6Var);
        this.f9684c = e51Var;
        e51Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        e51Var.f34607g3.f42809r = false;
        e51Var.setCaptureSectionsDecoratorAllowed(true);
        e51Var.setClipToPadding(false);
        e51Var.setOverScrollMode(0);
        addView(e51Var, c8.ma.c(-1.0f, -1));
        qVar = ((org.telegram.ui.ActionBar.h2) tVar).glassEngine;
        qVar.b(e51Var);
        e51Var.j(new bi.q1(this, 7));
    }

    public final void a() {
        boolean z10;
        int i7;
        int i10;
        int i11;
        t tVar = this.f9688r;
        if (!tVar.P && !this.f9685e && !this.f9686f && !this.h) {
            boolean z11 = true;
            this.f9685e = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            int i12 = this.f9682a;
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
            i7 = ((org.telegram.ui.ActionBar.h2) tVar).currentAccount;
            tL_payments_getStarsTransactions.peer = mp.u1(i7).l1(tVar.f9752b);
            String str = this.d;
            tL_payments_getStarsTransactions.offset = str;
            tL_payments_getStarsTransactions.limit = 20;
            this.f9684c.f34607g3.O(false);
            i10 = ((org.telegram.ui.ActionBar.h2) tVar).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new bi.k1(4, this, str));
            i11 = ((org.telegram.ui.ActionBar.h2) tVar).currentAccount;
            ConnectionsManager.getInstance(i11).bindRequestToGuid(sendRequest, tVar.getClassGuid());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(this.f9687n);
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f9687n);
        super.onDetachedFromWindow();
    }
}
