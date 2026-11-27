package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.e;
public final class hf1 extends rd2 {
    public final byte s;
    public final e w;

    public hf1(e eVar, Context context, byte b) {
        super(context);
        this.s = b;
        this.w = eVar;
        setOrientation(1);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if1 if1Var;
        byte b = this.s;
        e eVar = this.w;
        switch (b) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (if1Var = ((wf1) eVar).G0) != null) {
                    if1Var.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((zu1) eVar).M5(true);
                }
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if1 if1Var;
        byte b = this.s;
        e eVar = this.w;
        switch (b) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (if1Var = ((wf1) eVar).G0) != null) {
                    if1Var.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((zu1) eVar).M5(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
