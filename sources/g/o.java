package g;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import h7.s7;
public final class o extends ContentFrameLayout {
    public final q f6904r;

    public o(q qVar, k.c cVar) {
        super(cVar);
        this.f6904r = qVar;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f6904r.j(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x4 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            if (x4 < -5 || y8 < -5 || x4 > getWidth() + 5 || y8 > getHeight() + 5) {
                q qVar = this.f6904r;
                qVar.h(qVar.p(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void setBackgroundResource(int i10) {
        setBackgroundDrawable(s7.b(getContext(), i10));
    }
}
