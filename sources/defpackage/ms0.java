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
public final class ms0 implements Runnable {
    public final byte a;
    public final long b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public ms0(g2b g2bVar, TLRPC.TL_error tL_error, boolean z, long j, p8c p8cVar, wjb wjbVar) {
        this.a = (byte) 8;
        this.d = g2bVar;
        this.e = tL_error;
        this.c = z;
        this.b = j;
        this.f = p8cVar;
        this.h = wjbVar;
    }

    @Override
    public final void run() {
        gm gmVar;
        SpannableStringBuilder T2;
        byte b = 0;
        int i = 0;
        switch (this.a) {
            case 0:
                ss0 ss0Var = (ss0) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject = (TLObject) this.f;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.h;
                boolean z = this.c;
                long j = this.b;
                ss0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.e0(password);
                    ss0Var.o0(z, j, twoStepVerificationActivity.d0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                gt3 gt3Var = (gt3) this.e;
                String str = (String) this.f;
                TLRPC.Document document = (TLRPC.Document) this.h;
                long j2 = this.b;
                boolean z2 = this.c;
                ChatActivityEnterView chatActivityEnterView = ((ay1) this.d).a;
                if (gt3Var != null) {
                    int selectionEnd = gt3Var.getSelectionEnd();
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
                                gmVar = new gm(document, gt3Var.getPaint().getFontMetricsInt());
                            } else {
                                gmVar = new gm(j2, gt3Var.getPaint().getFontMetricsInt());
                            }
                            if (!z2) {
                                gmVar.fromEmojiKeyboard = true;
                            }
                            gmVar.cacheType = vl.f();
                            spannableString.setSpan(gmVar, 0, spannableString.length(), 33);
                            gt3Var.setText(gt3Var.getText().insert(selectionEnd, spannableString));
                            gt3Var.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                        return;
                    } finally {
                        chatActivityEnterView.I3 = (byte) 0;
                    }
                }
                return;
            case 2:
                h75 h75Var = (h75) this.d;
                hd[] hdVarArr = (hd[]) this.f;
                boolean z3 = this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                long j3 = this.b;
                TL_phone.inviteToGroupCall invitetogroupcall = (TL_phone.inviteToGroupCall) this.h;
                try {
                    hdVarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                hdVarArr[0] = null;
                if (z3 && "USER_NOT_PARTICIPANT".equals(tL_error2.text)) {
                    h75Var.r1(null, j3, 3);
                    return;
                } else {
                    ij.c0(h75Var.a, tL_error2, (d) h75Var.b2.N().getFragmentStack().get(h75Var.b2.N().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
                    return;
                }
            case 3:
                a46 a46Var = (a46) this.d;
                TLObject tLObject2 = (TLObject) this.f;
                long j4 = this.b;
                String str2 = (String) this.h;
                boolean z4 = this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.e;
                int i2 = a46Var.b;
                a46Var.c();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    na7.q1(i2).a4(tL_contacts_resolvedPeer.users, false);
                    na7.q1(i2).U3(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(tL_contacts_resolvedPeer.peer.user_id));
                    if (V1 != null) {
                        qpc qpcVar = new qpc(V1);
                        qpcVar.s = j4;
                        qpcVar.h0 = str2;
                        qpcVar.i0 = z4;
                        qpcVar.g0 = true;
                        a46Var.u(qpcVar, false);
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    a46.d().g0(tL_error3, false);
                    return;
                } else {
                    return;
                }
            case 4:
                na7 na7Var = (na7) this.d;
                TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers = (TLRPC.TL_channels_sendAsPeers) this.e;
                vf6 vf6Var = (vf6) this.f;
                long j5 = this.b;
                ja7 ja7Var = (ja7) this.h;
                boolean z5 = this.c;
                if (tL_channels_sendAsPeers == null) {
                    vf6Var.l(j5);
                    return;
                }
                SystemClock.elapsedRealtime();
                ja7Var.a = tL_channels_sendAsPeers;
                na7Var.getNotificationCenter().k(16, Long.valueOf(j5), tL_channels_sendAsPeers, Boolean.valueOf(z5));
                return;
            case 5:
                y28 y28Var = (y28) this.d;
                final na7 na7Var2 = (na7) this.e;
                final long j6 = this.b;
                final boolean z6 = this.c;
                String str3 = (String) this.h;
                TLObject tLObject3 = (TLObject) this.f;
                na7Var2.M1().l0(j6, z6, false);
                lv6 lv6Var = new lv6((byte) 10, false);
                lv6Var.b = new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r5;
                        boolean z7 = z6;
                        long j7 = j6;
                        na7 na7Var3 = na7Var2;
                        switch (b2) {
                            case 0:
                                na7Var3.M1().l0(j7, !z7, false);
                                return;
                            default:
                                na7Var3.M1().l0(j7, z7, true);
                                return;
                        }
                    }
                };
                lv6Var.c = new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r5;
                        boolean z7 = z6;
                        long j7 = j6;
                        na7 na7Var3 = na7Var2;
                        switch (b2) {
                            case 0:
                                na7Var3.M1().l0(j7, !z7, false);
                                return;
                            default:
                                na7Var3.M1().l0(j7, z7, true);
                                return;
                        }
                    }
                };
                if (!z6) {
                    T2 = gl.T2(k96.a0(null, null, 2131744521, qu2.m(10, str3, null)));
                } else {
                    T2 = gl.T2(k96.a0(null, null, 2131744522, qu2.m(10, str3, null)));
                }
                m21 V = new u21(y28Var.T0, y28Var.r0).V(Arrays.asList(tLObject3), T2, null, lv6Var);
                V.a = (byte) 2;
                V.k(true);
                return;
            case 6:
                rn8 rn8Var = (rn8) this.d;
                long j7 = this.b;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.e;
                String str4 = (String) this.f;
                boolean z7 = this.c;
                ProfileActivity profileActivity = rn8Var.b;
                zc2 zc2Var = new zc2(profileActivity.e1, -j7, tL_chatAdminRights, null, null, str4, 2, true, !z7, null);
                zc2Var.Y0 = new qn8(rn8Var, (cj3) this.h);
                profileActivity.presentFragment(zc2Var);
                return;
            case 7:
                gta gtaVar = (gta) this.d;
                p8c p8cVar = (p8c) this.e;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f;
                long j8 = this.b;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                boolean z8 = this.c;
                if (!gtaVar.e) {
                    gta.c("NO_BALANCE");
                    p8cVar.a(null);
                    return;
                }
                gtaVar.E(starGift, j8, tL_textWithEntities, z8, p8cVar);
                return;
            case 8:
                g2b g2bVar = (g2b) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                boolean z9 = this.c;
                long j9 = this.b;
                p8c p8cVar2 = (p8c) this.f;
                wjb wjbVar = (wjb) this.h;
                if (tL_error4 != null) {
                    if (tL_error4.text.contains("BOOSTS_REQUIRED")) {
                        if (z9) {
                            na7 q1 = na7.q1(g2bVar.a);
                            q1.E0().a(j9, new s0c(g2bVar, p8cVar2, q1, j9, (byte) 9));
                            return;
                        }
                        p8cVar2.a(Boolean.FALSE);
                        return;
                    } else if (tL_error4.text.startsWith("STORY_LIVE_ALREADY_")) {
                        d Q = LaunchActivity.Q();
                        if (z9 && Q != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, Q.getContext());
                            alertDialog$Builder.a.S = k96.M0(2131748634, null);
                            alertDialog$Builder.a.U = k96.M0(2131748635, null);
                            b00.t(null, 2131747638, alertDialog$Builder, null);
                        }
                        p8cVar2.a(Boolean.FALSE);
                        return;
                    } else if (tL_error4.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        d Q2 = LaunchActivity.Q();
                        if (z9 && Q2 != null) {
                            Q2.showDialog(new jh8(Q2, 14, true));
                        }
                        p8cVar2.a(Boolean.FALSE);
                        return;
                    } else {
                        u21 Y = u21.Y();
                        if (Y != null) {
                            Y.g0(tL_error4, false);
                        }
                        p8cVar2.a(Boolean.FALSE);
                        return;
                    }
                }
                p8cVar2.a(Boolean.TRUE);
                return;
            case 9:
                pub pubVar = (pub) this.d;
                TLObject tLObject4 = (TLObject) this.f;
                boolean z10 = this.c;
                long j10 = this.b;
                HashSet hashSet = (HashSet) this.e;
                n30 n30Var = (n30) this.h;
                if (tLObject4 != null) {
                    if (z10) {
                        vf6 vf6Var2 = new vf6();
                        TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject4;
                        ArrayList m = mm4.m(tL_messages_savedDialogs.dialogs);
                        for (int i3 = 0; i3 < tL_messages_savedDialogs.messages.size(); i3++) {
                            vf6Var2.k(tL_messages_savedDialogs.messages.get(i3), tL_messages_savedDialogs.messages.get(i3).id);
                        }
                        gl.d3(new rp6(pubVar, tL_messages_savedDialogs, j10, m, vf6Var2, hashSet, n30Var));
                        return;
                    }
                    vf6 vf6Var3 = new vf6();
                    TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject4;
                    while (b < tL_messages_forumTopics.messages.size()) {
                        vf6Var3.k(tL_messages_forumTopics.messages.get(b), tL_messages_forumTopics.messages.get(b).id);
                        b++;
                    }
                    gl.d3(new fl1(pubVar, tLObject4, j10, tL_messages_forumTopics, vf6Var3, n30Var, (byte) 6));
                    return;
                }
                return;
            default:
                b1c b1cVar = (b1c) this.d;
                HashMap hashMap = (HashMap) this.e;
                long j11 = this.b;
                x0c x0cVar = (x0c) this.f;
                boolean z11 = this.c;
                HashSet hashSet2 = (HashSet) this.h;
                synchronized (b1cVar) {
                    ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(j11));
                    if (arrayList != null) {
                        arrayList.remove(x0cVar);
                        if (arrayList.isEmpty()) {
                            hashMap.remove(Long.valueOf(j11));
                        }
                    }
                }
                String str5 = b1cVar.getMessagesController().k4.K2.f;
                if (!"alternative".equals(str5) && !"system".equals(str5)) {
                    TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
                    int i4 = tL_messages_translateText.flags;
                    if (z11) {
                        tL_messages_translateText.flags = i4 | 2;
                        tL_messages_translateText.text.addAll(x0cVar.c);
                    } else {
                        tL_messages_translateText.flags = i4 | 1;
                        tL_messages_translateText.peer = b1cVar.getMessagesController().h1(j11);
                        tL_messages_translateText.id = x0cVar.b;
                    }
                    tL_messages_translateText.to_lang = b1c.D(x0cVar.e);
                    int sendRequest = b1cVar.getConnectionsManager().sendRequest(tL_messages_translateText, new js0(b1cVar, x0cVar, z11, j11, hashSet2, (byte) 6));
                    synchronized (b1cVar) {
                        x0cVar.h = sendRequest;
                    }
                    return;
                }
                String str6 = x0cVar.e;
                while (i < x0cVar.b.size()) {
                    String str7 = str6;
                    rzb.D0(((TLRPC.TL_textWithEntities) x0cVar.c.get(i)).text, null, str7, new n0c(b1cVar, (m8c) x0cVar.d.get(i), z11, ((Integer) x0cVar.b.get(i)).intValue(), str6, j11, (byte) 0));
                    i++;
                    str6 = str7;
                }
                return;
        }
    }

    public ms0(ay1 ay1Var, gt3 gt3Var, String str, TLRPC.Document document, long j, boolean z) {
        this.a = (byte) 1;
        this.d = ay1Var;
        this.e = gt3Var;
        this.f = str;
        this.h = document;
        this.b = j;
        this.c = z;
    }

    public ms0(h75 h75Var, hd[] hdVarArr, boolean z, TLRPC.TL_error tL_error, long j, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.a = (byte) 2;
        this.d = h75Var;
        this.f = hdVarArr;
        this.c = z;
        this.e = tL_error;
        this.b = j;
        this.h = invitetogroupcall;
    }

    public ms0(a46 a46Var, TLObject tLObject, long j, String str, boolean z, TLRPC.TL_error tL_error) {
        this.a = (byte) 3;
        this.d = a46Var;
        this.f = tLObject;
        this.b = j;
        this.h = str;
        this.c = z;
        this.e = tL_error;
    }

    public ms0(y28 y28Var, na7 na7Var, long j, boolean z, String str, TLObject tLObject) {
        this.a = (byte) 5;
        this.d = y28Var;
        this.e = na7Var;
        this.b = j;
        this.c = z;
        this.h = str;
        this.f = tLObject;
    }

    public ms0(rn8 rn8Var, long j, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z, cj3 cj3Var) {
        this.a = (byte) 6;
        this.d = rn8Var;
        this.b = j;
        this.e = tL_chatAdminRights;
        this.f = str;
        this.c = z;
        this.h = cj3Var;
    }

    public ms0(ss0 ss0Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, long j) {
        this.a = (byte) 0;
        this.d = ss0Var;
        this.e = tL_error;
        this.f = tLObject;
        this.h = twoStepVerificationActivity;
        this.c = z;
        this.b = j;
    }

    public ms0(pub pubVar, TLObject tLObject, boolean z, long j, HashSet hashSet, n30 n30Var) {
        this.a = (byte) 9;
        this.d = pubVar;
        this.f = tLObject;
        this.c = z;
        this.b = j;
        this.e = hashSet;
        this.h = n30Var;
    }

    public ms0(b1c b1cVar, HashMap hashMap, long j, x0c x0cVar, boolean z, HashSet hashSet) {
        this.a = (byte) 10;
        this.d = b1cVar;
        this.e = hashMap;
        this.b = j;
        this.f = x0cVar;
        this.c = z;
        this.h = hashSet;
    }

    public ms0(Object obj, Object obj2, Object obj3, long j, Object obj4, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = j;
        this.h = obj4;
        this.c = z;
    }
}
