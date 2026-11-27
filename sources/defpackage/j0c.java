package defpackage;

import org.telegram.tgnet.TLRPC;
public final class j0c {
    public TLRPC.TL_forumTopic a;
    public mt9 b;
    public final n0c c;

    public j0c(n0c n0cVar) {
        this.c = n0cVar;
    }

    public final long a() {
        mt9 mt9Var = this.b;
        if (mt9Var != null) {
            return mt9Var.a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        int i = n0c.r0;
        if (this.c.c) {
            return wf3.n(tL_forumTopic.from_id);
        }
        return tL_forumTopic.id;
    }
}
