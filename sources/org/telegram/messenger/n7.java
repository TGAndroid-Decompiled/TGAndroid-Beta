package org.telegram.messenger;

import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qx;
public final class n7 implements Runnable {
    public final int f21033a;
    public final int f21034b;
    public final int f21035c;
    public final TLObject d;
    public final ArrayList f21036e;
    public final Object f21037f;
    public final Object h;
    public final Object f21038n;
    public final TLObject f21039r;

    public n7(MediaDataController mediaDataController, TLObject tLObject, ArrayList arrayList, int i10, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i11) {
        this.f21033a = 0;
        this.f21037f = mediaDataController;
        this.d = tLObject;
        this.f21036e = arrayList;
        this.f21034b = i10;
        this.h = hVar;
        this.f21038n = stickerSet;
        this.f21039r = tL_messages_allStickers;
        this.f21035c = i11;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        boolean z13;
        ConcurrentHashMap<Long, Integer> concurrentHashMap;
        boolean z14;
        int i12 = this.f21033a;
        ArrayList arrayList = this.f21036e;
        TLObject tLObject = this.d;
        int i13 = this.f21035c;
        int i14 = this.f21034b;
        TLObject tLObject2 = this.f21039r;
        Object obj = this.f21038n;
        Object obj2 = this.h;
        Object obj3 = this.f21037f;
        switch (i12) {
            case 0:
                ((MediaDataController) obj3).lambda$processLoadStickersResponse$73(this.d, this.f21036e, this.f21034b, (a0.h) obj2, (TLRPC.StickerSet) obj, (TLRPC.TL_messages_allStickers) tLObject2, this.f21035c);
                return;
            case 1:
                rf.a0 a0Var = (rf.a0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject2;
                rf.t tVar = a0Var.f47146f0;
                ArrayList arrayList2 = a0Var.D;
                int i15 = a0Var.f47155o0;
                if (i14 == a0Var.P && (i13 <= 0 || i13 == a0Var.Z)) {
                    a0Var.f47171z0--;
                    if (tL_error == null) {
                        a0Var.X = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i15).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i15).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i15).putChats(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        a0Var.Y = messages_messages.next_rate;
                        for (int i16 = 0; i16 < messages_messages.messages.size(); i16++) {
                            TLRPC.Message message = messages_messages.messages.get(i16);
                            int i17 = MessagesController.getInstance(i15).deletedHistory.get(MessageObject.getDialogId(message));
                            if (i17 == 0 || message.f22413id > i17) {
                                arrayList2.add((MessageObject) arrayList.get(i16));
                            }
                        }
                        a0Var.J = true;
                        if (messages_messages.messages.size() != 20) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        a0Var.T = z10;
                        if (i13 > 0) {
                            a0Var.f47141c0 = i13;
                            if (a0Var.f47139b0 != i13) {
                                a0Var.f47160s.clear();
                            }
                            if (a0Var.f47138a0 != i13) {
                                tVar.b();
                            }
                        }
                        tVar.f(a0Var.f47160s, a0Var.f47159r0);
                        qx qxVar = a0Var.Q;
                        if (qxVar != null) {
                            if (a0Var.f47171z0 > 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            qxVar.d(z11, true);
                            a0Var.Q.c();
                        }
                        a0Var.l();
                    }
                }
                a0Var.M = 0;
                return;
            default:
                rf.a0 a0Var2 = (rf.a0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str2 = (String) obj;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) tLObject2;
                rf.t tVar2 = a0Var2.f47146f0;
                ArrayList arrayList3 = a0Var2.E;
                ArrayList arrayList4 = a0Var2.D;
                int i18 = a0Var2.f47155o0;
                if (i14 == a0Var2.L && (i13 <= 0 || i13 == a0Var2.Z)) {
                    a0Var2.f47171z0--;
                    if (tL_error2 == null) {
                        a0Var2.X = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i18).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i18).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i18).putChats(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        a0Var2.Y = messages_messages2.next_rate;
                        for (int i19 = 0; i19 < messages_messages2.messages.size(); i19++) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i19);
                            int i20 = MessagesController.getInstance(i18).deletedHistory.get(MessageObject.getDialogId(message2));
                            if (i20 == 0 || message2.f22413id > i20) {
                                MessageObject messageObject = (MessageObject) arrayList.get(i19);
                                if (!arrayList4.isEmpty()) {
                                    for (int i21 = 0; i21 < arrayList4.size(); i21++) {
                                        MessageObject messageObject2 = (MessageObject) arrayList4.get(i21);
                                        if (messageObject2 == null || messageObject == null || messageObject.getId() != messageObject2.getId() || messageObject.getDialogId() != messageObject2.getDialogId()) {
                                        }
                                    }
                                }
                                arrayList3.add(messageObject);
                                long dialogId = MessageObject.getDialogId(message2);
                                if (message2.out) {
                                    concurrentHashMap = MessagesController.getInstance(i18).dialogs_read_outbox_max;
                                } else {
                                    concurrentHashMap = MessagesController.getInstance(i18).dialogs_read_inbox_max;
                                }
                                Integer num = concurrentHashMap.get(Long.valueOf(dialogId));
                                if (num != null) {
                                    if (num.intValue() < message2.f22413id) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    message2.unread = z14;
                                }
                            }
                        }
                        a0Var2.J = true;
                        if (messages_messages2.messages.size() != 20) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        a0Var2.S = z12;
                        if (i13 > 0) {
                            a0Var2.f47141c0 = i13;
                            if (a0Var2.f47139b0 != i13) {
                                a0Var2.f47160s.clear();
                            }
                            if (a0Var2.f47138a0 != i13) {
                                tVar2.b();
                            }
                        }
                        tVar2.f(a0Var2.f47160s, a0Var2.f47159r0);
                        qx qxVar2 = a0Var2.Q;
                        if (qxVar2 != null) {
                            if (a0Var2.f47171z0 > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            i11 = 1;
                            qxVar2.d(z13, true);
                            a0Var2.Q.c();
                        } else {
                            i11 = 1;
                        }
                        a0Var2.C0 = i11;
                        a0Var2.D0 = i11;
                        i10 = 0;
                        a0Var2.d = false;
                        rf.w wVar = a0Var2.A0;
                        if (wVar != null) {
                            String str3 = a0Var2.V;
                            TextView textView = wVar.f47396a;
                            int i22 = R.string.SearchMessagesFilterEmptyText;
                            Object[] objArr = new Object[i11];
                            objArr[0] = str3;
                            textView.setText(LocaleController.formatString(i22, objArr));
                        }
                        a0Var2.l();
                        a0Var2.K = i10;
                        return;
                    }
                }
                i10 = 0;
                a0Var2.K = i10;
                return;
        }
    }

    public n7(rf.a0 a0Var, int i10, int i11, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i12) {
        this.f21033a = i12;
        this.f21037f = a0Var;
        this.f21034b = i10;
        this.f21035c = i11;
        this.h = tL_error;
        this.f21038n = str;
        this.d = tLObject;
        this.f21039r = tLMethod;
        this.f21036e = arrayList;
    }
}
