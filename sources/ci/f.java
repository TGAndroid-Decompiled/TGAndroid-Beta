package ci;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.f8;
import bi.g7;
import bi.o8;
import java.util.ArrayList;
import ji.a2;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.ew0;
import org.telegram.ui.gw0;
import org.telegram.ui.kc1;
import org.telegram.ui.lp;
import org.telegram.ui.mp;
import org.telegram.ui.np;
import org.telegram.ui.sa;
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
                b1Var.f44838a.setPressed(false);
                return;
            case 1:
                super.a(recyclerView, b1Var);
                b1Var.f44838a.setPressed(false);
                return;
            case 2:
                super.a(recyclerView, b1Var);
                View view = b1Var.f44838a;
                view.setPressed(false);
                view.setBackground(null);
                return;
            case 3:
                super.a(recyclerView, b1Var);
                b1Var.f44838a.setPressed(false);
                return;
            case 4:
                h71 h71Var = (h71) this.e;
                super.a(recyclerView, b1Var);
                View view2 = b1Var.f44838a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof a2) {
                    a2 a2Var = (a2) view2.getBackground();
                    if (a2Var.f13126c) {
                        a2Var.f13126c = false;
                        a2Var.invalidateSelf();
                    }
                }
                if (h71Var.B1()) {
                    h71Var.G1(b1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(es.h).start();
                    return;
                }
                return;
            case 5:
            default:
                super.a(recyclerView, b1Var);
                return;
            case 6:
                super.a(recyclerView, b1Var);
                b1Var.f44838a.setPressed(false);
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, b1 b1Var) {
        switch (this.d) {
            case 0:
                t tVar = (t) this.e;
                if (tVar.W.G.C1 && tVar.v.L(b1Var.b())) {
                    tVar.f4783f.setItemAnimator(tVar.f4784n);
                    return s4.v.l(15, 0);
                }
                return s4.v.l(0, 0);
            case 1:
                if (b1Var.f44841f == 1 && ((sa) b1Var.f44838a).G) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
            case 2:
                if (b1Var.f44841f != 5) {
                    return s4.v.l(0, 0);
                }
                return s4.v.l(3, 0);
            case 3:
                int b10 = b1Var.b();
                yn0 yn0Var = (yn0) this.e;
                if (b10 >= yn0Var.v && b1Var.b() < yn0Var.f31660w) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
            case 4:
                h71 h71Var = (h71) this.e;
                if (h71Var.f25532a3 && h71Var.W2.H(b1Var.b()) >= 0) {
                    int i10 = 15;
                    if (h71Var.V2.f44826o == 0) {
                        if (!h71Var.Z2) {
                            i10 = 12;
                        }
                    } else if (!h71Var.Z2) {
                        i10 = 3;
                    }
                    return s4.v.l(i10, 0);
                }
                return s4.v.l(0, 0);
            case 5:
                if (((l2.f) ((j91) this.e).f26299y).e(b1Var.b())) {
                    return s4.v.l(12, 0);
                }
                return s4.v.l(0, 0);
            default:
                if (b1Var.f44841f == 5 && r(b1Var.b())) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
        }
    }

    @Override
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((t) this.e).W.G.C1;
            case 1:
            case 2:
            case 5:
            default:
                return super.k();
            case 3:
                return ((yn0) this.e).I.g();
            case 4:
                h71 h71Var = (h71) this.e;
                if (h71Var.f25532a3 && h71Var.f25534c3) {
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
                h71 h71Var = (h71) this.e;
                if (i10 != 2 || z10 || !h71Var.B1()) {
                    super.m(canvas, recyclerView, b1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        h71Var.F1(b1Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                super.m(canvas, recyclerView, b1Var, f7, f10, i10, z10);
                ((j91) this.e).invalidate();
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
                l lVar = ((t) this.e).v;
                if (!lVar.L(b1Var.b()) || !lVar.L(b1Var2.b())) {
                    return false;
                }
                int b10 = b1Var.b();
                int b11 = b1Var2.b();
                ArrayList arrayList2 = lVar.f4776n;
                o8 o8Var = lVar.e;
                if (o8Var != null && b10 >= 0 && b10 < o8Var.f3429i.size() && b11 >= 0 && b11 < lVar.e.f3429i.size()) {
                    if (lVar.e instanceof f8) {
                        arrayList = new ArrayList();
                        for (int i13 = 0; i13 < lVar.e.f3429i.size(); i13++) {
                            arrayList.add(Integer.valueOf(((MessageObject) lVar.e.f3429i.get(i13)).getId()));
                        }
                    } else {
                        arrayList = new ArrayList(lVar.e.f3428g);
                    }
                    if (!lVar.f4777r) {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        lVar.f4777r = true;
                    }
                    MessageObject messageObject = (MessageObject) lVar.e.f3429i.get(b10);
                    MessageObject messageObject2 = (MessageObject) lVar.e.f3429i.get(b11);
                    arrayList.remove(Integer.valueOf(messageObject.getId()));
                    arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
                    lVar.e.C(arrayList, false);
                    lVar.p(b10, b11);
                }
                return true;
            case 1:
                if (b1Var.f44841f == b1Var2.f44841f) {
                    View view = b1Var2.f44838a;
                    if (!(view instanceof sa) || ((sa) view).G) {
                        lp lpVar = ((mp) this.e).V2;
                        int b12 = b1Var.b();
                        int b13 = b1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        mp mpVar = lpVar.f38062c;
                        np npVar = mpVar.Y2;
                        ArrayList arrayList3 = npVar.N;
                        if (i14 >= npVar.N.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            mpVar.W2 = true;
                        }
                        arrayList3.set(i14, (TLRPC.TL_username) arrayList3.get(i15));
                        arrayList3.set(i15, (TLRPC.TL_username) arrayList3.get(i14));
                        lpVar.p(b12, b13);
                        int size = arrayList3.size();
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        lpVar.n(b12, 3);
                        lpVar.n(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (b1Var.f44841f != b1Var2.f44841f) {
                    return false;
                }
                go goVar = ((io) this.e).f26029r;
                int b14 = b1Var.b();
                int b15 = b1Var2.b();
                io ioVar = goVar.d;
                int i16 = ioVar.f26033t0;
                rh.f fVar = ioVar.l1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = ioVar.M) && i18 < i10) {
                    rh.e b16 = fVar.b(i17);
                    SparseArray sparseArray = fVar.f44666a;
                    sparseArray.put(i17, fVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = ioVar.K;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = ioVar.L;
                    boolean z10 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z10;
                    goVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = b1Var2.b();
                yn0 yn0Var = (yn0) this.e;
                ArrayList arrayList4 = yn0Var.e;
                if (b17 >= yn0Var.v && b1Var2.b() < yn0Var.f31660w) {
                    int b18 = b1Var.b();
                    int b19 = b1Var2.b();
                    int i19 = yn0Var.v;
                    int i20 = b18 - i19;
                    int i21 = b19 - i19;
                    arrayList4.indexOf(Integer.valueOf(i20));
                    arrayList4.get(b18 - yn0Var.v);
                    MessageObject messageObject3 = (MessageObject) arrayList4.get(i20);
                    MessageObject messageObject4 = (MessageObject) arrayList4.get(i21);
                    arrayList4.set(i20, messageObject4);
                    arrayList4.set(i21, messageObject3);
                    DownloadController.getInstance(yn0Var.d).swapLoadingPriority(messageObject3, messageObject4);
                    yn0Var.f31655c.p(b18, b19);
                    return false;
                }
                return false;
            case 4:
                h71 h71Var = (h71) this.e;
                z61 z61Var = h71Var.W2;
                if (z61Var.H(b1Var.b()) >= 0 && z61Var.H(b1Var.b()) == z61Var.H(b1Var2.b())) {
                    int b20 = b1Var.b();
                    int b21 = b1Var2.b();
                    ArrayList arrayList5 = z61Var.f31783x;
                    if (z61Var.L != null) {
                        int H = z61Var.H(b20);
                        int H2 = z61Var.H(b21);
                        if (H >= 0 && H == H2) {
                            boolean J = z61Var.J(b20);
                            boolean J2 = z61Var.J(b21);
                            arrayList5.add(b21, (l61) arrayList5.remove(b20));
                            z61Var.p(b20, b21);
                            if (z61Var.J(b21) != J) {
                                z61Var.n(b21, 3);
                            }
                            if (z61Var.J(b20) != J2) {
                                z61Var.n(b20, 3);
                            }
                            if (z61Var.K && (i11 = z61Var.J) != H) {
                                z61Var.F(i11);
                            }
                            z61Var.K = true;
                            z61Var.J = H;
                        }
                    }
                    h71Var.I1();
                    return true;
                }
                return false;
            case 5:
                int b22 = b1Var.b();
                int b23 = b1Var2.b();
                j91 j91Var = (j91) this.e;
                ArrayList arrayList6 = j91Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((l2.f) j91Var.f26299y).e(b22) && ((l2.f) j91Var.f26299y).e(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    j91Var.f26298x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((g91) obj).f25238a));
                    }
                    c91 c91Var = ((k91) ((l2.f) j91Var.f26299y).f14503b).L;
                    z11 = true;
                    z11 = true;
                    if (c91Var != null) {
                        c91Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (b1Var.f44841f == b1Var2.f44841f && r(b1Var.b()) && r(b1Var2.b())) {
                    ew0 ew0Var = ((gw0) this.e).f36505b;
                    int b24 = b1Var.b();
                    int b25 = b1Var2.b();
                    gw0 gw0Var = ew0Var.d;
                    int i23 = gw0Var.f36520n0;
                    int i24 = b24 - i23;
                    int i25 = b25 - i23;
                    if (i24 >= 0 && i25 >= 0 && i24 < (i12 = gw0Var.f36535y) && i25 < i12) {
                        CharSequence[] charSequenceArr2 = gw0Var.v;
                        CharSequence charSequence2 = charSequenceArr2[i24];
                        charSequenceArr2[i24] = charSequenceArr2[i25];
                        charSequenceArr2[i25] = charSequence2;
                        int[] iArr = gw0Var.f36524r;
                        if (iArr != null) {
                            int i26 = iArr[i24];
                            iArr[i24] = iArr[i25];
                            iArr[i25] = i26;
                        }
                        boolean[] zArr2 = gw0Var.f36531w;
                        boolean z12 = zArr2[i24];
                        zArr2[i24] = zArr2[i25];
                        zArr2[i25] = z12;
                        ew0Var.p(b24, b25);
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
                t tVar = (t) this.e;
                i iVar = tVar.f4783f;
                if (b1Var != null) {
                    iVar.d1(false);
                }
                if (i10 == 0) {
                    l lVar = tVar.v;
                    ArrayList arrayList2 = lVar.f4776n;
                    o8 o8Var = lVar.e;
                    if (o8Var != null && lVar.f4777r) {
                        if (o8Var instanceof f8) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < lVar.e.f3429i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((MessageObject) lVar.e.f3429i.get(i11)).getId()));
                            }
                        } else {
                            arrayList = o8Var.f3428g;
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
                        lVar.f4777r = false;
                    }
                    iVar.setItemAnimator(null);
                    return;
                }
                iVar.I0(false);
                if (b1Var != null) {
                    b1Var.f44838a.setPressed(true);
                    return;
                }
                return;
            case 1:
                mp mpVar = (mp) this.e;
                np npVar = mpVar.Y2;
                if (i10 == 0) {
                    npVar.L = false;
                    if (mpVar.W2) {
                        TLRPC.Chat chat = npVar.X;
                        ArrayList arrayList3 = npVar.N;
                        ArrayList arrayList4 = npVar.M;
                        if (chat != null) {
                            mpVar.W2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = npVar.X;
                            tL_inputChannel.channel_id = chat2.f19216id;
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
                            npVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new g7(10));
                            npVar.X.usernames.clear();
                            npVar.X.usernames.addAll(arrayList4);
                            npVar.X.usernames.addAll(arrayList3);
                            npVar.getMessagesController().putChat(npVar.X, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                npVar.L = true;
                mpVar.I0(false);
                b1Var.f44838a.setPressed(true);
                return;
            case 2:
                io ioVar = (io) this.e;
                kc1 kc1Var = ioVar.f26031s;
                if (i10 != 0) {
                    kc1Var.setItemAnimator(ioVar.v);
                    kc1Var.I0(false);
                    b1Var.f44838a.setPressed(true);
                    b1Var.f44838a.setBackgroundColor(g6.w0(g6.f19972h5, ioVar.f27670a));
                    return;
                }
                return;
            case 3:
                if (i10 != 0) {
                    ((yn0) this.e).f31654b.I0(false);
                    b1Var.f44838a.setPressed(true);
                    return;
                }
                return;
            case 4:
                h71 h71Var = (h71) this.e;
                if (b1Var != null) {
                    h71Var.d1(false);
                }
                if (i10 == 0) {
                    z61 z61Var = h71Var.W2;
                    if (z61Var.K) {
                        z61Var.F(z61Var.J);
                    }
                    if (h71Var.f25533b3 != null) {
                        h71Var.E1();
                        h71Var.f25533b3 = null;
                        return;
                    }
                    return;
                }
                h71Var.I0(false);
                if (b1Var != null) {
                    View view = b1Var.f44838a;
                    view.setPressed(true);
                    if (view.getBackground() instanceof a2) {
                        a2 a2Var = (a2) view.getBackground();
                        if (!a2Var.f13126c) {
                            a2Var.f13126c = true;
                            a2Var.invalidateSelf();
                        }
                    }
                    if (i10 == 2) {
                        h71Var.f25533b3 = b1Var;
                        h71Var.H1(b1Var);
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
                    ((gw0) this.e).f36507c.I0(false);
                    b1Var.f44838a.setPressed(true);
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
        gw0 gw0Var = (gw0) this.e;
        if (!gw0Var.I || i10 - gw0Var.f36520n0 >= gw0Var.f36533x) {
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
