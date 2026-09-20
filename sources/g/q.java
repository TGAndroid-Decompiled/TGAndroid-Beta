package g;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import v7.w7;
public final class q extends ContentFrameLayout {
    public final s f9276r;

    public q(s sVar, k.c cVar) {
        super(cVar);
        this.f9276r = sVar;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f9276r.i(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
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
                s sVar = this.f9276r;
                sVar.h(sVar.o(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void setBackgroundResource(int i10) {
        setBackgroundDrawable(w7.b(getContext(), i10));
    }
}
