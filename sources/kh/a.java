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
import c8.na;
import dh.c;
import fh.g;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.rp;
public final class a extends FrameLayout implements te.b, c6 {
    public final te.a f18648a;
    public final te.a f18649b;
    public ImageView f18650c;
    public ImageView d;
    public rp f18651e;
    public i6 f18652f;
    public float h;
    public int f18653n;
    public g f18654r;

    public a(Context context) {
        super(context);
        kr krVar = kr.h;
        this.f18648a = new te.a(0, this, krVar, 320L, false);
        this.f18649b = new te.a(1, this, krVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(Context context, c cVar, gh.a aVar, i6 i6Var) {
        int i7 = n6.Nl;
        int w02 = n6.w0(i7, i6Var);
        a aVar2 = new a(context);
        aVar2.f18652f = i6Var;
        aVar2.setBlurredBackgroundDrawable(cVar.c(aVar2, aVar, false));
        aVar2.setIconColor(w02);
        int L = g0.L(22.0f);
        int r12 = n6.r1(0.15f, w02);
        int L2 = g0.L(6.0f);
        y Y = n6.Y(L, r12, L2, L2, L2, L2);
        q6 K = u6.K(0.15f, i7);
        aVar2.setBackground(Y);
        u6.j(aVar2, Y, null, K, i6Var);
        return aVar2;
    }

    public static a d(Context context, c cVar, gh.a aVar, i6 i6Var, int i7, int i10) {
        int i11 = n6.Nl;
        int w02 = n6.w0(i11, i6Var);
        a aVar2 = new a(context);
        aVar2.f18652f = i6Var;
        aVar2.setBlurredBackgroundDrawable(cVar.c(aVar2, aVar, false));
        aVar2.f(i7, i10);
        aVar2.setIconColor(w02);
        int L = g0.L(22.0f);
        int r12 = n6.r1(0.15f, w02);
        int L2 = g0.L(6.0f);
        y Y = n6.Y(L, r12, L2, L2, L2, L2);
        q6 K = u6.K(0.15f, i11);
        aVar2.setBackground(Y);
        u6.j(aVar2, Y, null, K, i6Var);
        return aVar2;
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
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
        float f10 = 1.0f - this.f18648a.f57779e;
        float T1 = g0.T1(f10 / 2.0f, f10, this.f18649b.f57779e);
        ImageView imageView = this.f18650c;
        if (imageView != null) {
            imageView.setAlpha(T1);
            this.f18650c.setScaleX(g0.T1(0.4f, 1.0f, f10));
            this.f18650c.setScaleY(g0.T1(0.4f, 1.0f, f10) * this.h);
            ImageView imageView2 = this.f18650c;
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
        float f10 = this.f18648a.f57779e;
        float T1 = g0.T1(f10 / 2.0f, f10, this.f18649b.f57779e);
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
                this.f18651e.f39373c = -1L;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f18654r.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f18649b.a(z10, z11);
    }

    public final void f(int i7, int i10) {
        if (this.f18650c == null) {
            if (i7 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.f18650c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.f18650c, na.e(i10, i10, 17));
            a();
        }
        this.f18650c.setImageResource(i7);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f18654r.setBounds(0, 0, i7, i10);
    }

    public void setBlurredBackgroundDrawable(g gVar) {
        this.f18654r = gVar;
        gVar.q(g0.L(6.0f));
        this.f18654r.r(g0.L(22.0f));
    }

    @Override
    public void setEnabled(boolean z10) {
        e(z10, false);
    }

    public void setIcon(int i7) {
        f(i7, 48);
    }

    public void setIconColor(int i7) {
        BlendMode blendMode;
        ImageView imageView = this.f18650c;
        if (imageView == null) {
            return;
        }
        this.f18653n = i7;
        if (Build.VERSION.SDK_INT >= 29) {
            blendMode = BlendMode.SRC_IN;
            imageView.setColorFilter(new BlendModeColorFilter(i7, blendMode));
            return;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
    }

    public void setIconPadding(int i7) {
        ImageView imageView = this.f18650c;
        if (imageView != null) {
            imageView.setPadding(0, i7, 0, 0);
        }
    }

    @Override
    public final void updateColors() {
        g gVar = this.f18654r;
        if (gVar != null) {
            gVar.updateColors();
            invalidate();
        }
        int w02 = n6.w0(n6.Nl, this.f18652f);
        if (this.f18650c != null && w02 != this.f18653n) {
            setIconColor(w02);
        }
        int L = g0.L(22.0f);
        int r12 = n6.r1(0.15f, w02);
        if (getBackground() instanceof RippleDrawable) {
            n6.H1(getBackground(), r12, true);
            return;
        }
        int L2 = g0.L(6.0f);
        setBackground(n6.Y(L, r12, L2, L2, L2, L2));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
