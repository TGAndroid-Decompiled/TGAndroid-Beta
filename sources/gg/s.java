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
    public final int f10789a;
    public final Object f10790b;
    public final int f10791c;
    public final int d;
    public final Object f10792e;
    public final Object f10793f;
    public final TLObject h;
    public final ArrayList f10794n;
    public final TLObject f10795r;

    public s(h0 h0Var, int i10, int i11, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i12) {
        this.f10789a = i12;
        this.f10790b = h0Var;
        this.f10791c = i10;
        this.d = i11;
        this.f10792e = tL_error;
        this.f10793f = str;
        this.h = tLObject;
        this.f10795r = tLMethod;
        this.f10794n = arrayList;
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
        int i12 = this.f10789a;
        ArrayList arrayList = this.f10794n;
        TLObject tLObject = this.h;
        int i13 = this.d;
        int i14 = this.f10791c;
        boolean z15 = true;
        int i15 = 0;
        TLObject tLObject2 = this.f10795r;
        Object obj = this.f10793f;
        Object obj2 = this.f10792e;
        Object obj3 = this.f10790b;
        switch (i12) {
            case 0:
                h0 h0Var = (h0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject2;
                y yVar = h0Var.f10627j0;
                ArrayList arrayList2 = h0Var.H;
                int i16 = h0Var.f10638s0;
                if (i14 == h0Var.T && (i13 <= 0 || i13 == h0Var.f10619d0)) {
                    h0Var.D0--;
                    if (tL_error == null) {
                        h0Var.f10616b0 = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i16).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i16).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i16).putChats(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        h0Var.f10618c0 = messages_messages.next_rate;
                        for (int i17 = 0; i17 < messages_messages.messages.size(); i17++) {
                            TLRPC.Message message = messages_messages.messages.get(i17);
                            int i18 = MessagesController.getInstance(i16).deletedHistory.get(MessageObject.getDialogId(message));
                            if (i18 == 0 || message.f20059id > i18) {
                                arrayList2.add((MessageObject) arrayList.get(i17));
                            }
                        }
                        h0Var.N = true;
                        if (messages_messages.messages.size() != 20) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        h0Var.X = z10;
                        if (i13 > 0) {
                            h0Var.f10624g0 = i13;
                            if (h0Var.f10623f0 != i13) {
                                h0Var.f10637s.clear();
                            }
                            if (h0Var.f10621e0 != i13) {
                                yVar.b();
                            }
                        }
                        yVar.f(h0Var.f10637s, h0Var.f10641v0);
                        fy fyVar = h0Var.U;
                        if (fyVar != null) {
                            if (h0Var.D0 > 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            fyVar.d(z11, true);
                            h0Var.U.c();
                        }
                        h0Var.l();
                    }
                }
                h0Var.Q = 0;
                return;
            case 1:
                h0 h0Var2 = (h0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str2 = (String) obj;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) tLObject2;
                y yVar2 = h0Var2.f10627j0;
                ArrayList arrayList3 = h0Var2.I;
                ArrayList arrayList4 = h0Var2.H;
                int i19 = h0Var2.f10638s0;
                if (i14 == h0Var2.P && (i13 <= 0 || i13 == h0Var2.f10619d0)) {
                    h0Var2.D0--;
                    if (tL_error2 == null) {
                        h0Var2.f10616b0 = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i19).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i19).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i19).putChats(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        h0Var2.f10618c0 = messages_messages2.next_rate;
                        int i20 = 0;
                        while (i20 < messages_messages2.messages.size()) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i20);
                            int i21 = MessagesController.getInstance(i19).deletedHistory.get(MessageObject.getDialogId(message2));
                            if (i21 == 0 || message2.f20059id > i21) {
                                MessageObject messageObject = (MessageObject) arrayList.get(i20);
                                if (!arrayList4.isEmpty()) {
                                    for (int i22 = i15; i22 < arrayList4.size(); i22++) {
                                        MessageObject messageObject2 = (MessageObject) arrayList4.get(i22);
                                        if (messageObject2 == null || messageObject == null || messageObject.getId() != messageObject2.getId() || messageObject.getDialogId() != messageObject2.getDialogId()) {
                                        }
                                    }
                                }
                                arrayList3.add(messageObject);
                                long dialogId = MessageObject.getDialogId(message2);
                                if (message2.out) {
                                    concurrentHashMap = MessagesController.getInstance(i19).dialogs_read_outbox_max;
                                } else {
                                    concurrentHashMap = MessagesController.getInstance(i19).dialogs_read_inbox_max;
                                }
                                Integer num = concurrentHashMap.get(Long.valueOf(dialogId));
                                if (num != null) {
                                    if (num.intValue() < message2.f20059id) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    message2.unread = z14;
                                }
                            }
                            i20++;
                            z15 = true;
                            i15 = 0;
                        }
                        h0Var2.N = z15;
                        if (messages_messages2.messages.size() != 20) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        h0Var2.W = z12;
                        if (i13 > 0) {
                            h0Var2.f10624g0 = i13;
                            if (h0Var2.f10623f0 != i13) {
                                h0Var2.f10637s.clear();
                            }
                            if (h0Var2.f10621e0 != i13) {
                                yVar2.b();
                            }
                        }
                        yVar2.f(h0Var2.f10637s, h0Var2.f10641v0);
                        fy fyVar2 = h0Var2.U;
                        if (fyVar2 != null) {
                            if (h0Var2.D0 > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            i11 = 1;
                            fyVar2.d(z13, true);
                            h0Var2.U.c();
                        } else {
                            i11 = 1;
                        }
                        h0Var2.G0 = i11;
                        h0Var2.H0 = i11;
                        i10 = 0;
                        h0Var2.d = false;
                        d0 d0Var = h0Var2.E0;
                        if (d0Var != null) {
                            String str3 = h0Var2.Z;
                            TextView textView = d0Var.f10568a;
                            int i23 = R.string.SearchMessagesFilterEmptyText;
                            Object[] objArr = new Object[i11];
                            objArr[0] = str3;
                            textView.setText(LocaleController.formatString(i23, objArr));
                        }
                        h0Var2.l();
                        h0Var2.O = i10;
                        return;
                    }
                }
                i10 = 0;
                h0Var2.O = i10;
                return;
            default:
                ((MediaDataController) obj3).lambda$processLoadStickersResponse$73(this.h, this.f10794n, this.f10791c, (a0.i) obj2, (TLRPC.StickerSet) obj, (TLRPC.TL_messages_allStickers) tLObject2, this.d);
                return;
        }
    }

    public s(MediaDataController mediaDataController, TLObject tLObject, ArrayList arrayList, int i10, a0.i iVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i11) {
        this.f10789a = 2;
        this.f10790b = mediaDataController;
        this.h = tLObject;
        this.f10794n = arrayList;
        this.f10791c = i10;
        this.f10792e = iVar;
        this.f10793f = stickerSet;
        this.f10795r = tL_messages_allStickers;
        this.d = i11;
    }
}
