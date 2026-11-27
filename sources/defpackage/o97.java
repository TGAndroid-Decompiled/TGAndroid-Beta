package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class o97 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public o97(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        boolean z;
        ConcurrentHashMap concurrentHashMap;
        boolean z2;
        TLRPC.User user;
        uc7 uc7Var;
        d31 Y;
        SpannableStringBuilder S2;
        SpannableStringBuilder S22;
        boolean z3;
        rv0 rv0Var;
        TLRPC.TL_webPage tL_webPage;
        boolean z4;
        byte b = this.a;
        TLRPC.User user2 = null;
        boolean z5 = true;
        boolean z6 = false;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                uc7 uc7Var2 = (uc7) obj4;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) obj3;
                zh6 zh6Var = (zh6) obj2;
                zh6 zh6Var2 = (zh6) obj;
                if (!updates_difference.new_messages.isEmpty() || !updates_difference.new_encrypted_messages.isEmpty()) {
                    zh6 zh6Var3 = new zh6();
                    for (int i = 0; i < updates_difference.new_encrypted_messages.size(); i++) {
                        ArrayList g = uc7Var2.getSecretChatHelper().g(updates_difference.new_encrypted_messages.get(i));
                        if (g != null && !g.isEmpty()) {
                            updates_difference.new_messages.addAll(g);
                        }
                    }
                    in5.S(updates_difference.new_messages);
                    ArrayList arrayList = new ArrayList();
                    long e = uc7Var2.getUserConfig().e();
                    int i2 = 0;
                    while (i2 < updates_difference.new_messages.size()) {
                        TLRPC.Message message = updates_difference.new_messages.get(i2);
                        if (!(message instanceof TLRPC.TL_messageEmpty)) {
                            r47.B0(message);
                            if (!wf3.B(message.dialog_id)) {
                                TLRPC.MessageAction messageAction = message.action;
                                if ((messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) && (user = (TLRPC.User) zh6Var.f(messageAction.user_id)) != null && user.bot) {
                                    message.reply_markup = new TLRPC.TL_replyKeyboardHide();
                                    message.flags |= 64;
                                }
                                TLRPC.MessageAction messageAction2 = message.action;
                                if (!(messageAction2 instanceof TLRPC.TL_messageActionChatMigrateTo) && !(messageAction2 instanceof TLRPC.TL_messageActionChannelCreate)) {
                                    if (message.out) {
                                        concurrentHashMap = uc7Var2.Q;
                                    } else {
                                        concurrentHashMap = uc7Var2.P;
                                    }
                                    Integer num = (Integer) concurrentHashMap.get(Long.valueOf(message.dialog_id));
                                    if (num == null) {
                                        num = Integer.valueOf(uc7Var2.getMessagesStorage().U(message.dialog_id, message.out));
                                        concurrentHashMap.put(Long.valueOf(message.dialog_id), num);
                                    }
                                    if (num.intValue() < message.id) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    message.unread = z2;
                                    z = false;
                                } else {
                                    z = z6;
                                    message.unread = z;
                                    message.media_unread = z;
                                }
                            } else {
                                z = z6;
                            }
                            long j = message.dialog_id;
                            if (j == e) {
                                message.unread = z;
                                message.media_unread = z;
                                message.out = true;
                            }
                            boolean contains = uc7Var2.l0.contains(Long.valueOf(j));
                            r47 r47Var = new r47(uc7Var2.currentAccount, message, zh6Var, zh6Var2, contains, contains);
                            TLRPC.Message message2 = r47Var.k;
                            if ((!message2.out || message2.from_scheduled) && r47Var.E4()) {
                                arrayList.add(r47Var);
                            }
                            ArrayList arrayList2 = (ArrayList) zh6Var3.f(message.dialog_id);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                zh6Var3.k(message.dialog_id, arrayList2);
                            }
                            arrayList2.add(r47Var);
                        }
                        i2++;
                        z6 = false;
                    }
                    uc7Var2.getMessagesStorage().a.c(new oy6(uc7Var2, arrayList, updates_difference, zh6Var3));
                    uc7Var2.getSecretChatHelper().m();
                }
                if (!updates_difference.other_updates.isEmpty()) {
                    uc7Var = uc7Var2;
                    uc7Var.X3(updates_difference.other_updates, updates_difference.users, updates_difference.chats, true, 0);
                } else {
                    uc7Var = uc7Var2;
                }
                if (updates_difference instanceof TLRPC.TL_updates_difference) {
                    uc7Var.Y1 = false;
                    uc7Var.getMessagesStorage().M1(updates_difference.state.seq);
                    uc7Var.getMessagesStorage().J1(updates_difference.state.date);
                    uc7Var.getMessagesStorage().K1(updates_difference.state.pts);
                    uc7Var.getMessagesStorage().L1(updates_difference.state.qts);
                    cc4.b("received difference: isUpdating = false");
                    uc7Var.getConnectionsManager().setIsUpdating(false);
                    for (int i3 = 0; i3 < 3; i3++) {
                        uc7Var.Z3(i3, 1);
                    }
                } else if (updates_difference instanceof TLRPC.TL_updates_differenceSlice) {
                    uc7Var.getMessagesStorage().J1(updates_difference.intermediate_state.date);
                    uc7Var.getMessagesStorage().K1(updates_difference.intermediate_state.pts);
                    uc7Var.getMessagesStorage().L1(updates_difference.intermediate_state.qts);
                } else if (updates_difference instanceof TLRPC.TL_updates_differenceEmpty) {
                    uc7Var.Y1 = false;
                    uc7Var.getMessagesStorage().M1(updates_difference.seq);
                    uc7Var.getMessagesStorage().J1(updates_difference.date);
                    uc7Var.getConnectionsManager().setIsUpdating(false);
                    cc4.b("received differenceEmpty: isUpdating = false");
                    for (int i4 = 0; i4 < 3; i4++) {
                        uc7Var.Z3(i4, 1);
                    }
                }
                kf7 messagesStorage = uc7Var.getMessagesStorage();
                kf7 messagesStorage2 = uc7Var.getMessagesStorage();
                messagesStorage2.I();
                int i5 = messagesStorage2.w;
                kf7 messagesStorage3 = uc7Var.getMessagesStorage();
                messagesStorage3.I();
                int i6 = messagesStorage3.r;
                kf7 messagesStorage4 = uc7Var.getMessagesStorage();
                messagesStorage4.I();
                int i7 = messagesStorage4.n;
                kf7 messagesStorage5 = uc7Var.getMessagesStorage();
                messagesStorage5.I();
                messagesStorage.B1(i5, i6, i7, messagesStorage5.s);
                if (f11.a) {
                    StringBuilder sb = new StringBuilder("received difference with date = ");
                    kf7 messagesStorage6 = uc7Var.getMessagesStorage();
                    messagesStorage6.I();
                    sb.append(messagesStorage6.n);
                    sb.append(" pts = ");
                    kf7 messagesStorage7 = uc7Var.getMessagesStorage();
                    messagesStorage7.I();
                    sb.append(messagesStorage7.r);
                    sb.append(" seq = ");
                    kf7 messagesStorage8 = uc7Var.getMessagesStorage();
                    messagesStorage8.I();
                    sb.append(messagesStorage8.w);
                    sb.append(" messages = ");
                    sb.append(updates_difference.new_messages.size());
                    sb.append(" users = ");
                    sb.append(updates_difference.users.size());
                    sb.append(" chats = ");
                    sb.append(updates_difference.chats.size());
                    sb.append(" other updates = ");
                    sb.append(updates_difference.other_updates.size());
                    cc4.b(sb.toString());
                    return;
                }
                return;
            case 1:
                uc7 uc7Var3 = (uc7) obj4;
                jj.c0(uc7Var3.currentAccount, (TLRPC.TL_error) obj3, (e) obj2, (TLRPC.TL_messages_createChat) obj, new Object[0]);
                uc7Var3.getNotificationCenter().k(30, new Object[0]);
                return;
            case 2:
                uc7 uc7Var4 = (uc7) obj4;
                jj.c0(uc7Var4.currentAccount, (TLRPC.TL_error) obj3, (e) obj2, (TLRPC.TL_channels_createChannel) obj, new Object[0]);
                uc7Var4.getNotificationCenter().k(30, new Object[0]);
                return;
            case 3:
                jj.c0(((uc7) obj4).currentAccount, (TLRPC.TL_error) obj3, (e) obj2, (TLRPC.TL_messages_editChatAdmin) obj, Boolean.FALSE);
                return;
            case 4:
                o6a o6aVar = (o6a) obj;
                if (wp0.b(((r7a) obj4).currentAccount).a((TLRPC.TL_messages_forwardMessages) obj3, (ArrayList) obj2, o6aVar)) {
                    o6aVar.run();
                    return;
                }
                return;
            case 5:
                String str = "https://t.me/addstyle/" + ((TL_aicompose.TL_aiComposeTone) obj3).slug;
                new w((b1) obj4, (Context) obj2, str, str, (vnb) obj).show();
                return;
            case 6:
                int[] iArr = (int[]) obj4;
                int[] iArr2 = (int[]) obj3;
                String[] strArr = (String[]) obj2;
                ?? r9 = (TextView) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) ob6.M0(2131748260, null));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i8 = 0;
                while (true) {
                    if (i8 < iArr.length) {
                        if (iArr2[0] == iArr[i8]) {
                            spannableStringBuilder.append((CharSequence) strArr[i8]);
                            spannableStringBuilder.setSpan(new y7c(hl.o()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i8++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (yac.h(yac.t0).p()) {
                    wm2 wm2Var = new wm2(2131230873, 0);
                    wm2Var.H = 0.7f;
                    wm2Var.r = hl.L(-1.33f);
                    wm2Var.s = hl.L(0.0f);
                    wm2Var.x = 0.75f;
                    spannableStringBuilder.setSpan(wm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    wm2 wm2Var2 = new wm2(2131231980, 0);
                    wm2Var2.H = 0.7f;
                    wm2Var2.r = hl.L(-1.33f);
                    wm2Var2.s = hl.L(0.0f);
                    wm2Var2.x = 0.75f;
                    spannableStringBuilder.setSpan(wm2Var2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                r9.setText(spannableStringBuilder);
                return;
            case 7:
                ij ijVar = (ij) obj4;
                sa saVar = (sa) obj3;
                id[] idVarArr = (id[]) obj2;
                View view = (View) obj;
                String trim = ijVar.getText().toString().trim();
                Uri parse = Uri.parse(trim);
                if (parse == null || parse.getHost() == null) {
                    parse = Uri.parse("https://" + trim);
                }
                if (parse != null && parse.getHost() != null) {
                    String lowerCase = parse.getHost().toLowerCase();
                    if (lowerCase.startsWith("www.")) {
                        lowerCase = lowerCase.substring(4);
                    }
                    saVar.a(lowerCase);
                    id idVar = idVarArr[0];
                    if (idVar != null) {
                        idVar.dismiss();
                    }
                    if (view != null) {
                        view.requestFocus();
                        return;
                    }
                    return;
                }
                hl.z3(ijVar);
                return;
            case 8:
                boolean[] zArr = (boolean[]) obj4;
                y41[] y41VarArr = (y41[]) obj3;
                jx8 jx8Var = (jx8) obj2;
                LaunchActivity launchActivity = (LaunchActivity) obj;
                if (!zArr[0]) {
                    es6 es6Var = new es6(zArr, y41VarArr, jx8Var, (byte) 8);
                    SharedPreferences e1 = uc7.e1();
                    if (e1.getBoolean("proxycheckstatusip", false)) {
                        es6Var.run();
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                    String M0 = ob6.M0(2131746335, null);
                    id idVar2 = alertDialog$Builder.a;
                    idVar2.S = M0;
                    idVar2.U = ob6.M0(2131746334, null);
                    alertDialog$Builder.j(ob6.M0(2131746472, null), new o(e1, es6Var, (byte) 11));
                    ik8.y(null, 2131752570, alertDialog$Builder, null);
                    return;
                }
                return;
            case 9:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                pcc pccVar = (pcc) obj3;
                TLObject tLObject = (TLObject) obj2;
                pcc pccVar2 = (pcc) obj;
                if (tL_error != null) {
                    pccVar.a(tL_error);
                    return;
                } else if (tLObject instanceof TLRPC.payments_GiveawayInfo) {
                    pccVar2.a((TLRPC.payments_GiveawayInfo) tLObject);
                    return;
                } else {
                    return;
                }
            case 10:
                lo0 lo0Var = (lo0) obj4;
                CountDownLatch countDownLatch = (CountDownLatch) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                bo0 bo0Var = (bo0) obj;
                ArrayList arrayList3 = lo0Var.Y;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                if (tLObject2 != null) {
                    lo0Var.m0 = (byte) 20;
                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                    uc7.s1(lo0Var.T).j4(tL_premium_boostsList.users, false);
                    lo0Var.l0 = tL_premium_boostsList.next_offset;
                    arrayList3.addAll(tL_premium_boostsList.boosts);
                    int size = arrayList3.size();
                    int i9 = 0;
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj5 = arrayList3.get(i10);
                        i10++;
                        int i11 = ((TL_stories.Boost) obj5).multiplier;
                        if (i11 <= 0) {
                            i11 = 1;
                        }
                        i9 += i11;
                    }
                    lo0Var.c0 = Math.max(0, tL_premium_boostsList.count - i9);
                    lo0Var.b0 = (TextUtils.isEmpty(tL_premium_boostsList.next_offset) || lo0Var.c0 <= 0) ? false : false;
                    lo0Var.o0 = tL_premium_boostsList.count;
                    if (bo0Var != null) {
                        bo0Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                lo0 lo0Var2 = (lo0) obj4;
                CountDownLatch countDownLatch2 = (CountDownLatch) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                bo0 bo0Var2 = (bo0) obj;
                ArrayList arrayList4 = lo0Var2.X;
                if (countDownLatch2 != null) {
                    countDownLatch2.countDown();
                }
                if (tLObject3 != null) {
                    lo0Var2.n0 = (byte) 20;
                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                    uc7.s1(lo0Var2.T).j4(tL_premium_boostsList2.users, false);
                    lo0Var2.k0 = tL_premium_boostsList2.next_offset;
                    arrayList4.addAll(tL_premium_boostsList2.boosts);
                    int size2 = arrayList4.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj6 = arrayList4.get(i13);
                        i13++;
                        int i14 = ((TL_stories.Boost) obj6).multiplier;
                        if (i14 <= 0) {
                            i14 = 1;
                        }
                        i12 += i14;
                    }
                    lo0Var2.a0 = Math.max(0, tL_premium_boostsList2.count - i12);
                    lo0Var2.Z = (TextUtils.isEmpty(tL_premium_boostsList2.next_offset) || lo0Var2.a0 <= 0) ? false : false;
                    lo0Var2.p0 = tL_premium_boostsList2.count;
                    if (bo0Var2 != null) {
                        bo0Var2.run();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                TLObject tLObject4 = (TLObject) obj4;
                ArrayList arrayList5 = (ArrayList) obj3;
                String str2 = (String) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                e S = LaunchActivity.S();
                if (S != null) {
                    Y = d31.b0(S);
                } else {
                    Y = d31.Y();
                }
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    if (arrayList5.size() == 1) {
                        S22 = hl.S2(ob6.a0(null, null, 2131753052, lbc.r((TLRPC.User) arrayList5.get(0)), str2));
                    } else {
                        S22 = hl.S2(ob6.G(arrayList5.size(), "BotInviteDoneMany", str2));
                    }
                    Y.V(arrayList5, S22, null, null).j();
                    return;
                }
                if (tL_error2 != null) {
                    if ("BOT_INVITE_ALREADY_STARTED".equals(tL_error2.text)) {
                        if (arrayList5.size() == 1) {
                            S2 = hl.S2(ob6.a0(null, null, 2131753048, lbc.r((TLRPC.User) arrayList5.get(0)), str2));
                        } else {
                            S2 = hl.S2(ob6.a0(null, null, 2131753047, str2));
                        }
                        Y.t(S2, null).j();
                        return;
                    }
                    String str3 = tL_error2.text;
                    if (str3 != null && !str3.startsWith("BOT_INVITE_")) {
                        Y.Z(tL_error2).j();
                        return;
                    }
                }
                Y.t(hl.S2(ob6.a0(null, null, 2131753046, str2)), null).j();
                return;
            case 13:
                zs0 zs0Var = (zs0) obj4;
                TLObject tLObject5 = (TLObject) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                pz pzVar = zs0Var.n;
                at0 at0Var = zs0Var.r;
                if (!at0Var.P) {
                    zs0Var.e = false;
                    if (tLObject5 instanceof TL_stars.StarsStatus) {
                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject5;
                        uc7.s1(at0.k0(at0Var)).j4(starsStatus.users, false);
                        uc7.s1(at0.a0(at0Var)).c4(starsStatus.chats, false);
                        if ((starsStatus.flags & 1) != 0 && starsStatus.next_offset != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3 && TextUtils.equals(str4, starsStatus.next_offset)) {
                            zs0Var.h = true;
                        } else {
                            zs0Var.b.addAll(starsStatus.history);
                            zs0Var.d = starsStatus.next_offset;
                            zs0Var.f = !z3;
                        }
                    } else {
                        zs0Var.h = true;
                        if (tL_error3 != null) {
                            d31.e0(tL_error3);
                        }
                    }
                    zs0Var.c.g3.O(false);
                    zs0Var.removeCallbacks(pzVar);
                    zs0Var.post(pzVar);
                    return;
                }
                return;
            case 14:
                nx0 nx0Var = (nx0) obj2;
                qt0 qt0Var = (qt0) obj;
                ((c51) obj4).setLoading(false);
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    nx0Var.dismiss();
                    qt0Var.a(Boolean.FALSE);
                    return;
                }
                return;
            case 15:
                nv0 nv0Var = (nv0) obj4;
                pv0 pv0Var = (pv0) obj3;
                String str5 = (String) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                if (nv0Var.c && ((rv0Var = nv0Var.R) == null || !rv0Var.m(pv0Var))) {
                    cc4.b("notifyEvent " + str5 + " dropped after document change");
                    return;
                }
                nv0Var.c("window.Telegram.WebView.receiveEvent('" + str5 + "', " + jSONObject + ");");
                return;
            case 16:
                r41 r41Var = (r41) obj4;
                TLObject tLObject6 = (TLObject) obj3;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj2;
                fw1 fw1Var = (fw1) obj;
                ArrayList arrayList6 = r41Var.b;
                if (tLObject6 instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject6;
                    int indexOf = arrayList6.indexOf(tL_businessChatLink);
                    if (indexOf != -1) {
                        arrayList6.set(indexOf, tL_businessChatLink2);
                        jn7.f(r41Var.a).k(126, new Object[0]);
                        if (fw1Var != null) {
                            fw1Var.run();
                        }
                        r41Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 17:
                r61 r61Var = (r61) obj4;
                ((tt) obj3).e(((float[]) obj2)[0]);
                if (((boolean[]) obj)[0]) {
                    r61Var.d.A0(true);
                    return;
                }
                return;
            case 18:
                r61 r61Var2 = (r61) obj4;
                long[] jArr = (long[]) obj2;
                q61 q61Var = (q61) obj;
                if (!((boolean[]) obj3)[0]) {
                    jArr[0] = System.currentTimeMillis();
                    r61Var2.d.showDialog(q61Var);
                    return;
                }
                return;
            case 19:
                ((j81) obj4).u0((TLRPC.TL_error) obj3, (TLObject) obj2, (Calendar) obj);
                return;
            case 20:
                CameraController.lambda$openRound$9((CameraSession) obj4, (Runnable) obj3, (SurfaceTexture) obj2, (Runnable) obj);
                return;
            case 21:
                CameraController.lambda$close$5((Runnable) obj4, (CameraSession) obj3, (CountDownLatch) obj2, (Runnable) obj);
                return;
            case 22:
                ((ve1) obj4).i0((id) obj3, (TLRPC.TL_error) obj2, (TL_account.updateUsername) obj);
                return;
            case 23:
                ((ng1) obj4).H0((Context) obj3, (TLRPC.User) obj2, (TL_payments.connectedBotStarRef) obj);
                return;
            case 24:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj4;
                hl.g(connectedbotstarref.url);
                new d31(((nx0) obj3).F, (vnb) obj2).I(2131623994, ob6.M0(2131754326, null), hl.S2(ob6.a0(null, null, 2131754327, cc.J0(connectedbotstarref.commission_permille), lbc.r((TLRPC.User) obj)))).j();
                return;
            case 25:
                tg1 tg1Var = (tg1) obj4;
                CountDownLatch countDownLatch3 = (CountDownLatch) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                qg1 qg1Var = (qg1) obj;
                ArrayList arrayList7 = tg1Var.h;
                if (countDownLatch3 != null) {
                    countDownLatch3.countDown();
                }
                if (tLObject7 != null) {
                    tg1Var.N = (byte) 20;
                    TL_stories.TL_premium_boostsList tL_premium_boostsList3 = (TL_stories.TL_premium_boostsList) tLObject7;
                    uc7.s1(tg1Var.b).j4(tL_premium_boostsList3.users, false);
                    tg1Var.K = tL_premium_boostsList3.next_offset;
                    arrayList7.addAll(tL_premium_boostsList3.boosts);
                    int size3 = arrayList7.size();
                    int i15 = 0;
                    int i16 = 0;
                    while (i16 < size3) {
                        Object obj7 = arrayList7.get(i16);
                        i16++;
                        int i17 = ((TL_stories.Boost) obj7).multiplier;
                        if (i17 <= 0) {
                            i17 = 1;
                        }
                        i15 += i17;
                    }
                    tg1Var.s = Math.max(0, tL_premium_boostsList3.count - i15);
                    tg1Var.r = (TextUtils.isEmpty(tL_premium_boostsList3.next_offset) || tg1Var.s <= 0) ? false : false;
                    tg1Var.P = tL_premium_boostsList3.count;
                    if (qg1Var != null) {
                        qg1Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                tg1 tg1Var2 = (tg1) obj4;
                CountDownLatch countDownLatch4 = (CountDownLatch) obj3;
                TLObject tLObject8 = (TLObject) obj2;
                qg1 qg1Var2 = (qg1) obj;
                ArrayList arrayList8 = tg1Var2.n;
                if (countDownLatch4 != null) {
                    countDownLatch4.countDown();
                }
                if (tLObject8 != null) {
                    tg1Var2.M = (byte) 20;
                    TL_stories.TL_premium_boostsList tL_premium_boostsList4 = (TL_stories.TL_premium_boostsList) tLObject8;
                    uc7.s1(tg1Var2.b).j4(tL_premium_boostsList4.users, false);
                    tg1Var2.L = tL_premium_boostsList4.next_offset;
                    arrayList8.addAll(tL_premium_boostsList4.boosts);
                    int size4 = arrayList8.size();
                    int i18 = 0;
                    int i19 = 0;
                    while (i19 < size4) {
                        Object obj8 = arrayList8.get(i19);
                        i19++;
                        int i20 = ((TL_stories.Boost) obj8).multiplier;
                        if (i20 <= 0) {
                            i20 = 1;
                        }
                        i18 += i20;
                    }
                    tg1Var2.x = Math.max(0, tL_premium_boostsList4.count - i18);
                    tg1Var2.w = (TextUtils.isEmpty(tL_premium_boostsList4.next_offset) || tg1Var2.x <= 0) ? false : false;
                    tg1Var2.O = tL_premium_boostsList4.count;
                    if (qg1Var2 != null) {
                        qg1Var2.run();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                zu1 zu1Var = (zu1) obj4;
                e eVar = (e) obj3;
                r47 r47Var2 = (r47) obj2;
                wk5 wk5Var = (wk5) obj;
                if (eVar instanceof fn7) {
                    zu1Var.getNotificationCenter().n((fn7) eVar, 4);
                }
                zu1Var.getNotificationCenter().k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", r47Var2.k.action.channel_id);
                ((ActionBarLayout) wk5Var).b(wk5Var.getFragmentStack().size() - 1, new zu1(bundle));
                eVar.finishFragment();
                return;
            case 28:
                zu1 zu1Var2 = (zu1) obj4;
                TLObject tLObject9 = (TLObject) obj2;
                hu0 hu0Var = (hu0) obj;
                ((cq1) obj3).c(false);
                if (tLObject9 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject9;
                    zu1Var2.getMessagesController().j4(tL_contacts_resolvedPeer.users, false);
                    zu1Var2.getMessagesController().c4(tL_contacts_resolvedPeer.chats, false);
                    long n = wf3.n(tL_contacts_resolvedPeer.peer);
                    if (n >= 0) {
                        user2 = zu1Var2.getMessagesController().X1(Long.valueOf(n));
                    }
                }
                hu0Var.a(user2);
                return;
            default:
                zu1 zu1Var3 = (zu1) obj4;
                r47 r47Var3 = (r47) obj3;
                id idVar3 = (id) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                try {
                    tL_webPage = cl6.d(r47Var3);
                } catch (Throwable th) {
                    cc4.g(th, true);
                    tL_webPage = null;
                    user2 = th;
                }
                if (user2 == null && tL_webPage != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                hl.c3(new y6a(zu1Var3, idVar3, zArr2, z4, r47Var3, tL_webPage));
                return;
        }
    }
}
