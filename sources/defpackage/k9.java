package defpackage;

import android.content.Context;
import android.util.LongSparseArray;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class k9 extends ny0 implements mv4 {
    public final b8c S1;
    public final LongSparseArray T1;
    public ArrayList U1;
    public boolean V1;
    public l9c W1;
    public int X1;

    public k9(Context context) {
        super(context, null, false, false, 2, null);
        this.T1 = new LongSparseArray();
        this.U1 = new ArrayList();
        int i = 0;
        int w0 = aob.w0(null, aob.a7, false);
        this.X1 = w0;
        s0(w0);
        ov4.c(this.a).f.add(this);
        this.F1 = false;
        this.E1 = hl.L(12.0f);
        J();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.S1 = b8c.j(-1, linearLayout);
        this.n1.setPadding(this.u0, hl.L(9.0f), this.u0, hl.L(9.0f));
        this.n1.setOverScrollMode(2);
        this.W1.O(false);
        ArrayList arrayList = ov4.c(this.a).c;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            kv4 kv4Var = (kv4) obj;
            j9 j9Var = new j9(context, kv4Var);
            j9Var.a.setOnClickListener(new c0(this, context, kv4Var, (byte) 1));
            linearLayout.addView(j9Var, tre.o(-1, -2));
            this.T1.put(kv4Var.b, j9Var);
        }
        c(arrayList);
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(this.n1, getContext(), this.a, 0, true, new c(this, (byte) 4), this.J0);
        this.W1 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        ArrayList arrayList = this.U1;
        if (arrayList == null) {
            return null;
        }
        return ob6.a0(null, null, 2131750379, Integer.valueOf(arrayList.size()));
    }

    @Override
    public final void c(ArrayList arrayList) {
        int i;
        this.U1 = new ArrayList(arrayList);
        this.o1.setTitle(K0());
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            kv4 kv4Var = (kv4) obj;
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = kv4Var.f;
            if (tL_starGiftAuctionState != null) {
                i = tL_starGiftAuctionState.next_round_at;
            } else {
                i = 0;
            }
            j9 j9Var = (j9) this.T1.get(kv4Var.b);
            if (j9Var != null) {
                j9Var.b(this.V1);
                long max = Math.max(0, i - ConnectionsManager.getInstance(this.a).getCurrentTime());
                j9Var.a(max, this.V1);
                j9Var.f.a(max);
            }
        }
    }

    @Override
    public final void dismiss() {
        ov4.c(this.a).f.remove(this);
        super.dismiss();
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            int w0 = aob.w0(null, aob.a7, false);
            if (w0 != this.X1) {
                this.X1 = w0;
                s0(w0);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void x() {
        this.V1 = true;
    }
}
