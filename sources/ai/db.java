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
import org.telegram.messenger.ki;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.th0;
import org.telegram.ui.cj;
import org.telegram.ui.et;
import org.telegram.ui.il0;
import org.telegram.ui.js0;
import org.telegram.ui.kx0;
import org.telegram.ui.ll0;
import org.telegram.ui.ps;
import org.telegram.ui.ri0;
import org.telegram.ui.s60;
import org.telegram.ui.t70;
import org.telegram.ui.t71;
import org.telegram.ui.v20;
public final class db implements Runnable {
    public final int f861a;
    public final int f862b;
    public final Object f863c;
    public final Object d;
    public final Object f864e;
    public final Object f865f;
    public final Object h;

    public db(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f861a = i11;
        this.f863c = tLObject;
        this.f862b = i10;
        this.f864e = obj;
        this.f865f = obj2;
        this.d = obj3;
        this.h = obj4;
    }

    @Override
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.f861a) {
            case 0:
                int i10 = this.f862b;
                eb.a((eb) this.f864e, (TLObject) this.f863c, this.f865f, (ArrayList) this.d, (boolean[]) this.h, i10);
                return;
            case 1:
                ((ChatObject.Call) this.f864e).lambda$loadUnknownParticipants$5(this.f862b, (TLObject) this.f863c, (ChatObject.Call.OnParticipantsLoad) this.f865f, (ArrayList) this.d, (HashSet) this.h);
                return;
            case 2:
                ((LocaleController) this.f864e).lambda$saveRemoteLocaleStrings$10(this.f862b, (LocaleController.LocaleInfo) this.f863c, (TLRPC.TL_langPackDifference) this.f865f, (HashMap) this.d, (Runnable) this.h);
                return;
            case 3:
                ((MediaDataController) this.f864e).lambda$removeMultipleStickerSets$111((boolean[]) this.h, (ArrayList) this.d, (Context) this.f863c, (org.telegram.ui.ActionBar.m2) this.f865f, this.f862b);
                return;
            case 4:
                t70 t70Var = (t70) this.f864e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.f863c;
                org.telegram.ui.c1 c1Var = (org.telegram.ui.c1) this.h;
                t70Var.f42136r = false;
                if (!((org.telegram.ui.f4) this.f865f).f37562e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            int i11 = this.f862b;
                            MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            t70Var.f42135n = chat;
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
                TLObject tLObject2 = (TLObject) this.f863c;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f864e;
                Context context = (Context) this.f865f;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                s60 s60Var = (s60) this.h;
                boolean z10 = tLObject2 instanceof TLRPC.Updates;
                int i12 = this.f862b;
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
                        tL_inputGroupCall.f20085id = groupCall.f20078id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.i9.o0(context, i12, tL_inputGroupCall, groupCall.invite_link, d6Var, true, true);
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
                    tL_inputGroupCall2.f20085id = groupCall2.f20078id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i12).sendRequest(exportgroupcallinvite, new ki(a2Var, context, i12, exportgroupcallinvite, d6Var, s60Var));
                    return;
                } else {
                    a2Var.dismiss();
                    AndroidUtilities.runOnUIThread(s60Var);
                    return;
                }
            case 6:
                new t71((Context) this.f864e, (TLRPC.Chat) this.f863c, (TLRPC.User) this.f865f, new p8(this.f862b, (MessagesStorage.BooleanCallback) this.d, 27), (org.telegram.ui.ActionBar.d6) this.h).show();
                return;
            case 7:
                org.telegram.ui.Components.x9.a((org.telegram.ui.Components.x9) this.f864e, (Runnable[]) this.f863c, (Bitmap) this.f865f, (a70) this.d, this.f862b, (w7.i0[]) this.h);
                return;
            case 8:
                th0.o((th0) this.f864e, (Integer[]) this.f865f, this.f862b, (TLObject) this.f863c, (ArrayList) this.d, (TLRPC.PollAnswerVoters) this.h);
                return;
            case 9:
                ps.Y((ps) this.f864e, (TLRPC.FileLocation) this.f865f, (TLRPC.InputFile) this.d, (TLObject) this.f863c, (TLRPC.FileLocation) this.h, this.f862b);
                return;
            case 10:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f864e;
                String[] strArr = (String[]) this.f863c;
                Context context2 = (Context) this.f865f;
                il0 il0Var = (il0) this.d;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.h;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    ll0.c(context2, this.f862b, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new et(10, strArr, il0Var), true, new f(18), m2Var.getResourceProvider());
                    return;
                }
                il0Var.run();
                return;
            case 11:
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.f863c;
                List<Purchase> list = (List) this.f865f;
                c5.f fVar = (c5.f) this.d;
                kx0 kx0Var = (kx0) this.h;
                if (((c5.h) this.f864e).f4253a == 0) {
                    ri0 ri0Var = new ri0(1, m2Var2);
                    int i14 = this.f862b;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i14).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f6442a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (fVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i14).sendRequest(tL_payments_assignPlayMarketTransaction, new ab(i14, ri0Var, m2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener("telegram_premium", new org.telegram.ui.g3(ri0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (fVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i14).sendRequest(tL_payments_canPurchaseStore, new ki(i14, 5, m2Var2, kx0Var, fVar, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f864e;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.f865f;
                ea eaVar = (ea) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                boolean z11 = ((TLObject) this.f863c) instanceof TLRPC.TL_boolTrue;
                int i15 = this.f862b;
                if (z11) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.b1.w(i15, y0Var, eaVar, "write_access_requested", jSONObject);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                } else if (tL_error2 != null) {
                    b1Var.Y(tL_error2.text);
                    return;
                } else {
                    String[] strArr2 = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b1Var.getContext());
                    alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new js0(28, b1Var, strArr2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new v20(23));
                    b1Var.X(3, alertDialog$Builder.f20404a, new org.telegram.ui.web.w(strArr2, i15, y0Var, eaVar, 1));
                    return;
                }
            case 13:
                TLObject tLObject3 = (TLObject) this.f863c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.f864e;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.f865f;
                cj cjVar = (cj) this.d;
                org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.h;
                if (tLObject3 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject3;
                    int i16 = this.f862b;
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
                            String o9 = a1.g.o(photoSize2.location.local_id, "@50_50", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            photoSize = closestPhotoSizeWithSize2;
                            sb3.append(closestPhotoSizeWithSize.location.volume_id);
                            sb3.append("_");
                            ImageLoader.getInstance().replaceImageInCache(o9, a1.g.o(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(i16, user, 1), false);
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
                        ad.a0(b5Var.getLastFragment()).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new org.telegram.ui.Wallet.j(i16, b5Var, 9)), null).j();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLObject tLObject4 = (TLObject) this.f863c;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.f865f;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                ((ci.d) this.f864e).setLoading(false);
                if (tLObject4 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject4;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new ad(e3VarArr[0].topBulletinContainer, d6Var2).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        return;
                    }
                    final long j3 = tL_starsSubscriptionPricing.amount;
                    final int i17 = this.f862b;
                    yh.n5.y(i17, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            Long l4 = (Long) obj3;
                            if ("paid".equals((String) obj2) && l4.longValue() != 0) {
                                AndroidUtilities.runOnUIThread(new ai.b8(l4, i17, j3, 8));
                            }
                        }
                    });
                    return;
                }
                new ad(e3VarArr[0].topBulletinContainer, d6Var2).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                return;
        }
    }

    public db(eb ebVar, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.f861a = 0;
        this.f864e = ebVar;
        this.f863c = tLObject;
        this.f865f = obj;
        this.d = arrayList;
        this.h = zArr;
        this.f862b = i10;
    }

    public db(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f861a = i11;
        this.f864e = obj;
        this.f862b = i10;
        this.f863c = obj2;
        this.f865f = obj3;
        this.d = obj4;
        this.h = obj5;
    }

    public db(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.f861a = i11;
        this.f864e = obj;
        this.f863c = obj2;
        this.f865f = obj3;
        this.f862b = i10;
        this.d = obj4;
        this.h = obj5;
    }

    public db(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5, int i11) {
        this.f861a = i11;
        this.f864e = obj;
        this.f863c = obj2;
        this.f865f = obj3;
        this.d = obj4;
        this.f862b = i10;
        this.h = obj5;
    }

    public db(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f861a = 3;
        this.f864e = mediaDataController;
        this.h = zArr;
        this.d = arrayList;
        this.f863c = context;
        this.f865f = m2Var;
        this.f862b = i10;
    }

    public db(th0 th0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f861a = 8;
        this.f864e = th0Var;
        this.f865f = numArr;
        this.f862b = i10;
        this.f863c = tLObject;
        this.d = arrayList;
        this.h = pollAnswerVoters;
    }

    public db(ps psVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.f861a = 9;
        this.f864e = psVar;
        this.f865f = fileLocation;
        this.d = inputFile;
        this.f863c = tLObject;
        this.h = fileLocation2;
        this.f862b = i10;
    }

    public db(t70 t70Var, org.telegram.ui.f4 f4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.c1 c1Var) {
        this.f861a = 4;
        this.f864e = t70Var;
        this.f865f = f4Var;
        this.d = tL_error;
        this.f863c = tLObject;
        this.f862b = i10;
        this.h = c1Var;
    }

    public db(org.telegram.ui.web.b1 b1Var, TLObject tLObject, int i10, org.telegram.ui.web.y0 y0Var, ea eaVar, TLRPC.TL_error tL_error) {
        this.f861a = 12;
        this.f864e = b1Var;
        this.f863c = tLObject;
        this.f862b = i10;
        this.f865f = y0Var;
        this.d = eaVar;
        this.h = tL_error;
    }
}
