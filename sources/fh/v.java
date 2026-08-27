package fh;

import ag.z2;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MemberRequestsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Cells.d5;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.zk0;

public abstract class v implements c5 {

    public final boolean f6173a;

    public boolean f6174b;

    public final n2 f6178g;
    public final FrameLayout h;

    public final MemberRequestsController f6179i;

    public final long f6180j;

    public final int f6181k;

    public final boolean f6182l;

    public FrameLayout f6183m;

    public iw0 f6184n;

    public iw0 f6185o;

    public zk0 f6186p;

    public h00 f6187q;

    public TLRPC.TL_chatInviteImporter f6188r;

    public u f6189s;

    public String f6190t;

    public i f6191u;
    public int v;

    public boolean f6192w;

    public boolean f6194y;

    public boolean f6195z;

    public final ArrayList f6175c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();

    public final ArrayList f6176e = new ArrayList();

    public final n f6177f = new n(this);

    public boolean f6193x = true;
    public boolean A = true;
    public boolean B = true;
    public final i C = new i(this, 0);
    public final z2 D = new z2(this, 3);

    public v(n2 n2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.f6178g = n2Var;
        this.h = frameLayout;
        this.f6180j = j10;
        int currentAccount = n2Var.getCurrentAccount();
        this.f6181k = currentAccount;
        this.f6173a = ChatObject.isChannelAndNotMegaGroup(j10, currentAccount);
        this.f6182l = z10;
        this.f6179i = MemberRequestsController.getInstance(currentAccount);
    }

    public static void k(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        boolean z12 = view.getVisibility() == 0;
        float f10 = z10 ? 1.0f : 0.0f;
        if (z10 == z12 && f10 == view.getAlpha()) {
            return;
        }
        if (!z11) {
            view.setVisibility(z10 ? 0 : 4);
            return;
        }
        if (z10) {
            view.setAlpha(0.0f);
        }
        view.setVisibility(0);
        view.animate().alpha(f10).setDuration(150L).start();
    }

    public final iw0 a() {
        if (this.f6184n == null) {
            n2 n2Var = this.f6178g;
            iw0 iw0Var = new iw0(n2Var.getParentActivity(), null, 16, n2Var.getResourceProvider());
            this.f6184n = iw0Var;
            boolean z10 = this.f6173a;
            iw0Var.d.setText(LocaleController.getString(z10 ? R.string.NoSubscribeRequests : R.string.NoMemberRequests));
            this.f6184n.f29506e.setText(LocaleController.getString(z10 ? R.string.NoSubscribeRequestsDescription : R.string.NoMemberRequestsDescription));
            this.f6184n.setAnimateLayoutChange(true);
            this.f6184n.setVisibility(8);
        }
        return this.f6184n;
    }

    public final h00 b() {
        if (this.f6187q == null) {
            n2 n2Var = this.f6178g;
            h00 h00Var = new h00(n2Var.getParentActivity(), n2Var.getResourceProvider());
            this.f6187q = h00Var;
            h00Var.setAlpha(0.0f);
            if (this.B) {
                this.f6187q.setBackgroundColor(g6.v0(g6.f23053d6, n2Var.getResourceProvider()));
            }
            this.f6187q.f(g6.f23053d6, g6.f22999a7, -1);
            this.f6187q.setViewType(15);
            this.f6187q.setMemberRequestButton(this.f6173a);
        }
        return this.f6187q;
    }

    public final iw0 c() {
        if (this.f6185o == null) {
            n2 n2Var = this.f6178g;
            iw0 iw0Var = new iw0(n2Var.getParentActivity(), null, 1, n2Var.getResourceProvider());
            this.f6185o = iw0Var;
            if (this.B) {
                iw0Var.setBackgroundColor(g6.v0(g6.f23053d6, n2Var.getResourceProvider()));
            }
            this.f6185o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f6185o.f29506e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f6185o.setAnimateLayoutChange(true);
            this.f6185o.setVisibility(8);
        }
        return this.f6185o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f6181k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f6180j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new g(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f6179i.getCachedImporters(this.f6180j)) != null) {
            this.f6195z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new f(0, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f6176e;
        if (zIsEmpty) {
            z12 = !arrayList.isEmpty() || z10;
            iw0 iw0Var = this.f6184n;
            if (iw0Var != null) {
                iw0Var.setVisibility(z12 ? 4 : 0);
            }
            iw0 iw0Var2 = this.f6185o;
            if (iw0Var2 != null) {
                iw0Var2.setVisibility(4);
            }
        } else {
            z12 = !this.f6175c.isEmpty() || z10;
            iw0 iw0Var3 = this.f6184n;
            if (iw0Var3 != null) {
                iw0Var3.setVisibility(4);
            }
            iw0 iw0Var4 = this.f6185o;
            if (iw0Var4 != null) {
                iw0Var4.setVisibility(z12 ? 4 : 0);
            }
        }
        k(this.f6186p, z12, true);
        if (arrayList.isEmpty()) {
            iw0 iw0Var5 = this.f6184n;
            if (iw0Var5 != null) {
                iw0Var5.setVisibility(0);
            }
            iw0 iw0Var6 = this.f6185o;
            if (iw0Var6 != null) {
                iw0Var6.setVisibility(4);
            }
            k(this.f6187q, false, false);
            if (this.f6194y && this.f6182l) {
                this.f6178g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters, String str, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        ArrayList arrayList = this.f6175c;
        boolean z14 = !arrayList.isEmpty() && this.f6193x;
        for (int i10 = 0; i10 < tL_messages_chatInviteImporters.users.size(); i10++) {
            TLRPC.User user = tL_messages_chatInviteImporters.users.get(i10);
            this.d.put(user.f22527id, user);
        }
        n nVar = this.f6177f;
        if (z10) {
            nVar.E(tL_messages_chatInviteImporters.importers);
        } else {
            if (tL_messages_chatInviteImporters.importers.size() <= 0) {
                z12 = false;
            } else if (tL_messages_chatInviteImporters.importers.size() + arrayList.size() < tL_messages_chatInviteImporters.count) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                nVar.u(arrayList.size() + (!this.B ? 1 : 0));
            }
            ArrayList<TLRPC.TL_chatInviteImporter> arrayList2 = tL_messages_chatInviteImporters.importers;
            v vVar = nVar.f6146c;
            ArrayList arrayList3 = vVar.f6175c;
            int i11 = 0;
            while (i11 < arrayList2.size()) {
                long j10 = arrayList2.get(i11).user_id;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i12)).user_id == j10) {
                        arrayList2.remove(i11);
                        i11--;
                        break;
                    }
                }
                i11++;
            }
            arrayList3.addAll(arrayList2);
            nVar.s((arrayList3.size() + (!vVar.B ? 1 : 0)) - arrayList2.size(), arrayList2.size());
            if (z12) {
                nVar.o(arrayList.size() + (!this.B ? 1 : 0));
            }
        }
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList4 = this.f6176e;
            if (z10) {
                arrayList4.clear();
            }
            arrayList4.addAll(tL_messages_chatInviteImporters.importers);
            if (this.f6182l) {
                z13 = false;
                this.f6178g.getActionBar().n().k(0).setVisibility(arrayList4.isEmpty() ? 8 : 0);
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        f(str, z11, z13);
        this.f6193x = arrayList.size() < tL_messages_chatInviteImporters.count;
        if (z14 != (!arrayList.isEmpty() && this.f6193x)) {
            if (this.f6193x) {
                nVar.o(nVar.h() - 1);
            } else {
                nVar.u(nVar.h());
            }
        }
    }

    public final void h(View view) {
        if (view instanceof d5) {
            if (this.f6194y) {
                AndroidUtilities.hideKeyboard(this.f6178g.getParentActivity().getCurrentFocus());
            }
            AndroidUtilities.runOnUIThread(new d5.u(9, this, (d5) view), this.f6194y ? 100L : 0L);
        }
    }

    public final void i(boolean z10) {
        int i10;
        zk0 zk0Var = this.f6186p;
        if (zk0Var == null || (i10 = !this.f6177f.f6146c.B ? 1 : 0) < 0 || i10 >= zk0Var.getChildCount()) {
            return;
        }
        this.f6186p.getChildAt(i10).setEnabled(z10);
    }

    public final void j(String str) {
        if (this.f6191u != null) {
            Utilities.searchQueue.cancelRunnable(this.f6191u);
            this.f6191u = null;
        }
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f6181k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f6190t = str;
        if (this.f6195z && this.f6176e.isEmpty()) {
            k(this.f6187q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f6177f.E(this.f6176e);
            k(this.f6186p, true, true);
            k(this.f6187q, false, false);
            iw0 iw0Var = this.f6185o;
            if (iw0Var != null) {
                iw0Var.setVisibility(4);
            }
            if (str == null && this.f6182l) {
                this.f6178g.getActionBar().n().k(0).setVisibility(this.f6176e.isEmpty() ? 8 : 0);
            }
        } else {
            this.f6177f.E(Collections.EMPTY_LIST);
            k(this.f6186p, false, false);
            k(this.f6187q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            i iVar = new i(this, 2);
            this.f6191u = iVar;
            dispatchQueue.postRunnable(iVar, 300L);
        }
        if (str != null) {
            iw0 iw0Var2 = this.f6184n;
            if (iw0Var2 != null) {
                iw0Var2.setVisibility(4);
            }
            iw0 iw0Var3 = this.f6185o;
            if (iw0Var3 != null) {
                iw0Var3.setVisibility(4);
            }
        }
    }
}
