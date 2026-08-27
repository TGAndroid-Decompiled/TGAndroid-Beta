package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import hh.ja;
import hh.n8;
import hh.oa;
import hh.u7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.z60;

public class b2 extends FrameLayout {

    public static final int[] f7150h0 = {-2781403, -3635939};
    public FrameLayout.LayoutParams A;
    public final ag.k2 B;
    public final ag.k2 C;
    public final TextView D;
    public final TextView E;
    public final ag.p1 F;
    public final ag.s0 G;
    public final TextView H;
    public final TextView I;
    public n8 J;
    public pz0 K;
    public pz0 L;
    public final Rect M;
    public boolean N;
    public boolean O;
    public boolean P;
    public final org.telegram.ui.Components.y5 Q;
    public ag.p R;
    public TL_stars.StarGift S;
    public boolean T;
    public boolean U;
    public TL_stars.SavedStarGift V;
    public boolean W;

    public final int f7151a;

    public boolean f7152a0;

    public final org.telegram.ui.ActionBar.c6 f7153b;

    public boolean f7154b0;

    public final io0 f7155c;

    public boolean f7156c0;
    public final FrameLayout d;

    public ag.p f7157d0;

    public final y1 f7158e;

    public TLRPC.Document f7159e0;

    public final c2 f7160f;

    public TL_stars.SavedStarGift f7161f0;

    public bp f7162g0;
    public final y8 h;

    public final n9 f7163n;

    public final FrameLayout.LayoutParams f7164r;

    public final FrameLayout.LayoutParams f7165s;
    public final FrameLayout v;

    public final ImageView f7166w;

    public final TextView f7167x;

    public final n9 f7168y;

    public b2(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.M = new Rect();
        this.Q = new org.telegram.ui.Components.y5(this, 0L, 320L, er.h);
        this.f7151a = i10;
        this.f7153b = c6Var;
        h7.b6.b(this, 0.04f, 1.5f);
        this.f7155c = new io0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        y1 y1Var = new y1(frameLayout, c6Var, true);
        this.f7158e = y1Var;
        frameLayout.setBackground(y1Var);
        addView(frameLayout, h7.z5.e(-1, -1, 119));
        c2 c2Var = new c2(context);
        this.f7160f = c2Var;
        addView(c2Var, h7.z5.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        n9 n9Var = new n9(context);
        this.f7168y = n9Var;
        n9Var.getImageReceiver().setAutoRepeat(0);
        FrameLayout.LayoutParams layoutParamsD = h7.z5.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.A = layoutParamsD;
        frameLayout.addView(n9Var, layoutParamsD);
        ag.k2 k2Var = new ag.k2(context, 3, c6Var);
        this.B = k2Var;
        k2Var.setImageReceiver(n9Var.getImageReceiver());
        frameLayout.addView(k2Var, h7.z5.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        ag.k2 k2Var2 = new ag.k2(context, 4, c6Var);
        this.C = k2Var2;
        k2Var2.setImageReceiver(n9Var.getImageReceiver());
        frameLayout.addView(k2Var2, h7.z5.e(44, 44, 17));
        k2Var2.setAlpha(0.0f);
        k2Var2.setScaleX(0.3f);
        k2Var2.setScaleY(0.3f);
        k2Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.D = textView;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView.setGravity(17);
        pa.m(14.0f, 1, textView);
        TextView textViewH = pa.h(frameLayout, textView, h7.z5.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.E = textViewH;
        textViewH.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textViewH.setGravity(17);
        textViewH.setTextSize(1, 12.0f);
        frameLayout.addView(textViewH, h7.z5.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        ag.p1 p1Var = new ag.p1(this, context, 3);
        this.F = p1Var;
        TextView textView2 = new TextView(context);
        this.H = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(p1Var, h7.z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        ag.s0 s0Var = new ag.s0(context, 1);
        this.G = s0Var;
        s0Var.setBackgroundColor(-16776961);
        p1Var.addView(s0Var, h7.z5.c(0.0f, 0));
        p1Var.addView(textView2, h7.z5.e(-2, 26, 17));
        s0Var.setBackground(new g2(org.telegram.ui.ActionBar.g6.I.q() ? 518759725 : 1088989954));
        TextView textView3 = new TextView(context);
        this.I = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.I.q() ? -1333971 : -2722014);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, h7.z5.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new y8((org.telegram.ui.ActionBar.c6) null);
        n9 n9Var2 = new n9(context);
        this.f7163n = n9Var2;
        n9Var2.setRoundRadius(AndroidUtilities.dp(20.0f));
        n9Var2.setVisibility(8);
        FrameLayout.LayoutParams layoutParamsD2 = h7.z5.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.f7164r = layoutParamsD2;
        frameLayout.addView(n9Var2, layoutParamsD2);
        this.f7165s = h7.z5.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
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
        frameLayout2.addView(imageView, h7.z5.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, h7.z5.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView2 = new ImageView(context);
        this.f7166w = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_14);
        imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        imageView2.setVisibility(8);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView2, h7.z5.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.f7167x = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, h7.z5.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        c2Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.V;
        if (savedStarGift == null) {
            return null;
        }
        TL_stars.StarGift starGift = savedStarGift.gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) starGift;
        }
        return null;
    }

    public final void a(z60 z60Var, Canvas canvas, float f10, float f11, float f12) {
        float f13;
        float f14;
        Canvas canvas2 = canvas;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f10 / 2.0f, f11 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        float fDp = uniqueStarGift != null ? AndroidUtilities.dp(63.0f) * f12 : 0.0f;
        y1 y1Var = this.f7158e;
        y1Var.setBounds(0, 0, (int) f10, (int) f11);
        y1Var.b(canvas2, f12);
        Rect rect = this.M;
        y1Var.getPadding(rect);
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(120.0f), f12);
        n9 n9Var = this.f7168y;
        float f15 = f11 - fDp;
        n9Var.getImageReceiver().setImageCoords((f10 - fLerp) / 2.0f, (f15 - fLerp) / 2.0f, fLerp, fLerp);
        n9Var.getImageReceiver().draw(canvas2);
        if (n9Var.getImageReceiver().isLottieRunning()) {
            z60Var.invalidate();
        }
        ag.k2 k2Var = this.B;
        if (k2Var.getVisibility() != 0 || k2Var.getAlpha() <= 0.0f) {
            f13 = 1.0f;
        } else {
            canvas2.save();
            canvas2.translate((f10 - k2Var.getMeasuredWidth()) / 2.0f, AndroidUtilities.lerp(k2Var.getY(), (f15 - k2Var.getMeasuredHeight()) / 2.0f, f12));
            f13 = 1.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, k2Var.getWidth(), k2Var.getHeight(), (int) (k2Var.getAlpha() * (1.0f - f12) * 255.0f), 31);
            k2Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
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
        n9 n9Var2 = this.f7163n;
        if (n9Var2.getVisibility() == 0 && n9Var2.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top);
            n9Var2.draw(canvas2);
            canvas2.restore();
        }
        c2 c2Var = this.f7160f;
        if (c2Var.getVisibility() != 0 || c2Var.getAlpha() <= 0.0f) {
            f14 = 1.0f;
        } else {
            canvas2.save();
            canvas2.translate(f10 - AndroidUtilities.dp(f13), AndroidUtilities.dp(2.0f));
            f14 = 1.0f;
            float fLerp2 = AndroidUtilities.lerp(1.0f, 1.25f, f12);
            canvas2.scale(fLerp2, fLerp2);
            canvas2.translate(-c2Var.getWidth(), 0.0f);
            c2Var.draw(canvas2);
            canvas2.restore();
        }
        if (uniqueStarGift != null) {
            if (this.K == null) {
                this.K = new pz0(uniqueStarGift.title, 20.0f, AndroidUtilities.bold());
            }
            if (this.L == null) {
                this.L = new pz0(LocaleController.formatPluralStringComma("Gift2CollectionNumber", uniqueStarGift.num), 13.0f, null);
            }
            pz0 pz0Var = this.K;
            pz0Var.f31708p = f10 - AndroidUtilities.dp(8.0f);
            float f16 = f14 - f12;
            pz0Var.c((f10 - this.K.l()) / 2.0f, ((f11 - AndroidUtilities.dp(40.0f)) - (this.K.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), f12, -1, canvas);
            pz0 pz0Var2 = this.L;
            pz0Var2.f31708p = f10 - AndroidUtilities.dp(8.0f);
            pz0Var2.c((f10 - this.L.l()) / 2.0f, ((f11 - AndroidUtilities.dp(19.0f)) - (this.L.j() / 2.0f)) + (AndroidUtilities.dp(50.0f) * f16), 0.6f * f12, -1, canvas);
            canvas2 = canvas;
        }
        ag.p1 p1Var = this.F;
        if (p1Var != null && p1Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(p1Var.getX(), p1Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, p1Var.getWidth(), p1Var.getHeight(), (int) (p1Var.getAlpha() * (f14 - f12) * 255.0f), 31);
            p1Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        ImageView imageView = this.f7166w;
        if (imageView != null && imageView.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(imageView.getX(), imageView.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight(), (int) (imageView.getAlpha() * (f14 - f12) * 255.0f), 31);
            imageView.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f7162g0 == null) {
            bp bpVar = new bp(getContext(), 21, null);
            this.f7162g0 = bpVar;
            bpVar.b(-1, org.telegram.ui.ActionBar.g6.f23053d6, org.telegram.ui.ActionBar.g6.f23182k7);
            this.f7162g0.setDrawUnchecked(false);
            this.d.addView(this.f7162g0, h7.z5.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.f7163n.setVisibility(8);
        this.f7162g0.a(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        TL_stars.SavedStarGift savedStarGift;
        if (this.N == z10) {
            return;
        }
        this.N = z10;
        boolean z12 = false;
        FrameLayout frameLayout = this.v;
        if (z11) {
            frameLayout.setVisibility(0);
            frameLayout.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.3f).scaleY(z10 ? 1.0f : 0.3f).withEndAction(new z1(this, z10, 1)).start();
        } else {
            frameLayout.setVisibility(z10 ? 0 : 8);
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
            frameLayout.setScaleX(z10 ? 1.0f : 0.3f);
            frameLayout.setScaleY(z10 ? 1.0f : 0.3f);
        }
        if (!this.N && this.P && !this.f7154b0 && (savedStarGift = this.V) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z12 = true;
        }
        f(z12, z11);
        j();
    }

    public final void d(boolean z10, boolean z11) {
        TL_stars.SavedStarGift savedStarGift;
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        if (!z11) {
            this.Q.a(z10);
        }
        invalidate();
        f((this.N || !z10 || this.f7154b0 || (savedStarGift = this.V) == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) ? false : true, z11);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        float fE = this.Q.e(this.P);
        if (fE > 0.0f) {
            this.f7155c.a(canvas, fE);
        }
        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(boolean z10, boolean z11) {
        this.f7158e.f(z10, z11);
        ImageView imageView = this.f7166w;
        if (z11) {
            imageView.animate().translationX(z10 ? AndroidUtilities.dp(6.0f) : 0.0f).translationY(z10 ? AndroidUtilities.dp(6.0f) : 0.0f).setDuration(320L).setInterpolator(er.h).start();
            return;
        }
        imageView.animate().cancel();
        imageView.setTranslationX(z10 ? AndroidUtilities.dp(6.0f) : 0.0f);
        imageView.setTranslationY(z10 ? AndroidUtilities.dp(6.0f) : 0.0f);
    }

    public final void f(boolean z10, boolean z11) {
        if (this.O == z10) {
            return;
        }
        this.O = z10;
        ag.k2 k2Var = this.C;
        if (z11) {
            k2Var.setVisibility(0);
            k2Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.3f).scaleY(z10 ? 1.0f : 0.3f).withEndAction(new z1(this, z10, 0)).start();
        } else {
            k2Var.setVisibility(z10 ? 0 : 8);
            k2Var.setAlpha(z10 ? 1.0f : 0.0f);
            k2Var.setScaleX(z10 ? 1.0f : 0.3f);
            k2Var.setScaleY(z10 ? 1.0f : 0.3f);
        }
    }

    public final void g(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        String str;
        long j10;
        long j11;
        boolean z15;
        int i10;
        long j12;
        boolean z16;
        n8 n8Var = this.J;
        ColorFilter colorFilter = null;
        if (n8Var != null) {
            n8Var.run();
            this.J = null;
        }
        i(starGift, starGift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        y1 y1Var = this.f7158e;
        y1Var.d(stargiftattributebackdrop);
        y1Var.e((TL_stars.starGiftAttributePattern) u7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
        boolean z17 = starGift.auction;
        int[] iArr = f7150h0;
        org.telegram.ui.ActionBar.c6 c6Var = this.f7153b;
        if (!z17 || (((z16 = starGift.sold_out) && !this.T) || (z12 && starGift.availability_resale > 0))) {
            if (!starGift.require_premium || (z12 && starGift.availability_resale > 0)) {
                iArr = null;
            }
            y1Var.g(iArr);
        } else if (z16) {
            int i11 = org.telegram.ui.ActionBar.g6.Mi;
            y1Var.g(new int[]{org.telegram.ui.ActionBar.g6.v0(i11, c6Var), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)});
        } else {
            y1Var.g(iArr);
        }
        this.D.setVisibility(8);
        this.E.setVisibility(8);
        n9 n9Var = this.f7168y;
        n9Var.setTranslationY(0.0f);
        this.B.setVisibility(8);
        int i12 = starGift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.f7166w;
        imageView.setVisibility(i12);
        int i13 = z14 ? 0 : 8;
        TextView textView = this.f7167x;
        textView.setVisibility(i13);
        textView.setTranslationX(starGift.resale_ton_only ? AndroidUtilities.dp(23.0f) : 0.0f);
        textView.setTranslationY(starGift.resale_ton_only ? AndroidUtilities.dp(1.0f) : 0.0f);
        if (z14) {
            StringBuilder sb2 = new StringBuilder("+");
            int i14 = starGift.craft_chance_permille;
            sb2.append((Object) (i14 <= 0 ? "<0.1%" : nh.k.G0(i14)));
            textView.setText(sb2.toString());
        }
        FrameLayout.LayoutParams layoutParams = this.A;
        layoutParams.gravity = 49;
        n9Var.setLayoutParams(layoutParams);
        int i15 = this.f7151a;
        n9 n9Var2 = this.f7163n;
        if (z13) {
            n9Var2.setColorFilter(colorFilter);
            n9Var2.setVisibility(8);
        } else if ((!z12 || starGift.availability_resale <= 0) && starGift.locked_until_date > ConnectionsManager.getInstance(i15).getCurrentTime()) {
            n9Var2.setVisibility(0);
            n9Var2.setLayoutParams(this.f7165s);
            n9Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, c6Var), PorterDuff.Mode.SRC_IN));
            n9Var2.setImageResource(R.drawable.mini_gift_lock);
        } else {
            colorFilter = null;
            n9Var2.setColorFilter(colorFilter);
            n9Var2.setVisibility(8);
        }
        int i16 = (!z14 || z13) ? 0 : 8;
        TextView textView2 = this.H;
        textView2.setVisibility(i16);
        textView2.setTextSize(1, 12.0f);
        ag.s0 s0Var = this.G;
        if (z10) {
            textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView2.setText(LocaleController.getString(R.string.Gift2TransferMine));
            int iV = stargiftattributebackdrop != null ? org.telegram.ui.ActionBar.g6.v(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.g6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 1090519039;
            int iDp = AndroidUtilities.dp(13.0f);
            int iV2 = org.telegram.ui.ActionBar.g6.v(iV, 822083583);
            int i17 = iV;
            s0Var.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, i17, iV2, iV2));
            textView2.setTextColor(-1);
            imageView.setColorFilter(-1);
            int iDp2 = AndroidUtilities.dp(10.0f);
            int iV3 = org.telegram.ui.ActionBar.g6.v(i17, 822083583);
            imageView.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp2, iDp2, iDp2, iDp2, i17, iV3, iV3));
        } else if (z13) {
            textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            long resellStars = starGift.getResellStars();
            int iV4 = org.telegram.ui.ActionBar.g6.v(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.g6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            textView2.setText(oa.Q0("XTR " + LocaleController.formatNumber(resellStars, ',')));
            s0Var.setBackground(new g2(1895825407, iV4));
            textView2.setTextColor(-1);
            imageView.setColorFilter(-1);
            imageView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(10.0f), iV4));
            textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(9.0f), iV4));
        } else {
            textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            if (z12) {
                long j13 = starGift.availability_resale;
                if (j13 > 0) {
                    str = "+";
                    long j14 = starGift.resell_min_stars;
                    if (j13 > 1) {
                        j12 = j14;
                        if (j12 < MessagesController.getInstance(i15).config.starsStarGiftResaleAmountMax.get()) {
                            j11 = j12;
                            z15 = true;
                        }
                    } else {
                        j12 = j14;
                    }
                    j11 = j12;
                } else {
                    str = "+";
                    long j15 = starGift.stars;
                    if (z11 || !starGift.can_upgrade) {
                        j10 = 0;
                    } else {
                        j10 = starGift.upgrade_stars;
                    }
                    j11 = j15 + j10;
                }
                z15 = false;
            } else {
                str = "+";
                long j16 = starGift.stars;
                if (z11) {
                    j10 = 0;
                } else {
                    j10 = 0;
                }
                j11 = j16 + j10;
                z15 = false;
            }
            if (starGift.auction && starGift.availability_resale == 0) {
                textView2.setText(LocaleController.getString(starGift.sold_out ? R.string.Gift2AuctionPriceView : R.string.Gift2AuctionPriceJoin));
            } else {
                StringBuilder sb3 = new StringBuilder("XTR ");
                sb3.append(LocaleController.formatNumber(j11, ','));
                sb3.append(z15 ? str : "");
                textView2.setText(oa.X0(false, sb3.toString(), 0.71f, null));
            }
            boolean z18 = starGift instanceof TL_stars.TL_starGiftUnique;
            int i18 = 518759725;
            if (z18) {
                i10 = 1090519039;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.I.q() ? 518759725 : 1088989954;
            }
            s0Var.setBackground(new g2(i10));
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.I.q() ? -1333971 : -2722014);
            imageView.setColorFilter(org.telegram.ui.ActionBar.g6.I.q() ? -1333971 : -2722014);
            int iDp3 = AndroidUtilities.dp(10.0f);
            if (z18) {
                i18 = 1090519039;
            } else if (!org.telegram.ui.ActionBar.g6.I.q()) {
                i18 = 1088989954;
            }
            imageView.setBackground(org.telegram.ui.ActionBar.g6.b0(iDp3, i18));
            textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(9.0f), stargiftattributebackdrop != null ? org.telegram.ui.ActionBar.g6.v(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.g6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216))) : 0));
        }
        ag.p1 p1Var = this.F;
        ((ViewGroup.MarginLayoutParams) p1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        ((FrameLayout.LayoutParams) p1Var.getLayoutParams()).gravity = 49;
        this.I.setVisibility(8);
        this.f7157d0 = null;
        this.R = null;
        this.S = starGift;
        this.U = z10;
        this.V = null;
        this.W = z12;
        this.f7152a0 = z13;
        this.f7154b0 = false;
        this.f7156c0 = z14;
        this.K = null;
        this.L = null;
        c(false, false);
        j();
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

    public ag.p getPremiumTier() {
        return this.R;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.V;
    }

    public final boolean h(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        long j10;
        boolean z12;
        int i10;
        int i11;
        int i12;
        n8 n8Var = this.J;
        if (n8Var != null) {
            n8Var.run();
            this.J = null;
        }
        i(savedStarGift, savedStarGift.gift.getDocument());
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        y1 y1Var = this.f7158e;
        y1Var.d(stargiftattributebackdrop);
        y1Var.e((TL_stars.starGiftAttributePattern) u7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        y1Var.g(null);
        this.D.setVisibility(8);
        this.E.setVisibility(8);
        n9 n9Var = this.f7168y;
        n9Var.setTranslationY(0.0f);
        ag.k2 k2Var = this.B;
        k2Var.D = true;
        k2Var.E = false;
        k2Var.invalidate();
        k2Var.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        ag.k2 k2Var2 = this.C;
        k2Var2.D = true;
        k2Var2.E = false;
        k2Var2.invalidate();
        k2Var2.setBlendWithColor(stargiftattributebackdrop != null ? Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.75f, stargiftattributebackdrop.center_color | (-16777216))) : null);
        int i13 = savedStarGift.gift.resale_ton_only ? 0 : 8;
        ImageView imageView = this.f7166w;
        imageView.setVisibility(i13);
        FrameLayout frameLayout = this.v;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.g6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            frameLayout.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.f7153b)));
        }
        FrameLayout.LayoutParams layoutParams = this.A;
        layoutParams.gravity = 17;
        n9Var.setLayoutParams(layoutParams);
        if (this.f7161f0 == savedStarGift) {
            k2Var.setVisibility(0);
            k2Var.animate().alpha(savedStarGift.unsaved ? 1.0f : 0.0f).scaleX(savedStarGift.unsaved ? 1.0f : 0.4f).scaleY(savedStarGift.unsaved ? 1.0f : 0.4f).setDuration(350L).setInterpolator(er.h).withEndAction(new d5.u(12, this, savedStarGift)).start();
        } else {
            k2Var.setAlpha(savedStarGift.unsaved ? 1.0f : 0.0f);
            k2Var.setScaleX(savedStarGift.unsaved ? 1.0f : 0.4f);
            k2Var.setScaleY(savedStarGift.unsaved ? 1.0f : 0.4f);
            k2Var.setVisibility(savedStarGift.unsaved ? 0 : 8);
        }
        boolean z13 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        n9 n9Var2 = this.f7163n;
        n9Var2.setColorFilter(null);
        n9Var2.setLayoutParams(this.f7164r);
        int i14 = this.f7151a;
        if (z13 && savedStarGift.name_hidden) {
            n9Var2.setVisibility(8);
            j10 = 0;
        } else if (savedStarGift.name_hidden) {
            n9Var2.setVisibility(0);
            dq dqVarA = ja.a(44, "anonymous");
            j10 = 0;
            int iDp = AndroidUtilities.dp(16.0f);
            int iDp2 = AndroidUtilities.dp(16.0f);
            dqVarA.f27823e = iDp;
            dqVarA.f27824f = iDp2;
            n9Var2.setImageDrawable(dqVarA);
        } else {
            j10 = 0;
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            y8 y8Var = this.h;
            if (peerDialogId > 0) {
                TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(peerDialogId));
                if (user != null) {
                    n9Var2.setVisibility(0);
                    y8Var.r(user);
                    n9Var2.e(user, y8Var);
                } else {
                    n9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId));
                if (chat != null) {
                    n9Var2.setVisibility(0);
                    y8Var.q(chat);
                    n9Var2.e(chat, y8Var);
                } else {
                    n9Var2.setVisibility(8);
                }
            }
        }
        ag.s0 s0Var = this.G;
        ag.p1 p1Var = this.F;
        TextView textView = this.H;
        if (stargiftattributebackdrop == null || savedStarGift.gift.resell_amount == null) {
            z12 = true;
            if (z10) {
                textView.setVisibility(8);
                this.A.topMargin = AndroidUtilities.dp(12.0f);
                this.A.bottomMargin = AndroidUtilities.dp(12.0f);
            } else {
                textView.setVisibility(0);
                FrameLayout.LayoutParams layoutParams2 = this.A;
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = 0;
            }
            if (z13) {
                textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                textView.setTextSize(1, 12.0f);
                textView.setText(LocaleController.getString(R.string.Gift2PriceUnique));
            } else {
                textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
                textView.setTextSize(1, 12.0f);
                StringBuilder sb2 = new StringBuilder("XTR ");
                TL_stars.StarGift starGift = savedStarGift.gift;
                long j11 = starGift.stars;
                long j12 = savedStarGift.convert_stars;
                if (j12 <= j10) {
                    j12 = starGift.convert_stars;
                }
                textView.setText(oa.X0(false, i0.a.m(Math.max(j11, j12), ',', sb2), 0.66f, null));
            }
            if (z13 != 0) {
                i10 = -1;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.I.q() ? -1333971 : -4229632;
            }
            textView.setTextColor(i10);
            int i15 = 1088989954;
            if (z13 != 0) {
                i11 = 1090519039;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.I.q() ? 518759725 : 1088989954;
            }
            s0Var.setBackground(new g2(i11));
            int iDp3 = AndroidUtilities.dp(10.0f);
            if (z13 != 0) {
                i15 = 1090519039;
            } else if (org.telegram.ui.ActionBar.g6.I.q()) {
                i15 = 518759725;
            }
            imageView.setBackground(org.telegram.ui.ActionBar.g6.b0(iDp3, i15));
            if (z13 != 0) {
                i12 = -1;
            } else {
                i12 = org.telegram.ui.ActionBar.g6.I.q() ? -1333971 : -4229632;
            }
            imageView.setColorFilter(i12);
            ((FrameLayout.LayoutParams) p1Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) p1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(103.0f);
        } else {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams3 = this.A;
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            cq[] cqVarArr = new cq[1];
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2.resale_ton_only && DialogObject.getPeerDialogId(starGift2.owner_id) == UserConfig.getInstance(i14).getClientUserId()) {
                z12 = true;
                textView.setText(oa.U0(true, "XTR " + ((Object) oa.J0(savedStarGift.gift.getResellAmount(hf.b.f8922b).o(), 1.0f, ',')), 0.95f, cqVarArr, 0.0f, 1.0f));
            } else {
                z12 = true;
                textView.setText(oa.R0("XTR " + LocaleController.formatNumber(savedStarGift.gift.getResellStars(), ','), 0.95f, cqVarArr));
            }
            cq cqVar = cqVarArr[0];
            if (cqVar != null) {
                cqVar.translate(0.0f, AndroidUtilities.dp(0.5f));
            }
            int iV = org.telegram.ui.ActionBar.g6.v(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.g6.l1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            s0Var.setBackground(new g2(1895825407, iV));
            textView.setTextColor(-1);
            imageView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(10.0f), iV));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) p1Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) p1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(79.0f);
            z13 = z13;
        }
        this.I.setVisibility(8);
        this.f7161f0 = savedStarGift;
        this.f7157d0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.V;
        this.R = null;
        this.S = null;
        this.U = false;
        this.V = savedStarGift;
        this.W = false;
        this.f7152a0 = false;
        this.f7154b0 = z11;
        this.K = null;
        this.L = null;
        c(savedStarGift.pinned_to_top && (!z13 || savedStarGift.name_hidden), savedStarGift2 == savedStarGift);
        j();
        if (savedStarGift2 == savedStarGift) {
            return z12;
        }
        return false;
    }

    public final void i(TLObject tLObject, TLRPC.Document document) {
        n9 n9Var = this.f7168y;
        if (document == null) {
            n9Var.b();
            this.f7159e0 = null;
        } else {
            if (this.f7159e0 == document) {
                return;
            }
            this.f7159e0 = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            n9Var.l(ImageLocation.getForDocument(document), "80_80_nolimit_pcache", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "80_80_nolimit_pcache", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f22999a7, 0.3f), tLObject);
        }
    }

    public final void j() {
        TL_stars.SavedStarGift savedStarGift = this.V;
        org.telegram.ui.ActionBar.c6 c6Var = this.f7153b;
        c2 c2Var = this.f7160f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                if (!starGift.limited) {
                    c2Var.setBackdrop(null);
                    c2Var.setVisibility(8);
                    return;
                }
                c2Var.setVisibility(0);
                c2Var.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Li, c6Var));
                c2Var.setStrokeColor(0);
                c2Var.setBackdrop(null);
                c2Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.V.gift.availability_total, 0)), true);
                return;
            }
            c2Var.setVisibility(0);
            if (this.V.gift.resell_amount == null) {
                c2Var.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Li, c6Var));
                c2Var.setStrokeColor(0);
                c2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) u7.l(this.V.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                c2Var.b(i0.a.m(this.V.gift.num, ',', new StringBuilder("#")), true);
                return;
            }
            int iV = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var), org.telegram.ui.ActionBar.g6.l1(0.04f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var)));
            c2Var.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.uj, c6Var));
            c2Var.setStrokeColor(iV);
            c2Var.setBackdrop(null);
            c2Var.b(LocaleController.getString(R.string.Gift2OnSale), false);
            return;
        }
        TL_stars.StarGift starGift2 = this.S;
        if (starGift2 == null) {
            ag.p pVar = this.R;
            if (pVar != null) {
                if (pVar.b() <= 0) {
                    c2Var.setVisibility(8);
                    c2Var.setBackdrop(null);
                    c2Var.setStrokeColor(0);
                    return;
                }
                c2Var.setVisibility(0);
                c2Var.setBackdrop(null);
                c2Var.a(-2535425, -8229377);
                c2Var.setStrokeColor(0);
                String string = LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(this.R.b()));
                c2Var.f7180b = string;
                c2Var.f7179a.e(12, string, true);
                return;
            }
            return;
        }
        if (this.f7152a0 || this.f7156c0) {
            c2Var.setVisibility(0);
            c2Var.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Li, c6Var));
            c2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) u7.l(this.S.attributes, TL_stars.starGiftAttributeBackdrop.class));
            c2Var.setStrokeColor(0);
            c2Var.b(i0.a.m(this.S.num, ',', new StringBuilder("#")), true);
            return;
        }
        if (this.W && starGift2.availability_resale > 0) {
            c2Var.setVisibility(0);
            c2Var.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.uj, c6Var));
            c2Var.setStrokeColor(0);
            c2Var.setBackdrop(null);
            c2Var.b(LocaleController.getString(R.string.Gift2Resale), false);
            return;
        }
        if (this.U) {
            c2Var.setVisibility(0);
            c2Var.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Li, c6Var));
            c2Var.setStrokeColor(0);
            c2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) u7.l(this.S.attributes, TL_stars.starGiftAttributeBackdrop.class));
            c2Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(this.S.availability_issued, 0)), true);
            return;
        }
        boolean z10 = starGift2.limited;
        if (z10 && starGift2.availability_remains <= 0) {
            c2Var.setVisibility(0);
            c2Var.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Mi, c6Var));
            c2Var.setStrokeColor(0);
            c2Var.setBackdrop(null);
            c2Var.b(LocaleController.getString(R.string.Gift2SoldOut), true);
            return;
        }
        if (starGift2.auction) {
            c2Var.setVisibility(0);
            c2Var.setBackdrop(null);
            c2Var.a(-2650077, -4227818);
            c2Var.setStrokeColor(0);
            if (this.S.auction_start_date > ConnectionsManager.getInstance(this.f7151a).getCurrentTime()) {
                c2Var.b(LocaleController.getString(R.string.Gift2LimitedAuctionSoon), true);
                return;
            } else {
                c2Var.b(LocaleController.getString(R.string.Gift2LimitedAuction), true);
                return;
            }
        }
        if (starGift2.require_premium) {
            c2Var.setVisibility(0);
            c2Var.setBackdrop(null);
            c2Var.a(-2650077, -4227818);
            c2Var.setStrokeColor(0);
            c2Var.b(LocaleController.getString(R.string.Gift2LimitedPremium), true);
            return;
        }
        if (!z10) {
            c2Var.setBackdrop(null);
            c2Var.setStrokeColor(0);
            c2Var.setVisibility(8);
        } else {
            c2Var.setVisibility(0);
            c2Var.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Li, c6Var));
            c2Var.setStrokeColor(0);
            c2Var.setBackdrop(null);
            c2Var.b(LocaleController.getString(R.string.Gift2LimitedRibbon), true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence string;
        TL_stars.StarGift starGift;
        n9 n9Var;
        TextView textView;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (isEnabled()) {
            accessibilityNodeInfo.addAction(16);
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            String userName = null;
            if (this.R != null) {
                TextView textView2 = this.D;
                if (textView2 == null || textView2.getVisibility() != 0 || TextUtils.isEmpty(textView2.getText())) {
                    string = null;
                } else {
                    string = textView2.getText();
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.V;
                if (savedStarGift == null || (starGift = savedStarGift.gift) == null) {
                    TL_stars.StarGift starGift2 = this.S;
                    if (starGift2 == null || !(starGift2 instanceof TL_stars.TL_starGiftUnique) || TextUtils.isEmpty(starGift2.title)) {
                        string = null;
                    } else {
                        string = this.S.title;
                    }
                } else if (!(starGift instanceof TL_stars.TL_starGiftUnique) || TextUtils.isEmpty(starGift.title)) {
                    string = null;
                } else {
                    string = this.V.gift.title;
                }
            }
            if (TextUtils.isEmpty(string)) {
                string = LocaleController.getString(R.string.Gift2Gift);
            }
            sb2.append(string);
            TextView textView3 = this.E;
            if (textView3 != null && textView3.getVisibility() == 0 && !TextUtils.isEmpty(textView3.getText())) {
                sb2.append(", ");
                sb2.append(textView3.getText());
            }
            c2 c2Var = this.f7160f;
            if (c2Var != null && c2Var.getVisibility() == 0) {
                CharSequence text = c2Var.getText();
                if (!TextUtils.isEmpty(text)) {
                    sb2.append(", ");
                    sb2.append(text);
                }
            }
            ag.p1 p1Var = this.F;
            if (p1Var != null && p1Var.getVisibility() == 0 && (textView = this.H) != null && textView.getVisibility() == 0 && !TextUtils.isEmpty(textView.getText())) {
                sb2.append(", ");
                sb2.append(textView.getText());
            }
            TL_stars.SavedStarGift savedStarGift2 = this.V;
            if (savedStarGift2 != null && savedStarGift2.unsaved) {
                sb2.append(", ");
                sb2.append(LocaleController.getString(R.string.Gift2FilterHidden));
            }
            TL_stars.SavedStarGift savedStarGift3 = this.V;
            if (savedStarGift3 != null && !(savedStarGift3.gift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift3.name_hidden && (n9Var = this.f7163n) != null && n9Var.getVisibility() == 0) {
                long peerDialogId = DialogObject.getPeerDialogId(this.V.from_id);
                if (peerDialogId != 0) {
                    int i10 = this.f7151a;
                    if (peerDialogId > 0) {
                        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
                        if (user != null) {
                            userName = UserObject.getUserName(user);
                        }
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
                        if (chat != null) {
                            userName = chat.title;
                        }
                    }
                    if (!TextUtils.isEmpty(userName)) {
                        sb2.append(", ");
                        sb2.append((CharSequence) userName);
                    }
                }
            }
            bp bpVar = this.f7162g0;
            if (bpVar != null && bpVar.f27188a.f26309q) {
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(true);
            }
            accessibilityNodeInfo.setContentDescription(sb2.toString());
        } catch (Exception unused) {
        }
    }

    public void setImageLayer(int i10) {
        this.f7168y.setLayerNum(i10);
    }

    public void setImageSize(int i10) {
        FrameLayout.LayoutParams layoutParams = this.A;
        layoutParams.width = i10;
        layoutParams.height = i10;
    }

    public void setRibbonColor(int i10) {
        c2 c2Var = this.f7160f;
        c2Var.setColor(i10);
        c2Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f7160f.b(str, true);
    }

    public void setRibbonTextOneOf(int i10) {
        c2 c2Var = this.f7160f;
        c2Var.setVisibility(0);
        c2Var.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Li, this.f7153b));
        c2Var.setStrokeColor(0);
        c2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) u7.l(this.S.attributes, TL_stars.starGiftAttributeBackdrop.class));
        c2Var.b(LocaleController.formatString(R.string.Gift2Limited1OfRibbon, AndroidUtilities.formatWholeNumber(i10, 0)), true);
    }
}
