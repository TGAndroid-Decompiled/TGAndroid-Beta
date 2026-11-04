package g;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import b8.oc;
public final class q extends ContentFrameLayout {
    public final s f11722r;

    public q(s sVar, k.c cVar) {
        super(cVar);
        this.f11722r = sVar;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f11722r.j(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            if (x10 < -5 || y9 < -5 || x10 > getWidth() + 5 || y9 > getHeight() + 5) {
                s sVar = this.f11722r;
                sVar.i(sVar.p(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void setBackgroundResource(int i3) {
        setBackgroundDrawable(oc.b(getContext(), i3));
    }
}
