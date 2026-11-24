package defpackage;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public abstract class xy6 implements ky6 {
    public final boolean a;
    public boolean b;
    public final d g;
    public final FrameLayout h;
    public final ny6 i;
    public final long j;
    public final int k;
    public final boolean l;
    public FrameLayout m;
    public zya n;
    public zya o;
    public o39 p;
    public pi4 q;
    public TLRPC.TL_chatInviteImporter r;
    public wy6 s;
    public String t;
    public oy6 u;
    public int v;
    public boolean w;
    public boolean y;
    public boolean z;
    public final ArrayList c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final qy6 f = new qy6(this);
    public boolean x = true;
    public boolean A = true;
    public boolean B = true;
    public final oy6 C = new oy6(this, (byte) 0);
    public final ao2 D = new ao2(this, (byte) 23);

    public xy6(d dVar, FrameLayout frameLayout, long j, boolean z) {
        this.g = dVar;
        this.h = frameLayout;
        this.j = j;
        int currentAccount = dVar.getCurrentAccount();
        this.k = currentAccount;
        this.a = hc2.U(currentAccount, j);
        this.l = z;
        this.i = ny6.a(currentAccount);
    }

    public static void k(View view, boolean z, boolean z2) {
        boolean z3;
        float f;
        if (view != null) {
            int i = 0;
            if (view.getVisibility() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (z == z3 && f == view.getAlpha()) {
                return;
            }
            if (z2) {
                if (z) {
                    view.setAlpha(0.0f);
                }
                view.setVisibility(0);
                view.animate().alpha(f).setDuration(150L).start();
                return;
            }
            if (!z) {
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    public final zya a() {
        int i;
        int i2;
        if (this.n == null) {
            d dVar = this.g;
            zya zyaVar = new zya(dVar.getParentActivity(), null, 16, dVar.getResourceProvider());
            this.n = zyaVar;
            boolean z = this.a;
            if (z) {
                i = 2131747954;
            } else {
                i = 2131748003;
            }
            zyaVar.d.setText(k96.M0(i, null));
            l46 l46Var = this.n.e;
            if (z) {
                i2 = 2131747953;
            } else {
                i2 = 2131748002;
            }
            l46Var.setText(k96.M0(i2, null));
            this.n.setAnimateLayoutChange(true);
            this.n.setVisibility(8);
        }
        return this.n;
    }

    public final pi4 b() {
        if (this.q == null) {
            d dVar = this.g;
            pi4 pi4Var = new pi4(dVar.getParentActivity(), dVar.getResourceProvider());
            this.q = pi4Var;
            pi4Var.setAlpha(0.0f);
            if (this.B) {
                zkb.h(bkb.c6, dVar.getResourceProvider(), this.q);
            }
            this.q.e(bkb.c6, bkb.Z6, -1);
            this.q.setViewType(15);
            this.q.setMemberRequestButton(this.a);
        }
        return this.q;
    }

    public final zya c() {
        if (this.o == null) {
            d dVar = this.g;
            zya zyaVar = new zya(dVar.getParentActivity(), null, 1, dVar.getResourceProvider());
            this.o = zyaVar;
            if (this.B) {
                zkb.h(bkb.c6, dVar.getResourceProvider(), zyaVar);
            }
            this.o.d.setText(k96.M0(2131747975, null));
            this.o.e.setText(k96.M0(2131745615, null));
            this.o.setAnimateLayoutChange(true);
            this.o.setVisibility(8);
        }
        return this.o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z;
        int i = this.k;
        tL_messages_hideChatJoinRequest.peer = na7.q1(i).h1(-this.j);
        tL_messages_hideChatJoinRequest.user_id = na7.q1(i).o1(user);
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_hideChatJoinRequest, new pf2(this, tL_chatInviteImporter, z, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.i.a.get(this.j);
            if (tL_messages_chatInviteImporters != null) {
                this.z = true;
                g(tL_messages_chatInviteImporters, null, true, true);
                z = false;
            }
        }
        gl.d3(new x6c((byte) 27, this, z));
    }

    public void f(String str, boolean z, boolean z2) {
        boolean z3;
        int i;
        int i2;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z) {
                z3 = false;
            } else {
                z3 = true;
            }
            zya zyaVar = this.n;
            if (zyaVar != null) {
                if (z3) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                zyaVar.setVisibility(i2);
            }
            zya zyaVar2 = this.o;
            if (zyaVar2 != null) {
                zyaVar2.setVisibility(4);
            }
        } else {
            if (this.c.isEmpty() && !z) {
                z3 = false;
            } else {
                z3 = true;
            }
            zya zyaVar3 = this.n;
            if (zyaVar3 != null) {
                zyaVar3.setVisibility(4);
            }
            zya zyaVar4 = this.o;
            if (zyaVar4 != null) {
                if (z3) {
                    i = 4;
                } else {
                    i = 0;
                }
                zyaVar4.setVisibility(i);
            }
        }
        k(this.p, z3, true);
        if (arrayList.isEmpty()) {
            zya zyaVar5 = this.n;
            if (zyaVar5 != null) {
                zyaVar5.setVisibility(0);
            }
            zya zyaVar6 = this.o;
            if (zyaVar6 != null) {
                zyaVar6.setVisibility(4);
            }
            k(this.q, false, false);
            if (this.y && this.l) {
                this.g.getActionBar().t().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r19, java.lang.String r20, boolean r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xy6.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j;
        if (view instanceof ly6) {
            if (this.y) {
                gl.t1(this.g.getParentActivity().getCurrentFocus());
            }
            oh6 oh6Var = new oh6(this, (ly6) view, (byte) 19);
            if (this.y) {
                j = 100;
            } else {
                j = 0;
            }
            gl.e3(oh6Var, j);
        }
    }

    public final void i(boolean z) {
        int i;
        o39 o39Var = this.p;
        if (o39Var != null && (i = !this.f.c.B ? 1 : 0) >= 0 && i < o39Var.getChildCount()) {
            this.p.getChildAt(i).setEnabled(z);
        }
    }

    public final void j(String str) {
        if (this.u != null) {
            Utilities.g.a(this.u);
            this.u = null;
        }
        int i = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.t = str;
        if (this.z && this.e.isEmpty()) {
            k(this.q, false, false);
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        qy6 qy6Var = this.f;
        if (isEmpty) {
            qy6Var.E(this.e);
            k(this.p, true, true);
            k(this.q, false, false);
            zya zyaVar = this.o;
            if (zyaVar != null) {
                zyaVar.setVisibility(4);
            }
            if (str == null && this.l) {
                r7 j = this.g.getActionBar().t().j(0);
                if (this.e.isEmpty()) {
                    i = 8;
                }
                j.setVisibility(i);
            }
        } else {
            qy6Var.E(Collections.EMPTY_LIST);
            k(this.p, false, false);
            k(this.q, true, true);
            co3 co3Var = Utilities.g;
            oy6 oy6Var = new oy6(this, (byte) 2);
            this.u = oy6Var;
            co3Var.d(oy6Var, 300L);
        }
        if (str != null) {
            zya zyaVar2 = this.n;
            if (zyaVar2 != null) {
                zyaVar2.setVisibility(4);
            }
            zya zyaVar3 = this.o;
            if (zyaVar3 != null) {
                zyaVar3.setVisibility(4);
            }
        }
    }
}
