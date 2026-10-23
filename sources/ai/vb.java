package ai;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ii;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.lh0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.t60;
import org.telegram.ui.b60;
import org.telegram.ui.b70;
import org.telegram.ui.bi0;
import org.telegram.ui.fk0;
import org.telegram.ui.fs;
import org.telegram.ui.h61;
import org.telegram.ui.pw0;
import org.telegram.ui.rk0;
import org.telegram.ui.ti;
import org.telegram.ui.uk0;
public final class vb implements Runnable {
    public final int f2328a;
    public final Object f2329b;
    public final int f2330c;
    public final Object d;
    public final Object e;
    public final Object f2331f;
    public final Object h;

    public vb(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f2328a = i11;
        this.f2329b = tLObject;
        this.f2330c = i10;
        this.d = obj;
        this.e = obj2;
        this.f2331f = obj3;
        this.h = obj4;
    }

    @Override
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.f2328a) {
            case 0:
                TLObject tLObject = (TLObject) this.f2329b;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.e;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f2331f;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                ((ei.d) this.d).setLoading(false);
                if (tLObject instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new org.telegram.ui.Components.xc(f3VarArr[0].topBulletinContainer, d6Var).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        return;
                    }
                    final long j10 = tL_starsSubscriptionPricing.amount;
                    final int i10 = this.f2330c;
                    ga.y(i10, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            Long l4 = (Long) obj2;
                            if ("paid".equals((String) obj) && l4.longValue() != 0) {
                                AndroidUtilities.runOnUIThread(new zb(l4, i10, j10, 0));
                            }
                        }
                    });
                    return;
                }
                new org.telegram.ui.Components.xc(f3VarArr[0].topBulletinContainer, d6Var).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                return;
            case 1:
                ci.v8.a((ci.v8) this.d, (TLObject) this.f2329b, this.e, (ArrayList) this.f2331f, (boolean[]) this.h, this.f2330c);
                return;
            case 2:
                m4.i1 i1Var = (m4.i1) this.d;
                m4.v vVar = (m4.v) this.f2329b;
                m4.o1 o1Var = (m4.o1) this.e;
                String str = o1Var.f16657b;
                m4.f0 f0Var = (m4.f0) this.f2331f;
                int i11 = this.f2330c;
                m4.l lVar = (m4.l) this.h;
                qi.e eVar = i1Var.f16564b;
                if (eVar.w(vVar)) {
                    try {
                        m4.d d = m4.d.d(o1Var);
                        Object obj = d.f16508g;
                        int i12 = d.f16505b;
                        if (!d.b()) {
                            e2.a.l("MediaSessionStub", "Can't execute predefined custom command: " + str);
                            m4.i1.P0(f0Var, vVar, i11, new m4.s1(-6));
                            return;
                        }
                        m4.o1 o1Var2 = d.f16504a;
                        boolean z10 = false;
                        if (o1Var2 != null) {
                            if (o1Var2.f16656a == 40010) {
                                z10 = true;
                            }
                            v7.u6.p(z10);
                            i1Var.H0(lVar, i11, null, 40010, new m4.z0(new m4.c1(d), 1));
                            return;
                        }
                        m4.m1 m1Var = f0Var.f16534t;
                        if (i12 == 1) {
                            if (obj == null) {
                                if (!m1Var.t()) {
                                    z10 = true;
                                }
                            } else {
                                z10 = ((Boolean) obj).booleanValue();
                            }
                        }
                        if (z10) {
                            i1Var.M0(vVar, i11);
                        } else if (i12 == 31) {
                            obj.getClass();
                            i1Var.O0(vVar, i11, 31, new m4.z0(new m4.w0(1, new ci.f(2, (b2.o0) obj, true), new m4.v0(8)), 1));
                        } else {
                            i1Var.O0(vVar, i11, i12, m4.i1.Q0(new m4.c1(d)));
                        }
                        eVar.m(vVar);
                        return;
                    } catch (RuntimeException e) {
                        e2.a.m("MediaSessionStub", "Failed to convert predefined custom command: " + str, e);
                        m4.i1.P0(f0Var, vVar, i11, new m4.s1(-3));
                        return;
                    }
                }
                return;
            case 3:
                ((ChatObject.Call) this.d).lambda$loadUnknownParticipants$5(this.f2330c, (TLObject) this.f2329b, (ChatObject.Call.OnParticipantsLoad) this.e, (ArrayList) this.f2331f, (HashSet) this.h);
                return;
            case 4:
                ((LocaleController) this.d).lambda$saveRemoteLocaleStrings$10(this.f2330c, (LocaleController.LocaleInfo) this.f2329b, (TLRPC.TL_langPackDifference) this.e, (HashMap) this.f2331f, (Runnable) this.h);
                return;
            case 5:
                ((MediaDataController) this.d).lambda$removeMultipleStickerSets$111((boolean[]) this.f2329b, (ArrayList) this.e, (Context) this.f2331f, (org.telegram.ui.ActionBar.n2) this.h, this.f2330c);
                return;
            case 6:
                b70 b70Var = (b70) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f2331f;
                TLObject tLObject2 = (TLObject) this.f2329b;
                org.telegram.ui.f1 f1Var = (org.telegram.ui.f1) this.h;
                b70Var.f35531r = false;
                if (!((org.telegram.ui.j4) this.e).e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            int i13 = this.f2330c;
                            MessagesController.getInstance(i13).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i13).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            b70Var.f35530n = chat;
                            if (chat.left && !chat.kicked) {
                                f1Var.a(0, false);
                                return;
                            } else {
                                f1Var.a(4, false);
                                return;
                            }
                        }
                        f1Var.a(4, false);
                        return;
                    }
                    f1Var.a(4, false);
                    return;
                }
                return;
            case 7:
                TLObject tLObject3 = (TLObject) this.f2329b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.d;
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.f2331f;
                b60 b60Var = (b60) this.h;
                boolean z11 = tLObject3 instanceof TLRPC.Updates;
                int i14 = this.f2330c;
                int i15 = 0;
                if (z11) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    MessagesController.getInstance(i14).putUsers(updates.users, false);
                    MessagesController.getInstance(i14).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i15 < size) {
                        Object obj2 = findUpdatesAndRemove.get(i15);
                        i15++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj2).call;
                    }
                    b2Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f20297id = groupCall.f20290id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.m9.o0(context, i14, tL_inputGroupCall, groupCall.invite_link, d6Var2, true, true);
                        AndroidUtilities.runOnUIThread(b60Var);
                        return;
                    }
                    return;
                } else if (tLObject3 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject3;
                    MessagesController.getInstance(i14).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i14).putChats(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f20297id = groupCall2.f20290id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i14).sendRequest(exportgroupcallinvite, new ii(b2Var, context, i14, exportgroupcallinvite, d6Var2, b60Var));
                    return;
                } else {
                    b2Var.dismiss();
                    AndroidUtilities.runOnUIThread(b60Var);
                    return;
                }
            case 8:
                new h61((Context) this.d, (TLRPC.Chat) this.f2329b, (TLRPC.User) this.e, new org.telegram.ui.Components.e2(this.f2330c, (MessagesStorage.BooleanCallback) this.h, 0), (org.telegram.ui.ActionBar.d6) this.f2331f).show();
                return;
            case 9:
                org.telegram.ui.Components.v9.a((org.telegram.ui.Components.v9) this.d, (Runnable[]) this.f2329b, (Bitmap) this.e, (t60) this.f2331f, this.f2330c, (w7.w5[]) this.h);
                return;
            case 10:
                lh0.n((lh0) this.d, (Integer[]) this.e, this.f2330c, (TLObject) this.f2329b, (ArrayList) this.f2331f, (TLRPC.PollAnswerVoters) this.h);
                return;
            case 11:
                fs.Y((fs) this.d, (TLRPC.FileLocation) this.e, (TLRPC.InputFile) this.f2331f, (TLObject) this.f2329b, (TLRPC.FileLocation) this.h, this.f2330c);
                return;
            case 12:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                String[] strArr = (String[]) this.f2329b;
                Context context2 = (Context) this.e;
                rk0 rk0Var = (rk0) this.f2331f;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    uk0.c(context2, this.f2330c, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new qy(16, strArr, rk0Var), true, new ah.j(23), n2Var.getResourceProvider());
                    return;
                }
                rk0Var.run();
                return;
            case 13:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f2329b;
                List<Purchase> list = (List) this.e;
                c5.g gVar = (c5.g) this.f2331f;
                pw0 pw0Var = (pw0) this.h;
                if (((c5.i) this.d).f4752a == 0) {
                    bi0 bi0Var = new bi0(1, n2Var2);
                    int i16 = this.f2330c;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i16).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f6269a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (gVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i16).sendRequest(tL_payments_assignPlayMarketTransaction, new ci.t8(i16, bi0Var, n2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener("telegram_premium", new org.telegram.ui.j3(bi0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (gVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i16).sendRequest(tL_payments_canPurchaseStore, new ii(i16, 5, n2Var2, pw0Var, gVar, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    return;
                }
                return;
            case 14:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.d;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.e;
                ci.z7 z7Var = (ci.z7) this.f2331f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                boolean z12 = ((TLObject) this.f2329b) instanceof TLRPC.TL_boolTrue;
                int i17 = this.f2330c;
                if (z12) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.a1.w(i17, x0Var, z7Var, "write_access_requested", jSONObject);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                } else if (tL_error2 != null) {
                    a1Var.Y(tL_error2.text);
                    return;
                } else {
                    String[] strArr2 = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a1Var.getContext());
                    alertDialog$Builder.f20609a.R = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder.f20609a.T = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new org.telegram.ui.web.m(1, a1Var, strArr2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new fk0(18));
                    a1Var.X(3, alertDialog$Builder.f20609a, new org.telegram.ui.web.x(strArr2, i17, x0Var, z7Var, 1));
                    return;
                }
            default:
                TLObject tLObject4 = (TLObject) this.f2329b;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.e;
                ti tiVar = (ti) this.f2331f;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) this.h;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject4;
                    int i18 = this.f2330c;
                    MessagesController.getInstance(i18).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(UserConfig.getInstance(i18).clientUserId));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && user != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 1000);
                        if (closestPhotoSizeWithSize != null && photoSize2 != null && photoSize2.location != null) {
                            FileLoader.getInstance(i18).getPathToAttach(photoSize2.location, true).renameTo(FileLoader.getInstance(i18).getPathToAttach(closestPhotoSizeWithSize, true));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(photoSize2.location.volume_id);
                            sb2.append("_");
                            String n10 = a1.g.n(photoSize2.location.local_id, "@50_50", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            photoSize = closestPhotoSizeWithSize2;
                            sb3.append(closestPhotoSizeWithSize.location.volume_id);
                            sb3.append("_");
                            ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(i18, user, 1), false);
                        } else {
                            photoSize = closestPhotoSizeWithSize2;
                        }
                        if (photoSize != null && photoSize3 != null && photoSize3.location != null) {
                            FileLoader.getInstance(i18).getPathToAttach(photoSize3.location, true).renameTo(FileLoader.getInstance(i18).getPathToAttach(photoSize, true));
                        }
                        zf.e0.a(tL_photos_photo.photo, user, false);
                        UserConfig.getInstance(i18).setCurrentUser(user);
                        UserConfig.getInstance(i18).saveConfig(true);
                        tiVar.run();
                        org.telegram.ui.Components.xc.a0(d5Var.getLastFragment()).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new org.telegram.ui.Wallet.j(i18, d5Var, 11)), null).j();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public vb(Context context, TLRPC.Chat chat, TLRPC.User user, int i10, MessagesStorage.BooleanCallback booleanCallback, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f2328a = 8;
        this.d = context;
        this.f2329b = chat;
        this.e = user;
        this.f2330c = i10;
        this.h = booleanCallback;
        this.f2331f = d6Var;
    }

    public vb(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f2328a = i11;
        this.d = obj;
        this.f2330c = i10;
        this.f2329b = obj2;
        this.e = obj3;
        this.f2331f = obj4;
        this.h = obj5;
    }

    public vb(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.f2328a = i11;
        this.d = obj;
        this.f2329b = obj2;
        this.e = obj3;
        this.f2330c = i10;
        this.f2331f = obj4;
        this.h = obj5;
    }

    public vb(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5, int i11) {
        this.f2328a = i11;
        this.d = obj;
        this.f2329b = obj2;
        this.e = obj3;
        this.f2331f = obj4;
        this.f2330c = i10;
        this.h = obj5;
    }

    public vb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, int i11) {
        this.f2328a = i11;
        this.d = obj;
        this.f2329b = obj2;
        this.e = obj3;
        this.f2331f = obj4;
        this.h = obj5;
        this.f2330c = i10;
    }

    public vb(lh0 lh0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f2328a = 10;
        this.d = lh0Var;
        this.e = numArr;
        this.f2330c = i10;
        this.f2329b = tLObject;
        this.f2331f = arrayList;
        this.h = pollAnswerVoters;
    }

    public vb(fs fsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.f2328a = 11;
        this.d = fsVar;
        this.e = fileLocation;
        this.f2331f = inputFile;
        this.f2329b = tLObject;
        this.h = fileLocation2;
        this.f2330c = i10;
    }

    public vb(b70 b70Var, org.telegram.ui.j4 j4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.f1 f1Var) {
        this.f2328a = 6;
        this.d = b70Var;
        this.e = j4Var;
        this.f2331f = tL_error;
        this.f2329b = tLObject;
        this.f2330c = i10;
        this.h = f1Var;
    }

    public vb(org.telegram.ui.web.a1 a1Var, TLObject tLObject, int i10, org.telegram.ui.web.x0 x0Var, ci.z7 z7Var, TLRPC.TL_error tL_error) {
        this.f2328a = 14;
        this.d = a1Var;
        this.f2329b = tLObject;
        this.f2330c = i10;
        this.e = x0Var;
        this.f2331f = z7Var;
        this.h = tL_error;
    }
}
