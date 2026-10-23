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
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.u60;
import org.telegram.ui.f60;
import org.telegram.ui.f70;
import org.telegram.ui.fi0;
import org.telegram.ui.hs;
import org.telegram.ui.l61;
import org.telegram.ui.ti;
import org.telegram.ui.tw0;
import org.telegram.ui.uk0;
import org.telegram.ui.wg1;
import org.telegram.ui.xk0;
public final class wb implements Runnable {
    public final int f2392a;
    public final Object f2393b;
    public final int f2394c;
    public final Object d;
    public final Object e;
    public final Object f2395f;
    public final Object h;

    public wb(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.f2392a = i11;
        this.f2393b = tLObject;
        this.f2394c = i10;
        this.d = obj;
        this.e = obj2;
        this.f2395f = obj3;
        this.h = obj4;
    }

    @Override
    public final void run() {
        TLRPC.PhotoSize photoSize;
        switch (this.f2392a) {
            case 0:
                TLObject tLObject = (TLObject) this.f2393b;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.e;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f2395f;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                ((ei.d) this.d).setLoading(false);
                if (tLObject instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new org.telegram.ui.Components.xc(h3VarArr[0].topBulletinContainer, g6Var).t(LocaleController.getString(R.string.UnknownError), null).k(false);
                        return;
                    }
                    final long j10 = tL_starsSubscriptionPricing.amount;
                    final int i10 = this.f2394c;
                    ha.y(i10, false).j0(tL_messages_checkChatInvite.hash, chatInvite, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            Long l4 = (Long) obj2;
                            if ("paid".equals((String) obj) && l4.longValue() != 0) {
                                AndroidUtilities.runOnUIThread(new ac(l4, i10, j10, 0));
                            }
                        }
                    });
                    return;
                }
                new org.telegram.ui.Components.xc(h3VarArr[0].topBulletinContainer, g6Var).t(LocaleController.getString(R.string.LinkHashExpired), null).k(false);
                return;
            case 1:
                ci.u8.a((ci.u8) this.d, (TLObject) this.f2393b, this.e, (ArrayList) this.f2395f, (boolean[]) this.h, this.f2394c);
                return;
            case 2:
                m4.i1 i1Var = (m4.i1) this.d;
                m4.v vVar = (m4.v) this.f2393b;
                m4.o1 o1Var = (m4.o1) this.e;
                String str = o1Var.f16720b;
                m4.f0 f0Var = (m4.f0) this.f2395f;
                int i11 = this.f2394c;
                m4.l lVar = (m4.l) this.h;
                qi.e eVar = i1Var.f16627b;
                if (eVar.w(vVar)) {
                    try {
                        m4.d d = m4.d.d(o1Var);
                        Object obj = d.f16571g;
                        int i12 = d.f16568b;
                        if (!d.b()) {
                            e2.a.l("MediaSessionStub", "Can't execute predefined custom command: " + str);
                            m4.i1.P0(f0Var, vVar, i11, new m4.s1(-6));
                            return;
                        }
                        m4.o1 o1Var2 = d.f16567a;
                        boolean z10 = false;
                        if (o1Var2 != null) {
                            if (o1Var2.f16719a == 40010) {
                                z10 = true;
                            }
                            v7.u6.p(z10);
                            i1Var.H0(lVar, i11, null, 40010, new m4.z0(new m4.c1(d), 1));
                            return;
                        }
                        m4.m1 m1Var = f0Var.f16597t;
                        if (i12 == 1) {
                            if (obj == null) {
                                if (!m1Var.t()) {
                                    z10 = true;
                                }
                            } else {
                                z10 = ((Boolean) obj).booleanValue();
                            }
                        }
                        if (z10) {
                            i1Var.M0(vVar, i11);
                        } else if (i12 == 31) {
                            obj.getClass();
                            i1Var.O0(vVar, i11, 31, new m4.z0(new m4.w0(1, new ci.f(2, (b2.o0) obj, true), new m4.v0(12)), 1));
                        } else {
                            i1Var.O0(vVar, i11, i12, m4.i1.Q0(new m4.c1(d)));
                        }
                        eVar.m(vVar);
                        return;
                    } catch (RuntimeException e) {
                        e2.a.m("MediaSessionStub", "Failed to convert predefined custom command: " + str, e);
                        m4.i1.P0(f0Var, vVar, i11, new m4.s1(-3));
                        return;
                    }
                }
                return;
            case 3:
                ((ChatObject.Call) this.d).lambda$loadUnknownParticipants$5(this.f2394c, (TLObject) this.f2393b, (ChatObject.Call.OnParticipantsLoad) this.e, (ArrayList) this.f2395f, (HashSet) this.h);
                return;
            case 4:
                ((LocaleController) this.d).lambda$saveRemoteLocaleStrings$10(this.f2394c, (LocaleController.LocaleInfo) this.f2393b, (TLRPC.TL_langPackDifference) this.e, (HashMap) this.f2395f, (Runnable) this.h);
                return;
            case 5:
                ((MediaDataController) this.d).lambda$removeMultipleStickerSets$111((boolean[]) this.f2393b, (ArrayList) this.e, (Context) this.f2395f, (org.telegram.ui.ActionBar.o2) this.h, this.f2394c);
                return;
            case 6:
                f70 f70Var = (f70) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f2395f;
                TLObject tLObject2 = (TLObject) this.f2393b;
                org.telegram.ui.e1 e1Var = (org.telegram.ui.e1) this.h;
                f70Var.f37234r = false;
                if (!((org.telegram.ui.i4) this.e).e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                        if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                            int i13 = this.f2394c;
                            MessagesController.getInstance(i13).putUsers(tL_contacts_resolvedPeer.users, false);
                            MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                            MessagesStorage.getInstance(i13).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            f70Var.f37233n = chat;
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
                TLObject tLObject3 = (TLObject) this.f2393b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.d;
                Context context = (Context) this.e;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) this.f2395f;
                f60 f60Var = (f60) this.h;
                boolean z11 = tLObject3 instanceof TLRPC.Updates;
                int i14 = this.f2394c;
                int i15 = 0;
                if (z11) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    MessagesController.getInstance(i14).putUsers(updates.users, false);
                    MessagesController.getInstance(i14).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i15 < size) {
                        Object obj2 = findUpdatesAndRemove.get(i15);
                        i15++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj2).call;
                    }
                    c2Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f20360id = groupCall.f20353id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.m9.n0(context, i14, tL_inputGroupCall, groupCall.invite_link, g6Var2, true, true);
                        AndroidUtilities.runOnUIThread(f60Var);
                        return;
                    }
                    return;
                } else if (tLObject3 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject3;
                    MessagesController.getInstance(i14).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i14).putChats(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f20360id = groupCall2.f20353id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i14).sendRequest(exportgroupcallinvite, new ii(c2Var, context, i14, exportgroupcallinvite, g6Var2, f60Var));
                    return;
                } else {
                    c2Var.dismiss();
                    AndroidUtilities.runOnUIThread(f60Var);
                    return;
                }
            case 8:
                new l61((Context) this.d, (TLRPC.Chat) this.f2393b, (TLRPC.User) this.e, new org.telegram.ui.Components.d2(this.f2394c, (MessagesStorage.BooleanCallback) this.h, 0), (org.telegram.ui.ActionBar.g6) this.f2395f).show();
                return;
            case 9:
                org.telegram.ui.Components.v9.a((org.telegram.ui.Components.v9) this.d, (Runnable[]) this.f2393b, (Bitmap) this.e, (u60) this.f2395f, this.f2394c, (w7.w5[]) this.h);
                return;
            case 10:
                oh0.m((oh0) this.d, (Integer[]) this.e, this.f2394c, (TLObject) this.f2393b, (ArrayList) this.f2395f, (TLRPC.PollAnswerVoters) this.h);
                return;
            case 11:
                hs.X((hs) this.d, (TLRPC.FileLocation) this.e, (TLRPC.InputFile) this.f2395f, (TLObject) this.f2393b, (TLRPC.FileLocation) this.h, this.f2394c);
                return;
            case 12:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                String[] strArr = (String[]) this.f2393b;
                Context context2 = (Context) this.e;
                uk0 uk0Var = (uk0) this.f2395f;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.h;
                if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                    xk0.c(context2, this.f2394c, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new qy(16, strArr, uk0Var), true, new ah.j(23), o2Var.getResourceProvider());
                    return;
                }
                uk0Var.run();
                return;
            case 13:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f2393b;
                List<Purchase> list = (List) this.e;
                c5.g gVar = (c5.g) this.f2395f;
                tw0 tw0Var = (tw0) this.h;
                if (((c5.i) this.d).f4757a == 0) {
                    fi0 fi0Var = new fi0(1, o2Var2);
                    int i16 = this.f2394c;
                    if (list != null && !list.isEmpty() && !UserConfig.getInstance(i16).isPremium()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.f6281a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (gVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i16).sendRequest(tL_payments_assignPlayMarketTransaction, new ci.s8(i16, fi0Var, o2Var2, tL_payments_assignPlayMarketTransaction), 66);
                                return;
                            }
                        }
                    }
                    BillingController.getInstance().addResultListener("telegram_premium", new org.telegram.ui.i3(fi0Var, 4));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (gVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i16).sendRequest(tL_payments_canPurchaseStore, new ii(i16, 5, o2Var2, tw0Var, gVar, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    return;
                }
                return;
            case 14:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.d;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.e;
                ci.y7 y7Var = (ci.y7) this.f2395f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                boolean z12 = ((TLObject) this.f2393b) instanceof TLRPC.TL_boolTrue;
                int i17 = this.f2394c;
                if (z12) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.b1.w(i17, y0Var, y7Var, "write_access_requested", jSONObject);
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
                    alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new org.telegram.ui.Wallet.e8(3, b1Var, strArr2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new org.telegram.ui.web.d0(0));
                    b1Var.X(3, alertDialog$Builder.f20678a, new org.telegram.ui.web.x(strArr2, i17, y0Var, y7Var, 1));
                    return;
                }
            default:
                TLObject tLObject4 = (TLObject) this.f2393b;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.e;
                ti tiVar = (ti) this.f2395f;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) this.h;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject4;
                    int i18 = this.f2394c;
                    MessagesController.getInstance(i18).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(UserConfig.getInstance(i18).clientUserId));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && user != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 1000);
                        if (closestPhotoSizeWithSize != null && photoSize2 != null && photoSize2.location != null) {
                            FileLoader.getInstance(i18).getPathToAttach(photoSize2.location, true).renameTo(FileLoader.getInstance(i18).getPathToAttach(closestPhotoSizeWithSize, true));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(photoSize2.location.volume_id);
                            sb2.append("_");
                            String n10 = a1.g.n(photoSize2.location.local_id, "@50_50", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            photoSize = closestPhotoSizeWithSize2;
                            sb3.append(closestPhotoSizeWithSize.location.volume_id);
                            sb3.append("_");
                            ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(i18, user, 1), false);
                        } else {
                            photoSize = closestPhotoSizeWithSize2;
                        }
                        if (photoSize != null && photoSize3 != null && photoSize3.location != null) {
                            FileLoader.getInstance(i18).getPathToAttach(photoSize3.location, true).renameTo(FileLoader.getInstance(i18).getPathToAttach(photoSize, true));
                        }
                        zf.d0.a(tL_photos_photo.photo, user, false);
                        UserConfig.getInstance(i18).setCurrentUser(user);
                        UserConfig.getInstance(i18).saveConfig(true);
                        tiVar.run();
                        org.telegram.ui.Components.xc.a0(h5Var.getLastFragment()).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new wg1(i18, h5Var, 12)), null).j();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public wb(Context context, TLRPC.Chat chat, TLRPC.User user, int i10, MessagesStorage.BooleanCallback booleanCallback, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f2392a = 8;
        this.d = context;
        this.f2393b = chat;
        this.e = user;
        this.f2394c = i10;
        this.h = booleanCallback;
        this.f2395f = g6Var;
    }

    public wb(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f2392a = i11;
        this.d = obj;
        this.f2394c = i10;
        this.f2393b = obj2;
        this.e = obj3;
        this.f2395f = obj4;
        this.h = obj5;
    }

    public wb(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.f2392a = i11;
        this.d = obj;
        this.f2393b = obj2;
        this.e = obj3;
        this.f2394c = i10;
        this.f2395f = obj4;
        this.h = obj5;
    }

    public wb(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5, int i11) {
        this.f2392a = i11;
        this.d = obj;
        this.f2393b = obj2;
        this.e = obj3;
        this.f2395f = obj4;
        this.f2394c = i10;
        this.h = obj5;
    }

    public wb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, int i11) {
        this.f2392a = i11;
        this.d = obj;
        this.f2393b = obj2;
        this.e = obj3;
        this.f2395f = obj4;
        this.h = obj5;
        this.f2394c = i10;
    }

    public wb(oh0 oh0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.f2392a = 10;
        this.d = oh0Var;
        this.e = numArr;
        this.f2394c = i10;
        this.f2393b = tLObject;
        this.f2395f = arrayList;
        this.h = pollAnswerVoters;
    }

    public wb(hs hsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        this.f2392a = 11;
        this.d = hsVar;
        this.e = fileLocation;
        this.f2395f = inputFile;
        this.f2393b = tLObject;
        this.h = fileLocation2;
        this.f2394c = i10;
    }

    public wb(f70 f70Var, org.telegram.ui.i4 i4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.e1 e1Var) {
        this.f2392a = 6;
        this.d = f70Var;
        this.e = i4Var;
        this.f2395f = tL_error;
        this.f2393b = tLObject;
        this.f2394c = i10;
        this.h = e1Var;
    }

    public wb(org.telegram.ui.web.b1 b1Var, TLObject tLObject, int i10, org.telegram.ui.web.y0 y0Var, ci.y7 y7Var, TLRPC.TL_error tL_error) {
        this.f2392a = 14;
        this.d = b1Var;
        this.f2393b = tLObject;
        this.f2394c = i10;
        this.e = y0Var;
        this.f2395f = y7Var;
        this.h = tL_error;
    }
}
