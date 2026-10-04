package gg;

import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fy;
public final class s implements Runnable {
    public final int f10770a;
    public final Object f10771b;
    public final int f10772c;
    public final int d;
    public final Object f10773e;
    public final Object f10774f;
    public final TLObject h;
    public final ArrayList f10775n;
    public final TLObject f10776r;

    public s(i0 i0Var, int i10, int i11, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i12) {
        this.f10770a = i12;
        this.f10771b = i0Var;
        this.f10772c = i10;
        this.d = i11;
        this.f10773e = tL_error;
        this.f10774f = str;
        this.h = tLObject;
        this.f10776r = tLMethod;
        this.f10775n = arrayList;
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
        int i12 = this.f10770a;
        ArrayList arrayList = this.f10775n;
        TLObject tLObject = this.h;
        int i13 = this.d;
        int i14 = this.f10772c;
        TLObject tLObject2 = this.f10776r;
        Object obj = this.f10774f;
        Object obj2 = this.f10773e;
        Object obj3 = this.f10771b;
        switch (i12) {
            case 0:
                i0 i0Var = (i0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject2;
                z zVar = i0Var.f10622j0;
                ArrayList arrayList2 = i0Var.H;
                int i15 = i0Var.f10633s0;
                if (i14 == i0Var.T && (i13 <= 0 || i13 == i0Var.f10614d0)) {
                    i0Var.D0--;
                    if (tL_error == null) {
                        i0Var.f10611b0 = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i15).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i15).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i15).putChats(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        i0Var.f10613c0 = messages_messages.next_rate;
                        for (int i16 = 0; i16 < messages_messages.messages.size(); i16++) {
                            TLRPC.Message message = messages_messages.messages.get(i16);
                            int i17 = MessagesController.getInstance(i15).deletedHistory.get(MessageObject.getDialogId(message));
                            if (i17 == 0 || message.f20063id > i17) {
                                arrayList2.add((MessageObject) arrayList.get(i16));
                            }
                        }
                        i0Var.N = true;
                        if (messages_messages.messages.size() != 20) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i0Var.X = z10;
                        if (i13 > 0) {
                            i0Var.f10619g0 = i13;
                            if (i0Var.f10618f0 != i13) {
                                i0Var.f10632s.clear();
                            }
                            if (i0Var.f10616e0 != i13) {
                                zVar.b();
                            }
                        }
                        zVar.f(i0Var.f10632s, i0Var.f10636v0);
                        fy fyVar = i0Var.U;
                        if (fyVar != null) {
                            if (i0Var.D0 > 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            fyVar.d(z11, true);
                            i0Var.U.c();
                        }
                        i0Var.l();
                    }
                }
                i0Var.Q = 0;
                return;
            case 1:
                i0 i0Var2 = (i0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str2 = (String) obj;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) tLObject2;
                z zVar2 = i0Var2.f10622j0;
                ArrayList arrayList3 = i0Var2.I;
                ArrayList arrayList4 = i0Var2.H;
                int i18 = i0Var2.f10633s0;
                if (i14 == i0Var2.P && (i13 <= 0 || i13 == i0Var2.f10614d0)) {
                    i0Var2.D0--;
                    if (tL_error2 == null) {
                        i0Var2.f10611b0 = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i18).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i18).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i18).putChats(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        i0Var2.f10613c0 = messages_messages2.next_rate;
                        for (int i19 = 0; i19 < messages_messages2.messages.size(); i19++) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i19);
                            int i20 = MessagesController.getInstance(i18).deletedHistory.get(MessageObject.getDialogId(message2));
                            if (i20 == 0 || message2.f20063id > i20) {
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
                                    if (num.intValue() < message2.f20063id) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    message2.unread = z14;
                                }
                            }
                        }
                        i0Var2.N = true;
                        if (messages_messages2.messages.size() != 20) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        i0Var2.W = z12;
                        if (i13 > 0) {
                            i0Var2.f10619g0 = i13;
                            if (i0Var2.f10618f0 != i13) {
                                i0Var2.f10632s.clear();
                            }
                            if (i0Var2.f10616e0 != i13) {
                                zVar2.b();
                            }
                        }
                        zVar2.f(i0Var2.f10632s, i0Var2.f10636v0);
                        fy fyVar2 = i0Var2.U;
                        if (fyVar2 != null) {
                            if (i0Var2.D0 > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            i11 = 1;
                            fyVar2.d(z13, true);
                            i0Var2.U.c();
                        } else {
                            i11 = 1;
                        }
                        i0Var2.G0 = i11;
                        i0Var2.H0 = i11;
                        i10 = 0;
                        i0Var2.d = false;
                        e0 e0Var = i0Var2.E0;
                        if (e0Var != null) {
                            String str3 = i0Var2.Z;
                            TextView textView = e0Var.f10565a;
                            int i22 = R.string.SearchMessagesFilterEmptyText;
                            Object[] objArr = new Object[i11];
                            objArr[0] = str3;
                            textView.setText(LocaleController.formatString(i22, objArr));
                        }
                        i0Var2.l();
                        i0Var2.O = i10;
                        return;
                    }
                }
                i10 = 0;
                i0Var2.O = i10;
                return;
            default:
                ((MediaDataController) obj3).lambda$processLoadStickersResponse$73(this.h, this.f10775n, this.f10772c, (a0.i) obj2, (TLRPC.StickerSet) obj, (TLRPC.TL_messages_allStickers) tLObject2, this.d);
                return;
        }
    }

    public s(MediaDataController mediaDataController, TLObject tLObject, ArrayList arrayList, int i10, a0.i iVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i11) {
        this.f10770a = 2;
        this.f10771b = mediaDataController;
        this.h = tLObject;
        this.f10775n = arrayList;
        this.f10772c = i10;
        this.f10773e = iVar;
        this.f10774f = stickerSet;
        this.f10776r = tL_messages_allStickers;
        this.d = i11;
    }
}
