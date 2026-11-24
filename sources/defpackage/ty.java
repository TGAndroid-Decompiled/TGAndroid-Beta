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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class ty extends fy0 implements jt4 {
    public final long S1;
    public final c4c T1;
    public final ge0 U1;
    public final tb V1;
    public final hx2 W1;
    public final ny X1;
    public final st Y1;
    public final st Z1;
    public final st a2;
    public final ld5 b2;
    public final hn c2;
    public final ry d2;
    public final ry[] e2;
    public final FrameLayout f2;
    public gt4 g2;
    public final sy h2;
    public Runnable i2;
    public long j2;
    public long k2;
    public boolean l2;
    public final cm2[] m2;
    public gm n2;
    public final fm0 o2;
    public final fm0 p2;
    public final cm2[] q2;
    public boolean r2;
    public l5c s2;
    public boolean t2;
    public boolean u2;

    public ty(Context context, wjb wjbVar, sy syVar, gt4 gt4Var) {
        super(context, null, false, false, 2, wjbVar);
        long j;
        int i;
        boolean z;
        ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
        this.e2 = new ry[3];
        this.l2 = true;
        this.m2 = new cm2[1];
        hy hyVar = new hy(this);
        s33 s33Var = s33.h;
        this.o2 = new fm0(0, hyVar, s33Var, 380L, false);
        this.p2 = new fm0(0, new hy(this), s33Var, 380L, false);
        this.q2 = new cm2[1];
        this.g2 = gt4Var;
        this.h2 = syVar;
        long j2 = gt4Var.b;
        this.S1 = j2;
        this.L1 = true;
        this.u1 = 0.2f;
        gt4 l = kt4.c(this.a).l(j2, this);
        this.W1 = new hx2(new hy(this));
        this.F1 = false;
        this.E1 = gl.L(12.0f);
        K();
        ez.Y0(this.o1, context, wjbVar, l.d);
        TLRPC.User V1 = na7.q1(this.a).V1(Long.valueOf(y6c.h(this.a).e()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.T1 = c4c.j(-1, linearLayout);
        ny nyVar = new ny(this, context, wjbVar);
        this.X1 = nyVar;
        nyVar.P = true;
        this.g2.e();
        gt4 gt4Var2 = this.g2;
        long j3 = gt4Var2.e.bid_amount;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = gt4Var2.f;
        if (tL_starGiftAuctionState != null && (arrayList = tL_starGiftAuctionState.bid_levels) != null && !arrayList.isEmpty()) {
            j = gt4Var2.f.bid_levels.get(0).amount;
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
        ny nyVar2 = this.X1;
        nyVar2.f0 = iArr2;
        linearLayout.addView(nyVar2, nme.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        st stVar = new st(context, wjbVar, (byte) 1);
        this.Y1 = stVar;
        int L = gl.L(12.0f);
        int i6 = bkb.Z6;
        int v0 = bkb.v0(i6, this.J0);
        int k = bm2.k(bkb.v0(bkb.h6, this.J0), bkb.v0(i6, this.J0));
        ff0 i0 = bkb.i0(L, L, L, L, v0, k, k);
        vkb M = zkb.M(i6);
        stVar.setBackground(i0);
        zkb.j(stVar, i0, M, null, wjbVar);
        stVar.setOnClickListener(new iy(this, (byte) 2));
        ((TextView) stVar.c).setText(k96.M0(2131750359, null));
        st stVar2 = new st(context, wjbVar, (byte) 1);
        this.Z1 = stVar2;
        ShapeDrawable b0 = bkb.b0(gl.L(12.0f), bkb.v0(i6, this.J0));
        vkb M2 = zkb.M(i6);
        stVar2.setBackground(b0);
        zkb.j(stVar2, b0, M2, null, wjbVar);
        ((TextView) stVar2.c).setText(k96.M0(2131750357, null));
        st stVar3 = new st(context, wjbVar, (byte) 1);
        this.a2 = stVar3;
        ShapeDrawable b02 = bkb.b0(gl.L(12.0f), bkb.v0(i6, this.J0));
        vkb M3 = zkb.M(i6);
        stVar3.setBackground(b02);
        zkb.j(stVar3, b02, M3, null, wjbVar);
        ((TextView) stVar3.c).setText(k96.M0(2131750360, null));
        linearLayout2.addView(stVar, nme.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), nme.l(0.0f, 10, -1));
        linearLayout2.addView(stVar2, nme.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), nme.l(0.0f, 10, -1));
        linearLayout2.addView(stVar3, nme.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, nme.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (l.e.acquired_count > 0) {
            l46 l46Var = new l46(context, wjbVar);
            l46Var.setGravity(17);
            l46Var.setTextSize(1, 16.0f);
            int i7 = bkb.I6;
            zkb.X(l46Var, i7, wjbVar);
            zkb.G(l46Var, i7, wjbVar);
            l46Var.setOnClickListener(new b0(this, new boolean[1], wjbVar, (byte) 7));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new gm(l.c, l46Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            l46Var.setText(TextUtils.concat(gl.E2(k96.F("Gift2AuctionsItemsBought2", l.e.acquired_count, spannableStringBuilder), true, gl.L(2.6666667f), gl.L(1.0f))));
            ote.b(l46Var, 0.02f, 1.5f);
            linearLayout.addView(l46Var, nme.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i8 = bkb.K6;
        ld5 ld5Var = new ld5(context, i8, 21, 0, 0, false, true, wjbVar);
        this.b2 = ld5Var;
        linearLayout.addView(ld5Var, nme.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        hn hnVar = new hn(context, false, false, false);
        this.c2 = hnVar;
        hnVar.setTextSize(gl.L(12.5f));
        hnVar.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        hnVar.setSizeableBackground(bkb.Z(0, 0, 9, 9));
        hnVar.setHideBackgroundIfEmpty(true);
        ld5Var.setOnWidthUpdateListener(new b1(this, (byte) 27));
        ld5Var.addView(hnVar, nme.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        ry ryVar = new ry(context, wjbVar);
        this.d2 = ryVar;
        hn hnVar2 = ryVar.b;
        zkb.q(hnVar2);
        hnVar2.setTextColor(bkb.v0(i8, this.J0));
        ryVar.b(V1);
        linearLayout.addView(ryVar, nme.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        ld5 ld5Var2 = new ld5(context, i8, 21, 15, 0, false, false, wjbVar);
        ld5Var2.setText(k96.M0(2131750304, null));
        linearLayout.addView(ld5Var2, nme.o(-1, -2));
        int i9 = 0;
        while (true) {
            ry[] ryVarArr = this.e2;
            if (i9 >= ryVarArr.length) {
                break;
            }
            ryVarArr[i9] = new ry(context, wjbVar);
            int i10 = i9 + 1;
            this.e2[i9].a(i10, true, false);
            this.e2[i9].setBackground(bkb.L0(false));
            ry ryVar2 = this.e2[i9];
            if (i9 < 2) {
                z = true;
            } else {
                z = false;
            }
            ryVar2.f = z;
            ryVar2.setOnClickListener(new x00((byte) 1));
            linearLayout.addView(this.e2[i9], nme.o(-1, -2));
            i9 = i10;
        }
        tb tbVar = new tb(context, true, wjbVar, (byte) 1);
        this.V1 = tbVar;
        tbVar.f();
        FrameLayout.LayoutParams d = nme.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i11 = d.leftMargin;
        int i12 = this.u0;
        d.leftMargin = i11 + i12;
        d.rightMargin += i12;
        this.b.addView(tbVar, d);
        o39 o39Var = this.n1;
        int i13 = this.u0;
        o39Var.setPadding(i13, 0, i13, gl.L(64.0f));
        this.n1.setOnItemClickListener(new l5((byte) 0));
        long j4 = l.e.bid_amount;
        int i14 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
        ny nyVar3 = this.X1;
        if (i14 > 0) {
            nyVar3.setValue((int) j4);
        } else {
            nyVar3.setValue((int) l.e());
        }
        i1(false);
        this.n1.setOverScrollMode(2);
        ge0 ge0Var = new ge0(this.a, wjbVar, context);
        this.U1 = ge0Var;
        ge0Var.setScaleX(0.6f);
        ge0Var.setScaleY(0.6f);
        ge0Var.setAlpha(0.0f);
        ge0Var.setEnabled(false);
        ge0Var.setClickable(false);
        this.c.addView(ge0Var, nme.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        ote.a(ge0Var);
        ge0Var.setOnClickListener(new ky(context, wjbVar, (byte) 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f2 = frameLayout;
        this.c.addView(frameLayout, nme.e(-1, 100, 48));
        e1();
        this.s2.O(false);
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(this.n1, getContext(), this.a, 0, true, new f(this, (byte) 10), this.J0);
        this.s2 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        return k96.M0(2131750328, null);
    }

    public final void Y0() {
        boolean z;
        float f;
        if (this.r2 && !this.J) {
            z = true;
        } else {
            z = false;
        }
        if (this.t2 != z) {
            this.t2 = z;
            ge0 ge0Var = this.U1;
            if (ge0Var != null) {
                ge0Var.setEnabled(z);
                ge0Var.setClickable(z);
                ViewPropertyAnimator animate = ge0Var.animate();
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
                ug8.s(scaleY, f3, 180L);
            }
        }
    }

    public final void Z0() {
        ny nyVar = this.X1;
        int value = nyVar.getValue();
        if (nyVar.getProgress() > 0.99f) {
            nyVar.g(k96.M0(2131750306, null));
            return;
        }
        long j = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.g2.e;
        long j2 = tL_StarGiftAuctionUserState.bid_amount;
        if (j == j2) {
            nyVar.g(k96.M0(2131750301, null));
        } else if (j2 > 0 && !tL_StarGiftAuctionUserState.returned) {
            long j3 = j - j2;
            if (j3 > 0) {
                nyVar.g("+".concat(k96.E(j3, ',')));
            } else {
                nyVar.g(null);
            }
        } else {
            nyVar.g(null);
        }
    }

    public final void a1(int i) {
        this.X1.f(de5.b(this.a, i, 3), de5.b(this.a, i, 4), true);
        g1(this.r2);
        h1(this.r2);
        d1(this.r2);
        Z0();
    }

    public final void b1(int i) {
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
        if (gta.v(this.a, false).e && gta.v(this.a, false).n(null, false, false).amount < j3) {
            new zua(getContext(), this.J0, j3, 14, null, null, 0L).show();
            return;
        }
        this.u2 = true;
        this.V1.setLoading(true);
        kt4.c(this.a).k(this.S1, this.h2, i, new jy(this, j2, (byte) 0));
    }

    public final void c1() {
        FrameLayout frameLayout;
        Drawable drawable = this.s0;
        if (drawable != null && this.b != null && (frameLayout = this.f2) != null) {
            frameLayout.setTranslationY(Math.max(0.0f, ((this.b.getY() + drawable.getBounds().top) - frameLayout.getMeasuredHeight()) + gl.L(10.0f)));
        }
    }

    @Override
    public final void d0(float f) {
        super.d0(f);
        Y0();
    }

    public final void d1(boolean z) {
        long value = this.X1.getValue();
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.g2.e;
        long j = tL_StarGiftAuctionUserState.bid_amount;
        int i = (value > j ? 1 : (value == j ? 0 : -1));
        tb tbVar = this.V1;
        if (i == 0) {
            tbVar.i(k96.M0(2131747638, null), z, true);
            tbVar.setOnClickListener(new iy(this, (byte) 0));
            return;
        }
        int i2 = (j > value ? 1 : (j == value ? 0 : -1));
        cm2[] cm2VarArr = this.q2;
        if (i2 < 0 && !tL_StarGiftAuctionUserState.returned) {
            tbVar.i(jva.Y0(false, k96.a0(null, null, 2131750322, k96.E(value - j, ',')), cm2VarArr), z, true);
        } else {
            tbVar.i(jva.Y0(false, k96.a0(null, null, 2131750323, k96.E(value, ',')), cm2VarArr), z, true);
        }
        tbVar.setOnClickListener(new iy(this, (byte) 1));
    }

    @Override
    public final void dismiss() {
        kt4.c(this.a).n(this.S1, this);
        this.W1.b();
        super.dismiss();
    }

    public final void e1() {
        int f = bm2.f(this.o2.e, bm2.f(this.p2.e, bkb.v0(bkb.K6, this.J0), bkb.v0(bkb.p7, this.J0)), bkb.v0(bkb.kk, this.J0));
        this.b2.setTextColor(f);
        hn hnVar = this.c2;
        hnVar.setTextColor(f);
        this.d2.b.setTextColor(f);
        if (bkb.F1(hnVar.getSizeableBackground(), bkb.p1(0.15f, f), false)) {
            hnVar.invalidate();
        }
    }

    public final void f1(long j, boolean z) {
        String h0;
        hn hnVar = (hn) this.Z1.b;
        int i = (j > 3600L ? 1 : (j == 3600L ? 0 : -1));
        int i2 = (int) j;
        if (i >= 0) {
            h0 = gl.j0(i2);
        } else {
            h0 = gl.h0(i2, true);
        }
        hnVar.c(h0, z, true);
    }

    public final void g1(boolean z) {
        int i;
        long value = this.X1.getValue();
        gt4 gt4Var = this.g2;
        int i2 = gt4Var.i;
        int c = gt4Var.c(ConnectionsManager.getInstance(gt4Var.a).getCurrentTime(), value);
        long max = Math.max(value, this.g2.e.bid_amount);
        ry ryVar = this.d2;
        ryVar.d.c(jva.a1(false, "⭐️".concat(k96.E((int) max, ',')), 0.78f, ryVar.e), false, true);
        if (i2 > 0) {
            c = Math.min(i2, c);
        }
        ryVar.a(c, false, z);
        gt4 gt4Var2 = this.g2;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = gt4Var2.f;
        hn hnVar = this.c2;
        if (tL_starGiftAuctionState != null && c > 0 && gt4Var2.d.title != null && gt4Var2.d() == 1) {
            gt4 gt4Var3 = this.g2;
            gt4Var3.getClass();
            if (!gt4Var3.g(ConnectionsManager.getInstance(y6c.t0).getCurrentTime())) {
                gt4 gt4Var4 = this.g2;
                if (gt4Var4.f.last_gift_num + c <= gt4Var4.d.availability_total) {
                    hnVar.setText(this.g2.d.title + " #" + k96.E(i, ','));
                    return;
                }
            }
        }
        hnVar.setText(null);
    }

    public final void h1(boolean z) {
        boolean z2;
        int d = this.g2.d();
        int i = (this.X1.getValue() > this.g2.e.bid_amount ? 1 : (this.X1.getValue() == this.g2.e.bid_amount ? 0 : -1));
        ld5 ld5Var = this.b2;
        boolean z3 = false;
        if (i > 0) {
            ld5Var.c(k96.M0(2131750355, null), z);
        } else {
            z2 = true;
            if (d == 2) {
                ld5Var.c(k96.M0(2131750353, null), z);
            } else if (d == 3) {
                ld5Var.c(k96.M0(2131750353, null), z);
            } else if (d == 1) {
                ld5Var.c(k96.M0(2131750352, null), z);
                z2 = false;
                z3 = true;
            } else {
                ld5Var.c(k96.M0(2131750355, null), z);
            }
            this.o2.a(z3, z);
            this.p2.a(z2, z);
        }
        z2 = false;
        this.o2.a(z3, z);
        this.p2.a(z2, z);
    }

    public final void i1(boolean z) {
        String o0;
        d Q;
        int i;
        hn hnVar = (hn) this.Y1.b;
        StringBuilder sb = new StringBuilder("⭐️");
        long e = (int) this.g2.e();
        if (e < 1000000) {
            o0 = k96.E(e, ',');
        } else {
            o0 = gl.o0((int) e, 1000000);
        }
        sb.append(o0);
        hnVar.c(jva.a1(false, sb.toString(), 0.78f, this.m2), z, true);
        if (this.g2.f != null) {
            int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
            boolean g = this.g2.g(currentTime);
            gt4 gt4Var = this.g2;
            hx2 hx2Var = this.W1;
            if (g) {
                long max = Math.max(0, gt4Var.f.start_date - currentTime);
                hx2Var.a(max);
                f1(max, z);
            } else {
                long max2 = Math.max(0, gt4Var.f.next_round_at - currentTime);
                hx2Var.a(max2);
                f1(max2, z);
            }
            gm gmVar = this.n2;
            st stVar = this.a2;
            if (gmVar == null && this.g2.d.sticker != null) {
                this.n2 = new gm(this.g2.d.sticker.id, ((hn) stVar.b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.n2 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.n2, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) k96.E(this.g2.f.gifts_left, ','));
            ((hn) stVar.b).c(spannableStringBuilder, z, true);
            TextView textView = (TextView) this.Z1.c;
            gt4 gt4Var2 = this.g2;
            gt4Var2.getClass();
            if (gt4Var2.g(ConnectionsManager.getInstance(y6c.t0).getCurrentTime())) {
                i = 2131750356;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.g2.f;
                if (tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds) {
                    i = 2131750358;
                } else {
                    i = 2131750357;
                }
            }
            textView.setText(k96.M0(i, null));
            ry[] ryVarArr = this.e2;
            int min = Math.min(ryVarArr.length, this.g2.f.top_bidders.size());
            if (min > 0) {
                int i2 = 0;
                while (i2 < min) {
                    int i3 = i2 + 1;
                    Long l = this.g2.f.top_bidders.get(i2);
                    long longValue = l.longValue();
                    TLRPC.User V1 = na7.q1(this.a).V1(l);
                    if (V1 != null) {
                        ryVarArr[i2].b(V1);
                    }
                    ry ryVar = ryVarArr[i2];
                    ryVar.d.c(jva.a1(false, "⭐️".concat(k96.E((int) this.g2.b(i3), ',')), 0.78f, ryVar.e), z, true);
                    ryVarArr[i2].setOnClickListener(new ly(this, longValue, (byte) 0));
                    i2 = i3;
                }
            }
        }
        gt4 gt4Var3 = this.g2;
        ny nyVar = this.X1;
        nyVar.setStarsTop(gt4Var3.b(gt4Var3.d.gifts_per_round) + 1);
        nyVar.setTopText(k96.G(this.g2.d.gifts_per_round, "StarsReactionTopX", new Object[0]));
        g1(z);
        h1(z);
        d1(z);
        Z0();
        long n = cf3.n(this.g2.e.peer);
        long j = this.g2.e.acquired_count;
        if (this.k2 < j && !this.l2 && (Q = LaunchActivity.Q()) != null) {
            long j2 = this.j2;
            if (j2 != 0) {
                mu1 W9 = mu1.W9(j2);
                W9.whenFullyVisible(new my(W9, (byte) 0));
                Q.presentFragment(W9);
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
        Y0();
        m21.h(this.c);
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            if (this.b2 != null && this.c2 != null && this.d2 != null) {
                e1();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void r(gt4 gt4Var) {
        this.g2 = gt4Var;
        i1(this.r2);
    }

    @Override
    public final void x() {
        this.r2 = true;
        Y0();
        m21.a(this.c, new oy((byte) 0));
    }
}
