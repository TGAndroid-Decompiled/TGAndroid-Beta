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
public final class ep0 extends View implements tjb {
    public final ff0 E;
    public boolean F;
    public int G;
    public oy8 H;
    public int I;
    public int J;
    public final RectF a;
    public final Paint b;
    public final TextPaint c;
    public final bp0 d;
    public final oy8 e;
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
        oy8 oy8Var = new oy8(2131623945, gl.L(20.0f), gl.L(20.0f));
        this.e = oy8Var;
        this.n = k96.M0(2131752879, null);
        this.F = true;
        updateColors();
        bp0Var.n = true;
        bp0Var.h = false;
        bp0Var.a(false, 0.0f);
        bp0Var.setCallback(this);
        textPaint.setTypeface(gl.o());
        bp0Var.a.setStrokeCap(Paint.Cap.ROUND);
        bp0Var.l = true;
        int L = gl.L(16.0f);
        int w0 = bkb.w0(null, bkb.Gi, false);
        this.G = w0;
        ff0 i0 = bkb.i0(L, L, L, L, 0, w0, w0);
        this.E = i0;
        i0.setCallback(this);
        oy8Var.setCallback(this);
        oy8Var.M(this);
        setContentDescription(k96.M0(2131754917, "AccDescrBotMenu"));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Tf));
        hashSet.add(Integer.valueOf(bkb.Vf));
        hashSet.add(Integer.valueOf(bkb.Gi));
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
            float interpolation = s33.f.getInterpolation(this.h);
            if (z && interpolation > 0.0f) {
                this.c.setAlpha((int) (255.0f * interpolation));
            }
            if (this.F) {
                this.a.set(0.0f, 0.0f, de9.v(this.s, gl.L(4.0f), interpolation, gl.L(40.0f)), getMeasuredHeight());
                canvas.drawRoundRect(this.a, gl.L(16.0f), gl.L(16.0f), this.b);
                int w0 = bkb.w0(null, bkb.Gi, false);
                if (w0 != this.G) {
                    ff0 ff0Var = this.E;
                    this.G = w0;
                    bkb.F1(ff0Var, w0, true);
                }
                ff0 ff0Var2 = this.E;
                RectF rectF = this.a;
                ff0Var2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.E.draw(canvas);
            }
            if (this.x) {
                canvas.save();
                canvas.translate(gl.L(9.5f), gl.L(6.0f));
                oy8 oy8Var = this.e;
                oy8Var.setBounds(0, 0, oy8Var.b, oy8Var.c);
                oy8Var.draw(canvas);
                canvas.restore();
                if (oy8Var.l0) {
                    invalidate();
                }
            } else {
                canvas.save();
                canvas.translate(gl.L(8.0f), gl.L(4.0f));
                this.d.draw(canvas);
                canvas.restore();
            }
            if (interpolation > 0.0f) {
                canvas.save();
                canvas.translate(gl.L(34.0f), (getMeasuredHeight() - this.r.getHeight()) / 2.0f);
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
            textPaint.setTextSize(gl.L(15.0f));
            this.J = size;
            CharSequence m = vu3.m(this.n, textPaint.getFontMetricsInt(), false, null, 0);
            int i3 = (int) (gl.q.x * 0.6f);
            StaticLayout c = lwa.c(m, textPaint, i3, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i3, 1, true);
            this.r = c;
            if (c.getLineCount() > 0) {
                f = this.r.getLineWidth(0);
            } else {
                f = 0.0f;
            }
            this.s = f;
        }
        int L = gl.L(40.0f);
        if (this.f) {
            L = de9.w(4.0f, (int) this.s, L);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(32.0f), 1073741824));
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
                oy8 oy8Var = this.e;
                oy8Var.stop();
                oy8Var.h = true;
                if (z) {
                    i = oy8Var.e[0];
                }
                oy8Var.K(i);
                oy8Var.start();
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
            this.b.setColor(bkb.w0(null, bkb.Tf, false));
            int w0 = bkb.w0(null, bkb.Vf, false);
            bp0 bp0Var = this.d;
            bp0Var.k = w0;
            bp0Var.j = w0;
            oy8 oy8Var = this.e;
            if (oy8Var != null && (oy8Var != this.H || w0 != this.I)) {
                this.H = oy8Var;
                this.I = w0;
                oy8Var.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
            }
            int alpha = textPaint.getAlpha();
            textPaint.setColor(w0);
            if (alpha != 255) {
                textPaint.setAlpha(alpha);
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
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
