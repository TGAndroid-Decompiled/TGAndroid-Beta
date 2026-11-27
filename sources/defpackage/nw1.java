package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class nw1 implements pcc {
    public final byte a = 0;
    public final Object b;
    public final boolean c;
    public final int d;
    public final int e;
    public final boolean f;
    public final String g;
    public final Object h;
    public final Object i;
    public final Object j;

    public nw1(qy1 qy1Var, Object obj, no6 no6Var, boolean z, int i, int i2, boolean z2, String str, Object obj2) {
        this.h = qy1Var;
        this.b = obj;
        this.i = no6Var;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = z2;
        this.g = str;
        this.j = obj2;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i = ChatActivityEnterView.X7;
                sv1 sv1Var = new sv1(chatActivityEnterView, (TLRPC.Document) obj2, this.g, (n47) this.j, this.c, this.d, this.e, this.b, (Long) obj, this.f);
                if (!chatActivityEnterView.g2(sv1Var)) {
                    sv1Var.run();
                    return;
                }
                return;
            default:
                qy1 qy1Var = (qy1) obj3;
                sv1 sv1Var2 = new sv1(qy1Var, this.b, (no6) obj2, this.c, this.d, this.e, this.f, (Long) obj, this.g, this.j);
                if (!qy1Var.a.g2(sv1Var2)) {
                    sv1Var2.run();
                    return;
                }
                return;
        }
    }

    public nw1(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, n47 n47Var, boolean z, int i, int i2, Object obj, boolean z2) {
        this.h = chatActivityEnterView;
        this.i = document;
        this.g = str;
        this.j = n47Var;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.b = obj;
        this.f = z2;
    }
}
