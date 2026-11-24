package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zv1 implements p8c {
    public final byte a = 1;
    public final Object b;
    public final boolean c;
    public final int d;
    public final int e;
    public final boolean f;
    public final String g;
    public final Object h;
    public final Object i;
    public final Object j;

    public zv1(ay1 ay1Var, Object obj, jm6 jm6Var, boolean z, int i, int i2, boolean z2, String str, Object obj2) {
        this.h = ay1Var;
        this.b = obj;
        this.i = jm6Var;
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
                int i = ChatActivityEnterView.r7;
                hv1 hv1Var = new hv1(chatActivityEnterView, (TLRPC.Document) obj2, this.g, (g27) this.j, this.c, this.d, this.e, this.b, (Long) obj, this.f);
                if (!chatActivityEnterView.U1(hv1Var)) {
                    hv1Var.run();
                    return;
                }
                return;
            default:
                ay1 ay1Var = (ay1) obj3;
                hv1 hv1Var2 = new hv1(ay1Var, this.b, (jm6) obj2, this.c, this.d, this.e, this.f, (Long) obj, this.g, this.j);
                if (!ay1Var.a.U1(hv1Var2)) {
                    hv1Var2.run();
                    return;
                }
                return;
        }
    }

    public zv1(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, g27 g27Var, boolean z, int i, int i2, Object obj, boolean z2) {
        this.h = chatActivityEnterView;
        this.i = document;
        this.g = str;
        this.j = g27Var;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.b = obj;
        this.f = z2;
    }
}
