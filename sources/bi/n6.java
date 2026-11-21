package bi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c8.ma;
import c8.ra;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.yz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class n6 extends FrameLayout implements fs {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final hi.e H;
    public boolean I;
    public final gq0 f3944a;
    public final int f3945b;
    public final org.telegram.ui.ActionBar.h6 f3946c;
    public boolean d;
    public di.p8 f3947e;
    public final g6 f3948f;
    public boolean h;
    public int f3949n;
    public final FrameLayout f3950r;
    public final LinearLayout f3951s;
    public final TextView f3952w;
    public final TextView f3953x;
    public final FrameLayout f3954y;

    public n6(gq0 gq0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(gq0Var.getContext());
        this.f3949n = org.telegram.messenger.g0.f24146q.y;
        Context context = gq0Var.getContext();
        this.f3944a = gq0Var;
        this.f3945b = i7;
        this.f3946c = h6Var;
        g6 g6Var = new g6(context, i7, new b(this, 8), new e6(this), new e6(this), h6Var, gq0Var);
        this.f3948f = g6Var;
        g6Var.f35796g3.f34068r = false;
        g6Var.setSelectorType(9);
        g6Var.setSelectorDrawableColor(0);
        g6Var.setClipToPadding(false);
        g6Var.setClipChildren(false);
        addView(g6Var, ma.e(-1, -1, 119));
        g();
        g6Var.j(new h6(0, this, gq0Var));
        i6 i6Var = new i6(gq0Var);
        i6Var.f59190m = false;
        i6Var.C = false;
        i6Var.o(nr.h);
        i6Var.n(350L);
        g6Var.setItemAnimator(i6Var);
        new v4.z(new j6(this, gq0Var)).h(g6Var);
        View view = this.f3950r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f3954y;
        if (view2 != null) {
            removeView(view2);
        }
        if (gq0Var.d == this.f3947e) {
            this.f3954y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f3950r = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f3951s = linearLayout;
            linearLayout.setOrientation(1);
            this.f3950r.addView(this.f3951s, ma.e(-2, -2, 17));
            q9 q9Var = new q9(getContext());
            q9Var.setImageDrawable(new oh0(2131624320, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
            this.f3951s.addView(q9Var, ma.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f3952w = textView;
            textView.setTextSize(1, 17.0f);
            this.f3952w.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.U(this.f3952w, org.telegram.ui.ActionBar.m6.G6, h6Var);
            this.f3952w.setText(gd.N0(2131746473, null));
            this.f3951s.addView(this.f3952w, ma.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f3953x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f3953x;
            int i10 = org.telegram.ui.ActionBar.m6.Fi;
            org.telegram.ui.ActionBar.t6.U(textView3, i10, h6Var);
            this.f3953x.setText(gd.N0(2131746474, null));
            this.f3953x.setOnClickListener(new View.OnClickListener(this) {
                public final n6 f3438b;

                {
                    this.f3438b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            di.p8 p8Var = this.f3438b.f3947e;
                            if (p8Var != null) {
                                if (!p8Var.f9543e || p8Var.f9545g != 783) {
                                    p8Var.f9545g = 783;
                                    p8Var.f9543e = true;
                                    p8Var.k(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f3438b.f3944a.a();
                            return;
                    }
                }
            });
            this.f3953x.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f));
            org.telegram.ui.ActionBar.t6.Q(this.f3953x, org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i10, h6Var)), 4, 4), null, org.telegram.ui.ActionBar.t6.K(0.1f, i10), h6Var);
            ra.a(this.f3953x);
            this.f3951s.addView(this.f3953x, ma.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f3950r, ma.e(-1, -1, 119));
            g6Var.setEmptyView(this.f3950r);
            return;
        }
        this.f3950r = null;
        this.f3952w = null;
        this.f3953x = null;
        this.f3951s = null;
        this.f3954y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f3954y.addView(this.E, ma.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.U(this.F, org.telegram.ui.ActionBar.m6.G6, h6Var);
        this.F.setText(gd.N0(2131750228, null));
        this.E.addView(this.F, ma.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(this.G, org.telegram.ui.ActionBar.m6.f29770y6, h6Var);
        this.G.setText(gd.N0(2131750229, null));
        this.E.addView(this.G, ma.t(-2, -2, 1, 0, 10, 0, 0));
        hi.e eVar = new hi.e(getContext(), h6Var, true);
        this.H = eVar;
        eVar.i(gd.N0(2131750230, null), false, true);
        this.E.addView(this.H, ma.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final n6 f3438b;

            {
                this.f3438b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        di.p8 p8Var = this.f3438b.f3947e;
                        if (p8Var != null) {
                            if (!p8Var.f9543e || p8Var.f9545g != 783) {
                                p8Var.f9545g = 783;
                                p8Var.f9543e = true;
                                p8Var.k(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f3438b.f3944a.a();
                        return;
                }
            }
        });
        addView(this.f3954y, ma.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        g6Var.setEmptyView(this.f3954y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(gq0Var.f4117e.h() ? 0 : 8);
        }
    }

    public static void d(n6 n6Var, boolean z10) {
        n6Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        g6 g6Var;
        if (this.h != z10) {
            this.h = z10;
            gq0 gq0Var = this.f3944a;
            gq0Var.q(gq0Var.g());
            int i7 = 0;
            while (true) {
                g6Var = this.f3948f;
                if (i7 >= g6Var.getChildCount()) {
                    break;
                }
                View childAt = g6Var.getChildAt(i7);
                if (childAt instanceof g3) {
                    ((g3) childAt).e(z10, true);
                }
                i7++;
            }
            c51 c51Var = g6Var.f35796g3;
            if (c51Var != null) {
                c51Var.T();
            }
            if (z10) {
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.X4(false);
                    org.telegram.messenger.g0.g3(new p5(profileActivity, 1));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.I3 && objArr[1] == this.f3947e) {
            f(true);
            if (this.f3947e != null && isAttachedToWindow()) {
                g6 g6Var = this.f3948f;
                if (g6Var.canScrollVertically(1)) {
                    for (int i11 = 0; i11 < g6Var.getChildCount(); i11++) {
                        if (!(g6Var.getChildAt(i11) instanceof yz)) {
                        }
                    }
                    return;
                }
                this.f3947e.a();
            }
        }
    }

    public final void e() {
        if (!this.h) {
            return;
        }
        di.p8 p8Var = this.f3947e;
        if (p8Var != null) {
            p8Var.p();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        c51 c51Var;
        g6 g6Var = this.f3948f;
        if (g6Var != null && (c51Var = g6Var.f35796g3) != null) {
            boolean canScrollVertically = g6Var.canScrollVertically(-1);
            c51Var.O(z10);
            if (!canScrollVertically) {
                g6Var.v0(0);
            }
        }
    }

    public final void g() {
        boolean z10;
        gq0 gq0Var = this.f3944a;
        if (gq0Var.M == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setClipChildren(z10);
        g6 g6Var = this.f3948f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) g6Var.getLayoutParams();
        int i7 = marginLayoutParams.topMargin;
        int i10 = -gq0Var.M;
        if (i7 != i10 || marginLayoutParams.bottomMargin != (-gq0Var.N)) {
            marginLayoutParams.topMargin = i10;
            marginLayoutParams.bottomMargin = -gq0Var.N;
            g6Var.setLayoutParams(marginLayoutParams);
        }
        g6Var.setPadding(org.telegram.messenger.g0.L(9.0f), gq0Var.M + gq0Var.L, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(86.0f) + gq0Var.N);
    }

    public float getTabsHeight() {
        g6 g6Var = this.f3948f;
        float y10 = g6Var.getY();
        for (int i7 = 0; i7 < g6Var.getChildCount(); i7++) {
            View childAt = g6Var.getChildAt(i7);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof g3) {
                if (R == 0) {
                    return Math.max(0.0f, childAt.getY() + y10);
                }
            } else if (R == 0) {
                return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY() + y10);
            }
        }
        return 0.0f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f3945b).c(this, ks.I3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f3945b).n(this, ks.I3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        setVisibleHeight(this.f3949n);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        g6 g6Var = this.f3948f;
        boolean canScrollVertically = g6Var.canScrollVertically(-1);
        g6Var.f35796g3.O(true);
        if (!canScrollVertically) {
            g6Var.v0(0);
        }
        this.f3944a.p();
    }

    public void setVisibleHeight(int i7) {
        this.f3949n = i7;
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(i7, org.telegram.messenger.g0.L(150.0f), org.telegram.messenger.g0.L(220.0f)));
        float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, l10);
        LinearLayout linearLayout = this.f3951s;
        if (linearLayout != null) {
            linearLayout.setAlpha(l10);
            this.f3951s.setScaleX(T1);
            this.f3951s.setScaleY(T1);
        }
        FrameLayout frameLayout = this.f3950r;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f3949n)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(l10);
            this.E.setScaleX(T1);
            this.E.setScaleY(T1);
        }
        FrameLayout frameLayout2 = this.f3954y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f3949n)) / 2.0f);
        }
    }
}
