package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class s67 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public s67(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
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
        na7 na7Var;
        u21 Y;
        SpannableStringBuilder S2;
        SpannableStringBuilder S22;
        boolean z3;
        hv0 hv0Var;
        byte b = this.a;
        TLRPC.User user2 = null;
        boolean z4 = true;
        boolean z5 = false;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                na7 na7Var2 = (na7) obj4;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) obj3;
                vf6 vf6Var = (vf6) obj2;
                vf6 vf6Var2 = (vf6) obj;
                if (!updates_difference.new_messages.isEmpty() || !updates_difference.new_encrypted_messages.isEmpty()) {
                    vf6 vf6Var3 = new vf6();
                    for (int i = 0; i < updates_difference.new_encrypted_messages.size(); i++) {
                        ArrayList g = na7Var2.getSecretChatHelper().g(updates_difference.new_encrypted_messages.get(i));
                        if (g != null && !g.isEmpty()) {
                            updates_difference.new_messages.addAll(g);
                        }
                    }
                    fl5.S(updates_difference.new_messages);
                    ArrayList arrayList = new ArrayList();
                    long e = na7Var2.getUserConfig().e();
                    int i2 = 0;
                    while (i2 < updates_difference.new_messages.size()) {
                        TLRPC.Message message = updates_difference.new_messages.get(i2);
                        if (!(message instanceof TLRPC.TL_messageEmpty)) {
                            k27.B0(message);
                            if (!cf3.B(message.dialog_id)) {
                                TLRPC.MessageAction messageAction = message.action;
                                if ((messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) && (user = (TLRPC.User) vf6Var.f(messageAction.user_id)) != null && user.bot) {
                                    message.reply_markup = new TLRPC.TL_replyKeyboardHide();
                                    message.flags |= 64;
                                }
                                TLRPC.MessageAction messageAction2 = message.action;
                                if (!(messageAction2 instanceof TLRPC.TL_messageActionChatMigrateTo) && !(messageAction2 instanceof TLRPC.TL_messageActionChannelCreate)) {
                                    if (message.out) {
                                        concurrentHashMap = na7Var2.Q;
                                    } else {
                                        concurrentHashMap = na7Var2.P;
                                    }
                                    Integer num = (Integer) concurrentHashMap.get(Long.valueOf(message.dialog_id));
                                    if (num == null) {
                                        num = Integer.valueOf(na7Var2.getMessagesStorage().S(message.dialog_id, message.out));
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
                                    z = z5;
                                    message.unread = z;
                                    message.media_unread = z;
                                }
                            } else {
                                z = z5;
                            }
                            long j = message.dialog_id;
                            if (j == e) {
                                message.unread = z;
                                message.media_unread = z;
                                message.out = true;
                            }
                            boolean contains = na7Var2.l0.contains(Long.valueOf(j));
                            k27 k27Var = new k27(na7Var2.currentAccount, message, vf6Var, vf6Var2, contains, contains);
                            TLRPC.Message message2 = k27Var.k;
                            if ((!message2.out || message2.from_scheduled) && k27Var.E4()) {
                                arrayList.add(k27Var);
                            }
                            ArrayList arrayList2 = (ArrayList) vf6Var3.f(message.dialog_id);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                vf6Var3.k(arrayList2, message.dialog_id);
                            }
                            arrayList2.add(k27Var);
                        }
                        i2++;
                        z5 = false;
                    }
                    na7Var2.getMessagesStorage().a.c(new jw6(na7Var2, arrayList, updates_difference, vf6Var3));
                    na7Var2.getSecretChatHelper().m();
                }
                if (!updates_difference.other_updates.isEmpty()) {
                    na7Var = na7Var2;
                    na7Var.Q3(updates_difference.other_updates, updates_difference.users, updates_difference.chats, true, 0);
                } else {
                    na7Var = na7Var2;
                }
                if (updates_difference instanceof TLRPC.TL_updates_difference) {
                    na7Var.Y1 = false;
                    na7Var.getMessagesStorage().H1(updates_difference.state.seq);
                    na7Var.getMessagesStorage().E1(updates_difference.state.date);
                    na7Var.getMessagesStorage().F1(updates_difference.state.pts);
                    na7Var.getMessagesStorage().G1(updates_difference.state.qts);
                    fa4.b("received difference: isUpdating = false");
                    na7Var.getConnectionsManager().setIsUpdating(false);
                    for (int i3 = 0; i3 < 3; i3++) {
                        na7Var.S3(i3, 1);
                    }
                } else if (updates_difference instanceof TLRPC.TL_updates_differenceSlice) {
                    na7Var.getMessagesStorage().E1(updates_difference.intermediate_state.date);
                    na7Var.getMessagesStorage().F1(updates_difference.intermediate_state.pts);
                    na7Var.getMessagesStorage().G1(updates_difference.intermediate_state.qts);
                } else if (updates_difference instanceof TLRPC.TL_updates_differenceEmpty) {
                    na7Var.Y1 = false;
                    na7Var.getMessagesStorage().H1(updates_difference.seq);
                    na7Var.getMessagesStorage().E1(updates_difference.date);
                    na7Var.getConnectionsManager().setIsUpdating(false);
                    fa4.b("received differenceEmpty: isUpdating = false");
                    for (int i4 = 0; i4 < 3; i4++) {
                        na7Var.S3(i4, 1);
                    }
                }
                ad7 messagesStorage = na7Var.getMessagesStorage();
                ad7 messagesStorage2 = na7Var.getMessagesStorage();
                messagesStorage2.G();
                int i5 = messagesStorage2.w;
                ad7 messagesStorage3 = na7Var.getMessagesStorage();
                messagesStorage3.G();
                int i6 = messagesStorage3.r;
                ad7 messagesStorage4 = na7Var.getMessagesStorage();
                messagesStorage4.G();
                int i7 = messagesStorage4.n;
                ad7 messagesStorage5 = na7Var.getMessagesStorage();
                messagesStorage5.G();
                messagesStorage.x1(i5, i6, i7, messagesStorage5.s);
                if (w01.a) {
                    StringBuilder sb = new StringBuilder("received difference with date = ");
                    ad7 messagesStorage6 = na7Var.getMessagesStorage();
                    messagesStorage6.G();
                    sb.append(messagesStorage6.n);
                    sb.append(" pts = ");
                    ad7 messagesStorage7 = na7Var.getMessagesStorage();
                    messagesStorage7.G();
                    sb.append(messagesStorage7.r);
                    sb.append(" seq = ");
                    ad7 messagesStorage8 = na7Var.getMessagesStorage();
                    messagesStorage8.G();
                    sb.append(messagesStorage8.w);
                    sb.append(" messages = ");
                    sb.append(updates_difference.new_messages.size());
                    sb.append(" users = ");
                    sb.append(updates_difference.users.size());
                    sb.append(" chats = ");
                    sb.append(updates_difference.chats.size());
                    sb.append(" other updates = ");
                    sb.append(updates_difference.other_updates.size());
                    fa4.b(sb.toString());
                    return;
                }
                return;
            case 1:
                na7 na7Var3 = (na7) obj4;
                ij.c0(na7Var3.currentAccount, (TLRPC.TL_error) obj3, (d) obj2, (TLRPC.TL_channels_createChannel) obj, new Object[0]);
                na7Var3.getNotificationCenter().k(29, new Object[0]);
                return;
            case 2:
                na7 na7Var4 = (na7) obj4;
                ij.c0(na7Var4.currentAccount, (TLRPC.TL_error) obj3, (d) obj2, (TLRPC.TL_messages_createChat) obj, new Object[0]);
                na7Var4.getNotificationCenter().k(29, new Object[0]);
                return;
            case 3:
                ij.c0(((na7) obj4).currentAccount, (TLRPC.TL_error) obj3, (d) obj2, (TLRPC.TL_messages_editChatAdmin) obj, Boolean.FALSE);
                return;
            case 4:
                m2a m2aVar = (m2a) obj;
                if (wp0.b(((z3a) obj4).currentAccount).a((TLRPC.TL_messages_forwardMessages) obj3, (ArrayList) obj2, m2aVar)) {
                    m2aVar.run();
                    return;
                }
                return;
            case 5:
                String str = "https://t.me/addstyle/" + ((TL_aicompose.TL_aiComposeTone) obj3).slug;
                new w((a1) obj4, (Context) obj2, str, str, (wjb) obj).show();
                return;
            case 6:
                hj hjVar = (hj) obj4;
                ra raVar = (ra) obj3;
                hd[] hdVarArr = (hd[]) obj2;
                View view = (View) obj;
                String trim = hjVar.getText().toString().trim();
                Uri parse = Uri.parse(trim);
                if (parse == null || parse.getHost() == null) {
                    parse = Uri.parse("https://" + trim);
                }
                if (parse != null && parse.getHost() != null) {
                    String lowerCase = parse.getHost().toLowerCase();
                    if (lowerCase.startsWith("www.")) {
                        lowerCase = lowerCase.substring(4);
                    }
                    raVar.a(lowerCase);
                    hd hdVar = hdVarArr[0];
                    if (hdVar != null) {
                        hdVar.dismiss();
                    }
                    if (view != null) {
                        view.requestFocus();
                        return;
                    }
                    return;
                }
                gl.z3(hjVar);
                return;
            case 7:
                int[] iArr = (int[]) obj4;
                int[] iArr2 = (int[]) obj3;
                String[] strArr = (String[]) obj2;
                TextView textView = (TextView) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) k96.M0(2131748314, null));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i8 = 0;
                while (true) {
                    if (i8 < iArr.length) {
                        if (iArr2[0] == iArr[i8]) {
                            spannableStringBuilder.append((CharSequence) strArr[i8]);
                            spannableStringBuilder.setSpan(new z3c(gl.o()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i8++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (y6c.h(y6c.t0).p()) {
                    cm2 cm2Var = new cm2(2131230873, 0);
                    cm2Var.H = 0.7f;
                    cm2Var.r = gl.L(-1.33f);
                    cm2Var.s = gl.L(0.0f);
                    cm2Var.x = 0.75f;
                    spannableStringBuilder.setSpan(cm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    cm2 cm2Var2 = new cm2(2131231980, 0);
                    cm2Var2.H = 0.7f;
                    cm2Var2.r = gl.L(-1.33f);
                    cm2Var2.s = gl.L(0.0f);
                    cm2Var2.x = 0.75f;
                    spannableStringBuilder.setSpan(cm2Var2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                return;
            case 8:
                boolean[] zArr = (boolean[]) obj4;
                q41[] q41VarArr = (q41[]) obj3;
                au8 au8Var = (au8) obj2;
                LaunchActivity launchActivity = (LaunchActivity) obj;
                if (!zArr[0]) {
                    nn6 nn6Var = new nn6(zArr, q41VarArr, au8Var, (byte) 8);
                    SharedPreferences c1 = na7.c1();
                    if (c1.getBoolean("proxycheckstatusip", false)) {
                        nn6Var.run();
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                    String M0 = k96.M0(2131746415, null);
                    hd hdVar2 = alertDialog$Builder.a;
                    hdVar2.S = M0;
                    hdVar2.U = k96.M0(2131746414, null);
                    alertDialog$Builder.j(k96.M0(2131746552, null), new o(c1, nn6Var, (byte) 11));
                    ug8.y(null, 2131752577, alertDialog$Builder, null);
                    return;
                }
                return;
            case 9:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                p8c p8cVar = (p8c) obj3;
                TLObject tLObject = (TLObject) obj2;
                p8c p8cVar2 = (p8c) obj;
                if (tL_error != null) {
                    p8cVar.a(tL_error);
                    return;
                } else if (tLObject instanceof TLRPC.payments_GiveawayInfo) {
                    p8cVar2.a((TLRPC.payments_GiveawayInfo) tLObject);
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
                    na7.q1(lo0Var.T).b4(tL_premium_boostsList.users, false);
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
                    na7.q1(lo0Var2.T).b4(tL_premium_boostsList2.users, false);
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
                d S = LaunchActivity.S();
                if (S != null) {
                    Y = u21.b0(S);
                } else {
                    Y = u21.Y();
                }
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    if (arrayList5.size() == 1) {
                        S22 = gl.S2(k96.a0(null, null, 2131753056, l7c.r((TLRPC.User) arrayList5.get(0)), str2));
                    } else {
                        S22 = gl.S2(k96.G(arrayList5.size(), "BotInviteDoneMany", str2));
                    }
                    Y.V(arrayList5, S22, null, null).j();
                    return;
                }
                if (tL_error2 != null) {
                    if ("BOT_INVITE_ALREADY_STARTED".equals(tL_error2.text)) {
                        if (arrayList5.size() == 1) {
                            S2 = gl.S2(k96.a0(null, null, 2131753052, l7c.r((TLRPC.User) arrayList5.get(0)), str2));
                        } else {
                            S2 = gl.S2(k96.a0(null, null, 2131753051, str2));
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
                Y.t(gl.S2(k96.a0(null, null, 2131753050, str2)), null).j();
                return;
            case 13:
                rs0 rs0Var = (rs0) obj4;
                TLObject tLObject5 = (TLObject) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                oz ozVar = rs0Var.n;
                ss0 ss0Var = rs0Var.r;
                if (!ss0Var.P) {
                    rs0Var.e = false;
                    if (tLObject5 instanceof TL_stars.StarsStatus) {
                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject5;
                        na7.q1(ss0.g0(ss0Var)).b4(starsStatus.users, false);
                        na7.q1(ss0.h0(ss0Var)).V3(starsStatus.chats, false);
                        if ((starsStatus.flags & 1) != 0 && starsStatus.next_offset != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3 && TextUtils.equals(str4, starsStatus.next_offset)) {
                            rs0Var.h = true;
                        } else {
                            rs0Var.b.addAll(starsStatus.history);
                            rs0Var.d = starsStatus.next_offset;
                            rs0Var.f = !z3;
                        }
                    } else {
                        rs0Var.h = true;
                        if (tL_error3 != null) {
                            u21.e0(tL_error3);
                        }
                    }
                    rs0Var.c.g3.O(false);
                    rs0Var.removeCallbacks(ozVar);
                    rs0Var.post(ozVar);
                    return;
                }
                return;
            case 14:
                fx0 fx0Var = (fx0) obj2;
                it0 it0Var = (it0) obj;
                ((u41) obj4).setLoading(false);
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    fx0Var.dismiss();
                    it0Var.a(Boolean.FALSE);
                    return;
                }
                return;
            case 15:
                cv0 cv0Var = (cv0) obj4;
                ev0 ev0Var = (ev0) obj3;
                String str5 = (String) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                if (cv0Var.c && ((hv0Var = cv0Var.R) == null || !hv0Var.m(ev0Var))) {
                    fa4.b("notifyEvent " + str5 + " dropped after document change");
                    return;
                }
                cv0Var.c("window.Telegram.WebView.receiveEvent('" + str5 + "', " + jSONObject + ");");
                return;
            case 16:
                j41 j41Var = (j41) obj4;
                TLObject tLObject6 = (TLObject) obj3;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj2;
                av1 av1Var = (av1) obj;
                ArrayList arrayList6 = j41Var.b;
                if (tLObject6 instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject6;
                    int indexOf = arrayList6.indexOf(tL_businessChatLink);
                    if (indexOf != -1) {
                        arrayList6.set(indexOf, tL_businessChatLink2);
                        kk7.f(j41Var.a).k(125, new Object[0]);
                        if (av1Var != null) {
                            av1Var.run();
                        }
                        j41Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 17:
                j61 j61Var = (j61) obj4;
                ((st) obj3).e(((float[]) obj2)[0]);
                if (((boolean[]) obj)[0]) {
                    j61Var.d.z0(true);
                    return;
                }
                return;
            case 18:
                j61 j61Var2 = (j61) obj4;
                long[] jArr = (long[]) obj2;
                i61 i61Var = (i61) obj;
                if (!((boolean[]) obj3)[0]) {
                    jArr[0] = System.currentTimeMillis();
                    j61Var2.d.showDialog(i61Var);
                    return;
                }
                return;
            case 19:
                ((b81) obj4).u0((TLRPC.TL_error) obj3, (TLObject) obj2, (Calendar) obj);
                return;
            case 20:
                CameraController.lambda$openRound$9((CameraSession) obj4, (Runnable) obj3, (SurfaceTexture) obj2, (Runnable) obj);
                return;
            case 21:
                CameraController.lambda$close$5((Runnable) obj4, (CameraSession) obj3, (CountDownLatch) obj2, (Runnable) obj);
                return;
            case 22:
                ((me1) obj4).i0((hd) obj3, (TLRPC.TL_error) obj2, (TL_account.updateUsername) obj);
                return;
            case 23:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj4;
                gl.g(connectedbotstarref.url);
                new u21(((fx0) obj3).F, (wjb) obj2).I(2131623994, k96.M0(2131754330, null), gl.S2(k96.a0(null, null, 2131754331, bc.I0(connectedbotstarref.commission_permille), l7c.r((TLRPC.User) obj)))).j();
                return;
            case 24:
                ((eg1) obj4).G0((Context) obj3, (TLRPC.User) obj2, (TL_payments.connectedBotStarRef) obj);
                return;
            case 25:
                kg1 kg1Var = (kg1) obj4;
                CountDownLatch countDownLatch3 = (CountDownLatch) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                hg1 hg1Var = (hg1) obj;
                ArrayList arrayList7 = kg1Var.h;
                if (countDownLatch3 != null) {
                    countDownLatch3.countDown();
                }
                if (tLObject7 != null) {
                    kg1Var.N = (byte) 20;
                    TL_stories.TL_premium_boostsList tL_premium_boostsList3 = (TL_stories.TL_premium_boostsList) tLObject7;
                    na7.q1(kg1Var.b).b4(tL_premium_boostsList3.users, false);
                    kg1Var.K = tL_premium_boostsList3.next_offset;
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
                    kg1Var.s = Math.max(0, tL_premium_boostsList3.count - i15);
                    kg1Var.r = (TextUtils.isEmpty(tL_premium_boostsList3.next_offset) || kg1Var.s <= 0) ? false : false;
                    kg1Var.P = tL_premium_boostsList3.count;
                    if (hg1Var != null) {
                        hg1Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                kg1 kg1Var2 = (kg1) obj4;
                CountDownLatch countDownLatch4 = (CountDownLatch) obj3;
                TLObject tLObject8 = (TLObject) obj2;
                hg1 hg1Var2 = (hg1) obj;
                ArrayList arrayList8 = kg1Var2.n;
                if (countDownLatch4 != null) {
                    countDownLatch4.countDown();
                }
                if (tLObject8 != null) {
                    kg1Var2.M = (byte) 20;
                    TL_stories.TL_premium_boostsList tL_premium_boostsList4 = (TL_stories.TL_premium_boostsList) tLObject8;
                    na7.q1(kg1Var2.b).b4(tL_premium_boostsList4.users, false);
                    kg1Var2.L = tL_premium_boostsList4.next_offset;
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
                    kg1Var2.x = Math.max(0, tL_premium_boostsList4.count - i18);
                    kg1Var2.w = (TextUtils.isEmpty(tL_premium_boostsList4.next_offset) || kg1Var2.x <= 0) ? false : false;
                    kg1Var2.O = tL_premium_boostsList4.count;
                    if (hg1Var2 != null) {
                        hg1Var2.run();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                mu1 mu1Var = (mu1) obj4;
                d dVar = (d) obj3;
                k27 k27Var2 = (k27) obj2;
                ui5 ui5Var = (ui5) obj;
                if (dVar instanceof gk7) {
                    mu1Var.getNotificationCenter().n((gk7) dVar, 4);
                }
                mu1Var.getNotificationCenter().k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", k27Var2.k.action.channel_id);
                ((ActionBarLayout) ui5Var).b(ui5Var.getFragmentStack().size() - 1, new mu1(bundle));
                dVar.finishFragment();
                return;
            case 28:
                mu1 mu1Var2 = (mu1) obj4;
                TLObject tLObject9 = (TLObject) obj2;
                yt0 yt0Var = (yt0) obj;
                ((op1) obj3).c(false);
                if (tLObject9 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject9;
                    mu1Var2.getMessagesController().b4(tL_contacts_resolvedPeer.users, false);
                    mu1Var2.getMessagesController().V3(tL_contacts_resolvedPeer.chats, false);
                    long n = cf3.n(tL_contacts_resolvedPeer.peer);
                    if (n >= 0) {
                        user2 = mu1Var2.getMessagesController().V1(Long.valueOf(n));
                    }
                }
                yt0Var.a(user2);
                return;
            default:
                ImageView imageView = (ImageView) obj2;
                ImageView imageView2 = (ImageView) obj;
                ((long[]) obj4)[0] = SystemClock.elapsedRealtime();
                if (!((boolean[]) obj3)[0]) {
                    imageView = imageView2;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new f0((m33) imageView.getDrawable(), (byte) 27));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(s33.f);
                ofFloat.start();
                return;
        }
    }
}
