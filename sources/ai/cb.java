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
import org.telegram.messenger.hi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.yc;
import org.telegram.ui.aj;
import org.telegram.ui.al0;
import org.telegram.ui.bt;
import org.telegram.ui.cl0;
import org.telegram.ui.cx0;
import org.telegram.ui.ds0;
import org.telegram.ui.k71;
import org.telegram.ui.ki0;
import org.telegram.ui.ms;
import org.telegram.ui.p60;
import org.telegram.ui.p70;
public final class cb implements Runnable {
    public final int f678a;
    public final int f679b;
    public final Object f680c;
    public final Object d;
    public final Object e;
    public final Object f681f;
    public final Object h;

    public cb(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f678a = i11;
        this.f680c = tLObject;
        this.f679b = i10;
        this.e = obj;
        this.f681f = obj2;
        this.d = obj3;
        this.h = obj4;
    }

    @Override
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.f678a) {
            case 0:
                int i10 = this.f679b;
                db.a((db) this.e, (TLObject) this.f680c, this.f681f, (ArrayList) this.d, (boolean[]) this.h, i10);
                return;
            case 1:
                ((ChatObject.Call) this.e).lambda$loadUnknownParticipants$5(this.f679b, (TLObject) this.f680c, (ChatObject.Call.OnParticipantsLoad) this.f681f, (ArrayList) this.d, (HashSet) this.h);
                return;
            case 2:
                ((LocaleController) this.e).lambda$saveRemoteLocaleStrings$10(this.f679b, (LocaleController.LocaleInfo) this.f680c, (TLRPC.TL_langPackDifference) this.f681f, (HashMap) this.d, (Runnable) this.h);
                return;
            case 3:
                ((MediaDataController) this.e).lambda$removeMultipleStickerSets$111((boolean[]) this.h, (ArrayList) this.d, (Context) this.f680c, (org.telegram.ui.ActionBar.m2) this.f681f, this.f679b);
                return;
            case 4:
                p70 p70Var = (p70) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.f680c;
                org.telegram.ui.d1 d1Var = (org.telegram.ui.d1) this.h;
                p70Var.f36414r = false;
                if (!((org.telegram.ui.g4) this.f681f).e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            int i11 = this.f679b;
                            MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            p70Var.f36413n = chat;
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
                TLObject tLObject2 = (TLObject) this.f680c;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.e;
                Context context = (Context) this.f681f;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                p60 p60Var = (p60) this.h;
                boolean z10 = tLObject2 instanceof TLRPC.Updates;
                int i12 = this.f679b;
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
                    a2Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f18338id = groupCall.f18331id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.k9.o0(context, i12, tL_inputGroupCall, groupCall.invite_link, d6Var, true, true);
                        AndroidUtilities.runOnUIThread(p60Var);
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
                    tL_inputGroupCall2.f18338id = groupCall2.f18331id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i12).sendRequest(exportgroupcallinvite, new hi(a2Var, context, i12, exportgroupcallinvite, d6Var, p60Var));
                    return;
                } else {
                    a2Var.dismiss();
                    AndroidUtilities.runOnUIThread(p60Var);
                    return;
                }
            case 6:
                new k71((Context) this.e, (TLRPC.Chat) this.f680c, (TLRPC.User) this.f681f, new o8(this.f679b, (MessagesStorage.BooleanCallback) this.d, 27), (org.telegram.ui.ActionBar.d6) this.h).show();
                return;
            case 7:
                org.telegram.ui.Components.v9.a((org.telegram.ui.Components.v9) this.e, (Runnable[]) this.f680c, (Bitmap) this.f681f, (j60) this.d, this.f679b, (w7.j0[]) this.h);
                return;
            case 8:
                ah0.m((ah0) this.e, (Integer[]) this.f681f, this.f679b, (TLObject) this.f680c, (ArrayList) this.d, (TLRPC.PollAnswerVoters) this.h);
                return;
            case 9:
                ms.Y((ms) this.e, (TLRPC.FileLocation) this.f681f, (TLRPC.InputFile) this.d, (TLObject) this.f680c, (TLRPC.FileLocation) this.h, this.f679b);
                return;
            case 10:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.e;
                String[] strArr = (String[]) this.f680c;
                Context context2 = (Context) this.f681f;
                al0 al0Var = (al0) this.d;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.h;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    cl0.c(context2, this.f679b, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new bt(10, strArr, al0Var), true, new f(18), m2Var.getResourceProvider());
                    return;
                }
                al0Var.run();
                return;
            case 11:
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.f680c;
                List<Purchase> list = (List) this.f681f;
                c5.f fVar = (c5.f) this.d;
                cx0 cx0Var = (cx0) this.h;
                if (((c5.h) this.e).f3886a == 0) {
                    ki0 ki0Var = new ki0(1, m2Var2);
                    int i14 = this.f679b;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i14).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f5930a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (fVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i14).sendRequest(tL_payments_assignPlayMarketTransaction, new za(i14, ki0Var, m2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener("telegram_premium", new org.telegram.ui.h3(ki0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (fVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i14).sendRequest(tL_payments_canPurchaseStore, new hi(i14, 5, m2Var2, cx0Var, fVar, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.e;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.f681f;
                da daVar = (da) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                boolean z11 = ((TLObject) this.f680c) instanceof TLRPC.TL_boolTrue;
                int i15 = this.f679b;
                if (z11) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.b1.x(i15, y0Var, daVar, "write_access_requested", jSONObject);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                } else if (tL_error2 != null) {
                    b1Var.Z(tL_error2.text);
                    return;
                } else {
                    String[] strArr2 = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b1Var.getContext());
                    alertDialog$Builder.f18647a.R = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder.f18647a.T = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new ds0(23, b1Var, strArr2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new org.telegram.ui.Components.voip.e1(29));
                    b1Var.Y(3, alertDialog$Builder.f18647a, new org.telegram.ui.web.w(strArr2, i15, y0Var, daVar, 1));
                    return;
                }
            case 13:
                TLObject tLObject3 = (TLObject) this.f680c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.e;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.f681f;
                aj ajVar = (aj) this.d;
                org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.h;
                if (tLObject3 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject3;
                    int i16 = this.f679b;
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
                        yf.d0.a(tL_photos_photo.photo, user, false);
                        UserConfig.getInstance(i16).setCurrentUser(user);
                        UserConfig.getInstance(i16).saveConfig(true);
                        ajVar.run();
                        yc.a0(b5Var.getLastFragment()).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new qg.v(i16, b5Var)), null).j();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLObject tLObject4 = (TLObject) this.f680c;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.f681f;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                ((ci.d) this.e).setLoading(false);
                if (tLObject4 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject4;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new yc(e3VarArr[0].topBulletinContainer, d6Var2).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        return;
                    }
                    final long j3 = tL_starsSubscriptionPricing.amount;
                    final int i17 = this.f679b;
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
                new yc(e3VarArr[0].topBulletinContainer, d6Var2).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                return;
        }
    }

    public cb(db dbVar, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.f678a = 0;
        this.e = dbVar;
        this.f680c = tLObject;
        this.f681f = obj;
        this.d = arrayList;
        this.h = zArr;
        this.f679b = i10;
    }

    public cb(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f678a = i11;
        this.e = obj;
        this.f679b = i10;
        this.f680c = obj2;
        this.f681f = obj3;
        this.d = obj4;
        this.h = obj5;
    }

    public cb(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.f678a = i11;
        this.e = obj;
        this.f680c = obj2;
        this.f681f = obj3;
        this.f679b = i10;
        this.d = obj4;
        this.h = obj5;
    }

    public cb(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5, int i11) {
        this.f678a = i11;
        this.e = obj;
        this.f680c = obj2;
        this.f681f = obj3;
        this.d = obj4;
        this.f679b = i10;
        this.h = obj5;
    }

    public cb(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f678a = 3;
        this.e = mediaDataController;
        this.h = zArr;
        this.d = arrayList;
        this.f680c = context;
        this.f681f = m2Var;
        this.f679b = i10;
    }

    public cb(ah0 ah0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f678a = 8;
        this.e = ah0Var;
        this.f681f = numArr;
        this.f679b = i10;
        this.f680c = tLObject;
        this.d = arrayList;
        this.h = pollAnswerVoters;
    }

    public cb(ms msVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.f678a = 9;
        this.e = msVar;
        this.f681f = fileLocation;
        this.d = inputFile;
        this.f680c = tLObject;
        this.h = fileLocation2;
        this.f679b = i10;
    }

    public cb(p70 p70Var, org.telegram.ui.g4 g4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.d1 d1Var) {
        this.f678a = 4;
        this.e = p70Var;
        this.f681f = g4Var;
        this.d = tL_error;
        this.f680c = tLObject;
        this.f679b = i10;
        this.h = d1Var;
    }

    public cb(org.telegram.ui.web.b1 b1Var, TLObject tLObject, int i10, org.telegram.ui.web.y0 y0Var, da daVar, TLRPC.TL_error tL_error) {
        this.f678a = 12;
        this.e = b1Var;
        this.f680c = tLObject;
        this.f679b = i10;
        this.f681f = y0Var;
        this.d = daVar;
        this.h = tL_error;
    }
}
