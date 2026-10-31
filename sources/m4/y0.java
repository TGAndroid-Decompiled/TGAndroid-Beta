package m4;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.ma;
import org.telegram.messenger.na;
import org.telegram.messenger.oa;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
public final class y0 implements Runnable {
    public final int f12995a = 0;
    public final int f12996b;
    public final int f12997c;
    public final Object d;
    public final Object e;
    public final Object f12998f;
    public final Object h;
    public final Object f12999n;

    public y0(j1 j1Var, w wVar, p1 p1Var, f0 f0Var, int i10, int i11, h1 h1Var) {
        this.d = j1Var;
        this.e = wVar;
        this.f12998f = p1Var;
        this.h = f0Var;
        this.f12996b = i10;
        this.f12997c = i11;
        this.f12999n = h1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.f12995a;
        int i11 = this.f12996b;
        Object obj = this.f12999n;
        Object obj2 = this.h;
        int i12 = this.f12997c;
        Object obj3 = this.f12998f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        int i13 = 2;
        switch (i10) {
            case 0:
                w wVar = (w) obj4;
                p1 p1Var = (p1) obj3;
                f0 f0Var = (f0) obj2;
                h1 h1Var = (h1) obj;
                xa.n nVar = ((j1) obj5).f12789b;
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
                na naVar = (na) obj3;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj2;
                ArrayList arrayList = (ArrayList) obj;
                int i14 = ((oa) obj5).f17244a;
                int i15 = ((int[]) obj4)[0];
                int i16 = naVar.d;
                HashMap hashMap = naVar.f17069b;
                if (i15 == i16) {
                    naVar.d = -1;
                    naVar.f17071f = false;
                    naVar.f17072g = messages_messages.next_rate;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj6 = arrayList.get(i17);
                        i17++;
                        jj jjVar = (jj) obj6;
                        int i18 = i13;
                        ma maVar = new ma(jjVar.f16337k);
                        Integer num = (Integer) hashMap.get(maVar);
                        if (num == null) {
                            int i19 = naVar.f17074j;
                            naVar.f17074j = i19 - 1;
                            num = Integer.valueOf(i19);
                            hashMap.put(maVar, num);
                            naVar.f17068a.add(jjVar);
                        }
                        TLRPC.Message message = jjVar.f16337k;
                        message.realId = message.f19814id;
                        message.f19814id = num.intValue();
                        i13 = i18;
                    }
                    int i20 = i13;
                    if (!messages_messages.messages.isEmpty()) {
                        TLRPC.Message message2 = (TLRPC.Message) i0.a.g(1, messages_messages.messages);
                        naVar.h = message2.realId;
                        naVar.f17073i = message2.peer_id;
                    }
                    hs.a0(i14).m1(messages_messages.users, messages_messages.chats, true, true);
                    vp.r1(i14).V3(messages_messages.users, false);
                    vp.r1(i14).P3(messages_messages.chats, false);
                    if (messages_messages.messages.size() < 21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    naVar.f17078n = z10;
                    naVar.f17077m = Math.max(messages_messages.count, messages_messages.messages.size());
                    zs f7 = zs.f(i14);
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
                    zs f10 = zs.f(i14);
                    Integer valueOf5 = Integer.valueOf(i11);
                    Integer valueOf6 = Integer.valueOf(naVar.f17077m);
                    Boolean valueOf7 = Boolean.valueOf(naVar.f17078n);
                    Integer valueOf8 = Integer.valueOf(naVar.b());
                    Integer valueOf9 = Integer.valueOf(naVar.f17076l);
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
                ui uiVar = (ui) obj5;
                boolean[] zArr = (boolean[]) obj4;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                Runnable runnable = (Runnable) obj;
                long[] jArr = uiVar.X;
                ArrayList[] arrayListArr = uiVar.G;
                if (!zArr[0]) {
                    zArr[0] = true;
                    uiVar.g1(stickerSet.f19820id, false);
                    stickerSet.archived = false;
                    int i21 = this.f12996b;
                    arrayListArr[i21].add(i12, tL_messages_stickerSet);
                    uiVar.I.k(tL_messages_stickerSet, stickerSet.f19820id);
                    uiVar.J.k(tL_messages_stickerSet, stickerSet.f19820id);
                    String str = stickerSet.short_name;
                    if (str != null) {
                        uiVar.N.put(str.toLowerCase(), tL_messages_stickerSet);
                    }
                    uiVar.T.l(stickerSet.f19820id);
                    long q6 = ui.q(arrayListArr[i21]);
                    jArr[i21] = q6;
                    uiVar.J1(i21, uiVar.Y[i21], q6, arrayListArr[i21]);
                    if (runnable != null) {
                        runnable.run();
                    }
                    uiVar.getNotificationCenter().k(60, Integer.valueOf(i21), Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public y0(oa oaVar, int[] iArr, na naVar, TLRPC.messages_Messages messages_messages, ArrayList arrayList, int i10, int i11) {
        this.d = oaVar;
        this.e = iArr;
        this.f12998f = naVar;
        this.h = messages_messages;
        this.f12999n = arrayList;
        this.f12996b = i10;
        this.f12997c = i11;
    }

    public y0(ui uiVar, boolean[] zArr, TLRPC.StickerSet stickerSet, int i10, int i11, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, Runnable runnable) {
        this.d = uiVar;
        this.e = zArr;
        this.f12998f = stickerSet;
        this.f12996b = i10;
        this.f12997c = i11;
        this.h = tL_messages_stickerSet;
        this.f12999n = runnable;
    }
}
