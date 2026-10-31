package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class fo implements RequestDelegate {
    public final int f15609a;
    public final int f15610b;
    public final Object f15611c;
    public final Object d;

    public fo(Object obj, int i10, Object obj2, int i11) {
        this.f15609a = i11;
        this.f15611c = obj;
        this.f15610b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15609a) {
            case 0:
                vp vpVar = (vp) this.f15611c;
                String str = (String) this.d;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    boolean z10 = v2.f18448a;
                    int i10 = this.f15610b;
                    if (z10) {
                        f8.b("account " + vpVar.currentAccount + " registered for push, push type: " + i10);
                    }
                    vpVar.getUserConfig().d = true;
                    tz.f18147g = str;
                    tz.f18144f = i10;
                    vpVar.getUserConfig().v(false);
                }
                i0.g3(new eo(vpVar, 9));
                return;
            case 1:
                m7 m7Var = (m7) this.f15611c;
                l7 l7Var = (l7) this.d;
                m7Var.f16928z0 = false;
                boolean z11 = tLObject instanceof Vector;
                int i11 = this.f15610b;
                if (z11) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        if (m7Var.f16911q0 == null) {
                            m7Var.f16911q0 = new HashMap();
                        }
                        for (int i12 = 0; i12 < vector.objects.size(); i12++) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i12);
                            m7Var.f16911q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    m7Var.s(i11);
                    return;
                } else if (tL_error != null) {
                    if (!tL_error.text.equals("FILE_TOKEN_INVALID") && !tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                        m7Var.j(0, false);
                        return;
                    }
                    m7Var.f16919u0 = false;
                    m7Var.e(l7Var, false, false);
                    m7Var.s(i11);
                    return;
                } else {
                    return;
                }
            case 2:
                i0.g3(new o7((ui) this.f15611c, (TLRPC.StickerSet) this.d, this.f15610b, 9));
                return;
            case 3:
                ui uiVar = (ui) this.f15611c;
                q20 q20Var = (q20) this.d;
                boolean z12 = tLObject instanceof TLRPC.TL_messages_stickerSet;
                int i13 = this.f15610b;
                if (z12) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((TLRPC.TL_messages_stickerSet) tLObject);
                    uiVar.z1(i13, arrayList, false, (int) (System.currentTimeMillis() / 1000), ui.q(arrayList), new pf(q20Var, 4));
                    return;
                }
                uiVar.z1(i13, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new pf(q20Var, 5));
                return;
            default:
                i0.g3(new cg((vp) this.f15611c, tLObject, this.f15610b, (xo) this.d));
                return;
        }
    }

    public fo(ui uiVar, TLRPC.StickerSet stickerSet, int i10) {
        this.f15609a = 2;
        this.f15611c = uiVar;
        this.d = stickerSet;
        this.f15610b = i10;
    }
}
