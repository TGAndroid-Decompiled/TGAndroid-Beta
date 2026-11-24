package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Intro;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.d;
public final class vr5 extends d implements jm7 {
    public boolean E;
    public Drawable F;
    public CharSequence[] G;
    public String[] H;
    public int I;
    public ur5 J;
    public long K;
    public boolean L;
    public hb6 M;
    public boolean N;
    public boolean O;
    public int P;
    public final o04 Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Object a;
    public final Object b;
    public final int c;
    public ggc d;
    public yx0 e;
    public TextView f;
    public GradientDrawable h;
    public t8 n;
    public FrameLayout r;
    public su s;
    public p09 w;
    public int x;
    public boolean y;

    public vr5() {
        super(null);
        this.a = new Object();
        this.b = new Object();
        this.c = z8c.t0;
        this.x = 0;
        this.y = false;
        this.E = false;
        this.Q = new o04(this, (byte) 14);
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr5.Z():void");
    }

    public final void a0(boolean z) {
        GradientDrawable gradientDrawable = this.h;
        int i = cmb.Ei;
        gradientDrawable.setColors(new int[]{getThemedColor(i), getThemedColor(cmb.Fi)});
        this.F.setColorFilter(cmb.p1(0.9f, getThemedColor(cmb.z8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i2 = cmb.c6;
        view.setBackgroundColor(cmb.w0(null, i2, false));
        this.f.setTextColor(cmb.w0(null, cmb.p6, false));
        this.n.setTextColor(cmb.w0(null, cmb.Ii, false));
        t8 t8Var = this.n;
        int L = gm.L(24.0f);
        int w0 = cmb.w0(null, cmb.Gi, false);
        t8Var.setBackground(cmb.i0(L, L, L, L, 0, w0, w0));
        this.w.setColorFilter(new PorterDuffColorFilter(cmb.w0(null, i, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        this.P = cmb.w0(null, i2, false);
        if (z) {
            ur5 ur5Var = this.J;
            if (ur5Var != null) {
                ur5Var.postRunnable(new kg5(this, (byte) 6));
            }
            for (int i3 = 0; i3 < this.d.getChildCount(); i3++) {
                View childAt = this.d.getChildAt(i3);
                int i4 = cmb.F6;
                ((TextView) childAt.findViewWithTag(this.a)).setTextColor(cmb.w0(null, i4, false));
                ((TextView) childAt.findViewWithTag(this.b)).setTextColor(cmb.w0(null, i4, false));
            }
            return;
        }
        Intro.a(cmb.w0(null, i2, false));
    }

    @Override
    public final View createView(Context context) {
        int i;
        int i2;
        int i3;
        Drawable d = b10.d(context, 2131232792);
        this.F = d;
        d.setBounds(0, gm.L(8.666f), gm.L(115.0f), gm.L(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131747481, null));
        spannableStringBuilder.setSpan(new ImageSpan(this.F), 0, spannableStringBuilder.length(), 33);
        this.G[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        ?? imageView = new ImageView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView((View) imageView, qoe.e(28, 28, 17));
        su suVar = new su(this, context, frameLayout, (byte) 20);
        this.s = suVar;
        scrollView.addView(suVar, qoe.x(-1, -2, 51));
        p09 p09Var = new p09(2131624234, gm.L(28.0f), gm.L(28.0f), true, null);
        this.w = p09Var;
        p09Var.h = true;
        p09Var.a0 = true;
        p09Var.j();
        p09 p09Var2 = this.w;
        if (cmb.B0().o()) {
            i = this.w.e[0] - 1;
        } else {
            i = 0;
        }
        p09Var2.K(i);
        p09 p09Var3 = this.w;
        if (cmb.B0().o()) {
            i2 = this.w.e[0] - 1;
        } else {
            i2 = 0;
        }
        p09Var3.I(i2, false, false);
        if (cmb.B0().o()) {
            i3 = 2131754750;
        } else {
            i3 = 2131754749;
        }
        imageView.setContentDescription(jb6.M0(i3, null));
        imageView.setAnimation(this.w);
        frameLayout.setOnClickListener(new tf3(this, imageView, (byte) 25));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        this.s.addView(frameLayout2, qoe.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.r.addView(textureView, qoe.e(200, 150, 17));
        textureView.setSurfaceTextureListener(new tr5(this, (byte) 0));
        ggc ggcVar = new ggc(context);
        this.d = ggcVar;
        ggcVar.setAdapter(new db5(this, (byte) 1));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.s.addView(this.d, qoe.c(-1.0f, -1));
        this.d.b(new lw(this, (byte) 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        t8 t8Var = new t8(this, context);
        this.n = t8Var;
        rve.b(t8Var, 0.02f, 1.2f);
        this.n.setText(jb6.M0(2131744600, null));
        this.n.setGravity(17);
        this.n.setTypeface(gm.o());
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        this.s.addView(this.n, qoe.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.n.setOnClickListener(new View.OnClickListener(this) {
            public final vr5 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                vr5 vr5Var = this.b;
                switch (b) {
                    case 0:
                        if (!vr5Var.E) {
                            vr5Var.E = true;
                            vr5Var.presentFragment(new mh6(), true);
                            vr5Var.N = true;
                            return;
                        }
                        return;
                    default:
                        if (!vr5Var.E && vr5Var.M != null) {
                            vr5Var.E = true;
                            he heVar = new he(3, null, view.getContext());
                            heVar.j0 = false;
                            heVar.q(1000L);
                            nm7.e().a(new ov0(vr5Var, heVar, (byte) 1), 279);
                            jb6.D0().d(vr5Var.M, true, false, vr5Var.c);
                            return;
                        }
                        return;
                }
            }
        });
        yx0 yx0Var = new yx0(context, this.d, 6);
        this.e = yx0Var;
        this.s.addView(yx0Var, qoe.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setGravity(17);
        this.f.setTextSize(1, 16.0f);
        this.s.addView(this.f, qoe.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f.setOnClickListener(new View.OnClickListener(this) {
            public final vr5 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                vr5 vr5Var = this.b;
                switch (b) {
                    case 0:
                        if (!vr5Var.E) {
                            vr5Var.E = true;
                            vr5Var.presentFragment(new mh6(), true);
                            vr5Var.N = true;
                            return;
                        }
                        return;
                    default:
                        if (!vr5Var.E && vr5Var.M != null) {
                            vr5Var.E = true;
                            he heVar = new he(3, null, view.getContext());
                            heVar.j0 = false;
                            heVar.q(1000L);
                            nm7.e().a(new ov0(vr5Var, heVar, (byte) 1), 279);
                            jb6.D0().d(vr5Var.M, true, false, vr5Var.c);
                            return;
                        }
                        return;
                }
            }
        });
        this.s.addView(frameLayout, qoe.d(64, 64.0f, 53, 0.0f, 4.0f, 4.0f, 0.0f));
        this.fragmentView = scrollView;
        nm7.e().b(this, nm7.C4);
        int i4 = this.c;
        nm7.f(i4).b(this, nm7.J2);
        ConnectionsManager.getInstance(i4).updateDcSettings();
        jb6.D0().V0(i4, true);
        Z();
        this.y = true;
        a0(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != nm7.C4 && i != nm7.J2) {
            return;
        }
        Z();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return kwe.a(new t10(this, (byte) 8), cmb.c6, cmb.p6, cmb.O9, cmb.P9, cmb.Ii, cmb.F6);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (on2.h(cmb.w0(null, cmb.c6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        if (this.O) {
            AnimatorSet duration = new AnimatorSet().setDuration(50L);
            duration.playTogether(ValueAnimator.ofFloat(new float[0]));
            return duration;
        }
        return null;
    }

    @Override
    public final boolean onFragmentCreate() {
        oc7.d1().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.G = new CharSequence[]{null, jb6.M0(2131747479, null), jb6.M0(2131747477, null), jb6.M0(2131747473, null), jb6.M0(2131747475, null), jb6.M0(2131747471, null)};
        this.H = new String[]{jb6.M0(2131747482, null), jb6.M0(2131747480, null), jb6.M0(2131747478, null), jb6.M0(2131747474, null), jb6.M0(2131747476, null), jb6.M0(2131747472, null)};
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = true;
        gm.r(this.Q);
        nm7.e().n(this, nm7.C4);
        nm7.f(this.c).n(this, nm7.J2);
        oc7.d1().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override
    public final void onPause() {
        super.onPause();
        gm.K3(getParentActivity());
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.y) {
            boolean z = jb6.a0;
            ggc ggcVar = this.d;
            if (z) {
                ggcVar.setCurrentItem(6);
                this.x = 6;
            } else {
                ggcVar.setCurrentItem(0);
                this.x = 0;
            }
            this.y = false;
        }
        gm.e2(getParentActivity());
    }

    @Override
    public final void onThemeColorsChanged() {
        o04 o04Var = this.Q;
        try {
            if (this.fragmentView != null) {
                int i = cmb.Ei;
                int themedColor = getThemedColor(i);
                int themedColor2 = getThemedColor(cmb.Fi);
                GradientDrawable gradientDrawable = this.h;
                if (gradientDrawable != null && (themedColor != this.R || themedColor2 != this.S)) {
                    this.R = themedColor;
                    this.S = themedColor2;
                    gradientDrawable.setColors(new int[]{themedColor, themedColor2});
                }
                int p1 = cmb.p1(0.9f, getThemedColor(cmb.z8));
                Drawable drawable = this.F;
                if (drawable != null && p1 != this.T) {
                    this.T = p1;
                    drawable.setColorFilter(p1, PorterDuff.Mode.MULTIPLY);
                }
                this.fragmentView.setBackgroundColor(cmb.w0(null, cmb.c6, false));
                TextView textView = this.f;
                if (textView != null) {
                    textView.setTextColor(cmb.w0(null, cmb.p6, false));
                }
                t8 t8Var = this.n;
                if (t8Var != null) {
                    t8Var.setTextColor(cmb.w0(null, cmb.Ii, false));
                    cmb.F1(this.n.getBackground(), cmb.w0(null, cmb.Gi, false), true);
                }
                int w0 = cmb.w0(null, i, false);
                p09 p09Var = this.w;
                if (p09Var != null && w0 != this.U) {
                    this.U = w0;
                    p09Var.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
                }
                yx0 yx0Var = this.e;
                if (yx0Var != null) {
                    yx0Var.invalidate();
                }
                if (this.d != null) {
                    for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
                        View childAt = this.d.getChildAt(i2);
                        TextView textView2 = (TextView) childAt.findViewWithTag(this.a);
                        if (textView2 != null) {
                            textView2.setTextColor(cmb.w0(null, cmb.F6, false));
                        }
                        TextView textView3 = (TextView) childAt.findViewWithTag(this.b);
                        if (textView3 != null) {
                            textView3.setTextColor(cmb.w0(null, cmb.F6, false));
                        }
                    }
                }
                if (this.J != null && this.P != cmb.w0(null, cmb.c6, false)) {
                    gm.r(o04Var);
                    gm.d3(o04Var, 100L);
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
