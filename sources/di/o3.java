package di;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import bi.ce;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
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
import org.telegram.messenger.gh;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.bn;
import org.telegram.ui.cj;
import org.telegram.ui.eo;
import org.telegram.ui.fg0;
import org.telegram.ui.fh0;
import org.telegram.ui.fy0;
import org.telegram.ui.h90;
import org.telegram.ui.iy;
import org.telegram.ui.j60;
import org.telegram.ui.kn;
import org.telegram.ui.or0;
import org.telegram.ui.pn;
import org.telegram.ui.wy;
public final class o3 implements Runnable {
    public final int f6828a;
    public final int f6829b;
    public final Object f6830c;
    public final Object d;
    public final Object e;
    public final Object f6831f;

    public o3(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f6828a = 19;
        this.f6829b = i10;
        this.f6830c = chat;
        this.d = arrayList;
        this.e = arrayList2;
        this.f6831f = arrayList3;
    }

    @Override
    public final void run() {
        boolean z10;
        char c10;
        boolean z11;
        final long j3;
        long j10;
        boolean z12;
        Object obj;
        org.telegram.ui.j4 j4Var;
        int i10;
        Object obj2;
        String lowerCase;
        int i11;
        org.telegram.ui.ActionBar.p2 R;
        int i12;
        boolean z13;
        boolean z14;
        wc a02;
        int i13;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        int i14;
        int i15;
        long j11 = 0;
        String str = "";
        int i16 = 0;
        switch (this.f6828a) {
            case 0:
                long[] jArr = (long[]) this.f6830c;
                int i17 = this.f6829b;
                w9 w9Var = (w9) this.d;
                w9 w9Var2 = (w9) this.e;
                TextView textView = (TextView) this.f6831f;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i17).getUser(Long.valueOf(jArr[0]));
                    g9 g9Var = new g9((f6) null);
                    g9Var.r(user);
                    w9Var.e(user, g9Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i17).getChat(Long.valueOf(-jArr[0]));
                    g9 g9Var2 = new g9((f6) null);
                    g9Var2.q(chat);
                    w9Var.e(chat, g9Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i17).getUser(Long.valueOf(jArr[0]));
                    if (w9Var2 != null) {
                        g9 g9Var3 = new g9((f6) null);
                        g9Var3.r(user2);
                        w9Var2.e(user2, g9Var3);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user2));
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(-jArr[0]));
                if (w9Var2 != null) {
                    g9 g9Var4 = new g9((f6) null);
                    g9Var4.q(chat2);
                    w9Var2.e(chat2, g9Var4);
                }
                if (textView != null) {
                    if (chat2 != null) {
                        str = chat2.title;
                    }
                    textView.setText(str);
                    return;
                }
                return;
            case 1:
                boolean[] zArr = (boolean[]) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                int i18 = this.f6829b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f6831f;
                if (!(((TLObject) this.f6830c) instanceof TLRPC.TL_boolTrue)) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        callback.run("SERVER_ERROR");
                        return;
                    }
                    return;
                }
                TLRPC.User currentUser = UserConfig.getInstance(i18).getCurrentUser();
                if (currentUser != null) {
                    currentUser.emoji_status = updateemojistatus.emoji_status;
                    z10 = true;
                    c10 = 0;
                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
                    MessagesController.getInstance(i18).updateEmojiStatusUntilUpdate(currentUser.f17342id, currentUser.emoji_status);
                } else {
                    z10 = true;
                    c10 = 0;
                }
                if (!zArr[c10]) {
                    zArr[c10] = z10;
                    callback.run(null);
                    return;
                }
                return;
            case 2:
                final fg.h0 h0Var = (fg.h0) this.f6830c;
                int i19 = this.f6829b;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) this.f6831f;
                fg.y yVar = h0Var.f8039j0;
                ArrayList arrayList6 = h0Var.f8053v0;
                int i20 = h0Var.f8050s0;
                h0Var.D0--;
                if (i19 == h0Var.f8032d0) {
                    h0Var.f8035f0 = i19;
                    if (h0Var.f8033e0 != i19) {
                        yVar.b();
                    }
                    if (h0Var.f8036g0 != i19) {
                        h0Var.I.clear();
                    }
                    h0Var.N = true;
                    int i21 = 0;
                    while (i21 < arrayList3.size()) {
                        if (!h0Var.F(arrayList3.get(i21))) {
                            arrayList3.remove(i21);
                            i21--;
                        }
                        i21++;
                    }
                    boolean z15 = true;
                    int size = arrayList6.size();
                    int i22 = 0;
                    while (i22 < arrayList3.size()) {
                        final Object obj3 = arrayList3.get(i22);
                        if (obj3 instanceof TLRPC.User) {
                            TLRPC.User user3 = (TLRPC.User) obj3;
                            MessagesController.getInstance(i20).putUser(user3, z15);
                            j3 = user3.f17342id;
                        } else if (obj3 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) obj3;
                            MessagesController.getInstance(i20).putChat(chat3, z15);
                            j3 = -chat3.f17195id;
                        } else {
                            if (obj3 instanceof TLRPC.EncryptedChat) {
                                MessagesController.getInstance(i20).putEncryptedChat((TLRPC.EncryptedChat) obj3, z15);
                            }
                            j3 = j11;
                        }
                        if (j3 != j11 && ((TLRPC.Dialog) MessagesController.getInstance(i20).dialogs_dict.f(j3)) == null) {
                            j10 = j11;
                            MessagesStorage.getInstance(i20).getDialogFolderId(j3, new MessagesStorage.IntCallback() {
                                @Override
                                public final void run(int i23) {
                                    int i24 = h0.this.f8050s0;
                                    if (i23 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j12 = j3;
                                        tL_dialog.f17199id = j12;
                                        if (i23 != 0) {
                                            tL_dialog.folder_id = i23;
                                        }
                                        Object obj4 = obj3;
                                        if (obj4 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj4) ? 1 : 0;
                                        }
                                        MessagesController.getInstance(i24).dialogs_dict.k(tL_dialog, j12);
                                        MessagesController.getInstance(i24).getAllDialogs().add(tL_dialog);
                                        MessagesController.getInstance(i24).sortDialogs(null);
                                    }
                                }
                            });
                        } else {
                            j10 = j11;
                        }
                        if (h0Var.S() && !(obj3 instanceof TLRPC.EncryptedChat)) {
                            iy iyVar = h0Var.U;
                            if (iyVar != null && iyVar.a() == j3) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            int i23 = 0;
                            while (!z12 && i23 < size) {
                                fg.g0 g0Var = (fg.g0) arrayList6.get(i23);
                                boolean z16 = z12;
                                int i24 = i23;
                                if (g0Var != null && g0Var.f8022c == j3) {
                                    z12 = true;
                                } else {
                                    z12 = z16;
                                }
                                i23 = i24 + 1;
                            }
                            if (z12) {
                                arrayList3.remove(i22);
                                arrayList4.remove(i22);
                                i22--;
                            }
                        }
                        i22++;
                        j11 = j10;
                        z15 = true;
                    }
                    MessagesController.getInstance(i20).putUsers(arrayList5, true);
                    h0Var.f8049s = arrayList3;
                    h0Var.G = arrayList4;
                    yVar.f(arrayList3, arrayList6);
                    h0Var.l();
                    iy iyVar2 = h0Var.U;
                    if (iyVar2 != null) {
                        if (h0Var.D0 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        iyVar2.d(z11, true);
                        h0Var.U.c();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                fg.w1 w1Var = (fg.w1) this.f6830c;
                int i25 = this.f6829b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                ArrayList arrayList9 = (ArrayList) this.f6831f;
                if (i25 == w1Var.E) {
                    w1Var.d = arrayList7;
                    w1Var.e = arrayList8;
                    w1Var.H = arrayList9;
                    w1Var.f8246f.f(arrayList7, null);
                    w1Var.f8252y = false;
                    w1Var.l();
                    w1Var.F();
                    return;
                }
                return;
            case 4:
                Pair pair = (Pair) this.d;
                ((i2.b1) this.f6830c).f10110b.h.h(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) this.e, (u2.c0) this.f6831f, this.f6829b);
                return;
            case 5:
                m4.l0 l0Var = (m4.l0) this.f6830c;
                m4.n1 n1Var = (m4.n1) this.d;
                int i26 = this.f6829b;
                n4.a0 a0Var = (n4.a0) this.e;
                m4.k0 k0Var = (m4.k0) this.f6831f;
                ki.f fVar = l0Var.f13429f;
                if (!l0Var.f13430g.j()) {
                    if (!((n4.r) l0Var.f13433k.f13824b).f13805a.isActive()) {
                        StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                        if (n1Var == null) {
                            obj = Integer.valueOf(i26);
                        } else {
                            obj = n1Var.f13459b;
                        }
                        sb2.append(obj);
                        sb2.append(", pid=");
                        sb2.append(a0Var.f13759a.f13761b);
                        e2.a.n("MediaSessionLegacyStub", sb2.toString());
                        return;
                    }
                    m4.r L = l0Var.L(a0Var);
                    if (n1Var != null) {
                        if (!fVar.C(L, n1Var)) {
                            return;
                        }
                    } else if (!fVar.B(L, i26)) {
                        return;
                    }
                    try {
                        k0Var.h(L);
                        return;
                    } catch (RemoteException e) {
                        e2.a.o("MediaSessionLegacyStub", "Exception in " + L, e);
                        return;
                    }
                }
                return;
            case 6:
                LocationController.lambda$fetchLocationAddress$29((Locale) this.f6830c, (Location) this.d, this.f6829b, (Locale) this.e, (LocationController.LocationFetchCallback) this.f6831f);
                return;
            case 7:
                ((MediaDataController) this.f6830c).lambda$removeMultipleStickerSets$110((boolean[]) this.d, (ArrayList) this.e, this.f6829b, (int[]) this.f6831f);
                return;
            case 8:
                ((MessagesController) this.f6830c).lambda$processUpdateArray$403((xf.r) this.d, (ConcurrentHashMap) this.e, (ConcurrentHashMap) this.f6831f, this.f6829b);
                return;
            case 9:
                ((MessagesStorage) this.f6830c).lambda$getSentFile$164((String) this.d, this.f6829b, (Object[]) this.e, (CountDownLatch) this.f6831f);
                return;
            case 10:
                ((MessagesStorage) this.f6830c).lambda$putSentFile$170((String) this.d, (TLObject) this.e, this.f6829b, (String) this.f6831f);
                return;
            case 11:
                ((NotificationCenter) this.f6830c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.e, (gh) this.f6831f, this.f6829b);
                return;
            case 12:
                ((VoIPService) this.f6830c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.f6829b, (String) this.e, (TLRPC.TL_error) this.f6831f);
                return;
            case 13:
                org.telegram.ui.j4 j4Var2 = (org.telegram.ui.j4) this.f6830c;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                String str2 = (String) this.f6831f;
                int i27 = this.f6829b;
                ArrayList arrayList11 = new ArrayList();
                int size2 = arrayList10.size();
                int i28 = 0;
                while (i28 < size2) {
                    Object obj4 = arrayList10.get(i28);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj4);
                    if (obj4 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj4;
                        int i29 = i28;
                        j4Var = j4Var2;
                        i10 = i29;
                        obj2 = obj4;
                        CharSequence C = org.telegram.ui.j4.C(j4Var, j4Var2.f33920u0[i16].f35103c.E, null, richText, richText, pageBlock, 1000);
                        if (!TextUtils.isEmpty(C)) {
                            lowerCase = C.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        int i30 = i28;
                        j4Var = j4Var2;
                        i10 = i30;
                        obj2 = obj4;
                        if (obj2 instanceof String) {
                            lowerCase = ((String) obj2).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i31 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str2, i31);
                            if (indexOf >= 0) {
                                int length = str2.length() + indexOf;
                                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                                    ?? obj5 = new Object();
                                    obj5.f36537a = indexOf;
                                    obj5.f36539c = pageBlock;
                                    obj5.f36538b = obj2;
                                    arrayList11.add(obj5);
                                }
                                i31 = length;
                            }
                        }
                    }
                    org.telegram.ui.j4 j4Var3 = j4Var;
                    i28 = i10 + 1;
                    j4Var2 = j4Var3;
                    i16 = 0;
                }
                AndroidUtilities.runOnUIThread(new q((Object) j4Var2, i27, arrayList11, (Serializable) str2, 10));
                return;
            case 14:
                TLObject tLObject = (TLObject) this.f6830c;
                int i32 = this.f6829b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f6831f;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(i32).putUsers(updates.users, false);
                    MessagesController.getInstance(i32).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size3 = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i16 < size3) {
                        Object obj6 = findUpdatesAndRemove.get(i16);
                        i16++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj6).call;
                    }
                    if (LaunchActivity.G1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f17212id = groupCall.f17205id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.e2.g(LaunchActivity.G1, i32, tL_inputGroupCall, false, groupCall, hashSet);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    MessagesController.getInstance(i32).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i32).putChats(groupcall.chats, false);
                    if (LaunchActivity.G1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.f17212id = groupCall2.f17205id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.e2.g(LaunchActivity.G1, i32, tL_inputGroupCall2, false, groupCall2, hashSet);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    wc.a0(p2Var).d0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 15:
                eo.N0((eo) this.f6830c, this.f6829b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f6831f);
                return;
            case 16:
                pn pnVar = (pn) this.f6830c;
                cj cjVar = (cj) this.d;
                cjVar.f14040b = pnVar.f35881a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.e).f17195id, this.f6829b, new kn(pnVar, cjVar, (eo) this.f6831f));
                return;
            case 17:
                pn pnVar2 = (pn) this.f6830c;
                int i33 = this.f6829b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f6831f;
                eo eoVar = pnVar2.f35881a;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == eoVar.L6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                eoVar.Xa(i33, id2, true, i11, true, 0, num, bArr, new bn(pnVar2, messageObject, 1));
                return;
            case 18:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) this.f6830c;
                int[] iArr = (int[]) this.d;
                int i34 = this.f6829b;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f6831f;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    d2Var.setOnCancelListener(new org.telegram.ui.Components.a2(iArr, runnable, i34));
                    p2Var2.showDialog(d2VarArr[0]);
                    return;
                }
                return;
            case 19:
                int i35 = this.f6829b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.f6830c;
                ArrayList arrayList12 = (ArrayList) this.d;
                ArrayList arrayList13 = (ArrayList) this.e;
                ArrayList arrayList14 = (ArrayList) this.f6831f;
                if (LaunchActivity.C1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    qg.k0 k0Var2 = new qg.k0(11, i35, R.getParentActivity(), R, null);
                    k0Var2.I1(chat4, arrayList12, arrayList13, arrayList14, null);
                    k0Var2.show();
                    return;
                }
                return;
            case 20:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.e;
                int i36 = this.f6829b;
                org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) this.f6831f;
                SharedPreferences.Editor edit = ((SharedPreferences) this.f6830c).edit();
                edit.putLong("support_id2", tL_help_support.user.f17342id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    d2Var2.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                ArrayList arrayList15 = new ArrayList();
                arrayList15.add(tL_help_support.user);
                MessagesStorage.getInstance(i36).putUsersAndChats(arrayList15, null, true, true);
                MessagesController.getInstance(i36).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.f17342id);
                p2Var3.presentFragment(new eo(bundle));
                return;
            case 21:
                ls.P((ls) this.f6830c, (TLObject) this.d, (TLRPC.InputPeer) this.e, this.f6829b, (int[]) this.f6831f);
                return;
            case 22:
                iw0 iw0Var = (iw0) this.f6830c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i37 = this.f6829b;
                MessageObject messageObject2 = (MessageObject) this.e;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f6831f;
                int[] iArr2 = iw0Var.e;
                RLottieNative[] rLottieNativeArr = iw0Var.f24149f1;
                if (iw0Var.W0) {
                    AndroidUtilities.runOnUIThread(new gw0(iw0Var, 2));
                    return;
                }
                boolean z17 = false;
                for (int i38 = 0; i38 < rLottieNativeArr.length; i38++) {
                    if (rLottieNativeArr[i38] == null) {
                        if (i38 == 0) {
                            i12 = 1;
                        } else if (i38 == 1) {
                            i12 = 8;
                        } else if (i38 == 2) {
                            i12 = 14;
                        } else if (i38 == 3) {
                            i12 = 20;
                        } else {
                            i12 = 2;
                        }
                        if (i12 < tL_messages_stickerSet.documents.size()) {
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                            String readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(readRes)) {
                                AndroidUtilities.runOnUIThread(new hw0(document, i37, messageObject2, t1Var, tL_messages_stickerSet, 1));
                                z17 = true;
                            } else {
                                rLottieNativeArr[i38] = RLottieNative.b(readRes, iArr2, null, null);
                                iw0Var.f24150g1[i38] = iArr2[0];
                            }
                        }
                    }
                }
                if (z17) {
                    AndroidUtilities.runOnUIThread(new gw0(iw0Var, 3));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new my(iw0Var, i37, t1Var, 15));
                    return;
                }
            case 23:
                LaunchActivity launchActivity = (LaunchActivity) this.f6830c;
                TLObject tLObject2 = (TLObject) this.d;
                Uri uri = (Uri) this.e;
                int i39 = this.f6829b;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) this.f6831f;
                Pattern pattern = LaunchActivity.B1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject2 != null && launchActivity.f29957q0 != null) {
                        TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject2;
                        Bundle i40 = a4.a.i("onlySelect", true);
                        i40.putString("importTitle", tL_messages_historyImportParsed.title);
                        i40.putBoolean("allowSwitchAccount", true);
                        if (tL_messages_historyImportParsed.pm) {
                            i40.putInt("dialogsType", 12);
                        } else if (tL_messages_historyImportParsed.group) {
                            i40.putInt("dialogsType", 11);
                        } else {
                            String uri2 = uri.toString();
                            Iterator<String> it = MessagesController.getInstance(i39).exportPrivateUri.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (uri2.contains(it.next())) {
                                        i40.putInt("dialogsType", 12);
                                        z13 = true;
                                    }
                                } else {
                                    z13 = false;
                                }
                            }
                            if (!z13) {
                                Iterator<String> it2 = MessagesController.getInstance(i39).exportGroupUri.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (uri2.contains(it2.next())) {
                                            i40.putInt("dialogsType", 11);
                                            z13 = true;
                                        }
                                    }
                                }
                                if (!z13) {
                                    i40.putInt("dialogsType", 13);
                                }
                            }
                        }
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().f30588s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                            PhotoViewer.t1().G0(false, true);
                        } else if (org.telegram.ui.j4.I() && org.telegram.ui.j4.x().V) {
                            org.telegram.ui.j4.x().o(false, true);
                        }
                        ce.x();
                        j60 j60Var = j60.D3;
                        if (j60Var != null) {
                            j60Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.f29957q0.U(true, true);
                            launchActivity.f29961s0.U(true, true);
                        }
                        wy wyVar = new wy(i40);
                        wyVar.C2 = launchActivity;
                        if (!AndroidUtilities.isTablet() ? !(launchActivity.f29957q0.getFragmentStack().size() <= 1 || !(launchActivity.f29957q0.getFragmentStack().get(launchActivity.f29957q0.getFragmentStack().size() - 1) instanceof fh0)) : !(launchActivity.f29959r0.getFragmentStack().isEmpty() || !(launchActivity.f29959r0.getFragmentStack().get(launchActivity.f29959r0.getFragmentStack().size() - 1) instanceof fh0))) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        ((ActionBarLayout) launchActivity.O()).S(wyVar, z14, false);
                    } else {
                        if (launchActivity.W == null) {
                            launchActivity.W = new ArrayList();
                        }
                        launchActivity.W.add(0, launchActivity.X);
                        launchActivity.X = null;
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
            case 24:
                TLObject tLObject3 = (TLObject) this.d;
                int i41 = this.f6829b;
                String str3 = (String) this.e;
                h90 h90Var = (h90) this.f6831f;
                org.telegram.ui.ActionBar.p2 p2Var4 = (org.telegram.ui.ActionBar.p2) hc.b.i(1, ((LaunchActivity) this.f6830c).f29933d0);
                try {
                    if (tLObject3 instanceof TL_chatlists.chatlist_ChatlistInvite) {
                        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject3;
                        boolean z18 = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
                        if (z18) {
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
                        MessagesController.getInstance(i41).putChats(arrayList2, false);
                        MessagesController.getInstance(i41).putUsers(arrayList, false);
                        if (z18 && ((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                            a02 = wc.a0(p2Var4);
                            i13 = R.string.NoFolderFound;
                        } else {
                            ?? abVar = new ab(p2Var4, false);
                            abVar.Y = -1;
                            abVar.f24538c0 = "";
                            abVar.f24539d0 = new ArrayList();
                            abVar.f24541f0 = "";
                            abVar.f24543h0 = new ArrayList();
                            ArrayList arrayList16 = new ArrayList();
                            abVar.f24544i0 = arrayList16;
                            abVar.f24560z0 = -1;
                            abVar.C0 = -5;
                            abVar.X = str3;
                            abVar.Z = chatlist_chatlistinvite;
                            arrayList16.clear();
                            if (z18) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                abVar.f24538c0 = tL_textWithEntities.text;
                                abVar.f24539d0 = tL_textWithEntities.entities;
                                abVar.f24540e0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                abVar.f24542g0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                abVar.f24542g0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                abVar.f24545j0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                abVar.Y = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList17 = p2Var4.getMessagesController().dialogFilters;
                                if (arrayList17 != null) {
                                    while (true) {
                                        if (i16 < arrayList17.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList17.get(i16);
                                            if (dialogFilter.f14645id == abVar.Y) {
                                                abVar.f24538c0 = dialogFilter.name;
                                                abVar.f24539d0 = dialogFilter.entities;
                                                abVar.f24540e0 = dialogFilter.title_noanimate;
                                            } else {
                                                i16++;
                                            }
                                        }
                                    }
                                }
                            }
                            abVar.S();
                            p2Var4.showDialog(abVar);
                            h90Var.run();
                            return;
                        }
                    } else {
                        a02 = wc.a0(p2Var4);
                        i13 = R.string.NoFolderFound;
                    }
                    h90Var.run();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                org.telegram.messenger.a2.p(i13, a02, null);
                break;
            case 25:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f6830c;
                h90 h90Var2 = (h90) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f6831f;
                int i42 = this.f6829b;
                ArrayList arrayList18 = launchActivity2.f29933d0;
                if (!launchActivity2.isFinishing()) {
                    try {
                        h90Var2.run();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    if (tL_error2 == null) {
                        if (launchActivity2.f29957q0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                            TLRPC.Chat chat5 = updates2.chats.get(0);
                            chat5.left = false;
                            chat5.kicked = false;
                            MessagesController.getInstance(i42).putUsers(updates2.users, false);
                            MessagesController.getInstance(i42).putChats(updates2.chats, false);
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chat5.f17195id);
                            if (arrayList18.isEmpty() || MessagesController.getInstance(i42).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.p2) hc.b.i(1, arrayList18))) {
                                eo eoVar2 = new eo(bundle2);
                                NotificationCenter.getInstance(i42).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                                ((ActionBarLayout) launchActivity2.O()).S(eoVar2, false, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity2);
                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.AppName);
                    if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.FloodWait);
                    } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.JoinToGroupErrorFull);
                    } else {
                        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    launchActivity2.B0(alertDialog$Builder);
                    return;
                }
                return;
            case 26:
                fg0 fg0Var = (fg0) this.f6830c;
                String str4 = (String) this.d;
                String str5 = (String) this.e;
                String str6 = (String) this.f6831f;
                int i43 = this.f6829b;
                ArrayList arrayList19 = new ArrayList();
                ?? obj7 = new Object();
                obj7.f4256b = "inapp";
                obj7.f4255a = str4;
                arrayList19.add(obj7.a());
                FileLog.d("LoginBilling querying \"" + str4 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList19, new org.telegram.ui.Components.f2(fg0Var, str4, str5, str6, i43));
                return;
            case 27:
                int i44 = this.f6829b;
                g9 g9Var5 = (g9) this.e;
                TLRPC.User user4 = (TLRPC.User) this.f6831f;
                ((int[]) this.f6830c)[0] = i44;
                g9Var5.r(user4);
                ((w9) this.d).e(user4, g9Var5);
                return;
            default:
                pg.n2 n2Var = (pg.n2) this.f6830c;
                int i45 = this.f6829b;
                List list = (List) this.d;
                ArrayList arrayList20 = (ArrayList) this.e;
                or0 or0Var = (or0) this.f6831f;
                if (n2Var.I != null && !n2Var.f40200y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / n2Var.I.getWidth(), 1.0f / n2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i45);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i45 / 90) % 2 != 0) {
                        matrix.postScale(n2Var.I.getHeight(), n2Var.I.getWidth());
                    } else {
                        matrix.postScale(n2Var.I.getWidth(), n2Var.I.getHeight());
                    }
                    if (list.isEmpty()) {
                        pg.k2 k2Var = new pg.k2(n2Var);
                        k2Var.h.set(0.0f, 0.0f, n2Var.I.getWidth(), n2Var.I.getHeight());
                        k2Var.f40080i.set(k2Var.h);
                        matrix.mapRect(k2Var.f40080i);
                        k2Var.f40077c = i45;
                        Bitmap d = n2Var.d(n2Var.I, 0, 0, false);
                        k2Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        k2Var.f40078f = k2Var.c();
                        pg.n2.c(k2Var, n2Var.T, n2Var.U);
                        n2Var.O = k2Var.f40081j;
                        n2Var.P = k2Var.f40082k;
                        arrayList20.add(k2Var);
                        AndroidUtilities.runOnUIThread(new fy0(n2Var, arrayList20, or0Var, k2Var, 18));
                        n2Var.E = k2Var;
                        n2Var.f40200y = true;
                        n2Var.f40199x = false;
                        return;
                    }
                    for (int i46 = 0; i46 < list.size(); i46++) {
                        pg.m2 m2Var = (pg.m2) list.get(i46);
                        pg.k2 k2Var2 = new pg.k2(n2Var);
                        k2Var2.h.set(m2Var.f40162b, m2Var.f40163c, i14 + m2Var.d, i15 + m2Var.e);
                        k2Var2.f40080i.set(k2Var2.h);
                        matrix.mapRect(k2Var2.f40080i);
                        k2Var2.f40077c = i45;
                        Bitmap d10 = n2Var.d(m2Var.f40161a, m2Var.f40162b, m2Var.f40163c, false);
                        k2Var2.d = d10;
                        if (d10 != null) {
                            k2Var2.f40078f = k2Var2.c();
                            pg.n2.c(k2Var2, n2Var.T, n2Var.U);
                            n2Var.O = k2Var2.f40081j;
                            n2Var.P = k2Var2.f40082k;
                            arrayList20.add(k2Var2);
                        }
                    }
                    n2Var.E = null;
                    n2Var.f40200y = true;
                    n2Var.f40199x = false;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(6, n2Var, arrayList20));
                    return;
                }
                return;
        }
    }

    public o3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f6828a = i11;
        this.f6830c = obj;
        this.f6829b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f6831f = obj4;
    }

    public o3(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.f6828a = i11;
        this.f6830c = obj;
        this.d = obj2;
        this.f6829b = i10;
        this.e = obj3;
        this.f6831f = obj4;
    }

    public o3(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f6828a = i11;
        this.f6830c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f6829b = i10;
        this.f6831f = obj4;
    }

    public o3(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f6828a = i11;
        this.f6830c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f6831f = obj4;
        this.f6829b = i10;
    }

    public o3(int[] iArr, int i10, g9 g9Var, TLRPC.User user, w9 w9Var) {
        this.f6828a = 27;
        this.f6830c = iArr;
        this.f6829b = i10;
        this.e = g9Var;
        this.f6831f = user;
        this.d = w9Var;
    }
}
