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
public final class rg implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public rg(hq6 hq6Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z) {
        this.a = (byte) 28;
        this.c = hq6Var;
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
        wjb wjbVar;
        si9 si9Var;
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
        r12 = null;
        String str2 = null;
        int i10 = 1;
        int i11 = 0;
        switch (this.a) {
            case 0:
                boolean z4 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z4 && hc2.T(chat)) {
                    View c = alertDialog$Builder.a.c(-1);
                    if (c instanceof TextView) {
                        TextView textView = (TextView) c;
                        if (zArr[0]) {
                            if (hc2.V(chat)) {
                                i = 2131752410;
                            } else {
                                i = 2131751518;
                            }
                            textView.setText(k96.M0(i, null));
                            return;
                        } else if (chat.monoforum) {
                            textView.setText(k96.M0(2131748803, null));
                            return;
                        } else if (chat.megagroup) {
                            textView.setText(k96.M0(2131748799, null));
                            return;
                        } else {
                            textView.setText(k96.M0(2131748812, null));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                u21 u21Var = (u21) this.d;
                boolean z5 = this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                wjb wjbVar2 = (wjb) this.e;
                if (z5) {
                    M0 = k96.M0(2131753478, "BoostingGiveawayCreated");
                } else {
                    M0 = k96.M0(2131753589, "BoostingAwardsCreated");
                }
                if (z5) {
                    if (hc2.V(chat2)) {
                        i3 = 2131753552;
                    } else {
                        i3 = 2131753551;
                    }
                    M02 = k96.M0(i3, null);
                } else {
                    if (hc2.V(chat2)) {
                        i2 = 2131753554;
                    } else {
                        i2 = 2131753553;
                    }
                    M02 = k96.M0(i2, null);
                }
                m21 I = u21Var.I(2131624211, M0, gl.N2(M02, bkb.wj, 0, new sm0(chat2), wjbVar2));
                I.j = 5000;
                I.j();
                return;
            case 2:
                t61 t61Var = (t61) this.c;
                Pair pair = (Pair) this.d;
                Object obj = this.e;
                boolean z6 = this.b;
                HashMap hashMap = t61Var.c;
                if (hashMap != null && (arrayList = (ArrayList) hashMap.get(pair)) != null) {
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj2 = arrayList.get(i12);
                        i12++;
                        ((p8c) obj2).a(obj);
                    }
                    if (z6) {
                        arrayList.clear();
                        t61Var.c.remove(pair);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                return;
            case 4:
                ((mu1) this.c).K8((String) this.d, (k27) this.e, this.b);
                return;
            case 5:
                akb akbVar = (akb) this.e;
                boolean z7 = this.b;
                zjb i13 = akbVar.i(false);
                int i14 = ((zjb) this.d).a;
                UndoView undoView = ((mu1) this.c).N3;
                if (undoView != null) {
                    view = undoView.getUndoButton();
                }
                bkb.I1(akbVar, false, i14, view);
                if (z7) {
                    bkb.j0(akbVar, i13, true);
                    return;
                }
                return;
            case 6:
                wt1 wt1Var = (wt1) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z8 = this.b;
                k27 k27Var = (k27) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                mu1 mu1Var = wt1Var.a;
                ls6.s(null, null, 2131744153, new Object[]{mu1Var.getMessagesController().y1(cf3.n(message.from_id), false)}, spannableStringBuilder);
                spannableStringBuilder.append((CharSequence) "\n\n");
                nj n = nj.n(message.suggested_post.price);
                if (n.a == oj.b) {
                    f = mu1Var.getMessagesController().k4.g.f();
                } else {
                    f = mu1Var.getMessagesController().k4.d.f();
                }
                if (z8) {
                    n = nj.j((n.b / 1000) * f, n.a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z8) {
                        ls6.s(null, null, 2131744150, new Object[]{n.g(), bc.I0(f)}, spannableStringBuilder);
                    } else {
                        ls6.s(null, null, 2131744149, new Object[]{n.g()}, spannableStringBuilder);
                    }
                } else if (z8) {
                    ls6.s(null, null, 2131744151, new Object[]{n.g(), t47.F0(message.suggested_post.schedule_date), bc.I0(f)}, spannableStringBuilder);
                } else {
                    ls6.s(null, null, 2131744148, new Object[]{n.g(), t47.F0(message.suggested_post.schedule_date)}, spannableStringBuilder);
                }
                spannableStringBuilder.append(' ');
                i4 = ((d) mu1Var).currentAccount;
                ls6.s(null, null, 2131744152, new Object[]{Long.valueOf(na7.q1(i4).k4.h.g(TimeUnit.HOURS))}, spannableStringBuilder);
                m21[] m21VarArr = new m21[1];
                n1 n1Var = new n1(m21VarArr, (byte) 13);
                hd[] hdVarArr = new hd[1];
                String M03 = k96.M0(2131744133, null);
                if (message.suggested_post.schedule_date == 0) {
                    i5 = 2131748058;
                } else {
                    i5 = 2131744132;
                }
                hd s0 = ij.s0(mu1Var, M03, spannableStringBuilder, k96.M0(i5, null), false, new b87(wt1Var, message, hdVarArr, k27Var, n1Var, (byte) 19));
                hdVarArr[0] = s0;
                s0.setOnDismissListener(n1Var);
                if (z8 && n.a == oj.a) {
                    e11 a = f11.a(mu1Var.getParentActivity());
                    wjbVar = ((d) mu1Var).resourceProvider;
                    m21 G = new u21(a, wjbVar).G(2131624068, 10, k96.M0(2131744147, null));
                    G.j = 60000;
                    G.k(true);
                    m21VarArr[0] = G;
                    return;
                }
                return;
            case 7:
                ku1 ku1Var = (ku1) this.c;
                ku1Var.r((jy3) this.d, (TLRPC.WallPaper) this.e, this.b);
                ku1Var.o(ku1Var.h);
                at1 at1Var = ku1Var.G.m1;
                if (at1Var != null && (si9Var = at1Var.M) != null) {
                    si9Var.invalidate();
                    return;
                }
                return;
            case 8:
                c32 c32Var = (c32) this.c;
                boolean z9 = this.b;
                ArrayList arrayList3 = (ArrayList) this.e;
                c32Var.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    gl.c3(new kx1(c32Var, new ArrayList(), (byte) 15));
                    return;
                }
                String S0 = k96.D0().S0(lowerCase, true, false);
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
                        w22 w22Var = (w22) arrayList3.get(i16);
                        File file = w22Var.f;
                        if (file != null && !file.isDirectory()) {
                            int i17 = 0;
                            while (true) {
                                if (i17 < i15) {
                                    String str3 = strArr[i17];
                                    String str4 = w22Var.b;
                                    if (str4 != null) {
                                        z = str4.toLowerCase().contains(str3);
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        arrayList4.add(w22Var);
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                        }
                    }
                }
                gl.c3(new kx1(c32Var, arrayList4, (byte) 15));
                return;
            case 9:
                f92 f92Var = (f92) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z10 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
                    f92Var.m0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = f92Var.Z;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z10) {
                        if (f92Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(f92Var.getParentActivity());
                            alertDialog$Builder2.a.U = k96.M0(2131745832, null);
                            alertDialog$Builder2.a.S = k96.M0(2131745830, null);
                            alertDialog$Builder2.g(k96.M0(2131747638, null), null);
                            f92Var.showDialog(alertDialog$Builder2.a);
                        } else {
                            return;
                        }
                    }
                }
                f36 f36Var = f92Var.H;
                if (f36Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = f92Var.m0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    f36Var.setLink(str);
                    f92Var.H.c(f92Var.m0, f92Var.a0);
                    return;
                }
                return;
            case 10:
                t92 t92Var = (t92) this.d;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.c;
                boolean z11 = this.b;
                chat3.join_to_send = z11;
                na7 messagesController = t92Var.y.d.getMessagesController();
                long j = chat3.id;
                mn6 mn6Var = new mn6(t92Var, z11, chat3, (byte) 15);
                n92 n92Var = new n92(t92Var, (iu5) this.e, (byte) 3);
                messagesController.getClass();
                TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                tL_channels_toggleJoinToSend.channel = messagesController.f1(j);
                tL_channels_toggleJoinToSend.enabled = z11;
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new k45(messagesController, mn6Var, n92Var, (byte) 22), 64);
                return;
            case 11:
                t92 t92Var2 = (t92) this.d;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.c;
                boolean z12 = this.b;
                chat4.join_request = z12;
                t92Var2.y.d.getMessagesController().i5(chat4.id, 0L, z12, false, false, new s92(t92Var2, (byte) 0), new n92(t92Var2, (hu5) this.e, (byte) 2));
                return;
            case 12:
                fc2 fc2Var = (fc2) this.c;
                boolean z13 = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                TL_phone.getGroupParticipants getgroupparticipants = (TL_phone.getGroupParticipants) this.e;
                fc2Var.u = false;
                if (z13) {
                    fc2Var.v = false;
                }
                if (tLObject2 != null) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                    na7.q1(fc2Var.C.a).b4(groupparticipants.users, false);
                    na7.q1(fc2Var.C.a).V3(groupparticipants.chats, false);
                    fc2Var.n(groupparticipants.participants, z13, getgroupparticipants.offset, groupparticipants.next_offset, groupparticipants.version, groupparticipants.count);
                    return;
                }
                return;
            case 13:
                je2 je2Var = (je2) this.c;
                boolean z14 = this.b;
                je2Var.b = new ArrayList((ArrayList) this.d);
                ((ResultCallback) this.e).onComplete(je2Var.d((z14 ? 1 : 0) | 2));
                return;
            case 14:
                qu2 qu2Var = (qu2) this.c;
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
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) qu2Var.g0.get(Long.valueOf(user.id));
                    if (tL_contact != null) {
                        qu2Var.f0.remove(tL_contact);
                        qu2Var.g0.remove(Long.valueOf(user.id));
                        z16 = true;
                    }
                }
                if (z16) {
                    qu2Var.d(false);
                }
                kk7 notificationCenter = qu2Var.getNotificationCenter();
                int i19 = na7.q5;
                notificationCenter.k(2, 1);
                qu2Var.getNotificationCenter().k(25, new Object[0]);
                if (z15) {
                    kk7.e().k(295, 1, k96.a0("DeletedFromYourContacts", null, 2131751454, str5));
                    return;
                }
                return;
            case 15:
                bl3 bl3Var = (bl3) this.c;
                boolean z17 = this.b;
                l35 l35Var = (l35) this.d;
                yk3 yk3Var = (yk3) this.e;
                if (!z17) {
                    bl3Var.c = yk3Var;
                    l35Var.setRightText(bl3Var.H(yk3Var));
                    l35Var.setRightTextMargin(6);
                    bl3Var.J.clear();
                    bl3Var.d = true;
                    bl3Var.f();
                    bl3Var.P();
                    return;
                }
                return;
            case 16:
                lv3 lv3Var = (lv3) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                String str6 = (String) this.e;
                boolean z18 = this.b;
                nv3 nv3Var = lv3Var.s;
                if (lv3Var.r) {
                    if (tLObject3 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject3;
                        ew3 ew3Var = nv3Var.r;
                        ArrayList arrayList6 = nv3Var.n;
                        int i20 = ew3.C1;
                        ad7.Y(ew3Var.a).s1(str6, messages_botresults);
                        lv3Var.h = messages_botresults.next_offset;
                        if (z18) {
                            arrayList6.clear();
                        }
                        arrayList6.size();
                        arrayList6.addAll(messages_botresults.results);
                        lv3Var.f();
                    }
                    nv3Var.d.c(false);
                    lv3Var.r = false;
                    return;
                }
                return;
            case 17:
                boolean z19 = this.b;
                y54 y54Var = (y54) this.d;
                uc8 uc8Var = (uc8) this.e;
                qr6 b = qr6.b((Context) this.c);
                if (b == null) {
                    lad.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z19) {
                    l93 l93Var = y54Var.s;
                    l93Var.getClass();
                    l93Var.f.a(b);
                }
                LogSessionId d = b.d();
                synchronized (uc8Var) {
                    tc8 tc8Var = uc8Var.b;
                    tc8Var.getClass();
                    tc8Var.a(d);
                }
                return;
            case 18:
                boolean z20 = this.b;
                wjb wjbVar3 = (wjb) this.e;
                gl.g((String) this.c);
                ww0 ww0Var = ((fx0) this.d).c;
                if (z20) {
                    new u21(ww0Var, wjbVar3).i(k96.M0(2131747102, null)).j();
                    return;
                } else {
                    new u21(ww0Var, wjbVar3).k(false).j();
                    return;
                }
            case 19:
                fx0 fx0Var = (fx0) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z21 = this.b;
                hd hdVar = (hd) this.e;
                if (fx0Var != null && !fx0Var.J) {
                    fx0Var.v0(true);
                    editTextBoldCursor.requestFocus();
                    if (z21) {
                        gl.c3(new l(editTextBoldCursor, (byte) 6));
                        return;
                    }
                    return;
                } else if (hdVar != null && hdVar.isShowing()) {
                    hdVar.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z21) {
                        gl.c3(new l(editTextBoldCursor, (byte) 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 20:
                h75 h75Var = (h75) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z22 = this.b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        h75Var.o1(null, tL_chatInviteExported3.link, true, z22);
                        return;
                    }
                }
                return;
            case 21:
                bb5 bb5Var = (bb5) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z23 = this.b;
                if (tL_error2 == null) {
                    bb5Var.f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z23) {
                        if (bb5Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(bb5Var.getParentActivity());
                            alertDialog$Builder3.a.U = k96.M0(2131745832, null);
                            alertDialog$Builder3.a.S = k96.M0(2131745830, null);
                            alertDialog$Builder3.g(k96.M0(2131747638, null), null);
                            bb5Var.showDialog(alertDialog$Builder3.a);
                        } else {
                            return;
                        }
                    }
                }
                bb5Var.e = false;
                bb5Var.a.f();
                return;
            case 22:
                fu5 fu5Var = (fu5) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                boolean z24 = this.b;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                d dVar = fu5Var.n1;
                if (dVar != null && dVar.getParentActivity() != null) {
                    if (tL_error3 != null) {
                        if ("INVITE_REQUEST_SENT".equals(tL_error3.text)) {
                            fu5Var.setOnDismissListener(new bu5((byte) 1, fu5Var, z24));
                        } else {
                            ij.c0(fu5Var.a, tL_error3, dVar, tL_messages_importChatInvite, new Object[0]);
                        }
                    }
                    fu5Var.dismiss();
                    return;
                }
                return;
            case 23:
                MediaController mediaController = (MediaController) this.c;
                y97 y97Var = (y97) this.d;
                j5 j5Var = (j5) this.e;
                boolean z25 = this.b;
                String[] strArr2 = MediaController.W1;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                tL_document.access_hash = y97Var.b;
                tL_document.id = y97Var.a;
                tL_document.mime_type = "sound/ogg";
                tL_document.file_reference = y97Var.c;
                tL_document.dc_id = ConnectionsManager.getInstance(j5Var.a).getCurrentDatacenterId();
                ba4.G(j5Var.a);
                File J = ba4.J(tL_document, null, true, true);
                if (J.exists()) {
                    if (!z25) {
                        gl.c3(new oh6(mediaController, J, (byte) 3));
                        return;
                    }
                    return;
                }
                gl.c3(new oh6(j5Var, tL_document, (byte) 4));
                return;
            case 24:
                MediaController mediaController2 = (MediaController) this.c;
                File file2 = (File) this.d;
                boolean z26 = this.b;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) this.e;
                String[] strArr3 = MediaController.W1;
                mediaController2.getClass();
                if (!file2.exists()) {
                    boolean z27 = w01.a;
                    fa4.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.l1 + " writedFrames" + mediaController2.m1), true);
                } else {
                    hq6.d0(mediaController2.i1).D1(mediaController2.n1, mediaController2.o1, cq6.a(mediaController2, file2.getAbsolutePath(), z26));
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
                kk7.f(mediaController2.i1).k(158, new Object[0]);
                kk7.f(mediaController2.i1).k(162, Integer.valueOf(mediaController2.h1), tL_document2, file2.getAbsolutePath());
                mediaController2.X(false);
                return;
            case 25:
                hq6 hq6Var = (hq6) this.c;
                boolean z28 = this.b;
                hq6Var.getMessagesController().b4((ArrayList) this.d, z28);
                hq6Var.getMessagesController().V3((ArrayList) this.e, z28);
                return;
            case 26:
                hq6 hq6Var2 = (hq6) this.c;
                boolean z29 = this.b;
                ArrayList arrayList7 = (ArrayList) this.d;
                vf6 vf6Var = (vf6) this.e;
                try {
                    hq6Var2.getMessagesStorage().b.beginTransaction();
                    if (z29) {
                        try {
                            executeFast = hq6Var2.getMessagesStorage().b.executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        } catch (Exception e) {
                            e = e;
                            z2 = true;
                            fa4.g(e, z2);
                            return;
                        }
                    } else {
                        executeFast = hq6Var2.getMessagesStorage().b.executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        sQLitePreparedStatement4 = hq6Var2.getMessagesStorage().b.executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    }
                    int i21 = 0;
                    while (i21 < arrayList7.size()) {
                        TLRPC.Message message2 = (TLRPC.Message) arrayList7.get(i21);
                        SparseArray sparseArray = (SparseArray) vf6Var.f(k27.B0(message2));
                        if (sparseArray != null && (arrayList2 = (ArrayList) sparseArray.get(message2.id)) != null) {
                            k27.p5(message2);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message2.getObjectSize());
                            message2.serializeToStream(nativeByteBuffer);
                            int i22 = i11;
                            while (i22 < arrayList2.size()) {
                                k27 k27Var2 = (k27) arrayList2.get(i22);
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
                                        sQLitePreparedStatement2.bindInteger(3, k27Var2.e1());
                                        i8 = i9;
                                        sQLitePreparedStatement3 = sQLitePreparedStatement4;
                                        sQLitePreparedStatement2.bindLong(4, k27.B0(k27Var2.k));
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
                    hq6Var2.getMessagesStorage().b.commitTransaction();
                    return;
                } catch (Exception e2) {
                    e = e2;
                    z2 = true;
                }
                break;
            case 27:
                hq6 hq6Var3 = (hq6) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.e;
                boolean z30 = this.b;
                if (tLObject6 instanceof TLRPC.TL_emojiList) {
                    SerializedData serializedData = new SerializedData(tLObject6.getObjectSize());
                    tLObject6.serializeToStream(serializedData);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (z30) {
                        hq6Var3.M1 = (TLRPC.TL_emojiList) tLObject6;
                        edit.putString("profile", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("profile_last_check", System.currentTimeMillis());
                    } else {
                        hq6Var3.N1 = (TLRPC.TL_emojiList) tLObject6;
                        edit.putString("group", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("group_last_check", System.currentTimeMillis());
                    }
                    edit.apply();
                    return;
                }
                return;
            case 28:
                hq6 hq6Var4 = (hq6) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                String str7 = (String) this.e;
                boolean z31 = this.b;
                if (tLObject7 instanceof TLRPC.TL_messages_stickerSet) {
                    hq6Var4.t1(str7, z31, (TLRPC.TL_messages_stickerSet) tLObject7, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                } else {
                    hq6Var4.t1(str7, z31, null, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                }
            default:
                na7 na7Var = (na7) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                boolean z32 = this.b;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = (TLRPC.TL_contacts_getBlocked) this.e;
                LongSparseIntArray longSparseIntArray = na7Var.x0;
                if (tLObject8 != null) {
                    TLRPC.contacts_Blocked contacts_blocked = (TLRPC.contacts_Blocked) tLObject8;
                    na7Var.b4(contacts_blocked.users, false);
                    na7Var.V3(contacts_blocked.chats, false);
                    na7Var.getMessagesStorage().j1(contacts_blocked.users, contacts_blocked.chats, true, true);
                    if (z32) {
                        longSparseIntArray.clear();
                    }
                    na7Var.y0 = Math.max(contacts_blocked.count, contacts_blocked.blocked.size());
                    if (contacts_blocked.blocked.size() < tL_contacts_getBlocked.limit) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    na7Var.z0 = z3;
                    int size3 = contacts_blocked.blocked.size();
                    for (int i23 = 0; i23 < size3; i23++) {
                        longSparseIntArray.put(k27.B1(contacts_blocked.blocked.get(i23).peer_id), 1);
                    }
                    na7Var.w0 = false;
                    na7Var.getNotificationCenter().k(43, new Object[0]);
                    return;
                }
                return;
        }
    }

    public rg(t92 t92Var, TLRPC.Chat chat, boolean z, Runnable runnable, byte b) {
        this.a = b;
        this.d = t92Var;
        this.c = chat;
        this.b = z;
        this.e = runnable;
    }

    public rg(u21 u21Var, boolean z, TLRPC.Chat chat, wjb wjbVar) {
        this.a = (byte) 1;
        this.d = u21Var;
        this.b = z;
        this.c = chat;
        this.e = wjbVar;
    }

    public rg(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public rg(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    public rg(Object obj, boolean z, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }

    public rg(String str, int i, fx0 fx0Var, wjb wjbVar) {
        this.a = (byte) 18;
        this.c = str;
        this.b = i;
        this.d = fx0Var;
        this.e = wjbVar;
    }

    public rg(boolean z, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = (byte) 0;
        this.b = z;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
