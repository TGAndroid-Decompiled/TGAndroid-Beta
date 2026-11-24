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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
public final class q4a implements Runnable {
    public final byte a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final boolean e;
    public final Object f;
    public final Object h;
    public final Object n;

    public q4a(hh2 hh2Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z, TLRPC.User user) {
        this.b = hh2Var;
        this.c = tL_error;
        this.d = tLObject;
        this.f = iArr;
        this.h = arrayList;
        this.e = z;
        this.n = user;
    }

    @Override
    public final void run() {
        ?? r5;
        int i;
        boolean z;
        String str;
        int i2;
        int i3;
        boolean z2;
        TLRPC.Updates updates;
        TLRPC.Message message;
        vh6 vh6Var;
        final int[] iArr;
        int i4;
        final k47 k47Var;
        ArrayList arrayList;
        final SparseArray sparseArray;
        TLRPC.Updates updates2;
        a6a a6aVar;
        TLRPC.Message message2;
        ArrayList arrayList2;
        boolean z3;
        boolean z4;
        TLRPC.Updates updates3;
        vh6 vh6Var2;
        ArrayList<TLRPC.Update> arrayList3;
        ArrayList arrayList4;
        int i5;
        String J1;
        Integer valueOf;
        TLRPC.MessageReplyHeader messageReplyHeader;
        int i6;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i7;
        String a0;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        boolean z5 = true;
        switch (this.a) {
            case 0:
                a6a a6aVar2 = (a6a) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z6 = this.e;
                ArrayList arrayList7 = (ArrayList) this.h;
                ArrayList arrayList8 = (ArrayList) this.n;
                TLObject tLObject2 = (TLObject) this.f;
                if (tL_error == null) {
                    SparseArray sparseArray2 = new SparseArray();
                    vh6 vh6Var3 = new vh6();
                    TLRPC.Updates updates4 = (TLRPC.Updates) tLObject;
                    ArrayList<TLRPC.Update> arrayList9 = updates4.updates;
                    ArrayList arrayList10 = new ArrayList();
                    vh6 vh6Var4 = null;
                    final boolean z7 = z6;
                    i = 2;
                    int i8 = 0;
                    while (i8 < arrayList9.size()) {
                        TLRPC.Update update = arrayList9.get(i8);
                        if (update instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update;
                            vh6Var3.k(Integer.valueOf(tL_updateMessageID.id), tL_updateMessageID.random_id);
                            arrayList9.remove(i8);
                            i8--;
                            z4 = z5;
                            updates3 = updates4;
                            vh6Var2 = vh6Var3;
                            arrayList3 = arrayList9;
                            arrayList4 = arrayList10;
                            a6aVar2 = a6aVar2;
                        } else {
                            boolean z8 = z5;
                            a6a a6aVar3 = a6aVar2;
                            if (update instanceof TL_update.TL_updateNewMessage) {
                                TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update;
                                TLRPC.Message message3 = tL_updateNewMessage.message;
                                sparseArray2.put(message3.id, message3);
                                z4 = z8;
                                updates3 = updates4;
                                Utilities.d.c(new d5a(a6aVar3, tL_updateNewMessage, (byte) 0));
                                arrayList9.remove(i8);
                                i8--;
                                a6aVar2 = a6aVar3;
                                vh6Var2 = vh6Var3;
                                arrayList3 = arrayList9;
                                arrayList4 = arrayList10;
                            } else {
                                z4 = z8;
                                updates3 = updates4;
                                if (update instanceof TL_update.TL_updateNewEphemeralMessage) {
                                    TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update;
                                    TLRPC.TL_message b = d54.b(tL_updateNewEphemeralMessage.message);
                                    sparseArray2.put(b.id, b);
                                    arrayList10.add(tL_updateNewEphemeralMessage.message);
                                    arrayList9.remove(i8);
                                    i8--;
                                    a6aVar2 = a6aVar3;
                                    vh6Var2 = vh6Var3;
                                    arrayList3 = arrayList9;
                                    arrayList4 = arrayList10;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update;
                                    long R1 = oc7.R1(tL_updateNewChannelMessage);
                                    TLRPC.Chat L0 = a6aVar3.getMessagesController().L0(Long.valueOf(R1));
                                    if ((L0 == null || L0.megagroup) && (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) != null && (messageReplyHeader.reply_to_top_id != 0 || messageReplyHeader.reply_to_msg_id != 0)) {
                                        if (vh6Var4 == null) {
                                            vh6Var4 = new vh6();
                                        }
                                        long B0 = k47.B0(tL_updateNewChannelMessage.message);
                                        SparseArray sparseArray3 = (SparseArray) vh6Var4.f(B0);
                                        if (sparseArray3 == null) {
                                            sparseArray3 = new SparseArray();
                                            vh6Var4.k(sparseArray3, B0);
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
                                            vh6Var2 = vh6Var3;
                                            messageReplies.recent_repliers.add(0, peer);
                                        } else {
                                            vh6Var2 = vh6Var3;
                                        }
                                        messageReplies.replies++;
                                    } else {
                                        vh6Var2 = vh6Var3;
                                    }
                                    TLRPC.Message message4 = tL_updateNewChannelMessage.message;
                                    sparseArray2.put(message4.id, message4);
                                    Utilities.d.c(new e5a(a6aVar3, tL_updateNewChannelMessage, (byte) 0));
                                    arrayList9.remove(i8);
                                    int i10 = i8 - 1;
                                    if (tL_updateNewChannelMessage.message.pinned) {
                                        arrayList5 = arrayList10;
                                        arrayList3 = arrayList9;
                                        i6 = i10;
                                        a6aVar2 = a6aVar3;
                                        Utilities.d.c(new m3a(a6aVar3, tL_updateNewChannelMessage, R1, (byte) 1));
                                    } else {
                                        a6aVar2 = a6aVar3;
                                        i6 = i10;
                                        arrayList3 = arrayList9;
                                        arrayList5 = arrayList10;
                                    }
                                    arrayList4 = arrayList5;
                                    i8 = i6;
                                } else {
                                    a6aVar2 = a6aVar3;
                                    vh6Var2 = vh6Var3;
                                    arrayList3 = arrayList9;
                                    arrayList4 = arrayList10;
                                    if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                                        TLRPC.Message message5 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                                        sparseArray2.put(message5.id, message5);
                                        arrayList3.remove(i8);
                                        i8--;
                                        z7 = z4;
                                    } else if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                                        pz8 f = pz8.f(a6aVar2.currentAccount);
                                        if (arrayList7.isEmpty()) {
                                            i5 = 0;
                                            J1 = null;
                                        } else {
                                            i5 = 0;
                                            J1 = k47.J1(((k47) arrayList7.get(0)).k);
                                        }
                                        if (arrayList7.isEmpty()) {
                                            valueOf = null;
                                        } else {
                                            valueOf = Integer.valueOf(k47.I1(((k47) arrayList7.get(i5)).k));
                                        }
                                        f.j(update, J1, valueOf.intValue());
                                        TLRPC.Message message6 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                                        sparseArray2.put(message6.id, message6);
                                        arrayList3.remove(i8);
                                        i8--;
                                    }
                                }
                            }
                            z7 = false;
                        }
                        i8++;
                        arrayList9 = arrayList3;
                        arrayList10 = arrayList4;
                        updates4 = updates3;
                        z5 = z4;
                        vh6Var3 = vh6Var2;
                    }
                    boolean z9 = z5;
                    TLRPC.Updates updates5 = updates4;
                    vh6 vh6Var5 = vh6Var3;
                    ArrayList arrayList11 = arrayList10;
                    if (!arrayList11.isEmpty()) {
                        boolean z10 = z9;
                        a6aVar2.getMessagesStorage().c1(arrayList11, z10);
                        i2 = z10;
                    } else {
                        i2 = z9;
                    }
                    char c = 3;
                    char c2 = 4;
                    if (vh6Var4 != null) {
                        a6aVar2.getMessagesStorage().X0(null, null, vh6Var4, i2);
                        nm7 notificationCenter = a6aVar2.getNotificationCenter();
                        Object[] objArr = new Object[4];
                        i3 = 0;
                        objArr[0] = null;
                        objArr[i2] = null;
                        objArr[2] = vh6Var4;
                        objArr[3] = Boolean.TRUE;
                        notificationCenter.k(78, objArr);
                    } else {
                        i3 = 0;
                    }
                    int[] iArr2 = new int[i2];
                    vh6 vh6Var6 = vh6Var5;
                    iArr2[i3] = i3;
                    final int[] iArr3 = {i3};
                    final ArrayList arrayList12 = new ArrayList();
                    int i11 = 0;
                    while (i11 < arrayList7.size()) {
                        k47 k47Var2 = (k47) arrayList7.get(i11);
                        String str2 = (String) arrayList8.get(i11);
                        final TLRPC.Message message7 = k47Var2.k;
                        char c3 = c;
                        final int i12 = message7.id;
                        char c4 = c2;
                        final ArrayList arrayList13 = new ArrayList();
                        a6a a6aVar4 = a6aVar2;
                        Integer num = (Integer) vh6Var6.f(message7.random_id);
                        if (num != null && (message = (TLRPC.Message) sparseArray2.get(num.intValue())) != null) {
                            k47.B0(message);
                            arrayList13.add(message);
                            if ((message.flags & 33554432) != 0) {
                                TLRPC.Message message8 = k47Var2.k;
                                message8.ttl_period = message.ttl_period;
                                message8.flags |= 33554432;
                            }
                            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                                k47 k47Var3 = (k47) arrayList7.get(0);
                                int i13 = i11;
                                int i14 = message.id;
                                k47Var = k47Var2;
                                ArrayList arrayList14 = arrayList8;
                                sparseArray = sparseArray2;
                                HashMap<String, String> hashMap = message.params;
                                vh6Var = vh6Var6;
                                iArr = iArr2;
                                updates2 = updates5;
                                i4 = i13;
                                message2 = message;
                                a6aVar = a6aVar4;
                                arrayList2 = arrayList12;
                                a6aVar.y0(k47Var3, message2, i14, arrayList14, false, -1, hashMap);
                                arrayList = arrayList14;
                            } else {
                                vh6Var = vh6Var6;
                                iArr = iArr2;
                                i4 = i11;
                                k47Var = k47Var2;
                                arrayList = arrayList8;
                                sparseArray = sparseArray2;
                                updates2 = updates5;
                                a6aVar = a6aVar4;
                                message2 = message;
                                arrayList2 = arrayList12;
                                a6aVar.y0(k47Var, message2, message2.id, Collections.singletonList(str2), false, -1, message2.params);
                            }
                            final int o1 = k47Var.o1();
                            message7.id = message2.id;
                            int i15 = message2.quick_reply_shortcut_id;
                            message7.quick_reply_shortcut_id = i15;
                            if (i15 != 0) {
                                message7.flags |= 1073741824;
                            }
                            final long j = message2.grouped_id;
                            if (!z6) {
                                Integer num2 = (Integer) a6aVar.getMessagesController().Q.get(Long.valueOf(message2.dialog_id));
                                if (num2 == null) {
                                    num2 = Integer.valueOf(a6aVar.getMessagesStorage().S(message2.dialog_id, message2.out));
                                    a6aVar.getMessagesController().Q.put(Long.valueOf(message2.dialog_id), num2);
                                }
                                if (num2.intValue() < message2.id) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                message2.unread = z3;
                            }
                            iArr[0] = iArr[0] + 1;
                            arrayList2.add(Integer.valueOf(i12));
                            a6aVar.getStatsController().i(a.f(), 1, 1);
                            message7.send_state = 0;
                            message7.errorAllowedPriceStars = 0L;
                            message7.errorNewPriceStars = 0L;
                            nm7 notificationCenter2 = a6aVar.getNotificationCenter();
                            Integer valueOf2 = Integer.valueOf(i12);
                            Integer valueOf3 = Integer.valueOf(message7.id);
                            Long valueOf4 = Long.valueOf(message7.dialog_id);
                            Long valueOf5 = Long.valueOf(j);
                            Integer valueOf6 = Integer.valueOf(o1);
                            Boolean valueOf7 = Boolean.valueOf(z7);
                            arrayList12 = arrayList2;
                            final a6a a6aVar5 = a6aVar;
                            Object[] objArr2 = new Object[7];
                            objArr2[0] = valueOf2;
                            objArr2[1] = valueOf3;
                            objArr2[2] = message7;
                            objArr2[c3] = valueOf4;
                            objArr2[c4] = valueOf5;
                            objArr2[5] = valueOf6;
                            objArr2[6] = valueOf7;
                            notificationCenter2.k(21, objArr2);
                            nm7 notificationCenter3 = a6aVar5.getNotificationCenter();
                            Integer valueOf8 = Integer.valueOf(i12);
                            Integer valueOf9 = Integer.valueOf(message7.id);
                            Long valueOf10 = Long.valueOf(message7.dialog_id);
                            Long valueOf11 = Long.valueOf(j);
                            Integer valueOf12 = Integer.valueOf(o1);
                            Boolean valueOf13 = Boolean.valueOf(z7);
                            Object[] objArr3 = new Object[7];
                            objArr3[0] = valueOf8;
                            objArr3[1] = valueOf9;
                            objArr3[2] = message7;
                            objArr3[c3] = valueOf10;
                            objArr3[c4] = valueOf11;
                            objArr3[5] = valueOf12;
                            objArr3[6] = valueOf13;
                            notificationCenter3.k(22, objArr3);
                            final boolean z11 = z6;
                            a6aVar2 = a6aVar5;
                            a6aVar5.getMessagesStorage().a.c(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.f5a.run():void");
                                }
                            });
                            i11 = i4 + 1;
                            z6 = z11;
                            updates5 = updates2;
                            iArr2 = iArr;
                            sparseArray2 = sparseArray;
                            c = c3;
                            c2 = c4;
                            vh6Var6 = vh6Var;
                            arrayList8 = arrayList;
                        } else {
                            z2 = z6;
                            updates = updates5;
                            a6aVar2 = a6aVar4;
                            z = true;
                            Utilities.d.c(new n3a(a6aVar2, updates, (byte) 1));
                            r5 = z2;
                        }
                    }
                    z2 = z6;
                    updates = updates5;
                    z = false;
                    Utilities.d.c(new n3a(a6aVar2, updates, (byte) 1));
                    r5 = z2;
                } else {
                    r5 = z6;
                    i = 2;
                    ik.c0(a6aVar2.currentAccount, tL_error, null, tLObject2, new Object[0]);
                    z = true;
                }
                if (z) {
                    int i16 = 0;
                    while (i16 < arrayList7.size()) {
                        k47 k47Var4 = (k47) arrayList7.get(i16);
                        TLRPC.Message message9 = k47Var4.k;
                        a6aVar2.getMessagesStorage().K0(r5, message9);
                        int i17 = i;
                        message9.send_state = i17;
                        if (r5 == 0 && tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                            jva.v(a6aVar2.currentAccount, false);
                            message9.errorAllowedPriceStars = jva.l(tLObject2);
                            message9.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                            jva.v(a6aVar2.currentAccount, false).d0(Arrays.asList(k47Var4));
                            a6aVar2.getMessagesStorage().U1(k47.B0(message9), message9);
                        }
                        a6aVar2.getNotificationCenter().k(23, Integer.valueOf(message9.id));
                        a6aVar2.c0(message9.id);
                        a6aVar2.h0(message9.id, r5);
                        i16++;
                        i = i17;
                    }
                    return;
                }
                return;
            case 1:
                a6a a6aVar6 = (a6a) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLRPC.Message message10 = (TLRPC.Message) this.h;
                TLObject tLObject3 = (TLObject) this.d;
                k47 k47Var5 = (k47) this.n;
                boolean z12 = this.e;
                TLObject tLObject4 = (TLObject) this.f;
                if (tL_error2 == null) {
                    String str3 = message10.attachPath;
                    TLRPC.Updates updates6 = (TLRPC.Updates) tLObject3;
                    ArrayList<TLRPC.Update> arrayList15 = updates6.updates;
                    message10.send_state = 0;
                    ArrayList arrayList16 = new ArrayList();
                    arrayList16.add(message10);
                    a6aVar6.getMessagesStorage().g1(arrayList16, false, true, false, 0, false, 0, 0L);
                    qwb qwbVar = a6aVar6.getMessagesController().g4;
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) qwbVar.e.f(qwb.p(message10.id, -message10.dialog_id));
                    if (tL_forumTopic != null) {
                        tL_forumTopic.topMessage = message10;
                        qwbVar.y(-message10.dialog_id, true);
                    }
                    Utilities.d.c(new g5a(a6aVar6, updates6, message10, z12, (byte) 1));
                    return;
                }
                ik.c0(a6aVar6.currentAccount, tL_error2, null, tLObject4, new Object[0]);
                a6aVar6.h0(message10.id, z12);
                a6aVar6.k0(k47Var5);
                return;
            case 2:
                ((hh2) this.b).d0((TLRPC.TL_error) this.c, (TLObject) this.d, (int[]) this.f, (ArrayList) this.h, this.e, (TLRPC.User) this.n);
                return;
            case 3:
                x07 x07Var = (x07) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f;
                boolean z13 = this.e;
                TLRPC.User user = (TLRPC.User) this.h;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.n;
                int i18 = x07Var.k;
                ArrayList arrayList17 = x07Var.e;
                d dVar = x07Var.g;
                if (dVar != null && dVar.getParentActivity() != null) {
                    if (tL_error3 == null) {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject5;
                        if (!tL_updates.chats.isEmpty()) {
                            oc7.r1(i18).a3(0, tL_updates.chats.get(0).id, true);
                        }
                        int i19 = 0;
                        while (true) {
                            if (i19 < arrayList17.size()) {
                                if (((TLRPC.TL_chatInviteImporter) arrayList17.get(i19)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList17.remove(i19);
                                } else {
                                    i19++;
                                }
                            }
                        }
                        q07 q07Var = x07Var.f;
                        x07 x07Var2 = q07Var.c;
                        int i20 = 0;
                        while (true) {
                            arrayList6 = x07Var2.c;
                            if (i20 < arrayList6.size()) {
                                x07 x07Var3 = x07Var2;
                                if (((TLRPC.TL_chatInviteImporter) arrayList6.get(i20)).user_id != tL_chatInviteImporter.user_id) {
                                    i20++;
                                    x07Var2 = x07Var3;
                                }
                            } else {
                                i20 = -1;
                            }
                        }
                        if (i20 >= 0) {
                            arrayList6.remove(i20);
                            q07Var.s((!q07Var.c.B ? 1 : 0) + i20);
                            if (arrayList6.isEmpty()) {
                                q07Var.s(1);
                            }
                        }
                        x07Var.f(x07Var.t, false, true);
                        if (z13) {
                            g31 g31Var = new g31(dVar.getParentActivity(), dVar.getResourceProvider());
                            bf0 bf0Var = g31Var.a;
                            bf0Var.setRoundRadius(gm.L(15.0f));
                            bf0Var.f(user, new pc0(0, user));
                            String k = m9c.k(user, true);
                            if (x07Var.a) {
                                a0 = jb6.a0("HasBeenAddedToChannel", null, 2131749121, k);
                            } else {
                                a0 = jb6.a0("HasBeenAddedToGroup", null, 2131749120, k);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0);
                            int indexOf = a0.indexOf(k);
                            spannableStringBuilder.setSpan(new z5c(gm.o()), indexOf, k.length() + indexOf, 18);
                            g31Var.b.setText(spannableStringBuilder);
                            if (arrayList17.isEmpty()) {
                                u31.g(dVar, g31Var, 2750).j();
                            } else {
                                u31.f(x07Var.h, g31Var, 2750).j();
                            }
                        }
                        r6 t = dVar.getActionBar().t();
                        if (TextUtils.isEmpty(x07Var.t) && x07Var.l) {
                            r7 j2 = t.j(0);
                            if (arrayList17.isEmpty()) {
                                i7 = 8;
                            } else {
                                i7 = 0;
                            }
                            j2.setVisibility(i7);
                            return;
                        }
                        return;
                    }
                    ik.c0(i18, tL_error3, dVar, tL_messages_hideChatJoinRequest, new Object[0]);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList18 = (ArrayList) this.h;
                d dVar2 = (d) this.c;
                yv1 yv1Var = (yv1) this.d;
                TLRPC.Document document2 = (TLRPC.Document) this.f;
                boolean z14 = this.e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.n;
                arrayList18.add(new jo6(0, ((File) this.b).getAbsolutePath(), 0, false, 0, 0));
                PhotoViewer.r0().T1(dVar2.getParentActivity(), null, dVar2.getResourceProvider());
                PhotoViewer.r0().o1(arrayList18, 0, 11, false, new Object(), yv1Var);
                PhotoViewer r0 = PhotoViewer.r0();
                if (z14) {
                    document = document2;
                } else {
                    document = null;
                }
                r0.U(document2, document, false, null);
                hx2 e = hx2.e();
                if (z14) {
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                }
                e.T = tL_messages_stickerSet;
                return;
            default:
                ((p5c) this.b).z0((TLRPC.TL_error) this.c, this.e, (TLObject) this.d, (byte[]) this.f, (String) this.h, (TL_account.passwordInputSettings) this.n);
                return;
        }
    }

    public q4a(x07 x07Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.b = x07Var;
        this.c = tL_error;
        this.d = tLObject;
        this.f = tL_chatInviteImporter;
        this.e = z;
        this.h = user;
        this.n = tL_messages_hideChatJoinRequest;
    }

    public q4a(a6a a6aVar, TLRPC.TL_error tL_error, TLObject tLObject, boolean z, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.b = a6aVar;
        this.c = tL_error;
        this.d = tLObject;
        this.e = z;
        this.h = arrayList;
        this.n = arrayList2;
        this.f = tLObject2;
    }

    public q4a(a6a a6aVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, k47 k47Var, String str, HashMap hashMap, boolean z, TLObject tLObject2) {
        this.b = a6aVar;
        this.c = tL_error;
        this.h = message;
        this.d = tLObject;
        this.n = k47Var;
        this.e = z;
        this.f = tLObject2;
    }

    public q4a(p5c p5cVar, TLRPC.TL_error tL_error, boolean z, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.b = p5cVar;
        this.c = tL_error;
        this.e = z;
        this.d = tLObject;
        this.f = bArr;
        this.h = str;
        this.n = passwordinputsettings;
    }

    public q4a(File file, ArrayList arrayList, d dVar, yv1 yv1Var, TLRPC.Document document, boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.b = file;
        this.h = arrayList;
        this.c = dVar;
        this.d = yv1Var;
        this.f = document;
        this.e = z;
        this.n = tL_messages_stickerSet;
    }
}
