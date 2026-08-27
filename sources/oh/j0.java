package oh;

import ag.s0;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import gh.d1;
import gh.q2;
import h7.z5;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jh.b7;
import lh.h1;
import lh.ia;
import lh.k7;
import lh.t8;
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
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.i10;
import org.telegram.ui.rn;
import org.telegram.ui.we1;

public final class j0 extends e3 implements NotificationCenter.NotificationCenterDelegate, ud.b, l2 {
    public static final int R = 0;
    public final p10 A;
    public final i10 B;
    public final k51 C;
    public final s0 D;
    public final s0 E;
    public final gf.c0 F;
    public final gf.c0 G;
    public final View H;
    public final q0 I;
    public final boolean J;
    public final Utilities.Callback K;
    public final Paint L;
    public ArrayList M;
    public String N;
    public String O;
    public i0.c P;
    public i0.c Q;

    public final ud.a f19498b;

    public final ud.a f19499c;
    public final h1 d;

    public final long f19500e;

    public TLRPC.Chat f19501f;
    public boolean h;

    public lh.d f19502n;

    public lh.d f19503r;

    public final n2 f19504s;
    public final e0 v;

    public final i0 f19505w;

    public final d0 f19506x;

    public final p10 f19507y;

    public j0(n2 n2Var, long j10) {
        this(n2Var, j10, null, null);
    }

    public static void B(j0 j0Var, ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2;
        arrayList.add(n41.D(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i10 = 0;
        arrayList.add(n41.D(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        n41 n41Var = new n41(39);
        n41Var.d = 101;
        n41Var.f30844l = string;
        n41Var.f30857z = 0;
        n41Var.K(j0Var.h);
        arrayList.add(n41Var);
        arrayList.add(n41.A(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        q0 q0Var = j0Var.I;
        boolean z11 = true;
        if (q0Var.f19558n && q0Var.f19556l == 1 && (arrayList2 = q0Var.f19554j) != null && arrayList2.size() == 1) {
            arrayList.add(n41.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            q0Var.c(arrayList);
            arrayList.add(n41.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = q0Var.f19556l;
            if (i11 > 0) {
                int i12 = q0Var.f19560p;
                int i13 = R.drawable.filled_requests_24;
                String string2 = i11 == i12 ? LocaleController.getString(R.string.CommunityPendingRequests) : LocaleController.formatPluralString("CommunityPendingRequestsRow", i11, new Object[0]);
                String string3 = i12 > 0 ? Integer.toString(i12) : null;
                int i14 = ph.h.f46050a;
                n41 n41VarJ = n41.J(ph.h.class);
                n41VarJ.d = 100;
                n41VarJ.f30843k = i13;
                n41VarJ.f30844l = string2;
                n41VarJ.f30846n = string3;
                n41VarJ.B = (((long) (-15497247)) << 32) | (((long) (-14899731)) & 4294967295L);
                n41VarJ.f30849q = true;
                arrayList.add(n41VarJ);
                arrayList.add(n41.D(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog communityPeersDialogBuildCommunityPeers = MessagesController.getInstance(j0Var.currentAccount).buildCommunityPeers(j0Var.f19500e);
        if (communityPeersDialogBuildCommunityPeers == null) {
            return;
        }
        if (communityPeersDialogBuildCommunityPeers.chatsYouAreIn.isEmpty()) {
            z10 = false;
        } else {
            arrayList.add(n41.s(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList3 = communityPeersDialogBuildCommunityPeers.chatsYouAreIn;
            int size = arrayList3.size();
            int i15 = 0;
            while (i15 < size) {
                MessagesController.CommunityPeerDialog communityPeerDialog = arrayList3.get(i15);
                i15++;
                arrayList.add(n0.a(communityPeerDialog, j0Var));
            }
            z10 = true;
        }
        if (!communityPeersDialogBuildCommunityPeers.chatsYouCanView.isEmpty()) {
            if (z10) {
                arrayList.add(n41.D(22, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(n41.s(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList4 = communityPeersDialogBuildCommunityPeers.chatsYouCanView;
            int size2 = arrayList4.size();
            int i16 = 0;
            while (i16 < size2) {
                MessagesController.CommunityPeerDialog communityPeerDialog2 = arrayList4.get(i16);
                i16++;
                arrayList.add(n0.a(communityPeerDialog2, j0Var));
            }
            z10 = true;
        }
        if (communityPeersDialogBuildCommunityPeers.chatsYouCanJoin.isEmpty()) {
            z11 = z10;
        } else {
            if (z10) {
                arrayList.add(n41.D(24, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(n41.s(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList5 = communityPeersDialogBuildCommunityPeers.chatsYouCanJoin;
            int size3 = arrayList5.size();
            int i17 = 0;
            while (i17 < size3) {
                MessagesController.CommunityPeerDialog communityPeerDialog3 = arrayList5.get(i17);
                i17++;
                arrayList.add(n0.a(communityPeerDialog3, j0Var));
            }
        }
        if (communityPeersDialogBuildCommunityPeers.chatsOther.isEmpty()) {
            return;
        }
        if (z11) {
            arrayList.add(n41.D(26, AndroidUtilities.dp(12.0f)));
        }
        arrayList.add(n41.s(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
        ArrayList<MessagesController.CommunityPeerDialog> arrayList6 = communityPeersDialogBuildCommunityPeers.chatsOther;
        int size4 = arrayList6.size();
        while (i10 < size4) {
            MessagesController.CommunityPeerDialog communityPeerDialog4 = arrayList6.get(i10);
            i10++;
            arrayList.add(n0.a(communityPeerDialog4, j0Var));
        }
    }

    public static void m(j0 j0Var, boolean z10, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            r0.f(new mc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider), 1, z10);
            j0Var.d.D(0);
        } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
            pa.t((FrameLayout) j0Var.containerView, j0Var.resourcesProvider, tL_error, false);
        } else {
            r0.f(new mc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider), 2, z10);
            j0Var.d.D(0);
        }
    }

    public static void n(j0 j0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        j0Var.f19502n.setLoading(false);
        if (tL_error != null) {
            pa.t((FrameLayout) j0Var.containerView, j0Var.resourcesProvider, tL_error, false);
            return;
        }
        if (arrayList != null) {
            j0Var.M = arrayList;
            if (!arrayList.isEmpty()) {
                j0Var.f19506x.d.U2.N(false);
                j0Var.d.D(2);
            } else {
                y1.q(R.string.CommunityNoChatsToAdd, new mc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider), R.raw.info, 36);
            }
        }
    }

    public static void p(j0 j0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            pa.t((FrameLayout) j0Var.containerView, j0Var.resourcesProvider, tL_error, false);
        }
    }

    public static void q(j0 j0Var, b2 b2Var, long j10, boolean z10, long j11) {
        b2Var.dismiss();
        if (j11 == 0) {
            return;
        }
        j0Var.V(MessagesController.getInstance(j0Var.currentAccount).getChat(Long.valueOf(j11)), j10, z10);
    }

    public static void r(j0 j0Var, boolean z10, boolean z11, long j10) {
        int i10;
        Context context = j0Var.getContext();
        c6 c6Var = j0Var.resourcesProvider;
        String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
        if (z10) {
            i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
        } else {
            i10 = z11 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
        }
        b2 b2VarP = y4.P(context, c6Var, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), new cg.b2(j0Var, j10, 12));
        b2VarP.show();
        TextView textView = (TextView) b2VarP.d(-1);
        if (textView != null) {
            textView.setTextColor(g6.w0(null, g6.f23284q7, false));
        }
    }

    public static void y(j0 j0Var) {
        if (!ChatObject.canAddChatToCommunity(j0Var.f19501f)) {
            j0Var.dismiss();
            return;
        }
        lh.d dVar = j0Var.f19502n;
        if (dVar.J) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(j0Var.currentAccount).fetchChatsToAddToCommunity(new s(j0Var, 2));
    }

    public static void z(j0 j0Var, n41 n41Var, View view) {
        long j10;
        TLRPC.Chat chat;
        n2 n2Var = j0Var.f19504s;
        if (j0Var.T(n41Var)) {
            return;
        }
        int i10 = n41Var.d;
        boolean zIsChannelAndNotMegaGroup = false;
        if (i10 == 101) {
            j0Var.h = !j0Var.h;
            MessagesController.getInstance(j0Var.currentAccount).toggleCommunityCollapsedInDialogs(j0Var.f19500e, j0Var.h);
            if (view instanceof o8) {
                ((o8) view).getCheckBox().c(j0Var.h, true);
                return;
            } else {
                j0Var.v.d.U2.N(false);
                return;
            }
        }
        if (i10 == 100) {
            j0Var.d.D(1);
            j0Var.I.e();
            return;
        }
        Object obj = n41Var.G;
        if (obj instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) obj;
            zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            j10 = -chat.f22380id;
        } else {
            if (!(obj instanceof TLRPC.User)) {
                return;
            }
            j10 = ((TLRPC.User) obj).f22527id;
            chat = null;
        }
        TLRPC.Chat chat2 = chat;
        int iB = r0.b(j0Var.currentAccount, j10);
        if (iB != 1 && iB != 2) {
            if (iB == 3) {
                t70 t70Var = new t70(j0Var.getContext(), chat2, null, j0Var.f19504s, j0Var.resourcesProvider);
                t70Var.f32680n = new mc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider);
                t70Var.show();
                return;
            } else {
                if (iB == 4) {
                    y1.q(zIsChannelAndNotMegaGroup ? R.string.CommunityHiddenChannelUnavailable : R.string.CommunityHiddenGroupUnavailable, new mc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider), R.raw.e_hand_2, 36);
                    return;
                }
                return;
            }
        }
        if (n2Var instanceof rn) {
            rn rnVar = (rn) n2Var;
            TLRPC.Chat chat3 = rnVar.f42026e;
            TLRPC.User userI = rnVar.i();
            if ((chat3 != null && chat3.f22380id == (-j10)) || (userI != null && userI.f22527id == j10)) {
                j0Var.dismiss();
                return;
            }
        }
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        if (!ChatObject.isForum(chat2)) {
            n2Var.presentFragment(new rn(bundle));
        } else if (ChatObject.areTabsEnabled(chat2)) {
            rn rnVar2 = new rn(bundle);
            wf.c.a(rnVar2, MessagesStorage.TopicKey.of(j10, MessagesController.getInstance(j0Var.currentAccount).getForumLastTopicId(chat2.f22380id)));
            n2Var.presentFragment(rnVar2);
        } else {
            n2Var.presentFragment(new we1(bundle));
        }
        j0Var.dismiss();
    }

    public final boolean T(n41 n41Var) {
        Object obj = n41Var.G;
        if (!(obj instanceof ph.e)) {
            return false;
        }
        ph.e eVar = (ph.e) obj;
        long j10 = eVar.f46035a;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        n2 n2Var = this.f19504s;
        if (user != null) {
            n2Var.presentFragment(rn.R9(user.f22527id));
            return true;
        }
        if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
            n2Var.presentFragment(rn.R9(-chat.f22380id));
            return true;
        }
        new qh.b(getContext(), chat, new k7(18, this, eVar)).show();
        return true;
    }

    public final void U(ArrayList arrayList, boolean z10) {
        String str;
        int i10 = 0;
        if (!z10) {
            arrayList.add(n41.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(n41.D(0, AndroidUtilities.dp(56.0f)));
        }
        if (this.M != null) {
            String lowerCase = (!z10 || (str = this.O) == null) ? null : str.toLowerCase();
            ArrayList arrayList2 = this.M;
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (!z10 || TextUtils.isEmpty(lowerCase)) {
                    arrayList.add(n41.v(chat));
                } else {
                    String str2 = chat.title;
                    if (str2 != null && str2.toLowerCase().contains(lowerCase)) {
                        arrayList.add(n41.v(chat));
                    }
                }
            }
        }
    }

    public final void V(TLRPC.Chat chat, long j10, boolean z10) {
        long j11 = -chat.f22380id;
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (ChatObject.isChannel(chat)) {
            MessagesController.getInstance(this.currentAccount).linkCommunity(j11, j10, z10, new ia(zIsChannelAndNotMegaGroup, this, 1));
            return;
        }
        b2 b2Var = new b2(getContext(), 3, null);
        b2Var.q(250L);
        MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j11, null, new d(this, b2Var, j10, z10, 1));
    }

    public final void W(n41 n41Var) {
        Object obj = n41Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (!this.J) {
                new qh.a(getContext(), this.f19501f, -chat.f22380id, new d1(23, this, chat)).show();
            } else {
                this.K.run(chat);
                dismiss();
            }
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f19498b.f48498f || this.f19499c.f48498f) {
            return false;
        }
        View currentView = this.d.getCurrentView();
        if (currentView instanceof g0) {
            return ((g0) currentView).f19489e;
        }
        return true;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void d(p2 p2Var) {
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        if (p2Var.getMessage() == null || (tL_forumTopicFindTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-p2Var.getDialogId(), MessageObject.getTopicId(this.currentAccount, p2Var.getMessage().messageOwner, true))) == null) {
            return;
        }
        wf.c.m(this.f19504s, -p2Var.getDialogId(), tL_forumTopicFindTopic, 0);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.f19500e;
        e0 e0Var = this.v;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).f22381id == j10) {
                e0Var.d.U2.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) == 0) {
                return;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
            this.f19501f = chat;
            e0Var.f19486a.setTitle(DialogObject.getName(chat));
            e0Var.h.e(this.f19501f, e0Var.f19475n);
        }
    }

    @Override
    public final void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        super.dismissInternal();
    }

    @Override
    public final void e(p2 p2Var) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().I(p2Var.getDialogId())) {
            n2 n2Var = this.f19504s;
            n2Var.getOrCreateStoryViewer().getClass();
            n2Var.getOrCreateStoryViewer().D(n2Var.getContext(), p2Var.getDialogId(), b7.a((zk0) p2Var.getParent()));
        }
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 == 1) {
            float fB = gf.m0.b(f10);
            float fLerp = AndroidUtilities.lerp(0.9f, 1.0f, fB);
            e0 e0Var = this.v;
            e0Var.f19486a.setAlpha(fB);
            e0Var.f19486a.setScaleX(fLerp);
            e0Var.f19486a.setScaleY(fLerp);
            e0Var.f19486a.setVisibility(fB > 0.0f ? 0 : 8);
            float fLerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f10);
            p10 p10Var = this.f19507y;
            p10Var.setAlpha(f10);
            p10Var.setScaleX(fLerp2);
            p10Var.setScaleY(fLerp2);
            p10Var.setVisibility(f10 > 0.0f ? 0 : 8);
            e0Var.d.setAlpha(fB);
            e0Var.d.setVisibility(fB > 0.0f ? 0 : 8);
            this.f19502n.setAlpha(fB);
            this.f19502n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, fB));
            this.f19502n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, fB));
            this.f19502n.setVisibility(fB > 0.0f ? 0 : 8);
            i10 i10Var = this.B;
            i10Var.setAlpha(f10);
            i10Var.setVisibility(f10 > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.D.invalidate();
        }
        if (i10 == 2) {
            float fB2 = gf.m0.b(f10);
            float fLerp3 = AndroidUtilities.lerp(0.9f, 1.0f, fB2);
            d0 d0Var = this.f19506x;
            d0Var.f19486a.setAlpha(fB2);
            d0Var.f19486a.setScaleX(fLerp3);
            d0Var.f19486a.setScaleY(fLerp3);
            d0Var.f19486a.setVisibility(fB2 > 0.0f ? 0 : 8);
            float fLerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f10);
            p10 p10Var2 = this.A;
            p10Var2.setAlpha(f10);
            p10Var2.setScaleX(fLerp4);
            p10Var2.setScaleY(fLerp4);
            p10Var2.setVisibility(f10 > 0.0f ? 0 : 8);
            d0Var.d.setAlpha(fB2);
            d0Var.d.setVisibility(fB2 > 0.0f ? 0 : 8);
            if (!this.J) {
                this.f19503r.setAlpha(fB2);
                this.f19503r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, fB2));
                this.f19503r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, fB2));
                this.f19503r.setVisibility(fB2 > 0.0f ? 0 : 8);
            }
            k51 k51Var = this.C;
            k51Var.setAlpha(f10);
            k51Var.setVisibility(f10 > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.E.invalidate();
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        if (this.d.getCurrentPosition() == 2) {
            ud.a aVar = this.f19499c;
            if (aVar.f48498f) {
                this.f19506x.d.T2.h1(1, this.Q.f10490b);
                aVar.a(false, true);
                setAllowNestedScroll(true);
                p10 p10Var = this.A;
                AndroidUtilities.hideKeyboard(p10Var.f31468r);
                p10Var.f31468r.clearFocus();
                return;
            }
        }
        this.d.D(0);
    }

    public j0(n2 n2Var, long j10, ArrayList arrayList, q2 q2Var) {
        super(n2Var.getContext(), n2Var.getResourceProvider(), true, true);
        int i10 = 1;
        er erVar = er.h;
        this.f19498b = new ud.a(1, this, erVar, 350L, false);
        int i11 = 2;
        this.f19499c = new ud.a(2, this, erVar, 350L, false);
        this.F = new gf.c0(2);
        this.G = new gf.c0(8);
        Paint paint = new Paint(1);
        this.L = paint;
        i0.c cVar = i0.c.f10488e;
        this.P = cVar;
        this.Q = cVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.f19504s = n2Var;
        int i12 = 0;
        this.J = arrayList != null;
        this.M = arrayList;
        this.K = q2Var;
        Context context = n2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i13 = g6.f22999a7;
        paint.setColor(g6.v0(i13, this.resourcesProvider));
        fixNavigationBar(g6.v0(i13, this.resourcesProvider));
        this.containerView = new t8(this, context);
        h1 h1Var = new h1(this, context, i11);
        this.d = h1Var;
        int i14 = this.backgroundPaddingLeft;
        h1Var.setPadding(i14, 0, i14, 0);
        this.containerView.addView(this.d, z5.e(-1, -1, 119));
        int i15 = 6;
        this.D = new s0(this, context, i15);
        this.E = new s0(this, context, i15);
        p10 p10Var = new p10(context, this.resourcesProvider);
        this.f19507y = p10Var;
        p10Var.setCloseButtonVisible(true);
        p10Var.f31471x = true;
        p10Var.d();
        String string = LocaleController.getString(R.string.Search);
        gg.g gVar = p10Var.f31468r;
        gVar.setHint(string);
        gVar.addTextChangedListener(new v(this));
        p10Var.setVisibility(8);
        p10 p10Var2 = new p10(context, this.resourcesProvider);
        this.A = p10Var2;
        p10Var2.setCloseButtonVisible(true);
        p10Var2.f31471x = true;
        p10Var2.d();
        String string2 = LocaleController.getString(R.string.Search);
        gg.g gVar2 = p10Var2.f31468r;
        gVar2.setHint(string2);
        gVar2.addTextChangedListener(new w(this));
        p10Var2.setVisibility(8);
        k51 k51Var = new k51(context, this.currentAccount, 0, false, new s(this, i12), new t(this, i12), null, this.resourcesProvider);
        this.C = k51Var;
        k51Var.j(new x(this));
        k51Var.setClipToPadding(false);
        k51Var.setVisibility(8);
        k51Var.p1();
        k51Var.U2.f26942r = false;
        k51Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        i10 i10Var = new i10(n2Var);
        this.B = i10Var;
        i10Var.setVisibility(8);
        i10Var.setBackground(null);
        i10Var.setChatPreviewDelegate(new y());
        i10Var.setUiCallback(new z(this));
        i10Var.f38936b.setClipToPadding(false);
        this.H = new View(getContext());
        Context context2 = getContext();
        c6 c6Var = this.resourcesProvider;
        q0 q0Var = new q0(context2, c6Var, new mc((FrameLayout) this.containerView, c6Var), this.currentAccount, j10);
        this.I = q0Var;
        q0Var.h = new a0(this, n2Var);
        this.f19500e = j10;
        this.f19501f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        MessagesController.getInstance(this.currentAccount).getChatFull(j10);
        TLRPC.Chat chat = this.f19501f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        pf.e0 e0Var = new pf.e0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        e0Var.f45783f = this.f19501f;
        e0Var.h = false;
        ArrayList arrayList2 = p10Var.B;
        arrayList2.add(e0Var);
        p10Var.E = arrayList2.size() - 1;
        p10Var.f();
        setBackgroundColor(g6.v0(i13, this.resourcesProvider));
        this.f19505w = new i0(this, context);
        this.v = new e0(this, context);
        this.f19506x = new d0(this, context);
        this.d.setAdapter(new b0(this));
        p10Var.setCloseButtonOnClickListener(new u(this, i12));
        p10Var2.setCloseButtonOnClickListener(new u(this, i10));
        q0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j10, 0, true);
        ec.a((FrameLayout) this.containerView, new c0());
        ViewGroup viewGroup = this.containerView;
        t tVar = new t(this, i10);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(viewGroup, tVar);
    }

    @Override
    public final void c() {
    }

    @Override
    public final void a(p2 p2Var) {
    }

    @Override
    public final void f(p2 p2Var) {
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
