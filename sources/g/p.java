package g;

import a8.kc;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
public final class p extends ContentFrameLayout {
    public final r f12153r;

    public p(r rVar, k.c cVar) {
        super(cVar);
        this.f12153r = rVar;
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f12153r.i(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x9 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (x9 < -5 || y3 < -5 || x9 > getWidth() + 5 || y3 > getHeight() + 5) {
                r rVar = this.f12153r;
                rVar.h(rVar.o(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void setBackgroundResource(int i10) {
        setBackgroundDrawable(kc.b(getContext(), i10));
    }
}
