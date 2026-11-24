package defpackage;

import java.nio.ByteBuffer;
public final class xe3 extends fka implements mcb {
    public final String r;
    public final vcb s;

    public xe3(String str, vcb vcbVar) {
        super(new rcb[2], new scb[2]);
        this.r = str;
        q(1024);
        this.s = vcbVar;
    }

    @Override
    public final la3 f() {
        return new rcb();
    }

    @Override
    public final na3 g() {
        return new kka(this);
    }

    @Override
    public final String getName() {
        return this.r;
    }

    @Override
    public final ja3 h(Throwable th) {
        return new Exception("Unexpected decode error", th);
    }

    @Override
    public final ja3 i(la3 la3Var, na3 na3Var, boolean z) {
        rcb rcbVar = (rcb) la3Var;
        scb scbVar = (scb) na3Var;
        try {
            ByteBuffer byteBuffer = rcbVar.c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            vcb vcbVar = this.s;
            if (z) {
                vcbVar.reset();
            }
            lcb g = vcbVar.g(0, limit, array);
            long j = rcbVar.e;
            long j2 = rcbVar.r;
            scbVar.timeUs = j;
            scbVar.a = g;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            scbVar.b = j;
            scbVar.shouldBeSkipped = false;
            return null;
        } catch (ncb e) {
            return e;
        }
    }

    @Override
    public final void b(long j) {
    }
}
