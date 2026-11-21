package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pg implements Runnable {
    public final int f26272a;
    public final c1 f26273b;
    public final boolean f26274c;
    public final long d;
    public final Object f26275e;

    public pg(c1 c1Var, Object obj, boolean z10, long j3, int i7) {
        this.f26272a = i7;
        this.f26273b = c1Var;
        this.f26275e = obj;
        this.f26274c = z10;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f26272a;
        long j3 = this.d;
        boolean z10 = this.f26274c;
        Object obj = this.f26275e;
        c1 c1Var = this.f26273b;
        switch (i7) {
            case 0:
                ri riVar = (ri) c1Var;
                if (((ArrayList) obj) != null && j3 != 0) {
                    riVar.f26659q0[z10 ? 1 : 0] = j3;
                }
                riVar.f26677x0[z10 ? 1 : 0] = false;
                riVar.N0(z10, false);
                return;
            case 1:
                ri riVar2 = (ri) c1Var;
                TLObject tLObject = (TLObject) obj;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_featuredStickers;
                boolean z12 = this.f26274c;
                if (z11) {
                    TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
                    riVar2.w1(z12, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
                    return;
                }
                boolean z13 = tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified;
                long j10 = this.d;
                if (z13) {
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    g0.g3(new sf(riVar2, z12, currentTimeMillis, 0));
                    riVar2.L1(z12, null, null, currentTimeMillis, j10, false);
                    return;
                }
                riVar2.w1(z12, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j10);
                return;
            case 2:
                mp mpVar = (mp) c1Var;
                mpVar.A1.k((a0.h) obj, j3);
                if (z10) {
                    mpVar.B1.delete(j3);
                    mpVar.Y2(j3, false);
                    mpVar.getNotificationCenter().k(109, Long.valueOf(j3));
                    return;
                }
                return;
            case 3:
                mp mpVar2 = (mp) c1Var;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    ArrayList<TLRPC.Chat> arrayList = ((TLRPC.messages_Chats) tLObject2).chats;
                    mpVar2.Z3(arrayList, false);
                    no noVar = new no();
                    noVar.f25980a = z10;
                    noVar.f25981b.addAll(arrayList);
                    if (tLObject2 instanceof TLRPC.TL_messages_chatsSlice) {
                        noVar.f25982c = Math.max(0, ((TLRPC.TL_messages_chatsSlice) tLObject2).count - arrayList.size());
                    } else if (!mpVar2.getUserConfig().q()) {
                        boolean z14 = s2.f26749a;
                    }
                    mpVar2.f25668e8.put(Long.valueOf(j3), noVar);
                    mpVar2.getNotificationCenter().k(203, Long.valueOf(j3));
                    return;
                } else if (tLObject2 instanceof TLRPC.Users) {
                    ArrayList<TLRPC.User> arrayList2 = ((TLRPC.Users) tLObject2).users;
                    mpVar2.f4(arrayList2, false);
                    no noVar2 = new no();
                    noVar2.f25980a = z10;
                    noVar2.f25981b.addAll(arrayList2);
                    if (tLObject2 instanceof TLRPC.TL_usersSlice) {
                        noVar2.f25982c = Math.max(0, ((TLRPC.TL_usersSlice) tLObject2).count - arrayList2.size());
                    } else if (!mpVar2.getUserConfig().q()) {
                        boolean z15 = s2.f26749a;
                    }
                    mpVar2.f25668e8.put(Long.valueOf(j3), noVar2);
                    mpVar2.getNotificationCenter().k(203, Long.valueOf(j3));
                    return;
                } else {
                    return;
                }
            case 4:
                mp mpVar3 = (mp) c1Var;
                ArrayList arrayList3 = (ArrayList) obj;
                if (z10) {
                    mpVar3.getNotificationCenter().k(2, 64);
                }
                mpVar3.x5(0, j3, arrayList3);
                mpVar3.getNotificationCenter().k(3, new Object[0]);
                return;
            default:
                ((tr) c1Var).getMessagesController().J4(null, (org.telegram.ui.ActionBar.d6) obj, this.f26274c, this.d);
                return;
        }
    }

    public pg(ri riVar, ArrayList arrayList, long j3, boolean z10) {
        this.f26272a = 0;
        this.f26273b = riVar;
        this.f26275e = arrayList;
        this.d = j3;
        this.f26274c = z10;
    }

    public pg(mp mpVar, long j3, a0.h hVar, boolean z10) {
        this.f26272a = 2;
        this.f26273b = mpVar;
        this.d = j3;
        this.f26275e = hVar;
        this.f26274c = z10;
    }

    public pg(mp mpVar, boolean z10, long j3, ArrayList arrayList) {
        this.f26272a = 4;
        this.f26273b = mpVar;
        this.f26274c = z10;
        this.d = j3;
        this.f26275e = arrayList;
    }
}
