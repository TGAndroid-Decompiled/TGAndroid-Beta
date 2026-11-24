package defpackage;

import org.telegram.tgnet.RequestTimeDelegate;
public final class vvc implements RequestTimeDelegate {
    public final xvc a;
    public final wvc b;

    public vvc(xvc xvcVar, wvc wvcVar) {
        this.a = xvcVar;
        this.b = wvcVar;
    }

    @Override
    public final void run(long j) {
        gm.c3(new e4b(this.a, this.b, j, (byte) 14));
    }
}
