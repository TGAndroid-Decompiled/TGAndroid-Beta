package defpackage;

import java.nio.ByteBuffer;
public final class ld3 extends dia implements lab {
    public final String r;
    public final uab s;

    public ld3(String str, uab uabVar) {
        super(new qab[2], new rab[2]);
        this.r = str;
        q(1024);
        this.s = uabVar;
    }

    @Override
    public final z83 f() {
        return new qab();
    }

    @Override
    public final b93 g() {
        return new iia(this);
    }

    @Override
    public final String getName() {
        return this.r;
    }

    @Override
    public final x83 h(Throwable th) {
        return new Exception("Unexpected decode error", th);
    }

    @Override
    public final x83 i(z83 z83Var, b93 b93Var, boolean z) {
        qab qabVar = (qab) z83Var;
        rab rabVar = (rab) b93Var;
        try {
            ByteBuffer byteBuffer = qabVar.c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            uab uabVar = this.s;
            if (z) {
                uabVar.reset();
            }
            kab f = uabVar.f(0, limit, array);
            long j = qabVar.e;
            long j2 = qabVar.r;
            rabVar.timeUs = j;
            rabVar.a = f;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            rabVar.b = j;
            rabVar.shouldBeSkipped = false;
            return null;
        } catch (mab e) {
            return e;
        }
    }

    @Override
    public final void b(long j) {
    }
}
