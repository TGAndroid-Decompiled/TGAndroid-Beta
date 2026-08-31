package lf;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k7.z5;
import mh.t7;
import oh.b8;
import oh.d8;
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
import org.telegram.messenger.li;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Components.xk;
import org.telegram.ui.c71;
import org.telegram.ui.e1;
import org.telegram.ui.ii0;
import org.telegram.ui.j3;
import org.telegram.ui.j4;
import org.telegram.ui.l9;
import org.telegram.ui.o70;
import org.telegram.ui.os;
import org.telegram.ui.p60;
import org.telegram.ui.sw0;
import org.telegram.ui.web.a1;
import org.telegram.ui.web.x0;
import org.telegram.ui.xk0;
import org.telegram.ui.zi;
import org.telegram.ui.zk0;
public final class j0 implements Runnable {
    public final int f12481a;
    public final Object f12482b;
    public final int f12483c;
    public final Object d;
    public final Object f12484e;
    public final Object f12485f;
    public final Object h;

    public j0(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f12481a = i11;
        this.f12482b = obj;
        this.f12483c = i10;
        this.d = obj2;
        this.f12484e = obj3;
        this.f12485f = obj4;
        this.h = obj5;
    }

    @Override
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.f12481a) {
            case 0:
                TLObject tLObject = (TLObject) this.f12482b;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.f12484e;
                zi ziVar = (zi) this.f12485f;
                f5 f5Var = (f5) this.h;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i10 = this.f12483c;
                    MessagesController.getInstance(i10).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).clientUserId));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && user != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 1000);
                        if (closestPhotoSizeWithSize != null && photoSize2 != null && photoSize2.location != null) {
                            FileLoader.getInstance(i10).getPathToAttach(photoSize2.location, true).renameTo(FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, true));
                            StringBuilder sb = new StringBuilder();
                            sb.append(photoSize2.location.volume_id);
                            sb.append("_");
                            String m9 = android.support.v4.media.a.m(photoSize2.location.local_id, "@50_50", sb);
                            StringBuilder sb2 = new StringBuilder();
                            photoSize = closestPhotoSizeWithSize2;
                            sb2.append(closestPhotoSizeWithSize.location.volume_id);
                            sb2.append("_");
                            ImageLoader.getInstance().replaceImageInCache(m9, android.support.v4.media.a.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForUser(i10, user, 1), false);
                        } else {
                            photoSize = closestPhotoSizeWithSize2;
                        }
                        if (photoSize != null && photoSize3 != null && photoSize3.location != null) {
                            FileLoader.getInstance(i10).getPathToAttach(photoSize3.location, true).renameTo(FileLoader.getInstance(i10).getPathToAttach(photoSize, true));
                        }
                        k0.a(tL_photos_photo.photo, user, false);
                        UserConfig.getInstance(i10).setCurrentUser(user);
                        UserConfig.getInstance(i10).saveConfig(true);
                        ziVar.run();
                        qc.a0(f5Var.getLastFragment()).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new af.b(i10, f5Var, 7)), null).j();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLObject tLObject2 = (TLObject) this.f12482b;
                h3[] h3VarArr = (h3[]) this.f12484e;
                g6 g6Var = (g6) this.f12485f;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                ((qh.d) this.d).setLoading(false);
                if (tLObject2 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject2;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new qc(h3VarArr[0].topBulletinContainer, g6Var).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        return;
                    }
                    final long j10 = tL_starsSubscriptionPricing.amount;
                    final int i11 = this.f12483c;
                    t7.y(i11, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            Long l10 = (Long) obj2;
                            if ("paid".equals((String) obj) && l10.longValue() != 0) {
                                AndroidUtilities.runOnUIThread(new a9(l10, i11, j10, 0));
                            }
                        }
                    });
                    return;
                }
                new qc(h3VarArr[0].topBulletinContainer, g6Var).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                return;
            case 2:
                int i12 = this.f12483c;
                d8.a((d8) this.d, (TLObject) this.f12482b, this.f12484e, (ArrayList) this.f12485f, (boolean[]) this.h, i12);
                return;
            case 3:
                ((ChatObject.Call) this.d).lambda$loadUnknownParticipants$5(this.f12483c, (TLObject) this.f12482b, (ChatObject.Call.OnParticipantsLoad) this.f12484e, (ArrayList) this.f12485f, (HashSet) this.h);
                return;
            case 4:
                ((LocaleController) this.f12482b).lambda$saveRemoteLocaleStrings$10(this.f12483c, (LocaleController.LocaleInfo) this.d, (TLRPC.TL_langPackDifference) this.f12484e, (HashMap) this.f12485f, (Runnable) this.h);
                return;
            case 5:
                ((MediaDataController) this.f12482b).lambda$removeMultipleStickerSets$111((boolean[]) this.d, (ArrayList) this.f12484e, (Context) this.f12485f, (p2) this.h, this.f12483c);
                return;
            case 6:
                o70 o70Var = (o70) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f12485f;
                TLObject tLObject3 = (TLObject) this.f12482b;
                e1 e1Var = (e1) this.h;
                o70Var.f39614r = false;
                if (!((j4) this.f12484e).f38009e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            int i13 = this.f12483c;
                            MessagesController.getInstance(i13).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i13).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            o70Var.f39613n = chat;
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
            case 7:
                TLObject tLObject4 = (TLObject) this.f12482b;
                d2 d2Var = (d2) this.d;
                Context context = (Context) this.f12484e;
                g6 g6Var2 = (g6) this.f12485f;
                p60 p60Var = (p60) this.h;
                boolean z4 = tLObject4 instanceof TLRPC.Updates;
                int i14 = this.f12483c;
                int i15 = 0;
                if (z4) {
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
                    d2Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f20860id = groupCall.f20853id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        l9.o0(context, i14, tL_inputGroupCall, groupCall.invite_link, g6Var2, true, true);
                        AndroidUtilities.runOnUIThread(p60Var);
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
                    tL_inputGroupCall2.f20860id = groupCall2.f20853id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i14).sendRequest(exportgroupcallinvite, new li(d2Var, context, i14, exportgroupcallinvite, g6Var2, p60Var));
                    return;
                } else {
                    d2Var.dismiss();
                    AndroidUtilities.runOnUIThread(p60Var);
                    return;
                }
            case 8:
                new c71((Context) this.f12482b, (TLRPC.Chat) this.d, (TLRPC.User) this.f12484e, new af.b(this.f12483c, (MessagesStorage.BooleanCallback) this.f12485f, 25), (g6) this.h).show();
                return;
            case 9:
                o9.a((o9) this.f12482b, (Runnable[]) this.d, (Bitmap) this.f12484e, (b60) this.f12485f, this.f12483c, (z5[]) this.h);
                return;
            case 10:
                xg0.m((xg0) this.d, (Integer[]) this.f12484e, this.f12483c, (TLObject) this.f12482b, (ArrayList) this.f12485f, (TLRPC.PollAnswerVoters) this.h);
                return;
            case 11:
                os.Y((os) this.d, (TLRPC.FileLocation) this.f12484e, (TLRPC.InputFile) this.f12485f, (TLObject) this.f12482b, (TLRPC.FileLocation) this.h, this.f12483c);
                return;
            case 12:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f12482b;
                String[] strArr = (String[]) this.d;
                Context context2 = (Context) this.f12484e;
                xk0 xk0Var = (xk0) this.f12485f;
                p2 p2Var = (p2) this.h;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    zk0.c(context2, this.f12483c, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new xk(20, strArr, xk0Var), true, new ag.f(23), p2Var.getResourceProvider());
                    return;
                }
                xk0Var.run();
                return;
            case 13:
                p2 p2Var2 = (p2) this.d;
                List<Purchase> list = (List) this.f12484e;
                p2.e eVar = (p2.e) this.f12485f;
                sw0 sw0Var = (sw0) this.h;
                if (((p2.h) this.f12482b).f44145a == 0) {
                    ii0 ii0Var = new ii0(1, p2Var2);
                    int i16 = this.f12483c;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i16).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f2539a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (eVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i16).sendRequest(tL_payments_assignPlayMarketTransaction, new b8(i16, ii0Var, p2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener("telegram_premium", new j3(ii0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (eVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i16).sendRequest(tL_payments_canPurchaseStore, new li(p2Var2, tL_inputStorePaymentPremiumSubscription2, sw0Var, eVar, i16, tL_payments_canPurchaseStore, 5));
                    return;
                }
                return;
            default:
                a1 a1Var = (a1) this.d;
                String str = (String) this.f12484e;
                TLObject tLObject5 = (TLObject) this.f12482b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f12485f;
                int i17 = this.f12483c;
                x0 x0Var = (x0) this.h;
                a1Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", str);
                    if (tLObject5 instanceof TLRPC.TL_dataJSON) {
                        jSONObject.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject5).data).nextValue());
                    } else if (tL_error2 != null) {
                        jSONObject.put("error", tL_error2.text);
                    }
                    a1.u(i17, x0Var, "custom_method_invoked", jSONObject);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    a1Var.S(null);
                    return;
                }
        }
    }

    public j0(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.f12481a = i11;
        this.f12482b = obj;
        this.d = obj2;
        this.f12484e = obj3;
        this.f12483c = i10;
        this.f12485f = obj4;
        this.h = obj5;
    }

    public j0(d8 d8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.f12481a = 2;
        this.d = d8Var;
        this.f12482b = tLObject;
        this.f12484e = obj;
        this.f12485f = arrayList;
        this.h = zArr;
        this.f12483c = i10;
    }

    public j0(ChatObject.Call call, int i10, TLObject tLObject, ChatObject.Call.OnParticipantsLoad onParticipantsLoad, ArrayList arrayList, HashSet hashSet) {
        this.f12481a = 3;
        this.d = call;
        this.f12483c = i10;
        this.f12482b = tLObject;
        this.f12484e = onParticipantsLoad;
        this.f12485f = arrayList;
        this.h = hashSet;
    }

    public j0(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, p2 p2Var, int i10) {
        this.f12481a = 5;
        this.f12482b = mediaDataController;
        this.d = zArr;
        this.f12484e = arrayList;
        this.f12485f = context;
        this.h = p2Var;
        this.f12483c = i10;
    }

    public j0(o9 o9Var, Runnable[] runnableArr, Bitmap bitmap, b60 b60Var, int i10, z5[] z5VarArr) {
        this.f12481a = 9;
        this.f12482b = o9Var;
        this.d = runnableArr;
        this.f12484e = bitmap;
        this.f12485f = b60Var;
        this.f12483c = i10;
        this.h = z5VarArr;
    }

    public j0(xg0 xg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f12481a = 10;
        this.d = xg0Var;
        this.f12484e = numArr;
        this.f12483c = i10;
        this.f12482b = tLObject;
        this.f12485f = arrayList;
        this.h = pollAnswerVoters;
    }

    public j0(os osVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.f12481a = 11;
        this.d = osVar;
        this.f12484e = fileLocation;
        this.f12485f = inputFile;
        this.f12482b = tLObject;
        this.h = fileLocation2;
        this.f12483c = i10;
    }

    public j0(o70 o70Var, j4 j4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, e1 e1Var) {
        this.f12481a = 6;
        this.d = o70Var;
        this.f12484e = j4Var;
        this.f12485f = tL_error;
        this.f12482b = tLObject;
        this.f12483c = i10;
        this.h = e1Var;
    }

    public j0(a1 a1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, x0 x0Var) {
        this.f12481a = 14;
        this.d = a1Var;
        this.f12484e = str;
        this.f12482b = tLObject;
        this.f12485f = tL_error;
        this.f12483c = i10;
        this.h = x0Var;
    }

    public j0(qh.d dVar, TLObject tLObject, h3[] h3VarArr, g6 g6Var, int i10, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.f12481a = 1;
        this.d = dVar;
        this.f12482b = tLObject;
        this.f12484e = h3VarArr;
        this.f12485f = g6Var;
        this.f12483c = i10;
        this.h = tL_messages_checkChatInvite;
    }
}
