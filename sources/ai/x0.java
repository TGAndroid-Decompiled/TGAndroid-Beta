package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e71;
public final class x0 extends e71 {
    public final s3 N;

    public x0(s3 s3Var, w0 w0Var, Context context, int i10, t0 t0Var, d dVar) {
        super(w0Var, context, i10, 0, false, t0Var, dVar);
        this.N = s3Var;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        h1 h1Var;
        m1 m1Var;
        super.v(d1Var, i10);
        s3 s3Var = this.N;
        if (s3Var.f1522y) {
            View view = d1Var.f47748a;
            if ((view instanceof h1) && (m1Var = (h1Var = (h1) view).K) != null && m1Var.f1380a == s3Var.f1521x) {
                h1Var.c();
                s3Var.f1522y = false;
            }
        }
    }

    @Override
    public final void y(s4.d1 d1Var) {
        h1 h1Var;
        m1 m1Var;
        super.y(d1Var);
        s3 s3Var = this.N;
        if (s3Var.f1522y) {
            View view = d1Var.f47748a;
            if ((view instanceof h1) && (m1Var = (h1Var = (h1) view).K) != null && m1Var.f1380a == s3Var.f1521x) {
                h1Var.c();
                s3Var.f1522y = false;
            }
        }
    }
}
