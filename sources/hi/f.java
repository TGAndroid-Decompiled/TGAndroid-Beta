package hi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import i2.o1;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import w7.z5;
public final class f extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public gh.c f12171a;
    public long f12172b;
    public TLRPC.Chat f12173c;
    public TLRPC.User d;
    public FrameLayout e;
    public i71 f12174f;
    public e h;
    public ArrayList f12175n;
    public NotificationCenter.ObserversGroup f12176r;

    public static void U(f fVar, l61 l61Var) {
        f fVar2;
        if (l61Var.d == 1) {
            fVar2 = fVar;
            d5.Q(fVar.getParentActivity(), fVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, Integer.MAX_VALUE, LocaleController.getString(R.string.Create), fVar.resourceProvider, new c(fVar));
        } else {
            fVar2 = fVar;
        }
        Object obj = l61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            fVar2.getMessagesController().getChat(Long.valueOf(-fVar2.f12172b));
            fVar2.showDialog(new ji.a(fVar2.getParentActivity(), chat, fVar2.f12172b, new ai.o2(19, fVar2, chat)));
        }
    }

    public final void V(String str, boolean z10) {
        if (!ChatObject.isChannel(this.f12173c) && this.d == null) {
            c2 c2Var = new c2(getParentActivity(), 3, null);
            c2Var.r(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f12172b, this, new da.b(this, c2Var, str, z10, 1));
            return;
        }
        getMessagesController().createCommunity(str, this.f12172b, z10, new b(this, 1));
    }

    public final void W(long j10, boolean z10) {
        if (!ChatObject.isChannel(this.f12173c) && this.d == null) {
            c2 c2Var = new c2(getParentActivity(), 3, null);
            c2Var.r(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f12172b, this, new d(this, c2Var, j10, z10, 0));
            return;
        }
        int i10 = this.currentAccount;
        long j11 = -this.f12172b;
        MessagesController.getInstance(i10).linkCommunity(-j11, j10, z10, new n0(this, j11, 0));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        o1.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 5));
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(k6.f21184d6));
        this.f12171a = cVar;
        bh.b bVar = new bh.b(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.L(bVar, fh.c.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        r6.i(k6.f21126a7, frameLayout, null);
        e eVar = new e(context, this.resourceProvider);
        this.h = eVar;
        eVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        e eVar2 = this.h;
        if (this.d != null) {
            i10 = R.string.CommunityDescriptionBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(this.f12173c)) {
            i10 = R.string.CommunityDescriptionChannel;
        } else {
            i10 = R.string.CommunityDescriptionGroup;
        }
        eVar2.setSubtitle(LocaleController.getString(i10));
        this.h.setTag(-33024);
        TLRPC.User user = this.d;
        if (user != null) {
            this.h.f12168a.e(user, new f9(0, this.d));
        } else {
            TLRPC.Chat chat = this.f12173c;
            if (chat != null) {
                this.h.f12168a.e(chat, new f9(this.f12173c));
            }
        }
        i71 i71Var = new i71(this, new b(this, 0), new c(this), new c(this));
        this.f12174f = i71Var;
        i71Var.setClipToPadding(false);
        i71 i71Var2 = this.f12174f;
        a71 a71Var = i71Var2.Z2;
        a71Var.f24646r = false;
        a71Var.f24647s = true;
        i71Var2.t1();
        this.e.addView(this.f12174f, z5.c(-1.0f, -1));
        this.e.addView(this.actionBar, z5.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.e;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.f20345id;
            View E1 = this.f12174f.E1((int) (j10 ^ (j10 >>> 32)));
            if (E1 instanceof i6) {
                i6 i6Var = (i6) E1;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                if (arrayList != null) {
                    i12 = arrayList.size();
                } else {
                    i12 = 0;
                }
                i6Var.setSubLabel(LocaleController.formatPluralString("Chats", i12, new Object[0]));
                return;
            }
            this.f12174f.Z2.N(false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f12172b = this.arguments.getLong("dialog_id", 0L);
        this.f12173c = getMessagesController().getChat(Long.valueOf(-this.f12172b));
        this.d = getMessagesController().getUser(Long.valueOf(this.f12172b));
        this.f12175n = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new ai.r0(this, 27), this.classGuid);
        this.f12176r = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.f12176r;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f12176r = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        this.f12174f.setPadding(0, i11, 0, i13);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            gh.c cVar = this.f12171a;
            if (cVar != null) {
                cVar.a(getThemedColor(k6.f21184d6));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
