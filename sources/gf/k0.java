package gf;

import ag.l3;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import cg.w1;
import com.android.billingclient.api.Purchase;
import h7.w5;
import hh.u7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import jh.b8;
import jh.d8;
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
import org.telegram.messenger.di;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.m50;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.mc;
import org.telegram.ui.ci0;
import org.telegram.ui.d70;
import org.telegram.ui.e60;
import org.telegram.ui.g1;
import org.telegram.ui.hw0;
import org.telegram.ui.ib0;
import org.telegram.ui.j9;
import org.telegram.ui.js;
import org.telegram.ui.k4;
import org.telegram.ui.k61;
import org.telegram.ui.rk0;
import org.telegram.ui.ti;
import org.telegram.ui.tk0;
import org.telegram.ui.web.w0;
import org.telegram.ui.web.z0;

public final class k0 implements Runnable {

    public final int f7031a;

    public final Object f7032b;

    public final int f7033c;
    public final Object d;

    public final Object f7034e;

    public final Object f7035f;
    public final Object h;

    public k0(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f7031a = i11;
        this.f7032b = obj;
        this.f7033c = i10;
        this.d = obj2;
        this.f7034e = obj3;
        this.f7035f = obj4;
        this.h = obj5;
    }

    @Override
    public final void run() {
        switch (this.f7031a) {
            case 0:
                TLObject tLObject = (TLObject) this.f7032b;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.d;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.f7034e;
                ti tiVar = (ti) this.f7035f;
                b5 b5Var = (b5) this.h;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i10 = this.f7033c;
                    MessagesController.getInstance(i10).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).clientUserId));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && user != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 1000);
                        if (closestPhotoSizeWithSize != null && photoSize != null && photoSize.location != null) {
                            FileLoader.getInstance(i10).getPathToAttach(photoSize.location, true).renameTo(FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, true));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(photoSize.location.volume_id);
                            sb2.append("_");
                            String strK = a9.p.k(photoSize.location.local_id, "@50_50", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(closestPhotoSizeWithSize.location.volume_id);
                            sb3.append("_");
                            ImageLoader.getInstance().replaceImageInCache(strK, a9.p.k(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(i10, user, 1), false);
                        }
                        if (closestPhotoSizeWithSize2 != 0 && photoSize2 != null && photoSize2.location != null) {
                            FileLoader.getInstance(i10).getPathToAttach(photoSize2.location, true).renameTo(FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize2, true));
                        }
                        l0.a(tL_photos_photo.photo, user, false);
                        UserConfig.getInstance(i10).setCurrentUser(user);
                        UserConfig.getInstance(i10).saveConfig(true);
                        tiVar.run();
                        mc.a0(b5Var.getLastFragment()).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new w1(i10, b5Var, 1)), null).j();
                        break;
                    }
                }
                break;
            case 1:
                lh.d dVar = (lh.d) this.d;
                TLObject tLObject2 = (TLObject) this.f7032b;
                e3[] e3VarArr = (e3[]) this.f7034e;
                c6 c6Var = (c6) this.f7035f;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                dVar.setLoading(false);
                if (tLObject2 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject2;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new mc(e3VarArr[0].topBulletinContainer, c6Var).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                    } else {
                        final long j10 = tL_starsSubscriptionPricing.amount;
                        final int i11 = this.f7033c;
                        u7.y(i11, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                Long l10 = (Long) obj2;
                                if (!"paid".equals((String) obj) || l10.longValue() == 0) {
                                    return;
                                }
                                AndroidUtilities.runOnUIThread(new d9(l10, i11, j10, 0));
                            }
                        });
                    }
                } else {
                    new mc(e3VarArr[0].topBulletinContainer, c6Var).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                }
                break;
            case 2:
                d8.a((d8) this.d, (TLObject) this.f7032b, this.f7034e, (ArrayList) this.f7035f, (boolean[]) this.h, this.f7033c);
                break;
            case 3:
                ((ChatObject.Call) this.d).lambda$loadUnknownParticipants$5(this.f7033c, (TLObject) this.f7032b, (ChatObject.Call.OnParticipantsLoad) this.f7034e, (ArrayList) this.f7035f, (HashSet) this.h);
                break;
            case 4:
                ((LocaleController) this.f7032b).lambda$saveRemoteLocaleStrings$10(this.f7033c, (LocaleController.LocaleInfo) this.d, (TLRPC.TL_langPackDifference) this.f7034e, (HashMap) this.f7035f, (Runnable) this.h);
                break;
            case 5:
                ((MediaDataController) this.f7032b).lambda$removeMultipleStickerSets$111((boolean[]) this.d, (ArrayList) this.f7034e, (Context) this.f7035f, (n2) this.h, this.f7033c);
                break;
            case 6:
                d70 d70Var = (d70) this.d;
                k4 k4Var = (k4) this.f7034e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f7035f;
                TLObject tLObject3 = (TLObject) this.f7032b;
                g1 g1Var = (g1) this.h;
                d70Var.f37290r = false;
                if (!k4Var.f39590e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                        if (tL_contacts_resolvedPeer.chats.isEmpty()) {
                            g1Var.a(4, false);
                        } else {
                            int i12 = this.f7033c;
                            MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            d70Var.f37289n = chat;
                            if (!chat.left || chat.kicked) {
                                g1Var.a(4, false);
                            } else {
                                g1Var.a(0, false);
                            }
                        }
                    } else {
                        g1Var.a(4, false);
                    }
                    break;
                }
                break;
            case 7:
                TLObject tLObject4 = (TLObject) this.f7032b;
                b2 b2Var = (b2) this.d;
                Context context = (Context) this.f7034e;
                c6 c6Var2 = (c6) this.f7035f;
                e60 e60Var = (e60) this.h;
                boolean z10 = tLObject4 instanceof TLRPC.Updates;
                int i13 = this.f7033c;
                int i14 = 0;
                if (z10) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject4;
                    MessagesController.getInstance(i13).putUsers(updates.users, false);
                    MessagesController.getInstance(i13).putChats(updates.chats, false);
                    ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size = arrayListFindUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i14 < size) {
                        Object obj = arrayListFindUpdatesAndRemove.get(i14);
                        i14++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    b2Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f22397id = groupCall.f22390id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        j9.o0(context, i13, tL_inputGroupCall, groupCall.invite_link, c6Var2, true, true);
                        AndroidUtilities.runOnUIThread(e60Var);
                    }
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
                    ConnectionsManager.getInstance(i13).sendRequest(exportgroupcallinvite, new di(b2Var, context, i13, exportgroupcallinvite, c6Var2, e60Var));
                } else {
                    b2Var.dismiss();
                    AndroidUtilities.runOnUIThread(e60Var);
                }
                break;
            case 8:
                Context context2 = (Context) this.f7032b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                TLRPC.User user2 = (TLRPC.User) this.f7034e;
                MessagesStorage.BooleanCallback booleanCallback = (MessagesStorage.BooleanCallback) this.f7035f;
                new k61(context2, chat2, user2, new w1(this.f7033c, booleanCallback, 25), (c6) this.h).show();
                break;
            case 9:
                m9.a((m9) this.f7032b, (Runnable[]) this.d, (Bitmap) this.f7034e, (m50) this.f7035f, this.f7033c, (w5[]) this.h);
                break;
            case 10:
                cg0.m((cg0) this.d, (Integer[]) this.f7034e, this.f7033c, (TLObject) this.f7032b, (ArrayList) this.f7035f, (TLRPC.PollAnswerVoters) this.h);
                break;
            case 11:
                js.Y((js) this.d, (TLRPC.FileLocation) this.f7034e, (TLRPC.InputFile) this.f7035f, (TLObject) this.f7032b, (TLRPC.FileLocation) this.h, this.f7033c);
                break;
            case 12:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f7032b;
                String[] strArr = (String[]) this.d;
                Context context3 = (Context) this.f7034e;
                rk0 rk0Var = (rk0) this.f7035f;
                n2 n2Var = (n2) this.h;
                if (tL_urlAuthResultRequest.match_codes.isEmpty() || !TextUtils.isEmpty(strArr[0])) {
                    rk0Var.run();
                } else {
                    tk0.c(context3, this.f7033c, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new ib0(5, strArr, rk0Var), true, new l3(22), n2Var.getResourceProvider());
                }
                break;
            case 13:
                n2.g gVar = (n2.g) this.f7032b;
                n2 n2Var2 = (n2) this.d;
                List<Purchase> list = (List) this.f7034e;
                n2.e eVar = (n2.e) this.f7035f;
                hw0 hw0Var = (hw0) this.h;
                if (gVar.f18147a == 0) {
                    ci0 ci0Var = new ci0(1, n2Var2);
                    int i15 = this.f7033c;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i15).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f2933a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (eVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i15).sendRequest(tL_payments_assignPlayMarketTransaction, new b8(i15, ci0Var, n2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                break;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener("telegram_premium", new org.telegram.ui.l3(ci0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (eVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i15).sendRequest(tL_payments_canPurchaseStore, new di(n2Var2, tL_inputStorePaymentPremiumSubscription2, hw0Var, eVar, i15, tL_payments_canPurchaseStore, 5));
                }
                break;
            default:
                z0 z0Var = (z0) this.d;
                String str = (String) this.f7034e;
                TLObject tLObject5 = (TLObject) this.f7032b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f7035f;
                int i16 = this.f7033c;
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
                    z0.u(i16, w0Var, "custom_method_invoked", jSONObject);
                } catch (Exception e9) {
                    FileLog.e(e9);
                    z0Var.S(null);
                }
                break;
        }
    }

    public k0(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.f7031a = i11;
        this.f7032b = obj;
        this.d = obj2;
        this.f7034e = obj3;
        this.f7033c = i10;
        this.f7035f = obj4;
        this.h = obj5;
    }

    public k0(d8 d8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.f7031a = 2;
        this.d = d8Var;
        this.f7032b = tLObject;
        this.f7034e = obj;
        this.f7035f = arrayList;
        this.h = zArr;
        this.f7033c = i10;
    }

    public k0(lh.d dVar, TLObject tLObject, e3[] e3VarArr, c6 c6Var, int i10, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.f7031a = 1;
        this.d = dVar;
        this.f7032b = tLObject;
        this.f7034e = e3VarArr;
        this.f7035f = c6Var;
        this.f7033c = i10;
        this.h = tL_messages_checkChatInvite;
    }

    public k0(ChatObject.Call call, int i10, TLObject tLObject, ChatObject.Call.OnParticipantsLoad onParticipantsLoad, ArrayList arrayList, HashSet hashSet) {
        this.f7031a = 3;
        this.d = call;
        this.f7033c = i10;
        this.f7032b = tLObject;
        this.f7034e = onParticipantsLoad;
        this.f7035f = arrayList;
        this.h = hashSet;
    }

    public k0(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, n2 n2Var, int i10) {
        this.f7031a = 5;
        this.f7032b = mediaDataController;
        this.d = zArr;
        this.f7034e = arrayList;
        this.f7035f = context;
        this.h = n2Var;
        this.f7033c = i10;
    }

    public k0(m9 m9Var, Runnable[] runnableArr, Bitmap bitmap, m50 m50Var, int i10, w5[] w5VarArr) {
        this.f7031a = 9;
        this.f7032b = m9Var;
        this.d = runnableArr;
        this.f7034e = bitmap;
        this.f7035f = m50Var;
        this.f7033c = i10;
        this.h = w5VarArr;
    }

    public k0(cg0 cg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f7031a = 10;
        this.d = cg0Var;
        this.f7034e = numArr;
        this.f7033c = i10;
        this.f7032b = tLObject;
        this.f7035f = arrayList;
        this.h = pollAnswerVoters;
    }

    public k0(js jsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.f7031a = 11;
        this.d = jsVar;
        this.f7034e = fileLocation;
        this.f7035f = inputFile;
        this.f7032b = tLObject;
        this.h = fileLocation2;
        this.f7033c = i10;
    }

    public k0(d70 d70Var, k4 k4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, g1 g1Var) {
        this.f7031a = 6;
        this.d = d70Var;
        this.f7034e = k4Var;
        this.f7035f = tL_error;
        this.f7032b = tLObject;
        this.f7033c = i10;
        this.h = g1Var;
    }

    public k0(z0 z0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, w0 w0Var) {
        this.f7031a = 14;
        this.d = z0Var;
        this.f7034e = str;
        this.f7032b = tLObject;
        this.f7035f = tL_error;
        this.f7033c = i10;
        this.h = w0Var;
    }
}
