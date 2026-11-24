package defpackage;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.o;
public final class zt implements oc8, h59, k8 {
    public final o a;

    public zt(o oVar) {
        this.a = oVar;
    }

    @Override
    public final void a(float[] fArr) {
        o oVar = this.a;
        fArr[0] = oVar.K0;
        fArr[1] = oVar.v0[0].b.getMeasuredHeight();
    }

    @Override
    public final boolean g(int i, View view) {
        if (view instanceof iw) {
            zx zxVar = ((iw) view).n;
            this.a.X(zxVar.a.articles.get(zxVar.b).url);
            return true;
        }
        return false;
    }

    @Override
    public final void q(KeyEvent keyEvent) {
        o oVar;
        m8 m8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = (oVar = this.a).I) != null && m8Var.isShowing()) {
            oVar.I.d(true);
        }
    }
}
