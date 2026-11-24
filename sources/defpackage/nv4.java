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
public class nv4 extends FrameLayout implements tjb {
    public static final int[] w0 = {-2781403, -3635939};
    public final be0 E;
    public FrameLayout.LayoutParams F;
    public final oh8 G;
    public final oh8 H;
    public final TextView I;
    public final TextView J;
    public final yc K;
    public final sb L;
    public final TextView M;
    public final TextView N;
    public cua O;
    public boolean P;
    public float Q;
    public tgb R;
    public tgb S;
    public final Rect T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int a;
    public final lm a0;
    public final wjb b;
    public mu4 b0;
    public final c9a c;
    public TL_stars.StarGift c0;
    public final FrameLayout d;
    public boolean d0;
    public final kv4 e;
    public boolean e0;
    public final ov4 f;
    public TL_stars.SavedStarGift f0;
    public boolean g0;
    public final pb0 h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public mu4 k0;
    public TLRPC.Document l0;
    public TL_stars.SavedStarGift m0;
    public final be0 n;
    public wf2 n0;
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

    public nv4(int i, wjb wjbVar, Context context) {
        super(context);
        int i2;
        int i3;
        this.Q = -1.0f;
        this.T = new Rect();
        this.a0 = new lm(this, 0L, 320L, s33.h);
        this.o0 = -1;
        this.v0 = bkb.I.o();
        this.a = i;
        this.b = wjbVar;
        ote.b(this, 0.04f, 1.5f);
        this.c = new c9a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        kv4 kv4Var = new kv4(frameLayout, wjbVar, true);
        this.e = kv4Var;
        frameLayout.setBackground(kv4Var);
        addView(frameLayout, nme.e(-1, -1, 119));
        ov4 ov4Var = new ov4(context);
        this.f = ov4Var;
        addView(ov4Var, nme.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        be0 be0Var = new be0(context);
        this.E = be0Var;
        be0Var.getImageReceiver().M(0);
        FrameLayout.LayoutParams d = nme.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.F = d;
        frameLayout.addView(be0Var, d);
        oh8 oh8Var = new oh8(3, wjbVar, context);
        this.G = oh8Var;
        oh8Var.setImageReceiver(be0Var.getImageReceiver());
        frameLayout.addView(oh8Var, nme.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        oh8 oh8Var2 = new oh8(4, wjbVar, context);
        this.H = oh8Var2;
        oh8Var2.setImageReceiver(be0Var.getImageReceiver());
        frameLayout.addView(oh8Var2, nme.e(44, 44, 17));
        oh8Var2.setAlpha(0.0f);
        oh8Var2.setScaleX(0.3f);
        oh8Var2.setScaleY(0.3f);
        oh8Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.I = textView;
        int i4 = bkb.F6;
        zkb.X(textView, i4, wjbVar);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        TextView l = ug8.l(frameLayout, textView, nme.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.J = l;
        zkb.X(l, i4, wjbVar);
        l.setGravity(17);
        l.setTextSize(1, 12.0f);
        frameLayout.addView(l, nme.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        yc ycVar = new yc((byte) 22, context, this);
        this.K = ycVar;
        TextView textView2 = new TextView(context);
        this.M = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(gl.o());
        textView2.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(ycVar, nme.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        sb sbVar = new sb(context, (byte) 12);
        this.L = sbVar;
        sbVar.setBackgroundColor(-16776961);
        ycVar.addView(sbVar, nme.c(0.0f, 0));
        ycVar.addView(textView2, nme.e(-2, 26, 17));
        if (bkb.I.o()) {
            i2 = 518759725;
        } else {
            i2 = 1088989954;
        }
        sbVar.setBackground(new sv4(i2));
        TextView textView3 = new TextView(context);
        this.N = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        if (bkb.I.o()) {
            i3 = -1333971;
        } else {
            i3 = -2722014;
        }
        textView3.setTextColor(i3);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, nme.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new pb0((wjb) null);
        be0 be0Var2 = new be0(context);
        this.n = be0Var2;
        be0Var2.setRoundRadius(gl.L(20.0f));
        be0Var2.setVisibility(8);
        FrameLayout.LayoutParams d2 = nme.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.r = d2;
        frameLayout.addView(be0Var2, d2);
        this.s = nme.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView k = tb4.k(context, 2131232206);
        k.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        k.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(k, nme.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, nme.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(2131231958);
        imageView.setPadding(0, gl.L(2.0f), 0, 0);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, nme.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.y = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(gl.o());
        textView4.setPadding(gl.L(5.0f), 0, gl.L(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, nme.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        ov4Var.setImportantForAccessibility(2);
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
        this.f.setColor(bkb.v0(i, this.b));
        this.o0 = i;
    }

    public final void a() {
        int i;
        int i2;
        boolean o = bkb.I.o();
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
        this.L.setBackground(new sv4(i));
        this.M.setTextColor(i2);
        ImageView imageView = this.x;
        imageView.setColorFilter(i2);
        imageView.setBackground(bkb.b0(gl.L(10.0f), i));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Bj));
        hashSet.add(Integer.valueOf(bkb.Cj));
        hashSet.add(Integer.valueOf(bkb.kk));
        hashSet.add(Integer.valueOf(bkb.mk));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    public void b(zr5 zr5Var, Canvas canvas, float f, float f2, float f3) {
        float f4;
        float f5;
        yc ycVar;
        float f6;
        ImageView imageView;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        float f7;
        Canvas canvas2 = canvas;
        be0 be0Var = this.n;
        be0 be0Var2 = this.E;
        kv4 kv4Var = this.e;
        ov4 ov4Var = this.f;
        Rect rect = this.T;
        FrameLayout frameLayout = this.w;
        ImageView imageView2 = this.x;
        yc ycVar2 = this.K;
        oh8 oh8Var = this.G;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f / 2.0f, f2 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        if (uniqueStarGift != null) {
            f4 = gl.L(63.0f) * f3;
        } else {
            f4 = 0.0f;
        }
        kv4Var.setBounds(0, 0, (int) f, (int) f2);
        kv4Var.b(canvas2, f3);
        kv4Var.getPadding(rect);
        float U1 = gl.U1(f3, gl.L(80.0f), gl.L(120.0f));
        float f8 = f2 - f4;
        be0Var2.getImageReceiver().i0((f - U1) / 2.0f, (f8 - U1) / 2.0f, U1, U1);
        be0Var2.getImageReceiver().h(canvas2, null);
        oy8 y = be0Var2.getImageReceiver().y();
        if (y != null && y.l0) {
            zr5Var.invalidate();
        }
        if (oh8Var.getVisibility() == 0 && oh8Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate((f - oh8Var.getMeasuredWidth()) / 2.0f, gl.R1(oh8Var.getY(), (f8 - oh8Var.getMeasuredHeight()) / 2.0f, f3));
            f5 = 1.0f;
            ycVar = ycVar2;
            f6 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
            canvas2.saveLayerAlpha(0.0f, 0.0f, oh8Var.getWidth(), oh8Var.getHeight(), (int) (oh8Var.getAlpha() * (1.0f - f3) * 255.0f), 31);
            oh8Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        } else {
            f5 = 1.0f;
            ycVar = ycVar2;
            f6 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
        }
        if (frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > f6) {
            canvas2.save();
            canvas2.translate(gl.L(2.0f) + rect.left, gl.L(2.0f) + rect.top);
            canvas2.saveLayerAlpha(0.0f, 0.0f, frameLayout.getWidth(), frameLayout.getHeight(), (int) (frameLayout.getAlpha() * 255.0f), 31);
            frameLayout.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
        if (be0Var.getVisibility() == 0 && be0Var.getAlpha() > f6) {
            canvas2.save();
            canvas2.translate(gl.L(2.0f) + rect.left, gl.L(2.0f) + rect.top);
            be0Var.draw(canvas2);
            canvas2.restore();
        }
        if (ov4Var.getVisibility() == 0 && ov4Var.getAlpha() > f6) {
            canvas2.save();
            canvas2.translate(f - gl.L(f5), gl.L(2.0f));
            f7 = f5;
            float R1 = gl.R1(f7, 1.25f, f3);
            canvas2.scale(R1, R1);
            canvas2.translate(-ov4Var.getWidth(), f6);
            ov4Var.draw(canvas2);
            canvas2.restore();
        } else {
            f7 = f5;
        }
        if (tL_starGiftUnique != null) {
            if (this.R == null) {
                this.R = new tgb(tL_starGiftUnique.title, 20.0f, gl.o());
            }
            if (this.S == null) {
                this.S = new tgb(k96.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 13.0f, null);
            }
            tgb tgbVar = this.R;
            tgbVar.p = f - gl.L(8.0f);
            float f9 = f7 - f3;
            tgbVar.c((f - this.R.j()) / 2.0f, ((f2 - gl.L(40.0f)) - (this.R.h() / 2.0f)) + (gl.L(50.0f) * f9), f3, -1, canvas);
            tgb tgbVar2 = this.S;
            tgbVar2.p = f - gl.L(8.0f);
            tgbVar2.c((f - this.S.j()) / 2.0f, (gl.L(50.0f) * f9) + ((f2 - gl.L(19.0f)) - (this.S.h() / 2.0f)), 0.6f * f3, -1, canvas);
            canvas2 = canvas;
        }
        if (ycVar != null && ycVar.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(ycVar.getX(), ycVar.getY());
            canvas.saveLayerAlpha(0.0f, 0.0f, ycVar.getWidth(), ycVar.getHeight(), (int) (ycVar.getAlpha() * (f7 - f3) * 255.0f), 31);
            canvas2 = canvas;
            ycVar.draw(canvas2);
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
            wf2 wf2Var = new wf2(21, null, getContext());
            this.n0 = wf2Var;
            wf2Var.b(-1, bkb.c6, bkb.j7);
            this.n0.setDrawUnchecked(false);
            this.d.addView(this.n0, nme.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
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
            scaleX.scaleY(f4).withEndAction(new lv4(this, z, (byte) 1)).start();
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
                f2 = gl.L(6.0f);
            } else {
                f2 = 0.0f;
            }
            ViewPropertyAnimator translationX = animate.translationX(f2);
            if (z) {
                f3 = gl.L(6.0f);
            }
            translationX.translationY(f3).setDuration(320L).setInterpolator(s33.h).start();
            return;
        }
        imageView.animate().cancel();
        if (z) {
            f = gl.L(6.0f);
        } else {
            f = 0.0f;
        }
        imageView.setTranslationX(f);
        if (z) {
            f3 = gl.L(6.0f);
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
        oh8 oh8Var = this.H;
        if (z2) {
            oh8Var.setVisibility(0);
            ViewPropertyAnimator animate = oh8Var.animate();
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
            scaleX.scaleY(f4).withEndAction(new lv4(this, z, (byte) 0)).start();
            return;
        }
        if (!z) {
            i = 8;
        }
        oh8Var.setVisibility(i);
        if (z) {
            f3 = 1.0f;
        }
        oh8Var.setAlpha(f3);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3f;
        }
        oh8Var.setScaleX(f);
        if (z) {
            f4 = 1.0f;
        }
        oh8Var.setScaleY(f4);
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

    public mu4 getPremiumTier() {
        return this.b0;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f0;
    }

    public final void h(org.telegram.tgnet.tl.TL_stars.StarGift r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv4.h(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final boolean i(org.telegram.tgnet.tl.TL_stars.SavedStarGift r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv4.i(org.telegram.tgnet.tl.TL_stars$SavedStarGift, boolean, boolean):boolean");
    }

    public final void j(TLRPC.Document document, TLObject tLObject) {
        be0 be0Var = this.E;
        if (document == null) {
            be0Var.b();
            this.l0 = null;
        } else if (this.l0 == document) {
        } else {
            this.l0 = document;
            TLRPC.PhotoSize w = ba4.w(document.thumbs, gl.L(100.0f), false, null, false);
            be0Var.j(gl5.b(document), "80_80_nolimit_pcache", gl5.c(w, document), "80_80_nolimit_pcache", uo3.f(document, bkb.Z6, 0.3f, null), tLObject);
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
                stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) gta.i(uniqueStarGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
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
            be0 be0Var = this.E;
            be0Var.setColorFilter(colorMatrixColorFilter);
            ImageReceiver imageReceiver = be0Var.getImageReceiver();
            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i2 == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            imageReceiver.v0 = z3;
            if (i2 > 0) {
                be0Var.getImageReceiver().x0();
                oy8 y = be0Var.getImageReceiver().y();
                if (y != null) {
                    y.I(0, false, false);
                }
            }
            be0Var.invalidate();
        }
        if (this.P != z) {
            this.P = z;
            if (getUniqueStarGift() != null) {
                if (z) {
                    concat = k96.M0(2131742860, null);
                } else {
                    concat = "#".concat(k96.E(uniqueStarGift.num, ','));
                }
                ov4 ov4Var = this.f;
                if (z2) {
                    ov4Var.getClass();
                    ov4Var.b = concat;
                    ov4Var.a.h(10, concat);
                    return;
                }
                ov4Var.b(concat, true);
            }
        }
    }

    public final void l() {
        wjb wjbVar = this.b;
        ov4 ov4Var = this.f;
        TL_stars.SavedStarGift savedStarGift = this.f0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                ov4Var.setVisibility(0);
                TL_stars.StarGift starGift2 = this.f0.gift;
                if (starGift2.resell_amount != null && (!cq7.m(starGift2) || na7.q1(this.a).k4.n0.f)) {
                    int v = bkb.v(bkb.v0(bkb.c6, wjbVar), bkb.p1(0.04f, bkb.v0(bkb.F6, wjbVar)));
                    setRibbonColorKey(bkb.kk);
                    ov4Var.setStrokeColor(v);
                    this.p0 = true;
                    ov4Var.setBackdrop(null);
                    ov4Var.b(k96.M0(2131750073, null), false);
                    return;
                }
                setRibbonColorKey(bkb.Bj);
                ov4Var.setStrokeColor(0);
                this.p0 = false;
                ov4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) gta.i(this.f0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                ov4Var.b("#".concat(k96.E(this.f0.gift.num, ',')), true);
                return;
            } else if (starGift.limited) {
                ov4Var.setVisibility(0);
                setRibbonColorKey(bkb.Bj);
                ov4Var.setStrokeColor(0);
                this.p0 = false;
                ov4Var.setBackdrop(null);
                ov4Var.b(k96.a0(null, null, 2131750119, gl.o0(this.f0.gift.availability_total, 0)), true);
                return;
            } else {
                ov4Var.setBackdrop(null);
                ov4Var.setVisibility(8);
                return;
            }
        }
        TL_stars.StarGift starGift3 = this.c0;
        if (starGift3 != null) {
            if (!this.h0 && !this.j0) {
                if (this.g0 && starGift3.availability_resale > 0) {
                    ov4Var.setVisibility(0);
                    setRibbonColorKey(bkb.kk);
                    ov4Var.setStrokeColor(0);
                    this.p0 = false;
                    ov4Var.setBackdrop(null);
                    ov4Var.b(k96.M0(2131750014, null), false);
                    return;
                } else if (this.e0) {
                    ov4Var.setVisibility(0);
                    setRibbonColorKey(bkb.Bj);
                    ov4Var.setStrokeColor(0);
                    this.p0 = false;
                    ov4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) gta.i(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    ov4Var.b(k96.a0(null, null, 2131750119, gl.o0(this.c0.availability_issued, 0)), true);
                    return;
                } else {
                    boolean z = starGift3.limited;
                    if (z && starGift3.availability_remains <= 0) {
                        ov4Var.setVisibility(0);
                        setRibbonColorKey(bkb.Cj);
                        ov4Var.setStrokeColor(0);
                        this.p0 = false;
                        ov4Var.setBackdrop(null);
                        ov4Var.b(k96.M0(2131749960, null), true);
                        return;
                    } else if (starGift3.auction) {
                        ov4Var.setVisibility(0);
                        ov4Var.setBackdrop(null);
                        this.o0 = -1;
                        ov4Var.a(-2650077, -4227818);
                        ov4Var.setStrokeColor(0);
                        this.p0 = false;
                        if (this.c0.auction_start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                            ov4Var.b(k96.M0(2131750117, null), true);
                            return;
                        } else {
                            ov4Var.b(k96.M0(2131750118, null), true);
                            return;
                        }
                    } else if (starGift3.require_premium) {
                        ov4Var.setVisibility(0);
                        ov4Var.setBackdrop(null);
                        this.o0 = -1;
                        ov4Var.a(-2650077, -4227818);
                        ov4Var.setStrokeColor(0);
                        this.p0 = false;
                        ov4Var.b(k96.M0(2131750116, null), true);
                        return;
                    } else if (z) {
                        ov4Var.setVisibility(0);
                        setRibbonColorKey(bkb.Bj);
                        ov4Var.setStrokeColor(0);
                        this.p0 = false;
                        ov4Var.setBackdrop(null);
                        ov4Var.b(k96.M0(2131750115, null), true);
                        return;
                    } else {
                        ov4Var.setBackdrop(null);
                        ov4Var.setStrokeColor(0);
                        this.p0 = false;
                        ov4Var.setVisibility(8);
                        return;
                    }
                }
            }
            ov4Var.setVisibility(0);
            setRibbonColorKey(bkb.Bj);
            ov4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) gta.i(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            ov4Var.setStrokeColor(0);
            this.p0 = false;
            ov4Var.b("#".concat(k96.E(this.c0.num, ',')), true);
            return;
        }
        mu4 mu4Var = this.b0;
        if (mu4Var != null) {
            if (mu4Var.b() > 0) {
                ov4Var.setVisibility(0);
                ov4Var.setBackdrop(null);
                this.o0 = -1;
                ov4Var.a(-2535425, -8229377);
                ov4Var.setStrokeColor(0);
                this.p0 = false;
                String a0 = k96.a0(null, null, 2131749492, Integer.valueOf(this.b0.b()));
                ov4Var.b = a0;
                ov4Var.a.g(12, a0, true);
                return;
            }
            ov4Var.setVisibility(8);
            ov4Var.setBackdrop(null);
            ov4Var.setStrokeColor(0);
            this.p0 = false;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv4.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
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
        ov4 ov4Var = this.f;
        ov4Var.setColor(i);
        ov4Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f.b(str, true);
    }

    public void setRibbonTextOneOf(int i) {
        ov4 ov4Var = this.f;
        ov4Var.setVisibility(0);
        setRibbonColorKey(bkb.Bj);
        ov4Var.setStrokeColor(0);
        this.p0 = false;
        ov4Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) gta.i(this.c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        ov4Var.b(k96.a0(null, null, 2131750119, gl.o0(i, 0)), true);
    }

    @Override
    public final void updateColors() {
        int v0;
        be0 be0Var;
        int v02;
        int i;
        try {
            boolean o = bkb.I.o();
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
            ov4 ov4Var = this.f;
            wjb wjbVar = this.b;
            if (ov4Var != null) {
                int i2 = this.o0;
                if (i2 >= 0) {
                    qv4 qv4Var = ov4Var.a;
                    ((Paint) qv4Var.b).setColor(bkb.v0(i2, wjbVar));
                    qv4Var.invalidateSelf();
                }
                if (this.p0) {
                    ov4Var.setStrokeColor(bkb.v(bkb.v0(bkb.c6, wjbVar), bkb.p1(0.04f, bkb.v0(bkb.F6, wjbVar))));
                }
                ov4Var.invalidate();
            }
            if (this.q0 && (be0Var = this.n) != null && (v02 = bkb.v0(bkb.mk, wjbVar)) != this.r0) {
                this.r0 = v02;
                be0Var.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            kv4 kv4Var = this.e;
            if (kv4Var != null) {
                int[] iArr = this.s0;
                if (iArr != null && kv4Var.m == iArr && (iArr[0] != (v0 = bkb.v0(bkb.Cj, wjbVar)) || iArr[1] != v0)) {
                    iArr[1] = v0;
                    iArr[0] = v0;
                    kv4Var.n = null;
                }
                kv4Var.invalidateSelf();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
