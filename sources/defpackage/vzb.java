package defpackage;

import org.telegram.tgnet.TLRPC;
public final class vzb implements yu8 {
    public final TLRPC.TL_forumTopic a;
    public final wzb b;

    public vzb(wzb wzbVar, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = wzbVar;
        this.a = tL_forumTopic;
    }

    @Override
    public final void l() {
        zzb zzbVar = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        zzbVar.Y(tL_forumTopic.id);
        hl.d3(new hab(this, tL_forumTopic, (byte) 17), 300L);
    }

    @Override
    public final void i(vp7 vp7Var) {
    }
}
