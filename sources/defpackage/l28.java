package defpackage;

import android.view.MotionEvent;
import android.webkit.WebView;
public final class l28 extends WebView {
    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }
}
