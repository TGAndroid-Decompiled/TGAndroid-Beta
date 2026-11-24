package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class pq8 extends FrameLayout implements gk7 {
    public final LinearLayout E;
    public final TextView F;
    public final TextView G;
    public final u41 H;
    public boolean I;
    public final lca a;
    public final int b;
    public final wjb c;
    public boolean d;
    public xsa e;
    public final va f;
    public boolean h;
    public int n;
    public final FrameLayout r;
    public final LinearLayout s;
    public final TextView w;
    public final TextView x;
    public final FrameLayout y;

    public pq8(lca lcaVar, int i, wjb wjbVar) {
        super(lcaVar.getContext());
        this.n = gl.q.y;
        Context context = lcaVar.getContext();
        this.a = lcaVar;
        this.b = i;
        this.c = wjbVar;
        va vaVar = new va(context, i, new tf8(this, (byte) 4), new jq8(this), new jq8(this), wjbVar, lcaVar);
        this.f = vaVar;
        vaVar.g3.r = false;
        vaVar.setSelectorType(9);
        vaVar.setSelectorDrawableColor(0);
        vaVar.setClipToPadding(false);
        vaVar.setClipChildren(false);
        addView(vaVar, nme.e(-1, -1, 119));
        g();
        vaVar.j(new si1(this, lcaVar, (byte) 8));
        lq8 lq8Var = new lq8(lcaVar);
        lq8Var.m = false;
        lq8Var.C = false;
        lq8Var.o(s33.h);
        lq8Var.n(350L);
        vaVar.setItemAnimator(lq8Var);
        new is5(new mq8(this, lcaVar)).h(vaVar);
        View view = this.r;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        if (lcaVar.d == this.e) {
            this.y = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.E = null;
            this.r = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.s = linearLayout;
            linearLayout.setOrientation(1);
            this.r.addView(this.s, nme.e(-2, -2, 17));
            be0 be0Var = new be0(getContext());
            be0Var.setImageDrawable(new oy8(2131624314, gl.L(120.0f), gl.L(120.0f)));
            this.s.addView(be0Var, nme.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.w = textView;
            textView.setTextSize(1, 17.0f);
            this.w.setTypeface(gl.o());
            zkb.X(this.w, bkb.F6, wjbVar);
            this.w.setText(k96.M0(2131746476, null));
            this.s.addView(this.w, nme.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.x;
            int i2 = bkb.Ei;
            zkb.X(textView3, i2, wjbVar);
            this.x.setText(k96.M0(2131746477, null));
            this.x.setOnClickListener(new View.OnClickListener(this) {
                public final pq8 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view3) {
                    byte b = r2;
                    pq8 pq8Var = this.b;
                    switch (b) {
                        case 0:
                            xsa xsaVar = pq8Var.e;
                            if (xsaVar != null) {
                                if (!xsaVar.e || xsaVar.g != 783) {
                                    xsaVar.g = 783;
                                    xsaVar.e = true;
                                    xsaVar.k(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            pq8Var.a.a();
                            return;
                    }
                }
            });
            this.x.setPadding(gl.L(10.0f), gl.L(4.0f), gl.L(10.0f), gl.L(4.0f));
            zkb.R(this.x, bkb.Y(bkb.p1(0.1f, bkb.v0(i2, wjbVar)), 4, 4), null, zkb.K(0.1f, i2), wjbVar);
            ote.a(this.x);
            this.s.addView(this.x, nme.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.r, nme.e(-1, -1, 119));
            vaVar.setEmptyView(this.r);
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
        this.y.addView(this.E, nme.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.F = textView4;
        textView4.setTextSize(1, 20.0f);
        this.F.setTypeface(gl.o());
        zkb.X(this.F, bkb.F6, wjbVar);
        this.F.setText(k96.M0(2131750229, null));
        this.E.addView(this.F, nme.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.G = textView5;
        textView5.setTextSize(1, 14.0f);
        zkb.X(this.G, bkb.x6, wjbVar);
        this.G.setText(k96.M0(2131750230, null));
        this.E.addView(this.G, nme.t(-2, -2, 1, 0, 10, 0, 0));
        u41 u41Var = new u41(wjbVar, getContext(), true);
        this.H = u41Var;
        u41Var.i(k96.M0(2131750231, null), false, true);
        this.E.addView(this.H, nme.t(200, 44, 1, 0, 19, 0, 12));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final pq8 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view3) {
                byte b = r2;
                pq8 pq8Var = this.b;
                switch (b) {
                    case 0:
                        xsa xsaVar = pq8Var.e;
                        if (xsaVar != null) {
                            if (!xsaVar.e || xsaVar.g != 783) {
                                xsaVar.g = 783;
                                xsaVar.e = true;
                                xsaVar.k(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        pq8Var.a.a();
                        return;
                }
            }
        });
        addView(this.y, nme.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        vaVar.setEmptyView(this.y);
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(lcaVar.e.h() ? 0 : 8);
        }
    }

    public static void a(pq8 pq8Var, boolean z) {
        pq8Var.setReordering(z);
    }

    public void setReordering(boolean z) {
        va vaVar;
        if (this.h != z) {
            this.h = z;
            lca lcaVar = this.a;
            lcaVar.q(lcaVar.g());
            int i = 0;
            while (true) {
                vaVar = this.f;
                if (i >= vaVar.getChildCount()) {
                    break;
                }
                View childAt = vaVar.getChildAt(i);
                if (childAt instanceof nv4) {
                    ((nv4) childAt).e(z, true);
                }
                i++;
            }
            l5c l5cVar = vaVar.g3;
            if (l5cVar != null) {
                l5cVar.T();
            }
            if (z) {
                d S = LaunchActivity.S();
                if (S instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) S;
                    profileActivity.j3(false);
                    gl.c3(new v36(profileActivity, (byte) 29));
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
        if (i == kk7.H3 && objArr[1] == this.e) {
            f(true);
            if (this.e != null && isAttachedToWindow()) {
                va vaVar = this.f;
                if (vaVar.canScrollVertically(1)) {
                    for (int i3 = 0; i3 < vaVar.getChildCount(); i3++) {
                        if (!(vaVar.getChildAt(i3) instanceof pi4)) {
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
        xsa xsaVar = this.e;
        if (xsaVar != null) {
            xsaVar.p();
        }
        setReordering(false);
    }

    public final void f(boolean z) {
        l5c l5cVar;
        va vaVar = this.f;
        if (vaVar != null && (l5cVar = vaVar.g3) != null) {
            boolean canScrollVertically = vaVar.canScrollVertically(-1);
            l5cVar.O(z);
            if (!canScrollVertically) {
                vaVar.w0(0);
            }
        }
    }

    public final void g() {
        boolean z;
        lca lcaVar = this.a;
        if (lcaVar.M == 0) {
            z = true;
        } else {
            z = false;
        }
        setClipChildren(z);
        va vaVar = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vaVar.getLayoutParams();
        int i = marginLayoutParams.topMargin;
        int i2 = -lcaVar.M;
        if (i != i2 || marginLayoutParams.bottomMargin != (-lcaVar.N)) {
            marginLayoutParams.topMargin = i2;
            marginLayoutParams.bottomMargin = -lcaVar.N;
            vaVar.setLayoutParams(marginLayoutParams);
        }
        vaVar.setPadding(gl.L(9.0f), lcaVar.M + lcaVar.L, gl.L(9.0f), gl.L(86.0f) + lcaVar.N);
    }

    public float getTabsHeight() {
        va vaVar = this.f;
        float y = vaVar.getY();
        for (int i = 0; i < vaVar.getChildCount(); i++) {
            View childAt = vaVar.getChildAt(i);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof nv4) {
                if (R == 0) {
                    return Math.max(0.0f, childAt.getY() + y);
                }
            } else if (R == 0) {
                return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY() + y);
            }
        }
        return 0.0f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.b).b(this, kk7.H3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.b).n(this, kk7.H3);
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
        va vaVar = this.f;
        boolean canScrollVertically = vaVar.canScrollVertically(-1);
        vaVar.g3.O(true);
        if (!canScrollVertically) {
            vaVar.w0(0);
        }
        this.a.p();
    }

    public void setVisibleHeight(int i) {
        this.n = i;
        float l = Utilities.l(gl.x1(i, gl.L(150.0f), gl.L(220.0f)));
        float R1 = gl.R1(0.6f, 1.0f, l);
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
