package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ivb extends ja {
    public final TLRPC.TL_forumTopic c;

    public ivb(int i, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ivb.class == obj.getClass()) {
            ivb ivbVar = (ivb) obj;
            int i = this.a;
            if (i == ivbVar.a && i == 0 && this.c.id == ivbVar.c.id) {
                return true;
            }
        }
        return false;
    }
}
