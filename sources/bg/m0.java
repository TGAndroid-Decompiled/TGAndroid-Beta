package bg;

import a8.la;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import c8.ia;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.clearcut.y0;
import di.x8;
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
import org.telegram.messenger.j10;
import org.telegram.messenger.j2;
import org.telegram.messenger.ks;
import org.telegram.messenger.lr;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
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
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.s4;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x2;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.a1;
import org.telegram.ui.b21;
import org.telegram.ui.bh;
import org.telegram.ui.e4;
import org.telegram.ui.ei0;
import org.telegram.ui.f3;
import org.telegram.ui.gi0;
import org.telegram.ui.i9;
import org.telegram.ui.ii;
import org.telegram.ui.l60;
import org.telegram.ui.p40;
import org.telegram.ui.p50;
import org.telegram.ui.qr;
import org.telegram.ui.wc1;
import org.telegram.ui.xf0;
import org.telegram.ui.xs0;
import p4.e1;
import p4.i1;
import p4.k1;
import p4.o1;
import v4.f1;
public final class m0 implements Runnable {
    public final int f3312a;
    public final Object f3313b;
    public final int f3314c;
    public final Object d;
    public final Object f3315e;
    public final Object f3316f;
    public final Object h;

    public m0(int i7, int i10, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f3312a = i10;
        this.f3313b = tLObject;
        this.f3314c = i7;
        this.d = obj;
        this.f3315e = obj2;
        this.f3316f = obj3;
        this.h = obj4;
    }

    @Override
    public final void run() {
        ?? r82;
        boolean z10;
        f1 T;
        int i7 = this.f3312a;
        char c10 = 2;
        final int i10 = this.f3314c;
        int i11 = 0;
        boolean z11 = false;
        r7 = false;
        boolean z12 = false;
        int i12 = 0;
        Object obj = this.f3315e;
        Object obj2 = this.h;
        Object obj3 = this.f3316f;
        Object obj4 = this.d;
        Object obj5 = this.f3313b;
        switch (i7) {
            case 0:
                TLObject tLObject = (TLObject) obj5;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) obj4;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) obj;
                bh bhVar = (bh) obj3;
                s4 s4Var = (s4) obj2;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    mp.u1(i10).f4(tL_photos_photo.users, false);
                    TLRPC.User c22 = mp.u1(i10).c2(Long.valueOf(j10.i(i10).f24789n));
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
                            r82 = 1;
                            ec.D().S(n10, n11, fc.l(i10, 1, c22));
                        } else {
                            r82 = 1;
                        }
                        if (w11 != null && photoSize2 != null && photoSize2.location != null) {
                            w7.G(i10);
                            File J2 = w7.J(w11, null, r82, r82);
                            w7.G(i10);
                            w7.J(photoSize2.location, null, r82, r82).renameTo(J2);
                        }
                        n0.a(tL_photos_photo.photo, c22, false);
                        j10.i(i10).w(c22);
                        j10.i(i10).v(r82);
                        bhVar.run();
                        lc.b0(s4Var.getLastFragment()).V(Collections.singletonList(c22), org.telegram.messenger.g0.W2(gd.M0(2131754217, null)), org.telegram.messenger.g0.T2(gd.M0(2131754218, null), new ai.w0(i10, s4Var, (int) r82)), null).j();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLObject tLObject2 = (TLObject) obj5;
                x2[] x2VarArr = (x2[]) obj;
                i6 i6Var = (i6) obj3;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) obj2;
                ((hi.d) obj4).setLoading(false);
                if (tLObject2 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject2;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new lc(x2VarArr[0].F, i6Var).t(gd.M0(2131743642, null), null).k(false);
                        return;
                    }
                    final long j3 = tL_starsSubscriptionPricing.amount;
                    x8.y(i10, false).h0(tL_messages_checkChatInvite.hash, chatInvite, new q10() {
                        @Override
                        public final void a(Object obj6, Object obj7) {
                            Long l10 = (Long) obj7;
                            if ("paid".equals((String) obj6) && l10.longValue() != 0) {
                                org.telegram.messenger.g0.g3(new b9(l10, i10, j3, 0));
                            }
                        }
                    });
                    return;
                }
                new lc(x2VarArr[0].F, i6Var).t(gd.M0(2131748721, null), null).k(false);
                return;
            case 2:
                a8.a((a8) obj4, (TLObject) obj5, this.f3315e, (ArrayList) obj3, (boolean[]) obj2, this.f3314c);
                return;
            case 3:
                t3 t3Var = (t3) obj4;
                TLObject tLObject3 = (TLObject) obj5;
                di.h hVar = (di.h) obj;
                ArrayList arrayList = (ArrayList) obj3;
                HashSet hashSet = (HashSet) obj2;
                HashSet hashSet2 = t3Var.f26945n;
                ArrayList arrayList2 = t3Var.f26937e;
                if (t3Var.G.remove(Integer.valueOf(i10))) {
                    if (tLObject3 != null) {
                        TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject3;
                        mp.u1(t3Var.C.f23218a).f4(groupparticipants.users, false);
                        mp.u1(t3Var.C.f23218a).Z3(groupparticipants.chats, false);
                        int size = groupparticipants.participants.size();
                        int i13 = 0;
                        while (i13 < size) {
                            TLRPC.GroupCallParticipant groupCallParticipant = groupparticipants.participants.get(i13);
                            long B1 = fj.B1(groupCallParticipant.peer);
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
                                t3Var.f26941j.remove(valueOf);
                            }
                            i13++;
                            c10 = c11;
                        }
                        char c12 = c10;
                        if (t3Var.f26935b.participants_count < t3Var.d.m()) {
                            t3Var.f26935b.participants_count = t3Var.d.m();
                        }
                        t3Var.z();
                        ks f10 = ks.f(t3Var.C.f23218a);
                        Long valueOf2 = Long.valueOf(t3Var.f26936c);
                        Long valueOf3 = Long.valueOf(t3Var.f26935b.f28413id);
                        Object[] objArr = new Object[3];
                        objArr[0] = valueOf2;
                        objArr[1] = valueOf3;
                        objArr[c12] = Boolean.FALSE;
                        f10.k(166, objArr);
                        if (hVar != null) {
                            ((VoIPService) hVar.f8889c).lambda$createGroupInstance$69(hVar.f8888b, (int[]) hVar.d, arrayList);
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
                h2 h2Var = (h2) obj2;
                riVar.getClass();
                if (!zArr[0]) {
                    zArr[0] = true;
                    while (i11 < arrayList3.size()) {
                        Context context2 = context;
                        ri riVar2 = riVar;
                        riVar2.m2(context2, 0, h2Var, null, true, (TLObject) arrayList3.get(i11), ((TLRPC.TL_messages_stickerSet) arrayList3.get(i11)).set, null, this.f3314c, false);
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
                p50Var.f50712r = false;
                if (!((e4) obj).f47049e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject4;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            mp.u1(i10).f4(tL_contacts_resolvedPeer.users, false);
                            mp.u1(i10).Z3(tL_contacts_resolvedPeer.chats, false);
                            tr.a0(i10).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            p50Var.f50711n = chat;
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
                i6 i6Var2 = (i6) obj3;
                p40 p40Var = (p40) obj2;
                boolean z13 = tLObject5 instanceof TLRPC.Updates;
                int i14 = this.f3314c;
                if (z13) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject5;
                    mp.u1(i14).f4(updates.users, false);
                    mp.u1(i14).Z3(updates.chats, false);
                    ArrayList B0 = mp.B0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = B0.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i12 < size2) {
                        Object obj6 = B0.get(i12);
                        i12++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj6).call;
                    }
                    u1Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f28420id = groupCall.f28413id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        i9.n0(context3, i14, tL_inputGroupCall, groupCall.invite_link, i6Var2, true, true);
                        org.telegram.messenger.g0.g3(p40Var);
                        return;
                    }
                    return;
                } else if (tLObject5 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject5;
                    mp.u1(i14).f4(groupcall.users, false);
                    mp.u1(i14).Z3(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f28420id = groupCall2.f28413id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i14).sendRequest(exportgroupcallinvite, new gx(u1Var, context3, i14, exportgroupcallinvite, i6Var2, p40Var));
                    return;
                } else {
                    u1Var.dismiss();
                    org.telegram.messenger.g0.g3(p40Var);
                    return;
                }
            case 7:
                new b21((Context) obj5, (TLRPC.Chat) obj4, (TLRPC.User) obj, new ii(i10, (lr) obj3, 3), (i6) obj2).show();
                return;
            case 8:
                p9.a((p9) obj5, (Runnable[]) obj4, (Bitmap) obj, (f50) obj3, this.f3314c, (ia[]) obj2);
                return;
            case 9:
                ji.n nVar = (ji.n) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                ji.g gVar = (ji.g) obj2;
                ChatActivityEnterView chatActivityEnterView = ((pf) obj5).f38384a;
                ne0 a82 = chatActivityEnterView.D3.a8(nVar, (c5) obj);
                if (a82 == null) {
                    org.telegram.messenger.g0.E2(nVar);
                    return;
                }
                int C0 = chatActivityEnterView.C0(n6.E8);
                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                    Context context4 = chatActivityEnterView.getContext();
                    CharSequence charSequence = (CharSequence) arrayList4.get(i15);
                    if (i15 == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.lr lrVar = ai.n0.I0;
                    a82.c(new ai.l0(context4, charSequence, C0, z10), 44, new ii(gVar, i15, 8));
                }
                a82.I = new lg(nVar, 22);
                int[] iArr = new int[2];
                chatActivityEnterView.getLocationInWindow(iArr);
                a82.E = iArr[1];
                a82.G = org.telegram.messenger.g0.L(316);
                a82.i();
                return;
            case 10:
                df0 df0Var = (df0) obj4;
                TLObject tLObject6 = (TLObject) obj5;
                ArrayList arrayList5 = (ArrayList) obj3;
                TLRPC.PollAnswerVoters pollAnswerVoters = (TLRPC.PollAnswerVoters) obj2;
                ze0 ze0Var = df0Var.n1;
                ArrayList arrayList6 = df0Var.f34430x1;
                xe0 xe0Var = df0Var.f34420m1;
                ArrayList arrayList7 = df0Var.A1;
                arrayList7.remove(((Integer[]) obj)[i10]);
                if (tLObject6 != null) {
                    TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject6;
                    mp.u1(df0Var.f30187a).f4(tL_messages_votesList.users, false);
                    if (!tL_messages_votesList.votes.isEmpty()) {
                        arrayList5.add(new cf0(tL_messages_votesList, pollAnswerVoters.option));
                    }
                    if (arrayList7.isEmpty()) {
                        int size3 = arrayList5.size();
                        boolean z14 = false;
                        for (int i16 = 0; i16 < size3; i16++) {
                            cf0 cf0Var = (cf0) arrayList5.get(i16);
                            int size4 = arrayList6.size();
                            int i17 = 0;
                            while (true) {
                                if (i17 < size4) {
                                    cf0 cf0Var2 = (cf0) arrayList6.get(i17);
                                    if (Arrays.equals(cf0Var.d, cf0Var2.d)) {
                                        cf0Var2.f33988c = cf0Var.f33988c;
                                        z14 = (cf0Var2.f33986a == cf0Var.f33986a && cf0Var2.f33987b.size() == cf0Var.f33987b.size()) ? true : true;
                                        cf0Var2.f33986a = cf0Var.f33986a;
                                        cf0Var2.f33987b = cf0Var.f33987b;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                        }
                        df0Var.G1 = false;
                        if (xe0Var != null) {
                            if (df0Var.B0 == 0 && df0Var.H == null && !z14) {
                                int childCount = xe0Var.getChildCount();
                                ArrayList arrayList8 = new ArrayList();
                                for (int i18 = 0; i18 < childCount; i18++) {
                                    View childAt = xe0Var.getChildAt(i18);
                                    if (childAt instanceof PollVotesAlert$UserCell) {
                                        View F = xe0Var.F(childAt);
                                        if (F == null) {
                                            T = null;
                                        } else {
                                            T = xe0Var.T(F);
                                        }
                                        if (T != null) {
                                            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                            pollVotesAlert$UserCell.E = arrayList8;
                                            pollVotesAlert$UserCell.setEnabled(true);
                                            ze0Var.y(T);
                                            pollVotesAlert$UserCell.E = null;
                                        }
                                    }
                                }
                                if (!arrayList8.isEmpty()) {
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(arrayList8);
                                    animatorSet.setDuration(180L);
                                    animatorSet.start();
                                }
                                df0Var.G1 = false;
                                return;
                            }
                            if (z14) {
                                df0Var.M0();
                            }
                            ze0Var.X(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                df0Var.dismiss();
                return;
            case 11:
                qr.c0((qr) obj4, (TLRPC.FileLocation) obj, (TLRPC.InputFile) obj3, (TLObject) obj5, (TLRPC.FileLocation) obj2, this.f3314c);
                return;
            case 12:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj5;
                String[] strArr = (String[]) obj4;
                Context context5 = (Context) obj;
                ei0 ei0Var = (ei0) obj3;
                h2 h2Var2 = (h2) obj2;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    gi0.c(context5, this.f3314c, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new ph(22, strArr, ei0Var), true, new j2(0), h2Var2.getResourceProvider());
                    return;
                } else {
                    ei0Var.run();
                    return;
                }
            case 13:
                h2 h2Var3 = (h2) obj4;
                List<Purchase> list = (List) obj;
                y0 y0Var = (y0) obj3;
                xs0 xs0Var = (xs0) obj2;
                if (((f5.f) obj5).f11283a == 0) {
                    xf0 xf0Var = new xf0(1, h2Var3);
                    int i19 = this.f3314c;
                    if (list != null && !list.isEmpty() && !j10.i(i19).q()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f6112a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (y0Var != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i19).sendRequest(tL_payments_assignPlayMarketTransaction, new y7(i19, xf0Var, h2Var3, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    r1.i().d("telegram_premium", new f3(xf0Var, 5));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (y0Var != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i19).sendRequest(tL_payments_canPurchaseStore, new gx(i19, 5, h2Var3, xs0Var, y0Var, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    return;
                }
                return;
            case 14:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj4;
                org.telegram.ui.web.s0 s0Var = (org.telegram.ui.web.s0) obj;
                f7 f7Var = (f7) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                boolean z15 = ((TLObject) obj5) instanceof TLRPC.TL_boolTrue;
                int i20 = this.f3314c;
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
                    String M0 = gd.M0(2131752887, null);
                    u1 u1Var2 = alertDialog$Builder.f28744a;
                    u1Var2.S = M0;
                    u1Var2.U = gd.M0(2131752888, null);
                    alertDialog$Builder.k(gd.M0(2131752898, null), new wc1(2, v0Var, strArr2));
                    alertDialog$Builder.h(gd.M0(2131752893, null), new l60(23));
                    v0Var.Y(3, u1Var2, new org.telegram.ui.web.u(strArr2, i20, s0Var, f7Var, 1));
                    return;
                }
            default:
                e1 e1Var = (e1) obj5;
                p4.v vVar = (p4.v) obj4;
                k1 k1Var = (k1) obj;
                String str = k1Var.f55321b;
                p4.d0 d0Var = (p4.d0) obj3;
                int i21 = this.f3314c;
                p4.l lVar = (p4.l) obj2;
                ab.c0 c0Var = e1Var.f55210b;
                if (c0Var.A(vVar)) {
                    try {
                        p4.d d = p4.d.d(k1Var);
                        Object obj7 = d.f55177g;
                        int i22 = d.f55173b;
                        if (!d.b()) {
                            h2.a.l("MediaSessionStub", "Can't execute predefined custom command: " + str);
                            e1.r1(d0Var, vVar, i21, new o1(-6));
                            return;
                        }
                        k1 k1Var2 = d.f55172a;
                        if (k1Var2 != null) {
                            if (k1Var2.f55320a == 40010) {
                                z11 = true;
                            }
                            la.p(z11);
                            e1Var.j1(lVar, i21, null, 40010, new p4.v0(new p4.y0(d), 1));
                            return;
                        }
                        i1 i1Var = d0Var.f55195t;
                        if (i22 == 1) {
                            if (obj7 == null) {
                                if (!i1Var.u()) {
                                    z12 = true;
                                }
                            } else {
                                z12 = ((Boolean) obj7).booleanValue();
                            }
                        }
                        if (z12) {
                            e1Var.o1(vVar, i21);
                        } else if (i22 == 31) {
                            obj7.getClass();
                            e1Var.q1(vVar, i21, 31, new p4.v0(new wc1(9, new ab.z(9, (e2.l0) obj7, true), new p4.r0(20)), 1));
                        } else {
                            e1Var.q1(vVar, i21, i22, e1.s1(new p4.y0(d)));
                        }
                        c0Var.l(vVar);
                        return;
                    } catch (RuntimeException e11) {
                        h2.a.m("MediaSessionStub", "Failed to convert predefined custom command: " + str, e11);
                        e1.r1(d0Var, vVar, i21, new o1(-3));
                        return;
                    }
                }
                return;
        }
    }

    public m0(a8 a8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i7) {
        this.f3312a = 2;
        this.d = a8Var;
        this.f3313b = tLObject;
        this.f3315e = obj;
        this.f3316f = arrayList;
        this.h = zArr;
        this.f3314c = i7;
    }

    public m0(hi.d dVar, TLObject tLObject, x2[] x2VarArr, i6 i6Var, int i7, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.f3312a = 1;
        this.d = dVar;
        this.f3313b = tLObject;
        this.f3315e = x2VarArr;
        this.f3316f = i6Var;
        this.f3314c = i7;
        this.h = tL_messages_checkChatInvite;
    }

    public m0(Object obj, Object obj2, Object obj3, int i7, Object obj4, Object obj5, int i10) {
        this.f3312a = i10;
        this.f3313b = obj;
        this.d = obj2;
        this.f3315e = obj3;
        this.f3314c = i7;
        this.f3316f = obj4;
        this.h = obj5;
    }

    public m0(Object obj, Object obj2, Object obj3, Object obj4, int i7, Object obj5, int i10) {
        this.f3312a = i10;
        this.f3313b = obj;
        this.d = obj2;
        this.f3315e = obj3;
        this.f3316f = obj4;
        this.f3314c = i7;
        this.h = obj5;
    }

    public m0(t3 t3Var, int i7, TLObject tLObject, di.h hVar, ArrayList arrayList, HashSet hashSet) {
        this.f3312a = 3;
        this.d = t3Var;
        this.f3314c = i7;
        this.f3313b = tLObject;
        this.f3315e = hVar;
        this.f3316f = arrayList;
        this.h = hashSet;
    }

    public m0(ri riVar, boolean[] zArr, ArrayList arrayList, Context context, h2 h2Var, int i7) {
        this.f3312a = 4;
        this.f3313b = riVar;
        this.d = zArr;
        this.f3315e = arrayList;
        this.f3316f = context;
        this.h = h2Var;
        this.f3314c = i7;
    }

    public m0(df0 df0Var, Integer[] numArr, int i7, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f3312a = 10;
        this.d = df0Var;
        this.f3315e = numArr;
        this.f3314c = i7;
        this.f3313b = tLObject;
        this.f3316f = arrayList;
        this.h = pollAnswerVoters;
    }

    public m0(qr qrVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i7) {
        this.f3312a = 11;
        this.d = qrVar;
        this.f3315e = fileLocation;
        this.f3316f = inputFile;
        this.f3313b = tLObject;
        this.h = fileLocation2;
        this.f3314c = i7;
    }

    public m0(p50 p50Var, e4 e4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7, a1 a1Var) {
        this.f3312a = 5;
        this.d = p50Var;
        this.f3315e = e4Var;
        this.f3316f = tL_error;
        this.f3313b = tLObject;
        this.f3314c = i7;
        this.h = a1Var;
    }

    public m0(org.telegram.ui.web.v0 v0Var, TLObject tLObject, int i7, org.telegram.ui.web.s0 s0Var, f7 f7Var, TLRPC.TL_error tL_error) {
        this.f3312a = 14;
        this.d = v0Var;
        this.f3313b = tLObject;
        this.f3314c = i7;
        this.f3315e = s0Var;
        this.f3316f = f7Var;
        this.h = tL_error;
    }
}
