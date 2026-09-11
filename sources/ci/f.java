package ci;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.b8;
import bi.c7;
import bi.l8;
import java.util.ArrayList;
import ji.z1;
import k2.g0;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.ec1;
import org.telegram.ui.jp;
import org.telegram.ui.kp;
import org.telegram.ui.lp;
import org.telegram.ui.na;
import org.telegram.ui.xv0;
import org.telegram.ui.zv0;
import s4.c1;
public final class f extends s4.v {
    public final int d;
    public final Object f4810e;

    public f(Object obj, int i10) {
        this.d = i10;
        this.f4810e = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, c1 c1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, c1Var);
                c1Var.f45738a.setPressed(false);
                return;
            case 1:
                super.a(recyclerView, c1Var);
                c1Var.f45738a.setPressed(false);
                return;
            case 2:
                super.a(recyclerView, c1Var);
                View view = c1Var.f45738a;
                view.setPressed(false);
                view.setBackground(null);
                return;
            case 3:
                super.a(recyclerView, c1Var);
                c1Var.f45738a.setPressed(false);
                return;
            case 4:
                d61 d61Var = (d61) this.f4810e;
                super.a(recyclerView, c1Var);
                View view2 = c1Var.f45738a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof z1) {
                    z1 z1Var = (z1) view2.getBackground();
                    if (z1Var.f14373c) {
                        z1Var.f14373c = false;
                        z1Var.invalidateSelf();
                    }
                }
                if (d61Var.z1()) {
                    d61Var.E1(c1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(pr.h).start();
                    return;
                }
                return;
            case 5:
            default:
                super.a(recyclerView, c1Var);
                return;
            case 6:
                super.a(recyclerView, c1Var);
                c1Var.f45738a.setPressed(false);
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, c1 c1Var) {
        switch (this.d) {
            case 0:
                t tVar = (t) this.f4810e;
                if (tVar.W.G.C1 && tVar.v.L(c1Var.b())) {
                    tVar.f4835f.setItemAnimator(tVar.f4836n);
                    return s4.v.l(15, 0);
                }
                return s4.v.l(0, 0);
            case 1:
                if (c1Var.f45742f == 1 && ((na) c1Var.f45738a).G) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
            case 2:
                if (c1Var.f45742f != 5) {
                    return s4.v.l(0, 0);
                }
                return s4.v.l(3, 0);
            case 3:
                int b10 = c1Var.b();
                vm0 vm0Var = (vm0) this.f4810e;
                if (b10 >= vm0Var.v && c1Var.b() < vm0Var.f31371w) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
            case 4:
                d61 d61Var = (d61) this.f4810e;
                if (d61Var.f25281c3 && d61Var.Y2.H(c1Var.b()) >= 0) {
                    int i10 = 15;
                    if (d61Var.X2.f45726o == 0) {
                        if (!d61Var.f25280b3) {
                            i10 = 12;
                        }
                    } else if (!d61Var.f25280b3) {
                        i10 = 3;
                    }
                    return s4.v.l(i10, 0);
                }
                return s4.v.l(0, 0);
            case 5:
                if (((g0) ((h81) this.f4810e).f26659y).i(c1Var.b())) {
                    return s4.v.l(12, 0);
                }
                return s4.v.l(0, 0);
            default:
                if (c1Var.f45742f == 5 && r(c1Var.b())) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
        }
    }

    @Override
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((t) this.f4810e).W.G.C1;
            case 1:
            case 2:
            case 5:
            default:
                return super.k();
            case 3:
                return ((vm0) this.f4810e).I.g();
            case 4:
                d61 d61Var = (d61) this.f4810e;
                if (d61Var.f25281c3 && d61Var.f25283e3) {
                    return true;
                }
                return false;
            case 6:
                return true;
        }
    }

    @Override
    public void m(Canvas canvas, RecyclerView recyclerView, c1 c1Var, float f7, float f10, int i10, boolean z10) {
        switch (this.d) {
            case 4:
                d61 d61Var = (d61) this.f4810e;
                if (i10 != 2 || z10 || !d61Var.z1()) {
                    super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        d61Var.D1(c1Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                ((h81) this.f4810e).invalidate();
                return;
            default:
                super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                return;
        }
    }

    @Override
    public final boolean n(RecyclerView recyclerView, c1 c1Var, c1 c1Var2) {
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        switch (this.d) {
            case 0:
                l lVar = ((t) this.f4810e).v;
                if (!lVar.L(c1Var.b()) || !lVar.L(c1Var2.b())) {
                    return false;
                }
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                ArrayList arrayList2 = lVar.f4827n;
                l8 l8Var = lVar.f4825e;
                if (l8Var != null && b10 >= 0 && b10 < l8Var.f3275i.size() && b11 >= 0 && b11 < lVar.f4825e.f3275i.size()) {
                    if (lVar.f4825e instanceof b8) {
                        arrayList = new ArrayList();
                        for (int i13 = 0; i13 < lVar.f4825e.f3275i.size(); i13++) {
                            arrayList.add(Integer.valueOf(((MessageObject) lVar.f4825e.f3275i.get(i13)).getId()));
                        }
                    } else {
                        arrayList = new ArrayList(lVar.f4825e.f3274g);
                    }
                    if (!lVar.f4828r) {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        lVar.f4828r = true;
                    }
                    MessageObject messageObject = (MessageObject) lVar.f4825e.f3275i.get(b10);
                    MessageObject messageObject2 = (MessageObject) lVar.f4825e.f3275i.get(b11);
                    arrayList.remove(Integer.valueOf(messageObject.getId()));
                    arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
                    lVar.f4825e.C(arrayList, false);
                    lVar.p(b10, b11);
                }
                return true;
            case 1:
                if (c1Var.f45742f == c1Var2.f45742f) {
                    View view = c1Var2.f45738a;
                    if (!(view instanceof na) || ((na) view).G) {
                        jp jpVar = ((kp) this.f4810e).X2;
                        int b12 = c1Var.b();
                        int b13 = c1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        kp kpVar = jpVar.f37825c;
                        lp lpVar = kpVar.f38100a3;
                        ArrayList arrayList3 = lpVar.N;
                        if (i14 >= lpVar.N.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            kpVar.Y2 = true;
                        }
                        arrayList3.set(i14, (TLRPC.TL_username) arrayList3.get(i15));
                        arrayList3.set(i15, (TLRPC.TL_username) arrayList3.get(i14));
                        jpVar.p(b12, b13);
                        int size = arrayList3.size();
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        jpVar.n(b12, 3);
                        jpVar.n(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (c1Var.f45742f != c1Var2.f45742f) {
                    return false;
                }
                rn rnVar = ((tn) this.f4810e).f30652r;
                int b14 = c1Var.b();
                int b15 = c1Var2.b();
                tn tnVar = rnVar.d;
                int i16 = tnVar.f30656t0;
                rh.f fVar = tnVar.l1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = tnVar.M) && i18 < i10) {
                    rh.e b16 = fVar.b(i17);
                    SparseArray sparseArray = fVar.f45618a;
                    sparseArray.put(i17, fVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = tnVar.K;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = tnVar.L;
                    boolean z10 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z10;
                    rnVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = c1Var2.b();
                vm0 vm0Var = (vm0) this.f4810e;
                ArrayList arrayList4 = vm0Var.f31366e;
                if (b17 >= vm0Var.v && c1Var2.b() < vm0Var.f31371w) {
                    int b18 = c1Var.b();
                    int b19 = c1Var2.b();
                    int i19 = vm0Var.v;
                    int i20 = b18 - i19;
                    int i21 = b19 - i19;
                    arrayList4.indexOf(Integer.valueOf(i20));
                    arrayList4.get(b18 - vm0Var.v);
                    MessageObject messageObject3 = (MessageObject) arrayList4.get(i20);
                    MessageObject messageObject4 = (MessageObject) arrayList4.get(i21);
                    arrayList4.set(i20, messageObject4);
                    arrayList4.set(i21, messageObject3);
                    DownloadController.getInstance(vm0Var.d).swapLoadingPriority(messageObject3, messageObject4);
                    vm0Var.f31365c.p(b18, b19);
                    return false;
                }
                return false;
            case 4:
                d61 d61Var = (d61) this.f4810e;
                v51 v51Var = d61Var.Y2;
                if (v51Var.H(c1Var.b()) >= 0 && v51Var.H(c1Var.b()) == v51Var.H(c1Var2.b())) {
                    int b20 = c1Var.b();
                    int b21 = c1Var2.b();
                    ArrayList arrayList5 = v51Var.f31138x;
                    if (v51Var.L != null) {
                        int H = v51Var.H(b20);
                        int H2 = v51Var.H(b21);
                        if (H >= 0 && H == H2) {
                            boolean J = v51Var.J(b20);
                            boolean J2 = v51Var.J(b21);
                            arrayList5.add(b21, (h51) arrayList5.remove(b20));
                            v51Var.p(b20, b21);
                            if (v51Var.J(b21) != J) {
                                v51Var.n(b21, 3);
                            }
                            if (v51Var.J(b20) != J2) {
                                v51Var.n(b20, 3);
                            }
                            if (v51Var.K && (i11 = v51Var.J) != H) {
                                v51Var.F(i11);
                            }
                            v51Var.K = true;
                            v51Var.J = H;
                        }
                    }
                    d61Var.G1();
                    return true;
                }
                return false;
            case 5:
                int b22 = c1Var.b();
                int b23 = c1Var2.b();
                h81 h81Var = (h81) this.f4810e;
                ArrayList arrayList6 = h81Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((g0) h81Var.f26659y).i(b22) && ((g0) h81Var.f26659y).i(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    h81Var.f26658x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((e81) obj).f25602a));
                    }
                    a81 a81Var = ((i81) ((g0) h81Var.f26659y).f14578b).L;
                    z11 = true;
                    z11 = true;
                    if (a81Var != null) {
                        a81Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (c1Var.f45742f == c1Var2.f45742f && r(c1Var.b()) && r(c1Var2.b())) {
                    xv0 xv0Var = ((zv0) this.f4810e).f43529b;
                    int b24 = c1Var.b();
                    int b25 = c1Var2.b();
                    zv0 zv0Var = xv0Var.d;
                    int i23 = zv0Var.f43545n0;
                    int i24 = b24 - i23;
                    int i25 = b25 - i23;
                    if (i24 >= 0 && i25 >= 0 && i24 < (i12 = zv0Var.f43560y) && i25 < i12) {
                        CharSequence[] charSequenceArr2 = zv0Var.v;
                        CharSequence charSequence2 = charSequenceArr2[i24];
                        charSequenceArr2[i24] = charSequenceArr2[i25];
                        charSequenceArr2[i25] = charSequence2;
                        int[] iArr = zv0Var.f43549r;
                        if (iArr != null) {
                            int i26 = iArr[i24];
                            iArr[i24] = iArr[i25];
                            iArr[i25] = i26;
                        }
                        boolean[] zArr2 = zv0Var.f43556w;
                        boolean z12 = zArr2[i24];
                        zArr2[i24] = zArr2[i25];
                        zArr2[i25] = z12;
                        xv0Var.p(b24, b25);
                    }
                    return true;
                }
                return false;
        }
    }

    @Override
    public void o(RecyclerView recyclerView, c1 c1Var, c1 c1Var2, int i10, int i11, int i12) {
        switch (this.d) {
            case 4:
                return;
            default:
                super.o(recyclerView, c1Var, c1Var2, i10, i11, i12);
                return;
        }
    }

    @Override
    public void p(c1 c1Var, int i10) {
        ArrayList arrayList;
        boolean z10;
        switch (this.d) {
            case 0:
                t tVar = (t) this.f4810e;
                i iVar = tVar.f4835f;
                if (c1Var != null) {
                    iVar.c1(false);
                }
                if (i10 == 0) {
                    l lVar = tVar.v;
                    ArrayList arrayList2 = lVar.f4827n;
                    l8 l8Var = lVar.f4825e;
                    if (l8Var != null && lVar.f4828r) {
                        if (l8Var instanceof b8) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < lVar.f4825e.f3275i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((MessageObject) lVar.f4825e.f3275i.get(i11)).getId()));
                            }
                        } else {
                            arrayList = l8Var.f3274g;
                        }
                        if (arrayList2.size() != arrayList.size()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (arrayList2.get(i12) != arrayList.get(i12)) {
                                        z10 = true;
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                        if (z10) {
                            lVar.f4825e.C(arrayList, true);
                        }
                        lVar.f4828r = false;
                    }
                    iVar.setItemAnimator(null);
                    return;
                }
                iVar.I0(false);
                if (c1Var != null) {
                    c1Var.f45738a.setPressed(true);
                    return;
                }
                return;
            case 1:
                kp kpVar = (kp) this.f4810e;
                lp lpVar = kpVar.f38100a3;
                if (i10 == 0) {
                    lpVar.L = false;
                    if (kpVar.Y2) {
                        TLRPC.Chat chat = lpVar.X;
                        ArrayList arrayList3 = lpVar.N;
                        ArrayList arrayList4 = lpVar.M;
                        if (chat != null) {
                            kpVar.Y2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = lpVar.X;
                            tL_inputChannel.channel_id = chat2.f19869id;
                            tL_inputChannel.access_hash = chat2.access_hash;
                            tL_channels_reorderUsernames.channel = tL_inputChannel;
                            ArrayList<String> arrayList5 = new ArrayList<>();
                            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                                if (((TLRPC.TL_username) arrayList4.get(i13)).active) {
                                    arrayList5.add(((TLRPC.TL_username) arrayList4.get(i13)).username);
                                }
                            }
                            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                if (((TLRPC.TL_username) arrayList3.get(i14)).active) {
                                    arrayList5.add(((TLRPC.TL_username) arrayList3.get(i14)).username);
                                }
                            }
                            tL_channels_reorderUsernames.order = arrayList5;
                            lpVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new c7(10));
                            lpVar.X.usernames.clear();
                            lpVar.X.usernames.addAll(arrayList4);
                            lpVar.X.usernames.addAll(arrayList3);
                            lpVar.getMessagesController().putChat(lpVar.X, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                lpVar.L = true;
                kpVar.I0(false);
                c1Var.f45738a.setPressed(true);
                return;
            case 2:
                tn tnVar = (tn) this.f4810e;
                ec1 ec1Var = tnVar.f30654s;
                if (i10 != 0) {
                    ec1Var.setItemAnimator(tnVar.v);
                    ec1Var.I0(false);
                    c1Var.f45738a.setPressed(true);
                    c1Var.f45738a.setBackgroundColor(j6.v0(j6.f20734h5, tnVar.f28752a));
                    return;
                }
                return;
            case 3:
                if (i10 != 0) {
                    ((vm0) this.f4810e).f31364b.I0(false);
                    c1Var.f45738a.setPressed(true);
                    return;
                }
                return;
            case 4:
                d61 d61Var = (d61) this.f4810e;
                if (c1Var != null) {
                    d61Var.c1(false);
                }
                if (i10 == 0) {
                    v51 v51Var = d61Var.Y2;
                    if (v51Var.K) {
                        v51Var.F(v51Var.J);
                    }
                    if (d61Var.f25282d3 != null) {
                        d61Var.C1();
                        d61Var.f25282d3 = null;
                        return;
                    }
                    return;
                }
                d61Var.I0(false);
                if (c1Var != null) {
                    View view = c1Var.f45738a;
                    view.setPressed(true);
                    if (view.getBackground() instanceof z1) {
                        z1 z1Var = (z1) view.getBackground();
                        if (!z1Var.f14373c) {
                            z1Var.f14373c = true;
                            z1Var.invalidateSelf();
                        }
                    }
                    if (i10 == 2) {
                        d61Var.f25282d3 = c1Var;
                        d61Var.F1(c1Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
            default:
                return;
            case 6:
                if (i10 != 0) {
                    ((zv0) this.f4810e).f43531c.I0(false);
                    c1Var.f45738a.setPressed(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(c1 c1Var) {
        int i10 = this.d;
    }

    public boolean r(int i10) {
        zv0 zv0Var = (zv0) this.f4810e;
        if (!zv0Var.I || i10 - zv0Var.f43545n0 >= zv0Var.f43558x) {
            return true;
        }
        return false;
    }

    private final void t(c1 c1Var) {
    }

    private final void u(c1 c1Var) {
    }

    private final void v(c1 c1Var) {
    }

    private final void w(c1 c1Var) {
    }

    private final void x(c1 c1Var) {
    }

    private final void y(c1 c1Var) {
    }

    private final void z(c1 c1Var) {
    }

    private final void s(RecyclerView recyclerView, c1 c1Var, c1 c1Var2, int i10, int i11, int i12) {
    }
}
