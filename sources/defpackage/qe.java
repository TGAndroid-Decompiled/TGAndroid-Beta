package defpackage;

import android.app.Activity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class qe implements Runnable {
    public final byte a;
    public final long b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public qe(int i, long j, vnb vnbVar, pcc pccVar, Activity activity, ArrayList arrayList, HashMap hashMap) {
        this.a = (byte) 0;
        this.c = i;
        this.b = j;
        this.d = activity;
        this.e = arrayList;
        this.f = vnbVar;
        this.h = pccVar;
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
                vnb vnbVar = (vnb) obj2;
                pcc pccVar = (pcc) obj;
                HashMap hashMap = (HashMap) obj4;
                long j2 = jxa.v(i, false).m().amount;
                long j3 = this.b;
                if (j2 < j3) {
                    if (activity != null) {
                        long longValue = ((Long) arrayList.get(0)).longValue();
                        new dza(activity, vnbVar, j3, 13, wf3.r(i, longValue), new zf(pccVar, hashMap, (byte) 0), longValue).show();
                        return;
                    }
                    return;
                }
                pccVar.a(hashMap);
                return;
            case 1:
                final a55 a55Var = (a55) obj5;
                final w45 w45Var = (w45) obj3;
                final qe2 qe2Var = (qe2) obj2;
                String str = (String) obj;
                c35 c35Var = (c35) obj4;
                a55Var.h = false;
                if (w45Var == null) {
                    qe2Var.a(null, str);
                    return;
                }
                String str2 = w45Var.e;
                if (a55Var.A(w45Var) && !a55Var.i(w45Var)) {
                    a55Var.g = w45Var;
                    if ("sendTransaction".equals(str2) && w45Var.f != null && uc7.s1(a55Var.a).X3.contains(a55.k(j, i).concat(".transfer"))) {
                        w45Var.m = true;
                        a55Var.B(w45Var, c35Var, new pcc() {
                            @Override
                            public final void a(Object obj6) {
                                byte b2 = r4;
                                qe2 qe2Var2 = qe2Var;
                                w45 w45Var2 = w45Var;
                                a55 a55Var2 = a55Var;
                                String str3 = (String) obj6;
                                switch (b2) {
                                    case 0:
                                        a55Var2.getClass();
                                        w45Var2.m = false;
                                        a55Var2.u(w45Var2);
                                        qe2Var2.a(null, str3);
                                        return;
                                    default:
                                        a55Var2.u(w45Var2);
                                        qe2Var2.a(null, str3);
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (w45Var.l < 0 && !"disconnect".equals(str2)) {
                        qe2Var.a(w45Var, null);
                        return;
                    } else {
                        c35Var.close();
                        a55Var.e(w45Var, false, new pcc() {
                            @Override
                            public final void a(Object obj6) {
                                byte b2 = r4;
                                qe2 qe2Var2 = qe2Var;
                                w45 w45Var2 = w45Var;
                                a55 a55Var2 = a55Var;
                                String str3 = (String) obj6;
                                switch (b2) {
                                    case 0:
                                        a55Var2.getClass();
                                        w45Var2.m = false;
                                        a55Var2.u(w45Var2);
                                        qe2Var2.a(null, str3);
                                        return;
                                    default:
                                        a55Var2.u(w45Var2);
                                        qe2Var2.a(null, str3);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                }
                qe2Var.a(null, "Request expired or wallet changed");
                return;
            case 2:
                jn7.f(i).k(139, (String) obj5, (TLRPC.InputFile) obj3, (TLRPC.InputEncryptedFile) obj2, (byte[]) obj, (byte[]) obj4, Long.valueOf(j));
                return;
            case 3:
                uc7 uc7Var = (uc7) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                Runnable[] runnableArr = (Runnable[]) obj;
                jc7 jc7Var = (jc7) obj4;
                if (!((boolean[]) obj3)[0]) {
                    if (chat != null) {
                        uc7Var.getMessagesController().a4(chat, true);
                        runnableArr[0] = uc7Var.r0(j, i, jc7Var);
                        return;
                    } else if (jc7Var != null) {
                        jc7Var.a();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                uc7 uc7Var2 = (uc7) obj5;
                TLObject tLObject = (TLObject) obj2;
                zh6 zh6Var = (zh6) obj;
                ArrayList arrayList2 = (ArrayList) ((HashMap) obj4).remove((String) obj3);
                if (arrayList2 != null) {
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    if (tLObject instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
                        uc7Var2.j4(webpagepreview.users, false);
                        uc7Var2.c4(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        }
                    }
                    if (tL_messageMediaWebPage == null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            ((r47) arrayList2.get(i2)).k.media.webpage = new TLRPC.TL_webPageEmpty();
                            tL_messages_messages.messages.add(((r47) arrayList2.get(i2)).k);
                        }
                    } else {
                        TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
                        if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                            zh6Var.k(webPage.id, arrayList2);
                        } else {
                            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                ((r47) arrayList2.get(i3)).k.media.webpage = tL_messageMediaWebPage.webpage;
                                if (i3 == 0) {
                                    in5.R(((r47) arrayList2.get(i3)).k);
                                }
                                tL_messages_messages.messages.add(((r47) arrayList2.get(i3)).k);
                            }
                        }
                    }
                    if (!tL_messages_messages.messages.isEmpty()) {
                        jf7 messagesStorage = uc7Var2.getMessagesStorage();
                        int i4 = this.c;
                        long j4 = this.b;
                        messagesStorage.e1(-2, 0, i4, j4, 0L, tL_messages_messages, false);
                        uc7Var2.getNotificationCenter().k(50, Long.valueOf(j4), arrayList2);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public qe(int i, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j) {
        this.a = (byte) 2;
        this.c = i;
        this.d = str;
        this.e = inputFile;
        this.f = inputEncryptedFile;
        this.h = bArr;
        this.n = bArr2;
        this.b = j;
    }

    public qe(uc7 uc7Var, HashMap hashMap, String str, TLObject tLObject, zh6 zh6Var, long j, int i) {
        this.a = (byte) 4;
        this.d = uc7Var;
        this.n = hashMap;
        this.e = str;
        this.f = tLObject;
        this.h = zh6Var;
        this.b = j;
        this.c = i;
    }

    public qe(Object obj, Object obj2, Object obj3, Serializable serializable, long j, int i, Object obj4, byte b) {
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
