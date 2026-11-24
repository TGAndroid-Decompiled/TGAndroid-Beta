package defpackage;

import android.view.MotionEvent;
import android.webkit.WebView;
public final class i18 extends WebView {
    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }
}
