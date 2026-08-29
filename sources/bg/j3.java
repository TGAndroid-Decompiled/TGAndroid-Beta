package bg;

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
import jh.s7;
import nh.gb;
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
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.xg;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.an;
import org.telegram.ui.fi1;
import org.telegram.ui.fn;
import org.telegram.ui.fy;
import org.telegram.ui.m4;
import org.telegram.ui.mq0;
import org.telegram.ui.ng0;
import org.telegram.ui.of0;
import org.telegram.ui.qm;
import org.telegram.ui.qx;
import org.telegram.ui.r50;
import org.telegram.ui.ri;
import org.telegram.ui.tn;
import org.telegram.ui.x60;
import org.telegram.ui.xx0;
public final class j3 implements Runnable {
    public final int f2337a;
    public final int f2338b;
    public final Object f2339c;
    public final Object d;
    public final Object f2340e;
    public final Object f2341f;

    public j3(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f2337a = 16;
        this.f2338b = i10;
        this.f2339c = chat;
        this.f2340e = arrayList;
        this.d = arrayList2;
        this.f2341f = arrayList3;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        m4 m4Var;
        int i12;
        Object obj;
        String lowerCase;
        int i13;
        org.telegram.ui.ActionBar.o2 R;
        int i14;
        boolean z12;
        boolean z13;
        tc a02;
        int i15;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        boolean z14;
        boolean z15;
        long j10;
        final long j11;
        boolean z16;
        String str = "";
        boolean z17 = true;
        switch (this.f2337a) {
            case 0:
                u3 u3Var = (u3) this.f2339c;
                int i16 = this.f2338b;
                List list = (List) this.d;
                ArrayList arrayList3 = (ArrayList) this.f2340e;
                mq0 mq0Var = (mq0) this.f2341f;
                if (u3Var.E != null && !u3Var.f2572y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / u3Var.E.getWidth(), 1.0f / u3Var.E.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i16);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i16 / 90) % 2 != 0) {
                        matrix.postScale(u3Var.E.getHeight(), u3Var.E.getWidth());
                    } else {
                        matrix.postScale(u3Var.E.getWidth(), u3Var.E.getHeight());
                    }
                    if (list.isEmpty()) {
                        r3 r3Var = new r3(u3Var);
                        r3Var.h.set(0.0f, 0.0f, u3Var.E.getWidth(), u3Var.E.getHeight());
                        r3Var.f2483i.set(r3Var.h);
                        matrix.mapRect(r3Var.f2483i);
                        r3Var.f2479c = i16;
                        Bitmap d = u3Var.d(u3Var.E, 0, 0, false);
                        r3Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        r3Var.f2481f = r3Var.c();
                        u3.c(r3Var, u3Var.P, u3Var.Q);
                        u3Var.K = r3Var.f2484j;
                        u3Var.L = r3Var.f2485k;
                        arrayList3.add(r3Var);
                        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(u3Var, arrayList3, mq0Var, r3Var, 1));
                        u3Var.A = r3Var;
                        u3Var.f2572y = true;
                        u3Var.f2571x = false;
                        return;
                    }
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        t3 t3Var = (t3) list.get(i17);
                        r3 r3Var2 = new r3(u3Var);
                        r3Var2.h.set(t3Var.f2534b, t3Var.f2535c, i10 + t3Var.d, i11 + t3Var.f2536e);
                        r3Var2.f2483i.set(r3Var2.h);
                        matrix.mapRect(r3Var2.f2483i);
                        r3Var2.f2479c = i16;
                        Bitmap d10 = u3Var.d(t3Var.f2533a, t3Var.f2534b, t3Var.f2535c, false);
                        r3Var2.d = d10;
                        if (d10 != null) {
                            r3Var2.f2481f = r3Var2.c();
                            u3.c(r3Var2, u3Var.P, u3Var.Q);
                            u3Var.K = r3Var2.f2484j;
                            u3Var.L = r3Var2.f2485k;
                            arrayList3.add(r3Var2);
                        }
                    }
                    u3Var.A = null;
                    u3Var.f2572y = true;
                    u3Var.f2571x = false;
                    AndroidUtilities.runOnUIThread(new a1.e(13, u3Var, arrayList3));
                    return;
                }
                return;
            case 1:
                ih.h2 h2Var = (ih.h2) this.f2339c;
                Context context = (Context) this.d;
                int i18 = this.f2338b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f2340e;
                long j12 = h2Var.Y;
                ih.y0 y0Var = new ih.y0(h2Var, (Utilities.Callback) this.f2341f, 2);
                boolean z18 = starGift.limited;
                if (z18 && (disallowedGiftsSettings2 = h2Var.X) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z18 && (disallowedGiftsSettings = h2Var.X) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                new ih.j1(h2Var, context, i18, starGift, j12, y0Var, z10, z11).show();
                return;
            case 2:
                int i19 = this.f2338b;
                TLObject tLObject = (TLObject) this.f2340e;
                String str2 = (String) this.f2341f;
                ((nh.d) this.f2339c).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) this.d)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                s7.y(i19, false).S();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    tc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str2)), null).k(false);
                    return;
                }
                return;
            case 3:
                LocationController.lambda$fetchLocationAddress$29((Locale) this.f2339c, (Location) this.d, this.f2338b, (Locale) this.f2340e, (LocationController.LocationFetchCallback) this.f2341f);
                return;
            case 4:
                ((MediaDataController) this.f2339c).lambda$removeMultipleStickerSets$110((boolean[]) this.d, (ArrayList) this.f2340e, this.f2338b, (int[]) this.f2341f);
                return;
            case 5:
                ((MessagesController) this.f2339c).lambda$processUpdateArray$403((jf.t) this.d, (ConcurrentHashMap) this.f2340e, (ConcurrentHashMap) this.f2341f, this.f2338b);
                return;
            case 6:
                ((MessagesStorage) this.f2339c).lambda$getSentFile$164((String) this.d, this.f2338b, (Object[]) this.f2340e, (CountDownLatch) this.f2341f);
                return;
            case 7:
                ((MessagesStorage) this.f2339c).lambda$putSentFile$170((String) this.d, (TLObject) this.f2340e, this.f2338b, (String) this.f2341f);
                return;
            case 8:
                ((NotificationCenter) this.f2339c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.f2340e, (xg) this.f2341f, this.f2338b);
                return;
            case 9:
                ((VoIPService) this.f2339c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.f2338b, (String) this.f2340e, (TLRPC.TL_error) this.f2341f);
                return;
            case 10:
                m4 m4Var2 = (m4) this.f2339c;
                ArrayList arrayList4 = (ArrayList) this.f2340e;
                HashMap hashMap = (HashMap) this.d;
                String str3 = (String) this.f2341f;
                int i20 = this.f2338b;
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList4.size();
                int i21 = 0;
                while (i21 < size) {
                    Object obj2 = arrayList4.get(i21);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj2);
                    if (obj2 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj2;
                        int i22 = i21;
                        m4Var = m4Var2;
                        i12 = i22;
                        obj = obj2;
                        CharSequence C = m4.C(m4Var, m4Var2.f40404q0[0].f41514c.A, null, richText, richText, pageBlock, 1000);
                        if (!TextUtils.isEmpty(C)) {
                            lowerCase = C.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        int i23 = i21;
                        m4Var = m4Var2;
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
                                    obj3.f43410a = indexOf;
                                    obj3.f43412c = pageBlock;
                                    obj3.f43411b = obj;
                                    arrayList5.add(obj3);
                                }
                                i24 = length;
                            }
                        }
                    }
                    m4 m4Var3 = m4Var;
                    i21 = i12 + 1;
                    m4Var2 = m4Var3;
                }
                AndroidUtilities.runOnUIThread(new ag.z1((Object) m4Var2, i20, arrayList5, (Serializable) str3, 9));
                return;
            case 11:
                TLObject tLObject2 = (TLObject) this.f2339c;
                int i25 = this.f2338b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f2340e;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f2341f;
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
                    if (LaunchActivity.C1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f22409id = groupCall.f22402id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.h2.h(LaunchActivity.C1, i25, tL_inputGroupCall, false, groupCall, hashSet);
                        return;
                    }
                    return;
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    MessagesController.getInstance(i25).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i25).putChats(groupcall.chats, false);
                    if (LaunchActivity.C1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.f22409id = groupCall2.f22402id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.h2.h(LaunchActivity.C1, i25, tL_inputGroupCall2, false, groupCall2, hashSet);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    tc.a0(o2Var).d0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 12:
                tn.N0((tn) this.f2339c, this.f2338b, (Boolean) this.d, (TLRPC.WebPage) this.f2340e, (TL_account.getWebPagePreview) this.f2341f);
                return;
            case 13:
                fn fnVar = (fn) this.f2339c;
                ri riVar = (ri) this.d;
                riVar.f50515b = fnVar.f38212a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.f2340e).f22392id, this.f2338b, new an(fnVar, riVar, (tn) this.f2341f));
                return;
            case 14:
                fn fnVar2 = (fn) this.f2339c;
                int i27 = this.f2338b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.f2340e;
                byte[] bArr = (byte[]) this.f2341f;
                tn tnVar = fnVar2.f38212a;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == tnVar.H6) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                tnVar.Xa(i27, id2, true, i13, true, 0, num, bArr, new qm(fnVar2, messageObject, 1));
                return;
            case 15:
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.f2339c;
                int[] iArr = (int[]) this.d;
                int i28 = this.f2338b;
                Runnable runnable = (Runnable) this.f2340e;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f2341f;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    c2Var.setOnCancelListener(new org.telegram.ui.Components.b2(iArr, runnable, i28));
                    o2Var2.showDialog(c2VarArr[0]);
                    return;
                }
                return;
            case 16:
                int i29 = this.f2338b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f2339c;
                ArrayList arrayList6 = (ArrayList) this.f2340e;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.f2341f;
                if (LaunchActivity.f35561y1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    cg.v0 v0Var = new cg.v0(11, i29, R.getParentActivity(), R, null);
                    v0Var.I1(chat, arrayList6, arrayList7, arrayList8, null);
                    v0Var.show();
                    return;
                }
                return;
            case 17:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.f2340e;
                int i30 = this.f2338b;
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) this.f2341f;
                SharedPreferences.Editor edit = ((SharedPreferences) this.f2339c).edit();
                edit.putLong("support_id2", tL_help_support.user.f22539id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    c2Var2.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                ArrayList arrayList9 = new ArrayList();
                arrayList9.add(tL_help_support.user);
                MessagesStorage.getInstance(i30).putUsersAndChats(arrayList9, null, true, true);
                MessagesController.getInstance(i30).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.f22539id);
                o2Var3.presentFragment(new tn(bundle));
                return;
            case 18:
                as.P((as) this.f2339c, (TLObject) this.d, (TLRPC.InputPeer) this.f2340e, this.f2338b, (int[]) this.f2341f);
                return;
            case 19:
                pv0 pv0Var = (pv0) this.f2339c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i31 = this.f2338b;
                MessageObject messageObject2 = (MessageObject) this.f2340e;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f2341f;
                int[] iArr2 = pv0Var.f34737e;
                RLottieNative[] rLottieNativeArr = pv0Var.f31789b1;
                if (pv0Var.S0) {
                    AndroidUtilities.runOnUIThread(new nv0(pv0Var, 2));
                    return;
                }
                boolean z19 = false;
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
                                AndroidUtilities.runOnUIThread(new ov0(document, i31, messageObject2, s1Var, tL_messages_stickerSet, 1));
                                z19 = true;
                            } else {
                                rLottieNativeArr[i32] = RLottieNative.b(readRes, "dice", iArr2, null, null);
                                pv0Var.f31790c1[i32] = iArr2[0];
                            }
                        }
                    }
                }
                if (z19) {
                    AndroidUtilities.runOnUIThread(new nv0(pv0Var, 3));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new rm(pv0Var, i31, s1Var, 17));
                    return;
                }
            case 20:
                LaunchActivity launchActivity = (LaunchActivity) this.f2339c;
                TLObject tLObject3 = (TLObject) this.d;
                Uri uri = (Uri) this.f2340e;
                int i33 = this.f2338b;
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) this.f2341f;
                Pattern pattern = LaunchActivity.f35560x1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject3 != null && launchActivity.m0 != null) {
                        TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject3;
                        Bundle i34 = a4.w.i("onlySelect", true);
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
                                        z12 = true;
                                    }
                                } else {
                                    z12 = false;
                                }
                            }
                            if (!z12) {
                                Iterator<String> it2 = MessagesController.getInstance(i33).exportGroupUri.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (uri2.contains(it2.next())) {
                                            i34.putInt("dialogsType", 11);
                                            z12 = true;
                                        }
                                    }
                                }
                                if (!z12) {
                                    i34.putInt("dialogsType", 13);
                                }
                            }
                        }
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().f36222s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                            PhotoViewer.t1().G0(false, true);
                        } else if (m4.I() && m4.x().R) {
                            m4.x().o(false, true);
                        }
                        gb.x();
                        r50 r50Var = r50.f41867z3;
                        if (r50Var != null) {
                            r50Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.m0.U(true, true);
                            launchActivity.f35589o0.U(true, true);
                        }
                        fy fyVar = new fy(i34);
                        fyVar.f38379y2 = launchActivity;
                        if (!AndroidUtilities.isTablet() ? !(launchActivity.m0.getFragmentStack().size() <= 1 || !(launchActivity.m0.getFragmentStack().get(launchActivity.m0.getFragmentStack().size() - 1) instanceof ng0)) : !(launchActivity.f35587n0.getFragmentStack().isEmpty() || !(launchActivity.f35587n0.getFragmentStack().get(launchActivity.f35587n0.getFragmentStack().size() - 1) instanceof ng0))) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        ((ActionBarLayout) launchActivity.O()).S(fyVar, z13, false);
                    } else {
                        if (launchActivity.S == null) {
                            launchActivity.S = new ArrayList();
                        }
                        launchActivity.S.add(0, launchActivity.T);
                        launchActivity.T = null;
                        launchActivity.i0(true);
                    }
                    try {
                        c2Var3.dismiss();
                        return;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        return;
                    }
                }
                return;
            case 21:
                TLObject tLObject4 = (TLObject) this.d;
                int i35 = this.f2338b;
                String str4 = (String) this.f2340e;
                x60 x60Var = (x60) this.f2341f;
                org.telegram.ui.ActionBar.o2 o2Var4 = (org.telegram.ui.ActionBar.o2) j7.l1.i(1, ((LaunchActivity) this.f2339c).Z);
                try {
                    if (tLObject4 instanceof TL_chatlists.chatlist_ChatlistInvite) {
                        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject4;
                        boolean z20 = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
                        if (z20) {
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
                        if (z20 && ((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                            a02 = tc.a0(o2Var4);
                            i15 = R.string.NoFolderFound;
                        } else {
                            ?? xaVar = new xa(o2Var4, false);
                            xaVar.U = -1;
                            xaVar.Y = "";
                            xaVar.Z = new ArrayList();
                            xaVar.f34865b0 = "";
                            xaVar.f34867d0 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            xaVar.f34868e0 = arrayList10;
                            xaVar.f34884v0 = -1;
                            xaVar.f34887y0 = -5;
                            xaVar.T = str4;
                            xaVar.V = chatlist_chatlistinvite;
                            arrayList10.clear();
                            if (z20) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                xaVar.Y = tL_textWithEntities.text;
                                xaVar.Z = tL_textWithEntities.entities;
                                xaVar.f34864a0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                xaVar.f34866c0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                xaVar.f34866c0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                xaVar.f34869f0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                xaVar.U = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList11 = o2Var4.getMessagesController().dialogFilters;
                                if (arrayList11 != null) {
                                    int i36 = 0;
                                    while (true) {
                                        if (i36 < arrayList11.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList11.get(i36);
                                            if (dialogFilter.f19620id == xaVar.U) {
                                                xaVar.Y = dialogFilter.name;
                                                xaVar.Z = dialogFilter.entities;
                                                xaVar.f34864a0 = dialogFilter.title_noanimate;
                                            } else {
                                                i36++;
                                            }
                                        }
                                    }
                                }
                            }
                            xaVar.S();
                            o2Var4.showDialog(xaVar);
                            x60Var.run();
                            return;
                        }
                    } else {
                        a02 = tc.a0(o2Var4);
                        i15 = R.string.NoFolderFound;
                    }
                    x60Var.run();
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
                org.telegram.messenger.x3.s(i15, a02, null);
                break;
            case 22:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f2339c;
                x60 x60Var2 = (x60) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f2340e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f2341f;
                int i37 = this.f2338b;
                ArrayList arrayList12 = launchActivity2.Z;
                if (!launchActivity2.isFinishing()) {
                    try {
                        x60Var2.run();
                    } catch (Exception e13) {
                        FileLog.e(e13);
                    }
                    if (tL_error2 == null) {
                        if (launchActivity2.m0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                            TLRPC.Chat chat2 = updates2.chats.get(0);
                            chat2.left = false;
                            chat2.kicked = false;
                            MessagesController.getInstance(i37).putUsers(updates2.users, false);
                            MessagesController.getInstance(i37).putChats(updates2.chats, false);
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chat2.f22392id);
                            if (arrayList12.isEmpty() || MessagesController.getInstance(i37).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.o2) j7.l1.i(1, arrayList12))) {
                                tn tnVar2 = new tn(bundle2);
                                NotificationCenter.getInstance(i37).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                                ((ActionBarLayout) launchActivity2.O()).S(tnVar2, false, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity2);
                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AppName);
                    if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.FloodWait);
                    } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.JoinToGroupErrorFull);
                    } else {
                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    launchActivity2.B0(alertDialog$Builder);
                    return;
                }
                return;
            case 23:
                of0 of0Var = (of0) this.f2339c;
                String str5 = (String) this.d;
                String str6 = (String) this.f2340e;
                String str7 = (String) this.f2341f;
                int i38 = this.f2338b;
                ArrayList arrayList13 = new ArrayList();
                d9.c cVar = new d9.c();
                cVar.f5537c = "inapp";
                cVar.f5536b = str5;
                arrayList13.add(cVar.a());
                FileLog.d("LoginBilling querying \"" + str5 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList13, new p3(of0Var, str5, str6, str7, i38));
                return;
            case 24:
                int i39 = this.f2338b;
                e9 e9Var = (e9) this.d;
                TLRPC.User user = (TLRPC.User) this.f2340e;
                ((int[]) this.f2339c)[0] = i39;
                e9Var.r(user);
                ((t9) this.f2341f).e(user, e9Var);
                return;
            case 25:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f2339c;
                int i40 = this.f2338b;
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.f2340e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f2341f;
                if (((TLObject) this.d) instanceof TLRPC.TL_boolTrue) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.z0.u(i40, w0Var, "write_access_requested", jSONObject);
                        return;
                    } catch (Exception e14) {
                        FileLog.e(e14);
                        return;
                    }
                } else if (tL_error3 != null) {
                    z0Var.S(tL_error3.text);
                    return;
                } else {
                    String[] strArr = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(z0Var.getContext());
                    alertDialog$Builder2.f22714a.N = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder2.f22714a.P = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new fi1(2, z0Var, strArr));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new xx0(6));
                    z0Var.R(3, alertDialog$Builder2.f22714a, new org.telegram.ui.web.x(strArr, i40, w0Var, 1));
                    return;
                }
            case 26:
                long[] jArr = (long[]) this.f2339c;
                int i41 = this.f2338b;
                t9 t9Var = (t9) this.d;
                t9 t9Var2 = (t9) this.f2340e;
                TextView textView = (TextView) this.f2341f;
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i41).getUser(Long.valueOf(jArr[0]));
                    e9 e9Var2 = new e9((c6) null);
                    e9Var2.r(user2);
                    t9Var.e(user2, e9Var2);
                } else {
                    TLRPC.Chat chat3 = MessagesController.getInstance(i41).getChat(Long.valueOf(-jArr[0]));
                    e9 e9Var3 = new e9((c6) null);
                    e9Var3.q(chat3);
                    t9Var.e(chat3, e9Var3);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user3 = MessagesController.getInstance(i41).getUser(Long.valueOf(jArr[0]));
                    if (t9Var2 != null) {
                        e9 e9Var4 = new e9((c6) null);
                        e9Var4.r(user3);
                        t9Var2.e(user3, e9Var4);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user3));
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat4 = MessagesController.getInstance(i41).getChat(Long.valueOf(-jArr[0]));
                if (t9Var2 != null) {
                    e9 e9Var5 = new e9((c6) null);
                    e9Var5.q(chat4);
                    t9Var2.e(chat4, e9Var5);
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
                Utilities.Callback callback = (Utilities.Callback) this.f2340e;
                int i42 = this.f2338b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f2341f;
                if (!(((TLObject) this.f2339c) instanceof TLRPC.TL_boolTrue)) {
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
                    z14 = true;
                    NotificationCenter.getInstance(i42).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
                    MessagesController.getInstance(i42).updateEmojiStatusUntilUpdate(currentUser.f22539id, currentUser.emoji_status);
                } else {
                    z14 = true;
                }
                if (!zArr[0]) {
                    zArr[0] = z14;
                    callback.run(null);
                    return;
                }
                return;
            case 28:
                final rf.a0 a0Var = (rf.a0) this.f2339c;
                int i43 = this.f2338b;
                ArrayList arrayList14 = (ArrayList) this.f2340e;
                ArrayList arrayList15 = (ArrayList) this.d;
                ArrayList<TLRPC.User> arrayList16 = (ArrayList) this.f2341f;
                rf.t tVar = a0Var.f47146f0;
                ArrayList arrayList17 = a0Var.f47159r0;
                int i44 = a0Var.f47155o0;
                a0Var.f47171z0--;
                if (i43 == a0Var.Z) {
                    a0Var.f47139b0 = i43;
                    if (a0Var.f47138a0 != i43) {
                        tVar.b();
                    }
                    if (a0Var.f47141c0 != i43) {
                        a0Var.E.clear();
                    }
                    a0Var.J = true;
                    int i45 = 0;
                    while (i45 < arrayList14.size()) {
                        if (!a0Var.F(arrayList14.get(i45))) {
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
                            MessagesController.getInstance(i44).putUser(user4, z17);
                            j11 = user4.f22539id;
                        } else {
                            j10 = 0;
                            if (obj5 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat5 = (TLRPC.Chat) obj5;
                                MessagesController.getInstance(i44).putChat(chat5, z17);
                                j11 = -chat5.f22392id;
                            } else {
                                if (obj5 instanceof TLRPC.EncryptedChat) {
                                    MessagesController.getInstance(i44).putEncryptedChat((TLRPC.EncryptedChat) obj5, z17);
                                }
                                j11 = 0;
                            }
                        }
                        if (j11 != j10 && ((TLRPC.Dialog) MessagesController.getInstance(i44).dialogs_dict.f(j11)) == null) {
                            MessagesStorage.getInstance(i44).getDialogFolderId(j11, new MessagesStorage.IntCallback() {
                                @Override
                                public final void run(int i47) {
                                    int i48 = a0.this.f47155o0;
                                    if (i47 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j13 = j11;
                                        tL_dialog.f22396id = j13;
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
                        if (a0Var.S() && !(obj5 instanceof TLRPC.EncryptedChat)) {
                            qx qxVar = a0Var.Q;
                            if (qxVar != null && qxVar.a() == j11) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            for (int i47 = 0; !z16 && i47 < size3; i47++) {
                                rf.z zVar = (rf.z) arrayList17.get(i47);
                                boolean z21 = z16;
                                if (zVar != null && zVar.f47410c == j11) {
                                    z16 = true;
                                } else {
                                    z16 = z21;
                                }
                            }
                            if (z16) {
                                arrayList14.remove(i46);
                                arrayList15.remove(i46);
                                i46--;
                            }
                        }
                        i46++;
                        z17 = true;
                    }
                    MessagesController.getInstance(i44).putUsers(arrayList16, true);
                    a0Var.f47160s = arrayList14;
                    a0Var.C = arrayList15;
                    tVar.f(arrayList14, arrayList17);
                    a0Var.l();
                    qx qxVar2 = a0Var.Q;
                    if (qxVar2 != null) {
                        if (a0Var.f47171z0 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        qxVar2.d(z15, true);
                        a0Var.Q.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                rf.d1 d1Var = (rf.d1) this.f2339c;
                int i48 = this.f2338b;
                ArrayList arrayList18 = (ArrayList) this.f2340e;
                ArrayList arrayList19 = (ArrayList) this.d;
                ArrayList arrayList20 = (ArrayList) this.f2341f;
                if (i48 == d1Var.A) {
                    d1Var.d = arrayList18;
                    d1Var.f47194e = arrayList19;
                    d1Var.D = arrayList20;
                    d1Var.f47195f.f(arrayList18, null);
                    d1Var.f47201y = false;
                    d1Var.l();
                    d1Var.F();
                    return;
                }
                return;
        }
    }

    public j3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f2337a = i11;
        this.f2339c = obj;
        this.f2338b = i10;
        this.d = obj2;
        this.f2340e = obj3;
        this.f2341f = obj4;
    }

    public j3(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.f2337a = i11;
        this.f2339c = obj;
        this.d = obj2;
        this.f2338b = i10;
        this.f2340e = obj3;
        this.f2341f = obj4;
    }

    public j3(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f2337a = i11;
        this.f2339c = obj;
        this.d = obj2;
        this.f2340e = obj3;
        this.f2338b = i10;
        this.f2341f = obj4;
    }

    public j3(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f2337a = i11;
        this.f2339c = obj;
        this.d = obj2;
        this.f2340e = obj3;
        this.f2341f = obj4;
        this.f2338b = i10;
    }

    public j3(m4 m4Var, ArrayList arrayList, HashMap hashMap, String str, int i10) {
        this.f2337a = 10;
        this.f2339c = m4Var;
        this.f2340e = arrayList;
        this.d = hashMap;
        this.f2341f = str;
        this.f2338b = i10;
    }

    public j3(il0 il0Var, int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i11) {
        this.f2337a = i11;
        this.f2339c = il0Var;
        this.f2338b = i10;
        this.f2340e = arrayList;
        this.d = arrayList2;
        this.f2341f = arrayList3;
    }
}
