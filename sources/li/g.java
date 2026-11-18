package li;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.r1;
import c8.ma;
import hi.t6;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.v3;
import org.telegram.messenger.z3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class g extends h2 implements fs {
    public ui.c f19928a;
    public long f19929b;
    public TLRPC.Chat f19930c;
    public TLRPC.User d;
    public FrameLayout f19931e;
    public e51 f19932f;
    public f h;
    public ArrayList f19933n;
    public xi.e f19934r;

    public static void Z(g gVar, l41 l41Var) {
        g gVar2;
        if (l41Var.d == 1) {
            gVar2 = gVar;
            b5.O(gVar.getParentActivity(), gVar2, gd.M0(2131751895, null), null, gd.M0(2131751896, null), null, Integer.MAX_VALUE, gd.M0(2131751742, null), gVar.resourceProvider, new b(gVar));
        } else {
            gVar2 = gVar;
        }
        Object obj = l41Var.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            gVar2.getMessagesController().O0(Long.valueOf(-gVar2.f19929b));
            gVar2.showDialog(new ni.a(gVar2.getParentActivity(), chat, gVar2.f19929b, new d(0, gVar2, chat)));
        }
    }

    public final void a0(String str, boolean z10) {
        if (!v3.T(this.f19930c) && this.d == null) {
            u1 u1Var = new u1(3, getParentActivity(), null);
            u1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.f19929b, this, new a3.g(this, u1Var, str, z10, 3), null);
            return;
        }
        mp messagesController = getMessagesController();
        long j3 = this.f19929b;
        a aVar = new a(this, 1);
        messagesController.getClass();
        TL_communities.TL_communities_create tL_communities_create = new TL_communities.TL_communities_create();
        tL_communities_create.title = str;
        tL_communities_create.peer = messagesController.l1(j3);
        tL_communities_create.hidden = z10;
        messagesController.getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_create, new d3.b(1), new org.telegram.messenger.d(aVar, 5));
    }

    public final void b0(long j3, boolean z10) {
        if (!v3.T(this.f19930c) && this.d == null) {
            u1 u1Var = new u1(3, getParentActivity(), null);
            u1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.f19929b, this, new e(this, u1Var, j3, z10, 0), null);
            return;
        }
        int i7 = this.currentAccount;
        long j10 = -this.f19929b;
        mp.u1(i7).W2(-j10, j3, false, z10, new bi.n(this, j10, 1));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setBackButtonDrawable(new y1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new r1(this, 17));
        ui.c cVar = new ui.c();
        cVar.a(getThemedColor(n6.f29394d6));
        this.f19928a = cVar;
        dh.c cVar2 = new dh.c(cVar, cVar, cVar);
        this.actionBar.setBackground(null);
        this.actionBar.Q(cVar2, c8.i0.p(this.resourceProvider), false);
        this.actionBar.R0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f19931e = frameLayout;
        u6.h(n6.f29337a7, frameLayout, null);
        f fVar = new f(context, this.resourceProvider);
        this.h = fVar;
        fVar.setTitle(gd.M0(2131751836, null));
        f fVar2 = this.h;
        if (this.d != null) {
            i7 = 2131751922;
        } else if (v3.V(this.f19930c)) {
            i7 = 2131751921;
        } else {
            i7 = 2131751920;
        }
        fVar2.setSubtitle(gd.M0(i7, null));
        this.h.setTag(-33024);
        TLRPC.User user = this.d;
        if (user != null) {
            this.h.f19921a.f(user, new b9(0, this.d));
        } else {
            TLRPC.Chat chat = this.f19930c;
            if (chat != null) {
                this.h.f19921a.f(chat, new b9(this.f19930c));
            }
        }
        e51 e51Var = new e51(this, new a(this, 0), new b(this), new c(this, 0));
        this.f19932f = e51Var;
        e51Var.setClipToPadding(false);
        e51 e51Var2 = this.f19932f;
        z41 z41Var = e51Var2.f34607g3;
        z41Var.f42809r = false;
        z41Var.f42810s = true;
        e51Var2.r1();
        this.f19931e.addView(this.f19932f, ma.c(-1.0f, -1));
        this.f19931e.addView(this.actionBar, ma.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.f19931e;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        if (i7 == ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.f28404id;
            View B1 = this.f19932f.B1((int) (j3 ^ (j3 >>> 32)));
            if (B1 instanceof h6) {
                h6 h6Var = (h6) B1;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                if (arrayList != null) {
                    i11 = arrayList.size();
                } else {
                    i11 = 0;
                }
                h6Var.setSubLabel(gd.G(i11, "Chats", new Object[0]));
                return;
            }
            this.f19932f.f34607g3.O(false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f19929b = this.arguments.getLong("dialog_id", 0L);
        this.f19930c = getMessagesController().O0(Long.valueOf(-this.f19929b));
        this.d = getMessagesController().c2(Long.valueOf(this.f19929b));
        this.f19933n = getMessagesController().W7;
        mp messagesController = getMessagesController();
        t6 t6Var = new t6(this, 14);
        int i7 = this.classGuid;
        messagesController.getClass();
        messagesController.getConnectionsManager().bindRequestToGuid(messagesController.getConnectionsManager().sendRequestTyped(new TL_communities.TL_communities_getJoinedCommunities(), new d3.b(1), new z3(4, messagesController, t6Var)), i7);
        ks notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar = new xi.e(notificationCenter, this);
        eVar.c(ks.T);
        this.f19934r = eVar;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        xi.e eVar = this.f19934r;
        if (eVar != null) {
            eVar.b();
            this.f19934r = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        super.onInsets(i7, i10, i11, i12);
        this.f19932f.setPadding(0, i10, 0, i12);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            ui.c cVar = this.f19928a;
            if (cVar != null) {
                cVar.a(getThemedColor(n6.f29394d6));
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
