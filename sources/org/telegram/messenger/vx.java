package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class vx implements Runnable {
    public final int f26227a = 0;
    public final gz f26228b;
    public final TLRPC.TL_error f26229c;
    public final TLObject d;
    public final boolean f26230e;
    public final TLObject f26231f;
    public final Object h;
    public final Object f26232n;

    public vx(gz gzVar, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.f26228b = gzVar;
        this.f26229c = tL_error;
        this.d = tLObject;
        this.f26230e = z9;
        this.h = arrayList;
        this.f26232n = arrayList2;
        this.f26231f = tLObject2;
    }

    @Override
    public final void run() {
        ?? r12;
        int i7;
        TLRPC.TL_error tL_error;
        boolean z9;
        String str;
        int i10;
        boolean z10;
        TLRPC.Message message;
        int i11;
        a0.h hVar;
        ArrayList arrayList;
        final ij ijVar;
        TLRPC.Message message2;
        int i12;
        ArrayList arrayList2;
        char c10;
        final int[] iArr;
        final int[] iArr2;
        gz gzVar;
        boolean z11;
        TLRPC.TL_error tL_error2;
        boolean z12;
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
        switch (this.f26227a) {
            case 0:
                gz gzVar2 = this.f26228b;
                TLRPC.TL_error tL_error3 = this.f26229c;
                TLObject tLObject = this.d;
                boolean z13 = this.f26230e;
                ArrayList arrayList5 = (ArrayList) this.h;
                ArrayList arrayList6 = (ArrayList) this.f26232n;
                TLObject tLObject2 = this.f26231f;
                if (tL_error3 == null) {
                    SparseArray sparseArray2 = new SparseArray();
                    a0.h hVar6 = new a0.h();
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList<TLRPC.Update> arrayList7 = updates.updates;
                    ArrayList arrayList8 = new ArrayList();
                    int i18 = 0;
                    boolean z14 = z13;
                    while (i18 < arrayList7.size()) {
                        TLRPC.Update update = arrayList7.get(i18);
                        if (update instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update;
                            hVar6.k(Integer.valueOf(tL_updateMessageID.f27211id), tL_updateMessageID.random_id);
                            arrayList7.remove(i18);
                            i18--;
                            tL_error2 = tL_error3;
                        } else {
                            TLRPC.TL_error tL_error4 = tL_error3;
                            if (update instanceof TL_update.TL_updateNewMessage) {
                                TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update;
                                TLRPC.Message message3 = tL_updateNewMessage.message;
                                sparseArray2.put(message3.f26974id, message3);
                                tL_error2 = tL_error4;
                                Utilities.d.c(new hy(gzVar2, tL_updateNewMessage, 1));
                                arrayList7.remove(i18);
                                i18--;
                                z12 = z13;
                                sparseArray = sparseArray2;
                                hVar2 = hVar6;
                                arrayList3 = arrayList7;
                                arrayList4 = arrayList8;
                                i14 = 1;
                            } else {
                                tL_error2 = tL_error4;
                                if (update instanceof TL_update.TL_updateNewEphemeralMessage) {
                                    TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update;
                                    TLRPC.TL_message b10 = bg.w.b(tL_updateNewEphemeralMessage.message);
                                    sparseArray2.put(b10.f26974id, b10);
                                    arrayList8.add(tL_updateNewEphemeralMessage.message);
                                    arrayList7.remove(i18);
                                    i18--;
                                } else {
                                    if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update;
                                        long V1 = qp.V1(tL_updateNewChannelMessage);
                                        TLRPC.Chat M0 = gzVar2.getMessagesController().M0(Long.valueOf(V1));
                                        if ((M0 != null && !M0.megagroup) || (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) == null || (messageReplyHeader.reply_to_top_id == 0 && messageReplyHeader.reply_to_msg_id == 0)) {
                                            i15 = 1;
                                        } else {
                                            if (hVar5 == null) {
                                                hVar5 = new a0.h();
                                            }
                                            long B0 = ij.B0(tL_updateNewChannelMessage.message);
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
                                        sparseArray2.put(message4.f26974id, message4);
                                        Utilities.d.c(new iw(gzVar2, tL_updateNewChannelMessage, i15));
                                        arrayList7.remove(i18);
                                        int i20 = i18 - 1;
                                        if (tL_updateNewChannelMessage.message.pinned) {
                                            gz gzVar3 = gzVar2;
                                            i16 = i20;
                                            arrayList3 = arrayList7;
                                            hVar4 = hVar6;
                                            arrayList4 = arrayList8;
                                            z12 = z13;
                                            sparseArray = sparseArray2;
                                            gzVar2 = gzVar3;
                                            Utilities.d.c(new jw(gzVar3, tL_updateNewChannelMessage, V1, 1));
                                        } else {
                                            i16 = i20;
                                            z12 = z13;
                                            sparseArray = sparseArray2;
                                            hVar4 = hVar6;
                                            arrayList3 = arrayList7;
                                            arrayList4 = arrayList8;
                                        }
                                        hVar2 = hVar4;
                                        i18 = i16;
                                    } else {
                                        z12 = z13;
                                        sparseArray = sparseArray2;
                                        hVar2 = hVar6;
                                        arrayList3 = arrayList7;
                                        arrayList4 = arrayList8;
                                        if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                                            TLRPC.Message message5 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                                            sparseArray.put(message5.f26974id, message5);
                                            arrayList3.remove(i18);
                                            i18--;
                                            i14 = 1;
                                            z14 = true;
                                            i18 += i14;
                                            arrayList7 = arrayList3;
                                            hVar6 = hVar2;
                                            sparseArray2 = sparseArray;
                                            arrayList8 = arrayList4;
                                            z13 = z12;
                                            tL_error3 = tL_error2;
                                            i17 = i14;
                                        } else if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                                            kg.t1 f10 = kg.t1.f(gzVar2.currentAccount);
                                            if (arrayList5.isEmpty()) {
                                                i13 = 0;
                                                K1 = null;
                                            } else {
                                                i13 = 0;
                                                K1 = ij.K1(((ij) arrayList5.get(0)).f23244k);
                                            }
                                            if (arrayList5.isEmpty()) {
                                                valueOf = null;
                                            } else {
                                                valueOf = Integer.valueOf(ij.J1(((ij) arrayList5.get(i13)).f23244k));
                                            }
                                            f10.j(update, K1, valueOf.intValue());
                                            TLRPC.Message message6 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                                            sparseArray.put(message6.f26974id, message6);
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
                                    z13 = z12;
                                    tL_error3 = tL_error2;
                                    i17 = i14;
                                }
                            }
                            z14 = false;
                            i18 += i14;
                            arrayList7 = arrayList3;
                            hVar6 = hVar2;
                            sparseArray2 = sparseArray;
                            arrayList8 = arrayList4;
                            z13 = z12;
                            tL_error3 = tL_error2;
                            i17 = i14;
                        }
                        z12 = z13;
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
                        z13 = z12;
                        tL_error3 = tL_error2;
                        i17 = i14;
                    }
                    TLRPC.TL_error tL_error5 = tL_error3;
                    int i21 = i17;
                    boolean z15 = z13;
                    final SparseArray sparseArray4 = sparseArray2;
                    a0.h hVar7 = hVar6;
                    ArrayList arrayList9 = arrayList8;
                    int i22 = 2;
                    if (!arrayList9.isEmpty()) {
                        gzVar2.getMessagesStorage().f1(arrayList9, i21);
                    }
                    char c11 = 3;
                    if (hVar5 != null) {
                        gzVar2.getMessagesStorage().a1(null, null, hVar5, i21);
                        qs notificationCenter = gzVar2.getNotificationCenter();
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
                        ij ijVar2 = (ij) arrayList5.get(i23);
                        String str2 = (String) arrayList6.get(i23);
                        TLRPC.Message message7 = ijVar2.f23244k;
                        char c12 = c11;
                        int i24 = message7.f26974id;
                        i7 = i22;
                        final ArrayList arrayList11 = new ArrayList();
                        int i25 = i23;
                        Integer num = (Integer) hVar7.f(message7.random_id);
                        if (num != null && (message = (TLRPC.Message) sparseArray4.get(num.intValue())) != null) {
                            ij.B0(message);
                            arrayList11.add(message);
                            if ((message.flags & 33554432) != 0) {
                                TLRPC.Message message8 = ijVar2.f23244k;
                                i11 = i24;
                                message8.ttl_period = message.ttl_period;
                                message8.flags |= 33554432;
                            } else {
                                i11 = i24;
                            }
                            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                                ijVar = ijVar2;
                                ArrayList arrayList12 = arrayList6;
                                i12 = i25;
                                c10 = 4;
                                hVar = hVar7;
                                arrayList2 = arrayList10;
                                message2 = message7;
                                gzVar2.z0((ij) arrayList5.get(0), message, message.f26974id, arrayList12, false, -1, message.params);
                                arrayList = arrayList12;
                            } else {
                                hVar = hVar7;
                                arrayList = arrayList6;
                                ijVar = ijVar2;
                                message2 = message7;
                                i12 = i25;
                                arrayList2 = arrayList10;
                                c10 = 4;
                                gzVar2.z0(ijVar, message, message.f26974id, Collections.singletonList(str2), false, -1, message.params);
                            }
                            final int p12 = ijVar.p1();
                            message2.f26974id = message.f26974id;
                            int i26 = message.quick_reply_shortcut_id;
                            message2.quick_reply_shortcut_id = i26;
                            if (i26 != 0) {
                                message2.flags |= 1073741824;
                            }
                            final long j3 = message.grouped_id;
                            if (!z15) {
                                iArr = iArr3;
                                iArr2 = iArr4;
                                Integer num2 = (Integer) gzVar2.getMessagesController().P.get(Long.valueOf(message.dialog_id));
                                if (num2 == null) {
                                    gzVar = gzVar2;
                                    num2 = Integer.valueOf(gzVar2.getMessagesStorage().U(message.dialog_id, message.out));
                                    gzVar.getMessagesController().P.put(Long.valueOf(message.dialog_id), num2);
                                } else {
                                    gzVar = gzVar2;
                                }
                                if (num2.intValue() < message.f26974id) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                message.unread = z11;
                            } else {
                                iArr = iArr3;
                                iArr2 = iArr4;
                                gzVar = gzVar2;
                            }
                            iArr[0] = iArr[0] + 1;
                            arrayList2.add(Integer.valueOf(i11));
                            gzVar.getStatsController().k(t0.f(), 1, 1);
                            message2.send_state = 0;
                            message2.errorAllowedPriceStars = 0L;
                            message2.errorNewPriceStars = 0L;
                            qs notificationCenter2 = gzVar.getNotificationCenter();
                            Integer valueOf2 = Integer.valueOf(i11);
                            Integer valueOf3 = Integer.valueOf(message2.f26974id);
                            Long valueOf4 = Long.valueOf(message2.dialog_id);
                            Long valueOf5 = Long.valueOf(j3);
                            Integer valueOf6 = Integer.valueOf(p12);
                            Boolean valueOf7 = Boolean.valueOf(z14);
                            ArrayList arrayList13 = arrayList2;
                            Object[] objArr2 = new Object[7];
                            objArr2[0] = valueOf2;
                            objArr2[1] = valueOf3;
                            objArr2[i7] = message2;
                            objArr2[c12] = valueOf4;
                            objArr2[c10] = valueOf5;
                            objArr2[5] = valueOf6;
                            objArr2[6] = valueOf7;
                            notificationCenter2.k(21, objArr2);
                            qs notificationCenter3 = gzVar.getNotificationCenter();
                            Integer valueOf8 = Integer.valueOf(i11);
                            Integer valueOf9 = Integer.valueOf(message2.f26974id);
                            Long valueOf10 = Long.valueOf(message2.dialog_id);
                            Long valueOf11 = Long.valueOf(j3);
                            Integer valueOf12 = Integer.valueOf(p12);
                            Boolean valueOf13 = Boolean.valueOf(z14);
                            Object[] objArr3 = new Object[7];
                            objArr3[0] = valueOf8;
                            objArr3[1] = valueOf9;
                            objArr3[i7] = message2;
                            objArr3[c12] = valueOf10;
                            objArr3[c10] = valueOf11;
                            objArr3[5] = valueOf12;
                            objArr3[6] = valueOf13;
                            notificationCenter3.k(22, objArr3);
                            final int i27 = i11;
                            final TLRPC.Message message9 = message2;
                            final gz gzVar4 = gzVar;
                            final boolean z16 = z14;
                            final boolean z17 = z15;
                            arrayList10 = arrayList13;
                            gzVar2 = gzVar4;
                            gzVar.getMessagesStorage().f26696a.c(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ky.run():void");
                                }
                            });
                            int i28 = i12 + 1;
                            z15 = z17;
                            z14 = z16;
                            iArr4 = iArr2;
                            iArr3 = iArr;
                            i22 = i7;
                            hVar7 = hVar;
                            arrayList6 = arrayList;
                            i23 = i28;
                            c11 = c12;
                        } else {
                            z10 = z15;
                            z9 = true;
                            Utilities.d.c(new kw(gzVar2, updates, 1));
                            tL_error = tL_error5;
                            r12 = z10;
                        }
                    }
                    i7 = i22;
                    z10 = z15;
                    z9 = false;
                    Utilities.d.c(new kw(gzVar2, updates, 1));
                    tL_error = tL_error5;
                    r12 = z10;
                } else {
                    r12 = z13;
                    i7 = 2;
                    tL_error = tL_error3;
                    org.telegram.ui.Components.v4.c0(gzVar2.currentAccount, tL_error, null, tLObject2, new Object[0]);
                    z9 = true;
                }
                if (z9) {
                    int i29 = 0;
                    while (i29 < arrayList5.size()) {
                        ij ijVar3 = (ij) arrayList5.get(i29);
                        TLRPC.Message message10 = ijVar3.f23244k;
                        gzVar2.getMessagesStorage().N0(r12, message10);
                        int i30 = i7;
                        message10.send_state = i30;
                        if (r12 == 0 && tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                            bi.ea.y(gzVar2.currentAccount, false);
                            message10.errorAllowedPriceStars = bi.ea.o(tLObject2);
                            message10.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                            bi.ea.y(gzVar2.currentAccount, false).d0(Arrays.asList(ijVar3));
                            gzVar2.getMessagesStorage().X1(ij.B0(message10), message10);
                        }
                        gzVar2.getNotificationCenter().k(23, Integer.valueOf(message10.f26974id));
                        gzVar2.d0(message10.f26974id);
                        gzVar2.i0(message10.f26974id, r12);
                        i29++;
                        i7 = i30;
                    }
                    return;
                }
                return;
            default:
                gz gzVar5 = this.f26228b;
                TLRPC.TL_error tL_error6 = this.f26229c;
                TLRPC.Message message11 = (TLRPC.Message) this.h;
                TLObject tLObject3 = this.d;
                ij ijVar4 = (ij) this.f26232n;
                boolean z18 = this.f26230e;
                TLObject tLObject4 = this.f26231f;
                if (tL_error6 == null) {
                    String str3 = message11.attachPath;
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject3;
                    ArrayList<TLRPC.Update> arrayList14 = updates2.updates;
                    message11.send_state = 0;
                    ArrayList arrayList15 = new ArrayList();
                    arrayList15.add(message11);
                    gzVar5.getMessagesStorage().j1(arrayList15, false, true, false, 0, false, 0, 0L);
                    k00 k00Var = gzVar5.getMessagesController().f24870q7;
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) k00Var.f23640e.f(k00.p(message11.f26974id, -message11.dialog_id));
                    if (tL_forumTopic != null) {
                        tL_forumTopic.topMessage = message11;
                        k00Var.y(-message11.dialog_id, true);
                    }
                    Utilities.d.c(new ly(gzVar5, updates2, message11, z18, 1));
                    return;
                }
                org.telegram.ui.Components.v4.c0(gzVar5.currentAccount, tL_error6, null, tLObject4, new Object[0]);
                gzVar5.i0(message11.f26974id, z18);
                gzVar5.l0(ijVar4);
                return;
        }
    }

    public vx(gz gzVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, ij ijVar, String str, HashMap hashMap, boolean z9, TLObject tLObject2) {
        this.f26228b = gzVar;
        this.f26229c = tL_error;
        this.h = message;
        this.d = tLObject;
        this.f26232n = ijVar;
        this.f26230e = z9;
        this.f26231f = tLObject2;
    }
}
