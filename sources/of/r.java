package of;

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
public final class r implements Runnable {
    public final int f19475a;
    public final Object f19476b;
    public final int f19477c;
    public final int d;
    public final Object f19478e;
    public final Object f19479f;
    public final TLObject h;
    public final ArrayList f19480n;
    public final TLObject f19481r;

    public r(f0 f0Var, int i9, int i10, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i11) {
        this.f19475a = i11;
        this.f19476b = f0Var;
        this.f19477c = i9;
        this.d = i10;
        this.f19478e = tL_error;
        this.f19479f = str;
        this.h = tLObject;
        this.f19481r = tLMethod;
        this.f19480n = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i9;
        boolean z12;
        int i10;
        boolean z13;
        ConcurrentHashMap<Long, Integer> concurrentHashMap;
        boolean z14;
        int i11 = this.f19475a;
        ArrayList arrayList = this.f19480n;
        TLObject tLObject = this.h;
        int i12 = this.d;
        int i13 = this.f19477c;
        TLObject tLObject2 = this.f19481r;
        Object obj = this.f19479f;
        Object obj2 = this.f19478e;
        Object obj3 = this.f19476b;
        switch (i11) {
            case 0:
                f0 f0Var = (f0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject2;
                w wVar = f0Var.f19294f0;
                ArrayList arrayList2 = f0Var.D;
                int i14 = f0Var.f19303o0;
                if (i13 == f0Var.P && (i12 <= 0 || i12 == f0Var.Z)) {
                    f0Var.f19319z0--;
                    if (tL_error == null) {
                        f0Var.X = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i14).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i14).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i14).putChats(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        f0Var.Y = messages_messages.next_rate;
                        for (int i15 = 0; i15 < messages_messages.messages.size(); i15++) {
                            TLRPC.Message message = messages_messages.messages.get(i15);
                            int i16 = MessagesController.getInstance(i14).deletedHistory.get(MessageObject.getDialogId(message));
                            if (i16 == 0 || message.f22401id > i16) {
                                arrayList2.add((MessageObject) arrayList.get(i15));
                            }
                        }
                        f0Var.J = true;
                        if (messages_messages.messages.size() != 20) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        f0Var.T = z10;
                        if (i12 > 0) {
                            f0Var.f19289c0 = i12;
                            if (f0Var.f19287b0 != i12) {
                                f0Var.f19308s.clear();
                            }
                            if (f0Var.f19286a0 != i12) {
                                wVar.b();
                            }
                        }
                        wVar.f(f0Var.f19308s, f0Var.f19307r0);
                        ox oxVar = f0Var.Q;
                        if (oxVar != null) {
                            if (f0Var.f19319z0 > 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            oxVar.d(z11, true);
                            f0Var.Q.c();
                        }
                        f0Var.l();
                    }
                }
                f0Var.M = 0;
                return;
            case 1:
                f0 f0Var2 = (f0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str2 = (String) obj;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) tLObject2;
                w wVar2 = f0Var2.f19294f0;
                ArrayList arrayList3 = f0Var2.E;
                ArrayList arrayList4 = f0Var2.D;
                int i17 = f0Var2.f19303o0;
                if (i13 == f0Var2.L && (i12 <= 0 || i12 == f0Var2.Z)) {
                    f0Var2.f19319z0--;
                    if (tL_error2 == null) {
                        f0Var2.X = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i17).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i17).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i17).putChats(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        f0Var2.Y = messages_messages2.next_rate;
                        for (int i18 = 0; i18 < messages_messages2.messages.size(); i18++) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i18);
                            int i19 = MessagesController.getInstance(i17).deletedHistory.get(MessageObject.getDialogId(message2));
                            if (i19 == 0 || message2.f22401id > i19) {
                                MessageObject messageObject = (MessageObject) arrayList.get(i18);
                                if (!arrayList4.isEmpty()) {
                                    for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                                        MessageObject messageObject2 = (MessageObject) arrayList4.get(i20);
                                        if (messageObject2 == null || messageObject == null || messageObject.getId() != messageObject2.getId() || messageObject.getDialogId() != messageObject2.getDialogId()) {
                                        }
                                    }
                                }
                                arrayList3.add(messageObject);
                                long dialogId = MessageObject.getDialogId(message2);
                                if (message2.out) {
                                    concurrentHashMap = MessagesController.getInstance(i17).dialogs_read_outbox_max;
                                } else {
                                    concurrentHashMap = MessagesController.getInstance(i17).dialogs_read_inbox_max;
                                }
                                Integer num = concurrentHashMap.get(Long.valueOf(dialogId));
                                if (num != null) {
                                    if (num.intValue() < message2.f22401id) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    message2.unread = z14;
                                }
                            }
                        }
                        f0Var2.J = true;
                        if (messages_messages2.messages.size() != 20) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        f0Var2.S = z12;
                        if (i12 > 0) {
                            f0Var2.f19289c0 = i12;
                            if (f0Var2.f19287b0 != i12) {
                                f0Var2.f19308s.clear();
                            }
                            if (f0Var2.f19286a0 != i12) {
                                wVar2.b();
                            }
                        }
                        wVar2.f(f0Var2.f19308s, f0Var2.f19307r0);
                        ox oxVar2 = f0Var2.Q;
                        if (oxVar2 != null) {
                            if (f0Var2.f19319z0 > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            i10 = 1;
                            oxVar2.d(z13, true);
                            f0Var2.Q.c();
                        } else {
                            i10 = 1;
                        }
                        f0Var2.C0 = i10;
                        f0Var2.D0 = i10;
                        i9 = 0;
                        f0Var2.d = false;
                        b0 b0Var = f0Var2.A0;
                        if (b0Var != null) {
                            String str3 = f0Var2.V;
                            TextView textView = b0Var.f19246a;
                            int i21 = R.string.SearchMessagesFilterEmptyText;
                            Object[] objArr = new Object[i10];
                            objArr[0] = str3;
                            textView.setText(LocaleController.formatString(i21, objArr));
                        }
                        f0Var2.l();
                        f0Var2.K = i9;
                        return;
                    }
                }
                i9 = 0;
                f0Var2.K = i9;
                return;
            default:
                ((MediaDataController) obj3).lambda$processLoadStickersResponse$73(this.h, this.f19480n, this.f19477c, (a0.h) obj2, (TLRPC.StickerSet) obj, (TLRPC.TL_messages_allStickers) tLObject2, this.d);
                return;
        }
    }

    public r(MediaDataController mediaDataController, TLObject tLObject, ArrayList arrayList, int i9, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i10) {
        this.f19475a = 2;
        this.f19476b = mediaDataController;
        this.h = tLObject;
        this.f19480n = arrayList;
        this.f19477c = i9;
        this.f19478e = hVar;
        this.f19479f = stickerSet;
        this.f19481r = tL_messages_allStickers;
        this.d = i10;
    }
}
