package org.telegram.messenger;

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
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.fz0;
import org.telegram.ui.il0;
import org.telegram.ui.js0;
import org.telegram.ui.kl0;
import org.telegram.ui.nj0;
import org.telegram.ui.nx0;
import org.telegram.ui.ri0;
import org.telegram.ui.t70;
import org.telegram.ui.ts;
import org.telegram.ui.u60;
import org.telegram.ui.v71;
public final class w0 implements Runnable {
    public final int f16816a;
    public final int f16817b;
    public final Object f16818c;
    public final Object d;
    public final Object e;
    public final Object f16819f;
    public final Object h;

    public w0(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f16816a = i11;
        this.d = tLObject;
        this.f16817b = i10;
        this.f16818c = obj;
        this.e = obj2;
        this.f16819f = obj3;
        this.h = obj4;
    }

    @Override
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.f16816a) {
            case 0:
                ((ChatObject.Call) this.f16818c).lambda$loadUnknownParticipants$5(this.f16817b, (TLObject) this.d, (ChatObject.Call.OnParticipantsLoad) this.e, (ArrayList) this.f16819f, (HashSet) this.h);
                return;
            case 1:
                ((LocaleController) this.f16818c).lambda$saveRemoteLocaleStrings$10(this.f16817b, (LocaleController.LocaleInfo) this.d, (TLRPC.TL_langPackDifference) this.e, (HashMap) this.f16819f, (Runnable) this.h);
                return;
            case 2:
                ((MediaDataController) this.f16818c).lambda$removeMultipleStickerSets$111((boolean[]) this.d, (ArrayList) this.f16819f, (Context) this.e, (org.telegram.ui.ActionBar.p2) this.h, this.f16817b);
                return;
            case 3:
                t70 t70Var = (t70) this.f16818c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f16819f;
                TLObject tLObject = (TLObject) this.d;
                org.telegram.ui.e1 e1Var = (org.telegram.ui.e1) this.h;
                t70Var.f36859r = false;
                if (!((org.telegram.ui.h4) this.e).e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            int i10 = this.f16817b;
                            MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i10).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i10).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            t70Var.f36858n = chat;
                            if (chat.left && !chat.kicked) {
                                e1Var.a(0, false);
                                return;
                            } else {
                                e1Var.a(4, false);
                                return;
                            }
                        }
                        e1Var.a(4, false);
                        return;
                    }
                    e1Var.a(4, false);
                    return;
                }
                return;
            case 4:
                TLObject tLObject2 = (TLObject) this.d;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f16818c;
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f16819f;
                u60 u60Var = (u60) this.h;
                boolean z10 = tLObject2 instanceof TLRPC.Updates;
                int i11 = this.f16817b;
                int i12 = 0;
                if (z10) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    MessagesController.getInstance(i11).putUsers(updates.users, false);
                    MessagesController.getInstance(i11).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i12 < size) {
                        Object obj = findUpdatesAndRemove.get(i12);
                        i12++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    d2Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f17212id = groupCall.f17205id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.k9.o0(context, i11, tL_inputGroupCall, groupCall.invite_link, f6Var, true, true);
                        AndroidUtilities.runOnUIThread(u60Var);
                        return;
                    }
                    return;
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    MessagesController.getInstance(i11).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i11).putChats(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f17212id = groupCall2.f17205id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i11).sendRequest(exportgroupcallinvite, new qi(d2Var, context, i11, exportgroupcallinvite, f6Var, u60Var));
                    return;
                } else {
                    d2Var.dismiss();
                    AndroidUtilities.runOnUIThread(u60Var);
                    return;
                }
            case 5:
                new v71((Context) this.f16818c, (TLRPC.Chat) this.d, (TLRPC.User) this.e, new bi.s(this.f16817b, (MessagesStorage.BooleanCallback) this.f16819f, 26), (org.telegram.ui.ActionBar.f6) this.h).show();
                return;
            case 6:
                org.telegram.ui.Components.v9.a((org.telegram.ui.Components.v9) this.f16818c, (Runnable[]) this.d, (Bitmap) this.e, (h60) this.f16819f, this.f16817b, (w7.x5[]) this.h);
                return;
            case 7:
                zg0.m((zg0) this.f16818c, (Integer[]) this.e, this.f16817b, (TLObject) this.d, (ArrayList) this.f16819f, (TLRPC.PollAnswerVoters) this.h);
                return;
            case 8:
                ts.Y((ts) this.f16818c, (TLRPC.FileLocation) this.e, (TLRPC.InputFile) this.f16819f, (TLObject) this.d, (TLRPC.FileLocation) this.h, this.f16817b);
                return;
            case 9:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f16818c;
                String[] strArr = (String[]) this.d;
                Context context2 = (Context) this.e;
                il0 il0Var = (il0) this.f16819f;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.h;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    kl0.c(context2, this.f16817b, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new nj0(3, strArr, il0Var), true, new bi.f0(13), p2Var.getResourceProvider());
                    return;
                }
                il0Var.run();
                return;
            case 10:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.d;
                List<Purchase> list = (List) this.e;
                c5.f fVar = (c5.f) this.f16819f;
                nx0 nx0Var = (nx0) this.h;
                if (((c5.h) this.f16818c).f4308a == 0) {
                    ri0 ri0Var = new ri0(1, p2Var2);
                    int i13 = this.f16817b;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i13).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f4721a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (fVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i13).sendRequest(tL_payments_assignPlayMarketTransaction, new di.c5(i13, ri0Var, p2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener("telegram_premium", new org.telegram.ui.i3(ri0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (fVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i13).sendRequest(tL_payments_canPurchaseStore, new qi(i13, 5, p2Var2, nx0Var, fVar, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f16818c;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.e;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f16819f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                boolean z11 = ((TLObject) this.d) instanceof TLRPC.TL_boolTrue;
                int i14 = this.f16817b;
                if (z11) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.c1.x(i14, y0Var, a1Var, "write_access_requested", jSONObject);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                } else if (tL_error2 != null) {
                    c1Var.Z(tL_error2.text);
                    return;
                } else {
                    String[] strArr2 = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c1Var.getContext());
                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new fz0(18, c1Var, strArr2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new js0(8));
                    c1Var.Y(3, alertDialog$Builder.f17528a, new org.telegram.ui.web.x(strArr2, i14, y0Var, a1Var, 1));
                    return;
                }
            case 12:
                TLObject tLObject3 = (TLObject) this.d;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.f16818c;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.e;
                org.telegram.ui.fj fjVar = (org.telegram.ui.fj) this.f16819f;
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) this.h;
                if (tLObject3 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject3;
                    int i15 = this.f16817b;
                    MessagesController.getInstance(i15).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(i15).getUser(Long.valueOf(UserConfig.getInstance(i15).clientUserId));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && user != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 1000);
                        if (closestPhotoSizeWithSize != null && photoSize2 != null && photoSize2.location != null) {
                            FileLoader.getInstance(i15).getPathToAttach(photoSize2.location, true).renameTo(FileLoader.getInstance(i15).getPathToAttach(closestPhotoSizeWithSize, true));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(photoSize2.location.volume_id);
                            sb2.append("_");
                            String n10 = a4.a.n(photoSize2.location.local_id, "@50_50", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            photoSize = closestPhotoSizeWithSize2;
                            sb3.append(closestPhotoSizeWithSize.location.volume_id);
                            sb3.append("_");
                            ImageLoader.getInstance().replaceImageInCache(n10, a4.a.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(i15, user, 1), false);
                        } else {
                            photoSize = closestPhotoSizeWithSize2;
                        }
                        if (photoSize != null && photoSize3 != null && photoSize3.location != null) {
                            FileLoader.getInstance(i15).getPathToAttach(photoSize3.location, true).renameTo(FileLoader.getInstance(i15).getPathToAttach(photoSize, true));
                        }
                        xf.e0.a(tL_photos_photo.photo, user, false);
                        UserConfig.getInstance(i15).setCurrentUser(user);
                        UserConfig.getInstance(i15).saveConfig(true);
                        fjVar.run();
                        org.telegram.ui.Components.wc.a0(f5Var.getLastFragment()).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new pg.f2(i15, f5Var)), null).j();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                TLObject tLObject4 = (TLObject) this.d;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.e;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.f16819f;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                ((bi.d) this.f16818c).setLoading(false);
                if (tLObject4 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject4;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new org.telegram.ui.Components.wc(h3VarArr[0].topBulletinContainer, f6Var2).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        return;
                    }
                    final long j3 = tL_starsSubscriptionPricing.amount;
                    final int i16 = this.f16817b;
                    xh.v5.y(i16, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            Long l4 = (Long) obj3;
                            if ("paid".equals((String) obj2) && l4.longValue() != 0) {
                                AndroidUtilities.runOnUIThread(new org.telegram.messenger.t5(l4, i16, j3, 7));
                            }
                        }
                    });
                    return;
                }
                new org.telegram.ui.Components.wc(h3VarArr[0].topBulletinContainer, f6Var2).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                return;
            default:
                int i17 = this.f16817b;
                zh.r6.a((zh.r6) this.f16818c, (TLObject) this.d, this.e, (ArrayList) this.f16819f, (boolean[]) this.h, i17);
                return;
        }
    }

    public w0(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f16816a = i11;
        this.f16818c = obj;
        this.f16817b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f16819f = obj4;
        this.h = obj5;
    }

    public w0(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.f16816a = i11;
        this.f16818c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16817b = i10;
        this.f16819f = obj4;
        this.h = obj5;
    }

    public w0(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5, int i11) {
        this.f16816a = i11;
        this.f16818c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16819f = obj4;
        this.f16817b = i10;
        this.h = obj5;
    }

    public w0(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.f16816a = 2;
        this.f16818c = mediaDataController;
        this.d = zArr;
        this.f16819f = arrayList;
        this.e = context;
        this.h = p2Var;
        this.f16817b = i10;
    }

    public w0(zg0 zg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f16816a = 7;
        this.f16818c = zg0Var;
        this.e = numArr;
        this.f16817b = i10;
        this.d = tLObject;
        this.f16819f = arrayList;
        this.h = pollAnswerVoters;
    }

    public w0(ts tsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.f16816a = 8;
        this.f16818c = tsVar;
        this.e = fileLocation;
        this.f16819f = inputFile;
        this.d = tLObject;
        this.h = fileLocation2;
        this.f16817b = i10;
    }

    public w0(t70 t70Var, org.telegram.ui.h4 h4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.e1 e1Var) {
        this.f16816a = 3;
        this.f16818c = t70Var;
        this.e = h4Var;
        this.f16819f = tL_error;
        this.d = tLObject;
        this.f16817b = i10;
        this.h = e1Var;
    }

    public w0(org.telegram.ui.web.c1 c1Var, TLObject tLObject, int i10, org.telegram.ui.web.y0 y0Var, org.telegram.ui.web.a1 a1Var, TLRPC.TL_error tL_error) {
        this.f16816a = 11;
        this.f16818c = c1Var;
        this.d = tLObject;
        this.f16817b = i10;
        this.e = y0Var;
        this.f16819f = a1Var;
        this.h = tL_error;
    }

    public w0(zh.r6 r6Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.f16816a = 14;
        this.f16818c = r6Var;
        this.d = tLObject;
        this.e = obj;
        this.f16819f = arrayList;
        this.h = zArr;
        this.f16817b = i10;
    }
}
