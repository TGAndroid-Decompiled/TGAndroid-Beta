package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
public final class zs0 extends FrameLayout {
    public final int a;
    public final ArrayList b;
    public final q9c c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final pz n;
    public final at0 r;

    public zs0(at0 at0Var, Context context, int i) {
        super(context);
        int i2;
        vnb vnbVar;
        vy4 vy4Var;
        this.r = at0Var;
        this.b = new ArrayList();
        this.d = "";
        this.n = new pz(this, (byte) 29);
        this.a = i;
        setClipChildren(false);
        setClipToPadding(false);
        i2 = ((e) at0Var).currentAccount;
        int classGuid = at0Var.getClassGuid();
        c cVar = new c(this, (byte) 18);
        tg0 tg0Var = new tg0(this, (byte) 12);
        vnbVar = ((e) at0Var).resourceProvider;
        q9c q9cVar = new q9c(context, i2, classGuid, true, cVar, tg0Var, null, vnbVar);
        this.c = q9cVar;
        q9cVar.t1(hl.L(12.0f), hl.L(16.0f), false);
        q9cVar.g3.r = false;
        q9cVar.setCaptureSectionsDecoratorAllowed(true);
        q9cVar.setClipToPadding(false);
        q9cVar.setOverScrollMode(0);
        addView(q9cVar, tre.c(-1.0f, -1));
        vy4Var = ((e) at0Var).glassEngine;
        vy4Var.b(q9cVar);
        q9cVar.j(new y(this, (byte) 8));
    }

    public final void a() {
        boolean z;
        int i;
        int i2;
        int i3;
        at0 at0Var = this.r;
        if (!at0Var.P && !this.e && !this.f && !this.h) {
            boolean z2 = true;
            this.e = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            int i4 = this.a;
            if (i4 == 1) {
                z = true;
            } else {
                z = false;
            }
            tL_payments_getStarsTransactions.inbound = z;
            if (i4 != 2) {
                z2 = false;
            }
            tL_payments_getStarsTransactions.outbound = z2;
            i = ((e) at0Var).currentAccount;
            tL_payments_getStarsTransactions.peer = uc7.s1(i).j1(at0Var.b);
            String str = this.d;
            tL_payments_getStarsTransactions.offset = str;
            tL_payments_getStarsTransactions.limit = 20;
            this.c.g3.O(false);
            i2 = ((e) at0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i2).sendRequest(tL_payments_getStarsTransactions, new ql(this, str, (byte) 6));
            i3 = ((e) at0Var).currentAccount;
            ConnectionsManager.getInstance(i3).bindRequestToGuid(sendRequest, at0Var.getClassGuid());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(this.n);
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.n);
        super.onDetachedFromWindow();
    }
}
