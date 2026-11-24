package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
public abstract class vya extends u41 {
    public final wl0 m0;
    public final RectF n0;
    public byte o0;
    public final mza p0;
    public final wjb q0;
    public int r0;
    public boolean s0;

    public vya(mza mzaVar, ContextThemeWrapper contextThemeWrapper, wjb wjbVar, sl0 sl0Var) {
        super(wjbVar, contextThemeWrapper, false);
        this.n0 = new RectF();
        this.r0 = 8;
        this.q0 = wjbVar;
        this.p0 = mzaVar;
        this.m0 = new wl0(sl0Var, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.x(gl.o());
        removeView(this.r);
        setForeground(bkb.Y(bkb.p1(0.08f, -1), 8, 8));
        setPadding(gl.L(24.0f), 0, gl.L(24.0f), 0);
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
        jza[] jzaVarArr;
        mza mzaVar = this.p0;
        super.setAlpha((!mzaVar.E || (jzaVarArr = mzaVar.I) == null || jzaVarArr.length <= 0) ? 0.0f : 0.0f);
    }

    public void setCancelState(boolean z) {
        this.o0 = (byte) 2;
        i(k96.M0(2131752577, null), z, true);
    }

    public void setCutOutState(boolean z) {
        this.o0 = (byte) 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        cm2 cm2Var = new cm2(2131231752, 0);
        cm2Var.c(gl.L(22.0f));
        cm2Var.r = gl.L(1.0f);
        cm2Var.s = gl.L(2.0f);
        cm2Var.H = 1.2f;
        spannableStringBuilder.setSpan(cm2Var, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) k96.M0(2131745488, null));
        i(spannableStringBuilder, z, true);
    }

    public void setEraseState(boolean z) {
        this.o0 = (byte) 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        cm2 cm2Var = new cm2(2131231731, 0);
        cm2Var.c(gl.L(20.0f));
        cm2Var.r = gl.L(-3.0f);
        spannableStringBuilder.setSpan(cm2Var, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) k96.M0(2131745486, null));
        i(spannableStringBuilder, z, true);
    }

    public void setOutlineState(boolean z) {
        this.o0 = (byte) 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        cm2 cm2Var = new cm2(2131231762, 0);
        cm2Var.c(gl.L(20.0f));
        cm2Var.r = gl.L(-3.0f);
        spannableStringBuilder.setSpan(cm2Var, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) k96.M0(2131745485, null));
        i(spannableStringBuilder, z, true);
    }

    public void setRad(int i) {
        this.r0 = i;
        setForeground(bkb.Y(bkb.v0(bkb.h6, this.q0), i, i));
    }

    public void setRestoreState(boolean z) {
        this.o0 = (byte) 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        cm2 cm2Var = new cm2(2131231732, 0);
        cm2Var.c(gl.L(20.0f));
        cm2Var.r = gl.L(-3.0f);
        spannableStringBuilder.setSpan(cm2Var, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) k96.M0(2131745484, null));
        i(spannableStringBuilder, z, true);
    }

    public void setUndoCutState(boolean z) {
        this.o0 = (byte) 1;
    }

    public void setUndoState(boolean z) {
        this.o0 = (byte) 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        cm2 cm2Var = new cm2(2131232536, 0);
        cm2Var.c(gl.L(20.0f));
        cm2Var.r = gl.L(-3.0f);
        spannableStringBuilder.setSpan(cm2Var, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) k96.M0(2131745482, null));
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
