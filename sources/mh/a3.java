package mh;

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
import org.telegram.messenger.di;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.cs0;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ur0;
import org.telegram.ui.Components.x21;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.mf1;
import org.telegram.ui.xn;
public final class a3 implements org.telegram.ui.ActionBar.c2, kl0 {
    public final int f13681a;
    public final long f13682b;
    public final NotificationCenter.NotificationCenterDelegate f13683c;
    public final Object d;
    public final Object f13684e;
    public final Object f13685f;

    public a3(Object obj, KeyEvent.Callback callback, Object obj2, long j10, Object obj3, int i10) {
        this.f13681a = i10;
        this.f13683c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.f13684e = obj2;
        this.f13682b = j10;
        this.f13685f = obj3;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(final float f10, final float f11, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i11;
        long j10;
        int i12 = i10;
        final zu0 zu0Var = (zu0) this.f13683c;
        ur0 ur0Var = (ur0) this.d;
        final Context context = (Context) this.f13684e;
        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f13685f;
        ht0 ht0Var = zu0Var.N;
        iu0 iu0Var = zu0Var.O;
        it0 it0Var = zu0Var.U;
        ku0 ku0Var = zu0Var.P;
        org.telegram.ui.ActionBar.p2 p2Var = zu0Var.f34004s1;
        int i13 = ur0Var.C;
        if (i13 == 7) {
            if (view instanceof org.telegram.ui.Cells.va) {
                if (!it0Var.f27902e.isEmpty()) {
                    i12 = ((Integer) it0Var.f27902e.get(i12)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = it0Var.d.participants.participants.get(i12);
                if (i12 >= 0 && i12 < it0Var.d.participants.participants.size()) {
                    zu0Var.I0(chatParticipant, false, view);
                    return;
                }
                return;
            }
            f2.p0 adapter = ur0Var.h.getAdapter();
            pt0 pt0Var = zu0Var.f33978g0;
            if (adapter == pt0Var) {
                TLObject E = pt0Var.E(i12);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (E instanceof TLRPC.ChatParticipant) {
                    j10 = ((TLRPC.ChatParticipant) E).user_id;
                } else {
                    return;
                }
                if (j10 != 0 && j10 != p2Var.getUserConfig().getClientUserId()) {
                    p2Var.presentFragment(new ProfileActivity(l.d.g(j10, "user_id"), null));
                }
            }
        } else if (i13 == 6 && (view instanceof org.telegram.ui.Cells.h6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.h6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f20843id);
            if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var)) {
                if (chat.forum) {
                    HashSet hashSet = mf1.f39101k1;
                    p2Var.presentFragment(mf1.E0(p2Var.getMessagesController(), p2Var.getMessagesStorage(), bundle));
                    return;
                }
                p2Var.presentFragment(new xn(bundle));
            }
        } else if (i13 == 1 && (view instanceof org.telegram.ui.Cells.i7)) {
            zu0Var.G0(i12, view, ((org.telegram.ui.Cells.i7) view).getMessage(), ur0Var.C);
        } else {
            int i14 = 3;
            if (i13 == 3 && (view instanceof org.telegram.ui.Cells.l7)) {
                zu0Var.G0(i12, view, ((org.telegram.ui.Cells.l7) view).getMessage(), ur0Var.C);
            } else if ((i13 == 2 || i13 == 4) && (view instanceof org.telegram.ui.Cells.h7)) {
                zu0Var.G0(i12, view, ((org.telegram.ui.Cells.h7) view).getMessage(), ur0Var.C);
            } else if (i13 == 5 && (view instanceof org.telegram.ui.Cells.e2)) {
                zu0Var.G0(i12, view, (MessageObject) ((org.telegram.ui.Cells.e2) view).getParentObject(), ur0Var.C);
            } else if (i13 == 0 && (view instanceof org.telegram.ui.Cells.r7)) {
                final org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                MessageObject messageObject = r7Var.getMessageObject();
                if (messageObject != null && messageObject.isSensitive()) {
                    if (p2Var != null) {
                        final int currentAccount = p2Var.getCurrentAccount();
                        final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                        final org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
                        d2Var.q(200L);
                        messagesController.getContentSettings(new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                final boolean z4;
                                boolean z10;
                                org.telegram.ui.ActionBar.g6 resourceProvider;
                                int dp;
                                int dp2;
                                org.telegram.ui.ActionBar.g6 resourceProvider2;
                                int i15;
                                int i16;
                                final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                                org.telegram.ui.ActionBar.p2 p2Var2 = zu0.this.f34004s1;
                                d2Var.c(200L);
                                final MessagesController messagesController2 = messagesController;
                                if (messagesController2.config.needAgeVideoVerification.get() && !TextUtils.isEmpty(messagesController2.verifyAgeBotUsername)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if ((contentsettings == null || !contentsettings.sensitive_can_change) && z4) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                final boolean[] zArr = new boolean[1];
                                final Context context2 = context;
                                FrameLayout frameLayout = new FrameLayout(context2);
                                if (z4) {
                                    zArr[0] = true;
                                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                                    if (p2Var2 == null) {
                                        resourceProvider = null;
                                    } else {
                                        resourceProvider = p2Var2.getResourceProvider();
                                    }
                                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context2, 1, resourceProvider);
                                    z1Var.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
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
                                    frameLayout.addView(z1Var, k7.c6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                    z1Var.setOnClickListener(new t0(6, zArr));
                                }
                                if (p2Var2 == null) {
                                    resourceProvider2 = null;
                                } else {
                                    resourceProvider2 = p2Var2.getResourceProvider();
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, resourceProvider2);
                                alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                                if (z10) {
                                    i15 = R.string.MessageShowSensitiveContentMediaTextClosed;
                                } else {
                                    i15 = R.string.MessageShowSensitiveContentMediaText;
                                }
                                alertDialog$Builder.f21166a.Q = LocaleController.getString(i15);
                                alertDialog$Builder.n(frameLayout);
                                alertDialog$Builder.f21166a.D = 9;
                                if (z10) {
                                    i16 = R.string.MessageShowSensitiveContentMediaTextClosedButton;
                                } else {
                                    i16 = R.string.Cancel;
                                }
                                alertDialog$Builder.h(LocaleController.getString(i16), null);
                                if (!z10) {
                                    String string = LocaleController.getString(R.string.MessageShowSensitiveContentButton);
                                    final org.telegram.ui.Cells.r7 r7Var2 = r7Var;
                                    final float f12 = f10;
                                    final float f13 = f11;
                                    final int i17 = currentAccount;
                                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() {
                                        @Override
                                        public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i18) {
                                            org.telegram.ui.ActionBar.g6 resourceProvider3;
                                            TL_account.contentSettings contentsettings2;
                                            ir0 ir0Var = new ir0(org.telegram.ui.Cells.r7.this, f12, f13);
                                            if (zArr[0]) {
                                                if (!z4 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                                    ir0Var.run(Boolean.TRUE);
                                                    return;
                                                }
                                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                                xk xkVar = new xk(8, messagesController2, ir0Var);
                                                if (U == null) {
                                                    resourceProvider3 = null;
                                                } else {
                                                    resourceProvider3 = U.getResourceProvider();
                                                }
                                                ThemeActivity.C0(i17, context2, xkVar, resourceProvider3);
                                                return;
                                            }
                                            ir0Var.run(Boolean.FALSE);
                                        }
                                    });
                                }
                                if (p2Var2 != null && p2Var2.getContext() != null) {
                                    p2Var2.showDialog(alertDialog$Builder.f21166a);
                                } else {
                                    alertDialog$Builder.o();
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                MessageObject messageObject2 = r7Var.f23574n;
                if (messageObject2 != null && messageObject2.hasMediaSpoilers() && r7Var.f23567f0 == 0.0f && !r7Var.f23574n.isMediaSpoilersRevealedInSharedMedia) {
                    r7Var.n(f10, f11);
                } else if (messageObject != null) {
                    zu0Var.G0(i12, view, messageObject, ur0Var.C);
                }
            } else if (zu0.p0(i13) && (view instanceof org.telegram.ui.Cells.r7)) {
                MessageObject messageObject3 = ((org.telegram.ui.Cells.r7) view).getMessageObject();
                if (messageObject3 != null) {
                    zu0Var.G0(i12, view, messageObject3, ur0Var.C);
                }
            } else {
                int i15 = ur0Var.C;
                if (i15 == 10) {
                    if (((view instanceof org.telegram.ui.Cells.h6) || f11 < AndroidUtilities.dp(60.0f)) && i12 >= 0 && i12 < ht0Var.d.size()) {
                        Bundle bundle2 = new Bundle();
                        TLObject tLObject = (TLObject) ht0Var.d.get(i12);
                        if (tLObject instanceof TLRPC.Chat) {
                            bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).f20843id);
                        } else if (tLObject instanceof TLRPC.User) {
                            bundle2.putLong("user_id", ((TLRPC.User) tLObject).f20990id);
                        } else {
                            return;
                        }
                        p2Var.presentFragment(new xn(bundle2));
                    }
                } else if (i15 == 11) {
                    if (ur0Var.h.getAdapter() == ku0Var) {
                        if (i12 >= 0) {
                            ArrayList arrayList = ku0Var.f28453e;
                            ArrayList arrayList2 = ku0Var.f28454f;
                            if (i12 < arrayList.size()) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", p2Var.getUserConfig().getClientUserId());
                                bundle3.putInt("chatMode", 3);
                                xn xnVar = new xn(bundle3);
                                xnVar.f43116a4 = ((SavedMessagesController.SavedDialog) arrayList.get(i12)).dialogId;
                                p2Var.presentFragment(xnVar);
                                return;
                            }
                            int size = i12 - arrayList.size();
                            if (size < arrayList2.size()) {
                                MessageObject messageObject4 = (MessageObject) arrayList2.get(size);
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("user_id", p2Var.getUserConfig().getClientUserId());
                                bundle4.putInt("message_id", messageObject4.getId());
                                cs0 cs0Var = new cs0(zu0Var, bundle4, size);
                                cs0Var.I7 = messageObject4.getId();
                                p2Var.presentFragment(cs0Var);
                            }
                        }
                    } else if (zu0Var.f34021z1) {
                        if (iu0Var.v.f5767y == 0) {
                            iu0Var.E(view);
                        }
                    } else {
                        Bundle bundle5 = new Bundle();
                        if (i12 >= 0 && i12 < iu0Var.f27908f.size()) {
                            bundle5.putLong("user_id", p2Var.getUserConfig().getClientUserId());
                            bundle5.putInt("chatMode", 3);
                            xn xnVar2 = new xn(bundle5);
                            xnVar2.f43116a4 = ((SavedMessagesController.SavedDialog) iu0Var.f27908f.get(i12)).dialogId;
                            p2Var.presentFragment(xnVar2);
                        }
                    }
                } else if (i15 == 15 && (view instanceof org.telegram.ui.Cells.t1)) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    MessageObject messageObject5 = t1Var.getMessageObject();
                    ur0Var.h.B0();
                    int currentAccount2 = p2Var.getCurrentAccount();
                    MessagesController messagesController2 = p2Var.getMessagesController();
                    long j11 = this.f13682b;
                    TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j11));
                    q70 F = q70.F(ur0Var, g6Var, t1Var);
                    F.f30302c0 = true;
                    if (messageObject5.isOutOwner()) {
                        i14 = 5;
                    }
                    F.V(i14);
                    F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new i5.v(zu0Var, j11, messageObject5, 23), false);
                    if (!messageObject5.isPollClosed()) {
                        if (messageObject5.canUnvote()) {
                            F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new ar0(zu0Var, g6Var, currentAccount2, messageObject5), false);
                        }
                        if (!messageObject5.isForwarded() && ((messageObject5.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                            int i16 = R.drawable.msg_pollstop;
                            if (messageObject5.isQuiz()) {
                                i11 = R.string.StopQuiz;
                            } else {
                                i11 = R.string.StopPoll;
                            }
                            F.c(i16, LocaleController.getString(i11), new ar0(zu0Var, g6Var, messageObject5, currentAccount2), false);
                        }
                    }
                    F.Z();
                }
            }
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f13681a) {
            case 1:
                xn.X0((xn) this.f13683c, (TLRPC.TL_game) this.d, (MessageObject) this.f13684e, (String) this.f13685f, this.f13682b);
                return;
            default:
                x21 x21Var = (x21) this.f13683c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.f13684e;
                jc jcVar = (jc) this.f13685f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j10 = this.f13682b;
                    if (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j10 == ((Integer) obj).intValue()) {
                            x21Var.m(0L, false);
                        }
                    } else {
                        x21Var.f32929b0.addAll(hashSet);
                        x21Var.o();
                        qc.a0(x21Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new di(x21Var, hashSet, arrayList, j10, 5), new a90(x21Var, arrayList, jcVar, 24)).j();
                        d2Var.dismiss();
                        return;
                    }
                }
        }
    }

    public a3(xn xnVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        this.f13681a = 1;
        this.f13683c = xnVar;
        this.d = tL_game;
        this.f13684e = messageObject;
        this.f13685f = str;
        this.f13682b = j10;
    }

    public a3(x21 x21Var, ArrayList arrayList, long j10, HashSet hashSet, jc jcVar) {
        this.f13681a = 3;
        this.f13683c = x21Var;
        this.d = arrayList;
        this.f13682b = j10;
        this.f13684e = hashSet;
        this.f13685f = jcVar;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
