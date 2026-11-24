package defpackage;

import org.telegram.tgnet.TLRPC;
public final class hwb {
    public TLRPC.TL_forumTopic a;
    public up9 b;
    public final lwb c;

    public hwb(lwb lwbVar) {
        this.c = lwbVar;
    }

    public final long a() {
        up9 up9Var = this.b;
        if (up9Var != null) {
            return up9Var.a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        int i = lwb.r0;
        if (this.c.c) {
            return cf3.n(tL_forumTopic.from_id);
        }
        return tL_forumTopic.id;
    }
}
