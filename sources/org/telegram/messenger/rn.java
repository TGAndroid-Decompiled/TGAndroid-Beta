package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class rn implements RequestDelegate {
    public final int f25190a;
    public final int f25191b;
    public final Object f25192c;
    public final Object d;

    public rn(Object obj, int i3, Object obj2, int i10) {
        this.f25190a = i10;
        this.f25192c = obj;
        this.f25191b = i3;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25190a) {
            case 0:
                hp hpVar = (hp) this.f25192c;
                String str = (String) this.d;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    boolean z10 = r2.f25040a;
                    int i3 = this.f25191b;
                    if (z10) {
                        a8.b("account " + hpVar.currentAccount + " registered for push, push type: " + i3);
                    }
                    hpVar.getUserConfig().d = true;
                    az.f21629g = str;
                    az.f21626f = i3;
                    hpVar.getUserConfig().v(false);
                }
                g0.h3(new mj(hpVar, 4));
                return;
            case 1:
                i7 i7Var = (i7) this.f25192c;
                h7 h7Var = (h7) this.d;
                i7Var.f23517z0 = false;
                boolean z11 = tLObject instanceof Vector;
                int i10 = this.f25191b;
                if (z11) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        if (i7Var.f23500q0 == null) {
                            i7Var.f23500q0 = new HashMap();
                        }
                        for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i11);
                            i7Var.f23500q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    i7Var.s(i10);
                    return;
                } else if (tL_error != null) {
                    if (!tL_error.text.equals("FILE_TOKEN_INVALID") && !tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                        i7Var.j(0, false);
                        return;
                    }
                    i7Var.f23508u0 = false;
                    i7Var.e(h7Var, false, false);
                    i7Var.s(i10);
                    return;
                } else {
                    return;
                }
            case 2:
                g0.h3(new k7((li) this.f25192c, (TLRPC.StickerSet) this.d, this.f25191b, 9));
                return;
            case 3:
                li liVar = (li) this.f25192c;
                u10 u10Var = (u10) this.d;
                boolean z12 = tLObject instanceof TLRPC.TL_messages_stickerSet;
                int i12 = this.f25191b;
                if (z12) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((TLRPC.TL_messages_stickerSet) tLObject);
                    liVar.z1(i12, arrayList, false, (int) (System.currentTimeMillis() / 1000), li.q(arrayList), new jf(u10Var, 4));
                    return;
                }
                liVar.z1(i12, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new jf(u10Var, 5));
                return;
            default:
                g0.h3(new vf((hp) this.f25192c, tLObject, this.f25191b, (jo) this.d));
                return;
        }
    }

    public rn(li liVar, TLRPC.StickerSet stickerSet, int i3) {
        this.f25190a = 2;
        this.f25192c = liVar;
        this.d = stickerSet;
        this.f25191b = i3;
    }
}
