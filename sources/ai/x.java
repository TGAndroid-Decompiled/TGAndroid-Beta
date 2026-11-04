package ai;

import android.content.Context;
import android.view.MotionEvent;
public final class x extends gi.d {
    public final int f1088l0;

    public x(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, z10);
        this.f1088l0 = i3;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f1088l0) {
            case 0:
                if (!this.f12517d0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean j() {
        switch (this.f1088l0) {
            case 1:
                return false;
            case 2:
            default:
                return super.j();
            case 3:
                return false;
        }
    }
}
