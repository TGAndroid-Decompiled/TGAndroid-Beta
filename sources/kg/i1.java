package kg;

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
import org.telegram.messenger.at;
import org.telegram.messenger.d00;
import org.telegram.messenger.dd;
import org.telegram.messenger.e00;
import org.telegram.messenger.e20;
import org.telegram.messenger.vi;
import org.telegram.messenger.vs;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.y9;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.du0;
import org.telegram.ui.eu0;
import rh.e4;
import w7.b6;
public final class i1 extends z2 implements vs {
    public static final int F1 = 0;
    public final eu0 A1;
    public int B1;
    public int C1;
    public int D1;
    public g1 E1;
    public final org.telegram.ui.ActionBar.k2 f11111i1;
    public final x0 f11112j1;
    public final ArrayList f11113k1;
    public float l1;
    public float f11114m1;
    public boolean f11115n1;
    public final d1 f11116o1;
    public final fg.i f11117p1;
    public int f11118q1;
    public final FrameLayout f11119r1;
    public boolean f11120s1;
    public final d00 f11121t1;
    public final int f11122u1;
    public final boolean f11123v1;
    public boolean f11124w1;
    public int f11125x1;
    public int f11126y1;
    public float f11127z1;

    public i1(int i10, Context context, p6 p6Var) {
        this(null, context, e20.f15506s0, false, i10, true, null, p6Var);
    }

    @Override
    public final boolean H() {
        int i10 = 0;
        while (true) {
            d1 d1Var = this.f11116o1;
            if (i10 >= d1Var.getChildCount()) {
                return true;
            }
            h1 h1Var = (h1) d1Var.getChildAt(i10);
            if (h1Var.f11101a == this.f11125x1) {
                ViewGroup viewGroup = h1Var.f11104f;
                if (viewGroup instanceof a) {
                    return !((a) viewGroup).f10990b.canScrollVertically(-1);
                }
            }
            i10++;
        }
    }

    public final void I0() {
        d1 d1Var;
        int i10;
        float f7;
        View m10;
        View m11;
        int i11 = -1;
        boolean z10 = false;
        int i12 = -1;
        int i13 = 0;
        while (true) {
            d1Var = this.f11116o1;
            if (i13 >= d1Var.getChildCount()) {
                break;
            }
            h1 h1Var = (h1) d1Var.getChildAt(i13);
            int i14 = h1Var.f11101a;
            ViewGroup viewGroup = h1Var.f11104f;
            if (i14 == this.f11125x1 && (viewGroup instanceof a) && ((m11 = ((a) viewGroup).f10991c.m(0)) == null || (i11 = m11.getTop()) < 0)) {
                i11 = 0;
            }
            if (h1Var.f11101a == this.f11126y1 && (viewGroup instanceof a) && ((m10 = ((a) viewGroup).f10991c.m(0)) == null || (i12 = m10.getTop()) < 0)) {
                i12 = 0;
            }
            i13++;
        }
        int i15 = this.C1;
        if (i11 >= 0) {
            float f10 = 1.0f - this.f11127z1;
            i15 = Math.min(i15, (int) c3.i0.z(1.0f, f10, i15, i11 * f10));
        }
        if (i12 >= 0) {
            float f11 = this.f11127z1;
            i15 = Math.min(i15, (int) c3.i0.z(1.0f, f11, this.C1, i12 * f11));
        }
        FrameLayout frameLayout = this.f11119r1;
        frameLayout.setAlpha(1.0f - this.f11114m1);
        if (this.l1 == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z11 = this.f11115n1;
        fg.i iVar = this.f11117p1;
        if (z11) {
            i10 = iVar.getMeasuredWidth();
        } else {
            i10 = -iVar.getMeasuredWidth();
        }
        iVar.setTranslationX(i10 * this.f11114m1);
        if (i15 != this.D1) {
            this.D1 = i15;
            for (int i16 = 0; i16 < d1Var.getChildCount(); i16++) {
                if (!((h1) d1Var.getChildAt(i16)).h) {
                    d1Var.getChildAt(i16).setTranslationY(this.D1);
                }
            }
            iVar.setTranslationY(this.D1);
            frameLayout.setTranslationY(this.D1);
            this.f21587b.invalidate();
            int i17 = this.D1;
            if (this.f11122u1 == 40) {
                f7 = 5.0f;
            } else {
                f7 = 30.0f;
            }
            if (i17 < org.telegram.messenger.i0.L(f7)) {
                z10 = true;
            }
            org.telegram.messenger.i0.Y3(this.E1, z10, 1.0f, true, true);
        }
    }

    public final void J0() {
        boolean z10 = this.f11124w1;
        x0 x0Var = this.f11112j1;
        if (z10) {
            x0Var.f11328f.setText(dd.L0(2131754942, null));
        } else if (this.f11123v1) {
            int i10 = this.f11122u1;
            if (i10 == 4) {
                x0Var.f11328f.setText(dd.L0(2131743884, null));
                x0Var.setIcon(2131624312);
            } else if (i10 == 10) {
                x0Var.f11328f.setText(dd.L0(2131743885, null));
                x0Var.setIcon(2131624312);
            } else {
                x0Var.f11328f.setText(dd.L0(2131754942, null));
            }
        } else {
            x0Var.f11328f.setText(PremiumPreviewFragment.t0(this.f21584a, this.A1));
        }
    }

    public final void K0() {
        this.f11124w1 = true;
        x0 x0Var = this.f11112j1;
        x0Var.f11330r = false;
        x0Var.d(true);
        J0();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != at.f14733j5 && i10 != at.f14715g5) {
            if (i10 == at.f14709f5) {
                boolean q6 = e20.i(this.f21584a).q();
                x0 x0Var = this.f11112j1;
                if (q6) {
                    x0Var.c(dd.L0(2131747847, null), false, true);
                    return;
                }
                x0Var.f11330r = false;
                x0Var.d(true);
                return;
            }
            return;
        }
        J0();
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        at.e().n(this, at.f14733j5);
        at.f(this.f21584a).n(this, at.f14715g5);
        at.f(this.f21584a).n(this, at.f14709f5);
        at.e().k(at.f14735k1, 16);
    }

    @Override
    public final boolean m0() {
        d1 d1Var = this.f11116o1;
        if (d1Var.getChildCount() > 0) {
            h1 h1Var = (h1) d1Var.getChildAt(0);
            ViewGroup viewGroup = h1Var.f11104f;
            if (viewGroup instanceof v0) {
                v0 v0Var = (v0) viewGroup;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(h1Var.getMeasuredWidth(), 0.0f);
                v0Var.setOffset(h1Var.getMeasuredWidth());
                this.f11120s1 = true;
                ofFloat.addUpdateListener(new bg.o(v0Var, 3));
                ofFloat.addListener(new bg.f(5, this, v0Var));
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(gr.h);
                ofFloat.start();
            }
        }
        return false;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        at.e().c(this, at.f14733j5);
        at.f(this.f21584a).c(this, at.f14715g5);
        at.f(this.f21584a).c(this, at.f14709f5);
        g1 g1Var = new g1(this, getContext(), 0);
        this.E1 = g1Var;
        a7.i(t6.f21002h5, g1Var, this.I0);
        a7.m(this.E1, 5, t6.G6, this.I0);
        a7.m(this.E1, 3, t6.f21333z8, this.I0);
        g1 g1Var2 = this.E1;
        int i10 = t6.f21314y8;
        a7.m(g1Var2, 1, i10, this.I0);
        a7.b(this.E1, i10, this.I0, true);
        this.E1.setCastShadows(true);
        this.E1.setExtraHeight(org.telegram.messenger.i0.L(2.0f));
        this.E1.setBackButtonImage(2131231241);
        this.E1.setActionBarMenuOnItemClick(new ag.e(this, 9));
        this.f21587b.addView(this.E1, b6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.E1.getLayoutParams()).topMargin = (-this.f21615s0) - org.telegram.messenger.i0.L(2.0f);
        org.telegram.messenger.i0.Y3(this.E1, false, 1.0f, true, false);
        int i11 = this.f11125x1;
        ArrayList arrayList = this.f11113k1;
        if (((du0) arrayList.get(i11)).f36680a == 14) {
            this.E1.setTitle(dd.L0(2131743831, null));
            this.E1.requestLayout();
        } else if (((du0) arrayList.get(this.f11125x1)).f36680a == 28) {
            this.E1.setTitle(dd.L0(2131744277, null));
            this.E1.requestLayout();
        } else if (((du0) arrayList.get(this.f11125x1)).f36680a == 40) {
            this.E1.setTitle(dd.L0(2131750838, null));
            this.E1.requestLayout();
        } else {
            this.E1.setTitle(dd.L0(2131751350, null));
            this.E1.requestLayout();
        }
    }

    @Override
    public final void show() {
        super.show();
        at.e().k(at.f14729j1, 16);
    }

    public i1(org.telegram.ui.ActionBar.k2 k2Var, int i10, boolean z10) {
        this(k2Var, k2Var.getContext(), k2Var.getCurrentAccount(), false, i10, z10, null);
    }

    public i1(org.telegram.ui.ActionBar.k2 k2Var, Context context, int i10, int i11, boolean z10) {
        this(k2Var, context, i10, false, i11, z10, null);
    }

    public i1(org.telegram.ui.ActionBar.k2 r11, android.content.Context r12, int r13, boolean r14, int r15, boolean r16, org.telegram.ui.eu0 r17) {
        throw new UnsupportedOperationException("Method not decompiled: kg.i1.<init>(org.telegram.ui.ActionBar.k2, android.content.Context, int, boolean, int, boolean, org.telegram.ui.eu0):void");
    }

    public i1(org.telegram.ui.ActionBar.k2 k2Var, Context context, int i10, boolean z10, int i11, boolean z11, eu0 eu0Var, p6 p6Var) {
        super(1, context, p6Var, false);
        ArrayList arrayList = new ArrayList();
        this.f11113k1 = arrayList;
        this.B1 = 255;
        this.f11111i1 = k2Var;
        this.A1 = eu0Var;
        Q(t6.f21002h5);
        this.f11122u1 = i11;
        this.f11123v1 = z11;
        this.f11121t1 = e00.i(org.telegram.messenger.i0.y2(null, 2131624213));
        jg.l0 l0Var = new jg.l0(this, getContext(), 5);
        if (!z10 && i11 != 35) {
            PremiumPreviewFragment.s0(i10, arrayList);
        } else {
            PremiumPreviewFragment.r0(i10, arrayList, false);
            PremiumPreviewFragment.r0(i10, arrayList, true);
        }
        if (i11 == 40) {
            arrayList.clear();
            arrayList.add(new du0(40, 2131231217, dd.L0(2131750838, null), dd.L0(2131750837, null)));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= this.f11113k1.size()) {
                i12 = 0;
                break;
            } else if (((du0) this.f11113k1.get(i12)).f36680a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (z11) {
            this.f11113k1.clear();
            this.f11113k1.add((du0) this.f11113k1.get(i12));
            i12 = 0;
        }
        du0 du0Var = (du0) this.f11113k1.get(i12);
        this.f21617u0 = false;
        this.f21618v0 = false;
        this.T0 = false;
        k1 k1Var = new k1(t6.Ok, t6.Pk, t6.Qk, -1, null);
        k1Var.f11151o = 1.1f;
        k1Var.f11152p = 1.5f;
        k1Var.f11153q = -0.2f;
        k1Var.f11149m = true;
        fg.i iVar = new fg.i(this, getContext(), k1Var, 3);
        this.f11117p1 = iVar;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f11119r1 = frameLayout;
        frameLayout.setContentDescription(dd.L0(2131752041, null));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(2131232095);
        int L = org.telegram.messenger.i0.L(12.0f);
        int o10 = i0.b.o(-1, 40);
        int o11 = i0.b.o(-1, 100);
        imageView.setBackground(t6.k0(L, L, L, L, o10, o11, o11));
        frameLayout.addView(imageView, b6.e(24, 24, 17));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final i1 f11339b;

            {
                this.f11339b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f11339b.dismiss();
                        return;
                    default:
                        this.f11339b.dismiss();
                        return;
                }
            }
        });
        l0Var.addView(iVar, b6.t(-1, -2, 1, 0, 16, 0, 0));
        d1 d1Var = new d1(this, getContext());
        this.f11116o1 = d1Var;
        d1Var.setOverScrollMode(2);
        d1Var.setOffscreenPageLimit(0);
        d1Var.setAdapter(new e1(this, 0));
        this.f11125x1 = i12;
        d1Var.setCurrentItem(i12);
        l0Var.addView(d1Var, b6.d(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        l0Var.addView(frameLayout, b6.d(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        y9 y9Var = new y9(getContext(), d1Var, this.f11113k1.size());
        d1Var.b(new f1(this, y9Var, 0));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(l0Var);
        linearLayout.setOrientation(1);
        int i13 = t6.V8;
        int i14 = t6.P9;
        y9Var.f32778n = i13;
        y9Var.f32779r = i14;
        if (!z11) {
            linearLayout.addView(y9Var, b6.t(this.f11113k1.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        x0 x0Var = new x0(getContext(), p6Var, true);
        this.f11112j1 = x0Var;
        x0Var.f11332w.setOnClickListener(new z0(this, k2Var, z11, du0Var, 0));
        x0Var.h.setOnClickListener(new View.OnClickListener(this) {
            public final i1 f11339b;

            {
                this.f11339b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f11339b.dismiss();
                        return;
                    default:
                        this.f11339b.dismiss();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(x0Var, b6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        a7.i(t6.f21002h5, frameLayout2, p6Var);
        linearLayout.addView(frameLayout2, b6.r(-1, 68, 80));
        if (i11 == 40) {
            x0Var.c(e4.g2(dd.L0(2131743913, null)), true, false);
        } else if (e20.i(i10).q()) {
            x0Var.c(dd.L0(2131747847, null), false, false);
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        this.N = scrollView;
        vi.b0(i10).o1();
        J0();
        this.U0 = 83;
        jg.b1 b1Var = new jg.b1(this, getContext(), scrollView, getContext().getDrawable(2131231238).mutate());
        this.f21587b = b1Var;
        int i15 = this.f21616t0;
        b1Var.setPadding(i15, this.f21615s0 - 1, i15, 0);
    }
}
