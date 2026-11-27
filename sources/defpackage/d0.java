package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.b;
import org.telegram.ui.Wallet.c;
public final class d0 implements icc {
    public final byte a;
    public final int b;
    public final Object c;

    public d0(Object obj, int i, byte b) {
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
                f0 f0Var = (f0) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (aicomposetoneexample != null) {
                    f0Var.d2[i] = aicomposetoneexample;
                    f0Var.b2.O(true);
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                l9c l9cVar = (l9c) obj2;
                uqc uqcVar = (uqc) ((bn0) obj3).c;
                if (i == 0) {
                    l9cVar.V();
                    b bVar = uqcVar.G0;
                    if (bVar != null && !bVar.c.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        for (int i2 = 0; i2 < uqcVar.G0.c.size(); i2++) {
                            arrayList.add(j2c.i((TL_wallet.walletTransaction) uqcVar.G0.c.get(i2), uqcVar.G0.a));
                        }
                    }
                    b bVar2 = uqcVar.G0;
                    if (bVar2 != null && (bVar2.k || !bVar2.h)) {
                        arrayList.add(b8c.q(-1, 37));
                        arrayList.add(b8c.q(-2, 37));
                        arrayList.add(b8c.q(-3, 37));
                    }
                    l9cVar.U();
                    if (z) {
                        long f = uqcVar.getMessagesController().k4.x0.f();
                        if (f > 0) {
                            arrayList.add(b8c.C(ob6.V(null, null, 2131742748, c.w(f, false))));
                            return;
                        }
                        return;
                    }
                    return;
                }
                x25 x25Var = uqcVar.H0;
                if (x25Var != null) {
                    ArrayList arrayList2 = x25Var.a;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj4 = arrayList2.get(i3);
                        i3++;
                        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj4;
                        if (uqcVar.l0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(uqcVar.l0))) {
                            if (nftitem.gift != null) {
                                wsc wscVar = uqcVar.k0;
                                int i4 = jsc.b;
                                b8c K = b8c.K(jsc.class);
                                K.v = 1;
                                K.H = nftitem;
                                K.I = wscVar;
                                arrayList.add(K);
                            } else {
                                int i5 = ol2.b;
                                b8c K2 = b8c.K(ol2.class);
                                K2.H = nftitem;
                                K2.v = 1;
                                arrayList.add(K2);
                            }
                        }
                    }
                    if (arrayList.isEmpty() && !uqcVar.l0.isEmpty()) {
                        x25 x25Var2 = uqcVar.H0;
                        if (!x25Var2.i && x25Var2.g) {
                            arrayList.add(b8c.r(ob6.M0(2131747898, null)));
                        }
                    }
                    x25 x25Var3 = uqcVar.H0;
                    if (x25Var3.i) {
                        for (int i6 = 0; i6 < 3; i6++) {
                            int i7 = ql2.b;
                            b8c K3 = b8c.K(ql2.class);
                            K3.v = 1;
                            K3.d = (-1) - i6;
                            arrayList.add(K3);
                        }
                        return;
                    } else if (x25Var3.m != null) {
                        arrayList.add(b8c.e(-10001, ob6.M0(2131745779, null)));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
