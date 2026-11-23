package li;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.v1;
import c8.ma;
import hi.s6;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.v3;
import org.telegram.messenger.z3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o41;
public final class g extends g2 implements gs {
    public ui.c f19959a;
    public long f19960b;
    public TLRPC.Chat f19961c;
    public TLRPC.User d;
    public FrameLayout f19962e;
    public h51 f19963f;
    public f h;
    public ArrayList f19964n;
    public xi.e f19965r;

    public static void Z(g gVar, o41 o41Var) {
        g gVar2;
        if (o41Var.d == 1) {
            gVar2 = gVar;
            c5.O(gVar.getParentActivity(), gVar2, hd.N0(2131751894, null), null, hd.N0(2131751895, null), null, Integer.MAX_VALUE, hd.N0(2131751741, null), gVar.resourceProvider, new b(gVar));
        } else {
            gVar2 = gVar;
        }
        Object obj = o41Var.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            gVar2.getMessagesController().O0(Long.valueOf(-gVar2.f19960b));
            gVar2.showDialog(new ni.a(gVar2.getParentActivity(), chat, gVar2.f19960b, new d(0, gVar2, chat)));
        }
    }

    public final void a0(String str, boolean z10) {
        if (!v3.T(this.f19961c) && this.d == null) {
            t1 t1Var = new t1(3, getParentActivity(), null);
            t1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.f19960b, this, new a3.g(this, t1Var, str, z10, 3), null);
            return;
        }
        np messagesController = getMessagesController();
        long j3 = this.f19960b;
        a aVar = new a(this, 1);
        messagesController.getClass();
        TL_communities.TL_communities_create tL_communities_create = new TL_communities.TL_communities_create();
        tL_communities_create.title = str;
        tL_communities_create.peer = messagesController.l1(j3);
        tL_communities_create.hidden = z10;
        messagesController.getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_create, new d3.b(1), new org.telegram.messenger.d(aVar, 5));
    }

    public final void b0(long j3, boolean z10) {
        if (!v3.T(this.f19961c) && this.d == null) {
            t1 t1Var = new t1(3, getParentActivity(), null);
            t1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.f19960b, this, new e(this, t1Var, j3, z10, 0), null);
            return;
        }
        int i7 = this.currentAccount;
        long j10 = -this.f19960b;
        np.u1(i7).W2(-j10, j3, false, z10, new bi.n(this, j10, 1));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setBackButtonDrawable(new x1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new v1(this, 17));
        ui.c cVar = new ui.c();
        cVar.a(getThemedColor(m6.f29381d6));
        this.f19959a = cVar;
        dh.c cVar2 = new dh.c(cVar, cVar, cVar);
        this.actionBar.setBackground(null);
        this.actionBar.P(cVar2, c8.i0.p(this.resourceProvider), false);
        this.actionBar.R0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f19962e = frameLayout;
        t6.h(m6.f29324a7, frameLayout, null);
        f fVar = new f(context, this.resourceProvider);
        this.h = fVar;
        fVar.setTitle(hd.N0(2131751835, null));
        f fVar2 = this.h;
        if (this.d != null) {
            i7 = 2131751921;
        } else if (v3.V(this.f19961c)) {
            i7 = 2131751920;
        } else {
            i7 = 2131751919;
        }
        fVar2.setSubtitle(hd.N0(i7, null));
        this.h.setTag(-33024);
        TLRPC.User user = this.d;
        if (user != null) {
            this.h.f19952a.f(user, new b9(0, this.d));
        } else {
            TLRPC.Chat chat = this.f19961c;
            if (chat != null) {
                this.h.f19952a.f(chat, new b9(this.f19961c));
            }
        }
        h51 h51Var = new h51(this, new a(this, 0), new b(this), new c(this, 0));
        this.f19963f = h51Var;
        h51Var.setClipToPadding(false);
        h51 h51Var2 = this.f19963f;
        c51 c51Var = h51Var2.f35790g3;
        c51Var.f34062r = false;
        c51Var.f34063s = true;
        h51Var2.r1();
        this.f19962e.addView(this.f19963f, ma.c(-1.0f, -1));
        this.f19962e.addView(this.actionBar, ma.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.f19962e;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        if (i7 == ls.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.f28435id;
            View B1 = this.f19963f.B1((int) (j3 ^ (j3 >>> 32)));
            if (B1 instanceof h6) {
                h6 h6Var = (h6) B1;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                if (arrayList != null) {
                    i11 = arrayList.size();
                } else {
                    i11 = 0;
                }
                h6Var.setSubLabel(hd.G(i11, "Chats", new Object[0]));
                return;
            }
            this.f19963f.f35790g3.O(false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f19960b = this.arguments.getLong("dialog_id", 0L);
        this.f19961c = getMessagesController().O0(Long.valueOf(-this.f19960b));
        this.d = getMessagesController().c2(Long.valueOf(this.f19960b));
        this.f19964n = getMessagesController().W7;
        np messagesController = getMessagesController();
        s6 s6Var = new s6(this, 14);
        int i7 = this.classGuid;
        messagesController.getClass();
        messagesController.getConnectionsManager().bindRequestToGuid(messagesController.getConnectionsManager().sendRequestTyped(new TL_communities.TL_communities_getJoinedCommunities(), new d3.b(1), new z3(4, messagesController, s6Var)), i7);
        ls notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar = new xi.e(notificationCenter, this);
        eVar.c(ls.T);
        this.f19965r = eVar;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        xi.e eVar = this.f19965r;
        if (eVar != null) {
            eVar.b();
            this.f19965r = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        super.onInsets(i7, i10, i11, i12);
        this.f19963f.setPadding(0, i10, 0, i12);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            ui.c cVar = this.f19959a;
            if (cVar != null) {
                cVar.a(getThemedColor(m6.f29381d6));
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
