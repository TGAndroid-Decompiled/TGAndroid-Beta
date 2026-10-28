package ei;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import di.d6;
import di.s6;
import di.z6;
import java.util.ArrayList;
import li.y1;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.r91;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.v91;
import org.telegram.ui.ap;
import org.telegram.ui.bb1;
import org.telegram.ui.bp;
import org.telegram.ui.cp;
import org.telegram.ui.mv0;
import org.telegram.ui.ov0;
import org.telegram.ui.qa;
import s4.e1;
import s4.w;
public final class f extends w {
    public final int d;
    public final Object e;

    public f(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, e1 e1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, e1Var);
                e1Var.f47773a.setPressed(false);
                return;
            case 1:
                super.a(recyclerView, e1Var);
                e1Var.f47773a.setPressed(false);
                return;
            case 2:
                super.a(recyclerView, e1Var);
                View view = e1Var.f47773a;
                view.setPressed(false);
                view.setBackground(null);
                return;
            case 3:
                super.a(recyclerView, e1Var);
                e1Var.f47773a.setPressed(false);
                return;
            case 4:
                s71 s71Var = (s71) this.e;
                super.a(recyclerView, e1Var);
                View view2 = e1Var.f47773a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof y1) {
                    y1 y1Var = (y1) view2.getBackground();
                    if (y1Var.f17642c) {
                        y1Var.f17642c = false;
                        y1Var.invalidateSelf();
                    }
                }
                if (s71Var.G1()) {
                    s71Var.L1(e1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(ds.h).start();
                    return;
                }
                return;
            case 5:
            default:
                super.a(recyclerView, e1Var);
                return;
            case 6:
                super.a(recyclerView, e1Var);
                e1Var.f47773a.setPressed(false);
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, e1 e1Var) {
        switch (this.d) {
            case 0:
                r rVar = (r) this.e;
                if (rVar.W.G.E1 && rVar.v.L(e1Var.b())) {
                    rVar.f10003f.setItemAnimator(rVar.f10004n);
                    return w.l(15, 0);
                }
                return w.l(0, 0);
            case 1:
                if (e1Var.f47776f == 1 && ((qa) e1Var.f47773a).G) {
                    return w.l(3, 0);
                }
                return w.l(0, 0);
            case 2:
                if (e1Var.f47776f != 5) {
                    return w.l(0, 0);
                }
                return w.l(3, 0);
            case 3:
                int b10 = e1Var.b();
                do0 do0Var = (do0) this.e;
                if (b10 >= do0Var.v && e1Var.b() < do0Var.f27507w) {
                    return w.l(3, 0);
                }
                return w.l(0, 0);
            case 4:
                s71 s71Var = (s71) this.e;
                if (s71Var.f32508k3 && s71Var.f32504g3.H(e1Var.b()) >= 0) {
                    int i10 = 15;
                    if (s71Var.f32503f3.f47743o == 0) {
                        if (!s71Var.f32507j3) {
                            i10 = 12;
                        }
                    } else if (!s71Var.f32507j3) {
                        i10 = 3;
                    }
                    return w.l(i10, 0);
                }
                return w.l(0, 0);
            case 5:
                if (((jg.i) ((u91) this.e).f33322y).b0(e1Var.b())) {
                    return w.l(12, 0);
                }
                return w.l(0, 0);
            default:
                if (e1Var.f47776f == 5 && r(e1Var.b())) {
                    return w.l(3, 0);
                }
                return w.l(0, 0);
        }
    }

    @Override
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((r) this.e).W.G.E1;
            case 1:
            case 2:
            case 5:
            default:
                return super.k();
            case 3:
                return ((do0) this.e).I.g();
            case 4:
                s71 s71Var = (s71) this.e;
                if (s71Var.f32508k3 && s71Var.f32510m3) {
                    return true;
                }
                return false;
            case 6:
                return true;
        }
    }

    @Override
    public void m(Canvas canvas, RecyclerView recyclerView, e1 e1Var, float f7, float f10, int i10, boolean z10) {
        switch (this.d) {
            case 4:
                s71 s71Var = (s71) this.e;
                if (i10 != 2 || z10 || !s71Var.G1()) {
                    super.m(canvas, recyclerView, e1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        s71Var.K1(e1Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                super.m(canvas, recyclerView, e1Var, f7, f10, i10, z10);
                ((u91) this.e).invalidate();
                return;
            default:
                super.m(canvas, recyclerView, e1Var, f7, f10, i10, z10);
                return;
        }
    }

    @Override
    public final boolean n(RecyclerView recyclerView, e1 e1Var, e1 e1Var2) {
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        switch (this.d) {
            case 0:
                l lVar = ((r) this.e).v;
                if (!lVar.L(e1Var.b()) || !lVar.L(e1Var2.b())) {
                    return false;
                }
                int b10 = e1Var.b();
                int b11 = e1Var2.b();
                ArrayList arrayList2 = lVar.f9996n;
                z6 z6Var = lVar.e;
                if (z6Var != null && b10 >= 0 && b10 < z6Var.f9492i.size() && b11 >= 0 && b11 < lVar.e.f9492i.size()) {
                    if (lVar.e instanceof s6) {
                        arrayList = new ArrayList();
                        for (int i13 = 0; i13 < lVar.e.f9492i.size(); i13++) {
                            arrayList.add(Integer.valueOf(((MessageObject) lVar.e.f9492i.get(i13)).getId()));
                        }
                    } else {
                        arrayList = new ArrayList(lVar.e.f9491g);
                    }
                    if (!lVar.f9997r) {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        lVar.f9997r = true;
                    }
                    MessageObject messageObject = (MessageObject) lVar.e.f9492i.get(b10);
                    MessageObject messageObject2 = (MessageObject) lVar.e.f9492i.get(b11);
                    arrayList.remove(Integer.valueOf(messageObject.getId()));
                    arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
                    lVar.e.C(arrayList, false);
                    lVar.p(b10, b11);
                }
                return true;
            case 1:
                if (e1Var.f47776f == e1Var2.f47776f) {
                    View view = e1Var2.f47773a;
                    if (!(view instanceof qa) || ((qa) view).G) {
                        ap apVar = ((bp) this.e).f38080f3;
                        int b12 = e1Var.b();
                        int b13 = e1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        bp bpVar = apVar.f37805c;
                        cp cpVar = bpVar.f38083i3;
                        ArrayList arrayList3 = cpVar.N;
                        if (i14 >= cpVar.N.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            bpVar.f38081g3 = true;
                        }
                        arrayList3.set(i14, (TLRPC.TL_username) arrayList3.get(i15));
                        arrayList3.set(i15, (TLRPC.TL_username) arrayList3.get(i14));
                        apVar.p(b12, b13);
                        int size = arrayList3.size();
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        apVar.n(b12, 3);
                        apVar.n(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (e1Var.f47776f != e1Var2.f47776f) {
                    return false;
                }
                eo eoVar = ((go) this.e).f28694r;
                int b14 = e1Var.b();
                int b15 = e1Var2.b();
                go goVar = eoVar.d;
                int i16 = goVar.f28698t0;
                sh.f fVar = goVar.f28684m1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = goVar.M) && i18 < i10) {
                    sh.e b16 = fVar.b(i17);
                    SparseArray sparseArray = fVar.f48667a;
                    sparseArray.put(i17, fVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = goVar.K;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = goVar.L;
                    boolean z10 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z10;
                    eoVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = e1Var2.b();
                do0 do0Var = (do0) this.e;
                ArrayList arrayList4 = do0Var.e;
                if (b17 >= do0Var.v && e1Var2.b() < do0Var.f27507w) {
                    int b18 = e1Var.b();
                    int b19 = e1Var2.b();
                    int i19 = do0Var.v;
                    int i20 = b18 - i19;
                    int i21 = b19 - i19;
                    arrayList4.indexOf(Integer.valueOf(i20));
                    arrayList4.get(b18 - do0Var.v);
                    MessageObject messageObject3 = (MessageObject) arrayList4.get(i20);
                    MessageObject messageObject4 = (MessageObject) arrayList4.get(i21);
                    arrayList4.set(i20, messageObject4);
                    arrayList4.set(i21, messageObject3);
                    DownloadController.getInstance(do0Var.d).swapLoadingPriority(messageObject3, messageObject4);
                    do0Var.f27502c.p(b18, b19);
                    return false;
                }
                return false;
            case 4:
                s71 s71Var = (s71) this.e;
                k71 k71Var = s71Var.f32504g3;
                if (k71Var.H(e1Var.b()) >= 0 && k71Var.H(e1Var.b()) == k71Var.H(e1Var2.b())) {
                    int b20 = e1Var.b();
                    int b21 = e1Var2.b();
                    ArrayList arrayList5 = k71Var.f29882y;
                    if (k71Var.M != null) {
                        int H = k71Var.H(b20);
                        int H2 = k71Var.H(b21);
                        if (H >= 0 && H == H2) {
                            boolean J = k71Var.J(b20);
                            boolean J2 = k71Var.J(b21);
                            arrayList5.add(b21, (u61) arrayList5.remove(b20));
                            k71Var.p(b20, b21);
                            if (k71Var.J(b21) != J) {
                                k71Var.n(b21, 3);
                            }
                            if (k71Var.J(b20) != J2) {
                                k71Var.n(b20, 3);
                            }
                            if (k71Var.L && (i11 = k71Var.K) != H) {
                                k71Var.F(i11);
                            }
                            k71Var.L = true;
                            k71Var.K = H;
                        }
                    }
                    s71Var.N1();
                    return true;
                }
                return false;
            case 5:
                int b22 = e1Var.b();
                int b23 = e1Var2.b();
                u91 u91Var = (u91) this.e;
                ArrayList arrayList6 = u91Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((jg.i) u91Var.f33322y).b0(b22) && ((jg.i) u91Var.f33322y).b0(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    u91Var.f33321x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((r91) obj).f32186a));
                    }
                    n91 n91Var = ((v91) ((jg.i) u91Var.f33322y).f15725a).L;
                    z11 = true;
                    z11 = true;
                    if (n91Var != null) {
                        n91Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (e1Var.f47776f == e1Var2.f47776f && r(e1Var.b()) && r(e1Var2.b())) {
                    mv0 mv0Var = ((ov0) this.e).f42209b;
                    int b24 = e1Var.b();
                    int b25 = e1Var2.b();
                    ov0 ov0Var = mv0Var.d;
                    int i23 = ov0Var.f42224n0;
                    int i24 = b24 - i23;
                    int i25 = b25 - i23;
                    if (i24 >= 0 && i25 >= 0 && i24 < (i12 = ov0Var.f42239y) && i25 < i12) {
                        CharSequence[] charSequenceArr2 = ov0Var.v;
                        CharSequence charSequence2 = charSequenceArr2[i24];
                        charSequenceArr2[i24] = charSequenceArr2[i25];
                        charSequenceArr2[i25] = charSequence2;
                        int[] iArr = ov0Var.f42228r;
                        if (iArr != null) {
                            int i26 = iArr[i24];
                            iArr[i24] = iArr[i25];
                            iArr[i25] = i26;
                        }
                        boolean[] zArr2 = ov0Var.f42235w;
                        boolean z12 = zArr2[i24];
                        zArr2[i24] = zArr2[i25];
                        zArr2[i25] = z12;
                        mv0Var.p(b24, b25);
                    }
                    return true;
                }
                return false;
        }
    }

    @Override
    public void o(RecyclerView recyclerView, e1 e1Var, e1 e1Var2, int i10, int i11, int i12) {
        switch (this.d) {
            case 4:
                return;
            default:
                super.o(recyclerView, e1Var, e1Var2, i10, i11, i12);
                return;
        }
    }

    @Override
    public void p(e1 e1Var, int i10) {
        ArrayList arrayList;
        boolean z10;
        switch (this.d) {
            case 0:
                r rVar = (r) this.e;
                i iVar = rVar.f10003f;
                if (e1Var != null) {
                    iVar.d1(false);
                }
                if (i10 == 0) {
                    l lVar = rVar.v;
                    ArrayList arrayList2 = lVar.f9996n;
                    z6 z6Var = lVar.e;
                    if (z6Var != null && lVar.f9997r) {
                        if (z6Var instanceof s6) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < lVar.e.f9492i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((MessageObject) lVar.e.f9492i.get(i11)).getId()));
                            }
                        } else {
                            arrayList = z6Var.f9491g;
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
                            lVar.e.C(arrayList, true);
                        }
                        lVar.f9997r = false;
                    }
                    iVar.setItemAnimator(null);
                    return;
                }
                iVar.I0(false);
                if (e1Var != null) {
                    e1Var.f47773a.setPressed(true);
                    return;
                }
                return;
            case 1:
                bp bpVar = (bp) this.e;
                cp cpVar = bpVar.f38083i3;
                if (i10 == 0) {
                    cpVar.L = false;
                    if (bpVar.f38081g3) {
                        TLRPC.Chat chat = cpVar.X;
                        ArrayList arrayList3 = cpVar.N;
                        ArrayList arrayList4 = cpVar.M;
                        if (chat != null) {
                            bpVar.f38081g3 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = cpVar.X;
                            tL_inputChannel.channel_id = chat2.f22028id;
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
                            cpVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new d6(10));
                            cpVar.X.usernames.clear();
                            cpVar.X.usernames.addAll(arrayList4);
                            cpVar.X.usernames.addAll(arrayList3);
                            cpVar.getMessagesController().putChat(cpVar.X, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                cpVar.L = true;
                bpVar.I0(false);
                e1Var.f47773a.setPressed(true);
                return;
            case 2:
                go goVar = (go) this.e;
                bb1 bb1Var = goVar.f28696s;
                if (i10 != 0) {
                    bb1Var.setItemAnimator(goVar.v);
                    bb1Var.I0(false);
                    e1Var.f47773a.setPressed(true);
                    f7.i(y6.f23428h5, e1Var.f47773a, goVar.f30253a);
                    return;
                }
                return;
            case 3:
                if (i10 != 0) {
                    ((do0) this.e).f27501b.I0(false);
                    e1Var.f47773a.setPressed(true);
                    return;
                }
                return;
            case 4:
                s71 s71Var = (s71) this.e;
                if (e1Var != null) {
                    s71Var.d1(false);
                }
                if (i10 == 0) {
                    k71 k71Var = s71Var.f32504g3;
                    if (k71Var.L) {
                        k71Var.F(k71Var.K);
                    }
                    if (s71Var.f32509l3 != null) {
                        s71Var.J1();
                        s71Var.f32509l3 = null;
                        return;
                    }
                    return;
                }
                s71Var.I0(false);
                if (e1Var != null) {
                    View view = e1Var.f47773a;
                    view.setPressed(true);
                    if (view.getBackground() instanceof y1) {
                        y1 y1Var = (y1) view.getBackground();
                        if (!y1Var.f17642c) {
                            y1Var.f17642c = true;
                            y1Var.invalidateSelf();
                        }
                    }
                    if (i10 == 2) {
                        s71Var.f32509l3 = e1Var;
                        s71Var.M1(e1Var);
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
                    ((ov0) this.e).f42211c.I0(false);
                    e1Var.f47773a.setPressed(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(e1 e1Var) {
        int i10 = this.d;
    }

    public boolean r(int i10) {
        ov0 ov0Var = (ov0) this.e;
        if (!ov0Var.I || i10 - ov0Var.f42224n0 >= ov0Var.f42237x) {
            return true;
        }
        return false;
    }

    private final void t(e1 e1Var) {
    }

    private final void u(e1 e1Var) {
    }

    private final void v(e1 e1Var) {
    }

    private final void w(e1 e1Var) {
    }

    private final void x(e1 e1Var) {
    }

    private final void y(e1 e1Var) {
    }

    private final void z(e1 e1Var) {
    }

    private final void s(RecyclerView recyclerView, e1 e1Var, e1 e1Var2, int i10, int i11, int i12) {
    }
}
