package org.telegram.messenger;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ob implements Runnable {
    public final int f26066a = 3;
    public final long f26067b;
    public final int f26068c;
    public final Object d;
    public final Object f26069e;
    public final Object f26070f;
    public final Object h;
    public final Object f26071n;

    public ob(int i7, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, y10 y10Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f26068c = i7;
        this.f26067b = j3;
        this.d = activity;
        this.f26069e = arrayList;
        this.f26070f = h6Var;
        this.h = y10Var;
        this.f26071n = hashMap;
    }

    @Override
    public final void run() {
        int i7 = this.f26066a;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = null;
        long j3 = this.f26067b;
        int i10 = this.f26068c;
        Object obj = this.f26071n;
        Object obj2 = this.d;
        Object obj3 = this.h;
        Object obj4 = this.f26070f;
        Object obj5 = this.f26069e;
        switch (i7) {
            case 0:
                ls.f(i10).k(138, (String) obj2, (TLRPC.InputFile) obj5, (TLRPC.InputEncryptedFile) obj4, (byte[]) obj3, (byte[]) obj, Long.valueOf(j3));
                return;
            case 1:
                np npVar = (np) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                Runnable[] runnableArr = (Runnable[]) obj3;
                bp bpVar = (bp) obj;
                npVar.getClass();
                if (!((boolean[]) obj5)[0]) {
                    if (chat != null) {
                        npVar.getMessagesController().X3(chat, true);
                        runnableArr[0] = npVar.t0(j3, i10, bpVar);
                        return;
                    } else if (bpVar != null) {
                        bpVar.a();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                np npVar2 = (np) obj5;
                TLObject tLObject = (TLObject) obj3;
                a0.h hVar = (a0.h) obj;
                ArrayList arrayList = (ArrayList) ((HashMap) obj4).remove((String) obj2);
                if (arrayList != null) {
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    if (tLObject instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
                        npVar2.f4(webpagepreview.users, false);
                        npVar2.Z3(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        }
                    }
                    if (tL_messageMediaWebPage == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            ((gj) arrayList.get(i11)).f24177k.media.webpage = new TLRPC.TL_webPageEmpty();
                            tL_messages_messages.messages.add(((gj) arrayList.get(i11)).f24177k);
                        }
                    } else {
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                            hVar.k(arrayList, webPage.f28553id);
                        } else {
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                ((gj) arrayList.get(i12)).f24177k.media.webpage = tL_messageMediaWebPage.webpage;
                                if (i12 == 0) {
                                    fc.W(((gj) arrayList.get(i12)).f24177k);
                                }
                                tL_messages_messages.messages.add(((gj) arrayList.get(i12)).f24177k);
                            }
                        }
                    }
                    if (!tL_messages_messages.messages.isEmpty()) {
                        ur messagesStorage = npVar2.getMessagesStorage();
                        int i13 = this.f26068c;
                        long j10 = this.f26067b;
                        messagesStorage.h1(-2, 0, i13, j10, 0L, tL_messages_messages, false);
                        npVar2.getNotificationCenter().k(49, Long.valueOf(j10), arrayList);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                Activity activity = (Activity) obj2;
                ArrayList arrayList2 = (ArrayList) obj5;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj4;
                y10 y10Var = (y10) obj3;
                HashMap hashMap = (HashMap) obj;
                long j11 = di.y8.y(i10, false).p().amount;
                long j12 = this.f26067b;
                if (j11 < j12) {
                    if (activity != null) {
                        long longValue = ((Long) arrayList2.get(0)).longValue();
                        new di.fb(activity, h6Var, j12, 13, n5.s(i10, longValue), new org.telegram.ui.Components.g2(y10Var, hashMap, 0), longValue).show();
                        return;
                    }
                    return;
                }
                y10Var.a(hashMap);
                return;
            default:
                final org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) obj5;
                final org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) obj4;
                final org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) obj3;
                String str = (String) obj2;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) obj;
                l2Var.h = false;
                if (h2Var == null) {
                    e0Var.a(null, str);
                    return;
                }
                String str2 = h2Var.f44302e;
                if (l2Var.A(h2Var) && !l2Var.j(h2Var)) {
                    l2Var.f44494g = h2Var;
                    if ("sendTransaction".equals(str2) && h2Var.f44303f != null) {
                        if (np.u1(l2Var.f44489a).h7.contains(org.telegram.ui.Wallet.l2.l(j3, i10) + ".transfer")) {
                            h2Var.f44309m = true;
                            l2Var.B(h2Var, r0Var, new y10() {
                                @Override
                                public final void a(Object obj6) {
                                    String str3 = (String) obj6;
                                    switch (r4) {
                                        case 0:
                                            l2 l2Var2 = l2Var;
                                            l2Var2.getClass();
                                            h2 h2Var2 = h2Var;
                                            h2Var2.f44309m = false;
                                            l2Var2.u(h2Var2);
                                            e0Var.a(null, str3);
                                            return;
                                        default:
                                            l2Var.u(h2Var);
                                            e0Var.a(null, str3);
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    if (h2Var.f44308l < 0 && !"disconnect".equals(str2)) {
                        e0Var.a(h2Var, null);
                        return;
                    }
                    r0Var.close();
                    l2Var.f(h2Var, false, new y10() {
                        @Override
                        public final void a(Object obj6) {
                            String str3 = (String) obj6;
                            switch (r4) {
                                case 0:
                                    l2 l2Var2 = l2Var;
                                    l2Var2.getClass();
                                    h2 h2Var2 = h2Var;
                                    h2Var2.f44309m = false;
                                    l2Var2.u(h2Var2);
                                    e0Var.a(null, str3);
                                    return;
                                default:
                                    l2Var.u(h2Var);
                                    e0Var.a(null, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                e0Var.a(null, "Request expired or wallet changed");
                return;
        }
    }

    public ob(int i7, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f26068c = i7;
        this.d = str;
        this.f26069e = inputFile;
        this.f26070f = inputEncryptedFile;
        this.h = bArr;
        this.f26071n = bArr2;
        this.f26067b = j3;
    }

    public ob(np npVar, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j3, int i7) {
        this.f26069e = npVar;
        this.f26070f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f26071n = hVar;
        this.f26067b = j3;
        this.f26068c = i7;
    }

    public ob(np npVar, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i7, bp bpVar) {
        this.d = npVar;
        this.f26069e = zArr;
        this.f26070f = chat;
        this.h = runnableArr;
        this.f26067b = j3;
        this.f26068c = i7;
        this.f26071n = bpVar;
    }

    public ob(org.telegram.ui.Wallet.l2 l2Var, org.telegram.ui.Wallet.h2 h2Var, org.telegram.ui.Wallet.e0 e0Var, String str, long j3, int i7, org.telegram.ui.Wallet.r0 r0Var) {
        this.f26069e = l2Var;
        this.f26070f = h2Var;
        this.h = e0Var;
        this.d = str;
        this.f26067b = j3;
        this.f26068c = i7;
        this.f26071n = r0Var;
    }
}
