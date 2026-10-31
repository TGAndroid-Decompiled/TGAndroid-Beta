package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qg implements Runnable {
    public final int f17582a;
    public final f1 f17583b;
    public final boolean f17584c;
    public final long d;
    public final Object e;

    public qg(f1 f1Var, Object obj, boolean z10, long j10, int i10) {
        this.f17582a = i10;
        this.f17583b = f1Var;
        this.e = obj;
        this.f17584c = z10;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f17582a;
        long j10 = this.d;
        boolean z10 = this.f17584c;
        Object obj = this.e;
        f1 f1Var = this.f17583b;
        switch (i10) {
            case 0:
                ui uiVar = (ui) f1Var;
                if (((ArrayList) obj) != null && j10 != 0) {
                    uiVar.f18337p0[z10 ? 1 : 0] = j10;
                }
                uiVar.f18354w0[z10 ? 1 : 0] = false;
                uiVar.K0(z10, false);
                return;
            case 1:
                ui uiVar2 = (ui) f1Var;
                TLObject tLObject = (TLObject) obj;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_featuredStickers;
                boolean z12 = this.f17584c;
                if (z11) {
                    TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
                    uiVar2.t1(z12, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
                    return;
                }
                boolean z13 = tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified;
                long j11 = this.d;
                if (z13) {
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    i0.g3(new rf(uiVar2, z12, currentTimeMillis, 0));
                    uiVar2.G1(z12, null, null, currentTimeMillis, j11, false);
                    return;
                }
                uiVar2.t1(z12, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j11);
                return;
            case 2:
                vp vpVar = (vp) f1Var;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    ArrayList<TLRPC.Chat> arrayList = ((TLRPC.messages_Chats) tLObject2).chats;
                    vpVar.P3(arrayList, false);
                    wo woVar = new wo();
                    woVar.f19116a = z10;
                    woVar.f19117b.addAll(arrayList);
                    if (tLObject2 instanceof TLRPC.TL_messages_chatsSlice) {
                        woVar.f19118c = Math.max(0, ((TLRPC.TL_messages_chatsSlice) tLObject2).count - arrayList.size());
                    } else if (!vpVar.getUserConfig().q()) {
                        boolean z14 = v2.f18448a;
                    }
                    vpVar.Z7.put(Long.valueOf(j10), woVar);
                    vpVar.getNotificationCenter().k(201, Long.valueOf(j10));
                    return;
                } else if (tLObject2 instanceof TLRPC.Users) {
                    ArrayList<TLRPC.User> arrayList2 = ((TLRPC.Users) tLObject2).users;
                    vpVar.V3(arrayList2, false);
                    wo woVar2 = new wo();
                    woVar2.f19116a = z10;
                    woVar2.f19117b.addAll(arrayList2);
                    if (tLObject2 instanceof TLRPC.TL_usersSlice) {
                        woVar2.f19118c = Math.max(0, ((TLRPC.TL_usersSlice) tLObject2).count - arrayList2.size());
                    } else if (!vpVar.getUserConfig().q()) {
                        boolean z15 = v2.f18448a;
                    }
                    vpVar.Z7.put(Long.valueOf(j10), woVar2);
                    vpVar.getNotificationCenter().k(201, Long.valueOf(j10));
                    return;
                } else {
                    return;
                }
            case 3:
                vp vpVar2 = (vp) f1Var;
                vpVar2.f18942x1.k((a0.h) obj, j10);
                if (z10) {
                    vpVar2.f18952y1.delete(j10);
                    vpVar2.Q2(j10, false);
                    vpVar2.getNotificationCenter().k(109, Long.valueOf(j10));
                    return;
                }
                return;
            case 4:
                vp vpVar3 = (vp) f1Var;
                ArrayList arrayList3 = (ArrayList) obj;
                if (z10) {
                    vpVar3.getNotificationCenter().k(2, 64);
                }
                vpVar3.i5(0, j10, arrayList3);
                vpVar3.getNotificationCenter().k(3, new Object[0]);
                return;
            default:
                ((hs) f1Var).getMessagesController().w4(null, (org.telegram.ui.ActionBar.m6) obj, this.f17584c, this.d);
                return;
        }
    }

    public qg(ui uiVar, ArrayList arrayList, long j10, boolean z10) {
        this.f17582a = 0;
        this.f17583b = uiVar;
        this.e = arrayList;
        this.d = j10;
        this.f17584c = z10;
    }

    public qg(vp vpVar, long j10, a0.h hVar, boolean z10) {
        this.f17582a = 3;
        this.f17583b = vpVar;
        this.d = j10;
        this.e = hVar;
        this.f17584c = z10;
    }

    public qg(vp vpVar, boolean z10, long j10, ArrayList arrayList) {
        this.f17582a = 4;
        this.f17583b = vpVar;
        this.f17584c = z10;
        this.d = j10;
        this.e = arrayList;
    }
}
