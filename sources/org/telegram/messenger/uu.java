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
import org.telegram.ui.ng0;
public final class uu extends xt {
    public final bv X;
    public final bv[] Y;
    public int Z;
    public LinearGradient f25778a0;
    public final Matrix f25779b0;
    public final Paint f25780c0;

    public uu(cv cvVar, Rect rect, int i3, SpannableStringBuilder spannableStringBuilder) {
        super(cvVar, rect, i3);
        this.f25779b0 = new Matrix();
        this.f25780c0 = new Paint(1);
        bv bvVar = new bv(cvVar, spannableStringBuilder, this.f26436c);
        this.X = bvVar;
        this.Y = r2;
        bv[] bvVarArr = {bvVar};
    }

    @Override
    public final int I() {
        Rect rect = this.f26435b;
        return this.X.f21888b.getHeight() + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        Rect rect = this.f26435b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override
    public final int K() {
        Rect rect = this.f26435b;
        return this.X.r() + rect.left + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.s9[] L() {
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
        cv cvVar = this.f26434a;
        canvas.saveLayerAlpha(0.0f, 0.0f, cvVar.C, I(), 255, 31);
        int i02 = i0();
        bv bvVar = this.X;
        if (i02 != 0) {
            bvVar.f21889c = (this.f26435b.left + i02) - bvVar.f21891f;
            canvas.save();
            canvas.translate(i02, 0.0f);
        }
        bvVar.d(canvas, bvVar.T);
        if (cvVar.F()) {
            canvas.save();
            canvas.translate(-bvVar.f21891f, 0.0f);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, bvVar.f21888b, bvVar.F, 0.0f, bvVar.f21896x, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        if (i02 != 0) {
            canvas.restore();
        }
        j0();
        Matrix matrix = this.f25779b0;
        matrix.reset();
        matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.f26436c, 0.0f);
        this.f25778a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, cvVar.C, I(), this.f25780c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void X(Canvas canvas, int i3, float f10) {
        int i10;
        cv cvVar = this.f26434a;
        int i11 = cvVar.C;
        TextPaint textPaint = cvVar.f22084w;
        canvas.saveLayerAlpha(0.0f, 0.0f, i11, I(), 255, 31);
        int i02 = i0();
        bv bvVar = this.X;
        if (i02 != 0) {
            bvVar.f21889c = (this.f26435b.left + i02) - bvVar.f21891f;
        }
        canvas.save();
        canvas.translate(i02 - bvVar.f21891f, 0.0f);
        int color = textPaint.getColor();
        textPaint.setColor(-1);
        if (cvVar.E()) {
            i10 = org.telegram.ui.ActionBar.k6.Vc;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.Uc;
        }
        textPaint.linkColor = org.telegram.ui.ActionBar.k6.w0(i10, cvVar.D);
        ng0.b(canvas, bvVar.f21888b, i3, f10, new o(5, this, this.W));
        canvas.restore();
        textPaint.setColor(color);
        j0();
        Matrix matrix = this.f25779b0;
        matrix.reset();
        matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.f26436c, 0.0f);
        this.f25778a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, cvVar.C, I(), this.f25780c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        bv bvVar = this.X;
        if (i02 == 0) {
            return bvVar.t(motionEvent);
        }
        motionEvent.offsetLocation(-i02, 0.0f);
        boolean t10 = bvVar.t(motionEvent);
        motionEvent.offsetLocation(i02, 0.0f);
        return t10;
    }

    @Override
    public final void Z(int i3, int i10, int i11) {
        super.Z(i3, i10, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i3 + i02;
            bv bvVar = this.X;
            bvVar.f21889c = i12 - bvVar.f21891f;
        }
    }

    @Override
    public final Layout a() {
        return this.X.f21888b;
    }

    public final int i0() {
        cv cvVar = this.f26434a;
        if (!cvVar.I()) {
            return 0;
        }
        int L = (cvVar.C + cvVar.T) - g0.L(14.0f);
        Rect rect = this.f26435b;
        return ((L - rect.right) - rect.left) - this.X.r();
    }

    public final void j0() {
        int i3;
        cv cvVar = this.f26434a;
        if (cvVar.E()) {
            i3 = org.telegram.ui.ActionBar.k6.Tc;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.Sc;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, cvVar.D);
        if (this.f25778a0 != null && this.Z == w02) {
            return;
        }
        this.Z = w02;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f26436c, 0.0f, new int[]{org.telegram.ui.ActionBar.k6.r1(0.7f, w02), org.telegram.ui.ActionBar.k6.r1(0.25f, w02), org.telegram.ui.ActionBar.k6.r1(0.7f, w02)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
        this.f25778a0 = linearGradient;
        Paint paint = this.f25780c0;
        paint.setShader(linearGradient);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        xt.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        return false;
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i3, ot otVar) {
        bv bvVar = this.X;
        if (bvVar.o(characterStyle, otVar)) {
            Rect rect = this.f26435b;
            otVar.f24597e = (i0() + rect.left) - bvVar.f21891f;
            otVar.f24598f = i3 + rect.top;
            return true;
        }
        return false;
    }
}
