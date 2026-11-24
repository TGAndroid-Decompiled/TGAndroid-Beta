package defpackage;

import android.view.MotionEvent;
public interface ms4 {
    void h();

    boolean onDown(MotionEvent motionEvent);

    boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

    void onLongPress(MotionEvent motionEvent);

    boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

    boolean onSingleTapUp(MotionEvent motionEvent);
}
