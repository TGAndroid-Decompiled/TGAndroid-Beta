package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public class be0 extends View {
    public tgb E;
    public Path F;
    public ColorMatrixColorFilter G;
    public ImageReceiver a;
    public ImageReceiver b;
    public int c;
    public int d;
    public vl e;
    public ColorFilter f;
    public pb0 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public ValueAnimator y;

    public be0(Context context) {
        super(context);
        this.c = -1;
        this.d = -1;
        this.x = true;
        ImageReceiver c = c();
        this.a = c;
        c.o1 = 0.0f;
        c.A1 = true;
        c.h1 = new l0(this, (byte) 27);
    }

    public final void a() {
        Bitmap n;
        if (this.r && this.b.n() == null && this.a.n() != null && (n = this.a.n()) != null && !n.isRecycled()) {
            this.b.f0(Utilities.D(n, false));
            invalidate();
        }
    }

    public final void b() {
        this.a.f();
    }

    public ImageReceiver c() {
        return new ImageReceiver(this);
    }

    public final void e() {
        if (this.r) {
            if (this.b.n() != null && !this.b.n().isRecycled()) {
                this.b.n().recycle();
            }
            this.b.g0(null);
            a();
        }
    }

    public final void f(TLObject tLObject, pb0 pb0Var) {
        this.a.U(tLObject, pb0Var, null);
        e();
    }

    public final void g(int i, long j, gl5 gl5Var, gl5 gl5Var2, Object obj, String str, String str2, String str3) {
        this.a.Z(gl5Var, str, gl5Var2, str2, null, j, str3, obj, i);
        e();
    }

    public vl getAnimatedEmojiDrawable() {
        return this.e;
    }

    public pb0 getAvatarDrawable() {
        pb0 pb0Var = this.h;
        if (pb0Var == null) {
            pb0 pb0Var2 = new pb0((wjb) null);
            this.h = pb0Var2;
            return pb0Var2;
        }
        return pb0Var;
    }

    public ImageReceiver getImageReceiver() {
        return this.a;
    }

    public int[] getRoundRadius() {
        return this.a.X0;
    }

    public final void h(gl5 gl5Var, String str, gl5 gl5Var2, String str2, int i, Object obj) {
        k(gl5Var, str, gl5Var2, str2, null, null, i, obj);
    }

    public final void j(gl5 gl5Var, String str, gl5 gl5Var2, String str2, Drawable drawable, Object obj) {
        this.a.Y(gl5Var, str, gl5Var2, str2, null, null, drawable, 0L, null, obj, 1);
        e();
    }

    public final void k(gl5 gl5Var, String str, gl5 gl5Var2, String str2, Drawable drawable, String str3, int i, Object obj) {
        this.a.Z(gl5Var, str, gl5Var2, str2, drawable, i, str3, obj, 0);
        e();
    }

    public final void m(gl5 gl5Var, String str, Drawable drawable, Object obj) {
        k(gl5Var, str, null, null, drawable, null, 0, obj);
    }

    public final void n(gl5 gl5Var, String str, String str2, Drawable drawable, Object obj) {
        k(gl5Var, str, null, null, drawable, str2, 0, obj);
    }

    public final void o(String str, String str2, Drawable drawable) {
        k(gl5.g(str), str2, null, null, drawable, null, 0, null);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
        if (this.x) {
            this.a.I();
        }
        if (this.s) {
            this.b.I();
        }
        vl vlVar = this.e;
        if (vlVar != null) {
            vlVar.b(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = false;
        if (this.x) {
            this.a.K();
        }
        if (this.s) {
            this.b.K();
        }
        vl vlVar = this.e;
        if (vlVar != null) {
            vlVar.o(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i;
        ColorFilter colorFilter;
        vl vlVar = this.e;
        if (vlVar != null) {
            imageReceiver = vlVar.k;
        } else {
            imageReceiver = this.a;
        }
        if (imageReceiver != null) {
            if (vlVar != null && (colorFilter = this.f) != null) {
                vlVar.setColorFilter(colorFilter);
            }
            int i2 = this.c;
            if (i2 != -1 && (i = this.d) != -1) {
                if (this.w) {
                    imageReceiver.i0(0.0f, 0.0f, i2, i);
                    if (this.s) {
                        this.b.i0(0.0f, 0.0f, this.c, this.d);
                    }
                } else {
                    int height = getHeight();
                    int i3 = this.d;
                    imageReceiver.i0((getWidth() - this.c) / 2, (height - i3) / 2, this.c, i3);
                    if (this.s) {
                        int height2 = getHeight();
                        int i4 = this.d;
                        this.b.i0((getWidth() - this.c) / 2, (height2 - i4) / 2, this.c, i4);
                    }
                }
            } else {
                imageReceiver.i0(0.0f, 0.0f, getWidth(), getHeight());
                if (this.s) {
                    this.b.i0(0.0f, 0.0f, getWidth(), getHeight());
                }
            }
            imageReceiver.h(canvas, null);
            if (this.s) {
                this.b.h(canvas, null);
            }
        }
    }

    public final void p(gl5 gl5Var, String str, Drawable drawable, Object obj) {
        k(gl5Var, str, null, null, drawable, null, 0, obj);
    }

    public final void q() {
        this.a.o0(0, 0, true);
    }

    public final void r(int i, int i2, boolean z) {
        this.a.o0(i, i2, true);
    }

    public final void s(int i, int i2, int i3, int i4) {
        this.a.r0(i, i2, i3, i4);
        if (this.s) {
            this.b.r0(i, i2, i3, i4);
        }
        invalidate();
    }

    public void setAnimatedEmojiDrawable(vl vlVar) {
        vl vlVar2 = this.e;
        if (vlVar2 == vlVar) {
            return;
        }
        if (this.n && vlVar2 != null) {
            vlVar2.o(this);
        }
        this.e = vlVar;
        if (this.n && vlVar != null) {
            vlVar.b(this);
        }
        invalidate();
    }

    public void setAspectFit(boolean z) {
        this.a.S0 = z;
    }

    public void setBlurAllowed(boolean z) {
        if (!this.n) {
            this.s = z;
            if (z) {
                this.b = new ImageReceiver(null);
                return;
            }
            return;
        }
        sc8.j("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.E = null;
            return;
        }
        this.E = new tgb(charSequence, 16.5f, gl.o());
        if (this.G == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            gl.h(colorMatrix, -0.2f);
            this.G = new ColorMatrixColorFilter(colorMatrix);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.p1 = colorFilter;
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.f = colorFilter;
        invalidate();
    }

    public void setHasBlur(boolean z) {
        if (z && !this.s) {
            sc8.j("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
            return;
        }
        this.r = z;
        if (!z) {
            if (this.b.n() != null && !this.b.n().isRecycled()) {
                this.b.n().recycle();
            }
            this.b.g0(null);
        }
        a();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.a.f0(bitmap);
        e();
    }

    public void setImageDrawable(Drawable drawable) {
        this.a.g0(drawable);
        e();
    }

    public void setImageResource(int i) {
        this.a.g0(getResources().getDrawable(i));
        invalidate();
        e();
    }

    public void setLayerNum(int i) {
        this.a.m0(i);
    }

    public void setRoundRadius(int i) {
        this.a.q0(i);
        if (this.s) {
            this.b.q0(i);
        }
        invalidate();
    }

    public final void t(int i, int i2) {
        this.c = i;
        this.d = i2;
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.a.t() && drawable != this.a.T && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
