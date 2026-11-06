package bi;

import android.content.Context;
import android.view.MotionEvent;
public final class w extends fi.d {
    public final int f4931k0;

    public w(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context, f6Var, z9);
        this.f4931k0 = i7;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f4931k0) {
            case 3:
                if (!this.f11752c0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean j() {
        switch (this.f4931k0) {
            case 0:
                return false;
            case 1:
            default:
                return super.j();
            case 2:
                return false;
        }
    }
}
