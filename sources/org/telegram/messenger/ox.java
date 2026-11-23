package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class ox implements Runnable {
    public final int f26199a = 0;
    public final az f26200b;
    public final TLRPC.TL_error f26201c;
    public final TLObject d;
    public final boolean f26202e;
    public final TLObject f26203f;
    public final Object h;
    public final Object f26204n;

    public ox(az azVar, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.f26200b = azVar;
        this.f26201c = tL_error;
        this.d = tLObject;
        this.f26202e = z10;
        this.h = arrayList;
        this.f26204n = arrayList2;
        this.f26203f = tLObject2;
    }

    @Override
    public final void run() {
        ?? r12;
        int i7;
        TLRPC.TL_error tL_error;
        boolean z10;
        String str;
        int i10;
        int i11;
        boolean z11;
        TLRPC.Message message;
        char c10;
        TLRPC.Message message2;
        gj gjVar;
        ArrayList arrayList;
        int i12;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TLRPC.Message message3;
        int i13;
        a0.h hVar;
        final int[] iArr;
        int i14;
        SparseArray sparseArray;
        boolean z12;
        TLRPC.TL_error tL_error2;
        boolean z13;
        SparseArray sparseArray2;
        a0.h hVar2;
        ArrayList<TLRPC.Update> arrayList4;
        ArrayList arrayList5;
        int i15;
        String J1;
        Integer valueOf;
        TLRPC.MessageReplyHeader messageReplyHeader;
        a0.h hVar3;
        int i16;
        a0.h hVar4;
        a0.h hVar5 = null;
        switch (this.f26199a) {
            case 0:
                az azVar = this.f26200b;
                TLRPC.TL_error tL_error3 = this.f26201c;
                TLObject tLObject = this.d;
                boolean z14 = this.f26202e;
                ArrayList arrayList6 = (ArrayList) this.h;
                ArrayList arrayList7 = (ArrayList) this.f26204n;
                TLObject tLObject2 = this.f26203f;
                if (tL_error3 == null) {
                    SparseArray sparseArray3 = new SparseArray();
                    a0.h hVar6 = new a0.h();
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                    ArrayList arrayList9 = new ArrayList();
                    int i17 = 0;
                    boolean z15 = z14;
                    while (i17 < arrayList8.size()) {
                        TLRPC.Update update = arrayList8.get(i17);
                        if (update instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update;
                            hVar6.k(Integer.valueOf(tL_updateMessageID.f28692id), tL_updateMessageID.random_id);
                            arrayList8.remove(i17);
                            i17--;
                            tL_error2 = tL_error3;
                        } else {
                            TLRPC.TL_error tL_error4 = tL_error3;
                            if (update instanceof TL_update.TL_updateNewMessage) {
                                TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update;
                                TLRPC.Message message4 = tL_updateNewMessage.message;
                                sparseArray3.put(message4.f28455id, message4);
                                tL_error2 = tL_error4;
                                Utilities.d.c(new cy(azVar, tL_updateNewMessage, 0));
                                arrayList8.remove(i17);
                                i17--;
                                z13 = z14;
                                sparseArray2 = sparseArray3;
                                hVar2 = hVar6;
                                arrayList4 = arrayList8;
                                arrayList5 = arrayList9;
                            } else {
                                tL_error2 = tL_error4;
                                if (update instanceof TL_update.TL_updateNewEphemeralMessage) {
                                    TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update;
                                    TLRPC.TL_message b10 = bg.x.b(tL_updateNewEphemeralMessage.message);
                                    sparseArray3.put(b10.f28455id, b10);
                                    arrayList9.add(tL_updateNewEphemeralMessage.message);
                                    arrayList8.remove(i17);
                                    i17--;
                                } else {
                                    if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                        TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update;
                                        long X1 = np.X1(tL_updateNewChannelMessage);
                                        TLRPC.Chat O0 = azVar.getMessagesController().O0(Long.valueOf(X1));
                                        if ((O0 == null || O0.megagroup) && (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) != null && (messageReplyHeader.reply_to_top_id != 0 || messageReplyHeader.reply_to_msg_id != 0)) {
                                            if (hVar5 == null) {
                                                hVar5 = new a0.h();
                                            }
                                            long B0 = gj.B0(tL_updateNewChannelMessage.message);
                                            SparseArray sparseArray4 = (SparseArray) hVar5.f(B0);
                                            if (sparseArray4 == null) {
                                                sparseArray4 = new SparseArray();
                                                hVar5.k(sparseArray4, B0);
                                            }
                                            TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                            int i18 = messageReplyHeader2.reply_to_top_id;
                                            if (i18 == 0) {
                                                i18 = messageReplyHeader2.reply_to_msg_id;
                                            }
                                            TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray4.get(i18);
                                            if (messageReplies == null) {
                                                messageReplies = new TLRPC.TL_messageReplies();
                                                sparseArray4.put(i18, messageReplies);
                                            }
                                            TLRPC.Peer peer = tL_updateNewChannelMessage.message.from_id;
                                            if (peer != null) {
                                                hVar3 = hVar5;
                                                messageReplies.recent_repliers.add(0, peer);
                                            } else {
                                                hVar3 = hVar5;
                                            }
                                            messageReplies.replies++;
                                            hVar5 = hVar3;
                                        }
                                        TLRPC.Message message5 = tL_updateNewChannelMessage.message;
                                        sparseArray3.put(message5.f28455id, message5);
                                        Utilities.d.c(new dy(azVar, tL_updateNewChannelMessage, 0));
                                        arrayList8.remove(i17);
                                        int i19 = i17 - 1;
                                        if (tL_updateNewChannelMessage.message.pinned) {
                                            az azVar2 = azVar;
                                            i16 = i19;
                                            arrayList4 = arrayList8;
                                            hVar4 = hVar6;
                                            arrayList5 = arrayList9;
                                            z13 = z14;
                                            sparseArray2 = sparseArray3;
                                            azVar = azVar2;
                                            Utilities.d.c(new dw(azVar2, tL_updateNewChannelMessage, X1, 1));
                                        } else {
                                            i16 = i19;
                                            z13 = z14;
                                            sparseArray2 = sparseArray3;
                                            hVar4 = hVar6;
                                            arrayList4 = arrayList8;
                                            arrayList5 = arrayList9;
                                        }
                                        hVar2 = hVar4;
                                        i17 = i16;
                                    } else {
                                        z13 = z14;
                                        sparseArray2 = sparseArray3;
                                        hVar2 = hVar6;
                                        arrayList4 = arrayList8;
                                        arrayList5 = arrayList9;
                                        if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                                            TLRPC.Message message6 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                                            sparseArray2.put(message6.f28455id, message6);
                                            arrayList4.remove(i17);
                                            i17--;
                                            z15 = true;
                                        } else if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                                            kg.v1 f10 = kg.v1.f(azVar.currentAccount);
                                            if (arrayList6.isEmpty()) {
                                                i15 = 0;
                                                J1 = null;
                                            } else {
                                                i15 = 0;
                                                J1 = gj.J1(((gj) arrayList6.get(0)).f24213k);
                                            }
                                            if (arrayList6.isEmpty()) {
                                                valueOf = null;
                                            } else {
                                                valueOf = Integer.valueOf(gj.I1(((gj) arrayList6.get(i15)).f24213k));
                                            }
                                            f10.j(update, J1, valueOf.intValue());
                                            TLRPC.Message message7 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                                            sparseArray2.put(message7.f28455id, message7);
                                            arrayList4.remove(i17);
                                            i17--;
                                        }
                                    }
                                    i17++;
                                    arrayList8 = arrayList4;
                                    hVar6 = hVar2;
                                    sparseArray3 = sparseArray2;
                                    arrayList9 = arrayList5;
                                    z14 = z13;
                                    tL_error3 = tL_error2;
                                }
                            }
                            z15 = false;
                            i17++;
                            arrayList8 = arrayList4;
                            hVar6 = hVar2;
                            sparseArray3 = sparseArray2;
                            arrayList9 = arrayList5;
                            z14 = z13;
                            tL_error3 = tL_error2;
                        }
                        z13 = z14;
                        sparseArray2 = sparseArray3;
                        hVar2 = hVar6;
                        arrayList4 = arrayList8;
                        arrayList5 = arrayList9;
                        i17++;
                        arrayList8 = arrayList4;
                        hVar6 = hVar2;
                        sparseArray3 = sparseArray2;
                        arrayList9 = arrayList5;
                        z14 = z13;
                        tL_error3 = tL_error2;
                    }
                    TLRPC.TL_error tL_error5 = tL_error3;
                    boolean z16 = z14;
                    final SparseArray sparseArray5 = sparseArray3;
                    a0.h hVar7 = hVar6;
                    ArrayList arrayList10 = arrayList9;
                    int i20 = 2;
                    if (!arrayList10.isEmpty()) {
                        i10 = 1;
                        azVar.getMessagesStorage().f1(arrayList10, true);
                    } else {
                        i10 = 1;
                    }
                    char c11 = 3;
                    char c12 = 4;
                    if (hVar5 != null) {
                        azVar.getMessagesStorage().a1(null, null, hVar5, i10);
                        ls notificationCenter = azVar.getNotificationCenter();
                        Object[] objArr = new Object[4];
                        i11 = 0;
                        objArr[0] = null;
                        objArr[i10] = null;
                        objArr[2] = hVar5;
                        objArr[3] = Boolean.TRUE;
                        notificationCenter.k(77, objArr);
                    } else {
                        i11 = 0;
                    }
                    int[] iArr2 = new int[i10];
                    iArr2[i11] = i11;
                    int[] iArr3 = {i11};
                    final ArrayList arrayList11 = new ArrayList();
                    int i21 = 0;
                    while (i21 < arrayList6.size()) {
                        gj gjVar2 = (gj) arrayList6.get(i21);
                        String str2 = (String) arrayList7.get(i21);
                        TLRPC.Message message8 = gjVar2.f24213k;
                        int i22 = message8.f28455id;
                        char c13 = c11;
                        ArrayList arrayList12 = new ArrayList();
                        i7 = i20;
                        ArrayList arrayList13 = arrayList6;
                        Integer num = (Integer) hVar7.f(message8.random_id);
                        if (num != null && (message = (TLRPC.Message) sparseArray5.get(num.intValue())) != null) {
                            gj.B0(message);
                            arrayList12.add(message);
                            if ((message.flags & 33554432) != 0) {
                                TLRPC.Message message9 = gjVar2.f24213k;
                                c10 = c12;
                                message9.ttl_period = message.ttl_period;
                                message9.flags |= 33554432;
                            } else {
                                c10 = c12;
                            }
                            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                                arrayList6 = arrayList13;
                                gj gjVar3 = (gj) arrayList6.get(0);
                                i12 = i21;
                                int i23 = message.f28455id;
                                arrayList = arrayList12;
                                HashMap<String, String> hashMap = message.params;
                                arrayList2 = arrayList11;
                                i13 = i22;
                                message2 = message;
                                gjVar = gjVar2;
                                ArrayList arrayList14 = arrayList7;
                                message3 = message8;
                                azVar.z0(gjVar3, message2, i23, arrayList14, false, -1, hashMap);
                                arrayList3 = arrayList14;
                            } else {
                                message2 = message;
                                gjVar = gjVar2;
                                arrayList = arrayList12;
                                i12 = i21;
                                arrayList2 = arrayList11;
                                arrayList6 = arrayList13;
                                arrayList3 = arrayList7;
                                message3 = message8;
                                i13 = i22;
                                azVar.z0(gjVar, message2, message2.f28455id, Collections.singletonList(str2), false, -1, message2.params);
                            }
                            final int o12 = gjVar.o1();
                            message3.f28455id = message2.f28455id;
                            int i24 = message2.quick_reply_shortcut_id;
                            message3.quick_reply_shortcut_id = i24;
                            if (i24 != 0) {
                                message3.flags |= 1073741824;
                            }
                            final long j3 = message2.grouped_id;
                            if (!z16) {
                                hVar = hVar7;
                                iArr = iArr2;
                                Integer num2 = (Integer) azVar.getMessagesController().Q.get(Long.valueOf(message2.dialog_id));
                                if (num2 == null) {
                                    i14 = i12;
                                    sparseArray = sparseArray5;
                                    num2 = Integer.valueOf(azVar.getMessagesStorage().U(message2.dialog_id, message2.out));
                                    azVar.getMessagesController().Q.put(Long.valueOf(message2.dialog_id), num2);
                                } else {
                                    i14 = i12;
                                    sparseArray = sparseArray5;
                                }
                                if (num2.intValue() < message2.f28455id) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                message2.unread = z12;
                            } else {
                                hVar = hVar7;
                                iArr = iArr2;
                                i14 = i12;
                                sparseArray = sparseArray5;
                            }
                            iArr[0] = iArr[0] + 1;
                            arrayList2.add(Integer.valueOf(i13));
                            azVar.getStatsController().k(t0.f(), 1, 1);
                            message3.send_state = 0;
                            message3.errorAllowedPriceStars = 0L;
                            message3.errorNewPriceStars = 0L;
                            ls notificationCenter2 = azVar.getNotificationCenter();
                            Integer valueOf2 = Integer.valueOf(i13);
                            Integer valueOf3 = Integer.valueOf(message3.f28455id);
                            Long valueOf4 = Long.valueOf(message3.dialog_id);
                            Long valueOf5 = Long.valueOf(j3);
                            Integer valueOf6 = Integer.valueOf(o12);
                            Boolean valueOf7 = Boolean.valueOf(z15);
                            ArrayList arrayList15 = arrayList2;
                            Object[] objArr2 = new Object[7];
                            objArr2[0] = valueOf2;
                            objArr2[1] = valueOf3;
                            objArr2[i7] = message3;
                            objArr2[c13] = valueOf4;
                            objArr2[c10] = valueOf5;
                            objArr2[5] = valueOf6;
                            objArr2[6] = valueOf7;
                            notificationCenter2.k(21, objArr2);
                            ls notificationCenter3 = azVar.getNotificationCenter();
                            Integer valueOf8 = Integer.valueOf(i13);
                            Integer valueOf9 = Integer.valueOf(message3.f28455id);
                            Long valueOf10 = Long.valueOf(message3.dialog_id);
                            Long valueOf11 = Long.valueOf(j3);
                            Integer valueOf12 = Integer.valueOf(o12);
                            Boolean valueOf13 = Boolean.valueOf(z15);
                            Object[] objArr3 = new Object[7];
                            objArr3[0] = valueOf8;
                            objArr3[1] = valueOf9;
                            objArr3[i7] = message3;
                            objArr3[c13] = valueOf10;
                            objArr3[c10] = valueOf11;
                            objArr3[5] = valueOf12;
                            objArr3[6] = valueOf13;
                            notificationCenter3.k(22, objArr3);
                            sparseArray5 = sparseArray;
                            final az azVar3 = azVar;
                            final boolean z17 = z15;
                            final int[] iArr4 = iArr3;
                            final boolean z18 = z16;
                            final ArrayList arrayList16 = arrayList;
                            final gj gjVar4 = gjVar;
                            final TLRPC.Message message10 = message3;
                            final int i25 = i13;
                            arrayList11 = arrayList15;
                            azVar = azVar3;
                            azVar.getMessagesStorage().f27250a.c(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ey.run():void");
                                }
                            });
                            i21 = i14 + 1;
                            z16 = z18;
                            z15 = z17;
                            iArr3 = iArr4;
                            iArr2 = iArr;
                            c11 = c13;
                            arrayList7 = arrayList3;
                            i20 = i7;
                            c12 = c10;
                            hVar7 = hVar;
                        } else {
                            z11 = z16;
                            arrayList6 = arrayList13;
                            z10 = true;
                            Utilities.d.c(new ew(azVar, updates, 1));
                            tL_error = tL_error5;
                            r12 = z11;
                        }
                    }
                    i7 = i20;
                    z11 = z16;
                    z10 = false;
                    Utilities.d.c(new ew(azVar, updates, 1));
                    tL_error = tL_error5;
                    r12 = z11;
                } else {
                    r12 = z14;
                    i7 = 2;
                    tL_error = tL_error3;
                    org.telegram.ui.Components.c5.c0(azVar.currentAccount, tL_error, null, tLObject2, new Object[0]);
                    z10 = true;
                }
                if (z10) {
                    int i26 = 0;
                    while (i26 < arrayList6.size()) {
                        gj gjVar5 = (gj) arrayList6.get(i26);
                        TLRPC.Message message11 = gjVar5.f24213k;
                        azVar.getMessagesStorage().N0(r12, message11);
                        int i27 = i7;
                        message11.send_state = i27;
                        if (r12 == 0 && tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                            di.y8.y(azVar.currentAccount, false);
                            message11.errorAllowedPriceStars = di.y8.o(tLObject2);
                            message11.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                            di.y8.y(azVar.currentAccount, false).d0(Arrays.asList(gjVar5));
                            azVar.getMessagesStorage().X1(gj.B0(message11), message11);
                        }
                        azVar.getNotificationCenter().k(23, Integer.valueOf(message11.f28455id));
                        azVar.d0(message11.f28455id);
                        azVar.i0(message11.f28455id, r12);
                        i26++;
                        i7 = i27;
                    }
                    return;
                }
                return;
            default:
                az azVar4 = this.f26200b;
                TLRPC.TL_error tL_error6 = this.f26201c;
                TLRPC.Message message12 = (TLRPC.Message) this.h;
                TLObject tLObject3 = this.d;
                gj gjVar6 = (gj) this.f26204n;
                boolean z19 = this.f26202e;
                TLObject tLObject4 = this.f26203f;
                if (tL_error6 == null) {
                    String str3 = message12.attachPath;
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject3;
                    ArrayList<TLRPC.Update> arrayList17 = updates2.updates;
                    message12.send_state = 0;
                    ArrayList arrayList18 = new ArrayList();
                    arrayList18.add(message12);
                    azVar4.getMessagesStorage().j1(arrayList18, false, true, false, 0, false, 0, 0L);
                    f00 f00Var = azVar4.getMessagesController().f25968t7;
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) f00Var.f23810e.f(f00.p(message12.f28455id, -message12.dialog_id));
                    if (tL_forumTopic != null) {
                        tL_forumTopic.topMessage = message12;
                        f00Var.y(-message12.dialog_id, true);
                    }
                    Utilities.d.c(new fy(azVar4, updates2, message12, z19, 1));
                    return;
                }
                org.telegram.ui.Components.c5.c0(azVar4.currentAccount, tL_error6, null, tLObject4, new Object[0]);
                azVar4.i0(message12.f28455id, z19);
                azVar4.l0(gjVar6);
                return;
        }
    }

    public ox(az azVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, gj gjVar, String str, HashMap hashMap, boolean z10, TLObject tLObject2) {
        this.f26200b = azVar;
        this.f26201c = tL_error;
        this.h = message;
        this.d = tLObject;
        this.f26204n = gjVar;
        this.f26202e = z10;
        this.f26203f = tLObject2;
    }
}
