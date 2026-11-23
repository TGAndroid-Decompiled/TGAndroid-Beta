package bg;

import a8.ma;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import c8.ja;
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
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.gx;
import org.telegram.messenger.i10;
import org.telegram.messenger.j2;
import org.telegram.messenger.ks;
import org.telegram.messenger.lr;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.r1;
import org.telegram.messenger.ri;
import org.telegram.messenger.t3;
import org.telegram.messenger.tr;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.a1;
import org.telegram.ui.a21;
import org.telegram.ui.ch;
import org.telegram.ui.ci0;
import org.telegram.ui.e4;
import org.telegram.ui.ei0;
import org.telegram.ui.f3;
import org.telegram.ui.ii;
import org.telegram.ui.j9;
import org.telegram.ui.l60;
import org.telegram.ui.o40;
import org.telegram.ui.p50;
import org.telegram.ui.qr;
import org.telegram.ui.uc1;
import org.telegram.ui.vf0;
import org.telegram.ui.ws0;
import p4.d1;
import p4.h1;
import p4.j1;
import p4.n1;
import p4.x0;
import v4.f1;
public final class m0 implements Runnable {
    public final int f3282a;
    public final Object f3283b;
    public final int f3284c;
    public final Object d;
    public final Object f3285e;
    public final Object f3286f;
    public final Object h;

    public m0(int i7, int i10, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f3282a = i10;
        this.f3283b = tLObject;
        this.f3284c = i7;
        this.d = obj;
        this.f3285e = obj2;
        this.f3286f = obj3;
        this.h = obj4;
    }

    @Override
    public final void run() {
        boolean z10;
        f1 T;
        int i7 = this.f3282a;
        char c10 = 2;
        final int i10 = this.f3284c;
        int i11 = 0;
        boolean z11 = false;
        r8 = false;
        boolean z12 = false;
        int i12 = 0;
        Object obj = this.f3285e;
        Object obj2 = this.h;
        Object obj3 = this.f3286f;
        Object obj4 = this.d;
        Object obj5 = this.f3283b;
        switch (i7) {
            case 0:
                TLObject tLObject = (TLObject) obj5;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) obj4;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) obj;
                ch chVar = (ch) obj3;
                r4 r4Var = (r4) obj2;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    mp.u1(i10).f4(tL_photos_photo.users, false);
                    TLRPC.User c22 = mp.u1(i10).c2(Long.valueOf(i10.i(i10).f24656n));
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
                            z10 = true;
                            ec.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), fc.l(i10, 1, c22));
                        } else {
                            z10 = true;
                        }
                        if (w11 != null && photoSize2 != null && photoSize2.location != null) {
                            w7.G(i10);
                            File J2 = w7.J(w11, null, z10, z10);
                            w7.G(i10);
                            w7.J(photoSize2.location, null, z10, z10).renameTo(J2);
                        }
                        n0.a(tL_photos_photo.photo, c22, false);
                        i10.i(i10).w(c22);
                        i10.i(i10).v(z10);
                        chVar.run();
                        kc.b0(r4Var.getLastFragment()).V(Collections.singletonList(c22), org.telegram.messenger.g0.W2(gd.N0(2131754216, null)), org.telegram.messenger.g0.T2(gd.N0(2131754217, null), new ai.u0(i10, r4Var, 2)), null).j();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLObject tLObject2 = (TLObject) obj5;
                w2[] w2VarArr = (w2[]) obj;
                i6 i6Var = (i6) obj3;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) obj2;
                ((hi.e) obj4).setLoading(false);
                if (tLObject2 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject2;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new kc(w2VarArr[0].F, i6Var).t(gd.N0(2131743632, null), null).k(false);
                        return;
                    }
                    final long j3 = tL_starsSubscriptionPricing.amount;
                    y8.y(i10, false).h0(tL_messages_checkChatInvite.hash, chatInvite, new p10() {
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
                new kc(w2VarArr[0].F, i6Var).t(gd.N0(2131748720, null), null).k(false);
                return;
            case 2:
                a8.a((a8) obj4, (TLObject) obj5, this.f3285e, (ArrayList) obj3, (boolean[]) obj2, this.f3284c);
                return;
            case 3:
                t3 t3Var = (t3) obj4;
                TLObject tLObject3 = (TLObject) obj5;
                di.h hVar = (di.h) obj;
                ArrayList arrayList = (ArrayList) obj3;
                HashSet hashSet = (HashSet) obj2;
                HashSet hashSet2 = t3Var.f27044n;
                ArrayList arrayList2 = t3Var.f27036e;
                if (t3Var.G.remove(Integer.valueOf(i10))) {
                    if (tLObject3 != null) {
                        TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject3;
                        mp.u1(t3Var.C.f23343a).f4(groupparticipants.users, false);
                        mp.u1(t3Var.C.f23343a).Z3(groupparticipants.chats, false);
                        int size = groupparticipants.participants.size();
                        int i13 = 0;
                        while (i13 < size) {
                            TLRPC.GroupCallParticipant groupCallParticipant = groupparticipants.participants.get(i13);
                            char c11 = c10;
                            int i14 = i13;
                            long B1 = fj.B1(groupCallParticipant.peer);
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
                                t3Var.f27040j.remove(valueOf);
                            }
                            i13 = i14 + 1;
                            c10 = c11;
                        }
                        char c12 = c10;
                        if (t3Var.f27034b.participants_count < t3Var.d.m()) {
                            t3Var.f27034b.participants_count = t3Var.d.m();
                        }
                        t3Var.z();
                        ks f10 = ks.f(t3Var.C.f23343a);
                        Long valueOf2 = Long.valueOf(t3Var.f27035c);
                        Long valueOf3 = Long.valueOf(t3Var.f27034b.f28502id);
                        Object[] objArr = new Object[3];
                        objArr[0] = valueOf2;
                        objArr[1] = valueOf3;
                        objArr[c12] = Boolean.FALSE;
                        f10.k(166, objArr);
                        if (hVar != null) {
                            ((VoIPService) hVar.f8882c).lambda$createGroupInstance$69(hVar.f8881b, (int[]) hVar.d, arrayList);
                        } else {
                            t3Var.w();
                        }
                    }
                    hashSet.removeAll(arrayList);
                    return;
                }
                return;
            case 4:
                ri riVar = (ri) obj5;
                boolean[] zArr = (boolean[]) obj4;
                ArrayList arrayList3 = (ArrayList) obj;
                Context context = (Context) obj3;
                g2 g2Var = (g2) obj2;
                riVar.getClass();
                if (!zArr[0]) {
                    zArr[0] = true;
                    while (i11 < arrayList3.size()) {
                        Context context2 = context;
                        ri riVar2 = riVar;
                        riVar2.m2(context2, 0, g2Var, null, true, (TLObject) arrayList3.get(i11), ((TLRPC.TL_messages_stickerSet) arrayList3.get(i11)).set, null, this.f3284c, false);
                        i11++;
                        riVar = riVar2;
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
                p50Var.f50844r = false;
                if (!((e4) obj).f47313e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject4;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            mp.u1(i10).f4(tL_contacts_resolvedPeer.users, false);
                            mp.u1(i10).Z3(tL_contacts_resolvedPeer.chats, false);
                            tr.a0(i10).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            p50Var.f50843n = chat;
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
                i6 i6Var2 = (i6) obj3;
                o40 o40Var = (o40) obj2;
                boolean z13 = tLObject5 instanceof TLRPC.Updates;
                int i15 = this.f3284c;
                if (z13) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject5;
                    mp.u1(i15).f4(updates.users, false);
                    mp.u1(i15).Z3(updates.chats, false);
                    ArrayList B0 = mp.B0(updates, TL_update.TL_updateGroupCall.class);
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
                        tL_inputGroupCall.f28509id = groupCall.f28502id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        j9.n0(context3, i15, tL_inputGroupCall, groupCall.invite_link, i6Var2, true, true);
                        org.telegram.messenger.g0.g3(o40Var);
                        return;
                    }
                    return;
                } else if (tLObject5 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject5;
                    mp.u1(i15).f4(groupcall.users, false);
                    mp.u1(i15).Z3(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f28509id = groupCall2.f28502id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i15).sendRequest(exportgroupcallinvite, new gx(t1Var, context3, i15, exportgroupcallinvite, i6Var2, o40Var));
                    return;
                } else {
                    t1Var.dismiss();
                    org.telegram.messenger.g0.g3(o40Var);
                    return;
                }
            case 7:
                new a21((Context) obj5, (TLRPC.Chat) obj4, (TLRPC.User) obj, new ii(i10, (lr) obj3, 5), (i6) obj2).show();
                return;
            case 8:
                o9.a((o9) obj5, (Runnable[]) obj4, (Bitmap) obj, (f50) obj3, this.f3284c, (ja[]) obj2);
                return;
            case 9:
                ef0 ef0Var = (ef0) obj4;
                TLObject tLObject6 = (TLObject) obj5;
                ArrayList arrayList4 = (ArrayList) obj3;
                TLRPC.PollAnswerVoters pollAnswerVoters = (TLRPC.PollAnswerVoters) obj2;
                af0 af0Var = ef0Var.n1;
                ArrayList arrayList5 = ef0Var.f34712x1;
                ye0 ye0Var = ef0Var.f34702m1;
                ArrayList arrayList6 = ef0Var.A1;
                arrayList6.remove(((Integer[]) obj)[i10]);
                if (tLObject6 != null) {
                    TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject6;
                    mp.u1(ef0Var.f30223a).f4(tL_messages_votesList.users, false);
                    if (!tL_messages_votesList.votes.isEmpty()) {
                        arrayList4.add(new df0(tL_messages_votesList, pollAnswerVoters.option));
                    }
                    if (arrayList6.isEmpty()) {
                        int size3 = arrayList4.size();
                        boolean z14 = false;
                        for (int i16 = 0; i16 < size3; i16++) {
                            df0 df0Var = (df0) arrayList4.get(i16);
                            int size4 = arrayList5.size();
                            int i17 = 0;
                            while (true) {
                                if (i17 < size4) {
                                    df0 df0Var2 = (df0) arrayList5.get(i17);
                                    if (Arrays.equals(df0Var.d, df0Var2.d)) {
                                        df0Var2.f34319c = df0Var.f34319c;
                                        z14 = (df0Var2.f34317a == df0Var.f34317a && df0Var2.f34318b.size() == df0Var.f34318b.size()) ? true : true;
                                        df0Var2.f34317a = df0Var.f34317a;
                                        df0Var2.f34318b = df0Var.f34318b;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                        }
                        ef0Var.G1 = false;
                        if (ye0Var != null) {
                            if (ef0Var.B0 == 0 && ef0Var.H == null && !z14) {
                                int childCount = ye0Var.getChildCount();
                                ArrayList arrayList7 = new ArrayList();
                                for (int i18 = 0; i18 < childCount; i18++) {
                                    View childAt = ye0Var.getChildAt(i18);
                                    if (childAt instanceof PollVotesAlert$UserCell) {
                                        View F = ye0Var.F(childAt);
                                        if (F == null) {
                                            T = null;
                                        } else {
                                            T = ye0Var.T(F);
                                        }
                                        if (T != null) {
                                            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                            pollVotesAlert$UserCell.E = arrayList7;
                                            pollVotesAlert$UserCell.setEnabled(true);
                                            af0Var.y(T);
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
                                ef0Var.G1 = false;
                                return;
                            }
                            if (z14) {
                                ef0Var.M0();
                            }
                            af0Var.X(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ef0Var.dismiss();
                return;
            case 10:
                qr.c0((qr) obj4, (TLRPC.FileLocation) obj, (TLRPC.InputFile) obj3, (TLObject) obj5, (TLRPC.FileLocation) obj2, this.f3284c);
                return;
            case 11:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj5;
                String[] strArr = (String[]) obj4;
                Context context4 = (Context) obj;
                ci0 ci0Var = (ci0) obj3;
                g2 g2Var2 = (g2) obj2;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    ei0.c(context4, this.f3284c, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new ph(23, strArr, ci0Var), true, new j2(0), g2Var2.getResourceProvider());
                    return;
                } else {
                    ci0Var.run();
                    return;
                }
            case 12:
                g2 g2Var3 = (g2) obj4;
                List<Purchase> list = (List) obj;
                y0 y0Var = (y0) obj3;
                ws0 ws0Var = (ws0) obj2;
                if (((f5.f) obj5).f11277a == 0) {
                    vf0 vf0Var = new vf0(1, g2Var3);
                    int i19 = this.f3284c;
                    if (list != null && !list.isEmpty() && !i10.i(i19).q()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f6107a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (y0Var != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i19).sendRequest(tL_payments_assignPlayMarketTransaction, new y7(i19, vf0Var, g2Var3, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    r1.i().d("telegram_premium", new f3(vf0Var, 5));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (y0Var != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i19).sendRequest(tL_payments_canPurchaseStore, new gx(i19, 5, g2Var3, ws0Var, y0Var, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    return;
                }
                return;
            case 13:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj4;
                org.telegram.ui.web.s0 s0Var = (org.telegram.ui.web.s0) obj;
                f7 f7Var = (f7) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                boolean z15 = ((TLObject) obj5) instanceof TLRPC.TL_boolTrue;
                int i20 = this.f3284c;
                if (z15) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.v0.w(i20, s0Var, f7Var, "write_access_requested", jSONObject);
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
                    String N0 = gd.N0(2131752886, null);
                    t1 t1Var2 = alertDialog$Builder.f28835a;
                    t1Var2.S = N0;
                    t1Var2.U = gd.N0(2131752887, null);
                    alertDialog$Builder.k(gd.N0(2131752897, null), new uc1(2, v0Var, strArr2));
                    alertDialog$Builder.h(gd.N0(2131752892, null), new l60(23));
                    v0Var.Y(3, t1Var2, new org.telegram.ui.web.u(strArr2, i20, s0Var, f7Var, 1));
                    return;
                }
            default:
                d1 d1Var = (d1) obj5;
                p4.v vVar = (p4.v) obj4;
                j1 j1Var = (j1) obj;
                String str = j1Var.f55445b;
                p4.d0 d0Var = (p4.d0) obj3;
                int i21 = this.f3284c;
                p4.l lVar = (p4.l) obj2;
                ab.c0 c0Var = d1Var.f55331b;
                if (c0Var.B(vVar)) {
                    try {
                        p4.d d = p4.d.d(j1Var);
                        Object obj7 = d.f55306g;
                        int i22 = d.f55302b;
                        if (!d.b()) {
                            h2.a.l("MediaSessionStub", "Can't execute predefined custom command: " + str);
                            d1.r1(d0Var, vVar, i21, new n1(-6));
                            return;
                        }
                        j1 j1Var2 = d.f55301a;
                        if (j1Var2 != null) {
                            if (j1Var2.f55444a == 40010) {
                                z11 = true;
                            }
                            ma.p(z11);
                            d1Var.j1(lVar, i21, null, 40010, new p4.u0(new x0(d), 1));
                            return;
                        }
                        h1 h1Var = d0Var.f55324t;
                        if (i22 == 1) {
                            if (obj7 == null) {
                                if (!h1Var.v()) {
                                    z12 = true;
                                }
                            } else {
                                z12 = ((Boolean) obj7).booleanValue();
                            }
                        }
                        if (z12) {
                            d1Var.o1(vVar, i21);
                        } else if (i22 == 31) {
                            obj7.getClass();
                            d1Var.q1(vVar, i21, 31, new p4.u0(new uc1(9, new ab.z(9, (e2.l0) obj7, true), new p4.r0(20)), 1));
                        } else {
                            d1Var.q1(vVar, i21, i22, d1.s1(new x0(d)));
                        }
                        c0Var.m(vVar);
                        return;
                    } catch (RuntimeException e11) {
                        h2.a.m("MediaSessionStub", "Failed to convert predefined custom command: " + str, e11);
                        d1.r1(d0Var, vVar, i21, new n1(-3));
                        return;
                    }
                }
                return;
        }
    }

    public m0(a8 a8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i7) {
        this.f3282a = 2;
        this.d = a8Var;
        this.f3283b = tLObject;
        this.f3285e = obj;
        this.f3286f = arrayList;
        this.h = zArr;
        this.f3284c = i7;
    }

    public m0(hi.e eVar, TLObject tLObject, w2[] w2VarArr, i6 i6Var, int i7, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.f3282a = 1;
        this.d = eVar;
        this.f3283b = tLObject;
        this.f3285e = w2VarArr;
        this.f3286f = i6Var;
        this.f3284c = i7;
        this.h = tL_messages_checkChatInvite;
    }

    public m0(Object obj, Object obj2, Object obj3, int i7, Object obj4, Object obj5, int i10) {
        this.f3282a = i10;
        this.f3283b = obj;
        this.d = obj2;
        this.f3285e = obj3;
        this.f3284c = i7;
        this.f3286f = obj4;
        this.h = obj5;
    }

    public m0(Object obj, Object obj2, Object obj3, Object obj4, int i7, Object obj5, int i10) {
        this.f3282a = i10;
        this.f3283b = obj;
        this.d = obj2;
        this.f3285e = obj3;
        this.f3286f = obj4;
        this.f3284c = i7;
        this.h = obj5;
    }

    public m0(t3 t3Var, int i7, TLObject tLObject, di.h hVar, ArrayList arrayList, HashSet hashSet) {
        this.f3282a = 3;
        this.d = t3Var;
        this.f3284c = i7;
        this.f3283b = tLObject;
        this.f3285e = hVar;
        this.f3286f = arrayList;
        this.h = hashSet;
    }

    public m0(ri riVar, boolean[] zArr, ArrayList arrayList, Context context, g2 g2Var, int i7) {
        this.f3282a = 4;
        this.f3283b = riVar;
        this.d = zArr;
        this.f3285e = arrayList;
        this.f3286f = context;
        this.h = g2Var;
        this.f3284c = i7;
    }

    public m0(ef0 ef0Var, Integer[] numArr, int i7, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f3282a = 9;
        this.d = ef0Var;
        this.f3285e = numArr;
        this.f3284c = i7;
        this.f3283b = tLObject;
        this.f3286f = arrayList;
        this.h = pollAnswerVoters;
    }

    public m0(qr qrVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i7) {
        this.f3282a = 10;
        this.d = qrVar;
        this.f3285e = fileLocation;
        this.f3286f = inputFile;
        this.f3283b = tLObject;
        this.h = fileLocation2;
        this.f3284c = i7;
    }

    public m0(p50 p50Var, e4 e4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7, a1 a1Var) {
        this.f3282a = 5;
        this.d = p50Var;
        this.f3285e = e4Var;
        this.f3286f = tL_error;
        this.f3283b = tLObject;
        this.f3284c = i7;
        this.h = a1Var;
    }

    public m0(org.telegram.ui.web.v0 v0Var, TLObject tLObject, int i7, org.telegram.ui.web.s0 s0Var, f7 f7Var, TLRPC.TL_error tL_error) {
        this.f3282a = 13;
        this.d = v0Var;
        this.f3283b = tLObject;
        this.f3284c = i7;
        this.f3285e = s0Var;
        this.f3286f = f7Var;
        this.h = tL_error;
    }
}
