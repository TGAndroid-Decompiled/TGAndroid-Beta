package org.telegram.messenger;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ib implements Runnable {
    public final int f23524a = 3;
    public final long f23525b;
    public final int f23526c;
    public final Object d;
    public final Object f23527e;
    public final Object f23528f;
    public final Object h;
    public final Object f23529n;

    public ib(int i3, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, u10 u10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f23526c = i3;
        this.f23525b = j10;
        this.d = activity;
        this.f23527e = arrayList;
        this.f23528f = e6Var;
        this.h = u10Var;
        this.f23529n = hashMap;
    }

    @Override
    public final void run() {
        int i3 = this.f23524a;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = null;
        long j10 = this.f23525b;
        int i10 = this.f23526c;
        Object obj = this.f23529n;
        Object obj2 = this.d;
        Object obj3 = this.h;
        Object obj4 = this.f23528f;
        Object obj5 = this.f23527e;
        switch (i3) {
            case 0:
                hs.f(i10).k(138, (String) obj2, (TLRPC.InputFile) obj5, (TLRPC.InputEncryptedFile) obj4, (byte[]) obj3, (byte[]) obj, Long.valueOf(j10));
                return;
            case 1:
                hp hpVar = (hp) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                Runnable[] runnableArr = (Runnable[]) obj3;
                vo voVar = (vo) obj;
                hpVar.getClass();
                if (!((boolean[]) obj5)[0]) {
                    if (chat != null) {
                        hpVar.getMessagesController().Q3(chat, true);
                        runnableArr[0] = hpVar.s0(j10, i10, voVar);
                        return;
                    } else if (voVar != null) {
                        voVar.a();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                hp hpVar2 = (hp) obj5;
                TLObject tLObject = (TLObject) obj3;
                a0.h hVar = (a0.h) obj;
                ArrayList arrayList = (ArrayList) ((HashMap) obj4).remove((String) obj2);
                if (arrayList != null) {
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    if (tLObject instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
                        hpVar2.Y3(webpagepreview.users, false);
                        hpVar2.S3(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        }
                    }
                    if (tL_messageMediaWebPage == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            ((zi) arrayList.get(i11)).f26868k.media.webpage = new TLRPC.TL_webPageEmpty();
                            tL_messages_messages.messages.add(((zi) arrayList.get(i11)).f26868k);
                        }
                    } else {
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                            hVar.k(arrayList, webPage.f27156id);
                        } else {
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                ((zi) arrayList.get(i12)).f26868k.media.webpage = tL_messageMediaWebPage.webpage;
                                if (i12 == 0) {
                                    zb.W(((zi) arrayList.get(i12)).f26868k);
                                }
                                tL_messages_messages.messages.add(((zi) arrayList.get(i12)).f26868k);
                            }
                        }
                    }
                    if (!tL_messages_messages.messages.isEmpty()) {
                        qr messagesStorage = hpVar2.getMessagesStorage();
                        int i13 = this.f23526c;
                        long j11 = this.f23525b;
                        messagesStorage.h1(-2, 0, i13, j11, 0L, tL_messages_messages, false);
                        hpVar2.getNotificationCenter().k(49, Long.valueOf(j11), arrayList);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                Activity activity = (Activity) obj2;
                ArrayList arrayList2 = (ArrayList) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                u10 u10Var = (u10) obj3;
                HashMap hashMap = (HashMap) obj;
                long j12 = ci.e9.y(i10, false).p().amount;
                long j13 = this.f23525b;
                if (j12 < j13) {
                    if (activity != null) {
                        long longValue = ((Long) arrayList2.get(0)).longValue();
                        new ci.mb(activity, e6Var, j13, 13, m5.s(i10, longValue), new org.telegram.ui.Components.x1(u10Var, hashMap, 0), longValue).show();
                        return;
                    }
                    return;
                }
                u10Var.a(hashMap);
                return;
            default:
                final org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) obj5;
                final org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj4;
                final org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) obj3;
                String str = (String) obj2;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj;
                c2Var.h = false;
                if (y1Var == null) {
                    s1Var.a(null, str);
                    return;
                }
                String str2 = y1Var.f43459e;
                if (c2Var.A(y1Var) && !c2Var.j(y1Var)) {
                    c2Var.f42382g = y1Var;
                    if ("sendTransaction".equals(str2) && y1Var.f43460f != null) {
                        if (hp.s1(c2Var.f42377a).f22999e7.contains(org.telegram.ui.Wallet.c2.l(j10, i10) + ".transfer")) {
                            y1Var.f43466m = true;
                            c2Var.B(y1Var, h0Var, new u10() {
                                @Override
                                public final void a(Object obj6) {
                                    String str3 = (String) obj6;
                                    switch (r4) {
                                        case 0:
                                            c2 c2Var2 = c2Var;
                                            c2Var2.getClass();
                                            y1 y1Var2 = y1Var;
                                            y1Var2.f43466m = false;
                                            c2Var2.u(y1Var2);
                                            s1Var.a(null, str3);
                                            return;
                                        default:
                                            c2Var.u(y1Var);
                                            s1Var.a(null, str3);
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    if (y1Var.f43465l < 0 && !"disconnect".equals(str2)) {
                        s1Var.a(y1Var, null);
                        return;
                    }
                    h0Var.close();
                    c2Var.f(y1Var, false, new u10() {
                        @Override
                        public final void a(Object obj6) {
                            String str3 = (String) obj6;
                            switch (r4) {
                                case 0:
                                    c2 c2Var2 = c2Var;
                                    c2Var2.getClass();
                                    y1 y1Var2 = y1Var;
                                    y1Var2.f43466m = false;
                                    c2Var2.u(y1Var2);
                                    s1Var.a(null, str3);
                                    return;
                                default:
                                    c2Var.u(y1Var);
                                    s1Var.a(null, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                s1Var.a(null, "Request expired or wallet changed");
                return;
        }
    }

    public ib(int i3, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.f23526c = i3;
        this.d = str;
        this.f23527e = inputFile;
        this.f23528f = inputEncryptedFile;
        this.h = bArr;
        this.f23529n = bArr2;
        this.f23525b = j10;
    }

    public ib(hp hpVar, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j10, int i3) {
        this.f23527e = hpVar;
        this.f23528f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f23529n = hVar;
        this.f23525b = j10;
        this.f23526c = i3;
    }

    public ib(hp hpVar, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j10, int i3, vo voVar) {
        this.d = hpVar;
        this.f23527e = zArr;
        this.f23528f = chat;
        this.h = runnableArr;
        this.f23525b = j10;
        this.f23526c = i3;
        this.f23529n = voVar;
    }

    public ib(org.telegram.ui.Wallet.c2 c2Var, org.telegram.ui.Wallet.y1 y1Var, org.telegram.ui.Wallet.s1 s1Var, String str, long j10, int i3, org.telegram.ui.Wallet.h0 h0Var) {
        this.f23527e = c2Var;
        this.f23528f = y1Var;
        this.h = s1Var;
        this.d = str;
        this.f23525b = j10;
        this.f23526c = i3;
        this.f23529n = h0Var;
    }
}
