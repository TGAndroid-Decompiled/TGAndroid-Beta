package mg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.o5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.m10;
import w7.b6;
public final class o1 extends ha {
    public final ArrayList P1;
    public final ArrayList Q1;
    public final TLRPC.Chat R1;
    public final z0 S1;
    public n1 T1;
    public h1 U1;

    public o1(k2 k2Var, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
        super(k2Var, false);
        this.P1 = new ArrayList();
        this.Q1 = new ArrayList();
        this.f26672r1 = 0.3f;
        this.R1 = chat;
        ArrayList<TL_stories.TL_myBoost> arrayList = tL_premium_myBoosts.my_boosts;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_stories.TL_myBoost tL_myBoost = arrayList.get(i10);
            i10++;
            TL_stories.TL_myBoost tL_myBoost2 = tL_myBoost;
            TLRPC.Peer peer = tL_myBoost2.peer;
            if (peer != null && o5.o(peer) != (-chat.f19793id)) {
                this.Q1.add(tL_myBoost2);
            }
        }
        m10 m10Var = new m10(getContext(), this.I0, this.f26666k1);
        m10Var.setClickable(true);
        m10Var.setOrientation(1);
        m10Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        a7.i(t6.f21001h5, m10Var, this.I0);
        z0 z0Var = new z0(getContext(), this.I0);
        this.S1 = z0Var;
        z0Var.k();
        z0Var.setCounterColor(-6785796);
        z0Var.setOnClickListener(new ag.t0(8, this, chat));
        m10Var.addView(z0Var, b6.r(-1, 48, 87));
        ViewGroup viewGroup = this.f21586b;
        int i11 = this.f21615t0;
        viewGroup.addView(m10Var, b6.f(-2.0f, -1, 87, i11, 0, i11, 0));
        tk0 tk0Var = this.f26666k1;
        int i12 = this.f21615t0;
        tk0Var.setPadding(i12, 0, i12, org.telegram.messenger.i0.L(64.0f));
        this.f26666k1.setOnItemClickListener(new q0(1, this, chat));
        O();
        b1();
        d1(false);
        wb.a(this.f21589c, new Object());
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        return new i1(this);
    }

    @Override
    public final CharSequence O0() {
        return cd.L0(2131753321, null);
    }

    public final void d1(boolean z10) {
        z0 z0Var = this.S1;
        boolean z11 = false;
        z0Var.setShowZero(false);
        ArrayList arrayList = this.P1;
        if (arrayList.size() > 1) {
            z0Var.i(cd.L0(2131753316, null), z10, true);
        } else {
            z0Var.i(cd.L0(2131753321, null), z10, true);
        }
        z0Var.c(arrayList.size(), z10);
        if (arrayList.size() > 0) {
            z11 = true;
        }
        z0Var.setEnabled(z11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U1 = new h1(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U1.cancel();
    }

    @Override
    public final void w() {
        this.U1.start();
    }
}
