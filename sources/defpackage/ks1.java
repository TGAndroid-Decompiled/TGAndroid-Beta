package defpackage;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class ks1 extends s57 {
    public final zu1 I;

    public ks1(zu1 zu1Var, Context context, zu1 zu1Var2, ll0 ll0Var, v47 v47Var, TLRPC.User user, TLRPC.Chat chat, int i, o57 o57Var, int i2, boolean z) {
        super(context, zu1Var2, ll0Var, v47Var, user, chat, i, o57Var, i2, z);
        this.I = zu1Var;
    }

    @Override
    public final void b() {
        r47 r47Var;
        ou1 ou1Var;
        zu1 zu1Var = this.I;
        ou1 ou1Var2 = zu1Var.D5;
        if (ou1Var2 != null && (r47Var = ou1Var2.a) != null && ((ou1Var = zu1Var.x5.d) == null || ou1Var.a == null || r47Var.e1() == zu1Var.x5.d.a.e1())) {
            return;
        }
        zu1Var.D5 = zu1Var.x5.d;
    }

    @Override
    public final void c(boolean z) {
        int i;
        boolean z2;
        boolean z3;
        t47 t47Var;
        int i2 = 0;
        a(false);
        zu1 zu1Var = this.I;
        v47 v47Var = zu1Var.x5;
        if (v47Var != null) {
            if (!z) {
                zu1Var.E5 = true;
            }
            t47 t47Var2 = v47Var.b;
            if (t47Var2 != null) {
                int size = t47Var2.e.size();
                i = 0;
                z2 = false;
                for (int i3 = 0; i3 < size; i3++) {
                    r47 r47Var = (r47) zu1Var.x5.b.e.get(i3);
                    if (r47Var.C4()) {
                        i = 3;
                    } else if (r47Var.S3()) {
                        if (i != 2) {
                            if (r47Var.Y3()) {
                                i = 2;
                            } else {
                                i = 1;
                            }
                        }
                    } else if (r47Var.z3()) {
                        z2 = true;
                    }
                    zu1Var.o6[0].put(r47Var.e1(), r47Var);
                }
            } else {
                i = 0;
                z2 = false;
            }
            Bundle j = qd4.j(3, "onlySelect", "dialogsType", true);
            j.putBoolean("quote", !z);
            if (!z && (t47Var = zu1Var.x5.a) != null && !t47Var.e.isEmpty() && zu1Var.x5.d == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            j.putBoolean("reply_to", z3);
            if (z3) {
                zu1Var.Xa(j, (r47) zu1Var.x5.a.e.get(0));
            }
            j.putInt("hasPoll", i);
            j.putBoolean("hasInvoice", z2);
            t47 t47Var3 = zu1Var.x5.b;
            if (t47Var3 != null) {
                i2 = t47Var3.e.size();
            }
            j.putInt("messagesCount", i2);
            j.putBoolean("canSelectTopics", true);
            uj3 uj3Var = new uj3(j);
            uj3Var.E2 = zu1Var;
            zu1Var.presentFragment(uj3Var);
        }
    }
}
