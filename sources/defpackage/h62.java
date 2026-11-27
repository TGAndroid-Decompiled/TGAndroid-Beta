package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class h62 implements r69 {
    public final byte a = 0;
    public final vnb b;
    public final Object c;
    public final Object d;
    public final Object e;

    public h62(a72 a72Var, vnb vnbVar, n12 n12Var, Context context) {
        this.c = a72Var;
        this.b = vnbVar;
        this.d = n12Var;
        this.e = context;
    }

    @Override
    public final void e(int i, View view) {
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
                a72 a72Var = (a72) obj3;
                n12 n12Var = (n12) obj2;
                Context context = (Context) obj;
                lg5 lg5Var = a72Var.E;
                boolean[] zArr = a72Var.M;
                cdc cdcVar = a72Var.O0;
                q62 q62Var = a72Var.w;
                t20 t20Var = a72Var.r;
                qob qobVar = a72Var.s;
                int i4 = a72Var.M0;
                vnb vnbVar = this.b;
                if (i == i4) {
                    ry2 ry2Var = new ry2(a72Var.getContext(), vnbVar);
                    ry2Var.f2 = new wz4(a72Var);
                    ArrayList arrayList = a72Var.Q0;
                    ry2Var.X1 = null;
                    ry2Var.j2 = new HashSet(arrayList);
                    ry2Var.show();
                    return;
                } else if (i == a72Var.J0) {
                    fu5 G = fu5.G(n12Var.c, vnbVar, view);
                    int i5 = 0;
                    while (true) {
                        int[] iArr = a72Var.U0;
                        if (i5 < iArr.length) {
                            int i6 = iArr[i5];
                            rsb a = rsb.a(i6);
                            int i7 = aob.F8;
                            yob.x(a72Var, a, i7, vnbVar, PorterDuff.Mode.SRC_IN);
                            G.a(0, a, ob6.G(i6 / 3600, "Hours", new Object[0]), null, i7, aob.E8, new bf7(a72Var, i6, view, (byte) 16));
                            i5++;
                        } else {
                            G.b(2131232111, ob6.M0(2131746858, null), new ao1(a72Var, context, view, vnbVar, (byte) 6), false);
                            G.t = false;
                            G.s = (short) 0;
                            G.a0();
                            return;
                        }
                    }
                } else if (i == a72Var.v0) {
                    a72Var.O();
                    return;
                } else {
                    boolean z4 = view instanceof wkb;
                    if (z4 || (view instanceof xh8)) {
                        boolean z5 = a72Var.d0;
                        s62 s62Var = a72Var.y;
                        if (s62Var != null) {
                            s62Var.e();
                        }
                        cdc[] cdcVarArr = a72Var.P0;
                        int length = cdcVarArr.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 < length) {
                                cdc cdcVar2 = cdcVarArr[i8];
                                int i9 = i2;
                                if (i == cdcVar2.b) {
                                    boolean z6 = cdcVar2.a;
                                    z2 = !z6;
                                    cdcVar2.a = z2;
                                    int i10 = cdcVar.b;
                                    a72 a72Var2 = (a72) cdcVar.c;
                                    t20 t20Var2 = a72Var2.r;
                                    if (i == i10) {
                                        qobVar.setItemAnimator(q62Var);
                                        int i11 = cdcVar.b;
                                        if (i11 >= 0) {
                                            f89 L = a72Var2.s.L(i11);
                                            if (L != null) {
                                                View view2 = L.a;
                                                if (view2 instanceof xh8) {
                                                    ((xh8) view2).setDivider(z2);
                                                }
                                            }
                                            t20Var2.g(cdcVar.b);
                                        }
                                        if (!z6) {
                                            t20Var2.p(cdcVar.b + 1, i9);
                                        } else {
                                            t20Var2.q(cdcVar.b + i9, i9);
                                        }
                                        a72Var.m0();
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
                            if (i == a72Var.C0) {
                                z2 = a72Var.b0;
                                a72Var.b0 = !z2;
                                a72Var.Q();
                            } else {
                                int i12 = a72Var.z0;
                                if (i == i12) {
                                    z2 = !a72Var.g0;
                                    a72Var.g0 = z2;
                                } else if (i == a72Var.D0) {
                                    if (!a72Var.d0 && !a72Var.b0) {
                                        a72Var.U = !a72Var.U;
                                    }
                                    z2 = a72Var.U;
                                } else if (i == a72Var.F0) {
                                    z2 = !a72Var.T;
                                    a72Var.T = z2;
                                } else if (i == a72Var.I0) {
                                    if (a72Var.V == 0 && a72Var.W == 0) {
                                        a72Var.V = 86400;
                                        a72Var.W = 0;
                                        int i13 = a72Var.J0;
                                        a72Var.m0();
                                        if (i13 < 0) {
                                            f89 L2 = qobVar.L(a72Var.I0);
                                            if (L2 != null) {
                                                View view3 = L2.a;
                                                if (view3 instanceof xh8) {
                                                    ((xh8) view3).setDivider(true);
                                                }
                                            }
                                            qobVar.setItemAnimator(q62Var);
                                            t20Var.p(a72Var.J0, 3);
                                        }
                                    } else {
                                        a72Var.V = 0;
                                        a72Var.W = 0;
                                        int i14 = a72Var.J0;
                                        a72Var.m0();
                                        qobVar.setItemAnimator(q62Var);
                                        t20Var.q(i14, 3);
                                        f89 L3 = qobVar.L(a72Var.I0);
                                        if (L3 != null) {
                                            View view4 = L3.a;
                                            if (view4 instanceof xh8) {
                                                ((xh8) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (a72Var.V == 0 && a72Var.W == 0) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    z2 = z3;
                                } else if (i == a72Var.E0) {
                                    z2 = !a72Var.S;
                                    a72Var.S = z2;
                                } else if (i == a72Var.A0) {
                                    z2 = !a72Var.h0;
                                    a72Var.h0 = z2;
                                    a72Var.m0();
                                    int i15 = a72Var.z0;
                                    if (i15 >= 0 && i12 < 0) {
                                        qobVar.setItemAnimator(q62Var);
                                        t20Var.i(a72Var.z0);
                                    } else if (i12 >= 0 && i15 < 0) {
                                        qobVar.setItemAnimator(q62Var);
                                        t20Var.s(i12);
                                    }
                                } else if (i == a72Var.G0) {
                                    boolean z7 = a72Var.c0;
                                    z2 = !z7;
                                    a72Var.c0 = z2;
                                    if (z7 && a72Var.d0) {
                                        boolean z8 = false;
                                        for (int i16 = 0; i16 < zArr.length; i16++) {
                                            if (z8) {
                                                zArr[i16] = false;
                                            } else if (zArr[i16]) {
                                                z8 = true;
                                            }
                                        }
                                    }
                                    int childCount = qobVar.getChildCount();
                                    for (int i17 = 0; i17 < childCount; i17++) {
                                        f89 U = qobVar.U(qobVar.getChildAt(i17));
                                        if (U.f == 5) {
                                            ((zh8) U.a).a.a(a72Var.c0, true);
                                        }
                                    }
                                } else if (i == a72Var.K0) {
                                    z2 = !a72Var.a0;
                                    a72Var.a0 = z2;
                                } else if (i == a72Var.H0) {
                                    if (!a72Var.f0) {
                                        qobVar.setItemAnimator(q62Var);
                                        z2 = !a72Var.d0;
                                        a72Var.d0 = z2;
                                        int i18 = a72Var.p0;
                                        a72Var.m0();
                                        if (a72Var.d0) {
                                            t20Var.p(a72Var.p0, 3);
                                        } else {
                                            t20Var.q(i18, 3);
                                        }
                                        t20Var.g(a72Var.B0);
                                        if (a72Var.d0) {
                                            a72Var.S = false;
                                            int i19 = a72Var.E0;
                                            if (i19 >= 0) {
                                                f89 L4 = qobVar.L(i19);
                                                if (L4 != null) {
                                                    ((xh8) L4.a).setChecked(false);
                                                } else {
                                                    t20Var.g(a72Var.E0);
                                                }
                                            }
                                        } else {
                                            int i20 = a72Var.E0;
                                            if (i20 >= 0 && qobVar.L(i20) == null) {
                                                t20Var.g(a72Var.E0);
                                            }
                                        }
                                        a72Var.Q();
                                        if (a72Var.d0 && !a72Var.c0) {
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
                        if (a72Var.e0 && !a72Var.d0) {
                            qobVar.getChildCount();
                            lg5Var.a();
                        }
                        for (int i22 = a72Var.u0; i22 < a72Var.u0 + a72Var.N; i22++) {
                            f89 L5 = qobVar.L(i22);
                            if (L5 != null) {
                                View view5 = L5.a;
                                if (view5 instanceof zh8) {
                                    zh8 zh8Var = (zh8) view5;
                                    zh8Var.n(a72Var.d0, true);
                                    zh8Var.r.a(zArr[i22 - a72Var.u0], z5);
                                    if (zh8Var.getTop() > hl.L(40.0f) && i == a72Var.H0 && !a72Var.e0) {
                                        lg5Var.setText(ob6.M0(2131746882, null));
                                        lg5Var.c(zh8Var.getCheckBox());
                                        a72Var.e0 = true;
                                    }
                                }
                            }
                        }
                        if (z4) {
                            ((wkb) view).setChecked(z2);
                        } else if (view instanceof xh8) {
                            ((xh8) view).setChecked(z2);
                        }
                        a72Var.S();
                        return;
                    }
                    return;
                }
                break;
            default:
                ly3 ly3Var = (ly3) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                e eVar = (e) obj;
                xx3 xx3Var = ly3Var.o1;
                if (arrayList2 != null && arrayList2.size() > 1) {
                    if (SystemClock.elapsedRealtime() - ly3Var.K1 >= 250) {
                        int i23 = 0;
                        while (true) {
                            ArrayList[] arrayListArr = xx3Var.c;
                            if (i3 < arrayListArr.length) {
                                int size = arrayListArr[i3].size();
                                if (xx3Var.c.length > 1) {
                                    size = Math.min(ly3Var.x1.J << 1, size);
                                }
                                i23 += size + 2;
                                if (i >= i23) {
                                    i3++;
                                }
                            }
                        }
                        ArrayList arrayList3 = xx3Var.b;
                        if (arrayList3 != null && i3 < arrayList3.size()) {
                            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) xx3Var.b.get(i3);
                        }
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            ArrayList arrayList4 = new ArrayList();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                            tL_inputStickerSetID.id = stickerSet.id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            arrayList4.add(tL_inputStickerSetID);
                            new yx3(ly3Var, eVar, ly3Var.getContext(), this.b, arrayList4).show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                n8 n8Var = ly3Var.A1;
                if (n8Var != null) {
                    n8Var.d(true);
                    ly3Var.A1 = null;
                    return;
                } else if ((eVar instanceof zu1) && ((zu1) eVar).a0.getVisibility() == 0 && (view instanceof ey3)) {
                    hm hmVar = ((ey3) view).c;
                    try {
                        TLRPC.Document document = hmVar.document;
                        if (document == null) {
                            document = wl.e(ly3Var.a, hmVar.getDocumentId());
                        }
                        SpannableString spannableString = new SpannableString(r47.U(document));
                        spannableString.setSpan(hmVar, 0, spannableString.length(), 33);
                        ((zu1) eVar).a0.F0.getText().append((CharSequence) spannableString);
                        ly3Var.H0();
                        ly3Var.dismiss();
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

    public h62(ly3 ly3Var, ArrayList arrayList, e eVar, vnb vnbVar) {
        this.c = ly3Var;
        this.d = arrayList;
        this.e = eVar;
        this.b = vnbVar;
    }
}
