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
import di.cb;
import di.mb;
import di.v8;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.r9;
import org.telegram.messenger.u9;
import org.telegram.messenger.v9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class y extends ja implements u9 {
    public static final int f3984w2 = 0;
    public final long T1;
    public final b41 U1;
    public final di.b V1;
    public final s W1;
    public final bg.q X1;
    public final r Y1;
    public final ai.j0 Z1;
    public final ai.j0 f3985a2;
    public final ai.j0 f3986b2;
    public final org.telegram.ui.Cells.n4 f3987c2;
    public final org.telegram.ui.Components.h6 d2;
    public final w f3988e2;
    public final w[] f3989f2;
    public final FrameLayout f3990g2;
    public r9 f3991h2;
    public final x f3992i2;
    public Runnable f3993j2;
    public long f3994k2;
    public long f3995l2;
    public boolean f3996m2;
    public final eq[] f3997n2;
    public org.telegram.ui.Components.p5 f3998o2;
    public final te.a f3999p2;
    public final te.a f4000q2;
    public final eq[] f4001r2;
    public boolean f4002s2;
    public p41 f4003t2;
    public boolean f4004u2;
    public boolean f4005v2;

    public y(Context context, org.telegram.ui.ActionBar.e6 e6Var, x xVar, r9 r9Var) {
        super(context, null, false, false, 2, e6Var);
        long j3;
        int i7;
        boolean z10;
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        this.f3989f2 = new w[3];
        this.f3996m2 = true;
        this.f3997n2 = new eq[1];
        h hVar = new h(this);
        er erVar = er.h;
        this.f3999p2 = new te.a(0, hVar, erVar, 380L, false);
        this.f4000q2 = new te.a(0, new h(this), erVar, 380L, false);
        this.f4001r2 = new eq[1];
        this.f3991h2 = r9Var;
        this.f3992i2 = xVar;
        long j10 = r9Var.f26259b;
        this.T1 = j10;
        this.M1 = true;
        this.f35943v1 = 0.2f;
        r9 l10 = v9.c(this.f29679a).l(j10, this);
        this.X1 = new bg.q(new h(this));
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        O();
        m0.d1(this.f35937p1, context, e6Var, l10.d);
        TLRPC.User a22 = np.s1(this.f29679a).a2(Long.valueOf(m10.i(this.f29679a).e()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.U1 = b41.j(-1, linearLayout);
        r rVar = new r(this, context, e6Var);
        this.Y1 = rVar;
        rVar.P = true;
        this.f3991h2.e();
        r9 r9Var2 = this.f3991h2;
        long j11 = r9Var2.f26261e.bid_amount;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = r9Var2.f26262f;
        if (tL_starGiftAuctionState != null && (arrayList = tL_starGiftAuctionState.bid_levels) != null && !arrayList.isEmpty()) {
            j3 = r9Var2.f26262f.bid_levels.get(0).amount;
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
        rVar2.f8635f0 = iArr2;
        linearLayout.addView(rVar2, c8.ja.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ai.j0 j0Var = new ai.j0(context, e6Var);
        this.Z1 = j0Var;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i14 = org.telegram.ui.ActionBar.j6.f28792a7;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i14, this.J0);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, this.J0), org.telegram.ui.ActionBar.j6.w0(i14, this.J0));
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w02, k10, k10);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
        j0Var.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(j0Var, k02, M, null, e6Var);
        j0Var.setOnClickListener(new m(this, 2));
        ((TextView) j0Var.f1266c).setText(hd.M0(2131750375, null));
        ai.j0 j0Var2 = new ai.j0(context, e6Var);
        this.f3985a2 = j0Var2;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.j6.w0(i14, this.J0));
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i14);
        j0Var2.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(j0Var2, d02, M2, null, e6Var);
        ((TextView) j0Var2.f1266c).setText(hd.M0(2131750373, null));
        ai.j0 j0Var3 = new ai.j0(context, e6Var);
        this.f3986b2 = j0Var3;
        ShapeDrawable d03 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.j6.w0(i14, this.J0));
        org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i14);
        j0Var3.setBackground(d03);
        org.telegram.ui.ActionBar.q6.j(j0Var3, d03, M3, null, e6Var);
        ((TextView) j0Var3.f1266c).setText(hd.M0(2131750376, null));
        linearLayout2.addView(j0Var, c8.ja.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), c8.ja.l(0.0f, 10, -1));
        linearLayout2.addView(j0Var2, c8.ja.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), c8.ja.l(0.0f, 10, -1));
        linearLayout2.addView(j0Var3, c8.ja.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, c8.ja.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (l10.f26261e.acquired_count > 0) {
            z70 z70Var = new z70(context, e6Var);
            z70Var.setGravity(17);
            z70Var.setTextSize(1, 16.0f);
            int i15 = org.telegram.ui.ActionBar.j6.J6;
            org.telegram.ui.ActionBar.q6.U(z70Var, i15, e6Var);
            org.telegram.ui.ActionBar.q6.G(z70Var, i15, e6Var);
            z70Var.setOnClickListener(new ah.g(this, new boolean[1], e6Var, 2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(l10.f26260c, z70Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            z70Var.setText(TextUtils.concat(org.telegram.messenger.g0.I2(hd.F("Gift2AuctionsItemsBought2", l10.f26261e.acquired_count, spannableStringBuilder), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
            na.b(z70Var, 0.02f, 1.5f);
            linearLayout.addView(z70Var, c8.ja.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i16 = org.telegram.ui.ActionBar.j6.L6;
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, i16, 21, 0, 0, false, true, e6Var);
        this.f3987c2 = n4Var;
        linearLayout.addView(n4Var, c8.ja.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.d2 = h6Var;
        h6Var.setTextSize(org.telegram.messenger.g0.L(12.5f));
        h6Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        h6Var.setSizeableBackground(org.telegram.ui.ActionBar.j6.b0(0, 0, 9, 9));
        h6Var.setHideBackgroundIfEmpty(true);
        n4Var.setOnWidthUpdateListener(new a3.f(this, 17));
        n4Var.addView(h6Var, c8.ja.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        w wVar = new w(context, e6Var);
        this.f3988e2 = wVar;
        org.telegram.ui.Components.h6 h6Var2 = wVar.f3947b;
        org.telegram.ui.ActionBar.q6.q(h6Var2);
        h6Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(i16, this.J0));
        wVar.c(a22);
        linearLayout.addView(wVar, c8.ja.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context, i16, 21, 15, 0, false, false, e6Var);
        n4Var2.setText(hd.M0(2131750320, null));
        linearLayout.addView(n4Var2, c8.ja.o(-1, -2));
        int i17 = 0;
        while (true) {
            w[] wVarArr = this.f3989f2;
            if (i17 >= wVarArr.length) {
                break;
            }
            wVarArr[i17] = new w(context, e6Var);
            int i18 = i17 + 1;
            this.f3989f2[i17].b(i18, true, false);
            this.f3989f2[i17].setBackground(org.telegram.ui.ActionBar.j6.N0(false));
            w wVar2 = this.f3989f2[i17];
            if (i17 < 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            wVar2.f3950f = z10;
            wVar2.setOnClickListener(new o(0));
            linearLayout.addView(this.f3989f2[i17], c8.ja.o(-1, -2));
            i17 = i18;
        }
        s sVar = new s(0, context, e6Var, true);
        this.W1 = sVar;
        sVar.f();
        FrameLayout.LayoutParams d = c8.ja.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i19 = d.leftMargin;
        int i20 = this.f29717u0;
        d.leftMargin = i19 + i20;
        d.rightMargin += i20;
        this.f29682b.addView(sVar, d);
        uj0 uj0Var = this.f35936o1;
        int i21 = this.f29717u0;
        uj0Var.setPadding(i21, 0, i21, org.telegram.messenger.g0.L(64.0f));
        this.f35936o1.setOnItemClickListener(new a(1));
        long j12 = l10.f26261e.bid_amount;
        if (j12 > 0) {
            this.Y1.setValue((int) j12);
        } else {
            this.Y1.setValue((int) l10.e());
        }
        n1(false);
        this.f35936o1.setOverScrollMode(2);
        di.b bVar = new di.b(this.f29679a, context, e6Var);
        this.V1 = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        bVar.setEnabled(false);
        bVar.setClickable(false);
        this.f29685c.addView(bVar, c8.ja.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        na.a(bVar);
        bVar.setOnClickListener(new p(0, context, e6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f3990g2 = frameLayout;
        this.f29685c.addView(frameLayout, c8.ja.e(-1, 100, 48));
        j1();
        this.f4003t2.O(false);
    }

    public static void d1(y yVar, int i7) {
        yVar.Y1.f(fi.t.b(yVar.f29679a, i7, 3), fi.t.b(yVar.f29679a, i7, 4), true);
        yVar.l1(yVar.f4002s2);
        yVar.m1(yVar.f4002s2);
        yVar.i1(yVar.f4002s2);
        yVar.f1();
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.f35936o1, getContext(), this.f29679a, 0, true, new b(this, 2), this.J0);
        this.f4003t2 = p41Var;
        p41Var.f38201r = false;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        return hd.M0(2131750344, null);
    }

    @Override
    public final void c(r9 r9Var) {
        this.f3991h2 = r9Var;
        n1(this.f4002s2);
    }

    @Override
    public final void dismiss() {
        v9.c(this.f29679a).n(this.T1, this);
        this.X1.b();
        super.dismiss();
    }

    public final void e1() {
        boolean z10;
        float f10;
        if (this.f4002s2 && !this.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f4004u2 != z10) {
            this.f4004u2 = z10;
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
                i20.m(scaleY, f12, 180L);
            }
        }
    }

    public final void f1() {
        long j3;
        r rVar = this.Y1;
        int value = rVar.getValue();
        if (rVar.getProgress() > 0.99f) {
            rVar.g(hd.M0(2131750322, null));
            return;
        }
        long j10 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f3991h2.f26261e;
        long j11 = tL_StarGiftAuctionUserState.bid_amount;
        if (j10 == j11) {
            rVar.g(hd.M0(2131750317, null));
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

    @Override
    public final void g0(float f10) {
        super.g0(f10);
        e1();
    }

    public final void g1(int i7) {
        long j3;
        if (this.f4005v2) {
            return;
        }
        long j10 = this.f3991h2.f26261e.bid_amount;
        if (j10 > 0) {
            j3 = i7 - j10;
        } else {
            j3 = i7;
        }
        long j11 = j3;
        if (v8.y(this.f29679a, false).f9601e && v8.y(this.f29679a, false).q(null, false, false).amount < j11) {
            new cb(getContext(), this.J0, j11, 14, null, null, 0L).show();
            return;
        }
        this.f4005v2 = true;
        this.W1.setLoading(true);
        v9.c(this.f29679a).k(this.T1, this.f3992i2, i7, new n(this, j10, 0));
    }

    public final void h1() {
        FrameLayout frameLayout;
        Drawable drawable = this.f29715s0;
        if (drawable != null && this.f29682b != null && (frameLayout = this.f3990g2) != null) {
            frameLayout.setTranslationY(Math.max(0.0f, ((this.f29682b.getY() + drawable.getBounds().top) - frameLayout.getMeasuredHeight()) + org.telegram.messenger.g0.L(10.0f)));
        }
    }

    public final void i1(boolean z10) {
        long value = this.Y1.getValue();
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f3991h2.f26261e;
        long j3 = tL_StarGiftAuctionUserState.bid_amount;
        int i7 = (value > j3 ? 1 : (value == j3 ? 0 : -1));
        s sVar = this.W1;
        if (i7 == 0) {
            sVar.i(hd.M0(2131747831, null), z10, true);
            sVar.setOnClickListener(new m(this, 0));
            return;
        }
        int i10 = (j3 > value ? 1 : (j3 == value ? 0 : -1));
        eq[] eqVarArr = this.f4001r2;
        if (i10 < 0 && !tL_StarGiftAuctionUserState.returned) {
            sVar.i(mb.Y0(false, hd.a0(null, null, 2131750338, hd.E(value - j3, ',')), eqVarArr), z10, true);
        } else {
            sVar.i(mb.Y0(false, hd.a0(null, null, 2131750339, hd.E(value, ',')), eqVarArr), z10, true);
        }
        sVar.setOnClickListener(new m(this, 1));
    }

    public final void j1() {
        int f10 = i0.a.f(this.f3999p2.f57081e, i0.a.f(this.f4000q2.f57081e, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.L6, this.J0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29090q7, this.J0)), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.lk, this.J0));
        this.f3987c2.setTextColor(f10);
        org.telegram.ui.Components.h6 h6Var = this.d2;
        h6Var.setTextColor(f10);
        this.f3988e2.f3947b.setTextColor(f10);
        if (org.telegram.ui.ActionBar.j6.H1(h6Var.getSizeableBackground(), org.telegram.ui.ActionBar.j6.r1(0.15f, f10), false)) {
            h6Var.invalidate();
        }
    }

    public final void k1(long j3, boolean z10) {
        String h02;
        org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.f3985a2.f1265b;
        if (j3 >= 3600) {
            h02 = org.telegram.messenger.g0.j0((int) j3);
        } else {
            h02 = org.telegram.messenger.g0.h0((int) j3, true);
        }
        h6Var.c(h02, z10, true);
    }

    public final void l1(boolean z10) {
        int i7;
        long value = this.Y1.getValue();
        r9 r9Var = this.f3991h2;
        int i10 = r9Var.f26264i;
        int c10 = r9Var.c(ConnectionsManager.getInstance(r9Var.f26258a).getCurrentTime(), value);
        long max = Math.max(value, this.f3991h2.f26261e.bid_amount);
        w wVar = this.f3988e2;
        wVar.a(max, false);
        if (i10 > 0) {
            c10 = Math.min(i10, c10);
        }
        wVar.b(c10, false, z10);
        r9 r9Var2 = this.f3991h2;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = r9Var2.f26262f;
        org.telegram.ui.Components.h6 h6Var = this.d2;
        if (tL_starGiftAuctionState != null && c10 > 0 && r9Var2.d.title != null && r9Var2.d() == 1) {
            r9 r9Var3 = this.f3991h2;
            r9Var3.getClass();
            if (!r9Var3.g(ConnectionsManager.getInstance(m10.f24934t0).getCurrentTime())) {
                r9 r9Var4 = this.f3991h2;
                if (r9Var4.f26262f.last_gift_num + c10 <= r9Var4.d.availability_total) {
                    h6Var.setText(this.f3991h2.d.title + " #" + hd.E(i7, ','));
                    return;
                }
            }
        }
        h6Var.setText(null);
    }

    public final void m1(boolean z10) {
        boolean z11;
        int d = this.f3991h2.d();
        int i7 = (this.Y1.getValue() > this.f3991h2.f26261e.bid_amount ? 1 : (this.Y1.getValue() == this.f3991h2.f26261e.bid_amount ? 0 : -1));
        org.telegram.ui.Cells.n4 n4Var = this.f3987c2;
        boolean z12 = false;
        if (i7 > 0) {
            n4Var.c(hd.M0(2131750371, null), z10);
        } else {
            z11 = true;
            if (d == 2) {
                n4Var.c(hd.M0(2131750369, null), z10);
            } else if (d == 3) {
                n4Var.c(hd.M0(2131750369, null), z10);
            } else if (d == 1) {
                n4Var.c(hd.M0(2131750368, null), z10);
                z11 = false;
                z12 = true;
            } else {
                n4Var.c(hd.M0(2131750371, null), z10);
            }
            this.f3999p2.a(z12, z10);
            this.f4000q2.a(z11, z10);
        }
        z11 = false;
        this.f3999p2.a(z12, z10);
        this.f4000q2.a(z11, z10);
    }

    @Override
    public final void n0() {
        this.f4002s2 = false;
        e1();
        xb.h(this.f29685c);
    }

    public final void n1(boolean z10) {
        String o02;
        org.telegram.ui.ActionBar.e2 Q;
        int i7;
        org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.Z1.f1265b;
        StringBuilder sb2 = new StringBuilder("⭐️");
        long e10 = (int) this.f3991h2.e();
        if (e10 < 1000000) {
            o02 = hd.E(e10, ',');
        } else {
            o02 = org.telegram.messenger.g0.o0((int) e10, 1000000);
        }
        sb2.append(o02);
        h6Var.c(mb.a1(false, sb2.toString(), 0.78f, this.f3997n2), z10, true);
        if (this.f3991h2.f26262f != null) {
            int currentTime = ConnectionsManager.getInstance(this.f29679a).getCurrentTime();
            boolean g10 = this.f3991h2.g(currentTime);
            bg.q qVar = this.X1;
            if (g10) {
                long max = Math.max(0, this.f3991h2.f26262f.start_date - currentTime);
                qVar.a(max);
                k1(max, z10);
            } else {
                long max2 = Math.max(0, this.f3991h2.f26262f.next_round_at - currentTime);
                qVar.a(max2);
                k1(max2, z10);
            }
            org.telegram.ui.Components.p5 p5Var = this.f3998o2;
            ai.j0 j0Var = this.f3986b2;
            if (p5Var == null && this.f3991h2.d.sticker != null) {
                this.f3998o2 = new org.telegram.ui.Components.p5(this.f3991h2.d.sticker.f28057id, ((org.telegram.ui.Components.h6) j0Var.f1265b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f3998o2 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.f3998o2, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) hd.E(this.f3991h2.f26262f.gifts_left, ','));
            ((org.telegram.ui.Components.h6) j0Var.f1265b).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.f3985a2.f1266c;
            r9 r9Var = this.f3991h2;
            r9Var.getClass();
            if (r9Var.g(ConnectionsManager.getInstance(m10.f24934t0).getCurrentTime())) {
                i7 = 2131750372;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f3991h2.f26262f;
                if (tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds) {
                    i7 = 2131750374;
                } else {
                    i7 = 2131750373;
                }
            }
            textView.setText(hd.M0(i7, null));
            w[] wVarArr = this.f3989f2;
            int min = Math.min(wVarArr.length, this.f3991h2.f26262f.top_bidders.size());
            if (min > 0) {
                int i10 = 0;
                while (i10 < min) {
                    int i11 = i10 + 1;
                    Long l10 = this.f3991h2.f26262f.top_bidders.get(i10);
                    long longValue = l10.longValue();
                    TLRPC.User a22 = np.s1(this.f29679a).a2(l10);
                    if (a22 != null) {
                        wVarArr[i10].c(a22);
                    }
                    wVarArr[i10].a(this.f3991h2.b(i11), z10);
                    wVarArr[i10].setOnClickListener(new q(this, longValue, 0));
                    i10 = i11;
                }
            }
        }
        r9 r9Var2 = this.f3991h2;
        r rVar = this.Y1;
        rVar.setStarsTop(r9Var2.b(r9Var2.d.gifts_per_round) + 1);
        rVar.setTopText(hd.G(this.f3991h2.d.gifts_per_round, "StarsReactionTopX", new Object[0]));
        l1(z10);
        m1(z10);
        i1(z10);
        f1();
        long o4 = org.telegram.messenger.m5.o(this.f3991h2.f26261e.peer);
        long j3 = this.f3991h2.f26261e.acquired_count;
        if (this.f3995l2 < j3 && !this.f3996m2 && (Q = LaunchActivity.Q()) != null) {
            long j10 = this.f3994k2;
            if (j10 != 0) {
                an ua2 = an.ua(j10);
                ua2.whenFullyVisible(new i(ua2, 0));
                Q.presentFragment(ua2);
                Runnable runnable = this.f3993j2;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (o4 != 0) {
            this.f3994k2 = o4;
        }
        this.f3995l2 = j3;
        this.f3996m2 = false;
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            if (this.f3987c2 != null && this.d2 != null && this.f3988e2 != null) {
                j1();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void v() {
        this.f4002s2 = true;
        e1();
        xb.a(this.f29685c, new t(0));
    }
}
