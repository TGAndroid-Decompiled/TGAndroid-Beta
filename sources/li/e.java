package li;

import ai.u1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.x4;
import c8.ja;
import hi.g7;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.t3;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.u41;
public final class e extends e2 implements is {
    public ui.c f19553a;
    public long f19554b;
    public TLRPC.Chat f19555c;
    public TLRPC.User d;
    public FrameLayout f19556e;
    public u41 f19557f;
    public d h;
    public ArrayList f19558n;
    public xi.e f19559r;

    public static void Z(e eVar, b41 b41Var) {
        e eVar2;
        if (b41Var.d == 1) {
            eVar2 = eVar;
            t4.O(eVar.getParentActivity(), eVar2, hd.M0(2131751906, null), null, hd.M0(2131751907, null), null, Integer.MAX_VALUE, hd.M0(2131751753, null), eVar.resourceProvider, new b(eVar));
        } else {
            eVar2 = eVar;
        }
        Object obj = b41Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            eVar2.getMessagesController().M0(Long.valueOf(-eVar2.f19554b));
            eVar2.showDialog(new ni.a(eVar2.getParentActivity(), chat, eVar2.f19554b, new u1(28, eVar2, chat)));
        }
    }

    public final void a0(String str, boolean z10) {
        if (!t3.T(this.f19555c) && this.d == null) {
            t1 t1Var = new t1(3, getParentActivity(), null);
            t1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.f19554b, this, new a3.g(this, t1Var, str, z10, 2), null);
            return;
        }
        np messagesController = getMessagesController();
        long j3 = this.f19554b;
        a aVar = new a(this, 1);
        messagesController.getClass();
        TL_communities.TL_communities_create tL_communities_create = new TL_communities.TL_communities_create();
        tL_communities_create.title = str;
        tL_communities_create.peer = messagesController.j1(j3);
        tL_communities_create.hidden = z10;
        messagesController.getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_create, new d3.b(1), new org.telegram.messenger.d(aVar, 5));
    }

    public final void b0(long j3, boolean z10) {
        if (!t3.T(this.f19555c) && this.d == null) {
            t1 t1Var = new t1(3, getParentActivity(), null);
            t1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.f19554b, this, new c(this, t1Var, j3, z10, 0), null);
            return;
        }
        int i7 = this.currentAccount;
        long j10 = -this.f19554b;
        np.s1(i7).Q2(-j10, j3, false, z10, new bi.n(this, j10, 1));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setBackButtonDrawable(new x1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new x4(this, 15));
        ui.c cVar = new ui.c();
        cVar.a(getThemedColor(j6.f28849d6));
        this.f19553a = cVar;
        dh.c cVar2 = new dh.c(cVar, cVar, cVar);
        this.actionBar.setBackground(null);
        this.actionBar.P(cVar2, c8.g0.o(this.resourceProvider), false);
        this.actionBar.R0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f19556e = frameLayout;
        q6.h(j6.f28792a7, frameLayout, null);
        d dVar = new d(context, this.resourceProvider);
        this.h = dVar;
        dVar.setTitle(hd.M0(2131751847, null));
        d dVar2 = this.h;
        if (this.d != null) {
            i7 = 2131751933;
        } else if (t3.V(this.f19555c)) {
            i7 = 2131751932;
        } else {
            i7 = 2131751931;
        }
        dVar2.setSubtitle(hd.M0(i7, null));
        this.h.setTag(-33024);
        TLRPC.User user = this.d;
        if (user != null) {
            this.h.f19537a.f(user, new t8(0, this.d));
        } else {
            TLRPC.Chat chat = this.f19555c;
            if (chat != null) {
                this.h.f19537a.f(chat, new t8(this.f19555c));
            }
        }
        u41 u41Var = new u41(this, new a(this, 0), new b(this), new i0.b(this, 29));
        this.f19557f = u41Var;
        u41Var.setClipToPadding(false);
        u41 u41Var2 = this.f19557f;
        p41 p41Var = u41Var2.f39895g3;
        p41Var.f38201r = false;
        p41Var.f38202s = true;
        u41Var2.r1();
        this.f19556e.addView(this.f19557f, ja.c(-1.0f, -1));
        this.f19556e.addView(this.actionBar, ja.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.f19556e;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        if (i7 == ns.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.f28052id;
            View B1 = this.f19557f.B1((int) (j3 ^ (j3 >>> 32)));
            if (B1 instanceof f6) {
                f6 f6Var = (f6) B1;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                if (arrayList != null) {
                    i11 = arrayList.size();
                } else {
                    i11 = 0;
                }
                f6Var.setSubLabel(hd.G(i11, "Chats", new Object[0]));
                return;
            }
            this.f19557f.f39895g3.O(false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f19554b = this.arguments.getLong("dialog_id", 0L);
        this.f19555c = getMessagesController().M0(Long.valueOf(-this.f19554b));
        this.d = getMessagesController().a2(Long.valueOf(this.f19554b));
        this.f19558n = getMessagesController().R7;
        np messagesController = getMessagesController();
        g7 g7Var = new g7(this, 13);
        int i7 = this.classGuid;
        messagesController.getClass();
        messagesController.getConnectionsManager().bindRequestToGuid(messagesController.getConnectionsManager().sendRequestTyped(new TL_communities.TL_communities_getJoinedCommunities(), new d3.b(1), new x3(4, messagesController, g7Var)), i7);
        ns notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar = new xi.e(notificationCenter, this);
        eVar.c(ns.T);
        this.f19559r = eVar;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        xi.e eVar = this.f19559r;
        if (eVar != null) {
            eVar.b();
            this.f19559r = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        super.onInsets(i7, i10, i11, i12);
        this.f19557f.setPadding(0, i10, 0, i12);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            ui.c cVar = this.f19553a;
            if (cVar != null) {
                cVar.a(getThemedColor(j6.f28849d6));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
