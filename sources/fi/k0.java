package fi;

import ai.h3;
import ai.v9;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.bb;
import ci.g2;
import ci.g9;
import ci.h1;
import ci.y8;
import ci.za;
import ei.q4;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.t20;
import org.telegram.ui.eg1;
import org.telegram.ui.v10;
import org.telegram.ui.zn;
import w7.x5;
public final class k0 extends e3 implements NotificationCenter.NotificationCenterDelegate, me.d, o2 {
    public static final int V = 0;
    public final t20 E;
    public final v10 F;
    public final m71 G;
    public final bb H;
    public final bb I;
    public final yf.y J;
    public final yf.y K;
    public final View L;
    public final t0 M;
    public final boolean N;
    public final Utilities.Callback O;
    public final Paint P;
    public ArrayList Q;
    public String R;
    public String S;
    public i0.b T;
    public i0.b U;
    public final me.b f9989b;
    public final me.b f9990c;
    public final h1 d;
    public final long f9991e;
    public TLRPC.Chat f9992f;
    public boolean h;
    public ci.d f9993n;
    public ci.d f9994r;
    public final m2 f9995s;
    public final f0 v;
    public final j0 f9996w;
    public final e0 f9997x;
    public final t20 f9998y;

    public k0(m2 m2Var, long j3) {
        this(m2Var, j3, null, null);
    }

    public static void B(k0 k0Var, r61 r61Var, View view) {
        long j3;
        TLRPC.Chat chat;
        int i10;
        m2 m2Var = k0Var.f9995s;
        if (!k0Var.U(r61Var)) {
            int i11 = r61Var.d;
            boolean z10 = false;
            if (i11 == 101) {
                k0Var.h = !k0Var.h;
                MessagesController.getInstance(k0Var.currentAccount).toggleCommunityCollapsedInDialogs(k0Var.f9991e, k0Var.h);
                if (view instanceof v8) {
                    ((v8) view).getCheckBox().c(k0Var.h, true);
                } else {
                    k0Var.v.d.W2.N(false);
                }
            } else if (i11 == 100) {
                k0Var.d.D(1);
                k0Var.M.e();
            } else {
                Object obj = r61Var.G;
                if (obj instanceof TLRPC.Chat) {
                    chat = (TLRPC.Chat) obj;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j3 = -chat.f20032id;
                } else if (obj instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) obj).f20179id;
                    chat = null;
                } else {
                    return;
                }
                TLRPC.Chat chat2 = chat;
                int b10 = u0.b(k0Var.currentAccount, j3);
                if (b10 != 1 && b10 != 2) {
                    if (b10 == 3) {
                        j90 j90Var = new j90(k0Var.getContext(), chat2, null, k0Var.f9995s, k0Var.resourcesProvider);
                        j90Var.f27632n = new ad((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                        j90Var.show();
                        return;
                    } else if (b10 == 4) {
                        ad adVar = new ad((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                        int i12 = R.raw.e_hand_2;
                        if (z10) {
                            i10 = R.string.CommunityHiddenChannelUnavailable;
                        } else {
                            i10 = R.string.CommunityHiddenGroupUnavailable;
                        }
                        org.telegram.messenger.q.q(i10, adVar, i12, 36);
                        return;
                    } else {
                        return;
                    }
                }
                if (m2Var instanceof zn) {
                    zn znVar = (zn) m2Var;
                    TLRPC.Chat chat3 = znVar.f44752e;
                    TLRPC.User i13 = znVar.i();
                    if ((chat3 != null && chat3.f20032id == (-j3)) || (i13 != null && i13.f20179id == j3)) {
                        k0Var.dismiss();
                        return;
                    }
                }
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                if (ChatObject.isForum(chat2)) {
                    if (ChatObject.areTabsEnabled(chat2)) {
                        zn znVar2 = new zn(bundle);
                        ng.d.a(znVar2, MessagesStorage.TopicKey.of(j3, MessagesController.getInstance(k0Var.currentAccount).getForumLastTopicId(chat2.f20032id)));
                        m2Var.presentFragment(znVar2);
                    } else {
                        m2Var.presentFragment(new eg1(bundle));
                    }
                } else {
                    m2Var.presentFragment(new zn(bundle));
                }
                k0Var.dismiss();
            }
        }
    }

    public static void C(k0 k0Var, ArrayList arrayList) {
        String formatPluralString;
        String str;
        boolean z10;
        ArrayList arrayList2;
        arrayList.add(r61.D(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i10 = 0;
        arrayList.add(r61.D(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        r61 r61Var = new r61(39);
        r61Var.d = 101;
        r61Var.f30361l = string;
        r61Var.f30374z = 0;
        r61Var.K(k0Var.h);
        arrayList.add(r61Var);
        arrayList.add(r61.A(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        t0 t0Var = k0Var.M;
        boolean z11 = true;
        if (t0Var.f10060n && t0Var.f10058l == 1 && (arrayList2 = t0Var.f10056j) != null && arrayList2.size() == 1) {
            arrayList.add(r61.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            t0Var.c(arrayList);
            arrayList.add(r61.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = t0Var.f10058l;
            if (i11 > 0) {
                int i12 = t0Var.f10062p;
                int i13 = R.drawable.filled_requests_24;
                if (i11 == i12) {
                    formatPluralString = LocaleController.getString(R.string.CommunityPendingRequests);
                } else {
                    formatPluralString = LocaleController.formatPluralString("CommunityPendingRequestsRow", i11, new Object[0]);
                }
                if (i12 > 0) {
                    str = Integer.toString(i12);
                } else {
                    str = null;
                }
                int i14 = gi.i.f10921a;
                r61 J = r61.J(gi.i.class);
                J.d = 100;
                J.f30360k = i13;
                J.f30361l = formatPluralString;
                J.f30363n = str;
                J.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                J.f30366q = true;
                arrayList.add(J);
                arrayList.add(r61.D(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(k0Var.currentAccount).buildCommunityPeers(k0Var.f9991e);
        if (buildCommunityPeers != null) {
            if (!buildCommunityPeers.chatsYouAreIn.isEmpty()) {
                arrayList.add(r61.s(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList3 = buildCommunityPeers.chatsYouAreIn;
                int size = arrayList3.size();
                int i15 = 0;
                while (i15 < size) {
                    MessagesController.CommunityPeerDialog communityPeerDialog = arrayList3.get(i15);
                    i15++;
                    arrayList.add(q0.a(communityPeerDialog, k0Var));
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (!buildCommunityPeers.chatsYouCanView.isEmpty()) {
                if (z10) {
                    arrayList.add(r61.D(22, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(r61.s(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList4 = buildCommunityPeers.chatsYouCanView;
                int size2 = arrayList4.size();
                int i16 = 0;
                while (i16 < size2) {
                    MessagesController.CommunityPeerDialog communityPeerDialog2 = arrayList4.get(i16);
                    i16++;
                    arrayList.add(q0.a(communityPeerDialog2, k0Var));
                }
                z10 = true;
            }
            if (!buildCommunityPeers.chatsYouCanJoin.isEmpty()) {
                if (z10) {
                    arrayList.add(r61.D(24, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(r61.s(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList5 = buildCommunityPeers.chatsYouCanJoin;
                int size3 = arrayList5.size();
                int i17 = 0;
                while (i17 < size3) {
                    MessagesController.CommunityPeerDialog communityPeerDialog3 = arrayList5.get(i17);
                    i17++;
                    arrayList.add(q0.a(communityPeerDialog3, k0Var));
                }
            } else {
                z11 = z10;
            }
            if (!buildCommunityPeers.chatsOther.isEmpty()) {
                if (z11) {
                    arrayList.add(r61.D(26, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(r61.s(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList6 = buildCommunityPeers.chatsOther;
                int size4 = arrayList6.size();
                while (i10 < size4) {
                    MessagesController.CommunityPeerDialog communityPeerDialog4 = arrayList6.get(i10);
                    i10++;
                    arrayList.add(q0.a(communityPeerDialog4, k0Var));
                }
            }
        }
    }

    public static void o(k0 k0Var, boolean z10, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                u0.f(new ad((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 2, z10);
                k0Var.d.D(0);
                return;
            }
            c1.p((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
            return;
        }
        u0.f(new ad((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 1, z10);
        k0Var.d.D(0);
    }

    public static void p(k0 k0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        k0Var.f9993n.setLoading(false);
        if (tL_error != null) {
            c1.p((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        } else if (arrayList != null) {
            k0Var.Q = arrayList;
            if (arrayList.isEmpty()) {
                org.telegram.messenger.q.q(R.string.CommunityNoChatsToAdd, new ad((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), R.raw.info, 36);
                return;
            }
            k0Var.f9997x.d.W2.N(false);
            k0Var.d.D(2);
        }
    }

    public static void q(k0 k0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            c1.p((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        }
    }

    public static void r(k0 k0Var, a2 a2Var, long j3, boolean z10, long j10) {
        a2Var.dismiss();
        if (j10 == 0) {
            return;
        }
        k0Var.W(MessagesController.getInstance(k0Var.currentAccount).getChat(Long.valueOf(j10)), j3, z10);
    }

    public static void s(k0 k0Var, boolean z10, boolean z11, long j3) {
        int i10;
        Context context = k0Var.getContext();
        d6 d6Var = k0Var.resourcesProvider;
        String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
        if (z10) {
            i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
        } else if (z11) {
            i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
        } else {
            i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
        }
        a2 O = g5.O(context, d6Var, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), new ai.j(k0Var, j3, 8));
        O.show();
        TextView textView = (TextView) O.d(-1);
        if (textView != null) {
            textView.setTextColor(h6.x0(null, h6.f21026q7, false));
        }
    }

    public static void z(k0 k0Var) {
        if (!ChatObject.canAddChatToCommunity(k0Var.f9992f)) {
            k0Var.dismiss();
            return;
        }
        ci.d dVar = k0Var.f9993n;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(k0Var.currentAccount).fetchChatsToAddToCommunity(new t(k0Var, 2));
    }

    public final boolean U(r61 r61Var) {
        Object obj = r61Var.G;
        if (obj instanceof gi.f) {
            gi.f fVar = (gi.f) obj;
            long j3 = fVar.f10906a;
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
            m2 m2Var = this.f9995s;
            if (user != null) {
                m2Var.presentFragment(zn.W9(user.f20179id));
                return true;
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new hi.c(getContext(), chat, new y8(24, this, fVar)).show();
                return true;
            } else {
                m2Var.presentFragment(zn.W9(-chat.f20032id));
                return true;
            }
        }
        return false;
    }

    public final void V(ArrayList arrayList, boolean z10) {
        String str;
        String str2;
        int i10 = 0;
        if (!z10) {
            arrayList.add(r61.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(r61.D(0, AndroidUtilities.dp(56.0f)));
        }
        if (this.Q != null) {
            if (z10 && (str2 = this.S) != null) {
                str = str2.toLowerCase();
            } else {
                str = null;
            }
            ArrayList arrayList2 = this.Q;
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (z10 && !TextUtils.isEmpty(str)) {
                    String str3 = chat.title;
                    if (str3 != null && str3.toLowerCase().contains(str)) {
                        arrayList.add(r61.v(chat));
                    }
                } else {
                    arrayList.add(r61.v(chat));
                }
            }
        }
    }

    public final void W(TLRPC.Chat chat, long j3, boolean z10) {
        long j10 = -chat.f20032id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (!ChatObject.isChannel(chat)) {
            a2 a2Var = new a2(getContext(), 3, null);
            a2Var.q(250L);
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j10, null, new d(this, a2Var, j3, z10, 1));
            return;
        }
        MessagesController.getInstance(this.currentAccount).linkCommunity(j10, j3, z10, new za(1, this, isChannelAndNotMegaGroup));
    }

    public final void X(r61 r61Var) {
        Object obj = r61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.N) {
                this.O.run(chat);
                dismiss();
                return;
            }
            new hi.b(getContext(), this.f9992f, -chat.f20032id, new h3(15, this, chat)).show();
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (!this.f9989b.f16366f && !this.f9990c.f16366f) {
            View currentView = this.d.getCurrentView();
            if (currentView instanceof h0) {
                return ((h0) currentView).f9975e;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void d(s2 s2Var) {
        TLRPC.TL_forumTopic findTopic;
        if (s2Var.getMessage() != null && (findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-s2Var.getDialogId(), MessageObject.getTopicId(this.currentAccount, s2Var.getMessage().messageOwner, true))) != null) {
            ng.d.m(this.f9995s, -s2Var.getDialogId(), findTopic, 0);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j3 = this.f9991e;
        f0 f0Var = this.v;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).f20033id == j3) {
                f0Var.d.W2.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
                this.f9992f = chat;
                f0Var.f9972a.setTitle(DialogObject.getName(chat));
                f0Var.h.e(this.f9992f, f0Var.f9965n);
            }
        }
    }

    @Override
    public final void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        super.dismissInternal();
    }

    @Override
    public final void f(s2 s2Var) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().I(s2Var.getDialogId())) {
            m2 m2Var = this.f9995s;
            m2Var.getOrCreateStoryViewer().getClass();
            m2Var.getOrCreateStoryViewer().D(m2Var.getContext(), s2Var.getDialogId(), v9.a((sm0) s2Var.getParent()));
        }
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = 8;
        if (i10 == 1) {
            float b10 = yf.e0.b(f7);
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
            f0 f0Var = this.v;
            f0Var.f9972a.setAlpha(b10);
            f0Var.f9972a.setScaleX(lerp);
            f0Var.f9972a.setScaleY(lerp);
            org.telegram.ui.ActionBar.k kVar = f0Var.f9972a;
            int i21 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            kVar.setVisibility(i15);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            t20 t20Var = this.f9998y;
            t20Var.setAlpha(f7);
            t20Var.setScaleX(lerp2);
            t20Var.setScaleY(lerp2);
            int i22 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i22 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            t20Var.setVisibility(i16);
            f0Var.d.setAlpha(b10);
            m71 m71Var = f0Var.d;
            if (i21 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            m71Var.setVisibility(i17);
            this.f9993n.setAlpha(b10);
            this.f9993n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.f9993n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            ci.d dVar = this.f9993n;
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            dVar.setVisibility(i18);
            v10 v10Var = this.F;
            v10Var.setAlpha(f7);
            if (i22 > 0) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            v10Var.setVisibility(i19);
            this.containerView.invalidate();
            this.H.invalidate();
        }
        if (i10 == 2) {
            float b11 = yf.e0.b(f7);
            float lerp3 = AndroidUtilities.lerp(0.9f, 1.0f, b11);
            e0 e0Var = this.f9997x;
            e0Var.f9972a.setAlpha(b11);
            e0Var.f9972a.setScaleX(lerp3);
            e0Var.f9972a.setScaleY(lerp3);
            org.telegram.ui.ActionBar.k kVar2 = e0Var.f9972a;
            int i23 = (b11 > 0.0f ? 1 : (b11 == 0.0f ? 0 : -1));
            if (i23 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            kVar2.setVisibility(i11);
            float lerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            t20 t20Var2 = this.E;
            t20Var2.setAlpha(f7);
            t20Var2.setScaleX(lerp4);
            t20Var2.setScaleY(lerp4);
            int i24 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i24 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            t20Var2.setVisibility(i12);
            e0Var.d.setAlpha(b11);
            m71 m71Var2 = e0Var.d;
            if (i23 > 0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            m71Var2.setVisibility(i13);
            if (!this.N) {
                this.f9994r.setAlpha(b11);
                this.f9994r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.f9994r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                ci.d dVar2 = this.f9994r;
                if (i23 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                dVar2.setVisibility(i14);
            }
            m71 m71Var3 = this.G;
            m71Var3.setAlpha(f7);
            if (i24 > 0) {
                i20 = 0;
            }
            m71Var3.setVisibility(i20);
            this.containerView.invalidate();
            this.I.invalidate();
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() > 0) {
            if (this.d.getCurrentPosition() == 2) {
                me.b bVar = this.f9990c;
                if (bVar.f16366f) {
                    this.f9997x.d.V2.h1(1, this.U.f11576b);
                    bVar.a(false, true);
                    setAllowNestedScroll(true);
                    t20 t20Var = this.E;
                    AndroidUtilities.hideKeyboard(t20Var.f30964r);
                    t20Var.f30964r.clearFocus();
                    return;
                }
            }
            this.d.D(0);
            return;
        }
        super.onBackPressed();
    }

    public k0(m2 m2Var, long j3, ArrayList arrayList, q4 q4Var) {
        super(m2Var.getContext(), m2Var.getResourceProvider(), true, true);
        is isVar = is.h;
        this.f9989b = new me.b(1, this, isVar, 350L, false);
        this.f9990c = new me.b(2, this, isVar, 350L, false);
        this.J = new yf.y(2);
        this.K = new yf.y(8);
        Paint paint = new Paint(1);
        this.P = paint;
        i0.b bVar = i0.b.f11574e;
        this.T = bVar;
        this.U = bVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.f9995s = m2Var;
        this.N = arrayList != null;
        this.Q = arrayList;
        this.O = q4Var;
        Context context = m2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = h6.f20730a7;
        paint.setColor(h6.w0(i10, this.resourcesProvider));
        fixNavigationBar(h6.w0(i10, this.resourcesProvider));
        this.containerView = new g9(this, context);
        h1 h1Var = new h1(this, context, 2);
        this.d = h1Var;
        int i11 = this.backgroundPaddingLeft;
        h1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.d, x5.e(-1, -1, 119));
        this.H = new bb(this, context, 3);
        this.I = new bb(this, context, 3);
        t20 t20Var = new t20(context, this.resourcesProvider);
        this.f9998y = t20Var;
        t20Var.setCloseButtonVisible(true);
        t20Var.f30967x = true;
        t20Var.e();
        String string = LocaleController.getString(R.string.Search);
        g2 g2Var = t20Var.f30964r;
        g2Var.setHint(string);
        g2Var.addTextChangedListener(new w(this));
        t20Var.setVisibility(8);
        t20 t20Var2 = new t20(context, this.resourcesProvider);
        this.E = t20Var2;
        t20Var2.setCloseButtonVisible(true);
        t20Var2.f30967x = true;
        t20Var2.e();
        String string2 = LocaleController.getString(R.string.Search);
        g2 g2Var2 = t20Var2.f30964r;
        g2Var2.setHint(string2);
        g2Var2.addTextChangedListener(new x(this));
        t20Var2.setVisibility(8);
        m71 m71Var = new m71(context, this.currentAccount, 0, false, new t(this, 0), new u(this, 0), null, this.resourcesProvider);
        this.G = m71Var;
        m71Var.j(new y(this));
        m71Var.setClipToPadding(false);
        m71Var.setVisibility(8);
        m71Var.p1();
        m71Var.W2.f25890r = false;
        m71Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        v10 v10Var = new v10(m2Var);
        this.F = v10Var;
        v10Var.setVisibility(8);
        v10Var.setBackground(null);
        v10Var.setChatPreviewDelegate(new Object());
        v10Var.setUiCallback(new a0(this));
        v10Var.f42830b.setClipToPadding(false);
        this.L = new View(getContext());
        Context context2 = getContext();
        d6 d6Var = this.resourcesProvider;
        t0 t0Var = new t0(context2, d6Var, new ad((FrameLayout) this.containerView, d6Var), this.currentAccount, j3);
        this.M = t0Var;
        t0Var.h = new b0(this, m2Var);
        this.f9991e = j3;
        this.f9992f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
        MessagesController.getInstance(this.currentAccount).getChatFull(j3);
        TLRPC.Chat chat = this.f9992f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        gg.p0 p0Var = new gg.p0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        p0Var.f10763f = this.f9992f;
        p0Var.h = false;
        ArrayList arrayList2 = t20Var.F;
        arrayList2.add(p0Var);
        t20Var.I = arrayList2.size() - 1;
        t20Var.f();
        setBackgroundColor(h6.w0(i10, this.resourcesProvider));
        this.f9996w = new j0(this, context);
        this.v = new f0(this, context);
        this.f9997x = new e0(this, context);
        this.d.setAdapter(new c0(this));
        t20Var.setCloseButtonOnClickListener(new v(this, 0));
        t20Var2.setCloseButtonOnClickListener(new v(this, 1));
        t0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j3, 0, true);
        sc.a((FrameLayout) this.containerView, new Object());
        ViewGroup viewGroup = this.containerView;
        u uVar = new u(this, 1);
        WeakHashMap weakHashMap = r0.i0.f46856a;
        r0.a0.i(viewGroup, uVar);
    }

    @Override
    public final void a(s2 s2Var) {
    }

    @Override
    public final void g(s2 s2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
