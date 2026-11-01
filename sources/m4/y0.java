package m4;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.at;
import org.telegram.messenger.is;
import org.telegram.messenger.kj;
import org.telegram.messenger.na;
import org.telegram.messenger.oa;
import org.telegram.messenger.pa;
import org.telegram.messenger.vi;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
public final class y0 implements Runnable {
    public final int f12996a = 0;
    public final int f12997b;
    public final int f12998c;
    public final Object d;
    public final Object e;
    public final Object f12999f;
    public final Object h;
    public final Object f13000n;

    public y0(j1 j1Var, w wVar, p1 p1Var, f0 f0Var, int i10, int i11, h1 h1Var) {
        this.d = j1Var;
        this.e = wVar;
        this.f12999f = p1Var;
        this.h = f0Var;
        this.f12997b = i10;
        this.f12998c = i11;
        this.f13000n = h1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.f12996a;
        int i11 = this.f12997b;
        Object obj = this.f13000n;
        Object obj2 = this.h;
        int i12 = this.f12998c;
        Object obj3 = this.f12999f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        int i13 = 2;
        switch (i10) {
            case 0:
                w wVar = (w) obj4;
                p1 p1Var = (p1) obj3;
                f0 f0Var = (f0) obj2;
                h1 h1Var = (h1) obj;
                xa.n nVar = ((j1) obj5).f12790b;
                if (nVar.L(wVar)) {
                    if (p1Var != null) {
                        if (!nVar.O(wVar, p1Var)) {
                            j1.R0(f0Var, wVar, i11, new t1(-4));
                            return;
                        }
                    } else if (!nVar.N(wVar, i12)) {
                        j1.R0(f0Var, wVar, i11, new t1(-4));
                        return;
                    }
                    h1Var.f(f0Var, wVar, i11);
                    return;
                }
                return;
            case 1:
                oa oaVar = (oa) obj3;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj2;
                ArrayList arrayList = (ArrayList) obj;
                int i14 = ((pa) obj5).f17577a;
                int i15 = ((int[]) obj4)[0];
                int i16 = oaVar.d;
                HashMap hashMap = oaVar.f17406b;
                if (i15 == i16) {
                    oaVar.d = -1;
                    oaVar.f17408f = false;
                    oaVar.f17409g = messages_messages.next_rate;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj6 = arrayList.get(i17);
                        i17++;
                        kj kjVar = (kj) obj6;
                        int i18 = i13;
                        na naVar = new na(kjVar.f16690k);
                        Integer num = (Integer) hashMap.get(naVar);
                        if (num == null) {
                            int i19 = oaVar.f17411j;
                            oaVar.f17411j = i19 - 1;
                            num = Integer.valueOf(i19);
                            hashMap.put(naVar, num);
                            oaVar.f17405a.add(kjVar);
                        }
                        TLRPC.Message message = kjVar.f16690k;
                        message.realId = message.f19815id;
                        message.f19815id = num.intValue();
                        i13 = i18;
                    }
                    int i20 = i13;
                    if (!messages_messages.messages.isEmpty()) {
                        TLRPC.Message message2 = (TLRPC.Message) i0.a.g(1, messages_messages.messages);
                        oaVar.h = message2.realId;
                        oaVar.f17410i = message2.peer_id;
                    }
                    is.a0(i14).m1(messages_messages.users, messages_messages.chats, true, true);
                    wp.r1(i14).V3(messages_messages.users, false);
                    wp.r1(i14).P3(messages_messages.chats, false);
                    if (messages_messages.messages.size() < 21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    oaVar.f17415n = z10;
                    oaVar.f17414m = Math.max(messages_messages.count, messages_messages.messages.size());
                    at f7 = at.f(i14);
                    Integer valueOf = Integer.valueOf(arrayList.size());
                    Integer valueOf2 = Integer.valueOf(i20);
                    Integer valueOf3 = Integer.valueOf(i11);
                    Integer valueOf4 = Integer.valueOf(i12);
                    Object[] objArr = new Object[15];
                    objArr[0] = 0L;
                    objArr[1] = valueOf;
                    objArr[i20] = arrayList;
                    objArr[3] = Boolean.FALSE;
                    objArr[4] = 0;
                    objArr[5] = 0;
                    objArr[6] = 0;
                    objArr[7] = 0;
                    objArr[8] = valueOf2;
                    objArr[9] = Boolean.TRUE;
                    objArr[10] = valueOf3;
                    objArr[11] = valueOf4;
                    objArr[12] = 0;
                    objArr[13] = 0;
                    objArr[14] = 7;
                    f7.k(14, objArr);
                    at f10 = at.f(i14);
                    Integer valueOf5 = Integer.valueOf(i11);
                    Integer valueOf6 = Integer.valueOf(oaVar.f17414m);
                    Boolean valueOf7 = Boolean.valueOf(oaVar.f17415n);
                    Integer valueOf8 = Integer.valueOf(oaVar.b());
                    Integer valueOf9 = Integer.valueOf(oaVar.f17413l);
                    Object[] objArr2 = new Object[6];
                    objArr2[0] = valueOf5;
                    objArr2[1] = valueOf6;
                    objArr2[i20] = valueOf7;
                    objArr2[3] = valueOf8;
                    objArr2[4] = valueOf9;
                    objArr2[5] = 0;
                    f10.k(71, objArr2);
                    return;
                }
                return;
            default:
                vi viVar = (vi) obj5;
                boolean[] zArr = (boolean[]) obj4;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                Runnable runnable = (Runnable) obj;
                long[] jArr = viVar.X;
                ArrayList[] arrayListArr = viVar.G;
                if (!zArr[0]) {
                    zArr[0] = true;
                    viVar.g1(stickerSet.f19821id, false);
                    stickerSet.archived = false;
                    int i21 = this.f12997b;
                    arrayListArr[i21].add(i12, tL_messages_stickerSet);
                    viVar.I.k(tL_messages_stickerSet, stickerSet.f19821id);
                    viVar.J.k(tL_messages_stickerSet, stickerSet.f19821id);
                    String str = stickerSet.short_name;
                    if (str != null) {
                        viVar.N.put(str.toLowerCase(), tL_messages_stickerSet);
                    }
                    viVar.T.l(stickerSet.f19821id);
                    long q6 = vi.q(arrayListArr[i21]);
                    jArr[i21] = q6;
                    viVar.J1(i21, viVar.Y[i21], q6, arrayListArr[i21]);
                    if (runnable != null) {
                        runnable.run();
                    }
                    viVar.getNotificationCenter().k(60, Integer.valueOf(i21), Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public y0(pa paVar, int[] iArr, oa oaVar, TLRPC.messages_Messages messages_messages, ArrayList arrayList, int i10, int i11) {
        this.d = paVar;
        this.e = iArr;
        this.f12999f = oaVar;
        this.h = messages_messages;
        this.f13000n = arrayList;
        this.f12997b = i10;
        this.f12998c = i11;
    }

    public y0(vi viVar, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = viVar;
        this.e = zArr;
        this.f12999f = stickerSet;
        this.f12997b = i10;
        this.f12998c = i11;
        this.h = tL_messages_stickerSet;
        this.f13000n = runnable;
    }
}
