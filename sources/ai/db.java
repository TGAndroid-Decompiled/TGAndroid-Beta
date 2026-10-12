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
import org.telegram.messenger.pi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.c80;
import org.telegram.ui.gj;
import org.telegram.ui.jt;
import org.telegram.ui.kl0;
import org.telegram.ui.nl0;
import org.telegram.ui.ns0;
import org.telegram.ui.nx0;
import org.telegram.ui.ti0;
import org.telegram.ui.ts;
import org.telegram.ui.u60;
import org.telegram.ui.w70;
import org.telegram.ui.x71;
public final class db implements Runnable {
    public final int f859a;
    public final int f860b;
    public final Object f861c;
    public final Object d;
    public final Object f862e;
    public final Object f863f;
    public final Object h;

    public db(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f859a = i11;
        this.f861c = tLObject;
        this.f860b = i10;
        this.f862e = obj;
        this.f863f = obj2;
        this.d = obj3;
        this.h = obj4;
    }

    @Override
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.f859a) {
            case 0:
                int i10 = this.f860b;
                eb.a((eb) this.f862e, (TLObject) this.f861c, this.f863f, (ArrayList) this.d, (boolean[]) this.h, i10);
                return;
            case 1:
                ((ChatObject.Call) this.f862e).lambda$loadUnknownParticipants$5(this.f860b, (TLObject) this.f861c, (ChatObject.Call.OnParticipantsLoad) this.f863f, (ArrayList) this.d, (HashSet) this.h);
                return;
            case 2:
                ((LocaleController) this.f862e).lambda$saveRemoteLocaleStrings$10(this.f860b, (LocaleController.LocaleInfo) this.f861c, (TLRPC.TL_langPackDifference) this.f863f, (HashMap) this.d, (Runnable) this.h);
                return;
            case 3:
                ((MediaDataController) this.f862e).lambda$removeMultipleStickerSets$111((boolean[]) this.h, (ArrayList) this.d, (Context) this.f861c, (org.telegram.ui.ActionBar.m2) this.f863f, this.f860b);
                return;
            case 4:
                w70 w70Var = (w70) this.f862e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.f861c;
                org.telegram.ui.d1 d1Var = (org.telegram.ui.d1) this.h;
                w70Var.f43072r = false;
                if (!((org.telegram.ui.g4) this.f863f).f37918e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            int i11 = this.f860b;
                            MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            w70Var.f43071n = chat;
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
                TLObject tLObject2 = (TLObject) this.f861c;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f862e;
                Context context = (Context) this.f863f;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
                u60 u60Var = (u60) this.h;
                boolean z10 = tLObject2 instanceof TLRPC.Updates;
                int i12 = this.f860b;
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
                        tL_inputGroupCall.f19819id = groupCall.f19812id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.m9.o0(context, i12, tL_inputGroupCall, groupCall.invite_link, c6Var, true, true);
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
                    tL_inputGroupCall2.f19819id = groupCall2.f19812id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i12).sendRequest(exportgroupcallinvite, new pi(a2Var, context, i12, exportgroupcallinvite, c6Var, u60Var));
                    return;
                } else {
                    a2Var.dismiss();
                    AndroidUtilities.runOnUIThread(u60Var);
                    return;
                }
            case 6:
                new x71((Context) this.f862e, (TLRPC.Chat) this.f861c, (TLRPC.User) this.f863f, new p8(this.f860b, (MessagesStorage.BooleanCallback) this.d, 27), (org.telegram.ui.ActionBar.c6) this.h).show();
                return;
            case 7:
                org.telegram.ui.Components.x9.a((org.telegram.ui.Components.x9) this.f862e, (Runnable[]) this.f861c, (Bitmap) this.f863f, (d70) this.d, this.f860b, (w7.h0[]) this.h);
                return;
            case 8:
                wh0.o((wh0) this.f862e, (Integer[]) this.f863f, this.f860b, (TLObject) this.f861c, (ArrayList) this.d, (TLRPC.PollAnswerVoters) this.h);
                return;
            case 9:
                ts.Y((ts) this.f862e, (TLRPC.FileLocation) this.f863f, (TLRPC.InputFile) this.d, (TLObject) this.f861c, (TLRPC.FileLocation) this.h, this.f860b);
                return;
            case 10:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f862e;
                String[] strArr = (String[]) this.f861c;
                Context context2 = (Context) this.f863f;
                kl0 kl0Var = (kl0) this.d;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.h;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    nl0.c(context2, this.f860b, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new jt(10, strArr, kl0Var), true, new f(18), m2Var.getResourceProvider());
                    return;
                }
                kl0Var.run();
                return;
            case 11:
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.f861c;
                List<Purchase> list = (List) this.f863f;
                c5.f fVar = (c5.f) this.d;
                nx0 nx0Var = (nx0) this.h;
                if (((c5.h) this.f862e).f4252a == 0) {
                    ti0 ti0Var = new ti0(1, m2Var2);
                    int i14 = this.f860b;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i14).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f6441a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (fVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i14).sendRequest(tL_payments_assignPlayMarketTransaction, new ab(i14, ti0Var, m2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener("telegram_premium", new org.telegram.ui.h3(ti0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (fVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i14).sendRequest(tL_payments_canPurchaseStore, new pi(i14, 5, m2Var2, nx0Var, fVar, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    return;
                }
                return;
            case 12:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f862e;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.f863f;
                ea eaVar = (ea) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                boolean z11 = ((TLObject) this.f861c) instanceof TLRPC.TL_boolTrue;
                int i15 = this.f860b;
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
                    alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new ns0(27, b1Var, strArr2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new c80(21));
                    b1Var.X(3, alertDialog$Builder.f20141a, new org.telegram.ui.web.w(strArr2, i15, y0Var, eaVar, 1));
                    return;
                }
            case 13:
                TLObject tLObject3 = (TLObject) this.f861c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.f862e;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.f863f;
                gj gjVar = (gj) this.d;
                org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.h;
                if (tLObject3 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject3;
                    int i16 = this.f860b;
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
                        gjVar.run();
                        zc.a0(b5Var.getLastFragment()).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new org.telegram.ui.Wallet.i(i16, b5Var, 9)), null).j();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLObject tLObject4 = (TLObject) this.f861c;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.f863f;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.d;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                ((ci.d) this.f862e).setLoading(false);
                if (tLObject4 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject4;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new zc(e3VarArr[0].topBulletinContainer, c6Var2).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        return;
                    }
                    final long j3 = tL_starsSubscriptionPricing.amount;
                    final int i17 = this.f860b;
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
                new zc(e3VarArr[0].topBulletinContainer, c6Var2).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                return;
        }
    }

    public db(eb ebVar, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.f859a = 0;
        this.f862e = ebVar;
        this.f861c = tLObject;
        this.f863f = obj;
        this.d = arrayList;
        this.h = zArr;
        this.f860b = i10;
    }

    public db(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f859a = i11;
        this.f862e = obj;
        this.f860b = i10;
        this.f861c = obj2;
        this.f863f = obj3;
        this.d = obj4;
        this.h = obj5;
    }

    public db(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.f859a = i11;
        this.f862e = obj;
        this.f861c = obj2;
        this.f863f = obj3;
        this.f860b = i10;
        this.d = obj4;
        this.h = obj5;
    }

    public db(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5, int i11) {
        this.f859a = i11;
        this.f862e = obj;
        this.f861c = obj2;
        this.f863f = obj3;
        this.d = obj4;
        this.f860b = i10;
        this.h = obj5;
    }

    public db(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f859a = 3;
        this.f862e = mediaDataController;
        this.h = zArr;
        this.d = arrayList;
        this.f861c = context;
        this.f863f = m2Var;
        this.f860b = i10;
    }

    public db(wh0 wh0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f859a = 8;
        this.f862e = wh0Var;
        this.f863f = numArr;
        this.f860b = i10;
        this.f861c = tLObject;
        this.d = arrayList;
        this.h = pollAnswerVoters;
    }

    public db(ts tsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.f859a = 9;
        this.f862e = tsVar;
        this.f863f = fileLocation;
        this.d = inputFile;
        this.f861c = tLObject;
        this.h = fileLocation2;
        this.f860b = i10;
    }

    public db(w70 w70Var, org.telegram.ui.g4 g4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.d1 d1Var) {
        this.f859a = 4;
        this.f862e = w70Var;
        this.f863f = g4Var;
        this.d = tL_error;
        this.f861c = tLObject;
        this.f860b = i10;
        this.h = d1Var;
    }

    public db(org.telegram.ui.web.b1 b1Var, TLObject tLObject, int i10, org.telegram.ui.web.y0 y0Var, ea eaVar, TLRPC.TL_error tL_error) {
        this.f859a = 12;
        this.f862e = b1Var;
        this.f861c = tLObject;
        this.f860b = i10;
        this.f863f = y0Var;
        this.d = eaVar;
        this.h = tL_error;
    }
}
