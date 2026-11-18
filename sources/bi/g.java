package bi;

import android.content.Context;
import android.util.LongSparseArray;
import android.widget.LinearLayout;
import c8.ma;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.q9;
import org.telegram.messenger.s9;
import org.telegram.messenger.u9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z41;
public final class g extends sa implements s9 {
    public final l41 T1;
    public final LongSparseArray U1;
    public ArrayList V1;
    public boolean W1;
    public z41 X1;
    public int Y1;

    public g(Context context) {
        super(context, null, false, false, 2, null);
        int i7 = 0;
        this.U1 = new LongSparseArray();
        this.V1 = new ArrayList();
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29339a7, false);
        this.Y1 = x02;
        v0(x02);
        u9.c(this.f30189a).f27141f.add(this);
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        O();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.T1 = l41.j(-1, linearLayout);
        this.f39534o1.setPadding(this.f30227u0, org.telegram.messenger.g0.L(9.0f), this.f30227u0, org.telegram.messenger.g0.L(9.0f));
        this.f39534o1.setOverScrollMode(2);
        this.X1.O(false);
        ArrayList arrayList = u9.c(this.f30189a).f27139c;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            q9 q9Var = (q9) obj;
            f fVar = new f(context, q9Var);
            fVar.f3589a.setOnClickListener(new ah.h(this, context, q9Var, 1));
            linearLayout.addView(fVar, ma.o(-1, -2));
            this.U1.put(q9Var.f26371b, fVar);
        }
        g(arrayList);
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(this.f39534o1, getContext(), this.f30189a, 0, true, new b(this, 1), this.J0);
        this.X1 = z41Var;
        z41Var.f42809r = false;
        return z41Var;
    }

    @Override
    public final CharSequence P0() {
        ArrayList arrayList = this.V1;
        if (arrayList == null) {
            return null;
        }
        return gd.a0(null, null, 2131750402, Integer.valueOf(arrayList.size()));
    }

    @Override
    public final void dismiss() {
        u9.c(this.f30189a).f27141f.remove(this);
        super.dismiss();
    }

    @Override
    public final void g(ArrayList arrayList) {
        int i7;
        this.V1 = new ArrayList(arrayList);
        this.f39535p1.setTitle(P0());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            q9 q9Var = (q9) obj;
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = q9Var.f26374f;
            if (tL_starGiftAuctionState != null) {
                i7 = tL_starGiftAuctionState.next_round_at;
            } else {
                i7 = 0;
            }
            f fVar = (f) this.U1.get(q9Var.f26371b);
            if (fVar != null) {
                fVar.b(this.W1);
                long max = Math.max(0, i7 - ConnectionsManager.getInstance(this.f30189a).getCurrentTime());
                fVar.a(max, this.W1);
                fVar.f3593f.a(max);
            }
        }
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29339a7, false);
            if (x02 != this.Y1) {
                this.Y1 = x02;
                v0(x02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void v() {
        this.W1 = true;
    }
}
