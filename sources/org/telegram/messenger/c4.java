package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.m31;
public final class c4 implements Runnable {
    public final int f14902a = 0;
    public final long f14903b;
    public final boolean f14904c;
    public final f1 d;
    public final Object e;
    public final Object f14905f;
    public final Object h;

    public c4(g4 g4Var, TLObject tLObject, long j10, boolean z10, String str, Runnable runnable) {
        this.d = g4Var;
        this.e = tLObject;
        this.f14903b = j10;
        this.f14904c = z10;
        this.f14905f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull M0;
        TLRPC.UserFull userFull;
        char c10;
        String str;
        TLRPC.WallPaper wallPaper = null;
        int i10 = 0;
        char c11 = 1;
        switch (this.f14902a) {
            case 0:
                g4 g4Var = (g4) this.d;
                TLObject tLObject = (TLObject) this.e;
                long j10 = this.f14903b;
                boolean z10 = this.f14904c;
                String str2 = (String) this.f14905f;
                Runnable runnable = (Runnable) this.h;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    if (j10 >= 0) {
                        userFull = vp.r1(g4Var.currentAccount).a2(j10);
                        M0 = null;
                    } else {
                        M0 = vp.r1(g4Var.currentAccount).M0(-j10);
                        userFull = null;
                    }
                    if (userFull != null) {
                        wallPaper = userFull.wallpaper;
                    } else if (M0 != null) {
                        wallPaper = M0.wallpaper;
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 < updates.updates.size()) {
                            if (updates.updates.get(i11) instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewMessage) updates.updates.get(i11)).message.action;
                                c10 = c11;
                                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                                    if (z10) {
                                        TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageAction;
                                        tL_messageActionSetChatWallPaper.wallpaper.uploadingImage = str2;
                                        if (wallPaper != null && (str = wallPaper.uploadingImage) != null && str.equals(str2)) {
                                            tL_messageActionSetChatWallPaper.wallpaper.stripedThumb = wallPaper.stripedThumb;
                                        }
                                        if (userFull != null) {
                                            TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
                                            userFull.wallpaper = wallPaper2;
                                            userFull.flags |= 16777216;
                                            g4Var.r(j10, wallPaper2);
                                            g4Var.getMessagesStorage().j2(userFull, false);
                                            zs f7 = zs.f(g4Var.currentAccount);
                                            Object[] objArr = new Object[2];
                                            objArr[0] = Long.valueOf(j10);
                                            objArr[c10] = userFull;
                                            f7.k(67, objArr);
                                        } else if (M0 != null) {
                                            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
                                            M0.wallpaper = wallPaper3;
                                            M0.flags2 |= 128;
                                            g4Var.r(j10, wallPaper3);
                                            g4Var.getMessagesStorage().N1(M0, false);
                                            zs f10 = zs.f(g4Var.currentAccount);
                                            Object[] objArr2 = new Object[4];
                                            objArr2[0] = M0;
                                            objArr2[c10] = 0;
                                            Boolean bool = Boolean.FALSE;
                                            objArr2[2] = bool;
                                            objArr2[3] = bool;
                                            f10.k(30, objArr2);
                                        }
                                    }
                                }
                            } else {
                                c10 = c11;
                            }
                            i11++;
                            c11 = c10;
                        }
                    }
                    vp.r1(g4Var.currentAccount).K3(updates.updates, updates.users, updates.chats, false, updates.date);
                    if (runnable != null) {
                        runnable.run();
                    }
                    zs.f(g4Var.currentAccount).k(323, new Object[0]);
                    return;
                }
                return;
            case 1:
                vp vpVar = (vp) this.d;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) this.e;
                a0.h hVar = (a0.h) this.f14905f;
                long j11 = this.f14903b;
                qp qpVar = (qp) this.h;
                boolean z11 = this.f14904c;
                if (tL_channels_sendAsPeers == null) {
                    hVar.l(j11);
                    return;
                }
                SystemClock.elapsedRealtime();
                qpVar.f17610a = tL_channels_sendAsPeers;
                vpVar.getNotificationCenter().k(16, Long.valueOf(j11), tL_channels_sendAsPeers, Boolean.valueOf(z11));
                return;
            case 2:
                x00 x00Var = (x00) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z12 = this.f14904c;
                long j12 = this.f14903b;
                HashSet hashSet = (HashSet) this.f14905f;
                Runnable runnable2 = (Runnable) this.h;
                if (tLObject2 != null && z12) {
                    a0.h hVar2 = new a0.h();
                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject2;
                    ArrayList l4 = gg.e.l(tL_messages_savedDialogs.dialogs);
                    while (i10 < tL_messages_savedDialogs.messages.size()) {
                        hVar2.k(tL_messages_savedDialogs.messages.get(i10), tL_messages_savedDialogs.messages.get(i10).f19814id);
                        i10++;
                    }
                    i0.g3(new ei(x00Var, tL_messages_savedDialogs, j12, l4, hVar2, hashSet, runnable2));
                    return;
                } else if (tLObject2 != null) {
                    a0.h hVar3 = new a0.h();
                    TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject2;
                    while (i10 < tL_messages_forumTopics.messages.size()) {
                        hVar3.k(tL_messages_forumTopics.messages.get(i10), tL_messages_forumTopics.messages.get(i10).f19814id);
                        i10++;
                    }
                    i0.g3(new q00(x00Var, tLObject2, j12, tL_messages_forumTopics, hVar3, runnable2, 0));
                    return;
                } else {
                    return;
                }
            default:
                t10 t10Var = (t10) this.d;
                HashMap hashMap = (HashMap) this.e;
                long j13 = this.f14903b;
                p10 p10Var = (p10) this.f14905f;
                boolean z13 = this.f14904c;
                HashSet hashSet2 = (HashSet) this.h;
                synchronized (t10Var) {
                    try {
                        ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(j13));
                        if (arrayList != null) {
                            arrayList.remove(p10Var);
                            if (arrayList.isEmpty()) {
                                hashMap.remove(Long.valueOf(j13));
                            }
                        }
                    } finally {
                    }
                }
                String str3 = t10Var.getMessagesController().W6;
                if (!"alternative".equals(str3) && !"system".equals(str3)) {
                    TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                    if (z13) {
                        tL_messages_translateText.flags |= 2;
                        tL_messages_translateText.text.addAll(p10Var.f17400c);
                    } else {
                        tL_messages_translateText.flags |= 1;
                        tL_messages_translateText.peer = t10Var.getMessagesController().i1(j13);
                        tL_messages_translateText.f19917id = p10Var.f17399b;
                    }
                    tL_messages_translateText.to_lang = t10.D(p10Var.e);
                    int sendRequest = t10Var.getConnectionsManager().sendRequest(tL_messages_translateText, new b4(t10Var, p10Var, z13, j13, hashSet2, 4));
                    synchronized (t10Var) {
                        p10Var.h = sendRequest;
                    }
                    return;
                }
                String str4 = p10Var.e;
                while (i10 < p10Var.f17399b.size()) {
                    String str5 = str4;
                    m31.J0(((TLRPC.TL_textWithEntities) p10Var.f17400c.get(i10)).text, null, str5, new f10(t10Var, (n20) p10Var.d.get(i10), z13, ((Integer) p10Var.f17399b.get(i10)).intValue(), str4, j13, 0));
                    i10++;
                    str4 = str5;
                }
                return;
        }
    }

    public c4(vp vpVar, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j10, qp qpVar, boolean z10) {
        this.d = vpVar;
        this.e = tL_channels_sendAsPeers;
        this.f14905f = hVar;
        this.f14903b = j10;
        this.h = qpVar;
        this.f14904c = z10;
    }

    public c4(x00 x00Var, TLObject tLObject, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.d = x00Var;
        this.e = tLObject;
        this.f14904c = z10;
        this.f14903b = j10;
        this.f14905f = hashSet;
        this.h = runnable;
    }

    public c4(t10 t10Var, HashMap hashMap, long j10, p10 p10Var, boolean z10, HashSet hashSet) {
        this.d = t10Var;
        this.e = hashMap;
        this.f14903b = j10;
        this.f14905f = p10Var;
        this.f14904c = z10;
        this.h = hashSet;
    }
}
