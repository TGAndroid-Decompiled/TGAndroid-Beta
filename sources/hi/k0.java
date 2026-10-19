package hi;

import ai.ic;
import ai.o2;
import ai.v3;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.r7;
import ei.e2;
import ei.h1;
import ei.ka;
import gi.g4;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.u8;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.e10;
import org.telegram.ui.qn;
import org.telegram.ui.re1;
import w7.z5;
public final class k0 extends f3 implements NotificationCenter.NotificationCenterDelegate, ne.d, n2 {
    public static final int V = 0;
    public final k20 E;
    public final e10 F;
    public final b71 G;
    public final ic H;
    public final ic I;
    public final zf.y J;
    public final zf.y K;
    public final View L;
    public final s0 M;
    public final boolean N;
    public final Utilities.Callback O;
    public final Paint P;
    public ArrayList Q;
    public String R;
    public String S;
    public i0.b T;
    public i0.b U;
    public final ne.b f12168b;
    public final ne.b f12169c;
    public final h1 d;
    public final long e;
    public TLRPC.Chat f12170f;
    public boolean h;
    public ei.d f12171n;
    public ei.d f12172r;
    public final org.telegram.ui.ActionBar.n2 f12173s;
    public final f0 v;
    public final j0 f12174w;
    public final e0 f12175x;
    public final k20 f12176y;

    public k0(org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        this(n2Var, j10, null, null);
    }

    public static void A(k0 k0Var, g61 g61Var, View view) {
        long j10;
        TLRPC.Chat chat;
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var = k0Var.f12173s;
        if (!k0Var.U(g61Var)) {
            int i11 = g61Var.d;
            boolean z10 = false;
            if (i11 == 101) {
                k0Var.h = !k0Var.h;
                MessagesController.getInstance(k0Var.currentAccount).toggleCommunityCollapsedInDialogs(k0Var.e, k0Var.h);
                if (view instanceof u8) {
                    ((u8) view).getCheckBox().c(k0Var.h, true);
                } else {
                    k0Var.v.d.W2.N(false);
                }
            } else if (i11 == 100) {
                k0Var.d.D(1);
                k0Var.M.e();
            } else {
                Object obj = g61Var.G;
                if (obj instanceof TLRPC.Chat) {
                    chat = (TLRPC.Chat) obj;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j10 = -chat.f20273id;
                } else if (obj instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) obj).f20420id;
                    chat = null;
                } else {
                    return;
                }
                TLRPC.Chat chat2 = chat;
                int b10 = t0.b(k0Var.currentAccount, j10);
                if (b10 != 1 && b10 != 2) {
                    if (b10 == 3) {
                        a90 a90Var = new a90(k0Var.getContext(), chat2, null, k0Var.f12173s, k0Var.resourcesProvider);
                        a90Var.f24523n = new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                        a90Var.show();
                        return;
                    } else if (b10 == 4) {
                        xc xcVar = new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                        int i12 = R.raw.e_hand_2;
                        if (z10) {
                            i10 = R.string.CommunityHiddenChannelUnavailable;
                        } else {
                            i10 = R.string.CommunityHiddenGroupUnavailable;
                        }
                        org.telegram.messenger.g0.q(i10, xcVar, i12, 36);
                        return;
                    } else {
                        return;
                    }
                }
                if (n2Var instanceof qn) {
                    qn qnVar = (qn) n2Var;
                    TLRPC.Chat chat3 = qnVar.e;
                    TLRPC.User i13 = qnVar.i();
                    if ((chat3 != null && chat3.f20273id == (-j10)) || (i13 != null && i13.f20420id == j10)) {
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
                        qn qnVar2 = new qn(bundle);
                        og.d.a(qnVar2, MessagesStorage.TopicKey.of(j10, MessagesController.getInstance(k0Var.currentAccount).getForumLastTopicId(chat2.f20273id)));
                        n2Var.presentFragment(qnVar2);
                    } else {
                        n2Var.presentFragment(new re1(bundle));
                    }
                } else {
                    n2Var.presentFragment(new qn(bundle));
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
        arrayList.add(g61.D(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i10 = 0;
        arrayList.add(g61.D(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        g61 g61Var = new g61(39);
        g61Var.d = 101;
        g61Var.f26497l = string;
        g61Var.f26510z = 0;
        g61Var.K(k0Var.h);
        arrayList.add(g61Var);
        arrayList.add(g61.A(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        s0 s0Var = k0Var.M;
        boolean z11 = true;
        if (s0Var.f12228n && s0Var.f12226l == 1 && (arrayList2 = s0Var.f12224j) != null && arrayList2.size() == 1) {
            arrayList.add(g61.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            s0Var.c(arrayList);
            arrayList.add(g61.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = s0Var.f12226l;
            if (i11 > 0) {
                int i12 = s0Var.f12230p;
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
                int i14 = ii.h.f13173a;
                g61 J = g61.J(ii.h.class);
                J.d = 100;
                J.f26496k = i13;
                J.f26497l = formatPluralString;
                J.f26499n = str;
                J.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                J.f26502q = true;
                arrayList.add(J);
                arrayList.add(g61.D(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(k0Var.currentAccount).buildCommunityPeers(k0Var.e);
        if (buildCommunityPeers != null) {
            if (!buildCommunityPeers.chatsYouAreIn.isEmpty()) {
                arrayList.add(g61.s(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList3 = buildCommunityPeers.chatsYouAreIn;
                int size = arrayList3.size();
                int i15 = 0;
                while (i15 < size) {
                    MessagesController.CommunityPeerDialog communityPeerDialog = arrayList3.get(i15);
                    i15++;
                    arrayList.add(p0.a(communityPeerDialog, k0Var));
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (!buildCommunityPeers.chatsYouCanView.isEmpty()) {
                if (z10) {
                    arrayList.add(g61.D(22, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(g61.s(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList4 = buildCommunityPeers.chatsYouCanView;
                int size2 = arrayList4.size();
                int i16 = 0;
                while (i16 < size2) {
                    MessagesController.CommunityPeerDialog communityPeerDialog2 = arrayList4.get(i16);
                    i16++;
                    arrayList.add(p0.a(communityPeerDialog2, k0Var));
                }
                z10 = true;
            }
            if (!buildCommunityPeers.chatsYouCanJoin.isEmpty()) {
                if (z10) {
                    arrayList.add(g61.D(24, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(g61.s(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList5 = buildCommunityPeers.chatsYouCanJoin;
                int size3 = arrayList5.size();
                int i17 = 0;
                while (i17 < size3) {
                    MessagesController.CommunityPeerDialog communityPeerDialog3 = arrayList5.get(i17);
                    i17++;
                    arrayList.add(p0.a(communityPeerDialog3, k0Var));
                }
            } else {
                z11 = z10;
            }
            if (!buildCommunityPeers.chatsOther.isEmpty()) {
                if (z11) {
                    arrayList.add(g61.D(26, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(g61.s(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList6 = buildCommunityPeers.chatsOther;
                int size4 = arrayList6.size();
                while (i10 < size4) {
                    MessagesController.CommunityPeerDialog communityPeerDialog4 = arrayList6.get(i10);
                    i10++;
                    arrayList.add(p0.a(communityPeerDialog4, k0Var));
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
                t0.f(new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 2, z10);
                k0Var.d.D(0);
                return;
            }
            c1.t((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
            return;
        }
        t0.f(new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 1, z10);
        k0Var.d.D(0);
    }

    public static void o(k0 k0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        k0Var.f12171n.setLoading(false);
        if (tL_error != null) {
            c1.t((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        } else if (arrayList != null) {
            k0Var.Q = arrayList;
            if (arrayList.isEmpty()) {
                org.telegram.messenger.g0.q(R.string.CommunityNoChatsToAdd, new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), R.raw.info, 36);
                return;
            }
            k0Var.f12175x.d.W2.N(false);
            k0Var.d.D(2);
        }
    }

    public static void p(k0 k0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            c1.t((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        }
    }

    public static void q(k0 k0Var, b2 b2Var, long j10, boolean z10, long j11) {
        b2Var.dismiss();
        if (j11 == 0) {
            return;
        }
        k0Var.W(MessagesController.getInstance(k0Var.currentAccount).getChat(Long.valueOf(j11)), j10, z10);
    }

    public static void s(k0 k0Var, boolean z10, boolean z11, long j10) {
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
        b2 O = f5.O(context, d6Var, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), new v3(k0Var, j10, 11));
        O.show();
        TextView textView = (TextView) O.d(-1);
        if (textView != null) {
            textView.setTextColor(h6.x0(null, h6.f21225q7, false));
        }
    }

    public static void z(k0 k0Var) {
        if (!ChatObject.canAddChatToCommunity(k0Var.f12170f)) {
            k0Var.dismiss();
            return;
        }
        ei.d dVar = k0Var.f12171n;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(k0Var.currentAccount).fetchChatsToAddToCommunity(new s(k0Var, 2));
    }

    public final boolean U(g61 g61Var) {
        Object obj = g61Var.G;
        if (obj instanceof ii.e) {
            ii.e eVar = (ii.e) obj;
            long j10 = eVar.f13159a;
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            org.telegram.ui.ActionBar.n2 n2Var = this.f12173s;
            if (user != null) {
                n2Var.presentFragment(qn.W9(user.f20420id));
                return true;
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new ji.b(getContext(), chat, new t(0, this, eVar)).show();
                return true;
            } else {
                n2Var.presentFragment(qn.W9(-chat.f20273id));
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
            arrayList.add(g61.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(g61.D(0, AndroidUtilities.dp(56.0f)));
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
                        arrayList.add(g61.v(chat));
                    }
                } else {
                    arrayList.add(g61.v(chat));
                }
            }
        }
    }

    public final void W(TLRPC.Chat chat, long j10, boolean z10) {
        long j11 = -chat.f20273id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (!ChatObject.isChannel(chat)) {
            b2 b2Var = new b2(getContext(), 3, null);
            b2Var.r(250L);
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j11, null, new d(this, b2Var, j10, z10, 1));
            return;
        }
        MessagesController.getInstance(this.currentAccount).linkCommunity(j11, j10, z10, new ka(1, this, isChannelAndNotMegaGroup));
    }

    public final void X(g61 g61Var) {
        Object obj = g61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.N) {
                this.O.run(chat);
                dismiss();
                return;
            }
            new ji.a(getContext(), this.f12170f, -chat.f20273id, new o2(21, this, chat)).show();
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (!this.f12168b.f17384f && !this.f12169c.f17384f) {
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
            if (((TLRPC.ChatFull) objArr[0]).f20274id == j10) {
                f0Var.d.W2.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
                this.f12170f = chat;
                f0Var.f12153a.setTitle(DialogObject.getName(chat));
                f0Var.h.e(this.f12170f, f0Var.f12146n);
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
    public final void e(r2 r2Var) {
        TLRPC.TL_forumTopic findTopic;
        if (r2Var.getMessage() != null && (findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-r2Var.getDialogId(), MessageObject.getTopicId(this.currentAccount, r2Var.getMessage().messageOwner, true))) != null) {
            og.d.m(this.f12173s, -r2Var.getDialogId(), findTopic, 0);
        }
    }

    @Override
    public final void f(r2 r2Var) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().I(r2Var.getDialogId())) {
            org.telegram.ui.ActionBar.n2 n2Var = this.f12173s;
            n2Var.getOrCreateStoryViewer().getClass();
            n2Var.getOrCreateStoryViewer().D(n2Var.getContext(), r2Var.getDialogId(), r7.a((im0) r2Var.getParent()));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() > 0) {
            if (this.d.getCurrentPosition() == 2) {
                ne.b bVar = this.f12169c;
                if (bVar.f17384f) {
                    this.f12175x.d.V2.h1(1, this.U.f12284b);
                    bVar.a(false, true);
                    setAllowNestedScroll(true);
                    k20 k20Var = this.E;
                    AndroidUtilities.hideKeyboard(k20Var.f27686r);
                    k20Var.f27686r.clearFocus();
                    return;
                }
            }
            this.d.D(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
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
            f0Var.f12153a.setAlpha(b10);
            f0Var.f12153a.setScaleX(lerp);
            f0Var.f12153a.setScaleY(lerp);
            org.telegram.ui.ActionBar.k kVar = f0Var.f12153a;
            int i21 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            kVar.setVisibility(i15);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            k20 k20Var = this.f12176y;
            k20Var.setAlpha(f7);
            k20Var.setScaleX(lerp2);
            k20Var.setScaleY(lerp2);
            int i22 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i22 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            k20Var.setVisibility(i16);
            f0Var.d.setAlpha(b10);
            b71 b71Var = f0Var.d;
            if (i21 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            b71Var.setVisibility(i17);
            this.f12171n.setAlpha(b10);
            this.f12171n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.f12171n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            ei.d dVar = this.f12171n;
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            dVar.setVisibility(i18);
            e10 e10Var = this.F;
            e10Var.setAlpha(f7);
            if (i22 > 0) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            e10Var.setVisibility(i19);
            this.containerView.invalidate();
            this.H.invalidate();
        }
        if (i10 == 2) {
            float b11 = zf.f0.b(f7);
            float lerp3 = AndroidUtilities.lerp(0.9f, 1.0f, b11);
            e0 e0Var = this.f12175x;
            e0Var.f12153a.setAlpha(b11);
            e0Var.f12153a.setScaleX(lerp3);
            e0Var.f12153a.setScaleY(lerp3);
            org.telegram.ui.ActionBar.k kVar2 = e0Var.f12153a;
            int i23 = (b11 > 0.0f ? 1 : (b11 == 0.0f ? 0 : -1));
            if (i23 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            kVar2.setVisibility(i11);
            float lerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            k20 k20Var2 = this.E;
            k20Var2.setAlpha(f7);
            k20Var2.setScaleX(lerp4);
            k20Var2.setScaleY(lerp4);
            int i24 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i24 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            k20Var2.setVisibility(i12);
            e0Var.d.setAlpha(b11);
            b71 b71Var2 = e0Var.d;
            if (i23 > 0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            b71Var2.setVisibility(i13);
            if (!this.N) {
                this.f12172r.setAlpha(b11);
                this.f12172r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.f12172r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                ei.d dVar2 = this.f12172r;
                if (i23 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                dVar2.setVisibility(i14);
            }
            b71 b71Var3 = this.G;
            b71Var3.setAlpha(f7);
            if (i24 > 0) {
                i20 = 0;
            }
            b71Var3.setVisibility(i20);
            this.containerView.invalidate();
            this.I.invalidate();
        }
    }

    public k0(org.telegram.ui.ActionBar.n2 n2Var, long j10, ArrayList arrayList, g4 g4Var) {
        super(n2Var.getContext(), n2Var.getResourceProvider(), true, true);
        bs bsVar = bs.h;
        this.f12168b = new ne.b(1, this, bsVar, 350L, false);
        this.f12169c = new ne.b(2, this, bsVar, 350L, false);
        this.J = new zf.y(2);
        this.K = new zf.y(8);
        Paint paint = new Paint(1);
        this.P = paint;
        i0.b bVar = i0.b.e;
        this.T = bVar;
        this.U = bVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.f12173s = n2Var;
        this.N = arrayList != null;
        this.Q = arrayList;
        this.O = g4Var;
        Context context = n2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = h6.f20929a7;
        paint.setColor(h6.w0(i10, this.resourcesProvider));
        fixNavigationBar(h6.w0(i10, this.resourcesProvider));
        this.containerView = new ei.u8(this, context);
        h1 h1Var = new h1(this, context, 2);
        this.d = h1Var;
        int i11 = this.backgroundPaddingLeft;
        h1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.d, z5.e(-1, -1, 119));
        this.H = new ic(this, context, 5);
        this.I = new ic(this, context, 5);
        k20 k20Var = new k20(context, this.resourcesProvider);
        this.f12176y = k20Var;
        k20Var.setCloseButtonVisible(true);
        k20Var.f27689x = true;
        k20Var.d();
        String string = LocaleController.getString(R.string.Search);
        e2 e2Var = k20Var.f27686r;
        e2Var.setHint(string);
        e2Var.addTextChangedListener(new w(this));
        k20Var.setVisibility(8);
        k20 k20Var2 = new k20(context, this.resourcesProvider);
        this.E = k20Var2;
        k20Var2.setCloseButtonVisible(true);
        k20Var2.f27689x = true;
        k20Var2.d();
        String string2 = LocaleController.getString(R.string.Search);
        e2 e2Var2 = k20Var2.f27686r;
        e2Var2.setHint(string2);
        e2Var2.addTextChangedListener(new x(this));
        k20Var2.setVisibility(8);
        b71 b71Var = new b71(context, this.currentAccount, 0, false, new s(this, 0), new u(this, 0), null, this.resourcesProvider);
        this.G = b71Var;
        b71Var.j(new y(this));
        b71Var.setClipToPadding(false);
        b71Var.setVisibility(8);
        b71Var.p1();
        b71Var.W2.f30436r = false;
        b71Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        e10 e10Var = new e10(n2Var);
        this.F = e10Var;
        e10Var.setVisibility(8);
        e10Var.setBackground(null);
        e10Var.setChatPreviewDelegate(new Object());
        e10Var.setUiCallback(new a0(this));
        e10Var.f36487b.setClipToPadding(false);
        this.L = new View(getContext());
        Context context2 = getContext();
        d6 d6Var = this.resourcesProvider;
        s0 s0Var = new s0(context2, d6Var, new xc((FrameLayout) this.containerView, d6Var), this.currentAccount, j10);
        this.M = s0Var;
        s0Var.h = new b0(this, n2Var);
        this.e = j10;
        this.f12170f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        MessagesController.getInstance(this.currentAccount).getChatFull(j10);
        TLRPC.Chat chat = this.f12170f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        hg.o0 o0Var = new hg.o0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        o0Var.f12004f = this.f12170f;
        o0Var.h = false;
        ArrayList arrayList2 = k20Var.F;
        arrayList2.add(o0Var);
        k20Var.I = arrayList2.size() - 1;
        k20Var.f();
        setBackgroundColor(h6.w0(i10, this.resourcesProvider));
        this.f12174w = new j0(this, context);
        this.v = new f0(this, context);
        this.f12175x = new e0(this, context);
        this.d.setAdapter(new c0(this));
        k20Var.setCloseButtonOnClickListener(new v(this, 0));
        k20Var2.setCloseButtonOnClickListener(new v(this, 1));
        s0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j10, 0, true);
        qc.a((FrameLayout) this.containerView, new Object());
        ViewGroup viewGroup = this.containerView;
        u uVar = new u(this, 1);
        WeakHashMap weakHashMap = r0.i0.f44818a;
        r0.a0.i(viewGroup, uVar);
    }

    @Override
    public final void a(r2 r2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void g(r2 r2Var) {
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
