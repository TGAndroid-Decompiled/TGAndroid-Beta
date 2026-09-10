package ei;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.y2;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import w7.a6;
public final class f extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public long f7542a;
    public TLRPC.Chat f7543b;
    public TLRPC.User f7544c;
    public FrameLayout d;
    public r61 e;
    public e f7545f;
    public ArrayList h;
    public NotificationCenter.ObserversGroup f7546n;

    public static void U(f fVar, v51 v51Var) {
        f fVar2;
        if (v51Var.d == 1) {
            fVar2 = fVar;
            d5.R(fVar.getParentActivity(), fVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, Integer.MAX_VALUE, LocaleController.getString(R.string.Create), fVar.resourceProvider, new c(fVar));
        } else {
            fVar2 = fVar;
        }
        Object obj = v51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            fVar2.getMessagesController().getChat(Long.valueOf(-fVar2.f7542a));
            fVar2.showDialog(new gi.b(fVar2.getParentActivity(), chat, fVar2.f7542a, new y2(12, fVar2, chat)));
        }
    }

    public final void V(String str, boolean z10) {
        if (!ChatObject.isChannel(this.f7543b) && this.f7544c == null) {
            d2 d2Var = new d2(getParentActivity(), 3, null);
            d2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f7542a, this, new ca.b(this, d2Var, str, z10, 1));
            return;
        }
        getMessagesController().createCommunity(str, this.f7542a, z10, new b(this, 1));
    }

    public final void W(long j3, boolean z10) {
        if (!ChatObject.isChannel(this.f7543b) && this.f7544c == null) {
            d2 d2Var = new d2(getParentActivity(), 3, null);
            d2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f7542a, this, new d(this, d2Var, j3, z10, 0));
            return;
        }
        int i10 = this.currentAccount;
        long j10 = -this.f7542a;
        MessagesController.getInstance(i10).linkCommunity(-j10, j3, z10, new o0(this, j10, 0));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        e2.t(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 3));
        eh.c cVar = new eh.c();
        cVar.a(getThemedColor(j6.f17928d6));
        zg.a aVar = new zg.a(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.M(aVar, dh.c.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(j6.w0(null, j6.f17872a7, false));
        e eVar = new e(context, this.resourceProvider);
        this.f7545f = eVar;
        eVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        e eVar2 = this.f7545f;
        if (this.f7544c != null) {
            i10 = R.string.CommunityDescriptionBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(this.f7543b)) {
            i10 = R.string.CommunityDescriptionChannel;
        } else {
            i10 = R.string.CommunityDescriptionGroup;
        }
        eVar2.setSubtitle(LocaleController.getString(i10));
        this.f7545f.setTag(-33024);
        TLRPC.User user = this.f7544c;
        if (user != null) {
            this.f7545f.f7539a.e(user, new g9(0, this.f7544c));
        } else {
            TLRPC.Chat chat = this.f7543b;
            if (chat != null) {
                this.f7545f.f7539a.e(chat, new g9(this.f7543b));
            }
        }
        r61 r61Var = new r61(this, new b(this, 0), new c(this), new c(this));
        this.e = r61Var;
        r61Var.setClipToPadding(false);
        r61 r61Var2 = this.e;
        r61Var2.Y2.f24250r = false;
        r61Var2.o1();
        this.d.addView(this.e, a6.c(-1.0f, -1));
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
            long j3 = chatFull.f17196id;
            View x12 = this.e.x1((int) (j3 ^ (j3 >>> 32)));
            if (x12 instanceof org.telegram.ui.Cells.j6) {
                org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) x12;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                if (arrayList != null) {
                    i12 = arrayList.size();
                } else {
                    i12 = 0;
                }
                j6Var.setSubLabel(LocaleController.formatPluralString("Chats", i12, new Object[0]));
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
        this.f7542a = this.arguments.getLong("dialog_id", 0L);
        this.f7543b = getMessagesController().getChat(Long.valueOf(-this.f7542a));
        this.f7544c = getMessagesController().getUser(Long.valueOf(this.f7542a));
        this.h = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new ai.b(this, 12), this.classGuid);
        this.f7546n = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.f7546n;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f7546n = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        this.e.setPadding(0, i11, 0, i13);
    }
}
