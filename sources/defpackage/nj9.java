package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.View;
public final class nj9 extends qi9 {
    public final tj9 X;
    public final tj9[] Y;
    public int Z;
    public LinearGradient a0;
    public final Matrix b0;
    public final Paint c0;

    public nj9(uj9 uj9Var, Rect rect, int i, SpannableStringBuilder spannableStringBuilder) {
        super(uj9Var, rect, i);
        this.b0 = new Matrix();
        this.c0 = new Paint(1);
        tj9 tj9Var = new tj9(uj9Var, spannableStringBuilder, this.c);
        this.X = tj9Var;
        this.Y = r2;
        tj9[] tj9VarArr = {tj9Var};
    }

    @Override
    public final int H() {
        Rect rect = this.b;
        return this.X.b.getHeight() + rect.top + rect.bottom;
    }

    @Override
    public final int I() {
        Rect rect = this.b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override
    public final int J() {
        Rect rect = this.b;
        return this.X.r() + rect.left + rect.right;
    }

    @Override
    public final qkb[] K() {
        return this.Y;
    }

    @Override
    public final void S() {
        this.X.i(this.W);
    }

    @Override
    public final void U() {
        this.X.f(this.W);
    }

    @Override
    public final void V(Canvas canvas) {
        tj9 tj9Var = this.X;
        int i = tj9Var.f;
        uj9 uj9Var = this.a;
        canvas.saveLayerAlpha(0.0f, 0.0f, uj9Var.C, H(), 255, 31);
        int h0 = h0();
        if (h0 != 0) {
            tj9Var.c = (this.b.left + h0) - i;
            canvas.save();
            canvas.translate(h0, 0.0f);
        }
        tj9Var.d(canvas, tj9Var.T);
        if (uj9Var.E()) {
            canvas.save();
            canvas.translate(-i, 0.0f);
            gn.drawAnimatedEmojis(canvas, tj9Var.b, tj9Var.F, 0.0f, tj9Var.x, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        if (h0 != 0) {
            canvas.restore();
        }
        i0();
        Matrix matrix = this.b0;
        matrix.reset();
        matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.c, 0.0f);
        this.a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, uj9Var.C, H(), this.c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void W(Canvas canvas, int i, float f) {
        int i2;
        tj9 tj9Var = this.X;
        int i3 = tj9Var.f;
        uj9 uj9Var = this.a;
        int i4 = uj9Var.C;
        TextPaint textPaint = uj9Var.w;
        canvas.saveLayerAlpha(0.0f, 0.0f, i4, H(), 255, 31);
        int h0 = h0();
        if (h0 != 0) {
            tj9Var.c = (this.b.left + h0) - i3;
        }
        canvas.save();
        canvas.translate(h0 - i3, 0.0f);
        int color = textPaint.getColor();
        textPaint.setColor(-1);
        if (uj9Var.D()) {
            i2 = cmb.Xc;
        } else {
            i2 = cmb.Wc;
        }
        textPaint.linkColor = cmb.v0(i2, uj9Var.D);
        oi7.b(canvas, tj9Var.b, i, f, new xr8(this, this.W, (byte) 10));
        canvas.restore();
        textPaint.setColor(color);
        i0();
        Matrix matrix = this.b0;
        matrix.reset();
        matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.c, 0.0f);
        this.a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, uj9Var.C, H(), this.c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        int h0 = h0();
        tj9 tj9Var = this.X;
        if (h0 == 0) {
            return tj9Var.t(motionEvent);
        }
        motionEvent.offsetLocation(-h0, 0.0f);
        boolean t = tj9Var.t(motionEvent);
        motionEvent.offsetLocation(h0, 0.0f);
        return t;
    }

    @Override
    public final void Y(int i, int i2, int i3) {
        super.Y(i, i2, i3);
        int h0 = h0();
        if (h0 != 0) {
            tj9 tj9Var = this.X;
            tj9Var.c = (i + h0) - tj9Var.f;
        }
    }

    @Override
    public final Layout a() {
        return this.X.b;
    }

    public final int h0() {
        uj9 uj9Var = this.a;
        if (!uj9Var.H()) {
            return 0;
        }
        int L = (uj9Var.C + uj9Var.T) - gm.L(14.0f);
        Rect rect = this.b;
        return ((L - rect.right) - rect.left) - this.X.r();
    }

    public final void i0() {
        int i;
        uj9 uj9Var = this.a;
        if (uj9Var.D()) {
            i = cmb.Vc;
        } else {
            i = cmb.Uc;
        }
        int v0 = cmb.v0(i, uj9Var.D);
        if (this.a0 != null && this.Z == v0) {
            return;
        }
        this.Z = v0;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.c, 0.0f, new int[]{cmb.p1(0.7f, v0), cmb.p1(0.25f, v0), cmb.p1(0.7f, v0)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
        this.a0 = linearGradient;
        Paint paint = this.c0;
        paint.setShader(linearGradient);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void j(SpannableStringBuilder spannableStringBuilder) {
        qi9.k(spannableStringBuilder, this.X, this.Y);
    }

    @Override
    public final boolean r(Canvas canvas, ColorFilter colorFilter) {
        return false;
    }

    @Override
    public final boolean t(CharacterStyle characterStyle, int i, ii9 ii9Var) {
        tj9 tj9Var = this.X;
        if (tj9Var.o(characterStyle, ii9Var)) {
            Rect rect = this.b;
            ii9Var.e = (h0() + rect.left) - tj9Var.f;
            ii9Var.f = i + rect.top;
            return true;
        }
        return false;
    }
}
