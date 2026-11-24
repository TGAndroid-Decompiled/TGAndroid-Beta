package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class k44 implements i59, tcc, qj5, jca, i68, zv7, cx9, uj2, gec, zy2, fd1, kb1, o7, v78, udc, qq7, ldc, nc8 {
    public final byte a;
    public Object b;

    public k44(byte b) {
        this.a = b;
        switch (b) {
            case 7:
                return;
            case 17:
                this.b = new Bundle();
                return;
            default:
                this.b = new or4(5, 1.0f, false, (byte) 0);
                return;
        }
    }

    @Override
    public final kd1 A() {
        tv7 tv7Var = ((z8b) this.b).H0;
        for (int i = 0; i < tv7Var.getChildCount(); i++) {
            if (tv7Var.getChildAt(i) instanceof kd1) {
                return (kd1) tv7Var.getChildAt(i);
            }
        }
        return null;
    }

    public final void B(int i, long j) {
        tl6 tl6Var = (tl6) this.b;
        boolean z = false;
        if (i != 136) {
            if (i != 137) {
                if (i != 145) {
                    if (i != 146) {
                        if (i != 240) {
                            if (i != 241) {
                                if (i != 20529) {
                                    if (i != 20530) {
                                        if (i != 29636) {
                                            if (i != 29637) {
                                                switch (i) {
                                                    case 131:
                                                        int i2 = (int) j;
                                                        if (i2 != 1) {
                                                            if (i2 != 2) {
                                                                if (i2 != 17) {
                                                                    if (i2 != 33) {
                                                                        tl6Var.h(i);
                                                                        tl6Var.B.f = -1;
                                                                        return;
                                                                    }
                                                                    tl6Var.h(i);
                                                                    tl6Var.B.f = 5;
                                                                    return;
                                                                }
                                                                tl6Var.h(i);
                                                                tl6Var.B.f = 3;
                                                                return;
                                                            }
                                                            tl6Var.h(i);
                                                            tl6Var.B.f = 1;
                                                            return;
                                                        }
                                                        tl6Var.h(i);
                                                        tl6Var.B.f = 2;
                                                        return;
                                                    case 152:
                                                        pl6 k = tl6Var.k(i);
                                                        if (j == 1) {
                                                            z = true;
                                                        }
                                                        k.d = z;
                                                        return;
                                                    case 155:
                                                        tl6Var.X = tl6Var.p(j);
                                                        return;
                                                    case 159:
                                                        tl6Var.h(i);
                                                        tl6Var.B.Q = (int) j;
                                                        return;
                                                    case 176:
                                                        tl6Var.h(i);
                                                        tl6Var.B.o = (int) j;
                                                        return;
                                                    case 179:
                                                        if (!tl6Var.C) {
                                                            tl6Var.g(i);
                                                            tl6Var.H = tl6Var.p(j);
                                                            return;
                                                        }
                                                        return;
                                                    case 186:
                                                        tl6Var.h(i);
                                                        tl6Var.B.p = (int) j;
                                                        return;
                                                    case 215:
                                                        tl6Var.h(i);
                                                        tl6Var.B.d = (int) j;
                                                        return;
                                                    case 231:
                                                        tl6Var.T = tl6Var.p(j);
                                                        return;
                                                    case 238:
                                                        tl6Var.e0 = (int) j;
                                                        return;
                                                    case 247:
                                                        if (!tl6Var.C) {
                                                            tl6Var.g(i);
                                                            tl6Var.I = (int) j;
                                                            return;
                                                        }
                                                        return;
                                                    case 251:
                                                        tl6Var.f0 = true;
                                                        return;
                                                    case 16871:
                                                        tl6Var.h(i);
                                                        tl6Var.B.i = (int) j;
                                                        return;
                                                    case 16980:
                                                        if (j != 3) {
                                                            throw bx7.a("ContentCompAlgo " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 17029:
                                                        if (j < 1 || j > 2) {
                                                            throw bx7.a("DocTypeReadVersion " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 17143:
                                                        if (j != 1) {
                                                            throw bx7.a("EBMLReadVersion " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 18401:
                                                        if (j != 5) {
                                                            throw bx7.a("ContentEncAlgo " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 18408:
                                                        if (j != 1) {
                                                            throw bx7.a("AESSettingsCipherMode " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 21420:
                                                        tl6Var.E = j + tl6Var.u;
                                                        return;
                                                    case 21432:
                                                        int i3 = (int) j;
                                                        tl6Var.h(i);
                                                        if (i3 != 0) {
                                                            if (i3 != 1) {
                                                                if (i3 != 3) {
                                                                    if (i3 == 15) {
                                                                        tl6Var.B.z = 3;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                tl6Var.B.z = 1;
                                                                return;
                                                            }
                                                            tl6Var.B.z = 2;
                                                            return;
                                                        }
                                                        tl6Var.B.z = 0;
                                                        return;
                                                    case 21680:
                                                        tl6Var.h(i);
                                                        tl6Var.B.r = (int) j;
                                                        return;
                                                    case 21682:
                                                        tl6Var.h(i);
                                                        tl6Var.B.t = (int) j;
                                                        return;
                                                    case 21690:
                                                        tl6Var.h(i);
                                                        tl6Var.B.s = (int) j;
                                                        return;
                                                    case 21930:
                                                        tl6Var.h(i);
                                                        sl6 sl6Var = tl6Var.B;
                                                        if (j == 1) {
                                                            z = true;
                                                        }
                                                        sl6Var.a0 = z;
                                                        return;
                                                    case 21938:
                                                        tl6Var.h(i);
                                                        tl6Var.B.q = (int) j;
                                                        return;
                                                    case 21998:
                                                        tl6Var.h(i);
                                                        tl6Var.B.h = (int) j;
                                                        return;
                                                    case 22186:
                                                        tl6Var.h(i);
                                                        tl6Var.B.U = j;
                                                        return;
                                                    case 22203:
                                                        tl6Var.h(i);
                                                        tl6Var.B.V = j;
                                                        return;
                                                    case 25188:
                                                        tl6Var.h(i);
                                                        tl6Var.B.R = (int) j;
                                                        return;
                                                    case 30114:
                                                        tl6Var.g0 = j;
                                                        return;
                                                    case 30321:
                                                        tl6Var.h(i);
                                                        int i4 = (int) j;
                                                        if (i4 != 0) {
                                                            if (i4 != 1) {
                                                                if (i4 != 2) {
                                                                    if (i4 == 3) {
                                                                        tl6Var.B.u = 3;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                tl6Var.B.u = 2;
                                                                return;
                                                            }
                                                            tl6Var.B.u = 1;
                                                            return;
                                                        }
                                                        tl6Var.B.u = 0;
                                                        return;
                                                    case 2352003:
                                                        tl6Var.h(i);
                                                        tl6Var.B.g = (int) j;
                                                        return;
                                                    case 2807729:
                                                        tl6Var.v = j;
                                                        return;
                                                    default:
                                                        switch (i) {
                                                            case 21945:
                                                                tl6Var.h(i);
                                                                int i5 = (int) j;
                                                                if (i5 != 1) {
                                                                    if (i5 == 2) {
                                                                        tl6Var.B.C = 1;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                tl6Var.B.C = 2;
                                                                return;
                                                            case 21946:
                                                                tl6Var.h(i);
                                                                int g = tm2.g((int) j);
                                                                if (g != -1) {
                                                                    tl6Var.B.B = g;
                                                                    return;
                                                                }
                                                                return;
                                                            case 21947:
                                                                tl6Var.h(i);
                                                                int f = tm2.f((int) j);
                                                                if (f != -1) {
                                                                    tl6Var.B.A = f;
                                                                    return;
                                                                }
                                                                return;
                                                            case 21948:
                                                                tl6Var.h(i);
                                                                tl6Var.B.D = (int) j;
                                                                return;
                                                            case 21949:
                                                                tl6Var.h(i);
                                                                tl6Var.B.E = (int) j;
                                                                return;
                                                            default:
                                                                return;
                                                        }
                                                }
                                            }
                                            tl6Var.h(i);
                                            tl6Var.B.e = j;
                                            return;
                                        }
                                        tl6Var.k(i).a = j;
                                        return;
                                    } else if (j != 1) {
                                        throw bx7.a("ContentEncodingScope " + j + " not supported", null);
                                    } else {
                                        return;
                                    }
                                } else if (j != 0) {
                                    throw bx7.a("ContentEncodingOrder " + j + " not supported", null);
                                } else {
                                    return;
                                }
                            } else if (!tl6Var.C) {
                                tl6Var.g(i);
                                if (tl6Var.J == -1) {
                                    tl6Var.J = j;
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (!tl6Var.C) {
                            tl6Var.g(i);
                            if (tl6Var.K == -1) {
                                tl6Var.K = j;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                    tl6Var.k(i).c = j;
                    return;
                }
                tl6Var.k(i).b = j;
                return;
            }
            tl6Var.k(i).e = j;
            return;
        }
        tl6Var.h(i);
        sl6 sl6Var2 = tl6Var.B;
        if (j == 1) {
            z = true;
        }
        sl6Var2.b0 = z;
    }

    @Override
    public final String B0() {
        return null;
    }

    public final void C() {
        ((fp4) this.b).d.R();
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        xg8 xg8Var = (xg8) this.b;
        iq5 g = wzcVar.a.g(519);
        xg8Var.r = g;
        xg8Var.d.setPadding(g.a, g.b, g.c, g.d);
        xg8Var.c.requestLayout();
        return wzc.b;
    }

    public final void D(bh6 bh6Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        lh6 lh6Var = (lh6) this.b;
        boolean z5 = true;
        lh6Var.O = true;
        mh6 mh6Var = lh6Var.h0;
        mh6Var.K = false;
        mh6Var.B1(0, false);
        if (gm.L1()) {
            if (mh6Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            if (mh6Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 28 && mh6Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i >= 26 && mh6Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            jh6 jh6Var = lh6Var.a;
            if (jh6Var != null && "888".equals(jh6Var.getText())) {
                z = true;
                z2 = true;
                z3 = true;
                z4 = true;
            }
            if (mh6Var.w) {
                mh6Var.r.clear();
                if (!z) {
                    mh6Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z2) {
                    mh6Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z3) {
                    mh6Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z4 && i >= 26) {
                    mh6Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!mh6Var.r.isEmpty()) {
                    SharedPreferences d1 = oc7.d1();
                    if (!d1.getBoolean("firstlogin", true) && !mh6Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !mh6Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            mh6Var.getParentActivity().requestPermissions((String[]) mh6Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            fc4.g(e, true);
                            return;
                        }
                    }
                    d1.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mh6Var.getParentActivity());
                    alertDialog$Builder.j(jb6.M0(2131751708, "Continue"), null);
                    int i2 = 2131623958;
                    he heVar = alertDialog$Builder.a;
                    if (!z && (!z2 || !z3)) {
                        heVar.U = jb6.M0(2131754239, "AllowReadCallAndLog");
                    } else if (z2 && z3) {
                        heVar.U = jb6.M0(2131754240, "AllowReadCall");
                        i2 = 2131624067;
                    } else {
                        heVar.U = jb6.M0(2131754238, "AllowReadCallLog");
                    }
                    int i3 = cmb.K5;
                    alertDialog$Builder.l(i2, 46, cmb.w0(null, i3, false), null);
                    alertDialog$Builder.m(i3, null);
                    mh6Var.h = mh6Var.showDialog(heVar);
                    lh6Var.O = true;
                    return;
                }
            }
            z5 = true;
        }
        kh6 kh6Var = new kh6((byte) 0, this, bh6Var);
        int i4 = bh6.G;
        bh6Var.h.f(z5, z5);
        gm.d3(kh6Var, 400L);
    }

    @Override
    public final long E() {
        k9b k9bVar = ((z8b) this.b).W1;
        if (k9bVar != null) {
            return k9bVar.getCurrentPosition();
        }
        return 0L;
    }

    @Override
    public final boolean F() {
        switch (this.a) {
            case 8:
                if (gm.C3()) {
                    ((g95) this.b).c1().k(0L, 33, null, null, null, null);
                }
                return true;
            default:
                ((a58) this.b).I0();
                return true;
        }
    }

    @Override
    public final FrameLayout G() {
        return (z8b) this.b;
    }

    @Override
    public final void G1(View view, float f, float f2) {
        ej6 ej6Var = (ej6) this.b;
        ej6.n(view, f, f2);
        ej6Var.m(false, false, f);
        ej6Var.invalidate();
    }

    @Override
    public final void H(String str) {
        ((d88) this.b).m0(str);
    }

    @Override
    public final void I0(yh7 yh7Var) {
        xz7 xz7Var = (xz7) this.b;
        if (!TextUtils.isEmpty(yh7Var.b)) {
            xz7Var.Z[0].setText(yh7Var.b);
        }
        if (!TextUtils.isEmpty(yh7Var.d)) {
            xz7Var.Z[1].setText(yh7Var.d);
        }
        if (!TextUtils.isEmpty(yh7Var.c)) {
            xz7Var.Z[2].setText(yh7Var.c);
        }
        int i = yh7Var.n;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    xz7Var.x = "female";
                    xz7Var.Z[4].setText(jb6.M0(2131747302, null));
                }
            } else {
                xz7Var.x = "male";
                xz7Var.Z[4].setText(jb6.M0(2131747241, null));
            }
        }
        if (!TextUtils.isEmpty(yh7Var.m)) {
            String str = yh7Var.m;
            xz7Var.s = str;
            String str2 = (String) xz7Var.Z0.get(str);
            if (str2 != null) {
                xz7Var.Z[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(yh7Var.l)) {
            String str3 = yh7Var.l;
            xz7Var.w = str3;
            String str4 = (String) xz7Var.Z0.get(str3);
            if (str4 != null) {
                xz7Var.Z[6].setText(str4);
            }
        }
        int i2 = yh7Var.k;
        if (i2 > 0 && yh7Var.j > 0 && yh7Var.i > 0) {
            xz7Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i2), Integer.valueOf(yh7Var.j), Integer.valueOf(yh7Var.i)));
        }
    }

    @Override
    public final TextureView J() {
        return null;
    }

    @Override
    public final long K() {
        g6b g6bVar = ((z8b) this.b).b2;
        if (g6bVar == null) {
            return 0L;
        }
        return g6bVar.a0 * ((float) g6bVar.h0);
    }

    @Override
    public final void L(k47 k47Var) {
        lr8 lr8Var = ((ProfileActivity) this.b).n0;
        if (lr8Var != null && lr8Var.a) {
            lr8Var.L.e(true, 0.0f);
            lr8Var.invalidate();
        }
    }

    public final void M(uv6 uv6Var, zu6 zu6Var, ArrayList arrayList) {
        wz4 wz4Var = (wz4) this.b;
        if (uv6Var == wz4Var.y && zu6Var != null) {
            dw6 dw6Var = wz4Var.x.a;
            String d = zu6Var.d();
            ew6 ew6Var = new ew6(dw6Var, d, wz4Var.b(dw6Var, d), false);
            ew6Var.i(zu6Var);
            if (wz4Var.d != ew6Var) {
                wz4Var.h(wz4Var, ew6Var, wz4Var.y, 3, wz4Var.x, arrayList);
                wz4Var.x = null;
                wz4Var.y = null;
            }
        } else if (uv6Var == wz4Var.e) {
            if (zu6Var != null) {
                wz4Var.n(wz4Var.d, zu6Var);
            }
            wz4Var.d.n(arrayList);
        }
    }

    @Override
    public final long N() {
        g6b g6bVar = ((z8b) this.b).b2;
        if (g6bVar == null) {
            return 0L;
        }
        return g6bVar.Z * ((float) g6bVar.h0);
    }

    @Override
    public final void O(float f) {
        sa8 sa8Var = (sa8) this.b;
        m58.e(sa8Var.F1).k(String.valueOf(u11.a.indexOf(sa8Var.M0.getCurrentBrush())), f);
        oeb oebVar = sa8Var.A1;
        oebVar.c = f;
        sa8Var.u0(oebVar, null);
    }

    @Override
    public final void P(kd1 kd1Var) {
        ((z8b) this.b).a0(kd1Var);
    }

    public final void Q(String str, Bitmap bitmap) {
        qt qtVar = MediaMetadataCompat.d;
        if (qtVar.containsKey(str) && ((Integer) qtVar.get(str)).intValue() != 2) {
            u36.j(kt6.o("The ", str, " key cannot be used to put a Bitmap"));
        } else {
            ((Bundle) this.b).putParcelable(str, bitmap);
        }
    }

    @Override
    public final void R(long j) {
        h74 h74Var;
        k9b k9bVar = ((z8b) this.b).W1;
        if (k9bVar != null) {
            ndc ndcVar = k9bVar.e;
            if (ndcVar != null && ((h74Var = ndcVar.d) == null || !h74Var.c0())) {
                return;
            }
            k9bVar.m(j);
        }
    }

    @Override
    public final void S(w44 w44Var) {
        ((z8b) this.b).B0(w44Var);
    }

    public final void T(long j) {
        qt qtVar = MediaMetadataCompat.d;
        if (qtVar.containsKey("android.media.metadata.DURATION") && ((Integer) qtVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            u36.j("The android.media.metadata.DURATION key cannot be used to put a long");
        } else {
            ((Bundle) this.b).putLong("android.media.metadata.DURATION", j);
        }
    }

    public final void U(String str, String str2) {
        qt qtVar = MediaMetadataCompat.d;
        if (qtVar.containsKey(str) && ((Integer) qtVar.get(str)).intValue() != 1) {
            u36.j(kt6.o("The ", str, " key cannot be used to put a String"));
        } else {
            ((Bundle) this.b).putCharSequence(str, str2);
        }
    }

    public final void V(long j, int i, long j2) {
        tl6 tl6Var = (tl6) this.b;
        tl6Var.q0.getClass();
        if (i != 128) {
            if (i != 160) {
                if (i != 174) {
                    if (i != 187) {
                        if (i != 19899) {
                            if (i != 20533) {
                                if (i != 408125543) {
                                    if (i != 475249515) {
                                        if (i != 524531317) {
                                            if (i != 182) {
                                                if (i == 183 && !tl6Var.C) {
                                                    tl6Var.g(i);
                                                    tl6Var.I = -1;
                                                    tl6Var.J = -1L;
                                                    tl6Var.K = -1L;
                                                    return;
                                                }
                                                return;
                                            }
                                            ?? obj = new Object();
                                            obj.b = -9223372036854775807L;
                                            obj.c = -9223372036854775807L;
                                            tl6Var.A = obj;
                                            return;
                                        } else if (tl6Var.P != -1 && !tl6Var.S) {
                                            tl6Var.Q = true;
                                            return;
                                        } else {
                                            tl6Var.m();
                                            return;
                                        }
                                    } else if (!tl6Var.C) {
                                        tl6Var.G = true;
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                long j3 = tl6Var.u;
                                if (j3 != -1 && j3 != j) {
                                    throw bx7.a("Multiple Segment elements not supported", null);
                                }
                                tl6Var.u = j;
                                tl6Var.t = j2;
                                return;
                            }
                            tl6Var.h(i);
                            tl6Var.B.j = true;
                            return;
                        }
                        tl6Var.D = -1;
                        tl6Var.E = -1L;
                        return;
                    } else if (!tl6Var.C) {
                        tl6Var.g(i);
                        tl6Var.H = -9223372036854775807L;
                        return;
                    } else {
                        return;
                    }
                }
                ?? obj2 = new Object();
                obj2.o = -1;
                obj2.p = -1;
                obj2.q = -1;
                obj2.r = -1;
                obj2.s = -1;
                obj2.t = 0;
                obj2.u = -1;
                obj2.v = 0.0f;
                obj2.w = 0.0f;
                obj2.x = 0.0f;
                obj2.y = null;
                obj2.z = -1;
                obj2.A = -1;
                obj2.B = -1;
                obj2.C = -1;
                obj2.D = 1000;
                obj2.E = 200;
                obj2.F = -1.0f;
                obj2.G = -1.0f;
                obj2.H = -1.0f;
                obj2.I = -1.0f;
                obj2.J = -1.0f;
                obj2.K = -1.0f;
                obj2.L = -1.0f;
                obj2.M = -1.0f;
                obj2.N = -1.0f;
                obj2.O = -1.0f;
                obj2.Q = 1;
                obj2.R = -1;
                obj2.S = -1;
                obj2.T = 8000;
                obj2.U = 0L;
                obj2.V = 0L;
                obj2.X = false;
                obj2.b0 = true;
                obj2.c0 = "eng";
                tl6Var.B = obj2;
                obj2.a = tl6Var.y;
                return;
            }
            tl6Var.f0 = false;
            tl6Var.g0 = 0L;
            return;
        }
        tl6Var.k(i).h = null;
        tl6Var.k(i).i = null;
    }

    public final void W(int i, String str) {
        tl6 tl6Var = (tl6) this.b;
        if (i != 133) {
            if (i != 134) {
                if (i != 17026) {
                    if (i != 17276) {
                        if (i != 21358) {
                            if (i != 2274716) {
                                return;
                            }
                            tl6Var.h(i);
                            tl6Var.B.c0 = str;
                            return;
                        }
                        tl6Var.h(i);
                        tl6Var.B.b = str;
                        return;
                    }
                    tl6Var.k(i).i = str;
                    return;
                } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                    throw bx7.a("DocType " + str + " not supported", null);
                } else {
                    tl6Var.y = str.equals("webm");
                    return;
                }
            }
            tl6Var.h(i);
            tl6Var.B.c = str;
            return;
        }
        tl6Var.k(i).h = str;
    }

    @Override
    public final boolean X(String str, db1 db1Var) {
        return false;
    }

    @Override
    public final boolean a1(float f, float f2) {
        ej6 ej6Var = (ej6) this.b;
        View view = null;
        ej6Var.P = null;
        int childCount = ej6Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = ej6Var.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && f >= childAt.getLeft() && f <= childAt.getRight() && f2 >= childAt.getTop() && f2 <= childAt.getBottom()) {
                view = childAt;
                break;
            }
            childCount--;
        }
        if (view != null && !ej6Var.Q.contains(view)) {
            return true;
        }
        return false;
    }

    public final void b(int r23, int r24, defpackage.vb3 r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k44.b(int, int, vb3):void");
    }

    @Override
    public final boolean b2() {
        return true;
    }

    @Override
    public final boolean c1(View view, float f, float f2) {
        ej6 ej6Var = (ej6) this.b;
        ej6.n(view, f, f2);
        gm.r(ej6Var.I);
        ej6.k(ej6Var);
        ej6Var.m(true, false, f);
        ej6Var.invalidate();
        ej6Var.R.a(true, true);
        return true;
    }

    @Override
    public final boolean mo14d(float f, float f2, int i, View view) {
        ch4 ch4Var = (ch4) this.b;
        if (view instanceof ida) {
            ch4Var.f(((ida) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof lda) {
            ch4Var.f(((lda) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof eda) {
            ch4Var.f(((eda) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof lx2) {
            ch4Var.f(((lx2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof hg3) {
                if (!ch4Var.p0.u()) {
                    hg3 hg3Var = (hg3) view;
                    if (hg3Var.Z(f)) {
                        ch4Var.j0.w(hg3Var);
                        return true;
                    }
                }
                ch4Var.f(((hg3) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public final void e() {
        d88 d88Var = (d88) this.b;
        d88Var.a.c0();
        d88Var.b.c0();
    }

    @Override
    public final void f(float f) {
        ya8 ya8Var;
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        if (photoViewer.G2 == null && ((ya8Var = photoViewer.g0) == null || !ya8Var.y)) {
            return;
        }
        if (!photoViewer.G8 && photoViewer.W7.getVisibility() == 0) {
            f = ((photoViewer.X7.getRightProgress() - photoViewer.X7.getLeftProgress()) * f) + photoViewer.X7.getLeftProgress();
        }
        long z0 = photoViewer.z0();
        if (z0 == -9223372036854775807L) {
            photoViewer.a3 = f;
        } else {
            photoViewer.C1((int) (f * ((float) z0)));
        }
        photoViewer.l2(false);
        photoViewer.u3 = false;
    }

    @Override
    public final boolean f0() {
        return false;
    }

    @Override
    public final void g(wy2 wy2Var) {
        ml7 ml7Var = (ml7) this.b;
        ml7Var.x1 = true;
        String str = wy2Var.c;
        ml7Var.H1.setText(str);
        ml7Var.G0(str, wy2Var);
        ml7Var.x1 = false;
        gm.d3(new kl7(this, (byte) 0), 300L);
        ml7Var.J1.requestFocus();
        ll7 ll7Var = ml7Var.J1;
        ll7Var.setSelection(ll7Var.length());
    }

    @Override
    public final float get() {
        sa8 sa8Var = (sa8) this.b;
        u11 currentBrush = sa8Var.M0.getCurrentBrush();
        int i = sa8Var.F1;
        if (currentBrush == null) {
            return m58.e(i).i;
        }
        return m58.e(i).f(String.valueOf(u11.a.indexOf(currentBrush)), currentBrush.c());
    }

    @Override
    public final CharSequence getContentDescription() {
        return " ";
    }

    @Override
    public final long getLongPressDuration() {
        return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
    }

    @Override
    public final void h(float f) {
        ka8 ka8Var;
        ka8 ka8Var2;
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        ya8 ya8Var = photoViewer.g0;
        if (ya8Var != null && ya8Var.y && (ka8Var2 = photoViewer.s3) != null) {
            int i = photoViewer.q3.h - vdc.S;
            ka8Var2.O = ya8Var;
            if (ka8Var2.a0 != 0) {
                ka8Var2.a0 = 0L;
                ka8Var2.g0 = null;
                ka8Var2.f0 = null;
                ka8Var2.e0 = null;
                ka8Var2.b(-1);
            }
            if (i != 0) {
                ka8Var2.r = i;
                int i2 = ((int) (i * f)) / 5;
                if (ka8Var2.n != i2) {
                    ka8Var2.n = i2;
                }
            }
            String g0 = gm.g0((int) ((ya8Var.getVideoDuration() * f) / 1000), false, false);
            ka8Var2.E = g0;
            ka8Var2.F = (int) Math.ceil(ka8Var2.G.measureText(g0));
            ka8Var2.invalidate();
            if (ka8Var2.f != null) {
                Utilities.e.a(ka8Var2.f);
            }
            double videoDuration = (f * ya8Var.getVideoDuration()) / 1000.0d;
            ka8Var2.P = videoDuration;
            String b = ya8Var.b((int) videoDuration);
            if (b != null) {
                ka8Var2.R.e0(b, null, null, null, 0L);
            }
        } else if (photoViewer.G2 != null && (ka8Var = photoViewer.s3) != null) {
            ka8Var.e(photoViewer.S4, f, photoViewer.q3.h - vdc.S);
        }
        ((PhotoViewer) this.b).l2(true);
        ((PhotoViewer) this.b).R2();
    }

    @Override
    public final void h2() {
        int i;
        int i2;
        w78 w78Var = (w78) this.b;
        a8 a8Var = w78Var.R;
        if (w78Var.Z) {
            i = 2131745080;
        } else {
            i = 2131745079;
        }
        a8Var.setText(jb6.M0(i, null));
        a8 a8Var2 = w78Var.R;
        if (w78Var.Z) {
            i2 = 2131232225;
        } else {
            i2 = 2131232214;
        }
        a8Var2.setIcon(i2);
    }

    @Override
    public final void i() {
        ((ch4) this.b).j0.finish();
    }

    @Override
    public final void invalidate() {
        ((tl4) this.b).m.invalidate();
    }

    @Override
    public final void j(View view, float f, float f2) {
        ej6 ej6Var = (ej6) this.b;
        ej6.n(view, f, f2);
        ej6Var.m(false, true, f);
        gm.d3(ej6Var.I, 450L);
        View view2 = ej6Var.P;
        if (view2 != null) {
            view2.performClick();
        }
        ej6Var.P = null;
        ej6Var.invalidate();
        ej6Var.R.a(false, true);
    }

    @Override
    public final int j0() {
        return 0;
    }

    @Override
    public final void k(float f) {
        ((ch4) this.b).j0.j(f);
    }

    @Override
    public final void m(ArrayList arrayList) {
        ((wn5) this.b).e(arrayList, false);
    }

    @Override
    public final void n(boolean z, float f) {
        String a0;
        k86 k86Var = (k86) this.b;
        m86 m86Var = k86Var.E;
        int round = Math.round(f * 100.0f);
        if (round != e86.c()) {
            e86.g = pqe.b(round, 0, 100);
            e86.k();
            e86.d(false);
            m86Var.d0();
            ArrayList arrayList = m86Var.s;
            if (arrayList.isEmpty()) {
                m86Var.c0();
            } else if (arrayList.size() >= 2) {
                if (e86.c() <= 0) {
                    a0 = jb6.M0(2131748628, null);
                } else if (e86.c() >= 100) {
                    a0 = jb6.M0(2131748627, null);
                } else {
                    a0 = jb6.a0(null, null, 2131748629, String.format("%d%%", Integer.valueOf(e86.c())));
                }
                arrayList.set(1, new g86(2, 0, 0, 0, a0));
                m86Var.d.g(1);
            }
            if (round <= 0 || round >= 100) {
                try {
                    k86Var.performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override
    public final void o(boolean z) {
        k9b k9bVar = ((z8b) this.b).W1;
        if (k9bVar != null) {
            k9bVar.x(-8713, z);
        }
    }

    @Override
    public final void onFirstFrameRendered() {
        ym6 ym6Var = (ym6) this.b;
        Surface surface = ym6Var.v1;
        if (surface != null) {
            ym6Var.c1.p(surface);
            ym6Var.y1 = true;
        }
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        cl8 cl8Var = (cl8) this.b;
        ndc ndcVar = cl8Var.y;
        if (ndcVar == null) {
            return;
        }
        boolean c0 = ndcVar.c0();
        bl8 bl8Var = cl8Var.N;
        if (c0) {
            gm.c3(bl8Var);
        } else {
            gm.r(bl8Var);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        ao9 ao9Var = ((cl8) this.b).x;
        if (ao9Var != null) {
            float f2 = i / i2;
            if (Math.abs(ao9Var.A0 - f2) >= 1.0E-4f) {
                ao9Var.A0 = f2;
                ao9Var.requestLayout();
            }
        }
    }

    @Override
    public final void p(k47 k47Var) {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        profileActivity.a.J0(true);
        wp8 wp8Var = profileActivity.O;
        if (wp8Var != null && wp8Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().J0(true);
        }
        profileActivity.d1.setBackgroundColor(on2.f(0.1f, profileActivity.Z1(profileActivity.e5.f), cmb.v0(cmb.Z6, profileActivity.A0)));
    }

    @Override
    public final FrameLayout q() {
        return ((z8b) this.b).C1;
    }

    @Override
    public final void r(View view, float f, float f2) {
        ej6 ej6Var = (ej6) this.b;
        ej6.n(view, f, f2);
        ej6Var.m(false, true, f);
        gm.d3(ej6Var.I, 450L);
        ej6Var.P = null;
        ej6Var.invalidate();
        ej6Var.R.a(false, true);
    }

    @Override
    public final void s() {
        byte b = this.a;
    }

    @Override
    public final ylb t() {
        return ((z8b) this.b).w1;
    }

    @Override
    public final void t0() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            ((wn5) this.b).a.startActivityForResult(intent, 14);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final kd1 u() {
        z8b z8bVar = (z8b) this.b;
        z8bVar.f2 = true;
        return z8bVar.e0();
    }

    @Override
    public final void w() {
        ym6 ym6Var = (ym6) this.b;
        if (ym6Var.v1 != null) {
            ym6Var.Y0(0, 1);
        }
    }

    @Override
    public final void y() {
        l74 l74Var = ((ym6) this.b).Y;
        if (l74Var != null) {
            l74Var.a();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    private final void c() {
    }

    private final void z() {
    }

    @Override
    public final void onDismiss() {
    }

    @Override
    public final void q0() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void a(jec jecVar) {
    }

    @Override
    public final void onRenderedFirstFrame(tk tkVar) {
    }

    @Override
    public final void onSeekFinished(tk tkVar) {
    }

    @Override
    public final void onSeekStarted(tk tkVar) {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public final void v(String str) {
    }

    public k44(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public k44(MediaMetadataCompat mediaMetadataCompat) {
        this.a = (byte) 17;
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.b = bundle;
        mx6.D(bundle);
    }

    @Override
    public final void I(float f, float f2) {
    }

    @Override
    public final void l(float f, float f2) {
    }

    @Override
    public final void onError(ndc ndcVar, Exception exc) {
    }
}
