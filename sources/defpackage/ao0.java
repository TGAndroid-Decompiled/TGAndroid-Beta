package defpackage;

import android.graphics.Canvas;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
public final class ao0 extends ny0 implements fn7 {
    public final ArrayList S1;
    public final List T1;
    public final List U1;
    public final List V1;
    public final TLRPC.Chat W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final ArrayList a2;
    public km0 b2;
    public int c2;
    public int d2;
    public int e2;
    public boolean f2;
    public int g2;
    public long h2;
    public int i2;
    public int j2;
    public long k2;
    public final o8 l2;
    public qx6 m2;
    public int n2;
    public zm0 o2;
    public final TL_stories.PrepaidGiveaway p2;
    public String q2;
    public boolean r2;
    public boolean s2;
    public final rn0 t2;

    public ao0(e eVar, long j, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(eVar, false);
        List asList;
        List asList2;
        this.S1 = new ArrayList();
        if (on0.j()) {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.T1 = asList;
        if (on0.j()) {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.U1 = asList2;
        this.V1 = Arrays.asList(750, 10000, 50000);
        this.X1 = new ArrayList();
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.a2 = new ArrayList();
        int i = pn0.w;
        this.c2 = 2;
        this.d2 = 0;
        int i2 = ky7.w;
        this.e2 = 0;
        this.g2 = 12;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime() + 259200000);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i3 = calendar.get(12);
        while (i3 % 5 != 0) {
            i3++;
        }
        calendar.set(12, i3);
        this.h2 = calendar.getTimeInMillis();
        this.i2 = 2;
        this.j2 = 2;
        this.q2 = "";
        this.s2 = true;
        this.t2 = new rn0(this, (byte) 0);
        this.p2 = prepaidGiveaway;
        this.u1 = 0.15f;
        this.v0 = false;
        this.w0 = false;
        this.T0 = false;
        this.u0 = 0;
        X0();
        ((ViewGroup.MarginLayoutParams) this.o1.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.o1.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i4 = pn0.w;
            this.c2 = 3;
        }
        zb3 zb3Var = new zb3();
        zb3Var.n(350L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        zb3Var.m = false;
        this.n1.setItemAnimator(zb3Var);
        d79 d79Var = this.n1;
        int i5 = this.u0;
        d79Var.setPadding(i5, 0, i5, hl.L(68.0f));
        this.n1.setOnScrollListener(new Object());
        this.n1.setOnItemClickListener(new l0(this, eVar, (byte) 1));
        TLRPC.Chat M0 = uc7.s1(this.a).M0(Long.valueOf(-j));
        this.W1 = M0;
        km0 km0Var = this.b2;
        ArrayList arrayList = this.S1;
        d79 d79Var2 = this.n1;
        sn0 sn0Var = new sn0(this);
        sn0 sn0Var2 = new sn0(this);
        sn0 sn0Var3 = new sn0(this);
        km0Var.e = arrayList;
        km0Var.w = M0;
        km0Var.f = d79Var2;
        km0Var.h = sn0Var;
        km0Var.n = sn0Var2;
        km0Var.s = sn0Var3;
        g1(false, false);
        o8 o8Var = new o8(getContext(), this.J0);
        this.l2 = o8Var;
        o8Var.setOnClickListener(new yn0(this, prepaidGiveaway, j, eVar));
        f1(false);
        this.b.addView(o8Var, tre.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        on0.l(this.a, M0, new tn0(this, (byte) 5));
        jn7.f(this.a).b(this, jn7.z3);
    }

    @Override
    public final c79 H0(d79 d79Var) {
        km0 km0Var = new km0(this.J0);
        this.b2 = km0Var;
        return km0Var;
    }

    @Override
    public final CharSequence K0() {
        int i = this.d2;
        int i2 = pn0.w;
        if (i == 1) {
            return ob6.M0(2131749469, null);
        }
        return ob6.a0("BoostingStartGiveaway", null, 2131753186, new Object[0]);
    }

    @Override
    public final void N0(Canvas canvas, int i) {
        this.n2 = i;
    }

    public final ArrayList Z0(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption c1 = c1(j);
        if (c1 != null) {
            for (int i = 0; i < c1.winners.size(); i++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = c1.winners.get(i);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    public final int a1() {
        int i = this.c2;
        int i2 = pn0.w;
        if (i == 2) {
            return ((Integer) this.T1.get(this.i2)).intValue();
        }
        List d1 = d1();
        int i3 = this.j2;
        if (i3 < 0 || i3 >= d1.size()) {
            this.j2 = 0;
        }
        if (this.j2 >= d1.size()) {
            return 0;
        }
        return ((Integer) d1.get(this.j2)).intValue();
    }

    public final int b1() {
        int a1;
        int h;
        int i = this.c2;
        int i2 = pn0.w;
        if (i == 2) {
            a1 = ((Integer) this.T1.get(this.i2)).intValue();
            h = on0.h();
        } else {
            TL_stars.TL_starsGiveawayOption c1 = c1(this.k2);
            if (c1 != null) {
                return c1.yearly_boosts;
            }
            a1 = a1();
            h = on0.h();
        }
        return h * a1;
    }

    public final TL_stars.TL_starsGiveawayOption c1(long j) {
        ArrayList s = jxa.v(this.a, false).s();
        if (s != null) {
            for (int i = 0; i < s.size(); i++) {
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) s.get(i);
                if (tL_starsGiveawayOption != null && tL_starsGiveawayOption.stars == j) {
                    return tL_starsGiveawayOption;
                }
            }
            return null;
        }
        return null;
    }

    public final List d1() {
        int i = this.c2;
        int i2 = pn0.w;
        if (i == 2) {
            return this.T1;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption c1 = c1(this.k2);
        if (c1 != null) {
            for (int i3 = 0; i3 < c1.winners.size(); i3++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = c1.winners.get(i3);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        d79 d79Var;
        if (i == jn7.z3 && (d79Var = this.n1) != null && d79Var.H) {
            g1(true, true);
        }
    }

    @Override
    public final void dismiss() {
        zm0 zm0Var = this.o2;
        if (zm0Var != null) {
            zm0Var.run();
        }
        jn7.f(this.a).n(this, jn7.z3);
    }

    public final boolean e1() {
        if (this.p2 != null) {
            return true;
        }
        return false;
    }

    public final void f1(boolean z) {
        boolean z2;
        boolean e1 = e1();
        o8 o8Var = this.l2;
        if (e1) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.p2;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                o8Var.a(prepaidGiveaway.quantity, z);
                return;
            }
            o8Var.a(on0.h() * prepaidGiveaway.quantity, z);
            return;
        }
        int i = this.d2;
        int i2 = pn0.w;
        if (i == 0) {
            o8Var.a(b1(), z);
            return;
        }
        ArrayList arrayList = this.Y1;
        int h = on0.h() * arrayList.size();
        if (arrayList.size() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        o8Var.e = true;
        c51 c51Var = o8Var.a;
        c51Var.k();
        c51Var.setShowZero(true);
        c51Var.setEnabled(z2);
        c51Var.c(h, z);
        c51Var.i(ob6.M0(2131749469, null), z, true);
        yob.h(aob.h5, o8Var.c, o8Var.b);
    }

    public final void g1(boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao0.g1(boolean, boolean):void");
    }
}
