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
import c8.ja;
import dh.c;
import fh.g;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lp;
public final class a extends FrameLayout implements te.b, z5 {
    public final te.a f18160a;
    public final te.a f18161b;
    public ImageView f18162c;
    public ImageView d;
    public lp f18163e;
    public e6 f18164f;
    public float h;
    public int f18165n;
    public g f18166r;

    public a(Context context) {
        super(context);
        er erVar = er.h;
        this.f18160a = new te.a(0, this, erVar, 320L, false);
        this.f18161b = new te.a(1, this, erVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(Context context, c cVar, gh.a aVar, e6 e6Var) {
        int i7 = j6.Nl;
        int w02 = j6.w0(i7, e6Var);
        a aVar2 = new a(context);
        aVar2.f18164f = e6Var;
        aVar2.setBlurredBackgroundDrawable(cVar.c(aVar2, aVar, false));
        aVar2.setIconColor(w02);
        int L = g0.L(22.0f);
        int r12 = j6.r1(0.15f, w02);
        int L2 = g0.L(6.0f);
        y Y = j6.Y(L, r12, L2, L2, L2, L2);
        m6 K = q6.K(0.15f, i7);
        aVar2.setBackground(Y);
        q6.j(aVar2, Y, null, K, e6Var);
        return aVar2;
    }

    public static a d(Context context, c cVar, gh.a aVar, e6 e6Var, int i7, int i10) {
        int i11 = j6.Nl;
        int w02 = j6.w0(i11, e6Var);
        a aVar2 = new a(context);
        aVar2.f18164f = e6Var;
        aVar2.setBlurredBackgroundDrawable(cVar.c(aVar2, aVar, false));
        aVar2.f(i7, i10);
        aVar2.setIconColor(w02);
        int L = g0.L(22.0f);
        int r12 = j6.r1(0.15f, w02);
        int L2 = g0.L(6.0f);
        y Y = j6.Y(L, r12, L2, L2, L2, L2);
        m6 K = q6.K(0.15f, i11);
        aVar2.setBackground(Y);
        q6.j(aVar2, Y, null, K, e6Var);
        return aVar2;
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
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
        float f10 = 1.0f - this.f18160a.f57085e;
        float T1 = g0.T1(f10 / 2.0f, f10, this.f18161b.f57085e);
        ImageView imageView = this.f18162c;
        if (imageView != null) {
            imageView.setAlpha(T1);
            this.f18162c.setScaleX(g0.T1(0.4f, 1.0f, f10));
            this.f18162c.setScaleY(g0.T1(0.4f, 1.0f, f10) * this.h);
            ImageView imageView2 = this.f18162c;
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
        float f10 = this.f18160a.f57085e;
        float T1 = g0.T1(f10 / 2.0f, f10, this.f18161b.f57085e);
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
                this.f18163e.f36870c = -1L;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f18166r.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f18161b.a(z10, z11);
    }

    public final void f(int i7, int i10) {
        if (this.f18162c == null) {
            if (i7 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.f18162c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.f18162c, ja.e(i10, i10, 17));
            a();
        }
        this.f18162c.setImageResource(i7);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f18166r.setBounds(0, 0, i7, i10);
    }

    public void setBlurredBackgroundDrawable(g gVar) {
        this.f18166r = gVar;
        gVar.q(g0.L(6.0f));
        this.f18166r.r(g0.L(22.0f));
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
        ImageView imageView = this.f18162c;
        if (imageView == null) {
            return;
        }
        this.f18165n = i7;
        if (Build.VERSION.SDK_INT >= 29) {
            blendMode = BlendMode.SRC_IN;
            imageView.setColorFilter(new BlendModeColorFilter(i7, blendMode));
            return;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
    }

    public void setIconPadding(int i7) {
        ImageView imageView = this.f18162c;
        if (imageView != null) {
            imageView.setPadding(0, i7, 0, 0);
        }
    }

    @Override
    public final void updateColors() {
        g gVar = this.f18166r;
        if (gVar != null) {
            gVar.updateColors();
            invalidate();
        }
        int w02 = j6.w0(j6.Nl, this.f18164f);
        if (this.f18162c != null && w02 != this.f18165n) {
            setIconColor(w02);
        }
        int L = g0.L(22.0f);
        int r12 = j6.r1(0.15f, w02);
        if (getBackground() instanceof RippleDrawable) {
            j6.H1(getBackground(), r12, true);
            return;
        }
        int L2 = g0.L(6.0f);
        setBackground(j6.Y(L, r12, L2, L2, L2, L2));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
