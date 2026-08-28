package fh;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.TextView;
import gh.v7;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kh.wb;
import org.json.JSONObject;
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
import org.telegram.messenger.ll;
import org.telegram.messenger.qg;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.dv0;
import org.telegram.ui.Components.ev0;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.cn;
import org.telegram.ui.dy;
import org.telegram.ui.ei1;
import org.telegram.ui.fk0;
import org.telegram.ui.ir0;
import org.telegram.ui.mq0;
import org.telegram.ui.ng0;
import org.telegram.ui.o50;
import org.telegram.ui.of0;
import org.telegram.ui.oi;
import org.telegram.ui.om;
import org.telegram.ui.ox;
import org.telegram.ui.qn;
import org.telegram.ui.rl;
import org.telegram.ui.x20;
import org.telegram.ui.xm;
public final class g1 implements Runnable {
    public final int f6467a;
    public final int f6468b;
    public final Object f6469c;
    public final Object d;
    public final Object f6470e;
    public final Object f6471f;

    public g1(int i9, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f6467a = 19;
        this.f6468b = i9;
        this.f6469c = chat;
        this.d = arrayList;
        this.f6470e = arrayList2;
        this.f6471f = arrayList3;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        boolean z12;
        char c10;
        boolean z13;
        final long j10;
        long j11;
        boolean z14;
        Object obj;
        String lowerCase;
        int i9;
        org.telegram.ui.ActionBar.o2 R;
        int i10;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i11;
        org.telegram.ui.Cells.t1 t1Var;
        boolean z15;
        boolean z16;
        oc a02;
        int i12;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        int i13;
        int i14;
        long j12 = 0;
        String str = "";
        int i15 = 0;
        switch (this.f6467a) {
            case 0:
                p2 p2Var = (p2) this.f6469c;
                Context context = (Context) this.d;
                int i16 = this.f6468b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f6470e;
                long j13 = p2Var.Y;
                c1 c1Var = new c1(p2Var, (Utilities.Callback) this.f6471f, 2);
                boolean z17 = starGift.limited;
                if (z17 && (disallowedGiftsSettings2 = p2Var.X) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z17 && (disallowedGiftsSettings = p2Var.X) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                new p1(p2Var, context, i16, starGift, j13, c1Var, z10, z11).show();
                return;
            case 1:
                int i17 = this.f6468b;
                TLObject tLObject = (TLObject) this.f6470e;
                String str2 = (String) this.f6471f;
                ((kh.d) this.f6469c).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) this.d)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                v7.y(i17, false).S();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    oc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionRenewedToast), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsSubscriptionRenewedToastText, str2)), null).k(false);
                    return;
                }
                return;
            case 2:
                long[] jArr = (long[]) this.f6469c;
                int i18 = this.f6468b;
                o9 o9Var = (o9) this.d;
                o9 o9Var2 = (o9) this.f6470e;
                TextView textView = (TextView) this.f6471f;
                if (jArr[0] >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(jArr[0]));
                    z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
                    z8Var.r(user);
                    o9Var.e(user, z8Var);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-jArr[0]));
                    z8 z8Var2 = new z8((org.telegram.ui.ActionBar.b6) null);
                    z8Var2.q(chat);
                    o9Var.e(chat, z8Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i18).getUser(Long.valueOf(jArr[0]));
                    if (o9Var2 != null) {
                        z8 z8Var3 = new z8((org.telegram.ui.ActionBar.b6) null);
                        z8Var3.r(user2);
                        o9Var2.e(user2, z8Var3);
                    }
                    if (textView != null) {
                        textView.setText(UserObject.getUserName(user2));
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat2 = MessagesController.getInstance(i18).getChat(Long.valueOf(-jArr[0]));
                if (o9Var2 != null) {
                    z8 z8Var4 = new z8((org.telegram.ui.ActionBar.b6) null);
                    z8Var4.q(chat2);
                    o9Var2.e(chat2, z8Var4);
                }
                if (textView != null) {
                    if (chat2 != null) {
                        str = chat2.title;
                    }
                    textView.setText(str);
                    return;
                }
                return;
            case 3:
                boolean[] zArr = (boolean[]) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f6471f;
                int i19 = this.f6468b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f6470e;
                if (!(((TLObject) this.f6469c) instanceof TLRPC.TL_boolTrue)) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        callback.run("SERVER_ERROR");
                        return;
                    }
                    return;
                }
                TLRPC.User currentUser = UserConfig.getInstance(i19).getCurrentUser();
                if (currentUser != null) {
                    currentUser.emoji_status = updateemojistatus.emoji_status;
                    z12 = true;
                    c10 = 0;
                    NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, currentUser);
                    MessagesController.getInstance(i19).updateEmojiStatusUntilUpdate(currentUser.f22527id, currentUser.emoji_status);
                } else {
                    z12 = true;
                    c10 = 0;
                }
                if (!zArr[c10]) {
                    zArr[c10] = z12;
                    callback.run(null);
                    return;
                }
                return;
            case 4:
                final of.f0 f0Var = (of.f0) this.f6469c;
                int i20 = this.f6468b;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = (ArrayList) this.f6470e;
                ArrayList<TLRPC.User> arrayList5 = (ArrayList) this.f6471f;
                of.w wVar = f0Var.f19294f0;
                ArrayList arrayList6 = f0Var.f19307r0;
                int i21 = f0Var.f19303o0;
                f0Var.f19319z0--;
                if (i20 == f0Var.Z) {
                    f0Var.f19287b0 = i20;
                    if (f0Var.f19286a0 != i20) {
                        wVar.b();
                    }
                    if (f0Var.f19289c0 != i20) {
                        f0Var.E.clear();
                    }
                    f0Var.J = true;
                    int i22 = 0;
                    while (i22 < arrayList3.size()) {
                        if (!f0Var.F(arrayList3.get(i22))) {
                            arrayList3.remove(i22);
                            i22--;
                        }
                        i22++;
                    }
                    boolean z18 = true;
                    int size = arrayList6.size();
                    int i23 = 0;
                    while (i23 < arrayList3.size()) {
                        final Object obj2 = arrayList3.get(i23);
                        if (obj2 instanceof TLRPC.User) {
                            TLRPC.User user3 = (TLRPC.User) obj2;
                            MessagesController.getInstance(i21).putUser(user3, z18);
                            j10 = user3.f22527id;
                        } else if (obj2 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) obj2;
                            MessagesController.getInstance(i21).putChat(chat3, z18);
                            j10 = -chat3.f22380id;
                        } else {
                            if (obj2 instanceof TLRPC.EncryptedChat) {
                                MessagesController.getInstance(i21).putEncryptedChat((TLRPC.EncryptedChat) obj2, z18);
                            }
                            j10 = j12;
                        }
                        if (j10 != j12 && ((TLRPC.Dialog) MessagesController.getInstance(i21).dialogs_dict.f(j10)) == null) {
                            j11 = j12;
                            MessagesStorage.getInstance(i21).getDialogFolderId(j10, new MessagesStorage.IntCallback() {
                                @Override
                                public final void run(int i24) {
                                    int i25 = f0.this.f19303o0;
                                    if (i24 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j14 = j10;
                                        tL_dialog.f22384id = j14;
                                        if (i24 != 0) {
                                            tL_dialog.folder_id = i24;
                                        }
                                        Object obj3 = obj2;
                                        if (obj3 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = ChatObject.isChannel((TLRPC.Chat) obj3) ? 1 : 0;
                                        }
                                        MessagesController.getInstance(i25).dialogs_dict.k(tL_dialog, j14);
                                        MessagesController.getInstance(i25).getAllDialogs().add(tL_dialog);
                                        MessagesController.getInstance(i25).sortDialogs(null);
                                    }
                                }
                            });
                        } else {
                            j11 = j12;
                        }
                        if (f0Var.S() && !(obj2 instanceof TLRPC.EncryptedChat)) {
                            ox oxVar = f0Var.Q;
                            if (oxVar != null && oxVar.a() == j10) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            int i24 = 0;
                            while (!z14 && i24 < size) {
                                of.e0 e0Var = (of.e0) arrayList6.get(i24);
                                boolean z19 = z14;
                                int i25 = i24;
                                if (e0Var != null && e0Var.f19281c == j10) {
                                    z14 = true;
                                } else {
                                    z14 = z19;
                                }
                                i24 = i25 + 1;
                            }
                            if (z14) {
                                arrayList3.remove(i23);
                                arrayList4.remove(i23);
                                i23--;
                            }
                        }
                        z18 = true;
                        i23++;
                        j12 = j11;
                    }
                    MessagesController.getInstance(i21).putUsers(arrayList5, z18);
                    f0Var.f19308s = arrayList3;
                    f0Var.C = arrayList4;
                    wVar.f(arrayList3, arrayList6);
                    f0Var.l();
                    ox oxVar2 = f0Var.Q;
                    if (oxVar2 != null) {
                        if (f0Var.f19319z0 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        oxVar2.d(z13, z18);
                        f0Var.Q.c();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                of.o1 o1Var = (of.o1) this.f6469c;
                int i26 = this.f6468b;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = (ArrayList) this.f6470e;
                ArrayList arrayList9 = (ArrayList) this.f6471f;
                if (i26 == o1Var.A) {
                    o1Var.d = arrayList7;
                    o1Var.f19439e = arrayList8;
                    o1Var.D = arrayList9;
                    o1Var.f19440f.f(arrayList7, null);
                    o1Var.f19446y = false;
                    o1Var.l();
                    o1Var.F();
                    return;
                }
                return;
            case 6:
                LocationController.lambda$fetchLocationAddress$29((Locale) this.f6469c, (Location) this.d, this.f6468b, (Locale) this.f6470e, (LocationController.LocationFetchCallback) this.f6471f);
                return;
            case 7:
                ((MediaDataController) this.f6469c).lambda$removeMultipleStickerSets$110((boolean[]) this.d, (ArrayList) this.f6470e, this.f6468b, (int[]) this.f6471f);
                return;
            case 8:
                ((MessagesController) this.f6469c).lambda$processUpdateArray$403((ff.u) this.d, (ConcurrentHashMap) this.f6470e, (ConcurrentHashMap) this.f6471f, this.f6468b);
                return;
            case 9:
                ((MessagesStorage) this.f6469c).lambda$getSentFile$164((String) this.d, this.f6468b, (Object[]) this.f6470e, (CountDownLatch) this.f6471f);
                return;
            case 10:
                ((MessagesStorage) this.f6469c).lambda$putSentFile$170((String) this.d, (TLObject) this.f6470e, this.f6468b, (String) this.f6471f);
                return;
            case 11:
                ((NotificationCenter) this.f6469c).lambda$listen$5((View) this.d, (View.OnAttachStateChangeListener) this.f6470e, (qg) this.f6471f, this.f6468b);
                return;
            case 12:
                ((VoIPService) this.f6469c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.f6468b, (String) this.f6470e, (TLRPC.TL_error) this.f6471f);
                return;
            case 13:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.f6469c;
                ArrayList arrayList10 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.f6470e;
                String str3 = (String) this.f6471f;
                int i27 = this.f6468b;
                ArrayList arrayList11 = new ArrayList();
                int size2 = arrayList10.size();
                int i28 = 0;
                while (i28 < size2) {
                    Object obj3 = arrayList10.get(i28);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj3);
                    if (obj3 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj3;
                        obj = obj3;
                        CharSequence C = org.telegram.ui.l4.C(l4Var, l4Var.f40026q0[i15].f41321c.A, null, richText, richText, pageBlock, 1000);
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
                        int i29 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str3, i29);
                            if (indexOf >= 0) {
                                int length = str3.length() + indexOf;
                                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                                    ?? obj4 = new Object();
                                    obj4.f43120a = indexOf;
                                    obj4.f43122c = pageBlock;
                                    obj4.f43121b = obj;
                                    arrayList11.add(obj4);
                                }
                                i29 = length;
                            }
                        }
                    }
                    i28++;
                    i15 = 0;
                }
                AndroidUtilities.runOnUIThread(new c3.d(l4Var, i27, arrayList11, str3, 10));
                return;
            case 14:
                TLObject tLObject2 = (TLObject) this.f6469c;
                int i30 = this.f6468b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f6470e;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f6471f;
                if (tLObject2 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    MessagesController.getInstance(i30).putUsers(updates.users, false);
                    MessagesController.getInstance(i30).putChats(updates.chats, false);
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
                    int size3 = findUpdatesAndRemove.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i15 < size3) {
                        Object obj5 = findUpdatesAndRemove.get(i15);
                        i15++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj5).call;
                    }
                    if (LaunchActivity.C1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f22397id = groupCall.f22390id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.e2.h(LaunchActivity.C1, i30, tL_inputGroupCall, false, groupCall, hashSet);
                        return;
                    }
                    return;
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    MessagesController.getInstance(i30).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i30).putChats(groupcall.chats, false);
                    if (LaunchActivity.C1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.f22397id = groupCall2.f22390id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.e2.h(LaunchActivity.C1, i30, tL_inputGroupCall2, false, groupCall2, hashSet);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    oc.a0(o2Var).d0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 15:
                qn.N0((qn) this.f6469c, this.f6468b, (Boolean) this.d, (TLRPC.WebPage) this.f6470e, (TL_account.getWebPagePreview) this.f6471f);
                return;
            case 16:
                cn cnVar = (cn) this.f6469c;
                oi oiVar = (oi) this.d;
                oiVar.f48382b = cnVar.f37236a.getMessagesController().ensureMessagesLoaded(-((TLRPC.Chat) this.f6470e).f22380id, this.f6468b, new xm(cnVar, oiVar, (qn) this.f6471f));
                return;
            case 17:
                cn cnVar2 = (cn) this.f6469c;
                int i31 = this.f6468b;
                MessageObject messageObject = (MessageObject) this.d;
                Integer num = (Integer) this.f6470e;
                byte[] bArr = (byte[]) this.f6471f;
                qn qnVar = cnVar2.f37236a;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == qnVar.H6) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                qnVar.Xa(i31, id2, true, i9, true, 0, num, bArr, new om(cnVar2, messageObject, 1));
                return;
            case 18:
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.f6469c;
                int[] iArr = (int[]) this.d;
                int i32 = this.f6468b;
                Runnable runnable = (Runnable) this.f6470e;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f6471f;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    c2Var.setOnCancelListener(new org.telegram.ui.Components.x1(iArr, runnable, i32));
                    o2Var2.showDialog(c2VarArr[0]);
                    return;
                }
                return;
            case 19:
                int i33 = this.f6468b;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.f6469c;
                ArrayList arrayList12 = (ArrayList) this.d;
                ArrayList arrayList13 = (ArrayList) this.f6470e;
                ArrayList arrayList14 = (ArrayList) this.f6471f;
                if (LaunchActivity.f35494y1 && (R = LaunchActivity.R()) != null && R.getParentActivity() != null) {
                    zf.j0 j0Var = new zf.j0(11, i33, R.getParentActivity(), R, null);
                    j0Var.I1(chat4, arrayList12, arrayList13, arrayList14, null);
                    j0Var.show();
                    return;
                }
                return;
            case 20:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.f6470e;
                int i34 = this.f6468b;
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) this.f6471f;
                SharedPreferences.Editor edit = ((SharedPreferences) this.f6469c).edit();
                edit.putLong("support_id2", tL_help_support.user.f22527id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    c2Var2.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                ArrayList arrayList15 = new ArrayList();
                arrayList15.add(tL_help_support.user);
                MessagesStorage.getInstance(i34).putUsersAndChats(arrayList15, null, true, true);
                MessagesController.getInstance(i34).putUser(tL_help_support.user, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.f22527id);
                o2Var3.presentFragment(new qn(bundle));
                return;
            case 21:
                wr.O((wr) this.f6469c, (TLObject) this.d, (TLRPC.InputPeer) this.f6470e, this.f6468b, (int[]) this.f6471f);
                return;
            case 22:
                fv0 fv0Var = (fv0) this.f6469c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.d;
                int i35 = this.f6468b;
                MessageObject messageObject2 = (MessageObject) this.f6470e;
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.f6471f;
                int[] iArr2 = fv0Var.f30847e;
                RLottieNative[] rLottieNativeArr = fv0Var.f28579b1;
                if (fv0Var.S0) {
                    AndroidUtilities.runOnUIThread(new dv0(fv0Var, 2));
                    return;
                }
                boolean z20 = false;
                int i36 = 0;
                while (i36 < rLottieNativeArr.length) {
                    if (rLottieNativeArr[i36] == null) {
                        if (i36 == 0) {
                            i10 = 1;
                        } else if (i36 == 1) {
                            i10 = 8;
                        } else if (i36 == 2) {
                            i10 = 14;
                        } else if (i36 == 3) {
                            i10 = 20;
                        } else {
                            i10 = 2;
                        }
                        if (i10 < tL_messages_stickerSet2.documents.size()) {
                            TLRPC.Document document = tL_messages_stickerSet2.documents.get(i10);
                            String readRes = AndroidUtilities.readRes(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), 0);
                            if (TextUtils.isEmpty(readRes)) {
                                tL_messages_stickerSet = tL_messages_stickerSet2;
                                int i37 = i35;
                                i11 = i37;
                                t1Var = t1Var2;
                                AndroidUtilities.runOnUIThread(new ev0(document, i37, messageObject2, t1Var2, tL_messages_stickerSet, 1));
                                z20 = true;
                            } else {
                                tL_messages_stickerSet = tL_messages_stickerSet2;
                                i11 = i35;
                                t1Var = t1Var2;
                                rLottieNativeArr[i36] = RLottieNative.b(readRes, "dice", iArr2, null, null);
                                fv0Var.f28580c1[i36] = iArr2[0];
                            }
                            i36++;
                            t1Var2 = t1Var;
                            i35 = i11;
                            tL_messages_stickerSet2 = tL_messages_stickerSet;
                        }
                    }
                    tL_messages_stickerSet = tL_messages_stickerSet2;
                    i11 = i35;
                    t1Var = t1Var2;
                    i36++;
                    t1Var2 = t1Var;
                    i35 = i11;
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                int i38 = i35;
                org.telegram.ui.Cells.t1 t1Var3 = t1Var2;
                if (z20) {
                    AndroidUtilities.runOnUIThread(new dv0(fv0Var, 3));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new rl(fv0Var, i38, t1Var3, 18));
                    return;
                }
            case 23:
                LaunchActivity launchActivity = (LaunchActivity) this.f6469c;
                TLObject tLObject3 = (TLObject) this.d;
                Uri uri = (Uri) this.f6470e;
                int i39 = this.f6468b;
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) this.f6471f;
                Pattern pattern = LaunchActivity.f35493x1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject3 != null && launchActivity.m0 != null) {
                        TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject3;
                        Bundle i40 = aa.d.i("onlySelect", true);
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
                                        z15 = true;
                                    }
                                } else {
                                    z15 = false;
                                }
                            }
                            if (!z15) {
                                Iterator<String> it2 = MessagesController.getInstance(i39).exportGroupUri.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (uri2.contains(it2.next())) {
                                            i40.putInt("dialogsType", 11);
                                            z15 = true;
                                        }
                                    }
                                }
                                if (!z15) {
                                    i40.putInt("dialogsType", 13);
                                }
                            }
                        }
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().f36157s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                            PhotoViewer.t1().F0(false, true);
                        } else if (org.telegram.ui.l4.I() && org.telegram.ui.l4.x().R) {
                            org.telegram.ui.l4.x().o(false, true);
                        }
                        wb.x();
                        o50 o50Var = o50.f40880z3;
                        if (o50Var != null) {
                            o50Var.dismiss();
                        }
                        if (AndroidUtilities.isTablet()) {
                            launchActivity.m0.U(true, true);
                            launchActivity.f35522o0.U(true, true);
                        }
                        dy dyVar = new dy(i40);
                        dyVar.f37752y2 = launchActivity;
                        if (!AndroidUtilities.isTablet() ? !(launchActivity.m0.getFragmentStack().size() <= 1 || !(launchActivity.m0.getFragmentStack().get(launchActivity.m0.getFragmentStack().size() - 1) instanceof ng0)) : !(launchActivity.f35520n0.getFragmentStack().isEmpty() || !(launchActivity.f35520n0.getFragmentStack().get(launchActivity.f35520n0.getFragmentStack().size() - 1) instanceof ng0))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        ((ActionBarLayout) launchActivity.O()).S(dyVar, z16, false);
                    } else {
                        if (launchActivity.S == null) {
                            launchActivity.S = new ArrayList();
                        }
                        launchActivity.S.add(0, launchActivity.T);
                        launchActivity.T = null;
                        launchActivity.i0(true);
                    }
                    try {
                        c2Var3.dismiss();
                        return;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        return;
                    }
                }
                return;
            case 24:
                TLObject tLObject4 = (TLObject) this.d;
                int i41 = this.f6468b;
                String str4 = (String) this.f6470e;
                x20 x20Var = (x20) this.f6471f;
                org.telegram.ui.ActionBar.o2 o2Var4 = (org.telegram.ui.ActionBar.o2) j3.r0.j(1, ((LaunchActivity) this.f6469c).Z);
                try {
                    if (tLObject4 instanceof TL_chatlists.chatlist_ChatlistInvite) {
                        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject4;
                        boolean z21 = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
                        if (z21) {
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
                        if (z21 && ((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                            a02 = oc.a0(o2Var4);
                            i12 = R.string.NoFolderFound;
                        } else {
                            ?? saVar = new sa(o2Var4, false);
                            saVar.U = -1;
                            saVar.Y = "";
                            saVar.Z = new ArrayList();
                            saVar.f30959b0 = "";
                            saVar.f30961d0 = new ArrayList();
                            ArrayList arrayList16 = new ArrayList();
                            saVar.f30962e0 = arrayList16;
                            saVar.f30978v0 = -1;
                            saVar.f30981y0 = -5;
                            saVar.T = str4;
                            saVar.V = chatlist_chatlistinvite;
                            arrayList16.clear();
                            if (z21) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                saVar.Y = tL_textWithEntities.text;
                                saVar.Z = tL_textWithEntities.entities;
                                saVar.f30958a0 = tL_chatlists_chatlistInvite2.title_noanimate;
                                saVar.f30960c0 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                saVar.f30960c0 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                saVar.f30963f0 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                saVar.U = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList<MessagesController.DialogFilter> arrayList17 = o2Var4.getMessagesController().dialogFilters;
                                if (arrayList17 != null) {
                                    while (true) {
                                        if (i15 < arrayList17.size()) {
                                            MessagesController.DialogFilter dialogFilter = arrayList17.get(i15);
                                            if (dialogFilter.f19649id == saVar.U) {
                                                saVar.Y = dialogFilter.name;
                                                saVar.Z = dialogFilter.entities;
                                                saVar.f30958a0 = dialogFilter.title_noanimate;
                                            } else {
                                                i15++;
                                            }
                                        }
                                    }
                                }
                            }
                            saVar.R();
                            o2Var4.showDialog(saVar);
                            x20Var.run();
                            return;
                        }
                    } else {
                        a02 = oc.a0(o2Var4);
                        i12 = R.string.NoFolderFound;
                    }
                    x20Var.run();
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
                ll.p(i12, a02, null);
                break;
            case 25:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f6469c;
                x20 x20Var2 = (x20) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f6470e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f6471f;
                int i42 = this.f6468b;
                ArrayList arrayList18 = launchActivity2.Z;
                if (!launchActivity2.isFinishing()) {
                    try {
                        x20Var2.run();
                    } catch (Exception e13) {
                        FileLog.e(e13);
                    }
                    if (tL_error2 == null) {
                        if (launchActivity2.m0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                            TLRPC.Chat chat5 = updates2.chats.get(0);
                            chat5.left = false;
                            chat5.kicked = false;
                            MessagesController.getInstance(i42).putUsers(updates2.users, false);
                            MessagesController.getInstance(i42).putChats(updates2.chats, false);
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chat5.f22380id);
                            if (arrayList18.isEmpty() || MessagesController.getInstance(i42).checkCanOpenChat(bundle2, (org.telegram.ui.ActionBar.o2) j3.r0.j(1, arrayList18))) {
                                qn qnVar2 = new qn(bundle2);
                                NotificationCenter.getInstance(i42).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                                ((ActionBarLayout) launchActivity2.O()).S(qnVar2, false, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity2);
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                    if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.FloodWait);
                    } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.JoinToGroupErrorFull);
                    } else {
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.JoinToGroupErrorNotExist);
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    launchActivity2.B0(alertDialog$Builder);
                    return;
                }
                return;
            case 26:
                of0 of0Var = (of0) this.f6469c;
                String str5 = (String) this.d;
                String str6 = (String) this.f6470e;
                String str7 = (String) this.f6471f;
                int i43 = this.f6468b;
                ArrayList arrayList19 = new ArrayList();
                b9.c cVar = new b9.c();
                cVar.f1663c = "inapp";
                cVar.f1662b = str5;
                arrayList19.add(cVar.a());
                FileLog.d("LoginBilling querying \"" + str5 + "\" product");
                BillingController.getInstance().queryProductDetails(arrayList19, new z2(of0Var, str5, str6, str7, i43));
                return;
            case 27:
                int i44 = this.f6468b;
                z8 z8Var5 = (z8) this.d;
                TLRPC.User user4 = (TLRPC.User) this.f6470e;
                ((int[]) this.f6469c)[0] = i44;
                z8Var5.r(user4);
                ((o9) this.f6471f).e(user4, z8Var5);
                return;
            case 28:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.f6469c;
                int i45 = this.f6468b;
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f6470e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f6471f;
                if (((TLObject) this.d) instanceof TLRPC.TL_boolTrue) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.y0.u(i45, v0Var, "write_access_requested", jSONObject);
                        return;
                    } catch (Exception e14) {
                        FileLog.e(e14);
                        return;
                    }
                } else if (tL_error3 != null) {
                    y0Var.S(tL_error3.text);
                    return;
                } else {
                    String[] strArr = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(y0Var.getContext());
                    alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.BotWebViewRequestWriteTitle);
                    alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.BotWebViewRequestWriteMessage);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.BotWebViewRequestAllow), new ei1(2, y0Var, strArr));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new fk0(12));
                    y0Var.R(3, alertDialog$Builder2.f22702a, new org.telegram.ui.web.w(strArr, i45, v0Var, 1));
                    return;
                }
            default:
                yf.m2 m2Var = (yf.m2) this.f6469c;
                int i46 = this.f6468b;
                List list = (List) this.d;
                ArrayList arrayList20 = (ArrayList) this.f6470e;
                mq0 mq0Var = (mq0) this.f6471f;
                if (m2Var.E != null && !m2Var.f50004y) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / m2Var.E.getWidth(), 1.0f / m2Var.E.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i46);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i46 / 90) % 2 != 0) {
                        matrix.postScale(m2Var.E.getHeight(), m2Var.E.getWidth());
                    } else {
                        matrix.postScale(m2Var.E.getWidth(), m2Var.E.getHeight());
                    }
                    if (list.isEmpty()) {
                        yf.j2 j2Var = new yf.j2(m2Var);
                        j2Var.h.set(0.0f, 0.0f, m2Var.E.getWidth(), m2Var.E.getHeight());
                        j2Var.f49883i.set(j2Var.h);
                        matrix.mapRect(j2Var.f49883i);
                        j2Var.f49879c = i46;
                        Bitmap d = m2Var.d(m2Var.E, 0, 0, false);
                        j2Var.d = d;
                        if (d == null) {
                            FileLog.e(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"));
                            return;
                        }
                        j2Var.f49881f = j2Var.c();
                        yf.m2.c(j2Var, m2Var.P, m2Var.Q);
                        m2Var.K = j2Var.f49884j;
                        m2Var.L = j2Var.f49885k;
                        arrayList20.add(j2Var);
                        AndroidUtilities.runOnUIThread(new ir0(m2Var, arrayList20, mq0Var, j2Var, 25));
                        m2Var.A = j2Var;
                        m2Var.f50004y = true;
                        m2Var.f50003x = false;
                        return;
                    }
                    for (int i47 = 0; i47 < list.size(); i47++) {
                        yf.l2 l2Var = (yf.l2) list.get(i47);
                        yf.j2 j2Var2 = new yf.j2(m2Var);
                        j2Var2.h.set(l2Var.f49969b, l2Var.f49970c, i13 + l2Var.d, i14 + l2Var.f49971e);
                        j2Var2.f49883i.set(j2Var2.h);
                        matrix.mapRect(j2Var2.f49883i);
                        j2Var2.f49879c = i46;
                        Bitmap d9 = m2Var.d(l2Var.f49968a, l2Var.f49969b, l2Var.f49970c, false);
                        j2Var2.d = d9;
                        if (d9 != null) {
                            j2Var2.f49881f = j2Var2.c();
                            yf.m2.c(j2Var2, m2Var.P, m2Var.Q);
                            m2Var.K = j2Var2.f49884j;
                            m2Var.L = j2Var2.f49885k;
                            arrayList20.add(j2Var2);
                        }
                    }
                    m2Var.A = null;
                    m2Var.f50004y = true;
                    m2Var.f50003x = false;
                    AndroidUtilities.runOnUIThread(new xf.o0(6, m2Var, arrayList20));
                    return;
                }
                return;
        }
    }

    public g1(Object obj, int i9, Object obj2, Object obj3, Object obj4, int i10) {
        this.f6467a = i10;
        this.f6469c = obj;
        this.f6468b = i9;
        this.d = obj2;
        this.f6470e = obj3;
        this.f6471f = obj4;
    }

    public g1(Object obj, Object obj2, int i9, Object obj3, Object obj4, int i10) {
        this.f6467a = i10;
        this.f6469c = obj;
        this.d = obj2;
        this.f6468b = i9;
        this.f6470e = obj3;
        this.f6471f = obj4;
    }

    public g1(Object obj, Object obj2, Object obj3, int i9, Object obj4, int i10) {
        this.f6467a = i10;
        this.f6469c = obj;
        this.d = obj2;
        this.f6470e = obj3;
        this.f6468b = i9;
        this.f6471f = obj4;
    }

    public g1(Object obj, Object obj2, Object obj3, Object obj4, int i9, int i10) {
        this.f6467a = i10;
        this.f6469c = obj;
        this.d = obj2;
        this.f6470e = obj3;
        this.f6471f = obj4;
        this.f6468b = i9;
    }

    public g1(TLObject tLObject, boolean[] zArr, Utilities.Callback callback, int i9, TL_account.updateEmojiStatus updateemojistatus) {
        this.f6467a = 3;
        this.f6469c = tLObject;
        this.d = zArr;
        this.f6471f = callback;
        this.f6468b = i9;
        this.f6470e = updateemojistatus;
    }
}
