package li;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.w1;
import c8.na;
import hi.c7;
import java.util.ArrayList;
import ki.n2;
import org.telegram.messenger.a8;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.v3;
import org.telegram.messenger.z3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.n41;
public final class f extends g2 implements fs {
    public ui.c f20022a;
    public long f20023b;
    public TLRPC.Chat f20024c;
    public TLRPC.User d;
    public FrameLayout f20025e;
    public g51 f20026f;
    public e h;
    public ArrayList f20027n;
    public xi.e f20028r;

    public static void Z(f fVar, n41 n41Var) {
        f fVar2;
        if (n41Var.d == 1) {
            fVar2 = fVar;
            b5.O(fVar.getParentActivity(), fVar2, gd.N0(2131751894, null), null, gd.N0(2131751895, null), null, Integer.MAX_VALUE, gd.N0(2131751741, null), fVar.resourceProvider, new b(fVar));
        } else {
            fVar2 = fVar;
        }
        Object obj = n41Var.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            fVar2.getMessagesController().O0(Long.valueOf(-fVar2.f20023b));
            fVar2.showDialog(new ni.a(fVar2.getParentActivity(), chat, fVar2.f20023b, new n2(1, fVar2, chat)));
        }
    }

    public final void a0(String str, boolean z10) {
        if (!v3.T(this.f20024c) && this.d == null) {
            t1 t1Var = new t1(3, getParentActivity(), null);
            t1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.f20023b, this, new a3.g(this, t1Var, str, z10, 3), null);
            return;
        }
        mp messagesController = getMessagesController();
        long j3 = this.f20023b;
        a aVar = new a(this, 1);
        messagesController.getClass();
        TL_communities.TL_communities_create tL_communities_create = new TL_communities.TL_communities_create();
        tL_communities_create.title = str;
        tL_communities_create.peer = messagesController.l1(j3);
        tL_communities_create.hidden = z10;
        messagesController.getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_create, new d3.b(1), new org.telegram.messenger.d(aVar, 5));
    }

    public final void b0(long j3, boolean z10) {
        if (!v3.T(this.f20024c) && this.d == null) {
            t1 t1Var = new t1(3, getParentActivity(), null);
            t1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.f20023b, this, new d(this, t1Var, j3, z10, 0), null);
            return;
        }
        int i7 = this.currentAccount;
        long j10 = -this.f20023b;
        mp.u1(i7).W2(-j10, j3, false, z10, new bi.n(this, j10, 1));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setBackButtonDrawable(new x1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new w1(this, 17));
        ui.c cVar = new ui.c();
        cVar.a(getThemedColor(n6.f29451d6));
        this.f20022a = cVar;
        dh.c cVar2 = new dh.c(cVar, cVar, cVar);
        this.actionBar.setBackground(null);
        this.actionBar.P(cVar2, c8.j0.p(this.resourceProvider), false);
        this.actionBar.R0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f20025e = frameLayout;
        u6.h(n6.f29394a7, frameLayout, null);
        e eVar = new e(context, this.resourceProvider);
        this.h = eVar;
        eVar.setTitle(gd.N0(2131751835, null));
        e eVar2 = this.h;
        if (this.d != null) {
            i7 = 2131751921;
        } else if (v3.V(this.f20024c)) {
            i7 = 2131751920;
        } else {
            i7 = 2131751919;
        }
        eVar2.setSubtitle(gd.N0(i7, null));
        this.h.setTag(-33024);
        TLRPC.User user = this.d;
        if (user != null) {
            this.h.f20015a.f(user, new a9(0, this.d));
        } else {
            TLRPC.Chat chat = this.f20024c;
            if (chat != null) {
                this.h.f20015a.f(chat, new a9(this.f20024c));
            }
        }
        g51 g51Var = new g51(this, new a(this, 0), new b(this), new c(this, 0));
        this.f20026f = g51Var;
        g51Var.setClipToPadding(false);
        g51 g51Var2 = this.f20026f;
        b51 b51Var = g51Var2.f35323g3;
        b51Var.f33631r = false;
        b51Var.f33632s = true;
        g51Var2.r1();
        this.f20025e.addView(this.f20026f, na.c(-1.0f, -1));
        this.f20025e.addView(this.actionBar, na.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.f20025e;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        if (i7 == ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.f28493id;
            View B1 = this.f20026f.B1((int) (j3 ^ (j3 >>> 32)));
            if (B1 instanceof g6) {
                g6 g6Var = (g6) B1;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                if (arrayList != null) {
                    i11 = arrayList.size();
                } else {
                    i11 = 0;
                }
                g6Var.setSubLabel(gd.G(i11, "Chats", new Object[0]));
                return;
            }
            this.f20026f.f35323g3.O(false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f20023b = this.arguments.getLong("dialog_id", 0L);
        this.f20024c = getMessagesController().O0(Long.valueOf(-this.f20023b));
        this.d = getMessagesController().c2(Long.valueOf(this.f20023b));
        this.f20027n = getMessagesController().W7;
        mp messagesController = getMessagesController();
        c7 c7Var = new c7(this, 14);
        int i7 = this.classGuid;
        messagesController.getClass();
        messagesController.getConnectionsManager().bindRequestToGuid(messagesController.getConnectionsManager().sendRequestTyped(new TL_communities.TL_communities_getJoinedCommunities(), new d3.b(1), new z3(4, messagesController, c7Var)), i7);
        ks notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar = new xi.e(notificationCenter, this);
        eVar.c(ks.T);
        this.f20028r = eVar;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        xi.e eVar = this.f20028r;
        if (eVar != null) {
            eVar.b();
            this.f20028r = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        super.onInsets(i7, i10, i11, i12);
        this.f20026f.setPadding(0, i10, 0, i12);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            ui.c cVar = this.f20022a;
            if (cVar != null) {
                cVar.a(getThemedColor(n6.f29451d6));
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
