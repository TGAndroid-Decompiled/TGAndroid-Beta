package defpackage;

import android.view.ViewGroup;
import java.util.WeakHashMap;
public final class ro implements Runnable {
    public final byte a;
    public final cp b;

    public ro(cp cpVar, byte b) {
        this.a = b;
        this.b = cpVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        byte b = this.a;
        cp cpVar = this.b;
        switch (b) {
            case 0:
                if ((cpVar.j0 & 1) != 0) {
                    cpVar.j(0);
                }
                if ((cpVar.j0 & 4096) != 0) {
                    cpVar.j(108);
                }
                cpVar.i0 = false;
                cpVar.j0 = 0;
                return;
            default:
                cpVar.F.showAtLocation(cpVar.E, 55, 0, 0);
                zic zicVar = cpVar.H;
                if (zicVar != null) {
                    zicVar.b();
                }
                if (cpVar.J && (viewGroup = cpVar.K) != null) {
                    WeakHashMap weakHashMap = ihc.a;
                    if (viewGroup.isLaidOut()) {
                        cpVar.E.setAlpha(0.0f);
                        zic a = ihc.a(cpVar.E);
                        a.a(1.0f);
                        cpVar.H = a;
                        a.d(new so(this, (byte) 0));
                        return;
                    }
                }
                cpVar.E.setAlpha(1.0f);
                cpVar.E.setVisibility(0);
                return;
        }
    }
}
