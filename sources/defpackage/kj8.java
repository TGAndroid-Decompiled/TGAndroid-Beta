package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
public final class kj8 extends my0 implements jm7 {
    public static final int I1 = 0;
    public int A1;
    public int B1;
    public float C1;
    public final ik8 D1;
    public int E1;
    public int F1;
    public int G1;
    public x20 H1;
    public final d l1;
    public final cj8 m1;
    public final ArrayList n1;
    public float o1;
    public float p1;
    public boolean q1;
    public final hj8 r1;
    public final su s1;
    public int t1;
    public final FrameLayout u1;
    public boolean v1;
    public final meb w1;
    public final byte x1;
    public final boolean y1;
    public boolean z1;

    public kj8(d dVar, Context context, int i, boolean z, int i2, boolean z2, ik8 ik8Var, ylb ylbVar) {
        super(1, ylbVar, context, false);
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        this.E1 = 255;
        this.l1 = dVar;
        this.D1 = ik8Var;
        L(cmb.g5);
        this.x1 = i2;
        this.y1 = z2;
        this.w1 = neb.h(gm.v2(null, 2131624210));
        ne6 ne6Var = new ne6((byte) 11, getContext(), this);
        if (!z && i2 != 35) {
            PremiumPreviewFragment.r0(i, arrayList);
        } else {
            PremiumPreviewFragment.q0(i, arrayList, false);
            PremiumPreviewFragment.q0(i, arrayList, true);
        }
        if (i2 == 40) {
            arrayList.clear();
            arrayList.add(new hk8(40, 2131231220, jb6.M0(2131750774, null), jb6.M0(2131750773, null)));
        }
        int i3 = 0;
        while (true) {
            if (i3 < this.n1.size()) {
                if (((hk8) this.n1.get(i3)).a == i2) {
                    break;
                }
                i3++;
            } else {
                i3 = 0;
                break;
            }
        }
        if (z2) {
            this.n1.clear();
            this.n1.add((hk8) this.n1.get(i3));
            i3 = 0;
        }
        hk8 hk8Var = (hk8) this.n1.get(i3);
        this.v0 = false;
        this.w0 = false;
        this.T0 = false;
        nj8 nj8Var = new nj8(cmb.Qk, cmb.Rk, cmb.Sk, -1, null);
        nj8Var.o = 1.1f;
        nj8Var.p = 1.5f;
        nj8Var.q = -0.2f;
        nj8Var.m = true;
        su suVar = new su(this, getContext(), nj8Var, (byte) 25);
        this.s1 = suVar;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.u1 = frameLayout;
        frameLayout.setContentDescription(jb6.M0(2131751978, null));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(2131232102);
        int L = gm.L(12.0f);
        int p = on2.p(-1, 40);
        int p2 = on2.p(-1, 100);
        imageView.setBackground(cmb.i0(L, L, L, L, p, p2, p2));
        frameLayout.addView(imageView, qoe.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final kj8 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                kj8 kj8Var = this.b;
                switch (b) {
                    case 0:
                        kj8Var.dismiss();
                        return;
                    default:
                        kj8Var.dismiss();
                        return;
                }
            }
        });
        ne6Var.addView(suVar, qoe.t(-1, -2, 1, 0, 16, 0, 0));
        hj8 hj8Var = new hj8(this, getContext());
        this.r1 = hj8Var;
        hj8Var.setOverScrollMode(2);
        hj8Var.setOffscreenPageLimit(0);
        hj8Var.setAdapter(new db5(this, (byte) 2));
        this.A1 = i3;
        hj8Var.setCurrentItem(i3);
        ne6Var.addView(hj8Var, qoe.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        ne6Var.addView(frameLayout, qoe.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        yx0 yx0Var = new yx0(getContext(), hj8Var, this.n1.size());
        hj8Var.b(new ij8(this, yx0Var, (byte) 0));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(ne6Var);
        linearLayout.setOrientation(1);
        int i4 = cmb.U8;
        int i5 = cmb.O9;
        yx0Var.n = i4;
        yx0Var.r = i5;
        if (!z2) {
            linearLayout.addView(yx0Var, qoe.t(this.n1.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        cj8 cj8Var = new cj8(ylbVar, getContext(), true);
        this.m1 = cj8Var;
        cj8Var.w.setOnClickListener(new x73(this, dVar, z2, hk8Var, (byte) 5));
        cj8Var.h.setOnClickListener(new View.OnClickListener(this) {
            public final kj8 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                kj8 kj8Var = this.b;
                switch (b) {
                    case 0:
                        kj8Var.dismiss();
                        return;
                    default:
                        kj8Var.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(cj8Var, qoe.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        anb.h(cmb.g5, ylbVar, frameLayout2);
        linearLayout.addView(frameLayout2, qoe.r(-1, 68, 80));
        if (i2 == 40) {
            cj8Var.c(wsa.k2(jb6.M0(2131743575, null)), true, false);
        } else if (z8c.h(i).p()) {
            cj8Var.c(jb6.M0(2131747564, null), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        this.O = scrollView;
        hs6.d0(i).p1();
        E0();
        this.U0 = (byte) 83;
        jp0 jp0Var = new jp0(this, getContext(), scrollView, getContext().getDrawable(2131231241).mutate());
        this.b = jp0Var;
        int i6 = this.u0;
        jp0Var.setPadding(i6, this.t0 - 1, i6, 0);
    }

    @Override
    public final boolean C() {
        int i = 0;
        while (true) {
            hj8 hj8Var = this.r1;
            if (i >= hj8Var.getChildCount()) {
                return true;
            }
            jj8 jj8Var = (jj8) hj8Var.getChildAt(i);
            if (jj8Var.a == this.A1) {
                ViewGroup viewGroup = jj8Var.f;
                if (viewGroup instanceof lh0) {
                    return !((lh0) viewGroup).b.canScrollVertically(-1);
                }
            }
            i++;
        }
    }

    public final void D0() {
        hj8 hj8Var;
        int i;
        float f;
        View m;
        View m2;
        int i2 = -1;
        boolean z = false;
        int i3 = -1;
        int i4 = 0;
        while (true) {
            hj8Var = this.r1;
            if (i4 >= hj8Var.getChildCount()) {
                break;
            }
            jj8 jj8Var = (jj8) hj8Var.getChildAt(i4);
            int i5 = jj8Var.a;
            ViewGroup viewGroup = jj8Var.f;
            if (i5 == this.A1 && (viewGroup instanceof lh0) && ((m2 = ((lh0) viewGroup).c.m(0)) == null || (i2 = m2.getTop()) < 0)) {
                i2 = 0;
            }
            if (jj8Var.a == this.B1 && (viewGroup instanceof lh0) && ((m = ((lh0) viewGroup).c.m(0)) == null || (i3 = m.getTop()) < 0)) {
                i3 = 0;
            }
            i4++;
        }
        int i6 = this.F1;
        if (i2 >= 0) {
            float f2 = 1.0f - this.C1;
            i6 = Math.min(i6, (int) td4.A(1.0f, f2, i6, i2 * f2));
        }
        if (i3 >= 0) {
            float f3 = this.C1;
            i6 = Math.min(i6, (int) td4.A(1.0f, f3, this.F1, i3 * f3));
        }
        FrameLayout frameLayout = this.u1;
        frameLayout.setAlpha(1.0f - this.p1);
        if (this.o1 == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z2 = this.q1;
        su suVar = this.s1;
        if (z2) {
            i = suVar.getMeasuredWidth();
        } else {
            i = -suVar.getMeasuredWidth();
        }
        suVar.setTranslationX(i * this.p1);
        if (i6 != this.G1) {
            this.G1 = i6;
            for (int i7 = 0; i7 < hj8Var.getChildCount(); i7++) {
                if (!((jj8) hj8Var.getChildAt(i7)).h) {
                    hj8Var.getChildAt(i7).setTranslationY(this.G1);
                }
            }
            suVar.setTranslationY(this.G1);
            frameLayout.setTranslationY(this.G1);
            this.b.invalidate();
            int i8 = this.G1;
            if (this.x1 == 40) {
                f = 5.0f;
            } else {
                f = 30.0f;
            }
            if (i8 < gm.L(f)) {
                z = true;
            }
            gm.T3(this.H1, z, 1.0f, true, true);
        }
    }

    public final void E0() {
        boolean z = this.z1;
        cj8 cj8Var = this.m1;
        if (z) {
            cj8Var.f.setText(jb6.M0(2131754942, null));
        } else if (this.y1) {
            byte b = this.x1;
            if (b == 4) {
                cj8Var.f.setText(jb6.M0(2131743546, null));
                cj8Var.setIcon(2131624310);
            } else if (b == 10) {
                cj8Var.f.setText(jb6.M0(2131743547, null));
                cj8Var.setIcon(2131624310);
            } else {
                cj8Var.f.setText(jb6.M0(2131754942, null));
            }
        } else {
            cj8Var.f.setText(PremiumPreviewFragment.s0(this.a, this.D1));
        }
    }

    public final void F0() {
        this.z1 = true;
        cj8 cj8Var = this.m1;
        cj8Var.r = false;
        cj8Var.d(true);
        E0();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != nm7.n5 && i != nm7.k5) {
            if (i == nm7.j5) {
                boolean p = z8c.h(this.a).p();
                cj8 cj8Var = this.m1;
                if (p) {
                    cj8Var.c(jb6.M0(2131747564, null), false, true);
                    return;
                }
                cj8Var.r = false;
                cj8Var.d(true);
                return;
            }
            return;
        }
        E0();
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        nm7.e().n(this, nm7.n5);
        nm7.f(this.a).n(this, nm7.k5);
        nm7.f(this.a).n(this, nm7.j5);
        nm7.e().k(nm7.k1, 16);
    }

    @Override
    public final boolean j0() {
        hj8 hj8Var = this.r1;
        if (hj8Var.getChildCount() > 0) {
            jj8 jj8Var = (jj8) hj8Var.getChildAt(0);
            ViewGroup viewGroup = jj8Var.f;
            if (viewGroup instanceof zi8) {
                zi8 zi8Var = (zi8) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(jj8Var.getMeasuredWidth(), 0.0f);
                zi8Var.setOffset(jj8Var.getMeasuredWidth());
                this.v1 = true;
                ofFloat.addUpdateListener(new af0(zi8Var, (byte) 11));
                ofFloat.addListener(new ic8((Object) this, (Object) zi8Var, (byte) 1));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(d53.h);
                ofFloat.start();
            }
        }
        return false;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        nm7.e().b(this, nm7.n5);
        nm7.f(this.a).b(this, nm7.k5);
        nm7.f(this.a).b(this, nm7.j5);
        x20 x20Var = new x20((byte) 5, getContext(), this);
        this.H1 = x20Var;
        anb.h(cmb.g5, this.J0, x20Var);
        anb.l(this.H1, 5, cmb.F6, this.J0);
        anb.l(this.H1, 3, cmb.y8, this.J0);
        x20 x20Var2 = this.H1;
        int i = cmb.x8;
        anb.l(x20Var2, 1, i, this.J0);
        anb.b(this.H1, i, this.J0, true);
        this.H1.setCastShadows(true);
        this.H1.setExtraHeight(gm.L(2.0f));
        this.H1.setBackButtonImage(2131231244);
        this.H1.setActionBarMenuOnItemClick(new wl5(this, (byte) 26));
        this.b.addView(this.H1, qoe.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.H1.getLayoutParams()).topMargin = (-this.t0) - gm.L(2.0f);
        gm.T3(this.H1, false, 1.0f, true, false);
        int i2 = this.A1;
        ArrayList arrayList = this.n1;
        if (((hk8) arrayList.get(i2)).a == 14) {
            this.H1.setTitle(jb6.M0(2131743492, null));
            this.H1.requestLayout();
        } else if (((hk8) arrayList.get(this.A1)).a == 28) {
            this.H1.setTitle(jb6.M0(2131743937, null));
            this.H1.requestLayout();
        } else {
            byte b = ((hk8) arrayList.get(this.A1)).a;
            x20 x20Var3 = this.H1;
            if (b == 40) {
                x20Var3.setTitle(jb6.M0(2131750774, null));
                this.H1.requestLayout();
                return;
            }
            x20Var3.setTitle(jb6.M0(2131751286, null));
            this.H1.requestLayout();
        }
    }

    @Override
    public final void show() {
        super.show();
        nm7.e().k(nm7.j1, 16);
    }

    public kj8(d dVar, int i, boolean z) {
        this(dVar, dVar.getContext(), dVar.getCurrentAccount(), false, i, z, null);
    }

    public kj8(d dVar, Context context, int i, int i2, boolean z) {
        this(dVar, context, i, false, i2, z, null);
    }

    public kj8(org.telegram.ui.ActionBar.d r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, defpackage.ik8 r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj8.<init>(org.telegram.ui.ActionBar.d, android.content.Context, int, boolean, int, boolean, ik8):void");
    }

    public kj8(int i, ylb ylbVar, Context context) {
        this(null, context, z8c.t0, false, i, true, null, ylbVar);
    }
}
