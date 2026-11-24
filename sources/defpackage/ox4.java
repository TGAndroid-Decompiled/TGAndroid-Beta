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
public class ox4 extends FrameLayout implements vlb {
    public static final int[] w0 = {-2781403, -3635939};
    public final bf0 E;
    public FrameLayout.LayoutParams F;
    public final pj8 G;
    public final pj8 H;
    public final TextView I;
    public final TextView J;
    public final yd K;
    public final sb L;
    public final TextView M;
    public final TextView N;
    public gwa O;
    public boolean P;
    public float Q;
    public uib R;
    public uib S;
    public final Rect T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int a;
    public final ln a0;
    public final ylb b;
    public nw4 b0;
    public final cba c;
    public TL_stars.StarGift c0;
    public final FrameLayout d;
    public boolean d0;
    public final lx4 e;
    public boolean e0;
    public final px4 f;
    public TL_stars.SavedStarGift f0;
    public boolean g0;
    public final pc0 h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public nw4 k0;
    public TLRPC.Document l0;
    public TL_stars.SavedStarGift m0;
    public final bf0 n;
    public jh2 n0;
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

    public ox4(int i, ylb ylbVar, Context context) {
        super(context);
        int i2;
        int i3;
        this.Q = -1.0f;
        this.T = new Rect();
        this.a0 = new ln(this, 0L, 320L, d53.h);
        this.o0 = -1;
        this.v0 = cmb.I.o();
        this.a = i;
        this.b = ylbVar;
        rve.b(this, 0.04f, 1.5f);
        this.c = new cba(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        lx4 lx4Var = new lx4(frameLayout, ylbVar, true);
        this.e = lx4Var;
        frameLayout.setBackground(lx4Var);
        addView(frameLayout, qoe.e(-1, -1, 119));
        px4 px4Var = new px4(context);
        this.f = px4Var;
        addView(px4Var, qoe.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        bf0 bf0Var = new bf0(context);
        this.E = bf0Var;
        bf0Var.getImageReceiver().M(0);
        FrameLayout.LayoutParams d = qoe.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.F = d;
        frameLayout.addView(bf0Var, d);
        pj8 pj8Var = new pj8(3, ylbVar, context);
        this.G = pj8Var;
        pj8Var.setImageReceiver(bf0Var.getImageReceiver());
        frameLayout.addView(pj8Var, qoe.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        pj8 pj8Var2 = new pj8(4, ylbVar, context);
        this.H = pj8Var2;
        pj8Var2.setImageReceiver(bf0Var.getImageReceiver());
        frameLayout.addView(pj8Var2, qoe.e(44, 44, 17));
        pj8Var2.setAlpha(0.0f);
        pj8Var2.setScaleX(0.3f);
        pj8Var2.setScaleY(0.3f);
        pj8Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.I = textView;
        int i4 = cmb.F6;
        anb.X(textView, i4, ylbVar);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.o());
        TextView l = wi8.l(frameLayout, textView, qoe.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.J = l;
        anb.X(l, i4, ylbVar);
        l.setGravity(17);
        l.setTextSize(1, 12.0f);
        frameLayout.addView(l, qoe.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        yd ydVar = new yd((byte) 22, context, this);
        this.K = ydVar;
        TextView textView2 = new TextView(context);
        this.M = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(gm.o());
        textView2.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(ydVar, qoe.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        sb sbVar = new sb(context, (byte) 13);
        this.L = sbVar;
        sbVar.setBackgroundColor(-16776961);
        ydVar.addView(sbVar, qoe.c(0.0f, 0));
        ydVar.addView(textView2, qoe.e(-2, 26, 17));
        if (cmb.I.o()) {
            i2 = 518759725;
        } else {
            i2 = 1088989954;
        }
        sbVar.setBackground(new tx4(i2));
        TextView textView3 = new TextView(context);
        this.N = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        if (cmb.I.o()) {
            i3 = -1333971;
        } else {
            i3 = -2722014;
        }
        textView3.setTextColor(i3);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, qoe.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new pc0((ylb) null);
        bf0 bf0Var2 = new bf0(context);
        this.n = bf0Var2;
        bf0Var2.setRoundRadius(gm.L(20.0f));
        bf0Var2.setVisibility(8);
        FrameLayout.LayoutParams d2 = qoe.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.r = d2;
        frameLayout.addView(bf0Var2, d2);
        this.s = qoe.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView k = td4.k(context, 2131232207);
        k.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        k.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(k, qoe.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, qoe.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(2131231959);
        imageView.setPadding(0, gm.L(2.0f), 0, 0);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, qoe.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.y = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(gm.o());
        textView4.setPadding(gm.L(5.0f), 0, gm.L(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, qoe.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        px4Var.setImportantForAccessibility(2);
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
        this.f.setColor(cmb.v0(i, this.b));
        this.o0 = i;
    }

    public final void a() {
        int i;
        int i2;
        boolean o = cmb.I.o();
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
        this.L.setBackground(new tx4(i));
        this.M.setTextColor(i2);
        ImageView imageView = this.x;
        imageView.setColorFilter(i2);
        imageView.setBackground(cmb.b0(gm.L(10.0f), i));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Bj));
        hashSet.add(Integer.valueOf(cmb.Cj));
        hashSet.add(Integer.valueOf(cmb.kk));
        hashSet.add(Integer.valueOf(cmb.mk));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    public void b(yt5 yt5Var, Canvas canvas, float f, float f2, float f3) {
        float f4;
        float f5;
        yd ydVar;
        float f6;
        ImageView imageView;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        float f7;
        Canvas canvas2 = canvas;
        bf0 bf0Var = this.n;
        bf0 bf0Var2 = this.E;
        lx4 lx4Var = this.e;
        px4 px4Var = this.f;
        Rect rect = this.T;
        FrameLayout frameLayout = this.w;
        ImageView imageView2 = this.x;
        yd ydVar2 = this.K;
        pj8 pj8Var = this.G;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f / 2.0f, f2 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        if (uniqueStarGift != null) {
            f4 = gm.L(63.0f) * f3;
        } else {
            f4 = 0.0f;
        }
        lx4Var.setBounds(0, 0, (int) f, (int) f2);
        lx4Var.b(canvas2, f3);
        lx4Var.getPadding(rect);
        float U1 = gm.U1(f3, gm.L(80.0f), gm.L(120.0f));
        float f8 = f2 - f4;
        bf0Var2.getImageReceiver().i0((f - U1) / 2.0f, (f8 - U1) / 2.0f, U1, U1);
        bf0Var2.getImageReceiver().h(canvas2, null);
        p09 y = bf0Var2.getImageReceiver().y();
        if (y != null && y.l0) {
            yt5Var.invalidate();
        }
        if (pj8Var.getVisibility() == 0 && pj8Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate((f - pj8Var.getMeasuredWidth()) / 2.0f, gm.R1(pj8Var.getY(), (f8 - pj8Var.getMeasuredHeight()) / 2.0f, f3));
            f5 = 1.0f;
            ydVar = ydVar2;
            f6 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
            canvas2.saveLayerAlpha(0.0f, 0.0f, pj8Var.getWidth(), pj8Var.getHeight(), (int) (pj8Var.getAlpha() * (1.0f - f3) * 255.0f), 31);
            pj8Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        } else {
            f5 = 1.0f;
            ydVar = ydVar2;
            f6 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
        }
        if (frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > f6) {
            canvas2.save();
            canvas2.translate(gm.L(2.0f) + rect.left, gm.L(2.0f) + rect.top);
            canvas2.saveLayerAlpha(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), (int) (frameLayout.getAlpha() * 255.0f), 31);
            frameLayout.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (bf0Var.getVisibility() == 0 && bf0Var.getAlpha() > f6) {
            canvas2.save();
            canvas2.translate(gm.L(2.0f) + rect.left, gm.L(2.0f) + rect.top);
            bf0Var.draw(canvas2);
            canvas2.restore();
        }
        if (px4Var.getVisibility() == 0 && px4Var.getAlpha() > f6) {
            canvas2.save();
            canvas2.translate(f - gm.L(f5), gm.L(2.0f));
            f7 = f5;
            float R1 = gm.R1(f7, 1.25f, f3);
            canvas2.scale(R1, R1);
            canvas2.translate(-px4Var.getWidth(), f6);
            px4Var.draw(canvas2);
            canvas2.restore();
        } else {
            f7 = f5;
        }
        if (tL_starGiftUnique != null) {
            if (this.R == null) {
                this.R = new uib(tL_starGiftUnique.title, 20.0f, gm.o());
            }
            if (this.S == null) {
                this.S = new uib(jb6.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 13.0f, null);
            }
            uib uibVar = this.R;
            uibVar.p = f - gm.L(8.0f);
            float f9 = f7 - f3;
            uibVar.c((f - this.R.j()) / 2.0f, ((f2 - gm.L(40.0f)) - (this.R.h() / 2.0f)) + (gm.L(50.0f) * f9), f3, -1, canvas);
            uib uibVar2 = this.S;
            uibVar2.p = f - gm.L(8.0f);
            uibVar2.c((f - this.S.j()) / 2.0f, (gm.L(50.0f) * f9) + ((f2 - gm.L(19.0f)) - (this.S.h() / 2.0f)), 0.6f * f3, -1, canvas);
            canvas2 = canvas;
        }
        if (ydVar != null && ydVar.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(ydVar.getX(), ydVar.getY());
            canvas.saveLayerAlpha(0.0f, 0.0f, ydVar.getWidth(), ydVar.getHeight(), (int) (ydVar.getAlpha() * (f7 - f3) * 255.0f), 31);
            canvas2 = canvas;
            ydVar.draw(canvas2);
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
            jh2 jh2Var = new jh2(21, null, getContext());
            this.n0 = jh2Var;
            jh2Var.b(-1, cmb.c6, cmb.j7);
            this.n0.setDrawUnchecked(false);
            this.d.addView(this.n0, qoe.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
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
            scaleX.scaleY(f4).withEndAction(new mx4(this, z, (byte) 1)).start();
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
                f2 = gm.L(6.0f);
            } else {
                f2 = 0.0f;
            }
            ViewPropertyAnimator translationX = animate.translationX(f2);
            if (z) {
                f3 = gm.L(6.0f);
            }
            translationX.translationY(f3).setDuration(320L).setInterpolator(d53.h).start();
            return;
        }
        imageView.animate().cancel();
        if (z) {
            f = gm.L(6.0f);
        } else {
            f = 0.0f;
        }
        imageView.setTranslationX(f);
        if (z) {
            f3 = gm.L(6.0f);
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
        pj8 pj8Var = this.H;
        if (z2) {
            pj8Var.setVisibility(0);
            ViewPropertyAnimator animate = pj8Var.animate();
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
            scaleX.scaleY(f4).withEndAction(new mx4(this, z, (byte) 0)).start();
            return;
        }
        if (!z) {
            i = 8;
        }
        pj8Var.setVisibility(i);
        if (z) {
            f3 = 1.0f;
        }
        pj8Var.setAlpha(f3);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3f;
        }
        pj8Var.setScaleX(f);
        if (z) {
            f4 = 1.0f;
        }
        pj8Var.setScaleY(f4);
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

    public nw4 getPremiumTier() {
        return this.b0;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f0;
    }

    public final void h(org.telegram.tgnet.tl.TL_stars.StarGift r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox4.h(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final boolean i(org.telegram.tgnet.tl.TL_stars.SavedStarGift r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox4.i(org.telegram.tgnet.tl.TL_stars$SavedStarGift, boolean, boolean):boolean");
    }

    public final void j(TLRPC.Document document, TLObject tLObject) {
        bf0 bf0Var = this.E;
        if (document == null) {
            bf0Var.b();
            this.l0 = null;
        } else if (this.l0 == document) {
        } else {
            this.l0 = document;
            TLRPC.PhotoSize w = bc4.w(document.thumbs, gm.L(100.0f), false, null, false);
            bf0Var.j(gn5.b(document), "80_80_nolimit_pcache", gn5.c(w, document), "80_80_nolimit_pcache", eq3.f(document, cmb.Z6, 0.3f, null), tLObject);
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
                stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jva.i(uniqueStarGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
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
            bf0 bf0Var = this.E;
            bf0Var.setColorFilter(colorMatrixColorFilter);
            ImageReceiver imageReceiver = bf0Var.getImageReceiver();
            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i2 == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            imageReceiver.v0 = z3;
            if (i2 > 0) {
                bf0Var.getImageReceiver().x0();
                p09 y = bf0Var.getImageReceiver().y();
                if (y != null) {
                    y.I(0, false, false);
                }
            }
            bf0Var.invalidate();
        }
        if (this.P != z) {
            this.P = z;
            if (getUniqueStarGift() != null) {
                if (z) {
                    concat = jb6.M0(2131742786, null);
                } else {
                    concat = "#".concat(jb6.E(uniqueStarGift.num, ','));
                }
                px4 px4Var = this.f;
                if (z2) {
                    px4Var.getClass();
                    px4Var.b = concat;
                    px4Var.a.h(10, concat);
                    return;
                }
                px4Var.b(concat, true);
            }
        }
    }

    public final void l() {
        ylb ylbVar = this.b;
        px4 px4Var = this.f;
        TL_stars.SavedStarGift savedStarGift = this.f0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                px4Var.setVisibility(0);
                TL_stars.StarGift starGift2 = this.f0.gift;
                if (starGift2.resell_amount != null && (!fs7.m(starGift2) || oc7.r1(this.a).l4.n0.f)) {
                    int v = cmb.v(cmb.v0(cmb.c6, ylbVar), cmb.p1(0.04f, cmb.v0(cmb.F6, ylbVar)));
                    setRibbonColorKey(cmb.kk);
                    px4Var.setStrokeColor(v);
                    this.p0 = true;
                    px4Var.setBackdrop(null);
                    px4Var.b(jb6.M0(2131750022, null), false);
                    return;
                }
                setRibbonColorKey(cmb.Bj);
                px4Var.setStrokeColor(0);
                this.p0 = false;
                px4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) jva.i(this.f0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                px4Var.b("#".concat(jb6.E(this.f0.gift.num, ',')), true);
                return;
            } else if (starGift.limited) {
                px4Var.setVisibility(0);
                setRibbonColorKey(cmb.Bj);
                px4Var.setStrokeColor(0);
                this.p0 = false;
                px4Var.setBackdrop(null);
                px4Var.b(jb6.a0(null, null, 2131750068, gm.o0(this.f0.gift.availability_total, 0)), true);
                return;
            } else {
                px4Var.setBackdrop(null);
                px4Var.setVisibility(8);
                return;
            }
        }
        TL_stars.StarGift starGift3 = this.c0;
        if (starGift3 != null) {
            if (!this.h0 && !this.j0) {
                if (this.g0 && starGift3.availability_resale > 0) {
                    px4Var.setVisibility(0);
                    setRibbonColorKey(cmb.kk);
                    px4Var.setStrokeColor(0);
                    this.p0 = false;
                    px4Var.setBackdrop(null);
                    px4Var.b(jb6.M0(2131749963, null), false);
                    return;
                } else if (this.e0) {
                    px4Var.setVisibility(0);
                    setRibbonColorKey(cmb.Bj);
                    px4Var.setStrokeColor(0);
                    this.p0 = false;
                    px4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) jva.i(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    px4Var.b(jb6.a0(null, null, 2131750068, gm.o0(this.c0.availability_issued, 0)), true);
                    return;
                } else {
                    boolean z = starGift3.limited;
                    if (z && starGift3.availability_remains <= 0) {
                        px4Var.setVisibility(0);
                        setRibbonColorKey(cmb.Cj);
                        px4Var.setStrokeColor(0);
                        this.p0 = false;
                        px4Var.setBackdrop(null);
                        px4Var.b(jb6.M0(2131749909, null), true);
                        return;
                    } else if (starGift3.auction) {
                        px4Var.setVisibility(0);
                        px4Var.setBackdrop(null);
                        this.o0 = -1;
                        px4Var.a(-2650077, -4227818);
                        px4Var.setStrokeColor(0);
                        this.p0 = false;
                        if (this.c0.auction_start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                            px4Var.b(jb6.M0(2131750066, null), true);
                            return;
                        } else {
                            px4Var.b(jb6.M0(2131750067, null), true);
                            return;
                        }
                    } else if (starGift3.require_premium) {
                        px4Var.setVisibility(0);
                        px4Var.setBackdrop(null);
                        this.o0 = -1;
                        px4Var.a(-2650077, -4227818);
                        px4Var.setStrokeColor(0);
                        this.p0 = false;
                        px4Var.b(jb6.M0(2131750065, null), true);
                        return;
                    } else if (z) {
                        px4Var.setVisibility(0);
                        setRibbonColorKey(cmb.Bj);
                        px4Var.setStrokeColor(0);
                        this.p0 = false;
                        px4Var.setBackdrop(null);
                        px4Var.b(jb6.M0(2131750064, null), true);
                        return;
                    } else {
                        px4Var.setBackdrop(null);
                        px4Var.setStrokeColor(0);
                        this.p0 = false;
                        px4Var.setVisibility(8);
                        return;
                    }
                }
            }
            px4Var.setVisibility(0);
            setRibbonColorKey(cmb.Bj);
            px4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) jva.i(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            px4Var.setStrokeColor(0);
            this.p0 = false;
            px4Var.b("#".concat(jb6.E(this.c0.num, ',')), true);
            return;
        }
        nw4 nw4Var = this.b0;
        if (nw4Var != null) {
            if (nw4Var.b() > 0) {
                px4Var.setVisibility(0);
                px4Var.setBackdrop(null);
                this.o0 = -1;
                px4Var.a(-2535425, -8229377);
                px4Var.setStrokeColor(0);
                this.p0 = false;
                String a0 = jb6.a0(null, null, 2131749441, Integer.valueOf(this.b0.b()));
                px4Var.b = a0;
                px4Var.a.g(12, a0, true);
                return;
            }
            px4Var.setVisibility(8);
            px4Var.setBackdrop(null);
            px4Var.setStrokeColor(0);
            this.p0 = false;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox4.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
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
        px4 px4Var = this.f;
        px4Var.setColor(i);
        px4Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f.b(str, true);
    }

    public void setRibbonTextOneOf(int i) {
        px4 px4Var = this.f;
        px4Var.setVisibility(0);
        setRibbonColorKey(cmb.Bj);
        px4Var.setStrokeColor(0);
        this.p0 = false;
        px4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) jva.i(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        px4Var.b(jb6.a0(null, null, 2131750068, gm.o0(i, 0)), true);
    }

    @Override
    public final void updateColors() {
        int v0;
        bf0 bf0Var;
        int v02;
        int i;
        try {
            boolean o = cmb.I.o();
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
            px4 px4Var = this.f;
            ylb ylbVar = this.b;
            if (px4Var != null) {
                int i2 = this.o0;
                if (i2 >= 0) {
                    rx4 rx4Var = px4Var.a;
                    ((Paint) rx4Var.b).setColor(cmb.v0(i2, ylbVar));
                    rx4Var.invalidateSelf();
                }
                if (this.p0) {
                    px4Var.setStrokeColor(cmb.v(cmb.v0(cmb.c6, ylbVar), cmb.p1(0.04f, cmb.v0(cmb.F6, ylbVar))));
                }
                px4Var.invalidate();
            }
            if (this.q0 && (bf0Var = this.n) != null && (v02 = cmb.v0(cmb.mk, ylbVar)) != this.r0) {
                this.r0 = v02;
                bf0Var.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            lx4 lx4Var = this.e;
            if (lx4Var != null) {
                int[] iArr = this.s0;
                if (iArr != null && lx4Var.m == iArr && (iArr[0] != (v0 = cmb.v0(cmb.Cj, ylbVar)) || iArr[1] != v0)) {
                    iArr[1] = v0;
                    iArr[0] = v0;
                    lx4Var.n = null;
                }
                lx4Var.invalidateSelf();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
