package g;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import v7.q7;
public final class p extends ContentFrameLayout {
    public final r f9778r;

    public p(r rVar, k.c cVar) {
        super(cVar);
        this.f9778r = rVar;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f9778r.i(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (x10 < -5 || y3 < -5 || x10 > getWidth() + 5 || y3 > getHeight() + 5) {
                r rVar = this.f9778r;
                rVar.h(rVar.q(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void setBackgroundResource(int i10) {
        setBackgroundDrawable(q7.b(getContext(), i10));
    }
}
