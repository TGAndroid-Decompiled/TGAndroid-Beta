package ai;

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
import b8.mf;
import b8.pf;
import ci.e9;
import ci.ma;
import ci.rb;
import ci.wb;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
public class q2 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final int[] f890w0 = {-2781403, -3635939};
    public final k9 E;
    public FrameLayout.LayoutParams F;
    public final vg.y0 G;
    public final vg.y0 H;
    public final TextView I;
    public final TextView J;
    public final o2 K;
    public final x2 L;
    public final TextView M;
    public final TextView N;
    public ma O;
    public boolean P;
    public float Q;
    public ly0 R;
    public ly0 S;
    public final Rect T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int f891a;
    public final org.telegram.ui.Components.u5 f892a0;
    public final org.telegram.ui.ActionBar.e6 f893b;
    public vg.j f894b0;
    public final hn0 f895c;
    public TL_stars.StarGift f896c0;
    public final FrameLayout d;
    public boolean f897d0;
    public final m2 f898e;
    public boolean f899e0;
    public final r2 f900f;
    public TL_stars.SavedStarGift f901f0;
    public boolean f902g0;
    public final u8 h;
    public boolean f903h0;
    public boolean f904i0;
    public boolean f905j0;
    public vg.j f906k0;
    public TLRPC.Document f907l0;
    public TL_stars.SavedStarGift m0;
    public final k9 f908n;
    public wo f909n0;
    public int f910o0;
    public boolean f911p0;
    public boolean f912q0;
    public final FrameLayout.LayoutParams f913r;
    public int f914r0;
    public final FrameLayout.LayoutParams f915s;
    public int[] f916s0;
    public int f917t0;
    public boolean f918u0;
    public boolean f919v0;
    public final FrameLayout f920w;
    public final ImageView f921x;
    public final TextView f922y;

    public q2(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        int i11;
        this.Q = -1.0f;
        this.T = new Rect();
        this.f892a0 = new org.telegram.ui.Components.u5(this, 0L, 320L, xq.h);
        this.f910o0 = -1;
        this.f919v0 = org.telegram.ui.ActionBar.k6.I.q();
        this.f891a = i3;
        this.f893b = e6Var;
        pf.b(this, 0.04f, 1.5f);
        this.f895c = new hn0(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        m2 m2Var = new m2(frameLayout, e6Var, true);
        this.f898e = m2Var;
        frameLayout.setBackground(m2Var);
        addView(frameLayout, mf.e(-1, -1, 119));
        r2 r2Var = new r2(context);
        this.f900f = r2Var;
        addView(r2Var, mf.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
        k9 k9Var = new k9(context);
        this.E = k9Var;
        k9Var.getImageReceiver().W(0);
        FrameLayout.LayoutParams d = mf.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f);
        this.F = d;
        frameLayout.addView(k9Var, d);
        vg.y0 y0Var = new vg.y0(3, context, e6Var);
        this.G = y0Var;
        y0Var.setImageReceiver(k9Var.getImageReceiver());
        frameLayout.addView(y0Var, mf.d(30, 30.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
        vg.y0 y0Var2 = new vg.y0(4, context, e6Var);
        this.H = y0Var2;
        y0Var2.setImageReceiver(k9Var.getImageReceiver());
        frameLayout.addView(y0Var2, mf.e(44, 44, 17));
        y0Var2.setAlpha(0.0f);
        y0Var2.setScaleX(0.3f);
        y0Var2.setScaleY(0.3f);
        y0Var2.setVisibility(8);
        TextView textView = new TextView(context);
        this.I = textView;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i12, e6Var);
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView m10 = org.telegram.ui.Cells.f1.m(frameLayout, textView, mf.d(-1, -2.0f, 48, 0.0f, 89.0f, 0.0f, 0.0f), context);
        this.J = m10;
        org.telegram.ui.ActionBar.r6.V(m10, i12, e6Var);
        m10.setGravity(17);
        m10.setTextSize(1, 12.0f);
        frameLayout.addView(m10, mf.d(-1, -2.0f, 48, 0.0f, 107.0f, 0.0f, 0.0f));
        o2 o2Var = new o2(0, context, this);
        this.K = o2Var;
        TextView textView2 = new TextView(context);
        this.M = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(-13397548);
        frameLayout.addView(o2Var, mf.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 11.0f));
        x2 x2Var = new x2(context, 0);
        this.L = x2Var;
        x2Var.setBackgroundColor(-16776961);
        o2Var.addView(x2Var, mf.c(0.0f, 0));
        o2Var.addView(textView2, mf.e(-2, 26, 17));
        if (org.telegram.ui.ActionBar.k6.I.q()) {
            i10 = 518759725;
        } else {
            i10 = 1088989954;
        }
        x2Var.setBackground(new w2(i10));
        TextView textView3 = new TextView(context);
        this.N = textView3;
        textView3.setTextSize(1, 10.66f);
        textView3.setGravity(17);
        if (org.telegram.ui.ActionBar.k6.I.q()) {
            i11 = -1333971;
        } else {
            i11 = -2722014;
        }
        textView3.setTextColor(i11);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, mf.d(-2, -2.0f, 49, 0.0f, 161.0f, 0.0f, 8.0f));
        this.h = new u8((org.telegram.ui.ActionBar.e6) null);
        k9 k9Var2 = new k9(context);
        this.f908n = k9Var2;
        k9Var2.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        k9Var2.setVisibility(8);
        FrameLayout.LayoutParams d10 = mf.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f);
        this.f913r = d10;
        frameLayout.addView(k9Var2, d10);
        this.f915s = mf.d(20, 20.0f, 51, 5.0f, 5.0f, 2.0f, 2.0f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f920w = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.3f);
        frameLayout2.setScaleY(0.3f);
        frameLayout2.setVisibility(8);
        ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131232201);
        e10.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        e10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(e10, mf.a(12.66f, 12.66f, 17));
        frameLayout.addView(frameLayout2, mf.d(20, 20.0f, 51, 2.0f, 2.0f, 2.0f, 2.0f));
        ImageView imageView = new ImageView(context);
        this.f921x = imageView;
        imageView.setImageResource(2131231954);
        imageView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, mf.d(20, 20.0f, 51, 3.0f, 3.0f, 3.0f, 3.0f));
        TextView textView4 = new TextView(context);
        this.f922y = textView4;
        textView4.setTextSize(1, 10.0f);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        textView4.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        textView4.setGravity(17);
        textView4.setTextColor(-1);
        frameLayout.addView(textView4, mf.d(-2, 17.0f, 51, 4.0f, 4.0f, 0.0f, 0.0f));
        textView4.setVisibility(8);
        setImportantForAccessibility(1);
        frameLayout.setImportantForAccessibility(4);
        r2Var.setImportantForAccessibility(2);
    }

    private TL_stars.TL_starGiftUnique getUniqueStarGift() {
        TL_stars.SavedStarGift savedStarGift = this.f901f0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) starGift;
            }
            return null;
        }
        return null;
    }

    private void setRibbonColorKey(int i3) {
        this.f900f.setColor(org.telegram.ui.ActionBar.k6.w0(i3, this.f893b));
        this.f910o0 = i3;
    }

    public final void a() {
        int i3;
        int i10;
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        this.f919v0 = q10;
        if (this.f918u0) {
            i3 = 1090519039;
        } else if (q10) {
            i3 = 518759725;
        } else {
            i3 = 1088989954;
        }
        if (q10) {
            i10 = -1333971;
        } else if (this.f917t0 == 2) {
            i10 = -4229632;
        } else {
            i10 = -2722014;
        }
        this.L.setBackground(new w2(i3));
        this.M.setTextColor(i10);
        ImageView imageView = this.f921x;
        imageView.setColorFilter(i10);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(10.0f), i3));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Aj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ik));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.kk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    public void b(d60 d60Var, Canvas canvas, float f10, float f11, float f12) {
        float f13;
        float f14;
        o2 o2Var;
        float f15;
        ImageView imageView;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        float f16;
        Canvas canvas2 = canvas;
        k9 k9Var = this.f908n;
        k9 k9Var2 = this.E;
        m2 m2Var = this.f898e;
        r2 r2Var = this.f900f;
        Rect rect = this.T;
        FrameLayout frameLayout = this.f920w;
        ImageView imageView2 = this.f921x;
        o2 o2Var2 = this.K;
        vg.y0 y0Var = this.G;
        canvas2.save();
        canvas2.scale(getScaleX(), getScaleY(), f10 / 2.0f, f11 / 2.0f);
        TL_stars.TL_starGiftUnique uniqueStarGift = getUniqueStarGift();
        if (uniqueStarGift != null) {
            f13 = org.telegram.messenger.g0.L(63.0f) * f12;
        } else {
            f13 = 0.0f;
        }
        m2Var.setBounds(0, 0, (int) f10, (int) f11);
        m2Var.b(canvas2, f12);
        m2Var.getPadding(rect);
        float W1 = org.telegram.messenger.g0.W1(f12, org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(120.0f));
        float f17 = f11 - f13;
        k9Var2.getImageReceiver().y0((f10 - W1) / 2.0f, (f17 - W1) / 2.0f, W1, W1);
        k9Var2.getImageReceiver().h(canvas2, null);
        ch0 B = k9Var2.getImageReceiver().B();
        if (B != null && B.f32734l0) {
            d60Var.invalidate();
        }
        if (y0Var.getVisibility() == 0 && y0Var.getAlpha() > 0.0f) {
            canvas2.save();
            canvas2.translate((f10 - y0Var.getMeasuredWidth()) / 2.0f, org.telegram.messenger.g0.T1(y0Var.getY(), (f17 - y0Var.getMeasuredHeight()) / 2.0f, f12));
            f14 = 1.0f;
            o2Var = o2Var2;
            f15 = 0.0f;
            imageView = imageView2;
            tL_starGiftUnique = uniqueStarGift;
            canvas2.saveLayerAlpha(0.0f, 0.0f, y0Var.getWidth(), y0Var.getHeight(), (int) (y0Var.getAlpha() * (1.0f - f12) * 255.0f), 31);
            y0Var.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        } else {
            f14 = 1.0f;
            o2Var = o2Var2;
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
        if (k9Var.getVisibility() == 0 && k9Var.getAlpha() > f15) {
            canvas2.save();
            canvas2.translate(org.telegram.messenger.g0.L(2.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top);
            k9Var.draw(canvas2);
            canvas2.restore();
        }
        if (r2Var.getVisibility() == 0 && r2Var.getAlpha() > f15) {
            canvas2.save();
            canvas2.translate(f10 - org.telegram.messenger.g0.L(f14), org.telegram.messenger.g0.L(2.0f));
            f16 = f14;
            float T1 = org.telegram.messenger.g0.T1(f16, 1.25f, f12);
            canvas2.scale(T1, T1);
            canvas2.translate(-r2Var.getWidth(), f15);
            r2Var.draw(canvas2);
            canvas2.restore();
        } else {
            f16 = f14;
        }
        if (tL_starGiftUnique != null) {
            if (this.R == null) {
                this.R = new ly0(tL_starGiftUnique.title, 20.0f, org.telegram.messenger.g0.o());
            }
            if (this.S == null) {
                this.S = new ly0(bd.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 13.0f, null);
            }
            ly0 ly0Var = this.R;
            ly0Var.f35929p = f10 - org.telegram.messenger.g0.L(8.0f);
            float f18 = f16 - f12;
            ly0Var.c((f10 - this.R.k()) / 2.0f, ((f11 - org.telegram.messenger.g0.L(40.0f)) - (this.R.i() / 2.0f)) + (org.telegram.messenger.g0.L(50.0f) * f18), f12, -1, canvas);
            ly0 ly0Var2 = this.S;
            ly0Var2.f35929p = f10 - org.telegram.messenger.g0.L(8.0f);
            ly0Var2.c((f10 - this.S.k()) / 2.0f, ((f11 - org.telegram.messenger.g0.L(19.0f)) - (this.S.i() / 2.0f)) + (org.telegram.messenger.g0.L(50.0f) * f18), 0.6f * f12, -1, canvas);
            canvas2 = canvas;
        }
        if (o2Var != null && o2Var.getVisibility() == 0) {
            canvas2.save();
            canvas2.translate(o2Var.getX(), o2Var.getY());
            canvas2.saveLayerAlpha(0.0f, 0.0f, o2Var.getWidth(), o2Var.getHeight(), (int) (o2Var.getAlpha() * (f16 - f12) * 255.0f), 31);
            o2Var.draw(canvas2);
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
        if (this.f909n0 == null) {
            wo woVar = new wo(21, getContext(), null);
            this.f909n0 = woVar;
            woVar.b(-1, org.telegram.ui.ActionBar.k6.f27878d6, org.telegram.ui.ActionBar.k6.f28008k7);
            this.f909n0.setDrawUnchecked(false);
            this.d.addView(this.f909n0, mf.d(24, 24.0f, 51, 4.0f, 4.0f, 4.0f, 4.0f));
        }
        this.f908n.setVisibility(8);
        this.f909n0.a(z10, z11);
    }

    public final void d(boolean z10, boolean z11) {
        int i3;
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
        FrameLayout frameLayout = this.f920w;
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
            scaleX.scaleY(f13).withEndAction(new n2(this, z10, 1)).start();
        } else {
            if (z10) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            frameLayout.setVisibility(i3);
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
        if (!this.U && this.W && !this.f904i0 && (savedStarGift = this.f901f0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z12 = true;
        }
        g(z12, z11);
        l();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
        float d = this.f892a0.d(this.W);
        if (d > 0.0f) {
            this.f895c.a(canvas, d);
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
            this.f892a0.a(z10);
        }
        invalidate();
        if (!this.U && z10 && !this.f904i0 && (savedStarGift = this.f901f0) != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            z12 = true;
        } else {
            z12 = false;
        }
        g(z12, z11);
    }

    public final void f(boolean z10, boolean z11) {
        float f10;
        float f11;
        this.f898e.f(z10, z11);
        float f12 = 0.0f;
        ImageView imageView = this.f921x;
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
            translationX.translationY(f12).setDuration(320L).setInterpolator(xq.h).start();
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
        int i3 = 0;
        float f13 = 0.3f;
        vg.y0 y0Var = this.H;
        if (z11) {
            y0Var.setVisibility(0);
            ViewPropertyAnimator animate = y0Var.animate();
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
            scaleX.scaleY(f13).withEndAction(new n2(this, z10, 0)).start();
            return;
        }
        if (!z10) {
            i3 = 8;
        }
        y0Var.setVisibility(i3);
        if (z10) {
            f12 = 1.0f;
        }
        y0Var.setAlpha(f12);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.3f;
        }
        y0Var.setScaleX(f10);
        if (z10) {
            f13 = 1.0f;
        }
        y0Var.setScaleY(f13);
    }

    public TL_stars.StarGift getGift() {
        return this.f896c0;
    }

    public long getGiftId() {
        TL_stars.StarGift starGift = this.f896c0;
        if (starGift != null) {
            return starGift.f27230id;
        }
        return 0L;
    }

    public vg.j getPremiumTier() {
        return this.f894b0;
    }

    public TL_stars.SavedStarGift getSavedGift() {
        return this.f901f0;
    }

    public final void h(org.telegram.tgnet.tl.TL_stars.StarGift r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: ai.q2.h(org.telegram.tgnet.tl.TL_stars$StarGift, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final boolean i(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        Integer num;
        Integer num2;
        int i3;
        float f10;
        float f11;
        int i10;
        long j10;
        boolean z12;
        x2 x2Var;
        boolean z13;
        boolean z14;
        boolean z15;
        float f12;
        float f13;
        ma maVar = this.O;
        if (maVar != null) {
            maVar.run();
            this.O = null;
        }
        j(savedStarGift.gift.getDocument(), savedStarGift);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) e9.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        m2 m2Var = this.f898e;
        m2Var.d(stargiftattributebackdrop);
        m2Var.e((TL_stars.starGiftAttributePattern) e9.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class));
        m2Var.g(null);
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        k9 k9Var = this.E;
        k9Var.setTranslationY(0.0f);
        vg.y0 y0Var = this.G;
        y0Var.I = true;
        y0Var.J = false;
        y0Var.invalidate();
        if (stargiftattributebackdrop != null) {
            num = Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num = null;
        }
        y0Var.setBlendWithColor(num);
        vg.y0 y0Var2 = this.H;
        y0Var2.I = true;
        y0Var2.J = false;
        y0Var2.invalidate();
        if (stargiftattributebackdrop != null) {
            num2 = Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.75f, stargiftattributebackdrop.center_color | (-16777216)));
        } else {
            num2 = null;
        }
        y0Var2.setBlendWithColor(num2);
        if (savedStarGift.gift.resale_ton_only) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        ImageView imageView = this.f921x;
        imageView.setVisibility(i3);
        FrameLayout frameLayout = this.f920w;
        if (stargiftattributebackdrop != null) {
            frameLayout.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.k6.b(0.1f, -0.2f, stargiftattributebackdrop.center_color | (-16777216))));
        } else {
            int L = org.telegram.messenger.g0.L(20.0f);
            int i11 = org.telegram.ui.ActionBar.k6.Ci;
            org.telegram.ui.ActionBar.e6 e6Var = this.f893b;
            org.telegram.ui.ActionBar.r6.C(frameLayout, org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i11, e6Var)), org.telegram.ui.ActionBar.r6.N(i11), e6Var);
        }
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.gravity = 17;
        k9Var.setLayoutParams(layoutParams);
        float f14 = 0.4f;
        if (this.m0 == savedStarGift) {
            y0Var.setVisibility(0);
            ViewPropertyAnimator animate = y0Var.animate();
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
            scaleX.scaleY(f14).setDuration(350L).setInterpolator(xq.h).withEndAction(new a1.f(4, this, savedStarGift)).start();
        } else {
            if (savedStarGift.unsaved) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            y0Var.setAlpha(f10);
            if (savedStarGift.unsaved) {
                f11 = 1.0f;
            } else {
                f11 = 0.4f;
            }
            y0Var.setScaleX(f11);
            if (savedStarGift.unsaved) {
                f14 = 1.0f;
            }
            y0Var.setScaleY(f14);
            if (savedStarGift.unsaved) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            y0Var.setVisibility(i10);
        }
        boolean z16 = savedStarGift.gift instanceof TL_stars.TL_starGiftUnique;
        k9 k9Var2 = this.f908n;
        k9Var2.setColorFilter(null);
        this.f912q0 = false;
        k9Var2.setLayoutParams(this.f913r);
        int i12 = this.f891a;
        if (z16 && savedStarGift.name_hidden) {
            k9Var2.setVisibility(8);
            j10 = 0;
        } else if (savedStarGift.name_hidden) {
            k9Var2.setVisibility(0);
            xp a10 = rb.a(44, "anonymous");
            j10 = 0;
            int L2 = org.telegram.messenger.g0.L(16.0f);
            int L3 = org.telegram.messenger.g0.L(16.0f);
            a10.f40441e = L2;
            a10.f40442f = L3;
            k9Var2.setImageDrawable(a10);
        } else {
            j10 = 0;
            long o10 = org.telegram.messenger.m5.o(savedStarGift.from_id);
            int i13 = (o10 > 0L ? 1 : (o10 == 0L ? 0 : -1));
            u8 u8Var = this.h;
            if (i13 > 0) {
                TLRPC.User a22 = hp.s1(i12).a2(Long.valueOf(o10));
                if (a22 != null) {
                    k9Var2.setVisibility(0);
                    u8Var.r(a22);
                    k9Var2.e(a22, u8Var);
                } else {
                    k9Var2.setVisibility(8);
                }
            } else {
                TLRPC.Chat M0 = hp.s1(i12).M0(Long.valueOf(-o10));
                if (M0 != null) {
                    k9Var2.setVisibility(0);
                    u8Var.q(M0);
                    k9Var2.e(M0, u8Var);
                } else {
                    k9Var2.setVisibility(8);
                }
            }
        }
        x2 x2Var2 = this.L;
        o2 o2Var = this.K;
        TextView textView = this.M;
        if (stargiftattributebackdrop != null && savedStarGift.gift.resell_amount != null) {
            textView.setVisibility(0);
            FrameLayout.LayoutParams layoutParams2 = this.F;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            textView.setTextSize(1, 12.0f);
            wp[] wpVarArr = new wp[1];
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift.resale_ton_only && org.telegram.messenger.m5.o(starGift.owner_id) == h10.i(i12).e()) {
                z15 = true;
                textView.setText(wb.s1(wb.X0(true, "XTR " + ((Object) wb.M0(savedStarGift.gift.getResellAmount(dg.b.f8926b).o(), 1.0f, ',')), 0.95f, wpVarArr, 0.0f, 1.0f), true));
            } else {
                z15 = true;
                textView.setText(wb.U0("XTR " + bd.E(savedStarGift.gift.getResellStars(), ','), 0.95f, wpVarArr));
            }
            wp wpVar = wpVarArr[0];
            if (wpVar != null) {
                wpVar.f40045r = 0.0f;
                wpVar.f40046s = org.telegram.messenger.g0.L(0.5f);
            }
            int w10 = org.telegram.ui.ActionBar.k6.w(stargiftattributebackdrop.center_color | (-16777216), org.telegram.ui.ActionBar.k6.r1(0.55f, stargiftattributebackdrop.pattern_color | (-16777216)));
            this.f917t0 = 0;
            x2Var2.setBackground(new w2(1895825407, w10));
            textView.setTextColor(-1);
            imageView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(10.0f), w10));
            imageView.setColorFilter(-1);
            ((FrameLayout.LayoutParams) o2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) o2Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(79.0f);
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
                k2.p1.u(textView, 1, 12.0f, null, 2131750067);
                z12 = true;
                x2Var = x2Var2;
            } else {
                textView.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                textView.setTextSize(1, 12.0f);
                StringBuilder sb2 = new StringBuilder("XTR ");
                TL_stars.StarGift starGift2 = savedStarGift.gift;
                long j11 = starGift2.stars;
                z12 = true;
                x2Var = x2Var2;
                long j12 = savedStarGift.convert_stars;
                if (j12 <= j10) {
                    j12 = starGift2.convert_stars;
                }
                textView.setText(wb.a1(false, k2.p1.l(Math.max(j11, j12), ',', sb2), 0.66f, null));
            }
            if (z16) {
                this.f917t0 = 0;
                textView.setTextColor(-1);
                x2Var.setBackground(new w2(1090519039));
                imageView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(10.0f), 1090519039));
                imageView.setColorFilter(-1);
            } else {
                this.f917t0 = 2;
                this.f918u0 = false;
                a();
            }
            ((FrameLayout.LayoutParams) o2Var.getLayoutParams()).gravity = 49;
            ((ViewGroup.MarginLayoutParams) o2Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(103.0f);
        }
        this.N.setVisibility(8);
        this.m0 = savedStarGift;
        this.f906k0 = null;
        TL_stars.SavedStarGift savedStarGift2 = this.f901f0;
        this.f894b0 = null;
        this.f896c0 = null;
        this.f899e0 = false;
        this.f901f0 = savedStarGift;
        this.f902g0 = false;
        this.f903h0 = false;
        this.f904i0 = z11;
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
        k9 k9Var = this.E;
        if (document == null) {
            k9Var.b();
            this.f907l0 = null;
        } else if (this.f907l0 == document) {
        } else {
            this.f907l0 = document;
            TLRPC.PhotoSize w10 = w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            k9Var.m(ac.b(document), "80_80_nolimit_pcache", ac.c(w10, document), "80_80_nolimit_pcache", org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.f27824a7, 0.3f, null), tLObject);
        }
    }

    public final void k(boolean z10, boolean z11, float f10) {
        TL_stars.TL_starGiftUnique uniqueStarGift;
        String l10;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i3;
        ColorMatrixColorFilter colorMatrixColorFilter;
        boolean z12;
        if (this.Q != f10) {
            this.Q = f10;
            TL_stars.TL_starGiftUnique uniqueStarGift2 = getUniqueStarGift();
            if (uniqueStarGift2 == null) {
                stargiftattributebackdrop = null;
            } else {
                stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) e9.l(uniqueStarGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
            }
            if (stargiftattributebackdrop == null) {
                i3 = -11184811;
            } else {
                i3 = stargiftattributebackdrop.pattern_color | (-16777216);
            }
            float f11 = 1.0f - f10;
            if (f10 <= 0.0f) {
                colorMatrixColorFilter = null;
            } else {
                colorMatrixColorFilter = new ColorMatrixColorFilter(new float[]{f11, 0.0f, 0.0f, 0.0f, Color.red(i3) * f10, 0.0f, f11, 0.0f, 0.0f, Color.green(i3) * f10, 0.0f, 0.0f, f11, 0.0f, Color.blue(i3) * f10, 0.0f, 0.0f, 0.0f, 1.0f - (0.5686275f * f10), 0.0f});
            }
            k9 k9Var = this.E;
            k9Var.setColorFilter(colorMatrixColorFilter);
            ImageReceiver imageReceiver = k9Var.getImageReceiver();
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i10 == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            imageReceiver.f21274v0 = z12;
            if (i10 > 0) {
                k9Var.getImageReceiver().Q0();
                ch0 B = k9Var.getImageReceiver().B();
                if (B != null) {
                    B.N(0, false, false);
                }
            }
            k9Var.invalidate();
        }
        if (this.P != z10) {
            this.P = z10;
            if (getUniqueStarGift() != null) {
                if (z10) {
                    l10 = bd.M0(2131743114, null);
                } else {
                    l10 = k2.p1.l(uniqueStarGift.num, ',', new StringBuilder("#"));
                }
                r2 r2Var = this.f900f;
                if (z11) {
                    r2Var.getClass();
                    r2Var.f941b = l10;
                    r2Var.f940a.g(10, l10);
                    return;
                }
                r2Var.b(l10, true);
            }
        }
    }

    public final void l() {
        TL_stars.SavedStarGift savedStarGift = this.f901f0;
        r2 r2Var = this.f900f;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                r2Var.setVisibility(0);
                if (this.f901f0.gift.resell_amount != null) {
                    int i3 = org.telegram.ui.ActionBar.k6.f27878d6;
                    org.telegram.ui.ActionBar.e6 e6Var = this.f893b;
                    int w10 = org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), org.telegram.ui.ActionBar.k6.r1(0.04f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var)));
                    setRibbonColorKey(org.telegram.ui.ActionBar.k6.ik);
                    r2Var.setStrokeColor(w10);
                    this.f911p0 = true;
                    r2Var.setBackdrop(null);
                    r2Var.b(bd.M0(2131750097, null), false);
                    return;
                }
                setRibbonColorKey(org.telegram.ui.ActionBar.k6.zj);
                r2Var.setStrokeColor(0);
                this.f911p0 = false;
                r2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) e9.l(this.f901f0.gift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                r2Var.b(k2.p1.l(this.f901f0.gift.num, ',', new StringBuilder("#")), true);
                return;
            } else if (starGift.limited) {
                r2Var.setVisibility(0);
                setRibbonColorKey(org.telegram.ui.ActionBar.k6.zj);
                r2Var.setStrokeColor(0);
                this.f911p0 = false;
                r2Var.setBackdrop(null);
                r2Var.b(bd.a0(null, null, 2131750143, org.telegram.messenger.g0.o0(this.f901f0.gift.availability_total, 0)), true);
                return;
            } else {
                r2Var.setBackdrop(null);
                r2Var.setVisibility(8);
                return;
            }
        }
        TL_stars.StarGift starGift2 = this.f896c0;
        if (starGift2 != null) {
            if (!this.f903h0 && !this.f905j0) {
                if (this.f902g0 && starGift2.availability_resale > 0) {
                    r2Var.setVisibility(0);
                    setRibbonColorKey(org.telegram.ui.ActionBar.k6.ik);
                    r2Var.setStrokeColor(0);
                    this.f911p0 = false;
                    r2Var.setBackdrop(null);
                    r2Var.b(bd.M0(2131750038, null), false);
                    return;
                } else if (this.f899e0) {
                    r2Var.setVisibility(0);
                    setRibbonColorKey(org.telegram.ui.ActionBar.k6.zj);
                    r2Var.setStrokeColor(0);
                    this.f911p0 = false;
                    r2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) e9.l(this.f896c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    r2Var.b(bd.a0(null, null, 2131750143, org.telegram.messenger.g0.o0(this.f896c0.availability_issued, 0)), true);
                    return;
                } else {
                    boolean z10 = starGift2.limited;
                    if (z10 && starGift2.availability_remains <= 0) {
                        r2Var.setVisibility(0);
                        setRibbonColorKey(org.telegram.ui.ActionBar.k6.Aj);
                        r2Var.setStrokeColor(0);
                        this.f911p0 = false;
                        r2Var.setBackdrop(null);
                        r2Var.b(bd.M0(2131749984, null), true);
                        return;
                    } else if (starGift2.auction) {
                        r2Var.setVisibility(0);
                        r2Var.setBackdrop(null);
                        this.f910o0 = -1;
                        r2Var.a(-2650077, -4227818);
                        r2Var.setStrokeColor(0);
                        this.f911p0 = false;
                        if (this.f896c0.auction_start_date > ConnectionsManager.getInstance(this.f891a).getCurrentTime()) {
                            r2Var.b(bd.M0(2131750141, null), true);
                            return;
                        } else {
                            r2Var.b(bd.M0(2131750142, null), true);
                            return;
                        }
                    } else if (starGift2.require_premium) {
                        r2Var.setVisibility(0);
                        r2Var.setBackdrop(null);
                        this.f910o0 = -1;
                        r2Var.a(-2650077, -4227818);
                        r2Var.setStrokeColor(0);
                        this.f911p0 = false;
                        r2Var.b(bd.M0(2131750140, null), true);
                        return;
                    } else if (z10) {
                        r2Var.setVisibility(0);
                        setRibbonColorKey(org.telegram.ui.ActionBar.k6.zj);
                        r2Var.setStrokeColor(0);
                        this.f911p0 = false;
                        r2Var.setBackdrop(null);
                        r2Var.b(bd.M0(2131750139, null), true);
                        return;
                    } else {
                        r2Var.setBackdrop(null);
                        r2Var.setStrokeColor(0);
                        this.f911p0 = false;
                        r2Var.setVisibility(8);
                        return;
                    }
                }
            }
            r2Var.setVisibility(0);
            setRibbonColorKey(org.telegram.ui.ActionBar.k6.zj);
            r2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) e9.l(this.f896c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
            r2Var.setStrokeColor(0);
            this.f911p0 = false;
            r2Var.b(k2.p1.l(this.f896c0.num, ',', new StringBuilder("#")), true);
            return;
        }
        vg.j jVar = this.f894b0;
        if (jVar != null) {
            if (jVar.b() > 0) {
                r2Var.setVisibility(0);
                r2Var.setBackdrop(null);
                this.f910o0 = -1;
                r2Var.a(-2535425, -8229377);
                r2Var.setStrokeColor(0);
                this.f911p0 = false;
                String a02 = bd.a0(null, null, 2131749672, Integer.valueOf(this.f894b0.b()));
                r2Var.f941b = a02;
                r2Var.f940a.f(12, a02, true);
                return;
            }
            r2Var.setVisibility(8);
            r2Var.setBackdrop(null);
            r2Var.setStrokeColor(0);
            this.f911p0 = false;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: ai.q2.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public void setImageLayer(int i3) {
        this.E.setLayerNum(i3);
    }

    public void setImageSize(int i3) {
        FrameLayout.LayoutParams layoutParams = this.F;
        layoutParams.width = i3;
        layoutParams.height = i3;
    }

    public void setRibbonColor(int i3) {
        this.f910o0 = -1;
        r2 r2Var = this.f900f;
        r2Var.setColor(i3);
        r2Var.invalidate();
    }

    public void setRibbonText(String str) {
        this.f900f.b(str, true);
    }

    public void setRibbonTextOneOf(int i3) {
        r2 r2Var = this.f900f;
        r2Var.setVisibility(0);
        setRibbonColorKey(org.telegram.ui.ActionBar.k6.zj);
        r2Var.setStrokeColor(0);
        this.f911p0 = false;
        r2Var.setBackdrop((TL_stars.starGiftAttributeBackdrop) e9.l(this.f896c0.attributes, TL_stars.starGiftAttributeBackdrop.class));
        r2Var.b(bd.a0(null, null, 2131750143, org.telegram.messenger.g0.o0(i3, 0)), true);
    }

    @Override
    public final void updateColors() {
        int w02;
        k9 k9Var;
        int w03;
        int i3;
        try {
            boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
            if (q10 != this.f919v0) {
                this.f919v0 = q10;
                if (this.f917t0 != 0 && this.L != null && this.M != null && this.f921x != null) {
                    a();
                }
                TextView textView = this.N;
                if (textView != null) {
                    if (q10) {
                        i3 = -1333971;
                    } else {
                        i3 = -2722014;
                    }
                    textView.setTextColor(i3);
                }
            }
            r2 r2Var = this.f900f;
            org.telegram.ui.ActionBar.e6 e6Var = this.f893b;
            if (r2Var != null) {
                int i10 = this.f910o0;
                if (i10 >= 0) {
                    t2 t2Var = r2Var.f940a;
                    ((Paint) t2Var.f40801b).setColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
                    t2Var.invalidateSelf();
                }
                if (this.f911p0) {
                    r2Var.setStrokeColor(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var), org.telegram.ui.ActionBar.k6.r1(0.04f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var))));
                }
                r2Var.invalidate();
            }
            if (this.f912q0 && (k9Var = this.f908n) != null && (w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.kk, e6Var)) != this.f914r0) {
                this.f914r0 = w03;
                k9Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            }
            m2 m2Var = this.f898e;
            if (m2Var != null) {
                int[] iArr = this.f916s0;
                if (iArr != null && m2Var.f808m == iArr && (iArr[0] != (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Aj, e6Var)) || iArr[1] != w02)) {
                    iArr[1] = w02;
                    iArr[0] = w02;
                    m2Var.f809n = null;
                }
                m2Var.invalidateSelf();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
