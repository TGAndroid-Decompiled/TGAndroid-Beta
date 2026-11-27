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
import org.telegram.ui.ActionBar.e;
public final class ozb extends vic implements xg4 {
    public final FrameLayout W;
    public final d79 a0;
    public final x46 b0;
    public final mzb c0;
    public bcb d0;
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
    public final z2b q0;
    public final i69 r0;
    public boolean s0;
    public final bn0 t0;
    public final pq8 u0;
    public final ArrayList v0;
    public final tzb w0;

    public ozb(tzb tzbVar, Context context) {
        super(context, null);
        this.w0 = tzbVar;
        this.e0 = "empty";
        this.f0 = new ArrayList();
        this.g0 = new ArrayList();
        this.v0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        this.u0 = new pq8(this, (byte) 23);
        d79 d79Var = new d79(context, null);
        this.a0 = d79Var;
        mzb mzbVar = new mzb(this);
        this.c0 = mzbVar;
        d79Var.setAdapter(mzbVar);
        x46 x46Var = new x46();
        this.b0 = x46Var;
        d79Var.setLayoutManager(x46Var);
        d79Var.setOnItemClickListener(new t39(this, (byte) 25));
        d79Var.setOnScrollListener(new qhb(this, (byte) 4));
        tk4 tk4Var = new tk4(context, null);
        tk4Var.setViewType(7);
        tk4Var.x = false;
        tk4Var.setUseHeaderOffset(true);
        z2b z2bVar = new z2b(context, tk4Var, 1, null);
        this.q0 = z2bVar;
        z2bVar.d.setText(ob6.M0(2131747898, null));
        z2bVar.e.setVisibility(8);
        z2bVar.setVisibility(8);
        z2bVar.addView(tk4Var, 0);
        z2bVar.setAnimateLayoutChange(true);
        d79Var.setEmptyView(z2bVar);
        d79Var.X1 = true;
        d79Var.Y1 = false;
        frameLayout.addView(z2bVar);
        frameLayout.addView(d79Var);
        O();
        i69 i69Var = new i69(d79Var, true);
        this.r0 = i69Var;
        d79Var.setItemsEnterAnimator(i69Var);
        bn0 bn0Var = new bn0(this);
        this.t0 = bn0Var;
        setAdapter(bn0Var);
    }

    public final void M(String str) {
        int i;
        if (this.s0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tzb tzbVar = this.w0;
        tL_messages_search.peer = tzbVar.getMessagesController().j1(-tzbVar.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.g0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((r47) c00.g(1, arrayList)).e1();
        }
        this.s0 = true;
        i = ((e) tzbVar).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_search, new isa(this, str, (byte) 17));
    }

    public final void N(View view, int i, String str, boolean z) {
        this.e0 = str;
        FrameLayout frameLayout = this.W;
        tzb tzbVar = this.w0;
        int i2 = 0;
        if (view == frameLayout) {
            bcb bcbVar = this.d0;
            if (bcbVar != null) {
                hl.r(bcbVar);
                this.d0 = null;
            }
            this.s0 = false;
            this.p0 = false;
            ArrayList arrayList = this.f0;
            arrayList.clear();
            this.g0.clear();
            O();
            if (TextUtils.isEmpty(str)) {
                this.o0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = tzbVar.b;
                    if (i2 < arrayList2.size()) {
                        if (((kzb) arrayList2.get(i2)).c != null) {
                            arrayList.add(((kzb) arrayList2.get(i2)).c);
                            ((kzb) arrayList2.get(i2)).c.searchQuery = null;
                        }
                        i2++;
                    } else {
                        O();
                        return;
                    }
                }
            } else {
                O();
                this.o0 = true;
                this.q0.e(true, true);
                bcb bcbVar2 = new bcb(this, str, (byte) 15);
                this.d0 = bcbVar2;
                hl.d3(bcbVar2, 200L);
            }
        } else if (view instanceof yg4) {
            yg4 yg4Var = (yg4) view;
            yg4Var.c.b(0, false);
            yg4Var.h(-tzbVar.a, 0L, 0L, 0L, rh4.k3[((lzb) ((ArrayList) this.t0.b).get(i)).b], false, str, z);
        } else if (view instanceof aw9) {
            aw9 aw9Var = (aw9) view;
            aw9Var.a.b(0, false);
            aw9Var.L = str;
            aw9Var.d(false);
        }
    }

    public final void O() {
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
    public final boolean d(qg4 qg4Var) {
        if (qg4Var == null) {
            return false;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.v0;
            if (i >= arrayList.size()) {
                return false;
            }
            r47 r47Var = (r47) arrayList.get(i);
            if (r47Var != null && r47Var.e1() == qg4Var.b && r47.B0(r47Var.k) == qg4Var.a) {
                return true;
            }
            i++;
        }
    }

    @Override
    public final void e() {
        a aVar;
        aVar = ((e) this.w0).actionBar;
        aVar.R(null, null);
    }

    @Override
    public final void h(r47 r47Var, View view, int i) {
        a aVar;
        ArrayList arrayList = this.v0;
        if (!arrayList.remove(r47Var)) {
            arrayList.add(r47Var);
        }
        if (arrayList.isEmpty()) {
            aVar = ((e) this.w0).actionBar;
            aVar.y();
        }
    }

    @Override
    public final void r(r47 r47Var) {
        int i;
        Bundle bundle = new Bundle();
        long B0 = r47.B0(r47Var.k);
        boolean B = wf3.B(B0);
        tzb tzbVar = this.w0;
        if (B) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (!wf3.D(B0)) {
            i = ((e) tzbVar).currentAccount;
            TLRPC.Chat M0 = uc7.s1(k5.a(i).a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        } else {
            bundle.putLong("user_id", B0);
        }
        bundle.putInt("message_id", r47Var.e1());
        tzbVar.presentFragment(new zu1(bundle));
    }

    @Override
    public final boolean u() {
        a aVar;
        aVar = ((e) this.w0).actionBar;
        return aVar.z();
    }
}
