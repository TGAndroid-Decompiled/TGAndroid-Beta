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
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.zw0;
public abstract class v implements f5 {
    public final boolean f9479a;
    public boolean f9480b;
    public final p2 f9483g;
    public final FrameLayout h;
    public final MemberRequestsController f9484i;
    public final long f9485j;
    public final int f9486k;
    public final boolean f9487l;
    public FrameLayout f9488m;
    public zw0 f9489n;
    public zw0 f9490o;
    public sl0 f9491p;
    public t00 f9492q;
    public TLRPC.TL_chatInviteImporter f9493r;
    public u f9494s;
    public String f9495t;
    public i f9496u;
    public int v;
    public boolean f9497w;
    public boolean f9499y;
    public boolean f9500z;
    public final ArrayList f9481c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final n f9482f = new n(this);
    public boolean f9498x = true;
    public boolean A = true;
    public boolean B = true;
    public final i C = new i(this, 0);
    public final f2 D = new f2(this, 3);

    public v(p2 p2Var, FrameLayout frameLayout, long j10, boolean z4) {
        this.f9483g = p2Var;
        this.h = frameLayout;
        this.f9485j = j10;
        int currentAccount = p2Var.getCurrentAccount();
        this.f9486k = currentAccount;
        this.f9479a = ChatObject.isChannelAndNotMegaGroup(j10, currentAccount);
        this.f9487l = z4;
        this.f9484i = MemberRequestsController.getInstance(currentAccount);
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
        if (this.f9489n == null) {
            p2 p2Var = this.f9483g;
            zw0 zw0Var = new zw0(p2Var.getParentActivity(), null, 16, p2Var.getResourceProvider());
            this.f9489n = zw0Var;
            boolean z4 = this.f9479a;
            if (z4) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            zw0Var.d.setText(LocaleController.getString(i10));
            e90 e90Var = this.f9489n.e;
            if (z4) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            e90Var.setText(LocaleController.getString(i11));
            this.f9489n.setAnimateLayoutChange(true);
            this.f9489n.setVisibility(8);
        }
        return this.f9489n;
    }

    public final t00 b() {
        if (this.f9492q == null) {
            p2 p2Var = this.f9483g;
            t00 t00Var = new t00(p2Var.getParentActivity(), p2Var.getResourceProvider());
            this.f9492q = t00Var;
            t00Var.setAlpha(0.0f);
            if (this.B) {
                this.f9492q.setBackgroundColor(j6.v0(j6.f19906d6, p2Var.getResourceProvider()));
            }
            this.f9492q.f(j6.f19906d6, j6.f19852a7, -1);
            this.f9492q.setViewType(15);
            this.f9492q.setMemberRequestButton(this.f9479a);
        }
        return this.f9492q;
    }

    public final zw0 c() {
        if (this.f9490o == null) {
            p2 p2Var = this.f9483g;
            zw0 zw0Var = new zw0(p2Var.getParentActivity(), null, 1, p2Var.getResourceProvider());
            this.f9490o = zw0Var;
            if (this.B) {
                zw0Var.setBackgroundColor(j6.v0(j6.f19906d6, p2Var.getResourceProvider()));
            }
            this.f9490o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f9490o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f9490o.setAnimateLayoutChange(true);
            this.f9490o.setVisibility(8);
        }
        return this.f9490o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z4) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z4;
        int i10 = this.f9486k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f9485j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new g(this, tL_chatInviteImporter, z4, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z4 = true;
        if (this.A && (cachedImporters = this.f9484i.getCachedImporters(this.f9485j)) != null) {
            this.f9500z = true;
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
            zw0 zw0Var = this.f9489n;
            if (zw0Var != null) {
                if (z11) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                zw0Var.setVisibility(i11);
            }
            zw0 zw0Var2 = this.f9490o;
            if (zw0Var2 != null) {
                zw0Var2.setVisibility(4);
            }
        } else {
            if (this.f9481c.isEmpty() && !z4) {
                z11 = false;
            } else {
                z11 = true;
            }
            zw0 zw0Var3 = this.f9489n;
            if (zw0Var3 != null) {
                zw0Var3.setVisibility(4);
            }
            zw0 zw0Var4 = this.f9490o;
            if (zw0Var4 != null) {
                if (z11) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                zw0Var4.setVisibility(i10);
            }
        }
        k(this.f9491p, z11, true);
        if (arrayList.isEmpty()) {
            zw0 zw0Var5 = this.f9489n;
            if (zw0Var5 != null) {
                zw0Var5.setVisibility(0);
            }
            zw0 zw0Var6 = this.f9490o;
            if (zw0Var6 != null) {
                zw0Var6.setVisibility(4);
            }
            k(this.f9492q, false, false);
            if (this.f9499y && this.f9487l) {
                this.f9483g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: jh.v.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j10;
        if (view instanceof g5) {
            if (this.f9499y) {
                AndroidUtilities.hideKeyboard(this.f9483g.getParentActivity().getCurrentFocus());
            }
            gf.c cVar = new gf.c(19, this, (g5) view);
            if (this.f9499y) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(cVar, j10);
        }
    }

    public final void i(boolean z4) {
        int i10;
        sl0 sl0Var = this.f9491p;
        if (sl0Var != null && (i10 = !this.f9482f.f9455c.B ? 1 : 0) >= 0 && i10 < sl0Var.getChildCount()) {
            this.f9491p.getChildAt(i10).setEnabled(z4);
        }
    }

    public final void j(String str) {
        if (this.f9496u != null) {
            Utilities.searchQueue.cancelRunnable(this.f9496u);
            this.f9496u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f9486k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f9495t = str;
        if (this.f9500z && this.e.isEmpty()) {
            k(this.f9492q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f9482f.E(this.e);
            k(this.f9491p, true, true);
            k(this.f9492q, false, false);
            zw0 zw0Var = this.f9490o;
            if (zw0Var != null) {
                zw0Var.setVisibility(4);
            }
            if (str == null && this.f9487l) {
                w0 k10 = this.f9483g.getActionBar().n().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f9482f.E(Collections.EMPTY_LIST);
            k(this.f9491p, false, false);
            k(this.f9492q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            i iVar = new i(this, 2);
            this.f9496u = iVar;
            dispatchQueue.postRunnable(iVar, 300L);
        }
        if (str != null) {
            zw0 zw0Var2 = this.f9489n;
            if (zw0Var2 != null) {
                zw0Var2.setVisibility(4);
            }
            zw0 zw0Var3 = this.f9490o;
            if (zw0Var3 != null) {
                zw0Var3.setVisibility(4);
            }
        }
    }
}
