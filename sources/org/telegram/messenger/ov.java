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
import org.telegram.ui.xh0;
public final class ov extends ru {
    public final vv W;
    public final vv[] X;
    public int Y;
    public LinearGradient Z;
    public final Matrix f17514a0;
    public final Paint f17515b0;

    public ov(wv wvVar, Rect rect, int i10, SpannableStringBuilder spannableStringBuilder) {
        super(wvVar, rect, i10);
        this.f17514a0 = new Matrix();
        this.f17515b0 = new Paint(1);
        vv vvVar = new vv(wvVar, spannableStringBuilder, this.f17969c);
        this.W = vvVar;
        this.X = r2;
        vv[] vvVarArr = {vvVar};
    }

    @Override
    public final int H() {
        Rect rect = this.f17968b;
        return this.W.f18904b.getHeight() + rect.top + rect.bottom;
    }

    @Override
    public final int I() {
        Rect rect = this.f17968b;
        return this.W.q() + rect.left + rect.right;
    }

    @Override
    public final int J() {
        Rect rect = this.f17968b;
        return this.W.r() + rect.left + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] K() {
        return this.X;
    }

    @Override
    public final void S() {
        this.W.i(this.V);
    }

    @Override
    public final void U() {
        this.W.f(this.V);
    }

    @Override
    public final void V(Canvas canvas) {
        wv wvVar = this.f17967a;
        canvas.saveLayerAlpha(0.0f, 0.0f, wvVar.C, H(), 255, 31);
        int h02 = h0();
        vv vvVar = this.W;
        if (h02 != 0) {
            vvVar.f18905c = (this.f17968b.left + h02) - vvVar.f18906f;
            canvas.save();
            canvas.translate(h02, 0.0f);
        }
        vvVar.d(canvas, vvVar.S);
        if (wvVar.F()) {
            canvas.save();
            canvas.translate(-vvVar.f18906f, 0.0f);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, vvVar.f18904b, vvVar.E, 0.0f, vvVar.f18911x, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        if (h02 != 0) {
            canvas.restore();
        }
        i0();
        Matrix matrix = this.f17514a0;
        matrix.reset();
        matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.f17969c, 0.0f);
        this.Z.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, wvVar.C, H(), this.f17515b0);
        canvas.restore();
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void W(Canvas canvas, int i10, float f7) {
        int i11;
        wv wvVar = this.f17967a;
        int i12 = wvVar.C;
        TextPaint textPaint = wvVar.f19347w;
        canvas.saveLayerAlpha(0.0f, 0.0f, i12, H(), 255, 31);
        int h02 = h0();
        vv vvVar = this.W;
        if (h02 != 0) {
            vvVar.f18905c = (this.f17968b.left + h02) - vvVar.f18906f;
        }
        canvas.save();
        canvas.translate(h02 - vvVar.f18906f, 0.0f);
        int color = textPaint.getColor();
        textPaint.setColor(-1);
        if (wvVar.E()) {
            i11 = org.telegram.ui.ActionBar.t6.Vc;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.Uc;
        }
        textPaint.linkColor = org.telegram.ui.ActionBar.t6.w0(i11, wvVar.D);
        xh0.b(canvas, vvVar.f18904b, i10, f7, new p(5, this, this.V));
        canvas.restore();
        textPaint.setColor(color);
        i0();
        Matrix matrix = this.f17514a0;
        matrix.reset();
        matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.f17969c, 0.0f);
        this.Z.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, wvVar.C, H(), this.f17515b0);
        canvas.restore();
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        int h02 = h0();
        vv vvVar = this.W;
        if (h02 == 0) {
            return vvVar.t(motionEvent);
        }
        motionEvent.offsetLocation(-h02, 0.0f);
        boolean t10 = vvVar.t(motionEvent);
        motionEvent.offsetLocation(h02, 0.0f);
        return t10;
    }

    @Override
    public final void Y(int i10, int i11, int i12) {
        super.Y(i10, i11, i12);
        int h02 = h0();
        if (h02 != 0) {
            int i13 = i10 + h02;
            vv vvVar = this.W;
            vvVar.f18905c = i13 - vvVar.f18906f;
        }
    }

    @Override
    public final Layout a() {
        return this.W.f18904b;
    }

    public final int h0() {
        wv wvVar = this.f17967a;
        if (!wvVar.I()) {
            return 0;
        }
        int L = (wvVar.C + wvVar.T) - i0.L(14.0f);
        Rect rect = this.f17968b;
        return ((L - rect.right) - rect.left) - this.W.r();
    }

    public final void i0() {
        int i10;
        wv wvVar = this.f17967a;
        if (wvVar.E()) {
            i10 = org.telegram.ui.ActionBar.t6.Tc;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.Sc;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, wvVar.D);
        if (this.Z != null && this.Y == w02) {
            return;
        }
        this.Y = w02;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f17969c, 0.0f, new int[]{org.telegram.ui.ActionBar.t6.r1(0.7f, w02), org.telegram.ui.ActionBar.t6.r1(0.25f, w02), org.telegram.ui.ActionBar.t6.r1(0.7f, w02)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
        this.Z = linearGradient;
        Paint paint = this.f17515b0;
        paint.setShader(linearGradient);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        ru.l(spannableStringBuilder, this.W, this.X);
    }

    @Override
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        return false;
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i10, iu iuVar) {
        vv vvVar = this.W;
        if (vvVar.o(characterStyle, iuVar)) {
            Rect rect = this.f17968b;
            iuVar.e = (h0() + rect.left) - vvVar.f18906f;
            iuVar.f16348f = i10 + rect.top;
            return true;
        }
        return false;
    }
}
