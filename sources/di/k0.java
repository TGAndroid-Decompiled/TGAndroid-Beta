package di;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.fq0;
public final class k0 implements s10 {
    public final int f8892a;
    public final int f8893b;
    public final Object f8894c;
    public final Object d;
    public final Object f8895e;

    public k0(int i7, org.telegram.ui.ActionBar.e2 e2Var, vf.b bVar, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f8892a = 0;
        this.f8893b = i7;
        this.f8894c = e2Var;
        this.d = bVar;
        this.f8895e = t1Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i7 = this.f8892a;
        TLRPC.WebPage webPage = null;
        int i10 = this.f8893b;
        boolean z11 = false;
        Object obj3 = this.f8895e;
        Object obj4 = this.d;
        Object obj5 = this.f8894c;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj5;
                vf.b bVar = (vf.b) obj4;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    np.s1(i10).O3(updates, false);
                }
                org.telegram.messenger.g0.h3(new ai.r(e2Var, tL_error, bVar, t1Var, 7));
                return;
            case 1:
                boolean[] zArr = (boolean[]) obj5;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj3;
                Long l10 = (Long) obj;
                String str = (String) obj2;
                if (l10 != null && l10.longValue() != 0) {
                    int i11 = this.f8893b;
                    org.telegram.messenger.v9.c(i11).j(l10.longValue(), new z3(zArr, context, e6Var, i11, str, 0));
                    return;
                }
                zArr[0] = false;
                return;
            case 2:
                ki.a1 a1Var = (ki.a1) obj4;
                is[] isVarArr = (is[]) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ((int[]) obj5)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage2 = messageMedia.webpage;
                    if (!(webPage2 instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage2 instanceof TLRPC.TL_webPagePending) {
                                long j3 = webPage2.f28206id;
                                int i12 = this.f8893b;
                                ki.c1 c1Var = new ki.c1(j3, isVarArr, i12, a1Var);
                                isVarArr[0] = c1Var;
                                ns.f(i12).b(c1Var, 59);
                                return;
                            }
                            if (webPage2 instanceof TLRPC.TL_webPage) {
                                webPage = webPage2;
                            }
                            a1Var.a(webPage);
                            return;
                        }
                        a1Var.a(null);
                        return;
                    }
                }
                a1Var.a(null);
                return;
            case 3:
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) obj4;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr[0];
                if (t1Var2 != null) {
                    t1Var2.dismiss();
                    t1VarArr[0] = null;
                }
                if (tL_error3 != null) {
                    org.telegram.ui.Components.cc.a0(e2Var2).f0(tL_error3, false);
                    return;
                } else if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        org.telegram.messenger.k5.n(null, 2131751905, org.telegram.ui.Components.cc.a0(e2Var2), 2131624068, 36);
                        return;
                    } else if (!arrayList.isEmpty()) {
                        e2Var2.showDialog(new li.d0(e2Var2, 0L, arrayList, new bi.w2(e2Var2, chat, i10, 2)));
                        return;
                    } else {
                        org.telegram.ui.Components.cc.a0(e2Var2).Q(2131624068, 36, "").j();
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.a1 a1Var2 = (org.telegram.ui.a1) obj5;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                int i13 = this.f8893b;
                if (tL_error4 != null) {
                    org.telegram.messenger.g0.h3(new ci.p0(a1Var2, i13, tL_error4, tL_channels_joinChannel, 13));
                    return;
                }
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    int i14 = 0;
                    while (true) {
                        if (i14 < updates2.updates.size()) {
                            TLRPC.Update update = updates2.updates.get(i14);
                            if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                z10 = true;
                            } else {
                                i14++;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                    np.s1(i13).O3(updates2, false);
                    z11 = z10;
                } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.f0(i13, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat2, 1));
                    z11 = true;
                }
                if (!z11) {
                    np.s1(i13).B0(chat2.f28051id, true);
                }
                org.telegram.messenger.g0.h3(new fq0(a1Var2, 5));
                org.telegram.messenger.g0.i3(new ai.w0(i13, chat2, 18), 1000L);
                vr a02 = vr.a0(i13);
                long j10 = chat2.f28051id;
                a02.R1(-j10, j10, new ArrayList(), null);
                return;
            case 5:
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) obj5;
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) obj4;
                TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = (TLRPC.TL_messages_composeMessageWithAI) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout = d0Var.C2;
                d0Var.M2 = -1;
                d0Var.N2 = false;
                if (tL_error5 != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error5.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error5.text))) {
                    new org.telegram.ui.Components.cc(frameLayout, d0Var.J0).I(2131624217, hd.M0(2131754989, null), org.telegram.messenger.g0.X2(hd.M0(2131754990, null))).j();
                    d0Var.G2 = true;
                    d0Var.u1(true);
                    return;
                } else if (tL_error5 != null) {
                    org.telegram.ui.Cells.y0.q(frameLayout, d0Var.J0, tL_error5, false);
                    j5Var.i(null);
                    d0Var.F2 = true;
                    d0Var.G2 = false;
                    d0Var.u1(true);
                    return;
                } else if (tL_composedMessageWithAI == null) {
                    j5Var.i(null);
                    d0Var.F2 = true;
                    d0Var.G2 = false;
                    d0Var.u1(true);
                    return;
                } else {
                    j5Var.i(null);
                    d0Var.G2 = false;
                    d0Var.u1(true);
                    d0Var.O2[i10] = tL_messages_composeMessageWithAI;
                    if (i10 == 0) {
                        d0Var.V1 = false;
                        d0Var.W1 = gj.h0(tL_composedMessageWithAI.result_text, false);
                    } else if (i10 == 1) {
                        d0Var.Y1 = false;
                        d0Var.Z1 = gj.h0(tL_composedMessageWithAI.result_text, false);
                    } else if (i10 == 2) {
                        d0Var.f33750b2 = false;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_composedMessageWithAI.diff_text;
                        if (tL_textWithEntities != null) {
                            d0Var.f33751c2 = gj.h0(tL_textWithEntities, false);
                            d0Var.f33752e2 = gj.h0(tL_composedMessageWithAI.result_text, false);
                        } else {
                            CharSequence h02 = gj.h0(tL_composedMessageWithAI.result_text, false);
                            d0Var.f33752e2 = h02;
                            d0Var.f33751c2 = h02;
                        }
                    }
                    d0Var.K2.O(true);
                    return;
                }
            case 6:
                org.telegram.ui.Components.d0 d0Var2 = (org.telegram.ui.Components.d0) obj5;
                org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) obj4;
                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = (TLRPC.TL_messages_composeRichMessageWithAI) obj3;
                TLRPC.TL_composedRichMessageWithAI tL_composedRichMessageWithAI = (TLRPC.TL_composedRichMessageWithAI) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout2 = d0Var2.C2;
                d0Var2.M2 = -1;
                d0Var2.N2 = false;
                if (tL_error6 != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error6.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error6.text))) {
                    new org.telegram.ui.Components.cc(frameLayout2, d0Var2.J0).I(2131624217, hd.M0(2131754989, null), org.telegram.messenger.g0.X2(hd.M0(2131754990, null))).j();
                    d0Var2.G2 = true;
                    d0Var2.u1(true);
                    return;
                } else if (tL_error6 != null) {
                    org.telegram.ui.Cells.y0.q(frameLayout2, d0Var2.J0, tL_error6, false);
                    j5Var2.i(null);
                    d0Var2.F2 = true;
                    d0Var2.G2 = false;
                    d0Var2.u1(true);
                    return;
                } else if (tL_composedRichMessageWithAI == null) {
                    j5Var2.i(null);
                    d0Var2.F2 = true;
                    d0Var2.G2 = false;
                    d0Var2.u1(true);
                    return;
                } else {
                    j5Var2.i(null);
                    d0Var2.G2 = false;
                    d0Var2.u1(true);
                    d0Var2.P2[i10] = tL_messages_composeRichMessageWithAI;
                    if (i10 == 0) {
                        d0Var2.V1 = false;
                        d0Var2.X1 = tL_composedRichMessageWithAI.result;
                    } else if (i10 == 1) {
                        d0Var2.Y1 = false;
                        d0Var2.f33749a2 = tL_composedRichMessageWithAI.result;
                    } else if (i10 == 2) {
                        d0Var2.f33750b2 = false;
                        d0Var2.d2 = tL_composedRichMessageWithAI.result;
                    }
                    d0Var2.K2.O(true);
                    return;
                }
            case 7:
                boolean[] zArr2 = (boolean[]) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                s10 s10Var = (s10) obj3;
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr2[0]) {
                    if (str2 != null) {
                        arrayList2.set(i10, str2);
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            if (arrayList2.get(i15) == null) {
                                return;
                            }
                        }
                        zArr2[0] = true;
                        s10Var.a(TextUtils.join("", arrayList2), Boolean.FALSE);
                        return;
                    }
                    zArr2[0] = true;
                    s10Var.a(null, bool);
                    return;
                }
                return;
            case 8:
                Context context2 = (Context) obj4;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj3;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str3 = (String) obj2;
                ((hi.d) obj5).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str3)) {
                    if ("EMPTY".equalsIgnoreCase(str3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2);
                        String M0 = hd.M0(2131747632, null);
                        org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder.f28392a;
                        t1Var3.S = M0;
                        t1Var3.U = hd.M0(2131747633, null);
                        alertDialog$Builder.k(hd.M0(2131747831, null), null);
                        t1Var3.setOnDismissListener(new org.telegram.ui.q5(u2Var, 9));
                        alertDialog$Builder.p();
                        return;
                    }
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    if (T != null) {
                        if (str3 != null) {
                            new org.telegram.ui.Components.cc(u2Var.F, u2Var.J0).e0(str3, false);
                            return;
                        } else if (passkey != null) {
                            np.s1(i10).k4(0L, "SETUP_PASSKEY");
                            if (T instanceof PasskeysActivity) {
                                u2Var.dismiss();
                                ((PasskeysActivity) T).d0(passkey);
                                return;
                            } else if (T instanceof PrivacySettingsActivity) {
                                u2Var.dismiss();
                                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) T;
                                ArrayList arrayList3 = privacySettingsActivity.f43054e;
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(passkey);
                                privacySettingsActivity.F0(true);
                                T.presentFragment(new PasskeysActivity(arrayList3));
                                return;
                            } else {
                                ConnectionsManager.getInstance(i10).sendRequestTyped(new TL_account.getPasskeys(), new d3.b(1), new org.telegram.ui.n6(u2Var, passkey, str3, 3));
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str4 = (String) obj2;
                ((Runnable[]) obj5)[0] = null;
                TextView textView = ((TextView[]) obj4)[0];
                if (textView != null && wallettransaction != null) {
                    long j11 = wallettransaction.fee;
                    if (j11 > 0) {
                        textView.setText(org.telegram.ui.Wallet.y5.w0(i10, j11, e6Var2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public k0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f8892a = i10;
        this.f8894c = obj;
        this.f8893b = i7;
        this.d = obj2;
        this.f8895e = obj3;
    }

    public k0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f8892a = i10;
        this.f8894c = obj;
        this.d = obj2;
        this.f8893b = i7;
        this.f8895e = obj3;
    }

    public k0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f8892a = i10;
        this.f8894c = obj;
        this.d = obj2;
        this.f8895e = obj3;
        this.f8893b = i7;
    }

    public k0(org.telegram.ui.ActionBar.t1[] t1VarArr, org.telegram.ui.ActionBar.e2 e2Var, int i7, TLRPC.Chat chat) {
        this.f8892a = 3;
        this.d = t1VarArr;
        this.f8894c = e2Var;
        this.f8893b = i7;
        this.f8895e = chat;
    }
}
