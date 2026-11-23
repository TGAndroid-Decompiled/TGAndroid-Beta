package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class vn implements RequestDelegate {
    public final int f27552a;
    public final int f27553b;
    public final Object f27554c;
    public final Object d;

    public vn(Object obj, int i7, Object obj2, int i10) {
        this.f27552a = i10;
        this.f27554c = obj;
        this.f27553b = i7;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27552a) {
            case 0:
                mp mpVar = (mp) this.f27554c;
                String str = (String) this.d;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    boolean z10 = s2.f26829a;
                    int i7 = this.f27553b;
                    if (z10) {
                        a8.b("account " + mpVar.currentAccount + " registered for push, push type: " + i7);
                    }
                    mpVar.getUserConfig().d = true;
                    bz.f23287g = str;
                    bz.f23284f = i7;
                    mpVar.getUserConfig().v(false);
                }
                g0.g3(new qn(mpVar, 9));
                return;
            case 1:
                i7 i7Var = (i7) this.f27554c;
                h7 h7Var = (h7) this.d;
                i7Var.f24769z0 = false;
                boolean z11 = tLObject instanceof Vector;
                int i10 = this.f27553b;
                if (z11) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        if (i7Var.f24752q0 == null) {
                            i7Var.f24752q0 = new HashMap();
                        }
                        for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i11);
                            i7Var.f24752q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    i7Var.s(i10);
                    return;
                } else if (tL_error != null) {
                    if (!tL_error.text.equals("FILE_TOKEN_INVALID") && !tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                        i7Var.j(0, false);
                        return;
                    }
                    i7Var.f24760u0 = false;
                    i7Var.e(h7Var, false, false);
                    i7Var.s(i10);
                    return;
                } else {
                    return;
                }
            case 2:
                g0.g3(new l7((ri) this.f27554c, (TLRPC.StickerSet) this.d, this.f27553b, 9));
                return;
            case 3:
                ri riVar = (ri) this.f27554c;
                w10 w10Var = (w10) this.d;
                boolean z12 = tLObject instanceof TLRPC.TL_messages_stickerSet;
                int i12 = this.f27553b;
                if (z12) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((TLRPC.TL_messages_stickerSet) tLObject);
                    riVar.C1(i12, arrayList, false, (int) (System.currentTimeMillis() / 1000), ri.s(arrayList), new fg(w10Var, 3));
                    return;
                }
                riVar.C1(i12, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new fg(w10Var, 4));
                return;
            default:
                g0.g3(new dg((mp) this.f27554c, tLObject, this.f27553b, (oo) this.d));
                return;
        }
    }

    public vn(ri riVar, TLRPC.StickerSet stickerSet, int i7) {
        this.f27552a = 2;
        this.f27554c = riVar;
        this.d = stickerSet;
        this.f27553b = i7;
    }
}
