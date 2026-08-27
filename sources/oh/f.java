package oh;

import ag.e2;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import gh.d1;
import h7.z5;
import java.util.ArrayList;
import lh.n6;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.e6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.y8;

public final class f extends n2 implements NotificationCenter.NotificationCenterDelegate {

    public long f19477a;

    public TLRPC.Chat f19478b;

    public TLRPC.User f19479c;
    public FrameLayout d;

    public k51 f19480e;

    public e f19481f;
    public ArrayList h;

    public NotificationCenter.ObserversGroup f19482n;

    public static void U(f fVar, n41 n41Var) {
        f fVar2;
        if (n41Var.d == 1) {
            fVar2 = fVar;
            y4.R(fVar.getParentActivity(), fVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, Integer.MAX_VALUE, LocaleController.getString(R.string.Create), fVar.resourceProvider, new c(fVar));
        } else {
            fVar2 = fVar;
        }
        Object obj = n41Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            fVar2.getMessagesController().getChat(Long.valueOf(-fVar2.f19477a));
            fVar2.showDialog(new qh.a(fVar2.getParentActivity(), chat, fVar2.f19477a, new d1(21, fVar2, chat)));
        }
    }

    public final void V(String str, boolean z10) {
        if (ChatObject.isChannel(this.f19478b) || this.f19479c != null) {
            getMessagesController().createCommunity(str, this.f19477a, z10, new b(this, 1));
            return;
        }
        b2 b2Var = new b2(getParentActivity(), 3, null);
        b2Var.q(250L);
        getMessagesController().convertToMegaGroup(getParentActivity(), -this.f19477a, this, new l9.b(this, b2Var, str, z10, 1));
    }

    public final void W(long j10, boolean z10) {
        if (ChatObject.isChannel(this.f19478b) || this.f19479c != null) {
            int i10 = this.currentAccount;
            long j11 = -this.f19477a;
            MessagesController.getInstance(i10).linkCommunity(-j11, j10, z10, new gh.m(this, j11, 1));
        } else {
            b2 b2Var = new b2(getParentActivity(), 3, null);
            b2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f19477a, this, new d(this, b2Var, j10, z10, 0));
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        pa.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new e2(this, 7));
        og.c cVar = new og.c();
        cVar.a(getThemedColor(g6.f23053d6));
        jg.a aVar = new jg.a(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.M(aVar, ng.c.n(this.resourceProvider), false);
        this.actionBar.L0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(g6.w0(null, g6.f22999a7, false));
        e eVar = new e(context, this.resourceProvider);
        this.f19481f = eVar;
        eVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        e eVar2 = this.f19481f;
        if (this.f19479c != null) {
            i10 = R.string.CommunityDescriptionBot;
        } else {
            i10 = ChatObject.isChannelAndNotMegaGroup(this.f19478b) ? R.string.CommunityDescriptionChannel : R.string.CommunityDescriptionGroup;
        }
        eVar2.setSubtitle(LocaleController.getString(i10));
        this.f19481f.setTag(-33024);
        TLRPC.User user = this.f19479c;
        if (user != null) {
            this.f19481f.f19472a.e(user, new y8(0, this.f19479c));
        } else {
            TLRPC.Chat chat = this.f19478b;
            if (chat != null) {
                this.f19481f.f19472a.e(chat, new y8(this.f19478b));
            }
        }
        k51 k51Var = new k51(this, new b(this, 0), new c(this), new c(this));
        this.f19480e = k51Var;
        k51Var.setClipToPadding(false);
        k51 k51Var2 = this.f19480e;
        k51Var2.U2.f26942r = false;
        k51Var2.p1();
        this.d.addView(this.f19480e, z5.c(-1.0f, -1));
        this.d.addView(this.actionBar, z5.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.d;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.f22381id;
            View viewY1 = this.f19480e.y1((int) (j10 ^ (j10 >>> 32)));
            if (!(viewY1 instanceof e6)) {
                this.f19480e.U2.N(false);
                return;
            }
            e6 e6Var = (e6) viewY1;
            ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
            e6Var.setSubLabel(LocaleController.formatPluralString("Chats", arrayList != null ? arrayList.size() : 0, new Object[0]));
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f19477a = this.arguments.getLong("dialog_id", 0L);
        this.f19478b = getMessagesController().getChat(Long.valueOf(-this.f19477a));
        this.f19479c = getMessagesController().getUser(Long.valueOf(this.f19477a));
        this.h = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new n6(this, 5), this.classGuid);
        this.f19482n = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.f19482n;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f19482n = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        this.f19480e.setPadding(0, i11, 0, i13);
    }
}
