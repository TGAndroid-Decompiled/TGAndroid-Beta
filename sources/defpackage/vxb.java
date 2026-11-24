package defpackage;

import org.telegram.tgnet.TLRPC;
public final class vxb implements rt8 {
    public final TLRPC.TL_forumTopic a;
    public final wxb b;

    public vxb(wxb wxbVar, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = wxbVar;
        this.a = tL_forumTopic;
    }

    @Override
    public final void v() {
        zxb zxbVar = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        zxbVar.Z(tL_forumTopic.id);
        gm.d3(new b7b(this, tL_forumTopic, (byte) 21), 300L);
    }

    @Override
    public final void f(zo7 zo7Var) {
    }
}
