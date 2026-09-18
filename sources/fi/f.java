package fi;

import ai.y1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ci.m2;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.x51;
import w7.y5;
public final class f extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public long f9097a;
    public TLRPC.Chat f9098b;
    public TLRPC.User f9099c;
    public FrameLayout d;
    public t61 e;
    public e f9100f;
    public ArrayList h;
    public NotificationCenter.ObserversGroup f9101n;

    public static void U(f fVar, x51 x51Var) {
        f fVar2;
        if (x51Var.d == 1) {
            fVar2 = fVar;
            e5.R(fVar.getParentActivity(), fVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, Integer.MAX_VALUE, LocaleController.getString(R.string.Create), fVar.resourceProvider, new c(fVar));
        } else {
            fVar2 = fVar;
        }
        Object obj = x51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            fVar2.getMessagesController().getChat(Long.valueOf(-fVar2.f9097a));
            fVar2.showDialog(new hi.b(fVar2.getParentActivity(), chat, fVar2.f9097a, new m2(12, fVar2, chat)));
        }
    }

    public final void V(String str, boolean z10) {
        if (!ChatObject.isChannel(this.f9098b) && this.f9099c == null) {
            b2 b2Var = new b2(getParentActivity(), 3, null);
            b2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f9097a, this, new ca.b(this, b2Var, str, z10, 1));
            return;
        }
        getMessagesController().createCommunity(str, this.f9097a, z10, new b(this, 1));
    }

    public final void W(long j3, boolean z10) {
        if (!ChatObject.isChannel(this.f9098b) && this.f9099c == null) {
            b2 b2Var = new b2(getParentActivity(), 3, null);
            b2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f9097a, this, new d(this, b2Var, j3, z10, 0));
            return;
        }
        int i10 = this.currentAccount;
        long j10 = -this.f9097a;
        MessagesController.getInstance(i10).linkCommunity(-j10, j3, z10, new o0(this, j10, 0));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        hg.k0.t(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 3));
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(j6.f19062d6));
        ah.c cVar2 = new ah.c(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.M(cVar2, eh.b.p(this.resourceProvider), false);
        this.actionBar.Q0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(j6.w0(null, j6.f19006a7, false));
        e eVar = new e(context, this.resourceProvider);
        this.f9100f = eVar;
        eVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        e eVar2 = this.f9100f;
        if (this.f9099c != null) {
            i10 = R.string.CommunityDescriptionBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(this.f9098b)) {
            i10 = R.string.CommunityDescriptionChannel;
        } else {
            i10 = R.string.CommunityDescriptionGroup;
        }
        eVar2.setSubtitle(LocaleController.getString(i10));
        this.f9100f.setTag(-33024);
        TLRPC.User user = this.f9099c;
        if (user != null) {
            this.f9100f.f9094a.e(user, new h9(0, this.f9099c));
        } else {
            TLRPC.Chat chat = this.f9098b;
            if (chat != null) {
                this.f9100f.f9094a.e(chat, new h9(this.f9098b));
            }
        }
        t61 t61Var = new t61(this, new b(this, 0), new c(this), new c(this));
        this.e = t61Var;
        t61Var.setClipToPadding(false);
        t61 t61Var2 = this.e;
        t61Var2.Y2.f26042r = false;
        t61Var2.q1();
        this.d.addView(this.e, y5.c(-1.0f, -1));
        this.d.addView(this.actionBar, y5.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.d;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.f18297id;
            View z12 = this.e.z1((int) (j3 ^ (j3 >>> 32)));
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
            this.e.Y2.N(false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f9097a = this.arguments.getLong("dialog_id", 0L);
        this.f9098b = getMessagesController().getChat(Long.valueOf(-this.f9097a));
        this.f9099c = getMessagesController().getUser(Long.valueOf(this.f9097a));
        this.h = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new y1(this, 16), this.classGuid);
        this.f9101n = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.f9101n;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f9101n = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        this.e.setPadding(0, i11, 0, i13);
    }
}
