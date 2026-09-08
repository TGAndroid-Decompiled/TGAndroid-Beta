package gi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.o1;
import di.m2;
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
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i9;
import w7.x5;
public final class f extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public long f10707a;
    public TLRPC.Chat f10708b;
    public TLRPC.User f10709c;
    public FrameLayout d;
    public d61 f10710e;
    public e f10711f;
    public ArrayList h;
    public NotificationCenter.ObserversGroup f10712n;

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
            fVar2.getMessagesController().getChat(Long.valueOf(-fVar2.f10707a));
            fVar2.showDialog(new ii.b(fVar2.getParentActivity(), chat, fVar2.f10707a, new m2(12, fVar2, chat)));
        }
    }

    public final void V(String str, boolean z10) {
        if (!ChatObject.isChannel(this.f10708b) && this.f10709c == null) {
            b2 b2Var = new b2(getParentActivity(), 3, null);
            b2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f10707a, this, new ca.b(this, b2Var, str, z10, 1));
            return;
        }
        getMessagesController().createCommunity(str, this.f10707a, z10, new b(this, 1));
    }

    public final void W(long j3, boolean z10) {
        if (!ChatObject.isChannel(this.f10708b) && this.f10709c == null) {
            b2 b2Var = new b2(getParentActivity(), 3, null);
            b2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f10707a, this, new d(this, b2Var, j3, z10, 0));
            return;
        }
        int i10 = this.currentAccount;
        long j10 = -this.f10707a;
        MessagesController.getInstance(i10).linkCommunity(-j10, j3, z10, new o0(this, j10, 0));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        i2.g.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 4));
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(j6.f20690d6));
        bh.b bVar = new bh.b(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.M(bVar, fh.b.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(j6.w0(null, j6.f20634a7, false));
        e eVar = new e(context, this.resourceProvider);
        this.f10711f = eVar;
        eVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        e eVar2 = this.f10711f;
        if (this.f10709c != null) {
            i10 = R.string.CommunityDescriptionBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(this.f10708b)) {
            i10 = R.string.CommunityDescriptionChannel;
        } else {
            i10 = R.string.CommunityDescriptionGroup;
        }
        eVar2.setSubtitle(LocaleController.getString(i10));
        this.f10711f.setTag(-33024);
        TLRPC.User user = this.f10709c;
        if (user != null) {
            this.f10711f.f10704a.e(user, new i9(0, this.f10709c));
        } else {
            TLRPC.Chat chat = this.f10708b;
            if (chat != null) {
                this.f10711f.f10704a.e(chat, new i9(this.f10708b));
            }
        }
        d61 d61Var = new d61(this, new b(this, 0), new c(this), new c(this));
        this.f10710e = d61Var;
        d61Var.setClipToPadding(false);
        d61 d61Var2 = this.f10710e;
        d61Var2.Y2.f31162r = false;
        d61Var2.o1();
        this.d.addView(this.f10710e, x5.c(-1.0f, -1));
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
            long j3 = chatFull.f19897id;
            View x12 = this.f10710e.x1((int) (j3 ^ (j3 >>> 32)));
            if (x12 instanceof h6) {
                h6 h6Var = (h6) x12;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                if (arrayList != null) {
                    i12 = arrayList.size();
                } else {
                    i12 = 0;
                }
                h6Var.setSubLabel(LocaleController.formatPluralString("Chats", i12, new Object[0]));
                return;
            }
            this.f10710e.Y2.N(false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f10707a = this.arguments.getLong("dialog_id", 0L);
        this.f10708b = getMessagesController().getChat(Long.valueOf(-this.f10707a));
        this.f10709c = getMessagesController().getUser(Long.valueOf(this.f10707a));
        this.h = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new o1(this, 16), this.classGuid);
        this.f10712n = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.f10712n;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f10712n = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        this.f10710e.setPadding(0, i11, 0, i13);
    }
}
