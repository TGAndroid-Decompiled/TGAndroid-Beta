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
import c8.ma;
import c8.ra;
import di.fb;
import di.pb;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.q9;
import org.telegram.messenger.t9;
import org.telegram.messenger.u9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class y extends sa implements t9 {
    public static final int f4192w2 = 0;
    public final long T1;
    public final l41 U1;
    public final di.b V1;
    public final s W1;
    public final bg.r X1;
    public final r Y1;
    public final ai.k0 Z1;
    public final ai.k0 f4193a2;
    public final ai.k0 f4194b2;
    public final org.telegram.ui.Cells.o4 f4195c2;
    public final org.telegram.ui.Components.n6 d2;
    public final w f4196e2;
    public final w[] f4197f2;
    public final FrameLayout f4198g2;
    public q9 f4199h2;
    public final x f4200i2;
    public Runnable f4201j2;
    public long f4202k2;
    public long f4203l2;
    public boolean f4204m2;
    public final lq[] f4205n2;
    public org.telegram.ui.Components.x5 f4206o2;
    public final te.a f4207p2;
    public final te.a f4208q2;
    public final lq[] f4209r2;
    public boolean f4210s2;
    public z41 f4211t2;
    public boolean f4212u2;
    public boolean f4213v2;

    public y(Context context, org.telegram.ui.ActionBar.i6 i6Var, x xVar, q9 q9Var) {
        super(context, null, false, false, 2, i6Var);
        long j3;
        int i7;
        char c10;
        boolean z10;
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        this.f4197f2 = new w[3];
        this.f4204m2 = true;
        this.f4205n2 = new lq[1];
        h hVar = new h(this);
        lr lrVar = lr.h;
        this.f4207p2 = new te.a(0, hVar, lrVar, 380L, false);
        this.f4208q2 = new te.a(0, new h(this), lrVar, 380L, false);
        this.f4209r2 = new lq[1];
        this.f4199h2 = q9Var;
        this.f4200i2 = xVar;
        long j10 = q9Var.f26369b;
        this.T1 = j10;
        this.M1 = true;
        this.f39541v1 = 0.2f;
        q9 l10 = u9.c(this.f30187a).l(j10, this);
        this.X1 = new bg.r(new h(this));
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        O();
        m0.e1(this.f39535p1, context, i6Var, l10.d);
        TLRPC.User c22 = mp.u1(this.f30187a).c2(Long.valueOf(j10.i(this.f30187a).e()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.U1 = l41.j(-1, linearLayout);
        r rVar = new r(this, context, i6Var);
        this.Y1 = rVar;
        rVar.P = true;
        this.f4199h2.e();
        q9 q9Var2 = this.f4199h2;
        long j11 = q9Var2.f26371e.bid_amount;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = q9Var2.f26372f;
        if (tL_starGiftAuctionState != null && (arrayList = tL_starGiftAuctionState.bid_levels) != null && !arrayList.isEmpty()) {
            j3 = q9Var2.f26372f.bid_levels.get(0).amount;
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
        rVar2.f9115f0 = iArr2;
        linearLayout.addView(rVar2, ma.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ai.k0 k0Var = new ai.k0(context, i6Var);
        this.Z1 = k0Var;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i14 = org.telegram.ui.ActionBar.n6.f29337a7;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i14, this.J0);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29486i6, this.J0), org.telegram.ui.ActionBar.n6.w0(i14, this.J0));
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w02, k10, k10);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
        k0Var.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(k0Var, k02, M, null, i6Var);
        k0Var.setOnClickListener(new m(this, 2));
        ((TextView) k0Var.f1264c).setText(gd.M0(2131750359, null));
        ai.k0 k0Var2 = new ai.k0(context, i6Var);
        this.f4193a2 = k0Var2;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.n6.w0(i14, this.J0));
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i14);
        k0Var2.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(k0Var2, d02, M2, null, i6Var);
        ((TextView) k0Var2.f1264c).setText(gd.M0(2131750357, null));
        ai.k0 k0Var3 = new ai.k0(context, i6Var);
        this.f4194b2 = k0Var3;
        ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.n6.w0(i14, this.J0));
        org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i14);
        k0Var3.setBackground(d03);
        org.telegram.ui.ActionBar.u6.j(k0Var3, d03, M3, null, i6Var);
        ((TextView) k0Var3.f1264c).setText(gd.M0(2131750360, null));
        linearLayout2.addView(k0Var, ma.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), ma.l(0.0f, 10, -1));
        linearLayout2.addView(k0Var2, ma.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), ma.l(0.0f, 10, -1));
        linearLayout2.addView(k0Var3, ma.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, ma.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (l10.f26371e.acquired_count > 0) {
            k80 k80Var = new k80(context, i6Var);
            k80Var.setGravity(17);
            k80Var.setTextSize(1, 16.0f);
            int i15 = org.telegram.ui.ActionBar.n6.J6;
            org.telegram.ui.ActionBar.u6.U(k80Var, i15, i6Var);
            org.telegram.ui.ActionBar.u6.G(k80Var, i15, i6Var);
            c10 = 2;
            k80Var.setOnClickListener(new ah.h(this, new boolean[1], i6Var, 2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.x5(l10.f26370c, k80Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            k80Var.setText(TextUtils.concat(org.telegram.messenger.g0.I2(gd.F("Gift2AuctionsItemsBought2", l10.f26371e.acquired_count, spannableStringBuilder), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
            ra.b(k80Var, 0.02f, 1.5f);
            linearLayout.addView(k80Var, ma.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        } else {
            c10 = 2;
        }
        int i16 = org.telegram.ui.ActionBar.n6.L6;
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, i16, 21, 0, 0, false, true, i6Var);
        this.f4195c2 = o4Var;
        linearLayout.addView(o4Var, ma.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, false, false);
        this.d2 = n6Var;
        n6Var.setTextSize(org.telegram.messenger.g0.L(12.5f));
        n6Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        n6Var.setSizeableBackground(org.telegram.ui.ActionBar.n6.b0(0, 0, 9, 9));
        n6Var.setHideBackgroundIfEmpty(true);
        o4Var.setOnWidthUpdateListener(new a3.f(this, 18));
        o4Var.addView(n6Var, ma.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        w wVar = new w(context, i6Var);
        this.f4196e2 = wVar;
        org.telegram.ui.Components.n6 n6Var2 = wVar.f4137b;
        org.telegram.ui.ActionBar.u6.q(n6Var2);
        n6Var2.setTextColor(org.telegram.ui.ActionBar.n6.w0(i16, this.J0));
        wVar.c(c22);
        linearLayout.addView(wVar, ma.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.o4 o4Var2 = new org.telegram.ui.Cells.o4(context, i16, 21, 15, 0, false, false, i6Var);
        o4Var2.setText(gd.M0(2131750304, null));
        linearLayout.addView(o4Var2, ma.o(-1, -2));
        int i17 = 0;
        while (true) {
            w[] wVarArr = this.f4197f2;
            if (i17 >= wVarArr.length) {
                break;
            }
            wVarArr[i17] = new w(context, i6Var);
            int i18 = i17 + 1;
            this.f4197f2[i17].b(i18, true, false);
            this.f4197f2[i17].setBackground(org.telegram.ui.ActionBar.n6.N0(false));
            w wVar2 = this.f4197f2[i17];
            if (i17 < 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            wVar2.f4140f = z10;
            wVar2.setOnClickListener(new o(0));
            linearLayout.addView(this.f4197f2[i17], ma.o(-1, -2));
            i17 = i18;
        }
        s sVar = new s(0, context, i6Var, true);
        this.W1 = sVar;
        sVar.f();
        FrameLayout.LayoutParams d = ma.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i19 = d.leftMargin;
        int i20 = this.f30225u0;
        d.leftMargin = i19 + i20;
        d.rightMargin += i20;
        this.f30190b.addView(sVar, d);
        ck0 ck0Var = this.f39534o1;
        int i21 = this.f30225u0;
        ck0Var.setPadding(i21, 0, i21, org.telegram.messenger.g0.L(64.0f));
        this.f39534o1.setOnItemClickListener(new a(1));
        long j12 = l10.f26371e.bid_amount;
        if (j12 > 0) {
            this.Y1.setValue((int) j12);
        } else {
            this.Y1.setValue((int) l10.e());
        }
        o1(false);
        this.f39534o1.setOverScrollMode(2);
        di.b bVar = new di.b(this.f30187a, context, i6Var);
        this.V1 = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        bVar.setEnabled(false);
        bVar.setClickable(false);
        this.f30193c.addView(bVar, ma.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        ra.a(bVar);
        bVar.setOnClickListener(new p(0, context, i6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f4198g2 = frameLayout;
        this.f30193c.addView(frameLayout, ma.e(-1, 100, 48));
        k1();
        this.f4211t2.O(false);
    }

    public static void e1(y yVar, int i7) {
        yVar.Y1.f(fi.t.b(yVar.f30187a, i7, 3), fi.t.b(yVar.f30187a, i7, 4), true);
        yVar.m1(yVar.f4210s2);
        yVar.n1(yVar.f4210s2);
        yVar.j1(yVar.f4210s2);
        yVar.g1();
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(this.f39534o1, getContext(), this.f30187a, 0, true, new b(this, 2), this.J0);
        this.f4211t2 = z41Var;
        z41Var.f42809r = false;
        return z41Var;
    }

    @Override
    public final CharSequence P0() {
        return gd.M0(2131750328, null);
    }

    @Override
    public final void c(q9 q9Var) {
        this.f4199h2 = q9Var;
        o1(this.f4210s2);
    }

    @Override
    public final void dismiss() {
        u9.c(this.f30187a).n(this.T1, this);
        this.X1.b();
        super.dismiss();
    }

    public final void f1() {
        boolean z10;
        float f10;
        if (this.f4210s2 && !this.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f4212u2 != z10) {
            this.f4212u2 = z10;
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
                n10.n(scaleY, f12, 180L);
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
            rVar.g(gd.M0(2131750306, null));
            return;
        }
        long j10 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f4199h2.f26371e;
        long j11 = tL_StarGiftAuctionUserState.bid_amount;
        if (j10 == j11) {
            rVar.g(gd.M0(2131750301, null));
        } else if (j11 > 0 && !tL_StarGiftAuctionUserState.returned) {
            if (j10 - j11 > 0) {
                rVar.g("+" + gd.E(j3, ','));
                return;
            }
            rVar.g(null);
        } else {
            rVar.g(null);
        }
    }

    public final void h1(int i7) {
        long j3;
        if (this.f4213v2) {
            return;
        }
        long j10 = this.f4199h2.f26371e.bid_amount;
        if (j10 > 0) {
            j3 = i7 - j10;
        } else {
            j3 = i7;
        }
        long j11 = j3;
        if (di.x8.y(this.f30187a, false).f10018e && di.x8.y(this.f30187a, false).q(null, false, false).amount < j11) {
            new fb(getContext(), this.J0, j11, 14, null, null, 0L).show();
            return;
        }
        this.f4213v2 = true;
        this.W1.setLoading(true);
        u9.c(this.f30187a).k(this.T1, this.f4200i2, i7, new n(this, j10, 0));
    }

    public final void i1() {
        FrameLayout frameLayout;
        Drawable drawable = this.f30223s0;
        if (drawable != null && this.f30190b != null && (frameLayout = this.f4198g2) != null) {
            frameLayout.setTranslationY(Math.max(0.0f, ((this.f30190b.getY() + drawable.getBounds().top) - frameLayout.getMeasuredHeight()) + org.telegram.messenger.g0.L(10.0f)));
        }
    }

    public final void j1(boolean z10) {
        long value = this.Y1.getValue();
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f4199h2.f26371e;
        long j3 = tL_StarGiftAuctionUserState.bid_amount;
        int i7 = (value > j3 ? 1 : (value == j3 ? 0 : -1));
        s sVar = this.W1;
        if (i7 == 0) {
            sVar.i(gd.M0(2131747638, null), z10, true);
            sVar.setOnClickListener(new m(this, 0));
            return;
        }
        int i10 = (j3 > value ? 1 : (j3 == value ? 0 : -1));
        lq[] lqVarArr = this.f4209r2;
        if (i10 < 0 && !tL_StarGiftAuctionUserState.returned) {
            sVar.i(pb.Z0(false, gd.a0(null, null, 2131750322, gd.E(value - j3, ',')), lqVarArr), z10, true);
        } else {
            sVar.i(pb.Z0(false, gd.a0(null, null, 2131750323, gd.E(value, ',')), lqVarArr), z10, true);
        }
        sVar.setOnClickListener(new m(this, 1));
    }

    public final void k1() {
        int f10 = i0.a.f(this.f4207p2.f57657e, i0.a.f(this.f4208q2.f57657e, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.L6, this.J0), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29635q7, this.J0)), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.lk, this.J0));
        this.f4195c2.setTextColor(f10);
        org.telegram.ui.Components.n6 n6Var = this.d2;
        n6Var.setTextColor(f10);
        this.f4196e2.f4137b.setTextColor(f10);
        if (org.telegram.ui.ActionBar.n6.H1(n6Var.getSizeableBackground(), org.telegram.ui.ActionBar.n6.r1(0.15f, f10), false)) {
            n6Var.invalidate();
        }
    }

    public final void l1(long j3, boolean z10) {
        String h02;
        org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.f4193a2.f1263b;
        if (j3 >= 3600) {
            h02 = org.telegram.messenger.g0.j0((int) j3);
        } else {
            h02 = org.telegram.messenger.g0.h0((int) j3, true);
        }
        n6Var.c(h02, z10, true);
    }

    public final void m1(boolean z10) {
        int i7;
        long value = this.Y1.getValue();
        q9 q9Var = this.f4199h2;
        int i10 = q9Var.f26374i;
        int c10 = q9Var.c(ConnectionsManager.getInstance(q9Var.f26368a).getCurrentTime(), value);
        long max = Math.max(value, this.f4199h2.f26371e.bid_amount);
        w wVar = this.f4196e2;
        wVar.a(max, false);
        if (i10 > 0) {
            c10 = Math.min(i10, c10);
        }
        wVar.b(c10, false, z10);
        q9 q9Var2 = this.f4199h2;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = q9Var2.f26372f;
        org.telegram.ui.Components.n6 n6Var = this.d2;
        if (tL_starGiftAuctionState != null && c10 > 0 && q9Var2.d.title != null && q9Var2.d() == 1) {
            q9 q9Var3 = this.f4199h2;
            q9Var3.getClass();
            if (!q9Var3.g(ConnectionsManager.getInstance(j10.f24770t0).getCurrentTime())) {
                q9 q9Var4 = this.f4199h2;
                if (q9Var4.f26372f.last_gift_num + c10 <= q9Var4.d.availability_total) {
                    n6Var.setText(this.f4199h2.d.title + " #" + gd.E(i7, ','));
                    return;
                }
            }
        }
        n6Var.setText(null);
    }

    @Override
    public final void n0() {
        this.f4210s2 = false;
        f1();
        gc.h(this.f30193c);
    }

    public final void n1(boolean z10) {
        boolean z11;
        int d = this.f4199h2.d();
        int i7 = (this.Y1.getValue() > this.f4199h2.f26371e.bid_amount ? 1 : (this.Y1.getValue() == this.f4199h2.f26371e.bid_amount ? 0 : -1));
        org.telegram.ui.Cells.o4 o4Var = this.f4195c2;
        boolean z12 = false;
        if (i7 > 0) {
            o4Var.c(gd.M0(2131750355, null), z10);
        } else {
            z11 = true;
            if (d == 2) {
                o4Var.c(gd.M0(2131750353, null), z10);
            } else if (d == 3) {
                o4Var.c(gd.M0(2131750353, null), z10);
            } else if (d == 1) {
                o4Var.c(gd.M0(2131750352, null), z10);
                z11 = false;
                z12 = true;
            } else {
                o4Var.c(gd.M0(2131750355, null), z10);
            }
            this.f4207p2.a(z12, z10);
            this.f4208q2.a(z11, z10);
        }
        z11 = false;
        this.f4207p2.a(z12, z10);
        this.f4208q2.a(z11, z10);
    }

    public final void o1(boolean z10) {
        String o02;
        org.telegram.ui.ActionBar.h2 Q;
        int i7;
        org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.Z1.f1263b;
        StringBuilder sb2 = new StringBuilder("⭐️");
        long e10 = (int) this.f4199h2.e();
        if (e10 < 1000000) {
            o02 = gd.E(e10, ',');
        } else {
            o02 = org.telegram.messenger.g0.o0((int) e10, 1000000);
        }
        sb2.append(o02);
        n6Var.c(pb.b1(false, sb2.toString(), 0.78f, this.f4205n2), z10, true);
        if (this.f4199h2.f26372f != null) {
            int currentTime = ConnectionsManager.getInstance(this.f30187a).getCurrentTime();
            boolean g10 = this.f4199h2.g(currentTime);
            bg.r rVar = this.X1;
            if (g10) {
                long max = Math.max(0, this.f4199h2.f26372f.start_date - currentTime);
                rVar.a(max);
                l1(max, z10);
            } else {
                long max2 = Math.max(0, this.f4199h2.f26372f.next_round_at - currentTime);
                rVar.a(max2);
                l1(max2, z10);
            }
            org.telegram.ui.Components.x5 x5Var = this.f4206o2;
            ai.k0 k0Var = this.f4194b2;
            if (x5Var == null && this.f4199h2.d.sticker != null) {
                this.f4206o2 = new org.telegram.ui.Components.x5(this.f4199h2.d.sticker.f28409id, ((org.telegram.ui.Components.n6) k0Var.f1263b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f4206o2 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.f4206o2, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) gd.E(this.f4199h2.f26372f.gifts_left, ','));
            ((org.telegram.ui.Components.n6) k0Var.f1263b).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.f4193a2.f1264c;
            q9 q9Var = this.f4199h2;
            q9Var.getClass();
            if (q9Var.g(ConnectionsManager.getInstance(j10.f24770t0).getCurrentTime())) {
                i7 = 2131750356;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f4199h2.f26372f;
                if (tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds) {
                    i7 = 2131750358;
                } else {
                    i7 = 2131750357;
                }
            }
            textView.setText(gd.M0(i7, null));
            w[] wVarArr = this.f4197f2;
            int min = Math.min(wVarArr.length, this.f4199h2.f26372f.top_bidders.size());
            if (min > 0) {
                int i10 = 0;
                while (i10 < min) {
                    int i11 = i10 + 1;
                    Long l10 = this.f4199h2.f26372f.top_bidders.get(i10);
                    long longValue = l10.longValue();
                    TLRPC.User c22 = mp.u1(this.f30187a).c2(l10);
                    if (c22 != null) {
                        wVarArr[i10].c(c22);
                    }
                    wVarArr[i10].a(this.f4199h2.b(i11), z10);
                    wVarArr[i10].setOnClickListener(new q(this, longValue, 0));
                    i10 = i11;
                }
            }
        }
        q9 q9Var2 = this.f4199h2;
        r rVar2 = this.Y1;
        rVar2.setStarsTop(q9Var2.b(q9Var2.d.gifts_per_round) + 1);
        rVar2.setTopText(gd.G(this.f4199h2.d.gifts_per_round, "StarsReactionTopX", new Object[0]));
        m1(z10);
        n1(z10);
        j1(z10);
        g1();
        long o4 = org.telegram.messenger.n5.o(this.f4199h2.f26371e.peer);
        long j3 = this.f4199h2.f26371e.acquired_count;
        if (this.f4203l2 < j3 && !this.f4204m2 && (Q = LaunchActivity.Q()) != null) {
            long j10 = this.f4202k2;
            if (j10 != 0) {
                bn ua2 = bn.ua(j10);
                ua2.whenFullyVisible(new i(ua2, 0));
                Q.presentFragment(ua2);
                Runnable runnable = this.f4201j2;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (o4 != 0) {
            this.f4202k2 = o4;
        }
        this.f4203l2 = j3;
        this.f4204m2 = false;
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            if (this.f4195c2 != null && this.d2 != null && this.f4196e2 != null) {
                k1();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void v() {
        this.f4210s2 = true;
        f1();
        gc.a(this.f30193c, new t(0));
    }
}
