package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
public final class j59 extends ny0 {
    public final ArrayList S1;
    public final ArrayList T1;
    public final TLRPC.Chat U1;
    public final i15 V1;
    public i59 W1;
    public e59 X1;

    public j59(e eVar, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
        super(eVar, false);
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
            if (peer != null && wf3.n(peer) != (-chat.id)) {
                this.T1.add(tL_myBoost2);
            }
        }
        dr0 dr0Var = new dr0(getContext(), this.J0, this.n1);
        dr0Var.setClickable(true);
        dr0Var.setOrientation(1);
        dr0Var.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        yob.h(aob.h5, this.J0, dr0Var);
        i15 i15Var = new i15(getContext(), this.J0);
        this.V1 = i15Var;
        i15Var.k();
        i15Var.setCounterColor(-6785796);
        i15Var.setOnClickListener(new jy8(this, chat, (byte) 2));
        dr0Var.addView(i15Var, tre.r(-1, 48, 87));
        ViewGroup viewGroup = this.b;
        int i2 = this.u0;
        viewGroup.addView(dr0Var, tre.f(-2.0f, -1, 87, i2, 0, i2, 0));
        d79 d79Var = this.n1;
        int i3 = this.u0;
        d79Var.setPadding(i3, 0, i3, hl.L(64.0f));
        this.n1.setOnItemClickListener(new l0(this, chat, (byte) 20));
        J();
        X0();
        Z0(false);
        v21.a(this.c, new Object());
    }

    @Override
    public final c79 H0(d79 d79Var) {
        return new f59(this);
    }

    @Override
    public final CharSequence K0() {
        return ob6.M0(2131753314, null);
    }

    public final void Z0(boolean z) {
        i15 i15Var = this.V1;
        boolean z2 = false;
        i15Var.setShowZero(false);
        ArrayList arrayList = this.S1;
        if (arrayList.size() > 1) {
            i15Var.i(ob6.M0(2131753309, null), z, true);
        } else {
            i15Var.i(ob6.M0(2131753314, null), z, true);
        }
        i15Var.c(arrayList.size(), z);
        if (arrayList.size() > 0) {
            z2 = true;
        }
        i15Var.setEnabled(z2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.X1 = new e59(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.X1.cancel();
    }

    @Override
    public final void x() {
        this.X1.start();
    }
}
