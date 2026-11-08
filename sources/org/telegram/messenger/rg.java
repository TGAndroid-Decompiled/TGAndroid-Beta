package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rg implements Runnable {
    public final int f25288a;
    public final c1 f25289b;
    public final boolean f25290c;
    public final long d;
    public final Object f25291e;

    public rg(c1 c1Var, Object obj, boolean z9, long j3, int i7) {
        this.f25288a = i7;
        this.f25289b = c1Var;
        this.f25291e = obj;
        this.f25290c = z9;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f25288a;
        long j3 = this.d;
        boolean z9 = this.f25290c;
        Object obj = this.f25291e;
        c1 c1Var = this.f25289b;
        switch (i7) {
            case 0:
                ui uiVar = (ui) c1Var;
                if (((ArrayList) obj) != null && j3 != 0) {
                    uiVar.f25832p0[z9 ? 1 : 0] = j3;
                }
                uiVar.f25849w0[z9 ? 1 : 0] = false;
                uiVar.K0(z9, false);
                return;
            case 1:
                ui uiVar2 = (ui) c1Var;
                TLObject tLObject = (TLObject) obj;
                boolean z10 = tLObject instanceof TLRPC.TL_messages_featuredStickers;
                boolean z11 = this.f25290c;
                if (z10) {
                    TLRPC.TL_messages_featuredStickers tL_messages_featuredStickers = (TLRPC.TL_messages_featuredStickers) tLObject;
                    uiVar2.t1(z11, tL_messages_featuredStickers.sets, tL_messages_featuredStickers.unread, tL_messages_featuredStickers.premium, false, (int) (System.currentTimeMillis() / 1000), tL_messages_featuredStickers.hash);
                    return;
                }
                boolean z12 = tLObject instanceof TLRPC.TL_messages_featuredStickersNotModified;
                long j10 = this.d;
                if (z12) {
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    g0.h3(new tf(uiVar2, z11, currentTimeMillis, 0));
                    uiVar2.G1(z11, null, null, currentTimeMillis, j10, false);
                    return;
                }
                uiVar2.t1(z11, null, null, false, false, (int) (System.currentTimeMillis() / 1000), j10);
                return;
            case 2:
                qp qpVar = (qp) c1Var;
                qpVar.f24936x1.k((a0.h) obj, j3);
                if (z9) {
                    qpVar.f24946y1.delete(j3);
                    qpVar.S2(j3, false);
                    qpVar.getNotificationCenter().k(109, Long.valueOf(j3));
                    return;
                }
                return;
            case 3:
                qp qpVar2 = (qp) c1Var;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    ArrayList<TLRPC.Chat> arrayList = ((TLRPC.messages_Chats) tLObject2).chats;
                    qpVar2.S3(arrayList, false);
                    ro roVar = new ro();
                    roVar.f25312a = z9;
                    roVar.f25313b.addAll(arrayList);
                    if (tLObject2 instanceof TLRPC.TL_messages_chatsSlice) {
                        roVar.f25314c = Math.max(0, ((TLRPC.TL_messages_chatsSlice) tLObject2).count - arrayList.size());
                    } else if (!qpVar2.getUserConfig().q()) {
                        boolean z13 = r2.f25212a;
                    }
                    qpVar2.Y7.put(Long.valueOf(j3), roVar);
                    qpVar2.getNotificationCenter().k(201, Long.valueOf(j3));
                    return;
                } else if (tLObject2 instanceof TLRPC.Users) {
                    ArrayList<TLRPC.User> arrayList2 = ((TLRPC.Users) tLObject2).users;
                    qpVar2.Y3(arrayList2, false);
                    ro roVar2 = new ro();
                    roVar2.f25312a = z9;
                    roVar2.f25313b.addAll(arrayList2);
                    if (tLObject2 instanceof TLRPC.TL_usersSlice) {
                        roVar2.f25314c = Math.max(0, ((TLRPC.TL_usersSlice) tLObject2).count - arrayList2.size());
                    } else if (!qpVar2.getUserConfig().q()) {
                        boolean z14 = r2.f25212a;
                    }
                    qpVar2.Y7.put(Long.valueOf(j3), roVar2);
                    qpVar2.getNotificationCenter().k(201, Long.valueOf(j3));
                    return;
                } else {
                    return;
                }
            case 4:
                qp qpVar3 = (qp) c1Var;
                ArrayList arrayList3 = (ArrayList) obj;
                if (z9) {
                    qpVar3.getNotificationCenter().k(2, 64);
                }
                qpVar3.l5(0, j3, arrayList3);
                qpVar3.getNotificationCenter().k(3, new Object[0]);
                return;
            default:
                ((yr) c1Var).getMessagesController().z4(null, (org.telegram.ui.ActionBar.c6) obj, this.f25290c, this.d);
                return;
        }
    }

    public rg(ui uiVar, ArrayList arrayList, long j3, boolean z9) {
        this.f25288a = 0;
        this.f25289b = uiVar;
        this.f25291e = arrayList;
        this.d = j3;
        this.f25290c = z9;
    }

    public rg(qp qpVar, long j3, a0.h hVar, boolean z9) {
        this.f25288a = 2;
        this.f25289b = qpVar;
        this.d = j3;
        this.f25291e = hVar;
        this.f25290c = z9;
    }

    public rg(qp qpVar, boolean z9, long j3, ArrayList arrayList) {
        this.f25288a = 4;
        this.f25289b = qpVar;
        this.f25290c = z9;
        this.d = j3;
        this.f25291e = arrayList;
    }
}
