package defpackage;

import org.telegram.tgnet.TLRPC;
public final class jxb extends ja {
    public final TLRPC.TL_forumTopic c;

    public jxb(int i, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i, true);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jxb.class == obj.getClass()) {
            jxb jxbVar = (jxb) obj;
            int i = this.a;
            if (i == jxbVar.a && i == 0 && this.c.id == jxbVar.c.id) {
                return true;
            }
        }
        return false;
    }
}
