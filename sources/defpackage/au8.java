package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class au8 extends FrameLayout implements fn7 {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final c51 H;
    public boolean I;
    public final cga a;
    public final int b;
    public final vnb c;
    public boolean d;
    public axa e;
    public final wa f;
    public boolean h;
    public int n;
    public final FrameLayout r;
    public final LinearLayout s;
    public final TextView w;
    public final TextView x;
    public final FrameLayout y;

    public au8(cga cgaVar, int i, vnb vnbVar) {
        super(cgaVar.getContext());
        this.n = hl.q.y;
        Context context = cgaVar.getContext();
        this.a = cgaVar;
        this.b = i;
        this.c = vnbVar;
        wa waVar = new wa(context, i, new hj8(this, (byte) 4), new vt8(this), new vt8(this), vnbVar, cgaVar);
        this.f = waVar;
        waVar.g3.r = false;
        waVar.setSelectorType(9);
        waVar.setSelectorDrawableColor(0);
        waVar.setClipToPadding(false);
        waVar.setClipChildren(false);
        addView(waVar, tre.e(-1, -1, 119));
        g();
        waVar.j(new bj1(this, cgaVar, (byte) 8));
        wt8 wt8Var = new wt8(cgaVar);
        wt8Var.m = false;
        wt8Var.C = false;
        wt8Var.o(k43.h);
        wt8Var.n(350L);
        waVar.setItemAnimator(wt8Var);
        new lu5(new xt8(this, cgaVar)).h(waVar);
        View view = this.r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        if (cgaVar.d == this.e) {
            this.y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.r = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.s = linearLayout;
            linearLayout.setOrientation(1);
            this.r.addView(this.s, tre.e(-2, -2, 17));
            de0 de0Var = new de0(getContext());
            de0Var.setImageDrawable(new b29(2131624315, hl.L(120.0f), hl.L(120.0f)));
            this.s.addView(de0Var, tre.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.w = textView;
            textView.setTextSize(1, 17.0f);
            this.w.setTypeface(hl.o());
            yob.X(this.w, aob.G6, vnbVar);
            this.w.setText(ob6.M0(2131746396, null));
            this.s.addView(this.w, tre.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.x;
            int i2 = aob.Fi;
            yob.X(textView3, i2, vnbVar);
            this.x.setText(ob6.M0(2131746397, null));
            this.x.setOnClickListener(new View.OnClickListener(this) {
                public final au8 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view3) {
                    byte b = r2;
                    au8 au8Var = this.b;
                    switch (b) {
                        case 0:
                            axa axaVar = au8Var.e;
                            if (axaVar != null) {
                                if (!axaVar.e || axaVar.g != 783) {
                                    axaVar.g = 783;
                                    axaVar.e = true;
                                    axaVar.k(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            au8Var.a.a();
                            return;
                    }
                }
            });
            this.x.setPadding(hl.L(10.0f), hl.L(4.0f), hl.L(10.0f), hl.L(4.0f));
            yob.R(this.x, aob.Y(aob.p1(0.1f, aob.v0(i2, vnbVar)), 4, 4), null, yob.K(0.1f, i2), vnbVar);
            iye.a(this.x);
            this.s.addView(this.x, tre.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.r, tre.e(-1, -1, 119));
            waVar.setEmptyView(this.r);
            return;
        }
        this.r = null;
        this.w = null;
        this.x = null;
        this.s = null;
        this.y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.y.addView(this.E, tre.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(hl.o());
        yob.X(this.F, aob.G6, vnbVar);
        this.F.setText(ob6.M0(2131750204, null));
        this.E.addView(this.F, tre.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        yob.X(this.G, aob.y6, vnbVar);
        this.G.setText(ob6.M0(2131750205, null));
        this.E.addView(this.G, tre.t(-2, -2, 1, 0, 10, 0, 0));
        c51 c51Var = new c51(vnbVar, getContext(), true);
        this.H = c51Var;
        c51Var.i(ob6.M0(2131750206, null), false, true);
        this.E.addView(this.H, tre.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final au8 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view3) {
                byte b = r2;
                au8 au8Var = this.b;
                switch (b) {
                    case 0:
                        axa axaVar = au8Var.e;
                        if (axaVar != null) {
                            if (!axaVar.e || axaVar.g != 783) {
                                axaVar.g = 783;
                                axaVar.e = true;
                                axaVar.k(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        au8Var.a.a();
                        return;
                }
            }
        });
        addView(this.y, tre.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        waVar.setEmptyView(this.y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(cgaVar.e.h() ? 0 : 8);
        }
    }

    public static void a(au8 au8Var, boolean z) {
        au8Var.setReordering(z);
    }

    public void setReordering(boolean z) {
        wa waVar;
        if (this.h != z) {
            this.h = z;
            cga cgaVar = this.a;
            cgaVar.q(cgaVar.g());
            int i = 0;
            while (true) {
                waVar = this.f;
                if (i >= waVar.getChildCount()) {
                    break;
                }
                View childAt = waVar.getChildAt(i);
                if (childAt instanceof sx4) {
                    ((sx4) childAt).e(z, true);
                }
                i++;
            }
            l9c l9cVar = waVar.g3;
            if (l9cVar != null) {
                l9cVar.T();
            }
            if (z) {
                e S = LaunchActivity.S();
                if (S instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) S;
                    profileActivity.k3(false);
                    hl.c3(new y56(profileActivity, (byte) 29));
                }
            }
        }
    }

    public final void b() {
        setReordering(true);
    }

    public final void c() {
        setReordering(true);
    }

    public final void d() {
        setReordering(true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.I3 && objArr[1] == this.e) {
            f(true);
            if (this.e != null && isAttachedToWindow()) {
                wa waVar = this.f;
                if (waVar.canScrollVertically(1)) {
                    for (int i3 = 0; i3 < waVar.getChildCount(); i3++) {
                        if (!(waVar.getChildAt(i3) instanceof tk4)) {
                        }
                    }
                    return;
                }
                this.e.a();
            }
        }
    }

    public final void e() {
        if (!this.h) {
            return;
        }
        axa axaVar = this.e;
        if (axaVar != null) {
            axaVar.p();
        }
        setReordering(false);
    }

    public final void f(boolean z) {
        l9c l9cVar;
        wa waVar = this.f;
        if (waVar != null && (l9cVar = waVar.g3) != null) {
            boolean canScrollVertically = waVar.canScrollVertically(-1);
            l9cVar.O(z);
            if (!canScrollVertically) {
                waVar.x0(0);
            }
        }
    }

    public final void g() {
        boolean z;
        cga cgaVar = this.a;
        if (cgaVar.M == 0) {
            z = true;
        } else {
            z = false;
        }
        setClipChildren(z);
        wa waVar = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) waVar.getLayoutParams();
        int i = marginLayoutParams.topMargin;
        int i2 = -cgaVar.M;
        if (i != i2 || marginLayoutParams.bottomMargin != (-cgaVar.N)) {
            marginLayoutParams.topMargin = i2;
            marginLayoutParams.bottomMargin = -cgaVar.N;
            waVar.setLayoutParams(marginLayoutParams);
        }
        waVar.setPadding(hl.L(9.0f), cgaVar.M + cgaVar.L, hl.L(9.0f), hl.L(86.0f) + cgaVar.N);
    }

    public float getTabsHeight() {
        wa waVar = this.f;
        float y = waVar.getY();
        for (int i = 0; i < waVar.getChildCount(); i++) {
            View childAt = waVar.getChildAt(i);
            int S = RecyclerView.S(childAt);
            if (childAt instanceof sx4) {
                if (S == 0) {
                    return Math.max(0.0f, childAt.getY() + y);
                }
            } else if (S == 0) {
                return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY() + y);
            }
        }
        return 0.0f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.b).b(this, jn7.I3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.b).n(this, jn7.I3);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setVisibleHeight(this.n);
    }

    public void setHasTabs(boolean z) {
        if (this.I == z) {
            return;
        }
        this.I = z;
        wa waVar = this.f;
        boolean canScrollVertically = waVar.canScrollVertically(-1);
        waVar.g3.O(true);
        if (!canScrollVertically) {
            waVar.x0(0);
        }
        this.a.p();
    }

    public void setVisibleHeight(int i) {
        this.n = i;
        float l = Utilities.l(hl.x1(i, hl.L(150.0f), hl.L(220.0f)));
        float R1 = hl.R1(0.6f, 1.0f, l);
        LinearLayout linearLayout = this.s;
        if (linearLayout != null) {
            linearLayout.setAlpha(l);
            this.s.setScaleX(R1);
            this.s.setScaleY(R1);
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.n)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.E;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(l);
            this.E.setScaleX(R1);
            this.E.setScaleY(R1);
        }
        FrameLayout frameLayout2 = this.y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.n)) / 2.0f);
        }
    }
}
