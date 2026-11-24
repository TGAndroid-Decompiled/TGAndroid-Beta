package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
public final class hmb extends View {
    public tgb a;
    public tgb b;
    public boolean c;
    public final lm d;
    public final ff0 e;
    public final ColorMatrixColorFilter f;
    public final Paint h;
    public final Paint n;
    public final qmb r;

    public hmb(qmb qmbVar, Context context) {
        super(context);
        this.r = qmbVar;
        this.d = new lm(this, 0L, 350L, s33.h);
        ff0 Y = bkb.Y(285212671, 8, 8);
        this.e = Y;
        this.h = new Paint(1);
        this.n = new Paint(1);
        Y.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        gl.i(colorMatrix, 0.35f);
        gl.l2(colorMatrix, 0.9f);
        this.f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence a() {
        tgb tgbVar = this.a;
        if (tgbVar != null) {
            return tgbVar.i();
        }
        return null;
    }

    public final void b(SpannableStringBuilder spannableStringBuilder, boolean z) {
        boolean z2;
        if (spannableStringBuilder != null) {
            this.b = new tgb(spannableStringBuilder, 12.0f, null);
            z2 = true;
        } else {
            z2 = false;
        }
        this.c = z2;
        if (!z) {
            this.d.f(z2, true);
        }
        invalidate();
    }

    public final void c(CharSequence charSequence) {
        this.a = new tgb(charSequence, 14.0f, gl.o());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = gl.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        qmb qmbVar = this.r;
        gmb gmbVar = qmbVar.z0;
        slb slbVar = qmbVar.a;
        bkb.s(this, gmbVar, slbVar);
        Paint d = slbVar.d("paintChatActionBackground");
        ColorFilter colorFilter = d.getColorFilter();
        d.setColorFilter(this.f);
        canvas.drawRoundRect(rectF, height, height, d);
        d.setColorFilter(colorFilter);
        if (qmbVar.O1) {
            float f = qmbVar.p1;
            if (f > 0.0f) {
                int o = bm2.o(-16777216, (int) (f * 255.0f * qmbVar.q1));
                Paint paint = this.n;
                paint.setColor(o);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float d2 = this.d.d(this.c);
        tgb tgbVar = this.a;
        if (tgbVar != null) {
            tgbVar.p = getWidth() - gl.L(14.0f);
            tgbVar.c((getWidth() - this.a.j()) / 2.0f, ((gl.L(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (gl.L(7.0f) * d2), 1.0f, -1, canvas);
        }
        if (this.b != null) {
            canvas.save();
            canvas.scale(d2, d2, getWidth() / 2.0f, (getHeight() / 2.0f) + gl.L(11.0f));
            tgb tgbVar2 = this.b;
            tgbVar2.p = getWidth() - gl.L(14.0f);
            float L = 0.0f * gl.L(24.0f);
            tgbVar2.c((getWidth() - this.b.j()) / 2.0f, gl.L(11.0f) + L + (getHeight() / 2.0f), 1.0f, bkb.p1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        ff0 ff0Var = this.e;
        ff0Var.setBounds(0, 0, width, height2);
        ff0Var.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        ff0 ff0Var = this.e;
        if (action == 0) {
            ff0Var.setHotspot(motionEvent.getX(), motionEvent.getY());
            ff0Var.setState(new int[]{16842910, 16842919});
            z = true;
        } else {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                ff0Var.setState(StateSet.NOTHING);
            }
            z = false;
        }
        if (super.onTouchEvent(motionEvent) || z) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
