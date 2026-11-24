package defpackage;

import android.content.Context;
import android.util.LongSparseArray;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class j9 extends mz0 implements jv4 {
    public final c6c S1;
    public final LongSparseArray T1;
    public ArrayList U1;
    public boolean V1;
    public l7c W1;
    public int X1;

    public j9(Context context) {
        super(context, null, false, false, 2, null);
        this.T1 = new LongSparseArray();
        this.U1 = new ArrayList();
        int i = 0;
        int w0 = cmb.w0(null, cmb.Z6, false);
        this.X1 = w0;
        s0(w0);
        lv4.c(this.a).f.add(this);
        this.F1 = false;
        this.E1 = gm.L(12.0f);
        J();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.S1 = c6c.j(-1, linearLayout);
        this.n1.setPadding(this.u0, gm.L(9.0f), this.u0, gm.L(9.0f));
        this.n1.setOverScrollMode(2);
        this.W1.O(false);
        ArrayList arrayList = lv4.c(this.a).c;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hv4 hv4Var = (hv4) obj;
            i9 i9Var = new i9(context, hv4Var);
            i9Var.a.setOnClickListener(new b0(this, context, hv4Var, (byte) 1));
            linearLayout.addView(i9Var, qoe.o(-1, -2));
            this.T1.put(hv4Var.b, i9Var);
        }
        c(arrayList);
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(this.n1, getContext(), this.a, 0, true, new f(this, (byte) 4), this.J0);
        this.W1 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        ArrayList arrayList = this.U1;
        if (arrayList == null) {
            return null;
        }
        return jb6.a0(null, null, 2131750351, Integer.valueOf(arrayList.size()));
    }

    @Override
    public final void c(ArrayList arrayList) {
        int i;
        this.U1 = new ArrayList(arrayList);
        this.o1.setTitle(J0());
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            hv4 hv4Var = (hv4) obj;
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = hv4Var.f;
            if (tL_starGiftAuctionState != null) {
                i = tL_starGiftAuctionState.next_round_at;
            } else {
                i = 0;
            }
            i9 i9Var = (i9) this.T1.get(hv4Var.b);
            if (i9Var != null) {
                i9Var.b(this.V1);
                long max = Math.max(0, i - ConnectionsManager.getInstance(this.a).getCurrentTime());
                i9Var.a(max, this.V1);
                i9Var.f.a(max);
            }
        }
    }

    @Override
    public final void dismiss() {
        lv4.c(this.a).f.remove(this);
        super.dismiss();
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            int w0 = cmb.w0(null, cmb.Z6, false);
            if (w0 != this.X1) {
                this.X1 = w0;
                s0(w0);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void w() {
        this.V1 = true;
    }
}
