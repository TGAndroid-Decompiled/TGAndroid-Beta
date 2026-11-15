package bi;

import android.animation.AnimatorSet;
import java.util.LinkedList;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.yf;
public final class v0 implements r1.c {
    public final int f3927a;
    public final Object f3928b;
    public final Object f3929c;

    public v0(int i7, Object obj, Object obj2) {
        this.f3927a = i7;
        this.f3928b = obj;
        this.f3929c = obj2;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f3927a) {
            case 0:
                ((x0) this.f3928b).b(0.0f);
                ((a3.f) this.f3929c).run();
                return;
            case 1:
                ki.x3 x3Var = (ki.x3) this.f3928b;
                Runnable runnable = (Runnable) this.f3929c;
                if (gVar == x3Var.H) {
                    x3Var.H = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = x3Var.F;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f12 = x3Var.h;
                    if (f12 != -1.0f) {
                        boolean z11 = x3Var.f18698s;
                        x3Var.f18698s = true;
                        x3Var.setOffsetY(f12);
                        x3Var.h = -1.0f;
                        x3Var.f18698s = z11;
                    }
                    x3Var.f18696n = -2.1474836E9f;
                    return;
                }
                return;
            case 2:
                dg dgVar = (dg) this.f3929c;
                ((cb) this.f3928b).setInOutOffset(0.0f);
                if (!z10) {
                    dgVar.run();
                    return;
                }
                return;
            case 3:
                yf yfVar = (yf) this.f3929c;
                AnimatorSet animatorSet = ((ki) this.f3928b).A0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    yfVar.run();
                    return;
                }
                return;
            case 4:
                ki kiVar = (ki) ((di.y3) this.f3928b).d;
                kiVar.f36513x2.setTranslationY(0.0f);
                kiVar.f36513x2.m(kiVar.f36463j4);
                kiVar.Y0.g();
                kiVar.f29682b.invalidate();
                ((vg) this.f3929c).run();
                kiVar.P1(0);
                return;
            default:
                fc0 fc0Var = (fc0) this.f3928b;
                ra0 ra0Var = (ra0) this.f3929c;
                LinkedList linkedList = fc0Var.V;
                fc0Var.U = null;
                ra0Var.D = null;
                ra0Var.y();
                if (!z10) {
                    ra0Var.h = 1.0f;
                    ra0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        fc0Var.W.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
