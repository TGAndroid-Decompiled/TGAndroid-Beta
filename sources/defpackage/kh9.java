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
public final class kh9 extends mg9 {
    public final qh9 X;
    public final qh9[] Y;
    public int Z;
    public LinearGradient a0;
    public final Matrix b0;
    public final Paint c0;

    public kh9(rh9 rh9Var, Rect rect, int i, SpannableStringBuilder spannableStringBuilder) {
        super(rh9Var, rect, i);
        this.b0 = new Matrix();
        this.c0 = new Paint(1);
        qh9 qh9Var = new qh9(rh9Var, spannableStringBuilder, this.c);
        this.X = qh9Var;
        this.Y = r2;
        qh9[] qh9VarArr = {qh9Var};
    }

    @Override
    public final int I() {
        Rect rect = this.b;
        return this.X.b.getHeight() + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        Rect rect = this.b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override
    public final int K() {
        Rect rect = this.b;
        return this.X.r() + rect.left + rect.right;
    }

    @Override
    public final pib[] L() {
        return this.Y;
    }

    @Override
    public final void T() {
        this.X.i(this.W);
    }

    @Override
    public final void V() {
        this.X.f(this.W);
    }

    @Override
    public final void W(Canvas canvas) {
        qh9 qh9Var = this.X;
        int i = qh9Var.f;
        rh9 rh9Var = this.a;
        canvas.saveLayerAlpha(0.0f, 0.0f, rh9Var.C, I(), 255, 31);
        int i0 = i0();
        if (i0 != 0) {
            qh9Var.c = (this.b.left + i0) - i;
            canvas.save();
            canvas.translate(i0, 0.0f);
        }
        qh9Var.d(canvas, qh9Var.T);
        if (rh9Var.E()) {
            canvas.save();
            canvas.translate(-i, 0.0f);
            gm.drawAnimatedEmojis(canvas, qh9Var.b, qh9Var.F, 0.0f, qh9Var.x, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        if (i0 != 0) {
            canvas.restore();
        }
        j0();
        Matrix matrix = this.b0;
        matrix.reset();
        matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.c, 0.0f);
        this.a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, rh9Var.C, I(), this.c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void X(Canvas canvas, int i, float f) {
        int i2;
        qh9 qh9Var = this.X;
        int i3 = qh9Var.f;
        rh9 rh9Var = this.a;
        int i4 = rh9Var.C;
        TextPaint textPaint = rh9Var.w;
        canvas.saveLayerAlpha(0.0f, 0.0f, i4, I(), 255, 31);
        int i0 = i0();
        if (i0 != 0) {
            qh9Var.c = (this.b.left + i0) - i3;
        }
        canvas.save();
        canvas.translate(i0 - i3, 0.0f);
        int color = textPaint.getColor();
        textPaint.setColor(-1);
        if (rh9Var.D()) {
            i2 = bkb.Xc;
        } else {
            i2 = bkb.Wc;
        }
        textPaint.linkColor = bkb.v0(i2, rh9Var.D);
        lg7.b(canvas, qh9Var.b, i, f, new kq8(this, this.W, (byte) 9));
        canvas.restore();
        textPaint.setColor(color);
        j0();
        Matrix matrix = this.b0;
        matrix.reset();
        matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.c, 0.0f);
        this.a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, rh9Var.C, I(), this.c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i0 = i0();
        qh9 qh9Var = this.X;
        if (i0 == 0) {
            return qh9Var.t(motionEvent);
        }
        motionEvent.offsetLocation(-i0, 0.0f);
        boolean t = qh9Var.t(motionEvent);
        motionEvent.offsetLocation(i0, 0.0f);
        return t;
    }

    @Override
    public final void Z(int i, int i2, int i3) {
        super.Z(i, i2, i3);
        int i0 = i0();
        if (i0 != 0) {
            qh9 qh9Var = this.X;
            qh9Var.c = (i + i0) - qh9Var.f;
        }
    }

    @Override
    public final Layout a() {
        return this.X.b;
    }

    public final int i0() {
        rh9 rh9Var = this.a;
        if (!rh9Var.H()) {
            return 0;
        }
        int L = (rh9Var.C + rh9Var.T) - gl.L(14.0f);
        Rect rect = this.b;
        return ((L - rect.right) - rect.left) - this.X.r();
    }

    public final void j0() {
        int i;
        rh9 rh9Var = this.a;
        if (rh9Var.D()) {
            i = bkb.Vc;
        } else {
            i = bkb.Uc;
        }
        int v0 = bkb.v0(i, rh9Var.D);
        if (this.a0 != null && this.Z == v0) {
            return;
        }
        this.Z = v0;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.c, 0.0f, new int[]{bkb.p1(0.7f, v0), bkb.p1(0.25f, v0), bkb.p1(0.7f, v0)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
        this.a0 = linearGradient;
        Paint paint = this.c0;
        paint.setShader(linearGradient);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        mg9.m(spannableStringBuilder, this.X, this.Y);
    }

    @Override
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        return false;
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i, eg9 eg9Var) {
        qh9 qh9Var = this.X;
        if (qh9Var.o(characterStyle, eg9Var)) {
            Rect rect = this.b;
            eg9Var.e = (i0() + rect.left) - qh9Var.f;
            eg9Var.f = i + rect.top;
            return true;
        }
        return false;
    }
}
