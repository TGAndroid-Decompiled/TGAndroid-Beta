package hh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import cg.g2;
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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Cells.d5;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.y80;
public abstract class v implements d5 {
    public final boolean f8120a;
    public boolean f8121b;
    public final o2 f8125g;
    public final FrameLayout h;
    public final MemberRequestsController f8126i;
    public final long f8127j;
    public final int f8128k;
    public final boolean f8129l;
    public FrameLayout f8130m;
    public qw0 f8131n;
    public qw0 f8132o;
    public jl0 f8133p;
    public p00 f8134q;
    public TLRPC.TL_chatInviteImporter f8135r;
    public u f8136s;
    public String f8137t;
    public i f8138u;
    public int v;
    public boolean f8139w;
    public boolean f8141y;
    public boolean f8142z;
    public final ArrayList f8122c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f8123e = new ArrayList();
    public final n f8124f = new n(this);
    public boolean f8140x = true;
    public boolean A = true;
    public boolean B = true;
    public final i C = new i(this, 0);
    public final g2 D = new g2(this, 3);

    public v(o2 o2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.f8125g = o2Var;
        this.h = frameLayout;
        this.f8127j = j10;
        int currentAccount = o2Var.getCurrentAccount();
        this.f8128k = currentAccount;
        this.f8120a = ChatObject.isChannelAndNotMegaGroup(j10, currentAccount);
        this.f8129l = z10;
        this.f8126i = MemberRequestsController.getInstance(currentAccount);
    }

    public static void k(View view, boolean z10, boolean z11) {
        boolean z12;
        float f9;
        if (view != null) {
            int i10 = 0;
            if (view.getVisibility() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            if (z10 == z12 && f9 == view.getAlpha()) {
                return;
            }
            if (z11) {
                if (z10) {
                    view.setAlpha(0.0f);
                }
                view.setVisibility(0);
                view.animate().alpha(f9).setDuration(150L).start();
                return;
            }
            if (!z10) {
                i10 = 4;
            }
            view.setVisibility(i10);
        }
    }

    public final qw0 a() {
        int i10;
        int i11;
        if (this.f8131n == null) {
            o2 o2Var = this.f8125g;
            qw0 qw0Var = new qw0(o2Var.getParentActivity(), null, 16, o2Var.getResourceProvider());
            this.f8131n = qw0Var;
            boolean z10 = this.f8120a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            qw0Var.d.setText(LocaleController.getString(i10));
            y80 y80Var = this.f8131n.f32122e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            y80Var.setText(LocaleController.getString(i11));
            this.f8131n.setAnimateLayoutChange(true);
            this.f8131n.setVisibility(8);
        }
        return this.f8131n;
    }

    public final p00 b() {
        if (this.f8134q == null) {
            o2 o2Var = this.f8125g;
            p00 p00Var = new p00(o2Var.getParentActivity(), o2Var.getResourceProvider());
            this.f8134q = p00Var;
            p00Var.setAlpha(0.0f);
            if (this.B) {
                this.f8134q.setBackgroundColor(g6.v0(g6.f23062d6, o2Var.getResourceProvider()));
            }
            this.f8134q.f(g6.f23062d6, g6.f23009a7, -1);
            this.f8134q.setViewType(15);
            this.f8134q.setMemberRequestButton(this.f8120a);
        }
        return this.f8134q;
    }

    public final qw0 c() {
        if (this.f8132o == null) {
            o2 o2Var = this.f8125g;
            qw0 qw0Var = new qw0(o2Var.getParentActivity(), null, 1, o2Var.getResourceProvider());
            this.f8132o = qw0Var;
            if (this.B) {
                qw0Var.setBackgroundColor(g6.v0(g6.f23062d6, o2Var.getResourceProvider()));
            }
            this.f8132o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f8132o.f32122e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f8132o.setAnimateLayoutChange(true);
            this.f8132o.setVisibility(8);
        }
        return this.f8132o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f8128k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f8127j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new g(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f8126i.getCachedImporters(this.f8127j)) != null) {
            this.f8142z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new f(0, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f8123e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            qw0 qw0Var = this.f8131n;
            if (qw0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                qw0Var.setVisibility(i11);
            }
            qw0 qw0Var2 = this.f8132o;
            if (qw0Var2 != null) {
                qw0Var2.setVisibility(4);
            }
        } else {
            if (this.f8122c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            qw0 qw0Var3 = this.f8131n;
            if (qw0Var3 != null) {
                qw0Var3.setVisibility(4);
            }
            qw0 qw0Var4 = this.f8132o;
            if (qw0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                qw0Var4.setVisibility(i10);
            }
        }
        k(this.f8133p, z12, true);
        if (arrayList.isEmpty()) {
            qw0 qw0Var5 = this.f8131n;
            if (qw0Var5 != null) {
                qw0Var5.setVisibility(0);
            }
            qw0 qw0Var6 = this.f8132o;
            if (qw0Var6 != null) {
                qw0Var6.setVisibility(4);
            }
            k(this.f8134q, false, false);
            if (this.f8141y && this.f8129l) {
                this.f8125g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: hh.v.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j10;
        if (view instanceof e5) {
            if (this.f8141y) {
                AndroidUtilities.hideKeyboard(this.f8125g.getParentActivity().getCurrentFocus());
            }
            ef.c cVar = new ef.c(17, this, (e5) view);
            if (this.f8141y) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(cVar, j10);
        }
    }

    public final void i(boolean z10) {
        int i10;
        jl0 jl0Var = this.f8133p;
        if (jl0Var != null && (i10 = !this.f8124f.f8093c.B ? 1 : 0) >= 0 && i10 < jl0Var.getChildCount()) {
            this.f8133p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f8138u != null) {
            Utilities.searchQueue.cancelRunnable(this.f8138u);
            this.f8138u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f8128k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f8137t = str;
        if (this.f8142z && this.f8123e.isEmpty()) {
            k(this.f8134q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f8124f.E(this.f8123e);
            k(this.f8133p, true, true);
            k(this.f8134q, false, false);
            qw0 qw0Var = this.f8132o;
            if (qw0Var != null) {
                qw0Var.setVisibility(4);
            }
            if (str == null && this.f8129l) {
                w0 k9 = this.f8125g.getActionBar().n().k(0);
                if (this.f8123e.isEmpty()) {
                    i10 = 8;
                }
                k9.setVisibility(i10);
            }
        } else {
            this.f8124f.E(Collections.EMPTY_LIST);
            k(this.f8133p, false, false);
            k(this.f8134q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            i iVar = new i(this, 2);
            this.f8138u = iVar;
            dispatchQueue.postRunnable(iVar, 300L);
        }
        if (str != null) {
            qw0 qw0Var2 = this.f8131n;
            if (qw0Var2 != null) {
                qw0Var2.setVisibility(4);
            }
            qw0 qw0Var3 = this.f8132o;
            if (qw0Var3 != null) {
                qw0Var3.setVisibility(4);
            }
        }
    }
}
