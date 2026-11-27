package defpackage;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.o;
public final class xs implements ce8, t69, l8 {
    public final o a;

    public xs(o oVar) {
        this.a = oVar;
    }

    @Override
    public final void a(float[] fArr) {
        o oVar = this.a;
        fArr[0] = oVar.K0;
        fArr[1] = oVar.v0[0].b.getMeasuredHeight();
    }

    @Override
    public final boolean e(int i, View view) {
        if (view instanceof jv) {
            ax axVar = ((jv) view).n;
            this.a.X(axVar.a.articles.get(axVar.b).url);
            return true;
        }
        return false;
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        o oVar;
        n8 n8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n8Var = (oVar = this.a).I) != null && n8Var.isShowing()) {
            oVar.I.d(true);
        }
    }
}
