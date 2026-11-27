package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class gta extends LinearLayout {
    public final byte a;
    public final wua b;

    public gta(wua wuaVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = wuaVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                if (!wuaVar.W2.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!wuaVar.W2.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!wuaVar.W2.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!wuaVar.W2.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
