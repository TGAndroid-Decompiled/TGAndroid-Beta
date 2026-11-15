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
public final class av extends cu {
    public final hv X;
    public final hv[] Y;
    public int Z;
    public LinearGradient f22603a0;
    public final Matrix f22604b0;
    public final Paint f22605c0;

    public av(iv ivVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder) {
        super(ivVar, rect, i7);
        this.f22604b0 = new Matrix();
        this.f22605c0 = new Paint(1);
        hv hvVar = new hv(ivVar, spannableStringBuilder, this.f22935c);
        this.X = hvVar;
        this.Y = r2;
        hv[] hvVarArr = {hvVar};
    }

    @Override
    public final int I() {
        Rect rect = this.f22934b;
        return this.X.f24222b.getHeight() + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        Rect rect = this.f22934b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override
    public final int K() {
        Rect rect = this.f22934b;
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
        iv ivVar = this.f22933a;
        canvas.saveLayerAlpha(0.0f, 0.0f, ivVar.C, I(), 255, 31);
        int i02 = i0();
        hv hvVar = this.X;
        if (i02 != 0) {
            hvVar.f24223c = (this.f22934b.left + i02) - hvVar.f24225f;
            canvas.save();
            canvas.translate(i02, 0.0f);
        }
        hvVar.d(canvas, hvVar.T);
        if (ivVar.F()) {
            canvas.save();
            canvas.translate(-hvVar.f24225f, 0.0f);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, hvVar.f24222b, hvVar.F, 0.0f, hvVar.f24230x, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        if (i02 != 0) {
            canvas.restore();
        }
        j0();
        Matrix matrix = this.f22604b0;
        matrix.reset();
        matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.f22935c, 0.0f);
        this.f22603a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, ivVar.C, I(), this.f22605c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void X(Canvas canvas, int i7, float f10) {
        int i10;
        iv ivVar = this.f22933a;
        int i11 = ivVar.C;
        TextPaint textPaint = ivVar.f24459w;
        canvas.saveLayerAlpha(0.0f, 0.0f, i11, I(), 255, 31);
        int i02 = i0();
        hv hvVar = this.X;
        if (i02 != 0) {
            hvVar.f24223c = (this.f22934b.left + i02) - hvVar.f24225f;
        }
        canvas.save();
        canvas.translate(i02 - hvVar.f24225f, 0.0f);
        int color = textPaint.getColor();
        textPaint.setColor(-1);
        if (ivVar.E()) {
            i10 = org.telegram.ui.ActionBar.j6.Yc;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.Xc;
        }
        textPaint.linkColor = org.telegram.ui.ActionBar.j6.w0(i10, ivVar.D);
        tg0.b(canvas, hvVar.f24222b, i7, f10, new o(5, this, this.W));
        canvas.restore();
        textPaint.setColor(color);
        j0();
        Matrix matrix = this.f22604b0;
        matrix.reset();
        matrix.postTranslate((((float) (System.currentTimeMillis() % 2000)) / 2000.0f) * this.f22935c, 0.0f);
        this.f22603a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, ivVar.C, I(), this.f22605c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        hv hvVar = this.X;
        if (i02 == 0) {
            return hvVar.t(motionEvent);
        }
        motionEvent.offsetLocation(-i02, 0.0f);
        boolean t6 = hvVar.t(motionEvent);
        motionEvent.offsetLocation(i02, 0.0f);
        return t6;
    }

    @Override
    public final void Z(int i7, int i10, int i11) {
        super.Z(i7, i10, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i7 + i02;
            hv hvVar = this.X;
            hvVar.f24223c = i12 - hvVar.f24225f;
        }
    }

    @Override
    public final Layout a() {
        return this.X.f24222b;
    }

    public final int i0() {
        iv ivVar = this.f22933a;
        if (!ivVar.I()) {
            return 0;
        }
        int L = (ivVar.C + ivVar.T) - g0.L(14.0f);
        Rect rect = this.f22934b;
        return ((L - rect.right) - rect.left) - this.X.r();
    }

    public final void j0() {
        int i7;
        iv ivVar = this.f22933a;
        if (ivVar.E()) {
            i7 = org.telegram.ui.ActionBar.j6.Wc;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.Vc;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, ivVar.D);
        if (this.f22603a0 != null && this.Z == w02) {
            return;
        }
        this.Z = w02;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f22935c, 0.0f, new int[]{org.telegram.ui.ActionBar.j6.r1(0.7f, w02), org.telegram.ui.ActionBar.j6.r1(0.25f, w02), org.telegram.ui.ActionBar.j6.r1(0.7f, w02)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
        this.f22603a0 = linearGradient;
        Paint paint = this.f22605c0;
        paint.setShader(linearGradient);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        cu.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        return false;
    }

    @Override
    public final boolean u(CharacterStyle characterStyle, int i7, tt ttVar) {
        hv hvVar = this.X;
        if (hvVar.o(characterStyle, ttVar)) {
            Rect rect = this.f22934b;
            ttVar.f26731e = (i0() + rect.left) - hvVar.f24225f;
            ttVar.f26732f = i7 + rect.top;
            return true;
        }
        return false;
    }
}
