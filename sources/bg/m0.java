package bg;

import a8.la;
import ai.c1;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import c8.ia;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.clearcut.y0;
import di.y8;
import fi.a8;
import fi.f7;
import fi.y7;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.fc;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.hx;
import org.telegram.messenger.j2;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.mr;
import org.telegram.messenger.np;
import org.telegram.messenger.r1;
import org.telegram.messenger.r10;
import org.telegram.messenger.si;
import org.telegram.messenger.t3;
import org.telegram.messenger.ur;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.i50;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.rh;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.a1;
import org.telegram.ui.bh;
import org.telegram.ui.c21;
import org.telegram.ui.e4;
import org.telegram.ui.ei0;
import org.telegram.ui.f3;
import org.telegram.ui.gi0;
import org.telegram.ui.ii;
import org.telegram.ui.j9;
import org.telegram.ui.m60;
import org.telegram.ui.p40;
import org.telegram.ui.p50;
import org.telegram.ui.qr;
import org.telegram.ui.wc1;
import org.telegram.ui.wf0;
import org.telegram.ui.xs0;
import p4.e1;
import p4.i1;
import p4.k1;
import p4.o1;
import v4.f1;
public final class m0 implements Runnable {
    public final int f3331a;
    public final Object f3332b;
    public final int f3333c;
    public final Object d;
    public final Object f3334e;
    public final Object f3335f;
    public final Object h;

    public m0(int i7, int i10, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f3331a = i10;
        this.f3332b = tLObject;
        this.f3333c = i7;
        this.d = obj;
        this.f3334e = obj2;
        this.f3335f = obj3;
        this.h = obj4;
    }

    @Override
    public final void run() {
        ?? r11;
        f1 T;
        int i7 = this.f3331a;
        char c10 = 2;
        final int i10 = this.f3333c;
        int i11 = 0;
        boolean z10 = false;
        r6 = false;
        boolean z11 = false;
        int i12 = 0;
        Object obj = this.f3334e;
        Object obj2 = this.h;
        Object obj3 = this.f3335f;
        Object obj4 = this.d;
        Object obj5 = this.f3332b;
        switch (i7) {
            case 0:
                TLObject tLObject = (TLObject) obj5;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) obj4;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) obj;
                bh bhVar = (bh) obj3;
                r4 r4Var = (r4) obj2;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    np.u1(i10).f4(tL_photos_photo.users, false);
                    TLRPC.User c22 = np.u1(i10).c2(Long.valueOf(k10.i(i10).f24987n));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && c22 != null) {
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
                            String n11 = a8.p0.n(w10.location.local_id, "@50_50", sb3);
                            r11 = 1;
                            fc.D().S(n10, n11, gc.l(i10, 1, c22));
                        } else {
                            r11 = 1;
                        }
                        if (w11 != null && photoSize2 != null && photoSize2.location != null) {
                            w7.G(i10);
                            File J2 = w7.J(w11, null, r11, r11);
                            w7.G(i10);
                            w7.J(photoSize2.location, null, r11, r11).renameTo(J2);
                        }
                        n0.a(tL_photos_photo.photo, c22, false);
                        k10.i(i10).w(c22);
                        k10.i(i10).v(r11);
                        bhVar.run();
                        lc.b0(r4Var.getLastFragment()).V(Collections.singletonList(c22), org.telegram.messenger.g0.W2(hd.N0(2131754216, null)), org.telegram.messenger.g0.T2(hd.N0(2131754217, null), new c1(i10, r4Var, (int) r11)), null).j();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLObject tLObject2 = (TLObject) obj5;
                w2[] w2VarArr = (w2[]) obj;
                h6 h6Var = (h6) obj3;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) obj2;
                ((hi.e) obj4).setLoading(false);
                if (tLObject2 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject2;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new lc(w2VarArr[0].F, h6Var).t(hd.N0(2131743634, null), null).k(false);
                        return;
                    }
                    final long j3 = tL_starsSubscriptionPricing.amount;
                    y8.y(i10, false).h0(tL_messages_checkChatInvite.hash, chatInvite, new r10() {
                        @Override
                        public final void a(Object obj6, Object obj7) {
                            Long l10 = (Long) obj7;
                            if ("paid".equals((String) obj6) && l10.longValue() != 0) {
                                org.telegram.messenger.g0.g3(new c9(l10, i10, j3, 0));
                            }
                        }
                    });
                    return;
                }
                new lc(w2VarArr[0].F, h6Var).t(hd.N0(2131748720, null), null).k(false);
                return;
            case 2:
                a8.a((a8) obj4, (TLObject) obj5, this.f3334e, (ArrayList) obj3, (boolean[]) obj2, this.f3333c);
                return;
            case 3:
                t3 t3Var = (t3) obj4;
                TLObject tLObject3 = (TLObject) obj5;
                di.h hVar = (di.h) obj;
                ArrayList arrayList = (ArrayList) obj3;
                HashSet hashSet = (HashSet) obj2;
                HashSet hashSet2 = t3Var.f26960n;
                ArrayList arrayList2 = t3Var.f26952e;
                if (t3Var.G.remove(Integer.valueOf(i10))) {
                    if (tLObject3 != null) {
                        TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject3;
                        np.u1(t3Var.C.f23202a).f4(groupparticipants.users, false);
                        np.u1(t3Var.C.f23202a).Z3(groupparticipants.chats, false);
                        int size = groupparticipants.participants.size();
                        int i13 = 0;
                        while (i13 < size) {
                            TLRPC.GroupCallParticipant groupCallParticipant = groupparticipants.participants.get(i13);
                            long B1 = gj.B1(groupCallParticipant.peer);
                            char c11 = c10;
                            TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) t3Var.d.f(B1);
                            if (groupCallParticipant2 != null) {
                                arrayList2.remove(groupCallParticipant2);
                                t3Var.n(groupCallParticipant2, false);
                            }
                            t3Var.d.k(groupCallParticipant, B1);
                            arrayList2.add(groupCallParticipant);
                            t3Var.n(groupCallParticipant, true);
                            if (hashSet2.contains(Long.valueOf(B1))) {
                                Long valueOf = Long.valueOf(B1);
                                hashSet2.remove(valueOf);
                                t3Var.f26956j.remove(valueOf);
                            }
                            i13++;
                            c10 = c11;
                        }
                        char c12 = c10;
                        if (t3Var.f26950b.participants_count < t3Var.d.m()) {
                            t3Var.f26950b.participants_count = t3Var.d.m();
                        }
                        t3Var.z();
                        ls f10 = ls.f(t3Var.C.f23202a);
                        Long valueOf2 = Long.valueOf(t3Var.f26951c);
                        Long valueOf3 = Long.valueOf(t3Var.f26950b.f28444id);
                        Object[] objArr = new Object[3];
                        objArr[0] = valueOf2;
                        objArr[1] = valueOf3;
                        objArr[c12] = Boolean.FALSE;
                        f10.k(166, objArr);
                        if (hVar != null) {
                            ((VoIPService) hVar.f8921c).lambda$createGroupInstance$69(hVar.f8920b, (int[]) hVar.d, arrayList);
                        } else {
                            t3Var.w();
                        }
                    }
                    hashSet.removeAll(arrayList);
                    return;
                }
                return;
            case 4:
                si siVar = (si) obj5;
                boolean[] zArr = (boolean[]) obj4;
                ArrayList arrayList3 = (ArrayList) obj;
                Context context = (Context) obj3;
                g2 g2Var = (g2) obj2;
                siVar.getClass();
                if (!zArr[0]) {
                    zArr[0] = true;
                    while (i11 < arrayList3.size()) {
                        Context context2 = context;
                        si siVar2 = siVar;
                        siVar2.m2(context2, 0, g2Var, null, true, (TLObject) arrayList3.get(i11), ((TLRPC.TL_messages_stickerSet) arrayList3.get(i11)).set, null, this.f3333c, false);
                        i11++;
                        siVar = siVar2;
                        context = context2;
                    }
                    return;
                }
                return;
            case 5:
                p50 p50Var = (p50) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject4 = (TLObject) obj5;
                a1 a1Var = (a1) obj2;
                p50Var.f50757r = false;
                if (!((e4) obj).f47126e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject4;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            np.u1(i10).f4(tL_contacts_resolvedPeer.users, false);
                            np.u1(i10).Z3(tL_contacts_resolvedPeer.chats, false);
                            ur.a0(i10).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            p50Var.f50756n = chat;
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
                t1 t1Var = (t1) obj4;
                Context context3 = (Context) obj;
                h6 h6Var2 = (h6) obj3;
                p40 p40Var = (p40) obj2;
                boolean z12 = tLObject5 instanceof TLRPC.Updates;
                int i14 = this.f3333c;
                if (z12) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject5;
                    np.u1(i14).f4(updates.users, false);
                    np.u1(i14).Z3(updates.chats, false);
                    ArrayList B0 = np.B0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = B0.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i12 < size2) {
                        Object obj6 = B0.get(i12);
                        i12++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj6).call;
                    }
                    t1Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f28451id = groupCall.f28444id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        j9.n0(context3, i14, tL_inputGroupCall, groupCall.invite_link, h6Var2, true, true);
                        org.telegram.messenger.g0.g3(p40Var);
                        return;
                    }
                    return;
                } else if (tLObject5 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject5;
                    np.u1(i14).f4(groupcall.users, false);
                    np.u1(i14).Z3(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f28451id = groupCall2.f28444id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i14).sendRequest(exportgroupcallinvite, new hx(t1Var, context3, i14, exportgroupcallinvite, h6Var2, p40Var));
                    return;
                } else {
                    t1Var.dismiss();
                    org.telegram.messenger.g0.g3(p40Var);
                    return;
                }
            case 7:
                new c21((Context) obj5, (TLRPC.Chat) obj4, (TLRPC.User) obj, new ii(i10, (mr) obj3, 3), (h6) obj2).show();
                return;
            case 8:
                p9.a((p9) obj5, (Runnable[]) obj4, (Bitmap) obj, (i50) obj3, this.f3333c, (ia[]) obj2);
                return;
            case 9:
                ff0 ff0Var = (ff0) obj4;
                TLObject tLObject6 = (TLObject) obj5;
                ArrayList arrayList4 = (ArrayList) obj3;
                TLRPC.PollAnswerVoters pollAnswerVoters = (TLRPC.PollAnswerVoters) obj2;
                bf0 bf0Var = ff0Var.n1;
                ArrayList arrayList5 = ff0Var.f35228x1;
                ze0 ze0Var = ff0Var.f35218m1;
                ArrayList arrayList6 = ff0Var.A1;
                arrayList6.remove(((Integer[]) obj)[i10]);
                if (tLObject6 != null) {
                    TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject6;
                    np.u1(ff0Var.f30173a).f4(tL_messages_votesList.users, false);
                    if (!tL_messages_votesList.votes.isEmpty()) {
                        arrayList4.add(new ef0(tL_messages_votesList, pollAnswerVoters.option));
                    }
                    if (arrayList6.isEmpty()) {
                        int size3 = arrayList4.size();
                        boolean z13 = false;
                        for (int i15 = 0; i15 < size3; i15++) {
                            ef0 ef0Var = (ef0) arrayList4.get(i15);
                            int size4 = arrayList5.size();
                            int i16 = 0;
                            while (true) {
                                if (i16 < size4) {
                                    ef0 ef0Var2 = (ef0) arrayList5.get(i16);
                                    if (Arrays.equals(ef0Var.d, ef0Var2.d)) {
                                        ef0Var2.f34783c = ef0Var.f34783c;
                                        z13 = (ef0Var2.f34781a == ef0Var.f34781a && ef0Var2.f34782b.size() == ef0Var.f34782b.size()) ? true : true;
                                        ef0Var2.f34781a = ef0Var.f34781a;
                                        ef0Var2.f34782b = ef0Var.f34782b;
                                    } else {
                                        i16++;
                                    }
                                }
                            }
                        }
                        ff0Var.G1 = false;
                        if (ze0Var != null) {
                            if (ff0Var.B0 == 0 && ff0Var.H == null && !z13) {
                                int childCount = ze0Var.getChildCount();
                                ArrayList arrayList7 = new ArrayList();
                                for (int i17 = 0; i17 < childCount; i17++) {
                                    View childAt = ze0Var.getChildAt(i17);
                                    if (childAt instanceof PollVotesAlert$UserCell) {
                                        View F = ze0Var.F(childAt);
                                        if (F == null) {
                                            T = null;
                                        } else {
                                            T = ze0Var.T(F);
                                        }
                                        if (T != null) {
                                            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                            pollVotesAlert$UserCell.E = arrayList7;
                                            pollVotesAlert$UserCell.setEnabled(true);
                                            bf0Var.y(T);
                                            pollVotesAlert$UserCell.E = null;
                                        }
                                    }
                                }
                                if (!arrayList7.isEmpty()) {
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(arrayList7);
                                    animatorSet.setDuration(180L);
                                    animatorSet.start();
                                }
                                ff0Var.G1 = false;
                                return;
                            }
                            if (z13) {
                                ff0Var.M0();
                            }
                            bf0Var.X(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ff0Var.dismiss();
                return;
            case 10:
                qr.c0((qr) obj4, (TLRPC.FileLocation) obj, (TLRPC.InputFile) obj3, (TLObject) obj5, (TLRPC.FileLocation) obj2, this.f3333c);
                return;
            case 11:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj5;
                String[] strArr = (String[]) obj4;
                Context context4 = (Context) obj;
                ei0 ei0Var = (ei0) obj3;
                g2 g2Var2 = (g2) obj2;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    gi0.c(context4, this.f3333c, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new rh(22, strArr, ei0Var), true, new j2(0), g2Var2.getResourceProvider());
                    return;
                } else {
                    ei0Var.run();
                    return;
                }
            case 12:
                g2 g2Var3 = (g2) obj4;
                List<Purchase> list = (List) obj;
                y0 y0Var = (y0) obj3;
                xs0 xs0Var = (xs0) obj2;
                if (((f5.f) obj5).f11315a == 0) {
                    wf0 wf0Var = new wf0(1, g2Var3);
                    int i18 = this.f3333c;
                    if (list != null && !list.isEmpty() && !k10.i(i18).q()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f6144a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (y0Var != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i18).sendRequest(tL_payments_assignPlayMarketTransaction, new y7(i18, wf0Var, g2Var3, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    r1.i().d("telegram_premium", new f3(wf0Var, 5));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (y0Var != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i18).sendRequest(tL_payments_canPurchaseStore, new hx(i18, 5, g2Var3, xs0Var, y0Var, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    return;
                }
                return;
            case 13:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj4;
                org.telegram.ui.web.s0 s0Var = (org.telegram.ui.web.s0) obj;
                f7 f7Var = (f7) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                boolean z14 = ((TLObject) obj5) instanceof TLRPC.TL_boolTrue;
                int i19 = this.f3333c;
                if (z14) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.v0.w(i19, s0Var, f7Var, "write_access_requested", jSONObject);
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                } else if (tL_error2 != null) {
                    v0Var.Z(tL_error2.text);
                    return;
                } else {
                    String[] strArr2 = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v0Var.getContext());
                    String N0 = hd.N0(2131752886, null);
                    t1 t1Var2 = alertDialog$Builder.f28777a;
                    t1Var2.S = N0;
                    t1Var2.U = hd.N0(2131752887, null);
                    alertDialog$Builder.k(hd.N0(2131752897, null), new wc1(2, v0Var, strArr2));
                    alertDialog$Builder.h(hd.N0(2131752892, null), new m60(23));
                    v0Var.Y(3, t1Var2, new org.telegram.ui.web.u(strArr2, i19, s0Var, f7Var, 1));
                    return;
                }
            default:
                e1 e1Var = (e1) obj5;
                p4.v vVar = (p4.v) obj4;
                k1 k1Var = (k1) obj;
                String str = k1Var.f55368b;
                p4.e0 e0Var = (p4.e0) obj3;
                int i20 = this.f3333c;
                p4.l lVar = (p4.l) obj2;
                ab.c0 c0Var = e1Var.f55256b;
                if (c0Var.A(vVar)) {
                    try {
                        p4.d d = p4.d.d(k1Var);
                        Object obj7 = d.f55225g;
                        int i21 = d.f55221b;
                        if (!d.b()) {
                            h2.a.l("MediaSessionStub", "Can't execute predefined custom command: " + str);
                            e1.r1(e0Var, vVar, i20, new o1(-6));
                            return;
                        }
                        k1 k1Var2 = d.f55220a;
                        if (k1Var2 != null) {
                            if (k1Var2.f55367a == 40010) {
                                z10 = true;
                            }
                            la.p(z10);
                            e1Var.j1(lVar, i20, null, 40010, new p4.v0(new p4.y0(d), 1));
                            return;
                        }
                        i1 i1Var = e0Var.f55249t;
                        if (i21 == 1) {
                            if (obj7 == null) {
                                if (!i1Var.u()) {
                                    z11 = true;
                                }
                            } else {
                                z11 = ((Boolean) obj7).booleanValue();
                            }
                        }
                        if (z11) {
                            e1Var.o1(vVar, i20);
                        } else if (i21 == 31) {
                            obj7.getClass();
                            e1Var.q1(vVar, i20, 31, new p4.v0(new wc1(9, new ab.z(9, (e2.l0) obj7, true), new p4.r0(20)), 1));
                        } else {
                            e1Var.q1(vVar, i20, i21, e1.s1(new p4.y0(d)));
                        }
                        c0Var.l(vVar);
                        return;
                    } catch (RuntimeException e11) {
                        h2.a.m("MediaSessionStub", "Failed to convert predefined custom command: " + str, e11);
                        e1.r1(e0Var, vVar, i20, new o1(-3));
                        return;
                    }
                }
                return;
        }
    }

    public m0(a8 a8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i7) {
        this.f3331a = 2;
        this.d = a8Var;
        this.f3332b = tLObject;
        this.f3334e = obj;
        this.f3335f = arrayList;
        this.h = zArr;
        this.f3333c = i7;
    }

    public m0(hi.e eVar, TLObject tLObject, w2[] w2VarArr, h6 h6Var, int i7, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.f3331a = 1;
        this.d = eVar;
        this.f3332b = tLObject;
        this.f3334e = w2VarArr;
        this.f3335f = h6Var;
        this.f3333c = i7;
        this.h = tL_messages_checkChatInvite;
    }

    public m0(Object obj, Object obj2, Object obj3, int i7, Object obj4, Object obj5, int i10) {
        this.f3331a = i10;
        this.f3332b = obj;
        this.d = obj2;
        this.f3334e = obj3;
        this.f3333c = i7;
        this.f3335f = obj4;
        this.h = obj5;
    }

    public m0(Object obj, Object obj2, Object obj3, Object obj4, int i7, Object obj5, int i10) {
        this.f3331a = i10;
        this.f3332b = obj;
        this.d = obj2;
        this.f3334e = obj3;
        this.f3335f = obj4;
        this.f3333c = i7;
        this.h = obj5;
    }

    public m0(t3 t3Var, int i7, TLObject tLObject, di.h hVar, ArrayList arrayList, HashSet hashSet) {
        this.f3331a = 3;
        this.d = t3Var;
        this.f3333c = i7;
        this.f3332b = tLObject;
        this.f3334e = hVar;
        this.f3335f = arrayList;
        this.h = hashSet;
    }

    public m0(si siVar, boolean[] zArr, ArrayList arrayList, Context context, g2 g2Var, int i7) {
        this.f3331a = 4;
        this.f3332b = siVar;
        this.d = zArr;
        this.f3334e = arrayList;
        this.f3335f = context;
        this.h = g2Var;
        this.f3333c = i7;
    }

    public m0(ff0 ff0Var, Integer[] numArr, int i7, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f3331a = 9;
        this.d = ff0Var;
        this.f3334e = numArr;
        this.f3333c = i7;
        this.f3332b = tLObject;
        this.f3335f = arrayList;
        this.h = pollAnswerVoters;
    }

    public m0(qr qrVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i7) {
        this.f3331a = 10;
        this.d = qrVar;
        this.f3334e = fileLocation;
        this.f3335f = inputFile;
        this.f3332b = tLObject;
        this.h = fileLocation2;
        this.f3333c = i7;
    }

    public m0(p50 p50Var, e4 e4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7, a1 a1Var) {
        this.f3331a = 5;
        this.d = p50Var;
        this.f3334e = e4Var;
        this.f3335f = tL_error;
        this.f3332b = tLObject;
        this.f3333c = i7;
        this.h = a1Var;
    }

    public m0(org.telegram.ui.web.v0 v0Var, TLObject tLObject, int i7, org.telegram.ui.web.s0 s0Var, f7 f7Var, TLRPC.TL_error tL_error) {
        this.f3331a = 13;
        this.d = v0Var;
        this.f3332b = tLObject;
        this.f3333c = i7;
        this.f3334e = s0Var;
        this.f3335f = f7Var;
        this.h = tL_error;
    }
}
