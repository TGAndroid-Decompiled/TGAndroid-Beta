package hi;

import ai.o2;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.h9;
import w7.z5;
public final class f extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public long f12141a;
    public TLRPC.Chat f12142b;
    public TLRPC.User f12143c;
    public FrameLayout d;
    public c71 e;
    public e f12144f;
    public ArrayList h;
    public NotificationCenter.ObserversGroup f12145n;

    public static void U(f fVar, h61 h61Var) {
        f fVar2;
        if (h61Var.d == 1) {
            fVar2 = fVar;
            f5.Q(fVar.getParentActivity(), fVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, Integer.MAX_VALUE, LocaleController.getString(R.string.Create), fVar.resourceProvider, new c(fVar));
        } else {
            fVar2 = fVar;
        }
        Object obj = h61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            fVar2.getMessagesController().getChat(Long.valueOf(-fVar2.f12141a));
            fVar2.showDialog(new ji.a(fVar2.getParentActivity(), chat, fVar2.f12141a, new o2(19, fVar2, chat)));
        }
    }

    public final void V(String str, boolean z10) {
        if (!ChatObject.isChannel(this.f12142b) && this.f12143c == null) {
            b2 b2Var = new b2(getParentActivity(), 3, null);
            b2Var.r(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f12141a, this, new da.b(this, b2Var, str, z10, 1));
            return;
        }
        getMessagesController().createCommunity(str, this.f12141a, z10, new b(this, 1));
    }

    public final void W(long j10, boolean z10) {
        if (!ChatObject.isChannel(this.f12142b) && this.f12143c == null) {
            b2 b2Var = new b2(getParentActivity(), 3, null);
            b2Var.r(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f12141a, this, new d(this, b2Var, j10, z10, 0));
            return;
        }
        int i10 = this.currentAccount;
        long j11 = -this.f12141a;
        MessagesController.getInstance(i10).linkCommunity(-j11, j10, z10, new n0(this, j11, 0));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        i2.e.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 5));
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(h6.f20994d6));
        bh.b bVar = new bh.b(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.M(bVar, fh.c.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(h6.x0(null, h6.f20936a7, false));
        e eVar = new e(context, this.resourceProvider);
        this.f12144f = eVar;
        eVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        e eVar2 = this.f12144f;
        if (this.f12143c != null) {
            i10 = R.string.CommunityDescriptionBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(this.f12142b)) {
            i10 = R.string.CommunityDescriptionChannel;
        } else {
            i10 = R.string.CommunityDescriptionGroup;
        }
        eVar2.setSubtitle(LocaleController.getString(i10));
        this.f12144f.setTag(-33024);
        TLRPC.User user = this.f12143c;
        if (user != null) {
            this.f12144f.f12138a.e(user, new h9(0, this.f12143c));
        } else {
            TLRPC.Chat chat = this.f12142b;
            if (chat != null) {
                this.f12144f.f12138a.e(chat, new h9(this.f12142b));
            }
        }
        c71 c71Var = new c71(this, new b(this, 0), new c(this), new c(this));
        this.e = c71Var;
        c71Var.setClipToPadding(false);
        c71 c71Var2 = this.e;
        c71Var2.W2.f30865r = false;
        c71Var2.p1();
        this.d.addView(this.e, z5.c(-1.0f, -1));
        this.d.addView(this.actionBar, z5.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.d;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.f20281id;
            View z12 = this.e.z1((int) (j10 ^ (j10 >>> 32)));
            if (z12 instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) z12;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                if (arrayList != null) {
                    i12 = arrayList.size();
                } else {
                    i12 = 0;
                }
                h6Var.setSubLabel(LocaleController.formatPluralString("Chats", i12, new Object[0]));
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
        this.f12141a = this.arguments.getLong("dialog_id", 0L);
        this.f12142b = getMessagesController().getChat(Long.valueOf(-this.f12141a));
        this.f12143c = getMessagesController().getUser(Long.valueOf(this.f12141a));
        this.h = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new ai.r0(this, 27), this.classGuid);
        this.f12145n = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.f12145n;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f12145n = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        this.e.setPadding(0, i11, 0, i13);
    }
}
