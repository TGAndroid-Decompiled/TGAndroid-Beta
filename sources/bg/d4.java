package bg;

import android.content.Context;
import android.view.MotionEvent;
public final class d4 extends b {
    public final f4 A;

    public d4(f4 f4Var, Context context) {
        super(context);
        this.A = f4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        j jVar = this.A.D;
        if (jVar != null && jVar.getVisibility() == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.A.m();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.A.m();
    }
}
