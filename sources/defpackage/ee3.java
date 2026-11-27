package defpackage;

import java.nio.ByteBuffer;
public final class ee3 extends yla implements ieb {
    public final String r;
    public final reb s;

    public ee3(String str, reb rebVar) {
        super(new neb[2], new oeb[2]);
        this.r = str;
        q(1024);
        this.s = rebVar;
    }

    @Override
    public final s93 f() {
        return new neb();
    }

    @Override
    public final u93 g() {
        return new dma(this);
    }

    @Override
    public final String getName() {
        return this.r;
    }

    @Override
    public final q93 h(Throwable th) {
        return new Exception("Unexpected decode error", th);
    }

    @Override
    public final q93 i(s93 s93Var, u93 u93Var, boolean z) {
        neb nebVar = (neb) s93Var;
        oeb oebVar = (oeb) u93Var;
        try {
            ByteBuffer byteBuffer = nebVar.c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            reb rebVar = this.s;
            if (z) {
                rebVar.reset();
            }
            heb j = rebVar.j(0, limit, array);
            long j2 = nebVar.e;
            long j3 = nebVar.r;
            oebVar.timeUs = j2;
            oebVar.a = j;
            if (j3 != Long.MAX_VALUE) {
                j2 = j3;
            }
            oebVar.b = j2;
            oebVar.shouldBeSkipped = false;
            return null;
        } catch (jeb e) {
            return e;
        }
    }

    @Override
    public final void b(long j) {
    }
}
