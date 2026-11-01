package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class go implements RequestDelegate {
    public final int f15950a;
    public final int f15951b;
    public final Object f15952c;
    public final Object d;

    public go(Object obj, int i10, Object obj2, int i11) {
        this.f15950a = i11;
        this.f15952c = obj;
        this.f15951b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15950a) {
            case 0:
                wp wpVar = (wp) this.f15952c;
                String str = (String) this.d;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    boolean z10 = v2.f18578a;
                    int i10 = this.f15951b;
                    if (z10) {
                        f8.b("account " + wpVar.currentAccount + " registered for push, push type: " + i10);
                    }
                    wpVar.getUserConfig().d = true;
                    uz.f18516g = str;
                    uz.f18513f = i10;
                    wpVar.getUserConfig().v(false);
                }
                i0.g3(new fo(wpVar, 9));
                return;
            case 1:
                m7 m7Var = (m7) this.f15952c;
                l7 l7Var = (l7) this.d;
                m7Var.f17098z0 = false;
                boolean z11 = tLObject instanceof Vector;
                int i11 = this.f15951b;
                if (z11) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        if (m7Var.f17081q0 == null) {
                            m7Var.f17081q0 = new HashMap();
                        }
                        for (int i12 = 0; i12 < vector.objects.size(); i12++) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i12);
                            m7Var.f17081q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    m7Var.s(i11);
                    return;
                } else if (tL_error != null) {
                    if (!tL_error.text.equals("FILE_TOKEN_INVALID") && !tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                        m7Var.j(0, false);
                        return;
                    }
                    m7Var.f17089u0 = false;
                    m7Var.e(l7Var, false, false);
                    m7Var.s(i11);
                    return;
                } else {
                    return;
                }
            case 2:
                i0.g3(new o7((vi) this.f15952c, (TLRPC.StickerSet) this.d, this.f15951b, 9));
                return;
            case 3:
                vi viVar = (vi) this.f15952c;
                r20 r20Var = (r20) this.d;
                boolean z12 = tLObject instanceof TLRPC.TL_messages_stickerSet;
                int i13 = this.f15951b;
                if (z12) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((TLRPC.TL_messages_stickerSet) tLObject);
                    viVar.z1(i13, arrayList, false, (int) (System.currentTimeMillis() / 1000), vi.q(arrayList), new qf(r20Var, 4));
                    return;
                }
                viVar.z1(i13, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new qf(r20Var, 5));
                return;
            default:
                i0.g3(new dg((wp) this.f15952c, tLObject, this.f15951b, (yo) this.d));
                return;
        }
    }

    public go(vi viVar, TLRPC.StickerSet stickerSet, int i10) {
        this.f15950a = 2;
        this.f15952c = viVar;
        this.d = stickerSet;
        this.f15951b = i10;
    }
}
