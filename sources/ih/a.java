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
import le.d;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tp;
import w7.y5;
public final class a extends FrameLayout implements d {
    public final le.b f11195a;
    public final le.b f11196b;
    public ImageView f11197c;
    public ImageView d;
    public tp e;
    public f6 f11198f;
    public float h;
    public ch.d f11199n;

    public a(Context context) {
        super(context);
        qr qrVar = qr.h;
        this.f11195a = new le.b(0, this, qrVar, 320L, false);
        this.f11196b = new le.b(1, this, qrVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(c cVar, Context context, dh.a aVar, f6 f6Var) {
        int v02 = j6.v0(j6.Wk, f6Var);
        a aVar2 = new a(context);
        aVar2.f11198f = f6Var;
        aVar2.setBlurredBackgroundDrawable(cVar.c(aVar2, aVar, false));
        aVar2.setIconColor(v02);
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = j6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar2.setBackground(j6.W(dp, l1, dp2, dp2, dp2, dp2));
        return aVar2;
    }

    public static a d(Context context, c cVar, dh.a aVar, f6 f6Var, int i10, int i11) {
        int v02 = j6.v0(j6.Wk, f6Var);
        a aVar2 = new a(context);
        aVar2.f11198f = f6Var;
        aVar2.setBlurredBackgroundDrawable(cVar.c(aVar2, aVar, false));
        aVar2.f(i10, i11);
        aVar2.setIconColor(v02);
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = j6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar2.setBackground(j6.W(dp, l1, dp2, dp2, dp2, dp2));
        return aVar2;
    }

    @Override
    public final void D(int i10, float f7, float f10, e eVar) {
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
        float f7 = 1.0f - this.f11195a.e;
        float lerp = AndroidUtilities.lerp(f7 / 2.0f, f7, this.f11196b.e);
        ImageView imageView = this.f11197c;
        if (imageView != null) {
            imageView.setAlpha(lerp);
            this.f11197c.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
            this.f11197c.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7) * this.h);
            ImageView imageView2 = this.f11197c;
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
        float f7 = this.f11195a.e;
        float lerp = AndroidUtilities.lerp(f7 / 2.0f, f7, this.f11196b.e);
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
                this.e.f28413c = -1L;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f11199n.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f11196b.a(z10, z11);
    }

    public final void f(int i10, int i11) {
        if (this.f11197c == null) {
            if (i10 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.f11197c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.f11197c, y5.e(i11, i11, 17));
            a();
        }
        this.f11197c.setImageResource(i10);
    }

    public final void g() {
        ch.d dVar = this.f11199n;
        if (dVar != null) {
            dVar.v();
            invalidate();
        }
        int i10 = j6.Wk;
        int v02 = j6.v0(i10, this.f11198f);
        setIconColor(j6.v0(i10, this.f11198f));
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = j6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        setBackground(j6.W(dp, l1, dp2, dp2, dp2, dp2));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f11199n.setBounds(0, 0, i10, i11);
    }

    public void setBlurredBackgroundDrawable(ch.d dVar) {
        this.f11199n = dVar;
        dVar.p(AndroidUtilities.dp(6.0f));
        this.f11199n.q(AndroidUtilities.dp(22.0f));
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
        ImageView imageView = this.f11197c;
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
        ImageView imageView = this.f11197c;
        if (imageView != null) {
            imageView.setPadding(0, i10, 0, 0);
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
