package org.telegram.messenger;

import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ay;
public final class o7 implements Runnable {
    public final int f19535a;
    public final int f19536b;
    public final int f19537c;
    public final TLObject d;
    public final ArrayList f19538e;
    public final Object f19539f;
    public final Object h;
    public final Object f19540n;
    public final TLObject f19541r;

    public o7(MediaDataController mediaDataController, TLObject tLObject, ArrayList arrayList, int i10, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i11) {
        this.f19535a = 0;
        this.f19539f = mediaDataController;
        this.d = tLObject;
        this.f19538e = arrayList;
        this.f19536b = i10;
        this.h = hVar;
        this.f19540n = stickerSet;
        this.f19541r = tL_messages_allStickers;
        this.f19537c = i11;
    }

    @Override
    public final void run() {
        boolean z4;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        ConcurrentHashMap<Long, Integer> concurrentHashMap;
        boolean z13;
        int i12 = this.f19535a;
        ArrayList arrayList = this.f19538e;
        TLObject tLObject = this.d;
        int i13 = this.f19537c;
        int i14 = this.f19536b;
        TLObject tLObject2 = this.f19541r;
        Object obj = this.f19540n;
        Object obj2 = this.h;
        Object obj3 = this.f19539f;
        switch (i12) {
            case 0:
                ((MediaDataController) obj3).lambda$processLoadStickersResponse$73(this.d, this.f19538e, this.f19536b, (a0.h) obj2, (TLRPC.StickerSet) obj, (TLRPC.TL_messages_allStickers) tLObject2, this.f19537c);
                return;
            case 1:
                uf.z zVar = (uf.z) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject2;
                uf.s sVar = zVar.f48796g0;
                ArrayList arrayList2 = zVar.E;
                int i15 = zVar.f48805p0;
                if (i14 == zVar.Q && (i13 <= 0 || i13 == zVar.f48787a0)) {
                    zVar.A0--;
                    if (tL_error == null) {
                        zVar.Y = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i15).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i15).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i15).putChats(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        zVar.Z = messages_messages.next_rate;
                        for (int i16 = 0; i16 < messages_messages.messages.size(); i16++) {
                            TLRPC.Message message = messages_messages.messages.get(i16);
                            int i17 = MessagesController.getInstance(i15).deletedHistory.get(MessageObject.getDialogId(message));
                            if (i17 == 0 || message.f20866id > i17) {
                                arrayList2.add((MessageObject) arrayList.get(i16));
                            }
                        }
                        zVar.K = true;
                        if (messages_messages.messages.size() != 20) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zVar.U = z4;
                        if (i13 > 0) {
                            zVar.f48791d0 = i13;
                            if (zVar.f48790c0 != i13) {
                                zVar.f48809s.clear();
                            }
                            if (zVar.f48788b0 != i13) {
                                sVar.b();
                            }
                        }
                        sVar.f(zVar.f48809s, zVar.f48810s0);
                        ay ayVar = zVar.R;
                        if (ayVar != null) {
                            if (zVar.A0 > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ayVar.d(z10, true);
                            zVar.R.c();
                        }
                        zVar.l();
                    }
                }
                zVar.N = 0;
                return;
            default:
                uf.z zVar2 = (uf.z) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str2 = (String) obj;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) tLObject2;
                uf.s sVar2 = zVar2.f48796g0;
                ArrayList arrayList3 = zVar2.F;
                ArrayList arrayList4 = zVar2.E;
                int i18 = zVar2.f48805p0;
                if (i14 == zVar2.M && (i13 <= 0 || i13 == zVar2.f48787a0)) {
                    zVar2.A0--;
                    if (tL_error2 == null) {
                        zVar2.Y = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i18).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i18).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i18).putChats(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        zVar2.Z = messages_messages2.next_rate;
                        for (int i19 = 0; i19 < messages_messages2.messages.size(); i19++) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i19);
                            int i20 = MessagesController.getInstance(i18).deletedHistory.get(MessageObject.getDialogId(message2));
                            if (i20 == 0 || message2.f20866id > i20) {
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
                                    if (num.intValue() < message2.f20866id) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    message2.unread = z13;
                                }
                            }
                        }
                        zVar2.K = true;
                        if (messages_messages2.messages.size() != 20) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zVar2.T = z11;
                        if (i13 > 0) {
                            zVar2.f48791d0 = i13;
                            if (zVar2.f48790c0 != i13) {
                                zVar2.f48809s.clear();
                            }
                            if (zVar2.f48788b0 != i13) {
                                sVar2.b();
                            }
                        }
                        sVar2.f(zVar2.f48809s, zVar2.f48810s0);
                        ay ayVar2 = zVar2.R;
                        if (ayVar2 != null) {
                            if (zVar2.A0 > 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            i11 = 1;
                            ayVar2.d(z12, true);
                            zVar2.R.c();
                        } else {
                            i11 = 1;
                        }
                        zVar2.D0 = i11;
                        zVar2.E0 = i11;
                        i10 = 0;
                        zVar2.d = false;
                        uf.v vVar = zVar2.B0;
                        if (vVar != null) {
                            String str3 = zVar2.W;
                            TextView textView = vVar.f48763a;
                            int i22 = R.string.SearchMessagesFilterEmptyText;
                            Object[] objArr = new Object[i11];
                            objArr[0] = str3;
                            textView.setText(LocaleController.formatString(i22, objArr));
                        }
                        zVar2.l();
                        zVar2.L = i10;
                        return;
                    }
                }
                i10 = 0;
                zVar2.L = i10;
                return;
        }
    }

    public o7(uf.z zVar, int i10, int i11, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i12) {
        this.f19535a = i12;
        this.f19539f = zVar;
        this.f19536b = i10;
        this.f19537c = i11;
        this.h = tL_error;
        this.f19540n = str;
        this.d = tLObject;
        this.f19541r = tLMethod;
        this.f19538e = arrayList;
    }
}
