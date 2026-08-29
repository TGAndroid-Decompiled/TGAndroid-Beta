package jf;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import jh.s7;
import lh.b8;
import lh.d8;
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
import org.telegram.messenger.gi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.u50;
import org.telegram.ui.c60;
import org.telegram.ui.d70;
import org.telegram.ui.g1;
import org.telegram.ui.gw0;
import org.telegram.ui.h9;
import org.telegram.ui.hs;
import org.telegram.ui.k4;
import org.telegram.ui.l3;
import org.telegram.ui.n61;
import org.telegram.ui.nk0;
import org.telegram.ui.pk0;
import org.telegram.ui.tm;
import org.telegram.ui.ui;
import org.telegram.ui.web.w0;
import org.telegram.ui.web.z0;
import org.telegram.ui.zh0;
public final class j0 implements Runnable {
    public final int f11645a;
    public final Object f11646b;
    public final int f11647c;
    public final Object d;
    public final Object f11648e;
    public final Object f11649f;
    public final Object h;

    public j0(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f11645a = i11;
        this.f11646b = obj;
        this.f11647c = i10;
        this.d = obj2;
        this.f11648e = obj3;
        this.f11649f = obj4;
        this.h = obj5;
    }

    @Override
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.f11645a) {
            case 0:
                TLObject tLObject = (TLObject) this.f11646b;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.f11648e;
                ui uiVar = (ui) this.f11649f;
                b5 b5Var = (b5) this.h;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i10 = this.f11647c;
                    MessagesController.getInstance(i10).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).clientUserId));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && user != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 1000);
                        if (closestPhotoSizeWithSize != null && photoSize2 != null && photoSize2.location != null) {
                            FileLoader.getInstance(i10).getPathToAttach(photoSize2.location, true).renameTo(FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, true));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(photoSize2.location.volume_id);
                            sb2.append("_");
                            String l10 = a4.w.l(photoSize2.location.local_id, "@50_50", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            photoSize = closestPhotoSizeWithSize2;
                            sb3.append(closestPhotoSizeWithSize.location.volume_id);
                            sb3.append("_");
                            ImageLoader.getInstance().replaceImageInCache(l10, a4.w.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(i10, user, 1), false);
                        } else {
                            photoSize = closestPhotoSizeWithSize2;
                        }
                        if (photoSize != null && photoSize3 != null && photoSize3.location != null) {
                            FileLoader.getInstance(i10).getPathToAttach(photoSize3.location, true).renameTo(FileLoader.getInstance(i10).getPathToAttach(photoSize, true));
                        }
                        k0.a(tL_photos_photo.photo, user, false);
                        UserConfig.getInstance(i10).setCurrentUser(user);
                        UserConfig.getInstance(i10).saveConfig(true);
                        uiVar.run();
                        tc.a0(b5Var.getLastFragment()).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new bg.f(i10, b5Var, 5)), null).j();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLObject tLObject2 = (TLObject) this.f11646b;
                f3[] f3VarArr = (f3[]) this.f11648e;
                c6 c6Var = (c6) this.f11649f;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                ((nh.d) this.d).setLoading(false);
                if (tLObject2 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject2;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new tc(f3VarArr[0].topBulletinContainer, c6Var).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        return;
                    }
                    final long j10 = tL_starsSubscriptionPricing.amount;
                    final int i11 = this.f11647c;
                    s7.y(i11, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            Long l11 = (Long) obj2;
                            if ("paid".equals((String) obj) && l11.longValue() != 0) {
                                AndroidUtilities.runOnUIThread(new z8(l11, i11, j10, 0));
                            }
                        }
                    });
                    return;
                }
                new tc(f3VarArr[0].topBulletinContainer, c6Var).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                return;
            case 2:
                int i12 = this.f11647c;
                d8.a((d8) this.d, (TLObject) this.f11646b, this.f11648e, (ArrayList) this.f11649f, (boolean[]) this.h, i12);
                return;
            case 3:
                ((ChatObject.Call) this.d).lambda$loadUnknownParticipants$5(this.f11647c, (TLObject) this.f11646b, (ChatObject.Call.OnParticipantsLoad) this.f11648e, (ArrayList) this.f11649f, (HashSet) this.h);
                return;
            case 4:
                ((LocaleController) this.f11646b).lambda$saveRemoteLocaleStrings$10(this.f11647c, (LocaleController.LocaleInfo) this.d, (TLRPC.TL_langPackDifference) this.f11648e, (HashMap) this.f11649f, (Runnable) this.h);
                return;
            case 5:
                ((MediaDataController) this.f11646b).lambda$removeMultipleStickerSets$111((boolean[]) this.d, (ArrayList) this.f11648e, (Context) this.f11649f, (o2) this.h, this.f11647c);
                return;
            case 6:
                d70 d70Var = (d70) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f11649f;
                TLObject tLObject3 = (TLObject) this.f11646b;
                g1 g1Var = (g1) this.h;
                d70Var.f37385r = false;
                if (!((k4) this.f11648e).f39741e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            int i13 = this.f11647c;
                            MessagesController.getInstance(i13).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i13).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            d70Var.f37384n = chat;
                            if (chat.left && !chat.kicked) {
                                g1Var.a(0, false);
                                return;
                            } else {
                                g1Var.a(4, false);
                                return;
                            }
                        }
                        g1Var.a(4, false);
                        return;
                    }
                    g1Var.a(4, false);
                    return;
                }
                return;
            case 7:
                TLObject tLObject4 = (TLObject) this.f11646b;
                c2 c2Var = (c2) this.d;
                Context context = (Context) this.f11648e;
                c6 c6Var2 = (c6) this.f11649f;
                c60 c60Var = (c60) this.h;
                boolean z10 = tLObject4 instanceof TLRPC.Updates;
                int i14 = this.f11647c;
                int i15 = 0;
                if (z10) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject4;
                    MessagesController.getInstance(i14).putUsers(updates.users, false);
                    MessagesController.getInstance(i14).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i15 < size) {
                        Object obj = findUpdatesAndRemove.get(i15);
                        i15++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    c2Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f22409id = groupCall.f22402id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        h9.o0(context, i14, tL_inputGroupCall, groupCall.invite_link, c6Var2, true, true);
                        AndroidUtilities.runOnUIThread(c60Var);
                        return;
                    }
                    return;
                } else if (tLObject4 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject4;
                    MessagesController.getInstance(i14).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i14).putChats(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f22409id = groupCall2.f22402id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i14).sendRequest(exportgroupcallinvite, new gi(c2Var, context, i14, exportgroupcallinvite, c6Var2, c60Var));
                    return;
                } else {
                    c2Var.dismiss();
                    AndroidUtilities.runOnUIThread(c60Var);
                    return;
                }
            case 8:
                new n61((Context) this.f11646b, (TLRPC.Chat) this.d, (TLRPC.User) this.f11648e, new bg.f(this.f11647c, (MessagesStorage.BooleanCallback) this.f11649f, 28), (c6) this.h).show();
                return;
            case 9:
                s9.a((s9) this.f11646b, (Runnable[]) this.d, (Bitmap) this.f11648e, (u50) this.f11649f, this.f11647c, (i7.c6[]) this.h);
                return;
            case 10:
                lg0.m((lg0) this.d, (Integer[]) this.f11648e, this.f11647c, (TLObject) this.f11646b, (ArrayList) this.f11649f, (TLRPC.PollAnswerVoters) this.h);
                return;
            case 11:
                hs.Y((hs) this.d, (TLRPC.FileLocation) this.f11648e, (TLRPC.InputFile) this.f11649f, (TLObject) this.f11646b, (TLRPC.FileLocation) this.h, this.f11647c);
                return;
            case 12:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f11646b;
                String[] strArr = (String[]) this.d;
                Context context2 = (Context) this.f11648e;
                nk0 nk0Var = (nk0) this.f11649f;
                o2 o2Var = (o2) this.h;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    pk0.c(context2, this.f11647c, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new tm(28, strArr, nk0Var), true, new ag.o0(25), o2Var.getResourceProvider());
                    return;
                }
                nk0Var.run();
                return;
            case 13:
                o2 o2Var2 = (o2) this.d;
                List<Purchase> list = (List) this.f11648e;
                p2.e eVar = (p2.e) this.f11649f;
                gw0 gw0Var = (gw0) this.h;
                if (((p2.g) this.f11646b).f45457a == 0) {
                    zh0 zh0Var = new zh0(1, o2Var2);
                    int i16 = this.f11647c;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i16).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f3510a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (eVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i16).sendRequest(tL_payments_assignPlayMarketTransaction, new b8(i16, zh0Var, o2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener("telegram_premium", new l3(zh0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (eVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i16).sendRequest(tL_payments_canPurchaseStore, new gi(o2Var2, tL_inputStorePaymentPremiumSubscription2, gw0Var, eVar, i16, tL_payments_canPurchaseStore, 5));
                    return;
                }
                return;
            default:
                z0 z0Var = (z0) this.d;
                String str = (String) this.f11648e;
                TLObject tLObject5 = (TLObject) this.f11646b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f11649f;
                int i17 = this.f11647c;
                w0 w0Var = (w0) this.h;
                z0Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", str);
                    if (tLObject5 instanceof TLRPC.TL_dataJSON) {
                        jSONObject.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject5).data).nextValue());
                    } else if (tL_error2 != null) {
                        jSONObject.put("error", tL_error2.text);
                    }
                    z0.u(i17, w0Var, "custom_method_invoked", jSONObject);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    z0Var.S(null);
                    return;
                }
        }
    }

    public j0(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.f11645a = i11;
        this.f11646b = obj;
        this.d = obj2;
        this.f11648e = obj3;
        this.f11647c = i10;
        this.f11649f = obj4;
        this.h = obj5;
    }

    public j0(d8 d8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.f11645a = 2;
        this.d = d8Var;
        this.f11646b = tLObject;
        this.f11648e = obj;
        this.f11649f = arrayList;
        this.h = zArr;
        this.f11647c = i10;
    }

    public j0(nh.d dVar, TLObject tLObject, f3[] f3VarArr, c6 c6Var, int i10, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.f11645a = 1;
        this.d = dVar;
        this.f11646b = tLObject;
        this.f11648e = f3VarArr;
        this.f11649f = c6Var;
        this.f11647c = i10;
        this.h = tL_messages_checkChatInvite;
    }

    public j0(ChatObject.Call call, int i10, TLObject tLObject, ChatObject.Call.OnParticipantsLoad onParticipantsLoad, ArrayList arrayList, HashSet hashSet) {
        this.f11645a = 3;
        this.d = call;
        this.f11647c = i10;
        this.f11646b = tLObject;
        this.f11648e = onParticipantsLoad;
        this.f11649f = arrayList;
        this.h = hashSet;
    }

    public j0(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, o2 o2Var, int i10) {
        this.f11645a = 5;
        this.f11646b = mediaDataController;
        this.d = zArr;
        this.f11648e = arrayList;
        this.f11649f = context;
        this.h = o2Var;
        this.f11647c = i10;
    }

    public j0(s9 s9Var, Runnable[] runnableArr, Bitmap bitmap, u50 u50Var, int i10, i7.c6[] c6VarArr) {
        this.f11645a = 9;
        this.f11646b = s9Var;
        this.d = runnableArr;
        this.f11648e = bitmap;
        this.f11649f = u50Var;
        this.f11647c = i10;
        this.h = c6VarArr;
    }

    public j0(lg0 lg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f11645a = 10;
        this.d = lg0Var;
        this.f11648e = numArr;
        this.f11647c = i10;
        this.f11646b = tLObject;
        this.f11649f = arrayList;
        this.h = pollAnswerVoters;
    }

    public j0(hs hsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.f11645a = 11;
        this.d = hsVar;
        this.f11648e = fileLocation;
        this.f11649f = inputFile;
        this.f11646b = tLObject;
        this.h = fileLocation2;
        this.f11647c = i10;
    }

    public j0(d70 d70Var, k4 k4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, g1 g1Var) {
        this.f11645a = 6;
        this.d = d70Var;
        this.f11648e = k4Var;
        this.f11649f = tL_error;
        this.f11646b = tLObject;
        this.f11647c = i10;
        this.h = g1Var;
    }

    public j0(z0 z0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, w0 w0Var) {
        this.f11645a = 14;
        this.d = z0Var;
        this.f11648e = str;
        this.f11646b = tLObject;
        this.f11649f = tL_error;
        this.f11647c = i10;
        this.h = w0Var;
    }
}
