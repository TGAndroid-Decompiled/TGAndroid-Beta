package ji;

import ai.g5;
import ai.o1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b8.cd;
import b8.mf;
import gi.j8;
import ii.y3;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.t3;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.ActionBar.w1;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.u8;
public final class e extends d2 implements cs {
    public si.c f16293a;
    public long f16294b;
    public TLRPC.Chat f16295c;
    public TLRPC.User d;
    public FrameLayout f16296e;
    public l41 f16297f;
    public d h;
    public ArrayList f16298n;
    public za.p f16299r;

    public static void Z(e eVar, r31 r31Var) {
        e eVar2;
        if (r31Var.d == 1) {
            eVar2 = eVar;
            t4.Q(eVar.getParentActivity(), eVar2, bd.M0(2131751906, null), null, bd.M0(2131751907, null), null, Integer.MAX_VALUE, bd.M0(2131751753, null), eVar.resourceProvider, new b(eVar));
        } else {
            eVar2 = eVar;
        }
        Object obj = r31Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            eVar2.getMessagesController().M0(Long.valueOf(-eVar2.f16294b));
            eVar2.showDialog(new li.a(eVar2.getParentActivity(), chat, eVar2.f16294b, new o1(24, eVar2, chat)));
        }
    }

    public final void a0(String str, boolean z10) {
        if (!t3.T(this.f16295c) && this.d == null) {
            s1 s1Var = new s1(3, getParentActivity(), null);
            s1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.f16294b, this, new ga.b(this, s1Var, str, z10, 1), null);
            return;
        }
        hp messagesController = getMessagesController();
        long j10 = this.f16294b;
        a aVar = new a(this, 1);
        messagesController.getClass();
        TL_communities.TL_communities_create tL_communities_create = new TL_communities.TL_communities_create();
        tL_communities_create.title = str;
        tL_communities_create.peer = messagesController.j1(j10);
        tL_communities_create.hidden = z10;
        messagesController.getConnectionsManager().sendRequestTypedAndProcessUpdates(tL_communities_create, new c3.b(1), new org.telegram.messenger.d(aVar, 5));
    }

    public final void b0(long j10, boolean z10) {
        if (!t3.T(this.f16295c) && this.d == null) {
            s1 s1Var = new s1(3, getParentActivity(), null);
            s1Var.r(250L);
            getMessagesController().T(getParentActivity(), -this.f16294b, this, new c(this, s1Var, j10, z10, 0), null);
            return;
        }
        int i3 = this.currentAccount;
        long j11 = -this.f16294b;
        hp.s1(i3).Q2(-j11, j10, false, z10, new ai.r(this, j11, 1));
    }

    @Override
    public final View createView(Context context) {
        int i3;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setBackButtonDrawable(new w1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new g5(this, 6));
        si.c cVar = new si.c();
        cVar.a(getThemedColor(k6.f27878d6));
        this.f16293a = cVar;
        eh.c cVar2 = new eh.c(cVar, cVar, cVar);
        this.actionBar.setBackground(null);
        this.actionBar.M(cVar2, cd.p(this.resourceProvider), false);
        this.actionBar.R0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f16296e = frameLayout;
        r6.i(k6.f27824a7, frameLayout, null);
        d dVar = new d(context, this.resourceProvider);
        this.h = dVar;
        dVar.setTitle(bd.M0(2131751847, null));
        d dVar2 = this.h;
        if (this.d != null) {
            i3 = 2131751933;
        } else if (t3.V(this.f16295c)) {
            i3 = 2131751932;
        } else {
            i3 = 2131751931;
        }
        dVar2.setSubtitle(bd.M0(i3, null));
        this.h.setTag(-33024);
        TLRPC.User user = this.d;
        if (user != null) {
            this.h.f16286a.e(user, new u8(0, this.d));
        } else {
            TLRPC.Chat chat = this.f16295c;
            if (chat != null) {
                this.h.f16286a.e(chat, new u8(this.f16295c));
            }
        }
        l41 l41Var = new l41(this, new a(this, 0), new b(this), new y3(this, 4));
        this.f16297f = l41Var;
        l41Var.setClipToPadding(false);
        l41 l41Var2 = this.f16297f;
        f41 f41Var = l41Var2.f35594g3;
        f41Var.f33698r = false;
        f41Var.f33699s = true;
        l41Var2.r1();
        this.f16296e.addView(this.f16297f, mf.c(-1.0f, -1));
        this.f16296e.addView(this.actionBar, mf.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.f16296e;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11;
        if (i3 == hs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.f27002id;
            View B1 = this.f16297f.B1((int) (j10 ^ (j10 >>> 32)));
            if (B1 instanceof f6) {
                f6 f6Var = (f6) B1;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                if (arrayList != null) {
                    i11 = arrayList.size();
                } else {
                    i11 = 0;
                }
                f6Var.setSubLabel(bd.G(i11, "Chats", new Object[0]));
                return;
            }
            this.f16297f.f35594g3.O(false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f16294b = this.arguments.getLong("dialog_id", 0L);
        this.f16295c = getMessagesController().M0(Long.valueOf(-this.f16294b));
        this.d = getMessagesController().a2(Long.valueOf(this.f16294b));
        this.f16298n = getMessagesController().Q7;
        hp messagesController = getMessagesController();
        j8 j8Var = new j8(this, 3);
        int i3 = this.classGuid;
        messagesController.getClass();
        messagesController.getConnectionsManager().bindRequestToGuid(messagesController.getConnectionsManager().sendRequestTyped(new TL_communities.TL_communities_getJoinedCommunities(), new c3.b(1), new x3(3, messagesController, j8Var)), i3);
        hs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        za.p pVar = new za.p(notificationCenter, this);
        pVar.b(hs.T);
        this.f16299r = pVar;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        za.p pVar = this.f16299r;
        if (pVar != null) {
            pVar.a();
            this.f16299r = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        super.onInsets(i3, i10, i11, i12);
        this.f16297f.setPadding(0, i10, 0, i12);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            si.c cVar = this.f16293a;
            if (cVar != null) {
                cVar.a(getThemedColor(k6.f27878d6));
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
