package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public abstract class ayb extends View {
    public final byb a;
    public pcc b;
    public final vnb c;
    public int d;

    public ayb(int i, vnb vnbVar, Context context) {
        super(context);
        this.c = vnbVar;
        byb bybVar = new byb(i, this, vnbVar, false);
        this.a = bybVar;
        bybVar.s = new s8b(this, (byte) 28);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        vnb vnbVar = this.c;
        if (vnbVar != null) {
            vnbVar.b(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            aob.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.b();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(r47 r47Var) {
        byb bybVar = this.a;
        bybVar.e(r47Var);
        if (isAttachedToWindow()) {
            bybVar.a();
        }
    }

    public void setBackgroundHeight(int i) {
        this.d = i;
    }

    public void setOnTopicClickListener(pcc pccVar) {
        this.b = pccVar;
    }
}
