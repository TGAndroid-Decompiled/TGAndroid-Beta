package m4;

import ag.d3;
import ag.f3;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.android.billingclient.api.Purchase;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.ad;
import org.telegram.messenger.as;
import org.telegram.messenger.at;
import org.telegram.messenger.b8;
import org.telegram.messenger.bd;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.ed;
import org.telegram.messenger.f8;
import org.telegram.messenger.ic;
import org.telegram.messenger.is;
import org.telegram.messenger.jc;
import org.telegram.messenger.k20;
import org.telegram.messenger.kj;
import org.telegram.messenger.u3;
import org.telegram.messenger.vi;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.wp;
import org.telegram.messenger.zx;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.ah0;
import org.telegram.ui.cp0;
import org.telegram.ui.e01;
import org.telegram.ui.eu0;
import org.telegram.ui.f4;
import org.telegram.ui.fj0;
import org.telegram.ui.hj0;
import org.telegram.ui.j9;
import org.telegram.ui.k50;
import org.telegram.ui.l60;
import org.telegram.ui.ns;
import org.telegram.ui.pa1;
import org.telegram.ui.q31;
import org.telegram.ui.rh;
import rh.e6;
import th.l6;
import v7.t6;
import w7.y5;
public final class a1 implements Runnable {
    public final int f12694a;
    public final int f12695b;
    public final Object f12696c;
    public final Object d;
    public final Object e;
    public final Object f12697f;
    public final Object h;

    public a1(KeyEvent.Callback callback, Object obj, int i10, Object obj2, Object obj3, TLObject tLObject, int i11) {
        this.f12694a = i11;
        this.f12696c = callback;
        this.d = obj;
        this.f12695b = i10;
        this.e = obj2;
        this.f12697f = obj3;
        this.h = tLObject;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        String[] split;
        Locale locale;
        s4.c1 T;
        switch (this.f12694a) {
            case 0:
                boolean z11 = false;
                j1 j1Var = (j1) this.f12696c;
                w wVar = (w) this.d;
                p1 p1Var = (p1) this.e;
                String str = p1Var.f12898b;
                f0 f0Var = (f0) this.f12697f;
                int i11 = this.f12695b;
                m mVar = (m) this.h;
                xa.n nVar = j1Var.f12790b;
                if (nVar.L(wVar)) {
                    try {
                        e d = e.d(p1Var);
                        Object obj = d.f12733g;
                        int i12 = d.f12730b;
                        if (!d.b()) {
                            e2.a.l("MediaSessionStub", "Can't execute predefined custom command: " + str);
                            j1.R0(f0Var, wVar, i11, new t1(-6));
                            return;
                        }
                        p1 p1Var2 = d.f12729a;
                        if (p1Var2 != null) {
                            if (p1Var2.f12897a == 40010) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            t6.p(z10);
                            j1Var.J0(mVar, i11, null, 40010, new z0(new d1(d), 1));
                            return;
                        }
                        n1 n1Var = f0Var.f12755t;
                        if (i12 == 1) {
                            if (obj == null) {
                                if (!n1Var.t()) {
                                    z11 = true;
                                }
                            } else {
                                z11 = ((Boolean) obj).booleanValue();
                            }
                        }
                        if (z11) {
                            j1Var.O0(wVar, i11);
                        } else if (i12 == 31) {
                            obj.getClass();
                            j1Var.Q0(wVar, i11, 31, new z0(new ag.m(23, new ag.w0(1, (b2.p0) obj, true), new v0(11)), 1));
                        } else {
                            j1Var.Q0(wVar, i11, i12, j1.S0(new d1(d)));
                        }
                        nVar.u(wVar);
                        return;
                    } catch (RuntimeException e) {
                        e2.a.m("MediaSessionStub", "Failed to convert predefined custom command: " + str, e);
                        j1.R0(f0Var, wVar, i11, new t1(-3));
                        return;
                    }
                }
                return;
            case 1:
                u3 u3Var = (u3) this.f12696c;
                int i13 = this.f12695b;
                TLObject tLObject = (TLObject) this.d;
                org.telegram.messenger.voip.d0 d0Var = (org.telegram.messenger.voip.d0) this.e;
                ArrayList arrayList = (ArrayList) this.f12697f;
                HashSet hashSet = (HashSet) this.h;
                HashSet hashSet2 = u3Var.f18370n;
                ArrayList arrayList2 = u3Var.e;
                if (u3Var.G.remove(Integer.valueOf(i13))) {
                    if (tLObject != null) {
                        TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                        wp.r1(u3Var.C.f15043a).V3(groupparticipants.users, false);
                        wp.r1(u3Var.C.f15043a).P3(groupparticipants.chats, false);
                        int size = groupparticipants.participants.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            TLRPC.GroupCallParticipant groupCallParticipant = groupparticipants.participants.get(i14);
                            long C1 = kj.C1(groupCallParticipant.peer);
                            TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) u3Var.d.f(C1);
                            if (groupCallParticipant2 != null) {
                                arrayList2.remove(groupCallParticipant2);
                                u3Var.n(groupCallParticipant2, false);
                            }
                            u3Var.d.k(groupCallParticipant, C1);
                            arrayList2.add(groupCallParticipant);
                            u3Var.n(groupCallParticipant, true);
                            if (hashSet2.contains(Long.valueOf(C1))) {
                                Long valueOf = Long.valueOf(C1);
                                hashSet2.remove(valueOf);
                                u3Var.f18366j.remove(valueOf);
                            }
                        }
                        if (u3Var.f18361b.participants_count < u3Var.d.m()) {
                            u3Var.f18361b.participants_count = u3Var.d.m();
                        }
                        u3Var.z();
                        at.f(u3Var.C.f15043a).k(166, Long.valueOf(u3Var.f18362c), Long.valueOf(u3Var.f18361b.f19804id), Boolean.FALSE);
                        if (d0Var != null) {
                            ((VoIPService) d0Var.f18789c).lambda$createGroupInstance$69(d0Var.f18788b, (int[]) d0Var.d, arrayList);
                        } else {
                            u3Var.w();
                        }
                    }
                    hashSet.removeAll(arrayList);
                    return;
                }
                return;
            case 2:
                dd ddVar = (dd) this.f12696c;
                int i15 = this.f12695b;
                ad adVar = (ad) this.d;
                TLRPC.TL_langPackDifference tL_langPackDifference = (TLRPC.TL_langPackDifference) this.e;
                HashMap hashMap = (HashMap) this.f12697f;
                Runnable runnable = (Runnable) this.h;
                if (i15 == 0) {
                    adVar.h = tL_langPackDifference.version;
                } else {
                    adVar.f14596i = tL_langPackDifference.version;
                }
                ddVar.X0();
                try {
                    if (ddVar.B == adVar) {
                        if (!TextUtils.isEmpty(adVar.f14594f)) {
                            split = adVar.f14594f.split("_");
                        } else if (!TextUtils.isEmpty(adVar.e)) {
                            split = adVar.e.split("_");
                        } else {
                            split = adVar.f14593c.split("_");
                        }
                        if (split.length == 1) {
                            locale = new Locale(split[0]);
                        } else {
                            locale = new Locale(split[0], split[1]);
                        }
                        ddVar.C = adVar.f14593c;
                        SharedPreferences.Editor edit = wp.d1().edit();
                        edit.putString("language", adVar.b());
                        edit.commit();
                        ?? obj2 = new Object();
                        obj2.a(hashMap);
                        ddVar.V = new ii.b(obj2);
                        ddVar.W = dd.h(hashMap);
                        ddVar.f15365y = locale;
                        ddVar.B = adVar;
                        if (!TextUtils.isEmpty(adVar.f14594f)) {
                            ddVar.A = (bd) ddVar.f15364x.get(ddVar.B.f14594f);
                        }
                        if (ddVar.A == null) {
                            bd bdVar = (bd) ddVar.f15364x.get(ddVar.f15365y.getLanguage());
                            ddVar.A = bdVar;
                            if (bdVar == null) {
                                ddVar.A = (bd) ddVar.f15364x.get("en");
                            }
                        }
                        ddVar.D = true;
                        Locale.setDefault(ddVar.f15365y);
                        Configuration configuration = new Configuration();
                        configuration.locale = ddVar.f15365y;
                        org.telegram.messenger.w0.f18945b.getResources().updateConfiguration(configuration, org.telegram.messenger.w0.f18945b.getResources().getDisplayMetrics());
                        ddVar.D = false;
                        e01.f36706s = false;
                    } else {
                        f8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                    }
                    i10 = 0;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    i10 = 0;
                    ddVar.D = false;
                }
                ddVar.V0();
                at.e().k(274, new Object[i10]);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                vi viVar = (vi) this.f12696c;
                boolean[] zArr = (boolean[]) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                Context context = (Context) this.f12697f;
                k2 k2Var = (k2) this.h;
                int i16 = this.f12695b;
                viVar.getClass();
                if (!zArr[0]) {
                    zArr[0] = true;
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        viVar.h2(context, 0, k2Var, null, true, (TLObject) arrayList3.get(i17), ((TLRPC.TL_messages_stickerSet) arrayList3.get(i17)).set, null, i16, false);
                    }
                    return;
                }
                return;
            case 4:
                l60 l60Var = (l60) this.f12696c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.f12697f;
                int i18 = this.f12695b;
                org.telegram.ui.c1 c1Var = (org.telegram.ui.c1) this.h;
                l60Var.f39100r = false;
                if (!((f4) this.d).e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            wp.r1(i18).V3(tL_contacts_resolvedPeer.users, false);
                            wp.r1(i18).P3(tL_contacts_resolvedPeer.chats, false);
                            is.a0(i18).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            l60Var.f39099n = chat;
                            if (chat.left && !chat.kicked) {
                                c1Var.a(0, false);
                                return;
                            } else {
                                c1Var.a(4, false);
                                return;
                            }
                        }
                        c1Var.a(4, false);
                        return;
                    }
                    c1Var.a(4, false);
                    return;
                }
                return;
            case 5:
                TLObject tLObject3 = (TLObject) this.f12696c;
                int i19 = this.f12695b;
                x1 x1Var = (x1) this.d;
                Context context2 = (Context) this.e;
                p6 p6Var = (p6) this.f12697f;
                k50 k50Var = (k50) this.h;
                if (tLObject3 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    wp.r1(i19).V3(updates.users, false);
                    wp.r1(i19).P3(updates.chats, false);
                    ArrayList z02 = wp.z0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = z02.size();
                    TLRPC.GroupCall groupCall = null;
                    int i20 = 0;
                    while (i20 < size2) {
                        Object obj3 = z02.get(i20);
                        i20++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj3).call;
                    }
                    x1Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f19811id = groupCall.f19804id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        j9.n0(context2, i19, tL_inputGroupCall, groupCall.invite_link, p6Var, true, true);
                        org.telegram.messenger.i0.g3(k50Var);
                        return;
                    }
                    return;
                } else if (tLObject3 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject3;
                    wp.r1(i19).V3(groupcall.users, false);
                    wp.r1(i19).P3(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f19811id = groupCall2.f19804id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i19).sendRequest(exportgroupcallinvite, new zx(x1Var, context2, i19, exportgroupcallinvite, p6Var, k50Var));
                    return;
                } else {
                    x1Var.dismiss();
                    org.telegram.messenger.i0.g3(k50Var);
                    return;
                }
            case 6:
                new q31((Context) this.f12696c, (TLRPC.Chat) this.d, (TLRPC.User) this.e, new d3(this.f12695b, (as) this.f12697f, 24), (p6) this.h).show();
                return;
            case 7:
                f9.a((f9) this.f12696c, (Runnable[]) this.d, (Bitmap) this.e, (org.telegram.ui.Components.k50) this.f12697f, this.f12695b, (y5[]) this.h);
                return;
            case 8:
                tf0 tf0Var = (tf0) this.f12696c;
                int i21 = this.f12695b;
                TLObject tLObject4 = (TLObject) this.e;
                ArrayList arrayList4 = (ArrayList) this.f12697f;
                TLRPC.PollAnswerVoters pollAnswerVoters = (TLRPC.PollAnswerVoters) this.h;
                pf0 pf0Var = tf0Var.f30636j1;
                ArrayList arrayList5 = tf0Var.f30645t1;
                nf0 nf0Var = tf0Var.f30635i1;
                ArrayList arrayList6 = tf0Var.f30648w1;
                arrayList6.remove(((Integer[]) this.d)[i21]);
                if (tLObject4 != null) {
                    TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject4;
                    wp.r1(tf0Var.f21584a).V3(tL_messages_votesList.users, false);
                    if (!tL_messages_votesList.votes.isEmpty()) {
                        arrayList4.add(new sf0(tL_messages_votesList, pollAnswerVoters.option));
                    }
                    if (arrayList6.isEmpty()) {
                        int size3 = arrayList4.size();
                        boolean z12 = false;
                        for (int i22 = 0; i22 < size3; i22++) {
                            sf0 sf0Var = (sf0) arrayList4.get(i22);
                            int size4 = arrayList5.size();
                            int i23 = 0;
                            while (true) {
                                if (i23 < size4) {
                                    sf0 sf0Var2 = (sf0) arrayList5.get(i23);
                                    if (Arrays.equals(sf0Var.d, sf0Var2.d)) {
                                        sf0Var2.f30281c = sf0Var.f30281c;
                                        z12 = (sf0Var2.f30279a == sf0Var.f30279a && sf0Var2.f30280b.size() == sf0Var.f30280b.size()) ? true : true;
                                        sf0Var2.f30279a = sf0Var.f30279a;
                                        sf0Var2.f30280b = sf0Var.f30280b;
                                    } else {
                                        i23++;
                                    }
                                }
                            }
                        }
                        tf0Var.C1 = false;
                        if (nf0Var != null) {
                            if (tf0Var.A0 == 0 && tf0Var.G == null && !z12) {
                                int childCount = nf0Var.getChildCount();
                                ArrayList arrayList7 = new ArrayList();
                                for (int i24 = 0; i24 < childCount; i24++) {
                                    View childAt = nf0Var.getChildAt(i24);
                                    if (childAt instanceof PollVotesAlert$UserCell) {
                                        View F = nf0Var.F(childAt);
                                        if (F == null) {
                                            T = null;
                                        } else {
                                            T = nf0Var.T(F);
                                        }
                                        if (T != null) {
                                            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                            pollVotesAlert$UserCell.D = arrayList7;
                                            pollVotesAlert$UserCell.setEnabled(true);
                                            pf0Var.y(T);
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
                                tf0Var.C1 = false;
                                return;
                            }
                            if (z12) {
                                tf0Var.L0();
                            }
                            pf0Var.X(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                tf0Var.dismiss();
                return;
            case 9:
                ns.c0((ns) this.f12696c, (TLRPC.FileLocation) this.d, (TLRPC.InputFile) this.e, (TLObject) this.f12697f, (TLRPC.FileLocation) this.h, this.f12695b);
                return;
            case 10:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f12696c;
                String[] strArr = (String[]) this.d;
                Context context3 = (Context) this.e;
                int i25 = this.f12695b;
                fj0 fj0Var = (fj0) this.f12697f;
                k2 k2Var2 = (k2) this.h;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    hj0.c(context3, i25, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new vg(25, strArr, fj0Var), true, new f3(13), k2Var2.getResourceProvider());
                    return;
                } else {
                    fj0Var.run();
                    return;
                }
            case 11:
                k2 k2Var3 = (k2) this.d;
                List<Purchase> list = (List) this.e;
                int i26 = this.f12695b;
                ba.a aVar = (ba.a) this.f12697f;
                eu0 eu0Var = (eu0) this.h;
                if (((c5.g) this.f12696c).f3785a == 0) {
                    ah0 ah0Var = new ah0(1, k2Var3);
                    if (list != null && !list.isEmpty() && !e20.i(i26).q()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f4258a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (aVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i26).sendRequest(tL_payments_assignPlayMarketTransaction, new org.telegram.ui.b0(i26, ah0Var, k2Var3, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    org.telegram.messenger.u1.i().d("telegram_premium", new org.telegram.ui.f3(ah0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (aVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i26).sendRequest(tL_payments_canPurchaseStore, new zx(k2Var3, tL_inputStorePaymentPremiumSubscription2, eu0Var, aVar, i26, tL_payments_canPurchaseStore, 5));
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f12696c;
                int i27 = this.f12695b;
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.e;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f12697f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                if (((TLObject) this.d) instanceof TLRPC.TL_boolTrue) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.z0.w(i27, v0Var, x0Var, "write_access_requested", jSONObject);
                        return;
                    } catch (Exception e10) {
                        f8.g(e10, true);
                        return;
                    }
                } else if (tL_error2 != null) {
                    z0Var.Y(tL_error2.text);
                    return;
                } else {
                    String[] strArr2 = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z0Var.getContext());
                    alertDialog$Builder.f20135a.R = dd.L0(2131752898, null);
                    alertDialog$Builder.f20135a.T = dd.L0(2131752899, null);
                    alertDialog$Builder.k(dd.L0(2131752909, null), new cp0(29, z0Var, strArr2));
                    alertDialog$Builder.h(dd.L0(2131752904, null), new pa1(7));
                    z0Var.X(3, alertDialog$Builder.f20135a, new org.telegram.ui.web.u(strArr2, i27, v0Var, x0Var, 1));
                    return;
                }
            case 13:
                TLObject tLObject5 = (TLObject) this.f12696c;
                int i28 = this.f12695b;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.d;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.e;
                rh rhVar = (rh) this.f12697f;
                z4 z4Var = (z4) this.h;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    wp.r1(i28).V3(tL_photos_photo.users, false);
                    TLRPC.User Z1 = wp.r1(i28).Z1(Long.valueOf(e20.i(i28).f15524n));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && Z1 != null) {
                        TLRPC.PhotoSize w9 = b8.w(photo.sizes, 100, false, null, false);
                        TLRPC.PhotoSize w10 = b8.w(tL_photos_photo.photo.sizes, 1000, false, null, false);
                        if (w9 != null && photoSize != null && photoSize.location != null) {
                            b8.G(i28);
                            File K = b8.K(w9, null, true, true);
                            b8.G(i28);
                            b8.K(photoSize.location, null, true, true).renameTo(K);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(photoSize.location.volume_id);
                            sb2.append("_");
                            String p5 = a1.g.p(sb2, photoSize.location.local_id, "@50_50");
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(w9.location.volume_id);
                            sb3.append("_");
                            ic.D().S(p5, a1.g.p(sb3, w9.location.local_id, "@50_50"), jc.l(i28, 1, Z1));
                        }
                        if (w10 != null && photoSize2 != null && photoSize2.location != null) {
                            b8.G(i28);
                            File K2 = b8.K(w10, null, true, true);
                            b8.G(i28);
                            b8.K(photoSize2.location, null, true, true).renameTo(K2);
                        }
                        rf.z.a(tL_photos_photo.photo, Z1, false);
                        e20.i(i28).w(Z1);
                        e20.i(i28).v(true);
                        rhVar.run();
                        cc.a0(z4Var.getLastFragment()).V(Collections.singletonList(Z1), org.telegram.messenger.i0.W2(dd.L0(2131754219, null)), org.telegram.messenger.i0.T2(dd.L0(2131754220, null), new org.telegram.utils.twidget.v(i28, z4Var, 1)), null).j();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                TLObject tLObject6 = (TLObject) this.d;
                z2[] z2VarArr = (z2[]) this.e;
                p6 p6Var2 = (p6) this.f12697f;
                final int i29 = this.f12695b;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                ((vh.d) this.f12696c).setLoading(false);
                if (tLObject6 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject6;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new cc(z2VarArr[0].E, p6Var2).t(dd.L0(2131743904, null), null).k(false);
                        return;
                    }
                    final long j10 = tL_starsSubscriptionPricing.amount;
                    e6.y(i29, false).h0(tL_messages_checkChatInvite.hash, chatInvite, new k20() {
                        @Override
                        public final void a(Object obj4, Object obj5) {
                            Long l4 = (Long) obj5;
                            if ("paid".equals((String) obj4) && l4.longValue() != 0) {
                                org.telegram.messenger.i0.g3(new ed(l4, i29, j10, 7));
                            }
                        }
                    });
                    return;
                }
                new cc(z2VarArr[0].E, p6Var2).t(dd.L0(2131748923, null), null).k(false);
                return;
            default:
                l6.a((l6) this.f12696c, (TLObject) this.d, this.e, (ArrayList) this.f12697f, (boolean[]) this.h, this.f12695b);
                return;
        }
    }

    public a1(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f12694a = i11;
        this.f12696c = obj;
        this.f12695b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f12697f = obj4;
        this.h = obj5;
    }

    public a1(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.f12694a = i11;
        this.f12696c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f12695b = i10;
        this.f12697f = obj4;
        this.h = obj5;
    }

    public a1(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5, int i11) {
        this.f12694a = i11;
        this.f12696c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f12697f = obj4;
        this.f12695b = i10;
        this.h = obj5;
    }

    public a1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, int i11) {
        this.f12694a = i11;
        this.f12696c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f12697f = obj4;
        this.h = obj5;
        this.f12695b = i10;
    }
}
