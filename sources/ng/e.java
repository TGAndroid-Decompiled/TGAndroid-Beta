package ng;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e extends ImageView {
    public long f16058a;
    public final f f16059b;

    public e(f fVar, Context context) {
        super(context);
        this.f16059b = fVar;
        this.f16058a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        f fVar = this.f16059b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f16058a + 350) {
                return false;
            }
            this.f16058a = System.currentTimeMillis();
            fVar.f16062b = true;
            fVar.f16063c = false;
            AndroidUtilities.runOnUIThread(new af.b(fVar, 350, 10), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f16062b = false;
            if (!fVar.f16063c && (callback = fVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    fVar.f16061a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
