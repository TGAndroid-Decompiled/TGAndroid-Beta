package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class oh3 extends vf3 {
    public final cj3 P0;

    public oh3(cj3 cj3Var, Context context, cj3 cj3Var2, int i, int i2) {
        super(context, cj3Var2, i, i2);
        this.P0 = cj3Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar;
        aVar = ((d) this.P0).actionBar;
        if (!aVar.y() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
