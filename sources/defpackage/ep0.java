package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
public final class ep0 extends View implements snb {
    public final hf0 E;
    public boolean F;
    public int G;
    public b29 H;
    public int I;
    public int J;
    public final RectF a;
    public final Paint b;
    public final TextPaint c;
    public final bp0 d;
    public final b29 e;
    public boolean f;
    public float h;
    public String n;
    public StaticLayout r;
    public float s;
    public boolean w;
    public boolean x;
    public boolean y;

    public ep0(Context context) {
        super(context);
        this.a = new RectF();
        this.b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        bp0 bp0Var = new bp0(this);
        this.d = bp0Var;
        b29 b29Var = new b29(2131623945, hl.L(20.0f), hl.L(20.0f));
        this.e = b29Var;
        this.n = ob6.M0(2131752872, null);
        this.F = true;
        updateColors();
        bp0Var.n = true;
        bp0Var.h = false;
        bp0Var.a(false, 0.0f);
        bp0Var.setCallback(this);
        textPaint.setTypeface(hl.o());
        bp0Var.a.setStrokeCap(Paint.Cap.ROUND);
        bp0Var.l = true;
        int L = hl.L(16.0f);
        int w0 = aob.w0(null, aob.Hi, false);
        this.G = w0;
        hf0 i0 = aob.i0(L, L, L, L, 0, w0, w0);
        this.E = i0;
        i0.setCallback(this);
        b29Var.setCallback(this);
        b29Var.M(this);
        setContentDescription(ob6.M0(2131754913, "AccDescrBotMenu"));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Uf));
        hashSet.add(Integer.valueOf(aob.Wf));
        hashSet.add(Integer.valueOf(aob.Hi));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        if (this.r != null) {
            boolean z2 = this.f;
            float f = this.h;
            if (z2) {
                if (f != 1.0f) {
                    float f2 = f + 0.10666667f;
                    this.h = f2;
                    if (f2 > 1.0f) {
                        this.h = 1.0f;
                    } else {
                        invalidate();
                    }
                    z = true;
                }
                z = false;
            } else {
                if (f != 0.0f) {
                    float f3 = f - 0.10666667f;
                    this.h = f3;
                    if (f3 < 0.0f) {
                        this.h = 0.0f;
                    } else {
                        invalidate();
                    }
                    z = true;
                }
                z = false;
            }
            float interpolation = k43.f.getInterpolation(this.h);
            if (z && interpolation > 0.0f) {
                this.c.setAlpha((int) (255.0f * interpolation));
            }
            if (this.F) {
                this.a.set(0.0f, 0.0f, uh9.v(this.s, hl.L(4.0f), interpolation, hl.L(40.0f)), getMeasuredHeight());
                canvas.drawRoundRect(this.a, hl.L(16.0f), hl.L(16.0f), this.b);
                int w0 = aob.w0(null, aob.Hi, false);
                if (w0 != this.G) {
                    hf0 hf0Var = this.E;
                    this.G = w0;
                    aob.F1(hf0Var, w0, true);
                }
                hf0 hf0Var2 = this.E;
                RectF rectF = this.a;
                hf0Var2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.E.draw(canvas);
            }
            if (this.x) {
                canvas.save();
                canvas.translate(hl.L(9.5f), hl.L(6.0f));
                b29 b29Var = this.e;
                b29Var.setBounds(0, 0, b29Var.b, b29Var.c);
                b29Var.draw(canvas);
                canvas.restore();
                if (b29Var.l0) {
                    invalidate();
                }
            } else {
                canvas.save();
                canvas.translate(hl.L(8.0f), hl.L(4.0f));
                this.d.draw(canvas);
                canvas.restore();
            }
            if (interpolation > 0.0f) {
                canvas.save();
                canvas.translate(hl.L(34.0f), (getMeasuredHeight() - this.r.getHeight()) / 2.0f);
                this.r.draw(canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.E.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.E.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int size = (View.MeasureSpec.getSize(i2) + View.MeasureSpec.getSize(i)) << 16;
        if (this.J != size || this.r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.c;
            textPaint.setTextSize(hl.L(15.0f));
            this.J = size;
            CharSequence m = pv3.m(this.n, textPaint.getFontMetricsInt(), false, null, 0);
            int i3 = (int) (hl.q.x * 0.6f);
            StaticLayout c = o0b.c(m, textPaint, i3, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i3, 1, true);
            this.r = c;
            if (c.getLineCount() > 0) {
                f = this.r.getLineWidth(0);
            } else {
                f = 0.0f;
            }
            this.s = f;
        }
        int L = hl.L(40.0f);
        if (this.f) {
            L = uh9.w(4.0f, (int) this.s, L);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), 1073741824));
    }

    public void setDrawBackgroundDrawable(boolean z) {
        this.F = z;
        invalidate();
    }

    public void setOpened(boolean z) {
        float f;
        if (this.w != z) {
            this.w = z;
        }
        int i = 1;
        if (this.x) {
            if (this.y != z) {
                b29 b29Var = this.e;
                b29Var.stop();
                b29Var.h = true;
                if (z) {
                    i = b29Var.e[0];
                }
                b29Var.K(i);
                b29Var.start();
                this.y = z;
                return;
            }
            return;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.d.a(true, f);
    }

    public void setWebView(boolean z) {
        this.x = z;
        invalidate();
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.c;
        try {
            this.b.setColor(aob.w0(null, aob.Uf, false));
            int w0 = aob.w0(null, aob.Wf, false);
            bp0 bp0Var = this.d;
            bp0Var.k = w0;
            bp0Var.j = w0;
            b29 b29Var = this.e;
            if (b29Var != null && (b29Var != this.H || w0 != this.I)) {
                this.H = b29Var;
                this.I = w0;
                b29Var.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
            }
            int alpha = textPaint.getAlpha();
            textPaint.setColor(w0);
            if (alpha != 255) {
                textPaint.setAlpha(alpha);
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.E != drawable) {
            return false;
        }
        return true;
    }
}
