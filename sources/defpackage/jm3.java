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
public final class jm3 implements kn3 {
    public static final s33 I0 = new s33(0.3d, 0.0d, 0.2d, 1.0d);
    public ValueAnimator A0;
    public et1 E0;
    public qn3 F;
    public float F0;
    public ln3 G;
    public ValueAnimator G0;
    public ll3 H;
    public int I;
    public String J;
    public boolean L;
    public int N;
    public boolean O;
    public float P;
    public float Q;
    public long R;
    public float T;
    public long U;
    public long V;
    public long W;
    public boolean X;
    public lm Y;
    public bn3 a;
    public j92 a0;
    public long b;
    public float b0;
    public float c;
    public ValueAnimator c0;
    public boolean d;
    public lm e;
    public final d f;
    public boolean f0;
    public final Context h;
    public float[] h0;
    public float[] i0;
    public int j0;
    public String l0;
    public final wjb n;
    public int n0;
    public boolean o0;
    public long p0;
    public long q0;
    public long r0;
    public mm3 s;
    public an3 w;
    public LinearGradient w0;
    public boolean x0;
    public float y0;
    public byte r = 0;
    public final om3 x = new om3();
    public final RectF y = new RectF();
    public final int[] E = new int[2];
    public kl3 K = ll3.c;
    public String M = "";
    public long S = -100000;
    public final RectF Z = new RectF();
    public int d0 = -6440822;
    public final k93 e0 = new k93((byte) 13);
    public final b7 g0 = new b7(this, (byte) 17);
    public final cm3 k0 = new cm3(this, (byte) 8);
    public final cm3 m0 = new cm3(this, (byte) 9);
    public final o1 s0 = new o1(this, (byte) 21);
    public final cm3 t0 = new cm3(this, (byte) 10);
    public final cm3 u0 = new cm3(this, (byte) 11);
    public final cm3 v0 = new cm3(this, (byte) 0);
    public final Matrix z0 = new Matrix();
    public final int[] B0 = new int[2];
    public final int[] C0 = new int[2];
    public final float[] D0 = new float[2];
    public final kr H0 = new kr(this, (byte) 2);

    public jm3(Context context, d dVar) {
        this.h = context;
        this.f = dVar;
        this.n = dVar.a.L4;
    }

    public static void G(TLRPC.TL_error tL_error) {
        u21 Y = u21.Y();
        if (Y == null) {
            return;
        }
        if (tL_error != null) {
            if (!"AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) && !"SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text)) {
                Y.g0(tL_error, false);
                return;
            } else {
                Y.I(2131624211, k96.M0(2131754989, null), gl.S2(k96.M0(2131754990, null))).j();
                return;
            }
        }
        Log.d("Dictation", "style request failed (no error from the server)");
    }

    public static String H(String str) {
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        vl3 L = DictationAsr.L(language);
        if (L != null && L.d(language).length >= 2) {
            return N(DictationAsr.g0(L, language));
        }
        return r(str);
    }

    public static String N(String str) {
        String O = O(str);
        if (O == null) {
            return r(str);
        }
        return r(str) + " (" + O + ")";
    }

    public static String O(String str) {
        String str2;
        String[] split = str.split("-");
        if (split.length < 2) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Language");
        for (String str3 : split) {
            sb.append(h(str3));
        }
        String K0 = k96.K0(sb.toString());
        if (!TextUtils.isEmpty(K0)) {
            return K0;
        }
        Locale locale = k96.D0().y;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        boolean z = true;
        for (int i = 1; i < split.length; i++) {
            if (split[i].matches("[A-Za-z]{4}")) {
                str2 = new Locale.Builder().setScript(split[i]).build().getDisplayScript(locale);
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
            sb3.append(h(split[i]));
        }
        if (z) {
            return sb2.toString();
        }
        return sb3.toString();
    }

    public static String h(String str) {
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

    public static String r(String str) {
        String str2;
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        Locale locale = k96.D0().y;
        if (locale != null) {
            str2 = new Locale(language).getDisplayLanguage(locale);
        } else {
            str2 = null;
        }
        if (str2 != null && !str2.isEmpty() && !str2.equalsIgnoreCase(language)) {
            return str2.substring(0, 1).toUpperCase(locale) + str2.substring(1);
        }
        String K0 = rzb.K0(language);
        if (K0 != null) {
            return K0;
        }
        return language;
    }

    public static int v(int i, int i2, boolean z) {
        int i3;
        int i4 = i | (-16777216);
        int i5 = i2 | (-16777216);
        int i6 = i4;
        for (int i7 = 1; i7 <= 20 && bm2.g(i6, i5) < 4.5d; i7++) {
            if (z) {
                i3 = -1;
            } else {
                i3 = -16777216;
            }
            i6 = bm2.f(i7 * 0.04f, i4, i3);
        }
        return i6;
    }

    public final void A(String str) {
        ln3 ln3Var;
        DictationAsr.Z(str);
        DictationAsr.s(DictationAsr.L(str));
        this.w.setLanguage(H(str));
        if (this.r == 1 && (ln3Var = this.G) != null) {
            ln3Var.j(str);
        }
    }

    public final void B() {
        Log.d("Dictation", "send from listening (" + x() + " chars)");
        ln3 ln3Var = this.G;
        if (ln3Var != null) {
            ln3Var.c();
        }
        this.G = null;
        gl.r(this.s0);
        this.F.a();
        this.s.setStopIsland(false);
        d dVar = this.f;
        dVar.a.L1(null, true);
        D(false);
        this.P = 0.0f;
        this.w.setIsland(false);
        this.w.setSettings(false);
        this.w.setStopMode(false);
        E();
        C(false);
        this.r = (byte) 0;
        this.b0 = 0.0f;
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        dVar.d(0.0f);
        this.s.e();
        dVar.b();
        dVar.a.u1();
    }

    public final void C(boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.f.a;
        ex1 ex1Var = chatActivityEnterView.F0;
        if (ex1Var != null && z) {
            chatActivityEnterView.F1 = false;
            if (ex1Var != null) {
                ex1Var.invalidate();
            }
        }
    }

    public final void D(boolean z) {
        if (z) {
            this.b = 0L;
        }
        this.X = z;
        j92 j92Var = this.a0;
        if (j92Var != null) {
            j92Var.invalidate();
        }
    }

    public final void E() {
        jq1 jq1Var;
        et1 et1Var;
        mu1 mu1Var = this.f.a.F3;
        if (mu1Var != null) {
            jq1Var = mu1Var.A0;
        } else {
            jq1Var = null;
        }
        if (jq1Var == null || (et1Var = this.E0) == null) {
            return;
        }
        if (et1Var != jq1Var) {
            kr krVar = this.H0;
            if (et1Var != null) {
                et1Var.r0(krVar);
            }
            this.E0 = jq1Var;
            jq1Var.i(krVar);
        }
        ValueAnimator valueAnimator = this.G0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F0, 0.0f);
        this.G0 = ofFloat;
        ofFloat.addUpdateListener(new dm3(this, (byte) 2));
        this.G0.addListener(new im2(this, (byte) 13));
        this.G0.setDuration(300L);
        this.G0.setInterpolator(s33.h);
        this.G0.start();
    }

    public final void F(float f, float f2) {
        mm3 mm3Var = this.s;
        if (mm3Var != null && (mm3Var.a1 != f || mm3Var.Z0 != f2)) {
            mm3Var.a1 = f;
            mm3Var.Z0 = f2;
            mm3Var.invalidate();
        }
        an3 an3Var = this.w;
        if (an3Var != null) {
            if (an3Var.m0 != f || an3Var.l0 != f2) {
                an3Var.m0 = f;
                an3Var.l0 = f2;
                an3Var.invalidate();
            }
        }
    }

    public final void I(boolean z) {
        int length;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        long j;
        ll3 ll3Var;
        byte b = this.r;
        if (b != 1 && b != 2) {
            this.o0 = z;
            if (b == 4 && (ll3Var = this.H) != null) {
                ll3Var.b();
            }
            l();
            ValueAnimator valueAnimator = this.A0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            String str2 = null;
            this.A0 = null;
            d dVar = this.f;
            ChatActivityEnterView chatActivityEnterView = dVar.a;
            chatActivityEnterView.A1 = 0.0f;
            chatActivityEnterView.l2();
            Editable text = dVar.a.F0.getText();
            byte b2 = this.r;
            if (b2 == 3 || b2 == 4) {
                this.w.a();
                this.w.setIsland(false);
                this.w.setRevert(false);
                this.w.setSettings(false);
                E();
                qn3 qn3Var = this.F;
                if (qn3Var != null) {
                    qn3Var.f(false);
                }
            }
            this.J = null;
            this.K = ll3.c;
            if (text == null) {
                length = 0;
            } else {
                length = text.length();
            }
            if (length > 0 && !Character.isWhitespace(text.charAt(length - 1))) {
                this.L = true;
                text.append(' ');
                this.L = false;
                length++;
            }
            this.I = length;
            this.M = "";
            this.N = 0;
            this.O = false;
            this.r = (byte) 1;
            dVar.b();
            this.U = SystemClock.uptimeMillis();
            gl.r(this.k0);
            cm3 cm3Var = this.m0;
            DictationAsr.T(cm3Var);
            DictationAsr.i(cm3Var);
            M(true);
            if (!z) {
                b(1.0f, 220L, s33.h);
            }
            gl.r(this.t0);
            mm3 mm3Var = this.s;
            float[] fArr = this.h0;
            int i = this.n0;
            mm3Var.getClass();
            if (fArr != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            mm3Var.R = z2;
            if (z2) {
                mm3Var.S = fArr[0] - mm3Var.getLeft();
                mm3Var.T = fArr[1] - mm3Var.getTop();
                mm3Var.U.setColor(i);
            }
            mm3 mm3Var2 = this.s;
            float[] fArr2 = this.i0;
            int i2 = this.j0;
            int[] iArr = mm3Var2.o0;
            if (fArr2 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            mm3Var2.A0 = z3;
            if (z3) {
                mm3Var2.getLocationInWindow(iArr);
                mm3Var2.B0 = fArr2[0] - iArr[0];
                mm3Var2.C0 = fArr2[1] - iArr[1];
                mm3Var2.D0 = fArr2[2];
                mm3Var2.E0 = i2;
                mm3Var2.F0 = 0L;
                Drawable drawable = mm3Var2.J0;
                if (drawable == null) {
                    drawable = mm3Var2.getResources().getDrawable(2131231511).mutate();
                    mm3Var2.J0 = drawable;
                }
                drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            if (this.i0 == null) {
                str = "null";
            } else {
                str = ((int) this.i0[0]) + "," + ((int) this.i0[1]) + " r" + ((int) this.i0[2]);
            }
            Log.d("Dictation", "commit morph from circle ".concat(str));
            this.i0 = null;
            this.h0 = null;
            if (!z) {
                this.s.setShown(true);
                this.s.setRightMode(0);
            }
            this.x.f();
            D(true);
            C(true);
            if (!z) {
                this.s.setStopIsland(true);
            }
            String c0 = DictationAsr.c0();
            an3 an3Var = this.w;
            if (c0 != null) {
                str2 = H(c0);
            }
            an3Var.setLanguage(str2);
            this.w.setSettings(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.r0 = uptimeMillis;
            this.q0 = uptimeMillis;
            this.U = uptimeMillis;
            this.p0 = 0L;
            if (!z) {
                gl.d3(this.s0, 300L);
            }
            if (na7.c1().getInt("design_dictation_mode", 1) == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            ChatActivityEnterView chatActivityEnterView2 = dVar.a;
            this.G = new ln3(this.h, chatActivityEnterView2.R, chatActivityEnterView2.G3, z4, this);
            ex1 ex1Var = dVar.a.F0;
            if (ex1Var != null) {
                ex1Var.n1 = true;
            }
            Log.d("Dictation", "start simulated=" + z4);
            ln3 ln3Var = this.G;
            ln3Var.h();
            wc3 wc3Var = new wc3(this, ln3Var, (byte) 20);
            if (!z4 && !z) {
                j = 420;
            } else {
                j = 120;
            }
            gl.d3(wc3Var, j);
        }
    }

    public final ArrayList J() {
        l();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ll3.c);
        arrayList.addAll(this.H.c());
        return arrayList;
    }

    public final void K() {
        Editable text = this.f.a.F0.getText();
        if (text != null && text.length() > 0 && text.length() == this.I && Character.isWhitespace(text.charAt(text.length() - 1))) {
            this.L = true;
            text.delete(text.length() - 1, text.length());
            this.L = false;
        }
    }

    public final void L() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        Drawable backgroundImage;
        if (!this.f0) {
            this.f0 = true;
            ArrayList arrayList = pm3.g;
            k93 k93Var = this.e0;
            if (!arrayList.contains(k93Var)) {
                arrayList.add(k93Var);
            }
        }
        try {
            cja cjaVar = this.f.a.c2;
            if (cjaVar != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && (backgroundImage = cjaVar.getBackgroundImage()) != null) {
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
                this.d0 = Color.rgb((int) (j / 64), (int) (j2 / 64), (int) (j3 / 64));
            }
        } catch (Throwable unused) {
        }
        int i8 = bkb.c6;
        wjb wjbVar = this.n;
        int v0 = bkb.v0(i8, wjbVar);
        boolean c = om3.c(v0);
        om3 om3Var = this.x;
        if (om3Var.h != c) {
            om3Var.h = c;
        }
        int i9 = bkb.Oe;
        om3.h(bkb.v0(i9, wjbVar));
        om3Var.g(this.d0, bkb.v0(i9, wjbVar));
        int[] iArr = om3Var.B;
        int i10 = iArr[0];
        int i11 = iArr[1];
        if (yw4.e != i10 || yw4.f != i11) {
            yw4.e = i10;
            yw4.f = i11;
            Arrays.fill(yw4.g[0], (Object) null);
        }
        if (this.s != null) {
            int v02 = bkb.v0(i9, wjbVar) | (-16777216);
            mm3 mm3Var = this.s;
            int f = bm2.f(0.1f, v02, iArr[6]);
            int i12 = iArr[4];
            mm3Var.e1 = v02;
            mm3Var.f1 = f;
            mm3Var.g1 = i12;
            if (!mm3Var.p0) {
                mm3Var.q0 = v02;
                mm3Var.r0 = f;
                mm3Var.s0 = null;
                mm3Var.invalidate();
            }
            this.s.setDayIconBase(bkb.v0(bkb.Ml, wjbVar));
        }
        this.w0 = null;
        j92 j92Var = this.a0;
        if (j92Var != null) {
            j92Var.invalidate();
        }
        mm3 mm3Var2 = this.s;
        if (mm3Var2 != null) {
            int i13 = bkb.Ml;
            int v03 = bkb.v0(i13, wjbVar);
            int v04 = bkb.v0(i9, wjbVar);
            mm3Var2.d.setColor(v03);
            mm3Var2.e.setColor(v04);
            mm3Var2.f.setColor(v04);
            mm3Var2.invalidate();
            mm3 mm3Var3 = this.s;
            int v05 = bkb.v0(i13, wjbVar);
            Paint paint = mm3Var3.d0;
            Paint paint2 = mm3Var3.c0;
            mm3Var3.p0 = c;
            if (c) {
                i = om3.e(-13665281);
            } else {
                i = mm3Var3.e1;
            }
            mm3Var3.q0 = i;
            if (c) {
                i2 = om3.e(-7447553);
            } else {
                i2 = mm3Var3.f1;
            }
            mm3Var3.r0 = i2;
            mm3Var3.s0 = null;
            Paint paint3 = mm3Var3.b0;
            if (c) {
                i3 = 1714435648;
            } else {
                i3 = -1493172225;
            }
            paint3.setColor(i3);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(gl.N(0.66f));
            if (c) {
                i4 = 654311423;
            } else {
                i4 = 436207616;
            }
            paint2.setColor(i4);
            paint.setColor(16777216);
            float N = gl.N(1.0f);
            float N2 = gl.N(0.33333334f);
            if (c) {
                i5 = 1711276032;
            } else {
                i5 = 855638016;
            }
            paint.setShadowLayer(N, 0.0f, N2, i5);
            mm3Var3.e0.setColor(v05);
            mm3Var3.invalidate();
            this.s.setSendIconColor(bkb.v0(bkb.Sf, wjbVar));
        }
        qn3 qn3Var = this.F;
        if (qn3Var != null) {
            qn3Var.c(v(bkb.v0(i9, wjbVar), v0, c), bkb.v0(bkb.Ke, wjbVar), c);
        }
        an3 an3Var = this.w;
        if (an3Var != null) {
            an3Var.e();
        }
    }

    public final void M(boolean z) {
        long[] jArr;
        String concat;
        boolean z2;
        if (!DictationAsr.J(new long[2])) {
            concat = null;
        } else {
            concat = " ".concat(k96.a0(null, null, 2131745067, Long.valueOf(Math.round(jArr[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(jArr[1] / 1048576.0d)))));
        }
        if (!z && TextUtils.equals(concat, this.l0)) {
            return;
        }
        this.l0 = concat;
        d dVar = this.f;
        if (concat == null) {
            dVar.a.L1(k96.M0(2131745060, null), true);
            return;
        }
        String M0 = k96.M0(2131745066, null);
        ChatActivityEnterView chatActivityEnterView = dVar.a;
        CharSequence charSequence = chatActivityEnterView.e;
        if (charSequence != null && charSequence.toString().startsWith(M0.toString())) {
            z2 = true;
        } else {
            z2 = false;
        }
        chatActivityEnterView.L1(TextUtils.concat(M0, concat), !z2);
    }

    @Override
    public final void a(String str, String str2) {
        if (!q()) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            String y = y(str);
            if (this.N <= 0 || !y.isEmpty()) {
                this.L = true;
                this.F.e(this.I, -1, y);
                this.L = false;
            }
        }
        qn3 qn3Var = this.F;
        Editable editableText = qn3Var.a.getEditableText();
        if (editableText != null) {
            qn3Var.d(editableText, editableText.length());
        }
        d dVar = this.f;
        ex1 ex1Var = dVar.a.F0;
        InputMethodManager inputMethodManager = (InputMethodManager) this.h.getSystemService("input_method");
        if (inputMethodManager != null && ex1Var != null) {
            inputMethodManager.restartInput(ex1Var);
        }
        this.G = null;
        if (str2 != null) {
            Log.d("Dictation", "stopped with error: ".concat(str2));
        }
        if (x() <= 0 && (this.N <= 0 || dVar.a.F0.getText().toString().trim().length() <= 0)) {
            k();
            K();
            this.w.setIsland(false);
            this.w.setSettings(false);
            this.w.setStopMode(false);
            E();
            this.r = (byte) 0;
            dVar.b();
            return;
        }
        this.r = (byte) 3;
        dVar.b();
        this.I = 0;
        this.s.setCancelShown(false);
        if (!this.o0) {
            i();
        }
        this.s.setHandOff(true);
        this.s.setRightMode(2);
        dVar.a.L1(null, true);
        D(false);
        this.P = 0.0f;
        gl.d3(this.t0, 460L);
        this.w.setStopMode(false);
        this.w.d(k96.M0(2131745064, null), false);
        ex1 ex1Var2 = dVar.a.F0;
        ex1Var2.setSelection(ex1Var2.length());
        if (!this.o0) {
            ex1Var2.requestFocus();
            gl.d3(new li3(ex1Var2, (byte) 10), 120L);
        }
        gl.d3(new cm3(this, (byte) 7), 90L);
    }

    public final void b(float f, long j, s33 s33Var) {
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, f);
        this.c0 = ofFloat;
        ofFloat.addUpdateListener(new dm3(this, (byte) 1));
        this.c0.setDuration(j);
        this.c0.setInterpolator(s33Var);
        this.c0.start();
    }

    public final void c(kl3 kl3Var) {
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
                str = z();
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
            this.r = (byte) 4;
            this.b = 0L;
            this.V = SystemClock.uptimeMillis();
            an3 an3Var = this.w;
            if (kl3Var.d) {
                a0 = k96.M0(2131745063, null);
            } else {
                a0 = k96.a0(null, null, 2131745073, kl3Var.a());
            }
            an3Var.d(a0, true);
            this.F.a();
            this.F.f(true);
            this.x.f();
            mm3 mm3Var = this.s;
            if (mm3Var != null) {
                mm3Var.R0 = SystemClock.uptimeMillis();
                mm3Var.setVisibility(0);
                mm3Var.y = true;
                mm3Var.E = false;
                mm3Var.R = false;
                mm3Var.A0 = false;
                mm3Var.L0 = false;
                mm3Var.l0 = false;
                mm3Var.l1 = false;
                mm3Var.F.e(true, 1.0f);
                mm3Var.G.e(true, 0.0f);
                mm3Var.H.e(true, 0.0f);
                mm3Var.I.e(true, 0.0f);
                mm3Var.J.e(true, 1.0f);
                mm3Var.O0.e(true, 0.0f);
                mm3Var.b1 = 0L;
                mm3Var.N0.e(true, 1.0f);
                mm3Var.L = 3;
                mm3Var.invalidate();
            }
            j92 j92Var = this.a0;
            if (j92Var != null) {
                j92Var.invalidate();
            }
            kl3 kl3Var2 = this.K;
            this.K = kl3Var;
            this.H.a(kl3Var, str, new wf(this, kl3Var2, z, kl3Var, (byte) 4));
        }
    }

    @Override
    public final void d(float f) {
        ChatActivityEnterView chatActivityEnterView;
        ChatActivityEnterView.RecordCircle recordCircle;
        this.P = f;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (f > 0.38f) {
            long j = this.p0;
            if (j == 0) {
                this.p0 = uptimeMillis;
                j = uptimeMillis;
            }
            if (uptimeMillis - j >= 150) {
                this.U = uptimeMillis;
            }
        } else {
            this.p0 = 0L;
        }
        mm3 mm3Var = this.s;
        if (mm3Var != null) {
            mm3Var.setLevel(f);
        }
        if (this.o0 && (recordCircle = (chatActivityEnterView = this.f.a).D2) != null && chatActivityEnterView.v3) {
            recordCircle.setAmplitude(f * 1800.0f);
        }
    }

    @Override
    public final void e(String str) {
        f(-1, str);
    }

    @Override
    public final void f(int i, String str) {
        int max;
        if (!q()) {
            return;
        }
        this.q0 = SystemClock.uptimeMillis();
        if (str == null) {
            str = "";
        }
        String y = y(str);
        if (i < 0) {
            max = -1;
        } else {
            max = Math.max(0, Math.min(y.length(), i - (str.length() - y.length())));
        }
        this.L = true;
        this.F.e(this.I, max, y);
        this.L = false;
    }

    @Override
    public final void g(String str) {
        String H;
        an3 an3Var = this.w;
        if (an3Var != null) {
            if (str == null) {
                H = null;
            } else {
                H = H(str);
            }
            an3Var.setLanguage(H);
        }
    }

    public final void i() {
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A0 = ofFloat;
        ofFloat.addUpdateListener(new dm3(this, (byte) 0));
        this.A0.setDuration(220L);
        this.A0.setInterpolator(s33.g);
        this.A0.start();
    }

    public final void j(long j, long j2) {
        mm3 mm3Var = this.s;
        if (mm3Var == null) {
            return;
        }
        if (mm3Var.L == 3) {
            mm3Var.b1 = SystemClock.uptimeMillis() + j;
            mm3Var.c1 = Math.max(1L, j2);
            mm3Var.invalidate();
        }
        gl.d3(new cm3(this, (byte) 6), j + j2 + 60);
    }

    public final void k() {
        gl.r(this.s0);
        mm3 mm3Var = this.s;
        if (mm3Var != null) {
            mm3Var.setStopIsland(false);
        }
        gl.r(this.t0);
        gl.r(this.k0);
        cm3 cm3Var = this.u0;
        gl.r(cm3Var);
        cm3 cm3Var2 = this.v0;
        gl.r(cm3Var2);
        mm3 mm3Var2 = this.s;
        mm3Var2.L0 = true;
        mm3Var2.R = false;
        SystemClock.uptimeMillis();
        if (mm3Var2.J0 == null) {
            Drawable mutate = mm3Var2.getResources().getDrawable(2131231511).mutate();
            mm3Var2.J0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        mm3Var2.invalidate();
        if (!this.o0) {
            i();
        }
        D(false);
        this.P = 0.0f;
        gl.d3(cm3Var, 30L);
        gl.d3(cm3Var2, 310L);
    }

    public final void l() {
        il0 il0Var;
        al0 al0Var;
        lm lmVar;
        d dVar = this.f;
        cja cjaVar = dVar.a.c2;
        mm3 mm3Var = this.s;
        Context context = this.h;
        if (mm3Var == null) {
            mm3 mm3Var2 = new mm3(context, this);
            this.s = mm3Var2;
            mm3Var2.setBorderColorSource(new bm3(this, (byte) 0));
            this.s.setVisibility(8);
        }
        ViewParent parent = this.s.getParent();
        mm3 mm3Var3 = this.s;
        if (parent != cjaVar) {
            gl.B2(mm3Var3);
            cjaVar.addView(this.s, nme.e(-1, -1, 80));
        } else {
            mm3Var3.bringToFront();
        }
        mm3 mm3Var4 = this.s;
        ChatActivityEnterView chatActivityEnterView = dVar.a;
        ew1 ew1Var = chatActivityEnterView.R0;
        a aVar = chatActivityEnterView.a1;
        mm3Var4.b = ew1Var;
        mm3Var4.c = aVar;
        mm3Var4.setBubbleProvider(new lj9(this, (byte) 29));
        an3 an3Var = this.w;
        if (an3Var == null) {
            an3Var = new an3(context, this.n, this);
            this.w = an3Var;
        }
        ViewParent parent2 = an3Var.getParent();
        an3 an3Var2 = this.w;
        if (parent2 != cjaVar) {
            gl.B2(an3Var2);
            cjaVar.addView(this.w, nme.e(-1, -1, 80));
        } else {
            an3Var2.bringToFront();
        }
        ChatActivityEnterView chatActivityEnterView2 = dVar.a;
        int i = ChatActivityEnterView.r7;
        j92 C0 = chatActivityEnterView2.C0();
        j92 j92Var = this.a0;
        if (C0 != j92Var) {
            lm lmVar2 = null;
            if (j92Var != null) {
                j92Var.f = null;
            }
            this.a0 = C0;
            if (C0 != null) {
                lmVar = new lm(C0, 0L, 380L, new s33(0.22d, 0.61d, 0.36d, 1.0d));
            } else {
                lmVar = null;
            }
            this.Y = lmVar;
            if (C0 != null) {
                lmVar2 = new lm(C0, 1L, 300L, s33.g);
            }
            this.e = lmVar2;
        }
        j92 j92Var2 = this.a0;
        if (j92Var2 != null) {
            j92Var2.f = new bm3(this, (byte) 2);
            kl0 kl0Var = dVar.a.L1;
            if (kl0Var != 0 && (il0Var = j92Var2.n) != null && (al0Var = il0Var.w) != null) {
                il0 c = kl0Var.c(this.w, al0Var, false);
                il0 c2 = kl0Var.c(this.w, this.a0.n.w, false);
                an3 an3Var3 = this.w;
                il0 c3 = kl0Var.c(an3Var3, this.a0.n.w, false);
                an3Var3.I = c;
                an3Var3.J = c2;
                an3Var3.K = c3;
                c.r(gl.L(18.0f));
                c2.r(gl.L(18.0f));
                c3.r(gl.L(18.0f));
                an3 an3Var4 = this.w;
                an3Var4.setGearGlass(kl0Var.c(an3Var4, this.a0.n.w, false));
                mm3 mm3Var5 = this.s;
                if (mm3Var5 != null) {
                    mm3Var5.setStopGlass(kl0Var.c(mm3Var5, new Object(), false));
                }
            }
        }
        ex1 ex1Var = dVar.a.F0;
        if (this.F == null) {
            qn3 qn3Var = new qn3(ex1Var);
            this.F = qn3Var;
            qn3Var.h = new bm3(this, (byte) 4);
            this.a = new bn3(ex1Var);
            ex1Var.addTextChangedListener(this.g0);
        }
        if (this.H == null) {
            this.H = new ll3(dVar.a.R);
        }
        L();
    }

    public final void m() {
        d dVar = this.f;
        ex1 ex1Var = dVar.a.F0;
        if (ex1Var != null) {
            ex1Var.n1 = false;
        }
        ln3 ln3Var = this.G;
        if (ln3Var != null) {
            ln3Var.c();
        }
        this.G = null;
        ll3 ll3Var = this.H;
        if (ll3Var != null) {
            ll3Var.b();
        }
        if (q()) {
            k();
        }
        an3 an3Var = this.w;
        if (an3Var != null) {
            an3Var.a();
            this.w.setIsland(false);
            this.w.setRevert(false);
            this.w.setSettings(false);
        }
        this.J = null;
        this.r = (byte) 0;
        D(false);
        bn3 bn3Var = this.a;
        if (bn3Var != null) {
            bn3Var.c();
        }
        ChatActivityEnterView chatActivityEnterView = dVar.a;
        chatActivityEnterView.G1 = 0L;
        chatActivityEnterView.H1 = null;
        mm3 mm3Var = this.s;
        if (mm3Var != null && mm3Var.getRightMode() == 3) {
            this.s.e();
        }
        qn3 qn3Var = this.F;
        if (qn3Var != null) {
            qn3Var.f(false);
        }
        C(false);
        E();
        dVar.b();
    }

    public final boolean n(RectF rectF) {
        il0 il0Var;
        j92 j92Var = this.a0;
        if (j92Var == null || (il0Var = j92Var.n) == null) {
            return false;
        }
        Rect rect = il0Var.S.m;
        if (rect.isEmpty()) {
            return false;
        }
        j92 j92Var2 = this.a0;
        int[] iArr = this.E;
        j92Var2.getLocationInWindow(iArr);
        rectF.set(rect);
        rectF.offset(iArr[0], iArr[1]);
        return true;
    }

    public final boolean o() {
        if (this.r != 0) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if (this.o0 && this.r != 0) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        byte b = this.r;
        if (b == 1 || b == 2) {
            return true;
        }
        return false;
    }

    public final boolean s(float[] fArr) {
        ex1 ex1Var = this.f.a.F0;
        if (this.a0 == null || ex1Var == null || ex1Var.getLayout() == null) {
            return false;
        }
        j92 j92Var = this.a0;
        int[] iArr = this.B0;
        j92Var.getLocationInWindow(iArr);
        int[] iArr2 = this.C0;
        ex1Var.getLocationInWindow(iArr2);
        fArr[0] = (ex1Var.getTotalPaddingLeft() + (iArr2[0] - iArr[0])) - ex1Var.getScrollX();
        fArr[1] = (ex1Var.getTotalPaddingTop() + (iArr2[1] - iArr[1])) - ex1Var.getScrollY();
        return true;
    }

    public final void t() {
        if (!q()) {
            return;
        }
        ln3 ln3Var = this.G;
        if (ln3Var != null) {
            ln3Var.c();
        }
        this.G = null;
        d dVar = this.f;
        Editable text = dVar.a.F0.getText();
        if (text != null && this.I <= text.length()) {
            this.L = true;
            this.F.a();
            text.delete(this.I, text.length());
            this.L = false;
        }
        K();
        k();
        C(false);
        this.w.setIsland(false);
        this.w.setSettings(false);
        this.w.setStopMode(false);
        E();
        this.r = (byte) 0;
        dVar.b();
    }

    public final void u() {
        if (this.r == 1) {
            gl.r(this.s0);
            this.r = (byte) 2;
            this.s.setStopIsland(false);
            this.s.setRightMode(1);
            this.s.setCancelShown(false);
            ln3 ln3Var = this.G;
            if (ln3Var != null) {
                ln3Var.m();
            }
        }
    }

    public final void w(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jm3.w(java.lang.String):void");
    }

    public final int x() {
        Editable text = this.f.a.F0.getText();
        if (text == null) {
            return 0;
        }
        return Math.max(0, text.length() - Math.min(this.I, text.length()));
    }

    public final String y(String str) {
        String str2;
        String str3 = "";
        if (str == null) {
            str = "";
        }
        this.M = str;
        if (this.N <= 0) {
            return str;
        }
        int length = str.length();
        int i = this.N;
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
        if (this.O) {
            str3 = " ";
        }
        return str3.concat(substring);
    }

    public final String z() {
        Editable text = this.f.a.F0.getText();
        if (text == null) {
            return "";
        }
        return text.subSequence(Math.min(this.I, text.length()), text.length()).toString();
    }
}
