package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class nx implements Runnable {
    public final int f24456a = 0;
    public final yy f24457b;
    public final TLRPC.TL_error f24458c;
    public final TLObject d;
    public final boolean f24459e;
    public final TLObject f24460f;
    public final Object h;
    public final Object f24461n;

    public nx(yy yyVar, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.f24457b = yyVar;
        this.f24458c = tL_error;
        this.d = tLObject;
        this.f24459e = z10;
        this.h = arrayList;
        this.f24461n = arrayList2;
        this.f24460f = tLObject2;
    }

    @Override
    public final void run() {
        ?? r12;
        int i3;
        TLRPC.TL_error tL_error;
        boolean z10;
        String str;
        int i10;
        boolean z11;
        TLRPC.Message message;
        int i11;
        a0.h hVar;
        ArrayList arrayList;
        final zi ziVar;
        TLRPC.Message message2;
        int i12;
        ArrayList arrayList2;
        char c2;
        final int[] iArr;
        final int[] iArr2;
        yy yyVar;
        boolean z12;
        TLRPC.TL_error tL_error2;
        boolean z13;
        SparseArray sparseArray;
        a0.h hVar2;
        ArrayList<TLRPC.Update> arrayList3;
        ArrayList arrayList4;
        int i13;
        String K1;
        Integer valueOf;
        int i14;
        TLRPC.MessageReplyHeader messageReplyHeader;
        a0.h hVar3;
        int i15;
        int i16;
        a0.h hVar4;
        a0.h hVar5 = null;
        int i17 = 1;
        switch (this.f24456a) {
            case 0:
                yy yyVar2 = this.f24457b;
                TLRPC.TL_error tL_error3 = this.f24458c;
                TLObject tLObject = this.d;
                boolean z14 = this.f24459e;
                ArrayList arrayList5 = (ArrayList) this.h;
                ArrayList arrayList6 = (ArrayList) this.f24461n;
                TLObject tLObject2 = this.f24460f;
                if (tL_error3 == null) {
                    SparseArray sparseArray2 = new SparseArray();
                    a0.h hVar6 = new a0.h();
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList<TLRPC.Update> arrayList7 = updates.updates;
                    ArrayList arrayList8 = new ArrayList();
                    int i18 = 0;
                    boolean z15 = z14;
                    while (i18 < arrayList7.size()) {
                        TLRPC.Update update = arrayList7.get(i18);
                        if (update instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update;
                            hVar6.k(Integer.valueOf(tL_updateMessageID.f27259id), tL_updateMessageID.random_id);
                            arrayList7.remove(i18);
                            i18--;
                            tL_error2 = tL_error3;
                        } else {
                            TLRPC.TL_error tL_error4 = tL_error3;
                            if (update instanceof TL_update.TL_updateNewMessage) {
                                TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update;
                                TLRPC.Message message3 = tL_updateNewMessage.message;
                                sparseArray2.put(message3.f27022id, message3);
                                tL_error2 = tL_error4;
                                Utilities.d.c(new yx(yyVar2, tL_updateNewMessage, 1));
                                arrayList7.remove(i18);
                                i18--;
                                z13 = z14;
                                sparseArray = sparseArray2;
                                hVar2 = hVar6;
                                arrayList3 = arrayList7;
                                arrayList4 = arrayList8;
                                i14 = 1;
                            } else {
                                tL_error2 = tL_error4;
                                if (update instanceof TL_update.TL_updateNewEphemeralMessage) {
                                    TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update;
                                    TLRPC.TL_message b10 = cg.v.b(tL_updateNewEphemeralMessage.message);
                                    sparseArray2.put(b10.f27022id, b10);
                                    arrayList8.add(tL_updateNewEphemeralMessage.message);
                                    arrayList7.remove(i18);
                                    i18--;
                                } else {
                                    if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update;
                                        long V1 = hp.V1(tL_updateNewChannelMessage);
                                        TLRPC.Chat M0 = yyVar2.getMessagesController().M0(Long.valueOf(V1));
                                        if ((M0 != null && !M0.megagroup) || (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) == null || (messageReplyHeader.reply_to_top_id == 0 && messageReplyHeader.reply_to_msg_id == 0)) {
                                            i15 = 1;
                                        } else {
                                            if (hVar5 == null) {
                                                hVar5 = new a0.h();
                                            }
                                            long B0 = zi.B0(tL_updateNewChannelMessage.message);
                                            SparseArray sparseArray3 = (SparseArray) hVar5.f(B0);
                                            if (sparseArray3 == null) {
                                                sparseArray3 = new SparseArray();
                                                hVar5.k(sparseArray3, B0);
                                            }
                                            TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                            int i19 = messageReplyHeader2.reply_to_top_id;
                                            if (i19 == 0) {
                                                i19 = messageReplyHeader2.reply_to_msg_id;
                                            }
                                            TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray3.get(i19);
                                            if (messageReplies == null) {
                                                messageReplies = new TLRPC.TL_messageReplies();
                                                sparseArray3.put(i19, messageReplies);
                                            }
                                            TLRPC.Peer peer = tL_updateNewChannelMessage.message.from_id;
                                            if (peer != null) {
                                                hVar3 = hVar5;
                                                messageReplies.recent_repliers.add(0, peer);
                                            } else {
                                                hVar3 = hVar5;
                                            }
                                            i15 = 1;
                                            messageReplies.replies++;
                                            hVar5 = hVar3;
                                        }
                                        TLRPC.Message message4 = tL_updateNewChannelMessage.message;
                                        sparseArray2.put(message4.f27022id, message4);
                                        Utilities.d.c(new aw(yyVar2, tL_updateNewChannelMessage, i15));
                                        arrayList7.remove(i18);
                                        int i20 = i18 - 1;
                                        if (tL_updateNewChannelMessage.message.pinned) {
                                            yy yyVar3 = yyVar2;
                                            i16 = i20;
                                            arrayList3 = arrayList7;
                                            hVar4 = hVar6;
                                            arrayList4 = arrayList8;
                                            z13 = z14;
                                            sparseArray = sparseArray2;
                                            yyVar2 = yyVar3;
                                            Utilities.d.c(new bw(yyVar3, tL_updateNewChannelMessage, V1, 1));
                                        } else {
                                            i16 = i20;
                                            z13 = z14;
                                            sparseArray = sparseArray2;
                                            hVar4 = hVar6;
                                            arrayList3 = arrayList7;
                                            arrayList4 = arrayList8;
                                        }
                                        hVar2 = hVar4;
                                        i18 = i16;
                                    } else {
                                        z13 = z14;
                                        sparseArray = sparseArray2;
                                        hVar2 = hVar6;
                                        arrayList3 = arrayList7;
                                        arrayList4 = arrayList8;
                                        if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                                            TLRPC.Message message5 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                                            sparseArray.put(message5.f27022id, message5);
                                            arrayList3.remove(i18);
                                            i18--;
                                            i14 = 1;
                                            z15 = true;
                                            i18 += i14;
                                            arrayList7 = arrayList3;
                                            hVar6 = hVar2;
                                            sparseArray2 = sparseArray;
                                            arrayList8 = arrayList4;
                                            z14 = z13;
                                            tL_error3 = tL_error2;
                                            i17 = i14;
                                        } else if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                                            lg.u1 f10 = lg.u1.f(yyVar2.currentAccount);
                                            if (arrayList5.isEmpty()) {
                                                i13 = 0;
                                                K1 = null;
                                            } else {
                                                i13 = 0;
                                                K1 = zi.K1(((zi) arrayList5.get(0)).f26868k);
                                            }
                                            if (arrayList5.isEmpty()) {
                                                valueOf = null;
                                            } else {
                                                valueOf = Integer.valueOf(zi.J1(((zi) arrayList5.get(i13)).f26868k));
                                            }
                                            f10.j(update, K1, valueOf.intValue());
                                            TLRPC.Message message6 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                                            sparseArray.put(message6.f27022id, message6);
                                            arrayList3.remove(i18);
                                            i18--;
                                            i14 = 1;
                                        }
                                    }
                                    i14 = 1;
                                    i18 += i14;
                                    arrayList7 = arrayList3;
                                    hVar6 = hVar2;
                                    sparseArray2 = sparseArray;
                                    arrayList8 = arrayList4;
                                    z14 = z13;
                                    tL_error3 = tL_error2;
                                    i17 = i14;
                                }
                            }
                            z15 = false;
                            i18 += i14;
                            arrayList7 = arrayList3;
                            hVar6 = hVar2;
                            sparseArray2 = sparseArray;
                            arrayList8 = arrayList4;
                            z14 = z13;
                            tL_error3 = tL_error2;
                            i17 = i14;
                        }
                        z13 = z14;
                        sparseArray = sparseArray2;
                        hVar2 = hVar6;
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList8;
                        i14 = 1;
                        i18 += i14;
                        arrayList7 = arrayList3;
                        hVar6 = hVar2;
                        sparseArray2 = sparseArray;
                        arrayList8 = arrayList4;
                        z14 = z13;
                        tL_error3 = tL_error2;
                        i17 = i14;
                    }
                    TLRPC.TL_error tL_error5 = tL_error3;
                    int i21 = i17;
                    boolean z16 = z14;
                    final SparseArray sparseArray4 = sparseArray2;
                    a0.h hVar7 = hVar6;
                    ArrayList arrayList9 = arrayList8;
                    int i22 = 2;
                    if (!arrayList9.isEmpty()) {
                        yyVar2.getMessagesStorage().f1(arrayList9, i21);
                    }
                    char c10 = 3;
                    if (hVar5 != null) {
                        yyVar2.getMessagesStorage().a1(null, null, hVar5, i21);
                        hs notificationCenter = yyVar2.getNotificationCenter();
                        Object[] objArr = new Object[4];
                        i10 = 0;
                        objArr[0] = null;
                        objArr[i21] = null;
                        objArr[2] = hVar5;
                        objArr[3] = Boolean.TRUE;
                        notificationCenter.k(77, objArr);
                    } else {
                        i10 = 0;
                    }
                    int[] iArr3 = new int[i21];
                    iArr3[i10] = i10;
                    int[] iArr4 = {i10};
                    final ArrayList arrayList10 = new ArrayList();
                    int i23 = 0;
                    while (i23 < arrayList5.size()) {
                        zi ziVar2 = (zi) arrayList5.get(i23);
                        String str2 = (String) arrayList6.get(i23);
                        TLRPC.Message message7 = ziVar2.f26868k;
                        char c11 = c10;
                        int i24 = message7.f27022id;
                        i3 = i22;
                        final ArrayList arrayList11 = new ArrayList();
                        int i25 = i23;
                        Integer num = (Integer) hVar7.f(message7.random_id);
                        if (num != null && (message = (TLRPC.Message) sparseArray4.get(num.intValue())) != null) {
                            zi.B0(message);
                            arrayList11.add(message);
                            if ((message.flags & 33554432) != 0) {
                                TLRPC.Message message8 = ziVar2.f26868k;
                                i11 = i24;
                                message8.ttl_period = message.ttl_period;
                                message8.flags |= 33554432;
                            } else {
                                i11 = i24;
                            }
                            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                                ziVar = ziVar2;
                                ArrayList arrayList12 = arrayList6;
                                i12 = i25;
                                c2 = 4;
                                hVar = hVar7;
                                arrayList2 = arrayList10;
                                message2 = message7;
                                yyVar2.z0((zi) arrayList5.get(0), message, message.f27022id, arrayList12, false, -1, message.params);
                                arrayList = arrayList12;
                            } else {
                                hVar = hVar7;
                                arrayList = arrayList6;
                                ziVar = ziVar2;
                                message2 = message7;
                                i12 = i25;
                                arrayList2 = arrayList10;
                                c2 = 4;
                                yyVar2.z0(ziVar, message, message.f27022id, Collections.singletonList(str2), false, -1, message.params);
                            }
                            final int p12 = ziVar.p1();
                            message2.f27022id = message.f27022id;
                            int i26 = message.quick_reply_shortcut_id;
                            message2.quick_reply_shortcut_id = i26;
                            if (i26 != 0) {
                                message2.flags |= 1073741824;
                            }
                            final long j10 = message.grouped_id;
                            if (!z16) {
                                iArr = iArr3;
                                iArr2 = iArr4;
                                Integer num2 = (Integer) yyVar2.getMessagesController().Q.get(Long.valueOf(message.dialog_id));
                                if (num2 == null) {
                                    yyVar = yyVar2;
                                    num2 = Integer.valueOf(yyVar2.getMessagesStorage().U(message.dialog_id, message.out));
                                    yyVar.getMessagesController().Q.put(Long.valueOf(message.dialog_id), num2);
                                } else {
                                    yyVar = yyVar2;
                                }
                                if (num2.intValue() < message.f27022id) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                message.unread = z12;
                            } else {
                                iArr = iArr3;
                                iArr2 = iArr4;
                                yyVar = yyVar2;
                            }
                            iArr[0] = iArr[0] + 1;
                            arrayList2.add(Integer.valueOf(i11));
                            yyVar.getStatsController().k(t0.f(), 1, 1);
                            message2.send_state = 0;
                            message2.errorAllowedPriceStars = 0L;
                            message2.errorNewPriceStars = 0L;
                            hs notificationCenter2 = yyVar.getNotificationCenter();
                            Integer valueOf2 = Integer.valueOf(i11);
                            Integer valueOf3 = Integer.valueOf(message2.f27022id);
                            Long valueOf4 = Long.valueOf(message2.dialog_id);
                            Long valueOf5 = Long.valueOf(j10);
                            Integer valueOf6 = Integer.valueOf(p12);
                            Boolean valueOf7 = Boolean.valueOf(z15);
                            ArrayList arrayList13 = arrayList2;
                            Object[] objArr2 = new Object[7];
                            objArr2[0] = valueOf2;
                            objArr2[1] = valueOf3;
                            objArr2[i3] = message2;
                            objArr2[c11] = valueOf4;
                            objArr2[c2] = valueOf5;
                            objArr2[5] = valueOf6;
                            objArr2[6] = valueOf7;
                            notificationCenter2.k(21, objArr2);
                            hs notificationCenter3 = yyVar.getNotificationCenter();
                            Integer valueOf8 = Integer.valueOf(i11);
                            Integer valueOf9 = Integer.valueOf(message2.f27022id);
                            Long valueOf10 = Long.valueOf(message2.dialog_id);
                            Long valueOf11 = Long.valueOf(j10);
                            Integer valueOf12 = Integer.valueOf(p12);
                            Boolean valueOf13 = Boolean.valueOf(z15);
                            Object[] objArr3 = new Object[7];
                            objArr3[0] = valueOf8;
                            objArr3[1] = valueOf9;
                            objArr3[i3] = message2;
                            objArr3[c11] = valueOf10;
                            objArr3[c2] = valueOf11;
                            objArr3[5] = valueOf12;
                            objArr3[6] = valueOf13;
                            notificationCenter3.k(22, objArr3);
                            final int i27 = i11;
                            final TLRPC.Message message9 = message2;
                            final yy yyVar4 = yyVar;
                            final boolean z17 = z15;
                            final boolean z18 = z16;
                            arrayList10 = arrayList13;
                            yyVar2 = yyVar4;
                            yyVar.getMessagesStorage().f24934a.c(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cy.run():void");
                                }
                            });
                            int i28 = i12 + 1;
                            z16 = z18;
                            z15 = z17;
                            iArr4 = iArr2;
                            iArr3 = iArr;
                            i22 = i3;
                            hVar7 = hVar;
                            arrayList6 = arrayList;
                            i23 = i28;
                            c10 = c11;
                        } else {
                            z11 = z16;
                            z10 = true;
                            Utilities.d.c(new cw(yyVar2, updates, 1));
                            tL_error = tL_error5;
                            r12 = z11;
                        }
                    }
                    i3 = i22;
                    z11 = z16;
                    z10 = false;
                    Utilities.d.c(new cw(yyVar2, updates, 1));
                    tL_error = tL_error5;
                    r12 = z11;
                } else {
                    r12 = z14;
                    i3 = 2;
                    tL_error = tL_error3;
                    org.telegram.ui.Components.t4.e0(yyVar2.currentAccount, tL_error, null, tLObject2, new Object[0]);
                    z10 = true;
                }
                if (z10) {
                    int i29 = 0;
                    while (i29 < arrayList5.size()) {
                        zi ziVar3 = (zi) arrayList5.get(i29);
                        TLRPC.Message message10 = ziVar3.f26868k;
                        yyVar2.getMessagesStorage().N0(r12, message10);
                        int i30 = i3;
                        message10.send_state = i30;
                        if (r12 == 0 && tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                            ci.e9.y(yyVar2.currentAccount, false);
                            message10.errorAllowedPriceStars = ci.e9.o(tLObject2);
                            message10.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                            ci.e9.y(yyVar2.currentAccount, false).d0(Arrays.asList(ziVar3));
                            yyVar2.getMessagesStorage().X1(zi.B0(message10), message10);
                        }
                        yyVar2.getNotificationCenter().k(23, Integer.valueOf(message10.f27022id));
                        yyVar2.d0(message10.f27022id);
                        yyVar2.i0(message10.f27022id, r12);
                        i29++;
                        i3 = i30;
                    }
                    return;
                }
                return;
            default:
                yy yyVar5 = this.f24457b;
                TLRPC.TL_error tL_error6 = this.f24458c;
                TLRPC.Message message11 = (TLRPC.Message) this.h;
                TLObject tLObject3 = this.d;
                zi ziVar4 = (zi) this.f24461n;
                boolean z19 = this.f24459e;
                TLObject tLObject4 = this.f24460f;
                if (tL_error6 == null) {
                    String str3 = message11.attachPath;
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject3;
                    ArrayList<TLRPC.Update> arrayList14 = updates2.updates;
                    message11.send_state = 0;
                    ArrayList arrayList15 = new ArrayList();
                    arrayList15.add(message11);
                    yyVar5.getMessagesStorage().j1(arrayList15, false, true, false, 0, false, 0, 0L);
                    c00 c00Var = yyVar5.getMessagesController().f23102q7;
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) c00Var.f21925e.f(c00.p(message11.f27022id, -message11.dialog_id));
                    if (tL_forumTopic != null) {
                        tL_forumTopic.topMessage = message11;
                        c00Var.y(-message11.dialog_id, true);
                    }
                    Utilities.d.c(new dy(yyVar5, updates2, message11, z19, 1));
                    return;
                }
                org.telegram.ui.Components.t4.e0(yyVar5.currentAccount, tL_error6, null, tLObject4, new Object[0]);
                yyVar5.i0(message11.f27022id, z19);
                yyVar5.l0(ziVar4);
                return;
        }
    }

    public nx(yy yyVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, zi ziVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.f24457b = yyVar;
        this.f24458c = tL_error;
        this.h = message;
        this.d = tLObject;
        this.f24461n = ziVar;
        this.f24459e = z10;
        this.f24460f = tLObject2;
    }
}
