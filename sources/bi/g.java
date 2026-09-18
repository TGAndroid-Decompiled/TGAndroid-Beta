package bi;

import ai.d9;
import ai.t7;
import ai.t8;
import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ii.a2;
import java.util.ArrayList;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.aw0;
import org.telegram.ui.cw0;
import org.telegram.ui.fc1;
import org.telegram.ui.ip;
import org.telegram.ui.jp;
import org.telegram.ui.kp;
import org.telegram.ui.pa;
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
                c1Var.f42702a.setPressed(false);
                return;
            case 1:
                super.a(recyclerView, c1Var);
                c1Var.f42702a.setPressed(false);
                return;
            case 2:
                super.a(recyclerView, c1Var);
                View view = c1Var.f42702a;
                view.setPressed(false);
                view.setBackground(null);
                return;
            case 3:
                super.a(recyclerView, c1Var);
                c1Var.f42702a.setPressed(false);
                return;
            case 4:
                f61 f61Var = (f61) this.e;
                super.a(recyclerView, c1Var);
                View view2 = c1Var.f42702a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof a2) {
                    a2 a2Var = (a2) view2.getBackground();
                    if (a2Var.f11232c) {
                        a2Var.f11232c = false;
                        a2Var.invalidateSelf();
                    }
                }
                if (f61Var.B1()) {
                    f61Var.G1(c1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(qr.h).start();
                    return;
                }
                return;
            case 5:
            default:
                super.a(recyclerView, c1Var);
                return;
            case 6:
                super.a(recyclerView, c1Var);
                c1Var.f42702a.setPressed(false);
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, c1 c1Var) {
        switch (this.d) {
            case 0:
                u uVar = (u) this.e;
                if (uVar.W.G.C1 && uVar.v.L(c1Var.b())) {
                    uVar.f3594f.setItemAnimator(uVar.f3595n);
                    return s4.v.l(15, 0);
                }
                return s4.v.l(0, 0);
            case 1:
                if (c1Var.f42705f == 1 && ((pa) c1Var.f42702a).G) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
            case 2:
                if (c1Var.f42705f != 5) {
                    return s4.v.l(0, 0);
                }
                return s4.v.l(3, 0);
            case 3:
                int b10 = c1Var.b();
                wm0 wm0Var = (wm0) this.e;
                if (b10 >= wm0Var.v && c1Var.b() < wm0Var.f29704w) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
            case 4:
                f61 f61Var = (f61) this.e;
                if (f61Var.f23800c3 && f61Var.Y2.H(c1Var.b()) >= 0) {
                    int i10 = 15;
                    if (f61Var.X2.f42690o == 0) {
                        if (!f61Var.f23799b3) {
                            i10 = 12;
                        }
                    } else if (!f61Var.f23799b3) {
                        i10 = 3;
                    }
                    return s4.v.l(i10, 0);
                }
                return s4.v.l(0, 0);
            case 5:
                if (((ka.c) ((i81) this.e).f24899y).d(c1Var.b())) {
                    return s4.v.l(12, 0);
                }
                return s4.v.l(0, 0);
            default:
                if (c1Var.f42705f == 5 && r(c1Var.b())) {
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
                return ((wm0) this.e).I.g();
            case 4:
                f61 f61Var = (f61) this.e;
                if (f61Var.f23800c3 && f61Var.f23802e3) {
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
                f61 f61Var = (f61) this.e;
                if (i10 != 2 || z10 || !f61Var.B1()) {
                    super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        f61Var.F1(c1Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                ((i81) this.e).invalidate();
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
                ArrayList arrayList2 = mVar.f3587n;
                d9 d9Var = mVar.e;
                if (d9Var != null && b10 >= 0 && b10 < d9Var.f721i.size() && b11 >= 0 && b11 < mVar.e.f721i.size()) {
                    if (mVar.e instanceof t8) {
                        arrayList = new ArrayList();
                        for (int i13 = 0; i13 < mVar.e.f721i.size(); i13++) {
                            arrayList.add(Integer.valueOf(((MessageObject) mVar.e.f721i.get(i13)).getId()));
                        }
                    } else {
                        arrayList = new ArrayList(mVar.e.f720g);
                    }
                    if (!mVar.f3588r) {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        mVar.f3588r = true;
                    }
                    MessageObject messageObject = (MessageObject) mVar.e.f721i.get(b10);
                    MessageObject messageObject2 = (MessageObject) mVar.e.f721i.get(b11);
                    arrayList.remove(Integer.valueOf(messageObject.getId()));
                    arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
                    mVar.e.C(arrayList, false);
                    mVar.p(b10, b11);
                }
                return true;
            case 1:
                if (c1Var.f42705f == c1Var2.f42705f) {
                    View view = c1Var2.f42702a;
                    if (!(view instanceof pa) || ((pa) view).G) {
                        ip ipVar = ((jp) this.e).X2;
                        int b12 = c1Var.b();
                        int b13 = c1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        jp jpVar = ipVar.f34645c;
                        kp kpVar = jpVar.f34921a3;
                        ArrayList arrayList3 = kpVar.N;
                        if (i14 >= kpVar.N.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            jpVar.Y2 = true;
                        }
                        arrayList3.set(i14, (TLRPC.TL_username) arrayList3.get(i15));
                        arrayList3.set(i15, (TLRPC.TL_username) arrayList3.get(i14));
                        ipVar.p(b12, b13);
                        int size = arrayList3.size();
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        ipVar.n(b12, 3);
                        ipVar.n(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (c1Var.f42705f != c1Var2.f42705f) {
                    return false;
                }
                sn snVar = ((un) this.e).f28442r;
                int b14 = c1Var.b();
                int b15 = c1Var2.b();
                un unVar = snVar.d;
                int i16 = unVar.f28446t0;
                qh.f fVar = unVar.l1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = unVar.M) && i18 < i10) {
                    qh.e b16 = fVar.b(i17);
                    SparseArray sparseArray = fVar.f41793a;
                    sparseArray.put(i17, fVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = unVar.K;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = unVar.L;
                    boolean z10 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z10;
                    snVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = c1Var2.b();
                wm0 wm0Var = (wm0) this.e;
                ArrayList arrayList4 = wm0Var.e;
                if (b17 >= wm0Var.v && c1Var2.b() < wm0Var.f29704w) {
                    int b18 = c1Var.b();
                    int b19 = c1Var2.b();
                    int i19 = wm0Var.v;
                    int i20 = b18 - i19;
                    int i21 = b19 - i19;
                    arrayList4.indexOf(Integer.valueOf(i20));
                    arrayList4.get(b18 - wm0Var.v);
                    MessageObject messageObject3 = (MessageObject) arrayList4.get(i20);
                    MessageObject messageObject4 = (MessageObject) arrayList4.get(i21);
                    arrayList4.set(i20, messageObject4);
                    arrayList4.set(i21, messageObject3);
                    DownloadController.getInstance(wm0Var.d).swapLoadingPriority(messageObject3, messageObject4);
                    wm0Var.f29699c.p(b18, b19);
                    return false;
                }
                return false;
            case 4:
                f61 f61Var = (f61) this.e;
                x51 x51Var = f61Var.Y2;
                if (x51Var.H(c1Var.b()) >= 0 && x51Var.H(c1Var.b()) == x51Var.H(c1Var2.b())) {
                    int b20 = c1Var.b();
                    int b21 = c1Var2.b();
                    ArrayList arrayList5 = x51Var.f29857x;
                    if (x51Var.L != null) {
                        int H = x51Var.H(b20);
                        int H2 = x51Var.H(b21);
                        if (H >= 0 && H == H2) {
                            boolean J = x51Var.J(b20);
                            boolean J2 = x51Var.J(b21);
                            arrayList5.add(b21, (j51) arrayList5.remove(b20));
                            x51Var.p(b20, b21);
                            if (x51Var.J(b21) != J) {
                                x51Var.n(b21, 3);
                            }
                            if (x51Var.J(b20) != J2) {
                                x51Var.n(b20, 3);
                            }
                            if (x51Var.K && (i11 = x51Var.J) != H) {
                                x51Var.F(i11);
                            }
                            x51Var.K = true;
                            x51Var.J = H;
                        }
                    }
                    f61Var.I1();
                    return true;
                }
                return false;
            case 5:
                int b22 = c1Var.b();
                int b23 = c1Var2.b();
                i81 i81Var = (i81) this.e;
                ArrayList arrayList6 = i81Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((ka.c) i81Var.f24899y).d(b22) && ((ka.c) i81Var.f24899y).d(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    i81Var.f24898x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((f81) obj).f23824a));
                    }
                    b81 b81Var = ((j81) ((ka.c) i81Var.f24899y).f13567b).L;
                    z11 = true;
                    z11 = true;
                    if (b81Var != null) {
                        b81Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (c1Var.f42705f == c1Var2.f42705f && r(c1Var.b()) && r(c1Var2.b())) {
                    aw0 aw0Var = ((cw0) this.e).f32936b;
                    int b24 = c1Var.b();
                    int b25 = c1Var2.b();
                    cw0 cw0Var = aw0Var.d;
                    int i23 = cw0Var.f32951n0;
                    int i24 = b24 - i23;
                    int i25 = b25 - i23;
                    if (i24 >= 0 && i25 >= 0 && i24 < (i12 = cw0Var.f32966y) && i25 < i12) {
                        CharSequence[] charSequenceArr2 = cw0Var.v;
                        CharSequence charSequence2 = charSequenceArr2[i24];
                        charSequenceArr2[i24] = charSequenceArr2[i25];
                        charSequenceArr2[i25] = charSequence2;
                        int[] iArr = cw0Var.f32955r;
                        if (iArr != null) {
                            int i26 = iArr[i24];
                            iArr[i24] = iArr[i25];
                            iArr[i25] = i26;
                        }
                        boolean[] zArr2 = cw0Var.f32962w;
                        boolean z12 = zArr2[i24];
                        zArr2[i24] = zArr2[i25];
                        zArr2[i25] = z12;
                        aw0Var.p(b24, b25);
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
                j jVar = uVar.f3594f;
                if (c1Var != null) {
                    jVar.e1(false);
                }
                if (i10 == 0) {
                    m mVar = uVar.v;
                    ArrayList arrayList2 = mVar.f3587n;
                    d9 d9Var = mVar.e;
                    if (d9Var != null && mVar.f3588r) {
                        if (d9Var instanceof t8) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < mVar.e.f721i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((MessageObject) mVar.e.f721i.get(i11)).getId()));
                            }
                        } else {
                            arrayList = d9Var.f720g;
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
                        mVar.f3588r = false;
                    }
                    jVar.setItemAnimator(null);
                    return;
                }
                jVar.J0(false);
                if (c1Var != null) {
                    c1Var.f42702a.setPressed(true);
                    return;
                }
                return;
            case 1:
                jp jpVar = (jp) this.e;
                kp kpVar = jpVar.f34921a3;
                if (i10 == 0) {
                    kpVar.L = false;
                    if (jpVar.Y2) {
                        TLRPC.Chat chat = kpVar.X;
                        ArrayList arrayList3 = kpVar.N;
                        ArrayList arrayList4 = kpVar.M;
                        if (chat != null) {
                            jpVar.Y2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = kpVar.X;
                            tL_inputChannel.channel_id = chat2.f18121id;
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
                            kpVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new t7(10));
                            kpVar.X.usernames.clear();
                            kpVar.X.usernames.addAll(arrayList4);
                            kpVar.X.usernames.addAll(arrayList3);
                            kpVar.getMessagesController().putChat(kpVar.X, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                kpVar.L = true;
                jpVar.J0(false);
                c1Var.f42702a.setPressed(true);
                return;
            case 2:
                un unVar = (un) this.e;
                fc1 fc1Var = unVar.f28444s;
                if (i10 != 0) {
                    fc1Var.setItemAnimator(unVar.v);
                    fc1Var.J0(false);
                    c1Var.f42702a.setPressed(true);
                    c1Var.f42702a.setBackgroundColor(j6.v0(j6.f18934h5, unVar.f26462a));
                    return;
                }
                return;
            case 3:
                if (i10 != 0) {
                    ((wm0) this.e).f29698b.J0(false);
                    c1Var.f42702a.setPressed(true);
                    return;
                }
                return;
            case 4:
                f61 f61Var = (f61) this.e;
                if (c1Var != null) {
                    f61Var.e1(false);
                }
                if (i10 == 0) {
                    x51 x51Var = f61Var.Y2;
                    if (x51Var.K) {
                        x51Var.F(x51Var.J);
                    }
                    if (f61Var.f23801d3 != null) {
                        f61Var.E1();
                        f61Var.f23801d3 = null;
                        return;
                    }
                    return;
                }
                f61Var.J0(false);
                if (c1Var != null) {
                    View view = c1Var.f42702a;
                    view.setPressed(true);
                    if (view.getBackground() instanceof a2) {
                        a2 a2Var = (a2) view.getBackground();
                        if (!a2Var.f11232c) {
                            a2Var.f11232c = true;
                            a2Var.invalidateSelf();
                        }
                    }
                    if (i10 == 2) {
                        f61Var.f23801d3 = c1Var;
                        f61Var.H1(c1Var);
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
                    ((cw0) this.e).f32938c.J0(false);
                    c1Var.f42702a.setPressed(true);
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
        cw0 cw0Var = (cw0) this.e;
        if (!cw0Var.I || i10 - cw0Var.f32951n0 >= cw0Var.f32964x) {
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
