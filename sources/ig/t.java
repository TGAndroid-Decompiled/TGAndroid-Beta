package ig;

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
import org.telegram.ui.ox;
public final class t implements Runnable {
    public final int f14244a;
    public final Object f14245b;
    public final int f14246c;
    public final int d;
    public final Object e;
    public final Object f14247f;
    public final TLObject h;
    public final ArrayList f14248n;
    public final TLObject f14249r;

    public t(i0 i0Var, int i10, int i11, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i12) {
        this.f14244a = i12;
        this.f14245b = i0Var;
        this.f14246c = i10;
        this.d = i11;
        this.e = tL_error;
        this.f14247f = str;
        this.h = tLObject;
        this.f14249r = tLMethod;
        this.f14248n = arrayList;
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
        int i12 = this.f14244a;
        ArrayList arrayList = this.f14248n;
        TLObject tLObject = this.h;
        int i13 = this.d;
        int i14 = this.f14246c;
        boolean z15 = true;
        int i15 = 0;
        TLObject tLObject2 = this.f14249r;
        Object obj = this.f14247f;
        Object obj2 = this.e;
        Object obj3 = this.f14245b;
        switch (i12) {
            case 0:
                i0 i0Var = (i0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject2;
                y yVar = i0Var.f14082j0;
                ArrayList arrayList2 = i0Var.H;
                int i16 = i0Var.f14093s0;
                if (i14 == i0Var.T && (i13 <= 0 || i13 == i0Var.f14075d0)) {
                    i0Var.D0--;
                    if (tL_error == null) {
                        i0Var.f14072b0 = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i16).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i16).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i16).putChats(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        i0Var.f14074c0 = messages_messages.next_rate;
                        for (int i17 = 0; i17 < messages_messages.messages.size(); i17++) {
                            TLRPC.Message message = messages_messages.messages.get(i17);
                            int i18 = MessagesController.getInstance(i16).deletedHistory.get(MessageObject.getDialogId(message));
                            if (i18 == 0 || message.f22049id > i18) {
                                arrayList2.add((MessageObject) arrayList.get(i17));
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
                            i0Var.f14079g0 = i13;
                            if (i0Var.f14078f0 != i13) {
                                i0Var.f14092s.clear();
                            }
                            if (i0Var.f14076e0 != i13) {
                                yVar.b();
                            }
                        }
                        yVar.f(i0Var.f14092s, i0Var.f14096v0);
                        ox oxVar = i0Var.U;
                        if (oxVar != null) {
                            if (i0Var.D0 > 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            oxVar.d(z11, true);
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
                y yVar2 = i0Var2.f14082j0;
                ArrayList arrayList3 = i0Var2.I;
                ArrayList arrayList4 = i0Var2.H;
                int i19 = i0Var2.f14093s0;
                if (i14 == i0Var2.P && (i13 <= 0 || i13 == i0Var2.f14075d0)) {
                    i0Var2.D0--;
                    if (tL_error2 == null) {
                        i0Var2.f14072b0 = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i19).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i19).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i19).putChats(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        i0Var2.f14074c0 = messages_messages2.next_rate;
                        int i20 = 0;
                        while (i20 < messages_messages2.messages.size()) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i20);
                            int i21 = MessagesController.getInstance(i19).deletedHistory.get(MessageObject.getDialogId(message2));
                            if (i21 == 0 || message2.f22049id > i21) {
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
                                    if (num.intValue() < message2.f22049id) {
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
                        i0Var2.N = z15;
                        if (messages_messages2.messages.size() != 20) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        i0Var2.W = z12;
                        if (i13 > 0) {
                            i0Var2.f14079g0 = i13;
                            if (i0Var2.f14078f0 != i13) {
                                i0Var2.f14092s.clear();
                            }
                            if (i0Var2.f14076e0 != i13) {
                                yVar2.b();
                            }
                        }
                        yVar2.f(i0Var2.f14092s, i0Var2.f14096v0);
                        ox oxVar2 = i0Var2.U;
                        if (oxVar2 != null) {
                            if (i0Var2.D0 > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            i11 = 1;
                            oxVar2.d(z13, true);
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
                            TextView textView = e0Var.f14043a;
                            int i23 = R.string.SearchMessagesFilterEmptyText;
                            Object[] objArr = new Object[i11];
                            objArr[0] = str3;
                            textView.setText(LocaleController.formatString(i23, objArr));
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
                ((MediaDataController) obj3).lambda$processLoadStickersResponse$73(this.h, this.f14248n, this.f14246c, (a0.h) obj2, (TLRPC.StickerSet) obj, (TLRPC.TL_messages_allStickers) tLObject2, this.d);
                return;
        }
    }

    public t(MediaDataController mediaDataController, TLObject tLObject, ArrayList arrayList, int i10, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i11) {
        this.f14244a = 2;
        this.f14245b = mediaDataController;
        this.h = tLObject;
        this.f14248n = arrayList;
        this.f14246c = i10;
        this.e = hVar;
        this.f14247f = stickerSet;
        this.f14249r = tL_messages_allStickers;
        this.d = i11;
    }
}
