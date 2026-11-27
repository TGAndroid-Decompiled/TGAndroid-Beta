package defpackage;

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
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public class sx4 extends FrameLayout implements snb {
    public static final int[] w0 = {-2781403, -3635939};
    public final de0 E;
    public FrameLayout.LayoutParams F;
    public final cl8 G;
    public final cl8 H;
    public final TextView I;
    public final TextView J;
    public final zc K;
    public final tb L;
    public final TextView M;
    public final TextView N;
    public gya O;
    public boolean P;
    public float Q;
    public pkb R;
    public pkb S;
    public final Rect T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int a;
    public final mm a0;
    public final vnb b;
    public pw4 b0;
    public final sca c;
    public TL_stars.StarGift c0;
    public final FrameLayout d;
    public boolean d0;
    public final px4 e;
    public boolean e0;
    public final tx4 f;
    public TL_stars.SavedStarGift f0;
    public boolean g0;
    public final rb0 h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public pw4 k0;
    public TLRPC.Document l0;
    public TL_stars.SavedStarGift m0;
    public final de0 n;
    public og2 n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public final FrameLayout.LayoutParams r;
    public int r0;
    public final FrameLayout.LayoutParams s;
    public int[] s0;
    public byte t0;
    public boolean u0;
    public boolean v0;
    public final FrameLayout w;
    public final ImageView x;
    public final TextView y;

    public sx4(int i, vnb vnbVar, Context context) {
        super(context);
        int i2;
        int i3;
        this.Q = -1.0f;
        this.T = new Rect();
        this.a0 = new mm(this, 0L, 320L, k43.h);
        this.o0 = -1;
        this.v0 = aob.I.o();
        this.a = i;
        this.b = vnbVar;
        iye.b(this, 0.04f, 1.5f);
        this.c = new sca(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        px4 px4Var = new px4(frameLayout, vnbVar, true);
        this.e = px4Var;
        frameLayout.setBackground(px4Var);
        addView(frameLayout, tre.e(-1, -1, 119));
        tx4 tx4Var = new tx4(context);
        this.f = tx4Var;
        addView(tx4Var, tre.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        de0 de0Var = new de0(context);
        this.E = de0Var;
        de0Var.getImageReceiver().M(0);
        FrameLayout.LayoutParams d = tre.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.F = d;
        frameLayout.addView(de0Var, d);
        cl8 cl8Var = new cl8(3, vnbVar, context);
        this.G = cl8Var;
        cl8Var.setImageReceiver(de0Var.getImageReceiver());
        frameLayout.addView(cl8Var, tre.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        cl8 cl8Var2 = new cl8(4, vnbVar, context);
        this.H = cl8Var2;
        cl8Var2.setImageReceiver(de0Var.getImageReceiver());
        frameLayout.addView(cl8Var2, tre.e(44, 44, 17));
        cl8Var2.setAlpha(0.0f);
        cl8Var2.setScaleX(0.3f);
        cl8Var2.setScaleY(0.3f);
        cl8Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.I = textView;
        int i4 = aob.G6;
        yob.X(textView, i4, vnbVar);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(hl.o());
        TextView l = ik8.l(frameLayout, textView, tre.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.J = l;
        yob.X(l, i4, vnbVar);
        l.setGravity(17);
        l.setTextSize(1, 12.0f);
        frameLayout.addView(l, tre.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        zc zcVar = new zc((byte) 23, context, this);
        this.K = zcVar;
        TextView textView2 = new TextView(context);
        this.M = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(hl.o());
        textView2.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(zcVar, tre.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        tb tbVar = new tb(context, (byte) 13);
        this.L = tbVar;
        tbVar.setBackgroundColor(-16776961);
        zcVar.addView(tbVar, tre.c(0.0f, 0));
        zcVar.addView(textView2, tre.e(-2, 26, 17));
        if (aob.I.o()) {
            i2 = 518759725;
        } else {
            i2 = 1088989954;
        }
        tbVar.setBackground(new xx4(i2));
        TextView textView3 = new TextView(context);
        this.N = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        if (aob.I.o()) {
            i3 = -1333971;
        } else {
            i3 = -2722014;
        }
        textView3.setTextColor(i3);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, tre.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new rb0((vnb) null);
        de0 de0Var2 = new de0(context);
        this.n = de0Var2;
        de0Var2.setRoundRadius(hl.L(20.0f));
        de0Var2.setVisibility(8);
        FrameLayout.LayoutParams d2 = tre.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.r = d2;
        frameLayout.addView(de0Var2, d2);
        this.s = tre.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView k = qd4.k(context, 2131232206);
        k.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        k.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(k, tre.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, tre.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(2131231958);
        imageView.setPadding(0, hl.L(2.0f), 0, 0);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, tre.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.y = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(hl.o());
        textView4.setPadding(hl.L(5.0f), 0, hl.L(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, tre.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        tx4Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.f0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) starGift;
            }
            return null;
        }
        return null;
    }

    private void setRibbonColorKey(int i) {
        this.f.setColor(aob.v0(i, this.b));
        this.o0 = i;
    }

    public final void a() {
        int i;
        int i2;
        boolean o = aob.I.o();
        this.v0 = o;
        if (this.u0) {
            i = 1090519039;
        } else if (o) {
            i = 518759725;
        } else {
            i = 1088989954;
        }
        if (o) {
            i2 = -1333971;
        } else if (this.t0 == 2) {
            i2 = -4229632;
        } else {
            i2 = -2722014;
        }
        this.L.setBackground(new xx4(i));
        this.M.setTextColor(i2);
        ImageView imageView = this.x;
        imageView.setColorFilter(i2);
        imageView.setBackground(aob.b0(hl.L(10.0f), i));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Cj));
        hashSet.add(Integer.valueOf(aob.Dj));
        hashSet.add(Integer.valueOf(aob.lk));
        hashSet.add(Integer.valueOf(aob.nk));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    public void b(bu5 bu5Var, Canvas canvas, float f, float f2, float f3) {
        float f4;
        float f5;
        zc zcVar;
        float f6;
        ImageView imageView;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        float f7;
        Canvas canvas2 = canvas;
        de0 de0Var = this.n;
        de0 de0Var2 = this.E;
        px4 px4Var = this.e;
        tx4 tx4Var = this.f;
        Rect rect = this.T;
        FrameLayout frameLayout = this.w;
        ImageView imageView2 = this.x;
        zc zcVar2 = this.K;
        cl8 cl8Var = this.G;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f / 2.0f, f2 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        if (uniqueStarGift != null) {
            f4 = hl.L(63.0f) * f3;
        } else {
            f4 = 0.0f;
        }
        px4Var.setBounds(0, 0, (int) f, (int) f2);
        px4Var.b(canvas2, f3);
        px4Var.getPadding(rect);
        float U1 = hl.U1(f3, hl.L(80.0f), hl.L(120.0f));
        float f8 = f2 - f4;
        de0Var2.getImageReceiver().i0((f - U1) / 2.0f, (f8 - U1) / 2.0f, U1, U1);
        de0Var2.getImageReceiver().h(canvas2, null);
        b29 y = de0Var2.getImageReceiver().y();
        if (y != null && y.l0) {
            bu5Var.invalidate();
        }
        if (cl8Var.getVisibility() == 0 && cl8Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate((f - cl8Var.getMeasuredWidth()) / 2.0f, hl.R1(cl8Var.getY(), (f8 - cl8Var.getMeasuredHeight()) / 2.0f, f3));
            f5 = 1.0f;
            zcVar = zcVar2;
            f6 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
            canvas2.saveLayerAlpha(0.0f, 0.0f, cl8Var.getWidth(), cl8Var.getHeight(), (int) (cl8Var.getAlpha() * (1.0f - f3) * 255.0f), 31);
            cl8Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        } else {
            f5 = 1.0f;
            zcVar = zcVar2;
            f6 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
        }
        if (frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > f6) {
            canvas2.save();
            canvas2.translate(hl.L(2.0f) + rect.left, hl.L(2.0f) + rect.top);
            canvas2.saveLayerAlpha(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), (int) (frameLayout.getAlpha() * 255.0f), 31);
            frameLayout.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (de0Var.getVisibility() == 0 && de0Var.getAlpha() > f6) {
            canvas2.save();
            canvas2.translate(hl.L(2.0f) + rect.left, hl.L(2.0f) + rect.top);
            de0Var.draw(canvas2);
            canvas2.restore();
        }
        if (tx4Var.getVisibility() == 0 && tx4Var.getAlpha() > f6) {
            canvas2.save();
            canvas2.translate(f - hl.L(f5), hl.L(2.0f));
            f7 = f5;
            float R1 = hl.R1(f7, 1.25f, f3);
            canvas2.scale(R1, R1);
            canvas2.translate(-tx4Var.getWidth(), f6);
            tx4Var.draw(canvas2);
            canvas2.restore();
        } else {
            f7 = f5;
        }
        if (tL_starGiftUnique != null) {
            if (this.R == null) {
                this.R = new pkb(tL_starGiftUnique.title, 20.0f, hl.o());
            }
            if (this.S == null) {
                this.S = new pkb(ob6.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 13.0f, null);
            }
            pkb pkbVar = this.R;
            pkbVar.p = f - hl.L(8.0f);
            float f9 = f7 - f3;
            pkbVar.c((f - this.R.j()) / 2.0f, ((f2 - hl.L(40.0f)) - (this.R.h() / 2.0f)) + (hl.L(50.0f) * f9), f3, -1, canvas);
            pkb pkbVar2 = this.S;
            pkbVar2.p = f - hl.L(8.0f);
            pkbVar2.c((f - this.S.j()) / 2.0f, (hl.L(50.0f) * f9) + ((f2 - hl.L(19.0f)) - (this.S.h() / 2.0f)), 0.6f * f3, -1, canvas);
            canvas2 = canvas;
        }
        if (zcVar != null && zcVar.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(zcVar.getX(), zcVar.getY());
            canvas.saveLayerAlpha(0.0f, 0.0f, zcVar.getWidth(), zcVar.getHeight(), (int) (zcVar.getAlpha() * (f7 - f3) * 255.0f), 31);
            canvas2 = canvas;
            zcVar.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (imageView != null && imageView.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(imageView.getX(), imageView.getY());
            canvas.saveLayerAlpha(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight(), (int) (imageView.getAlpha() * (f7 - f3) * 255.0f), 31);
            canvas2 = canvas;
            imageView.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void c(boolean z, boolean z2) {
        if (this.n0 == null) {
            og2 og2Var = new og2(21, null, getContext());
            this.n0 = og2Var;
            og2Var.b(-1, aob.d6, aob.k7);
            this.n0.setDrawUnchecked(false);
            this.d.addView(this.n0, tre.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.n.setVisibility(8);
        this.n0.a(z, z2);
    }

    public final void d(boolean z, boolean z2) {
        int i;
        float f;
        TL_stars.SavedStarGift savedStarGift;
        float f2;
        if (this.U == z) {
            return;
        }
        this.U = z;
        boolean z3 = true;
        float f3 = 0.0f;
        float f4 = 0.3f;
        FrameLayout frameLayout = this.w;
        if (z2) {
            frameLayout.setVisibility(0);
            ViewPropertyAnimator animate = frameLayout.animate();
            if (z) {
                f3 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f3);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.3f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f2);
            if (z) {
                f4 = 1.0f;
            }
            scaleX.scaleY(f4).withEndAction(new qx4(this, z, (byte) 1)).start();
        } else {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            frameLayout.setVisibility(i);
            if (z) {
                f3 = 1.0f;
            }
            frameLayout.setAlpha(f3);
            if (z) {
                f = 1.0f;
            } else {
                f = 0.3f;
            }
            frameLayout.setScaleX(f);
            if (z) {
                f4 = 1.0f;
            }
            frameLayout.setScaleY(f4);
        }
        if (this.U || !this.W || this.i0 || (savedStarGift = this.f0) == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z3 = false;
        }
        g(z3, z2);
        l();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        float d = this.a0.d(this.W);
        if (d > 0.0f) {
            this.c.a(canvas, d);
        }
        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(boolean z, boolean z2) {
        boolean z3;
        TL_stars.SavedStarGift savedStarGift;
        if (this.W == z) {
            return;
        }
        this.W = z;
        if (!z2) {
            this.a0.a(z);
        }
        invalidate();
        if (!this.U && z && !this.i0 && (savedStarGift = this.f0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z3 = true;
        } else {
            z3 = false;
        }
        g(z3, z2);
    }

    public final void f(boolean z, boolean z2) {
        float f;
        float f2;
        this.e.f(z, z2);
        float f3 = 0.0f;
        ImageView imageView = this.x;
        if (z2) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z) {
                f2 = hl.L(6.0f);
            } else {
                f2 = 0.0f;
            }
            ViewPropertyAnimator translationX = animate.translationX(f2);
            if (z) {
                f3 = hl.L(6.0f);
            }
            translationX.translationY(f3).setDuration(320L).setInterpolator(k43.h).start();
            return;
        }
        imageView.animate().cancel();
        if (z) {
            f = hl.L(6.0f);
        } else {
            f = 0.0f;
        }
        imageView.setTranslationX(f);
        if (z) {
            f3 = hl.L(6.0f);
        }
        imageView.setTranslationY(f3);
    }

    public final void g(boolean z, boolean z2) {
        float f;
        float f2;
        if (this.V == z) {
            return;
        }
        this.V = z;
        float f3 = 0.0f;
        int i = 0;
        float f4 = 0.3f;
        cl8 cl8Var = this.H;
        if (z2) {
            cl8Var.setVisibility(0);
            ViewPropertyAnimator animate = cl8Var.animate();
            if (z) {
                f3 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f3);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.3f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f2);
            if (z) {
                f4 = 1.0f;
            }
            scaleX.scaleY(f4).withEndAction(new qx4(this, z, (byte) 0)).start();
            return;
        }
        if (!z) {
            i = 8;
        }
        cl8Var.setVisibility(i);
        if (z) {
            f3 = 1.0f;
        }
        cl8Var.setAlpha(f3);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3f;
        }
        cl8Var.setScaleX(f);
        if (z) {
            f4 = 1.0f;
        }
        cl8Var.setScaleY(f4);
    }

    public TL_stars.StarGift getGift() {
        return this.c0;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.c0;
        if (starGift != null) {
            return starGift.id;
        }
        return 0L;
    }

    public pw4 getPremiumTier() {
        return this.b0;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f0;
    }

    public final void h(org.telegram.tgnet.tl.TL_stars.StarGift r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sx4.h(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final boolean i(org.telegram.tgnet.tl.TL_stars.SavedStarGift r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sx4.i(org.telegram.tgnet.tl.TL_stars$SavedStarGift, boolean, boolean):boolean");
    }

    public final void j(TLRPC.Document document, TLObject tLObject) {
        de0 de0Var = this.E;
        if (document == null) {
            de0Var.b();
            this.l0 = null;
        } else if (this.l0 == document) {
        } else {
            this.l0 = document;
            TLRPC.PhotoSize w = xb4.w(document.thumbs, hl.L(100.0f), false, null, false);
            de0Var.j(jn5.b(document), "80_80_nolimit_pcache", jn5.c(w, document), "80_80_nolimit_pcache", lp3.f(document, aob.a7, 0.3f, null), tLObject);
        }
    }

    public final void k(boolean z, boolean z2, float f) {
        TL_stars.TL_starGiftUnique uniqueStarGift;
        String concat;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i;
        ColorMatrixColorFilter colorMatrixColorFilter;
        boolean z3;
        if (this.Q != f) {
            this.Q = f;
            TL_stars.TL_starGiftUnique uniqueStarGift2 = getUniqueStarGift();
            if (uniqueStarGift2 == null) {
                stargiftattributebackdrop = null;
            } else {
                stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jxa.i(uniqueStarGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
            }
            if (stargiftattributebackdrop == null) {
                i = -11184811;
            } else {
                i = stargiftattributebackdrop.pattern_color | (-16777216);
            }
            float f2 = 1.0f - f;
            if (f <= 0.0f) {
                colorMatrixColorFilter = null;
            } else {
                colorMatrixColorFilter = new ColorMatrixColorFilter(new float[]{f2, 0.0f, 0.0f, 0.0f, Color.red(i) * f, 0.0f, f2, 0.0f, 0.0f, Color.green(i) * f, 0.0f, 0.0f, f2, 0.0f, Color.blue(i) * f, 0.0f, 0.0f, 0.0f, 1.0f - (0.5686275f * f), 0.0f});
            }
            de0 de0Var = this.E;
            de0Var.setColorFilter(colorMatrixColorFilter);
            ImageReceiver imageReceiver = de0Var.getImageReceiver();
            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i2 == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            imageReceiver.v0 = z3;
            if (i2 > 0) {
                de0Var.getImageReceiver().x0();
                b29 y = de0Var.getImageReceiver().y();
                if (y != null) {
                    y.I(0, false, false);
                }
            }
            de0Var.invalidate();
        }
        if (this.P != z) {
            this.P = z;
            if (getUniqueStarGift() != null) {
                if (z) {
                    concat = ob6.M0(2131742754, null);
                } else {
                    concat = "#".concat(ob6.E(uniqueStarGift.num, ','));
                }
                tx4 tx4Var = this.f;
                if (z2) {
                    tx4Var.getClass();
                    tx4Var.b = concat;
                    tx4Var.a.h(10, concat);
                    return;
                }
                tx4Var.b(concat, true);
            }
        }
    }

    public final void l() {
        vnb vnbVar = this.b;
        tx4 tx4Var = this.f;
        TL_stars.SavedStarGift savedStarGift = this.f0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                tx4Var.setVisibility(0);
                TL_stars.StarGift starGift2 = this.f0.gift;
                if (starGift2.resell_amount != null && (!it7.n(starGift2) || uc7.s1(this.a).k4.v0.f)) {
                    int v = aob.v(aob.v0(aob.d6, vnbVar), aob.p1(0.04f, aob.v0(aob.G6, vnbVar)));
                    setRibbonColorKey(aob.lk);
                    tx4Var.setStrokeColor(v);
                    this.p0 = true;
                    tx4Var.setBackdrop(null);
                    tx4Var.b(ob6.M0(2131750047, null), false);
                    return;
                }
                setRibbonColorKey(aob.Cj);
                tx4Var.setStrokeColor(0);
                this.p0 = false;
                tx4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) jxa.i(this.f0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                tx4Var.b("#".concat(ob6.E(this.f0.gift.num, ',')), true);
                return;
            } else if (starGift.limited) {
                tx4Var.setVisibility(0);
                setRibbonColorKey(aob.Cj);
                tx4Var.setStrokeColor(0);
                this.p0 = false;
                tx4Var.setBackdrop(null);
                tx4Var.b(ob6.a0(null, null, 2131750094, hl.o0(this.f0.gift.availability_total, 0)), true);
                return;
            } else {
                tx4Var.setBackdrop(null);
                tx4Var.setVisibility(8);
                return;
            }
        }
        TL_stars.StarGift starGift3 = this.c0;
        if (starGift3 != null) {
            if (!this.h0 && !this.j0) {
                if (this.g0 && starGift3.availability_resale > 0) {
                    tx4Var.setVisibility(0);
                    setRibbonColorKey(aob.lk);
                    tx4Var.setStrokeColor(0);
                    this.p0 = false;
                    tx4Var.setBackdrop(null);
                    tx4Var.b(ob6.M0(2131749988, null), false);
                    return;
                } else if (this.e0) {
                    tx4Var.setVisibility(0);
                    setRibbonColorKey(aob.Cj);
                    tx4Var.setStrokeColor(0);
                    this.p0 = false;
                    tx4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) jxa.i(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    tx4Var.b(ob6.a0(null, null, 2131750094, hl.o0(this.c0.availability_issued, 0)), true);
                    return;
                } else {
                    boolean z = starGift3.limited;
                    if (z && starGift3.availability_remains <= 0) {
                        tx4Var.setVisibility(0);
                        setRibbonColorKey(aob.Dj);
                        tx4Var.setStrokeColor(0);
                        this.p0 = false;
                        tx4Var.setBackdrop(null);
                        tx4Var.b(ob6.M0(2131749922, null), true);
                        return;
                    } else if (starGift3.auction) {
                        tx4Var.setVisibility(0);
                        tx4Var.setBackdrop(null);
                        this.o0 = -1;
                        tx4Var.a(-2650077, -4227818);
                        tx4Var.setStrokeColor(0);
                        this.p0 = false;
                        if (this.c0.auction_start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                            tx4Var.b(ob6.M0(2131750092, null), true);
                            return;
                        } else {
                            tx4Var.b(ob6.M0(2131750093, null), true);
                            return;
                        }
                    } else if (starGift3.is_new) {
                        tx4Var.setVisibility(0);
                        setRibbonColorKey(aob.Cj);
                        tx4Var.setStrokeColor(0);
                        this.p0 = false;
                        tx4Var.setBackdrop(null);
                        tx4Var.b(ob6.M0(2131750053, null), true);
                        return;
                    } else if (starGift3.require_premium) {
                        tx4Var.setVisibility(0);
                        tx4Var.setBackdrop(null);
                        this.o0 = -1;
                        tx4Var.a(-2650077, -4227818);
                        tx4Var.setStrokeColor(0);
                        this.p0 = false;
                        tx4Var.b(ob6.M0(2131750091, null), true);
                        return;
                    } else if (z) {
                        tx4Var.setVisibility(0);
                        setRibbonColorKey(aob.Cj);
                        tx4Var.setStrokeColor(0);
                        this.p0 = false;
                        tx4Var.setBackdrop(null);
                        tx4Var.b(ob6.M0(2131750090, null), true);
                        return;
                    } else {
                        tx4Var.setBackdrop(null);
                        tx4Var.setStrokeColor(0);
                        this.p0 = false;
                        tx4Var.setVisibility(8);
                        return;
                    }
                }
            }
            tx4Var.setVisibility(0);
            setRibbonColorKey(aob.Cj);
            tx4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) jxa.i(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            tx4Var.setStrokeColor(0);
            this.p0 = false;
            tx4Var.b("#".concat(ob6.E(this.c0.num, ',')), true);
            return;
        }
        pw4 pw4Var = this.b0;
        if (pw4Var != null) {
            if (pw4Var.b() > 0) {
                tx4Var.setVisibility(0);
                tx4Var.setBackdrop(null);
                this.o0 = -1;
                tx4Var.a(-2535425, -8229377);
                tx4Var.setStrokeColor(0);
                this.p0 = false;
                String a0 = ob6.a0(null, null, 2131749453, Integer.valueOf(this.b0.b()));
                tx4Var.b = a0;
                tx4Var.a.g(12, a0, true);
                return;
            }
            tx4Var.setVisibility(8);
            tx4Var.setBackdrop(null);
            tx4Var.setStrokeColor(0);
            this.p0 = false;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sx4.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public void setImageLayer(int i) {
        this.E.setLayerNum(i);
    }

    public void setImageSize(int i) {
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.width = i;
        layoutParams.height = i;
    }

    public void setRibbonColor(int i) {
        this.o0 = -1;
        tx4 tx4Var = this.f;
        tx4Var.setColor(i);
        tx4Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f.b(str, true);
    }

    public void setRibbonTextOneOf(int i) {
        tx4 tx4Var = this.f;
        tx4Var.setVisibility(0);
        setRibbonColorKey(aob.Cj);
        tx4Var.setStrokeColor(0);
        this.p0 = false;
        tx4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) jxa.i(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        tx4Var.b(ob6.a0(null, null, 2131750094, hl.o0(i, 0)), true);
    }

    @Override
    public final void updateColors() {
        int v0;
        de0 de0Var;
        int v02;
        int i;
        try {
            boolean o = aob.I.o();
            if (o != this.v0) {
                this.v0 = o;
                if (this.t0 != 0 && this.L != null && this.M != null && this.x != null) {
                    a();
                }
                TextView textView = this.N;
                if (textView != null) {
                    if (o) {
                        i = -1333971;
                    } else {
                        i = -2722014;
                    }
                    textView.setTextColor(i);
                }
            }
            tx4 tx4Var = this.f;
            vnb vnbVar = this.b;
            if (tx4Var != null) {
                int i2 = this.o0;
                if (i2 >= 0) {
                    vx4 vx4Var = tx4Var.a;
                    ((Paint) vx4Var.b).setColor(aob.v0(i2, vnbVar));
                    vx4Var.invalidateSelf();
                }
                if (this.p0) {
                    tx4Var.setStrokeColor(aob.v(aob.v0(aob.d6, vnbVar), aob.p1(0.04f, aob.v0(aob.G6, vnbVar))));
                }
                tx4Var.invalidate();
            }
            if (this.q0 && (de0Var = this.n) != null && (v02 = aob.v0(aob.nk, vnbVar)) != this.r0) {
                this.r0 = v02;
                de0Var.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            px4 px4Var = this.e;
            if (px4Var != null) {
                int[] iArr = this.s0;
                if (iArr != null && px4Var.m == iArr && (iArr[0] != (v0 = aob.v0(aob.Dj, vnbVar)) || iArr[1] != v0)) {
                    iArr[1] = v0;
                    iArr[0] = v0;
                    px4Var.n = null;
                }
                px4Var.invalidateSelf();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
