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
import org.telegram.messenger.v0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v20;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.eo;
import org.telegram.ui.hg1;
import org.telegram.ui.y10;
import w7.w5;
public final class k0 extends e3 implements NotificationCenter.NotificationCenterDelegate, me.d, o2 {
    public static final int V = 0;
    public final v20 E;
    public final y10 F;
    public final p71 G;
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
    public final me.b f9988b;
    public final me.b f9989c;
    public final h1 d;
    public final long f9990e;
    public TLRPC.Chat f9991f;
    public boolean h;
    public ci.d f9992n;
    public ci.d f9993r;
    public final m2 f9994s;
    public final f0 v;
    public final j0 f9995w;
    public final e0 f9996x;
    public final v20 f9997y;

    public k0(m2 m2Var, long j3) {
        this(m2Var, j3, null, null);
    }

    public static void A(k0 k0Var, u61 u61Var, View view) {
        long j3;
        TLRPC.Chat chat;
        int i10;
        m2 m2Var = k0Var.f9994s;
        if (!k0Var.U(u61Var)) {
            int i11 = u61Var.d;
            boolean z10 = false;
            if (i11 == 101) {
                k0Var.h = !k0Var.h;
                MessagesController.getInstance(k0Var.currentAccount).toggleCommunityCollapsedInDialogs(k0Var.f9990e, k0Var.h);
                if (view instanceof v8) {
                    ((v8) view).getCheckBox().c(k0Var.h, true);
                } else {
                    k0Var.v.d.W2.N(false);
                }
            } else if (i11 == 100) {
                k0Var.d.D(1);
                k0Var.M.e();
            } else {
                Object obj = u61Var.G;
                if (obj instanceof TLRPC.Chat) {
                    chat = (TLRPC.Chat) obj;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j3 = -chat.f19803id;
                } else if (obj instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) obj).f19950id;
                    chat = null;
                } else {
                    return;
                }
                TLRPC.Chat chat2 = chat;
                int b10 = u0.b(k0Var.currentAccount, j3);
                if (b10 != 1 && b10 != 2) {
                    if (b10 == 3) {
                        m90 m90Var = new m90(k0Var.getContext(), chat2, null, k0Var.f9994s, k0Var.resourcesProvider);
                        m90Var.f28448n = new zc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                        m90Var.show();
                        return;
                    } else if (b10 == 4) {
                        zc zcVar = new zc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                        int i12 = R.raw.e_hand_2;
                        if (z10) {
                            i10 = R.string.CommunityHiddenChannelUnavailable;
                        } else {
                            i10 = R.string.CommunityHiddenGroupUnavailable;
                        }
                        v0.q(i10, zcVar, i12, 36);
                        return;
                    } else {
                        return;
                    }
                }
                if (m2Var instanceof eo) {
                    eo eoVar = (eo) m2Var;
                    TLRPC.Chat chat3 = eoVar.f37246e;
                    TLRPC.User i13 = eoVar.i();
                    if ((chat3 != null && chat3.f19803id == (-j3)) || (i13 != null && i13.f19950id == j3)) {
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
                        eo eoVar2 = new eo(bundle);
                        ng.d.a(eoVar2, MessagesStorage.TopicKey.of(j3, MessagesController.getInstance(k0Var.currentAccount).getForumLastTopicId(chat2.f19803id)));
                        m2Var.presentFragment(eoVar2);
                    } else {
                        m2Var.presentFragment(new hg1(bundle));
                    }
                } else {
                    m2Var.presentFragment(new eo(bundle));
                }
                k0Var.dismiss();
            }
        }
    }

    public static void B(k0 k0Var, ArrayList arrayList) {
        String formatPluralString;
        String str;
        boolean z10;
        ArrayList arrayList2;
        arrayList.add(u61.D(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i10 = 0;
        arrayList.add(u61.D(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        u61 u61Var = new u61(39);
        u61Var.d = 101;
        u61Var.f31071l = string;
        u61Var.f31084z = 0;
        u61Var.K(k0Var.h);
        arrayList.add(u61Var);
        arrayList.add(u61.A(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        t0 t0Var = k0Var.M;
        boolean z11 = true;
        if (t0Var.f10059n && t0Var.f10057l == 1 && (arrayList2 = t0Var.f10055j) != null && arrayList2.size() == 1) {
            arrayList.add(u61.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            t0Var.c(arrayList);
            arrayList.add(u61.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = t0Var.f10057l;
            if (i11 > 0) {
                int i12 = t0Var.f10061p;
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
                int i14 = gi.i.f10920a;
                u61 J = u61.J(gi.i.class);
                J.d = 100;
                J.f31070k = i13;
                J.f31071l = formatPluralString;
                J.f31073n = str;
                J.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                J.f31076q = true;
                arrayList.add(J);
                arrayList.add(u61.D(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(k0Var.currentAccount).buildCommunityPeers(k0Var.f9990e);
        if (buildCommunityPeers != null) {
            if (!buildCommunityPeers.chatsYouAreIn.isEmpty()) {
                arrayList.add(u61.s(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
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
                    arrayList.add(u61.D(22, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(u61.s(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
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
                    arrayList.add(u61.D(24, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(u61.s(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
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
                    arrayList.add(u61.D(26, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(u61.s(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
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
                u0.f(new zc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 2, z10);
                k0Var.d.D(0);
                return;
            }
            c1.p((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
            return;
        }
        u0.f(new zc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 1, z10);
        k0Var.d.D(0);
    }

    public static void p(k0 k0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        k0Var.f9992n.setLoading(false);
        if (tL_error != null) {
            c1.p((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        } else if (arrayList != null) {
            k0Var.Q = arrayList;
            if (arrayList.isEmpty()) {
                v0.q(R.string.CommunityNoChatsToAdd, new zc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), R.raw.info, 36);
                return;
            }
            k0Var.f9996x.d.W2.N(false);
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
        c6 c6Var = k0Var.resourcesProvider;
        String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
        if (z10) {
            i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
        } else if (z11) {
            i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
        } else {
            i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
        }
        a2 O = g5.O(context, c6Var, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), new ai.j(k0Var, j3, 8));
        O.show();
        TextView textView = (TextView) O.d(-1);
        if (textView != null) {
            textView.setTextColor(h6.x0(null, h6.f20800q7, false));
        }
    }

    public static void z(k0 k0Var) {
        if (!ChatObject.canAddChatToCommunity(k0Var.f9991f)) {
            k0Var.dismiss();
            return;
        }
        ci.d dVar = k0Var.f9992n;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(k0Var.currentAccount).fetchChatsToAddToCommunity(new t(k0Var, 2));
    }

    public final boolean U(u61 u61Var) {
        Object obj = u61Var.G;
        if (obj instanceof gi.f) {
            gi.f fVar = (gi.f) obj;
            long j3 = fVar.f10905a;
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
            m2 m2Var = this.f9994s;
            if (user != null) {
                m2Var.presentFragment(eo.W9(user.f19950id));
                return true;
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new hi.c(getContext(), chat, new y8(24, this, fVar)).show();
                return true;
            } else {
                m2Var.presentFragment(eo.W9(-chat.f19803id));
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
            arrayList.add(u61.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(u61.D(0, AndroidUtilities.dp(56.0f)));
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
                        arrayList.add(u61.v(chat));
                    }
                } else {
                    arrayList.add(u61.v(chat));
                }
            }
        }
    }

    public final void W(TLRPC.Chat chat, long j3, boolean z10) {
        long j10 = -chat.f19803id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (!ChatObject.isChannel(chat)) {
            a2 a2Var = new a2(getContext(), 3, null);
            a2Var.q(250L);
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j10, null, new d(this, a2Var, j3, z10, 1));
            return;
        }
        MessagesController.getInstance(this.currentAccount).linkCommunity(j10, j3, z10, new za(1, this, isChannelAndNotMegaGroup));
    }

    public final void X(u61 u61Var) {
        Object obj = u61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.N) {
                this.O.run(chat);
                dismiss();
                return;
            }
            new hi.b(getContext(), this.f9991f, -chat.f19803id, new h3(15, this, chat)).show();
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (!this.f9988b.f16089f && !this.f9989c.f16089f) {
            View currentView = this.d.getCurrentView();
            if (currentView instanceof h0) {
                return ((h0) currentView).f9974e;
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
            ng.d.m(this.f9994s, -s2Var.getDialogId(), findTopic, 0);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j3 = this.f9990e;
        f0 f0Var = this.v;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).f19804id == j3) {
                f0Var.d.W2.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
                this.f9991f = chat;
                f0Var.f9971a.setTitle(DialogObject.getName(chat));
                f0Var.h.e(this.f9991f, f0Var.f9964n);
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
            m2 m2Var = this.f9994s;
            m2Var.getOrCreateStoryViewer().getClass();
            m2Var.getOrCreateStoryViewer().D(m2Var.getContext(), s2Var.getDialogId(), v9.a((wm0) s2Var.getParent()));
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
            f0Var.f9971a.setAlpha(b10);
            f0Var.f9971a.setScaleX(lerp);
            f0Var.f9971a.setScaleY(lerp);
            org.telegram.ui.ActionBar.k kVar = f0Var.f9971a;
            int i21 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            kVar.setVisibility(i15);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            v20 v20Var = this.f9997y;
            v20Var.setAlpha(f7);
            v20Var.setScaleX(lerp2);
            v20Var.setScaleY(lerp2);
            int i22 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i22 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            v20Var.setVisibility(i16);
            f0Var.d.setAlpha(b10);
            p71 p71Var = f0Var.d;
            if (i21 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            p71Var.setVisibility(i17);
            this.f9992n.setAlpha(b10);
            this.f9992n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.f9992n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            ci.d dVar = this.f9992n;
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            dVar.setVisibility(i18);
            y10 y10Var = this.F;
            y10Var.setAlpha(f7);
            if (i22 > 0) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            y10Var.setVisibility(i19);
            this.containerView.invalidate();
            this.H.invalidate();
        }
        if (i10 == 2) {
            float b11 = yf.e0.b(f7);
            float lerp3 = AndroidUtilities.lerp(0.9f, 1.0f, b11);
            e0 e0Var = this.f9996x;
            e0Var.f9971a.setAlpha(b11);
            e0Var.f9971a.setScaleX(lerp3);
            e0Var.f9971a.setScaleY(lerp3);
            org.telegram.ui.ActionBar.k kVar2 = e0Var.f9971a;
            int i23 = (b11 > 0.0f ? 1 : (b11 == 0.0f ? 0 : -1));
            if (i23 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            kVar2.setVisibility(i11);
            float lerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            v20 v20Var2 = this.E;
            v20Var2.setAlpha(f7);
            v20Var2.setScaleX(lerp4);
            v20Var2.setScaleY(lerp4);
            int i24 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i24 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            v20Var2.setVisibility(i12);
            e0Var.d.setAlpha(b11);
            p71 p71Var2 = e0Var.d;
            if (i23 > 0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            p71Var2.setVisibility(i13);
            if (!this.N) {
                this.f9993r.setAlpha(b11);
                this.f9993r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.f9993r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                ci.d dVar2 = this.f9993r;
                if (i23 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                dVar2.setVisibility(i14);
            }
            p71 p71Var3 = this.G;
            p71Var3.setAlpha(f7);
            if (i24 > 0) {
                i20 = 0;
            }
            p71Var3.setVisibility(i20);
            this.containerView.invalidate();
            this.I.invalidate();
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() > 0) {
            if (this.d.getCurrentPosition() == 2) {
                me.b bVar = this.f9989c;
                if (bVar.f16089f) {
                    this.f9996x.d.V2.h1(1, this.U.f11575b);
                    bVar.a(false, true);
                    setAllowNestedScroll(true);
                    v20 v20Var = this.E;
                    AndroidUtilities.hideKeyboard(v20Var.f31362r);
                    v20Var.f31362r.clearFocus();
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
        js jsVar = js.h;
        this.f9988b = new me.b(1, this, jsVar, 350L, false);
        this.f9989c = new me.b(2, this, jsVar, 350L, false);
        this.J = new yf.y(2);
        this.K = new yf.y(8);
        Paint paint = new Paint(1);
        this.P = paint;
        i0.b bVar = i0.b.f11573e;
        this.T = bVar;
        this.U = bVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.f9994s = m2Var;
        this.N = arrayList != null;
        this.Q = arrayList;
        this.O = q4Var;
        Context context = m2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = h6.f20504a7;
        paint.setColor(h6.w0(i10, this.resourcesProvider));
        fixNavigationBar(h6.w0(i10, this.resourcesProvider));
        this.containerView = new g9(this, context);
        h1 h1Var = new h1(this, context, 2);
        this.d = h1Var;
        int i11 = this.backgroundPaddingLeft;
        h1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.d, w5.e(-1, -1, 119));
        this.H = new bb(this, context, 3);
        this.I = new bb(this, context, 3);
        v20 v20Var = new v20(context, this.resourcesProvider);
        this.f9997y = v20Var;
        v20Var.setCloseButtonVisible(true);
        v20Var.f31365x = true;
        v20Var.e();
        String string = LocaleController.getString(R.string.Search);
        g2 g2Var = v20Var.f31362r;
        g2Var.setHint(string);
        g2Var.addTextChangedListener(new w(this));
        v20Var.setVisibility(8);
        v20 v20Var2 = new v20(context, this.resourcesProvider);
        this.E = v20Var2;
        v20Var2.setCloseButtonVisible(true);
        v20Var2.f31365x = true;
        v20Var2.e();
        String string2 = LocaleController.getString(R.string.Search);
        g2 g2Var2 = v20Var2.f31362r;
        g2Var2.setHint(string2);
        g2Var2.addTextChangedListener(new x(this));
        v20Var2.setVisibility(8);
        p71 p71Var = new p71(context, this.currentAccount, 0, false, new t(this, 0), new u(this, 0), null, this.resourcesProvider);
        this.G = p71Var;
        p71Var.j(new y(this));
        p71Var.setClipToPadding(false);
        p71Var.setVisibility(8);
        p71Var.p1();
        p71Var.W2.f26679r = false;
        p71Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        y10 y10Var = new y10(m2Var);
        this.F = y10Var;
        y10Var.setVisibility(8);
        y10Var.setBackground(null);
        y10Var.setChatPreviewDelegate(new Object());
        y10Var.setUiCallback(new a0(this));
        y10Var.f44248b.setClipToPadding(false);
        this.L = new View(getContext());
        Context context2 = getContext();
        c6 c6Var = this.resourcesProvider;
        t0 t0Var = new t0(context2, c6Var, new zc((FrameLayout) this.containerView, c6Var), this.currentAccount, j3);
        this.M = t0Var;
        t0Var.h = new b0(this, m2Var);
        this.f9990e = j3;
        this.f9991f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
        MessagesController.getInstance(this.currentAccount).getChatFull(j3);
        TLRPC.Chat chat = this.f9991f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        gg.p0 p0Var = new gg.p0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        p0Var.f10762f = this.f9991f;
        p0Var.h = false;
        ArrayList arrayList2 = v20Var.F;
        arrayList2.add(p0Var);
        v20Var.I = arrayList2.size() - 1;
        v20Var.f();
        setBackgroundColor(h6.w0(i10, this.resourcesProvider));
        this.f9995w = new j0(this, context);
        this.v = new f0(this, context);
        this.f9996x = new e0(this, context);
        this.d.setAdapter(new c0(this));
        v20Var.setCloseButtonOnClickListener(new v(this, 0));
        v20Var2.setCloseButtonOnClickListener(new v(this, 1));
        t0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j3, 0, true);
        sc.a((FrameLayout) this.containerView, new Object());
        ViewGroup viewGroup = this.containerView;
        u uVar = new u(this, 1);
        WeakHashMap weakHashMap = r0.i0.f46989a;
        r0.a0.i(viewGroup, uVar);
    }

    @Override
    public final void c() {
    }

    @Override
    public final void a(s2 s2Var) {
    }

    @Override
    public final void g(s2 s2Var) {
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
