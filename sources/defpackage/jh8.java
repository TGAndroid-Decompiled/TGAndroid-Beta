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
public final class jh8 extends fx0 implements gk7 {
    public static final int I1 = 0;
    public int A1;
    public int B1;
    public float C1;
    public final gi8 D1;
    public int E1;
    public int F1;
    public int G1;
    public x10 H1;
    public final d l1;
    public final ah8 m1;
    public final ArrayList n1;
    public float o1;
    public float p1;
    public boolean q1;
    public final gh8 r1;
    public final st s1;
    public int t1;
    public final FrameLayout u1;
    public boolean v1;
    public final kcb w1;
    public final byte x1;
    public final boolean y1;
    public boolean z1;

    public jh8(d dVar, Context context, int i, boolean z, int i2, boolean z2, gi8 gi8Var, wjb wjbVar) {
        super(1, wjbVar, context, false);
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        this.E1 = 255;
        this.l1 = dVar;
        this.D1 = gi8Var;
        M(bkb.g5);
        this.x1 = i2;
        this.y1 = z2;
        this.w1 = lcb.h(gl.v2(null, 2131624211));
        oc6 oc6Var = new oc6((byte) 11, getContext(), this);
        if (!z && i2 != 35) {
            PremiumPreviewFragment.q0(i, arrayList);
        } else {
            PremiumPreviewFragment.p0(i, arrayList, false);
            PremiumPreviewFragment.p0(i, arrayList, true);
        }
        if (i2 == 40) {
            arrayList.clear();
            arrayList.add(new fi8(40, 2131231219, k96.M0(2131750825, null), k96.M0(2131750824, null)));
        }
        int i3 = 0;
        while (true) {
            if (i3 < this.n1.size()) {
                if (((fi8) this.n1.get(i3)).a == i2) {
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
            this.n1.add((fi8) this.n1.get(i3));
            i3 = 0;
        }
        fi8 fi8Var = (fi8) this.n1.get(i3);
        this.v0 = false;
        this.w0 = false;
        this.T0 = false;
        mh8 mh8Var = new mh8(bkb.Qk, bkb.Rk, bkb.Sk, -1, null);
        mh8Var.o = 1.1f;
        mh8Var.p = 1.5f;
        mh8Var.q = -0.2f;
        mh8Var.m = true;
        st stVar = new st(this, getContext(), mh8Var, (byte) 24);
        this.s1 = stVar;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.u1 = frameLayout;
        frameLayout.setContentDescription(k96.M0(2131752029, null));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(2131232101);
        int L = gl.L(12.0f);
        int o = bm2.o(-1, 40);
        int o2 = bm2.o(-1, 100);
        imageView.setBackground(bkb.i0(L, L, L, L, o, o2, o2));
        frameLayout.addView(imageView, nme.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final jh8 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                jh8 jh8Var = this.b;
                switch (b) {
                    case 0:
                        jh8Var.dismiss();
                        return;
                    default:
                        jh8Var.dismiss();
                        return;
                }
            }
        });
        oc6Var.addView(stVar, nme.t(-1, -2, 1, 0, 16, 0, 0));
        gh8 gh8Var = new gh8(this, getContext());
        this.r1 = gh8Var;
        gh8Var.setOverScrollMode(2);
        gh8Var.setOffscreenPageLimit(0);
        gh8Var.setAdapter(new f95(this, (byte) 2));
        this.A1 = i3;
        gh8Var.setCurrentItem(i3);
        oc6Var.addView(gh8Var, nme.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        oc6Var.addView(frameLayout, nme.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        qw0 qw0Var = new qw0(getContext(), gh8Var, this.n1.size());
        gh8Var.b(new hh8(this, qw0Var, (byte) 0));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(oc6Var);
        linearLayout.setOrientation(1);
        int i4 = bkb.U8;
        int i5 = bkb.O9;
        qw0Var.n = i4;
        qw0Var.r = i5;
        if (!z2) {
            linearLayout.addView(qw0Var, nme.t(this.n1.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        ah8 ah8Var = new ah8(wjbVar, getContext(), true);
        this.m1 = ah8Var;
        ah8Var.w.setOnClickListener(new l63(this, dVar, z2, fi8Var, (byte) 5));
        ah8Var.h.setOnClickListener(new View.OnClickListener(this) {
            public final jh8 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                jh8 jh8Var = this.b;
                switch (b) {
                    case 0:
                        jh8Var.dismiss();
                        return;
                    default:
                        jh8Var.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(ah8Var, nme.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        zkb.h(bkb.g5, wjbVar, frameLayout2);
        linearLayout.addView(frameLayout2, nme.r(-1, 68, 80));
        if (i2 == 40) {
            ah8Var.c(vqa.k2(k96.M0(2131743649, null)), true, false);
        } else if (y6c.h(i).p()) {
            ah8Var.c(k96.M0(2131747638, null), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        this.O = scrollView;
        hq6.d0(i).p1();
        E0();
        this.U0 = (byte) 83;
        jo0 jo0Var = new jo0(this, getContext(), scrollView, getContext().getDrawable(2131231240).mutate());
        this.b = jo0Var;
        int i6 = this.u0;
        jo0Var.setPadding(i6, this.t0 - 1, i6, 0);
    }

    public final void D0() {
        gh8 gh8Var;
        int i;
        float f;
        View m;
        View m2;
        int i2 = -1;
        boolean z = false;
        int i3 = -1;
        int i4 = 0;
        while (true) {
            gh8Var = this.r1;
            if (i4 >= gh8Var.getChildCount()) {
                break;
            }
            ih8 ih8Var = (ih8) gh8Var.getChildAt(i4);
            int i5 = ih8Var.a;
            ViewGroup viewGroup = ih8Var.f;
            if (i5 == this.A1 && (viewGroup instanceof kg0) && ((m2 = ((kg0) viewGroup).c.m(0)) == null || (i2 = m2.getTop()) < 0)) {
                i2 = 0;
            }
            if (ih8Var.a == this.B1 && (viewGroup instanceof kg0) && ((m = ((kg0) viewGroup).c.m(0)) == null || (i3 = m.getTop()) < 0)) {
                i3 = 0;
            }
            i4++;
        }
        int i6 = this.F1;
        if (i2 >= 0) {
            float f2 = 1.0f - this.C1;
            i6 = Math.min(i6, (int) tb4.A(1.0f, f2, i6, i2 * f2));
        }
        if (i3 >= 0) {
            float f3 = this.C1;
            i6 = Math.min(i6, (int) tb4.A(1.0f, f3, this.F1, i3 * f3));
        }
        FrameLayout frameLayout = this.u1;
        frameLayout.setAlpha(1.0f - this.p1);
        if (this.o1 == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z2 = this.q1;
        st stVar = this.s1;
        if (z2) {
            i = stVar.getMeasuredWidth();
        } else {
            i = -stVar.getMeasuredWidth();
        }
        stVar.setTranslationX(i * this.p1);
        if (i6 != this.G1) {
            this.G1 = i6;
            for (int i7 = 0; i7 < gh8Var.getChildCount(); i7++) {
                if (!((ih8) gh8Var.getChildAt(i7)).h) {
                    gh8Var.getChildAt(i7).setTranslationY(this.G1);
                }
            }
            stVar.setTranslationY(this.G1);
            frameLayout.setTranslationY(this.G1);
            this.b.invalidate();
            int i8 = this.G1;
            if (this.x1 == 40) {
                f = 5.0f;
            } else {
                f = 30.0f;
            }
            if (i8 < gl.L(f)) {
                z = true;
            }
            gl.U3(this.H1, z, 1.0f, true, true);
        }
    }

    @Override
    public final boolean E() {
        int i = 0;
        while (true) {
            gh8 gh8Var = this.r1;
            if (i >= gh8Var.getChildCount()) {
                return true;
            }
            ih8 ih8Var = (ih8) gh8Var.getChildAt(i);
            if (ih8Var.a == this.A1) {
                ViewGroup viewGroup = ih8Var.f;
                if (viewGroup instanceof kg0) {
                    return !((kg0) viewGroup).b.canScrollVertically(-1);
                }
            }
            i++;
        }
    }

    public final void E0() {
        boolean z = this.z1;
        ah8 ah8Var = this.m1;
        if (z) {
            ah8Var.f.setText(k96.M0(2131754942, null));
        } else if (this.y1) {
            byte b = this.x1;
            if (b == 4) {
                ah8Var.f.setText(k96.M0(2131743620, null));
                ah8Var.setIcon(2131624310);
            } else if (b == 10) {
                ah8Var.f.setText(k96.M0(2131743621, null));
                ah8Var.setIcon(2131624310);
            } else {
                ah8Var.f.setText(k96.M0(2131754942, null));
            }
        } else {
            ah8Var.f.setText(PremiumPreviewFragment.r0(this.a, this.D1));
        }
    }

    public final void F0() {
        this.z1 = true;
        ah8 ah8Var = this.m1;
        ah8Var.r = false;
        ah8Var.d(true);
        E0();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != kk7.l5 && i != kk7.i5) {
            if (i == kk7.h5) {
                boolean p = y6c.h(this.a).p();
                ah8 ah8Var = this.m1;
                if (p) {
                    ah8Var.c(k96.M0(2131747638, null), false, true);
                    return;
                }
                ah8Var.r = false;
                ah8Var.d(true);
                return;
            }
            return;
        }
        E0();
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        kk7.e().n(this, kk7.l5);
        kk7.f(this.a).n(this, kk7.i5);
        kk7.f(this.a).n(this, kk7.h5);
        kk7.e().k(kk7.j1, 16);
    }

    @Override
    public final boolean j0() {
        gh8 gh8Var = this.r1;
        if (gh8Var.getChildCount() > 0) {
            ih8 ih8Var = (ih8) gh8Var.getChildAt(0);
            ViewGroup viewGroup = ih8Var.f;
            if (viewGroup instanceof xg8) {
                xg8 xg8Var = (xg8) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(ih8Var.getMeasuredWidth(), 0.0f);
                xg8Var.setOffset(ih8Var.getMeasuredWidth());
                this.v1 = true;
                ofFloat.addUpdateListener(new ae0(xg8Var, (byte) 11));
                ofFloat.addListener(new eh8((Object) this, (Object) xg8Var, (byte) 0));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(s33.h);
                ofFloat.start();
            }
        }
        return false;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        kk7.e().b(this, kk7.l5);
        kk7.f(this.a).b(this, kk7.i5);
        kk7.f(this.a).b(this, kk7.h5);
        x10 x10Var = new x10((byte) 5, getContext(), this);
        this.H1 = x10Var;
        zkb.h(bkb.g5, this.J0, x10Var);
        zkb.l(this.H1, 5, bkb.F6, this.J0);
        zkb.l(this.H1, 3, bkb.y8, this.J0);
        x10 x10Var2 = this.H1;
        int i = bkb.x8;
        zkb.l(x10Var2, 1, i, this.J0);
        zkb.b(this.H1, i, this.J0, true);
        this.H1.setCastShadows(true);
        this.H1.setExtraHeight(gl.L(2.0f));
        this.H1.setBackButtonImage(2131231243);
        this.H1.setActionBarMenuOnItemClick(new bq5(this, (byte) 25));
        this.b.addView(this.H1, nme.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.H1.getLayoutParams()).topMargin = (-this.t0) - gl.L(2.0f);
        gl.U3(this.H1, false, 1.0f, true, false);
        int i2 = this.A1;
        ArrayList arrayList = this.n1;
        if (((fi8) arrayList.get(i2)).a == 14) {
            this.H1.setTitle(k96.M0(2131743566, null));
            this.H1.requestLayout();
        } else if (((fi8) arrayList.get(this.A1)).a == 28) {
            this.H1.setTitle(k96.M0(2131744011, null));
            this.H1.requestLayout();
        } else {
            byte b = ((fi8) arrayList.get(this.A1)).a;
            x10 x10Var3 = this.H1;
            if (b == 40) {
                x10Var3.setTitle(k96.M0(2131750825, null));
                this.H1.requestLayout();
                return;
            }
            x10Var3.setTitle(k96.M0(2131751337, null));
            this.H1.requestLayout();
        }
    }

    @Override
    public final void show() {
        super.show();
        kk7.e().k(kk7.i1, 16);
    }

    public jh8(d dVar, int i, boolean z) {
        this(dVar, dVar.getContext(), dVar.getCurrentAccount(), false, i, z, null);
    }

    public jh8(d dVar, Context context, int i, int i2, boolean z) {
        this(dVar, context, i, false, i2, z, null);
    }

    public jh8(org.telegram.ui.ActionBar.d r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, defpackage.gi8 r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh8.<init>(org.telegram.ui.ActionBar.d, android.content.Context, int, boolean, int, boolean, gi8):void");
    }

    public jh8(int i, wjb wjbVar, Context context) {
        this(null, context, y6c.t0, false, i, true, null, wjbVar);
    }
}
