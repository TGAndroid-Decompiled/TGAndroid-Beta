package defpackage;

import org.telegram.messenger.ImageReceiver;
public final class g28 implements Runnable {
    public final byte a;
    public final m8b b;

    public g28(m8b m8bVar, byte b) {
        this.a = b;
        this.b = m8bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        m8b m8bVar = this.b;
        switch (b) {
            case 0:
                m8bVar.U();
                return;
            case 1:
                m8bVar.d0 = true;
                m8bVar.k(true);
                return;
            case 2:
                if (m8bVar.G != null) {
                    b8b b8bVar = m8bVar.w;
                    if (b8bVar != null) {
                        qg5.c = true;
                        b8bVar.setLayerType(2, null);
                    }
                    m8bVar.G.addListener(new v7b(m8bVar, (byte) 0));
                    m8bVar.G.setDuration(320L);
                    m8bVar.G.setInterpolator(s33.h);
                    m8bVar.G.start();
                    return;
                }
                return;
            case 3:
                m8bVar.w0 = null;
                m8bVar.U();
                return;
            case 4:
                m8bVar.P(true);
                return;
            case 5:
                m8bVar.W();
                j8b j8bVar = m8bVar.t0;
                ImageReceiver imageReceiver = j8bVar.b;
                if (imageReceiver != null) {
                    imageReceiver.v0(false, true);
                }
                ImageReceiver imageReceiver2 = j8bVar.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.v0(false, true);
                    return;
                }
                return;
            default:
                m8bVar.i();
                return;
        }
    }
}
