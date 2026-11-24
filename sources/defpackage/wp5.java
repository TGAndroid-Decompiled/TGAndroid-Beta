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
public final class wp5 extends d implements gk7 {
    public boolean E;
    public Drawable F;
    public CharSequence[] G;
    public String[] H;
    public int I;
    public vp5 J;
    public long K;
    public boolean L;
    public i96 M;
    public boolean N;
    public boolean O;
    public int P;
    public final ez3 Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Object a;
    public final Object b;
    public final int c;
    public gec d;
    public qw0 e;
    public TextView f;
    public GradientDrawable h;
    public t8 n;
    public FrameLayout r;
    public st s;
    public oy8 w;
    public int x;
    public boolean y;

    public wp5() {
        super(null);
        this.a = new Object();
        this.b = new Object();
        this.c = y6c.t0;
        this.x = 0;
        this.y = false;
        this.E = false;
        this.Q = new ez3(this, (byte) 14);
    }

    public final void Y() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp5.Y():void");
    }

    public final void Z(boolean z) {
        GradientDrawable gradientDrawable = this.h;
        int i = bkb.Ei;
        gradientDrawable.setColors(new int[]{getThemedColor(i), getThemedColor(bkb.Fi)});
        this.F.setColorFilter(bkb.p1(0.9f, getThemedColor(bkb.z8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i2 = bkb.c6;
        view.setBackgroundColor(bkb.w0(null, i2, false));
        this.f.setTextColor(bkb.w0(null, bkb.p6, false));
        this.n.setTextColor(bkb.w0(null, bkb.Ii, false));
        t8 t8Var = this.n;
        int L = gl.L(24.0f);
        int w0 = bkb.w0(null, bkb.Gi, false);
        t8Var.setBackground(bkb.i0(L, L, L, L, 0, w0, w0));
        this.w.setColorFilter(new PorterDuffColorFilter(bkb.w0(null, i, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        this.P = bkb.w0(null, i2, false);
        if (z) {
            vp5 vp5Var = this.J;
            if (vp5Var != null) {
                vp5Var.postRunnable(new iu4(this, (byte) 29));
            }
            for (int i3 = 0; i3 < this.d.getChildCount(); i3++) {
                View childAt = this.d.getChildAt(i3);
                int i4 = bkb.F6;
                ((TextView) childAt.findViewWithTag(this.a)).setTextColor(bkb.w0(null, i4, false));
                ((TextView) childAt.findViewWithTag(this.b)).setTextColor(bkb.w0(null, i4, false));
            }
            return;
        }
        Intro.a(bkb.w0(null, i2, false));
    }

    @Override
    public final View createView(Context context) {
        int i;
        int i2;
        int i3;
        Drawable d = b00.d(context, 2131232779);
        this.F = d;
        d.setBounds(0, gl.L(8.666f), gl.L(115.0f), gl.L(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131747555, null));
        spannableStringBuilder.setSpan(new ImageSpan(this.F), 0, spannableStringBuilder.length(), 33);
        this.G[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        ?? imageView = new ImageView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView((View) imageView, nme.e(28, 28, 17));
        st stVar = new st(this, context, frameLayout, (byte) 19);
        this.s = stVar;
        scrollView.addView(stVar, nme.x(-1, -2, 51));
        oy8 oy8Var = new oy8(2131624234, gl.L(28.0f), gl.L(28.0f), true, null);
        this.w = oy8Var;
        oy8Var.h = true;
        oy8Var.a0 = true;
        oy8Var.j();
        oy8 oy8Var2 = this.w;
        if (bkb.B0().o()) {
            i = this.w.e[0] - 1;
        } else {
            i = 0;
        }
        oy8Var2.K(i);
        oy8 oy8Var3 = this.w;
        if (bkb.B0().o()) {
            i2 = this.w.e[0] - 1;
        } else {
            i2 = 0;
        }
        oy8Var3.I(i2, false, false);
        if (bkb.B0().o()) {
            i3 = 2131754750;
        } else {
            i3 = 2131754749;
        }
        imageView.setContentDescription(k96.M0(i3, null));
        imageView.setAnimation(this.w);
        frameLayout.setOnClickListener(new xf3(this, (Object) imageView, (byte) 24));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        this.s.addView(frameLayout2, nme.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.r.addView(textureView, nme.e(200, 150, 17));
        textureView.setSurfaceTextureListener(new up5(this, (byte) 0));
        gec gecVar = new gec(context);
        this.d = gecVar;
        gecVar.setAdapter(new f95(this, (byte) 1));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.s.addView(this.d, nme.c(-1.0f, -1));
        this.d.b(new lv(this, (byte) 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        t8 t8Var = new t8(this, context);
        this.n = t8Var;
        ote.b(t8Var, 0.02f, 1.2f);
        this.n.setText(k96.M0(2131744674, null));
        this.n.setGravity(17);
        this.n.setTypeface(gl.o());
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        this.s.addView(this.n, nme.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.n.setOnClickListener(new View.OnClickListener(this) {
            public final wp5 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                wp5 wp5Var = this.b;
                switch (b) {
                    case 0:
                        if (!wp5Var.E) {
                            wp5Var.E = true;
                            wp5Var.presentFragment(new mf6(), true);
                            wp5Var.N = true;
                            return;
                        }
                        return;
                    default:
                        if (!wp5Var.E && wp5Var.M != null) {
                            wp5Var.E = true;
                            hd hdVar = new hd(3, null, view.getContext());
                            hdVar.j0 = false;
                            hdVar.q(1000L);
                            kk7.e().a(new fu0(wp5Var, hdVar, (byte) 1), 277);
                            k96.D0().d(wp5Var.M, true, false, wp5Var.c);
                            return;
                        }
                        return;
                }
            }
        });
        qw0 qw0Var = new qw0(context, this.d, 6);
        this.e = qw0Var;
        this.s.addView(qw0Var, nme.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setGravity(17);
        this.f.setTextSize(1, 16.0f);
        this.s.addView(this.f, nme.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f.setOnClickListener(new View.OnClickListener(this) {
            public final wp5 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                wp5 wp5Var = this.b;
                switch (b) {
                    case 0:
                        if (!wp5Var.E) {
                            wp5Var.E = true;
                            wp5Var.presentFragment(new mf6(), true);
                            wp5Var.N = true;
                            return;
                        }
                        return;
                    default:
                        if (!wp5Var.E && wp5Var.M != null) {
                            wp5Var.E = true;
                            hd hdVar = new hd(3, null, view.getContext());
                            hdVar.j0 = false;
                            hdVar.q(1000L);
                            kk7.e().a(new fu0(wp5Var, hdVar, (byte) 1), 277);
                            k96.D0().d(wp5Var.M, true, false, wp5Var.c);
                            return;
                        }
                        return;
                }
            }
        });
        this.s.addView(frameLayout, nme.d(64, 64.0f, 53, 0.0f, 4.0f, 4.0f, 0.0f));
        this.fragmentView = scrollView;
        kk7.e().b(this, kk7.A4);
        int i4 = this.c;
        kk7.f(i4).b(this, kk7.I2);
        ConnectionsManager.getInstance(i4).updateDcSettings();
        k96.D0().V0(i4, true);
        Y();
        this.y = true;
        Z(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != kk7.A4 && i != kk7.I2) {
            return;
        }
        Y();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return hue.a(new t00(this, (byte) 8), bkb.c6, bkb.p6, bkb.O9, bkb.P9, bkb.Ii, bkb.F6);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (bm2.h(bkb.w0(null, bkb.c6, true)) > 0.699999988079071d) {
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
        na7.c1().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.G = new CharSequence[]{null, k96.M0(2131747553, null), k96.M0(2131747551, null), k96.M0(2131747547, null), k96.M0(2131747549, null), k96.M0(2131747545, null)};
        this.H = new String[]{k96.M0(2131747556, null), k96.M0(2131747554, null), k96.M0(2131747552, null), k96.M0(2131747548, null), k96.M0(2131747550, null), k96.M0(2131747546, null)};
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = true;
        gl.r(this.Q);
        kk7.e().n(this, kk7.A4);
        kk7.f(this.c).n(this, kk7.I2);
        na7.c1().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override
    public final void onPause() {
        super.onPause();
        gl.K3(getParentActivity());
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.y) {
            boolean z = k96.a0;
            gec gecVar = this.d;
            if (z) {
                gecVar.setCurrentItem(6);
                this.x = 6;
            } else {
                gecVar.setCurrentItem(0);
                this.x = 0;
            }
            this.y = false;
        }
        gl.e2(getParentActivity());
    }

    @Override
    public final void onThemeColorsChanged() {
        ez3 ez3Var = this.Q;
        try {
            if (this.fragmentView != null) {
                int i = bkb.Ei;
                int themedColor = getThemedColor(i);
                int themedColor2 = getThemedColor(bkb.Fi);
                GradientDrawable gradientDrawable = this.h;
                if (gradientDrawable != null && (themedColor != this.R || themedColor2 != this.S)) {
                    this.R = themedColor;
                    this.S = themedColor2;
                    gradientDrawable.setColors(new int[]{themedColor, themedColor2});
                }
                int p1 = bkb.p1(0.9f, getThemedColor(bkb.z8));
                Drawable drawable = this.F;
                if (drawable != null && p1 != this.T) {
                    this.T = p1;
                    drawable.setColorFilter(p1, PorterDuff.Mode.MULTIPLY);
                }
                this.fragmentView.setBackgroundColor(bkb.w0(null, bkb.c6, false));
                TextView textView = this.f;
                if (textView != null) {
                    textView.setTextColor(bkb.w0(null, bkb.p6, false));
                }
                t8 t8Var = this.n;
                if (t8Var != null) {
                    t8Var.setTextColor(bkb.w0(null, bkb.Ii, false));
                    bkb.F1(this.n.getBackground(), bkb.w0(null, bkb.Gi, false), true);
                }
                int w0 = bkb.w0(null, i, false);
                oy8 oy8Var = this.w;
                if (oy8Var != null && w0 != this.U) {
                    this.U = w0;
                    oy8Var.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
                }
                qw0 qw0Var = this.e;
                if (qw0Var != null) {
                    qw0Var.invalidate();
                }
                if (this.d != null) {
                    for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
                        View childAt = this.d.getChildAt(i2);
                        TextView textView2 = (TextView) childAt.findViewWithTag(this.a);
                        if (textView2 != null) {
                            textView2.setTextColor(bkb.w0(null, bkb.F6, false));
                        }
                        TextView textView3 = (TextView) childAt.findViewWithTag(this.b);
                        if (textView3 != null) {
                            textView3.setTextColor(bkb.w0(null, bkb.F6, false));
                        }
                    }
                }
                if (this.J != null && this.P != bkb.w0(null, bkb.c6, false)) {
                    gl.r(ez3Var);
                    gl.d3(ez3Var, 100L);
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
