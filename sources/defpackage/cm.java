package defpackage;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
public final class cm extends LinkMovementMethod {
    public final byte a;

    public cm(byte b) {
        this.a = b;
    }

    @Override
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                try {
                    boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        Selection.removeSelection(spannable);
                    }
                    return onTouchEvent;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return false;
                }
            case 1:
                try {
                    boolean onTouchEvent2 = super.onTouchEvent(textView, spannable, motionEvent);
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        Selection.removeSelection(spannable);
                    }
                    return onTouchEvent2;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return false;
                }
            case 2:
                try {
                    return super.onTouchEvent(textView, spannable, motionEvent);
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    return false;
                }
            default:
                try {
                    boolean onTouchEvent3 = super.onTouchEvent(textView, spannable, motionEvent);
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        Selection.removeSelection(spannable);
                    }
                    return onTouchEvent3;
                } catch (Exception e4) {
                    fc4.g(e4, true);
                    return false;
                }
        }
    }
}
