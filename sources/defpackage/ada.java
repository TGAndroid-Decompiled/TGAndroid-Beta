package defpackage;

import android.graphics.Point;
import org.telegram.ui.ActionBar.d;
public final class ada implements f39 {
    public final pca a;
    public final nfa b;

    public ada(nfa nfaVar, pca pcaVar) {
        this.b = nfaVar;
        this.a = pcaVar;
    }

    @Override
    public final boolean mo8e(float r17, float r18, int r19, android.view.View r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ada.mo8e(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void f() {
        d dVar = this.b.y1;
        if (dVar != null) {
            Point point = gl.q;
            if (point.x > point.y) {
                dVar.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void g(float f) {
        d dVar = this.b.y1;
        if (dVar != null) {
            Point point = gl.q;
            if (point.x > point.y) {
                dVar.movePreviewFragment(f);
            }
        }
    }
}
