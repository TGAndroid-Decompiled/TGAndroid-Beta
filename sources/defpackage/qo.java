package defpackage;

import android.view.ViewGroup;
import java.util.WeakHashMap;
public final class qo implements Runnable {
    public final byte a;
    public final bp b;

    public qo(bp bpVar, byte b) {
        this.a = b;
        this.b = bpVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        byte b = this.a;
        bp bpVar = this.b;
        switch (b) {
            case 0:
                if ((bpVar.j0 & 1) != 0) {
                    bpVar.j(0);
                }
                if ((bpVar.j0 & 4096) != 0) {
                    bpVar.j(108);
                }
                bpVar.i0 = false;
                bpVar.j0 = 0;
                return;
            default:
                bpVar.F.showAtLocation(bpVar.E, 55, 0, 0);
                afc afcVar = bpVar.H;
                if (afcVar != null) {
                    afcVar.b();
                }
                if (bpVar.J && (viewGroup = bpVar.K) != null) {
                    WeakHashMap weakHashMap = jdc.a;
                    if (viewGroup.isLaidOut()) {
                        bpVar.E.setAlpha(0.0f);
                        afc a = jdc.a(bpVar.E);
                        a.a(1.0f);
                        bpVar.H = a;
                        a.d(new ro(this, (byte) 0));
                        return;
                    }
                }
                bpVar.E.setAlpha(1.0f);
                bpVar.E.setVisibility(0);
                return;
        }
    }
}
