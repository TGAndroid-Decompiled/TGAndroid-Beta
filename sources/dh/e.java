package dh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.u10;
public final class e extends ImageView {
    public long f8988a;
    public final f f8989b;

    public e(f fVar, Context context) {
        super(context);
        this.f8989b = fVar;
        this.f8988a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u10 u10Var;
        int action = motionEvent.getAction();
        f fVar = this.f8989b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f8988a + 350) {
                return false;
            }
            this.f8988a = System.currentTimeMillis();
            fVar.f9001b = true;
            fVar.f9002c = false;
            org.telegram.messenger.g0.i3(new cg.l0(fVar, 350, 2), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f9001b = false;
            if (!fVar.f9002c && (u10Var = fVar.d) != null) {
                u10Var.a(Boolean.FALSE);
                try {
                    fVar.f9000a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
