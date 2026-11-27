package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class jb extends ny0 {
    public l9c S1;
    public TLRPC.TL_channelAdminLogEventsFilter T1;
    public ArrayList U1;
    public zh6 V1;
    public final boolean W1;
    public final dr0 X1;
    public boolean Y1;
    public boolean Z1;
    public boolean a2;
    public bf1 b2;
    public int c2;

    public jb(e eVar, TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter, zh6 zh6Var, boolean z) {
        super(eVar.getContext(), eVar, false, true, 2, eVar.getResourceProvider());
        this.T1 = new TLRPC.TL_channelAdminLogEventsFilter();
        this.Y1 = false;
        this.Z1 = false;
        this.a2 = false;
        this.u1 = 0.35f;
        J();
        int i = aob.i5;
        int v0 = aob.v0(i, this.J0);
        this.c2 = v0;
        s0(v0);
        U0();
        this.x1 = true;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = this.T1;
        if (tL_channelAdminLogEventsFilter != null) {
            tL_channelAdminLogEventsFilter2.join = tL_channelAdminLogEventsFilter.join;
            tL_channelAdminLogEventsFilter2.leave = tL_channelAdminLogEventsFilter.leave;
            tL_channelAdminLogEventsFilter2.edit_rank = tL_channelAdminLogEventsFilter.edit_rank;
            tL_channelAdminLogEventsFilter2.invite = tL_channelAdminLogEventsFilter.invite;
            tL_channelAdminLogEventsFilter2.ban = tL_channelAdminLogEventsFilter.ban;
            tL_channelAdminLogEventsFilter2.unban = tL_channelAdminLogEventsFilter.unban;
            tL_channelAdminLogEventsFilter2.kick = tL_channelAdminLogEventsFilter.kick;
            tL_channelAdminLogEventsFilter2.unkick = tL_channelAdminLogEventsFilter.unkick;
            tL_channelAdminLogEventsFilter2.promote = tL_channelAdminLogEventsFilter.promote;
            tL_channelAdminLogEventsFilter2.demote = tL_channelAdminLogEventsFilter.demote;
            tL_channelAdminLogEventsFilter2.info = tL_channelAdminLogEventsFilter.info;
            tL_channelAdminLogEventsFilter2.settings = tL_channelAdminLogEventsFilter.settings;
            tL_channelAdminLogEventsFilter2.pinned = tL_channelAdminLogEventsFilter.pinned;
            tL_channelAdminLogEventsFilter2.edit = tL_channelAdminLogEventsFilter.edit;
            tL_channelAdminLogEventsFilter2.delete = tL_channelAdminLogEventsFilter.delete;
            tL_channelAdminLogEventsFilter2.group_call = tL_channelAdminLogEventsFilter.group_call;
            tL_channelAdminLogEventsFilter2.invites = tL_channelAdminLogEventsFilter.invites;
        } else {
            tL_channelAdminLogEventsFilter2.join = true;
            tL_channelAdminLogEventsFilter2.leave = true;
            tL_channelAdminLogEventsFilter2.edit_rank = true;
            tL_channelAdminLogEventsFilter2.invite = true;
            tL_channelAdminLogEventsFilter2.ban = true;
            tL_channelAdminLogEventsFilter2.unban = true;
            tL_channelAdminLogEventsFilter2.kick = true;
            tL_channelAdminLogEventsFilter2.unkick = true;
            tL_channelAdminLogEventsFilter2.promote = true;
            tL_channelAdminLogEventsFilter2.demote = true;
            tL_channelAdminLogEventsFilter2.info = true;
            tL_channelAdminLogEventsFilter2.settings = true;
            tL_channelAdminLogEventsFilter2.pinned = true;
            tL_channelAdminLogEventsFilter2.edit = true;
            tL_channelAdminLogEventsFilter2.delete = true;
            tL_channelAdminLogEventsFilter2.group_call = true;
            tL_channelAdminLogEventsFilter2.invites = true;
        }
        if (zh6Var != null) {
            this.V1 = zh6Var.clone();
        }
        this.W1 = z;
        this.S1.O(false);
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        this.n1.setItemAnimator(zb3Var);
        this.n1.setOnItemClickListener(new m0(this, (byte) 5));
        dr0 dr0Var = new dr0(getContext(), this.J0, (d79) null);
        this.X1 = dr0Var;
        dr0Var.setClickable(true);
        dr0Var.setOrientation(1);
        dr0Var.setPadding(hl.L(10.0f), hl.L(10.0f), hl.L(10.0f), hl.L(10.0f));
        yob.h(i, this.J0, dr0Var);
        c51 c51Var = new c51(this.J0, getContext(), true);
        c51Var.f();
        c51Var.i(ob6.M0(2131750968, null), false, true);
        c51Var.setOnClickListener(new k1(this, (byte) 6));
        dr0Var.addView(c51Var, tre.r(-1, 48, 87));
        ViewGroup viewGroup = this.b;
        int i2 = this.u0;
        viewGroup.addView(dr0Var, tre.f(-2.0f, -1, 87, i2, 0, i2, 0));
        d79 d79Var = this.n1;
        int i3 = this.u0;
        d79Var.setPadding(i3, 0, i3, hl.L(68.0f));
        this.n1.s1();
    }

    @Override
    public final boolean D() {
        return !this.n1.canScrollVertically(-1);
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, true, new c(this, (byte) 6), this.J0);
        this.S1 = l9cVar;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return ob6.M0(2131751044, null);
    }

    public final String Z0(int i) {
        int i2;
        int i3;
        int i4;
        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = this.T1;
        int i5 = 0;
        if (i != 0) {
            if (i != 1) {
                return ((tL_channelAdminLogEventsFilter.delete ? 1 : 0) + (tL_channelAdminLogEventsFilter.edit ? 1 : 0) + (tL_channelAdminLogEventsFilter.pinned ? 1 : 0)) + "/3";
            }
            StringBuilder sb = new StringBuilder();
            if (tL_channelAdminLogEventsFilter.info || tL_channelAdminLogEventsFilter.settings) {
                i5 = 1;
            }
            sb.append(i5 + (tL_channelAdminLogEventsFilter.invites ? 1 : 0) + (tL_channelAdminLogEventsFilter.group_call ? 1 : 0));
            sb.append("/3");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        if (!tL_channelAdminLogEventsFilter.promote && !tL_channelAdminLogEventsFilter.demote) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        boolean z = this.W1;
        if (z && (tL_channelAdminLogEventsFilter.kick || tL_channelAdminLogEventsFilter.ban || tL_channelAdminLogEventsFilter.unkick || tL_channelAdminLogEventsFilter.unban)) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i6 = i2 + i3;
        if (tL_channelAdminLogEventsFilter.invite || tL_channelAdminLogEventsFilter.join) {
            i5 = 1;
        }
        sb2.append(i6 + i5 + (tL_channelAdminLogEventsFilter.leave ? 1 : 0) + (tL_channelAdminLogEventsFilter.edit_rank ? 1 : 0));
        sb2.append("/");
        if (z) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        sb2.append(i4);
        return sb2.toString();
    }

    public final void a1(ArrayList arrayList) {
        this.U1 = arrayList;
        if (arrayList != null && this.V1 == null) {
            this.V1 = new zh6();
            ArrayList arrayList2 = this.U1;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                long n = wf3.n(((TLRPC.ChannelParticipant) obj).peer);
                this.V1.k(n, uc7.s1(this.a).X1(Long.valueOf(n)));
            }
        }
        l9c l9cVar = this.S1;
        if (l9cVar != null) {
            l9cVar.O(true);
        }
    }

    @Override
    public final void n0(float f) {
        super.n0(f);
        this.X1.setTranslationY(-f);
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            int v0 = aob.v0(aob.i5, this.J0);
            if (v0 != this.c2) {
                this.c2 = v0;
                s0(v0);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
