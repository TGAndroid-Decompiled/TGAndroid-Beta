package bi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c8.ja;
import c8.na;
import di.m8;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class c4 extends FrameLayout implements is {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final hi.d H;
    public boolean I;
    public final wp0 f3409a;
    public final int f3410b;
    public final org.telegram.ui.ActionBar.e6 f3411c;
    public boolean d;
    public m8 f3412e;
    public final v3 f3413f;
    public boolean h;
    public int f3414n;
    public final FrameLayout f3415r;
    public final LinearLayout f3416s;
    public final TextView f3417w;
    public final TextView f3418x;
    public final FrameLayout f3419y;

    public c4(wp0 wp0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(wp0Var.getContext());
        this.f3414n = org.telegram.messenger.g0.f23609q.y;
        Context context = wp0Var.getContext();
        this.f3409a = wp0Var;
        this.f3410b = i7;
        this.f3411c = e6Var;
        v3 v3Var = new v3(context, i7, new b(this, 6), new t3(this), new t3(this), e6Var, wp0Var);
        this.f3413f = v3Var;
        v3Var.f39895g3.f38201r = false;
        v3Var.setSelectorType(9);
        v3Var.setSelectorDrawableColor(0);
        v3Var.setClipToPadding(false);
        v3Var.setClipChildren(false);
        addView(v3Var, ja.e(-1, -1, 119));
        g();
        v3Var.j(new w3(0, this, wp0Var));
        x3 x3Var = new x3(wp0Var);
        x3Var.f58564m = false;
        x3Var.C = false;
        x3Var.o(er.h);
        x3Var.n(350L);
        v3Var.setItemAnimator(x3Var);
        new v4.y(new y3(this, wp0Var)).h(v3Var);
        View view = this.f3415r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f3419y;
        if (view2 != null) {
            removeView(view2);
        }
        if (wp0Var.d == this.f3412e) {
            this.f3419y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f3415r = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f3416s = linearLayout;
            linearLayout.setOrientation(1);
            this.f3415r.addView(this.f3416s, ja.e(-2, -2, 17));
            i9 i9Var = new i9(getContext());
            i9Var.setImageDrawable(new ch0(2131624320, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
            this.f3416s.addView(i9Var, ja.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f3417w = textView;
            textView.setTextSize(1, 17.0f);
            this.f3417w.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.q6.U(this.f3417w, org.telegram.ui.ActionBar.j6.G6, e6Var);
            this.f3417w.setText(hd.M0(2131746669, null));
            this.f3416s.addView(this.f3417w, ja.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f3418x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f3418x;
            int i10 = org.telegram.ui.ActionBar.j6.Fi;
            org.telegram.ui.ActionBar.q6.U(textView3, i10, e6Var);
            this.f3418x.setText(hd.M0(2131746670, null));
            this.f3418x.setOnClickListener(new View.OnClickListener(this) {
                public final c4 f3804b;

                {
                    this.f3804b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            m8 m8Var = this.f3804b.f3412e;
                            if (m8Var != null) {
                                if (!m8Var.f9045e || m8Var.f9047g != 783) {
                                    m8Var.f9047g = 783;
                                    m8Var.f9045e = true;
                                    m8Var.j(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f3804b.f3409a.a();
                            return;
                    }
                }
            });
            this.f3418x.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f));
            org.telegram.ui.ActionBar.q6.Q(this.f3418x, org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i10, e6Var)), 4, 4), null, org.telegram.ui.ActionBar.q6.K(0.1f, i10), e6Var);
            na.a(this.f3418x);
            this.f3416s.addView(this.f3418x, ja.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f3415r, ja.e(-1, -1, 119));
            v3Var.setEmptyView(this.f3415r);
            return;
        }
        this.f3415r = null;
        this.f3417w = null;
        this.f3418x = null;
        this.f3416s = null;
        this.f3419y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f3419y.addView(this.E, ja.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.U(this.F, org.telegram.ui.ActionBar.j6.G6, e6Var);
        this.F.setText(hd.M0(2131750245, null));
        this.E.addView(this.F, ja.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(this.G, org.telegram.ui.ActionBar.j6.f29241y6, e6Var);
        this.G.setText(hd.M0(2131750246, null));
        this.E.addView(this.G, ja.t(-2, -2, 1, 0, 10, 0, 0));
        hi.d dVar = new hi.d(getContext(), e6Var, true);
        this.H = dVar;
        dVar.i(hd.M0(2131750247, null), false, true);
        this.E.addView(this.H, ja.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final c4 f3804b;

            {
                this.f3804b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        m8 m8Var = this.f3804b.f3412e;
                        if (m8Var != null) {
                            if (!m8Var.f9045e || m8Var.f9047g != 783) {
                                m8Var.f9047g = 783;
                                m8Var.f9045e = true;
                                m8Var.j(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f3804b.f3409a.a();
                        return;
                }
            }
        });
        addView(this.f3419y, ja.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        v3Var.setEmptyView(this.f3419y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(wp0Var.f3610e.h() ? 0 : 8);
        }
    }

    public static void d(c4 c4Var, boolean z10) {
        c4Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        v3 v3Var;
        if (this.h != z10) {
            this.h = z10;
            wp0 wp0Var = this.f3409a;
            wp0Var.q(wp0Var.g());
            int i7 = 0;
            while (true) {
                v3Var = this.f3413f;
                if (i7 >= v3Var.getChildCount()) {
                    break;
                }
                View childAt = v3Var.getChildAt(i7);
                if (childAt instanceof i2) {
                    ((i2) childAt).e(z10, true);
                }
                i7++;
            }
            p41 p41Var = v3Var.f39895g3;
            if (p41Var != null) {
                p41Var.T();
            }
            if (z10) {
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.W4(false);
                    org.telegram.messenger.g0.h3(new e3(profileActivity, 1));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.G3 && objArr[1] == this.f3412e) {
            f(true);
            if (this.f3412e != null && isAttachedToWindow()) {
                v3 v3Var = this.f3413f;
                if (v3Var.canScrollVertically(1)) {
                    for (int i11 = 0; i11 < v3Var.getChildCount(); i11++) {
                        if (!(v3Var.getChildAt(i11) instanceof pz)) {
                        }
                    }
                    return;
                }
                this.f3412e.a();
            }
        }
    }

    public final void e() {
        if (!this.h) {
            return;
        }
        m8 m8Var = this.f3412e;
        if (m8Var != null) {
            m8Var.n();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        p41 p41Var;
        v3 v3Var = this.f3413f;
        if (v3Var != null && (p41Var = v3Var.f39895g3) != null) {
            boolean canScrollVertically = v3Var.canScrollVertically(-1);
            p41Var.O(z10);
            if (!canScrollVertically) {
                v3Var.v0(0);
            }
        }
    }

    public final void g() {
        boolean z10;
        wp0 wp0Var = this.f3409a;
        if (wp0Var.M == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setClipChildren(z10);
        v3 v3Var = this.f3413f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v3Var.getLayoutParams();
        int i7 = marginLayoutParams.topMargin;
        int i10 = -wp0Var.M;
        if (i7 != i10 || marginLayoutParams.bottomMargin != (-wp0Var.N)) {
            marginLayoutParams.topMargin = i10;
            marginLayoutParams.bottomMargin = -wp0Var.N;
            v3Var.setLayoutParams(marginLayoutParams);
        }
        v3Var.setPadding(org.telegram.messenger.g0.L(9.0f), wp0Var.M + wp0Var.L, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(86.0f) + wp0Var.N);
    }

    public float getTabsHeight() {
        v3 v3Var = this.f3413f;
        float y10 = v3Var.getY();
        for (int i7 = 0; i7 < v3Var.getChildCount(); i7++) {
            View childAt = v3Var.getChildAt(i7);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof i2) {
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
        ns.f(this.f3410b).c(this, ns.G3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.f3410b).n(this, ns.G3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        setVisibleHeight(this.f3414n);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        v3 v3Var = this.f3413f;
        boolean canScrollVertically = v3Var.canScrollVertically(-1);
        v3Var.f39895g3.O(true);
        if (!canScrollVertically) {
            v3Var.v0(0);
        }
        this.f3409a.p();
    }

    public void setVisibleHeight(int i7) {
        this.f3414n = i7;
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(i7, org.telegram.messenger.g0.L(150.0f), org.telegram.messenger.g0.L(220.0f)));
        float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, l10);
        LinearLayout linearLayout = this.f3416s;
        if (linearLayout != null) {
            linearLayout.setAlpha(l10);
            this.f3416s.setScaleX(T1);
            this.f3416s.setScaleY(T1);
        }
        FrameLayout frameLayout = this.f3415r;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f3414n)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(l10);
            this.E.setScaleX(T1);
            this.E.setScaleY(T1);
        }
        FrameLayout frameLayout2 = this.f3419y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f3414n)) / 2.0f);
        }
    }
}
