package defpackage;

import org.telegram.tgnet.TLRPC;
public final class kyb {
    public TLRPC.TL_forumTopic a;
    public vr9 b;
    public final oyb c;

    public kyb(oyb oybVar) {
        this.c = oybVar;
    }

    public final long a() {
        vr9 vr9Var = this.b;
        if (vr9Var != null) {
            return vr9Var.a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        int i = oyb.r0;
        if (this.c.c) {
            return pg3.n(tL_forumTopic.from_id);
        }
        return tL_forumTopic.id;
    }
}
