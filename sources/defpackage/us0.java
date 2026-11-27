package defpackage;

import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class us0 implements Runnable {
    public final byte a;
    public final long b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public us0(c6b c6bVar, TLRPC.TL_error tL_error, boolean z, long j, pcc pccVar, vnb vnbVar) {
        this.a = (byte) 9;
        this.d = c6bVar;
        this.e = tL_error;
        this.c = z;
        this.b = j;
        this.f = pccVar;
        this.h = vnbVar;
    }

    @Override
    public final void run() {
        hm hmVar;
        SpannableStringBuilder S2;
        d31 j;
        byte b = 0;
        int i = 0;
        switch (this.a) {
            case 0:
                at0 at0Var = (at0) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject = (TLObject) this.f;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.h;
                boolean z = this.c;
                long j2 = this.b;
                at0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.e0(password);
                    at0Var.o0(z, j2, twoStepVerificationActivity.d0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                xt3 xt3Var = (xt3) this.e;
                String str = (String) this.f;
                TLRPC.Document document = (TLRPC.Document) this.h;
                long j3 = this.b;
                boolean z2 = this.c;
                ChatActivityEnterView chatActivityEnterView = ((qy1) this.d).a;
                if (xt3Var != null) {
                    int selectionEnd = xt3Var.getSelectionEnd();
                    if (selectionEnd < 0) {
                        selectionEnd = 0;
                    }
                    try {
                        try {
                            chatActivityEnterView.H3 = (byte) 2;
                            if (str == null) {
                                str = "😀";
                            }
                            SpannableString spannableString = new SpannableString(str);
                            if (document != null) {
                                hmVar = new hm(document, xt3Var.getPaint().getFontMetricsInt());
                            } else {
                                hmVar = new hm(j3, xt3Var.getPaint().getFontMetricsInt());
                            }
                            if (!z2) {
                                hmVar.fromEmojiKeyboard = true;
                            }
                            hmVar.cacheType = wl.f();
                            spannableString.setSpan(hmVar, 0, spannableString.length(), 33);
                            xt3Var.setText(xt3Var.getText().insert(selectionEnd, spannableString));
                            xt3Var.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                        return;
                    } finally {
                        chatActivityEnterView.H3 = (byte) 0;
                    }
                }
                return;
            case 2:
                j95 j95Var = (j95) this.d;
                id[] idVarArr = (id[]) this.f;
                boolean z3 = this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                long j4 = this.b;
                TL_phone.inviteToGroupCall invitetogroupcall = (TL_phone.inviteToGroupCall) this.h;
                try {
                    idVarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                idVarArr[0] = null;
                if (z3 && "USER_NOT_PARTICIPANT".equals(tL_error2.text)) {
                    j95Var.s1(null, j4, 3);
                    return;
                } else {
                    jj.c0(j95Var.a, tL_error2, (e) j95Var.b2.N().getFragmentStack().get(j95Var.b2.N().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
                    return;
                }
            case 3:
                e66 e66Var = (e66) this.d;
                TLObject tLObject2 = (TLObject) this.f;
                long j5 = this.b;
                String str2 = (String) this.h;
                boolean z4 = this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.e;
                int i2 = e66Var.b;
                e66Var.c();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    uc7.s1(i2).j4(tL_contacts_resolvedPeer.users, false);
                    uc7.s1(i2).c4(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(tL_contacts_resolvedPeer.peer.user_id));
                    if (X1 != null) {
                        euc eucVar = new euc(X1);
                        eucVar.s = j5;
                        eucVar.h0 = str2;
                        eucVar.i0 = z4;
                        eucVar.g0 = true;
                        e66Var.u(eucVar, false);
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    e66.d().g0(tL_error3, false);
                    return;
                } else {
                    return;
                }
            case 4:
                uc7 uc7Var = (uc7) this.d;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) this.e;
                zh6 zh6Var = (zh6) this.f;
                long j6 = this.b;
                qc7 qc7Var = (qc7) this.h;
                boolean z5 = this.c;
                if (tL_channels_sendAsPeers == null) {
                    zh6Var.l(j6);
                    return;
                }
                SystemClock.elapsedRealtime();
                qc7Var.a = tL_channels_sendAsPeers;
                uc7Var.getNotificationCenter().k(16, Long.valueOf(j6), tL_channels_sendAsPeers, Boolean.valueOf(z5));
                return;
            case 5:
                o68 o68Var = (o68) this.d;
                final uc7 uc7Var2 = (uc7) this.e;
                final long j7 = this.b;
                final boolean z6 = this.c;
                String str3 = (String) this.h;
                TLObject tLObject3 = (TLObject) this.f;
                uc7Var2.O1().l0(j7, z6, false);
                qx6 qx6Var = new qx6((byte) 10, false);
                qx6Var.b = new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r5;
                        boolean z7 = z6;
                        long j8 = j7;
                        uc7 uc7Var3 = uc7Var2;
                        switch (b2) {
                            case 0:
                                uc7Var3.O1().l0(j8, !z7, false);
                                return;
                            default:
                                uc7Var3.O1().l0(j8, z7, true);
                                return;
                        }
                    }
                };
                qx6Var.c = new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r5;
                        boolean z7 = z6;
                        long j8 = j7;
                        uc7 uc7Var3 = uc7Var2;
                        switch (b2) {
                            case 0:
                                uc7Var3.O1().l0(j8, !z7, false);
                                return;
                            default:
                                uc7Var3.O1().l0(j8, z7, true);
                                return;
                        }
                    }
                };
                if (!z6) {
                    S2 = hl.S2(ob6.a0(null, null, 2131744415, lv2.m(10, str3, null)));
                } else {
                    S2 = hl.S2(ob6.a0(null, null, 2131744416, lv2.m(10, str3, null)));
                }
                v21 V = new d31(o68Var.N0, o68Var.l0).V(Arrays.asList(tLObject3), S2, null, qx6Var);
                V.a = 2;
                V.k(true);
                return;
            case 6:
                cr8 cr8Var = (cr8) this.d;
                long j8 = this.b;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.e;
                String str4 = (String) this.f;
                boolean z7 = this.c;
                ProfileActivity profileActivity = cr8Var.b;
                pd2 pd2Var = new pd2(profileActivity.e1, -j8, tL_chatAdminRights, null, null, str4, 2, true, !z7, null);
                pd2Var.Y0 = new br8(cr8Var, (uj3) this.h);
                profileActivity.presentFragment(pd2Var);
                return;
            case 7:
                wua wuaVar = (wua) this.d;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
                long j9 = this.b;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                boolean z8 = this.c;
                hw4 hw4Var = (hw4) this.h;
                bxa bxaVar = wuaVar.B2;
                if (hw4Var != null) {
                    j = new d31(hw4Var.c, wuaVar.J0);
                } else {
                    j = wuaVar.j();
                }
                it7.e(wuaVar.getContext(), wuaVar.a, tL_starGiftUnique, j9, tL_textWithEntities, !z8, wuaVar.J0, new vra(wuaVar, hw4Var, (byte) 1), j, new wra(wuaVar, hw4Var, (byte) 1), new xra(bxaVar, tL_starGiftUnique, (byte) 1));
                return;
            case 8:
                jxa jxaVar = (jxa) this.d;
                pcc pccVar = (pcc) this.e;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f;
                long j10 = this.b;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = (TLRPC.TL_textWithEntities) this.h;
                boolean z9 = this.c;
                if (!jxaVar.e) {
                    jxa.c("NO_BALANCE");
                    pccVar.a(null);
                    return;
                }
                jxaVar.E(starGift, j10, tL_textWithEntities2, z9, pccVar);
                return;
            case 9:
                c6b c6bVar = (c6b) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                boolean z10 = this.c;
                long j11 = this.b;
                pcc pccVar2 = (pcc) this.f;
                vnb vnbVar = (vnb) this.h;
                if (tL_error4 != null) {
                    if (tL_error4.text.contains("BOOSTS_REQUIRED")) {
                        if (z10) {
                            uc7 s1 = uc7.s1(c6bVar.a);
                            s1.G0().a(j11, new r4c(c6bVar, pccVar2, s1, j11, (byte) 9));
                            return;
                        }
                        pccVar2.a(Boolean.FALSE);
                        return;
                    } else if (tL_error4.text.startsWith("STORY_LIVE_ALREADY_")) {
                        e Q = LaunchActivity.Q();
                        if (z10 && Q != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, Q.getContext());
                            alertDialog$Builder.a.S = ob6.M0(2131748580, null);
                            alertDialog$Builder.a.U = ob6.M0(2131748581, null);
                            c00.u(null, 2131747558, alertDialog$Builder, null);
                        }
                        pccVar2.a(Boolean.FALSE);
                        return;
                    } else if (tL_error4.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        e Q2 = LaunchActivity.Q();
                        if (z10 && Q2 != null) {
                            Q2.showDialog(new xk8(Q2, 14, true));
                        }
                        pccVar2.a(Boolean.FALSE);
                        return;
                    } else {
                        d31 Y = d31.Y();
                        if (Y != null) {
                            Y.g0(tL_error4, false);
                        }
                        pccVar2.a(Boolean.FALSE);
                        return;
                    }
                }
                pccVar2.a(Boolean.TRUE);
                return;
            case 10:
                qyb qybVar = (qyb) this.d;
                TLObject tLObject4 = (TLObject) this.f;
                boolean z11 = this.c;
                long j12 = this.b;
                HashSet hashSet = (HashSet) this.e;
                o30 o30Var = (o30) this.h;
                if (tLObject4 != null) {
                    if (z11) {
                        zh6 zh6Var2 = new zh6();
                        TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject4;
                        ArrayList m = ro4.m(tL_messages_savedDialogs.dialogs);
                        for (int i3 = 0; i3 < tL_messages_savedDialogs.messages.size(); i3++) {
                            zh6Var2.k(tL_messages_savedDialogs.messages.get(i3).id, tL_messages_savedDialogs.messages.get(i3));
                        }
                        hl.c3(new sp6(qybVar, tL_messages_savedDialogs, j12, m, zh6Var2, hashSet, o30Var));
                        return;
                    }
                    zh6 zh6Var3 = new zh6();
                    TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject4;
                    while (b < tL_messages_forumTopics.messages.size()) {
                        zh6Var3.k(tL_messages_forumTopics.messages.get(b).id, tL_messages_forumTopics.messages.get(b));
                        b++;
                    }
                    hl.c3(new nm1(qybVar, tLObject4, j12, tL_messages_forumTopics, zh6Var3, o30Var, (byte) 6));
                    return;
                }
                return;
            default:
                a5c a5cVar = (a5c) this.d;
                HashMap hashMap = (HashMap) this.e;
                long j13 = this.b;
                w4c w4cVar = (w4c) this.f;
                boolean z12 = this.c;
                HashSet hashSet2 = (HashSet) this.h;
                synchronized (a5cVar) {
                    ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(j13));
                    if (arrayList != null) {
                        arrayList.remove(w4cVar);
                        if (arrayList.isEmpty()) {
                            hashMap.remove(Long.valueOf(j13));
                        }
                    }
                }
                String str5 = a5cVar.getMessagesController().l4.S2.f;
                if (!"alternative".equals(str5) && !"system".equals(str5)) {
                    TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                    int i4 = tL_messages_translateText.flags;
                    if (z12) {
                        tL_messages_translateText.flags = i4 | 2;
                        tL_messages_translateText.text.addAll(w4cVar.c);
                    } else {
                        tL_messages_translateText.flags = i4 | 1;
                        tL_messages_translateText.peer = a5cVar.getMessagesController().j1(j13);
                        tL_messages_translateText.id = w4cVar.b;
                    }
                    tL_messages_translateText.to_lang = a5c.D(w4cVar.e);
                    int sendRequest = a5cVar.getConnectionsManager().sendRequest(tL_messages_translateText, new rs0(a5cVar, w4cVar, z12, j13, hashSet2, (byte) 6));
                    synchronized (a5cVar) {
                        w4cVar.h = sendRequest;
                    }
                    return;
                }
                String str6 = w4cVar.e;
                while (i < w4cVar.b.size()) {
                    String str7 = str6;
                    r3c.E0(((TLRPC.TL_textWithEntities) w4cVar.c.get(i)).text, null, str7, new n4c(a5cVar, (mcc) w4cVar.d.get(i), z12, ((Integer) w4cVar.b.get(i)).intValue(), str6, j13, (byte) 0));
                    i++;
                    str6 = str7;
                }
                return;
        }
    }

    public us0(qy1 qy1Var, xt3 xt3Var, String str, TLRPC.Document document, long j, boolean z) {
        this.a = (byte) 1;
        this.d = qy1Var;
        this.e = xt3Var;
        this.f = str;
        this.h = document;
        this.b = j;
        this.c = z;
    }

    public us0(j95 j95Var, id[] idVarArr, boolean z, TLRPC.TL_error tL_error, long j, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.a = (byte) 2;
        this.d = j95Var;
        this.f = idVarArr;
        this.c = z;
        this.e = tL_error;
        this.b = j;
        this.h = invitetogroupcall;
    }

    public us0(e66 e66Var, TLObject tLObject, long j, String str, boolean z, TLRPC.TL_error tL_error) {
        this.a = (byte) 3;
        this.d = e66Var;
        this.f = tLObject;
        this.b = j;
        this.h = str;
        this.c = z;
        this.e = tL_error;
    }

    public us0(o68 o68Var, uc7 uc7Var, long j, boolean z, String str, TLObject tLObject) {
        this.a = (byte) 5;
        this.d = o68Var;
        this.e = uc7Var;
        this.b = j;
        this.c = z;
        this.h = str;
        this.f = tLObject;
    }

    public us0(cr8 cr8Var, long j, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z, uj3 uj3Var) {
        this.a = (byte) 6;
        this.d = cr8Var;
        this.b = j;
        this.e = tL_chatAdminRights;
        this.f = str;
        this.c = z;
        this.h = uj3Var;
    }

    public us0(at0 at0Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, long j) {
        this.a = (byte) 0;
        this.d = at0Var;
        this.e = tL_error;
        this.f = tLObject;
        this.h = twoStepVerificationActivity;
        this.c = z;
        this.b = j;
    }

    public us0(qyb qybVar, TLObject tLObject, boolean z, long j, HashSet hashSet, o30 o30Var) {
        this.a = (byte) 10;
        this.d = qybVar;
        this.f = tLObject;
        this.c = z;
        this.b = j;
        this.e = hashSet;
        this.h = o30Var;
    }

    public us0(Object obj, Object obj2, long j, Object obj3, boolean z, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = j;
        this.f = obj3;
        this.c = z;
        this.h = obj4;
    }

    public us0(Object obj, Object obj2, Object obj3, long j, Object obj4, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = j;
        this.h = obj4;
        this.c = z;
    }
}
