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
import ci.oc;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.yg;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.wm;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.aj;
import org.telegram.ui.bo;
import org.telegram.ui.eh0;
import org.telegram.ui.es0;
import org.telegram.ui.fg0;
import org.telegram.ui.gy;
import org.telegram.ui.i60;
import org.telegram.ui.in;
import org.telegram.ui.ma0;
import org.telegram.ui.nn;
import org.telegram.ui.or0;
import org.telegram.ui.uy;
import org.telegram.ui.zm;
public final class l3 implements Runnable {
    public final int f8472a;
    public final int f8473b;
    public final Object f8474c;
    public final Object d;
    public final Object e;
    public final Object f8475f;

    public l3(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f8472a = 19;
        this.f8473b = i10;
        this.f8474c = chat;
        this.d = arrayList;
        this.e = arrayList2;
        this.f8475f = arrayList3;
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
        org.telegram.ui.h4 h4Var;
        int i10;
        Object obj2;
        String lowerCase;
        int i11;
        org.telegram.ui.ActionBar.n2 R;
        int i12;
        boolean z13;
        boolean z14;
        vc a02;
        int i13;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        int i14;
        int i15;
        long j11 = 0;
        String str = "";
        int i16 = 0;
        switch (this.f8472a) {
            case 0:
                long[] jArr = (long[]) this.f8474c;
                int i17 = this.f8473b;
                u9 u9Var = (u9) this.d;
                u9 u9Var2 = (u9) this.e;
                TextView textView = (TextView) this.f8475f;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i17).getUser(Long.valueOf(jArr[0]));
                    f9 f9Var = new f9((e6) null);
                    f9Var.r(user);
                    u9Var.e(user, f9Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i17).getChat(Long.valueOf(-jArr[0]));
                    f9 f9Var2 = new f9((e6) null);
                    f9Var2.q(chat);
                    u9Var.e(chat, f9Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i17).getUser(Long.valueOf(jArr[0]));
                    if (u9Var2 != null) {
                        f9 f9Var3 = new f9((e6) null);
                        f9Var3.r(user2);
                        u9Var2.e(user2, f9Var3);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user2));
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(-jArr[0]));
                if (u9Var2 != null) {
                    f9 f9Var4 = new f9((e6) null);
                    f9Var4.q(chat2);
                    u9Var2.e(chat2, f9Var4);
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
                int i18 = this.f8473b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f8475f;
                if (!(((TLObject) this.f8474c) instanceof TLRPC.TL_boolTrue)) {
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
                    MessagesController.getInstance(i18).updateEmojiStatusUntilUpdate(currentUser.f18256id, currentUser.emoji_status);
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
                final gg.i0 i0Var = (gg.i0) this.f8474c;
                int i19 = this.f8473b;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) this.f8475f;
                gg.z zVar = i0Var.f9769j0;
                ArrayList arrayList6 = i0Var.f9783v0;
                int i20 = i0Var.f9780s0;
                i0Var.D0--;
                if (i19 == i0Var.f9762d0) {
                    i0Var.f9765f0 = i19;
                    if (i0Var.f9763e0 != i19) {
                        zVar.b();
                    }
                    if (i0Var.f9766g0 != i19) {
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
                            j3 = user3.f18256id;
                        } else if (obj3 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) obj3;
                            MessagesController.getInstance(i20).putChat(chat3, z15);
                            j3 = -chat3.f18109id;
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
                                    int i24 = i0.this.f9780s0;
                                    if (i23 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j12 = j3;
                                        tL_dialog.f18113id = j12;
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
                            gy gyVar = i0Var.U;
                            if (gyVar != null && gyVar.a() == j3) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            int i23 = 0;
                            while (!z12 && i23 < size) {
                                gg.h0 h0Var = (gg.h0) arrayList6.get(i23);
                                boolean z16 = z12;
                                int i24 = i23;
                                if (h0Var != null && h0Var.f9752c == j3) {
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
                    i0Var.f9779s = arrayList3;
                    i0Var.G = arrayList4;
                    zVar.f(arrayList3, arrayList6);
                    i0Var.l();
                    gy gyVar2 = i0Var.U;
                    if (gyVar2 != null) {
                        if (i0Var.D0 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        gyVar2.d(z11, true);
                        i0Var.U.c();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                gg.u1 u1Var = (gg.u1) this.f8474c;
                int i25 = this.f8473b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                ArrayList arrayList9 = (ArrayList) this.f8475f;
                if (i25 == u1Var.E) {
                    u1Var.d = arrayList7;
                    u1Var.e = arrayList8;
                    u1Var.H = arrayList9;
                    u1Var.f9944f.f(arrayList7, null);
                    u1Var.f9950y = false;
                    u1Var.l();
                    u1Var.F();
                    return;
                }
                return;
            case 4:
                Pair pair = (Pair) this.d;
                ((i2.c1) this.f8474c).f10632b.h.h(((Integer) pair.first).intValue(), (u2.f0) pair.second, (u2.t) this.e, (u2.b0) this.f8475f, this.f8473b);
                return;
            case 5:
                m4.l0 l0Var = (m4.l0) this.f8474c;
                m4.m1 m1Var = (m4.m1) this.d;
                int i26 = this.f8473b;
                n4.a0 a0Var = (n4.a0) this.e;
                m4.k0 k0Var = (m4.k0) this.f8475f;
                ni.f fVar = l0Var.f14593f;
                if (!l0Var.f14594g.j()) {
                    if (!((n4.r) l0Var.f14597k.f14992b).f14973a.isActive()) {
                        StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                        if (m1Var == null) {
                            obj = Integer.valueOf(i26);
                        } else {
                            obj = m1Var.f14616b;
                        }
                        sb2.append(obj);
                        sb2.append(", pid=");
                        sb2.append(a0Var.f14927a.f14929b);
                        e2.a.n("MediaSessionLegacyStub", sb2.toString());
                        return;
                    }
                    m4.r L = l0Var.L(a0Var);
                    if (m1Var != null) {
                        if (!fVar.D(L, m1Var)) {
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
                LocationController.lambda$fetchLocationAddress$29((Locale) this.f8474c, (Location) this.d, this.f8473b, (Locale) this.e, (LocationController.LocationFetchCallback) this.f8475f);
                return;
            case 7:
                ((MediaDataController) this.f8474c).lambda$removeMultipleStickerSets$110((boolean[]) this.d, (ArrayList) this.e, this.f8473b, (int[]) this.f8475f);
                return;
            case 8:
                ((MessagesController) this.f8474c).lambda$processUpdateArray$403((yf.r) this.d, (ConcurrentHashMap) this.e, (ConcurrentHashMap) this.f8475f, this.f8473b);
                return;
            case 9:
                ((MessagesStorage) this.f8474c).lambda$getSentFile$164((String) this.d, this.f8473b, (Object[]) this.e, (CountDownLatch) this.f8475f);
                return;
            case 10:
                ((MessagesStorage) this.f8474c).lambda$putSentFile$170((String) this.d, (TLObject) this.e, this.f8473b, (String) this.f8475f);
                return;
            case 11:
                ((NotificationCenter) this.f8474c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.e, (yg) this.f8475f, this.f8473b);
                return;
            case 12:
                ((VoIPService) this.f8474c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.f8473b, (String) this.e, (TLRPC.TL_error) this.f8475f);
                return;
            case 13:
                org.telegram.ui.h4 h4Var2 = (org.telegram.ui.h4) this.f8474c;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                String str2 = (String) this.f8475f;
                int i27 = this.f8473b;
                ArrayList arrayList11 = new ArrayList();
                int size2 = arrayList10.size();
                int i28 = 0;
                while (i28 < size2) {
                    Object obj4 = arrayList10.get(i28);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj4);
                    if (obj4 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj4;
                        int i29 = i28;
                        h4Var = h4Var2;
                        i10 = i29;
                        obj2 = obj4;
                        CharSequence C = org.telegram.ui.h4.C(h4Var, h4Var2.f34090u0[i16].f35308c.E, null, richText, richText, pageBlock, 1000);
                        if (!TextUtils.isEmpty(C)) {
                            lowerCase = C.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        int i30 = i28;
                        h4Var = h4Var2;
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
                                    obj5.f36738a = indexOf;
                                    obj5.f36740c = pageBlock;
                                    obj5.f36739b = obj2;
                                    arrayList11.add(obj5);
                                }
                                i31 = length;
                            }
                        }
                    }
                    org.telegram.ui.h4 h4Var3 = h4Var;
                    i28 = i10 + 1;
                    h4Var2 = h4Var3;
                    i16 = 0;
                }
                AndroidUtilities.runOnUIThread(new c9(h4Var2, i27, arrayList11, str2, 10));
                return;
            case 14:
                TLObject tLObject = (TLObject) this.f8474c;
                int i32 = this.f8473b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f8475f;
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
                        tL_inputGroupCall.f18126id = groupCall.f18119id;
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
                        tL_inputGroupCall2.f18126id = groupCall2.f18119id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.f2.g(LaunchActivity.G1, i32, tL_inputGroupCall2, false, groupCall2, hashSet);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    vc.a0(n2Var).d0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 15:
                bo.N0((bo) this.f8474c, this.f8473b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f8475f);
                return;
            case 16:
                nn nnVar = (nn) this.f8474c;
                aj ajVar = (aj) this.d;
                ajVar.f15208b = nnVar.f36017a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.e).f18109id, this.f8473b, new in(nnVar, ajVar, (bo) this.f8475f));
                return;
            case 17:
                nn nnVar2 = (nn) this.f8474c;
                int i33 = this.f8473b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f8475f;
                bo boVar = nnVar2.f36017a;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == boVar.L6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                boVar.Xa(i33, id2, true, i11, true, 0, num, bArr, new zm(nnVar2, messageObject, 1));
                return;
            case 18:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.f8474c;
                int[] iArr = (int[]) this.d;
                int i34 = this.f8473b;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f8475f;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new org.telegram.ui.Components.y1(iArr, runnable, i34));
                    n2Var2.showDialog(b2VarArr[0]);
                    return;
                }
                return;
            case 19:
                int i35 = this.f8473b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.f8474c;
                ArrayList arrayList12 = (ArrayList) this.d;
                ArrayList arrayList13 = (ArrayList) this.e;
                ArrayList arrayList14 = (ArrayList) this.f8475f;
                if (LaunchActivity.C1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    rg.j0 j0Var = new rg.j0(11, i35, R.getParentActivity(), R, null);
                    j0Var.I1(chat4, arrayList12, arrayList13, arrayList14, null);
                    j0Var.show();
                    return;
                }
                return;
            case 20:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.e;
                int i36 = this.f8473b;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.f8475f;
                SharedPreferences.Editor edit = ((SharedPreferences) this.f8474c).edit();
                edit.putLong("support_id2", tL_help_support.user.f18256id);
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
                bundle.putLong("user_id", tL_help_support.user.f18256id);
                n2Var3.presentFragment(new bo(bundle));
                return;
            case 21:
                fs.P((fs) this.f8474c, (TLObject) this.d, (TLRPC.InputPeer) this.e, this.f8473b, (int[]) this.f8475f);
                return;
            case 22:
                xv0 xv0Var = (xv0) this.f8474c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i37 = this.f8473b;
                MessageObject messageObject2 = (MessageObject) this.e;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f8475f;
                int[] iArr2 = xv0Var.e;
                RLottieNative[] rLottieNativeArr = xv0Var.f30070f1;
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
                                xv0Var.f30071g1[i38] = iArr2[0];
                            }
                        }
                    }
                }
                if (z17) {
                    AndroidUtilities.runOnUIThread(new vv0(xv0Var, 3));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new wm(xv0Var, i37, t1Var, 17));
                    return;
                }
            case 23:
                LaunchActivity launchActivity = (LaunchActivity) this.f8474c;
                TLObject tLObject2 = (TLObject) this.d;
                Uri uri = (Uri) this.e;
                int i39 = this.f8473b;
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) this.f8475f;
                Pattern pattern = LaunchActivity.B1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject2 != null && launchActivity.f30841q0 != null) {
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
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().f31473s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                            PhotoViewer.t1().G0(false, true);
                        } else if (org.telegram.ui.h4.I() && org.telegram.ui.h4.x().V) {
                            org.telegram.ui.h4.x().o(false, true);
                        }
                        oc.x();
                        i60 i60Var = i60.D3;
                        if (i60Var != null) {
                            i60Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.f30841q0.U(true, true);
                            launchActivity.f30845s0.U(true, true);
                        }
                        uy uyVar = new uy(i40);
                        uyVar.C2 = launchActivity;
                        if (!AndroidUtilities.isTablet() ? !(launchActivity.f30841q0.getFragmentStack().size() <= 1 || !(launchActivity.f30841q0.getFragmentStack().get(launchActivity.f30841q0.getFragmentStack().size() - 1) instanceof eh0)) : !(launchActivity.f30843r0.getFragmentStack().isEmpty() || !(launchActivity.f30843r0.getFragmentStack().get(launchActivity.f30843r0.getFragmentStack().size() - 1) instanceof eh0))) {
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
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            case 24:
                TLObject tLObject3 = (TLObject) this.d;
                int i41 = this.f8473b;
                String str3 = (String) this.e;
                ma0 ma0Var = (ma0) this.f8475f;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) hg.c.h(1, ((LaunchActivity) this.f8474c).f30817d0);
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
                            a02 = vc.a0(n2Var4);
                            i13 = R.string.NoFolderFound;
                        } else {
                            ?? zaVar = new za(n2Var4, false);
                            zaVar.Y = -1;
                            zaVar.f22907c0 = "";
                            zaVar.f22908d0 = new ArrayList();
                            zaVar.f22910f0 = "";
                            zaVar.f22912h0 = new ArrayList();
                            ArrayList arrayList16 = new ArrayList();
                            zaVar.f22913i0 = arrayList16;
                            zaVar.f22929z0 = -1;
                            zaVar.C0 = -5;
                            zaVar.X = str3;
                            zaVar.Z = chatlist_chatlistinvite;
                            arrayList16.clear();
                            if (z18) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                zaVar.f22907c0 = tL_textWithEntities.text;
                                zaVar.f22908d0 = tL_textWithEntities.entities;
                                zaVar.f22909e0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                zaVar.f22911g0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                zaVar.f22911g0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                zaVar.f22914j0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                zaVar.Y = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList17 = n2Var4.getMessagesController().dialogFilters;
                                if (arrayList17 != null) {
                                    while (true) {
                                        if (i16 < arrayList17.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList17.get(i16);
                                            if (dialogFilter.f15601id == zaVar.Y) {
                                                zaVar.f22907c0 = dialogFilter.name;
                                                zaVar.f22908d0 = dialogFilter.entities;
                                                zaVar.f22909e0 = dialogFilter.title_noanimate;
                                            } else {
                                                i16++;
                                            }
                                        }
                                    }
                                }
                            }
                            zaVar.S();
                            n2Var4.showDialog(zaVar);
                            ma0Var.run();
                            return;
                        }
                    } else {
                        a02 = vc.a0(n2Var4);
                        i13 = R.string.NoFolderFound;
                    }
                    ma0Var.run();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                org.telegram.messenger.y0.p(i13, a02, null);
                break;
            case 25:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f8474c;
                ma0 ma0Var2 = (ma0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f8475f;
                int i42 = this.f8473b;
                ArrayList arrayList18 = launchActivity2.f30817d0;
                if (!launchActivity2.isFinishing()) {
                    try {
                        ma0Var2.run();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    if (tL_error2 == null) {
                        if (launchActivity2.f30841q0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                            TLRPC.Chat chat5 = updates2.chats.get(0);
                            chat5.left = false;
                            chat5.kicked = false;
                            MessagesController.getInstance(i42).putUsers(updates2.users, false);
                            MessagesController.getInstance(i42).putChats(updates2.chats, false);
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chat5.f18109id);
                            if (arrayList18.isEmpty() || MessagesController.getInstance(i42).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.n2) hg.c.h(1, arrayList18))) {
                                bo boVar2 = new bo(bundle2);
                                NotificationCenter.getInstance(i42).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                                ((ActionBarLayout) launchActivity2.O()).S(boVar2, false, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity2);
                    alertDialog$Builder.f18435a.R = LocaleController.getString(R.string.AppName);
                    if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                        alertDialog$Builder.f18435a.T = LocaleController.getString(R.string.FloodWait);
                    } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                        alertDialog$Builder.f18435a.T = LocaleController.getString(R.string.JoinToGroupErrorFull);
                    } else {
                        alertDialog$Builder.f18435a.T = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    launchActivity2.B0(alertDialog$Builder);
                    return;
                }
                return;
            case 26:
                fg0 fg0Var = (fg0) this.f8474c;
                String str4 = (String) this.d;
                String str5 = (String) this.e;
                String str6 = (String) this.f8475f;
                int i43 = this.f8473b;
                ArrayList arrayList19 = new ArrayList();
                ?? obj7 = new Object();
                obj7.f3839b = "inapp";
                obj7.f3838a = str4;
                arrayList19.add(obj7.a());
                FileLog.d("LoginBilling querying \"" + str4 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList19, new org.telegram.ui.Components.d2(fg0Var, str4, str5, str6, i43));
                return;
            case 27:
                int i44 = this.f8473b;
                f9 f9Var5 = (f9) this.e;
                TLRPC.User user4 = (TLRPC.User) this.f8475f;
                ((int[]) this.f8474c)[0] = i44;
                f9Var5.r(user4);
                ((u9) this.d).e(user4, f9Var5);
                return;
            default:
                qg.p2 p2Var = (qg.p2) this.f8474c;
                int i45 = this.f8473b;
                List list = (List) this.d;
                ArrayList arrayList20 = (ArrayList) this.e;
                or0 or0Var = (or0) this.f8475f;
                if (p2Var.I != null && !p2Var.f41575y) {
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
                        m2Var.f41458i.set(m2Var.h);
                        matrix.mapRect(m2Var.f41458i);
                        m2Var.f41455c = i45;
                        Bitmap d = p2Var.d(p2Var.I, 0, 0, false);
                        m2Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        m2Var.f41456f = m2Var.c();
                        qg.p2.c(m2Var, p2Var.T, p2Var.U);
                        p2Var.O = m2Var.f41459j;
                        p2Var.P = m2Var.f41460k;
                        arrayList20.add(m2Var);
                        AndroidUtilities.runOnUIThread(new es0(p2Var, arrayList20, or0Var, m2Var, 23));
                        p2Var.E = m2Var;
                        p2Var.f41575y = true;
                        p2Var.f41574x = false;
                        return;
                    }
                    for (int i46 = 0; i46 < list.size(); i46++) {
                        qg.o2 o2Var = (qg.o2) list.get(i46);
                        qg.m2 m2Var2 = new qg.m2(p2Var);
                        m2Var2.h.set(o2Var.f41506b, o2Var.f41507c, i14 + o2Var.d, i15 + o2Var.e);
                        m2Var2.f41458i.set(m2Var2.h);
                        matrix.mapRect(m2Var2.f41458i);
                        m2Var2.f41455c = i45;
                        Bitmap d10 = p2Var.d(o2Var.f41505a, o2Var.f41506b, o2Var.f41507c, false);
                        m2Var2.d = d10;
                        if (d10 != null) {
                            m2Var2.f41456f = m2Var2.c();
                            qg.p2.c(m2Var2, p2Var.T, p2Var.U);
                            p2Var.O = m2Var2.f41459j;
                            p2Var.P = m2Var2.f41460k;
                            arrayList20.add(m2Var2);
                        }
                    }
                    p2Var.E = null;
                    p2Var.f41575y = true;
                    p2Var.f41574x = false;
                    AndroidUtilities.runOnUIThread(new p2.b(7, p2Var, arrayList20));
                    return;
                }
                return;
        }
    }

    public l3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f8472a = i11;
        this.f8474c = obj;
        this.f8473b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f8475f = obj4;
    }

    public l3(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.f8472a = i11;
        this.f8474c = obj;
        this.d = obj2;
        this.f8473b = i10;
        this.e = obj3;
        this.f8475f = obj4;
    }

    public l3(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f8472a = i11;
        this.f8474c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f8473b = i10;
        this.f8475f = obj4;
    }

    public l3(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f8472a = i11;
        this.f8474c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f8475f = obj4;
        this.f8473b = i10;
    }

    public l3(int[] iArr, int i10, f9 f9Var, TLRPC.User user, u9 u9Var) {
        this.f8472a = 27;
        this.f8474c = iArr;
        this.f8473b = i10;
        this.e = f9Var;
        this.f8475f = user;
        this.d = u9Var;
    }
}
