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
public final class qu3 extends FrameLayout {
    public xd0 a;
    public xd0 b;
    public Drawable c;
    public Drawable d;
    public final Drawable e;
    public Paint f;
    public RectF h;
    public final ViewGroup[] n;
    public final ru3 r;

    public qu3(ru3 ru3Var, Context context) {
        super(context);
        this.r = ru3Var;
        this.f = new Paint(1);
        this.h = new RectF();
        this.n = new ViewGroup[2];
        int i = 0;
        setWillNotDraw(false);
        setPadding(0, hl.L(24.0f), 0, hl.L(24.0f));
        LinearLayout j = uh9.j(context, 1);
        addView(j, tre.e(-2, -2, 17));
        dl1 dl1Var = new dl1(context);
        dl1Var.setCustomText(ob6.M0(2131742500, null));
        j.addView(dl1Var, tre.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(2131232884);
        j.addView(linearLayout, tre.t(-2, -2, 17, 10, 0, 10, 0));
        ru3Var.d = new ImageView(context);
        int i2 = ru3Var.x;
        if (i2 == 0) {
            while (i < 2) {
                this.n[i] = (ViewGroup) ru3Var.getParentActivity().getLayoutInflater().inflate(2131492957, (ViewGroup) null);
                linearLayout.addView(this.n[i], tre.o(-1, -2));
                i++;
            }
            linearLayout.addView(ru3Var.d, tre.r(218, 160, 17));
            ru3Var.d.setImageResource(2131231005);
        } else if (i2 == 1) {
            while (i < 2) {
                this.n[i] = (ViewGroup) ru3Var.getParentActivity().getLayoutInflater().inflate(2131492900, (ViewGroup) null);
                linearLayout.addView(this.n[i], tre.o(160, -2));
                i++;
            }
            linearLayout.addView(ru3Var.d, tre.r(160, 160, 17));
            ru3Var.d.setImageResource(2131231033);
        }
        a();
        this.e = aob.W0(context, 2131231233, aob.b7);
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu3.a():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xd0 xd0Var = this.a;
        if (xd0Var != null) {
            xd0Var.dispose();
            this.a = null;
        }
        xd0 xd0Var2 = this.b;
        if (xd0Var2 != null) {
            xd0Var2.dispose();
            this.b = null;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu3.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(264.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void dispatchSetPressed(boolean z) {
    }
}
