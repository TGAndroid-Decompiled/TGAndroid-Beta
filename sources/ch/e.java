package ch;

import ai.w0;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.x10;
public final class e extends ImageView {
    public long f5343a;
    public final f f5344b;

    public e(f fVar, Context context) {
        super(context);
        this.f5344b = fVar;
        this.f5343a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x10 x10Var;
        int action = motionEvent.getAction();
        f fVar = this.f5344b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f5343a + 350) {
                return false;
            }
            this.f5343a = System.currentTimeMillis();
            fVar.f5351b = true;
            fVar.f5352c = false;
            org.telegram.messenger.g0.h3(new w0(fVar, 350, 4), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f5351b = false;
            if (!fVar.f5352c && (x10Var = fVar.d) != null) {
                x10Var.a(Boolean.FALSE);
                try {
                    fVar.f5350a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
