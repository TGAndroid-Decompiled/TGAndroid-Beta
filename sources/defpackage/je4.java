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
import org.telegram.ui.ActionBar.e;
public final class je4 extends e {
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
    public nn4 P;
    public yd4 Q;
    public final lw3 R;
    public qob a;
    public ie4 b;
    public final ac7 c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public nla n;
    public int r;
    public long s;
    public long w;
    public pcc x;
    public pcc y;

    public je4(ac7 ac7Var, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
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
        this.R = new lw3(this, (byte) 21);
        this.c = ac7Var;
        this.d = tL_exportedChatlistInvite;
    }

    public final boolean Y(boolean z) {
        if (this.e.isEmpty() || !this.G) {
            return true;
        }
        if (z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = ob6.M0(2131743490, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131743489, null);
            alertDialog$Builder.j(ob6.M0(2131754209, null), new fd(this) {
                public final je4 b;

                {
                    this.b = this;
                }

                @Override
                public final void w(id idVar2, int i) {
                    byte b = r2;
                    je4 je4Var = this.b;
                    switch (b) {
                        case 0:
                            je4Var.g0();
                            return;
                        default:
                            je4Var.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.g(ob6.M0(2131747307, null), new fd(this) {
                public final je4 b;

                {
                    this.b = this;
                }

                @Override
                public final void w(id idVar2, int i) {
                    byte b = r2;
                    je4 je4Var = this.b;
                    switch (b) {
                        case 0:
                            je4Var.g0();
                            return;
                        default:
                            je4Var.finishFragment();
                            return;
                    }
                }
            });
            showDialog(idVar);
        }
        return false;
    }

    public final void Z() {
        boolean z;
        nla nlaVar = this.n;
        if (this.G && !this.e.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        nlaVar.a(z, true);
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
                    if (!arrayList.contains(Long.valueOf(wf3.n(tL_exportedChatlistInvite.peers.get(i))))) {
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

    public final void b0(nn4 nn4Var, boolean z) {
        int i;
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        if (!z) {
            arrayList.addAll(arrayList2.subList(0, Math.min(c0(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(c0(), arrayList2.size())) {
            i = 2131751422;
        } else {
            i = 2131745398;
        }
        nn4Var.a(ob6.M0(i, null), new ds6(this, nn4Var, z, (byte) 20));
        this.G = true;
        a0();
        Z();
        j0(true);
        k0();
        for (int i2 = 0; i2 < this.a.getChildCount(); i2++) {
            View childAt = this.a.getChildAt(i2);
            if (childAt instanceof bd5) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((bd5) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    public final int c0() {
        ds2 ds2Var;
        boolean p = getUserConfig().p();
        hr hrVar = getMessagesController().l4;
        if (p) {
            ds2Var = hrVar.k1;
        } else {
            ds2Var = hrVar.j1;
        }
        return ds2Var.f();
    }

    @Override
    public final boolean canBeginSlide() {
        return Y(true);
    }

    @Override
    public final android.view.View createView(android.content.Context r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.je4.createView(android.content.Context):android.view.View");
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
        je4 je4Var;
        if (getParentActivity() != null && (view instanceof bd5)) {
            Long l = (Long) this.h.get(i - this.M);
            long longValue = l.longValue();
            ArrayList arrayList = this.e;
            if (arrayList.contains(l)) {
                arrayList.remove(l);
                this.G = true;
                Z();
                ((bd5) view).c(false, true);
                je4Var = this;
            } else if (this.f.contains(l)) {
                if (arrayList.size() + 1 > c0()) {
                    showDialog(new l46(4, this.currentAccount, null, getParentActivity(), this));
                    return;
                }
                je4Var = this;
                arrayList.add(l);
                je4Var.G = true;
                je4Var.Z();
                ((bd5) view).c(true, true);
            } else {
                int i2 = -this.r;
                this.r = i2;
                hl.A3(i2, view, null);
                yw0.APP_ERROR.a();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(getMessagesController().X1(l));
                    TLRPC.User X1 = getMessagesController().X1(l);
                    if (X1 != null && X1.bot) {
                        str = ob6.M0(2131750735, null);
                    } else {
                        str = ob6.M0(2131750703, null);
                    }
                } else {
                    TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(-longValue));
                    if (xc2.V(M02)) {
                        if (xc2.t0(M02)) {
                            M0 = ob6.M0(2131750733, null);
                        } else {
                            M0 = ob6.M0(2131750706, null);
                        }
                    } else if (xc2.t0(M02)) {
                        M0 = ob6.M0(2131750722, null);
                    } else {
                        M0 = ob6.M0(2131750705, null);
                    }
                    arrayList2.add(M02);
                    str = M0;
                }
                if (this.s != longValue || System.currentTimeMillis() - this.w > 1500) {
                    this.s = longValue;
                    this.w = System.currentTimeMillis();
                    d31.b0(this).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            je4Var.a0();
            je4Var.j0(true);
            je4Var.k0();
        }
    }

    public final void f0(TLRPC.TL_error tL_error) {
        je4 je4Var;
        i0(false);
        this.E = false;
        if (tL_error != null) {
            if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                showDialog(new l46(12, this.currentAccount, null, getParentActivity(), this));
                return;
            }
            je4Var = this;
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                je4Var.showDialog(new l46(4, je4Var.currentAccount, null, je4Var.getParentActivity(), je4Var));
                return;
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                je4Var.showDialog(new l46(13, je4Var.currentAccount, null, je4Var.getParentActivity(), je4Var));
                return;
            }
        } else {
            je4Var = this;
        }
        je4Var.finishFragment();
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
                tL_exportedChatlistInvite.peers.add(getMessagesController().y1(((Long) arrayList.get(i)).longValue()));
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
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().j1(((Long) arrayList.get(i2)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new vd4(this, (byte) 1));
            pcc pccVar = this.y;
            if (pccVar != null) {
                pccVar.a(tL_exportedChatlistInvite);
            }
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
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
            str2 = ob6.M0(2131750669, null);
        } else {
            str2 = tL_exportedChatlistInvite.title;
        }
        String str3 = str2;
        jla jlaVar = this.simpleActionBar;
        if (z) {
            jlaVar.getClass();
            jlaVar.K(str3, false, 220L, k43.h);
            return;
        }
        jlaVar.setTitle(str3);
    }

    public final void i0(boolean z) {
        if (!z) {
            hl.r(this.R);
        }
        nla nlaVar = this.n;
        if (nlaVar != null) {
            nlaVar.b(z);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z) {
        String G;
        int i;
        nn4 nn4Var = this.P;
        if (nn4Var != null) {
            ArrayList arrayList = this.e;
            boolean z2 = false;
            if (arrayList.size() <= 0) {
                G = ob6.N0("FilterInviteHeaderChatsEmpty");
            } else {
                G = ob6.G(arrayList.size(), "FilterInviteHeaderChats", new Object[0]);
            }
            nn4Var.b(G, z);
            ArrayList arrayList2 = this.f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(c0(), arrayList2.size())) {
                    z2 = true;
                }
                nn4 nn4Var2 = this.P;
                if (!z2) {
                    i = 2131745398;
                } else {
                    i = 2131751422;
                }
                nn4Var2.a(ob6.M0(i, null), new xac((byte) 19, this, z2));
            } else {
                this.P.a("", null);
            }
            if (z) {
                hl.g2(((Object) this.P.a.getText()) + ", " + ((Object) this.P.b.getText()));
            }
        }
    }

    public final void k0() {
        yd4 yd4Var = this.Q;
        if (yd4Var == null) {
            return;
        }
        byte b = 0;
        if (this.d == null) {
            String M0 = ob6.M0(2131750715, null);
            tpa tpaVar = yd4Var.a;
            tpaVar.setText(M0);
            tpaVar.s = (byte) 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = yd4Var.getSubtitleTextView().getPaint().getFontMetricsInt();
        ac7 ac7Var = this.c;
        Spannable A5 = r47.A5(pv3.m(ac7Var.b, fontMetricsInt, false, null, 0), ac7Var.c, fontMetricsInt, false);
        yd4 yd4Var2 = this.Q;
        SpannableStringBuilder R2 = hl.R2(ob6.F("FilterInviteHeader", this.e.size(), A5));
        boolean z = ac7Var.n;
        tpa tpaVar2 = yd4Var2.a;
        tpaVar2.setText(R2);
        if (z) {
            b = 26;
        }
        tpaVar2.s = b;
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
