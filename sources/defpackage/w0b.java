package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
public abstract class w0b extends b61 {
    public final wm0 m0;
    public final RectF n0;
    public byte o0;
    public final n1b p0;
    public final ylb q0;
    public int r0;
    public boolean s0;

    public w0b(n1b n1bVar, ContextThemeWrapper contextThemeWrapper, ylb ylbVar, sm0 sm0Var) {
        super(ylbVar, contextThemeWrapper, false);
        this.n0 = new RectF();
        this.r0 = 8;
        this.q0 = ylbVar;
        this.p0 = n1bVar;
        this.m0 = new wm0(sm0Var, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.x(gm.o());
        removeView(this.r);
        setForeground(cmb.Y(cmb.p1(0.08f, -1), 8, 8));
        setPadding(gm.L(24.0f), 0, gm.L(24.0f), 0);
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
        k1b[] k1bVarArr;
        n1b n1bVar = this.p0;
        super.setAlpha((!n1bVar.E || (k1bVarArr = n1bVar.I) == null || k1bVarArr.length <= 0) ? 0.0f : 0.0f);
    }

    public void setCancelState(boolean z) {
        this.o0 = (byte) 2;
        i(jb6.M0(2131752542, null), z, true);
    }

    public void setCutOutState(boolean z) {
        this.o0 = (byte) 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        pn2 pn2Var = new pn2(2131231753, 0);
        pn2Var.c(gm.L(22.0f));
        pn2Var.r = gm.L(1.0f);
        pn2Var.s = gm.L(2.0f);
        pn2Var.H = 1.2f;
        spannableStringBuilder.setSpan(pn2Var, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) jb6.M0(2131745414, null));
        i(spannableStringBuilder, z, true);
    }

    public void setEraseState(boolean z) {
        this.o0 = (byte) 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        pn2 pn2Var = new pn2(2131231732, 0);
        pn2Var.c(gm.L(20.0f));
        pn2Var.r = gm.L(-3.0f);
        spannableStringBuilder.setSpan(pn2Var, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) jb6.M0(2131745412, null));
        i(spannableStringBuilder, z, true);
    }

    public void setOutlineState(boolean z) {
        this.o0 = (byte) 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        pn2 pn2Var = new pn2(2131231763, 0);
        pn2Var.c(gm.L(20.0f));
        pn2Var.r = gm.L(-3.0f);
        spannableStringBuilder.setSpan(pn2Var, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) jb6.M0(2131745411, null));
        i(spannableStringBuilder, z, true);
    }

    public void setRad(int i) {
        this.r0 = i;
        setForeground(cmb.Y(cmb.v0(cmb.h6, this.q0), i, i));
    }

    public void setRestoreState(boolean z) {
        this.o0 = (byte) 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        pn2 pn2Var = new pn2(2131231733, 0);
        pn2Var.c(gm.L(20.0f));
        pn2Var.r = gm.L(-3.0f);
        spannableStringBuilder.setSpan(pn2Var, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) jb6.M0(2131745410, null));
        i(spannableStringBuilder, z, true);
    }

    public void setUndoCutState(boolean z) {
        this.o0 = (byte) 1;
    }

    public void setUndoState(boolean z) {
        this.o0 = (byte) 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        pn2 pn2Var = new pn2(2131232548, 0);
        pn2Var.c(gm.L(20.0f));
        pn2Var.r = gm.L(-3.0f);
        spannableStringBuilder.setSpan(pn2Var, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) jb6.M0(2131745408, null));
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
