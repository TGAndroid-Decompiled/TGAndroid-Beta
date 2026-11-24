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
public final class l97 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public l97(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
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
        oc7 oc7Var;
        c41 Y;
        SpannableStringBuilder S2;
        SpannableStringBuilder S22;
        boolean z3;
        qw0 qw0Var;
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
                oc7 oc7Var2 = (oc7) obj4;
                TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) obj3;
                vh6 vh6Var = (vh6) obj2;
                vh6 vh6Var2 = (vh6) obj;
                if (!updates_difference.new_messages.isEmpty() || !updates_difference.new_encrypted_messages.isEmpty()) {
                    vh6 vh6Var3 = new vh6();
                    for (int i = 0; i < updates_difference.new_encrypted_messages.size(); i++) {
                        ArrayList g = oc7Var2.getSecretChatHelper().g(updates_difference.new_encrypted_messages.get(i));
                        if (g != null && !g.isEmpty()) {
                            updates_difference.new_messages.addAll(g);
                        }
                    }
                    fn5.S(updates_difference.new_messages);
                    ArrayList arrayList = new ArrayList();
                    long e = oc7Var2.getUserConfig().e();
                    int i2 = 0;
                    while (i2 < updates_difference.new_messages.size()) {
                        TLRPC.Message message = updates_difference.new_messages.get(i2);
                        if (!(message instanceof TLRPC.TL_messageEmpty)) {
                            k47.B0(message);
                            if (!pg3.B(message.dialog_id)) {
                                TLRPC.MessageAction messageAction = message.action;
                                if ((messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) && (user = (TLRPC.User) vh6Var.f(messageAction.user_id)) != null && user.bot) {
                                    message.reply_markup = new TLRPC.TL_replyKeyboardHide();
                                    message.flags |= 64;
                                }
                                TLRPC.MessageAction messageAction2 = message.action;
                                if (!(messageAction2 instanceof TLRPC.TL_messageActionChatMigrateTo) && !(messageAction2 instanceof TLRPC.TL_messageActionChannelCreate)) {
                                    if (message.out) {
                                        concurrentHashMap = oc7Var2.Q;
                                    } else {
                                        concurrentHashMap = oc7Var2.P;
                                    }
                                    Integer num = (Integer) concurrentHashMap.get(Long.valueOf(message.dialog_id));
                                    if (num == null) {
                                        num = Integer.valueOf(oc7Var2.getMessagesStorage().S(message.dialog_id, message.out));
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
                            boolean contains = oc7Var2.l0.contains(Long.valueOf(j));
                            k47 k47Var = new k47(oc7Var2.currentAccount, message, vh6Var, vh6Var2, contains, contains);
                            TLRPC.Message message2 = k47Var.k;
                            if ((!message2.out || message2.from_scheduled) && k47Var.E4()) {
                                arrayList.add(k47Var);
                            }
                            ArrayList arrayList2 = (ArrayList) vh6Var3.f(message.dialog_id);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                vh6Var3.k(arrayList2, message.dialog_id);
                            }
                            arrayList2.add(k47Var);
                        }
                        i2++;
                        z5 = false;
                    }
                    oc7Var2.getMessagesStorage().a.c(new jy6(oc7Var2, arrayList, updates_difference, vh6Var3));
                    oc7Var2.getSecretChatHelper().m();
                }
                if (!updates_difference.other_updates.isEmpty()) {
                    oc7Var = oc7Var2;
                    oc7Var.S3(updates_difference.other_updates, updates_difference.users, updates_difference.chats, true, 0);
                } else {
                    oc7Var = oc7Var2;
                }
                if (updates_difference instanceof TLRPC.TL_updates_difference) {
                    oc7Var.Y1 = false;
                    oc7Var.getMessagesStorage().H1(updates_difference.state.seq);
                    oc7Var.getMessagesStorage().E1(updates_difference.state.date);
                    oc7Var.getMessagesStorage().F1(updates_difference.state.pts);
                    oc7Var.getMessagesStorage().G1(updates_difference.state.qts);
                    fc4.b("received difference: isUpdating = false");
                    oc7Var.getConnectionsManager().setIsUpdating(false);
                    for (int i3 = 0; i3 < 3; i3++) {
                        oc7Var.U3(i3, 1);
                    }
                } else if (updates_difference instanceof TLRPC.TL_updates_differenceSlice) {
                    oc7Var.getMessagesStorage().E1(updates_difference.intermediate_state.date);
                    oc7Var.getMessagesStorage().F1(updates_difference.intermediate_state.pts);
                    oc7Var.getMessagesStorage().G1(updates_difference.intermediate_state.qts);
                } else if (updates_difference instanceof TLRPC.TL_updates_differenceEmpty) {
                    oc7Var.Y1 = false;
                    oc7Var.getMessagesStorage().H1(updates_difference.seq);
                    oc7Var.getMessagesStorage().E1(updates_difference.date);
                    oc7Var.getConnectionsManager().setIsUpdating(false);
                    fc4.b("received differenceEmpty: isUpdating = false");
                    for (int i4 = 0; i4 < 3; i4++) {
                        oc7Var.U3(i4, 1);
                    }
                }
                cf7 messagesStorage = oc7Var.getMessagesStorage();
                cf7 messagesStorage2 = oc7Var.getMessagesStorage();
                messagesStorage2.G();
                int i5 = messagesStorage2.w;
                cf7 messagesStorage3 = oc7Var.getMessagesStorage();
                messagesStorage3.G();
                int i6 = messagesStorage3.r;
                cf7 messagesStorage4 = oc7Var.getMessagesStorage();
                messagesStorage4.G();
                int i7 = messagesStorage4.n;
                cf7 messagesStorage5 = oc7Var.getMessagesStorage();
                messagesStorage5.G();
                messagesStorage.x1(i5, i6, i7, messagesStorage5.s);
                if (e21.a) {
                    StringBuilder sb = new StringBuilder("received difference with date = ");
                    cf7 messagesStorage6 = oc7Var.getMessagesStorage();
                    messagesStorage6.G();
                    sb.append(messagesStorage6.n);
                    sb.append(" pts = ");
                    cf7 messagesStorage7 = oc7Var.getMessagesStorage();
                    messagesStorage7.G();
                    sb.append(messagesStorage7.r);
                    sb.append(" seq = ");
                    cf7 messagesStorage8 = oc7Var.getMessagesStorage();
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
                    fc4.b(sb.toString());
                    return;
                }
                return;
            case 1:
                oc7 oc7Var3 = (oc7) obj4;
                ik.c0(oc7Var3.currentAccount, (TLRPC.TL_error) obj3, (d) obj2, (TLRPC.TL_channels_createChannel) obj, new Object[0]);
                oc7Var3.getNotificationCenter().k(30, new Object[0]);
                return;
            case 2:
                oc7 oc7Var4 = (oc7) obj4;
                ik.c0(oc7Var4.currentAccount, (TLRPC.TL_error) obj3, (d) obj2, (TLRPC.TL_messages_createChat) obj, new Object[0]);
                oc7Var4.getNotificationCenter().k(30, new Object[0]);
                return;
            case 3:
                ik.c0(((oc7) obj4).currentAccount, (TLRPC.TL_error) obj3, (d) obj2, (TLRPC.TL_messages_editChatAdmin) obj, Boolean.FALSE);
                return;
            case 4:
                o4a o4aVar = (o4a) obj;
                if (wq0.b(((a6a) obj4).currentAccount).a((TLRPC.TL_messages_forwardMessages) obj3, (ArrayList) obj2, o4aVar)) {
                    o4aVar.run();
                    return;
                }
                return;
            case 5:
                String str = "https://t.me/addstyle/" + ((TL_aicompose.TL_aiComposeTone) obj3).slug;
                new w((a1) obj4, (Context) obj2, str, str, (ylb) obj).show();
                return;
            case 6:
                hk hkVar = (hk) obj4;
                ra raVar = (ra) obj3;
                he[] heVarArr = (he[]) obj2;
                View view = (View) obj;
                String trim = hkVar.getText().toString().trim();
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
                    he heVar = heVarArr[0];
                    if (heVar != null) {
                        heVar.dismiss();
                    }
                    if (view != null) {
                        view.requestFocus();
                        return;
                    }
                    return;
                }
                gm.z3(hkVar);
                return;
            case 7:
                int[] iArr = (int[]) obj4;
                int[] iArr2 = (int[]) obj3;
                String[] strArr = (String[]) obj2;
                TextView textView = (TextView) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) jb6.M0(2131748263, null));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i8 = 0;
                while (true) {
                    if (i8 < iArr.length) {
                        if (iArr2[0] == iArr[i8]) {
                            spannableStringBuilder.append((CharSequence) strArr[i8]);
                            spannableStringBuilder.setSpan(new z5c(gm.o()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i8++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (z8c.h(z8c.t0).p()) {
                    pn2 pn2Var = new pn2(2131230874, 0);
                    pn2Var.H = 0.7f;
                    pn2Var.r = gm.L(-1.33f);
                    pn2Var.s = gm.L(0.0f);
                    pn2Var.x = 0.75f;
                    spannableStringBuilder.setSpan(pn2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    pn2 pn2Var2 = new pn2(2131231981, 0);
                    pn2Var2.H = 0.7f;
                    pn2Var2.r = gm.L(-1.33f);
                    pn2Var2.s = gm.L(0.0f);
                    pn2Var2.x = 0.75f;
                    spannableStringBuilder.setSpan(pn2Var2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                return;
            case 8:
                boolean[] zArr = (boolean[]) obj4;
                x51[] x51VarArr = (x51[]) obj3;
                bw8 bw8Var = (bw8) obj2;
                LaunchActivity launchActivity = (LaunchActivity) obj;
                if (!zArr[0]) {
                    op6 op6Var = new op6(zArr, x51VarArr, bw8Var, (byte) 8);
                    SharedPreferences d1 = oc7.d1();
                    if (d1.getBoolean("proxycheckstatusip", false)) {
                        op6Var.run();
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                    String M0 = jb6.M0(2131746341, null);
                    he heVar2 = alertDialog$Builder.a;
                    heVar2.S = M0;
                    heVar2.U = jb6.M0(2131746340, null);
                    alertDialog$Builder.j(jb6.M0(2131746478, null), new o(d1, op6Var, (byte) 11));
                    wi8.y(null, 2131752542, alertDialog$Builder, null);
                    return;
                }
                return;
            case 9:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                qac qacVar = (qac) obj3;
                TLObject tLObject = (TLObject) obj2;
                qac qacVar2 = (qac) obj;
                if (tL_error != null) {
                    qacVar.a(tL_error);
                    return;
                } else if (tLObject instanceof TLRPC.payments_GiveawayInfo) {
                    qacVar2.a((TLRPC.payments_GiveawayInfo) tLObject);
                    return;
                } else {
                    return;
                }
            case 10:
                lp0 lp0Var = (lp0) obj4;
                CountDownLatch countDownLatch = (CountDownLatch) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                bp0 bp0Var = (bp0) obj;
                ArrayList arrayList3 = lp0Var.Y;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                if (tLObject2 != null) {
                    lp0Var.m0 = (byte) 20;
                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                    oc7.r1(lp0Var.T).d4(tL_premium_boostsList.users, false);
                    lp0Var.l0 = tL_premium_boostsList.next_offset;
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
                    lp0Var.c0 = Math.max(0, tL_premium_boostsList.count - i9);
                    lp0Var.b0 = (TextUtils.isEmpty(tL_premium_boostsList.next_offset) || lp0Var.c0 <= 0) ? false : false;
                    lp0Var.o0 = tL_premium_boostsList.count;
                    if (bp0Var != null) {
                        bp0Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                lp0 lp0Var2 = (lp0) obj4;
                CountDownLatch countDownLatch2 = (CountDownLatch) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                bp0 bp0Var2 = (bp0) obj;
                ArrayList arrayList4 = lp0Var2.X;
                if (countDownLatch2 != null) {
                    countDownLatch2.countDown();
                }
                if (tLObject3 != null) {
                    lp0Var2.n0 = (byte) 20;
                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                    oc7.r1(lp0Var2.T).d4(tL_premium_boostsList2.users, false);
                    lp0Var2.k0 = tL_premium_boostsList2.next_offset;
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
                    lp0Var2.a0 = Math.max(0, tL_premium_boostsList2.count - i12);
                    lp0Var2.Z = (TextUtils.isEmpty(tL_premium_boostsList2.next_offset) || lp0Var2.a0 <= 0) ? false : false;
                    lp0Var2.p0 = tL_premium_boostsList2.count;
                    if (bp0Var2 != null) {
                        bp0Var2.run();
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
                    Y = c41.b0(S);
                } else {
                    Y = c41.Y();
                }
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    if (arrayList5.size() == 1) {
                        S22 = gm.S2(jb6.a0(null, null, 2131753024, m9c.r((TLRPC.User) arrayList5.get(0)), str2));
                    } else {
                        S22 = gm.S2(jb6.G(arrayList5.size(), "BotInviteDoneMany", str2));
                    }
                    Y.V(arrayList5, S22, null, null).j();
                    return;
                }
                if (tL_error2 != null) {
                    if ("BOT_INVITE_ALREADY_STARTED".equals(tL_error2.text)) {
                        if (arrayList5.size() == 1) {
                            S2 = gm.S2(jb6.a0(null, null, 2131753020, m9c.r((TLRPC.User) arrayList5.get(0)), str2));
                        } else {
                            S2 = gm.S2(jb6.a0(null, null, 2131753019, str2));
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
                Y.t(gm.S2(jb6.a0(null, null, 2131753018, str2)), null).j();
                return;
            case 13:
                zt0 zt0Var = (zt0) obj4;
                TLObject tLObject5 = (TLObject) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                yt0 yt0Var = zt0Var.n;
                au0 au0Var = zt0Var.r;
                if (!au0Var.P) {
                    zt0Var.e = false;
                    if (tLObject5 instanceof TL_stars.StarsStatus) {
                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject5;
                        oc7.r1(au0.h0(au0Var)).d4(starsStatus.users, false);
                        oc7.r1(au0.i0(au0Var)).X3(starsStatus.chats, false);
                        if ((starsStatus.flags & 1) != 0 && starsStatus.next_offset != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3 && TextUtils.equals(str4, starsStatus.next_offset)) {
                            zt0Var.h = true;
                        } else {
                            zt0Var.b.addAll(starsStatus.history);
                            zt0Var.d = starsStatus.next_offset;
                            zt0Var.f = !z3;
                        }
                    } else {
                        zt0Var.h = true;
                        if (tL_error3 != null) {
                            c41.e0(tL_error3);
                        }
                    }
                    zt0Var.c.g3.O(false);
                    zt0Var.removeCallbacks(yt0Var);
                    zt0Var.post(yt0Var);
                    return;
                }
                return;
            case 14:
                my0 my0Var = (my0) obj2;
                qu0 qu0Var = (qu0) obj;
                ((b61) obj4).setLoading(false);
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    my0Var.dismiss();
                    qu0Var.a(Boolean.FALSE);
                    return;
                }
                return;
            case 15:
                mw0 mw0Var = (mw0) obj4;
                ow0 ow0Var = (ow0) obj3;
                String str5 = (String) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                if (mw0Var.c && ((qw0Var = mw0Var.R) == null || !qw0Var.m(ow0Var))) {
                    fc4.b("notifyEvent " + str5 + " dropped after document change");
                    return;
                }
                mw0Var.c("window.Telegram.WebView.receiveEvent('" + str5 + "', " + jSONObject + ");");
                return;
            case 16:
                q51 q51Var = (q51) obj4;
                TLObject tLObject6 = (TLObject) obj3;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj2;
                gx1 gx1Var = (gx1) obj;
                ArrayList arrayList6 = q51Var.b;
                if (tLObject6 instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject6;
                    int indexOf = arrayList6.indexOf(tL_businessChatLink);
                    if (indexOf != -1) {
                        arrayList6.set(indexOf, tL_businessChatLink2);
                        nm7.f(q51Var.a).k(126, new Object[0]);
                        if (gx1Var != null) {
                            gx1Var.run();
                        }
                        q51Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 17:
                q71 q71Var = (q71) obj4;
                ((su) obj3).e(((float[]) obj2)[0]);
                if (((boolean[]) obj)[0]) {
                    q71Var.d.A0(true);
                    return;
                }
                return;
            case 18:
                q71 q71Var2 = (q71) obj4;
                long[] jArr = (long[]) obj2;
                p71 p71Var = (p71) obj;
                if (!((boolean[]) obj3)[0]) {
                    jArr[0] = System.currentTimeMillis();
                    q71Var2.d.showDialog(p71Var);
                    return;
                }
                return;
            case 19:
                ((k91) obj4).v0((TLRPC.TL_error) obj3, (TLObject) obj2, (Calendar) obj);
                return;
            case 20:
                CameraController.lambda$openRound$9((CameraSession) obj4, (Runnable) obj3, (SurfaceTexture) obj2, (Runnable) obj);
                return;
            case 21:
                CameraController.lambda$close$5((Runnable) obj4, (CameraSession) obj3, (CountDownLatch) obj2, (Runnable) obj);
                return;
            case 22:
                ((uf1) obj4).j0((he) obj3, (TLRPC.TL_error) obj2, (TL_account.updateUsername) obj);
                return;
            case 23:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj4;
                gm.g(connectedbotstarref.url);
                new c41(((my0) obj3).F, (ylb) obj2).I(2131623994, jb6.M0(2131754330, null), gm.S2(jb6.a0(null, null, 2131754331, bc.J0(connectedbotstarref.commission_permille), m9c.r((TLRPC.User) obj)))).j();
                return;
            case 24:
                ((mh1) obj4).H0((Context) obj3, (TLRPC.User) obj2, (TL_payments.connectedBotStarRef) obj);
                return;
            case 25:
                sh1 sh1Var = (sh1) obj4;
                CountDownLatch countDownLatch3 = (CountDownLatch) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                ph1 ph1Var = (ph1) obj;
                ArrayList arrayList7 = sh1Var.h;
                if (countDownLatch3 != null) {
                    countDownLatch3.countDown();
                }
                if (tLObject7 != null) {
                    sh1Var.N = (byte) 20;
                    TL_stories.TL_premium_boostsList tL_premium_boostsList3 = (TL_stories.TL_premium_boostsList) tLObject7;
                    oc7.r1(sh1Var.b).d4(tL_premium_boostsList3.users, false);
                    sh1Var.K = tL_premium_boostsList3.next_offset;
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
                    sh1Var.s = Math.max(0, tL_premium_boostsList3.count - i15);
                    sh1Var.r = (TextUtils.isEmpty(tL_premium_boostsList3.next_offset) || sh1Var.s <= 0) ? false : false;
                    sh1Var.P = tL_premium_boostsList3.count;
                    if (ph1Var != null) {
                        ph1Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                sh1 sh1Var2 = (sh1) obj4;
                CountDownLatch countDownLatch4 = (CountDownLatch) obj3;
                TLObject tLObject8 = (TLObject) obj2;
                ph1 ph1Var2 = (ph1) obj;
                ArrayList arrayList8 = sh1Var2.n;
                if (countDownLatch4 != null) {
                    countDownLatch4.countDown();
                }
                if (tLObject8 != null) {
                    sh1Var2.M = (byte) 20;
                    TL_stories.TL_premium_boostsList tL_premium_boostsList4 = (TL_stories.TL_premium_boostsList) tLObject8;
                    oc7.r1(sh1Var2.b).d4(tL_premium_boostsList4.users, false);
                    sh1Var2.L = tL_premium_boostsList4.next_offset;
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
                    sh1Var2.x = Math.max(0, tL_premium_boostsList4.count - i18);
                    sh1Var2.w = (TextUtils.isEmpty(tL_premium_boostsList4.next_offset) || sh1Var2.x <= 0) ? false : false;
                    sh1Var2.O = tL_premium_boostsList4.count;
                    if (ph1Var2 != null) {
                        ph1Var2.run();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                yv1 yv1Var = (yv1) obj4;
                d dVar = (d) obj3;
                k47 k47Var2 = (k47) obj2;
                tk5 tk5Var = (tk5) obj;
                if (dVar instanceof jm7) {
                    yv1Var.getNotificationCenter().n((jm7) dVar, 4);
                }
                yv1Var.getNotificationCenter().k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", k47Var2.k.action.channel_id);
                ((ActionBarLayout) tk5Var).b(tk5Var.getFragmentStack().size() - 1, new yv1(bundle));
                dVar.finishFragment();
                return;
            case 28:
                ImageView imageView = (ImageView) obj2;
                ImageView imageView2 = (ImageView) obj;
                ((long[]) obj4)[0] = SystemClock.elapsedRealtime();
                if (!((boolean[]) obj3)[0]) {
                    imageView = imageView2;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new f0((x43) imageView.getDrawable(), (byte) 29));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(d53.f);
                ofFloat.start();
                return;
            default:
                yv1 yv1Var2 = (yv1) obj4;
                TLObject tLObject9 = (TLObject) obj2;
                hv0 hv0Var = (hv0) obj;
                ((br1) obj3).c(false);
                if (tLObject9 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject9;
                    yv1Var2.getMessagesController().d4(tL_contacts_resolvedPeer.users, false);
                    yv1Var2.getMessagesController().X3(tL_contacts_resolvedPeer.chats, false);
                    long n = pg3.n(tL_contacts_resolvedPeer.peer);
                    if (n >= 0) {
                        user2 = yv1Var2.getMessagesController().W1(Long.valueOf(n));
                    }
                }
                hv0Var.a(user2);
                return;
        }
    }
}
