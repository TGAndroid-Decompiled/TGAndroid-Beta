package lh;

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
import mh.ea;
import mh.ja;
import mh.l8;
import mh.t7;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.z8;
import org.telegram.ui.yh;
public class x1 extends FrameLayout {
    public static final int[] f13075i0 = {-2781403, -3635939};
    public FrameLayout.LayoutParams B;
    public final fg.r1 C;
    public final fg.r1 D;
    public final TextView E;
    public final TextView F;
    public final eg.s2 G;
    public final fg.h0 H;
    public final TextView I;
    public final TextView J;
    public l8 K;
    public k01 L;
    public k01 M;
    public final Rect N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public final org.telegram.ui.Components.z5 R;
    public fg.n S;
    public TL_stars.StarGift T;
    public boolean U;
    public boolean V;
    public TL_stars.SavedStarGift W;
    public final int f13076a;
    public boolean f13077a0;
    public final g6 f13078b;
    public boolean f13079b0;
    public final cp0 f13080c;
    public boolean f13081c0;
    public final FrameLayout d;
    public boolean f13082d0;
    public final u1 f13083e;
    public fg.n f13084e0;
    public final y1 f13085f;
    public TLRPC.Document f13086f0;
    public TL_stars.SavedStarGift f13087g0;
    public final z8 h;
    public np f13088h0;
    public final p9 f13089n;
    public final FrameLayout.LayoutParams f13090r;
    public final FrameLayout.LayoutParams f13091s;
    public final FrameLayout v;
    public final ImageView f13092w;
    public final TextView f13093x;
    public final p9 f13094y;

    public x1(Context context, int i10, g6 g6Var) {
        super(context);
        int i11;
        int i12;
        this.N = new Rect();
        this.R = new org.telegram.ui.Components.z5(this, 0L, 320L, pr.h);
        this.f13076a = i10;
        this.f13078b = g6Var;
        k7.e6.b(this, 0.04f, 1.5f);
        this.f13080c = new cp0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        u1 u1Var = new u1(frameLayout, g6Var, true);
        this.f13083e = u1Var;
        frameLayout.setBackground(u1Var);
        addView(frameLayout, k7.c6.e(-1, -1, 119));
        y1 y1Var = new y1(context);
        this.f13085f = y1Var;
        addView(y1Var, k7.c6.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        p9 p9Var = new p9(context);
        this.f13094y = p9Var;
        p9Var.getImageReceiver().setAutoRepeat(0);
        FrameLayout.LayoutParams d = k7.c6.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.B = d;
        frameLayout.addView(p9Var, d);
        fg.r1 r1Var = new fg.r1(context, 3, g6Var);
        this.C = r1Var;
        r1Var.setImageReceiver(p9Var.getImageReceiver());
        frameLayout.addView(r1Var, k7.c6.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        fg.r1 r1Var2 = new fg.r1(context, 4, g6Var);
        this.D = r1Var2;
        r1Var2.setImageReceiver(p9Var.getImageReceiver());
        frameLayout.addView(r1Var2, k7.c6.e(44, 44, 17));
        r1Var2.setAlpha(0.0f);
        r1Var2.setScaleX(0.3f);
        r1Var2.setScaleY(0.3f);
        r1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.E = textView;
        int i13 = k6.G6;
        textView.setTextColor(k6.v0(i13, g6Var));
        textView.setGravity(17);
        yh.p(14.0f, 1, textView);
        TextView h = yh.h(frameLayout, textView, k7.c6.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.F = h;
        h.setTextColor(k6.v0(i13, g6Var));
        h.setGravity(17);
        h.setTextSize(1, 12.0f);
        frameLayout.addView(h, k7.c6.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        eg.s2 s2Var = new eg.s2(this, context, 6);
        this.G = s2Var;
        TextView textView2 = new TextView(context);
        this.I = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(s2Var, k7.c6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        fg.h0 h0Var = new fg.h0(context, 1);
        this.H = h0Var;
        h0Var.setBackgroundColor(-16776961);
        s2Var.addView(h0Var, k7.c6.c(0.0f, 0));
        s2Var.addView(textView2, k7.c6.e(-2, 26, 17));
        if (k6.I.q()) {
            i11 = 518759725;
        } else {
            i11 = 1088989954;
        }
        h0Var.setBackground(new c2(i11));
        TextView textView3 = new TextView(context);
        this.J = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        if (k6.I.q()) {
            i12 = -1333971;
        } else {
            i12 = -2722014;
        }
        textView3.setTextColor(i12);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, k7.c6.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new z8((g6) null);
        p9 p9Var2 = new p9(context);
        this.f13089n = p9Var2;
        p9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        p9Var2.setVisibility(8);
        FrameLayout.LayoutParams d10 = k7.c6.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.f13090r = d10;
        frameLayout.addView(p9Var2, d10);
        this.f13091s = k7.c6.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
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
        frameLayout2.addView(imageView, k7.c6.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, k7.c6.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView2 = new ImageView(context);
        this.f13092w = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_14);
        imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        imageView2.setVisibility(8);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView2, k7.c6.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.f13093x = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, k7.c6.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        y1Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.W;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) starGift;
            }
            return null;
        }
        return null;
    }

    public final void a(o70 o70Var, Canvas canvas, float f10, float f11, float f12) {
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
        u1 u1Var = this.f13083e;
        u1Var.setBounds(0, 0, (int) f10, (int) f11);
        u1Var.b(canvas2, f12);
        u1Var.getPadding(this.N);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(120.0f), f12);
        p9 p9Var = this.f13094y;
        float f16 = f11 - f13;
        p9Var.getImageReceiver().setImageCoords((f10 - lerp) / 2.0f, (f16 - lerp) / 2.0f, lerp, lerp);
        p9Var.getImageReceiver().draw(canvas2);
        if (p9Var.getImageReceiver().isLottieRunning()) {
            o70Var.invalidate();
        }
        fg.r1 r1Var = this.C;
        if (r1Var.getVisibility() == 0 && r1Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate((f10 - r1Var.getMeasuredWidth()) / 2.0f, AndroidUtilities.lerp(r1Var.getY(), (f16 - r1Var.getMeasuredHeight()) / 2.0f, f12));
            f14 = 1.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, r1Var.getWidth(), r1Var.getHeight(), (int) (r1Var.getAlpha() * (1.0f - f12) * 255.0f), 31);
            r1Var.draw(canvas2);
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
        p9 p9Var2 = this.f13089n;
        if (p9Var2.getVisibility() == 0 && p9Var2.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top);
            p9Var2.draw(canvas2);
            canvas2.restore();
        }
        y1 y1Var = this.f13085f;
        if (y1Var.getVisibility() == 0 && y1Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(f10 - AndroidUtilities.dp(f14), AndroidUtilities.dp(2.0f));
            f15 = 1.0f;
            float lerp2 = AndroidUtilities.lerp(1.0f, 1.25f, f12);
            canvas2.scale(lerp2, lerp2);
            canvas2.translate(-y1Var.getWidth(), 0.0f);
            y1Var.draw(canvas2);
            canvas2.restore();
        } else {
            f15 = 1.0f;
        }
        if (uniqueStarGift != null) {
            if (this.L == null) {
                this.L = new k01(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
            }
            if (this.M == null) {
                this.M = new k01(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f, null);
            }
            k01 k01Var = this.L;
            k01Var.f28238p = f10 - AndroidUtilities.dp(8.0f);
            float f17 = f15 - f12;
            k01Var.c((f10 - this.L.l()) / 2.0f, ((f11 - AndroidUtilities.dp(40.0f)) - (this.L.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f17), f12, -1, canvas);
            k01 k01Var2 = this.M;
            k01Var2.f28238p = f10 - AndroidUtilities.dp(8.0f);
            k01Var2.c((f10 - this.M.l()) / 2.0f, ((f11 - AndroidUtilities.dp(19.0f)) - (this.M.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f17), 0.6f * f12, -1, canvas);
            canvas2 = canvas;
        }
        eg.s2 s2Var = this.G;
        if (s2Var != null && s2Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(s2Var.getX(), s2Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, s2Var.getWidth(), s2Var.getHeight(), (int) (s2Var.getAlpha() * (f15 - f12) * 255.0f), 31);
            s2Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        ImageView imageView = this.f13092w;
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

    public final void b(boolean z4, boolean z10) {
        if (this.f13088h0 == null) {
            np npVar = new np(getContext(), 21, null);
            this.f13088h0 = npVar;
            npVar.b(-1, k6.f21661d6, k6.f21788k7);
            this.f13088h0.setDrawUnchecked(false);
            this.d.addView(this.f13088h0, k7.c6.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.f13089n.setVisibility(8);
        this.f13088h0.a(z4, z10);
    }

    public final void c(boolean z4, boolean z10) {
        int i10;
        float f10;
        TL_stars.SavedStarGift savedStarGift;
        float f11;
        if (this.O == z4) {
            return;
        }
        this.O = z4;
        float f12 = 0.0f;
        boolean z11 = false;
        float f13 = 0.3f;
        FrameLayout frameLayout = this.v;
        if (z10) {
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate = frameLayout.animate();
            if (z4) {
                f12 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.3f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (z4) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).withEndAction(new v1(this, z4, 1)).start();
        } else {
            if (z4) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
            if (z4) {
                f12 = 1.0f;
            }
            frameLayout.setAlpha(f12);
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.3f;
            }
            frameLayout.setScaleX(f10);
            if (z4) {
                f13 = 1.0f;
            }
            frameLayout.setScaleY(f13);
        }
        if (!this.O && this.Q && !this.f13081c0 && (savedStarGift = this.W) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z11 = true;
        }
        f(z11, z10);
        j();
    }

    public final void d(boolean z4, boolean z10) {
        boolean z11;
        TL_stars.SavedStarGift savedStarGift;
        if (this.Q == z4) {
            return;
        }
        this.Q = z4;
        if (!z10) {
            this.R.a(z4);
        }
        invalidate();
        if (!this.O && z4 && !this.f13081c0 && (savedStarGift = this.W) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z11 = true;
        } else {
            z11 = false;
        }
        f(z11, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        float e6 = this.R.e(this.Q);
        if (e6 > 0.0f) {
            this.f13080c.a(canvas, e6);
        }
        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(boolean z4, boolean z10) {
        float f10;
        float f11;
        this.f13083e.f(z4, z10);
        float f12 = 0.0f;
        ImageView imageView = this.f13092w;
        if (z10) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z4) {
                f11 = AndroidUtilities.dp(6.0f);
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator translationX = animate.translationX(f11);
            if (z4) {
                f12 = AndroidUtilities.dp(6.0f);
            }
            translationX.translationY(f12).setDuration(320L).setInterpolator(pr.h).start();
            return;
        }
        imageView.animate().cancel();
        if (z4) {
            f10 = AndroidUtilities.dp(6.0f);
        } else {
            f10 = 0.0f;
        }
        imageView.setTranslationX(f10);
        if (z4) {
            f12 = AndroidUtilities.dp(6.0f);
        }
        imageView.setTranslationY(f12);
    }

    public final void f(boolean z4, boolean z10) {
        float f10;
        float f11;
        if (this.P == z4) {
            return;
        }
        this.P = z4;
        float f12 = 0.0f;
        int i10 = 0;
        float f13 = 0.3f;
        fg.r1 r1Var = this.D;
        if (z10) {
            r1Var.setVisibility(0);
            ViewPropertyAnimator animate = r1Var.animate();
            if (z4) {
                f12 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.3f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (z4) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).withEndAction(new v1(this, z4, 0)).start();
            return;
        }
        if (!z4) {
            i10 = 8;
        }
        r1Var.setVisibility(i10);
        if (z4) {
            f12 = 1.0f;
        }
        r1Var.setAlpha(f12);
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.3f;
        }
        r1Var.setScaleX(f10);
        if (z4) {
            f13 = 1.0f;
        }
        r1Var.setScaleY(f13);
    }

    public final void g(org.telegram.tgnet.tl.TL_stars.StarGift r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: lh.x1.g(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean, boolean):void");
    }

    public TL_stars.StarGift getGift() {
        return this.T;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.T;
        if (starGift != null) {
            return starGift.f21072id;
        }
        return 0L;
    }

    public fg.n getPremiumTier() {
        return this.S;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.W;
    }

    public final boolean h(TL_stars.SavedStarGift savedStarGift, boolean z4, boolean z10) {
        Integer num;
        Integer num2;
        int i10;
        float f10;
        float f11;
        int i11;
        long j10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        boolean z13;
        boolean z14;
        float f12;
        float f13;
        l8 l8Var = this.K;
        if (l8Var != null) {
            l8Var.run();
            this.K = null;
        }
        i(savedStarGift, savedStarGift.gift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) t7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        u1 u1Var = this.f13083e;
        u1Var.d(stargiftattributebackdrop);
        u1Var.e((TL_stars.starGiftAttributePattern) t7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        u1Var.g(null);
        this.E.setVisibility(8);
        this.F.setVisibility(8);
        p9 p9Var = this.f13094y;
        p9Var.setTranslationY(0.0f);
        fg.r1 r1Var = this.C;
        r1Var.E = true;
        r1Var.F = false;
        r1Var.invalidate();
        if (stargiftattributebackdrop != null) {
            num = Integer.valueOf(k6.l1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num = null;
        }
        r1Var.setBlendWithColor(num);
        fg.r1 r1Var2 = this.D;
        r1Var2.E = true;
        r1Var2.F = false;
        r1Var2.invalidate();
        if (stargiftattributebackdrop != null) {
            num2 = Integer.valueOf(k6.l1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num2 = null;
        }
        r1Var2.setBlendWithColor(num2);
        if (savedStarGift.gift.resale_ton_only) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.f13092w;
        imageView.setVisibility(i10);
        FrameLayout frameLayout = this.v;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(k6.K(AndroidUtilities.dp(20.0f), k6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            frameLayout.setBackground(k6.K(AndroidUtilities.dp(20.0f), k6.v0(k6.Oh, this.f13078b)));
        }
        FrameLayout.LayoutParams layoutParams = this.B;
        layoutParams.gravity = 17;
        p9Var.setLayoutParams(layoutParams);
        float f14 = 0.4f;
        if (this.f13087g0 == savedStarGift) {
            r1Var.setVisibility(0);
            ViewPropertyAnimator animate = r1Var.animate();
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
            scaleX.scaleY(f14).setDuration(350L).setInterpolator(pr.h).withEndAction(new gf.c(24, this, savedStarGift)).start();
        } else {
            if (savedStarGift.unsaved) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            r1Var.setAlpha(f10);
            if (savedStarGift.unsaved) {
                f11 = 1.0f;
            } else {
                f11 = 0.4f;
            }
            r1Var.setScaleX(f11);
            if (savedStarGift.unsaved) {
                f14 = 1.0f;
            }
            r1Var.setScaleY(f14);
            if (savedStarGift.unsaved) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            r1Var.setVisibility(i11);
        }
        boolean z15 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        p9 p9Var2 = this.f13089n;
        p9Var2.setColorFilter(null);
        p9Var2.setLayoutParams(this.f13090r);
        int i15 = this.f13076a;
        if (z15 && savedStarGift.name_hidden) {
            p9Var2.setVisibility(8);
            j10 = 0;
        } else if (savedStarGift.name_hidden) {
            p9Var2.setVisibility(0);
            pq a2 = ea.a(44, "anonymous");
            j10 = 0;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.f30161e = dp;
            a2.f30162f = dp2;
            p9Var2.setImageDrawable(a2);
        } else {
            j10 = 0;
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            z8 z8Var = this.h;
            if (peerDialogId > 0) {
                TLRPC.User user = MessagesController.getInstance(i15).getUser(Long.valueOf(peerDialogId));
                if (user != null) {
                    p9Var2.setVisibility(0);
                    z8Var.r(user);
                    p9Var2.e(user, z8Var);
                } else {
                    p9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-peerDialogId));
                if (chat != null) {
                    p9Var2.setVisibility(0);
                    z8Var.q(chat);
                    p9Var2.e(chat, z8Var);
                } else {
                    p9Var2.setVisibility(8);
                }
            }
        }
        fg.h0 h0Var = this.H;
        eg.s2 s2Var = this.G;
        TextView textView = this.I;
        if (stargiftattributebackdrop != null && savedStarGift.gift.resell_amount != null) {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams2 = this.B;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            oq[] oqVarArr = new oq[1];
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift.resale_ton_only && DialogObject.getPeerDialogId(starGift.owner_id) == UserConfig.getInstance(i15).getClientUserId()) {
                z11 = true;
                textView.setText(ja.U0(true, "XTR " + ((Object) ja.J0(savedStarGift.gift.getResellAmount(mf.b.f13654b).o(), 1.0f, ',')), 0.95f, oqVarArr, 0.0f, 1.0f));
            } else {
                z11 = true;
                textView.setText(ja.R0("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, oqVarArr));
            }
            oq oqVar = oqVarArr[0];
            if (oqVar != null) {
                oqVar.translate(0.0f, AndroidUtilities.dp(0.5f));
            }
            int v = k6.v(stargiftattributebackdrop.center_color | (-16777216), k6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            h0Var.setBackground(new c2(1895825407, v));
            textView.setTextColor(-1);
            imageView.setBackground(k6.b0(AndroidUtilities.dp(10.0f), v));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) s2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) s2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(79.0f);
            z12 = z15;
        } else {
            z11 = true;
            if (z4) {
                textView.setVisibility(8);
                this.B.topMargin = AndroidUtilities.dp(12.0f);
                this.B.bottomMargin = AndroidUtilities.dp(12.0f);
            } else {
                textView.setVisibility(0);
                FrameLayout.LayoutParams layoutParams3 = this.B;
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
            }
            if (z15) {
                textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                textView.setTextSize(1, 12.0f);
                textView.setText(LocaleController.getString(R.string.Gift2PriceUnique));
                z12 = z15;
            } else {
                textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                textView.setTextSize(1, 12.0f);
                StringBuilder sb = new StringBuilder("XTR ");
                TL_stars.StarGift starGift2 = savedStarGift.gift;
                long j11 = starGift2.stars;
                z12 = z15;
                long j12 = savedStarGift.convert_stars;
                if (j12 <= j10) {
                    j12 = starGift2.convert_stars;
                }
                textView.setText(ja.X0(false, l.d.l(Math.max(j11, j12), ',', sb), 0.66f, null));
            }
            if (z12) {
                i12 = -1;
            } else if (k6.I.q()) {
                i12 = -1333971;
            } else {
                i12 = -4229632;
            }
            textView.setTextColor(i12);
            int i16 = 1088989954;
            if (z12) {
                i13 = 1090519039;
            } else if (k6.I.q()) {
                i13 = 518759725;
            } else {
                i13 = 1088989954;
            }
            h0Var.setBackground(new c2(i13));
            int dp3 = AndroidUtilities.dp(10.0f);
            if (z12) {
                i16 = 1090519039;
            } else if (k6.I.q()) {
                i16 = 518759725;
            }
            imageView.setBackground(k6.b0(dp3, i16));
            if (z12) {
                i14 = -1;
            } else if (k6.I.q()) {
                i14 = -1333971;
            } else {
                i14 = -4229632;
            }
            imageView.setColorFilter(i14);
            ((FrameLayout.LayoutParams) s2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) s2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        }
        this.J.setVisibility(8);
        this.f13087g0 = savedStarGift;
        this.f13084e0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.W;
        this.S = null;
        this.T = null;
        this.V = false;
        this.W = savedStarGift;
        this.f13077a0 = false;
        this.f13079b0 = false;
        this.f13081c0 = z10;
        this.L = null;
        this.M = null;
        if (savedStarGift.pinned_to_top && (!z12 || savedStarGift.name_hidden)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (savedStarGift2 == savedStarGift) {
            z14 = true;
        } else {
            z14 = false;
        }
        c(z13, z14);
        j();
        if (savedStarGift2 != savedStarGift) {
            return false;
        }
        return z11;
    }

    public final void i(TLObject tLObject, TLRPC.Document document) {
        p9 p9Var = this.f13094y;
        if (document == null) {
            p9Var.b();
            this.f13086f0 = null;
        } else if (this.f13086f0 == document) {
        } else {
            this.f13086f0 = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            p9Var.l(ImageLocation.getForDocument(document), "80_80_nolimit_pcache", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80_nolimit_pcache", DocumentObject.getSvgThumb(document, k6.f21607a7, 0.3f), tLObject);
        }
    }

    public final void j() {
        TL_stars.SavedStarGift savedStarGift = this.W;
        g6 g6Var = this.f13078b;
        y1 y1Var = this.f13085f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                y1Var.setVisibility(0);
                if (this.W.gift.resell_amount != null) {
                    int v = k6.v(k6.v0(k6.f21661d6, g6Var), k6.l1(0.04f, k6.v0(k6.G6, g6Var)));
                    y1Var.setColor(k6.v0(k6.uj, g6Var));
                    y1Var.setStrokeColor(v);
                    y1Var.setBackdrop(null);
                    y1Var.b(LocaleController.getString(R.string.Gift2OnSale), false);
                    return;
                }
                y1Var.setColor(k6.v0(k6.Li, g6Var));
                y1Var.setStrokeColor(0);
                y1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) t7.l(this.W.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                y1Var.b(l.d.l(this.W.gift.num, ',', new StringBuilder("#")), true);
                return;
            } else if (starGift.limited) {
                y1Var.setVisibility(0);
                y1Var.setColor(k6.v0(k6.Li, g6Var));
                y1Var.setStrokeColor(0);
                y1Var.setBackdrop(null);
                y1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.W.gift.availability_total, 0)), true);
                return;
            } else {
                y1Var.setBackdrop(null);
                y1Var.setVisibility(8);
                return;
            }
        }
        TL_stars.StarGift starGift2 = this.T;
        if (starGift2 != null) {
            if (!this.f13079b0 && !this.f13082d0) {
                if (this.f13077a0 && starGift2.availability_resale > 0) {
                    y1Var.setVisibility(0);
                    y1Var.setColor(k6.v0(k6.uj, g6Var));
                    y1Var.setStrokeColor(0);
                    y1Var.setBackdrop(null);
                    y1Var.b(LocaleController.getString(R.string.Gift2Resale), false);
                    return;
                } else if (this.V) {
                    y1Var.setVisibility(0);
                    y1Var.setColor(k6.v0(k6.Li, g6Var));
                    y1Var.setStrokeColor(0);
                    y1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) t7.l(this.T.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    y1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.T.availability_issued, 0)), true);
                    return;
                } else {
                    boolean z4 = starGift2.limited;
                    if (z4 && starGift2.availability_remains <= 0) {
                        y1Var.setVisibility(0);
                        y1Var.setColor(k6.v0(k6.Mi, g6Var));
                        y1Var.setStrokeColor(0);
                        y1Var.setBackdrop(null);
                        y1Var.b(LocaleController.getString(R.string.Gift2SoldOut), true);
                        return;
                    } else if (starGift2.auction) {
                        y1Var.setVisibility(0);
                        y1Var.setBackdrop(null);
                        y1Var.a(-2650077, -4227818);
                        y1Var.setStrokeColor(0);
                        if (this.T.auction_start_date > ConnectionsManager.getInstance(this.f13076a).getCurrentTime()) {
                            y1Var.b(LocaleController.getString(R.string.Gift2LimitedAuctionSoon), true);
                            return;
                        } else {
                            y1Var.b(LocaleController.getString(R.string.Gift2LimitedAuction), true);
                            return;
                        }
                    } else if (starGift2.require_premium) {
                        y1Var.setVisibility(0);
                        y1Var.setBackdrop(null);
                        y1Var.a(-2650077, -4227818);
                        y1Var.setStrokeColor(0);
                        y1Var.b(LocaleController.getString(R.string.Gift2LimitedPremium), true);
                        return;
                    } else if (z4) {
                        y1Var.setVisibility(0);
                        y1Var.setColor(k6.v0(k6.Li, g6Var));
                        y1Var.setStrokeColor(0);
                        y1Var.setBackdrop(null);
                        y1Var.b(LocaleController.getString(R.string.Gift2LimitedRibbon), true);
                        return;
                    } else {
                        y1Var.setBackdrop(null);
                        y1Var.setStrokeColor(0);
                        y1Var.setVisibility(8);
                        return;
                    }
                }
            }
            y1Var.setVisibility(0);
            y1Var.setColor(k6.v0(k6.Li, g6Var));
            y1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) t7.l(this.T.attributes, TL_stars.starGiftAttributeBackdrop.class));
            y1Var.setStrokeColor(0);
            y1Var.b(l.d.l(this.T.num, ',', new StringBuilder("#")), true);
            return;
        }
        fg.n nVar = this.S;
        if (nVar != null) {
            if (nVar.b() > 0) {
                y1Var.setVisibility(0);
                y1Var.setBackdrop(null);
                y1Var.a(-2535425, -8229377);
                y1Var.setStrokeColor(0);
                String formatString = LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(this.S.b()));
                y1Var.f13119b = formatString;
                y1Var.f13118a.e(12, formatString, true);
                return;
            }
            y1Var.setVisibility(8);
            y1Var.setBackdrop(null);
            y1Var.setStrokeColor(0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: lh.x1.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public void setImageLayer(int i10) {
        this.f13094y.setLayerNum(i10);
    }

    public void setImageSize(int i10) {
        FrameLayout.LayoutParams layoutParams = this.B;
        layoutParams.width = i10;
        layoutParams.height = i10;
    }

    public void setRibbonColor(int i10) {
        y1 y1Var = this.f13085f;
        y1Var.setColor(i10);
        y1Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f13085f.b(str, true);
    }

    public void setRibbonTextOneOf(int i10) {
        y1 y1Var = this.f13085f;
        y1Var.setVisibility(0);
        y1Var.setColor(k6.v0(k6.Li, this.f13078b));
        y1Var.setStrokeColor(0);
        y1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) t7.l(this.T.attributes, TL_stars.starGiftAttributeBackdrop.class));
        y1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(i10, 0)), true);
    }
}
