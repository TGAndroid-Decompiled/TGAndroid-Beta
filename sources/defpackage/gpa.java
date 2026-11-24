package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class gpa extends LinearLayout {
    public final byte a;
    public final vqa b;

    public gpa(vqa vqaVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = vqaVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                if (!vqaVar.W2.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!vqaVar.W2.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!vqaVar.W2.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!vqaVar.W2.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
