package bi;

import android.content.Context;
import android.util.LongSparseArray;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.r9;
import org.telegram.messenger.t9;
import org.telegram.messenger.v9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
public final class g extends ja implements t9 {
    public final b41 T1;
    public final LongSparseArray U1;
    public ArrayList V1;
    public boolean W1;
    public p41 X1;
    public int Y1;

    public g(Context context) {
        super(context, null, false, false, 2, null);
        int i7 = 0;
        this.U1 = new LongSparseArray();
        this.V1 = new ArrayList();
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28792a7, false);
        this.Y1 = x02;
        v0(x02);
        v9.c(this.f29679a).f26952f.add(this);
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        O();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.T1 = b41.j(-1, linearLayout);
        this.f35936o1.setPadding(this.f29717u0, org.telegram.messenger.g0.L(9.0f), this.f29717u0, org.telegram.messenger.g0.L(9.0f));
        this.f35936o1.setOverScrollMode(2);
        this.X1.O(false);
        ArrayList arrayList = v9.c(this.f29679a).f26950c;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            r9 r9Var = (r9) obj;
            f fVar = new f(context, r9Var);
            fVar.f3487a.setOnClickListener(new ah.g(this, context, r9Var, 1));
            linearLayout.addView(fVar, c8.ja.o(-1, -2));
            this.U1.put(r9Var.f26259b, fVar);
        }
        g(arrayList);
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.f35936o1, getContext(), this.f29679a, 0, true, new b(this, 1), this.J0);
        this.X1 = p41Var;
        p41Var.f38201r = false;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        ArrayList arrayList = this.V1;
        if (arrayList == null) {
            return null;
        }
        return hd.a0(null, null, 2131750418, Integer.valueOf(arrayList.size()));
    }

    @Override
    public final void dismiss() {
        v9.c(this.f29679a).f26952f.remove(this);
        super.dismiss();
    }

    @Override
    public final void g(ArrayList arrayList) {
        int i7;
        this.V1 = new ArrayList(arrayList);
        this.f35937p1.setTitle(O0());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            r9 r9Var = (r9) obj;
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = r9Var.f26262f;
            if (tL_starGiftAuctionState != null) {
                i7 = tL_starGiftAuctionState.next_round_at;
            } else {
                i7 = 0;
            }
            f fVar = (f) this.U1.get(r9Var.f26259b);
            if (fVar != null) {
                fVar.b(this.W1);
                long max = Math.max(0, i7 - ConnectionsManager.getInstance(this.f29679a).getCurrentTime());
                fVar.a(max, this.W1);
                fVar.f3491f.a(max);
            }
        }
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28792a7, false);
            if (x02 != this.Y1) {
                this.Y1 = x02;
                v0(x02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void v() {
        this.W1 = true;
    }
}
