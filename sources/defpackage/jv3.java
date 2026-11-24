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
public final class jv3 extends FrameLayout {
    public ve0 a;
    public ve0 b;
    public Drawable c;
    public Drawable d;
    public final Drawable e;
    public Paint f;
    public RectF h;
    public final ViewGroup[] n;
    public final kv3 r;

    public jv3(kv3 kv3Var, Context context) {
        super(context);
        this.r = kv3Var;
        this.f = new Paint(1);
        this.h = new RectF();
        this.n = new ViewGroup[2];
        int i = 0;
        setWillNotDraw(false);
        setPadding(0, gm.L(24.0f), 0, gm.L(24.0f));
        LinearLayout i2 = hg9.i(context, 1);
        addView(i2, qoe.e(-2, -2, 17));
        cm1 cm1Var = new cm1(context);
        cm1Var.setCustomText(jb6.M0(2131742532, null));
        i2.addView(cm1Var, qoe.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(2131232878);
        i2.addView(linearLayout, qoe.t(-2, -2, 17, 10, 0, 10, 0));
        kv3Var.d = new ImageView(context);
        int i3 = kv3Var.x;
        if (i3 == 0) {
            while (i < 2) {
                this.n[i] = (ViewGroup) kv3Var.getParentActivity().getLayoutInflater().inflate(2131492957, (ViewGroup) null);
                linearLayout.addView(this.n[i], qoe.o(-1, -2));
                i++;
            }
            linearLayout.addView(kv3Var.d, qoe.r(218, 160, 17));
            kv3Var.d.setImageResource(2131231006);
        } else if (i3 == 1) {
            while (i < 2) {
                this.n[i] = (ViewGroup) kv3Var.getParentActivity().getLayoutInflater().inflate(2131492900, (ViewGroup) null);
                linearLayout.addView(this.n[i], qoe.o(160, -2));
                i++;
            }
            linearLayout.addView(kv3Var.d, qoe.r(160, 160, 17));
            kv3Var.d.setImageResource(2131231034);
        }
        a();
        this.e = cmb.W0(context, 2131231234, cmb.a7);
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jv3.a():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ve0 ve0Var = this.a;
        if (ve0Var != null) {
            ve0Var.dispose();
            this.a = null;
        }
        ve0 ve0Var2 = this.b;
        if (ve0Var2 != null) {
            ve0Var2.dispose();
            this.b = null;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jv3.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(264.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void dispatchSetPressed(boolean z) {
    }
}
