package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class yt3 extends FrameLayout {
    public vd0 a;
    public vd0 b;
    public Drawable c;
    public Drawable d;
    public final Drawable e;
    public Paint f;
    public RectF h;
    public final ViewGroup[] n;
    public final zt3 r;

    public yt3(zt3 zt3Var, Context context) {
        super(context);
        this.r = zt3Var;
        this.f = new Paint(1);
        this.h = new RectF();
        this.n = new ViewGroup[2];
        int i = 0;
        setWillNotDraw(false);
        setPadding(0, gl.L(24.0f), 0, gl.L(24.0f));
        LinearLayout j = de9.j(context, 1);
        addView(j, nme.e(-2, -2, 17));
        uk1 uk1Var = new uk1(context);
        uk1Var.setCustomText(k96.M0(2131742606, null));
        j.addView(uk1Var, nme.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(2131232865);
        j.addView(linearLayout, nme.t(-2, -2, 17, 10, 0, 10, 0));
        zt3Var.d = new ImageView(context);
        int i2 = zt3Var.x;
        if (i2 == 0) {
            while (i < 2) {
                this.n[i] = (ViewGroup) zt3Var.getParentActivity().getLayoutInflater().inflate(2131492957, (ViewGroup) null);
                linearLayout.addView(this.n[i], nme.o(-1, -2));
                i++;
            }
            linearLayout.addView(zt3Var.d, nme.r(218, 160, 17));
            zt3Var.d.setImageResource(2131231005);
        } else if (i2 == 1) {
            while (i < 2) {
                this.n[i] = (ViewGroup) zt3Var.getParentActivity().getLayoutInflater().inflate(2131492900, (ViewGroup) null);
                linearLayout.addView(this.n[i], nme.o(160, -2));
                i++;
            }
            linearLayout.addView(zt3Var.d, nme.r(160, 160, 17));
            zt3Var.d.setImageResource(2131231033);
        }
        a();
        this.e = bkb.W0(context, 2131231233, bkb.a7);
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yt3.a():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vd0 vd0Var = this.a;
        if (vd0Var != null) {
            vd0Var.dispose();
            this.a = null;
        }
        vd0 vd0Var2 = this.b;
        if (vd0Var2 != null) {
            vd0Var2.dispose();
            this.b = null;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yt3.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(264.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void dispatchSetPressed(boolean z) {
    }
}
