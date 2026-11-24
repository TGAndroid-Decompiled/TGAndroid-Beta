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
import org.telegram.ui.ActionBar.d;
public final class ap0 extends mz0 implements jm7 {
    public final ArrayList S1;
    public final List T1;
    public final List U1;
    public final List V1;
    public final TLRPC.Chat W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final ArrayList a2;
    public kn0 b2;
    public int c2;
    public int d2;
    public int e2;
    public boolean f2;
    public int g2;
    public long h2;
    public int i2;
    public int j2;
    public long k2;
    public final n8 l2;
    public hi2 m2;
    public int n2;
    public zn0 o2;
    public final TL_stories.PrepaidGiveaway p2;
    public String q2;
    public boolean r2;
    public boolean s2;
    public final ro0 t2;

    public ap0(d dVar, long j, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(dVar, false);
        List asList;
        List asList2;
        this.S1 = new ArrayList();
        if (oo0.j()) {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.T1 = asList;
        if (oo0.j()) {
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
        int i = po0.w;
        this.c2 = 2;
        this.d2 = 0;
        int i2 = ex7.w;
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
        this.t2 = new ro0(this, (byte) 0);
        this.p2 = prepaidGiveaway;
        this.u1 = 0.15f;
        this.v0 = false;
        this.w0 = false;
        this.T0 = false;
        this.u0 = 0;
        W0();
        ((ViewGroup.MarginLayoutParams) this.o1.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.o1.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i4 = po0.w;
            this.c2 = 3;
        }
        sc3 sc3Var = new sc3();
        sc3Var.n(350L);
        sc3Var.o(d53.h);
        sc3Var.C = false;
        sc3Var.m = false;
        this.n1.setItemAnimator(sc3Var);
        r59 r59Var = this.n1;
        int i5 = this.u0;
        r59Var.setPadding(i5, 0, i5, gm.L(68.0f));
        this.n1.setOnScrollListener(new Object());
        this.n1.setOnItemClickListener(new k0(this, dVar, (byte) 1));
        TLRPC.Chat L0 = oc7.r1(this.a).L0(Long.valueOf(-j));
        this.W1 = L0;
        kn0 kn0Var = this.b2;
        ArrayList arrayList = this.S1;
        r59 r59Var2 = this.n1;
        so0 so0Var = new so0(this);
        so0 so0Var2 = new so0(this);
        so0 so0Var3 = new so0(this);
        kn0Var.e = arrayList;
        kn0Var.w = L0;
        kn0Var.f = r59Var2;
        kn0Var.h = so0Var;
        kn0Var.n = so0Var2;
        kn0Var.s = so0Var3;
        f1(false, false);
        n8 n8Var = new n8(getContext(), this.J0);
        this.l2 = n8Var;
        n8Var.setOnClickListener(new yo0(this, prepaidGiveaway, j, dVar));
        e1(false);
        this.b.addView(n8Var, qoe.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        oo0.l(this.a, L0, new to0(this, (byte) 5));
        nm7.f(this.a).b(this, nm7.z3);
    }

    @Override
    public final q59 G0(r59 r59Var) {
        kn0 kn0Var = new kn0(this.J0);
        this.b2 = kn0Var;
        return kn0Var;
    }

    @Override
    public final CharSequence J0() {
        int i = this.d2;
        int i2 = po0.w;
        if (i == 1) {
            return jb6.M0(2131749457, null);
        }
        return jb6.a0("BoostingStartGiveaway", null, 2131753158, new Object[0]);
    }

    @Override
    public final void M0(Canvas canvas, int i) {
        this.n2 = i;
    }

    public final ArrayList Y0(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption b1 = b1(j);
        if (b1 != null) {
            for (int i = 0; i < b1.winners.size(); i++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = b1.winners.get(i);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    public final int Z0() {
        int i = this.c2;
        int i2 = po0.w;
        if (i == 2) {
            return ((Integer) this.T1.get(this.i2)).intValue();
        }
        List c1 = c1();
        int i3 = this.j2;
        if (i3 < 0 || i3 >= c1.size()) {
            this.j2 = 0;
        }
        if (this.j2 >= c1.size()) {
            return 0;
        }
        return ((Integer) c1.get(this.j2)).intValue();
    }

    public final int a1() {
        int Z0;
        int h;
        int i = this.c2;
        int i2 = po0.w;
        if (i == 2) {
            Z0 = ((Integer) this.T1.get(this.i2)).intValue();
            h = oo0.h();
        } else {
            TL_stars.TL_starsGiveawayOption b1 = b1(this.k2);
            if (b1 != null) {
                return b1.yearly_boosts;
            }
            Z0 = Z0();
            h = oo0.h();
        }
        return h * Z0;
    }

    public final TL_stars.TL_starsGiveawayOption b1(long j) {
        ArrayList s = jva.v(this.a, false).s();
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

    public final List c1() {
        int i = this.c2;
        int i2 = po0.w;
        if (i == 2) {
            return this.T1;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption b1 = b1(this.k2);
        if (b1 != null) {
            for (int i3 = 0; i3 < b1.winners.size(); i3++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = b1.winners.get(i3);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    public final boolean d1() {
        if (this.p2 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        r59 r59Var;
        if (i == nm7.z3 && (r59Var = this.n1) != null && r59Var.H) {
            f1(true, true);
        }
    }

    @Override
    public final void dismiss() {
        zn0 zn0Var = this.o2;
        if (zn0Var != null) {
            zn0Var.run();
        }
        nm7.f(this.a).n(this, nm7.z3);
    }

    public final void e1(boolean z) {
        boolean z2;
        boolean d1 = d1();
        n8 n8Var = this.l2;
        if (d1) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.p2;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                n8Var.a(prepaidGiveaway.quantity, z);
                return;
            }
            n8Var.a(oo0.h() * prepaidGiveaway.quantity, z);
            return;
        }
        int i = this.d2;
        int i2 = po0.w;
        if (i == 0) {
            n8Var.a(a1(), z);
            return;
        }
        ArrayList arrayList = this.Y1;
        int h = oo0.h() * arrayList.size();
        if (arrayList.size() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        n8Var.e = true;
        b61 b61Var = n8Var.a;
        b61Var.k();
        b61Var.setShowZero(true);
        b61Var.setEnabled(z2);
        b61Var.c(h, z);
        b61Var.i(jb6.M0(2131749457, null), z, true);
        anb.h(cmb.g5, n8Var.c, n8Var.b);
    }

    public final void f1(boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap0.f1(boolean, boolean):void");
    }
}
