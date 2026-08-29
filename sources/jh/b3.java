package jh;

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
import org.telegram.messenger.sg;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.m21;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.rq0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.Components.zs0;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.tn;
import org.telegram.ui.ze1;
public final class b3 implements org.telegram.ui.ActionBar.b2, al0 {
    public final int f11788a;
    public final long f11789b;
    public final NotificationCenter.NotificationCenterDelegate f11790c;
    public final Object d;
    public final Object f11791e;
    public final Object f11792f;

    public b3(Object obj, KeyEvent.Callback callback, Object obj2, long j10, Object obj3, int i10) {
        this.f11788a = i10;
        this.f11790c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.f11791e = obj2;
        this.f11789b = j10;
        this.f11792f = obj3;
    }

    @Override
    public void b(final float f9, final float f10, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i11;
        long j10;
        int i12 = i10;
        final qu0 qu0Var = (qu0) this.f11790c;
        lr0 lr0Var = (lr0) this.d;
        final Context context = (Context) this.f11791e;
        org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f11792f;
        ys0 ys0Var = qu0Var.M;
        zt0 zt0Var = qu0Var.N;
        zs0 zs0Var = qu0Var.T;
        bu0 bu0Var = qu0Var.O;
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.f32093r1;
        int i13 = lr0Var.B;
        if (i13 == 7) {
            if (view instanceof org.telegram.ui.Cells.sa) {
                if (!zs0Var.f35412e.isEmpty()) {
                    i12 = ((Integer) zs0Var.f35412e.get(i12)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = zs0Var.d.participants.participants.get(i12);
                if (i12 >= 0 && i12 < zs0Var.d.participants.participants.size()) {
                    qu0Var.I0(chatParticipant, false, view);
                    return;
                }
                return;
            }
            f2.p0 adapter = lr0Var.h.getAdapter();
            gt0 gt0Var = qu0Var.f32068f0;
            if (adapter == gt0Var) {
                TLObject E = gt0Var.E(i12);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (E instanceof TLRPC.ChatParticipant) {
                    j10 = ((TLRPC.ChatParticipant) E).user_id;
                } else {
                    return;
                }
                if (j10 != 0 && j10 != o2Var.getUserConfig().getClientUserId()) {
                    o2Var.presentFragment(new ProfileActivity(j7.l1.g(j10, "user_id"), null));
                }
            }
        } else if (i13 == 6 && (view instanceof org.telegram.ui.Cells.f6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.f6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f22392id);
            if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                if (chat.forum) {
                    HashSet hashSet = ze1.f45154j1;
                    o2Var.presentFragment(ze1.E0(o2Var.getMessagesController(), o2Var.getMessagesStorage(), bundle));
                    return;
                }
                o2Var.presentFragment(new tn(bundle));
            }
        } else if (i13 == 1 && (view instanceof org.telegram.ui.Cells.g7)) {
            qu0Var.G0(i12, view, ((org.telegram.ui.Cells.g7) view).getMessage(), lr0Var.B);
        } else {
            int i14 = 3;
            if (i13 == 3 && (view instanceof org.telegram.ui.Cells.j7)) {
                qu0Var.G0(i12, view, ((org.telegram.ui.Cells.j7) view).getMessage(), lr0Var.B);
            } else if ((i13 == 2 || i13 == 4) && (view instanceof org.telegram.ui.Cells.f7)) {
                qu0Var.G0(i12, view, ((org.telegram.ui.Cells.f7) view).getMessage(), lr0Var.B);
            } else if (i13 == 5 && (view instanceof org.telegram.ui.Cells.d2)) {
                qu0Var.G0(i12, view, (MessageObject) ((org.telegram.ui.Cells.d2) view).getParentObject(), lr0Var.B);
            } else if (i13 == 0 && (view instanceof org.telegram.ui.Cells.p7)) {
                final org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                MessageObject messageObject = p7Var.getMessageObject();
                if (messageObject != null && messageObject.isSensitive()) {
                    if (o2Var != null) {
                        final int currentAccount = o2Var.getCurrentAccount();
                        final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                        final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
                        c2Var.q(200L);
                        messagesController.getContentSettings(new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                final boolean z10;
                                boolean z11;
                                org.telegram.ui.ActionBar.c6 resourceProvider;
                                int dp;
                                int dp2;
                                org.telegram.ui.ActionBar.c6 resourceProvider2;
                                int i15;
                                int i16;
                                final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                                org.telegram.ui.ActionBar.o2 o2Var2 = qu0.this.f32093r1;
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
                                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context2, 1, resourceProvider);
                                    y1Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                                    y1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
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
                                    y1Var.setPadding(dp, 0, dp2, 0);
                                    frameLayout.addView(y1Var, i7.f6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                    y1Var.setOnClickListener(new v0(6, zArr));
                                }
                                if (o2Var2 == null) {
                                    resourceProvider2 = null;
                                } else {
                                    resourceProvider2 = o2Var2.getResourceProvider();
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, resourceProvider2);
                                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                                if (z11) {
                                    i15 = R.string.MessageShowSensitiveContentMediaTextClosed;
                                } else {
                                    i15 = R.string.MessageShowSensitiveContentMediaText;
                                }
                                alertDialog$Builder.f22714a.P = LocaleController.getString(i15);
                                alertDialog$Builder.n(frameLayout);
                                alertDialog$Builder.f22714a.C = 9;
                                if (z11) {
                                    i16 = R.string.MessageShowSensitiveContentMediaTextClosedButton;
                                } else {
                                    i16 = R.string.Cancel;
                                }
                                alertDialog$Builder.h(LocaleController.getString(i16), null);
                                if (!z11) {
                                    String string = LocaleController.getString(R.string.MessageShowSensitiveContentButton);
                                    final org.telegram.ui.Cells.p7 p7Var2 = p7Var;
                                    final float f11 = f9;
                                    final float f12 = f10;
                                    final int i17 = currentAccount;
                                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.b2() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i18) {
                                            org.telegram.ui.ActionBar.c6 resourceProvider3;
                                            TL_account.contentSettings contentsettings2;
                                            zq0 zq0Var = new zq0(org.telegram.ui.Cells.p7.this, f11, f12);
                                            if (zArr[0]) {
                                                if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                                    zq0Var.run(Boolean.TRUE);
                                                    return;
                                                }
                                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                                org.telegram.ui.tm tmVar = new org.telegram.ui.tm(16, messagesController2, zq0Var);
                                                if (U == null) {
                                                    resourceProvider3 = null;
                                                } else {
                                                    resourceProvider3 = U.getResourceProvider();
                                                }
                                                ThemeActivity.C0(i17, context2, tmVar, resourceProvider3);
                                                return;
                                            }
                                            zq0Var.run(Boolean.FALSE);
                                        }
                                    });
                                }
                                if (o2Var2 != null && o2Var2.getContext() != null) {
                                    o2Var2.showDialog(alertDialog$Builder.f22714a);
                                } else {
                                    alertDialog$Builder.o();
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                MessageObject messageObject2 = p7Var.f24991n;
                if (messageObject2 != null && messageObject2.hasMediaSpoilers() && p7Var.f24982e0 == 0.0f && !p7Var.f24991n.isMediaSpoilersRevealedInSharedMedia) {
                    p7Var.n(f9, f10);
                } else if (messageObject != null) {
                    qu0Var.G0(i12, view, messageObject, lr0Var.B);
                }
            } else if (qu0.p0(i13) && (view instanceof org.telegram.ui.Cells.p7)) {
                MessageObject messageObject3 = ((org.telegram.ui.Cells.p7) view).getMessageObject();
                if (messageObject3 != null) {
                    qu0Var.G0(i12, view, messageObject3, lr0Var.B);
                }
            } else {
                int i15 = lr0Var.B;
                if (i15 == 10) {
                    if (((view instanceof org.telegram.ui.Cells.f6) || f10 < AndroidUtilities.dp(60.0f)) && i12 >= 0 && i12 < ys0Var.d.size()) {
                        Bundle bundle2 = new Bundle();
                        TLObject tLObject = (TLObject) ys0Var.d.get(i12);
                        if (tLObject instanceof TLRPC.Chat) {
                            bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).f22392id);
                        } else if (tLObject instanceof TLRPC.User) {
                            bundle2.putLong("user_id", ((TLRPC.User) tLObject).f22539id);
                        } else {
                            return;
                        }
                        o2Var.presentFragment(new tn(bundle2));
                    }
                } else if (i15 == 11) {
                    if (lr0Var.h.getAdapter() == bu0Var) {
                        if (i12 >= 0) {
                            ArrayList arrayList = bu0Var.f27228e;
                            ArrayList arrayList2 = bu0Var.f27229f;
                            if (i12 < arrayList.size()) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", o2Var.getUserConfig().getClientUserId());
                                bundle3.putInt("chatMode", 3);
                                tn tnVar = new tn(bundle3);
                                tnVar.Z3 = ((SavedMessagesController.SavedDialog) arrayList.get(i12)).dialogId;
                                o2Var.presentFragment(tnVar);
                                return;
                            }
                            int size = i12 - arrayList.size();
                            if (size < arrayList2.size()) {
                                MessageObject messageObject4 = (MessageObject) arrayList2.get(size);
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("user_id", o2Var.getUserConfig().getClientUserId());
                                bundle4.putInt("message_id", messageObject4.getId());
                                tr0 tr0Var = new tr0(qu0Var, bundle4, size);
                                tr0Var.H7 = messageObject4.getId();
                                o2Var.presentFragment(tr0Var);
                            }
                        }
                    } else if (qu0Var.f32111y1) {
                        if (zt0Var.v.f6309y == 0) {
                            zt0Var.E(view);
                        }
                    } else {
                        Bundle bundle5 = new Bundle();
                        if (i12 >= 0 && i12 < zt0Var.f35416f.size()) {
                            bundle5.putLong("user_id", o2Var.getUserConfig().getClientUserId());
                            bundle5.putInt("chatMode", 3);
                            tn tnVar2 = new tn(bundle5);
                            tnVar2.Z3 = ((SavedMessagesController.SavedDialog) zt0Var.f35416f.get(i12)).dialogId;
                            o2Var.presentFragment(tnVar2);
                        }
                    }
                } else if (i15 == 15 && (view instanceof org.telegram.ui.Cells.s1)) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                    MessageObject messageObject5 = s1Var.getMessageObject();
                    lr0Var.h.B0();
                    int currentAccount2 = o2Var.getCurrentAccount();
                    MessagesController messagesController2 = o2Var.getMessagesController();
                    long j11 = this.f11789b;
                    TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j11));
                    j70 F = j70.F(lr0Var, c6Var, s1Var);
                    F.f29573c0 = true;
                    if (messageObject5.isOutOwner()) {
                        i14 = 5;
                    }
                    F.V(i14);
                    F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new g5.v(qu0Var, j11, messageObject5, 24), false);
                    if (!messageObject5.isPollClosed()) {
                        if (messageObject5.canUnvote()) {
                            F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new rq0(qu0Var, c6Var, currentAccount2, messageObject5), false);
                        }
                        if (!messageObject5.isForwarded() && ((messageObject5.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                            int i16 = R.drawable.msg_pollstop;
                            if (messageObject5.isQuiz()) {
                                i11 = R.string.StopQuiz;
                            } else {
                                i11 = R.string.StopPoll;
                            }
                            F.c(i16, LocaleController.getString(i11), new rq0(qu0Var, c6Var, messageObject5, currentAccount2), false);
                        }
                    }
                    F.Z();
                }
            }
        }
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f11788a) {
            case 1:
                tn.X0((tn) this.f11790c, (TLRPC.TL_game) this.d, (MessageObject) this.f11791e, (String) this.f11792f, this.f11789b);
                return;
            default:
                m21 m21Var = (m21) this.f11790c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.f11791e;
                org.telegram.ui.Components.g5 g5Var = (org.telegram.ui.Components.g5) this.f11792f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j10 = this.f11789b;
                    if (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j10 == ((Integer) obj).intValue()) {
                            m21Var.m(0L, false);
                        }
                    } else {
                        m21Var.f30551a0.addAll(hashSet);
                        m21Var.o();
                        tc.a0(m21Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new sg(m21Var, hashSet, arrayList, j10), new ii0(m21Var, arrayList, g5Var, 16)).j();
                        c2Var.dismiss();
                        return;
                    }
                }
        }
    }

    public b3(tn tnVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        this.f11788a = 1;
        this.f11790c = tnVar;
        this.d = tL_game;
        this.f11791e = messageObject;
        this.f11792f = str;
        this.f11789b = j10;
    }

    public b3(m21 m21Var, ArrayList arrayList, long j10, HashSet hashSet, org.telegram.ui.Components.g5 g5Var) {
        this.f11788a = 3;
        this.f11790c = m21Var;
        this.d = arrayList;
        this.f11789b = j10;
        this.f11791e = hashSet;
        this.f11792f = g5Var;
    }

    @Override
    public void o0(View view, float f9, float f10) {
    }
}
