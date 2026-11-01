package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rg implements Runnable {
    public final int f17928a;
    public final f1 f17929b;
    public final boolean f17930c;
    public final long d;
    public final Object e;

    public rg(f1 f1Var, Object obj, boolean z10, long j10, int i10) {
        this.f17928a = i10;
        this.f17929b = f1Var;
        this.e = obj;
        this.f17930c = z10;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f17928a;
        long j10 = this.d;
        boolean z10 = this.f17930c;
        Object obj = this.e;
        f1 f1Var = this.f17929b;
        switch (i10) {
            case 0:
                vi viVar = (vi) f1Var;
                if (((ArrayList) obj) != null && j10 != 0) {
                    viVar.f18666p0[z10 ? 1 : 0] = j10;
                }
                viVar.f18683w0[z10 ? 1 : 0] = false;
                viVar.K0(z10, false);
                return;
            case 1:
                vi viVar2 = (vi) f1Var;
                TLObject tLObject = (TLObject) obj;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_featuredStickers;
                boolean z12 = this.f17930c;
                if (z11) {
                    TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
                    viVar2.t1(z12, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
                    return;
                }
                boolean z13 = tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified;
                long j11 = this.d;
                if (z13) {
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    i0.g3(new sf(viVar2, z12, currentTimeMillis, 0));
                    viVar2.G1(z12, null, null, currentTimeMillis, j11, false);
                    return;
                }
                viVar2.t1(z12, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j11);
                return;
            case 2:
                wp wpVar = (wp) f1Var;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    ArrayList<TLRPC.Chat> arrayList = ((TLRPC.messages_Chats) tLObject2).chats;
                    wpVar.P3(arrayList, false);
                    xo xoVar = new xo();
                    xoVar.f19459a = z10;
                    xoVar.f19460b.addAll(arrayList);
                    if (tLObject2 instanceof TLRPC.TL_messages_chatsSlice) {
                        xoVar.f19461c = Math.max(0, ((TLRPC.TL_messages_chatsSlice) tLObject2).count - arrayList.size());
                    } else if (!wpVar.getUserConfig().q()) {
                        boolean z14 = v2.f18578a;
                    }
                    wpVar.Z7.put(Long.valueOf(j10), xoVar);
                    wpVar.getNotificationCenter().k(201, Long.valueOf(j10));
                    return;
                } else if (tLObject2 instanceof TLRPC.Users) {
                    ArrayList<TLRPC.User> arrayList2 = ((TLRPC.Users) tLObject2).users;
                    wpVar.V3(arrayList2, false);
                    xo xoVar2 = new xo();
                    xoVar2.f19459a = z10;
                    xoVar2.f19460b.addAll(arrayList2);
                    if (tLObject2 instanceof TLRPC.TL_usersSlice) {
                        xoVar2.f19461c = Math.max(0, ((TLRPC.TL_usersSlice) tLObject2).count - arrayList2.size());
                    } else if (!wpVar.getUserConfig().q()) {
                        boolean z15 = v2.f18578a;
                    }
                    wpVar.Z7.put(Long.valueOf(j10), xoVar2);
                    wpVar.getNotificationCenter().k(201, Long.valueOf(j10));
                    return;
                } else {
                    return;
                }
            case 3:
                wp wpVar2 = (wp) f1Var;
                wpVar2.f19285x1.k((a0.h) obj, j10);
                if (z10) {
                    wpVar2.f19295y1.delete(j10);
                    wpVar2.Q2(j10, false);
                    wpVar2.getNotificationCenter().k(109, Long.valueOf(j10));
                    return;
                }
                return;
            case 4:
                wp wpVar3 = (wp) f1Var;
                ArrayList arrayList3 = (ArrayList) obj;
                if (z10) {
                    wpVar3.getNotificationCenter().k(2, 64);
                }
                wpVar3.i5(0, j10, arrayList3);
                wpVar3.getNotificationCenter().k(3, new Object[0]);
                return;
            default:
                ((is) f1Var).getMessagesController().w4(null, (org.telegram.ui.ActionBar.m6) obj, this.f17930c, this.d);
                return;
        }
    }

    public rg(vi viVar, ArrayList arrayList, long j10, boolean z10) {
        this.f17928a = 0;
        this.f17929b = viVar;
        this.e = arrayList;
        this.d = j10;
        this.f17930c = z10;
    }

    public rg(wp wpVar, long j10, a0.h hVar, boolean z10) {
        this.f17928a = 3;
        this.f17929b = wpVar;
        this.d = j10;
        this.e = hVar;
        this.f17930c = z10;
    }

    public rg(wp wpVar, boolean z10, long j10, ArrayList arrayList) {
        this.f17928a = 4;
        this.f17929b = wpVar;
        this.f17930c = z10;
        this.d = j10;
        this.e = arrayList;
    }
}
