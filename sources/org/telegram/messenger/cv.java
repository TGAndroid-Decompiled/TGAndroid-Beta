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
import org.telegram.ui.tg0;
public final class cv extends fu {
    public final jv W;
    public final jv[] X;
    public int Y;
    public LinearGradient Z;
    public final Matrix f21902a0;
    public final Paint f21903b0;

    public cv(kv kvVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder) {
        super(kvVar, rect, i7);
        this.f21902a0 = new Matrix();
        this.f21903b0 = new Paint(1);
        jv jvVar = new jv(kvVar, spannableStringBuilder, this.f22445c);
        this.W = jvVar;
        this.X = r2;
        jv[] jvVarArr = {jvVar};
    }

    @Override
    public final int I() {
        Rect rect = this.f22444b;
        return this.W.f23586b.getHeight() + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        Rect rect = this.f22444b;
        return this.W.q() + rect.left + rect.right;
    }

    @Override
    public final int K() {
        Rect rect = this.f22444b;
        return this.W.r() + rect.left + rect.right;
    }

    @Override
    public final org.telegram.ui.Cells.t9[] L() {
        return this.X;
    }

    @Override
    public final void T() {
        this.W.i(this.V);
    }

    @Override
    public final void V() {
        this.W.f(this.V);
    }

    @Override
    public final void W(Canvas canvas) {
        kv kvVar = this.f22443a;
        canvas.saveLayerAlpha(0.0f, 0.0f, kvVar.C, I(), 255, 31);
        int i02 = i0();
        jv jvVar = this.W;
        if (i02 != 0) {
            jvVar.f23587c = (this.f22444b.left + i02) - jvVar.f23589f;
            canvas.save();
            canvas.translate(i02, 0.0f);
        }
        jvVar.d(canvas, jvVar.S);
        if (kvVar.F()) {
            canvas.save();
            canvas.translate(-jvVar.f23589f, 0.0f);
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, jvVar.f23586b, jvVar.E, 0.0f, jvVar.f23594x, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        if (i02 != 0) {
            canvas.restore();
        }
        j0();
        Matrix matrix = this.f21902a0;
        matrix.reset();
        matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.f22445c, 0.0f);
        this.Z.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, kvVar.C, I(), this.f21903b0);
        canvas.restore();
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void X(Canvas canvas, int i7, float f10) {
        int i10;
        kv kvVar = this.f22443a;
        int i11 = kvVar.C;
        TextPaint textPaint = kvVar.f23775w;
        canvas.saveLayerAlpha(0.0f, 0.0f, i11, I(), 255, 31);
        int i02 = i0();
        jv jvVar = this.W;
        if (i02 != 0) {
            jvVar.f23587c = (this.f22444b.left + i02) - jvVar.f23589f;
        }
        canvas.save();
        canvas.translate(i02 - jvVar.f23589f, 0.0f);
        int color = textPaint.getColor();
        textPaint.setColor(-1);
        if (kvVar.E()) {
            i10 = org.telegram.ui.ActionBar.k6.Vc;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.Uc;
        }
        textPaint.linkColor = org.telegram.ui.ActionBar.k6.w0(i10, kvVar.D);
        tg0.b(canvas, jvVar.f23586b, i7, f10, new o(5, this, this.V));
        canvas.restore();
        textPaint.setColor(color);
        j0();
        Matrix matrix = this.f21902a0;
        matrix.reset();
        matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.f22445c, 0.0f);
        this.Z.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, kvVar.C, I(), this.f21903b0);
        canvas.restore();
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        jv jvVar = this.W;
        if (i02 == 0) {
            return jvVar.t(motionEvent);
        }
        motionEvent.offsetLocation(-i02, 0.0f);
        boolean t6 = jvVar.t(motionEvent);
        motionEvent.offsetLocation(i02, 0.0f);
        return t6;
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        super.Z(i7, i10, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i7 + i02;
            jv jvVar = this.W;
            jvVar.f23587c = i12 - jvVar.f23589f;
        }
    }

    @Override
    public final Layout a() {
        return this.W.f23586b;
    }

    public final int i0() {
        kv kvVar = this.f22443a;
        if (!kvVar.I()) {
            return 0;
        }
        int L = (kvVar.C + kvVar.T) - g0.L(14.0f);
        Rect rect = this.f22444b;
        return ((L - rect.right) - rect.left) - this.W.r();
    }

    public final void j0() {
        int i7;
        kv kvVar = this.f22443a;
        if (kvVar.E()) {
            i7 = org.telegram.ui.ActionBar.k6.Tc;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.Sc;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, kvVar.D);
        if (this.Z != null && this.Y == w02) {
            return;
        }
        this.Y = w02;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f22445c, 0.0f, new int[]{org.telegram.ui.ActionBar.k6.r1(0.7f, w02), org.telegram.ui.ActionBar.k6.r1(0.25f, w02), org.telegram.ui.ActionBar.k6.r1(0.7f, w02)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
        this.Z = linearGradient;
        Paint paint = this.f21903b0;
        paint.setShader(linearGradient);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        fu.l(spannableStringBuilder, this.W, this.X);
    }

    @Override
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        return false;
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, wt wtVar) {
        jv jvVar = this.W;
        if (jvVar.o(characterStyle, wtVar)) {
            Rect rect = this.f22444b;
            wtVar.f26360e = (i0() + rect.left) - jvVar.f23589f;
            wtVar.f26361f = i7 + rect.top;
            return true;
        }
        return false;
    }
}
