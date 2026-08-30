package mg;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class e extends ImageView {
    public long f13994a;
    public final f f13995b;

    public e(f fVar, Context context) {
        super(context);
        this.f13995b = fVar;
        this.f13994a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        f fVar = this.f13995b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f13994a + 350) {
                return false;
            }
            this.f13994a = System.currentTimeMillis();
            fVar.f13997b = true;
            fVar.f13998c = false;
            AndroidUtilities.runOnUIThread(new af.b(fVar, 350, 10), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f13997b = false;
            if (!fVar.f13998c && (callback = fVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    fVar.f13996a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
