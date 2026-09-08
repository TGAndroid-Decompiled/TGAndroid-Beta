package fi;

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
import bi.k8;
import di.pc;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.aj;
import org.telegram.ui.an;
import org.telegram.ui.co;
import org.telegram.ui.dm;
import org.telegram.ui.eh0;
import org.telegram.ui.es0;
import org.telegram.ui.fg0;
import org.telegram.ui.gy;
import org.telegram.ui.j60;
import org.telegram.ui.jn;
import org.telegram.ui.on;
import org.telegram.ui.or0;
import org.telegram.ui.r80;
import org.telegram.ui.uy;
public final class l3 implements Runnable {
    public final int f9834a;
    public final int f9835b;
    public final Object f9836c;
    public final Object d;
    public final Object f9837e;
    public final Object f9838f;

    public l3(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f9834a = 19;
        this.f9835b = i10;
        this.f9836c = chat;
        this.d = arrayList;
        this.f9837e = arrayList2;
        this.f9838f = arrayList3;
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
        switch (this.f9834a) {
            case 0:
                long[] jArr = (long[]) this.f9836c;
                int i17 = this.f9835b;
                x9 x9Var = (x9) this.d;
                x9 x9Var2 = (x9) this.f9837e;
                TextView textView = (TextView) this.f9838f;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i17).getUser(Long.valueOf(jArr[0]));
                    i9 i9Var = new i9((f6) null);
                    i9Var.r(user);
                    x9Var.e(user, i9Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i17).getChat(Long.valueOf(-jArr[0]));
                    i9 i9Var2 = new i9((f6) null);
                    i9Var2.q(chat);
                    x9Var.e(chat, i9Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i17).getUser(Long.valueOf(jArr[0]));
                    if (x9Var2 != null) {
                        i9 i9Var3 = new i9((f6) null);
                        i9Var3.r(user2);
                        x9Var2.e(user2, i9Var3);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user2));
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(-jArr[0]));
                if (x9Var2 != null) {
                    i9 i9Var4 = new i9((f6) null);
                    i9Var4.q(chat2);
                    x9Var2.e(chat2, i9Var4);
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
                Utilities.Callback callback = (Utilities.Callback) this.f9837e;
                int i18 = this.f9835b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f9838f;
                if (!(((TLObject) this.f9836c) instanceof TLRPC.TL_boolTrue)) {
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
                    MessagesController.getInstance(i18).updateEmojiStatusUntilUpdate(currentUser.f20043id, currentUser.emoji_status);
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
                final hg.i0 i0Var = (hg.i0) this.f9836c;
                int i19 = this.f9835b;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = (ArrayList) this.f9837e;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) this.f9838f;
                hg.z zVar = i0Var.f11108j0;
                ArrayList arrayList6 = i0Var.f11122v0;
                int i20 = i0Var.f11119s0;
                i0Var.D0--;
                if (i19 == i0Var.f11100d0) {
                    i0Var.f11104f0 = i19;
                    if (i0Var.f11102e0 != i19) {
                        zVar.b();
                    }
                    if (i0Var.f11105g0 != i19) {
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
                            j3 = user3.f20043id;
                        } else if (obj3 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) obj3;
                            MessagesController.getInstance(i20).putChat(chat3, z15);
                            j3 = -chat3.f19896id;
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
                                    int i24 = i0.this.f11119s0;
                                    if (i23 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j12 = j3;
                                        tL_dialog.f19900id = j12;
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
                                hg.h0 h0Var = (hg.h0) arrayList6.get(i23);
                                boolean z16 = z12;
                                int i24 = i23;
                                if (h0Var != null && h0Var.f11090c == j3) {
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
                    i0Var.f11118s = arrayList3;
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
                hg.u1 u1Var = (hg.u1) this.f9836c;
                int i25 = this.f9835b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.f9837e;
                ArrayList arrayList9 = (ArrayList) this.f9838f;
                if (i25 == u1Var.E) {
                    u1Var.d = arrayList7;
                    u1Var.f11296e = arrayList8;
                    u1Var.H = arrayList9;
                    u1Var.f11297f.f(arrayList7, null);
                    u1Var.f11303y = false;
                    u1Var.l();
                    u1Var.F();
                    return;
                }
                return;
            case 4:
                Pair pair = (Pair) this.d;
                ((i2.c1) this.f9836c).f11499b.h.h(((Integer) pair.first).intValue(), (u2.f0) pair.second, (u2.t) this.f9837e, (u2.b0) this.f9838f, this.f9835b);
                return;
            case 5:
                m4.k0 k0Var = (m4.k0) this.f9836c;
                m4.l1 l1Var = (m4.l1) this.d;
                int i26 = this.f9835b;
                n4.a0 a0Var = (n4.a0) this.f9837e;
                m4.j0 j0Var = (m4.j0) this.f9838f;
                fg.f fVar = k0Var.f15996f;
                if (!k0Var.f15997g.j()) {
                    if (!((n4.r) k0Var.f16000k.f16523b).f16503a.isActive()) {
                        StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                        if (l1Var == null) {
                            obj = Integer.valueOf(i26);
                        } else {
                            obj = l1Var.f16026b;
                        }
                        sb2.append(obj);
                        sb2.append(", pid=");
                        sb2.append(a0Var.f16452a.f16454b);
                        e2.a.n("MediaSessionLegacyStub", sb2.toString());
                        return;
                    }
                    m4.r L = k0Var.L(a0Var);
                    if (l1Var != null) {
                        if (!fVar.E(L, l1Var)) {
                            return;
                        }
                    } else if (!fVar.D(L, i26)) {
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
                LocationController.lambda$fetchLocationAddress$29((Locale) this.f9836c, (Location) this.d, this.f9835b, (Locale) this.f9837e, (LocationController.LocationFetchCallback) this.f9838f);
                return;
            case 7:
                ((MediaDataController) this.f9836c).lambda$removeMultipleStickerSets$110((boolean[]) this.d, (ArrayList) this.f9837e, this.f9835b, (int[]) this.f9838f);
                return;
            case 8:
                ((MessagesController) this.f9836c).lambda$processUpdateArray$403((yf.r) this.d, (ConcurrentHashMap) this.f9837e, (ConcurrentHashMap) this.f9838f, this.f9835b);
                return;
            case 9:
                ((MessagesStorage) this.f9836c).lambda$getSentFile$164((String) this.d, this.f9835b, (Object[]) this.f9837e, (CountDownLatch) this.f9838f);
                return;
            case 10:
                ((MessagesStorage) this.f9836c).lambda$putSentFile$170((String) this.d, (TLObject) this.f9837e, this.f9835b, (String) this.f9838f);
                return;
            case 11:
                ((NotificationCenter) this.f9836c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.f9837e, (yg) this.f9838f, this.f9835b);
                return;
            case 12:
                ((VoIPService) this.f9836c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.f9835b, (String) this.f9837e, (TLRPC.TL_error) this.f9838f);
                return;
            case 13:
                org.telegram.ui.i4 i4Var2 = (org.telegram.ui.i4) this.f9836c;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.f9837e;
                String str2 = (String) this.f9838f;
                int i27 = this.f9835b;
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
                        CharSequence C = org.telegram.ui.i4.C(i4Var, i4Var2.f37259u0[i16].f38579c.E, null, richText, richText, pageBlock, 1000);
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
                                    obj5.f40078a = indexOf;
                                    obj5.f40080c = pageBlock;
                                    obj5.f40079b = obj2;
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
                AndroidUtilities.runOnUIThread(new k8(i4Var2, i27, arrayList11, str2, 10));
                return;
            case 14:
                TLObject tLObject = (TLObject) this.f9836c;
                int i32 = this.f9835b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f9837e;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f9838f;
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
                        tL_inputGroupCall.f19913id = groupCall.f19906id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.d2.g(LaunchActivity.G1, i32, tL_inputGroupCall, false, groupCall, hashSet);
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
                        tL_inputGroupCall2.f19913id = groupCall2.f19906id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.d2.g(LaunchActivity.G1, i32, tL_inputGroupCall2, false, groupCall2, hashSet);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    yc.a0(n2Var).d0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 15:
                co.N0((co) this.f9836c, this.f9835b, (Boolean) this.d, (TLRPC.WebPage) this.f9837e, (TL_account.getWebPagePreview) this.f9838f);
                return;
            case 16:
                on onVar = (on) this.f9836c;
                aj ajVar = (aj) this.d;
                ajVar.f17031b = onVar.f39310a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.f9837e).f19896id, this.f9835b, new jn(onVar, ajVar, (co) this.f9838f));
                return;
            case 17:
                on onVar2 = (on) this.f9836c;
                int i33 = this.f9835b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.f9837e;
                byte[] bArr = (byte[]) this.f9838f;
                co coVar = onVar2.f39310a;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == coVar.L6) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                coVar.Xa(i33, id2, true, i11, true, 0, num, bArr, new an(onVar2, messageObject, 1));
                return;
            case 18:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.f9836c;
                int[] iArr = (int[]) this.d;
                int i34 = this.f9835b;
                Runnable runnable = (Runnable) this.f9837e;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f9838f;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new org.telegram.ui.Components.z1(iArr, runnable, i34));
                    n2Var2.showDialog(b2VarArr[0]);
                    return;
                }
                return;
            case 19:
                int i35 = this.f9835b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.f9836c;
                ArrayList arrayList12 = (ArrayList) this.d;
                ArrayList arrayList13 = (ArrayList) this.f9837e;
                ArrayList arrayList14 = (ArrayList) this.f9838f;
                if (LaunchActivity.C1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    sg.k0 k0Var2 = new sg.k0(11, i35, R.getParentActivity(), R, null);
                    k0Var2.I1(chat4, arrayList12, arrayList13, arrayList14, null);
                    k0Var2.show();
                    return;
                }
                return;
            case 20:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.f9837e;
                int i36 = this.f9835b;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.f9838f;
                SharedPreferences.Editor edit = ((SharedPreferences) this.f9836c).edit();
                edit.putLong("support_id2", tL_help_support.user.f20043id);
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
                bundle.putLong("user_id", tL_help_support.user.f20043id);
                n2Var3.presentFragment(new co(bundle));
                return;
            case 21:
                es.P((es) this.f9836c, (TLObject) this.d, (TLRPC.InputPeer) this.f9837e, this.f9835b, (int[]) this.f9838f);
                return;
            case 22:
                wv0 wv0Var = (wv0) this.f9836c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i37 = this.f9835b;
                MessageObject messageObject2 = (MessageObject) this.f9837e;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f9838f;
                int[] iArr2 = wv0Var.f32584e;
                RLottieNative[] rLottieNativeArr = wv0Var.f32377f1;
                if (wv0Var.W0) {
                    AndroidUtilities.runOnUIThread(new uv0(wv0Var, 2));
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
                                AndroidUtilities.runOnUIThread(new vv0(document, i37, messageObject2, t1Var, tL_messages_stickerSet, 1));
                                z17 = true;
                            } else {
                                rLottieNativeArr[i38] = RLottieNative.b(readRes, iArr2, null, null);
                                wv0Var.f32378g1[i38] = iArr2[0];
                            }
                        }
                    }
                }
                if (z17) {
                    AndroidUtilities.runOnUIThread(new uv0(wv0Var, 3));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new dm(wv0Var, i37, t1Var, 18));
                    return;
                }
            case 23:
                LaunchActivity launchActivity = (LaunchActivity) this.f9836c;
                TLObject tLObject2 = (TLObject) this.d;
                Uri uri = (Uri) this.f9837e;
                int i39 = this.f9835b;
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) this.f9838f;
                Pattern pattern = LaunchActivity.B1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject2 != null && launchActivity.f33480q0 != null) {
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
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().f34125s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                            PhotoViewer.t1().G0(false, true);
                        } else if (org.telegram.ui.i4.I() && org.telegram.ui.i4.x().V) {
                            org.telegram.ui.i4.x().o(false, true);
                        }
                        pc.x();
                        j60 j60Var = j60.D3;
                        if (j60Var != null) {
                            j60Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.f33480q0.U(true, true);
                            launchActivity.f33484s0.U(true, true);
                        }
                        uy uyVar = new uy(i40);
                        uyVar.C2 = launchActivity;
                        if (!AndroidUtilities.isTablet() ? !(launchActivity.f33480q0.getFragmentStack().size() <= 1 || !(launchActivity.f33480q0.getFragmentStack().get(launchActivity.f33480q0.getFragmentStack().size() - 1) instanceof eh0)) : !(launchActivity.f33482r0.getFragmentStack().isEmpty() || !(launchActivity.f33482r0.getFragmentStack().get(launchActivity.f33482r0.getFragmentStack().size() - 1) instanceof eh0))) {
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
            case 24:
                TLObject tLObject3 = (TLObject) this.d;
                int i41 = this.f9835b;
                String str3 = (String) this.f9837e;
                r80 r80Var = (r80) this.f9838f;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) i2.g.h(1, ((LaunchActivity) this.f9836c).f33456d0);
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
                            ?? bbVar = new bb(n2Var4, false);
                            bbVar.Y = -1;
                            bbVar.f24870c0 = "";
                            bbVar.f24871d0 = new ArrayList();
                            bbVar.f24873f0 = "";
                            bbVar.f24875h0 = new ArrayList();
                            ArrayList arrayList16 = new ArrayList();
                            bbVar.f24876i0 = arrayList16;
                            bbVar.f24892z0 = -1;
                            bbVar.C0 = -5;
                            bbVar.X = str3;
                            bbVar.Z = chatlist_chatlistinvite;
                            arrayList16.clear();
                            if (z18) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                bbVar.f24870c0 = tL_textWithEntities.text;
                                bbVar.f24871d0 = tL_textWithEntities.entities;
                                bbVar.f24872e0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                bbVar.f24874g0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                bbVar.f24874g0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                bbVar.f24877j0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                bbVar.Y = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList17 = n2Var4.getMessagesController().dialogFilters;
                                if (arrayList17 != null) {
                                    while (true) {
                                        if (i16 < arrayList17.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList17.get(i16);
                                            if (dialogFilter.f17107id == bbVar.Y) {
                                                bbVar.f24870c0 = dialogFilter.name;
                                                bbVar.f24871d0 = dialogFilter.entities;
                                                bbVar.f24872e0 = dialogFilter.title_noanimate;
                                            } else {
                                                i16++;
                                            }
                                        }
                                    }
                                }
                            }
                            bbVar.S();
                            n2Var4.showDialog(bbVar);
                            r80Var.run();
                            return;
                        }
                    } else {
                        a02 = yc.a0(n2Var4);
                        i13 = R.string.NoFolderFound;
                    }
                    r80Var.run();
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
                org.telegram.messenger.w1.p(i13, a02, null);
                break;
            case 25:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f9836c;
                r80 r80Var2 = (r80) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f9837e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f9838f;
                int i42 = this.f9835b;
                ArrayList arrayList18 = launchActivity2.f33456d0;
                if (!launchActivity2.isFinishing()) {
                    try {
                        r80Var2.run();
                    } catch (Exception e13) {
                        FileLog.e(e13);
                    }
                    if (tL_error2 == null) {
                        if (launchActivity2.f33480q0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                            TLRPC.Chat chat5 = updates2.chats.get(0);
                            chat5.left = false;
                            chat5.kicked = false;
                            MessagesController.getInstance(i42).putUsers(updates2.users, false);
                            MessagesController.getInstance(i42).putChats(updates2.chats, false);
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chat5.f19896id);
                            if (arrayList18.isEmpty() || MessagesController.getInstance(i42).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.n2) i2.g.h(1, arrayList18))) {
                                co coVar2 = new co(bundle2);
                                NotificationCenter.getInstance(i42).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                                ((ActionBarLayout) launchActivity2.O()).S(coVar2, false, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity2);
                    alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.AppName);
                    if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                        alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.FloodWait);
                    } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                        alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.JoinToGroupErrorFull);
                    } else {
                        alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    launchActivity2.B0(alertDialog$Builder);
                    return;
                }
                return;
            case 26:
                fg0 fg0Var = (fg0) this.f9836c;
                String str4 = (String) this.d;
                String str5 = (String) this.f9837e;
                String str6 = (String) this.f9838f;
                int i43 = this.f9835b;
                ArrayList arrayList19 = new ArrayList();
                ?? obj7 = new Object();
                obj7.f4369b = "inapp";
                obj7.f4368a = str4;
                arrayList19.add(obj7.a());
                FileLog.d("LoginBilling querying \"" + str4 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList19, new org.telegram.ui.Components.e2(fg0Var, str4, str5, str6, i43));
                return;
            case 27:
                int i44 = this.f9835b;
                i9 i9Var5 = (i9) this.f9837e;
                TLRPC.User user4 = (TLRPC.User) this.f9838f;
                ((int[]) this.f9836c)[0] = i44;
                i9Var5.r(user4);
                ((x9) this.d).e(user4, i9Var5);
                return;
            default:
                rg.o2 o2Var = (rg.o2) this.f9836c;
                int i45 = this.f9835b;
                List list = (List) this.d;
                ArrayList arrayList20 = (ArrayList) this.f9837e;
                or0 or0Var = (or0) this.f9838f;
                if (o2Var.I != null && !o2Var.f45431y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / o2Var.I.getWidth(), 1.0f / o2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i45);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i45 / 90) % 2 != 0) {
                        matrix.postScale(o2Var.I.getHeight(), o2Var.I.getWidth());
                    } else {
                        matrix.postScale(o2Var.I.getWidth(), o2Var.I.getHeight());
                    }
                    if (list.isEmpty()) {
                        rg.l2 l2Var = new rg.l2(o2Var);
                        l2Var.h.set(0.0f, 0.0f, o2Var.I.getWidth(), o2Var.I.getHeight());
                        l2Var.f45310i.set(l2Var.h);
                        matrix.mapRect(l2Var.f45310i);
                        l2Var.f45306c = i45;
                        Bitmap d = o2Var.d(o2Var.I, 0, 0, false);
                        l2Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        l2Var.f45308f = l2Var.c();
                        rg.o2.c(l2Var, o2Var.T, o2Var.U);
                        o2Var.O = l2Var.f45311j;
                        o2Var.P = l2Var.f45312k;
                        arrayList20.add(l2Var);
                        AndroidUtilities.runOnUIThread(new es0(o2Var, arrayList20, or0Var, l2Var, 23));
                        o2Var.E = l2Var;
                        o2Var.f45431y = true;
                        o2Var.f45430x = false;
                        return;
                    }
                    for (int i46 = 0; i46 < list.size(); i46++) {
                        rg.n2 n2Var5 = (rg.n2) list.get(i46);
                        rg.l2 l2Var2 = new rg.l2(o2Var);
                        l2Var2.h.set(n2Var5.f45361b, n2Var5.f45362c, i14 + n2Var5.d, i15 + n2Var5.f45363e);
                        l2Var2.f45310i.set(l2Var2.h);
                        matrix.mapRect(l2Var2.f45310i);
                        l2Var2.f45306c = i45;
                        Bitmap d10 = o2Var.d(n2Var5.f45360a, n2Var5.f45361b, n2Var5.f45362c, false);
                        l2Var2.d = d10;
                        if (d10 != null) {
                            l2Var2.f45308f = l2Var2.c();
                            rg.o2.c(l2Var2, o2Var.T, o2Var.U);
                            o2Var.O = l2Var2.f45311j;
                            o2Var.P = l2Var2.f45312k;
                            arrayList20.add(l2Var2);
                        }
                    }
                    o2Var.E = null;
                    o2Var.f45431y = true;
                    o2Var.f45430x = false;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(17, o2Var, arrayList20));
                    return;
                }
                return;
        }
    }

    public l3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f9834a = i11;
        this.f9836c = obj;
        this.f9835b = i10;
        this.d = obj2;
        this.f9837e = obj3;
        this.f9838f = obj4;
    }

    public l3(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.f9834a = i11;
        this.f9836c = obj;
        this.d = obj2;
        this.f9835b = i10;
        this.f9837e = obj3;
        this.f9838f = obj4;
    }

    public l3(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f9834a = i11;
        this.f9836c = obj;
        this.d = obj2;
        this.f9837e = obj3;
        this.f9835b = i10;
        this.f9838f = obj4;
    }

    public l3(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f9834a = i11;
        this.f9836c = obj;
        this.d = obj2;
        this.f9837e = obj3;
        this.f9838f = obj4;
        this.f9835b = i10;
    }

    public l3(int[] iArr, int i10, i9 i9Var, TLRPC.User user, x9 x9Var) {
        this.f9834a = 27;
        this.f9836c = iArr;
        this.f9835b = i10;
        this.f9837e = i9Var;
        this.f9838f = user;
        this.d = x9Var;
    }
}
