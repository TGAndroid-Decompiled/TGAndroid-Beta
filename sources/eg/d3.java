package eg;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import mh.t7;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ah;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.ay;
import org.telegram.ui.cl0;
import org.telegram.ui.d60;
import org.telegram.ui.en;
import org.telegram.ui.jn;
import org.telegram.ui.l4;
import org.telegram.ui.py;
import org.telegram.ui.vm;
import org.telegram.ui.wg0;
import org.telegram.ui.wi;
import org.telegram.ui.xf0;
import org.telegram.ui.xn;
import org.telegram.ui.z10;
import org.telegram.ui.zq0;
import qh.ba;
public final class d3 implements Runnable {
    public final int f5159a;
    public final int f5160b;
    public final Object f5161c;
    public final Object d;
    public final Object f5162e;
    public final Object f5163f;

    public d3(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f5159a = 16;
        this.f5160b = i10;
        this.f5161c = chat;
        this.f5162e = arrayList;
        this.d = arrayList2;
        this.f5163f = arrayList3;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        boolean z4;
        boolean z10;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        l4 l4Var;
        int i12;
        Object obj;
        String lowerCase;
        int i13;
        org.telegram.ui.ActionBar.p2 R;
        int i14;
        boolean z11;
        boolean z12;
        qc a02;
        int i15;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        boolean z13;
        boolean z14;
        long j10;
        final long j11;
        boolean z15;
        String str = "";
        boolean z16 = true;
        switch (this.f5159a) {
            case 0:
                o3 o3Var = (o3) this.f5161c;
                int i16 = this.f5160b;
                List list = (List) this.d;
                ArrayList arrayList3 = (ArrayList) this.f5162e;
                zq0 zq0Var = (zq0) this.f5163f;
                if (o3Var.F != null && !o3Var.f5423y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / o3Var.F.getWidth(), 1.0f / o3Var.F.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i16);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i16 / 90) % 2 != 0) {
                        matrix.postScale(o3Var.F.getHeight(), o3Var.F.getWidth());
                    } else {
                        matrix.postScale(o3Var.F.getWidth(), o3Var.F.getHeight());
                    }
                    if (list.isEmpty()) {
                        l3 l3Var = new l3(o3Var);
                        l3Var.h.set(0.0f, 0.0f, o3Var.F.getWidth(), o3Var.F.getHeight());
                        l3Var.f5332i.set(l3Var.h);
                        matrix.mapRect(l3Var.f5332i);
                        l3Var.f5328c = i16;
                        Bitmap d = o3Var.d(o3Var.F, 0, 0, false);
                        l3Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        l3Var.f5330f = l3Var.c();
                        o3.c(l3Var, o3Var.Q, o3Var.R);
                        o3Var.L = l3Var.f5333j;
                        o3Var.M = l3Var.f5334k;
                        arrayList3.add(l3Var);
                        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(o3Var, arrayList3, zq0Var, l3Var, 2));
                        o3Var.B = l3Var;
                        o3Var.f5423y = true;
                        o3Var.f5422x = false;
                        return;
                    }
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        n3 n3Var = (n3) list.get(i17);
                        l3 l3Var2 = new l3(o3Var);
                        l3Var2.h.set(n3Var.f5380b, n3Var.f5381c, i10 + n3Var.d, i11 + n3Var.f5382e);
                        l3Var2.f5332i.set(l3Var2.h);
                        matrix.mapRect(l3Var2.f5332i);
                        l3Var2.f5328c = i16;
                        Bitmap d10 = o3Var.d(n3Var.f5379a, n3Var.f5380b, n3Var.f5381c, false);
                        l3Var2.d = d10;
                        if (d10 != null) {
                            l3Var2.f5330f = l3Var2.c();
                            o3.c(l3Var2, o3Var.Q, o3Var.R);
                            o3Var.L = l3Var2.f5333j;
                            o3Var.M = l3Var2.f5334k;
                            arrayList3.add(l3Var2);
                        }
                    }
                    o3Var.B = null;
                    o3Var.f5423y = true;
                    o3Var.f5422x = false;
                    AndroidUtilities.runOnUIThread(new a1.e(23, o3Var, arrayList3));
                    return;
                }
                return;
            case 1:
                lh.g2 g2Var = (lh.g2) this.f5161c;
                Context context = (Context) this.d;
                int i18 = this.f5160b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f5162e;
                long j12 = g2Var.Z;
                lh.x0 x0Var = new lh.x0(g2Var, (Utilities.Callback) this.f5163f, 2);
                boolean z17 = starGift.limited;
                if (z17 && (disallowedGiftsSettings2 = g2Var.Y) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z17 && (disallowedGiftsSettings = g2Var.Y) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                new lh.i1(g2Var, context, i18, starGift, j12, x0Var, z4, z10).show();
                return;
            case 2:
                int i19 = this.f5160b;
                TLObject tLObject = (TLObject) this.f5162e;
                String str2 = (String) this.f5163f;
                ((qh.d) this.f5161c).setLoading(false);
                org.telegram.ui.ActionBar.h3 h3Var = ((org.telegram.ui.ActionBar.h3[]) this.d)[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                }
                t7.y(i19, false).S();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    qc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str2)), null).k(false);
                    return;
                }
                return;
            case 3:
                LocationController.lambda$fetchLocationAddress$29((Locale) this.f5161c, (Location) this.d, this.f5160b, (Locale) this.f5162e, (LocationController.LocationFetchCallback) this.f5163f);
                return;
            case 4:
                ((MediaDataController) this.f5161c).lambda$removeMultipleStickerSets$110((boolean[]) this.d, (ArrayList) this.f5162e, this.f5160b, (int[]) this.f5163f);
                return;
            case 5:
                ((MessagesController) this.f5161c).lambda$processUpdateArray$403((lf.t) this.d, (ConcurrentHashMap) this.f5162e, (ConcurrentHashMap) this.f5163f, this.f5160b);
                return;
            case 6:
                ((MessagesStorage) this.f5161c).lambda$getSentFile$164((String) this.d, this.f5160b, (Object[]) this.f5162e, (CountDownLatch) this.f5163f);
                return;
            case 7:
                ((MessagesStorage) this.f5161c).lambda$putSentFile$170((String) this.d, (TLObject) this.f5162e, this.f5160b, (String) this.f5163f);
                return;
            case 8:
                ((NotificationCenter) this.f5161c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.f5162e, (ah) this.f5163f, this.f5160b);
                return;
            case 9:
                ((VoIPService) this.f5161c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.f5160b, (String) this.f5162e, (TLRPC.TL_error) this.f5163f);
                return;
            case 10:
                l4 l4Var2 = (l4) this.f5161c;
                ArrayList arrayList4 = (ArrayList) this.f5162e;
                HashMap hashMap = (HashMap) this.d;
                String str3 = (String) this.f5163f;
                int i20 = this.f5160b;
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList4.size();
                int i21 = 0;
                while (i21 < size) {
                    Object obj2 = arrayList4.get(i21);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj2);
                    if (obj2 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj2;
                        int i22 = i21;
                        l4Var = l4Var2;
                        i12 = i22;
                        obj = obj2;
                        CharSequence C = l4.C(l4Var, l4Var2.f38524r0[0].f39863c.B, null, richText, richText, pageBlock, 1000);
                        if (!TextUtils.isEmpty(C)) {
                            lowerCase = C.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        int i23 = i21;
                        l4Var = l4Var2;
                        i12 = i23;
                        obj = obj2;
                        if (obj instanceof String) {
                            lowerCase = ((String) obj).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i24 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str3, i24);
                            if (indexOf >= 0) {
                                int length = str3.length() + indexOf;
                                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                                    ?? obj3 = new Object();
                                    obj3.f41715a = indexOf;
                                    obj3.f41717c = pageBlock;
                                    obj3.f41716b = obj;
                                    arrayList5.add(obj3);
                                }
                                i24 = length;
                            }
                        }
                    }
                    l4 l4Var3 = l4Var;
                    i21 = i12 + 1;
                    l4Var2 = l4Var3;
                }
                AndroidUtilities.runOnUIThread(new dg.u1((Object) l4Var2, i20, arrayList5, (Serializable) str3, 9));
                return;
            case 11:
                TLObject tLObject2 = (TLObject) this.f5161c;
                int i25 = this.f5160b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f5162e;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f5163f;
                if (tLObject2 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    MessagesController.getInstance(i25).putUsers(updates.users, false);
                    MessagesController.getInstance(i25).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    int i26 = 0;
                    while (i26 < size2) {
                        Object obj4 = findUpdatesAndRemove.get(i26);
                        i26++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj4).call;
                    }
                    if (LaunchActivity.D1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f20862id = groupCall.f20855id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.g2.g(LaunchActivity.D1, i25, tL_inputGroupCall, false, groupCall, hashSet);
                        return;
                    }
                    return;
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    MessagesController.getInstance(i25).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i25).putChats(groupcall.chats, false);
                    if (LaunchActivity.D1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.f20862id = groupCall2.f20855id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.g2.g(LaunchActivity.D1, i25, tL_inputGroupCall2, false, groupCall2, hashSet);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    qc.a0(p2Var).d0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 12:
                xn.N0((xn) this.f5161c, this.f5160b, (Boolean) this.d, (TLRPC.WebPage) this.f5162e, (TL_account.getWebPagePreview) this.f5163f);
                return;
            case 13:
                jn jnVar = (jn) this.f5161c;
                wi wiVar = (wi) this.d;
                wiVar.f180b = jnVar.f38085a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.f5162e).f20845id, this.f5160b, new en(jnVar, wiVar, (xn) this.f5163f));
                return;
            case 14:
                jn jnVar2 = (jn) this.f5161c;
                int i27 = this.f5160b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.f5162e;
                byte[] bArr = (byte[]) this.f5163f;
                xn xnVar = jnVar2.f38085a;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == xnVar.I6) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                xnVar.Xa(i27, id2, true, i13, true, 0, num, bArr, new vm(jnVar2, messageObject, 1));
                return;
            case 15:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.f5161c;
                int[] iArr = (int[]) this.d;
                int i28 = this.f5160b;
                Runnable runnable = (Runnable) this.f5162e;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f5163f;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    d2Var.setOnCancelListener(new org.telegram.ui.Components.z1(iArr, runnable, i28));
                    p2Var2.showDialog(d2VarArr[0]);
                    return;
                }
                return;
            case 16:
                int i29 = this.f5160b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f5161c;
                ArrayList arrayList6 = (ArrayList) this.f5162e;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.f5163f;
                if (LaunchActivity.f34135z1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    fg.v0 v0Var = new fg.v0(11, i29, R.getParentActivity(), R, null);
                    v0Var.I1(chat, arrayList6, arrayList7, arrayList8, null);
                    v0Var.show();
                    return;
                }
                return;
            case 17:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.f5162e;
                int i30 = this.f5160b;
                org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) this.f5163f;
                SharedPreferences.Editor edit = ((SharedPreferences) this.f5161c).edit();
                edit.putLong("support_id2", tL_help_support.user.f20992id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    d2Var2.dismiss();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                ArrayList arrayList9 = new ArrayList();
                arrayList9.add(tL_help_support.user);
                MessagesStorage.getInstance(i30).putUsersAndChats(arrayList9, null, true, true);
                MessagesController.getInstance(i30).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.f20992id);
                p2Var3.presentFragment(new xn(bundle));
                return;
            case 18:
                gs.P((gs) this.f5161c, (TLObject) this.d, (TLRPC.InputPeer) this.f5162e, this.f5160b, (int[]) this.f5163f);
                return;
            case 19:
                yv0 yv0Var = (yv0) this.f5161c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i31 = this.f5160b;
                MessageObject messageObject2 = (MessageObject) this.f5162e;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f5163f;
                int[] iArr2 = yv0Var.f27524e;
                RLottieNative[] rLottieNativeArr = yv0Var.f33672c1;
                if (yv0Var.T0) {
                    AndroidUtilities.runOnUIThread(new wv0(yv0Var, 2));
                    return;
                }
                boolean z18 = false;
                for (int i32 = 0; i32 < rLottieNativeArr.length; i32++) {
                    if (rLottieNativeArr[i32] == null) {
                        if (i32 == 0) {
                            i14 = 1;
                        } else if (i32 == 1) {
                            i14 = 8;
                        } else if (i32 == 2) {
                            i14 = 14;
                        } else if (i32 == 3) {
                            i14 = 20;
                        } else {
                            i14 = 2;
                        }
                        if (i14 < tL_messages_stickerSet.documents.size()) {
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i14);
                            String readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(readRes)) {
                                AndroidUtilities.runOnUIThread(new xv0(document, i31, messageObject2, t1Var, tL_messages_stickerSet, 1));
                                z18 = true;
                            } else {
                                rLottieNativeArr[i32] = RLottieNative.b(readRes, iArr2, null, null);
                                yv0Var.f33673d1[i32] = iArr2[0];
                            }
                        }
                    }
                }
                if (z18) {
                    AndroidUtilities.runOnUIThread(new wv0(yv0Var, 3));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new gy(yv0Var, i31, t1Var, 15));
                    return;
                }
            case 20:
                LaunchActivity launchActivity = (LaunchActivity) this.f5161c;
                TLObject tLObject3 = (TLObject) this.d;
                Uri uri = (Uri) this.f5162e;
                int i33 = this.f5160b;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) this.f5163f;
                Pattern pattern = LaunchActivity.f34134y1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject3 != null && launchActivity.f34160n0 != null) {
                        TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject3;
                        Bundle i34 = android.support.v4.media.a.i("onlySelect", true);
                        i34.putString("importTitle", tL_messages_historyImportParsed.title);
                        i34.putBoolean("allowSwitchAccount", true);
                        if (tL_messages_historyImportParsed.pm) {
                            i34.putInt("dialogsType", 12);
                        } else if (tL_messages_historyImportParsed.group) {
                            i34.putInt("dialogsType", 11);
                        } else {
                            String uri2 = uri.toString();
                            Iterator<String> it = MessagesController.getInstance(i33).exportPrivateUri.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (uri2.contains(it.next())) {
                                        i34.putInt("dialogsType", 12);
                                        z11 = true;
                                    }
                                } else {
                                    z11 = false;
                                }
                            }
                            if (!z11) {
                                Iterator<String> it2 = MessagesController.getInstance(i33).exportGroupUri.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (uri2.contains(it2.next())) {
                                            i34.putInt("dialogsType", 11);
                                            z11 = true;
                                        }
                                    }
                                }
                                if (!z11) {
                                    i34.putInt("dialogsType", 13);
                                }
                            }
                        }
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().f34800s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                            PhotoViewer.t1().G0(false, true);
                        } else if (l4.I() && l4.x().S) {
                            l4.x().o(false, true);
                        }
                        ba.x();
                        d60 d60Var = d60.A3;
                        if (d60Var != null) {
                            d60Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.f34160n0.U(true, true);
                            launchActivity.f34164p0.U(true, true);
                        }
                        py pyVar = new py(i34);
                        pyVar.f40278z2 = launchActivity;
                        if (!AndroidUtilities.isTablet() ? !(launchActivity.f34160n0.getFragmentStack().size() <= 1 || !(launchActivity.f34160n0.getFragmentStack().get(launchActivity.f34160n0.getFragmentStack().size() - 1) instanceof wg0)) : !(launchActivity.f34162o0.getFragmentStack().isEmpty() || !(launchActivity.f34162o0.getFragmentStack().get(launchActivity.f34162o0.getFragmentStack().size() - 1) instanceof wg0))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        ((ActionBarLayout) launchActivity.O()).S(pyVar, z12, false);
                    } else {
                        if (launchActivity.T == null) {
                            launchActivity.T = new ArrayList();
                        }
                        launchActivity.T.add(0, launchActivity.U);
                        launchActivity.U = null;
                        launchActivity.i0(true);
                    }
                    try {
                        d2Var3.dismiss();
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            case 21:
                TLObject tLObject4 = (TLObject) this.d;
                int i35 = this.f5160b;
                String str4 = (String) this.f5162e;
                z10 z10Var = (z10) this.f5163f;
                org.telegram.ui.ActionBar.p2 p2Var4 = (org.telegram.ui.ActionBar.p2) l.d.i(1, ((LaunchActivity) this.f5161c).f34136a0);
                try {
                    if (tLObject4 instanceof TL_chatlists.chatlist_ChatlistInvite) {
                        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject4;
                        boolean z19 = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
                        if (z19) {
                            TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                            arrayList2 = tL_chatlists_chatlistInvite.chats;
                            arrayList = tL_chatlists_chatlistInvite.users;
                        } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                            TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                            arrayList2 = tL_chatlists_chatlistInviteAlready.chats;
                            arrayList = tL_chatlists_chatlistInviteAlready.users;
                        } else {
                            arrayList = null;
                            arrayList2 = null;
                        }
                        MessagesController.getInstance(i35).putChats(arrayList2, false);
                        MessagesController.getInstance(i35).putUsers(arrayList, false);
                        if (z19 && ((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                            a02 = qc.a0(p2Var4);
                            i15 = R.string.NoFolderFound;
                        } else {
                            ?? saVar = new sa(p2Var4, false);
                            saVar.V = -1;
                            saVar.Z = "";
                            saVar.f26093a0 = new ArrayList();
                            saVar.f26095c0 = "";
                            saVar.f26097e0 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            saVar.f26098f0 = arrayList10;
                            saVar.f26114w0 = -1;
                            saVar.f26117z0 = -5;
                            saVar.U = str4;
                            saVar.W = chatlist_chatlistinvite;
                            arrayList10.clear();
                            if (z19) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                saVar.Z = tL_textWithEntities.text;
                                saVar.f26093a0 = tL_textWithEntities.entities;
                                saVar.f26094b0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                saVar.f26096d0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                saVar.f26096d0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                saVar.f26099g0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                saVar.V = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList11 = p2Var4.getMessagesController().dialogFilters;
                                if (arrayList11 != null) {
                                    int i36 = 0;
                                    while (true) {
                                        if (i36 < arrayList11.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList11.get(i36);
                                            if (dialogFilter.f18057id == saVar.V) {
                                                saVar.Z = dialogFilter.name;
                                                saVar.f26093a0 = dialogFilter.entities;
                                                saVar.f26094b0 = dialogFilter.title_noanimate;
                                            } else {
                                                i36++;
                                            }
                                        }
                                    }
                                }
                            }
                            saVar.S();
                            p2Var4.showDialog(saVar);
                            z10Var.run();
                            return;
                        }
                    } else {
                        a02 = qc.a0(p2Var4);
                        i15 = R.string.NoFolderFound;
                    }
                    z10Var.run();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                org.telegram.messenger.y3.s(i15, a02, null);
                break;
            case 22:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f5161c;
                z10 z10Var2 = (z10) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f5162e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f5163f;
                int i37 = this.f5160b;
                ArrayList arrayList12 = launchActivity2.f34136a0;
                if (!launchActivity2.isFinishing()) {
                    try {
                        z10Var2.run();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    if (tL_error2 == null) {
                        if (launchActivity2.f34160n0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                            TLRPC.Chat chat2 = updates2.chats.get(0);
                            chat2.left = false;
                            chat2.kicked = false;
                            MessagesController.getInstance(i37).putUsers(updates2.users, false);
                            MessagesController.getInstance(i37).putChats(updates2.chats, false);
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chat2.f20845id);
                            if (arrayList12.isEmpty() || MessagesController.getInstance(i37).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.p2) l.d.i(1, arrayList12))) {
                                xn xnVar2 = new xn(bundle2);
                                NotificationCenter.getInstance(i37).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                                ((ActionBarLayout) launchActivity2.O()).S(xnVar2, false, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity2);
                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.AppName);
                    if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                        alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.FloodWait);
                    } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                        alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.JoinToGroupErrorFull);
                    } else {
                        alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    launchActivity2.B0(alertDialog$Builder);
                    return;
                }
                return;
            case 23:
                xf0 xf0Var = (xf0) this.f5161c;
                String str5 = (String) this.d;
                String str6 = (String) this.f5162e;
                String str7 = (String) this.f5163f;
                int i38 = this.f5160b;
                ArrayList arrayList13 = new ArrayList();
                b6.h hVar = new b6.h();
                hVar.f1729c = "inapp";
                hVar.f1728b = str5;
                arrayList13.add(hVar.a());
                FileLog.d("LoginBilling querying \"" + str5 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList13, new j3(xf0Var, str5, str6, str7, i38));
                return;
            case 24:
                int i39 = this.f5160b;
                z8 z8Var = (z8) this.d;
                TLRPC.User user = (TLRPC.User) this.f5162e;
                ((int[]) this.f5161c)[0] = i39;
                z8Var.r(user);
                ((p9) this.f5163f).e(user, z8Var);
                return;
            case 25:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f5161c;
                int i40 = this.f5160b;
                org.telegram.ui.web.x0 x0Var2 = (org.telegram.ui.web.x0) this.f5162e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f5163f;
                if (((TLObject) this.d) instanceof TLRPC.TL_boolTrue) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.a1.u(i40, x0Var2, "write_access_requested", jSONObject);
                        return;
                    } catch (Exception e13) {
                        FileLog.e(e13);
                        return;
                    }
                } else if (tL_error3 != null) {
                    a1Var.S(tL_error3.text);
                    return;
                } else {
                    String[] strArr = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(a1Var.getContext());
                    alertDialog$Builder2.f21168a.O = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder2.f21168a.Q = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new org.telegram.ui.web.m(1, a1Var, strArr));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new cl0(11));
                    a1Var.R(3, alertDialog$Builder2.f21168a, new org.telegram.ui.web.x(strArr, i40, x0Var2, 1));
                    return;
                }
            case 26:
                long[] jArr = (long[]) this.f5161c;
                int i41 = this.f5160b;
                p9 p9Var = (p9) this.d;
                p9 p9Var2 = (p9) this.f5162e;
                TextView textView = (TextView) this.f5163f;
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i41).getUser(Long.valueOf(jArr[0]));
                    z8 z8Var2 = new z8((g6) null);
                    z8Var2.r(user2);
                    p9Var.e(user2, z8Var2);
                } else {
                    TLRPC.Chat chat3 = MessagesController.getInstance(i41).getChat(Long.valueOf(-jArr[0]));
                    z8 z8Var3 = new z8((g6) null);
                    z8Var3.q(chat3);
                    p9Var.e(chat3, z8Var3);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user3 = MessagesController.getInstance(i41).getUser(Long.valueOf(jArr[0]));
                    if (p9Var2 != null) {
                        z8 z8Var4 = new z8((g6) null);
                        z8Var4.r(user3);
                        p9Var2.e(user3, z8Var4);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user3));
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat4 = MessagesController.getInstance(i41).getChat(Long.valueOf(-jArr[0]));
                if (p9Var2 != null) {
                    z8 z8Var5 = new z8((g6) null);
                    z8Var5.q(chat4);
                    p9Var2.e(chat4, z8Var5);
                }
                if (textView != null) {
                    if (chat4 != null) {
                        str = chat4.title;
                    }
                    textView.setText(str);
                    return;
                }
                return;
            case 27:
                boolean[] zArr = (boolean[]) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f5162e;
                int i42 = this.f5160b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f5163f;
                if (!(((TLObject) this.f5161c) instanceof TLRPC.TL_boolTrue)) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        callback.run("SERVER_ERROR");
                        return;
                    }
                    return;
                }
                TLRPC.User currentUser = UserConfig.getInstance(i42).getCurrentUser();
                if (currentUser != null) {
                    currentUser.emoji_status = updateemojistatus.emoji_status;
                    z13 = true;
                    NotificationCenter.getInstance(i42).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
                    MessagesController.getInstance(i42).updateEmojiStatusUntilUpdate(currentUser.f20992id, currentUser.emoji_status);
                } else {
                    z13 = true;
                }
                if (!zArr[0]) {
                    zArr[0] = z13;
                    callback.run(null);
                    return;
                }
                return;
            case 28:
                final uf.z zVar = (uf.z) this.f5161c;
                int i43 = this.f5160b;
                ArrayList arrayList14 = (ArrayList) this.f5162e;
                ArrayList arrayList15 = (ArrayList) this.d;
                ArrayList<TLRPC.User> arrayList16 = (ArrayList) this.f5163f;
                uf.s sVar = zVar.f48796g0;
                ArrayList arrayList17 = zVar.f48810s0;
                int i44 = zVar.f48805p0;
                zVar.A0--;
                if (i43 == zVar.f48787a0) {
                    zVar.f48790c0 = i43;
                    if (zVar.f48788b0 != i43) {
                        sVar.b();
                    }
                    if (zVar.f48791d0 != i43) {
                        zVar.F.clear();
                    }
                    zVar.K = true;
                    int i45 = 0;
                    while (i45 < arrayList14.size()) {
                        if (!zVar.F(arrayList14.get(i45))) {
                            arrayList14.remove(i45);
                            i45--;
                        }
                        i45++;
                    }
                    int size3 = arrayList17.size();
                    int i46 = 0;
                    while (i46 < arrayList14.size()) {
                        final Object obj5 = arrayList14.get(i46);
                        if (obj5 instanceof TLRPC.User) {
                            TLRPC.User user4 = (TLRPC.User) obj5;
                            j10 = 0;
                            MessagesController.getInstance(i44).putUser(user4, z16);
                            j11 = user4.f20992id;
                        } else {
                            j10 = 0;
                            if (obj5 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat5 = (TLRPC.Chat) obj5;
                                MessagesController.getInstance(i44).putChat(chat5, z16);
                                j11 = -chat5.f20845id;
                            } else {
                                if (obj5 instanceof TLRPC.EncryptedChat) {
                                    MessagesController.getInstance(i44).putEncryptedChat((TLRPC.EncryptedChat) obj5, z16);
                                }
                                j11 = 0;
                            }
                        }
                        if (j11 != j10 && ((TLRPC.Dialog) MessagesController.getInstance(i44).dialogs_dict.f(j11)) == null) {
                            MessagesStorage.getInstance(i44).getDialogFolderId(j11, new MessagesStorage.IntCallback() {
                                @Override
                                public final void run(int i47) {
                                    int i48 = z.this.f48805p0;
                                    if (i47 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j13 = j11;
                                        tL_dialog.f20849id = j13;
                                        if (i47 != 0) {
                                            tL_dialog.folder_id = i47;
                                        }
                                        Object obj6 = obj5;
                                        if (obj6 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj6) ? 1 : 0;
                                        }
                                        MessagesController.getInstance(i48).dialogs_dict.k(tL_dialog, j13);
                                        MessagesController.getInstance(i48).getAllDialogs().add(tL_dialog);
                                        MessagesController.getInstance(i48).sortDialogs(null);
                                    }
                                }
                            });
                        }
                        if (zVar.S() && !(obj5 instanceof TLRPC.EncryptedChat)) {
                            ay ayVar = zVar.R;
                            if (ayVar != null && ayVar.a() == j11) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            for (int i47 = 0; !z15 && i47 < size3; i47++) {
                                uf.y yVar = (uf.y) arrayList17.get(i47);
                                boolean z20 = z15;
                                if (yVar != null && yVar.f48777c == j11) {
                                    z15 = true;
                                } else {
                                    z15 = z20;
                                }
                            }
                            if (z15) {
                                arrayList14.remove(i46);
                                arrayList15.remove(i46);
                                i46--;
                            }
                        }
                        i46++;
                        z16 = true;
                    }
                    MessagesController.getInstance(i44).putUsers(arrayList16, true);
                    zVar.f48809s = arrayList14;
                    zVar.D = arrayList15;
                    sVar.f(arrayList14, arrayList17);
                    zVar.l();
                    ay ayVar2 = zVar.R;
                    if (ayVar2 != null) {
                        if (zVar.A0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        ayVar2.d(z14, true);
                        zVar.R.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                uf.c1 c1Var = (uf.c1) this.f5161c;
                int i48 = this.f5160b;
                ArrayList arrayList18 = (ArrayList) this.f5162e;
                ArrayList arrayList19 = (ArrayList) this.d;
                ArrayList arrayList20 = (ArrayList) this.f5163f;
                if (i48 == c1Var.B) {
                    c1Var.d = arrayList18;
                    c1Var.f48556e = arrayList19;
                    c1Var.E = arrayList20;
                    c1Var.f48557f.f(arrayList18, null);
                    c1Var.f48563y = false;
                    c1Var.l();
                    c1Var.F();
                    return;
                }
                return;
        }
    }

    public d3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f5159a = i11;
        this.f5161c = obj;
        this.f5160b = i10;
        this.d = obj2;
        this.f5162e = obj3;
        this.f5163f = obj4;
    }

    public d3(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.f5159a = i11;
        this.f5161c = obj;
        this.d = obj2;
        this.f5160b = i10;
        this.f5162e = obj3;
        this.f5163f = obj4;
    }

    public d3(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f5159a = i11;
        this.f5161c = obj;
        this.d = obj2;
        this.f5162e = obj3;
        this.f5160b = i10;
        this.f5163f = obj4;
    }

    public d3(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f5159a = i11;
        this.f5161c = obj;
        this.d = obj2;
        this.f5162e = obj3;
        this.f5163f = obj4;
        this.f5160b = i10;
    }

    public d3(l4 l4Var, ArrayList arrayList, HashMap hashMap, String str, int i10) {
        this.f5159a = 10;
        this.f5161c = l4Var;
        this.f5162e = arrayList;
        this.d = hashMap;
        this.f5163f = str;
        this.f5160b = i10;
    }

    public d3(rl0 rl0Var, int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i11) {
        this.f5159a = i11;
        this.f5161c = rl0Var;
        this.f5160b = i10;
        this.f5162e = arrayList;
        this.d = arrayList2;
        this.f5163f = arrayList3;
    }
}
