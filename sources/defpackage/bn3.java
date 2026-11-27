package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a;
import org.telegram.ui.Components.d;
import org.telegram.ui.Dictation.DictationAsr;
public final class bn3 implements bo3 {
    public static final k43 J0 = new k43(0.3d, 0.0d, 0.2d, 1.0d);
    public static final String[] K0 = {"tinylid: no verdict yet"};
    public ValueAnimator B0;
    public ho3 F;
    public rt1 F0;
    public co3 G;
    public float G0;
    public dm3 H;
    public ValueAnimator H0;
    public int I;
    public String J;
    public String L;
    public boolean M;
    public int O;
    public boolean P;
    public float Q;
    public float R;
    public long S;
    public float U;
    public long V;
    public long W;
    public long X;
    public boolean Y;
    public mm Z;
    public sn3 a;
    public long b;
    public z92 b0;
    public float c;
    public float c0;
    public boolean d;
    public ValueAnimator d0;
    public mm e;
    public final d f;
    public boolean g0;
    public final Context h;
    public float[] i0;
    public float[] j0;
    public int k0;
    public String m0;
    public final vnb n;
    public int o0;
    public boolean p0;
    public long q0;
    public long r0;
    public en3 s;
    public long s0;
    public rn3 w;
    public LinearGradient x0;
    public boolean y0;
    public float z0;
    public byte r = 0;
    public final gn3 x = new gn3();
    public final RectF y = new RectF();
    public final int[] E = new int[2];
    public cm3 K = dm3.c;
    public String N = "";
    public long T = -100000;
    public final RectF a0 = new RectF();
    public int e0 = -6440822;
    public final da3 f0 = new da3((byte) 19);
    public final c7 h0 = new c7(this, (byte) 17);
    public final vm3 l0 = new vm3(this, (byte) 6);
    public final vm3 n0 = new vm3(this, (byte) 7);
    public final p1 t0 = new p1(this, (byte) 21);
    public final vm3 u0 = new vm3(this, (byte) 8);
    public final vm3 v0 = new vm3(this, (byte) 9);
    public final vm3 w0 = new vm3(this, (byte) 10);
    public final Matrix A0 = new Matrix();
    public final int[] C0 = new int[2];
    public final int[] D0 = new int[2];
    public final float[] E0 = new float[2];
    public final lr I0 = new lr(this, (byte) 2);

    public bn3(Context context, d dVar) {
        this.h = context;
        this.f = dVar;
        this.n = dVar.a.K4;
    }

    public static java.lang.String C(java.lang.String r3, java.lang.String r4, java.util.Locale r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn3.C(java.lang.String, java.lang.String, java.util.Locale):java.lang.String");
    }

    public static void K(TLRPC.TL_error tL_error) {
        d31 Y = d31.Y();
        if (Y == null) {
            return;
        }
        if (tL_error != null) {
            if (!"AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) && !"SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text)) {
                Y.g0(tL_error, false);
                return;
            } else {
                Y.I(2131624211, ob6.M0(2131754986, null), hl.S2(ob6.M0(2131754987, null))).j();
                return;
            }
        }
        Log.d("Dictation", "style request failed (no error from the server)");
    }

    public static String L(String str) {
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        nm3 N = DictationAsr.N(language);
        if (N != null && N.d(language).length >= 2) {
            return R(DictationAsr.i0(N, language));
        }
        return t(str);
    }

    public static String R(String str) {
        String S = S(str);
        if (S == null) {
            return t(str);
        }
        return t(str) + " (" + S + ")";
    }

    public static String S(String str) {
        String str2;
        String[] split = str.split("-");
        if (split.length < 2) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Language");
        for (String str3 : split) {
            sb.append(g(str3));
        }
        String K02 = ob6.K0(sb.toString());
        if (!TextUtils.isEmpty(K02)) {
            return K02;
        }
        Locale locale = ob6.D0().y;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        boolean z = true;
        for (int i = 1; i < split.length; i++) {
            if (split[i].matches("[A-Za-z]{4}")) {
                str2 = C(split[0], split[i], locale);
            } else {
                if (split[i].matches("[A-Za-z]{2}|[0-9]{3}")) {
                    str2 = new Locale.Builder().setRegion(split[i]).build().getDisplayCountry(locale);
                }
                str2 = null;
            }
            z = (TextUtils.isEmpty(str2) || str2.equalsIgnoreCase(split[i])) ? false : false;
            if (i > 1) {
                sb2.append(", ");
                sb3.append(", ");
            }
            if (str2 != null && !str2.isEmpty()) {
                sb2.append(str2.substring(0, 1).toUpperCase(locale));
                sb2.append(str2.substring(1));
            }
            sb3.append(g(split[i]));
        }
        if (z) {
            return sb2.toString();
        }
        return sb3.toString();
    }

    public static String g(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb.append(substring.toUpperCase(locale));
        sb.append(str.substring(1).toLowerCase(locale));
        return sb.toString();
    }

    public static String[] j(String[] strArr, float[] fArr, int i) {
        String format;
        if (strArr != null && fArr != null && strArr.length == fArr.length) {
            int length = fArr.length;
            Integer[] numArr = new Integer[length];
            for (int i2 = 0; i2 < length; i2++) {
                numArr[i2] = Integer.valueOf(i2);
            }
            Arrays.sort(numArr, new gm3(fArr, (byte) 1));
            int min = Math.min(5, length);
            String[] strArr2 = new String[min + 1];
            StringBuilder sb = new StringBuilder("tinylid: ");
            if (i < 1000) {
                format = bp1.n(i, " ms");
            } else {
                format = String.format(Locale.US, "%.1f s", Float.valueOf(i / 1000.0f));
            }
            strArr2[0] = c00.k(sb, format, " of speech");
            int i3 = 0;
            while (i3 < min) {
                int i4 = i3 + 1;
                strArr2[i4] = String.format(Locale.US, "%-6s %5.1f%%", strArr[numArr[i3].intValue()], Float.valueOf(fArr[numArr[i3].intValue()] * 100.0f));
                i3 = i4;
            }
            return strArr2;
        }
        return K0;
    }

    public static String t(String str) {
        String str2;
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        Locale locale = ob6.D0().y;
        if (locale != null) {
            str2 = new Locale(language).getDisplayLanguage(locale);
        } else {
            str2 = null;
        }
        if (str2 != null && !str2.isEmpty() && !str2.equalsIgnoreCase(language)) {
            return str2.substring(0, 1).toUpperCase(locale) + str2.substring(1);
        }
        String L0 = r3c.L0(language);
        if (L0 != null) {
            return L0;
        }
        return language;
    }

    public static int x(int i, int i2, boolean z) {
        int i3;
        int i4 = i | (-16777216);
        int i5 = i2 | (-16777216);
        int i6 = i4;
        for (int i7 = 1; i7 <= 20 && vm2.g(i6, i5) < 4.5d; i7++) {
            if (z) {
                i3 = -1;
            } else {
                i3 = -16777216;
            }
            i6 = vm2.f(i7 * 0.04f, i4, i3);
        }
        return i6;
    }

    public final String A(String str) {
        String str2;
        String str3 = "";
        if (str == null) {
            str = "";
        }
        this.N = str;
        if (this.O <= 0) {
            return str;
        }
        int length = str.length();
        int i = this.O;
        if (length <= i) {
            str2 = "";
        } else {
            str2 = str.substring(i);
        }
        int i2 = 0;
        while (i2 < str2.length() && Character.isWhitespace(str2.charAt(i2))) {
            i2++;
        }
        String substring = str2.substring(i2);
        if (substring.isEmpty()) {
            return "";
        }
        if (this.P) {
            str3 = " ";
        }
        return str3.concat(substring);
    }

    public final String B() {
        Editable text = this.f.a.F0.getText();
        if (text == null) {
            return "";
        }
        return text.subSequence(Math.min(this.I, text.length()), text.length()).toString();
    }

    public final void D(String str) {
        co3 co3Var;
        DictationAsr.b0(str);
        DictationAsr.t(DictationAsr.N(str));
        this.w.setLanguage(L(str));
        if (this.r == 1 && (co3Var = this.G) != null) {
            co3Var.j(str);
        }
    }

    public final void E() {
        Log.d("Dictation", "send from listening (" + z() + " chars)");
        co3 co3Var = this.G;
        if (co3Var != null) {
            co3Var.c();
        }
        this.G = null;
        hl.r(this.t0);
        this.F.a();
        this.s.setStopIsland(false);
        d dVar = this.f;
        dVar.d(null);
        G(false);
        this.Q = 0.0f;
        this.w.setIsland(false);
        this.w.setSettings(false);
        this.w.setStopMode(false);
        H();
        F(false);
        J(0);
        this.c0 = 0.0f;
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        dVar.e(0.0f);
        this.s.e();
        dVar.b();
        dVar.a.E1();
    }

    public final void F(boolean z) {
        tx1 tx1Var = this.f.a.F0;
        if (tx1Var != null && z && tx1Var != null) {
            tx1Var.invalidate();
        }
    }

    public final void G(boolean z) {
        if (z) {
            this.b = 0L;
        }
        this.Y = z;
        z92 z92Var = this.b0;
        if (z92Var != null) {
            z92Var.invalidate();
        }
    }

    public final void H() {
        wq1 wq1Var;
        rt1 rt1Var;
        zu1 zu1Var = this.f.a.E3;
        if (zu1Var != null) {
            wq1Var = zu1Var.A0;
        } else {
            wq1Var = null;
        }
        if (wq1Var == null || (rt1Var = this.F0) == null) {
            return;
        }
        if (rt1Var != wq1Var) {
            lr lrVar = this.I0;
            if (rt1Var != null) {
                rt1Var.s0(lrVar);
            }
            this.F0 = wq1Var;
            wq1Var.i(lrVar);
        }
        ValueAnimator valueAnimator = this.H0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G0, 0.0f);
        this.H0 = ofFloat;
        ofFloat.addUpdateListener(new tm3(this, (byte) 2));
        this.H0.addListener(new cn2(this, (byte) 13));
        this.H0.setDuration(300L);
        this.H0.setInterpolator(k43.h);
        this.H0.start();
    }

    public final void I(float f, float f2) {
        en3 en3Var = this.s;
        if (en3Var != null && (en3Var.a1 != f || en3Var.Z0 != f2)) {
            en3Var.a1 = f;
            en3Var.Z0 = f2;
            en3Var.invalidate();
        }
        rn3 rn3Var = this.w;
        if (rn3Var != null) {
            if (rn3Var.m0 != f || rn3Var.l0 != f2) {
                rn3Var.m0 = f;
                rn3Var.l0 = f2;
                rn3Var.invalidate();
            }
        }
    }

    public final void J(int i) {
        this.r = i;
        tx1 tx1Var = this.f.a.F0;
        if (tx1Var != null) {
            tx1Var.o1 = s();
        }
    }

    public final void M(boolean z) {
        int length;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        boolean z4;
        long j;
        dm3 dm3Var;
        byte b = this.r;
        if (b != 1 && b != 2) {
            this.p0 = z;
            if (b == 4 && (dm3Var = this.H) != null) {
                dm3Var.b();
            }
            n();
            ValueAnimator valueAnimator = this.B0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            String[] strArr = null;
            this.B0 = null;
            d dVar = this.f;
            ChatActivityEnterView chatActivityEnterView = dVar.a;
            chatActivityEnterView.A1 = 0.0f;
            chatActivityEnterView.x2();
            Editable text = dVar.a.F0.getText();
            byte b2 = this.r;
            if (b2 == 3 || b2 == 4) {
                this.w.a();
                this.w.setIsland(false);
                this.w.setRevert(false);
                this.w.setSettings(false);
                H();
                ho3 ho3Var = this.F;
                if (ho3Var != null) {
                    ho3Var.f(false);
                }
            }
            this.J = null;
            this.K = dm3.c;
            if (text == null) {
                length = 0;
            } else {
                length = text.length();
            }
            if (length > 0 && !Character.isWhitespace(text.charAt(length - 1))) {
                this.M = true;
                text.append(' ');
                this.M = false;
                length++;
            }
            this.I = length;
            this.N = "";
            this.O = 0;
            this.P = false;
            J(1);
            dVar.b();
            this.V = SystemClock.uptimeMillis();
            hl.r(this.l0);
            vm3 vm3Var = this.n0;
            DictationAsr.V(vm3Var);
            DictationAsr.i(vm3Var);
            Q(true);
            if (!z) {
                b(1.0f, 220L, k43.h);
            }
            hl.r(this.u0);
            en3 en3Var = this.s;
            float[] fArr = this.i0;
            int i = this.o0;
            en3Var.getClass();
            if (fArr != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            en3Var.R = z2;
            if (z2) {
                en3Var.S = fArr[0] - en3Var.getLeft();
                en3Var.T = fArr[1] - en3Var.getTop();
                en3Var.U.setColor(i);
            }
            en3 en3Var2 = this.s;
            float[] fArr2 = this.j0;
            int i2 = this.k0;
            int[] iArr = en3Var2.o0;
            if (fArr2 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            en3Var2.A0 = z3;
            if (z3) {
                en3Var2.getLocationInWindow(iArr);
                en3Var2.B0 = fArr2[0] - iArr[0];
                en3Var2.C0 = fArr2[1] - iArr[1];
                en3Var2.D0 = fArr2[2];
                en3Var2.E0 = i2;
                en3Var2.F0 = 0L;
                Drawable drawable = en3Var2.J0;
                if (drawable == null) {
                    drawable = en3Var2.getResources().getDrawable(2131231511).mutate();
                    en3Var2.J0 = drawable;
                }
                drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            if (this.j0 == null) {
                str = "null";
            } else {
                str = ((int) this.j0[0]) + "," + ((int) this.j0[1]) + " r" + ((int) this.j0[2]);
            }
            Log.d("Dictation", "commit morph from circle ".concat(str));
            this.j0 = null;
            this.i0 = null;
            if (!z) {
                this.s.setShown(true);
                this.s.setRightMode(0);
            }
            this.x.f();
            G(true);
            F(true);
            if (!z) {
                this.s.setStopIsland(true);
            }
            String e0 = DictationAsr.e0();
            rn3 rn3Var = this.w;
            if (e0 != null) {
                str2 = L(e0);
            } else {
                str2 = null;
            }
            rn3Var.setLanguage(str2);
            rn3 rn3Var2 = this.w;
            if (DictationAsr.E()) {
                strArr = K0;
            }
            rn3Var2.setDetected(strArr);
            this.w.setSettings(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.s0 = uptimeMillis;
            this.r0 = uptimeMillis;
            this.V = uptimeMillis;
            this.q0 = 0L;
            if (!z) {
                hl.d3(this.t0, 300L);
            }
            if (uc7.e1().getInt("design_dictation_mode", 1) == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            ChatActivityEnterView chatActivityEnterView2 = dVar.a;
            this.G = new co3(this.h, chatActivityEnterView2.R, chatActivityEnterView2.F3, z4, this);
            Log.d("Dictation", "start simulated=" + z4);
            co3 co3Var = this.G;
            co3Var.h();
            wd3 wd3Var = new wd3(this, co3Var, (byte) 18);
            if (!z4 && !z) {
                j = 420;
            } else {
                j = 120;
            }
            hl.d3(wd3Var, j);
        }
    }

    public final ArrayList N() {
        n();
        ArrayList arrayList = new ArrayList();
        arrayList.add(dm3.c);
        arrayList.addAll(this.H.c());
        return arrayList;
    }

    public final void O() {
        Editable text = this.f.a.F0.getText();
        if (text != null && text.length() > 0 && text.length() == this.I && Character.isWhitespace(text.charAt(text.length() - 1))) {
            this.M = true;
            text.delete(text.length() - 1, text.length());
            this.M = false;
        }
    }

    public final void P() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        Drawable backgroundImage;
        if (!this.g0) {
            this.g0 = true;
            ArrayList arrayList = hn3.g;
            da3 da3Var = this.f0;
            if (!arrayList.contains(da3Var)) {
                arrayList.add(da3Var);
            }
        }
        try {
            wma wmaVar = this.f.a.b2;
            if (wmaVar != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && (backgroundImage = wmaVar.getBackgroundImage()) != null) {
                Bitmap createBitmap = Bitmap.createBitmap(8, 8, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Rect rect = new Rect(backgroundImage.getBounds());
                backgroundImage.setBounds(0, 0, 8, 8);
                backgroundImage.draw(canvas);
                backgroundImage.setBounds(rect);
                long j = 0;
                long j2 = 0;
                long j3 = 0;
                for (int i6 = 0; i6 < 8; i6++) {
                    for (int i7 = 0; i7 < 8; i7++) {
                        int pixel = createBitmap.getPixel(i7, i6);
                        j += Color.red(pixel);
                        j2 += Color.green(pixel);
                        j3 += Color.blue(pixel);
                    }
                }
                createBitmap.recycle();
                this.e0 = Color.rgb((int) (j / 64), (int) (j2 / 64), (int) (j3 / 64));
            }
        } catch (Throwable unused) {
        }
        int i8 = aob.d6;
        vnb vnbVar = this.n;
        int v0 = aob.v0(i8, vnbVar);
        boolean c = gn3.c(v0);
        gn3 gn3Var = this.x;
        if (gn3Var.h != c) {
            gn3Var.h = c;
        }
        int i9 = aob.Pe;
        gn3.h(aob.v0(i9, vnbVar));
        gn3Var.g(this.e0, aob.v0(i9, vnbVar));
        int[] iArr = gn3Var.B;
        int i10 = iArr[0];
        int i11 = iArr[1];
        if (dz4.e != i10 || dz4.f != i11) {
            dz4.e = i10;
            dz4.f = i11;
            Arrays.fill(dz4.g[0], (Object) null);
        }
        if (this.s != null) {
            int v02 = aob.v0(i9, vnbVar) | (-16777216);
            en3 en3Var = this.s;
            int f = vm2.f(0.1f, v02, iArr[6]);
            int i12 = iArr[4];
            en3Var.e1 = v02;
            en3Var.f1 = f;
            en3Var.g1 = i12;
            if (!en3Var.p0) {
                en3Var.q0 = v02;
                en3Var.r0 = f;
                en3Var.s0 = null;
                en3Var.invalidate();
            }
            this.s.setDayIconBase(aob.v0(aob.Nl, vnbVar));
        }
        this.x0 = null;
        z92 z92Var = this.b0;
        if (z92Var != null) {
            z92Var.invalidate();
        }
        en3 en3Var2 = this.s;
        if (en3Var2 != null) {
            int i13 = aob.Nl;
            int v03 = aob.v0(i13, vnbVar);
            int v04 = aob.v0(i9, vnbVar);
            en3Var2.d.setColor(v03);
            en3Var2.e.setColor(v04);
            en3Var2.f.setColor(v04);
            en3Var2.invalidate();
            en3 en3Var3 = this.s;
            int v05 = aob.v0(i13, vnbVar);
            Paint paint = en3Var3.d0;
            Paint paint2 = en3Var3.c0;
            en3Var3.p0 = c;
            if (c) {
                i = gn3.e(-13665281);
            } else {
                i = en3Var3.e1;
            }
            en3Var3.q0 = i;
            if (c) {
                i2 = gn3.e(-7447553);
            } else {
                i2 = en3Var3.f1;
            }
            en3Var3.r0 = i2;
            en3Var3.s0 = null;
            Paint paint3 = en3Var3.b0;
            if (c) {
                i3 = 1714435648;
            } else {
                i3 = -1493172225;
            }
            paint3.setColor(i3);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(hl.N(0.66f));
            if (c) {
                i4 = 654311423;
            } else {
                i4 = 436207616;
            }
            paint2.setColor(i4);
            paint.setColor(16777216);
            float N = hl.N(1.0f);
            float N2 = hl.N(0.33333334f);
            if (c) {
                i5 = 1711276032;
            } else {
                i5 = 855638016;
            }
            paint.setShadowLayer(N, 0.0f, N2, i5);
            en3Var3.e0.setColor(v05);
            en3Var3.invalidate();
            this.s.setSendIconColor(aob.v0(aob.Tf, vnbVar));
        }
        ho3 ho3Var = this.F;
        if (ho3Var != null) {
            ho3Var.c(x(aob.v0(i9, vnbVar), v0, c), aob.v0(aob.Le, vnbVar), c);
        }
        rn3 rn3Var = this.w;
        if (rn3Var != null) {
            rn3Var.f();
        }
    }

    public final void Q(boolean z) {
        long[] jArr;
        String concat;
        if (!DictationAsr.L(new long[2])) {
            concat = null;
        } else {
            concat = " ".concat(ob6.a0(null, null, 2131744982, Long.valueOf(Math.round(jArr[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(jArr[1] / 1048576.0d)))));
        }
        if (z || !TextUtils.equals(concat, this.m0)) {
            this.m0 = concat;
            d dVar = this.f;
            if (concat == null) {
                dVar.d(ob6.M0(2131744967, null));
                return;
            }
            String M0 = ob6.M0(2131744981, null);
            ChatActivityEnterView chatActivityEnterView = dVar.a;
            chatActivityEnterView.W1("", true);
            tx1 tx1Var = chatActivityEnterView.F0;
            if (tx1Var != null) {
                CharSequence concat2 = TextUtils.concat(M0, concat);
                rx rxVar = tx1Var.n1;
                if (rxVar == null) {
                    if (!TextUtils.isEmpty(concat2)) {
                        rxVar = new rx(tx1Var);
                        tx1Var.n1 = rxVar;
                    } else {
                        return;
                    }
                }
                rxVar.i(concat2, true);
            }
        }
    }

    @Override
    public final void a(String str, String str2) {
        if (!s()) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            String A = A(str);
            if (this.O <= 0 || !A.isEmpty()) {
                this.M = true;
                this.F.e(this.I, -1, A);
                this.M = false;
            }
        }
        ho3 ho3Var = this.F;
        Editable editableText = ho3Var.a.getEditableText();
        if (editableText != null) {
            ho3Var.d(editableText, editableText.length());
        }
        d dVar = this.f;
        tx1 tx1Var = dVar.a.F0;
        InputMethodManager inputMethodManager = (InputMethodManager) this.h.getSystemService("input_method");
        if (inputMethodManager != null && tx1Var != null) {
            inputMethodManager.restartInput(tx1Var);
        }
        this.G = null;
        if (str2 != null) {
            Log.d("Dictation", "stopped with error: ".concat(str2));
        }
        if (z() <= 0 && (this.O <= 0 || dVar.a.F0.getText().toString().trim().length() <= 0)) {
            m();
            O();
            this.w.setIsland(false);
            this.w.setSettings(false);
            this.w.setStopMode(false);
            H();
            J(0);
            dVar.b();
            return;
        }
        J(3);
        dVar.b();
        this.I = 0;
        this.s.setCancelShown(false);
        if (!this.p0) {
            k();
        }
        this.s.setHandOff(true);
        this.s.setRightMode(2);
        dVar.d(null);
        G(false);
        this.Q = 0.0f;
        hl.d3(this.u0, 460L);
        this.w.setStopMode(false);
        this.w.e(ob6.M0(2131744979, null), false);
        tx1 tx1Var2 = dVar.a.F0;
        tx1Var2.setSelection(tx1Var2.length());
        if (!this.p0) {
            tx1Var2.requestFocus();
            hl.d3(new zg3(tx1Var2, (byte) 16), 120L);
        }
        hl.d3(new vm3(this, (byte) 0), 90L);
    }

    public final void b(float f, long j, k43 k43Var) {
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c0, f);
        this.d0 = ofFloat;
        ofFloat.addUpdateListener(new tm3(this, (byte) 1));
        this.d0.setDuration(j);
        this.d0.setInterpolator(k43Var);
        this.d0.start();
    }

    public final void c(cm3 cm3Var) {
        boolean z;
        String a0;
        if (this.r == 3) {
            if (this.I > this.f.a.F0.length()) {
                this.I = 0;
            }
            String str = this.J;
            if (str != null) {
                z = true;
            } else {
                str = B();
                this.J = str;
                z = false;
            }
            if (TextUtils.isEmpty(str.trim())) {
                if (!z) {
                    this.J = null;
                    return;
                }
                return;
            }
            J(4);
            this.b = 0L;
            this.W = SystemClock.uptimeMillis();
            rn3 rn3Var = this.w;
            if (cm3Var.d) {
                a0 = ob6.M0(2131744978, null);
            } else {
                a0 = ob6.a0(null, null, 2131744991, cm3Var.a());
            }
            rn3Var.e(a0, true);
            this.F.a();
            this.F.f(true);
            this.x.f();
            en3 en3Var = this.s;
            if (en3Var != null) {
                en3Var.R0 = SystemClock.uptimeMillis();
                en3Var.setVisibility(0);
                en3Var.y = true;
                en3Var.E = false;
                en3Var.R = false;
                en3Var.A0 = false;
                en3Var.L0 = false;
                en3Var.l0 = false;
                en3Var.l1 = false;
                en3Var.F.e(true, 1.0f);
                en3Var.G.e(true, 0.0f);
                en3Var.H.e(true, 0.0f);
                en3Var.I.e(true, 0.0f);
                en3Var.J.e(true, 1.0f);
                en3Var.O0.e(true, 0.0f);
                en3Var.b1 = 0L;
                en3Var.N0.e(true, 1.0f);
                en3Var.L = 3;
                en3Var.invalidate();
            }
            z92 z92Var = this.b0;
            if (z92Var != null) {
                z92Var.invalidate();
            }
            cm3 cm3Var2 = this.K;
            this.K = cm3Var;
            this.H.a(cm3Var, str, new ag(this, cm3Var2, z, cm3Var, (byte) 4));
        }
    }

    @Override
    public final void d(String[] strArr, float[] fArr, int i) {
        rn3 rn3Var = this.w;
        if (rn3Var != null) {
            rn3Var.setDetected(j(strArr, fArr, i));
        }
    }

    @Override
    public final void e(float f) {
        ChatActivityEnterView chatActivityEnterView;
        ChatActivityEnterView.RecordCircle recordCircle;
        this.Q = f;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (f > 0.38f) {
            long j = this.q0;
            if (j == 0) {
                this.q0 = uptimeMillis;
                j = uptimeMillis;
            }
            if (uptimeMillis - j >= 150) {
                this.V = uptimeMillis;
            }
        } else {
            this.q0 = 0L;
        }
        en3 en3Var = this.s;
        if (en3Var != null) {
            en3Var.setLevel(f);
        }
        if (this.p0 && (recordCircle = (chatActivityEnterView = this.f.a).C2) != null && chatActivityEnterView.u3) {
            recordCircle.setAmplitude(f * 1800.0f);
        }
    }

    @Override
    public final void f(String str) {
        h(-1, str);
    }

    @Override
    public final void h(int i, String str) {
        int max;
        if (!s()) {
            return;
        }
        this.r0 = SystemClock.uptimeMillis();
        if (str == null) {
            str = "";
        }
        String A = A(str);
        if (i < 0) {
            max = -1;
        } else {
            max = Math.max(0, Math.min(A.length(), i - (str.length() - A.length())));
        }
        this.M = true;
        this.F.e(this.I, max, A);
        this.M = false;
    }

    @Override
    public final void i(String str) {
        String L;
        rn3 rn3Var = this.w;
        if (rn3Var != null) {
            if (str == null) {
                L = null;
            } else {
                L = L(str);
            }
            rn3Var.setLanguage(L);
        }
    }

    public final void k() {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new tm3(this, (byte) 0));
        this.B0.setDuration(220L);
        this.B0.setInterpolator(k43.g);
        this.B0.start();
    }

    public final void l(long j, long j2) {
        en3 en3Var = this.s;
        if (en3Var == null) {
            return;
        }
        if (en3Var.L == 3) {
            en3Var.b1 = SystemClock.uptimeMillis() + j;
            en3Var.c1 = Math.max(1L, j2);
            en3Var.invalidate();
        }
        hl.d3(new vm3(this, (byte) 5), j + j2 + 60);
    }

    public final void m() {
        hl.r(this.t0);
        en3 en3Var = this.s;
        if (en3Var != null) {
            en3Var.setStopIsland(false);
        }
        hl.r(this.u0);
        hl.r(this.l0);
        vm3 vm3Var = this.v0;
        hl.r(vm3Var);
        vm3 vm3Var2 = this.w0;
        hl.r(vm3Var2);
        en3 en3Var2 = this.s;
        en3Var2.L0 = true;
        en3Var2.R = false;
        SystemClock.uptimeMillis();
        if (en3Var2.J0 == null) {
            Drawable mutate = en3Var2.getResources().getDrawable(2131231511).mutate();
            en3Var2.J0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        en3Var2.invalidate();
        if (!this.p0) {
            k();
        }
        G(false);
        this.Q = 0.0f;
        hl.d3(vm3Var, 30L);
        hl.d3(vm3Var2, 310L);
    }

    public final void n() {
        jl0 jl0Var;
        bl0 bl0Var;
        mm mmVar;
        d dVar = this.f;
        wma wmaVar = dVar.a.b2;
        en3 en3Var = this.s;
        Context context = this.h;
        if (en3Var == null) {
            en3 en3Var2 = new en3(context, this);
            this.s = en3Var2;
            en3Var2.setBorderColorSource(new um3(this, (byte) 0));
            this.s.setVisibility(8);
        }
        ViewParent parent = this.s.getParent();
        en3 en3Var3 = this.s;
        if (parent != wmaVar) {
            hl.B2(en3Var3);
            wmaVar.addView(this.s, tre.e(-1, -1, 80));
        } else {
            en3Var3.bringToFront();
        }
        en3 en3Var4 = this.s;
        ChatActivityEnterView chatActivityEnterView = dVar.a;
        tw1 tw1Var = chatActivityEnterView.R0;
        a aVar = chatActivityEnterView.a1;
        en3Var4.b = tw1Var;
        en3Var4.c = aVar;
        en3Var4.setBubbleProvider(new wz4(this));
        rn3 rn3Var = this.w;
        if (rn3Var == null) {
            rn3Var = new rn3(context, this.n, this);
            this.w = rn3Var;
        }
        ViewParent parent2 = rn3Var.getParent();
        rn3 rn3Var2 = this.w;
        if (parent2 != wmaVar) {
            hl.B2(rn3Var2);
            wmaVar.addView(this.w, tre.e(-1, -1, 80));
        } else {
            rn3Var2.bringToFront();
        }
        ChatActivityEnterView chatActivityEnterView2 = dVar.a;
        int i = ChatActivityEnterView.X7;
        z92 G0 = chatActivityEnterView2.G0();
        z92 z92Var = this.b0;
        if (G0 != z92Var) {
            mm mmVar2 = null;
            if (z92Var != null) {
                z92Var.f = null;
            }
            this.b0 = G0;
            if (G0 != null) {
                mmVar = new mm(G0, 0L, 380L, new k43(0.22d, 0.61d, 0.36d, 1.0d));
            } else {
                mmVar = null;
            }
            this.Z = mmVar;
            if (G0 != null) {
                mmVar2 = new mm(G0, 1L, 300L, k43.g);
            }
            this.e = mmVar2;
        }
        z92 z92Var2 = this.b0;
        if (z92Var2 != null) {
            z92Var2.f = new um3(this, (byte) 1);
            ll0 ll0Var = dVar.a.K1;
            if (ll0Var != 0 && (jl0Var = z92Var2.r) != null && (bl0Var = jl0Var.w) != null) {
                jl0 c = ll0Var.c(this.w, bl0Var, false);
                jl0 c2 = ll0Var.c(this.w, this.b0.r.w, false);
                rn3 rn3Var3 = this.w;
                jl0 c3 = ll0Var.c(rn3Var3, this.b0.r.w, false);
                rn3Var3.I = c;
                rn3Var3.J = c2;
                rn3Var3.K = c3;
                c.r(hl.L(18.0f));
                c2.r(hl.L(18.0f));
                c3.r(hl.L(18.0f));
                rn3 rn3Var4 = this.w;
                rn3Var4.setGearGlass(ll0Var.c(rn3Var4, this.b0.r.w, false));
                en3 en3Var5 = this.s;
                if (en3Var5 != null) {
                    en3Var5.setStopGlass(ll0Var.c(en3Var5, new Object(), false));
                }
            }
        }
        tx1 tx1Var = dVar.a.F0;
        if (this.F == null) {
            ho3 ho3Var = new ho3(tx1Var);
            this.F = ho3Var;
            ho3Var.h = new um3(this, (byte) 2);
            this.a = new sn3(tx1Var);
            tx1Var.addTextChangedListener(this.h0);
        }
        if (this.H == null) {
            this.H = new dm3(dVar.a.R);
        }
        P();
    }

    public final void o() {
        co3 co3Var = this.G;
        if (co3Var != null) {
            co3Var.c();
        }
        this.G = null;
        dm3 dm3Var = this.H;
        if (dm3Var != null) {
            dm3Var.b();
        }
        if (s()) {
            m();
        }
        rn3 rn3Var = this.w;
        if (rn3Var != null) {
            rn3Var.a();
            this.w.setIsland(false);
            this.w.setRevert(false);
            this.w.setSettings(false);
        }
        this.J = null;
        J(0);
        G(false);
        sn3 sn3Var = this.a;
        if (sn3Var != null) {
            sn3Var.c();
        }
        d dVar = this.f;
        ChatActivityEnterView chatActivityEnterView = dVar.a;
        chatActivityEnterView.F1 = 0L;
        chatActivityEnterView.G1 = null;
        en3 en3Var = this.s;
        if (en3Var != null && en3Var.getRightMode() == 3) {
            this.s.e();
        }
        ho3 ho3Var = this.F;
        if (ho3Var != null) {
            ho3Var.f(false);
        }
        F(false);
        H();
        dVar.b();
    }

    public final boolean p(RectF rectF) {
        jl0 jl0Var;
        z92 z92Var = this.b0;
        if (z92Var == null || (jl0Var = z92Var.r) == null) {
            return false;
        }
        Rect rect = jl0Var.S.m;
        if (rect.isEmpty()) {
            return false;
        }
        z92 z92Var2 = this.b0;
        int[] iArr = this.E;
        z92Var2.getLocationInWindow(iArr);
        rectF.set(rect);
        rectF.offset(iArr[0], iArr[1]);
        return true;
    }

    public final boolean q() {
        if (this.r != 0) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if (this.p0 && this.r != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        byte b = this.r;
        if (b == 1 || b == 2) {
            return true;
        }
        return false;
    }

    public final boolean u(float[] fArr) {
        tx1 tx1Var = this.f.a.F0;
        if (this.b0 == null || tx1Var == null || tx1Var.getLayout() == null) {
            return false;
        }
        z92 z92Var = this.b0;
        int[] iArr = this.C0;
        z92Var.getLocationInWindow(iArr);
        int[] iArr2 = this.D0;
        tx1Var.getLocationInWindow(iArr2);
        fArr[0] = (tx1Var.getTotalPaddingLeft() + (iArr2[0] - iArr[0])) - tx1Var.getScrollX();
        fArr[1] = (tx1Var.getTotalPaddingTop() + (iArr2[1] - iArr[1])) - tx1Var.getScrollY();
        return true;
    }

    public final void v() {
        if (!s()) {
            return;
        }
        co3 co3Var = this.G;
        if (co3Var != null) {
            co3Var.c();
        }
        this.G = null;
        d dVar = this.f;
        Editable text = dVar.a.F0.getText();
        if (text != null && this.I <= text.length()) {
            this.M = true;
            this.F.a();
            text.delete(this.I, text.length());
            this.M = false;
        }
        O();
        m();
        F(false);
        this.w.setIsland(false);
        this.w.setSettings(false);
        this.w.setStopMode(false);
        H();
        J(0);
        dVar.b();
    }

    public final void w() {
        if (this.r == 1) {
            hl.r(this.t0);
            J(2);
            this.s.setStopIsland(false);
            this.s.setRightMode(1);
            this.s.setCancelShown(false);
            co3 co3Var = this.G;
            if (co3Var != null) {
                co3Var.m();
            }
        }
    }

    public final void y(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn3.y(java.lang.String):void");
    }

    public final int z() {
        Editable text = this.f.a.F0.getText();
        if (text == null) {
            return 0;
        }
        return Math.max(0, text.length() - Math.min(this.I, text.length()));
    }
}
