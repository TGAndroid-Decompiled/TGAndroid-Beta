package ah;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h extends ImageView {
    public long f770a;
    public final i f771b;

    public h(i iVar, Context context) {
        super(context);
        this.f771b = iVar;
        this.f770a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        int action = motionEvent.getAction();
        i iVar = this.f771b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.f770a + 350) {
                return false;
            }
            this.f770a = System.currentTimeMillis();
            iVar.f777b = true;
            iVar.f778c = false;
            AndroidUtilities.runOnUIThread(new g(iVar, 350, 0), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            iVar.f777b = false;
            if (!iVar.f778c && (callback = iVar.d) != null) {
                callback.run(Boolean.FALSE);
                try {
                    iVar.f776a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
