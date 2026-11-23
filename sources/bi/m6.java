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
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.yz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class m6 extends FrameLayout implements gs {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final hi.e H;
    public boolean I;
    public final gq0 f3897a;
    public final int f3898b;
    public final org.telegram.ui.ActionBar.h6 f3899c;
    public boolean d;
    public di.p8 f3900e;
    public final f6 f3901f;
    public boolean h;
    public int f3902n;
    public final FrameLayout f3903r;
    public final LinearLayout f3904s;
    public final TextView f3905w;
    public final TextView f3906x;
    public final FrameLayout f3907y;

    public m6(gq0 gq0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(gq0Var.getContext());
        this.f3902n = org.telegram.messenger.g0.f24046q.y;
        Context context = gq0Var.getContext();
        this.f3897a = gq0Var;
        this.f3898b = i7;
        this.f3899c = h6Var;
        f6 f6Var = new f6(context, i7, new b(this, 8), new d6(this), new d6(this), h6Var, gq0Var);
        this.f3901f = f6Var;
        f6Var.f35790g3.f34062r = false;
        f6Var.setSelectorType(9);
        f6Var.setSelectorDrawableColor(0);
        f6Var.setClipToPadding(false);
        f6Var.setClipChildren(false);
        addView(f6Var, ma.e(-1, -1, 119));
        g();
        f6Var.j(new g6(0, this, gq0Var));
        h6 h6Var2 = new h6(gq0Var);
        h6Var2.f59194m = false;
        h6Var2.C = false;
        h6Var2.o(nr.h);
        h6Var2.n(350L);
        f6Var.setItemAnimator(h6Var2);
        new v4.z(new i6(this, gq0Var)).h(f6Var);
        View view = this.f3903r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f3907y;
        if (view2 != null) {
            removeView(view2);
        }
        if (gq0Var.d == this.f3900e) {
            this.f3907y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f3903r = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f3904s = linearLayout;
            linearLayout.setOrientation(1);
            this.f3903r.addView(this.f3904s, ma.e(-2, -2, 17));
            q9 q9Var = new q9(getContext());
            q9Var.setImageDrawable(new oh0(2131624320, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
            this.f3904s.addView(q9Var, ma.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f3905w = textView;
            textView.setTextSize(1, 17.0f);
            this.f3905w.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.t6.U(this.f3905w, org.telegram.ui.ActionBar.m6.G6, h6Var);
            this.f3905w.setText(hd.N0(2131746473, null));
            this.f3904s.addView(this.f3905w, ma.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f3906x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f3906x;
            int i10 = org.telegram.ui.ActionBar.m6.Fi;
            org.telegram.ui.ActionBar.t6.U(textView3, i10, h6Var);
            this.f3906x.setText(hd.N0(2131746474, null));
            this.f3906x.setOnClickListener(new View.OnClickListener(this) {
                public final m6 f3411b;

                {
                    this.f3411b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            di.p8 p8Var = this.f3411b.f3900e;
                            if (p8Var != null) {
                                if (!p8Var.f9546e || p8Var.f9548g != 783) {
                                    p8Var.f9548g = 783;
                                    p8Var.f9546e = true;
                                    p8Var.k(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f3411b.f3897a.a();
                            return;
                    }
                }
            });
            this.f3906x.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f));
            org.telegram.ui.ActionBar.t6.Q(this.f3906x, org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i10, h6Var)), 4, 4), null, org.telegram.ui.ActionBar.t6.K(0.1f, i10), h6Var);
            ra.a(this.f3906x);
            this.f3904s.addView(this.f3906x, ma.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f3903r, ma.e(-1, -1, 119));
            f6Var.setEmptyView(this.f3903r);
            return;
        }
        this.f3903r = null;
        this.f3905w = null;
        this.f3906x = null;
        this.f3904s = null;
        this.f3907y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f3907y.addView(this.E, ma.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.U(this.F, org.telegram.ui.ActionBar.m6.G6, h6Var);
        this.F.setText(hd.N0(2131750228, null));
        this.E.addView(this.F, ma.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(this.G, org.telegram.ui.ActionBar.m6.f29773y6, h6Var);
        this.G.setText(hd.N0(2131750229, null));
        this.E.addView(this.G, ma.t(-2, -2, 1, 0, 10, 0, 0));
        hi.e eVar = new hi.e(getContext(), h6Var, true);
        this.H = eVar;
        eVar.i(hd.N0(2131750230, null), false, true);
        this.E.addView(this.H, ma.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final m6 f3411b;

            {
                this.f3411b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        di.p8 p8Var = this.f3411b.f3900e;
                        if (p8Var != null) {
                            if (!p8Var.f9546e || p8Var.f9548g != 783) {
                                p8Var.f9548g = 783;
                                p8Var.f9546e = true;
                                p8Var.k(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f3411b.f3897a.a();
                        return;
                }
            }
        });
        addView(this.f3907y, ma.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        f6Var.setEmptyView(this.f3907y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(gq0Var.f4094e.h() ? 0 : 8);
        }
    }

    public static void d(m6 m6Var, boolean z10) {
        m6Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        f6 f6Var;
        if (this.h != z10) {
            this.h = z10;
            gq0 gq0Var = this.f3897a;
            gq0Var.q(gq0Var.g());
            int i7 = 0;
            while (true) {
                f6Var = this.f3901f;
                if (i7 >= f6Var.getChildCount()) {
                    break;
                }
                View childAt = f6Var.getChildAt(i7);
                if (childAt instanceof g3) {
                    ((g3) childAt).e(z10, true);
                }
                i7++;
            }
            c51 c51Var = f6Var.f35790g3;
            if (c51Var != null) {
                c51Var.T();
            }
            if (z10) {
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.X4(false);
                    org.telegram.messenger.g0.g3(new o5(profileActivity, 1));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.I3 && objArr[1] == this.f3900e) {
            f(true);
            if (this.f3900e != null && isAttachedToWindow()) {
                f6 f6Var = this.f3901f;
                if (f6Var.canScrollVertically(1)) {
                    for (int i11 = 0; i11 < f6Var.getChildCount(); i11++) {
                        if (!(f6Var.getChildAt(i11) instanceof yz)) {
                        }
                    }
                    return;
                }
                this.f3900e.a();
            }
        }
    }

    public final void e() {
        if (!this.h) {
            return;
        }
        di.p8 p8Var = this.f3900e;
        if (p8Var != null) {
            p8Var.p();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        c51 c51Var;
        f6 f6Var = this.f3901f;
        if (f6Var != null && (c51Var = f6Var.f35790g3) != null) {
            boolean canScrollVertically = f6Var.canScrollVertically(-1);
            c51Var.O(z10);
            if (!canScrollVertically) {
                f6Var.v0(0);
            }
        }
    }

    public final void g() {
        boolean z10;
        gq0 gq0Var = this.f3897a;
        if (gq0Var.M == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setClipChildren(z10);
        f6 f6Var = this.f3901f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f6Var.getLayoutParams();
        int i7 = marginLayoutParams.topMargin;
        int i10 = -gq0Var.M;
        if (i7 != i10 || marginLayoutParams.bottomMargin != (-gq0Var.N)) {
            marginLayoutParams.topMargin = i10;
            marginLayoutParams.bottomMargin = -gq0Var.N;
            f6Var.setLayoutParams(marginLayoutParams);
        }
        f6Var.setPadding(org.telegram.messenger.g0.L(9.0f), gq0Var.M + gq0Var.L, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(86.0f) + gq0Var.N);
    }

    public float getTabsHeight() {
        f6 f6Var = this.f3901f;
        float y10 = f6Var.getY();
        for (int i7 = 0; i7 < f6Var.getChildCount(); i7++) {
            View childAt = f6Var.getChildAt(i7);
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
        ls.f(this.f3898b).c(this, ls.I3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.f(this.f3898b).n(this, ls.I3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        setVisibleHeight(this.f3902n);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        f6 f6Var = this.f3901f;
        boolean canScrollVertically = f6Var.canScrollVertically(-1);
        f6Var.f35790g3.O(true);
        if (!canScrollVertically) {
            f6Var.v0(0);
        }
        this.f3897a.p();
    }

    public void setVisibleHeight(int i7) {
        this.f3902n = i7;
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(i7, org.telegram.messenger.g0.L(150.0f), org.telegram.messenger.g0.L(220.0f)));
        float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, l10);
        LinearLayout linearLayout = this.f3904s;
        if (linearLayout != null) {
            linearLayout.setAlpha(l10);
            this.f3904s.setScaleX(T1);
            this.f3904s.setScaleY(T1);
        }
        FrameLayout frameLayout = this.f3903r;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f3902n)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(l10);
            this.E.setScaleX(T1);
            this.E.setScaleY(T1);
        }
        FrameLayout frameLayout2 = this.f3907y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f3902n)) / 2.0f);
        }
    }
}
