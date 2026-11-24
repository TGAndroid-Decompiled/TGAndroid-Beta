package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
public final class osc implements View.OnClickListener {
    public final byte a;
    public final Object b;

    public osc(Object obj, byte b) {
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
                psc pscVar = (psc) obj;
                ag2 ag2Var = pscVar.a;
                ag2Var.c(!ag2Var.b(), true);
                pscVar.c.setEnabled(pscVar.a.b());
                ViewPropertyAnimator animate = pscVar.c.animate();
                if (pscVar.a.b()) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                animate.alpha(f).start();
                return;
            default:
                ry8 ry8Var = (ry8) ((jo0) obj).e;
                if (!ry8Var.b()) {
                    ry8Var.setProgress(0.0f);
                    ry8Var.d();
                    return;
                }
                return;
        }
    }
}
