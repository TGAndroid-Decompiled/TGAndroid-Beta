package defpackage;

import org.telegram.utils.twidget.z;
public final class zrc implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;

    public zrc(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                asc ascVar = (asc) obj;
                if (!ascVar.r && i == ascVar.K) {
                    ascVar.M = false;
                    ascVar.a.g3.O(true);
                    return;
                }
                return;
            case 1:
                tvc tvcVar = (tvc) obj;
                ndc ndcVar = tvcVar.a;
                if (i == -1) {
                    if (ndcVar.c0()) {
                        ndcVar.f0();
                        tvcVar.n();
                    }
                    tvcVar.K = false;
                    return;
                } else if (i == 1) {
                    if (tvcVar.L) {
                        tvcVar.L = false;
                        ndcVar.g0();
                        return;
                    }
                    return;
                } else if (i != -3 && i == -2 && ndcVar.c0()) {
                    tvcVar.L = true;
                    ndcVar.f0();
                    tvcVar.n();
                    return;
                } else {
                    return;
                }
            default:
                try {
                    ((z) obj).h(i);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
