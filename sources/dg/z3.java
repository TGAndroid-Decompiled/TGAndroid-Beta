package dg;

import android.content.Context;
import android.view.MotionEvent;
public final class z3 extends b {
    public final b4 B;

    public z3(b4 b4Var, Context context) {
        super(context);
        this.B = b4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i iVar = this.B.E;
        if (iVar != null && iVar.getVisibility() == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.B.m();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.B.m();
    }
}
