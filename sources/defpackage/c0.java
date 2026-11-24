package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.b;
import org.telegram.ui.Wallet.c;
public final class c0 implements i8c {
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
                l5c l5cVar = (l5c) obj2;
                hmc hmcVar = (hmc) ((bn0) obj3).c;
                if (i == 0) {
                    l5cVar.V();
                    b bVar = hmcVar.G0;
                    if (bVar != null && !bVar.c.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        for (int i2 = 0; i2 < hmcVar.G0.c.size(); i2++) {
                            arrayList.add(jyb.i((TL_wallet.walletTransaction) hmcVar.G0.c.get(i2), hmcVar.G0.a));
                        }
                    }
                    b bVar2 = hmcVar.G0;
                    if (bVar2 != null && (bVar2.k || !bVar2.h)) {
                        arrayList.add(c4c.q(-1, 37));
                        arrayList.add(c4c.q(-2, 37));
                        arrayList.add(c4c.q(-3, 37));
                    }
                    l5cVar.U();
                    if (z) {
                        long f = hmcVar.getMessagesController().k4.p0.f();
                        if (f > 0) {
                            arrayList.add(c4c.C(k96.V(null, null, 2131742854, c.w(f, false))));
                            return;
                        }
                        return;
                    }
                    return;
                }
                t05 t05Var = hmcVar.H0;
                if (t05Var != null) {
                    ArrayList arrayList2 = t05Var.a;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj4 = arrayList2.get(i3);
                        i3++;
                        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj4;
                        if (hmcVar.l0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(hmcVar.l0))) {
                            if (nftitem.gift != null) {
                                koc kocVar = hmcVar.k0;
                                int i4 = xnc.b;
                                c4c K = c4c.K(xnc.class);
                                K.v = 1;
                                K.H = nftitem;
                                K.I = kocVar;
                                arrayList.add(K);
                            } else {
                                int i5 = uk2.b;
                                c4c K2 = c4c.K(uk2.class);
                                K2.H = nftitem;
                                K2.v = 1;
                                arrayList.add(K2);
                            }
                        }
                    }
                    if (arrayList.isEmpty() && !hmcVar.l0.isEmpty()) {
                        t05 t05Var2 = hmcVar.H0;
                        if (!t05Var2.i && t05Var2.g) {
                            arrayList.add(c4c.r(k96.M0(2131747975, null)));
                        }
                    }
                    t05 t05Var3 = hmcVar.H0;
                    if (t05Var3.i) {
                        for (int i6 = 0; i6 < 3; i6++) {
                            int i7 = wk2.b;
                            c4c K3 = c4c.K(wk2.class);
                            K3.v = 1;
                            K3.d = (-1) - i6;
                            arrayList.add(K3);
                        }
                        return;
                    } else if (t05Var3.m != null) {
                        arrayList.add(c4c.e(-10001, k96.M0(2131745859, null)));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
