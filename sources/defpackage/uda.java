package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class uda implements View.OnTouchListener {
    public final byte a;
    public final Rect b;
    public final kea c;

    public uda(kea keaVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = keaVar;
                this.b = new Rect();
                return;
            default:
                this.c = keaVar;
                this.b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        n8 n8Var;
        n8 n8Var2;
        byte b = this.a;
        kea keaVar = this.c;
        Rect rect = this.b;
        switch (b) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (n8Var = keaVar.E2) != null && n8Var.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        keaVar.E2.d(true);
                    }
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (n8Var2 = keaVar.E2) != null && n8Var2.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        keaVar.E2.d(true);
                    }
                }
                return false;
        }
    }
}
