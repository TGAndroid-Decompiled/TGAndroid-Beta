package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class la implements Runnable {
    public final int f23871a = 0;
    public final int f23872b;
    public final int f23873c;
    public final Object d;
    public final Object f23874e;
    public final Object f23875f;
    public final Object h;
    public final Object f23876n;

    public la(oa oaVar, int[] iArr, na naVar, TLRPC.messages_Messages messages_messages, ArrayList arrayList, int i7, int i10) {
        this.d = oaVar;
        this.f23874e = iArr;
        this.f23875f = naVar;
        this.h = messages_messages;
        this.f23876n = arrayList;
        this.f23872b = i7;
        this.f23873c = i10;
    }

    @Override
    public final void run() {
        boolean z9;
        int i7 = this.f23871a;
        int i10 = this.f23872b;
        Object obj = this.f23876n;
        int i11 = this.f23873c;
        Object obj2 = this.h;
        Object obj3 = this.f23875f;
        Object obj4 = this.f23874e;
        Object obj5 = this.d;
        int i12 = 2;
        switch (i7) {
            case 0:
                na naVar = (na) obj3;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj2;
                ArrayList arrayList = (ArrayList) obj;
                int i13 = ((oa) obj5).f24312a;
                int i14 = ((int[]) obj4)[0];
                int i15 = naVar.d;
                HashMap hashMap = naVar.f24160b;
                if (i14 == i15) {
                    naVar.d = -1;
                    naVar.f24163f = false;
                    naVar.f24164g = messages_messages.next_rate;
                    int size = arrayList.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj6 = arrayList.get(i16);
                        i16++;
                        ij ijVar = (ij) obj6;
                        int i17 = i12;
                        ma maVar = new ma(ijVar.f23262k);
                        Integer num = (Integer) hashMap.get(maVar);
                        if (num == null) {
                            int i18 = naVar.f24166j;
                            naVar.f24166j = i18 - 1;
                            num = Integer.valueOf(i18);
                            hashMap.put(maVar, num);
                            naVar.f24159a.add(ijVar);
                        }
                        TLRPC.Message message = ijVar.f23262k;
                        message.realId = message.f26977id;
                        message.f26977id = num.intValue();
                        i12 = i17;
                    }
                    int i19 = i12;
                    if (!messages_messages.messages.isEmpty()) {
                        TLRPC.Message message2 = (TLRPC.Message) jg.g.i(1, messages_messages.messages);
                        naVar.h = message2.realId;
                        naVar.f24165i = message2.peer_id;
                    }
                    yr.a0(i13).m1(messages_messages.users, messages_messages.chats, true, true);
                    qp.s1(i13).Y3(messages_messages.users, false);
                    qp.s1(i13).S3(messages_messages.chats, false);
                    if (messages_messages.messages.size() < 21) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    naVar.f24170n = z9;
                    naVar.f24169m = Math.max(messages_messages.count, messages_messages.messages.size());
                    qs f10 = qs.f(i13);
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
                    qs f11 = qs.f(i13);
                    Integer valueOf5 = Integer.valueOf(i10);
                    Integer valueOf6 = Integer.valueOf(naVar.f24169m);
                    Boolean valueOf7 = Boolean.valueOf(naVar.f24170n);
                    Integer valueOf8 = Integer.valueOf(naVar.b());
                    Integer valueOf9 = Integer.valueOf(naVar.f24168l);
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
                ui uiVar = (ui) obj5;
                boolean[] zArr = (boolean[]) obj4;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                Runnable runnable = (Runnable) obj;
                long[] jArr = uiVar.X;
                ArrayList[] arrayListArr = uiVar.G;
                if (!zArr[0]) {
                    zArr[0] = true;
                    uiVar.g1(stickerSet.f26983id, false);
                    stickerSet.archived = false;
                    int i20 = this.f23872b;
                    arrayListArr[i20].add(i11, tL_messages_stickerSet);
                    uiVar.I.k(tL_messages_stickerSet, stickerSet.f26983id);
                    uiVar.J.k(tL_messages_stickerSet, stickerSet.f26983id);
                    String str = stickerSet.short_name;
                    if (str != null) {
                        uiVar.N.put(str.toLowerCase(), tL_messages_stickerSet);
                    }
                    uiVar.T.l(stickerSet.f26983id);
                    long q10 = ui.q(arrayListArr[i20]);
                    jArr[i20] = q10;
                    uiVar.J1(i20, uiVar.Y[i20], q10, arrayListArr[i20]);
                    if (runnable != null) {
                        runnable.run();
                    }
                    uiVar.getNotificationCenter().k(60, Integer.valueOf(i20), Boolean.TRUE);
                    return;
                }
                return;
            default:
                p4.v vVar = (p4.v) obj4;
                p4.i1 i1Var = (p4.i1) obj3;
                p4.d0 d0Var = (p4.d0) obj2;
                p4.a1 a1Var = (p4.a1) obj;
                ui.e eVar = ((p4.c1) obj5).f53196b;
                if (eVar.D(vVar)) {
                    if (i1Var != null) {
                        if (!eVar.I(vVar, i1Var)) {
                            p4.c1.r1(d0Var, vVar, i10, new p4.m1(-4));
                            return;
                        }
                    } else if (!eVar.H(vVar, i11)) {
                        p4.c1.r1(d0Var, vVar, i10, new p4.m1(-4));
                        return;
                    }
                    a1Var.l(d0Var, vVar, i10);
                    return;
                }
                return;
        }
    }

    public la(ui uiVar, boolean[] zArr, TLRPC.StickerSet stickerSet, int i7, int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = uiVar;
        this.f23874e = zArr;
        this.f23875f = stickerSet;
        this.f23872b = i7;
        this.f23873c = i10;
        this.h = tL_messages_stickerSet;
        this.f23876n = runnable;
    }

    public la(p4.c1 c1Var, p4.v vVar, p4.i1 i1Var, p4.d0 d0Var, int i7, int i10, p4.a1 a1Var) {
        this.d = c1Var;
        this.f23874e = vVar;
        this.f23875f = i1Var;
        this.h = d0Var;
        this.f23872b = i7;
        this.f23873c = i10;
        this.f23876n = a1Var;
    }
}
