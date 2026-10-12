package gi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.o1;
import bi.v2;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l61;
import w7.a6;
public final class f extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public long f10173a;
    public TLRPC.Chat f10174b;
    public TLRPC.User f10175c;
    public FrameLayout d;
    public h71 e;
    public e f10176f;
    public ArrayList h;
    public NotificationCenter.ObserversGroup f10177n;

    public static void U(f fVar, l61 l61Var) {
        f fVar2;
        if (l61Var.d == 1) {
            fVar2 = fVar;
            g5.Q(fVar.getParentActivity(), fVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, Integer.MAX_VALUE, LocaleController.getString(R.string.Create), fVar.resourceProvider, new c(fVar));
        } else {
            fVar2 = fVar;
        }
        Object obj = l61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            fVar2.getMessagesController().getChat(Long.valueOf(-fVar2.f10173a));
            fVar2.showDialog(new ii.b(fVar2.getParentActivity(), chat, fVar2.f10173a, new v2(13, fVar2, chat)));
        }
    }

    public final void V(String str, boolean z10) {
        if (!ChatObject.isChannel(this.f10174b) && this.f10175c == null) {
            a2 a2Var = new a2(getParentActivity(), 3, null);
            a2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f10173a, this, new da.b(this, a2Var, str, z10, 1));
            return;
        }
        getMessagesController().createCommunity(str, this.f10173a, z10, new b(this, 1));
    }

    public final void W(long j10, boolean z10) {
        if (!ChatObject.isChannel(this.f10174b) && this.f10175c == null) {
            a2 a2Var = new a2(getParentActivity(), 3, null);
            a2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f10173a, this, new d(this, a2Var, j10, z10, 0));
            return;
        }
        int i10 = this.currentAccount;
        long j11 = -this.f10173a;
        MessagesController.getInstance(i10).linkCommunity(-j11, j10, z10, new o0(this, j11, 0));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        i2.d.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 4));
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(g6.f19901d6));
        bh.b bVar = new bh.b(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.M(bVar, fh.b.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(g6.x0(null, g6.f19843a7, false));
        e eVar = new e(context, this.resourceProvider);
        this.f10176f = eVar;
        eVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        e eVar2 = this.f10176f;
        if (this.f10175c != null) {
            i10 = R.string.CommunityDescriptionBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(this.f10174b)) {
            i10 = R.string.CommunityDescriptionChannel;
        } else {
            i10 = R.string.CommunityDescriptionGroup;
        }
        eVar2.setSubtitle(LocaleController.getString(i10));
        this.f10176f.setTag(-33024);
        TLRPC.User user = this.f10175c;
        if (user != null) {
            this.f10176f.f10170a.e(user, new k9(0, this.f10175c));
        } else {
            TLRPC.Chat chat = this.f10174b;
            if (chat != null) {
                this.f10176f.f10170a.e(chat, new k9(this.f10174b));
            }
        }
        h71 h71Var = new h71(this, new b(this, 0), new c(this), new c(this));
        this.e = h71Var;
        h71Var.setClipToPadding(false);
        h71 h71Var2 = this.e;
        h71Var2.W2.f31780r = false;
        h71Var2.p1();
        this.d.addView(this.e, a6.d(-1.0f, -1));
        this.d.addView(this.actionBar, a6.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.d;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.f19217id;
            View z12 = this.e.z1((int) (j10 ^ (j10 >>> 32)));
            if (z12 instanceof i6) {
                i6 i6Var = (i6) z12;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                if (arrayList != null) {
                    i12 = arrayList.size();
                } else {
                    i12 = 0;
                }
                i6Var.setSubLabel(LocaleController.formatPluralString("Chats", i12, new Object[0]));
                return;
            }
            this.e.W2.N(false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f10173a = this.arguments.getLong("dialog_id", 0L);
        this.f10174b = getMessagesController().getChat(Long.valueOf(-this.f10173a));
        this.f10175c = getMessagesController().getUser(Long.valueOf(this.f10173a));
        this.h = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new o1(this, 19), this.classGuid);
        this.f10177n = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.f10177n;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f10177n = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        this.e.setPadding(0, i11, 0, i13);
    }
}
