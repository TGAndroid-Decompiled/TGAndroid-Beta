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
import k7.y5;
import lh.t7;
import nh.b8;
import nh.d8;
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
import org.telegram.messenger.ki;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.vk;
import org.telegram.ui.Components.z50;
import org.telegram.ui.b71;
import org.telegram.ui.e1;
import org.telegram.ui.hi0;
import org.telegram.ui.j3;
import org.telegram.ui.j4;
import org.telegram.ui.l9;
import org.telegram.ui.n70;
import org.telegram.ui.ns;
import org.telegram.ui.o60;
import org.telegram.ui.qw0;
import org.telegram.ui.vk0;
import org.telegram.ui.web.a1;
import org.telegram.ui.web.w0;
import org.telegram.ui.xk0;
import org.telegram.ui.zi;
public final class j0 implements Runnable {
    public final int f12032a;
    public final Object f12033b;
    public final int f12034c;
    public final Object d;
    public final Object e;
    public final Object f12035f;
    public final Object h;

    public j0(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f12032a = i11;
        this.f12033b = obj;
        this.f12034c = i10;
        this.d = obj2;
        this.e = obj3;
        this.f12035f = obj4;
        this.h = obj5;
    }

    @Override
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.f12032a) {
            case 0:
                TLObject tLObject = (TLObject) this.f12033b;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.e;
                zi ziVar = (zi) this.f12035f;
                e5 e5Var = (e5) this.h;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i10 = this.f12034c;
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
                        qc.a0(e5Var.getLastFragment()).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new af.b(i10, e5Var, 7)), null).j();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLObject tLObject2 = (TLObject) this.f12033b;
                g3[] g3VarArr = (g3[]) this.e;
                f6 f6Var = (f6) this.f12035f;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                ((ph.d) this.d).setLoading(false);
                if (tLObject2 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject2;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new qc(g3VarArr[0].topBulletinContainer, f6Var).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        return;
                    }
                    final long j10 = tL_starsSubscriptionPricing.amount;
                    final int i11 = this.f12034c;
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
                new qc(g3VarArr[0].topBulletinContainer, f6Var).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                return;
            case 2:
                int i12 = this.f12034c;
                d8.a((d8) this.d, (TLObject) this.f12033b, this.e, (ArrayList) this.f12035f, (boolean[]) this.h, i12);
                return;
            case 3:
                ((ChatObject.Call) this.d).lambda$loadUnknownParticipants$5(this.f12034c, (TLObject) this.f12033b, (ChatObject.Call.OnParticipantsLoad) this.e, (ArrayList) this.f12035f, (HashSet) this.h);
                return;
            case 4:
                ((LocaleController) this.f12033b).lambda$saveRemoteLocaleStrings$10(this.f12034c, (LocaleController.LocaleInfo) this.d, (TLRPC.TL_langPackDifference) this.e, (HashMap) this.f12035f, (Runnable) this.h);
                return;
            case 5:
                ((MediaDataController) this.f12033b).lambda$removeMultipleStickerSets$111((boolean[]) this.d, (ArrayList) this.e, (Context) this.f12035f, (p2) this.h, this.f12034c);
                return;
            case 6:
                n70 n70Var = (n70) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f12035f;
                TLObject tLObject3 = (TLObject) this.f12033b;
                e1 e1Var = (e1) this.h;
                n70Var.f36480r = false;
                if (!((j4) this.e).e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            int i13 = this.f12034c;
                            MessagesController.getInstance(i13).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i13).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            n70Var.f36479n = chat;
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
                TLObject tLObject4 = (TLObject) this.f12033b;
                d2 d2Var = (d2) this.d;
                Context context = (Context) this.e;
                f6 f6Var2 = (f6) this.f12035f;
                o60 o60Var = (o60) this.h;
                boolean z4 = tLObject4 instanceof TLRPC.Updates;
                int i14 = this.f12034c;
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
                        tL_inputGroupCall.f19201id = groupCall.f19194id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        l9.o0(context, i14, tL_inputGroupCall, groupCall.invite_link, f6Var2, true, true);
                        AndroidUtilities.runOnUIThread(o60Var);
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
                    tL_inputGroupCall2.f19201id = groupCall2.f19194id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i14).sendRequest(exportgroupcallinvite, new ki(d2Var, context, i14, exportgroupcallinvite, f6Var2, o60Var));
                    return;
                } else {
                    d2Var.dismiss();
                    AndroidUtilities.runOnUIThread(o60Var);
                    return;
                }
            case 8:
                new b71((Context) this.f12033b, (TLRPC.Chat) this.d, (TLRPC.User) this.e, new af.b(this.f12034c, (MessagesStorage.BooleanCallback) this.f12035f, 25), (f6) this.h).show();
                return;
            case 9:
                o9.a((o9) this.f12033b, (Runnable[]) this.d, (Bitmap) this.e, (z50) this.f12035f, this.f12034c, (y5[]) this.h);
                return;
            case 10:
                vg0.m((vg0) this.d, (Integer[]) this.e, this.f12034c, (TLObject) this.f12033b, (ArrayList) this.f12035f, (TLRPC.PollAnswerVoters) this.h);
                return;
            case 11:
                ns.Y((ns) this.d, (TLRPC.FileLocation) this.e, (TLRPC.InputFile) this.f12035f, (TLObject) this.f12033b, (TLRPC.FileLocation) this.h, this.f12034c);
                return;
            case 12:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f12033b;
                String[] strArr = (String[]) this.d;
                Context context2 = (Context) this.e;
                vk0 vk0Var = (vk0) this.f12035f;
                p2 p2Var = (p2) this.h;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    xk0.c(context2, this.f12034c, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new vk(20, strArr, vk0Var), true, new cg.n0(21), p2Var.getResourceProvider());
                    return;
                }
                vk0Var.run();
                return;
            case 13:
                p2 p2Var2 = (p2) this.d;
                List<Purchase> list = (List) this.e;
                p2.e eVar = (p2.e) this.f12035f;
                qw0 qw0Var = (qw0) this.h;
                if (((p2.h) this.f12033b).f40993a == 0) {
                    hi0 hi0Var = new hi0(1, p2Var2);
                    int i16 = this.f12034c;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i16).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f2620a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (eVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i16).sendRequest(tL_payments_assignPlayMarketTransaction, new b8(i16, hi0Var, p2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener("telegram_premium", new j3(hi0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (eVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i16).sendRequest(tL_payments_canPurchaseStore, new ki(p2Var2, tL_inputStorePaymentPremiumSubscription2, qw0Var, eVar, i16, tL_payments_canPurchaseStore, 5));
                    return;
                }
                return;
            default:
                a1 a1Var = (a1) this.d;
                String str = (String) this.e;
                TLObject tLObject5 = (TLObject) this.f12033b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f12035f;
                int i17 = this.f12034c;
                w0 w0Var = (w0) this.h;
                a1Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", str);
                    if (tLObject5 instanceof TLRPC.TL_dataJSON) {
                        jSONObject.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject5).data).nextValue());
                    } else if (tL_error2 != null) {
                        jSONObject.put("error", tL_error2.text);
                    }
                    a1.u(i17, w0Var, "custom_method_invoked", jSONObject);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    a1Var.S(null);
                    return;
                }
        }
    }

    public j0(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.f12032a = i11;
        this.f12033b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f12034c = i10;
        this.f12035f = obj4;
        this.h = obj5;
    }

    public j0(d8 d8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.f12032a = 2;
        this.d = d8Var;
        this.f12033b = tLObject;
        this.e = obj;
        this.f12035f = arrayList;
        this.h = zArr;
        this.f12034c = i10;
    }

    public j0(ChatObject.Call call, int i10, TLObject tLObject, ChatObject.Call.OnParticipantsLoad onParticipantsLoad, ArrayList arrayList, HashSet hashSet) {
        this.f12032a = 3;
        this.d = call;
        this.f12034c = i10;
        this.f12033b = tLObject;
        this.e = onParticipantsLoad;
        this.f12035f = arrayList;
        this.h = hashSet;
    }

    public j0(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, p2 p2Var, int i10) {
        this.f12032a = 5;
        this.f12033b = mediaDataController;
        this.d = zArr;
        this.e = arrayList;
        this.f12035f = context;
        this.h = p2Var;
        this.f12034c = i10;
    }

    public j0(o9 o9Var, Runnable[] runnableArr, Bitmap bitmap, z50 z50Var, int i10, y5[] y5VarArr) {
        this.f12032a = 9;
        this.f12033b = o9Var;
        this.d = runnableArr;
        this.e = bitmap;
        this.f12035f = z50Var;
        this.f12034c = i10;
        this.h = y5VarArr;
    }

    public j0(vg0 vg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f12032a = 10;
        this.d = vg0Var;
        this.e = numArr;
        this.f12034c = i10;
        this.f12033b = tLObject;
        this.f12035f = arrayList;
        this.h = pollAnswerVoters;
    }

    public j0(ns nsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.f12032a = 11;
        this.d = nsVar;
        this.e = fileLocation;
        this.f12035f = inputFile;
        this.f12033b = tLObject;
        this.h = fileLocation2;
        this.f12034c = i10;
    }

    public j0(n70 n70Var, j4 j4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, e1 e1Var) {
        this.f12032a = 6;
        this.d = n70Var;
        this.e = j4Var;
        this.f12035f = tL_error;
        this.f12033b = tLObject;
        this.f12034c = i10;
        this.h = e1Var;
    }

    public j0(a1 a1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, w0 w0Var) {
        this.f12032a = 14;
        this.d = a1Var;
        this.e = str;
        this.f12033b = tLObject;
        this.f12035f = tL_error;
        this.f12034c = i10;
        this.h = w0Var;
    }

    public j0(ph.d dVar, TLObject tLObject, g3[] g3VarArr, f6 f6Var, int i10, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.f12032a = 1;
        this.d = dVar;
        this.f12033b = tLObject;
        this.e = g3VarArr;
        this.f12035f = f6Var;
        this.f12034c = i10;
        this.h = tL_messages_checkChatInvite;
    }
}
