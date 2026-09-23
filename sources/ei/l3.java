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
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xm;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.ag0;
import org.telegram.ui.dy;
import org.telegram.ui.en;
import org.telegram.ui.f60;
import org.telegram.ui.ia0;
import org.telegram.ui.ir0;
import org.telegram.ui.jn;
import org.telegram.ui.ry;
import org.telegram.ui.vm;
import org.telegram.ui.xi;
import org.telegram.ui.xn;
import org.telegram.ui.yr0;
import org.telegram.ui.zg0;
public final class l3 implements Runnable {
    public final int f8458a;
    public final int f8459b;
    public final Object f8460c;
    public final Object d;
    public final Object e;
    public final Object f8461f;

    public l3(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f8458a = 20;
        this.f8459b = i10;
        this.f8460c = chat;
        this.d = arrayList;
        this.e = arrayList2;
        this.f8461f = arrayList3;
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
        xc a02;
        int i13;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        int i14;
        int i15;
        long j11 = 0;
        String str = "";
        int i16 = 0;
        switch (this.f8458a) {
            case 0:
                long[] jArr = (long[]) this.f8460c;
                int i17 = this.f8459b;
                w9 w9Var = (w9) this.d;
                w9 w9Var2 = (w9) this.e;
                TextView textView = (TextView) this.f8461f;
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
                Utilities.Callback callback = (Utilities.Callback) this.e;
                int i18 = this.f8459b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f8461f;
                if (!(((TLObject) this.f8460c) instanceof TLRPC.TL_boolTrue)) {
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
                    MessagesController.getInstance(i18).updateEmojiStatusUntilUpdate(currentUser.f18230id, currentUser.emoji_status);
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
                final gg.i0 i0Var = (gg.i0) this.f8460c;
                int i19 = this.f8459b;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) this.f8461f;
                gg.z zVar = i0Var.f9755j0;
                ArrayList arrayList6 = i0Var.f9769v0;
                int i20 = i0Var.f9766s0;
                i0Var.D0--;
                if (i19 == i0Var.f9748d0) {
                    i0Var.f9751f0 = i19;
                    if (i0Var.f9749e0 != i19) {
                        zVar.b();
                    }
                    if (i0Var.f9752g0 != i19) {
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
                            j3 = user3.f18230id;
                        } else if (obj3 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) obj3;
                            MessagesController.getInstance(i20).putChat(chat3, z15);
                            j3 = -chat3.f18083id;
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
                                    int i24 = i0.this.f9766s0;
                                    if (i23 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j12 = j3;
                                        tL_dialog.f18087id = j12;
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
                            dy dyVar = i0Var.U;
                            if (dyVar != null && dyVar.a() == j3) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            int i23 = 0;
                            while (!z12 && i23 < size) {
                                gg.h0 h0Var = (gg.h0) arrayList6.get(i23);
                                boolean z16 = z12;
                                int i24 = i23;
                                if (h0Var != null && h0Var.f9738c == j3) {
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
                    i0Var.f9765s = arrayList3;
                    i0Var.G = arrayList4;
                    zVar.f(arrayList3, arrayList6);
                    i0Var.l();
                    dy dyVar2 = i0Var.U;
                    if (dyVar2 != null) {
                        if (i0Var.D0 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        dyVar2.d(z11, true);
                        i0Var.U.c();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                gg.u1 u1Var = (gg.u1) this.f8460c;
                int i25 = this.f8459b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                ArrayList arrayList9 = (ArrayList) this.f8461f;
                if (i25 == u1Var.E) {
                    u1Var.d = arrayList7;
                    u1Var.e = arrayList8;
                    u1Var.H = arrayList9;
                    u1Var.f9930f.f(arrayList7, null);
                    u1Var.f9936y = false;
                    u1Var.l();
                    u1Var.F();
                    return;
                }
                return;
            case 4:
                Pair pair = (Pair) this.d;
                ((i2.d1) this.f8460c).f10626b.h.h(((Integer) pair.first).intValue(), (u2.f0) pair.second, (u2.t) this.e, (u2.b0) this.f8461f, this.f8459b);
                return;
            case 5:
                m4.l0 l0Var = (m4.l0) this.f8460c;
                m4.h1 h1Var = (m4.h1) this.d;
                int i26 = this.f8459b;
                n4.a0 a0Var = (n4.a0) this.e;
                m4.k0 k0Var = (m4.k0) this.f8461f;
                ni.f fVar = l0Var.f14606f;
                if (!l0Var.f14607g.j()) {
                    if (!((n4.r) l0Var.f14610k.f14969b).f14950a.isActive()) {
                        StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                        if (h1Var == null) {
                            obj = Integer.valueOf(i26);
                        } else {
                            obj = h1Var.f14569b;
                        }
                        sb2.append(obj);
                        sb2.append(", pid=");
                        sb2.append(a0Var.f14904a.f14906b);
                        e2.a.n("MediaSessionLegacyStub", sb2.toString());
                        return;
                    }
                    m4.r L = l0Var.L(a0Var);
                    if (h1Var != null) {
                        if (!fVar.D(L, h1Var)) {
                            return;
                        }
                    } else if (!fVar.C(L, i26)) {
                        return;
                    }
                    try {
                        k0Var.g(L);
                        return;
                    } catch (RemoteException e) {
                        e2.a.o("MediaSessionLegacyStub", "Exception in " + L, e);
                        return;
                    }
                }
                return;
            case 6:
                LocationController.lambda$fetchLocationAddress$29((Locale) this.f8460c, (Location) this.d, this.f8459b, (Locale) this.e, (LocationController.LocationFetchCallback) this.f8461f);
                return;
            case 7:
                ((MediaDataController) this.f8460c).lambda$removeMultipleStickerSets$110((boolean[]) this.d, (ArrayList) this.e, this.f8459b, (int[]) this.f8461f);
                return;
            case 8:
                ((MessagesController) this.f8460c).lambda$processUpdateArray$403((yf.r) this.d, (ConcurrentHashMap) this.e, (ConcurrentHashMap) this.f8461f, this.f8459b);
                return;
            case 9:
                ((MessagesStorage) this.f8460c).lambda$getSentFile$164((String) this.d, this.f8459b, (Object[]) this.e, (CountDownLatch) this.f8461f);
                return;
            case 10:
                ((MessagesStorage) this.f8460c).lambda$putSentFile$170((String) this.d, (TLObject) this.e, this.f8459b, (String) this.f8461f);
                return;
            case 11:
                ((NotificationCenter) this.f8460c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.e, (xg) this.f8461f, this.f8459b);
                return;
            case 12:
                ((TelegramMediaSession) this.f8460c).lambda$loadChats$4(this.f8459b, (ArrayList) this.d, (a0.i) this.e, (a0.i) this.f8461f);
                return;
            case 13:
                ((VoIPService) this.f8460c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.f8459b, (String) this.e, (TLRPC.TL_error) this.f8461f);
                return;
            case 14:
                org.telegram.ui.i4 i4Var2 = (org.telegram.ui.i4) this.f8460c;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                String str2 = (String) this.f8461f;
                int i27 = this.f8459b;
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
                        CharSequence C = org.telegram.ui.i4.C(i4Var, i4Var2.f34021u0[i16].f35131c.E, null, richText, richText, pageBlock, 1000);
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
                                    obj5.f36674a = indexOf;
                                    obj5.f36676c = pageBlock;
                                    obj5.f36675b = obj2;
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
                TLObject tLObject = (TLObject) this.f8460c;
                int i32 = this.f8459b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f8461f;
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
                        tL_inputGroupCall.f18100id = groupCall.f18093id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.f2.g(LaunchActivity.G1, i32, tL_inputGroupCall, false, groupCall, hashSet);
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
                        tL_inputGroupCall2.f18100id = groupCall2.f18093id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.f2.g(LaunchActivity.G1, i32, tL_inputGroupCall2, false, groupCall2, hashSet);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    xc.a0(n2Var).d0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 16:
                xn.N0((xn) this.f8460c, this.f8459b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f8461f);
                return;
            case 17:
                jn jnVar = (jn) this.f8460c;
                xi xiVar = (xi) this.d;
                xiVar.f15185b = jnVar.f34487a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.e).f18083id, this.f8459b, new en(jnVar, xiVar, (xn) this.f8461f));
                return;
            case 18:
                jn jnVar2 = (jn) this.f8460c;
                int i33 = this.f8459b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f8461f;
                xn xnVar = jnVar2.f34487a;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == xnVar.L6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                xnVar.Xa(i33, id2, true, i11, true, 0, num, bArr, new vm(jnVar2, messageObject, 1));
                return;
            case 19:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.f8460c;
                int[] iArr = (int[]) this.d;
                int i34 = this.f8459b;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f8461f;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new org.telegram.ui.Components.z1(iArr, runnable, i34));
                    n2Var2.showDialog(b2VarArr[0]);
                    return;
                }
                return;
            case 20:
                int i35 = this.f8459b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.f8460c;
                ArrayList arrayList12 = (ArrayList) this.d;
                ArrayList arrayList13 = (ArrayList) this.e;
                ArrayList arrayList14 = (ArrayList) this.f8461f;
                if (LaunchActivity.C1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    rg.j0 j0Var = new rg.j0(11, i35, R.getParentActivity(), R, null);
                    j0Var.I1(chat4, arrayList12, arrayList13, arrayList14, null);
                    j0Var.show();
                    return;
                }
                return;
            case 21:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.e;
                int i36 = this.f8459b;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.f8461f;
                SharedPreferences.Editor edit = ((SharedPreferences) this.f8460c).edit();
                edit.putLong("support_id2", tL_help_support.user.f18230id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    b2Var2.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                ArrayList arrayList15 = new ArrayList();
                arrayList15.add(tL_help_support.user);
                MessagesStorage.getInstance(i36).putUsersAndChats(arrayList15, null, true, true);
                MessagesController.getInstance(i36).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.f18230id);
                n2Var3.presentFragment(new xn(bundle));
                return;
            case 22:
                gs.P((gs) this.f8460c, (TLObject) this.d, (TLRPC.InputPeer) this.e, this.f8459b, (int[]) this.f8461f);
                return;
            case 23:
                xv0 xv0Var = (xv0) this.f8460c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i37 = this.f8459b;
                MessageObject messageObject2 = (MessageObject) this.e;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f8461f;
                int[] iArr2 = xv0Var.e;
                RLottieNative[] rLottieNativeArr = xv0Var.f30071f1;
                if (xv0Var.W0) {
                    AndroidUtilities.runOnUIThread(new vv0(xv0Var, 2));
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
                                AndroidUtilities.runOnUIThread(new wv0(document, i37, messageObject2, t1Var, tL_messages_stickerSet, 1));
                                z17 = true;
                            } else {
                                rLottieNativeArr[i38] = RLottieNative.b(readRes, iArr2, null, null);
                                xv0Var.f30072g1[i38] = iArr2[0];
                            }
                        }
                    }
                }
                if (z17) {
                    AndroidUtilities.runOnUIThread(new vv0(xv0Var, 3));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new xm(xv0Var, i37, t1Var, 17));
                    return;
                }
            case 24:
                LaunchActivity launchActivity = (LaunchActivity) this.f8460c;
                TLObject tLObject2 = (TLObject) this.d;
                Uri uri = (Uri) this.e;
                int i39 = this.f8459b;
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) this.f8461f;
                Pattern pattern = LaunchActivity.B1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject2 != null && launchActivity.f30815q0 != null) {
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
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().f31447s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                            PhotoViewer.t1().G0(false, true);
                        } else if (org.telegram.ui.i4.I() && org.telegram.ui.i4.x().V) {
                            org.telegram.ui.i4.x().o(false, true);
                        }
                        lc.x();
                        f60 f60Var = f60.D3;
                        if (f60Var != null) {
                            f60Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.f30815q0.U(true, true);
                            launchActivity.f30819s0.U(true, true);
                        }
                        ry ryVar = new ry(i40);
                        ryVar.C2 = launchActivity;
                        if (!AndroidUtilities.isTablet() ? !(launchActivity.f30815q0.getFragmentStack().size() <= 1 || !(launchActivity.f30815q0.getFragmentStack().get(launchActivity.f30815q0.getFragmentStack().size() - 1) instanceof zg0)) : !(launchActivity.f30817r0.getFragmentStack().isEmpty() || !(launchActivity.f30817r0.getFragmentStack().get(launchActivity.f30817r0.getFragmentStack().size() - 1) instanceof zg0))) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        ((ActionBarLayout) launchActivity.O()).S(ryVar, z14, false);
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
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            case 25:
                TLObject tLObject3 = (TLObject) this.d;
                int i41 = this.f8459b;
                String str3 = (String) this.e;
                ia0 ia0Var = (ia0) this.f8461f;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) hg.c.h(1, ((LaunchActivity) this.f8460c).f30791d0);
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
                            a02 = xc.a0(n2Var4);
                            i13 = R.string.NoFolderFound;
                        } else {
                            ?? bbVar = new bb(n2Var4, false);
                            bbVar.Y = -1;
                            bbVar.f23181c0 = "";
                            bbVar.f23182d0 = new ArrayList();
                            bbVar.f23184f0 = "";
                            bbVar.f23186h0 = new ArrayList();
                            ArrayList arrayList16 = new ArrayList();
                            bbVar.f23187i0 = arrayList16;
                            bbVar.f23203z0 = -1;
                            bbVar.C0 = -5;
                            bbVar.X = str3;
                            bbVar.Z = chatlist_chatlistinvite;
                            arrayList16.clear();
                            if (z18) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                bbVar.f23181c0 = tL_textWithEntities.text;
                                bbVar.f23182d0 = tL_textWithEntities.entities;
                                bbVar.f23183e0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                bbVar.f23185g0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                bbVar.f23185g0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                bbVar.f23188j0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                bbVar.Y = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList17 = n2Var4.getMessagesController().dialogFilters;
                                if (arrayList17 != null) {
                                    while (true) {
                                        if (i16 < arrayList17.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList17.get(i16);
                                            if (dialogFilter.f15577id == bbVar.Y) {
                                                bbVar.f23181c0 = dialogFilter.name;
                                                bbVar.f23182d0 = dialogFilter.entities;
                                                bbVar.f23183e0 = dialogFilter.title_noanimate;
                                            } else {
                                                i16++;
                                            }
                                        }
                                    }
                                }
                            }
                            bbVar.S();
                            n2Var4.showDialog(bbVar);
                            ia0Var.run();
                            return;
                        }
                    } else {
                        a02 = xc.a0(n2Var4);
                        i13 = R.string.NoFolderFound;
                    }
                    ia0Var.run();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                org.telegram.messenger.z0.p(i13, a02, null);
                break;
            case 26:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f8460c;
                ia0 ia0Var2 = (ia0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f8461f;
                int i42 = this.f8459b;
                ArrayList arrayList18 = launchActivity2.f30791d0;
                if (!launchActivity2.isFinishing()) {
                    try {
                        ia0Var2.run();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    if (tL_error2 == null) {
                        if (launchActivity2.f30815q0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                            TLRPC.Chat chat5 = updates2.chats.get(0);
                            chat5.left = false;
                            chat5.kicked = false;
                            MessagesController.getInstance(i42).putUsers(updates2.users, false);
                            MessagesController.getInstance(i42).putChats(updates2.chats, false);
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chat5.f18083id);
                            if (arrayList18.isEmpty() || MessagesController.getInstance(i42).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.n2) hg.c.h(1, arrayList18))) {
                                xn xnVar2 = new xn(bundle2);
                                NotificationCenter.getInstance(i42).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                                ((ActionBarLayout) launchActivity2.O()).S(xnVar2, false, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity2);
                    alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.AppName);
                    if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                        alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.FloodWait);
                    } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                        alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.JoinToGroupErrorFull);
                    } else {
                        alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    launchActivity2.B0(alertDialog$Builder);
                    return;
                }
                return;
            case 27:
                ag0 ag0Var = (ag0) this.f8460c;
                String str4 = (String) this.d;
                String str5 = (String) this.e;
                String str6 = (String) this.f8461f;
                int i43 = this.f8459b;
                ArrayList arrayList19 = new ArrayList();
                ?? obj7 = new Object();
                obj7.f3834b = "inapp";
                obj7.f3833a = str4;
                arrayList19.add(obj7.a());
                FileLog.d("LoginBilling querying \"" + str4 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList19, new org.telegram.ui.Components.e2(ag0Var, str4, str5, str6, i43));
                return;
            case 28:
                int i44 = this.f8459b;
                h9 h9Var5 = (h9) this.e;
                TLRPC.User user4 = (TLRPC.User) this.f8461f;
                ((int[]) this.f8460c)[0] = i44;
                h9Var5.r(user4);
                ((w9) this.d).e(user4, h9Var5);
                return;
            default:
                qg.p2 p2Var = (qg.p2) this.f8460c;
                int i45 = this.f8459b;
                List list = (List) this.d;
                ArrayList arrayList20 = (ArrayList) this.e;
                ir0 ir0Var = (ir0) this.f8461f;
                if (p2Var.I != null && !p2Var.f41531y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / p2Var.I.getWidth(), 1.0f / p2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i45);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i45 / 90) % 2 != 0) {
                        matrix.postScale(p2Var.I.getHeight(), p2Var.I.getWidth());
                    } else {
                        matrix.postScale(p2Var.I.getWidth(), p2Var.I.getHeight());
                    }
                    if (list.isEmpty()) {
                        qg.m2 m2Var = new qg.m2(p2Var);
                        m2Var.h.set(0.0f, 0.0f, p2Var.I.getWidth(), p2Var.I.getHeight());
                        m2Var.f41414i.set(m2Var.h);
                        matrix.mapRect(m2Var.f41414i);
                        m2Var.f41411c = i45;
                        Bitmap d = p2Var.d(p2Var.I, 0, 0, false);
                        m2Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        m2Var.f41412f = m2Var.c();
                        qg.p2.c(m2Var, p2Var.T, p2Var.U);
                        p2Var.O = m2Var.f41415j;
                        p2Var.P = m2Var.f41416k;
                        arrayList20.add(m2Var);
                        AndroidUtilities.runOnUIThread(new yr0(p2Var, arrayList20, ir0Var, m2Var, 23));
                        p2Var.E = m2Var;
                        p2Var.f41531y = true;
                        p2Var.f41530x = false;
                        return;
                    }
                    for (int i46 = 0; i46 < list.size(); i46++) {
                        qg.o2 o2Var = (qg.o2) list.get(i46);
                        qg.m2 m2Var2 = new qg.m2(p2Var);
                        m2Var2.h.set(o2Var.f41462b, o2Var.f41463c, i14 + o2Var.d, i15 + o2Var.e);
                        m2Var2.f41414i.set(m2Var2.h);
                        matrix.mapRect(m2Var2.f41414i);
                        m2Var2.f41411c = i45;
                        Bitmap d10 = p2Var.d(o2Var.f41461a, o2Var.f41462b, o2Var.f41463c, false);
                        m2Var2.d = d10;
                        if (d10 != null) {
                            m2Var2.f41412f = m2Var2.c();
                            qg.p2.c(m2Var2, p2Var.T, p2Var.U);
                            p2Var.O = m2Var2.f41415j;
                            p2Var.P = m2Var2.f41416k;
                            arrayList20.add(m2Var2);
                        }
                    }
                    p2Var.E = null;
                    p2Var.f41531y = true;
                    p2Var.f41530x = false;
                    AndroidUtilities.runOnUIThread(new p2.b(7, p2Var, arrayList20));
                    return;
                }
                return;
        }
    }

    public l3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f8458a = i11;
        this.f8460c = obj;
        this.f8459b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f8461f = obj4;
    }

    public l3(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.f8458a = i11;
        this.f8460c = obj;
        this.d = obj2;
        this.f8459b = i10;
        this.e = obj3;
        this.f8461f = obj4;
    }

    public l3(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f8458a = i11;
        this.f8460c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f8459b = i10;
        this.f8461f = obj4;
    }

    public l3(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f8458a = i11;
        this.f8460c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f8461f = obj4;
        this.f8459b = i10;
    }

    public l3(int[] iArr, int i10, h9 h9Var, TLRPC.User user, w9 w9Var) {
        this.f8458a = 28;
        this.f8460c = iArr;
        this.f8459b = i10;
        this.e = h9Var;
        this.f8461f = user;
        this.d = w9Var;
    }
}
