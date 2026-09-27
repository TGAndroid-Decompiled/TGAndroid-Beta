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
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.xc;
import org.telegram.ui.cj;
import org.telegram.ui.dl0;
import org.telegram.ui.et;
import org.telegram.ui.fl0;
import org.telegram.ui.fx0;
import org.telegram.ui.gs0;
import org.telegram.ui.m71;
import org.telegram.ui.ni0;
import org.telegram.ui.ps;
import org.telegram.ui.s60;
import org.telegram.ui.s70;
public final class cb implements Runnable {
    public final int f681a;
    public final int f682b;
    public final Object f683c;
    public final Object d;
    public final Object e;
    public final Object f684f;
    public final Object h;

    public cb(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f681a = i11;
        this.f683c = tLObject;
        this.f682b = i10;
        this.e = obj;
        this.f684f = obj2;
        this.d = obj3;
        this.h = obj4;
    }

    @Override
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.f681a) {
            case 0:
                int i10 = this.f682b;
                db.a((db) this.e, (TLObject) this.f683c, this.f684f, (ArrayList) this.d, (boolean[]) this.h, i10);
                return;
            case 1:
                ((ChatObject.Call) this.e).lambda$loadUnknownParticipants$5(this.f682b, (TLObject) this.f683c, (ChatObject.Call.OnParticipantsLoad) this.f684f, (ArrayList) this.d, (HashSet) this.h);
                return;
            case 2:
                ((LocaleController) this.e).lambda$saveRemoteLocaleStrings$10(this.f682b, (LocaleController.LocaleInfo) this.f683c, (TLRPC.TL_langPackDifference) this.f684f, (HashMap) this.d, (Runnable) this.h);
                return;
            case 3:
                ((MediaDataController) this.e).lambda$removeMultipleStickerSets$111((boolean[]) this.h, (ArrayList) this.d, (Context) this.f683c, (org.telegram.ui.ActionBar.o2) this.f684f, this.f682b);
                return;
            case 4:
                s70 s70Var = (s70) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.f683c;
                org.telegram.ui.e1 e1Var = (org.telegram.ui.e1) this.h;
                s70Var.f37324r = false;
                if (!((org.telegram.ui.h4) this.f684f).e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            int i11 = this.f682b;
                            MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            s70Var.f37323n = chat;
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
            case 5:
                TLObject tLObject2 = (TLObject) this.f683c;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.e;
                Context context = (Context) this.f684f;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                s60 s60Var = (s60) this.h;
                boolean z10 = tLObject2 instanceof TLRPC.Updates;
                int i12 = this.f682b;
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
                    c2Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f18346id = groupCall.f18339id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.n9.p0(context, i12, tL_inputGroupCall, groupCall.invite_link, e6Var, true, true);
                        AndroidUtilities.runOnUIThread(s60Var);
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
                    tL_inputGroupCall2.f18346id = groupCall2.f18339id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i12).sendRequest(exportgroupcallinvite, new hi(c2Var, context, i12, exportgroupcallinvite, e6Var, s60Var));
                    return;
                } else {
                    c2Var.dismiss();
                    AndroidUtilities.runOnUIThread(s60Var);
                    return;
                }
            case 6:
                new m71((Context) this.e, (TLRPC.Chat) this.f683c, (TLRPC.User) this.f684f, new o8(this.f682b, (MessagesStorage.BooleanCallback) this.d, 27), (org.telegram.ui.ActionBar.e6) this.h).show();
                return;
            case 7:
                org.telegram.ui.Components.v9.a((org.telegram.ui.Components.v9) this.e, (Runnable[]) this.f683c, (Bitmap) this.f684f, (l60) this.d, this.f682b, (w7.j0[]) this.h);
                return;
            case 8:
                ch0.m((ch0) this.e, (Integer[]) this.f684f, this.f682b, (TLObject) this.f683c, (ArrayList) this.d, (TLRPC.PollAnswerVoters) this.h);
                return;
            case 9:
                ps.Y((ps) this.e, (TLRPC.FileLocation) this.f684f, (TLRPC.InputFile) this.d, (TLObject) this.f683c, (TLRPC.FileLocation) this.h, this.f682b);
                return;
            case 10:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.e;
                String[] strArr = (String[]) this.f683c;
                Context context2 = (Context) this.f684f;
                dl0 dl0Var = (dl0) this.d;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.h;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    fl0.c(context2, this.f682b, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new et(10, strArr, dl0Var), true, new f(18), o2Var.getResourceProvider());
                    return;
                }
                dl0Var.run();
                return;
            case 11:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f683c;
                List<Purchase> list = (List) this.f684f;
                c5.f fVar = (c5.f) this.d;
                fx0 fx0Var = (fx0) this.h;
                if (((c5.h) this.e).f3888a == 0) {
                    ni0 ni0Var = new ni0(1, o2Var2);
                    int i14 = this.f682b;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i14).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f5931a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (fVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i14).sendRequest(tL_payments_assignPlayMarketTransaction, new za(i14, ni0Var, o2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener("telegram_premium", new org.telegram.ui.i3(ni0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (fVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i14).sendRequest(tL_payments_canPurchaseStore, new hi(i14, 5, o2Var2, fx0Var, fVar, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.e;
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f684f;
                da daVar = (da) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                boolean z11 = ((TLObject) this.f683c) instanceof TLRPC.TL_boolTrue;
                int i15 = this.f682b;
                if (z11) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.c1.x(i15, z0Var, daVar, "write_access_requested", jSONObject);
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
                    alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new gs0(23, c1Var, strArr2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new org.telegram.ui.web.d0(0));
                    c1Var.Y(3, alertDialog$Builder.f18655a, new org.telegram.ui.web.w(strArr2, i15, z0Var, daVar, 1));
                    return;
                }
            case 13:
                TLObject tLObject3 = (TLObject) this.f683c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.e;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.f684f;
                cj cjVar = (cj) this.d;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) this.h;
                if (tLObject3 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject3;
                    int i16 = this.f682b;
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
                        yf.d0.a(tL_photos_photo.photo, user, false);
                        UserConfig.getInstance(i16).setCurrentUser(user);
                        UserConfig.getInstance(i16).saveConfig(true);
                        cjVar.run();
                        xc.a0(d5Var.getLastFragment()).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new qg.f2(i16, d5Var)), null).j();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLObject tLObject4 = (TLObject) this.f683c;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) this.f684f;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.d;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                ((ci.d) this.e).setLoading(false);
                if (tLObject4 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject4;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new xc(g3VarArr[0].topBulletinContainer, e6Var2).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        return;
                    }
                    final long j3 = tL_starsSubscriptionPricing.amount;
                    final int i17 = this.f682b;
                    yh.s5.y(i17, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() {
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
                new xc(g3VarArr[0].topBulletinContainer, e6Var2).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                return;
        }
    }

    public cb(db dbVar, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.f681a = 0;
        this.e = dbVar;
        this.f683c = tLObject;
        this.f684f = obj;
        this.d = arrayList;
        this.h = zArr;
        this.f682b = i10;
    }

    public cb(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f681a = i11;
        this.e = obj;
        this.f682b = i10;
        this.f683c = obj2;
        this.f684f = obj3;
        this.d = obj4;
        this.h = obj5;
    }

    public cb(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.f681a = i11;
        this.e = obj;
        this.f683c = obj2;
        this.f684f = obj3;
        this.f682b = i10;
        this.d = obj4;
        this.h = obj5;
    }

    public cb(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5, int i11) {
        this.f681a = i11;
        this.e = obj;
        this.f683c = obj2;
        this.f684f = obj3;
        this.d = obj4;
        this.f682b = i10;
        this.h = obj5;
    }

    public cb(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f681a = 3;
        this.e = mediaDataController;
        this.h = zArr;
        this.d = arrayList;
        this.f683c = context;
        this.f684f = o2Var;
        this.f682b = i10;
    }

    public cb(ch0 ch0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f681a = 8;
        this.e = ch0Var;
        this.f684f = numArr;
        this.f682b = i10;
        this.f683c = tLObject;
        this.d = arrayList;
        this.h = pollAnswerVoters;
    }

    public cb(ps psVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.f681a = 9;
        this.e = psVar;
        this.f684f = fileLocation;
        this.d = inputFile;
        this.f683c = tLObject;
        this.h = fileLocation2;
        this.f682b = i10;
    }

    public cb(s70 s70Var, org.telegram.ui.h4 h4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.e1 e1Var) {
        this.f681a = 4;
        this.e = s70Var;
        this.f684f = h4Var;
        this.d = tL_error;
        this.f683c = tLObject;
        this.f682b = i10;
        this.h = e1Var;
    }

    public cb(org.telegram.ui.web.c1 c1Var, TLObject tLObject, int i10, org.telegram.ui.web.z0 z0Var, da daVar, TLRPC.TL_error tL_error) {
        this.f681a = 12;
        this.e = c1Var;
        this.f683c = tLObject;
        this.f682b = i10;
        this.f684f = z0Var;
        this.d = daVar;
        this.h = tL_error;
    }
}
