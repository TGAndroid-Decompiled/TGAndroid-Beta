package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d;
public final class bh2 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;

    public bh2(hh2 hh2Var, int[] iArr, ArrayList arrayList, boolean z, TLRPC.User user) {
        this.a = (byte) 0;
        this.d = hh2Var;
        this.e = iArr;
        this.b = arrayList;
        this.c = z;
        this.f = user;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        a6a a6aVar;
        TL_iv.TL_inputRichMessage tL_inputRichMessage;
        switch (this.a) {
            case 0:
                hh2 hh2Var = (hh2) this.d;
                hh2Var.getClass();
                gm.c3(new q4a(hh2Var, tL_error, tLObject, (int[]) this.e, (ArrayList) this.b, this.c, (TLRPC.User) this.f));
                return;
            case 1:
                bw2 bw2Var = (bw2) this.d;
                ArrayList arrayList = (ArrayList) this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                boolean z = this.c;
                String str = (String) this.f;
                if (tL_error == null) {
                    bw2Var.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    cf7 messagesStorage = bw2Var.getMessagesStorage();
                    messagesStorage.getClass();
                    if (!arrayList.isEmpty()) {
                        messagesStorage.a.c(new p51(messagesStorage, arrayList, (byte) 23));
                    }
                    Utilities.h.c(new rv2(bw2Var, arrayList2, (byte) 2));
                    for (int i = 0; i < arrayList2.size(); i++) {
                        TLRPC.User user = (TLRPC.User) arrayList2.get(i);
                        if (!TextUtils.isEmpty(user.phone)) {
                            bw2Var.getMessagesStorage().e(user.phone, "");
                            yv2 yv2Var = (yv2) bw2Var.a0.get(user.phone);
                            if (yv2Var != null && (indexOf = yv2Var.g.indexOf(user.phone)) != -1) {
                                yv2Var.h.set(indexOf, 1);
                            }
                        }
                    }
                    gm.c3(new rh(bw2Var, arrayList2, z, str, (byte) 14));
                    return;
                }
                return;
            case 2:
                x07 x07Var = (x07) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                boolean z2 = this.c;
                TLRPC.User user2 = (TLRPC.User) this.f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.b;
                if (tL_error == null) {
                    oc7.r1(x07Var.k).T3((TLRPC.TL_updates) tLObject, false);
                }
                gm.c3(new q4a(x07Var, tL_error, tLObject, tL_chatInviteImporter, z2, user2, tL_messages_hideChatJoinRequest));
                return;
            case 3:
                gm.c3(new b5a((a6a) this.d, tLObject, (TLRPC.TL_messages_requestUrlAuth) this.e, (yv1) this.b, (String) this.f, this.c, (byte) 0));
                return;
            case 4:
                a6a a6aVar2 = (a6a) this.d;
                boolean z3 = this.c;
                k47 k47Var = (k47) this.e;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.b;
                d dVar = (d) this.f;
                if (tL_error == null) {
                    if (z3 && k47Var != null) {
                        k47Var.A2 = true;
                    }
                    a6aVar2.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    gm.c3(new au1(a6aVar2, k47Var));
                    return;
                }
                if (ad4.r(tL_error.text)) {
                    String str2 = tL_error.text;
                    aa7 aa7Var = new aa7(a6aVar2, tL_messages_editMessage, k47Var, dVar, z3);
                    a6aVar = a6aVar2;
                    if (k47Var != null && (tL_inputRichMessage = tL_messages_editMessage.rich_message) != null) {
                        ArrayList arrayList3 = new ArrayList(tL_inputRichMessage.documents.size() + tL_inputRichMessage.photos.size());
                        arrayList3.addAll(tL_inputRichMessage.photos);
                        arrayList3.addAll(tL_inputRichMessage.documents);
                        if (!arrayList3.isEmpty()) {
                            int c = ad4.c(str2);
                            a6aVar.getFileRefController().u(new Object[]{arrayList3.get((c < 0 || c >= arrayList3.size()) ? 0 : 0), aa7Var}, k47Var);
                            return;
                        }
                    }
                } else {
                    a6aVar = a6aVar2;
                }
                gm.c3(new il9(a6aVar, k47Var, (byte) 25));
                if (dVar != null) {
                    gm.c3(new v3a(a6aVar, tL_error, dVar, tL_messages_editMessage, (byte) 1));
                    return;
                }
                return;
            default:
                gm.c3(new q4a((p5c) this.d, tL_error, this.c, tLObject, (byte[]) this.e, (String) this.b, (TL_account.passwordInputSettings) this.f));
                return;
        }
    }

    public bh2(bw2 bw2Var, ArrayList arrayList, ArrayList arrayList2, boolean z, String str) {
        this.a = (byte) 1;
        this.d = bw2Var;
        this.b = arrayList;
        this.e = arrayList2;
        this.c = z;
        this.f = str;
    }

    public bh2(x07 x07Var, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.a = (byte) 2;
        this.d = x07Var;
        this.e = tL_chatInviteImporter;
        this.c = z;
        this.f = user;
        this.b = tL_messages_hideChatJoinRequest;
    }

    public bh2(a6a a6aVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, yv1 yv1Var, String str, boolean z) {
        this.a = (byte) 3;
        this.d = a6aVar;
        this.e = tL_messages_requestUrlAuth;
        this.b = yv1Var;
        this.f = str;
        this.c = z;
    }

    public bh2(Object obj, boolean z, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.c = z;
        this.e = obj2;
        this.b = obj3;
        this.f = obj4;
    }
}
