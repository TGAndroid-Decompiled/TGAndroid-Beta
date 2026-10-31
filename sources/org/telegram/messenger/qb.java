package org.telegram.messenger;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class qb implements Runnable {
    public final int f17572a = 3;
    public final long f17573b;
    public final int f17574c;
    public final Object d;
    public final Object e;
    public final Object f17575f;
    public final Object h;
    public final Object f17576n;

    public qb(int i10, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, q20 q20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f17574c = i10;
        this.f17573b = j10;
        this.d = activity;
        this.e = arrayList;
        this.f17575f = p6Var;
        this.h = q20Var;
        this.f17576n = hashMap;
    }

    @Override
    public final void run() {
        int i10 = this.f17572a;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = null;
        long j10 = this.f17573b;
        int i11 = this.f17574c;
        Object obj = this.f17576n;
        Object obj2 = this.d;
        Object obj3 = this.h;
        Object obj4 = this.f17575f;
        Object obj5 = this.e;
        switch (i10) {
            case 0:
                zs.f(i11).k(138, (String) obj2, (TLRPC.InputFile) obj5, (TLRPC.InputEncryptedFile) obj4, (byte[]) obj3, (byte[]) obj, Long.valueOf(j10));
                return;
            case 1:
                vp vpVar = (vp) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj4;
                Runnable[] runnableArr = (Runnable[]) obj3;
                jp jpVar = (jp) obj;
                vpVar.getClass();
                if (!((boolean[]) obj5)[0]) {
                    if (chat != null) {
                        vpVar.getMessagesController().N3(chat, true);
                        runnableArr[0] = vpVar.s0(j10, i11, jpVar);
                        return;
                    } else if (jpVar != null) {
                        jpVar.a();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                vp vpVar2 = (vp) obj5;
                TLObject tLObject = (TLObject) obj3;
                a0.h hVar = (a0.h) obj;
                ArrayList arrayList = (ArrayList) ((HashMap) obj4).remove((String) obj2);
                if (arrayList != null) {
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    if (tLObject instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
                        vpVar2.V3(webpagepreview.users, false);
                        vpVar2.P3(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        }
                    }
                    if (tL_messageMediaWebPage == null) {
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            ((jj) arrayList.get(i12)).f16337k.media.webpage = new TLRPC.TL_webPageEmpty();
                            tL_messages_messages.messages.add(((jj) arrayList.get(i12)).f16337k);
                        }
                    } else {
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                            hVar.k(arrayList, webPage.f19948id);
                        } else {
                            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                ((jj) arrayList.get(i13)).f16337k.media.webpage = tL_messageMediaWebPage.webpage;
                                if (i13 == 0) {
                                    hc.W(((jj) arrayList.get(i13)).f16337k);
                                }
                                tL_messages_messages.messages.add(((jj) arrayList.get(i13)).f16337k);
                            }
                        }
                    }
                    if (!tL_messages_messages.messages.isEmpty()) {
                        hs messagesStorage = vpVar2.getMessagesStorage();
                        int i14 = this.f17574c;
                        long j11 = this.f17573b;
                        messagesStorage.h1(-2, 0, i14, j11, 0L, tL_messages_messages, false);
                        vpVar2.getNotificationCenter().k(49, Long.valueOf(j11), arrayList);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                Activity activity = (Activity) obj2;
                ArrayList arrayList2 = (ArrayList) obj5;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj4;
                q20 q20Var = (q20) obj3;
                HashMap hashMap = (HashMap) obj;
                long j12 = rh.e6.y(i11, false).p().amount;
                long j13 = this.f17573b;
                if (j12 < j13) {
                    if (activity != null) {
                        long longValue = ((Long) arrayList2.get(0)).longValue();
                        new rh.x7(activity, p6Var, j13, 13, o5.s(i11, longValue), new mg.j0(q20Var, hashMap, 1), longValue).show();
                        return;
                    }
                    return;
                }
                q20Var.a(hashMap);
                return;
            default:
                final org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) obj5;
                final org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj4;
                final ih.s sVar = (ih.s) obj3;
                String str = (String) obj2;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj;
                e2Var.h = false;
                if (a2Var == null) {
                    sVar.a(null, str);
                    return;
                }
                String str2 = a2Var.e;
                if (e2Var.A(a2Var) && !e2Var.j(a2Var)) {
                    e2Var.f34449g = a2Var;
                    if ("sendTransaction".equals(str2) && a2Var.f34165f != null) {
                        if (vp.r1(e2Var.f34445a).f7.contains(org.telegram.ui.Wallet.e2.l(j10, i11) + ".transfer")) {
                            a2Var.f34171m = true;
                            e2Var.B(a2Var, h0Var, new q20() {
                                @Override
                                public final void a(Object obj6) {
                                    String str3 = (String) obj6;
                                    switch (r4) {
                                        case 0:
                                            e2 e2Var2 = e2Var;
                                            e2Var2.getClass();
                                            a2 a2Var2 = a2Var;
                                            a2Var2.f34171m = false;
                                            e2Var2.u(a2Var2);
                                            sVar.a(null, str3);
                                            return;
                                        default:
                                            e2Var.u(a2Var);
                                            sVar.a(null, str3);
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    if (a2Var.f34170l < 0 && !"disconnect".equals(str2)) {
                        sVar.a(a2Var, null);
                        return;
                    }
                    h0Var.close();
                    e2Var.f(a2Var, false, new q20() {
                        @Override
                        public final void a(Object obj6) {
                            String str3 = (String) obj6;
                            switch (r4) {
                                case 0:
                                    e2 e2Var2 = e2Var;
                                    e2Var2.getClass();
                                    a2 a2Var2 = a2Var;
                                    a2Var2.f34171m = false;
                                    e2Var2.u(a2Var2);
                                    sVar.a(null, str3);
                                    return;
                                default:
                                    e2Var.u(a2Var);
                                    sVar.a(null, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                sVar.a(null, "Request expired or wallet changed");
                return;
        }
    }

    public qb(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
        this.f17574c = i10;
        this.d = str;
        this.e = inputFile;
        this.f17575f = inputEncryptedFile;
        this.h = bArr;
        this.f17576n = bArr2;
        this.f17573b = j10;
    }

    public qb(vp vpVar, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j10, int i10) {
        this.e = vpVar;
        this.f17575f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f17576n = hVar;
        this.f17573b = j10;
        this.f17574c = i10;
    }

    public qb(vp vpVar, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j10, int i10, jp jpVar) {
        this.d = vpVar;
        this.e = zArr;
        this.f17575f = chat;
        this.h = runnableArr;
        this.f17573b = j10;
        this.f17574c = i10;
        this.f17576n = jpVar;
    }

    public qb(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.a2 a2Var, ih.s sVar, String str, long j10, int i10, org.telegram.ui.Wallet.h0 h0Var) {
        this.e = e2Var;
        this.f17575f = a2Var;
        this.h = sVar;
        this.d = str;
        this.f17573b = j10;
        this.f17574c = i10;
        this.f17576n = h0Var;
    }
}
