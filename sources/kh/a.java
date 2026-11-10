package kh;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ha;
import dh.c;
import fh.g;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.wq;
public final class a extends FrameLayout implements te.b, c6 {
    public final te.a f17594a;
    public final te.a f17595b;
    public ImageView f17596c;
    public ImageView d;
    public cp f17597e;
    public h6 f17598f;
    public float h;
    public int f17599n;
    public g f17600r;

    public a(Context context) {
        super(context);
        wq wqVar = wq.h;
        this.f17594a = new te.a(0, this, wqVar, 320L, false);
        this.f17595b = new te.a(1, this, wqVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(Context context, c cVar, gh.a aVar, h6 h6Var) {
        int i7 = m6.Kl;
        int w02 = m6.w0(i7, h6Var);
        a aVar2 = new a(context);
        aVar2.f17598f = h6Var;
        aVar2.setBlurredBackgroundDrawable(cVar.c(aVar2, aVar, false));
        aVar2.setIconColor(w02);
        int L = g0.L(22.0f);
        int r12 = m6.r1(0.15f, w02);
        int L2 = g0.L(6.0f);
        y Y = m6.Y(L, r12, L2, L2, L2, L2);
        p6 K = t6.K(0.15f, i7);
        aVar2.setBackground(Y);
        t6.j(aVar2, Y, null, K, h6Var);
        return aVar2;
    }

    public static a d(Context context, c cVar, gh.a aVar, h6 h6Var, int i7, int i10) {
        int i11 = m6.Kl;
        int w02 = m6.w0(i11, h6Var);
        a aVar2 = new a(context);
        aVar2.f17598f = h6Var;
        aVar2.setBlurredBackgroundDrawable(cVar.c(aVar2, aVar, false));
        aVar2.f(i7, i10);
        aVar2.setIconColor(w02);
        int L = g0.L(22.0f);
        int r12 = m6.r1(0.15f, w02);
        int L2 = g0.L(6.0f);
        y Y = m6.Y(L, r12, L2, L2, L2, L2);
        p6 K = t6.K(0.15f, i11);
        aVar2.setBackground(Y);
        t6.j(aVar2, Y, null, K, h6Var);
        return aVar2;
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            a();
            b();
        }
        if (i7 == 1) {
            a();
            b();
        }
    }

    public final void a() {
        int i7;
        float f10 = 1.0f - this.f17594a.f55498e;
        float T1 = g0.T1(f10 / 2.0f, f10, this.f17595b.f55498e);
        ImageView imageView = this.f17596c;
        if (imageView != null) {
            imageView.setAlpha(T1);
            this.f17596c.setScaleX(g0.T1(0.4f, 1.0f, f10));
            this.f17596c.setScaleY(g0.T1(0.4f, 1.0f, f10) * this.h);
            ImageView imageView2 = this.f17596c;
            if (f10 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView2.setVisibility(i7);
        }
    }

    public final void b() {
        int i7;
        float f10 = this.f17594a.f55498e;
        float T1 = g0.T1(f10 / 2.0f, f10, this.f17595b.f55498e);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setAlpha(T1);
            this.d.setScaleX(g0.T1(0.4f, 1.0f, f10));
            this.d.setScaleY(g0.T1(0.4f, 1.0f, f10));
            if (f10 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            if (this.d.getVisibility() != i7) {
                this.d.setVisibility(i7);
                this.f17597e.f32727c = -1L;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f17600r.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z9, boolean z10) {
        super.setEnabled(z9);
        this.f17595b.a(z9, z10);
    }

    public final void f(int i7, int i10) {
        if (this.f17596c == null) {
            if (i7 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.f17596c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.f17596c, ha.e(i10, i10, 17));
            a();
        }
        this.f17596c.setImageResource(i7);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f17600r.setBounds(0, 0, i7, i10);
    }

    public void setBlurredBackgroundDrawable(g gVar) {
        this.f17600r = gVar;
        gVar.q(g0.L(6.0f));
        this.f17600r.r(g0.L(22.0f));
    }

    @Override
    public void setEnabled(boolean z9) {
        e(z9, false);
    }

    public void setIcon(int i7) {
        f(i7, 48);
    }

    public void setIconColor(int i7) {
        BlendMode blendMode;
        ImageView imageView = this.f17596c;
        if (imageView == null) {
            return;
        }
        this.f17599n = i7;
        if (Build.VERSION.SDK_INT >= 29) {
            blendMode = BlendMode.SRC_IN;
            imageView.setColorFilter(new BlendModeColorFilter(i7, blendMode));
            return;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
    }

    public void setIconPadding(int i7) {
        ImageView imageView = this.f17596c;
        if (imageView != null) {
            imageView.setPadding(0, i7, 0, 0);
        }
    }

    @Override
    public final void updateColors() {
        g gVar = this.f17600r;
        if (gVar != null) {
            gVar.updateColors();
            invalidate();
        }
        int w02 = m6.w0(m6.Kl, this.f17598f);
        if (this.f17596c != null && w02 != this.f17599n) {
            setIconColor(w02);
        }
        int L = g0.L(22.0f);
        int r12 = m6.r1(0.15f, w02);
        if (getBackground() instanceof RippleDrawable) {
            m6.H1(getBackground(), r12, true);
            return;
        }
        int L2 = g0.L(6.0f);
        setBackground(m6.Y(L, r12, L2, L2, L2, L2));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
