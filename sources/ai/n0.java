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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.fe;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.oe;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.y21;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.bj;
import org.telegram.ui.bn;
import org.telegram.ui.tl;
public final class n0 implements a2 {
    public static final lr I0 = new lr(0.3d, 0.0d, 0.2d, 1.0d);
    public ValueAnimator A0;
    public final int[] B0;
    public final int[] C0;
    public final float[] D0;
    public tl E0;
    public h2 F;
    public float F0;
    public c2 G;
    public ValueAnimator G0;
    public h H;
    public final i0 H0;
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
    public c6 Y;
    public l1 f1355a;
    public jh.f f1356a0;
    public long f1357b;
    public float f1358b0;
    public float f1359c;
    public ValueAnimator f1360c0;
    public boolean d;
    public int f1361d0;
    public c6 f1362e;
    public final a3.l f1363e0;
    public final qf f1364f;
    public boolean f1365f0;
    public final ah.j f1366g0;
    public final Context h;
    public float[] f1367h0;
    public float[] f1368i0;
    public int f1369j0;
    public final b0 f1370k0;
    public String f1371l0;
    public final b0 m0;
    public final i6 f1372n;
    public int f1373n0;
    public boolean f1374o0;
    public long f1375p0;
    public long f1376q0;
    public long f1378r0;
    public q0 f1379s;
    public final sa f1380s0;
    public final b0 f1381t0;
    public final b0 f1382u0;
    public final b0 f1383v0;
    public k1 f1384w;
    public LinearGradient f1385w0;
    public boolean f1387x0;
    public float f1389y0;
    public final Matrix f1390z0;
    public int f1377r = 0;
    public final s0 f1386x = new s0();
    public final RectF f1388y = new RectF();
    public final int[] E = new int[2];
    public g K = h.f1211c;
    public String M = "";
    public long S = -100000;
    public final RectF Z = new RectF();

    public n0(Context context, qf qfVar) {
        new Rect();
        this.f1361d0 = -6440822;
        this.f1363e0 = new a3.l(11);
        this.f1366g0 = new ah.j(this, 1);
        this.f1370k0 = new b0(this, 8);
        this.m0 = new b0(this, 9);
        this.f1380s0 = new sa(this, 1);
        this.f1381t0 = new b0(this, 10);
        this.f1382u0 = new b0(this, 11);
        this.f1383v0 = new b0(this, 0);
        this.f1390z0 = new Matrix();
        this.B0 = new int[2];
        this.C0 = new int[2];
        this.D0 = new float[2];
        this.H0 = new i0(this, 0);
        this.h = context;
        this.f1364f = qfVar;
        this.f1372n = qfVar.f38784a.K4;
    }

    public static void E(TLRPC.TL_error tL_error) {
        lc Y = lc.Y();
        if (Y == null) {
            return;
        }
        if (tL_error != null && ("AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            Y.I(2131624217, gd.M0(2131754989, null), org.telegram.messenger.g0.W2(gd.M0(2131754990, null))).j();
        } else if (tL_error != null) {
            Y.g0(tL_error, false);
        } else {
            Log.d("Dictation", "style request failed (no error from the server)");
        }
    }

    public static String p(String str) {
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        String Q0 = y21.Q0(language);
        if (Q0 != null) {
            return Q0;
        }
        return language;
    }

    public static int t(int i7, int i10, boolean z10) {
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

    public final void A(boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f1364f.f38784a;
        gf gfVar = chatActivityEnterView.F0;
        if (gfVar != null && z10) {
            chatActivityEnterView.D1 = false;
            if (gfVar != null) {
                gfVar.invalidate();
            }
        }
    }

    public final void B(boolean z10) {
        if (z10) {
            this.f1357b = 0L;
        }
        this.X = z10;
        jh.f fVar = this.f1356a0;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    public final void C() {
        bj bjVar;
        tl tlVar;
        bn bnVar = this.f1364f.f38784a.D3;
        if (bnVar != null) {
            bjVar = bnVar.A0;
        } else {
            bjVar = null;
        }
        if (bjVar == null || (tlVar = this.E0) == null) {
            return;
        }
        if (tlVar != bjVar) {
            i0 i0Var = this.H0;
            if (tlVar != null) {
                tlVar.q0(i0Var);
            }
            this.E0 = bjVar;
            bjVar.i(i0Var);
        }
        ValueAnimator valueAnimator = this.G0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F0, 0.0f);
        this.G0 = ofFloat;
        ofFloat.addUpdateListener(new c0(this, 2));
        this.G0.addListener(new j0(this, 0));
        this.G0.setDuration(300L);
        this.G0.setInterpolator(lr.h);
        this.G0.start();
    }

    public final void D(float f10, float f11) {
        q0 q0Var = this.f1379s;
        if (q0Var != null && (q0Var.f1430a1 != f10 || q0Var.Z0 != f11)) {
            q0Var.f1430a1 = f10;
            q0Var.Z0 = f11;
            q0Var.invalidate();
        }
        k1 k1Var = this.f1384w;
        if (k1Var != null) {
            if (k1Var.m0 != f10 || k1Var.f1281l0 != f11) {
                k1Var.m0 = f10;
                k1Var.f1281l0 = f11;
                k1Var.invalidate();
            }
        }
    }

    public final void F(boolean z10) {
        int length;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        long j3;
        h hVar;
        int i7 = this.f1377r;
        if (i7 != 1 && i7 != 2) {
            this.f1374o0 = z10;
            if (i7 == 4 && (hVar = this.H) != null) {
                hVar.b();
            }
            g();
            ValueAnimator valueAnimator = this.A0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            String str2 = null;
            this.A0 = null;
            qf qfVar = this.f1364f;
            ChatActivityEnterView chatActivityEnterView = qfVar.f38784a;
            chatActivityEnterView.f32722y1 = 0.0f;
            chatActivityEnterView.i2();
            Editable text = qfVar.f38784a.F0.getText();
            int i10 = this.f1377r;
            if (i10 == 3 || i10 == 4) {
                this.f1384w.a();
                this.f1384w.setIsland(false);
                this.f1384w.setRevert(false);
                this.f1384w.setSettings(false);
                C();
                h2 h2Var = this.F;
                if (h2Var != null) {
                    h2Var.f(false);
                }
            }
            this.J = null;
            this.K = h.f1211c;
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
            this.f1377r = 1;
            qfVar.b();
            this.U = SystemClock.uptimeMillis();
            org.telegram.messenger.g0.r(this.f1370k0);
            b0 b0Var = this.m0;
            DictationAsr.N(b0Var);
            DictationAsr.f43028g.add(b0Var);
            J(true);
            if (!z10) {
                b(1.0f, 220L, lr.h);
            }
            org.telegram.messenger.g0.r(this.f1381t0);
            q0 q0Var = this.f1379s;
            float[] fArr = this.f1367h0;
            int i11 = this.f1373n0;
            q0Var.getClass();
            if (fArr != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            q0Var.R = z11;
            if (z11) {
                q0Var.S = fArr[0] - q0Var.getLeft();
                q0Var.T = fArr[1] - q0Var.getTop();
                q0Var.U.setColor(i11);
            }
            q0 q0Var2 = this.f1379s;
            float[] fArr2 = this.f1368i0;
            int i12 = this.f1369j0;
            int[] iArr = q0Var2.f1459o0;
            if (fArr2 != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            q0Var2.A0 = z12;
            if (z12) {
                q0Var2.getLocationInWindow(iArr);
                q0Var2.B0 = fArr2[0] - iArr[0];
                q0Var2.C0 = fArr2[1] - iArr[1];
                q0Var2.D0 = fArr2[2];
                q0Var2.E0 = i12;
                q0Var2.F0 = 0L;
                if (q0Var2.J0 == null) {
                    q0Var2.J0 = q0Var2.getResources().getDrawable(2131231508).mutate();
                }
                q0Var2.J0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            StringBuilder sb2 = new StringBuilder("commit morph from circle ");
            if (this.f1368i0 == null) {
                str = "null";
            } else {
                str = ((int) this.f1368i0[0]) + "," + ((int) this.f1368i0[1]) + " r" + ((int) this.f1368i0[2]);
            }
            p5.c.t(sb2, str, "Dictation");
            this.f1368i0 = null;
            this.f1367h0 = null;
            if (!z10) {
                this.f1379s.setShown(true);
                this.f1379s.setRightMode(0);
            }
            this.f1386x.f();
            B(true);
            A(true);
            if (!z10) {
                this.f1379s.setStopIsland(true);
            }
            String U = DictationAsr.U();
            k1 k1Var = this.f1384w;
            if (U != null) {
                str2 = p(U);
            }
            k1Var.setLanguage(str2);
            this.f1384w.setSettings(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f1378r0 = uptimeMillis;
            this.f1376q0 = uptimeMillis;
            this.U = uptimeMillis;
            this.f1375p0 = 0L;
            if (!z10) {
                org.telegram.messenger.g0.h3(this.f1380s0, 300L);
            }
            if (mp.g1().getInt("design_dictation_mode", 1) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            ChatActivityEnterView chatActivityEnterView2 = qfVar.f38784a;
            this.G = new c2(this.h, chatActivityEnterView2.R, chatActivityEnterView2.E3, z13, this);
            gf gfVar = qfVar.f38784a.F0;
            if (gfVar != null) {
                gfVar.n1 = true;
            }
            Log.d("Dictation", "start simulated=" + z13);
            c2 c2Var = this.G;
            c2Var.m();
            a1.e eVar = new a1.e(14, this, c2Var);
            if (!z13 && !z10) {
                j3 = 420;
            } else {
                j3 = 120;
            }
            org.telegram.messenger.g0.h3(eVar, j3);
        }
    }

    public final ArrayList G() {
        g();
        ArrayList arrayList = new ArrayList();
        arrayList.add(h.f1211c);
        arrayList.addAll(this.H.c());
        return arrayList;
    }

    public final void H() {
        Editable text = this.f1364f.f38784a.F0.getText();
        if (text != null && text.length() > 0 && text.length() == this.I && Character.isWhitespace(text.charAt(text.length() - 1))) {
            this.L = true;
            text.delete(text.length() - 1, text.length());
            this.L = false;
        }
    }

    public final void I() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        Drawable backgroundImage;
        if (!this.f1365f0) {
            this.f1365f0 = true;
            ArrayList arrayList = t0.f1544g;
            a3.l lVar = this.f1363e0;
            if (!arrayList.contains(lVar)) {
                arrayList.add(lVar);
            }
        }
        try {
            au0 au0Var = this.f1364f.f38784a.f32542a2;
            if (au0Var != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (backgroundImage = au0Var.getBackgroundImage()) != null) {
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
                this.f1361d0 = Color.rgb((int) (j3 / 64), (int) (j10 / 64), (int) (j11 / 64));
            }
        } catch (Throwable unused) {
        }
        int i16 = n6.f29394d6;
        i6 i6Var = this.f1372n;
        int w02 = n6.w0(i16, i6Var);
        boolean c10 = s0.c(w02);
        s0 s0Var = this.f1386x;
        if (s0Var.h != c10) {
            s0Var.h = c10;
        }
        int i17 = n6.Pe;
        s0.h(n6.w0(i17, i6Var));
        s0Var.g(this.f1361d0, n6.w0(i17, i6Var));
        int[] iArr = s0Var.B;
        int i18 = iArr[0];
        int i19 = iArr[1];
        if (j2.f1255e != i18 || j2.f1256f != i19) {
            j2.f1255e = i18;
            j2.f1256f = i19;
            Arrays.fill(j2.f1257g[0], (Object) null);
        }
        if (this.f1379s != null) {
            int w03 = n6.w0(i17, i6Var) | (-16777216);
            q0 q0Var = this.f1379s;
            int f10 = i0.a.f(0.1f, w03, iArr[6]);
            int i20 = iArr[4];
            q0Var.f1441e1 = w03;
            q0Var.f1444f1 = f10;
            q0Var.f1446g1 = i20;
            if (!q0Var.f1460p0) {
                q0Var.f1461q0 = w03;
                q0Var.f1463r0 = f10;
                q0Var.f1465s0 = null;
                q0Var.invalidate();
            }
            this.f1379s.setDayIconBase(n6.w0(n6.Nl, i6Var));
        }
        this.f1385w0 = null;
        jh.f fVar = this.f1356a0;
        if (fVar != null) {
            fVar.invalidate();
        }
        q0 q0Var2 = this.f1379s;
        if (q0Var2 != null) {
            int i21 = n6.Nl;
            int w04 = n6.w0(i21, i6Var);
            int w05 = n6.w0(i17, i6Var);
            q0Var2.d.setColor(w04);
            q0Var2.f1439e.setColor(w05);
            q0Var2.f1442f.setColor(w05);
            q0Var2.invalidate();
            q0 q0Var3 = this.f1379s;
            int w06 = n6.w0(i21, i6Var);
            Paint paint = q0Var3.f1437d0;
            Paint paint2 = q0Var3.f1435c0;
            q0Var3.f1460p0 = c10;
            if (c10) {
                i7 = s0.e(-13665281);
            } else {
                i7 = q0Var3.f1441e1;
            }
            q0Var3.f1461q0 = i7;
            if (c10) {
                i10 = s0.e(-7447553);
            } else {
                i10 = q0Var3.f1444f1;
            }
            q0Var3.f1463r0 = i10;
            q0Var3.f1465s0 = null;
            Paint paint3 = q0Var3.f1432b0;
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
            q0Var3.f1440e0.setColor(w06);
            q0Var3.invalidate();
            this.f1379s.setSendIconColor(n6.w0(n6.Tf, i6Var));
        }
        h2 h2Var = this.F;
        if (h2Var != null) {
            h2Var.c(t(n6.w0(i17, i6Var), w02, c10), n6.w0(n6.Le, i6Var), c10);
        }
        k1 k1Var = this.f1384w;
        if (k1Var != null) {
            k1Var.e();
        }
    }

    public final void J(boolean z10) {
        long[] jArr;
        String str;
        boolean z11;
        if (!DictationAsr.F(new long[2])) {
            str = null;
        } else {
            str = " " + gd.a0(null, null, 2131745069, Long.valueOf(Math.round(jArr[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(jArr[1] / 1048576.0d))));
        }
        if (!z10 && TextUtils.equals(str, this.f1371l0)) {
            return;
        }
        this.f1371l0 = str;
        qf qfVar = this.f1364f;
        if (str == null) {
            qfVar.f38784a.I1(gd.M0(2131745060, null), true);
            return;
        }
        String M0 = gd.M0(2131745068, null);
        ChatActivityEnterView chatActivityEnterView = qfVar.f38784a;
        CharSequence charSequence = chatActivityEnterView.f32573e;
        if (charSequence != null && charSequence.toString().startsWith(M0.toString())) {
            z11 = true;
        } else {
            z11 = false;
        }
        chatActivityEnterView.I1(TextUtils.concat(M0, str), !z11);
    }

    @Override
    public final void a(String str, String str2) {
        if (!o()) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            String w10 = w(str);
            if (this.N <= 0 || !w10.isEmpty()) {
                this.L = true;
                this.F.e(this.I, -1, w10);
                this.L = false;
            }
        }
        h2 h2Var = this.F;
        Editable editableText = h2Var.f1222a.getEditableText();
        if (editableText != null) {
            h2Var.d(editableText, editableText.length());
        }
        qf qfVar = this.f1364f;
        gf gfVar = qfVar.f38784a.F0;
        InputMethodManager inputMethodManager = (InputMethodManager) this.h.getSystemService("input_method");
        if (inputMethodManager != null && gfVar != null) {
            inputMethodManager.restartInput(gfVar);
        }
        this.G = null;
        if (str2 != null) {
            Log.d("Dictation", "stopped with error: ".concat(str2));
        }
        if (v() <= 0 && (this.N <= 0 || qfVar.f38784a.F0.getText().toString().trim().length() <= 0)) {
            f();
            H();
            this.f1384w.setIsland(false);
            this.f1384w.setSettings(false);
            this.f1384w.setStopMode(false);
            C();
            this.f1377r = 0;
            qfVar.b();
            return;
        }
        this.f1377r = 3;
        qfVar.b();
        this.I = 0;
        this.f1379s.setCancelShown(false);
        if (!this.f1374o0) {
            d();
        }
        this.f1379s.setHandOff(true);
        this.f1379s.setRightMode(2);
        qfVar.f38784a.I1(null, true);
        B(false);
        this.P = 0.0f;
        org.telegram.messenger.g0.h3(this.f1381t0, 460L);
        this.f1384w.setStopMode(false);
        this.f1384w.d(gd.M0(2131745066, null), false);
        gf gfVar2 = qfVar.f38784a.F0;
        gfVar2.setSelection(gfVar2.length());
        if (!this.f1374o0) {
            gfVar2.requestFocus();
            org.telegram.messenger.g0.h3(new a3.f(gfVar2, 7), 120L);
        }
        org.telegram.messenger.g0.h3(new b0(this, 7), 90L);
    }

    public final void b(float f10, long j3, TimeInterpolator timeInterpolator) {
        ValueAnimator valueAnimator = this.f1360c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f1358b0, f10);
        this.f1360c0 = ofFloat;
        ofFloat.addUpdateListener(new c0(this, 1));
        this.f1360c0.setDuration(j3);
        this.f1360c0.setInterpolator(timeInterpolator);
        this.f1360c0.start();
    }

    public final void c(g gVar) {
        boolean z10;
        String a02;
        if (this.f1377r == 3) {
            if (this.I > this.f1364f.f38784a.F0.length()) {
                this.I = 0;
            }
            String str = this.J;
            if (str != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (str == null) {
                this.J = y();
            }
            String str2 = this.J;
            if (TextUtils.isEmpty(str2.trim())) {
                if (!z10) {
                    this.J = null;
                    return;
                }
                return;
            }
            this.f1377r = 4;
            this.f1357b = 0L;
            this.V = SystemClock.uptimeMillis();
            k1 k1Var = this.f1384w;
            if (gVar.d) {
                a02 = gd.M0(2131745065, null);
            } else {
                a02 = gd.a0(null, null, 2131745075, gVar.a());
            }
            k1Var.d(a02, true);
            this.F.a();
            this.F.f(true);
            this.f1386x.f();
            q0 q0Var = this.f1379s;
            if (q0Var != null) {
                q0Var.R0 = SystemClock.uptimeMillis();
                q0Var.setVisibility(0);
                q0Var.f1473y = true;
                q0Var.E = false;
                q0Var.R = false;
                q0Var.A0 = false;
                q0Var.L0 = false;
                q0Var.f1455l0 = false;
                q0Var.l1 = false;
                q0Var.F.e(true, 1.0f);
                q0Var.G.e(true, 0.0f);
                q0Var.H.e(true, 0.0f);
                q0Var.I.e(true, 0.0f);
                q0Var.J.e(true, 1.0f);
                q0Var.O0.e(true, 0.0f);
                q0Var.f1433b1 = 0L;
                q0Var.N0.e(true, 1.0f);
                q0Var.L = 3;
                q0Var.invalidate();
            }
            jh.f fVar = this.f1356a0;
            if (fVar != null) {
                fVar.invalidate();
            }
            g gVar2 = this.K;
            this.K = gVar;
            this.H.a(gVar, str2, new a3.g(this, gVar2, z10, gVar, 1));
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A0 = ofFloat;
        ofFloat.addUpdateListener(new c0(this, 0));
        this.A0.setDuration(220L);
        this.A0.setInterpolator(lr.f37209g);
        this.A0.start();
    }

    public final void e(long j3, long j10) {
        q0 q0Var = this.f1379s;
        if (q0Var == null) {
            return;
        }
        if (q0Var.L == 3) {
            q0Var.f1433b1 = SystemClock.uptimeMillis() + j3;
            q0Var.f1436c1 = Math.max(1L, j10);
            q0Var.invalidate();
        }
        org.telegram.messenger.g0.h3(new b0(this, 6), j3 + j10 + 60);
    }

    public final void f() {
        org.telegram.messenger.g0.r(this.f1380s0);
        q0 q0Var = this.f1379s;
        if (q0Var != null) {
            q0Var.setStopIsland(false);
        }
        org.telegram.messenger.g0.r(this.f1381t0);
        org.telegram.messenger.g0.r(this.f1370k0);
        b0 b0Var = this.f1382u0;
        org.telegram.messenger.g0.r(b0Var);
        b0 b0Var2 = this.f1383v0;
        org.telegram.messenger.g0.r(b0Var2);
        q0 q0Var2 = this.f1379s;
        q0Var2.L0 = true;
        q0Var2.R = false;
        SystemClock.uptimeMillis();
        if (q0Var2.J0 == null) {
            Drawable mutate = q0Var2.getResources().getDrawable(2131231508).mutate();
            q0Var2.J0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        q0Var2.invalidate();
        if (!this.f1374o0) {
            d();
        }
        B(false);
        this.P = 0.0f;
        org.telegram.messenger.g0.h3(b0Var, 30L);
        org.telegram.messenger.g0.h3(b0Var2, 310L);
    }

    public final void g() {
        fh.g gVar;
        gh.a aVar;
        c6 c6Var;
        qf qfVar = this.f1364f;
        au0 au0Var = qfVar.f38784a.f32542a2;
        q0 q0Var = this.f1379s;
        Context context = this.h;
        if (q0Var == null) {
            q0 q0Var2 = new q0(context, this);
            this.f1379s = q0Var2;
            q0Var2.setBorderColorSource(new a0(this, 0));
            this.f1379s.setVisibility(8);
        }
        if (this.f1379s.getParent() != au0Var) {
            org.telegram.messenger.g0.E2(this.f1379s);
            au0Var.addView(this.f1379s, ma.e(-1, -1, 80));
        } else {
            this.f1379s.bringToFront();
        }
        q0 q0Var3 = this.f1379s;
        ChatActivityEnterView chatActivityEnterView = qfVar.f38784a;
        fe feVar = chatActivityEnterView.R0;
        oe oeVar = chatActivityEnterView.f32541a1;
        q0Var3.f1431b = feVar;
        q0Var3.f1434c = oeVar;
        q0Var3.setBubbleProvider(new cb.c(this, 4));
        if (this.f1384w == null) {
            this.f1384w = new k1(context, this.f1372n, this);
        }
        if (this.f1384w.getParent() != au0Var) {
            org.telegram.messenger.g0.E2(this.f1384w);
            au0Var.addView(this.f1384w, ma.e(-1, -1, 80));
        } else {
            this.f1384w.bringToFront();
        }
        ChatActivityEnterView chatActivityEnterView2 = qfVar.f38784a;
        int i7 = ChatActivityEnterView.f32538n7;
        jh.f z02 = chatActivityEnterView2.z0();
        jh.f fVar = this.f1356a0;
        if (z02 != fVar) {
            c6 c6Var2 = null;
            if (fVar != null) {
                fVar.f17777f = null;
            }
            this.f1356a0 = z02;
            if (z02 != null) {
                c6Var = new c6(z02, 0L, 380L, new lr(0.22d, 0.61d, 0.36d, 1.0d));
            } else {
                c6Var = null;
            }
            this.Y = c6Var;
            if (z02 != null) {
                c6Var2 = new c6(z02, 1L, 300L, lr.f37209g);
            }
            this.f1362e = c6Var2;
        }
        jh.f fVar2 = this.f1356a0;
        if (fVar2 != null) {
            fVar2.f17777f = new a0(this, 2);
            dh.c cVar = qfVar.f38784a.J1;
            if (cVar != null && (gVar = fVar2.f17778n) != null && (aVar = gVar.f11671w) != null) {
                fh.g c10 = cVar.c(this.f1384w, aVar, false);
                fh.g c11 = cVar.c(this.f1384w, this.f1356a0.f17778n.f11671w, false);
                k1 k1Var = this.f1384w;
                fh.g c12 = cVar.c(k1Var, this.f1356a0.f17778n.f11671w, false);
                k1Var.I = c10;
                k1Var.J = c11;
                k1Var.K = c12;
                c10.r(org.telegram.messenger.g0.L(18.0f));
                c11.r(org.telegram.messenger.g0.L(18.0f));
                c12.r(org.telegram.messenger.g0.L(18.0f));
                k1 k1Var2 = this.f1384w;
                k1Var2.setGearGlass(cVar.c(k1Var2, this.f1356a0.f17778n.f11671w, false));
                q0 q0Var4 = this.f1379s;
                if (q0Var4 != null) {
                    q0Var4.setStopGlass(cVar.c(q0Var4, new qb.a(2), false));
                }
            }
        }
        gf gfVar = qfVar.f38784a.F0;
        if (this.F == null) {
            h2 h2Var = new h2(gfVar);
            this.F = h2Var;
            h2Var.h = new a0(this, 4);
            this.f1355a = new l1(gfVar);
            gfVar.addTextChangedListener(this.f1366g0);
        }
        if (this.H == null) {
            this.H = new h(qfVar.f38784a.R);
        }
        I();
    }

    @Override
    public final void h(float f10) {
        ChatActivityEnterView chatActivityEnterView;
        ChatActivityEnterView.RecordCircle recordCircle;
        this.P = f10;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (f10 > 0.38f) {
            if (this.f1375p0 == 0) {
                this.f1375p0 = uptimeMillis;
            }
            if (uptimeMillis - this.f1375p0 >= 150) {
                this.U = uptimeMillis;
            }
        } else {
            this.f1375p0 = 0L;
        }
        q0 q0Var = this.f1379s;
        if (q0Var != null) {
            q0Var.setLevel(f10);
        }
        if (this.f1374o0 && (recordCircle = (chatActivityEnterView = this.f1364f.f38784a).B2) != null && chatActivityEnterView.f32687t3) {
            recordCircle.setAmplitude(f10 * 1800.0f);
        }
    }

    @Override
    public final void i(String str) {
        l(-1, str);
    }

    public final void j() {
        qf qfVar = this.f1364f;
        gf gfVar = qfVar.f38784a.F0;
        if (gfVar != null) {
            gfVar.n1 = false;
        }
        c2 c2Var = this.G;
        if (c2Var != null) {
            c2Var.c();
        }
        this.G = null;
        h hVar = this.H;
        if (hVar != null) {
            hVar.b();
        }
        if (o()) {
            f();
        }
        k1 k1Var = this.f1384w;
        if (k1Var != null) {
            k1Var.a();
            this.f1384w.setIsland(false);
            this.f1384w.setRevert(false);
            this.f1384w.setSettings(false);
        }
        this.J = null;
        this.f1377r = 0;
        B(false);
        l1 l1Var = this.f1355a;
        if (l1Var != null) {
            l1Var.c();
        }
        ChatActivityEnterView chatActivityEnterView = qfVar.f38784a;
        chatActivityEnterView.E1 = 0L;
        chatActivityEnterView.F1 = null;
        q0 q0Var = this.f1379s;
        if (q0Var != null && q0Var.getRightMode() == 3) {
            this.f1379s.e();
        }
        h2 h2Var = this.F;
        if (h2Var != null) {
            h2Var.f(false);
        }
        A(false);
        C();
        qfVar.b();
    }

    public final boolean k(RectF rectF) {
        fh.g gVar;
        jh.f fVar = this.f1356a0;
        if (fVar == null || (gVar = fVar.f17778n) == null) {
            return false;
        }
        Rect rect = gVar.R.f11646m;
        if (rect.isEmpty()) {
            return false;
        }
        jh.f fVar2 = this.f1356a0;
        int[] iArr = this.E;
        fVar2.getLocationInWindow(iArr);
        rectF.set(rect);
        rectF.offset(iArr[0], iArr[1]);
        return true;
    }

    @Override
    public final void l(int i7, String str) {
        int max;
        if (!o()) {
            return;
        }
        this.f1376q0 = SystemClock.uptimeMillis();
        if (str == null) {
            str = "";
        }
        String w10 = w(str);
        if (i7 < 0) {
            max = -1;
        } else {
            max = Math.max(0, Math.min(w10.length(), i7 - (str.length() - w10.length())));
        }
        this.L = true;
        this.F.e(this.I, max, w10);
        this.L = false;
    }

    public final boolean m() {
        if (this.f1377r != 0) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (this.f1374o0 && this.f1377r != 0) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        int i7 = this.f1377r;
        if (i7 == 1 || i7 == 2) {
            return true;
        }
        return false;
    }

    public final boolean q(float[] fArr) {
        gf gfVar = this.f1364f.f38784a.F0;
        if (this.f1356a0 == null || gfVar == null || gfVar.getLayout() == null) {
            return false;
        }
        jh.f fVar = this.f1356a0;
        int[] iArr = this.B0;
        fVar.getLocationInWindow(iArr);
        int[] iArr2 = this.C0;
        gfVar.getLocationInWindow(iArr2);
        fArr[0] = (gfVar.getTotalPaddingLeft() + (iArr2[0] - iArr[0])) - gfVar.getScrollX();
        fArr[1] = (gfVar.getTotalPaddingTop() + (iArr2[1] - iArr[1])) - gfVar.getScrollY();
        return true;
    }

    public final void r() {
        if (!o()) {
            return;
        }
        c2 c2Var = this.G;
        if (c2Var != null) {
            c2Var.c();
        }
        this.G = null;
        qf qfVar = this.f1364f;
        Editable text = qfVar.f38784a.F0.getText();
        if (text != null && this.I <= text.length()) {
            this.L = true;
            this.F.a();
            text.delete(this.I, text.length());
            this.L = false;
        }
        H();
        f();
        A(false);
        this.f1384w.setIsland(false);
        this.f1384w.setSettings(false);
        this.f1384w.setStopMode(false);
        C();
        this.f1377r = 0;
        qfVar.b();
    }

    public final void s() {
        if (this.f1377r == 1) {
            org.telegram.messenger.g0.r(this.f1380s0);
            this.f1377r = 2;
            this.f1379s.setStopIsland(false);
            this.f1379s.setRightMode(1);
            this.f1379s.setCancelShown(false);
            c2 c2Var = this.G;
            if (c2Var != null) {
                c2Var.u();
            }
        }
    }

    public final void u(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: ai.n0.u(java.lang.String):void");
    }

    public final int v() {
        Editable text = this.f1364f.f38784a.F0.getText();
        if (text == null) {
            return 0;
        }
        return Math.max(0, text.length() - Math.min(this.I, text.length()));
    }

    public final String w(String str) {
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

    @Override
    public final void x(String str) {
        String p10;
        k1 k1Var = this.f1384w;
        if (k1Var != null) {
            if (str == null) {
                p10 = null;
            } else {
                p10 = p(str);
            }
            k1Var.setLanguage(p10);
        }
    }

    public final String y() {
        Editable text = this.f1364f.f38784a.F0.getText();
        if (text == null) {
            return "";
        }
        return text.subSequence(Math.min(this.I, text.length()), text.length()).toString();
    }

    public final void z() {
        Log.d("Dictation", "send from listening (" + v() + " chars)");
        c2 c2Var = this.G;
        if (c2Var != null) {
            c2Var.c();
        }
        this.G = null;
        org.telegram.messenger.g0.r(this.f1380s0);
        this.F.a();
        this.f1379s.setStopIsland(false);
        qf qfVar = this.f1364f;
        qfVar.f38784a.I1(null, true);
        B(false);
        this.P = 0.0f;
        this.f1384w.setIsland(false);
        this.f1384w.setSettings(false);
        this.f1384w.setStopMode(false);
        C();
        A(false);
        this.f1377r = 0;
        this.f1358b0 = 0.0f;
        ValueAnimator valueAnimator = this.f1360c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        qfVar.d(0.0f);
        this.f1379s.e();
        qfVar.b();
        qfVar.f38784a.r1();
    }
}
