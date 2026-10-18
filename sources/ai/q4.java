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
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.dv0;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.os0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.sn;
import org.telegram.ui.te1;
public final class q4 implements org.telegram.ui.ActionBar.a2, xl0 {
    public final int f2056a;
    public final long f2057b;
    public final NotificationCenter.NotificationCenterDelegate f2058c;
    public final Object d;
    public final Object e;
    public final Object f2059f;

    public q4(Object obj, KeyEvent.Callback callback, Object obj2, long j10, Object obj3, int i10) {
        this.f2056a = i10;
        this.f2058c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.e = obj2;
        this.f2057b = j10;
        this.f2059f = obj3;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void d(final float f7, final float f10, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i11;
        long j10;
        int i12 = i10;
        final sv0 sv0Var = (sv0) this.f2058c;
        os0 os0Var = (os0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f2059f;
        bu0 bu0Var = sv0Var.Q;
        cv0 cv0Var = sv0Var.R;
        cu0 cu0Var = sv0Var.f30339a0;
        dv0 dv0Var = sv0Var.S;
        org.telegram.ui.ActionBar.n2 n2Var = sv0Var.f30388v1;
        int i13 = os0Var.F;
        if (i13 == 7) {
            if (view instanceof org.telegram.ui.Cells.va) {
                if (!cu0Var.e.isEmpty()) {
                    i12 = ((Integer) cu0Var.e.get(i12)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = cu0Var.d.participants.participants.get(i12);
                if (i12 >= 0 && i12 < cu0Var.d.participants.participants.size()) {
                    sv0Var.K0(chatParticipant, false, view);
                    return;
                }
                return;
            }
            s4.g0 adapter = os0Var.h.getAdapter();
            ju0 ju0Var = sv0Var.f30362j0;
            if (adapter == ju0Var) {
                TLObject E = ju0Var.E(i12);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (E instanceof TLRPC.ChatParticipant) {
                    j10 = ((TLRPC.ChatParticipant) E).user_id;
                } else {
                    return;
                }
                if (j10 != 0 && j10 != n2Var.getUserConfig().getClientUserId()) {
                    n2Var.presentFragment(new ProfileActivity(zf.d0.b(j10, "user_id"), null));
                }
            }
        } else if (i13 == 6 && (view instanceof org.telegram.ui.Cells.h6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.h6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f20272id);
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                if (chat.forum) {
                    HashSet hashSet = te1.f41669n1;
                    n2Var.presentFragment(te1.E0(n2Var.getMessagesController(), n2Var.getMessagesStorage(), bundle));
                    return;
                }
                n2Var.presentFragment(new sn(bundle));
            }
        } else if (i13 == 1 && (view instanceof org.telegram.ui.Cells.i7)) {
            sv0Var.I0(i12, view, ((org.telegram.ui.Cells.i7) view).getMessage(), os0Var.F);
        } else {
            int i14 = 3;
            if (i13 == 3 && (view instanceof org.telegram.ui.Cells.m7)) {
                sv0Var.I0(i12, view, ((org.telegram.ui.Cells.m7) view).getMessage(), os0Var.F);
            } else if ((i13 == 2 || i13 == 4) && (view instanceof org.telegram.ui.Cells.h7)) {
                sv0Var.I0(i12, view, ((org.telegram.ui.Cells.h7) view).getMessage(), os0Var.F);
            } else if (i13 == 5 && (view instanceof org.telegram.ui.Cells.f2)) {
                sv0Var.I0(i12, view, (MessageObject) ((org.telegram.ui.Cells.f2) view).getParentObject(), os0Var.F);
            } else if (i13 == 0 && (view instanceof org.telegram.ui.Cells.s7)) {
                final org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                MessageObject messageObject = s7Var.getMessageObject();
                if (messageObject != null && messageObject.isSensitive()) {
                    if (n2Var != null) {
                        final int currentAccount = n2Var.getCurrentAccount();
                        final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                        final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
                        b2Var.q(200L);
                        messagesController.getContentSettings(new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                final boolean z10;
                                boolean z11;
                                org.telegram.ui.ActionBar.d6 resourceProvider;
                                int dp;
                                int dp2;
                                org.telegram.ui.ActionBar.d6 resourceProvider2;
                                int i15;
                                int i16;
                                final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                                org.telegram.ui.ActionBar.n2 n2Var2 = sv0.this.f30388v1;
                                b2Var.c(200L);
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
                                    if (n2Var2 == null) {
                                        resourceProvider = null;
                                    } else {
                                        resourceProvider = n2Var2.getResourceProvider();
                                    }
                                    org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context2, 1, resourceProvider);
                                    a2Var.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                                    a2Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
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
                                    a2Var.setPadding(dp, 0, dp2, 0);
                                    frameLayout.addView(a2Var, w7.z5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                    a2Var.setOnClickListener(new t0(6, zArr));
                                }
                                if (n2Var2 == null) {
                                    resourceProvider2 = null;
                                } else {
                                    resourceProvider2 = n2Var2.getResourceProvider();
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, resourceProvider2);
                                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                                if (z11) {
                                    i15 = R.string.MessageShowSensitiveContentMediaTextClosed;
                                } else {
                                    i15 = R.string.MessageShowSensitiveContentMediaText;
                                }
                                alertDialog$Builder.f20601a.T = LocaleController.getString(i15);
                                alertDialog$Builder.n(frameLayout);
                                alertDialog$Builder.f20601a.G = 9;
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
                                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i18) {
                                            org.telegram.ui.ActionBar.d6 resourceProvider3;
                                            TL_account.contentSettings contentsettings2;
                                            bs0 bs0Var = new bs0(org.telegram.ui.Cells.s7.this, f11, f12);
                                            if (zArr[0]) {
                                                if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                                    bs0Var.run(Boolean.TRUE);
                                                    return;
                                                }
                                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                                qy qyVar = new qy(4, messagesController2, bs0Var);
                                                if (U == null) {
                                                    resourceProvider3 = null;
                                                } else {
                                                    resourceProvider3 = U.getResourceProvider();
                                                }
                                                ThemeActivity.C0(i17, context2, qyVar, resourceProvider3);
                                                return;
                                            }
                                            bs0Var.run(Boolean.FALSE);
                                        }
                                    });
                                }
                                if (n2Var2 != null && n2Var2.getContext() != null) {
                                    n2Var2.showDialog(alertDialog$Builder.f20601a);
                                } else {
                                    alertDialog$Builder.o();
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                MessageObject messageObject2 = s7Var.f23035n;
                if (messageObject2 != null && messageObject2.hasMediaSpoilers() && s7Var.f23031i0 == 0.0f && !s7Var.f23035n.isMediaSpoilersRevealedInSharedMedia) {
                    s7Var.n(f7, f10);
                } else if (messageObject != null) {
                    sv0Var.I0(i12, view, messageObject, os0Var.F);
                }
            } else if (sv0.q0(i13) && (view instanceof org.telegram.ui.Cells.s7)) {
                MessageObject messageObject3 = ((org.telegram.ui.Cells.s7) view).getMessageObject();
                if (messageObject3 != null) {
                    sv0Var.I0(i12, view, messageObject3, os0Var.F);
                }
            } else {
                int i15 = os0Var.F;
                if (i15 == 10) {
                    if (((view instanceof org.telegram.ui.Cells.h6) || f10 < AndroidUtilities.dp(60.0f)) && i12 >= 0 && i12 < bu0Var.d.size()) {
                        Bundle bundle2 = new Bundle();
                        TLObject tLObject = (TLObject) bu0Var.d.get(i12);
                        if (tLObject instanceof TLRPC.Chat) {
                            bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).f20272id);
                        } else if (tLObject instanceof TLRPC.User) {
                            bundle2.putLong("user_id", ((TLRPC.User) tLObject).f20419id);
                        } else {
                            return;
                        }
                        n2Var.presentFragment(new sn(bundle2));
                    }
                } else if (i15 == 11) {
                    if (os0Var.h.getAdapter() == dv0Var) {
                        if (i12 >= 0) {
                            ArrayList arrayList = dv0Var.e;
                            ArrayList arrayList2 = dv0Var.f25713f;
                            if (i12 < arrayList.size()) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", n2Var.getUserConfig().getClientUserId());
                                bundle3.putInt("chatMode", 3);
                                sn snVar = new sn(bundle3);
                                snVar.f41174d4 = ((SavedMessagesController.SavedDialog) arrayList.get(i12)).dialogId;
                                n2Var.presentFragment(snVar);
                                return;
                            }
                            int size = i12 - arrayList.size();
                            if (size < arrayList2.size()) {
                                MessageObject messageObject4 = (MessageObject) arrayList2.get(size);
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("user_id", n2Var.getUserConfig().getClientUserId());
                                bundle4.putInt("message_id", messageObject4.getId());
                                ws0 ws0Var = new ws0(sv0Var, bundle4, size);
                                ws0Var.L7 = messageObject4.getId();
                                n2Var.presentFragment(ws0Var);
                            }
                        }
                    } else if (sv0Var.C1) {
                        if (cv0Var.v.f46065y == 0) {
                            cv0Var.E(view);
                        }
                    } else {
                        Bundle bundle5 = new Bundle();
                        if (i12 >= 0 && i12 < cv0Var.f25381f.size()) {
                            bundle5.putLong("user_id", n2Var.getUserConfig().getClientUserId());
                            bundle5.putInt("chatMode", 3);
                            sn snVar2 = new sn(bundle5);
                            snVar2.f41174d4 = ((SavedMessagesController.SavedDialog) cv0Var.f25381f.get(i12)).dialogId;
                            n2Var.presentFragment(snVar2);
                        }
                    }
                } else if (i15 == 15 && (view instanceof org.telegram.ui.Cells.u1)) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    MessageObject messageObject5 = u1Var.getMessageObject();
                    os0Var.h.B0();
                    int currentAccount2 = n2Var.getCurrentAccount();
                    MessagesController messagesController2 = n2Var.getMessagesController();
                    long j11 = this.f2057b;
                    TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j11));
                    i80 F = i80.F(os0Var, d6Var, u1Var);
                    F.f27108c0 = true;
                    if (messageObject5.isOutOwner()) {
                        i14 = 5;
                    }
                    F.V(i14);
                    F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new a3.i0(sv0Var, j11, messageObject5, 24), false);
                    if (!messageObject5.isPollClosed()) {
                        if (messageObject5.canUnvote()) {
                            F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new sr0(sv0Var, d6Var, currentAccount2, messageObject5), false);
                        }
                        if (!messageObject5.isForwarded() && ((messageObject5.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                            int i16 = R.drawable.msg_pollstop;
                            if (messageObject5.isQuiz()) {
                                i11 = R.string.StopQuiz;
                            } else {
                                i11 = R.string.StopPoll;
                            }
                            F.c(i16, LocaleController.getString(i11), new sr0(sv0Var, d6Var, messageObject5, currentAccount2), false);
                        }
                    }
                    F.Z();
                }
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f2056a) {
            case 1:
                sn.K0((sn) this.f2058c, (TLRPC.TL_game) this.d, (MessageObject) this.e, (String) this.f2059f, this.f2057b);
                return;
            default:
                q31 q31Var = (q31) this.f2058c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                org.telegram.ui.Components.sc scVar = (org.telegram.ui.Components.sc) this.f2059f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j10 = this.f2057b;
                    if (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j10 == ((Integer) obj).intValue()) {
                            q31Var.m(0L, false);
                        }
                    } else {
                        q31Var.f29563e0.addAll(hashSet);
                        q31Var.o();
                        org.telegram.ui.Components.xc.a0(q31Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new b3(q31Var, hashSet, arrayList, j10, 18), new go0(q31Var, arrayList, scVar, 13)).j();
                        b2Var.dismiss();
                        return;
                    }
                }
        }
    }

    public q4(sn snVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        this.f2056a = 1;
        this.f2058c = snVar;
        this.d = tL_game;
        this.e = messageObject;
        this.f2059f = str;
        this.f2057b = j10;
    }

    public q4(q31 q31Var, ArrayList arrayList, long j10, HashSet hashSet, org.telegram.ui.Components.sc scVar) {
        this.f2056a = 3;
        this.f2058c = q31Var;
        this.d = arrayList;
        this.f2057b = j10;
        this.e = hashSet;
        this.f2059f = scVar;
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
