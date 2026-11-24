package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.metrics.LogSessionId;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public final class rh implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public rh(hs6 hs6Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z) {
        this.a = (byte) 28;
        this.c = hs6Var;
        this.d = tLObject;
        this.e = str;
        this.b = z;
    }

    @Override
    public final void run() {
        int i;
        String M0;
        int i2;
        String M02;
        int i3;
        ArrayList arrayList;
        int f;
        int i4;
        int i5;
        ylb ylbVar;
        xd9 xd9Var;
        int i6;
        boolean z;
        boolean z2;
        SQLitePreparedStatement executeFast;
        int i7;
        SQLitePreparedStatement sQLitePreparedStatement;
        ArrayList arrayList2;
        SQLitePreparedStatement sQLitePreparedStatement2;
        int i8;
        SQLitePreparedStatement sQLitePreparedStatement3;
        boolean z3;
        int i9 = 2;
        View view = null;
        SQLitePreparedStatement sQLitePreparedStatement4 = null;
        String str = null;
        r11 = null;
        String str2 = null;
        int i10 = 1;
        int i11 = 0;
        switch (this.a) {
            case 0:
                boolean z4 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z4 && sd2.T(chat)) {
                    View c = alertDialog$Builder.a.c(-1);
                    if (c instanceof TextView) {
                        TextView textView = (TextView) c;
                        if (zArr[0]) {
                            if (sd2.V(chat)) {
                                i = 2131752368;
                            } else {
                                i = 2131751467;
                            }
                            textView.setText(jb6.M0(i, null));
                            return;
                        } else if (chat.monoforum) {
                            textView.setText(jb6.M0(2131748752, null));
                            return;
                        } else if (chat.megagroup) {
                            textView.setText(jb6.M0(2131748748, null));
                            return;
                        } else {
                            textView.setText(jb6.M0(2131748761, null));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                c41 c41Var = (c41) this.d;
                boolean z5 = this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                ylb ylbVar2 = (ylb) this.e;
                if (z5) {
                    M0 = jb6.M0(2131753446, "BoostingGiveawayCreated");
                } else {
                    M0 = jb6.M0(2131753557, "BoostingAwardsCreated");
                }
                if (z5) {
                    if (sd2.V(chat2)) {
                        i3 = 2131753520;
                    } else {
                        i3 = 2131753519;
                    }
                    M02 = jb6.M0(i3, null);
                } else {
                    if (sd2.V(chat2)) {
                        i2 = 2131753522;
                    } else {
                        i2 = 2131753521;
                    }
                    M02 = jb6.M0(i2, null);
                }
                u31 I = c41Var.I(2131624211, M0, gm.N2(M02, cmb.wj, 0, new sn0(chat2), ylbVar2));
                I.j = 5000;
                I.j();
                return;
            case 2:
                a81 a81Var = (a81) this.c;
                Pair pair = (Pair) this.d;
                Object obj = this.e;
                boolean z6 = this.b;
                HashMap hashMap = a81Var.c;
                if (hashMap != null && (arrayList = (ArrayList) hashMap.get(pair)) != null) {
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj2 = arrayList.get(i12);
                        i12++;
                        ((qac) obj2).a(obj);
                    }
                    if (z6) {
                        arrayList.clear();
                        a81Var.c.remove(pair);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                return;
            case 4:
                ((yv1) this.c).U8((String) this.d, (k47) this.e, this.b);
                return;
            case 5:
                bmb bmbVar = (bmb) this.e;
                boolean z7 = this.b;
                amb i13 = bmbVar.i(false);
                int i14 = ((amb) this.d).a;
                UndoView undoView = ((yv1) this.c).N3;
                if (undoView != null) {
                    view = undoView.getUndoButton();
                }
                cmb.I1(bmbVar, false, i14, view);
                if (z7) {
                    cmb.j0(bmbVar, i13, true);
                    return;
                }
                return;
            case 6:
                iv1 iv1Var = (iv1) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z8 = this.b;
                k47 k47Var = (k47) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                yv1 yv1Var = iv1Var.a;
                kt6.t(null, null, 2131744079, new Object[]{yv1Var.getMessagesController().z1(pg3.n(message.from_id), false)}, spannableStringBuilder);
                spannableStringBuilder.append((CharSequence) "\n\n");
                nk n = nk.n(message.suggested_post.price);
                if (n.a == ok.b) {
                    f = yv1Var.getMessagesController().l4.g.f();
                } else {
                    f = yv1Var.getMessagesController().l4.d.f();
                }
                if (z8) {
                    n = nk.j((n.b / 1000) * f, n.a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z8) {
                        kt6.t(null, null, 2131744076, new Object[]{n.g(), bc.J0(f)}, spannableStringBuilder);
                    } else {
                        kt6.t(null, null, 2131744075, new Object[]{n.g()}, spannableStringBuilder);
                    }
                } else if (z8) {
                    kt6.t(null, null, 2131744077, new Object[]{n.g(), u67.F0(message.suggested_post.schedule_date), bc.J0(f)}, spannableStringBuilder);
                } else {
                    kt6.t(null, null, 2131744074, new Object[]{n.g(), u67.F0(message.suggested_post.schedule_date)}, spannableStringBuilder);
                }
                spannableStringBuilder.append(' ');
                i4 = ((d) yv1Var).currentAccount;
                kt6.t(null, null, 2131744078, new Object[]{Long.valueOf(oc7.r1(i4).l4.h.g(TimeUnit.HOURS))}, spannableStringBuilder);
                u31[] u31VarArr = new u31[1];
                n1 n1Var = new n1(u31VarArr, (byte) 13);
                he[] heVarArr = new he[1];
                String M03 = jb6.M0(2131744059, null);
                if (message.suggested_post.schedule_date == 0) {
                    i5 = 2131747984;
                } else {
                    i5 = 2131744058;
                }
                he s0 = ik.s0(yv1Var, M03, spannableStringBuilder, jb6.M0(i5, null), false, new da7(iv1Var, message, heVarArr, k47Var, n1Var, (byte) 19));
                heVarArr[0] = s0;
                s0.setOnDismissListener(n1Var);
                if (z8 && n.a == ok.a) {
                    m21 a = n21.a(yv1Var.getParentActivity());
                    ylbVar = ((d) yv1Var).resourceProvider;
                    u31 G = new c41(a, ylbVar).G(2131624068, 10, jb6.M0(2131744073, null));
                    G.j = 60000;
                    G.k(true);
                    u31VarArr[0] = G;
                    return;
                }
                return;
            case 7:
                wv1 wv1Var = (wv1) this.c;
                wv1Var.r((tz3) this.d, (TLRPC.WallPaper) this.e, this.b);
                wv1Var.o(wv1Var.h);
                mu1 mu1Var = wv1Var.G.m1;
                if (mu1Var != null && (xd9Var = mu1Var.M) != null) {
                    xd9Var.invalidate();
                    return;
                }
                return;
            case 8:
                o42 o42Var = (o42) this.c;
                boolean z9 = this.b;
                ArrayList arrayList3 = (ArrayList) this.e;
                o42Var.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    gm.c3(new lx1(o42Var, new ArrayList(), (byte) 16));
                    return;
                }
                String S0 = jb6.D0().S0(lowerCase, true, false);
                if (!lowerCase.equals(S0) && S0.length() != 0) {
                    str2 = S0;
                }
                if (str2 != null) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                int i15 = i6 + 1;
                String[] strArr = new String[i15];
                strArr[0] = lowerCase;
                if (str2 != null) {
                    strArr[1] = str2;
                }
                ArrayList arrayList4 = new ArrayList();
                if (!z9) {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        i42 i42Var = (i42) arrayList3.get(i16);
                        File file = i42Var.f;
                        if (file != null && !file.isDirectory()) {
                            int i17 = 0;
                            while (true) {
                                if (i17 < i15) {
                                    String str3 = strArr[i17];
                                    String str4 = i42Var.b;
                                    if (str4 != null) {
                                        z = str4.toLowerCase().contains(str3);
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        arrayList4.add(i42Var);
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                        }
                    }
                }
                gm.c3(new lx1(o42Var, arrayList4, (byte) 16));
                return;
            case 9:
                qa2 qa2Var = (qa2) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z10 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
                    qa2Var.m0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = qa2Var.Z;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z10) {
                        if (qa2Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(qa2Var.getParentActivity());
                            alertDialog$Builder2.a.U = jb6.M0(2131745758, null);
                            alertDialog$Builder2.a.S = jb6.M0(2131745756, null);
                            alertDialog$Builder2.g(jb6.M0(2131747564, null), null);
                            qa2Var.showDialog(alertDialog$Builder2.a);
                        } else {
                            return;
                        }
                    }
                }
                f56 f56Var = qa2Var.H;
                if (f56Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = qa2Var.m0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    f56Var.setLink(str);
                    qa2Var.H.c(qa2Var.m0, qa2Var.a0);
                    return;
                }
                return;
            case 10:
                eb2 eb2Var = (eb2) this.d;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.c;
                boolean z11 = this.b;
                chat3.join_to_send = z11;
                oc7 messagesController = eb2Var.y.d.getMessagesController();
                long j = chat3.id;
                np6 np6Var = new np6(eb2Var, z11, chat3, (byte) 15);
                ra2 ra2Var = new ra2(eb2Var, (hw5) this.e, (byte) 4);
                messagesController.getClass();
                TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                tL_channels_toggleJoinToSend.channel = messagesController.g1(j);
                tL_channels_toggleJoinToSend.enabled = z11;
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new i65(messagesController, np6Var, ra2Var, (byte) 22), 64);
                return;
            case 11:
                eb2 eb2Var2 = (eb2) this.d;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.c;
                boolean z12 = this.b;
                chat4.join_request = z12;
                eb2Var2.y.d.getMessagesController().k5(chat4.id, 0L, z12, false, false, new db2(eb2Var2, (byte) 0), new ra2(eb2Var2, (gw5) this.e, (byte) 3));
                return;
            case 12:
                qd2 qd2Var = (qd2) this.c;
                boolean z13 = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                TL_phone.getGroupParticipants getgroupparticipants = (TL_phone.getGroupParticipants) this.e;
                qd2Var.u = false;
                if (z13) {
                    qd2Var.v = false;
                }
                if (tLObject2 != null) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                    oc7.r1(qd2Var.C.a).d4(groupparticipants.users, false);
                    oc7.r1(qd2Var.C.a).X3(groupparticipants.chats, false);
                    qd2Var.n(groupparticipants.participants, z13, getgroupparticipants.offset, groupparticipants.next_offset, groupparticipants.version, groupparticipants.count);
                    return;
                }
                return;
            case 13:
                uf2 uf2Var = (uf2) this.c;
                boolean z14 = this.b;
                uf2Var.b = new ArrayList((ArrayList) this.d);
                ((ResultCallback) this.e).onComplete(uf2Var.d((z14 ? 1 : 0) | 2));
                return;
            case 14:
                bw2 bw2Var = (bw2) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                boolean z15 = this.b;
                String str5 = (String) this.e;
                int size2 = arrayList5.size();
                boolean z16 = false;
                int i18 = 0;
                while (i18 < size2) {
                    Object obj3 = arrayList5.get(i18);
                    i18++;
                    TLRPC.User user = (TLRPC.User) obj3;
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) bw2Var.g0.get(Long.valueOf(user.id));
                    if (tL_contact != null) {
                        bw2Var.f0.remove(tL_contact);
                        bw2Var.g0.remove(Long.valueOf(user.id));
                        z16 = true;
                    }
                }
                if (z16) {
                    bw2Var.d(false);
                }
                nm7 notificationCenter = bw2Var.getNotificationCenter();
                int i19 = oc7.s5;
                notificationCenter.k(2, 1);
                bw2Var.getNotificationCenter().k(25, new Object[0]);
                if (z15) {
                    nm7.e().k(297, 1, jb6.a0("DeletedFromYourContacts", null, 2131751403, str5));
                    return;
                }
                return;
            case 15:
                mm3 mm3Var = (mm3) this.c;
                boolean z17 = this.b;
                l55 l55Var = (l55) this.d;
                jm3 jm3Var = (jm3) this.e;
                if (!z17) {
                    mm3Var.c = jm3Var;
                    l55Var.setRightText(mm3Var.H(jm3Var));
                    l55Var.setRightTextMargin(6);
                    mm3Var.J.clear();
                    mm3Var.d = true;
                    mm3Var.f();
                    mm3Var.P();
                    return;
                }
                return;
            case 16:
                ww3 ww3Var = (ww3) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                String str6 = (String) this.e;
                boolean z18 = this.b;
                yw3 yw3Var = ww3Var.s;
                if (ww3Var.r) {
                    if (tLObject3 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject3;
                        px3 px3Var = yw3Var.r;
                        ArrayList arrayList6 = yw3Var.n;
                        int i20 = px3.C1;
                        cf7.Y(px3Var.a).s1(str6, messages_botresults);
                        ww3Var.h = messages_botresults.next_offset;
                        if (z18) {
                            arrayList6.clear();
                        }
                        arrayList6.size();
                        arrayList6.addAll(messages_botresults.results);
                        ww3Var.f();
                    }
                    yw3Var.d.c(false);
                    ww3Var.r = false;
                    return;
                }
                return;
            case 17:
                boolean z19 = this.b;
                h74 h74Var = (h74) this.d;
                we8 we8Var = (we8) this.e;
                rt6 b = rt6.b((Context) this.c);
                if (b == null) {
                    ncd.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z19) {
                    xa3 xa3Var = h74Var.s;
                    xa3Var.getClass();
                    xa3Var.f.a(b);
                }
                LogSessionId d = b.d();
                synchronized (we8Var) {
                    ve8 ve8Var = we8Var.b;
                    ve8Var.getClass();
                    ve8Var.a(d);
                }
                return;
            case 18:
                boolean z20 = this.b;
                ylb ylbVar3 = (ylb) this.e;
                gm.g((String) this.c);
                dy0 dy0Var = ((my0) this.d).c;
                if (z20) {
                    new c41(dy0Var, ylbVar3).i(jb6.M0(2131747028, null)).j();
                    return;
                } else {
                    new c41(dy0Var, ylbVar3).k(false).j();
                    return;
                }
            case 19:
                my0 my0Var = (my0) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z21 = this.b;
                he heVar = (he) this.e;
                if (my0Var != null && !my0Var.J) {
                    my0Var.v0(true);
                    editTextBoldCursor.requestFocus();
                    if (z21) {
                        gm.c3(new l(editTextBoldCursor, (byte) 6));
                        return;
                    }
                    return;
                } else if (heVar != null && heVar.isShowing()) {
                    heVar.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z21) {
                        gm.c3(new l(editTextBoldCursor, (byte) 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 20:
                g95 g95Var = (g95) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z22 = this.b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        g95Var.o1(null, tL_chatInviteExported3.link, true, z22);
                        return;
                    }
                }
                return;
            case 21:
                zc5 zc5Var = (zc5) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z23 = this.b;
                if (tL_error2 == null) {
                    zc5Var.f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z23) {
                        if (zc5Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(zc5Var.getParentActivity());
                            alertDialog$Builder3.a.U = jb6.M0(2131745758, null);
                            alertDialog$Builder3.a.S = jb6.M0(2131745756, null);
                            alertDialog$Builder3.g(jb6.M0(2131747564, null), null);
                            zc5Var.showDialog(alertDialog$Builder3.a);
                        } else {
                            return;
                        }
                    }
                }
                zc5Var.e = false;
                zc5Var.a.f();
                return;
            case 22:
                ew5 ew5Var = (ew5) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                boolean z24 = this.b;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                d dVar = ew5Var.n1;
                if (dVar != null && dVar.getParentActivity() != null) {
                    if (tL_error3 != null) {
                        if ("INVITE_REQUEST_SENT".equals(tL_error3.text)) {
                            ew5Var.setOnDismissListener(new aw5((byte) 1, ew5Var, z24));
                        } else {
                            ik.c0(ew5Var.a, tL_error3, dVar, tL_messages_importChatInvite, new Object[0]);
                        }
                    }
                    ew5Var.dismiss();
                    return;
                }
                return;
            case 23:
                MediaController mediaController = (MediaController) this.c;
                zb7 zb7Var = (zb7) this.d;
                j5 j5Var = (j5) this.e;
                boolean z25 = this.b;
                String[] strArr2 = MediaController.W1;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                tL_document.access_hash = zb7Var.b;
                tL_document.id = zb7Var.a;
                tL_document.mime_type = "sound/ogg";
                tL_document.file_reference = zb7Var.c;
                tL_document.dc_id = ConnectionsManager.getInstance(j5Var.a).getCurrentDatacenterId();
                bc4.G(j5Var.a);
                File J = bc4.J(tL_document, null, true, true);
                if (J.exists()) {
                    if (!z25) {
                        gm.c3(new lj6(mediaController, J, (byte) 4));
                        return;
                    }
                    return;
                }
                gm.c3(new lj6(j5Var, tL_document, (byte) 5));
                return;
            case 24:
                MediaController mediaController2 = (MediaController) this.c;
                File file2 = (File) this.d;
                boolean z26 = this.b;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) this.e;
                String[] strArr3 = MediaController.W1;
                mediaController2.getClass();
                if (!file2.exists()) {
                    boolean z27 = e21.a;
                    fc4.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.l1 + " writedFrames" + mediaController2.m1), true);
                } else {
                    hs6.d0(mediaController2.i1).D1(mediaController2.n1, mediaController2.o1, cs6.a(mediaController2, file2.getAbsolutePath(), z26));
                }
                tL_document2.date = ConnectionsManager.getInstance(mediaController2.i1).getCurrentTime();
                tL_document2.size = (int) file2.length();
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.voice = true;
                byte[] waveform = MediaController.getWaveform(file2.getAbsolutePath());
                tL_documentAttributeAudio.waveform = waveform;
                if (waveform != null) {
                    tL_documentAttributeAudio.flags |= 4;
                }
                tL_documentAttributeAudio.duration = mediaController2.l1 / 1000.0d;
                tL_document2.attributes.clear();
                tL_document2.attributes.add(tL_documentAttributeAudio);
                nm7.f(mediaController2.i1).k(159, new Object[0]);
                nm7.f(mediaController2.i1).k(163, Integer.valueOf(mediaController2.h1), tL_document2, file2.getAbsolutePath());
                mediaController2.X(false);
                return;
            case 25:
                hs6 hs6Var = (hs6) this.c;
                boolean z28 = this.b;
                hs6Var.getMessagesController().d4((ArrayList) this.d, z28);
                hs6Var.getMessagesController().X3((ArrayList) this.e, z28);
                return;
            case 26:
                hs6 hs6Var2 = (hs6) this.c;
                boolean z29 = this.b;
                ArrayList arrayList7 = (ArrayList) this.d;
                vh6 vh6Var = (vh6) this.e;
                try {
                    hs6Var2.getMessagesStorage().b.beginTransaction();
                    if (z29) {
                        try {
                            executeFast = hs6Var2.getMessagesStorage().b.executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        } catch (Exception e) {
                            e = e;
                            z2 = true;
                            fc4.g(e, z2);
                            return;
                        }
                    } else {
                        executeFast = hs6Var2.getMessagesStorage().b.executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        sQLitePreparedStatement4 = hs6Var2.getMessagesStorage().b.executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    }
                    int i21 = 0;
                    while (i21 < arrayList7.size()) {
                        TLRPC.Message message2 = (TLRPC.Message) arrayList7.get(i21);
                        SparseArray sparseArray = (SparseArray) vh6Var.f(k47.B0(message2));
                        if (sparseArray != null && (arrayList2 = (ArrayList) sparseArray.get(message2.id)) != null) {
                            k47.p5(message2);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message2.getObjectSize());
                            message2.serializeToStream(nativeByteBuffer);
                            int i22 = i11;
                            while (i22 < arrayList2.size()) {
                                k47 k47Var2 = (k47) arrayList2.get(i22);
                                while (i11 < i9) {
                                    if (i11 == 0) {
                                        sQLitePreparedStatement2 = executeFast;
                                    } else {
                                        sQLitePreparedStatement2 = sQLitePreparedStatement4;
                                    }
                                    if (sQLitePreparedStatement2 == null) {
                                        i8 = i9;
                                        sQLitePreparedStatement3 = sQLitePreparedStatement4;
                                    } else {
                                        sQLitePreparedStatement2.requery();
                                        sQLitePreparedStatement2.bindByteBuffer(i10, nativeByteBuffer);
                                        sQLitePreparedStatement2.bindInteger(i9, message2.id);
                                        sQLitePreparedStatement2.bindInteger(3, k47Var2.e1());
                                        i8 = i9;
                                        sQLitePreparedStatement3 = sQLitePreparedStatement4;
                                        sQLitePreparedStatement2.bindLong(4, k47.B0(k47Var2.k));
                                        sQLitePreparedStatement2.step();
                                    }
                                    i11++;
                                    sQLitePreparedStatement4 = sQLitePreparedStatement3;
                                    i9 = i8;
                                    i10 = 1;
                                }
                                i22++;
                                i10 = 1;
                                i11 = 0;
                            }
                            i7 = i9;
                            sQLitePreparedStatement = sQLitePreparedStatement4;
                            nativeByteBuffer.reuse();
                        } else {
                            i7 = i9;
                            sQLitePreparedStatement = sQLitePreparedStatement4;
                        }
                        i21++;
                        sQLitePreparedStatement4 = sQLitePreparedStatement;
                        i9 = i7;
                        i10 = 1;
                        i11 = 0;
                    }
                    SQLitePreparedStatement sQLitePreparedStatement5 = sQLitePreparedStatement4;
                    executeFast.dispose();
                    if (sQLitePreparedStatement5 != null) {
                        sQLitePreparedStatement5.dispose();
                    }
                    hs6Var2.getMessagesStorage().b.commitTransaction();
                    return;
                } catch (Exception e2) {
                    e = e2;
                    z2 = true;
                }
                break;
            case 27:
                hs6 hs6Var3 = (hs6) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.e;
                boolean z30 = this.b;
                if (tLObject6 instanceof TLRPC.TL_emojiList) {
                    SerializedData serializedData = new SerializedData(tLObject6.getObjectSize());
                    tLObject6.serializeToStream(serializedData);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (z30) {
                        hs6Var3.M1 = (TLRPC.TL_emojiList) tLObject6;
                        edit.putString("profile", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("profile_last_check", System.currentTimeMillis());
                    } else {
                        hs6Var3.N1 = (TLRPC.TL_emojiList) tLObject6;
                        edit.putString("group", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("group_last_check", System.currentTimeMillis());
                    }
                    edit.apply();
                    return;
                }
                return;
            case 28:
                hs6 hs6Var4 = (hs6) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                String str7 = (String) this.e;
                boolean z31 = this.b;
                if (tLObject7 instanceof TLRPC.TL_messages_stickerSet) {
                    hs6Var4.t1(str7, z31, (TLRPC.TL_messages_stickerSet) tLObject7, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                } else {
                    hs6Var4.t1(str7, z31, null, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                }
            default:
                oc7 oc7Var = (oc7) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                boolean z32 = this.b;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = (TLRPC.TL_contacts_getBlocked) this.e;
                LongSparseIntArray longSparseIntArray = oc7Var.x0;
                if (tLObject8 != null) {
                    TLRPC.contacts_Blocked contacts_blocked = (TLRPC.contacts_Blocked) tLObject8;
                    oc7Var.d4(contacts_blocked.users, false);
                    oc7Var.X3(contacts_blocked.chats, false);
                    oc7Var.getMessagesStorage().j1(contacts_blocked.users, contacts_blocked.chats, true, true);
                    if (z32) {
                        longSparseIntArray.clear();
                    }
                    oc7Var.y0 = Math.max(contacts_blocked.count, contacts_blocked.blocked.size());
                    if (contacts_blocked.blocked.size() < tL_contacts_getBlocked.limit) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    oc7Var.z0 = z3;
                    int size3 = contacts_blocked.blocked.size();
                    for (int i23 = 0; i23 < size3; i23++) {
                        longSparseIntArray.put(k47.B1(contacts_blocked.blocked.get(i23).peer_id), 1);
                    }
                    oc7Var.w0 = false;
                    oc7Var.getNotificationCenter().k(44, new Object[0]);
                    return;
                }
                return;
        }
    }

    public rh(eb2 eb2Var, TLRPC.Chat chat, boolean z, Runnable runnable, byte b) {
        this.a = b;
        this.d = eb2Var;
        this.c = chat;
        this.b = z;
        this.e = runnable;
    }

    public rh(c41 c41Var, boolean z, TLRPC.Chat chat, ylb ylbVar) {
        this.a = (byte) 1;
        this.d = c41Var;
        this.b = z;
        this.c = chat;
        this.e = ylbVar;
    }

    public rh(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public rh(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    public rh(Object obj, boolean z, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }

    public rh(String str, int i, my0 my0Var, ylb ylbVar) {
        this.a = (byte) 18;
        this.c = str;
        this.b = i;
        this.d = my0Var;
        this.e = ylbVar;
    }

    public rh(boolean z, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = (byte) 0;
        this.b = z;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
