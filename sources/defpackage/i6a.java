package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class i6a extends FrameLayout {
    public final l6a a;

    public i6a(l6a l6aVar, Context context) {
        super(context);
        this.a = l6aVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l6a l6aVar = this.a;
        View contentView = l6aVar.getContentView();
        contentView.getLocationInWindow(r3);
        int[] iArr = {iArr[0] + l6aVar.E, iArr[1] + l6aVar.F};
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        if ((motionEvent.getAction() != 0 || motionEvent.getX() > iArr[0]) && motionEvent.getX() < contentView.getWidth() + iArr[0] && motionEvent.getY() > iArr[1] && motionEvent.getY() < contentView.getHeight() + iArr[1]) {
            motionEvent.offsetLocation(iArr2[0] - iArr[0], (gm.m + iArr2[1]) - iArr[1]);
            return contentView.dispatchTouchEvent(motionEvent);
        }
        if (!l6aVar.A && !l6aVar.D) {
            l6aVar.D = true;
            l6aVar.l(new zna[0]);
        }
        return true;
    }
}
