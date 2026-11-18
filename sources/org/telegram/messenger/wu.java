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
public final class wu extends zt {
    public final dv X;
    public final dv[] Y;
    public int Z;
    public LinearGradient f27762a0;
    public final Matrix f27763b0;
    public final Paint f27764c0;

    public wu(ev evVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder) {
        super(evVar, rect, i7);
        this.f27763b0 = new Matrix();
        this.f27764c0 = new Paint(1);
        dv dvVar = new dv(evVar, spannableStringBuilder, this.f28351c);
        this.X = dvVar;
        this.Y = r2;
        dv[] dvVarArr = {dvVar};
    }

    @Override
    public final int I() {
        Rect rect = this.f28350b;
        return this.X.f23577b.getHeight() + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        Rect rect = this.f28350b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override
    public final int K() {
        Rect rect = this.f28350b;
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
        ev evVar = this.f28349a;
        canvas.saveLayerAlpha(0.0f, 0.0f, evVar.C, I(), 255, 31);
        int i02 = i0();
        dv dvVar = this.X;
        if (i02 != 0) {
            dvVar.f23578c = (this.f28350b.left + i02) - dvVar.f23580f;
            canvas.save();
            canvas.translate(i02, 0.0f);
        }
        dvVar.d(canvas, dvVar.T);
        if (evVar.F()) {
            canvas.save();
            canvas.translate(-dvVar.f23580f, 0.0f);
            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, dvVar.f23577b, dvVar.F, 0.0f, dvVar.f23585x, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        if (i02 != 0) {
            canvas.restore();
        }
        j0();
        Matrix matrix = this.f27763b0;
        matrix.reset();
        matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.f28351c, 0.0f);
        this.f27762a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, evVar.C, I(), this.f27764c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void X(Canvas canvas, int i7, float f10) {
        int i10;
        ev evVar = this.f28349a;
        int i11 = evVar.C;
        TextPaint textPaint = evVar.f23786w;
        canvas.saveLayerAlpha(0.0f, 0.0f, i11, I(), 255, 31);
        int i02 = i0();
        dv dvVar = this.X;
        if (i02 != 0) {
            dvVar.f23578c = (this.f28350b.left + i02) - dvVar.f23580f;
        }
        canvas.save();
        canvas.translate(i02 - dvVar.f23580f, 0.0f);
        int color = textPaint.getColor();
        textPaint.setColor(-1);
        if (evVar.E()) {
            i10 = org.telegram.ui.ActionBar.n6.Yc;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.Xc;
        }
        textPaint.linkColor = org.telegram.ui.ActionBar.n6.w0(i10, evVar.D);
        yg0.b(canvas, dvVar.f23577b, i7, f10, new o(5, this, this.W));
        canvas.restore();
        textPaint.setColor(color);
        j0();
        Matrix matrix = this.f27763b0;
        matrix.reset();
        matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.f28351c, 0.0f);
        this.f27762a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, evVar.C, I(), this.f27764c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        dv dvVar = this.X;
        if (i02 == 0) {
            return dvVar.t(motionEvent);
        }
        motionEvent.offsetLocation(-i02, 0.0f);
        boolean t6 = dvVar.t(motionEvent);
        motionEvent.offsetLocation(i02, 0.0f);
        return t6;
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        super.Z(i7, i10, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i7 + i02;
            dv dvVar = this.X;
            dvVar.f23578c = i12 - dvVar.f23580f;
        }
    }

    @Override
    public final Layout a() {
        return this.X.f23577b;
    }

    public final int i0() {
        ev evVar = this.f28349a;
        if (!evVar.I()) {
            return 0;
        }
        int L = (evVar.C + evVar.T) - g0.L(14.0f);
        Rect rect = this.f28350b;
        return ((L - rect.right) - rect.left) - this.X.r();
    }

    public final void j0() {
        int i7;
        ev evVar = this.f28349a;
        if (evVar.E()) {
            i7 = org.telegram.ui.ActionBar.n6.Wc;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.Vc;
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, evVar.D);
        if (this.f27762a0 != null && this.Z == w02) {
            return;
        }
        this.Z = w02;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f28351c, 0.0f, new int[]{org.telegram.ui.ActionBar.n6.r1(0.7f, w02), org.telegram.ui.ActionBar.n6.r1(0.25f, w02), org.telegram.ui.ActionBar.n6.r1(0.7f, w02)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
        this.f27762a0 = linearGradient;
        Paint paint = this.f27764c0;
        paint.setShader(linearGradient);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        zt.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        return false;
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, qt qtVar) {
        dv dvVar = this.X;
        if (dvVar.o(characterStyle, qtVar)) {
            Rect rect = this.f28350b;
            qtVar.f26450e = (i0() + rect.left) - dvVar.f23580f;
            qtVar.f26451f = i7 + rect.top;
            return true;
        }
        return false;
    }
}
