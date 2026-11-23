package bi;

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
import c8.na;
import di.fb;
import di.pb;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.r9;
import org.telegram.messenger.u9;
import org.telegram.messenger.v9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.sa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class y extends sa implements u9 {
    public static final int f4222w2 = 0;
    public final long T1;
    public final o41 U1;
    public final di.b V1;
    public final s W1;
    public final bg.r X1;
    public final r Y1;
    public final ai.g0 Z1;
    public final ai.g0 f4223a2;
    public final ai.g0 f4224b2;
    public final org.telegram.ui.Cells.o4 f4225c2;
    public final org.telegram.ui.Components.o6 d2;
    public final w f4226e2;
    public final w[] f4227f2;
    public final FrameLayout f4228g2;
    public r9 f4229h2;
    public final x f4230i2;
    public Runnable f4231j2;
    public long f4232k2;
    public long f4233l2;
    public boolean f4234m2;
    public final nq[] f4235n2;
    public org.telegram.ui.Components.y5 f4236o2;
    public final te.a f4237p2;
    public final te.a f4238q2;
    public final nq[] f4239r2;
    public boolean f4240s2;
    public c51 f4241t2;
    public boolean f4242u2;
    public boolean f4243v2;

    public y(Context context, org.telegram.ui.ActionBar.h6 h6Var, x xVar, r9 r9Var) {
        super(context, null, false, false, 2, h6Var);
        long j3;
        int i7;
        boolean z10;
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        this.f4227f2 = new w[3];
        this.f4234m2 = true;
        this.f4235n2 = new nq[1];
        h hVar = new h(this);
        nr nrVar = nr.h;
        this.f4237p2 = new te.a(0, hVar, nrVar, 380L, false);
        this.f4238q2 = new te.a(0, new h(this), nrVar, 380L, false);
        this.f4239r2 = new nq[1];
        this.f4229h2 = r9Var;
        this.f4230i2 = xVar;
        long j10 = r9Var.f26544b;
        this.T1 = j10;
        this.M1 = true;
        this.f39494v1 = 0.2f;
        r9 l10 = v9.c(this.f30139a).l(j10, this);
        this.X1 = new bg.r(new h(this));
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        O();
        m0.e1(this.f39488p1, context, h6Var, l10.d);
        TLRPC.User c22 = np.u1(this.f30139a).c2(Long.valueOf(k10.i(this.f30139a).e()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.U1 = o41.j(-1, linearLayout);
        r rVar = new r(this, context, h6Var);
        this.Y1 = rVar;
        rVar.P = true;
        this.f4229h2.e();
        r9 r9Var2 = this.f4229h2;
        long j11 = r9Var2.f26546e.bid_amount;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = r9Var2.f26547f;
        if (tL_starGiftAuctionState != null && (arrayList = tL_starGiftAuctionState.bid_levels) != null && !arrayList.isEmpty()) {
            j3 = r9Var2.f26547f.bid_levels.get(0).amount;
        } else {
            j3 = 0;
        }
        if (j3 > 100000) {
            i7 = ((((int) j3) * 3) / 2000) * 1000;
        } else if (j3 > 30000) {
            i7 = 100000;
        } else {
            i7 = 50000;
        }
        int i10 = 15;
        int[] iArr = {50, 100, 500, 1000, 2000, 5000, 7500, 10000, 25000, 50000, 100000, 500000, 1000000, 5000000, 10000000};
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            int i12 = iArr[i11];
            if (i12 < 50) {
                z11 = true;
            } else {
                z11 = i12 == 50 ? false : z11;
                if (i12 > i7) {
                    arrayList2.add(Integer.valueOf(i7));
                    break;
                }
                arrayList2.add(Integer.valueOf(i12));
                if (iArr[i11] == i7) {
                    break;
                }
            }
            i11++;
            i10 = 15;
        }
        if (z11) {
            arrayList2.add(0, 50);
        }
        if (arrayList2.size() < 2) {
            arrayList2.clear();
            arrayList2.add(1);
            arrayList2.add(10000);
        }
        int[] iArr2 = new int[arrayList2.size()];
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            iArr2[i13] = ((Integer) arrayList2.get(i13)).intValue();
        }
        r rVar2 = this.Y1;
        rVar2.f9106f0 = iArr2;
        linearLayout.addView(rVar2, na.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ai.g0 g0Var = new ai.g0(context, h6Var);
        this.Z1 = g0Var;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i14 = org.telegram.ui.ActionBar.m6.f29290a7;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i14, this.J0);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29439i6, this.J0), org.telegram.ui.ActionBar.m6.w0(i14, this.J0));
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w02, k10, k10);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
        g0Var.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(g0Var, k02, M, null, h6Var);
        g0Var.setOnClickListener(new m(this, 2));
        ((TextView) g0Var.f1200c).setText(hd.N0(2131750358, null));
        ai.g0 g0Var2 = new ai.g0(context, h6Var);
        this.f4223a2 = g0Var2;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.m6.w0(i14, this.J0));
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i14);
        g0Var2.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(g0Var2, d02, M2, null, h6Var);
        ((TextView) g0Var2.f1200c).setText(hd.N0(2131750356, null));
        ai.g0 g0Var3 = new ai.g0(context, h6Var);
        this.f4224b2 = g0Var3;
        ShapeDrawable d03 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.m6.w0(i14, this.J0));
        org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i14);
        g0Var3.setBackground(d03);
        org.telegram.ui.ActionBar.t6.j(g0Var3, d03, M3, null, h6Var);
        ((TextView) g0Var3.f1200c).setText(hd.N0(2131750359, null));
        linearLayout2.addView(g0Var, na.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), na.l(0.0f, 10, -1));
        linearLayout2.addView(g0Var2, na.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), na.l(0.0f, 10, -1));
        linearLayout2.addView(g0Var3, na.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, na.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (l10.f26546e.acquired_count > 0) {
            m80 m80Var = new m80(context, h6Var);
            m80Var.setGravity(17);
            m80Var.setTextSize(1, 16.0f);
            int i15 = org.telegram.ui.ActionBar.m6.J6;
            org.telegram.ui.ActionBar.t6.U(m80Var, i15, h6Var);
            org.telegram.ui.ActionBar.t6.G(m80Var, i15, h6Var);
            m80Var.setOnClickListener(new ah.h(this, new boolean[1], h6Var, 2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(l10.f26545c, m80Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            m80Var.setText(TextUtils.concat(org.telegram.messenger.g0.I2(hd.F("Gift2AuctionsItemsBought2", l10.f26546e.acquired_count, spannableStringBuilder), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
            c8.sa.b(m80Var, 0.02f, 1.5f);
            linearLayout.addView(m80Var, na.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i16 = org.telegram.ui.ActionBar.m6.L6;
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, i16, 21, 0, 0, false, true, h6Var);
        this.f4225c2 = o4Var;
        linearLayout.addView(o4Var, na.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.d2 = o6Var;
        o6Var.setTextSize(org.telegram.messenger.g0.L(12.5f));
        o6Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        o6Var.setSizeableBackground(org.telegram.ui.ActionBar.m6.b0(0, 0, 9, 9));
        o6Var.setHideBackgroundIfEmpty(true);
        o4Var.setOnWidthUpdateListener(new a3.f(this, 17));
        o4Var.addView(o6Var, na.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        w wVar = new w(context, h6Var);
        this.f4226e2 = wVar;
        org.telegram.ui.Components.o6 o6Var2 = wVar.f4164b;
        org.telegram.ui.ActionBar.t6.q(o6Var2);
        o6Var2.setTextColor(org.telegram.ui.ActionBar.m6.w0(i16, this.J0));
        wVar.c(c22);
        linearLayout.addView(wVar, na.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.o4 o4Var2 = new org.telegram.ui.Cells.o4(context, i16, 21, 15, 0, false, false, h6Var);
        o4Var2.setText(hd.N0(2131750303, null));
        linearLayout.addView(o4Var2, na.o(-1, -2));
        int i17 = 0;
        while (true) {
            w[] wVarArr = this.f4227f2;
            if (i17 >= wVarArr.length) {
                break;
            }
            wVarArr[i17] = new w(context, h6Var);
            int i18 = i17 + 1;
            this.f4227f2[i17].b(i18, true, false);
            this.f4227f2[i17].setBackground(org.telegram.ui.ActionBar.m6.N0(false));
            w wVar2 = this.f4227f2[i17];
            if (i17 < 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            wVar2.f4167f = z10;
            wVar2.setOnClickListener(new o(0));
            linearLayout.addView(this.f4227f2[i17], na.o(-1, -2));
            i17 = i18;
        }
        s sVar = new s(0, context, h6Var, true);
        this.W1 = sVar;
        sVar.f();
        FrameLayout.LayoutParams d = na.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i19 = d.leftMargin;
        int i20 = this.f30177u0;
        d.leftMargin = i19 + i20;
        d.rightMargin += i20;
        this.f30142b.addView(sVar, d);
        ek0 ek0Var = this.f39487o1;
        int i21 = this.f30177u0;
        ek0Var.setPadding(i21, 0, i21, org.telegram.messenger.g0.L(64.0f));
        this.f39487o1.setOnItemClickListener(new a(1));
        long j12 = l10.f26546e.bid_amount;
        if (j12 > 0) {
            this.Y1.setValue((int) j12);
        } else {
            this.Y1.setValue((int) l10.e());
        }
        o1(false);
        this.f39487o1.setOverScrollMode(2);
        di.b bVar = new di.b(this.f30139a, context, h6Var);
        this.V1 = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        bVar.setEnabled(false);
        bVar.setClickable(false);
        this.f30145c.addView(bVar, na.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        c8.sa.a(bVar);
        bVar.setOnClickListener(new p(0, context, h6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f4228g2 = frameLayout;
        this.f30145c.addView(frameLayout, na.e(-1, 100, 48));
        k1();
        this.f4241t2.O(false);
    }

    public static void e1(y yVar, int i7) {
        yVar.Y1.f(fi.t.b(yVar.f30139a, i7, 3), fi.t.b(yVar.f30139a, i7, 4), true);
        yVar.m1(yVar.f4240s2);
        yVar.n1(yVar.f4240s2);
        yVar.j1(yVar.f4240s2);
        yVar.g1();
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(this.f39487o1, getContext(), this.f30139a, 0, true, new b(this, 2), this.J0);
        this.f4241t2 = c51Var;
        c51Var.f34026r = false;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        return hd.N0(2131750327, null);
    }

    @Override
    public final void c(r9 r9Var) {
        this.f4229h2 = r9Var;
        o1(this.f4240s2);
    }

    @Override
    public final void dismiss() {
        v9.c(this.f30139a).n(this.T1, this);
        this.X1.b();
        super.dismiss();
    }

    public final void f1() {
        boolean z10;
        float f10;
        if (this.f4240s2 && !this.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f4242u2 != z10) {
            this.f4242u2 = z10;
            di.b bVar = this.V1;
            if (bVar != null) {
                bVar.setEnabled(z10);
                bVar.setClickable(z10);
                ViewPropertyAnimator animate = bVar.animate();
                float f11 = 0.6f;
                float f12 = 1.0f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (z10) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!z10) {
                    f12 = 0.0f;
                }
                o10.n(scaleY, f12, 180L);
            }
        }
    }

    @Override
    public final void g0(float f10) {
        super.g0(f10);
        f1();
    }

    public final void g1() {
        long j3;
        r rVar = this.Y1;
        int value = rVar.getValue();
        if (rVar.getProgress() > 0.99f) {
            rVar.g(hd.N0(2131750305, null));
            return;
        }
        long j10 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f4229h2.f26546e;
        long j11 = tL_StarGiftAuctionUserState.bid_amount;
        if (j10 == j11) {
            rVar.g(hd.N0(2131750300, null));
        } else if (j11 > 0 && !tL_StarGiftAuctionUserState.returned) {
            if (j10 - j11 > 0) {
                rVar.g("+" + hd.E(j3, ','));
                return;
            }
            rVar.g(null);
        } else {
            rVar.g(null);
        }
    }

    public final void h1(int i7) {
        long j3;
        if (this.f4243v2) {
            return;
        }
        long j10 = this.f4229h2.f26546e.bid_amount;
        if (j10 > 0) {
            j3 = i7 - j10;
        } else {
            j3 = i7;
        }
        long j11 = j3;
        if (di.y8.y(this.f30139a, false).f10051e && di.y8.y(this.f30139a, false).q(null, false, false).amount < j11) {
            new fb(getContext(), this.J0, j11, 14, null, null, 0L).show();
            return;
        }
        this.f4243v2 = true;
        this.W1.setLoading(true);
        v9.c(this.f30139a).k(this.T1, this.f4230i2, i7, new n(this, j10, 0));
    }

    public final void i1() {
        FrameLayout frameLayout;
        Drawable drawable = this.f30175s0;
        if (drawable != null && this.f30142b != null && (frameLayout = this.f4228g2) != null) {
            frameLayout.setTranslationY(Math.max(0.0f, ((this.f30142b.getY() + drawable.getBounds().top) - frameLayout.getMeasuredHeight()) + org.telegram.messenger.g0.L(10.0f)));
        }
    }

    public final void j1(boolean z10) {
        long value = this.Y1.getValue();
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f4229h2.f26546e;
        long j3 = tL_StarGiftAuctionUserState.bid_amount;
        int i7 = (value > j3 ? 1 : (value == j3 ? 0 : -1));
        s sVar = this.W1;
        if (i7 == 0) {
            sVar.i(hd.N0(2131747637, null), z10, true);
            sVar.setOnClickListener(new m(this, 0));
            return;
        }
        int i10 = (j3 > value ? 1 : (j3 == value ? 0 : -1));
        nq[] nqVarArr = this.f4239r2;
        if (i10 < 0 && !tL_StarGiftAuctionUserState.returned) {
            sVar.i(pb.Z0(false, hd.a0(null, null, 2131750321, hd.E(value - j3, ',')), nqVarArr), z10, true);
        } else {
            sVar.i(pb.Z0(false, hd.a0(null, null, 2131750322, hd.E(value, ',')), nqVarArr), z10, true);
        }
        sVar.setOnClickListener(new m(this, 1));
    }

    public final void k1() {
        int f10 = i0.a.f(this.f4237p2.f57665e, i0.a.f(this.f4238q2.f57665e, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.L6, this.J0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29588q7, this.J0)), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.lk, this.J0));
        this.f4225c2.setTextColor(f10);
        org.telegram.ui.Components.o6 o6Var = this.d2;
        o6Var.setTextColor(f10);
        this.f4226e2.f4164b.setTextColor(f10);
        if (org.telegram.ui.ActionBar.m6.H1(o6Var.getSizeableBackground(), org.telegram.ui.ActionBar.m6.r1(0.15f, f10), false)) {
            o6Var.invalidate();
        }
    }

    public final void l1(long j3, boolean z10) {
        String h02;
        org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f4223a2.f1199b;
        if (j3 >= 3600) {
            h02 = org.telegram.messenger.g0.j0((int) j3);
        } else {
            h02 = org.telegram.messenger.g0.h0((int) j3, true);
        }
        o6Var.c(h02, z10, true);
    }

    public final void m1(boolean z10) {
        int i7;
        long value = this.Y1.getValue();
        r9 r9Var = this.f4229h2;
        int i10 = r9Var.f26549i;
        int c10 = r9Var.c(ConnectionsManager.getInstance(r9Var.f26543a).getCurrentTime(), value);
        long max = Math.max(value, this.f4229h2.f26546e.bid_amount);
        w wVar = this.f4226e2;
        wVar.a(max, false);
        if (i10 > 0) {
            c10 = Math.min(i10, c10);
        }
        wVar.b(c10, false, z10);
        r9 r9Var2 = this.f4229h2;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = r9Var2.f26547f;
        org.telegram.ui.Components.o6 o6Var = this.d2;
        if (tL_starGiftAuctionState != null && c10 > 0 && r9Var2.d.title != null && r9Var2.d() == 1) {
            r9 r9Var3 = this.f4229h2;
            r9Var3.getClass();
            if (!r9Var3.g(ConnectionsManager.getInstance(k10.f24932t0).getCurrentTime())) {
                r9 r9Var4 = this.f4229h2;
                if (r9Var4.f26547f.last_gift_num + c10 <= r9Var4.d.availability_total) {
                    o6Var.setText(this.f4229h2.d.title + " #" + hd.E(i7, ','));
                    return;
                }
            }
        }
        o6Var.setText(null);
    }

    @Override
    public final void n0() {
        this.f4240s2 = false;
        f1();
        gc.h(this.f30145c);
    }

    public final void n1(boolean z10) {
        boolean z11;
        int d = this.f4229h2.d();
        int i7 = (this.Y1.getValue() > this.f4229h2.f26546e.bid_amount ? 1 : (this.Y1.getValue() == this.f4229h2.f26546e.bid_amount ? 0 : -1));
        org.telegram.ui.Cells.o4 o4Var = this.f4225c2;
        boolean z12 = false;
        if (i7 > 0) {
            o4Var.c(hd.N0(2131750354, null), z10);
        } else {
            z11 = true;
            if (d == 2) {
                o4Var.c(hd.N0(2131750352, null), z10);
            } else if (d == 3) {
                o4Var.c(hd.N0(2131750352, null), z10);
            } else if (d == 1) {
                o4Var.c(hd.N0(2131750351, null), z10);
                z11 = false;
                z12 = true;
            } else {
                o4Var.c(hd.N0(2131750354, null), z10);
            }
            this.f4237p2.a(z12, z10);
            this.f4238q2.a(z11, z10);
        }
        z11 = false;
        this.f4237p2.a(z12, z10);
        this.f4238q2.a(z11, z10);
    }

    public final void o1(boolean z10) {
        String o02;
        org.telegram.ui.ActionBar.g2 Q;
        int i7;
        org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.Z1.f1199b;
        StringBuilder sb2 = new StringBuilder("⭐️");
        long e10 = (int) this.f4229h2.e();
        if (e10 < 1000000) {
            o02 = hd.E(e10, ',');
        } else {
            o02 = org.telegram.messenger.g0.o0((int) e10, 1000000);
        }
        sb2.append(o02);
        o6Var.c(pb.b1(false, sb2.toString(), 0.78f, this.f4235n2), z10, true);
        if (this.f4229h2.f26547f != null) {
            int currentTime = ConnectionsManager.getInstance(this.f30139a).getCurrentTime();
            boolean g10 = this.f4229h2.g(currentTime);
            bg.r rVar = this.X1;
            if (g10) {
                long max = Math.max(0, this.f4229h2.f26547f.start_date - currentTime);
                rVar.a(max);
                l1(max, z10);
            } else {
                long max2 = Math.max(0, this.f4229h2.f26547f.next_round_at - currentTime);
                rVar.a(max2);
                l1(max2, z10);
            }
            org.telegram.ui.Components.y5 y5Var = this.f4236o2;
            ai.g0 g0Var = this.f4224b2;
            if (y5Var == null && this.f4229h2.d.sticker != null) {
                this.f4236o2 = new org.telegram.ui.Components.y5(this.f4229h2.d.sticker.f28404id, ((org.telegram.ui.Components.o6) g0Var.f1199b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f4236o2 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.f4236o2, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) hd.E(this.f4229h2.f26547f.gifts_left, ','));
            ((org.telegram.ui.Components.o6) g0Var.f1199b).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.f4223a2.f1200c;
            r9 r9Var = this.f4229h2;
            r9Var.getClass();
            if (r9Var.g(ConnectionsManager.getInstance(k10.f24932t0).getCurrentTime())) {
                i7 = 2131750355;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f4229h2.f26547f;
                if (tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds) {
                    i7 = 2131750357;
                } else {
                    i7 = 2131750356;
                }
            }
            textView.setText(hd.N0(i7, null));
            w[] wVarArr = this.f4227f2;
            int min = Math.min(wVarArr.length, this.f4229h2.f26547f.top_bidders.size());
            if (min > 0) {
                int i10 = 0;
                while (i10 < min) {
                    int i11 = i10 + 1;
                    Long l10 = this.f4229h2.f26547f.top_bidders.get(i10);
                    long longValue = l10.longValue();
                    TLRPC.User c22 = np.u1(this.f30139a).c2(l10);
                    if (c22 != null) {
                        wVarArr[i10].c(c22);
                    }
                    wVarArr[i10].a(this.f4229h2.b(i11), z10);
                    wVarArr[i10].setOnClickListener(new q(this, longValue, 0));
                    i10 = i11;
                }
            }
        }
        r9 r9Var2 = this.f4229h2;
        r rVar2 = this.Y1;
        rVar2.setStarsTop(r9Var2.b(r9Var2.d.gifts_per_round) + 1);
        rVar2.setTopText(hd.G(this.f4229h2.d.gifts_per_round, "StarsReactionTopX", new Object[0]));
        m1(z10);
        n1(z10);
        j1(z10);
        g1();
        long o4 = org.telegram.messenger.n5.o(this.f4229h2.f26546e.peer);
        long j3 = this.f4229h2.f26546e.acquired_count;
        if (this.f4233l2 < j3 && !this.f4234m2 && (Q = LaunchActivity.Q()) != null) {
            long j10 = this.f4232k2;
            if (j10 != 0) {
                bn ua2 = bn.ua(j10);
                ua2.whenFullyVisible(new i(ua2, 0));
                Q.presentFragment(ua2);
                Runnable runnable = this.f4231j2;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (o4 != 0) {
            this.f4232k2 = o4;
        }
        this.f4233l2 = j3;
        this.f4234m2 = false;
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            if (this.f4225c2 != null && this.d2 != null && this.f4226e2 != null) {
                k1();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void v() {
        this.f4240s2 = true;
        f1();
        gc.a(this.f30145c, new t(0));
    }
}
