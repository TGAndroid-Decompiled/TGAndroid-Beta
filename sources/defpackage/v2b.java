package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
public abstract class v2b extends c51 {
    public final xl0 m0;
    public final RectF n0;
    public byte o0;
    public final k3b p0;
    public final vnb q0;
    public int r0;
    public boolean s0;

    public v2b(k3b k3bVar, ContextThemeWrapper contextThemeWrapper, vnb vnbVar, tl0 tl0Var) {
        super(vnbVar, contextThemeWrapper, false);
        this.n0 = new RectF();
        this.r0 = 8;
        this.q0 = vnbVar;
        this.p0 = k3bVar;
        this.m0 = new xl0(tl0Var, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.x(hl.o());
        removeView(this.r);
        setForeground(aob.Y(aob.p1(0.08f, -1), 8, 8));
        setPadding(hl.L(24.0f), 0, hl.L(24.0f), 0);
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z = this.i0;
        RectF rectF = this.n0;
        if (z) {
            float c = this.d.c() + getPaddingLeft() + getPaddingRight();
            rectF.set((getMeasuredWidth() - c) / 2.0f, 0.0f, (getMeasuredWidth() + c) / 2.0f, getMeasuredHeight());
        } else {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.s0) {
            i = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.c()), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override
    public void setAlpha(float f) {
        h3b[] h3bVarArr;
        k3b k3bVar = this.p0;
        super.setAlpha((!k3bVar.E || (h3bVarArr = k3bVar.I) == null || h3bVarArr.length <= 0) ? 0.0f : 0.0f);
    }

    public void setCancelState(boolean z) {
        this.o0 = (byte) 2;
        i(ob6.M0(2131752570, null), z, true);
    }

    public void setCutOutState(boolean z) {
        this.o0 = (byte) 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wm2 wm2Var = new wm2(2131231752, 0);
        wm2Var.c(hl.L(22.0f));
        wm2Var.r = hl.L(1.0f);
        wm2Var.s = hl.L(2.0f);
        wm2Var.H = 1.2f;
        spannableStringBuilder.setSpan(wm2Var, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ob6.M0(2131745408, null));
        i(spannableStringBuilder, z, true);
    }

    public void setEraseState(boolean z) {
        this.o0 = (byte) 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wm2 wm2Var = new wm2(2131231731, 0);
        wm2Var.c(hl.L(20.0f));
        wm2Var.r = hl.L(-3.0f);
        spannableStringBuilder.setSpan(wm2Var, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ob6.M0(2131745406, null));
        i(spannableStringBuilder, z, true);
    }

    public void setOutlineState(boolean z) {
        this.o0 = (byte) 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wm2 wm2Var = new wm2(2131231762, 0);
        wm2Var.c(hl.L(20.0f));
        wm2Var.r = hl.L(-3.0f);
        spannableStringBuilder.setSpan(wm2Var, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ob6.M0(2131745405, null));
        i(spannableStringBuilder, z, true);
    }

    public void setRad(int i) {
        this.r0 = i;
        setForeground(aob.Y(aob.v0(aob.i6, this.q0), i, i));
    }

    public void setRestoreState(boolean z) {
        this.o0 = (byte) 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wm2 wm2Var = new wm2(2131231732, 0);
        wm2Var.c(hl.L(20.0f));
        wm2Var.r = hl.L(-3.0f);
        spannableStringBuilder.setSpan(wm2Var, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ob6.M0(2131745404, null));
        i(spannableStringBuilder, z, true);
    }

    public void setUndoCutState(boolean z) {
        this.o0 = (byte) 1;
    }

    public void setUndoState(boolean z) {
        this.o0 = (byte) 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wm2 wm2Var = new wm2(2131232547, 0);
        wm2Var.c(hl.L(20.0f));
        wm2Var.r = hl.L(-3.0f);
        spannableStringBuilder.setSpan(wm2Var, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ob6.M0(2131745402, null));
        i(spannableStringBuilder, z, true);
    }

    @Override
    public void setVisibility(int i) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setVisibility(8);
        } else {
            super.setVisibility(i);
        }
    }
}
