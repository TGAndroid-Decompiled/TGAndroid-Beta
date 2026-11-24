package defpackage;

import android.view.ViewGroup;
import java.util.WeakHashMap;
public final class qp implements Runnable {
    public final byte a;
    public final bq b;

    public qp(bq bqVar, byte b) {
        this.a = b;
        this.b = bqVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        byte b = this.a;
        bq bqVar = this.b;
        switch (b) {
            case 0:
                if ((bqVar.j0 & 1) != 0) {
                    bqVar.j(0);
                }
                if ((bqVar.j0 & 4096) != 0) {
                    bqVar.j(108);
                }
                bqVar.i0 = false;
                bqVar.j0 = 0;
                return;
            default:
                bqVar.F.showAtLocation(bqVar.E, 55, 0, 0);
                ahc ahcVar = bqVar.H;
                if (ahcVar != null) {
                    ahcVar.b();
                }
                if (bqVar.J && (viewGroup = bqVar.K) != null) {
                    WeakHashMap weakHashMap = kfc.a;
                    if (viewGroup.isLaidOut()) {
                        bqVar.E.setAlpha(0.0f);
                        ahc a = kfc.a(bqVar.E);
                        a.a(1.0f);
                        bqVar.H = a;
                        a.d(new rp(this, (byte) 0));
                        return;
                    }
                }
                bqVar.E.setAlpha(1.0f);
                bqVar.E.setVisibility(0);
                return;
        }
    }
}
