package bi;

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
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.ru0;
import org.telegram.ui.Components.t90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.af1;
import org.telegram.ui.un;
public final class m4 implements org.telegram.ui.ActionBar.b2, am0 {
    public final int f5079a;
    public final long f5080b;
    public final NotificationCenter.NotificationCenterDelegate f5081c;
    public final Object d;
    public final Object e;
    public final Object f5082f;

    public m4(Object obj, KeyEvent.Callback callback, Object obj2, long j10, Object obj3, int i10) {
        this.f5079a = i10;
        this.f5081c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.e = obj2;
        this.f5080b = j10;
        this.f5082f = obj3;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void e(final float f7, final float f10, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i11;
        long j10;
        int i12 = i10;
        final aw0 aw0Var = (aw0) this.f5081c;
        at0 at0Var = (at0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.f5082f;
        ju0 ju0Var = aw0Var.S;
        lv0 lv0Var = aw0Var.T;
        ku0 ku0Var = aw0Var.f26644c0;
        mv0 mv0Var = aw0Var.U;
        org.telegram.ui.ActionBar.r2 r2Var = aw0Var.f26704x1;
        int i13 = at0Var.E;
        if (i13 == 7) {
            if (view instanceof org.telegram.ui.Cells.ab) {
                if (!ku0Var.e.isEmpty()) {
                    i12 = ((Integer) ku0Var.e.get(i12)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = ku0Var.d.participants.participants.get(i12);
                if (i12 >= 0 && i12 < ku0Var.d.participants.participants.size()) {
                    aw0Var.P0(chatParticipant, false, view);
                    return;
                }
                return;
            }
            s4.h0 adapter = at0Var.h.getAdapter();
            ru0 ru0Var = aw0Var.f26672l0;
            if (adapter == ru0Var) {
                TLObject E = ru0Var.E(i12);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j10 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (E instanceof TLRPC.ChatParticipant) {
                    j10 = ((TLRPC.ChatParticipant) E).user_id;
                } else {
                    return;
                }
                if (j10 != 0 && j10 != r2Var.getUserConfig().getClientUserId()) {
                    r2Var.presentFragment(new ProfileActivity(a1.g.h(j10, "user_id"), null));
                }
            }
        } else if (i13 == 6 && (view instanceof org.telegram.ui.Cells.m6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.m6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f22027id);
            if (r2Var.getMessagesController().checkCanOpenChat(bundle, r2Var)) {
                if (chat.forum) {
                    HashSet hashSet = af1.f37733q1;
                    r2Var.presentFragment(af1.E0(r2Var.getMessagesController(), r2Var.getMessagesStorage(), bundle));
                    return;
                }
                r2Var.presentFragment(new un(bundle));
            }
        } else if (i13 == 1 && (view instanceof org.telegram.ui.Cells.o7)) {
            aw0Var.N0(i12, view, ((org.telegram.ui.Cells.o7) view).getMessage(), at0Var.E);
        } else {
            int i14 = 3;
            if (i13 == 3 && (view instanceof org.telegram.ui.Cells.r7)) {
                aw0Var.N0(i12, view, ((org.telegram.ui.Cells.r7) view).getMessage(), at0Var.E);
            } else if ((i13 == 2 || i13 == 4) && (view instanceof org.telegram.ui.Cells.n7)) {
                aw0Var.N0(i12, view, ((org.telegram.ui.Cells.n7) view).getMessage(), at0Var.E);
            } else if (i13 == 5 && (view instanceof org.telegram.ui.Cells.d2)) {
                aw0Var.N0(i12, view, (MessageObject) ((org.telegram.ui.Cells.d2) view).getParentObject(), at0Var.E);
            } else if (i13 == 0 && (view instanceof org.telegram.ui.Cells.w7)) {
                final org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
                MessageObject messageObject = w7Var.getMessageObject();
                if (messageObject != null && messageObject.isSensitive()) {
                    if (r2Var != null) {
                        final int currentAccount = r2Var.getCurrentAccount();
                        final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                        final org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(context, 3, null);
                        e2Var.r(200L);
                        messagesController.getContentSettings(new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                final boolean z10;
                                boolean z11;
                                org.telegram.ui.ActionBar.u6 resourceProvider;
                                int dp;
                                int dp2;
                                org.telegram.ui.ActionBar.u6 resourceProvider2;
                                int i15;
                                int i16;
                                final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                                org.telegram.ui.ActionBar.r2 r2Var2 = aw0.this.f26704x1;
                                e2Var.c(200L);
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
                                    if (r2Var2 == null) {
                                        resourceProvider = null;
                                    } else {
                                        resourceProvider = r2Var2.getResourceProvider();
                                    }
                                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context2, 1, resourceProvider);
                                    y1Var.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
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
                                    frameLayout.addView(y1Var, gb1.h(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                    y1Var.setOnClickListener(new r0(6, zArr));
                                }
                                if (r2Var2 == null) {
                                    resourceProvider2 = null;
                                } else {
                                    resourceProvider2 = r2Var2.getResourceProvider();
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, resourceProvider2);
                                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                                if (z11) {
                                    i15 = R.string.MessageShowSensitiveContentMediaTextClosed;
                                } else {
                                    i15 = R.string.MessageShowSensitiveContentMediaText;
                                }
                                alertDialog$Builder.f22368a.T = LocaleController.getString(i15);
                                alertDialog$Builder.o(frameLayout);
                                alertDialog$Builder.f22368a.G = 9;
                                if (z11) {
                                    i16 = R.string.MessageShowSensitiveContentMediaTextClosedButton;
                                } else {
                                    i16 = R.string.Cancel;
                                }
                                alertDialog$Builder.h(LocaleController.getString(i16), null);
                                if (!z11) {
                                    String string = LocaleController.getString(R.string.MessageShowSensitiveContentButton);
                                    final org.telegram.ui.Cells.w7 w7Var2 = w7Var;
                                    final float f11 = f7;
                                    final float f12 = f10;
                                    final int i17 = currentAccount;
                                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.b2() {
                                        @Override
                                        public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i18) {
                                            org.telegram.ui.ActionBar.u6 resourceProvider3;
                                            TL_account.contentSettings contentsettings2;
                                            ps0 ps0Var = new ps0(org.telegram.ui.Cells.w7.this, f11, f12);
                                            if (zArr[0]) {
                                                if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                                    ps0Var.run(Boolean.TRUE);
                                                    return;
                                                }
                                                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                                oy oyVar = new oy(7, messagesController2, ps0Var);
                                                if (U == null) {
                                                    resourceProvider3 = null;
                                                } else {
                                                    resourceProvider3 = U.getResourceProvider();
                                                }
                                                ThemeActivity.D0(i17, context2, oyVar, resourceProvider3);
                                                return;
                                            }
                                            ps0Var.run(Boolean.FALSE);
                                        }
                                    });
                                }
                                if (r2Var2 != null && r2Var2.getContext() != null) {
                                    r2Var2.showDialog(alertDialog$Builder.f22368a);
                                } else {
                                    alertDialog$Builder.p();
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                MessageObject messageObject2 = w7Var.f25650n;
                if (messageObject2 != null && messageObject2.hasMediaSpoilers() && w7Var.f25646i0 == 0.0f && !w7Var.f25650n.isMediaSpoilersRevealedInSharedMedia) {
                    w7Var.n(f7, f10);
                } else if (messageObject != null) {
                    aw0Var.N0(i12, view, messageObject, at0Var.E);
                }
            } else if (aw0.w0(i13) && (view instanceof org.telegram.ui.Cells.w7)) {
                MessageObject messageObject3 = ((org.telegram.ui.Cells.w7) view).getMessageObject();
                if (messageObject3 != null) {
                    aw0Var.N0(i12, view, messageObject3, at0Var.E);
                }
            } else {
                int i15 = at0Var.E;
                if (i15 == 10) {
                    if (((view instanceof org.telegram.ui.Cells.m6) || f10 < AndroidUtilities.dp(60.0f)) && i12 >= 0 && i12 < ju0Var.d.size()) {
                        Bundle bundle2 = new Bundle();
                        TLObject tLObject = (TLObject) ju0Var.d.get(i12);
                        if (tLObject instanceof TLRPC.Chat) {
                            bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).f22027id);
                        } else if (tLObject instanceof TLRPC.User) {
                            bundle2.putLong("user_id", ((TLRPC.User) tLObject).f22176id);
                        } else {
                            return;
                        }
                        r2Var.presentFragment(new un(bundle2));
                    }
                } else if (i15 == 11) {
                    if (at0Var.h.getAdapter() == mv0Var) {
                        if (i12 >= 0) {
                            ArrayList arrayList = mv0Var.e;
                            ArrayList arrayList2 = mv0Var.f30755f;
                            if (i12 < arrayList.size()) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", r2Var.getUserConfig().getClientUserId());
                                bundle3.putInt("chatMode", 3);
                                un unVar = new un(bundle3);
                                unVar.f44373p4 = ((SavedMessagesController.SavedDialog) arrayList.get(i12)).dialogId;
                                r2Var.presentFragment(unVar);
                                return;
                            }
                            int size = i12 - arrayList.size();
                            if (size < arrayList2.size()) {
                                MessageObject messageObject4 = (MessageObject) arrayList2.get(size);
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("user_id", r2Var.getUserConfig().getClientUserId());
                                bundle4.putInt("message_id", messageObject4.getId());
                                it0 it0Var = new it0(aw0Var, bundle4, size);
                                it0Var.X7 = messageObject4.getId();
                                r2Var.presentFragment(it0Var);
                            }
                        }
                    } else if (aw0Var.E1) {
                        if (lv0Var.v.f47870y == 0) {
                            lv0Var.E(view);
                        }
                    } else {
                        Bundle bundle5 = new Bundle();
                        if (i12 >= 0 && i12 < lv0Var.f30294f.size()) {
                            bundle5.putLong("user_id", r2Var.getUserConfig().getClientUserId());
                            bundle5.putInt("chatMode", 3);
                            un unVar2 = new un(bundle5);
                            unVar2.f44373p4 = ((SavedMessagesController.SavedDialog) lv0Var.f30294f.get(i12)).dialogId;
                            r2Var.presentFragment(unVar2);
                        }
                    }
                } else if (i15 == 15 && (view instanceof org.telegram.ui.Cells.s1)) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                    MessageObject messageObject5 = s1Var.getMessageObject();
                    at0Var.h.C0();
                    int currentAccount2 = r2Var.getCurrentAccount();
                    MessagesController messagesController2 = r2Var.getMessagesController();
                    long j11 = this.f5080b;
                    TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j11));
                    k80 F = k80.F(at0Var, u6Var, s1Var);
                    F.f29842c0 = true;
                    if (messageObject5.isOutOwner()) {
                        i14 = 5;
                    }
                    F.V(i14);
                    F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new a3.i0(aw0Var, j11, messageObject5, 24), false);
                    if (!messageObject5.isPollClosed()) {
                        if (messageObject5.canUnvote()) {
                            F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new ds0(aw0Var, u6Var, currentAccount2, messageObject5), false);
                        }
                        if (!messageObject5.isForwarded() && ((messageObject5.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                            int i16 = R.drawable.msg_pollstop;
                            if (messageObject5.isQuiz()) {
                                i11 = R.string.StopQuiz;
                            } else {
                                i11 = R.string.StopPoll;
                            }
                            F.c(i16, LocaleController.getString(i11), new ds0(aw0Var, u6Var, messageObject5, currentAccount2), false);
                        }
                    }
                    F.Z();
                }
            }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f5079a) {
            case 1:
                un.i1((un) this.f5081c, (TLRPC.TL_game) this.d, (MessageObject) this.e, (String) this.f5082f, this.f5080b);
                return;
            default:
                e41 e41Var = (e41) this.f5081c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) this.f5082f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j10 = this.f5080b;
                    if (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j10 == ((Integer) obj).intValue()) {
                            e41Var.n(0L, false);
                        }
                    } else {
                        e41Var.f27736h0.addAll(hashSet);
                        e41Var.p();
                        org.telegram.ui.Components.wc.b0(e41Var.h).V(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new y2(e41Var, hashSet, arrayList, j10, 18), new t90(e41Var, arrayList, k5Var, 24)).j();
                        e2Var.dismiss();
                        return;
                    }
                }
        }
    }

    public m4(un unVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        this.f5079a = 1;
        this.f5081c = unVar;
        this.d = tL_game;
        this.e = messageObject;
        this.f5082f = str;
        this.f5080b = j10;
    }

    public m4(e41 e41Var, ArrayList arrayList, long j10, HashSet hashSet, org.telegram.ui.Components.k5 k5Var) {
        this.f5079a = 3;
        this.f5081c = e41Var;
        this.d = arrayList;
        this.f5080b = j10;
        this.e = hashSet;
        this.f5082f = k5Var;
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
