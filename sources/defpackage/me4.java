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
public final class me4 extends d {
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
    public in4 P;
    public be4 Q;
    public final a14 R;
    public smb a;
    public le4 b;
    public final ub7 c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public uja n;
    public int r;
    public long s;
    public long w;
    public qac x;
    public qac y;

    public me4(ub7 ub7Var, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
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
        this.R = new a14(this, (byte) 15);
        this.c = ub7Var;
        this.d = tL_exportedChatlistInvite;
    }

    public final boolean Z(boolean z) {
        if (this.e.isEmpty() || !this.G) {
            return true;
        }
        if (z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = jb6.M0(2131743522, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131743521, null);
            alertDialog$Builder.j(jb6.M0(2131754181, null), new ee(this) {
                public final me4 b;

                {
                    this.b = this;
                }

                @Override
                public final void r(he heVar2, int i) {
                    byte b = r2;
                    me4 me4Var = this.b;
                    switch (b) {
                        case 0:
                            me4Var.h0();
                            return;
                        default:
                            me4Var.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.g(jb6.M0(2131747313, null), new ee(this) {
                public final me4 b;

                {
                    this.b = this;
                }

                @Override
                public final void r(he heVar2, int i) {
                    byte b = r2;
                    me4 me4Var = this.b;
                    switch (b) {
                        case 0:
                            me4Var.h0();
                            return;
                        default:
                            me4Var.finishFragment();
                            return;
                    }
                }
            });
            showDialog(heVar);
        }
        return false;
    }

    public final void a0() {
        boolean z;
        uja ujaVar = this.n;
        if (this.G && !this.e.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        ujaVar.a(z, true);
    }

    public final void b0() {
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
                    if (!arrayList.contains(Long.valueOf(pg3.n(tL_exportedChatlistInvite.peers.get(i))))) {
                        break;
                    }
                }
            }
            z2 = z;
            if (!z2) {
                this.G = false;
                a0();
            }
        }
    }

    public final void c0(in4 in4Var, boolean z) {
        int i;
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        if (!z) {
            arrayList.addAll(arrayList2.subList(0, Math.min(d0(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(d0(), arrayList2.size())) {
            i = 2131751394;
        } else {
            i = 2131745404;
        }
        in4Var.a(jb6.M0(i, null), new np6(this, in4Var, z, (byte) 21));
        this.G = true;
        b0();
        a0();
        k0(true);
        l0();
        for (int i2 = 0; i2 < this.a.getChildCount(); i2++) {
            View childAt = this.a.getChildAt(i2);
            if (childAt instanceof xc5) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((xc5) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        return Z(true);
    }

    @Override
    public final android.view.View createView(android.content.Context r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me4.createView(android.content.Context):android.view.View");
    }

    public final int d0() {
        vs2 vs2Var;
        boolean p = getUserConfig().p();
        gs gsVar = getMessagesController().l4;
        if (p) {
            vs2Var = gsVar.c1;
        } else {
            vs2Var = gsVar.b1;
        }
        return vs2Var.f();
    }

    public final String e0() {
        String str;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && (str = tL_exportedChatlistInvite.url) != null) {
            return str.substring(str.lastIndexOf(47) + 1);
        }
        return null;
    }

    public final void f0(int i, View view) {
        String M0;
        String str;
        me4 me4Var;
        if (getParentActivity() != null && (view instanceof xc5)) {
            Long l = (Long) this.h.get(i - this.M);
            long longValue = l.longValue();
            ArrayList arrayList = this.e;
            if (arrayList.contains(l)) {
                arrayList.remove(l);
                this.G = true;
                a0();
                ((xc5) view).c(false, true);
                me4Var = this;
            } else if (this.f.contains(l)) {
                if (arrayList.size() + 1 > d0()) {
                    showDialog(new i46(4, this.currentAccount, null, getParentActivity(), this));
                    return;
                }
                me4Var = this;
                arrayList.add(l);
                me4Var.G = true;
                me4Var.a0();
                ((xc5) view).c(true, true);
            } else {
                int i2 = -this.r;
                this.r = i2;
                gm.A3(i2, view, null);
                xx0.APP_ERROR.a();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(getMessagesController().W1(l));
                    TLRPC.User W1 = getMessagesController().W1(l);
                    if (W1 != null && W1.bot) {
                        str = jb6.M0(2131750707, null);
                    } else {
                        str = jb6.M0(2131750675, null);
                    }
                } else {
                    TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-longValue));
                    if (sd2.V(L0)) {
                        if (sd2.t0(L0)) {
                            M0 = jb6.M0(2131750705, null);
                        } else {
                            M0 = jb6.M0(2131750678, null);
                        }
                    } else if (sd2.t0(L0)) {
                        M0 = jb6.M0(2131750694, null);
                    } else {
                        M0 = jb6.M0(2131750677, null);
                    }
                    arrayList2.add(L0);
                    str = M0;
                }
                if (this.s != longValue || System.currentTimeMillis() - this.w > 1500) {
                    this.s = longValue;
                    this.w = System.currentTimeMillis();
                    c41.b0(this).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            me4Var.b0();
            me4Var.k0(true);
            me4Var.l0();
        }
    }

    public final void g0(TLRPC.TL_error tL_error) {
        me4 me4Var;
        j0(false);
        this.E = false;
        if (tL_error != null) {
            if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                showDialog(new i46(12, this.currentAccount, null, getParentActivity(), this));
                return;
            }
            me4Var = this;
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                me4Var.showDialog(new i46(4, me4Var.currentAccount, null, me4Var.getParentActivity(), me4Var));
                return;
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                me4Var.showDialog(new i46(13, me4Var.currentAccount, null, me4Var.getParentActivity(), me4Var));
                return;
            }
        } else {
            me4Var = this;
        }
        me4Var.finishFragment();
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void h0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && !this.E && this.G) {
            j0(true);
            this.E = true;
            tL_exportedChatlistInvite.peers.clear();
            int i = 0;
            while (true) {
                arrayList = this.e;
                if (i >= arrayList.size()) {
                    break;
                }
                tL_exportedChatlistInvite.peers.add(getMessagesController().x1(((Long) arrayList.get(i)).longValue()));
                i++;
            }
            TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.c.a;
            tL_chatlists_editExportedInvite.slug = e0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().i1(((Long) arrayList.get(i2)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new ae4(this, (byte) 0));
            qac qacVar = this.y;
            if (qacVar != null) {
                qacVar.a(tL_exportedChatlistInvite);
            }
        }
    }

    public final void i0(boolean z) {
        String str;
        String str2;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null) {
            str = null;
        } else {
            str = tL_exportedChatlistInvite.title;
        }
        if (TextUtils.isEmpty(str)) {
            str2 = jb6.M0(2131750641, null);
        } else {
            str2 = tL_exportedChatlistInvite.title;
        }
        String str3 = str2;
        rja rjaVar = this.simpleActionBar;
        if (z) {
            rjaVar.getClass();
            rjaVar.I(str3, false, 220L, d53.h);
            return;
        }
        rjaVar.setTitle(str3);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z) {
        if (!z) {
            gm.r(this.R);
        }
        uja ujaVar = this.n;
        if (ujaVar != null) {
            ujaVar.b(z);
        }
    }

    public final void k0(boolean z) {
        String G;
        int i;
        in4 in4Var = this.P;
        if (in4Var != null) {
            ArrayList arrayList = this.e;
            boolean z2 = false;
            if (arrayList.size() <= 0) {
                G = jb6.N0("FilterInviteHeaderChatsEmpty");
            } else {
                G = jb6.G(arrayList.size(), "FilterInviteHeaderChats", new Object[0]);
            }
            in4Var.b(G, z);
            ArrayList arrayList2 = this.f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(d0(), arrayList2.size())) {
                    z2 = true;
                }
                in4 in4Var2 = this.P;
                if (!z2) {
                    i = 2131745404;
                } else {
                    i = 2131751394;
                }
                in4Var2.a(jb6.M0(i, null), new y8c((byte) 19, this, z2));
            } else {
                this.P.a("", null);
            }
            if (z) {
                gm.g2(((Object) this.P.a.getText()) + ", " + ((Object) this.P.b.getText()));
            }
        }
    }

    public final void l0() {
        be4 be4Var = this.Q;
        if (be4Var == null) {
            return;
        }
        byte b = 0;
        if (this.d == null) {
            String M0 = jb6.M0(2131750687, null);
            xna xnaVar = be4Var.a;
            xnaVar.setText(M0);
            xnaVar.s = (byte) 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = be4Var.getSubtitleTextView().getPaint().getFontMetricsInt();
        ub7 ub7Var = this.c;
        Spannable A5 = k47.A5(gw3.m(ub7Var.b, fontMetricsInt, false, null, 0), ub7Var.c, fontMetricsInt, false);
        be4 be4Var2 = this.Q;
        SpannableStringBuilder R2 = gm.R2(jb6.F("FilterInviteHeader", this.e.size(), A5));
        boolean z = ub7Var.n;
        xna xnaVar2 = be4Var2.a;
        xnaVar2.setText(R2);
        if (z) {
            b = 26;
        }
        xnaVar2.s = b;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        return Z(z);
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
