package ah;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h extends ImageView {
    public long f771a;
    public final i f772b;

    public h(i iVar, Context context) {
        super(context);
        this.f772b = iVar;
        this.f771a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        i iVar = this.f772b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f771a + 350) {
                return false;
            }
            this.f771a = System.currentTimeMillis();
            iVar.f778b = true;
            iVar.f779c = false;
            AndroidUtilities.runOnUIThread(new g(iVar, 350, 0), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            iVar.f778b = false;
            if (!iVar.f779c && (callback = iVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    iVar.f777a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
