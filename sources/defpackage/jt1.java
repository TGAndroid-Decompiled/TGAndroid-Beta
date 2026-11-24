package defpackage;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class jt1 extends l57 {
    public final yv1 I;

    public jt1(yv1 yv1Var, Context context, yv1 yv1Var2, km0 km0Var, o47 o47Var, TLRPC.User user, TLRPC.Chat chat, int i, h57 h57Var, int i2, boolean z) {
        super(context, yv1Var2, km0Var, o47Var, user, chat, i, h57Var, i2, z);
        this.I = yv1Var;
    }

    @Override
    public final void b() {
        k47 k47Var;
        nv1 nv1Var;
        yv1 yv1Var = this.I;
        nv1 nv1Var2 = yv1Var.D5;
        if (nv1Var2 != null && (k47Var = nv1Var2.a) != null && ((nv1Var = yv1Var.x5.d) == null || nv1Var.a == null || k47Var.e1() == yv1Var.x5.d.a.e1())) {
            return;
        }
        yv1Var.D5 = yv1Var.x5.d;
    }

    @Override
    public final void c(boolean z) {
        int i;
        boolean z2;
        boolean z3;
        m47 m47Var;
        int i2 = 0;
        a(false);
        yv1 yv1Var = this.I;
        o47 o47Var = yv1Var.x5;
        if (o47Var != null) {
            if (!z) {
                yv1Var.E5 = true;
            }
            m47 m47Var2 = o47Var.b;
            if (m47Var2 != null) {
                int size = m47Var2.e.size();
                i = 0;
                z2 = false;
                for (int i3 = 0; i3 < size; i3++) {
                    k47 k47Var = (k47) yv1Var.x5.b.e.get(i3);
                    if (k47Var.C4()) {
                        i = 3;
                    } else if (k47Var.S3()) {
                        if (i != 2) {
                            if (k47Var.Y3()) {
                                i = 2;
                            } else {
                                i = 1;
                            }
                        }
                    } else if (k47Var.z3()) {
                        z2 = true;
                    }
                    yv1Var.o6[0].put(k47Var.e1(), k47Var);
                }
            } else {
                i = 0;
                z2 = false;
            }
            Bundle j = td4.j(3, "onlySelect", "dialogsType", true);
            j.putBoolean("quote", !z);
            if (!z && (m47Var = yv1Var.x5.a) != null && !m47Var.e.isEmpty() && yv1Var.x5.d == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            j.putBoolean("reply_to", z3);
            if (z3) {
                yv1Var.Wa(j, (k47) yv1Var.x5.a.e.get(0));
            }
            j.putInt("hasPoll", i);
            j.putBoolean("hasInvoice", z2);
            m47 m47Var3 = yv1Var.x5.b;
            if (m47Var3 != null) {
                i2 = m47Var3.e.size();
            }
            j.putInt("messagesCount", i2);
            j.putBoolean("canSelectTopics", true);
            nk3 nk3Var = new nk3(j);
            nk3Var.E2 = yv1Var;
            yv1Var.presentFragment(nk3Var);
        }
    }
}
