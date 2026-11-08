package hi;

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
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.zg0;
public final class y extends View implements a6 {
    public final org.telegram.ui.Cells.y D;
    public boolean E;
    public int F;
    public zg0 G;
    public int H;
    public int I;
    public final RectF f15036a;
    public final Paint f15037b;
    public final TextPaint f15038c;
    public final v d;
    public final zg0 f15039e;
    public boolean f15040f;
    public float h;
    public String f15041n;
    public StaticLayout f15042r;
    public float f15043s;
    public boolean f15044w;
    public boolean f15045x;
    public boolean f15046y;

    public y(Context context) {
        super(context);
        this.f15036a = new RectF();
        this.f15037b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f15038c = textPaint;
        v vVar = new v(this);
        this.d = vVar;
        zg0 zg0Var = new zg0(2131623945, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        this.f15039e = zg0Var;
        this.f15041n = id.M0(2131752891, null);
        this.E = true;
        updateColors();
        vVar.f28476n = true;
        vVar.h = false;
        vVar.a(false, 0.0f);
        vVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        vVar.f28465a.setStrokeCap(Paint.Cap.ROUND);
        vVar.f28474l = true;
        int L = org.telegram.messenger.g0.L(16.0f);
        int x02 = k6.x0(null, k6.Ei, false);
        this.F = x02;
        org.telegram.ui.Cells.y k02 = k6.k0(L, L, L, L, 0, x02, x02);
        this.D = k02;
        k02.setCallback(this);
        zg0Var.setCallback(this);
        zg0Var.R(this);
        setContentDescription(id.M0(2131754917, "AccDescrBotMenu"));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Rf));
        hashSet.add(Integer.valueOf(k6.Tf));
        hashSet.add(Integer.valueOf(k6.Ei));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: hi.y.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.D.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.D.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int size = (View.MeasureSpec.getSize(i10) + View.MeasureSpec.getSize(i7)) << 16;
        if (this.I != size || this.f15042r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f15038c;
            textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.I = size;
            CharSequence m10 = i6.m(this.f15041n, textPaint.getFontMetricsInt(), false, null, 0);
            int i11 = (int) (org.telegram.messenger.g0.f22563q.x * 0.6f);
            StaticLayout c10 = mu0.c(m10, textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i11, 1, true);
            this.f15042r = c10;
            if (c10.getLineCount() > 0) {
                f10 = this.f15042r.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f15043s = f10;
        }
        org.telegram.messenger.g0.L(4.0f);
        int L = org.telegram.messenger.g0.L(40.0f);
        if (this.f15040f) {
            L = k5.C(4.0f, (int) this.f15043s, L);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
    }

    public void setDrawBackgroundDrawable(boolean z9) {
        this.E = z9;
        invalidate();
    }

    public void setOpened(boolean z9) {
        float f10;
        if (this.f15044w != z9) {
            this.f15044w = z9;
        }
        int i7 = 1;
        if (this.f15045x) {
            if (this.f15046y != z9) {
                zg0 zg0Var = this.f15039e;
                zg0Var.stop();
                zg0Var.h = true;
                if (z9) {
                    i7 = zg0Var.f40995e[0];
                }
                zg0Var.P(i7);
                zg0Var.start();
                this.f15046y = z9;
                return;
            }
            return;
        }
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d.a(true, f10);
    }

    public void setWebView(boolean z9) {
        this.f15045x = z9;
        invalidate();
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.f15038c;
        try {
            this.f15037b.setColor(k6.x0(null, k6.Rf, false));
            int x02 = k6.x0(null, k6.Tf, false);
            v vVar = this.d;
            vVar.f28473k = x02;
            vVar.f28472j = x02;
            zg0 zg0Var = this.f15039e;
            if (zg0Var != null) {
                if (zg0Var == this.G) {
                    if (x02 != this.H) {
                    }
                }
                this.G = zg0Var;
                this.H = x02;
                zg0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
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
        if (!super.verifyDrawable(drawable) && this.D != drawable) {
            return false;
        }
        return true;
    }
}
