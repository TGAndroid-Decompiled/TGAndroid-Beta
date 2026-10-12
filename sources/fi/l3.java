package fi;

import android.content.SharedPreferences;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import bi.n8;
import di.kc;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.yh;
import org.telegram.messenger.zg;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ss;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.cn;
import org.telegram.ui.ej;
import org.telegram.ui.fo;
import org.telegram.ui.gm;
import org.telegram.ui.jc0;
import org.telegram.ui.kg0;
import org.telegram.ui.kh0;
import org.telegram.ui.ky;
import org.telegram.ui.ln;
import org.telegram.ui.n60;
import org.telegram.ui.o00;
import org.telegram.ui.qn;
import org.telegram.ui.yy;
public final class l3 implements Runnable {
    public final int f9395a;
    public final int f9396b;
    public final Object f9397c;
    public final Object d;
    public final Object e;
    public final Object f9398f;

    public l3(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f9395a = 20;
        this.f9396b = i10;
        this.f9397c = chat;
        this.d = arrayList;
        this.e = arrayList2;
        this.f9398f = arrayList3;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        long j10;
        final long j11;
        int i10;
        boolean z12;
        int i11;
        Object obj;
        TL_iv.PageBlock pageBlock;
        String lowerCase;
        int i12;
        org.telegram.ui.ActionBar.m2 R;
        int i13;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        org.telegram.ui.Cells.u1 u1Var;
        boolean z13;
        zc a02;
        int i14;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        int i15 = this.f9395a;
        String str = "";
        TLRPC.GroupCall groupCall = null;
        boolean z14 = true;
        int i16 = 0;
        int i17 = this.f9396b;
        Object obj2 = this.d;
        Object obj3 = this.f9398f;
        Object obj4 = this.e;
        Object obj5 = this.f9397c;
        switch (i15) {
            case 0:
                long[] jArr = (long[]) obj5;
                z9 z9Var = (z9) obj2;
                z9 z9Var2 = (z9) obj4;
                TextView textView = (TextView) obj3;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i17).getUser(Long.valueOf(jArr[0]));
                    k9 k9Var = new k9((c6) null);
                    k9Var.r(user);
                    z9Var.e(user, k9Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i17).getChat(Long.valueOf(-jArr[0]));
                    k9 k9Var2 = new k9((c6) null);
                    k9Var2.q(chat);
                    z9Var.e(chat, k9Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i17).getUser(Long.valueOf(jArr[0]));
                    if (z9Var2 != null) {
                        k9 k9Var3 = new k9((c6) null);
                        k9Var3.r(user2);
                        z9Var2.e(user2, k9Var3);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user2));
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(-jArr[0]));
                if (z9Var2 != null) {
                    k9 k9Var4 = new k9((c6) null);
                    k9Var4.q(chat2);
                    z9Var2.e(chat2, k9Var4);
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
                boolean[] zArr = (boolean[]) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj4;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) obj3;
                if (!(((TLObject) obj5) instanceof TLRPC.TL_boolTrue)) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        callback.run("SERVER_ERROR");
                        return;
                    }
                    return;
                }
                TLRPC.User currentUser = UserConfig.getInstance(i17).getCurrentUser();
                if (currentUser != null) {
                    currentUser.emoji_status = updateemojistatus.emoji_status;
                    z10 = true;
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
                    MessagesController.getInstance(i17).updateEmojiStatusUntilUpdate(currentUser.f19363id, currentUser.emoji_status);
                } else {
                    z10 = true;
                }
                if (!zArr[0]) {
                    zArr[0] = z10;
                    callback.run(null);
                    return;
                }
                return;
            case 2:
                final hg.h0 h0Var = (hg.h0) obj5;
                ArrayList arrayList3 = (ArrayList) obj2;
                ArrayList arrayList4 = (ArrayList) obj4;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) obj3;
                hg.y yVar = h0Var.f10575j0;
                ArrayList arrayList6 = h0Var.f10589v0;
                int i18 = h0Var.f10586s0;
                h0Var.D0--;
                if (i17 == h0Var.f10568d0) {
                    h0Var.f10571f0 = i17;
                    if (h0Var.f10569e0 != i17) {
                        yVar.b();
                    }
                    if (h0Var.f10572g0 != i17) {
                        h0Var.I.clear();
                    }
                    h0Var.N = true;
                    int i19 = 0;
                    while (i19 < arrayList3.size()) {
                        if (!h0Var.F(arrayList3.get(i19))) {
                            arrayList3.remove(i19);
                            i19--;
                        }
                        i19++;
                    }
                    int size = arrayList6.size();
                    int i20 = 0;
                    while (i20 < arrayList3.size()) {
                        final Object obj6 = arrayList3.get(i20);
                        if (obj6 instanceof TLRPC.User) {
                            TLRPC.User user3 = (TLRPC.User) obj6;
                            j10 = 0;
                            MessagesController.getInstance(i18).putUser(user3, z14);
                            j11 = user3.f19363id;
                        } else {
                            j10 = 0;
                            if (obj6 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
                                MessagesController.getInstance(i18).putChat(chat3, z14);
                                j11 = -chat3.f19216id;
                            } else {
                                if (obj6 instanceof TLRPC.EncryptedChat) {
                                    MessagesController.getInstance(i18).putEncryptedChat((TLRPC.EncryptedChat) obj6, z14);
                                }
                                j11 = 0;
                            }
                        }
                        if (j11 != j10 && ((TLRPC.Dialog) MessagesController.getInstance(i18).dialogs_dict.f(j11)) == null) {
                            i10 = i16;
                            MessagesStorage.getInstance(i18).getDialogFolderId(j11, new MessagesStorage.IntCallback() {
                                @Override
                                public final void run(int i21) {
                                    int i22 = h0.this.f10586s0;
                                    if (i21 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j12 = j11;
                                        tL_dialog.f19220id = j12;
                                        if (i21 != 0) {
                                            tL_dialog.folder_id = i21;
                                        }
                                        Object obj7 = obj6;
                                        if (obj7 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj7) ? 1 : 0;
                                        }
                                        MessagesController.getInstance(i22).dialogs_dict.k(tL_dialog, j12);
                                        MessagesController.getInstance(i22).getAllDialogs().add(tL_dialog);
                                        MessagesController.getInstance(i22).sortDialogs(null);
                                    }
                                }
                            });
                        } else {
                            i10 = i16;
                        }
                        if (h0Var.S() && !(obj6 instanceof TLRPC.EncryptedChat)) {
                            ky kyVar = h0Var.U;
                            if (kyVar != null && kyVar.a() == j11) {
                                i11 = z14;
                            } else {
                                i11 = i10;
                            }
                            int i21 = i10;
                            while (!i11 && i21 < size) {
                                hg.g0 g0Var = (hg.g0) arrayList6.get(i21);
                                boolean z15 = z14;
                                boolean z16 = i11;
                                if (g0Var != null && g0Var.f10560c == j11) {
                                    i11 = z15;
                                } else {
                                    i11 = z16;
                                }
                                i21++;
                                z14 = z15;
                            }
                            z12 = z14;
                            if (i11) {
                                arrayList3.remove(i20);
                                arrayList4.remove(i20);
                                i20--;
                            }
                        } else {
                            z12 = z14;
                        }
                        i20++;
                        i16 = i10;
                        z14 = z12;
                    }
                    boolean z17 = z14;
                    int i22 = i16;
                    MessagesController.getInstance(i18).putUsers(arrayList5, z17);
                    h0Var.f10585s = arrayList3;
                    h0Var.G = arrayList4;
                    yVar.f(arrayList3, arrayList6);
                    h0Var.l();
                    ky kyVar2 = h0Var.U;
                    if (kyVar2 != null) {
                        if (h0Var.D0 > 0) {
                            z11 = z17;
                        } else {
                            z11 = i22;
                        }
                        kyVar2.d(z11, z17);
                        h0Var.U.c();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                hg.t1 t1Var = (hg.t1) obj5;
                ArrayList arrayList7 = (ArrayList) obj2;
                ArrayList arrayList8 = (ArrayList) obj4;
                ArrayList arrayList9 = (ArrayList) obj3;
                if (i17 == t1Var.E) {
                    t1Var.d = arrayList7;
                    t1Var.e = arrayList8;
                    t1Var.H = arrayList9;
                    t1Var.f10748f.f(arrayList7, null);
                    t1Var.f10754y = false;
                    t1Var.l();
                    t1Var.F();
                    return;
                }
                return;
            case 4:
                Pair pair = (Pair) obj2;
                ((i2.g1) obj5).f10977b.h.i(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) obj4, (u2.c0) obj3, this.f9396b);
                return;
            case 5:
                m4.q0 q0Var = (m4.q0) obj5;
                m4.p1 p1Var = (m4.p1) obj2;
                n4.t tVar = (n4.t) obj4;
                m4.p0 p0Var = (m4.p0) obj3;
                qi.e eVar = q0Var.f15572f;
                if (!q0Var.f15573g.j()) {
                    if (!((n4.n) q0Var.f15578m.f16031b).f16014a.isActive()) {
                        StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                        if (p1Var == null) {
                            obj = Integer.valueOf(i17);
                        } else {
                            obj = p1Var.f15569b;
                        }
                        sb2.append(obj);
                        sb2.append(", pid=");
                        sb2.append(tVar.f16033a.f16035b);
                        e2.a.l("MediaSessionLegacyStub", sb2.toString());
                        return;
                    }
                    m4.w L = q0Var.L(tVar);
                    if (p1Var != null) {
                        if (!eVar.x(L, p1Var)) {
                            return;
                        }
                    } else if (!eVar.v(L, i17)) {
                        return;
                    }
                    try {
                        p0Var.f(L);
                        return;
                    } catch (RemoteException e) {
                        e2.a.m("MediaSessionLegacyStub", "Exception in " + L, e);
                        return;
                    }
                }
                return;
            case 6:
                LocationController.lambda$fetchLocationAddress$29((Locale) obj5, (Location) obj2, i17, (Locale) obj4, (LocationController.LocationFetchCallback) obj3);
                return;
            case 7:
                ((MediaDataController) obj5).lambda$removeMultipleStickerSets$110((boolean[]) obj2, (ArrayList) obj4, i17, (int[]) obj3);
                return;
            case 8:
                ((MessagesController) obj5).lambda$processUpdateArray$406((zf.s) obj2, (ConcurrentHashMap) obj4, (ConcurrentHashMap) obj3, i17);
                return;
            case 9:
                ((MessagesStorage) obj5).lambda$getSentFile$164((String) obj2, i17, (Object[]) obj4, (CountDownLatch) obj3);
                return;
            case 10:
                ((MessagesStorage) obj5).lambda$putSentFile$170((String) obj2, (TLObject) obj4, i17, (String) obj3);
                return;
            case 11:
                ((NotificationCenter) obj5).lambda$listen$5((View) obj2, (View.OnAttachStateChangeListener) obj4, (zg) obj3, i17);
                return;
            case 12:
                ((TelegramMediaSession) obj5).lambda$loadChats$4(i17, (ArrayList) obj2, (a0.h) obj4, (a0.h) obj3);
                return;
            case 13:
                ((VoIPService) obj5).lambda$startConferenceGroupCall$33((TLObject) obj2, i17, (String) obj4, (TLRPC.TL_error) obj3);
                return;
            case 14:
                org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) obj5;
                ArrayList arrayList10 = (ArrayList) obj2;
                HashMap hashMap = (HashMap) obj4;
                String str2 = (String) obj3;
                ArrayList arrayList11 = new ArrayList();
                int size2 = arrayList10.size();
                for (int i23 = 0; i23 < size2; i23++) {
                    Object obj7 = arrayList10.get(i23);
                    TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) hashMap.get(obj7);
                    if (obj7 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj7;
                        CharSequence C = org.telegram.ui.k4.C(k4Var, k4Var.f37557u0[0].f38848c.E, null, richText, richText, pageBlock2, 1000);
                        pageBlock = pageBlock2;
                        if (!TextUtils.isEmpty(C)) {
                            lowerCase = C.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        pageBlock = pageBlock2;
                        if (obj7 instanceof String) {
                            lowerCase = ((String) obj7).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i24 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str2, i24);
                            if (indexOf >= 0) {
                                int length = str2.length() + indexOf;
                                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                                    ?? obj8 = new Object();
                                    obj8.f40280a = indexOf;
                                    obj8.f40282c = pageBlock;
                                    obj8.f40281b = obj7;
                                    arrayList11.add(obj8);
                                }
                                i24 = length;
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new n8(k4Var, this.f9396b, arrayList11, str2, 10));
                return;
            case 15:
                TLObject tLObject = (TLObject) obj5;
                HashSet hashSet = (HashSet) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj3;
                boolean z18 = tLObject instanceof TLRPC.Updates;
                int i25 = this.f9396b;
                if (z18) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(i25).putUsers(updates.users, false);
                    MessagesController.getInstance(i25).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size3 = findUpdatesAndRemove.size();
                    while (i16 < size3) {
                        Object obj9 = findUpdatesAndRemove.get(i16);
                        i16++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj9).call;
                    }
                    if (LaunchActivity.G1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f19233id = groupCall.f19226id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.d2.g(LaunchActivity.G1, i25, tL_inputGroupCall, false, groupCall, hashSet);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    MessagesController.getInstance(i25).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i25).putChats(groupcall.chats, false);
                    if (LaunchActivity.G1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.f19233id = groupCall2.f19226id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.d2.g(LaunchActivity.G1, i25, tL_inputGroupCall2, false, groupCall2, hashSet);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    zc.a0(m2Var).f0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 16:
                fo.V((fo) obj5, i17, (Boolean) obj2, (TLRPC.WebPage) obj4, (TL_account.getWebPagePreview) obj3);
                return;
            case 17:
                qn qnVar = (qn) obj5;
                ej ejVar = (ej) obj2;
                ejVar.f43197b = qnVar.f39497a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) obj4).f19216id, i17, new ln(qnVar, ejVar, (fo) obj3));
                return;
            case 18:
                qn qnVar2 = (qn) obj5;
                MessageObject messageObject = (MessageObject) obj2;
                Integer num = (Integer) obj4;
                byte[] bArr = (byte[]) obj3;
                fo foVar = qnVar2.f39497a;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == foVar.L6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                foVar.bb(this.f9396b, id2, true, i12, true, 0, num, bArr, new cn(qnVar2, messageObject, 1));
                return;
            case 19:
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj5;
                int[] iArr = (int[]) obj2;
                Runnable runnable = (Runnable) obj4;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj3;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    a2Var.setOnCancelListener(new org.telegram.ui.Components.z1(iArr, runnable, i17));
                    m2Var2.showDialog(a2VarArr[0]);
                    return;
                }
                return;
            case 20:
                TLRPC.Chat chat4 = (TLRPC.Chat) obj5;
                ArrayList arrayList12 = (ArrayList) obj2;
                ArrayList arrayList13 = (ArrayList) obj4;
                ArrayList arrayList14 = (ArrayList) obj3;
                if (LaunchActivity.C1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    sg.j0 j0Var = new sg.j0(11, this.f9396b, R.getParentActivity(), R, null);
                    j0Var.J1(chat4, arrayList12, arrayList13, arrayList14, null);
                    j0Var.show();
                    return;
                }
                return;
            case 21:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) obj2;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) obj4;
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) obj3;
                SharedPreferences.Editor edit = ((SharedPreferences) obj5).edit();
                edit.putLong("support_id2", tL_help_support.user.f19363id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    a2Var2.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                ArrayList arrayList15 = new ArrayList();
                arrayList15.add(tL_help_support.user);
                MessagesStorage.getInstance(i17).putUsersAndChats(arrayList15, null, true, true);
                MessagesController.getInstance(i17).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.f19363id);
                m2Var3.presentFragment(new fo(bundle));
                return;
            case 22:
                ss.Q((ss) obj5, (TLObject) obj2, (TLRPC.InputPeer) obj4, i17, (int[]) obj3);
                return;
            case 23:
                ww0 ww0Var = (ww0) obj5;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj2;
                MessageObject messageObject2 = (MessageObject) obj4;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) obj3;
                int[] iArr2 = ww0Var.e;
                RLottieNative[] rLottieNativeArr = ww0Var.f30988f1;
                if (ww0Var.W0) {
                    AndroidUtilities.runOnUIThread(new uw0(ww0Var, 2));
                    return;
                }
                int i26 = 0;
                boolean z19 = false;
                while (true) {
                    int length2 = rLottieNativeArr.length;
                    int i27 = this.f9396b;
                    if (i26 < length2) {
                        if (rLottieNativeArr[i26] == null) {
                            if (i26 == 0) {
                                i13 = 1;
                            } else if (i26 == 1) {
                                i13 = 8;
                            } else if (i26 == 2) {
                                i13 = 14;
                            } else if (i26 == 3) {
                                i13 = 20;
                            } else {
                                i13 = 2;
                            }
                            if (i13 < tL_messages_stickerSet2.documents.size()) {
                                TLRPC.Document document = tL_messages_stickerSet2.documents.get(i13);
                                String readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                                if (TextUtils.isEmpty(readRes)) {
                                    tL_messages_stickerSet = tL_messages_stickerSet2;
                                    u1Var = u1Var2;
                                    AndroidUtilities.runOnUIThread(new vw0(document, i27, messageObject2, u1Var2, tL_messages_stickerSet, 1));
                                    z19 = true;
                                } else {
                                    tL_messages_stickerSet = tL_messages_stickerSet2;
                                    u1Var = u1Var2;
                                    rLottieNativeArr[i26] = RLottieNative.b(readRes, iArr2, null, null);
                                    ww0Var.f30989g1[i26] = iArr2[0];
                                }
                                i26++;
                                u1Var2 = u1Var;
                                tL_messages_stickerSet2 = tL_messages_stickerSet;
                            }
                        }
                        tL_messages_stickerSet = tL_messages_stickerSet2;
                        u1Var = u1Var2;
                        i26++;
                        u1Var2 = u1Var;
                        tL_messages_stickerSet2 = tL_messages_stickerSet;
                    } else {
                        org.telegram.ui.Cells.u1 u1Var3 = u1Var2;
                        if (z19) {
                            AndroidUtilities.runOnUIThread(new uw0(ww0Var, 3));
                            return;
                        } else {
                            AndroidUtilities.runOnUIThread(new gm(ww0Var, i27, u1Var3, 19));
                            return;
                        }
                    }
                }
            case 24:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                TLObject tLObject2 = (TLObject) obj2;
                Uri uri = (Uri) obj4;
                org.telegram.ui.ActionBar.a2 a2Var3 = (org.telegram.ui.ActionBar.a2) obj3;
                Pattern pattern = LaunchActivity.B1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject2 != null && launchActivity.f32133q0 != null) {
                        TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject2;
                        Bundle h = a1.g.h("onlySelect", true);
                        h.putString("importTitle", tL_messages_historyImportParsed.title);
                        h.putBoolean("allowSwitchAccount", true);
                        if (tL_messages_historyImportParsed.pm) {
                            h.putInt("dialogsType", 12);
                        } else if (tL_messages_historyImportParsed.group) {
                            h.putInt("dialogsType", 11);
                        } else {
                            String uri2 = uri.toString();
                            Iterator<String> it = MessagesController.getInstance(i17).exportPrivateUri.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (uri2.contains(it.next())) {
                                        h.putInt("dialogsType", 12);
                                        z13 = true;
                                    }
                                } else {
                                    z13 = false;
                                }
                            }
                            if (!z13) {
                                Iterator<String> it2 = MessagesController.getInstance(i17).exportGroupUri.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (uri2.contains(it2.next())) {
                                            h.putInt("dialogsType", 11);
                                            z13 = true;
                                        }
                                    }
                                }
                                if (!z13) {
                                    h.putInt("dialogsType", 13);
                                }
                            }
                        }
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().f32767s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
                            PhotoViewer.t1().G0(false, true);
                        } else if (org.telegram.ui.k4.I() && org.telegram.ui.k4.x().V) {
                            org.telegram.ui.k4.x().o(false, true);
                        }
                        kc.w();
                        n60 n60Var = n60.D3;
                        if (n60Var != null) {
                            n60Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.f32133q0.U(true, true);
                            launchActivity.f32137s0.U(true, true);
                        }
                        yy yyVar = new yy(h);
                        yyVar.C2 = launchActivity;
                        if (!AndroidUtilities.isTablet() ? launchActivity.f32133q0.getFragmentStack().size() <= 1 || !(launchActivity.f32133q0.getFragmentStack().get(launchActivity.f32133q0.getFragmentStack().size() - 1) instanceof kh0) : launchActivity.f32135r0.getFragmentStack().isEmpty() || !(launchActivity.f32135r0.getFragmentStack().get(launchActivity.f32135r0.getFragmentStack().size() - 1) instanceof kh0)) {
                            z14 = false;
                        }
                        ((ActionBarLayout) launchActivity.O()).S(yyVar, z14, false);
                    } else {
                        if (launchActivity.W == null) {
                            launchActivity.W = new ArrayList();
                        }
                        launchActivity.W.add(0, launchActivity.X);
                        launchActivity.X = null;
                        launchActivity.i0(true);
                    }
                    try {
                        a2Var3.dismiss();
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            case 25:
                TLObject tLObject3 = (TLObject) obj2;
                String str3 = (String) obj4;
                o00 o00Var = (o00) obj3;
                org.telegram.ui.ActionBar.m2 m2Var4 = (org.telegram.ui.ActionBar.m2) i2.d.g(1, ((LaunchActivity) obj5).f32109d0);
                try {
                    if (tLObject3 instanceof TL_chatlists.chatlist_ChatlistInvite) {
                        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject3;
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
                        MessagesController.getInstance(i17).putChats(arrayList2, false);
                        MessagesController.getInstance(i17).putUsers(arrayList, false);
                        if (z20 && ((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                            a02 = zc.a0(m2Var4);
                            i14 = R.string.NoFolderFound;
                        } else {
                            ?? dbVar = new db(m2Var4, false);
                            dbVar.Y = -1;
                            dbVar.f27770c0 = "";
                            dbVar.f27771d0 = new ArrayList();
                            dbVar.f27773f0 = "";
                            dbVar.f27775h0 = new ArrayList();
                            ArrayList arrayList16 = new ArrayList();
                            dbVar.f27776i0 = arrayList16;
                            dbVar.f27792z0 = -1;
                            dbVar.C0 = -5;
                            dbVar.X = str3;
                            dbVar.Z = chatlist_chatlistinvite;
                            arrayList16.clear();
                            if (z20) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                dbVar.f27770c0 = tL_textWithEntities.text;
                                dbVar.f27771d0 = tL_textWithEntities.entities;
                                dbVar.f27772e0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                dbVar.f27774g0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                dbVar.f27774g0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                dbVar.f27777j0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                dbVar.Y = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList17 = m2Var4.getMessagesController().dialogFilters;
                                if (arrayList17 != null) {
                                    while (true) {
                                        if (i16 < arrayList17.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList17.get(i16);
                                            if (dialogFilter.f16708id == dbVar.Y) {
                                                dbVar.f27770c0 = dialogFilter.name;
                                                dbVar.f27771d0 = dialogFilter.entities;
                                                dbVar.f27772e0 = dialogFilter.title_noanimate;
                                            } else {
                                                i16++;
                                            }
                                        }
                                    }
                                }
                            }
                            dbVar.T();
                            m2Var4.showDialog(dbVar);
                            o00Var.run();
                            return;
                        }
                    } else {
                        a02 = zc.a0(m2Var4);
                        i14 = R.string.NoFolderFound;
                    }
                    o00Var.run();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                yh.p(i14, a02, null);
                break;
            case 26:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                o00 o00Var2 = (o00) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj3;
                ArrayList arrayList18 = launchActivity2.f32109d0;
                if (!launchActivity2.isFinishing()) {
                    try {
                        o00Var2.run();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    if (tL_error2 == null) {
                        if (launchActivity2.f32133q0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                            TLRPC.Chat chat5 = updates2.chats.get(0);
                            chat5.left = false;
                            chat5.kicked = false;
                            MessagesController.getInstance(i17).putUsers(updates2.users, false);
                            MessagesController.getInstance(i17).putChats(updates2.chats, false);
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chat5.f19216id);
                            if (arrayList18.isEmpty() || MessagesController.getInstance(i17).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.m2) i2.d.g(1, arrayList18))) {
                                fo foVar2 = new fo(bundle2);
                                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                                ((ActionBarLayout) launchActivity2.O()).S(foVar2, false, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity2);
                    String string = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.a2 a2Var4 = alertDialog$Builder.f19548a;
                    a2Var4.R = string;
                    if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                        a2Var4.T = LocaleController.getString(R.string.FloodWait);
                    } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                        a2Var4.T = LocaleController.getString(R.string.JoinToGroupErrorFull);
                    } else {
                        a2Var4.T = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    launchActivity2.B0(alertDialog$Builder);
                    return;
                }
                return;
            case 27:
                ((jc0) obj5).v((String) obj2, i17 + 1, (String) obj4, (String) obj3);
                return;
            case 28:
                String str4 = (String) obj2;
                ArrayList arrayList19 = new ArrayList();
                c5.a aVar = new c5.a();
                aVar.f4324c = "inapp";
                aVar.f4323b = str4;
                arrayList19.add(aVar.a());
                FileLog.d("LoginBilling querying \"" + str4 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList19, new org.telegram.ui.Components.e2((kg0) obj5, str4, (String) obj4, (String) obj3, this.f9396b));
                return;
            default:
                k9 k9Var5 = (k9) obj4;
                TLRPC.User user4 = (TLRPC.User) obj3;
                ((int[]) obj5)[0] = i17;
                k9Var5.r(user4);
                ((z9) obj2).e(user4, k9Var5);
                return;
        }
    }

    public l3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f9395a = i11;
        this.f9397c = obj;
        this.f9396b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f9398f = obj4;
    }

    public l3(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.f9395a = i11;
        this.f9397c = obj;
        this.d = obj2;
        this.f9396b = i10;
        this.e = obj3;
        this.f9398f = obj4;
    }

    public l3(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f9395a = i11;
        this.f9397c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f9396b = i10;
        this.f9398f = obj4;
    }

    public l3(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f9395a = i11;
        this.f9397c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f9398f = obj4;
        this.f9396b = i10;
    }

    public l3(int[] iArr, int i10, k9 k9Var, TLRPC.User user, z9 z9Var) {
        this.f9395a = 29;
        this.f9397c = iArr;
        this.f9396b = i10;
        this.e = k9Var;
        this.f9398f = user;
        this.d = z9Var;
    }
}
