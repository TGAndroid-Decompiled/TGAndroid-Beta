package bg;

import a8.ja;
import ai.w0;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import c8.ga;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.clearcut.y0;
import di.u8;
import fi.b8;
import fi.d8;
import fi.i7;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.fc;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.lx;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.nr;
import org.telegram.messenger.ns;
import org.telegram.messenger.r1;
import org.telegram.messenger.r3;
import org.telegram.messenger.s10;
import org.telegram.messenger.si;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vr;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.a2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.se0;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Wallet.k8;
import org.telegram.ui.a1;
import org.telegram.ui.bh;
import org.telegram.ui.bi0;
import org.telegram.ui.di0;
import org.telegram.ui.e4;
import org.telegram.ui.f3;
import org.telegram.ui.i9;
import org.telegram.ui.m40;
import org.telegram.ui.n50;
import org.telegram.ui.pr;
import org.telegram.ui.t70;
import org.telegram.ui.tf0;
import org.telegram.ui.ts0;
import org.telegram.ui.x11;
import p4.c1;
import p4.g1;
import p4.i1;
import p4.m1;
import v4.e1;
public final class l0 implements Runnable {
    public final int f3304a;
    public final Object f3305b;
    public final int f3306c;
    public final Object d;
    public final Object f3307e;
    public final Object f3308f;
    public final Object h;

    public l0(int i7, int i10, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f3304a = i10;
        this.f3305b = tLObject;
        this.f3306c = i7;
        this.d = obj;
        this.f3307e = obj2;
        this.f3308f = obj3;
        this.h = obj4;
    }

    @Override
    public final void run() {
        ?? r92;
        boolean z10;
        e1 T;
        int i7 = this.f3304a;
        final int i10 = this.f3306c;
        int i11 = 0;
        boolean z11 = false;
        r8 = false;
        boolean z12 = false;
        int i12 = 0;
        Object obj = this.f3307e;
        Object obj2 = this.h;
        Object obj3 = this.f3308f;
        Object obj4 = this.d;
        Object obj5 = this.f3305b;
        switch (i7) {
            case 0:
                TLObject tLObject = (TLObject) obj5;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) obj4;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) obj;
                bh bhVar = (bh) obj3;
                o4 o4Var = (o4) obj2;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    np.s1(i10).Y3(tL_photos_photo.users, false);
                    TLRPC.User a22 = np.s1(i10).a2(Long.valueOf(m10.i(i10).f24959n));
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
                            r92 = 1;
                            fc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), gc.l(i10, 1, a22));
                        } else {
                            r92 = 1;
                        }
                        if (w11 != null && photoSize2 != null && photoSize2.location != null) {
                            w7.G(i10);
                            File J2 = w7.J(w11, null, r92, r92);
                            w7.G(i10);
                            w7.J(photoSize2.location, null, r92, r92).renameTo(J2);
                        }
                        m0.a(tL_photos_photo.photo, a22, false);
                        m10.i(i10).w(a22);
                        m10.i(i10).v(r92);
                        bhVar.run();
                        cc.a0(o4Var.getLastFragment()).V(Collections.singletonList(a22), org.telegram.messenger.g0.X2(hd.M0(2131754219, null)), org.telegram.messenger.g0.U2(hd.M0(2131754220, null), new w0(i10, o4Var, (int) r92)), null).j();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLObject tLObject2 = (TLObject) obj5;
                u2[] u2VarArr = (u2[]) obj;
                e6 e6Var = (e6) obj3;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) obj2;
                ((hi.d) obj4).setLoading(false);
                if (tLObject2 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject2;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new cc(u2VarArr[0].F, e6Var).t(hd.M0(2131743879, null), null).k(false);
                        return;
                    }
                    final long j3 = tL_starsSubscriptionPricing.amount;
                    u8.y(i10, false).h0(tL_messages_checkChatInvite.hash, chatInvite, new s10() {
                        @Override
                        public final void a(Object obj6, Object obj7) {
                            Long l10 = (Long) obj7;
                            if ("paid".equals((String) obj6) && l10.longValue() != 0) {
                                org.telegram.messenger.g0.h3(new y8(l10, i10, j3, 0));
                            }
                        }
                    });
                    return;
                }
                new cc(u2VarArr[0].F, e6Var).t(hd.M0(2131748913, null), null).k(false);
                return;
            case 2:
                d8.a((d8) obj4, (TLObject) obj5, this.f3307e, (ArrayList) obj3, (boolean[]) obj2, this.f3306c);
                return;
            case 3:
                r3 r3Var = (r3) obj4;
                TLObject tLObject3 = (TLObject) obj5;
                di.h hVar = (di.h) obj;
                ArrayList arrayList = (ArrayList) obj3;
                HashSet hashSet = (HashSet) obj2;
                HashSet hashSet2 = r3Var.f26226n;
                ArrayList arrayList2 = r3Var.f26218e;
                if (r3Var.G.remove(Integer.valueOf(i10))) {
                    if (tLObject3 != null) {
                        TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject3;
                        np.s1(r3Var.C.f22782a).Y3(groupparticipants.users, false);
                        np.s1(r3Var.C.f22782a).S3(groupparticipants.chats, false);
                        int size = groupparticipants.participants.size();
                        int i13 = 0;
                        while (i13 < size) {
                            TLRPC.GroupCallParticipant groupCallParticipant = groupparticipants.participants.get(i13);
                            int i14 = size;
                            long B1 = gj.B1(groupCallParticipant.peer);
                            TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) r3Var.d.f(B1);
                            if (groupCallParticipant2 != null) {
                                arrayList2.remove(groupCallParticipant2);
                                r3Var.n(groupCallParticipant2, false);
                            }
                            r3Var.d.k(groupCallParticipant, B1);
                            arrayList2.add(groupCallParticipant);
                            r3Var.n(groupCallParticipant, true);
                            if (hashSet2.contains(Long.valueOf(B1))) {
                                Long valueOf = Long.valueOf(B1);
                                hashSet2.remove(valueOf);
                                r3Var.f26222j.remove(valueOf);
                            }
                            i13++;
                            size = i14;
                        }
                        if (r3Var.f26216b.participants_count < r3Var.d.m()) {
                            r3Var.f26216b.participants_count = r3Var.d.m();
                        }
                        r3Var.z();
                        ns.f(r3Var.C.f22782a).k(166, Long.valueOf(r3Var.f26217c), Long.valueOf(r3Var.f26216b.f28061id), Boolean.FALSE);
                        if (hVar != null) {
                            ((VoIPService) hVar.f8676c).lambda$createGroupInstance$69(hVar.f8675b, (int[]) hVar.d, arrayList);
                        } else {
                            r3Var.w();
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
                e2 e2Var = (e2) obj2;
                siVar.getClass();
                if (!zArr[0]) {
                    zArr[0] = true;
                    while (i11 < arrayList3.size()) {
                        Context context2 = context;
                        si siVar2 = siVar;
                        siVar2.h2(context2, 0, e2Var, null, true, (TLObject) arrayList3.get(i11), ((TLRPC.TL_messages_stickerSet) arrayList3.get(i11)).set, null, this.f3306c, false);
                        i11++;
                        siVar = siVar2;
                        context = context2;
                    }
                    return;
                }
                return;
            case 5:
                n50 n50Var = (n50) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject4 = (TLObject) obj5;
                a1 a1Var = (a1) obj2;
                n50Var.f49453r = false;
                if (!((e4) obj).f46531e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject4;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            np.s1(i10).Y3(tL_contacts_resolvedPeer.users, false);
                            np.s1(i10).S3(tL_contacts_resolvedPeer.chats, false);
                            vr.a0(i10).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            n50Var.f49452n = chat;
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
                e6 e6Var2 = (e6) obj3;
                m40 m40Var = (m40) obj2;
                boolean z13 = tLObject5 instanceof TLRPC.Updates;
                int i15 = this.f3306c;
                if (z13) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject5;
                    np.s1(i15).Y3(updates.users, false);
                    np.s1(i15).S3(updates.chats, false);
                    ArrayList z02 = np.z0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = z02.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i12 < size2) {
                        Object obj6 = z02.get(i12);
                        i12++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj6).call;
                    }
                    t1Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f28068id = groupCall.f28061id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        i9.n0(context3, i15, tL_inputGroupCall, groupCall.invite_link, e6Var2, true, true);
                        org.telegram.messenger.g0.h3(m40Var);
                        return;
                    }
                    return;
                } else if (tLObject5 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject5;
                    np.s1(i15).Y3(groupcall.users, false);
                    np.s1(i15).S3(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f28068id = groupCall2.f28061id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i15).sendRequest(exportgroupcallinvite, new lx(t1Var, context3, i15, exportgroupcallinvite, e6Var2, m40Var));
                    return;
                } else {
                    t1Var.dismiss();
                    org.telegram.messenger.g0.h3(m40Var);
                    return;
                }
            case 7:
                new x11((Context) obj5, (TLRPC.Chat) obj4, (TLRPC.User) obj, new a2(i10, (nr) obj3, 0), (e6) obj2).show();
                return;
            case 8:
                h9.a((h9) obj5, (Runnable[]) obj4, (Bitmap) obj, (x40) obj3, this.f3306c, (ga[]) obj2);
                return;
            case 9:
                ji.n nVar = (ji.n) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                ji.g gVar = (ji.g) obj2;
                ChatActivityEnterView chatActivityEnterView = ((gf) obj5).f34928a;
                de0 a82 = chatActivityEnterView.f32319x3.a8(nVar, (ff) obj);
                if (a82 == null) {
                    org.telegram.messenger.g0.E2(nVar);
                    return;
                }
                int u02 = chatActivityEnterView.u0(j6.E8);
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    Context context4 = chatActivityEnterView.getContext();
                    CharSequence charSequence = (CharSequence) arrayList4.get(i16);
                    if (i16 == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    er erVar = ai.n0.H0;
                    a82.c(new ai.l0(context4, charSequence, u02, z10), 44, new a2(gVar, i16, 6));
                }
                a82.I = new dg(nVar, 22);
                int[] iArr = new int[2];
                chatActivityEnterView.getLocationInWindow(iArr);
                a82.E = iArr[1];
                a82.G = org.telegram.messenger.g0.L(316);
                a82.i();
                return;
            case 10:
                te0 te0Var = (te0) obj4;
                TLObject tLObject6 = (TLObject) obj5;
                ArrayList arrayList5 = (ArrayList) obj3;
                TLRPC.PollAnswerVoters pollAnswerVoters = (TLRPC.PollAnswerVoters) obj2;
                pe0 pe0Var = te0Var.n1;
                ArrayList arrayList6 = te0Var.f39687x1;
                ne0 ne0Var = te0Var.f39677m1;
                ArrayList arrayList7 = te0Var.A1;
                arrayList7.remove(((Integer[]) obj)[i10]);
                if (tLObject6 != null) {
                    TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject6;
                    np.s1(te0Var.f29679a).Y3(tL_messages_votesList.users, false);
                    if (!tL_messages_votesList.votes.isEmpty()) {
                        arrayList5.add(new se0(tL_messages_votesList, pollAnswerVoters.option));
                    }
                    if (arrayList7.isEmpty()) {
                        int size3 = arrayList5.size();
                        boolean z14 = false;
                        for (int i17 = 0; i17 < size3; i17++) {
                            se0 se0Var = (se0) arrayList5.get(i17);
                            int size4 = arrayList6.size();
                            int i18 = 0;
                            while (true) {
                                if (i18 < size4) {
                                    se0 se0Var2 = (se0) arrayList6.get(i18);
                                    if (Arrays.equals(se0Var.d, se0Var2.d)) {
                                        se0Var2.f39293c = se0Var.f39293c;
                                        z14 = (se0Var2.f39291a == se0Var.f39291a && se0Var2.f39292b.size() == se0Var.f39292b.size()) ? true : true;
                                        se0Var2.f39291a = se0Var.f39291a;
                                        se0Var2.f39292b = se0Var.f39292b;
                                    } else {
                                        i18++;
                                    }
                                }
                            }
                        }
                        te0Var.G1 = false;
                        if (ne0Var != null) {
                            if (te0Var.B0 == 0 && te0Var.H == null && !z14) {
                                int childCount = ne0Var.getChildCount();
                                ArrayList arrayList8 = new ArrayList();
                                for (int i19 = 0; i19 < childCount; i19++) {
                                    View childAt = ne0Var.getChildAt(i19);
                                    if (childAt instanceof PollVotesAlert$UserCell) {
                                        View F = ne0Var.F(childAt);
                                        if (F == null) {
                                            T = null;
                                        } else {
                                            T = ne0Var.T(F);
                                        }
                                        if (T != null) {
                                            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                            pollVotesAlert$UserCell.E = arrayList8;
                                            pollVotesAlert$UserCell.setEnabled(true);
                                            pe0Var.y(T);
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
                                te0Var.G1 = false;
                                return;
                            }
                            if (z14) {
                                te0Var.L0();
                            }
                            pe0Var.X(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                te0Var.dismiss();
                return;
            case 11:
                pr.c0((pr) obj4, (TLRPC.FileLocation) obj, (TLRPC.InputFile) obj3, (TLObject) obj5, (TLRPC.FileLocation) obj2, this.f3306c);
                return;
            case 12:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj5;
                String[] strArr = (String[]) obj4;
                Context context5 = (Context) obj;
                bi0 bi0Var = (bi0) obj3;
                e2 e2Var2 = (e2) obj2;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    di0.c(context5, this.f3306c, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new gh(23, strArr, bi0Var), true, new ai.o(28), e2Var2.getResourceProvider());
                    return;
                } else {
                    bi0Var.run();
                    return;
                }
            case 13:
                e2 e2Var3 = (e2) obj4;
                List<Purchase> list = (List) obj;
                y0 y0Var = (y0) obj3;
                ts0 ts0Var = (ts0) obj2;
                if (((f5.f) obj5).f10978a == 0) {
                    tf0 tf0Var = new tf0(1, e2Var3);
                    int i20 = this.f3306c;
                    if (list != null && !list.isEmpty() && !m10.i(i20).q()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f5832a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (y0Var != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i20).sendRequest(tL_payments_assignPlayMarketTransaction, new b8(i20, tf0Var, e2Var3, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    r1.i().d("telegram_premium", new f3(tf0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (y0Var != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i20).sendRequest(tL_payments_canPurchaseStore, new lx(i20, 5, e2Var3, ts0Var, y0Var, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    return;
                }
                return;
            case 14:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj4;
                org.telegram.ui.web.s0 s0Var = (org.telegram.ui.web.s0) obj;
                i7 i7Var = (i7) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                boolean z15 = ((TLObject) obj5) instanceof TLRPC.TL_boolTrue;
                int i21 = this.f3306c;
                if (z15) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.v0.w(i21, s0Var, i7Var, "write_access_requested", jSONObject);
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                } else if (tL_error2 != null) {
                    v0Var.Z(tL_error2.text);
                    return;
                } else {
                    String[] strArr2 = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v0Var.getContext());
                    String M0 = hd.M0(2131752898, null);
                    t1 t1Var2 = alertDialog$Builder.f28392a;
                    t1Var2.S = M0;
                    t1Var2.U = hd.M0(2131752899, null);
                    alertDialog$Builder.k(hd.M0(2131752909, null), new k8(4, v0Var, strArr2));
                    alertDialog$Builder.h(hd.M0(2131752904, null), new t70(22));
                    v0Var.Y(3, t1Var2, new org.telegram.ui.web.u(strArr2, i21, s0Var, i7Var, 1));
                    return;
                }
            default:
                c1 c1Var = (c1) obj5;
                p4.v vVar = (p4.v) obj4;
                i1 i1Var = (i1) obj;
                String str = i1Var.f54726b;
                p4.d0 d0Var = (p4.d0) obj3;
                int i22 = this.f3306c;
                p4.l lVar = (p4.l) obj2;
                ab.c0 c0Var = c1Var.f54601b;
                if (c0Var.x(vVar)) {
                    try {
                        p4.d d = p4.d.d(i1Var);
                        Object obj7 = d.f54617g;
                        int i23 = d.f54613b;
                        if (!d.b()) {
                            h2.a.l("MediaSessionStub", "Can't execute predefined custom command: " + str);
                            c1.r1(d0Var, vVar, i22, new m1(-6));
                            return;
                        }
                        i1 i1Var2 = d.f54612a;
                        if (i1Var2 != null) {
                            if (i1Var2.f54725a == 40010) {
                                z11 = true;
                            }
                            ja.p(z11);
                            c1Var.j1(lVar, i22, null, 40010, new p4.t0(new p4.w0(d), 1));
                            return;
                        }
                        g1 g1Var = d0Var.f54635t;
                        if (i23 == 1) {
                            if (obj7 == null) {
                                if (!g1Var.u()) {
                                    z12 = true;
                                }
                            } else {
                                z12 = ((Boolean) obj7).booleanValue();
                            }
                        }
                        if (z12) {
                            c1Var.o1(vVar, i22);
                        } else if (i23 == 31) {
                            obj7.getClass();
                            c1Var.q1(vVar, i22, 31, new p4.t0(new k8(11, new ab.z(9, (e2.l0) obj7, true), new p4.q0(19)), 1));
                        } else {
                            c1Var.q1(vVar, i22, i23, c1.s1(new p4.w0(d)));
                        }
                        c0Var.l(vVar);
                        return;
                    } catch (RuntimeException e11) {
                        h2.a.m("MediaSessionStub", "Failed to convert predefined custom command: " + str, e11);
                        c1.r1(d0Var, vVar, i22, new m1(-3));
                        return;
                    }
                }
                return;
        }
    }

    public l0(d8 d8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i7) {
        this.f3304a = 2;
        this.d = d8Var;
        this.f3305b = tLObject;
        this.f3307e = obj;
        this.f3308f = arrayList;
        this.h = zArr;
        this.f3306c = i7;
    }

    public l0(hi.d dVar, TLObject tLObject, u2[] u2VarArr, e6 e6Var, int i7, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.f3304a = 1;
        this.d = dVar;
        this.f3305b = tLObject;
        this.f3307e = u2VarArr;
        this.f3308f = e6Var;
        this.f3306c = i7;
        this.h = tL_messages_checkChatInvite;
    }

    public l0(Object obj, Object obj2, Object obj3, int i7, Object obj4, Object obj5, int i10) {
        this.f3304a = i10;
        this.f3305b = obj;
        this.d = obj2;
        this.f3307e = obj3;
        this.f3306c = i7;
        this.f3308f = obj4;
        this.h = obj5;
    }

    public l0(Object obj, Object obj2, Object obj3, Object obj4, int i7, Object obj5, int i10) {
        this.f3304a = i10;
        this.f3305b = obj;
        this.d = obj2;
        this.f3307e = obj3;
        this.f3308f = obj4;
        this.f3306c = i7;
        this.h = obj5;
    }

    public l0(r3 r3Var, int i7, TLObject tLObject, di.h hVar, ArrayList arrayList, HashSet hashSet) {
        this.f3304a = 3;
        this.d = r3Var;
        this.f3306c = i7;
        this.f3305b = tLObject;
        this.f3307e = hVar;
        this.f3308f = arrayList;
        this.h = hashSet;
    }

    public l0(si siVar, boolean[] zArr, ArrayList arrayList, Context context, e2 e2Var, int i7) {
        this.f3304a = 4;
        this.f3305b = siVar;
        this.d = zArr;
        this.f3307e = arrayList;
        this.f3308f = context;
        this.h = e2Var;
        this.f3306c = i7;
    }

    public l0(te0 te0Var, Integer[] numArr, int i7, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f3304a = 10;
        this.d = te0Var;
        this.f3307e = numArr;
        this.f3306c = i7;
        this.f3305b = tLObject;
        this.f3308f = arrayList;
        this.h = pollAnswerVoters;
    }

    public l0(pr prVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i7) {
        this.f3304a = 11;
        this.d = prVar;
        this.f3307e = fileLocation;
        this.f3308f = inputFile;
        this.f3305b = tLObject;
        this.h = fileLocation2;
        this.f3306c = i7;
    }

    public l0(n50 n50Var, e4 e4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7, a1 a1Var) {
        this.f3304a = 5;
        this.d = n50Var;
        this.f3307e = e4Var;
        this.f3308f = tL_error;
        this.f3305b = tLObject;
        this.f3306c = i7;
        this.h = a1Var;
    }

    public l0(org.telegram.ui.web.v0 v0Var, TLObject tLObject, int i7, org.telegram.ui.web.s0 s0Var, i7 i7Var, TLRPC.TL_error tL_error) {
        this.f3304a = 14;
        this.d = v0Var;
        this.f3305b = tLObject;
        this.f3306c = i7;
        this.f3307e = s0Var;
        this.f3308f = i7Var;
        this.h = tL_error;
    }
}
