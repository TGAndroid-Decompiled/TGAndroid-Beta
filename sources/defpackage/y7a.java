package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class y7a extends FrameLayout {
    public final b8a a;

    public y7a(b8a b8aVar, Context context) {
        super(context);
        this.a = b8aVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b8a b8aVar = this.a;
        View contentView = b8aVar.getContentView();
        contentView.getLocationInWindow(r3);
        int[] iArr = {iArr[0] + b8aVar.E, iArr[1] + b8aVar.F};
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        if ((motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) && motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1] && motionEvent.getY() < contentView.getHeight() + iArr[1]) {
            motionEvent.offsetLocation(iArr2[0] - iArr[0], (hl.m + iArr2[1]) - iArr[1]);
            return contentView.dispatchTouchEvent(motionEvent);
        }
        if (!b8aVar.A && !b8aVar.D) {
            b8aVar.D = true;
            b8aVar.l(new vpa[0]);
        }
        return true;
    }
}
