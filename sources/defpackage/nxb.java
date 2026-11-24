package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class nxb extends wgc implements bh4 {
    public final FrameLayout W;
    public final r59 a0;
    public final u46 b0;
    public final lxb c0;
    public b7b d0;
    public String e0;
    public final ArrayList f0;
    public final ArrayList g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public boolean o0;
    public boolean p0;
    public final a1b q0;
    public final w49 r0;
    public boolean s0;
    public final bo0 t0;
    public final et8 u0;
    public final ArrayList v0;
    public final sxb w0;

    public nxb(sxb sxbVar, Context context) {
        super(context, null);
        this.w0 = sxbVar;
        this.e0 = "empty";
        this.f0 = new ArrayList();
        this.g0 = new ArrayList();
        this.v0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        this.u0 = new et8(this, (byte) 20);
        r59 r59Var = new r59(context, null);
        this.a0 = r59Var;
        lxb lxbVar = new lxb(this);
        this.c0 = lxbVar;
        r59Var.setAdapter(lxbVar);
        u46 u46Var = new u46();
        this.b0 = u46Var;
        r59Var.setLayoutManager(u46Var);
        r59Var.setOnItemClickListener(new s19(this, (byte) 26));
        r59Var.setOnScrollListener(new k2b(this, (byte) 5));
        tk4 tk4Var = new tk4(context, null);
        tk4Var.setViewType(7);
        tk4Var.x = false;
        tk4Var.setUseHeaderOffset(true);
        a1b a1bVar = new a1b(context, tk4Var, 1, null);
        this.q0 = a1bVar;
        a1bVar.d.setText(jb6.M0(2131747901, null));
        a1bVar.e.setVisibility(8);
        a1bVar.setVisibility(8);
        a1bVar.addView(tk4Var, 0);
        a1bVar.setAnimateLayoutChange(true);
        r59Var.setEmptyView(a1bVar);
        r59Var.X1 = true;
        r59Var.Y1 = false;
        frameLayout.addView(a1bVar);
        frameLayout.addView(r59Var);
        N();
        w49 w49Var = new w49(r59Var, true);
        this.r0 = w49Var;
        r59Var.setItemsEnterAnimator(w49Var);
        bo0 bo0Var = new bo0(this);
        this.t0 = bo0Var;
        setAdapter(bo0Var);
    }

    public final void L(String str) {
        int i;
        if (this.s0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        sxb sxbVar = this.w0;
        tL_messages_search.peer = sxbVar.getMessagesController().i1(-sxbVar.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.g0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((k47) b10.f(1, arrayList)).e1();
        }
        this.s0 = true;
        i = ((d) sxbVar).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_search, new ara(this, str, (byte) 16));
    }

    public final void M(View view, int i, String str, boolean z) {
        this.e0 = str;
        FrameLayout frameLayout = this.W;
        sxb sxbVar = this.w0;
        int i2 = 0;
        if (view == frameLayout) {
            b7b b7bVar = this.d0;
            if (b7bVar != null) {
                gm.r(b7bVar);
                this.d0 = null;
            }
            this.s0 = false;
            this.p0 = false;
            ArrayList arrayList = this.f0;
            arrayList.clear();
            this.g0.clear();
            N();
            if (TextUtils.isEmpty(str)) {
                this.o0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = sxbVar.b;
                    if (i2 < arrayList2.size()) {
                        if (((jxb) arrayList2.get(i2)).c != null) {
                            arrayList.add(((jxb) arrayList2.get(i2)).c);
                            ((jxb) arrayList2.get(i2)).c.searchQuery = null;
                        }
                        i2++;
                    } else {
                        N();
                        return;
                    }
                }
            } else {
                N();
                this.o0 = true;
                this.q0.e(true, true);
                b7b b7bVar2 = new b7b(this, str, (byte) 20);
                this.d0 = b7bVar2;
                gm.d3(b7bVar2, 200L);
            }
        } else if (view instanceof ch4) {
            ch4 ch4Var = (ch4) view;
            ch4Var.c.b(0, false);
            ch4Var.h(-sxbVar.a, 0L, 0L, 0L, uh4.k3[((kxb) ((ArrayList) this.t0.b).get(i)).b], false, str, z);
        } else if (view instanceof ju9) {
            ju9 ju9Var = (ju9) view;
            ju9Var.a.b(0, false);
            ju9Var.L = str;
            ju9Var.d(false);
        }
    }

    public final void N() {
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = 0;
        ArrayList arrayList = this.f0;
        if (!arrayList.isEmpty()) {
            int i = this.n0;
            int i2 = i + 1;
            this.n0 = i2;
            this.h0 = i;
            this.i0 = i2;
            int size = arrayList.size() + i2;
            this.n0 = size;
            this.j0 = size;
        }
        ArrayList arrayList2 = this.g0;
        if (!arrayList2.isEmpty()) {
            int i3 = this.n0;
            int i4 = i3 + 1;
            this.n0 = i4;
            this.k0 = i3;
            this.l0 = i4;
            int size2 = arrayList2.size() + i4;
            this.n0 = size2;
            this.m0 = size2;
        }
        this.c0.f();
    }

    @Override
    public final boolean e(ug4 ug4Var) {
        if (ug4Var == null) {
            return false;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.v0;
            if (i >= arrayList.size()) {
                return false;
            }
            k47 k47Var = (k47) arrayList.get(i);
            if (k47Var != null && k47Var.e1() == ug4Var.b && k47.B0(k47Var.k) == ug4Var.a) {
                return true;
            }
            i++;
        }
    }

    @Override
    public final void f() {
        a aVar;
        aVar = ((d) this.w0).actionBar;
        aVar.R(null, null);
    }

    @Override
    public final void i(k47 k47Var, View view, int i) {
        a aVar;
        ArrayList arrayList = this.v0;
        if (!arrayList.remove(k47Var)) {
            arrayList.add(k47Var);
        }
        if (arrayList.isEmpty()) {
            aVar = ((d) this.w0).actionBar;
            aVar.x();
        }
    }

    @Override
    public final void r(k47 k47Var) {
        int i;
        Bundle bundle = new Bundle();
        long B0 = k47.B0(k47Var.k);
        boolean B = pg3.B(B0);
        sxb sxbVar = this.w0;
        if (B) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (!pg3.D(B0)) {
            i = ((d) sxbVar).currentAccount;
            TLRPC.Chat L0 = oc7.r1(j5.a(i).a).L0(Long.valueOf(-B0));
            if (L0 != null && L0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -L0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        } else {
            bundle.putLong("user_id", B0);
        }
        bundle.putInt("message_id", k47Var.e1());
        sxbVar.presentFragment(new yv1(bundle));
    }

    @Override
    public final boolean u() {
        a aVar;
        aVar = ((d) this.w0).actionBar;
        return aVar.y();
    }
}
