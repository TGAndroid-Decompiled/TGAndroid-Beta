package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.na;
import c8.sa;
import di.fa;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.xy0;
public class i3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final int[] f3658w0 = {-2781403, -3635939};
    public final q9 E;
    public FrameLayout.LayoutParams F;
    public final ug.b1 G;
    public final ug.b1 H;
    public final TextView I;
    public final TextView J;
    public final g3 K;
    public final o3 L;
    public final TextView M;
    public final TextView N;
    public fa O;
    public boolean P;
    public float Q;
    public xy0 R;
    public xy0 S;
    public final Rect T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int f3659a;
    public final org.telegram.ui.Components.d6 f3660a0;
    public final org.telegram.ui.ActionBar.h6 f3661b;
    public ug.j f3662b0;
    public final tn0 f3663c;
    public TL_stars.StarGift f3664c0;
    public final FrameLayout d;
    public boolean f3665d0;
    public final e3 f3666e;
    public boolean f3667e0;
    public final j3 f3668f;
    public TL_stars.SavedStarGift f3669f0;
    public boolean f3670g0;
    public final org.telegram.ui.Components.b9 h;
    public boolean f3671h0;
    public boolean f3672i0;
    public boolean f3673j0;
    public ug.j f3674k0;
    public TLRPC.Document f3675l0;
    public TL_stars.SavedStarGift m0;
    public final q9 f3676n;
    public op f3677n0;
    public int f3678o0;
    public boolean f3679p0;
    public boolean f3680q0;
    public final FrameLayout.LayoutParams f3681r;
    public int f3682r0;
    public final FrameLayout.LayoutParams f3683s;
    public int[] f3684s0;
    public int f3685t0;
    public boolean f3686u0;
    public boolean f3687v0;
    public final FrameLayout f3688w;
    public final ImageView f3689x;
    public final TextView f3690y;

    public i3(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i10;
        int i11;
        this.Q = -1.0f;
        this.T = new Rect();
        this.f3660a0 = new org.telegram.ui.Components.d6(this, 0L, 320L, nr.h);
        this.f3678o0 = -1;
        this.f3687v0 = org.telegram.ui.ActionBar.m6.I.q();
        this.f3659a = i7;
        this.f3661b = h6Var;
        sa.b(this, 0.04f, 1.5f);
        this.f3663c = new tn0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        e3 e3Var = new e3(frameLayout, h6Var, true);
        this.f3666e = e3Var;
        frameLayout.setBackground(e3Var);
        addView(frameLayout, na.e(-1, -1, 119));
        j3 j3Var = new j3(context);
        this.f3668f = j3Var;
        addView(j3Var, na.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        q9 q9Var = new q9(context);
        this.E = q9Var;
        q9Var.getImageReceiver().W(0);
        FrameLayout.LayoutParams d = na.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.F = d;
        frameLayout.addView(q9Var, d);
        ug.b1 b1Var = new ug.b1(3, context, h6Var);
        this.G = b1Var;
        b1Var.setImageReceiver(q9Var.getImageReceiver());
        frameLayout.addView(b1Var, na.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        ug.b1 b1Var2 = new ug.b1(4, context, h6Var);
        this.H = b1Var2;
        b1Var2.setImageReceiver(q9Var.getImageReceiver());
        frameLayout.addView(b1Var2, na.e(44, 44, 17));
        b1Var2.setAlpha(0.0f);
        b1Var2.setScaleX(0.3f);
        b1Var2.setScaleY(0.3f);
        b1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.I = textView;
        int i12 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i12, h6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, na.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.J = m10;
        org.telegram.ui.ActionBar.t6.U(m10, i12, h6Var);
        m10.setGravity(17);
        m10.setTextSize(1, 12.0f);
        frameLayout.addView(m10, na.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        g3 g3Var = new g3(0, context, this);
        this.K = g3Var;
        TextView textView2 = new TextView(context);
        this.M = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(g3Var, na.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        o3 o3Var = new o3(context, 0);
        this.L = o3Var;
        o3Var.setBackgroundColor(-16776961);
        g3Var.addView(o3Var, na.c(0.0f, 0));
        g3Var.addView(textView2, na.e(-2, 26, 17));
        if (org.telegram.ui.ActionBar.m6.I.q()) {
            i10 = 518759725;
        } else {
            i10 = 1088989954;
        }
        o3Var.setBackground(new n3(i10));
        TextView textView3 = new TextView(context);
        this.N = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        if (org.telegram.ui.ActionBar.m6.I.q()) {
            i11 = -1333971;
        } else {
            i11 = -2722014;
        }
        textView3.setTextColor(i11);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, na.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        q9 q9Var2 = new q9(context);
        this.f3676n = q9Var2;
        q9Var2.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        q9Var2.setVisibility(8);
        FrameLayout.LayoutParams d2 = na.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.f3681r = d2;
        frameLayout.addView(q9Var2, d2);
        this.f3683s = na.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f3688w = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView e10 = o10.e(context, 2131232203);
        e10.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        e10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(e10, na.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, na.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView = new ImageView(context);
        this.f3689x = imageView;
        imageView.setImageResource(2131231955);
        imageView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, na.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.f3690y = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        textView4.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, na.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        j3Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.f3669f0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) starGift;
            }
            return null;
        }
        return null;
    }

    private void setRibbonColorKey(int i7) {
        this.f3668f.setColor(org.telegram.ui.ActionBar.m6.w0(i7, this.f3661b));
        this.f3678o0 = i7;
    }

    public final void a() {
        int i7;
        int i10;
        boolean q10 = org.telegram.ui.ActionBar.m6.I.q();
        this.f3687v0 = q10;
        if (this.f3686u0) {
            i7 = 1090519039;
        } else if (q10) {
            i7 = 518759725;
        } else {
            i7 = 1088989954;
        }
        if (q10) {
            i10 = -1333971;
        } else if (this.f3685t0 == 2) {
            i10 = -4229632;
        } else {
            i10 = -2722014;
        }
        this.L.setBackground(new n3(i7));
        this.M.setTextColor(i10);
        ImageView imageView = this.f3689x;
        imageView.setColorFilter(i10);
        imageView.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(10.0f), i7));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Cj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Dj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.lk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.nk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29347d6));
    }

    public void b(w60 w60Var, Canvas canvas, float f10, float f11, float f12) {
        float f13;
        float f14;
        g3 g3Var;
        float f15;
        ImageView imageView;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        float f16;
        Canvas canvas2 = canvas;
        q9 q9Var = this.f3676n;
        q9 q9Var2 = this.E;
        e3 e3Var = this.f3666e;
        j3 j3Var = this.f3668f;
        Rect rect = this.T;
        FrameLayout frameLayout = this.f3688w;
        ImageView imageView2 = this.f3689x;
        g3 g3Var2 = this.K;
        ug.b1 b1Var = this.G;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f10 / 2.0f, f11 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        if (uniqueStarGift != null) {
            f13 = org.telegram.messenger.g0.L(63.0f) * f12;
        } else {
            f13 = 0.0f;
        }
        e3Var.setBounds(0, 0, (int) f10, (int) f11);
        e3Var.b(canvas2, f12);
        e3Var.getPadding(rect);
        float W1 = org.telegram.messenger.g0.W1(f12, org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(120.0f));
        float f17 = f11 - f13;
        q9Var2.getImageReceiver().y0((f10 - W1) / 2.0f, (f17 - W1) / 2.0f, W1, W1);
        q9Var2.getImageReceiver().h(canvas2, null);
        oh0 B = q9Var2.getImageReceiver().B();
        if (B != null && B.f38188l0) {
            w60Var.invalidate();
        }
        if (b1Var.getVisibility() == 0 && b1Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate((f10 - b1Var.getMeasuredWidth()) / 2.0f, org.telegram.messenger.g0.T1(b1Var.getY(), (f17 - b1Var.getMeasuredHeight()) / 2.0f, f12));
            f14 = 1.0f;
            g3Var = g3Var2;
            f15 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
            canvas2.saveLayerAlpha(0.0f, 0.0f, b1Var.getWidth(), b1Var.getHeight(), (int) (b1Var.getAlpha() * (1.0f - f12) * 255.0f), 31);
            b1Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        } else {
            f14 = 1.0f;
            g3Var = g3Var2;
            f15 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
        }
        if (frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > f15) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(2.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top);
            canvas2.saveLayerAlpha(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), (int) (frameLayout.getAlpha() * 255.0f), 31);
            frameLayout.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (q9Var.getVisibility() == 0 && q9Var.getAlpha() > f15) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(2.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top);
            q9Var.draw(canvas2);
            canvas2.restore();
        }
        if (j3Var.getVisibility() == 0 && j3Var.getAlpha() > f15) {
            canvas2.save();
            canvas2.translate(f10 - org.telegram.messenger.g0.L(f14), org.telegram.messenger.g0.L(2.0f));
            f16 = f14;
            float T1 = org.telegram.messenger.g0.T1(f16, 1.25f, f12);
            canvas2.scale(T1, T1);
            canvas2.translate(-j3Var.getWidth(), f15);
            j3Var.draw(canvas2);
            canvas2.restore();
        } else {
            f16 = f14;
        }
        if (tL_starGiftUnique != null) {
            if (this.R == null) {
                this.R = new xy0(tL_starGiftUnique.title, 20.0f, org.telegram.messenger.g0.o());
            }
            if (this.S == null) {
                this.S = new xy0(hd.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 13.0f, null);
            }
            xy0 xy0Var = this.R;
            xy0Var.f42235p = f10 - org.telegram.messenger.g0.L(8.0f);
            float f18 = f16 - f12;
            xy0Var.c((f10 - this.R.k()) / 2.0f, ((f11 - org.telegram.messenger.g0.L(40.0f)) - (this.R.i() / 2.0f)) + (org.telegram.messenger.g0.L(50.0f) * f18), f12, -1, canvas);
            xy0 xy0Var2 = this.S;
            xy0Var2.f42235p = f10 - org.telegram.messenger.g0.L(8.0f);
            xy0Var2.c((f10 - this.S.k()) / 2.0f, ((f11 - org.telegram.messenger.g0.L(19.0f)) - (this.S.i() / 2.0f)) + (org.telegram.messenger.g0.L(50.0f) * f18), 0.6f * f12, -1, canvas);
            canvas2 = canvas;
        }
        if (g3Var != null && g3Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(g3Var.getX(), g3Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, g3Var.getWidth(), g3Var.getHeight(), (int) (g3Var.getAlpha() * (f16 - f12) * 255.0f), 31);
            g3Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (imageView != null && imageView.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(imageView.getX(), imageView.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight(), (int) (imageView.getAlpha() * (f16 - f12) * 255.0f), 31);
            imageView.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void c(boolean z10, boolean z11) {
        if (this.f3677n0 == null) {
            op opVar = new op(21, getContext(), null);
            this.f3677n0 = opVar;
            opVar.b(-1, org.telegram.ui.ActionBar.m6.f29347d6, org.telegram.ui.ActionBar.m6.f29477k7);
            this.f3677n0.setDrawUnchecked(false);
            this.d.addView(this.f3677n0, na.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.f3676n.setVisibility(8);
        this.f3677n0.a(z10, z11);
    }

    public final void d(boolean z10, boolean z11) {
        int i7;
        float f10;
        TL_stars.SavedStarGift savedStarGift;
        float f11;
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        float f12 = 0.0f;
        boolean z12 = false;
        float f13 = 0.3f;
        FrameLayout frameLayout = this.f3688w;
        if (z11) {
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate = frameLayout.animate();
            if (z10) {
                f12 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.3f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (z10) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).withEndAction(new f3(this, z10, 1)).start();
        } else {
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            frameLayout.setVisibility(i7);
            if (z10) {
                f12 = 1.0f;
            }
            frameLayout.setAlpha(f12);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.3f;
            }
            frameLayout.setScaleX(f10);
            if (z10) {
                f13 = 1.0f;
            }
            frameLayout.setScaleY(f13);
        }
        if (!this.U && this.W && !this.f3672i0 && (savedStarGift = this.f3669f0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z12 = true;
        }
        g(z12, z11);
        l();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        float d = this.f3660a0.d(this.W);
        if (d > 0.0f) {
            this.f3663c.a(canvas, d);
        }
        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(boolean z10, boolean z11) {
        boolean z12;
        TL_stars.SavedStarGift savedStarGift;
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        if (!z11) {
            this.f3660a0.a(z10);
        }
        invalidate();
        if (!this.U && z10 && !this.f3672i0 && (savedStarGift = this.f3669f0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z12 = true;
        } else {
            z12 = false;
        }
        g(z12, z11);
    }

    public final void f(boolean z10, boolean z11) {
        float f10;
        float f11;
        this.f3666e.f(z10, z11);
        float f12 = 0.0f;
        ImageView imageView = this.f3689x;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z10) {
                f11 = org.telegram.messenger.g0.L(6.0f);
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator translationX = animate.translationX(f11);
            if (z10) {
                f12 = org.telegram.messenger.g0.L(6.0f);
            }
            translationX.translationY(f12).setDuration(320L).setInterpolator(nr.h).start();
            return;
        }
        imageView.animate().cancel();
        if (z10) {
            f10 = org.telegram.messenger.g0.L(6.0f);
        } else {
            f10 = 0.0f;
        }
        imageView.setTranslationX(f10);
        if (z10) {
            f12 = org.telegram.messenger.g0.L(6.0f);
        }
        imageView.setTranslationY(f12);
    }

    public final void g(boolean z10, boolean z11) {
        float f10;
        float f11;
        if (this.V == z10) {
            return;
        }
        this.V = z10;
        float f12 = 0.0f;
        int i7 = 0;
        float f13 = 0.3f;
        ug.b1 b1Var = this.H;
        if (z11) {
            b1Var.setVisibility(0);
            ViewPropertyAnimator animate = b1Var.animate();
            if (z10) {
                f12 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.3f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (z10) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).withEndAction(new f3(this, z10, 0)).start();
            return;
        }
        if (!z10) {
            i7 = 8;
        }
        b1Var.setVisibility(i7);
        if (z10) {
            f12 = 1.0f;
        }
        b1Var.setAlpha(f12);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.3f;
        }
        b1Var.setScaleX(f10);
        if (z10) {
            f13 = 1.0f;
        }
        b1Var.setScaleY(f13);
    }

    public TL_stars.StarGift getGift() {
        return this.f3664c0;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.f3664c0;
        if (starGift != null) {
            return starGift.f28627id;
        }
        return 0L;
    }

    public ug.j getPremiumTier() {
        return this.f3662b0;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f3669f0;
    }

    public final void h(org.telegram.tgnet.tl.TL_stars.StarGift r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: bi.i3.h(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final boolean i(org.telegram.tgnet.tl.TL_stars.SavedStarGift r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: bi.i3.i(org.telegram.tgnet.tl.TL_stars$SavedStarGift, boolean, boolean):boolean");
    }

    public final void j(TLRPC.Document document, TLObject tLObject) {
        q9 q9Var = this.E;
        if (document == null) {
            q9Var.b();
            this.f3675l0 = null;
        } else if (this.f3675l0 == document) {
        } else {
            this.f3675l0 = document;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            q9Var.m(gc.b(document), "80_80_nolimit_pcache", gc.c(w10, document), "80_80_nolimit_pcache", org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.m6.f29290a7, 0.3f, null), tLObject);
        }
    }

    public final void k(boolean z10, boolean z11, float f10) {
        TL_stars.TL_starGiftUnique uniqueStarGift;
        String l10;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i7;
        ColorMatrixColorFilter colorMatrixColorFilter;
        boolean z12;
        if (this.Q != f10) {
            this.Q = f10;
            TL_stars.TL_starGiftUnique uniqueStarGift2 = getUniqueStarGift();
            if (uniqueStarGift2 == null) {
                stargiftattributebackdrop = null;
            } else {
                stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) di.y8.l(uniqueStarGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
            }
            if (stargiftattributebackdrop == null) {
                i7 = -11184811;
            } else {
                i7 = stargiftattributebackdrop.pattern_color | (-16777216);
            }
            float f11 = 1.0f - f10;
            if (f10 <= 0.0f) {
                colorMatrixColorFilter = null;
            } else {
                colorMatrixColorFilter = new ColorMatrixColorFilter(new float[]{f11, 0.0f, 0.0f, 0.0f, Color.red(i7) * f10, 0.0f, f11, 0.0f, 0.0f, Color.green(i7) * f10, 0.0f, 0.0f, f11, 0.0f, Color.blue(i7) * f10, 0.0f, 0.0f, 0.0f, 1.0f - (0.5686275f * f10), 0.0f});
            }
            q9 q9Var = this.E;
            q9Var.setColorFilter(colorMatrixColorFilter);
            ImageReceiver imageReceiver = q9Var.getImageReceiver();
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i10 == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            imageReceiver.f22661v0 = z12;
            if (i10 > 0) {
                q9Var.getImageReceiver().Q0();
                oh0 B = q9Var.getImageReceiver().B();
                if (B != null) {
                    B.N(0, false, false);
                }
            }
            q9Var.invalidate();
        }
        if (this.P != z10) {
            this.P = z10;
            if (getUniqueStarGift() != null) {
                if (z10) {
                    l10 = hd.N0(2131742859, null);
                } else {
                    l10 = i5.c.l(uniqueStarGift.num, ',', new StringBuilder("#"));
                }
                j3 j3Var = this.f3668f;
                if (z11) {
                    j3Var.getClass();
                    j3Var.f3716b = l10;
                    j3Var.f3715a.h(10, l10);
                    return;
                }
                j3Var.b(l10, true);
            }
        }
    }

    public final void l() {
        TL_stars.SavedStarGift savedStarGift = this.f3669f0;
        int i7 = this.f3659a;
        j3 j3Var = this.f3668f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                j3Var.setVisibility(0);
                TL_stars.StarGift starGift2 = this.f3669f0.gift;
                if (starGift2.resell_amount != null && (!a5.m(starGift2) || ((org.telegram.messenger.h0) np.u1(i7).A7.f26203p0.f13993b).f24305c)) {
                    int i10 = org.telegram.ui.ActionBar.m6.f29347d6;
                    org.telegram.ui.ActionBar.h6 h6Var = this.f3661b;
                    int w10 = org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), org.telegram.ui.ActionBar.m6.r1(0.04f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var)));
                    setRibbonColorKey(org.telegram.ui.ActionBar.m6.lk);
                    j3Var.setStrokeColor(w10);
                    this.f3679p0 = true;
                    j3Var.setBackdrop(null);
                    j3Var.b(hd.N0(2131750072, null), false);
                    return;
                }
                setRibbonColorKey(org.telegram.ui.ActionBar.m6.Cj);
                j3Var.setStrokeColor(0);
                this.f3679p0 = false;
                j3Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) di.y8.l(this.f3669f0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                j3Var.b(i5.c.l(this.f3669f0.gift.num, ',', new StringBuilder("#")), true);
                return;
            } else if (starGift.limited) {
                j3Var.setVisibility(0);
                setRibbonColorKey(org.telegram.ui.ActionBar.m6.Cj);
                j3Var.setStrokeColor(0);
                this.f3679p0 = false;
                j3Var.setBackdrop(null);
                j3Var.b(hd.a0(null, null, 2131750118, org.telegram.messenger.g0.o0(this.f3669f0.gift.availability_total, 0)), true);
                return;
            } else {
                j3Var.setBackdrop(null);
                j3Var.setVisibility(8);
                return;
            }
        }
        TL_stars.StarGift starGift3 = this.f3664c0;
        if (starGift3 != null) {
            if (!this.f3671h0 && !this.f3673j0) {
                if (this.f3670g0 && starGift3.availability_resale > 0) {
                    j3Var.setVisibility(0);
                    setRibbonColorKey(org.telegram.ui.ActionBar.m6.lk);
                    j3Var.setStrokeColor(0);
                    this.f3679p0 = false;
                    j3Var.setBackdrop(null);
                    j3Var.b(hd.N0(2131750013, null), false);
                    return;
                } else if (this.f3667e0) {
                    j3Var.setVisibility(0);
                    setRibbonColorKey(org.telegram.ui.ActionBar.m6.Cj);
                    j3Var.setStrokeColor(0);
                    this.f3679p0 = false;
                    j3Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) di.y8.l(this.f3664c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    j3Var.b(hd.a0(null, null, 2131750118, org.telegram.messenger.g0.o0(this.f3664c0.availability_issued, 0)), true);
                    return;
                } else {
                    boolean z10 = starGift3.limited;
                    if (z10 && starGift3.availability_remains <= 0) {
                        j3Var.setVisibility(0);
                        setRibbonColorKey(org.telegram.ui.ActionBar.m6.Dj);
                        j3Var.setStrokeColor(0);
                        this.f3679p0 = false;
                        j3Var.setBackdrop(null);
                        j3Var.b(hd.N0(2131749959, null), true);
                        return;
                    } else if (starGift3.auction) {
                        j3Var.setVisibility(0);
                        j3Var.setBackdrop(null);
                        this.f3678o0 = -1;
                        j3Var.a(-2650077, -4227818);
                        j3Var.setStrokeColor(0);
                        this.f3679p0 = false;
                        if (this.f3664c0.auction_start_date > ConnectionsManager.getInstance(i7).getCurrentTime()) {
                            j3Var.b(hd.N0(2131750116, null), true);
                            return;
                        } else {
                            j3Var.b(hd.N0(2131750117, null), true);
                            return;
                        }
                    } else if (starGift3.require_premium) {
                        j3Var.setVisibility(0);
                        j3Var.setBackdrop(null);
                        this.f3678o0 = -1;
                        j3Var.a(-2650077, -4227818);
                        j3Var.setStrokeColor(0);
                        this.f3679p0 = false;
                        j3Var.b(hd.N0(2131750115, null), true);
                        return;
                    } else if (z10) {
                        j3Var.setVisibility(0);
                        setRibbonColorKey(org.telegram.ui.ActionBar.m6.Cj);
                        j3Var.setStrokeColor(0);
                        this.f3679p0 = false;
                        j3Var.setBackdrop(null);
                        j3Var.b(hd.N0(2131750114, null), true);
                        return;
                    } else {
                        j3Var.setBackdrop(null);
                        j3Var.setStrokeColor(0);
                        this.f3679p0 = false;
                        j3Var.setVisibility(8);
                        return;
                    }
                }
            }
            j3Var.setVisibility(0);
            setRibbonColorKey(org.telegram.ui.ActionBar.m6.Cj);
            j3Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) di.y8.l(this.f3664c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            j3Var.setStrokeColor(0);
            this.f3679p0 = false;
            j3Var.b(i5.c.l(this.f3664c0.num, ',', new StringBuilder("#")), true);
            return;
        }
        ug.j jVar = this.f3662b0;
        if (jVar != null) {
            if (jVar.b() > 0) {
                j3Var.setVisibility(0);
                j3Var.setBackdrop(null);
                this.f3678o0 = -1;
                j3Var.a(-2535425, -8229377);
                j3Var.setStrokeColor(0);
                this.f3679p0 = false;
                String a02 = hd.a0(null, null, 2131749491, Integer.valueOf(this.f3662b0.b()));
                j3Var.f3716b = a02;
                j3Var.f3715a.g(12, a02, true);
                return;
            }
            j3Var.setVisibility(8);
            j3Var.setBackdrop(null);
            j3Var.setStrokeColor(0);
            this.f3679p0 = false;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: bi.i3.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public void setImageLayer(int i7) {
        this.E.setLayerNum(i7);
    }

    public void setImageSize(int i7) {
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.width = i7;
        layoutParams.height = i7;
    }

    public void setRibbonColor(int i7) {
        this.f3678o0 = -1;
        j3 j3Var = this.f3668f;
        j3Var.setColor(i7);
        j3Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f3668f.b(str, true);
    }

    public void setRibbonTextOneOf(int i7) {
        j3 j3Var = this.f3668f;
        j3Var.setVisibility(0);
        setRibbonColorKey(org.telegram.ui.ActionBar.m6.Cj);
        j3Var.setStrokeColor(0);
        this.f3679p0 = false;
        j3Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) di.y8.l(this.f3664c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        j3Var.b(hd.a0(null, null, 2131750118, org.telegram.messenger.g0.o0(i7, 0)), true);
    }

    @Override
    public final void updateColors() {
        int w02;
        q9 q9Var;
        int w03;
        int i7;
        try {
            boolean q10 = org.telegram.ui.ActionBar.m6.I.q();
            if (q10 != this.f3687v0) {
                this.f3687v0 = q10;
                if (this.f3685t0 != 0 && this.L != null && this.M != null && this.f3689x != null) {
                    a();
                }
                TextView textView = this.N;
                if (textView != null) {
                    if (q10) {
                        i7 = -1333971;
                    } else {
                        i7 = -2722014;
                    }
                    textView.setTextColor(i7);
                }
            }
            j3 j3Var = this.f3668f;
            org.telegram.ui.ActionBar.h6 h6Var = this.f3661b;
            if (j3Var != null) {
                int i10 = this.f3678o0;
                if (i10 >= 0) {
                    l3 l3Var = j3Var.f3715a;
                    ((Paint) l3Var.f220b).setColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
                    l3Var.invalidateSelf();
                }
                if (this.f3679p0) {
                    j3Var.setStrokeColor(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, h6Var), org.telegram.ui.ActionBar.m6.r1(0.04f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var))));
                }
                j3Var.invalidate();
            }
            if (this.f3680q0 && (q9Var = this.f3676n) != null && (w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.nk, h6Var)) != this.f3682r0) {
                this.f3682r0 = w03;
                q9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            e3 e3Var = this.f3666e;
            if (e3Var != null) {
                int[] iArr = this.f3684s0;
                if (iArr != null && e3Var.f3491m == iArr && (iArr[0] != (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Dj, h6Var)) || iArr[1] != w02)) {
                    iArr[1] = w02;
                    iArr[0] = w02;
                    e3Var.f3492n = null;
                }
                e3Var.invalidateSelf();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
