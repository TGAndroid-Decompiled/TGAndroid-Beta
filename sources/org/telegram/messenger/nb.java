package org.telegram.messenger;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class nb implements Runnable {
    public final int f25999a = 3;
    public final long f26000b;
    public final int f26001c;
    public final Object d;
    public final Object f26002e;
    public final Object f26003f;
    public final Object h;
    public final Object f26004n;

    public nb(int i7, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, w10 w10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f26001c = i7;
        this.f26000b = j3;
        this.d = activity;
        this.f26002e = arrayList;
        this.f26003f = i6Var;
        this.h = w10Var;
        this.f26004n = hashMap;
    }

    @Override
    public final void run() {
        int i7 = this.f25999a;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = null;
        long j3 = this.f26000b;
        int i10 = this.f26001c;
        Object obj = this.f26004n;
        Object obj2 = this.d;
        Object obj3 = this.h;
        Object obj4 = this.f26003f;
        Object obj5 = this.f26002e;
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
                            ((fj) arrayList.get(i11)).f24073k.media.webpage = new TLRPC.TL_webPageEmpty();
                            tL_messages_messages.messages.add(((fj) arrayList.get(i11)).f24073k);
                        }
                    } else {
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                            hVar.k(arrayList, webPage.f28647id);
                        } else {
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                ((fj) arrayList.get(i12)).f24073k.media.webpage = tL_messageMediaWebPage.webpage;
                                if (i12 == 0) {
                                    ec.W(((fj) arrayList.get(i12)).f24073k);
                                }
                                tL_messages_messages.messages.add(((fj) arrayList.get(i12)).f24073k);
                            }
                        }
                    }
                    if (!tL_messages_messages.messages.isEmpty()) {
                        tr messagesStorage = mpVar2.getMessagesStorage();
                        int i13 = this.f26001c;
                        long j10 = this.f26000b;
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
                w10 w10Var = (w10) obj3;
                HashMap hashMap = (HashMap) obj;
                long j11 = di.y8.y(i10, false).p().amount;
                long j12 = this.f26000b;
                if (j11 < j12) {
                    if (activity != null) {
                        long longValue = ((Long) arrayList2.get(0)).longValue();
                        new di.fb(activity, i6Var, j12, 13, n5.s(i10, longValue), new org.telegram.ui.Components.f2(w10Var, hashMap, 0), longValue).show();
                        return;
                    }
                    return;
                }
                w10Var.a(hashMap);
                return;
            default:
                final org.telegram.ui.Wallet.m2 m2Var = (org.telegram.ui.Wallet.m2) obj5;
                final org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) obj4;
                final org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) obj3;
                String str = (String) obj2;
                org.telegram.ui.Wallet.s0 s0Var = (org.telegram.ui.Wallet.s0) obj;
                m2Var.h = false;
                if (i2Var == null) {
                    f0Var.a(null, str);
                    return;
                }
                String str2 = i2Var.f44464e;
                if (m2Var.A(i2Var) && !m2Var.j(i2Var)) {
                    m2Var.f44653g = i2Var;
                    if ("sendTransaction".equals(str2) && i2Var.f44465f != null) {
                        if (mp.u1(m2Var.f44648a).h7.contains(org.telegram.ui.Wallet.m2.l(j3, i10) + ".transfer")) {
                            i2Var.f44471m = true;
                            m2Var.B(i2Var, s0Var, new w10() {
                                @Override
                                public final void a(Object obj6) {
                                    String str3 = (String) obj6;
                                    switch (r4) {
                                        case 0:
                                            m2 m2Var2 = m2Var;
                                            m2Var2.getClass();
                                            i2 i2Var2 = i2Var;
                                            i2Var2.f44471m = false;
                                            m2Var2.u(i2Var2);
                                            f0Var.a(null, str3);
                                            return;
                                        default:
                                            m2Var.u(i2Var);
                                            f0Var.a(null, str3);
                                            return;
                                    }
                                }
                            });
                            return;
                        }
                    }
                    if (i2Var.f44470l < 0 && !"disconnect".equals(str2)) {
                        f0Var.a(i2Var, null);
                        return;
                    }
                    s0Var.close();
                    m2Var.f(i2Var, false, new w10() {
                        @Override
                        public final void a(Object obj6) {
                            String str3 = (String) obj6;
                            switch (r4) {
                                case 0:
                                    m2 m2Var2 = m2Var;
                                    m2Var2.getClass();
                                    i2 i2Var2 = i2Var;
                                    i2Var2.f44471m = false;
                                    m2Var2.u(i2Var2);
                                    f0Var.a(null, str3);
                                    return;
                                default:
                                    m2Var.u(i2Var);
                                    f0Var.a(null, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                f0Var.a(null, "Request expired or wallet changed");
                return;
        }
    }

    public nb(int i7, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f26001c = i7;
        this.d = str;
        this.f26002e = inputFile;
        this.f26003f = inputEncryptedFile;
        this.h = bArr;
        this.f26004n = bArr2;
        this.f26000b = j3;
    }

    public nb(mp mpVar, HashMap hashMap, String str, TLObject tLObject, a0.h hVar, long j3, int i7) {
        this.f26002e = mpVar;
        this.f26003f = hashMap;
        this.d = str;
        this.h = tLObject;
        this.f26004n = hVar;
        this.f26000b = j3;
        this.f26001c = i7;
    }

    public nb(mp mpVar, boolean[] zArr, TLRPC.Chat chat, Runnable[] runnableArr, long j3, int i7, ap apVar) {
        this.d = mpVar;
        this.f26002e = zArr;
        this.f26003f = chat;
        this.h = runnableArr;
        this.f26000b = j3;
        this.f26001c = i7;
        this.f26004n = apVar;
    }

    public nb(org.telegram.ui.Wallet.m2 m2Var, org.telegram.ui.Wallet.i2 i2Var, org.telegram.ui.Wallet.f0 f0Var, String str, long j3, int i7, org.telegram.ui.Wallet.s0 s0Var) {
        this.f26002e = m2Var;
        this.f26003f = i2Var;
        this.h = f0Var;
        this.d = str;
        this.f26000b = j3;
        this.f26001c = i7;
        this.f26004n = s0Var;
    }
}
