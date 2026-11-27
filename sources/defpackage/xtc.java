package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
public final class xtc implements View.OnClickListener {
    public final byte a;
    public final Object b;

    public xtc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ytc ytcVar = ((duc) obj).c;
                ytcVar.requestFocus();
                hl.E3(ytcVar);
                return;
            default:
                exc excVar = (exc) obj;
                sg2 sg2Var = excVar.a;
                sg2Var.c(!sg2Var.b(), true);
                excVar.c.setEnabled(excVar.a.b());
                ViewPropertyAnimator animate = excVar.c.animate();
                if (excVar.a.b()) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                animate.alpha(f).start();
                return;
        }
    }
}
