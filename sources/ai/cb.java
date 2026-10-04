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
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.yc;
import org.telegram.ui.bj;
import org.telegram.ui.el0;
import org.telegram.ui.fs0;
import org.telegram.ui.ft;
import org.telegram.ui.fx0;
import org.telegram.ui.gl0;
import org.telegram.ui.m71;
import org.telegram.ui.oi0;
import org.telegram.ui.qs;
import org.telegram.ui.t60;
import org.telegram.ui.t70;
public final class cb implements Runnable {
    public final int f735a;
    public final int f736b;
    public final Object f737c;
    public final Object d;
    public final Object f738e;
    public final Object f739f;
    public final Object h;

    public cb(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f735a = i11;
        this.f737c = tLObject;
        this.f736b = i10;
        this.f738e = obj;
        this.f739f = obj2;
        this.d = obj3;
        this.h = obj4;
    }

    @Override
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.f735a) {
            case 0:
                int i10 = this.f736b;
                db.a((db) this.f738e, (TLObject) this.f737c, this.f739f, (ArrayList) this.d, (boolean[]) this.h, i10);
                return;
            case 1:
                ((ChatObject.Call) this.f738e).lambda$loadUnknownParticipants$5(this.f736b, (TLObject) this.f737c, (ChatObject.Call.OnParticipantsLoad) this.f739f, (ArrayList) this.d, (HashSet) this.h);
                return;
            case 2:
                ((LocaleController) this.f738e).lambda$saveRemoteLocaleStrings$10(this.f736b, (LocaleController.LocaleInfo) this.f737c, (TLRPC.TL_langPackDifference) this.f739f, (HashMap) this.d, (Runnable) this.h);
                return;
            case 3:
                ((MediaDataController) this.f738e).lambda$removeMultipleStickerSets$111((boolean[]) this.h, (ArrayList) this.d, (Context) this.f737c, (org.telegram.ui.ActionBar.n2) this.f739f, this.f736b);
                return;
            case 4:
                t70 t70Var = (t70) this.f738e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.f737c;
                org.telegram.ui.d1 d1Var = (org.telegram.ui.d1) this.h;
                t70Var.f40714r = false;
                if (!((org.telegram.ui.g4) this.f739f).f36492e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            int i11 = this.f736b;
                            MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            t70Var.f40713n = chat;
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
                TLObject tLObject2 = (TLObject) this.f737c;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f738e;
                Context context = (Context) this.f739f;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                t60 t60Var = (t60) this.h;
                boolean z10 = tLObject2 instanceof TLRPC.Updates;
                int i12 = this.f736b;
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
                        tL_inputGroupCall.f20059id = groupCall.f20052id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.m9.i0(context, i12, tL_inputGroupCall, groupCall.invite_link, d6Var, true, true);
                        AndroidUtilities.runOnUIThread(t60Var);
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
                    tL_inputGroupCall2.f20059id = groupCall2.f20052id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i12).sendRequest(exportgroupcallinvite, new ii(b2Var, context, i12, exportgroupcallinvite, d6Var, t60Var));
                    return;
                } else {
                    b2Var.dismiss();
                    AndroidUtilities.runOnUIThread(t60Var);
                    return;
                }
            case 6:
                new m71((Context) this.f738e, (TLRPC.Chat) this.f737c, (TLRPC.User) this.f739f, new o8(this.f736b, (MessagesStorage.BooleanCallback) this.d, 27), (org.telegram.ui.ActionBar.d6) this.h).show();
                return;
            case 7:
                org.telegram.ui.Components.v9.a((org.telegram.ui.Components.v9) this.f738e, (Runnable[]) this.f737c, (Bitmap) this.f739f, (m60) this.d, this.f736b, (w7.w5[]) this.h);
                return;
            case 8:
                ch0.m((ch0) this.f738e, (Integer[]) this.f739f, this.f736b, (TLObject) this.f737c, (ArrayList) this.d, (TLRPC.PollAnswerVoters) this.h);
                return;
            case 9:
                qs.X((qs) this.f738e, (TLRPC.FileLocation) this.f739f, (TLRPC.InputFile) this.d, (TLObject) this.f737c, (TLRPC.FileLocation) this.h, this.f736b);
                return;
            case 10:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f738e;
                String[] strArr = (String[]) this.f737c;
                Context context2 = (Context) this.f739f;
                el0 el0Var = (el0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    gl0.c(context2, this.f736b, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new ft(10, strArr, el0Var), true, new f(18), n2Var.getResourceProvider());
                    return;
                }
                el0Var.run();
                return;
            case 11:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f737c;
                List<Purchase> list = (List) this.f739f;
                c5.f fVar = (c5.f) this.d;
                fx0 fx0Var = (fx0) this.h;
                if (((c5.h) this.f738e).f4204a == 0) {
                    oi0 oi0Var = new oi0(1, n2Var2);
                    int i14 = this.f736b;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i14).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f6391a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (fVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i14).sendRequest(tL_payments_assignPlayMarketTransaction, new za(i14, oi0Var, n2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener("telegram_premium", new org.telegram.ui.h3(oi0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (fVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i14).sendRequest(tL_payments_canPurchaseStore, new ii(i14, 5, n2Var2, fx0Var, fVar, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f738e;
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f739f;
                da daVar = (da) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                boolean z11 = ((TLObject) this.f737c) instanceof TLRPC.TL_boolTrue;
                int i15 = this.f736b;
                if (z11) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.c1.x(i15, z0Var, daVar, "write_access_requested", jSONObject);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                } else if (tL_error2 != null) {
                    c1Var.Z(tL_error2.text);
                    return;
                } else {
                    String[] strArr2 = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c1Var.getContext());
                    alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new fs0(24, c1Var, strArr2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new org.telegram.ui.web.w(1));
                    c1Var.Y(3, alertDialog$Builder.f20372a, new org.telegram.ui.web.x(strArr2, i15, z0Var, daVar, 1));
                    return;
                }
            case 13:
                TLObject tLObject3 = (TLObject) this.f737c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.f738e;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.f739f;
                bj bjVar = (bj) this.d;
                org.telegram.ui.ActionBar.c5 c5Var = (org.telegram.ui.ActionBar.c5) this.h;
                if (tLObject3 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject3;
                    int i16 = this.f736b;
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
                            String o9 = a4.a.o(photoSize2.location.local_id, "@50_50", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            photoSize = closestPhotoSizeWithSize2;
                            sb3.append(closestPhotoSizeWithSize.location.volume_id);
                            sb3.append("_");
                            ImageLoader.getInstance().replaceImageInCache(o9, a4.a.o(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(i16, user, 1), false);
                        } else {
                            photoSize = closestPhotoSizeWithSize2;
                        }
                        if (photoSize != null && photoSize3 != null && photoSize3.location != null) {
                            FileLoader.getInstance(i16).getPathToAttach(photoSize3.location, true).renameTo(FileLoader.getInstance(i16).getPathToAttach(photoSize, true));
                        }
                        yf.b0.a(tL_photos_photo.photo, user, false);
                        UserConfig.getInstance(i16).setCurrentUser(user);
                        UserConfig.getInstance(i16).saveConfig(true);
                        bjVar.run();
                        yc.a0(c5Var.getLastFragment()).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new qg.f2(i16, c5Var)), null).j();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLObject tLObject4 = (TLObject) this.f737c;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f739f;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                ((ci.d) this.f738e).setLoading(false);
                if (tLObject4 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject4;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new yc(f3VarArr[0].topBulletinContainer, d6Var2).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        return;
                    }
                    final long j3 = tL_starsSubscriptionPricing.amount;
                    final int i17 = this.f736b;
                    yh.t5.y(i17, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            Long l4 = (Long) obj3;
                            if ("paid".equals((String) obj2) && l4.longValue() != 0) {
                                AndroidUtilities.runOnUIThread(new ai.a8(l4, i17, j3, 8));
                            }
                        }
                    });
                    return;
                }
                new yc(f3VarArr[0].topBulletinContainer, d6Var2).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                return;
        }
    }

    public cb(db dbVar, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.f735a = 0;
        this.f738e = dbVar;
        this.f737c = tLObject;
        this.f739f = obj;
        this.d = arrayList;
        this.h = zArr;
        this.f736b = i10;
    }

    public cb(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f735a = i11;
        this.f738e = obj;
        this.f736b = i10;
        this.f737c = obj2;
        this.f739f = obj3;
        this.d = obj4;
        this.h = obj5;
    }

    public cb(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.f735a = i11;
        this.f738e = obj;
        this.f737c = obj2;
        this.f739f = obj3;
        this.f736b = i10;
        this.d = obj4;
        this.h = obj5;
    }

    public cb(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5, int i11) {
        this.f735a = i11;
        this.f738e = obj;
        this.f737c = obj2;
        this.f739f = obj3;
        this.d = obj4;
        this.f736b = i10;
        this.h = obj5;
    }

    public cb(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f735a = 3;
        this.f738e = mediaDataController;
        this.h = zArr;
        this.d = arrayList;
        this.f737c = context;
        this.f739f = n2Var;
        this.f736b = i10;
    }

    public cb(ch0 ch0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f735a = 8;
        this.f738e = ch0Var;
        this.f739f = numArr;
        this.f736b = i10;
        this.f737c = tLObject;
        this.d = arrayList;
        this.h = pollAnswerVoters;
    }

    public cb(qs qsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.f735a = 9;
        this.f738e = qsVar;
        this.f739f = fileLocation;
        this.d = inputFile;
        this.f737c = tLObject;
        this.h = fileLocation2;
        this.f736b = i10;
    }

    public cb(t70 t70Var, org.telegram.ui.g4 g4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.d1 d1Var) {
        this.f735a = 4;
        this.f738e = t70Var;
        this.f739f = g4Var;
        this.d = tL_error;
        this.f737c = tLObject;
        this.f736b = i10;
        this.h = d1Var;
    }

    public cb(org.telegram.ui.web.c1 c1Var, TLObject tLObject, int i10, org.telegram.ui.web.z0 z0Var, da daVar, TLRPC.TL_error tL_error) {
        this.f735a = 12;
        this.f738e = c1Var;
        this.f737c = tLObject;
        this.f736b = i10;
        this.f739f = z0Var;
        this.d = daVar;
        this.h = tL_error;
    }
}
