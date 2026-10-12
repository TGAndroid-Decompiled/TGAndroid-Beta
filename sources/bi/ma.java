package bi;

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
import org.telegram.messenger.ni;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.zc;
import org.telegram.ui.b81;
import org.telegram.ui.gj;
import org.telegram.ui.li1;
import org.telegram.ui.mt;
import org.telegram.ui.ol0;
import org.telegram.ui.rl0;
import org.telegram.ui.rx0;
import org.telegram.ui.ul0;
import org.telegram.ui.wi0;
import org.telegram.ui.ws;
import org.telegram.ui.z60;
import org.telegram.ui.z70;
public final class ma implements Runnable {
    public final int f3346a;
    public final int f3347b;
    public final Object f3348c;
    public final Object d;
    public final Object e;
    public final Object f3349f;
    public final Object h;

    public ma(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f3346a = i11;
        this.d = tLObject;
        this.f3347b = i10;
        this.f3348c = obj;
        this.e = obj2;
        this.f3349f = obj3;
        this.h = obj4;
    }

    @Override
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.f3346a) {
            case 0:
                na.a((na) this.f3348c, (TLObject) this.d, this.e, (ArrayList) this.f3349f, (boolean[]) this.h, this.f3347b);
                return;
            case 1:
                m4.j1 j1Var = (m4.j1) this.f3348c;
                m4.w wVar = (m4.w) this.d;
                m4.p1 p1Var = (m4.p1) this.e;
                String str = p1Var.f15569b;
                m4.f0 f0Var = (m4.f0) this.f3349f;
                int i10 = this.f3347b;
                m4.m mVar = (m4.m) this.h;
                qi.e eVar = j1Var.f15475b;
                if (eVar.t(wVar)) {
                    try {
                        m4.e d = m4.e.d(p1Var);
                        Object obj = d.f15418g;
                        int i11 = d.f15415b;
                        if (!d.b()) {
                            e2.a.l("MediaSessionStub", "Can't execute predefined custom command: " + str);
                            m4.j1.P0(f0Var, wVar, i10, new m4.t1(-6));
                            return;
                        }
                        m4.p1 p1Var2 = d.f15414a;
                        boolean z10 = false;
                        if (p1Var2 != null) {
                            if (p1Var2.f15568a == 40010) {
                                z10 = true;
                            }
                            v7.u6.p(z10);
                            j1Var.H0(mVar, i10, null, 40010, new m4.a1(new m4.d1(d), 1));
                            return;
                        }
                        m4.n1 n1Var = f0Var.f15440t;
                        if (i11 == 1) {
                            if (obj == null) {
                                if (!n1Var.t()) {
                                    z10 = true;
                                }
                            } else {
                                z10 = ((Boolean) obj).booleanValue();
                            }
                        }
                        if (z10) {
                            j1Var.M0(wVar, i10);
                        } else if (i11 == 31) {
                            obj.getClass();
                            j1Var.O0(wVar, i10, 31, new m4.a1(new m4.z0(0, new h(2, (b2.p0) obj, true), new m4.w0(8)), 1));
                        } else {
                            j1Var.O0(wVar, i10, i11, m4.j1.Q0(new m4.d1(d)));
                        }
                        eVar.j(wVar);
                        return;
                    } catch (RuntimeException e) {
                        e2.a.m("MediaSessionStub", "Failed to convert predefined custom command: " + str, e);
                        m4.j1.P0(f0Var, wVar, i10, new m4.t1(-3));
                        return;
                    }
                }
                return;
            case 2:
                ((ChatObject.Call) this.f3348c).lambda$loadUnknownParticipants$5(this.f3347b, (TLObject) this.d, (ChatObject.Call.OnParticipantsLoad) this.e, (ArrayList) this.f3349f, (HashSet) this.h);
                return;
            case 3:
                ((LocaleController) this.f3348c).lambda$saveRemoteLocaleStrings$10(this.f3347b, (LocaleController.LocaleInfo) this.d, (TLRPC.TL_langPackDifference) this.e, (HashMap) this.f3349f, (Runnable) this.h);
                return;
            case 4:
                ((MediaDataController) this.f3348c).lambda$removeMultipleStickerSets$111((boolean[]) this.h, (ArrayList) this.f3349f, (Context) this.d, (org.telegram.ui.ActionBar.m2) this.e, this.f3347b);
                return;
            case 5:
                z70 z70Var = (z70) this.f3348c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f3349f;
                TLObject tLObject = (TLObject) this.d;
                org.telegram.ui.f1 f1Var = (org.telegram.ui.f1) this.h;
                z70Var.f42505r = false;
                if (!((org.telegram.ui.i4) this.e).e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            int i12 = this.f3347b;
                            MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            z70Var.f42504n = chat;
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
            case 6:
                TLObject tLObject2 = (TLObject) this.d;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f3348c;
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f3349f;
                z60 z60Var = (z60) this.h;
                boolean z11 = tLObject2 instanceof TLRPC.Updates;
                int i13 = this.f3347b;
                int i14 = 0;
                if (z11) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    MessagesController.getInstance(i13).putUsers(updates.users, false);
                    MessagesController.getInstance(i13).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i14 < size) {
                        Object obj2 = findUpdatesAndRemove.get(i14);
                        i14++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj2).call;
                    }
                    a2Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f19233id = groupCall.f19226id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.n9.o0(context, i13, tL_inputGroupCall, groupCall.invite_link, c6Var, true, true);
                        AndroidUtilities.runOnUIThread(z60Var);
                        return;
                    }
                    return;
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    MessagesController.getInstance(i13).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i13).putChats(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f19233id = groupCall2.f19226id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i13).sendRequest(exportgroupcallinvite, new ni(a2Var, context, i13, exportgroupcallinvite, c6Var, z60Var));
                    return;
                } else {
                    a2Var.dismiss();
                    AndroidUtilities.runOnUIThread(z60Var);
                    return;
                }
            case 7:
                new b81((Context) this.f3348c, (TLRPC.Chat) this.d, (TLRPC.User) this.e, new ah.g(this.f3347b, (MessagesStorage.BooleanCallback) this.f3349f, 28), (org.telegram.ui.ActionBar.c6) this.h).show();
                return;
            case 8:
                org.telegram.ui.Components.y9.a((org.telegram.ui.Components.y9) this.f3348c, (Runnable[]) this.d, (Bitmap) this.e, (w60) this.f3349f, this.f3347b, (w7.x5[]) this.h);
                return;
            case 9:
                qh0.n((qh0) this.f3348c, (Integer[]) this.e, this.f3347b, (TLObject) this.d, (ArrayList) this.f3349f, (TLRPC.PollAnswerVoters) this.h);
                return;
            case 10:
                ws.Y((ws) this.f3348c, (TLRPC.FileLocation) this.e, (TLRPC.InputFile) this.f3349f, (TLObject) this.d, (TLRPC.FileLocation) this.h, this.f3347b);
                return;
            case 11:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f3348c;
                String[] strArr = (String[]) this.d;
                Context context2 = (Context) this.e;
                ol0 ol0Var = (ol0) this.f3349f;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.h;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    rl0.c(context2, this.f3347b, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new mt(10, strArr, ol0Var), true, new ah.j(19), m2Var.getResourceProvider());
                    return;
                }
                ol0Var.run();
                return;
            case 12:
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.d;
                List<Purchase> list = (List) this.e;
                c5.g gVar = (c5.g) this.f3349f;
                rx0 rx0Var = (rx0) this.h;
                if (((c5.i) this.f3348c).f4381a == 0) {
                    wi0 wi0Var = new wi0(1, m2Var2);
                    int i15 = this.f3347b;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i15).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f4810a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (gVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i15).sendRequest(tL_payments_assignPlayMarketTransaction, new ja(i15, wi0Var, m2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener("telegram_premium", new org.telegram.ui.j3(wi0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (gVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i15).sendRequest(tL_payments_canPurchaseStore, new ni(i15, 5, m2Var2, rx0Var, gVar, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    return;
                }
                return;
            case 13:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f3348c;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.e;
                n9 n9Var = (n9) this.f3349f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                boolean z12 = ((TLObject) this.d) instanceof TLRPC.TL_boolTrue;
                int i16 = this.f3347b;
                if (z12) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.b1.w(i16, y0Var, n9Var, "write_access_requested", jSONObject);
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
                    alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new org.telegram.ui.web.c0(0, b1Var, strArr2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new ul0(16));
                    b1Var.X(3, alertDialog$Builder.f19548a, new org.telegram.ui.web.w(strArr2, i16, y0Var, n9Var, 1));
                    return;
                }
            case 14:
                TLObject tLObject3 = (TLObject) this.d;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.f3348c;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.e;
                gj gjVar = (gj) this.f3349f;
                org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) this.h;
                if (tLObject3 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject3;
                    int i17 = this.f3347b;
                    MessagesController.getInstance(i17).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(i17).getUser(Long.valueOf(UserConfig.getInstance(i17).clientUserId));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && user != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 1000);
                        if (closestPhotoSizeWithSize != null && photoSize2 != null && photoSize2.location != null) {
                            FileLoader.getInstance(i17).getPathToAttach(photoSize2.location, true).renameTo(FileLoader.getInstance(i17).getPathToAttach(closestPhotoSizeWithSize, true));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(photoSize2.location.volume_id);
                            sb2.append("_");
                            String n10 = a1.g.n(photoSize2.location.local_id, "@50_50", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            photoSize = closestPhotoSizeWithSize2;
                            sb3.append(closestPhotoSizeWithSize.location.volume_id);
                            sb3.append("_");
                            ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(i17, user, 1), false);
                        } else {
                            photoSize = closestPhotoSizeWithSize2;
                        }
                        if (photoSize != null && photoSize3 != null && photoSize3.location != null) {
                            FileLoader.getInstance(i17).getPathToAttach(photoSize3.location, true).renameTo(FileLoader.getInstance(i17).getPathToAttach(photoSize, true));
                        }
                        zf.e0.a(tL_photos_photo.photo, user, false);
                        UserConfig.getInstance(i17).setCurrentUser(user);
                        UserConfig.getInstance(i17).saveConfig(true);
                        gjVar.run();
                        zc.a0(b5Var.getLastFragment()).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new li1(i17, b5Var, 11)), null).j();
                        return;
                    }
                    return;
                }
                return;
            default:
                TLObject tLObject4 = (TLObject) this.d;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.e;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.f3349f;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                ((di.d) this.f3348c).setLoading(false);
                if (tLObject4 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject4;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new zc(e3VarArr[0].topBulletinContainer, c6Var2).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        return;
                    }
                    final long j10 = tL_starsSubscriptionPricing.amount;
                    final int i18 = this.f3347b;
                    zh.n5.y(i18, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj3, Object obj4) {
                            Long l4 = (Long) obj4;
                            if ("paid".equals((String) obj3) && l4.longValue() != 0) {
                                AndroidUtilities.runOnUIThread(new bi.m7(l4, i18, j10, 8));
                            }
                        }
                    });
                    return;
                }
                new zc(e3VarArr[0].topBulletinContainer, c6Var2).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                return;
        }
    }

    public ma(na naVar, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        this.f3346a = 0;
        this.f3348c = naVar;
        this.d = tLObject;
        this.e = obj;
        this.f3349f = arrayList;
        this.h = zArr;
        this.f3347b = i10;
    }

    public ma(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f3346a = i11;
        this.f3348c = obj;
        this.f3347b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f3349f = obj4;
        this.h = obj5;
    }

    public ma(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.f3346a = i11;
        this.f3348c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f3347b = i10;
        this.f3349f = obj4;
        this.h = obj5;
    }

    public ma(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5, int i11) {
        this.f3346a = i11;
        this.f3348c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f3349f = obj4;
        this.f3347b = i10;
        this.h = obj5;
    }

    public ma(MediaDataController mediaDataController, boolean[] zArr, ArrayList arrayList, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f3346a = 4;
        this.f3348c = mediaDataController;
        this.h = zArr;
        this.f3349f = arrayList;
        this.d = context;
        this.e = m2Var;
        this.f3347b = i10;
    }

    public ma(qh0 qh0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f3346a = 9;
        this.f3348c = qh0Var;
        this.e = numArr;
        this.f3347b = i10;
        this.d = tLObject;
        this.f3349f = arrayList;
        this.h = pollAnswerVoters;
    }

    public ma(ws wsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.f3346a = 10;
        this.f3348c = wsVar;
        this.e = fileLocation;
        this.f3349f = inputFile;
        this.d = tLObject;
        this.h = fileLocation2;
        this.f3347b = i10;
    }

    public ma(z70 z70Var, org.telegram.ui.i4 i4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.f1 f1Var) {
        this.f3346a = 5;
        this.f3348c = z70Var;
        this.e = i4Var;
        this.f3349f = tL_error;
        this.d = tLObject;
        this.f3347b = i10;
        this.h = f1Var;
    }

    public ma(org.telegram.ui.web.b1 b1Var, TLObject tLObject, int i10, org.telegram.ui.web.y0 y0Var, n9 n9Var, TLRPC.TL_error tL_error) {
        this.f3346a = 13;
        this.f3348c = b1Var;
        this.d = tLObject;
        this.f3347b = i10;
        this.e = y0Var;
        this.f3349f = n9Var;
        this.h = tL_error;
    }
}
