package jh;

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
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sp;
import w7.x5;
public final class a extends FrameLayout implements d {
    public final le.b f13721a;
    public final le.b f13722b;
    public ImageView f13723c;
    public ImageView d;
    public sp f13724e;
    public f6 f13725f;
    public float h;
    public dh.d f13726n;

    public a(Context context) {
        super(context);
        pr prVar = pr.h;
        this.f13721a = new le.b(0, this, prVar, 320L, false);
        this.f13722b = new le.b(1, this, prVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(Context context, bh.b bVar, eh.a aVar, f6 f6Var) {
        int v02 = j6.v0(j6.Wk, f6Var);
        a aVar2 = new a(context);
        aVar2.f13725f = f6Var;
        aVar2.setBlurredBackgroundDrawable(bVar.c(aVar2, aVar, false));
        aVar2.setIconColor(v02);
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = j6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar2.setBackground(j6.W(dp, l1, dp2, dp2, dp2, dp2));
        return aVar2;
    }

    public static a d(Context context, bh.b bVar, eh.a aVar, f6 f6Var, int i10, int i11) {
        int v02 = j6.v0(j6.Wk, f6Var);
        a aVar2 = new a(context);
        aVar2.f13725f = f6Var;
        aVar2.setBlurredBackgroundDrawable(bVar.c(aVar2, aVar, false));
        aVar2.f(i10, i11);
        aVar2.setIconColor(v02);
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = j6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar2.setBackground(j6.W(dp, l1, dp2, dp2, dp2, dp2));
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
        float f7 = 1.0f - this.f13721a.f15368e;
        float lerp = AndroidUtilities.lerp(f7 / 2.0f, f7, this.f13722b.f15368e);
        ImageView imageView = this.f13723c;
        if (imageView != null) {
            imageView.setAlpha(lerp);
            this.f13723c.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f7));
            this.f13723c.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f7) * this.h);
            ImageView imageView2 = this.f13723c;
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
        float f7 = this.f13721a.f15368e;
        float lerp = AndroidUtilities.lerp(f7 / 2.0f, f7, this.f13722b.f15368e);
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
                this.f13724e.f30384c = -1L;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f13726n.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.f13722b.a(z10, z11);
    }

    public final void f(int i10, int i11) {
        if (this.f13723c == null) {
            if (i10 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.f13723c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.f13723c, x5.e(i11, i11, 17));
            a();
        }
        this.f13723c.setImageResource(i10);
    }

    public final void g() {
        dh.d dVar = this.f13726n;
        if (dVar != null) {
            dVar.u();
            invalidate();
        }
        int i10 = j6.Wk;
        int v02 = j6.v0(i10, this.f13725f);
        setIconColor(j6.v0(i10, this.f13725f));
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = j6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        setBackground(j6.W(dp, l1, dp2, dp2, dp2, dp2));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f13726n.setBounds(0, 0, i10, i11);
    }

    public void setBlurredBackgroundDrawable(dh.d dVar) {
        this.f13726n = dVar;
        dVar.o(AndroidUtilities.dp(6.0f));
        this.f13726n.p(AndroidUtilities.dp(22.0f));
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
        ImageView imageView = this.f13723c;
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
        ImageView imageView = this.f13723c;
        if (imageView != null) {
            imageView.setPadding(0, i10, 0, 0);
        }
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
