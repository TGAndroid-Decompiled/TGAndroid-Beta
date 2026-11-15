package org.telegram.messenger;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ob implements Runnable {
    public final int f25737a = 3;
    public final long f25738b;
    public final int f25739c;
    public final Object d;
    public final Object f25740e;
    public final Object f25741f;
    public final Object h;
    public final Object f25742n;

    public ob(int i7, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, z10 z10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f25739c = i7;
        this.f25738b = j3;
        this.d = activity;
        this.f25740e = arrayList;
        this.f25741f = e6Var;
        this.h = z10Var;
        this.f25742n = hashMap;
    }

    @Override
    public final void run() {
        int i7 = this.f25737a;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = null;
        long j3 = this.f25738b;
        int i10 = this.f25739c;
        Object obj = this.f25742n;
        Object obj2 = this.d;
        Object obj3 = this.h;
        Object obj4 = this.f25741f;
        Object obj5 = this.f25740e;
        switch (i7) {
            case 0:
                ns.f(i10).k(138, (String) obj2, (TLRPC.InputFile) obj5, (TLRPC.InputEncryptedFile) obj4, (byte[]) obj3, (byte[]) obj, Long.valueOf(j3));
                return;
            case 1:
                np npVar = (np) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                Runnable[] runnableArr = (Runnable[]) obj3;
                bp bpVar = (bp) obj;
                npVar.getClass();
                if (!((boolean[]) obj5)[0]) {
                    if (chat != null) {
                        npVar.getMessagesController().Q3(chat, true);
                        runnableArr[0] = npVar.s0(j3, i10, bpVar);
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
                        npVar2.Y3(webpagepreview.users, false);
                        npVar2.S3(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        }
                    }
                    if (tL_messageMediaWebPage == null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            ((gj) arrayList.get(i11)).f23819k.media.webpage = new TLRPC.TL_webPageEmpty();
                            tL_messages_messages.messages.add(((gj) arrayList.get(i11)).f23819k);
                        }
                    } else {
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                            hVar.k(arrayList, webPage.f28206id);
                        } else {
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                ((gj) arrayList.get(i12)).f23819k.media.webpage = tL_messageMediaWebPage.webpage;
                                if (i12 == 0) {
                                    fc.W(((gj) arrayList.get(i12)).f23819k);
                                }
                                tL_messages_messages.messages.add(((gj) arrayList.get(i12)).f23819k);
                            }
                        }
                    }
                    if (!tL_messages_messages.messages.isEmpty()) {
                        vr messagesStorage = npVar2.getMessagesStorage();
                        int i13 = this.f25739c;
                        long j10 = this.f25738b;
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
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                z10 z10Var = (z10) obj3;
                HashMap hashMap = (HashMap) obj;
                long j11 = di.u8.y(i10, false).p().amount;
                long j12 = this.f25738b;
                if (j11 < j12) {
                    if (activity != null) {
                        long longValue = ((Long) arrayList2.get(0)).longValue();
                        new di.bb(activity, e6Var, j12, 13, m5.s(i10, longValue), new org.telegram.ui.Components.w1(z10Var, hashMap, 0), longValue).show();
                        return;
                    }
                    return;
                }
                z10Var.a(hashMap);
                return;
            default:
                final org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) obj5;
                final org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj4;
                final org.telegram.ui.Wallet.t1 t1Var = (org.telegram.ui.Wallet.t1) obj3;
                String str = (String) obj2;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj;
                d2Var.h = false;
                if (z1Var == null) {
                    t1Var.a(null, str);
                    return;
                }
                String str2 = z1Var.f44779e;
                if (d2Var.A(z1Var) && !d2Var.j(z1Var)) {
                    d2Var.f43734g = z1Var;
                    if ("sendTransaction".equals(str2) && z1Var.f44780f != null) {
                        if (np.s1(d2Var.f43729a).f25283f7.contains(org.telegram.ui.Wallet.d2.l(j3, i10) + ".transfer")) {
                            z1Var.f44786m = true;
                            d2Var.B(z1Var, i0Var, new z10() {
                                @Override
                                public final void a(Object obj6) {
                                    String str3 = (String) obj6;
                                    switch (r4) {
                                        case 0:
                                            d2 d2Var2 = d2Var;
                                            d2Var2.getClass();
                                            z1 z1Var2 = z1Var;
                                            z1Var2.f44786m = false;
                                            d2Var2.u(z1Var2);
                                            t1Var.a(null, str3);
                                            return;
                                        default:
                                            d2Var.u(z1Var);
                                            t1Var.a(null, str3);
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    if (z1Var.f44785l < 0 && !"disconnect".equals(str2)) {
                        t1Var.a(z1Var, null);
                        return;
                    }
                    i0Var.close();
                    d2Var.f(z1Var, false, new z10() {
                        @Override
                        public final void a(Object obj6) {
                            String str3 = (String) obj6;
                            switch (r4) {
                                case 0:
                                    d2 d2Var2 = d2Var;
                                    d2Var2.getClass();
                                    z1 z1Var2 = z1Var;
                                    z1Var2.f44786m = false;
                                    d2Var2.u(z1Var2);
                                    t1Var.a(null, str3);
                                    return;
                                default:
                                    d2Var.u(z1Var);
                                    t1Var.a(null, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                t1Var.a(null, "Request expired or wallet changed");
                return;
        }
    }

    public ob(int i7, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f25739c = i7;
        this.d = str;
        this.f25740e = inputFile;
        this.f25741f = inputEncryptedFile;
        this.h = bArr;
        this.f25742n = bArr2;
        this.f25738b = j3;
    }

    public ob(np npVar, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j3, int i7) {
        this.f25740e = npVar;
        this.f25741f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f25742n = hVar;
        this.f25738b = j3;
        this.f25739c = i7;
    }

    public ob(np npVar, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i7, bp bpVar) {
        this.d = npVar;
        this.f25740e = zArr;
        this.f25741f = chat;
        this.h = runnableArr;
        this.f25738b = j3;
        this.f25739c = i7;
        this.f25742n = bpVar;
    }

    public ob(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.Wallet.z1 z1Var, org.telegram.ui.Wallet.t1 t1Var, String str, long j3, int i7, org.telegram.ui.Wallet.i0 i0Var) {
        this.f25740e = d2Var;
        this.f25741f = z1Var;
        this.h = t1Var;
        this.d = str;
        this.f25738b = j3;
        this.f25739c = i7;
        this.f25742n = i0Var;
    }
}
