package ci;

import android.content.Context;
import android.widget.FrameLayout;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l41;
public final class u extends FrameLayout {
    public final int f6069a;
    public final ArrayList f6070b;
    public final l41 f6071c;
    public String d;
    public boolean f6072e;
    public boolean f6073f;
    public boolean h;
    public final ai.s f6074n;
    public final v f6075r;

    public u(v vVar, Context context, int i3) {
        super(context);
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        pi.q qVar;
        this.f6075r = vVar;
        this.f6070b = new ArrayList();
        this.d = "";
        this.f6074n = new ai.s(this, 25);
        this.f6069a = i3;
        setClipChildren(false);
        setClipToPadding(false);
        i10 = ((org.telegram.ui.ActionBar.d2) vVar).currentAccount;
        int classGuid = vVar.getClassGuid();
        ai.c cVar = new ai.c(this, 12);
        a1.c cVar2 = new a1.c(this, 11);
        e6Var = ((org.telegram.ui.ActionBar.d2) vVar).resourceProvider;
        l41 l41Var = new l41(context, i10, classGuid, true, cVar, cVar2, null, e6Var);
        this.f6071c = l41Var;
        l41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        l41Var.f35594g3.f33698r = false;
        l41Var.setCaptureSectionsDecoratorAllowed(true);
        l41Var.setClipToPadding(false);
        l41Var.setOverScrollMode(0);
        addView(l41Var, mf.c(-1.0f, -1));
        qVar = ((org.telegram.ui.ActionBar.d2) vVar).glassEngine;
        qVar.b(l41Var);
        l41Var.j(new ai.j5(this, 5));
    }

    public final void a() {
        boolean z10;
        int i3;
        int i10;
        int i11;
        v vVar = this.f6075r;
        if (!vVar.P && !this.f6072e && !this.f6073f && !this.h) {
            boolean z11 = true;
            this.f6072e = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            int i12 = this.f6069a;
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
            i3 = ((org.telegram.ui.ActionBar.d2) vVar).currentAccount;
            tL_payments_getStarsTransactions.peer = hp.s1(i3).j1(vVar.f6132b);
            String str = this.d;
            tL_payments_getStarsTransactions.offset = str;
            tL_payments_getStarsTransactions.limit = 20;
            this.f6071c.f35594g3.O(false);
            i10 = ((org.telegram.ui.ActionBar.d2) vVar).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new ai.f3(3, this, str));
            i11 = ((org.telegram.ui.ActionBar.d2) vVar).currentAccount;
            ConnectionsManager.getInstance(i11).bindRequestToGuid(sendRequest, vVar.getClassGuid());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(this.f6074n);
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f6074n);
        super.onDetachedFromWindow();
    }
}
