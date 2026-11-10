package bi;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.jq0;
public final class v0 implements v10 {
    public final int f4855a;
    public final int f4856b;
    public final Object f4857c;
    public final Object d;
    public final Object f4858e;

    public v0(int i7, org.telegram.ui.ActionBar.f2 f2Var, vf.b bVar, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f4855a = 0;
        this.f4856b = i7;
        this.f4857c = f2Var;
        this.d = bVar;
        this.f4858e = u1Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z9;
        int i7 = this.f4855a;
        TLRPC.WebPage webPage = null;
        int i10 = this.f4856b;
        boolean z10 = false;
        Object obj3 = this.f4858e;
        Object obj4 = this.d;
        Object obj5 = this.f4857c;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj5;
                vf.b bVar = (vf.b) obj4;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    qp.s1(i10).O3(updates, false);
                }
                org.telegram.messenger.g0.h3(new ai.d0(f2Var, tL_error, bVar, u1Var, 4));
                return;
            case 1:
                boolean[] zArr = (boolean[]) obj5;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj3;
                Long l10 = (Long) obj;
                String str = (String) obj2;
                if (l10 != null && l10.longValue() != 0) {
                    int i11 = this.f4856b;
                    org.telegram.messenger.w9.c(i11).j(l10.longValue(), new z4(zArr, context, h6Var, i11, str, 0));
                    return;
                }
                zArr[0] = false;
                return;
            case 2:
                hi.z0 z0Var = (hi.z0) obj4;
                ls[] lsVarArr = (ls[]) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ((int[]) obj5)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage2 = messageMedia.webpage;
                    if (!(webPage2 instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage2 instanceof TLRPC.TL_webPagePending) {
                                long j3 = webPage2.f27115id;
                                int i12 = this.f4856b;
                                hi.b1 b1Var = new hi.b1(j3, lsVarArr, i12, z0Var);
                                lsVarArr[0] = b1Var;
                                qs.f(i12).b(b1Var, 59);
                                return;
                            }
                            if (webPage2 instanceof TLRPC.TL_webPage) {
                                webPage = webPage2;
                            }
                            z0Var.a(webPage);
                            return;
                        }
                        z0Var.a(null);
                        return;
                    }
                }
                z0Var.a(null);
                return;
            case 3:
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) obj4;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr[0];
                if (u1Var2 != null) {
                    u1Var2.dismiss();
                    u1VarArr[0] = null;
                }
                if (tL_error3 != null) {
                    org.telegram.ui.Components.gc.a0(f2Var2).f0(tL_error3, false);
                    return;
                } else if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        org.telegram.messenger.k5.o(null, 2131751905, org.telegram.ui.Components.gc.a0(f2Var2), 2131624067, 36);
                        return;
                    } else if (!arrayList.isEmpty()) {
                        f2Var2.showDialog(new ii.d0(f2Var2, 0L, arrayList, new hi.d4(f2Var2, chat, i10, 1)));
                        return;
                    } else {
                        org.telegram.ui.Components.gc.a0(f2Var2).Q(2131624067, 36, "").j();
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.a1 a1Var = (org.telegram.ui.a1) obj5;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                int i13 = this.f4856b;
                if (tL_error4 != null) {
                    org.telegram.messenger.g0.h3(new ai.a1(a1Var, i13, tL_error4, tL_channels_joinChannel, 13));
                    return;
                }
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    int i14 = 0;
                    while (true) {
                        if (i14 < updates2.updates.size()) {
                            TLRPC.Update update = updates2.updates.get(i14);
                            if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                z9 = true;
                            } else {
                                i14++;
                            }
                        } else {
                            z9 = false;
                        }
                    }
                    qp.s1(i13).O3(updates2, false);
                    z10 = z9;
                } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    org.telegram.messenger.g0.h3(new ai.e0(i13, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat2, 28));
                    z10 = true;
                }
                if (!z10) {
                    qp.s1(i13).B0(chat2.f26960id, true);
                }
                org.telegram.messenger.g0.h3(new jq0(a1Var, 5));
                org.telegram.messenger.g0.i3(new bg.m0(i13, chat2, 17), 1000L);
                yr a02 = yr.a0(i13);
                long j10 = chat2.f26960id;
                a02.R1(-j10, j10, new ArrayList(), null);
                return;
            case 5:
                org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) obj5;
                org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) obj4;
                TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = (TLRPC.TL_messages_composeMessageWithAI) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout = f0Var.B2;
                f0Var.L2 = -1;
                f0Var.M2 = false;
                if (tL_error5 != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error5.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error5.text))) {
                    new org.telegram.ui.Components.gc(frameLayout, f0Var.I0).I(2131624216, org.telegram.messenger.id.M0(2131754989, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131754990, null))).j();
                    f0Var.F2 = true;
                    f0Var.u1(true);
                    return;
                } else if (tL_error5 != null) {
                    org.telegram.ui.Cells.f1.r(frameLayout, f0Var.I0, tL_error5, false);
                    m5Var.i(null);
                    f0Var.E2 = true;
                    f0Var.F2 = false;
                    f0Var.u1(true);
                    return;
                } else if (tL_composedMessageWithAI == null) {
                    m5Var.i(null);
                    f0Var.E2 = true;
                    f0Var.F2 = false;
                    f0Var.u1(true);
                    return;
                } else {
                    m5Var.i(null);
                    f0Var.F2 = false;
                    f0Var.u1(true);
                    f0Var.N2[i10] = tL_messages_composeMessageWithAI;
                    if (i10 == 0) {
                        f0Var.U1 = false;
                        f0Var.V1 = ij.h0(tL_composedMessageWithAI.result_text, false);
                    } else if (i10 == 1) {
                        f0Var.X1 = false;
                        f0Var.Y1 = ij.h0(tL_composedMessageWithAI.result_text, false);
                    } else if (i10 == 2) {
                        f0Var.f33405a2 = false;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_composedMessageWithAI.diff_text;
                        if (tL_textWithEntities != null) {
                            f0Var.f33406b2 = ij.h0(tL_textWithEntities, false);
                            f0Var.d2 = ij.h0(tL_composedMessageWithAI.result_text, false);
                        } else {
                            CharSequence h02 = ij.h0(tL_composedMessageWithAI.result_text, false);
                            f0Var.d2 = h02;
                            f0Var.f33406b2 = h02;
                        }
                    }
                    f0Var.J2.O(true);
                    return;
                }
            case 6:
                org.telegram.ui.Components.f0 f0Var2 = (org.telegram.ui.Components.f0) obj5;
                org.telegram.ui.ActionBar.m5 m5Var2 = (org.telegram.ui.ActionBar.m5) obj4;
                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = (TLRPC.TL_messages_composeRichMessageWithAI) obj3;
                TLRPC.TL_composedRichMessageWithAI tL_composedRichMessageWithAI = (TLRPC.TL_composedRichMessageWithAI) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout2 = f0Var2.B2;
                f0Var2.L2 = -1;
                f0Var2.M2 = false;
                if (tL_error6 != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error6.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error6.text))) {
                    new org.telegram.ui.Components.gc(frameLayout2, f0Var2.I0).I(2131624216, org.telegram.messenger.id.M0(2131754989, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131754990, null))).j();
                    f0Var2.F2 = true;
                    f0Var2.u1(true);
                    return;
                } else if (tL_error6 != null) {
                    org.telegram.ui.Cells.f1.r(frameLayout2, f0Var2.I0, tL_error6, false);
                    m5Var2.i(null);
                    f0Var2.E2 = true;
                    f0Var2.F2 = false;
                    f0Var2.u1(true);
                    return;
                } else if (tL_composedRichMessageWithAI == null) {
                    m5Var2.i(null);
                    f0Var2.E2 = true;
                    f0Var2.F2 = false;
                    f0Var2.u1(true);
                    return;
                } else {
                    m5Var2.i(null);
                    f0Var2.F2 = false;
                    f0Var2.u1(true);
                    f0Var2.O2[i10] = tL_messages_composeRichMessageWithAI;
                    if (i10 == 0) {
                        f0Var2.U1 = false;
                        f0Var2.W1 = tL_composedRichMessageWithAI.result;
                    } else if (i10 == 1) {
                        f0Var2.X1 = false;
                        f0Var2.Z1 = tL_composedRichMessageWithAI.result;
                    } else if (i10 == 2) {
                        f0Var2.f33405a2 = false;
                        f0Var2.f33407c2 = tL_composedRichMessageWithAI.result;
                    }
                    f0Var2.J2.O(true);
                    return;
                }
            case 7:
                boolean[] zArr2 = (boolean[]) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                v10 v10Var = (v10) obj3;
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
                        v10Var.a(TextUtils.join("", arrayList2), Boolean.FALSE);
                        return;
                    }
                    zArr2[0] = true;
                    v10Var.a(null, bool);
                    return;
                }
                return;
            case 8:
                Context context2 = (Context) obj4;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj3;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str3 = (String) obj2;
                ((fi.d) obj5).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str3)) {
                    if ("EMPTY".equalsIgnoreCase(str3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2);
                        String M0 = org.telegram.messenger.id.M0(2131747632, null);
                        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder.f27300a;
                        u1Var3.R = M0;
                        u1Var3.T = org.telegram.messenger.id.M0(2131747633, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                        u1Var3.setOnDismissListener(new org.telegram.ui.q5(w2Var, 9));
                        alertDialog$Builder.p();
                        return;
                    }
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        if (str3 != null) {
                            new org.telegram.ui.Components.gc(w2Var.E, w2Var.I0).e0(str3, false);
                            return;
                        } else if (passkey != null) {
                            qp.s1(i10).k4(0L, "SETUP_PASSKEY");
                            if (T instanceof PasskeysActivity) {
                                w2Var.dismiss();
                                ((PasskeysActivity) T).d0(passkey);
                                return;
                            } else if (T instanceof PrivacySettingsActivity) {
                                w2Var.dismiss();
                                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) T;
                                ArrayList arrayList3 = privacySettingsActivity.f41681e;
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(passkey);
                                privacySettingsActivity.F0(true);
                                T.presentFragment(new PasskeysActivity(arrayList3));
                                return;
                            } else {
                                ConnectionsManager.getInstance(i10).sendRequestTyped(new TL_account.getPasskeys(), new d3.b(1), new org.telegram.ui.n6(w2Var, passkey, str3, 3));
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
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str4 = (String) obj2;
                ((Runnable[]) obj5)[0] = null;
                TextView textView = ((TextView[]) obj4)[0];
                if (textView != null && wallettransaction != null) {
                    long j11 = wallettransaction.fee;
                    if (j11 > 0) {
                        textView.setText(org.telegram.ui.Wallet.z5.w0(i10, j11, h6Var2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public v0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f4855a = i10;
        this.f4857c = obj;
        this.f4856b = i7;
        this.d = obj2;
        this.f4858e = obj3;
    }

    public v0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f4855a = i10;
        this.f4857c = obj;
        this.d = obj2;
        this.f4856b = i7;
        this.f4858e = obj3;
    }

    public v0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f4855a = i10;
        this.f4857c = obj;
        this.d = obj2;
        this.f4858e = obj3;
        this.f4856b = i7;
    }

    public v0(org.telegram.ui.ActionBar.u1[] u1VarArr, org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.Chat chat) {
        this.f4855a = 3;
        this.d = u1VarArr;
        this.f4857c = f2Var;
        this.f4856b = i7;
        this.f4858e = chat;
    }
}
