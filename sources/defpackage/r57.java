package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
public final class r57 extends View implements snb {
    public final hn a;
    public final vnb b;
    public final n57 c;
    public boolean d;
    public boolean e;
    public final String f;
    public final String h;
    public final int n;

    public r57(Context context, int i, String str, int i2, String str2, vnb vnbVar) {
        super(context);
        this.d = true;
        this.f = str;
        this.h = str2;
        this.b = vnbVar;
        int i3 = aob.i6;
        hf0 f0 = aob.f0(aob.v0(i3, vnbVar), 2, -1);
        uob M = yob.M(i3);
        setBackground(f0);
        yob.j(this, f0, null, M, vnbVar);
        hn hnVar = new hn(true, true, true);
        this.a = hnVar;
        hnVar.n(0.35f, 300L, k43.h);
        hnVar.w(hl.L(16.0f));
        hnVar.u(aob.v0(aob.E8, vnbVar));
        hnVar.setCallback(this);
        hnVar.q(!ob6.a0);
        if (ob6.a0) {
            hnVar.b = 5;
        }
        TextPaint textPaint = hnVar.a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + hl.L(77.0f));
        this.n = max;
        hnVar.N = max;
        n57 n57Var = new n57((byte) 0);
        b29 b29Var = new b29(i, hl.L(24.0f), hl.L(24.0f));
        n57Var.c = b29Var;
        b29Var.M(this);
        b29Var.E(true);
        b29Var.h = true;
        b29Var.F(0);
        b29 b29Var2 = new b29(i2, hl.L(24.0f), hl.L(24.0f));
        n57Var.d = b29Var2;
        b29Var2.M(this);
        b29Var2.E(true);
        b29Var2.h = true;
        b29Var2.F(0);
        n57Var.e = b29Var;
        this.c = n57Var;
        yob.x(this, n57Var, aob.F8, vnbVar, PorterDuff.Mode.SRC_IN);
    }

    public final void a(boolean z, boolean z2) {
        String str;
        boolean z3;
        b29 b29Var;
        if (!this.d && z == this.e) {
            return;
        }
        this.e = z;
        if (z) {
            str = this.f;
        } else {
            str = this.h;
        }
        if (z2 && !ob6.a0) {
            z3 = true;
        } else {
            z3 = false;
        }
        hn hnVar = this.a;
        hnVar.t(str, z3, true);
        n57 n57Var = this.c;
        b29 b29Var2 = (b29) n57Var.d;
        b29 b29Var3 = (b29) n57Var.c;
        n57Var.b = z;
        if (z2) {
            if (z) {
                b29Var = b29Var3;
            } else {
                b29Var = b29Var2;
            }
            n57Var.e = b29Var;
            b29Var3.H(0);
            b29Var2.H(0);
            ((b29) n57Var.e).start();
        } else {
            if (z) {
                b29Var2 = b29Var3;
            }
            n57Var.e = b29Var2;
            b29Var2.H(b29Var2.e[0] - 1);
        }
        this.d = false;
        setContentDescription(hnVar.i);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.E8));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z = ob6.a0;
        hn hnVar = this.a;
        n57 n57Var = this.c;
        if (z) {
            n57Var.setBounds(getMeasuredWidth() - hl.L(41.0f), ik8.D(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - hl.L(17.0f), (hl.L(24.0f) + getMeasuredHeight()) / 2);
            hnVar.setBounds(0, 0, getMeasuredWidth() - hl.L(59.0f), getMeasuredHeight());
        } else {
            n57Var.setBounds(hl.L(17.0f), ik8.D(24.0f, getMeasuredHeight(), 2), hl.L(41.0f), (hl.L(24.0f) + getMeasuredHeight()) / 2);
            hnVar.setBounds(hl.L(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        hnVar.draw(canvas);
        n57Var.draw(canvas);
    }

    public boolean getState() {
        return this.e;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int min;
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.n;
        if (mode == 1073741824) {
            min = Math.max(View.MeasureSpec.getSize(i), i3);
        } else {
            min = Math.min(View.MeasureSpec.getSize(i), i3);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, mode), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getVisibility() == 0 && getAlpha() >= 0.5f) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final void updateColors() {
        try {
            hn hnVar = this.a;
            if (hnVar != null) {
                hnVar.u(aob.v0(aob.E8, this.b));
                invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
