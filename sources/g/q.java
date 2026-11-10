package g;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
public final class q extends ContentFrameLayout {
    public final s f13340r;

    public q(s sVar, k.c cVar) {
        super(cVar);
        this.f13340r = sVar;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f13340r.i(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (x10 < -5 || y10 < -5 || x10 > getWidth() + 5 || y10 > getHeight() + 5) {
                s sVar = this.f13340r;
                sVar.h(sVar.o(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void setBackgroundResource(int i7) {
        setBackgroundDrawable(b5.a.b(getContext(), i7));
    }
}
