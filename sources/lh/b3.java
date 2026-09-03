package lh;

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
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.w21;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.z80;
import org.telegram.ui.Components.zq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.sf1;
import org.telegram.ui.zn;
public final class b3 implements org.telegram.ui.ActionBar.c2, il0 {
    public final int f12127a;
    public final long f12128b;
    public final NotificationCenter.NotificationCenterDelegate f12129c;
    public final Object d;
    public final Object e;
    public final Object f12130f;

    public b3(Object obj, KeyEvent.Callback callback, Object obj2, long j10, Object obj3, int i10) {
        this.f12127a = i10;
        this.f12129c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.e = obj2;
        this.f12128b = j10;
        this.f12130f = obj3;
    }

    @Override
    public boolean Z0(View view) {
        return false;
    }

    @Override
    public void c(final float f10, final float f11, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i11;
        long j10;
        int i12 = i10;
        final yu0 yu0Var = (yu0) this.f12129c;
        tr0 tr0Var = (tr0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f12130f;
        gt0 gt0Var = yu0Var.N;
        hu0 hu0Var = yu0Var.O;
        ht0 ht0Var = yu0Var.U;
        ju0 ju0Var = yu0Var.P;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31155s1;
        int i13 = tr0Var.C;
        if (i13 == 7) {
            if (view instanceof org.telegram.ui.Cells.ua) {
                if (!ht0Var.e.isEmpty()) {
                    i12 = ((Integer) ht0Var.e.get(i12)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = ht0Var.d.participants.participants.get(i12);
                if (i12 >= 0 && i12 < ht0Var.d.participants.participants.size()) {
                    yu0Var.I0(chatParticipant, false, view);
                    return;
                }
                return;
            }
            f2.o0 adapter = tr0Var.h.getAdapter();
            ot0 ot0Var = yu0Var.f31129g0;
            if (adapter == ot0Var) {
                TLObject E = ot0Var.E(i12);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (E instanceof TLRPC.ChatParticipant) {
                    j10 = ((TLRPC.ChatParticipant) E).user_id;
                } else {
                    return;
                }
                if (j10 != 0 && j10 != p2Var.getUserConfig().getClientUserId()) {
                    p2Var.presentFragment(new ProfileActivity(kf.k0.g(j10, "user_id"), null));
                }
            }
        } else if (i13 == 6 && (view instanceof org.telegram.ui.Cells.g6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.g6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f19159id);
            if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var)) {
                if (chat.forum) {
                    HashSet hashSet = sf1.f38174k1;
                    p2Var.presentFragment(sf1.E0(p2Var.getMessagesController(), p2Var.getMessagesStorage(), bundle));
                    return;
                }
                p2Var.presentFragment(new zn(bundle));
            }
        } else if (i13 == 1 && (view instanceof org.telegram.ui.Cells.h7)) {
            yu0Var.G0(i12, view, ((org.telegram.ui.Cells.h7) view).getMessage(), tr0Var.C);
        } else {
            int i14 = 3;
            if (i13 == 3 && (view instanceof org.telegram.ui.Cells.k7)) {
                yu0Var.G0(i12, view, ((org.telegram.ui.Cells.k7) view).getMessage(), tr0Var.C);
            } else if ((i13 == 2 || i13 == 4) && (view instanceof org.telegram.ui.Cells.g7)) {
                yu0Var.G0(i12, view, ((org.telegram.ui.Cells.g7) view).getMessage(), tr0Var.C);
            } else if (i13 == 5 && (view instanceof org.telegram.ui.Cells.d2)) {
                yu0Var.G0(i12, view, (MessageObject) ((org.telegram.ui.Cells.d2) view).getParentObject(), tr0Var.C);
            } else if (i13 == 0 && (view instanceof org.telegram.ui.Cells.q7)) {
                final org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
                MessageObject messageObject = q7Var.getMessageObject();
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
                                org.telegram.ui.ActionBar.f6 resourceProvider;
                                int dp;
                                int dp2;
                                org.telegram.ui.ActionBar.f6 resourceProvider2;
                                int i15;
                                int i16;
                                final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                                org.telegram.ui.ActionBar.p2 p2Var2 = yu0.this.f31155s1;
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
                                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context2, 1, resourceProvider);
                                    y1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
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
                                    frameLayout.addView(y1Var, k7.b6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                    y1Var.setOnClickListener(new t0(6, zArr));
                                }
                                if (p2Var2 == null) {
                                    resourceProvider2 = null;
                                } else {
                                    resourceProvider2 = p2Var2.getResourceProvider();
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, resourceProvider2);
                                alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                                if (z10) {
                                    i15 = R.string.MessageShowSensitiveContentMediaTextClosed;
                                } else {
                                    i15 = R.string.MessageShowSensitiveContentMediaText;
                                }
                                alertDialog$Builder.f19478a.Q = LocaleController.getString(i15);
                                alertDialog$Builder.n(frameLayout);
                                alertDialog$Builder.f19478a.D = 9;
                                if (z10) {
                                    i16 = R.string.MessageShowSensitiveContentMediaTextClosedButton;
                                } else {
                                    i16 = R.string.Cancel;
                                }
                                alertDialog$Builder.h(LocaleController.getString(i16), null);
                                if (!z10) {
                                    String string = LocaleController.getString(R.string.MessageShowSensitiveContentButton);
                                    final org.telegram.ui.Cells.q7 q7Var2 = q7Var;
                                    final float f12 = f10;
                                    final float f13 = f11;
                                    final int i17 = currentAccount;
                                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() {
                                        @Override
                                        public final void l(org.telegram.ui.ActionBar.d2 d2Var2, int i18) {
                                            org.telegram.ui.ActionBar.f6 resourceProvider3;
                                            TL_account.contentSettings contentsettings2;
                                            hr0 hr0Var = new hr0(org.telegram.ui.Cells.q7.this, f12, f13);
                                            if (zArr[0]) {
                                                if (!z4 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                                    hr0Var.run(Boolean.TRUE);
                                                    return;
                                                }
                                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                                vk vkVar = new vk(8, messagesController2, hr0Var);
                                                if (U == null) {
                                                    resourceProvider3 = null;
                                                } else {
                                                    resourceProvider3 = U.getResourceProvider();
                                                }
                                                ThemeActivity.C0(i17, context2, vkVar, resourceProvider3);
                                                return;
                                            }
                                            hr0Var.run(Boolean.FALSE);
                                        }
                                    });
                                }
                                if (p2Var2 != null && p2Var2.getContext() != null) {
                                    p2Var2.showDialog(alertDialog$Builder.f19478a);
                                } else {
                                    alertDialog$Builder.o();
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                MessageObject messageObject2 = q7Var.f21714n;
                if (messageObject2 != null && messageObject2.hasMediaSpoilers() && q7Var.f21707f0 == 0.0f && !q7Var.f21714n.isMediaSpoilersRevealedInSharedMedia) {
                    q7Var.n(f10, f11);
                } else if (messageObject != null) {
                    yu0Var.G0(i12, view, messageObject, tr0Var.C);
                }
            } else if (yu0.p0(i13) && (view instanceof org.telegram.ui.Cells.q7)) {
                MessageObject messageObject3 = ((org.telegram.ui.Cells.q7) view).getMessageObject();
                if (messageObject3 != null) {
                    yu0Var.G0(i12, view, messageObject3, tr0Var.C);
                }
            } else {
                int i15 = tr0Var.C;
                if (i15 == 10) {
                    if (((view instanceof org.telegram.ui.Cells.g6) || f11 < AndroidUtilities.dp(60.0f)) && i12 >= 0 && i12 < gt0Var.d.size()) {
                        Bundle bundle2 = new Bundle();
                        TLObject tLObject = (TLObject) gt0Var.d.get(i12);
                        if (tLObject instanceof TLRPC.Chat) {
                            bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).f19159id);
                        } else if (tLObject instanceof TLRPC.User) {
                            bundle2.putLong("user_id", ((TLRPC.User) tLObject).f19306id);
                        } else {
                            return;
                        }
                        p2Var.presentFragment(new zn(bundle2));
                    }
                } else if (i15 == 11) {
                    if (tr0Var.h.getAdapter() == ju0Var) {
                        if (i12 >= 0) {
                            ArrayList arrayList = ju0Var.e;
                            ArrayList arrayList2 = ju0Var.f26054f;
                            if (i12 < arrayList.size()) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", p2Var.getUserConfig().getClientUserId());
                                bundle3.putInt("chatMode", 3);
                                zn znVar = new zn(bundle3);
                                znVar.f40514a4 = ((SavedMessagesController.SavedDialog) arrayList.get(i12)).dialogId;
                                p2Var.presentFragment(znVar);
                                return;
                            }
                            int size = i12 - arrayList.size();
                            if (size < arrayList2.size()) {
                                MessageObject messageObject4 = (MessageObject) arrayList2.get(size);
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("user_id", p2Var.getUserConfig().getClientUserId());
                                bundle4.putInt("message_id", messageObject4.getId());
                                bs0 bs0Var = new bs0(yu0Var, bundle4, size);
                                bs0Var.I7 = messageObject4.getId();
                                p2Var.presentFragment(bs0Var);
                            }
                        }
                    } else if (yu0Var.f31172z1) {
                        if (hu0Var.v.f5679y == 0) {
                            hu0Var.E(view);
                        }
                    } else {
                        Bundle bundle5 = new Bundle();
                        if (i12 >= 0 && i12 < hu0Var.f25498f.size()) {
                            bundle5.putLong("user_id", p2Var.getUserConfig().getClientUserId());
                            bundle5.putInt("chatMode", 3);
                            zn znVar2 = new zn(bundle5);
                            znVar2.f40514a4 = ((SavedMessagesController.SavedDialog) hu0Var.f25498f.get(i12)).dialogId;
                            p2Var.presentFragment(znVar2);
                        }
                    }
                } else if (i15 == 15 && (view instanceof org.telegram.ui.Cells.s1)) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                    MessageObject messageObject5 = s1Var.getMessageObject();
                    tr0Var.h.B0();
                    int currentAccount2 = p2Var.getCurrentAccount();
                    MessagesController messagesController2 = p2Var.getMessagesController();
                    long j11 = this.f12128b;
                    TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j11));
                    p70 F = p70.F(tr0Var, f6Var, s1Var);
                    F.f27751c0 = true;
                    if (messageObject5.isOutOwner()) {
                        i14 = 5;
                    }
                    F.V(i14);
                    F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new i5.v(yu0Var, j11, messageObject5, 23), false);
                    if (!messageObject5.isPollClosed()) {
                        if (messageObject5.canUnvote()) {
                            F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new zq0(yu0Var, f6Var, currentAccount2, messageObject5), false);
                        }
                        if (!messageObject5.isForwarded() && ((messageObject5.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                            int i16 = R.drawable.msg_pollstop;
                            if (messageObject5.isQuiz()) {
                                i11 = R.string.StopQuiz;
                            } else {
                                i11 = R.string.StopPoll;
                            }
                            F.c(i16, LocaleController.getString(i11), new zq0(yu0Var, f6Var, messageObject5, currentAccount2), false);
                        }
                    }
                    F.Z();
                }
            }
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f12127a) {
            case 1:
                zn.X0((zn) this.f12129c, (TLRPC.TL_game) this.d, (MessageObject) this.e, (String) this.f12130f, this.f12128b);
                return;
            default:
                w21 w21Var = (w21) this.f12129c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                mc mcVar = (mc) this.f12130f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j10 = this.f12128b;
                    if (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j10 == ((Integer) obj).intValue()) {
                            w21Var.m(0L, false);
                        }
                    } else {
                        w21Var.f30125b0.addAll(hashSet);
                        w21Var.o();
                        qc.a0(w21Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new di(w21Var, hashSet, arrayList, j10, 5), new z80(w21Var, arrayList, mcVar, 24)).j();
                        d2Var.dismiss();
                        return;
                    }
                }
        }
    }

    public b3(zn znVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        this.f12127a = 1;
        this.f12129c = znVar;
        this.d = tL_game;
        this.e = messageObject;
        this.f12130f = str;
        this.f12128b = j10;
    }

    public b3(w21 w21Var, ArrayList arrayList, long j10, HashSet hashSet, mc mcVar) {
        this.f12127a = 3;
        this.f12129c = w21Var;
        this.d = arrayList;
        this.f12128b = j10;
        this.e = hashSet;
        this.f12130f = mcVar;
    }

    @Override
    public void n0(View view, float f10, float f11) {
    }
}
