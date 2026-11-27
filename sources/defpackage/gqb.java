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
public final class gqb extends View {
    public pkb a;
    public pkb b;
    public boolean c;
    public final mm d;
    public final hf0 e;
    public final ColorMatrixColorFilter f;
    public final Paint h;
    public final Paint n;
    public final pqb r;

    public gqb(pqb pqbVar, Context context) {
        super(context);
        this.r = pqbVar;
        this.d = new mm(this, 0L, 350L, k43.h);
        hf0 Y = aob.Y(285212671, 8, 8);
        this.e = Y;
        this.h = new Paint(1);
        this.n = new Paint(1);
        Y.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        hl.i(colorMatrix, 0.35f);
        hl.l2(colorMatrix, 0.9f);
        this.f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence a() {
        pkb pkbVar = this.a;
        if (pkbVar != null) {
            return pkbVar.i();
        }
        return null;
    }

    public final void b(SpannableStringBuilder spannableStringBuilder, boolean z) {
        boolean z2;
        if (spannableStringBuilder != null) {
            this.b = new pkb(spannableStringBuilder, 12.0f, null);
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
        this.a = new pkb(charSequence, 14.0f, hl.o());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = hl.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        pqb pqbVar = this.r;
        fqb fqbVar = pqbVar.z0;
        rpb rpbVar = pqbVar.a;
        aob.s(this, fqbVar, rpbVar);
        Paint d = rpbVar.d("paintChatActionBackground");
        ColorFilter colorFilter = d.getColorFilter();
        d.setColorFilter(this.f);
        canvas.drawRoundRect(rectF, height, height, d);
        d.setColorFilter(colorFilter);
        if (pqbVar.O1) {
            float f = pqbVar.p1;
            if (f > 0.0f) {
                int o = vm2.o(-16777216, (int) (f * 255.0f * pqbVar.q1));
                Paint paint = this.n;
                paint.setColor(o);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float d2 = this.d.d(this.c);
        pkb pkbVar = this.a;
        if (pkbVar != null) {
            pkbVar.p = getWidth() - hl.L(14.0f);
            pkbVar.c((getWidth() - this.a.j()) / 2.0f, ((hl.L(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (hl.L(7.0f) * d2), 1.0f, -1, canvas);
        }
        if (this.b != null) {
            canvas.save();
            canvas.scale(d2, d2, getWidth() / 2.0f, (getHeight() / 2.0f) + hl.L(11.0f));
            pkb pkbVar2 = this.b;
            pkbVar2.p = getWidth() - hl.L(14.0f);
            float L = 0.0f * hl.L(24.0f);
            pkbVar2.c((getWidth() - this.b.j()) / 2.0f, hl.L(11.0f) + L + (getHeight() / 2.0f), 1.0f, aob.p1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        hf0 hf0Var = this.e;
        hf0Var.setBounds(0, 0, width, height2);
        hf0Var.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        hf0 hf0Var = this.e;
        if (action == 0) {
            hf0Var.setHotspot(motionEvent.getX(), motionEvent.getY());
            hf0Var.setState(new int[]{16842910, 16842919});
            z = true;
        } else {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                hf0Var.setState(StateSet.NOTHING);
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
