package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class daa implements View.OnTouchListener {
    public final byte a;
    public final Rect b;
    public final taa c;

    public daa(taa taaVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = taaVar;
                this.b = new Rect();
                return;
            default:
                this.c = taaVar;
                this.b = new Rect();
                return;
        }
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        m8 m8Var;
        m8 m8Var2;
        byte b = this.a;
        taa taaVar = this.c;
        Rect rect = this.b;
        switch (b) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (m8Var = taaVar.E2) != null && m8Var.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        taaVar.E2.d(true);
                    }
                }
                return false;
            default:
                if (motionEvent.getActionMasked() == 0 && (m8Var2 = taaVar.E2) != null && m8Var2.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        taaVar.E2.d(true);
                    }
                }
                return false;
        }
    }
}
