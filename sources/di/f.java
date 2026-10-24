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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.zr;
import org.telegram.ui.fv0;
import org.telegram.ui.hv0;
import org.telegram.ui.pa;
import org.telegram.ui.wa1;
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
                b1Var.f46342a.setPressed(false);
                return;
            case 1:
                super.a(recyclerView, b1Var);
                b1Var.f46342a.setPressed(false);
                return;
            case 2:
                super.a(recyclerView, b1Var);
                View view = b1Var.f46342a;
                view.setPressed(false);
                view.setBackground(null);
                return;
            case 3:
                super.a(recyclerView, b1Var);
                b1Var.f46342a.setPressed(false);
                return;
            case 4:
                i71 i71Var = (i71) this.e;
                super.a(recyclerView, b1Var);
                View view2 = b1Var.f46342a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof a2) {
                    a2 a2Var = (a2) view2.getBackground();
                    if (a2Var.f15164c) {
                        a2Var.f15164c = false;
                        a2Var.invalidateSelf();
                    }
                }
                if (i71Var.G1()) {
                    i71Var.L1(b1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(zr.h).start();
                    return;
                }
                return;
            case 5:
            default:
                super.a(recyclerView, b1Var);
                return;
            case 6:
                super.a(recyclerView, b1Var);
                b1Var.f46342a.setPressed(false);
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, b1 b1Var) {
        switch (this.d) {
            case 0:
                r rVar = (r) this.e;
                if (rVar.W.G.C1 && rVar.v.L(b1Var.b())) {
                    rVar.f8064f.setItemAnimator(rVar.f8065n);
                    return s4.v.l(15, 0);
                }
                return s4.v.l(0, 0);
            case 1:
                if (b1Var.f46345f == 1 && ((pa) b1Var.f46342a).G) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
            case 2:
                if (b1Var.f46345f != 5) {
                    return s4.v.l(0, 0);
                }
                return s4.v.l(3, 0);
            case 3:
                int b10 = b1Var.b();
                wn0 wn0Var = (wn0) this.e;
                if (b10 >= wn0Var.v && b1Var.b() < wn0Var.f32309w) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
            case 4:
                i71 i71Var = (i71) this.e;
                if (i71Var.f27322d3 && i71Var.Z2.H(b1Var.b()) >= 0) {
                    int i10 = 15;
                    if (i71Var.Y2.f46330o == 0) {
                        if (!i71Var.f27321c3) {
                            i10 = 12;
                        }
                    } else if (!i71Var.f27321c3) {
                        i10 = 3;
                    }
                    return s4.v.l(i10, 0);
                }
                return s4.v.l(0, 0);
            case 5:
                if (((l2.f) ((k91) this.e).f27989y).l(b1Var.b())) {
                    return s4.v.l(12, 0);
                }
                return s4.v.l(0, 0);
            default:
                if (b1Var.f46345f == 5 && r(b1Var.b())) {
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
                return ((wn0) this.e).I.g();
            case 4:
                i71 i71Var = (i71) this.e;
                if (i71Var.f27322d3 && i71Var.f27324f3) {
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
                i71 i71Var = (i71) this.e;
                if (i10 != 2 || z10 || !i71Var.G1()) {
                    super.m(canvas, recyclerView, b1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        i71Var.K1(b1Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                super.m(canvas, recyclerView, b1Var, f7, f10, i10, z10);
                ((k91) this.e).invalidate();
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
                ArrayList arrayList2 = lVar.f8057n;
                z6 z6Var = lVar.e;
                if (z6Var != null && b10 >= 0 && b10 < z6Var.f6193i.size() && b11 >= 0 && b11 < lVar.e.f6193i.size()) {
                    if (lVar.e instanceof s6) {
                        arrayList = new ArrayList();
                        for (int i13 = 0; i13 < lVar.e.f6193i.size(); i13++) {
                            arrayList.add(Integer.valueOf(((MessageObject) lVar.e.f6193i.get(i13)).getId()));
                        }
                    } else {
                        arrayList = new ArrayList(lVar.e.f6192g);
                    }
                    if (!lVar.f8058r) {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        lVar.f8058r = true;
                    }
                    MessageObject messageObject = (MessageObject) lVar.e.f6193i.get(b10);
                    MessageObject messageObject2 = (MessageObject) lVar.e.f6193i.get(b11);
                    arrayList.remove(Integer.valueOf(messageObject.getId()));
                    arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
                    lVar.e.C(arrayList, false);
                    lVar.p(b10, b11);
                }
                return true;
            case 1:
                if (b1Var.f46345f == b1Var2.f46345f) {
                    View view = b1Var2.f46342a;
                    if (!(view instanceof pa) || ((pa) view).G) {
                        wo woVar = ((xo) this.e).Y2;
                        int b12 = b1Var.b();
                        int b13 = b1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        xo xoVar = woVar.f43379c;
                        yo yoVar = xoVar.f43653b3;
                        ArrayList arrayList3 = yoVar.O;
                        if (i14 >= yoVar.O.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            xoVar.Z2 = true;
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
                if (b1Var.f46345f != b1Var2.f46345f) {
                    return false;
                }
                ao aoVar = ((co) this.e).f25390r;
                int b14 = b1Var.b();
                int b15 = b1Var2.b();
                co coVar = aoVar.d;
                int i16 = coVar.f25394t0;
                rh.f fVar = coVar.f25380m1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = coVar.M) && i18 < i10) {
                    rh.e b16 = fVar.b(i17);
                    SparseArray sparseArray = fVar.f46180a;
                    sparseArray.put(i17, fVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = coVar.K;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = coVar.L;
                    boolean z10 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z10;
                    aoVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = b1Var2.b();
                wn0 wn0Var = (wn0) this.e;
                ArrayList arrayList4 = wn0Var.e;
                if (b17 >= wn0Var.v && b1Var2.b() < wn0Var.f32309w) {
                    int b18 = b1Var.b();
                    int b19 = b1Var2.b();
                    int i19 = wn0Var.v;
                    int i20 = b18 - i19;
                    int i21 = b19 - i19;
                    arrayList4.indexOf(Integer.valueOf(i20));
                    arrayList4.get(b18 - wn0Var.v);
                    MessageObject messageObject3 = (MessageObject) arrayList4.get(i20);
                    MessageObject messageObject4 = (MessageObject) arrayList4.get(i21);
                    arrayList4.set(i20, messageObject4);
                    arrayList4.set(i21, messageObject3);
                    DownloadController.getInstance(wn0Var.d).swapLoadingPriority(messageObject3, messageObject4);
                    wn0Var.f32304c.p(b18, b19);
                    return false;
                }
                return false;
            case 4:
                i71 i71Var = (i71) this.e;
                a71 a71Var = i71Var.Z2;
                if (a71Var.H(b1Var.b()) >= 0 && a71Var.H(b1Var.b()) == a71Var.H(b1Var2.b())) {
                    int b20 = b1Var.b();
                    int b21 = b1Var2.b();
                    ArrayList arrayList5 = a71Var.f24650y;
                    if (a71Var.M != null) {
                        int H = a71Var.H(b20);
                        int H2 = a71Var.H(b21);
                        if (H >= 0 && H == H2) {
                            boolean J = a71Var.J(b20);
                            boolean J2 = a71Var.J(b21);
                            arrayList5.add(b21, (l61) arrayList5.remove(b20));
                            a71Var.p(b20, b21);
                            if (a71Var.J(b21) != J) {
                                a71Var.n(b21, 3);
                            }
                            if (a71Var.J(b20) != J2) {
                                a71Var.n(b20, 3);
                            }
                            if (a71Var.L && (i11 = a71Var.K) != H) {
                                a71Var.F(i11);
                            }
                            a71Var.L = true;
                            a71Var.K = H;
                        }
                    }
                    i71Var.N1();
                    return true;
                }
                return false;
            case 5:
                int b22 = b1Var.b();
                int b23 = b1Var2.b();
                k91 k91Var = (k91) this.e;
                ArrayList arrayList6 = k91Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((l2.f) k91Var.f27989y).l(b22) && ((l2.f) k91Var.f27989y).l(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    k91Var.f27988x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((h91) obj).f26971a));
                    }
                    d91 d91Var = ((l91) ((l2.f) k91Var.f27989y).f15906b).L;
                    z11 = true;
                    z11 = true;
                    if (d91Var != null) {
                        d91Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (b1Var.f46345f == b1Var2.f46345f && r(b1Var.b()) && r(b1Var2.b())) {
                    fv0 fv0Var = ((hv0) this.e).f38032b;
                    int b24 = b1Var.b();
                    int b25 = b1Var2.b();
                    hv0 hv0Var = fv0Var.d;
                    int i23 = hv0Var.f38047n0;
                    int i24 = b24 - i23;
                    int i25 = b25 - i23;
                    if (i24 >= 0 && i25 >= 0 && i24 < (i12 = hv0Var.f38062y) && i25 < i12) {
                        CharSequence[] charSequenceArr2 = hv0Var.v;
                        CharSequence charSequence2 = charSequenceArr2[i24];
                        charSequenceArr2[i24] = charSequenceArr2[i25];
                        charSequenceArr2[i25] = charSequence2;
                        int[] iArr = hv0Var.f38051r;
                        if (iArr != null) {
                            int i26 = iArr[i24];
                            iArr[i24] = iArr[i25];
                            iArr[i25] = i26;
                        }
                        boolean[] zArr2 = hv0Var.f38058w;
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
                i iVar = rVar.f8064f;
                if (b1Var != null) {
                    iVar.e1(false);
                }
                if (i10 == 0) {
                    l lVar = rVar.v;
                    ArrayList arrayList2 = lVar.f8057n;
                    z6 z6Var = lVar.e;
                    if (z6Var != null && lVar.f8058r) {
                        if (z6Var instanceof s6) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < lVar.e.f6193i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((MessageObject) lVar.e.f6193i.get(i11)).getId()));
                            }
                        } else {
                            arrayList = z6Var.f6192g;
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
                        lVar.f8058r = false;
                    }
                    iVar.setItemAnimator(null);
                    return;
                }
                iVar.I0(false);
                if (b1Var != null) {
                    b1Var.f46342a.setPressed(true);
                    return;
                }
                return;
            case 1:
                xo xoVar = (xo) this.e;
                yo yoVar = xoVar.f43653b3;
                if (i10 == 0) {
                    yoVar.M = false;
                    if (xoVar.Z2) {
                        TLRPC.Chat chat = yoVar.Y;
                        ArrayList arrayList3 = yoVar.O;
                        ArrayList arrayList4 = yoVar.N;
                        if (chat != null) {
                            xoVar.Z2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = yoVar.Y;
                            tL_inputChannel.channel_id = chat2.f20344id;
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
                            yoVar.Y.usernames.clear();
                            yoVar.Y.usernames.addAll(arrayList4);
                            yoVar.Y.usernames.addAll(arrayList3);
                            yoVar.getMessagesController().putChat(yoVar.Y, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                yoVar.M = true;
                xoVar.I0(false);
                b1Var.f46342a.setPressed(true);
                return;
            case 2:
                co coVar = (co) this.e;
                wa1 wa1Var = coVar.f25392s;
                if (i10 != 0) {
                    wa1Var.setItemAnimator(coVar.v);
                    wa1Var.I0(false);
                    b1Var.f46342a.setPressed(true);
                    r6.i(k6.f21255h5, b1Var.f46342a, coVar.f27703a);
                    return;
                }
                return;
            case 3:
                if (i10 != 0) {
                    ((wn0) this.e).f32303b.I0(false);
                    b1Var.f46342a.setPressed(true);
                    return;
                }
                return;
            case 4:
                i71 i71Var = (i71) this.e;
                if (b1Var != null) {
                    i71Var.e1(false);
                }
                if (i10 == 0) {
                    a71 a71Var = i71Var.Z2;
                    if (a71Var.L) {
                        a71Var.F(a71Var.K);
                    }
                    if (i71Var.f27323e3 != null) {
                        i71Var.J1();
                        i71Var.f27323e3 = null;
                        return;
                    }
                    return;
                }
                i71Var.I0(false);
                if (b1Var != null) {
                    View view = b1Var.f46342a;
                    view.setPressed(true);
                    if (view.getBackground() instanceof a2) {
                        a2 a2Var = (a2) view.getBackground();
                        if (!a2Var.f15164c) {
                            a2Var.f15164c = true;
                            a2Var.invalidateSelf();
                        }
                    }
                    if (i10 == 2) {
                        i71Var.f27323e3 = b1Var;
                        i71Var.M1(b1Var);
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
                    ((hv0) this.e).f38034c.I0(false);
                    b1Var.f46342a.setPressed(true);
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
        if (!hv0Var.I || i10 - hv0Var.f38047n0 >= hv0Var.f38060x) {
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
