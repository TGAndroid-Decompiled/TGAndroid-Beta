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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class ut0 implements Runnable {
    public final byte a;
    public final long b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public ut0(h4b h4bVar, TLRPC.TL_error tL_error, boolean z, long j, qac qacVar, ylb ylbVar) {
        this.a = (byte) 8;
        this.d = h4bVar;
        this.e = tL_error;
        this.c = z;
        this.b = j;
        this.f = qacVar;
        this.h = ylbVar;
    }

    @Override
    public final void run() {
        gn gnVar;
        SpannableStringBuilder S2;
        byte b = 0;
        int i = 0;
        switch (this.a) {
            case 0:
                au0 au0Var = (au0) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject = (TLObject) this.f;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.h;
                boolean z = this.c;
                long j = this.b;
                au0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.f0(password);
                    au0Var.p0(z, j, twoStepVerificationActivity.e0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                qu3 qu3Var = (qu3) this.e;
                String str = (String) this.f;
                TLRPC.Document document = (TLRPC.Document) this.h;
                long j2 = this.b;
                boolean z2 = this.c;
                ChatActivityEnterView chatActivityEnterView = ((nz1) this.d).a;
                if (qu3Var != null) {
                    int selectionEnd = qu3Var.getSelectionEnd();
                    if (selectionEnd < 0) {
                        selectionEnd = 0;
                    }
                    try {
                        try {
                            chatActivityEnterView.I3 = (byte) 2;
                            if (str == null) {
                                str = "😀";
                            }
                            SpannableString spannableString = new SpannableString(str);
                            if (document != null) {
                                gnVar = new gn(document, qu3Var.getPaint().getFontMetricsInt());
                            } else {
                                gnVar = new gn(j2, qu3Var.getPaint().getFontMetricsInt());
                            }
                            if (!z2) {
                                gnVar.fromEmojiKeyboard = true;
                            }
                            gnVar.cacheType = vm.f();
                            spannableString.setSpan(gnVar, 0, spannableString.length(), 33);
                            qu3Var.setText(qu3Var.getText().insert(selectionEnd, spannableString));
                            qu3Var.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                        return;
                    } finally {
                        chatActivityEnterView.I3 = (byte) 0;
                    }
                }
                return;
            case 2:
                g95 g95Var = (g95) this.d;
                he[] heVarArr = (he[]) this.f;
                boolean z3 = this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                long j3 = this.b;
                TL_phone.inviteToGroupCall invitetogroupcall = (TL_phone.inviteToGroupCall) this.h;
                try {
                    heVarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                heVarArr[0] = null;
                if (z3 && "USER_NOT_PARTICIPANT".equals(tL_error2.text)) {
                    g95Var.r1(null, j3, 3);
                    return;
                } else {
                    ik.c0(g95Var.a, tL_error2, (d) g95Var.b2.N().getFragmentStack().get(g95Var.b2.N().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
                    return;
                }
            case 3:
                a66 a66Var = (a66) this.d;
                TLObject tLObject2 = (TLObject) this.f;
                long j4 = this.b;
                String str2 = (String) this.h;
                boolean z4 = this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.e;
                int i2 = a66Var.b;
                a66Var.c();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    oc7.r1(i2).d4(tL_contacts_resolvedPeer.users, false);
                    oc7.r1(i2).X3(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(tL_contacts_resolvedPeer.peer.user_id));
                    if (W1 != null) {
                        rrc rrcVar = new rrc(W1);
                        rrcVar.s = j4;
                        rrcVar.h0 = str2;
                        rrcVar.i0 = z4;
                        rrcVar.g0 = true;
                        a66Var.u(rrcVar, false);
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    a66.d().g0(tL_error3, false);
                    return;
                } else {
                    return;
                }
            case 4:
                oc7 oc7Var = (oc7) this.d;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) this.e;
                vh6 vh6Var = (vh6) this.f;
                long j5 = this.b;
                kc7 kc7Var = (kc7) this.h;
                boolean z5 = this.c;
                if (tL_channels_sendAsPeers == null) {
                    vh6Var.l(j5);
                    return;
                }
                SystemClock.elapsedRealtime();
                kc7Var.a = tL_channels_sendAsPeers;
                oc7Var.getNotificationCenter().k(16, Long.valueOf(j5), tL_channels_sendAsPeers, Boolean.valueOf(z5));
                return;
            case 5:
                a58 a58Var = (a58) this.d;
                final oc7 oc7Var2 = (oc7) this.e;
                final long j6 = this.b;
                final boolean z6 = this.c;
                String str3 = (String) this.h;
                TLObject tLObject3 = (TLObject) this.f;
                oc7Var2.N1().l0(j6, z6, false);
                hi2 hi2Var = new hi2((byte) 12, false);
                hi2Var.b = new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r5;
                        boolean z7 = z6;
                        long j7 = j6;
                        oc7 oc7Var3 = oc7Var2;
                        switch (b2) {
                            case 0:
                                oc7Var3.N1().l0(j7, !z7, false);
                                return;
                            default:
                                oc7Var3.N1().l0(j7, z7, true);
                                return;
                        }
                    }
                };
                hi2Var.c = new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r5;
                        boolean z7 = z6;
                        long j7 = j6;
                        oc7 oc7Var3 = oc7Var2;
                        switch (b2) {
                            case 0:
                                oc7Var3.N1().l0(j7, !z7, false);
                                return;
                            default:
                                oc7Var3.N1().l0(j7, z7, true);
                                return;
                        }
                    }
                };
                if (!z6) {
                    S2 = gm.S2(jb6.a0(null, null, 2131744447, bw2.m(10, str3, null)));
                } else {
                    S2 = gm.S2(jb6.a0(null, null, 2131744448, bw2.m(10, str3, null)));
                }
                u31 V = new c41(a58Var.T0, a58Var.r0).V(Arrays.asList(tLObject3), S2, null, hi2Var);
                V.a = 2;
                V.k(true);
                return;
            case 6:
                sp8 sp8Var = (sp8) this.d;
                long j7 = this.b;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.e;
                String str4 = (String) this.f;
                boolean z7 = this.c;
                ProfileActivity profileActivity = sp8Var.b;
                ke2 ke2Var = new ke2(profileActivity.e1, -j7, tL_chatAdminRights, null, null, str4, 2, true, !z7, null);
                ke2Var.Y0 = new rp8(sp8Var, (nk3) this.h);
                profileActivity.presentFragment(ke2Var);
                return;
            case 7:
                jva jvaVar = (jva) this.d;
                qac qacVar = (qac) this.e;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f;
                long j8 = this.b;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                boolean z8 = this.c;
                if (!jvaVar.e) {
                    jva.c("NO_BALANCE");
                    qacVar.a(null);
                    return;
                }
                jvaVar.E(starGift, j8, tL_textWithEntities, z8, qacVar);
                return;
            case 8:
                h4b h4bVar = (h4b) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                boolean z9 = this.c;
                long j9 = this.b;
                qac qacVar2 = (qac) this.f;
                ylb ylbVar = (ylb) this.h;
                if (tL_error4 != null) {
                    if (tL_error4.text.contains("BOOSTS_REQUIRED")) {
                        if (z9) {
                            oc7 r1 = oc7.r1(h4bVar.a);
                            r1.F0().a(j9, new s2c(h4bVar, qacVar2, r1, j9, (byte) 9));
                            return;
                        }
                        qacVar2.a(Boolean.FALSE);
                        return;
                    } else if (tL_error4.text.startsWith("STORY_LIVE_ALREADY_")) {
                        d Q = LaunchActivity.Q();
                        if (z9 && Q != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, Q.getContext());
                            alertDialog$Builder.a.S = jb6.M0(2131748583, null);
                            alertDialog$Builder.a.U = jb6.M0(2131748584, null);
                            b10.t(null, 2131747564, alertDialog$Builder, null);
                        }
                        qacVar2.a(Boolean.FALSE);
                        return;
                    } else if (tL_error4.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        d Q2 = LaunchActivity.Q();
                        if (z9 && Q2 != null) {
                            Q2.showDialog(new kj8(Q2, 14, true));
                        }
                        qacVar2.a(Boolean.FALSE);
                        return;
                    } else {
                        c41 Y = c41.Y();
                        if (Y != null) {
                            Y.g0(tL_error4, false);
                        }
                        qacVar2.a(Boolean.FALSE);
                        return;
                    }
                }
                qacVar2.a(Boolean.TRUE);
                return;
            case 9:
                qwb qwbVar = (qwb) this.d;
                TLObject tLObject4 = (TLObject) this.f;
                boolean z10 = this.c;
                long j10 = this.b;
                HashSet hashSet = (HashSet) this.e;
                n40 n40Var = (n40) this.h;
                if (tLObject4 != null) {
                    if (z10) {
                        vh6 vh6Var2 = new vh6();
                        TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject4;
                        ArrayList m = no4.m(tL_messages_savedDialogs.dialogs);
                        for (int i3 = 0; i3 < tL_messages_savedDialogs.messages.size(); i3++) {
                            vh6Var2.k(tL_messages_savedDialogs.messages.get(i3), tL_messages_savedDialogs.messages.get(i3).id);
                        }
                        gm.c3(new rr6(qwbVar, tL_messages_savedDialogs, j10, m, vh6Var2, hashSet, n40Var));
                        return;
                    }
                    vh6 vh6Var3 = new vh6();
                    TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject4;
                    while (b < tL_messages_forumTopics.messages.size()) {
                        vh6Var3.k(tL_messages_forumTopics.messages.get(b), tL_messages_forumTopics.messages.get(b).id);
                        b++;
                    }
                    gm.c3(new om1(qwbVar, tLObject4, j10, tL_messages_forumTopics, vh6Var3, n40Var, (byte) 6));
                    return;
                }
                return;
            default:
                b3c b3cVar = (b3c) this.d;
                HashMap hashMap = (HashMap) this.e;
                long j11 = this.b;
                x2c x2cVar = (x2c) this.f;
                boolean z11 = this.c;
                HashSet hashSet2 = (HashSet) this.h;
                synchronized (b3cVar) {
                    ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(j11));
                    if (arrayList != null) {
                        arrayList.remove(x2cVar);
                        if (arrayList.isEmpty()) {
                            hashMap.remove(Long.valueOf(j11));
                        }
                    }
                }
                String str5 = b3cVar.getMessagesController().l4.K2.f;
                if (!"alternative".equals(str5) && !"system".equals(str5)) {
                    TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                    int i4 = tL_messages_translateText.flags;
                    if (z11) {
                        tL_messages_translateText.flags = i4 | 2;
                        tL_messages_translateText.text.addAll(x2cVar.c);
                    } else {
                        tL_messages_translateText.flags = i4 | 1;
                        tL_messages_translateText.peer = b3cVar.getMessagesController().i1(j11);
                        tL_messages_translateText.id = x2cVar.b;
                    }
                    tL_messages_translateText.to_lang = b3c.D(x2cVar.e);
                    int sendRequest = b3cVar.getConnectionsManager().sendRequest(tL_messages_translateText, new rt0(b3cVar, x2cVar, z11, j11, hashSet2, (byte) 6));
                    synchronized (b3cVar) {
                        x2cVar.h = sendRequest;
                    }
                    return;
                }
                String str6 = x2cVar.e;
                while (i < x2cVar.b.size()) {
                    String str7 = str6;
                    s1c.D0(((TLRPC.TL_textWithEntities) x2cVar.c.get(i)).text, null, str7, new n2c(b3cVar, (nac) x2cVar.d.get(i), z11, ((Integer) x2cVar.b.get(i)).intValue(), str6, j11, (byte) 0));
                    i++;
                    str6 = str7;
                }
                return;
        }
    }

    public ut0(nz1 nz1Var, qu3 qu3Var, String str, TLRPC.Document document, long j, boolean z) {
        this.a = (byte) 1;
        this.d = nz1Var;
        this.e = qu3Var;
        this.f = str;
        this.h = document;
        this.b = j;
        this.c = z;
    }

    public ut0(g95 g95Var, he[] heVarArr, boolean z, TLRPC.TL_error tL_error, long j, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.a = (byte) 2;
        this.d = g95Var;
        this.f = heVarArr;
        this.c = z;
        this.e = tL_error;
        this.b = j;
        this.h = invitetogroupcall;
    }

    public ut0(a66 a66Var, TLObject tLObject, long j, String str, boolean z, TLRPC.TL_error tL_error) {
        this.a = (byte) 3;
        this.d = a66Var;
        this.f = tLObject;
        this.b = j;
        this.h = str;
        this.c = z;
        this.e = tL_error;
    }

    public ut0(a58 a58Var, oc7 oc7Var, long j, boolean z, String str, TLObject tLObject) {
        this.a = (byte) 5;
        this.d = a58Var;
        this.e = oc7Var;
        this.b = j;
        this.c = z;
        this.h = str;
        this.f = tLObject;
    }

    public ut0(sp8 sp8Var, long j, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z, nk3 nk3Var) {
        this.a = (byte) 6;
        this.d = sp8Var;
        this.b = j;
        this.e = tL_chatAdminRights;
        this.f = str;
        this.c = z;
        this.h = nk3Var;
    }

    public ut0(au0 au0Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, long j) {
        this.a = (byte) 0;
        this.d = au0Var;
        this.e = tL_error;
        this.f = tLObject;
        this.h = twoStepVerificationActivity;
        this.c = z;
        this.b = j;
    }

    public ut0(qwb qwbVar, TLObject tLObject, boolean z, long j, HashSet hashSet, n40 n40Var) {
        this.a = (byte) 9;
        this.d = qwbVar;
        this.f = tLObject;
        this.c = z;
        this.b = j;
        this.e = hashSet;
        this.h = n40Var;
    }

    public ut0(b3c b3cVar, HashMap hashMap, long j, x2c x2cVar, boolean z, HashSet hashSet) {
        this.a = (byte) 10;
        this.d = b3cVar;
        this.e = hashMap;
        this.b = j;
        this.f = x2cVar;
        this.c = z;
        this.h = hashSet;
    }

    public ut0(Object obj, Object obj2, Object obj3, long j, Object obj4, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = j;
        this.h = obj4;
        this.c = z;
    }
}
