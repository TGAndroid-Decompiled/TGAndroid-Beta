package bi;

import ai.d9;
import ai.u7;
import ai.u8;
import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ii.b2;
import java.util.ArrayList;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.w81;
import org.telegram.ui.dp;
import org.telegram.ui.ep;
import org.telegram.ui.fp;
import org.telegram.ui.na;
import org.telegram.ui.pv0;
import org.telegram.ui.rv0;
import org.telegram.ui.wb1;
import s4.c1;
public final class g extends s4.v {
    public final int d;
    public final Object e;

    public g(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, c1 c1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, c1Var);
                c1Var.f42946a.setPressed(false);
                return;
            case 1:
                super.a(recyclerView, c1Var);
                c1Var.f42946a.setPressed(false);
                return;
            case 2:
                super.a(recyclerView, c1Var);
                View view = c1Var.f42946a;
                view.setPressed(false);
                view.setBackground(null);
                return;
            case 3:
                super.a(recyclerView, c1Var);
                c1Var.f42946a.setPressed(false);
                return;
            case 4:
                r61 r61Var = (r61) this.e;
                super.a(recyclerView, c1Var);
                View view2 = c1Var.f42946a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof b2) {
                    b2 b2Var = (b2) view2.getBackground();
                    if (b2Var.f11240c) {
                        b2Var.f11240c = false;
                        b2Var.invalidateSelf();
                    }
                }
                if (r61Var.A1()) {
                    r61Var.F1(c1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(rr.h).start();
                    return;
                }
                return;
            case 5:
            default:
                super.a(recyclerView, c1Var);
                return;
            case 6:
                super.a(recyclerView, c1Var);
                c1Var.f42946a.setPressed(false);
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, c1 c1Var) {
        switch (this.d) {
            case 0:
                u uVar = (u) this.e;
                if (uVar.W.G.C1 && uVar.v.L(c1Var.b())) {
                    uVar.f3586f.setItemAnimator(uVar.f3587n);
                    return s4.v.l(15, 0);
                }
                return s4.v.l(0, 0);
            case 1:
                if (c1Var.f42949f == 1 && ((na) c1Var.f42946a).G) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
            case 2:
                if (c1Var.f42949f != 5) {
                    return s4.v.l(0, 0);
                }
                return s4.v.l(3, 0);
            case 3:
                int b10 = c1Var.b();
                in0 in0Var = (in0) this.e;
                if (b10 >= in0Var.v && c1Var.b() < in0Var.f25100w) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
            case 4:
                r61 r61Var = (r61) this.e;
                if (r61Var.f27878c3 && r61Var.Y2.H(c1Var.b()) >= 0) {
                    int i10 = 15;
                    if (r61Var.X2.f42934o == 0) {
                        if (!r61Var.f27877b3) {
                            i10 = 12;
                        }
                    } else if (!r61Var.f27877b3) {
                        i10 = 3;
                    }
                    return s4.v.l(i10, 0);
                }
                return s4.v.l(0, 0);
            case 5:
                if (((l.d) ((v81) this.e).f29100y).G(c1Var.b())) {
                    return s4.v.l(12, 0);
                }
                return s4.v.l(0, 0);
            default:
                if (c1Var.f42949f == 5 && r(c1Var.b())) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
        }
    }

    @Override
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((u) this.e).W.G.C1;
            case 1:
            case 2:
            case 5:
            default:
                return super.k();
            case 3:
                return ((in0) this.e).I.g();
            case 4:
                r61 r61Var = (r61) this.e;
                if (r61Var.f27878c3 && r61Var.f27880e3) {
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
                r61 r61Var = (r61) this.e;
                if (i10 != 2 || z10 || !r61Var.A1()) {
                    super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        r61Var.E1(c1Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                ((v81) this.e).invalidate();
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
                m mVar = ((u) this.e).v;
                if (!mVar.L(c1Var.b()) || !mVar.L(c1Var2.b())) {
                    return false;
                }
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                ArrayList arrayList2 = mVar.f3579n;
                d9 d9Var = mVar.e;
                if (d9Var != null && b10 >= 0 && b10 < d9Var.f725i.size() && b11 >= 0 && b11 < mVar.e.f725i.size()) {
                    if (mVar.e instanceof u8) {
                        arrayList = new ArrayList();
                        for (int i13 = 0; i13 < mVar.e.f725i.size(); i13++) {
                            arrayList.add(Integer.valueOf(((MessageObject) mVar.e.f725i.get(i13)).getId()));
                        }
                    } else {
                        arrayList = new ArrayList(mVar.e.f724g);
                    }
                    if (!mVar.f3580r) {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        mVar.f3580r = true;
                    }
                    MessageObject messageObject = (MessageObject) mVar.e.f725i.get(b10);
                    MessageObject messageObject2 = (MessageObject) mVar.e.f725i.get(b11);
                    arrayList.remove(Integer.valueOf(messageObject.getId()));
                    arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
                    mVar.e.C(arrayList, false);
                    mVar.p(b10, b11);
                }
                return true;
            case 1:
                if (c1Var.f42949f == c1Var2.f42949f) {
                    View view = c1Var2.f42946a;
                    if (!(view instanceof na) || ((na) view).G) {
                        dp dpVar = ((ep) this.e).X2;
                        int b12 = c1Var.b();
                        int b13 = c1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        ep epVar = dpVar.f33140c;
                        fp fpVar = epVar.f33440a3;
                        ArrayList arrayList3 = fpVar.N;
                        if (i14 >= fpVar.N.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            epVar.Y2 = true;
                        }
                        arrayList3.set(i14, (TLRPC.TL_username) arrayList3.get(i15));
                        arrayList3.set(i15, (TLRPC.TL_username) arrayList3.get(i14));
                        dpVar.p(b12, b13);
                        int size = arrayList3.size();
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        dpVar.n(b12, 3);
                        dpVar.n(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (c1Var.f42949f != c1Var2.f42949f) {
                    return false;
                }
                tn tnVar = ((vn) this.e).f29203r;
                int b14 = c1Var.b();
                int b15 = c1Var2.b();
                vn vnVar = tnVar.d;
                int i16 = vnVar.f29207t0;
                qh.f fVar = vnVar.l1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = vnVar.M) && i18 < i10) {
                    qh.e b16 = fVar.b(i17);
                    SparseArray sparseArray = fVar.f42037a;
                    sparseArray.put(i17, fVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = vnVar.K;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = vnVar.L;
                    boolean z10 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z10;
                    tnVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = c1Var2.b();
                in0 in0Var = (in0) this.e;
                ArrayList arrayList4 = in0Var.e;
                if (b17 >= in0Var.v && c1Var2.b() < in0Var.f25100w) {
                    int b18 = c1Var.b();
                    int b19 = c1Var2.b();
                    int i19 = in0Var.v;
                    int i20 = b18 - i19;
                    int i21 = b19 - i19;
                    arrayList4.indexOf(Integer.valueOf(i20));
                    arrayList4.get(b18 - in0Var.v);
                    MessageObject messageObject3 = (MessageObject) arrayList4.get(i20);
                    MessageObject messageObject4 = (MessageObject) arrayList4.get(i21);
                    arrayList4.set(i20, messageObject4);
                    arrayList4.set(i21, messageObject3);
                    DownloadController.getInstance(in0Var.d).swapLoadingPriority(messageObject3, messageObject4);
                    in0Var.f25095c.p(b18, b19);
                    return false;
                }
                return false;
            case 4:
                r61 r61Var = (r61) this.e;
                j61 j61Var = r61Var.Y2;
                if (j61Var.H(c1Var.b()) >= 0 && j61Var.H(c1Var.b()) == j61Var.H(c1Var2.b())) {
                    int b20 = c1Var.b();
                    int b21 = c1Var2.b();
                    ArrayList arrayList5 = j61Var.f25268x;
                    if (j61Var.L != null) {
                        int H = j61Var.H(b20);
                        int H2 = j61Var.H(b21);
                        if (H >= 0 && H == H2) {
                            boolean J = j61Var.J(b20);
                            boolean J2 = j61Var.J(b21);
                            arrayList5.add(b21, (v51) arrayList5.remove(b20));
                            j61Var.p(b20, b21);
                            if (j61Var.J(b21) != J) {
                                j61Var.n(b21, 3);
                            }
                            if (j61Var.J(b20) != J2) {
                                j61Var.n(b20, 3);
                            }
                            if (j61Var.K && (i11 = j61Var.J) != H) {
                                j61Var.F(i11);
                            }
                            j61Var.K = true;
                            j61Var.J = H;
                        }
                    }
                    r61Var.H1();
                    return true;
                }
                return false;
            case 5:
                int b22 = c1Var.b();
                int b23 = c1Var2.b();
                v81 v81Var = (v81) this.e;
                ArrayList arrayList6 = v81Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((l.d) v81Var.f29100y).G(b22) && ((l.d) v81Var.f29100y).G(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    v81Var.f29099x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((s81) obj).f28196a));
                    }
                    n81 n81Var = ((w81) ((l.d) v81Var.f29100y).f13909a).L;
                    z11 = true;
                    z11 = true;
                    if (n81Var != null) {
                        n81Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (c1Var.f42949f == c1Var2.f42949f && r(c1Var.b()) && r(c1Var2.b())) {
                    pv0 pv0Var = ((rv0) this.e).f37483b;
                    int b24 = c1Var.b();
                    int b25 = c1Var2.b();
                    rv0 rv0Var = pv0Var.d;
                    int i23 = rv0Var.f37498n0;
                    int i24 = b24 - i23;
                    int i25 = b25 - i23;
                    if (i24 >= 0 && i25 >= 0 && i24 < (i12 = rv0Var.f37513y) && i25 < i12) {
                        CharSequence[] charSequenceArr2 = rv0Var.v;
                        CharSequence charSequence2 = charSequenceArr2[i24];
                        charSequenceArr2[i24] = charSequenceArr2[i25];
                        charSequenceArr2[i25] = charSequence2;
                        int[] iArr = rv0Var.f37502r;
                        if (iArr != null) {
                            int i26 = iArr[i24];
                            iArr[i24] = iArr[i25];
                            iArr[i25] = i26;
                        }
                        boolean[] zArr2 = rv0Var.f37509w;
                        boolean z12 = zArr2[i24];
                        zArr2[i24] = zArr2[i25];
                        zArr2[i25] = z12;
                        pv0Var.p(b24, b25);
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
                u uVar = (u) this.e;
                j jVar = uVar.f3586f;
                if (c1Var != null) {
                    jVar.d1(false);
                }
                if (i10 == 0) {
                    m mVar = uVar.v;
                    ArrayList arrayList2 = mVar.f3579n;
                    d9 d9Var = mVar.e;
                    if (d9Var != null && mVar.f3580r) {
                        if (d9Var instanceof u8) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < mVar.e.f725i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((MessageObject) mVar.e.f725i.get(i11)).getId()));
                            }
                        } else {
                            arrayList = d9Var.f724g;
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
                            mVar.e.C(arrayList, true);
                        }
                        mVar.f3580r = false;
                    }
                    jVar.setItemAnimator(null);
                    return;
                }
                jVar.I0(false);
                if (c1Var != null) {
                    c1Var.f42946a.setPressed(true);
                    return;
                }
                return;
            case 1:
                ep epVar = (ep) this.e;
                fp fpVar = epVar.f33440a3;
                if (i10 == 0) {
                    fpVar.L = false;
                    if (epVar.Y2) {
                        TLRPC.Chat chat = fpVar.X;
                        ArrayList arrayList3 = fpVar.N;
                        ArrayList arrayList4 = fpVar.M;
                        if (chat != null) {
                            epVar.Y2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = fpVar.X;
                            tL_inputChannel.channel_id = chat2.f18321id;
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
                            fpVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new u7(10));
                            fpVar.X.usernames.clear();
                            fpVar.X.usernames.addAll(arrayList4);
                            fpVar.X.usernames.addAll(arrayList3);
                            fpVar.getMessagesController().putChat(fpVar.X, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                fpVar.L = true;
                epVar.I0(false);
                c1Var.f42946a.setPressed(true);
                return;
            case 2:
                vn vnVar = (vn) this.e;
                wb1 wb1Var = vnVar.f29205s;
                if (i10 != 0) {
                    wb1Var.setItemAnimator(vnVar.v);
                    wb1Var.I0(false);
                    c1Var.f42946a.setPressed(true);
                    c1Var.f42946a.setBackgroundColor(h6.v0(h6.f19115h5, vnVar.f27082a));
                    return;
                }
                return;
            case 3:
                if (i10 != 0) {
                    ((in0) this.e).f25094b.I0(false);
                    c1Var.f42946a.setPressed(true);
                    return;
                }
                return;
            case 4:
                r61 r61Var = (r61) this.e;
                if (c1Var != null) {
                    r61Var.d1(false);
                }
                if (i10 == 0) {
                    j61 j61Var = r61Var.Y2;
                    if (j61Var.K) {
                        j61Var.F(j61Var.J);
                    }
                    if (r61Var.f27879d3 != null) {
                        r61Var.D1();
                        r61Var.f27879d3 = null;
                        return;
                    }
                    return;
                }
                r61Var.I0(false);
                if (c1Var != null) {
                    View view = c1Var.f42946a;
                    view.setPressed(true);
                    if (view.getBackground() instanceof b2) {
                        b2 b2Var = (b2) view.getBackground();
                        if (!b2Var.f11240c) {
                            b2Var.f11240c = true;
                            b2Var.invalidateSelf();
                        }
                    }
                    if (i10 == 2) {
                        r61Var.f27879d3 = c1Var;
                        r61Var.G1(c1Var);
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
                    ((rv0) this.e).f37485c.I0(false);
                    c1Var.f42946a.setPressed(true);
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
        rv0 rv0Var = (rv0) this.e;
        if (!rv0Var.I || i10 - rv0Var.f37498n0 >= rv0Var.f37511x) {
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
