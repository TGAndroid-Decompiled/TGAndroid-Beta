package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class ja implements Runnable {
    public final int f24834a = 0;
    public final int f24835b;
    public final int f24836c;
    public final Object d;
    public final Object f24837e;
    public final Object f24838f;
    public final Object h;
    public final Object f24839n;

    public ja(ma maVar, int[] iArr, la laVar, TLRPC.messages_Messages messages_messages, ArrayList arrayList, int i7, int i10) {
        this.d = maVar;
        this.f24837e = iArr;
        this.f24838f = laVar;
        this.h = messages_messages;
        this.f24839n = arrayList;
        this.f24835b = i7;
        this.f24836c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        int i7 = this.f24834a;
        int i10 = this.f24835b;
        Object obj = this.f24839n;
        int i11 = this.f24836c;
        Object obj2 = this.h;
        Object obj3 = this.f24838f;
        Object obj4 = this.f24837e;
        Object obj5 = this.d;
        int i12 = 2;
        switch (i7) {
            case 0:
                la laVar = (la) obj3;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj2;
                ArrayList arrayList = (ArrayList) obj;
                int i13 = ((ma) obj5).f25550a;
                int i14 = ((int[]) obj4)[0];
                int i15 = laVar.d;
                HashMap hashMap = laVar.f25342b;
                if (i14 == i15) {
                    laVar.d = -1;
                    laVar.f25345f = false;
                    laVar.f25346g = messages_messages.next_rate;
                    int size = arrayList.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj6 = arrayList.get(i16);
                        i16++;
                        fj fjVar = (fj) obj6;
                        int i17 = i12;
                        ka kaVar = new ka(fjVar.f23968k);
                        Integer num = (Integer) hashMap.get(kaVar);
                        if (num == null) {
                            int i18 = laVar.f25348j;
                            laVar.f25348j = i18 - 1;
                            num = Integer.valueOf(i18);
                            hashMap.put(kaVar, num);
                            laVar.f25341a.add(fjVar);
                        }
                        TLRPC.Message message = fjVar.f23968k;
                        message.realId = message.f28426id;
                        message.f28426id = num.intValue();
                        i12 = i17;
                    }
                    int i19 = i12;
                    if (!messages_messages.messages.isEmpty()) {
                        TLRPC.Message message2 = (TLRPC.Message) i5.c.h(1, messages_messages.messages);
                        laVar.h = message2.realId;
                        laVar.f25347i = message2.peer_id;
                    }
                    tr.a0(i13).m1(messages_messages.users, messages_messages.chats, true, true);
                    mp.u1(i13).f4(messages_messages.users, false);
                    mp.u1(i13).Z3(messages_messages.chats, false);
                    if (messages_messages.messages.size() < 21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    laVar.f25352n = z10;
                    laVar.f25351m = Math.max(messages_messages.count, messages_messages.messages.size());
                    ks f10 = ks.f(i13);
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
                    ks f11 = ks.f(i13);
                    Integer valueOf5 = Integer.valueOf(i10);
                    Integer valueOf6 = Integer.valueOf(laVar.f25351m);
                    Boolean valueOf7 = Boolean.valueOf(laVar.f25352n);
                    Integer valueOf8 = Integer.valueOf(laVar.b());
                    Integer valueOf9 = Integer.valueOf(laVar.f25350l);
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
                ri riVar = (ri) obj5;
                boolean[] zArr = (boolean[]) obj4;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                Runnable runnable = (Runnable) obj;
                long[] jArr = riVar.Y;
                ArrayList[] arrayListArr = riVar.H;
                if (!zArr[0]) {
                    zArr[0] = true;
                    riVar.j1(stickerSet.f28432id, false);
                    stickerSet.archived = false;
                    int i20 = this.f24835b;
                    arrayListArr[i20].add(i11, tL_messages_stickerSet);
                    riVar.J.k(tL_messages_stickerSet, stickerSet.f28432id);
                    riVar.K.k(tL_messages_stickerSet, stickerSet.f28432id);
                    String str = stickerSet.short_name;
                    if (str != null) {
                        riVar.O.put(str.toLowerCase(), tL_messages_stickerSet);
                    }
                    riVar.U.l(stickerSet.f28432id);
                    long s5 = ri.s(arrayListArr[i20]);
                    jArr[i20] = s5;
                    riVar.O1(i20, riVar.Z[i20], s5, arrayListArr[i20]);
                    if (runnable != null) {
                        runnable.run();
                    }
                    riVar.getNotificationCenter().k(60, Integer.valueOf(i20), Boolean.TRUE);
                    return;
                }
                return;
            default:
                p4.v vVar = (p4.v) obj4;
                p4.k1 k1Var = (p4.k1) obj3;
                p4.d0 d0Var = (p4.d0) obj2;
                p4.c1 c1Var = (p4.c1) obj;
                ab.c0 c0Var = ((p4.e1) obj5).f55210b;
                if (c0Var.A(vVar)) {
                    if (k1Var != null) {
                        if (!c0Var.F(vVar, k1Var)) {
                            p4.e1.r1(d0Var, vVar, i10, new p4.o1(-4));
                            return;
                        }
                    } else if (!c0Var.D(vVar, i11)) {
                        p4.e1.r1(d0Var, vVar, i10, new p4.o1(-4));
                        return;
                    }
                    c1Var.k(d0Var, vVar, i10);
                    return;
                }
                return;
        }
    }

    public ja(ri riVar, boolean[] zArr, TLRPC.StickerSet stickerSet, int i7, int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = riVar;
        this.f24837e = zArr;
        this.f24838f = stickerSet;
        this.f24835b = i7;
        this.f24836c = i10;
        this.h = tL_messages_stickerSet;
        this.f24839n = runnable;
    }

    public ja(p4.e1 e1Var, p4.v vVar, p4.k1 k1Var, p4.d0 d0Var, int i7, int i10, p4.c1 c1Var) {
        this.d = e1Var;
        this.f24837e = vVar;
        this.f24838f = k1Var;
        this.h = d0Var;
        this.f24835b = i7;
        this.f24836c = i10;
        this.f24839n = c1Var;
    }
}
