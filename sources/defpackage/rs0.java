package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class rs0 extends FrameLayout {
    public final int a;
    public final ArrayList b;
    public final q5c c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final oz n;
    public final ss0 r;

    public rs0(ss0 ss0Var, Context context, int i) {
        super(context);
        int i2;
        wjb wjbVar;
        qw4 qw4Var;
        this.r = ss0Var;
        this.b = new ArrayList();
        this.d = "";
        this.n = new oz(this, (byte) 27);
        this.a = i;
        setClipChildren(false);
        setClipToPadding(false);
        i2 = ((d) ss0Var).currentAccount;
        int classGuid = ss0Var.getClassGuid();
        f fVar = new f(this, (byte) 18);
        sg0 sg0Var = new sg0(this, (byte) 11);
        wjbVar = ((d) ss0Var).resourceProvider;
        q5c q5cVar = new q5c(context, i2, classGuid, true, fVar, sg0Var, null, wjbVar);
        this.c = q5cVar;
        q5cVar.s1(gl.L(12.0f), gl.L(16.0f), false);
        q5cVar.g3.r = false;
        q5cVar.setCaptureSectionsDecoratorAllowed(true);
        q5cVar.setClipToPadding(false);
        q5cVar.setOverScrollMode(0);
        addView(q5cVar, nme.c(-1.0f, -1));
        qw4Var = ((d) ss0Var).glassEngine;
        qw4Var.b(q5cVar);
        q5cVar.j(new y(this, (byte) 8));
    }

    public final void a() {
        boolean z;
        int i;
        int i2;
        int i3;
        ss0 ss0Var = this.r;
        if (!ss0Var.P && !this.e && !this.f && !this.h) {
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
            i = ((d) ss0Var).currentAccount;
            tL_payments_getStarsTransactions.peer = na7.q1(i).h1(ss0Var.b);
            String str = this.d;
            tL_payments_getStarsTransactions.offset = str;
            tL_payments_getStarsTransactions.limit = 20;
            this.c.g3.O(false);
            i2 = ((d) ss0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i2).sendRequest(tL_payments_getStarsTransactions, new pl(this, str, (byte) 6));
            i3 = ((d) ss0Var).currentAccount;
            ConnectionsManager.getInstance(i3).bindRequestToGuid(sendRequest, ss0Var.getClassGuid());
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
