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
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class k6 extends FrameLayout implements fs {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final hi.d H;
    public boolean I;
    public final eq0 f3813a;
    public final int f3814b;
    public final org.telegram.ui.ActionBar.i6 f3815c;
    public boolean d;
    public di.o8 f3816e;
    public final d6 f3817f;
    public boolean h;
    public int f3818n;
    public final FrameLayout f3819r;
    public final LinearLayout f3820s;
    public final TextView f3821w;
    public final TextView f3822x;
    public final FrameLayout f3823y;

    public k6(eq0 eq0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(eq0Var.getContext());
        this.f3818n = org.telegram.messenger.g0.f24121q.y;
        Context context = eq0Var.getContext();
        this.f3813a = eq0Var;
        this.f3814b = i7;
        this.f3815c = i6Var;
        d6 d6Var = new d6(context, i7, new b(this, 8), new b6(this), new b6(this), i6Var, eq0Var);
        this.f3817f = d6Var;
        d6Var.f34607g3.f42809r = false;
        d6Var.setSelectorType(9);
        d6Var.setSelectorDrawableColor(0);
        d6Var.setClipToPadding(false);
        d6Var.setClipChildren(false);
        addView(d6Var, ma.e(-1, -1, 119));
        g();
        d6Var.j(new e6(0, this, eq0Var));
        f6 f6Var = new f6(eq0Var);
        f6Var.f59151m = false;
        f6Var.C = false;
        f6Var.o(lr.h);
        f6Var.n(350L);
        d6Var.setItemAnimator(f6Var);
        new v4.z(new g6(this, eq0Var)).h(d6Var);
        View view = this.f3819r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f3823y;
        if (view2 != null) {
            removeView(view2);
        }
        if (eq0Var.d == this.f3816e) {
            this.f3823y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f3819r = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f3820s = linearLayout;
            linearLayout.setOrientation(1);
            this.f3819r.addView(this.f3820s, ma.e(-2, -2, 17));
            q9 q9Var = new q9(getContext());
            q9Var.setImageDrawable(new mh0(2131624320, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
            this.f3820s.addView(q9Var, ma.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f3821w = textView;
            textView.setTextSize(1, 17.0f);
            this.f3821w.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.u6.U(this.f3821w, org.telegram.ui.ActionBar.n6.G6, i6Var);
            this.f3821w.setText(gd.M0(2131746474, null));
            this.f3820s.addView(this.f3821w, ma.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f3822x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f3822x;
            int i10 = org.telegram.ui.ActionBar.n6.Fi;
            org.telegram.ui.ActionBar.u6.U(textView3, i10, i6Var);
            this.f3822x.setText(gd.M0(2131746475, null));
            this.f3822x.setOnClickListener(new View.OnClickListener(this) {
                public final k6 f4282b;

                {
                    this.f4282b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            di.o8 o8Var = this.f4282b.f3816e;
                            if (o8Var != null) {
                                if (!o8Var.f9464e || o8Var.f9466g != 783) {
                                    o8Var.f9466g = 783;
                                    o8Var.f9464e = true;
                                    o8Var.k(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f4282b.f3813a.a();
                            return;
                    }
                }
            });
            this.f3822x.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f));
            org.telegram.ui.ActionBar.u6.Q(this.f3822x, org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i10, i6Var)), 4, 4), null, org.telegram.ui.ActionBar.u6.K(0.1f, i10), i6Var);
            ra.a(this.f3822x);
            this.f3820s.addView(this.f3822x, ma.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f3819r, ma.e(-1, -1, 119));
            d6Var.setEmptyView(this.f3819r);
            return;
        }
        this.f3819r = null;
        this.f3821w = null;
        this.f3822x = null;
        this.f3820s = null;
        this.f3823y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f3823y.addView(this.E, ma.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.U(this.F, org.telegram.ui.ActionBar.n6.G6, i6Var);
        this.F.setText(gd.M0(2131750229, null));
        this.E.addView(this.F, ma.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(this.G, org.telegram.ui.ActionBar.n6.f29788y6, i6Var);
        this.G.setText(gd.M0(2131750230, null));
        this.E.addView(this.G, ma.t(-2, -2, 1, 0, 10, 0, 0));
        hi.d dVar = new hi.d(getContext(), i6Var, true);
        this.H = dVar;
        dVar.i(gd.M0(2131750231, null), false, true);
        this.E.addView(this.H, ma.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final k6 f4282b;

            {
                this.f4282b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        di.o8 o8Var = this.f4282b.f3816e;
                        if (o8Var != null) {
                            if (!o8Var.f9464e || o8Var.f9466g != 783) {
                                o8Var.f9466g = 783;
                                o8Var.f9464e = true;
                                o8Var.k(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f4282b.f3813a.a();
                        return;
                }
            }
        });
        addView(this.f3823y, ma.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        d6Var.setEmptyView(this.f3823y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(eq0Var.f4006e.h() ? 0 : 8);
        }
    }

    public static void d(k6 k6Var, boolean z10) {
        k6Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        d6 d6Var;
        if (this.h != z10) {
            this.h = z10;
            eq0 eq0Var = this.f3813a;
            eq0Var.q(eq0Var.g());
            int i7 = 0;
            while (true) {
                d6Var = this.f3817f;
                if (i7 >= d6Var.getChildCount()) {
                    break;
                }
                View childAt = d6Var.getChildAt(i7);
                if (childAt instanceof c3) {
                    ((c3) childAt).e(z10, true);
                }
                i7++;
            }
            z41 z41Var = d6Var.f34607g3;
            if (z41Var != null) {
                z41Var.T();
            }
            if (z10) {
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.X4(false);
                    org.telegram.messenger.g0.g3(new m5(profileActivity, 1));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.I3 && objArr[1] == this.f3816e) {
            f(true);
            if (this.f3816e != null && isAttachedToWindow()) {
                d6 d6Var = this.f3817f;
                if (d6Var.canScrollVertically(1)) {
                    for (int i11 = 0; i11 < d6Var.getChildCount(); i11++) {
                        if (!(d6Var.getChildAt(i11) instanceof wz)) {
                        }
                    }
                    return;
                }
                this.f3816e.a();
            }
        }
    }

    public final void e() {
        if (!this.h) {
            return;
        }
        di.o8 o8Var = this.f3816e;
        if (o8Var != null) {
            o8Var.p();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        z41 z41Var;
        d6 d6Var = this.f3817f;
        if (d6Var != null && (z41Var = d6Var.f34607g3) != null) {
            boolean canScrollVertically = d6Var.canScrollVertically(-1);
            z41Var.O(z10);
            if (!canScrollVertically) {
                d6Var.v0(0);
            }
        }
    }

    public final void g() {
        boolean z10;
        eq0 eq0Var = this.f3813a;
        if (eq0Var.M == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setClipChildren(z10);
        d6 d6Var = this.f3817f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d6Var.getLayoutParams();
        int i7 = marginLayoutParams.topMargin;
        int i10 = -eq0Var.M;
        if (i7 != i10 || marginLayoutParams.bottomMargin != (-eq0Var.N)) {
            marginLayoutParams.topMargin = i10;
            marginLayoutParams.bottomMargin = -eq0Var.N;
            d6Var.setLayoutParams(marginLayoutParams);
        }
        d6Var.setPadding(org.telegram.messenger.g0.L(9.0f), eq0Var.M + eq0Var.L, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(86.0f) + eq0Var.N);
    }

    public float getTabsHeight() {
        d6 d6Var = this.f3817f;
        float y10 = d6Var.getY();
        for (int i7 = 0; i7 < d6Var.getChildCount(); i7++) {
            View childAt = d6Var.getChildAt(i7);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof c3) {
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
        ks.f(this.f3814b).c(this, ks.I3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f3814b).n(this, ks.I3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        setVisibleHeight(this.f3818n);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        d6 d6Var = this.f3817f;
        boolean canScrollVertically = d6Var.canScrollVertically(-1);
        d6Var.f34607g3.O(true);
        if (!canScrollVertically) {
            d6Var.v0(0);
        }
        this.f3813a.p();
    }

    public void setVisibleHeight(int i7) {
        this.f3818n = i7;
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(i7, org.telegram.messenger.g0.L(150.0f), org.telegram.messenger.g0.L(220.0f)));
        float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, l10);
        LinearLayout linearLayout = this.f3820s;
        if (linearLayout != null) {
            linearLayout.setAlpha(l10);
            this.f3820s.setScaleX(T1);
            this.f3820s.setScaleY(T1);
        }
        FrameLayout frameLayout = this.f3819r;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f3818n)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(l10);
            this.E.setScaleX(T1);
            this.E.setScaleY(T1);
        }
        FrameLayout frameLayout2 = this.f3823y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f3818n)) / 2.0f);
        }
    }
}
