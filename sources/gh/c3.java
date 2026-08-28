package gh;

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
import org.telegram.messenger.lg;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.b21;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.os0;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.qn;
import org.telegram.ui.we1;
public final class c3 implements org.telegram.ui.ActionBar.b2, nk0 {
    public final int f7910a;
    public final long f7911b;
    public final NotificationCenter.NotificationCenterDelegate f7912c;
    public final Object d;
    public final Object f7913e;
    public final Object f7914f;

    public c3(Object obj, KeyEvent.Callback callback, Object obj2, long j10, Object obj3, int i9) {
        this.f7910a = i9;
        this.f7912c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.f7913e = obj2;
        this.f7911b = j10;
        this.f7914f = obj3;
    }

    @Override
    public void c(final float f10, final float f11, int i9, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10;
        long j10;
        int i11 = i9;
        final eu0 eu0Var = (eu0) this.f7912c;
        ar0 ar0Var = (ar0) this.d;
        final Context context = (Context) this.f7913e;
        org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f7914f;
        ns0 ns0Var = eu0Var.M;
        ot0 ot0Var = eu0Var.N;
        os0 os0Var = eu0Var.T;
        pt0 pt0Var = eu0Var.O;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.f28160r1;
        int i12 = ar0Var.B;
        if (i12 == 7) {
            if (view instanceof org.telegram.ui.Cells.va) {
                if (!os0Var.f31437e.isEmpty()) {
                    i11 = ((Integer) os0Var.f31437e.get(i11)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = os0Var.d.participants.participants.get(i11);
                if (i11 >= 0 && i11 < os0Var.d.participants.participants.size()) {
                    eu0Var.I0(chatParticipant, false, view);
                    return;
                }
                return;
            }
            f2.r0 adapter = ar0Var.h.getAdapter();
            vs0 vs0Var = eu0Var.f28135f0;
            if (adapter == vs0Var) {
                TLObject E = vs0Var.E(i11);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (E instanceof TLRPC.ChatParticipant) {
                    j10 = ((TLRPC.ChatParticipant) E).user_id;
                } else {
                    return;
                }
                if (j10 != 0 && j10 != o2Var.getUserConfig().getClientUserId()) {
                    o2Var.presentFragment(new ProfileActivity(e2.c.g(j10, "user_id"), null));
                }
            }
        } else if (i12 == 6 && (view instanceof org.telegram.ui.Cells.h6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.h6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f22380id);
            if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                if (chat.forum) {
                    HashSet hashSet = we1.f43740j1;
                    o2Var.presentFragment(we1.D0(o2Var.getMessagesController(), o2Var.getMessagesStorage(), bundle));
                    return;
                }
                o2Var.presentFragment(new qn(bundle));
            }
        } else if (i12 == 1 && (view instanceof org.telegram.ui.Cells.i7)) {
            eu0Var.G0(i11, view, ((org.telegram.ui.Cells.i7) view).getMessage(), ar0Var.B);
        } else {
            int i13 = 3;
            if (i12 == 3 && (view instanceof org.telegram.ui.Cells.l7)) {
                eu0Var.G0(i11, view, ((org.telegram.ui.Cells.l7) view).getMessage(), ar0Var.B);
            } else if ((i12 == 2 || i12 == 4) && (view instanceof org.telegram.ui.Cells.h7)) {
                eu0Var.G0(i11, view, ((org.telegram.ui.Cells.h7) view).getMessage(), ar0Var.B);
            } else if (i12 == 5 && (view instanceof org.telegram.ui.Cells.e2)) {
                eu0Var.G0(i11, view, (MessageObject) ((org.telegram.ui.Cells.e2) view).getParentObject(), ar0Var.B);
            } else if (i12 == 0 && (view instanceof org.telegram.ui.Cells.r7)) {
                final org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                MessageObject messageObject = r7Var.getMessageObject();
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
                                org.telegram.ui.ActionBar.b6 resourceProvider;
                                int dp;
                                int dp2;
                                org.telegram.ui.ActionBar.b6 resourceProvider2;
                                int i14;
                                int i15;
                                final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                                org.telegram.ui.ActionBar.o2 o2Var2 = eu0.this.f28160r1;
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
                                    z1Var.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
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
                                    frameLayout.addView(z1Var, g7.e6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                    z1Var.setOnClickListener(new s0(6, zArr));
                                }
                                if (o2Var2 == null) {
                                    resourceProvider2 = null;
                                } else {
                                    resourceProvider2 = o2Var2.getResourceProvider();
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, resourceProvider2);
                                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                                if (z11) {
                                    i14 = R.string.MessageShowSensitiveContentMediaTextClosed;
                                } else {
                                    i14 = R.string.MessageShowSensitiveContentMediaText;
                                }
                                alertDialog$Builder.f22702a.P = LocaleController.getString(i14);
                                alertDialog$Builder.n(frameLayout);
                                alertDialog$Builder.f22702a.C = 9;
                                if (z11) {
                                    i15 = R.string.MessageShowSensitiveContentMediaTextClosedButton;
                                } else {
                                    i15 = R.string.Cancel;
                                }
                                alertDialog$Builder.h(LocaleController.getString(i15), null);
                                if (!z11) {
                                    String string = LocaleController.getString(R.string.MessageShowSensitiveContentButton);
                                    final org.telegram.ui.Cells.r7 r7Var2 = r7Var;
                                    final float f12 = f10;
                                    final float f13 = f11;
                                    final int i16 = currentAccount;
                                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.b2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i17) {
                                            org.telegram.ui.ActionBar.b6 resourceProvider3;
                                            TL_account.contentSettings contentsettings2;
                                            oq0 oq0Var = new oq0(org.telegram.ui.Cells.r7.this, f12, f13);
                                            if (zArr[0]) {
                                                if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                                    oq0Var.run(Boolean.TRUE);
                                                    return;
                                                }
                                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                                org.telegram.ui.df dfVar = new org.telegram.ui.df(23, messagesController2, oq0Var);
                                                if (U == null) {
                                                    resourceProvider3 = null;
                                                } else {
                                                    resourceProvider3 = U.getResourceProvider();
                                                }
                                                ThemeActivity.B0(i16, context2, dfVar, resourceProvider3);
                                                return;
                                            }
                                            oq0Var.run(Boolean.FALSE);
                                        }
                                    });
                                }
                                if (o2Var2 != null && o2Var2.getContext() != null) {
                                    o2Var2.showDialog(alertDialog$Builder.f22702a);
                                } else {
                                    alertDialog$Builder.o();
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                MessageObject messageObject2 = r7Var.f25107n;
                if (messageObject2 != null && messageObject2.hasMediaSpoilers() && r7Var.f25098e0 == 0.0f && !r7Var.f25107n.isMediaSpoilersRevealedInSharedMedia) {
                    r7Var.n(f10, f11);
                } else if (messageObject != null) {
                    eu0Var.G0(i11, view, messageObject, ar0Var.B);
                }
            } else if (eu0.p0(i12) && (view instanceof org.telegram.ui.Cells.r7)) {
                MessageObject messageObject3 = ((org.telegram.ui.Cells.r7) view).getMessageObject();
                if (messageObject3 != null) {
                    eu0Var.G0(i11, view, messageObject3, ar0Var.B);
                }
            } else {
                int i14 = ar0Var.B;
                if (i14 == 10) {
                    if (((view instanceof org.telegram.ui.Cells.h6) || f11 < AndroidUtilities.dp(60.0f)) && i11 >= 0 && i11 < ns0Var.d.size()) {
                        Bundle bundle2 = new Bundle();
                        TLObject tLObject = (TLObject) ns0Var.d.get(i11);
                        if (tLObject instanceof TLRPC.Chat) {
                            bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).f22380id);
                        } else if (tLObject instanceof TLRPC.User) {
                            bundle2.putLong("user_id", ((TLRPC.User) tLObject).f22527id);
                        } else {
                            return;
                        }
                        o2Var.presentFragment(new qn(bundle2));
                    }
                } else if (i14 == 11) {
                    if (ar0Var.h.getAdapter() == pt0Var) {
                        if (i11 >= 0) {
                            ArrayList arrayList = pt0Var.f31753e;
                            ArrayList arrayList2 = pt0Var.f31754f;
                            if (i11 < arrayList.size()) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", o2Var.getUserConfig().getClientUserId());
                                bundle3.putInt("chatMode", 3);
                                qn qnVar = new qn(bundle3);
                                qnVar.Z3 = ((SavedMessagesController.SavedDialog) arrayList.get(i11)).dialogId;
                                o2Var.presentFragment(qnVar);
                                return;
                            }
                            int size = i11 - arrayList.size();
                            if (size < arrayList2.size()) {
                                MessageObject messageObject4 = (MessageObject) arrayList2.get(size);
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("user_id", o2Var.getUserConfig().getClientUserId());
                                bundle4.putInt("message_id", messageObject4.getId());
                                ir0 ir0Var = new ir0(eu0Var, bundle4, size);
                                ir0Var.H7 = messageObject4.getId();
                                o2Var.presentFragment(ir0Var);
                            }
                        }
                    } else if (eu0Var.f28178y1) {
                        if (ot0Var.v.f5378y == 0) {
                            ot0Var.E(view);
                        }
                    } else {
                        Bundle bundle5 = new Bundle();
                        if (i11 >= 0 && i11 < ot0Var.f31441f.size()) {
                            bundle5.putLong("user_id", o2Var.getUserConfig().getClientUserId());
                            bundle5.putInt("chatMode", 3);
                            qn qnVar2 = new qn(bundle5);
                            qnVar2.Z3 = ((SavedMessagesController.SavedDialog) ot0Var.f31441f.get(i11)).dialogId;
                            o2Var.presentFragment(qnVar2);
                        }
                    }
                } else if (i14 == 15 && (view instanceof org.telegram.ui.Cells.t1)) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    MessageObject messageObject5 = t1Var.getMessageObject();
                    ar0Var.h.B0();
                    int currentAccount2 = o2Var.getCurrentAccount();
                    MessagesController messagesController2 = o2Var.getMessagesController();
                    long j11 = this.f7911b;
                    TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j11));
                    x60 F = x60.F(ar0Var, b6Var, t1Var);
                    F.f34553c0 = true;
                    if (messageObject5.isOutOwner()) {
                        i13 = 5;
                    }
                    F.V(i13);
                    F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new e5.w(eu0Var, j11, messageObject5, 25), false);
                    if (!messageObject5.isPollClosed()) {
                        if (messageObject5.canUnvote()) {
                            F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new fq0(eu0Var, b6Var, currentAccount2, messageObject5), false);
                        }
                        if (!messageObject5.isForwarded() && ((messageObject5.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                            int i15 = R.drawable.msg_pollstop;
                            if (messageObject5.isQuiz()) {
                                i10 = R.string.StopQuiz;
                            } else {
                                i10 = R.string.StopPoll;
                            }
                            F.c(i15, LocaleController.getString(i10), new fq0(eu0Var, b6Var, messageObject5, currentAccount2), false);
                        }
                    }
                    F.Z();
                }
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f7910a) {
            case 1:
                qn.X0((qn) this.f7912c, (TLRPC.TL_game) this.d, (MessageObject) this.f7913e, (String) this.f7914f, this.f7911b);
                return;
            default:
                b21 b21Var = (b21) this.f7912c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.f7913e;
                hc hcVar = (hc) this.f7914f;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    long j10 = this.f7911b;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (j10 == ((Integer) obj).intValue()) {
                            b21Var.m(0L, false);
                        }
                    } else {
                        b21Var.f27000a0.addAll(hashSet);
                        b21Var.o();
                        oc.a0(b21Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new lg(b21Var, hashSet, arrayList, j10), new jg0(b21Var, arrayList, hcVar, 19)).j();
                        c2Var.dismiss();
                        return;
                    }
                }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    public c3(qn qnVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        this.f7910a = 1;
        this.f7912c = qnVar;
        this.d = tL_game;
        this.f7913e = messageObject;
        this.f7914f = str;
        this.f7911b = j10;
    }

    public c3(b21 b21Var, ArrayList arrayList, long j10, HashSet hashSet, hc hcVar) {
        this.f7910a = 3;
        this.f7912c = b21Var;
        this.d = arrayList;
        this.f7911b = j10;
        this.f7913e = hashSet;
        this.f7914f = hcVar;
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }
}
