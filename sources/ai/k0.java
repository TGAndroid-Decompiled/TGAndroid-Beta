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
import c8.na;
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
import org.telegram.ui.Components.rf;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.bj;
import org.telegram.ui.bn;
import org.telegram.ui.tl;
public final class k0 implements u1 {
    public static final nr I0 = new nr(0.3d, 0.0d, 0.2d, 1.0d);
    public ValueAnimator A0;
    public final int[] B0;
    public final int[] C0;
    public final float[] D0;
    public tl E0;
    public a2 F;
    public float F0;
    public v1 G;
    public ValueAnimator G0;
    public d H;
    public final e0 H0;
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
    public i1 f1313a;
    public jh.f f1314a0;
    public long f1315b;
    public float f1316b0;
    public float f1317c;
    public ValueAnimator f1318c0;
    public boolean d;
    public int f1319d0;
    public d6 f1320e;
    public final a3.l f1321e0;
    public final rf f1322f;
    public boolean f1323f0;
    public final ah.j f1324g0;
    public final Context h;
    public float[] f1325h0;
    public float[] f1326i0;
    public int f1327j0;
    public final w f1328k0;
    public String f1329l0;
    public final w m0;
    public final h6 f1330n;
    public int f1331n0;
    public boolean f1332o0;
    public long f1333p0;
    public long f1334q0;
    public long f1336r0;
    public n0 f1337s;
    public final sa f1338s0;
    public final w f1339t0;
    public final w f1340u0;
    public final w f1341v0;
    public h1 f1342w;
    public LinearGradient f1343w0;
    public boolean f1345x0;
    public float f1347y0;
    public final Matrix f1348z0;
    public int f1335r = 0;
    public final p0 f1344x = new p0();
    public final RectF f1346y = new RectF();
    public final int[] E = new int[2];
    public c K = d.f1158c;
    public String M = "";
    public long S = -100000;
    public final RectF Z = new RectF();

    public k0(Context context, rf rfVar) {
        new Rect();
        this.f1319d0 = -6440822;
        this.f1321e0 = new a3.l(11);
        this.f1324g0 = new ah.j(this, 1);
        this.f1328k0 = new w(this, 8);
        this.m0 = new w(this, 9);
        this.f1338s0 = new sa(this, 1);
        this.f1339t0 = new w(this, 10);
        this.f1340u0 = new w(this, 11);
        this.f1341v0 = new w(this, 0);
        this.f1348z0 = new Matrix();
        this.B0 = new int[2];
        this.C0 = new int[2];
        this.D0 = new float[2];
        this.H0 = new e0(this, 0);
        this.h = context;
        this.f1322f = rfVar;
        this.f1330n = rfVar.f39132a.M4;
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
        p I = DictationAsr.I(language);
        if (I != null && I.d(language).length >= 2) {
            return N(DictationAsr.c0(I, language));
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
        Locale locale = hd.E0().f24436y;
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
        Locale locale = hd.E0().f24436y;
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
        v1 v1Var;
        DictationAsr.W(str);
        DictationAsr.t(DictationAsr.I(str));
        this.f1342w.setLanguage(H(str));
        if (this.f1335r == 1 && (v1Var = this.G) != null) {
            v1Var.j(str);
        }
    }

    public final void B() {
        Log.d("Dictation", "send from listening (" + w() + " chars)");
        v1 v1Var = this.G;
        if (v1Var != null) {
            v1Var.c();
        }
        this.G = null;
        org.telegram.messenger.g0.r(this.f1338s0);
        this.F.a();
        this.f1337s.setStopIsland(false);
        rf rfVar = this.f1322f;
        rfVar.f39132a.M1(null, true);
        D(false);
        this.P = 0.0f;
        this.f1342w.setIsland(false);
        this.f1342w.setSettings(false);
        this.f1342w.setStopMode(false);
        E();
        C(false);
        this.f1335r = 0;
        this.f1316b0 = 0.0f;
        ValueAnimator valueAnimator = this.f1318c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        rfVar.d(0.0f);
        this.f1337s.e();
        rfVar.b();
        rfVar.f39132a.v1();
    }

    public final void C(boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f1322f.f39132a;
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
            this.f1315b = 0L;
        }
        this.X = z10;
        jh.f fVar = this.f1314a0;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    public final void E() {
        bj bjVar;
        tl tlVar;
        bn bnVar = this.f1322f.f39132a.F3;
        if (bnVar != null) {
            bjVar = bnVar.A0;
        } else {
            bjVar = null;
        }
        if (bjVar == null || (tlVar = this.E0) == null) {
            return;
        }
        if (tlVar != bjVar) {
            e0 e0Var = this.H0;
            if (tlVar != null) {
                tlVar.q0(e0Var);
            }
            this.E0 = bjVar;
            bjVar.i(e0Var);
        }
        ValueAnimator valueAnimator = this.G0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F0, 0.0f);
        this.G0 = ofFloat;
        ofFloat.addUpdateListener(new x(this, 2));
        this.G0.addListener(new f0(this, 0));
        this.G0.setDuration(300L);
        this.G0.setInterpolator(nr.h);
        this.G0.start();
    }

    public final void F(float f10, float f11) {
        n0 n0Var = this.f1337s;
        if (n0Var != null && (n0Var.f1382a1 != f10 || n0Var.Z0 != f11)) {
            n0Var.f1382a1 = f10;
            n0Var.Z0 = f11;
            n0Var.invalidate();
        }
        h1 h1Var = this.f1342w;
        if (h1Var != null) {
            if (h1Var.m0 != f10 || h1Var.f1226l0 != f11) {
                h1Var.m0 = f10;
                h1Var.f1226l0 = f11;
                h1Var.invalidate();
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
        d dVar;
        int i7 = this.f1335r;
        if (i7 != 1 && i7 != 2) {
            this.f1332o0 = z10;
            if (i7 == 4 && (dVar = this.H) != null) {
                dVar.b();
            }
            j();
            ValueAnimator valueAnimator = this.A0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            String str2 = null;
            this.A0 = null;
            rf rfVar = this.f1322f;
            ChatActivityEnterView chatActivityEnterView = rfVar.f39132a;
            chatActivityEnterView.A1 = 0.0f;
            chatActivityEnterView.m2();
            Editable text = rfVar.f39132a.F0.getText();
            int i10 = this.f1335r;
            if (i10 == 3 || i10 == 4) {
                this.f1342w.a();
                this.f1342w.setIsland(false);
                this.f1342w.setRevert(false);
                this.f1342w.setSettings(false);
                E();
                a2 a2Var = this.F;
                if (a2Var != null) {
                    a2Var.f(false);
                }
            }
            this.J = null;
            this.K = d.f1158c;
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
            this.f1335r = 1;
            rfVar.b();
            this.U = SystemClock.uptimeMillis();
            org.telegram.messenger.g0.r(this.f1328k0);
            w wVar = this.m0;
            DictationAsr.Q(wVar);
            DictationAsr.f43038g.add(wVar);
            M(true);
            if (!z10) {
                b(1.0f, 220L, nr.h);
            }
            org.telegram.messenger.g0.r(this.f1339t0);
            n0 n0Var = this.f1337s;
            float[] fArr = this.f1325h0;
            int i11 = this.f1331n0;
            n0Var.getClass();
            if (fArr != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            n0Var.R = z11;
            if (z11) {
                n0Var.S = fArr[0] - n0Var.getLeft();
                n0Var.T = fArr[1] - n0Var.getTop();
                n0Var.U.setColor(i11);
            }
            n0 n0Var2 = this.f1337s;
            float[] fArr2 = this.f1326i0;
            int i12 = this.f1327j0;
            int[] iArr = n0Var2.f1411o0;
            if (fArr2 != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            n0Var2.A0 = z12;
            if (z12) {
                n0Var2.getLocationInWindow(iArr);
                n0Var2.B0 = fArr2[0] - iArr[0];
                n0Var2.C0 = fArr2[1] - iArr[1];
                n0Var2.D0 = fArr2[2];
                n0Var2.E0 = i12;
                n0Var2.F0 = 0L;
                if (n0Var2.J0 == null) {
                    n0Var2.J0 = n0Var2.getResources().getDrawable(2131231508).mutate();
                }
                n0Var2.J0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            StringBuilder sb2 = new StringBuilder("commit morph from circle ");
            if (this.f1326i0 == null) {
                str = "null";
            } else {
                str = ((int) this.f1326i0[0]) + "," + ((int) this.f1326i0[1]) + " r" + ((int) this.f1326i0[2]);
            }
            p5.c.t(sb2, str, "Dictation");
            this.f1326i0 = null;
            this.f1325h0 = null;
            if (!z10) {
                this.f1337s.setShown(true);
                this.f1337s.setRightMode(0);
            }
            this.f1344x.f();
            D(true);
            C(true);
            if (!z10) {
                this.f1337s.setStopIsland(true);
            }
            String Z = DictationAsr.Z();
            h1 h1Var = this.f1342w;
            if (Z != null) {
                str2 = H(Z);
            }
            h1Var.setLanguage(str2);
            this.f1342w.setSettings(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f1336r0 = uptimeMillis;
            this.f1334q0 = uptimeMillis;
            this.U = uptimeMillis;
            this.f1333p0 = 0L;
            if (!z10) {
                org.telegram.messenger.g0.h3(this.f1338s0, 300L);
            }
            if (np.g1().getInt("design_dictation_mode", 1) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            ChatActivityEnterView chatActivityEnterView2 = rfVar.f39132a;
            this.G = new v1(this.h, chatActivityEnterView2.R, chatActivityEnterView2.G3, z13, this);
            gf gfVar = rfVar.f39132a.F0;
            if (gfVar != null) {
                gfVar.n1 = true;
            }
            Log.d("Dictation", "start simulated=" + z13);
            v1 v1Var = this.G;
            v1Var.h();
            a1.e eVar = new a1.e(12, this, v1Var);
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
        arrayList.add(d.f1158c);
        arrayList.addAll(this.H.c());
        return arrayList;
    }

    public final void K() {
        Editable text = this.f1322f.f39132a.F0.getText();
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
        if (!this.f1323f0) {
            this.f1323f0 = true;
            ArrayList arrayList = q0.f1494g;
            a3.l lVar = this.f1321e0;
            if (!arrayList.contains(lVar)) {
                arrayList.add(lVar);
            }
        }
        try {
            du0 du0Var = this.f1322f.f39132a.f32557c2;
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
                this.f1319d0 = Color.rgb((int) (j3 / 64), (int) (j10 / 64), (int) (j11 / 64));
            }
        } catch (Throwable unused) {
        }
        int i16 = m6.f29347d6;
        h6 h6Var = this.f1330n;
        int w02 = m6.w0(i16, h6Var);
        boolean c10 = p0.c(w02);
        p0 p0Var = this.f1344x;
        if (p0Var.h != c10) {
            p0Var.h = c10;
        }
        int i17 = m6.Pe;
        p0.h(m6.w0(i17, h6Var));
        p0Var.g(this.f1319d0, m6.w0(i17, h6Var));
        int[] iArr = p0Var.B;
        int i18 = iArr[0];
        int i19 = iArr[1];
        if (c2.f1155e != i18 || c2.f1156f != i19) {
            c2.f1155e = i18;
            c2.f1156f = i19;
            Arrays.fill(c2.f1157g[0], (Object) null);
        }
        if (this.f1337s != null) {
            int w03 = m6.w0(i17, h6Var) | (-16777216);
            n0 n0Var = this.f1337s;
            int f10 = i0.a.f(0.1f, w03, iArr[6]);
            int i20 = iArr[4];
            n0Var.f1393e1 = w03;
            n0Var.f1396f1 = f10;
            n0Var.f1398g1 = i20;
            if (!n0Var.f1412p0) {
                n0Var.f1413q0 = w03;
                n0Var.f1415r0 = f10;
                n0Var.f1417s0 = null;
                n0Var.invalidate();
            }
            this.f1337s.setDayIconBase(m6.w0(m6.Nl, h6Var));
        }
        this.f1343w0 = null;
        jh.f fVar = this.f1314a0;
        if (fVar != null) {
            fVar.invalidate();
        }
        n0 n0Var2 = this.f1337s;
        if (n0Var2 != null) {
            int i21 = m6.Nl;
            int w04 = m6.w0(i21, h6Var);
            int w05 = m6.w0(i17, h6Var);
            n0Var2.d.setColor(w04);
            n0Var2.f1391e.setColor(w05);
            n0Var2.f1394f.setColor(w05);
            n0Var2.invalidate();
            n0 n0Var3 = this.f1337s;
            int w06 = m6.w0(i21, h6Var);
            Paint paint = n0Var3.f1389d0;
            Paint paint2 = n0Var3.f1387c0;
            n0Var3.f1412p0 = c10;
            if (c10) {
                i7 = p0.e(-13665281);
            } else {
                i7 = n0Var3.f1393e1;
            }
            n0Var3.f1413q0 = i7;
            if (c10) {
                i10 = p0.e(-7447553);
            } else {
                i10 = n0Var3.f1396f1;
            }
            n0Var3.f1415r0 = i10;
            n0Var3.f1417s0 = null;
            Paint paint3 = n0Var3.f1384b0;
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
            n0Var3.f1392e0.setColor(w06);
            n0Var3.invalidate();
            this.f1337s.setSendIconColor(m6.w0(m6.Tf, h6Var));
        }
        a2 a2Var = this.F;
        if (a2Var != null) {
            a2Var.c(u(m6.w0(i17, h6Var), w02, c10), m6.w0(m6.Le, h6Var), c10);
        }
        h1 h1Var = this.f1342w;
        if (h1Var != null) {
            h1Var.e();
        }
    }

    public final void M(boolean z10) {
        long[] jArr;
        String str;
        boolean z11;
        if (!DictationAsr.G(new long[2])) {
            str = null;
        } else {
            str = " " + hd.a0(null, null, 2131745063, Long.valueOf(Math.round(jArr[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(jArr[1] / 1048576.0d))));
        }
        if (!z10 && TextUtils.equals(str, this.f1329l0)) {
            return;
        }
        this.f1329l0 = str;
        rf rfVar = this.f1322f;
        if (str == null) {
            rfVar.f39132a.M1(hd.N0(2131745056, null), true);
            return;
        }
        String N0 = hd.N0(2131745062, null);
        ChatActivityEnterView chatActivityEnterView = rfVar.f39132a;
        CharSequence charSequence = chatActivityEnterView.f32570e;
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
        a2 a2Var = this.F;
        Editable editableText = a2Var.f1119a.getEditableText();
        if (editableText != null) {
            a2Var.d(editableText, editableText.length());
        }
        rf rfVar = this.f1322f;
        gf gfVar = rfVar.f39132a.F0;
        InputMethodManager inputMethodManager = (InputMethodManager) this.h.getSystemService("input_method");
        if (inputMethodManager != null && gfVar != null) {
            inputMethodManager.restartInput(gfVar);
        }
        this.G = null;
        if (str2 != null) {
            Log.d("Dictation", "stopped with error: ".concat(str2));
        }
        if (w() <= 0 && (this.N <= 0 || rfVar.f39132a.F0.getText().toString().trim().length() <= 0)) {
            g();
            K();
            this.f1342w.setIsland(false);
            this.f1342w.setSettings(false);
            this.f1342w.setStopMode(false);
            E();
            this.f1335r = 0;
            rfVar.b();
            return;
        }
        this.f1335r = 3;
        rfVar.b();
        this.I = 0;
        this.f1337s.setCancelShown(false);
        if (!this.f1332o0) {
            e();
        }
        this.f1337s.setHandOff(true);
        this.f1337s.setRightMode(2);
        rfVar.f39132a.M1(null, true);
        D(false);
        this.P = 0.0f;
        org.telegram.messenger.g0.h3(this.f1339t0, 460L);
        this.f1342w.setStopMode(false);
        this.f1342w.d(hd.N0(2131745060, null), false);
        gf gfVar2 = rfVar.f39132a.F0;
        gfVar2.setSelection(gfVar2.length());
        if (!this.f1332o0) {
            gfVar2.requestFocus();
            org.telegram.messenger.g0.h3(new a3.f(gfVar2, 6), 120L);
        }
        org.telegram.messenger.g0.h3(new w(this, 7), 90L);
    }

    public final void b(float f10, long j3, TimeInterpolator timeInterpolator) {
        ValueAnimator valueAnimator = this.f1318c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f1316b0, f10);
        this.f1318c0 = ofFloat;
        ofFloat.addUpdateListener(new x(this, 1));
        this.f1318c0.setDuration(j3);
        this.f1318c0.setInterpolator(timeInterpolator);
        this.f1318c0.start();
    }

    public final void c(c cVar) {
        boolean z10;
        String a02;
        if (this.f1335r == 3) {
            if (this.I > this.f1322f.f39132a.F0.length()) {
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
            this.f1335r = 4;
            this.f1315b = 0L;
            this.V = SystemClock.uptimeMillis();
            h1 h1Var = this.f1342w;
            if (cVar.d) {
                a02 = hd.N0(2131745059, null);
            } else {
                a02 = hd.a0(null, null, 2131745069, cVar.a());
            }
            h1Var.d(a02, true);
            this.F.a();
            this.F.f(true);
            this.f1344x.f();
            n0 n0Var = this.f1337s;
            if (n0Var != null) {
                n0Var.R0 = SystemClock.uptimeMillis();
                n0Var.setVisibility(0);
                n0Var.f1425y = true;
                n0Var.E = false;
                n0Var.R = false;
                n0Var.A0 = false;
                n0Var.L0 = false;
                n0Var.f1407l0 = false;
                n0Var.l1 = false;
                n0Var.F.e(true, 1.0f);
                n0Var.G.e(true, 0.0f);
                n0Var.H.e(true, 0.0f);
                n0Var.I.e(true, 0.0f);
                n0Var.J.e(true, 1.0f);
                n0Var.O0.e(true, 0.0f);
                n0Var.f1385b1 = 0L;
                n0Var.N0.e(true, 1.0f);
                n0Var.L = 3;
                n0Var.invalidate();
            }
            jh.f fVar = this.f1314a0;
            if (fVar != null) {
                fVar.invalidate();
            }
            c cVar2 = this.K;
            this.K = cVar;
            this.H.a(cVar, str2, new a3.g(this, cVar2, z10, cVar, 1));
        }
    }

    public final void e() {
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A0 = ofFloat;
        ofFloat.addUpdateListener(new x(this, 0));
        this.A0.setDuration(220L);
        this.A0.setInterpolator(nr.f37918g);
        this.A0.start();
    }

    public final void f(long j3, long j10) {
        n0 n0Var = this.f1337s;
        if (n0Var == null) {
            return;
        }
        if (n0Var.L == 3) {
            n0Var.f1385b1 = SystemClock.uptimeMillis() + j3;
            n0Var.f1388c1 = Math.max(1L, j10);
            n0Var.invalidate();
        }
        org.telegram.messenger.g0.h3(new w(this, 6), j3 + j10 + 60);
    }

    public final void g() {
        org.telegram.messenger.g0.r(this.f1338s0);
        n0 n0Var = this.f1337s;
        if (n0Var != null) {
            n0Var.setStopIsland(false);
        }
        org.telegram.messenger.g0.r(this.f1339t0);
        org.telegram.messenger.g0.r(this.f1328k0);
        w wVar = this.f1340u0;
        org.telegram.messenger.g0.r(wVar);
        w wVar2 = this.f1341v0;
        org.telegram.messenger.g0.r(wVar2);
        n0 n0Var2 = this.f1337s;
        n0Var2.L0 = true;
        n0Var2.R = false;
        SystemClock.uptimeMillis();
        if (n0Var2.J0 == null) {
            Drawable mutate = n0Var2.getResources().getDrawable(2131231508).mutate();
            n0Var2.J0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        n0Var2.invalidate();
        if (!this.f1332o0) {
            e();
        }
        D(false);
        this.P = 0.0f;
        org.telegram.messenger.g0.h3(wVar, 30L);
        org.telegram.messenger.g0.h3(wVar2, 310L);
    }

    @Override
    public final void h(float f10) {
        ChatActivityEnterView chatActivityEnterView;
        ChatActivityEnterView.RecordCircle recordCircle;
        this.P = f10;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (f10 > 0.38f) {
            if (this.f1333p0 == 0) {
                this.f1333p0 = uptimeMillis;
            }
            if (uptimeMillis - this.f1333p0 >= 150) {
                this.U = uptimeMillis;
            }
        } else {
            this.f1333p0 = 0L;
        }
        n0 n0Var = this.f1337s;
        if (n0Var != null) {
            n0Var.setLevel(f10);
        }
        if (this.f1332o0 && (recordCircle = (chatActivityEnterView = this.f1322f.f39132a).D2) != null && chatActivityEnterView.f32702v3) {
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
        rf rfVar = this.f1322f;
        du0 du0Var = rfVar.f39132a.f32557c2;
        n0 n0Var = this.f1337s;
        Context context = this.h;
        if (n0Var == null) {
            n0 n0Var2 = new n0(context, this);
            this.f1337s = n0Var2;
            n0Var2.setBorderColorSource(new v(this, 0));
            this.f1337s.setVisibility(8);
        }
        if (this.f1337s.getParent() != du0Var) {
            org.telegram.messenger.g0.E2(this.f1337s);
            du0Var.addView(this.f1337s, na.e(-1, -1, 80));
        } else {
            this.f1337s.bringToFront();
        }
        n0 n0Var3 = this.f1337s;
        ChatActivityEnterView chatActivityEnterView = rfVar.f39132a;
        fe feVar = chatActivityEnterView.R0;
        oe oeVar = chatActivityEnterView.f32538a1;
        n0Var3.f1383b = feVar;
        n0Var3.f1386c = oeVar;
        n0Var3.setBubbleProvider(new cb.c(this, 4));
        if (this.f1342w == null) {
            this.f1342w = new h1(context, this.f1330n, this);
        }
        if (this.f1342w.getParent() != du0Var) {
            org.telegram.messenger.g0.E2(this.f1342w);
            du0Var.addView(this.f1342w, na.e(-1, -1, 80));
        } else {
            this.f1342w.bringToFront();
        }
        ChatActivityEnterView chatActivityEnterView2 = rfVar.f39132a;
        int i7 = ChatActivityEnterView.f32535s7;
        jh.f D0 = chatActivityEnterView2.D0();
        jh.f fVar = this.f1314a0;
        if (D0 != fVar) {
            d6 d6Var2 = null;
            if (fVar != null) {
                fVar.f17771f = null;
            }
            this.f1314a0 = D0;
            if (D0 != null) {
                d6Var = new d6(D0, 0L, 380L, new nr(0.22d, 0.61d, 0.36d, 1.0d));
            } else {
                d6Var = null;
            }
            this.Y = d6Var;
            if (D0 != null) {
                d6Var2 = new d6(D0, 1L, 300L, nr.f37918g);
            }
            this.f1320e = d6Var2;
        }
        jh.f fVar2 = this.f1314a0;
        if (fVar2 != null) {
            fVar2.f17771f = new v(this, 2);
            dh.c cVar = rfVar.f39132a.L1;
            if (cVar != null && (gVar = fVar2.f17772n) != null && (aVar = gVar.f11666w) != null) {
                fh.g c10 = cVar.c(this.f1342w, aVar, false);
                fh.g c11 = cVar.c(this.f1342w, this.f1314a0.f17772n.f11666w, false);
                h1 h1Var = this.f1342w;
                fh.g c12 = cVar.c(h1Var, this.f1314a0.f17772n.f11666w, false);
                h1Var.I = c10;
                h1Var.J = c11;
                h1Var.K = c12;
                c10.r(org.telegram.messenger.g0.L(18.0f));
                c11.r(org.telegram.messenger.g0.L(18.0f));
                c12.r(org.telegram.messenger.g0.L(18.0f));
                h1 h1Var2 = this.f1342w;
                h1Var2.setGearGlass(cVar.c(h1Var2, this.f1314a0.f17772n.f11666w, false));
                n0 n0Var4 = this.f1337s;
                if (n0Var4 != null) {
                    n0Var4.setStopGlass(cVar.c(n0Var4, new qb.a(2), false));
                }
            }
        }
        gf gfVar = rfVar.f39132a.F0;
        if (this.F == null) {
            a2 a2Var = new a2(gfVar);
            this.F = a2Var;
            a2Var.h = new v(this, 4);
            this.f1313a = new i1(gfVar);
            gfVar.addTextChangedListener(this.f1324g0);
        }
        if (this.H == null) {
            this.H = new d(rfVar.f39132a.R);
        }
        L();
    }

    public final void k() {
        rf rfVar = this.f1322f;
        gf gfVar = rfVar.f39132a.F0;
        if (gfVar != null) {
            gfVar.n1 = false;
        }
        v1 v1Var = this.G;
        if (v1Var != null) {
            v1Var.c();
        }
        this.G = null;
        d dVar = this.H;
        if (dVar != null) {
            dVar.b();
        }
        if (p()) {
            g();
        }
        h1 h1Var = this.f1342w;
        if (h1Var != null) {
            h1Var.a();
            this.f1342w.setIsland(false);
            this.f1342w.setRevert(false);
            this.f1342w.setSettings(false);
        }
        this.J = null;
        this.f1335r = 0;
        D(false);
        i1 i1Var = this.f1313a;
        if (i1Var != null) {
            i1Var.c();
        }
        ChatActivityEnterView chatActivityEnterView = rfVar.f39132a;
        chatActivityEnterView.G1 = 0L;
        chatActivityEnterView.H1 = null;
        n0 n0Var = this.f1337s;
        if (n0Var != null && n0Var.getRightMode() == 3) {
            this.f1337s.e();
        }
        a2 a2Var = this.F;
        if (a2Var != null) {
            a2Var.f(false);
        }
        C(false);
        E();
        rfVar.b();
    }

    @Override
    public final void l(int i7, String str) {
        int max;
        if (!p()) {
            return;
        }
        this.f1334q0 = SystemClock.uptimeMillis();
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
        jh.f fVar = this.f1314a0;
        if (fVar == null || (gVar = fVar.f17772n) == null) {
            return false;
        }
        Rect rect = gVar.R.f11641m;
        if (rect.isEmpty()) {
            return false;
        }
        jh.f fVar2 = this.f1314a0;
        int[] iArr = this.E;
        fVar2.getLocationInWindow(iArr);
        rectF.set(rect);
        rectF.offset(iArr[0], iArr[1]);
        return true;
    }

    public final boolean n() {
        if (this.f1335r != 0) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (this.f1332o0 && this.f1335r != 0) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        int i7 = this.f1335r;
        if (i7 == 1 || i7 == 2) {
            return true;
        }
        return false;
    }

    public final boolean r(float[] fArr) {
        gf gfVar = this.f1322f.f39132a.F0;
        if (this.f1314a0 == null || gfVar == null || gfVar.getLayout() == null) {
            return false;
        }
        jh.f fVar = this.f1314a0;
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
        v1 v1Var = this.G;
        if (v1Var != null) {
            v1Var.c();
        }
        this.G = null;
        rf rfVar = this.f1322f;
        Editable text = rfVar.f39132a.F0.getText();
        if (text != null && this.I <= text.length()) {
            this.L = true;
            this.F.a();
            text.delete(this.I, text.length());
            this.L = false;
        }
        K();
        g();
        C(false);
        this.f1342w.setIsland(false);
        this.f1342w.setSettings(false);
        this.f1342w.setStopMode(false);
        E();
        this.f1335r = 0;
        rfVar.b();
    }

    public final void t() {
        if (this.f1335r == 1) {
            org.telegram.messenger.g0.r(this.f1338s0);
            this.f1335r = 2;
            this.f1337s.setStopIsland(false);
            this.f1337s.setRightMode(1);
            this.f1337s.setCancelShown(false);
            v1 v1Var = this.G;
            if (v1Var != null) {
                v1Var.m();
            }
        }
    }

    public final void v(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: ai.k0.v(java.lang.String):void");
    }

    public final int w() {
        Editable text = this.f1322f.f39132a.F0.getText();
        if (text == null) {
            return 0;
        }
        return Math.max(0, text.length() - Math.min(this.I, text.length()));
    }

    @Override
    public final void x(String str) {
        String H;
        h1 h1Var = this.f1342w;
        if (h1Var != null) {
            if (str == null) {
                H = null;
            } else {
                H = H(str);
            }
            h1Var.setLanguage(H);
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
        Editable text = this.f1322f.f39132a.F0.getText();
        if (text == null) {
            return "";
        }
        return text.subSequence(Math.min(this.I, text.length()), text.length()).toString();
    }
}
