package g;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import g7.o7;

public final class p extends ContentFrameLayout {

    public final r f6275r;

    public p(r rVar, k.c cVar) {
        super(cVar, null);
        this.f6275r = rVar;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f6275r.i(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x8 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (x8 < -5 || y10 < -5 || x8 > getWidth() + 5 || y10 > getHeight() + 5) {
                r rVar = this.f6275r;
                rVar.h(rVar.p(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void setBackgroundResource(int i10) {
        setBackgroundDrawable(o7.b(getContext(), i10));
    }
}
