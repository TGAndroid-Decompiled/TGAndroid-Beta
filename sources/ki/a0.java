package ki;

import android.content.Context;
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
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ou0;
public final class a0 extends View implements z5 {
    public final org.telegram.ui.Cells.y E;
    public boolean F;
    public int G;
    public ch0 H;
    public int I;
    public int J;
    public final RectF f18172a;
    public final Paint f18173b;
    public final TextPaint f18174c;
    public final x d;
    public final ch0 f18175e;
    public boolean f18176f;
    public float h;
    public String f18177n;
    public StaticLayout f18178r;
    public float f18179s;
    public boolean f18180w;
    public boolean f18181x;
    public boolean f18182y;

    public a0(Context context) {
        super(context);
        this.f18172a = new RectF();
        this.f18173b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f18174c = textPaint;
        x xVar = new x(this);
        this.d = xVar;
        ch0 ch0Var = new ch0(2131623945, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        this.f18175e = ch0Var;
        this.f18177n = hd.M0(2131752891, null);
        this.F = true;
        updateColors();
        xVar.f29487n = true;
        xVar.h = false;
        xVar.a(false, 0.0f);
        xVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        xVar.f29476a.setStrokeCap(Paint.Cap.ROUND);
        xVar.f29485l = true;
        int L = org.telegram.messenger.g0.L(16.0f);
        int x02 = j6.x0(null, j6.Hi, false);
        this.G = x02;
        org.telegram.ui.Cells.y k02 = j6.k0(L, L, L, L, 0, x02, x02);
        this.E = k02;
        k02.setCallback(this);
        ch0Var.setCallback(this);
        ch0Var.R(this);
        setContentDescription(hd.M0(2131754917, "AccDescrBotMenu"));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.Uf));
        hashSet.add(Integer.valueOf(j6.Wf));
        hashSet.add(Integer.valueOf(j6.Hi));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ki.a0.dispatchDraw(android.graphics.Canvas):void");
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
    public final void onMeasure(int i7, int i10) {
        float f10;
        int size = (View.MeasureSpec.getSize(i10) + View.MeasureSpec.getSize(i7)) << 16;
        if (this.J != size || this.f18178r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f18174c;
            textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.J = size;
            CharSequence m10 = org.telegram.messenger.j6.m(this.f18177n, textPaint.getFontMetricsInt(), false, null, 0);
            int i11 = (int) (org.telegram.messenger.g0.f23609q.x * 0.6f);
            StaticLayout c10 = ou0.c(m10, textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i11, 1, true);
            this.f18178r = c10;
            if (c10.getLineCount() > 0) {
                f10 = this.f18178r.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f18179s = f10;
        }
        org.telegram.messenger.g0.L(4.0f);
        int L = org.telegram.messenger.g0.L(40.0f);
        if (this.f18176f) {
            L = k5.C(4.0f, (int) this.f18179s, L);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
    }

    public void setDrawBackgroundDrawable(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setOpened(boolean z10) {
        float f10;
        if (this.f18180w != z10) {
            this.f18180w = z10;
        }
        int i7 = 1;
        if (this.f18181x) {
            if (this.f18182y != z10) {
                ch0 ch0Var = this.f18175e;
                ch0Var.stop();
                ch0Var.h = true;
                if (z10) {
                    i7 = ch0Var.f33577e[0];
                }
                ch0Var.P(i7);
                ch0Var.start();
                this.f18182y = z10;
                return;
            }
            return;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d.a(true, f10);
    }

    public void setWebView(boolean z10) {
        this.f18181x = z10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.f18174c;
        try {
            this.f18173b.setColor(j6.x0(null, j6.Uf, false));
            int x02 = j6.x0(null, j6.Wf, false);
            x xVar = this.d;
            xVar.f29484k = x02;
            xVar.f29483j = x02;
            ch0 ch0Var = this.f18175e;
            if (ch0Var != null) {
                if (ch0Var == this.H) {
                    if (x02 != this.I) {
                    }
                }
                this.H = ch0Var;
                this.I = x02;
                ch0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            int alpha = textPaint.getAlpha();
            textPaint.setColor(x02);
            if (alpha != 255) {
                textPaint.setAlpha(alpha);
            }
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
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
