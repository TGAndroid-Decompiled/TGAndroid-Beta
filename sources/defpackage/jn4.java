package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
public final class jn4 extends View implements vlb {
    public Matrix E;
    public ho F;
    public TextPaint a;
    public TextPaint b;
    public Paint c;
    public Path d;
    public float[] e;
    public uib f;
    public uib h;
    public uib n;
    public LinearGradient r;
    public LinearGradient s;
    public Paint w;
    public Paint x;
    public Matrix y;

    public static CharSequence a(CharSequence charSequence) {
        if ("ALL_CHATS".equals(charSequence.toString())) {
            return jb6.M0(2131750744, null);
        }
        return charSequence;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        uib uibVar;
        float f5;
        float f6;
        Paint paint = this.c;
        Matrix matrix = this.E;
        Matrix matrix2 = this.y;
        Path path = this.d;
        uib uibVar2 = this.n;
        uib uibVar3 = this.f;
        ho hoVar = this.F;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        uib uibVar4 = this.h;
        if (uibVar4 != null) {
            canvas.save();
            float f7 = uibVar4.c;
            f = 15.32f;
            CharSequence charSequence = hoVar.i;
            if (charSequence != null && charSequence.length() != 0) {
                f6 = hoVar.c() + gm.L(15.32f);
            } else {
                f6 = 0.0f;
            }
            float f8 = f7 + f6;
            f2 = measuredWidth - (f8 / 2.0f);
            canvas.translate(f2, measuredHeight - (uibVar4.h() / 2.0f));
            uibVar4.d(canvas);
            canvas.restore();
            f3 = f8;
        } else {
            f = 15.32f;
            f2 = measuredWidth;
            f3 = 0.0f;
        }
        CharSequence charSequence2 = hoVar.i;
        if (charSequence2 != null && charSequence2.length() != 0) {
            Rect rect = gm.Q;
            f5 = 2.0f;
            f4 = measuredHeight;
            uibVar = uibVar4;
            rect.set((int) (uibVar4.c + f2 + gm.L(4.66f)), (int) (measuredHeight - gm.L(9.0f)), (int) (hoVar.c() + uibVar4.c + f2 + gm.L(f)), (int) (f4 + gm.L(9.0f)));
            RectF rectF = gm.P;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, gm.L(9.0f), gm.L(9.0f), paint);
            rect.offset(-gm.L(0.33f), -gm.L(0.66f));
            hoVar.setBounds(rect);
            hoVar.draw(canvas);
        } else {
            f4 = measuredHeight;
            uibVar = uibVar4;
            f5 = 2.0f;
        }
        float L = gm.L(30.0f);
        float f9 = (f2 - L) - uibVar3.c;
        canvas.save();
        canvas.translate(f9, (f4 - (uibVar3.h() / f5)) + gm.L(1.0f));
        uibVar3.d(canvas);
        canvas.restore();
        float f10 = f2 + f3;
        if (uibVar2 != null) {
            canvas.save();
            canvas.translate(f10 + L, (f4 - (uibVar2.h() / f5)) + gm.L(1.0f));
            uibVar2.d(canvas);
            canvas.restore();
            f10 += L + uibVar2.c;
        }
        float f11 = f10;
        float L2 = gm.L(12.0f) + (uibVar.h() / f5) + f4;
        canvas.drawRect(0.0f, L2, getMeasuredWidth(), 1.0f + L2, this.a);
        path.rewind();
        RectF rectF2 = gm.P;
        float f12 = f3 / f5;
        float f13 = measuredWidth + f12;
        rectF2.set((measuredWidth - f12) - gm.L(4.0f), L2 - gm.L(4.0f), gm.L(4.0f) + f13, L2);
        path.addRoundRect(rectF2, this.e, Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.save();
        float max = Math.max(gm.L(8.0f), f9);
        matrix2.reset();
        matrix2.postTranslate(Math.min(f2, max + gm.L(8.0f)), 0.0f);
        this.r.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - gm.L(8.0f), f11);
        matrix.reset();
        matrix.postTranslate(Math.max(f13, min - gm.L(88.0f)), 0.0f);
        this.s.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.w);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.x);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void updateColors() {
        Paint paint = this.c;
        TextPaint textPaint = this.b;
        TextPaint textPaint2 = this.a;
        if (textPaint2 != null && textPaint != null && paint != null) {
            int i = cmb.ui;
            textPaint2.setColor(cmb.p1(0.8f, cmb.w0(null, i, false)));
            int i2 = cmb.n6;
            textPaint.setColor(cmb.w0(null, i2, false));
            paint.setColor(cmb.w0(null, cmb.Ji, false));
            try {
                ho hoVar = this.F;
                if (hoVar != null) {
                    hoVar.u(cmb.w0(null, cmb.c6, false));
                }
                int p1 = cmb.p1(0.8f, cmb.w0(null, i, false));
                uib uibVar = this.f;
                if (uibVar != null) {
                    uibVar.m(p1);
                }
                uib uibVar2 = this.h;
                if (uibVar2 != null) {
                    uibVar2.m(cmb.w0(null, i2, false));
                }
                uib uibVar3 = this.n;
                if (uibVar3 != null) {
                    uibVar3.m(p1);
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.F && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
