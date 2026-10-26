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
import java.util.HashSet;
import oe.d;
import oe.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.gq;
public final class a extends FrameLayout implements d, p6 {
    public final oe.b f16647a;
    public final oe.b f16648b;
    public ImageView f16649c;
    public ImageView d;
    public gq e;
    public u6 f16650f;
    public float h;
    public int f16651n;
    public eh.d f16652r;

    public a(Context context) {
        super(context);
        ds dsVar = ds.h;
        this.f16647a = new oe.b(0, this, dsVar, 320L, false);
        this.f16648b = new oe.b(1, this, dsVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(Context context, ch.b bVar, fh.a aVar, u6 u6Var) {
        int i10 = y6.Wk;
        int w02 = y6.w0(i10, u6Var);
        a aVar2 = new a(context);
        aVar2.f16650f = u6Var;
        aVar2.setBlurredBackgroundDrawable(bVar.c(aVar2, aVar, false));
        aVar2.setIconColor(w02);
        int dp = AndroidUtilities.dp(22.0f);
        int o12 = y6.o1(0.15f, w02);
        int dp2 = AndroidUtilities.dp(6.0f);
        y X = y6.X(dp, o12, dp2, dp2, dp2, dp2);
        b7 L = f7.L(0.15f, i10);
        aVar2.setBackground(X);
        f7.k(aVar2, X, null, L, u6Var);
        return aVar2;
    }

    public static a d(Context context, ch.b bVar, fh.a aVar, u6 u6Var, int i10, int i11) {
        int i12 = y6.Wk;
        int w02 = y6.w0(i12, u6Var);
        a aVar2 = new a(context);
        aVar2.f16650f = u6Var;
        aVar2.setBlurredBackgroundDrawable(bVar.c(aVar2, aVar, false));
        aVar2.f(i10, i11);
        aVar2.setIconColor(w02);
        int dp = AndroidUtilities.dp(22.0f);
        int o12 = y6.o1(0.15f, w02);
        int dp2 = AndroidUtilities.dp(6.0f);
        y X = y6.X(dp, o12, dp2, dp2, dp2, dp2);
        b7 L = f7.L(0.15f, i12);
        aVar2.setBackground(X);
        f7.k(aVar2, X, null, L, u6Var);
        return aVar2;
    }

    @Override
    public final void E(int i10, float f7, float f10, e eVar) {
        if (i10 == 0) {
            a();
            b();
        }
        if (i10 == 1) {
            a();
            b();
        }
    }

    public final void a() {
        int i10;
        float f7 = 1.0f - this.f16647a.e;
        float lerp = AndroidUtilities.lerp(f7 / 2.0f, f7, this.f16648b.e);
        ImageView imageView = this.f16649c;
        if (imageView != null) {
            imageView.setAlpha(lerp);
            this.f16649c.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
            this.f16649c.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7) * this.h);
            ImageView imageView2 = this.f16649c;
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
        float f7 = this.f16647a.e;
        float lerp = AndroidUtilities.lerp(f7 / 2.0f, f7, this.f16648b.e);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setAlpha(lerp);
            this.d.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
            this.d.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7));
            if (f7 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            if (this.d.getVisibility() != i10) {
                this.d.setVisibility(i10);
                this.e.f28678c = -1L;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f16652r.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f16648b.a(z10, z11);
    }

    public final void f(int i10, int i11) {
        if (this.f16649c == null) {
            if (i10 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.f16649c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.f16649c, gb1.i(i11, i11, 17));
            a();
        }
        this.f16649c.setImageResource(i10);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f16652r.setBounds(0, 0, i10, i11);
    }

    public void setBlurredBackgroundDrawable(eh.d dVar) {
        this.f16652r = dVar;
        dVar.w(AndroidUtilities.dp(6.0f));
        this.f16652r.x(AndroidUtilities.dp(22.0f));
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
        ImageView imageView = this.f16649c;
        if (imageView == null) {
            return;
        }
        this.f16651n = i10;
        if (Build.VERSION.SDK_INT >= 29) {
            blendMode = BlendMode.SRC_IN;
            imageView.setColorFilter(new BlendModeColorFilter(i10, blendMode));
            return;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    public void setIconPadding(int i10) {
        ImageView imageView = this.f16649c;
        if (imageView != null) {
            imageView.setPadding(0, i10, 0, 0);
        }
    }

    @Override
    public final void updateColors() {
        eh.d dVar = this.f16652r;
        if (dVar != null) {
            dVar.updateColors();
            invalidate();
        }
        int w02 = y6.w0(y6.Wk, this.f16650f);
        if (this.f16649c != null && w02 != this.f16651n) {
            setIconColor(w02);
        }
        int dp = AndroidUtilities.dp(22.0f);
        int o12 = y6.o1(0.15f, w02);
        if (getBackground() instanceof RippleDrawable) {
            y6.E1(getBackground(), o12, true);
            return;
        }
        int dp2 = AndroidUtilities.dp(6.0f);
        setBackground(y6.X(dp, o12, dp2, dp2, dp2, dp2));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
