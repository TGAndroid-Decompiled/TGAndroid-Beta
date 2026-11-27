package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class uy extends ny0 implements nv4 {
    public final long S1;
    public final b8c T1;
    public final ie0 U1;
    public final ub V1;
    public final by2 W1;
    public final oy X1;
    public final tt Y1;
    public final tt Z1;
    public final tt a2;
    public final mf5 b2;
    public final in c2;
    public final sy d2;
    public final sy[] e2;
    public final FrameLayout f2;
    public kv4 g2;
    public final ty h2;
    public Runnable i2;
    public long j2;
    public long k2;
    public boolean l2;
    public final wm2[] m2;
    public hm n2;
    public final fm0 o2;
    public final fm0 p2;
    public final wm2[] q2;
    public boolean r2;
    public l9c s2;
    public boolean t2;
    public boolean u2;

    public uy(Context context, vnb vnbVar, ty tyVar, kv4 kv4Var) {
        super(context, null, false, false, 2, vnbVar);
        long j;
        int i;
        boolean z;
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        this.e2 = new sy[3];
        this.l2 = true;
        this.m2 = new wm2[1];
        iy iyVar = new iy(this);
        k43 k43Var = k43.h;
        this.o2 = new fm0(0, iyVar, k43Var, 380L, false);
        this.p2 = new fm0(0, new iy(this), k43Var, 380L, false);
        this.q2 = new wm2[1];
        this.g2 = kv4Var;
        this.h2 = tyVar;
        long j2 = kv4Var.b;
        this.S1 = j2;
        this.L1 = true;
        this.u1 = 0.2f;
        kv4 l = ov4.c(this.a).l(j2, this);
        this.W1 = new by2(new iy(this));
        this.F1 = false;
        this.E1 = hl.L(12.0f);
        J();
        fz.Z0(this.o1, context, vnbVar, l.d);
        TLRPC.User X1 = uc7.s1(this.a).X1(Long.valueOf(yac.h(this.a).e()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.T1 = b8c.j(-1, linearLayout);
        oy oyVar = new oy(this, context, vnbVar);
        this.X1 = oyVar;
        oyVar.P = true;
        this.g2.e();
        kv4 kv4Var2 = this.g2;
        long j3 = kv4Var2.e.bid_amount;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = kv4Var2.f;
        if (tL_starGiftAuctionState != null && (arrayList = tL_starGiftAuctionState.bid_levels) != null && !arrayList.isEmpty()) {
            j = kv4Var2.f.bid_levels.get(0).amount;
        } else {
            j = 0;
        }
        if (j > 100000) {
            i = ((((int) j) * 3) / 2000) * 1000;
        } else if (j > 30000) {
            i = 100000;
        } else {
            i = 50000;
        }
        int i2 = 15;
        int[] iArr = {50, 100, 500, 1000, 2000, 5000, 7500, 10000, 25000, 50000, 100000, 500000, 1000000, 5000000, 10000000};
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i4 = iArr[i3];
            if (i4 < 50) {
                z2 = true;
            } else {
                z2 = i4 == 50 ? false : z2;
                if (i4 > i) {
                    arrayList2.add(Integer.valueOf(i));
                    break;
                }
                arrayList2.add(Integer.valueOf(i4));
                if (iArr[i3] == i) {
                    break;
                }
            }
            i3++;
            i2 = 15;
        }
        if (z2) {
            arrayList2.add(0, 50);
        }
        if (arrayList2.size() < 2) {
            arrayList2.clear();
            arrayList2.add(1);
            arrayList2.add(10000);
        }
        int[] iArr2 = new int[arrayList2.size()];
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            iArr2[i5] = ((Integer) arrayList2.get(i5)).intValue();
        }
        oy oyVar2 = this.X1;
        oyVar2.f0 = iArr2;
        linearLayout.addView(oyVar2, tre.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        tt ttVar = new tt(context, vnbVar, (byte) 1);
        this.Y1 = ttVar;
        int L = hl.L(12.0f);
        int i6 = aob.a7;
        int v0 = aob.v0(i6, this.J0);
        int k = vm2.k(aob.v0(aob.i6, this.J0), aob.v0(i6, this.J0));
        hf0 i0 = aob.i0(L, L, L, L, v0, k, k);
        uob M = yob.M(i6);
        ttVar.setBackground(i0);
        yob.j(ttVar, i0, M, null, vnbVar);
        ttVar.setOnClickListener(new jy(this, (byte) 2));
        ((TextView) ttVar.c).setText(ob6.M0(2131750336, null));
        tt ttVar2 = new tt(context, vnbVar, (byte) 1);
        this.Z1 = ttVar2;
        ShapeDrawable b0 = aob.b0(hl.L(12.0f), aob.v0(i6, this.J0));
        uob M2 = yob.M(i6);
        ttVar2.setBackground(b0);
        yob.j(ttVar2, b0, M2, null, vnbVar);
        ((TextView) ttVar2.c).setText(ob6.M0(2131750334, null));
        tt ttVar3 = new tt(context, vnbVar, (byte) 1);
        this.a2 = ttVar3;
        ShapeDrawable b02 = aob.b0(hl.L(12.0f), aob.v0(i6, this.J0));
        uob M3 = yob.M(i6);
        ttVar3.setBackground(b02);
        yob.j(ttVar3, b02, M3, null, vnbVar);
        ((TextView) ttVar3.c).setText(ob6.M0(2131750337, null));
        linearLayout2.addView(ttVar, tre.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), tre.l(0.0f, 10, -1));
        linearLayout2.addView(ttVar2, tre.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), tre.l(0.0f, 10, -1));
        linearLayout2.addView(ttVar3, tre.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, tre.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (l.e.acquired_count > 0) {
            p66 p66Var = new p66(context, vnbVar);
            p66Var.setGravity(17);
            p66Var.setTextSize(1, 16.0f);
            int i7 = aob.J6;
            yob.X(p66Var, i7, vnbVar);
            yob.G(p66Var, i7, vnbVar);
            p66Var.setOnClickListener(new c0(this, new boolean[1], vnbVar, (byte) 7));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new hm(l.c, p66Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            p66Var.setText(TextUtils.concat(hl.E2(ob6.F("Gift2AuctionsItemsBought2", l.e.acquired_count, spannableStringBuilder), true, hl.L(2.6666667f), hl.L(1.0f))));
            iye.b(p66Var, 0.02f, 1.5f);
            linearLayout.addView(p66Var, tre.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i8 = aob.L6;
        mf5 mf5Var = new mf5(context, i8, 21, 0, 0, false, true, vnbVar);
        this.b2 = mf5Var;
        linearLayout.addView(mf5Var, tre.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        in inVar = new in(context, false, false, false);
        this.c2 = inVar;
        inVar.setTextSize(hl.L(12.5f));
        inVar.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        inVar.setSizeableBackground(aob.Z(0, 0, 9, 9));
        inVar.setHideBackgroundIfEmpty(true);
        mf5Var.setOnWidthUpdateListener(new c1(this, (byte) 27));
        mf5Var.addView(inVar, tre.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        sy syVar = new sy(context, vnbVar);
        this.d2 = syVar;
        in inVar2 = syVar.b;
        yob.q(inVar2);
        inVar2.setTextColor(aob.v0(i8, this.J0));
        syVar.b(X1);
        linearLayout.addView(syVar, tre.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        mf5 mf5Var2 = new mf5(context, i8, 21, 15, 0, false, false, vnbVar);
        mf5Var2.setText(ob6.M0(2131750281, null));
        linearLayout.addView(mf5Var2, tre.o(-1, -2));
        int i9 = 0;
        while (true) {
            sy[] syVarArr = this.e2;
            if (i9 >= syVarArr.length) {
                break;
            }
            syVarArr[i9] = new sy(context, vnbVar);
            int i10 = i9 + 1;
            this.e2[i9].a(i10, true, false);
            this.e2[i9].setBackground(aob.L0(false));
            sy syVar2 = this.e2[i9];
            if (i9 < 2) {
                z = true;
            } else {
                z = false;
            }
            syVar2.f = z;
            syVar2.setOnClickListener(new y00((byte) 1));
            linearLayout.addView(this.e2[i9], tre.o(-1, -2));
            i9 = i10;
        }
        ub ubVar = new ub(context, true, vnbVar, (byte) 1);
        this.V1 = ubVar;
        ubVar.f();
        FrameLayout.LayoutParams d = tre.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i11 = d.leftMargin;
        int i12 = this.u0;
        d.leftMargin = i11 + i12;
        d.rightMargin += i12;
        this.b.addView(ubVar, d);
        d79 d79Var = this.n1;
        int i13 = this.u0;
        d79Var.setPadding(i13, 0, i13, hl.L(64.0f));
        this.n1.setOnItemClickListener(new m5((byte) 0));
        long j4 = l.e.bid_amount;
        int i14 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
        oy oyVar3 = this.X1;
        if (i14 > 0) {
            oyVar3.setValue((int) j4);
        } else {
            oyVar3.setValue((int) l.e());
        }
        j1(false);
        this.n1.setOverScrollMode(2);
        ie0 ie0Var = new ie0(this.a, vnbVar, context);
        this.U1 = ie0Var;
        ie0Var.setScaleX(0.6f);
        ie0Var.setScaleY(0.6f);
        ie0Var.setAlpha(0.0f);
        ie0Var.setEnabled(false);
        ie0Var.setClickable(false);
        this.c.addView(ie0Var, tre.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        iye.a(ie0Var);
        ie0Var.setOnClickListener(new ly(context, vnbVar, (byte) 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f2 = frameLayout;
        this.c.addView(frameLayout, tre.e(-1, 100, 48));
        f1();
        this.s2.O(false);
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(this.n1, getContext(), this.a, 0, true, new c(this, (byte) 10), this.J0);
        this.s2 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return ob6.M0(2131750305, null);
    }

    public final void Z0() {
        boolean z;
        float f;
        if (this.r2 && !this.J) {
            z = true;
        } else {
            z = false;
        }
        if (this.t2 != z) {
            this.t2 = z;
            ie0 ie0Var = this.U1;
            if (ie0Var != null) {
                ie0Var.setEnabled(z);
                ie0Var.setClickable(z);
                ViewPropertyAnimator animate = ie0Var.animate();
                float f2 = 0.6f;
                float f3 = 1.0f;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f);
                if (z) {
                    f2 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f2);
                if (!z) {
                    f3 = 0.0f;
                }
                ik8.s(scaleY, f3, 180L);
            }
        }
    }

    public final void a1() {
        oy oyVar = this.X1;
        int value = oyVar.getValue();
        if (oyVar.getProgress() > 0.99f) {
            oyVar.g(ob6.M0(2131750283, null));
            return;
        }
        long j = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.g2.e;
        long j2 = tL_StarGiftAuctionUserState.bid_amount;
        if (j == j2) {
            oyVar.g(ob6.M0(2131750278, null));
        } else if (j2 > 0 && !tL_StarGiftAuctionUserState.returned) {
            long j3 = j - j2;
            if (j3 > 0) {
                oyVar.g("+".concat(ob6.E(j3, ',')));
            } else {
                oyVar.g(null);
            }
        } else {
            oyVar.g(null);
        }
    }

    public final void b1(int i) {
        this.X1.f(eg5.b(this.a, i, 3), eg5.b(this.a, i, 4), true);
        h1(this.r2);
        i1(this.r2);
        e1(this.r2);
        a1();
    }

    public final void c1(int i) {
        long j;
        if (this.u2) {
            return;
        }
        long j2 = this.g2.e.bid_amount;
        if (j2 > 0) {
            j = i - j2;
        } else {
            j = i;
        }
        long j3 = j;
        if (jxa.v(this.a, false).e && jxa.v(this.a, false).n(null, false, false).amount < j3) {
            new dza(getContext(), this.J0, j3, 14, null, null, 0L).show();
            return;
        }
        this.u2 = true;
        this.V1.setLoading(true);
        ov4.c(this.a).k(this.S1, this.h2, i, new ky(this, j2, (byte) 0));
    }

    @Override
    public final void d0(float f) {
        super.d0(f);
        Z0();
    }

    public final void d1() {
        FrameLayout frameLayout;
        Drawable drawable = this.s0;
        if (drawable != null && this.b != null && (frameLayout = this.f2) != null) {
            frameLayout.setTranslationY(Math.max(0.0f, ((this.b.getY() + drawable.getBounds().top) - frameLayout.getMeasuredHeight()) + hl.L(10.0f)));
        }
    }

    @Override
    public final void dismiss() {
        ov4.c(this.a).n(this.S1, this);
        this.W1.b();
        super.dismiss();
    }

    public final void e1(boolean z) {
        long value = this.X1.getValue();
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.g2.e;
        long j = tL_StarGiftAuctionUserState.bid_amount;
        int i = (value > j ? 1 : (value == j ? 0 : -1));
        ub ubVar = this.V1;
        if (i == 0) {
            ubVar.i(ob6.M0(2131747558, null), z, true);
            ubVar.setOnClickListener(new jy(this, (byte) 0));
            return;
        }
        int i2 = (j > value ? 1 : (j == value ? 0 : -1));
        wm2[] wm2VarArr = this.q2;
        if (i2 < 0 && !tL_StarGiftAuctionUserState.returned) {
            ubVar.i(nza.Z0(false, ob6.a0(null, null, 2131750299, ob6.E(value - j, ',')), wm2VarArr), z, true);
        } else {
            ubVar.i(nza.Z0(false, ob6.a0(null, null, 2131750300, ob6.E(value, ',')), wm2VarArr), z, true);
        }
        ubVar.setOnClickListener(new jy(this, (byte) 1));
    }

    public final void f1() {
        int f = vm2.f(this.o2.e, vm2.f(this.p2.e, aob.v0(aob.L6, this.J0), aob.v0(aob.q7, this.J0)), aob.v0(aob.lk, this.J0));
        this.b2.setTextColor(f);
        in inVar = this.c2;
        inVar.setTextColor(f);
        this.d2.b.setTextColor(f);
        if (aob.F1(inVar.getSizeableBackground(), aob.p1(0.15f, f), false)) {
            inVar.invalidate();
        }
    }

    public final void g1(long j, boolean z) {
        String h0;
        in inVar = (in) this.Z1.b;
        int i = (j > 3600L ? 1 : (j == 3600L ? 0 : -1));
        int i2 = (int) j;
        if (i >= 0) {
            h0 = hl.j0(i2);
        } else {
            h0 = hl.h0(i2, true);
        }
        inVar.c(h0, z, true);
    }

    public final void h1(boolean z) {
        int i;
        long value = this.X1.getValue();
        kv4 kv4Var = this.g2;
        int i2 = kv4Var.i;
        int c = kv4Var.c(ConnectionsManager.getInstance(kv4Var.a).getCurrentTime(), value);
        long max = Math.max(value, this.g2.e.bid_amount);
        sy syVar = this.d2;
        syVar.d.c(nza.b1(false, "⭐️".concat(ob6.E((int) max, ',')), 0.78f, syVar.e), false, true);
        if (i2 > 0) {
            c = Math.min(i2, c);
        }
        syVar.a(c, false, z);
        kv4 kv4Var2 = this.g2;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = kv4Var2.f;
        in inVar = this.c2;
        if (tL_starGiftAuctionState != null && c > 0 && kv4Var2.d.title != null && kv4Var2.d() == 1) {
            kv4 kv4Var3 = this.g2;
            kv4Var3.getClass();
            if (!kv4Var3.g(ConnectionsManager.getInstance(yac.t0).getCurrentTime())) {
                kv4 kv4Var4 = this.g2;
                if (kv4Var4.f.last_gift_num + c <= kv4Var4.d.availability_total) {
                    inVar.setText(this.g2.d.title + " #" + ob6.E(i, ','));
                    return;
                }
            }
        }
        inVar.setText(null);
    }

    public final void i1(boolean z) {
        boolean z2;
        int d = this.g2.d();
        int i = (this.X1.getValue() > this.g2.e.bid_amount ? 1 : (this.X1.getValue() == this.g2.e.bid_amount ? 0 : -1));
        mf5 mf5Var = this.b2;
        boolean z3 = false;
        if (i > 0) {
            mf5Var.c(ob6.M0(2131750332, null), z);
        } else {
            z2 = true;
            if (d == 2) {
                mf5Var.c(ob6.M0(2131750330, null), z);
            } else if (d == 3) {
                mf5Var.c(ob6.M0(2131750330, null), z);
            } else if (d == 1) {
                mf5Var.c(ob6.M0(2131750329, null), z);
                z2 = false;
                z3 = true;
            } else {
                mf5Var.c(ob6.M0(2131750332, null), z);
            }
            this.o2.a(z3, z);
            this.p2.a(z2, z);
        }
        z2 = false;
        this.o2.a(z3, z);
        this.p2.a(z2, z);
    }

    public final void j1(boolean z) {
        String o0;
        e Q;
        int i;
        in inVar = (in) this.Y1.b;
        StringBuilder sb = new StringBuilder("⭐️");
        long e = (int) this.g2.e();
        if (e < 1000000) {
            o0 = ob6.E(e, ',');
        } else {
            o0 = hl.o0((int) e, 1000000);
        }
        sb.append(o0);
        inVar.c(nza.b1(false, sb.toString(), 0.78f, this.m2), z, true);
        if (this.g2.f != null) {
            int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
            boolean g = this.g2.g(currentTime);
            kv4 kv4Var = this.g2;
            by2 by2Var = this.W1;
            if (g) {
                long max = Math.max(0, kv4Var.f.start_date - currentTime);
                by2Var.a(max);
                g1(max, z);
            } else {
                long max2 = Math.max(0, kv4Var.f.next_round_at - currentTime);
                by2Var.a(max2);
                g1(max2, z);
            }
            hm hmVar = this.n2;
            tt ttVar = this.a2;
            if (hmVar == null && this.g2.d.sticker != null) {
                this.n2 = new hm(this.g2.d.sticker.id, ((in) ttVar.b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.n2 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.n2, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) ob6.E(this.g2.f.gifts_left, ','));
            ((in) ttVar.b).c(spannableStringBuilder, z, true);
            TextView textView = (TextView) this.Z1.c;
            kv4 kv4Var2 = this.g2;
            kv4Var2.getClass();
            if (kv4Var2.g(ConnectionsManager.getInstance(yac.t0).getCurrentTime())) {
                i = 2131750333;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.g2.f;
                if (tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds) {
                    i = 2131750335;
                } else {
                    i = 2131750334;
                }
            }
            textView.setText(ob6.M0(i, null));
            sy[] syVarArr = this.e2;
            int min = Math.min(syVarArr.length, this.g2.f.top_bidders.size());
            if (min > 0) {
                int i2 = 0;
                while (i2 < min) {
                    int i3 = i2 + 1;
                    Long l = this.g2.f.top_bidders.get(i2);
                    long longValue = l.longValue();
                    TLRPC.User X1 = uc7.s1(this.a).X1(l);
                    if (X1 != null) {
                        syVarArr[i2].b(X1);
                    }
                    sy syVar = syVarArr[i2];
                    syVar.d.c(nza.b1(false, "⭐️".concat(ob6.E((int) this.g2.b(i3), ',')), 0.78f, syVar.e), z, true);
                    syVarArr[i2].setOnClickListener(new my(this, longValue, (byte) 0));
                    i2 = i3;
                }
            }
        }
        kv4 kv4Var3 = this.g2;
        oy oyVar = this.X1;
        oyVar.setStarsTop(kv4Var3.b(kv4Var3.d.gifts_per_round) + 1);
        oyVar.setTopText(ob6.G(this.g2.d.gifts_per_round, "StarsReactionTopX", new Object[0]));
        h1(z);
        i1(z);
        e1(z);
        a1();
        long n = wf3.n(this.g2.e.peer);
        long j = this.g2.e.acquired_count;
        if (this.k2 < j && !this.l2 && (Q = LaunchActivity.Q()) != null) {
            long j2 = this.j2;
            if (j2 != 0) {
                zu1 ha = zu1.ha(j2);
                ha.whenFullyVisible(new ny(ha, (byte) 0));
                Q.presentFragment(ha);
                Runnable runnable = this.i2;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (n != 0) {
            this.j2 = n;
        }
        this.k2 = j;
        this.l2 = false;
    }

    @Override
    public final void k0() {
        this.r2 = false;
        Z0();
        v21.h(this.c);
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            if (this.b2 != null && this.c2 != null && this.d2 != null) {
                f1();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void q(kv4 kv4Var) {
        this.g2 = kv4Var;
        j1(this.r2);
    }

    @Override
    public final void x() {
        this.r2 = true;
        Z0();
        v21.a(this.c, new py((byte) 0));
    }
}
