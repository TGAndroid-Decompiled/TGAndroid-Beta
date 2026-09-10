package hh;

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
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zp;
import w7.a6;
public final class a extends FrameLayout implements d {
    public final le.b f9411a;
    public final le.b f9412b;
    public ImageView f9413c;
    public ImageView d;
    public zp e;
    public f6 f9414f;
    public float h;
    public bh.d f9415n;

    public a(Context context) {
        super(context);
        wr wrVar = wr.h;
        this.f9411a = new le.b(0, this, wrVar, 320L, false);
        this.f9412b = new le.b(1, this, wrVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(Context context, ch.a aVar, f6 f6Var, zg.a aVar2) {
        int v02 = j6.v0(j6.Wk, f6Var);
        a aVar3 = new a(context);
        aVar3.f9414f = f6Var;
        aVar3.setBlurredBackgroundDrawable(aVar2.c(aVar3, aVar, false));
        aVar3.setIconColor(v02);
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = j6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar3.setBackground(j6.W(dp, l1, dp2, dp2, dp2, dp2));
        return aVar3;
    }

    public static a d(Context context, zg.a aVar, ch.a aVar2, f6 f6Var, int i10, int i11) {
        int v02 = j6.v0(j6.Wk, f6Var);
        a aVar3 = new a(context);
        aVar3.f9414f = f6Var;
        aVar3.setBlurredBackgroundDrawable(aVar.c(aVar3, aVar2, false));
        aVar3.f(i10, i11);
        aVar3.setIconColor(v02);
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = j6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar3.setBackground(j6.W(dp, l1, dp2, dp2, dp2, dp2));
        return aVar3;
    }

    @Override
    public final void G(int i10, float f7, float f10, e eVar) {
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
        float f7 = 1.0f - this.f9411a.e;
        float lerp = AndroidUtilities.lerp(f7 / 2.0f, f7, this.f9412b.e);
        ImageView imageView = this.f9413c;
        if (imageView != null) {
            imageView.setAlpha(lerp);
            this.f9413c.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
            this.f9413c.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7) * this.h);
            ImageView imageView2 = this.f9413c;
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
        float f7 = this.f9411a.e;
        float lerp = AndroidUtilities.lerp(f7 / 2.0f, f7, this.f9412b.e);
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
                this.e.f29783c = -1L;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f9415n.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f9412b.a(z10, z11);
    }

    public final void f(int i10, int i11) {
        if (this.f9413c == null) {
            if (i10 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.f9413c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.f9413c, a6.e(i11, i11, 17));
            a();
        }
        this.f9413c.setImageResource(i10);
    }

    public final void g() {
        bh.d dVar = this.f9415n;
        if (dVar != null) {
            dVar.u();
            invalidate();
        }
        int i10 = j6.Wk;
        int v02 = j6.v0(i10, this.f9414f);
        setIconColor(j6.v0(i10, this.f9414f));
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = j6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        setBackground(j6.W(dp, l1, dp2, dp2, dp2, dp2));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f9415n.setBounds(0, 0, i10, i11);
    }

    public void setBlurredBackgroundDrawable(bh.d dVar) {
        this.f9415n = dVar;
        dVar.o(AndroidUtilities.dp(6.0f));
        this.f9415n.p(AndroidUtilities.dp(22.0f));
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
        ImageView imageView = this.f9413c;
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
        ImageView imageView = this.f9413c;
        if (imageView != null) {
            imageView.setPadding(0, i10, 0, 0);
        }
    }

    @Override
    public final void B(float f7, int i10) {
    }
}
