package ig;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import cg.w1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class e extends ImageView {

    public long f11291a;

    public final f f11292b;

    public e(f fVar, Context context) {
        super(context);
        this.f11292b = fVar;
        this.f11291a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        f fVar = this.f11292b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f11291a + 350) {
                return false;
            }
            this.f11291a = System.currentTimeMillis();
            fVar.f11295b = true;
            fVar.f11296c = false;
            AndroidUtilities.runOnUIThread(new w1(fVar, 350, 5), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fVar.f11295b = false;
            if (!fVar.f11296c && (callback = fVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    fVar.f11294a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
