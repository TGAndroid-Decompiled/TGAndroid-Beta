package oh;

import ag.m1;
import ag.u;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import k2.v;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.r5;
import org.telegram.messenger.w3;
import org.telegram.messenger.wi;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t0;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Cells.i5;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.zz;
public abstract class q implements h5 {
    public final boolean f14293a;
    public boolean f14294b;
    public final k2 f14297g;
    public final FrameLayout h;
    public final wi f14298i;
    public final long f14299j;
    public final int f14300k;
    public final boolean f14301l;
    public FrameLayout f14302m;
    public ew0 f14303n;
    public ew0 f14304o;
    public uk0 f14305p;
    public zz f14306q;
    public TLRPC.TL_chatInviteImporter f14307r;
    public p f14308s;
    public String f14309t;
    public f f14310u;
    public int v;
    public boolean f14311w;
    public boolean f14313y;
    public boolean f14314z;
    public final ArrayList f14295c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final j f14296f = new j(this);
    public boolean f14312x = true;
    public boolean A = true;
    public boolean B = true;
    public final f C = new f(this, 0);
    public final u D = new u(this, 8);

    public q(k2 k2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.f14297g = k2Var;
        this.h = frameLayout;
        this.f14299j = j10;
        int currentAccount = k2Var.getCurrentAccount();
        this.f14300k = currentAccount;
        this.f14293a = w3.U(currentAccount, j10);
        this.f14301l = z10;
        this.f14298i = wi.b(currentAccount);
    }

    public static void k(View view, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        if (view != null) {
            int i10 = 0;
            if (view.getVisibility() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (z10 == z12 && f7 == view.getAlpha()) {
                return;
            }
            if (z11) {
                if (z10) {
                    view.setAlpha(0.0f);
                }
                view.setVisibility(0);
                view.animate().alpha(f7).setDuration(150L).start();
                return;
            }
            if (!z10) {
                i10 = 4;
            }
            view.setVisibility(i10);
        }
    }

    public final ew0 a() {
        int i10;
        int i11;
        if (this.f14303n == null) {
            k2 k2Var = this.f14297g;
            ew0 ew0Var = new ew0(k2Var.getParentActivity(), null, 16, k2Var.getResourceProvider());
            this.f14303n = ew0Var;
            boolean z10 = this.f14293a;
            if (z10) {
                i10 = 2131748162;
            } else {
                i10 = 2131748212;
            }
            ew0Var.d.setText(dd.L0(i10, null));
            p80 p80Var = this.f14303n.e;
            if (z10) {
                i11 = 2131748161;
            } else {
                i11 = 2131748211;
            }
            p80Var.setText(dd.L0(i11, null));
            this.f14303n.setAnimateLayoutChange(true);
            this.f14303n.setVisibility(8);
        }
        return this.f14303n;
    }

    public final zz b() {
        if (this.f14306q == null) {
            k2 k2Var = this.f14297g;
            zz zzVar = new zz(k2Var.getParentActivity(), k2Var.getResourceProvider());
            this.f14306q = zzVar;
            zzVar.setAlpha(0.0f);
            if (this.B) {
                a7.i(t6.f20930d6, this.f14306q, k2Var.getResourceProvider());
            }
            this.f14306q.e(t6.f20930d6, t6.f20873a7, -1);
            this.f14306q.setViewType(15);
            this.f14306q.setMemberRequestButton(this.f14293a);
        }
        return this.f14306q;
    }

    public final ew0 c() {
        if (this.f14304o == null) {
            k2 k2Var = this.f14297g;
            ew0 ew0Var = new ew0(k2Var.getParentActivity(), null, 1, k2Var.getResourceProvider());
            this.f14304o = ew0Var;
            if (this.B) {
                a7.i(t6.f20930d6, ew0Var, k2Var.getResourceProvider());
            }
            this.f14304o.d.setText(dd.L0(2131748183, null));
            this.f14304o.e.setText(dd.L0(2131745824, null));
            this.f14304o.setAnimateLayoutChange(true);
            this.f14304o.setVisibility(8);
        }
        return this.f14304o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f14300k;
        tL_messages_hideChatJoinRequest.peer = wp.r1(i10).i1(-this.f14299j);
        tL_messages_hideChatJoinRequest.user_id = wp.r1(i10).p1(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new m1(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z10 = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.f14298i.f19059a.get(this.f14299j);
            if (tL_messages_chatInviteImporters != null) {
                this.f14314z = true;
                g(tL_messages_chatInviteImporters, null, true, true);
                z10 = false;
            }
        }
        i0.g3(new v(2, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            ew0 ew0Var = this.f14303n;
            if (ew0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                ew0Var.setVisibility(i11);
            }
            ew0 ew0Var2 = this.f14304o;
            if (ew0Var2 != null) {
                ew0Var2.setVisibility(4);
            }
        } else {
            if (this.f14295c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            ew0 ew0Var3 = this.f14303n;
            if (ew0Var3 != null) {
                ew0Var3.setVisibility(4);
            }
            ew0 ew0Var4 = this.f14304o;
            if (ew0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                ew0Var4.setVisibility(i10);
            }
        }
        k(this.f14305p, z12, true);
        if (arrayList.isEmpty()) {
            ew0 ew0Var5 = this.f14303n;
            if (ew0Var5 != null) {
                ew0Var5.setVisibility(0);
            }
            ew0 ew0Var6 = this.f14304o;
            if (ew0Var6 != null) {
                ew0Var6.setVisibility(4);
            }
            k(this.f14306q, false, false);
            if (this.f14313y && this.f14301l) {
                this.f14297g.getActionBar().p().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: oh.q.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j10;
        if (view instanceof i5) {
            if (this.f14313y) {
                i0.v1(this.f14297g.getParentActivity().getCurrentFocus());
            }
            mh.k kVar = new mh.k(8, this, (i5) view);
            if (this.f14313y) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            i0.h3(kVar, j10);
        }
    }

    public final void i(boolean z10) {
        int i10;
        uk0 uk0Var = this.f14305p;
        if (uk0Var != null && (i10 = !this.f14296f.f14269c.B ? 1 : 0) >= 0 && i10 < uk0Var.getChildCount()) {
            this.f14305p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f14310u != null) {
            Utilities.f14523g.a(this.f14310u);
            this.f14310u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f14300k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f14309t = str;
        if (this.f14314z && this.e.isEmpty()) {
            k(this.f14306q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f14296f.E(this.e);
            k(this.f14305p, true, true);
            k(this.f14306q, false, false);
            ew0 ew0Var = this.f14304o;
            if (ew0Var != null) {
                ew0Var.setVisibility(4);
            }
            if (str == null && this.f14301l) {
                t0 j10 = this.f14297g.getActionBar().p().j(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                j10.setVisibility(i10);
            }
        } else {
            this.f14296f.E(Collections.EMPTY_LIST);
            k(this.f14305p, false, false);
            k(this.f14306q, true, true);
            r5 r5Var = Utilities.f14523g;
            f fVar = new f(this, 2);
            this.f14310u = fVar;
            r5Var.d(fVar, 300L);
        }
        if (str != null) {
            ew0 ew0Var2 = this.f14303n;
            if (ew0Var2 != null) {
                ew0Var2.setVisibility(4);
            }
            ew0 ew0Var3 = this.f14304o;
            if (ew0Var3 != null) {
                ew0Var3.setVisibility(4);
            }
        }
    }
}
