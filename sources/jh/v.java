package jh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import eg.f2;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.zw0;
public abstract class v implements e5 {
    public final boolean f9460a;
    public boolean f9461b;
    public final p2 f9464g;
    public final FrameLayout h;
    public final MemberRequestsController f9465i;
    public final long f9466j;
    public final int f9467k;
    public final boolean f9468l;
    public FrameLayout f9469m;
    public zw0 f9470n;
    public zw0 f9471o;
    public rl0 f9472p;
    public u00 f9473q;
    public TLRPC.TL_chatInviteImporter f9474r;
    public u f9475s;
    public String f9476t;
    public i f9477u;
    public int v;
    public boolean f9478w;
    public boolean f9480y;
    public boolean f9481z;
    public final ArrayList f9462c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final n f9463f = new n(this);
    public boolean f9479x = true;
    public boolean A = true;
    public boolean B = true;
    public final i C = new i(this, 0);
    public final f2 D = new f2(this, 3);

    public v(p2 p2Var, FrameLayout frameLayout, long j10, boolean z4) {
        this.f9464g = p2Var;
        this.h = frameLayout;
        this.f9466j = j10;
        int currentAccount = p2Var.getCurrentAccount();
        this.f9467k = currentAccount;
        this.f9460a = ChatObject.isChannelAndNotMegaGroup(j10, currentAccount);
        this.f9468l = z4;
        this.f9465i = MemberRequestsController.getInstance(currentAccount);
    }

    public static void k(View view, boolean z4, boolean z10) {
        boolean z11;
        float f10;
        if (view != null) {
            int i10 = 0;
            if (view.getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (z4 == z11 && f10 == view.getAlpha()) {
                return;
            }
            if (z10) {
                if (z4) {
                    view.setAlpha(0.0f);
                }
                view.setVisibility(0);
                view.animate().alpha(f10).setDuration(150L).start();
                return;
            }
            if (!z4) {
                i10 = 4;
            }
            view.setVisibility(i10);
        }
    }

    public final zw0 a() {
        int i10;
        int i11;
        if (this.f9470n == null) {
            p2 p2Var = this.f9464g;
            zw0 zw0Var = new zw0(p2Var.getParentActivity(), null, 16, p2Var.getResourceProvider());
            this.f9470n = zw0Var;
            boolean z4 = this.f9460a;
            if (z4) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            zw0Var.d.setText(LocaleController.getString(i10));
            f90 f90Var = this.f9470n.e;
            if (z4) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            f90Var.setText(LocaleController.getString(i11));
            this.f9470n.setAnimateLayoutChange(true);
            this.f9470n.setVisibility(8);
        }
        return this.f9470n;
    }

    public final u00 b() {
        if (this.f9473q == null) {
            p2 p2Var = this.f9464g;
            u00 u00Var = new u00(p2Var.getParentActivity(), p2Var.getResourceProvider());
            this.f9473q = u00Var;
            u00Var.setAlpha(0.0f);
            if (this.B) {
                this.f9473q.setBackgroundColor(j6.v0(j6.f19881d6, p2Var.getResourceProvider()));
            }
            this.f9473q.f(j6.f19881d6, j6.f19827a7, -1);
            this.f9473q.setViewType(15);
            this.f9473q.setMemberRequestButton(this.f9460a);
        }
        return this.f9473q;
    }

    public final zw0 c() {
        if (this.f9471o == null) {
            p2 p2Var = this.f9464g;
            zw0 zw0Var = new zw0(p2Var.getParentActivity(), null, 1, p2Var.getResourceProvider());
            this.f9471o = zw0Var;
            if (this.B) {
                zw0Var.setBackgroundColor(j6.v0(j6.f19881d6, p2Var.getResourceProvider()));
            }
            this.f9471o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f9471o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f9471o.setAnimateLayoutChange(true);
            this.f9471o.setVisibility(8);
        }
        return this.f9471o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z4) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z4;
        int i10 = this.f9467k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f9466j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new g(this, tL_chatInviteImporter, z4, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z4 = true;
        if (this.A && (cachedImporters = this.f9465i.getCachedImporters(this.f9466j)) != null) {
            this.f9481z = true;
            g(cachedImporters, null, true, true);
            z4 = false;
        }
        AndroidUtilities.runOnUIThread(new f(0, this, z4));
    }

    public void f(String str, boolean z4, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z4) {
                z11 = false;
            } else {
                z11 = true;
            }
            zw0 zw0Var = this.f9470n;
            if (zw0Var != null) {
                if (z11) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                zw0Var.setVisibility(i11);
            }
            zw0 zw0Var2 = this.f9471o;
            if (zw0Var2 != null) {
                zw0Var2.setVisibility(4);
            }
        } else {
            if (this.f9462c.isEmpty() && !z4) {
                z11 = false;
            } else {
                z11 = true;
            }
            zw0 zw0Var3 = this.f9470n;
            if (zw0Var3 != null) {
                zw0Var3.setVisibility(4);
            }
            zw0 zw0Var4 = this.f9471o;
            if (zw0Var4 != null) {
                if (z11) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                zw0Var4.setVisibility(i10);
            }
        }
        k(this.f9472p, z11, true);
        if (arrayList.isEmpty()) {
            zw0 zw0Var5 = this.f9470n;
            if (zw0Var5 != null) {
                zw0Var5.setVisibility(0);
            }
            zw0 zw0Var6 = this.f9471o;
            if (zw0Var6 != null) {
                zw0Var6.setVisibility(4);
            }
            k(this.f9473q, false, false);
            if (this.f9480y && this.f9468l) {
                this.f9464g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: jh.v.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j10;
        if (view instanceof f5) {
            if (this.f9480y) {
                AndroidUtilities.hideKeyboard(this.f9464g.getParentActivity().getCurrentFocus());
            }
            ff.c cVar = new ff.c(19, this, (f5) view);
            if (this.f9480y) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(cVar, j10);
        }
    }

    public final void i(boolean z4) {
        int i10;
        rl0 rl0Var = this.f9472p;
        if (rl0Var != null && (i10 = !this.f9463f.f9436c.B ? 1 : 0) >= 0 && i10 < rl0Var.getChildCount()) {
            this.f9472p.getChildAt(i10).setEnabled(z4);
        }
    }

    public final void j(String str) {
        if (this.f9477u != null) {
            Utilities.searchQueue.cancelRunnable(this.f9477u);
            this.f9477u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f9467k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f9476t = str;
        if (this.f9481z && this.e.isEmpty()) {
            k(this.f9473q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f9463f.E(this.e);
            k(this.f9472p, true, true);
            k(this.f9473q, false, false);
            zw0 zw0Var = this.f9471o;
            if (zw0Var != null) {
                zw0Var.setVisibility(4);
            }
            if (str == null && this.f9468l) {
                w0 k10 = this.f9464g.getActionBar().n().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f9463f.E(Collections.EMPTY_LIST);
            k(this.f9472p, false, false);
            k(this.f9473q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            i iVar = new i(this, 2);
            this.f9477u = iVar;
            dispatchQueue.postRunnable(iVar, 300L);
        }
        if (str != null) {
            zw0 zw0Var2 = this.f9470n;
            if (zw0Var2 != null) {
                zw0Var2.setVisibility(4);
            }
            zw0 zw0Var3 = this.f9471o;
            if (zw0Var3 != null) {
                zw0Var3.setVisibility(4);
            }
        }
    }
}
