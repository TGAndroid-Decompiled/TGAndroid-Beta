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
import org.telegram.messenger.gd;
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
    public final RectF f19089a;
    public final Paint f19090b;
    public final TextPaint f19091c;
    public final v d;
    public final oh0 f19092e;
    public boolean f19093f;
    public float h;
    public String f19094n;
    public StaticLayout f19095r;
    public float f19096s;
    public boolean f19097w;
    public boolean f19098x;
    public boolean f19099y;

    public y(Context context) {
        super(context);
        this.f19089a = new RectF();
        this.f19090b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f19091c = textPaint;
        v vVar = new v(this);
        this.d = vVar;
        oh0 oh0Var = new oh0(2131623945, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        this.f19092e = oh0Var;
        this.f19094n = gd.N0(2131752879, null);
        this.F = true;
        updateColors();
        vVar.f29997n = true;
        vVar.h = false;
        vVar.a(false, 0.0f);
        vVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        vVar.f29986a.setStrokeCap(Paint.Cap.ROUND);
        vVar.f29995l = true;
        int L = org.telegram.messenger.g0.L(16.0f);
        int x02 = m6.x0(null, m6.Hi, false);
        this.G = x02;
        org.telegram.ui.Cells.y k02 = m6.k0(L, L, L, L, 0, x02, x02);
        this.E = k02;
        k02.setCallback(this);
        oh0Var.setCallback(this);
        oh0Var.R(this);
        setContentDescription(gd.N0(2131754917, "AccDescrBotMenu"));
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
        if (this.J != size || this.f19095r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f19091c;
            textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.J = size;
            CharSequence m10 = j6.m(this.f19094n, textPaint.getFontMetricsInt(), false, null, 0);
            int i11 = (int) (org.telegram.messenger.g0.f24146q.x * 0.6f);
            StaticLayout c10 = zu0.c(m10, textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i11, 1, true);
            this.f19095r = c10;
            if (c10.getLineCount() > 0) {
                f10 = this.f19095r.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f19096s = f10;
        }
        org.telegram.messenger.g0.L(4.0f);
        int L = org.telegram.messenger.g0.L(40.0f);
        if (this.f19093f) {
            L = org.telegram.messenger.f3.C(4.0f, (int) this.f19096s, L);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
    }

    public void setDrawBackgroundDrawable(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setOpened(boolean z10) {
        float f10;
        if (this.f19097w != z10) {
            this.f19097w = z10;
        }
        int i7 = 1;
        if (this.f19098x) {
            if (this.f19099y != z10) {
                oh0 oh0Var = this.f19092e;
                oh0Var.stop();
                oh0Var.h = true;
                if (z10) {
                    i7 = oh0Var.f38217e[0];
                }
                oh0Var.P(i7);
                oh0Var.start();
                this.f19099y = z10;
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
        this.f19098x = z10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.f19091c;
        try {
            this.f19090b.setColor(m6.x0(null, m6.Uf, false));
            int x02 = m6.x0(null, m6.Wf, false);
            v vVar = this.d;
            vVar.f29994k = x02;
            vVar.f29993j = x02;
            oh0 oh0Var = this.f19092e;
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
