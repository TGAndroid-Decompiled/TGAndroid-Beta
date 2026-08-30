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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.ey;
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
import org.telegram.ui.al0;
import org.telegram.ui.c60;
import org.telegram.ui.en;
import org.telegram.ui.g00;
import org.telegram.ui.jn;
import org.telegram.ui.l4;
import org.telegram.ui.oy;
import org.telegram.ui.sq0;
import org.telegram.ui.vg0;
import org.telegram.ui.vm;
import org.telegram.ui.wf0;
import org.telegram.ui.wi;
import org.telegram.ui.xn;
import org.telegram.ui.zx;
import ph.da;
public final class f3 implements Runnable {
    public final int f4512a;
    public final int f4513b;
    public final Object f4514c;
    public final Object d;
    public final Object e;
    public final Object f4515f;

    public f3(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f4512a = 16;
        this.f4513b = i10;
        this.f4514c = chat;
        this.e = arrayList;
        this.d = arrayList2;
        this.f4515f = arrayList3;
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
        switch (this.f4512a) {
            case 0:
                q3 q3Var = (q3) this.f4514c;
                int i16 = this.f4513b;
                List list = (List) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                sq0 sq0Var = (sq0) this.f4515f;
                if (q3Var.F != null && !q3Var.f4760y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / q3Var.F.getWidth(), 1.0f / q3Var.F.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i16);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i16 / 90) % 2 != 0) {
                        matrix.postScale(q3Var.F.getHeight(), q3Var.F.getWidth());
                    } else {
                        matrix.postScale(q3Var.F.getWidth(), q3Var.F.getHeight());
                    }
                    if (list.isEmpty()) {
                        n3 n3Var = new n3(q3Var);
                        n3Var.h.set(0.0f, 0.0f, q3Var.F.getWidth(), q3Var.F.getHeight());
                        n3Var.f4673i.set(n3Var.h);
                        matrix.mapRect(n3Var.f4673i);
                        n3Var.f4670c = i16;
                        Bitmap d = q3Var.d(q3Var.F, 0, 0, false);
                        n3Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        n3Var.f4671f = n3Var.c();
                        q3.c(n3Var, q3Var.Q, q3Var.R);
                        q3Var.L = n3Var.f4674j;
                        q3Var.M = n3Var.f4675k;
                        arrayList3.add(n3Var);
                        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(q3Var, arrayList3, sq0Var, n3Var, 2));
                        q3Var.B = n3Var;
                        q3Var.f4760y = true;
                        q3Var.f4759x = false;
                        return;
                    }
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        p3 p3Var = (p3) list.get(i17);
                        n3 n3Var2 = new n3(q3Var);
                        n3Var2.h.set(p3Var.f4721b, p3Var.f4722c, i10 + p3Var.d, i11 + p3Var.e);
                        n3Var2.f4673i.set(n3Var2.h);
                        matrix.mapRect(n3Var2.f4673i);
                        n3Var2.f4670c = i16;
                        Bitmap d10 = q3Var.d(p3Var.f4720a, p3Var.f4721b, p3Var.f4722c, false);
                        n3Var2.d = d10;
                        if (d10 != null) {
                            n3Var2.f4671f = n3Var2.c();
                            q3.c(n3Var2, q3Var.Q, q3Var.R);
                            q3Var.L = n3Var2.f4674j;
                            q3Var.M = n3Var2.f4675k;
                            arrayList3.add(n3Var2);
                        }
                    }
                    q3Var.B = null;
                    q3Var.f4760y = true;
                    q3Var.f4759x = false;
                    AndroidUtilities.runOnUIThread(new a1.e(19, q3Var, arrayList3));
                    return;
                }
                return;
            case 1:
                kh.h2 h2Var = (kh.h2) this.f4514c;
                Context context = (Context) this.d;
                int i18 = this.f4513b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                long j12 = h2Var.Z;
                kh.x0 x0Var = new kh.x0(h2Var, (Utilities.Callback) this.f4515f, 2);
                boolean z17 = starGift.limited;
                if (z17 && (disallowedGiftsSettings2 = h2Var.Y) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z17 && (disallowedGiftsSettings = h2Var.Y) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                new kh.i1(h2Var, context, i18, starGift, j12, x0Var, z4, z10).show();
                return;
            case 2:
                int i19 = this.f4513b;
                TLObject tLObject = (TLObject) this.e;
                String str2 = (String) this.f4515f;
                ((ph.d) this.f4514c).setLoading(false);
                org.telegram.ui.ActionBar.g3 g3Var = ((org.telegram.ui.ActionBar.g3[]) this.d)[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                }
                t7.y(i19, false).S();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    qc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str2)), null).k(false);
                    return;
                }
                return;
            case 3:
                LocationController.lambda$fetchLocationAddress$29((Locale) this.f4514c, (Location) this.d, this.f4513b, (Locale) this.e, (LocationController.LocationFetchCallback) this.f4515f);
                return;
            case 4:
                ((MediaDataController) this.f4514c).lambda$removeMultipleStickerSets$110((boolean[]) this.d, (ArrayList) this.e, this.f4513b, (int[]) this.f4515f);
                return;
            case 5:
                ((MessagesController) this.f4514c).lambda$processUpdateArray$403((lf.t) this.d, (ConcurrentHashMap) this.e, (ConcurrentHashMap) this.f4515f, this.f4513b);
                return;
            case 6:
                ((MessagesStorage) this.f4514c).lambda$getSentFile$164((String) this.d, this.f4513b, (Object[]) this.e, (CountDownLatch) this.f4515f);
                return;
            case 7:
                ((MessagesStorage) this.f4514c).lambda$putSentFile$170((String) this.d, (TLObject) this.e, this.f4513b, (String) this.f4515f);
                return;
            case 8:
                ((NotificationCenter) this.f4514c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.e, (ah) this.f4515f, this.f4513b);
                return;
            case 9:
                ((VoIPService) this.f4514c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.f4513b, (String) this.e, (TLRPC.TL_error) this.f4515f);
                return;
            case 10:
                l4 l4Var2 = (l4) this.f4514c;
                ArrayList arrayList4 = (ArrayList) this.e;
                HashMap hashMap = (HashMap) this.d;
                String str3 = (String) this.f4515f;
                int i20 = this.f4513b;
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
                        CharSequence C = l4.C(l4Var, l4Var2.f35945r0[0].f37160c.B, null, richText, richText, pageBlock, 1000);
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
                                    obj3.f38834a = indexOf;
                                    obj3.f38836c = pageBlock;
                                    obj3.f38835b = obj;
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
                AndroidUtilities.runOnUIThread(new cg.v1((Object) l4Var2, i20, arrayList5, (Serializable) str3, 9));
                return;
            case 11:
                TLObject tLObject2 = (TLObject) this.f4514c;
                int i25 = this.f4513b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f4515f;
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
                        tL_inputGroupCall.f19201id = groupCall.f19194id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.f2.h(LaunchActivity.D1, i25, tL_inputGroupCall, false, groupCall, hashSet);
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
                        tL_inputGroupCall2.f19201id = groupCall2.f19194id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.f2.h(LaunchActivity.D1, i25, tL_inputGroupCall2, false, groupCall2, hashSet);
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
                xn.N0((xn) this.f4514c, this.f4513b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f4515f);
                return;
            case 13:
                jn jnVar = (jn) this.f4514c;
                wi wiVar = (wi) this.d;
                wiVar.f165b = jnVar.f35381a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.e).f19184id, this.f4513b, new en(jnVar, wiVar, (xn) this.f4515f));
                return;
            case 14:
                jn jnVar2 = (jn) this.f4514c;
                int i27 = this.f4513b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f4515f;
                xn xnVar = jnVar2.f35381a;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == xnVar.I6) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                xnVar.Xa(i27, id2, true, i13, true, 0, num, bArr, new vm(jnVar2, messageObject, 1));
                return;
            case 15:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.f4514c;
                int[] iArr = (int[]) this.d;
                int i28 = this.f4513b;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f4515f;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    d2Var.setOnCancelListener(new org.telegram.ui.Components.z1(iArr, runnable, i28));
                    p2Var2.showDialog(d2VarArr[0]);
                    return;
                }
                return;
            case 16:
                int i29 = this.f4513b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f4514c;
                ArrayList arrayList6 = (ArrayList) this.e;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.f4515f;
                if (LaunchActivity.f31613z1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    eg.v0 v0Var = new eg.v0(11, i29, R.getParentActivity(), R, null);
                    v0Var.I1(chat, arrayList6, arrayList7, arrayList8, null);
                    v0Var.show();
                    return;
                }
                return;
            case 17:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.e;
                int i30 = this.f4513b;
                org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) this.f4515f;
                SharedPreferences.Editor edit = ((SharedPreferences) this.f4514c).edit();
                edit.putLong("support_id2", tL_help_support.user.f19331id);
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
                MessagesStorage.getInstance(i30).putUsersAndChats(arrayList9, null, true, true);
                MessagesController.getInstance(i30).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.f19331id);
                p2Var3.presentFragment(new xn(bundle));
                return;
            case 18:
                es.P((es) this.f4514c, (TLObject) this.d, (TLRPC.InputPeer) this.e, this.f4513b, (int[]) this.f4515f);
                return;
            case 19:
                yv0 yv0Var = (yv0) this.f4514c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i31 = this.f4513b;
                MessageObject messageObject2 = (MessageObject) this.e;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f4515f;
                int[] iArr2 = yv0Var.e;
                RLottieNative[] rLottieNativeArr = yv0Var.f31166c1;
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
                                rLottieNativeArr[i32] = RLottieNative.b(readRes, "dice", iArr2, null, null);
                                yv0Var.f31167d1[i32] = iArr2[0];
                            }
                        }
                    }
                }
                if (z18) {
                    AndroidUtilities.runOnUIThread(new wv0(yv0Var, 3));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new ey(yv0Var, i31, t1Var, 15));
                    return;
                }
            case 20:
                LaunchActivity launchActivity = (LaunchActivity) this.f4514c;
                TLObject tLObject3 = (TLObject) this.d;
                Uri uri = (Uri) this.e;
                int i33 = this.f4513b;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) this.f4515f;
                Pattern pattern = LaunchActivity.f31612y1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject3 != null && launchActivity.f31638n0 != null) {
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
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().f32264s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                            PhotoViewer.t1().G0(false, true);
                        } else if (l4.I() && l4.x().S) {
                            l4.x().o(false, true);
                        }
                        da.x();
                        c60 c60Var = c60.A3;
                        if (c60Var != null) {
                            c60Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.f31638n0.U(true, true);
                            launchActivity.f31642p0.U(true, true);
                        }
                        oy oyVar = new oy(i34);
                        oyVar.f37131z2 = launchActivity;
                        if (!AndroidUtilities.isTablet() ? !(launchActivity.f31638n0.getFragmentStack().size() <= 1 || !(launchActivity.f31638n0.getFragmentStack().get(launchActivity.f31638n0.getFragmentStack().size() - 1) instanceof vg0)) : !(launchActivity.f31640o0.getFragmentStack().isEmpty() || !(launchActivity.f31640o0.getFragmentStack().get(launchActivity.f31640o0.getFragmentStack().size() - 1) instanceof vg0))) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        ((ActionBarLayout) launchActivity.O()).S(oyVar, z12, false);
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
                int i35 = this.f4513b;
                String str4 = (String) this.e;
                g00 g00Var = (g00) this.f4515f;
                org.telegram.ui.ActionBar.p2 p2Var4 = (org.telegram.ui.ActionBar.p2) kh.a2.i(1, ((LaunchActivity) this.f4514c).f31614a0);
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
                            saVar.f23782a0 = new ArrayList();
                            saVar.f23784c0 = "";
                            saVar.f23786e0 = new ArrayList();
                            ArrayList arrayList10 = new ArrayList();
                            saVar.f23787f0 = arrayList10;
                            saVar.f23803w0 = -1;
                            saVar.f23806z0 = -5;
                            saVar.U = str4;
                            saVar.W = chatlist_chatlistinvite;
                            arrayList10.clear();
                            if (z19) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                saVar.Z = tL_textWithEntities.text;
                                saVar.f23782a0 = tL_textWithEntities.entities;
                                saVar.f23783b0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                saVar.f23785d0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                saVar.f23785d0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                saVar.f23788g0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                saVar.V = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList11 = p2Var4.getMessagesController().dialogFilters;
                                if (arrayList11 != null) {
                                    int i36 = 0;
                                    while (true) {
                                        if (i36 < arrayList11.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList11.get(i36);
                                            if (dialogFilter.f16669id == saVar.V) {
                                                saVar.Z = dialogFilter.name;
                                                saVar.f23782a0 = dialogFilter.entities;
                                                saVar.f23783b0 = dialogFilter.title_noanimate;
                                            } else {
                                                i36++;
                                            }
                                        }
                                    }
                                }
                            }
                            saVar.S();
                            p2Var4.showDialog(saVar);
                            g00Var.run();
                            return;
                        }
                    } else {
                        a02 = qc.a0(p2Var4);
                        i15 = R.string.NoFolderFound;
                    }
                    g00Var.run();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                org.telegram.messenger.y3.s(i15, a02, null);
                break;
            case 22:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f4514c;
                g00 g00Var2 = (g00) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f4515f;
                int i37 = this.f4513b;
                ArrayList arrayList12 = launchActivity2.f31614a0;
                if (!launchActivity2.isFinishing()) {
                    try {
                        g00Var2.run();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    if (tL_error2 == null) {
                        if (launchActivity2.f31638n0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                            TLRPC.Chat chat2 = updates2.chats.get(0);
                            chat2.left = false;
                            chat2.kicked = false;
                            MessagesController.getInstance(i37).putUsers(updates2.users, false);
                            MessagesController.getInstance(i37).putChats(updates2.chats, false);
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chat2.f19184id);
                            if (arrayList12.isEmpty() || MessagesController.getInstance(i37).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.p2) kh.a2.i(1, arrayList12))) {
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
                    alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.AppName);
                    if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.FloodWait);
                    } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.JoinToGroupErrorFull);
                    } else {
                        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    launchActivity2.B0(alertDialog$Builder);
                    return;
                }
                return;
            case 23:
                wf0 wf0Var = (wf0) this.f4514c;
                String str5 = (String) this.d;
                String str6 = (String) this.e;
                String str7 = (String) this.f4515f;
                int i38 = this.f4513b;
                ArrayList arrayList13 = new ArrayList();
                b6.h hVar = new b6.h();
                hVar.f1599c = "inapp";
                hVar.f1598b = str5;
                arrayList13.add(hVar.a());
                FileLog.d("LoginBilling querying \"" + str5 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList13, new l3(wf0Var, str5, str6, str7, i38));
                return;
            case 24:
                int i39 = this.f4513b;
                z8 z8Var = (z8) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ((int[]) this.f4514c)[0] = i39;
                z8Var.r(user);
                ((p9) this.f4515f).e(user, z8Var);
                return;
            case 25:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f4514c;
                int i40 = this.f4513b;
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f4515f;
                if (((TLObject) this.d) instanceof TLRPC.TL_boolTrue) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.a1.u(i40, w0Var, "write_access_requested", jSONObject);
                        return;
                    } catch (Exception e12) {
                        FileLog.e(e12);
                        return;
                    }
                } else if (tL_error3 != null) {
                    a1Var.S(tL_error3.text);
                    return;
                } else {
                    String[] strArr = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(a1Var.getContext());
                    alertDialog$Builder2.f19503a.O = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder2.f19503a.Q = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new org.telegram.ui.web.m(1, a1Var, strArr));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new al0(11));
                    a1Var.R(3, alertDialog$Builder2.f19503a, new org.telegram.ui.web.x(strArr, i40, w0Var, 1));
                    return;
                }
            case 26:
                long[] jArr = (long[]) this.f4514c;
                int i41 = this.f4513b;
                p9 p9Var = (p9) this.d;
                p9 p9Var2 = (p9) this.e;
                TextView textView = (TextView) this.f4515f;
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i41).getUser(Long.valueOf(jArr[0]));
                    z8 z8Var2 = new z8((f6) null);
                    z8Var2.r(user2);
                    p9Var.e(user2, z8Var2);
                } else {
                    TLRPC.Chat chat3 = MessagesController.getInstance(i41).getChat(Long.valueOf(-jArr[0]));
                    z8 z8Var3 = new z8((f6) null);
                    z8Var3.q(chat3);
                    p9Var.e(chat3, z8Var3);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user3 = MessagesController.getInstance(i41).getUser(Long.valueOf(jArr[0]));
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
                TLRPC.Chat chat4 = MessagesController.getInstance(i41).getChat(Long.valueOf(-jArr[0]));
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
            case 27:
                boolean[] zArr = (boolean[]) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                int i42 = this.f4513b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f4515f;
                if (!(((TLObject) this.f4514c) instanceof TLRPC.TL_boolTrue)) {
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
                    MessagesController.getInstance(i42).updateEmojiStatusUntilUpdate(currentUser.f19331id, currentUser.emoji_status);
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
                final tf.z zVar = (tf.z) this.f4514c;
                int i43 = this.f4513b;
                ArrayList arrayList14 = (ArrayList) this.e;
                ArrayList arrayList15 = (ArrayList) this.d;
                ArrayList<TLRPC.User> arrayList16 = (ArrayList) this.f4515f;
                tf.s sVar = zVar.f44899g0;
                ArrayList arrayList17 = zVar.f44913s0;
                int i44 = zVar.f44908p0;
                zVar.A0--;
                if (i43 == zVar.f44891a0) {
                    zVar.f44894c0 = i43;
                    if (zVar.f44892b0 != i43) {
                        sVar.b();
                    }
                    if (zVar.f44895d0 != i43) {
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
                            j11 = user4.f19331id;
                        } else {
                            j10 = 0;
                            if (obj5 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat5 = (TLRPC.Chat) obj5;
                                MessagesController.getInstance(i44).putChat(chat5, z16);
                                j11 = -chat5.f19184id;
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
                                    int i48 = z.this.f44908p0;
                                    if (i47 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j13 = j11;
                                        tL_dialog.f19188id = j13;
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
                            zx zxVar = zVar.R;
                            if (zxVar != null && zxVar.a() == j11) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            for (int i47 = 0; !z15 && i47 < size3; i47++) {
                                tf.y yVar = (tf.y) arrayList17.get(i47);
                                boolean z20 = z15;
                                if (yVar != null && yVar.f44882c == j11) {
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
                    zVar.f44912s = arrayList14;
                    zVar.D = arrayList15;
                    sVar.f(arrayList14, arrayList17);
                    zVar.l();
                    zx zxVar2 = zVar.R;
                    if (zxVar2 != null) {
                        if (zVar.A0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zxVar2.d(z14, true);
                        zVar.R.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                tf.c1 c1Var = (tf.c1) this.f4514c;
                int i48 = this.f4513b;
                ArrayList arrayList18 = (ArrayList) this.e;
                ArrayList arrayList19 = (ArrayList) this.d;
                ArrayList arrayList20 = (ArrayList) this.f4515f;
                if (i48 == c1Var.B) {
                    c1Var.d = arrayList18;
                    c1Var.e = arrayList19;
                    c1Var.E = arrayList20;
                    c1Var.f44680f.f(arrayList18, null);
                    c1Var.f44686y = false;
                    c1Var.l();
                    c1Var.F();
                    return;
                }
                return;
        }
    }

    public f3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f4512a = i11;
        this.f4514c = obj;
        this.f4513b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f4515f = obj4;
    }

    public f3(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.f4512a = i11;
        this.f4514c = obj;
        this.d = obj2;
        this.f4513b = i10;
        this.e = obj3;
        this.f4515f = obj4;
    }

    public f3(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f4512a = i11;
        this.f4514c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f4513b = i10;
        this.f4515f = obj4;
    }

    public f3(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f4512a = i11;
        this.f4514c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f4515f = obj4;
        this.f4513b = i10;
    }

    public f3(l4 l4Var, ArrayList arrayList, HashMap hashMap, String str, int i10) {
        this.f4512a = 10;
        this.f4514c = l4Var;
        this.e = arrayList;
        this.d = hashMap;
        this.f4515f = str;
        this.f4513b = i10;
    }

    public f3(rl0 rl0Var, int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i11) {
        this.f4512a = i11;
        this.f4514c = rl0Var;
        this.f4513b = i10;
        this.e = arrayList;
        this.d = arrayList2;
        this.f4515f = arrayList3;
    }
}
