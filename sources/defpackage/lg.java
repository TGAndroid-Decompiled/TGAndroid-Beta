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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public final class lg implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public lg(ls6 ls6Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z) {
        this.a = (byte) 28;
        this.c = ls6Var;
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
        vnb vnbVar;
        nf9 nf9Var;
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
                if (z4 && xc2.T(chat)) {
                    View c = alertDialog$Builder.a.c(-1);
                    if (c instanceof TextView) {
                        TextView textView = (TextView) c;
                        if (zArr[0]) {
                            if (xc2.V(chat)) {
                                i = 2131752396;
                            } else {
                                i = 2131751495;
                            }
                            textView.setText(ob6.M0(i, null));
                            return;
                        } else if (chat.monoforum) {
                            textView.setText(ob6.M0(2131748749, null));
                            return;
                        } else if (chat.megagroup) {
                            textView.setText(ob6.M0(2131748745, null));
                            return;
                        } else {
                            textView.setText(ob6.M0(2131748758, null));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                d31 d31Var = (d31) this.d;
                boolean z5 = this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                vnb vnbVar2 = (vnb) this.e;
                if (z5) {
                    M0 = ob6.M0(2131753474, "BoostingGiveawayCreated");
                } else {
                    M0 = ob6.M0(2131753585, "BoostingAwardsCreated");
                }
                if (z5) {
                    if (xc2.V(chat2)) {
                        i3 = 2131753548;
                    } else {
                        i3 = 2131753547;
                    }
                    M02 = ob6.M0(i3, null);
                } else {
                    if (xc2.V(chat2)) {
                        i2 = 2131753550;
                    } else {
                        i2 = 2131753549;
                    }
                    M02 = ob6.M0(i2, null);
                }
                v21 I = d31Var.I(2131624211, M0, hl.N2(M02, aob.xj, 0, new sm0(chat2), vnbVar2));
                I.j = 5000;
                I.j();
                return;
            case 2:
                b71 b71Var = (b71) this.c;
                Pair pair = (Pair) this.d;
                Object obj = this.e;
                boolean z6 = this.b;
                HashMap hashMap = b71Var.c;
                if (hashMap != null && (arrayList = (ArrayList) hashMap.get(pair)) != null) {
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj2 = arrayList.get(i12);
                        i12++;
                        ((pcc) obj2).a(obj);
                    }
                    if (z6) {
                        arrayList.clear();
                        b71Var.c.remove(pair);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                return;
            case 4:
                znb znbVar = (znb) this.e;
                boolean z7 = this.b;
                ynb i13 = znbVar.i(false);
                int i14 = ((ynb) this.d).a;
                UndoView undoView = ((zu1) this.c).N3;
                if (undoView != null) {
                    view = undoView.getUndoButton();
                }
                aob.I1(znbVar, false, i14, view);
                if (z7) {
                    aob.j0(znbVar, i13, true);
                    return;
                }
                return;
            case 5:
                ((zu1) this.c).V8((String) this.d, (r47) this.e, this.b);
                return;
            case 6:
                ju1 ju1Var = (ju1) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z8 = this.b;
                r47 r47Var = (r47) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                zu1 zu1Var = ju1Var.a;
                qu6.s(null, null, 2131744047, new Object[]{zu1Var.getMessagesController().A1(wf3.n(message.from_id), false)}, spannableStringBuilder);
                spannableStringBuilder.append((CharSequence) "\n\n");
                oj n = oj.n(message.suggested_post.price);
                if (n.a == pj.b) {
                    f = zu1Var.getMessagesController().l4.g.f();
                } else {
                    f = zu1Var.getMessagesController().l4.d.f();
                }
                if (z8) {
                    n = oj.j((n.b / 1000) * f, n.a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z8) {
                        qu6.s(null, null, 2131744044, new Object[]{n.g(), cc.J0(f)}, spannableStringBuilder);
                    } else {
                        qu6.s(null, null, 2131744043, new Object[]{n.g()}, spannableStringBuilder);
                    }
                } else if (z8) {
                    qu6.s(null, null, 2131744045, new Object[]{n.g(), a77.G0(message.suggested_post.schedule_date), cc.J0(f)}, spannableStringBuilder);
                } else {
                    qu6.s(null, null, 2131744042, new Object[]{n.g(), a77.G0(message.suggested_post.schedule_date)}, spannableStringBuilder);
                }
                spannableStringBuilder.append(' ');
                i4 = ((e) zu1Var).currentAccount;
                qu6.s(null, null, 2131744046, new Object[]{Long.valueOf(uc7.s1(i4).l4.h.g(TimeUnit.HOURS))}, spannableStringBuilder);
                v21[] v21VarArr = new v21[1];
                o1 o1Var = new o1(v21VarArr, (byte) 13);
                id[] idVarArr = new id[1];
                String M03 = ob6.M0(2131744027, null);
                if (message.suggested_post.schedule_date == 0) {
                    i5 = 2131747981;
                } else {
                    i5 = 2131744026;
                }
                id s0 = jj.s0(zu1Var, M03, spannableStringBuilder, ob6.M0(i5, null), false, new la7(ju1Var, message, idVarArr, r47Var, o1Var, (byte) 19));
                idVarArr[0] = s0;
                s0.setOnDismissListener(o1Var);
                if (z8 && n.a == pj.a) {
                    n11 a = o11.a(zu1Var.getParentActivity());
                    vnbVar = ((e) zu1Var).resourceProvider;
                    v21 G = new d31(a, vnbVar).G(2131624068, 10, ob6.M0(2131744041, null));
                    G.j = 60000;
                    G.k(true);
                    v21VarArr[0] = G;
                    return;
                }
                return;
            case 7:
                xu1 xu1Var = (xu1) this.c;
                xu1Var.r((ez3) this.d, (TLRPC.WallPaper) this.e, this.b);
                xu1Var.o(xu1Var.h);
                nt1 nt1Var = xu1Var.G.m1;
                if (nt1Var != null && (nf9Var = nt1Var.M) != null) {
                    nf9Var.invalidate();
                    return;
                }
                return;
            case 8:
                t32 t32Var = (t32) this.c;
                boolean z9 = this.b;
                ArrayList arrayList3 = (ArrayList) this.e;
                t32Var.getClass();
                String lowerCase = ((String) this.d).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    hl.c3(new dy1(t32Var, new ArrayList(), (byte) 15));
                    return;
                }
                String S0 = ob6.D0().S0(lowerCase, true, false);
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
                        n32 n32Var = (n32) arrayList3.get(i16);
                        File file = n32Var.f;
                        if (file != null && !file.isDirectory()) {
                            int i17 = 0;
                            while (true) {
                                if (i17 < i15) {
                                    String str3 = strArr[i17];
                                    String str4 = n32Var.b;
                                    if (str4 != null) {
                                        z = str4.toLowerCase().contains(str3);
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        arrayList4.add(n32Var);
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                        }
                    }
                }
                hl.c3(new dy1(t32Var, arrayList4, (byte) 15));
                return;
            case 9:
                v92 v92Var = (v92) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z10 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
                    v92Var.m0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = v92Var.Z;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z10) {
                        if (v92Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(v92Var.getParentActivity());
                            alertDialog$Builder2.a.U = ob6.M0(2131745752, null);
                            alertDialog$Builder2.a.S = ob6.M0(2131745750, null);
                            alertDialog$Builder2.g(ob6.M0(2131747558, null), null);
                            v92Var.showDialog(alertDialog$Builder2.a);
                        } else {
                            return;
                        }
                    }
                }
                i56 i56Var = v92Var.H;
                if (i56Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = v92Var.m0;
                    if (tL_chatInviteExported2 != null) {
                        str = tL_chatInviteExported2.link;
                    }
                    i56Var.setLink(str);
                    v92Var.H.c(v92Var.m0, v92Var.a0);
                    return;
                }
                return;
            case 10:
                ja2 ja2Var = (ja2) this.d;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.c;
                boolean z11 = this.b;
                chat3.join_to_send = z11;
                uc7 messagesController = ja2Var.y.d.getMessagesController();
                long j = chat3.id;
                ds6 ds6Var = new ds6(ja2Var, z11, chat3, (byte) 15);
                ea2 ea2Var = new ea2(ja2Var, (mw5) this.e, (byte) 2);
                messagesController.getClass();
                TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                tL_channels_toggleJoinToSend.channel = messagesController.h1(j);
                tL_channels_toggleJoinToSend.enabled = z11;
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new m65(messagesController, ds6Var, ea2Var, (byte) 22), 64);
                return;
            case 11:
                ja2 ja2Var2 = (ja2) this.d;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.c;
                boolean z12 = this.b;
                chat4.join_request = z12;
                ja2Var2.y.d.getMessagesController().q5(chat4.id, 0L, z12, false, false, new ia2(ja2Var2, (byte) 0), new ea2(ja2Var2, (lw5) this.e, (byte) 1));
                return;
            case 12:
                vc2 vc2Var = (vc2) this.c;
                boolean z13 = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                TL_phone.getGroupParticipants getgroupparticipants = (TL_phone.getGroupParticipants) this.e;
                vc2Var.u = false;
                if (z13) {
                    vc2Var.v = false;
                }
                if (tLObject2 != null) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                    uc7.s1(vc2Var.C.a).j4(groupparticipants.users, false);
                    uc7.s1(vc2Var.C.a).c4(groupparticipants.chats, false);
                    vc2Var.n(groupparticipants.participants, z13, getgroupparticipants.offset, groupparticipants.next_offset, groupparticipants.version, groupparticipants.count);
                    return;
                }
                return;
            case 13:
                af2 af2Var = (af2) this.c;
                boolean z14 = this.b;
                af2Var.b = new ArrayList((ArrayList) this.d);
                ((ResultCallback) this.e).onComplete(af2Var.d((z14 ? 1 : 0) | 2));
                return;
            case 14:
                lv2 lv2Var = (lv2) this.c;
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
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) lv2Var.g0.get(Long.valueOf(user.id));
                    if (tL_contact != null) {
                        lv2Var.f0.remove(tL_contact);
                        lv2Var.g0.remove(Long.valueOf(user.id));
                        z16 = true;
                    }
                }
                if (z16) {
                    lv2Var.d(false);
                }
                jn7 notificationCenter = lv2Var.getNotificationCenter();
                int i19 = uc7.s5;
                notificationCenter.k(2, 1);
                lv2Var.getNotificationCenter().k(25, new Object[0]);
                if (z15) {
                    jn7.e().k(296, 1, ob6.a0("DeletedFromYourContacts", null, 2131751431, str5));
                    return;
                }
                return;
            case 15:
                tl3 tl3Var = (tl3) this.c;
                boolean z17 = this.b;
                p55 p55Var = (p55) this.d;
                ql3 ql3Var = (ql3) this.e;
                if (!z17) {
                    tl3Var.c = ql3Var;
                    p55Var.setRightText(tl3Var.H(ql3Var));
                    p55Var.setRightTextMargin(6);
                    tl3Var.J.clear();
                    tl3Var.d = true;
                    tl3Var.f();
                    tl3Var.P();
                    return;
                }
                return;
            case 16:
                fw3 fw3Var = (fw3) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                String str6 = (String) this.e;
                boolean z18 = this.b;
                hw3 hw3Var = fw3Var.s;
                if (fw3Var.r) {
                    if (tLObject3 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject3;
                        zw3 zw3Var = hw3Var.r;
                        ArrayList arrayList6 = hw3Var.n;
                        int i20 = zw3.C1;
                        kf7.a0(zw3Var.a).w1(str6, messages_botresults);
                        fw3Var.h = messages_botresults.next_offset;
                        if (z18) {
                            arrayList6.clear();
                        }
                        arrayList6.size();
                        arrayList6.addAll(messages_botresults.results);
                        fw3Var.f();
                    }
                    hw3Var.d.c(false);
                    fw3Var.r = false;
                    return;
                }
                return;
            case 17:
                boolean z19 = this.b;
                s64 s64Var = (s64) this.d;
                ig8 ig8Var = (ig8) this.e;
                vt6 b = vt6.b((Context) this.c);
                if (b == null) {
                    efd.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z19) {
                    ea3 ea3Var = s64Var.s;
                    ea3Var.getClass();
                    ea3Var.f.a(b);
                }
                LogSessionId d = b.d();
                synchronized (ig8Var) {
                    hg8 hg8Var = ig8Var.b;
                    hg8Var.getClass();
                    hg8Var.a(d);
                }
                return;
            case 18:
                boolean z20 = this.b;
                vnb vnbVar3 = (vnb) this.e;
                hl.g((String) this.c);
                ex0 ex0Var = ((nx0) this.d).c;
                if (z20) {
                    new d31(ex0Var, vnbVar3).i(ob6.M0(2131747022, null)).j();
                    return;
                } else {
                    new d31(ex0Var, vnbVar3).k(false).j();
                    return;
                }
            case 19:
                nx0 nx0Var = (nx0) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z21 = this.b;
                id idVar = (id) this.e;
                if (nx0Var != null && !nx0Var.J) {
                    nx0Var.w0(true);
                    editTextBoldCursor.requestFocus();
                    if (z21) {
                        hl.c3(new l(editTextBoldCursor, (byte) 6));
                        return;
                    }
                    return;
                } else if (idVar != null && idVar.isShowing()) {
                    idVar.k(true);
                    editTextBoldCursor.requestFocus();
                    if (z21) {
                        hl.c3(new l(editTextBoldCursor, (byte) 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 20:
                j95 j95Var = (j95) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z22 = this.b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        j95Var.p1(null, tL_chatInviteExported3.link, true, z22);
                        return;
                    }
                }
                return;
            case 21:
                dd5 dd5Var = (dd5) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z23 = this.b;
                if (tL_error2 == null) {
                    dd5Var.f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z23) {
                        if (dd5Var.getParentActivity() != null) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(dd5Var.getParentActivity());
                            alertDialog$Builder3.a.U = ob6.M0(2131745752, null);
                            alertDialog$Builder3.a.S = ob6.M0(2131745750, null);
                            alertDialog$Builder3.g(ob6.M0(2131747558, null), null);
                            dd5Var.showDialog(alertDialog$Builder3.a);
                        } else {
                            return;
                        }
                    }
                }
                dd5Var.e = false;
                dd5Var.a.f();
                return;
            case 22:
                jw5 jw5Var = (jw5) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                boolean z24 = this.b;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                e eVar = jw5Var.n1;
                if (eVar != null && eVar.getParentActivity() != null) {
                    if (tL_error3 != null) {
                        if ("INVITE_REQUEST_SENT".equals(tL_error3.text)) {
                            jw5Var.setOnDismissListener(new fw5(jw5Var, z24, (byte) 1));
                        } else {
                            jj.c0(jw5Var.a, tL_error3, eVar, tL_messages_importChatInvite, new Object[0]);
                        }
                    }
                    jw5Var.dismiss();
                    return;
                }
                return;
            case 23:
                MediaController mediaController = (MediaController) this.c;
                fc7 fc7Var = (fc7) this.d;
                k5 k5Var = (k5) this.e;
                boolean z25 = this.b;
                String[] strArr2 = MediaController.W1;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                tL_document.access_hash = fc7Var.b;
                tL_document.id = fc7Var.a;
                tL_document.mime_type = "sound/ogg";
                tL_document.file_reference = fc7Var.c;
                tL_document.dc_id = ConnectionsManager.getInstance(k5Var.a).getCurrentDatacenterId();
                xb4.G(k5Var.a);
                File J = xb4.J(tL_document, null, true, true);
                if (J.exists()) {
                    if (!z25) {
                        hl.c3(new z56(mediaController, J, (byte) 29));
                        return;
                    }
                    return;
                }
                hl.c3(new mn6(k5Var, tL_document, (byte) 0));
                return;
            case 24:
                MediaController mediaController2 = (MediaController) this.c;
                File file2 = (File) this.d;
                boolean z26 = this.b;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) this.e;
                String[] strArr3 = MediaController.W1;
                mediaController2.getClass();
                if (!file2.exists()) {
                    boolean z27 = f11.a;
                    cc4.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.l1 + " writedFrames" + mediaController2.m1), true);
                } else {
                    ls6.d0(mediaController2.i1).D1(mediaController2.n1, mediaController2.o1, gs6.a(mediaController2, file2.getAbsolutePath(), z26));
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
                jn7.f(mediaController2.i1).k(159, new Object[0]);
                jn7.f(mediaController2.i1).k(163, Integer.valueOf(mediaController2.h1), tL_document2, file2.getAbsolutePath());
                mediaController2.b0(false);
                return;
            case 25:
                ls6 ls6Var = (ls6) this.c;
                boolean z28 = this.b;
                ls6Var.getMessagesController().j4((ArrayList) this.d, z28);
                ls6Var.getMessagesController().c4((ArrayList) this.e, z28);
                return;
            case 26:
                ls6 ls6Var2 = (ls6) this.c;
                boolean z29 = this.b;
                ArrayList arrayList7 = (ArrayList) this.d;
                zh6 zh6Var = (zh6) this.e;
                try {
                    ls6Var2.getMessagesStorage().b.beginTransaction();
                    if (z29) {
                        try {
                            executeFast = ls6Var2.getMessagesStorage().b.executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        } catch (Exception e) {
                            e = e;
                            z2 = true;
                            cc4.g(e, z2);
                            return;
                        }
                    } else {
                        executeFast = ls6Var2.getMessagesStorage().b.executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        sQLitePreparedStatement4 = ls6Var2.getMessagesStorage().b.executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    }
                    int i21 = 0;
                    while (i21 < arrayList7.size()) {
                        TLRPC.Message message2 = (TLRPC.Message) arrayList7.get(i21);
                        SparseArray sparseArray = (SparseArray) zh6Var.f(r47.B0(message2));
                        if (sparseArray != null && (arrayList2 = (ArrayList) sparseArray.get(message2.id)) != null) {
                            r47.p5(message2);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message2.getObjectSize());
                            message2.serializeToStream(nativeByteBuffer);
                            int i22 = i11;
                            while (i22 < arrayList2.size()) {
                                r47 r47Var2 = (r47) arrayList2.get(i22);
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
                                        sQLitePreparedStatement2.bindInteger(3, r47Var2.e1());
                                        i8 = i9;
                                        sQLitePreparedStatement3 = sQLitePreparedStatement4;
                                        sQLitePreparedStatement2.bindLong(4, r47.B0(r47Var2.k));
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
                    ls6Var2.getMessagesStorage().b.commitTransaction();
                    return;
                } catch (Exception e2) {
                    e = e2;
                    z2 = true;
                }
                break;
            case 27:
                ls6 ls6Var3 = (ls6) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.e;
                boolean z30 = this.b;
                if (tLObject6 instanceof TLRPC.TL_emojiList) {
                    SerializedData serializedData = new SerializedData(tLObject6.getObjectSize());
                    tLObject6.serializeToStream(serializedData);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (z30) {
                        ls6Var3.M1 = (TLRPC.TL_emojiList) tLObject6;
                        edit.putString("profile", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("profile_last_check", System.currentTimeMillis());
                    } else {
                        ls6Var3.N1 = (TLRPC.TL_emojiList) tLObject6;
                        edit.putString("group", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("group_last_check", System.currentTimeMillis());
                    }
                    edit.apply();
                    return;
                }
                return;
            case 28:
                ls6 ls6Var4 = (ls6) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                String str7 = (String) this.e;
                boolean z31 = this.b;
                if (tLObject7 instanceof TLRPC.TL_messages_stickerSet) {
                    ls6Var4.t1(str7, z31, (TLRPC.TL_messages_stickerSet) tLObject7, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                } else {
                    ls6Var4.t1(str7, z31, null, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                }
            default:
                uc7 uc7Var = (uc7) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                boolean z32 = this.b;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = (TLRPC.TL_contacts_getBlocked) this.e;
                LongSparseIntArray longSparseIntArray = uc7Var.x0;
                if (tLObject8 != null) {
                    TLRPC.contacts_Blocked contacts_blocked = (TLRPC.contacts_Blocked) tLObject8;
                    uc7Var.j4(contacts_blocked.users, false);
                    uc7Var.c4(contacts_blocked.chats, false);
                    uc7Var.getMessagesStorage().n1(contacts_blocked.users, contacts_blocked.chats, true, true);
                    if (z32) {
                        longSparseIntArray.clear();
                    }
                    uc7Var.y0 = Math.max(contacts_blocked.count, contacts_blocked.blocked.size());
                    if (contacts_blocked.blocked.size() < tL_contacts_getBlocked.limit) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    uc7Var.z0 = z3;
                    int size3 = contacts_blocked.blocked.size();
                    for (int i23 = 0; i23 < size3; i23++) {
                        longSparseIntArray.put(r47.B1(contacts_blocked.blocked.get(i23).peer_id), 1);
                    }
                    uc7Var.w0 = false;
                    uc7Var.getNotificationCenter().k(44, new Object[0]);
                    return;
                }
                return;
        }
    }

    public lg(ja2 ja2Var, TLRPC.Chat chat, boolean z, Runnable runnable, byte b) {
        this.a = b;
        this.d = ja2Var;
        this.c = chat;
        this.b = z;
        this.e = runnable;
    }

    public lg(d31 d31Var, boolean z, TLRPC.Chat chat, vnb vnbVar) {
        this.a = (byte) 1;
        this.d = d31Var;
        this.b = z;
        this.c = chat;
        this.e = vnbVar;
    }

    public lg(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public lg(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    public lg(Object obj, boolean z, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }

    public lg(String str, int i, nx0 nx0Var, vnb vnbVar) {
        this.a = (byte) 18;
        this.c = str;
        this.b = i;
        this.d = nx0Var;
        this.e = vnbVar;
    }

    public lg(boolean z, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = (byte) 0;
        this.b = z;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
