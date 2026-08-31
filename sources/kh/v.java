package kh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import fg.e2;
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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.u00;
public abstract class v implements f5 {
    public final boolean f11304a;
    public boolean f11305b;
    public final p2 f11309g;
    public final FrameLayout h;
    public final MemberRequestsController f11310i;
    public final long f11311j;
    public final int f11312k;
    public final boolean f11313l;
    public FrameLayout f11314m;
    public ax0 f11315n;
    public ax0 f11316o;
    public tl0 f11317p;
    public u00 f11318q;
    public TLRPC.TL_chatInviteImporter f11319r;
    public u f11320s;
    public String f11321t;
    public i f11322u;
    public int v;
    public boolean f11323w;
    public boolean f11325y;
    public boolean f11326z;
    public final ArrayList f11306c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f11307e = new ArrayList();
    public final n f11308f = new n(this);
    public boolean f11324x = true;
    public boolean A = true;
    public boolean B = true;
    public final i C = new i(this, 0);
    public final e2 D = new e2(this, 3);

    public v(p2 p2Var, FrameLayout frameLayout, long j10, boolean z4) {
        this.f11309g = p2Var;
        this.h = frameLayout;
        this.f11311j = j10;
        int currentAccount = p2Var.getCurrentAccount();
        this.f11312k = currentAccount;
        this.f11304a = ChatObject.isChannelAndNotMegaGroup(j10, currentAccount);
        this.f11313l = z4;
        this.f11310i = MemberRequestsController.getInstance(currentAccount);
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

    public final ax0 a() {
        int i10;
        int i11;
        if (this.f11315n == null) {
            p2 p2Var = this.f11309g;
            ax0 ax0Var = new ax0(p2Var.getParentActivity(), null, 16, p2Var.getResourceProvider());
            this.f11315n = ax0Var;
            boolean z4 = this.f11304a;
            if (z4) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            ax0Var.d.setText(LocaleController.getString(i10));
            g90 g90Var = this.f11315n.f25364e;
            if (z4) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            g90Var.setText(LocaleController.getString(i11));
            this.f11315n.setAnimateLayoutChange(true);
            this.f11315n.setVisibility(8);
        }
        return this.f11315n;
    }

    public final u00 b() {
        if (this.f11318q == null) {
            p2 p2Var = this.f11309g;
            u00 u00Var = new u00(p2Var.getParentActivity(), p2Var.getResourceProvider());
            this.f11318q = u00Var;
            u00Var.setAlpha(0.0f);
            if (this.B) {
                this.f11318q.setBackgroundColor(k6.v0(k6.f21659d6, p2Var.getResourceProvider()));
            }
            this.f11318q.f(k6.f21659d6, k6.f21605a7, -1);
            this.f11318q.setViewType(15);
            this.f11318q.setMemberRequestButton(this.f11304a);
        }
        return this.f11318q;
    }

    public final ax0 c() {
        if (this.f11316o == null) {
            p2 p2Var = this.f11309g;
            ax0 ax0Var = new ax0(p2Var.getParentActivity(), null, 1, p2Var.getResourceProvider());
            this.f11316o = ax0Var;
            if (this.B) {
                ax0Var.setBackgroundColor(k6.v0(k6.f21659d6, p2Var.getResourceProvider()));
            }
            this.f11316o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f11316o.f25364e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f11316o.setAnimateLayoutChange(true);
            this.f11316o.setVisibility(8);
        }
        return this.f11316o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z4) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z4;
        int i10 = this.f11312k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f11311j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new g(this, tL_chatInviteImporter, z4, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z4 = true;
        if (this.A && (cachedImporters = this.f11310i.getCachedImporters(this.f11311j)) != null) {
            this.f11326z = true;
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
        ArrayList arrayList = this.f11307e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z4) {
                z11 = false;
            } else {
                z11 = true;
            }
            ax0 ax0Var = this.f11315n;
            if (ax0Var != null) {
                if (z11) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                ax0Var.setVisibility(i11);
            }
            ax0 ax0Var2 = this.f11316o;
            if (ax0Var2 != null) {
                ax0Var2.setVisibility(4);
            }
        } else {
            if (this.f11306c.isEmpty() && !z4) {
                z11 = false;
            } else {
                z11 = true;
            }
            ax0 ax0Var3 = this.f11315n;
            if (ax0Var3 != null) {
                ax0Var3.setVisibility(4);
            }
            ax0 ax0Var4 = this.f11316o;
            if (ax0Var4 != null) {
                if (z11) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                ax0Var4.setVisibility(i10);
            }
        }
        k(this.f11317p, z11, true);
        if (arrayList.isEmpty()) {
            ax0 ax0Var5 = this.f11315n;
            if (ax0Var5 != null) {
                ax0Var5.setVisibility(0);
            }
            ax0 ax0Var6 = this.f11316o;
            if (ax0Var6 != null) {
                ax0Var6.setVisibility(4);
            }
            k(this.f11318q, false, false);
            if (this.f11325y && this.f11313l) {
                this.f11309g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: kh.v.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j10;
        if (view instanceof g5) {
            if (this.f11325y) {
                AndroidUtilities.hideKeyboard(this.f11309g.getParentActivity().getCurrentFocus());
            }
            gf.c cVar = new gf.c(19, this, (g5) view);
            if (this.f11325y) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(cVar, j10);
        }
    }

    public final void i(boolean z4) {
        int i10;
        tl0 tl0Var = this.f11317p;
        if (tl0Var != null && (i10 = !this.f11308f.f11277c.B ? 1 : 0) >= 0 && i10 < tl0Var.getChildCount()) {
            this.f11317p.getChildAt(i10).setEnabled(z4);
        }
    }

    public final void j(String str) {
        if (this.f11322u != null) {
            Utilities.searchQueue.cancelRunnable(this.f11322u);
            this.f11322u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f11312k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f11321t = str;
        if (this.f11326z && this.f11307e.isEmpty()) {
            k(this.f11318q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f11308f.E(this.f11307e);
            k(this.f11317p, true, true);
            k(this.f11318q, false, false);
            ax0 ax0Var = this.f11316o;
            if (ax0Var != null) {
                ax0Var.setVisibility(4);
            }
            if (str == null && this.f11313l) {
                w0 k10 = this.f11309g.getActionBar().n().k(0);
                if (this.f11307e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f11308f.E(Collections.EMPTY_LIST);
            k(this.f11317p, false, false);
            k(this.f11318q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            i iVar = new i(this, 2);
            this.f11322u = iVar;
            dispatchQueue.postRunnable(iVar, 300L);
        }
        if (str != null) {
            ax0 ax0Var2 = this.f11315n;
            if (ax0Var2 != null) {
                ax0Var2.setVisibility(4);
            }
            ax0 ax0Var3 = this.f11316o;
            if (ax0Var3 != null) {
                ax0Var3.setVisibility(4);
            }
        }
    }
}
