package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
public final class u19 extends fy0 {
    public final ArrayList S1;
    public final ArrayList T1;
    public final TLRPC.Chat U1;
    public final ez4 V1;
    public t19 W1;
    public p19 X1;

    public u19(d dVar, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
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
            if (peer != null && cf3.n(peer) != (-chat.id)) {
                this.T1.add(tL_myBoost2);
            }
        }
        dr0 dr0Var = new dr0(getContext(), this.J0, this.n1);
        dr0Var.setClickable(true);
        dr0Var.setOrientation(1);
        dr0Var.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        zkb.h(bkb.g5, this.J0, dr0Var);
        ez4 ez4Var = new ez4(getContext(), this.J0);
        this.V1 = ez4Var;
        ez4Var.k();
        ez4Var.setCounterColor(-6785796);
        ez4Var.setOnClickListener(new v16(this, chat, (byte) 29));
        dr0Var.addView(ez4Var, nme.r(-1, 48, 87));
        ViewGroup viewGroup = this.b;
        int i2 = this.u0;
        viewGroup.addView(dr0Var, nme.f(-2.0f, -1, 87, i2, 0, i2, 0));
        o39 o39Var = this.n1;
        int i3 = this.u0;
        o39Var.setPadding(i3, 0, i3, gl.L(64.0f));
        this.n1.setOnItemClickListener(new k0(this, chat, (byte) 20));
        K();
        W0();
        Y0(false);
        m21.a(this.c, new Object());
    }

    @Override
    public final n39 G0(o39 o39Var) {
        return new q19(this);
    }

    @Override
    public final CharSequence J0() {
        return k96.M0(2131753318, null);
    }

    public final void Y0(boolean z) {
        ez4 ez4Var = this.V1;
        boolean z2 = false;
        ez4Var.setShowZero(false);
        ArrayList arrayList = this.S1;
        if (arrayList.size() > 1) {
            ez4Var.i(k96.M0(2131753313, null), z, true);
        } else {
            ez4Var.i(k96.M0(2131753318, null), z, true);
        }
        ez4Var.c(arrayList.size(), z);
        if (arrayList.size() > 0) {
            z2 = true;
        }
        ez4Var.setEnabled(z2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.X1 = new p19(this);
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
