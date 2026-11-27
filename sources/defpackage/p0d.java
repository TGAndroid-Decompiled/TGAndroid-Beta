package defpackage;

import org.telegram.utils.twidget.z;
public final class p0d implements Runnable {
    public final byte a;
    public final q0d b;

    public p0d(q0d q0dVar, byte b) {
        this.a = b;
        this.b = q0dVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        q0d q0dVar = this.b;
        switch (b) {
            case 0:
                z zVar = q0dVar.e;
                if (zVar != null) {
                    zVar.f(q0dVar.w);
                    return;
                }
                return;
            default:
                z zVar2 = q0dVar.e;
                if (zVar2 != null) {
                    zVar2.f(q0dVar.w);
                    return;
                }
                return;
        }
    }
}
