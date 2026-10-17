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
import org.telegram.messenger.gi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.kh0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.t60;
import org.telegram.ui.d60;
import org.telegram.ui.d70;
import org.telegram.ui.di0;
import org.telegram.ui.hk0;
import org.telegram.ui.hs;
import org.telegram.ui.j61;
import org.telegram.ui.rw0;
import org.telegram.ui.tk0;
import org.telegram.ui.vi;
import org.telegram.ui.wk0;
public final class ub implements Runnable {
    public final int f2272a;
    public final Object f2273b;
    public final int f2274c;
    public final Object d;
    public final Object e;
    public final Object f2275f;
    public final Object h;

    public ub(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f2272a = i11;
        this.f2273b = tLObject;
        this.f2274c = i10;
        this.d = obj;
        this.e = obj2;
        this.f2275f = obj3;
        this.h = obj4;
    }

    @Override
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.f2272a) {
            case 0:
                TLObject tLObject = (TLObject) this.f2273b;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.e;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f2275f;
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
                    final int i10 = this.f2274c;
                    fa.y(i10, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            Long l4 = (Long) obj2;
                            if ("paid".equals((String) obj) && l4.longValue() != 0) {
                                AndroidUtilities.runOnUIThread(new yb(l4, i10, j10, 0));
                            }
                        }
                    });
                    return;
                }
                new org.telegram.ui.Components.xc(f3VarArr[0].topBulletinContainer, d6Var).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                return;
            case 1:
                ci.v8.a((ci.v8) this.d, (TLObject) this.f2273b, this.e, (ArrayList) this.f2275f, (boolean[]) this.h, this.f2274c);
                return;
            case 2:
                m4.i1 i1Var = (m4.i1) this.d;
                m4.v vVar = (m4.v) this.f2273b;
                m4.o1 o1Var = (m4.o1) this.e;
                String str = o1Var.f16651b;
                m4.f0 f0Var = (m4.f0) this.f2275f;
                int i11 = this.f2274c;
                m4.l lVar = (m4.l) this.h;
                qi.e eVar = i1Var.f16558b;
                if (eVar.w(vVar)) {
                    try {
                        m4.d d = m4.d.d(o1Var);
                        Object obj = d.f16502g;
                        int i12 = d.f16499b;
                        if (!d.b()) {
                            e2.a.l("MediaSessionStub", "Can't execute predefined custom command: " + str);
                            m4.i1.P0(f0Var, vVar, i11, new m4.s1(-6));
                            return;
                        }
                        m4.o1 o1Var2 = d.f16498a;
                        boolean z10 = false;
                        if (o1Var2 != null) {
                            if (o1Var2.f16650a == 40010) {
                                z10 = true;
                            }
                            v7.u6.p(z10);
                            i1Var.H0(lVar, i11, null, 40010, new m4.z0(new m4.c1(d), 1));
                            return;
                        }
                        m4.m1 m1Var = f0Var.f16528t;
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
                            i1Var.O0(vVar, i11, 31, new m4.z0(new m4.y0(0, new ci.f(2, (b2.o0) obj, true), new m4.v0(8)), 1));
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
                ((ChatObject.Call) this.d).lambda$loadUnknownParticipants$5(this.f2274c, (TLObject) this.f2273b, (ChatObject.Call.OnParticipantsLoad) this.e, (ArrayList) this.f2275f, (HashSet) this.h);
                return;
            case 4:
                ((LocaleController) this.d).lambda$saveRemoteLocaleStrings$10(this.f2274c, (LocaleController.LocaleInfo) this.f2273b, (TLRPC.TL_langPackDifference) this.e, (HashMap) this.f2275f, (Runnable) this.h);
                return;
            case 5:
                ((MediaDataController) this.d).lambda$removeMultipleStickerSets$111((boolean[]) this.f2273b, (ArrayList) this.e, (Context) this.f2275f, (org.telegram.ui.ActionBar.n2) this.h, this.f2274c);
                return;
            case 6:
                d70 d70Var = (d70) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f2275f;
                TLObject tLObject2 = (TLObject) this.f2273b;
                org.telegram.ui.f1 f1Var = (org.telegram.ui.f1) this.h;
                d70Var.f36089r = false;
                if (!((org.telegram.ui.j4) this.e).e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            int i13 = this.f2274c;
                            MessagesController.getInstance(i13).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i13).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            d70Var.f36088n = chat;
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
                TLObject tLObject3 = (TLObject) this.f2273b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.d;
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.f2275f;
                d60 d60Var = (d60) this.h;
                boolean z11 = tLObject3 instanceof TLRPC.Updates;
                int i14 = this.f2274c;
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
                        tL_inputGroupCall.f20289id = groupCall.f20282id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.m9.o0(context, i14, tL_inputGroupCall, groupCall.invite_link, d6Var2, true, true);
                        AndroidUtilities.runOnUIThread(d60Var);
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
                    tL_inputGroupCall2.f20289id = groupCall2.f20282id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i14).sendRequest(exportgroupcallinvite, new gi(b2Var, context, i14, exportgroupcallinvite, d6Var2, d60Var));
                    return;
                } else {
                    b2Var.dismiss();
                    AndroidUtilities.runOnUIThread(d60Var);
                    return;
                }
            case 8:
                new j61((Context) this.d, (TLRPC.Chat) this.f2273b, (TLRPC.User) this.e, new org.telegram.ui.Components.e2(this.f2274c, (MessagesStorage.BooleanCallback) this.h, 0), (org.telegram.ui.ActionBar.d6) this.f2275f).show();
                return;
            case 9:
                org.telegram.ui.Components.v9.a((org.telegram.ui.Components.v9) this.d, (Runnable[]) this.f2273b, (Bitmap) this.e, (t60) this.f2275f, this.f2274c, (w7.w5[]) this.h);
                return;
            case 10:
                kh0.n((kh0) this.d, (Integer[]) this.e, this.f2274c, (TLObject) this.f2273b, (ArrayList) this.f2275f, (TLRPC.PollAnswerVoters) this.h);
                return;
            case 11:
                hs.Y((hs) this.d, (TLRPC.FileLocation) this.e, (TLRPC.InputFile) this.f2275f, (TLObject) this.f2273b, (TLRPC.FileLocation) this.h, this.f2274c);
                return;
            case 12:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                String[] strArr = (String[]) this.f2273b;
                Context context2 = (Context) this.e;
                tk0 tk0Var = (tk0) this.f2275f;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    wk0.c(context2, this.f2274c, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new qy(16, strArr, tk0Var), true, new ah.j(23), n2Var.getResourceProvider());
                    return;
                }
                tk0Var.run();
                return;
            case 13:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f2273b;
                List<Purchase> list = (List) this.e;
                c5.g gVar = (c5.g) this.f2275f;
                rw0 rw0Var = (rw0) this.h;
                if (((c5.i) this.d).f4756a == 0) {
                    di0 di0Var = new di0(1, n2Var2);
                    int i16 = this.f2274c;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i16).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f6271a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (gVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i16).sendRequest(tL_payments_assignPlayMarketTransaction, new ci.t8(i16, di0Var, n2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener("telegram_premium", new org.telegram.ui.j3(di0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (gVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i16).sendRequest(tL_payments_canPurchaseStore, new gi(i16, 6, n2Var2, rw0Var, gVar, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    return;
                }
                return;
            case 14:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.d;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.e;
                ci.z7 z7Var = (ci.z7) this.f2275f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                boolean z12 = ((TLObject) this.f2273b) instanceof TLRPC.TL_boolTrue;
                int i17 = this.f2274c;
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
                    alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new org.telegram.ui.web.c0(0, a1Var, strArr2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new hk0(17));
                    a1Var.X(3, alertDialog$Builder.f20601a, new org.telegram.ui.web.w(strArr2, i17, x0Var, z7Var, 1));
                    return;
                }
            default:
                TLObject tLObject4 = (TLObject) this.f2273b;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.e;
                vi viVar = (vi) this.f2275f;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) this.h;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject4;
                    int i18 = this.f2274c;
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
                        zf.d0.a(tL_photos_photo.photo, user, false);
                        UserConfig.getInstance(i18).setCurrentUser(user);
                        UserConfig.getInstance(i18).saveConfig(true);
                        viVar.run();
                        org.telegram.ui.Components.xc.a0(d5Var.getLastFragment()).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new org.telegram.ui.Wallet.j(i18, d5Var, 10)), null).j();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ub(Context context, TLRPC.Chat chat, TLRPC.User user, int i10, MessagesStorage.BooleanCallback booleanCallback, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f2272a = 8;
        this.d = context;
        this.f2273b = chat;
        this.e = user;
        this.f2274c = i10;
        this.h = booleanCallback;
        this.f2275f = d6Var;
    }

    public ub(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f2272a = i11;
        this.d = obj;
        this.f2274c = i10;
        this.f2273b = obj2;
        this.e = obj3;
        this.f2275f = obj4;
        this.h = obj5;
    }

    public ub(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.f2272a = i11;
        this.d = obj;
        this.f2273b = obj2;
        this.e = obj3;
        this.f2274c = i10;
        this.f2275f = obj4;
        this.h = obj5;
    }

    public ub(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5, int i11) {
        this.f2272a = i11;
        this.d = obj;
        this.f2273b = obj2;
        this.e = obj3;
        this.f2275f = obj4;
        this.f2274c = i10;
        this.h = obj5;
    }

    public ub(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, int i11) {
        this.f2272a = i11;
        this.d = obj;
        this.f2273b = obj2;
        this.e = obj3;
        this.f2275f = obj4;
        this.h = obj5;
        this.f2274c = i10;
    }

    public ub(kh0 kh0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f2272a = 10;
        this.d = kh0Var;
        this.e = numArr;
        this.f2274c = i10;
        this.f2273b = tLObject;
        this.f2275f = arrayList;
        this.h = pollAnswerVoters;
    }

    public ub(hs hsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.f2272a = 11;
        this.d = hsVar;
        this.e = fileLocation;
        this.f2275f = inputFile;
        this.f2273b = tLObject;
        this.h = fileLocation2;
        this.f2274c = i10;
    }

    public ub(d70 d70Var, org.telegram.ui.j4 j4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.f1 f1Var) {
        this.f2272a = 6;
        this.d = d70Var;
        this.e = j4Var;
        this.f2275f = tL_error;
        this.f2273b = tLObject;
        this.f2274c = i10;
        this.h = f1Var;
    }

    public ub(org.telegram.ui.web.a1 a1Var, TLObject tLObject, int i10, org.telegram.ui.web.x0 x0Var, ci.z7 z7Var, TLRPC.TL_error tL_error) {
        this.f2272a = 14;
        this.d = a1Var;
        this.f2273b = tLObject;
        this.f2274c = i10;
        this.e = x0Var;
        this.f2275f = z7Var;
        this.h = tL_error;
    }
}
