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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.bo0;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.p61;
import org.telegram.ui.aw0;
import org.telegram.ui.fc1;
import org.telegram.ui.gp;
import org.telegram.ui.hp;
import org.telegram.ui.ip;
import org.telegram.ui.oa;
import org.telegram.ui.yv0;
import s4.d1;
public final class g extends s4.w {
    public final int d;
    public final Object f3902e;

    public g(Object obj, int i10) {
        this.d = i10;
        this.f3902e = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, d1 d1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, d1Var);
                d1Var.f47656a.setPressed(false);
                return;
            case 1:
                super.a(recyclerView, d1Var);
                d1Var.f47656a.setPressed(false);
                return;
            case 2:
                super.a(recyclerView, d1Var);
                View view = d1Var.f47656a;
                view.setPressed(false);
                view.setBackground(null);
                return;
            case 3:
                super.a(recyclerView, d1Var);
                d1Var.f47656a.setPressed(false);
                return;
            case 4:
                k71 k71Var = (k71) this.f3902e;
                super.a(recyclerView, d1Var);
                View view2 = d1Var.f47656a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof b2) {
                    b2 b2Var = (b2) view2.getBackground();
                    if (b2Var.f12287c) {
                        b2Var.f12287c = false;
                        b2Var.invalidateSelf();
                    }
                }
                if (k71Var.B1()) {
                    k71Var.G1(d1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(hs.h).start();
                    return;
                }
                return;
            case 5:
            default:
                super.a(recyclerView, d1Var);
                return;
            case 6:
                super.a(recyclerView, d1Var);
                d1Var.f47656a.setPressed(false);
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, d1 d1Var) {
        switch (this.d) {
            case 0:
                u uVar = (u) this.f3902e;
                if (uVar.W.G.C1 && uVar.v.L(d1Var.b())) {
                    uVar.f3927f.setItemAnimator(uVar.f3928n);
                    return s4.w.l(15, 0);
                }
                return s4.w.l(0, 0);
            case 1:
                if (d1Var.f47660f == 1 && ((oa) d1Var.f47656a).G) {
                    return s4.w.l(3, 0);
                }
                return s4.w.l(0, 0);
            case 2:
                if (d1Var.f47660f != 5) {
                    return s4.w.l(0, 0);
                }
                return s4.w.l(3, 0);
            case 3:
                int b10 = d1Var.b();
                bo0 bo0Var = (bo0) this.f3902e;
                if (b10 >= bo0Var.v && d1Var.b() < bo0Var.f25074w) {
                    return s4.w.l(3, 0);
                }
                return s4.w.l(0, 0);
            case 4:
                k71 k71Var = (k71) this.f3902e;
                if (k71Var.f27866a3 && k71Var.W2.H(d1Var.b()) >= 0) {
                    int i10 = 15;
                    if (k71Var.V2.f47644o == 0) {
                        if (!k71Var.Z2) {
                            i10 = 12;
                        }
                    } else if (!k71Var.Z2) {
                        i10 = 3;
                    }
                    return s4.w.l(i10, 0);
                }
                return s4.w.l(0, 0);
            case 5:
                if (((m2.t) ((n91) this.f3902e).f29122y).A(d1Var.b())) {
                    return s4.w.l(12, 0);
                }
                return s4.w.l(0, 0);
            default:
                if (d1Var.f47660f == 5 && r(d1Var.b())) {
                    return s4.w.l(3, 0);
                }
                return s4.w.l(0, 0);
        }
    }

    @Override
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((u) this.f3902e).W.G.C1;
            case 1:
            case 2:
            case 5:
            default:
                return super.k();
            case 3:
                return ((bo0) this.f3902e).I.g();
            case 4:
                k71 k71Var = (k71) this.f3902e;
                if (k71Var.f27866a3 && k71Var.f27868c3) {
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
                k71 k71Var = (k71) this.f3902e;
                if (i10 != 2 || z10 || !k71Var.B1()) {
                    super.m(canvas, recyclerView, d1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        k71Var.F1(d1Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                super.m(canvas, recyclerView, d1Var, f7, f10, i10, z10);
                ((n91) this.f3902e).invalidate();
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
                m mVar = ((u) this.f3902e).v;
                if (!mVar.L(d1Var.b()) || !mVar.L(d1Var2.b())) {
                    return false;
                }
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                ArrayList arrayList2 = mVar.f3919n;
                e9 e9Var = mVar.f3917e;
                if (e9Var != null && b10 >= 0 && b10 < e9Var.f899i.size() && b11 >= 0 && b11 < mVar.f3917e.f899i.size()) {
                    if (mVar.f3917e instanceof v8) {
                        arrayList = new ArrayList();
                        for (int i13 = 0; i13 < mVar.f3917e.f899i.size(); i13++) {
                            arrayList.add(Integer.valueOf(((MessageObject) mVar.f3917e.f899i.get(i13)).getId()));
                        }
                    } else {
                        arrayList = new ArrayList(mVar.f3917e.f898g);
                    }
                    if (!mVar.f3920r) {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        mVar.f3920r = true;
                    }
                    MessageObject messageObject = (MessageObject) mVar.f3917e.f899i.get(b10);
                    MessageObject messageObject2 = (MessageObject) mVar.f3917e.f899i.get(b11);
                    arrayList.remove(Integer.valueOf(messageObject.getId()));
                    arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
                    mVar.f3917e.C(arrayList, false);
                    mVar.p(b10, b11);
                }
                return true;
            case 1:
                if (d1Var.f47660f == d1Var2.f47660f) {
                    View view = d1Var2.f47656a;
                    if (!(view instanceof oa) || ((oa) view).G) {
                        gp gpVar = ((hp) this.f3902e).V2;
                        int b12 = d1Var.b();
                        int b13 = d1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        hp hpVar = gpVar.f38064c;
                        ip ipVar = hpVar.Y2;
                        ArrayList arrayList3 = ipVar.N;
                        if (i14 >= ipVar.N.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            hpVar.W2 = true;
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
                if (d1Var.f47660f != d1Var2.f47660f) {
                    return false;
                }
                jo joVar = ((lo) this.f3902e).f28523r;
                int b14 = d1Var.b();
                int b15 = d1Var2.b();
                lo loVar = joVar.d;
                int i16 = loVar.f28527t0;
                qh.f fVar = loVar.l1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = loVar.M) && i18 < i10) {
                    qh.e b16 = fVar.b(i17);
                    SparseArray sparseArray = fVar.f46676a;
                    sparseArray.put(i17, fVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = loVar.K;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = loVar.L;
                    boolean z10 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z10;
                    joVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = d1Var2.b();
                bo0 bo0Var = (bo0) this.f3902e;
                ArrayList arrayList4 = bo0Var.f25069e;
                if (b17 >= bo0Var.v && d1Var2.b() < bo0Var.f25074w) {
                    int b18 = d1Var.b();
                    int b19 = d1Var2.b();
                    int i19 = bo0Var.v;
                    int i20 = b18 - i19;
                    int i21 = b19 - i19;
                    arrayList4.indexOf(Integer.valueOf(i20));
                    arrayList4.get(b18 - bo0Var.v);
                    MessageObject messageObject3 = (MessageObject) arrayList4.get(i20);
                    MessageObject messageObject4 = (MessageObject) arrayList4.get(i21);
                    arrayList4.set(i20, messageObject4);
                    arrayList4.set(i21, messageObject3);
                    DownloadController.getInstance(bo0Var.d).swapLoadingPriority(messageObject3, messageObject4);
                    bo0Var.f25068c.p(b18, b19);
                    return false;
                }
                return false;
            case 4:
                k71 k71Var = (k71) this.f3902e;
                c71 c71Var = k71Var.W2;
                if (c71Var.H(d1Var.b()) >= 0 && c71Var.H(d1Var.b()) == c71Var.H(d1Var2.b())) {
                    int b20 = d1Var.b();
                    int b21 = d1Var2.b();
                    ArrayList arrayList5 = c71Var.f25283x;
                    if (c71Var.L != null) {
                        int H = c71Var.H(b20);
                        int H2 = c71Var.H(b21);
                        if (H >= 0 && H == H2) {
                            boolean J = c71Var.J(b20);
                            boolean J2 = c71Var.J(b21);
                            arrayList5.add(b21, (p61) arrayList5.remove(b20));
                            c71Var.p(b20, b21);
                            if (c71Var.J(b21) != J) {
                                c71Var.n(b21, 3);
                            }
                            if (c71Var.J(b20) != J2) {
                                c71Var.n(b20, 3);
                            }
                            if (c71Var.K && (i11 = c71Var.J) != H) {
                                c71Var.F(i11);
                            }
                            c71Var.K = true;
                            c71Var.J = H;
                        }
                    }
                    k71Var.I1();
                    return true;
                }
                return false;
            case 5:
                int b22 = d1Var.b();
                int b23 = d1Var2.b();
                n91 n91Var = (n91) this.f3902e;
                ArrayList arrayList6 = n91Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((m2.t) n91Var.f29122y).A(b22) && ((m2.t) n91Var.f29122y).A(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    n91Var.f29121x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((k91) obj).f27909a));
                    }
                    f91 f91Var = ((o91) ((m2.t) n91Var.f29122y).f15972b).L;
                    z11 = true;
                    z11 = true;
                    if (f91Var != null) {
                        f91Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (d1Var.f47660f == d1Var2.f47660f && r(d1Var.b()) && r(d1Var2.b())) {
                    yv0 yv0Var = ((aw0) this.f3902e).f36034b;
                    int b24 = d1Var.b();
                    int b25 = d1Var2.b();
                    aw0 aw0Var = yv0Var.d;
                    int i23 = aw0Var.f36050n0;
                    int i24 = b24 - i23;
                    int i25 = b25 - i23;
                    if (i24 >= 0 && i25 >= 0 && i24 < (i12 = aw0Var.f36065y) && i25 < i12) {
                        CharSequence[] charSequenceArr2 = aw0Var.v;
                        CharSequence charSequence2 = charSequenceArr2[i24];
                        charSequenceArr2[i24] = charSequenceArr2[i25];
                        charSequenceArr2[i25] = charSequence2;
                        int[] iArr = aw0Var.f36054r;
                        if (iArr != null) {
                            int i26 = iArr[i24];
                            iArr[i24] = iArr[i25];
                            iArr[i25] = i26;
                        }
                        boolean[] zArr2 = aw0Var.f36061w;
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
                u uVar = (u) this.f3902e;
                j jVar = uVar.f3927f;
                if (d1Var != null) {
                    jVar.d1(false);
                }
                if (i10 == 0) {
                    m mVar = uVar.v;
                    ArrayList arrayList2 = mVar.f3919n;
                    e9 e9Var = mVar.f3917e;
                    if (e9Var != null && mVar.f3920r) {
                        if (e9Var instanceof v8) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < mVar.f3917e.f899i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((MessageObject) mVar.f3917e.f899i.get(i11)).getId()));
                            }
                        } else {
                            arrayList = e9Var.f898g;
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
                            mVar.f3917e.C(arrayList, true);
                        }
                        mVar.f3920r = false;
                    }
                    jVar.setItemAnimator(null);
                    return;
                }
                jVar.I0(false);
                if (d1Var != null) {
                    d1Var.f47656a.setPressed(true);
                    return;
                }
                return;
            case 1:
                hp hpVar = (hp) this.f3902e;
                ip ipVar = hpVar.Y2;
                if (i10 == 0) {
                    ipVar.L = false;
                    if (hpVar.W2) {
                        TLRPC.Chat chat = ipVar.X;
                        ArrayList arrayList3 = ipVar.N;
                        ArrayList arrayList4 = ipVar.M;
                        if (chat != null) {
                            hpVar.W2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = ipVar.X;
                            tL_inputChannel.channel_id = chat2.f20038id;
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
                            ipVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new v7(10));
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
                hpVar.I0(false);
                d1Var.f47656a.setPressed(true);
                return;
            case 2:
                lo loVar = (lo) this.f3902e;
                fc1 fc1Var = loVar.f28525s;
                if (i10 != 0) {
                    fc1Var.setItemAnimator(loVar.v);
                    fc1Var.I0(false);
                    d1Var.f47656a.setPressed(true);
                    d1Var.f47656a.setBackgroundColor(i6.w0(i6.f20868h5, loVar.f30172a));
                    return;
                }
                return;
            case 3:
                if (i10 != 0) {
                    ((bo0) this.f3902e).f25067b.I0(false);
                    d1Var.f47656a.setPressed(true);
                    return;
                }
                return;
            case 4:
                k71 k71Var = (k71) this.f3902e;
                if (d1Var != null) {
                    k71Var.d1(false);
                }
                if (i10 == 0) {
                    c71 c71Var = k71Var.W2;
                    if (c71Var.K) {
                        c71Var.F(c71Var.J);
                    }
                    if (k71Var.f27867b3 != null) {
                        k71Var.E1();
                        k71Var.f27867b3 = null;
                        return;
                    }
                    return;
                }
                k71Var.I0(false);
                if (d1Var != null) {
                    View view = d1Var.f47656a;
                    view.setPressed(true);
                    if (view.getBackground() instanceof b2) {
                        b2 b2Var = (b2) view.getBackground();
                        if (!b2Var.f12287c) {
                            b2Var.f12287c = true;
                            b2Var.invalidateSelf();
                        }
                    }
                    if (i10 == 2) {
                        k71Var.f27867b3 = d1Var;
                        k71Var.H1(d1Var);
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
                    ((aw0) this.f3902e).f36036c.I0(false);
                    d1Var.f47656a.setPressed(true);
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
        aw0 aw0Var = (aw0) this.f3902e;
        if (!aw0Var.I || i10 - aw0Var.f36050n0 >= aw0Var.f36063x) {
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
