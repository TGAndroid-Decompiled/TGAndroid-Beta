package d3;

import fi.t0;
import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f7665a;
    public final long f7666b;
    public final long f7667c;
    public final Object d;
    public final Object f7668e;

    public e0(t0 t0Var, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10) {
        this.f7665a = 2;
        this.d = t0Var;
        this.f7666b = j3;
        this.f7668e = tL_textWithEntities;
        this.f7667c = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: d3.e0.run():void");
    }

    public e0(Object obj, long j3, long j10, Object obj2, int i7) {
        this.f7665a = i7;
        this.d = obj;
        this.f7666b = j3;
        this.f7667c = j10;
        this.f7668e = obj2;
    }

    public e0(Object obj, Object obj2, long j3, long j10, int i7) {
        this.f7665a = i7;
        this.d = obj;
        this.f7668e = obj2;
        this.f7666b = j3;
        this.f7667c = j10;
    }
}
