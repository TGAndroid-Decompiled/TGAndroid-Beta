package ff;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import bg.c2;
import bg.d2;
import com.android.billingclient.api.Purchase;
import gh.v7;
import ih.f8;
import ih.h8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONTokener;
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
import org.telegram.messenger.zh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ag0;
import org.telegram.ui.Components.h50;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.a60;
import org.telegram.ui.a70;
import org.telegram.ui.ai0;
import org.telegram.ui.eb0;
import org.telegram.ui.f1;
import org.telegram.ui.hw0;
import org.telegram.ui.i9;
import org.telegram.ui.is;
import org.telegram.ui.j4;
import org.telegram.ui.k3;
import org.telegram.ui.l61;
import org.telegram.ui.ri;
import org.telegram.ui.rk0;
import org.telegram.ui.tk0;
import org.telegram.ui.web.v0;
import org.telegram.ui.web.y0;
public final class k0 implements Runnable {
    public final int f6231a;
    public final Object f6232b;
    public final int f6233c;
    public final Object d;
    public final Object f6234e;
    public final Object f6235f;
    public final Object h;

    public k0(h8 h8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i9) {
        this.f6231a = 2;
        this.d = h8Var;
        this.f6232b = tLObject;
        this.f6234e = obj;
        this.f6235f = arrayList;
        this.h = zArr;
        this.f6233c = i9;
    }

    @Override
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.f6231a) {
            case 0:
                TLObject tLObject = (TLObject) this.f6232b;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.f6234e;
                ri riVar = (ri) this.f6235f;
                b5 b5Var = (b5) this.h;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i9 = this.f6233c;
                    MessagesController.getInstance(i9).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(UserConfig.getInstance(i9).clientUserId));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && user != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 1000);
                        if (closestPhotoSizeWithSize != null && photoSize2 != null && photoSize2.location != null) {
                            FileLoader.getInstance(i9).getPathToAttach(photoSize2.location, true).renameTo(FileLoader.getInstance(i9).getPathToAttach(closestPhotoSizeWithSize, true));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(photoSize2.location.volume_id);
                            sb2.append("_");
                            String l10 = aa.d.l(photoSize2.location.local_id, "@50_50", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            photoSize = closestPhotoSizeWithSize2;
                            sb3.append(closestPhotoSizeWithSize.location.volume_id);
                            sb3.append("_");
                            ImageLoader.getInstance().replaceImageInCache(l10, aa.d.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(i9, user, 1), false);
                        } else {
                            photoSize = closestPhotoSizeWithSize2;
                        }
                        if (photoSize != null && photoSize3 != null && photoSize3.location != null) {
                            FileLoader.getInstance(i9).getPathToAttach(photoSize3.location, true).renameTo(FileLoader.getInstance(i9).getPathToAttach(photoSize, true));
                        }
                        l0.a(tL_photos_photo.photo, user, false);
                        UserConfig.getInstance(i9).setCurrentUser(user);
                        UserConfig.getInstance(i9).saveConfig(true);
                        riVar.run();
                        oc.a0(b5Var.getLastFragment()).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new c2(i9, b5Var, 1)), null).j();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLObject tLObject2 = (TLObject) this.f6232b;
                f3[] f3VarArr = (f3[]) this.f6234e;
                b6 b6Var = (b6) this.f6235f;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                ((kh.d) this.d).setLoading(false);
                if (tLObject2 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject2;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new oc(f3VarArr[0].topBulletinContainer, b6Var).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        return;
                    }
                    final long j10 = tL_starsSubscriptionPricing.amount;
                    final int i10 = this.f6233c;
                    v7.y(i10, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            Long l11 = (Long) obj2;
                            if ("paid".equals((String) obj) && l11.longValue() != 0) {
                                AndroidUtilities.runOnUIThread(new e9(l11, i10, j10, 0));
                            }
                        }
                    });
                    return;
                }
                new oc(f3VarArr[0].topBulletinContainer, b6Var).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                return;
            case 2:
                int i11 = this.f6233c;
                h8.a((h8) this.d, (TLObject) this.f6232b, this.f6234e, (ArrayList) this.f6235f, (boolean[]) this.h, i11);
                return;
            case 3:
                ((ChatObject.Call) this.d).lambda$loadUnknownParticipants$5(this.f6233c, (TLObject) this.f6232b, (ChatObject.Call.OnParticipantsLoad) this.f6234e, (ArrayList) this.f6235f, (HashSet) this.h);
                return;
            case 4:
                ((LocaleController) this.f6232b).lambda$saveRemoteLocaleStrings$10(this.f6233c, (LocaleController.LocaleInfo) this.d, (TLRPC.TL_langPackDifference) this.f6234e, (HashMap) this.f6235f, (Runnable) this.h);
                return;
            case 5:
                ((MediaDataController) this.f6232b).lambda$removeMultipleStickerSets$111((boolean[]) this.d, (ArrayList) this.f6234e, (Context) this.f6235f, (o2) this.h, this.f6233c);
                return;
            case 6:
                a70 a70Var = (a70) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f6235f;
                TLObject tLObject3 = (TLObject) this.f6232b;
                f1 f1Var = (f1) this.h;
                a70Var.f36379r = false;
                if (!((j4) this.f6234e).f39360e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            int i12 = this.f6233c;
                            MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            a70Var.f36378n = chat;
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
                TLObject tLObject4 = (TLObject) this.f6232b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.d;
                Context context = (Context) this.f6234e;
                b6 b6Var2 = (b6) this.f6235f;
                a60 a60Var = (a60) this.h;
                boolean z10 = tLObject4 instanceof TLRPC.Updates;
                int i13 = this.f6233c;
                int i14 = 0;
                if (z10) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject4;
                    MessagesController.getInstance(i13).putUsers(updates.users, false);
                    MessagesController.getInstance(i13).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i14 < size) {
                        Object obj = findUpdatesAndRemove.get(i14);
                        i14++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    c2Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f22397id = groupCall.f22390id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        i9.n0(context, i13, tL_inputGroupCall, groupCall.invite_link, b6Var2, true, true);
                        AndroidUtilities.runOnUIThread(a60Var);
                        return;
                    }
                    return;
                } else if (tLObject4 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject4;
                    MessagesController.getInstance(i13).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i13).putChats(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f22397id = groupCall2.f22390id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i13).sendRequest(exportgroupcallinvite, new zh(c2Var, context, i13, exportgroupcallinvite, b6Var2, a60Var));
                    return;
                } else {
                    c2Var.dismiss();
                    AndroidUtilities.runOnUIThread(a60Var);
                    return;
                }
            case 8:
                new l61((Context) this.f6232b, (TLRPC.Chat) this.d, (TLRPC.User) this.f6234e, new c2(this.f6233c, (MessagesStorage.BooleanCallback) this.f6235f, 26), (b6) this.h).show();
                return;
            case 9:
                n9.a((n9) this.f6232b, (Runnable[]) this.d, (Bitmap) this.f6234e, (h50) this.f6235f, this.f6233c, (g7.b6[]) this.h);
                return;
            case 10:
                ag0.m((ag0) this.d, (Integer[]) this.f6234e, this.f6233c, (TLObject) this.f6232b, (ArrayList) this.f6235f, (TLRPC.PollAnswerVoters) this.h);
                return;
            case 11:
                is.X((is) this.d, (TLRPC.FileLocation) this.f6234e, (TLRPC.InputFile) this.f6235f, (TLObject) this.f6232b, (TLRPC.FileLocation) this.h, this.f6233c);
                return;
            case 12:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f6232b;
                String[] strArr = (String[]) this.d;
                Context context2 = (Context) this.f6234e;
                rk0 rk0Var = (rk0) this.f6235f;
                o2 o2Var = (o2) this.h;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    tk0.c(context2, this.f6233c, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new eb0(5, strArr, rk0Var), true, new d2(23), o2Var.getResourceProvider());
                    return;
                }
                rk0Var.run();
                return;
            case 13:
                o2 o2Var2 = (o2) this.d;
                List<Purchase> list = (List) this.f6234e;
                n2.e eVar = (n2.e) this.f6235f;
                hw0 hw0Var = (hw0) this.h;
                if (((n2.g) this.f6232b).f18319a == 0) {
                    ai0 ai0Var = new ai0(1, o2Var2);
                    int i15 = this.f6233c;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i15).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f2496a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (eVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i15).sendRequest(tL_payments_assignPlayMarketTransaction, new f8(i15, ai0Var, o2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener("telegram_premium", new k3(ai0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (eVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i15).sendRequest(tL_payments_canPurchaseStore, new zh(o2Var2, tL_inputStorePaymentPremiumSubscription2, hw0Var, eVar, i15, tL_payments_canPurchaseStore, 5));
                    return;
                }
                return;
            default:
                y0 y0Var = (y0) this.d;
                String str = (String) this.f6234e;
                TLObject tLObject5 = (TLObject) this.f6232b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f6235f;
                int i16 = this.f6233c;
                v0 v0Var = (v0) this.h;
                y0Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", str);
                    if (tLObject5 instanceof TLRPC.TL_dataJSON) {
                        jSONObject.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject5).data).nextValue());
                    } else if (tL_error2 != null) {
                        jSONObject.put("error", tL_error2.text);
                    }
                    y0.u(i16, v0Var, "custom_method_invoked", jSONObject);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    y0Var.S(null);
                    return;
                }
        }
    }

    public k0(Object obj, int i9, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f6231a = i10;
        this.f6232b = obj;
        this.f6233c = i9;
        this.d = obj2;
        this.f6234e = obj3;
        this.f6235f = obj4;
        this.h = obj5;
    }

    public k0(Object obj, Object obj2, Object obj3, int i9, Object obj4, Object obj5, int i10) {
        this.f6231a = i10;
        this.f6232b = obj;
        this.d = obj2;
        this.f6234e = obj3;
        this.f6233c = i9;
        this.f6235f = obj4;
        this.h = obj5;
    }

    public k0(kh.d dVar, TLObject tLObject, f3[] f3VarArr, b6 b6Var, int i9, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.f6231a = 1;
        this.d = dVar;
        this.f6232b = tLObject;
        this.f6234e = f3VarArr;
        this.f6235f = b6Var;
        this.f6233c = i9;
        this.h = tL_messages_checkChatInvite;
    }

    public k0(ChatObject.Call call, int i9, TLObject tLObject, ChatObject.Call.OnParticipantsLoad onParticipantsLoad, ArrayList arrayList, HashSet hashSet) {
        this.f6231a = 3;
        this.d = call;
        this.f6233c = i9;
        this.f6232b = tLObject;
        this.f6234e = onParticipantsLoad;
        this.f6235f = arrayList;
        this.h = hashSet;
    }

    public k0(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, o2 o2Var, int i9) {
        this.f6231a = 5;
        this.f6232b = mediaDataController;
        this.d = zArr;
        this.f6234e = arrayList;
        this.f6235f = context;
        this.h = o2Var;
        this.f6233c = i9;
    }

    public k0(n9 n9Var, Runnable[] runnableArr, Bitmap bitmap, h50 h50Var, int i9, g7.b6[] b6VarArr) {
        this.f6231a = 9;
        this.f6232b = n9Var;
        this.d = runnableArr;
        this.f6234e = bitmap;
        this.f6235f = h50Var;
        this.f6233c = i9;
        this.h = b6VarArr;
    }

    public k0(ag0 ag0Var, Integer[] numArr, int i9, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f6231a = 10;
        this.d = ag0Var;
        this.f6234e = numArr;
        this.f6233c = i9;
        this.f6232b = tLObject;
        this.f6235f = arrayList;
        this.h = pollAnswerVoters;
    }

    public k0(is isVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i9) {
        this.f6231a = 11;
        this.d = isVar;
        this.f6234e = fileLocation;
        this.f6235f = inputFile;
        this.f6232b = tLObject;
        this.h = fileLocation2;
        this.f6233c = i9;
    }

    public k0(a70 a70Var, j4 j4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i9, f1 f1Var) {
        this.f6231a = 6;
        this.d = a70Var;
        this.f6234e = j4Var;
        this.f6235f = tL_error;
        this.f6232b = tLObject;
        this.f6233c = i9;
        this.h = f1Var;
    }

    public k0(y0 y0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i9, v0 v0Var) {
        this.f6231a = 14;
        this.d = y0Var;
        this.f6234e = str;
        this.f6232b = tLObject;
        this.f6235f = tL_error;
        this.f6233c = i9;
        this.h = v0Var;
    }
}
