package ai;

import a8.sa;
import android.animation.TimeInterpolator;
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
import android.view.inputmethod.InputMethodManager;
import c8.ma;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.fe;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oe;
import org.telegram.ui.Components.sf;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.bj;
import org.telegram.ui.bn;
import org.telegram.ui.tl;
public final class p0 implements c2 {
    public static final nr I0 = new nr(0.3d, 0.0d, 0.2d, 1.0d);
    public ValueAnimator A0;
    public final int[] B0;
    public final int[] C0;
    public final float[] D0;
    public tl E0;
    public j2 F;
    public float F0;
    public e2 G;
    public ValueAnimator G0;
    public h H;
    public final j0 H0;
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
    public d6 Y;
    public n1 f1377a;
    public jh.f f1378a0;
    public long f1379b;
    public float f1380b0;
    public float f1381c;
    public ValueAnimator f1382c0;
    public boolean d;
    public int f1383d0;
    public d6 f1384e;
    public final a3.l f1385e0;
    public final sf f1386f;
    public boolean f1387f0;
    public final ah.j f1388g0;
    public final Context h;
    public float[] f1389h0;
    public float[] f1390i0;
    public int f1391j0;
    public final b0 f1392k0;
    public String f1393l0;
    public final b0 m0;
    public final h6 f1394n;
    public int f1395n0;
    public boolean f1396o0;
    public long f1397p0;
    public long f1398q0;
    public long f1400r0;
    public s0 f1401s;
    public final sa f1402s0;
    public final b0 f1403t0;
    public final b0 f1404u0;
    public final b0 f1405v0;
    public m1 f1406w;
    public LinearGradient f1407w0;
    public boolean f1409x0;
    public float f1411y0;
    public final Matrix f1412z0;
    public int f1399r = 0;
    public final u0 f1408x = new u0();
    public final RectF f1410y = new RectF();
    public final int[] E = new int[2];
    public g K = h.f1212c;
    public String M = "";
    public long S = -100000;
    public final RectF Z = new RectF();

    public p0(Context context, sf sfVar) {
        new Rect();
        this.f1383d0 = -6440822;
        this.f1385e0 = new a3.l(11);
        this.f1388g0 = new ah.j(this, 1);
        this.f1392k0 = new b0(this, 8);
        this.m0 = new b0(this, 9);
        this.f1402s0 = new sa(this, 1);
        this.f1403t0 = new b0(this, 10);
        this.f1404u0 = new b0(this, 11);
        this.f1405v0 = new b0(this, 0);
        this.f1412z0 = new Matrix();
        this.B0 = new int[2];
        this.C0 = new int[2];
        this.D0 = new float[2];
        this.H0 = new j0(this, 0);
        this.h = context;
        this.f1386f = sfVar;
        this.f1394n = sfVar.f39580a.M4;
    }

    public static void G(TLRPC.TL_error tL_error) {
        lc Y = lc.Y();
        if (Y == null) {
            return;
        }
        if (tL_error != null && ("AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            Y.I(2131624217, gd.N0(2131754989, null), org.telegram.messenger.g0.W2(gd.N0(2131754990, null))).j();
        } else if (tL_error != null) {
            Y.g0(tL_error, false);
        } else {
            Log.d("Dictation", "style request failed (no error from the server)");
        }
    }

    public static String H(String str) {
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        t J = DictationAsr.J(language);
        if (J != null && J.d(language).length >= 2) {
            return N(DictationAsr.d0(J, language));
        }
        return q(str);
    }

    public static String N(String str) {
        String O = O(str);
        if (O == null) {
            return q(str);
        }
        return q(str) + " (" + O + ")";
    }

    public static String O(String str) {
        String str2;
        String[] split = str.split("-");
        if (split.length < 2) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("Language");
        for (String str3 : split) {
            sb2.append(d(str3));
        }
        String L0 = gd.L0(sb2.toString());
        if (!TextUtils.isEmpty(L0)) {
            return L0;
        }
        Locale locale = gd.E0().f24269y;
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        boolean z10 = true;
        for (int i7 = 1; i7 < split.length; i7++) {
            if (split[i7].matches("[A-Za-z]{4}")) {
                str2 = new Locale.Builder().setScript(split[i7]).build().getDisplayScript(locale);
            } else {
                if (split[i7].matches("[A-Za-z]{2}|[0-9]{3}")) {
                    str2 = new Locale.Builder().setRegion(split[i7]).build().getDisplayCountry(locale);
                }
                str2 = null;
            }
            z10 = (TextUtils.isEmpty(str2) || str2.equalsIgnoreCase(split[i7])) ? false : false;
            if (i7 > 1) {
                sb3.append(", ");
                sb4.append(", ");
            }
            if (str2 != null && !str2.isEmpty()) {
                sb3.append(str2.substring(0, 1).toUpperCase(locale));
                sb3.append(str2.substring(1));
            }
            sb4.append(d(split[i7]));
        }
        if (z10) {
            return sb3.toString();
        }
        return sb4.toString();
    }

    public static String d(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb2.append(substring.toUpperCase(locale));
        sb2.append(str.substring(1).toLowerCase(locale));
        return sb2.toString();
    }

    public static String q(String str) {
        String str2;
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        Locale locale = gd.E0().f24269y;
        if (locale != null) {
            str2 = new Locale(language).getDisplayLanguage(locale);
        } else {
            str2 = null;
        }
        if (str2 != null && !str2.isEmpty() && !str2.equalsIgnoreCase(language)) {
            return str2.substring(0, 1).toUpperCase(locale) + str2.substring(1);
        }
        String Q0 = b31.Q0(language);
        if (Q0 != null) {
            return Q0;
        }
        return language;
    }

    public static int u(int i7, int i10, boolean z10) {
        int i11;
        int i12 = i7 | (-16777216);
        int i13 = i10 | (-16777216);
        int i14 = i12;
        for (int i15 = 1; i15 <= 20 && i0.a.g(i14, i13) < 4.5d; i15++) {
            if (z10) {
                i11 = -1;
            } else {
                i11 = -16777216;
            }
            i14 = i0.a.f(i15 * 0.04f, i12, i11);
        }
        return i14;
    }

    public final void A(String str) {
        e2 e2Var;
        DictationAsr.X(str);
        DictationAsr.t(DictationAsr.J(str));
        this.f1406w.setLanguage(H(str));
        if (this.f1399r == 1 && (e2Var = this.G) != null) {
            e2Var.p(str);
        }
    }

    public final void B() {
        Log.d("Dictation", "send from listening (" + w() + " chars)");
        e2 e2Var = this.G;
        if (e2Var != null) {
            e2Var.c();
        }
        this.G = null;
        org.telegram.messenger.g0.r(this.f1402s0);
        this.F.a();
        this.f1401s.setStopIsland(false);
        sf sfVar = this.f1386f;
        sfVar.f39580a.M1(null, true);
        D(false);
        this.P = 0.0f;
        this.f1406w.setIsland(false);
        this.f1406w.setSettings(false);
        this.f1406w.setStopMode(false);
        E();
        C(false);
        this.f1399r = 0;
        this.f1380b0 = 0.0f;
        ValueAnimator valueAnimator = this.f1382c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        sfVar.d(0.0f);
        this.f1401s.e();
        sfVar.b();
        sfVar.f39580a.v1();
    }

    public final void C(boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f1386f.f39580a;
        gf gfVar = chatActivityEnterView.F0;
        if (gfVar != null && z10) {
            chatActivityEnterView.F1 = false;
            if (gfVar != null) {
                gfVar.invalidate();
            }
        }
    }

    public final void D(boolean z10) {
        if (z10) {
            this.f1379b = 0L;
        }
        this.X = z10;
        jh.f fVar = this.f1378a0;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    public final void E() {
        bj bjVar;
        tl tlVar;
        bn bnVar = this.f1386f.f39580a.F3;
        if (bnVar != null) {
            bjVar = bnVar.A0;
        } else {
            bjVar = null;
        }
        if (bjVar == null || (tlVar = this.E0) == null) {
            return;
        }
        if (tlVar != bjVar) {
            j0 j0Var = this.H0;
            if (tlVar != null) {
                tlVar.q0(j0Var);
            }
            this.E0 = bjVar;
            bjVar.i(j0Var);
        }
        ValueAnimator valueAnimator = this.G0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F0, 0.0f);
        this.G0 = ofFloat;
        ofFloat.addUpdateListener(new c0(this, 2));
        this.G0.addListener(new k0(this, 0));
        this.G0.setDuration(300L);
        this.G0.setInterpolator(nr.h);
        this.G0.start();
    }

    public final void F(float f10, float f11) {
        s0 s0Var = this.f1401s;
        if (s0Var != null && (s0Var.f1454a1 != f10 || s0Var.Z0 != f11)) {
            s0Var.f1454a1 = f10;
            s0Var.Z0 = f11;
            s0Var.invalidate();
        }
        m1 m1Var = this.f1406w;
        if (m1Var != null) {
            if (m1Var.m0 != f10 || m1Var.f1307l0 != f11) {
                m1Var.m0 = f10;
                m1Var.f1307l0 = f11;
                m1Var.invalidate();
            }
        }
    }

    public final void I(boolean z10) {
        int length;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        long j3;
        h hVar;
        int i7 = this.f1399r;
        if (i7 != 1 && i7 != 2) {
            this.f1396o0 = z10;
            if (i7 == 4 && (hVar = this.H) != null) {
                hVar.b();
            }
            j();
            ValueAnimator valueAnimator = this.A0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            String str2 = null;
            this.A0 = null;
            sf sfVar = this.f1386f;
            ChatActivityEnterView chatActivityEnterView = sfVar.f39580a;
            chatActivityEnterView.A1 = 0.0f;
            chatActivityEnterView.m2();
            Editable text = sfVar.f39580a.F0.getText();
            int i10 = this.f1399r;
            if (i10 == 3 || i10 == 4) {
                this.f1406w.a();
                this.f1406w.setIsland(false);
                this.f1406w.setRevert(false);
                this.f1406w.setSettings(false);
                E();
                j2 j2Var = this.F;
                if (j2Var != null) {
                    j2Var.f(false);
                }
            }
            this.J = null;
            this.K = h.f1212c;
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
            this.f1399r = 1;
            sfVar.b();
            this.U = SystemClock.uptimeMillis();
            org.telegram.messenger.g0.r(this.f1392k0);
            b0 b0Var = this.m0;
            DictationAsr.R(b0Var);
            DictationAsr.f43069g.add(b0Var);
            M(true);
            if (!z10) {
                b(1.0f, 220L, nr.h);
            }
            org.telegram.messenger.g0.r(this.f1403t0);
            s0 s0Var = this.f1401s;
            float[] fArr = this.f1389h0;
            int i11 = this.f1395n0;
            s0Var.getClass();
            if (fArr != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            s0Var.R = z11;
            if (z11) {
                s0Var.S = fArr[0] - s0Var.getLeft();
                s0Var.T = fArr[1] - s0Var.getTop();
                s0Var.U.setColor(i11);
            }
            s0 s0Var2 = this.f1401s;
            float[] fArr2 = this.f1390i0;
            int i12 = this.f1391j0;
            int[] iArr = s0Var2.f1483o0;
            if (fArr2 != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            s0Var2.A0 = z12;
            if (z12) {
                s0Var2.getLocationInWindow(iArr);
                s0Var2.B0 = fArr2[0] - iArr[0];
                s0Var2.C0 = fArr2[1] - iArr[1];
                s0Var2.D0 = fArr2[2];
                s0Var2.E0 = i12;
                s0Var2.F0 = 0L;
                if (s0Var2.J0 == null) {
                    s0Var2.J0 = s0Var2.getResources().getDrawable(2131231508).mutate();
                }
                s0Var2.J0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            StringBuilder sb2 = new StringBuilder("commit morph from circle ");
            if (this.f1390i0 == null) {
                str = "null";
            } else {
                str = ((int) this.f1390i0[0]) + "," + ((int) this.f1390i0[1]) + " r" + ((int) this.f1390i0[2]);
            }
            p5.c.t(sb2, str, "Dictation");
            this.f1390i0 = null;
            this.f1389h0 = null;
            if (!z10) {
                this.f1401s.setShown(true);
                this.f1401s.setRightMode(0);
            }
            this.f1408x.f();
            D(true);
            C(true);
            if (!z10) {
                this.f1401s.setStopIsland(true);
            }
            String a02 = DictationAsr.a0();
            m1 m1Var = this.f1406w;
            if (a02 != null) {
                str2 = H(a02);
            }
            m1Var.setLanguage(str2);
            this.f1406w.setSettings(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f1400r0 = uptimeMillis;
            this.f1398q0 = uptimeMillis;
            this.U = uptimeMillis;
            this.f1397p0 = 0L;
            if (!z10) {
                org.telegram.messenger.g0.h3(this.f1402s0, 300L);
            }
            if (mp.g1().getInt("design_dictation_mode", 1) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            ChatActivityEnterView chatActivityEnterView2 = sfVar.f39580a;
            this.G = new e2(this.h, chatActivityEnterView2.R, chatActivityEnterView2.G3, z13, this);
            gf gfVar = sfVar.f39580a.F0;
            if (gfVar != null) {
                gfVar.n1 = true;
            }
            Log.d("Dictation", "start simulated=" + z13);
            e2 e2Var = this.G;
            e2Var.m();
            a1.e eVar = new a1.e(14, this, e2Var);
            if (!z13 && !z10) {
                j3 = 420;
            } else {
                j3 = 120;
            }
            org.telegram.messenger.g0.h3(eVar, j3);
        }
    }

    public final ArrayList J() {
        j();
        ArrayList arrayList = new ArrayList();
        arrayList.add(h.f1212c);
        arrayList.addAll(this.H.c());
        return arrayList;
    }

    public final void K() {
        Editable text = this.f1386f.f39580a.F0.getText();
        if (text != null && text.length() > 0 && text.length() == this.I && Character.isWhitespace(text.charAt(text.length() - 1))) {
            this.L = true;
            text.delete(text.length() - 1, text.length());
            this.L = false;
        }
    }

    public final void L() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        Drawable backgroundImage;
        if (!this.f1387f0) {
            this.f1387f0 = true;
            ArrayList arrayList = v0.f1570g;
            a3.l lVar = this.f1385e0;
            if (!arrayList.contains(lVar)) {
                arrayList.add(lVar);
            }
        }
        try {
            du0 du0Var = this.f1386f.f39580a.f32588c2;
            if (du0Var != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (backgroundImage = du0Var.getBackgroundImage()) != null) {
                Bitmap createBitmap = Bitmap.createBitmap(8, 8, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Rect rect = new Rect(backgroundImage.getBounds());
                backgroundImage.setBounds(0, 0, 8, 8);
                backgroundImage.draw(canvas);
                backgroundImage.setBounds(rect);
                long j3 = 0;
                long j10 = 0;
                long j11 = 0;
                for (int i14 = 0; i14 < 8; i14++) {
                    for (int i15 = 0; i15 < 8; i15++) {
                        int pixel = createBitmap.getPixel(i15, i14);
                        j3 += Color.red(pixel);
                        j10 += Color.green(pixel);
                        j11 += Color.blue(pixel);
                    }
                }
                createBitmap.recycle();
                this.f1383d0 = Color.rgb((int) (j3 / 64), (int) (j10 / 64), (int) (j11 / 64));
            }
        } catch (Throwable unused) {
        }
        int i16 = m6.f29378d6;
        h6 h6Var = this.f1394n;
        int w02 = m6.w0(i16, h6Var);
        boolean c10 = u0.c(w02);
        u0 u0Var = this.f1408x;
        if (u0Var.h != c10) {
            u0Var.h = c10;
        }
        int i17 = m6.Pe;
        u0.h(m6.w0(i17, h6Var));
        u0Var.g(this.f1383d0, m6.w0(i17, h6Var));
        int[] iArr = u0Var.B;
        int i18 = iArr[0];
        int i19 = iArr[1];
        if (l2.f1282e != i18 || l2.f1283f != i19) {
            l2.f1282e = i18;
            l2.f1283f = i19;
            Arrays.fill(l2.f1284g[0], (Object) null);
        }
        if (this.f1401s != null) {
            int w03 = m6.w0(i17, h6Var) | (-16777216);
            s0 s0Var = this.f1401s;
            int f10 = i0.a.f(0.1f, w03, iArr[6]);
            int i20 = iArr[4];
            s0Var.f1465e1 = w03;
            s0Var.f1468f1 = f10;
            s0Var.f1470g1 = i20;
            if (!s0Var.f1484p0) {
                s0Var.f1485q0 = w03;
                s0Var.f1487r0 = f10;
                s0Var.f1489s0 = null;
                s0Var.invalidate();
            }
            this.f1401s.setDayIconBase(m6.w0(m6.Nl, h6Var));
        }
        this.f1407w0 = null;
        jh.f fVar = this.f1378a0;
        if (fVar != null) {
            fVar.invalidate();
        }
        s0 s0Var2 = this.f1401s;
        if (s0Var2 != null) {
            int i21 = m6.Nl;
            int w04 = m6.w0(i21, h6Var);
            int w05 = m6.w0(i17, h6Var);
            s0Var2.d.setColor(w04);
            s0Var2.f1463e.setColor(w05);
            s0Var2.f1466f.setColor(w05);
            s0Var2.invalidate();
            s0 s0Var3 = this.f1401s;
            int w06 = m6.w0(i21, h6Var);
            Paint paint = s0Var3.f1461d0;
            Paint paint2 = s0Var3.f1459c0;
            s0Var3.f1484p0 = c10;
            if (c10) {
                i7 = u0.e(-13665281);
            } else {
                i7 = s0Var3.f1465e1;
            }
            s0Var3.f1485q0 = i7;
            if (c10) {
                i10 = u0.e(-7447553);
            } else {
                i10 = s0Var3.f1468f1;
            }
            s0Var3.f1487r0 = i10;
            s0Var3.f1489s0 = null;
            Paint paint3 = s0Var3.f1456b0;
            if (c10) {
                i11 = 1714435648;
            } else {
                i11 = -1493172225;
            }
            paint3.setColor(i11);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
            if (c10) {
                i12 = 654311423;
            } else {
                i12 = 436207616;
            }
            paint2.setColor(i12);
            paint.setColor(16777216);
            float N = org.telegram.messenger.g0.N(1.0f);
            float N2 = org.telegram.messenger.g0.N(0.33333334f);
            if (c10) {
                i13 = 1711276032;
            } else {
                i13 = 855638016;
            }
            paint.setShadowLayer(N, 0.0f, N2, i13);
            s0Var3.f1464e0.setColor(w06);
            s0Var3.invalidate();
            this.f1401s.setSendIconColor(m6.w0(m6.Tf, h6Var));
        }
        j2 j2Var = this.F;
        if (j2Var != null) {
            j2Var.c(u(m6.w0(i17, h6Var), w02, c10), m6.w0(m6.Le, h6Var), c10);
        }
        m1 m1Var = this.f1406w;
        if (m1Var != null) {
            m1Var.e();
        }
    }

    public final void M(boolean z10) {
        long[] jArr;
        String str;
        boolean z11;
        if (!DictationAsr.H(new long[2])) {
            str = null;
        } else {
            str = " " + gd.a0(null, null, 2131745063, Long.valueOf(Math.round(jArr[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(jArr[1] / 1048576.0d))));
        }
        if (!z10 && TextUtils.equals(str, this.f1393l0)) {
            return;
        }
        this.f1393l0 = str;
        sf sfVar = this.f1386f;
        if (str == null) {
            sfVar.f39580a.M1(gd.N0(2131745054, null), true);
            return;
        }
        String N0 = gd.N0(2131745062, null);
        ChatActivityEnterView chatActivityEnterView = sfVar.f39580a;
        CharSequence charSequence = chatActivityEnterView.f32601e;
        if (charSequence != null && charSequence.toString().startsWith(N0.toString())) {
            z11 = true;
        } else {
            z11 = false;
        }
        chatActivityEnterView.M1(TextUtils.concat(N0, str), !z11);
    }

    @Override
    public final void a(String str, String str2) {
        if (!p()) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            String y10 = y(str);
            if (this.N <= 0 || !y10.isEmpty()) {
                this.L = true;
                this.F.e(this.I, -1, y10);
                this.L = false;
            }
        }
        j2 j2Var = this.F;
        Editable editableText = j2Var.f1247a.getEditableText();
        if (editableText != null) {
            j2Var.d(editableText, editableText.length());
        }
        sf sfVar = this.f1386f;
        gf gfVar = sfVar.f39580a.F0;
        InputMethodManager inputMethodManager = (InputMethodManager) this.h.getSystemService("input_method");
        if (inputMethodManager != null && gfVar != null) {
            inputMethodManager.restartInput(gfVar);
        }
        this.G = null;
        if (str2 != null) {
            Log.d("Dictation", "stopped with error: ".concat(str2));
        }
        if (w() <= 0 && (this.N <= 0 || sfVar.f39580a.F0.getText().toString().trim().length() <= 0)) {
            g();
            K();
            this.f1406w.setIsland(false);
            this.f1406w.setSettings(false);
            this.f1406w.setStopMode(false);
            E();
            this.f1399r = 0;
            sfVar.b();
            return;
        }
        this.f1399r = 3;
        sfVar.b();
        this.I = 0;
        this.f1401s.setCancelShown(false);
        if (!this.f1396o0) {
            e();
        }
        this.f1401s.setHandOff(true);
        this.f1401s.setRightMode(2);
        sfVar.f39580a.M1(null, true);
        D(false);
        this.P = 0.0f;
        org.telegram.messenger.g0.h3(this.f1403t0, 460L);
        this.f1406w.setStopMode(false);
        this.f1406w.d(gd.N0(2131745060, null), false);
        gf gfVar2 = sfVar.f39580a.F0;
        gfVar2.setSelection(gfVar2.length());
        if (!this.f1396o0) {
            gfVar2.requestFocus();
            org.telegram.messenger.g0.h3(new a3.f(gfVar2, 7), 120L);
        }
        org.telegram.messenger.g0.h3(new b0(this, 7), 90L);
    }

    public final void b(float f10, long j3, TimeInterpolator timeInterpolator) {
        ValueAnimator valueAnimator = this.f1382c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f1380b0, f10);
        this.f1382c0 = ofFloat;
        ofFloat.addUpdateListener(new c0(this, 1));
        this.f1382c0.setDuration(j3);
        this.f1382c0.setInterpolator(timeInterpolator);
        this.f1382c0.start();
    }

    public final void c(g gVar) {
        boolean z10;
        String a02;
        if (this.f1399r == 3) {
            if (this.I > this.f1386f.f39580a.F0.length()) {
                this.I = 0;
            }
            String str = this.J;
            if (str != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (str == null) {
                this.J = z();
            }
            String str2 = this.J;
            if (TextUtils.isEmpty(str2.trim())) {
                if (!z10) {
                    this.J = null;
                    return;
                }
                return;
            }
            this.f1399r = 4;
            this.f1379b = 0L;
            this.V = SystemClock.uptimeMillis();
            m1 m1Var = this.f1406w;
            if (gVar.d) {
                a02 = gd.N0(2131745059, null);
            } else {
                a02 = gd.a0(null, null, 2131745069, gVar.a());
            }
            m1Var.d(a02, true);
            this.F.a();
            this.F.f(true);
            this.f1408x.f();
            s0 s0Var = this.f1401s;
            if (s0Var != null) {
                s0Var.R0 = SystemClock.uptimeMillis();
                s0Var.setVisibility(0);
                s0Var.f1497y = true;
                s0Var.E = false;
                s0Var.R = false;
                s0Var.A0 = false;
                s0Var.L0 = false;
                s0Var.f1479l0 = false;
                s0Var.l1 = false;
                s0Var.F.e(true, 1.0f);
                s0Var.G.e(true, 0.0f);
                s0Var.H.e(true, 0.0f);
                s0Var.I.e(true, 0.0f);
                s0Var.J.e(true, 1.0f);
                s0Var.O0.e(true, 0.0f);
                s0Var.f1457b1 = 0L;
                s0Var.N0.e(true, 1.0f);
                s0Var.L = 3;
                s0Var.invalidate();
            }
            jh.f fVar = this.f1378a0;
            if (fVar != null) {
                fVar.invalidate();
            }
            g gVar2 = this.K;
            this.K = gVar;
            this.H.a(gVar, str2, new a3.g(this, gVar2, z10, gVar, 1));
        }
    }

    public final void e() {
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A0 = ofFloat;
        ofFloat.addUpdateListener(new c0(this, 0));
        this.A0.setDuration(220L);
        this.A0.setInterpolator(nr.f37957g);
        this.A0.start();
    }

    public final void f(long j3, long j10) {
        s0 s0Var = this.f1401s;
        if (s0Var == null) {
            return;
        }
        if (s0Var.L == 3) {
            s0Var.f1457b1 = SystemClock.uptimeMillis() + j3;
            s0Var.f1460c1 = Math.max(1L, j10);
            s0Var.invalidate();
        }
        org.telegram.messenger.g0.h3(new b0(this, 6), j3 + j10 + 60);
    }

    public final void g() {
        org.telegram.messenger.g0.r(this.f1402s0);
        s0 s0Var = this.f1401s;
        if (s0Var != null) {
            s0Var.setStopIsland(false);
        }
        org.telegram.messenger.g0.r(this.f1403t0);
        org.telegram.messenger.g0.r(this.f1392k0);
        b0 b0Var = this.f1404u0;
        org.telegram.messenger.g0.r(b0Var);
        b0 b0Var2 = this.f1405v0;
        org.telegram.messenger.g0.r(b0Var2);
        s0 s0Var2 = this.f1401s;
        s0Var2.L0 = true;
        s0Var2.R = false;
        SystemClock.uptimeMillis();
        if (s0Var2.J0 == null) {
            Drawable mutate = s0Var2.getResources().getDrawable(2131231508).mutate();
            s0Var2.J0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        s0Var2.invalidate();
        if (!this.f1396o0) {
            e();
        }
        D(false);
        this.P = 0.0f;
        org.telegram.messenger.g0.h3(b0Var, 30L);
        org.telegram.messenger.g0.h3(b0Var2, 310L);
    }

    @Override
    public final void h(float f10) {
        ChatActivityEnterView chatActivityEnterView;
        ChatActivityEnterView.RecordCircle recordCircle;
        this.P = f10;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (f10 > 0.38f) {
            if (this.f1397p0 == 0) {
                this.f1397p0 = uptimeMillis;
            }
            if (uptimeMillis - this.f1397p0 >= 150) {
                this.U = uptimeMillis;
            }
        } else {
            this.f1397p0 = 0L;
        }
        s0 s0Var = this.f1401s;
        if (s0Var != null) {
            s0Var.setLevel(f10);
        }
        if (this.f1396o0 && (recordCircle = (chatActivityEnterView = this.f1386f.f39580a).D2) != null && chatActivityEnterView.f32733v3) {
            recordCircle.setAmplitude(f10 * 1800.0f);
        }
    }

    @Override
    public final void i(String str) {
        l(-1, str);
    }

    public final void j() {
        fh.g gVar;
        gh.a aVar;
        d6 d6Var;
        sf sfVar = this.f1386f;
        du0 du0Var = sfVar.f39580a.f32588c2;
        s0 s0Var = this.f1401s;
        Context context = this.h;
        if (s0Var == null) {
            s0 s0Var2 = new s0(context, this);
            this.f1401s = s0Var2;
            s0Var2.setBorderColorSource(new a0(this, 0));
            this.f1401s.setVisibility(8);
        }
        if (this.f1401s.getParent() != du0Var) {
            org.telegram.messenger.g0.E2(this.f1401s);
            du0Var.addView(this.f1401s, ma.e(-1, -1, 80));
        } else {
            this.f1401s.bringToFront();
        }
        s0 s0Var3 = this.f1401s;
        ChatActivityEnterView chatActivityEnterView = sfVar.f39580a;
        fe feVar = chatActivityEnterView.R0;
        oe oeVar = chatActivityEnterView.f32569a1;
        s0Var3.f1455b = feVar;
        s0Var3.f1458c = oeVar;
        s0Var3.setBubbleProvider(new cb.c(this, 4));
        if (this.f1406w == null) {
            this.f1406w = new m1(context, this.f1394n, this);
        }
        if (this.f1406w.getParent() != du0Var) {
            org.telegram.messenger.g0.E2(this.f1406w);
            du0Var.addView(this.f1406w, ma.e(-1, -1, 80));
        } else {
            this.f1406w.bringToFront();
        }
        ChatActivityEnterView chatActivityEnterView2 = sfVar.f39580a;
        int i7 = ChatActivityEnterView.f32566s7;
        jh.f D0 = chatActivityEnterView2.D0();
        jh.f fVar = this.f1378a0;
        if (D0 != fVar) {
            d6 d6Var2 = null;
            if (fVar != null) {
                fVar.f17802f = null;
            }
            this.f1378a0 = D0;
            if (D0 != null) {
                d6Var = new d6(D0, 0L, 380L, new nr(0.22d, 0.61d, 0.36d, 1.0d));
            } else {
                d6Var = null;
            }
            this.Y = d6Var;
            if (D0 != null) {
                d6Var2 = new d6(D0, 1L, 300L, nr.f37957g);
            }
            this.f1384e = d6Var2;
        }
        jh.f fVar2 = this.f1378a0;
        if (fVar2 != null) {
            fVar2.f17802f = new a0(this, 2);
            dh.c cVar = sfVar.f39580a.L1;
            if (cVar != null && (gVar = fVar2.f17803n) != null && (aVar = gVar.f11700w) != null) {
                fh.g c10 = cVar.c(this.f1406w, aVar, false);
                fh.g c11 = cVar.c(this.f1406w, this.f1378a0.f17803n.f11700w, false);
                m1 m1Var = this.f1406w;
                fh.g c12 = cVar.c(m1Var, this.f1378a0.f17803n.f11700w, false);
                m1Var.I = c10;
                m1Var.J = c11;
                m1Var.K = c12;
                c10.r(org.telegram.messenger.g0.L(18.0f));
                c11.r(org.telegram.messenger.g0.L(18.0f));
                c12.r(org.telegram.messenger.g0.L(18.0f));
                m1 m1Var2 = this.f1406w;
                m1Var2.setGearGlass(cVar.c(m1Var2, this.f1378a0.f17803n.f11700w, false));
                s0 s0Var4 = this.f1401s;
                if (s0Var4 != null) {
                    s0Var4.setStopGlass(cVar.c(s0Var4, new qb.a(2), false));
                }
            }
        }
        gf gfVar = sfVar.f39580a.F0;
        if (this.F == null) {
            j2 j2Var = new j2(gfVar);
            this.F = j2Var;
            j2Var.h = new a0(this, 4);
            this.f1377a = new n1(gfVar);
            gfVar.addTextChangedListener(this.f1388g0);
        }
        if (this.H == null) {
            this.H = new h(sfVar.f39580a.R);
        }
        L();
    }

    public final void k() {
        sf sfVar = this.f1386f;
        gf gfVar = sfVar.f39580a.F0;
        if (gfVar != null) {
            gfVar.n1 = false;
        }
        e2 e2Var = this.G;
        if (e2Var != null) {
            e2Var.c();
        }
        this.G = null;
        h hVar = this.H;
        if (hVar != null) {
            hVar.b();
        }
        if (p()) {
            g();
        }
        m1 m1Var = this.f1406w;
        if (m1Var != null) {
            m1Var.a();
            this.f1406w.setIsland(false);
            this.f1406w.setRevert(false);
            this.f1406w.setSettings(false);
        }
        this.J = null;
        this.f1399r = 0;
        D(false);
        n1 n1Var = this.f1377a;
        if (n1Var != null) {
            n1Var.c();
        }
        ChatActivityEnterView chatActivityEnterView = sfVar.f39580a;
        chatActivityEnterView.G1 = 0L;
        chatActivityEnterView.H1 = null;
        s0 s0Var = this.f1401s;
        if (s0Var != null && s0Var.getRightMode() == 3) {
            this.f1401s.e();
        }
        j2 j2Var = this.F;
        if (j2Var != null) {
            j2Var.f(false);
        }
        C(false);
        E();
        sfVar.b();
    }

    @Override
    public final void l(int i7, String str) {
        int max;
        if (!p()) {
            return;
        }
        this.f1398q0 = SystemClock.uptimeMillis();
        if (str == null) {
            str = "";
        }
        String y10 = y(str);
        if (i7 < 0) {
            max = -1;
        } else {
            max = Math.max(0, Math.min(y10.length(), i7 - (str.length() - y10.length())));
        }
        this.L = true;
        this.F.e(this.I, max, y10);
        this.L = false;
    }

    public final boolean m(RectF rectF) {
        fh.g gVar;
        jh.f fVar = this.f1378a0;
        if (fVar == null || (gVar = fVar.f17803n) == null) {
            return false;
        }
        Rect rect = gVar.R.f11675m;
        if (rect.isEmpty()) {
            return false;
        }
        jh.f fVar2 = this.f1378a0;
        int[] iArr = this.E;
        fVar2.getLocationInWindow(iArr);
        rectF.set(rect);
        rectF.offset(iArr[0], iArr[1]);
        return true;
    }

    public final boolean n() {
        if (this.f1399r != 0) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (this.f1396o0 && this.f1399r != 0) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        int i7 = this.f1399r;
        if (i7 == 1 || i7 == 2) {
            return true;
        }
        return false;
    }

    public final boolean r(float[] fArr) {
        gf gfVar = this.f1386f.f39580a.F0;
        if (this.f1378a0 == null || gfVar == null || gfVar.getLayout() == null) {
            return false;
        }
        jh.f fVar = this.f1378a0;
        int[] iArr = this.B0;
        fVar.getLocationInWindow(iArr);
        int[] iArr2 = this.C0;
        gfVar.getLocationInWindow(iArr2);
        fArr[0] = (gfVar.getTotalPaddingLeft() + (iArr2[0] - iArr[0])) - gfVar.getScrollX();
        fArr[1] = (gfVar.getTotalPaddingTop() + (iArr2[1] - iArr[1])) - gfVar.getScrollY();
        return true;
    }

    public final void s() {
        if (!p()) {
            return;
        }
        e2 e2Var = this.G;
        if (e2Var != null) {
            e2Var.c();
        }
        this.G = null;
        sf sfVar = this.f1386f;
        Editable text = sfVar.f39580a.F0.getText();
        if (text != null && this.I <= text.length()) {
            this.L = true;
            this.F.a();
            text.delete(this.I, text.length());
            this.L = false;
        }
        K();
        g();
        C(false);
        this.f1406w.setIsland(false);
        this.f1406w.setSettings(false);
        this.f1406w.setStopMode(false);
        E();
        this.f1399r = 0;
        sfVar.b();
    }

    public final void t() {
        if (this.f1399r == 1) {
            org.telegram.messenger.g0.r(this.f1402s0);
            this.f1399r = 2;
            this.f1401s.setStopIsland(false);
            this.f1401s.setRightMode(1);
            this.f1401s.setCancelShown(false);
            e2 e2Var = this.G;
            if (e2Var != null) {
                e2Var.u();
            }
        }
    }

    public final void v(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: ai.p0.v(java.lang.String):void");
    }

    public final int w() {
        Editable text = this.f1386f.f39580a.F0.getText();
        if (text == null) {
            return 0;
        }
        return Math.max(0, text.length() - Math.min(this.I, text.length()));
    }

    @Override
    public final void x(String str) {
        String H;
        m1 m1Var = this.f1406w;
        if (m1Var != null) {
            if (str == null) {
                H = null;
            } else {
                H = H(str);
            }
            m1Var.setLanguage(H);
        }
    }

    public final String y(String str) {
        String str2;
        this.M = str;
        if (this.N <= 0) {
            return str;
        }
        int length = str.length();
        int i7 = this.N;
        String str3 = "";
        if (length <= i7) {
            str2 = "";
        } else {
            str2 = str.substring(i7);
        }
        int i10 = 0;
        while (i10 < str2.length() && Character.isWhitespace(str2.charAt(i10))) {
            i10++;
        }
        String substring = str2.substring(i10);
        if (substring.isEmpty()) {
            return "";
        }
        if (this.O) {
            str3 = " ";
        }
        return str3.concat(substring);
    }

    public final String z() {
        Editable text = this.f1386f.f39580a.F0.getText();
        if (text == null) {
            return "";
        }
        return text.subSequence(Math.min(this.I, text.length()), text.length()).toString();
    }
}
