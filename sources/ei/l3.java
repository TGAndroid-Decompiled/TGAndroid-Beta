package ei;

import ai.c9;
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
import ci.lc;
import j$.util.concurrent.ConcurrentHashMap;
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
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ok;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.xg;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xm;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.cy;
import org.telegram.ui.d60;
import org.telegram.ui.dn;
import org.telegram.ui.gr0;
import org.telegram.ui.in;
import org.telegram.ui.jr0;
import org.telegram.ui.n80;
import org.telegram.ui.qy;
import org.telegram.ui.um;
import org.telegram.ui.wn;
import org.telegram.ui.xi;
import org.telegram.ui.yg0;
import org.telegram.ui.zf0;
public final class l3 implements Runnable {
    public final int f8457a;
    public final int f8458b;
    public final Object f8459c;
    public final Object d;
    public final Object e;
    public final Object f8460f;

    public l3(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f8457a = 20;
        this.f8458b = i10;
        this.f8459c = chat;
        this.d = arrayList;
        this.e = arrayList2;
        this.f8460f = arrayList3;
    }

    @Override
    public final void run() {
        boolean z10;
        char c10;
        final long j3;
        long j10;
        Object obj;
        String lowerCase;
        org.telegram.ui.ActionBar.m2 R;
        boolean z11;
        xc a02;
        int i10;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        int i11;
        int i12;
        long j11 = 0;
        int i13 = 0;
        switch (this.f8457a) {
            case 0:
                long[] jArr = (long[]) this.f8459c;
                int i14 = this.f8458b;
                w9 w9Var = (w9) this.d;
                w9 w9Var2 = (w9) this.e;
                TextView textView = (TextView) this.f8460f;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(jArr[0]));
                    h9 h9Var = new h9((d6) null);
                    h9Var.r(user);
                    w9Var.e(user, h9Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-jArr[0]));
                    h9 h9Var2 = new h9((d6) null);
                    h9Var2.q(chat);
                    w9Var.e(chat, h9Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(jArr[0]));
                    if (w9Var2 != null) {
                        h9 h9Var3 = new h9((d6) null);
                        h9Var3.r(user2);
                        w9Var2.e(user2, h9Var3);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user2));
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat2 = MessagesController.getInstance(i14).getChat(Long.valueOf(-jArr[0]));
                if (w9Var2 != null) {
                    h9 h9Var4 = new h9((d6) null);
                    h9Var4.q(chat2);
                    w9Var2.e(chat2, h9Var4);
                }
                if (textView != null) {
                    textView.setText(chat2 != null ? chat2.title : "");
                    return;
                }
                return;
            case 1:
                boolean[] zArr = (boolean[]) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                int i15 = this.f8458b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f8460f;
                if (!(((TLObject) this.f8459c) instanceof TLRPC.TL_boolTrue)) {
                    if (zArr[0]) {
                        return;
                    }
                    zArr[0] = true;
                    callback.run("SERVER_ERROR");
                    return;
                }
                TLRPC.User currentUser = UserConfig.getInstance(i15).getCurrentUser();
                if (currentUser != null) {
                    currentUser.emoji_status = updateemojistatus.emoji_status;
                    z10 = true;
                    c10 = 0;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
                    MessagesController.getInstance(i15).updateEmojiStatusUntilUpdate(currentUser.f18482id, currentUser.emoji_status);
                } else {
                    z10 = true;
                    c10 = 0;
                }
                if (zArr[c10]) {
                    return;
                }
                zArr[c10] = z10;
                callback.run(null);
                return;
            case 2:
                final gg.i0 i0Var = (gg.i0) this.f8459c;
                int i16 = this.f8458b;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) this.f8460f;
                gg.z zVar = i0Var.f9754j0;
                ArrayList arrayList6 = i0Var.f9768v0;
                int i17 = i0Var.f9765s0;
                i0Var.D0--;
                if (i16 != i0Var.f9747d0) {
                    return;
                }
                i0Var.f9750f0 = i16;
                if (i0Var.f9748e0 != i16) {
                    zVar.b();
                }
                if (i0Var.f9751g0 != i16) {
                    i0Var.I.clear();
                }
                i0Var.N = true;
                int i18 = 0;
                while (i18 < arrayList3.size()) {
                    if (!i0Var.F(arrayList3.get(i18))) {
                        arrayList3.remove(i18);
                        i18--;
                    }
                    i18++;
                }
                boolean z12 = true;
                int size = arrayList6.size();
                int i19 = 0;
                while (i19 < arrayList3.size()) {
                    final Object obj2 = arrayList3.get(i19);
                    if (obj2 instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) obj2;
                        MessagesController.getInstance(i17).putUser(user3, z12);
                        j3 = user3.f18482id;
                    } else if (obj2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj2;
                        MessagesController.getInstance(i17).putChat(chat3, z12);
                        j3 = -chat3.f18335id;
                    } else {
                        if (obj2 instanceof TLRPC.EncryptedChat) {
                            MessagesController.getInstance(i17).putEncryptedChat((TLRPC.EncryptedChat) obj2, z12);
                        }
                        j3 = j11;
                    }
                    if (j3 == j11 || ((TLRPC.Dialog) MessagesController.getInstance(i17).dialogs_dict.f(j3)) != null) {
                        j10 = j11;
                    } else {
                        j10 = j11;
                        MessagesStorage.getInstance(i17).getDialogFolderId(j3, new MessagesStorage.IntCallback() {
                            @Override
                            public final void run(int i20) {
                                int i21 = i0.this.f9765s0;
                                if (i20 != -1) {
                                    TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                    long j12 = j3;
                                    tL_dialog.f18339id = j12;
                                    if (i20 != 0) {
                                        tL_dialog.folder_id = i20;
                                    }
                                    Object obj3 = obj2;
                                    if (obj3 instanceof TLRPC.Chat) {
                                        tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj3) ? 1 : 0;
                                    }
                                    MessagesController.getInstance(i21).dialogs_dict.k(tL_dialog, j12);
                                    MessagesController.getInstance(i21).getAllDialogs().add(tL_dialog);
                                    MessagesController.getInstance(i21).sortDialogs(null);
                                }
                            }
                        });
                    }
                    if (i0Var.S() && !(obj2 instanceof TLRPC.EncryptedChat)) {
                        cy cyVar = i0Var.U;
                        boolean z13 = cyVar != null && cyVar.a() == j3;
                        int i20 = 0;
                        while (!z13 && i20 < size) {
                            gg.h0 h0Var = (gg.h0) arrayList6.get(i20);
                            int i21 = i20;
                            z13 = (h0Var == null || h0Var.f9737c != j3) ? z13 : true;
                            i20 = i21 + 1;
                        }
                        if (z13) {
                            arrayList3.remove(i19);
                            arrayList4.remove(i19);
                            i19--;
                        }
                    }
                    i19++;
                    j11 = j10;
                    z12 = true;
                }
                MessagesController.getInstance(i17).putUsers(arrayList5, true);
                i0Var.f9764s = arrayList3;
                i0Var.G = arrayList4;
                zVar.f(arrayList3, arrayList6);
                i0Var.l();
                cy cyVar2 = i0Var.U;
                if (cyVar2 != null) {
                    cyVar2.d(i0Var.D0 > 0, true);
                    i0Var.U.c();
                    return;
                }
                return;
            case 3:
                gg.u1 u1Var = (gg.u1) this.f8459c;
                int i22 = this.f8458b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                ArrayList arrayList9 = (ArrayList) this.f8460f;
                if (i22 == u1Var.E) {
                    u1Var.d = arrayList7;
                    u1Var.e = arrayList8;
                    u1Var.H = arrayList9;
                    u1Var.f9929f.f(arrayList7, null);
                    u1Var.f9935y = false;
                    u1Var.l();
                    u1Var.F();
                    return;
                }
                return;
            case 4:
                Pair pair = (Pair) this.d;
                ((i2.d1) this.f8459c).f10626b.h.h(((Integer) pair.first).intValue(), (u2.f0) pair.second, (u2.t) this.e, (u2.b0) this.f8460f, this.f8458b);
                return;
            case 5:
                m4.k0 k0Var = (m4.k0) this.f8459c;
                m4.g1 g1Var = (m4.g1) this.d;
                int i23 = this.f8458b;
                n4.a0 a0Var = (n4.a0) this.e;
                m4.j0 j0Var = (m4.j0) this.f8460f;
                oi.f fVar = k0Var.f14851f;
                if (k0Var.f14852g.j()) {
                    return;
                }
                if (!((n4.r) k0Var.f14855k.f15222b).f15203a.isActive()) {
                    StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                    sb2.append(g1Var == null ? Integer.valueOf(i23) : g1Var.f14818b);
                    sb2.append(", pid=");
                    sb2.append(a0Var.f15157a.f15159b);
                    e2.a.n("MediaSessionLegacyStub", sb2.toString());
                    return;
                }
                m4.r L = k0Var.L(a0Var);
                if (g1Var != null) {
                    if (!fVar.D(L, g1Var)) {
                        return;
                    }
                } else if (!fVar.C(L, i23)) {
                    return;
                }
                try {
                    j0Var.g(L);
                    return;
                } catch (RemoteException e) {
                    e2.a.o("MediaSessionLegacyStub", "Exception in " + L, e);
                    return;
                }
            case 6:
                LocationController.lambda$fetchLocationAddress$29((Locale) this.f8459c, (Location) this.d, this.f8458b, (Locale) this.e, (LocationController.LocationFetchCallback) this.f8460f);
                return;
            case 7:
                ((MediaDataController) this.f8459c).lambda$removeMultipleStickerSets$110((boolean[]) this.d, (ArrayList) this.e, this.f8458b, (int[]) this.f8460f);
                return;
            case 8:
                ((MessagesController) this.f8459c).lambda$processUpdateArray$403((yf.r) this.d, (ConcurrentHashMap) this.e, (ConcurrentHashMap) this.f8460f, this.f8458b);
                return;
            case 9:
                ((MessagesStorage) this.f8459c).lambda$getSentFile$164((String) this.d, this.f8458b, (Object[]) this.e, (CountDownLatch) this.f8460f);
                return;
            case 10:
                ((MessagesStorage) this.f8459c).lambda$putSentFile$170((String) this.d, (TLObject) this.e, this.f8458b, (String) this.f8460f);
                return;
            case 11:
                ((NotificationCenter) this.f8459c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.e, (xg) this.f8460f, this.f8458b);
                return;
            case 12:
                ((TelegramMediaSession) this.f8459c).lambda$loadChats$4(this.f8458b, (ArrayList) this.d, (a0.i) this.e, (a0.i) this.f8460f);
                return;
            case 13:
                ((VoIPService) this.f8459c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.f8458b, (String) this.e, (TLRPC.TL_error) this.f8460f);
                return;
            case 14:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f8459c;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                String str = (String) this.f8460f;
                int i24 = this.f8458b;
                ArrayList arrayList11 = new ArrayList();
                int size2 = arrayList10.size();
                int i25 = 0;
                while (i25 < size2) {
                    Object obj3 = arrayList10.get(i25);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj3);
                    if (obj3 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj3;
                        obj = obj3;
                        CharSequence C = org.telegram.ui.i4.C(i4Var, i4Var.f34407u0[i13].f35461c.E, null, richText, richText, pageBlock, 1000);
                        if (!TextUtils.isEmpty(C)) {
                            lowerCase = C.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        obj = obj3;
                        if (obj instanceof String) {
                            lowerCase = ((String) obj).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i26 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str, i26);
                            if (indexOf >= 0) {
                                int length = str.length() + indexOf;
                                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                                    ?? obj4 = new Object();
                                    obj4.f37176a = indexOf;
                                    obj4.f37178c = pageBlock;
                                    obj4.f37177b = obj;
                                    arrayList11.add(obj4);
                                }
                                i26 = length;
                            }
                        }
                    }
                    i25++;
                    i13 = 0;
                }
                AndroidUtilities.runOnUIThread(new c9(i4Var, i24, arrayList11, str, 10));
                return;
            case 15:
                TLObject tLObject = (TLObject) this.f8459c;
                int i27 = this.f8458b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f8460f;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(i27).putUsers(updates.users, false);
                    MessagesController.getInstance(i27).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size3 = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i13 < size3) {
                        Object obj5 = findUpdatesAndRemove.get(i13);
                        i13++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj5).call;
                    }
                    if (LaunchActivity.G1 == null || groupCall == null) {
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    tL_inputGroupCall.f18352id = groupCall.f18345id;
                    tL_inputGroupCall.access_hash = groupCall.access_hash;
                    org.telegram.ui.Components.voip.g2.g(LaunchActivity.G1, i27, tL_inputGroupCall, false, groupCall, hashSet);
                    return;
                } else if (!(tLObject instanceof TL_phone.groupCall)) {
                    if (tL_error != null) {
                        xc.a0(m2Var).d0(tL_error, false);
                        return;
                    }
                    return;
                } else {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    MessagesController.getInstance(i27).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i27).putChats(groupcall.chats, false);
                    if (LaunchActivity.G1 == null) {
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f18352id = groupCall2.f18345id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    org.telegram.ui.Components.voip.g2.g(LaunchActivity.G1, i27, tL_inputGroupCall2, false, groupCall2, hashSet);
                    return;
                }
            case 16:
                wn.t1((wn) this.f8459c, this.f8458b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f8460f);
                return;
            case 17:
                in inVar = (in) this.f8459c;
                xi xiVar = (xi) this.d;
                xiVar.f15437b = inVar.f34557a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.e).f18335id, this.f8458b, new dn(inVar, xiVar, (wn) this.f8460f));
                return;
            case 18:
                in inVar2 = (in) this.f8459c;
                int i28 = this.f8458b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f8460f;
                wn wnVar = inVar2.f34557a;
                wnVar.Xa(i28, messageObject.getId(), true, messageObject.getDialogId() == wnVar.L6 ? 1 : 0, true, 0, num, bArr, new um(inVar2, messageObject, 1));
                return;
            case 19:
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) this.f8459c;
                int[] iArr = (int[]) this.d;
                int i29 = this.f8458b;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.f8460f;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var == null) {
                    return;
                }
                a2Var.setOnCancelListener(new org.telegram.ui.Components.z1(iArr, runnable, i29));
                m2Var2.showDialog(a2VarArr[0]);
                return;
            case 20:
                int i30 = this.f8458b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.f8459c;
                ArrayList arrayList12 = (ArrayList) this.d;
                ArrayList arrayList13 = (ArrayList) this.e;
                ArrayList arrayList14 = (ArrayList) this.f8460f;
                if (!LaunchActivity.C1 || (R = LaunchActivity.R()) == null || R.getParentActivity() == null) {
                    return;
                }
                rg.j0 j0Var2 = new rg.j0(11, i30, R.getParentActivity(), R, null);
                j0Var2.I1(chat4, arrayList12, arrayList13, arrayList14, null);
                j0Var2.show();
                return;
            case 21:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.e;
                int i31 = this.f8458b;
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) this.f8460f;
                SharedPreferences.Editor edit = ((SharedPreferences) this.f8459c).edit();
                edit.putLong("support_id2", tL_help_support.user.f18482id);
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
                MessagesStorage.getInstance(i31).putUsersAndChats(arrayList15, null, true, true);
                MessagesController.getInstance(i31).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.f18482id);
                m2Var3.presentFragment(new wn(bundle));
                return;
            case 22:
                gs.P((gs) this.f8459c, (TLObject) this.d, (TLRPC.InputPeer) this.e, this.f8458b, (int[]) this.f8460f);
                return;
            case 23:
                iw0 iw0Var = (iw0) this.f8459c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i32 = this.f8458b;
                MessageObject messageObject2 = (MessageObject) this.e;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.f8460f;
                int[] iArr2 = iw0Var.e;
                RLottieNative[] rLottieNativeArr = iw0Var.f25181f1;
                if (iw0Var.W0) {
                    AndroidUtilities.runOnUIThread(new gw0(iw0Var, 2));
                    return;
                }
                boolean z14 = false;
                int i33 = 0;
                while (i33 < rLottieNativeArr.length) {
                    if (rLottieNativeArr[i33] == null) {
                        int i34 = i33 == 0 ? 1 : i33 == 1 ? 8 : i33 == 2 ? 14 : i33 == 3 ? 20 : 2;
                        if (i34 < tL_messages_stickerSet.documents.size()) {
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i34);
                            String readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(readRes)) {
                                AndroidUtilities.runOnUIThread(new hw0(document, i32, messageObject2, u1Var2, tL_messages_stickerSet, 1));
                                z14 = true;
                            } else {
                                rLottieNativeArr[i33] = RLottieNative.b(readRes, iArr2, null, null);
                                iw0Var.f25182g1[i33] = iArr2[0];
                            }
                        }
                    }
                    i33++;
                }
                if (z14) {
                    AndroidUtilities.runOnUIThread(new gw0(iw0Var, 3));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new xm(iw0Var, i32, u1Var2, 17));
                    return;
                }
            case 24:
                LaunchActivity launchActivity = (LaunchActivity) this.f8459c;
                TLObject tLObject2 = (TLObject) this.d;
                Uri uri = (Uri) this.e;
                int i35 = this.f8458b;
                org.telegram.ui.ActionBar.a2 a2Var3 = (org.telegram.ui.ActionBar.a2) this.f8460f;
                Pattern pattern = LaunchActivity.B1;
                if (launchActivity.isFinishing()) {
                    return;
                }
                if (tLObject2 != null && launchActivity.f31130q0 != null) {
                    TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject2;
                    Bundle i36 = a4.a.i("onlySelect", true);
                    i36.putString("importTitle", tL_messages_historyImportParsed.title);
                    i36.putBoolean("allowSwitchAccount", true);
                    if (tL_messages_historyImportParsed.pm) {
                        i36.putInt("dialogsType", 12);
                    } else if (tL_messages_historyImportParsed.group) {
                        i36.putInt("dialogsType", 11);
                    } else {
                        String uri2 = uri.toString();
                        Iterator<String> it = MessagesController.getInstance(i35).exportPrivateUri.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z11 = false;
                            } else if (uri2.contains(it.next())) {
                                i36.putInt("dialogsType", 12);
                                z11 = true;
                            }
                        }
                        if (!z11) {
                            Iterator<String> it2 = MessagesController.getInstance(i35).exportGroupUri.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (uri2.contains(it2.next())) {
                                        i36.putInt("dialogsType", 11);
                                        z11 = true;
                                    }
                                }
                            }
                            if (!z11) {
                                i36.putInt("dialogsType", 13);
                            }
                        }
                    }
                    if (SecretMediaViewer.g() && SecretMediaViewer.f().f31762s) {
                        SecretMediaViewer.f().e(false, false);
                    } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                        PhotoViewer.t1().G0(false, true);
                    } else if (org.telegram.ui.i4.I() && org.telegram.ui.i4.x().V) {
                        org.telegram.ui.i4.x().o(false, true);
                    }
                    lc.x();
                    d60 d60Var = d60.D3;
                    if (d60Var != null) {
                        d60Var.dismiss();
                    }
                    if (AndroidUtilities.isTablet()) {
                        launchActivity.f31130q0.U(true, true);
                        launchActivity.f31134s0.U(true, true);
                    }
                    qy qyVar = new qy(i36);
                    qyVar.C2 = launchActivity;
                    ((ActionBarLayout) launchActivity.O()).S(qyVar, !AndroidUtilities.isTablet() ? launchActivity.f31130q0.getFragmentStack().size() <= 1 || !(launchActivity.f31130q0.getFragmentStack().get(launchActivity.f31130q0.getFragmentStack().size() - 1) instanceof yg0) : launchActivity.f31132r0.getFragmentStack().isEmpty() || !(launchActivity.f31132r0.getFragmentStack().get(launchActivity.f31132r0.getFragmentStack().size() + (-1)) instanceof yg0), false);
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
            case 25:
                TLObject tLObject3 = (TLObject) this.d;
                int i37 = this.f8458b;
                String str2 = (String) this.e;
                n80 n80Var = (n80) this.f8460f;
                org.telegram.ui.ActionBar.m2 m2Var4 = (org.telegram.ui.ActionBar.m2) hg.c.g(1, ((LaunchActivity) this.f8459c).f31106d0);
                try {
                    if (tLObject3 instanceof TL_chatlists.chatlist_ChatlistInvite) {
                        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject3;
                        boolean z15 = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
                        if (z15) {
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
                        MessagesController.getInstance(i37).putChats(arrayList2, false);
                        MessagesController.getInstance(i37).putUsers(arrayList, false);
                        if (z15 && ((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                            a02 = xc.a0(m2Var4);
                            i10 = R.string.NoFolderFound;
                        } else {
                            ?? bbVar = new bb(m2Var4, false);
                            bbVar.Y = -1;
                            bbVar.f23432c0 = "";
                            bbVar.f23433d0 = new ArrayList();
                            bbVar.f23435f0 = "";
                            bbVar.f23437h0 = new ArrayList();
                            ArrayList arrayList16 = new ArrayList();
                            bbVar.f23438i0 = arrayList16;
                            bbVar.f23454z0 = -1;
                            bbVar.C0 = -5;
                            bbVar.X = str2;
                            bbVar.Z = chatlist_chatlistinvite;
                            arrayList16.clear();
                            if (z15) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                bbVar.f23432c0 = tL_textWithEntities.text;
                                bbVar.f23433d0 = tL_textWithEntities.entities;
                                bbVar.f23434e0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                bbVar.f23436g0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                bbVar.f23436g0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                bbVar.f23439j0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                bbVar.Y = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList17 = m2Var4.getMessagesController().dialogFilters;
                                if (arrayList17 != null) {
                                    while (true) {
                                        if (i13 < arrayList17.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList17.get(i13);
                                            if (dialogFilter.f15832id == bbVar.Y) {
                                                bbVar.f23432c0 = dialogFilter.name;
                                                bbVar.f23433d0 = dialogFilter.entities;
                                                bbVar.f23434e0 = dialogFilter.title_noanimate;
                                            } else {
                                                i13++;
                                            }
                                        }
                                    }
                                }
                            }
                            bbVar.S();
                            m2Var4.showDialog(bbVar);
                            n80Var.run();
                            return;
                        }
                    } else {
                        a02 = xc.a0(m2Var4);
                        i10 = R.string.NoFolderFound;
                    }
                    n80Var.run();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                ok.p(i10, a02, null);
                break;
            case 26:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f8459c;
                n80 n80Var2 = (n80) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f8460f;
                int i38 = this.f8458b;
                ArrayList arrayList18 = launchActivity2.f31106d0;
                if (launchActivity2.isFinishing()) {
                    return;
                }
                try {
                    n80Var2.run();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (tL_error2 == null) {
                    if (launchActivity2.f31130q0 == null || updates2 == null || updates2.chats.isEmpty()) {
                        return;
                    }
                    TLRPC.Chat chat5 = updates2.chats.get(0);
                    chat5.left = false;
                    chat5.kicked = false;
                    MessagesController.getInstance(i38).putUsers(updates2.users, false);
                    MessagesController.getInstance(i38).putChats(updates2.chats, false);
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", chat5.f18335id);
                    if (arrayList18.isEmpty() || MessagesController.getInstance(i38).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.m2) hg.c.g(1, arrayList18))) {
                        wn wnVar2 = new wn(bundle2);
                        NotificationCenter.getInstance(i38).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                        ((ActionBarLayout) launchActivity2.O()).S(wnVar2, false, true);
                        return;
                    }
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity2);
                alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.AppName);
                if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                    alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.FloodWait);
                } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                    alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.JoinToGroupErrorFull);
                } else {
                    alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                launchActivity2.B0(alertDialog$Builder);
                return;
            case 27:
                zf0 zf0Var = (zf0) this.f8459c;
                String str3 = (String) this.d;
                String str4 = (String) this.e;
                String str5 = (String) this.f8460f;
                int i39 = this.f8458b;
                ArrayList arrayList19 = new ArrayList();
                ?? obj6 = new Object();
                obj6.f3834b = "inapp";
                obj6.f3833a = str3;
                arrayList19.add(obj6.a());
                FileLog.d("LoginBilling querying \"" + str3 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList19, new org.telegram.ui.Components.e2(zf0Var, str3, str4, str5, i39));
                return;
            case 28:
                int i40 = this.f8458b;
                h9 h9Var5 = (h9) this.e;
                TLRPC.User user4 = (TLRPC.User) this.f8460f;
                ((int[]) this.f8459c)[0] = i40;
                h9Var5.r(user4);
                ((w9) this.d).e(user4, h9Var5);
                return;
            default:
                qg.n2 n2Var = (qg.n2) this.f8459c;
                int i41 = this.f8458b;
                List list = (List) this.d;
                ArrayList arrayList20 = (ArrayList) this.e;
                gr0 gr0Var = (gr0) this.f8460f;
                if (n2Var.I == null || n2Var.f41834y) {
                    return;
                }
                Matrix matrix = new Matrix();
                matrix.postScale(1.0f / n2Var.I.getWidth(), 1.0f / n2Var.I.getHeight());
                matrix.postTranslate(-0.5f, -0.5f);
                matrix.postRotate(i41);
                matrix.postTranslate(0.5f, 0.5f);
                if ((i41 / 90) % 2 != 0) {
                    matrix.postScale(n2Var.I.getHeight(), n2Var.I.getWidth());
                } else {
                    matrix.postScale(n2Var.I.getWidth(), n2Var.I.getHeight());
                }
                if (list.isEmpty()) {
                    qg.k2 k2Var = new qg.k2(n2Var);
                    k2Var.h.set(0.0f, 0.0f, n2Var.I.getWidth(), n2Var.I.getHeight());
                    k2Var.f41717i.set(k2Var.h);
                    matrix.mapRect(k2Var.f41717i);
                    k2Var.f41714c = i41;
                    Bitmap d = n2Var.d(n2Var.I, 0, 0, false);
                    k2Var.d = d;
                    if (d == null) {
                        FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                        return;
                    }
                    k2Var.f41715f = k2Var.c();
                    qg.n2.c(k2Var, n2Var.T, n2Var.U);
                    n2Var.O = k2Var.f41718j;
                    n2Var.P = k2Var.f41719k;
                    arrayList20.add(k2Var);
                    AndroidUtilities.runOnUIThread(new jr0(n2Var, arrayList20, gr0Var, k2Var, 24));
                    n2Var.E = k2Var;
                    n2Var.f41834y = true;
                    n2Var.f41833x = false;
                    return;
                }
                for (int i42 = 0; i42 < list.size(); i42++) {
                    qg.m2 m2Var5 = (qg.m2) list.get(i42);
                    qg.k2 k2Var2 = new qg.k2(n2Var);
                    k2Var2.h.set(m2Var5.f41766b, m2Var5.f41767c, i11 + m2Var5.d, i12 + m2Var5.e);
                    k2Var2.f41717i.set(k2Var2.h);
                    matrix.mapRect(k2Var2.f41717i);
                    k2Var2.f41714c = i41;
                    Bitmap d10 = n2Var.d(m2Var5.f41765a, m2Var5.f41766b, m2Var5.f41767c, false);
                    k2Var2.d = d10;
                    if (d10 != null) {
                        k2Var2.f41715f = k2Var2.c();
                        qg.n2.c(k2Var2, n2Var.T, n2Var.U);
                        n2Var.O = k2Var2.f41718j;
                        n2Var.P = k2Var2.f41719k;
                        arrayList20.add(k2Var2);
                    }
                }
                n2Var.E = null;
                n2Var.f41834y = true;
                n2Var.f41833x = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.o1(12, n2Var, arrayList20));
                return;
        }
    }

    public l3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f8457a = i11;
        this.f8459c = obj;
        this.f8458b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f8460f = obj4;
    }

    public l3(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.f8457a = i11;
        this.f8459c = obj;
        this.d = obj2;
        this.f8458b = i10;
        this.e = obj3;
        this.f8460f = obj4;
    }

    public l3(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f8457a = i11;
        this.f8459c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f8458b = i10;
        this.f8460f = obj4;
    }

    public l3(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f8457a = i11;
        this.f8459c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f8460f = obj4;
        this.f8458b = i10;
    }

    public l3(int[] iArr, int i10, h9 h9Var, TLRPC.User user, w9 w9Var) {
        this.f8457a = 28;
        this.f8459c = iArr;
        this.f8458b = i10;
        this.e = h9Var;
        this.f8460f = user;
        this.d = w9Var;
    }
}
