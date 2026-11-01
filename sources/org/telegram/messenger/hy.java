package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class hy implements Runnable {
    public final int f16135a = 0;
    public final rz f16136b;
    public final TLRPC.TL_error f16137c;
    public final TLObject d;
    public final boolean e;
    public final TLObject f16138f;
    public final Object h;
    public final Object f16139n;

    public hy(rz rzVar, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.f16136b = rzVar;
        this.f16137c = tL_error;
        this.d = tLObject;
        this.e = z10;
        this.h = arrayList;
        this.f16139n = arrayList2;
        this.f16138f = tLObject2;
    }

    @Override
    public final void run() {
        ?? r12;
        int i10;
        TLRPC.TL_error tL_error;
        boolean z10;
        String str;
        int i11;
        boolean z11;
        TLRPC.Message message;
        int i12;
        a0.h hVar;
        ArrayList arrayList;
        final kj kjVar;
        TLRPC.Message message2;
        int i13;
        ArrayList arrayList2;
        char c10;
        final int[] iArr;
        final int[] iArr2;
        rz rzVar;
        boolean z12;
        TLRPC.TL_error tL_error2;
        boolean z13;
        SparseArray sparseArray;
        a0.h hVar2;
        ArrayList<TLRPC.Update> arrayList3;
        ArrayList arrayList4;
        int i14;
        String K1;
        Integer valueOf;
        int i15;
        TLRPC.MessageReplyHeader messageReplyHeader;
        a0.h hVar3;
        int i16;
        int i17;
        a0.h hVar4;
        a0.h hVar5 = null;
        int i18 = 1;
        switch (this.f16135a) {
            case 0:
                rz rzVar2 = this.f16136b;
                TLRPC.TL_error tL_error3 = this.f16137c;
                TLObject tLObject = this.d;
                boolean z14 = this.e;
                ArrayList arrayList5 = (ArrayList) this.h;
                ArrayList arrayList6 = (ArrayList) this.f16139n;
                TLObject tLObject2 = this.f16138f;
                if (tL_error3 == null) {
                    SparseArray sparseArray2 = new SparseArray();
                    a0.h hVar6 = new a0.h();
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList<TLRPC.Update> arrayList7 = updates.updates;
                    ArrayList arrayList8 = new ArrayList();
                    int i19 = 0;
                    boolean z15 = z14;
                    while (i19 < arrayList7.size()) {
                        TLRPC.Update update = arrayList7.get(i19);
                        if (update instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update;
                            hVar6.k(Integer.valueOf(tL_updateMessageID.f20051id), tL_updateMessageID.random_id);
                            arrayList7.remove(i19);
                            i19--;
                            tL_error2 = tL_error3;
                        } else {
                            TLRPC.TL_error tL_error4 = tL_error3;
                            if (update instanceof TL_update.TL_updateNewMessage) {
                                TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update;
                                TLRPC.Message message3 = tL_updateNewMessage.message;
                                sparseArray2.put(message3.f19815id, message3);
                                tL_error2 = tL_error4;
                                Utilities.d.c(new sy(rzVar2, tL_updateNewMessage, 1));
                                arrayList7.remove(i19);
                                i19--;
                                z13 = z14;
                                sparseArray = sparseArray2;
                                hVar2 = hVar6;
                                arrayList3 = arrayList7;
                                arrayList4 = arrayList8;
                                i15 = 1;
                            } else {
                                tL_error2 = tL_error4;
                                if (update instanceof TL_update.TL_updateNewEphemeralMessage) {
                                    TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update;
                                    TLRPC.TL_message b10 = rf.s.b(tL_updateNewEphemeralMessage.message);
                                    sparseArray2.put(b10.f19815id, b10);
                                    arrayList8.add(tL_updateNewEphemeralMessage.message);
                                    arrayList7.remove(i19);
                                    i19--;
                                } else {
                                    if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update;
                                        long U1 = wp.U1(tL_updateNewChannelMessage);
                                        TLRPC.Chat L0 = rzVar2.getMessagesController().L0(Long.valueOf(U1));
                                        if ((L0 != null && !L0.megagroup) || (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) == null || (messageReplyHeader.reply_to_top_id == 0 && messageReplyHeader.reply_to_msg_id == 0)) {
                                            i16 = 1;
                                        } else {
                                            if (hVar5 == null) {
                                                hVar5 = new a0.h();
                                            }
                                            long B0 = kj.B0(tL_updateNewChannelMessage.message);
                                            SparseArray sparseArray3 = (SparseArray) hVar5.f(B0);
                                            if (sparseArray3 == null) {
                                                sparseArray3 = new SparseArray();
                                                hVar5.k(sparseArray3, B0);
                                            }
                                            TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                            int i20 = messageReplyHeader2.reply_to_top_id;
                                            if (i20 == 0) {
                                                i20 = messageReplyHeader2.reply_to_msg_id;
                                            }
                                            TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray3.get(i20);
                                            if (messageReplies == null) {
                                                messageReplies = new TLRPC.TL_messageReplies();
                                                sparseArray3.put(i20, messageReplies);
                                            }
                                            TLRPC.Peer peer = tL_updateNewChannelMessage.message.from_id;
                                            if (peer != null) {
                                                hVar3 = hVar5;
                                                messageReplies.recent_repliers.add(0, peer);
                                            } else {
                                                hVar3 = hVar5;
                                            }
                                            i16 = 1;
                                            messageReplies.replies++;
                                            hVar5 = hVar3;
                                        }
                                        TLRPC.Message message4 = tL_updateNewChannelMessage.message;
                                        sparseArray2.put(message4.f19815id, message4);
                                        Utilities.d.c(new uw(rzVar2, tL_updateNewChannelMessage, i16));
                                        arrayList7.remove(i19);
                                        int i21 = i19 - 1;
                                        if (tL_updateNewChannelMessage.message.pinned) {
                                            rz rzVar3 = rzVar2;
                                            i17 = i21;
                                            arrayList3 = arrayList7;
                                            hVar4 = hVar6;
                                            arrayList4 = arrayList8;
                                            z13 = z14;
                                            sparseArray = sparseArray2;
                                            rzVar2 = rzVar3;
                                            Utilities.d.c(new vw(rzVar3, tL_updateNewChannelMessage, U1, 1));
                                        } else {
                                            i17 = i21;
                                            z13 = z14;
                                            sparseArray = sparseArray2;
                                            hVar4 = hVar6;
                                            arrayList3 = arrayList7;
                                            arrayList4 = arrayList8;
                                        }
                                        hVar2 = hVar4;
                                        i19 = i17;
                                    } else {
                                        z13 = z14;
                                        sparseArray = sparseArray2;
                                        hVar2 = hVar6;
                                        arrayList3 = arrayList7;
                                        arrayList4 = arrayList8;
                                        if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                                            TLRPC.Message message5 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                                            sparseArray.put(message5.f19815id, message5);
                                            arrayList3.remove(i19);
                                            i19--;
                                            i15 = 1;
                                            z15 = true;
                                            i19 += i15;
                                            arrayList7 = arrayList3;
                                            hVar6 = hVar2;
                                            sparseArray2 = sparseArray;
                                            arrayList8 = arrayList4;
                                            z14 = z13;
                                            tL_error3 = tL_error2;
                                            i18 = i15;
                                        } else if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                                            ag.i3 f7 = ag.i3.f(rzVar2.currentAccount);
                                            if (arrayList5.isEmpty()) {
                                                i14 = 0;
                                                K1 = null;
                                            } else {
                                                i14 = 0;
                                                K1 = kj.K1(((kj) arrayList5.get(0)).f16690k);
                                            }
                                            if (arrayList5.isEmpty()) {
                                                valueOf = null;
                                            } else {
                                                valueOf = Integer.valueOf(kj.J1(((kj) arrayList5.get(i14)).f16690k));
                                            }
                                            f7.j(update, K1, valueOf.intValue());
                                            TLRPC.Message message6 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                                            sparseArray.put(message6.f19815id, message6);
                                            arrayList3.remove(i19);
                                            i19--;
                                            i15 = 1;
                                        }
                                    }
                                    i15 = 1;
                                    i19 += i15;
                                    arrayList7 = arrayList3;
                                    hVar6 = hVar2;
                                    sparseArray2 = sparseArray;
                                    arrayList8 = arrayList4;
                                    z14 = z13;
                                    tL_error3 = tL_error2;
                                    i18 = i15;
                                }
                            }
                            z15 = false;
                            i19 += i15;
                            arrayList7 = arrayList3;
                            hVar6 = hVar2;
                            sparseArray2 = sparseArray;
                            arrayList8 = arrayList4;
                            z14 = z13;
                            tL_error3 = tL_error2;
                            i18 = i15;
                        }
                        z13 = z14;
                        sparseArray = sparseArray2;
                        hVar2 = hVar6;
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList8;
                        i15 = 1;
                        i19 += i15;
                        arrayList7 = arrayList3;
                        hVar6 = hVar2;
                        sparseArray2 = sparseArray;
                        arrayList8 = arrayList4;
                        z14 = z13;
                        tL_error3 = tL_error2;
                        i18 = i15;
                    }
                    TLRPC.TL_error tL_error5 = tL_error3;
                    int i22 = i18;
                    boolean z16 = z14;
                    final SparseArray sparseArray4 = sparseArray2;
                    a0.h hVar7 = hVar6;
                    ArrayList arrayList9 = arrayList8;
                    int i23 = 2;
                    if (!arrayList9.isEmpty()) {
                        rzVar2.getMessagesStorage().f1(arrayList9, i22);
                    }
                    char c11 = 3;
                    if (hVar5 != null) {
                        rzVar2.getMessagesStorage().a1(null, null, hVar5, i22);
                        at notificationCenter = rzVar2.getNotificationCenter();
                        Object[] objArr = new Object[4];
                        i11 = 0;
                        objArr[0] = null;
                        objArr[i22] = null;
                        objArr[2] = hVar5;
                        objArr[3] = Boolean.TRUE;
                        notificationCenter.k(77, objArr);
                    } else {
                        i11 = 0;
                    }
                    int[] iArr3 = new int[i22];
                    iArr3[i11] = i11;
                    int[] iArr4 = {i11};
                    final ArrayList arrayList10 = new ArrayList();
                    int i24 = 0;
                    while (i24 < arrayList5.size()) {
                        kj kjVar2 = (kj) arrayList5.get(i24);
                        String str2 = (String) arrayList6.get(i24);
                        TLRPC.Message message7 = kjVar2.f16690k;
                        char c12 = c11;
                        int i25 = message7.f19815id;
                        i10 = i23;
                        final ArrayList arrayList11 = new ArrayList();
                        int i26 = i24;
                        Integer num = (Integer) hVar7.f(message7.random_id);
                        if (num != null && (message = (TLRPC.Message) sparseArray4.get(num.intValue())) != null) {
                            kj.B0(message);
                            arrayList11.add(message);
                            if ((message.flags & 33554432) != 0) {
                                TLRPC.Message message8 = kjVar2.f16690k;
                                i12 = i25;
                                message8.ttl_period = message.ttl_period;
                                message8.flags |= 33554432;
                            } else {
                                i12 = i25;
                            }
                            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                                kjVar = kjVar2;
                                ArrayList arrayList12 = arrayList6;
                                i13 = i26;
                                c10 = 4;
                                hVar = hVar7;
                                arrayList2 = arrayList10;
                                message2 = message7;
                                rzVar2.z0((kj) arrayList5.get(0), message, message.f19815id, arrayList12, false, -1, message.params);
                                arrayList = arrayList12;
                            } else {
                                hVar = hVar7;
                                arrayList = arrayList6;
                                kjVar = kjVar2;
                                message2 = message7;
                                i13 = i26;
                                arrayList2 = arrayList10;
                                c10 = 4;
                                rzVar2.z0(kjVar, message, message.f19815id, Collections.singletonList(str2), false, -1, message.params);
                            }
                            final int p12 = kjVar.p1();
                            message2.f19815id = message.f19815id;
                            int i27 = message.quick_reply_shortcut_id;
                            message2.quick_reply_shortcut_id = i27;
                            if (i27 != 0) {
                                message2.flags |= 1073741824;
                            }
                            final long j10 = message.grouped_id;
                            if (!z16) {
                                iArr = iArr3;
                                iArr2 = iArr4;
                                Integer num2 = (Integer) rzVar2.getMessagesController().P.get(Long.valueOf(message.dialog_id));
                                if (num2 == null) {
                                    rzVar = rzVar2;
                                    num2 = Integer.valueOf(rzVar2.getMessagesStorage().U(message.dialog_id, message.out));
                                    rzVar.getMessagesController().P.put(Long.valueOf(message.dialog_id), num2);
                                } else {
                                    rzVar = rzVar2;
                                }
                                if (num2.intValue() < message.f19815id) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                message.unread = z12;
                            } else {
                                iArr = iArr3;
                                iArr2 = iArr4;
                                rzVar = rzVar2;
                            }
                            iArr[0] = iArr[0] + 1;
                            arrayList2.add(Integer.valueOf(i12));
                            rzVar.getStatsController().k(w0.f(), 1, 1);
                            message2.send_state = 0;
                            message2.errorAllowedPriceStars = 0L;
                            message2.errorNewPriceStars = 0L;
                            at notificationCenter2 = rzVar.getNotificationCenter();
                            Integer valueOf2 = Integer.valueOf(i12);
                            Integer valueOf3 = Integer.valueOf(message2.f19815id);
                            Long valueOf4 = Long.valueOf(message2.dialog_id);
                            Long valueOf5 = Long.valueOf(j10);
                            Integer valueOf6 = Integer.valueOf(p12);
                            Boolean valueOf7 = Boolean.valueOf(z15);
                            ArrayList arrayList13 = arrayList2;
                            Object[] objArr2 = new Object[7];
                            objArr2[0] = valueOf2;
                            objArr2[1] = valueOf3;
                            objArr2[i10] = message2;
                            objArr2[c12] = valueOf4;
                            objArr2[c10] = valueOf5;
                            objArr2[5] = valueOf6;
                            objArr2[6] = valueOf7;
                            notificationCenter2.k(21, objArr2);
                            at notificationCenter3 = rzVar.getNotificationCenter();
                            Integer valueOf8 = Integer.valueOf(i12);
                            Integer valueOf9 = Integer.valueOf(message2.f19815id);
                            Long valueOf10 = Long.valueOf(message2.dialog_id);
                            Long valueOf11 = Long.valueOf(j10);
                            Integer valueOf12 = Integer.valueOf(p12);
                            Boolean valueOf13 = Boolean.valueOf(z15);
                            Object[] objArr3 = new Object[7];
                            objArr3[0] = valueOf8;
                            objArr3[1] = valueOf9;
                            objArr3[i10] = message2;
                            objArr3[c12] = valueOf10;
                            objArr3[c10] = valueOf11;
                            objArr3[5] = valueOf12;
                            objArr3[6] = valueOf13;
                            notificationCenter3.k(22, objArr3);
                            final int i28 = i12;
                            final TLRPC.Message message9 = message2;
                            final rz rzVar4 = rzVar;
                            final boolean z17 = z15;
                            final boolean z18 = z16;
                            arrayList10 = arrayList13;
                            rzVar2 = rzVar4;
                            rzVar.getMessagesStorage().f16331a.c(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.vy.run():void");
                                }
                            });
                            int i29 = i13 + 1;
                            z16 = z18;
                            z15 = z17;
                            iArr4 = iArr2;
                            iArr3 = iArr;
                            i23 = i10;
                            hVar7 = hVar;
                            arrayList6 = arrayList;
                            i24 = i29;
                            c11 = c12;
                        } else {
                            z11 = z16;
                            z10 = true;
                            Utilities.d.c(new ww(rzVar2, updates, 1));
                            tL_error = tL_error5;
                            r12 = z11;
                        }
                    }
                    i10 = i23;
                    z11 = z16;
                    z10 = false;
                    Utilities.d.c(new ww(rzVar2, updates, 1));
                    tL_error = tL_error5;
                    r12 = z11;
                } else {
                    r12 = z14;
                    i10 = 2;
                    tL_error = tL_error3;
                    org.telegram.ui.Components.s4.e0(rzVar2.currentAccount, tL_error, null, tLObject2, new Object[0]);
                    z10 = true;
                }
                if (z10) {
                    int i30 = 0;
                    while (i30 < arrayList5.size()) {
                        kj kjVar3 = (kj) arrayList5.get(i30);
                        TLRPC.Message message10 = kjVar3.f16690k;
                        rzVar2.getMessagesStorage().N0(r12, message10);
                        int i31 = i10;
                        message10.send_state = i31;
                        if (r12 == 0 && tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                            rh.e6.y(rzVar2.currentAccount, false);
                            message10.errorAllowedPriceStars = rh.e6.o(tLObject2);
                            message10.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                            rh.e6.y(rzVar2.currentAccount, false).d0(Arrays.asList(kjVar3));
                            rzVar2.getMessagesStorage().X1(kj.B0(message10), message10);
                        }
                        rzVar2.getNotificationCenter().k(23, Integer.valueOf(message10.f19815id));
                        rzVar2.d0(message10.f19815id);
                        rzVar2.i0(message10.f19815id, r12);
                        i30++;
                        i10 = i31;
                    }
                    return;
                }
                return;
            default:
                rz rzVar5 = this.f16136b;
                TLRPC.TL_error tL_error6 = this.f16137c;
                TLRPC.Message message11 = (TLRPC.Message) this.h;
                TLObject tLObject3 = this.d;
                kj kjVar4 = (kj) this.f16139n;
                boolean z19 = this.e;
                TLObject tLObject4 = this.f16138f;
                if (tL_error6 == null) {
                    String str3 = message11.attachPath;
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject3;
                    ArrayList<TLRPC.Update> arrayList14 = updates2.updates;
                    message11.send_state = 0;
                    ArrayList arrayList15 = new ArrayList();
                    arrayList15.add(message11);
                    rzVar5.getMessagesStorage().j1(arrayList15, false, true, false, 0, false, 0, 0L);
                    y00 y00Var = rzVar5.getMessagesController().f19234r7;
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) y00Var.e.f(y00.p(message11.f19815id, -message11.dialog_id));
                    if (tL_forumTopic != null) {
                        tL_forumTopic.topMessage = message11;
                        y00Var.y(-message11.dialog_id, true);
                    }
                    Utilities.d.c(new wy(rzVar5, updates2, message11, z19, 1));
                    return;
                }
                org.telegram.ui.Components.s4.e0(rzVar5.currentAccount, tL_error6, null, tLObject4, new Object[0]);
                rzVar5.i0(message11.f19815id, z19);
                rzVar5.l0(kjVar4);
                return;
        }
    }

    public hy(rz rzVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, kj kjVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.f16136b = rzVar;
        this.f16137c = tL_error;
        this.h = message;
        this.d = tLObject;
        this.f16139n = kjVar;
        this.e = z10;
        this.f16138f = tLObject2;
    }
}
