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
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
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
public final class p0 implements d2 {
    public static final nr I0 = new nr(0.3d, 0.0d, 0.2d, 1.0d);
    public ValueAnimator A0;
    public final int[] B0;
    public final int[] C0;
    public final float[] D0;
    public tl E0;
    public k2 F;
    public float F0;
    public f2 G;
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
    public o1 f1383a;
    public jh.f f1384a0;
    public long f1385b;
    public float f1386b0;
    public float f1387c;
    public ValueAnimator f1388c0;
    public boolean d;
    public int f1389d0;
    public d6 f1390e;
    public final a3.l f1391e0;
    public final sf f1392f;
    public boolean f1393f0;
    public final ah.j f1394g0;
    public final Context h;
    public float[] f1395h0;
    public float[] f1396i0;
    public int f1397j0;
    public final b0 f1398k0;
    public String f1399l0;
    public final b0 m0;
    public final h6 f1400n;
    public int f1401n0;
    public boolean f1402o0;
    public long f1403p0;
    public long f1404q0;
    public long f1406r0;
    public s0 f1407s;
    public final sa f1408s0;
    public final b0 f1409t0;
    public final b0 f1410u0;
    public final b0 f1411v0;
    public n1 f1412w;
    public LinearGradient f1413w0;
    public boolean f1415x0;
    public float f1417y0;
    public final Matrix f1418z0;
    public int f1405r = 0;
    public final u0 f1414x = new u0();
    public final RectF f1416y = new RectF();
    public final int[] E = new int[2];
    public g K = h.f1218c;
    public String M = "";
    public long S = -100000;
    public final RectF Z = new RectF();

    public p0(Context context, sf sfVar) {
        new Rect();
        this.f1389d0 = -6440822;
        this.f1391e0 = new a3.l(11);
        this.f1394g0 = new ah.j(this, 1);
        this.f1398k0 = new b0(this, 8);
        this.m0 = new b0(this, 9);
        this.f1408s0 = new sa(this, 1);
        this.f1409t0 = new b0(this, 10);
        this.f1410u0 = new b0(this, 11);
        this.f1411v0 = new b0(this, 0);
        this.f1418z0 = new Matrix();
        this.B0 = new int[2];
        this.C0 = new int[2];
        this.D0 = new float[2];
        this.H0 = new j0(this, 0);
        this.h = context;
        this.f1392f = sfVar;
        this.f1400n = sfVar.f39572a.M4;
    }

    public static void G(TLRPC.TL_error tL_error) {
        lc Y = lc.Y();
        if (Y == null) {
            return;
        }
        if (tL_error != null && ("AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            Y.I(2131624217, hd.N0(2131754989, null), org.telegram.messenger.g0.W2(hd.N0(2131754990, null))).j();
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
        String L0 = hd.L0(sb2.toString());
        if (!TextUtils.isEmpty(L0)) {
            return L0;
        }
        Locale locale = hd.E0().f24472y;
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
        Locale locale = hd.E0().f24472y;
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
        f2 f2Var;
        DictationAsr.X(str);
        DictationAsr.t(DictationAsr.J(str));
        this.f1412w.setLanguage(H(str));
        if (this.f1405r == 1 && (f2Var = this.G) != null) {
            f2Var.q(str);
        }
    }

    public final void B() {
        Log.d("Dictation", "send from listening (" + w() + " chars)");
        f2 f2Var = this.G;
        if (f2Var != null) {
            f2Var.d();
        }
        this.G = null;
        org.telegram.messenger.g0.r(this.f1408s0);
        this.F.a();
        this.f1407s.setStopIsland(false);
        sf sfVar = this.f1392f;
        sfVar.f39572a.M1(null, true);
        D(false);
        this.P = 0.0f;
        this.f1412w.setIsland(false);
        this.f1412w.setSettings(false);
        this.f1412w.setStopMode(false);
        E();
        C(false);
        this.f1405r = 0;
        this.f1386b0 = 0.0f;
        ValueAnimator valueAnimator = this.f1388c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        sfVar.d(0.0f);
        this.f1407s.e();
        sfVar.b();
        sfVar.f39572a.v1();
    }

    public final void C(boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f1392f.f39572a;
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
            this.f1385b = 0L;
        }
        this.X = z10;
        jh.f fVar = this.f1384a0;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    public final void E() {
        bj bjVar;
        tl tlVar;
        bn bnVar = this.f1392f.f39572a.F3;
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
        s0 s0Var = this.f1407s;
        if (s0Var != null && (s0Var.f1462a1 != f10 || s0Var.Z0 != f11)) {
            s0Var.f1462a1 = f10;
            s0Var.Z0 = f11;
            s0Var.invalidate();
        }
        n1 n1Var = this.f1412w;
        if (n1Var != null) {
            if (n1Var.m0 != f10 || n1Var.f1324l0 != f11) {
                n1Var.m0 = f10;
                n1Var.f1324l0 = f11;
                n1Var.invalidate();
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
        int i7 = this.f1405r;
        if (i7 != 1 && i7 != 2) {
            this.f1402o0 = z10;
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
            sf sfVar = this.f1392f;
            ChatActivityEnterView chatActivityEnterView = sfVar.f39572a;
            chatActivityEnterView.A1 = 0.0f;
            chatActivityEnterView.m2();
            Editable text = sfVar.f39572a.F0.getText();
            int i10 = this.f1405r;
            if (i10 == 3 || i10 == 4) {
                this.f1412w.a();
                this.f1412w.setIsland(false);
                this.f1412w.setRevert(false);
                this.f1412w.setSettings(false);
                E();
                k2 k2Var = this.F;
                if (k2Var != null) {
                    k2Var.f(false);
                }
            }
            this.J = null;
            this.K = h.f1218c;
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
            this.f1405r = 1;
            sfVar.b();
            this.U = SystemClock.uptimeMillis();
            org.telegram.messenger.g0.r(this.f1398k0);
            b0 b0Var = this.m0;
            DictationAsr.R(b0Var);
            DictationAsr.f43072g.add(b0Var);
            M(true);
            if (!z10) {
                b(1.0f, 220L, nr.h);
            }
            org.telegram.messenger.g0.r(this.f1409t0);
            s0 s0Var = this.f1407s;
            float[] fArr = this.f1395h0;
            int i11 = this.f1401n0;
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
            s0 s0Var2 = this.f1407s;
            float[] fArr2 = this.f1396i0;
            int i12 = this.f1397j0;
            int[] iArr = s0Var2.f1491o0;
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
            if (this.f1396i0 == null) {
                str = "null";
            } else {
                str = ((int) this.f1396i0[0]) + "," + ((int) this.f1396i0[1]) + " r" + ((int) this.f1396i0[2]);
            }
            p5.c.t(sb2, str, "Dictation");
            this.f1396i0 = null;
            this.f1395h0 = null;
            if (!z10) {
                this.f1407s.setShown(true);
                this.f1407s.setRightMode(0);
            }
            this.f1414x.f();
            D(true);
            C(true);
            if (!z10) {
                this.f1407s.setStopIsland(true);
            }
            String a02 = DictationAsr.a0();
            n1 n1Var = this.f1412w;
            if (a02 != null) {
                str2 = H(a02);
            }
            n1Var.setLanguage(str2);
            this.f1412w.setSettings(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f1406r0 = uptimeMillis;
            this.f1404q0 = uptimeMillis;
            this.U = uptimeMillis;
            this.f1403p0 = 0L;
            if (!z10) {
                org.telegram.messenger.g0.h3(this.f1408s0, 300L);
            }
            if (np.g1().getInt("design_dictation_mode", 1) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            ChatActivityEnterView chatActivityEnterView2 = sfVar.f39572a;
            this.G = new f2(this.h, chatActivityEnterView2.R, chatActivityEnterView2.G3, z13, this);
            gf gfVar = sfVar.f39572a.F0;
            if (gfVar != null) {
                gfVar.n1 = true;
            }
            Log.d("Dictation", "start simulated=" + z13);
            f2 f2Var = this.G;
            f2Var.n();
            a1.e eVar = new a1.e(14, this, f2Var);
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
        arrayList.add(h.f1218c);
        arrayList.addAll(this.H.c());
        return arrayList;
    }

    public final void K() {
        Editable text = this.f1392f.f39572a.F0.getText();
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
        if (!this.f1393f0) {
            this.f1393f0 = true;
            ArrayList arrayList = v0.f1572g;
            a3.l lVar = this.f1391e0;
            if (!arrayList.contains(lVar)) {
                arrayList.add(lVar);
            }
        }
        try {
            du0 du0Var = this.f1392f.f39572a.f32591c2;
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
                this.f1389d0 = Color.rgb((int) (j3 / 64), (int) (j10 / 64), (int) (j11 / 64));
            }
        } catch (Throwable unused) {
        }
        int i16 = m6.f29381d6;
        h6 h6Var = this.f1400n;
        int w02 = m6.w0(i16, h6Var);
        boolean c10 = u0.c(w02);
        u0 u0Var = this.f1414x;
        if (u0Var.h != c10) {
            u0Var.h = c10;
        }
        int i17 = m6.Pe;
        u0.h(m6.w0(i17, h6Var));
        u0Var.g(this.f1389d0, m6.w0(i17, h6Var));
        int[] iArr = u0Var.B;
        int i18 = iArr[0];
        int i19 = iArr[1];
        if (m2.f1301e != i18 || m2.f1302f != i19) {
            m2.f1301e = i18;
            m2.f1302f = i19;
            Arrays.fill(m2.f1303g[0], (Object) null);
        }
        if (this.f1407s != null) {
            int w03 = m6.w0(i17, h6Var) | (-16777216);
            s0 s0Var = this.f1407s;
            int f10 = i0.a.f(0.1f, w03, iArr[6]);
            int i20 = iArr[4];
            s0Var.f1473e1 = w03;
            s0Var.f1476f1 = f10;
            s0Var.f1478g1 = i20;
            if (!s0Var.f1492p0) {
                s0Var.f1493q0 = w03;
                s0Var.f1495r0 = f10;
                s0Var.f1497s0 = null;
                s0Var.invalidate();
            }
            this.f1407s.setDayIconBase(m6.w0(m6.Nl, h6Var));
        }
        this.f1413w0 = null;
        jh.f fVar = this.f1384a0;
        if (fVar != null) {
            fVar.invalidate();
        }
        s0 s0Var2 = this.f1407s;
        if (s0Var2 != null) {
            int i21 = m6.Nl;
            int w04 = m6.w0(i21, h6Var);
            int w05 = m6.w0(i17, h6Var);
            s0Var2.d.setColor(w04);
            s0Var2.f1471e.setColor(w05);
            s0Var2.f1474f.setColor(w05);
            s0Var2.invalidate();
            s0 s0Var3 = this.f1407s;
            int w06 = m6.w0(i21, h6Var);
            Paint paint = s0Var3.f1469d0;
            Paint paint2 = s0Var3.f1467c0;
            s0Var3.f1492p0 = c10;
            if (c10) {
                i7 = u0.e(-13665281);
            } else {
                i7 = s0Var3.f1473e1;
            }
            s0Var3.f1493q0 = i7;
            if (c10) {
                i10 = u0.e(-7447553);
            } else {
                i10 = s0Var3.f1476f1;
            }
            s0Var3.f1495r0 = i10;
            s0Var3.f1497s0 = null;
            Paint paint3 = s0Var3.f1464b0;
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
            s0Var3.f1472e0.setColor(w06);
            s0Var3.invalidate();
            this.f1407s.setSendIconColor(m6.w0(m6.Tf, h6Var));
        }
        k2 k2Var = this.F;
        if (k2Var != null) {
            k2Var.c(u(m6.w0(i17, h6Var), w02, c10), m6.w0(m6.Le, h6Var), c10);
        }
        n1 n1Var = this.f1412w;
        if (n1Var != null) {
            n1Var.e();
        }
    }

    public final void M(boolean z10) {
        long[] jArr;
        String str;
        boolean z11;
        if (!DictationAsr.H(new long[2])) {
            str = null;
        } else {
            str = " " + hd.a0(null, null, 2131745063, Long.valueOf(Math.round(jArr[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(jArr[1] / 1048576.0d))));
        }
        if (!z10 && TextUtils.equals(str, this.f1399l0)) {
            return;
        }
        this.f1399l0 = str;
        sf sfVar = this.f1392f;
        if (str == null) {
            sfVar.f39572a.M1(hd.N0(2131745054, null), true);
            return;
        }
        String N0 = hd.N0(2131745062, null);
        ChatActivityEnterView chatActivityEnterView = sfVar.f39572a;
        CharSequence charSequence = chatActivityEnterView.f32604e;
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
        k2 k2Var = this.F;
        Editable editableText = k2Var.f1266a.getEditableText();
        if (editableText != null) {
            k2Var.d(editableText, editableText.length());
        }
        sf sfVar = this.f1392f;
        gf gfVar = sfVar.f39572a.F0;
        InputMethodManager inputMethodManager = (InputMethodManager) this.h.getSystemService("input_method");
        if (inputMethodManager != null && gfVar != null) {
            inputMethodManager.restartInput(gfVar);
        }
        this.G = null;
        if (str2 != null) {
            Log.d("Dictation", "stopped with error: ".concat(str2));
        }
        if (w() <= 0 && (this.N <= 0 || sfVar.f39572a.F0.getText().toString().trim().length() <= 0)) {
            g();
            K();
            this.f1412w.setIsland(false);
            this.f1412w.setSettings(false);
            this.f1412w.setStopMode(false);
            E();
            this.f1405r = 0;
            sfVar.b();
            return;
        }
        this.f1405r = 3;
        sfVar.b();
        this.I = 0;
        this.f1407s.setCancelShown(false);
        if (!this.f1402o0) {
            e();
        }
        this.f1407s.setHandOff(true);
        this.f1407s.setRightMode(2);
        sfVar.f39572a.M1(null, true);
        D(false);
        this.P = 0.0f;
        org.telegram.messenger.g0.h3(this.f1409t0, 460L);
        this.f1412w.setStopMode(false);
        this.f1412w.d(hd.N0(2131745060, null), false);
        gf gfVar2 = sfVar.f39572a.F0;
        gfVar2.setSelection(gfVar2.length());
        if (!this.f1402o0) {
            gfVar2.requestFocus();
            org.telegram.messenger.g0.h3(new a3.f(gfVar2, 7), 120L);
        }
        org.telegram.messenger.g0.h3(new b0(this, 7), 90L);
    }

    public final void b(float f10, long j3, TimeInterpolator timeInterpolator) {
        ValueAnimator valueAnimator = this.f1388c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f1386b0, f10);
        this.f1388c0 = ofFloat;
        ofFloat.addUpdateListener(new c0(this, 1));
        this.f1388c0.setDuration(j3);
        this.f1388c0.setInterpolator(timeInterpolator);
        this.f1388c0.start();
    }

    public final void c(g gVar) {
        boolean z10;
        String a02;
        if (this.f1405r == 3) {
            if (this.I > this.f1392f.f39572a.F0.length()) {
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
            this.f1405r = 4;
            this.f1385b = 0L;
            this.V = SystemClock.uptimeMillis();
            n1 n1Var = this.f1412w;
            if (gVar.d) {
                a02 = hd.N0(2131745059, null);
            } else {
                a02 = hd.a0(null, null, 2131745069, gVar.a());
            }
            n1Var.d(a02, true);
            this.F.a();
            this.F.f(true);
            this.f1414x.f();
            s0 s0Var = this.f1407s;
            if (s0Var != null) {
                s0Var.R0 = SystemClock.uptimeMillis();
                s0Var.setVisibility(0);
                s0Var.f1505y = true;
                s0Var.E = false;
                s0Var.R = false;
                s0Var.A0 = false;
                s0Var.L0 = false;
                s0Var.f1487l0 = false;
                s0Var.l1 = false;
                s0Var.F.e(true, 1.0f);
                s0Var.G.e(true, 0.0f);
                s0Var.H.e(true, 0.0f);
                s0Var.I.e(true, 0.0f);
                s0Var.J.e(true, 1.0f);
                s0Var.O0.e(true, 0.0f);
                s0Var.f1465b1 = 0L;
                s0Var.N0.e(true, 1.0f);
                s0Var.L = 3;
                s0Var.invalidate();
            }
            jh.f fVar = this.f1384a0;
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
        this.A0.setInterpolator(nr.f37961g);
        this.A0.start();
    }

    public final void f(long j3, long j10) {
        s0 s0Var = this.f1407s;
        if (s0Var == null) {
            return;
        }
        if (s0Var.L == 3) {
            s0Var.f1465b1 = SystemClock.uptimeMillis() + j3;
            s0Var.f1468c1 = Math.max(1L, j10);
            s0Var.invalidate();
        }
        org.telegram.messenger.g0.h3(new b0(this, 6), j3 + j10 + 60);
    }

    public final void g() {
        org.telegram.messenger.g0.r(this.f1408s0);
        s0 s0Var = this.f1407s;
        if (s0Var != null) {
            s0Var.setStopIsland(false);
        }
        org.telegram.messenger.g0.r(this.f1409t0);
        org.telegram.messenger.g0.r(this.f1398k0);
        b0 b0Var = this.f1410u0;
        org.telegram.messenger.g0.r(b0Var);
        b0 b0Var2 = this.f1411v0;
        org.telegram.messenger.g0.r(b0Var2);
        s0 s0Var2 = this.f1407s;
        s0Var2.L0 = true;
        s0Var2.R = false;
        SystemClock.uptimeMillis();
        if (s0Var2.J0 == null) {
            Drawable mutate = s0Var2.getResources().getDrawable(2131231508).mutate();
            s0Var2.J0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        s0Var2.invalidate();
        if (!this.f1402o0) {
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
            if (this.f1403p0 == 0) {
                this.f1403p0 = uptimeMillis;
            }
            if (uptimeMillis - this.f1403p0 >= 150) {
                this.U = uptimeMillis;
            }
        } else {
            this.f1403p0 = 0L;
        }
        s0 s0Var = this.f1407s;
        if (s0Var != null) {
            s0Var.setLevel(f10);
        }
        if (this.f1402o0 && (recordCircle = (chatActivityEnterView = this.f1392f.f39572a).D2) != null && chatActivityEnterView.f32736v3) {
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
        sf sfVar = this.f1392f;
        du0 du0Var = sfVar.f39572a.f32591c2;
        s0 s0Var = this.f1407s;
        Context context = this.h;
        if (s0Var == null) {
            s0 s0Var2 = new s0(context, this);
            this.f1407s = s0Var2;
            s0Var2.setBorderColorSource(new a0(this, 0));
            this.f1407s.setVisibility(8);
        }
        if (this.f1407s.getParent() != du0Var) {
            org.telegram.messenger.g0.E2(this.f1407s);
            du0Var.addView(this.f1407s, ma.e(-1, -1, 80));
        } else {
            this.f1407s.bringToFront();
        }
        s0 s0Var3 = this.f1407s;
        ChatActivityEnterView chatActivityEnterView = sfVar.f39572a;
        fe feVar = chatActivityEnterView.R0;
        oe oeVar = chatActivityEnterView.f32572a1;
        s0Var3.f1463b = feVar;
        s0Var3.f1466c = oeVar;
        s0Var3.setBubbleProvider(new cb.c(this, 4));
        if (this.f1412w == null) {
            this.f1412w = new n1(context, this.f1400n, this);
        }
        if (this.f1412w.getParent() != du0Var) {
            org.telegram.messenger.g0.E2(this.f1412w);
            du0Var.addView(this.f1412w, ma.e(-1, -1, 80));
        } else {
            this.f1412w.bringToFront();
        }
        ChatActivityEnterView chatActivityEnterView2 = sfVar.f39572a;
        int i7 = ChatActivityEnterView.f32569s7;
        jh.f D0 = chatActivityEnterView2.D0();
        jh.f fVar = this.f1384a0;
        if (D0 != fVar) {
            d6 d6Var2 = null;
            if (fVar != null) {
                fVar.f17805f = null;
            }
            this.f1384a0 = D0;
            if (D0 != null) {
                d6Var = new d6(D0, 0L, 380L, new nr(0.22d, 0.61d, 0.36d, 1.0d));
            } else {
                d6Var = null;
            }
            this.Y = d6Var;
            if (D0 != null) {
                d6Var2 = new d6(D0, 1L, 300L, nr.f37961g);
            }
            this.f1390e = d6Var2;
        }
        jh.f fVar2 = this.f1384a0;
        if (fVar2 != null) {
            fVar2.f17805f = new a0(this, 2);
            dh.c cVar = sfVar.f39572a.L1;
            if (cVar != null && (gVar = fVar2.f17806n) != null && (aVar = gVar.f11703w) != null) {
                fh.g c10 = cVar.c(this.f1412w, aVar, false);
                fh.g c11 = cVar.c(this.f1412w, this.f1384a0.f17806n.f11703w, false);
                n1 n1Var = this.f1412w;
                fh.g c12 = cVar.c(n1Var, this.f1384a0.f17806n.f11703w, false);
                n1Var.I = c10;
                n1Var.J = c11;
                n1Var.K = c12;
                c10.r(org.telegram.messenger.g0.L(18.0f));
                c11.r(org.telegram.messenger.g0.L(18.0f));
                c12.r(org.telegram.messenger.g0.L(18.0f));
                n1 n1Var2 = this.f1412w;
                n1Var2.setGearGlass(cVar.c(n1Var2, this.f1384a0.f17806n.f11703w, false));
                s0 s0Var4 = this.f1407s;
                if (s0Var4 != null) {
                    s0Var4.setStopGlass(cVar.c(s0Var4, new qb.a(2), false));
                }
            }
        }
        gf gfVar = sfVar.f39572a.F0;
        if (this.F == null) {
            k2 k2Var = new k2(gfVar);
            this.F = k2Var;
            k2Var.h = new a0(this, 4);
            this.f1383a = new o1(gfVar);
            gfVar.addTextChangedListener(this.f1394g0);
        }
        if (this.H == null) {
            this.H = new h(sfVar.f39572a.R);
        }
        L();
    }

    public final void k() {
        sf sfVar = this.f1392f;
        gf gfVar = sfVar.f39572a.F0;
        if (gfVar != null) {
            gfVar.n1 = false;
        }
        f2 f2Var = this.G;
        if (f2Var != null) {
            f2Var.d();
        }
        this.G = null;
        h hVar = this.H;
        if (hVar != null) {
            hVar.b();
        }
        if (p()) {
            g();
        }
        n1 n1Var = this.f1412w;
        if (n1Var != null) {
            n1Var.a();
            this.f1412w.setIsland(false);
            this.f1412w.setRevert(false);
            this.f1412w.setSettings(false);
        }
        this.J = null;
        this.f1405r = 0;
        D(false);
        o1 o1Var = this.f1383a;
        if (o1Var != null) {
            o1Var.c();
        }
        ChatActivityEnterView chatActivityEnterView = sfVar.f39572a;
        chatActivityEnterView.G1 = 0L;
        chatActivityEnterView.H1 = null;
        s0 s0Var = this.f1407s;
        if (s0Var != null && s0Var.getRightMode() == 3) {
            this.f1407s.e();
        }
        k2 k2Var = this.F;
        if (k2Var != null) {
            k2Var.f(false);
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
        this.f1404q0 = SystemClock.uptimeMillis();
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
        jh.f fVar = this.f1384a0;
        if (fVar == null || (gVar = fVar.f17806n) == null) {
            return false;
        }
        Rect rect = gVar.R.f11678m;
        if (rect.isEmpty()) {
            return false;
        }
        jh.f fVar2 = this.f1384a0;
        int[] iArr = this.E;
        fVar2.getLocationInWindow(iArr);
        rectF.set(rect);
        rectF.offset(iArr[0], iArr[1]);
        return true;
    }

    public final boolean n() {
        if (this.f1405r != 0) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (this.f1402o0 && this.f1405r != 0) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        int i7 = this.f1405r;
        if (i7 == 1 || i7 == 2) {
            return true;
        }
        return false;
    }

    public final boolean r(float[] fArr) {
        gf gfVar = this.f1392f.f39572a.F0;
        if (this.f1384a0 == null || gfVar == null || gfVar.getLayout() == null) {
            return false;
        }
        jh.f fVar = this.f1384a0;
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
        f2 f2Var = this.G;
        if (f2Var != null) {
            f2Var.d();
        }
        this.G = null;
        sf sfVar = this.f1392f;
        Editable text = sfVar.f39572a.F0.getText();
        if (text != null && this.I <= text.length()) {
            this.L = true;
            this.F.a();
            text.delete(this.I, text.length());
            this.L = false;
        }
        K();
        g();
        C(false);
        this.f1412w.setIsland(false);
        this.f1412w.setSettings(false);
        this.f1412w.setStopMode(false);
        E();
        this.f1405r = 0;
        sfVar.b();
    }

    public final void t() {
        if (this.f1405r == 1) {
            org.telegram.messenger.g0.r(this.f1408s0);
            this.f1405r = 2;
            this.f1407s.setStopIsland(false);
            this.f1407s.setRightMode(1);
            this.f1407s.setCancelShown(false);
            f2 f2Var = this.G;
            if (f2Var != null) {
                f2Var.v();
            }
        }
    }

    public final void v(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: ai.p0.v(java.lang.String):void");
    }

    public final int w() {
        Editable text = this.f1392f.f39572a.F0.getText();
        if (text == null) {
            return 0;
        }
        return Math.max(0, text.length() - Math.min(this.I, text.length()));
    }

    @Override
    public final void x(String str) {
        String H;
        n1 n1Var = this.f1412w;
        if (n1Var != null) {
            if (str == null) {
                H = null;
            } else {
                H = H(str);
            }
            n1Var.setLanguage(H);
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
        Editable text = this.f1392f.f39572a.F0.getText();
        if (text == null) {
            return "";
        }
        return text.subSequence(Math.min(this.I, text.length()), text.length()).toString();
    }
}
