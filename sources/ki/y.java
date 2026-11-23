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
import org.telegram.messenger.j6;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.zu0;
public final class y extends View implements b6 {
    public final org.telegram.ui.Cells.y E;
    public boolean F;
    public int G;
    public oh0 H;
    public int I;
    public int J;
    public final RectF f19058a;
    public final Paint f19059b;
    public final TextPaint f19060c;
    public final v d;
    public final oh0 f19061e;
    public boolean f19062f;
    public float h;
    public String f19063n;
    public StaticLayout f19064r;
    public float f19065s;
    public boolean f19066w;
    public boolean f19067x;
    public boolean f19068y;

    public y(Context context) {
        super(context);
        this.f19058a = new RectF();
        this.f19059b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f19060c = textPaint;
        v vVar = new v(this);
        this.d = vVar;
        oh0 oh0Var = new oh0(2131623945, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        this.f19061e = oh0Var;
        this.f19063n = hd.N0(2131752879, null);
        this.F = true;
        updateColors();
        vVar.f29966n = true;
        vVar.h = false;
        vVar.a(false, 0.0f);
        vVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        vVar.f29955a.setStrokeCap(Paint.Cap.ROUND);
        vVar.f29964l = true;
        int L = org.telegram.messenger.g0.L(16.0f);
        int x02 = m6.x0(null, m6.Hi, false);
        this.G = x02;
        org.telegram.ui.Cells.y k02 = m6.k0(L, L, L, L, 0, x02, x02);
        this.E = k02;
        k02.setCallback(this);
        oh0Var.setCallback(this);
        oh0Var.R(this);
        setContentDescription(hd.N0(2131754917, "AccDescrBotMenu"));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.Uf));
        hashSet.add(Integer.valueOf(m6.Wf));
        hashSet.add(Integer.valueOf(m6.Hi));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ki.y.dispatchDraw(android.graphics.Canvas):void");
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
        if (this.J != size || this.f19064r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f19060c;
            textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.J = size;
            CharSequence m10 = j6.m(this.f19063n, textPaint.getFontMetricsInt(), false, null, 0);
            int i11 = (int) (org.telegram.messenger.g0.f24010q.x * 0.6f);
            StaticLayout c10 = zu0.c(m10, textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i11, 1, true);
            this.f19064r = c10;
            if (c10.getLineCount() > 0) {
                f10 = this.f19064r.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f19065s = f10;
        }
        org.telegram.messenger.g0.L(4.0f);
        int L = org.telegram.messenger.g0.L(40.0f);
        if (this.f19062f) {
            L = org.telegram.messenger.f3.C(4.0f, (int) this.f19065s, L);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
    }

    public void setDrawBackgroundDrawable(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setOpened(boolean z10) {
        float f10;
        if (this.f19066w != z10) {
            this.f19066w = z10;
        }
        int i7 = 1;
        if (this.f19067x) {
            if (this.f19068y != z10) {
                oh0 oh0Var = this.f19061e;
                oh0Var.stop();
                oh0Var.h = true;
                if (z10) {
                    i7 = oh0Var.f38179e[0];
                }
                oh0Var.P(i7);
                oh0Var.start();
                this.f19068y = z10;
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
        this.f19067x = z10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.f19060c;
        try {
            this.f19059b.setColor(m6.x0(null, m6.Uf, false));
            int x02 = m6.x0(null, m6.Wf, false);
            v vVar = this.d;
            vVar.f29963k = x02;
            vVar.f29962j = x02;
            oh0 oh0Var = this.f19061e;
            if (oh0Var != null) {
                if (oh0Var == this.H) {
                    if (x02 != this.I) {
                    }
                }
                this.H = oh0Var;
                this.I = x02;
                oh0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
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
