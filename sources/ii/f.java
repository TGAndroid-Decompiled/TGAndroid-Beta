package ii;

import ai.f1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import hi.x3;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.y31;
public final class f extends f2 implements ls {
    public ri.c f15525a;
    public long f15526b;
    public TLRPC.Chat f15527c;
    public TLRPC.User d;
    public FrameLayout f15528e;
    public r41 f15529f;
    public e h;
    public ArrayList f15530n;
    public ab.b0 f15531r;

    public static void Z(f fVar, y31 y31Var) {
        f fVar2;
        if (y31Var.d == 1) {
            fVar2 = fVar;
            v4.O(fVar.getParentActivity(), fVar2, id.M0(2131751906, null), null, id.M0(2131751907, null), null, Integer.MAX_VALUE, id.M0(2131751753, null), fVar.resourceProvider, new b(fVar));
        } else {
            fVar2 = fVar;
        }
        Object obj = y31Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            fVar2.getMessagesController().M0(Long.valueOf(-fVar2.f15526b));
            fVar2.showDialog(new ki.a(fVar2.getParentActivity(), chat, fVar2.f15526b, new f1(20, fVar2, chat)));
        }
    }

    public final void a0(String str, boolean z9) {
        if (!t3.T(this.f15527c) && this.d == null) {
            u1 u1Var = new u1(3, getParentActivity(), null);
            u1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.f15526b, this, new a3.g(this, u1Var, str, z9, 2), null);
            return;
        }
        qp messagesController = getMessagesController();
        long j3 = this.f15526b;
        a aVar = new a(this, 1);
        messagesController.getClass();
        TL_communities.TL_communities_create tL_communities_create = new TL_communities.TL_communities_create();
        tL_communities_create.title = str;
        tL_communities_create.peer = messagesController.j1(j3);
        tL_communities_create.hidden = z9;
        messagesController.getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_create, new d3.b(1), new org.telegram.messenger.d(aVar, 5));
    }

    public final void b0(long j3, boolean z9) {
        if (!t3.T(this.f15527c) && this.d == null) {
            u1 u1Var = new u1(3, getParentActivity(), null);
            u1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.f15526b, this, new d(this, u1Var, j3, z9, 0), null);
            return;
        }
        int i7 = this.currentAccount;
        long j10 = -this.f15526b;
        qp.s1(i7).Q2(-j10, j3, false, z9, new g0(this, j10, 0));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setBackButtonDrawable(new y1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new bi.s(this, 5));
        ri.c cVar = new ri.c();
        cVar.a(getThemedColor(l6.f27865d6));
        this.f15525a = cVar;
        dh.c cVar2 = new dh.c(cVar, cVar, cVar);
        this.actionBar.setBackground(null);
        this.actionBar.N(cVar2, c8.g0.o(this.resourceProvider), false);
        this.actionBar.Q0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15528e = frameLayout;
        s6.h(l6.f27809a7, frameLayout, null);
        e eVar = new e(context, this.resourceProvider);
        this.h = eVar;
        eVar.setTitle(id.M0(2131751847, null));
        e eVar2 = this.h;
        if (this.d != null) {
            i7 = 2131751933;
        } else if (t3.V(this.f15527c)) {
            i7 = 2131751932;
        } else {
            i7 = 2131751931;
        }
        eVar2.setSubtitle(id.M0(i7, null));
        this.h.setTag(-33024);
        TLRPC.User user = this.d;
        if (user != null) {
            this.h.f15519a.e(user, new w8(0, this.d));
        } else {
            TLRPC.Chat chat = this.f15527c;
            if (chat != null) {
                this.h.f15519a.e(chat, new w8(this.f15527c));
            }
        }
        r41 r41Var = new r41(this, new a(this, 0), new b(this), new x3(this, 6));
        this.f15529f = r41Var;
        r41Var.setClipToPadding(false);
        r41 r41Var2 = this.f15529f;
        m41 m41Var = r41Var2.f37556f3;
        m41Var.f35945r = false;
        m41Var.f35946s = true;
        r41Var2.r1();
        this.f15528e.addView(this.f15529f, ha.c(-1.0f, -1));
        this.f15528e.addView(this.actionBar, ha.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.f15528e;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        if (i7 == qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.f26957id;
            View B1 = this.f15529f.B1((int) (j3 ^ (j3 >>> 32)));
            if (B1 instanceof g6) {
                g6 g6Var = (g6) B1;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                if (arrayList != null) {
                    i11 = arrayList.size();
                } else {
                    i11 = 0;
                }
                g6Var.setSubLabel(id.G(i11, "Chats", new Object[0]));
                return;
            }
            this.f15529f.f37556f3.O(false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f15526b = this.arguments.getLong("dialog_id", 0L);
        this.f15527c = getMessagesController().M0(Long.valueOf(-this.f15526b));
        this.d = getMessagesController().a2(Long.valueOf(this.f15526b));
        this.f15530n = getMessagesController().Q7;
        qp messagesController = getMessagesController();
        c cVar = new c(this, 0);
        int i7 = this.classGuid;
        messagesController.getClass();
        messagesController.getConnectionsManager().bindRequestToGuid(messagesController.getConnectionsManager().sendRequestTyped(new TL_communities.TL_communities_getJoinedCommunities(), new d3.b(1), new org.telegram.messenger.x3(4, messagesController, cVar)), i7);
        qs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        ab.b0 b0Var = new ab.b0(notificationCenter, this);
        b0Var.c(qs.T);
        this.f15531r = b0Var;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        ab.b0 b0Var = this.f15531r;
        if (b0Var != null) {
            b0Var.b();
            this.f15531r = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        super.onInsets(i7, i10, i11, i12);
        this.f15529f.setPadding(0, i10, 0, i12);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            ri.c cVar = this.f15525a;
            if (cVar != null) {
                cVar.a(getThemedColor(l6.f27865d6));
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
