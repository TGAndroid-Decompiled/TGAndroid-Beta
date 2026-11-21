package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class vn implements RequestDelegate {
    public final int f27484a;
    public final int f27485b;
    public final Object f27486c;
    public final Object d;

    public vn(Object obj, int i7, Object obj2, int i10) {
        this.f27484a = i10;
        this.f27486c = obj;
        this.f27485b = i7;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27484a) {
            case 0:
                mp mpVar = (mp) this.f27486c;
                String str = (String) this.d;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    boolean z10 = s2.f26749a;
                    int i7 = this.f27485b;
                    if (z10) {
                        a8.b("account " + mpVar.currentAccount + " registered for push, push type: " + i7);
                    }
                    mpVar.getUserConfig().d = true;
                    bz.f23190g = str;
                    bz.f23187f = i7;
                    mpVar.getUserConfig().v(false);
                }
                g0.g3(new qn(mpVar, 9));
                return;
            case 1:
                i7 i7Var = (i7) this.f27486c;
                h7 h7Var = (h7) this.d;
                i7Var.f24671z0 = false;
                boolean z11 = tLObject instanceof Vector;
                int i10 = this.f27485b;
                if (z11) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        if (i7Var.f24654q0 == null) {
                            i7Var.f24654q0 = new HashMap();
                        }
                        for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i11);
                            i7Var.f24654q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    i7Var.s(i10);
                    return;
                } else if (tL_error != null) {
                    if (!tL_error.text.equals("FILE_TOKEN_INVALID") && !tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                        i7Var.j(0, false);
                        return;
                    }
                    i7Var.f24662u0 = false;
                    i7Var.e(h7Var, false, false);
                    i7Var.s(i10);
                    return;
                } else {
                    return;
                }
            case 2:
                g0.g3(new l7((ri) this.f27486c, (TLRPC.StickerSet) this.d, this.f27485b, 9));
                return;
            case 3:
                ri riVar = (ri) this.f27486c;
                x10 x10Var = (x10) this.d;
                boolean z12 = tLObject instanceof TLRPC.TL_messages_stickerSet;
                int i12 = this.f27485b;
                if (z12) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((TLRPC.TL_messages_stickerSet) tLObject);
                    riVar.C1(i12, arrayList, false, (int) (System.currentTimeMillis() / 1000), ri.s(arrayList), new fg(x10Var, 3));
                    return;
                }
                riVar.C1(i12, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new fg(x10Var, 4));
                return;
            default:
                g0.g3(new dg((mp) this.f27486c, tLObject, this.f27485b, (oo) this.d));
                return;
        }
    }

    public vn(ri riVar, TLRPC.StickerSet stickerSet, int i7) {
        this.f27484a = 2;
        this.f27486c = riVar;
        this.d = stickerSet;
        this.f27485b = i7;
    }
}
