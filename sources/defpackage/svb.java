package defpackage;

import org.telegram.tgnet.TLRPC;
public final class svb implements or8 {
    public final TLRPC.TL_forumTopic a;
    public final tvb b;

    public svb(tvb tvbVar, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = tvbVar;
        this.a = tL_forumTopic;
    }

    @Override
    public final void n() {
        wvb wvbVar = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        wvbVar.Y(tL_forumTopic.id);
        gl.d3(new a5b(this, tL_forumTopic, (byte) 19), 300L);
    }

    @Override
    public final void h(vm7 vm7Var) {
    }
}
