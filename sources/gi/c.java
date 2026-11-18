package gi;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fi.h6;
import fi.k5;
import fi.z5;
import java.util.ArrayList;
import java.util.regex.Pattern;
import oi.w1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a6;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.ov;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.r7;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.ea;
import org.telegram.ui.f61;
import org.telegram.ui.ho;
import org.telegram.ui.ia;
import org.telegram.ui.io;
import org.telegram.ui.jo;
import org.telegram.ui.l4;
import org.telegram.ui.la;
import org.telegram.ui.nr0;
import org.telegram.ui.pr0;
import v4.f1;
import v4.w;
public final class c extends w {
    public final int d;
    public final Object f13632e;

    public c(Object obj, int i7) {
        this.d = i7;
        this.f13632e = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, f1 f1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, f1Var);
                f1Var.f59123a.setPressed(false);
                return;
            case 1:
                super.a(recyclerView, f1Var);
                View view = f1Var.f59123a;
                view.setPressed(false);
                view.setTag(2131296419, null);
                return;
            case 2:
                super.a(recyclerView, f1Var);
                f1Var.f59123a.setPressed(false);
                return;
            case 3:
                super.a(recyclerView, f1Var);
                View view2 = f1Var.f59123a;
                view2.setPressed(false);
                view2.setTag(2131296419, null);
                return;
            case 4:
                super.a(recyclerView, f1Var);
                View view3 = f1Var.f59123a;
                view3.setPressed(false);
                view3.setBackground(null);
                return;
            case 5:
                super.a(recyclerView, f1Var);
                f1Var.f59123a.setPressed(false);
                return;
            case 6:
                super.a(recyclerView, f1Var);
                f1Var.f59123a.setPressed(false);
                return;
            case 7:
                e51 e51Var = (e51) this.f13632e;
                super.a(recyclerView, f1Var);
                View view4 = f1Var.f59123a;
                view4.setPressed(false);
                if (view4.getBackground() instanceof w1) {
                    w1 w1Var = (w1) view4.getBackground();
                    if (w1Var.f22433c) {
                        w1Var.f22433c = false;
                        w1Var.invalidateSelf();
                    }
                }
                if (e51Var.D1()) {
                    e51Var.I1(f1Var);
                    view4.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(lr.h).start();
                    return;
                }
                return;
            case 8:
            default:
                super.a(recyclerView, f1Var);
                return;
            case 9:
                super.a(recyclerView, f1Var);
                f1Var.f59123a.setPressed(false);
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, f1 f1Var) {
        ov s5;
        switch (this.d) {
            case 0:
                m mVar = (m) this.f13632e;
                if (mVar.f13649a0.H.F1 && mVar.f13657w.L(f1Var.b())) {
                    mVar.f13653f.setItemAnimator(mVar.f13654n);
                    return w.l(15, 0);
                }
                return w.l(0, 0);
            case 1:
                if (f1Var.f59127f == 4 && ((ia) f1Var.f59123a).H) {
                    return w.l(3, 0);
                }
                return w.l(0, 0);
            case 2:
                if (f1Var.f59127f == 1 && ((ia) f1Var.f59123a).H) {
                    return w.l(3, 0);
                }
                return w.l(0, 0);
            case 3:
                if (f1Var.f59127f != 0) {
                    return 0;
                }
                return w.l(3, 0);
            case 4:
                if (f1Var.f59127f != 5) {
                    return w.l(0, 0);
                }
                return w.l(3, 0);
            case 5:
                int b10 = f1Var.b();
                ql0 ql0Var = (ql0) this.f13632e;
                if (b10 >= ql0Var.f38835w && f1Var.b() < ql0Var.f38836x) {
                    return w.l(3, 0);
                }
                return w.l(0, 0);
            case 6:
                int l10 = w.l(0, 0);
                gt0 gt0Var = ((rs0) this.f13632e).f39300y;
                if (gt0Var.F1 && recyclerView.getAdapter() != gt0Var.V && (s5 = s(f1Var)) != null && s5.f26105b) {
                    return w.l(3, 0);
                }
                return l10;
            case 7:
                e51 e51Var = (e51) this.f13632e;
                if (e51Var.f34610k3 && e51Var.f34607g3.H(f1Var.b()) >= 0) {
                    int i7 = 15;
                    if (e51Var.f34606f3.f59075o == 0) {
                        if (!e51Var.j3) {
                            i7 = 12;
                        }
                    } else if (!e51Var.j3) {
                        i7 = 3;
                    }
                    return w.l(i7, 0);
                }
                return w.l(0, 0);
            case 8:
                if (((f71) this.f13632e).E.h(f1Var.b())) {
                    return w.l(12, 0);
                }
                return w.l(0, 0);
            default:
                if (f1Var.f59127f == 5 && r(f1Var.b())) {
                    return w.l(3, 0);
                }
                return w.l(0, 0);
        }
    }

    @Override
    public boolean k() {
        switch (this.d) {
            case 0:
                return ((m) this.f13632e).f13649a0.H.F1;
            case 5:
                return ((ql0) this.f13632e).J.V1();
            case 7:
                e51 e51Var = (e51) this.f13632e;
                if (e51Var.f34610k3 && e51Var.f34612m3) {
                    return true;
                }
                return false;
            case 9:
                return true;
            default:
                return super.k();
        }
    }

    @Override
    public void m(Canvas canvas, RecyclerView recyclerView, f1 f1Var, float f10, float f11, int i7, boolean z10) {
        switch (this.d) {
            case 7:
                e51 e51Var = (e51) this.f13632e;
                if (i7 != 2 || z10 || !e51Var.D1()) {
                    super.m(canvas, recyclerView, f1Var, f10, f11, i7, z10);
                    if (i7 == 2 && z10) {
                        e51Var.H1(f1Var);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                super.m(canvas, recyclerView, f1Var, f10, f11, i7, z10);
                ((f71) this.f13632e).invalidate();
                return;
            default:
                super.m(canvas, recyclerView, f1Var, f10, f11, i7, z10);
                return;
        }
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f1 f1Var, f1 f1Var2) {
        ArrayList arrayList;
        int i7;
        int i10;
        int i11;
        int i12 = this.d;
        int i13 = 0;
        Object obj = this.f13632e;
        switch (i12) {
            case 0:
                h hVar = ((m) obj).f13657w;
                if (!hVar.L(f1Var.b()) || !hVar.L(f1Var2.b())) {
                    return false;
                }
                int b10 = f1Var.b();
                int b11 = f1Var2.b();
                ArrayList arrayList2 = hVar.f13644n;
                h6 h6Var = hVar.f13642e;
                if (h6Var == null || b10 < 0 || b10 >= h6Var.f12045i.size() || b11 < 0 || b11 >= hVar.f13642e.f12045i.size()) {
                    return true;
                }
                if (hVar.f13642e instanceof z5) {
                    arrayList = new ArrayList();
                    for (int i14 = 0; i14 < hVar.f13642e.f12045i.size(); i14++) {
                        arrayList.add(Integer.valueOf(((fj) hVar.f13642e.f12045i.get(i14)).e1()));
                    }
                } else {
                    arrayList = new ArrayList(hVar.f13642e.f12044g);
                }
                if (!hVar.f13645r) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    hVar.f13645r = true;
                }
                fj fjVar = (fj) hVar.f13642e.f12045i.get(b10);
                fj fjVar2 = (fj) hVar.f13642e.f12045i.get(b11);
                arrayList.remove(Integer.valueOf(fjVar.e1()));
                arrayList.add(Utilities.j(b11, arrayList.size(), 0), Integer.valueOf(fjVar.e1()));
                hVar.f13642e.C(arrayList, false);
                hVar.j(b10, b11);
                return true;
            case 1:
                if (f1Var.f59127f == f1Var2.f59127f) {
                    View view = f1Var2.f59123a;
                    if (!(view instanceof ia) || ((ia) view).H) {
                        ea eaVar = ((la) obj).f49489c;
                        int b12 = f1Var.b();
                        int b13 = f1Var2.b();
                        int i15 = b12 - 4;
                        int i16 = b13 - 4;
                        la laVar = eaVar.f47141c;
                        ArrayList arrayList3 = laVar.f49495w;
                        if (i15 >= arrayList3.size() || i16 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            laVar.d = true;
                        }
                        arrayList3.add(i16, (TLRPC.TL_username) arrayList3.remove(i15));
                        eaVar.j(b12, b13);
                        int size = arrayList3.size();
                        int i17 = size + 3;
                        if (b12 != i17 && b13 != i17) {
                            return true;
                        }
                        eaVar.h(b13, 3);
                        if (b13 == i17) {
                            i17 = size + 2;
                        }
                        eaVar.h(i17, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                if (f1Var.f59127f == f1Var2.f59127f) {
                    View view2 = f1Var2.f59123a;
                    if (!(view2 instanceof ia) || ((ia) view2).H) {
                        ho hoVar = ((io) obj).f48769f3;
                        int b14 = f1Var.b();
                        int b15 = f1Var2.b();
                        int i18 = b14 - 1;
                        int i19 = b15 - 1;
                        io ioVar = hoVar.f48457c;
                        jo joVar = ioVar.f48772i3;
                        ArrayList arrayList4 = joVar.O;
                        if (i18 >= joVar.O.size() || i19 >= arrayList4.size()) {
                            return true;
                        }
                        if (b14 != b15) {
                            ioVar.f48770g3 = true;
                        }
                        arrayList4.set(i18, (TLRPC.TL_username) arrayList4.get(i19));
                        arrayList4.set(i19, (TLRPC.TL_username) arrayList4.get(i18));
                        hoVar.j(b14, b15);
                        int size2 = arrayList4.size();
                        if (b14 != size2 && b15 != size2) {
                            return true;
                        }
                        hoVar.h(b14, 3);
                        hoVar.h(b15, 3);
                        return true;
                    }
                }
                return false;
            case 3:
                int b16 = f1Var.b();
                int b17 = f1Var2.b();
                g8 g8Var = (g8) obj;
                if (g8Var.f35403p2) {
                    if (b16 <= 0 || b17 <= 0) {
                        return false;
                    }
                    g8Var.f35405q2.c(b16 - 1, b17 - 1);
                } else {
                    g8Var.f35405q2.c(b16, b17);
                }
                g8Var.f35407r2.clear();
                g8Var.f35407r2.addAll(g8Var.f35405q2.f24291c);
                g8Var.f35412u1.j(b16, b17);
                return true;
            case 4:
                if (f1Var.f59127f != f1Var2.f59127f) {
                    return false;
                }
                l4 l4Var = ((rn) obj).f39239r;
                int b18 = f1Var.b();
                int b19 = f1Var2.b();
                rn rnVar = (rn) l4Var.f49432e;
                int i20 = rnVar.f39245u0;
                sh.e eVar = rnVar.n1;
                int i21 = b18 - i20;
                int i22 = b19 - i20;
                if (i21 < 0 || i22 < 0 || i21 >= (i7 = rnVar.N) || i22 >= i7) {
                    return true;
                }
                sh.d b20 = eVar.b(i21);
                SparseArray sparseArray = eVar.f57434a;
                sparseArray.put(i21, eVar.b(i22));
                sparseArray.put(i22, b20);
                CharSequence[] charSequenceArr = rnVar.L;
                CharSequence charSequence = charSequenceArr[i21];
                charSequenceArr[i21] = charSequenceArr[i22];
                charSequenceArr[i22] = charSequence;
                boolean[] zArr = rnVar.M;
                boolean z10 = zArr[i21];
                zArr[i21] = zArr[i22];
                zArr[i22] = z10;
                l4Var.j(b18, b19);
                return true;
            case 5:
                int b21 = f1Var2.b();
                ql0 ql0Var = (ql0) obj;
                ArrayList arrayList5 = ql0Var.f38830e;
                if (b21 >= ql0Var.f38835w && f1Var2.b() < ql0Var.f38836x) {
                    int b22 = f1Var.b();
                    int b23 = f1Var2.b();
                    int i23 = ql0Var.f38835w;
                    int i24 = b22 - i23;
                    int i25 = b23 - i23;
                    arrayList5.indexOf(Integer.valueOf(i24));
                    arrayList5.get(b22 - ql0Var.f38835w);
                    fj fjVar3 = (fj) arrayList5.get(i24);
                    fj fjVar4 = (fj) arrayList5.get(i25);
                    arrayList5.set(i24, fjVar4);
                    arrayList5.set(i25, fjVar3);
                    a6 q10 = a6.q(ql0Var.d);
                    ArrayList arrayList6 = q10.H;
                    int indexOf = arrayList6.indexOf(fjVar3);
                    int indexOf2 = arrayList6.indexOf(fjVar4);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        arrayList6.set(indexOf, fjVar4);
                        arrayList6.set(indexOf2, fjVar3);
                    }
                    q10.y();
                    ql0Var.f38829c.j(b22, b23);
                }
                return false;
            case 6:
                rs0 rs0Var = (rs0) obj;
                ArrayList arrayList7 = rs0Var.f39294f;
                gt0 gt0Var = rs0Var.f39300y;
                if (gt0Var.F1 && recyclerView.getAdapter() != gt0Var.V) {
                    ov s5 = s(f1Var);
                    ov s9 = s(f1Var2);
                    if (s5 != null && s9 != null && s5.f26105b && s9.f26105b) {
                        int b24 = f1Var.b();
                        int b25 = f1Var2.b();
                        arrayList7.remove(b24);
                        arrayList7.add(b25, s5);
                        rs0Var.j(b24, b25);
                        rs0Var.h = true;
                        return true;
                    }
                }
                return false;
            case 7:
                e51 e51Var = (e51) obj;
                z41 z41Var = e51Var.f34607g3;
                if (z41Var.H(f1Var.b()) < 0 || z41Var.H(f1Var.b()) != z41Var.H(f1Var2.b())) {
                    return false;
                }
                int b26 = f1Var.b();
                int b27 = f1Var2.b();
                ArrayList arrayList8 = z41Var.E;
                if (z41Var.N != null) {
                    int H = z41Var.H(b26);
                    int H2 = z41Var.H(b27);
                    if (H >= 0 && H == H2) {
                        boolean J = z41Var.J(b26);
                        boolean J2 = z41Var.J(b27);
                        arrayList8.add(b27, (l41) arrayList8.remove(b26));
                        z41Var.j(b26, b27);
                        if (z41Var.J(b27) != J) {
                            z41Var.h(b27, 3);
                        }
                        if (z41Var.J(b26) != J2) {
                            z41Var.h(b26, 3);
                        }
                        if (z41Var.M && (i10 = z41Var.L) != H) {
                            z41Var.F(i10);
                        }
                        z41Var.M = true;
                        z41Var.L = H;
                    }
                }
                e51Var.K1();
                return true;
            case 8:
                int b28 = f1Var.b();
                int b29 = f1Var2.b();
                f71 f71Var = (f71) obj;
                ArrayList arrayList9 = f71Var.h;
                if (!f71Var.E.h(b28) || !f71Var.E.h(b29)) {
                    return false;
                }
                Pattern pattern = Utilities.f22776a;
                Object obj2 = arrayList9.get(b28);
                arrayList9.set(b28, arrayList9.get(b29));
                arrayList9.set(b29, obj2);
                f71Var.f35018y.j(b28, b29);
                ArrayList arrayList10 = new ArrayList();
                int size3 = arrayList9.size();
                while (i13 < size3) {
                    Object obj3 = arrayList9.get(i13);
                    i13++;
                    arrayList10.add(Integer.valueOf(((c71) obj3).f33908a));
                }
                f71Var.E.k(arrayList10);
                return true;
            default:
                if (f1Var.f59127f != f1Var2.f59127f || !r(f1Var.b()) || !r(f1Var2.b())) {
                    return false;
                }
                nr0 nr0Var = ((pr0) obj).f50886b;
                int b30 = f1Var.b();
                int b31 = f1Var2.b();
                pr0 pr0Var = nr0Var.d;
                int i26 = pr0Var.f50903o0;
                int i27 = b30 - i26;
                int i28 = b31 - i26;
                if (i27 < 0 || i28 < 0 || i27 >= (i11 = pr0Var.E) || i28 >= i11) {
                    return true;
                }
                CharSequence[] charSequenceArr2 = pr0Var.f50913w;
                CharSequence charSequence2 = charSequenceArr2[i27];
                charSequenceArr2[i27] = charSequenceArr2[i28];
                charSequenceArr2[i28] = charSequence2;
                int[] iArr = pr0Var.f50906r;
                if (iArr != null) {
                    int i29 = iArr[i27];
                    iArr[i27] = iArr[i28];
                    iArr[i28] = i29;
                }
                boolean[] zArr2 = pr0Var.f50915x;
                boolean z11 = zArr2[i27];
                zArr2[i27] = zArr2[i28];
                zArr2[i28] = z11;
                nr0Var.j(b30, b31);
                return true;
        }
    }

    @Override
    public void o(RecyclerView recyclerView, f1 f1Var, f1 f1Var2, int i7, int i10, int i11) {
        switch (this.d) {
            case 1:
            case 7:
                return;
            default:
                super.o(recyclerView, f1Var, f1Var2, i7, i10, i11);
                return;
        }
    }

    @Override
    public void p(f1 f1Var, int i7) {
        ArrayList arrayList;
        boolean z10;
        as0 as0Var;
        int i10 = this.d;
        Boolean bool = null;
        Object obj = this.f13632e;
        switch (i10) {
            case 0:
                m mVar = (m) obj;
                e eVar = mVar.f13653f;
                if (f1Var != null) {
                    eVar.d1(false);
                }
                if (i7 == 0) {
                    h hVar = mVar.f13657w;
                    ArrayList arrayList2 = hVar.f13644n;
                    h6 h6Var = hVar.f13642e;
                    if (h6Var != null && hVar.f13645r) {
                        if (h6Var instanceof z5) {
                            arrayList = new ArrayList();
                            for (int i11 = 0; i11 < hVar.f13642e.f12045i.size(); i11++) {
                                arrayList.add(Integer.valueOf(((fj) hVar.f13642e.f12045i.get(i11)).e1()));
                            }
                        } else {
                            arrayList = h6Var.f12044g;
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
                            hVar.f13642e.C(arrayList, true);
                        }
                        hVar.f13645r = false;
                    }
                    eVar.setItemAnimator(null);
                    return;
                }
                eVar.I0(false);
                if (f1Var != null) {
                    f1Var.f59123a.setPressed(true);
                    return;
                }
                return;
            case 1:
                la laVar = (la) obj;
                if (i7 == 0) {
                    la.d0(laVar);
                } else {
                    laVar.f49488b.I0(false);
                    f1Var.f59123a.setPressed(true);
                }
                if (f1Var != null) {
                    View view = f1Var.f59123a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view.setTag(2131296419, bool);
                    return;
                }
                return;
            case 2:
                io ioVar = (io) obj;
                jo joVar = ioVar.f48772i3;
                if (i7 == 0) {
                    joVar.M = false;
                    if (ioVar.f48770g3) {
                        TLRPC.Chat chat = joVar.Y;
                        ArrayList arrayList3 = joVar.O;
                        ArrayList arrayList4 = joVar.N;
                        if (chat != null) {
                            ioVar.f48770g3 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = joVar.Y;
                            tL_inputChannel.channel_id = chat2.f28403id;
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
                            joVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new k5(16));
                            joVar.Y.usernames.clear();
                            joVar.Y.usernames.addAll(arrayList4);
                            joVar.Y.usernames.addAll(arrayList3);
                            joVar.getMessagesController().X3(joVar.Y, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                joVar.M = true;
                ioVar.I0(false);
                f1Var.f59123a.setPressed(true);
                return;
            case 3:
                r7 r7Var = ((g8) obj).f35408s1;
                if (f1Var != null) {
                    r7Var.d1(false);
                }
                if (i7 != 0) {
                    r7Var.I0(false);
                    if (f1Var != null) {
                        f1Var.f59123a.setPressed(true);
                    }
                }
                if (f1Var != null) {
                    View view2 = f1Var.f59123a;
                    if (i7 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view2.setTag(2131296419, bool);
                    return;
                }
                return;
            case 4:
                rn rnVar = (rn) obj;
                f61 f61Var = rnVar.f39242s;
                if (i7 != 0) {
                    f61Var.setItemAnimator(rnVar.f39247w);
                    f61Var.I0(false);
                    f1Var.f59123a.setPressed(true);
                    u6.h(n6.f29467h5, f1Var.f59123a, rnVar.f36765a);
                    return;
                }
                return;
            case 5:
                if (i7 != 0) {
                    ((ql0) obj).f38828b.I0(false);
                    f1Var.f59123a.setPressed(true);
                    return;
                }
                return;
            case 6:
                rs0 rs0Var = (rs0) obj;
                ap0 ap0Var = rs0Var.f39295n;
                if (f1Var != null && (as0Var = rs0Var.f39297s) != null) {
                    as0Var.d1(false);
                }
                if (i7 == 0) {
                    g0.r(ap0Var);
                    g0.h3(ap0Var, 300L);
                    return;
                }
                return;
            case 7:
                e51 e51Var = (e51) obj;
                if (f1Var != null) {
                    e51Var.d1(false);
                }
                if (i7 == 0) {
                    z41 z41Var = e51Var.f34607g3;
                    if (z41Var.M) {
                        z41Var.F(z41Var.L);
                    }
                    if (e51Var.f34611l3 != null) {
                        e51Var.G1();
                        e51Var.f34611l3 = null;
                        return;
                    }
                    return;
                }
                e51Var.I0(false);
                if (f1Var != null) {
                    View view3 = f1Var.f59123a;
                    view3.setPressed(true);
                    if (view3.getBackground() instanceof w1) {
                        w1 w1Var = (w1) view3.getBackground();
                        if (!w1Var.f22433c) {
                            w1Var.f22433c = true;
                            w1Var.invalidateSelf();
                        }
                    }
                    if (i7 == 2) {
                        e51Var.f34611l3 = f1Var;
                        e51Var.J1(f1Var);
                        return;
                    }
                    return;
                }
                return;
            case 8:
            default:
                return;
            case 9:
                if (i7 != 0) {
                    ((pr0) obj).f50888c.I0(false);
                    f1Var.f59123a.setPressed(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(f1 f1Var) {
        int i7 = this.d;
    }

    public boolean r(int i7) {
        pr0 pr0Var = (pr0) this.f13632e;
        if (!pr0Var.J || i7 - pr0Var.f50903o0 >= pr0Var.f50917y) {
            return true;
        }
        return false;
    }

    public ov s(f1 f1Var) {
        int b10;
        rs0 rs0Var = (rs0) this.f13632e;
        if (f1Var == null || (b10 = f1Var.b()) < 0 || b10 >= rs0Var.f39294f.size()) {
            return null;
        }
        return (ov) rs0Var.f39294f.get(b10);
    }

    private final void A(f1 f1Var) {
    }

    private final void B(f1 f1Var) {
    }

    private final void C(f1 f1Var) {
    }

    private final void D(f1 f1Var) {
    }

    private final void E(f1 f1Var) {
    }

    private final void v(f1 f1Var) {
    }

    private final void w(f1 f1Var) {
    }

    private final void x(f1 f1Var) {
    }

    private final void y(f1 f1Var) {
    }

    private final void z(f1 f1Var) {
    }

    private final void t(RecyclerView recyclerView, f1 f1Var, f1 f1Var2, int i7, int i10, int i11) {
    }

    private final void u(RecyclerView recyclerView, f1 f1Var, f1 f1Var2, int i7, int i10, int i11) {
    }
}
