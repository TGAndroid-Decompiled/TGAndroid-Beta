package fi;

import ai.g3;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h9;
import w7.x5;
public final class f extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public long f9081a;
    public TLRPC.Chat f9082b;
    public TLRPC.User f9083c;
    public FrameLayout d;
    public d61 e;
    public e f9084f;
    public ArrayList h;
    public NotificationCenter.ObserversGroup f9085n;

    public static void U(f fVar, h51 h51Var) {
        f fVar2;
        if (h51Var.d == 1) {
            fVar2 = fVar;
            e5.R(fVar.getParentActivity(), fVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, Integer.MAX_VALUE, LocaleController.getString(R.string.Create), fVar.resourceProvider, new c(fVar));
        } else {
            fVar2 = fVar;
        }
        Object obj = h51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            fVar2.getMessagesController().getChat(Long.valueOf(-fVar2.f9081a));
            fVar2.showDialog(new hi.b(fVar2.getParentActivity(), chat, fVar2.f9081a, new g3(13, fVar2, chat)));
        }
    }

    public final void V(String str, boolean z10) {
        if (!ChatObject.isChannel(this.f9082b) && this.f9083c == null) {
            b2 b2Var = new b2(getParentActivity(), 3, null);
            b2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f9081a, this, new ca.b(this, b2Var, str, z10, 1));
            return;
        }
        getMessagesController().createCommunity(str, this.f9081a, z10, new b(this, 1));
    }

    public final void W(long j3, boolean z10) {
        if (!ChatObject.isChannel(this.f9082b) && this.f9083c == null) {
            b2 b2Var = new b2(getParentActivity(), 3, null);
            b2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f9081a, this, new d(this, b2Var, j3, z10, 0));
            return;
        }
        int i10 = this.currentAccount;
        long j10 = -this.f9081a;
        MessagesController.getInstance(i10).linkCommunity(-j10, j3, z10, new o0(this, j10, 0));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        hg.c.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 3));
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(h6.f18789d6));
        ah.c cVar2 = new ah.c(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.M(cVar2, eh.b.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(h6.w0(null, h6.f18733a7, false));
        e eVar = new e(context, this.resourceProvider);
        this.f9084f = eVar;
        eVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        e eVar2 = this.f9084f;
        if (this.f9083c != null) {
            i10 = R.string.CommunityDescriptionBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(this.f9082b)) {
            i10 = R.string.CommunityDescriptionChannel;
        } else {
            i10 = R.string.CommunityDescriptionGroup;
        }
        eVar2.setSubtitle(LocaleController.getString(i10));
        this.f9084f.setTag(-33024);
        TLRPC.User user = this.f9083c;
        if (user != null) {
            this.f9084f.f9078a.e(user, new h9(0, this.f9083c));
        } else {
            TLRPC.Chat chat = this.f9082b;
            if (chat != null) {
                this.f9084f.f9078a.e(chat, new h9(this.f9082b));
            }
        }
        d61 d61Var = new d61(this, new b(this, 0), new c(this), new c(this));
        this.e = d61Var;
        d61Var.setClipToPadding(false);
        d61 d61Var2 = this.e;
        d61Var2.Y2.f28662r = false;
        d61Var2.p1();
        this.d.addView(this.e, x5.c(-1.0f, -1));
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
            long j3 = chatFull.f18084id;
            View y12 = this.e.y1((int) (j3 ^ (j3 >>> 32)));
            if (y12 instanceof i6) {
                i6 i6Var = (i6) y12;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                if (arrayList != null) {
                    i12 = arrayList.size();
                } else {
                    i12 = 0;
                }
                i6Var.setSubLabel(LocaleController.formatPluralString("Chats", i12, new Object[0]));
                return;
            }
            this.e.Y2.N(false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f9081a = this.arguments.getLong("dialog_id", 0L);
        this.f9082b = getMessagesController().getChat(Long.valueOf(-this.f9081a));
        this.f9083c = getMessagesController().getUser(Long.valueOf(this.f9081a));
        this.h = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new y1(this, 19), this.classGuid);
        this.f9085n = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.f9085n;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f9085n = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        this.e.setPadding(0, i11, 0, i13);
    }
}
