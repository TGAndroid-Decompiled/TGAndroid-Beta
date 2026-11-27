package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public class y9c extends View {
    public final TextPaint E;
    public hf0 F;
    public ValueAnimator G;
    public float H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public String M;
    public int N;
    public int a;
    public String b;
    public int c;
    public final TextPaint d;
    public final Paint e;
    public final RectF f;
    public int h;
    public int n;
    public Drawable r;
    public StaticLayout s;
    public Drawable w;
    public StaticLayout x;
    public int y;

    public y9c(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new Paint(1);
        this.f = new RectF();
        TextPaint textPaint2 = new TextPaint(1);
        this.E = textPaint2;
        this.H = 1.0f;
        this.N = aob.sf;
        textPaint.setTextSize(hl.L(13.0f));
        textPaint.setTypeface(hl.o());
        uh9.p(textPaint2, hl.L(15.0f));
    }

    public final void a(String str, boolean z) {
        if (this.M != str) {
            this.M = str;
            this.I = z;
            this.x = this.s;
            this.w = this.r;
            Typeface o = hl.o();
            TextPaint textPaint = this.E;
            textPaint.setTypeface(o);
            this.y = (int) Math.ceil(Layout.getDesiredWidth(str, textPaint));
            this.r = null;
            this.s = new StaticLayout(str, textPaint, this.y, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            setContentDescription(str);
            invalidate();
            if (this.x == null && this.w == null) {
                return;
            }
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.H = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new pzb(this, (byte) 5));
            this.G.setDuration(150L);
            this.G.start();
        }
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        hf0 hf0Var = this.F;
        if (hf0Var != null) {
            hf0Var.setState(getDrawableState());
        }
    }

    public vnb getResourceProvider() {
        return null;
    }

    public float getTopOffset() {
        return 0.0f;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        hf0 hf0Var = this.F;
        if (hf0Var != null) {
            hf0Var.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        int i3;
        float f2;
        float f3;
        float f4;
        int i4;
        int i5;
        StaticLayout staticLayout = this.s;
        if (isEnabled()) {
            i = this.N;
        } else {
            i = aob.y6;
        }
        int v0 = aob.v0(i, getResourceProvider());
        int i6 = this.J;
        TextPaint textPaint = this.E;
        if (i6 != v0) {
            this.J = v0;
            textPaint.setColor(v0);
        }
        int v02 = aob.v0(aob.Je, getResourceProvider());
        int i7 = this.K;
        TextPaint textPaint2 = this.d;
        if (i7 != v02) {
            this.K = v02;
            textPaint2.setColor(v02);
        }
        int v03 = aob.v0(aob.kg, getResourceProvider());
        int i8 = this.L;
        Paint paint = this.e;
        if (i8 != v03) {
            this.L = v03;
            paint.setColor(v03);
        }
        if (getParent() != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
            if (this.n != aob.v0(this.N, getResourceProvider()) || this.F == null) {
                int L = hl.L(60.0f);
                int v04 = aob.v0(this.N, getResourceProvider());
                this.n = v04;
                hf0 h0 = aob.h0(L, 0, vm2.o(v04, 26));
                this.F = h0;
                h0.setCallback(this);
            }
            if (getLeft() + measuredWidth2 <= 0) {
                i5 = measuredWidth2 - hl.L(20.0f);
            } else {
                i5 = measuredWidth2;
            }
            int i9 = measuredWidth2 + measuredWidth;
            if (i9 > ((View) getParent()).getMeasuredWidth()) {
                i9 += hl.L(20.0f);
            }
            int i10 = measuredWidth / 2;
            this.F.setBounds(i5, (getMeasuredHeight() / 2) - i10, i9, (getMeasuredHeight() / 2) + i10);
            this.F.draw(canvas);
        }
        if (this.s != null) {
            canvas.save();
            if (this.H != 1.0f && this.x != null) {
                int alpha = textPaint.getAlpha();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.x.getWidth()) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.s.getHeight()) / 2));
                Drawable drawable = this.w;
                if (drawable != null) {
                    i3 = hl.L(3.0f) + (drawable.getIntrinsicWidth() / 2);
                } else {
                    i3 = 0;
                }
                float f5 = i3;
                float f6 = -1.0f;
                if (this.I) {
                    f2 = -1.0f;
                } else {
                    f2 = 1.0f;
                }
                canvas.translate(f5, f2 * hl.L(18.0f) * this.H);
                Drawable drawable2 = this.w;
                if (drawable2 != null) {
                    f = 6.0f;
                    f3 = 1.0f;
                    f4 = 3.0f;
                    drawable2.setBounds((-drawable2.getIntrinsicWidth()) - hl.L(6.0f), hl.L(1.0f) + ((this.s.getHeight() - this.w.getIntrinsicHeight()) / 2), -hl.L(6.0f), hl.L(1.0f) + ((this.w.getIntrinsicHeight() + this.s.getHeight()) / 2));
                    this.w.setAlpha((int) ((1.0f - this.H) * alpha));
                    this.w.draw(canvas);
                } else {
                    f = 6.0f;
                    f3 = 1.0f;
                    f4 = 3.0f;
                }
                float f7 = alpha;
                textPaint.setAlpha((int) ((f3 - this.H) * f7));
                this.x.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.y) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.s.getHeight()) / 2));
                Drawable drawable3 = this.r;
                if (drawable3 != null) {
                    i4 = hl.L(f4) + (drawable3.getIntrinsicWidth() / 2);
                } else {
                    i4 = 0;
                }
                float f8 = i4;
                if (this.I) {
                    f6 = f3;
                }
                canvas.translate(f8, (f3 - this.H) * f6 * hl.L(18.0f));
                Drawable drawable4 = this.r;
                if (drawable4 != null) {
                    drawable4.setBounds((-drawable4.getIntrinsicWidth()) - hl.L(f), hl.L(f3) + ((this.s.getHeight() - this.r.getIntrinsicHeight()) / 2), -hl.L(f), hl.L(f3) + ((this.r.getIntrinsicHeight() + this.s.getHeight()) / 2));
                    this.r.setAlpha((int) (this.H * f7));
                    this.r.draw(canvas);
                }
                textPaint.setAlpha((int) (f7 * this.H));
                this.s.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            } else {
                f = 6.0f;
                int measuredWidth3 = ((getMeasuredWidth() - this.y) / 2) - (this.h / 2);
                Drawable drawable5 = this.r;
                if (drawable5 != null) {
                    i2 = hl.L(3.0f) + (drawable5.getIntrinsicWidth() / 2);
                } else {
                    i2 = 0;
                }
                canvas.translate(measuredWidth3 + i2, getTopOffset() + ((getMeasuredHeight() - this.s.getHeight()) / 2));
                Drawable drawable6 = this.r;
                if (drawable6 != null) {
                    drawable6.setBounds((-drawable6.getIntrinsicWidth()) - hl.L(6.0f), hl.L(1.0f) + ((this.s.getHeight() - this.r.getIntrinsicHeight()) / 2), -hl.L(6.0f), hl.L(1.0f) + ((this.r.getIntrinsicHeight() + this.s.getHeight()) / 2));
                    this.r.setAlpha(255);
                    this.r.draw(canvas);
                }
                this.s.draw(canvas);
            }
            canvas.restore();
        } else {
            f = 6.0f;
        }
        if (this.b != null && staticLayout != null) {
            int ceil = (int) Math.ceil(staticLayout.getLineWidth(0));
            int L2 = hl.L(f) + ((((getMeasuredWidth() - ceil) / 2) + ceil) - (this.h / 2));
            float L3 = hl.L(10.0f) + (getMeasuredHeight() / 2);
            RectF rectF = this.f;
            rectF.set(L2, (getMeasuredHeight() / 2) - hl.L(10.0f), L2 + this.h, L3);
            canvas.drawRoundRect(rectF, hl.L(10.0f), hl.L(10.0f), paint);
            canvas.drawText(this.b, rectF.centerX() - (this.c / 2.0f), rectF.top + hl.L(14.5f), textPaint2);
        }
    }

    public void setCounter(int i) {
        if (this.a != i) {
            this.a = i;
            if (i == 0) {
                this.b = null;
                this.h = 0;
            } else {
                String o0 = hl.o0(i, 0);
                this.b = o0;
                this.c = (int) Math.ceil(this.d.measureText(o0));
                int max = Math.max(hl.L(20.0f), hl.L(12.0f) + this.c);
                if (this.h != max) {
                    this.h = max;
                }
            }
            invalidate();
        }
    }

    public void setText(CharSequence charSequence) {
        Typeface o = hl.o();
        TextPaint textPaint = this.E;
        textPaint.setTypeface(o);
        this.y = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        this.r = null;
        this.s = new StaticLayout(charSequence, textPaint, this.y, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    public void setTextColorKey(int i) {
        this.N = i;
        invalidate();
    }

    public void setTextInfo(CharSequence charSequence) {
        TextPaint textPaint = this.E;
        textPaint.setTypeface(null);
        this.y = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        this.r = null;
        this.s = new StaticLayout(charSequence, textPaint, this.y + 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        hf0 hf0Var = this.F;
        if (hf0Var != null) {
            if (hf0Var != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
