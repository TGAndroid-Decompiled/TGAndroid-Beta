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
import org.telegram.messenger.qk;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.ym;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.bh0;
import org.telegram.ui.cg0;
import org.telegram.ui.dy;
import org.telegram.ui.ea0;
import org.telegram.ui.en;
import org.telegram.ui.g60;
import org.telegram.ui.jn;
import org.telegram.ui.jr0;
import org.telegram.ui.ty;
import org.telegram.ui.vm;
import org.telegram.ui.xn;
import org.telegram.ui.zi;
import org.telegram.ui.zr0;
public final class l3 implements Runnable {
    public final int f8459a;
    public final int f8460b;
    public final Object f8461c;
    public final Object d;
    public final Object e;
    public final Object f8462f;

    public l3(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f8459a = 20;
        this.f8460b = i10;
        this.f8461c = chat;
        this.d = arrayList;
        this.e = arrayList2;
        this.f8462f = arrayList3;
    }

    @Override
    public final void run() {
        boolean z10;
        char c10;
        final long j3;
        long j10;
        org.telegram.ui.j4 j4Var;
        int i10;
        Object obj;
        String lowerCase;
        org.telegram.ui.ActionBar.o2 R;
        boolean z11;
        xc a02;
        int i11;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        int i12;
        int i13;
        long j11 = 0;
        int i14 = 0;
        switch (this.f8459a) {
            case 0:
                long[] jArr = (long[]) this.f8461c;
                int i15 = this.f8460b;
                w9 w9Var = (w9) this.d;
                w9 w9Var2 = (w9) this.e;
                TextView textView = (TextView) this.f8462f;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i15).getUser(Long.valueOf(jArr[0]));
                    h9 h9Var = new h9((e6) null);
                    h9Var.r(user);
                    w9Var.e(user, h9Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-jArr[0]));
                    h9 h9Var2 = new h9((e6) null);
                    h9Var2.q(chat);
                    w9Var.e(chat, h9Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i15).getUser(Long.valueOf(jArr[0]));
                    if (w9Var2 != null) {
                        h9 h9Var3 = new h9((e6) null);
                        h9Var3.r(user2);
                        w9Var2.e(user2, h9Var3);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user2));
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat2 = MessagesController.getInstance(i15).getChat(Long.valueOf(-jArr[0]));
                if (w9Var2 != null) {
                    h9 h9Var4 = new h9((e6) null);
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
                int i16 = this.f8460b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f8462f;
                if (!(((TLObject) this.f8461c) instanceof TLRPC.TL_boolTrue)) {
                    if (zArr[0]) {
                        return;
                    }
                    zArr[0] = true;
                    callback.run("SERVER_ERROR");
                    return;
                }
                TLRPC.User currentUser = UserConfig.getInstance(i16).getCurrentUser();
                if (currentUser != null) {
                    currentUser.emoji_status = updateemojistatus.emoji_status;
                    z10 = true;
                    c10 = 0;
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
                    MessagesController.getInstance(i16).updateEmojiStatusUntilUpdate(currentUser.f18476id, currentUser.emoji_status);
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
                final gg.i0 i0Var = (gg.i0) this.f8461c;
                int i17 = this.f8460b;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) this.f8462f;
                gg.z zVar = i0Var.f9760j0;
                ArrayList arrayList6 = i0Var.f9774v0;
                int i18 = i0Var.f9771s0;
                i0Var.D0--;
                if (i17 != i0Var.f9753d0) {
                    return;
                }
                i0Var.f9756f0 = i17;
                if (i0Var.f9754e0 != i17) {
                    zVar.b();
                }
                if (i0Var.f9757g0 != i17) {
                    i0Var.I.clear();
                }
                i0Var.N = true;
                int i19 = 0;
                while (i19 < arrayList3.size()) {
                    if (!i0Var.F(arrayList3.get(i19))) {
                        arrayList3.remove(i19);
                        i19--;
                    }
                    i19++;
                }
                boolean z12 = true;
                int size = arrayList6.size();
                int i20 = 0;
                while (i20 < arrayList3.size()) {
                    final Object obj2 = arrayList3.get(i20);
                    if (obj2 instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) obj2;
                        MessagesController.getInstance(i18).putUser(user3, z12);
                        j3 = user3.f18476id;
                    } else if (obj2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj2;
                        MessagesController.getInstance(i18).putChat(chat3, z12);
                        j3 = -chat3.f18329id;
                    } else {
                        if (obj2 instanceof TLRPC.EncryptedChat) {
                            MessagesController.getInstance(i18).putEncryptedChat((TLRPC.EncryptedChat) obj2, z12);
                        }
                        j3 = j11;
                    }
                    if (j3 == j11 || ((TLRPC.Dialog) MessagesController.getInstance(i18).dialogs_dict.f(j3)) != null) {
                        j10 = j11;
                    } else {
                        j10 = j11;
                        MessagesStorage.getInstance(i18).getDialogFolderId(j3, new MessagesStorage.IntCallback() {
                            @Override
                            public final void run(int i21) {
                                int i22 = i0.this.f9771s0;
                                if (i21 != -1) {
                                    TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                    long j12 = j3;
                                    tL_dialog.f18333id = j12;
                                    if (i21 != 0) {
                                        tL_dialog.folder_id = i21;
                                    }
                                    Object obj3 = obj2;
                                    if (obj3 instanceof TLRPC.Chat) {
                                        tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj3) ? 1 : 0;
                                    }
                                    MessagesController.getInstance(i22).dialogs_dict.k(tL_dialog, j12);
                                    MessagesController.getInstance(i22).getAllDialogs().add(tL_dialog);
                                    MessagesController.getInstance(i22).sortDialogs(null);
                                }
                            }
                        });
                    }
                    if (i0Var.S() && !(obj2 instanceof TLRPC.EncryptedChat)) {
                        dy dyVar = i0Var.U;
                        boolean z13 = dyVar != null && dyVar.a() == j3;
                        int i21 = 0;
                        while (!z13 && i21 < size) {
                            gg.h0 h0Var = (gg.h0) arrayList6.get(i21);
                            int i22 = i21;
                            z13 = (h0Var == null || h0Var.f9743c != j3) ? z13 : true;
                            i21 = i22 + 1;
                        }
                        if (z13) {
                            arrayList3.remove(i20);
                            arrayList4.remove(i20);
                            i20--;
                        }
                    }
                    i20++;
                    j11 = j10;
                    z12 = true;
                }
                MessagesController.getInstance(i18).putUsers(arrayList5, true);
                i0Var.f9770s = arrayList3;
                i0Var.G = arrayList4;
                zVar.f(arrayList3, arrayList6);
                i0Var.l();
                dy dyVar2 = i0Var.U;
                if (dyVar2 != null) {
                    dyVar2.d(i0Var.D0 > 0, true);
                    i0Var.U.c();
                    return;
                }
                return;
            case 3:
                gg.u1 u1Var = (gg.u1) this.f8461c;
                int i23 = this.f8460b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                ArrayList arrayList9 = (ArrayList) this.f8462f;
                if (i23 == u1Var.E) {
                    u1Var.d = arrayList7;
                    u1Var.e = arrayList8;
                    u1Var.H = arrayList9;
                    u1Var.f9935f.f(arrayList7, null);
                    u1Var.f9941y = false;
                    u1Var.l();
                    u1Var.F();
                    return;
                }
                return;
            case 4:
                Pair pair = (Pair) this.d;
                ((i2.d1) this.f8461c).f10629b.h.h(((Integer) pair.first).intValue(), (u2.f0) pair.second, (u2.t) this.e, (u2.b0) this.f8462f, this.f8460b);
                return;
            case 5:
                m4.k0 k0Var = (m4.k0) this.f8461c;
                m4.g1 g1Var = (m4.g1) this.d;
                int i24 = this.f8460b;
                n4.a0 a0Var = (n4.a0) this.e;
                m4.j0 j0Var = (m4.j0) this.f8462f;
                pi.f fVar = k0Var.f14878f;
                if (k0Var.f14879g.j()) {
                    return;
                }
                if (!((n4.r) k0Var.f14882k.f15257b).f15238a.isActive()) {
                    StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                    sb2.append(g1Var == null ? Integer.valueOf(i24) : g1Var.f14845b);
                    sb2.append(", pid=");
                    sb2.append(a0Var.f15192a.f15194b);
                    e2.a.n("MediaSessionLegacyStub", sb2.toString());
                    return;
                }
                m4.r L = k0Var.L(a0Var);
                if (g1Var != null) {
                    if (!fVar.D(L, g1Var)) {
                        return;
                    }
                } else if (!fVar.C(L, i24)) {
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
                LocationController.lambda$fetchLocationAddress$29((Locale) this.f8461c, (Location) this.d, this.f8460b, (Locale) this.e, (LocationController.LocationFetchCallback) this.f8462f);
                return;
            case 7:
                ((MediaDataController) this.f8461c).lambda$removeMultipleStickerSets$110((boolean[]) this.d, (ArrayList) this.e, this.f8460b, (int[]) this.f8462f);
                return;
            case 8:
                ((MessagesController) this.f8461c).lambda$processUpdateArray$403((yf.r) this.d, (ConcurrentHashMap) this.e, (ConcurrentHashMap) this.f8462f, this.f8460b);
                return;
            case 9:
                ((MessagesStorage) this.f8461c).lambda$getSentFile$164((String) this.d, this.f8460b, (Object[]) this.e, (CountDownLatch) this.f8462f);
                return;
            case 10:
                ((MessagesStorage) this.f8461c).lambda$putSentFile$170((String) this.d, (TLObject) this.e, this.f8460b, (String) this.f8462f);
                return;
            case 11:
                ((NotificationCenter) this.f8461c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.e, (xg) this.f8462f, this.f8460b);
                return;
            case 12:
                ((TelegramMediaSession) this.f8461c).lambda$loadChats$4(this.f8460b, (ArrayList) this.d, (a0.i) this.e, (a0.i) this.f8462f);
                return;
            case 13:
                ((VoIPService) this.f8461c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.f8460b, (String) this.e, (TLRPC.TL_error) this.f8462f);
                return;
            case 14:
                org.telegram.ui.j4 j4Var2 = (org.telegram.ui.j4) this.f8461c;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                String str = (String) this.f8462f;
                int i25 = this.f8460b;
                ArrayList arrayList11 = new ArrayList();
                int size2 = arrayList10.size();
                int i26 = 0;
                while (i26 < size2) {
                    Object obj3 = arrayList10.get(i26);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj3);
                    if (obj3 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj3;
                        int i27 = i26;
                        j4Var = j4Var2;
                        i10 = i27;
                        obj = obj3;
                        CharSequence C = org.telegram.ui.j4.C(j4Var, j4Var2.f34627u0[i14].f35796c.E, null, richText, richText, pageBlock, 1000);
                        if (!TextUtils.isEmpty(C)) {
                            lowerCase = C.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        int i28 = i26;
                        j4Var = j4Var2;
                        i10 = i28;
                        obj = obj3;
                        if (obj instanceof String) {
                            lowerCase = ((String) obj).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i29 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str, i29);
                            if (indexOf >= 0) {
                                int length = str.length() + indexOf;
                                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                                    ?? obj4 = new Object();
                                    obj4.f37285a = indexOf;
                                    obj4.f37287c = pageBlock;
                                    obj4.f37286b = obj;
                                    arrayList11.add(obj4);
                                }
                                i29 = length;
                            }
                        }
                    }
                    org.telegram.ui.j4 j4Var3 = j4Var;
                    i26 = i10 + 1;
                    j4Var2 = j4Var3;
                    i14 = 0;
                }
                AndroidUtilities.runOnUIThread(new c9(j4Var2, i25, arrayList11, str, 10));
                return;
            case 15:
                TLObject tLObject = (TLObject) this.f8461c;
                int i30 = this.f8460b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f8462f;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(i30).putUsers(updates.users, false);
                    MessagesController.getInstance(i30).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size3 = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i14 < size3) {
                        Object obj5 = findUpdatesAndRemove.get(i14);
                        i14++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj5).call;
                    }
                    if (LaunchActivity.G1 == null || groupCall == null) {
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    tL_inputGroupCall.f18346id = groupCall.f18339id;
                    tL_inputGroupCall.access_hash = groupCall.access_hash;
                    org.telegram.ui.Components.voip.g2.g(LaunchActivity.G1, i30, tL_inputGroupCall, false, groupCall, hashSet);
                    return;
                } else if (!(tLObject instanceof TL_phone.groupCall)) {
                    if (tL_error != null) {
                        xc.a0(o2Var).d0(tL_error, false);
                        return;
                    }
                    return;
                } else {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    MessagesController.getInstance(i30).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i30).putChats(groupcall.chats, false);
                    if (LaunchActivity.G1 == null) {
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f18346id = groupCall2.f18339id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    org.telegram.ui.Components.voip.g2.g(LaunchActivity.G1, i30, tL_inputGroupCall2, false, groupCall2, hashSet);
                    return;
                }
            case 16:
                xn.t1((xn) this.f8461c, this.f8460b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f8462f);
                return;
            case 17:
                jn jnVar = (jn) this.f8461c;
                zi ziVar = (zi) this.d;
                ziVar.f15472b = jnVar.f34766a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.e).f18329id, this.f8460b, new en(jnVar, ziVar, (xn) this.f8462f));
                return;
            case 18:
                jn jnVar2 = (jn) this.f8461c;
                int i31 = this.f8460b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f8462f;
                xn xnVar = jnVar2.f34766a;
                xnVar.Xa(i31, messageObject.getId(), true, messageObject.getDialogId() == xnVar.L6 ? 1 : 0, true, 0, num, bArr, new vm(jnVar2, messageObject, 1));
                return;
            case 19:
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.f8461c;
                int[] iArr = (int[]) this.d;
                int i32 = this.f8460b;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f8462f;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var == null) {
                    return;
                }
                c2Var.setOnCancelListener(new org.telegram.ui.Components.z1(iArr, runnable, i32));
                o2Var2.showDialog(c2VarArr[0]);
                return;
            case 20:
                int i33 = this.f8460b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.f8461c;
                ArrayList arrayList12 = (ArrayList) this.d;
                ArrayList arrayList13 = (ArrayList) this.e;
                ArrayList arrayList14 = (ArrayList) this.f8462f;
                if (!LaunchActivity.C1 || (R = LaunchActivity.R()) == null || R.getParentActivity() == null) {
                    return;
                }
                rg.j0 j0Var2 = new rg.j0(11, i33, R.getParentActivity(), R, null);
                j0Var2.I1(chat4, arrayList12, arrayList13, arrayList14, null);
                j0Var2.show();
                return;
            case 21:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.e;
                int i34 = this.f8460b;
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) this.f8462f;
                SharedPreferences.Editor edit = ((SharedPreferences) this.f8461c).edit();
                edit.putLong("support_id2", tL_help_support.user.f18476id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    c2Var2.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                ArrayList arrayList15 = new ArrayList();
                arrayList15.add(tL_help_support.user);
                MessagesStorage.getInstance(i34).putUsersAndChats(arrayList15, null, true, true);
                MessagesController.getInstance(i34).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.f18476id);
                o2Var3.presentFragment(new xn(bundle));
                return;
            case 22:
                hs.P((hs) this.f8461c, (TLObject) this.d, (TLRPC.InputPeer) this.e, this.f8460b, (int[]) this.f8462f);
                return;
            case 23:
                kw0 kw0Var = (kw0) this.f8461c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i35 = this.f8460b;
                MessageObject messageObject2 = (MessageObject) this.e;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.f8462f;
                int[] iArr2 = kw0Var.e;
                RLottieNative[] rLottieNativeArr = kw0Var.f25871f1;
                if (kw0Var.W0) {
                    AndroidUtilities.runOnUIThread(new iw0(kw0Var, 2));
                    return;
                }
                boolean z14 = false;
                int i36 = 0;
                while (i36 < rLottieNativeArr.length) {
                    if (rLottieNativeArr[i36] == null) {
                        int i37 = i36 == 0 ? 1 : i36 == 1 ? 8 : i36 == 2 ? 14 : i36 == 3 ? 20 : 2;
                        if (i37 < tL_messages_stickerSet.documents.size()) {
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i37);
                            String readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(readRes)) {
                                AndroidUtilities.runOnUIThread(new jw0(document, i35, messageObject2, u1Var2, tL_messages_stickerSet, 1));
                                z14 = true;
                            } else {
                                rLottieNativeArr[i36] = RLottieNative.b(readRes, iArr2, null, null);
                                kw0Var.f25872g1[i36] = iArr2[0];
                            }
                        }
                    }
                    i36++;
                }
                if (z14) {
                    AndroidUtilities.runOnUIThread(new iw0(kw0Var, 3));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new ym(kw0Var, i35, u1Var2, 17));
                    return;
                }
            case 24:
                LaunchActivity launchActivity = (LaunchActivity) this.f8461c;
                TLObject tLObject2 = (TLObject) this.d;
                Uri uri = (Uri) this.e;
                int i38 = this.f8460b;
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) this.f8462f;
                Pattern pattern = LaunchActivity.B1;
                if (launchActivity.isFinishing()) {
                    return;
                }
                if (tLObject2 != null && launchActivity.f31132q0 != null) {
                    TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject2;
                    Bundle i39 = a4.a.i("onlySelect", true);
                    i39.putString("importTitle", tL_messages_historyImportParsed.title);
                    i39.putBoolean("allowSwitchAccount", true);
                    if (tL_messages_historyImportParsed.pm) {
                        i39.putInt("dialogsType", 12);
                    } else if (tL_messages_historyImportParsed.group) {
                        i39.putInt("dialogsType", 11);
                    } else {
                        String uri2 = uri.toString();
                        Iterator<String> it = MessagesController.getInstance(i38).exportPrivateUri.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z11 = false;
                            } else if (uri2.contains(it.next())) {
                                i39.putInt("dialogsType", 12);
                                z11 = true;
                            }
                        }
                        if (!z11) {
                            Iterator<String> it2 = MessagesController.getInstance(i38).exportGroupUri.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (uri2.contains(it2.next())) {
                                        i39.putInt("dialogsType", 11);
                                        z11 = true;
                                    }
                                }
                            }
                            if (!z11) {
                                i39.putInt("dialogsType", 13);
                            }
                        }
                    }
                    if (SecretMediaViewer.g() && SecretMediaViewer.f().f31764s) {
                        SecretMediaViewer.f().e(false, false);
                    } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                        PhotoViewer.t1().G0(false, true);
                    } else if (org.telegram.ui.j4.I() && org.telegram.ui.j4.x().V) {
                        org.telegram.ui.j4.x().o(false, true);
                    }
                    kc.x();
                    g60 g60Var = g60.D3;
                    if (g60Var != null) {
                        g60Var.dismiss();
                    }
                    if (AndroidUtilities.isTablet()) {
                        launchActivity.f31132q0.U(true, true);
                        launchActivity.f31136s0.U(true, true);
                    }
                    ty tyVar = new ty(i39);
                    tyVar.C2 = launchActivity;
                    ((ActionBarLayout) launchActivity.O()).S(tyVar, !AndroidUtilities.isTablet() ? launchActivity.f31132q0.getFragmentStack().size() <= 1 || !(launchActivity.f31132q0.getFragmentStack().get(launchActivity.f31132q0.getFragmentStack().size() - 1) instanceof bh0) : launchActivity.f31134r0.getFragmentStack().isEmpty() || !(launchActivity.f31134r0.getFragmentStack().get(launchActivity.f31134r0.getFragmentStack().size() + (-1)) instanceof bh0), false);
                } else {
                    if (launchActivity.W == null) {
                        launchActivity.W = new ArrayList();
                    }
                    launchActivity.W.add(0, launchActivity.X);
                    launchActivity.X = null;
                    launchActivity.i0(true);
                }
                try {
                    c2Var3.dismiss();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 25:
                TLObject tLObject3 = (TLObject) this.d;
                int i40 = this.f8460b;
                String str2 = (String) this.e;
                ea0 ea0Var = (ea0) this.f8462f;
                org.telegram.ui.ActionBar.o2 o2Var4 = (org.telegram.ui.ActionBar.o2) hg.k0.g(1, ((LaunchActivity) this.f8461c).f31108d0);
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
                        MessagesController.getInstance(i40).putChats(arrayList2, false);
                        MessagesController.getInstance(i40).putUsers(arrayList, false);
                        if (z15 && ((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                            a02 = xc.a0(o2Var4);
                            i11 = R.string.NoFolderFound;
                        } else {
                            ?? bbVar = new bb(o2Var4, false);
                            bbVar.Y = -1;
                            bbVar.f23816c0 = "";
                            bbVar.f23817d0 = new ArrayList();
                            bbVar.f23819f0 = "";
                            bbVar.f23821h0 = new ArrayList();
                            ArrayList arrayList16 = new ArrayList();
                            bbVar.f23822i0 = arrayList16;
                            bbVar.f23838z0 = -1;
                            bbVar.C0 = -5;
                            bbVar.X = str2;
                            bbVar.Z = chatlist_chatlistinvite;
                            arrayList16.clear();
                            if (z15) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                bbVar.f23816c0 = tL_textWithEntities.text;
                                bbVar.f23817d0 = tL_textWithEntities.entities;
                                bbVar.f23818e0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                bbVar.f23820g0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                bbVar.f23820g0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                bbVar.f23823j0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                bbVar.Y = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList17 = o2Var4.getMessagesController().dialogFilters;
                                if (arrayList17 != null) {
                                    while (true) {
                                        if (i14 < arrayList17.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList17.get(i14);
                                            if (dialogFilter.f15826id == bbVar.Y) {
                                                bbVar.f23816c0 = dialogFilter.name;
                                                bbVar.f23817d0 = dialogFilter.entities;
                                                bbVar.f23818e0 = dialogFilter.title_noanimate;
                                            } else {
                                                i14++;
                                            }
                                        }
                                    }
                                }
                            }
                            bbVar.S();
                            o2Var4.showDialog(bbVar);
                            ea0Var.run();
                            return;
                        }
                    } else {
                        a02 = xc.a0(o2Var4);
                        i11 = R.string.NoFolderFound;
                    }
                    ea0Var.run();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                qk.p(i11, a02, null);
                break;
            case 26:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f8461c;
                ea0 ea0Var2 = (ea0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f8462f;
                int i41 = this.f8460b;
                ArrayList arrayList18 = launchActivity2.f31108d0;
                if (launchActivity2.isFinishing()) {
                    return;
                }
                try {
                    ea0Var2.run();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (tL_error2 == null) {
                    if (launchActivity2.f31132q0 == null || updates2 == null || updates2.chats.isEmpty()) {
                        return;
                    }
                    TLRPC.Chat chat5 = updates2.chats.get(0);
                    chat5.left = false;
                    chat5.kicked = false;
                    MessagesController.getInstance(i41).putUsers(updates2.users, false);
                    MessagesController.getInstance(i41).putChats(updates2.chats, false);
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("chat_id", chat5.f18329id);
                    if (arrayList18.isEmpty() || MessagesController.getInstance(i41).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.o2) hg.k0.g(1, arrayList18))) {
                        xn xnVar2 = new xn(bundle2);
                        NotificationCenter.getInstance(i41).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                        ((ActionBarLayout) launchActivity2.O()).S(xnVar2, false, true);
                        return;
                    }
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity2);
                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.AppName);
                if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                    alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.FloodWait);
                } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                    alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.JoinToGroupErrorFull);
                } else {
                    alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                launchActivity2.B0(alertDialog$Builder);
                return;
            case 27:
                cg0 cg0Var = (cg0) this.f8461c;
                String str3 = (String) this.d;
                String str4 = (String) this.e;
                String str5 = (String) this.f8462f;
                int i42 = this.f8460b;
                ArrayList arrayList19 = new ArrayList();
                ?? obj6 = new Object();
                obj6.f3836b = "inapp";
                obj6.f3835a = str3;
                arrayList19.add(obj6.a());
                FileLog.d("LoginBilling querying \"" + str3 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList19, new org.telegram.ui.Components.e2(cg0Var, str3, str4, str5, i42));
                return;
            case 28:
                int i43 = this.f8460b;
                h9 h9Var5 = (h9) this.e;
                TLRPC.User user4 = (TLRPC.User) this.f8462f;
                ((int[]) this.f8461c)[0] = i43;
                h9Var5.r(user4);
                ((w9) this.d).e(user4, h9Var5);
                return;
            default:
                qg.n2 n2Var = (qg.n2) this.f8461c;
                int i44 = this.f8460b;
                List list = (List) this.d;
                ArrayList arrayList20 = (ArrayList) this.e;
                jr0 jr0Var = (jr0) this.f8462f;
                if (n2Var.I == null || n2Var.f41872y) {
                    return;
                }
                Matrix matrix = new Matrix();
                matrix.postScale(1.0f / n2Var.I.getWidth(), 1.0f / n2Var.I.getHeight());
                matrix.postTranslate(-0.5f, -0.5f);
                matrix.postRotate(i44);
                matrix.postTranslate(0.5f, 0.5f);
                if ((i44 / 90) % 2 != 0) {
                    matrix.postScale(n2Var.I.getHeight(), n2Var.I.getWidth());
                } else {
                    matrix.postScale(n2Var.I.getWidth(), n2Var.I.getHeight());
                }
                if (list.isEmpty()) {
                    qg.k2 k2Var = new qg.k2(n2Var);
                    k2Var.h.set(0.0f, 0.0f, n2Var.I.getWidth(), n2Var.I.getHeight());
                    k2Var.f41752i.set(k2Var.h);
                    matrix.mapRect(k2Var.f41752i);
                    k2Var.f41749c = i44;
                    Bitmap d = n2Var.d(n2Var.I, 0, 0, false);
                    k2Var.d = d;
                    if (d == null) {
                        FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                        return;
                    }
                    k2Var.f41750f = k2Var.c();
                    qg.n2.c(k2Var, n2Var.T, n2Var.U);
                    n2Var.O = k2Var.f41753j;
                    n2Var.P = k2Var.f41754k;
                    arrayList20.add(k2Var);
                    AndroidUtilities.runOnUIThread(new zr0(n2Var, arrayList20, jr0Var, k2Var, 24));
                    n2Var.E = k2Var;
                    n2Var.f41872y = true;
                    n2Var.f41871x = false;
                    return;
                }
                for (int i45 = 0; i45 < list.size(); i45++) {
                    qg.m2 m2Var = (qg.m2) list.get(i45);
                    qg.k2 k2Var2 = new qg.k2(n2Var);
                    k2Var2.h.set(m2Var.f41834b, m2Var.f41835c, i12 + m2Var.d, i13 + m2Var.e);
                    k2Var2.f41752i.set(k2Var2.h);
                    matrix.mapRect(k2Var2.f41752i);
                    k2Var2.f41749c = i44;
                    Bitmap d10 = n2Var.d(m2Var.f41833a, m2Var.f41834b, m2Var.f41835c, false);
                    k2Var2.d = d10;
                    if (d10 != null) {
                        k2Var2.f41750f = k2Var2.c();
                        qg.n2.c(k2Var2, n2Var.T, n2Var.U);
                        n2Var.O = k2Var2.f41753j;
                        n2Var.P = k2Var2.f41754k;
                        arrayList20.add(k2Var2);
                    }
                }
                n2Var.E = null;
                n2Var.f41872y = true;
                n2Var.f41871x = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g2(10, n2Var, arrayList20));
                return;
        }
    }

    public l3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f8459a = i11;
        this.f8461c = obj;
        this.f8460b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f8462f = obj4;
    }

    public l3(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.f8459a = i11;
        this.f8461c = obj;
        this.d = obj2;
        this.f8460b = i10;
        this.e = obj3;
        this.f8462f = obj4;
    }

    public l3(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f8459a = i11;
        this.f8461c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f8460b = i10;
        this.f8462f = obj4;
    }

    public l3(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f8459a = i11;
        this.f8461c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f8462f = obj4;
        this.f8460b = i10;
    }

    public l3(int[] iArr, int i10, h9 h9Var, TLRPC.User user, w9 w9Var) {
        this.f8459a = 28;
        this.f8461c = iArr;
        this.f8460b = i10;
        this.e = h9Var;
        this.f8462f = user;
        this.d = w9Var;
    }
}
