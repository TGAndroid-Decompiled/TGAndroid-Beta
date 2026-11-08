package bg;

import a8.ia;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import bi.ea;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.clearcut.z0;
import di.i8;
import di.k8;
import di.o7;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.nx;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.qs;
import org.telegram.messenger.r1;
import org.telegram.messenger.r3;
import org.telegram.messenger.ui;
import org.telegram.messenger.v10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w7;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.u40;
import org.telegram.ui.a1;
import org.telegram.ui.a21;
import org.telegram.ui.bh;
import org.telegram.ui.bi0;
import org.telegram.ui.e4;
import org.telegram.ui.f3;
import org.telegram.ui.go0;
import org.telegram.ui.i9;
import org.telegram.ui.m40;
import org.telegram.ui.nr;
import org.telegram.ui.o50;
import org.telegram.ui.tf0;
import org.telegram.ui.web.x0;
import org.telegram.ui.ws0;
import org.telegram.ui.zh0;
import p4.c1;
import p4.g1;
import p4.i1;
import p4.m1;
import v4.d1;
public final class l0 implements Runnable {
    public final int f3346a;
    public final Object f3347b;
    public final int f3348c;
    public final Object d;
    public final Object f3349e;
    public final Object f3350f;
    public final Object h;

    public l0(int i7, int i10, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f3346a = i10;
        this.f3347b = tLObject;
        this.f3348c = i7;
        this.d = obj;
        this.f3349e = obj2;
        this.f3350f = obj3;
        this.h = obj4;
    }

    @Override
    public final void run() {
        boolean z9;
        d1 T;
        int i7 = this.f3346a;
        final int i10 = this.f3348c;
        int i11 = 0;
        boolean z10 = false;
        r6 = false;
        boolean z11 = false;
        int i12 = 0;
        Object obj = this.f3349e;
        Object obj2 = this.h;
        Object obj3 = this.f3350f;
        Object obj4 = this.d;
        Object obj5 = this.f3347b;
        switch (i7) {
            case 0:
                TLObject tLObject = (TLObject) obj5;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) obj4;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) obj;
                bh bhVar = (bh) obj3;
                q4 q4Var = (q4) obj2;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    qp.s1(i10).Y3(tL_photos_photo.users, false);
                    TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(p10.i(i10).f24489n));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && a22 != null) {
                        TLRPC.PhotoSize w10 = w7.w(photo.sizes, 100, false, null, false);
                        TLRPC.PhotoSize w11 = w7.w(tL_photos_photo.photo.sizes, 1000, false, null, false);
                        if (w10 != null && photoSize != null && photoSize.location != null) {
                            w7.G(i10);
                            File J = w7.J(w10, null, true, true);
                            w7.G(i10);
                            w7.J(photoSize.location, null, true, true).renameTo(J);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(photoSize.location.volume_id);
                            sb2.append("_");
                            String n10 = a8.p0.n(photoSize.location.local_id, "@50_50", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(w10.location.volume_id);
                            sb3.append("_");
                            z9 = true;
                            gc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), hc.l(i10, 1, a22));
                        } else {
                            z9 = true;
                        }
                        if (w11 != null && photoSize2 != null && photoSize2.location != null) {
                            w7.G(i10);
                            File J2 = w7.J(w11, null, z9, z9);
                            w7.G(i10);
                            w7.J(photoSize2.location, null, z9, z9).renameTo(J2);
                        }
                        n0.a(tL_photos_photo.photo, a22, false);
                        p10.i(i10).w(a22);
                        p10.i(i10).v(z9);
                        bhVar.run();
                        org.telegram.ui.Components.hc.a0(q4Var.getLastFragment()).V(Collections.singletonList(a22), org.telegram.messenger.g0.X2(id.M0(2131754219, null)), org.telegram.messenger.g0.U2(id.M0(2131754220, null), new m0(i10, q4Var, 0)), null).j();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLObject tLObject2 = (TLObject) obj5;
                v2[] v2VarArr = (v2[]) obj;
                f6 f6Var = (f6) obj3;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) obj2;
                ((fi.d) obj4).setLoading(false);
                if (tLObject2 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject2;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new org.telegram.ui.Components.hc(v2VarArr[0].E, f6Var).t(id.M0(2131743882, null), null).k(false);
                        return;
                    }
                    final long j3 = tL_starsSubscriptionPricing.amount;
                    ea.y(i10, false).h0(tL_messages_checkChatInvite.hash, chatInvite, new v10() {
                        @Override
                        public final void a(Object obj6, Object obj7) {
                            Long l10 = (Long) obj7;
                            if ("paid".equals((String) obj6) && l10.longValue() != 0) {
                                org.telegram.messenger.g0.h3(new ia(l10, i10, j3, 0));
                            }
                        }
                    });
                    return;
                }
                new org.telegram.ui.Components.hc(v2VarArr[0].E, f6Var).t(id.M0(2131748914, null), null).k(false);
                return;
            case 2:
                k8.a((k8) obj4, (TLObject) obj5, this.f3349e, (ArrayList) obj3, (boolean[]) obj2, this.f3348c);
                return;
            case 3:
                r3 r3Var = (r3) obj4;
                TLObject tLObject3 = (TLObject) obj5;
                bi.i iVar = (bi.i) obj;
                ArrayList arrayList = (ArrayList) obj3;
                HashSet hashSet = (HashSet) obj2;
                HashSet hashSet2 = r3Var.f25232n;
                ArrayList arrayList2 = r3Var.f25224e;
                if (r3Var.G.remove(Integer.valueOf(i10))) {
                    if (tLObject3 != null) {
                        TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject3;
                        qp.s1(r3Var.C.f21765a).Y3(groupparticipants.users, false);
                        qp.s1(r3Var.C.f21765a).S3(groupparticipants.chats, false);
                        int size = groupparticipants.participants.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            TLRPC.GroupCallParticipant groupCallParticipant = groupparticipants.participants.get(i13);
                            long C1 = ij.C1(groupCallParticipant.peer);
                            TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) r3Var.d.f(C1);
                            if (groupCallParticipant2 != null) {
                                arrayList2.remove(groupCallParticipant2);
                                r3Var.n(groupCallParticipant2, false);
                            }
                            r3Var.d.k(groupCallParticipant, C1);
                            arrayList2.add(groupCallParticipant);
                            r3Var.n(groupCallParticipant, true);
                            if (hashSet2.contains(Long.valueOf(C1))) {
                                Long valueOf = Long.valueOf(C1);
                                hashSet2.remove(valueOf);
                                r3Var.f25228j.remove(valueOf);
                            }
                        }
                        if (r3Var.f25222b.participants_count < r3Var.d.m()) {
                            r3Var.f25222b.participants_count = r3Var.d.m();
                        }
                        r3Var.z();
                        qs.f(r3Var.C.f21765a).k(166, Long.valueOf(r3Var.f25223c), Long.valueOf(r3Var.f25222b.f26966id), Boolean.FALSE);
                        if (iVar != null) {
                            ((VoIPService) iVar.f4020c).lambda$createGroupInstance$69(iVar.f4019b, (int[]) iVar.d, arrayList);
                        } else {
                            r3Var.w();
                        }
                    }
                    hashSet.removeAll(arrayList);
                    return;
                }
                return;
            case 4:
                ui uiVar = (ui) obj5;
                boolean[] zArr = (boolean[]) obj4;
                ArrayList arrayList3 = (ArrayList) obj;
                Context context = (Context) obj3;
                f2 f2Var = (f2) obj2;
                uiVar.getClass();
                if (!zArr[0]) {
                    zArr[0] = true;
                    while (i11 < arrayList3.size()) {
                        Context context2 = context;
                        ui uiVar2 = uiVar;
                        uiVar2.h2(context2, 0, f2Var, null, true, (TLObject) arrayList3.get(i11), ((TLRPC.TL_messages_stickerSet) arrayList3.get(i11)).set, null, this.f3348c, false);
                        i11++;
                        uiVar = uiVar2;
                        context = context2;
                    }
                    return;
                }
                return;
            case 5:
                o50 o50Var = (o50) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject4 = (TLObject) obj5;
                a1 a1Var = (a1) obj2;
                o50Var.f48272r = false;
                if (!((e4) obj).f45186e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject4;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            qp.s1(i10).Y3(tL_contacts_resolvedPeer.users, false);
                            qp.s1(i10).S3(tL_contacts_resolvedPeer.chats, false);
                            yr.a0(i10).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            o50Var.f48271n = chat;
                            if (chat.left && !chat.kicked) {
                                a1Var.a(0, false);
                                return;
                            } else {
                                a1Var.a(4, false);
                                return;
                            }
                        }
                        a1Var.a(4, false);
                        return;
                    }
                    a1Var.a(4, false);
                    return;
                }
                return;
            case 6:
                TLObject tLObject5 = (TLObject) obj5;
                u1 u1Var = (u1) obj4;
                Context context3 = (Context) obj;
                f6 f6Var2 = (f6) obj3;
                m40 m40Var = (m40) obj2;
                boolean z12 = tLObject5 instanceof TLRPC.Updates;
                int i14 = this.f3348c;
                if (z12) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject5;
                    qp.s1(i14).Y3(updates.users, false);
                    qp.s1(i14).S3(updates.chats, false);
                    ArrayList z02 = qp.z0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = z02.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i12 < size2) {
                        Object obj6 = z02.get(i12);
                        i12++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj6).call;
                    }
                    u1Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f26973id = groupCall.f26966id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        i9.n0(context3, i14, tL_inputGroupCall, groupCall.invite_link, f6Var2, true, true);
                        org.telegram.messenger.g0.h3(m40Var);
                        return;
                    }
                    return;
                } else if (tLObject5 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject5;
                    qp.s1(i14).Y3(groupcall.users, false);
                    qp.s1(i14).S3(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f26973id = groupCall2.f26966id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i14).sendRequest(exportgroupcallinvite, new nx(u1Var, context3, i14, exportgroupcallinvite, f6Var2, m40Var));
                    return;
                } else {
                    u1Var.dismiss();
                    org.telegram.messenger.g0.h3(m40Var);
                    return;
                }
            case 7:
                new a21((Context) obj5, (TLRPC.Chat) obj4, (TLRPC.User) obj, new m0(i10, (qr) obj3, 29), (f6) obj2).show();
                return;
            case 8:
                k9.a((k9) obj5, (Runnable[]) obj4, (Bitmap) obj, (u40) obj3, this.f3348c, (c8.ea[]) obj2);
                return;
            case 9:
                qe0 qe0Var = (qe0) obj4;
                TLObject tLObject6 = (TLObject) obj5;
                ArrayList arrayList4 = (ArrayList) obj3;
                TLRPC.PollAnswerVoters pollAnswerVoters = (TLRPC.PollAnswerVoters) obj2;
                me0 me0Var = qe0Var.f37300j1;
                ArrayList arrayList5 = qe0Var.f37308t1;
                ke0 ke0Var = qe0Var.f37299i1;
                ArrayList arrayList6 = qe0Var.f37311w1;
                arrayList6.remove(((Integer[]) obj)[i10]);
                if (tLObject6 != null) {
                    TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject6;
                    qp.s1(qe0Var.f28616a).Y3(tL_messages_votesList.users, false);
                    if (!tL_messages_votesList.votes.isEmpty()) {
                        arrayList4.add(new pe0(tL_messages_votesList, pollAnswerVoters.option));
                    }
                    if (arrayList6.isEmpty()) {
                        int size3 = arrayList4.size();
                        boolean z13 = false;
                        for (int i15 = 0; i15 < size3; i15++) {
                            pe0 pe0Var = (pe0) arrayList4.get(i15);
                            int size4 = arrayList5.size();
                            int i16 = 0;
                            while (true) {
                                if (i16 < size4) {
                                    pe0 pe0Var2 = (pe0) arrayList5.get(i16);
                                    if (Arrays.equals(pe0Var.d, pe0Var2.d)) {
                                        pe0Var2.f36913c = pe0Var.f36913c;
                                        z13 = (pe0Var2.f36911a == pe0Var.f36911a && pe0Var2.f36912b.size() == pe0Var.f36912b.size()) ? true : true;
                                        pe0Var2.f36911a = pe0Var.f36911a;
                                        pe0Var2.f36912b = pe0Var.f36912b;
                                    } else {
                                        i16++;
                                    }
                                }
                            }
                        }
                        qe0Var.C1 = false;
                        if (ke0Var != null) {
                            if (qe0Var.A0 == 0 && qe0Var.G == null && !z13) {
                                int childCount = ke0Var.getChildCount();
                                ArrayList arrayList7 = new ArrayList();
                                for (int i17 = 0; i17 < childCount; i17++) {
                                    View childAt = ke0Var.getChildAt(i17);
                                    if (childAt instanceof PollVotesAlert$UserCell) {
                                        View F = ke0Var.F(childAt);
                                        if (F == null) {
                                            T = null;
                                        } else {
                                            T = ke0Var.T(F);
                                        }
                                        if (T != null) {
                                            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                            pollVotesAlert$UserCell.D = arrayList7;
                                            pollVotesAlert$UserCell.setEnabled(true);
                                            me0Var.y(T);
                                            pollVotesAlert$UserCell.D = null;
                                        }
                                    }
                                }
                                if (!arrayList7.isEmpty()) {
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(arrayList7);
                                    animatorSet.setDuration(180L);
                                    animatorSet.start();
                                }
                                qe0Var.C1 = false;
                                return;
                            }
                            if (z13) {
                                qe0Var.L0();
                            }
                            me0Var.X(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                qe0Var.dismiss();
                return;
            case 10:
                nr.c0((nr) obj4, (TLRPC.FileLocation) obj, (TLRPC.InputFile) obj3, (TLObject) obj5, (TLRPC.FileLocation) obj2, this.f3348c);
                return;
            case 11:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj5;
                String[] strArr = (String[]) obj4;
                Context context4 = (Context) obj;
                zh0 zh0Var = (zh0) obj3;
                f2 f2Var2 = (f2) obj2;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    bi0.c(context4, this.f3348c, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new fx(18, strArr, zh0Var), true, new ai.m0(24), f2Var2.getResourceProvider());
                    return;
                } else {
                    zh0Var.run();
                    return;
                }
            case 12:
                f2 f2Var3 = (f2) obj4;
                List<Purchase> list = (List) obj;
                z0 z0Var = (z0) obj3;
                ws0 ws0Var = (ws0) obj2;
                if (((f5.f) obj5).f11151a == 0) {
                    tf0 tf0Var = new tf0(1, f2Var3);
                    int i18 = this.f3348c;
                    if (list != null && !list.isEmpty() && !p10.i(i18).q()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f6447a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (z0Var != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i18).sendRequest(tL_payments_assignPlayMarketTransaction, new i8(i18, tf0Var, f2Var3, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    r1.i().d("telegram_premium", new f3(tf0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (z0Var != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i18).sendRequest(tL_payments_canPurchaseStore, new nx(i18, 5, f2Var3, ws0Var, z0Var, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    return;
                }
                return;
            case 13:
                x0 x0Var = (x0) obj4;
                org.telegram.ui.web.u0 u0Var = (org.telegram.ui.web.u0) obj;
                o7 o7Var = (o7) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                boolean z14 = ((TLObject) obj5) instanceof TLRPC.TL_boolTrue;
                int i19 = this.f3348c;
                if (z14) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        x0.w(i19, u0Var, o7Var, "write_access_requested", jSONObject);
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                } else if (tL_error2 != null) {
                    x0Var.Z(tL_error2.text);
                    return;
                } else {
                    String[] strArr2 = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x0Var.getContext());
                    String M0 = id.M0(2131752898, null);
                    u1 u1Var2 = alertDialog$Builder.f27296a;
                    u1Var2.R = M0;
                    u1Var2.T = id.M0(2131752899, null);
                    alertDialog$Builder.k(id.M0(2131752909, null), new org.telegram.ui.web.a0(0, x0Var, strArr2));
                    alertDialog$Builder.h(id.M0(2131752904, null), new go0(17));
                    x0Var.Y(3, u1Var2, new org.telegram.ui.web.t(strArr2, i19, u0Var, o7Var, 1));
                    return;
                }
            default:
                c1 c1Var = (c1) obj5;
                p4.v vVar = (p4.v) obj4;
                i1 i1Var = (i1) obj;
                String str = i1Var.f53309b;
                p4.d0 d0Var = (p4.d0) obj3;
                int i20 = this.f3348c;
                p4.l lVar = (p4.l) obj2;
                ui.e eVar = c1Var.f53184b;
                if (eVar.D(vVar)) {
                    try {
                        p4.d d = p4.d.d(i1Var);
                        Object obj7 = d.f53200g;
                        int i21 = d.f53196b;
                        if (!d.b()) {
                            h2.a.l("MediaSessionStub", "Can't execute predefined custom command: " + str);
                            c1.r1(d0Var, vVar, i20, new m1(-6));
                            return;
                        }
                        i1 i1Var2 = d.f53195a;
                        if (i1Var2 != null) {
                            if (i1Var2.f53308a == 40010) {
                                z10 = true;
                            }
                            ia.p(z10);
                            c1Var.j1(lVar, i20, null, 40010, new p4.t0(new p4.w0(d), 1));
                            return;
                        }
                        g1 g1Var = d0Var.f53218t;
                        if (i21 == 1) {
                            if (obj7 == null) {
                                if (!g1Var.u()) {
                                    z11 = true;
                                }
                            } else {
                                z11 = ((Boolean) obj7).booleanValue();
                            }
                        }
                        if (z11) {
                            c1Var.o1(vVar, i20);
                        } else if (i21 == 31) {
                            obj7.getClass();
                            c1Var.q1(vVar, i20, 31, new p4.t0(new org.telegram.ui.web.a0(7, new ab.y(9, (e2.l0) obj7, true), new p4.r0(14)), 1));
                        } else {
                            c1Var.q1(vVar, i20, i21, c1.s1(new p4.w0(d)));
                        }
                        eVar.q(vVar);
                        return;
                    } catch (RuntimeException e11) {
                        h2.a.m("MediaSessionStub", "Failed to convert predefined custom command: " + str, e11);
                        c1.r1(d0Var, vVar, i20, new m1(-3));
                        return;
                    }
                }
                return;
        }
    }

    public l0(k8 k8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i7) {
        this.f3346a = 2;
        this.d = k8Var;
        this.f3347b = tLObject;
        this.f3349e = obj;
        this.f3350f = arrayList;
        this.h = zArr;
        this.f3348c = i7;
    }

    public l0(fi.d dVar, TLObject tLObject, v2[] v2VarArr, f6 f6Var, int i7, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.f3346a = 1;
        this.d = dVar;
        this.f3347b = tLObject;
        this.f3349e = v2VarArr;
        this.f3350f = f6Var;
        this.f3348c = i7;
        this.h = tL_messages_checkChatInvite;
    }

    public l0(Object obj, Object obj2, Object obj3, int i7, Object obj4, Object obj5, int i10) {
        this.f3346a = i10;
        this.f3347b = obj;
        this.d = obj2;
        this.f3349e = obj3;
        this.f3348c = i7;
        this.f3350f = obj4;
        this.h = obj5;
    }

    public l0(Object obj, Object obj2, Object obj3, Object obj4, int i7, Object obj5, int i10) {
        this.f3346a = i10;
        this.f3347b = obj;
        this.d = obj2;
        this.f3349e = obj3;
        this.f3350f = obj4;
        this.f3348c = i7;
        this.h = obj5;
    }

    public l0(r3 r3Var, int i7, TLObject tLObject, bi.i iVar, ArrayList arrayList, HashSet hashSet) {
        this.f3346a = 3;
        this.d = r3Var;
        this.f3348c = i7;
        this.f3347b = tLObject;
        this.f3349e = iVar;
        this.f3350f = arrayList;
        this.h = hashSet;
    }

    public l0(ui uiVar, boolean[] zArr, ArrayList arrayList, Context context, f2 f2Var, int i7) {
        this.f3346a = 4;
        this.f3347b = uiVar;
        this.d = zArr;
        this.f3349e = arrayList;
        this.f3350f = context;
        this.h = f2Var;
        this.f3348c = i7;
    }

    public l0(qe0 qe0Var, Integer[] numArr, int i7, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f3346a = 9;
        this.d = qe0Var;
        this.f3349e = numArr;
        this.f3348c = i7;
        this.f3347b = tLObject;
        this.f3350f = arrayList;
        this.h = pollAnswerVoters;
    }

    public l0(nr nrVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i7) {
        this.f3346a = 10;
        this.d = nrVar;
        this.f3349e = fileLocation;
        this.f3350f = inputFile;
        this.f3347b = tLObject;
        this.h = fileLocation2;
        this.f3348c = i7;
    }

    public l0(o50 o50Var, e4 e4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7, a1 a1Var) {
        this.f3346a = 5;
        this.d = o50Var;
        this.f3349e = e4Var;
        this.f3350f = tL_error;
        this.f3347b = tLObject;
        this.f3348c = i7;
        this.h = a1Var;
    }

    public l0(x0 x0Var, TLObject tLObject, int i7, org.telegram.ui.web.u0 u0Var, o7 o7Var, TLRPC.TL_error tL_error) {
        this.f3346a = 13;
        this.d = x0Var;
        this.f3347b = tLObject;
        this.f3348c = i7;
        this.f3349e = u0Var;
        this.f3350f = o7Var;
        this.h = tL_error;
    }
}
