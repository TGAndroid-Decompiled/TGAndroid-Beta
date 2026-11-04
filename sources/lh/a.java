package lh;

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
import b8.mf;
import eh.c;
import gh.g;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.xq;
public final class a extends FrameLayout implements qe.b, z5 {
    public final qe.a f18528a;
    public final qe.a f18529b;
    public ImageView f18530c;
    public ImageView d;
    public cp f18531e;
    public e6 f18532f;
    public float h;
    public int f18533n;
    public g f18534r;

    public a(Context context) {
        super(context);
        xq xqVar = xq.h;
        this.f18528a = new qe.a(0, this, xqVar, 320L, false);
        this.f18529b = new qe.a(1, this, xqVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(Context context, c cVar, hh.a aVar, e6 e6Var) {
        int i3 = k6.Kl;
        int w02 = k6.w0(i3, e6Var);
        a aVar2 = new a(context);
        aVar2.f18532f = e6Var;
        aVar2.setBlurredBackgroundDrawable(cVar.c(aVar2, aVar, false));
        aVar2.setIconColor(w02);
        int L = g0.L(22.0f);
        int r12 = k6.r1(0.15f, w02);
        int L2 = g0.L(6.0f);
        y Y = k6.Y(L, r12, L2, L2, L2, L2);
        n6 L3 = r6.L(0.15f, i3);
        aVar2.setBackground(Y);
        r6.k(aVar2, Y, null, L3, e6Var);
        return aVar2;
    }

    public static a d(Context context, c cVar, hh.a aVar, e6 e6Var, int i3, int i10) {
        int i11 = k6.Kl;
        int w02 = k6.w0(i11, e6Var);
        a aVar2 = new a(context);
        aVar2.f18532f = e6Var;
        aVar2.setBlurredBackgroundDrawable(cVar.c(aVar2, aVar, false));
        aVar2.f(i3, i10);
        aVar2.setIconColor(w02);
        int L = g0.L(22.0f);
        int r12 = k6.r1(0.15f, w02);
        int L2 = g0.L(6.0f);
        y Y = k6.Y(L, r12, L2, L2, L2, L2);
        n6 L3 = r6.L(0.15f, i11);
        aVar2.setBackground(Y);
        r6.k(aVar2, Y, null, L3, e6Var);
        return aVar2;
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            a();
            b();
        }
        if (i3 == 1) {
            a();
            b();
        }
    }

    public final void a() {
        int i3;
        float f10 = 1.0f - this.f18528a.f53840e;
        float T1 = g0.T1(f10 / 2.0f, f10, this.f18529b.f53840e);
        ImageView imageView = this.f18530c;
        if (imageView != null) {
            imageView.setAlpha(T1);
            this.f18530c.setScaleX(g0.T1(0.4f, 1.0f, f10));
            this.f18530c.setScaleY(g0.T1(0.4f, 1.0f, f10) * this.h);
            ImageView imageView2 = this.f18530c;
            if (f10 > 0.0f) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView2.setVisibility(i3);
        }
    }

    public final void b() {
        int i3;
        float f10 = this.f18528a.f53840e;
        float T1 = g0.T1(f10 / 2.0f, f10, this.f18529b.f53840e);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setAlpha(T1);
            this.d.setScaleX(g0.T1(0.4f, 1.0f, f10));
            this.d.setScaleY(g0.T1(0.4f, 1.0f, f10));
            if (f10 > 0.0f) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            if (this.d.getVisibility() != i3) {
                this.d.setVisibility(i3);
                this.f18531e.f32788c = -1L;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f18534r.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f18529b.a(z10, z11);
    }

    public final void f(int i3, int i10) {
        if (this.f18530c == null) {
            if (i3 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.f18530c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.f18530c, mf.e(i10, i10, 17));
            a();
        }
        this.f18530c.setImageResource(i3);
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        this.f18534r.setBounds(0, 0, i3, i10);
    }

    public void setBlurredBackgroundDrawable(g gVar) {
        this.f18534r = gVar;
        gVar.q(g0.L(6.0f));
        this.f18534r.r(g0.L(22.0f));
    }

    @Override
    public void setEnabled(boolean z10) {
        e(z10, false);
    }

    public void setIcon(int i3) {
        f(i3, 48);
    }

    public void setIconColor(int i3) {
        BlendMode blendMode;
        ImageView imageView = this.f18530c;
        if (imageView == null) {
            return;
        }
        this.f18533n = i3;
        if (Build.VERSION.SDK_INT >= 29) {
            blendMode = BlendMode.SRC_IN;
            imageView.setColorFilter(new BlendModeColorFilter(i3, blendMode));
            return;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
    }

    public void setIconPadding(int i3) {
        ImageView imageView = this.f18530c;
        if (imageView != null) {
            imageView.setPadding(0, i3, 0, 0);
        }
    }

    @Override
    public final void updateColors() {
        g gVar = this.f18534r;
        if (gVar != null) {
            gVar.updateColors();
            invalidate();
        }
        int w02 = k6.w0(k6.Kl, this.f18532f);
        if (this.f18530c != null && w02 != this.f18533n) {
            setIconColor(w02);
        }
        int L = g0.L(22.0f);
        int r12 = k6.r1(0.15f, w02);
        if (getBackground() instanceof RippleDrawable) {
            k6.H1(getBackground(), r12, true);
            return;
        }
        int L2 = g0.L(6.0f);
        setBackground(k6.Y(L, r12, L2, L2, L2, L2));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
