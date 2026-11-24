package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class g4a extends FrameLayout {
    public final j4a a;

    public g4a(j4a j4aVar, Context context) {
        super(context);
        this.a = j4aVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j4a j4aVar = this.a;
        View contentView = j4aVar.getContentView();
        contentView.getLocationInWindow(r3);
        int[] iArr = {iArr[0] + j4aVar.E, iArr[1] + j4aVar.F};
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        if ((motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) && motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1] && motionEvent.getY() < contentView.getHeight() + iArr[1]) {
            motionEvent.offsetLocation(iArr2[0] - iArr[0], (gl.m + iArr2[1]) - iArr[1]);
            return contentView.dispatchTouchEvent(motionEvent);
        }
        if (!j4aVar.A && !j4aVar.D) {
            j4aVar.D = true;
            j4aVar.l(new yla[0]);
        }
        return true;
    }
}
