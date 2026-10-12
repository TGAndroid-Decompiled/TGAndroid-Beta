package ih;

import ah.c;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import me.d;
import me.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.lq;
import w7.w5;
public final class a extends FrameLayout implements d {
    public final me.b f12221a;
    public final me.b f12222b;
    public ImageView f12223c;
    public ImageView d;
    public lq f12224e;
    public c6 f12225f;
    public float h;
    public ch.d f12226n;

    public a(Context context) {
        super(context);
        js jsVar = js.h;
        this.f12221a = new me.b(0, this, jsVar, 320L, false);
        this.f12222b = new me.b(1, this, jsVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(c cVar, Context context, dh.a aVar, c6 c6Var) {
        int w02 = h6.w0(h6.Wk, c6Var);
        a aVar2 = new a(context);
        aVar2.f12225f = c6Var;
        aVar2.setBlurredBackgroundDrawable(cVar.c(aVar2, aVar, false));
        aVar2.setIconColor(w02);
        int dp = AndroidUtilities.dp(22.0f);
        int m12 = h6.m1(0.15f, w02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar2.setBackground(h6.X(dp, m12, dp2, dp2, dp2, dp2));
        return aVar2;
    }

    public static a d(Context context, c cVar, dh.a aVar, c6 c6Var, int i10, int i11) {
        int w02 = h6.w0(h6.Wk, c6Var);
        a aVar2 = new a(context);
        aVar2.f12225f = c6Var;
        aVar2.setBlurredBackgroundDrawable(cVar.c(aVar2, aVar, false));
        aVar2.f(i10, i11);
        aVar2.setIconColor(w02);
        int dp = AndroidUtilities.dp(22.0f);
        int m12 = h6.m1(0.15f, w02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar2.setBackground(h6.X(dp, m12, dp2, dp2, dp2, dp2));
        return aVar2;
    }

    public final void a() {
        int i10;
        float f7 = 1.0f - this.f12221a.f16088e;
        float lerp = AndroidUtilities.lerp(f7 / 2.0f, f7, this.f12222b.f16088e);
        ImageView imageView = this.f12223c;
        if (imageView != null) {
            imageView.setAlpha(lerp);
            this.f12223c.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
            this.f12223c.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7) * this.h);
            ImageView imageView2 = this.f12223c;
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
        float f7 = this.f12221a.f16088e;
        float lerp = AndroidUtilities.lerp(f7 / 2.0f, f7, this.f12222b.f16088e);
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
                this.f12224e.f28251c = -1L;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f12226n.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f12222b.a(z10, z11);
    }

    public final void f(int i10, int i11) {
        if (this.f12223c == null) {
            if (i10 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.f12223c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.f12223c, w5.e(i11, i11, 17));
            a();
        }
        this.f12223c.setImageResource(i10);
    }

    public final void g() {
        ch.d dVar = this.f12226n;
        if (dVar != null) {
            dVar.v();
            invalidate();
        }
        int i10 = h6.Wk;
        int w02 = h6.w0(i10, this.f12225f);
        setIconColor(h6.w0(i10, this.f12225f));
        int dp = AndroidUtilities.dp(22.0f);
        int m12 = h6.m1(0.15f, w02);
        int dp2 = AndroidUtilities.dp(6.0f);
        setBackground(h6.X(dp, m12, dp2, dp2, dp2, dp2));
    }

    @Override
    public final void n(int i10, float f7, float f10, e eVar) {
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
        this.f12226n.setBounds(0, 0, i10, i11);
    }

    public void setBlurredBackgroundDrawable(ch.d dVar) {
        this.f12226n = dVar;
        dVar.p(AndroidUtilities.dp(6.0f));
        this.f12226n.q(AndroidUtilities.dp(22.0f));
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
        ImageView imageView = this.f12223c;
        if (imageView == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            blendMode = BlendMode.SRC_IN;
            imageView.setColorFilter(new BlendModeColorFilter(i10, blendMode));
            return;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    public void setIconPadding(int i10) {
        ImageView imageView = this.f12223c;
        if (imageView != null) {
            imageView.setPadding(0, i10, 0, 0);
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
