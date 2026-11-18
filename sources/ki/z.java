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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.wu0;
public final class z extends View implements c6 {
    public final org.telegram.ui.Cells.y E;
    public boolean F;
    public int G;
    public mh0 H;
    public int I;
    public int J;
    public final RectF f19082a;
    public final Paint f19083b;
    public final TextPaint f19084c;
    public final w d;
    public final mh0 f19085e;
    public boolean f19086f;
    public float h;
    public String f19087n;
    public StaticLayout f19088r;
    public float f19089s;
    public boolean f19090w;
    public boolean f19091x;
    public boolean f19092y;

    public z(Context context) {
        super(context);
        this.f19082a = new RectF();
        this.f19083b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f19084c = textPaint;
        w wVar = new w(this);
        this.d = wVar;
        mh0 mh0Var = new mh0(2131623945, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
        this.f19085e = mh0Var;
        this.f19087n = gd.M0(2131752880, null);
        this.F = true;
        updateColors();
        wVar.f30016n = true;
        wVar.h = false;
        wVar.a(false, 0.0f);
        wVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        wVar.f30005a.setStrokeCap(Paint.Cap.ROUND);
        wVar.f30014l = true;
        int L = org.telegram.messenger.g0.L(16.0f);
        int x02 = n6.x0(null, n6.Hi, false);
        this.G = x02;
        org.telegram.ui.Cells.y k02 = n6.k0(L, L, L, L, 0, x02, x02);
        this.E = k02;
        k02.setCallback(this);
        mh0Var.setCallback(this);
        mh0Var.R(this);
        setContentDescription(gd.M0(2131754917, "AccDescrBotMenu"));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.Uf));
        hashSet.add(Integer.valueOf(n6.Wf));
        hashSet.add(Integer.valueOf(n6.Hi));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ki.z.dispatchDraw(android.graphics.Canvas):void");
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
        if (this.J != size || this.f19088r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f19084c;
            textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.J = size;
            CharSequence m10 = j6.m(this.f19087n, textPaint.getFontMetricsInt(), false, null, 0);
            int i11 = (int) (org.telegram.messenger.g0.f24121q.x * 0.6f);
            StaticLayout c10 = wu0.c(m10, textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i11, 1, true);
            this.f19088r = c10;
            if (c10.getLineCount() > 0) {
                f10 = this.f19088r.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f19089s = f10;
        }
        org.telegram.messenger.g0.L(4.0f);
        int L = org.telegram.messenger.g0.L(40.0f);
        if (this.f19086f) {
            L = org.telegram.messenger.f3.C(4.0f, (int) this.f19089s, L);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
    }

    public void setDrawBackgroundDrawable(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setOpened(boolean z10) {
        float f10;
        if (this.f19090w != z10) {
            this.f19090w = z10;
        }
        int i7 = 1;
        if (this.f19091x) {
            if (this.f19092y != z10) {
                mh0 mh0Var = this.f19085e;
                mh0Var.stop();
                mh0Var.h = true;
                if (z10) {
                    i7 = mh0Var.f37486e[0];
                }
                mh0Var.P(i7);
                mh0Var.start();
                this.f19092y = z10;
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
        this.f19091x = z10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.f19084c;
        try {
            this.f19083b.setColor(n6.x0(null, n6.Uf, false));
            int x02 = n6.x0(null, n6.Wf, false);
            w wVar = this.d;
            wVar.f30013k = x02;
            wVar.f30012j = x02;
            mh0 mh0Var = this.f19085e;
            if (mh0Var != null) {
                if (mh0Var == this.H) {
                    if (x02 != this.I) {
                    }
                }
                this.H = mh0Var;
                this.I = x02;
                mh0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
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
