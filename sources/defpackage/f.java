package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
public final class f implements icc {
    public final byte a;
    public final Object b;
    public final Object c;
    public final int d;
    public final Object e;

    public f(int i, e eVar, l01 l01Var, id idVar) {
        this.a = (byte) 6;
        this.d = i;
        this.b = eVar;
        this.c = l01Var;
        this.e = idVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z;
        int i;
        ViewGroup k0;
        ArrayList arrayList;
        byte b = this.a;
        TLRPC.WebPage webPage = null;
        int i2 = this.d;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                b1 b1Var = (b1) obj5;
                ema emaVar = (ema) obj4;
                TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = (TLRPC.TL_messages_composeMessageWithAI) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout = b1Var.D2;
                b1Var.W2 = -1;
                b1Var.X2 = false;
                if (tL_error != null) {
                    if (!"SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) && !"AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text)) {
                        ik8.u(frameLayout, b1Var.J0, tL_error, false);
                        emaVar.i(null);
                        b1Var.G2 = true;
                        b1Var.H2 = false;
                        b1Var.u1(true);
                        return;
                    }
                    new d31(frameLayout, b1Var.J0).I(2131624211, ob6.M0(2131754986, null), hl.S2(ob6.M0(2131754987, null))).j();
                    b1Var.H2 = true;
                    b1Var.u1(true);
                    return;
                } else if (tL_composedMessageWithAI == null) {
                    emaVar.i(null);
                    b1Var.G2 = true;
                    b1Var.H2 = false;
                    b1Var.u1(true);
                    return;
                } else {
                    emaVar.i(null);
                    b1Var.H2 = false;
                    b1Var.u1(true);
                    b1Var.Y2[i2] = tL_messages_composeMessageWithAI;
                    if (i2 == 0) {
                        b1Var.U1 = false;
                        b1Var.V1 = r47.h0(tL_composedMessageWithAI.result_text, false);
                    } else if (i2 == 1) {
                        b1Var.X1 = false;
                        b1Var.Y1 = r47.h0(tL_composedMessageWithAI.result_text, false);
                    } else if (i2 == 2) {
                        b1Var.a2 = false;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_composedMessageWithAI.diff_text;
                        if (tL_textWithEntities != null) {
                            b1Var.b2 = r47.h0(tL_textWithEntities, false);
                            b1Var.d2 = r47.h0(tL_composedMessageWithAI.result_text, false);
                        } else {
                            CharSequence h0 = r47.h0(tL_composedMessageWithAI.result_text, false);
                            b1Var.d2 = h0;
                            b1Var.b2 = h0;
                        }
                    }
                    b1Var.Q2.O(true);
                    return;
                }
            case 1:
                b1 b1Var2 = (b1) obj5;
                ema emaVar2 = (ema) obj4;
                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = (TLRPC.TL_messages_composeRichMessageWithAI) obj3;
                TLRPC.TL_composedRichMessageWithAI tL_composedRichMessageWithAI = (TLRPC.TL_composedRichMessageWithAI) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout2 = b1Var2.D2;
                b1Var2.W2 = -1;
                b1Var2.X2 = false;
                if (tL_error2 != null) {
                    if (!"SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error2.text) && !"AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error2.text)) {
                        ik8.u(frameLayout2, b1Var2.J0, tL_error2, false);
                        emaVar2.i(null);
                        b1Var2.G2 = true;
                        b1Var2.H2 = false;
                        b1Var2.u1(true);
                        return;
                    }
                    new d31(frameLayout2, b1Var2.J0).I(2131624211, ob6.M0(2131754986, null), hl.S2(ob6.M0(2131754987, null))).j();
                    b1Var2.H2 = true;
                    b1Var2.u1(true);
                    return;
                } else if (tL_composedRichMessageWithAI == null) {
                    emaVar2.i(null);
                    b1Var2.G2 = true;
                    b1Var2.H2 = false;
                    b1Var2.u1(true);
                    return;
                } else {
                    emaVar2.i(null);
                    b1Var2.H2 = false;
                    b1Var2.u1(true);
                    b1Var2.Z2[i2] = tL_messages_composeRichMessageWithAI;
                    if (i2 == 0) {
                        b1Var2.U1 = false;
                        b1Var2.W1 = tL_composedRichMessageWithAI.result;
                    } else if (i2 == 1) {
                        b1Var2.X1 = false;
                        b1Var2.Z1 = tL_composedRichMessageWithAI.result;
                    } else if (i2 == 2) {
                        b1Var2.a2 = false;
                        b1Var2.c2 = tL_composedRichMessageWithAI.result;
                    }
                    b1Var2.Q2.O(true);
                    return;
                }
            case 2:
                fu fuVar = (fu) obj5;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i3 = this.d;
                if (tL_error3 != null) {
                    hl.c3(new gp6(fuVar, i3, tL_error3, tL_channels_joinChannel, (byte) 3));
                    return;
                }
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    int i4 = 0;
                    while (true) {
                        if (i4 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i4);
                            if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                z = true;
                            } else {
                                i4++;
                            }
                        } else {
                            z = false;
                        }
                    }
                    uc7.s1(i3).Y3(updates, false);
                } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    hl.c3(new ze7(i3, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat, (byte) 4));
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    uc7.s1(i3).B0(chat.id, true);
                }
                hl.c3(new c1(fuVar, (byte) 19));
                hl.d3(new zd(i3, chat, (byte) 2), 1000L);
                jf7 Y = jf7.Y(i3);
                long j = chat.id;
                Y.O1(-j, j, new ArrayList(), null);
                return;
            case 3:
                bs0 bs0Var = (bs0) obj4;
                fn7[] fn7VarArr = (fn7[]) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                ((int[]) obj5)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage2 = messageMedia.webpage;
                    if (!(webPage2 instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage2 instanceof TLRPC.TL_webPagePending) {
                                long j2 = webPage2.id;
                                int i5 = this.d;
                                es0 es0Var = new es0(j2, fn7VarArr, i5, bs0Var);
                                fn7VarArr[0] = es0Var;
                                jn7.f(i5).a(es0Var, 60);
                                return;
                            }
                            if (webPage2 instanceof TLRPC.TL_webPage) {
                                webPage = webPage2;
                            }
                            bs0Var.a(webPage);
                            return;
                        }
                        bs0Var.a(null);
                        return;
                    }
                }
                bs0Var.a(null);
                return;
            case 4:
                b71 b71Var = (b71) obj5;
                Pair pair = (Pair) obj4;
                Long l = (Long) obj;
                if (b71Var.i(pair)) {
                    Object obj6 = this.e;
                    if (obj2 != null && b71Var.b(obj6)) {
                        b71Var.a(pair, obj2);
                        lg lgVar = new lg((Object) b71Var, (Object) pair, obj2, false, (byte) 2);
                        b71Var = b71Var;
                        pair = pair;
                        hl.c3(lgVar);
                    }
                    long longValue = l.longValue();
                    int i6 = this.d;
                    b71Var.f(i6, obj6, longValue, new a71(b71Var, pair, obj2, i6, obj6));
                    return;
                }
                b71Var.a(pair, obj2);
                hl.c3(new lg((Object) b71Var, (Object) pair, obj2, true, (byte) 2));
                return;
            case 5:
                id[] idVarArr = (id[]) obj5;
                e eVar = (e) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                id idVar = idVarArr[0];
                if (idVar != null) {
                    idVar.dismiss();
                    idVarArr[0] = null;
                }
                if (tL_error5 != null) {
                    d31.b0(eVar).g0(tL_error5, false);
                    return;
                } else if (arrayList2 != null) {
                    if (arrayList2.isEmpty()) {
                        bs2.v(null, 2131751870, d31.b0(eVar), 2131624068, 36);
                        return;
                    } else if (!arrayList2.isEmpty()) {
                        eVar.showDialog(new xo2(eVar, 0L, arrayList2, new i61(eVar, chat2, i2, (byte) 1)));
                        return;
                    } else {
                        d31.b0(eVar).Q(2131624068, 36, "").j();
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                e eVar2 = (e) obj5;
                l01 l01Var = (l01) obj4;
                id idVar2 = (id) obj3;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (updates2 != null && tL_error6 == null) {
                    uc7.s1(i2).Y3(updates2, false);
                }
                hl.c3(new ao1(eVar2, tL_error6, l01Var, idVar2, false, (byte) 22));
                return;
            case 7:
                lm7 lm7Var = (lm7) obj5;
                jm7 jm7Var = (jm7) obj4;
                Context context = (Context) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                l9c l9cVar = (l9c) obj2;
                ArrayList arrayList4 = lm7Var.c;
                if (i2 != 2 || !TextUtils.isEmpty(lm7Var.Q)) {
                    ArrayList arrayList5 = jm7Var.a;
                    int size = arrayList5.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj7 = arrayList5.get(i7);
                        i7++;
                        if (obj7 instanceof r47) {
                            r47 r47Var = (r47) obj7;
                            ArrayList arrayList6 = (ArrayList) jm7Var.c.get(r47Var);
                            int i8 = s94.b;
                            b8c K = b8c.K(s94.class);
                            K.H = r47Var;
                            if (arrayList6 == null) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList(arrayList6);
                            }
                            K.I = arrayList;
                            K.d = r47Var.e1();
                            K.C = r47.B0(r47Var.k);
                            arrayList3.add(K);
                        } else if (!arrayList4.isEmpty()) {
                            HashSet hashSet = lm7Var.d;
                            ii7 ii7Var = new ii7(lm7Var, (byte) 4);
                            int i9 = n94.b;
                            b8c K2 = b8c.K(n94.class);
                            K2.H = new o94(arrayList4, hashSet, ii7Var);
                            arrayList3.add(K2);
                        } else if (lm7Var.r) {
                            arrayList3.add(b8c.e(-2, ob6.M0(2131745779, null)));
                        }
                    }
                    if ((i2 != 2 && jm7Var.p) || (!jm7Var.k && jm7Var.l)) {
                        if (jm7Var.n) {
                            ViewGroup viewGroup = jm7Var.i;
                            if (viewGroup == null) {
                                if (i2 == 2) {
                                    viewGroup = lm7Var.l0(context);
                                } else {
                                    viewGroup = lm7Var.k0(context, jm7Var.j);
                                }
                                jm7Var.i = viewGroup;
                            }
                            b8c b8cVar = new b8c(-3);
                            b8cVar.c = viewGroup;
                            b8cVar.A = 0;
                            b8cVar.z = 1;
                            arrayList3.add(b8cVar);
                        } else if (!jm7Var.k && jm7Var.l && (arrayList3.isEmpty() || (jm7Var.m && i2 != 2))) {
                            if (jm7Var.i == null) {
                                if (i2 == 2) {
                                    k0 = lm7Var.l0(context);
                                } else {
                                    k0 = lm7Var.k0(context, jm7Var.j);
                                }
                                jm7Var.i = k0;
                            }
                            if (arrayList3.isEmpty()) {
                                ViewGroup viewGroup2 = jm7Var.i;
                                b8c b8cVar2 = new b8c(-3);
                                b8cVar2.c = viewGroup2;
                                b8cVar2.A = 0;
                                b8cVar2.z = 1;
                                arrayList3.add(b8cVar2);
                            } else {
                                ((b8c) c00.g(1, arrayList3)).j = true;
                                ViewGroup viewGroup3 = jm7Var.i;
                                b8c b8cVar3 = new b8c(-1);
                                b8cVar3.c = viewGroup3;
                                b8cVar3.A = -2;
                                arrayList3.add(b8cVar3);
                            }
                        }
                    } else {
                        int i10 = 0;
                        while (true) {
                            if (jm7Var.a.isEmpty()) {
                                i = 3;
                            } else {
                                i = 1;
                            }
                            if (i10 < i) {
                                arrayList3.add(b8c.q((-10) - i10, 39));
                                i10++;
                            }
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        ((b8c) c00.g(1, arrayList3)).j = true;
                        return;
                    }
                    return;
                }
                return;
            case 8:
                Context context2 = (Context) obj4;
                nx0 nx0Var = (nx0) obj3;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str = (String) obj2;
                ((c51) obj5).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str)) {
                    if ("EMPTY".equalsIgnoreCase(str)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2);
                        String M0 = ob6.M0(2131747359, null);
                        id idVar3 = alertDialog$Builder.a;
                        idVar3.S = M0;
                        idVar3.U = ob6.M0(2131747360, null);
                        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                        idVar3.setOnDismissListener(new o1(nx0Var, (byte) 27));
                        alertDialog$Builder.o();
                        return;
                    }
                    e S = LaunchActivity.S();
                    if (S != null) {
                        if (str != null) {
                            new d31(nx0Var.F, nx0Var.J0).f0(str, false);
                            return;
                        } else if (passkey != null) {
                            uc7.s1(i2).v4(0L, "SETUP_PASSKEY");
                            if (S instanceof PasskeysActivity) {
                                nx0Var.dismiss();
                                ((PasskeysActivity) S).Y(passkey);
                                return;
                            } else if (S instanceof PrivacySettingsActivity) {
                                nx0Var.dismiss();
                                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) S;
                                ArrayList arrayList7 = privacySettingsActivity.e;
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(passkey);
                                privacySettingsActivity.F0(true);
                                S.presentFragment(new PasskeysActivity(arrayList7));
                                return;
                            } else {
                                ConnectionsManager.getInstance(i2).sendRequestTyped(new TL_account.getPasskeys(), new ic((byte) 0), new p(nx0Var, passkey, str, (byte) 24));
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 9:
                boolean[] zArr = (boolean[]) obj5;
                Context context3 = (Context) obj4;
                vnb vnbVar = (vnb) obj3;
                Long l2 = (Long) obj;
                String str2 = (String) obj2;
                if (l2 != null && l2.longValue() != 0) {
                    int i11 = this.d;
                    ov4.c(i11).j(l2.longValue(), new k16(zArr, context3, vnbVar, i11, str2, (byte) 1));
                    return;
                }
                zArr[0] = false;
                return;
            case 10:
                boolean[] zArr2 = (boolean[]) obj5;
                ArrayList arrayList8 = (ArrayList) obj4;
                icc iccVar = (icc) obj3;
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr2[0]) {
                    if (str3 != null) {
                        arrayList8.set(i2, str3);
                        for (int i12 = 0; i12 < arrayList8.size(); i12++) {
                            if (arrayList8.get(i12) == null) {
                                return;
                            }
                        }
                        zArr2[0] = true;
                        iccVar.a(TextUtils.join("", arrayList8), Boolean.FALSE);
                        return;
                    }
                    zArr2[0] = true;
                    iccVar.a(null, bool);
                    return;
                }
                return;
            default:
                vnb vnbVar2 = (vnb) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str4 = (String) obj2;
                ((Runnable[]) obj5)[0] = null;
                TextView textView = ((TextView[]) obj4)[0];
                if (textView != null && wallettransaction != null) {
                    long j3 = wallettransaction.fee;
                    if (j3 > 0) {
                        textView.setText(uqc.o0(i2, j3, vnbVar2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public f(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = i;
        this.c = obj2;
        this.e = obj3;
    }

    public f(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = i;
        this.e = obj3;
    }

    public f(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = i;
    }
}
