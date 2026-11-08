package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class bo implements RequestDelegate {
    public final int f21714a;
    public final int f21715b;
    public final Object f21716c;
    public final Object d;

    public bo(Object obj, int i7, Object obj2, int i10) {
        this.f21714a = i10;
        this.f21716c = obj;
        this.f21715b = i7;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21714a) {
            case 0:
                qp qpVar = (qp) this.f21716c;
                String str = (String) this.d;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    boolean z9 = r2.f25212a;
                    int i7 = this.f21715b;
                    if (z9) {
                        a8.b("account " + qpVar.currentAccount + " registered for push, push type: " + i7);
                    }
                    qpVar.getUserConfig().d = true;
                    iz.f23402g = str;
                    iz.f23399f = i7;
                    qpVar.getUserConfig().v(false);
                }
                g0.h3(new vj(qpVar, 4));
                return;
            case 1:
                i7 i7Var = (i7) this.f21716c;
                h7 h7Var = (h7) this.d;
                i7Var.f23124z0 = false;
                boolean z10 = tLObject instanceof Vector;
                int i10 = this.f21715b;
                if (z10) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        if (i7Var.f23107q0 == null) {
                            i7Var.f23107q0 = new HashMap();
                        }
                        for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i11);
                            i7Var.f23107q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    i7Var.s(i10);
                    return;
                } else if (tL_error != null) {
                    if (!tL_error.text.equals("FILE_TOKEN_INVALID") && !tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                        i7Var.j(0, false);
                        return;
                    }
                    i7Var.f23115u0 = false;
                    i7Var.e(h7Var, false, false);
                    i7Var.s(i10);
                    return;
                } else {
                    return;
                }
            case 2:
                g0.h3(new l7((ui) this.f21716c, (TLRPC.StickerSet) this.d, this.f21715b, 9));
                return;
            case 3:
                ui uiVar = (ui) this.f21716c;
                c20 c20Var = (c20) this.d;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_stickerSet;
                int i12 = this.f21715b;
                if (z11) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((TLRPC.TL_messages_stickerSet) tLObject);
                    uiVar.z1(i12, arrayList, false, (int) (System.currentTimeMillis() / 1000), ui.q(arrayList), new rf(c20Var, 4));
                    return;
                }
                uiVar.z1(i12, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new rf(c20Var, 5));
                return;
            default:
                g0.h3(new dg((qp) this.f21716c, tLObject, this.f21715b, (so) this.d));
                return;
        }
    }

    public bo(ui uiVar, TLRPC.StickerSet stickerSet, int i7) {
        this.f21714a = 2;
        this.f21716c = uiVar;
        this.d = stickerSet;
        this.f21715b = i7;
    }
}
