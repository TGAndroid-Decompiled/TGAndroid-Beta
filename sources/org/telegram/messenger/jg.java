package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jg implements Runnable {
    public final int f23665a;
    public final c1 f23666b;
    public final boolean f23667c;
    public final long d;
    public final Object f23668e;

    public jg(c1 c1Var, Object obj, boolean z10, long j10, int i3) {
        this.f23665a = i3;
        this.f23666b = c1Var;
        this.f23668e = obj;
        this.f23667c = z10;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i3 = this.f23665a;
        long j10 = this.d;
        boolean z10 = this.f23667c;
        Object obj = this.f23668e;
        c1 c1Var = this.f23666b;
        switch (i3) {
            case 0:
                li liVar = (li) c1Var;
                if (((ArrayList) obj) != null && j10 != 0) {
                    liVar.f24043q0[z10 ? 1 : 0] = j10;
                }
                liVar.f24061x0[z10 ? 1 : 0] = false;
                liVar.K0(z10, false);
                return;
            case 1:
                li liVar2 = (li) c1Var;
                TLObject tLObject = (TLObject) obj;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_featuredStickers;
                boolean z12 = this.f23667c;
                if (z11) {
                    TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
                    liVar2.t1(z12, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
                    return;
                }
                boolean z13 = tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified;
                long j11 = this.d;
                if (z13) {
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    g0.h3(new lf(liVar2, z12, currentTimeMillis, 0));
                    liVar2.G1(z12, null, null, currentTimeMillis, j11, false);
                    return;
                }
                liVar2.t1(z12, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j11);
                return;
            case 2:
                hp hpVar = (hp) c1Var;
                hpVar.f23171y1.k((a0.h) obj, j10);
                if (z10) {
                    hpVar.f23180z1.delete(j10);
                    hpVar.S2(j10, false);
                    hpVar.getNotificationCenter().k(109, Long.valueOf(j10));
                    return;
                }
                return;
            case 3:
                hp hpVar2 = (hp) c1Var;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    ArrayList<TLRPC.Chat> arrayList = ((TLRPC.messages_Chats) tLObject2).chats;
                    hpVar2.S3(arrayList, false);
                    io ioVar = new io();
                    ioVar.f23563a = z10;
                    ioVar.f23564b.addAll(arrayList);
                    if (tLObject2 instanceof TLRPC.TL_messages_chatsSlice) {
                        ioVar.f23565c = Math.max(0, ((TLRPC.TL_messages_chatsSlice) tLObject2).count - arrayList.size());
                    } else if (!hpVar2.getUserConfig().q()) {
                        boolean z14 = r2.f25040a;
                    }
                    hpVar2.Y7.put(Long.valueOf(j10), ioVar);
                    hpVar2.getNotificationCenter().k(201, Long.valueOf(j10));
                    return;
                } else if (tLObject2 instanceof TLRPC.Users) {
                    ArrayList<TLRPC.User> arrayList2 = ((TLRPC.Users) tLObject2).users;
                    hpVar2.Y3(arrayList2, false);
                    io ioVar2 = new io();
                    ioVar2.f23563a = z10;
                    ioVar2.f23564b.addAll(arrayList2);
                    if (tLObject2 instanceof TLRPC.TL_usersSlice) {
                        ioVar2.f23565c = Math.max(0, ((TLRPC.TL_usersSlice) tLObject2).count - arrayList2.size());
                    } else if (!hpVar2.getUserConfig().q()) {
                        boolean z15 = r2.f25040a;
                    }
                    hpVar2.Y7.put(Long.valueOf(j10), ioVar2);
                    hpVar2.getNotificationCenter().k(201, Long.valueOf(j10));
                    return;
                } else {
                    return;
                }
            case 4:
                hp hpVar3 = (hp) c1Var;
                ArrayList arrayList3 = (ArrayList) obj;
                if (z10) {
                    hpVar3.getNotificationCenter().k(2, 64);
                }
                hpVar3.l5(0, j10, arrayList3);
                hpVar3.getNotificationCenter().k(3, new Object[0]);
                return;
            default:
                ((qr) c1Var).getMessagesController().z4(null, (org.telegram.ui.ActionBar.b6) obj, this.f23667c, this.d);
                return;
        }
    }

    public jg(li liVar, ArrayList arrayList, long j10, boolean z10) {
        this.f23665a = 0;
        this.f23666b = liVar;
        this.f23668e = arrayList;
        this.d = j10;
        this.f23667c = z10;
    }

    public jg(hp hpVar, long j10, a0.h hVar, boolean z10) {
        this.f23665a = 2;
        this.f23666b = hpVar;
        this.d = j10;
        this.f23668e = hVar;
        this.f23667c = z10;
    }

    public jg(hp hpVar, boolean z10, long j10, ArrayList arrayList) {
        this.f23665a = 4;
        this.f23666b = hpVar;
        this.f23667c = z10;
        this.d = j10;
        this.f23668e = arrayList;
    }
}
