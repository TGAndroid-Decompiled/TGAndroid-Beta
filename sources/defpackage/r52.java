package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class r52 implements c39 {
    public final byte a = 0;
    public final wjb b;
    public final Object c;
    public final Object d;
    public final Object e;

    public r52(k62 k62Var, wjb wjbVar, x02 x02Var, Context context) {
        this.c = k62Var;
        this.b = wjbVar;
        this.d = x02Var;
        this.e = context;
    }

    @Override
    public final void d(int i, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        byte b = this.a;
        int i2 = 1;
        int i3 = 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                k62 k62Var = (k62) obj3;
                x02 x02Var = (x02) obj2;
                Context context = (Context) obj;
                ke5 ke5Var = k62Var.E;
                boolean[] zArr = k62Var.M;
                c9c c9cVar = k62Var.O0;
                a62 a62Var = k62Var.w;
                s20 s20Var = k62Var.r;
                rkb rkbVar = k62Var.s;
                int i4 = k62Var.M0;
                wjb wjbVar = this.b;
                if (i == i4) {
                    xx2 xx2Var = new xx2(k62Var.getContext(), wjbVar);
                    xx2Var.f2 = new lj9(k62Var, (byte) 19);
                    ArrayList arrayList = k62Var.Q0;
                    xx2Var.X1 = null;
                    xx2Var.j2 = new HashSet(arrayList);
                    xx2Var.show();
                    return;
                } else if (i == k62Var.J0) {
                    cs5 G = cs5.G(x02Var.c, wjbVar, view);
                    int i5 = 0;
                    while (true) {
                        int[] iArr = k62Var.U0;
                        if (i5 < iArr.length) {
                            int i6 = iArr[i5];
                            rob a = rob.a(i6);
                            int i7 = bkb.E8;
                            zkb.x(k62Var, a, i7, wjbVar, PorterDuff.Mode.SRC_IN);
                            G.a(0, a, k96.G(i6 / 3600, "Hours", new Object[0]), i7, bkb.D8, new va7(k62Var, i6, view, (byte) 16));
                            i5++;
                        } else {
                            G.b(2131232111, k96.M0(2131746938, null), new hn1(k62Var, context, view, wjbVar, (byte) 6), false);
                            G.t = false;
                            G.s = (short) 0;
                            G.a0();
                            return;
                        }
                    }
                } else if (i == k62Var.v0) {
                    k62Var.P();
                    return;
                } else {
                    boolean z4 = view instanceof ahb;
                    if (z4 || (view instanceof je8)) {
                        boolean z5 = k62Var.d0;
                        c62 c62Var = k62Var.y;
                        if (c62Var != null) {
                            c62Var.e();
                        }
                        c9c[] c9cVarArr = k62Var.P0;
                        int length = c9cVarArr.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 < length) {
                                c9c c9cVar2 = c9cVarArr[i8];
                                int i9 = i2;
                                if (i == c9cVar2.b) {
                                    boolean z6 = c9cVar2.a;
                                    z2 = !z6;
                                    c9cVar2.a = z2;
                                    int i10 = c9cVar.b;
                                    k62 k62Var2 = (k62) c9cVar.c;
                                    s20 s20Var2 = k62Var2.r;
                                    if (i == i10) {
                                        rkbVar.setItemAnimator(a62Var);
                                        int i11 = c9cVar.b;
                                        if (i11 >= 0) {
                                            s49 K = k62Var2.s.K(i11);
                                            if (K != null) {
                                                View view2 = K.a;
                                                if (view2 instanceof je8) {
                                                    ((je8) view2).setDivider(z2);
                                                }
                                            }
                                            s20Var2.g(c9cVar.b);
                                        }
                                        if (!z6) {
                                            s20Var2.p(c9cVar.b + 1, i9);
                                        } else {
                                            s20Var2.q(c9cVar.b + i9, i9);
                                        }
                                        k62Var.n0();
                                    }
                                    z = true;
                                } else {
                                    i8++;
                                    i2 = 1;
                                }
                            } else {
                                z = false;
                                z2 = false;
                            }
                        }
                        if (!z) {
                            if (i == k62Var.C0) {
                                z2 = k62Var.b0;
                                k62Var.b0 = !z2;
                                k62Var.R();
                            } else {
                                int i12 = k62Var.z0;
                                if (i == i12) {
                                    z2 = !k62Var.g0;
                                    k62Var.g0 = z2;
                                } else if (i == k62Var.D0) {
                                    if (!k62Var.d0 && !k62Var.b0) {
                                        k62Var.U = !k62Var.U;
                                    }
                                    z2 = k62Var.U;
                                } else if (i == k62Var.F0) {
                                    z2 = !k62Var.T;
                                    k62Var.T = z2;
                                } else if (i == k62Var.I0) {
                                    if (k62Var.V == 0 && k62Var.W == 0) {
                                        k62Var.V = 86400;
                                        k62Var.W = 0;
                                        int i13 = k62Var.J0;
                                        k62Var.n0();
                                        if (i13 < 0) {
                                            s49 K2 = rkbVar.K(k62Var.I0);
                                            if (K2 != null) {
                                                View view3 = K2.a;
                                                if (view3 instanceof je8) {
                                                    ((je8) view3).setDivider(true);
                                                }
                                            }
                                            rkbVar.setItemAnimator(a62Var);
                                            s20Var.p(k62Var.J0, 3);
                                        }
                                    } else {
                                        k62Var.V = 0;
                                        k62Var.W = 0;
                                        int i14 = k62Var.J0;
                                        k62Var.n0();
                                        rkbVar.setItemAnimator(a62Var);
                                        s20Var.q(i14, 3);
                                        s49 K3 = rkbVar.K(k62Var.I0);
                                        if (K3 != null) {
                                            View view4 = K3.a;
                                            if (view4 instanceof je8) {
                                                ((je8) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (k62Var.V == 0 && k62Var.W == 0) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    z2 = z3;
                                } else if (i == k62Var.E0) {
                                    z2 = !k62Var.S;
                                    k62Var.S = z2;
                                } else if (i == k62Var.A0) {
                                    z2 = !k62Var.h0;
                                    k62Var.h0 = z2;
                                    k62Var.n0();
                                    int i15 = k62Var.z0;
                                    if (i15 >= 0 && i12 < 0) {
                                        rkbVar.setItemAnimator(a62Var);
                                        s20Var.i(k62Var.z0);
                                    } else if (i12 >= 0 && i15 < 0) {
                                        rkbVar.setItemAnimator(a62Var);
                                        s20Var.r(i12);
                                    }
                                } else if (i == k62Var.G0) {
                                    boolean z7 = k62Var.c0;
                                    z2 = !z7;
                                    k62Var.c0 = z2;
                                    if (z7 && k62Var.d0) {
                                        boolean z8 = false;
                                        for (int i16 = 0; i16 < zArr.length; i16++) {
                                            if (z8) {
                                                zArr[i16] = false;
                                            } else if (zArr[i16]) {
                                                z8 = true;
                                            }
                                        }
                                    }
                                    int childCount = rkbVar.getChildCount();
                                    for (int i17 = 0; i17 < childCount; i17++) {
                                        s49 T = rkbVar.T(rkbVar.getChildAt(i17));
                                        if (T.f == 5) {
                                            ((le8) T.a).a.a(k62Var.c0, true);
                                        }
                                    }
                                } else if (i == k62Var.K0) {
                                    z2 = !k62Var.a0;
                                    k62Var.a0 = z2;
                                } else if (i == k62Var.H0) {
                                    if (!k62Var.f0) {
                                        rkbVar.setItemAnimator(a62Var);
                                        z2 = !k62Var.d0;
                                        k62Var.d0 = z2;
                                        int i18 = k62Var.p0;
                                        k62Var.n0();
                                        if (k62Var.d0) {
                                            s20Var.p(k62Var.p0, 3);
                                        } else {
                                            s20Var.q(i18, 3);
                                        }
                                        s20Var.g(k62Var.B0);
                                        if (k62Var.d0) {
                                            k62Var.S = false;
                                            int i19 = k62Var.E0;
                                            if (i19 >= 0) {
                                                s49 K4 = rkbVar.K(i19);
                                                if (K4 != null) {
                                                    ((je8) K4.a).setChecked(false);
                                                } else {
                                                    s20Var.g(k62Var.E0);
                                                }
                                            }
                                        } else {
                                            int i20 = k62Var.E0;
                                            if (i20 >= 0 && rkbVar.K(i20) == null) {
                                                s20Var.g(k62Var.E0);
                                            }
                                        }
                                        k62Var.R();
                                        if (k62Var.d0 && !k62Var.c0) {
                                            boolean z9 = false;
                                            for (int i21 = 0; i21 < zArr.length; i21++) {
                                                if (z9) {
                                                    zArr[i21] = false;
                                                } else if (zArr[i21]) {
                                                    z9 = true;
                                                }
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                        if (k62Var.e0 && !k62Var.d0) {
                            rkbVar.getChildCount();
                            ke5Var.a();
                        }
                        for (int i22 = k62Var.u0; i22 < k62Var.u0 + k62Var.N; i22++) {
                            s49 K5 = rkbVar.K(i22);
                            if (K5 != null) {
                                View view5 = K5.a;
                                if (view5 instanceof le8) {
                                    le8 le8Var = (le8) view5;
                                    le8Var.n(k62Var.d0, true);
                                    le8Var.r.a(zArr[i22 - k62Var.u0], z5);
                                    if (le8Var.getTop() > gl.L(40.0f) && i == k62Var.H0 && !k62Var.e0) {
                                        ke5Var.setText(k96.M0(2131746962, null));
                                        ke5Var.c(le8Var.getCheckBox());
                                        k62Var.e0 = true;
                                    }
                                }
                            }
                        }
                        if (z4) {
                            ((ahb) view).setChecked(z2);
                        } else if (view instanceof je8) {
                            ((je8) view).setChecked(z2);
                        }
                        k62Var.T();
                        return;
                    }
                    return;
                }
                break;
            default:
                qx3 qx3Var = (qx3) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                d dVar = (d) obj;
                bx3 bx3Var = qx3Var.o1;
                if (arrayList2 != null && arrayList2.size() > 1) {
                    if (SystemClock.elapsedRealtime() - qx3Var.K1 >= 250) {
                        int i23 = 0;
                        while (true) {
                            ArrayList[] arrayListArr = bx3Var.c;
                            if (i3 < arrayListArr.length) {
                                int size = arrayListArr[i3].size();
                                if (bx3Var.c.length > 1) {
                                    size = Math.min(qx3Var.x1.J << 1, size);
                                }
                                i23 += size + 2;
                                if (i >= i23) {
                                    i3++;
                                }
                            }
                        }
                        ArrayList arrayList3 = bx3Var.b;
                        if (arrayList3 != null && i3 < arrayList3.size()) {
                            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) bx3Var.b.get(i3);
                        }
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            ArrayList arrayList4 = new ArrayList();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                            tL_inputStickerSetID.id = stickerSet.id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            arrayList4.add(tL_inputStickerSetID);
                            new cx3(qx3Var, dVar, qx3Var.getContext(), this.b, arrayList4).show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                m8 m8Var = qx3Var.A1;
                if (m8Var != null) {
                    m8Var.d(true);
                    qx3Var.A1 = null;
                    return;
                } else if ((dVar instanceof mu1) && ((mu1) dVar).a0.getVisibility() == 0 && (view instanceof ix3)) {
                    gm gmVar = ((ix3) view).c;
                    try {
                        TLRPC.Document document = gmVar.document;
                        if (document == null) {
                            document = vl.e(qx3Var.a, gmVar.getDocumentId());
                        }
                        SpannableString spannableString = new SpannableString(k27.U(document));
                        spannableString.setSpan(gmVar, 0, spannableString.length(), 33);
                        ((mu1) dVar).a0.F0.getText().append((CharSequence) spannableString);
                        qx3Var.G0();
                        qx3Var.dismiss();
                    } catch (Exception unused) {
                    }
                    try {
                        view.performHapticFeedback(3, 1);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public r52(qx3 qx3Var, ArrayList arrayList, d dVar, wjb wjbVar) {
        this.c = qx3Var;
        this.d = arrayList;
        this.e = dVar;
        this.b = wjbVar;
    }
}
