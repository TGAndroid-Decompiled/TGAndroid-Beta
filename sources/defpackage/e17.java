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
import org.telegram.ui.ActionBar.e;
public abstract class e17 implements r07 {
    public final boolean a;
    public boolean b;
    public final e g;
    public final FrameLayout h;
    public final u07 i;
    public final long j;
    public final int k;
    public final boolean l;
    public FrameLayout m;
    public z2b n;
    public z2b o;
    public d79 p;
    public tk4 q;
    public TLRPC.TL_chatInviteImporter r;
    public d17 s;
    public String t;
    public v07 u;
    public int v;
    public boolean w;
    public boolean y;
    public boolean z;
    public final ArrayList c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final x07 f = new x07(this);
    public boolean x = true;
    public boolean A = true;
    public boolean B = true;
    public final v07 C = new v07(this, (byte) 0);
    public final to2 D = new to2(this, (byte) 23);

    public e17(e eVar, FrameLayout frameLayout, long j, boolean z) {
        this.g = eVar;
        this.h = frameLayout;
        this.j = j;
        int currentAccount = eVar.getCurrentAccount();
        this.k = currentAccount;
        this.a = xc2.U(currentAccount, j);
        this.l = z;
        this.i = u07.a(currentAccount);
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

    public final z2b a() {
        int i;
        int i2;
        if (this.n == null) {
            e eVar = this.g;
            z2b z2bVar = new z2b(eVar.getParentActivity(), null, 16, eVar.getResourceProvider());
            this.n = z2bVar;
            boolean z = this.a;
            if (z) {
                i = 2131747877;
            } else {
                i = 2131747926;
            }
            z2bVar.d.setText(ob6.M0(i, null));
            p66 p66Var = this.n.e;
            if (z) {
                i2 = 2131747876;
            } else {
                i2 = 2131747925;
            }
            p66Var.setText(ob6.M0(i2, null));
            this.n.setAnimateLayoutChange(true);
            this.n.setVisibility(8);
        }
        return this.n;
    }

    public final tk4 b() {
        if (this.q == null) {
            e eVar = this.g;
            tk4 tk4Var = new tk4(eVar.getParentActivity(), eVar.getResourceProvider());
            this.q = tk4Var;
            tk4Var.setAlpha(0.0f);
            if (this.B) {
                yob.h(aob.d6, eVar.getResourceProvider(), this.q);
            }
            this.q.e(aob.d6, aob.a7, -1);
            this.q.setViewType(15);
            this.q.setMemberRequestButton(this.a);
        }
        return this.q;
    }

    public final z2b c() {
        if (this.o == null) {
            e eVar = this.g;
            z2b z2bVar = new z2b(eVar.getParentActivity(), null, 1, eVar.getResourceProvider());
            this.o = z2bVar;
            if (this.B) {
                yob.h(aob.d6, eVar.getResourceProvider(), z2bVar);
            }
            this.o.d.setText(ob6.M0(2131747898, null));
            this.o.e.setText(ob6.M0(2131745535, null));
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
        tL_messages_hideChatJoinRequest.peer = uc7.s1(i).j1(-this.j);
        tL_messages_hideChatJoinRequest.user_id = uc7.s1(i).q1(user);
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_hideChatJoinRequest, new gg2(this, tL_chatInviteImporter, z, user, tL_messages_hideChatJoinRequest));
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
        hl.c3(new xac((byte) 27, this, z));
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
            z2b z2bVar = this.n;
            if (z2bVar != null) {
                if (z3) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                z2bVar.setVisibility(i2);
            }
            z2b z2bVar2 = this.o;
            if (z2bVar2 != null) {
                z2bVar2.setVisibility(4);
            }
        } else {
            if (this.c.isEmpty() && !z) {
                z3 = false;
            } else {
                z3 = true;
            }
            z2b z2bVar3 = this.n;
            if (z2bVar3 != null) {
                z2bVar3.setVisibility(4);
            }
            z2b z2bVar4 = this.o;
            if (z2bVar4 != null) {
                if (z3) {
                    i = 4;
                } else {
                    i = 0;
                }
                z2bVar4.setVisibility(i);
            }
        }
        k(this.p, z3, true);
        if (arrayList.isEmpty()) {
            z2b z2bVar5 = this.n;
            if (z2bVar5 != null) {
                z2bVar5.setVisibility(0);
            }
            z2b z2bVar6 = this.o;
            if (z2bVar6 != null) {
                z2bVar6.setVisibility(4);
            }
            k(this.q, false, false);
            if (this.y && this.l) {
                this.g.getActionBar().u().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r19, java.lang.String r20, boolean r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e17.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j;
        if (view instanceof s07) {
            if (this.y) {
                hl.t1(this.g.getParentActivity().getCurrentFocus());
            }
            mn6 mn6Var = new mn6(this, (s07) view, (byte) 16);
            if (this.y) {
                j = 100;
            } else {
                j = 0;
            }
            hl.d3(mn6Var, j);
        }
    }

    public final void i(boolean z) {
        int i;
        d79 d79Var = this.p;
        if (d79Var != null && (i = !this.f.c.B ? 1 : 0) >= 0 && i < d79Var.getChildCount()) {
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
        x07 x07Var = this.f;
        if (isEmpty) {
            x07Var.E(this.e);
            k(this.p, true, true);
            k(this.q, false, false);
            z2b z2bVar = this.o;
            if (z2bVar != null) {
                z2bVar.setVisibility(4);
            }
            if (str == null && this.l) {
                s7 j = this.g.getActionBar().u().j(0);
                if (this.e.isEmpty()) {
                    i = 8;
                }
                j.setVisibility(i);
            }
        } else {
            x07Var.E(Collections.EMPTY_LIST);
            k(this.p, false, false);
            k(this.q, true, true);
            to3 to3Var = Utilities.g;
            v07 v07Var = new v07(this, (byte) 2);
            this.u = v07Var;
            to3Var.d(v07Var, 300L);
        }
        if (str != null) {
            z2b z2bVar2 = this.n;
            if (z2bVar2 != null) {
                z2bVar2.setVisibility(4);
            }
            z2b z2bVar3 = this.o;
            if (z2bVar3 != null) {
                z2bVar3.setVisibility(4);
            }
        }
    }
}
