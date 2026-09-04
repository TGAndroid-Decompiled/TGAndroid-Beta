package bi;

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
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.yc;
import org.telegram.ui.dj;
import org.telegram.ui.jl0;
import org.telegram.ui.ll0;
import org.telegram.ui.lx0;
import org.telegram.ui.oj0;
import org.telegram.ui.qv0;
import org.telegram.ui.ri0;
import org.telegram.ui.ss;
import org.telegram.ui.sw0;
import org.telegram.ui.t71;
import org.telegram.ui.v60;
import org.telegram.ui.v70;
public final class ia implements Runnable {
    public final int f3109a;
    public final int f3110b;
    public final Object f3111c;
    public final Object d;
    public final Object f3112e;
    public final Object f3113f;
    public final Object h;

    public ia(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f3109a = i11;
        this.f3111c = tLObject;
        this.f3110b = i10;
        this.f3112e = obj;
        this.f3113f = obj2;
        this.d = obj3;
        this.h = obj4;
    }

    @Override
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.f3109a) {
            case 0:
                int i10 = this.f3110b;
                ja.a((ja) this.f3112e, (TLObject) this.f3111c, this.f3113f, (ArrayList) this.d, (boolean[]) this.h, i10);
                return;
            case 1:
                ((ChatObject.Call) this.f3112e).lambda$loadUnknownParticipants$5(this.f3110b, (TLObject) this.f3111c, (ChatObject.Call.OnParticipantsLoad) this.f3113f, (ArrayList) this.d, (HashSet) this.h);
                return;
            case 2:
                ((LocaleController) this.f3112e).lambda$saveRemoteLocaleStrings$10(this.f3110b, (LocaleController.LocaleInfo) this.f3111c, (TLRPC.TL_langPackDifference) this.f3113f, (HashMap) this.d, (Runnable) this.h);
                return;
            case 3:
                ((MediaDataController) this.f3112e).lambda$removeMultipleStickerSets$111((boolean[]) this.h, (ArrayList) this.d, (Context) this.f3111c, (org.telegram.ui.ActionBar.n2) this.f3113f, this.f3110b);
                return;
            case 4:
                v70 v70Var = (v70) this.f3112e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.f3111c;
                org.telegram.ui.d1 d1Var = (org.telegram.ui.d1) this.h;
                v70Var.f41439r = false;
                if (!((org.telegram.ui.g4) this.f3113f).f36550e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            int i11 = this.f3110b;
                            MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            v70Var.f41438n = chat;
                            if (chat.left && !chat.kicked) {
                                d1Var.a(0, false);
                                return;
                            } else {
                                d1Var.a(4, false);
                                return;
                            }
                        }
                        d1Var.a(4, false);
                        return;
                    }
                    d1Var.a(4, false);
                    return;
                }
                return;
            case 5:
                TLObject tLObject2 = (TLObject) this.f3111c;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f3112e;
                Context context = (Context) this.f3113f;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                v60 v60Var = (v60) this.h;
                boolean z10 = tLObject2 instanceof TLRPC.Updates;
                int i12 = this.f3110b;
                int i13 = 0;
                if (z10) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    MessagesController.getInstance(i12).putUsers(updates.users, false);
                    MessagesController.getInstance(i12).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i13 < size) {
                        Object obj = findUpdatesAndRemove.get(i13);
                        i13++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    b2Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f19886id = groupCall.f19879id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.k9.o0(context, i12, tL_inputGroupCall, groupCall.invite_link, f6Var, true, true);
                        AndroidUtilities.runOnUIThread(v60Var);
                        return;
                    }
                    return;
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    MessagesController.getInstance(i12).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i12).putChats(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f19886id = groupCall2.f19879id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i12).sendRequest(exportgroupcallinvite, new ii(b2Var, context, i12, exportgroupcallinvite, f6Var, v60Var));
                    return;
                } else {
                    b2Var.dismiss();
                    AndroidUtilities.runOnUIThread(v60Var);
                    return;
                }
            case 6:
                new t71((Context) this.f3112e, (TLRPC.Chat) this.f3111c, (TLRPC.User) this.f3113f, new ah.g(this.f3110b, (MessagesStorage.BooleanCallback) this.d, 28), (org.telegram.ui.ActionBar.f6) this.h).show();
                return;
            case 7:
                org.telegram.ui.Components.w9.a((org.telegram.ui.Components.w9) this.f3112e, (Runnable[]) this.f3111c, (Bitmap) this.f3113f, (y50) this.d, this.f3110b, (w7.i0[]) this.h);
                return;
            case 8:
                pg0.m((pg0) this.f3112e, (Integer[]) this.f3113f, this.f3110b, (TLObject) this.f3111c, (ArrayList) this.d, (TLRPC.PollAnswerVoters) this.h);
                return;
            case 9:
                ss.Y((ss) this.f3112e, (TLRPC.FileLocation) this.f3113f, (TLRPC.InputFile) this.d, (TLObject) this.f3111c, (TLRPC.FileLocation) this.h, this.f3110b);
                return;
            case 10:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f3112e;
                String[] strArr = (String[]) this.f3111c;
                Context context2 = (Context) this.f3113f;
                jl0 jl0Var = (jl0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    ll0.c(context2, this.f3110b, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new oj0(3, strArr, jl0Var), true, new ah.j(19), n2Var.getResourceProvider());
                    return;
                }
                jl0Var.run();
                return;
            case 11:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f3111c;
                List<Purchase> list = (List) this.f3113f;
                c5.f fVar = (c5.f) this.d;
                lx0 lx0Var = (lx0) this.h;
                if (((c5.h) this.f3112e).f4397a == 0) {
                    ri0 ri0Var = new ri0(1, n2Var2);
                    int i14 = this.f3110b;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i14).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f4864a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (fVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i14).sendRequest(tL_payments_assignPlayMarketTransaction, new ga(i14, ri0Var, n2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener("telegram_premium", new org.telegram.ui.h3(ri0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (fVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i14).sendRequest(tL_payments_canPurchaseStore, new ii(i14, 5, n2Var2, lx0Var, fVar, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.d1 d1Var2 = (org.telegram.ui.web.d1) this.f3112e;
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f3113f;
                k9 k9Var = (k9) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                boolean z11 = ((TLObject) this.f3111c) instanceof TLRPC.TL_boolTrue;
                int i15 = this.f3110b;
                if (z11) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.d1.x(i15, z0Var, k9Var, "write_access_requested", jSONObject);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                } else if (tL_error2 != null) {
                    d1Var2.Z(tL_error2.text);
                    return;
                } else {
                    String[] strArr2 = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d1Var2.getContext());
                    alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new qv0(23, d1Var2, strArr2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new sw0(7));
                    d1Var2.Y(3, alertDialog$Builder.f20198a, new org.telegram.ui.web.y(strArr2, i15, z0Var, k9Var, 1));
                    return;
                }
            case 13:
                TLObject tLObject3 = (TLObject) this.f3111c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.f3112e;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.f3113f;
                dj djVar = (dj) this.d;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) this.h;
                if (tLObject3 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject3;
                    int i16 = this.f3110b;
                    MessagesController.getInstance(i16).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(i16).getUser(Long.valueOf(UserConfig.getInstance(i16).clientUserId));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && user != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 1000);
                        if (closestPhotoSizeWithSize != null && photoSize2 != null && photoSize2.location != null) {
                            FileLoader.getInstance(i16).getPathToAttach(photoSize2.location, true).renameTo(FileLoader.getInstance(i16).getPathToAttach(closestPhotoSizeWithSize, true));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(photoSize2.location.volume_id);
                            sb2.append("_");
                            String n10 = a4.a.n(photoSize2.location.local_id, "@50_50", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            photoSize = closestPhotoSizeWithSize2;
                            sb3.append(closestPhotoSizeWithSize.location.volume_id);
                            sb3.append("_");
                            ImageLoader.getInstance().replaceImageInCache(n10, a4.a.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(i16, user, 1), false);
                        } else {
                            photoSize = closestPhotoSizeWithSize2;
                        }
                        if (photoSize != null && photoSize3 != null && photoSize3.location != null) {
                            FileLoader.getInstance(i16).getPathToAttach(photoSize3.location, true).renameTo(FileLoader.getInstance(i16).getPathToAttach(photoSize, true));
                        }
                        yf.e0.a(tL_photos_photo.photo, user, false);
                        UserConfig.getInstance(i16).setCurrentUser(user);
                        UserConfig.getInstance(i16).saveConfig(true);
                        djVar.run();
                        yc.a0(d5Var.getLastFragment()).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new rg.f(i16, d5Var)), null).j();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLObject tLObject4 = (TLObject) this.f3111c;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f3113f;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.d;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                ((di.d) this.f3112e).setLoading(false);
                if (tLObject4 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject4;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new yc(f3VarArr[0].topBulletinContainer, f6Var2).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        return;
                    }
                    final long j3 = tL_starsSubscriptionPricing.amount;
                    final int i17 = this.f3110b;
                    zh.s5.y(i17, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            Long l4 = (Long) obj3;
                            if ("paid".equals((String) obj2) && l4.longValue() != 0) {
                                AndroidUtilities.runOnUIThread(new bi.h7(l4, i17, j3, 8));
                            }
                        }
                    });
                    return;
                }
                new yc(f3VarArr[0].topBulletinContainer, f6Var2).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                return;
        }
    }

    public ia(ja jaVar, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.f3109a = 0;
        this.f3112e = jaVar;
        this.f3111c = tLObject;
        this.f3113f = obj;
        this.d = arrayList;
        this.h = zArr;
        this.f3110b = i10;
    }

    public ia(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f3109a = i11;
        this.f3112e = obj;
        this.f3110b = i10;
        this.f3111c = obj2;
        this.f3113f = obj3;
        this.d = obj4;
        this.h = obj5;
    }

    public ia(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.f3109a = i11;
        this.f3112e = obj;
        this.f3111c = obj2;
        this.f3113f = obj3;
        this.f3110b = i10;
        this.d = obj4;
        this.h = obj5;
    }

    public ia(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5, int i11) {
        this.f3109a = i11;
        this.f3112e = obj;
        this.f3111c = obj2;
        this.f3113f = obj3;
        this.d = obj4;
        this.f3110b = i10;
        this.h = obj5;
    }

    public ia(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f3109a = 3;
        this.f3112e = mediaDataController;
        this.h = zArr;
        this.d = arrayList;
        this.f3111c = context;
        this.f3113f = n2Var;
        this.f3110b = i10;
    }

    public ia(pg0 pg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f3109a = 8;
        this.f3112e = pg0Var;
        this.f3113f = numArr;
        this.f3110b = i10;
        this.f3111c = tLObject;
        this.d = arrayList;
        this.h = pollAnswerVoters;
    }

    public ia(ss ssVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.f3109a = 9;
        this.f3112e = ssVar;
        this.f3113f = fileLocation;
        this.d = inputFile;
        this.f3111c = tLObject;
        this.h = fileLocation2;
        this.f3110b = i10;
    }

    public ia(v70 v70Var, org.telegram.ui.g4 g4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.d1 d1Var) {
        this.f3109a = 4;
        this.f3112e = v70Var;
        this.f3113f = g4Var;
        this.d = tL_error;
        this.f3111c = tLObject;
        this.f3110b = i10;
        this.h = d1Var;
    }

    public ia(org.telegram.ui.web.d1 d1Var, TLObject tLObject, int i10, org.telegram.ui.web.z0 z0Var, k9 k9Var, TLRPC.TL_error tL_error) {
        this.f3109a = 12;
        this.f3112e = d1Var;
        this.f3111c = tLObject;
        this.f3110b = i10;
        this.f3113f = z0Var;
        this.d = k9Var;
        this.h = tL_error;
    }
}
