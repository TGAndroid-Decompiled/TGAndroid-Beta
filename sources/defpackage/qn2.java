package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class qn2 extends e implements fn7 {
    public oz4 a;
    public long b;
    public TLRPC.Chat c;
    public TLRPC.User d;
    public FrameLayout e;
    public q9c f;
    public pn2 h;
    public ArrayList n;
    public u8a r;

    public final void Y(String str, boolean z) {
        if (!xc2.T(this.c) && this.d == null) {
            id idVar = new id(3, null, getParentActivity());
            idVar.q(250L);
            getMessagesController().R(getParentActivity(), -this.b, this, new ag(this, idVar, str, z, (byte) 2), null);
            return;
        }
        uc7 messagesController = getMessagesController();
        long j = this.b;
        mn2 mn2Var = new mn2(this, (byte) 1);
        messagesController.getClass();
        TL_communities.TL_communities_create tL_communities_create = new TL_communities.TL_communities_create();
        tL_communities_create.title = str;
        tL_communities_create.peer = messagesController.j1(j);
        tL_communities_create.hidden = z;
        messagesController.getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_create, new ic((byte) 0), new yt4(mn2Var, (byte) 19));
    }

    public final void Z(long j, boolean z) {
        if (!xc2.T(this.c) && this.d == null) {
            id idVar = new id(3, null, getParentActivity());
            idVar.q(250L);
            getMessagesController().R(getParentActivity(), -this.b, this, new on2(this, idVar, j, z, (byte) 0), null);
            return;
        }
        int i = this.currentAccount;
        long j2 = -this.b;
        uc7.s1(i).Z2(-j2, j, false, z, new ky(this, j2, (byte) 1));
    }

    public final void a0(b8c b8cVar) {
        qn2 qn2Var;
        if (b8cVar.d == 1) {
            qn2Var = this;
            jj.O(getParentActivity(), qn2Var, ob6.M0(2131751871, null), null, ob6.M0(2131751872, null), null, Integer.MAX_VALUE, ob6.M0(2131751718, null), this.resourceProvider, new nn2(this));
        } else {
            qn2Var = this;
        }
        Object obj = b8cVar.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            qn2Var.getMessagesController().M0(Long.valueOf(-qn2Var.b));
            qn2Var.showDialog(new kn2(qn2Var.getParentActivity(), chat, qn2Var.b, new rx1(qn2Var, chat, (byte) 8)));
        }
    }

    @Override
    public final View createView(Context context) {
        int i;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setBackButtonDrawable(new gd0(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 1));
        oz4 oz4Var = new oz4();
        oz4Var.a(getThemedColor(aob.d6));
        this.a = oz4Var;
        ll0 ll0Var = new ll0(oz4Var, oz4Var, oz4Var);
        this.actionBar.setBackground(null);
        this.actionBar.P(ll0Var, dtd.o(this.resourceProvider), false);
        this.actionBar.R0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        yob.h(aob.a7, null, frameLayout);
        pn2 pn2Var = new pn2(context, this.resourceProvider);
        this.h = pn2Var;
        pn2Var.setTitle(ob6.M0(2131751812, null));
        pn2 pn2Var2 = this.h;
        if (this.d != null) {
            i = 2131751898;
        } else if (xc2.V(this.c)) {
            i = 2131751897;
        } else {
            i = 2131751896;
        }
        pn2Var2.setSubtitle(ob6.M0(i, null));
        this.h.setTag(-33024);
        TLRPC.User user = this.d;
        if (user != null) {
            this.h.a.f(user, new rb0(0, this.d));
        } else {
            TLRPC.Chat chat = this.c;
            if (chat != null) {
                this.h.a.f(chat, new rb0(this.c));
            }
        }
        q9c q9cVar = new q9c(this, new mn2(this, (byte) 0), new nn2(this), new c22(this, (byte) 25));
        this.f = q9cVar;
        q9cVar.setClipToPadding(false);
        q9c q9cVar2 = this.f;
        l9c l9cVar = q9cVar2.g3;
        l9cVar.r = false;
        l9cVar.s = true;
        q9cVar2.s1();
        this.e.addView(this.f, tre.c(-1.0f, -1));
        this.e.addView(this.actionBar, tre.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.e;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        if (i == jn7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j = chatFull.id;
            View C1 = this.f.C1((int) (j ^ (j >>> 32)));
            if (C1 instanceof bv8) {
                bv8 bv8Var = (bv8) C1;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                if (arrayList != null) {
                    i3 = arrayList.size();
                } else {
                    i3 = 0;
                }
                bv8Var.setSubLabel(ob6.G(i3, "Chats", new Object[0]));
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
        this.c = getMessagesController().M0(Long.valueOf(-this.b));
        this.d = getMessagesController().X1(Long.valueOf(this.b));
        this.n = getMessagesController().F4;
        uc7 messagesController = getMessagesController();
        te2 te2Var = new te2(this, (byte) 26);
        int i = this.classGuid;
        messagesController.getClass();
        messagesController.getConnectionsManager().bindRequestToGuid(messagesController.getConnectionsManager().sendRequestTyped(new TL_communities.TL_communities_getJoinedCommunities(), new ic((byte) 0), new ia7(messagesController, te2Var, (byte) 0)), i);
        jn7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        u8a u8aVar = new u8a(notificationCenter, this);
        u8aVar.b(jn7.T);
        this.r = u8aVar;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        u8a u8aVar = this.r;
        if (u8aVar != null) {
            u8aVar.a();
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
            oz4 oz4Var = this.a;
            if (oz4Var != null) {
                oz4Var.a(getThemedColor(aob.d6));
            }
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
