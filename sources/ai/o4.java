package ai;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b8.mf;
import b8.pf;
import ci.v8;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class o4 extends FrameLayout implements cs {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final gi.d H;
    public boolean I;
    public final vp0 f856a;
    public final int f857b;
    public final org.telegram.ui.ActionBar.e6 f858c;
    public boolean d;
    public v8 f859e;
    public final h4 f860f;
    public boolean h;
    public int f861n;
    public final FrameLayout f862r;
    public final LinearLayout f863s;
    public final TextView f864w;
    public final TextView f865x;
    public final FrameLayout f866y;

    public o4(vp0 vp0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(vp0Var.getContext());
        this.f861n = org.telegram.messenger.g0.f22608q.y;
        Context context = vp0Var.getContext();
        this.f856a = vp0Var;
        this.f857b = i3;
        this.f858c = e6Var;
        h4 h4Var = new h4(context, i3, new c(this, 6), new f4(this), new f4(this), e6Var, vp0Var);
        this.f860f = h4Var;
        h4Var.f35594g3.f33698r = false;
        h4Var.setSelectorType(9);
        h4Var.setSelectorDrawableColor(0);
        h4Var.setClipToPadding(false);
        h4Var.setClipChildren(false);
        addView(h4Var, mf.e(-1, -1, 119));
        g();
        h4Var.j(new i4(0, this, vp0Var));
        j4 j4Var = new j4(vp0Var);
        j4Var.f55567m = false;
        j4Var.C = false;
        j4Var.o(xq.h);
        j4Var.n(350L);
        h4Var.setItemAnimator(j4Var);
        new u4.y(new k4(this, vp0Var)).h(h4Var);
        View view = this.f862r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f866y;
        if (view2 != null) {
            removeView(view2);
        }
        if (vp0Var.d == this.f859e) {
            this.f866y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.f862r = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f863s = linearLayout;
            linearLayout.setOrientation(1);
            this.f862r.addView(this.f863s, mf.e(-2, -2, 17));
            k9 k9Var = new k9(getContext());
            k9Var.setImageDrawable(new ch0(2131624319, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
            this.f863s.addView(k9Var, mf.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f864w = textView;
            textView.setTextSize(1, 17.0f);
            this.f864w.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.r6.V(this.f864w, org.telegram.ui.ActionBar.k6.G6, e6Var);
            this.f864w.setText(bd.M0(2131746677, null));
            this.f863s.addView(this.f864w, mf.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f865x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f865x;
            int i10 = org.telegram.ui.ActionBar.k6.Ci;
            org.telegram.ui.ActionBar.r6.V(textView3, i10, e6Var);
            this.f865x.setText(bd.M0(2131746678, null));
            this.f865x.setOnClickListener(new View.OnClickListener(this) {
                public final o4 f544b;

                {
                    this.f544b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            v8 v8Var = this.f544b.f859e;
                            if (v8Var != null) {
                                if (!v8Var.f6197e || v8Var.f6199g != 783) {
                                    v8Var.f6199g = 783;
                                    v8Var.f6197e = true;
                                    v8Var.j(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f544b.f856a.a();
                            return;
                    }
                }
            });
            this.f865x.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f));
            org.telegram.ui.ActionBar.r6.R(this.f865x, org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i10, e6Var)), 4, 4), null, org.telegram.ui.ActionBar.r6.L(0.1f, i10), e6Var);
            pf.a(this.f865x);
            this.f863s.addView(this.f865x, mf.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f862r, mf.e(-1, -1, 119));
            h4Var.setEmptyView(this.f862r);
            return;
        }
        this.f862r = null;
        this.f864w = null;
        this.f865x = null;
        this.f863s = null;
        this.f866y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f866y.addView(this.E, mf.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(this.F, org.telegram.ui.ActionBar.k6.G6, e6Var);
        this.F.setText(bd.M0(2131750253, null));
        this.E.addView(this.F, mf.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(this.G, org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
        this.G.setText(bd.M0(2131750254, null));
        this.E.addView(this.G, mf.t(-2, -2, 1, 0, 10, 0, 0));
        gi.d dVar = new gi.d(getContext(), e6Var, true);
        this.H = dVar;
        dVar.i(bd.M0(2131750255, null), false, true);
        this.E.addView(this.H, mf.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final o4 f544b;

            {
                this.f544b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        v8 v8Var = this.f544b.f859e;
                        if (v8Var != null) {
                            if (!v8Var.f6197e || v8Var.f6199g != 783) {
                                v8Var.f6199g = 783;
                                v8Var.f6197e = true;
                                v8Var.j(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f544b.f856a.a();
                        return;
                }
            }
        });
        addView(this.f866y, mf.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        h4Var.setEmptyView(this.f866y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(vp0Var.f1013e.h() ? 0 : 8);
        }
    }

    public static void d(o4 o4Var, boolean z10) {
        o4Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        h4 h4Var;
        if (this.h != z10) {
            this.h = z10;
            vp0 vp0Var = this.f856a;
            vp0Var.q(vp0Var.g());
            int i3 = 0;
            while (true) {
                h4Var = this.f860f;
                if (i3 >= h4Var.getChildCount()) {
                    break;
                }
                View childAt = h4Var.getChildAt(i3);
                if (childAt instanceof q2) {
                    ((q2) childAt).e(z10, true);
                }
                i3++;
            }
            f41 f41Var = h4Var.f35594g3;
            if (f41Var != null) {
                f41Var.T();
            }
            if (z10) {
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.U4(false);
                    org.telegram.messenger.g0.h3(new p3(profileActivity, 1));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.G3 && objArr[1] == this.f859e) {
            f(true);
            if (this.f859e != null && isAttachedToWindow()) {
                h4 h4Var = this.f860f;
                if (h4Var.canScrollVertically(1)) {
                    for (int i11 = 0; i11 < h4Var.getChildCount(); i11++) {
                        if (!(h4Var.getChildAt(i11) instanceof iz)) {
                        }
                    }
                    return;
                }
                this.f859e.a();
            }
        }
    }

    public final void e() {
        if (!this.h) {
            return;
        }
        v8 v8Var = this.f859e;
        if (v8Var != null) {
            v8Var.n();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        f41 f41Var;
        h4 h4Var = this.f860f;
        if (h4Var != null && (f41Var = h4Var.f35594g3) != null) {
            boolean canScrollVertically = h4Var.canScrollVertically(-1);
            f41Var.O(z10);
            if (!canScrollVertically) {
                h4Var.v0(0);
            }
        }
    }

    public final void g() {
        boolean z10;
        vp0 vp0Var = this.f856a;
        if (vp0Var.M == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setClipChildren(z10);
        h4 h4Var = this.f860f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) h4Var.getLayoutParams();
        int i3 = marginLayoutParams.topMargin;
        int i10 = -vp0Var.M;
        if (i3 != i10 || marginLayoutParams.bottomMargin != (-vp0Var.N)) {
            marginLayoutParams.topMargin = i10;
            marginLayoutParams.bottomMargin = -vp0Var.N;
            h4Var.setLayoutParams(marginLayoutParams);
        }
        h4Var.setPadding(org.telegram.messenger.g0.L(9.0f), vp0Var.M + vp0Var.L, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(86.0f) + vp0Var.N);
    }

    public float getTabsHeight() {
        h4 h4Var = this.f860f;
        float y9 = h4Var.getY();
        for (int i3 = 0; i3 < h4Var.getChildCount(); i3++) {
            View childAt = h4Var.getChildAt(i3);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof q2) {
                if (R == 0) {
                    return Math.max(0.0f, childAt.getY() + y9);
                }
            } else if (R == 0) {
                return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY() + y9);
            }
        }
        return 0.0f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.f857b).c(this, hs.G3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.f857b).n(this, hs.G3);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        setVisibleHeight(this.f861n);
    }

    public void setHasTabs(boolean z10) {
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        h4 h4Var = this.f860f;
        boolean canScrollVertically = h4Var.canScrollVertically(-1);
        h4Var.f35594g3.O(true);
        if (!canScrollVertically) {
            h4Var.v0(0);
        }
        this.f856a.p();
    }

    public void setVisibleHeight(int i3) {
        this.f861n = i3;
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(i3, org.telegram.messenger.g0.L(150.0f), org.telegram.messenger.g0.L(220.0f)));
        float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, l10);
        LinearLayout linearLayout = this.f863s;
        if (linearLayout != null) {
            linearLayout.setAlpha(l10);
            this.f863s.setScaleX(T1);
            this.f863s.setScaleY(T1);
        }
        FrameLayout frameLayout = this.f862r;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f861n)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(l10);
            this.E.setScaleX(T1);
            this.E.setScaleY(T1);
        }
        FrameLayout frameLayout2 = this.f866y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f861n)) / 2.0f);
        }
    }
}
