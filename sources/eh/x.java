package eh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.wk0;
public abstract class x implements f5 {
    public final boolean f5246a;
    public boolean f5247b;
    public final o2 f5251g;
    public final FrameLayout h;
    public final MemberRequestsController f5252i;
    public final long f5253j;
    public final int f5254k;
    public final boolean f5255l;
    public FrameLayout f5256m;
    public gw0 f5257n;
    public gw0 f5258o;
    public wk0 f5259p;
    public e00 f5260q;
    public TLRPC.TL_chatInviteImporter f5261r;
    public w f5262s;
    public String f5263t;
    public i f5264u;
    public int v;
    public boolean f5265w;
    public boolean f5267y;
    public boolean f5268z;
    public final ArrayList f5248c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f5249e = new ArrayList();
    public final p f5250f = new p(this);
    public boolean f5266x = true;
    public boolean A = true;
    public boolean B = true;
    public final i C = new i(this, 0);
    public final bg.o2 D = new bg.o2(this, 2);

    public x(o2 o2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.f5251g = o2Var;
        this.h = frameLayout;
        this.f5253j = j10;
        int currentAccount = o2Var.getCurrentAccount();
        this.f5254k = currentAccount;
        this.f5246a = ChatObject.isChannelAndNotMegaGroup(j10, currentAccount);
        this.f5255l = z10;
        this.f5252i = MemberRequestsController.getInstance(currentAccount);
    }

    public static void k(View view, boolean z10, boolean z11) {
        boolean z12;
        float f10;
        if (view != null) {
            int i9 = 0;
            if (view.getVisibility() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (z10 == z12 && f10 == view.getAlpha()) {
                return;
            }
            if (z11) {
                if (z10) {
                    view.setAlpha(0.0f);
                }
                view.setVisibility(0);
                view.animate().alpha(f10).setDuration(150L).start();
                return;
            }
            if (!z10) {
                i9 = 4;
            }
            view.setVisibility(i9);
        }
    }

    public final gw0 a() {
        int i9;
        int i10;
        if (this.f5257n == null) {
            o2 o2Var = this.f5251g;
            gw0 gw0Var = new gw0(o2Var.getParentActivity(), null, 16, o2Var.getResourceProvider());
            this.f5257n = gw0Var;
            boolean z10 = this.f5246a;
            if (z10) {
                i9 = R.string.NoSubscribeRequests;
            } else {
                i9 = R.string.NoMemberRequests;
            }
            gw0Var.d.setText(LocaleController.getString(i9));
            l80 l80Var = this.f5257n.f28885e;
            if (z10) {
                i10 = R.string.NoSubscribeRequestsDescription;
            } else {
                i10 = R.string.NoMemberRequestsDescription;
            }
            l80Var.setText(LocaleController.getString(i10));
            this.f5257n.setAnimateLayoutChange(true);
            this.f5257n.setVisibility(8);
        }
        return this.f5257n;
    }

    public final e00 b() {
        if (this.f5260q == null) {
            o2 o2Var = this.f5251g;
            e00 e00Var = new e00(o2Var.getParentActivity(), o2Var.getResourceProvider());
            this.f5260q = e00Var;
            e00Var.setAlpha(0.0f);
            if (this.B) {
                this.f5260q.setBackgroundColor(f6.v0(f6.f23001d6, o2Var.getResourceProvider()));
            }
            this.f5260q.f(f6.f23001d6, f6.f22947a7, -1);
            this.f5260q.setViewType(15);
            this.f5260q.setMemberRequestButton(this.f5246a);
        }
        return this.f5260q;
    }

    public final gw0 c() {
        if (this.f5258o == null) {
            o2 o2Var = this.f5251g;
            gw0 gw0Var = new gw0(o2Var.getParentActivity(), null, 1, o2Var.getResourceProvider());
            this.f5258o = gw0Var;
            if (this.B) {
                gw0Var.setBackgroundColor(f6.v0(f6.f23001d6, o2Var.getResourceProvider()));
            }
            this.f5258o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f5258o.f28885e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f5258o.setAnimateLayoutChange(true);
            this.f5258o.setVisibility(8);
        }
        return this.f5258o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i9 = this.f5254k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i9).getInputPeer(-this.f5253j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i9).getInputUser(user);
        ConnectionsManager.getInstance(i9).sendRequest(tL_messages_hideChatJoinRequest, new g(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f5252i.getCachedImporters(this.f5253j)) != null) {
            this.f5268z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new f(0, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        int i9;
        int i10;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f5249e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            gw0 gw0Var = this.f5257n;
            if (gw0Var != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                gw0Var.setVisibility(i10);
            }
            gw0 gw0Var2 = this.f5258o;
            if (gw0Var2 != null) {
                gw0Var2.setVisibility(4);
            }
        } else {
            if (this.f5248c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            gw0 gw0Var3 = this.f5257n;
            if (gw0Var3 != null) {
                gw0Var3.setVisibility(4);
            }
            gw0 gw0Var4 = this.f5258o;
            if (gw0Var4 != null) {
                if (z12) {
                    i9 = 4;
                } else {
                    i9 = 0;
                }
                gw0Var4.setVisibility(i9);
            }
        }
        k(this.f5259p, z12, true);
        if (arrayList.isEmpty()) {
            gw0 gw0Var5 = this.f5257n;
            if (gw0Var5 != null) {
                gw0Var5.setVisibility(0);
            }
            gw0 gw0Var6 = this.f5258o;
            if (gw0Var6 != null) {
                gw0Var6.setVisibility(4);
            }
            k(this.f5260q, false, false);
            if (this.f5267y && this.f5255l) {
                this.f5251g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: eh.x.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j10;
        if (view instanceof g5) {
            if (this.f5267y) {
                AndroidUtilities.hideKeyboard(this.f5251g.getParentActivity().getCurrentFocus());
            }
            e5.u uVar = new e5.u(3, this, (g5) view);
            if (this.f5267y) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(uVar, j10);
        }
    }

    public final void i(boolean z10) {
        int i9;
        wk0 wk0Var = this.f5259p;
        if (wk0Var != null && (i9 = !this.f5250f.f5219c.B ? 1 : 0) >= 0 && i9 < wk0Var.getChildCount()) {
            this.f5259p.getChildAt(i9).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f5264u != null) {
            Utilities.searchQueue.cancelRunnable(this.f5264u);
            this.f5264u = null;
        }
        int i9 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f5254k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f5263t = str;
        if (this.f5268z && this.f5249e.isEmpty()) {
            k(this.f5260q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f5250f.E(this.f5249e);
            k(this.f5259p, true, true);
            k(this.f5260q, false, false);
            gw0 gw0Var = this.f5258o;
            if (gw0Var != null) {
                gw0Var.setVisibility(4);
            }
            if (str == null && this.f5255l) {
                w0 k10 = this.f5251g.getActionBar().n().k(0);
                if (this.f5249e.isEmpty()) {
                    i9 = 8;
                }
                k10.setVisibility(i9);
            }
        } else {
            this.f5250f.E(Collections.EMPTY_LIST);
            k(this.f5259p, false, false);
            k(this.f5260q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            i iVar = new i(this, 2);
            this.f5264u = iVar;
            dispatchQueue.postRunnable(iVar, 300L);
        }
        if (str != null) {
            gw0 gw0Var2 = this.f5257n;
            if (gw0Var2 != null) {
                gw0Var2.setVisibility(4);
            }
            gw0 gw0Var3 = this.f5258o;
            if (gw0Var3 != null) {
                gw0Var3.setVisibility(4);
            }
        }
    }
}
