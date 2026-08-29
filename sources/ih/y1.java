package ih;

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
import i7.h6;
import jh.da;
import jh.ia;
import jh.k8;
import jh.s7;
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
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.th;
public class y1 extends FrameLayout {
    public static final int[] f9520h0 = {-2781403, -3635939};
    public FrameLayout.LayoutParams A;
    public final cg.t1 B;
    public final cg.t1 C;
    public final TextView D;
    public final TextView E;
    public final bg.x2 F;
    public final cg.h0 G;
    public final TextView H;
    public final TextView I;
    public k8 J;
    public zz0 K;
    public zz0 L;
    public final Rect M;
    public boolean N;
    public boolean O;
    public boolean P;
    public final org.telegram.ui.Components.d6 Q;
    public cg.n R;
    public TL_stars.StarGift S;
    public boolean T;
    public boolean U;
    public TL_stars.SavedStarGift V;
    public boolean W;
    public final int f9521a;
    public boolean f9522a0;
    public final org.telegram.ui.ActionBar.c6 f9523b;
    public boolean f9524b0;
    public final so0 f9525c;
    public boolean f9526c0;
    public final FrameLayout d;
    public cg.n f9527d0;
    public final v1 f9528e;
    public TLRPC.Document f9529e0;
    public final z1 f9530f;
    public TL_stars.SavedStarGift f9531f0;
    public hp f9532g0;
    public final e9 h;
    public final t9 f9533n;
    public final FrameLayout.LayoutParams f9534r;
    public final FrameLayout.LayoutParams f9535s;
    public final FrameLayout v;
    public final ImageView f9536w;
    public final TextView f9537x;
    public final t9 f9538y;

    public y1(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i11;
        int i12;
        this.M = new Rect();
        this.Q = new org.telegram.ui.Components.d6(this, 0L, 320L, jr.h);
        this.f9521a = i10;
        this.f9523b = c6Var;
        h6.b(this, 0.04f, 1.5f);
        this.f9525c = new so0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        v1 v1Var = new v1(frameLayout, c6Var, true);
        this.f9528e = v1Var;
        frameLayout.setBackground(v1Var);
        addView(frameLayout, i7.f6.e(-1, -1, 119));
        z1 z1Var = new z1(context);
        this.f9530f = z1Var;
        addView(z1Var, i7.f6.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        t9 t9Var = new t9(context);
        this.f9538y = t9Var;
        t9Var.getImageReceiver().setAutoRepeat(0);
        FrameLayout.LayoutParams d = i7.f6.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.A = d;
        frameLayout.addView(t9Var, d);
        cg.t1 t1Var = new cg.t1(context, 3, c6Var);
        this.B = t1Var;
        t1Var.setImageReceiver(t9Var.getImageReceiver());
        frameLayout.addView(t1Var, i7.f6.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        cg.t1 t1Var2 = new cg.t1(context, 4, c6Var);
        this.C = t1Var2;
        t1Var2.setImageReceiver(t9Var.getImageReceiver());
        frameLayout.addView(t1Var2, i7.f6.e(44, 44, 17));
        t1Var2.setAlpha(0.0f);
        t1Var2.setScaleX(0.3f);
        t1Var2.setScaleY(0.3f);
        t1Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.D = textView;
        int i13 = g6.G6;
        textView.setTextColor(g6.v0(i13, c6Var));
        textView.setGravity(17);
        th.n(14.0f, 1, textView);
        TextView h = th.h(frameLayout, textView, i7.f6.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.E = h;
        h.setTextColor(g6.v0(i13, c6Var));
        h.setGravity(17);
        h.setTextSize(1, 12.0f);
        frameLayout.addView(h, i7.f6.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        bg.x2 x2Var = new bg.x2(this, context, 6);
        this.F = x2Var;
        TextView textView2 = new TextView(context);
        this.H = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(x2Var, i7.f6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        cg.h0 h0Var = new cg.h0(context, 1);
        this.G = h0Var;
        h0Var.setBackgroundColor(-16776961);
        x2Var.addView(h0Var, i7.f6.c(0.0f, 0));
        x2Var.addView(textView2, i7.f6.e(-2, 26, 17));
        if (g6.I.q()) {
            i11 = 518759725;
        } else {
            i11 = 1088989954;
        }
        h0Var.setBackground(new d2(i11));
        TextView textView3 = new TextView(context);
        this.I = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        if (g6.I.q()) {
            i12 = -1333971;
        } else {
            i12 = -2722014;
        }
        textView3.setTextColor(i12);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, i7.f6.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new e9((org.telegram.ui.ActionBar.c6) null);
        t9 t9Var2 = new t9(context);
        this.f9533n = t9Var2;
        t9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        t9Var2.setVisibility(8);
        FrameLayout.LayoutParams d10 = i7.f6.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.f9534r = d10;
        frameLayout.addView(t9Var2, d10);
        this.f9535s = i7.f6.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
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
        frameLayout2.addView(imageView, i7.f6.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, i7.f6.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView2 = new ImageView(context);
        this.f9536w = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_14);
        imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        imageView2.setVisibility(8);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView2, i7.f6.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.f9537x = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, i7.f6.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        z1Var.setImportantForAccessibility(2);
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

    public final void a(h70 h70Var, Canvas canvas, float f9, float f10, float f11) {
        float f12;
        Rect rect;
        float f13;
        float f14;
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f9 / 2.0f, f10 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        if (uniqueStarGift != null) {
            f12 = AndroidUtilities.dp(63.0f) * f11;
        } else {
            f12 = 0.0f;
        }
        v1 v1Var = this.f9528e;
        v1Var.setBounds(0, 0, (int) f9, (int) f10);
        v1Var.b(canvas2, f11);
        v1Var.getPadding(this.M);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(120.0f), f11);
        t9 t9Var = this.f9538y;
        float f15 = f10 - f12;
        t9Var.getImageReceiver().setImageCoords((f9 - lerp) / 2.0f, (f15 - lerp) / 2.0f, lerp, lerp);
        t9Var.getImageReceiver().draw(canvas2);
        if (t9Var.getImageReceiver().isLottieRunning()) {
            h70Var.invalidate();
        }
        cg.t1 t1Var = this.B;
        if (t1Var.getVisibility() == 0 && t1Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate((f9 - t1Var.getMeasuredWidth()) / 2.0f, AndroidUtilities.lerp(t1Var.getY(), (f15 - t1Var.getMeasuredHeight()) / 2.0f, f11));
            f13 = 1.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, t1Var.getWidth(), t1Var.getHeight(), (int) (t1Var.getAlpha() * (1.0f - f11) * 255.0f), 31);
            t1Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        } else {
            f13 = 1.0f;
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
        t9 t9Var2 = this.f9533n;
        if (t9Var2.getVisibility() == 0 && t9Var2.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top);
            t9Var2.draw(canvas2);
            canvas2.restore();
        }
        z1 z1Var = this.f9530f;
        if (z1Var.getVisibility() == 0 && z1Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(f9 - AndroidUtilities.dp(f13), AndroidUtilities.dp(2.0f));
            f14 = 1.0f;
            float lerp2 = AndroidUtilities.lerp(1.0f, 1.25f, f11);
            canvas2.scale(lerp2, lerp2);
            canvas2.translate(-z1Var.getWidth(), 0.0f);
            z1Var.draw(canvas2);
            canvas2.restore();
        } else {
            f14 = 1.0f;
        }
        if (uniqueStarGift != null) {
            if (this.K == null) {
                this.K = new zz0(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
            }
            if (this.L == null) {
                this.L = new zz0(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f, null);
            }
            zz0 zz0Var = this.K;
            zz0Var.f35473p = f9 - AndroidUtilities.dp(8.0f);
            float f16 = f14 - f11;
            zz0Var.c((f9 - this.K.l()) / 2.0f, ((f10 - AndroidUtilities.dp(40.0f)) - (this.K.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), f11, -1, canvas);
            zz0 zz0Var2 = this.L;
            zz0Var2.f35473p = f9 - AndroidUtilities.dp(8.0f);
            zz0Var2.c((f9 - this.L.l()) / 2.0f, ((f10 - AndroidUtilities.dp(19.0f)) - (this.L.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), 0.6f * f11, -1, canvas);
            canvas2 = canvas;
        }
        bg.x2 x2Var = this.F;
        if (x2Var != null && x2Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(x2Var.getX(), x2Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, x2Var.getWidth(), x2Var.getHeight(), (int) (x2Var.getAlpha() * (f14 - f11) * 255.0f), 31);
            x2Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        ImageView imageView = this.f9536w;
        if (imageView != null && imageView.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(imageView.getX(), imageView.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight(), (int) (imageView.getAlpha() * (f14 - f11) * 255.0f), 31);
            imageView.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f9532g0 == null) {
            hp hpVar = new hp(getContext(), 21, null);
            this.f9532g0 = hpVar;
            hpVar.b(-1, g6.f23062d6, g6.f23190k7);
            this.f9532g0.setDrawUnchecked(false);
            this.d.addView(this.f9532g0, i7.f6.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.f9533n.setVisibility(8);
        this.f9532g0.a(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        int i10;
        float f9;
        TL_stars.SavedStarGift savedStarGift;
        float f10;
        if (this.N == z10) {
            return;
        }
        this.N = z10;
        float f11 = 0.0f;
        boolean z12 = false;
        float f12 = 0.3f;
        FrameLayout frameLayout = this.v;
        if (z11) {
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate = frameLayout.animate();
            if (z10) {
                f11 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.3f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (z10) {
                f12 = 1.0f;
            }
            scaleX.scaleY(f12).withEndAction(new w1(this, z10, 1)).start();
        } else {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            frameLayout.setVisibility(i10);
            if (z10) {
                f11 = 1.0f;
            }
            frameLayout.setAlpha(f11);
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.3f;
            }
            frameLayout.setScaleX(f9);
            if (z10) {
                f12 = 1.0f;
            }
            frameLayout.setScaleY(f12);
        }
        if (!this.N && this.P && !this.f9524b0 && (savedStarGift = this.V) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
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
        if (!this.N && z10 && !this.f9524b0 && (savedStarGift = this.V) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
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
            this.f9525c.a(canvas, e10);
        }
        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(boolean z10, boolean z11) {
        float f9;
        float f10;
        this.f9528e.f(z10, z11);
        float f11 = 0.0f;
        ImageView imageView = this.f9536w;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z10) {
                f10 = AndroidUtilities.dp(6.0f);
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator translationX = animate.translationX(f10);
            if (z10) {
                f11 = AndroidUtilities.dp(6.0f);
            }
            translationX.translationY(f11).setDuration(320L).setInterpolator(jr.h).start();
            return;
        }
        imageView.animate().cancel();
        if (z10) {
            f9 = AndroidUtilities.dp(6.0f);
        } else {
            f9 = 0.0f;
        }
        imageView.setTranslationX(f9);
        if (z10) {
            f11 = AndroidUtilities.dp(6.0f);
        }
        imageView.setTranslationY(f11);
    }

    public final void f(boolean z10, boolean z11) {
        float f9;
        float f10;
        if (this.O == z10) {
            return;
        }
        this.O = z10;
        float f11 = 0.0f;
        int i10 = 0;
        float f12 = 0.3f;
        cg.t1 t1Var = this.C;
        if (z11) {
            t1Var.setVisibility(0);
            ViewPropertyAnimator animate = t1Var.animate();
            if (z10) {
                f11 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.3f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (z10) {
                f12 = 1.0f;
            }
            scaleX.scaleY(f12).withEndAction(new w1(this, z10, 0)).start();
            return;
        }
        if (!z10) {
            i10 = 8;
        }
        t1Var.setVisibility(i10);
        if (z10) {
            f11 = 1.0f;
        }
        t1Var.setAlpha(f11);
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.3f;
        }
        t1Var.setScaleX(f9);
        if (z10) {
            f12 = 1.0f;
        }
        t1Var.setScaleY(f12);
    }

    public final void g(org.telegram.tgnet.tl.TL_stars.StarGift r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: ih.y1.g(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean, boolean):void");
    }

    public TL_stars.StarGift getGift() {
        return this.S;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.S;
        if (starGift != null) {
            return starGift.f22619id;
        }
        return 0L;
    }

    public cg.n getPremiumTier() {
        return this.R;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.V;
    }

    public final boolean h(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        Integer num;
        Integer num2;
        int i10;
        float f9;
        float f10;
        int i11;
        long j10;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        int i14;
        boolean z14;
        boolean z15;
        float f11;
        float f12;
        k8 k8Var = this.J;
        if (k8Var != null) {
            k8Var.run();
            this.J = null;
        }
        i(savedStarGift, savedStarGift.gift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) s7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        v1 v1Var = this.f9528e;
        v1Var.d(stargiftattributebackdrop);
        v1Var.e((TL_stars.starGiftAttributePattern) s7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        v1Var.g(null);
        this.D.setVisibility(8);
        this.E.setVisibility(8);
        t9 t9Var = this.f9538y;
        t9Var.setTranslationY(0.0f);
        cg.t1 t1Var = this.B;
        t1Var.D = true;
        t1Var.E = false;
        t1Var.invalidate();
        if (stargiftattributebackdrop != null) {
            num = Integer.valueOf(g6.l1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num = null;
        }
        t1Var.setBlendWithColor(num);
        cg.t1 t1Var2 = this.C;
        t1Var2.D = true;
        t1Var2.E = false;
        t1Var2.invalidate();
        if (stargiftattributebackdrop != null) {
            num2 = Integer.valueOf(g6.l1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num2 = null;
        }
        t1Var2.setBlendWithColor(num2);
        if (savedStarGift.gift.resale_ton_only) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.f9536w;
        imageView.setVisibility(i10);
        FrameLayout frameLayout = this.v;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(g6.K(AndroidUtilities.dp(20.0f), g6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            frameLayout.setBackground(g6.K(AndroidUtilities.dp(20.0f), g6.v0(g6.Oh, this.f9523b)));
        }
        FrameLayout.LayoutParams layoutParams = this.A;
        layoutParams.gravity = 17;
        t9Var.setLayoutParams(layoutParams);
        float f13 = 0.4f;
        if (this.f9531f0 == savedStarGift) {
            t1Var.setVisibility(0);
            ViewPropertyAnimator animate = t1Var.animate();
            if (savedStarGift.unsaved) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (savedStarGift.unsaved) {
                f12 = 1.0f;
            } else {
                f12 = 0.4f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (savedStarGift.unsaved) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).setDuration(350L).setInterpolator(jr.h).withEndAction(new ef.c(20, this, savedStarGift)).start();
        } else {
            if (savedStarGift.unsaved) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            t1Var.setAlpha(f9);
            if (savedStarGift.unsaved) {
                f10 = 1.0f;
            } else {
                f10 = 0.4f;
            }
            t1Var.setScaleX(f10);
            if (savedStarGift.unsaved) {
                f13 = 1.0f;
            }
            t1Var.setScaleY(f13);
            if (savedStarGift.unsaved) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            t1Var.setVisibility(i11);
        }
        boolean z16 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        t9 t9Var2 = this.f9533n;
        t9Var2.setColorFilter(null);
        t9Var2.setLayoutParams(this.f9534r);
        int i15 = this.f9521a;
        if (z16 && savedStarGift.name_hidden) {
            t9Var2.setVisibility(8);
            j10 = 0;
        } else if (savedStarGift.name_hidden) {
            t9Var2.setVisibility(0);
            jq a2 = da.a(44, "anonymous");
            j10 = 0;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.f29787e = dp;
            a2.f29788f = dp2;
            t9Var2.setImageDrawable(a2);
        } else {
            j10 = 0;
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            e9 e9Var = this.h;
            if (peerDialogId > 0) {
                TLRPC.User user = MessagesController.getInstance(i15).getUser(Long.valueOf(peerDialogId));
                if (user != null) {
                    t9Var2.setVisibility(0);
                    e9Var.r(user);
                    t9Var2.e(user, e9Var);
                } else {
                    t9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-peerDialogId));
                if (chat != null) {
                    t9Var2.setVisibility(0);
                    e9Var.q(chat);
                    t9Var2.e(chat, e9Var);
                } else {
                    t9Var2.setVisibility(8);
                }
            }
        }
        cg.h0 h0Var = this.G;
        bg.x2 x2Var = this.F;
        TextView textView = this.H;
        if (stargiftattributebackdrop != null && savedStarGift.gift.resell_amount != null) {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams2 = this.A;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            iq[] iqVarArr = new iq[1];
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift.resale_ton_only && DialogObject.getPeerDialogId(starGift.owner_id) == UserConfig.getInstance(i15).getClientUserId()) {
                z12 = true;
                textView.setText(ia.U0(true, "XTR " + ((Object) ia.J0(savedStarGift.gift.getResellAmount(kf.b.f13636b).o(), 1.0f, ',')), 0.95f, iqVarArr, 0.0f, 1.0f));
            } else {
                z12 = true;
                textView.setText(ia.R0("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, iqVarArr));
            }
            iq iqVar = iqVarArr[0];
            if (iqVar != null) {
                iqVar.translate(0.0f, AndroidUtilities.dp(0.5f));
            }
            int v = g6.v(stargiftattributebackdrop.center_color | (-16777216), g6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            h0Var.setBackground(new d2(1895825407, v));
            textView.setTextColor(-1);
            imageView.setBackground(g6.b0(AndroidUtilities.dp(10.0f), v));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) x2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) x2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(79.0f);
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
                textView.setText(ia.X0(false, j7.l1.m(Math.max(j11, j12), ',', sb2), 0.66f, null));
            }
            if (z13) {
                i12 = -1;
            } else if (g6.I.q()) {
                i12 = -1333971;
            } else {
                i12 = -4229632;
            }
            textView.setTextColor(i12);
            int i16 = 1088989954;
            if (z13) {
                i13 = 1090519039;
            } else if (g6.I.q()) {
                i13 = 518759725;
            } else {
                i13 = 1088989954;
            }
            h0Var.setBackground(new d2(i13));
            int dp3 = AndroidUtilities.dp(10.0f);
            if (z13) {
                i16 = 1090519039;
            } else if (g6.I.q()) {
                i16 = 518759725;
            }
            imageView.setBackground(g6.b0(dp3, i16));
            if (z13) {
                i14 = -1;
            } else if (g6.I.q()) {
                i14 = -1333971;
            } else {
                i14 = -4229632;
            }
            imageView.setColorFilter(i14);
            ((FrameLayout.LayoutParams) x2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) x2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        }
        this.I.setVisibility(8);
        this.f9531f0 = savedStarGift;
        this.f9527d0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.V;
        this.R = null;
        this.S = null;
        this.U = false;
        this.V = savedStarGift;
        this.W = false;
        this.f9522a0 = false;
        this.f9524b0 = z11;
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
        t9 t9Var = this.f9538y;
        if (document == null) {
            t9Var.b();
            this.f9529e0 = null;
        } else if (this.f9529e0 == document) {
        } else {
            this.f9529e0 = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            t9Var.l(ImageLocation.getForDocument(document), "80_80_nolimit_pcache", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80_nolimit_pcache", DocumentObject.getSvgThumb(document, g6.f23009a7, 0.3f), tLObject);
        }
    }

    public final void j() {
        TL_stars.SavedStarGift savedStarGift = this.V;
        org.telegram.ui.ActionBar.c6 c6Var = this.f9523b;
        z1 z1Var = this.f9530f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                z1Var.setVisibility(0);
                if (this.V.gift.resell_amount != null) {
                    int v = g6.v(g6.v0(g6.f23062d6, c6Var), g6.l1(0.04f, g6.v0(g6.G6, c6Var)));
                    z1Var.setColor(g6.v0(g6.uj, c6Var));
                    z1Var.setStrokeColor(v);
                    z1Var.setBackdrop(null);
                    z1Var.b(LocaleController.getString(R.string.Gift2OnSale), false);
                    return;
                }
                z1Var.setColor(g6.v0(g6.Li, c6Var));
                z1Var.setStrokeColor(0);
                z1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) s7.l(this.V.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                z1Var.b(j7.l1.m(this.V.gift.num, ',', new StringBuilder("#")), true);
                return;
            } else if (starGift.limited) {
                z1Var.setVisibility(0);
                z1Var.setColor(g6.v0(g6.Li, c6Var));
                z1Var.setStrokeColor(0);
                z1Var.setBackdrop(null);
                z1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.V.gift.availability_total, 0)), true);
                return;
            } else {
                z1Var.setBackdrop(null);
                z1Var.setVisibility(8);
                return;
            }
        }
        TL_stars.StarGift starGift2 = this.S;
        if (starGift2 != null) {
            if (!this.f9522a0 && !this.f9526c0) {
                if (this.W && starGift2.availability_resale > 0) {
                    z1Var.setVisibility(0);
                    z1Var.setColor(g6.v0(g6.uj, c6Var));
                    z1Var.setStrokeColor(0);
                    z1Var.setBackdrop(null);
                    z1Var.b(LocaleController.getString(R.string.Gift2Resale), false);
                    return;
                } else if (this.U) {
                    z1Var.setVisibility(0);
                    z1Var.setColor(g6.v0(g6.Li, c6Var));
                    z1Var.setStrokeColor(0);
                    z1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) s7.l(this.S.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    z1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.S.availability_issued, 0)), true);
                    return;
                } else {
                    boolean z10 = starGift2.limited;
                    if (z10 && starGift2.availability_remains <= 0) {
                        z1Var.setVisibility(0);
                        z1Var.setColor(g6.v0(g6.Mi, c6Var));
                        z1Var.setStrokeColor(0);
                        z1Var.setBackdrop(null);
                        z1Var.b(LocaleController.getString(R.string.Gift2SoldOut), true);
                        return;
                    } else if (starGift2.auction) {
                        z1Var.setVisibility(0);
                        z1Var.setBackdrop(null);
                        z1Var.a(-2650077, -4227818);
                        z1Var.setStrokeColor(0);
                        if (this.S.auction_start_date > ConnectionsManager.getInstance(this.f9521a).getCurrentTime()) {
                            z1Var.b(LocaleController.getString(R.string.Gift2LimitedAuctionSoon), true);
                            return;
                        } else {
                            z1Var.b(LocaleController.getString(R.string.Gift2LimitedAuction), true);
                            return;
                        }
                    } else if (starGift2.require_premium) {
                        z1Var.setVisibility(0);
                        z1Var.setBackdrop(null);
                        z1Var.a(-2650077, -4227818);
                        z1Var.setStrokeColor(0);
                        z1Var.b(LocaleController.getString(R.string.Gift2LimitedPremium), true);
                        return;
                    } else if (z10) {
                        z1Var.setVisibility(0);
                        z1Var.setColor(g6.v0(g6.Li, c6Var));
                        z1Var.setStrokeColor(0);
                        z1Var.setBackdrop(null);
                        z1Var.b(LocaleController.getString(R.string.Gift2LimitedRibbon), true);
                        return;
                    } else {
                        z1Var.setBackdrop(null);
                        z1Var.setStrokeColor(0);
                        z1Var.setVisibility(8);
                        return;
                    }
                }
            }
            z1Var.setVisibility(0);
            z1Var.setColor(g6.v0(g6.Li, c6Var));
            z1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) s7.l(this.S.attributes, TL_stars.starGiftAttributeBackdrop.class));
            z1Var.setStrokeColor(0);
            z1Var.b(j7.l1.m(this.S.num, ',', new StringBuilder("#")), true);
            return;
        }
        cg.n nVar = this.R;
        if (nVar != null) {
            if (nVar.b() > 0) {
                z1Var.setVisibility(0);
                z1Var.setBackdrop(null);
                z1Var.a(-2535425, -8229377);
                z1Var.setStrokeColor(0);
                String formatString = LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(this.R.b()));
                z1Var.f9558b = formatString;
                z1Var.f9557a.e(12, formatString, true);
                return;
            }
            z1Var.setVisibility(8);
            z1Var.setBackdrop(null);
            z1Var.setStrokeColor(0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: ih.y1.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public void setImageLayer(int i10) {
        this.f9538y.setLayerNum(i10);
    }

    public void setImageSize(int i10) {
        FrameLayout.LayoutParams layoutParams = this.A;
        layoutParams.width = i10;
        layoutParams.height = i10;
    }

    public void setRibbonColor(int i10) {
        z1 z1Var = this.f9530f;
        z1Var.setColor(i10);
        z1Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f9530f.b(str, true);
    }

    public void setRibbonTextOneOf(int i10) {
        z1 z1Var = this.f9530f;
        z1Var.setVisibility(0);
        z1Var.setColor(g6.v0(g6.Li, this.f9523b));
        z1Var.setStrokeColor(0);
        z1Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) s7.l(this.S.attributes, TL_stars.starGiftAttributeBackdrop.class));
        z1Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(i10, 0)), true);
    }
}
