package ai;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.at0;
import org.telegram.ui.Components.fu0;
import org.telegram.ui.Components.gu0;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.sn;
import org.telegram.ui.xe1;
public final class r4 implements org.telegram.ui.ActionBar.z1, am0 {
    public final int f2111a;
    public final long f2112b;
    public final NotificationCenter.NotificationCenterDelegate f2113c;
    public final Object d;
    public final Object e;
    public final Object f2114f;

    public r4(Object obj, KeyEvent.Callback callback, Object obj2, long j10, Object obj3, int i10) {
        this.f2111a = i10;
        this.f2113c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.e = obj2;
        this.f2112b = j10;
        this.f2114f = obj3;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void c(final float f7, final float f10, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i11;
        long j10;
        int i12 = i10;
        final wv0 wv0Var = (wv0) this.f2113c;
        ss0 ss0Var = (ss0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f2114f;
        fu0 fu0Var = wv0Var.Q;
        gv0 gv0Var = wv0Var.R;
        gu0 gu0Var = wv0Var.f32358a0;
        hv0 hv0Var = wv0Var.S;
        org.telegram.ui.ActionBar.o2 o2Var = wv0Var.f32410v1;
        int i13 = ss0Var.F;
        if (i13 == 7) {
            if (view instanceof org.telegram.ui.Cells.wa) {
                if (!gu0Var.e.isEmpty()) {
                    i12 = ((Integer) gu0Var.e.get(i12)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = gu0Var.d.participants.participants.get(i12);
                if (i12 >= 0 && i12 < gu0Var.d.participants.participants.size()) {
                    wv0Var.L0(chatParticipant, false, view);
                    return;
                }
                return;
            }
            s4.g0 adapter = ss0Var.h.getAdapter();
            nu0 nu0Var = wv0Var.f32384j0;
            if (adapter == nu0Var) {
                TLObject E = nu0Var.E(i12);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (E instanceof TLRPC.ChatParticipant) {
                    j10 = ((TLRPC.ChatParticipant) E).user_id;
                } else {
                    return;
                }
                if (j10 != 0 && j10 != o2Var.getUserConfig().getClientUserId()) {
                    o2Var.presentFragment(new ProfileActivity(si.o0.e(j10, "user_id"), null));
                }
            }
        } else if (i13 == 6 && (view instanceof org.telegram.ui.Cells.i6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.i6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f20344id);
            if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                if (chat.forum) {
                    HashSet hashSet = xe1.f43544q1;
                    o2Var.presentFragment(xe1.D0(o2Var.getMessagesController(), o2Var.getMessagesStorage(), bundle));
                    return;
                }
                o2Var.presentFragment(new sn(bundle));
            }
        } else if (i13 == 1 && (view instanceof org.telegram.ui.Cells.k7)) {
            wv0Var.J0(i12, view, ((org.telegram.ui.Cells.k7) view).getMessage(), ss0Var.F);
        } else {
            int i14 = 3;
            if (i13 == 3 && (view instanceof org.telegram.ui.Cells.n7)) {
                wv0Var.J0(i12, view, ((org.telegram.ui.Cells.n7) view).getMessage(), ss0Var.F);
            } else if ((i13 == 2 || i13 == 4) && (view instanceof org.telegram.ui.Cells.j7)) {
                wv0Var.J0(i12, view, ((org.telegram.ui.Cells.j7) view).getMessage(), ss0Var.F);
            } else if (i13 == 5 && (view instanceof org.telegram.ui.Cells.e2)) {
                wv0Var.J0(i12, view, (MessageObject) ((org.telegram.ui.Cells.e2) view).getParentObject(), ss0Var.F);
            } else if (i13 == 0 && (view instanceof org.telegram.ui.Cells.s7)) {
                final org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                MessageObject messageObject = s7Var.getMessageObject();
                if (messageObject != null && messageObject.isSensitive()) {
                    if (o2Var != null) {
                        final int currentAccount = o2Var.getCurrentAccount();
                        final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                        final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
                        c2Var.r(200L);
                        messagesController.getContentSettings(new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                final boolean z10;
                                boolean z11;
                                org.telegram.ui.ActionBar.g6 resourceProvider;
                                int dp;
                                int dp2;
                                org.telegram.ui.ActionBar.g6 resourceProvider2;
                                int i15;
                                int i16;
                                final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                                org.telegram.ui.ActionBar.o2 o2Var2 = wv0.this.f32410v1;
                                c2Var.c(200L);
                                final MessagesController messagesController2 = messagesController;
                                if (messagesController2.config.needAgeVideoVerification.get() && !TextUtils.isEmpty(messagesController2.verifyAgeBotUsername)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if ((contentsettings == null || !contentsettings.sensitive_can_change) && z10) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                final boolean[] zArr = new boolean[1];
                                final Context context2 = context;
                                FrameLayout frameLayout = new FrameLayout(context2);
                                if (z10) {
                                    zArr[0] = true;
                                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                                    if (o2Var2 == null) {
                                        resourceProvider = null;
                                    } else {
                                        resourceProvider = o2Var2.getResourceProvider();
                                    }
                                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context2, 1, resourceProvider);
                                    z1Var.setBackground(org.telegram.ui.ActionBar.k6.M0(false));
                                    z1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                                    if (LocaleController.isRTL) {
                                        dp = AndroidUtilities.dp(16.0f);
                                    } else {
                                        dp = AndroidUtilities.dp(8.0f);
                                    }
                                    if (LocaleController.isRTL) {
                                        dp2 = AndroidUtilities.dp(8.0f);
                                    } else {
                                        dp2 = AndroidUtilities.dp(16.0f);
                                    }
                                    z1Var.setPadding(dp, 0, dp2, 0);
                                    frameLayout.addView(z1Var, w7.z5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                    z1Var.setOnClickListener(new r0(6, zArr));
                                }
                                if (o2Var2 == null) {
                                    resourceProvider2 = null;
                                } else {
                                    resourceProvider2 = o2Var2.getResourceProvider();
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, resourceProvider2);
                                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                                if (z11) {
                                    i15 = R.string.MessageShowSensitiveContentMediaTextClosed;
                                } else {
                                    i15 = R.string.MessageShowSensitiveContentMediaText;
                                }
                                alertDialog$Builder.f20679a.T = LocaleController.getString(i15);
                                alertDialog$Builder.o(frameLayout);
                                alertDialog$Builder.f20679a.G = 9;
                                if (z11) {
                                    i16 = R.string.MessageShowSensitiveContentMediaTextClosedButton;
                                } else {
                                    i16 = R.string.Cancel;
                                }
                                alertDialog$Builder.h(LocaleController.getString(i16), null);
                                if (!z11) {
                                    String string = LocaleController.getString(R.string.MessageShowSensitiveContentButton);
                                    final org.telegram.ui.Cells.s7 s7Var2 = s7Var;
                                    final float f11 = f7;
                                    final float f12 = f10;
                                    final int i17 = currentAccount;
                                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.z1() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i18) {
                                            org.telegram.ui.ActionBar.g6 resourceProvider3;
                                            TL_account.contentSettings contentsettings2;
                                            fs0 fs0Var = new fs0(org.telegram.ui.Cells.s7.this, f11, f12);
                                            if (zArr[0]) {
                                                if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                                    fs0Var.run(Boolean.TRUE);
                                                    return;
                                                }
                                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                                oy oyVar = new oy(4, messagesController2, fs0Var);
                                                if (U == null) {
                                                    resourceProvider3 = null;
                                                } else {
                                                    resourceProvider3 = U.getResourceProvider();
                                                }
                                                ThemeActivity.C0(i17, context2, oyVar, resourceProvider3);
                                                return;
                                            }
                                            fs0Var.run(Boolean.FALSE);
                                        }
                                    });
                                }
                                if (o2Var2 != null && o2Var2.getContext() != null) {
                                    o2Var2.showDialog(alertDialog$Builder.f20679a);
                                } else {
                                    alertDialog$Builder.p();
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                MessageObject messageObject2 = s7Var.f23276n;
                if (messageObject2 != null && messageObject2.hasMediaSpoilers() && s7Var.f23272i0 == 0.0f && !s7Var.f23276n.isMediaSpoilersRevealedInSharedMedia) {
                    s7Var.n(f7, f10);
                } else if (messageObject != null) {
                    wv0Var.J0(i12, view, messageObject, ss0Var.F);
                }
            } else if (wv0.r0(i13) && (view instanceof org.telegram.ui.Cells.s7)) {
                MessageObject messageObject3 = ((org.telegram.ui.Cells.s7) view).getMessageObject();
                if (messageObject3 != null) {
                    wv0Var.J0(i12, view, messageObject3, ss0Var.F);
                }
            } else {
                int i15 = ss0Var.F;
                if (i15 == 10) {
                    if (((view instanceof org.telegram.ui.Cells.i6) || f10 < AndroidUtilities.dp(60.0f)) && i12 >= 0 && i12 < fu0Var.d.size()) {
                        Bundle bundle2 = new Bundle();
                        TLObject tLObject = (TLObject) fu0Var.d.get(i12);
                        if (tLObject instanceof TLRPC.Chat) {
                            bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).f20344id);
                        } else if (tLObject instanceof TLRPC.User) {
                            bundle2.putLong("user_id", ((TLRPC.User) tLObject).f20491id);
                        } else {
                            return;
                        }
                        o2Var.presentFragment(new sn(bundle2));
                    }
                } else if (i15 == 11) {
                    if (ss0Var.h.getAdapter() == hv0Var) {
                        if (i12 >= 0) {
                            ArrayList arrayList = hv0Var.e;
                            ArrayList arrayList2 = hv0Var.f27178f;
                            if (i12 < arrayList.size()) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", o2Var.getUserConfig().getClientUserId());
                                bundle3.putInt("chatMode", 3);
                                sn snVar = new sn(bundle3);
                                snVar.f41635p4 = ((SavedMessagesController.SavedDialog) arrayList.get(i12)).dialogId;
                                o2Var.presentFragment(snVar);
                                return;
                            }
                            int size = i12 - arrayList.size();
                            if (size < arrayList2.size()) {
                                MessageObject messageObject4 = (MessageObject) arrayList2.get(size);
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("user_id", o2Var.getUserConfig().getClientUserId());
                                bundle4.putInt("message_id", messageObject4.getId());
                                at0 at0Var = new at0(wv0Var, bundle4, size);
                                at0Var.X7 = messageObject4.getId();
                                o2Var.presentFragment(at0Var);
                            }
                        }
                    } else if (wv0Var.C1) {
                        if (gv0Var.v.f46497y == 0) {
                            gv0Var.E(view);
                        }
                    } else {
                        Bundle bundle5 = new Bundle();
                        if (i12 >= 0 && i12 < gv0Var.f26795f.size()) {
                            bundle5.putLong("user_id", o2Var.getUserConfig().getClientUserId());
                            bundle5.putInt("chatMode", 3);
                            sn snVar2 = new sn(bundle5);
                            snVar2.f41635p4 = ((SavedMessagesController.SavedDialog) gv0Var.f26795f.get(i12)).dialogId;
                            o2Var.presentFragment(snVar2);
                        }
                    }
                } else if (i15 == 15 && (view instanceof org.telegram.ui.Cells.t1)) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    MessageObject messageObject5 = t1Var.getMessageObject();
                    ss0Var.h.B0();
                    int currentAccount2 = o2Var.getCurrentAccount();
                    MessagesController messagesController2 = o2Var.getMessagesController();
                    long j11 = this.f2112b;
                    TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j11));
                    h80 F = h80.F(ss0Var, g6Var, t1Var);
                    F.f26903c0 = true;
                    if (messageObject5.isOutOwner()) {
                        i14 = 5;
                    }
                    F.V(i14);
                    F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new a3.i0(wv0Var, j11, messageObject5, 24), false);
                    if (!messageObject5.isPollClosed()) {
                        if (messageObject5.canUnvote()) {
                            F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new wr0(wv0Var, g6Var, currentAccount2, messageObject5), false);
                        }
                        if (!messageObject5.isForwarded() && ((messageObject5.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                            int i16 = R.drawable.msg_pollstop;
                            if (messageObject5.isQuiz()) {
                                i11 = R.string.StopQuiz;
                            } else {
                                i11 = R.string.StopPoll;
                            }
                            F.c(i16, LocaleController.getString(i11), new wr0(wv0Var, g6Var, messageObject5, currentAccount2), false);
                        }
                    }
                    F.Z();
                }
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f2111a) {
            case 1:
                sn.O0((sn) this.f2113c, (TLRPC.TL_game) this.d, (MessageObject) this.e, (String) this.f2114f, this.f2112b);
                return;
            default:
                v31 v31Var = (v31) this.f2113c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                org.telegram.ui.Components.pc pcVar = (org.telegram.ui.Components.pc) this.f2114f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j10 = this.f2112b;
                    if (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j10 == ((Integer) obj).intValue()) {
                            v31Var.n(0L, false);
                        }
                    } else {
                        v31Var.f31307h0.addAll(hashSet);
                        v31Var.q();
                        org.telegram.ui.Components.vc.a0(v31Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new c3(v31Var, hashSet, arrayList, j10, 18), new jo0(v31Var, arrayList, pcVar, 13)).j();
                        c2Var.dismiss();
                        return;
                    }
                }
        }
    }

    public r4(sn snVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        this.f2111a = 1;
        this.f2113c = snVar;
        this.d = tL_game;
        this.e = messageObject;
        this.f2114f = str;
        this.f2112b = j10;
    }

    public r4(v31 v31Var, ArrayList arrayList, long j10, HashSet hashSet, org.telegram.ui.Components.pc pcVar) {
        this.f2111a = 3;
        this.f2113c = v31Var;
        this.d = arrayList;
        this.f2112b = j10;
        this.e = hashSet;
        this.f2114f = pcVar;
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
