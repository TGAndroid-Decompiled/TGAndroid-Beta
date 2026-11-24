package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class io2 extends d implements jm7 {
    public kz4 a;
    public long b;
    public TLRPC.Chat c;
    public TLRPC.User d;
    public FrameLayout e;
    public q7c f;
    public ho2 h;
    public ArrayList n;
    public e7a r;

    public final void Z(String str, boolean z) {
        if (!sd2.T(this.c) && this.d == null) {
            he heVar = new he(3, null, getParentActivity());
            heVar.q(250L);
            getMessagesController().P(getParentActivity(), -this.b, this, new wg(this, heVar, str, z, (byte) 2), null);
            return;
        }
        oc7 messagesController = getMessagesController();
        long j = this.b;
        eo2 eo2Var = new eo2(this, (byte) 1);
        messagesController.getClass();
        TL_communities.TL_communities_create tL_communities_create = new TL_communities.TL_communities_create();
        tL_communities_create.title = str;
        tL_communities_create.peer = messagesController.i1(j);
        tL_communities_create.hidden = z;
        messagesController.getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_create, new kc((byte) 0), new vt4(eo2Var, (byte) 19));
    }

    public final void a0(long j, boolean z) {
        if (!sd2.T(this.c) && this.d == null) {
            he heVar = new he(3, null, getParentActivity());
            heVar.q(250L);
            getMessagesController().P(getParentActivity(), -this.b, this, new go2(this, heVar, j, z, (byte) 0), null);
            return;
        }
        int i = this.currentAccount;
        long j2 = -this.b;
        oc7.r1(i).V2(-j2, j, false, z, new jz(this, j2, (byte) 1));
    }

    public final void b0(c6c c6cVar) {
        io2 io2Var;
        if (c6cVar.d == 1) {
            io2Var = this;
            ik.O(getParentActivity(), io2Var, jb6.M0(2131751843, null), null, jb6.M0(2131751844, null), null, Integer.MAX_VALUE, jb6.M0(2131751690, null), this.resourceProvider, new fo2(this));
        } else {
            io2Var = this;
        }
        Object obj = c6cVar.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            io2Var.getMessagesController().L0(Long.valueOf(-io2Var.b));
            io2Var.showDialog(new co2(io2Var.getParentActivity(), chat, io2Var.b, new qy1(io2Var, chat, (byte) 8)));
        }
    }

    @Override
    public final View createView(Context context) {
        int i;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setBackButtonDrawable(new ee0(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 1));
        kz4 kz4Var = new kz4();
        kz4Var.a(getThemedColor(cmb.c6));
        this.a = kz4Var;
        km0 km0Var = new km0(kz4Var, kz4Var, kz4Var);
        this.actionBar.setBackground(null);
        this.actionBar.P(km0Var, qqd.o(this.resourceProvider), false);
        this.actionBar.R0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        anb.h(cmb.Z6, null, frameLayout);
        ho2 ho2Var = new ho2(context, this.resourceProvider);
        this.h = ho2Var;
        ho2Var.setTitle(jb6.M0(2131751784, null));
        ho2 ho2Var2 = this.h;
        if (this.d != null) {
            i = 2131751870;
        } else if (sd2.V(this.c)) {
            i = 2131751869;
        } else {
            i = 2131751868;
        }
        ho2Var2.setSubtitle(jb6.M0(i, null));
        this.h.setTag(-33024);
        TLRPC.User user = this.d;
        if (user != null) {
            this.h.a.f(user, new pc0(0, this.d));
        } else {
            TLRPC.Chat chat = this.c;
            if (chat != null) {
                this.h.a.f(chat, new pc0(this.c));
            }
        }
        q7c q7cVar = new q7c(this, new eo2(this, (byte) 0), new fo2(this), new a32(this, (byte) 21));
        this.f = q7cVar;
        q7cVar.setClipToPadding(false);
        q7c q7cVar2 = this.f;
        l7c l7cVar = q7cVar2.g3;
        l7cVar.r = false;
        l7cVar.s = true;
        q7cVar2.r1();
        this.e.addView(this.f, qoe.c(-1.0f, -1));
        this.e.addView(this.actionBar, qoe.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.e;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        if (i == nm7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j = chatFull.id;
            View B1 = this.f.B1((int) (j ^ (j >>> 32)));
            if (B1 instanceof ut8) {
                ut8 ut8Var = (ut8) B1;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                if (arrayList != null) {
                    i3 = arrayList.size();
                } else {
                    i3 = 0;
                }
                ut8Var.setSubLabel(jb6.G(i3, "Chats", new Object[0]));
                return;
            }
            this.f.g3.O(false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("dialog_id", 0L);
        this.c = getMessagesController().L0(Long.valueOf(-this.b));
        this.d = getMessagesController().W1(Long.valueOf(this.b));
        this.n = getMessagesController().G4;
        oc7 messagesController = getMessagesController();
        mf2 mf2Var = new mf2(this, (byte) 26);
        int i = this.classGuid;
        messagesController.getClass();
        messagesController.getConnectionsManager().bindRequestToGuid(messagesController.getConnectionsManager().sendRequestTyped(new TL_communities.TL_communities_getJoinedCommunities(), new kc((byte) 0), new s87(messagesController, mf2Var, (byte) 3)), i);
        nm7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        e7a e7aVar = new e7a(notificationCenter, this);
        e7aVar.b(nm7.T);
        this.r = e7aVar;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        e7a e7aVar = this.r;
        if (e7aVar != null) {
            e7aVar.a();
            this.r = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        super.onInsets(i, i2, i3, i4);
        this.f.setPadding(0, i2, 0, i4);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            kz4 kz4Var = this.a;
            if (kz4Var != null) {
                kz4Var.a(getThemedColor(cmb.c6));
            }
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
