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
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.r5;
import org.telegram.messenger.vi;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t0;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Cells.i5;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.zz;
public abstract class q implements h5 {
    public final boolean f14292a;
    public boolean f14293b;
    public final k2 f14296g;
    public final FrameLayout h;
    public final vi f14297i;
    public final long f14298j;
    public final int f14299k;
    public final boolean f14300l;
    public FrameLayout f14301m;
    public dw0 f14302n;
    public dw0 f14303o;
    public tk0 f14304p;
    public zz f14305q;
    public TLRPC.TL_chatInviteImporter f14306r;
    public p f14307s;
    public String f14308t;
    public f f14309u;
    public int v;
    public boolean f14310w;
    public boolean f14312y;
    public boolean f14313z;
    public final ArrayList f14294c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final j f14295f = new j(this);
    public boolean f14311x = true;
    public boolean A = true;
    public boolean B = true;
    public final f C = new f(this, 0);
    public final u D = new u(this, 8);

    public q(k2 k2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.f14296g = k2Var;
        this.h = frameLayout;
        this.f14298j = j10;
        int currentAccount = k2Var.getCurrentAccount();
        this.f14299k = currentAccount;
        this.f14292a = w3.U(currentAccount, j10);
        this.f14300l = z10;
        this.f14297i = vi.b(currentAccount);
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

    public final dw0 a() {
        int i10;
        int i11;
        if (this.f14302n == null) {
            k2 k2Var = this.f14296g;
            dw0 dw0Var = new dw0(k2Var.getParentActivity(), null, 16, k2Var.getResourceProvider());
            this.f14302n = dw0Var;
            boolean z10 = this.f14292a;
            if (z10) {
                i10 = 2131748162;
            } else {
                i10 = 2131748212;
            }
            dw0Var.d.setText(cd.L0(i10, null));
            p80 p80Var = this.f14302n.e;
            if (z10) {
                i11 = 2131748161;
            } else {
                i11 = 2131748211;
            }
            p80Var.setText(cd.L0(i11, null));
            this.f14302n.setAnimateLayoutChange(true);
            this.f14302n.setVisibility(8);
        }
        return this.f14302n;
    }

    public final zz b() {
        if (this.f14305q == null) {
            k2 k2Var = this.f14296g;
            zz zzVar = new zz(k2Var.getParentActivity(), k2Var.getResourceProvider());
            this.f14305q = zzVar;
            zzVar.setAlpha(0.0f);
            if (this.B) {
                a7.i(t6.f20929d6, this.f14305q, k2Var.getResourceProvider());
            }
            this.f14305q.e(t6.f20929d6, t6.f20872a7, -1);
            this.f14305q.setViewType(15);
            this.f14305q.setMemberRequestButton(this.f14292a);
        }
        return this.f14305q;
    }

    public final dw0 c() {
        if (this.f14303o == null) {
            k2 k2Var = this.f14296g;
            dw0 dw0Var = new dw0(k2Var.getParentActivity(), null, 1, k2Var.getResourceProvider());
            this.f14303o = dw0Var;
            if (this.B) {
                a7.i(t6.f20929d6, dw0Var, k2Var.getResourceProvider());
            }
            this.f14303o.d.setText(cd.L0(2131748183, null));
            this.f14303o.e.setText(cd.L0(2131745824, null));
            this.f14303o.setAnimateLayoutChange(true);
            this.f14303o.setVisibility(8);
        }
        return this.f14303o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f14299k;
        tL_messages_hideChatJoinRequest.peer = vp.r1(i10).i1(-this.f14298j);
        tL_messages_hideChatJoinRequest.user_id = vp.r1(i10).p1(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new m1(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z10 = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.f14297i.f18537a.get(this.f14298j);
            if (tL_messages_chatInviteImporters != null) {
                this.f14313z = true;
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
            dw0 dw0Var = this.f14302n;
            if (dw0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                dw0Var.setVisibility(i11);
            }
            dw0 dw0Var2 = this.f14303o;
            if (dw0Var2 != null) {
                dw0Var2.setVisibility(4);
            }
        } else {
            if (this.f14294c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            dw0 dw0Var3 = this.f14302n;
            if (dw0Var3 != null) {
                dw0Var3.setVisibility(4);
            }
            dw0 dw0Var4 = this.f14303o;
            if (dw0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                dw0Var4.setVisibility(i10);
            }
        }
        k(this.f14304p, z12, true);
        if (arrayList.isEmpty()) {
            dw0 dw0Var5 = this.f14302n;
            if (dw0Var5 != null) {
                dw0Var5.setVisibility(0);
            }
            dw0 dw0Var6 = this.f14303o;
            if (dw0Var6 != null) {
                dw0Var6.setVisibility(4);
            }
            k(this.f14305q, false, false);
            if (this.f14312y && this.f14300l) {
                this.f14296g.getActionBar().p().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: oh.q.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j10;
        if (view instanceof i5) {
            if (this.f14312y) {
                i0.v1(this.f14296g.getParentActivity().getCurrentFocus());
            }
            mh.k kVar = new mh.k(8, this, (i5) view);
            if (this.f14312y) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            i0.h3(kVar, j10);
        }
    }

    public final void i(boolean z10) {
        int i10;
        tk0 tk0Var = this.f14304p;
        if (tk0Var != null && (i10 = !this.f14295f.f14268c.B ? 1 : 0) >= 0 && i10 < tk0Var.getChildCount()) {
            this.f14304p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f14309u != null) {
            Utilities.f14522g.a(this.f14309u);
            this.f14309u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f14299k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f14308t = str;
        if (this.f14313z && this.e.isEmpty()) {
            k(this.f14305q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f14295f.E(this.e);
            k(this.f14304p, true, true);
            k(this.f14305q, false, false);
            dw0 dw0Var = this.f14303o;
            if (dw0Var != null) {
                dw0Var.setVisibility(4);
            }
            if (str == null && this.f14300l) {
                t0 j10 = this.f14296g.getActionBar().p().j(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                j10.setVisibility(i10);
            }
        } else {
            this.f14295f.E(Collections.EMPTY_LIST);
            k(this.f14304p, false, false);
            k(this.f14305q, true, true);
            r5 r5Var = Utilities.f14522g;
            f fVar = new f(this, 2);
            this.f14309u = fVar;
            r5Var.d(fVar, 300L);
        }
        if (str != null) {
            dw0 dw0Var2 = this.f14302n;
            if (dw0Var2 != null) {
                dw0Var2.setVisibility(4);
            }
            dw0 dw0Var3 = this.f14303o;
            if (dw0Var3 != null) {
                dw0Var3.setVisibility(4);
            }
        }
    }
}
