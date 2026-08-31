package ng;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e extends ImageView {
    public long f16056a;
    public final f f16057b;

    public e(f fVar, Context context) {
        super(context);
        this.f16057b = fVar;
        this.f16056a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        f fVar = this.f16057b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f16056a + 350) {
                return false;
            }
            this.f16056a = System.currentTimeMillis();
            fVar.f16060b = true;
            fVar.f16061c = false;
            AndroidUtilities.runOnUIThread(new af.b(fVar, 350, 10), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f16060b = false;
            if (!fVar.f16061c && (callback = fVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    fVar.f16059a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
