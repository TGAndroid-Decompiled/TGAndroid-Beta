package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class bo implements RequestDelegate {
    public final int f21679a;
    public final int f21680b;
    public final Object f21681c;
    public final Object d;

    public bo(Object obj, int i7, Object obj2, int i10) {
        this.f21679a = i10;
        this.f21681c = obj;
        this.f21680b = i7;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21679a) {
            case 0:
                qp qpVar = (qp) this.f21681c;
                String str = (String) this.d;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    boolean z9 = r2.f25199a;
                    int i7 = this.f21680b;
                    if (z9) {
                        a8.b("account " + qpVar.currentAccount + " registered for push, push type: " + i7);
                    }
                    qpVar.getUserConfig().d = true;
                    iz.f23381g = str;
                    iz.f23378f = i7;
                    qpVar.getUserConfig().v(false);
                }
                g0.h3(new wj(qpVar, 4));
                return;
            case 1:
                i7 i7Var = (i7) this.f21681c;
                h7 h7Var = (h7) this.d;
                i7Var.f23134z0 = false;
                boolean z10 = tLObject instanceof Vector;
                int i10 = this.f21680b;
                if (z10) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        if (i7Var.f23117q0 == null) {
                            i7Var.f23117q0 = new HashMap();
                        }
                        for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i11);
                            i7Var.f23117q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    i7Var.s(i10);
                    return;
                } else if (tL_error != null) {
                    if (!tL_error.text.equals("FILE_TOKEN_INVALID") && !tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                        i7Var.j(0, false);
                        return;
                    }
                    i7Var.f23125u0 = false;
                    i7Var.e(h7Var, false, false);
                    i7Var.s(i10);
                    return;
                } else {
                    return;
                }
            case 2:
                g0.h3(new k7((ui) this.f21681c, (TLRPC.StickerSet) this.d, this.f21680b, 9));
                return;
            case 3:
                ui uiVar = (ui) this.f21681c;
                c20 c20Var = (c20) this.d;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_stickerSet;
                int i12 = this.f21680b;
                if (z11) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((TLRPC.TL_messages_stickerSet) tLObject);
                    uiVar.z1(i12, arrayList, false, (int) (System.currentTimeMillis() / 1000), ui.q(arrayList), new rf(c20Var, 4));
                    return;
                }
                uiVar.z1(i12, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new rf(c20Var, 5));
                return;
            default:
                g0.h3(new dg((qp) this.f21681c, tLObject, this.f21680b, (so) this.d));
                return;
        }
    }

    public bo(ui uiVar, TLRPC.StickerSet stickerSet, int i7) {
        this.f21679a = 2;
        this.f21681c = uiVar;
        this.d = stickerSet;
        this.f21680b = i7;
    }
}
