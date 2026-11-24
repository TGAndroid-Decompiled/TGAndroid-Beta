package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class dca implements View.OnTouchListener {
    public final byte a;
    public final Rect b;
    public final tca c;

    public dca(tca tcaVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = tcaVar;
                this.b = new Rect();
                return;
            default:
                this.c = tcaVar;
                this.b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        m8 m8Var;
        m8 m8Var2;
        byte b = this.a;
        tca tcaVar = this.c;
        Rect rect = this.b;
        switch (b) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (m8Var = tcaVar.E2) != null && m8Var.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        tcaVar.E2.d(true);
                    }
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (m8Var2 = tcaVar.E2) != null && m8Var2.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        tcaVar.E2.d(true);
                    }
                }
                return false;
        }
    }
}
