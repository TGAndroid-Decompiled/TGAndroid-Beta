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
public class de0 extends View {
    public pkb E;
    public Path F;
    public ColorMatrixColorFilter G;
    public ImageReceiver a;
    public ImageReceiver b;
    public int c;
    public int d;
    public wl e;
    public ColorFilter f;
    public rb0 h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public ValueAnimator y;

    public de0(Context context) {
        super(context);
        this.c = -1;
        this.d = -1;
        this.x = true;
        ImageReceiver c = c();
        this.a = c;
        c.o1 = 0.0f;
        c.A1 = true;
        c.h1 = new m0(this, (byte) 27);
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

    public final void f(TLObject tLObject, rb0 rb0Var) {
        this.a.U(tLObject, rb0Var, null);
        e();
    }

    public final void g(int i, long j, jn5 jn5Var, jn5 jn5Var2, Object obj, String str, String str2, String str3) {
        this.a.Z(jn5Var, str, jn5Var2, str2, null, j, str3, obj, i);
        e();
    }

    public wl getAnimatedEmojiDrawable() {
        return this.e;
    }

    public rb0 getAvatarDrawable() {
        rb0 rb0Var = this.h;
        if (rb0Var == null) {
            rb0 rb0Var2 = new rb0((vnb) null);
            this.h = rb0Var2;
            return rb0Var2;
        }
        return rb0Var;
    }

    public ImageReceiver getImageReceiver() {
        return this.a;
    }

    public int[] getRoundRadius() {
        return this.a.X0;
    }

    public final void h(jn5 jn5Var, String str, jn5 jn5Var2, String str2, int i, Object obj) {
        k(jn5Var, str, jn5Var2, str2, null, null, i, obj);
    }

    public final void j(jn5 jn5Var, String str, jn5 jn5Var2, String str2, Drawable drawable, Object obj) {
        this.a.Y(jn5Var, str, jn5Var2, str2, null, null, drawable, 0L, null, obj, 1);
        e();
    }

    public final void k(jn5 jn5Var, String str, jn5 jn5Var2, String str2, Drawable drawable, String str3, int i, Object obj) {
        this.a.Z(jn5Var, str, jn5Var2, str2, drawable, i, str3, obj, 0);
        e();
    }

    public final void m(jn5 jn5Var, String str, Drawable drawable, Object obj) {
        k(jn5Var, str, null, null, drawable, null, 0, obj);
    }

    public final void n(jn5 jn5Var, String str, String str2, Drawable drawable, Object obj) {
        k(jn5Var, str, null, null, drawable, str2, 0, obj);
    }

    public final void o(String str, String str2, Drawable drawable) {
        k(jn5.g(str), str2, null, null, drawable, null, 0, null);
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
        wl wlVar = this.e;
        if (wlVar != null) {
            wlVar.b(this);
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
        wl wlVar = this.e;
        if (wlVar != null) {
            wlVar.o(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        int i;
        ColorFilter colorFilter;
        wl wlVar = this.e;
        if (wlVar != null) {
            imageReceiver = wlVar.k;
        } else {
            imageReceiver = this.a;
        }
        if (imageReceiver != null) {
            if (wlVar != null && (colorFilter = this.f) != null) {
                wlVar.setColorFilter(colorFilter);
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

    public final void p(jn5 jn5Var, String str, Drawable drawable, Object obj) {
        k(jn5Var, str, null, null, drawable, null, 0, obj);
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

    public void setAnimatedEmojiDrawable(wl wlVar) {
        wl wlVar2 = this.e;
        if (wlVar2 == wlVar) {
            return;
        }
        if (this.n && wlVar2 != null) {
            wlVar2.o(this);
        }
        this.e = wlVar;
        if (this.n && wlVar != null) {
            wlVar.b(this);
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
        grb.i("You should call setBlurAllowed(...) only when detached!");
    }

    public void setBlurredText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.E = null;
            return;
        }
        this.E = new pkb(charSequence, 16.5f, hl.o());
        if (this.G == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.2f);
            hl.h(colorMatrix, -0.2f);
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
            grb.i("You should call setBlurAllowed(...) before calling setHasBlur(true)!");
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
