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
public final class eq0 extends View implements vlb {
    public final fg0 E;
    public boolean F;
    public int G;
    public p09 H;
    public int I;
    public int J;
    public final RectF a;
    public final Paint b;
    public final TextPaint c;
    public final bq0 d;
    public final p09 e;
    public boolean f;
    public float h;
    public String n;
    public StaticLayout r;
    public float s;
    public boolean w;
    public boolean x;
    public boolean y;

    public eq0(Context context) {
        super(context);
        this.a = new RectF();
        this.b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        bq0 bq0Var = new bq0(this);
        this.d = bq0Var;
        p09 p09Var = new p09(2131623945, gm.L(20.0f), gm.L(20.0f));
        this.e = p09Var;
        this.n = jb6.M0(2131752844, null);
        this.F = true;
        updateColors();
        bq0Var.n = true;
        bq0Var.h = false;
        bq0Var.a(false, 0.0f);
        bq0Var.setCallback(this);
        textPaint.setTypeface(gm.o());
        bq0Var.a.setStrokeCap(Paint.Cap.ROUND);
        bq0Var.l = true;
        int L = gm.L(16.0f);
        int w0 = cmb.w0(null, cmb.Gi, false);
        this.G = w0;
        fg0 i0 = cmb.i0(L, L, L, L, 0, w0, w0);
        this.E = i0;
        i0.setCallback(this);
        p09Var.setCallback(this);
        p09Var.M(this);
        setContentDescription(jb6.M0(2131754917, "AccDescrBotMenu"));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Tf));
        hashSet.add(Integer.valueOf(cmb.Vf));
        hashSet.add(Integer.valueOf(cmb.Gi));
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
            float interpolation = d53.f.getInterpolation(this.h);
            if (z && interpolation > 0.0f) {
                this.c.setAlpha((int) (255.0f * interpolation));
            }
            if (this.F) {
                this.a.set(0.0f, 0.0f, hg9.u(this.s, gm.L(4.0f), interpolation, gm.L(40.0f)), getMeasuredHeight());
                canvas.drawRoundRect(this.a, gm.L(16.0f), gm.L(16.0f), this.b);
                int w0 = cmb.w0(null, cmb.Gi, false);
                if (w0 != this.G) {
                    fg0 fg0Var = this.E;
                    this.G = w0;
                    cmb.F1(fg0Var, w0, true);
                }
                fg0 fg0Var2 = this.E;
                RectF rectF = this.a;
                fg0Var2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.E.draw(canvas);
            }
            if (this.x) {
                canvas.save();
                canvas.translate(gm.L(9.5f), gm.L(6.0f));
                p09 p09Var = this.e;
                p09Var.setBounds(0, 0, p09Var.b, p09Var.c);
                p09Var.draw(canvas);
                canvas.restore();
                if (p09Var.l0) {
                    invalidate();
                }
            } else {
                canvas.save();
                canvas.translate(gm.L(8.0f), gm.L(4.0f));
                this.d.draw(canvas);
                canvas.restore();
            }
            if (interpolation > 0.0f) {
                canvas.save();
                canvas.translate(gm.L(34.0f), (getMeasuredHeight() - this.r.getHeight()) / 2.0f);
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
            textPaint.setTextSize(gm.L(15.0f));
            this.J = size;
            CharSequence m = gw3.m(this.n, textPaint.getFontMetricsInt(), false, null, 0);
            int i3 = (int) (gm.q.x * 0.6f);
            StaticLayout c = oya.c(m, textPaint, i3, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i3, 1, true);
            this.r = c;
            if (c.getLineCount() > 0) {
                f = this.r.getLineWidth(0);
            } else {
                f = 0.0f;
            }
            this.s = f;
        }
        int L = gm.L(40.0f);
        if (this.f) {
            L = hg9.v(4.0f, (int) this.s, L);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), 1073741824));
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
                p09 p09Var = this.e;
                p09Var.stop();
                p09Var.h = true;
                if (z) {
                    i = p09Var.e[0];
                }
                p09Var.K(i);
                p09Var.start();
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
            this.b.setColor(cmb.w0(null, cmb.Tf, false));
            int w0 = cmb.w0(null, cmb.Vf, false);
            bq0 bq0Var = this.d;
            bq0Var.k = w0;
            bq0Var.j = w0;
            p09 p09Var = this.e;
            if (p09Var != null && (p09Var != this.H || w0 != this.I)) {
                this.H = p09Var;
                this.I = w0;
                p09Var.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
            }
            int alpha = textPaint.getAlpha();
            textPaint.setColor(w0);
            if (alpha != 255) {
                textPaint.setAlpha(alpha);
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
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
