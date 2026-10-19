package ai;

import android.content.ContextWrapper;
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
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
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
import org.telegram.messenger.lk;
import org.telegram.messenger.sg;
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
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.cn;
import org.telegram.ui.cy;
import org.telegram.ui.ib0;
import org.telegram.ui.lf0;
import org.telegram.ui.mg0;
import org.telegram.ui.nx;
import org.telegram.ui.om;
import org.telegram.ui.q50;
import org.telegram.ui.qn;
import org.telegram.ui.ri;
import org.telegram.ui.xm;
import org.telegram.ui.z70;
public final class ub implements Runnable {
    public final int f2270a;
    public final int f2271b;
    public final Object f2272c;
    public final Object d;
    public final Object e;
    public final Object f2273f;

    public ub(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f2270a = 21;
        this.f2271b = i10;
        this.f2272c = chat;
        this.d = arrayList;
        this.e = arrayList2;
        this.f2273f = arrayList3;
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
        org.telegram.ui.l4 l4Var;
        TL_iv.PageBlock pageBlock;
        String lowerCase;
        int i12;
        org.telegram.ui.ActionBar.n2 R;
        int i13;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        org.telegram.ui.Cells.u1 u1Var;
        boolean z13;
        org.telegram.ui.Components.xc a02;
        int i14;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        int i15 = this.f2270a;
        String str = "";
        TLRPC.GroupCall groupCall = null;
        boolean z14 = true;
        int i16 = 0;
        int i17 = this.f2271b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f2273f;
        Object obj5 = this.f2272c;
        switch (i15) {
            case 0:
                TLObject tLObject = (TLObject) obj2;
                String str2 = (String) obj4;
                ((ei.d) obj5).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) obj3)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                ga.y(i17, false).S();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.Components.xc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str2)), null).k(false);
                    return;
                }
                return;
            case 1:
                long[] jArr = (long[]) obj5;
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) obj3;
                org.telegram.ui.Components.w9 w9Var2 = (org.telegram.ui.Components.w9) obj2;
                TextView textView = (TextView) obj4;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i17).getUser(Long.valueOf(jArr[0]));
                    org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                    h9Var.r(user);
                    w9Var.e(user, h9Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i17).getChat(Long.valueOf(-jArr[0]));
                    org.telegram.ui.Components.h9 h9Var2 = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                    h9Var2.q(chat);
                    w9Var.e(chat, h9Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i17).getUser(Long.valueOf(jArr[0]));
                    if (w9Var2 != null) {
                        org.telegram.ui.Components.h9 h9Var3 = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
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
                    org.telegram.ui.Components.h9 h9Var4 = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
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
            case 2:
                boolean[] zArr = (boolean[]) obj5;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) obj4;
                if (!(((TLObject) obj2) instanceof TLRPC.TL_boolTrue)) {
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
                    MessagesController.getInstance(i17).updateEmojiStatusUntilUpdate(currentUser.f20422id, currentUser.emoji_status);
                } else {
                    z10 = true;
                }
                if (!zArr[0]) {
                    zArr[0] = z10;
                    callback.run(null);
                    return;
                }
                return;
            case 3:
                final hg.h0 h0Var = (hg.h0) obj5;
                ArrayList arrayList3 = (ArrayList) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) obj4;
                hg.y yVar = h0Var.f11885j0;
                ArrayList arrayList6 = h0Var.f11899v0;
                int i18 = h0Var.f11896s0;
                h0Var.D0--;
                if (i17 == h0Var.f11878d0) {
                    h0Var.f11881f0 = i17;
                    if (h0Var.f11879e0 != i17) {
                        yVar.b();
                    }
                    if (h0Var.f11882g0 != i17) {
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
                            j11 = user3.f20422id;
                        } else {
                            j10 = 0;
                            if (obj6 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
                                MessagesController.getInstance(i18).putChat(chat3, z14);
                                j11 = -chat3.f20275id;
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
                                    int i22 = h0.this.f11896s0;
                                    if (i21 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j12 = j11;
                                        tL_dialog.f20279id = j12;
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
                            nx nxVar = h0Var.U;
                            if (nxVar != null && nxVar.a() == j11) {
                                i11 = z14;
                            } else {
                                i11 = i10;
                            }
                            int i21 = i10;
                            while (!i11 && i21 < size) {
                                hg.g0 g0Var = (hg.g0) arrayList6.get(i21);
                                boolean z15 = z14;
                                boolean z16 = i11;
                                if (g0Var != null && g0Var.f11870c == j11) {
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
                    h0Var.f11895s = arrayList3;
                    h0Var.G = arrayList4;
                    yVar.f(arrayList3, arrayList6);
                    h0Var.l();
                    nx nxVar2 = h0Var.U;
                    if (nxVar2 != null) {
                        if (h0Var.D0 > 0) {
                            z11 = z17;
                        } else {
                            z11 = i22;
                        }
                        nxVar2.d(z11, z17);
                        h0Var.U.c();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                hg.t1 t1Var = (hg.t1) obj5;
                ArrayList arrayList7 = (ArrayList) obj3;
                ArrayList arrayList8 = (ArrayList) obj2;
                ArrayList arrayList9 = (ArrayList) obj4;
                if (i17 == t1Var.E) {
                    t1Var.d = arrayList7;
                    t1Var.e = arrayList8;
                    t1Var.H = arrayList9;
                    t1Var.f12058f.f(arrayList7, null);
                    t1Var.f12064y = false;
                    t1Var.l();
                    t1Var.F();
                    return;
                }
                return;
            case 5:
                Pair pair = (Pair) obj3;
                ((i2.f1) obj5).f12355b.h.i(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) obj2, (u2.c0) obj4, this.f2271b);
                return;
            case 6:
                m4.p0 p0Var = (m4.p0) obj5;
                m4.o1 o1Var = (m4.o1) obj3;
                n4.t tVar = (n4.t) obj2;
                m4.o0 o0Var = (m4.o0) obj4;
                qi.e eVar = p0Var.f16662f;
                if (!p0Var.f16663g.j()) {
                    if (!((n4.n) p0Var.f16668m.f17127b).f17110a.isActive()) {
                        StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                        if (o1Var == null) {
                            obj = Integer.valueOf(i17);
                        } else {
                            obj = o1Var.f16659b;
                        }
                        sb2.append(obj);
                        sb2.append(", pid=");
                        sb2.append(tVar.f17129a.f17131b);
                        e2.a.l("MediaSessionLegacyStub", sb2.toString());
                        return;
                    }
                    m4.v L = p0Var.L(tVar);
                    if (o1Var != null) {
                        if (!eVar.z(L, o1Var)) {
                            return;
                        }
                    } else if (!eVar.y(L, i17)) {
                        return;
                    }
                    try {
                        o0Var.f(L);
                        return;
                    } catch (RemoteException e) {
                        e2.a.m("MediaSessionLegacyStub", "Exception in " + L, e);
                        return;
                    }
                }
                return;
            case 7:
                LocationController.lambda$fetchLocationAddress$29((Locale) obj5, (Location) obj3, i17, (Locale) obj2, (LocationController.LocationFetchCallback) obj4);
                return;
            case 8:
                ((MediaDataController) obj5).lambda$removeMultipleStickerSets$110((boolean[]) obj3, (ArrayList) obj2, i17, (int[]) obj4);
                return;
            case 9:
                ((MessagesController) obj5).lambda$processUpdateArray$406((zf.r) obj3, (ConcurrentHashMap) obj2, (ConcurrentHashMap) obj4, i17);
                return;
            case 10:
                ((MessagesStorage) obj5).lambda$getSentFile$164((String) obj4, i17, (Object[]) obj3, (CountDownLatch) obj2);
                return;
            case 11:
                ((MessagesStorage) obj5).lambda$putSentFile$170((String) obj4, (TLObject) obj2, i17, (String) obj3);
                return;
            case 12:
                ((NotificationCenter) obj5).lambda$listen$5((View) obj3, (View.OnAttachStateChangeListener) obj2, (sg) obj4, i17);
                return;
            case 13:
                ((TelegramMediaSession) obj5).lambda$loadChats$4(i17, (ArrayList) obj3, (a0.h) obj2, (a0.h) obj4);
                return;
            case 14:
                ((VoIPService) obj5).lambda$startConferenceGroupCall$33((TLObject) obj2, i17, (String) obj4, (TLRPC.TL_error) obj3);
                return;
            case 15:
                org.telegram.ui.l4 l4Var2 = (org.telegram.ui.l4) obj5;
                ArrayList arrayList10 = (ArrayList) obj3;
                HashMap hashMap = (HashMap) obj2;
                String str3 = (String) obj4;
                ArrayList arrayList11 = new ArrayList();
                int size2 = arrayList10.size();
                int i23 = 0;
                while (i23 < size2) {
                    Object obj7 = arrayList10.get(i23);
                    TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) hashMap.get(obj7);
                    if (obj7 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj7;
                        l4Var = l4Var2;
                        CharSequence C = org.telegram.ui.l4.C(l4Var, l4Var2.f38774u0[0].f39749c.E, null, richText, richText, pageBlock2, 1000);
                        pageBlock = pageBlock2;
                        if (!TextUtils.isEmpty(C)) {
                            lowerCase = C.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        l4Var = l4Var2;
                        pageBlock = pageBlock2;
                        if (obj7 instanceof String) {
                            lowerCase = ((String) obj7).toLowerCase();
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
                                    ?? obj8 = new Object();
                                    obj8.f41580a = indexOf;
                                    obj8.f41582c = pageBlock;
                                    obj8.f41581b = obj7;
                                    arrayList11.add(obj8);
                                }
                                i24 = length;
                            }
                        }
                    }
                    i23++;
                    l4Var2 = l4Var;
                }
                AndroidUtilities.runOnUIThread(new cb(l4Var2, this.f2271b, arrayList11, str3, 11));
                return;
            case 16:
                TLObject tLObject2 = (TLObject) obj2;
                HashSet hashSet = (HashSet) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj4;
                boolean z18 = tLObject2 instanceof TLRPC.Updates;
                int i25 = this.f2271b;
                if (z18) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    MessagesController.getInstance(i25).putUsers(updates.users, false);
                    MessagesController.getInstance(i25).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size3 = findUpdatesAndRemove.size();
                    while (i16 < size3) {
                        Object obj9 = findUpdatesAndRemove.get(i16);
                        i16++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj9).call;
                    }
                    if (LaunchActivity.H1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f20292id = groupCall.f20285id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.d2.g(LaunchActivity.H1, i25, tL_inputGroupCall, false, groupCall, hashSet);
                        return;
                    }
                    return;
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    MessagesController.getInstance(i25).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i25).putChats(groupcall.chats, false);
                    if (LaunchActivity.H1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.f20292id = groupCall2.f20285id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.d2.g(LaunchActivity.H1, i25, tL_inputGroupCall2, false, groupCall2, hashSet);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    org.telegram.ui.Components.xc.a0(n2Var).f0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 17:
                qn.V((qn) obj5, i17, (Boolean) obj3, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj4);
                return;
            case 18:
                cn cnVar = (cn) obj5;
                ri riVar = (ri) obj3;
                riVar.f44280b = cnVar.f36032a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) obj2).f20275id, i17, new xm(cnVar, riVar, (qn) obj4));
                return;
            case 19:
                cn cnVar2 = (cn) obj5;
                MessageObject messageObject = (MessageObject) obj3;
                Integer num = (Integer) obj2;
                byte[] bArr = (byte[]) obj4;
                qn qnVar = cnVar2.f36032a;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == qnVar.L6) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                qnVar.bb(this.f2271b, id2, true, i12, true, 0, num, bArr, new om(cnVar2, messageObject, 1));
                return;
            case 20:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj5;
                int[] iArr = (int[]) obj3;
                Runnable runnable = (Runnable) obj2;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new org.telegram.ui.Components.z1(iArr, runnable, i17));
                    n2Var2.showDialog(b2VarArr[0]);
                    return;
                }
                return;
            case 21:
                TLRPC.Chat chat4 = (TLRPC.Chat) obj5;
                ArrayList arrayList12 = (ArrayList) obj3;
                ArrayList arrayList13 = (ArrayList) obj2;
                ArrayList arrayList14 = (ArrayList) obj4;
                if (LaunchActivity.D1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    sg.k0 k0Var = new sg.k0(11, this.f2271b, R.getParentActivity(), R, null);
                    k0Var.J1(chat4, arrayList12, arrayList13, arrayList14, null);
                    k0Var.show();
                    return;
                }
                return;
            case 22:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) obj3;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj2;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj4;
                SharedPreferences.Editor edit = ((SharedPreferences) obj5).edit();
                edit.putLong("support_id2", tL_help_support.user.f20422id);
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
                MessagesStorage.getInstance(i17).putUsersAndChats(arrayList15, null, true, true);
                MessagesController.getInstance(i17).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.f20422id);
                n2Var3.presentFragment(new qn(bundle));
                return;
            case 23:
                ps.Q((ps) obj5, (TLObject) obj2, (TLRPC.InputPeer) obj3, i17, (int[]) obj4);
                return;
            case 24:
                sw0 sw0Var = (sw0) obj5;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) obj4;
                int[] iArr2 = sw0Var.e;
                RLottieNative[] rLottieNativeArr = sw0Var.f30345f1;
                if (sw0Var.W0) {
                    AndroidUtilities.runOnUIThread(new qw0(sw0Var, 2));
                    return;
                }
                int i26 = 0;
                boolean z19 = false;
                while (true) {
                    int length2 = rLottieNativeArr.length;
                    int i27 = this.f2271b;
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
                                    AndroidUtilities.runOnUIThread(new rw0(document, i27, messageObject2, u1Var2, tL_messages_stickerSet, 1));
                                    z19 = true;
                                } else {
                                    tL_messages_stickerSet = tL_messages_stickerSet2;
                                    u1Var = u1Var2;
                                    rLottieNativeArr[i26] = RLottieNative.b(readRes, iArr2, null, null);
                                    sw0Var.f30346g1[i26] = iArr2[0];
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
                            AndroidUtilities.runOnUIThread(new qw0(sw0Var, 3));
                            return;
                        } else {
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.i4(sw0Var, i27, u1Var3, 23));
                            return;
                        }
                    }
                }
            case 25:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                TLObject tLObject3 = (TLObject) obj2;
                Uri uri = (Uri) obj3;
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) obj4;
                Pattern pattern = LaunchActivity.C1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject3 != null && launchActivity.f33179q0 != null) {
                        TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject3;
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
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().f33815s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
                            PhotoViewer.t1().G0(false, true);
                        } else if (org.telegram.ui.l4.I() && org.telegram.ui.l4.x().V) {
                            org.telegram.ui.l4.x().o(false, true);
                        }
                        ei.vb.w();
                        q50 q50Var = q50.D3;
                        if (q50Var != null) {
                            q50Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.f33179q0.U(true, true);
                            launchActivity.f33183s0.U(true, true);
                        }
                        cy cyVar = new cy(h);
                        cyVar.C2 = launchActivity;
                        if (!AndroidUtilities.isTablet() ? launchActivity.f33179q0.getFragmentStack().size() <= 1 || !(launchActivity.f33179q0.getFragmentStack().get(launchActivity.f33179q0.getFragmentStack().size() - 1) instanceof mg0) : launchActivity.f33181r0.getFragmentStack().isEmpty() || !(launchActivity.f33181r0.getFragmentStack().get(launchActivity.f33181r0.getFragmentStack().size() - 1) instanceof mg0)) {
                            z14 = false;
                        }
                        ((ActionBarLayout) launchActivity.O()).S(cyVar, z14, false);
                    } else {
                        if (launchActivity.W == null) {
                            launchActivity.W = new ArrayList();
                        }
                        launchActivity.W.add(0, launchActivity.X);
                        launchActivity.X = null;
                        launchActivity.j0(true);
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
            case 26:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                z70 z70Var = (z70) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj4;
                ArrayList arrayList16 = launchActivity2.f33155d0;
                if (!launchActivity2.isFinishing()) {
                    try {
                        z70Var.run();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    if (tL_error2 == null) {
                        if (launchActivity2.f33179q0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                            TLRPC.Chat chat5 = updates2.chats.get(0);
                            chat5.left = false;
                            chat5.kicked = false;
                            MessagesController.getInstance(i17).putUsers(updates2.users, false);
                            MessagesController.getInstance(i17).putChats(updates2.chats, false);
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chat5.f20275id);
                            if (arrayList16.isEmpty() || MessagesController.getInstance(i17).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.n2) i2.e.h(1, arrayList16))) {
                                qn qnVar2 = new qn(bundle2);
                                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                                ((ActionBarLayout) launchActivity2.O()).S(qnVar2, false, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity2);
                    String string = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder.f20604a;
                    b2Var4.R = string;
                    if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                        b2Var4.T = LocaleController.getString(R.string.FloodWait);
                    } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                        b2Var4.T = LocaleController.getString(R.string.JoinToGroupErrorFull);
                    } else {
                        b2Var4.T = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    launchActivity2.F0(alertDialog$Builder);
                    return;
                }
                return;
            case 27:
                TLObject tLObject4 = (TLObject) obj2;
                String str4 = (String) obj4;
                z70 z70Var2 = (z70) obj3;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) i2.e.h(1, ((LaunchActivity) obj5).f33155d0);
                try {
                    if (tLObject4 instanceof TL_chatlists.chatlist_ChatlistInvite) {
                        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject4;
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
                            a02 = org.telegram.ui.Components.xc.a0(n2Var4);
                            i14 = R.string.NoFolderFound;
                        } else {
                            ?? bbVar = new org.telegram.ui.Components.bb(n2Var4, false);
                            bbVar.Y = -1;
                            bbVar.f27657c0 = "";
                            bbVar.f27658d0 = new ArrayList();
                            bbVar.f27660f0 = "";
                            bbVar.f27662h0 = new ArrayList();
                            ArrayList arrayList17 = new ArrayList();
                            bbVar.f27663i0 = arrayList17;
                            bbVar.f27679z0 = -1;
                            bbVar.C0 = -5;
                            bbVar.X = str4;
                            bbVar.Z = chatlist_chatlistinvite;
                            arrayList17.clear();
                            if (z20) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                bbVar.f27657c0 = tL_textWithEntities.text;
                                bbVar.f27658d0 = tL_textWithEntities.entities;
                                bbVar.f27659e0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                bbVar.f27661g0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                bbVar.f27661g0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                bbVar.f27664j0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                bbVar.Y = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList18 = n2Var4.getMessagesController().dialogFilters;
                                if (arrayList18 != null) {
                                    while (true) {
                                        if (i16 < arrayList18.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList18.get(i16);
                                            if (dialogFilter.f17801id == bbVar.Y) {
                                                bbVar.f27657c0 = dialogFilter.name;
                                                bbVar.f27658d0 = dialogFilter.entities;
                                                bbVar.f27659e0 = dialogFilter.title_noanimate;
                                            } else {
                                                i16++;
                                            }
                                        }
                                    }
                                }
                            }
                            bbVar.T();
                            n2Var4.showDialog(bbVar);
                            z70Var2.run();
                            return;
                        }
                    } else {
                        a02 = org.telegram.ui.Components.xc.a0(n2Var4);
                        i14 = R.string.NoFolderFound;
                    }
                    z70Var2.run();
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
                lk.q(i14, a02, null);
                break;
            case 28:
                ((ib0) obj5).v((String) obj4, i17 + 1, (String) obj3, (String) obj2);
                return;
            default:
                String str5 = (String) obj4;
                ArrayList arrayList19 = new ArrayList();
                ?? obj10 = new Object();
                obj10.f4697b = "inapp";
                obj10.f4696a = str5;
                arrayList19.add(obj10.a());
                FileLog.d("LoginBilling querying \"" + str5 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList19, new i6((lf0) obj5, str5, (String) obj3, (String) obj2, this.f2271b));
                return;
        }
    }

    public ub(ContextWrapper contextWrapper, TLObject tLObject, int i10, String str, Object obj, int i11) {
        this.f2270a = i11;
        this.f2272c = contextWrapper;
        this.e = tLObject;
        this.f2271b = i10;
        this.f2273f = str;
        this.d = obj;
    }

    public ub(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f2270a = i11;
        this.f2272c = obj;
        this.f2271b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f2273f = obj4;
    }

    public ub(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.f2270a = i11;
        this.f2272c = obj;
        this.d = obj2;
        this.f2271b = i10;
        this.e = obj3;
        this.f2273f = obj4;
    }

    public ub(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f2270a = i11;
        this.f2272c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2271b = i10;
        this.f2273f = obj4;
    }

    public ub(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f2270a = i11;
        this.f2272c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2273f = obj4;
        this.f2271b = i10;
    }

    public ub(Object obj, String str, String str2, String str3, int i10, int i11) {
        this.f2270a = i11;
        this.f2272c = obj;
        this.f2273f = str;
        this.d = str2;
        this.e = str3;
        this.f2271b = i10;
    }

    public ub(Object obj, TLObject tLObject, Object obj2, int i10, Object obj3, int i11) {
        this.f2270a = i11;
        this.f2272c = obj;
        this.e = tLObject;
        this.d = obj2;
        this.f2271b = i10;
        this.f2273f = obj3;
    }

    public ub(MessagesStorage messagesStorage, String str, int i10, Object[] objArr, CountDownLatch countDownLatch) {
        this.f2270a = 10;
        this.f2272c = messagesStorage;
        this.f2273f = str;
        this.f2271b = i10;
        this.d = objArr;
        this.e = countDownLatch;
    }

    public ub(MessagesStorage messagesStorage, String str, TLObject tLObject, int i10, String str2) {
        this.f2270a = 11;
        this.f2272c = messagesStorage;
        this.f2273f = str;
        this.e = tLObject;
        this.f2271b = i10;
        this.d = str2;
    }

    public ub(TLObject tLObject, int i10, HashSet hashSet, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f2270a = 16;
        this.e = tLObject;
        this.f2271b = i10;
        this.f2272c = hashSet;
        this.d = tL_error;
        this.f2273f = n2Var;
    }

    public ub(TLObject tLObject, boolean[] zArr, Utilities.Callback callback, int i10, TL_account.updateEmojiStatus updateemojistatus) {
        this.f2270a = 2;
        this.e = tLObject;
        this.f2272c = zArr;
        this.d = callback;
        this.f2271b = i10;
        this.f2273f = updateemojistatus;
    }
}
