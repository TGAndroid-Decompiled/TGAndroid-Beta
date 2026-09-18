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
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.o81;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.x81;
import org.telegram.ui.aw0;
import org.telegram.ui.dc1;
import org.telegram.ui.gp;
import org.telegram.ui.hp;
import org.telegram.ui.ip;
import org.telegram.ui.oa;
import org.telegram.ui.yv0;
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
                c1Var.f42929a.setPressed(false);
                return;
            case 1:
                super.a(recyclerView, c1Var);
                c1Var.f42929a.setPressed(false);
                return;
            case 2:
                super.a(recyclerView, c1Var);
                View view = c1Var.f42929a;
                view.setPressed(false);
                view.setBackground(null);
                return;
            case 3:
                super.a(recyclerView, c1Var);
                c1Var.f42929a.setPressed(false);
                return;
            case 4:
                t61 t61Var = (t61) this.e;
                super.a(recyclerView, c1Var);
                View view2 = c1Var.f42929a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof a2) {
                    a2 a2Var = (a2) view2.getBackground();
                    if (a2Var.f11232c) {
                        a2Var.f11232c = false;
                        a2Var.invalidateSelf();
                    }
                }
                if (t61Var.B1()) {
                    t61Var.G1(c1Var);
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
                c1Var.f42929a.setPressed(false);
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
                if (c1Var.f42932f == 1 && ((oa) c1Var.f42929a).G) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
            case 2:
                if (c1Var.f42932f != 5) {
                    return s4.v.l(0, 0);
                }
                return s4.v.l(3, 0);
            case 3:
                int b10 = c1Var.b();
                jn0 jn0Var = (jn0) this.e;
                if (b10 >= jn0Var.v && c1Var.b() < jn0Var.f25386w) {
                    return s4.v.l(3, 0);
                }
                return s4.v.l(0, 0);
            case 4:
                t61 t61Var = (t61) this.e;
                if (t61Var.f28336c3 && t61Var.Y2.H(c1Var.b()) >= 0) {
                    int i10 = 15;
                    if (t61Var.X2.f42917o == 0) {
                        if (!t61Var.f28335b3) {
                            i10 = 12;
                        }
                    } else if (!t61Var.f28335b3) {
                        i10 = 3;
                    }
                    return s4.v.l(i10, 0);
                }
                return s4.v.l(0, 0);
            case 5:
                if (((l.d) ((w81) this.e).f29986y).G(c1Var.b())) {
                    return s4.v.l(12, 0);
                }
                return s4.v.l(0, 0);
            default:
                if (c1Var.f42932f == 5 && r(c1Var.b())) {
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
                return ((jn0) this.e).I.g();
            case 4:
                t61 t61Var = (t61) this.e;
                if (t61Var.f28336c3 && t61Var.f28338e3) {
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
                ((w81) this.e).invalidate();
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
                if (c1Var.f42932f == c1Var2.f42932f) {
                    View view = c1Var2.f42929a;
                    if (!(view instanceof oa) || ((oa) view).G) {
                        gp gpVar = ((hp) this.e).X2;
                        int b12 = c1Var.b();
                        int b13 = c1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        hp hpVar = gpVar.f33910c;
                        ip ipVar = hpVar.f34202a3;
                        ArrayList arrayList3 = ipVar.N;
                        if (i14 >= ipVar.N.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            hpVar.Y2 = true;
                        }
                        arrayList3.set(i14, (TLRPC.TL_username) arrayList3.get(i15));
                        arrayList3.set(i15, (TLRPC.TL_username) arrayList3.get(i14));
                        gpVar.p(b12, b13);
                        int size = arrayList3.size();
                        if (b12 != size && b13 != size) {
                            return true;
                        }
                        gpVar.n(b12, 3);
                        gpVar.n(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (c1Var.f42932f != c1Var2.f42932f) {
                    return false;
                }
                sn snVar = ((un) this.e).f28763r;
                int b14 = c1Var.b();
                int b15 = c1Var2.b();
                un unVar = snVar.d;
                int i16 = unVar.f28767t0;
                qh.f fVar = unVar.l1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = unVar.M) && i18 < i10) {
                    qh.e b16 = fVar.b(i17);
                    SparseArray sparseArray = fVar.f42020a;
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
                jn0 jn0Var = (jn0) this.e;
                ArrayList arrayList4 = jn0Var.e;
                if (b17 >= jn0Var.v && c1Var2.b() < jn0Var.f25386w) {
                    int b18 = c1Var.b();
                    int b19 = c1Var2.b();
                    int i19 = jn0Var.v;
                    int i20 = b18 - i19;
                    int i21 = b19 - i19;
                    arrayList4.indexOf(Integer.valueOf(i20));
                    arrayList4.get(b18 - jn0Var.v);
                    MessageObject messageObject3 = (MessageObject) arrayList4.get(i20);
                    MessageObject messageObject4 = (MessageObject) arrayList4.get(i21);
                    arrayList4.set(i20, messageObject4);
                    arrayList4.set(i21, messageObject3);
                    DownloadController.getInstance(jn0Var.d).swapLoadingPriority(messageObject3, messageObject4);
                    jn0Var.f25381c.p(b18, b19);
                    return false;
                }
                return false;
            case 4:
                t61 t61Var = (t61) this.e;
                l61 l61Var = t61Var.Y2;
                if (l61Var.H(c1Var.b()) >= 0 && l61Var.H(c1Var.b()) == l61Var.H(c1Var2.b())) {
                    int b20 = c1Var.b();
                    int b21 = c1Var2.b();
                    ArrayList arrayList5 = l61Var.f26045x;
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
                w81 w81Var = (w81) this.e;
                ArrayList arrayList6 = w81Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((l.d) w81Var.f29986y).G(b22) && ((l.d) w81Var.f29986y).G(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    w81Var.f29985x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((t81) obj).f28354a));
                    }
                    o81 o81Var = ((x81) ((l.d) w81Var.f29986y).f13859a).L;
                    z11 = true;
                    z11 = true;
                    if (o81Var != null) {
                        o81Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (c1Var.f42932f == c1Var2.f42932f && r(c1Var.b()) && r(c1Var2.b())) {
                    yv0 yv0Var = ((aw0) this.e).f32163b;
                    int b24 = c1Var.b();
                    int b25 = c1Var2.b();
                    aw0 aw0Var = yv0Var.d;
                    int i23 = aw0Var.f32178n0;
                    int i24 = b24 - i23;
                    int i25 = b25 - i23;
                    if (i24 >= 0 && i25 >= 0 && i24 < (i12 = aw0Var.f32193y) && i25 < i12) {
                        CharSequence[] charSequenceArr2 = aw0Var.v;
                        CharSequence charSequence2 = charSequenceArr2[i24];
                        charSequenceArr2[i24] = charSequenceArr2[i25];
                        charSequenceArr2[i25] = charSequence2;
                        int[] iArr = aw0Var.f32182r;
                        if (iArr != null) {
                            int i26 = iArr[i24];
                            iArr[i24] = iArr[i25];
                            iArr[i25] = i26;
                        }
                        boolean[] zArr2 = aw0Var.f32189w;
                        boolean z12 = zArr2[i24];
                        zArr2[i24] = zArr2[i25];
                        zArr2[i25] = z12;
                        yv0Var.p(b24, b25);
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
                    c1Var.f42929a.setPressed(true);
                    return;
                }
                return;
            case 1:
                hp hpVar = (hp) this.e;
                ip ipVar = hpVar.f34202a3;
                if (i10 == 0) {
                    ipVar.L = false;
                    if (hpVar.Y2) {
                        TLRPC.Chat chat = ipVar.X;
                        ArrayList arrayList3 = ipVar.N;
                        ArrayList arrayList4 = ipVar.M;
                        if (chat != null) {
                            hpVar.Y2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = ipVar.X;
                            tL_inputChannel.channel_id = chat2.f18296id;
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
                            ipVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new t7(10));
                            ipVar.X.usernames.clear();
                            ipVar.X.usernames.addAll(arrayList4);
                            ipVar.X.usernames.addAll(arrayList3);
                            ipVar.getMessagesController().putChat(ipVar.X, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ipVar.L = true;
                hpVar.J0(false);
                c1Var.f42929a.setPressed(true);
                return;
            case 2:
                un unVar = (un) this.e;
                dc1 dc1Var = unVar.f28765s;
                if (i10 != 0) {
                    dc1Var.setItemAnimator(unVar.v);
                    dc1Var.J0(false);
                    c1Var.f42929a.setPressed(true);
                    c1Var.f42929a.setBackgroundColor(j6.v0(j6.f19133h5, unVar.f26687a));
                    return;
                }
                return;
            case 3:
                if (i10 != 0) {
                    ((jn0) this.e).f25380b.J0(false);
                    c1Var.f42929a.setPressed(true);
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
                    if (t61Var.f28337d3 != null) {
                        t61Var.E1();
                        t61Var.f28337d3 = null;
                        return;
                    }
                    return;
                }
                t61Var.J0(false);
                if (c1Var != null) {
                    View view = c1Var.f42929a;
                    view.setPressed(true);
                    if (view.getBackground() instanceof a2) {
                        a2 a2Var = (a2) view.getBackground();
                        if (!a2Var.f11232c) {
                            a2Var.f11232c = true;
                            a2Var.invalidateSelf();
                        }
                    }
                    if (i10 == 2) {
                        t61Var.f28337d3 = c1Var;
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
                    ((aw0) this.e).f32165c.J0(false);
                    c1Var.f42929a.setPressed(true);
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
        aw0 aw0Var = (aw0) this.e;
        if (!aw0Var.I || i10 - aw0Var.f32178n0 >= aw0Var.f32191x) {
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
