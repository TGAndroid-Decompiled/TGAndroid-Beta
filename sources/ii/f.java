package ii;

import ai.n1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.m6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
public final class f extends r2 implements NotificationCenter.NotificationCenterDelegate {
    public hh.c f14337a;
    public long f14338b;
    public TLRPC.Chat f14339c;
    public TLRPC.User d;
    public FrameLayout e;
    public s71 f14340f;
    public e h;
    public ArrayList f14341n;
    public NotificationCenter.ObserversGroup f14342r;

    public static void V(f fVar, u61 u61Var) {
        f fVar2;
        if (u61Var.d == 1) {
            fVar2 = fVar;
            g5.Q(fVar.getParentActivity(), fVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, Integer.MAX_VALUE, LocaleController.getString(R.string.Create), fVar.resourceProvider, new c(fVar));
        } else {
            fVar2 = fVar;
        }
        Object obj = u61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            fVar2.getMessagesController().getChat(Long.valueOf(-fVar2.f14338b));
            fVar2.showDialog(new ki.a(fVar2.getParentActivity(), chat, fVar2.f14338b, new n1(21, fVar2, chat)));
        }
    }

    public final void W(String str, boolean z10) {
        if (!ChatObject.isChannel(this.f14339c) && this.d == null) {
            e2 e2Var = new e2(getParentActivity(), 3, null);
            e2Var.r(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f14338b, this, new ea.b(this, e2Var, str, z10, 1));
            return;
        }
        getMessagesController().createCommunity(str, this.f14338b, z10, new b(this, 1));
    }

    public final void X(long j10, boolean z10) {
        if (!ChatObject.isChannel(this.f14339c) && this.d == null) {
            e2 e2Var = new e2(getParentActivity(), 3, null);
            e2Var.r(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f14338b, this, new d(this, e2Var, j10, z10, 0));
            return;
        }
        int i10 = this.currentAccount;
        long j11 = -this.f14338b;
        MessagesController.getInstance(i10).linkCommunity(-j11, j10, z10, new m0(this, j11, 0));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setBackButtonDrawable(new j2(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new bh.m(this, 5));
        hh.c cVar = new hh.c();
        cVar.a(getThemedColor(y6.f23357d6));
        this.f14337a = cVar;
        ch.b bVar = new ch.b(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.I(bVar, gh.c.p(this.resourceProvider), false);
        this.actionBar.Q0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        f7.i(y6.f23300a7, frameLayout, null);
        e eVar = new e(context, this.resourceProvider);
        this.h = eVar;
        eVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        e eVar2 = this.h;
        if (this.d != null) {
            i10 = R.string.CommunityDescriptionBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(this.f14339c)) {
            i10 = R.string.CommunityDescriptionChannel;
        } else {
            i10 = R.string.CommunityDescriptionGroup;
        }
        eVar2.setSubtitle(LocaleController.getString(i10));
        this.h.setTag(-33024);
        TLRPC.User user = this.d;
        if (user != null) {
            this.h.f14332a.f(user, new j9(0, this.d));
        } else {
            TLRPC.Chat chat = this.f14339c;
            if (chat != null) {
                this.h.f14332a.f(chat, new j9(this.f14339c));
            }
        }
        s71 s71Var = new s71(this, new b(this, 0), new c(this), new c(this));
        this.f14340f = s71Var;
        s71Var.setClipToPadding(false);
        s71 s71Var2 = this.f14340f;
        k71 k71Var = s71Var2.f32504g3;
        k71Var.f29878r = false;
        k71Var.f29879s = true;
        s71Var2.u1();
        this.e.addView(this.f14340f, kb1.g(-1.0f, -1));
        this.e.addView(this.actionBar, kb1.i(-1, -2, 48));
        FrameLayout frameLayout2 = this.e;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.f22029id;
            View E1 = this.f14340f.E1((int) (j10 ^ (j10 >>> 32)));
            if (E1 instanceof m6) {
                m6 m6Var = (m6) E1;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                if (arrayList != null) {
                    i12 = arrayList.size();
                } else {
                    i12 = 0;
                }
                m6Var.setSubLabel(LocaleController.formatPluralString("Chats", i12, new Object[0]));
                return;
            }
            this.f14340f.f32504g3.O(false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f14338b = this.arguments.getLong("dialog_id", 0L);
        this.f14339c = getMessagesController().getChat(Long.valueOf(-this.f14338b));
        this.d = getMessagesController().getUser(Long.valueOf(this.f14338b));
        this.f14341n = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new ig.o(this, 1), this.classGuid);
        this.f14342r = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.f14342r;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f14342r = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        this.f14340f.setPadding(0, i11, 0, i13);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            hh.c cVar = this.f14337a;
            if (cVar != null) {
                cVar.a(getThemedColor(y6.f23357d6));
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
