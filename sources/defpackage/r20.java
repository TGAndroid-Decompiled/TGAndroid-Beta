package defpackage;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r20 extends eu5 {
    public final byte e;
    public final Object f;

    public r20(Object obj, byte b) {
        this.e = b;
        this.f = obj;
    }

    @Override
    public final void a(RecyclerView recyclerView, u69 u69Var) {
        switch (this.e) {
            case 0:
                super.a(recyclerView, u69Var);
                View view = u69Var.a;
                view.setPressed(false);
                view.setTag(2131296421, null);
                return;
            case 1:
                super.a(recyclerView, u69Var);
                u69Var.a.setPressed(false);
                return;
            case 2:
                super.a(recyclerView, u69Var);
                View view2 = u69Var.a;
                view2.setPressed(false);
                view2.setTag(2131296421, null);
                return;
            case 3:
                super.a(recyclerView, u69Var);
                View view3 = u69Var.a;
                view3.setPressed(false);
                view3.setBackground(null);
                return;
            case 4:
                super.a(recyclerView, u69Var);
                u69Var.a.setPressed(false);
                return;
            case 5:
                super.a(recyclerView, u69Var);
                u69Var.a.setPressed(false);
                return;
            case 6:
                super.a(recyclerView, u69Var);
                u69Var.a.setPressed(false);
                return;
            case 7:
                super.a(recyclerView, u69Var);
                u69Var.a.setPressed(false);
                return;
            case 8:
                q7c q7cVar = (q7c) this.f;
                super.a(recyclerView, u69Var);
                View view4 = u69Var.a;
                view4.setPressed(false);
                if (view4.getBackground() instanceof gf9) {
                    gf9 gf9Var = (gf9) view4.getBackground();
                    if (gf9Var.c) {
                        gf9Var.c = false;
                        gf9Var.invalidateSelf();
                    }
                }
                if (q7cVar.D1()) {
                    q7cVar.I1(u69Var);
                    view4.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(d53.h).start();
                    return;
                }
                return;
            default:
                super.a(recyclerView, u69Var);
                return;
        }
    }

    @Override
    public final int f(RecyclerView recyclerView, u69 u69Var) {
        vr9 v;
        byte b = this.e;
        int i = 15;
        Object obj = this.f;
        switch (b) {
            case 0:
                if (u69Var.f != 0) {
                    return 0;
                }
                return eu5.m(3, 0);
            case 1:
                gs0 gs0Var = (gs0) obj;
                if (gs0Var.a0.H.F1 && gs0Var.w.L(u69Var.b())) {
                    gs0Var.f.setItemAnimator(gs0Var.n);
                    return eu5.m(15, 0);
                }
                return eu5.m(0, 0);
            case 2:
                if (u69Var.f == 4 && ((qf1) u69Var.a).H) {
                    return eu5.m(3, 0);
                }
                return eu5.m(0, 0);
            case 3:
                if (u69Var.f != 5) {
                    return eu5.m(0, 0);
                }
                return eu5.m(3, 0);
            case 4:
                if (u69Var.f == 1 && ((qf1) u69Var.a).H) {
                    return eu5.m(3, 0);
                }
                return eu5.m(0, 0);
            case 5:
                if (u69Var.f == 5 && u(u69Var.b())) {
                    return eu5.m(3, 0);
                }
                return eu5.m(0, 0);
            case 6:
                ju9 ju9Var = (ju9) obj;
                if (u69Var.b() >= ju9Var.w && u69Var.b() < ju9Var.x) {
                    return eu5.m(3, 0);
                }
                return eu5.m(0, 0);
            case 7:
                int m = eu5.m(0, 0);
                nha nhaVar = ((yga) obj).y;
                if (nhaVar.F1 && recyclerView.getAdapter() != nhaVar.V && (v = v(u69Var)) != null && v.b) {
                    return eu5.m(3, 0);
                }
                return m;
            case 8:
                q7c q7cVar = (q7c) obj;
                if (q7cVar.k3 && q7cVar.g3.H(u69Var.b()) >= 0) {
                    boolean z = q7cVar.f3.o;
                    boolean z2 = q7cVar.j3;
                    if (!z) {
                        if (!z2) {
                            i = 12;
                        }
                    } else if (!z2) {
                        i = 3;
                    }
                    return eu5.m(i, 0);
                }
                return eu5.m(0, 0);
            default:
                if (((vgc) obj).E.D(u69Var.b())) {
                    return eu5.m(12, 0);
                }
                return eu5.m(0, 0);
        }
    }

    @Override
    public final boolean l() {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 1:
                return ((gs0) obj).a0.H.F1;
            case 5:
                return true;
            case 6:
                return ((ju9) obj).J.u();
            case 8:
                q7c q7cVar = (q7c) obj;
                if (q7cVar.k3 && q7cVar.m3) {
                    return true;
                }
                return false;
            default:
                return super.l();
        }
    }

    @Override
    public final void n(Canvas canvas, RecyclerView recyclerView, u69 u69Var, float f, float f2, int i, boolean z) {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 8:
                q7c q7cVar = (q7c) obj;
                if (i != 2 || z || !q7cVar.D1()) {
                    super.n(canvas, recyclerView, u69Var, f, f2, i, z);
                    if (i == 2 && z) {
                        q7cVar.H1(u69Var);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                super.n(canvas, recyclerView, u69Var, f, f2, i, z);
                ((vgc) obj).invalidate();
                return;
            default:
                super.n(canvas, recyclerView, u69Var, f, f2, i, z);
                return;
        }
    }

    @Override
    public final boolean o(RecyclerView recyclerView, u69 u69Var, u69 u69Var2) {
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        byte b = this.e;
        Object obj = this.f;
        int i4 = 0;
        switch (b) {
            case 0:
                int b2 = u69Var.b();
                int b3 = u69Var2.b();
                i30 i30Var = (i30) obj;
                if (i30Var.o2) {
                    if (b2 <= 0 || b3 <= 0) {
                        return false;
                    }
                    i30Var.p2.c(b2 - 1, b3 - 1);
                } else {
                    i30Var.p2.c(b2, b3);
                }
                i30Var.q2.clear();
                i30Var.q2.addAll(i30Var.p2.c);
                i30Var.t1.j(b2, b3);
                return true;
            case 1:
                bs0 bs0Var = ((gs0) obj).w;
                if (!bs0Var.L(u69Var.b()) || !bs0Var.L(u69Var2.b())) {
                    return false;
                }
                int b4 = u69Var.b();
                int b5 = u69Var2.b();
                ArrayList arrayList2 = bs0Var.n;
                t3b t3bVar = bs0Var.e;
                if (t3bVar == null || b4 < 0 || b4 >= t3bVar.i.size() || b5 < 0 || b5 >= bs0Var.e.i.size()) {
                    return true;
                }
                if (wi8.A(bs0Var.e)) {
                    arrayList = new ArrayList();
                    for (int i5 = 0; i5 < bs0Var.e.i.size(); i5++) {
                        arrayList.add(Integer.valueOf(((k47) bs0Var.e.i.get(i5)).e1()));
                    }
                } else {
                    arrayList = new ArrayList(bs0Var.e.g);
                }
                if (!bs0Var.r) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    bs0Var.r = true;
                }
                k47 k47Var = (k47) bs0Var.e.i.get(b4);
                k47 k47Var2 = (k47) bs0Var.e.i.get(b5);
                arrayList.remove(Integer.valueOf(k47Var.e1()));
                arrayList.add(Utilities.j(b5, arrayList.size(), 0), Integer.valueOf(k47Var.e1()));
                bs0Var.e.C(arrayList, false);
                bs0Var.j(b4, b5);
                return true;
            case 2:
                if (u69Var.f == u69Var2.f) {
                    View view = u69Var2.a;
                    if (!(view instanceof qf1) || ((qf1) view).H) {
                        nf1 nf1Var = ((uf1) obj).c;
                        int b6 = u69Var.b();
                        int b7 = u69Var2.b();
                        int i6 = b6 - 4;
                        int i7 = b7 - 4;
                        uf1 uf1Var = nf1Var.c;
                        ArrayList arrayList3 = uf1Var.w;
                        if (i6 >= arrayList3.size() || i7 >= arrayList3.size()) {
                            return true;
                        }
                        if (b6 != b7) {
                            uf1Var.d = true;
                        }
                        arrayList3.add(i7, (TLRPC.TL_username) arrayList3.remove(i6));
                        nf1Var.j(b6, b7);
                        int size = arrayList3.size();
                        int i8 = size + 3;
                        if (b6 != i8 && b7 != i8) {
                            return true;
                        }
                        nf1Var.h(b7, 3);
                        if (b7 == i8) {
                            i8 = size + 2;
                        }
                        nf1Var.h(i8, 3);
                        return true;
                    }
                }
                return false;
            case 3:
                if (u69Var.f != u69Var2.f) {
                    return false;
                }
                s30 s30Var = ((v72) obj).r;
                int b8 = u69Var.b();
                int b9 = u69Var2.b();
                v72 v72Var = (v72) s30Var.e;
                int i9 = v72Var.u0;
                wf8 wf8Var = v72Var.n1;
                int i10 = b8 - i9;
                int i11 = b9 - i9;
                if (i10 < 0 || i11 < 0 || i10 >= (i = v72Var.N) || i11 >= i) {
                    return true;
                }
                nf8 b10 = wf8Var.b(i10);
                SparseArray sparseArray = wf8Var.a;
                sparseArray.put(i10, wf8Var.b(i11));
                sparseArray.put(i11, b10);
                CharSequence[] charSequenceArr = v72Var.L;
                CharSequence charSequence = charSequenceArr[i10];
                charSequenceArr[i10] = charSequenceArr[i11];
                charSequenceArr[i11] = charSequence;
                boolean[] zArr = v72Var.M;
                boolean z = zArr[i10];
                zArr[i10] = zArr[i11];
                zArr[i11] = z;
                s30Var.j(b8, b9);
                return true;
            case 4:
                if (u69Var.f == u69Var2.f) {
                    View view2 = u69Var2.a;
                    if (!(view2 instanceof qf1) || ((qf1) view2).H) {
                        oa2 oa2Var = ((pa2) obj).f3;
                        int b11 = u69Var.b();
                        int b12 = u69Var2.b();
                        int i12 = b11 - 1;
                        int i13 = b12 - 1;
                        pa2 pa2Var = oa2Var.c;
                        qa2 qa2Var = pa2Var.i3;
                        ArrayList arrayList4 = qa2Var.O;
                        if (i12 >= qa2Var.O.size() || i13 >= arrayList4.size()) {
                            return true;
                        }
                        if (b11 != b12) {
                            pa2Var.g3 = true;
                        }
                        arrayList4.set(i12, (TLRPC.TL_username) arrayList4.get(i13));
                        arrayList4.set(i13, (TLRPC.TL_username) arrayList4.get(i12));
                        oa2Var.j(b11, b12);
                        int size2 = arrayList4.size();
                        if (b11 != size2 && b12 != size2) {
                            return true;
                        }
                        oa2Var.h(b11, 3);
                        oa2Var.h(b12, 3);
                        return true;
                    }
                }
                return false;
            case 5:
                if (u69Var.f != u69Var2.f || !u(u69Var.b()) || !u(u69Var2.b())) {
                    return false;
                }
                ig8 ig8Var = ((kg8) obj).b;
                int b13 = u69Var.b();
                int b14 = u69Var2.b();
                kg8 kg8Var = ig8Var.d;
                int i14 = kg8Var.o0;
                int i15 = b13 - i14;
                int i16 = b14 - i14;
                if (i15 < 0 || i16 < 0 || i15 >= (i2 = kg8Var.E) || i16 >= i2) {
                    return true;
                }
                CharSequence[] charSequenceArr2 = kg8Var.w;
                CharSequence charSequence2 = charSequenceArr2[i15];
                charSequenceArr2[i15] = charSequenceArr2[i16];
                charSequenceArr2[i16] = charSequence2;
                int[] iArr = kg8Var.r;
                if (iArr != null) {
                    int i17 = iArr[i15];
                    iArr[i15] = iArr[i16];
                    iArr[i16] = i17;
                }
                boolean[] zArr2 = kg8Var.x;
                boolean z2 = zArr2[i15];
                zArr2[i15] = zArr2[i16];
                zArr2[i16] = z2;
                ig8Var.j(b13, b14);
                return true;
            case 6:
                int b15 = u69Var2.b();
                ju9 ju9Var = (ju9) obj;
                ArrayList arrayList5 = ju9Var.e;
                if (b15 >= ju9Var.w && u69Var2.b() < ju9Var.x) {
                    int b16 = u69Var.b();
                    int b17 = u69Var2.b();
                    int i18 = ju9Var.w;
                    int i19 = b16 - i18;
                    int i20 = b17 - i18;
                    arrayList5.indexOf(Integer.valueOf(i19));
                    arrayList5.get(b16 - ju9Var.w);
                    k47 k47Var3 = (k47) arrayList5.get(i19);
                    k47 k47Var4 = (k47) arrayList5.get(i20);
                    arrayList5.set(i19, k47Var4);
                    arrayList5.set(i20, k47Var3);
                    er3 q = er3.q(ju9Var.d);
                    ArrayList arrayList6 = q.H;
                    int indexOf = arrayList6.indexOf(k47Var3);
                    int indexOf2 = arrayList6.indexOf(k47Var4);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        arrayList6.set(indexOf, k47Var4);
                        arrayList6.set(indexOf2, k47Var3);
                    }
                    q.y();
                    ju9Var.c.j(b16, b17);
                }
                return false;
            case 7:
                yga ygaVar = (yga) obj;
                ArrayList arrayList7 = ygaVar.f;
                nha nhaVar = ygaVar.y;
                if (nhaVar.F1 && recyclerView.getAdapter() != nhaVar.V) {
                    vr9 v = v(u69Var);
                    vr9 v2 = v(u69Var2);
                    if (v != null && v2 != null && v.b && v2.b) {
                        int b18 = u69Var.b();
                        int b19 = u69Var2.b();
                        arrayList7.remove(b18);
                        arrayList7.add(b19, v);
                        ygaVar.j(b18, b19);
                        ygaVar.h = true;
                        return true;
                    }
                }
                return false;
            case 8:
                q7c q7cVar = (q7c) obj;
                l7c l7cVar = q7cVar.g3;
                if (l7cVar.H(u69Var.b()) < 0 || l7cVar.H(u69Var.b()) != l7cVar.H(u69Var2.b())) {
                    return false;
                }
                int b20 = u69Var.b();
                int b21 = u69Var2.b();
                ArrayList arrayList8 = l7cVar.E;
                if (l7cVar.N != null) {
                    int H = l7cVar.H(b20);
                    int H2 = l7cVar.H(b21);
                    if (H >= 0 && H == H2) {
                        boolean J = l7cVar.J(b20);
                        boolean J2 = l7cVar.J(b21);
                        arrayList8.add(b21, (c6c) arrayList8.remove(b20));
                        l7cVar.j(b20, b21);
                        if (l7cVar.J(b21) != J) {
                            l7cVar.h(b21, 3);
                        }
                        if (l7cVar.J(b20) != J2) {
                            l7cVar.h(b20, 3);
                        }
                        if (l7cVar.M && (i3 = l7cVar.L) != H) {
                            l7cVar.F(i3);
                        }
                        l7cVar.M = true;
                        l7cVar.L = H;
                    }
                }
                q7cVar.K1();
                return true;
            default:
                int b22 = u69Var.b();
                int b23 = u69Var2.b();
                vgc vgcVar = (vgc) obj;
                ArrayList arrayList9 = vgcVar.h;
                if (!vgcVar.E.D(b22) || !vgcVar.E.D(b23)) {
                    return false;
                }
                Pattern pattern = Utilities.a;
                Object obj2 = arrayList9.get(b22);
                arrayList9.set(b22, arrayList9.get(b23));
                arrayList9.set(b23, obj2);
                vgcVar.y.j(b22, b23);
                ArrayList arrayList10 = new ArrayList();
                int size3 = arrayList9.size();
                while (i4 < size3) {
                    Object obj3 = arrayList9.get(i4);
                    i4++;
                    arrayList10.add(Integer.valueOf(((sgc) obj3).a));
                }
                vgcVar.E.O(arrayList10);
                return true;
        }
    }

    @Override
    public final void p(RecyclerView recyclerView, u69 u69Var, u69 u69Var2, int i, int i2, int i3) {
        switch (this.e) {
            case 2:
            case 8:
                return;
            default:
                super.p(recyclerView, u69Var, u69Var2, i, i2, i3);
                return;
        }
    }

    @Override
    public final void q(u69 u69Var, int i) {
        boolean z;
        sea seaVar;
        byte b = this.e;
        Boolean bool = null;
        Object obj = this.f;
        switch (b) {
            case 0:
                p20 p20Var = ((i30) obj).r1;
                if (u69Var != null) {
                    p20Var.e1(false);
                }
                if (i != 0) {
                    p20Var.J0(false);
                    if (u69Var != null) {
                        u69Var.a.setPressed(true);
                    }
                }
                if (u69Var != null) {
                    View view = u69Var.a;
                    if (i == 2) {
                        bool = Boolean.TRUE;
                    }
                    view.setTag(2131296421, bool);
                    return;
                }
                return;
            case 1:
                gs0 gs0Var = (gs0) obj;
                yr0 yr0Var = gs0Var.f;
                if (u69Var != null) {
                    yr0Var.e1(false);
                }
                if (i == 0) {
                    bs0 bs0Var = gs0Var.w;
                    ArrayList arrayList = bs0Var.n;
                    if (bs0Var.e != null && bs0Var.r) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i2 = 0; i2 < bs0Var.e.i.size(); i2++) {
                            arrayList2.add(Integer.valueOf(((k47) bs0Var.e.i.get(i2)).e1()));
                        }
                        if (arrayList.size() != arrayList2.size()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            int i3 = 0;
                            while (true) {
                                if (i3 < arrayList.size()) {
                                    if (arrayList.get(i3) != arrayList2.get(i3)) {
                                        z = true;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                        if (z) {
                            bs0Var.e.C(arrayList2, true);
                        }
                        bs0Var.r = false;
                    }
                    yr0Var.setItemAnimator(null);
                    return;
                }
                yr0Var.J0(false);
                if (u69Var != null) {
                    u69Var.a.setPressed(true);
                    return;
                }
                return;
            case 2:
                uf1 uf1Var = (uf1) obj;
                if (i == 0) {
                    uf1Var.l0();
                } else {
                    uf1Var.b.J0(false);
                    u69Var.a.setPressed(true);
                }
                if (u69Var != null) {
                    View view2 = u69Var.a;
                    if (i == 2) {
                        bool = Boolean.TRUE;
                    }
                    view2.setTag(2131296421, bool);
                    return;
                }
                return;
            case 3:
                v72 v72Var = (v72) obj;
                smb smbVar = v72Var.s;
                if (i != 0) {
                    smbVar.setItemAnimator(v72Var.w);
                    smbVar.J0(false);
                    u69Var.a.setPressed(true);
                    anb.h(cmb.g5, v72Var.a, u69Var.a);
                    return;
                }
                return;
            case 4:
                pa2 pa2Var = (pa2) obj;
                qa2 qa2Var = pa2Var.i3;
                if (i == 0) {
                    qa2Var.M = false;
                    if (pa2Var.g3) {
                        TLRPC.Chat chat = qa2Var.Y;
                        ArrayList arrayList3 = qa2Var.O;
                        ArrayList arrayList4 = qa2Var.N;
                        if (chat != null) {
                            pa2Var.g3 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = qa2Var.Y;
                            tL_inputChannel.channel_id = chat2.id;
                            tL_inputChannel.access_hash = chat2.access_hash;
                            tL_channels_reorderUsernames.channel = tL_inputChannel;
                            ArrayList<String> arrayList5 = new ArrayList<>();
                            for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                                if (((TLRPC.TL_username) arrayList4.get(i4)).active) {
                                    arrayList5.add(((TLRPC.TL_username) arrayList4.get(i4)).username);
                                }
                            }
                            for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                                if (((TLRPC.TL_username) arrayList3.get(i5)).active) {
                                    arrayList5.add(((TLRPC.TL_username) arrayList3.get(i5)).username);
                                }
                            }
                            tL_channels_reorderUsernames.order = arrayList5;
                            qa2Var.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new nf2((byte) 0));
                            qa2Var.Y.usernames.clear();
                            qa2Var.Y.usernames.addAll(arrayList4);
                            qa2Var.Y.usernames.addAll(arrayList3);
                            qa2Var.getMessagesController().V3(qa2Var.Y, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                qa2Var.M = true;
                pa2Var.J0(false);
                u69Var.a.setPressed(true);
                return;
            case 5:
                if (i != 0) {
                    ((kg8) obj).c.J0(false);
                    u69Var.a.setPressed(true);
                    return;
                }
                return;
            case 6:
                if (i != 0) {
                    ((ju9) obj).b.J0(false);
                    u69Var.a.setPressed(true);
                    return;
                }
                return;
            case 7:
                yga ygaVar = (yga) obj;
                c0a c0aVar = ygaVar.n;
                if (u69Var != null && (seaVar = ygaVar.s) != null) {
                    seaVar.e1(false);
                }
                if (i == 0) {
                    gm.r(c0aVar);
                    gm.d3(c0aVar, 300L);
                    return;
                }
                return;
            case 8:
                q7c q7cVar = (q7c) obj;
                if (u69Var != null) {
                    q7cVar.e1(false);
                }
                if (i == 0) {
                    l7c l7cVar = q7cVar.g3;
                    if (l7cVar.M) {
                        l7cVar.F(l7cVar.L);
                    }
                    if (q7cVar.l3 != null) {
                        q7cVar.G1();
                        q7cVar.l3 = null;
                        return;
                    }
                    return;
                }
                q7cVar.J0(false);
                if (u69Var != null) {
                    View view3 = u69Var.a;
                    view3.setPressed(true);
                    if (view3.getBackground() instanceof gf9) {
                        gf9 gf9Var = (gf9) view3.getBackground();
                        if (!gf9Var.c) {
                            gf9Var.c = true;
                            gf9Var.invalidateSelf();
                        }
                    }
                    if (i == 2) {
                        q7cVar.l3 = u69Var;
                        q7cVar.J1(u69Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void r(u69 u69Var) {
        byte b = this.e;
    }

    public final boolean u(int i) {
        kg8 kg8Var = (kg8) this.f;
        if (!kg8Var.J || i - kg8Var.o0 >= kg8Var.y) {
            return true;
        }
        return false;
    }

    public final vr9 v(u69 u69Var) {
        int b;
        ArrayList arrayList = ((yga) this.f).f;
        if (u69Var != null && (b = u69Var.b()) >= 0 && b < arrayList.size()) {
            return (vr9) arrayList.get(b);
        }
        return null;
    }

    private final void A(u69 u69Var) {
    }

    private final void B(u69 u69Var) {
    }

    private final void C(u69 u69Var) {
    }

    private final void D(u69 u69Var) {
    }

    private final void E(u69 u69Var) {
    }

    private final void F(u69 u69Var) {
    }

    private final void G(u69 u69Var) {
    }

    private final void H(u69 u69Var) {
    }

    private final void y(u69 u69Var) {
    }

    private final void z(u69 u69Var) {
    }

    private final void w(RecyclerView recyclerView, u69 u69Var, u69 u69Var2, int i, int i2, int i3) {
    }

    private final void x(RecyclerView recyclerView, u69 u69Var, u69 u69Var2, int i, int i2, int i3) {
    }
}
