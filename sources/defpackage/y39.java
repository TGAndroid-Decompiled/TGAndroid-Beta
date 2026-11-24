package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
public final class y39 extends mz0 {
    public final ArrayList S1;
    public final ArrayList T1;
    public final TLRPC.Chat U1;
    public final d15 V1;
    public x39 W1;
    public t39 X1;

    public y39(d dVar, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
        super(dVar, false);
        this.S1 = new ArrayList();
        this.T1 = new ArrayList();
        this.u1 = 0.3f;
        this.U1 = chat;
        ArrayList<TL_stories.TL_myBoost> arrayList = tL_premium_myBoosts.my_boosts;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TL_stories.TL_myBoost tL_myBoost = arrayList.get(i);
            i++;
            TL_stories.TL_myBoost tL_myBoost2 = tL_myBoost;
            TLRPC.Peer peer = tL_myBoost2.peer;
            if (peer != null && pg3.n(peer) != (-chat.id)) {
                this.T1.add(tL_myBoost2);
            }
        }
        ds0 ds0Var = new ds0(getContext(), this.J0, this.n1);
        ds0Var.setClickable(true);
        ds0Var.setOrientation(1);
        ds0Var.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        anb.h(cmb.g5, this.J0, ds0Var);
        d15 d15Var = new d15(getContext(), this.J0);
        this.V1 = d15Var;
        d15Var.k();
        d15Var.setCounterColor(-6785796);
        d15Var.setOnClickListener(new r39(this, chat, (byte) 0));
        ds0Var.addView(d15Var, qoe.r(-1, 48, 87));
        ViewGroup viewGroup = this.b;
        int i2 = this.u0;
        viewGroup.addView(ds0Var, qoe.f(-2.0f, -1, 87, i2, 0, i2, 0));
        r59 r59Var = this.n1;
        int i3 = this.u0;
        r59Var.setPadding(i3, 0, i3, gm.L(64.0f));
        this.n1.setOnItemClickListener(new k0(this, chat, (byte) 20));
        J();
        W0();
        Y0(false);
        u31.a(this.c, new Object());
    }

    @Override
    public final q59 G0(r59 r59Var) {
        return new u39(this);
    }

    @Override
    public final CharSequence J0() {
        return jb6.M0(2131753286, null);
    }

    public final void Y0(boolean z) {
        d15 d15Var = this.V1;
        boolean z2 = false;
        d15Var.setShowZero(false);
        ArrayList arrayList = this.S1;
        if (arrayList.size() > 1) {
            d15Var.i(jb6.M0(2131753281, null), z, true);
        } else {
            d15Var.i(jb6.M0(2131753286, null), z, true);
        }
        d15Var.c(arrayList.size(), z);
        if (arrayList.size() > 0) {
            z2 = true;
        }
        d15Var.setEnabled(z2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.X1 = new t39(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.X1.cancel();
    }

    @Override
    public final void w() {
        this.X1.start();
    }
}
