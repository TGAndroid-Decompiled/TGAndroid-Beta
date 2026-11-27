package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;
public final class d6a implements Runnable {
    public final byte a = 3;
    public final Object b;
    public final Object c;
    public final Object d;
    public final boolean e;
    public final Object f;
    public final Object h;
    public final Object n;

    public d6a(mg2 mg2Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z, TLRPC.User user) {
        this.b = mg2Var;
        this.c = tL_error;
        this.d = tLObject;
        this.f = iArr;
        this.h = arrayList;
        this.e = z;
        this.n = user;
    }

    @Override
    public final void run() {
        ?? r4;
        int i;
        boolean z;
        String str;
        int i2;
        boolean z2;
        boolean z3;
        TLRPC.Message message;
        zh6 zh6Var;
        int i3;
        final r47 r47Var;
        ArrayList arrayList;
        final SparseArray sparseArray;
        ArrayList arrayList2;
        char c;
        boolean z4;
        boolean z5;
        zh6 zh6Var2;
        ArrayList<TLRPC.Update> arrayList3;
        ArrayList arrayList4;
        int i4;
        String J1;
        Integer valueOf;
        int i5;
        TLRPC.MessageReplyHeader messageReplyHeader;
        zh6 zh6Var3;
        byte b;
        ArrayList arrayList5;
        int i6;
        String a0;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i7 = 1;
        switch (this.a) {
            case 0:
                r7a r7aVar = (r7a) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z6 = this.e;
                ArrayList arrayList6 = (ArrayList) this.h;
                ArrayList arrayList7 = (ArrayList) this.n;
                TLObject tLObject2 = (TLObject) this.f;
                if (tL_error == null) {
                    SparseArray sparseArray2 = new SparseArray();
                    zh6 zh6Var4 = new zh6();
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                    ArrayList arrayList9 = new ArrayList();
                    final boolean z7 = z6;
                    int i8 = 0;
                    zh6 zh6Var5 = null;
                    while (i8 < arrayList8.size()) {
                        TLRPC.Update update = arrayList8.get(i8);
                        if (update instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update;
                            zh6Var4.k(tL_updateMessageID.random_id, Integer.valueOf(tL_updateMessageID.id));
                            arrayList8.remove(i8);
                            i8--;
                            z5 = z6;
                            zh6Var2 = zh6Var4;
                            arrayList3 = arrayList8;
                            arrayList4 = arrayList9;
                            r7aVar = r7aVar;
                        } else {
                            r7a r7aVar2 = r7aVar;
                            if (update instanceof TL_update.TL_updateNewMessage) {
                                TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update;
                                TLRPC.Message message2 = tL_updateNewMessage.message;
                                sparseArray2.put(message2.id, message2);
                                z5 = z6;
                                Utilities.d.c(new h5a(r7aVar2, tL_updateNewMessage, (byte) 1));
                                arrayList8.remove(i8);
                                i8--;
                                r7aVar = r7aVar2;
                                zh6Var2 = zh6Var4;
                                arrayList3 = arrayList8;
                                arrayList4 = arrayList9;
                            } else {
                                z5 = z6;
                                if (update instanceof TL_update.TL_updateNewEphemeralMessage) {
                                    TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update;
                                    TLRPC.TL_message b2 = o44.b(tL_updateNewEphemeralMessage.message);
                                    sparseArray2.put(b2.id, b2);
                                    arrayList9.add(tL_updateNewEphemeralMessage.message);
                                    arrayList8.remove(i8);
                                    i8--;
                                    r7aVar = r7aVar2;
                                    zh6Var2 = zh6Var4;
                                    arrayList3 = arrayList8;
                                    arrayList4 = arrayList9;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update;
                                    long S1 = uc7.S1(tL_updateNewChannelMessage);
                                    TLRPC.Chat M0 = r7aVar2.getMessagesController().M0(Long.valueOf(S1));
                                    if ((M0 == null || M0.megagroup) && (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) != null && (messageReplyHeader.reply_to_top_id != 0 || messageReplyHeader.reply_to_msg_id != 0)) {
                                        if (zh6Var5 == null) {
                                            zh6Var5 = new zh6();
                                        }
                                        long B0 = r47.B0(tL_updateNewChannelMessage.message);
                                        SparseArray sparseArray3 = (SparseArray) zh6Var5.f(B0);
                                        if (sparseArray3 == null) {
                                            sparseArray3 = new SparseArray();
                                            zh6Var5.k(B0, sparseArray3);
                                        }
                                        TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                        int i9 = messageReplyHeader2.reply_to_top_id;
                                        if (i9 == 0) {
                                            i9 = messageReplyHeader2.reply_to_msg_id;
                                        }
                                        TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray3.get(i9);
                                        if (messageReplies == null) {
                                            messageReplies = new TLRPC.TL_messageReplies();
                                            sparseArray3.put(i9, messageReplies);
                                        }
                                        TLRPC.Peer peer = tL_updateNewChannelMessage.message.from_id;
                                        if (peer != null) {
                                            zh6Var3 = zh6Var4;
                                            messageReplies.recent_repliers.add(0, peer);
                                        } else {
                                            zh6Var3 = zh6Var4;
                                        }
                                        b = 1;
                                        messageReplies.replies++;
                                    } else {
                                        zh6Var3 = zh6Var4;
                                        b = 1;
                                    }
                                    zh6 zh6Var6 = zh6Var5;
                                    TLRPC.Message message3 = tL_updateNewChannelMessage.message;
                                    sparseArray2.put(message3.id, message3);
                                    Utilities.d.c(new i5a(r7aVar2, tL_updateNewChannelMessage, b));
                                    arrayList8.remove(i8);
                                    int i10 = i8 - 1;
                                    if (tL_updateNewChannelMessage.message.pinned) {
                                        arrayList3 = arrayList8;
                                        arrayList4 = arrayList9;
                                        zh6Var2 = zh6Var3;
                                        r7aVar = r7aVar2;
                                        Utilities.d.c(new j5a(r7aVar2, tL_updateNewChannelMessage, S1, (byte) 1));
                                    } else {
                                        r7aVar = r7aVar2;
                                        arrayList3 = arrayList8;
                                        arrayList4 = arrayList9;
                                        zh6Var2 = zh6Var3;
                                    }
                                    zh6Var5 = zh6Var6;
                                    i8 = i10;
                                } else {
                                    r7aVar = r7aVar2;
                                    zh6Var2 = zh6Var4;
                                    arrayList3 = arrayList8;
                                    arrayList4 = arrayList9;
                                    if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                                        TLRPC.Message message4 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                                        sparseArray2.put(message4.id, message4);
                                        arrayList3.remove(i8);
                                        i8--;
                                        i5 = 1;
                                        z7 = true;
                                        i8 += i5;
                                        zh6Var4 = zh6Var2;
                                        arrayList8 = arrayList3;
                                        i7 = i5;
                                        arrayList9 = arrayList4;
                                        z6 = z5;
                                    } else if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                                        b19 f = b19.f(r7aVar.currentAccount);
                                        if (arrayList6.isEmpty()) {
                                            J1 = null;
                                            i4 = 0;
                                        } else {
                                            i4 = 0;
                                            J1 = r47.J1(((r47) arrayList6.get(0)).k);
                                        }
                                        if (arrayList6.isEmpty()) {
                                            valueOf = null;
                                        } else {
                                            valueOf = Integer.valueOf(r47.I1(((r47) arrayList6.get(i4)).k));
                                        }
                                        f.j(update, J1, valueOf.intValue());
                                        TLRPC.Message message5 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                                        sparseArray2.put(message5.id, message5);
                                        arrayList3.remove(i8);
                                        i8--;
                                    }
                                }
                            }
                            i5 = 1;
                            z7 = false;
                            i8 += i5;
                            zh6Var4 = zh6Var2;
                            arrayList8 = arrayList3;
                            i7 = i5;
                            arrayList9 = arrayList4;
                            z6 = z5;
                        }
                        i5 = 1;
                        i8 += i5;
                        zh6Var4 = zh6Var2;
                        arrayList8 = arrayList3;
                        i7 = i5;
                        arrayList9 = arrayList4;
                        z6 = z5;
                    }
                    final boolean z8 = z6;
                    int i11 = i7;
                    zh6 zh6Var7 = zh6Var4;
                    ArrayList arrayList10 = arrayList9;
                    i = 2;
                    if (!arrayList10.isEmpty()) {
                        r7aVar.getMessagesStorage().g1(arrayList10, i11);
                    }
                    char c2 = 3;
                    if (zh6Var5 != null) {
                        r7aVar.getMessagesStorage().b1(null, null, zh6Var5, i11);
                        jn7 notificationCenter = r7aVar.getNotificationCenter();
                        Object[] objArr = new Object[4];
                        i2 = 0;
                        objArr[0] = null;
                        objArr[i11] = null;
                        objArr[2] = zh6Var5;
                        objArr[3] = Boolean.TRUE;
                        notificationCenter.k(78, objArr);
                    } else {
                        i2 = 0;
                    }
                    int[] iArr = new int[i11];
                    iArr[i2] = i2;
                    final int[] iArr2 = {i2};
                    final ArrayList arrayList11 = new ArrayList();
                    int i12 = 0;
                    while (i12 < arrayList6.size()) {
                        r47 r47Var2 = (r47) arrayList6.get(i12);
                        String str2 = (String) arrayList7.get(i12);
                        char c3 = c2;
                        final TLRPC.Message message6 = r47Var2.k;
                        final int i13 = message6.id;
                        final ArrayList arrayList12 = new ArrayList();
                        final int[] iArr3 = iArr;
                        Integer num = (Integer) zh6Var7.f(message6.random_id);
                        if (num != null && (message = (TLRPC.Message) sparseArray2.get(num.intValue())) != null) {
                            r47.B0(message);
                            arrayList12.add(message);
                            if ((message.flags & 33554432) != 0) {
                                TLRPC.Message message7 = r47Var2.k;
                                zh6Var = zh6Var7;
                                message7.ttl_period = message.ttl_period;
                                message7.flags |= 33554432;
                            } else {
                                zh6Var = zh6Var7;
                            }
                            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                                r47Var = r47Var2;
                                ArrayList arrayList13 = arrayList7;
                                sparseArray = sparseArray2;
                                i3 = i12;
                                arrayList2 = arrayList11;
                                c = 4;
                                r7aVar.y0((r47) arrayList6.get(0), message, message.id, arrayList13, false, -1, message.params);
                                arrayList = arrayList13;
                            } else {
                                i3 = i12;
                                r47Var = r47Var2;
                                arrayList = arrayList7;
                                sparseArray = sparseArray2;
                                arrayList2 = arrayList11;
                                c = 4;
                                r7aVar.y0(r47Var, message, message.id, Collections.singletonList(str2), false, -1, message.params);
                            }
                            final int o1 = r47Var.o1();
                            message6.id = message.id;
                            int i14 = message.quick_reply_shortcut_id;
                            message6.quick_reply_shortcut_id = i14;
                            if (i14 != 0) {
                                message6.flags |= 1073741824;
                            }
                            final long j = message.grouped_id;
                            if (!z8) {
                                Integer num2 = (Integer) r7aVar.getMessagesController().Q.get(Long.valueOf(message.dialog_id));
                                if (num2 == null) {
                                    num2 = Integer.valueOf(r7aVar.getMessagesStorage().U(message.dialog_id, message.out));
                                    r7aVar.getMessagesController().Q.put(Long.valueOf(message.dialog_id), num2);
                                }
                                if (num2.intValue() < message.id) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                message.unread = z4;
                            }
                            iArr3[0] = iArr3[0] + 1;
                            arrayList2.add(Integer.valueOf(i13));
                            r7aVar.getStatsController().i(a.f(), 1, 1);
                            message6.send_state = 0;
                            message6.errorAllowedPriceStars = 0L;
                            message6.errorNewPriceStars = 0L;
                            jn7 notificationCenter2 = r7aVar.getNotificationCenter();
                            Integer valueOf2 = Integer.valueOf(i13);
                            Integer valueOf3 = Integer.valueOf(message6.id);
                            Long valueOf4 = Long.valueOf(message6.dialog_id);
                            Long valueOf5 = Long.valueOf(j);
                            Integer valueOf6 = Integer.valueOf(o1);
                            Boolean valueOf7 = Boolean.valueOf(z7);
                            arrayList11 = arrayList2;
                            final r7a r7aVar3 = r7aVar;
                            Object[] objArr2 = new Object[7];
                            objArr2[0] = valueOf2;
                            objArr2[1] = valueOf3;
                            objArr2[2] = message6;
                            objArr2[c3] = valueOf4;
                            objArr2[c] = valueOf5;
                            objArr2[5] = valueOf6;
                            objArr2[6] = valueOf7;
                            notificationCenter2.k(21, objArr2);
                            jn7 notificationCenter3 = r7aVar3.getNotificationCenter();
                            Integer valueOf8 = Integer.valueOf(i13);
                            Integer valueOf9 = Integer.valueOf(message6.id);
                            Long valueOf10 = Long.valueOf(message6.dialog_id);
                            Long valueOf11 = Long.valueOf(j);
                            Integer valueOf12 = Integer.valueOf(o1);
                            Boolean valueOf13 = Boolean.valueOf(z7);
                            Object[] objArr3 = new Object[7];
                            objArr3[0] = valueOf8;
                            objArr3[1] = valueOf9;
                            objArr3[2] = message6;
                            objArr3[c3] = valueOf10;
                            objArr3[c] = valueOf11;
                            objArr3[5] = valueOf12;
                            objArr3[6] = valueOf13;
                            notificationCenter3.k(22, objArr3);
                            r7aVar = r7aVar3;
                            r7aVar3.getMessagesStorage().a.c(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.q6a.run():void");
                                }
                            });
                            i12 = i3 + 1;
                            c2 = c3;
                            iArr = iArr3;
                            sparseArray2 = sparseArray;
                            zh6Var7 = zh6Var;
                            arrayList7 = arrayList;
                        } else {
                            z2 = z8;
                            z3 = true;
                            Utilities.d.c(new k5a(r7aVar, updates, (byte) 1));
                            z = z3;
                            r4 = z2;
                        }
                    }
                    z2 = z8;
                    z3 = false;
                    Utilities.d.c(new k5a(r7aVar, updates, (byte) 1));
                    z = z3;
                    r4 = z2;
                } else {
                    r4 = z6;
                    i = 2;
                    jj.c0(r7aVar.currentAccount, tL_error, null, tLObject2, new Object[0]);
                    z = true;
                }
                if (z) {
                    int i15 = 0;
                    while (i15 < arrayList6.size()) {
                        r47 r47Var3 = (r47) arrayList6.get(i15);
                        TLRPC.Message message8 = r47Var3.k;
                        r7aVar.getMessagesStorage().N0(r4, message8);
                        int i16 = i;
                        message8.send_state = i16;
                        if (r4 == 0 && tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                            jxa.v(r7aVar.currentAccount, false);
                            message8.errorAllowedPriceStars = jxa.l(tLObject2);
                            message8.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                            jxa.v(r7aVar.currentAccount, false).e0(Arrays.asList(r47Var3));
                            r7aVar.getMessagesStorage().Z1(r47.B0(message8), message8);
                        }
                        r7aVar.getNotificationCenter().k(23, Integer.valueOf(message8.id));
                        r7aVar.c0(message8.id);
                        r7aVar.h0(message8.id, r4);
                        i15++;
                        i = i16;
                    }
                    return;
                }
                return;
            case 1:
                r7a r7aVar4 = (r7a) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLRPC.Message message9 = (TLRPC.Message) this.h;
                TLObject tLObject3 = (TLObject) this.d;
                r47 r47Var4 = (r47) this.n;
                boolean z9 = this.e;
                TLObject tLObject4 = (TLObject) this.f;
                if (tL_error2 == null) {
                    String str3 = message9.attachPath;
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject3;
                    ArrayList<TLRPC.Update> arrayList14 = updates2.updates;
                    message9.send_state = 0;
                    ArrayList arrayList15 = new ArrayList();
                    arrayList15.add(message9);
                    r7aVar4.getMessagesStorage().k1(arrayList15, false, true, false, 0, false, 0, 0L);
                    qyb qybVar = r7aVar4.getMessagesController().h4;
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) qybVar.e.f(qyb.p(message9.id, -message9.dialog_id));
                    if (tL_forumTopic != null) {
                        tL_forumTopic.topMessage = message9;
                        qybVar.y(-message9.dialog_id, true);
                    }
                    Utilities.d.c(new e5a(r7aVar4, updates2, message9, z9, (byte) 0));
                    return;
                }
                jj.c0(r7aVar4.currentAccount, tL_error2, null, tLObject4, new Object[0]);
                r7aVar4.h0(message9.id, z9);
                r7aVar4.k0(r47Var4);
                return;
            case 2:
                ((mg2) this.b).c0((TLRPC.TL_error) this.c, (TLObject) this.d, (int[]) this.f, (ArrayList) this.h, this.e, (TLRPC.User) this.n);
                return;
            case 3:
                e17 e17Var = (e17) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f;
                boolean z10 = this.e;
                TLRPC.User user = (TLRPC.User) this.h;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.n;
                int i17 = e17Var.k;
                ArrayList arrayList16 = e17Var.e;
                e eVar = e17Var.g;
                if (eVar != null && eVar.getParentActivity() != null) {
                    if (tL_error3 == null) {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject5;
                        if (!tL_updates.chats.isEmpty()) {
                            uc7.s1(i17).e3(0, tL_updates.chats.get(0).id, true);
                        }
                        int i18 = 0;
                        while (true) {
                            if (i18 < arrayList16.size()) {
                                if (((TLRPC.TL_chatInviteImporter) arrayList16.get(i18)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList16.remove(i18);
                                } else {
                                    i18++;
                                }
                            }
                        }
                        x07 x07Var = e17Var.f;
                        e17 e17Var2 = x07Var.c;
                        int i19 = 0;
                        while (true) {
                            arrayList5 = e17Var2.c;
                            if (i19 < arrayList5.size()) {
                                if (((TLRPC.TL_chatInviteImporter) arrayList5.get(i19)).user_id != tL_chatInviteImporter.user_id) {
                                    i19++;
                                }
                            } else {
                                i19 = -1;
                            }
                        }
                        if (i19 >= 0) {
                            arrayList5.remove(i19);
                            x07Var.s((!x07Var.c.B ? 1 : 0) + i19);
                            if (arrayList5.isEmpty()) {
                                x07Var.s(1);
                            }
                        }
                        e17Var.f(e17Var.t, false, true);
                        if (z10) {
                            h21 h21Var = new h21(eVar.getParentActivity(), eVar.getResourceProvider());
                            de0 de0Var = h21Var.a;
                            de0Var.setRoundRadius(hl.L(15.0f));
                            de0Var.f(user, new rb0(0, user));
                            String k = lbc.k(user, true);
                            if (e17Var.a) {
                                a0 = ob6.a0("HasBeenAddedToChannel", null, 2131749118, k);
                            } else {
                                a0 = ob6.a0("HasBeenAddedToGroup", null, 2131749117, k);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0);
                            int indexOf = a0.indexOf(k);
                            spannableStringBuilder.setSpan(new y7c(hl.o()), indexOf, k.length() + indexOf, 18);
                            h21Var.b.setText(spannableStringBuilder);
                            if (arrayList16.isEmpty()) {
                                v21.g(eVar, h21Var, 2750).j();
                            } else {
                                v21.f(e17Var.h, h21Var, 2750).j();
                            }
                        }
                        s6 u = eVar.getActionBar().u();
                        if (TextUtils.isEmpty(e17Var.t) && e17Var.l) {
                            s7 j2 = u.j(0);
                            if (arrayList16.isEmpty()) {
                                i6 = 8;
                            } else {
                                i6 = 0;
                            }
                            j2.setVisibility(i6);
                            return;
                        }
                        return;
                    }
                    jj.c0(i17, tL_error3, eVar, tL_messages_hideChatJoinRequest, new Object[0]);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList17 = (ArrayList) this.h;
                e eVar2 = (e) this.c;
                zu1 zu1Var = (zu1) this.d;
                TLRPC.Document document2 = (TLRPC.Document) this.f;
                boolean z11 = this.e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.n;
                arrayList17.add(new no6(0, ((File) this.b).getAbsolutePath(), 0, false, 0, 0));
                PhotoViewer.q0().T1(eVar2.getParentActivity(), null, eVar2.getResourceProvider());
                PhotoViewer.q0().o1(arrayList17, 0, 11, false, new Object(), zu1Var);
                PhotoViewer q0 = PhotoViewer.q0();
                if (z11) {
                    document = document2;
                } else {
                    document = null;
                }
                q0.U(document2, document, false, null);
                rw2 e = rw2.e();
                if (z11) {
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                }
                e.T = tL_messages_stickerSet;
                return;
            default:
                ((o7c) this.b).z0((TLRPC.TL_error) this.c, this.e, (TLObject) this.d, (byte[]) this.f, (String) this.h, (TL_account.passwordInputSettings) this.n);
                return;
        }
    }

    public d6a(e17 e17Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.b = e17Var;
        this.c = tL_error;
        this.d = tLObject;
        this.f = tL_chatInviteImporter;
        this.e = z;
        this.h = user;
        this.n = tL_messages_hideChatJoinRequest;
    }

    public d6a(r7a r7aVar, TLRPC.TL_error tL_error, TLObject tLObject, boolean z, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.b = r7aVar;
        this.c = tL_error;
        this.d = tLObject;
        this.e = z;
        this.h = arrayList;
        this.n = arrayList2;
        this.f = tLObject2;
    }

    public d6a(r7a r7aVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, r47 r47Var, String str, HashMap hashMap, boolean z, TLObject tLObject2) {
        this.b = r7aVar;
        this.c = tL_error;
        this.h = message;
        this.d = tLObject;
        this.n = r47Var;
        this.e = z;
        this.f = tLObject2;
    }

    public d6a(o7c o7cVar, TLRPC.TL_error tL_error, boolean z, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.b = o7cVar;
        this.c = tL_error;
        this.e = z;
        this.d = tLObject;
        this.f = bArr;
        this.h = str;
        this.n = passwordinputsettings;
    }

    public d6a(File file, ArrayList arrayList, e eVar, zu1 zu1Var, TLRPC.Document document, boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.b = file;
        this.h = arrayList;
        this.c = eVar;
        this.d = zu1Var;
        this.f = document;
        this.e = z;
        this.n = tL_messages_stickerSet;
    }
}
