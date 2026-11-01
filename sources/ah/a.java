package ah;

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
import fe.e;
import java.util.HashSet;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;
import vg.f;
import w7.b6;
public final class a extends FrameLayout implements e, k6 {
    public final fe.b f823a;
    public final fe.b f824b;
    public ImageView f825c;
    public ImageView d;
    public kp e;
    public p6 f826f;
    public float h;
    public int f827n;
    public f f828r;

    public a(Context context) {
        super(context);
        gr grVar = gr.h;
        this.f823a = new fe.b(0, this, grVar, 320L, false);
        this.f824b = new fe.b(1, this, grVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(Context context, p6 p6Var, tg.b bVar, wg.a aVar) {
        int i10 = t6.Kl;
        int w02 = t6.w0(i10, p6Var);
        a aVar2 = new a(context);
        aVar2.f826f = p6Var;
        aVar2.setBlurredBackgroundDrawable(bVar.c(aVar2, aVar, false));
        aVar2.setIconColor(w02);
        int L = i0.L(22.0f);
        int r12 = t6.r1(0.15f, w02);
        int L2 = i0.L(6.0f);
        y Y = t6.Y(L, r12, L2, L2, L2, L2);
        w6 L3 = a7.L(0.15f, i10);
        aVar2.setBackground(Y);
        a7.k(aVar2, Y, null, L3, p6Var);
        return aVar2;
    }

    public static a d(Context context, tg.b bVar, wg.a aVar, p6 p6Var, int i10, int i11) {
        int i12 = t6.Kl;
        int w02 = t6.w0(i12, p6Var);
        a aVar2 = new a(context);
        aVar2.f826f = p6Var;
        aVar2.setBlurredBackgroundDrawable(bVar.c(aVar2, aVar, false));
        aVar2.f(i10, i11);
        aVar2.setIconColor(w02);
        int L = i0.L(22.0f);
        int r12 = t6.r1(0.15f, w02);
        int L2 = i0.L(6.0f);
        y Y = t6.Y(L, r12, L2, L2, L2, L2);
        w6 L3 = a7.L(0.15f, i12);
        aVar2.setBackground(Y);
        a7.k(aVar2, Y, null, L3, p6Var);
        return aVar2;
    }

    public final void a() {
        int i10;
        float f7 = 1.0f - this.f823a.e;
        float T1 = i0.T1(f7 / 2.0f, f7, this.f824b.e);
        ImageView imageView = this.f825c;
        if (imageView != null) {
            imageView.setAlpha(T1);
            this.f825c.setScaleX(i0.T1(0.4f, 1.0f, f7));
            this.f825c.setScaleY(i0.T1(0.4f, 1.0f, f7) * this.h);
            ImageView imageView2 = this.f825c;
            if (f7 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView2.setVisibility(i10);
        }
    }

    public final void b() {
        int i10;
        float f7 = this.f823a.e;
        float T1 = i0.T1(f7 / 2.0f, f7, this.f824b.e);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setAlpha(T1);
            this.d.setScaleX(i0.T1(0.4f, 1.0f, f7));
            this.d.setScaleY(i0.T1(0.4f, 1.0f, f7));
            if (f7 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            if (this.d.getVisibility() != i10) {
                this.d.setVisibility(i10);
                this.e.f27917c = -1L;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f828r.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f824b.a(z10, z11);
    }

    public final void f(int i10, int i11) {
        if (this.f825c == null) {
            if (i10 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.f825c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.f825c, b6.e(i11, i11, 17));
            a();
        }
        this.f825c.setImageResource(i10);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f828r.setBounds(0, 0, i10, i11);
    }

    public void setBlurredBackgroundDrawable(f fVar) {
        this.f828r = fVar;
        fVar.p(i0.L(6.0f));
        this.f828r.q(i0.L(22.0f));
    }

    @Override
    public void setEnabled(boolean z10) {
        e(z10, false);
    }

    public void setIcon(int i10) {
        f(i10, 48);
    }

    public void setIconColor(int i10) {
        BlendMode blendMode;
        ImageView imageView = this.f825c;
        if (imageView == null) {
            return;
        }
        this.f827n = i10;
        if (Build.VERSION.SDK_INT >= 29) {
            blendMode = BlendMode.SRC_IN;
            imageView.setColorFilter(new BlendModeColorFilter(i10, blendMode));
            return;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    public void setIconPadding(int i10) {
        ImageView imageView = this.f825c;
        if (imageView != null) {
            imageView.setPadding(0, i10, 0, 0);
        }
    }

    @Override
    public final void updateColors() {
        f fVar = this.f828r;
        if (fVar != null) {
            fVar.updateColors();
            invalidate();
        }
        int w02 = t6.w0(t6.Kl, this.f826f);
        if (this.f825c != null && w02 != this.f827n) {
            setIconColor(w02);
        }
        int L = i0.L(22.0f);
        int r12 = t6.r1(0.15f, w02);
        if (getBackground() instanceof RippleDrawable) {
            t6.H1(getBackground(), r12, true);
            return;
        }
        int L2 = i0.L(6.0f);
        setBackground(t6.Y(L, r12, L2, L2, L2, L2));
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            a();
            b();
        }
        if (i10 == 1) {
            a();
            b();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
