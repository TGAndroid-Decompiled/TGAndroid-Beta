package ch;

import ai.v0;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.z10;
public final class e extends ImageView {
    public long f5054a;
    public final f f5055b;

    public e(f fVar, Context context) {
        super(context);
        this.f5055b = fVar;
        this.f5054a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z10 z10Var;
        int action = motionEvent.getAction();
        f fVar = this.f5055b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f5054a + 350) {
                return false;
            }
            this.f5054a = System.currentTimeMillis();
            fVar.f5062b = true;
            fVar.f5063c = false;
            org.telegram.messenger.g0.i3(new v0(fVar, 350, 2), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f5062b = false;
            if (!fVar.f5063c && (z10Var = fVar.d) != null) {
                z10Var.a(Boolean.FALSE);
                try {
                    fVar.f5061a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
