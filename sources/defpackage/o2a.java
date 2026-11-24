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
public final class o2a implements Runnable {
    public final byte a = 4;
    public final Object b;
    public final Object c;
    public final Object d;
    public final boolean e;
    public final Object f;
    public final Object h;
    public final Object n;

    public o2a(uf2 uf2Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z, TLRPC.User user) {
        this.b = uf2Var;
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
        vf6 vf6Var;
        final int[] iArr;
        int i4;
        final k27 k27Var;
        ArrayList arrayList;
        final SparseArray sparseArray;
        TLRPC.Updates updates2;
        z3a z3aVar;
        TLRPC.Message message2;
        ArrayList arrayList2;
        boolean z3;
        boolean z4;
        TLRPC.Updates updates3;
        vf6 vf6Var2;
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
                z3a z3aVar2 = (z3a) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z6 = this.e;
                ArrayList arrayList7 = (ArrayList) this.h;
                ArrayList arrayList8 = (ArrayList) this.n;
                TLObject tLObject2 = (TLObject) this.f;
                if (tL_error == null) {
                    SparseArray sparseArray2 = new SparseArray();
                    vf6 vf6Var3 = new vf6();
                    TLRPC.Updates updates4 = (TLRPC.Updates) tLObject;
                    ArrayList<TLRPC.Update> arrayList9 = updates4.updates;
                    ArrayList arrayList10 = new ArrayList();
                    vf6 vf6Var4 = null;
                    final boolean z7 = z6;
                    i = 2;
                    int i8 = 0;
                    while (i8 < arrayList9.size()) {
                        TLRPC.Update update = arrayList9.get(i8);
                        if (update instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update;
                            vf6Var3.k(Integer.valueOf(tL_updateMessageID.id), tL_updateMessageID.random_id);
                            arrayList9.remove(i8);
                            i8--;
                            z4 = z5;
                            updates3 = updates4;
                            vf6Var2 = vf6Var3;
                            arrayList3 = arrayList9;
                            arrayList4 = arrayList10;
                            z3aVar2 = z3aVar2;
                        } else {
                            boolean z8 = z5;
                            z3a z3aVar3 = z3aVar2;
                            if (update instanceof TL_update.TL_updateNewMessage) {
                                TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update;
                                TLRPC.Message message3 = tL_updateNewMessage.message;
                                sparseArray2.put(message3.id, message3);
                                z4 = z8;
                                updates3 = updates4;
                                Utilities.d.c(new b3a(z3aVar3, tL_updateNewMessage, (byte) 0));
                                arrayList9.remove(i8);
                                i8--;
                                z3aVar2 = z3aVar3;
                                vf6Var2 = vf6Var3;
                                arrayList3 = arrayList9;
                                arrayList4 = arrayList10;
                            } else {
                                z4 = z8;
                                updates3 = updates4;
                                if (update instanceof TL_update.TL_updateNewEphemeralMessage) {
                                    TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update;
                                    TLRPC.TL_message b = t34.b(tL_updateNewEphemeralMessage.message);
                                    sparseArray2.put(b.id, b);
                                    arrayList10.add(tL_updateNewEphemeralMessage.message);
                                    arrayList9.remove(i8);
                                    i8--;
                                    z3aVar2 = z3aVar3;
                                    vf6Var2 = vf6Var3;
                                    arrayList3 = arrayList9;
                                    arrayList4 = arrayList10;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update;
                                    long Q1 = na7.Q1(tL_updateNewChannelMessage);
                                    TLRPC.Chat K0 = z3aVar3.getMessagesController().K0(Long.valueOf(Q1));
                                    if ((K0 == null || K0.megagroup) && (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) != null && (messageReplyHeader.reply_to_top_id != 0 || messageReplyHeader.reply_to_msg_id != 0)) {
                                        if (vf6Var4 == null) {
                                            vf6Var4 = new vf6();
                                        }
                                        long B0 = k27.B0(tL_updateNewChannelMessage.message);
                                        SparseArray sparseArray3 = (SparseArray) vf6Var4.f(B0);
                                        if (sparseArray3 == null) {
                                            sparseArray3 = new SparseArray();
                                            vf6Var4.k(sparseArray3, B0);
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
                                            vf6Var2 = vf6Var3;
                                            messageReplies.recent_repliers.add(0, peer);
                                        } else {
                                            vf6Var2 = vf6Var3;
                                        }
                                        messageReplies.replies++;
                                    } else {
                                        vf6Var2 = vf6Var3;
                                    }
                                    TLRPC.Message message4 = tL_updateNewChannelMessage.message;
                                    sparseArray2.put(message4.id, message4);
                                    Utilities.d.c(new c3a(z3aVar3, tL_updateNewChannelMessage, (byte) 0));
                                    arrayList9.remove(i8);
                                    int i10 = i8 - 1;
                                    if (tL_updateNewChannelMessage.message.pinned) {
                                        arrayList5 = arrayList10;
                                        arrayList3 = arrayList9;
                                        i6 = i10;
                                        z3aVar2 = z3aVar3;
                                        Utilities.d.c(new k1a(z3aVar3, tL_updateNewChannelMessage, Q1, (byte) 1));
                                    } else {
                                        z3aVar2 = z3aVar3;
                                        i6 = i10;
                                        arrayList3 = arrayList9;
                                        arrayList5 = arrayList10;
                                    }
                                    arrayList4 = arrayList5;
                                    i8 = i6;
                                } else {
                                    z3aVar2 = z3aVar3;
                                    vf6Var2 = vf6Var3;
                                    arrayList3 = arrayList9;
                                    arrayList4 = arrayList10;
                                    if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                                        TLRPC.Message message5 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                                        sparseArray2.put(message5.id, message5);
                                        arrayList3.remove(i8);
                                        i8--;
                                        z7 = z4;
                                    } else if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                                        ox8 f = ox8.f(z3aVar2.currentAccount);
                                        if (arrayList7.isEmpty()) {
                                            i5 = 0;
                                            J1 = null;
                                        } else {
                                            i5 = 0;
                                            J1 = k27.J1(((k27) arrayList7.get(0)).k);
                                        }
                                        if (arrayList7.isEmpty()) {
                                            valueOf = null;
                                        } else {
                                            valueOf = Integer.valueOf(k27.I1(((k27) arrayList7.get(i5)).k));
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
                        vf6Var3 = vf6Var2;
                    }
                    boolean z9 = z5;
                    TLRPC.Updates updates5 = updates4;
                    vf6 vf6Var5 = vf6Var3;
                    ArrayList arrayList11 = arrayList10;
                    if (!arrayList11.isEmpty()) {
                        boolean z10 = z9;
                        z3aVar2.getMessagesStorage().c1(arrayList11, z10);
                        i2 = z10;
                    } else {
                        i2 = z9;
                    }
                    char c = 3;
                    char c2 = 4;
                    if (vf6Var4 != null) {
                        z3aVar2.getMessagesStorage().X0(null, null, vf6Var4, i2);
                        kk7 notificationCenter = z3aVar2.getNotificationCenter();
                        Object[] objArr = new Object[4];
                        i3 = 0;
                        objArr[0] = null;
                        objArr[i2] = null;
                        objArr[2] = vf6Var4;
                        objArr[3] = Boolean.TRUE;
                        notificationCenter.k(77, objArr);
                    } else {
                        i3 = 0;
                    }
                    int[] iArr2 = new int[i2];
                    vf6 vf6Var6 = vf6Var5;
                    iArr2[i3] = i3;
                    final int[] iArr3 = {i3};
                    final ArrayList arrayList12 = new ArrayList();
                    int i11 = 0;
                    while (i11 < arrayList7.size()) {
                        k27 k27Var2 = (k27) arrayList7.get(i11);
                        String str2 = (String) arrayList8.get(i11);
                        final TLRPC.Message message7 = k27Var2.k;
                        char c3 = c;
                        final int i12 = message7.id;
                        char c4 = c2;
                        final ArrayList arrayList13 = new ArrayList();
                        z3a z3aVar4 = z3aVar2;
                        Integer num = (Integer) vf6Var6.f(message7.random_id);
                        if (num != null && (message = (TLRPC.Message) sparseArray2.get(num.intValue())) != null) {
                            k27.B0(message);
                            arrayList13.add(message);
                            if ((message.flags & 33554432) != 0) {
                                TLRPC.Message message8 = k27Var2.k;
                                message8.ttl_period = message.ttl_period;
                                message8.flags |= 33554432;
                            }
                            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                                k27 k27Var3 = (k27) arrayList7.get(0);
                                int i13 = i11;
                                int i14 = message.id;
                                k27Var = k27Var2;
                                ArrayList arrayList14 = arrayList8;
                                sparseArray = sparseArray2;
                                HashMap<String, String> hashMap = message.params;
                                vf6Var = vf6Var6;
                                iArr = iArr2;
                                updates2 = updates5;
                                i4 = i13;
                                message2 = message;
                                z3aVar = z3aVar4;
                                arrayList2 = arrayList12;
                                z3aVar.y0(k27Var3, message2, i14, arrayList14, false, -1, hashMap);
                                arrayList = arrayList14;
                            } else {
                                vf6Var = vf6Var6;
                                iArr = iArr2;
                                i4 = i11;
                                k27Var = k27Var2;
                                arrayList = arrayList8;
                                sparseArray = sparseArray2;
                                updates2 = updates5;
                                z3aVar = z3aVar4;
                                message2 = message;
                                arrayList2 = arrayList12;
                                z3aVar.y0(k27Var, message2, message2.id, Collections.singletonList(str2), false, -1, message2.params);
                            }
                            final int o1 = k27Var.o1();
                            message7.id = message2.id;
                            int i15 = message2.quick_reply_shortcut_id;
                            message7.quick_reply_shortcut_id = i15;
                            if (i15 != 0) {
                                message7.flags |= 1073741824;
                            }
                            final long j = message2.grouped_id;
                            if (!z6) {
                                Integer num2 = (Integer) z3aVar.getMessagesController().Q.get(Long.valueOf(message2.dialog_id));
                                if (num2 == null) {
                                    num2 = Integer.valueOf(z3aVar.getMessagesStorage().S(message2.dialog_id, message2.out));
                                    z3aVar.getMessagesController().Q.put(Long.valueOf(message2.dialog_id), num2);
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
                            z3aVar.getStatsController().i(a.f(), 1, 1);
                            message7.send_state = 0;
                            message7.errorAllowedPriceStars = 0L;
                            message7.errorNewPriceStars = 0L;
                            kk7 notificationCenter2 = z3aVar.getNotificationCenter();
                            Integer valueOf2 = Integer.valueOf(i12);
                            Integer valueOf3 = Integer.valueOf(message7.id);
                            Long valueOf4 = Long.valueOf(message7.dialog_id);
                            Long valueOf5 = Long.valueOf(j);
                            Integer valueOf6 = Integer.valueOf(o1);
                            Boolean valueOf7 = Boolean.valueOf(z7);
                            arrayList12 = arrayList2;
                            final z3a z3aVar5 = z3aVar;
                            Object[] objArr2 = new Object[7];
                            objArr2[0] = valueOf2;
                            objArr2[1] = valueOf3;
                            objArr2[2] = message7;
                            objArr2[c3] = valueOf4;
                            objArr2[c4] = valueOf5;
                            objArr2[5] = valueOf6;
                            objArr2[6] = valueOf7;
                            notificationCenter2.k(21, objArr2);
                            kk7 notificationCenter3 = z3aVar5.getNotificationCenter();
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
                            z3aVar2 = z3aVar5;
                            z3aVar5.getMessagesStorage().a.c(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.d3a.run():void");
                                }
                            });
                            i11 = i4 + 1;
                            z6 = z11;
                            updates5 = updates2;
                            iArr2 = iArr;
                            sparseArray2 = sparseArray;
                            c = c3;
                            c2 = c4;
                            vf6Var6 = vf6Var;
                            arrayList8 = arrayList;
                        } else {
                            z2 = z6;
                            updates = updates5;
                            z3aVar2 = z3aVar4;
                            z = true;
                            Utilities.d.c(new l1a(z3aVar2, updates, (byte) 1));
                            r5 = z2;
                        }
                    }
                    z2 = z6;
                    updates = updates5;
                    z = false;
                    Utilities.d.c(new l1a(z3aVar2, updates, (byte) 1));
                    r5 = z2;
                } else {
                    r5 = z6;
                    i = 2;
                    ij.c0(z3aVar2.currentAccount, tL_error, null, tLObject2, new Object[0]);
                    z = true;
                }
                if (z) {
                    int i16 = 0;
                    while (i16 < arrayList7.size()) {
                        k27 k27Var4 = (k27) arrayList7.get(i16);
                        TLRPC.Message message9 = k27Var4.k;
                        z3aVar2.getMessagesStorage().K0(r5, message9);
                        int i17 = i;
                        message9.send_state = i17;
                        if (r5 == 0 && tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                            gta.v(z3aVar2.currentAccount, false);
                            message9.errorAllowedPriceStars = gta.l(tLObject2);
                            message9.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                            gta.v(z3aVar2.currentAccount, false).d0(Arrays.asList(k27Var4));
                            z3aVar2.getMessagesStorage().U1(k27.B0(message9), message9);
                        }
                        z3aVar2.getNotificationCenter().k(23, Integer.valueOf(message9.id));
                        z3aVar2.c0(message9.id);
                        z3aVar2.h0(message9.id, r5);
                        i16++;
                        i = i17;
                    }
                    return;
                }
                return;
            case 1:
                z3a z3aVar6 = (z3a) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLRPC.Message message10 = (TLRPC.Message) this.h;
                TLObject tLObject3 = (TLObject) this.d;
                k27 k27Var5 = (k27) this.n;
                boolean z12 = this.e;
                TLObject tLObject4 = (TLObject) this.f;
                if (tL_error2 == null) {
                    String str3 = message10.attachPath;
                    TLRPC.Updates updates6 = (TLRPC.Updates) tLObject3;
                    ArrayList<TLRPC.Update> arrayList15 = updates6.updates;
                    message10.send_state = 0;
                    ArrayList arrayList16 = new ArrayList();
                    arrayList16.add(message10);
                    z3aVar6.getMessagesStorage().g1(arrayList16, false, true, false, 0, false, 0, 0L);
                    pub pubVar = z3aVar6.getMessagesController().g4;
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) pubVar.e.f(pub.p(message10.id, -message10.dialog_id));
                    if (tL_forumTopic != null) {
                        tL_forumTopic.topMessage = message10;
                        pubVar.y(-message10.dialog_id, true);
                    }
                    Utilities.d.c(new e3a(z3aVar6, updates6, message10, z12, (byte) 1));
                    return;
                }
                ij.c0(z3aVar6.currentAccount, tL_error2, null, tLObject4, new Object[0]);
                z3aVar6.h0(message10.id, z12);
                z3aVar6.k0(k27Var5);
                return;
            case 2:
                ((uf2) this.b).c0((TLRPC.TL_error) this.c, (TLObject) this.d, (int[]) this.f, (ArrayList) this.h, this.e, (TLRPC.User) this.n);
                return;
            case 3:
                xy6 xy6Var = (xy6) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f;
                boolean z13 = this.e;
                TLRPC.User user = (TLRPC.User) this.h;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.n;
                int i18 = xy6Var.k;
                ArrayList arrayList17 = xy6Var.e;
                d dVar = xy6Var.g;
                if (dVar != null && dVar.getParentActivity() != null) {
                    if (tL_error3 == null) {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject5;
                        if (!tL_updates.chats.isEmpty()) {
                            na7.q1(i18).Y2(0, tL_updates.chats.get(0).id, true);
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
                        qy6 qy6Var = xy6Var.f;
                        xy6 xy6Var2 = qy6Var.c;
                        int i20 = 0;
                        while (true) {
                            arrayList6 = xy6Var2.c;
                            if (i20 < arrayList6.size()) {
                                xy6 xy6Var3 = xy6Var2;
                                if (((TLRPC.TL_chatInviteImporter) arrayList6.get(i20)).user_id != tL_chatInviteImporter.user_id) {
                                    i20++;
                                    xy6Var2 = xy6Var3;
                                }
                            } else {
                                i20 = -1;
                            }
                        }
                        if (i20 >= 0) {
                            arrayList6.remove(i20);
                            qy6Var.r((!qy6Var.c.B ? 1 : 0) + i20);
                            if (arrayList6.isEmpty()) {
                                qy6Var.r(1);
                            }
                        }
                        xy6Var.f(xy6Var.t, false, true);
                        if (z13) {
                            y11 y11Var = new y11(dVar.getParentActivity(), dVar.getResourceProvider());
                            be0 be0Var = y11Var.a;
                            be0Var.setRoundRadius(gl.L(15.0f));
                            be0Var.f(user, new pb0(0, user));
                            String k = l7c.k(user, true);
                            if (xy6Var.a) {
                                a0 = k96.a0("HasBeenAddedToChannel", null, 2131749172, k);
                            } else {
                                a0 = k96.a0("HasBeenAddedToGroup", null, 2131749171, k);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0);
                            int indexOf = a0.indexOf(k);
                            spannableStringBuilder.setSpan(new z3c(gl.o()), indexOf, k.length() + indexOf, 18);
                            y11Var.b.setText(spannableStringBuilder);
                            if (arrayList17.isEmpty()) {
                                m21.g(dVar, y11Var, 2750).j();
                            } else {
                                m21.f(xy6Var.h, y11Var, 2750).j();
                            }
                        }
                        r6 t = dVar.getActionBar().t();
                        if (TextUtils.isEmpty(xy6Var.t) && xy6Var.l) {
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
                    ij.c0(i18, tL_error3, dVar, tL_messages_hideChatJoinRequest, new Object[0]);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList18 = (ArrayList) this.h;
                d dVar2 = (d) this.c;
                mu1 mu1Var = (mu1) this.d;
                TLRPC.Document document2 = (TLRPC.Document) this.f;
                boolean z14 = this.e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.n;
                arrayList18.add(new jm6(0, ((File) this.b).getAbsolutePath(), 0, false, 0, 0));
                PhotoViewer.r0().T1(dVar2.getParentActivity(), null, dVar2.getResourceProvider());
                PhotoViewer.r0().o1(arrayList18, 0, 11, false, new Object(), mu1Var);
                PhotoViewer r0 = PhotoViewer.r0();
                if (z14) {
                    document = document2;
                } else {
                    document = null;
                }
                r0.V(document2, document, false, null);
                xv2 e = xv2.e();
                if (z14) {
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                }
                e.T = tL_messages_stickerSet;
                return;
            default:
                ((p3c) this.b).y0((TLRPC.TL_error) this.c, this.e, (TLObject) this.d, (byte[]) this.f, (String) this.h, (TL_account.passwordInputSettings) this.n);
                return;
        }
    }

    public o2a(xy6 xy6Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.b = xy6Var;
        this.c = tL_error;
        this.d = tLObject;
        this.f = tL_chatInviteImporter;
        this.e = z;
        this.h = user;
        this.n = tL_messages_hideChatJoinRequest;
    }

    public o2a(z3a z3aVar, TLRPC.TL_error tL_error, TLObject tLObject, boolean z, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.b = z3aVar;
        this.c = tL_error;
        this.d = tLObject;
        this.e = z;
        this.h = arrayList;
        this.n = arrayList2;
        this.f = tLObject2;
    }

    public o2a(z3a z3aVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, k27 k27Var, String str, HashMap hashMap, boolean z, TLObject tLObject2) {
        this.b = z3aVar;
        this.c = tL_error;
        this.h = message;
        this.d = tLObject;
        this.n = k27Var;
        this.e = z;
        this.f = tLObject2;
    }

    public o2a(p3c p3cVar, TLRPC.TL_error tL_error, boolean z, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.b = p3cVar;
        this.c = tL_error;
        this.e = z;
        this.d = tLObject;
        this.f = bArr;
        this.h = str;
        this.n = passwordinputsettings;
    }

    public o2a(File file, ArrayList arrayList, d dVar, mu1 mu1Var, TLRPC.Document document, boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.b = file;
        this.h = arrayList;
        this.c = dVar;
        this.d = mu1Var;
        this.f = document;
        this.e = z;
        this.n = tL_messages_stickerSet;
    }
}
