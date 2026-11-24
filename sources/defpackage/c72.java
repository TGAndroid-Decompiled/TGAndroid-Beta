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
public final class c72 implements f59 {
    public final byte a = 1;
    public final ylb b;
    public final Object c;
    public final Object d;
    public final Object e;

    public c72(v72 v72Var, ylb ylbVar, i22 i22Var, Context context) {
        this.c = v72Var;
        this.b = ylbVar;
        this.d = i22Var;
        this.e = context;
    }

    @Override
    public final void g(int i, View view) {
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
                v72 v72Var = (v72) obj3;
                i22 i22Var = (i22) obj2;
                Context context = (Context) obj;
                ig5 ig5Var = v72Var.E;
                boolean[] zArr = v72Var.M;
                dbc dbcVar = v72Var.O0;
                l72 l72Var = v72Var.w;
                s30 s30Var = v72Var.r;
                smb smbVar = v72Var.s;
                int i4 = v72Var.M0;
                ylb ylbVar = this.b;
                if (i == i4) {
                    hz2 hz2Var = new hz2(v72Var.getContext(), ylbVar);
                    hz2Var.f2 = new sz4(v72Var);
                    ArrayList arrayList = v72Var.Q0;
                    hz2Var.X1 = null;
                    hz2Var.j2 = new HashSet(arrayList);
                    hz2Var.show();
                    return;
                } else if (i == v72Var.J0) {
                    bu5 G = bu5.G(i22Var.c, ylbVar, view);
                    int i5 = 0;
                    while (true) {
                        int[] iArr = v72Var.U0;
                        if (i5 < iArr.length) {
                            int i6 = iArr[i5];
                            sqb a = sqb.a(i6);
                            int i7 = cmb.E8;
                            anb.x(v72Var, a, i7, ylbVar, PorterDuff.Mode.SRC_IN);
                            G.a(0, a, jb6.G(i6 / 3600, "Hours", new Object[0]), i7, cmb.D8, new wc7(v72Var, i6, view, (byte) 16));
                            i5++;
                        } else {
                            G.b(2131232112, jb6.M0(2131746864, null), new xo1(v72Var, context, view, ylbVar, (byte) 6), false);
                            G.t = false;
                            G.s = (short) 0;
                            G.a0();
                            return;
                        }
                    }
                } else if (i == v72Var.v0) {
                    v72Var.O();
                    return;
                } else {
                    boolean z4 = view instanceof bjb;
                    if (z4 || (view instanceof lg8)) {
                        boolean z5 = v72Var.d0;
                        n72 n72Var = v72Var.y;
                        if (n72Var != null) {
                            n72Var.e();
                        }
                        dbc[] dbcVarArr = v72Var.P0;
                        int length = dbcVarArr.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 < length) {
                                dbc dbcVar2 = dbcVarArr[i8];
                                int i9 = i2;
                                if (i == dbcVar2.b) {
                                    boolean z6 = dbcVar2.a;
                                    z2 = !z6;
                                    dbcVar2.a = z2;
                                    int i10 = dbcVar.b;
                                    v72 v72Var2 = (v72) dbcVar.c;
                                    s30 s30Var2 = v72Var2.r;
                                    if (i == i10) {
                                        smbVar.setItemAnimator(l72Var);
                                        int i11 = dbcVar.b;
                                        if (i11 >= 0) {
                                            u69 K = v72Var2.s.K(i11);
                                            if (K != null) {
                                                View view2 = K.a;
                                                if (view2 instanceof lg8) {
                                                    ((lg8) view2).setDivider(z2);
                                                }
                                            }
                                            s30Var2.g(dbcVar.b);
                                        }
                                        if (!z6) {
                                            s30Var2.p(dbcVar.b + 1, i9);
                                        } else {
                                            s30Var2.q(dbcVar.b + i9, i9);
                                        }
                                        v72Var.n0();
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
                            if (i == v72Var.C0) {
                                z2 = v72Var.b0;
                                v72Var.b0 = !z2;
                                v72Var.Q();
                            } else {
                                int i12 = v72Var.z0;
                                if (i == i12) {
                                    z2 = !v72Var.g0;
                                    v72Var.g0 = z2;
                                } else if (i == v72Var.D0) {
                                    if (!v72Var.d0 && !v72Var.b0) {
                                        v72Var.U = !v72Var.U;
                                    }
                                    z2 = v72Var.U;
                                } else if (i == v72Var.F0) {
                                    z2 = !v72Var.T;
                                    v72Var.T = z2;
                                } else if (i == v72Var.I0) {
                                    if (v72Var.V == 0 && v72Var.W == 0) {
                                        v72Var.V = 86400;
                                        v72Var.W = 0;
                                        int i13 = v72Var.J0;
                                        v72Var.n0();
                                        if (i13 < 0) {
                                            u69 K2 = smbVar.K(v72Var.I0);
                                            if (K2 != null) {
                                                View view3 = K2.a;
                                                if (view3 instanceof lg8) {
                                                    ((lg8) view3).setDivider(true);
                                                }
                                            }
                                            smbVar.setItemAnimator(l72Var);
                                            s30Var.p(v72Var.J0, 3);
                                        }
                                    } else {
                                        v72Var.V = 0;
                                        v72Var.W = 0;
                                        int i14 = v72Var.J0;
                                        v72Var.n0();
                                        smbVar.setItemAnimator(l72Var);
                                        s30Var.q(i14, 3);
                                        u69 K3 = smbVar.K(v72Var.I0);
                                        if (K3 != null) {
                                            View view4 = K3.a;
                                            if (view4 instanceof lg8) {
                                                ((lg8) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    if (v72Var.V == 0 && v72Var.W == 0) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    z2 = z3;
                                } else if (i == v72Var.E0) {
                                    z2 = !v72Var.S;
                                    v72Var.S = z2;
                                } else if (i == v72Var.A0) {
                                    z2 = !v72Var.h0;
                                    v72Var.h0 = z2;
                                    v72Var.n0();
                                    int i15 = v72Var.z0;
                                    if (i15 >= 0 && i12 < 0) {
                                        smbVar.setItemAnimator(l72Var);
                                        s30Var.i(v72Var.z0);
                                    } else if (i12 >= 0 && i15 < 0) {
                                        smbVar.setItemAnimator(l72Var);
                                        s30Var.s(i12);
                                    }
                                } else if (i == v72Var.G0) {
                                    boolean z7 = v72Var.c0;
                                    z2 = !z7;
                                    v72Var.c0 = z2;
                                    if (z7 && v72Var.d0) {
                                        boolean z8 = false;
                                        for (int i16 = 0; i16 < zArr.length; i16++) {
                                            if (z8) {
                                                zArr[i16] = false;
                                            } else if (zArr[i16]) {
                                                z8 = true;
                                            }
                                        }
                                    }
                                    int childCount = smbVar.getChildCount();
                                    for (int i17 = 0; i17 < childCount; i17++) {
                                        u69 T = smbVar.T(smbVar.getChildAt(i17));
                                        if (T.f == 5) {
                                            ((ng8) T.a).a.a(v72Var.c0, true);
                                        }
                                    }
                                } else if (i == v72Var.K0) {
                                    z2 = !v72Var.a0;
                                    v72Var.a0 = z2;
                                } else if (i == v72Var.H0) {
                                    if (!v72Var.f0) {
                                        smbVar.setItemAnimator(l72Var);
                                        z2 = !v72Var.d0;
                                        v72Var.d0 = z2;
                                        int i18 = v72Var.p0;
                                        v72Var.n0();
                                        if (v72Var.d0) {
                                            s30Var.p(v72Var.p0, 3);
                                        } else {
                                            s30Var.q(i18, 3);
                                        }
                                        s30Var.g(v72Var.B0);
                                        if (v72Var.d0) {
                                            v72Var.S = false;
                                            int i19 = v72Var.E0;
                                            if (i19 >= 0) {
                                                u69 K4 = smbVar.K(i19);
                                                if (K4 != null) {
                                                    ((lg8) K4.a).setChecked(false);
                                                } else {
                                                    s30Var.g(v72Var.E0);
                                                }
                                            }
                                        } else {
                                            int i20 = v72Var.E0;
                                            if (i20 >= 0 && smbVar.K(i20) == null) {
                                                s30Var.g(v72Var.E0);
                                            }
                                        }
                                        v72Var.Q();
                                        if (v72Var.d0 && !v72Var.c0) {
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
                        if (v72Var.e0 && !v72Var.d0) {
                            smbVar.getChildCount();
                            ig5Var.a();
                        }
                        for (int i22 = v72Var.u0; i22 < v72Var.u0 + v72Var.N; i22++) {
                            u69 K5 = smbVar.K(i22);
                            if (K5 != null) {
                                View view5 = K5.a;
                                if (view5 instanceof ng8) {
                                    ng8 ng8Var = (ng8) view5;
                                    ng8Var.n(v72Var.d0, true);
                                    ng8Var.r.a(zArr[i22 - v72Var.u0], z5);
                                    if (ng8Var.getTop() > gm.L(40.0f) && i == v72Var.H0 && !v72Var.e0) {
                                        ig5Var.setText(jb6.M0(2131746888, null));
                                        ig5Var.c(ng8Var.getCheckBox());
                                        v72Var.e0 = true;
                                    }
                                }
                            }
                        }
                        if (z4) {
                            ((bjb) view).setChecked(z2);
                        } else if (view instanceof lg8) {
                            ((lg8) view).setChecked(z2);
                        }
                        v72Var.S();
                        return;
                    }
                    return;
                }
                break;
            default:
                az3 az3Var = (az3) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                d dVar = (d) obj;
                my3 my3Var = az3Var.o1;
                if (arrayList2 != null && arrayList2.size() > 1) {
                    if (SystemClock.elapsedRealtime() - az3Var.K1 >= 250) {
                        int i23 = 0;
                        while (true) {
                            ArrayList[] arrayListArr = my3Var.c;
                            if (i3 < arrayListArr.length) {
                                int size = arrayListArr[i3].size();
                                if (my3Var.c.length > 1) {
                                    size = Math.min(az3Var.x1.J << 1, size);
                                }
                                i23 += size + 2;
                                if (i >= i23) {
                                    i3++;
                                }
                            }
                        }
                        ArrayList arrayList3 = my3Var.b;
                        if (arrayList3 != null && i3 < arrayList3.size()) {
                            tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) my3Var.b.get(i3);
                        }
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            ArrayList arrayList4 = new ArrayList();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                            tL_inputStickerSetID.id = stickerSet.id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            arrayList4.add(tL_inputStickerSetID);
                            new ny3(az3Var, dVar, az3Var.getContext(), this.b, arrayList4).show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                m8 m8Var = az3Var.A1;
                if (m8Var != null) {
                    m8Var.d(true);
                    az3Var.A1 = null;
                    return;
                } else if ((dVar instanceof yv1) && ((yv1) dVar).a0.getVisibility() == 0 && (view instanceof ty3)) {
                    gn gnVar = ((ty3) view).c;
                    try {
                        TLRPC.Document document = gnVar.document;
                        if (document == null) {
                            document = vm.e(az3Var.a, gnVar.getDocumentId());
                        }
                        SpannableString spannableString = new SpannableString(k47.U(document));
                        spannableString.setSpan(gnVar, 0, spannableString.length(), 33);
                        ((yv1) dVar).a0.F0.getText().append((CharSequence) spannableString);
                        az3Var.G0();
                        az3Var.dismiss();
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

    public c72(az3 az3Var, ArrayList arrayList, d dVar, ylb ylbVar) {
        this.c = az3Var;
        this.d = arrayList;
        this.e = dVar;
        this.b = ylbVar;
    }
}
