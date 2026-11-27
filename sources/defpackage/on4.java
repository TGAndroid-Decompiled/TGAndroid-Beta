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
public final class on4 extends View implements snb {
    public Matrix E;
    public hn F;
    public TextPaint a;
    public TextPaint b;
    public Paint c;
    public Path d;
    public float[] e;
    public pkb f;
    public pkb h;
    public pkb n;
    public LinearGradient r;
    public LinearGradient s;
    public Paint w;
    public Paint x;
    public Matrix y;

    public static CharSequence a(CharSequence charSequence) {
        if ("ALL_CHATS".equals(charSequence.toString())) {
            return ob6.M0(2131750772, null);
        }
        return charSequence;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        pkb pkbVar;
        float f5;
        float f6;
        Paint paint = this.c;
        Matrix matrix = this.E;
        Matrix matrix2 = this.y;
        Path path = this.d;
        pkb pkbVar2 = this.n;
        pkb pkbVar3 = this.f;
        hn hnVar = this.F;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        pkb pkbVar4 = this.h;
        if (pkbVar4 != null) {
            canvas.save();
            float f7 = pkbVar4.c;
            f = 15.32f;
            CharSequence charSequence = hnVar.i;
            if (charSequence != null && charSequence.length() != 0) {
                f6 = hnVar.c() + hl.L(15.32f);
            } else {
                f6 = 0.0f;
            }
            float f8 = f7 + f6;
            f2 = measuredWidth - (f8 / 2.0f);
            canvas.translate(f2, measuredHeight - (pkbVar4.h() / 2.0f));
            pkbVar4.d(canvas);
            canvas.restore();
            f3 = f8;
        } else {
            f = 15.32f;
            f2 = measuredWidth;
            f3 = 0.0f;
        }
        CharSequence charSequence2 = hnVar.i;
        if (charSequence2 != null && charSequence2.length() != 0) {
            Rect rect = hl.Q;
            f5 = 2.0f;
            f4 = measuredHeight;
            pkbVar = pkbVar4;
            rect.set((int) (pkbVar4.c + f2 + hl.L(4.66f)), (int) (measuredHeight - hl.L(9.0f)), (int) (hnVar.c() + pkbVar4.c + f2 + hl.L(f)), (int) (f4 + hl.L(9.0f)));
            RectF rectF = hl.P;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, hl.L(9.0f), hl.L(9.0f), paint);
            rect.offset(-hl.L(0.33f), -hl.L(0.66f));
            hnVar.setBounds(rect);
            hnVar.draw(canvas);
        } else {
            f4 = measuredHeight;
            pkbVar = pkbVar4;
            f5 = 2.0f;
        }
        float L = hl.L(30.0f);
        float f9 = (f2 - L) - pkbVar3.c;
        canvas.save();
        canvas.translate(f9, (f4 - (pkbVar3.h() / f5)) + hl.L(1.0f));
        pkbVar3.d(canvas);
        canvas.restore();
        float f10 = f2 + f3;
        if (pkbVar2 != null) {
            canvas.save();
            canvas.translate(f10 + L, (f4 - (pkbVar2.h() / f5)) + hl.L(1.0f));
            pkbVar2.d(canvas);
            canvas.restore();
            f10 += L + pkbVar2.c;
        }
        float f11 = f10;
        float L2 = hl.L(12.0f) + (pkbVar.h() / f5) + f4;
        canvas.drawRect(0.0f, L2, getMeasuredWidth(), 1.0f + L2, this.a);
        path.rewind();
        RectF rectF2 = hl.P;
        float f12 = f3 / f5;
        float f13 = measuredWidth + f12;
        rectF2.set((measuredWidth - f12) - hl.L(4.0f), L2 - hl.L(4.0f), hl.L(4.0f) + f13, L2);
        path.addRoundRect(rectF2, this.e, Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.save();
        float max = Math.max(hl.L(8.0f), f9);
        matrix2.reset();
        matrix2.postTranslate(Math.min(f2, max + hl.L(8.0f)), 0.0f);
        this.r.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - hl.L(8.0f), f11);
        matrix.reset();
        matrix.postTranslate(Math.max(f13, min - hl.L(88.0f)), 0.0f);
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
            int i = aob.vi;
            textPaint2.setColor(aob.p1(0.8f, aob.w0(null, i, false)));
            int i2 = aob.o6;
            textPaint.setColor(aob.w0(null, i2, false));
            paint.setColor(aob.w0(null, aob.Ki, false));
            try {
                hn hnVar = this.F;
                if (hnVar != null) {
                    hnVar.u(aob.w0(null, aob.d6, false));
                }
                int p1 = aob.p1(0.8f, aob.w0(null, i, false));
                pkb pkbVar = this.f;
                if (pkbVar != null) {
                    pkbVar.m(p1);
                }
                pkb pkbVar2 = this.h;
                if (pkbVar2 != null) {
                    pkbVar2.m(aob.w0(null, i2, false));
                }
                pkb pkbVar3 = this.n;
                if (pkbVar3 != null) {
                    pkbVar3.m(p1);
                }
            } catch (Exception e) {
                cc4.g(e, true);
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
