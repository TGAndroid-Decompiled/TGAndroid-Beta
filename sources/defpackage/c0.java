package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.b;
import org.telegram.ui.Wallet.c;
public final class c0 implements jac {
    public final byte a;
    public final int b;
    public final Object c;

    public c0(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        boolean z;
        byte b = this.a;
        int i = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                e0 e0Var = (e0) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    e0Var.d2[i] = aicomposetoneexample;
                    e0Var.b2.O(true);
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                l7c l7cVar = (l7c) obj2;
                goc gocVar = (goc) ((bo0) obj3).c;
                if (i == 0) {
                    l7cVar.V();
                    b bVar = gocVar.G0;
                    if (bVar != null && !bVar.c.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        for (int i2 = 0; i2 < gocVar.G0.c.size(); i2++) {
                            arrayList.add(k0c.i((TL_wallet.walletTransaction) gocVar.G0.c.get(i2), gocVar.G0.a));
                        }
                    }
                    b bVar2 = gocVar.G0;
                    if (bVar2 != null && (bVar2.k || !bVar2.h)) {
                        arrayList.add(c6c.q(-1, 37));
                        arrayList.add(c6c.q(-2, 37));
                        arrayList.add(c6c.q(-3, 37));
                    }
                    l7cVar.U();
                    if (z) {
                        long f = gocVar.getMessagesController().l4.p0.f();
                        if (f > 0) {
                            arrayList.add(c6c.C(jb6.V(null, null, 2131742780, c.w(f, false))));
                            return;
                        }
                        return;
                    }
                    return;
                }
                t25 t25Var = gocVar.H0;
                if (t25Var != null) {
                    ArrayList arrayList2 = t25Var.a;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj4 = arrayList2.get(i3);
                        i3++;
                        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj4;
                        if (gocVar.l0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(gocVar.l0))) {
                            if (nftitem.gift != null) {
                                mqc mqcVar = gocVar.k0;
                                int i4 = zpc.b;
                                c6c K = c6c.K(zpc.class);
                                K.v = 1;
                                K.H = nftitem;
                                K.I = mqcVar;
                                arrayList.add(K);
                            } else {
                                int i5 = gm2.b;
                                c6c K2 = c6c.K(gm2.class);
                                K2.H = nftitem;
                                K2.v = 1;
                                arrayList.add(K2);
                            }
                        }
                    }
                    if (arrayList.isEmpty() && !gocVar.l0.isEmpty()) {
                        t25 t25Var2 = gocVar.H0;
                        if (!t25Var2.i && t25Var2.g) {
                            arrayList.add(c6c.r(jb6.M0(2131747901, null)));
                        }
                    }
                    t25 t25Var3 = gocVar.H0;
                    if (t25Var3.i) {
                        for (int i6 = 0; i6 < 3; i6++) {
                            int i7 = im2.b;
                            c6c K3 = c6c.K(im2.class);
                            K3.v = 1;
                            K3.d = (-1) - i6;
                            arrayList.add(K3);
                        }
                        return;
                    } else if (t25Var3.m != null) {
                        arrayList.add(c6c.e(-10001, jb6.M0(2131745785, null)));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
