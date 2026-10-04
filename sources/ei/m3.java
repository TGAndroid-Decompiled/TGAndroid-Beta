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
import ci.kc;
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
import org.telegram.messenger.bi;
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
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zm;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.ch0;
import org.telegram.ui.dg0;
import org.telegram.ui.fn;
import org.telegram.ui.fy;
import org.telegram.ui.h60;
import org.telegram.ui.h90;
import org.telegram.ui.jr0;
import org.telegram.ui.kn;
import org.telegram.ui.uy;
import org.telegram.ui.vm;
import org.telegram.ui.yi;
import org.telegram.ui.yn;
import org.telegram.ui.zr0;
public final class m3 implements Runnable {
    public final int f9201a;
    public final int f9202b;
    public final Object f9203c;
    public final Object d;
    public final Object f9204e;
    public final Object f9205f;

    public m3(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f9201a = 20;
        this.f9202b = i10;
        this.f9203c = chat;
        this.d = arrayList;
        this.f9204e = arrayList2;
        this.f9205f = arrayList3;
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
        org.telegram.ui.i4 i4Var;
        int i10;
        Object obj2;
        String lowerCase;
        int i11;
        org.telegram.ui.ActionBar.n2 R;
        int i12;
        boolean z13;
        boolean z14;
        yc a02;
        int i13;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        int i14;
        int i15;
        long j11 = 0;
        String str = "";
        int i16 = 0;
        switch (this.f9201a) {
            case 0:
                long[] jArr = (long[]) this.f9203c;
                int i17 = this.f9202b;
                w9 w9Var = (w9) this.d;
                w9 w9Var2 = (w9) this.f9204e;
                TextView textView = (TextView) this.f9205f;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i17).getUser(Long.valueOf(jArr[0]));
                    h9 h9Var = new h9((d6) null);
                    h9Var.r(user);
                    w9Var.e(user, h9Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i17).getChat(Long.valueOf(-jArr[0]));
                    h9 h9Var2 = new h9((d6) null);
                    h9Var2.q(chat);
                    w9Var.e(chat, h9Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i17).getUser(Long.valueOf(jArr[0]));
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
                TLRPC.Chat chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(-jArr[0]));
                if (w9Var2 != null) {
                    h9 h9Var4 = new h9((d6) null);
                    h9Var4.q(chat2);
                    w9Var2.e(chat2, h9Var4);
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
                Utilities.Callback callback = (Utilities.Callback) this.f9204e;
                int i18 = this.f9202b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f9205f;
                if (!(((TLObject) this.f9203c) instanceof TLRPC.TL_boolTrue)) {
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
                    MessagesController.getInstance(i18).updateEmojiStatusUntilUpdate(currentUser.f20189id, currentUser.emoji_status);
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
                final gg.i0 i0Var = (gg.i0) this.f9203c;
                int i19 = this.f9202b;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = (ArrayList) this.f9204e;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) this.f9205f;
                gg.z zVar = i0Var.f10622j0;
                ArrayList arrayList6 = i0Var.f10636v0;
                int i20 = i0Var.f10633s0;
                i0Var.D0--;
                if (i19 == i0Var.f10614d0) {
                    i0Var.f10618f0 = i19;
                    if (i0Var.f10616e0 != i19) {
                        zVar.b();
                    }
                    if (i0Var.f10619g0 != i19) {
                        i0Var.I.clear();
                    }
                    i0Var.N = true;
                    int i21 = 0;
                    while (i21 < arrayList3.size()) {
                        if (!i0Var.F(arrayList3.get(i21))) {
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
                            j3 = user3.f20189id;
                        } else if (obj3 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) obj3;
                            MessagesController.getInstance(i20).putChat(chat3, z15);
                            j3 = -chat3.f20042id;
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
                                    int i24 = i0.this.f10633s0;
                                    if (i23 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j12 = j3;
                                        tL_dialog.f20046id = j12;
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
                        if (i0Var.S() && !(obj3 instanceof TLRPC.EncryptedChat)) {
                            fy fyVar = i0Var.U;
                            if (fyVar != null && fyVar.a() == j3) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            int i23 = 0;
                            while (!z12 && i23 < size) {
                                gg.h0 h0Var = (gg.h0) arrayList6.get(i23);
                                boolean z16 = z12;
                                int i24 = i23;
                                if (h0Var != null && h0Var.f10604c == j3) {
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
                    i0Var.f10632s = arrayList3;
                    i0Var.G = arrayList4;
                    zVar.f(arrayList3, arrayList6);
                    i0Var.l();
                    fy fyVar2 = i0Var.U;
                    if (fyVar2 != null) {
                        if (i0Var.D0 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        fyVar2.d(z11, true);
                        i0Var.U.c();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                gg.u1 u1Var = (gg.u1) this.f9203c;
                int i25 = this.f9202b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.f9204e;
                ArrayList arrayList9 = (ArrayList) this.f9205f;
                if (i25 == u1Var.E) {
                    u1Var.d = arrayList7;
                    u1Var.f10812e = arrayList8;
                    u1Var.H = arrayList9;
                    u1Var.f10813f.f(arrayList7, null);
                    u1Var.f10819y = false;
                    u1Var.l();
                    u1Var.F();
                    return;
                }
                return;
            case 4:
                Pair pair = (Pair) this.d;
                ((i2.d1) this.f9203c).f11581b.h.h(((Integer) pair.first).intValue(), (u2.f0) pair.second, (u2.t) this.f9204e, (u2.b0) this.f9205f, this.f9202b);
                return;
            case 5:
                m4.k0 k0Var = (m4.k0) this.f9203c;
                m4.g1 g1Var = (m4.g1) this.d;
                int i26 = this.f9202b;
                n4.a0 a0Var = (n4.a0) this.f9204e;
                m4.j0 j0Var = (m4.j0) this.f9205f;
                qi.f fVar = k0Var.f16212f;
                if (!k0Var.f16213g.j()) {
                    if (!((n4.r) k0Var.f16216k.f16644b).f16624a.isActive()) {
                        StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                        if (g1Var == null) {
                            obj = Integer.valueOf(i26);
                        } else {
                            obj = g1Var.f16176b;
                        }
                        sb2.append(obj);
                        sb2.append(", pid=");
                        sb2.append(a0Var.f16573a.f16575b);
                        e2.a.n("MediaSessionLegacyStub", sb2.toString());
                        return;
                    }
                    m4.r L = k0Var.L(a0Var);
                    if (g1Var != null) {
                        if (!fVar.D(L, g1Var)) {
                            return;
                        }
                    } else if (!fVar.C(L, i26)) {
                        return;
                    }
                    try {
                        j0Var.f(L);
                        return;
                    } catch (RemoteException e7) {
                        e2.a.o("MediaSessionLegacyStub", "Exception in " + L, e7);
                        return;
                    }
                }
                return;
            case 6:
                LocationController.lambda$fetchLocationAddress$29((Locale) this.f9203c, (Location) this.d, this.f9202b, (Locale) this.f9204e, (LocationController.LocationFetchCallback) this.f9205f);
                return;
            case 7:
                ((MediaDataController) this.f9203c).lambda$removeMultipleStickerSets$110((boolean[]) this.d, (ArrayList) this.f9204e, this.f9202b, (int[]) this.f9205f);
                return;
            case 8:
                ((MessagesController) this.f9203c).lambda$processUpdateArray$403((yf.r) this.d, (ConcurrentHashMap) this.f9204e, (ConcurrentHashMap) this.f9205f, this.f9202b);
                return;
            case 9:
                ((MessagesStorage) this.f9203c).lambda$getSentFile$164((String) this.d, this.f9202b, (Object[]) this.f9204e, (CountDownLatch) this.f9205f);
                return;
            case 10:
                ((MessagesStorage) this.f9203c).lambda$putSentFile$170((String) this.d, (TLObject) this.f9204e, this.f9202b, (String) this.f9205f);
                return;
            case 11:
                ((NotificationCenter) this.f9203c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.f9204e, (xg) this.f9205f, this.f9202b);
                return;
            case 12:
                ((TelegramMediaSession) this.f9203c).lambda$loadChats$4(this.f9202b, (ArrayList) this.d, (a0.i) this.f9204e, (a0.i) this.f9205f);
                return;
            case 13:
                ((VoIPService) this.f9203c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.f9202b, (String) this.f9204e, (TLRPC.TL_error) this.f9205f);
                return;
            case 14:
                org.telegram.ui.i4 i4Var2 = (org.telegram.ui.i4) this.f9203c;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.f9204e;
                String str2 = (String) this.f9205f;
                int i27 = this.f9202b;
                ArrayList arrayList11 = new ArrayList();
                int size2 = arrayList10.size();
                int i28 = 0;
                while (i28 < size2) {
                    Object obj4 = arrayList10.get(i28);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj4);
                    if (obj4 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj4;
                        int i29 = i28;
                        i4Var = i4Var2;
                        i10 = i29;
                        obj2 = obj4;
                        CharSequence C = org.telegram.ui.i4.C(i4Var, i4Var2.f37280u0[i16].f38400c.E, null, richText, richText, pageBlock, 1000);
                        if (!TextUtils.isEmpty(C)) {
                            lowerCase = C.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        int i30 = i28;
                        i4Var = i4Var2;
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
                                    obj5.f39902a = indexOf;
                                    obj5.f39904c = pageBlock;
                                    obj5.f39903b = obj2;
                                    arrayList11.add(obj5);
                                }
                                i31 = length;
                            }
                        }
                    }
                    org.telegram.ui.i4 i4Var3 = i4Var;
                    i28 = i10 + 1;
                    i4Var2 = i4Var3;
                    i16 = 0;
                }
                AndroidUtilities.runOnUIThread(new c9(i4Var2, i27, arrayList11, str2, 10));
                return;
            case 15:
                TLObject tLObject = (TLObject) this.f9203c;
                int i32 = this.f9202b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f9204e;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f9205f;
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
                        tL_inputGroupCall.f20059id = groupCall.f20052id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.g2.g(LaunchActivity.G1, i32, tL_inputGroupCall, false, groupCall, hashSet);
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
                        tL_inputGroupCall2.f20059id = groupCall2.f20052id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.g2.g(LaunchActivity.G1, i32, tL_inputGroupCall2, false, groupCall2, hashSet);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    yc.a0(n2Var).d0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 16:
                yn.J0((yn) this.f9203c, this.f9202b, (Boolean) this.d, (TLRPC.WebPage) this.f9204e, (TL_account.getWebPagePreview) this.f9205f);
                return;
            case 17:
                kn knVar = (kn) this.f9203c;
                yi yiVar = (yi) this.d;
                yiVar.f16881b = knVar.f38008a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.f9204e).f20042id, this.f9202b, new fn(knVar, yiVar, (yn) this.f9205f));
                return;
            case 18:
                kn knVar2 = (kn) this.f9203c;
                int i33 = this.f9202b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.f9204e;
                byte[] bArr = (byte[]) this.f9205f;
                yn ynVar = knVar2.f38008a;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == ynVar.J6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                ynVar.Wa(i33, id2, true, i11, true, 0, num, bArr, new vm(knVar2, messageObject, 1));
                return;
            case 19:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.f9203c;
                int[] iArr = (int[]) this.d;
                int i34 = this.f9202b;
                Runnable runnable = (Runnable) this.f9204e;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f9205f;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new org.telegram.ui.Components.z1(iArr, runnable, i34));
                    n2Var2.showDialog(b2VarArr[0]);
                    return;
                }
                return;
            case 20:
                int i35 = this.f9202b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.f9203c;
                ArrayList arrayList12 = (ArrayList) this.d;
                ArrayList arrayList13 = (ArrayList) this.f9204e;
                ArrayList arrayList14 = (ArrayList) this.f9205f;
                if (LaunchActivity.C1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    rg.k0 k0Var2 = new rg.k0(11, i35, R.getParentActivity(), R, null);
                    k0Var2.I1(chat4, arrayList12, arrayList13, arrayList14, null);
                    k0Var2.show();
                    return;
                }
                return;
            case 21:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.f9204e;
                int i36 = this.f9202b;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.f9205f;
                SharedPreferences.Editor edit = ((SharedPreferences) this.f9203c).edit();
                edit.putLong("support_id2", tL_help_support.user.f20189id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    b2Var2.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                ArrayList arrayList15 = new ArrayList();
                arrayList15.add(tL_help_support.user);
                MessagesStorage.getInstance(i36).putUsersAndChats(arrayList15, null, true, true);
                MessagesController.getInstance(i36).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.f20189id);
                n2Var3.presentFragment(new yn(bundle));
                return;
            case 22:
                is.N((is) this.f9203c, (TLObject) this.d, (TLRPC.InputPeer) this.f9204e, this.f9202b, (int[]) this.f9205f);
                return;
            case 23:
                tw0 tw0Var = (tw0) this.f9203c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i37 = this.f9202b;
                MessageObject messageObject2 = (MessageObject) this.f9204e;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.f9205f;
                int[] iArr2 = tw0Var.f28130e;
                RLottieNative[] rLottieNativeArr = tw0Var.f31192f1;
                if (tw0Var.W0) {
                    AndroidUtilities.runOnUIThread(new rw0(tw0Var, 2));
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
                                AndroidUtilities.runOnUIThread(new sw0(document, i37, messageObject2, u1Var2, tL_messages_stickerSet, 1));
                                z17 = true;
                            } else {
                                rLottieNativeArr[i38] = RLottieNative.b(readRes, iArr2, null, null);
                                tw0Var.f31193g1[i38] = iArr2[0];
                            }
                        }
                    }
                }
                if (z17) {
                    AndroidUtilities.runOnUIThread(new rw0(tw0Var, 3));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new zm(tw0Var, i37, u1Var2, 17));
                    return;
                }
            case 24:
                LaunchActivity launchActivity = (LaunchActivity) this.f9203c;
                TLObject tLObject2 = (TLObject) this.d;
                Uri uri = (Uri) this.f9204e;
                int i39 = this.f9202b;
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) this.f9205f;
                Pattern pattern = LaunchActivity.B1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject2 != null && launchActivity.f33804q0 != null) {
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
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().f34450s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
                            PhotoViewer.t1().G0(false, true);
                        } else if (org.telegram.ui.i4.I() && org.telegram.ui.i4.x().V) {
                            org.telegram.ui.i4.x().o(false, true);
                        }
                        kc.x();
                        h60 h60Var = h60.D3;
                        if (h60Var != null) {
                            h60Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.f33804q0.U(true, true);
                            launchActivity.f33808s0.U(true, true);
                        }
                        uy uyVar = new uy(i40);
                        uyVar.C2 = launchActivity;
                        if (!AndroidUtilities.isTablet() ? !(launchActivity.f33804q0.getFragmentStack().size() <= 1 || !(launchActivity.f33804q0.getFragmentStack().get(launchActivity.f33804q0.getFragmentStack().size() - 1) instanceof ch0)) : !(launchActivity.f33806r0.getFragmentStack().isEmpty() || !(launchActivity.f33806r0.getFragmentStack().get(launchActivity.f33806r0.getFragmentStack().size() - 1) instanceof ch0))) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        ((ActionBarLayout) launchActivity.O()).S(uyVar, z14, false);
                    } else {
                        if (launchActivity.W == null) {
                            launchActivity.W = new ArrayList();
                        }
                        launchActivity.W.add(0, launchActivity.X);
                        launchActivity.X = null;
                        launchActivity.i0(true);
                    }
                    try {
                        b2Var3.dismiss();
                        return;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        return;
                    }
                }
                return;
            case 25:
                TLObject tLObject3 = (TLObject) this.d;
                int i41 = this.f9202b;
                String str3 = (String) this.f9204e;
                h90 h90Var = (h90) this.f9205f;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) hg.c.g(1, ((LaunchActivity) this.f9203c).f33780d0);
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
                            a02 = yc.a0(n2Var4);
                            i13 = R.string.NoFolderFound;
                        } else {
                            ?? cbVar = new cb(n2Var4, false);
                            cbVar.Y = -1;
                            cbVar.f26211c0 = "";
                            cbVar.f26212d0 = new ArrayList();
                            cbVar.f26214f0 = "";
                            cbVar.f26216h0 = new ArrayList();
                            ArrayList arrayList16 = new ArrayList();
                            cbVar.f26217i0 = arrayList16;
                            cbVar.f26233z0 = -1;
                            cbVar.C0 = -5;
                            cbVar.X = str3;
                            cbVar.Z = chatlist_chatlistinvite;
                            arrayList16.clear();
                            if (z18) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                cbVar.f26211c0 = tL_textWithEntities.text;
                                cbVar.f26212d0 = tL_textWithEntities.entities;
                                cbVar.f26213e0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                cbVar.f26215g0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                cbVar.f26215g0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                cbVar.f26218j0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                cbVar.Y = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList17 = n2Var4.getMessagesController().dialogFilters;
                                if (arrayList17 != null) {
                                    while (true) {
                                        if (i16 < arrayList17.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList17.get(i16);
                                            if (dialogFilter.f17261id == cbVar.Y) {
                                                cbVar.f26211c0 = dialogFilter.name;
                                                cbVar.f26212d0 = dialogFilter.entities;
                                                cbVar.f26213e0 = dialogFilter.title_noanimate;
                                            } else {
                                                i16++;
                                            }
                                        }
                                    }
                                }
                            }
                            cbVar.Q();
                            n2Var4.showDialog(cbVar);
                            h90Var.run();
                            return;
                        }
                    } else {
                        a02 = yc.a0(n2Var4);
                        i13 = R.string.NoFolderFound;
                    }
                    h90Var.run();
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
                bi.o(i13, a02, null);
                break;
            case 26:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f9203c;
                h90 h90Var2 = (h90) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f9204e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f9205f;
                int i42 = this.f9202b;
                ArrayList arrayList18 = launchActivity2.f33780d0;
                if (!launchActivity2.isFinishing()) {
                    try {
                        h90Var2.run();
                    } catch (Exception e13) {
                        FileLog.e(e13);
                    }
                    if (tL_error2 == null) {
                        if (launchActivity2.f33804q0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                            TLRPC.Chat chat5 = updates2.chats.get(0);
                            chat5.left = false;
                            chat5.kicked = false;
                            MessagesController.getInstance(i42).putUsers(updates2.users, false);
                            MessagesController.getInstance(i42).putChats(updates2.chats, false);
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chat5.f20042id);
                            if (arrayList18.isEmpty() || MessagesController.getInstance(i42).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.n2) hg.c.g(1, arrayList18))) {
                                yn ynVar2 = new yn(bundle2);
                                NotificationCenter.getInstance(i42).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                                ((ActionBarLayout) launchActivity2.O()).S(ynVar2, false, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity2);
                    alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.AppName);
                    if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                        alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.FloodWait);
                    } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                        alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.JoinToGroupErrorFull);
                    } else {
                        alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    launchActivity2.B0(alertDialog$Builder);
                    return;
                }
                return;
            case 27:
                dg0 dg0Var = (dg0) this.f9203c;
                String str4 = (String) this.d;
                String str5 = (String) this.f9204e;
                String str6 = (String) this.f9205f;
                int i43 = this.f9202b;
                ArrayList arrayList19 = new ArrayList();
                ?? obj7 = new Object();
                obj7.f4149b = "inapp";
                obj7.f4148a = str4;
                arrayList19.add(obj7.a());
                FileLog.d("LoginBilling querying \"" + str4 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList19, new org.telegram.ui.Components.e2(dg0Var, str4, str5, str6, i43));
                return;
            case 28:
                int i44 = this.f9202b;
                h9 h9Var5 = (h9) this.f9204e;
                TLRPC.User user4 = (TLRPC.User) this.f9205f;
                ((int[]) this.f9203c)[0] = i44;
                h9Var5.r(user4);
                ((w9) this.d).e(user4, h9Var5);
                return;
            default:
                qg.n2 n2Var5 = (qg.n2) this.f9203c;
                int i45 = this.f9202b;
                List list = (List) this.d;
                ArrayList arrayList20 = (ArrayList) this.f9204e;
                jr0 jr0Var = (jr0) this.f9205f;
                if (n2Var5.I != null && !n2Var5.f45243y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / n2Var5.I.getWidth(), 1.0f / n2Var5.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i45);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i45 / 90) % 2 != 0) {
                        matrix.postScale(n2Var5.I.getHeight(), n2Var5.I.getWidth());
                    } else {
                        matrix.postScale(n2Var5.I.getWidth(), n2Var5.I.getHeight());
                    }
                    if (list.isEmpty()) {
                        qg.k2 k2Var = new qg.k2(n2Var5);
                        k2Var.h.set(0.0f, 0.0f, n2Var5.I.getWidth(), n2Var5.I.getHeight());
                        k2Var.f45118i.set(k2Var.h);
                        matrix.mapRect(k2Var.f45118i);
                        k2Var.f45114c = i45;
                        Bitmap d = n2Var5.d(n2Var5.I, 0, 0, false);
                        k2Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        k2Var.f45116f = k2Var.c();
                        qg.n2.c(k2Var, n2Var5.T, n2Var5.U);
                        n2Var5.O = k2Var.f45119j;
                        n2Var5.P = k2Var.f45120k;
                        arrayList20.add(k2Var);
                        AndroidUtilities.runOnUIThread(new zr0(n2Var5, arrayList20, jr0Var, k2Var, 23));
                        n2Var5.E = k2Var;
                        n2Var5.f45243y = true;
                        n2Var5.f45242x = false;
                        return;
                    }
                    for (int i46 = 0; i46 < list.size(); i46++) {
                        qg.m2 m2Var = (qg.m2) list.get(i46);
                        qg.k2 k2Var2 = new qg.k2(n2Var5);
                        k2Var2.h.set(m2Var.f45202b, m2Var.f45203c, i14 + m2Var.d, i15 + m2Var.f45204e);
                        k2Var2.f45118i.set(k2Var2.h);
                        matrix.mapRect(k2Var2.f45118i);
                        k2Var2.f45114c = i45;
                        Bitmap d10 = n2Var5.d(m2Var.f45201a, m2Var.f45202b, m2Var.f45203c, false);
                        k2Var2.d = d10;
                        if (d10 != null) {
                            k2Var2.f45116f = k2Var2.c();
                            qg.n2.c(k2Var2, n2Var5.T, n2Var5.U);
                            n2Var5.O = k2Var2.f45119j;
                            n2Var5.P = k2Var2.f45120k;
                            arrayList20.add(k2Var2);
                        }
                    }
                    n2Var5.E = null;
                    n2Var5.f45243y = true;
                    n2Var5.f45242x = false;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(10, n2Var5, arrayList20));
                    return;
                }
                return;
        }
    }

    public m3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f9201a = i11;
        this.f9203c = obj;
        this.f9202b = i10;
        this.d = obj2;
        this.f9204e = obj3;
        this.f9205f = obj4;
    }

    public m3(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.f9201a = i11;
        this.f9203c = obj;
        this.d = obj2;
        this.f9202b = i10;
        this.f9204e = obj3;
        this.f9205f = obj4;
    }

    public m3(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f9201a = i11;
        this.f9203c = obj;
        this.d = obj2;
        this.f9204e = obj3;
        this.f9202b = i10;
        this.f9205f = obj4;
    }

    public m3(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f9201a = i11;
        this.f9203c = obj;
        this.d = obj2;
        this.f9204e = obj3;
        this.f9205f = obj4;
        this.f9202b = i10;
    }

    public m3(int[] iArr, int i10, h9 h9Var, TLRPC.User user, w9 w9Var) {
        this.f9201a = 28;
        this.f9203c = iArr;
        this.f9202b = i10;
        this.f9204e = h9Var;
        this.f9205f = user;
        this.d = w9Var;
    }
}
