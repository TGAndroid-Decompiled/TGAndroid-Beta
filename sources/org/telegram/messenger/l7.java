package org.telegram.messenger;

import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.rx;

public final class l7 implements Runnable {

    public final int f20845a;

    public final int f20846b;

    public final int f20847c;
    public final TLObject d;

    public final ArrayList f20848e;

    public final Object f20849f;
    public final Object h;

    public final Object f20850n;

    public final TLObject f20851r;

    public l7(MediaDataController mediaDataController, TLObject tLObject, ArrayList arrayList, int i10, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i11) {
        this.f20845a = 0;
        this.f20849f = mediaDataController;
        this.d = tLObject;
        this.f20848e = arrayList;
        this.f20846b = i10;
        this.h = hVar;
        this.f20850n = stickerSet;
        this.f20851r = tL_messages_allStickers;
        this.f20847c = i11;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        ConcurrentHashMap<Long, Integer> concurrentHashMap;
        Integer num;
        boolean z10;
        int i12 = this.f20845a;
        ArrayList arrayList = this.f20848e;
        TLObject tLObject = this.d;
        int i13 = this.f20847c;
        int i14 = this.f20846b;
        TLObject tLObject2 = this.f20851r;
        Object obj = this.f20850n;
        Object obj2 = this.h;
        Object obj3 = this.f20849f;
        switch (i12) {
            case 0:
                ((MediaDataController) obj3).lambda$processLoadStickersResponse$73(this.d, this.f20848e, this.f20846b, (a0.h) obj2, (TLRPC.StickerSet) obj, (TLRPC.TL_messages_allStickers) tLObject2, this.f20847c);
                break;
            case 1:
                pf.z zVar = (pf.z) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject2;
                pf.s sVar = zVar.f45987f0;
                ArrayList arrayList2 = zVar.D;
                int i15 = zVar.f45996o0;
                if (i14 == zVar.P && (i13 <= 0 || i13 == zVar.Z)) {
                    zVar.f46012z0--;
                    if (tL_error == null) {
                        zVar.X = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i15).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i15).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i15).putChats(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        zVar.Y = messages_messages.next_rate;
                        for (int i16 = 0; i16 < messages_messages.messages.size(); i16++) {
                            TLRPC.Message message = messages_messages.messages.get(i16);
                            int i17 = MessagesController.getInstance(i15).deletedHistory.get(MessageObject.getDialogId(message));
                            if (i17 == 0 || message.f22401id > i17) {
                                arrayList2.add((MessageObject) arrayList.get(i16));
                            }
                        }
                        zVar.J = true;
                        zVar.T = messages_messages.messages.size() != 20;
                        if (i13 > 0) {
                            zVar.f45982c0 = i13;
                            if (zVar.f45980b0 != i13) {
                                zVar.f46001s.clear();
                            }
                            if (zVar.f45979a0 != i13) {
                                sVar.b();
                            }
                        }
                        sVar.f(zVar.f46001s, zVar.f46000r0);
                        rx rxVar = zVar.Q;
                        if (rxVar != null) {
                            rxVar.d(zVar.f46012z0 > 0, true);
                            zVar.Q.c();
                        }
                        zVar.l();
                    }
                }
                zVar.M = 0;
                break;
            default:
                pf.z zVar2 = (pf.z) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str2 = (String) obj;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) tLObject2;
                pf.s sVar2 = zVar2.f45987f0;
                ArrayList arrayList3 = zVar2.E;
                ArrayList arrayList4 = zVar2.D;
                int i18 = zVar2.f45996o0;
                if (i14 != zVar2.L || (i13 > 0 && i13 != zVar2.Z)) {
                    i10 = 0;
                } else {
                    zVar2.f46012z0--;
                    if (tL_error2 == null) {
                        zVar2.X = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i18).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i18).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i18).putChats(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        zVar2.Y = messages_messages2.next_rate;
                        for (int i19 = 0; i19 < messages_messages2.messages.size(); i19++) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i19);
                            int i20 = MessagesController.getInstance(i18).deletedHistory.get(MessageObject.getDialogId(message2));
                            if (i20 == 0 || message2.f22401id > i20) {
                                MessageObject messageObject = (MessageObject) arrayList.get(i19);
                                if (arrayList4.isEmpty()) {
                                    arrayList3.add(messageObject);
                                    long dialogId = MessageObject.getDialogId(message2);
                                    if (message2.out) {
                                        concurrentHashMap = MessagesController.getInstance(i18).dialogs_read_outbox_max;
                                    } else {
                                        concurrentHashMap = MessagesController.getInstance(i18).dialogs_read_inbox_max;
                                    }
                                    num = concurrentHashMap.get(Long.valueOf(dialogId));
                                    if (num == null) {
                                        if (num.intValue() < message2.f22401id) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        message2.unread = z10;
                                    }
                                } else {
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 < arrayList4.size()) {
                                            MessageObject messageObject2 = (MessageObject) arrayList4.get(i21);
                                            if (messageObject2 == null || messageObject == null || messageObject.getId() != messageObject2.getId() || messageObject.getDialogId() != messageObject2.getDialogId()) {
                                                i21++;
                                            }
                                        } else {
                                            arrayList3.add(messageObject);
                                            long dialogId2 = MessageObject.getDialogId(message2);
                                            if (message2.out) {
                                                concurrentHashMap = MessagesController.getInstance(i18).dialogs_read_outbox_max;
                                            } else {
                                                concurrentHashMap = MessagesController.getInstance(i18).dialogs_read_inbox_max;
                                            }
                                            num = concurrentHashMap.get(Long.valueOf(dialogId2));
                                            if (num == null) {
                                                if (num.intValue() < message2.f22401id) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                message2.unread = z10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        zVar2.J = true;
                        zVar2.S = messages_messages2.messages.size() != 20;
                        if (i13 > 0) {
                            zVar2.f45982c0 = i13;
                            if (zVar2.f45980b0 != i13) {
                                zVar2.f46001s.clear();
                            }
                            if (zVar2.f45979a0 != i13) {
                                sVar2.b();
                            }
                        }
                        sVar2.f(zVar2.f46001s, zVar2.f46000r0);
                        rx rxVar2 = zVar2.Q;
                        if (rxVar2 != null) {
                            i11 = 1;
                            rxVar2.d(zVar2.f46012z0 > 0, true);
                            zVar2.Q.c();
                        } else {
                            i11 = 1;
                        }
                        zVar2.C0 = i11;
                        zVar2.D0 = i11;
                        i10 = 0;
                        zVar2.d = false;
                        pf.v vVar = zVar2.A0;
                        if (vVar != null) {
                            String str3 = zVar2.V;
                            TextView textView = vVar.f45955a;
                            int i22 = R.string.SearchMessagesFilterEmptyText;
                            Object[] objArr = new Object[i11];
                            objArr[0] = str3;
                            textView.setText(LocaleController.formatString(i22, objArr));
                        }
                        zVar2.l();
                    } else {
                        i10 = 0;
                    }
                }
                zVar2.K = i10;
                break;
        }
    }

    public l7(pf.z zVar, int i10, int i11, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i12) {
        this.f20845a = i12;
        this.f20849f = zVar;
        this.f20846b = i10;
        this.f20847c = i11;
        this.h = tL_error;
        this.f20850n = str;
        this.d = tLObject;
        this.f20851r = tLMethod;
        this.f20848e = arrayList;
    }
}
