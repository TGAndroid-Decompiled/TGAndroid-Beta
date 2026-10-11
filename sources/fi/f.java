package fi;

import ai.h3;
import ai.y1;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.r61;
import w7.x5;
public final class f extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public long f9959a;
    public TLRPC.Chat f9960b;
    public TLRPC.User f9961c;
    public FrameLayout d;
    public m71 f9962e;
    public e f9963f;
    public ArrayList h;
    public NotificationCenter.ObserversGroup f9964n;

    public static void U(f fVar, r61 r61Var) {
        f fVar2;
        if (r61Var.d == 1) {
            fVar2 = fVar;
            g5.Q(fVar.getParentActivity(), fVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, Integer.MAX_VALUE, LocaleController.getString(R.string.Create), fVar.resourceProvider, new c(fVar));
        } else {
            fVar2 = fVar;
        }
        Object obj = r61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            fVar2.getMessagesController().getChat(Long.valueOf(-fVar2.f9959a));
            fVar2.showDialog(new hi.b(fVar2.getParentActivity(), chat, fVar2.f9959a, new h3(13, fVar2, chat)));
        }
    }

    public final void V(String str, boolean z10) {
        if (!ChatObject.isChannel(this.f9960b) && this.f9961c == null) {
            a2 a2Var = new a2(getParentActivity(), 3, null);
            a2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f9959a, this, new ca.b(this, a2Var, str, z10, 1));
            return;
        }
        getMessagesController().createCommunity(str, this.f9959a, z10, new b(this, 1));
    }

    public final void W(long j3, boolean z10) {
        if (!ChatObject.isChannel(this.f9960b) && this.f9961c == null) {
            a2 a2Var = new a2(getParentActivity(), 3, null);
            a2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f9959a, this, new d(this, a2Var, j3, z10, 0));
            return;
        }
        int i10 = this.currentAccount;
        long j10 = -this.f9959a;
        MessagesController.getInstance(i10).linkCommunity(-j10, j3, z10, new o0(this, j10, 0));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 3));
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(h6.f20786d6));
        ah.c cVar2 = new ah.c(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.M(cVar2, eh.b.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(h6.x0(null, h6.f20730a7, false));
        e eVar = new e(context, this.resourceProvider);
        this.f9963f = eVar;
        eVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        e eVar2 = this.f9963f;
        if (this.f9961c != null) {
            i10 = R.string.CommunityDescriptionBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(this.f9960b)) {
            i10 = R.string.CommunityDescriptionChannel;
        } else {
            i10 = R.string.CommunityDescriptionGroup;
        }
        eVar2.setSubtitle(LocaleController.getString(i10));
        this.f9963f.setTag(-33024);
        TLRPC.User user = this.f9961c;
        if (user != null) {
            this.f9963f.f9956a.e(user, new j9(0, this.f9961c));
        } else {
            TLRPC.Chat chat = this.f9960b;
            if (chat != null) {
                this.f9963f.f9956a.e(chat, new j9(this.f9960b));
            }
        }
        m71 m71Var = new m71(this, new b(this, 0), new c(this), new c(this));
        this.f9962e = m71Var;
        m71Var.setClipToPadding(false);
        m71 m71Var2 = this.f9962e;
        m71Var2.W2.f25890r = false;
        m71Var2.p1();
        this.d.addView(this.f9962e, x5.d(-1.0f, -1));
        this.d.addView(this.actionBar, x5.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.d;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.f20033id;
            View z12 = this.f9962e.z1((int) (j3 ^ (j3 >>> 32)));
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
            this.f9962e.W2.N(false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f9959a = this.arguments.getLong("dialog_id", 0L);
        this.f9960b = getMessagesController().getChat(Long.valueOf(-this.f9959a));
        this.f9961c = getMessagesController().getUser(Long.valueOf(this.f9959a));
        this.h = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new y1(this, 19), this.classGuid);
        this.f9964n = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.f9964n;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f9964n = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        this.f9962e.setPadding(0, i11, 0, i13);
    }
}
