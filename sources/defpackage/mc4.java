package defpackage;

import android.graphics.Paint;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class mc4 extends d {
    public boolean E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public il4 P;
    public bc4 Q;
    public final s54 R;
    public rkb a;
    public lc4 b;
    public final t97 c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public sha n;
    public int r;
    public long s;
    public long w;
    public p8c x;
    public p8c y;

    public mc4(t97 t97Var, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.r = -5;
        this.E = false;
        this.H = 0;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.R = new s54(this, (byte) 8);
        this.c = t97Var;
        this.d = tL_exportedChatlistInvite;
    }

    public final boolean Y(boolean z) {
        if (this.e.isEmpty() || !this.G) {
            return true;
        }
        if (z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = k96.M0(2131743596, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131743595, null);
            alertDialog$Builder.j(k96.M0(2131754213, null), new ed(this) {
                public final mc4 b;

                {
                    this.b = this;
                }

                @Override
                public final void u(hd hdVar2, int i) {
                    byte b = r2;
                    mc4 mc4Var = this.b;
                    switch (b) {
                        case 0:
                            mc4Var.g0();
                            return;
                        default:
                            mc4Var.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.g(k96.M0(2131747387, null), new ed(this) {
                public final mc4 b;

                {
                    this.b = this;
                }

                @Override
                public final void u(hd hdVar2, int i) {
                    byte b = r2;
                    mc4 mc4Var = this.b;
                    switch (b) {
                        case 0:
                            mc4Var.g0();
                            return;
                        default:
                            mc4Var.finishFragment();
                            return;
                    }
                }
            });
            showDialog(hdVar);
        }
        return false;
    }

    public final void Z() {
        boolean z;
        sha shaVar = this.n;
        if (this.G && !this.e.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        shaVar.a(z, true);
    }

    public final void a0() {
        boolean z;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null && this.G) {
            ArrayList arrayList = this.e;
            boolean z2 = true;
            if (arrayList.size() != tL_exportedChatlistInvite.peers.size()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                for (int i = 0; i < tL_exportedChatlistInvite.peers.size(); i++) {
                    if (!arrayList.contains(Long.valueOf(cf3.n(tL_exportedChatlistInvite.peers.get(i))))) {
                        break;
                    }
                }
            }
            z2 = z;
            if (!z2) {
                this.G = false;
                Z();
            }
        }
    }

    public final void b0(il4 il4Var, boolean z) {
        int i;
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        if (!z) {
            arrayList.addAll(arrayList2.subList(0, Math.min(c0(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(c0(), arrayList2.size())) {
            i = 2131751445;
        } else {
            i = 2131745478;
        }
        il4Var.a(k96.M0(i, null), new mn6(this, il4Var, z, (byte) 21));
        this.G = true;
        a0();
        Z();
        j0(true);
        k0();
        for (int i2 = 0; i2 < this.a.getChildCount(); i2++) {
            View childAt = this.a.getChildAt(i2);
            if (childAt instanceof za5) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((za5) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    public final int c0() {
        kr2 kr2Var;
        boolean p = getUserConfig().p();
        gr grVar = getMessagesController().k4;
        if (p) {
            kr2Var = grVar.c1;
        } else {
            kr2Var = grVar.b1;
        }
        return kr2Var.f();
    }

    @Override
    public final boolean canBeginSlide() {
        return Y(true);
    }

    @Override
    public final android.view.View createView(android.content.Context r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc4.createView(android.content.Context):android.view.View");
    }

    public final String d0() {
        String str;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && (str = tL_exportedChatlistInvite.url) != null) {
            return str.substring(str.lastIndexOf(47) + 1);
        }
        return null;
    }

    public final void e0(int i, View view) {
        String M0;
        String str;
        mc4 mc4Var;
        if (getParentActivity() != null && (view instanceof za5)) {
            Long l = (Long) this.h.get(i - this.M);
            long longValue = l.longValue();
            ArrayList arrayList = this.e;
            if (arrayList.contains(l)) {
                arrayList.remove(l);
                this.G = true;
                Z();
                ((za5) view).c(false, true);
                mc4Var = this;
            } else if (this.f.contains(l)) {
                if (arrayList.size() + 1 > c0()) {
                    showDialog(new h26(4, this.currentAccount, null, getParentActivity(), this));
                    return;
                }
                mc4Var = this;
                arrayList.add(l);
                mc4Var.G = true;
                mc4Var.Z();
                ((za5) view).c(true, true);
            } else {
                int i2 = -this.r;
                this.r = i2;
                gl.A3(i2, view, null);
                pw0.APP_ERROR.a();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(getMessagesController().V1(l));
                    TLRPC.User V1 = getMessagesController().V1(l);
                    if (V1 != null && V1.bot) {
                        str = k96.M0(2131750758, null);
                    } else {
                        str = k96.M0(2131750726, null);
                    }
                } else {
                    TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-longValue));
                    if (hc2.V(K0)) {
                        if (hc2.t0(K0)) {
                            M0 = k96.M0(2131750756, null);
                        } else {
                            M0 = k96.M0(2131750729, null);
                        }
                    } else if (hc2.t0(K0)) {
                        M0 = k96.M0(2131750745, null);
                    } else {
                        M0 = k96.M0(2131750728, null);
                    }
                    arrayList2.add(K0);
                    str = M0;
                }
                if (this.s != longValue || System.currentTimeMillis() - this.w > 1500) {
                    this.s = longValue;
                    this.w = System.currentTimeMillis();
                    u21.b0(this).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            mc4Var.a0();
            mc4Var.j0(true);
            mc4Var.k0();
        }
    }

    public final void f0(TLRPC.TL_error tL_error) {
        mc4 mc4Var;
        i0(false);
        this.E = false;
        if (tL_error != null) {
            if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                showDialog(new h26(12, this.currentAccount, null, getParentActivity(), this));
                return;
            }
            mc4Var = this;
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                mc4Var.showDialog(new h26(4, mc4Var.currentAccount, null, mc4Var.getParentActivity(), mc4Var));
                return;
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                mc4Var.showDialog(new h26(13, mc4Var.currentAccount, null, mc4Var.getParentActivity(), mc4Var));
                return;
            }
        } else {
            mc4Var = this;
        }
        mc4Var.finishFragment();
    }

    public final void g0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && !this.E && this.G) {
            i0(true);
            this.E = true;
            tL_exportedChatlistInvite.peers.clear();
            int i = 0;
            while (true) {
                arrayList = this.e;
                if (i >= arrayList.size()) {
                    break;
                }
                tL_exportedChatlistInvite.peers.add(getMessagesController().w1(((Long) arrayList.get(i)).longValue()));
                i++;
            }
            TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.c.a;
            tL_chatlists_editExportedInvite.slug = d0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().h1(((Long) arrayList.get(i2)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new ac4(this, (byte) 0));
            p8c p8cVar = this.y;
            if (p8cVar != null) {
                p8cVar.a(tL_exportedChatlistInvite);
            }
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void h0(boolean z) {
        String str;
        String str2;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null) {
            str = null;
        } else {
            str = tL_exportedChatlistInvite.title;
        }
        if (TextUtils.isEmpty(str)) {
            str2 = k96.M0(2131750692, null);
        } else {
            str2 = tL_exportedChatlistInvite.title;
        }
        String str3 = str2;
        pha phaVar = this.simpleActionBar;
        if (z) {
            phaVar.getClass();
            phaVar.I(str3, false, 220L, s33.h);
            return;
        }
        phaVar.setTitle(str3);
    }

    public final void i0(boolean z) {
        if (!z) {
            gl.r(this.R);
        }
        sha shaVar = this.n;
        if (shaVar != null) {
            shaVar.b(z);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z) {
        String G;
        int i;
        il4 il4Var = this.P;
        if (il4Var != null) {
            ArrayList arrayList = this.e;
            boolean z2 = false;
            if (arrayList.size() <= 0) {
                G = k96.N0("FilterInviteHeaderChatsEmpty");
            } else {
                G = k96.G(arrayList.size(), "FilterInviteHeaderChats", new Object[0]);
            }
            il4Var.b(G, z);
            ArrayList arrayList2 = this.f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(c0(), arrayList2.size())) {
                    z2 = true;
                }
                il4 il4Var2 = this.P;
                if (!z2) {
                    i = 2131745478;
                } else {
                    i = 2131751445;
                }
                il4Var2.a(k96.M0(i, null), new x6c((byte) 19, this, z2));
            } else {
                this.P.a("", null);
            }
            if (z) {
                gl.g2(((Object) this.P.a.getText()) + ", " + ((Object) this.P.b.getText()));
            }
        }
    }

    public final void k0() {
        bc4 bc4Var = this.Q;
        if (bc4Var == null) {
            return;
        }
        byte b = 0;
        if (this.d == null) {
            String M0 = k96.M0(2131750738, null);
            wla wlaVar = bc4Var.a;
            wlaVar.setText(M0);
            wlaVar.s = (byte) 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = bc4Var.getSubtitleTextView().getPaint().getFontMetricsInt();
        t97 t97Var = this.c;
        Spannable A5 = k27.A5(vu3.m(t97Var.b, fontMetricsInt, false, null, 0), t97Var.c, fontMetricsInt, false);
        bc4 bc4Var2 = this.Q;
        SpannableStringBuilder R2 = gl.R2(k96.F("FilterInviteHeader", this.e.size(), A5));
        boolean z = t97Var.n;
        wla wlaVar2 = bc4Var2.a;
        wlaVar2.setText(R2);
        if (z) {
            b = 26;
        }
        wlaVar2.s = b;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        return Y(z);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.F != 0) {
            getConnectionsManager().cancelRequest(this.F, true);
            this.F = 0;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
