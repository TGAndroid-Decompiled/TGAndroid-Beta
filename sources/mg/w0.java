package mg;

import android.graphics.Canvas;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.telegram.messenger.cd;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import rh.e6;
import w7.b6;
public final class w0 extends ha implements us {
    public final ArrayList P1;
    public final List Q1;
    public final List R1;
    public final List S1;
    public final TLRPC.Chat T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public ng.b Y1;
    public int Z1;
    public int a2;
    public int f13265b2;
    public boolean f13266c2;
    public int f13267d2;
    public long f13268e2;
    public int f13269f2;
    public int f13270g2;
    public long f13271h2;
    public final og.a f13272i2;
    public m4.c f13273j2;
    public int f13274k2;
    public q f13275l2;
    public final TL_stories.PrepaidGiveaway f13276m2;
    public String f13277n2;
    public boolean f13278o2;
    public boolean f13279p2;
    public final l0 f13280q2;

    public w0(k2 k2Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(k2Var, false);
        List asList;
        List asList2;
        this.P1 = new ArrayList();
        if (k0.h()) {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.Q1 = asList;
        if (k0.h()) {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.R1 = asList2;
        this.S1 = Arrays.asList(750, 10000, 50000);
        this.U1 = new ArrayList();
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
        int i10 = og.e.f14184w;
        this.Z1 = 2;
        this.a2 = 0;
        int i11 = og.w.f14232w;
        this.f13265b2 = 0;
        this.f13267d2 = 12;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime() + 259200000);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i12 = calendar.get(12);
        while (i12 % 5 != 0) {
            i12++;
        }
        calendar.set(12, i12);
        this.f13268e2 = calendar.getTimeInMillis();
        this.f13269f2 = 2;
        this.f13270g2 = 2;
        this.f13277n2 = "";
        this.f13279p2 = true;
        this.f13280q2 = new l0(this, 0);
        this.f13276m2 = prepaidGiveaway;
        this.f26672r1 = 0.15f;
        this.f21616u0 = false;
        this.f21617v0 = false;
        this.T0 = false;
        this.f21615t0 = 0;
        b1();
        ((ViewGroup.MarginLayoutParams) this.l1.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.l1.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i13 = og.e.f14184w;
            this.Z1 = 3;
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(gr.h);
        jVar.C = false;
        jVar.f47927m = false;
        this.f26666k1.setItemAnimator(jVar);
        tk0 tk0Var = this.f26666k1;
        int i14 = this.f21615t0;
        tk0Var.setPadding(i14, 0, i14, org.telegram.messenger.i0.L(68.0f));
        this.f26666k1.setOnScrollListener(new Object());
        this.f26666k1.setOnItemClickListener(new q0(0, this, k2Var));
        TLRPC.Chat L0 = vp.r1(this.f21583a).L0(Long.valueOf(-j10));
        this.T1 = L0;
        ng.b bVar = this.Y1;
        ArrayList arrayList = this.P1;
        tk0 tk0Var2 = this.f26666k1;
        m0 m0Var = new m0(this);
        m0 m0Var2 = new m0(this);
        m0 m0Var3 = new m0(this);
        bVar.e = arrayList;
        bVar.f13766w = L0;
        bVar.f13762f = tk0Var2;
        bVar.h = m0Var;
        bVar.f13763n = m0Var2;
        bVar.f13765s = m0Var3;
        k1(false, false);
        og.a aVar = new og.a(getContext(), this.I0);
        this.f13272i2 = aVar;
        aVar.setOnClickListener(new u0(this, prepaidGiveaway, j10, k2Var));
        j1(false);
        this.f21586b.addView(aVar, b6.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        k0.j(this.f21583a, L0, new o0(this, 5));
        zs.f(this.f21583a).c(this, zs.f19721x3);
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        ng.b bVar = new ng.b(this.I0);
        this.Y1 = bVar;
        return bVar;
    }

    @Override
    public final CharSequence O0() {
        int i10 = this.a2;
        int i11 = og.e.f14184w;
        if (i10 == 1) {
            return cd.L0(2131749689, null);
        }
        return cd.a0("BoostingStartGiveaway", null, 2131753193, new Object[0]);
    }

    @Override
    public final void R0(Canvas canvas, int i10) {
        this.f13274k2 = i10;
    }

    public final ArrayList d1(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption g12 = g1(j10);
        if (g12 != null) {
            for (int i10 = 0; i10 < g12.winners.size(); i10++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = g12.winners.get(i10);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        tk0 tk0Var;
        if (i10 == zs.f19721x3 && (tk0Var = this.f26666k1) != null && tk0Var.G) {
            k1(true, true);
        }
    }

    @Override
    public final void dismiss() {
        q qVar = this.f13275l2;
        if (qVar != null) {
            qVar.run();
        }
        zs.f(this.f21583a).n(this, zs.f19721x3);
    }

    public final int e1() {
        int i10 = this.Z1;
        int i11 = og.e.f14184w;
        if (i10 == 2) {
            return ((Integer) this.Q1.get(this.f13269f2)).intValue();
        }
        List h12 = h1();
        int i12 = this.f13270g2;
        if (i12 < 0 || i12 >= h12.size()) {
            this.f13270g2 = 0;
        }
        if (this.f13270g2 >= h12.size()) {
            return 0;
        }
        return ((Integer) h12.get(this.f13270g2)).intValue();
    }

    public final int f1() {
        int e12;
        int g10;
        int i10 = this.Z1;
        int i11 = og.e.f14184w;
        if (i10 == 2) {
            e12 = ((Integer) this.Q1.get(this.f13269f2)).intValue();
            g10 = k0.g();
        } else {
            TL_stars.TL_starsGiveawayOption g12 = g1(this.f13271h2);
            if (g12 != null) {
                return g12.yearly_boosts;
            }
            e12 = e1();
            g10 = k0.g();
        }
        return g10 * e12;
    }

    public final TL_stars.TL_starsGiveawayOption g1(long j10) {
        ArrayList v = e6.y(this.f21583a, false).v();
        if (v != null) {
            for (int i10 = 0; i10 < v.size(); i10++) {
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i10);
                if (tL_starsGiveawayOption != null && tL_starsGiveawayOption.stars == j10) {
                    return tL_starsGiveawayOption;
                }
            }
            return null;
        }
        return null;
    }

    public final List h1() {
        int i10 = this.Z1;
        int i11 = og.e.f14184w;
        if (i10 == 2) {
            return this.Q1;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption g12 = g1(this.f13271h2);
        if (g12 != null) {
            for (int i12 = 0; i12 < g12.winners.size(); i12++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = g12.winners.get(i12);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    public final boolean i1() {
        if (this.f13276m2 != null) {
            return true;
        }
        return false;
    }

    public final void j1(boolean z10) {
        boolean z11;
        boolean i12 = i1();
        og.a aVar = this.f13272i2;
        if (i12) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f13276m2;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            }
            aVar.a(k0.g() * prepaidGiveaway.quantity, z10);
            return;
        }
        int i10 = this.a2;
        int i11 = og.e.f14184w;
        if (i10 == 0) {
            aVar.a(f1(), z10);
            return;
        }
        ArrayList arrayList = this.V1;
        int g10 = k0.g() * arrayList.size();
        if (arrayList.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.e = true;
        vh.d dVar = aVar.f14165a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.c(g10, z10);
        dVar.i(cd.L0(2131749689, null), z10, true);
        a7.i(t6.f21001h5, aVar.f14166b, aVar.f14167c);
    }

    public final void k1(boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: mg.w0.k1(boolean, boolean):void");
    }
}
