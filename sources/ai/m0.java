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
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import c8.ja;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ae;
import org.telegram.ui.Components.ee;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.wd;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.aj;
import org.telegram.ui.an;
import org.telegram.ui.sl;
public final class m0 implements z1 {
    public static final er H0 = new er(0.3d, 0.0d, 0.2d, 1.0d);
    public final int[] A0;
    public final int[] B0;
    public final float[] C0;
    public sl D0;
    public float E0;
    public g2 F;
    public ValueAnimator F0;
    public b2 G;
    public final h0 G0;
    public i H;
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
    public u5 Y;
    public k1 f1356a;
    public jh.f f1357a0;
    public long f1358b;
    public float f1359b0;
    public float f1360c;
    public ValueAnimator f1361c0;
    public boolean d;
    public int f1362d0;
    public u5 f1363e;
    public final a3.l f1364e0;
    public final ae f1365f;
    public boolean f1366f0;
    public final ah.j f1367g0;
    public final Context h;
    public float[] f1368h0;
    public float[] f1369i0;
    public int f1370j0;
    public final a0 f1371k0;
    public String f1372l0;
    public final a0 m0;
    public final e6 f1373n;
    public int f1374n0;
    public long f1375o0;
    public long f1376p0;
    public long f1377q0;
    public final sa f1379r0;
    public p0 f1380s;
    public final a0 f1381s0;
    public final a0 f1382t0;
    public final a0 f1383u0;
    public LinearGradient f1384v0;
    public j1 f1385w;
    public boolean f1386w0;
    public float f1388x0;
    public final Matrix f1390y0;
    public ValueAnimator f1391z0;
    public int f1378r = 0;
    public final r0 f1387x = new r0();
    public final RectF f1389y = new RectF();
    public final int[] E = new int[2];
    public h K = i.f1244c;
    public String M = "";
    public long S = -100000;
    public final RectF Z = new RectF();

    public m0(Context context, ae aeVar) {
        new Rect();
        this.f1362d0 = -6440822;
        this.f1364e0 = new a3.l(11);
        this.f1367g0 = new ah.j(this, 1);
        this.f1371k0 = new a0(this, 8);
        this.m0 = new a0(this, 9);
        this.f1379r0 = new sa(this, 1);
        this.f1381s0 = new a0(this, 10);
        this.f1382t0 = new a0(this, 11);
        this.f1383u0 = new a0(this, 0);
        this.f1390y0 = new Matrix();
        this.A0 = new int[2];
        this.B0 = new int[2];
        this.C0 = new float[2];
        this.G0 = new h0(this, 0);
        this.h = context;
        this.f1365f = aeVar;
        this.f1373n = aeVar.f32967b.E4;
    }

    public static String l(String str) {
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        String P0 = p21.P0(language);
        if (P0 != null) {
            return P0;
        }
        return language;
    }

    public static int o(int i7, int i10, boolean z10) {
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

    public final void A() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        Drawable backgroundImage;
        if (!this.f1366f0) {
            this.f1366f0 = true;
            ArrayList arrayList = s0.f1543g;
            a3.l lVar = this.f1364e0;
            if (!arrayList.contains(lVar)) {
                arrayList.add(lVar);
            }
        }
        try {
            st0 st0Var = this.f1365f.f32967b.U1;
            if (st0Var != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (backgroundImage = st0Var.getBackgroundImage()) != null) {
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
                this.f1362d0 = Color.rgb((int) (j3 / 64), (int) (j10 / 64), (int) (j11 / 64));
            }
        } catch (Throwable unused) {
        }
        int i16 = j6.f28849d6;
        e6 e6Var = this.f1373n;
        int w02 = j6.w0(i16, e6Var);
        boolean c10 = r0.c(w02);
        r0 r0Var = this.f1387x;
        if (r0Var.h != c10) {
            r0Var.h = c10;
        }
        int i17 = j6.Pe;
        r0.h(j6.w0(i17, e6Var));
        r0Var.g(this.f1362d0, j6.w0(i17, e6Var));
        int[] iArr = r0Var.B;
        int i18 = iArr[0];
        int i19 = iArr[1];
        if (i2.f1256e != i18 || i2.f1257f != i19) {
            i2.f1256e = i18;
            i2.f1257f = i19;
            Arrays.fill(i2.f1258g[0], (Object) null);
        }
        if (this.f1380s != null) {
            int w03 = j6.w0(i17, e6Var) | (-16777216);
            p0 p0Var = this.f1380s;
            int f10 = i0.a.f(0.1f, w03, iArr[6]);
            int i20 = iArr[4];
            p0Var.f1442e1 = w03;
            p0Var.f1445f1 = f10;
            p0Var.f1447g1 = i20;
            if (!p0Var.f1461p0) {
                p0Var.f1462q0 = w03;
                p0Var.f1464r0 = f10;
                p0Var.f1466s0 = null;
                p0Var.invalidate();
            }
            this.f1380s.setDayIconBase(j6.w0(j6.Nl, e6Var));
        }
        this.f1384v0 = null;
        jh.f fVar = this.f1357a0;
        if (fVar != null) {
            fVar.invalidate();
        }
        p0 p0Var2 = this.f1380s;
        if (p0Var2 != null) {
            int i21 = j6.Nl;
            int w04 = j6.w0(i21, e6Var);
            int w05 = j6.w0(i17, e6Var);
            p0Var2.d.setColor(w04);
            p0Var2.f1440e.setColor(w05);
            p0Var2.f1443f.setColor(w05);
            p0Var2.invalidate();
            p0 p0Var3 = this.f1380s;
            int w06 = j6.w0(i21, e6Var);
            Paint paint = p0Var3.f1438d0;
            Paint paint2 = p0Var3.f1436c0;
            p0Var3.f1461p0 = c10;
            if (c10) {
                i7 = r0.e(-13665281);
            } else {
                i7 = p0Var3.f1442e1;
            }
            p0Var3.f1462q0 = i7;
            if (c10) {
                i10 = r0.e(-7447553);
            } else {
                i10 = p0Var3.f1445f1;
            }
            p0Var3.f1464r0 = i10;
            p0Var3.f1466s0 = null;
            Paint paint3 = p0Var3.f1433b0;
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
            p0Var3.f1441e0.setColor(w06);
            p0Var3.invalidate();
            this.f1380s.setSendIconColor(j6.w0(j6.Tf, e6Var));
        }
        g2 g2Var = this.F;
        if (g2Var != null) {
            g2Var.c(o(j6.w0(i17, e6Var), w02, c10), j6.w0(j6.Le, e6Var), c10);
        }
        j1 j1Var = this.f1385w;
        if (j1Var != null) {
            j1Var.e();
        }
    }

    public final void B(boolean z10) {
        long[] jArr;
        String r10;
        boolean z11;
        if (!DictationAsr.F(new long[2])) {
            r10 = null;
        } else {
            Locale locale = Locale.US;
            r10 = a8.p0.r(a8.p0.t(Math.round(jArr[0] / 1048576.0d), " ", " / "), Math.max(1L, Math.round(jArr[1] / 1048576.0d)), " MB");
        }
        if (!z10 && TextUtils.equals(r10, this.f1372l0)) {
            return;
        }
        this.f1372l0 = r10;
        ae aeVar = this.f1365f;
        if (r10 == null) {
            aeVar.f32967b.A1("Listening…", true);
            return;
        }
        ChatActivityEnterView chatActivityEnterView = aeVar.f32967b;
        CharSequence charSequence = chatActivityEnterView.f32183e;
        if (charSequence != null && charSequence.toString().startsWith("Downloading model…")) {
            z11 = true;
        } else {
            z11 = false;
        }
        chatActivityEnterView.A1(TextUtils.concat("Downloading model…", r10), !z11);
    }

    @Override
    public final void M(int i7, String str) {
        int max;
        if (!k()) {
            return;
        }
        this.f1376p0 = SystemClock.uptimeMillis();
        if (str == null) {
            str = "";
        }
        String s5 = s(str);
        if (i7 < 0) {
            max = -1;
        } else {
            max = Math.max(0, Math.min(s5.length(), i7 - (str.length() - s5.length())));
        }
        this.L = true;
        this.F.e(this.I, max, s5);
        this.L = false;
    }

    @Override
    public final void P(String str) {
        String l10;
        j1 j1Var = this.f1385w;
        if (j1Var != null) {
            if (str == null) {
                l10 = null;
            } else {
                l10 = l(str);
            }
            j1Var.setLanguage(l10);
        }
    }

    @Override
    public final void a(String str, String str2) {
        if (!k()) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            String s5 = s(str);
            if (this.N <= 0 || !s5.isEmpty()) {
                this.L = true;
                this.F.e(this.I, -1, s5);
                this.L = false;
            }
        }
        g2 g2Var = this.F;
        Editable editableText = g2Var.f1220a.getEditableText();
        if (editableText != null) {
            g2Var.d(editableText, editableText.length());
        }
        ae aeVar = this.f1365f;
        ChatActivityEnterView chatActivityEnterView = aeVar.f32967b;
        ChatActivityEnterView chatActivityEnterView2 = aeVar.f32967b;
        xe xeVar = chatActivityEnterView.F0;
        Context context = this.h;
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null && xeVar != null) {
            inputMethodManager.restartInput(xeVar);
        }
        this.G = null;
        if (str2 != null) {
            Toast.makeText(context, str2, 0).show();
        }
        if (q() <= 0 && (this.N <= 0 || chatActivityEnterView2.F0.getText().toString().trim().length() <= 0)) {
            f();
            z();
            this.f1385w.setIsland(false);
            this.f1385w.setSettings(false);
            this.f1385w.setStopMode(false);
            w();
            this.f1378r = 0;
            aeVar.b();
            return;
        }
        this.f1378r = 3;
        aeVar.b();
        this.I = 0;
        this.f1380s.setCancelShown(false);
        d();
        this.f1380s.setHandOff(true);
        this.f1380s.setRightMode(2);
        chatActivityEnterView2.A1(null, true);
        v(false);
        this.P = 0.0f;
        org.telegram.messenger.g0.i3(this.f1381s0, 460L);
        this.f1385w.setStopMode(false);
        this.f1385w.d("Enhance", false);
        xe xeVar2 = chatActivityEnterView2.F0;
        xeVar2.requestFocus();
        xeVar2.setSelection(xeVar2.length());
        org.telegram.messenger.g0.i3(new a3.f(xeVar2, 6), 120L);
        org.telegram.messenger.g0.i3(new a0(this, 7), 90L);
    }

    public final void b(float f10, long j3, TimeInterpolator timeInterpolator) {
        ValueAnimator valueAnimator = this.f1361c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f1359b0, f10);
        this.f1361c0 = ofFloat;
        ofFloat.addUpdateListener(new b0(this, 1));
        this.f1361c0.setDuration(j3);
        this.f1361c0.setInterpolator(timeInterpolator);
        this.f1361c0.start();
    }

    public final void c(h hVar) {
        String s5;
        if (this.f1378r == 3) {
            if (this.I > this.f1365f.f32967b.F0.length()) {
                this.I = 0;
            }
            if (this.J == null) {
                this.J = t();
            }
            String str = this.J;
            if (TextUtils.isEmpty(str.trim())) {
                return;
            }
            this.f1378r = 4;
            this.f1358b = 0L;
            this.V = SystemClock.uptimeMillis();
            this.K = hVar;
            j1 j1Var = this.f1385w;
            if (hVar.f1235e) {
                s5 = "Enhancing…";
            } else {
                s5 = a8.p0.s(new StringBuilder(), hVar.f1232a, "…");
            }
            j1Var.d(s5, true);
            this.F.a();
            this.F.f(true);
            this.f1387x.f();
            p0 p0Var = this.f1380s;
            if (p0Var != null) {
                p0Var.R0 = SystemClock.uptimeMillis();
                p0Var.setVisibility(0);
                p0Var.f1474y = true;
                p0Var.E = false;
                p0Var.R = false;
                p0Var.A0 = false;
                p0Var.L0 = false;
                p0Var.f1456l0 = false;
                p0Var.l1 = false;
                p0Var.F.e(true, 1.0f);
                p0Var.G.e(true, 0.0f);
                p0Var.H.e(true, 0.0f);
                p0Var.I.e(true, 0.0f);
                p0Var.J.e(true, 1.0f);
                p0Var.O0.e(true, 0.0f);
                p0Var.f1434b1 = 0L;
                p0Var.N0.e(true, 1.0f);
                p0Var.L = 3;
                p0Var.invalidate();
            }
            jh.f fVar = this.f1357a0;
            if (fVar != null) {
                fVar.invalidate();
            }
            this.H.a(hVar, str, new ab.g(2, this, hVar));
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f1391z0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1391z0 = ofFloat;
        ofFloat.addUpdateListener(new b0(this, 0));
        this.f1391z0.setDuration(220L);
        this.f1391z0.setInterpolator(er.f34421g);
        this.f1391z0.start();
    }

    public final void e(long j3, long j10) {
        p0 p0Var = this.f1380s;
        if (p0Var == null) {
            return;
        }
        if (p0Var.L == 3) {
            p0Var.f1434b1 = SystemClock.uptimeMillis() + j3;
            p0Var.f1437c1 = Math.max(1L, j10);
            p0Var.invalidate();
        }
        org.telegram.messenger.g0.i3(new a0(this, 6), j3 + j10 + 60);
    }

    public final void f() {
        org.telegram.messenger.g0.r(this.f1379r0);
        p0 p0Var = this.f1380s;
        if (p0Var != null) {
            p0Var.setStopIsland(false);
        }
        org.telegram.messenger.g0.r(this.f1381s0);
        org.telegram.messenger.g0.r(this.f1371k0);
        a0 a0Var = this.f1382t0;
        org.telegram.messenger.g0.r(a0Var);
        a0 a0Var2 = this.f1383u0;
        org.telegram.messenger.g0.r(a0Var2);
        p0 p0Var2 = this.f1380s;
        p0Var2.L0 = true;
        p0Var2.R = false;
        SystemClock.uptimeMillis();
        if (p0Var2.J0 == null) {
            Drawable mutate = p0Var2.getResources().getDrawable(2131231507).mutate();
            p0Var2.J0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        p0Var2.invalidate();
        d();
        v(false);
        this.P = 0.0f;
        org.telegram.messenger.g0.i3(a0Var, 30L);
        org.telegram.messenger.g0.i3(a0Var2, 310L);
    }

    public final void g() {
        fh.g gVar;
        gh.a aVar;
        u5 u5Var;
        ae aeVar = this.f1365f;
        ChatActivityEnterView chatActivityEnterView = aeVar.f32967b;
        ChatActivityEnterView chatActivityEnterView2 = aeVar.f32967b;
        st0 st0Var = chatActivityEnterView.U1;
        p0 p0Var = this.f1380s;
        Context context = this.h;
        if (p0Var == null) {
            p0 p0Var2 = new p0(context, this);
            this.f1380s = p0Var2;
            p0Var2.setBorderColorSource(new z(this, 0));
            this.f1380s.setVisibility(8);
        }
        if (this.f1380s.getParent() != st0Var) {
            org.telegram.messenger.g0.E2(this.f1380s);
            st0Var.addView(this.f1380s, ja.e(-1, -1, 80));
        } else {
            this.f1380s.bringToFront();
        }
        p0 p0Var3 = this.f1380s;
        wd wdVar = chatActivityEnterView2.R0;
        ee eeVar = chatActivityEnterView2.f32155a1;
        p0Var3.f1432b = wdVar;
        p0Var3.f1435c = eeVar;
        p0Var3.setBubbleProvider(new cb.c(this, 4));
        if (this.f1385w == null) {
            this.f1385w = new j1(context, this.f1373n, this);
        }
        if (this.f1385w.getParent() != st0Var) {
            org.telegram.messenger.g0.E2(this.f1385w);
            st0Var.addView(this.f1385w, ja.e(-1, -1, 80));
        } else {
            this.f1385w.bringToFront();
        }
        int i7 = ChatActivityEnterView.N6;
        jh.f r02 = chatActivityEnterView2.r0();
        jh.f fVar = this.f1357a0;
        if (r02 != fVar) {
            u5 u5Var2 = null;
            if (fVar != null) {
                fVar.f17394f = null;
            }
            this.f1357a0 = r02;
            if (r02 != null) {
                u5Var = new u5(r02, 0L, 380L, new er(0.22d, 0.61d, 0.36d, 1.0d));
            } else {
                u5Var = null;
            }
            this.Y = u5Var;
            if (r02 != null) {
                u5Var2 = new u5(r02, 1L, 300L, er.f34421g);
            }
            this.f1363e = u5Var2;
        }
        jh.f fVar2 = this.f1357a0;
        if (fVar2 != null) {
            fVar2.f17394f = new z(this, 2);
            dh.c cVar = chatActivityEnterView2.D1;
            if (cVar != null && (gVar = fVar2.h) != null && (aVar = gVar.f11354w) != null) {
                fh.g c10 = cVar.c(this.f1385w, aVar, false);
                fh.g c11 = cVar.c(this.f1385w, this.f1357a0.h.f11354w, false);
                j1 j1Var = this.f1385w;
                fh.g c12 = cVar.c(j1Var, this.f1357a0.h.f11354w, false);
                j1Var.I = c10;
                j1Var.J = c11;
                j1Var.K = c12;
                c10.r(org.telegram.messenger.g0.L(18.0f));
                c11.r(org.telegram.messenger.g0.L(18.0f));
                c12.r(org.telegram.messenger.g0.L(18.0f));
                p0 p0Var4 = this.f1380s;
                if (p0Var4 != null) {
                    p0Var4.setStopGlass(cVar.c(p0Var4, new qb.a(2), false));
                }
            }
        }
        xe xeVar = chatActivityEnterView2.F0;
        if (this.F == null) {
            g2 g2Var = new g2(xeVar);
            this.F = g2Var;
            g2Var.h = new z(this, 4);
            this.f1356a = new k1(xeVar);
            xeVar.addTextChangedListener(this.f1367g0);
        }
        if (this.H == null) {
            this.H = new i(chatActivityEnterView2.R);
        }
        A();
    }

    @Override
    public final void h(float f10) {
        this.P = f10;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (f10 > 0.38f) {
            if (this.f1375o0 == 0) {
                this.f1375o0 = uptimeMillis;
            }
            if (uptimeMillis - this.f1375o0 >= 150) {
                this.U = uptimeMillis;
            }
        } else {
            this.f1375o0 = 0L;
        }
        p0 p0Var = this.f1380s;
        if (p0Var != null) {
            p0Var.setLevel(f10);
        }
    }

    public final void i() {
        ae aeVar = this.f1365f;
        xe xeVar = aeVar.f32967b.F0;
        if (xeVar != null) {
            xeVar.n1 = false;
        }
        b2 b2Var = this.G;
        if (b2Var != null) {
            b2Var.c();
        }
        this.G = null;
        i iVar = this.H;
        if (iVar != null) {
            iVar.b();
        }
        if (k()) {
            f();
        }
        j1 j1Var = this.f1385w;
        if (j1Var != null) {
            j1Var.a();
            this.f1385w.setIsland(false);
            this.f1385w.setRevert(false);
            this.f1385w.setSettings(false);
        }
        this.J = null;
        this.f1378r = 0;
        v(false);
        k1 k1Var = this.f1356a;
        if (k1Var != null) {
            k1Var.a();
        }
        ChatActivityEnterView chatActivityEnterView = aeVar.f32967b;
        chatActivityEnterView.f32325y1 = 0L;
        chatActivityEnterView.f32332z1 = null;
        p0 p0Var = this.f1380s;
        if (p0Var != null && p0Var.getRightMode() == 3) {
            this.f1380s.e();
        }
        g2 g2Var = this.F;
        if (g2Var != null) {
            g2Var.f(false);
        }
        u(false);
        w();
        aeVar.b();
    }

    public final boolean j(RectF rectF) {
        fh.g gVar;
        jh.f fVar = this.f1357a0;
        if (fVar == null || (gVar = fVar.h) == null) {
            return false;
        }
        Rect rect = gVar.R.f11329m;
        if (rect.isEmpty()) {
            return false;
        }
        jh.f fVar2 = this.f1357a0;
        int[] iArr = this.E;
        fVar2.getLocationInWindow(iArr);
        rectF.set(rect);
        rectF.offset(iArr[0], iArr[1]);
        return true;
    }

    public final boolean k() {
        int i7 = this.f1378r;
        if (i7 == 1 || i7 == 2) {
            return true;
        }
        return false;
    }

    public final boolean m(float[] fArr) {
        xe xeVar = this.f1365f.f32967b.F0;
        if (this.f1357a0 == null || xeVar == null || xeVar.getLayout() == null) {
            return false;
        }
        jh.f fVar = this.f1357a0;
        int[] iArr = this.A0;
        fVar.getLocationInWindow(iArr);
        int[] iArr2 = this.B0;
        xeVar.getLocationInWindow(iArr2);
        fArr[0] = (xeVar.getTotalPaddingLeft() + (iArr2[0] - iArr[0])) - xeVar.getScrollX();
        fArr[1] = (xeVar.getTotalPaddingTop() + (iArr2[1] - iArr[1])) - xeVar.getScrollY();
        return true;
    }

    public final void n() {
        if (this.f1378r == 1) {
            org.telegram.messenger.g0.r(this.f1379r0);
            this.f1378r = 2;
            this.f1380s.setStopIsland(false);
            this.f1380s.setRightMode(1);
            this.f1380s.setCancelShown(false);
            b2 b2Var = this.G;
            if (b2Var != null) {
                b2Var.u();
            }
        }
    }

    public final void p(java.lang.String r24) {
        throw new UnsupportedOperationException("Method not decompiled: ai.m0.p(java.lang.String):void");
    }

    public final int q() {
        Editable text = this.f1365f.f32967b.F0.getText();
        if (text == null) {
            return 0;
        }
        return Math.max(0, text.length() - Math.min(this.I, text.length()));
    }

    @Override
    public final void r(String str) {
        M(-1, str);
    }

    public final String s(String str) {
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

    public final String t() {
        Editable text = this.f1365f.f32967b.F0.getText();
        if (text == null) {
            return "";
        }
        return text.subSequence(Math.min(this.I, text.length()), text.length()).toString();
    }

    public final void u(boolean z10) {
        xe xeVar = this.f1365f.f32967b.F0;
        if (xeVar != null && z10) {
            xeVar.invalidate();
        }
    }

    public final void v(boolean z10) {
        if (z10) {
            this.f1358b = 0L;
        }
        this.X = z10;
        jh.f fVar = this.f1357a0;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    public final void w() {
        aj ajVar;
        sl slVar;
        an anVar = this.f1365f.f32967b.f32319x3;
        if (anVar != null) {
            ajVar = anVar.A0;
        } else {
            ajVar = null;
        }
        if (ajVar == null || (slVar = this.D0) == null) {
            return;
        }
        if (slVar != ajVar) {
            h0 h0Var = this.G0;
            if (slVar != null) {
                slVar.q0(h0Var);
            }
            this.D0 = ajVar;
            ajVar.i(h0Var);
        }
        ValueAnimator valueAnimator = this.F0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E0, 0.0f);
        this.F0 = ofFloat;
        ofFloat.addUpdateListener(new b0(this, 2));
        this.F0.addListener(new i0(this, 0));
        this.F0.setDuration(300L);
        this.F0.setInterpolator(er.h);
        this.F0.start();
    }

    public final void x(float f10, float f11) {
        p0 p0Var = this.f1380s;
        if (p0Var != null && (p0Var.f1431a1 != f10 || p0Var.Z0 != f11)) {
            p0Var.f1431a1 = f10;
            p0Var.Z0 = f11;
            p0Var.invalidate();
        }
        j1 j1Var = this.f1385w;
        if (j1Var != null) {
            if (j1Var.f1283l0 != f10 || j1Var.f1282k0 != f11) {
                j1Var.f1283l0 = f10;
                j1Var.f1282k0 = f11;
                j1Var.invalidate();
            }
        }
    }

    public final ArrayList y() {
        g();
        ArrayList arrayList = new ArrayList();
        arrayList.add(i.f1244c);
        arrayList.addAll(this.H.d());
        return arrayList;
    }

    public final void z() {
        Editable text = this.f1365f.f32967b.F0.getText();
        if (text != null && text.length() > 0 && text.length() == this.I && Character.isWhitespace(text.charAt(text.length() - 1))) {
            this.L = true;
            text.delete(text.length() - 1, text.length());
            this.L = false;
        }
    }
}
