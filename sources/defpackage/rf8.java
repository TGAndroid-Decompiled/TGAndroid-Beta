package defpackage;

import org.telegram.messenger.ImageReceiver;
public final class rf8 extends nf8 {
    public final jo6 b;
    public final z5a c;

    public rf8(z5a z5aVar) {
        gn5 gn5Var;
        this.c = z5aVar;
        jo6 jo6Var = z5aVar.y;
        this.b = jo6Var;
        this.a.q0(gm.L(7.0f));
        ImageReceiver imageReceiver = this.a;
        imageReceiver.o0(0, 0, true);
        String str = jo6Var.g;
        int i = jo6Var.C;
        String str2 = jo6Var.I;
        if (str != null) {
            gn5Var = gn5.g(str);
        } else {
            String str3 = jo6Var.c;
            if (str3 != null) {
                gn5Var = gn5.g(str3);
            } else if (str2 != null) {
                if (jo6Var.b && !jo6Var.d()) {
                    gn5Var = gn5.g("vthumb://" + i + ":" + str2);
                } else {
                    gn5Var = gn5.g("thumb://" + i + ":" + str2);
                    imageReceiver.o0(jo6Var.J, jo6Var.K, true);
                }
            } else {
                imageReceiver.f();
                gn5Var = null;
            }
        }
        gn5 gn5Var2 = gn5Var;
        if (gn5Var2 != null) {
            imageReceiver.d0(gn5Var2, null, null, null, null, 0);
        } else {
            imageReceiver.f();
        }
    }
}
