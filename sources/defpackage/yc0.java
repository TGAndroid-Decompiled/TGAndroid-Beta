package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public abstract class yc0 {
    public final xc0 a = new xc0(this, (byte) 0);
    public final nm7 b = nm7.f(z8c.t0);
    public final TLObject c;
    public final int d;
    public final int e;
    public ad0 f;
    public boolean g;

    public yc0(int i, int i2, TLObject tLObject) {
        this.c = tLObject;
        this.d = i;
        this.e = i2;
    }

    public void a() {
        oc7.r1(z8c.t0).a3(this.d, ((TLRPC.Chat) this.c).id, false);
    }

    public void b(Object... objArr) {
        boolean z;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull != null && chatFull.id == ((TLRPC.Chat) this.c).id && (z = this.g)) {
            if (z) {
                this.g = false;
                this.b.n(this.a, this.e);
            }
            this.f.accept(chatFull);
        }
    }
}
