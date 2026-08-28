package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import gh.ja;
import gh.o8;
import gh.oa;
import gh.v7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.z8;
public class f2 extends FrameLayout {
    public static final int[] f6438h0 = {-2781403, -3635939};
    public FrameLayout.LayoutParams A;
    public final zf.b1 B;
    public final zf.b1 C;
    public final TextView D;
    public final TextView E;
    public final d2 F;
    public final l2 G;
    public final TextView H;
    public final TextView I;
    public o8 J;
    public nz0 K;
    public nz0 L;
    public final Rect M;
    public boolean N;
    public boolean O;
    public boolean P;
    public final org.telegram.ui.Components.y5 Q;
    public zf.k R;
    public TL_stars.StarGift S;
    public boolean T;
    public boolean U;
    public TL_stars.SavedStarGift V;
    public boolean W;
    public final int f6439a;
    public boolean f6440a0;
    public final org.telegram.ui.ActionBar.b6 f6441b;
    public boolean f6442b0;
    public final ho0 f6443c;
    public boolean f6444c0;
    public final FrameLayout d;
    public zf.k f6445d0;
    public final b2 f6446e;
    public TLRPC.Document f6447e0;
    public final g2 f6448f;
    public TL_stars.SavedStarGift f6449f0;
    public dp f6450g0;
    public final z8 h;
    public final o9 f6451n;
    public final FrameLayout.LayoutParams f6452r;
    public final FrameLayout.LayoutParams f6453s;
    public final FrameLayout v;
    public final ImageView f6454w;
    public final TextView f6455x;
    public final o9 f6456y;

    public f2(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i10;
        int i11;
        this.M = new Rect();
        this.Q = new org.telegram.ui.Components.y5(this, 0L, 320L, gr.h);
        this.f6439a = i9;
        this.f6441b = b6Var;
        g7.g6.b(this, 0.04f, 1.5f);
        this.f6443c = new ho0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        b2 b2Var = new b2(frameLayout, b6Var, true);
        this.f6446e = b2Var;
        frameLayout.setBackground(b2Var);
        addView(frameLayout, g7.e6.e(-1, -1, 119));
        g2 g2Var = new g2(context);
        this.f6448f = g2Var;
        addView(g2Var, g7.e6.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        o9 o9Var = new o9(context);
        this.f6456y = o9Var;
        o9Var.getImageReceiver().setAutoRepeat(0);
        FrameLayout.LayoutParams d = g7.e6.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.A = d;
        frameLayout.addView(o9Var, d);
        zf.b1 b1Var = new zf.b1(context, 3, b6Var);
        this.B = b1Var;
        b1Var.setImageReceiver(o9Var.getImageReceiver());
        frameLayout.addView(b1Var, g7.e6.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        zf.b1 b1Var2 = new zf.b1(context, 4, b6Var);
        this.C = b1Var2;
        b1Var2.setImageReceiver(o9Var.getImageReceiver());
        frameLayout.addView(b1Var2, g7.e6.e(44, 44, 17));
        b1Var2.setAlpha(0.0f);
        b1Var2.setScaleX(0.3f);
        b1Var2.setScaleY(0.3f);
        b1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.D = textView;
        int i12 = org.telegram.ui.ActionBar.f6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        textView.setGravity(17);
        j3.r0.u(14.0f, 1, textView);
        TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout, textView, g7.e6.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.E = g10;
        g10.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        g10.setGravity(17);
        g10.setTextSize(1, 12.0f);
        frameLayout.addView(g10, g7.e6.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        d2 d2Var = new d2(this, context, 0);
        this.F = d2Var;
        TextView textView2 = new TextView(context);
        this.H = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(d2Var, g7.e6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        l2 l2Var = new l2(context, 0);
        this.G = l2Var;
        l2Var.setBackgroundColor(-16776961);
        d2Var.addView(l2Var, g7.e6.c(0.0f, 0));
        d2Var.addView(textView2, g7.e6.e(-2, 26, 17));
        if (org.telegram.ui.ActionBar.f6.I.q()) {
            i10 = 518759725;
        } else {
            i10 = 1088989954;
        }
        l2Var.setBackground(new k2(i10));
        TextView textView3 = new TextView(context);
        this.I = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        if (org.telegram.ui.ActionBar.f6.I.q()) {
            i11 = -1333971;
        } else {
            i11 = -2722014;
        }
        textView3.setTextColor(i11);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, g7.e6.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new z8((org.telegram.ui.ActionBar.b6) null);
        o9 o9Var2 = new o9(context);
        this.f6451n = o9Var2;
        o9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        o9Var2.setVisibility(8);
        FrameLayout.LayoutParams d9 = g7.e6.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.f6452r = d9;
        frameLayout.addView(o9Var2, d9);
        this.f6453s = g7.e6.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.v = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_limit_pin);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(imageView, g7.e6.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, g7.e6.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView2 = new ImageView(context);
        this.f6454w = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_14);
        imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        imageView2.setVisibility(8);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView2, g7.e6.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.f6455x = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, g7.e6.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        g2Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.V;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) starGift;
            }
            return null;
        }
        return null;
    }

    public final void a(v60 v60Var, Canvas canvas, float f10, float f11, float f12) {
        float f13;
        Rect rect;
        float f14;
        float f15;
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f10 / 2.0f, f11 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        if (uniqueStarGift != null) {
            f13 = AndroidUtilities.dp(63.0f) * f12;
        } else {
            f13 = 0.0f;
        }
        b2 b2Var = this.f6446e;
        b2Var.setBounds(0, 0, (int) f10, (int) f11);
        b2Var.b(canvas2, f12);
        b2Var.getPadding(this.M);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(120.0f), f12);
        o9 o9Var = this.f6456y;
        float f16 = f11 - f13;
        o9Var.getImageReceiver().setImageCoords((f10 - lerp) / 2.0f, (f16 - lerp) / 2.0f, lerp, lerp);
        o9Var.getImageReceiver().draw(canvas2);
        if (o9Var.getImageReceiver().isLottieRunning()) {
            v60Var.invalidate();
        }
        zf.b1 b1Var = this.B;
        if (b1Var.getVisibility() == 0 && b1Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate((f10 - b1Var.getMeasuredWidth()) / 2.0f, AndroidUtilities.lerp(b1Var.getY(), (f16 - b1Var.getMeasuredHeight()) / 2.0f, f12));
            f14 = 1.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, b1Var.getWidth(), b1Var.getHeight(), (int) (b1Var.getAlpha() * (1.0f - f12) * 255.0f), 31);
            b1Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        } else {
            f14 = 1.0f;
        }
        FrameLayout frameLayout = this.v;
        if (frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top);
            canvas2.saveLayerAlpha(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), (int) (frameLayout.getAlpha() * 255.0f), 31);
            frameLayout.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        o9 o9Var2 = this.f6451n;
        if (o9Var2.getVisibility() == 0 && o9Var2.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top);
            o9Var2.draw(canvas2);
            canvas2.restore();
        }
        g2 g2Var = this.f6448f;
        if (g2Var.getVisibility() == 0 && g2Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(f10 - AndroidUtilities.dp(f14), AndroidUtilities.dp(2.0f));
            f15 = 1.0f;
            float lerp2 = AndroidUtilities.lerp(1.0f, 1.25f, f12);
            canvas2.scale(lerp2, lerp2);
            canvas2.translate(-g2Var.getWidth(), 0.0f);
            g2Var.draw(canvas2);
            canvas2.restore();
        } else {
            f15 = 1.0f;
        }
        if (uniqueStarGift != null) {
            if (this.K == null) {
                this.K = new nz0(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
            }
            if (this.L == null) {
                this.L = new nz0(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f, null);
            }
            nz0 nz0Var = this.K;
            nz0Var.f31234p = f10 - AndroidUtilities.dp(8.0f);
            float f17 = f15 - f12;
            nz0Var.c((f10 - this.K.l()) / 2.0f, ((f11 - AndroidUtilities.dp(40.0f)) - (this.K.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f17), f12, -1, canvas);
            nz0 nz0Var2 = this.L;
            nz0Var2.f31234p = f10 - AndroidUtilities.dp(8.0f);
            nz0Var2.c((f10 - this.L.l()) / 2.0f, ((f11 - AndroidUtilities.dp(19.0f)) - (this.L.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f17), 0.6f * f12, -1, canvas);
            canvas2 = canvas;
        }
        d2 d2Var = this.F;
        if (d2Var != null && d2Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(d2Var.getX(), d2Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, d2Var.getWidth(), d2Var.getHeight(), (int) (d2Var.getAlpha() * (f15 - f12) * 255.0f), 31);
            d2Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        ImageView imageView = this.f6454w;
        if (imageView != null && imageView.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(imageView.getX(), imageView.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight(), (int) (imageView.getAlpha() * (f15 - f12) * 255.0f), 31);
            imageView.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f6450g0 == null) {
            dp dpVar = new dp(getContext(), 21, null);
            this.f6450g0 = dpVar;
            dpVar.b(-1, org.telegram.ui.ActionBar.f6.f23001d6, org.telegram.ui.ActionBar.f6.f23128k7);
            this.f6450g0.setDrawUnchecked(false);
            this.d.addView(this.f6450g0, g7.e6.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.f6451n.setVisibility(8);
        this.f6450g0.a(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        int i9;
        float f10;
        TL_stars.SavedStarGift savedStarGift;
        float f11;
        if (this.N == z10) {
            return;
        }
        this.N = z10;
        float f12 = 0.0f;
        boolean z12 = false;
        float f13 = 0.3f;
        FrameLayout frameLayout = this.v;
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
            scaleX.scaleY(f13).withEndAction(new c2(this, z10, 1)).start();
        } else {
            if (z10) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            frameLayout.setVisibility(i9);
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
        if (!this.N && this.P && !this.f6442b0 && (savedStarGift = this.V) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z12 = true;
        }
        f(z12, z11);
        j();
    }

    public final void d(boolean z10, boolean z11) {
        boolean z12;
        TL_stars.SavedStarGift savedStarGift;
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        if (!z11) {
            this.Q.a(z10);
        }
        invalidate();
        if (!this.N && z10 && !this.f6442b0 && (savedStarGift = this.V) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z12 = true;
        } else {
            z12 = false;
        }
        f(z12, z11);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        float e10 = this.Q.e(this.P);
        if (e10 > 0.0f) {
            this.f6443c.a(canvas, e10);
        }
        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(boolean z10, boolean z11) {
        float f10;
        float f11;
        this.f6446e.f(z10, z11);
        float f12 = 0.0f;
        ImageView imageView = this.f6454w;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z10) {
                f11 = AndroidUtilities.dp(6.0f);
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator translationX = animate.translationX(f11);
            if (z10) {
                f12 = AndroidUtilities.dp(6.0f);
            }
            translationX.translationY(f12).setDuration(320L).setInterpolator(gr.h).start();
            return;
        }
        imageView.animate().cancel();
        if (z10) {
            f10 = AndroidUtilities.dp(6.0f);
        } else {
            f10 = 0.0f;
        }
        imageView.setTranslationX(f10);
        if (z10) {
            f12 = AndroidUtilities.dp(6.0f);
        }
        imageView.setTranslationY(f12);
    }

    public final void f(boolean z10, boolean z11) {
        float f10;
        float f11;
        if (this.O == z10) {
            return;
        }
        this.O = z10;
        float f12 = 0.0f;
        int i9 = 0;
        float f13 = 0.3f;
        zf.b1 b1Var = this.C;
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
            scaleX.scaleY(f13).withEndAction(new c2(this, z10, 0)).start();
            return;
        }
        if (!z10) {
            i9 = 8;
        }
        b1Var.setVisibility(i9);
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

    public final void g(org.telegram.tgnet.tl.TL_stars.StarGift r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: fh.f2.g(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean, boolean):void");
    }

    public TL_stars.StarGift getGift() {
        return this.S;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.S;
        if (starGift != null) {
            return starGift.f22607id;
        }
        return 0L;
    }

    public zf.k getPremiumTier() {
        return this.R;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.V;
    }

    public final boolean h(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        Integer num;
        Integer num2;
        int i9;
        float f10;
        float f11;
        int i10;
        long j10;
        boolean z12;
        boolean z13;
        int i11;
        int i12;
        int i13;
        boolean z14;
        boolean z15;
        float f12;
        float f13;
        o8 o8Var = this.J;
        if (o8Var != null) {
            o8Var.run();
            this.J = null;
        }
        i(savedStarGift, savedStarGift.gift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) v7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        b2 b2Var = this.f6446e;
        b2Var.d(stargiftattributebackdrop);
        b2Var.e((TL_stars.starGiftAttributePattern) v7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        b2Var.g(null);
        this.D.setVisibility(8);
        this.E.setVisibility(8);
        o9 o9Var = this.f6456y;
        o9Var.setTranslationY(0.0f);
        zf.b1 b1Var = this.B;
        b1Var.D = true;
        b1Var.E = false;
        b1Var.invalidate();
        if (stargiftattributebackdrop != null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.f6.l1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num = null;
        }
        b1Var.setBlendWithColor(num);
        zf.b1 b1Var2 = this.C;
        b1Var2.D = true;
        b1Var2.E = false;
        b1Var2.invalidate();
        if (stargiftattributebackdrop != null) {
            num2 = Integer.valueOf(org.telegram.ui.ActionBar.f6.l1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num2 = null;
        }
        b1Var2.setBlendWithColor(num2);
        if (savedStarGift.gift.resale_ton_only) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        ImageView imageView = this.f6454w;
        imageView.setVisibility(i9);
        FrameLayout frameLayout = this.v;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.f6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            frameLayout.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.f6441b)));
        }
        FrameLayout.LayoutParams layoutParams = this.A;
        layoutParams.gravity = 17;
        o9Var.setLayoutParams(layoutParams);
        float f14 = 0.4f;
        if (this.f6449f0 == savedStarGift) {
            b1Var.setVisibility(0);
            ViewPropertyAnimator animate = b1Var.animate();
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
            scaleX.scaleY(f14).setDuration(350L).setInterpolator(gr.h).withEndAction(new e5.u(6, this, savedStarGift)).start();
        } else {
            if (savedStarGift.unsaved) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            b1Var.setAlpha(f10);
            if (savedStarGift.unsaved) {
                f11 = 1.0f;
            } else {
                f11 = 0.4f;
            }
            b1Var.setScaleX(f11);
            if (savedStarGift.unsaved) {
                f14 = 1.0f;
            }
            b1Var.setScaleY(f14);
            if (savedStarGift.unsaved) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            b1Var.setVisibility(i10);
        }
        boolean z16 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        o9 o9Var2 = this.f6451n;
        o9Var2.setColorFilter(null);
        o9Var2.setLayoutParams(this.f6452r);
        int i14 = this.f6439a;
        if (z16 && savedStarGift.name_hidden) {
            o9Var2.setVisibility(8);
            j10 = 0;
        } else if (savedStarGift.name_hidden) {
            o9Var2.setVisibility(0);
            fq a2 = ja.a(44, "anonymous");
            j10 = 0;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.f28545e = dp;
            a2.f28546f = dp2;
            o9Var2.setImageDrawable(a2);
        } else {
            j10 = 0;
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            z8 z8Var = this.h;
            if (peerDialogId > 0) {
                TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(peerDialogId));
                if (user != null) {
                    o9Var2.setVisibility(0);
                    z8Var.r(user);
                    o9Var2.e(user, z8Var);
                } else {
                    o9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId));
                if (chat != null) {
                    o9Var2.setVisibility(0);
                    z8Var.q(chat);
                    o9Var2.e(chat, z8Var);
                } else {
                    o9Var2.setVisibility(8);
                }
            }
        }
        l2 l2Var = this.G;
        d2 d2Var = this.F;
        TextView textView = this.H;
        if (stargiftattributebackdrop != null && savedStarGift.gift.resell_amount != null) {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams2 = this.A;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            eq[] eqVarArr = new eq[1];
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift.resale_ton_only && DialogObject.getPeerDialogId(starGift.owner_id) == UserConfig.getInstance(i14).getClientUserId()) {
                z12 = true;
                textView.setText(oa.U0(true, "XTR " + ((Object) oa.I0(savedStarGift.gift.getResellAmount(gf.b.f7750b).o(), 1.0f, ',')), 0.95f, eqVarArr, 0.0f, 1.0f));
            } else {
                z12 = true;
                textView.setText(oa.R0("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, eqVarArr));
            }
            eq eqVar = eqVarArr[0];
            if (eqVar != null) {
                eqVar.translate(0.0f, AndroidUtilities.dp(0.5f));
            }
            int v = org.telegram.ui.ActionBar.f6.v(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.f6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            l2Var.setBackground(new k2(1895825407, v));
            textView.setTextColor(-1);
            imageView.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(10.0f), v));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) d2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) d2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(79.0f);
            z13 = z16;
        } else {
            z12 = true;
            if (z10) {
                textView.setVisibility(8);
                this.A.topMargin = AndroidUtilities.dp(12.0f);
                this.A.bottomMargin = AndroidUtilities.dp(12.0f);
            } else {
                textView.setVisibility(0);
                FrameLayout.LayoutParams layoutParams3 = this.A;
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
            }
            if (z16) {
                textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                textView.setTextSize(1, 12.0f);
                textView.setText(LocaleController.getString(R.string.Gift2PriceUnique));
                z13 = z16;
            } else {
                textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                textView.setTextSize(1, 12.0f);
                StringBuilder sb2 = new StringBuilder("XTR ");
                TL_stars.StarGift starGift2 = savedStarGift.gift;
                long j11 = starGift2.stars;
                z13 = z16;
                long j12 = savedStarGift.convert_stars;
                if (j12 <= j10) {
                    j12 = starGift2.convert_stars;
                }
                textView.setText(oa.X0(false, j3.r0.n(Math.max(j11, j12), ',', sb2), 0.66f, null));
            }
            if (z13) {
                i11 = -1;
            } else if (org.telegram.ui.ActionBar.f6.I.q()) {
                i11 = -1333971;
            } else {
                i11 = -4229632;
            }
            textView.setTextColor(i11);
            int i15 = 1088989954;
            if (z13) {
                i12 = 1090519039;
            } else if (org.telegram.ui.ActionBar.f6.I.q()) {
                i12 = 518759725;
            } else {
                i12 = 1088989954;
            }
            l2Var.setBackground(new k2(i12));
            int dp3 = AndroidUtilities.dp(10.0f);
            if (z13) {
                i15 = 1090519039;
            } else if (org.telegram.ui.ActionBar.f6.I.q()) {
                i15 = 518759725;
            }
            imageView.setBackground(org.telegram.ui.ActionBar.f6.b0(dp3, i15));
            if (z13) {
                i13 = -1;
            } else if (org.telegram.ui.ActionBar.f6.I.q()) {
                i13 = -1333971;
            } else {
                i13 = -4229632;
            }
            imageView.setColorFilter(i13);
            ((FrameLayout.LayoutParams) d2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) d2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        }
        this.I.setVisibility(8);
        this.f6449f0 = savedStarGift;
        this.f6445d0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.V;
        this.R = null;
        this.S = null;
        this.U = false;
        this.V = savedStarGift;
        this.W = false;
        this.f6440a0 = false;
        this.f6442b0 = z11;
        this.K = null;
        this.L = null;
        if (savedStarGift.pinned_to_top && (!z13 || savedStarGift.name_hidden)) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (savedStarGift2 == savedStarGift) {
            z15 = true;
        } else {
            z15 = false;
        }
        c(z14, z15);
        j();
        if (savedStarGift2 != savedStarGift) {
            return false;
        }
        return z12;
    }

    public final void i(TLObject tLObject, TLRPC.Document document) {
        o9 o9Var = this.f6456y;
        if (document == null) {
            o9Var.b();
            this.f6447e0 = null;
        } else if (this.f6447e0 == document) {
        } else {
            this.f6447e0 = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            o9Var.l(ImageLocation.getForDocument(document), "80_80_nolimit_pcache", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80_nolimit_pcache", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.f6.f22947a7, 0.3f), tLObject);
        }
    }

    public final void j() {
        TL_stars.SavedStarGift savedStarGift = this.V;
        org.telegram.ui.ActionBar.b6 b6Var = this.f6441b;
        g2 g2Var = this.f6448f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                g2Var.setVisibility(0);
                if (this.V.gift.resell_amount != null) {
                    int v = org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var), org.telegram.ui.ActionBar.f6.l1(0.04f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var)));
                    g2Var.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.uj, b6Var));
                    g2Var.setStrokeColor(v);
                    g2Var.setBackdrop(null);
                    g2Var.b(LocaleController.getString(R.string.Gift2OnSale), false);
                    return;
                }
                g2Var.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Li, b6Var));
                g2Var.setStrokeColor(0);
                g2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) v7.l(this.V.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                g2Var.b(j3.r0.n(this.V.gift.num, ',', new StringBuilder("#")), true);
                return;
            } else if (starGift.limited) {
                g2Var.setVisibility(0);
                g2Var.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Li, b6Var));
                g2Var.setStrokeColor(0);
                g2Var.setBackdrop(null);
                g2Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.V.gift.availability_total, 0)), true);
                return;
            } else {
                g2Var.setBackdrop(null);
                g2Var.setVisibility(8);
                return;
            }
        }
        TL_stars.StarGift starGift2 = this.S;
        if (starGift2 != null) {
            if (!this.f6440a0 && !this.f6444c0) {
                if (this.W && starGift2.availability_resale > 0) {
                    g2Var.setVisibility(0);
                    g2Var.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.uj, b6Var));
                    g2Var.setStrokeColor(0);
                    g2Var.setBackdrop(null);
                    g2Var.b(LocaleController.getString(R.string.Gift2Resale), false);
                    return;
                } else if (this.U) {
                    g2Var.setVisibility(0);
                    g2Var.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Li, b6Var));
                    g2Var.setStrokeColor(0);
                    g2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) v7.l(this.S.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    g2Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.S.availability_issued, 0)), true);
                    return;
                } else {
                    boolean z10 = starGift2.limited;
                    if (z10 && starGift2.availability_remains <= 0) {
                        g2Var.setVisibility(0);
                        g2Var.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Mi, b6Var));
                        g2Var.setStrokeColor(0);
                        g2Var.setBackdrop(null);
                        g2Var.b(LocaleController.getString(R.string.Gift2SoldOut), true);
                        return;
                    } else if (starGift2.auction) {
                        g2Var.setVisibility(0);
                        g2Var.setBackdrop(null);
                        g2Var.a(-2650077, -4227818);
                        g2Var.setStrokeColor(0);
                        if (this.S.auction_start_date > ConnectionsManager.getInstance(this.f6439a).getCurrentTime()) {
                            g2Var.b(LocaleController.getString(R.string.Gift2LimitedAuctionSoon), true);
                            return;
                        } else {
                            g2Var.b(LocaleController.getString(R.string.Gift2LimitedAuction), true);
                            return;
                        }
                    } else if (starGift2.require_premium) {
                        g2Var.setVisibility(0);
                        g2Var.setBackdrop(null);
                        g2Var.a(-2650077, -4227818);
                        g2Var.setStrokeColor(0);
                        g2Var.b(LocaleController.getString(R.string.Gift2LimitedPremium), true);
                        return;
                    } else if (z10) {
                        g2Var.setVisibility(0);
                        g2Var.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Li, b6Var));
                        g2Var.setStrokeColor(0);
                        g2Var.setBackdrop(null);
                        g2Var.b(LocaleController.getString(R.string.Gift2LimitedRibbon), true);
                        return;
                    } else {
                        g2Var.setBackdrop(null);
                        g2Var.setStrokeColor(0);
                        g2Var.setVisibility(8);
                        return;
                    }
                }
            }
            g2Var.setVisibility(0);
            g2Var.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Li, b6Var));
            g2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) v7.l(this.S.attributes, TL_stars.starGiftAttributeBackdrop.class));
            g2Var.setStrokeColor(0);
            g2Var.b(j3.r0.n(this.S.num, ',', new StringBuilder("#")), true);
            return;
        }
        zf.k kVar = this.R;
        if (kVar != null) {
            if (kVar.b() > 0) {
                g2Var.setVisibility(0);
                g2Var.setBackdrop(null);
                g2Var.a(-2535425, -8229377);
                g2Var.setStrokeColor(0);
                String formatString = LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(this.R.b()));
                g2Var.f6473b = formatString;
                g2Var.f6472a.e(12, formatString, true);
                return;
            }
            g2Var.setVisibility(8);
            g2Var.setBackdrop(null);
            g2Var.setStrokeColor(0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: fh.f2.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public void setImageLayer(int i9) {
        this.f6456y.setLayerNum(i9);
    }

    public void setImageSize(int i9) {
        FrameLayout.LayoutParams layoutParams = this.A;
        layoutParams.width = i9;
        layoutParams.height = i9;
    }

    public void setRibbonColor(int i9) {
        g2 g2Var = this.f6448f;
        g2Var.setColor(i9);
        g2Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f6448f.b(str, true);
    }

    public void setRibbonTextOneOf(int i9) {
        g2 g2Var = this.f6448f;
        g2Var.setVisibility(0);
        g2Var.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Li, this.f6441b));
        g2Var.setStrokeColor(0);
        g2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) v7.l(this.S.attributes, TL_stars.starGiftAttributeBackdrop.class));
        g2Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(i9, 0)), true);
    }
}
