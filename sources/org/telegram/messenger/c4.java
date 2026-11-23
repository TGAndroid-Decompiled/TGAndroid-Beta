package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.a31;
public final class c4 implements Runnable {
    public final int f23373a = 2;
    public final long f23374b;
    public final boolean f23375c;
    public final c1 d;
    public final Object f23376e;
    public final Object f23377f;
    public final Object h;

    public c4(f4 f4Var, TLObject tLObject, long j3, boolean z10, String str, Runnable runnable) {
        this.d = f4Var;
        this.f23376e = tLObject;
        this.f23374b = j3;
        this.f23375c = z10;
        this.f23377f = str;
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
        switch (this.f23373a) {
            case 0:
                f4 f4Var = (f4) this.d;
                TLObject tLObject = (TLObject) this.f23376e;
                long j3 = this.f23374b;
                boolean z10 = this.f23375c;
                String str2 = (String) this.f23377f;
                Runnable runnable = (Runnable) this.h;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    if (j3 >= 0) {
                        userFull = mp.u1(f4Var.currentAccount).d2(j3);
                        P0 = null;
                    } else {
                        P0 = mp.u1(f4Var.currentAccount).P0(-j3);
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
                                            ks f10 = ks.f(f4Var.currentAccount);
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
                                            ks f11 = ks.f(f4Var.currentAccount);
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
                    mp.u1(f4Var.currentAccount).U3(updates.updates, updates.users, updates.chats, false, updates.date);
                    if (runnable != null) {
                        runnable.run();
                    }
                    ks.f(f4Var.currentAccount).k(326, new Object[0]);
                    return;
                }
                return;
            case 1:
                mp mpVar = (mp) this.d;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) this.f23376e;
                a0.h hVar = (a0.h) this.f23377f;
                long j10 = this.f23374b;
                hp hpVar = (hp) this.h;
                boolean z11 = this.f23375c;
                if (tL_channels_sendAsPeers == null) {
                    hVar.l(j10);
                    return;
                }
                SystemClock.elapsedRealtime();
                hpVar.f24588a = tL_channels_sendAsPeers;
                mpVar.getNotificationCenter().k(16, Long.valueOf(j10), tL_channels_sendAsPeers, Boolean.valueOf(z11));
                return;
            case 2:
                d00 d00Var = (d00) this.d;
                TLObject tLObject2 = (TLObject) this.f23376e;
                boolean z12 = this.f23375c;
                long j11 = this.f23374b;
                HashSet hashSet = (HashSet) this.f23377f;
                Runnable runnable2 = (Runnable) this.h;
                if (tLObject2 != null && z12) {
                    a0.h hVar2 = new a0.h();
                    TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject2;
                    ArrayList m10 = qg.c.m(tL_messages_savedDialogs.dialogs);
                    while (i7 < tL_messages_savedDialogs.messages.size()) {
                        hVar2.k(tL_messages_savedDialogs.messages.get(i7), tL_messages_savedDialogs.messages.get(i7).f28513id);
                        i7++;
                    }
                    g0.g3(new ei(d00Var, tL_messages_savedDialogs, j11, m10, hVar2, hashSet, runnable2));
                    return;
                } else if (tLObject2 != null) {
                    a0.h hVar3 = new a0.h();
                    TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject2;
                    while (i7 < tL_messages_forumTopics.messages.size()) {
                        hVar3.k(tL_messages_forumTopics.messages.get(i7), tL_messages_forumTopics.messages.get(i7).f28513id);
                        i7++;
                    }
                    g0.g3(new di.a3(d00Var, tLObject2, j11, tL_messages_forumTopics, hVar3, runnable2, 3));
                    return;
                } else {
                    return;
                }
            default:
                y00 y00Var = (y00) this.d;
                HashMap hashMap = (HashMap) this.f23376e;
                long j12 = this.f23374b;
                u00 u00Var = (u00) this.f23377f;
                boolean z13 = this.f23375c;
                HashSet hashSet2 = (HashSet) this.h;
                synchronized (y00Var) {
                    try {
                        ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(j12));
                        if (arrayList != null) {
                            arrayList.remove(u00Var);
                            if (arrayList.isEmpty()) {
                                hashMap.remove(Long.valueOf(j12));
                            }
                        }
                    } finally {
                    }
                }
                String str3 = y00Var.getMessagesController().Y6;
                if (!"alternative".equals(str3) && !"system".equals(str3)) {
                    TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                    if (z13) {
                        tL_messages_translateText.flags |= 2;
                        tL_messages_translateText.text.addAll(u00Var.f27206c);
                    } else {
                        tL_messages_translateText.flags |= 1;
                        tL_messages_translateText.peer = y00Var.getMessagesController().l1(j12);
                        tL_messages_translateText.f28616id = u00Var.f27205b;
                    }
                    tL_messages_translateText.to_lang = y00.D(u00Var.f27207e);
                    int sendRequest = y00Var.getConnectionsManager().sendRequest(tL_messages_translateText, new b4(y00Var, u00Var, z13, j12, hashSet2, 4));
                    synchronized (y00Var) {
                        u00Var.h = sendRequest;
                    }
                    return;
                }
                String str4 = u00Var.f27207e;
                while (i7 < u00Var.f27205b.size()) {
                    String str5 = str4;
                    a31.K0(((TLRPC.TL_textWithEntities) u00Var.f27206c.get(i7)).text, null, str5, new k00(y00Var, (t10) u00Var.d.get(i7), z13, ((Integer) u00Var.f27205b.get(i7)).intValue(), str4, j12, 0));
                    i7++;
                    str4 = str5;
                }
                return;
        }
    }

    public c4(mp mpVar, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j3, hp hpVar, boolean z10) {
        this.d = mpVar;
        this.f23376e = tL_channels_sendAsPeers;
        this.f23377f = hVar;
        this.f23374b = j3;
        this.h = hpVar;
        this.f23375c = z10;
    }

    public c4(d00 d00Var, TLObject tLObject, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.d = d00Var;
        this.f23376e = tLObject;
        this.f23375c = z10;
        this.f23374b = j3;
        this.f23377f = hashSet;
        this.h = runnable;
    }

    public c4(y00 y00Var, HashMap hashMap, long j3, u00 u00Var, boolean z10, HashSet hashSet) {
        this.d = y00Var;
        this.f23376e = hashMap;
        this.f23374b = j3;
        this.f23377f = u00Var;
        this.f23375c = z10;
        this.h = hashSet;
    }
}
