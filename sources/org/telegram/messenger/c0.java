package org.telegram.messenger;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
public final class c0 extends LinkMovementMethod {
    public final int f21771a;

    public c0(int i7) {
        this.f21771a = i7;
    }

    @Override
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        switch (this.f21771a) {
            case 0:
                try {
                    boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return onTouchEvent;
                    }
                    Selection.removeSelection(spannable);
                    return onTouchEvent;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return false;
                }
            case 1:
                try {
                    boolean onTouchEvent2 = super.onTouchEvent(textView, spannable, motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return onTouchEvent2;
                    }
                    Selection.removeSelection(spannable);
                    return onTouchEvent2;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return false;
                }
            case 2:
                try {
                    return super.onTouchEvent(textView, spannable, motionEvent);
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return false;
                }
            default:
                try {
                    boolean onTouchEvent3 = super.onTouchEvent(textView, spannable, motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return onTouchEvent3;
                    }
                    Selection.removeSelection(spannable);
                    return onTouchEvent3;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return false;
                }
        }
    }

    public c0(boolean z9) {
        this.f21771a = 0;
    }
}
