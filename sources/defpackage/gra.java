package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class gra extends LinearLayout {
    public final byte a;
    public final wsa b;

    public gra(wsa wsaVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = wsaVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                if (!wsaVar.W2.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!wsaVar.W2.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!wsaVar.W2.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!wsaVar.W2.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
