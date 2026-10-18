package di;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ci.d6;
import ci.s6;
import ci.z6;
import java.util.ArrayList;
import ki.a2;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.y81;
import org.telegram.ui.fv0;
import org.telegram.ui.hv0;
import org.telegram.ui.ra;
import org.telegram.ui.ua1;
import org.telegram.ui.wo;
import org.telegram.ui.xo;
import org.telegram.ui.yo;
import s4.b1;
public final class f extends s4.v {
    public final int d;
    public final Object e;

    public f(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, b1 b1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, b1Var);
                b1Var.f45910a.setPressed(false);
                return;
            case 1:
                super.a(recyclerView, b1Var);
                b1Var.f45910a.setPressed(false);
                return;
            case 2:
                super.a(recyclerView, b1Var);
                View view = b1Var.f45910a;
                view.setPressed(false);
                view.setBackground(null);
                return;
            case 3:
                super.a(recyclerView, b1Var);
                b1Var.f45910a.setPressed(false);
                return;
            case 4:
                a71 a71Var = (a71) this.e;
                super.a(recyclerView, b1Var);
                View view2 = b1Var.f45910a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof a2) {
                    a2 a2Var = (a2) view2.getBackground();
                    if (a2Var.f15117c) {
                        a2Var.f15117c = false;
                        a2Var.invalidateSelf();
                    }
                }
                if (a71Var.B1()) {
                    a71Var.G1(b1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(bs.h).start();
                    return;
                }
                return;
            case 5:
            default:
                super.a(recyclerView, b1Var);
                return;
            case 6:
                super.a(recyclerView, b1Var);
                b1Var.f45910a.setPressed(false);
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, b1 b1Var) {
        switch (this.d) {
            case 0:
                r rVar = (r) this.e;
                if (rVar.W.G.C1 && rVar.v.L(b1Var.b())) {
                    rVar.f8058f.setItemAnimator(rVar.f8059n);
                    return s4.v.l(15, 0);
                }
                return s4.v.l(0, 0);
            case 1:
                if (b1Var.f45913f == 1 && ((ra) b1Var.f45910a).G) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
            case 2:
                if (b1Var.f45913f != 5) {
                    return s4.v.l(0, 0);
                }
                return s4.v.l(3, 0);
            case 3:
                int b10 = b1Var.b();
                tn0 tn0Var = (tn0) this.e;
                if (b10 >= tn0Var.v && b1Var.b() < tn0Var.f30675w) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
            case 4:
                a71 a71Var = (a71) this.e;
                if (a71Var.f24513a3 && a71Var.W2.H(b1Var.b()) >= 0) {
                    int i10 = 15;
                    if (a71Var.V2.f45898o == 0) {
                        if (!a71Var.Z2) {
                            i10 = 12;
                        }
                    } else if (!a71Var.Z2) {
                        i10 = 3;
                    }
                    return s4.v.l(i10, 0);
                }
                return s4.v.l(0, 0);
            case 5:
                if (((l2.f) ((b91) this.e).f24871y).q(b1Var.b())) {
                    return s4.v.l(12, 0);
                }
                return s4.v.l(0, 0);
            default:
                if (b1Var.f45913f == 5 && r(b1Var.b())) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
        }
    }

    @Override
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((r) this.e).W.G.C1;
            case 1:
            case 2:
            case 5:
            default:
                return super.k();
            case 3:
                return ((tn0) this.e).I.g();
            case 4:
                a71 a71Var = (a71) this.e;
                if (a71Var.f24513a3 && a71Var.f24515c3) {
                    return true;
                }
                return false;
            case 6:
                return true;
        }
    }

    @Override
    public void m(Canvas canvas, RecyclerView recyclerView, b1 b1Var, float f7, float f10, int i10, boolean z10) {
        switch (this.d) {
            case 4:
                a71 a71Var = (a71) this.e;
                if (i10 != 2 || z10 || !a71Var.B1()) {
                    super.m(canvas, recyclerView, b1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        a71Var.F1(b1Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                super.m(canvas, recyclerView, b1Var, f7, f10, i10, z10);
                ((b91) this.e).invalidate();
                return;
            default:
                super.m(canvas, recyclerView, b1Var, f7, f10, i10, z10);
                return;
        }
    }

    @Override
    public final boolean n(RecyclerView recyclerView, b1 b1Var, b1 b1Var2) {
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        switch (this.d) {
            case 0:
                l lVar = ((r) this.e).v;
                if (!lVar.L(b1Var.b()) || !lVar.L(b1Var2.b())) {
                    return false;
                }
                int b10 = b1Var.b();
                int b11 = b1Var2.b();
                ArrayList arrayList2 = lVar.f8051n;
                z6 z6Var = lVar.e;
                if (z6Var != null && b10 >= 0 && b10 < z6Var.f6184i.size() && b11 >= 0 && b11 < lVar.e.f6184i.size()) {
                    if (lVar.e instanceof s6) {
                        arrayList = new ArrayList();
                        for (int i13 = 0; i13 < lVar.e.f6184i.size(); i13++) {
                            arrayList.add(Integer.valueOf(((MessageObject) lVar.e.f6184i.get(i13)).getId()));
                        }
                    } else {
                        arrayList = new ArrayList(lVar.e.f6183g);
                    }
                    if (!lVar.f8052r) {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        lVar.f8052r = true;
                    }
                    MessageObject messageObject = (MessageObject) lVar.e.f6184i.get(b10);
                    MessageObject messageObject2 = (MessageObject) lVar.e.f6184i.get(b11);
                    arrayList.remove(Integer.valueOf(messageObject.getId()));
                    arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
                    lVar.e.C(arrayList, false);
                    lVar.p(b10, b11);
                }
                return true;
            case 1:
                if (b1Var.f45913f == b1Var2.f45913f) {
                    View view = b1Var2.f45910a;
                    if (!(view instanceof ra) || ((ra) view).G) {
                        wo woVar = ((xo) this.e).V2;
                        int b12 = b1Var.b();
                        int b13 = b1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        xo xoVar = woVar.f42888c;
                        yo yoVar = xoVar.Y2;
                        ArrayList arrayList3 = yoVar.N;
                        if (i14 >= yoVar.N.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            xoVar.W2 = true;
                        }
                        arrayList3.set(i14, (TLRPC.TL_username) arrayList3.get(i15));
                        arrayList3.set(i15, (TLRPC.TL_username) arrayList3.get(i14));
                        woVar.p(b12, b13);
                        int size = arrayList3.size();
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        woVar.n(b12, 3);
                        woVar.n(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (b1Var.f45913f != b1Var2.f45913f) {
                    return false;
                }
                co coVar = ((fo) this.e).f26306r;
                int b14 = b1Var.b();
                int b15 = b1Var2.b();
                fo foVar = coVar.d;
                int i16 = foVar.f26310t0;
                rh.f fVar = foVar.l1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = foVar.M) && i18 < i10) {
                    rh.e b16 = fVar.b(i17);
                    SparseArray sparseArray = fVar.f45746a;
                    sparseArray.put(i17, fVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = foVar.K;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = foVar.L;
                    boolean z10 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z10;
                    coVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = b1Var2.b();
                tn0 tn0Var = (tn0) this.e;
                ArrayList arrayList4 = tn0Var.e;
                if (b17 >= tn0Var.v && b1Var2.b() < tn0Var.f30675w) {
                    int b18 = b1Var.b();
                    int b19 = b1Var2.b();
                    int i19 = tn0Var.v;
                    int i20 = b18 - i19;
                    int i21 = b19 - i19;
                    arrayList4.indexOf(Integer.valueOf(i20));
                    arrayList4.get(b18 - tn0Var.v);
                    MessageObject messageObject3 = (MessageObject) arrayList4.get(i20);
                    MessageObject messageObject4 = (MessageObject) arrayList4.get(i21);
                    arrayList4.set(i20, messageObject4);
                    arrayList4.set(i21, messageObject3);
                    DownloadController.getInstance(tn0Var.d).swapLoadingPriority(messageObject3, messageObject4);
                    tn0Var.f30670c.p(b18, b19);
                    return false;
                }
                return false;
            case 4:
                a71 a71Var = (a71) this.e;
                s61 s61Var = a71Var.W2;
                if (s61Var.H(b1Var.b()) >= 0 && s61Var.H(b1Var.b()) == s61Var.H(b1Var2.b())) {
                    int b20 = b1Var.b();
                    int b21 = b1Var2.b();
                    ArrayList arrayList5 = s61Var.f30204x;
                    if (s61Var.L != null) {
                        int H = s61Var.H(b20);
                        int H2 = s61Var.H(b21);
                        if (H >= 0 && H == H2) {
                            boolean J = s61Var.J(b20);
                            boolean J2 = s61Var.J(b21);
                            arrayList5.add(b21, (f61) arrayList5.remove(b20));
                            s61Var.p(b20, b21);
                            if (s61Var.J(b21) != J) {
                                s61Var.n(b21, 3);
                            }
                            if (s61Var.J(b20) != J2) {
                                s61Var.n(b20, 3);
                            }
                            if (s61Var.K && (i11 = s61Var.J) != H) {
                                s61Var.F(i11);
                            }
                            s61Var.K = true;
                            s61Var.J = H;
                        }
                    }
                    a71Var.I1();
                    return true;
                }
                return false;
            case 5:
                int b22 = b1Var.b();
                int b23 = b1Var2.b();
                b91 b91Var = (b91) this.e;
                ArrayList arrayList6 = b91Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((l2.f) b91Var.f24871y).q(b22) && ((l2.f) b91Var.f24871y).q(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    b91Var.f24870x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((y81) obj).f32571a));
                    }
                    u81 u81Var = ((c91) ((l2.f) b91Var.f24871y).f15842b).L;
                    z11 = true;
                    z11 = true;
                    if (u81Var != null) {
                        u81Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (b1Var.f45913f == b1Var2.f45913f && r(b1Var.b()) && r(b1Var2.b())) {
                    fv0 fv0Var = ((hv0) this.e).f37626b;
                    int b24 = b1Var.b();
                    int b25 = b1Var2.b();
                    hv0 hv0Var = fv0Var.d;
                    int i23 = hv0Var.f37641n0;
                    int i24 = b24 - i23;
                    int i25 = b25 - i23;
                    if (i24 >= 0 && i25 >= 0 && i24 < (i12 = hv0Var.f37656y) && i25 < i12) {
                        CharSequence[] charSequenceArr2 = hv0Var.v;
                        CharSequence charSequence2 = charSequenceArr2[i24];
                        charSequenceArr2[i24] = charSequenceArr2[i25];
                        charSequenceArr2[i25] = charSequence2;
                        int[] iArr = hv0Var.f37645r;
                        if (iArr != null) {
                            int i26 = iArr[i24];
                            iArr[i24] = iArr[i25];
                            iArr[i25] = i26;
                        }
                        boolean[] zArr2 = hv0Var.f37652w;
                        boolean z12 = zArr2[i24];
                        zArr2[i24] = zArr2[i25];
                        zArr2[i25] = z12;
                        fv0Var.p(b24, b25);
                    }
                    return true;
                }
                return false;
        }
    }

    @Override
    public void o(RecyclerView recyclerView, b1 b1Var, b1 b1Var2, int i10, int i11, int i12) {
        switch (this.d) {
            case 4:
                return;
            default:
                super.o(recyclerView, b1Var, b1Var2, i10, i11, i12);
                return;
        }
    }

    @Override
    public void p(b1 b1Var, int i10) {
        ArrayList arrayList;
        boolean z10;
        switch (this.d) {
            case 0:
                r rVar = (r) this.e;
                i iVar = rVar.f8058f;
                if (b1Var != null) {
                    iVar.d1(false);
                }
                if (i10 == 0) {
                    l lVar = rVar.v;
                    ArrayList arrayList2 = lVar.f8051n;
                    z6 z6Var = lVar.e;
                    if (z6Var != null && lVar.f8052r) {
                        if (z6Var instanceof s6) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < lVar.e.f6184i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((MessageObject) lVar.e.f6184i.get(i11)).getId()));
                            }
                        } else {
                            arrayList = z6Var.f6183g;
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
                        lVar.f8052r = false;
                    }
                    iVar.setItemAnimator(null);
                    return;
                }
                iVar.I0(false);
                if (b1Var != null) {
                    b1Var.f45910a.setPressed(true);
                    return;
                }
                return;
            case 1:
                xo xoVar = (xo) this.e;
                yo yoVar = xoVar.Y2;
                if (i10 == 0) {
                    yoVar.L = false;
                    if (xoVar.W2) {
                        TLRPC.Chat chat = yoVar.X;
                        ArrayList arrayList3 = yoVar.N;
                        ArrayList arrayList4 = yoVar.M;
                        if (chat != null) {
                            xoVar.W2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = yoVar.X;
                            tL_inputChannel.channel_id = chat2.f20272id;
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
                            yoVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new d6(10));
                            yoVar.X.usernames.clear();
                            yoVar.X.usernames.addAll(arrayList4);
                            yoVar.X.usernames.addAll(arrayList3);
                            yoVar.getMessagesController().putChat(yoVar.X, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                yoVar.L = true;
                xoVar.I0(false);
                b1Var.f45910a.setPressed(true);
                return;
            case 2:
                fo foVar = (fo) this.e;
                ua1 ua1Var = foVar.f26308s;
                if (i10 != 0) {
                    ua1Var.setItemAnimator(foVar.v);
                    ua1Var.I0(false);
                    b1Var.f45910a.setPressed(true);
                    b1Var.f45910a.setBackgroundColor(h6.w0(h6.f21057h5, foVar.f28237a));
                    return;
                }
                return;
            case 3:
                if (i10 != 0) {
                    ((tn0) this.e).f30669b.I0(false);
                    b1Var.f45910a.setPressed(true);
                    return;
                }
                return;
            case 4:
                a71 a71Var = (a71) this.e;
                if (b1Var != null) {
                    a71Var.d1(false);
                }
                if (i10 == 0) {
                    s61 s61Var = a71Var.W2;
                    if (s61Var.K) {
                        s61Var.F(s61Var.J);
                    }
                    if (a71Var.f24514b3 != null) {
                        a71Var.E1();
                        a71Var.f24514b3 = null;
                        return;
                    }
                    return;
                }
                a71Var.I0(false);
                if (b1Var != null) {
                    View view = b1Var.f45910a;
                    view.setPressed(true);
                    if (view.getBackground() instanceof a2) {
                        a2 a2Var = (a2) view.getBackground();
                        if (!a2Var.f15117c) {
                            a2Var.f15117c = true;
                            a2Var.invalidateSelf();
                        }
                    }
                    if (i10 == 2) {
                        a71Var.f24514b3 = b1Var;
                        a71Var.H1(b1Var);
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
                    ((hv0) this.e).f37628c.I0(false);
                    b1Var.f45910a.setPressed(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(b1 b1Var) {
        int i10 = this.d;
    }

    public boolean r(int i10) {
        hv0 hv0Var = (hv0) this.e;
        if (!hv0Var.I || i10 - hv0Var.f37641n0 >= hv0Var.f37654x) {
            return true;
        }
        return false;
    }

    private final void t(b1 b1Var) {
    }

    private final void u(b1 b1Var) {
    }

    private final void v(b1 b1Var) {
    }

    private final void w(b1 b1Var) {
    }

    private final void x(b1 b1Var) {
    }

    private final void y(b1 b1Var) {
    }

    private final void z(b1 b1Var) {
    }

    private final void s(RecyclerView recyclerView, b1 b1Var, b1 b1Var2, int i10, int i11, int i12) {
    }
}
