package jh;

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
import ne.d;
import ne.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.eq;
import w7.z5;
public final class a extends FrameLayout implements d, b6 {
    public final ne.b f14554a;
    public final ne.b f14555b;
    public ImageView f14556c;
    public ImageView d;
    public eq e;
    public g6 f14557f;
    public float h;
    public int f14558n;
    public dh.d f14559r;

    public a(Context context) {
        super(context);
        bs bsVar = bs.h;
        this.f14554a = new ne.b(0, this, bsVar, 320L, false);
        this.f14555b = new ne.b(1, this, bsVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(Context context, bh.b bVar, eh.a aVar, g6 g6Var) {
        int i10 = k6.Wk;
        int w02 = k6.w0(i10, g6Var);
        a aVar2 = new a(context);
        aVar2.f14557f = g6Var;
        aVar2.setBlurredBackgroundDrawable(bVar.c(aVar2, aVar, false));
        aVar2.setIconColor(w02);
        int dp = AndroidUtilities.dp(22.0f);
        int o12 = k6.o1(0.15f, w02);
        int dp2 = AndroidUtilities.dp(6.0f);
        y X = k6.X(dp, o12, dp2, dp2, dp2, dp2);
        n6 M = r6.M(0.15f, i10);
        aVar2.setBackground(X);
        r6.k(aVar2, X, null, M, g6Var);
        return aVar2;
    }

    public static a d(Context context, bh.b bVar, eh.a aVar, g6 g6Var, int i10, int i11) {
        int i12 = k6.Wk;
        int w02 = k6.w0(i12, g6Var);
        a aVar2 = new a(context);
        aVar2.f14557f = g6Var;
        aVar2.setBlurredBackgroundDrawable(bVar.c(aVar2, aVar, false));
        aVar2.f(i10, i11);
        aVar2.setIconColor(w02);
        int dp = AndroidUtilities.dp(22.0f);
        int o12 = k6.o1(0.15f, w02);
        int dp2 = AndroidUtilities.dp(6.0f);
        y X = k6.X(dp, o12, dp2, dp2, dp2, dp2);
        n6 M = r6.M(0.15f, i12);
        aVar2.setBackground(X);
        r6.k(aVar2, X, null, M, g6Var);
        return aVar2;
    }

    public final void a() {
        int i10;
        float f7 = 1.0f - this.f14554a.e;
        float lerp = AndroidUtilities.lerp(f7 / 2.0f, f7, this.f14555b.e);
        ImageView imageView = this.f14556c;
        if (imageView != null) {
            imageView.setAlpha(lerp);
            this.f14556c.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
            this.f14556c.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7) * this.h);
            ImageView imageView2 = this.f14556c;
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
        float f7 = this.f14554a.e;
        float lerp = AndroidUtilities.lerp(f7 / 2.0f, f7, this.f14555b.e);
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
                this.e.f26026c = -1L;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f14559r.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f14555b.a(z10, z11);
    }

    public final void f(int i10, int i11) {
        if (this.f14556c == null) {
            if (i10 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.f14556c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.f14556c, z5.e(i11, i11, 17));
            a();
        }
        this.f14556c.setImageResource(i10);
    }

    @Override
    public final void o(int i10, float f7, float f10, e eVar) {
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
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f14559r.setBounds(0, 0, i10, i11);
    }

    public void setBlurredBackgroundDrawable(dh.d dVar) {
        this.f14559r = dVar;
        dVar.p(AndroidUtilities.dp(6.0f));
        this.f14559r.q(AndroidUtilities.dp(22.0f));
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
        ImageView imageView = this.f14556c;
        if (imageView == null) {
            return;
        }
        this.f14558n = i10;
        if (Build.VERSION.SDK_INT >= 29) {
            blendMode = BlendMode.SRC_IN;
            imageView.setColorFilter(new BlendModeColorFilter(i10, blendMode));
            return;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    public void setIconPadding(int i10) {
        ImageView imageView = this.f14556c;
        if (imageView != null) {
            imageView.setPadding(0, i10, 0, 0);
        }
    }

    @Override
    public final void updateColors() {
        dh.d dVar = this.f14559r;
        if (dVar != null) {
            dVar.updateColors();
            invalidate();
        }
        int w02 = k6.w0(k6.Wk, this.f14557f);
        if (this.f14556c != null && w02 != this.f14558n) {
            setIconColor(w02);
        }
        int dp = AndroidUtilities.dp(22.0f);
        int o12 = k6.o1(0.15f, w02);
        if (getBackground() instanceof RippleDrawable) {
            k6.E1(getBackground(), o12, true);
            return;
        }
        int dp2 = AndroidUtilities.dp(6.0f);
        setBackground(k6.X(dp, o12, dp2, dp2, dp2, dp2));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
