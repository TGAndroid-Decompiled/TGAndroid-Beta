package defpackage;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class vl0 implements View.OnAttachStateChangeListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public vl0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                tl0 tl0Var = (tl0) obj;
                if (tl0Var != null) {
                    tl0Var.d.add((xl0) obj2);
                    return;
                }
                return;
            case 1:
                pkb pkbVar = (pkb) obj2;
                pkbVar.k = hm.update(pkbVar.l, (View) obj, pkbVar.k, pkbVar.b);
                return;
            default:
                zoc zocVar = (zoc) obj2;
                yoc yocVar = zocVar.m;
                if (yocVar != null) {
                    yocVar.setPaused(!zocVar.n);
                }
                zocVar.a.isAttachedToWindow();
                int i = zocVar.v0;
                if (-1 != i) {
                    if (i >= 0) {
                        jn7.f(i).n(zocVar.x0, 68);
                    }
                    zocVar.v0 = -1;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                xl0 xl0Var = (xl0) obj2;
                tl0 tl0Var = (tl0) obj;
                if (tl0Var != null) {
                    ArrayList arrayList = tl0Var.d;
                    arrayList.remove(xl0Var);
                    if (tl0Var.e.isEmpty() && arrayList.isEmpty()) {
                        tl0Var.n.a();
                    }
                }
                xl0Var.n = null;
                Paint paint = xl0Var.h;
                xl0Var.o = null;
                paint.setShader(null);
                return;
            case 1:
                hm.release((View) obj, ((pkb) obj2).k);
                return;
            default:
                zoc zocVar = (zoc) obj2;
                dl1 dl1Var = zocVar.a;
                zocVar.f();
                zocVar.M = false;
                zocVar.N = 0L;
                zocVar.k();
                vpa vpaVar = zocVar.Z;
                if (vpaVar != null) {
                    vpaVar.d();
                    zocVar.Z = null;
                }
                zocVar.a0 = 1.0f;
                dl1Var.invalidate();
                if (dl1Var.getParent() instanceof View) {
                    ((View) dl1Var.getParent()).invalidate();
                }
                zocVar.l();
                hrc hrcVar = zocVar.k;
                WeakHashMap weakHashMap = hrcVar.e;
                weakHashMap.remove((dl1) obj);
                if (weakHashMap.isEmpty()) {
                    hrcVar.a();
                }
                dl1Var.isAttachedToWindow();
                int i = zocVar.v0;
                if (-1 != i) {
                    if (i >= 0) {
                        jn7.f(i).n(zocVar.x0, 68);
                    }
                    zocVar.v0 = -1;
                }
                yoc yocVar = zocVar.m;
                if (yocVar != null) {
                    yocVar.setPaused(true);
                }
                zocVar.l.stop();
                zocVar.H = false;
                return;
        }
    }
}
