package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
public final class e implements i8c {
    public final byte a;
    public final Object b;
    public final Object c;
    public final int d;
    public final Object e;

    public e(int i, d dVar, c01 c01Var, hd hdVar) {
        this.a = (byte) 6;
        this.d = i;
        this.b = dVar;
        this.c = c01Var;
        this.e = hdVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z;
        byte b = this.a;
        TLRPC.WebPage webPage = null;
        int i = this.d;
        Object obj3 = this.e;
        boolean z2 = false;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                a1 a1Var = (a1) obj5;
                jia jiaVar = (jia) obj4;
                TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = (TLRPC.TL_messages_composeMessageWithAI) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout = a1Var.D2;
                a1Var.U2 = -1;
                a1Var.V2 = false;
                if (tL_error != null) {
                    if (!"SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) && !"AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text)) {
                        ug8.u(frameLayout, a1Var.J0, tL_error, false);
                        jiaVar.i(null);
                        a1Var.G2 = true;
                        a1Var.H2 = false;
                        a1Var.s1(true);
                        return;
                    }
                    new u21(frameLayout, a1Var.J0).I(2131624212, k96.M0(2131754989, null), gl.T2(k96.M0(2131754990, null))).j();
                    a1Var.H2 = true;
                    a1Var.s1(true);
                    return;
                } else if (tL_composedMessageWithAI == null) {
                    jiaVar.i(null);
                    a1Var.G2 = true;
                    a1Var.H2 = false;
                    a1Var.s1(true);
                    return;
                } else {
                    jiaVar.i(null);
                    a1Var.H2 = false;
                    a1Var.s1(true);
                    a1Var.W2[i] = tL_messages_composeMessageWithAI;
                    if (i == 0) {
                        a1Var.U1 = false;
                        a1Var.V1 = k27.h0(tL_composedMessageWithAI.result_text, false);
                    } else if (i == 1) {
                        a1Var.X1 = false;
                        a1Var.Y1 = k27.h0(tL_composedMessageWithAI.result_text, false);
                    } else if (i == 2) {
                        a1Var.a2 = false;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_composedMessageWithAI.diff_text;
                        if (tL_textWithEntities != null) {
                            a1Var.b2 = k27.h0(tL_textWithEntities, false);
                            a1Var.d2 = k27.h0(tL_composedMessageWithAI.result_text, false);
                        } else {
                            CharSequence h0 = k27.h0(tL_composedMessageWithAI.result_text, false);
                            a1Var.d2 = h0;
                            a1Var.b2 = h0;
                        }
                    }
                    a1Var.O2.O(true);
                    return;
                }
            case 1:
                a1 a1Var2 = (a1) obj5;
                jia jiaVar2 = (jia) obj4;
                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = (TLRPC.TL_messages_composeRichMessageWithAI) obj3;
                TLRPC.TL_composedRichMessageWithAI tL_composedRichMessageWithAI = (TLRPC.TL_composedRichMessageWithAI) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout2 = a1Var2.D2;
                a1Var2.U2 = -1;
                a1Var2.V2 = false;
                if (tL_error2 != null) {
                    if (!"SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error2.text) && !"AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error2.text)) {
                        ug8.u(frameLayout2, a1Var2.J0, tL_error2, false);
                        jiaVar2.i(null);
                        a1Var2.G2 = true;
                        a1Var2.H2 = false;
                        a1Var2.s1(true);
                        return;
                    }
                    new u21(frameLayout2, a1Var2.J0).I(2131624212, k96.M0(2131754989, null), gl.T2(k96.M0(2131754990, null))).j();
                    a1Var2.H2 = true;
                    a1Var2.s1(true);
                    return;
                } else if (tL_composedRichMessageWithAI == null) {
                    jiaVar2.i(null);
                    a1Var2.G2 = true;
                    a1Var2.H2 = false;
                    a1Var2.s1(true);
                    return;
                } else {
                    jiaVar2.i(null);
                    a1Var2.H2 = false;
                    a1Var2.s1(true);
                    a1Var2.X2[i] = tL_messages_composeRichMessageWithAI;
                    if (i == 0) {
                        a1Var2.U1 = false;
                        a1Var2.W1 = tL_composedRichMessageWithAI.result;
                    } else if (i == 1) {
                        a1Var2.X1 = false;
                        a1Var2.Z1 = tL_composedRichMessageWithAI.result;
                    } else if (i == 2) {
                        a1Var2.a2 = false;
                        a1Var2.c2 = tL_composedRichMessageWithAI.result;
                    }
                    a1Var2.O2.O(true);
                    return;
                }
            case 2:
                eu euVar = (eu) obj5;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i2 = this.d;
                if (tL_error3 != null) {
                    gl.d3(new tn6(euVar, i2, tL_error3, tL_channels_joinChannel, (byte) 3));
                    return;
                }
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    int i3 = 0;
                    while (true) {
                        if (i3 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i3);
                            if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                z = true;
                            } else {
                                i3++;
                            }
                        } else {
                            z = false;
                        }
                    }
                    na7.q1(i2).Q3(updates, false);
                    z2 = z;
                } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    gl.d3(new va7(i2, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat, (byte) 5));
                    z2 = true;
                }
                if (!z2) {
                    na7.q1(i2).z0(chat.id, true);
                }
                gl.d3(new b1(euVar, (byte) 19));
                gl.e3(new eg(i2, chat, (byte) 2), 1000L);
                ad7 Y = ad7.Y(i2);
                long j = chat.id;
                Y.O1(-j, j, new ArrayList(), null);
                return;
            case 3:
                tr0 tr0Var = (tr0) obj4;
                gk7[] gk7VarArr = (gk7[]) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                ((int[]) obj5)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage2 = messageMedia.webpage;
                    if (!(webPage2 instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage2 instanceof TLRPC.TL_webPagePending) {
                                long j2 = webPage2.id;
                                int i4 = this.d;
                                wr0 wr0Var = new wr0(j2, gk7VarArr, i4, tr0Var);
                                gk7VarArr[0] = wr0Var;
                                kk7.f(i4).a(wr0Var, 59);
                                return;
                            }
                            if (webPage2 instanceof TLRPC.TL_webPage) {
                                webPage = webPage2;
                            }
                            tr0Var.a(webPage);
                            return;
                        }
                        tr0Var.a(null);
                        return;
                    }
                }
                tr0Var.a(null);
                return;
            case 4:
                t61 t61Var = (t61) obj5;
                Pair pair = (Pair) obj4;
                Long l = (Long) obj;
                if (t61Var.i(pair)) {
                    Object obj6 = this.e;
                    if (obj2 != null && t61Var.b(obj6)) {
                        t61Var.a(pair, obj2);
                        qg qgVar = new qg((Object) t61Var, (Object) pair, obj2, false, (byte) 2);
                        t61Var = t61Var;
                        pair = pair;
                        gl.d3(qgVar);
                    }
                    long longValue = l.longValue();
                    int i5 = this.d;
                    t61Var.f(i5, obj6, longValue, new s61(t61Var, pair, obj2, i5, obj6));
                    return;
                }
                t61Var.a(pair, obj2);
                gl.d3(new qg((Object) t61Var, (Object) pair, obj2, true, (byte) 2));
                return;
            case 5:
                hd[] hdVarArr = (hd[]) obj5;
                d dVar = (d) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                hd hdVar = hdVarArr[0];
                if (hdVar != null) {
                    hdVar.dismiss();
                    hdVarArr[0] = null;
                }
                if (tL_error5 != null) {
                    u21.b0(dVar).g0(tL_error5, false);
                    return;
                } else if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        ir2.v(null, 2131751893, u21.b0(dVar), 2131624068, 36);
                        return;
                    } else if (!arrayList.isEmpty()) {
                        dVar.showDialog(new eo2(dVar, 0L, arrayList, new a61(dVar, chat2, i, (byte) 1)));
                        return;
                    } else {
                        u21.b0(dVar).Q(2131624068, 36, "").j();
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                d dVar2 = (d) obj5;
                c01 c01Var = (c01) obj4;
                hd hdVar2 = (hd) obj3;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (updates2 != null && tL_error6 == null) {
                    na7.q1(i).Q3(updates2, false);
                }
                gl.d3(new hn1(dVar2, tL_error6, c01Var, hdVar2));
                return;
            case 7:
                Context context = (Context) obj4;
                fx0 fx0Var = (fx0) obj3;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str = (String) obj2;
                ((u41) obj5).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str)) {
                    if ("EMPTY".equalsIgnoreCase(str)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        String M0 = k96.M0(2131747439, null);
                        hd hdVar3 = alertDialog$Builder.a;
                        hdVar3.S = M0;
                        hdVar3.U = k96.M0(2131747440, null);
                        alertDialog$Builder.j(k96.M0(2131747638, null), null);
                        hdVar3.setOnDismissListener(new n1(fx0Var, (byte) 27));
                        alertDialog$Builder.o();
                        return;
                    }
                    d S = LaunchActivity.S();
                    if (S != null) {
                        if (str != null) {
                            new u21(fx0Var.F, fx0Var.J0).f0(str, false);
                            return;
                        } else if (passkey != null) {
                            na7.q1(i).m4(0L, "SETUP_PASSKEY");
                            if (S instanceof PasskeysActivity) {
                                fx0Var.dismiss();
                                ((PasskeysActivity) S).Y(passkey);
                                return;
                            } else if (S instanceof PrivacySettingsActivity) {
                                fx0Var.dismiss();
                                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) S;
                                ArrayList arrayList2 = privacySettingsActivity.e;
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(passkey);
                                privacySettingsActivity.E0(true);
                                S.presentFragment(new PasskeysActivity(arrayList2));
                                return;
                            } else {
                                ConnectionsManager.getInstance(i).sendRequestTyped(new TL_account.getPasskeys(), new hc((byte) 0), new p(fx0Var, passkey, str, (byte) 23));
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 8:
                boolean[] zArr = (boolean[]) obj5;
                Context context2 = (Context) obj4;
                wjb wjbVar = (wjb) obj3;
                Long l2 = (Long) obj;
                String str2 = (String) obj2;
                if (l2 != null && l2.longValue() != 0) {
                    int i6 = this.d;
                    kt4.c(i6).j(l2.longValue(), new hz5(zArr, context2, wjbVar, i6, str2, (byte) 1));
                    return;
                }
                zArr[0] = false;
                return;
            case 9:
                boolean[] zArr2 = (boolean[]) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                i8c i8cVar = (i8c) obj3;
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr2[0]) {
                    if (str3 != null) {
                        arrayList3.set(i, str3);
                        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                            if (arrayList3.get(i7) == null) {
                                return;
                            }
                        }
                        zArr2[0] = true;
                        i8cVar.a(TextUtils.join("", arrayList3), Boolean.FALSE);
                        return;
                    }
                    zArr2[0] = true;
                    i8cVar.a(null, bool);
                    return;
                }
                return;
            default:
                wjb wjbVar2 = (wjb) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str4 = (String) obj2;
                ((Runnable[]) obj5)[0] = null;
                TextView textView = ((TextView[]) obj4)[0];
                if (textView != null && wallettransaction != null) {
                    long j3 = wallettransaction.fee;
                    if (j3 > 0) {
                        textView.setText(hmc.o0(i, j3, wjbVar2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public e(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = i;
        this.c = obj2;
        this.e = obj3;
    }

    public e(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = i;
        this.e = obj3;
    }

    public e(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = i;
    }
}
