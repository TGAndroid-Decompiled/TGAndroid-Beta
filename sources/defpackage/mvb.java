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
public final class mvb extends wec implements ze4 {
    public final FrameLayout W;
    public final o39 a0;
    public final t26 b0;
    public final kvb c0;
    public a5b d0;
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
    public final zya q0;
    public final t29 r0;
    public boolean s0;
    public final bn0 t0;
    public final g29 u0;
    public final ArrayList v0;
    public final qvb w0;

    public mvb(qvb qvbVar, Context context) {
        super(context, null);
        this.w0 = qvbVar;
        this.e0 = "empty";
        this.f0 = new ArrayList();
        this.g0 = new ArrayList();
        this.v0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        this.u0 = new g29(this, (byte) 19);
        o39 o39Var = new o39(context, null);
        this.a0 = o39Var;
        kvb kvbVar = new kvb(this);
        this.c0 = kvbVar;
        o39Var.setAdapter(kvbVar);
        t26 t26Var = new t26();
        this.b0 = t26Var;
        o39Var.setLayoutManager(t26Var);
        o39Var.setOnItemClickListener(new f09(this, (byte) 25));
        o39Var.setOnScrollListener(new vdb(this, (byte) 4));
        pi4 pi4Var = new pi4(context, null);
        pi4Var.setViewType(7);
        pi4Var.x = false;
        pi4Var.setUseHeaderOffset(true);
        zya zyaVar = new zya(context, pi4Var, 1, null);
        this.q0 = zyaVar;
        zyaVar.d.setText(k96.M0(2131747975, null));
        zyaVar.e.setVisibility(8);
        zyaVar.setVisibility(8);
        zyaVar.addView(pi4Var, 0);
        zyaVar.setAnimateLayoutChange(true);
        o39Var.setEmptyView(zyaVar);
        o39Var.X1 = true;
        o39Var.Y1 = false;
        frameLayout.addView(zyaVar);
        frameLayout.addView(o39Var);
        N();
        t29 t29Var = new t29(o39Var, true);
        this.r0 = t29Var;
        o39Var.setItemsEnterAnimator(t29Var);
        bn0 bn0Var = new bn0(this);
        this.t0 = bn0Var;
        setAdapter(bn0Var);
    }

    public final void L(String str) {
        int i;
        if (this.s0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        qvb qvbVar = this.w0;
        tL_messages_search.peer = qvbVar.getMessagesController().h1(-qvbVar.a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        ArrayList arrayList = this.g0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((k27) b00.f(1, arrayList)).e1();
        }
        this.s0 = true;
        i = ((d) qvbVar).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_search, new apa(this, str, (byte) 16));
    }

    public final void M(View view, int i, String str, boolean z) {
        this.e0 = str;
        FrameLayout frameLayout = this.W;
        qvb qvbVar = this.w0;
        int i2 = 0;
        if (view == frameLayout) {
            a5b a5bVar = this.d0;
            if (a5bVar != null) {
                gl.r(a5bVar);
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
                    ArrayList arrayList2 = qvbVar.b;
                    if (i2 < arrayList2.size()) {
                        if (((ivb) arrayList2.get(i2)).c != null) {
                            arrayList.add(((ivb) arrayList2.get(i2)).c);
                            ((ivb) arrayList2.get(i2)).c.searchQuery = null;
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
                a5b a5bVar2 = new a5b(this, str, (byte) 18);
                this.d0 = a5bVar2;
                gl.d3(a5bVar2, 200L);
            }
        } else if (view instanceof af4) {
            af4 af4Var = (af4) view;
            af4Var.c.b(0, false);
            af4Var.h(-qvbVar.a, 0L, 0L, 0L, tf4.k3[((jvb) ((ArrayList) this.t0.b).get(i)).b], false, str, z);
        } else if (view instanceof hs9) {
            hs9 hs9Var = (hs9) view;
            hs9Var.a.b(0, false);
            hs9Var.L = str;
            hs9Var.d(false);
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
    public final boolean b(se4 se4Var) {
        if (se4Var == null) {
            return false;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.v0;
            if (i >= arrayList.size()) {
                return false;
            }
            k27 k27Var = (k27) arrayList.get(i);
            if (k27Var != null && k27Var.e1() == se4Var.b && k27.B0(k27Var.k) == se4Var.a) {
                return true;
            }
            i++;
        }
    }

    @Override
    public final void c() {
        a aVar;
        aVar = ((d) this.w0).actionBar;
        aVar.R(null, null);
    }

    @Override
    public final void f(k27 k27Var, View view, int i) {
        a aVar;
        ArrayList arrayList = this.v0;
        if (!arrayList.remove(k27Var)) {
            arrayList.add(k27Var);
        }
        if (arrayList.isEmpty()) {
            aVar = ((d) this.w0).actionBar;
            aVar.x();
        }
    }

    @Override
    public final void n(k27 k27Var) {
        int i;
        Bundle bundle = new Bundle();
        long B0 = k27.B0(k27Var.k);
        boolean B = cf3.B(B0);
        qvb qvbVar = this.w0;
        if (B) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (!cf3.D(B0)) {
            i = ((d) qvbVar).currentAccount;
            TLRPC.Chat K0 = na7.q1(j5.a(i).a).K0(Long.valueOf(-B0));
            if (K0 != null && K0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -K0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        } else {
            bundle.putLong("user_id", B0);
        }
        bundle.putInt("message_id", k27Var.e1());
        qvbVar.presentFragment(new mu1(bundle));
    }

    @Override
    public final boolean t() {
        a aVar;
        aVar = ((d) this.w0).actionBar;
        return aVar.y();
    }
}
