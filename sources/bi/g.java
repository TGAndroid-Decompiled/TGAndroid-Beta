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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.p81;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.y81;
import org.telegram.ui.ep;
import org.telegram.ui.fp;
import org.telegram.ui.gp;
import org.telegram.ui.qa;
import org.telegram.ui.sv0;
import org.telegram.ui.uv0;
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
                c1Var.f43005a.setPressed(false);
                return;
            case 1:
                super.a(recyclerView, c1Var);
                c1Var.f43005a.setPressed(false);
                return;
            case 2:
                super.a(recyclerView, c1Var);
                View view = c1Var.f43005a;
                view.setPressed(false);
                view.setBackground(null);
                return;
            case 3:
                super.a(recyclerView, c1Var);
                c1Var.f43005a.setPressed(false);
                return;
            case 4:
                t61 t61Var = (t61) this.e;
                super.a(recyclerView, c1Var);
                View view2 = c1Var.f43005a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof b2) {
                    b2 b2Var = (b2) view2.getBackground();
                    if (b2Var.f11243c) {
                        b2Var.f11243c = false;
                        b2Var.invalidateSelf();
                    }
                }
                if (t61Var.B1()) {
                    t61Var.G1(c1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(sr.h).start();
                    return;
                }
                return;
            case 5:
            default:
                super.a(recyclerView, c1Var);
                return;
            case 6:
                super.a(recyclerView, c1Var);
                c1Var.f43005a.setPressed(false);
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, c1 c1Var) {
        switch (this.d) {
            case 0:
                u uVar = (u) this.e;
                if (uVar.W.G.C1 && uVar.v.L(c1Var.b())) {
                    uVar.f3588f.setItemAnimator(uVar.f3589n);
                    return s4.v.l(15, 0);
                }
                return s4.v.l(0, 0);
            case 1:
                if (c1Var.f43008f == 1 && ((qa) c1Var.f43005a).G) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
            case 2:
                if (c1Var.f43008f != 5) {
                    return s4.v.l(0, 0);
                }
                return s4.v.l(3, 0);
            case 3:
                int b10 = c1Var.b();
                kn0 kn0Var = (kn0) this.e;
                if (b10 >= kn0Var.v && c1Var.b() < kn0Var.f25804w) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
            case 4:
                t61 t61Var = (t61) this.e;
                if (t61Var.f28498c3 && t61Var.Y2.H(c1Var.b()) >= 0) {
                    int i10 = 15;
                    if (t61Var.X2.f42993o == 0) {
                        if (!t61Var.f28497b3) {
                            i10 = 12;
                        }
                    } else if (!t61Var.f28497b3) {
                        i10 = 3;
                    }
                    return s4.v.l(i10, 0);
                }
                return s4.v.l(0, 0);
            case 5:
                if (((l.d) ((x81) this.e).f30377y).E(c1Var.b())) {
                    return s4.v.l(12, 0);
                }
                return s4.v.l(0, 0);
            default:
                if (c1Var.f43008f == 5 && r(c1Var.b())) {
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
                return ((kn0) this.e).I.g();
            case 4:
                t61 t61Var = (t61) this.e;
                if (t61Var.f28498c3 && t61Var.f28500e3) {
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
                t61 t61Var = (t61) this.e;
                if (i10 != 2 || z10 || !t61Var.B1()) {
                    super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        t61Var.F1(c1Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                ((x81) this.e).invalidate();
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
                ArrayList arrayList2 = mVar.f3581n;
                d9 d9Var = mVar.e;
                if (d9Var != null && b10 >= 0 && b10 < d9Var.f728i.size() && b11 >= 0 && b11 < mVar.e.f728i.size()) {
                    if (mVar.e instanceof u8) {
                        arrayList = new ArrayList();
                        for (int i13 = 0; i13 < mVar.e.f728i.size(); i13++) {
                            arrayList.add(Integer.valueOf(((MessageObject) mVar.e.f728i.get(i13)).getId()));
                        }
                    } else {
                        arrayList = new ArrayList(mVar.e.f727g);
                    }
                    if (!mVar.f3582r) {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        mVar.f3582r = true;
                    }
                    MessageObject messageObject = (MessageObject) mVar.e.f728i.get(b10);
                    MessageObject messageObject2 = (MessageObject) mVar.e.f728i.get(b11);
                    arrayList.remove(Integer.valueOf(messageObject.getId()));
                    arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
                    mVar.e.C(arrayList, false);
                    mVar.p(b10, b11);
                }
                return true;
            case 1:
                if (c1Var.f43008f == c1Var2.f43008f) {
                    View view = c1Var2.f43005a;
                    if (!(view instanceof qa) || ((qa) view).G) {
                        ep epVar = ((fp) this.e).X2;
                        int b12 = c1Var.b();
                        int b13 = c1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        fp fpVar = epVar.f33298c;
                        gp gpVar = fpVar.f33603a3;
                        ArrayList arrayList3 = gpVar.N;
                        if (i14 >= gpVar.N.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            fpVar.Y2 = true;
                        }
                        arrayList3.set(i14, (TLRPC.TL_username) arrayList3.get(i15));
                        arrayList3.set(i15, (TLRPC.TL_username) arrayList3.get(i14));
                        epVar.p(b12, b13);
                        int size = arrayList3.size();
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        epVar.n(b12, 3);
                        epVar.n(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (c1Var.f43008f != c1Var2.f43008f) {
                    return false;
                }
                un unVar = ((wn) this.e).f30104r;
                int b14 = c1Var.b();
                int b15 = c1Var2.b();
                wn wnVar = unVar.d;
                int i16 = wnVar.f30108t0;
                qh.f fVar = wnVar.l1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = wnVar.M) && i18 < i10) {
                    qh.e b16 = fVar.b(i17);
                    SparseArray sparseArray = fVar.f42081a;
                    sparseArray.put(i17, fVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = wnVar.K;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = wnVar.L;
                    boolean z10 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z10;
                    unVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = c1Var2.b();
                kn0 kn0Var = (kn0) this.e;
                ArrayList arrayList4 = kn0Var.e;
                if (b17 >= kn0Var.v && c1Var2.b() < kn0Var.f25804w) {
                    int b18 = c1Var.b();
                    int b19 = c1Var2.b();
                    int i19 = kn0Var.v;
                    int i20 = b18 - i19;
                    int i21 = b19 - i19;
                    arrayList4.indexOf(Integer.valueOf(i20));
                    arrayList4.get(b18 - kn0Var.v);
                    MessageObject messageObject3 = (MessageObject) arrayList4.get(i20);
                    MessageObject messageObject4 = (MessageObject) arrayList4.get(i21);
                    arrayList4.set(i20, messageObject4);
                    arrayList4.set(i21, messageObject3);
                    DownloadController.getInstance(kn0Var.d).swapLoadingPriority(messageObject3, messageObject4);
                    kn0Var.f25799c.p(b18, b19);
                    return false;
                }
                return false;
            case 4:
                t61 t61Var = (t61) this.e;
                l61 l61Var = t61Var.Y2;
                if (l61Var.H(c1Var.b()) >= 0 && l61Var.H(c1Var.b()) == l61Var.H(c1Var2.b())) {
                    int b20 = c1Var.b();
                    int b21 = c1Var2.b();
                    ArrayList arrayList5 = l61Var.f25962x;
                    if (l61Var.L != null) {
                        int H = l61Var.H(b20);
                        int H2 = l61Var.H(b21);
                        if (H >= 0 && H == H2) {
                            boolean J = l61Var.J(b20);
                            boolean J2 = l61Var.J(b21);
                            arrayList5.add(b21, (x51) arrayList5.remove(b20));
                            l61Var.p(b20, b21);
                            if (l61Var.J(b21) != J) {
                                l61Var.n(b21, 3);
                            }
                            if (l61Var.J(b20) != J2) {
                                l61Var.n(b20, 3);
                            }
                            if (l61Var.K && (i11 = l61Var.J) != H) {
                                l61Var.F(i11);
                            }
                            l61Var.K = true;
                            l61Var.J = H;
                        }
                    }
                    t61Var.I1();
                    return true;
                }
                return false;
            case 5:
                int b22 = c1Var.b();
                int b23 = c1Var2.b();
                x81 x81Var = (x81) this.e;
                ArrayList arrayList6 = x81Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((l.d) x81Var.f30377y).E(b22) && ((l.d) x81Var.f30377y).E(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    x81Var.f30376x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((u81) obj).f28847a));
                    }
                    p81 p81Var = ((y81) ((l.d) x81Var.f30377y).f13926a).L;
                    z11 = true;
                    z11 = true;
                    if (p81Var != null) {
                        p81Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (c1Var.f43008f == c1Var2.f43008f && r(c1Var.b()) && r(c1Var2.b())) {
                    sv0 sv0Var = ((uv0) this.e).f38339b;
                    int b24 = c1Var.b();
                    int b25 = c1Var2.b();
                    uv0 uv0Var = sv0Var.d;
                    int i23 = uv0Var.f38354n0;
                    int i24 = b24 - i23;
                    int i25 = b25 - i23;
                    if (i24 >= 0 && i25 >= 0 && i24 < (i12 = uv0Var.f38369y) && i25 < i12) {
                        CharSequence[] charSequenceArr2 = uv0Var.v;
                        CharSequence charSequence2 = charSequenceArr2[i24];
                        charSequenceArr2[i24] = charSequenceArr2[i25];
                        charSequenceArr2[i25] = charSequence2;
                        int[] iArr = uv0Var.f38358r;
                        if (iArr != null) {
                            int i26 = iArr[i24];
                            iArr[i24] = iArr[i25];
                            iArr[i25] = i26;
                        }
                        boolean[] zArr2 = uv0Var.f38365w;
                        boolean z12 = zArr2[i24];
                        zArr2[i24] = zArr2[i25];
                        zArr2[i25] = z12;
                        sv0Var.p(b24, b25);
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
                j jVar = uVar.f3588f;
                if (c1Var != null) {
                    jVar.e1(false);
                }
                if (i10 == 0) {
                    m mVar = uVar.v;
                    ArrayList arrayList2 = mVar.f3581n;
                    d9 d9Var = mVar.e;
                    if (d9Var != null && mVar.f3582r) {
                        if (d9Var instanceof u8) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < mVar.e.f728i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((MessageObject) mVar.e.f728i.get(i11)).getId()));
                            }
                        } else {
                            arrayList = d9Var.f727g;
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
                        mVar.f3582r = false;
                    }
                    jVar.setItemAnimator(null);
                    return;
                }
                jVar.J0(false);
                if (c1Var != null) {
                    c1Var.f43005a.setPressed(true);
                    return;
                }
                return;
            case 1:
                fp fpVar = (fp) this.e;
                gp gpVar = fpVar.f33603a3;
                if (i10 == 0) {
                    gpVar.L = false;
                    if (fpVar.Y2) {
                        TLRPC.Chat chat = gpVar.X;
                        ArrayList arrayList3 = gpVar.N;
                        ArrayList arrayList4 = gpVar.M;
                        if (chat != null) {
                            fpVar.Y2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = gpVar.X;
                            tL_inputChannel.channel_id = chat2.f18329id;
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
                            gpVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new u7(10));
                            gpVar.X.usernames.clear();
                            gpVar.X.usernames.addAll(arrayList4);
                            gpVar.X.usernames.addAll(arrayList3);
                            gpVar.getMessagesController().putChat(gpVar.X, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                gpVar.L = true;
                fpVar.J0(false);
                c1Var.f43005a.setPressed(true);
                return;
            case 2:
                wn wnVar = (wn) this.e;
                wb1 wb1Var = wnVar.f30106s;
                if (i10 != 0) {
                    wb1Var.setItemAnimator(wnVar.v);
                    wb1Var.J0(false);
                    c1Var.f43005a.setPressed(true);
                    c1Var.f43005a.setBackgroundColor(i6.v0(i6.f19128h5, wnVar.f27103a));
                    return;
                }
                return;
            case 3:
                if (i10 != 0) {
                    ((kn0) this.e).f25798b.J0(false);
                    c1Var.f43005a.setPressed(true);
                    return;
                }
                return;
            case 4:
                t61 t61Var = (t61) this.e;
                if (c1Var != null) {
                    t61Var.e1(false);
                }
                if (i10 == 0) {
                    l61 l61Var = t61Var.Y2;
                    if (l61Var.K) {
                        l61Var.F(l61Var.J);
                    }
                    if (t61Var.f28499d3 != null) {
                        t61Var.E1();
                        t61Var.f28499d3 = null;
                        return;
                    }
                    return;
                }
                t61Var.J0(false);
                if (c1Var != null) {
                    View view = c1Var.f43005a;
                    view.setPressed(true);
                    if (view.getBackground() instanceof b2) {
                        b2 b2Var = (b2) view.getBackground();
                        if (!b2Var.f11243c) {
                            b2Var.f11243c = true;
                            b2Var.invalidateSelf();
                        }
                    }
                    if (i10 == 2) {
                        t61Var.f28499d3 = c1Var;
                        t61Var.H1(c1Var);
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
                    ((uv0) this.e).f38341c.J0(false);
                    c1Var.f43005a.setPressed(true);
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
        uv0 uv0Var = (uv0) this.e;
        if (!uv0Var.I || i10 - uv0Var.f38354n0 >= uv0Var.f38367x) {
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
