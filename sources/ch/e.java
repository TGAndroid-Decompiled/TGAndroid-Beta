package ch;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.y10;
public final class e extends ImageView {
    public long f5335a;
    public final f f5336b;

    public e(f fVar, Context context) {
        super(context);
        this.f5336b = fVar;
        this.f5335a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        y10 y10Var;
        int action = motionEvent.getAction();
        f fVar = this.f5336b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f5335a + 350) {
                return false;
            }
            this.f5335a = System.currentTimeMillis();
            fVar.f5343b = true;
            fVar.f5344c = false;
            org.telegram.messenger.g0.h3(new ai.t0(fVar, 350, 5), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f5343b = false;
            if (!fVar.f5344c && (y10Var = fVar.d) != null) {
                y10Var.a(Boolean.FALSE);
                try {
                    fVar.f5342a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
