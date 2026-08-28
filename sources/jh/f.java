package jh;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.d0;
import f2.q1;
import ih.f6;
import ih.n6;
import ih.q5;
import java.util.ArrayList;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.z41;
import org.telegram.ui.ja;
import org.telegram.ui.to;
import org.telegram.ui.uo;
import org.telegram.ui.va1;
import org.telegram.ui.vo;
import org.telegram.ui.vu0;
import org.telegram.ui.xu0;
import qh.u1;
public final class f extends d0 {
    public final int d;
    public final Object f14349e;

    public f(Object obj, int i9) {
        this.d = i9;
        this.f14349e = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, q1 q1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, q1Var);
                q1Var.f5501a.setPressed(false);
                return;
            case 1:
                super.a(recyclerView, q1Var);
                q1Var.f5501a.setPressed(false);
                return;
            case 2:
                super.a(recyclerView, q1Var);
                View view = q1Var.f5501a;
                view.setPressed(false);
                view.setBackground(null);
                return;
            case 3:
                super.a(recyclerView, q1Var);
                q1Var.f5501a.setPressed(false);
                return;
            case 4:
                i51 i51Var = (i51) this.f14349e;
                super.a(recyclerView, q1Var);
                View view2 = q1Var.f5501a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof u1) {
                    u1 u1Var = (u1) view2.getBackground();
                    if (u1Var.f46739c) {
                        u1Var.f46739c = false;
                        u1Var.invalidateSelf();
                    }
                }
                if (i51Var.A1()) {
                    i51Var.F1(q1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(gr.h).start();
                    return;
                }
                return;
            case 5:
            default:
                super.a(recyclerView, q1Var);
                return;
            case 6:
                super.a(recyclerView, q1Var);
                q1Var.f5501a.setPressed(false);
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, q1 q1Var) {
        switch (this.d) {
            case 0:
                q qVar = (q) this.f14349e;
                if (qVar.S.C.f28178y1 && qVar.v.L(q1Var.b())) {
                    qVar.f14367f.setItemAnimator(qVar.f14368n);
                    return d0.l(15, 0);
                }
                return d0.l(0, 0);
            case 1:
                if (q1Var.f5505f == 1 && ((ja) q1Var.f5501a).C) {
                    return d0.l(3, 0);
                }
                return d0.l(0, 0);
            case 2:
                if (q1Var.f5505f != 5) {
                    return d0.l(0, 0);
                }
                return d0.l(3, 0);
            case 3:
                int b10 = q1Var.b();
                gm0 gm0Var = (gm0) this.f14349e;
                if (b10 >= gm0Var.v && q1Var.b() < gm0Var.f28816w) {
                    return d0.l(3, 0);
                }
                return d0.l(0, 0);
            case 4:
                i51 i51Var = (i51) this.f14349e;
                if (i51Var.Y2 && i51Var.U2.H(q1Var.b()) >= 0) {
                    int i9 = 15;
                    if (i51Var.T2.f5432o == 0) {
                        if (!i51Var.X2) {
                            i9 = 12;
                        }
                    } else if (!i51Var.X2) {
                        i9 = 3;
                    }
                    return d0.l(i9, 0);
                }
                return d0.l(0, 0);
            case 5:
                if (((n2.p) ((m71) this.f14349e).f30759y).o(q1Var.b())) {
                    return d0.l(12, 0);
                }
                return d0.l(0, 0);
            default:
                if (q1Var.f5505f == 5 && r(q1Var.b())) {
                    return d0.l(3, 0);
                }
                return d0.l(0, 0);
        }
    }

    @Override
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((q) this.f14349e).S.C.f28178y1;
            case 1:
            case 2:
            case 5:
            default:
                return super.k();
            case 3:
                return ((gm0) this.f14349e).E.f();
            case 4:
                i51 i51Var = (i51) this.f14349e;
                if (i51Var.Y2 && i51Var.a3) {
                    return true;
                }
                return false;
            case 6:
                return true;
        }
    }

    @Override
    public void m(Canvas canvas, RecyclerView recyclerView, q1 q1Var, float f10, float f11, int i9, boolean z10) {
        switch (this.d) {
            case 4:
                i51 i51Var = (i51) this.f14349e;
                if (i9 != 2 || z10 || !i51Var.A1()) {
                    super.m(canvas, recyclerView, q1Var, f10, f11, i9, z10);
                    if (i9 == 2 && z10) {
                        i51Var.E1(q1Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                super.m(canvas, recyclerView, q1Var, f10, f11, i9, z10);
                ((m71) this.f14349e).invalidate();
                return;
            default:
                super.m(canvas, recyclerView, q1Var, f10, f11, i9, z10);
                return;
        }
    }

    @Override
    public final boolean n(RecyclerView recyclerView, q1 q1Var, q1 q1Var2) {
        ArrayList arrayList;
        int i9;
        int i10;
        int i11;
        switch (this.d) {
            case 0:
                l lVar = ((q) this.f14349e).v;
                if (!lVar.L(q1Var.b()) || !lVar.L(q1Var2.b())) {
                    return false;
                }
                int b10 = q1Var.b();
                int b11 = q1Var2.b();
                ArrayList arrayList2 = lVar.f14360n;
                n6 n6Var = lVar.f14358e;
                if (n6Var != null && b10 >= 0 && b10 < n6Var.f11851i.size() && b11 >= 0 && b11 < lVar.f14358e.f11851i.size()) {
                    if (lVar.f14358e instanceof f6) {
                        arrayList = new ArrayList();
                        for (int i12 = 0; i12 < lVar.f14358e.f11851i.size(); i12++) {
                            arrayList.add(Integer.valueOf(((MessageObject) lVar.f14358e.f11851i.get(i12)).getId()));
                        }
                    } else {
                        arrayList = new ArrayList(lVar.f14358e.f11850g);
                    }
                    if (!lVar.f14361r) {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        lVar.f14361r = true;
                    }
                    MessageObject messageObject = (MessageObject) lVar.f14358e.f11851i.get(b10);
                    MessageObject messageObject2 = (MessageObject) lVar.f14358e.f11851i.get(b11);
                    arrayList.remove(Integer.valueOf(messageObject.getId()));
                    arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
                    lVar.f14358e.C(arrayList, false);
                    lVar.p(b10, b11);
                }
                return true;
            case 1:
                if (q1Var.f5505f == q1Var2.f5505f) {
                    View view = q1Var2.f5501a;
                    if (!(view instanceof ja) || ((ja) view).C) {
                        to toVar = ((uo) this.f14349e).T2;
                        int b12 = q1Var.b();
                        int b13 = q1Var2.b();
                        int i13 = b12 - 1;
                        int i14 = b13 - 1;
                        uo uoVar = toVar.f43045c;
                        vo voVar = uoVar.W2;
                        ArrayList arrayList3 = voVar.J;
                        if (i13 >= voVar.J.size() || i14 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            uoVar.U2 = true;
                        }
                        arrayList3.set(i13, (TLRPC.TL_username) arrayList3.get(i14));
                        arrayList3.set(i14, (TLRPC.TL_username) arrayList3.get(i13));
                        toVar.p(b12, b13);
                        int size = arrayList3.size();
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        toVar.n(b12, 3);
                        toVar.n(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (q1Var.f5505f != q1Var2.f5505f) {
                    return false;
                }
                hn hnVar = ((jn) this.f14349e).f29789r;
                int b14 = q1Var.b();
                int b15 = q1Var2.b();
                jn jnVar = hnVar.d;
                int i15 = jnVar.f29787p0;
                yg.f fVar = jnVar.f29779h1;
                int i16 = b14 - i15;
                int i17 = b15 - i15;
                if (i16 >= 0 && i17 >= 0 && i16 < (i9 = jnVar.I) && i17 < i9) {
                    yg.e b16 = fVar.b(i16);
                    SparseArray sparseArray = fVar.f50223a;
                    sparseArray.put(i16, fVar.b(i17));
                    sparseArray.put(i17, b16);
                    CharSequence[] charSequenceArr = jnVar.G;
                    CharSequence charSequence = charSequenceArr[i16];
                    charSequenceArr[i16] = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequence;
                    boolean[] zArr = jnVar.H;
                    boolean z10 = zArr[i16];
                    zArr[i16] = zArr[i17];
                    zArr[i17] = z10;
                    hnVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = q1Var2.b();
                gm0 gm0Var = (gm0) this.f14349e;
                ArrayList arrayList4 = gm0Var.f28811e;
                if (b17 >= gm0Var.v && q1Var2.b() < gm0Var.f28816w) {
                    int b18 = q1Var.b();
                    int b19 = q1Var2.b();
                    int i18 = gm0Var.v;
                    int i19 = b18 - i18;
                    int i20 = b19 - i18;
                    arrayList4.indexOf(Integer.valueOf(i19));
                    arrayList4.get(b18 - gm0Var.v);
                    MessageObject messageObject3 = (MessageObject) arrayList4.get(i19);
                    MessageObject messageObject4 = (MessageObject) arrayList4.get(i20);
                    arrayList4.set(i19, messageObject4);
                    arrayList4.set(i20, messageObject3);
                    DownloadController.getInstance(gm0Var.d).swapLoadingPriority(messageObject3, messageObject4);
                    gm0Var.f28810c.p(b18, b19);
                    return false;
                }
                return false;
            case 4:
                i51 i51Var = (i51) this.f14349e;
                z41 z41Var = i51Var.U2;
                if (z41Var.H(q1Var.b()) >= 0 && z41Var.H(q1Var.b()) == z41Var.H(q1Var2.b())) {
                    int b20 = q1Var.b();
                    int b21 = q1Var2.b();
                    ArrayList arrayList5 = z41Var.f35191x;
                    if (z41Var.H != null) {
                        int H = z41Var.H(b20);
                        int H2 = z41Var.H(b21);
                        if (H >= 0 && H == H2) {
                            boolean J = z41Var.J(b20);
                            boolean J2 = z41Var.J(b21);
                            arrayList5.add(b21, (l41) arrayList5.remove(b20));
                            z41Var.p(b20, b21);
                            if (z41Var.J(b21) != J) {
                                z41Var.n(b21, 3);
                            }
                            if (z41Var.J(b20) != J2) {
                                z41Var.n(b20, 3);
                            }
                            if (z41Var.G && (i10 = z41Var.F) != H) {
                                z41Var.F(i10);
                            }
                            z41Var.G = true;
                            z41Var.F = H;
                        }
                    }
                    i51Var.H1();
                    return true;
                }
                return false;
            case 5:
                int b22 = q1Var.b();
                int b23 = q1Var2.b();
                m71 m71Var = (m71) this.f14349e;
                ArrayList arrayList6 = m71Var.h;
                boolean z11 = false;
                int i21 = 0;
                z11 = false;
                if (((n2.p) m71Var.f30759y).o(b22) && ((n2.p) m71Var.f30759y).o(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    m71Var.f30758x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i21 < size2) {
                        Object obj = arrayList6.get(i21);
                        i21++;
                        arrayList7.add(Integer.valueOf(((j71) obj).f29664a));
                    }
                    e71 e71Var = ((n71) ((n2.p) m71Var.f30759y).f18343b).H;
                    z11 = true;
                    z11 = true;
                    if (e71Var != null) {
                        e71Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (q1Var.f5505f == q1Var2.f5505f && r(q1Var.b()) && r(q1Var2.b())) {
                    vu0 vu0Var = ((xu0) this.f14349e).f44609b;
                    int b24 = q1Var.b();
                    int b25 = q1Var2.b();
                    xu0 xu0Var = vu0Var.d;
                    int i22 = xu0Var.f44621j0;
                    int i23 = b24 - i22;
                    int i24 = b25 - i22;
                    if (i23 >= 0 && i24 >= 0 && i23 < (i11 = xu0Var.f44640y) && i24 < i11) {
                        CharSequence[] charSequenceArr2 = xu0Var.v;
                        CharSequence charSequence2 = charSequenceArr2[i23];
                        charSequenceArr2[i23] = charSequenceArr2[i24];
                        charSequenceArr2[i24] = charSequence2;
                        int[] iArr = xu0Var.f44629r;
                        if (iArr != null) {
                            int i25 = iArr[i23];
                            iArr[i23] = iArr[i24];
                            iArr[i24] = i25;
                        }
                        boolean[] zArr2 = xu0Var.f44636w;
                        boolean z12 = zArr2[i23];
                        zArr2[i23] = zArr2[i24];
                        zArr2[i24] = z12;
                        vu0Var.p(b24, b25);
                    }
                    return true;
                }
                return false;
        }
    }

    @Override
    public void o(RecyclerView recyclerView, q1 q1Var, q1 q1Var2, int i9, int i10, int i11) {
        switch (this.d) {
            case 4:
                return;
            default:
                super.o(recyclerView, q1Var, q1Var2, i9, i10, i11);
                return;
        }
    }

    @Override
    public void p(q1 q1Var, int i9) {
        ArrayList arrayList;
        boolean z10;
        switch (this.d) {
            case 0:
                q qVar = (q) this.f14349e;
                i iVar = qVar.f14367f;
                if (q1Var != null) {
                    iVar.d1(false);
                }
                if (i9 == 0) {
                    l lVar = qVar.v;
                    ArrayList arrayList2 = lVar.f14360n;
                    n6 n6Var = lVar.f14358e;
                    if (n6Var != null && lVar.f14361r) {
                        if (n6Var instanceof f6) {
                            arrayList = new ArrayList();
                            for (int i10 = 0; i10 < lVar.f14358e.f11851i.size(); i10++) {
                                arrayList.add(Integer.valueOf(((MessageObject) lVar.f14358e.f11851i.get(i10)).getId()));
                            }
                        } else {
                            arrayList = n6Var.f11850g;
                        }
                        if (arrayList2.size() != arrayList.size()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            int i11 = 0;
                            while (true) {
                                if (i11 < arrayList2.size()) {
                                    if (arrayList2.get(i11) != arrayList.get(i11)) {
                                        z10 = true;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                        }
                        if (z10) {
                            lVar.f14358e.C(arrayList, true);
                        }
                        lVar.f14361r = false;
                    }
                    iVar.setItemAnimator(null);
                    return;
                }
                iVar.I0(false);
                if (q1Var != null) {
                    q1Var.f5501a.setPressed(true);
                    return;
                }
                return;
            case 1:
                uo uoVar = (uo) this.f14349e;
                vo voVar = uoVar.W2;
                if (i9 == 0) {
                    voVar.H = false;
                    if (uoVar.U2) {
                        TLRPC.Chat chat = voVar.T;
                        ArrayList arrayList3 = voVar.J;
                        ArrayList arrayList4 = voVar.I;
                        if (chat != null) {
                            uoVar.U2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = voVar.T;
                            tL_inputChannel.channel_id = chat2.f22380id;
                            tL_inputChannel.access_hash = chat2.access_hash;
                            tL_channels_reorderUsernames.channel = tL_inputChannel;
                            ArrayList<String> arrayList5 = new ArrayList<>();
                            for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                                if (((TLRPC.TL_username) arrayList4.get(i12)).active) {
                                    arrayList5.add(((TLRPC.TL_username) arrayList4.get(i12)).username);
                                }
                            }
                            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                if (((TLRPC.TL_username) arrayList3.get(i13)).active) {
                                    arrayList5.add(((TLRPC.TL_username) arrayList3.get(i13)).username);
                                }
                            }
                            tL_channels_reorderUsernames.order = arrayList5;
                            voVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new q5(7));
                            voVar.T.usernames.clear();
                            voVar.T.usernames.addAll(arrayList4);
                            voVar.T.usernames.addAll(arrayList3);
                            voVar.getMessagesController().putChat(voVar.T, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                voVar.H = true;
                uoVar.I0(false);
                q1Var.f5501a.setPressed(true);
                return;
            case 2:
                jn jnVar = (jn) this.f14349e;
                va1 va1Var = jnVar.f29791s;
                if (i9 != 0) {
                    va1Var.setItemAnimator(jnVar.v);
                    va1Var.I0(false);
                    q1Var.f5501a.setPressed(true);
                    q1Var.f5501a.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, jnVar.f27492a));
                    return;
                }
                return;
            case 3:
                if (i9 != 0) {
                    ((gm0) this.f14349e).f28809b.I0(false);
                    q1Var.f5501a.setPressed(true);
                    return;
                }
                return;
            case 4:
                i51 i51Var = (i51) this.f14349e;
                if (q1Var != null) {
                    i51Var.d1(false);
                }
                if (i9 == 0) {
                    z41 z41Var = i51Var.U2;
                    if (z41Var.G) {
                        z41Var.F(z41Var.F);
                    }
                    if (i51Var.Z2 != null) {
                        i51Var.D1();
                        i51Var.Z2 = null;
                        return;
                    }
                    return;
                }
                i51Var.I0(false);
                if (q1Var != null) {
                    View view = q1Var.f5501a;
                    view.setPressed(true);
                    if (view.getBackground() instanceof u1) {
                        u1 u1Var = (u1) view.getBackground();
                        if (!u1Var.f46739c) {
                            u1Var.f46739c = true;
                            u1Var.invalidateSelf();
                        }
                    }
                    if (i9 == 2) {
                        i51Var.Z2 = q1Var;
                        i51Var.G1(q1Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
            default:
                return;
            case 6:
                if (i9 != 0) {
                    ((xu0) this.f14349e).f44611c.I0(false);
                    q1Var.f5501a.setPressed(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(q1 q1Var) {
        int i9 = this.d;
    }

    public boolean r(int i9) {
        xu0 xu0Var = (xu0) this.f14349e;
        if (!xu0Var.E || i9 - xu0Var.f44621j0 >= xu0Var.f44638x) {
            return true;
        }
        return false;
    }

    private final void t(q1 q1Var) {
    }

    private final void u(q1 q1Var) {
    }

    private final void v(q1 q1Var) {
    }

    private final void w(q1 q1Var) {
    }

    private final void x(q1 q1Var) {
    }

    private final void y(q1 q1Var) {
    }

    private final void z(q1 q1Var) {
    }

    private final void s(RecyclerView recyclerView, q1 q1Var, q1 q1Var2, int i9, int i10, int i11) {
    }
}
