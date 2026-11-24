package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.d;
public final class ye1 extends bd2 {
    public final byte s;
    public final d w;

    public ye1(d dVar, Context context, byte b) {
        super(context);
        this.s = b;
        this.w = dVar;
        setOrientation(1);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ze1 ze1Var;
        byte b = this.s;
        d dVar = this.w;
        switch (b) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (ze1Var = ((nf1) dVar).G0) != null) {
                    ze1Var.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((mu1) dVar).F5(true);
                }
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ze1 ze1Var;
        byte b = this.s;
        d dVar = this.w;
        switch (b) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (ze1Var = ((nf1) dVar).G0) != null) {
                    ze1Var.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((mu1) dVar).F5(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
