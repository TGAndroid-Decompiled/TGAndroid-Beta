package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qg implements Runnable {
    public final int f26417a;
    public final c1 f26418b;
    public final boolean f26419c;
    public final long d;
    public final Object f26420e;

    public qg(c1 c1Var, Object obj, boolean z10, long j3, int i7) {
        this.f26417a = i7;
        this.f26418b = c1Var;
        this.f26420e = obj;
        this.f26419c = z10;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f26417a;
        long j3 = this.d;
        boolean z10 = this.f26419c;
        Object obj = this.f26420e;
        c1 c1Var = this.f26418b;
        switch (i7) {
            case 0:
                si siVar = (si) c1Var;
                if (((ArrayList) obj) != null && j3 != 0) {
                    siVar.f26809q0[z10 ? 1 : 0] = j3;
                }
                siVar.f26827x0[z10 ? 1 : 0] = false;
                siVar.N0(z10, false);
                return;
            case 1:
                si siVar2 = (si) c1Var;
                TLObject tLObject = (TLObject) obj;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_featuredStickers;
                boolean z12 = this.f26419c;
                if (z11) {
                    TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
                    siVar2.w1(z12, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
                    return;
                }
                boolean z13 = tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified;
                long j10 = this.d;
                if (z13) {
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    g0.g3(new tf(siVar2, z12, currentTimeMillis, 0));
                    siVar2.L1(z12, null, null, currentTimeMillis, j10, false);
                    return;
                }
                siVar2.w1(z12, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j10);
                return;
            case 2:
                np npVar = (np) c1Var;
                npVar.A1.k((a0.h) obj, j3);
                if (z10) {
                    npVar.B1.delete(j3);
                    npVar.Y2(j3, false);
                    npVar.getNotificationCenter().k(109, Long.valueOf(j3));
                    return;
                }
                return;
            case 3:
                np npVar2 = (np) c1Var;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    ArrayList<TLRPC.Chat> arrayList = ((TLRPC.messages_Chats) tLObject2).chats;
                    npVar2.Z3(arrayList, false);
                    oo ooVar = new oo();
                    ooVar.f26115a = z10;
                    ooVar.f26116b.addAll(arrayList);
                    if (tLObject2 instanceof TLRPC.TL_messages_chatsSlice) {
                        ooVar.f26117c = Math.max(0, ((TLRPC.TL_messages_chatsSlice) tLObject2).count - arrayList.size());
                    } else if (!npVar2.getUserConfig().q()) {
                        boolean z14 = s2.f26694a;
                    }
                    npVar2.f25803e8.put(Long.valueOf(j3), ooVar);
                    npVar2.getNotificationCenter().k(203, Long.valueOf(j3));
                    return;
                } else if (tLObject2 instanceof TLRPC.Users) {
                    ArrayList<TLRPC.User> arrayList2 = ((TLRPC.Users) tLObject2).users;
                    npVar2.f4(arrayList2, false);
                    oo ooVar2 = new oo();
                    ooVar2.f26115a = z10;
                    ooVar2.f26116b.addAll(arrayList2);
                    if (tLObject2 instanceof TLRPC.TL_usersSlice) {
                        ooVar2.f26117c = Math.max(0, ((TLRPC.TL_usersSlice) tLObject2).count - arrayList2.size());
                    } else if (!npVar2.getUserConfig().q()) {
                        boolean z15 = s2.f26694a;
                    }
                    npVar2.f25803e8.put(Long.valueOf(j3), ooVar2);
                    npVar2.getNotificationCenter().k(203, Long.valueOf(j3));
                    return;
                } else {
                    return;
                }
            case 4:
                np npVar3 = (np) c1Var;
                ArrayList arrayList3 = (ArrayList) obj;
                if (z10) {
                    npVar3.getNotificationCenter().k(2, 64);
                }
                npVar3.x5(0, j3, arrayList3);
                npVar3.getNotificationCenter().k(3, new Object[0]);
                return;
            default:
                ((ur) c1Var).getMessagesController().J4(null, (org.telegram.ui.ActionBar.d6) obj, this.f26419c, this.d);
                return;
        }
    }

    public qg(si siVar, ArrayList arrayList, long j3, boolean z10) {
        this.f26417a = 0;
        this.f26418b = siVar;
        this.f26420e = arrayList;
        this.d = j3;
        this.f26419c = z10;
    }

    public qg(np npVar, long j3, a0.h hVar, boolean z10) {
        this.f26417a = 2;
        this.f26418b = npVar;
        this.d = j3;
        this.f26420e = hVar;
        this.f26419c = z10;
    }

    public qg(np npVar, boolean z10, long j3, ArrayList arrayList) {
        this.f26417a = 4;
        this.f26418b = npVar;
        this.f26419c = z10;
        this.d = j3;
        this.f26420e = arrayList;
    }
}
