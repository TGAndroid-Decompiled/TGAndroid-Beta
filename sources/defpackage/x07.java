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
public abstract class x07 implements k07 {
    public final boolean a;
    public boolean b;
    public final d g;
    public final FrameLayout h;
    public final n07 i;
    public final long j;
    public final int k;
    public final boolean l;
    public FrameLayout m;
    public a1b n;
    public a1b o;
    public r59 p;
    public tk4 q;
    public TLRPC.TL_chatInviteImporter r;
    public w07 s;
    public String t;
    public o07 u;
    public int v;
    public boolean w;
    public boolean y;
    public boolean z;
    public final ArrayList c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final q07 f = new q07(this);
    public boolean x = true;
    public boolean A = true;
    public boolean B = true;
    public final o07 C = new o07(this, (byte) 0);
    public final ip2 D = new ip2(this, (byte) 24);

    public x07(d dVar, FrameLayout frameLayout, long j, boolean z) {
        this.g = dVar;
        this.h = frameLayout;
        this.j = j;
        int currentAccount = dVar.getCurrentAccount();
        this.k = currentAccount;
        this.a = sd2.U(currentAccount, j);
        this.l = z;
        this.i = n07.a(currentAccount);
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

    public final a1b a() {
        int i;
        int i2;
        if (this.n == null) {
            d dVar = this.g;
            a1b a1bVar = new a1b(dVar.getParentActivity(), null, 16, dVar.getResourceProvider());
            this.n = a1bVar;
            boolean z = this.a;
            if (z) {
                i = 2131747880;
            } else {
                i = 2131747929;
            }
            a1bVar.d.setText(jb6.M0(i, null));
            l66 l66Var = this.n.e;
            if (z) {
                i2 = 2131747879;
            } else {
                i2 = 2131747928;
            }
            l66Var.setText(jb6.M0(i2, null));
            this.n.setAnimateLayoutChange(true);
            this.n.setVisibility(8);
        }
        return this.n;
    }

    public final tk4 b() {
        if (this.q == null) {
            d dVar = this.g;
            tk4 tk4Var = new tk4(dVar.getParentActivity(), dVar.getResourceProvider());
            this.q = tk4Var;
            tk4Var.setAlpha(0.0f);
            if (this.B) {
                anb.h(cmb.c6, dVar.getResourceProvider(), this.q);
            }
            this.q.e(cmb.c6, cmb.Z6, -1);
            this.q.setViewType(15);
            this.q.setMemberRequestButton(this.a);
        }
        return this.q;
    }

    public final a1b c() {
        if (this.o == null) {
            d dVar = this.g;
            a1b a1bVar = new a1b(dVar.getParentActivity(), null, 1, dVar.getResourceProvider());
            this.o = a1bVar;
            if (this.B) {
                anb.h(cmb.c6, dVar.getResourceProvider(), a1bVar);
            }
            this.o.d.setText(jb6.M0(2131747901, null));
            this.o.e.setText(jb6.M0(2131745541, null));
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
        tL_messages_hideChatJoinRequest.peer = oc7.r1(i).i1(-this.j);
        tL_messages_hideChatJoinRequest.user_id = oc7.r1(i).p1(user);
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_hideChatJoinRequest, new bh2(this, tL_chatInviteImporter, z, user, tL_messages_hideChatJoinRequest));
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
        gm.c3(new y8c((byte) 27, this, z));
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
            a1b a1bVar = this.n;
            if (a1bVar != null) {
                if (z3) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                a1bVar.setVisibility(i2);
            }
            a1b a1bVar2 = this.o;
            if (a1bVar2 != null) {
                a1bVar2.setVisibility(4);
            }
        } else {
            if (this.c.isEmpty() && !z) {
                z3 = false;
            } else {
                z3 = true;
            }
            a1b a1bVar3 = this.n;
            if (a1bVar3 != null) {
                a1bVar3.setVisibility(4);
            }
            a1b a1bVar4 = this.o;
            if (a1bVar4 != null) {
                if (z3) {
                    i = 4;
                } else {
                    i = 0;
                }
                a1bVar4.setVisibility(i);
            }
        }
        k(this.p, z3, true);
        if (arrayList.isEmpty()) {
            a1b a1bVar5 = this.n;
            if (a1bVar5 != null) {
                a1bVar5.setVisibility(0);
            }
            a1b a1bVar6 = this.o;
            if (a1bVar6 != null) {
                a1bVar6.setVisibility(4);
            }
            k(this.q, false, false);
            if (this.y && this.l) {
                this.g.getActionBar().t().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r19, java.lang.String r20, boolean r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x07.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j;
        if (view instanceof l07) {
            if (this.y) {
                gm.t1(this.g.getParentActivity().getCurrentFocus());
            }
            lj6 lj6Var = new lj6(this, (l07) view, (byte) 20);
            if (this.y) {
                j = 100;
            } else {
                j = 0;
            }
            gm.d3(lj6Var, j);
        }
    }

    public final void i(boolean z) {
        int i;
        r59 r59Var = this.p;
        if (r59Var != null && (i = !this.f.c.B ? 1 : 0) >= 0 && i < r59Var.getChildCount()) {
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
        q07 q07Var = this.f;
        if (isEmpty) {
            q07Var.E(this.e);
            k(this.p, true, true);
            k(this.q, false, false);
            a1b a1bVar = this.o;
            if (a1bVar != null) {
                a1bVar.setVisibility(4);
            }
            if (str == null && this.l) {
                r7 j = this.g.getActionBar().t().j(0);
                if (this.e.isEmpty()) {
                    i = 8;
                }
                j.setVisibility(i);
            }
        } else {
            q07Var.E(Collections.EMPTY_LIST);
            k(this.p, false, false);
            k(this.q, true, true);
            mp3 mp3Var = Utilities.g;
            o07 o07Var = new o07(this, (byte) 2);
            this.u = o07Var;
            mp3Var.d(o07Var, 300L);
        }
        if (str != null) {
            a1b a1bVar2 = this.n;
            if (a1bVar2 != null) {
                a1bVar2.setVisibility(4);
            }
            a1b a1bVar3 = this.o;
            if (a1bVar3 != null) {
                a1bVar3.setVisibility(4);
            }
        }
    }
}
