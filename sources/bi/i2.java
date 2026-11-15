package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ja;
import c8.na;
import di.ba;
import di.gb;
import di.lb;
import di.u8;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.t8;
public class i2 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final int[] f3577w0 = {-2781403, -3635939};
    public final i9 E;
    public FrameLayout.LayoutParams F;
    public final ug.a1 G;
    public final ug.a1 H;
    public final TextView I;
    public final TextView J;
    public final g2 K;
    public final o2 L;
    public final TextView M;
    public final TextView N;
    public ba O;
    public boolean P;
    public float Q;
    public oy0 R;
    public oy0 S;
    public final Rect T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int f3578a;
    public final org.telegram.ui.Components.u5 f3579a0;
    public final org.telegram.ui.ActionBar.e6 f3580b;
    public ug.j f3581b0;
    public final in0 f3582c;
    public TL_stars.StarGift f3583c0;
    public final FrameLayout d;
    public boolean f3584d0;
    public final e2 f3585e;
    public boolean f3586e0;
    public final j2 f3587f;
    public TL_stars.SavedStarGift f3588f0;
    public boolean f3589g0;
    public final t8 h;
    public boolean f3590h0;
    public boolean f3591i0;
    public boolean f3592j0;
    public ug.j f3593k0;
    public TLRPC.Document f3594l0;
    public TL_stars.SavedStarGift m0;
    public final i9 f3595n;
    public fp f3596n0;
    public int f3597o0;
    public boolean f3598p0;
    public boolean f3599q0;
    public final FrameLayout.LayoutParams f3600r;
    public int f3601r0;
    public final FrameLayout.LayoutParams f3602s;
    public int[] f3603s0;
    public int f3604t0;
    public boolean f3605u0;
    public boolean f3606v0;
    public final FrameLayout f3607w;
    public final ImageView f3608x;
    public final TextView f3609y;

    public i2(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        int i11;
        this.Q = -1.0f;
        this.T = new Rect();
        this.f3579a0 = new org.telegram.ui.Components.u5(this, 0L, 320L, er.h);
        this.f3597o0 = -1;
        this.f3606v0 = org.telegram.ui.ActionBar.j6.I.q();
        this.f3578a = i7;
        this.f3580b = e6Var;
        na.b(this, 0.04f, 1.5f);
        this.f3582c = new in0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        e2 e2Var = new e2(frameLayout, e6Var, true);
        this.f3585e = e2Var;
        frameLayout.setBackground(e2Var);
        addView(frameLayout, ja.e(-1, -1, 119));
        j2 j2Var = new j2(context);
        this.f3587f = j2Var;
        addView(j2Var, ja.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        i9 i9Var = new i9(context);
        this.E = i9Var;
        i9Var.getImageReceiver().W(0);
        FrameLayout.LayoutParams d = ja.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.F = d;
        frameLayout.addView(i9Var, d);
        ug.a1 a1Var = new ug.a1(3, context, e6Var);
        this.G = a1Var;
        a1Var.setImageReceiver(i9Var.getImageReceiver());
        frameLayout.addView(a1Var, ja.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        ug.a1 a1Var2 = new ug.a1(4, context, e6Var);
        this.H = a1Var2;
        a1Var2.setImageReceiver(i9Var.getImageReceiver());
        frameLayout.addView(a1Var2, ja.e(44, 44, 17));
        a1Var2.setAlpha(0.0f);
        a1Var2.setScaleX(0.3f);
        a1Var2.setScaleY(0.3f);
        a1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.I = textView;
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i12, e6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView k10 = org.telegram.ui.Cells.y0.k(frameLayout, textView, ja.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.J = k10;
        org.telegram.ui.ActionBar.q6.U(k10, i12, e6Var);
        k10.setGravity(17);
        k10.setTextSize(1, 12.0f);
        frameLayout.addView(k10, ja.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        g2 g2Var = new g2(0, context, this);
        this.K = g2Var;
        TextView textView2 = new TextView(context);
        this.M = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(g2Var, ja.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        o2 o2Var = new o2(context, 0);
        this.L = o2Var;
        o2Var.setBackgroundColor(-16776961);
        g2Var.addView(o2Var, ja.c(0.0f, 0));
        g2Var.addView(textView2, ja.e(-2, 26, 17));
        if (org.telegram.ui.ActionBar.j6.I.q()) {
            i10 = 518759725;
        } else {
            i10 = 1088989954;
        }
        o2Var.setBackground(new n2(i10));
        TextView textView3 = new TextView(context);
        this.N = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        if (org.telegram.ui.ActionBar.j6.I.q()) {
            i11 = -1333971;
        } else {
            i11 = -2722014;
        }
        textView3.setTextColor(i11);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, ja.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new t8((org.telegram.ui.ActionBar.e6) null);
        i9 i9Var2 = new i9(context);
        this.f3595n = i9Var2;
        i9Var2.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        i9Var2.setVisibility(8);
        FrameLayout.LayoutParams d2 = ja.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.f3600r = d2;
        frameLayout.addView(i9Var2, d2);
        this.f3602s = ja.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f3607w = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView e10 = i20.e(context, 2131232202);
        e10.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        e10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(e10, ja.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, ja.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView = new ImageView(context);
        this.f3608x = imageView;
        imageView.setImageResource(2131231954);
        imageView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, ja.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.f3609y = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        textView4.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, ja.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        j2Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.f3588f0;
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
        this.f3587f.setColor(org.telegram.ui.ActionBar.j6.w0(i7, this.f3580b));
        this.f3597o0 = i7;
    }

    public final void a() {
        int i7;
        int i10;
        boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
        this.f3606v0 = q10;
        if (this.f3605u0) {
            i7 = 1090519039;
        } else if (q10) {
            i7 = 518759725;
        } else {
            i7 = 1088989954;
        }
        if (q10) {
            i10 = -1333971;
        } else if (this.f3604t0 == 2) {
            i10 = -4229632;
        } else {
            i10 = -2722014;
        }
        this.L.setBackground(new n2(i7));
        this.M.setTextColor(i10);
        ImageView imageView = this.f3608x;
        imageView.setColorFilter(i10);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(10.0f), i7));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Cj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Dj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.lk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.nk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
    }

    public void b(k60 k60Var, Canvas canvas, float f10, float f11, float f12) {
        float f13;
        float f14;
        g2 g2Var;
        float f15;
        ImageView imageView;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        float f16;
        Canvas canvas2 = canvas;
        i9 i9Var = this.f3595n;
        i9 i9Var2 = this.E;
        e2 e2Var = this.f3585e;
        j2 j2Var = this.f3587f;
        Rect rect = this.T;
        FrameLayout frameLayout = this.f3607w;
        ImageView imageView2 = this.f3608x;
        g2 g2Var2 = this.K;
        ug.a1 a1Var = this.G;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f10 / 2.0f, f11 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        if (uniqueStarGift != null) {
            f13 = org.telegram.messenger.g0.L(63.0f) * f12;
        } else {
            f13 = 0.0f;
        }
        e2Var.setBounds(0, 0, (int) f10, (int) f11);
        e2Var.b(canvas2, f12);
        e2Var.getPadding(rect);
        float W1 = org.telegram.messenger.g0.W1(f12, org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(120.0f));
        float f17 = f11 - f13;
        i9Var2.getImageReceiver().y0((f10 - W1) / 2.0f, (f17 - W1) / 2.0f, W1, W1);
        i9Var2.getImageReceiver().h(canvas2, null);
        ch0 B = i9Var2.getImageReceiver().B();
        if (B != null && B.f33588l0) {
            k60Var.invalidate();
        }
        if (a1Var.getVisibility() == 0 && a1Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate((f10 - a1Var.getMeasuredWidth()) / 2.0f, org.telegram.messenger.g0.T1(a1Var.getY(), (f17 - a1Var.getMeasuredHeight()) / 2.0f, f12));
            f14 = 1.0f;
            g2Var = g2Var2;
            f15 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
            canvas2.saveLayerAlpha(0.0f, 0.0f, a1Var.getWidth(), a1Var.getHeight(), (int) (a1Var.getAlpha() * (1.0f - f12) * 255.0f), 31);
            a1Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        } else {
            f14 = 1.0f;
            g2Var = g2Var2;
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
        if (i9Var.getVisibility() == 0 && i9Var.getAlpha() > f15) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(2.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top);
            i9Var.draw(canvas2);
            canvas2.restore();
        }
        if (j2Var.getVisibility() == 0 && j2Var.getAlpha() > f15) {
            canvas2.save();
            canvas2.translate(f10 - org.telegram.messenger.g0.L(f14), org.telegram.messenger.g0.L(2.0f));
            f16 = f14;
            float T1 = org.telegram.messenger.g0.T1(f16, 1.25f, f12);
            canvas2.scale(T1, T1);
            canvas2.translate(-j2Var.getWidth(), f15);
            j2Var.draw(canvas2);
            canvas2.restore();
        } else {
            f16 = f14;
        }
        if (tL_starGiftUnique != null) {
            if (this.R == null) {
                this.R = new oy0(tL_starGiftUnique.title, 20.0f, org.telegram.messenger.g0.o());
            }
            if (this.S == null) {
                this.S = new oy0(hd.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 13.0f, null);
            }
            oy0 oy0Var = this.R;
            oy0Var.f38114p = f10 - org.telegram.messenger.g0.L(8.0f);
            float f18 = f16 - f12;
            oy0Var.c((f10 - this.R.k()) / 2.0f, ((f11 - org.telegram.messenger.g0.L(40.0f)) - (this.R.i() / 2.0f)) + (org.telegram.messenger.g0.L(50.0f) * f18), f12, -1, canvas);
            oy0 oy0Var2 = this.S;
            oy0Var2.f38114p = f10 - org.telegram.messenger.g0.L(8.0f);
            oy0Var2.c((f10 - this.S.k()) / 2.0f, ((f11 - org.telegram.messenger.g0.L(19.0f)) - (this.S.i() / 2.0f)) + (org.telegram.messenger.g0.L(50.0f) * f18), 0.6f * f12, -1, canvas);
            canvas2 = canvas;
        }
        if (g2Var != null && g2Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(g2Var.getX(), g2Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, g2Var.getWidth(), g2Var.getHeight(), (int) (g2Var.getAlpha() * (f16 - f12) * 255.0f), 31);
            g2Var.draw(canvas2);
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
        if (this.f3596n0 == null) {
            fp fpVar = new fp(21, getContext(), null);
            this.f3596n0 = fpVar;
            fpVar.b(-1, org.telegram.ui.ActionBar.j6.f28849d6, org.telegram.ui.ActionBar.j6.f28979k7);
            this.f3596n0.setDrawUnchecked(false);
            this.d.addView(this.f3596n0, ja.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.f3595n.setVisibility(8);
        this.f3596n0.a(z10, z11);
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
        FrameLayout frameLayout = this.f3607w;
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
            scaleX.scaleY(f13).withEndAction(new f2(this, z10, 1)).start();
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
        if (!this.U && this.W && !this.f3591i0 && (savedStarGift = this.f3588f0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z12 = true;
        }
        g(z12, z11);
        l();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        float d = this.f3579a0.d(this.W);
        if (d > 0.0f) {
            this.f3582c.a(canvas, d);
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
            this.f3579a0.a(z10);
        }
        invalidate();
        if (!this.U && z10 && !this.f3591i0 && (savedStarGift = this.f3588f0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z12 = true;
        } else {
            z12 = false;
        }
        g(z12, z11);
    }

    public final void f(boolean z10, boolean z11) {
        float f10;
        float f11;
        this.f3585e.f(z10, z11);
        float f12 = 0.0f;
        ImageView imageView = this.f3608x;
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
            translationX.translationY(f12).setDuration(320L).setInterpolator(er.h).start();
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
        ug.a1 a1Var = this.H;
        if (z11) {
            a1Var.setVisibility(0);
            ViewPropertyAnimator animate = a1Var.animate();
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
            scaleX.scaleY(f13).withEndAction(new f2(this, z10, 0)).start();
            return;
        }
        if (!z10) {
            i7 = 8;
        }
        a1Var.setVisibility(i7);
        if (z10) {
            f12 = 1.0f;
        }
        a1Var.setAlpha(f12);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.3f;
        }
        a1Var.setScaleX(f10);
        if (z10) {
            f13 = 1.0f;
        }
        a1Var.setScaleY(f13);
    }

    public TL_stars.StarGift getGift() {
        return this.f3583c0;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.f3583c0;
        if (starGift != null) {
            return starGift.f28280id;
        }
        return 0L;
    }

    public ug.j getPremiumTier() {
        return this.f3581b0;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f3588f0;
    }

    public final void h(org.telegram.tgnet.tl.TL_stars.StarGift r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: bi.i2.h(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final boolean i(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        Integer num;
        Integer num2;
        int i7;
        float f10;
        float f11;
        int i10;
        long j3;
        boolean z12;
        o2 o2Var;
        boolean z13;
        boolean z14;
        boolean z15;
        float f12;
        float f13;
        ba baVar = this.O;
        if (baVar != null) {
            baVar.run();
            this.O = null;
        }
        j(savedStarGift.gift.getDocument(), savedStarGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u8.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        e2 e2Var = this.f3585e;
        e2Var.d(stargiftattributebackdrop);
        e2Var.e((TL_stars.starGiftAttributePattern) u8.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        e2Var.g(null);
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        i9 i9Var = this.E;
        i9Var.setTranslationY(0.0f);
        ug.a1 a1Var = this.G;
        a1Var.I = true;
        a1Var.J = false;
        a1Var.invalidate();
        if (stargiftattributebackdrop != null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.j6.r1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num = null;
        }
        a1Var.setBlendWithColor(num);
        ug.a1 a1Var2 = this.H;
        a1Var2.I = true;
        a1Var2.J = false;
        a1Var2.invalidate();
        if (stargiftattributebackdrop != null) {
            num2 = Integer.valueOf(org.telegram.ui.ActionBar.j6.r1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num2 = null;
        }
        a1Var2.setBlendWithColor(num2);
        if (savedStarGift.gift.resale_ton_only) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        ImageView imageView = this.f3608x;
        imageView.setVisibility(i7);
        FrameLayout frameLayout = this.f3607w;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.j6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            int L = org.telegram.messenger.g0.L(20.0f);
            int i11 = org.telegram.ui.ActionBar.j6.Fi;
            org.telegram.ui.ActionBar.e6 e6Var = this.f3580b;
            org.telegram.ui.ActionBar.q6.B(frameLayout, org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.w0(i11, e6Var)), org.telegram.ui.ActionBar.q6.M(i11), e6Var);
        }
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.gravity = 17;
        i9Var.setLayoutParams(layoutParams);
        float f14 = 0.4f;
        if (this.m0 == savedStarGift) {
            a1Var.setVisibility(0);
            ViewPropertyAnimator animate = a1Var.animate();
            if (savedStarGift.unsaved) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (savedStarGift.unsaved) {
                f13 = 1.0f;
            } else {
                f13 = 0.4f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f13);
            if (savedStarGift.unsaved) {
                f14 = 1.0f;
            }
            scaleX.scaleY(f14).setDuration(350L).setInterpolator(er.h).withEndAction(new a1.e(26, this, savedStarGift)).start();
        } else {
            if (savedStarGift.unsaved) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            a1Var.setAlpha(f10);
            if (savedStarGift.unsaved) {
                f11 = 1.0f;
            } else {
                f11 = 0.4f;
            }
            a1Var.setScaleX(f11);
            if (savedStarGift.unsaved) {
                f14 = 1.0f;
            }
            a1Var.setScaleY(f14);
            if (savedStarGift.unsaved) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            a1Var.setVisibility(i10);
        }
        boolean z16 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        i9 i9Var2 = this.f3595n;
        i9Var2.setColorFilter(null);
        this.f3599q0 = false;
        i9Var2.setLayoutParams(this.f3600r);
        int i12 = this.f3578a;
        if (z16 && savedStarGift.name_hidden) {
            i9Var2.setVisibility(8);
            j3 = 0;
        } else if (savedStarGift.name_hidden) {
            i9Var2.setVisibility(0);
            fq a10 = gb.a(44, "anonymous");
            j3 = 0;
            int L2 = org.telegram.messenger.g0.L(16.0f);
            int L3 = org.telegram.messenger.g0.L(16.0f);
            a10.f34676e = L2;
            a10.f34677f = L3;
            i9Var2.setImageDrawable(a10);
        } else {
            j3 = 0;
            long o4 = org.telegram.messenger.m5.o(savedStarGift.from_id);
            int i13 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
            t8 t8Var = this.h;
            if (i13 > 0) {
                TLRPC.User a22 = np.s1(i12).a2(Long.valueOf(o4));
                if (a22 != null) {
                    i9Var2.setVisibility(0);
                    t8Var.r(a22);
                    i9Var2.f(a22, t8Var);
                } else {
                    i9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat M0 = np.s1(i12).M0(Long.valueOf(-o4));
                if (M0 != null) {
                    i9Var2.setVisibility(0);
                    t8Var.q(M0);
                    i9Var2.f(M0, t8Var);
                } else {
                    i9Var2.setVisibility(8);
                }
            }
        }
        o2 o2Var2 = this.L;
        g2 g2Var = this.K;
        TextView textView = this.M;
        if (stargiftattributebackdrop != null && savedStarGift.gift.resell_amount != null) {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams2 = this.F;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            eq[] eqVarArr = new eq[1];
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift.resale_ton_only && org.telegram.messenger.m5.o(starGift.owner_id) == m10.i(i12).e()) {
                z15 = true;
                textView.setText(lb.s1(lb.X0(true, "XTR " + ((Object) lb.M0(savedStarGift.gift.getResellAmount(cg.b.f4991b).o(), 1.0f, ',')), 0.95f, eqVarArr, 0.0f, 1.0f), true));
            } else {
                z15 = true;
                textView.setText(lb.U0("XTR " + hd.E(savedStarGift.gift.getResellStars(), ','), 0.95f, eqVarArr));
            }
            eq eqVar = eqVarArr[0];
            if (eqVar != null) {
                eqVar.f34414r = 0.0f;
                eqVar.f34415s = org.telegram.messenger.g0.L(0.5f);
            }
            int w10 = org.telegram.ui.ActionBar.j6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.j6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            this.f3604t0 = 0;
            o2Var2.setBackground(new n2(1895825407, w10));
            textView.setTextColor(-1);
            imageView.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(10.0f), w10));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) g2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) g2Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(79.0f);
            z12 = z15;
        } else {
            if (z10) {
                textView.setVisibility(8);
                this.F.topMargin = org.telegram.messenger.g0.L(12.0f);
                this.F.bottomMargin = org.telegram.messenger.g0.L(12.0f);
            } else {
                textView.setVisibility(0);
                FrameLayout.LayoutParams layoutParams3 = this.F;
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
            }
            if (z16) {
                textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                i5.c.w(textView, 1, 12.0f, null, 2131750059);
                z12 = true;
                o2Var = o2Var2;
            } else {
                textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setTextSize(1, 12.0f);
                StringBuilder sb2 = new StringBuilder("XTR ");
                TL_stars.StarGift starGift2 = savedStarGift.gift;
                long j10 = starGift2.stars;
                z12 = true;
                o2Var = o2Var2;
                long j11 = savedStarGift.convert_stars;
                if (j11 <= j3) {
                    j11 = starGift2.convert_stars;
                }
                textView.setText(lb.a1(false, i5.c.l(Math.max(j10, j11), ',', sb2), 0.66f, null));
            }
            if (z16) {
                this.f3604t0 = 0;
                textView.setTextColor(-1);
                o2Var.setBackground(new n2(1090519039));
                imageView.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(10.0f), 1090519039));
                imageView.setColorFilter(-1);
            } else {
                this.f3604t0 = 2;
                this.f3605u0 = false;
                a();
            }
            ((FrameLayout.LayoutParams) g2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) g2Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(103.0f);
        }
        this.N.setVisibility(8);
        this.m0 = savedStarGift;
        this.f3593k0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.f3588f0;
        this.f3581b0 = null;
        this.f3583c0 = null;
        this.f3586e0 = false;
        this.f3588f0 = savedStarGift;
        this.f3589g0 = false;
        this.f3590h0 = false;
        this.f3591i0 = z11;
        this.R = null;
        this.S = null;
        if (savedStarGift.pinned_to_top && (!z16 || savedStarGift.name_hidden)) {
            z13 = z12;
        } else {
            z13 = false;
        }
        if (savedStarGift2 == savedStarGift) {
            z14 = z12;
        } else {
            z14 = false;
        }
        d(z13, z14);
        l();
        if (savedStarGift2 != savedStarGift) {
            return false;
        }
        return z12;
    }

    public final void j(TLRPC.Document document, TLObject tLObject) {
        i9 i9Var = this.E;
        if (document == null) {
            i9Var.b();
            this.f3594l0 = null;
        } else if (this.f3594l0 == document) {
        } else {
            this.f3594l0 = document;
            TLRPC.PhotoSize w10 = w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            i9Var.m(gc.b(document), "80_80_nolimit_pcache", gc.c(w10, document), "80_80_nolimit_pcache", org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.j6.f28792a7, 0.3f, null), tLObject);
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
                stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u8.l(uniqueStarGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
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
            i9 i9Var = this.E;
            i9Var.setColorFilter(colorMatrixColorFilter);
            ImageReceiver imageReceiver = i9Var.getImageReceiver();
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i10 == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            imageReceiver.f22303v0 = z12;
            if (i10 > 0) {
                i9Var.getImageReceiver().Q0();
                ch0 B = i9Var.getImageReceiver().B();
                if (B != null) {
                    B.N(0, false, false);
                }
            }
            i9Var.invalidate();
        }
        if (this.P != z10) {
            this.P = z10;
            if (getUniqueStarGift() != null) {
                if (z10) {
                    l10 = hd.M0(2131743104, null);
                } else {
                    l10 = i5.c.l(uniqueStarGift.num, ',', new StringBuilder("#"));
                }
                j2 j2Var = this.f3587f;
                if (z11) {
                    j2Var.getClass();
                    j2Var.f3628b = l10;
                    j2Var.f3627a.g(10, l10);
                    return;
                }
                j2Var.b(l10, true);
            }
        }
    }

    public final void l() {
        TL_stars.SavedStarGift savedStarGift = this.f3588f0;
        j2 j2Var = this.f3587f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                j2Var.setVisibility(0);
                if (this.f3588f0.gift.resell_amount != null) {
                    int i7 = org.telegram.ui.ActionBar.j6.f28849d6;
                    org.telegram.ui.ActionBar.e6 e6Var = this.f3580b;
                    int w10 = org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(i7, e6Var), org.telegram.ui.ActionBar.j6.r1(0.04f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var)));
                    setRibbonColorKey(org.telegram.ui.ActionBar.j6.lk);
                    j2Var.setStrokeColor(w10);
                    this.f3598p0 = true;
                    j2Var.setBackdrop(null);
                    j2Var.b(hd.M0(2131750089, null), false);
                    return;
                }
                setRibbonColorKey(org.telegram.ui.ActionBar.j6.Cj);
                j2Var.setStrokeColor(0);
                this.f3598p0 = false;
                j2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) u8.l(this.f3588f0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                j2Var.b(i5.c.l(this.f3588f0.gift.num, ',', new StringBuilder("#")), true);
                return;
            } else if (starGift.limited) {
                j2Var.setVisibility(0);
                setRibbonColorKey(org.telegram.ui.ActionBar.j6.Cj);
                j2Var.setStrokeColor(0);
                this.f3598p0 = false;
                j2Var.setBackdrop(null);
                j2Var.b(hd.a0(null, null, 2131750135, org.telegram.messenger.g0.o0(this.f3588f0.gift.availability_total, 0)), true);
                return;
            } else {
                j2Var.setBackdrop(null);
                j2Var.setVisibility(8);
                return;
            }
        }
        TL_stars.StarGift starGift2 = this.f3583c0;
        if (starGift2 != null) {
            if (!this.f3590h0 && !this.f3592j0) {
                if (this.f3589g0 && starGift2.availability_resale > 0) {
                    j2Var.setVisibility(0);
                    setRibbonColorKey(org.telegram.ui.ActionBar.j6.lk);
                    j2Var.setStrokeColor(0);
                    this.f3598p0 = false;
                    j2Var.setBackdrop(null);
                    j2Var.b(hd.M0(2131750030, null), false);
                    return;
                } else if (this.f3586e0) {
                    j2Var.setVisibility(0);
                    setRibbonColorKey(org.telegram.ui.ActionBar.j6.Cj);
                    j2Var.setStrokeColor(0);
                    this.f3598p0 = false;
                    j2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) u8.l(this.f3583c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    j2Var.b(hd.a0(null, null, 2131750135, org.telegram.messenger.g0.o0(this.f3583c0.availability_issued, 0)), true);
                    return;
                } else {
                    boolean z10 = starGift2.limited;
                    if (z10 && starGift2.availability_remains <= 0) {
                        j2Var.setVisibility(0);
                        setRibbonColorKey(org.telegram.ui.ActionBar.j6.Dj);
                        j2Var.setStrokeColor(0);
                        this.f3598p0 = false;
                        j2Var.setBackdrop(null);
                        j2Var.b(hd.M0(2131749976, null), true);
                        return;
                    } else if (starGift2.auction) {
                        j2Var.setVisibility(0);
                        j2Var.setBackdrop(null);
                        this.f3597o0 = -1;
                        j2Var.a(-2650077, -4227818);
                        j2Var.setStrokeColor(0);
                        this.f3598p0 = false;
                        if (this.f3583c0.auction_start_date > ConnectionsManager.getInstance(this.f3578a).getCurrentTime()) {
                            j2Var.b(hd.M0(2131750133, null), true);
                            return;
                        } else {
                            j2Var.b(hd.M0(2131750134, null), true);
                            return;
                        }
                    } else if (starGift2.require_premium) {
                        j2Var.setVisibility(0);
                        j2Var.setBackdrop(null);
                        this.f3597o0 = -1;
                        j2Var.a(-2650077, -4227818);
                        j2Var.setStrokeColor(0);
                        this.f3598p0 = false;
                        j2Var.b(hd.M0(2131750132, null), true);
                        return;
                    } else if (z10) {
                        j2Var.setVisibility(0);
                        setRibbonColorKey(org.telegram.ui.ActionBar.j6.Cj);
                        j2Var.setStrokeColor(0);
                        this.f3598p0 = false;
                        j2Var.setBackdrop(null);
                        j2Var.b(hd.M0(2131750131, null), true);
                        return;
                    } else {
                        j2Var.setBackdrop(null);
                        j2Var.setStrokeColor(0);
                        this.f3598p0 = false;
                        j2Var.setVisibility(8);
                        return;
                    }
                }
            }
            j2Var.setVisibility(0);
            setRibbonColorKey(org.telegram.ui.ActionBar.j6.Cj);
            j2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) u8.l(this.f3583c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            j2Var.setStrokeColor(0);
            this.f3598p0 = false;
            j2Var.b(i5.c.l(this.f3583c0.num, ',', new StringBuilder("#")), true);
            return;
        }
        ug.j jVar = this.f3581b0;
        if (jVar != null) {
            if (jVar.b() > 0) {
                j2Var.setVisibility(0);
                j2Var.setBackdrop(null);
                this.f3597o0 = -1;
                j2Var.a(-2535425, -8229377);
                j2Var.setStrokeColor(0);
                this.f3598p0 = false;
                String a02 = hd.a0(null, null, 2131749664, Integer.valueOf(this.f3581b0.b()));
                j2Var.f3628b = a02;
                j2Var.f3627a.f(12, a02, true);
                return;
            }
            j2Var.setVisibility(8);
            j2Var.setBackdrop(null);
            j2Var.setStrokeColor(0);
            this.f3598p0 = false;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: bi.i2.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
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
        this.f3597o0 = -1;
        j2 j2Var = this.f3587f;
        j2Var.setColor(i7);
        j2Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f3587f.b(str, true);
    }

    public void setRibbonTextOneOf(int i7) {
        j2 j2Var = this.f3587f;
        j2Var.setVisibility(0);
        setRibbonColorKey(org.telegram.ui.ActionBar.j6.Cj);
        j2Var.setStrokeColor(0);
        this.f3598p0 = false;
        j2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) u8.l(this.f3583c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        j2Var.b(hd.a0(null, null, 2131750135, org.telegram.messenger.g0.o0(i7, 0)), true);
    }

    @Override
    public final void updateColors() {
        int w02;
        i9 i9Var;
        int w03;
        int i7;
        try {
            boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
            if (q10 != this.f3606v0) {
                this.f3606v0 = q10;
                if (this.f3604t0 != 0 && this.L != null && this.M != null && this.f3608x != null) {
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
            j2 j2Var = this.f3587f;
            org.telegram.ui.ActionBar.e6 e6Var = this.f3580b;
            if (j2Var != null) {
                int i10 = this.f3597o0;
                if (i10 >= 0) {
                    l2 l2Var = j2Var.f3627a;
                    ((Paint) l2Var.f220b).setColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
                    l2Var.invalidateSelf();
                }
                if (this.f3598p0) {
                    j2Var.setStrokeColor(org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, e6Var), org.telegram.ui.ActionBar.j6.r1(0.04f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var))));
                }
                j2Var.invalidate();
            }
            if (this.f3599q0 && (i9Var = this.f3595n) != null && (w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.nk, e6Var)) != this.f3601r0) {
                this.f3601r0 = w03;
                i9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            e2 e2Var = this.f3585e;
            if (e2Var != null) {
                int[] iArr = this.f3603s0;
                if (iArr != null && e2Var.f3466m == iArr && (iArr[0] != (w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Dj, e6Var)) || iArr[1] != w02)) {
                    iArr[1] = w02;
                    iArr[0] = w02;
                    e2Var.f3467n = null;
                }
                e2Var.invalidateSelf();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
