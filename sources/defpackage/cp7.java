package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImportingService;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;
import org.telegram.ui.v;
public final class cp7 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public cp7(fs8 fs8Var, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = (byte) 14;
        this.b = fs8Var;
        this.e = str;
        this.c = arrayList;
        this.d = arrayList2;
        this.f = arrayList3;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cp7.a():void");
    }

    @Override
    public final void run() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        x53 x53Var;
        long j;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        kcb kcbVar;
        int i3;
        ed8 ed8Var;
        String str;
        vnb vnbVar;
        String y;
        float f;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        p pVar = null;
        p pVar2 = null;
        p pVar3 = null;
        switch (this.a) {
            case 0:
                ((ip7) this.b).C((ArrayList) this.c, (zh6) this.e, (ArrayList) this.d, (Collection) this.f);
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                ge7 ge7Var = (ge7) this.d;
                um4 um4Var = (um4) this.e;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) this.f;
                b18 b18Var = ((m08) this.b).a;
                if (tL_error != null) {
                    i = ((e) b18Var).currentAccount;
                    jj.c0(i, tL_error, b18Var, verifyemail, new Object[0]);
                    um4Var.Z(null, null);
                    return;
                }
                b18Var.C1.c(b18Var.F, (String) b18Var.t1.get("email"), null, null, null, null, null, null, null, null, ge7Var, um4Var);
                return;
            case 2:
                x08 x08Var = (x08) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                Bundle bundle = (Bundle) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) this.f;
                x08Var.K = false;
                b18 b18Var2 = x08Var.R;
                if (tL_error2 != null) {
                    i2 = ((e) b18Var2).currentAccount;
                    id c0 = jj.c0(i2, tL_error2, b18Var2, tL_auth_resendCode, new Object[0]);
                    if (c0 != null && tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                        c0.n0 = new t08(x08Var, (byte) 1);
                    }
                } else {
                    b18Var2.e1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                }
                b18Var2.A1();
                return;
            case 3:
                ((p) this.b).m0((TLRPC.TL_error) this.c, (TLObject) this.d, (String) this.e, (TL_account.getPassword) this.f);
                return;
            case 4:
                o68 o68Var = (o68) this.b;
                n3b n3bVar = (n3b) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                u9b u9bVar = (u9b) this.f;
                u58 u58Var = o68Var.M0;
                x53 x53Var2 = o68Var.l0;
                if (n3bVar != null) {
                    n3bVar.run();
                }
                if (tL_error3 != null && !"STORY_NOT_MODIFIED".equals(tL_error3.text)) {
                    bs2.v(null, 2131743534, new d31(u58Var, x53Var2), 2131624012, 36);
                    z4 = false;
                } else {
                    storyItem.parsedPrivacy = u9bVar;
                    ArrayList arrayList = u9bVar.b;
                    int i4 = u9bVar.a;
                    ArrayList arrayList2 = u9bVar.c;
                    ArrayList<TLRPC.PrivacyRule> arrayList3 = new ArrayList<>();
                    int i5 = 0;
                    while (i5 < arrayList.size()) {
                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList.get(i5);
                        if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowAll) {
                            arrayList3.add(new TLRPC.TL_privacyValueAllowAll());
                        } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowCloseFriends) {
                            arrayList3.add(new TLRPC.TL_privacyValueAllowCloseFriends());
                        } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowContacts) {
                            arrayList3.add(new TLRPC.TL_privacyValueAllowContacts());
                        } else {
                            if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule;
                                TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = new TLRPC.TL_privacyValueDisallowUsers();
                                int i6 = 0;
                                while (i6 < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                    i6 = dze.c(i6, 1, tL_inputPrivacyValueDisallowUsers.users.get(i6).user_id, tL_privacyValueDisallowUsers.users);
                                    x53Var2 = x53Var2;
                                }
                                x53Var = x53Var2;
                                arrayList3.add(tL_privacyValueDisallowUsers);
                            } else {
                                x53Var = x53Var2;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    for (int i7 = 0; i7 < tL_inputPrivacyValueAllowUsers.users.size(); i7 = dze.c(i7, 1, tL_inputPrivacyValueAllowUsers.users.get(i7).user_id, tL_privacyValueAllowUsers.users)) {
                                    }
                                    arrayList3.add(tL_privacyValueAllowUsers);
                                }
                            }
                            i5++;
                            x53Var2 = x53Var;
                        }
                        x53Var = x53Var2;
                        i5++;
                        x53Var2 = x53Var;
                    }
                    x53 x53Var3 = x53Var2;
                    storyItem.privacy = arrayList3;
                    if (i4 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    storyItem.close_friends = z;
                    if (i4 == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    storyItem.contacts = z2;
                    if (i4 == 3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    storyItem.selected_contacts = z3;
                    uc7.s1(o68Var.m2).O1().s0(storyItem.dialogId, storyItem, true);
                    o68Var.L3 = true;
                    if (i4 == 4) {
                        new d31(u58Var, x53Var3).Q(2131623990, 36, ob6.N0("StorySharedToEveryone")).j();
                    } else if (i4 == 1) {
                        new d31(u58Var, x53Var3).Q(2131623990, 36, ob6.N0("StorySharedToCloseFriends")).j();
                    } else if (i4 == 2) {
                        if (arrayList2.isEmpty()) {
                            new d31(u58Var, x53Var3).Q(2131623990, 36, ob6.N0("StorySharedToAllContacts")).j();
                        } else {
                            new d31(u58Var, x53Var3).Q(2131623990, 36, ob6.G(arrayList2.size(), "StorySharedToAllContactsExcluded", new Object[0])).j();
                        }
                    } else if (i4 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList2);
                        for (ArrayList arrayList4 : u9bVar.d.values()) {
                            hashSet.addAll(arrayList4);
                        }
                        d31 d31Var = new d31(u58Var, x53Var3);
                        int size = hashSet.size();
                        z4 = false;
                        d31Var.Q(2131623990, 36, ob6.G(size, "StorySharedToContacts", new Object[0])).j();
                    }
                    z4 = false;
                }
                o68Var.c1(z4);
                return;
            case 5:
                og3 og3Var = (og3) this.b;
                pg3 pg3Var = (pg3) this.c;
                Long l = (Long) this.d;
                sbb sbbVar = (sbb) this.e;
                Runnable runnable = (Runnable) this.f;
                if (og3Var == null) {
                    og3Var = pg3Var.e(l.longValue());
                }
                sbbVar.X(nbb.c(og3Var));
                runnable.run();
                return;
            case 6:
                long j2 = 0;
                j68 j68Var = (j68) this.b;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                lcb lcbVar = (lcb) this.e;
                m68 m68Var = (m68) this.f;
                sbb C = sbb.C((Activity) this.c, j68Var.x.m2);
                d30 d30Var = j68Var.x.w2;
                if (d30Var != null && (kcbVar = (kcb) d30Var.c) != null) {
                    j = kcbVar.currentPosition;
                } else {
                    j = 0;
                }
                c8b n = c8b.n(j68Var.x.y1.f(), j68Var.x.y1.a);
                o68 o68Var2 = j68Var.x;
                n.e = o68Var2.l1;
                TL_stories.StoryItem storyItem3 = o68Var2.y1.a;
                if (storyItem3 != null && (messageMedia = storyItem3.media) != null && (document = messageMedia.document) != null) {
                    int i8 = 0;
                    while (true) {
                        if (i8 < document.attributes.size()) {
                            if (document.attributes.get(i8) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i8);
                            } else {
                                i8++;
                            }
                        }
                    }
                    if (tL_documentAttributeVideo != null) {
                        j2 = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                    }
                }
                n.e0 = j2;
                c8b g = n.g();
                g.b0 = true;
                o68 o68Var3 = j68Var.x;
                TL_stories.StoryItem storyItem4 = o68Var3.y1.a;
                g.c0 = storyItem4.media.document;
                g.d0 = new w58(j68Var, storyItem4, storyItem2, (byte) 1);
                if (o68Var3.A0()) {
                    o68 o68Var4 = j68Var.x;
                    g.J0 = o68Var4.l1;
                    g.L0 = uc7.n5(o68Var4.y1.a.media);
                    v5b v5bVar = lcbVar.O0;
                    if (v5bVar instanceof p5b) {
                        g.K0 = ((p5b) v5bVar).E;
                    }
                }
                C.R(nbb.d(lcbVar), g, j);
                C.R = new a68(j68Var, (byte) 1);
                C.S = new b68(j68Var, m68Var, (byte) 0);
                return;
            case 7:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) this.d;
                ArrayList arrayList5 = (ArrayList) this.c;
                Integer num = (Integer) this.e;
                ed8 ed8Var2 = (ed8) this.f;
                PhotoViewer photoViewer = ((v) this.b).r;
                photoViewer.o4 = null;
                ad8 ad8Var = photoViewer.f0;
                if (ad8Var != null && photoViewer.h0 != null) {
                    ad8Var.setLayerType(0, null);
                    photoViewer.m4 = (byte) 0;
                    photoViewer.H0();
                    photoViewer.n4 = 0L;
                    photoViewer.H1 = null;
                    photoViewer.F1.a = false;
                    photoViewer.I1 = null;
                    photoViewer.G1.a = false;
                    photoViewer.M1();
                    photoViewer.I1();
                    photoViewer.f0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    fd8 fd8Var = photoViewer.p4;
                    if (fd8Var != null) {
                        fd8Var.a.v0(true, true);
                    }
                    fd8 fd8Var2 = photoViewer.q4;
                    if (fd8Var2 != null && !fd8Var2.s) {
                        fd8Var2.a.v0(false, true);
                    }
                    if (arrayList5 != null && (i3 = photoViewer.d2) != 3 && i3 != 1 && ((ed8Var = photoViewer.d) == null || !ed8Var.P())) {
                        photoViewer.W0();
                    }
                    kfc kfcVar = photoViewer.G2;
                    if (kfcVar != null && kfcVar.c0() && photoViewer.s1 && !photoViewer.f7.isEmpty()) {
                        photoViewer.B1(photoViewer.G2.S());
                        photoViewer.q1(true);
                    }
                    if (photoViewer.s4) {
                        photoViewer.G0(num.intValue());
                    }
                    if (ed8Var2 != null) {
                        ed8Var2.e();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                boolean[] zArr = (boolean[]) this.d;
                TLRPC.GlobalPrivacySettings globalPrivacySettings = (TLRPC.GlobalPrivacySettings) this.e;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = (TL_account.setGlobalPrivacySettings) this.f;
                if (tL_error4 != null) {
                    privacyControlActivity.L0();
                    return;
                }
                zArr[1] = true;
                if (globalPrivacySettings != null) {
                    TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
                    globalPrivacySettings.new_noncontact_peers_require_premium = globalPrivacySettings2.new_noncontact_peers_require_premium;
                    int i9 = globalPrivacySettings2.flags;
                    globalPrivacySettings.flags = i9;
                    globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
                    long j3 = globalPrivacySettings2.noncontact_peers_paid_stars;
                    if (j3 > 0) {
                        globalPrivacySettings.flags = i9 | 32;
                        globalPrivacySettings.noncontact_peers_paid_stars = j3;
                    } else {
                        globalPrivacySettings.flags = i9 & (-33);
                        globalPrivacySettings.noncontact_peers_paid_stars = 0L;
                    }
                }
                if (zArr[0]) {
                    privacyControlActivity.B0();
                }
                privacyControlActivity.getNotificationCenter().k(48, new Object[0]);
                return;
            case 9:
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.d;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.e;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.f;
                PrivacyControlActivity privacyControlActivity2 = ((mn8) this.b).d;
                if (((TLObject) this.c) instanceof TLRPC.TL_boolTrue) {
                    v21 Q = d31.b0(privacyControlActivity2).Q(2131623990, 36, ob6.M0(2131746585, null));
                    Q.j = 5000;
                    Q.j();
                    return;
                }
                if (userFull != null) {
                    int i10 = userFull.flags2;
                    if (tL_birthday == null) {
                        userFull.flags2 = i10 & (-33);
                    } else {
                        userFull.flags2 = i10 | 32;
                    }
                    userFull.birthday = tL_birthday;
                    privacyControlActivity2.getMessagesStorage().l2(userFull, false);
                }
                if (tL_error5 != null && (str = tL_error5.text) != null && str.startsWith("FLOOD_WAIT_")) {
                    if (privacyControlActivity2.getParentActivity() != null) {
                        Activity parentActivity = privacyControlActivity2.getParentActivity();
                        vnbVar = ((e) privacyControlActivity2).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, parentActivity);
                        alertDialog$Builder.a.S = ob6.M0(2131746581, null);
                        alertDialog$Builder.a.U = ob6.M0(2131746582, null);
                        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                        privacyControlActivity2.showDialog(alertDialog$Builder.a);
                        return;
                    }
                    return;
                }
                bs2.v(null, 2131743534, d31.b0(privacyControlActivity2), 2131624012, 36);
                return;
            case 10:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                cp8 cp8Var = (cp8) this.f;
                RectF rectF = ProfileActivity.Z6;
                if (!(((TLRPC.ChannelParticipant) this.c) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    cp8Var.a(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                alertDialog$Builder2.a.S = ob6.M0(2131689472, null);
                alertDialog$Builder2.a.U = ob6.a0(null, null, 2131754343, lv2.m(0, user.first_name, user.last_name));
                alertDialog$Builder2.j(ob6.M0(2131747558, null), new jz7(cp8Var, (byte) 18));
                alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                profileActivity.showDialog(alertDialog$Builder2.a);
                return;
            case 11:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                uq8 uq8Var = (uq8) this.e;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.f;
                RectF rectF2 = ProfileActivity.Z6;
                if (tLObject2 instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject2;
                    if (profileActivity2.e1 != 0) {
                        profileActivity2.getMessagesController().X1(Long.valueOf(profileActivity2.e1));
                    } else {
                        profileActivity2.getMessagesController().M0(Long.valueOf(profileActivity2.f1));
                    }
                    String str2 = "@" + tL_username.username;
                    String format = ob6.D0().n0().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String e = di0.h().e(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String e2 = di0.h().e(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    d31 d31Var2 = new d31(uq8Var.w1, profileActivity2.A0);
                    if (TextUtils.isEmpty(e2)) {
                        y = "";
                    } else {
                        y = qd4.y("(", e2, ")");
                    }
                    v21 w = d31Var2.w(2131231184, hl.X3(hl.S2(ob6.a0(null, null, 2131750480, str2, format, e, y)), new ep8(profileActivity2, tL_collectibleInfo, (byte) 3)));
                    uv5 uv5Var = new uv5(profileActivity2, tL_collectibleInfo, (byte) 26);
                    z11 z11Var = w.e;
                    if (z11Var != null) {
                        z11Var.setOnClickListener(uv5Var);
                    }
                    w.k(false);
                    return;
                }
                d31.e0(tL_error6);
                return;
            case 12:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                String str3 = (String) this.d;
                TLRPC.User user2 = (TLRPC.User) this.e;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.f;
                RectF rectF3 = ProfileActivity.Z6;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    br4.a(profileActivity3.getParentActivity(), 1, str3, user2, (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity3.A0);
                    return;
                } else {
                    d31.e0(tL_error7);
                    return;
                }
            case 13:
                RectF rectF4 = ProfileActivity.Z6;
                ((ProfileActivity) this.b).D2((TLObject) this.c, (TLRPC.UserFull) this.d, (TL_account.TL_birthday) this.e, (TLRPC.TL_error) this.f);
                return;
            case 14:
                fs8 fs8Var = (fs8) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.f;
                e eVar = fs8Var.e;
                if (((String) this.e).equals(fs8Var.E)) {
                    if (!fs8Var.x && (eVar instanceof ProfileActivity)) {
                        try {
                            ((ProfileActivity) eVar).P.b.getImageReceiver().w0(false);
                            ((ProfileActivity) eVar).P.d.setText(ob6.M0(2131745204, null));
                        } catch (Exception e3) {
                            cc4.g(e3, true);
                        }
                    }
                    fs8Var.x = true;
                    fs8Var.r = arrayList6;
                    fs8Var.s = arrayList7;
                    fs8Var.n = arrayList8;
                    fs8Var.f();
                    if (eVar instanceof ProfileActivity) {
                        try {
                            ((ProfileActivity) eVar).P.b.getImageReceiver().w0(false);
                            return;
                        } catch (Exception e4) {
                            cc4.g(e4, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                b19 b19Var = (b19) this.b;
                a19 a19Var = (a19) this.e;
                r47 r47Var = (r47) this.f;
                int i11 = b19Var.a;
                uc7.s1(i11).j4((ArrayList) this.c, true);
                uc7.s1(i11).c4((ArrayList) this.d, true);
                a19Var.e = r47Var;
                if (r47Var != null) {
                    r47Var.l(a19Var.a, a19Var.b);
                }
                b19Var.l();
                jn7.f(i11).k(122, new Object[0]);
                return;
            case 16:
                b19 b19Var2 = (b19) this.b;
                TLObject tLObject4 = (TLObject) this.d;
                ArrayList<Integer> arrayList9 = (ArrayList) this.c;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.f;
                if (tLObject4 instanceof TLRPC.TL_messages_messages) {
                    ArrayList<TLRPC.Message> arrayList10 = ((TLRPC.TL_messages_messages) tLObject4).messages;
                    arrayList9.clear();
                    int size2 = arrayList10.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        TLRPC.Message message = arrayList10.get(i12);
                        i12++;
                        arrayList9.add(Integer.valueOf(message.id));
                    }
                    tL_messages_sendQuickReplyMessages.id = arrayList9;
                    for (int i13 = 0; i13 < arrayList9.size(); i13++) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                    }
                    ConnectionsManager.getInstance(b19Var2.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    return;
                }
                cc4.d("received " + tLObject4 + " " + tL_error8 + " on getQuickReplyMessages when trying to send quick reply");
                return;
            case 17:
                b19 b19Var3 = (b19) this.b;
                Runnable runnable2 = (Runnable) this.f;
                b19Var3.e = false;
                int i14 = b19Var3.a;
                uc7.s1(i14).j4((ArrayList) this.c, true);
                uc7.s1(i14).c4((ArrayList) this.d, true);
                ArrayList arrayList11 = b19Var3.b;
                arrayList11.clear();
                arrayList11.addAll((ArrayList) this.e);
                if (runnable2 != null) {
                    runnable2.run();
                } else {
                    b19Var3.i(null, false);
                }
                jn7.f(i14).k(122, new Object[0]);
                return;
            case 18:
                ((n1a) this.b).o((View) this.c, Long.valueOf(((hm) this.d).documentId), (TLRPC.Document) this.e, ((w0a) this.f).w, null);
                return;
            case 19:
                b2a b2aVar = (b2a) this.b;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
                TLRPC.User user3 = (TLRPC.User) this.f;
                if (tL_error9 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject5;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.e0(password);
                    b2aVar.Z0(user3, twoStepVerificationActivity.d0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 20:
                e39 e39Var = (e39) this.e;
                ArrayList arrayList12 = new ArrayList();
                arrayList12.add((TLRPC.User) this.c);
                z3a z3aVar = ((l3a) this.b).b;
                lv2.r(z3aVar.w).i(arrayList12, false);
                new d31(z3aVar, z3aVar.s).Q(2131624050, 36, ob6.a0(null, null, 2131751431, (String) this.d)).j();
                if (z3aVar.b((TL_stories.StoryView) this.f)) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                e39Var.a(true, f);
                return;
            case 21:
                a5a a5aVar = (a5a) this.b;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) this.d;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.e;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) this.f;
                int i15 = a5aVar.T1;
                e eVar2 = a5aVar.r1;
                if (((TLObject) this.c) instanceof TLRPC.TL_boolTrue) {
                    di0 h = di0.h();
                    Activity parentActivity2 = eVar2.getParentActivity();
                    k5 a = k5.a(i15);
                    qx6 qx6Var = new qx6((byte) 7, false);
                    qx6Var.O(a5aVar.Z1.h);
                    h.k(parentActivity2, a, tL_inputStorePaymentGiftPremium, Collections.singletonList(qx6Var.g()));
                    return;
                } else if (tL_error10 != null) {
                    jj.c0(i15, tL_error10, eVar2, tL_payments_canPurchaseStore, new Object[0]);
                    return;
                } else {
                    return;
                }
            case 22:
                r7a r7aVar = (r7a) this.b;
                m7a m7aVar = (m7a) this.c;
                HashMap hashMap = (HashMap) this.d;
                String str4 = (String) this.e;
                e4b e4bVar = (e4b) this.f;
                if (((k7a) m7aVar.d.get(0)).f != null) {
                    m7aVar.b();
                } else {
                    r7aVar.F.putAll(hashMap);
                    r7aVar.G.put(str4, m7aVar);
                    r7a r7aVar2 = m7aVar.o;
                    r7aVar2.getNotificationCenter().k(112, m7aVar.e);
                    m7aVar.l = SystemClock.elapsedRealtime();
                    ArrayList arrayList13 = m7aVar.d;
                    int size3 = arrayList13.size();
                    for (int i16 = 0; i16 < size3; i16++) {
                        r7aVar2.getFileLoader().h0(false, 67108864, ((k7a) arrayList13.get(i16)).a, true);
                    }
                    r7aVar.getNotificationCenter().k(111, str4);
                    e4bVar.a(str4);
                }
                try {
                    a.b.startService(new Intent(a.b, ImportingService.class));
                    return;
                } catch (Throwable th) {
                    cc4.g(th, true);
                    return;
                }
            case 23:
                r7a r7aVar3 = (r7a) this.b;
                d7a d7aVar = (d7a) this.c;
                TLRPC.Document document2 = (TLRPC.Document) this.e;
                r47 r47Var2 = (r47) this.f;
                d7aVar.l = null;
                d7aVar.m.k.attachPath = ((File) this.d).toString();
                if (!document2.thumbs.isEmpty()) {
                    TLRPC.PhotoSize photoSize = document2.thumbs.get(0);
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize)) {
                        d7aVar.g = photoSize;
                        d7aVar.h = document2;
                    }
                }
                ArrayList arrayList14 = new ArrayList();
                arrayList14.add(r47Var2.k);
                r7aVar3.getMessagesStorage().k1(arrayList14, false, true, false, 0, false, r47Var2.r1 ? 1 : 0, 0L);
                d7aVar.p = true;
                r7aVar3.L(d7aVar, -1);
                r7aVar3.getNotificationCenter().k(49, d7aVar.m.k);
                return;
            case 24:
                r7a r7aVar4 = (r7a) this.b;
                File file = (File) this.c;
                hl.c3(new z87(r7aVar4, r7aVar4.z(file.toString(), null, false), (r47) this.d, file, (d7a) this.e, (String) this.f));
                return;
            case 25:
                jxa jxaVar = (jxa) this.b;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) this.c;
                qe2 qe2Var = (qe2) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error11 != null) {
                    qe2Var.a(Boolean.FALSE, tL_error11.text);
                    return;
                }
                if (tLObject6 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject6;
                    paymentForm.invoice.recurring = true;
                    uc7.s1(jxaVar.a).j4(paymentForm.users, false);
                    pVar3 = new p(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject6 instanceof TLRPC.PaymentReceipt) {
                    pVar3 = new p((TLRPC.PaymentReceipt) tLObject6);
                }
                if (pVar3 != null) {
                    pVar3.a1 = new hja(qe2Var, (byte) 9);
                    e Q2 = LaunchActivity.Q();
                    if (Q2 != 0) {
                        if (hl.s1(Q2)) {
                            ?? obj = new Object();
                            obj.a = true;
                            Q2.showAsSheet(pVar3, obj);
                            return;
                        }
                        Q2.presentFragment(pVar3);
                        return;
                    }
                    return;
                }
                qe2Var.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                return;
            case 26:
                jxa jxaVar2 = (jxa) this.b;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) this.c;
                iv4 iv4Var = (iv4) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error12 != null) {
                    iv4Var.a(Boolean.FALSE, tL_error12.text);
                    return;
                }
                if (tLObject7 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject7;
                    paymentForm2.invoice.recurring = true;
                    uc7.s1(jxaVar2.a).j4(paymentForm2.users, false);
                    pVar2 = new p(paymentForm2, tL_inputInvoiceStars2, null);
                } else if (tLObject7 instanceof TLRPC.PaymentReceipt) {
                    pVar2 = new p((TLRPC.PaymentReceipt) tLObject7);
                }
                if (pVar2 != null) {
                    pVar2.a1 = new hja(iv4Var, (byte) 8);
                    e Q3 = LaunchActivity.Q();
                    if (Q3 != 0) {
                        if (hl.s1(Q3)) {
                            ?? obj2 = new Object();
                            obj2.a = true;
                            Q3.showAsSheet(pVar2, obj2);
                            return;
                        }
                        Q3.presentFragment(pVar2);
                        return;
                    }
                    return;
                }
                iv4Var.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                return;
            case 27:
                ((boolean[]) this.c)[0] = true;
                ((jxa) this.b).Z((String) this.d, (TLRPC.ChatInvite) this.e, new j25((icc) this.f, (byte) 1));
                return;
            case 28:
                a();
                return;
            default:
                jxa jxaVar3 = (jxa) this.b;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) this.c;
                icc iccVar = (icc) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars3 = (TLRPC.TL_inputInvoiceStars) this.f;
                if (tL_error13 != null) {
                    iccVar.a(Boolean.FALSE, tL_error13.text);
                    return;
                }
                if (tLObject8 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm3 = (TLRPC.PaymentForm) tLObject8;
                    paymentForm3.invoice.recurring = true;
                    uc7.s1(jxaVar3.a).j4(paymentForm3.users, false);
                    pVar = new p(paymentForm3, tL_inputInvoiceStars3, null);
                } else if (tLObject8 instanceof TLRPC.PaymentReceipt) {
                    pVar = new p((TLRPC.PaymentReceipt) tLObject8);
                }
                if (pVar != null) {
                    pVar.a1 = new hja(iccVar, (byte) 7);
                    e Q4 = LaunchActivity.Q();
                    if (Q4 != 0) {
                        if (hl.s1(Q4)) {
                            ?? obj3 = new Object();
                            obj3.a = true;
                            Q4.showAsSheet(pVar, obj3);
                            return;
                        }
                        Q4.presentFragment(pVar);
                        return;
                    }
                    return;
                }
                iccVar.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                return;
        }
    }

    public cp7(ip7 ip7Var, ArrayList arrayList, zh6 zh6Var, ArrayList arrayList2, Collection collection) {
        this.a = (byte) 0;
        this.b = ip7Var;
        this.c = arrayList;
        this.e = zh6Var;
        this.d = arrayList2;
        this.f = collection;
    }

    public cp7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public cp7(Object obj, Object obj2, ArrayList arrayList, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = arrayList;
        this.e = obj3;
        this.f = obj4;
    }
}
