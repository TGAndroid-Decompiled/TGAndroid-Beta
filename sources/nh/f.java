package nh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import fh.f1;
import fh.w4;
import g7.e6;
import java.util.ArrayList;
import kh.i9;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z8;
public final class f extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public long f18628a;
    public TLRPC.Chat f18629b;
    public TLRPC.User f18630c;
    public FrameLayout d;
    public i51 f18631e;
    public e f18632f;
    public ArrayList h;
    public NotificationCenter.ObserversGroup f18633n;

    public static void T(f fVar, l41 l41Var) {
        f fVar2;
        if (l41Var.d == 1) {
            fVar2 = fVar;
            y4.R(fVar.getParentActivity(), fVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, Integer.MAX_VALUE, LocaleController.getString(R.string.Create), fVar.resourceProvider, new c(fVar));
        } else {
            fVar2 = fVar;
        }
        Object obj = l41Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            fVar2.getMessagesController().getChat(Long.valueOf(-fVar2.f18628a));
            fVar2.showDialog(new ph.a(fVar2.getParentActivity(), chat, fVar2.f18628a, new f1(21, fVar2, chat)));
        }
    }

    public final void U(String str, boolean z10) {
        if (!ChatObject.isChannel(this.f18629b) && this.f18630c == null) {
            c2 c2Var = new c2(getParentActivity(), 3, null);
            c2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f18628a, this, new k9.b(this, c2Var, str, z10, 1));
            return;
        }
        getMessagesController().createCommunity(str, this.f18628a, z10, new b(this, 1));
    }

    public final void V(long j10, boolean z10) {
        if (!ChatObject.isChannel(this.f18629b) && this.f18630c == null) {
            c2 c2Var = new c2(getParentActivity(), 3, null);
            c2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f18628a, this, new d(this, c2Var, j10, z10, 0));
            return;
        }
        int i9 = this.currentAccount;
        long j11 = -this.f18628a;
        MessagesController.getInstance(i9).linkCommunity(-j11, j10, z10, new fh.m(this, j11, 1));
    }

    @Override
    public final View createView(Context context) {
        int i9;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        j2.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new w4(this, 6));
        ng.c cVar = new ng.c();
        cVar.a(getThemedColor(f6.f23001d6));
        ig.a aVar = new ig.a(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.L(aVar, mg.c.n(this.resourceProvider), false);
        this.actionBar.L0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(f6.w0(null, f6.f22947a7, false));
        e eVar = new e(context, this.resourceProvider);
        this.f18632f = eVar;
        eVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        e eVar2 = this.f18632f;
        if (this.f18630c != null) {
            i9 = R.string.CommunityDescriptionBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(this.f18629b)) {
            i9 = R.string.CommunityDescriptionChannel;
        } else {
            i9 = R.string.CommunityDescriptionGroup;
        }
        eVar2.setSubtitle(LocaleController.getString(i9));
        this.f18632f.setTag(-33024);
        TLRPC.User user = this.f18630c;
        if (user != null) {
            this.f18632f.f18623a.e(user, new z8(0, this.f18630c));
        } else {
            TLRPC.Chat chat = this.f18629b;
            if (chat != null) {
                this.f18632f.f18623a.e(chat, new z8(this.f18629b));
            }
        }
        i51 i51Var = new i51(this, new b(this, 0), new c(this), new c(this));
        this.f18631e = i51Var;
        i51Var.setClipToPadding(false);
        i51 i51Var2 = this.f18631e;
        i51Var2.U2.f35188r = false;
        i51Var2.p1();
        this.d.addView(this.f18631e, e6.c(-1.0f, -1));
        this.d.addView(this.actionBar, e6.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.d;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11;
        if (i9 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.f22381id;
            View y12 = this.f18631e.y1((int) (j10 ^ (j10 >>> 32)));
            if (y12 instanceof h6) {
                h6 h6Var = (h6) y12;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                if (arrayList != null) {
                    i11 = arrayList.size();
                } else {
                    i11 = 0;
                }
                h6Var.setSubLabel(LocaleController.formatPluralString("Chats", i11, new Object[0]));
                return;
            }
            this.f18631e.U2.N(false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f18628a = this.arguments.getLong("dialog_id", 0L);
        this.f18629b = getMessagesController().getChat(Long.valueOf(-this.f18628a));
        this.f18630c = getMessagesController().getUser(Long.valueOf(this.f18628a));
        this.h = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new i9(this, 3), this.classGuid);
        this.f18633n = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.f18633n;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f18633n = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        super.onInsets(i9, i10, i11, i12);
        this.f18631e.setPadding(0, i10, 0, i12);
    }
}
