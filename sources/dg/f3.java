package dg;

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
import lh.t7;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.cy;
import org.telegram.ui.e60;
import org.telegram.ui.gn;
import org.telegram.ui.ln;
import org.telegram.ui.n4;
import org.telegram.ui.qy;
import org.telegram.ui.w10;
import org.telegram.ui.xg0;
import org.telegram.ui.xm;
import org.telegram.ui.yf0;
import org.telegram.ui.yi;
import org.telegram.ui.zn;
import org.telegram.ui.zq0;
import ph.da;
public final class f3 implements Runnable {
    public final int f4518a;
    public final int f4519b;
    public final Object f4520c;
    public final Object d;
    public final Object e;
    public final Object f4521f;

    public f3(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f4518a = 16;
        this.f4519b = i10;
        this.f4520c = chat;
        this.e = arrayList;
        this.d = arrayList2;
        this.f4521f = arrayList3;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        boolean z4;
        boolean z10;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        Object obj;
        String lowerCase;
        int i12;
        org.telegram.ui.ActionBar.p2 R;
        int i13;
        boolean z11;
        boolean z12;
        qc a02;
        int i14;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        boolean z13;
        boolean z14;
        long j10;
        final long j11;
        boolean z15;
        String str = "";
        boolean z16 = true;
        switch (this.f4518a) {
            case 0:
                q3 q3Var = (q3) this.f4520c;
                int i15 = this.f4519b;
                List list = (List) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                zq0 zq0Var = (zq0) this.f4521f;
                if (q3Var.F != null && !q3Var.f4766y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / q3Var.F.getWidth(), 1.0f / q3Var.F.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i15);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i15 / 90) % 2 != 0) {
                        matrix.postScale(q3Var.F.getHeight(), q3Var.F.getWidth());
                    } else {
                        matrix.postScale(q3Var.F.getWidth(), q3Var.F.getHeight());
                    }
                    if (list.isEmpty()) {
                        n3 n3Var = new n3(q3Var);
                        n3Var.h.set(0.0f, 0.0f, q3Var.F.getWidth(), q3Var.F.getHeight());
                        n3Var.f4679i.set(n3Var.h);
                        matrix.mapRect(n3Var.f4679i);
                        n3Var.f4676c = i15;
                        Bitmap d = q3Var.d(q3Var.F, 0, 0, false);
                        n3Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        n3Var.f4677f = n3Var.c();
                        q3.c(n3Var, q3Var.Q, q3Var.R);
                        q3Var.L = n3Var.f4680j;
                        q3Var.M = n3Var.f4681k;
                        arrayList3.add(n3Var);
                        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(q3Var, arrayList3, zq0Var, n3Var, 2));
                        q3Var.B = n3Var;
                        q3Var.f4766y = true;
                        q3Var.f4765x = false;
                        return;
                    }
                    for (int i16 = 0; i16 < list.size(); i16++) {
                        p3 p3Var = (p3) list.get(i16);
                        n3 n3Var2 = new n3(q3Var);
                        n3Var2.h.set(p3Var.f4727b, p3Var.f4728c, i10 + p3Var.d, i11 + p3Var.e);
                        n3Var2.f4679i.set(n3Var2.h);
                        matrix.mapRect(n3Var2.f4679i);
                        n3Var2.f4676c = i15;
                        Bitmap d10 = q3Var.d(p3Var.f4726a, p3Var.f4727b, p3Var.f4728c, false);
                        n3Var2.d = d10;
                        if (d10 != null) {
                            n3Var2.f4677f = n3Var2.c();
                            q3.c(n3Var2, q3Var.Q, q3Var.R);
                            q3Var.L = n3Var2.f4680j;
                            q3Var.M = n3Var2.f4681k;
                            arrayList3.add(n3Var2);
                        }
                    }
                    q3Var.B = null;
                    q3Var.f4766y = true;
                    q3Var.f4765x = false;
                    AndroidUtilities.runOnUIThread(new a1.e(19, q3Var, arrayList3));
                    return;
                }
                return;
            case 1:
                kh.g2 g2Var = (kh.g2) this.f4520c;
                Context context = (Context) this.d;
                int i17 = this.f4519b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                long j12 = g2Var.Z;
                kh.x0 x0Var = new kh.x0(g2Var, (Utilities.Callback) this.f4521f, 2);
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
                new kh.i1(g2Var, context, i17, starGift, j12, x0Var, z4, z10).show();
                return;
            case 2:
                int i18 = this.f4519b;
                TLObject tLObject = (TLObject) this.e;
                String str2 = (String) this.f4521f;
                ((ph.d) this.f4520c).setLoading(false);
                org.telegram.ui.ActionBar.g3 g3Var = ((org.telegram.ui.ActionBar.g3[]) this.d)[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                }
                t7.y(i18, false).S();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    qc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str2)), null).k(false);
                    return;
                }
                return;
            case 3:
                LocationController.lambda$fetchLocationAddress$29((Locale) this.f4520c, (Location) this.d, this.f4519b, (Locale) this.e, (LocationController.LocationFetchCallback) this.f4521f);
                return;
            case 4:
                ((MediaDataController) this.f4520c).lambda$removeMultipleStickerSets$110((boolean[]) this.d, (ArrayList) this.e, this.f4519b, (int[]) this.f4521f);
                return;
            case 5:
                ((MessagesController) this.f4520c).lambda$processUpdateArray$403((kf.t) this.d, (ConcurrentHashMap) this.e, (ConcurrentHashMap) this.f4521f, this.f4519b);
                return;
            case 6:
                ((MessagesStorage) this.f4520c).lambda$getSentFile$164((String) this.d, this.f4519b, (Object[]) this.e, (CountDownLatch) this.f4521f);
                return;
            case 7:
                ((MessagesStorage) this.f4520c).lambda$putSentFile$170((String) this.d, (TLObject) this.e, this.f4519b, (String) this.f4521f);
                return;
            case 8:
                ((NotificationCenter) this.f4520c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.e, (ah) this.f4521f, this.f4519b);
                return;
            case 9:
                ((VoIPService) this.f4520c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.f4519b, (String) this.e, (TLRPC.TL_error) this.f4521f);
                return;
            case 10:
                n4 n4Var = (n4) this.f4520c;
                ArrayList arrayList4 = (ArrayList) this.e;
                HashMap hashMap = (HashMap) this.d;
                String str3 = (String) this.f4521f;
                int i19 = this.f4519b;
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList4.size();
                for (int i20 = 0; i20 < size; i20++) {
                    Object obj2 = arrayList4.get(i20);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj2);
                    if (obj2 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj2;
                        obj = obj2;
                        CharSequence C = n4.C(n4Var, n4Var.f36375r0[0].f37685c.B, null, richText, richText, pageBlock, 1000);
                        if (!TextUtils.isEmpty(C)) {
                            lowerCase = C.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        obj = obj2;
                        if (obj instanceof String) {
                            lowerCase = ((String) obj).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i21 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str3, i21);
                            if (indexOf >= 0) {
                                int length = str3.length() + indexOf;
                                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                                    ?? obj3 = new Object();
                                    obj3.f39258a = indexOf;
                                    obj3.f39260c = pageBlock;
                                    obj3.f39259b = obj;
                                    arrayList5.add(obj3);
                                }
                                i21 = length;
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new cg.v1((Object) n4Var, i19, arrayList5, (Serializable) str3, 9));
                return;
            case 11:
                TLObject tLObject2 = (TLObject) this.f4520c;
                int i22 = this.f4519b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f4521f;
                if (tLObject2 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    MessagesController.getInstance(i22).putUsers(updates.users, false);
                    MessagesController.getInstance(i22).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    int i23 = 0;
                    while (i23 < size2) {
                        Object obj4 = findUpdatesAndRemove.get(i23);
                        i23++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj4).call;
                    }
                    if (LaunchActivity.D1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f19176id = groupCall.f19169id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.f2.g(LaunchActivity.D1, i22, tL_inputGroupCall, false, groupCall, hashSet);
                        return;
                    }
                    return;
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    MessagesController.getInstance(i22).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i22).putChats(groupcall.chats, false);
                    if (LaunchActivity.D1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.f19176id = groupCall2.f19169id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.f2.g(LaunchActivity.D1, i22, tL_inputGroupCall2, false, groupCall2, hashSet);
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
                zn.N0((zn) this.f4520c, this.f4519b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f4521f);
                return;
            case 13:
                ln lnVar = (ln) this.f4520c;
                yi yiVar = (yi) this.d;
                yiVar.f47468b = lnVar.f35808a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.e).f19159id, this.f4519b, new gn(lnVar, yiVar, (zn) this.f4521f));
                return;
            case 14:
                ln lnVar2 = (ln) this.f4520c;
                int i24 = this.f4519b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f4521f;
                zn znVar = lnVar2.f35808a;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == znVar.I6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                znVar.Xa(i24, id2, true, i12, true, 0, num, bArr, new xm(lnVar2, messageObject, 1));
                return;
            case 15:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.f4520c;
                int[] iArr = (int[]) this.d;
                int i25 = this.f4519b;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f4521f;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    d2Var.setOnCancelListener(new org.telegram.ui.Components.z1(iArr, runnable, i25));
                    p2Var2.showDialog(d2VarArr[0]);
                    return;
                }
                return;
            case 16:
                int i26 = this.f4519b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f4520c;
                ArrayList arrayList6 = (ArrayList) this.e;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.f4521f;
                if (LaunchActivity.f31587z1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    eg.v0 v0Var = new eg.v0(11, i26, R.getParentActivity(), R, null);
                    v0Var.I1(chat, arrayList6, arrayList7, arrayList8, null);
                    v0Var.show();
                    return;
                }
                return;
            case 17:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.e;
                int i27 = this.f4519b;
                org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) this.f4521f;
                SharedPreferences.Editor edit = ((SharedPreferences) this.f4520c).edit();
                edit.putLong("support_id2", tL_help_support.user.f19306id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    d2Var2.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                ArrayList arrayList9 = new ArrayList();
                arrayList9.add(tL_help_support.user);
                MessagesStorage.getInstance(i27).putUsersAndChats(arrayList9, null, true, true);
                MessagesController.getInstance(i27).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.f19306id);
                p2Var3.presentFragment(new zn(bundle));
                return;
            case 18:
                ds.P((ds) this.f4520c, (TLObject) this.d, (TLRPC.InputPeer) this.e, this.f4519b, (int[]) this.f4521f);
                return;
            case 19:
                yv0 yv0Var = (yv0) this.f4520c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i28 = this.f4519b;
                MessageObject messageObject2 = (MessageObject) this.e;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f4521f;
                int[] iArr2 = yv0Var.e;
                RLottieNative[] rLottieNativeArr = yv0Var.f31177c1;
                if (yv0Var.T0) {
                    AndroidUtilities.runOnUIThread(new wv0(yv0Var, 2));
                    return;
                }
                boolean z18 = false;
                for (int i29 = 0; i29 < rLottieNativeArr.length; i29++) {
                    if (rLottieNativeArr[i29] == null) {
                        if (i29 == 0) {
                            i13 = 1;
                        } else if (i29 == 1) {
                            i13 = 8;
                        } else if (i29 == 2) {
                            i13 = 14;
                        } else if (i29 == 3) {
                            i13 = 20;
                        } else {
                            i13 = 2;
                        }
                        if (i13 < tL_messages_stickerSet.documents.size()) {
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i13);
                            String readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(readRes)) {
                                AndroidUtilities.runOnUIThread(new xv0(document, i28, messageObject2, s1Var, tL_messages_stickerSet, 1));
                                z18 = true;
                            } else {
                                rLottieNativeArr[i29] = RLottieNative.b(readRes, iArr2, null, null);
                                yv0Var.f31178d1[i29] = iArr2[0];
                            }
                        }
                    }
                }
                if (z18) {
                    AndroidUtilities.runOnUIThread(new wv0(yv0Var, 3));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new ey(yv0Var, i28, s1Var, 15));
                    return;
                }
            case 20:
                LaunchActivity launchActivity = (LaunchActivity) this.f4520c;
                TLObject tLObject3 = (TLObject) this.d;
                Uri uri = (Uri) this.e;
                int i30 = this.f4519b;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) this.f4521f;
                Pattern pattern = LaunchActivity.f31586y1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject3 != null && launchActivity.f31612n0 != null) {
                        TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject3;
                        Bundle i31 = android.support.v4.media.a.i("onlySelect", true);
                        i31.putString("importTitle", tL_messages_historyImportParsed.title);
                        i31.putBoolean("allowSwitchAccount", true);
                        if (tL_messages_historyImportParsed.pm) {
                            i31.putInt("dialogsType", 12);
                        } else if (tL_messages_historyImportParsed.group) {
                            i31.putInt("dialogsType", 11);
                        } else {
                            String uri2 = uri.toString();
                            Iterator<String> it = MessagesController.getInstance(i30).exportPrivateUri.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (uri2.contains(it.next())) {
                                        i31.putInt("dialogsType", 12);
                                        z11 = true;
                                    }
                                } else {
                                    z11 = false;
                                }
                            }
                            if (!z11) {
                                Iterator<String> it2 = MessagesController.getInstance(i30).exportGroupUri.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (uri2.contains(it2.next())) {
                                            i31.putInt("dialogsType", 11);
                                            z11 = true;
                                        }
                                    }
                                }
                                if (!z11) {
                                    i31.putInt("dialogsType", 13);
                                }
                            }
                        }
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().f32238s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                            PhotoViewer.t1().G0(false, true);
                        } else if (n4.I() && n4.x().S) {
                            n4.x().o(false, true);
                        }
                        da.x();
                        e60 e60Var = e60.A3;
                        if (e60Var != null) {
                            e60Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.f31612n0.U(true, true);
                            launchActivity.f31616p0.U(true, true);
                        }
                        qy qyVar = new qy(i31);
                        qyVar.f37649z2 = launchActivity;
                        if (!AndroidUtilities.isTablet() ? !(launchActivity.f31612n0.getFragmentStack().size() <= 1 || !(launchActivity.f31612n0.getFragmentStack().get(launchActivity.f31612n0.getFragmentStack().size() - 1) instanceof xg0)) : !(launchActivity.f31614o0.getFragmentStack().isEmpty() || !(launchActivity.f31614o0.getFragmentStack().get(launchActivity.f31614o0.getFragmentStack().size() - 1) instanceof xg0))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        ((ActionBarLayout) launchActivity.O()).S(qyVar, z12, false);
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
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                }
                return;
            case 21:
                TLObject tLObject4 = (TLObject) this.d;
                int i32 = this.f4519b;
                String str4 = (String) this.e;
                w10 w10Var = (w10) this.f4521f;
                org.telegram.ui.ActionBar.p2 p2Var4 = (org.telegram.ui.ActionBar.p2) kf.k0.i(1, ((LaunchActivity) this.f4520c).f31588a0);
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
                        MessagesController.getInstance(i32).putChats(arrayList2, false);
                        MessagesController.getInstance(i32).putUsers(arrayList, false);
                        if (z19 && ((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                            a02 = qc.a0(p2Var4);
                            i14 = R.string.NoFolderFound;
                        } else {
                            ?? saVar = new sa(p2Var4, false);
                            saVar.V = -1;
                            saVar.Z = "";
                            saVar.f24080a0 = new ArrayList();
                            saVar.f24082c0 = "";
                            saVar.f24084e0 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            saVar.f24085f0 = arrayList10;
                            saVar.f24101w0 = -1;
                            saVar.f24104z0 = -5;
                            saVar.U = str4;
                            saVar.W = chatlist_chatlistinvite;
                            arrayList10.clear();
                            if (z19) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                saVar.Z = tL_textWithEntities.text;
                                saVar.f24080a0 = tL_textWithEntities.entities;
                                saVar.f24081b0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                saVar.f24083d0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                saVar.f24083d0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                saVar.f24086g0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                saVar.V = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList11 = p2Var4.getMessagesController().dialogFilters;
                                if (arrayList11 != null) {
                                    int i33 = 0;
                                    while (true) {
                                        if (i33 < arrayList11.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList11.get(i33);
                                            if (dialogFilter.f16649id == saVar.V) {
                                                saVar.Z = dialogFilter.name;
                                                saVar.f24080a0 = dialogFilter.entities;
                                                saVar.f24081b0 = dialogFilter.title_noanimate;
                                            } else {
                                                i33++;
                                            }
                                        }
                                    }
                                }
                            }
                            saVar.S();
                            p2Var4.showDialog(saVar);
                            w10Var.run();
                            return;
                        }
                    } else {
                        a02 = qc.a0(p2Var4);
                        i14 = R.string.NoFolderFound;
                    }
                    w10Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                org.telegram.messenger.y3.s(i14, a02, null);
                break;
            case 22:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f4520c;
                w10 w10Var2 = (w10) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f4521f;
                int i34 = this.f4519b;
                ArrayList arrayList12 = launchActivity2.f31588a0;
                if (!launchActivity2.isFinishing()) {
                    try {
                        w10Var2.run();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    if (tL_error2 == null) {
                        if (launchActivity2.f31612n0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                            TLRPC.Chat chat2 = updates2.chats.get(0);
                            chat2.left = false;
                            chat2.kicked = false;
                            MessagesController.getInstance(i34).putUsers(updates2.users, false);
                            MessagesController.getInstance(i34).putChats(updates2.chats, false);
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chat2.f19159id);
                            if (arrayList12.isEmpty() || MessagesController.getInstance(i34).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.p2) kf.k0.i(1, arrayList12))) {
                                zn znVar2 = new zn(bundle2);
                                NotificationCenter.getInstance(i34).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                                ((ActionBarLayout) launchActivity2.O()).S(znVar2, false, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity2);
                    alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.AppName);
                    if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                        alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.FloodWait);
                    } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                        alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.JoinToGroupErrorFull);
                    } else {
                        alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    launchActivity2.B0(alertDialog$Builder);
                    return;
                }
                return;
            case 23:
                yf0 yf0Var = (yf0) this.f4520c;
                String str5 = (String) this.d;
                String str6 = (String) this.e;
                String str7 = (String) this.f4521f;
                int i35 = this.f4519b;
                ArrayList arrayList13 = new ArrayList();
                b6.h hVar = new b6.h();
                hVar.f1610c = "inapp";
                hVar.f1609b = str5;
                arrayList13.add(hVar.a());
                FileLog.d("LoginBilling querying \"" + str5 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList13, new l3(yf0Var, str5, str6, str7, i35));
                return;
            case 24:
                int i36 = this.f4519b;
                z8 z8Var = (z8) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ((int[]) this.f4520c)[0] = i36;
                z8Var.r(user);
                ((p9) this.f4521f).e(user, z8Var);
                return;
            case 25:
                long[] jArr = (long[]) this.f4520c;
                int i37 = this.f4519b;
                p9 p9Var = (p9) this.d;
                p9 p9Var2 = (p9) this.e;
                TextView textView = (TextView) this.f4521f;
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i37).getUser(Long.valueOf(jArr[0]));
                    z8 z8Var2 = new z8((f6) null);
                    z8Var2.r(user2);
                    p9Var.e(user2, z8Var2);
                } else {
                    TLRPC.Chat chat3 = MessagesController.getInstance(i37).getChat(Long.valueOf(-jArr[0]));
                    z8 z8Var3 = new z8((f6) null);
                    z8Var3.q(chat3);
                    p9Var.e(chat3, z8Var3);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user3 = MessagesController.getInstance(i37).getUser(Long.valueOf(jArr[0]));
                    if (p9Var2 != null) {
                        z8 z8Var4 = new z8((f6) null);
                        z8Var4.r(user3);
                        p9Var2.e(user3, z8Var4);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user3));
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat4 = MessagesController.getInstance(i37).getChat(Long.valueOf(-jArr[0]));
                if (p9Var2 != null) {
                    z8 z8Var5 = new z8((f6) null);
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
            case 26:
                boolean[] zArr = (boolean[]) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                int i38 = this.f4519b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f4521f;
                if (!(((TLObject) this.f4520c) instanceof TLRPC.TL_boolTrue)) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        callback.run("SERVER_ERROR");
                        return;
                    }
                    return;
                }
                TLRPC.User currentUser = UserConfig.getInstance(i38).getCurrentUser();
                if (currentUser != null) {
                    currentUser.emoji_status = updateemojistatus.emoji_status;
                    z13 = true;
                    NotificationCenter.getInstance(i38).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
                    MessagesController.getInstance(i38).updateEmojiStatusUntilUpdate(currentUser.f19306id, currentUser.emoji_status);
                } else {
                    z13 = true;
                }
                if (!zArr[0]) {
                    zArr[0] = z13;
                    callback.run(null);
                    return;
                }
                return;
            case 27:
                final tf.z zVar = (tf.z) this.f4520c;
                int i39 = this.f4519b;
                ArrayList arrayList14 = (ArrayList) this.e;
                ArrayList arrayList15 = (ArrayList) this.d;
                ArrayList<TLRPC.User> arrayList16 = (ArrayList) this.f4521f;
                tf.s sVar = zVar.f44961g0;
                ArrayList arrayList17 = zVar.f44975s0;
                int i40 = zVar.f44970p0;
                zVar.A0--;
                if (i39 == zVar.f44953a0) {
                    zVar.f44956c0 = i39;
                    if (zVar.f44954b0 != i39) {
                        sVar.b();
                    }
                    if (zVar.f44957d0 != i39) {
                        zVar.F.clear();
                    }
                    zVar.K = true;
                    int i41 = 0;
                    while (i41 < arrayList14.size()) {
                        if (!zVar.F(arrayList14.get(i41))) {
                            arrayList14.remove(i41);
                            i41--;
                        }
                        i41++;
                    }
                    int size3 = arrayList17.size();
                    int i42 = 0;
                    while (i42 < arrayList14.size()) {
                        final Object obj5 = arrayList14.get(i42);
                        if (obj5 instanceof TLRPC.User) {
                            TLRPC.User user4 = (TLRPC.User) obj5;
                            j10 = 0;
                            MessagesController.getInstance(i40).putUser(user4, z16);
                            j11 = user4.f19306id;
                        } else {
                            j10 = 0;
                            if (obj5 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat5 = (TLRPC.Chat) obj5;
                                MessagesController.getInstance(i40).putChat(chat5, z16);
                                j11 = -chat5.f19159id;
                            } else {
                                if (obj5 instanceof TLRPC.EncryptedChat) {
                                    MessagesController.getInstance(i40).putEncryptedChat((TLRPC.EncryptedChat) obj5, z16);
                                }
                                j11 = 0;
                            }
                        }
                        if (j11 != j10 && ((TLRPC.Dialog) MessagesController.getInstance(i40).dialogs_dict.f(j11)) == null) {
                            MessagesStorage.getInstance(i40).getDialogFolderId(j11, new MessagesStorage.IntCallback() {
                                @Override
                                public final void run(int i43) {
                                    int i44 = z.this.f44970p0;
                                    if (i43 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j13 = j11;
                                        tL_dialog.f19163id = j13;
                                        if (i43 != 0) {
                                            tL_dialog.folder_id = i43;
                                        }
                                        Object obj6 = obj5;
                                        if (obj6 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj6) ? 1 : 0;
                                        }
                                        MessagesController.getInstance(i44).dialogs_dict.k(tL_dialog, j13);
                                        MessagesController.getInstance(i44).getAllDialogs().add(tL_dialog);
                                        MessagesController.getInstance(i44).sortDialogs(null);
                                    }
                                }
                            });
                        }
                        if (zVar.S() && !(obj5 instanceof TLRPC.EncryptedChat)) {
                            cy cyVar = zVar.R;
                            if (cyVar != null && cyVar.a() == j11) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            for (int i43 = 0; !z15 && i43 < size3; i43++) {
                                tf.y yVar = (tf.y) arrayList17.get(i43);
                                boolean z20 = z15;
                                if (yVar != null && yVar.f44944c == j11) {
                                    z15 = true;
                                } else {
                                    z15 = z20;
                                }
                            }
                            if (z15) {
                                arrayList14.remove(i42);
                                arrayList15.remove(i42);
                                i42--;
                            }
                        }
                        i42++;
                        z16 = true;
                    }
                    MessagesController.getInstance(i40).putUsers(arrayList16, true);
                    zVar.f44974s = arrayList14;
                    zVar.D = arrayList15;
                    sVar.f(arrayList14, arrayList17);
                    zVar.l();
                    cy cyVar2 = zVar.R;
                    if (cyVar2 != null) {
                        if (zVar.A0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        cyVar2.d(z14, true);
                        zVar.R.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                tf.c1 c1Var = (tf.c1) this.f4520c;
                int i44 = this.f4519b;
                ArrayList arrayList18 = (ArrayList) this.e;
                ArrayList arrayList19 = (ArrayList) this.d;
                ArrayList arrayList20 = (ArrayList) this.f4521f;
                if (i44 == c1Var.B) {
                    c1Var.d = arrayList18;
                    c1Var.e = arrayList19;
                    c1Var.E = arrayList20;
                    c1Var.f44742f.f(arrayList18, null);
                    c1Var.f44748y = false;
                    c1Var.l();
                    c1Var.F();
                    return;
                }
                return;
        }
    }

    public f3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f4518a = i11;
        this.f4520c = obj;
        this.f4519b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f4521f = obj4;
    }

    public f3(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.f4518a = i11;
        this.f4520c = obj;
        this.d = obj2;
        this.f4519b = i10;
        this.e = obj3;
        this.f4521f = obj4;
    }

    public f3(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f4518a = i11;
        this.f4520c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f4519b = i10;
        this.f4521f = obj4;
    }

    public f3(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f4518a = i11;
        this.f4520c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f4521f = obj4;
        this.f4519b = i10;
    }

    public f3(n4 n4Var, ArrayList arrayList, HashMap hashMap, String str, int i10) {
        this.f4518a = 10;
        this.f4520c = n4Var;
        this.e = arrayList;
        this.d = hashMap;
        this.f4521f = str;
        this.f4519b = i10;
    }

    public f3(ql0 ql0Var, int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i11) {
        this.f4518a = i11;
        this.f4520c = ql0Var;
        this.f4519b = i10;
        this.e = arrayList;
        this.d = arrayList2;
        this.f4521f = arrayList3;
    }
}
