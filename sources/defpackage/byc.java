package defpackage;

import org.telegram.utils.twidget.z;
public final class byc implements Runnable {
    public final byte a;
    public final cyc b;

    public byc(cyc cycVar, byte b) {
        this.a = b;
        this.b = cycVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        cyc cycVar = this.b;
        switch (b) {
            case 0:
                z zVar = cycVar.e;
                if (zVar != null) {
                    zVar.f(cycVar.w);
                    return;
                }
                return;
            default:
                z zVar2 = cycVar.e;
                if (zVar2 != null) {
                    zVar2.f(cycVar.w);
                    return;
                }
                return;
        }
    }
}
