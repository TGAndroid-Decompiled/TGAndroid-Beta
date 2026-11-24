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
public final class iob extends View {
    public uib a;
    public uib b;
    public boolean c;
    public final ln d;
    public final fg0 e;
    public final ColorMatrixColorFilter f;
    public final Paint h;
    public final Paint n;
    public final rob r;

    public iob(rob robVar, Context context) {
        super(context);
        this.r = robVar;
        this.d = new ln(this, 0L, 350L, d53.h);
        fg0 Y = cmb.Y(285212671, 8, 8);
        this.e = Y;
        this.h = new Paint(1);
        this.n = new Paint(1);
        Y.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        gm.i(colorMatrix, 0.35f);
        gm.l2(colorMatrix, 0.9f);
        this.f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence a() {
        uib uibVar = this.a;
        if (uibVar != null) {
            return uibVar.i();
        }
        return null;
    }

    public final void b(SpannableStringBuilder spannableStringBuilder, boolean z) {
        boolean z2;
        if (spannableStringBuilder != null) {
            this.b = new uib(spannableStringBuilder, 12.0f, null);
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
        this.a = new uib(charSequence, 14.0f, gm.o());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = gm.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        rob robVar = this.r;
        hob hobVar = robVar.z0;
        tnb tnbVar = robVar.a;
        cmb.s(this, hobVar, tnbVar);
        Paint d = tnbVar.d("paintChatActionBackground");
        ColorFilter colorFilter = d.getColorFilter();
        d.setColorFilter(this.f);
        canvas.drawRoundRect(rectF, height, height, d);
        d.setColorFilter(colorFilter);
        if (robVar.O1) {
            float f = robVar.p1;
            if (f > 0.0f) {
                int p = on2.p(-16777216, (int) (f * 255.0f * robVar.q1));
                Paint paint = this.n;
                paint.setColor(p);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float d2 = this.d.d(this.c);
        uib uibVar = this.a;
        if (uibVar != null) {
            uibVar.p = getWidth() - gm.L(14.0f);
            uibVar.c((getWidth() - this.a.j()) / 2.0f, ((gm.L(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (gm.L(7.0f) * d2), 1.0f, -1, canvas);
        }
        if (this.b != null) {
            canvas.save();
            canvas.scale(d2, d2, getWidth() / 2.0f, (getHeight() / 2.0f) + gm.L(11.0f));
            uib uibVar2 = this.b;
            uibVar2.p = getWidth() - gm.L(14.0f);
            float L = 0.0f * gm.L(24.0f);
            uibVar2.c((getWidth() - this.b.j()) / 2.0f, gm.L(11.0f) + L + (getHeight() / 2.0f), 1.0f, cmb.p1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        fg0 fg0Var = this.e;
        fg0Var.setBounds(0, 0, width, height2);
        fg0Var.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        fg0 fg0Var = this.e;
        if (action == 0) {
            fg0Var.setHotspot(motionEvent.getX(), motionEvent.getY());
            fg0Var.setState(new int[]{16842910, 16842919});
            z = true;
        } else {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                fg0Var.setState(StateSet.NOTHING);
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
