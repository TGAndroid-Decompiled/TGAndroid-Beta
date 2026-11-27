package defpackage;

import org.telegram.tgnet.TLRPC;
public final class yzb extends ka {
    public final TLRPC.TL_forumTopic c;

    public yzb(int i, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i, false);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || yzb.class != obj.getClass()) {
            return false;
        }
        yzb yzbVar = (yzb) obj;
        if (this.a != yzbVar.a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.c;
        if (tL_forumTopic2 == null || (tL_forumTopic = yzbVar.c) == null || tL_forumTopic2.id == tL_forumTopic.id) {
            return true;
        }
        return false;
    }
}
