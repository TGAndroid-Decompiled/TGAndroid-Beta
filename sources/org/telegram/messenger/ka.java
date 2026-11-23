package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class ka implements Runnable {
    public final int f25046a = 0;
    public final int f25047b;
    public final int f25048c;
    public final Object d;
    public final Object f25049e;
    public final Object f25050f;
    public final Object h;
    public final Object f25051n;

    public ka(na naVar, int[] iArr, ma maVar, TLRPC.messages_Messages messages_messages, ArrayList arrayList, int i7, int i10) {
        this.d = naVar;
        this.f25049e = iArr;
        this.f25050f = maVar;
        this.h = messages_messages;
        this.f25051n = arrayList;
        this.f25047b = i7;
        this.f25048c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        int i7 = this.f25046a;
        int i10 = this.f25047b;
        Object obj = this.f25051n;
        int i11 = this.f25048c;
        Object obj2 = this.h;
        Object obj3 = this.f25050f;
        Object obj4 = this.f25049e;
        Object obj5 = this.d;
        int i12 = 2;
        switch (i7) {
            case 0:
                ma maVar = (ma) obj3;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj2;
                ArrayList arrayList = (ArrayList) obj;
                int i13 = ((na) obj5).f25747a;
                int i14 = ((int[]) obj4)[0];
                int i15 = maVar.d;
                HashMap hashMap = maVar.f25546b;
                if (i14 == i15) {
                    maVar.d = -1;
                    maVar.f25549f = false;
                    maVar.f25550g = messages_messages.next_rate;
                    int size = arrayList.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj6 = arrayList.get(i16);
                        i16++;
                        gj gjVar = (gj) obj6;
                        int i17 = i12;
                        la laVar = new la(gjVar.f24213k);
                        Integer num = (Integer) hashMap.get(laVar);
                        if (num == null) {
                            int i18 = maVar.f25552j;
                            maVar.f25552j = i18 - 1;
                            num = Integer.valueOf(i18);
                            hashMap.put(laVar, num);
                            maVar.f25545a.add(gjVar);
                        }
                        TLRPC.Message message = gjVar.f24213k;
                        message.realId = message.f28455id;
                        message.f28455id = num.intValue();
                        i12 = i17;
                    }
                    int i19 = i12;
                    if (!messages_messages.messages.isEmpty()) {
                        TLRPC.Message message2 = (TLRPC.Message) i5.c.h(1, messages_messages.messages);
                        maVar.h = message2.realId;
                        maVar.f25551i = message2.peer_id;
                    }
                    ur.a0(i13).m1(messages_messages.users, messages_messages.chats, true, true);
                    np.u1(i13).f4(messages_messages.users, false);
                    np.u1(i13).Z3(messages_messages.chats, false);
                    if (messages_messages.messages.size() < 21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    maVar.f25556n = z10;
                    maVar.f25555m = Math.max(messages_messages.count, messages_messages.messages.size());
                    ls f10 = ls.f(i13);
                    Integer valueOf = Integer.valueOf(arrayList.size());
                    Integer valueOf2 = Integer.valueOf(i19);
                    Integer valueOf3 = Integer.valueOf(i10);
                    Integer valueOf4 = Integer.valueOf(i11);
                    Object[] objArr = new Object[15];
                    objArr[0] = 0L;
                    objArr[1] = valueOf;
                    objArr[i19] = arrayList;
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
                    f10.k(14, objArr);
                    ls f11 = ls.f(i13);
                    Integer valueOf5 = Integer.valueOf(i10);
                    Integer valueOf6 = Integer.valueOf(maVar.f25555m);
                    Boolean valueOf7 = Boolean.valueOf(maVar.f25556n);
                    Integer valueOf8 = Integer.valueOf(maVar.b());
                    Integer valueOf9 = Integer.valueOf(maVar.f25554l);
                    Object[] objArr2 = new Object[6];
                    objArr2[0] = valueOf5;
                    objArr2[1] = valueOf6;
                    objArr2[i19] = valueOf7;
                    objArr2[3] = valueOf8;
                    objArr2[4] = valueOf9;
                    objArr2[5] = 0;
                    f11.k(71, objArr2);
                    return;
                }
                return;
            case 1:
                si siVar = (si) obj5;
                boolean[] zArr = (boolean[]) obj4;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                Runnable runnable = (Runnable) obj;
                long[] jArr = siVar.Y;
                ArrayList[] arrayListArr = siVar.H;
                if (!zArr[0]) {
                    zArr[0] = true;
                    siVar.j1(stickerSet.f28461id, false);
                    stickerSet.archived = false;
                    int i20 = this.f25047b;
                    arrayListArr[i20].add(i11, tL_messages_stickerSet);
                    siVar.J.k(tL_messages_stickerSet, stickerSet.f28461id);
                    siVar.K.k(tL_messages_stickerSet, stickerSet.f28461id);
                    String str = stickerSet.short_name;
                    if (str != null) {
                        siVar.O.put(str.toLowerCase(), tL_messages_stickerSet);
                    }
                    siVar.U.l(stickerSet.f28461id);
                    long s5 = si.s(arrayListArr[i20]);
                    jArr[i20] = s5;
                    siVar.O1(i20, siVar.Z[i20], s5, arrayListArr[i20]);
                    if (runnable != null) {
                        runnable.run();
                    }
                    siVar.getNotificationCenter().k(60, Integer.valueOf(i20), Boolean.TRUE);
                    return;
                }
                return;
            default:
                p4.v vVar = (p4.v) obj4;
                p4.k1 k1Var = (p4.k1) obj3;
                p4.e0 e0Var = (p4.e0) obj2;
                p4.c1 c1Var = (p4.c1) obj;
                ab.c0 c0Var = ((p4.e1) obj5).f55256b;
                if (c0Var.A(vVar)) {
                    if (k1Var != null) {
                        if (!c0Var.F(vVar, k1Var)) {
                            p4.e1.r1(e0Var, vVar, i10, new p4.o1(-4));
                            return;
                        }
                    } else if (!c0Var.D(vVar, i11)) {
                        p4.e1.r1(e0Var, vVar, i10, new p4.o1(-4));
                        return;
                    }
                    c1Var.k(e0Var, vVar, i10);
                    return;
                }
                return;
        }
    }

    public ka(si siVar, boolean[] zArr, TLRPC.StickerSet stickerSet, int i7, int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = siVar;
        this.f25049e = zArr;
        this.f25050f = stickerSet;
        this.f25047b = i7;
        this.f25048c = i10;
        this.h = tL_messages_stickerSet;
        this.f25051n = runnable;
    }

    public ka(p4.e1 e1Var, p4.v vVar, p4.k1 k1Var, p4.e0 e0Var, int i7, int i10, p4.c1 c1Var) {
        this.d = e1Var;
        this.f25049e = vVar;
        this.f25050f = k1Var;
        this.h = e0Var;
        this.f25047b = i7;
        this.f25048c = i10;
        this.f25051n = c1Var;
    }
}
