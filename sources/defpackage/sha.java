package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
public final class sha extends View implements x74 {
    public int E;
    public int F;
    public int G;
    public final pha a;
    public final boolean b;
    public final rha c;
    public final qha d;
    public final Drawable e;
    public final ih2 f;
    public final TextPaint h;
    public final Paint n;
    public final RectF r;
    public CharSequence s;
    public float w;
    public final fm0 x;
    public final fm0 y;

    public sha(Context context, pha phaVar, String str) {
        super(context);
        float f;
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.n = new Paint(1);
        this.r = new RectF();
        s33 s33Var = s33.h;
        this.x = new fm0(0, this, s33Var, 380L, true);
        this.y = new fm0(1, this, s33Var, 250L, false);
        this.a = phaVar;
        this.b = true;
        this.c = (rha) wcd.j.a();
        this.d = (qha) wcd.k.a();
        this.s = str;
        this.e = context.getDrawable(2131231245).mutate();
        ih2 ih2Var = new ih2(gl.L(18.0f), gl.L(2.0f), -1);
        this.f = ih2Var;
        ih2Var.setCallback(this);
        textPaint.setTypeface(gl.o());
        textPaint.setTextSize(gl.L(15.0f));
        c();
        CharSequence charSequence = this.s;
        if (charSequence != null) {
            f = textPaint.measureText(charSequence, 0, charSequence.length());
        } else {
            f = 0.0f;
        }
        this.w = f;
        setContentDescription(str);
        setOnClickListener(new ik8(this, (byte) 28));
    }

    public final void a(boolean z, boolean z2) {
        boolean z3;
        y74 y74Var;
        fm0 fm0Var = this.x;
        if (fm0Var.f == z && (z2 || (y74Var = fm0Var.h) == null || !y74Var.h)) {
            return;
        }
        pha phaVar = this.a;
        if (z2 && phaVar.y()) {
            z3 = true;
        } else {
            z3 = false;
        }
        fm0Var.a(z, z3);
        p(0, fm0Var.e, 0.0f, null);
        phaVar.requestLayout();
    }

    public final void b(boolean z) {
        this.y.a(z, this.a.y());
        invalidate();
    }

    public final void c() {
        int i;
        pha phaVar = this.a;
        wjb wjbVar = phaVar.a;
        this.E = bkb.v0(bkb.Ei, wjbVar);
        this.F = bm2.f(0.5f, bkb.v0(bkb.Z6, wjbVar), this.E);
        int v0 = bkb.v0(bkb.Ii, wjbVar);
        this.G = v0;
        int i2 = phaVar.g0;
        rha rhaVar = this.c;
        rha rhaVar2 = rha.b;
        if (rhaVar != rhaVar2) {
            v0 = i2;
        }
        this.e.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        this.f.b(v0);
        this.h.setColor(v0);
        if (rhaVar == rhaVar2) {
            i = bkb.p1(0.2f, this.G);
        } else {
            i = phaVar.i0;
        }
        setBackground(bkb.Y(i, gl.L(23.0f), gl.L(23.0f)));
        invalidate();
    }

    public int getButtonId() {
        return this.b ? 1 : 0;
    }

    public int getButtonWidth() {
        if (this.d != qha.a && !TextUtils.isEmpty(this.s)) {
            return ls6.e(32.0f, (int) Math.ceil(this.w), gl.L(46.0f));
        }
        return gl.L(46.0f);
    }

    public qha getShape() {
        return this.d;
    }

    public rha getStyle() {
        return this.c;
    }

    public float getTargetVisibleFactor() {
        if (this.c != rha.b && !this.x.f) {
            return 0.0f;
        }
        return 1.0f;
    }

    public float getVisibleFactor() {
        if (this.c == rha.b) {
            return 1.0f;
        }
        return this.x.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float width = getWidth();
        float height = getHeight();
        if (this.c == rha.b) {
            int f2 = bm2.f(this.x.e, this.F, this.E);
            Paint paint = this.n;
            paint.setColor(f2);
            RectF rectF = this.r;
            rectF.set(0.0f, 0.0f, width, height);
            float f3 = height / 2.0f;
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        float f4 = this.y.e;
        if (f4 < 1.0f) {
            float R1 = gl.R1(1.0f, 0.6f, f4);
            canvas.save();
            canvas.scale(R1, R1, width / 2.0f, height / 2.0f);
            float f5 = 1.0f - f4;
            int i = (int) (f5 * 255.0f);
            if (this.d != qha.a && !TextUtils.isEmpty(this.s)) {
                TextPaint textPaint = this.h;
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) (alpha * f5));
                float descent = ((height - textPaint.descent()) - textPaint.ascent()) / 2.0f;
                CharSequence charSequence = this.s;
                f = 0.0f;
                canvas.drawText(charSequence, 0, charSequence.length(), (width - this.w) / 2.0f, descent, textPaint);
                textPaint.setAlpha(alpha);
            } else {
                f = 0.0f;
                Drawable drawable = this.e;
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                drawable.setBounds((int) ((width - intrinsicWidth) / 2.0f), (int) ((height - intrinsicHeight) / 2.0f), (int) ((intrinsicWidth + width) / 2.0f), (int) ((intrinsicHeight + height) / 2.0f));
                drawable.setAlpha(i);
                drawable.draw(canvas);
            }
            canvas.restore();
        } else {
            f = 0.0f;
        }
        if (f4 > f) {
            float R12 = gl.R1(0.6f, 1.0f, f4);
            canvas.save();
            canvas.scale(R12, R12, width / 2.0f, height / 2.0f);
            ih2 ih2Var = this.f;
            ih2Var.setBounds(0, 0, (int) width, (int) height);
            ih2Var.setAlpha((int) (f4 * 255.0f));
            ih2Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(getButtonWidth(), gl.L(46.0f));
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 0) {
            this.a.k();
        }
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        float f;
        if (TextUtils.equals(this.s, charSequence)) {
            return;
        }
        this.s = charSequence;
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.s;
        if (charSequence2 != null) {
            f = this.h.measureText(charSequence2, 0, charSequence2.length());
        } else {
            f = 0.0f;
        }
        this.w = f;
        requestLayout();
        this.a.requestLayout();
    }

    @Override
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        this.a.invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void F(float f, int i) {
    }
}
