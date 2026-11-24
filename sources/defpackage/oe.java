package defpackage;

import android.app.Activity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class oe implements Runnable {
    public final byte a;
    public final long b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public oe(int i, long j, wjb wjbVar, p8c p8cVar, Activity activity, ArrayList arrayList, HashMap hashMap) {
        this.a = (byte) 0;
        this.c = i;
        this.b = j;
        this.d = activity;
        this.e = arrayList;
        this.f = wjbVar;
        this.h = p8cVar;
        this.n = hashMap;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = null;
        long j = this.b;
        int i = this.c;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.n;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                Activity activity = (Activity) obj5;
                ArrayList arrayList = (ArrayList) obj3;
                wjb wjbVar = (wjb) obj2;
                p8c p8cVar = (p8c) obj;
                HashMap hashMap = (HashMap) obj4;
                long j2 = gta.v(i, false).m().amount;
                long j3 = this.b;
                if (j2 < j3) {
                    if (activity != null) {
                        long longValue = ((Long) arrayList.get(0)).longValue();
                        new zua(activity, wjbVar, j3, 13, cf3.r(i, longValue), new uf(p8cVar, hashMap, (byte) 0), longValue).show();
                        return;
                    }
                    return;
                }
                p8cVar.a(hashMap);
                return;
            case 1:
                final w25 w25Var = (w25) obj5;
                final s25 s25Var = (s25) obj3;
                final ae2 ae2Var = (ae2) obj2;
                String str = (String) obj;
                y05 y05Var = (y05) obj4;
                w25Var.h = false;
                if (s25Var == null) {
                    ae2Var.a(null, str);
                    return;
                }
                String str2 = s25Var.e;
                if (w25Var.A(s25Var) && !w25Var.i(s25Var)) {
                    w25Var.g = s25Var;
                    if ("sendTransaction".equals(str2) && s25Var.f != null && na7.q1(w25Var.a).X3.contains(w25.k(j, i).concat(".transfer"))) {
                        s25Var.m = true;
                        w25Var.B(s25Var, y05Var, new p8c() {
                            @Override
                            public final void a(Object obj6) {
                                byte b2 = r4;
                                ae2 ae2Var2 = ae2Var;
                                s25 s25Var2 = s25Var;
                                w25 w25Var2 = w25Var;
                                String str3 = (String) obj6;
                                switch (b2) {
                                    case 0:
                                        w25Var2.getClass();
                                        s25Var2.m = false;
                                        w25Var2.u(s25Var2);
                                        ae2Var2.a(null, str3);
                                        return;
                                    default:
                                        w25Var2.u(s25Var2);
                                        ae2Var2.a(null, str3);
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (s25Var.l < 0 && !"disconnect".equals(str2)) {
                        ae2Var.a(s25Var, null);
                        return;
                    } else {
                        y05Var.close();
                        w25Var.e(s25Var, false, new p8c() {
                            @Override
                            public final void a(Object obj6) {
                                byte b2 = r4;
                                ae2 ae2Var2 = ae2Var;
                                s25 s25Var2 = s25Var;
                                w25 w25Var2 = w25Var;
                                String str3 = (String) obj6;
                                switch (b2) {
                                    case 0:
                                        w25Var2.getClass();
                                        s25Var2.m = false;
                                        w25Var2.u(s25Var2);
                                        ae2Var2.a(null, str3);
                                        return;
                                    default:
                                        w25Var2.u(s25Var2);
                                        ae2Var2.a(null, str3);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                }
                ae2Var.a(null, "Request expired or wallet changed");
                return;
            case 2:
                kk7.f(i).k(138, (String) obj5, (TLRPC.InputFile) obj3, (TLRPC.InputEncryptedFile) obj2, (byte[]) obj, (byte[]) obj4, Long.valueOf(j));
                return;
            case 3:
                na7 na7Var = (na7) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                Runnable[] runnableArr = (Runnable[]) obj;
                ca7 ca7Var = (ca7) obj4;
                if (!((boolean[]) obj3)[0]) {
                    if (chat != null) {
                        na7Var.getMessagesController().T3(chat, true);
                        runnableArr[0] = na7Var.p0(j, i, ca7Var);
                        return;
                    } else if (ca7Var != null) {
                        ca7Var.a();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                na7 na7Var2 = (na7) obj5;
                TLObject tLObject = (TLObject) obj2;
                vf6 vf6Var = (vf6) obj;
                ArrayList arrayList2 = (ArrayList) ((HashMap) obj4).remove((String) obj3);
                if (arrayList2 != null) {
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    if (tLObject instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
                        na7Var2.b4(webpagepreview.users, false);
                        na7Var2.V3(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        }
                    }
                    if (tL_messageMediaWebPage == null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            ((k27) arrayList2.get(i2)).k.media.webpage = new TLRPC.TL_webPageEmpty();
                            tL_messages_messages.messages.add(((k27) arrayList2.get(i2)).k);
                        }
                    } else {
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                            vf6Var.k(arrayList2, webPage.id);
                        } else {
                            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                ((k27) arrayList2.get(i3)).k.media.webpage = tL_messageMediaWebPage.webpage;
                                if (i3 == 0) {
                                    fl5.R(((k27) arrayList2.get(i3)).k);
                                }
                                tL_messages_messages.messages.add(((k27) arrayList2.get(i3)).k);
                            }
                        }
                    }
                    if (!tL_messages_messages.messages.isEmpty()) {
                        ad7 messagesStorage = na7Var2.getMessagesStorage();
                        int i4 = this.c;
                        long j4 = this.b;
                        messagesStorage.e1(-2, 0, i4, j4, 0L, tL_messages_messages, false);
                        na7Var2.getNotificationCenter().k(49, Long.valueOf(j4), arrayList2);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public oe(int i, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j) {
        this.a = (byte) 2;
        this.c = i;
        this.d = str;
        this.e = inputFile;
        this.f = inputEncryptedFile;
        this.h = bArr;
        this.n = bArr2;
        this.b = j;
    }

    public oe(na7 na7Var, HashMap hashMap, String str, TLObject tLObject, vf6 vf6Var, long j, int i) {
        this.a = (byte) 4;
        this.d = na7Var;
        this.n = hashMap;
        this.e = str;
        this.f = tLObject;
        this.h = vf6Var;
        this.b = j;
        this.c = i;
    }

    public oe(Object obj, Object obj2, Object obj3, Serializable serializable, long j, int i, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.h = serializable;
        this.b = j;
        this.c = i;
        this.n = obj4;
    }
}
