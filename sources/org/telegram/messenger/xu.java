package org.telegram.messenger;

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
import org.telegram.ui.yg0;
public final class xu extends au {
    public final ev X;
    public final ev[] Y;
    public int Z;
    public LinearGradient f27926a0;
    public final Matrix f27927b0;
    public final Paint f27928c0;

    public xu(fv fvVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder) {
        super(fvVar, rect, i7);
        this.f27927b0 = new Matrix();
        this.f27928c0 = new Paint(1);
        ev evVar = new ev(fvVar, spannableStringBuilder, this.f22934c);
        this.X = evVar;
        this.Y = r2;
        ev[] evVarArr = {evVar};
    }

    @Override
    public final int I() {
        Rect rect = this.f22933b;
        return this.X.f23734b.getHeight() + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        Rect rect = this.f22933b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override
    public final int K() {
        Rect rect = this.f22933b;
        return this.X.r() + rect.left + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] L() {
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
        fv fvVar = this.f22932a;
        canvas.saveLayerAlpha(0.0f, 0.0f, fvVar.C, I(), 255, 31);
        int i02 = i0();
        ev evVar = this.X;
        if (i02 != 0) {
            evVar.f23735c = (this.f22933b.left + i02) - evVar.f23737f;
            canvas.save();
            canvas.translate(i02, 0.0f);
        }
        evVar.d(canvas, evVar.T);
        if (fvVar.F()) {
            canvas.save();
            canvas.translate(-evVar.f23737f, 0.0f);
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, evVar.f23734b, evVar.F, 0.0f, evVar.f23742x, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        if (i02 != 0) {
            canvas.restore();
        }
        j0();
        Matrix matrix = this.f27927b0;
        matrix.reset();
        matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.f22934c, 0.0f);
        this.f27926a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, fvVar.C, I(), this.f27928c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void X(Canvas canvas, int i7, float f10) {
        int i10;
        fv fvVar = this.f22932a;
        int i11 = fvVar.C;
        TextPaint textPaint = fvVar.f23959w;
        canvas.saveLayerAlpha(0.0f, 0.0f, i11, I(), 255, 31);
        int i02 = i0();
        ev evVar = this.X;
        if (i02 != 0) {
            evVar.f23735c = (this.f22933b.left + i02) - evVar.f23737f;
        }
        canvas.save();
        canvas.translate(i02 - evVar.f23737f, 0.0f);
        int color = textPaint.getColor();
        textPaint.setColor(-1);
        if (fvVar.E()) {
            i10 = org.telegram.ui.ActionBar.m6.Yc;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.Xc;
        }
        textPaint.linkColor = org.telegram.ui.ActionBar.m6.w0(i10, fvVar.D);
        yg0.b(canvas, evVar.f23734b, i7, f10, new o(5, this, this.W));
        canvas.restore();
        textPaint.setColor(color);
        j0();
        Matrix matrix = this.f27927b0;
        matrix.reset();
        matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.f22934c, 0.0f);
        this.f27926a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, fvVar.C, I(), this.f27928c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        ev evVar = this.X;
        if (i02 == 0) {
            return evVar.t(motionEvent);
        }
        motionEvent.offsetLocation(-i02, 0.0f);
        boolean t6 = evVar.t(motionEvent);
        motionEvent.offsetLocation(i02, 0.0f);
        return t6;
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        super.Z(i7, i10, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i7 + i02;
            ev evVar = this.X;
            evVar.f23735c = i12 - evVar.f23737f;
        }
    }

    @Override
    public final Layout a() {
        return this.X.f23734b;
    }

    public final int i0() {
        fv fvVar = this.f22932a;
        if (!fvVar.I()) {
            return 0;
        }
        int L = (fvVar.C + fvVar.T) - g0.L(14.0f);
        Rect rect = this.f22933b;
        return ((L - rect.right) - rect.left) - this.X.r();
    }

    public final void j0() {
        int i7;
        fv fvVar = this.f22932a;
        if (fvVar.E()) {
            i7 = org.telegram.ui.ActionBar.m6.Wc;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.Vc;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, fvVar.D);
        if (this.f27926a0 != null && this.Z == w02) {
            return;
        }
        this.Z = w02;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f22934c, 0.0f, new int[]{org.telegram.ui.ActionBar.m6.r1(0.7f, w02), org.telegram.ui.ActionBar.m6.r1(0.25f, w02), org.telegram.ui.ActionBar.m6.r1(0.7f, w02)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
        this.f27926a0 = linearGradient;
        Paint paint = this.f27928c0;
        paint.setShader(linearGradient);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        au.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        return false;
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, rt rtVar) {
        ev evVar = this.X;
        if (evVar.o(characterStyle, rtVar)) {
            Rect rect = this.f22933b;
            rtVar.f26625e = (i0() + rect.left) - evVar.f23737f;
            rtVar.f26626f = i7 + rect.top;
            return true;
        }
        return false;
    }
}
