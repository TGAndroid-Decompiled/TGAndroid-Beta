package ii;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.i6;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.lu0;
public final class a0 extends View implements z5 {
    public final org.telegram.ui.Cells.y E;
    public boolean F;
    public int G;
    public ch0 H;
    public int I;
    public int J;
    public final RectF f14770a;
    public final Paint f14771b;
    public final TextPaint f14772c;
    public final x d;
    public final ch0 f14773e;
    public boolean f14774f;
    public float h;
    public String f14775n;
    public StaticLayout f14776r;
    public float f14777s;
    public boolean f14778w;
    public boolean f14779x;
    public boolean f14780y;

    public a0(Context context) {
        super(context);
        this.f14770a = new RectF();
        this.f14771b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f14772c = textPaint;
        x xVar = new x(this);
        this.d = xVar;
        ch0 ch0Var = new ch0(2131623945, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        this.f14773e = ch0Var;
        this.f14775n = bd.M0(2131752891, null);
        this.F = true;
        updateColors();
        xVar.f28512n = true;
        xVar.h = false;
        xVar.a(false, 0.0f);
        xVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        xVar.f28501a.setStrokeCap(Paint.Cap.ROUND);
        xVar.f28510l = true;
        int L = org.telegram.messenger.g0.L(16.0f);
        int x02 = k6.x0(null, k6.Ei, false);
        this.G = x02;
        org.telegram.ui.Cells.y k02 = k6.k0(L, L, L, L, 0, x02, x02);
        this.E = k02;
        k02.setCallback(this);
        ch0Var.setCallback(this);
        ch0Var.R(this);
        setContentDescription(bd.M0(2131754917, "AccDescrBotMenu"));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Rf));
        hashSet.add(Integer.valueOf(k6.Tf));
        hashSet.add(Integer.valueOf(k6.Ei));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ii.a0.dispatchDraw(android.graphics.Canvas):void");
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
    public final void onMeasure(int i3, int i10) {
        float f10;
        int size = (View.MeasureSpec.getSize(i10) + View.MeasureSpec.getSize(i3)) << 16;
        if (this.J != size || this.f14776r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f14772c;
            textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.J = size;
            CharSequence m10 = i6.m(this.f14775n, textPaint.getFontMetricsInt(), false, null, 0);
            int i11 = (int) (org.telegram.messenger.g0.f22608q.x * 0.6f);
            StaticLayout c2 = lu0.c(m10, textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i11, 1, true);
            this.f14776r = c2;
            if (c2.getLineCount() > 0) {
                f10 = this.f14776r.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f14777s = f10;
        }
        org.telegram.messenger.g0.L(4.0f);
        int L = org.telegram.messenger.g0.L(40.0f);
        if (this.f14774f) {
            L = k5.C(4.0f, (int) this.f14777s, L);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
    }

    public void setDrawBackgroundDrawable(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setOpened(boolean z10) {
        float f10;
        if (this.f14778w != z10) {
            this.f14778w = z10;
        }
        int i3 = 1;
        if (this.f14779x) {
            if (this.f14780y != z10) {
                ch0 ch0Var = this.f14773e;
                ch0Var.stop();
                ch0Var.h = true;
                if (z10) {
                    i3 = ch0Var.f32725e[0];
                }
                ch0Var.P(i3);
                ch0Var.start();
                this.f14780y = z10;
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
        this.f14779x = z10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.f14772c;
        try {
            this.f14771b.setColor(k6.x0(null, k6.Rf, false));
            int x02 = k6.x0(null, k6.Tf, false);
            x xVar = this.d;
            xVar.f28509k = x02;
            xVar.f28508j = x02;
            ch0 ch0Var = this.f14773e;
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
