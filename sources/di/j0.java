package di;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.hq0;
public final class j0 implements q10 {
    public final int f9059a;
    public final int f9060b;
    public final Object f9061c;
    public final Object d;
    public final Object f9062e;

    public j0(int i7, org.telegram.ui.ActionBar.h2 h2Var, vf.b bVar, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f9059a = 0;
        this.f9060b = i7;
        this.f9061c = h2Var;
        this.d = bVar;
        this.f9062e = u1Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i7 = this.f9059a;
        TLRPC.WebPage webPage = null;
        int i10 = this.f9060b;
        boolean z11 = false;
        Object obj3 = this.f9062e;
        Object obj4 = this.d;
        Object obj5 = this.f9061c;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj5;
                vf.b bVar = (vf.b) obj4;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    mp.u1(i10).V3(updates, false);
                }
                org.telegram.messenger.g0.g3(new ai.s(h2Var, tL_error, bVar, u1Var, 8));
                return;
            case 1:
                boolean[] zArr = (boolean[]) obj5;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj3;
                Long l10 = (Long) obj;
                String str = (String) obj2;
                if (l10 != null && l10.longValue() != 0) {
                    int i11 = this.f9060b;
                    org.telegram.messenger.u9.c(i11).j(l10.longValue(), new b4(zArr, context, i6Var, i11, str, 0));
                    return;
                }
                zArr[0] = false;
                return;
            case 2:
                ki.y0 y0Var = (ki.y0) obj4;
                fs[] fsVarArr = (fs[]) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ((int[]) obj5)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage2 = messageMedia.webpage;
                    if (!(webPage2 instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage2 instanceof TLRPC.TL_webPagePending) {
                                long j3 = webPage2.f28558id;
                                int i12 = this.f9060b;
                                ki.a1 a1Var = new ki.a1(j3, fsVarArr, i12, y0Var);
                                fsVarArr[0] = a1Var;
                                ks.f(i12).b(a1Var, 59);
                                return;
                            }
                            if (webPage2 instanceof TLRPC.TL_webPage) {
                                webPage = webPage2;
                            }
                            y0Var.a(webPage);
                            return;
                        }
                        y0Var.a(null);
                        return;
                    }
                }
                y0Var.a(null);
                return;
            case 3:
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) obj4;
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr[0];
                if (u1Var2 != null) {
                    u1Var2.dismiss();
                    u1VarArr[0] = null;
                }
                if (tL_error3 != null) {
                    org.telegram.ui.Components.lc.b0(h2Var2).g0(tL_error3, false);
                    return;
                } else if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        org.telegram.messenger.f3.n(null, 2131751894, org.telegram.ui.Components.lc.b0(h2Var2), 2131624068, 36);
                        return;
                    } else if (!arrayList.isEmpty()) {
                        h2Var2.showDialog(new li.d0(h2Var2, 0L, arrayList, new bi.d5(h2Var2, chat, i10, 2)));
                        return;
                    } else {
                        org.telegram.ui.Components.lc.b0(h2Var2).Q(2131624068, 36, "").j();
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
                int i13 = this.f9060b;
                if (tL_error4 != null) {
                    org.telegram.messenger.g0.g3(new bi.t4(a1Var2, i13, tL_error4, tL_channels_joinChannel, 14));
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
                    mp.u1(i13).V3(updates2, false);
                    z11 = z10;
                } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.b0(i13, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat2, 2));
                    z11 = true;
                }
                if (!z11) {
                    mp.u1(i13).D0(chat2.f28403id, true);
                }
                org.telegram.messenger.g0.g3(new hq0(a1Var2, 5));
                org.telegram.messenger.g0.h3(new ai.w0(i13, chat2, 21), 1000L);
                tr a02 = tr.a0(i13);
                long j10 = chat2.f28403id;
                a02.R1(-j10, j10, new ArrayList(), null);
                return;
            case 5:
                org.telegram.ui.Components.m0 m0Var = (org.telegram.ui.Components.m0) obj5;
                org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) obj4;
                TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = (TLRPC.TL_messages_composeMessageWithAI) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout = m0Var.E2;
                m0Var.V2 = -1;
                m0Var.W2 = false;
                if (tL_error5 != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error5.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error5.text))) {
                    new org.telegram.ui.Components.lc(frameLayout, m0Var.J0).I(2131624217, gd.M0(2131754989, null), org.telegram.messenger.g0.W2(gd.M0(2131754990, null))).j();
                    m0Var.I2 = true;
                    m0Var.B1(true);
                    return;
                } else if (tL_error5 != null) {
                    org.telegram.ui.Cells.c0.t(frameLayout, m0Var.J0, tL_error5, false);
                    n5Var.i(null);
                    m0Var.H2 = true;
                    m0Var.I2 = false;
                    m0Var.B1(true);
                    return;
                } else if (tL_composedMessageWithAI == null) {
                    n5Var.i(null);
                    m0Var.H2 = true;
                    m0Var.I2 = false;
                    m0Var.B1(true);
                    return;
                } else {
                    n5Var.i(null);
                    m0Var.I2 = false;
                    m0Var.B1(true);
                    m0Var.X2[i10] = tL_messages_composeMessageWithAI;
                    if (i10 == 0) {
                        m0Var.V1 = false;
                        m0Var.W1 = fj.h0(tL_composedMessageWithAI.result_text, false);
                    } else if (i10 == 1) {
                        m0Var.Y1 = false;
                        m0Var.Z1 = fj.h0(tL_composedMessageWithAI.result_text, false);
                    } else if (i10 == 2) {
                        m0Var.f37282b2 = false;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_composedMessageWithAI.diff_text;
                        if (tL_textWithEntities != null) {
                            m0Var.f37283c2 = fj.h0(tL_textWithEntities, false);
                            m0Var.f37284e2 = fj.h0(tL_composedMessageWithAI.result_text, false);
                        } else {
                            CharSequence h02 = fj.h0(tL_composedMessageWithAI.result_text, false);
                            m0Var.f37284e2 = h02;
                            m0Var.f37283c2 = h02;
                        }
                    }
                    m0Var.P2.O(true);
                    return;
                }
            case 6:
                org.telegram.ui.Components.m0 m0Var2 = (org.telegram.ui.Components.m0) obj5;
                org.telegram.ui.ActionBar.n5 n5Var2 = (org.telegram.ui.ActionBar.n5) obj4;
                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = (TLRPC.TL_messages_composeRichMessageWithAI) obj3;
                TLRPC.TL_composedRichMessageWithAI tL_composedRichMessageWithAI = (TLRPC.TL_composedRichMessageWithAI) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout2 = m0Var2.E2;
                m0Var2.V2 = -1;
                m0Var2.W2 = false;
                if (tL_error6 != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error6.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error6.text))) {
                    new org.telegram.ui.Components.lc(frameLayout2, m0Var2.J0).I(2131624217, gd.M0(2131754989, null), org.telegram.messenger.g0.W2(gd.M0(2131754990, null))).j();
                    m0Var2.I2 = true;
                    m0Var2.B1(true);
                    return;
                } else if (tL_error6 != null) {
                    org.telegram.ui.Cells.c0.t(frameLayout2, m0Var2.J0, tL_error6, false);
                    n5Var2.i(null);
                    m0Var2.H2 = true;
                    m0Var2.I2 = false;
                    m0Var2.B1(true);
                    return;
                } else if (tL_composedRichMessageWithAI == null) {
                    n5Var2.i(null);
                    m0Var2.H2 = true;
                    m0Var2.I2 = false;
                    m0Var2.B1(true);
                    return;
                } else {
                    n5Var2.i(null);
                    m0Var2.I2 = false;
                    m0Var2.B1(true);
                    m0Var2.Y2[i10] = tL_messages_composeRichMessageWithAI;
                    if (i10 == 0) {
                        m0Var2.V1 = false;
                        m0Var2.X1 = tL_composedRichMessageWithAI.result;
                    } else if (i10 == 1) {
                        m0Var2.Y1 = false;
                        m0Var2.f37281a2 = tL_composedRichMessageWithAI.result;
                    } else if (i10 == 2) {
                        m0Var2.f37282b2 = false;
                        m0Var2.d2 = tL_composedRichMessageWithAI.result;
                    }
                    m0Var2.P2.O(true);
                    return;
                }
            case 7:
                boolean[] zArr2 = (boolean[]) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                q10 q10Var = (q10) obj3;
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
                        q10Var.a(TextUtils.join("", arrayList2), Boolean.FALSE);
                        return;
                    }
                    zArr2[0] = true;
                    q10Var.a(null, bool);
                    return;
                }
                return;
            case 8:
                Context context2 = (Context) obj4;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj3;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str3 = (String) obj2;
                ((hi.d) obj5).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str3)) {
                    if ("EMPTY".equalsIgnoreCase(str3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2);
                        String M0 = gd.M0(2131747439, null);
                        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder.f28744a;
                        u1Var3.S = M0;
                        u1Var3.U = gd.M0(2131747440, null);
                        alertDialog$Builder.k(gd.M0(2131747638, null), null);
                        u1Var3.setOnDismissListener(new org.telegram.ui.q5(x2Var, 9));
                        alertDialog$Builder.p();
                        return;
                    }
                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                    if (T != null) {
                        if (str3 != null) {
                            new org.telegram.ui.Components.lc(x2Var.F, x2Var.J0).f0(str3, false);
                            return;
                        } else if (passkey != null) {
                            mp.u1(i10).s4(0L, "SETUP_PASSKEY");
                            if (T instanceof PasskeysActivity) {
                                x2Var.dismiss();
                                ((PasskeysActivity) T).d0(passkey);
                                return;
                            } else if (T instanceof PrivacySettingsActivity) {
                                x2Var.dismiss();
                                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) T;
                                ArrayList arrayList3 = privacySettingsActivity.f43499e;
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(passkey);
                                privacySettingsActivity.F0(true);
                                T.presentFragment(new PasskeysActivity(arrayList3));
                                return;
                            } else {
                                ConnectionsManager.getInstance(i10).sendRequestTyped(new TL_account.getPasskeys(), new d3.b(1), new org.telegram.ui.m6(x2Var, passkey, str3, 3));
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
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str4 = (String) obj2;
                ((Runnable[]) obj5)[0] = null;
                TextView textView = ((TextView[]) obj4)[0];
                if (textView != null && wallettransaction != null) {
                    long j11 = wallettransaction.fee;
                    if (j11 > 0) {
                        textView.setText(org.telegram.ui.Wallet.n6.z0(i10, j11, i6Var2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public j0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f9059a = i10;
        this.f9061c = obj;
        this.f9060b = i7;
        this.d = obj2;
        this.f9062e = obj3;
    }

    public j0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f9059a = i10;
        this.f9061c = obj;
        this.d = obj2;
        this.f9060b = i7;
        this.f9062e = obj3;
    }

    public j0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f9059a = i10;
        this.f9061c = obj;
        this.d = obj2;
        this.f9062e = obj3;
        this.f9060b = i7;
    }

    public j0(org.telegram.ui.ActionBar.u1[] u1VarArr, org.telegram.ui.ActionBar.h2 h2Var, int i7, TLRPC.Chat chat) {
        this.f9059a = 3;
        this.d = u1VarArr;
        this.f9061c = h2Var;
        this.f9060b = i7;
        this.f9062e = chat;
    }
}
