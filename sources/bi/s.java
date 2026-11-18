package bi;

import android.content.Context;
import android.view.MotionEvent;
public final class s extends hi.d {
    public final int m0;

    public s(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context, i6Var, z10);
        this.m0 = i7;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.m0) {
            case 0:
                if (!this.f14339e0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean j() {
        switch (this.m0) {
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
