package defpackage;

import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class ul0 implements View.OnAttachStateChangeListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public ul0(Object obj, Object obj2, byte b) {
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
                sl0 sl0Var = (sl0) obj;
                if (sl0Var != null) {
                    sl0Var.d.add((wl0) obj2);
                    return;
                }
                return;
            case 1:
                tgb tgbVar = (tgb) obj2;
                tgbVar.k = gm.update(tgbVar.l, (View) obj, tgbVar.k, tgbVar.b);
                return;
            default:
                nkc nkcVar = (nkc) obj2;
                mkc mkcVar = nkcVar.m;
                if (mkcVar != null) {
                    mkcVar.setPaused(!nkcVar.n);
                }
                nkcVar.a.isAttachedToWindow();
                int i = nkcVar.v0;
                if (-1 != i) {
                    if (i >= 0) {
                        kk7.f(i).n(nkcVar.x0, 67);
                    }
                    nkcVar.v0 = -1;
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
                wl0 wl0Var = (wl0) obj2;
                sl0 sl0Var = (sl0) obj;
                if (sl0Var != null) {
                    ArrayList arrayList = sl0Var.d;
                    arrayList.remove(wl0Var);
                    if (sl0Var.e.isEmpty() && arrayList.isEmpty()) {
                        sl0Var.n.a();
                    }
                }
                wl0Var.n = null;
                Paint paint = wl0Var.h;
                wl0Var.o = null;
                paint.setShader(null);
                return;
            case 1:
                gm.release((View) obj, ((tgb) obj2).k);
                return;
            default:
                nkc nkcVar = (nkc) obj2;
                uk1 uk1Var = nkcVar.a;
                nkcVar.f();
                nkcVar.M = false;
                nkcVar.N = 0L;
                nkcVar.k();
                yla ylaVar = nkcVar.Z;
                if (ylaVar != null) {
                    ylaVar.d();
                    nkcVar.Z = null;
                }
                nkcVar.a0 = 1.0f;
                uk1Var.invalidate();
                if (uk1Var.getParent() instanceof View) {
                    ((View) uk1Var.getParent()).invalidate();
                }
                nkcVar.l();
                umc umcVar = nkcVar.k;
                WeakHashMap weakHashMap = umcVar.e;
                weakHashMap.remove((uk1) obj);
                if (weakHashMap.isEmpty()) {
                    umcVar.a();
                }
                uk1Var.isAttachedToWindow();
                int i = nkcVar.v0;
                if (-1 != i) {
                    if (i >= 0) {
                        kk7.f(i).n(nkcVar.x0, 67);
                    }
                    nkcVar.v0 = -1;
                }
                mkc mkcVar = nkcVar.m;
                if (mkcVar != null) {
                    mkcVar.setPaused(true);
                }
                nkcVar.l.stop();
                nkcVar.H = false;
                return;
        }
    }
}
