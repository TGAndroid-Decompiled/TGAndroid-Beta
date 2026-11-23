package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.b31;
public final class c4 implements Runnable {
    public final int f23189a = 3;
    public final long f23190b;
    public final boolean f23191c;
    public final c1 d;
    public final Object f23192e;
    public final Object f23193f;
    public final Object h;

    public c4(f4 f4Var, TLObject tLObject, long j3, boolean z10, String str, Runnable runnable) {
        this.d = f4Var;
        this.f23192e = tLObject;
        this.f23190b = j3;
        this.f23191c = z10;
        this.f23193f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        TLRPC.ChatFull P0;
        TLRPC.UserFull userFull;
        char c10;
        String str;
        TLRPC.WallPaper wallPaper = null;
        int i7 = 0;
        char c11 = 1;
        switch (this.f23189a) {
            case 0:
                f4 f4Var = (f4) this.d;
                TLObject tLObject = (TLObject) this.f23192e;
                long j3 = this.f23190b;
                boolean z10 = this.f23191c;
                String str2 = (String) this.f23193f;
                Runnable runnable = (Runnable) this.h;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    if (j3 >= 0) {
                        userFull = np.u1(f4Var.currentAccount).d2(j3);
                        P0 = null;
                    } else {
                        P0 = np.u1(f4Var.currentAccount).P0(-j3);
                        userFull = null;
                    }
                    if (userFull != null) {
                        wallPaper = userFull.wallpaper;
                    } else if (P0 != null) {
                        wallPaper = P0.wallpaper;
                    }
                    int i10 = 0;
                    while (true) {
                        if (i10 < updates.updates.size()) {
                            if (updates.updates.get(i10) instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewMessage) updates.updates.get(i10)).message.action;
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
                                            f4Var.r(j3, wallPaper2);
                                            f4Var.getMessagesStorage().j2(userFull, false);
                                            ls f10 = ls.f(f4Var.currentAccount);
                                            Object[] objArr = new Object[2];
                                            objArr[0] = Long.valueOf(j3);
                                            objArr[c10] = userFull;
                                            f10.k(67, objArr);
                                        } else if (P0 != null) {
                                            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
                                            P0.wallpaper = wallPaper3;
                                            P0.flags2 |= 128;
                                            f4Var.r(j3, wallPaper3);
                                            f4Var.getMessagesStorage().N1(P0, false);
                                            ls f11 = ls.f(f4Var.currentAccount);
                                            Object[] objArr2 = new Object[4];
                                            objArr2[0] = P0;
                                            objArr2[c10] = 0;
                                            Boolean bool = Boolean.FALSE;
                                            objArr2[2] = bool;
                                            objArr2[3] = bool;
                                            f11.k(30, objArr2);
                                        }
                                    }
                                }
                            } else {
                                c10 = c11;
                            }
                            i10++;
                            c11 = c10;
                        }
                    }
                    np.u1(f4Var.currentAccount).U3(updates.updates, updates.users, updates.chats, false, updates.date);
                    if (runnable != null) {
                        runnable.run();
                    }
                    ls.f(f4Var.currentAccount).k(326, new Object[0]);
                    return;
                }
                return;
            case 1:
                np npVar = (np) this.d;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) this.f23192e;
                a0.h hVar = (a0.h) this.f23193f;
                long j10 = this.f23190b;
                ip ipVar = (ip) this.h;
                boolean z11 = this.f23191c;
                if (tL_channels_sendAsPeers == null) {
                    hVar.l(j10);
                    return;
                }
                SystemClock.elapsedRealtime();
                ipVar.f24734a = tL_channels_sendAsPeers;
                npVar.getNotificationCenter().k(16, Long.valueOf(j10), tL_channels_sendAsPeers, Boolean.valueOf(z11));
                return;
            case 2:
                f00 f00Var = (f00) this.d;
                TLObject tLObject2 = (TLObject) this.f23192e;
                boolean z12 = this.f23191c;
                long j11 = this.f23190b;
                HashSet hashSet = (HashSet) this.f23193f;
                Runnable runnable2 = (Runnable) this.h;
                if (tLObject2 != null && z12) {
                    a0.h hVar2 = new a0.h();
                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject2;
                    ArrayList m10 = qg.c.m(tL_messages_savedDialogs.dialogs);
                    while (i7 < tL_messages_savedDialogs.messages.size()) {
                        hVar2.k(tL_messages_savedDialogs.messages.get(i7), tL_messages_savedDialogs.messages.get(i7).f28419id);
                        i7++;
                    }
                    g0.g3(new fi(f00Var, tL_messages_savedDialogs, j11, m10, hVar2, hashSet, runnable2));
                    return;
                } else if (tLObject2 != null) {
                    a0.h hVar3 = new a0.h();
                    TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject2;
                    while (i7 < tL_messages_forumTopics.messages.size()) {
                        hVar3.k(tL_messages_forumTopics.messages.get(i7), tL_messages_forumTopics.messages.get(i7).f28419id);
                        i7++;
                    }
                    g0.g3(new di.a3(f00Var, tLObject2, j11, tL_messages_forumTopics, hVar3, runnable2, 3));
                    return;
                } else {
                    return;
                }
            default:
                a10 a10Var = (a10) this.d;
                HashMap hashMap = (HashMap) this.f23192e;
                long j12 = this.f23190b;
                w00 w00Var = (w00) this.f23193f;
                boolean z13 = this.f23191c;
                HashSet hashSet2 = (HashSet) this.h;
                synchronized (a10Var) {
                    try {
                        ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(j12));
                        if (arrayList != null) {
                            arrayList.remove(w00Var);
                            if (arrayList.isEmpty()) {
                                hashMap.remove(Long.valueOf(j12));
                            }
                        }
                    } finally {
                    }
                }
                String str3 = a10Var.getMessagesController().Y6;
                if (!"alternative".equals(str3) && !"system".equals(str3)) {
                    TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                    if (z13) {
                        tL_messages_translateText.flags |= 2;
                        tL_messages_translateText.text.addAll(w00Var.f27634c);
                    } else {
                        tL_messages_translateText.flags |= 1;
                        tL_messages_translateText.peer = a10Var.getMessagesController().l1(j12);
                        tL_messages_translateText.f28522id = w00Var.f27633b;
                    }
                    tL_messages_translateText.to_lang = a10.D(w00Var.f27635e);
                    int sendRequest = a10Var.getConnectionsManager().sendRequest(tL_messages_translateText, new b4(a10Var, w00Var, z13, j12, hashSet2, 4));
                    synchronized (a10Var) {
                        w00Var.h = sendRequest;
                    }
                    return;
                }
                String str4 = w00Var.f27635e;
                while (i7 < w00Var.f27633b.size()) {
                    String str5 = str4;
                    b31.K0(((TLRPC.TL_textWithEntities) w00Var.f27634c.get(i7)).text, null, str5, new m00(a10Var, (v10) w00Var.d.get(i7), z13, ((Integer) w00Var.f27633b.get(i7)).intValue(), str4, j12, 0));
                    i7++;
                    str4 = str5;
                }
                return;
        }
    }

    public c4(np npVar, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j3, ip ipVar, boolean z10) {
        this.d = npVar;
        this.f23192e = tL_channels_sendAsPeers;
        this.f23193f = hVar;
        this.f23190b = j3;
        this.h = ipVar;
        this.f23191c = z10;
    }

    public c4(f00 f00Var, TLObject tLObject, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.d = f00Var;
        this.f23192e = tLObject;
        this.f23191c = z10;
        this.f23190b = j3;
        this.f23193f = hashSet;
        this.h = runnable;
    }

    public c4(a10 a10Var, HashMap hashMap, long j3, w00 w00Var, boolean z10, HashSet hashSet) {
        this.d = a10Var;
        this.f23192e = hashMap;
        this.f23190b = j3;
        this.f23193f = w00Var;
        this.f23191c = z10;
        this.h = hashSet;
    }
}
