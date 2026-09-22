package ei;

import ai.c9;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Size;
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
import org.telegram.messenger.rk;
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
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.wm;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.aj;
import org.telegram.ui.fs0;
import org.telegram.ui.gh0;
import org.telegram.ui.gn;
import org.telegram.ui.gy;
import org.telegram.ui.hg0;
import org.telegram.ui.i60;
import org.telegram.ui.ln;
import org.telegram.ui.pr0;
import org.telegram.ui.r80;
import org.telegram.ui.uy;
import org.telegram.ui.xm;
import org.telegram.ui.zn;
public final class l3 implements Runnable {
    public final int f8474a;
    public final int f8475b;
    public final Object f8476c;
    public final Object d;
    public final Object e;
    public final Object f8477f;

    public l3(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f8474a = 20;
        this.f8475b = i10;
        this.f8476c = chat;
        this.d = arrayList;
        this.e = arrayList2;
        this.f8477f = arrayList3;
    }

    private final void a() {
        LaunchActivity launchActivity = (LaunchActivity) this.f8476c;
        r80 r80Var = (r80) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        TLRPC.Updates updates = (TLRPC.Updates) this.f8477f;
        ArrayList arrayList = launchActivity.f31125d0;
        if (!launchActivity.isFinishing()) {
            try {
                r80Var.run();
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (tL_error == null) {
                if (launchActivity.f31149q0 != null && updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    int i10 = this.f8475b;
                    MessagesController.getInstance(i10).putUsers(updates.users, false);
                    MessagesController.getInstance(i10).putChats(updates.chats, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.f18343id);
                    if (arrayList.isEmpty() || MessagesController.getInstance(i10).checkCanOpenChat(bundle, (org.telegram.ui.ActionBar.n2) hg.k0.g(1, arrayList))) {
                        zn znVar = new zn(bundle);
                        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                        ((ActionBarLayout) launchActivity.O()).S(znVar, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.AppName);
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.FloodWait);
            } else if (tL_error.text.equals("USERS_TOO_MUCH")) {
                alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.JoinToGroupErrorFull);
            } else {
                alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            launchActivity.B0(alertDialog$Builder);
        }
    }

    @Override
    public final void run() {
        boolean z10;
        char c10;
        final long j3;
        long j10;
        Object obj;
        String lowerCase;
        org.telegram.ui.ActionBar.n2 R;
        boolean z11;
        xc a02;
        int i10;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        int i11;
        int i12;
        long j11 = 0;
        int i13 = 0;
        switch (this.f8474a) {
            case 0:
                long[] jArr = (long[]) this.f8476c;
                int i14 = this.f8475b;
                v9 v9Var = (v9) this.d;
                v9 v9Var2 = (v9) this.e;
                TextView textView = (TextView) this.f8477f;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(jArr[0]));
                    g9 g9Var = new g9((f6) null);
                    g9Var.r(user);
                    v9Var.e(user, g9Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-jArr[0]));
                    g9 g9Var2 = new g9((f6) null);
                    g9Var2.q(chat);
                    v9Var.e(chat, g9Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(jArr[0]));
                    if (v9Var2 != null) {
                        g9 g9Var3 = new g9((f6) null);
                        g9Var3.r(user2);
                        v9Var2.e(user2, g9Var3);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user2));
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat2 = MessagesController.getInstance(i14).getChat(Long.valueOf(-jArr[0]));
                if (v9Var2 != null) {
                    g9 g9Var4 = new g9((f6) null);
                    g9Var4.q(chat2);
                    v9Var2.e(chat2, g9Var4);
                }
                if (textView != null) {
                    textView.setText(chat2 != null ? chat2.title : "");
                    return;
                }
                return;
            case 1:
                boolean[] zArr = (boolean[]) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                int i15 = this.f8475b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f8477f;
                if (!(((TLObject) this.f8476c) instanceof TLRPC.TL_boolTrue)) {
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
                    MessagesController.getInstance(i15).updateEmojiStatusUntilUpdate(currentUser.f18490id, currentUser.emoji_status);
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
                final gg.i0 i0Var = (gg.i0) this.f8476c;
                int i16 = this.f8475b;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) this.f8477f;
                gg.z zVar = i0Var.f9773j0;
                ArrayList arrayList6 = i0Var.f9787v0;
                int i17 = i0Var.f9784s0;
                i0Var.D0--;
                if (i16 != i0Var.f9766d0) {
                    return;
                }
                i0Var.f9769f0 = i16;
                if (i0Var.f9767e0 != i16) {
                    zVar.b();
                }
                if (i0Var.f9770g0 != i16) {
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
                        j3 = user3.f18490id;
                    } else if (obj2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj2;
                        MessagesController.getInstance(i17).putChat(chat3, z12);
                        j3 = -chat3.f18343id;
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
                                int i21 = i0.this.f9784s0;
                                if (i20 != -1) {
                                    TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                    long j12 = j3;
                                    tL_dialog.f18347id = j12;
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
                        gy gyVar = i0Var.U;
                        boolean z13 = gyVar != null && gyVar.a() == j3;
                        int i20 = 0;
                        while (!z13 && i20 < size) {
                            gg.h0 h0Var = (gg.h0) arrayList6.get(i20);
                            int i21 = i20;
                            z13 = (h0Var == null || h0Var.f9756c != j3) ? z13 : true;
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
                i0Var.f9783s = arrayList3;
                i0Var.G = arrayList4;
                zVar.f(arrayList3, arrayList6);
                i0Var.l();
                gy gyVar2 = i0Var.U;
                if (gyVar2 != null) {
                    gyVar2.d(i0Var.D0 > 0, true);
                    i0Var.U.c();
                    return;
                }
                return;
            case 3:
                gg.u1 u1Var = (gg.u1) this.f8476c;
                int i22 = this.f8475b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                ArrayList arrayList9 = (ArrayList) this.f8477f;
                if (i22 == u1Var.E) {
                    u1Var.d = arrayList7;
                    u1Var.e = arrayList8;
                    u1Var.H = arrayList9;
                    u1Var.f9948f.f(arrayList7, null);
                    u1Var.f9954y = false;
                    u1Var.l();
                    u1Var.F();
                    return;
                }
                return;
            case 4:
                Pair pair = (Pair) this.d;
                ((i2.c1) this.f8476c).f10634b.h.h(((Integer) pair.first).intValue(), (u2.f0) pair.second, (u2.t) this.e, (u2.b0) this.f8477f, this.f8475b);
                return;
            case 5:
                ki.o oVar = (ki.o) this.f8476c;
                Size size2 = (Size) this.d;
                int i23 = this.f8475b;
                RuntimeException[] runtimeExceptionArr = (RuntimeException[]) this.e;
                CountDownLatch countDownLatch = (CountDownLatch) this.f8477f;
                try {
                    try {
                        oVar.f13784a = size2;
                        oVar.f13787f = i23;
                        SurfaceTexture surfaceTexture = oVar.f13792l;
                        if (surfaceTexture != null) {
                            surfaceTexture.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                        }
                        oVar.e();
                        ki.x xVar = oVar.v;
                        if (xVar != null) {
                            xVar.u(size2, i23);
                        }
                        ki.k kVar = oVar.e;
                        StringBuilder sb2 = new StringBuilder("GL input updated: input=");
                        sb2.append(size2);
                        sb2.append(", crop=");
                        sb2.append(i23);
                        sb2.append(", filter=");
                        sb2.append(oVar.f13787f == oVar.f13786c ? "NEAREST" : "LINEAR");
                        kVar.b(sb2.toString());
                    } catch (RuntimeException e) {
                        runtimeExceptionArr[0] = e;
                    }
                    countDownLatch.countDown();
                    return;
                } catch (Throwable th2) {
                    countDownLatch.countDown();
                    throw th2;
                }
            case 6:
                m4.k0 k0Var = (m4.k0) this.f8476c;
                m4.l1 l1Var = (m4.l1) this.d;
                int i24 = this.f8475b;
                n4.a0 a0Var = (n4.a0) this.e;
                m4.j0 j0Var = (m4.j0) this.f8477f;
                oi.f fVar = k0Var.f14820f;
                if (k0Var.f14821g.j()) {
                    return;
                }
                if (!((n4.r) k0Var.f14824k.f15230a).f15212a.isActive()) {
                    StringBuilder sb3 = new StringBuilder("Ignore incoming session command before initialization. command=");
                    sb3.append(l1Var == null ? Integer.valueOf(i24) : l1Var.f14848b);
                    sb3.append(", pid=");
                    sb3.append(a0Var.f15166a.f15168b);
                    e2.a.n("MediaSessionLegacyStub", sb3.toString());
                    return;
                }
                m4.r L = k0Var.L(a0Var);
                if (l1Var != null) {
                    if (!fVar.D(L, l1Var)) {
                        return;
                    }
                } else if (!fVar.C(L, i24)) {
                    return;
                }
                try {
                    j0Var.f(L);
                    return;
                } catch (RemoteException e7) {
                    e2.a.o("MediaSessionLegacyStub", "Exception in " + L, e7);
                    return;
                }
            case 7:
                LocationController.lambda$fetchLocationAddress$29((Locale) this.f8476c, (Location) this.d, this.f8475b, (Locale) this.e, (LocationController.LocationFetchCallback) this.f8477f);
                return;
            case 8:
                ((MediaDataController) this.f8476c).lambda$removeMultipleStickerSets$110((boolean[]) this.d, (ArrayList) this.e, this.f8475b, (int[]) this.f8477f);
                return;
            case 9:
                ((MessagesController) this.f8476c).lambda$processUpdateArray$403((yf.r) this.d, (ConcurrentHashMap) this.e, (ConcurrentHashMap) this.f8477f, this.f8475b);
                return;
            case 10:
                ((MessagesStorage) this.f8476c).lambda$getSentFile$164((String) this.d, this.f8475b, (Object[]) this.e, (CountDownLatch) this.f8477f);
                return;
            case 11:
                ((MessagesStorage) this.f8476c).lambda$putSentFile$170((String) this.d, (TLObject) this.e, this.f8475b, (String) this.f8477f);
                return;
            case 12:
                ((NotificationCenter) this.f8476c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.e, (yg) this.f8477f, this.f8475b);
                return;
            case 13:
                ((VoIPService) this.f8476c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.f8475b, (String) this.e, (TLRPC.TL_error) this.f8477f);
                return;
            case 14:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f8476c;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                String str = (String) this.f8477f;
                int i25 = this.f8475b;
                ArrayList arrayList11 = new ArrayList();
                int size3 = arrayList10.size();
                int i26 = 0;
                while (i26 < size3) {
                    Object obj3 = arrayList10.get(i26);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj3);
                    if (obj3 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj3;
                        obj = obj3;
                        CharSequence C = org.telegram.ui.h4.C(h4Var, h4Var.f34130u0[i13].f35306c.E, null, richText, richText, pageBlock, 1000);
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
                        int i27 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str, i27);
                            if (indexOf >= 0) {
                                int length = str.length() + indexOf;
                                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                                    ?? obj4 = new Object();
                                    obj4.f36772a = indexOf;
                                    obj4.f36774c = pageBlock;
                                    obj4.f36773b = obj;
                                    arrayList11.add(obj4);
                                }
                                i27 = length;
                            }
                        }
                    }
                    i26++;
                    i13 = 0;
                }
                AndroidUtilities.runOnUIThread(new c9(h4Var, i25, arrayList11, str, 10));
                return;
            case 15:
                TLObject tLObject = (TLObject) this.f8476c;
                int i28 = this.f8475b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f8477f;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(i28).putUsers(updates.users, false);
                    MessagesController.getInstance(i28).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size4 = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i13 < size4) {
                        Object obj5 = findUpdatesAndRemove.get(i13);
                        i13++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj5).call;
                    }
                    if (LaunchActivity.G1 == null || groupCall == null) {
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    tL_inputGroupCall.f18360id = groupCall.f18353id;
                    tL_inputGroupCall.access_hash = groupCall.access_hash;
                    org.telegram.ui.Components.voip.f2.g(LaunchActivity.G1, i28, tL_inputGroupCall, false, groupCall, hashSet);
                    return;
                } else if (!(tLObject instanceof TL_phone.groupCall)) {
                    if (tL_error != null) {
                        xc.a0(n2Var).d0(tL_error, false);
                        return;
                    }
                    return;
                } else {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    MessagesController.getInstance(i28).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i28).putChats(groupcall.chats, false);
                    if (LaunchActivity.G1 == null) {
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.f18360id = groupCall2.f18353id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    org.telegram.ui.Components.voip.f2.g(LaunchActivity.G1, i28, tL_inputGroupCall2, false, groupCall2, hashSet);
                    return;
                }
            case 16:
                zn.t1((zn) this.f8476c, this.f8475b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f8477f);
                return;
            case 17:
                ln lnVar = (ln) this.f8476c;
                aj ajVar = (aj) this.d;
                ajVar.f15442b = lnVar.f35505a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.e).f18343id, this.f8475b, new gn(lnVar, ajVar, (zn) this.f8477f));
                return;
            case 18:
                ln lnVar2 = (ln) this.f8476c;
                int i29 = this.f8475b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f8477f;
                zn znVar = lnVar2.f35505a;
                znVar.Xa(i29, messageObject.getId(), true, messageObject.getDialogId() == znVar.L6 ? 1 : 0, true, 0, num, bArr, new xm(lnVar2, messageObject, 1));
                return;
            case 19:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.f8476c;
                int[] iArr = (int[]) this.d;
                int i30 = this.f8475b;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f8477f;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var == null) {
                    return;
                }
                b2Var.setOnCancelListener(new org.telegram.ui.Components.y1(iArr, runnable, i30));
                n2Var2.showDialog(b2VarArr[0]);
                return;
            case 20:
                int i31 = this.f8475b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.f8476c;
                ArrayList arrayList12 = (ArrayList) this.d;
                ArrayList arrayList13 = (ArrayList) this.e;
                ArrayList arrayList14 = (ArrayList) this.f8477f;
                if (!LaunchActivity.C1 || (R = LaunchActivity.R()) == null || R.getParentActivity() == null) {
                    return;
                }
                rg.j0 j0Var2 = new rg.j0(11, i31, R.getParentActivity(), R, null);
                j0Var2.I1(chat4, arrayList12, arrayList13, arrayList14, null);
                j0Var2.show();
                return;
            case 21:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.e;
                int i32 = this.f8475b;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.f8477f;
                SharedPreferences.Editor edit = ((SharedPreferences) this.f8476c).edit();
                edit.putLong("support_id2", tL_help_support.user.f18490id);
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
                MessagesStorage.getInstance(i32).putUsersAndChats(arrayList15, null, true, true);
                MessagesController.getInstance(i32).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.f18490id);
                n2Var3.presentFragment(new zn(bundle));
                return;
            case 22:
                fs.P((fs) this.f8476c, (TLObject) this.d, (TLRPC.InputPeer) this.e, this.f8475b, (int[]) this.f8477f);
                return;
            case 23:
                kw0 kw0Var = (kw0) this.f8476c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i33 = this.f8475b;
                MessageObject messageObject2 = (MessageObject) this.e;
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.f8477f;
                int[] iArr2 = kw0Var.e;
                RLottieNative[] rLottieNativeArr = kw0Var.f25832f1;
                if (kw0Var.W0) {
                    AndroidUtilities.runOnUIThread(new iw0(kw0Var, 2));
                    return;
                }
                boolean z14 = false;
                int i34 = 0;
                while (i34 < rLottieNativeArr.length) {
                    if (rLottieNativeArr[i34] == null) {
                        int i35 = i34 == 0 ? 1 : i34 == 1 ? 8 : i34 == 2 ? 14 : i34 == 3 ? 20 : 2;
                        if (i35 < tL_messages_stickerSet.documents.size()) {
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i35);
                            String readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(readRes)) {
                                AndroidUtilities.runOnUIThread(new jw0(document, i33, messageObject2, u1Var2, tL_messages_stickerSet, 1));
                                z14 = true;
                            } else {
                                rLottieNativeArr[i34] = RLottieNative.b(readRes, iArr2, null, null);
                                kw0Var.f25833g1[i34] = iArr2[0];
                            }
                        }
                    }
                    i34++;
                }
                if (z14) {
                    AndroidUtilities.runOnUIThread(new iw0(kw0Var, 3));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new wm(kw0Var, i33, u1Var2, 17));
                    return;
                }
            case 24:
                LaunchActivity launchActivity = (LaunchActivity) this.f8476c;
                TLObject tLObject2 = (TLObject) this.d;
                Uri uri = (Uri) this.e;
                int i36 = this.f8475b;
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) this.f8477f;
                Pattern pattern = LaunchActivity.B1;
                if (launchActivity.isFinishing()) {
                    return;
                }
                if (tLObject2 != null && launchActivity.f31149q0 != null) {
                    TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject2;
                    Bundle i37 = a4.a.i("onlySelect", true);
                    i37.putString("importTitle", tL_messages_historyImportParsed.title);
                    i37.putBoolean("allowSwitchAccount", true);
                    if (tL_messages_historyImportParsed.pm) {
                        i37.putInt("dialogsType", 12);
                    } else if (tL_messages_historyImportParsed.group) {
                        i37.putInt("dialogsType", 11);
                    } else {
                        String uri2 = uri.toString();
                        Iterator<String> it = MessagesController.getInstance(i36).exportPrivateUri.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z11 = false;
                            } else if (uri2.contains(it.next())) {
                                i37.putInt("dialogsType", 12);
                                z11 = true;
                            }
                        }
                        if (!z11) {
                            Iterator<String> it2 = MessagesController.getInstance(i36).exportGroupUri.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (uri2.contains(it2.next())) {
                                        i37.putInt("dialogsType", 11);
                                        z11 = true;
                                    }
                                }
                            }
                            if (!z11) {
                                i37.putInt("dialogsType", 13);
                            }
                        }
                    }
                    if (SecretMediaViewer.g() && SecretMediaViewer.f().f31781s) {
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
                        launchActivity.f31149q0.U(true, true);
                        launchActivity.f31153s0.U(true, true);
                    }
                    uy uyVar = new uy(i37);
                    uyVar.C2 = launchActivity;
                    ((ActionBarLayout) launchActivity.O()).S(uyVar, !AndroidUtilities.isTablet() ? launchActivity.f31149q0.getFragmentStack().size() <= 1 || !(launchActivity.f31149q0.getFragmentStack().get(launchActivity.f31149q0.getFragmentStack().size() - 1) instanceof gh0) : launchActivity.f31151r0.getFragmentStack().isEmpty() || !(launchActivity.f31151r0.getFragmentStack().get(launchActivity.f31151r0.getFragmentStack().size() + (-1)) instanceof gh0), false);
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
            case 25:
                TLObject tLObject3 = (TLObject) this.d;
                int i38 = this.f8475b;
                String str2 = (String) this.e;
                r80 r80Var = (r80) this.f8477f;
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) hg.k0.g(1, ((LaunchActivity) this.f8476c).f31125d0);
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
                        MessagesController.getInstance(i38).putChats(arrayList2, false);
                        MessagesController.getInstance(i38).putUsers(arrayList, false);
                        if (z15 && ((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                            a02 = xc.a0(n2Var4);
                            i10 = R.string.NoFolderFound;
                        } else {
                            ?? abVar = new ab(n2Var4, false);
                            abVar.Y = -1;
                            abVar.f23140c0 = "";
                            abVar.f23141d0 = new ArrayList();
                            abVar.f23143f0 = "";
                            abVar.f23145h0 = new ArrayList();
                            ArrayList arrayList16 = new ArrayList();
                            abVar.f23146i0 = arrayList16;
                            abVar.f23162z0 = -1;
                            abVar.C0 = -5;
                            abVar.X = str2;
                            abVar.Z = chatlist_chatlistinvite;
                            arrayList16.clear();
                            if (z15) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                abVar.f23140c0 = tL_textWithEntities.text;
                                abVar.f23141d0 = tL_textWithEntities.entities;
                                abVar.f23142e0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                abVar.f23144g0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                abVar.f23144g0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                abVar.f23147j0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                abVar.Y = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList17 = n2Var4.getMessagesController().dialogFilters;
                                if (arrayList17 != null) {
                                    while (true) {
                                        if (i13 < arrayList17.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList17.get(i13);
                                            if (dialogFilter.f15837id == abVar.Y) {
                                                abVar.f23140c0 = dialogFilter.name;
                                                abVar.f23141d0 = dialogFilter.entities;
                                                abVar.f23142e0 = dialogFilter.title_noanimate;
                                            } else {
                                                i13++;
                                            }
                                        }
                                    }
                                }
                            }
                            abVar.S();
                            n2Var4.showDialog(abVar);
                            r80Var.run();
                            return;
                        }
                    } else {
                        a02 = xc.a0(n2Var4);
                        i10 = R.string.NoFolderFound;
                    }
                    r80Var.run();
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
                rk.p(i10, a02, null);
                break;
            case 26:
                a();
                return;
            case 27:
                hg0 hg0Var = (hg0) this.f8476c;
                String str3 = (String) this.d;
                String str4 = (String) this.e;
                String str5 = (String) this.f8477f;
                int i39 = this.f8475b;
                ArrayList arrayList18 = new ArrayList();
                c5.a aVar = new c5.a();
                aVar.f3842c = "inapp";
                aVar.f3841b = str3;
                arrayList18.add(aVar.a());
                FileLog.d("LoginBilling querying \"" + str3 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList18, new org.telegram.ui.Components.d2(hg0Var, str3, str4, str5, i39));
                return;
            case 28:
                int i40 = this.f8475b;
                g9 g9Var5 = (g9) this.e;
                TLRPC.User user4 = (TLRPC.User) this.f8477f;
                ((int[]) this.f8476c)[0] = i40;
                g9Var5.r(user4);
                ((v9) this.d).e(user4, g9Var5);
                return;
            default:
                qg.n2 n2Var5 = (qg.n2) this.f8476c;
                int i41 = this.f8475b;
                List list = (List) this.d;
                ArrayList arrayList19 = (ArrayList) this.e;
                pr0 pr0Var = (pr0) this.f8477f;
                if (n2Var5.I == null || n2Var5.f41869y) {
                    return;
                }
                Matrix matrix = new Matrix();
                matrix.postScale(1.0f / n2Var5.I.getWidth(), 1.0f / n2Var5.I.getHeight());
                matrix.postTranslate(-0.5f, -0.5f);
                matrix.postRotate(i41);
                matrix.postTranslate(0.5f, 0.5f);
                if ((i41 / 90) % 2 != 0) {
                    matrix.postScale(n2Var5.I.getHeight(), n2Var5.I.getWidth());
                } else {
                    matrix.postScale(n2Var5.I.getWidth(), n2Var5.I.getHeight());
                }
                if (list.isEmpty()) {
                    qg.k2 k2Var = new qg.k2(n2Var5);
                    k2Var.h.set(0.0f, 0.0f, n2Var5.I.getWidth(), n2Var5.I.getHeight());
                    k2Var.f41752i.set(k2Var.h);
                    matrix.mapRect(k2Var.f41752i);
                    k2Var.f41749c = i41;
                    Bitmap d = n2Var5.d(n2Var5.I, 0, 0, false);
                    k2Var.d = d;
                    if (d == null) {
                        FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                        return;
                    }
                    k2Var.f41750f = k2Var.c();
                    qg.n2.c(k2Var, n2Var5.T, n2Var5.U);
                    n2Var5.O = k2Var.f41753j;
                    n2Var5.P = k2Var.f41754k;
                    arrayList19.add(k2Var);
                    AndroidUtilities.runOnUIThread(new fs0(n2Var5, arrayList19, pr0Var, k2Var, 23));
                    n2Var5.E = k2Var;
                    n2Var5.f41869y = true;
                    n2Var5.f41868x = false;
                    return;
                }
                for (int i42 = 0; i42 < list.size(); i42++) {
                    qg.m2 m2Var = (qg.m2) list.get(i42);
                    qg.k2 k2Var2 = new qg.k2(n2Var5);
                    k2Var2.h.set(m2Var.f41801b, m2Var.f41802c, i11 + m2Var.d, i12 + m2Var.e);
                    k2Var2.f41752i.set(k2Var2.h);
                    matrix.mapRect(k2Var2.f41752i);
                    k2Var2.f41749c = i41;
                    Bitmap d10 = n2Var5.d(m2Var.f41800a, m2Var.f41801b, m2Var.f41802c, false);
                    k2Var2.d = d10;
                    if (d10 != null) {
                        k2Var2.f41750f = k2Var2.c();
                        qg.n2.c(k2Var2, n2Var5.T, n2Var5.U);
                        n2Var5.O = k2Var2.f41753j;
                        n2Var5.P = k2Var2.f41754k;
                        arrayList19.add(k2Var2);
                    }
                }
                n2Var5.E = null;
                n2Var5.f41869y = true;
                n2Var5.f41868x = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(13, n2Var5, arrayList19));
                return;
        }
    }

    public l3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f8474a = i11;
        this.f8476c = obj;
        this.f8475b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f8477f = obj4;
    }

    public l3(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.f8474a = i11;
        this.f8476c = obj;
        this.d = obj2;
        this.f8475b = i10;
        this.e = obj3;
        this.f8477f = obj4;
    }

    public l3(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f8474a = i11;
        this.f8476c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f8475b = i10;
        this.f8477f = obj4;
    }

    public l3(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f8474a = i11;
        this.f8476c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f8477f = obj4;
        this.f8475b = i10;
    }

    public l3(int[] iArr, int i10, g9 g9Var, TLRPC.User user, v9 v9Var) {
        this.f8474a = 28;
        this.f8476c = iArr;
        this.f8475b = i10;
        this.e = g9Var;
        this.f8477f = user;
        this.d = v9Var;
    }
}
