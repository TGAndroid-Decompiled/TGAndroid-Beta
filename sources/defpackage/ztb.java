package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public abstract class ztb extends View {
    public final aub a;
    public p8c b;
    public final wjb c;
    public int d;

    public ztb(int i, wjb wjbVar, Context context) {
        super(context);
        this.c = wjbVar;
        aub aubVar = new aub(i, this, wjbVar, false);
        this.a = aubVar;
        aubVar.s = new cib(this, (byte) 11);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        wjb wjbVar = this.c;
        if (wjbVar != null) {
            wjbVar.b(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            bkb.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(33.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.a.d(motionEvent, false) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void set(k27 k27Var) {
        aub aubVar = this.a;
        aubVar.e(k27Var);
        if (isAttachedToWindow()) {
            aubVar.a();
        }
    }

    public void setBackgroundHeight(int i) {
        this.d = i;
    }

    public void setOnTopicClickListener(p8c p8cVar) {
        this.b = p8cVar;
    }
}
