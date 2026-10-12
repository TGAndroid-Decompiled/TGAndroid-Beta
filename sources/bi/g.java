package bi;

import ai.e9;
import ai.v7;
import ai.v8;
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
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.no;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.u91;
import org.telegram.ui.aw0;
import org.telegram.ui.cw0;
import org.telegram.ui.hc1;
import org.telegram.ui.jp;
import org.telegram.ui.kp;
import org.telegram.ui.lp;
import org.telegram.ui.ra;
import s4.d1;
public final class g extends s4.w {
    public final int d;
    public final Object f3901e;

    public g(Object obj, int i10) {
        this.d = i10;
        this.f3901e = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, d1 d1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, d1Var);
                d1Var.f47897a.setPressed(false);
                return;
            case 1:
                super.a(recyclerView, d1Var);
                d1Var.f47897a.setPressed(false);
                return;
            case 2:
                super.a(recyclerView, d1Var);
                View view = d1Var.f47897a;
                view.setPressed(false);
                view.setBackground(null);
                return;
            case 3:
                super.a(recyclerView, d1Var);
                d1Var.f47897a.setPressed(false);
                return;
            case 4:
                p71 p71Var = (p71) this.f3901e;
                super.a(recyclerView, d1Var);
                View view2 = d1Var.f47897a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof b2) {
                    b2 b2Var = (b2) view2.getBackground();
                    if (b2Var.f12284c) {
                        b2Var.f12284c = false;
                        b2Var.invalidateSelf();
                    }
                }
                if (p71Var.B1()) {
                    p71Var.G1(d1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(js.h).start();
                    return;
                }
                return;
            case 5:
            default:
                super.a(recyclerView, d1Var);
                return;
            case 6:
                super.a(recyclerView, d1Var);
                d1Var.f47897a.setPressed(false);
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, d1 d1Var) {
        switch (this.d) {
            case 0:
                u uVar = (u) this.f3901e;
                if (uVar.W.G.C1 && uVar.v.L(d1Var.b())) {
                    uVar.f3926f.setItemAnimator(uVar.f3927n);
                    return s4.w.l(15, 0);
                }
                return s4.w.l(0, 0);
            case 1:
                if (d1Var.f47901f == 1 && ((ra) d1Var.f47897a).G) {
                    return s4.w.l(3, 0);
                }
                return s4.w.l(0, 0);
            case 2:
                if (d1Var.f47901f != 5) {
                    return s4.w.l(0, 0);
                }
                return s4.w.l(3, 0);
            case 3:
                int b10 = d1Var.b();
                ho0 ho0Var = (ho0) this.f3901e;
                if (b10 >= ho0Var.v && d1Var.b() < ho0Var.f26847w) {
                    return s4.w.l(3, 0);
                }
                return s4.w.l(0, 0);
            case 4:
                p71 p71Var = (p71) this.f3901e;
                if (p71Var.f29442a3 && p71Var.W2.H(d1Var.b()) >= 0) {
                    int i10 = 15;
                    if (p71Var.V2.f47885o == 0) {
                        if (!p71Var.Z2) {
                            i10 = 12;
                        }
                    } else if (!p71Var.Z2) {
                        i10 = 3;
                    }
                    return s4.w.l(i10, 0);
                }
                return s4.w.l(0, 0);
            case 5:
                if (((n4.l) ((t91) this.f3901e).f30830y).b(d1Var.b())) {
                    return s4.w.l(12, 0);
                }
                return s4.w.l(0, 0);
            default:
                if (d1Var.f47901f == 5 && r(d1Var.b())) {
                    return s4.w.l(3, 0);
                }
                return s4.w.l(0, 0);
        }
    }

    @Override
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((u) this.f3901e).W.G.C1;
            case 1:
            case 2:
            case 5:
            default:
                return super.k();
            case 3:
                return ((ho0) this.f3901e).I.g();
            case 4:
                p71 p71Var = (p71) this.f3901e;
                if (p71Var.f29442a3 && p71Var.f29444c3) {
                    return true;
                }
                return false;
            case 6:
                return true;
        }
    }

    @Override
    public void m(Canvas canvas, RecyclerView recyclerView, d1 d1Var, float f7, float f10, int i10, boolean z10) {
        switch (this.d) {
            case 4:
                p71 p71Var = (p71) this.f3901e;
                if (i10 != 2 || z10 || !p71Var.B1()) {
                    super.m(canvas, recyclerView, d1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        p71Var.F1(d1Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                super.m(canvas, recyclerView, d1Var, f7, f10, i10, z10);
                ((t91) this.f3901e).invalidate();
                return;
            default:
                super.m(canvas, recyclerView, d1Var, f7, f10, i10, z10);
                return;
        }
    }

    @Override
    public final boolean n(RecyclerView recyclerView, d1 d1Var, d1 d1Var2) {
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        switch (this.d) {
            case 0:
                m mVar = ((u) this.f3901e).v;
                if (!mVar.L(d1Var.b()) || !mVar.L(d1Var2.b())) {
                    return false;
                }
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                ArrayList arrayList2 = mVar.f3918n;
                e9 e9Var = mVar.f3916e;
                if (e9Var != null && b10 >= 0 && b10 < e9Var.f897i.size() && b11 >= 0 && b11 < mVar.f3916e.f897i.size()) {
                    if (mVar.f3916e instanceof v8) {
                        arrayList = new ArrayList();
                        for (int i13 = 0; i13 < mVar.f3916e.f897i.size(); i13++) {
                            arrayList.add(Integer.valueOf(((MessageObject) mVar.f3916e.f897i.get(i13)).getId()));
                        }
                    } else {
                        arrayList = new ArrayList(mVar.f3916e.f896g);
                    }
                    if (!mVar.f3919r) {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        mVar.f3919r = true;
                    }
                    MessageObject messageObject = (MessageObject) mVar.f3916e.f897i.get(b10);
                    MessageObject messageObject2 = (MessageObject) mVar.f3916e.f897i.get(b11);
                    arrayList.remove(Integer.valueOf(messageObject.getId()));
                    arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
                    mVar.f3916e.C(arrayList, false);
                    mVar.p(b10, b11);
                }
                return true;
            case 1:
                if (d1Var.f47901f == d1Var2.f47901f) {
                    View view = d1Var2.f47897a;
                    if (!(view instanceof ra) || ((ra) view).G) {
                        jp jpVar = ((kp) this.f3901e).V2;
                        int b12 = d1Var.b();
                        int b13 = d1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        kp kpVar = jpVar.f39265c;
                        lp lpVar = kpVar.Y2;
                        ArrayList arrayList3 = lpVar.N;
                        if (i14 >= lpVar.N.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            kpVar.W2 = true;
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
                if (d1Var.f47901f != d1Var2.f47901f) {
                    return false;
                }
                lo loVar = ((no) this.f3901e).f28905r;
                int b14 = d1Var.b();
                int b15 = d1Var2.b();
                no noVar = loVar.d;
                int i16 = noVar.f28909t0;
                qh.f fVar = noVar.l1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = noVar.M) && i18 < i10) {
                    qh.e b16 = fVar.b(i17);
                    SparseArray sparseArray = fVar.f46623a;
                    sparseArray.put(i17, fVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = noVar.K;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = noVar.L;
                    boolean z10 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z10;
                    loVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = d1Var2.b();
                ho0 ho0Var = (ho0) this.f3901e;
                ArrayList arrayList4 = ho0Var.f26842e;
                if (b17 >= ho0Var.v && d1Var2.b() < ho0Var.f26847w) {
                    int b18 = d1Var.b();
                    int b19 = d1Var2.b();
                    int i19 = ho0Var.v;
                    int i20 = b18 - i19;
                    int i21 = b19 - i19;
                    arrayList4.indexOf(Integer.valueOf(i20));
                    arrayList4.get(b18 - ho0Var.v);
                    MessageObject messageObject3 = (MessageObject) arrayList4.get(i20);
                    MessageObject messageObject4 = (MessageObject) arrayList4.get(i21);
                    arrayList4.set(i20, messageObject4);
                    arrayList4.set(i21, messageObject3);
                    DownloadController.getInstance(ho0Var.d).swapLoadingPriority(messageObject3, messageObject4);
                    ho0Var.f26841c.p(b18, b19);
                    return false;
                }
                return false;
            case 4:
                p71 p71Var = (p71) this.f3901e;
                h71 h71Var = p71Var.W2;
                if (h71Var.H(d1Var.b()) >= 0 && h71Var.H(d1Var.b()) == h71Var.H(d1Var2.b())) {
                    int b20 = d1Var.b();
                    int b21 = d1Var2.b();
                    ArrayList arrayList5 = h71Var.f26682x;
                    if (h71Var.L != null) {
                        int H = h71Var.H(b20);
                        int H2 = h71Var.H(b21);
                        if (H >= 0 && H == H2) {
                            boolean J = h71Var.J(b20);
                            boolean J2 = h71Var.J(b21);
                            arrayList5.add(b21, (u61) arrayList5.remove(b20));
                            h71Var.p(b20, b21);
                            if (h71Var.J(b21) != J) {
                                h71Var.n(b21, 3);
                            }
                            if (h71Var.J(b20) != J2) {
                                h71Var.n(b20, 3);
                            }
                            if (h71Var.K && (i11 = h71Var.J) != H) {
                                h71Var.F(i11);
                            }
                            h71Var.K = true;
                            h71Var.J = H;
                        }
                    }
                    p71Var.I1();
                    return true;
                }
                return false;
            case 5:
                int b22 = d1Var.b();
                int b23 = d1Var2.b();
                t91 t91Var = (t91) this.f3901e;
                ArrayList arrayList6 = t91Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((n4.l) t91Var.f30830y).b(b22) && ((n4.l) t91Var.f30830y).b(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    t91Var.f30829x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((q91) obj).f29784a));
                    }
                    l91 l91Var = ((u91) ((n4.l) t91Var.f30830y).f16326a).L;
                    z11 = true;
                    z11 = true;
                    if (l91Var != null) {
                        l91Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (d1Var.f47901f == d1Var2.f47901f && r(d1Var.b()) && r(d1Var2.b())) {
                    aw0 aw0Var = ((cw0) this.f3901e).f36542b;
                    int b24 = d1Var.b();
                    int b25 = d1Var2.b();
                    cw0 cw0Var = aw0Var.d;
                    int i23 = cw0Var.f36558n0;
                    int i24 = b24 - i23;
                    int i25 = b25 - i23;
                    if (i24 >= 0 && i25 >= 0 && i24 < (i12 = cw0Var.f36573y) && i25 < i12) {
                        CharSequence[] charSequenceArr2 = cw0Var.v;
                        CharSequence charSequence2 = charSequenceArr2[i24];
                        charSequenceArr2[i24] = charSequenceArr2[i25];
                        charSequenceArr2[i25] = charSequence2;
                        int[] iArr = cw0Var.f36562r;
                        if (iArr != null) {
                            int i26 = iArr[i24];
                            iArr[i24] = iArr[i25];
                            iArr[i25] = i26;
                        }
                        boolean[] zArr2 = cw0Var.f36569w;
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
    public void o(RecyclerView recyclerView, d1 d1Var, d1 d1Var2, int i10, int i11, int i12) {
        switch (this.d) {
            case 4:
                return;
            default:
                super.o(recyclerView, d1Var, d1Var2, i10, i11, i12);
                return;
        }
    }

    @Override
    public void p(d1 d1Var, int i10) {
        ArrayList arrayList;
        boolean z10;
        switch (this.d) {
            case 0:
                u uVar = (u) this.f3901e;
                j jVar = uVar.f3926f;
                if (d1Var != null) {
                    jVar.d1(false);
                }
                if (i10 == 0) {
                    m mVar = uVar.v;
                    ArrayList arrayList2 = mVar.f3918n;
                    e9 e9Var = mVar.f3916e;
                    if (e9Var != null && mVar.f3919r) {
                        if (e9Var instanceof v8) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < mVar.f3916e.f897i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((MessageObject) mVar.f3916e.f897i.get(i11)).getId()));
                            }
                        } else {
                            arrayList = e9Var.f896g;
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
                            mVar.f3916e.C(arrayList, true);
                        }
                        mVar.f3919r = false;
                    }
                    jVar.setItemAnimator(null);
                    return;
                }
                jVar.I0(false);
                if (d1Var != null) {
                    d1Var.f47897a.setPressed(true);
                    return;
                }
                return;
            case 1:
                kp kpVar = (kp) this.f3901e;
                lp lpVar = kpVar.Y2;
                if (i10 == 0) {
                    lpVar.L = false;
                    if (kpVar.W2) {
                        TLRPC.Chat chat = lpVar.X;
                        ArrayList arrayList3 = lpVar.N;
                        ArrayList arrayList4 = lpVar.M;
                        if (chat != null) {
                            kpVar.W2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = lpVar.X;
                            tL_inputChannel.channel_id = chat2.f19803id;
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
                            lpVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new v7(10));
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
                d1Var.f47897a.setPressed(true);
                return;
            case 2:
                no noVar = (no) this.f3901e;
                hc1 hc1Var = noVar.f28907s;
                if (i10 != 0) {
                    hc1Var.setItemAnimator(noVar.v);
                    hc1Var.I0(false);
                    d1Var.f47897a.setPressed(true);
                    d1Var.f47897a.setBackgroundColor(h6.w0(h6.f20631h5, noVar.f30569a));
                    return;
                }
                return;
            case 3:
                if (i10 != 0) {
                    ((ho0) this.f3901e).f26840b.I0(false);
                    d1Var.f47897a.setPressed(true);
                    return;
                }
                return;
            case 4:
                p71 p71Var = (p71) this.f3901e;
                if (d1Var != null) {
                    p71Var.d1(false);
                }
                if (i10 == 0) {
                    h71 h71Var = p71Var.W2;
                    if (h71Var.K) {
                        h71Var.F(h71Var.J);
                    }
                    if (p71Var.f29443b3 != null) {
                        p71Var.E1();
                        p71Var.f29443b3 = null;
                        return;
                    }
                    return;
                }
                p71Var.I0(false);
                if (d1Var != null) {
                    View view = d1Var.f47897a;
                    view.setPressed(true);
                    if (view.getBackground() instanceof b2) {
                        b2 b2Var = (b2) view.getBackground();
                        if (!b2Var.f12284c) {
                            b2Var.f12284c = true;
                            b2Var.invalidateSelf();
                        }
                    }
                    if (i10 == 2) {
                        p71Var.f29443b3 = d1Var;
                        p71Var.H1(d1Var);
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
                    ((cw0) this.f3901e).f36544c.I0(false);
                    d1Var.f47897a.setPressed(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(d1 d1Var) {
        int i10 = this.d;
    }

    public boolean r(int i10) {
        cw0 cw0Var = (cw0) this.f3901e;
        if (!cw0Var.I || i10 - cw0Var.f36558n0 >= cw0Var.f36571x) {
            return true;
        }
        return false;
    }

    private final void t(d1 d1Var) {
    }

    private final void u(d1 d1Var) {
    }

    private final void v(d1 d1Var) {
    }

    private final void w(d1 d1Var) {
    }

    private final void x(d1 d1Var) {
    }

    private final void y(d1 d1Var) {
    }

    private final void z(d1 d1Var) {
    }

    private final void s(RecyclerView recyclerView, d1 d1Var, d1 d1Var2, int i10, int i11, int i12) {
    }
}
