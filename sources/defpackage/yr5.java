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
import org.telegram.ui.ActionBar.e;
public final class yr5 extends e implements fn7 {
    public boolean E;
    public Drawable F;
    public CharSequence[] G;
    public String[] H;
    public int I;
    public xr5 J;
    public long K;
    public boolean L;
    public mb6 M;
    public boolean N;
    public boolean O;
    public int P;
    public final zz3 Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Object a;
    public final Object b;
    public final int c;
    public fic d;
    public zw0 e;
    public TextView f;
    public GradientDrawable h;
    public u8 n;
    public FrameLayout r;
    public tt s;
    public b29 w;
    public int x;
    public boolean y;

    public yr5() {
        super(null);
        this.a = new Object();
        this.b = new Object();
        this.c = yac.t0;
        this.x = 0;
        this.y = false;
        this.E = false;
        this.Q = new zz3(this, (byte) 14);
    }

    public final void Y() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yr5.Y():void");
    }

    public final void Z(boolean z) {
        GradientDrawable gradientDrawable = this.h;
        int i = aob.Fi;
        gradientDrawable.setColors(new int[]{getThemedColor(i), getThemedColor(aob.Gi)});
        this.F.setColorFilter(aob.p1(0.9f, getThemedColor(aob.A8)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i2 = aob.d6;
        view.setBackgroundColor(aob.w0(null, i2, false));
        this.f.setTextColor(aob.w0(null, aob.q6, false));
        this.n.setTextColor(aob.w0(null, aob.Ji, false));
        u8 u8Var = this.n;
        int L = hl.L(24.0f);
        int w0 = aob.w0(null, aob.Hi, false);
        u8Var.setBackground(aob.i0(L, L, L, L, 0, w0, w0));
        this.w.setColorFilter(new PorterDuffColorFilter(aob.w0(null, i, false), PorterDuff.Mode.SRC_IN));
        this.e.invalidate();
        this.P = aob.w0(null, i2, false);
        if (z) {
            xr5 xr5Var = this.J;
            if (xr5Var != null) {
                xr5Var.postRunnable(new ea5(this, (byte) 14));
            }
            for (int i3 = 0; i3 < this.d.getChildCount(); i3++) {
                View childAt = this.d.getChildAt(i3);
                int i4 = aob.G6;
                ((TextView) childAt.findViewWithTag(this.a)).setTextColor(aob.w0(null, i4, false));
                ((TextView) childAt.findViewWithTag(this.b)).setTextColor(aob.w0(null, i4, false));
            }
            return;
        }
        Intro.a(aob.w0(null, i2, false));
    }

    @Override
    public final View createView(Context context) {
        int i;
        int i2;
        int i3;
        Drawable e = c00.e(context, 2131232798);
        this.F = e;
        e.setBounds(0, hl.L(8.666f), hl.L(115.0f), hl.L(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131747475, null));
        spannableStringBuilder.setSpan(new ImageSpan(this.F), 0, spannableStringBuilder.length(), 33);
        this.G[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        ?? imageView = new ImageView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView((View) imageView, tre.e(28, 28, 17));
        tt ttVar = new tt(this, context, frameLayout, (byte) 20);
        this.s = ttVar;
        scrollView.addView(ttVar, tre.x(-1, -2, 51));
        b29 b29Var = new b29(2131624234, hl.L(28.0f), hl.L(28.0f), true, null);
        this.w = b29Var;
        b29Var.h = true;
        b29Var.a0 = true;
        b29Var.j();
        b29 b29Var2 = this.w;
        if (aob.B0().o()) {
            i = this.w.e[0] - 1;
        } else {
            i = 0;
        }
        b29Var2.K(i);
        b29 b29Var3 = this.w;
        if (aob.B0().o()) {
            i2 = this.w.e[0] - 1;
        } else {
            i2 = 0;
        }
        b29Var3.I(i2, false, false);
        if (aob.B0().o()) {
            i3 = 2131754746;
        } else {
            i3 = 2131754745;
        }
        imageView.setContentDescription(ob6.M0(i3, null));
        imageView.setAnimation(this.w);
        frameLayout.setOnClickListener(new je3(this, imageView, (byte) 27));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        this.s.addView(frameLayout2, tre.d(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.r.addView(textureView, tre.e(200, 150, 17));
        textureView.setSurfaceTextureListener(new wr5(this, (byte) 0));
        fic ficVar = new fic(context);
        this.d = ficVar;
        ficVar.setAdapter(new gb5(this, (byte) 1));
        this.d.setPageMargin(0);
        this.d.setOffscreenPageLimit(1);
        this.s.addView(this.d, tre.c(-1.0f, -1));
        this.d.b(new mv(this, (byte) 1));
        this.h = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        u8 u8Var = new u8(this, context);
        this.n = u8Var;
        iye.b(u8Var, 0.02f, 1.2f);
        this.n.setText(ob6.M0(2131744568, null));
        this.n.setGravity(17);
        this.n.setTypeface(hl.o());
        this.n.setTextSize(1, 15.0f);
        this.n.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        this.s.addView(this.n, tre.d(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        this.n.setOnClickListener(new View.OnClickListener(this) {
            public final yr5 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                yr5 yr5Var = this.b;
                switch (b) {
                    case 0:
                        if (!yr5Var.E) {
                            yr5Var.E = true;
                            yr5Var.presentFragment(new qh6(), true);
                            yr5Var.N = true;
                            return;
                        }
                        return;
                    default:
                        if (!yr5Var.E && yr5Var.M != null) {
                            yr5Var.E = true;
                            id idVar = new id(3, null, view.getContext());
                            idVar.j0 = false;
                            idVar.q(1000L);
                            jn7.e().a(new ou0(yr5Var, idVar, (byte) 1), 278);
                            ob6.D0().d(yr5Var.M, true, false, yr5Var.c);
                            return;
                        }
                        return;
                }
            }
        });
        zw0 zw0Var = new zw0(context, this.d, 6);
        this.e = zw0Var;
        this.s.addView(zw0Var, tre.d(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setGravity(17);
        this.f.setTextSize(1, 16.0f);
        this.s.addView(this.f, tre.d(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        this.f.setOnClickListener(new View.OnClickListener(this) {
            public final yr5 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                yr5 yr5Var = this.b;
                switch (b) {
                    case 0:
                        if (!yr5Var.E) {
                            yr5Var.E = true;
                            yr5Var.presentFragment(new qh6(), true);
                            yr5Var.N = true;
                            return;
                        }
                        return;
                    default:
                        if (!yr5Var.E && yr5Var.M != null) {
                            yr5Var.E = true;
                            id idVar = new id(3, null, view.getContext());
                            idVar.j0 = false;
                            idVar.q(1000L);
                            jn7.e().a(new ou0(yr5Var, idVar, (byte) 1), 278);
                            ob6.D0().d(yr5Var.M, true, false, yr5Var.c);
                            return;
                        }
                        return;
                }
            }
        });
        this.s.addView(frameLayout, tre.d(64, 64.0f, 53, 0.0f, 4.0f, 4.0f, 0.0f));
        this.fragmentView = scrollView;
        jn7.e().b(this, jn7.B4);
        int i4 = this.c;
        jn7.f(i4).b(this, jn7.J2);
        ConnectionsManager.getInstance(i4).updateDcSettings();
        ob6.D0().V0(i4, true);
        Y();
        this.y = true;
        Z(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != jn7.B4 && i != jn7.J2) {
            return;
        }
        Y();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return zye.a(new u00(this, (byte) 8), aob.d6, aob.q6, aob.P9, aob.Q9, aob.Ji, aob.G6);
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (vm2.h(aob.w0(null, aob.d6, true)) > 0.699999988079071d) {
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
        uc7.e1().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.G = new CharSequence[]{null, ob6.M0(2131747473, null), ob6.M0(2131747471, null), ob6.M0(2131747467, null), ob6.M0(2131747469, null), ob6.M0(2131747465, null)};
        this.H = new String[]{ob6.M0(2131747476, null), ob6.M0(2131747474, null), ob6.M0(2131747472, null), ob6.M0(2131747468, null), ob6.M0(2131747470, null), ob6.M0(2131747466, null)};
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = true;
        hl.r(this.Q);
        jn7.e().n(this, jn7.B4);
        jn7.f(this.c).n(this, jn7.J2);
        uc7.e1().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override
    public final void onPause() {
        super.onPause();
        hl.K3(getParentActivity());
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.y) {
            boolean z = ob6.a0;
            fic ficVar = this.d;
            if (z) {
                ficVar.setCurrentItem(6);
                this.x = 6;
            } else {
                ficVar.setCurrentItem(0);
                this.x = 0;
            }
            this.y = false;
        }
        hl.e2(getParentActivity());
    }

    @Override
    public final void onThemeColorsChanged() {
        zz3 zz3Var = this.Q;
        try {
            if (this.fragmentView != null) {
                int i = aob.Fi;
                int themedColor = getThemedColor(i);
                int themedColor2 = getThemedColor(aob.Gi);
                GradientDrawable gradientDrawable = this.h;
                if (gradientDrawable != null && (themedColor != this.R || themedColor2 != this.S)) {
                    this.R = themedColor;
                    this.S = themedColor2;
                    gradientDrawable.setColors(new int[]{themedColor, themedColor2});
                }
                int p1 = aob.p1(0.9f, getThemedColor(aob.A8));
                Drawable drawable = this.F;
                if (drawable != null && p1 != this.T) {
                    this.T = p1;
                    drawable.setColorFilter(p1, PorterDuff.Mode.MULTIPLY);
                }
                this.fragmentView.setBackgroundColor(aob.w0(null, aob.d6, false));
                TextView textView = this.f;
                if (textView != null) {
                    textView.setTextColor(aob.w0(null, aob.q6, false));
                }
                u8 u8Var = this.n;
                if (u8Var != null) {
                    u8Var.setTextColor(aob.w0(null, aob.Ji, false));
                    aob.F1(this.n.getBackground(), aob.w0(null, aob.Hi, false), true);
                }
                int w0 = aob.w0(null, i, false);
                b29 b29Var = this.w;
                if (b29Var != null && w0 != this.U) {
                    this.U = w0;
                    b29Var.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
                }
                zw0 zw0Var = this.e;
                if (zw0Var != null) {
                    zw0Var.invalidate();
                }
                if (this.d != null) {
                    for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
                        View childAt = this.d.getChildAt(i2);
                        TextView textView2 = (TextView) childAt.findViewWithTag(this.a);
                        if (textView2 != null) {
                            textView2.setTextColor(aob.w0(null, aob.G6, false));
                        }
                        TextView textView3 = (TextView) childAt.findViewWithTag(this.b);
                        if (textView3 != null) {
                            textView3.setTextColor(aob.w0(null, aob.G6, false));
                        }
                    }
                }
                if (this.J != null && this.P != aob.w0(null, aob.d6, false)) {
                    hl.r(zz3Var);
                    hl.d3(zz3Var, 100L);
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
