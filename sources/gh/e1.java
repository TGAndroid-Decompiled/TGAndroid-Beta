package gh;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.TextView;
import hh.u7;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import lh.sb;
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
import org.telegram.messenger.ug;
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
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.ur;
import org.telegram.ui.Components.y8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.a30;
import org.telegram.ui.di1;
import org.telegram.ui.dn;
import org.telegram.ui.ex0;
import org.telegram.ui.gy;
import org.telegram.ui.j70;
import org.telegram.ui.nq0;
import org.telegram.ui.pm;
import org.telegram.ui.qg0;
import org.telegram.ui.qi;
import org.telegram.ui.qs;
import org.telegram.ui.rf0;
import org.telegram.ui.rn;
import org.telegram.ui.rx;
import org.telegram.ui.s50;
import org.telegram.ui.ym;

public final class e1 implements Runnable {

    public final int f7216a;

    public final int f7217b;

    public final Object f7218c;
    public final Object d;

    public final Object f7219e;

    public final Object f7220f;

    public e1(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f7216a = 17;
        this.f7217b = i10;
        this.f7218c = chat;
        this.d = arrayList;
        this.f7219e = arrayList2;
        this.f7220f = arrayList3;
    }

    private final void a() {
        pf.c1 c1Var = (pf.c1) this.f7218c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.f7219e;
        ArrayList arrayList3 = (ArrayList) this.f7220f;
        if (this.f7217b == c1Var.A) {
            c1Var.d = arrayList;
            c1Var.f45753e = arrayList2;
            c1Var.D = arrayList3;
            c1Var.f45754f.f(arrayList, null);
            c1Var.f45760y = false;
            c1Var.l();
            qs qsVar = (qs) c1Var;
            if (qsVar.f45760y || qsVar.f45754f.e() || qsVar.h() != 0) {
                return;
            }
            qsVar.G.f35421e.e(false, true);
        }
    }

    @Override
    public final void run() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        boolean z10;
        char c10;
        String lowerCase;
        org.telegram.ui.ActionBar.n2 n2VarR;
        int i10;
        boolean z11;
        mc mcVarA0;
        int i11;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        long j10;
        final long j11;
        int i12 = 17;
        int i13 = 3;
        int i14 = 2;
        switch (this.f7216a) {
            case 0:
                k2 k2Var = (k2) this.f7218c;
                Context context = (Context) this.d;
                int i15 = this.f7217b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f7219e;
                Utilities.Callback callback = (Utilities.Callback) this.f7220f;
                long j12 = k2Var.Y;
                a1 a1Var = new a1(k2Var, callback, 2);
                boolean z12 = starGift.limited;
                new m1(k2Var, context, i15, starGift, j12, a1Var, z12 && (disallowedGiftsSettings2 = k2Var.X) != null && disallowedGiftsSettings2.disallow_limited_stargifts, z12 && (disallowedGiftsSettings = k2Var.X) != null && disallowedGiftsSettings.disallow_unique_stargifts).show();
                break;
            case 1:
                lh.d dVar = (lh.d) this.f7218c;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.d;
                int i16 = this.f7217b;
                TLObject tLObject = (TLObject) this.f7219e;
                String str = (String) this.f7220f;
                dVar.setLoading(false);
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                u7.y(i16, false).S();
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    mc.a0(n2VarU).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str)), null).k(false);
                }
                break;
            case 2:
                long[] jArr = (long[]) this.f7218c;
                int i17 = this.f7217b;
                n9 n9Var = (n9) this.d;
                n9 n9Var2 = (n9) this.f7219e;
                TextView textView = (TextView) this.f7220f;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i17).getUser(Long.valueOf(jArr[0]));
                    y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
                    y8Var.r(user);
                    n9Var.e(user, y8Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i17).getChat(Long.valueOf(-jArr[0]));
                    y8 y8Var2 = new y8((org.telegram.ui.ActionBar.c6) null);
                    y8Var2.q(chat);
                    n9Var.e(chat, y8Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i17).getUser(Long.valueOf(jArr[0]));
                    if (n9Var2 != null) {
                        y8 y8Var3 = new y8((org.telegram.ui.ActionBar.c6) null);
                        y8Var3.r(user2);
                        n9Var2.e(user2, y8Var3);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user2));
                    }
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(-jArr[0]));
                    if (n9Var2 != null) {
                        y8 y8Var4 = new y8((org.telegram.ui.ActionBar.c6) null);
                        y8Var4.q(chat2);
                        n9Var2.e(chat2, y8Var4);
                    }
                    if (textView != null) {
                        textView.setText(chat2 != null ? chat2.title : "");
                    }
                }
                break;
            case 3:
                TLObject tLObject2 = (TLObject) this.f7218c;
                boolean[] zArr = (boolean[]) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.f7220f;
                int i18 = this.f7217b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f7219e;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    TLRPC.User currentUser = UserConfig.getInstance(i18).getCurrentUser();
                    if (currentUser != null) {
                        currentUser.emoji_status = updateemojistatus.emoji_status;
                        z10 = true;
                        c10 = 0;
                        NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
                        MessagesController.getInstance(i18).updateEmojiStatusUntilUpdate(currentUser.f22527id, currentUser.emoji_status);
                    } else {
                        z10 = true;
                        c10 = 0;
                    }
                    if (!zArr[c10]) {
                        zArr[c10] = z10;
                        callback2.run(null);
                    }
                } else if (!zArr[0]) {
                    zArr[0] = true;
                    callback2.run("SERVER_ERROR");
                }
                break;
            case 4:
                LocationController.lambda$fetchLocationAddress$29((Locale) this.f7218c, (Location) this.d, this.f7217b, (Locale) this.f7219e, (LocationController.LocationFetchCallback) this.f7220f);
                break;
            case 5:
                ((MediaDataController) this.f7218c).lambda$removeMultipleStickerSets$110((boolean[]) this.d, (ArrayList) this.f7219e, this.f7217b, (int[]) this.f7220f);
                break;
            case 6:
                ((MessagesController) this.f7218c).lambda$processUpdateArray$403((gf.u) this.d, (ConcurrentHashMap) this.f7219e, (ConcurrentHashMap) this.f7220f, this.f7217b);
                break;
            case 7:
                ((MessagesStorage) this.f7218c).lambda$getSentFile$164((String) this.d, this.f7217b, (Object[]) this.f7219e, (CountDownLatch) this.f7220f);
                break;
            case 8:
                ((MessagesStorage) this.f7218c).lambda$putSentFile$170((String) this.d, (TLObject) this.f7219e, this.f7217b, (String) this.f7220f);
                break;
            case 9:
                ((NotificationCenter) this.f7218c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.f7219e, (ug) this.f7220f, this.f7217b);
                break;
            case 10:
                ((VoIPService) this.f7218c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.f7217b, (String) this.f7219e, (TLRPC.TL_error) this.f7220f);
                break;
            case 11:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.f7218c;
                ArrayList arrayList3 = (ArrayList) this.d;
                HashMap map = (HashMap) this.f7219e;
                String str2 = (String) this.f7220f;
                int i19 = this.f7217b;
                ArrayList arrayList4 = new ArrayList();
                int size = arrayList3.size();
                for (int i20 = 0; i20 < size; i20++) {
                    Object obj = arrayList3.get(i20);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) map.get(obj);
                    if (obj instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj;
                        CharSequence charSequenceC = org.telegram.ui.m4.C(m4Var, m4Var.f40347q0[0].f41497c.A, null, richText, richText, pageBlock, 1000);
                        if (TextUtils.isEmpty(charSequenceC)) {
                            lowerCase = null;
                        } else {
                            lowerCase = charSequenceC.toString().toLowerCase();
                        }
                    } else if (obj instanceof String) {
                        lowerCase = ((String) obj).toLowerCase();
                    } else {
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i21 = 0;
                        while (true) {
                            int iIndexOf = lowerCase.indexOf(str2, i21);
                            if (iIndexOf >= 0) {
                                int length = str2.length() + iIndexOf;
                                if (iIndexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(iIndexOf - 1))) {
                                    org.telegram.ui.v3 v3Var = new org.telegram.ui.v3();
                                    v3Var.f43336a = iIndexOf;
                                    v3Var.f43338c = pageBlock;
                                    v3Var.f43337b = obj;
                                    arrayList4.add(v3Var);
                                }
                                i21 = length;
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new ag.k0(m4Var, i19, arrayList4, str2, 9));
                break;
            case 12:
                TLObject tLObject3 = (TLObject) this.f7218c;
                int i22 = this.f7217b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f7219e;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f7220f;
                if (!(tLObject3 instanceof TLRPC.Updates)) {
                    if (!(tLObject3 instanceof TL_phone.groupCall)) {
                        if (tL_error != null) {
                            mc.a0(n2Var).d0(tL_error, false);
                        }
                        break;
                    } else {
                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject3;
                        MessagesController.getInstance(i22).putUsers(groupcall.users, false);
                        MessagesController.getInstance(i22).putChats(groupcall.chats, false);
                        if (LaunchActivity.C1 != null) {
                            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                            TLRPC.GroupCall groupCall = groupcall.call;
                            tL_inputGroupCall.f22397id = groupCall.f22390id;
                            tL_inputGroupCall.access_hash = groupCall.access_hash;
                            org.telegram.ui.Components.voip.e2.h(LaunchActivity.C1, i22, tL_inputGroupCall, false, groupCall, hashSet);
                            break;
                        }
                    }
                } else {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    MessagesController.getInstance(i22).putUsers(updates.users, false);
                    MessagesController.getInstance(i22).putChats(updates.chats, false);
                    ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = arrayListFindUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall2 = null;
                    int i23 = 0;
                    while (i23 < size2) {
                        Object obj2 = arrayListFindUpdatesAndRemove.get(i23);
                        i23++;
                        groupCall2 = ((TL_update.TL_updateGroupCall) obj2).call;
                    }
                    if (LaunchActivity.C1 != null && groupCall2 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall2.f22397id = groupCall2.f22390id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.e2.h(LaunchActivity.C1, i22, tL_inputGroupCall2, false, groupCall2, hashSet);
                    }
                    break;
                }
                break;
            case 13:
                rn.N0((rn) this.f7218c, this.f7217b, (Boolean) this.d, (TLRPC.WebPage) this.f7219e, (TL_account.getWebPagePreview) this.f7220f);
                break;
            case 14:
                dn dnVar = (dn) this.f7218c;
                qi qiVar = (qi) this.d;
                qiVar.f49293b = dnVar.f37446a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.f7219e).f22380id, this.f7217b, new ym(dnVar, qiVar, (rn) this.f7220f));
                break;
            case 15:
                dn dnVar2 = (dn) this.f7218c;
                int i24 = this.f7217b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.f7219e;
                byte[] bArr = (byte[]) this.f7220f;
                rn rnVar = dnVar2.f37446a;
                rnVar.Xa(i24, messageObject.getId(), true, messageObject.getDialogId() == rnVar.H6 ? 1 : 0, true, 0, num, bArr, new pm(dnVar2, messageObject, 1));
                break;
            case 16:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.f7218c;
                int[] iArr = (int[]) this.d;
                int i25 = this.f7217b;
                Runnable runnable = (Runnable) this.f7219e;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f7220f;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new org.telegram.ui.Components.x1(iArr, runnable, i25));
                    n2Var2.showDialog(b2VarArr[0]);
                    break;
                }
                break;
            case 17:
                int i26 = this.f7217b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.f7218c;
                ArrayList arrayList5 = (ArrayList) this.d;
                ArrayList arrayList6 = (ArrayList) this.f7219e;
                ArrayList arrayList7 = (ArrayList) this.f7220f;
                if (LaunchActivity.f35497y1 && (n2VarR = LaunchActivity.R()) != null && n2VarR.getParentActivity() != null) {
                    ag.i1 i1Var = new ag.i1(11, i26, n2VarR.getParentActivity(), n2VarR, null);
                    i1Var.I1(chat3, arrayList5, arrayList6, arrayList7, null);
                    i1Var.show();
                }
                break;
            case 18:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f7218c;
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.f7219e;
                int i27 = this.f7217b;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.f7220f;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong("support_id2", tL_help_support.user.f22527id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                editorEdit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                editorEdit.commit();
                serializedData.cleanup();
                try {
                    b2Var2.dismiss();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                ArrayList arrayList8 = new ArrayList();
                arrayList8.add(tL_help_support.user);
                MessagesStorage.getInstance(i27).putUsersAndChats(arrayList8, null, true, true);
                MessagesController.getInstance(i27).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.f22527id);
                n2Var3.presentFragment(new rn(bundle));
                break;
            case 19:
                ur.P((ur) this.f7218c, (TLObject) this.d, (TLRPC.InputPeer) this.f7219e, this.f7217b, (int[]) this.f7220f);
                break;
            case 20:
                hv0 hv0Var = (hv0) this.f7218c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i28 = this.f7217b;
                MessageObject messageObject2 = (MessageObject) this.f7219e;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f7220f;
                int[] iArr2 = hv0Var.f31312e;
                RLottieNative[] rLottieNativeArr = hv0Var.f29167b1;
                if (hv0Var.S0) {
                    AndroidUtilities.runOnUIThread(new fv0(hv0Var, i14));
                } else {
                    boolean z13 = false;
                    int i29 = 0;
                    while (i29 < rLottieNativeArr.length) {
                        if (rLottieNativeArr[i29] == null) {
                            if (i29 == 0) {
                                i10 = 1;
                            } else if (i29 == 1) {
                                i10 = 8;
                            } else if (i29 == 2) {
                                i10 = 14;
                            } else {
                                i10 = i29 == 3 ? 20 : 2;
                            }
                            if (i10 < tL_messages_stickerSet.documents.size()) {
                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
                                String res = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                                if (TextUtils.isEmpty(res)) {
                                    AndroidUtilities.runOnUIThread(new gv0(document, i28, messageObject2, s1Var, tL_messages_stickerSet, 1));
                                    z13 = true;
                                } else {
                                    rLottieNativeArr[i29] = RLottieNative.b(res, "dice", iArr2, null, null);
                                    hv0Var.f29168c1[i29] = iArr2[0];
                                }
                            }
                        }
                        i29++;
                    }
                    if (z13) {
                        AndroidUtilities.runOnUIThread(new fv0(hv0Var, i13));
                    } else {
                        AndroidUtilities.runOnUIThread(new km(hv0Var, i28, s1Var, i12));
                    }
                }
                break;
            case 21:
                LaunchActivity launchActivity = (LaunchActivity) this.f7218c;
                TLObject tLObject4 = (TLObject) this.d;
                Uri uri = (Uri) this.f7219e;
                int i30 = this.f7217b;
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) this.f7220f;
                Pattern pattern = LaunchActivity.f35496x1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject4 == null || launchActivity.m0 == null) {
                        if (launchActivity.S == null) {
                            launchActivity.S = new ArrayList();
                        }
                        launchActivity.S.add(0, launchActivity.T);
                        launchActivity.T = null;
                        launchActivity.i0(true);
                    } else {
                        TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject4;
                        Bundle bundleH = a9.p.h("onlySelect", true);
                        bundleH.putString("importTitle", tL_messages_historyImportParsed.title);
                        bundleH.putBoolean("allowSwitchAccount", true);
                        if (tL_messages_historyImportParsed.pm) {
                            bundleH.putInt("dialogsType", 12);
                        } else if (tL_messages_historyImportParsed.group) {
                            bundleH.putInt("dialogsType", 11);
                        } else {
                            String string = uri.toString();
                            Iterator<String> it = MessagesController.getInstance(i30).exportPrivateUri.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z11 = false;
                                } else if (string.contains(it.next())) {
                                    bundleH.putInt("dialogsType", 12);
                                    z11 = true;
                                }
                            }
                            if (!z11) {
                                Iterator<String> it2 = MessagesController.getInstance(i30).exportGroupUri.iterator();
                                while (it2.hasNext()) {
                                    if (string.contains(it2.next())) {
                                        bundleH.putInt("dialogsType", 11);
                                        z11 = true;
                                        if (!z11) {
                                            bundleH.putInt("dialogsType", 13);
                                        }
                                    }
                                }
                                if (!z11) {
                                    bundleH.putInt("dialogsType", 13);
                                }
                            }
                        }
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().f36160s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                            PhotoViewer.t1().G0(false, true);
                        } else if (org.telegram.ui.m4.I() && org.telegram.ui.m4.x().R) {
                            org.telegram.ui.m4.x().o(false, true);
                        }
                        sb.x();
                        s50 s50Var = s50.f42409z3;
                        if (s50Var != null) {
                            s50Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.m0.U(true, true);
                            launchActivity.f35525o0.U(true, true);
                        }
                        gy gyVar = new gy(bundleH);
                        gyVar.f38621y2 = launchActivity;
                        ((ActionBarLayout) launchActivity.O()).S(gyVar, !AndroidUtilities.isTablet() ? launchActivity.m0.getFragmentStack().size() <= 1 || !(launchActivity.m0.getFragmentStack().get(launchActivity.m0.getFragmentStack().size() - 1) instanceof qg0) : launchActivity.f35523n0.getFragmentStack().isEmpty() || !(launchActivity.f35523n0.getFragmentStack().get(launchActivity.f35523n0.getFragmentStack().size() + (-1)) instanceof qg0), false);
                    }
                    try {
                        b2Var3.dismiss();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                break;
            case 22:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f7218c;
                TLObject tLObject5 = (TLObject) this.d;
                int i31 = this.f7217b;
                String str3 = (String) this.f7219e;
                a30 a30Var = (a30) this.f7220f;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) i0.a.i(1, launchActivity2.Z);
                try {
                    if (tLObject5 instanceof TL_chatlists.chatlist_ChatlistInvite) {
                        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject5;
                        boolean z14 = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
                        if (z14) {
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
                        MessagesController.getInstance(i31).putChats(arrayList2, false);
                        MessagesController.getInstance(i31).putUsers(arrayList, false);
                        if (z14 && ((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                            mcVarA0 = mc.a0(n2Var4);
                            i11 = R.string.NoFolderFound;
                        } else {
                            q00 q00Var = new q00(n2Var4, false);
                            q00Var.U = -1;
                            q00Var.Y = "";
                            q00Var.Z = new ArrayList();
                            q00Var.f31723b0 = "";
                            q00Var.f31725d0 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            q00Var.f31726e0 = arrayList9;
                            q00Var.f31742v0 = -1;
                            q00Var.f31745y0 = -5;
                            q00Var.T = str3;
                            q00Var.V = chatlist_chatlistinvite;
                            arrayList9.clear();
                            if (z14) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                q00Var.Y = tL_textWithEntities.text;
                                q00Var.Z = tL_textWithEntities.entities;
                                q00Var.f31722a0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                q00Var.f31724c0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                q00Var.f31724c0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                q00Var.f31727f0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                q00Var.U = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList10 = n2Var4.getMessagesController().dialogFilters;
                                if (arrayList10 != null) {
                                    for (int i32 = 0; i32 < arrayList10.size(); i32++) {
                                        MessagesController.DialogFilter dialogFilter = arrayList10.get(i32);
                                        if (dialogFilter.f19622id == q00Var.U) {
                                            q00Var.Y = dialogFilter.name;
                                            q00Var.Z = dialogFilter.entities;
                                            q00Var.f31722a0 = dialogFilter.title_noanimate;
                                        }
                                    }
                                }
                            }
                            q00Var.S();
                            n2Var4.showDialog(q00Var);
                        }
                        a30Var.run();
                    } else {
                        mcVarA0 = mc.a0(n2Var4);
                        i11 = R.string.NoFolderFound;
                    }
                    a30Var.run();
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                org.telegram.messenger.y1.r(i11, mcVarA0, null);
                break;
            case 23:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f7218c;
                a30 a30Var2 = (a30) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f7219e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f7220f;
                int i33 = this.f7217b;
                ArrayList arrayList11 = launchActivity3.Z;
                if (!launchActivity3.isFinishing()) {
                    try {
                        a30Var2.run();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    if (tL_error2 != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity3);
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                        if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FloodWait);
                        } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.JoinToGroupErrorFull);
                        } else {
                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                        }
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        launchActivity3.B0(alertDialog$Builder);
                        break;
                    } else if (launchActivity3.m0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                        TLRPC.Chat chat4 = updates2.chats.get(0);
                        chat4.left = false;
                        chat4.kicked = false;
                        MessagesController.getInstance(i33).putUsers(updates2.users, false);
                        MessagesController.getInstance(i33).putChats(updates2.chats, false);
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", chat4.f22380id);
                        if (arrayList11.isEmpty() || MessagesController.getInstance(i33).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.n2) i0.a.i(1, arrayList11))) {
                            rn rnVar2 = new rn(bundle2);
                            NotificationCenter.getInstance(i33).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                            ((ActionBarLayout) launchActivity3.O()).S(rnVar2, false, true);
                        }
                        break;
                    }
                }
                break;
            case 24:
                rf0 rf0Var = (rf0) this.f7218c;
                String str4 = (String) this.d;
                String str5 = (String) this.f7219e;
                String str6 = (String) this.f7220f;
                int i34 = this.f7217b;
                ArrayList arrayList12 = new ArrayList();
                c9.b bVar = new c9.b();
                bVar.f2567c = "inapp";
                bVar.f2566b = str4;
                arrayList12.add(bVar.a());
                FileLog.d("LoginBilling querying \"" + str4 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList12, new u2(rf0Var, str4, str5, str6, i34));
                break;
            case 25:
                int[] iArr3 = (int[]) this.f7218c;
                int i35 = this.f7217b;
                y8 y8Var5 = (y8) this.d;
                TLRPC.User user3 = (TLRPC.User) this.f7219e;
                n9 n9Var3 = (n9) this.f7220f;
                iArr3[0] = i35;
                y8Var5.r(user3);
                n9Var3.e(user3, y8Var5);
                break;
            case 26:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f7218c;
                TLObject tLObject6 = (TLObject) this.d;
                int i36 = this.f7217b;
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.f7219e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f7220f;
                if (tLObject6 instanceof TLRPC.TL_boolTrue) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.z0.u(i36, w0Var, "write_access_requested", jSONObject);
                    } catch (Exception e13) {
                        FileLog.e(e13);
                        return;
                    }
                } else if (tL_error3 != null) {
                    z0Var.S(tL_error3.text);
                } else {
                    String[] strArr = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(z0Var.getContext());
                    alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new di1(i14, z0Var, strArr));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new j70(i12));
                    z0Var.R(3, alertDialog$Builder2.f22702a, new org.telegram.ui.web.x(strArr, i36, w0Var, 1));
                }
                break;
            case 27:
                final pf.z zVar = (pf.z) this.f7218c;
                int i37 = this.f7217b;
                ArrayList arrayList13 = (ArrayList) this.d;
                ArrayList arrayList14 = (ArrayList) this.f7219e;
                ArrayList<TLRPC.User> arrayList15 = (ArrayList) this.f7220f;
                pf.s sVar = zVar.f45987f0;
                ArrayList arrayList16 = zVar.f46000r0;
                int i38 = zVar.f45996o0;
                zVar.f46012z0--;
                if (i37 == zVar.Z) {
                    zVar.f45980b0 = i37;
                    if (zVar.f45979a0 != i37) {
                        sVar.b();
                    }
                    if (zVar.f45982c0 != i37) {
                        zVar.E.clear();
                    }
                    zVar.J = true;
                    int i39 = 0;
                    while (i39 < arrayList13.size()) {
                        if (!zVar.F(arrayList13.get(i39))) {
                            arrayList13.remove(i39);
                            i39--;
                        }
                        i39++;
                    }
                    boolean z15 = true;
                    int size3 = arrayList16.size();
                    int i40 = 0;
                    while (i40 < arrayList13.size()) {
                        final Object obj3 = arrayList13.get(i40);
                        if (obj3 instanceof TLRPC.User) {
                            TLRPC.User user4 = (TLRPC.User) obj3;
                            j10 = 0;
                            MessagesController.getInstance(i38).putUser(user4, z15);
                            j11 = user4.f22527id;
                        } else {
                            j10 = 0;
                            if (obj3 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat5 = (TLRPC.Chat) obj3;
                                MessagesController.getInstance(i38).putChat(chat5, z15);
                                j11 = -chat5.f22380id;
                            } else {
                                if (obj3 instanceof TLRPC.EncryptedChat) {
                                    MessagesController.getInstance(i38).putEncryptedChat((TLRPC.EncryptedChat) obj3, z15);
                                }
                                j11 = 0;
                            }
                        }
                        if (j11 != j10 && ((TLRPC.Dialog) MessagesController.getInstance(i38).dialogs_dict.f(j11)) == null) {
                            MessagesStorage.getInstance(i38).getDialogFolderId(j11, new MessagesStorage.IntCallback() {
                                @Override
                                public final void run(int i41) {
                                    int i42 = zVar.f45996o0;
                                    if (i41 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j13 = j11;
                                        tL_dialog.f22384id = j13;
                                        if (i41 != 0) {
                                            tL_dialog.folder_id = i41;
                                        }
                                        Object obj4 = obj3;
                                        if (obj4 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj4) ? 1 : 0;
                                        }
                                        MessagesController.getInstance(i42).dialogs_dict.k(tL_dialog, j13);
                                        MessagesController.getInstance(i42).getAllDialogs().add(tL_dialog);
                                        MessagesController.getInstance(i42).sortDialogs(null);
                                    }
                                }
                            });
                        }
                        if (zVar.S() && !(obj3 instanceof TLRPC.EncryptedChat)) {
                            rx rxVar = zVar.Q;
                            boolean z16 = rxVar != null && rxVar.a() == j11;
                            for (int i41 = 0; !z16 && i41 < size3; i41++) {
                                pf.y yVar = (pf.y) arrayList16.get(i41);
                                z16 = (yVar == null || yVar.f45969c != j11) ? z16 : true;
                            }
                            if (z16) {
                                arrayList13.remove(i40);
                                arrayList14.remove(i40);
                                i40--;
                            }
                        }
                        z15 = true;
                        i40++;
                    }
                    MessagesController.getInstance(i38).putUsers(arrayList15, z15);
                    zVar.f46001s = arrayList13;
                    zVar.C = arrayList14;
                    sVar.f(arrayList13, arrayList16);
                    zVar.l();
                    rx rxVar2 = zVar.Q;
                    if (rxVar2 != null) {
                        rxVar2.d(zVar.f46012z0 > 0, z15);
                        zVar.Q.c();
                    }
                    break;
                }
                break;
            case 28:
                a();
                break;
            default:
                zf.n2 n2Var5 = (zf.n2) this.f7218c;
                int i42 = this.f7217b;
                List list = (List) this.d;
                ArrayList arrayList17 = (ArrayList) this.f7219e;
                nq0 nq0Var = (nq0) this.f7220f;
                if (n2Var5.E != null && !n2Var5.f50630y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / n2Var5.E.getWidth(), 1.0f / n2Var5.E.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i42);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i42 / 90) % 2 != 0) {
                        matrix.postScale(n2Var5.E.getHeight(), n2Var5.E.getWidth());
                    } else {
                        matrix.postScale(n2Var5.E.getWidth(), n2Var5.E.getHeight());
                    }
                    if (list.isEmpty()) {
                        zf.k2 k2Var2 = new zf.k2(n2Var5);
                        k2Var2.h.set(0.0f, 0.0f, n2Var5.E.getWidth(), n2Var5.E.getHeight());
                        k2Var2.f50491i.set(k2Var2.h);
                        matrix.mapRect(k2Var2.f50491i);
                        k2Var2.f50487c = i42;
                        Bitmap bitmapD = n2Var5.d(n2Var5.E, 0, 0, false);
                        k2Var2.d = bitmapD;
                        if (bitmapD == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                        } else {
                            k2Var2.f50489f = k2Var2.c();
                            zf.n2.c(k2Var2, n2Var5.P, n2Var5.Q);
                            n2Var5.K = k2Var2.f50492j;
                            n2Var5.L = k2Var2.f50493k;
                            arrayList17.add(k2Var2);
                            AndroidUtilities.runOnUIThread(new ex0(n2Var5, arrayList17, nq0Var, k2Var2, 25));
                            n2Var5.A = k2Var2;
                            n2Var5.f50630y = true;
                            n2Var5.f50629x = false;
                        }
                    } else {
                        for (int i43 = 0; i43 < list.size(); i43++) {
                            zf.m2 m2Var = (zf.m2) list.get(i43);
                            zf.k2 k2Var3 = new zf.k2(n2Var5);
                            RectF rectF = k2Var3.h;
                            int i44 = m2Var.f50575b;
                            int i45 = m2Var.f50576c;
                            rectF.set(i44, i45, i44 + m2Var.d, i45 + m2Var.f50577e);
                            k2Var3.f50491i.set(k2Var3.h);
                            matrix.mapRect(k2Var3.f50491i);
                            k2Var3.f50487c = i42;
                            Bitmap bitmapD2 = n2Var5.d(m2Var.f50574a, m2Var.f50575b, m2Var.f50576c, false);
                            k2Var3.d = bitmapD2;
                            if (bitmapD2 != null) {
                                k2Var3.f50489f = k2Var3.c();
                                zf.n2.c(k2Var3, n2Var5.P, n2Var5.Q);
                                n2Var5.K = k2Var3.f50492j;
                                n2Var5.L = k2Var3.f50493k;
                                arrayList17.add(k2Var3);
                            }
                        }
                        n2Var5.A = null;
                        n2Var5.f50630y = true;
                        n2Var5.f50629x = false;
                        AndroidUtilities.runOnUIThread(new rh.o2(12, n2Var5, arrayList17));
                    }
                    break;
                }
                break;
        }
    }

    public e1(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f7216a = i11;
        this.f7218c = obj;
        this.f7217b = i10;
        this.d = obj2;
        this.f7219e = obj3;
        this.f7220f = obj4;
    }

    public e1(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.f7216a = i11;
        this.f7218c = obj;
        this.d = obj2;
        this.f7217b = i10;
        this.f7219e = obj3;
        this.f7220f = obj4;
    }

    public e1(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f7216a = i11;
        this.f7218c = obj;
        this.d = obj2;
        this.f7219e = obj3;
        this.f7217b = i10;
        this.f7220f = obj4;
    }

    public e1(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f7216a = i11;
        this.f7218c = obj;
        this.d = obj2;
        this.f7219e = obj3;
        this.f7220f = obj4;
        this.f7217b = i10;
    }

    public e1(TLObject tLObject, boolean[] zArr, Utilities.Callback callback, int i10, TL_account.updateEmojiStatus updateemojistatus) {
        this.f7216a = 3;
        this.f7218c = tLObject;
        this.d = zArr;
        this.f7220f = callback;
        this.f7217b = i10;
        this.f7219e = updateemojistatus;
    }
}
