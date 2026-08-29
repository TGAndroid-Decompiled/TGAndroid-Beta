package mh;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.b0;
import f2.n1;
import java.util.ArrayList;
import lh.c6;
import lh.k6;
import lh.o5;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mn;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.y71;
import org.telegram.ui.Components.z71;
import org.telegram.ui.ia;
import org.telegram.ui.tu0;
import org.telegram.ui.vu0;
import org.telegram.ui.wa1;
import org.telegram.ui.wo;
import org.telegram.ui.xo;
import org.telegram.ui.yo;
import th.u1;
public final class f extends b0 {
    public final int d;
    public final Object f17025e;

    public f(Object obj, int i10) {
        this.d = i10;
        this.f17025e = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, n1 n1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, n1Var);
                n1Var.f6432a.setPressed(false);
                return;
            case 1:
                super.a(recyclerView, n1Var);
                n1Var.f6432a.setPressed(false);
                return;
            case 2:
                super.a(recyclerView, n1Var);
                View view = n1Var.f6432a;
                view.setPressed(false);
                view.setBackground(null);
                return;
            case 3:
                super.a(recyclerView, n1Var);
                n1Var.f6432a.setPressed(false);
                return;
            case 4:
                u51 u51Var = (u51) this.f17025e;
                super.a(recyclerView, n1Var);
                View view2 = n1Var.f6432a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof u1) {
                    u1 u1Var = (u1) view2.getBackground();
                    if (u1Var.f48794c) {
                        u1Var.f48794c = false;
                        u1Var.invalidateSelf();
                    }
                }
                if (u51Var.A1()) {
                    u51Var.F1(n1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(jr.h).start();
                    return;
                }
                return;
            case 5:
            default:
                super.a(recyclerView, n1Var);
                return;
            case 6:
                super.a(recyclerView, n1Var);
                n1Var.f6432a.setPressed(false);
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, n1 n1Var) {
        switch (this.d) {
            case 0:
                r rVar = (r) this.f17025e;
                if (rVar.S.C.f32111y1 && rVar.v.L(n1Var.b())) {
                    rVar.f17045f.setItemAnimator(rVar.f17046n);
                    return b0.l(15, 0);
                }
                return b0.l(0, 0);
            case 1:
                if (n1Var.f6436f == 1 && ((ia) n1Var.f6432a).C) {
                    return b0.l(3, 0);
                }
                return b0.l(0, 0);
            case 2:
                if (n1Var.f6436f != 5) {
                    return b0.l(0, 0);
                }
                return b0.l(3, 0);
            case 3:
                int b10 = n1Var.b();
                tm0 tm0Var = (tm0) this.f17025e;
                if (b10 >= tm0Var.v && n1Var.b() < tm0Var.f32985w) {
                    return b0.l(3, 0);
                }
                return b0.l(0, 0);
            case 4:
                u51 u51Var = (u51) this.f17025e;
                if (u51Var.Y2 && u51Var.U2.H(n1Var.b()) >= 0) {
                    int i10 = 15;
                    if (u51Var.T2.f6362o == 0) {
                        if (!u51Var.X2) {
                            i10 = 12;
                        }
                    } else if (!u51Var.X2) {
                        i10 = 3;
                    }
                    return b0.l(i10, 0);
                }
                return b0.l(0, 0);
            case 5:
                if (((org.telegram.ui.Components.n) ((y71) this.f17025e).f34963y).f(n1Var.b())) {
                    return b0.l(12, 0);
                }
                return b0.l(0, 0);
            default:
                if (n1Var.f6436f == 5 && r(n1Var.b())) {
                    return b0.l(3, 0);
                }
                return b0.l(0, 0);
        }
    }

    @Override
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((r) this.f17025e).S.C.f32111y1;
            case 1:
            case 2:
            case 5:
            default:
                return super.k();
            case 3:
                return ((tm0) this.f17025e).E.f();
            case 4:
                u51 u51Var = (u51) this.f17025e;
                if (u51Var.Y2 && u51Var.f33144a3) {
                    return true;
                }
                return false;
            case 6:
                return true;
        }
    }

    @Override
    public void m(Canvas canvas, RecyclerView recyclerView, n1 n1Var, float f9, float f10, int i10, boolean z10) {
        switch (this.d) {
            case 4:
                u51 u51Var = (u51) this.f17025e;
                if (i10 != 2 || z10 || !u51Var.A1()) {
                    super.m(canvas, recyclerView, n1Var, f9, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        u51Var.E1(n1Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                super.m(canvas, recyclerView, n1Var, f9, f10, i10, z10);
                ((y71) this.f17025e).invalidate();
                return;
            default:
                super.m(canvas, recyclerView, n1Var, f9, f10, i10, z10);
                return;
        }
    }

    @Override
    public final boolean n(RecyclerView recyclerView, n1 n1Var, n1 n1Var2) {
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        switch (this.d) {
            case 0:
                l lVar = ((r) this.f17025e).v;
                if (!lVar.L(n1Var.b()) || !lVar.L(n1Var2.b())) {
                    return false;
                }
                int b10 = n1Var.b();
                int b11 = n1Var2.b();
                ArrayList arrayList2 = lVar.f17038n;
                k6 k6Var = lVar.f17036e;
                if (k6Var != null && b10 >= 0 && b10 < k6Var.f15838i.size() && b11 >= 0 && b11 < lVar.f17036e.f15838i.size()) {
                    if (lVar.f17036e instanceof c6) {
                        arrayList = new ArrayList();
                        for (int i13 = 0; i13 < lVar.f17036e.f15838i.size(); i13++) {
                            arrayList.add(Integer.valueOf(((MessageObject) lVar.f17036e.f15838i.get(i13)).getId()));
                        }
                    } else {
                        arrayList = new ArrayList(lVar.f17036e.f15837g);
                    }
                    if (!lVar.f17039r) {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        lVar.f17039r = true;
                    }
                    MessageObject messageObject = (MessageObject) lVar.f17036e.f15838i.get(b10);
                    MessageObject messageObject2 = (MessageObject) lVar.f17036e.f15838i.get(b11);
                    arrayList.remove(Integer.valueOf(messageObject.getId()));
                    arrayList.add(Utilities.clamp(b11, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
                    lVar.f17036e.C(arrayList, false);
                    lVar.p(b10, b11);
                }
                return true;
            case 1:
                if (n1Var.f6436f == n1Var2.f6436f) {
                    View view = n1Var2.f6432a;
                    if (!(view instanceof ia) || ((ia) view).C) {
                        wo woVar = ((xo) this.f17025e).T2;
                        int b12 = n1Var.b();
                        int b13 = n1Var2.b();
                        int i14 = b12 - 1;
                        int i15 = b13 - 1;
                        xo xoVar = woVar.f44340c;
                        yo yoVar = xoVar.W2;
                        ArrayList arrayList3 = yoVar.J;
                        if (i14 >= yoVar.J.size() || i15 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            xoVar.U2 = true;
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
                if (n1Var.f6436f != n1Var2.f6436f) {
                    return false;
                }
                mn mnVar = ((on) this.f17025e).f31425r;
                int b14 = n1Var.b();
                int b15 = n1Var2.b();
                on onVar = mnVar.d;
                int i16 = onVar.f31423p0;
                bh.i iVar = onVar.f31415h1;
                int i17 = b14 - i16;
                int i18 = b15 - i16;
                if (i17 >= 0 && i18 >= 0 && i17 < (i10 = onVar.I) && i18 < i10) {
                    bh.h b16 = iVar.b(i17);
                    SparseArray sparseArray = iVar.f2669a;
                    sparseArray.put(i17, iVar.b(i18));
                    sparseArray.put(i18, b16);
                    CharSequence[] charSequenceArr = onVar.G;
                    CharSequence charSequence = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequenceArr[i18];
                    charSequenceArr[i18] = charSequence;
                    boolean[] zArr = onVar.H;
                    boolean z10 = zArr[i17];
                    zArr[i17] = zArr[i18];
                    zArr[i18] = z10;
                    mnVar.p(b14, b15);
                }
                return true;
            case 3:
                int b17 = n1Var2.b();
                tm0 tm0Var = (tm0) this.f17025e;
                ArrayList arrayList4 = tm0Var.f32980e;
                if (b17 >= tm0Var.v && n1Var2.b() < tm0Var.f32985w) {
                    int b18 = n1Var.b();
                    int b19 = n1Var2.b();
                    int i19 = tm0Var.v;
                    int i20 = b18 - i19;
                    int i21 = b19 - i19;
                    arrayList4.indexOf(Integer.valueOf(i20));
                    arrayList4.get(b18 - tm0Var.v);
                    MessageObject messageObject3 = (MessageObject) arrayList4.get(i20);
                    MessageObject messageObject4 = (MessageObject) arrayList4.get(i21);
                    arrayList4.set(i20, messageObject4);
                    arrayList4.set(i21, messageObject3);
                    DownloadController.getInstance(tm0Var.d).swapLoadingPriority(messageObject3, messageObject4);
                    tm0Var.f32979c.p(b18, b19);
                    return false;
                }
                return false;
            case 4:
                u51 u51Var = (u51) this.f17025e;
                k51 k51Var = u51Var.U2;
                if (k51Var.H(n1Var.b()) >= 0 && k51Var.H(n1Var.b()) == k51Var.H(n1Var2.b())) {
                    int b20 = n1Var.b();
                    int b21 = n1Var2.b();
                    ArrayList arrayList5 = k51Var.f29942x;
                    if (k51Var.H != null) {
                        int H = k51Var.H(b20);
                        int H2 = k51Var.H(b21);
                        if (H >= 0 && H == H2) {
                            boolean J = k51Var.J(b20);
                            boolean J2 = k51Var.J(b21);
                            arrayList5.add(b21, (w41) arrayList5.remove(b20));
                            k51Var.p(b20, b21);
                            if (k51Var.J(b21) != J) {
                                k51Var.n(b21, 3);
                            }
                            if (k51Var.J(b20) != J2) {
                                k51Var.n(b20, 3);
                            }
                            if (k51Var.G && (i11 = k51Var.F) != H) {
                                k51Var.F(i11);
                            }
                            k51Var.G = true;
                            k51Var.F = H;
                        }
                    }
                    u51Var.H1();
                    return true;
                }
                return false;
            case 5:
                int b22 = n1Var.b();
                int b23 = n1Var2.b();
                y71 y71Var = (y71) this.f17025e;
                ArrayList arrayList6 = y71Var.h;
                boolean z11 = false;
                int i22 = 0;
                z11 = false;
                if (((org.telegram.ui.Components.n) y71Var.f34963y).f(b22) && ((org.telegram.ui.Components.n) y71Var.f34963y).f(b23)) {
                    Utilities.swapItems(arrayList6, b22, b23);
                    y71Var.f34962x.p(b22, b23);
                    ArrayList arrayList7 = new ArrayList();
                    int size2 = arrayList6.size();
                    while (i22 < size2) {
                        Object obj = arrayList6.get(i22);
                        i22++;
                        arrayList7.add(Integer.valueOf(((v71) obj).f33488a));
                    }
                    q71 q71Var = ((z71) ((org.telegram.ui.Components.n) y71Var.f34963y).f30787b).H;
                    z11 = true;
                    z11 = true;
                    if (q71Var != null) {
                        q71Var.a(arrayList7);
                    }
                }
                return z11;
            default:
                if (n1Var.f6436f == n1Var2.f6436f && r(n1Var.b()) && r(n1Var2.b())) {
                    tu0 tu0Var = ((vu0) this.f17025e).f43754b;
                    int b24 = n1Var.b();
                    int b25 = n1Var2.b();
                    vu0 vu0Var = tu0Var.d;
                    int i23 = vu0Var.f43766j0;
                    int i24 = b24 - i23;
                    int i25 = b25 - i23;
                    if (i24 >= 0 && i25 >= 0 && i24 < (i12 = vu0Var.f43785y) && i25 < i12) {
                        CharSequence[] charSequenceArr2 = vu0Var.v;
                        CharSequence charSequence2 = charSequenceArr2[i24];
                        charSequenceArr2[i24] = charSequenceArr2[i25];
                        charSequenceArr2[i25] = charSequence2;
                        int[] iArr = vu0Var.f43774r;
                        if (iArr != null) {
                            int i26 = iArr[i24];
                            iArr[i24] = iArr[i25];
                            iArr[i25] = i26;
                        }
                        boolean[] zArr2 = vu0Var.f43781w;
                        boolean z12 = zArr2[i24];
                        zArr2[i24] = zArr2[i25];
                        zArr2[i25] = z12;
                        tu0Var.p(b24, b25);
                    }
                    return true;
                }
                return false;
        }
    }

    @Override
    public void o(RecyclerView recyclerView, n1 n1Var, n1 n1Var2, int i10, int i11, int i12) {
        switch (this.d) {
            case 4:
                return;
            default:
                super.o(recyclerView, n1Var, n1Var2, i10, i11, i12);
                return;
        }
    }

    @Override
    public void p(n1 n1Var, int i10) {
        ArrayList arrayList;
        boolean z10;
        switch (this.d) {
            case 0:
                r rVar = (r) this.f17025e;
                i iVar = rVar.f17045f;
                if (n1Var != null) {
                    iVar.d1(false);
                }
                if (i10 == 0) {
                    l lVar = rVar.v;
                    ArrayList arrayList2 = lVar.f17038n;
                    k6 k6Var = lVar.f17036e;
                    if (k6Var != null && lVar.f17039r) {
                        if (k6Var instanceof c6) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < lVar.f17036e.f15838i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((MessageObject) lVar.f17036e.f15838i.get(i11)).getId()));
                            }
                        } else {
                            arrayList = k6Var.f15837g;
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
                            lVar.f17036e.C(arrayList, true);
                        }
                        lVar.f17039r = false;
                    }
                    iVar.setItemAnimator(null);
                    return;
                }
                iVar.I0(false);
                if (n1Var != null) {
                    n1Var.f6432a.setPressed(true);
                    return;
                }
                return;
            case 1:
                xo xoVar = (xo) this.f17025e;
                yo yoVar = xoVar.W2;
                if (i10 == 0) {
                    yoVar.H = false;
                    if (xoVar.U2) {
                        TLRPC.Chat chat = yoVar.T;
                        ArrayList arrayList3 = yoVar.J;
                        ArrayList arrayList4 = yoVar.I;
                        if (chat != null) {
                            xoVar.U2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = yoVar.T;
                            tL_inputChannel.channel_id = chat2.f22392id;
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
                            yoVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new o5(7));
                            yoVar.T.usernames.clear();
                            yoVar.T.usernames.addAll(arrayList4);
                            yoVar.T.usernames.addAll(arrayList3);
                            yoVar.getMessagesController().putChat(yoVar.T, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                yoVar.H = true;
                xoVar.I0(false);
                n1Var.f6432a.setPressed(true);
                return;
            case 2:
                on onVar = (on) this.f17025e;
                wa1 wa1Var = onVar.f31427s;
                if (i10 != 0) {
                    wa1Var.setItemAnimator(onVar.v);
                    wa1Var.I0(false);
                    n1Var.f6432a.setPressed(true);
                    n1Var.f6432a.setBackgroundColor(g6.v0(g6.f23133h5, onVar.f28402a));
                    return;
                }
                return;
            case 3:
                if (i10 != 0) {
                    ((tm0) this.f17025e).f32978b.I0(false);
                    n1Var.f6432a.setPressed(true);
                    return;
                }
                return;
            case 4:
                u51 u51Var = (u51) this.f17025e;
                if (n1Var != null) {
                    u51Var.d1(false);
                }
                if (i10 == 0) {
                    k51 k51Var = u51Var.U2;
                    if (k51Var.G) {
                        k51Var.F(k51Var.F);
                    }
                    if (u51Var.Z2 != null) {
                        u51Var.D1();
                        u51Var.Z2 = null;
                        return;
                    }
                    return;
                }
                u51Var.I0(false);
                if (n1Var != null) {
                    View view = n1Var.f6432a;
                    view.setPressed(true);
                    if (view.getBackground() instanceof u1) {
                        u1 u1Var = (u1) view.getBackground();
                        if (!u1Var.f48794c) {
                            u1Var.f48794c = true;
                            u1Var.invalidateSelf();
                        }
                    }
                    if (i10 == 2) {
                        u51Var.Z2 = n1Var;
                        u51Var.G1(n1Var);
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
                    ((vu0) this.f17025e).f43756c.I0(false);
                    n1Var.f6432a.setPressed(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(n1 n1Var) {
        int i10 = this.d;
    }

    public boolean r(int i10) {
        vu0 vu0Var = (vu0) this.f17025e;
        if (!vu0Var.E || i10 - vu0Var.f43766j0 >= vu0Var.f43783x) {
            return true;
        }
        return false;
    }

    private final void t(n1 n1Var) {
    }

    private final void u(n1 n1Var) {
    }

    private final void v(n1 n1Var) {
    }

    private final void w(n1 n1Var) {
    }

    private final void x(n1 n1Var) {
    }

    private final void y(n1 n1Var) {
    }

    private final void z(n1 n1Var) {
    }

    private final void s(RecyclerView recyclerView, n1 n1Var, n1 n1Var2, int i10, int i11, int i12) {
    }
}
