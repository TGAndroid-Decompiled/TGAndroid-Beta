package defpackage;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.o;
public final class ys implements la8, e39, k8 {
    public final o a;

    public ys(o oVar) {
        this.a = oVar;
    }

    @Override
    public final void a(float[] fArr) {
        o oVar = this.a;
        fArr[0] = oVar.K0;
        fArr[1] = oVar.v0[0].b.getMeasuredHeight();
    }

    @Override
    public final boolean d(int i, View view) {
        if (view instanceof iv) {
            zw zwVar = ((iv) view).n;
            this.a.X(zwVar.a.articles.get(zwVar.b).url);
            return true;
        }
        return false;
    }

    @Override
    public final void r(KeyEvent keyEvent) {
        o oVar;
        m8 m8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = (oVar = this.a).I) != null && m8Var.isShowing()) {
            oVar.I.d(true);
        }
    }
}
