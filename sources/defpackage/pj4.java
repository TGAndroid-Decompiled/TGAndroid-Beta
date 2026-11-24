package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class pj4 implements qac, rh5, jaa, f48, lt8, yt7, zu9, gi2, fcc, gs3, px2, xb1, ca1, o7, t58, sbc, al0, i8b {
    public final byte a;
    public Object b;

    public pj4(String str, Charset charset) {
        int i;
        int i2;
        this.a = (byte) 17;
        fs3 fs3Var = new fs3(str, charset);
        CharsetEncoder[] charsetEncoderArr = fs3Var.a;
        int i3 = 0;
        int i4 = -1;
        if (charsetEncoderArr.length == 1) {
            this.b = new int[str.length()];
            while (i3 < ((int[]) this.b).length) {
                char charAt = str.charAt(i3);
                int[] iArr = (int[]) this.b;
                if (charAt == 65535) {
                    charAt = 1000;
                }
                iArr[i3] = charAt;
                i3++;
            }
            return;
        }
        int length = str.length();
        vd7[][] vd7VarArr = (vd7[][]) Array.newInstance(vd7.class, length + 1, charsetEncoderArr.length);
        s(str, fs3Var, vd7VarArr, 0, null);
        for (int i5 = 1; i5 <= length; i5++) {
            for (int i6 = 0; i6 < charsetEncoderArr.length; i6++) {
                vd7 vd7Var = vd7VarArr[i5][i6];
                if (vd7Var != null && i5 < length) {
                    s(str, fs3Var, vd7VarArr, i5, vd7Var);
                }
            }
            for (int i7 = 0; i7 < charsetEncoderArr.length; i7++) {
                vd7VarArr[i5 - 1][i7] = null;
            }
        }
        int i8 = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < charsetEncoderArr.length; i9++) {
            vd7 vd7Var2 = vd7VarArr[length][i9];
            if (vd7Var2 != null && (i2 = vd7Var2.d) < i8) {
                i4 = i9;
                i8 = i2;
            }
        }
        if (i4 >= 0) {
            ArrayList arrayList = new ArrayList();
            vd7 vd7Var3 = vd7VarArr[length][i4];
            while (vd7Var3 != null) {
                vd7 vd7Var4 = vd7Var3.c;
                int i10 = vd7Var3.b;
                char c = vd7Var3.a;
                if (c == 1000) {
                    arrayList.add(0, 1000);
                } else {
                    byte[] bytes = String.valueOf(c).getBytes(charsetEncoderArr[i10].charset());
                    for (int length2 = bytes.length - 1; length2 >= 0; length2--) {
                        arrayList.add(0, Integer.valueOf(bytes[length2] & 255));
                    }
                }
                if (vd7Var4 == null) {
                    i = 0;
                } else {
                    i = vd7Var4.b;
                }
                if (i != i10) {
                    arrayList.add(0, Integer.valueOf(ak1.a(charsetEncoderArr[i10].charset()).a[0] + 256));
                }
                vd7Var3 = vd7Var4;
            }
            int size = arrayList.size();
            int[] iArr2 = new int[size];
            while (i3 < size) {
                iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
                i3++;
            }
            this.b = iArr2;
            return;
        }
        sc8.j(tb4.y("Failed to encode \"", str, "\""));
        throw null;
    }

    public static void s(String str, fs3 fs3Var, vd7[][] vd7VarArr, int i, vd7 vd7Var) {
        char charAt = str.charAt(i);
        CharsetEncoder[] charsetEncoderArr = fs3Var.a;
        int length = charsetEncoderArr.length;
        int i2 = fs3Var.b;
        if (i2 >= 0 && (charAt == 65535 || charsetEncoderArr[i2].canEncode(String.valueOf(charAt)))) {
            length = i2 + 1;
        } else {
            i2 = 0;
        }
        while (i2 < length) {
            if (charAt == 65535 || charsetEncoderArr[i2].canEncode(String.valueOf(charAt))) {
                vd7 vd7Var2 = new vd7(charAt, fs3Var, i2, vd7Var);
                vd7[] vd7VarArr2 = vd7VarArr[i + 1];
                vd7 vd7Var3 = vd7VarArr2[i2];
                if (vd7Var3 == null || vd7Var3.d > vd7Var2.d) {
                    vd7VarArr2[i2] = vd7Var2;
                }
            }
            i2++;
        }
    }

    public final void B(int r23, int r24, defpackage.ja3 r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj4.B(int, int, ja3):void");
    }

    @Override
    public final FrameLayout D() {
        return (x6b) this.b;
    }

    @Override
    public final void E(String str) {
        ((b68) this.b).l0(str);
    }

    @Override
    public final long F() {
        f4b f4bVar = ((x6b) this.b).b2;
        if (f4bVar == null) {
            return 0L;
        }
        return f4bVar.a0 * ((float) f4bVar.h0);
    }

    @Override
    public final void H() {
        switch (this.a) {
            case 5:
                if (gl.D3()) {
                    ((h75) this.b).c1().k(0L, 33, null, null, null, null);
                    return;
                }
                return;
            default:
                ((y28) this.b).I0();
                return;
        }
    }

    @Override
    public final boolean H0(float f, float f2) {
        ch6 ch6Var = (ch6) this.b;
        View view = null;
        ch6Var.P = null;
        int childCount = ch6Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = ch6Var.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && f >= childAt.getLeft() && f <= childAt.getRight() && f2 >= childAt.getTop() && f2 <= childAt.getBottom()) {
                view = childAt;
                break;
            }
            childCount--;
        }
        if (view != null && !ch6Var.Q.contains(view)) {
            return true;
        }
        return false;
    }

    @Override
    public final long I() {
        f4b f4bVar = ((x6b) this.b).b2;
        if (f4bVar == null) {
            return 0L;
        }
        return f4bVar.Z * ((float) f4bVar.h0);
    }

    @Override
    public final void J(cc1 cc1Var) {
        ((x6b) this.b).a0(cc1Var);
    }

    @Override
    public final boolean K0(View view, float f, float f2) {
        ch6 ch6Var = (ch6) this.b;
        ch6.n(view, f, f2);
        gl.r(ch6Var.I);
        ch6.k(ch6Var);
        ch6Var.m(true, false, f);
        ch6Var.invalidate();
        ch6Var.R.a(true, true);
        return true;
    }

    @Override
    public final int L() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        nl0 nl0Var = profileActivity.M5;
        return bm2.f(profileActivity.e2(), 553648127, nl0Var.a(nl0Var.c));
    }

    @Override
    public final void M(float f) {
        q88 q88Var = (q88) this.b;
        k38.e(q88Var.F1).k(String.valueOf(m01.a.indexOf(q88Var.M0.getCurrentBrush())), f);
        mcb mcbVar = q88Var.A1;
        mcbVar.c = f;
        q88Var.u0(mcbVar, null);
    }

    @Override
    public final void N() {
        int i;
        int i2;
        u58 u58Var = (u58) this.b;
        a8 a8Var = u58Var.R;
        if (u58Var.Z) {
            i = 2131745154;
        } else {
            i = 2131745153;
        }
        a8Var.setText(k96.M0(i, null));
        a8 a8Var2 = u58Var.R;
        if (u58Var.Z) {
            i2 = 2131232224;
        } else {
            i2 = 2131232213;
        }
        a8Var2.setIcon(i2);
    }

    @Override
    public final void O(long j) {
        y54 y54Var;
        i7b i7bVar = ((x6b) this.b).W1;
        if (i7bVar != null) {
            lbc lbcVar = i7bVar.e;
            if (lbcVar != null && ((y54Var = lbcVar.d) == null || !y54Var.c0())) {
                return;
            }
            i7bVar.m(j);
        }
    }

    @Override
    public final void Q(l34 l34Var) {
        ((x6b) this.b).B0(l34Var);
    }

    @Override
    public final void Q1(vf7 vf7Var) {
        vx7 vx7Var = (vx7) this.b;
        if (!TextUtils.isEmpty(vf7Var.b)) {
            vx7Var.Z[0].setText(vf7Var.b);
        }
        if (!TextUtils.isEmpty(vf7Var.d)) {
            vx7Var.Z[1].setText(vf7Var.d);
        }
        if (!TextUtils.isEmpty(vf7Var.c)) {
            vx7Var.Z[2].setText(vf7Var.c);
        }
        int i = vf7Var.n;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    vx7Var.x = "female";
                    vx7Var.Z[4].setText(k96.M0(2131747376, null));
                }
            } else {
                vx7Var.x = "male";
                vx7Var.Z[4].setText(k96.M0(2131747315, null));
            }
        }
        if (!TextUtils.isEmpty(vf7Var.m)) {
            String str = vf7Var.m;
            vx7Var.s = str;
            String str2 = (String) vx7Var.Z0.get(str);
            if (str2 != null) {
                vx7Var.Z[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(vf7Var.l)) {
            String str3 = vf7Var.l;
            vx7Var.w = str3;
            String str4 = (String) vx7Var.Z0.get(str3);
            if (str4 != null) {
                vx7Var.Z[6].setText(str4);
            }
        }
        int i2 = vf7Var.k;
        if (i2 > 0 && vf7Var.j > 0 && vf7Var.i > 0) {
            vx7Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i2), Integer.valueOf(vf7Var.j), Integer.valueOf(vf7Var.i)));
        }
    }

    public final void R(int i, long j) {
        qj6 qj6Var = (qj6) this.b;
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
                                                                        qj6Var.h(i);
                                                                        qj6Var.B.f = -1;
                                                                        return;
                                                                    }
                                                                    qj6Var.h(i);
                                                                    qj6Var.B.f = 5;
                                                                    return;
                                                                }
                                                                qj6Var.h(i);
                                                                qj6Var.B.f = 3;
                                                                return;
                                                            }
                                                            qj6Var.h(i);
                                                            qj6Var.B.f = 1;
                                                            return;
                                                        }
                                                        qj6Var.h(i);
                                                        qj6Var.B.f = 2;
                                                        return;
                                                    case 152:
                                                        mj6 k = qj6Var.k(i);
                                                        if (j == 1) {
                                                            z = true;
                                                        }
                                                        k.d = z;
                                                        return;
                                                    case 155:
                                                        qj6Var.X = qj6Var.p(j);
                                                        return;
                                                    case 159:
                                                        qj6Var.h(i);
                                                        qj6Var.B.Q = (int) j;
                                                        return;
                                                    case 176:
                                                        qj6Var.h(i);
                                                        qj6Var.B.o = (int) j;
                                                        return;
                                                    case 179:
                                                        if (!qj6Var.C) {
                                                            qj6Var.g(i);
                                                            qj6Var.H = qj6Var.p(j);
                                                            return;
                                                        }
                                                        return;
                                                    case 186:
                                                        qj6Var.h(i);
                                                        qj6Var.B.p = (int) j;
                                                        return;
                                                    case 215:
                                                        qj6Var.h(i);
                                                        qj6Var.B.d = (int) j;
                                                        return;
                                                    case 231:
                                                        qj6Var.T = qj6Var.p(j);
                                                        return;
                                                    case 238:
                                                        qj6Var.e0 = (int) j;
                                                        return;
                                                    case 247:
                                                        if (!qj6Var.C) {
                                                            qj6Var.g(i);
                                                            qj6Var.I = (int) j;
                                                            return;
                                                        }
                                                        return;
                                                    case 251:
                                                        qj6Var.f0 = true;
                                                        return;
                                                    case 16871:
                                                        qj6Var.h(i);
                                                        qj6Var.B.i = (int) j;
                                                        return;
                                                    case 16980:
                                                        if (j != 3) {
                                                            throw av7.a("ContentCompAlgo " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 17029:
                                                        if (j < 1 || j > 2) {
                                                            throw av7.a("DocTypeReadVersion " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 17143:
                                                        if (j != 1) {
                                                            throw av7.a("EBMLReadVersion " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 18401:
                                                        if (j != 5) {
                                                            throw av7.a("ContentEncAlgo " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 18408:
                                                        if (j != 1) {
                                                            throw av7.a("AESSettingsCipherMode " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 21420:
                                                        qj6Var.E = j + qj6Var.u;
                                                        return;
                                                    case 21432:
                                                        int i3 = (int) j;
                                                        qj6Var.h(i);
                                                        if (i3 != 0) {
                                                            if (i3 != 1) {
                                                                if (i3 != 3) {
                                                                    if (i3 == 15) {
                                                                        qj6Var.B.z = 3;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                qj6Var.B.z = 1;
                                                                return;
                                                            }
                                                            qj6Var.B.z = 2;
                                                            return;
                                                        }
                                                        qj6Var.B.z = 0;
                                                        return;
                                                    case 21680:
                                                        qj6Var.h(i);
                                                        qj6Var.B.r = (int) j;
                                                        return;
                                                    case 21682:
                                                        qj6Var.h(i);
                                                        qj6Var.B.t = (int) j;
                                                        return;
                                                    case 21690:
                                                        qj6Var.h(i);
                                                        qj6Var.B.s = (int) j;
                                                        return;
                                                    case 21930:
                                                        qj6Var.h(i);
                                                        pj6 pj6Var = qj6Var.B;
                                                        if (j == 1) {
                                                            z = true;
                                                        }
                                                        pj6Var.a0 = z;
                                                        return;
                                                    case 21938:
                                                        qj6Var.h(i);
                                                        qj6Var.B.q = (int) j;
                                                        return;
                                                    case 21998:
                                                        qj6Var.h(i);
                                                        qj6Var.B.h = (int) j;
                                                        return;
                                                    case 22186:
                                                        qj6Var.h(i);
                                                        qj6Var.B.U = j;
                                                        return;
                                                    case 22203:
                                                        qj6Var.h(i);
                                                        qj6Var.B.V = j;
                                                        return;
                                                    case 25188:
                                                        qj6Var.h(i);
                                                        qj6Var.B.R = (int) j;
                                                        return;
                                                    case 30114:
                                                        qj6Var.g0 = j;
                                                        return;
                                                    case 30321:
                                                        qj6Var.h(i);
                                                        int i4 = (int) j;
                                                        if (i4 != 0) {
                                                            if (i4 != 1) {
                                                                if (i4 != 2) {
                                                                    if (i4 == 3) {
                                                                        qj6Var.B.u = 3;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                qj6Var.B.u = 2;
                                                                return;
                                                            }
                                                            qj6Var.B.u = 1;
                                                            return;
                                                        }
                                                        qj6Var.B.u = 0;
                                                        return;
                                                    case 2352003:
                                                        qj6Var.h(i);
                                                        qj6Var.B.g = (int) j;
                                                        return;
                                                    case 2807729:
                                                        qj6Var.v = j;
                                                        return;
                                                    default:
                                                        switch (i) {
                                                            case 21945:
                                                                qj6Var.h(i);
                                                                int i5 = (int) j;
                                                                if (i5 != 1) {
                                                                    if (i5 == 2) {
                                                                        qj6Var.B.C = 1;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                qj6Var.B.C = 2;
                                                                return;
                                                            case 21946:
                                                                qj6Var.h(i);
                                                                int g = hl2.g((int) j);
                                                                if (g != -1) {
                                                                    qj6Var.B.B = g;
                                                                    return;
                                                                }
                                                                return;
                                                            case 21947:
                                                                qj6Var.h(i);
                                                                int f = hl2.f((int) j);
                                                                if (f != -1) {
                                                                    qj6Var.B.A = f;
                                                                    return;
                                                                }
                                                                return;
                                                            case 21948:
                                                                qj6Var.h(i);
                                                                qj6Var.B.D = (int) j;
                                                                return;
                                                            case 21949:
                                                                qj6Var.h(i);
                                                                qj6Var.B.E = (int) j;
                                                                return;
                                                            default:
                                                                return;
                                                        }
                                                }
                                            }
                                            qj6Var.h(i);
                                            qj6Var.B.e = j;
                                            return;
                                        }
                                        qj6Var.k(i).a = j;
                                        return;
                                    } else if (j != 1) {
                                        throw av7.a("ContentEncodingScope " + j + " not supported", null);
                                    } else {
                                        return;
                                    }
                                } else if (j != 0) {
                                    throw av7.a("ContentEncodingOrder " + j + " not supported", null);
                                } else {
                                    return;
                                }
                            } else if (!qj6Var.C) {
                                qj6Var.g(i);
                                if (qj6Var.J == -1) {
                                    qj6Var.J = j;
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (!qj6Var.C) {
                            qj6Var.g(i);
                            if (qj6Var.K == -1) {
                                qj6Var.K = j;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                    qj6Var.k(i).c = j;
                    return;
                }
                qj6Var.k(i).b = j;
                return;
            }
            qj6Var.k(i).e = j;
            return;
        }
        qj6Var.h(i);
        pj6 pj6Var2 = qj6Var.B;
        if (j == 1) {
            z = true;
        }
        pj6Var2.b0 = z;
    }

    public final void S() {
        ((dn4) this.b).d.R();
    }

    @Override
    public final boolean T() {
        return false;
    }

    public final void U(af6 af6Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        lf6 lf6Var = (lf6) this.b;
        boolean z5 = true;
        lf6Var.O = true;
        mf6 mf6Var = lf6Var.h0;
        mf6Var.K = false;
        mf6Var.A1(0, false);
        if (gl.L1()) {
            if (mf6Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            if (mf6Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 28 && mf6Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i >= 26 && mf6Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if6 if6Var = lf6Var.a;
            if (if6Var != null && "888".equals(if6Var.getText())) {
                z = true;
                z2 = true;
                z3 = true;
                z4 = true;
            }
            if (mf6Var.w) {
                mf6Var.r.clear();
                if (!z) {
                    mf6Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z2) {
                    mf6Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z3) {
                    mf6Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z4 && i >= 26) {
                    mf6Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!mf6Var.r.isEmpty()) {
                    SharedPreferences c1 = na7.c1();
                    if (!c1.getBoolean("firstlogin", true) && !mf6Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !mf6Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            mf6Var.getParentActivity().requestPermissions((String[]) mf6Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            return;
                        }
                    }
                    c1.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mf6Var.getParentActivity());
                    alertDialog$Builder.j(k96.M0(2131751759, "Continue"), null);
                    int i2 = 2131623958;
                    hd hdVar = alertDialog$Builder.a;
                    if (!z && (!z2 || !z3)) {
                        hdVar.U = k96.M0(2131754271, "AllowReadCallAndLog");
                    } else if (z2 && z3) {
                        hdVar.U = k96.M0(2131754272, "AllowReadCall");
                        i2 = 2131624067;
                    } else {
                        hdVar.U = k96.M0(2131754270, "AllowReadCallLog");
                    }
                    int i3 = bkb.K5;
                    alertDialog$Builder.l(i2, 46, bkb.w0(null, i3, false), null);
                    alertDialog$Builder.m(i3, null);
                    mf6Var.h = mf6Var.showDialog(hdVar);
                    lf6Var.O = true;
                    return;
                }
            }
            z5 = true;
        }
        kf6 kf6Var = new kf6((byte) 0, this, af6Var);
        int i4 = af6.G;
        af6Var.h.f(z5, z5);
        gl.e3(kf6Var, 400L);
    }

    @Override
    public final float U0() {
        return 0.0f;
    }

    public final void V(ut6 ut6Var, zs6 zs6Var, ArrayList arrayList) {
        ux4 ux4Var = (ux4) this.b;
        if (ut6Var == ux4Var.y && zs6Var != null) {
            du6 du6Var = ux4Var.x.a;
            String d = zs6Var.d();
            eu6 eu6Var = new eu6(du6Var, d, ux4Var.b(du6Var, d), false);
            eu6Var.i(zs6Var);
            if (ux4Var.d != eu6Var) {
                ux4Var.h(ux4Var, eu6Var, ux4Var.y, 3, ux4Var.x, arrayList);
                ux4Var.x = null;
                ux4Var.y = null;
            }
        } else if (ut6Var == ux4Var.e) {
            if (zs6Var != null) {
                ux4Var.n(ux4Var.d, zs6Var);
            }
            ux4Var.d.n(arrayList);
        }
    }

    public final void W(String str, Bitmap bitmap) {
        ps psVar = MediaMetadataCompat.d;
        if (psVar.containsKey(str) && ((Integer) psVar.get(str)).intValue() != 2) {
            w26.j(tb4.y("The ", str, " key cannot be used to put a Bitmap"));
        } else {
            ((Bundle) this.b).putParcelable(str, bitmap);
        }
    }

    @Override
    public final boolean W0(String str, u91 u91Var) {
        return false;
    }

    public final void X(long j) {
        ps psVar = MediaMetadataCompat.d;
        if (psVar.containsKey("android.media.metadata.DURATION") && ((Integer) psVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            w26.j("The android.media.metadata.DURATION key cannot be used to put a long");
        } else {
            ((Bundle) this.b).putLong("android.media.metadata.DURATION", j);
        }
    }

    public final void Y(String str, String str2) {
        ps psVar = MediaMetadataCompat.d;
        if (psVar.containsKey(str) && ((Integer) psVar.get(str)).intValue() != 1) {
            w26.j(tb4.y("The ", str, " key cannot be used to put a String"));
        } else {
            ((Bundle) this.b).putCharSequence(str, str2);
        }
    }

    public final void Z(long j, int i, long j2) {
        qj6 qj6Var = (qj6) this.b;
        qj6Var.q0.getClass();
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
                                                if (i == 183 && !qj6Var.C) {
                                                    qj6Var.g(i);
                                                    qj6Var.I = -1;
                                                    qj6Var.J = -1L;
                                                    qj6Var.K = -1L;
                                                    return;
                                                }
                                                return;
                                            }
                                            ?? obj = new Object();
                                            obj.b = -9223372036854775807L;
                                            obj.c = -9223372036854775807L;
                                            qj6Var.A = obj;
                                            return;
                                        } else if (qj6Var.P != -1 && !qj6Var.S) {
                                            qj6Var.Q = true;
                                            return;
                                        } else {
                                            qj6Var.m();
                                            return;
                                        }
                                    } else if (!qj6Var.C) {
                                        qj6Var.G = true;
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                long j3 = qj6Var.u;
                                if (j3 != -1 && j3 != j) {
                                    throw av7.a("Multiple Segment elements not supported", null);
                                }
                                qj6Var.u = j;
                                qj6Var.t = j2;
                                return;
                            }
                            qj6Var.h(i);
                            qj6Var.B.j = true;
                            return;
                        }
                        qj6Var.D = -1;
                        qj6Var.E = -1L;
                        return;
                    } else if (!qj6Var.C) {
                        qj6Var.g(i);
                        qj6Var.H = -9223372036854775807L;
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
                qj6Var.B = obj2;
                obj2.a = qj6Var.y;
                return;
            }
            qj6Var.f0 = false;
            qj6Var.g0 = 0L;
            return;
        }
        qj6Var.k(i).h = null;
        qj6Var.k(i).i = null;
    }

    @Override
    public final String Z0() {
        return null;
    }

    @Override
    public final int a0() {
        return 0;
    }

    @Override
    public final int a1() {
        return 0;
    }

    @Override
    public final int b(int i) {
        int[] iArr = (int[]) this.b;
        if (i >= 0 && i < iArr.length) {
            if (c(i)) {
                return iArr[i] - 256;
            }
            w26.j(tb4.n(i, "value at ", " is not an ECI but a character"));
            return 0;
        }
        k93.i(String.valueOf(i));
        return 0;
    }

    public final void b0(int i, String str) {
        qj6 qj6Var = (qj6) this.b;
        if (i != 133) {
            if (i != 134) {
                if (i != 17026) {
                    if (i != 17276) {
                        if (i != 21358) {
                            if (i != 2274716) {
                                return;
                            }
                            qj6Var.h(i);
                            qj6Var.B.c0 = str;
                            return;
                        }
                        qj6Var.h(i);
                        qj6Var.B.b = str;
                        return;
                    }
                    qj6Var.k(i).i = str;
                    return;
                } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                    throw av7.a("DocType " + str + " not supported", null);
                } else {
                    qj6Var.y = str.equals("webm");
                    return;
                }
            }
            qj6Var.h(i);
            qj6Var.B.c = str;
            return;
        }
        qj6Var.k(i).h = str;
    }

    @Override
    public final boolean c(int i) {
        if (i >= 0) {
            int[] iArr = (int[]) this.b;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 > 255 && i2 <= 999) {
                    return true;
                }
                return false;
            }
        }
        k93.i(String.valueOf(i));
        return false;
    }

    @Override
    public final char charAt(int i) {
        int[] iArr = (int[]) this.b;
        if (i >= 0 && i < iArr.length) {
            if (!c(i)) {
                if (i >= 0 && i < iArr.length) {
                    int i2 = iArr[i];
                    if (i2 == 1000) {
                        return (char) 65535;
                    }
                    return (char) i2;
                }
                k93.i(String.valueOf(i));
                return (char) 0;
            }
            w26.j(tb4.n(i, "value at ", " is not a character but an ECI"));
            return (char) 0;
        }
        k93.i(String.valueOf(i));
        return (char) 0;
    }

    @Override
    public final void d() {
        b68 b68Var = (b68) this.b;
        b68Var.a.b0();
        b68Var.b.b0();
    }

    @Override
    public final int d1() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        nl0 nl0Var = profileActivity.M5;
        return bkb.p1(profileActivity.e2(), nl0Var.a(nl0Var.b));
    }

    @Override
    public final void e(ArrayList arrayList) {
        ((wl5) this.b).e(arrayList, false);
    }

    @Override
    public final void e1(long j, int i, g28 g28Var) {
        int i2 = ProfileStoriesView.t0;
        ((an8) this.b).f(true, false);
        g28Var.run();
    }

    @Override
    public final void f(float f) {
        x88 x88Var;
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        if (photoViewer.G2 == null && ((x88Var = photoViewer.g0) == null || !x88Var.y)) {
            return;
        }
        if (!photoViewer.H8 && photoViewer.X7.getVisibility() == 0) {
            f = ((photoViewer.Y7.getRightProgress() - photoViewer.Y7.getLeftProgress()) * f) + photoViewer.Y7.getLeftProgress();
        }
        long z0 = photoViewer.z0();
        if (z0 == -9223372036854775807L) {
            photoViewer.a3 = f;
        } else {
            photoViewer.B1((int) (f * ((float) z0)));
        }
        photoViewer.k2(false);
        photoViewer.u3 = false;
    }

    @Override
    public final void f1(View view, float f, float f2) {
        ch6 ch6Var = (ch6) this.b;
        ch6.n(view, f, f2);
        ch6Var.m(false, false, f);
        ch6Var.invalidate();
    }

    @Override
    public final void g(View view, float f, float f2) {
        ch6 ch6Var = (ch6) this.b;
        ch6.n(view, f, f2);
        ch6Var.m(false, true, f);
        gl.e3(ch6Var.I, 450L);
        View view2 = ch6Var.P;
        if (view2 != null) {
            view2.performClick();
        }
        ch6Var.P = null;
        ch6Var.invalidate();
        ch6Var.R.a(false, true);
    }

    @Override
    public final float get() {
        q88 q88Var = (q88) this.b;
        m01 currentBrush = q88Var.M0.getCurrentBrush();
        int i = q88Var.F1;
        if (currentBrush == null) {
            return k38.e(i).i;
        }
        return k38.e(i).f(String.valueOf(m01.a.indexOf(currentBrush)), currentBrush.c());
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
        h88 h88Var;
        h88 h88Var2;
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        x88 x88Var = photoViewer.g0;
        if (x88Var != null && x88Var.y && (h88Var2 = photoViewer.s3) != null) {
            int i = photoViewer.q3.h - tbc.S;
            h88Var2.O = x88Var;
            if (h88Var2.a0 != 0) {
                h88Var2.a0 = 0L;
                h88Var2.g0 = null;
                h88Var2.f0 = null;
                h88Var2.e0 = null;
                h88Var2.b(-1);
            }
            if (i != 0) {
                h88Var2.r = i;
                int i2 = ((int) (i * f)) / 5;
                if (h88Var2.n != i2) {
                    h88Var2.n = i2;
                }
            }
            String g0 = gl.g0((int) ((x88Var.getVideoDuration() * f) / 1000), false, false);
            h88Var2.E = g0;
            h88Var2.F = (int) Math.ceil(h88Var2.G.measureText(g0));
            h88Var2.invalidate();
            if (h88Var2.f != null) {
                Utilities.e.a(h88Var2.f);
            }
            double videoDuration = (f * x88Var.getVideoDuration()) / 1000.0d;
            h88Var2.P = videoDuration;
            String b = x88Var.b((int) videoDuration);
            if (b != null) {
                h88Var2.R.e0(b, null, null, null, 0L);
            }
        } else if (photoViewer.G2 != null && (h88Var = photoViewer.s3) != null) {
            h88Var.e(photoViewer.T4, f, photoViewer.q3.h - tbc.S);
        }
        ((PhotoViewer) this.b).k2(true);
        ((PhotoViewer) this.b).Q2();
    }

    @Override
    public final void invalidate() {
        ((sj4) this.b).m.invalidate();
    }

    @Override
    public final void j(boolean z, float f) {
        String a0;
        k66 k66Var = (k66) this.b;
        m66 m66Var = k66Var.E;
        int round = Math.round(f * 100.0f);
        if (round != e66.c()) {
            e66.g = moe.b(round, 0, 100);
            e66.k();
            e66.d(false);
            m66Var.c0();
            ArrayList arrayList = m66Var.s;
            if (arrayList.isEmpty()) {
                m66Var.b0();
            } else if (arrayList.size() >= 2) {
                if (e66.c() <= 0) {
                    a0 = k96.M0(2131748679, null);
                } else if (e66.c() >= 100) {
                    a0 = k96.M0(2131748678, null);
                } else {
                    a0 = k96.a0(null, null, 2131748680, String.format("%d%%", Integer.valueOf(e66.c())));
                }
                arrayList.set(1, new g66(2, 0, 0, 0, a0));
                m66Var.d.g(1);
            }
            if (round <= 0 || round >= 100) {
                try {
                    k66Var.performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override
    public final int j0() {
        return 0;
    }

    @Override
    public final void l(boolean z) {
        i7b i7bVar = ((x6b) this.b).W1;
        if (i7bVar != null) {
            i7bVar.x(-8713, z);
        }
    }

    @Override
    public final int length() {
        return ((int[]) this.b).length;
    }

    @Override
    public final FrameLayout m() {
        return ((x6b) this.b).C1;
    }

    @Override
    public final int m0() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        nl0 nl0Var = profileActivity.M5;
        return bm2.f(profileActivity.e2(), 352321535, nl0Var.a(nl0Var.d));
    }

    @Override
    public final void n(View view, float f, float f2) {
        ch6 ch6Var = (ch6) this.b;
        ch6.n(view, f, f2);
        ch6Var.m(false, true, f);
        gl.e3(ch6Var.I, 450L);
        ch6Var.P = null;
        ch6Var.invalidate();
        ch6Var.R.a(false, true);
    }

    @Override
    public final wjb o() {
        return ((x6b) this.b).w1;
    }

    @Override
    public final void onFirstFrameRendered() {
        vk6 vk6Var = (vk6) this.b;
        Surface surface = vk6Var.v1;
        if (surface != null) {
            vk6Var.c1.p(surface);
            vk6Var.y1 = true;
        }
    }

    @Override
    public final cc1 p() {
        x6b x6bVar = (x6b) this.b;
        x6bVar.f2 = true;
        return x6bVar.e0();
    }

    @Override
    public final float p0() {
        return -1.0f;
    }

    @Override
    public final void q() {
        vk6 vk6Var = (vk6) this.b;
        if (vk6Var.v1 != null) {
            vk6Var.Y0(0, 1);
        }
    }

    @Override
    public final void r() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            ((wl5) this.b).a.startActivityForResult(intent, 14);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final float s0() {
        return -1.0f;
    }

    @Override
    public final boolean s1() {
        return true;
    }

    @Override
    public final CharSequence subSequence(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= ((int[]) this.b).length) {
            StringBuilder sb = new StringBuilder();
            while (i < i2) {
                if (!c(i)) {
                    sb.append(charAt(i));
                    i++;
                } else {
                    w26.j(tb4.n(i, "value at ", " is not a character but an ECI"));
                    return null;
                }
            }
            return sb;
        }
        k93.i(String.valueOf(i));
        return null;
    }

    @Override
    public final cc1 t() {
        st7 st7Var = ((x6b) this.b).H0;
        for (int i = 0; i < st7Var.getChildCount(); i++) {
            if (st7Var.getChildAt(i) instanceof cc1) {
                return (cc1) st7Var.getChildAt(i);
            }
        }
        return null;
    }

    @Override
    public final int t1() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        nl0 nl0Var = profileActivity.M5;
        return bkb.p1(profileActivity.e2(), nl0Var.a(nl0Var.e));
    }

    public final String toString() {
        switch (this.a) {
            case 17:
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < ((int[]) this.b).length; i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    if (c(i)) {
                        sb.append("ECI(");
                        sb.append(b(i));
                        sb.append(')');
                    } else if (charAt(i) < 128) {
                        sb.append('\'');
                        sb.append(charAt(i));
                        sb.append('\'');
                    } else {
                        sb.append((int) charAt(i));
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public final void u() {
        c64 c64Var = ((vk6) this.b).Y;
        if (c64Var != null) {
            c64Var.a();
        }
    }

    @Override
    public final long v() {
        i7b i7bVar = ((x6b) this.b).W1;
        if (i7bVar != null) {
            return i7bVar.getCurrentPosition();
        }
        return 0L;
    }

    @Override
    public final boolean w(long j, int i, int i2, int i3, j8b j8bVar) {
        ImageReceiver imageReceiver;
        zr8 zr8Var;
        zr8 zr8Var2;
        zr8 zr8Var3;
        zr8 zr8Var4;
        j8bVar.b = null;
        j8bVar.c = null;
        an8 an8Var = (an8) this.b;
        xm8 xm8Var = an8Var.h;
        ArrayList arrayList = an8Var.x;
        if (an8Var.O < 0.2f) {
            j8bVar.b = xm8Var.getImageReceiver();
            j8bVar.c = null;
            j8bVar.a = xm8Var;
            j8bVar.h = 0.0f;
            j8bVar.i = gl.q.y;
            j8bVar.g = (View) an8Var.getParent();
            j8bVar.d = an8Var.E;
            j8bVar.n = true;
            return true;
        }
        int i4 = 0;
        while (true) {
            if (i4 < arrayList.size()) {
                zr8 zr8Var5 = (zr8) arrayList.get(i4);
                if (zr8Var5.e >= 1.0f && zr8Var5.a == i2) {
                    int i5 = i4 - 1;
                    if (i5 >= 0) {
                        zr8Var3 = (zr8) arrayList.get(i5);
                    } else {
                        zr8Var3 = null;
                    }
                    int i6 = i4 - 2;
                    if (i6 >= 0) {
                        zr8Var4 = (zr8) arrayList.get(i6);
                    } else {
                        zr8Var4 = null;
                    }
                    zr8 d = ProfileStoriesView.d(zr8Var3, zr8Var4, zr8Var5);
                    imageReceiver = zr8Var5.b;
                    zr8Var2 = d;
                    zr8Var = zr8Var5;
                } else {
                    i4++;
                }
            } else {
                imageReceiver = null;
                zr8Var = null;
                zr8Var2 = null;
                break;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        j8bVar.c = imageReceiver;
        j8bVar.b = null;
        j8bVar.a = an8Var;
        j8bVar.h = 0.0f;
        j8bVar.i = gl.q.y;
        j8bVar.g = (View) an8Var.getParent();
        if (zr8Var != null && zr8Var2 != null) {
            j8bVar.f = new kh(this, new RectF(zr8Var.m), zr8Var, new RectF(zr8Var2.m), zr8Var2);
            return true;
        }
        j8bVar.f = null;
        return true;
    }

    @Override
    public final void x() {
        byte b = this.a;
    }

    @Override
    public final void y(mx2 mx2Var) {
        jj7 jj7Var = (jj7) this.b;
        jj7Var.x1 = true;
        String str = mx2Var.c;
        jj7Var.H1.setText(str);
        jj7Var.G0(str, mx2Var);
        jj7Var.x1 = false;
        gl.e3(new vl6(this, (byte) 23), 300L);
        jj7Var.J1.requestFocus();
        ij7 ij7Var = jj7Var.J1;
        ij7Var.setSelection(ij7Var.length());
    }

    private final void C() {
    }

    private final void P() {
    }

    @Override
    public final void A() {
    }

    @Override
    public final void g0() {
    }

    @Override
    public final void o0() {
    }

    @Override
    public final void onDismiss() {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void G(String str) {
    }

    @Override
    public final void a(icc iccVar) {
    }

    @Override
    public final void i(boolean z) {
    }

    @Override
    public final void K(float f, float f2) {
    }

    @Override
    public final void k(float f, float f2) {
    }

    @Override
    public final Object mo9get() {
        return this.b;
    }

    public pj4(byte b) {
        this.a = b;
        switch (b) {
            case 4:
                return;
            case 15:
                this.b = new Bundle();
                return;
            default:
                this.b = new np4(5, 1.0f, false, (byte) 0);
                return;
        }
    }

    public pj4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public pj4(MediaMetadataCompat mediaMetadataCompat) {
        this.a = (byte) 15;
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.b = bundle;
        mv6.B(bundle);
    }
}
