package gi;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.g9;
import bi.v2;
import di.ab;
import di.f9;
import di.g2;
import di.h1;
import di.ya;
import fi.q3;
import fi.r4;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.b20;
import org.telegram.ui.fo;
import org.telegram.ui.kg1;
import w7.z5;
public final class k0 extends e3 implements NotificationCenter.NotificationCenterDelegate, ne.d, o2 {
    public static final int V = 0;
    public final o20 E;
    public final b20 F;
    public final i71 G;
    public final ab H;
    public final ab I;
    public final zf.z J;
    public final zf.z K;
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
    public final ne.b f10204b;
    public final ne.b f10205c;
    public final h1 d;
    public final long e;
    public TLRPC.Chat f10206f;
    public boolean h;
    public di.d f10207n;
    public di.d f10208r;
    public final m2 f10209s;
    public final f0 v;
    public final j0 f10210w;
    public final e0 f10211x;
    public final o20 f10212y;

    public k0(m2 m2Var, long j10) {
        this(m2Var, j10, null, null);
    }

    public static void B(k0 k0Var, m61 m61Var, View view) {
        long j10;
        TLRPC.Chat chat;
        int i10;
        m2 m2Var = k0Var.f10209s;
        if (!k0Var.U(m61Var)) {
            int i11 = m61Var.d;
            boolean z10 = false;
            if (i11 == 101) {
                k0Var.h = !k0Var.h;
                MessagesController.getInstance(k0Var.currentAccount).toggleCommunityCollapsedInDialogs(k0Var.e, k0Var.h);
                if (view instanceof v8) {
                    ((v8) view).getCheckBox().c(k0Var.h, true);
                } else {
                    k0Var.v.d.W2.N(false);
                }
            } else if (i11 == 100) {
                k0Var.d.D(1);
                k0Var.M.e();
            } else {
                Object obj = m61Var.G;
                if (obj instanceof TLRPC.Chat) {
                    chat = (TLRPC.Chat) obj;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j10 = -chat.f18916id;
                } else if (obj instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) obj).f19063id;
                    chat = null;
                } else {
                    return;
                }
                TLRPC.Chat chat2 = chat;
                int b10 = u0.b(k0Var.currentAccount, j10);
                if (b10 != 1 && b10 != 2) {
                    if (b10 == 3) {
                        f90 f90Var = new f90(k0Var.getContext(), chat2, null, k0Var.f10209s, k0Var.resourcesProvider);
                        f90Var.f24664n = new zc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                        f90Var.show();
                        return;
                    } else if (b10 == 4) {
                        zc zcVar = new zc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                        int i12 = R.raw.e_hand_2;
                        if (z10) {
                            i10 = R.string.CommunityHiddenChannelUnavailable;
                        } else {
                            i10 = R.string.CommunityHiddenGroupUnavailable;
                        }
                        org.telegram.messenger.g0.q(i10, zcVar, i12, 36);
                        return;
                    } else {
                        return;
                    }
                }
                if (m2Var instanceof fo) {
                    fo foVar = (fo) m2Var;
                    TLRPC.Chat chat3 = foVar.e;
                    TLRPC.User i13 = foVar.i();
                    if ((chat3 != null && chat3.f18916id == (-j10)) || (i13 != null && i13.f19063id == j10)) {
                        k0Var.dismiss();
                        return;
                    }
                }
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                if (ChatObject.isForum(chat2)) {
                    if (ChatObject.areTabsEnabled(chat2)) {
                        fo foVar2 = new fo(bundle);
                        og.d.a(foVar2, MessagesStorage.TopicKey.of(j10, MessagesController.getInstance(k0Var.currentAccount).getForumLastTopicId(chat2.f18916id)));
                        m2Var.presentFragment(foVar2);
                    } else {
                        m2Var.presentFragment(new kg1(bundle));
                    }
                } else {
                    m2Var.presentFragment(new fo(bundle));
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
        arrayList.add(m61.D(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i10 = 0;
        arrayList.add(m61.D(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        m61 m61Var = new m61(39);
        m61Var.d = 101;
        m61Var.f26946l = string;
        m61Var.f26959z = 0;
        m61Var.K(k0Var.h);
        arrayList.add(m61Var);
        arrayList.add(m61.A(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        t0 t0Var = k0Var.M;
        boolean z11 = true;
        if (t0Var.f10268n && t0Var.f10266l == 1 && (arrayList2 = t0Var.f10264j) != null && arrayList2.size() == 1) {
            arrayList.add(m61.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            t0Var.c(arrayList);
            arrayList.add(m61.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = t0Var.f10266l;
            if (i11 > 0) {
                int i12 = t0Var.f10270p;
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
                int i14 = hi.i.f10846a;
                m61 J = m61.J(hi.i.class);
                J.d = 100;
                J.f26945k = i13;
                J.f26946l = formatPluralString;
                J.f26948n = str;
                J.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                J.f26951q = true;
                arrayList.add(J);
                arrayList.add(m61.D(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(k0Var.currentAccount).buildCommunityPeers(k0Var.e);
        if (buildCommunityPeers != null) {
            if (!buildCommunityPeers.chatsYouAreIn.isEmpty()) {
                arrayList.add(m61.s(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
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
                    arrayList.add(m61.D(22, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(m61.s(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
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
                    arrayList.add(m61.D(24, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(m61.s(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
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
                    arrayList.add(m61.D(26, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(m61.s(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
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

    public static ViewGroup N(k0 k0Var) {
        return k0Var.containerView;
    }

    public static void n(k0 k0Var, boolean z10, TLRPC.TL_error tL_error) {
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

    public static void o(k0 k0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        k0Var.f10207n.setLoading(false);
        if (tL_error != null) {
            c1.p((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        } else if (arrayList != null) {
            k0Var.Q = arrayList;
            if (arrayList.isEmpty()) {
                org.telegram.messenger.g0.q(R.string.CommunityNoChatsToAdd, new zc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), R.raw.info, 36);
                return;
            }
            k0Var.f10211x.d.W2.N(false);
            k0Var.d.D(2);
        }
    }

    public static void q(k0 k0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            c1.p((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        }
    }

    public static void r(k0 k0Var, a2 a2Var, long j10, boolean z10, long j11) {
        a2Var.dismiss();
        if (j11 == 0) {
            return;
        }
        k0Var.W(MessagesController.getInstance(k0Var.currentAccount).getChat(Long.valueOf(j11)), j10, z10);
    }

    public static void s(k0 k0Var, boolean z10, boolean z11, long j10) {
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
        a2 O = g5.O(context, c6Var, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), new bi.g(k0Var, j10, 8));
        O.show();
        TextView textView = (TextView) O.d(-1);
        if (textView != null) {
            textView.setTextColor(g6.x0(null, g6.f19839q7, false));
        }
    }

    public static void z(k0 k0Var) {
        if (!ChatObject.canAddChatToCommunity(k0Var.f10206f)) {
            k0Var.dismiss();
            return;
        }
        di.d dVar = k0Var.f10207n;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(k0Var.currentAccount).fetchChatsToAddToCommunity(new t(k0Var, 2));
    }

    public final boolean U(m61 m61Var) {
        Object obj = m61Var.G;
        if (obj instanceof hi.f) {
            hi.f fVar = (hi.f) obj;
            long j10 = fVar.f10832a;
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            m2 m2Var = this.f10209s;
            if (user != null) {
                m2Var.presentFragment(fo.W9(user.f19063id));
                return true;
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new ii.c(getContext(), chat, new q3(4, this, fVar)).show();
                return true;
            } else {
                m2Var.presentFragment(fo.W9(-chat.f18916id));
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
            arrayList.add(m61.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(m61.D(0, AndroidUtilities.dp(56.0f)));
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
                        arrayList.add(m61.v(chat));
                    }
                } else {
                    arrayList.add(m61.v(chat));
                }
            }
        }
    }

    public final void W(TLRPC.Chat chat, long j10, boolean z10) {
        long j11 = -chat.f18916id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (!ChatObject.isChannel(chat)) {
            a2 a2Var = new a2(getContext(), 3, null);
            a2Var.q(250L);
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j11, null, new d(this, a2Var, j10, z10, 1));
            return;
        }
        MessagesController.getInstance(this.currentAccount).linkCommunity(j11, j10, z10, new ya(1, this, isChannelAndNotMegaGroup));
    }

    public final void X(m61 m61Var) {
        Object obj = m61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.N) {
                this.O.run(chat);
                dismiss();
                return;
            }
            new ii.b(getContext(), this.f10206f, -chat.f18916id, new v2(15, this, chat)).show();
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (!this.f10204b.f16004f && !this.f10205c.f16004f) {
            View currentView = this.d.getCurrentView();
            if (currentView instanceof h0) {
                return ((h0) currentView).e;
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.e;
        f0 f0Var = this.v;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).f18917id == j10) {
                f0Var.d.W2.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
                this.f10206f = chat;
                f0Var.f10189a.setTitle(DialogObject.getName(chat));
                f0Var.h.e(this.f10206f, f0Var.f10182n);
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
    public final void e(s2 s2Var) {
        TLRPC.TL_forumTopic findTopic;
        if (s2Var.getMessage() != null && (findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-s2Var.getDialogId(), MessageObject.getTopicId(this.currentAccount, s2Var.getMessage().messageOwner, true))) != null) {
            og.d.m(this.f10209s, -s2Var.getDialogId(), findTopic, 0);
        }
    }

    @Override
    public final void f(s2 s2Var) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().I(s2Var.getDialogId())) {
            m2 m2Var = this.f10209s;
            m2Var.getOrCreateStoryViewer().getClass();
            m2Var.getOrCreateStoryViewer().D(m2Var.getContext(), s2Var.getDialogId(), g9.a((mm0) s2Var.getParent()));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() > 0) {
            if (this.d.getCurrentPosition() == 2) {
                ne.b bVar = this.f10205c;
                if (bVar.f16004f) {
                    this.f10211x.d.V2.h1(1, this.U.f10893b);
                    bVar.a(false, true);
                    setAllowNestedScroll(true);
                    o20 o20Var = this.E;
                    AndroidUtilities.hideKeyboard(o20Var.f27510r);
                    o20Var.f27510r.clearFocus();
                    return;
                }
            }
            this.d.D(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
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
            float b10 = zf.f0.b(f7);
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
            f0 f0Var = this.v;
            f0Var.f10189a.setAlpha(b10);
            f0Var.f10189a.setScaleX(lerp);
            f0Var.f10189a.setScaleY(lerp);
            org.telegram.ui.ActionBar.k kVar = f0Var.f10189a;
            int i21 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            kVar.setVisibility(i15);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            o20 o20Var = this.f10212y;
            o20Var.setAlpha(f7);
            o20Var.setScaleX(lerp2);
            o20Var.setScaleY(lerp2);
            int i22 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i22 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            o20Var.setVisibility(i16);
            f0Var.d.setAlpha(b10);
            i71 i71Var = f0Var.d;
            if (i21 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            i71Var.setVisibility(i17);
            this.f10207n.setAlpha(b10);
            this.f10207n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.f10207n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            di.d dVar = this.f10207n;
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            dVar.setVisibility(i18);
            b20 b20Var = this.F;
            b20Var.setAlpha(f7);
            if (i22 > 0) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            b20Var.setVisibility(i19);
            this.containerView.invalidate();
            this.H.invalidate();
        }
        if (i10 == 2) {
            float b11 = zf.f0.b(f7);
            float lerp3 = AndroidUtilities.lerp(0.9f, 1.0f, b11);
            e0 e0Var = this.f10211x;
            e0Var.f10189a.setAlpha(b11);
            e0Var.f10189a.setScaleX(lerp3);
            e0Var.f10189a.setScaleY(lerp3);
            org.telegram.ui.ActionBar.k kVar2 = e0Var.f10189a;
            int i23 = (b11 > 0.0f ? 1 : (b11 == 0.0f ? 0 : -1));
            if (i23 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            kVar2.setVisibility(i11);
            float lerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            o20 o20Var2 = this.E;
            o20Var2.setAlpha(f7);
            o20Var2.setScaleX(lerp4);
            o20Var2.setScaleY(lerp4);
            int i24 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i24 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            o20Var2.setVisibility(i12);
            e0Var.d.setAlpha(b11);
            i71 i71Var2 = e0Var.d;
            if (i23 > 0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            i71Var2.setVisibility(i13);
            if (!this.N) {
                this.f10208r.setAlpha(b11);
                this.f10208r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.f10208r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                di.d dVar2 = this.f10208r;
                if (i23 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                dVar2.setVisibility(i14);
            }
            i71 i71Var3 = this.G;
            i71Var3.setAlpha(f7);
            if (i24 > 0) {
                i20 = 0;
            }
            i71Var3.setVisibility(i20);
            this.containerView.invalidate();
            this.I.invalidate();
        }
    }

    public k0(m2 m2Var, long j10, ArrayList arrayList, r4 r4Var) {
        super(m2Var.getContext(), m2Var.getResourceProvider(), true, true);
        es esVar = es.h;
        this.f10204b = new ne.b(1, this, esVar, 350L, false);
        this.f10205c = new ne.b(2, this, esVar, 350L, false);
        this.J = new zf.z(2);
        this.K = new zf.z(8);
        Paint paint = new Paint(1);
        this.P = paint;
        i0.b bVar = i0.b.e;
        this.T = bVar;
        this.U = bVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.f10209s = m2Var;
        this.N = arrayList != null;
        this.Q = arrayList;
        this.O = r4Var;
        Context context = m2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = g6.f19543a7;
        paint.setColor(g6.w0(i10, this.resourcesProvider));
        fixNavigationBar(g6.w0(i10, this.resourcesProvider));
        this.containerView = new f9(this, context);
        h1 h1Var = new h1(this, context, 2);
        this.d = h1Var;
        int i11 = this.backgroundPaddingLeft;
        h1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.d, z5.e(-1, -1, 119));
        this.H = new ab(this, context, 3);
        this.I = new ab(this, context, 3);
        o20 o20Var = new o20(context, this.resourcesProvider);
        this.f10212y = o20Var;
        o20Var.setCloseButtonVisible(true);
        o20Var.f27513x = true;
        o20Var.d();
        String string = LocaleController.getString(R.string.Search);
        g2 g2Var = o20Var.f27510r;
        g2Var.setHint(string);
        g2Var.addTextChangedListener(new w(this));
        o20Var.setVisibility(8);
        o20 o20Var2 = new o20(context, this.resourcesProvider);
        this.E = o20Var2;
        o20Var2.setCloseButtonVisible(true);
        o20Var2.f27513x = true;
        o20Var2.d();
        String string2 = LocaleController.getString(R.string.Search);
        g2 g2Var2 = o20Var2.f27510r;
        g2Var2.setHint(string2);
        g2Var2.addTextChangedListener(new x(this));
        o20Var2.setVisibility(8);
        i71 i71Var = new i71(context, this.currentAccount, 0, false, new t(this, 0), new u(this, 0), null, this.resourcesProvider);
        this.G = i71Var;
        i71Var.j(new y(this));
        i71Var.setClipToPadding(false);
        i71Var.setVisibility(8);
        i71Var.p1();
        i71Var.W2.f23145r = false;
        i71Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        b20 b20Var = new b20(m2Var);
        this.F = b20Var;
        b20Var.setVisibility(8);
        b20Var.setBackground(null);
        b20Var.setChatPreviewDelegate(new Object());
        b20Var.setUiCallback(new a0(this));
        b20Var.f34163b.setClipToPadding(false);
        this.L = new View(getContext());
        Context context2 = getContext();
        c6 c6Var = this.resourcesProvider;
        t0 t0Var = new t0(context2, c6Var, new zc((FrameLayout) this.containerView, c6Var), this.currentAccount, j10);
        this.M = t0Var;
        t0Var.h = new b0(this, m2Var);
        this.e = j10;
        this.f10206f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        MessagesController.getInstance(this.currentAccount).getChatFull(j10);
        TLRPC.Chat chat = this.f10206f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        hg.p0 p0Var = new hg.p0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        p0Var.f10706f = this.f10206f;
        p0Var.h = false;
        ArrayList arrayList2 = o20Var.F;
        arrayList2.add(p0Var);
        o20Var.I = arrayList2.size() - 1;
        o20Var.f();
        setBackgroundColor(g6.w0(i10, this.resourcesProvider));
        this.f10210w = new j0(this, context);
        this.v = new f0(this, context);
        this.f10211x = new e0(this, context);
        this.d.setAdapter(new c0(this));
        o20Var.setCloseButtonOnClickListener(new v(this, 0));
        o20Var2.setCloseButtonOnClickListener(new v(this, 1));
        t0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j10, 0, true);
        sc.a((FrameLayout) this.containerView, new Object());
        ViewGroup viewGroup = this.containerView;
        u uVar = new u(this, 1);
        WeakHashMap weakHashMap = r0.i0.f43485a;
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
