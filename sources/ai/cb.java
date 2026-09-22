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
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.xc;
import org.telegram.ui.dj;
import org.telegram.ui.ja0;
import org.telegram.ui.jl0;
import org.telegram.ui.ll0;
import org.telegram.ui.lx0;
import org.telegram.ui.pj0;
import org.telegram.ui.rv0;
import org.telegram.ui.si0;
import org.telegram.ui.ss;
import org.telegram.ui.t71;
import org.telegram.ui.u60;
import org.telegram.ui.u70;
public final class cb implements Runnable {
    public final int f669a;
    public final int f670b;
    public final Object f671c;
    public final Object d;
    public final Object e;
    public final Object f672f;
    public final Object h;

    public cb(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f669a = i11;
        this.f671c = tLObject;
        this.f670b = i10;
        this.e = obj;
        this.f672f = obj2;
        this.d = obj3;
        this.h = obj4;
    }

    @Override
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.f669a) {
            case 0:
                int i10 = this.f670b;
                db.a((db) this.e, (TLObject) this.f671c, this.f672f, (ArrayList) this.d, (boolean[]) this.h, i10);
                return;
            case 1:
                ((ChatObject.Call) this.e).lambda$loadUnknownParticipants$5(this.f670b, (TLObject) this.f671c, (ChatObject.Call.OnParticipantsLoad) this.f672f, (ArrayList) this.d, (HashSet) this.h);
                return;
            case 2:
                ((LocaleController) this.e).lambda$saveRemoteLocaleStrings$10(this.f670b, (LocaleController.LocaleInfo) this.f671c, (TLRPC.TL_langPackDifference) this.f672f, (HashMap) this.d, (Runnable) this.h);
                return;
            case 3:
                ((MediaDataController) this.e).lambda$removeMultipleStickerSets$111((boolean[]) this.h, (ArrayList) this.d, (Context) this.f671c, (org.telegram.ui.ActionBar.n2) this.f672f, this.f670b);
                return;
            case 4:
                u70 u70Var = (u70) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.f671c;
                org.telegram.ui.c1 c1Var = (org.telegram.ui.c1) this.h;
                u70Var.f37985r = false;
                if (!((org.telegram.ui.f4) this.f672f).e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            int i11 = this.f670b;
                            MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            u70Var.f37984n = chat;
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
                TLObject tLObject2 = (TLObject) this.f671c;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
                Context context = (Context) this.f672f;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.d;
                u60 u60Var = (u60) this.h;
                boolean z10 = tLObject2 instanceof TLRPC.Updates;
                int i12 = this.f670b;
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
                        tL_inputGroupCall.f18360id = groupCall.f18353id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.l9.o0(context, i12, tL_inputGroupCall, groupCall.invite_link, f6Var, true, true);
                        AndroidUtilities.runOnUIThread(u60Var);
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
                    tL_inputGroupCall2.f18360id = groupCall2.f18353id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i12).sendRequest(exportgroupcallinvite, new ii(b2Var, context, i12, exportgroupcallinvite, f6Var, u60Var));
                    return;
                } else {
                    b2Var.dismiss();
                    AndroidUtilities.runOnUIThread(u60Var);
                    return;
                }
            case 6:
                new t71((Context) this.e, (TLRPC.Chat) this.f671c, (TLRPC.User) this.f672f, new n8(this.f670b, (MessagesStorage.BooleanCallback) this.d, 27), (org.telegram.ui.ActionBar.f6) this.h).show();
                return;
            case 7:
                org.telegram.ui.Components.u9.a((org.telegram.ui.Components.u9) this.e, (Runnable[]) this.f671c, (Bitmap) this.f672f, (j60) this.d, this.f670b, (w7.j0[]) this.h);
                return;
            case 8:
                ch0.m((ch0) this.e, (Integer[]) this.f672f, this.f670b, (TLObject) this.f671c, (ArrayList) this.d, (TLRPC.PollAnswerVoters) this.h);
                return;
            case 9:
                ss.Y((ss) this.e, (TLRPC.FileLocation) this.f672f, (TLRPC.InputFile) this.d, (TLObject) this.f671c, (TLRPC.FileLocation) this.h, this.f670b);
                return;
            case 10:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.e;
                String[] strArr = (String[]) this.f671c;
                Context context2 = (Context) this.f672f;
                jl0 jl0Var = (jl0) this.d;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    ll0.c(context2, this.f670b, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new pj0(3, strArr, jl0Var), true, new f(18), n2Var.getResourceProvider());
                    return;
                }
                jl0Var.run();
                return;
            case 11:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f671c;
                List<Purchase> list = (List) this.f672f;
                c5.f fVar = (c5.f) this.d;
                lx0 lx0Var = (lx0) this.h;
                if (((c5.h) this.e).f3895a == 0) {
                    si0 si0Var = new si0(1, n2Var2);
                    int i14 = this.f670b;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i14).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f5946a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (fVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i14).sendRequest(tL_payments_assignPlayMarketTransaction, new za(i14, si0Var, n2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener("telegram_premium", new org.telegram.ui.g3(si0Var, 4));
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
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.e;
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f672f;
                da daVar = (da) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                boolean z11 = ((TLObject) this.f671c) instanceof TLRPC.TL_boolTrue;
                int i15 = this.f670b;
                if (z11) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.d1.x(i15, z0Var, daVar, "write_access_requested", jSONObject);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                } else if (tL_error2 != null) {
                    d1Var.Z(tL_error2.text);
                    return;
                } else {
                    String[] strArr2 = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d1Var.getContext());
                    alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new rv0(23, d1Var, strArr2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new ja0(18));
                    d1Var.Y(3, alertDialog$Builder.f18669a, new org.telegram.ui.web.x(strArr2, i15, z0Var, daVar, 1));
                    return;
                }
            case 13:
                TLObject tLObject3 = (TLObject) this.f671c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.e;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.f672f;
                dj djVar = (dj) this.d;
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) this.h;
                if (tLObject3 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject3;
                    int i16 = this.f670b;
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
                        djVar.run();
                        xc.a0(d5Var.getLastFragment()).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new qg.v(i16, d5Var)), null).j();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLObject tLObject4 = (TLObject) this.f671c;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f672f;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.d;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                ((ci.d) this.e).setLoading(false);
                if (tLObject4 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject4;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new xc(f3VarArr[0].topBulletinContainer, f6Var2).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        return;
                    }
                    final long j3 = tL_starsSubscriptionPricing.amount;
                    final int i17 = this.f670b;
                    yh.u5.y(i17, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            Long l4 = (Long) obj3;
                            if ("paid".equals((String) obj2) && l4.longValue() != 0) {
                                AndroidUtilities.runOnUIThread(new ai.y7(l4, i17, j3, 8));
                            }
                        }
                    });
                    return;
                }
                new xc(f3VarArr[0].topBulletinContainer, f6Var2).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                return;
        }
    }

    public cb(db dbVar, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.f669a = 0;
        this.e = dbVar;
        this.f671c = tLObject;
        this.f672f = obj;
        this.d = arrayList;
        this.h = zArr;
        this.f670b = i10;
    }

    public cb(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f669a = i11;
        this.e = obj;
        this.f670b = i10;
        this.f671c = obj2;
        this.f672f = obj3;
        this.d = obj4;
        this.h = obj5;
    }

    public cb(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.f669a = i11;
        this.e = obj;
        this.f671c = obj2;
        this.f672f = obj3;
        this.f670b = i10;
        this.d = obj4;
        this.h = obj5;
    }

    public cb(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5, int i11) {
        this.f669a = i11;
        this.e = obj;
        this.f671c = obj2;
        this.f672f = obj3;
        this.d = obj4;
        this.f670b = i10;
        this.h = obj5;
    }

    public cb(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f669a = 3;
        this.e = mediaDataController;
        this.h = zArr;
        this.d = arrayList;
        this.f671c = context;
        this.f672f = n2Var;
        this.f670b = i10;
    }

    public cb(ch0 ch0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f669a = 8;
        this.e = ch0Var;
        this.f672f = numArr;
        this.f670b = i10;
        this.f671c = tLObject;
        this.d = arrayList;
        this.h = pollAnswerVoters;
    }

    public cb(ss ssVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.f669a = 9;
        this.e = ssVar;
        this.f672f = fileLocation;
        this.d = inputFile;
        this.f671c = tLObject;
        this.h = fileLocation2;
        this.f670b = i10;
    }

    public cb(u70 u70Var, org.telegram.ui.f4 f4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.c1 c1Var) {
        this.f669a = 4;
        this.e = u70Var;
        this.f672f = f4Var;
        this.d = tL_error;
        this.f671c = tLObject;
        this.f670b = i10;
        this.h = c1Var;
    }

    public cb(org.telegram.ui.web.d1 d1Var, TLObject tLObject, int i10, org.telegram.ui.web.z0 z0Var, da daVar, TLRPC.TL_error tL_error) {
        this.f669a = 12;
        this.e = d1Var;
        this.f671c = tLObject;
        this.f670b = i10;
        this.f672f = z0Var;
        this.d = daVar;
        this.h = tL_error;
    }
}
