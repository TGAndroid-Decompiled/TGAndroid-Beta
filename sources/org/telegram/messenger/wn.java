package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class wn implements RequestDelegate {
    public final int f27776a;
    public final int f27777b;
    public final Object f27778c;
    public final Object d;

    public wn(Object obj, int i7, Object obj2, int i10) {
        this.f27776a = i10;
        this.f27778c = obj;
        this.f27777b = i7;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27776a) {
            case 0:
                np npVar = (np) this.f27778c;
                String str = (String) this.d;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    boolean z10 = s2.f26730a;
                    int i7 = this.f27777b;
                    if (z10) {
                        a8.b("account " + npVar.currentAccount + " registered for push, push type: " + i7);
                    }
                    npVar.getUserConfig().d = true;
                    cz.f23407g = str;
                    cz.f23404f = i7;
                    npVar.getUserConfig().v(false);
                }
                g0.g3(new rn(npVar, 9));
                return;
            case 1:
                i7 i7Var = (i7) this.f27778c;
                h7 h7Var = (h7) this.d;
                i7Var.f24681z0 = false;
                boolean z11 = tLObject instanceof Vector;
                int i10 = this.f27777b;
                if (z11) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        if (i7Var.f24664q0 == null) {
                            i7Var.f24664q0 = new HashMap();
                        }
                        for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i11);
                            i7Var.f24664q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    i7Var.s(i10);
                    return;
                } else if (tL_error != null) {
                    if (!tL_error.text.equals("FILE_TOKEN_INVALID") && !tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                        i7Var.j(0, false);
                        return;
                    }
                    i7Var.f24672u0 = false;
                    i7Var.e(h7Var, false, false);
                    i7Var.s(i10);
                    return;
                } else {
                    return;
                }
            case 2:
                g0.g3(new l7((si) this.f27778c, (TLRPC.StickerSet) this.d, this.f27777b, 9));
                return;
            case 3:
                si siVar = (si) this.f27778c;
                y10 y10Var = (y10) this.d;
                boolean z12 = tLObject instanceof TLRPC.TL_messages_stickerSet;
                int i12 = this.f27777b;
                if (z12) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((TLRPC.TL_messages_stickerSet) tLObject);
                    siVar.C1(i12, arrayList, false, (int) (System.currentTimeMillis() / 1000), si.s(arrayList), new gg(y10Var, 3));
                    return;
                }
                siVar.C1(i12, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new gg(y10Var, 4));
                return;
            default:
                g0.g3(new eg((np) this.f27778c, tLObject, this.f27777b, (po) this.d));
                return;
        }
    }

    public wn(si siVar, TLRPC.StickerSet stickerSet, int i7) {
        this.f27776a = 2;
        this.f27778c = siVar;
        this.d = stickerSet;
        this.f27777b = i7;
    }
}
