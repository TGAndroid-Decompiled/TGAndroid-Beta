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
import org.telegram.ui.zh0;
public final class nv extends qu {
    public final uv W;
    public final uv[] X;
    public int Y;
    public LinearGradient Z;
    public final Matrix f17177a0;
    public final Paint f17178b0;

    public nv(vv vvVar, Rect rect, int i10, SpannableStringBuilder spannableStringBuilder) {
        super(vvVar, rect, i10);
        this.f17177a0 = new Matrix();
        this.f17178b0 = new Paint(1);
        uv uvVar = new uv(vvVar, spannableStringBuilder, this.f17623c);
        this.W = uvVar;
        this.X = r2;
        uv[] uvVarArr = {uvVar};
    }

    @Override
    public final int H() {
        Rect rect = this.f17622b;
        return this.W.f18396b.getHeight() + rect.top + rect.bottom;
    }

    @Override
    public final int I() {
        Rect rect = this.f17622b;
        return this.W.q() + rect.left + rect.right;
    }

    @Override
    public final int J() {
        Rect rect = this.f17622b;
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
        vv vvVar = this.f17621a;
        canvas.saveLayerAlpha(0.0f, 0.0f, vvVar.C, H(), 255, 31);
        int h02 = h0();
        uv uvVar = this.W;
        if (h02 != 0) {
            uvVar.f18397c = (this.f17622b.left + h02) - uvVar.f18398f;
            canvas.save();
            canvas.translate(h02, 0.0f);
        }
        uvVar.d(canvas, uvVar.S);
        if (vvVar.F()) {
            canvas.save();
            canvas.translate(-uvVar.f18398f, 0.0f);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, uvVar.f18396b, uvVar.E, 0.0f, uvVar.f18403x, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        if (h02 != 0) {
            canvas.restore();
        }
        i0();
        Matrix matrix = this.f17177a0;
        matrix.reset();
        matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.f17623c, 0.0f);
        this.Z.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, vvVar.C, H(), this.f17178b0);
        canvas.restore();
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void W(Canvas canvas, int i10, float f7) {
        int i11;
        vv vvVar = this.f17621a;
        int i12 = vvVar.C;
        TextPaint textPaint = vvVar.f19004w;
        canvas.saveLayerAlpha(0.0f, 0.0f, i12, H(), 255, 31);
        int h02 = h0();
        uv uvVar = this.W;
        if (h02 != 0) {
            uvVar.f18397c = (this.f17622b.left + h02) - uvVar.f18398f;
        }
        canvas.save();
        canvas.translate(h02 - uvVar.f18398f, 0.0f);
        int color = textPaint.getColor();
        textPaint.setColor(-1);
        if (vvVar.E()) {
            i11 = org.telegram.ui.ActionBar.t6.Vc;
        } else {
            i11 = org.telegram.ui.ActionBar.t6.Uc;
        }
        textPaint.linkColor = org.telegram.ui.ActionBar.t6.w0(i11, vvVar.D);
        zh0.b(canvas, uvVar.f18396b, i10, f7, new p(5, this, this.V));
        canvas.restore();
        textPaint.setColor(color);
        i0();
        Matrix matrix = this.f17177a0;
        matrix.reset();
        matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.f17623c, 0.0f);
        this.Z.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, vvVar.C, H(), this.f17178b0);
        canvas.restore();
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        int h02 = h0();
        uv uvVar = this.W;
        if (h02 == 0) {
            return uvVar.t(motionEvent);
        }
        motionEvent.offsetLocation(-h02, 0.0f);
        boolean t10 = uvVar.t(motionEvent);
        motionEvent.offsetLocation(h02, 0.0f);
        return t10;
    }

    @Override
    public final void Y(int i10, int i11, int i12) {
        super.Y(i10, i11, i12);
        int h02 = h0();
        if (h02 != 0) {
            int i13 = i10 + h02;
            uv uvVar = this.W;
            uvVar.f18397c = i13 - uvVar.f18398f;
        }
    }

    @Override
    public final Layout a() {
        return this.W.f18396b;
    }

    public final int h0() {
        vv vvVar = this.f17621a;
        if (!vvVar.I()) {
            return 0;
        }
        int L = (vvVar.C + vvVar.T) - i0.L(14.0f);
        Rect rect = this.f17622b;
        return ((L - rect.right) - rect.left) - this.W.r();
    }

    public final void i0() {
        int i10;
        vv vvVar = this.f17621a;
        if (vvVar.E()) {
            i10 = org.telegram.ui.ActionBar.t6.Tc;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.Sc;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, vvVar.D);
        if (this.Z != null && this.Y == w02) {
            return;
        }
        this.Y = w02;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f17623c, 0.0f, new int[]{org.telegram.ui.ActionBar.t6.r1(0.7f, w02), org.telegram.ui.ActionBar.t6.r1(0.25f, w02), org.telegram.ui.ActionBar.t6.r1(0.7f, w02)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
        this.Z = linearGradient;
        Paint paint = this.f17178b0;
        paint.setShader(linearGradient);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        qu.l(spannableStringBuilder, this.W, this.X);
    }

    @Override
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        return false;
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i10, hu huVar) {
        uv uvVar = this.W;
        if (uvVar.o(characterStyle, huVar)) {
            Rect rect = this.f17622b;
            huVar.e = (h0() + rect.left) - uvVar.f18398f;
            huVar.f15956f = i10 + rect.top;
            return true;
        }
        return false;
    }
}
