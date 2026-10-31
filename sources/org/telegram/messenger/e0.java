package org.telegram.messenger;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
public final class e0 extends LinkMovementMethod {
    public final int f15340a;

    public e0(int i10) {
        this.f15340a = i10;
    }

    @Override
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        switch (this.f15340a) {
            case 0:
                try {
                    boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return onTouchEvent;
                    }
                    Selection.removeSelection(spannable);
                    return onTouchEvent;
                } catch (Exception e) {
                    f8.g(e, true);
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
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return false;
                }
            case 2:
                try {
                    return super.onTouchEvent(textView, spannable, motionEvent);
                } catch (Exception e10) {
                    f8.g(e10, true);
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
                } catch (Exception e11) {
                    f8.g(e11, true);
                    return false;
                }
        }
    }

    public e0(boolean z10) {
        this.f15340a = 0;
    }
}
