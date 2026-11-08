package org.telegram.messenger;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class pb implements Runnable {
    public final int f24539a = 3;
    public final long f24540b;
    public final int f24541c;
    public final Object d;
    public final Object f24542e;
    public final Object f24543f;
    public final Object h;
    public final Object f24544n;

    public pb(int i7, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, c20 c20Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f24541c = i7;
        this.f24540b = j3;
        this.d = activity;
        this.f24542e = arrayList;
        this.f24543f = f6Var;
        this.h = c20Var;
        this.f24544n = hashMap;
    }

    @Override
    public final void run() {
        int i7 = this.f24539a;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = null;
        long j3 = this.f24540b;
        int i10 = this.f24541c;
        Object obj = this.f24544n;
        Object obj2 = this.d;
        Object obj3 = this.h;
        Object obj4 = this.f24543f;
        Object obj5 = this.f24542e;
        switch (i7) {
            case 0:
                qs.f(i10).k(138, (String) obj2, (TLRPC.InputFile) obj5, (TLRPC.InputEncryptedFile) obj4, (byte[]) obj3, (byte[]) obj, Long.valueOf(j3));
                return;
            case 1:
                qp qpVar = (qp) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                Runnable[] runnableArr = (Runnable[]) obj3;
                ep epVar = (ep) obj;
                qpVar.getClass();
                if (!((boolean[]) obj5)[0]) {
                    if (chat != null) {
                        qpVar.getMessagesController().Q3(chat, true);
                        runnableArr[0] = qpVar.s0(j3, i10, epVar);
                        return;
                    } else if (epVar != null) {
                        epVar.a();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                qp qpVar2 = (qp) obj5;
                TLObject tLObject = (TLObject) obj3;
                a0.h hVar = (a0.h) obj;
                ArrayList arrayList = (ArrayList) ((HashMap) obj4).remove((String) obj2);
                if (arrayList != null) {
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    if (tLObject instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
                        qpVar2.Y3(webpagepreview.users, false);
                        qpVar2.S3(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        }
                    }
                    if (tL_messageMediaWebPage == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            ((ij) arrayList.get(i11)).f23262k.media.webpage = new TLRPC.TL_webPageEmpty();
                            tL_messages_messages.messages.add(((ij) arrayList.get(i11)).f23262k);
                        }
                    } else {
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                            hVar.k(arrayList, webPage.f27111id);
                        } else {
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                ((ij) arrayList.get(i12)).f23262k.media.webpage = tL_messageMediaWebPage.webpage;
                                if (i12 == 0) {
                                    gc.W(((ij) arrayList.get(i12)).f23262k);
                                }
                                tL_messages_messages.messages.add(((ij) arrayList.get(i12)).f23262k);
                            }
                        }
                    }
                    if (!tL_messages_messages.messages.isEmpty()) {
                        yr messagesStorage = qpVar2.getMessagesStorage();
                        int i13 = this.f24541c;
                        long j10 = this.f24540b;
                        messagesStorage.h1(-2, 0, i13, j10, 0L, tL_messages_messages, false);
                        qpVar2.getNotificationCenter().k(49, Long.valueOf(j10), arrayList);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                Activity activity = (Activity) obj2;
                ArrayList arrayList2 = (ArrayList) obj5;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                c20 c20Var = (c20) obj3;
                HashMap hashMap = (HashMap) obj;
                long j11 = bi.ea.y(i10, false).p().amount;
                long j12 = this.f24540b;
                if (j11 < j12) {
                    if (activity != null) {
                        long longValue = ((Long) arrayList2.get(0)).longValue();
                        new bi.tc(activity, f6Var, j12, 13, m5.s(i10, longValue), new org.telegram.ui.Components.y1(c20Var, hashMap, 0), longValue).show();
                        return;
                    }
                    return;
                }
                c20Var.a(hashMap);
                return;
            default:
                final org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) obj5;
                final org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj4;
                final org.telegram.ui.Wallet.u1 u1Var = (org.telegram.ui.Wallet.u1) obj3;
                String str = (String) obj2;
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) obj;
                e2Var.h = false;
                if (a2Var == null) {
                    u1Var.a(null, str);
                    return;
                }
                String str2 = a2Var.f42096e;
                if (e2Var.A(a2Var) && !e2Var.j(a2Var)) {
                    e2Var.f42432g = a2Var;
                    if ("sendTransaction".equals(str2) && a2Var.f42097f != null) {
                        if (qp.s1(e2Var.f42427a).f24774e7.contains(org.telegram.ui.Wallet.e2.l(j3, i10) + ".transfer")) {
                            a2Var.f42103m = true;
                            e2Var.B(a2Var, j0Var, new c20() {
                                @Override
                                public final void a(Object obj6) {
                                    String str3 = (String) obj6;
                                    switch (r4) {
                                        case 0:
                                            e2 e2Var2 = e2Var;
                                            e2Var2.getClass();
                                            a2 a2Var2 = a2Var;
                                            a2Var2.f42103m = false;
                                            e2Var2.u(a2Var2);
                                            u1Var.a(null, str3);
                                            return;
                                        default:
                                            e2Var.u(a2Var);
                                            u1Var.a(null, str3);
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    if (a2Var.f42102l < 0 && !"disconnect".equals(str2)) {
                        u1Var.a(a2Var, null);
                        return;
                    }
                    j0Var.close();
                    e2Var.f(a2Var, false, new c20() {
                        @Override
                        public final void a(Object obj6) {
                            String str3 = (String) obj6;
                            switch (r4) {
                                case 0:
                                    e2 e2Var2 = e2Var;
                                    e2Var2.getClass();
                                    a2 a2Var2 = a2Var;
                                    a2Var2.f42103m = false;
                                    e2Var2.u(a2Var2);
                                    u1Var.a(null, str3);
                                    return;
                                default:
                                    e2Var.u(a2Var);
                                    u1Var.a(null, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                u1Var.a(null, "Request expired or wallet changed");
                return;
        }
    }

    public pb(int i7, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f24541c = i7;
        this.d = str;
        this.f24542e = inputFile;
        this.f24543f = inputEncryptedFile;
        this.h = bArr;
        this.f24544n = bArr2;
        this.f24540b = j3;
    }

    public pb(qp qpVar, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j3, int i7) {
        this.f24542e = qpVar;
        this.f24543f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f24544n = hVar;
        this.f24540b = j3;
        this.f24541c = i7;
    }

    public pb(qp qpVar, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i7, ep epVar) {
        this.d = qpVar;
        this.f24542e = zArr;
        this.f24543f = chat;
        this.h = runnableArr;
        this.f24540b = j3;
        this.f24541c = i7;
        this.f24544n = epVar;
    }

    public pb(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.a2 a2Var, org.telegram.ui.Wallet.u1 u1Var, String str, long j3, int i7, org.telegram.ui.Wallet.j0 j0Var) {
        this.f24542e = e2Var;
        this.f24543f = a2Var;
        this.h = u1Var;
        this.d = str;
        this.f24540b = j3;
        this.f24541c = i7;
        this.f24544n = j0Var;
    }
}
