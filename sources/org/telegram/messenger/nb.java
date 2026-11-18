package org.telegram.messenger;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class nb implements Runnable {
    public final int f25905a = 3;
    public final long f25906b;
    public final int f25907c;
    public final Object d;
    public final Object f25908e;
    public final Object f25909f;
    public final Object h;
    public final Object f25910n;

    public nb(int i7, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, x10 x10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f25907c = i7;
        this.f25906b = j3;
        this.d = activity;
        this.f25908e = arrayList;
        this.f25909f = i6Var;
        this.h = x10Var;
        this.f25910n = hashMap;
    }

    @Override
    public final void run() {
        int i7 = this.f25905a;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = null;
        long j3 = this.f25906b;
        int i10 = this.f25907c;
        Object obj = this.f25910n;
        Object obj2 = this.d;
        Object obj3 = this.h;
        Object obj4 = this.f25909f;
        Object obj5 = this.f25908e;
        switch (i7) {
            case 0:
                ks.f(i10).k(138, (String) obj2, (TLRPC.InputFile) obj5, (TLRPC.InputEncryptedFile) obj4, (byte[]) obj3, (byte[]) obj, Long.valueOf(j3));
                return;
            case 1:
                mp mpVar = (mp) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                Runnable[] runnableArr = (Runnable[]) obj3;
                ap apVar = (ap) obj;
                mpVar.getClass();
                if (!((boolean[]) obj5)[0]) {
                    if (chat != null) {
                        mpVar.getMessagesController().X3(chat, true);
                        runnableArr[0] = mpVar.t0(j3, i10, apVar);
                        return;
                    } else if (apVar != null) {
                        apVar.a();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                mp mpVar2 = (mp) obj5;
                TLObject tLObject = (TLObject) obj3;
                a0.h hVar = (a0.h) obj;
                ArrayList arrayList = (ArrayList) ((HashMap) obj4).remove((String) obj2);
                if (arrayList != null) {
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    if (tLObject instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
                        mpVar2.f4(webpagepreview.users, false);
                        mpVar2.Z3(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        }
                    }
                    if (tL_messageMediaWebPage == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            ((fj) arrayList.get(i11)).f23968k.media.webpage = new TLRPC.TL_webPageEmpty();
                            tL_messages_messages.messages.add(((fj) arrayList.get(i11)).f23968k);
                        }
                    } else {
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                            hVar.k(arrayList, webPage.f28560id);
                        } else {
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                ((fj) arrayList.get(i12)).f23968k.media.webpage = tL_messageMediaWebPage.webpage;
                                if (i12 == 0) {
                                    ec.W(((fj) arrayList.get(i12)).f23968k);
                                }
                                tL_messages_messages.messages.add(((fj) arrayList.get(i12)).f23968k);
                            }
                        }
                    }
                    if (!tL_messages_messages.messages.isEmpty()) {
                        tr messagesStorage = mpVar2.getMessagesStorage();
                        int i13 = this.f25907c;
                        long j10 = this.f25906b;
                        messagesStorage.h1(-2, 0, i13, j10, 0L, tL_messages_messages, false);
                        mpVar2.getNotificationCenter().k(49, Long.valueOf(j10), arrayList);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                Activity activity = (Activity) obj2;
                ArrayList arrayList2 = (ArrayList) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                x10 x10Var = (x10) obj3;
                HashMap hashMap = (HashMap) obj;
                long j11 = di.x8.y(i10, false).p().amount;
                long j12 = this.f25906b;
                if (j11 < j12) {
                    if (activity != null) {
                        long longValue = ((Long) arrayList2.get(0)).longValue();
                        new di.fb(activity, i6Var, j12, 13, n5.s(i10, longValue), new org.telegram.ui.Components.f2(x10Var, hashMap, 0), longValue).show();
                        return;
                    }
                    return;
                }
                x10Var.a(hashMap);
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
                String str2 = h2Var.f44292e;
                if (l2Var.A(h2Var) && !l2Var.j(h2Var)) {
                    l2Var.f44484g = h2Var;
                    if ("sendTransaction".equals(str2) && h2Var.f44293f != null) {
                        if (mp.u1(l2Var.f44479a).h7.contains(org.telegram.ui.Wallet.l2.l(j3, i10) + ".transfer")) {
                            h2Var.f44299m = true;
                            l2Var.B(h2Var, r0Var, new x10() {
                                @Override
                                public final void a(Object obj6) {
                                    String str3 = (String) obj6;
                                    switch (r4) {
                                        case 0:
                                            l2 l2Var2 = l2Var;
                                            l2Var2.getClass();
                                            h2 h2Var2 = h2Var;
                                            h2Var2.f44299m = false;
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
                    if (h2Var.f44298l < 0 && !"disconnect".equals(str2)) {
                        e0Var.a(h2Var, null);
                        return;
                    }
                    r0Var.close();
                    l2Var.f(h2Var, false, new x10() {
                        @Override
                        public final void a(Object obj6) {
                            String str3 = (String) obj6;
                            switch (r4) {
                                case 0:
                                    l2 l2Var2 = l2Var;
                                    l2Var2.getClass();
                                    h2 h2Var2 = h2Var;
                                    h2Var2.f44299m = false;
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

    public nb(int i7, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f25907c = i7;
        this.d = str;
        this.f25908e = inputFile;
        this.f25909f = inputEncryptedFile;
        this.h = bArr;
        this.f25910n = bArr2;
        this.f25906b = j3;
    }

    public nb(mp mpVar, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j3, int i7) {
        this.f25908e = mpVar;
        this.f25909f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f25910n = hVar;
        this.f25906b = j3;
        this.f25907c = i7;
    }

    public nb(mp mpVar, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i7, ap apVar) {
        this.d = mpVar;
        this.f25908e = zArr;
        this.f25909f = chat;
        this.h = runnableArr;
        this.f25906b = j3;
        this.f25907c = i7;
        this.f25910n = apVar;
    }

    public nb(org.telegram.ui.Wallet.l2 l2Var, org.telegram.ui.Wallet.h2 h2Var, org.telegram.ui.Wallet.e0 e0Var, String str, long j3, int i7, org.telegram.ui.Wallet.r0 r0Var) {
        this.f25908e = l2Var;
        this.f25909f = h2Var;
        this.h = e0Var;
        this.d = str;
        this.f25906b = j3;
        this.f25907c = i7;
        this.f25910n = r0Var;
    }
}
