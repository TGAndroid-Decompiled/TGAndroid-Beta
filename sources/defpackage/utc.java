package defpackage;

import org.telegram.tgnet.RequestTimeDelegate;
public final class utc implements RequestTimeDelegate {
    public final wtc a;
    public final vtc b;

    public utc(wtc wtcVar, vtc vtcVar) {
        this.a = wtcVar;
        this.b = vtcVar;
    }

    @Override
    public final void run(long j) {
        gl.d3(new d2b(this.a, this.b, j, (byte) 14));
    }
}
