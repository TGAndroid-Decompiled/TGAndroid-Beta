package ah;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h extends ImageView {
    public long f765a;
    public final i f766b;

    public h(i iVar, Context context) {
        super(context);
        this.f766b = iVar;
        this.f765a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        i iVar = this.f766b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f765a + 350) {
                return false;
            }
            this.f765a = System.currentTimeMillis();
            iVar.f772b = true;
            iVar.f773c = false;
            AndroidUtilities.runOnUIThread(new g(iVar, 350, 0), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            iVar.f772b = false;
            if (!iVar.f773c && (callback = iVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    iVar.f771a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
