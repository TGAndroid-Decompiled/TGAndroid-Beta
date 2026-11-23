package ch;

import ai.c1;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.y10;
public final class e extends ImageView {
    public long f5372a;
    public final f f5373b;

    public e(f fVar, Context context) {
        super(context);
        this.f5373b = fVar;
        this.f5372a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        y10 y10Var;
        int action = motionEvent.getAction();
        f fVar = this.f5373b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f5372a + 350) {
                return false;
            }
            this.f5372a = System.currentTimeMillis();
            fVar.f5380b = true;
            fVar.f5381c = false;
            org.telegram.messenger.g0.h3(new c1(fVar, 350, 4), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f5380b = false;
            if (!fVar.f5381c && (y10Var = fVar.d) != null) {
                y10Var.a(Boolean.FALSE);
                try {
                    fVar.f5379a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
