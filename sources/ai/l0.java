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
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a31;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.ge;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.pe;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.bj;
import org.telegram.ui.bn;
import org.telegram.ui.tl;
public final class l0 implements v1 {
    public static final kr I0 = new kr(0.3d, 0.0d, 0.2d, 1.0d);
    public ValueAnimator A0;
    public final int[] B0;
    public final int[] C0;
    public final float[] D0;
    public tl E0;
    public b2 F;
    public float F0;
    public w1 G;
    public ValueAnimator G0;
    public d H;
    public final f0 H0;
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
    public j1 f1328a;
    public jh.f f1329a0;
    public long f1330b;
    public float f1331b0;
    public float f1332c;
    public ValueAnimator f1333c0;
    public boolean d;
    public int f1334d0;
    public c6 f1335e;
    public final a3.l f1336e0;
    public final rf f1337f;
    public boolean f1338f0;
    public final ah.j f1339g0;
    public final Context h;
    public float[] f1340h0;
    public float[] f1341i0;
    public int f1342j0;
    public final x f1343k0;
    public String f1344l0;
    public final x m0;
    public final i6 f1345n;
    public int f1346n0;
    public boolean f1347o0;
    public long f1348p0;
    public long f1349q0;
    public long f1351r0;
    public o0 f1352s;
    public final sa f1353s0;
    public final x f1354t0;
    public final x f1355u0;
    public final x f1356v0;
    public i1 f1357w;
    public LinearGradient f1358w0;
    public boolean f1360x0;
    public float f1362y0;
    public final Matrix f1363z0;
    public int f1350r = 0;
    public final q0 f1359x = new q0();
    public final RectF f1361y = new RectF();
    public final int[] E = new int[2];
    public c K = d.f1156c;
    public String M = "";
    public long S = -100000;
    public final RectF Z = new RectF();

    public l0(Context context, rf rfVar) {
        new Rect();
        this.f1334d0 = -6440822;
        this.f1336e0 = new a3.l(11);
        this.f1339g0 = new ah.j(this, 1);
        this.f1343k0 = new x(this, 8);
        this.m0 = new x(this, 9);
        this.f1353s0 = new sa(this, 1);
        this.f1354t0 = new x(this, 10);
        this.f1355u0 = new x(this, 11);
        this.f1356v0 = new x(this, 0);
        this.f1363z0 = new Matrix();
        this.B0 = new int[2];
        this.C0 = new int[2];
        this.D0 = new float[2];
        this.H0 = new f0(this, 0);
        this.h = context;
        this.f1337f = rfVar;
        this.f1345n = rfVar.f39289a.M4;
    }

    public static void E(TLRPC.TL_error tL_error) {
        kc Y = kc.Y();
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

    public static String F(String str) {
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        q M = DictationAsr.M(language);
        if (M != null && M.d(language).length >= 2) {
            return L(DictationAsr.g0(M, language));
        }
        return o(str);
    }

    public static String L(String str) {
        String N = N(str);
        if (N == null) {
            return o(str);
        }
        return o(str) + " (" + N + ")";
    }

    public static String N(String str) {
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
        Locale locale = gd.E0().f24342y;
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

    public static String o(String str) {
        String str2;
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        Locale locale = gd.E0().f24342y;
        if (locale != null) {
            str2 = new Locale(language).getDisplayLanguage(locale);
        } else {
            str2 = null;
        }
        if (str2 != null && !str2.isEmpty() && !str2.equalsIgnoreCase(language)) {
            return str2.substring(0, 1).toUpperCase(locale) + str2.substring(1);
        }
        String Q0 = a31.Q0(language);
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
        ChatActivityEnterView chatActivityEnterView = this.f1337f.f39289a;
        hf hfVar = chatActivityEnterView.F0;
        if (hfVar != null && z10) {
            chatActivityEnterView.F1 = false;
            if (hfVar != null) {
                hfVar.invalidate();
            }
        }
    }

    public final void B(boolean z10) {
        if (z10) {
            this.f1330b = 0L;
        }
        this.X = z10;
        jh.f fVar = this.f1329a0;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    public final void C() {
        bj bjVar;
        tl tlVar;
        bn bnVar = this.f1337f.f39289a.F3;
        if (bnVar != null) {
            bjVar = bnVar.A0;
        } else {
            bjVar = null;
        }
        if (bjVar == null || (tlVar = this.E0) == null) {
            return;
        }
        if (tlVar != bjVar) {
            f0 f0Var = this.H0;
            if (tlVar != null) {
                tlVar.q0(f0Var);
            }
            this.E0 = bjVar;
            bjVar.i(f0Var);
        }
        ValueAnimator valueAnimator = this.G0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F0, 0.0f);
        this.G0 = ofFloat;
        ofFloat.addUpdateListener(new y(this, 2));
        this.G0.addListener(new g0(this, 0));
        this.G0.setDuration(300L);
        this.G0.setInterpolator(kr.h);
        this.G0.start();
    }

    public final void D(float f10, float f11) {
        o0 o0Var = this.f1352s;
        if (o0Var != null && (o0Var.f1396a1 != f10 || o0Var.Z0 != f11)) {
            o0Var.f1396a1 = f10;
            o0Var.Z0 = f11;
            o0Var.invalidate();
        }
        i1 i1Var = this.f1357w;
        if (i1Var != null) {
            if (i1Var.m0 != f10 || i1Var.f1240l0 != f11) {
                i1Var.m0 = f10;
                i1Var.f1240l0 = f11;
                i1Var.invalidate();
            }
        }
    }

    public final void G(boolean z10) {
        int length;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        long j3;
        d dVar;
        int i7 = this.f1350r;
        if (i7 != 1 && i7 != 2) {
            this.f1347o0 = z10;
            if (i7 == 4 && (dVar = this.H) != null) {
                dVar.b();
            }
            i();
            ValueAnimator valueAnimator = this.A0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            String str2 = null;
            this.A0 = null;
            rf rfVar = this.f1337f;
            ChatActivityEnterView chatActivityEnterView = rfVar.f39289a;
            chatActivityEnterView.A1 = 0.0f;
            chatActivityEnterView.o2();
            Editable text = rfVar.f39289a.F0.getText();
            int i10 = this.f1350r;
            if (i10 == 3 || i10 == 4) {
                this.f1357w.a();
                this.f1357w.setIsland(false);
                this.f1357w.setRevert(false);
                this.f1357w.setSettings(false);
                C();
                b2 b2Var = this.F;
                if (b2Var != null) {
                    b2Var.f(false);
                }
            }
            this.J = null;
            this.K = d.f1156c;
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
            this.f1350r = 1;
            rfVar.b();
            this.U = SystemClock.uptimeMillis();
            org.telegram.messenger.g0.r(this.f1343k0);
            x xVar = this.m0;
            DictationAsr.U(xVar);
            DictationAsr.l(xVar);
            K(true);
            if (!z10) {
                b(1.0f, 220L, kr.h);
            }
            org.telegram.messenger.g0.r(this.f1354t0);
            o0 o0Var = this.f1352s;
            float[] fArr = this.f1340h0;
            int i11 = this.f1346n0;
            o0Var.getClass();
            if (fArr != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            o0Var.R = z11;
            if (z11) {
                o0Var.S = fArr[0] - o0Var.getLeft();
                o0Var.T = fArr[1] - o0Var.getTop();
                o0Var.U.setColor(i11);
            }
            o0 o0Var2 = this.f1352s;
            float[] fArr2 = this.f1341i0;
            int i12 = this.f1342j0;
            int[] iArr = o0Var2.f1425o0;
            if (fArr2 != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            o0Var2.A0 = z12;
            if (z12) {
                o0Var2.getLocationInWindow(iArr);
                o0Var2.B0 = fArr2[0] - iArr[0];
                o0Var2.C0 = fArr2[1] - iArr[1];
                o0Var2.D0 = fArr2[2];
                o0Var2.E0 = i12;
                o0Var2.F0 = 0L;
                if (o0Var2.J0 == null) {
                    o0Var2.J0 = o0Var2.getResources().getDrawable(2131231511).mutate();
                }
                o0Var2.J0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            StringBuilder sb2 = new StringBuilder("commit morph from circle ");
            if (this.f1341i0 == null) {
                str = "null";
            } else {
                str = ((int) this.f1341i0[0]) + "," + ((int) this.f1341i0[1]) + " r" + ((int) this.f1341i0[2]);
            }
            p5.c.t(sb2, str, "Dictation");
            this.f1341i0 = null;
            this.f1340h0 = null;
            if (!z10) {
                this.f1352s.setShown(true);
                this.f1352s.setRightMode(0);
            }
            this.f1359x.f();
            B(true);
            A(true);
            if (!z10) {
                this.f1352s.setStopIsland(true);
            }
            String d02 = DictationAsr.d0();
            i1 i1Var = this.f1357w;
            if (d02 != null) {
                str2 = F(d02);
            }
            i1Var.setLanguage(str2);
            this.f1357w.setSettings(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f1351r0 = uptimeMillis;
            this.f1349q0 = uptimeMillis;
            this.U = uptimeMillis;
            this.f1348p0 = 0L;
            if (!z10) {
                org.telegram.messenger.g0.h3(this.f1353s0, 300L);
            }
            if (mp.g1().getInt("design_dictation_mode", 1) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            ChatActivityEnterView chatActivityEnterView2 = rfVar.f39289a;
            this.G = new w1(this.h, chatActivityEnterView2.R, chatActivityEnterView2.G3, z13, this);
            hf hfVar = rfVar.f39289a.F0;
            if (hfVar != null) {
                hfVar.n1 = true;
            }
            Log.d("Dictation", "start simulated=" + z13);
            w1 w1Var = this.G;
            w1Var.h();
            a1.e eVar = new a1.e(14, this, w1Var);
            if (!z13 && !z10) {
                j3 = 420;
            } else {
                j3 = 120;
            }
            org.telegram.messenger.g0.h3(eVar, j3);
        }
    }

    public final ArrayList H() {
        i();
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.f1156c);
        arrayList.addAll(this.H.c());
        return arrayList;
    }

    public final void I() {
        Editable text = this.f1337f.f39289a.F0.getText();
        if (text != null && text.length() > 0 && text.length() == this.I && Character.isWhitespace(text.charAt(text.length() - 1))) {
            this.L = true;
            text.delete(text.length() - 1, text.length());
            this.L = false;
        }
    }

    public final void J() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        Drawable backgroundImage;
        if (!this.f1338f0) {
            this.f1338f0 = true;
            ArrayList arrayList = r0.f1506g;
            a3.l lVar = this.f1336e0;
            if (!arrayList.contains(lVar)) {
                arrayList.add(lVar);
            }
        }
        try {
            cu0 cu0Var = this.f1337f.f39289a.f32655c2;
            if (cu0Var != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (backgroundImage = cu0Var.getBackgroundImage()) != null) {
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
                this.f1334d0 = Color.rgb((int) (j3 / 64), (int) (j10 / 64), (int) (j11 / 64));
            }
        } catch (Throwable unused) {
        }
        int i16 = n6.f29451d6;
        i6 i6Var = this.f1345n;
        int w02 = n6.w0(i16, i6Var);
        boolean c10 = q0.c(w02);
        q0 q0Var = this.f1359x;
        if (q0Var.h != c10) {
            q0Var.h = c10;
        }
        int i17 = n6.Pe;
        q0.h(n6.w0(i17, i6Var));
        q0Var.g(this.f1334d0, n6.w0(i17, i6Var));
        int[] iArr = q0Var.B;
        int i18 = iArr[0];
        int i19 = iArr[1];
        if (d2.f1169e != i18 || d2.f1170f != i19) {
            d2.f1169e = i18;
            d2.f1170f = i19;
            Arrays.fill(d2.f1171g[0], (Object) null);
        }
        if (this.f1352s != null) {
            int w03 = n6.w0(i17, i6Var) | (-16777216);
            o0 o0Var = this.f1352s;
            int f10 = i0.a.f(0.1f, w03, iArr[6]);
            int i20 = iArr[4];
            o0Var.f1407e1 = w03;
            o0Var.f1410f1 = f10;
            o0Var.f1412g1 = i20;
            if (!o0Var.f1426p0) {
                o0Var.f1427q0 = w03;
                o0Var.f1429r0 = f10;
                o0Var.f1431s0 = null;
                o0Var.invalidate();
            }
            this.f1352s.setDayIconBase(n6.w0(n6.Nl, i6Var));
        }
        this.f1358w0 = null;
        jh.f fVar = this.f1329a0;
        if (fVar != null) {
            fVar.invalidate();
        }
        o0 o0Var2 = this.f1352s;
        if (o0Var2 != null) {
            int i21 = n6.Nl;
            int w04 = n6.w0(i21, i6Var);
            int w05 = n6.w0(i17, i6Var);
            o0Var2.d.setColor(w04);
            o0Var2.f1405e.setColor(w05);
            o0Var2.f1408f.setColor(w05);
            o0Var2.invalidate();
            o0 o0Var3 = this.f1352s;
            int w06 = n6.w0(i21, i6Var);
            Paint paint = o0Var3.f1403d0;
            Paint paint2 = o0Var3.f1401c0;
            o0Var3.f1426p0 = c10;
            if (c10) {
                i7 = q0.e(-13665281);
            } else {
                i7 = o0Var3.f1407e1;
            }
            o0Var3.f1427q0 = i7;
            if (c10) {
                i10 = q0.e(-7447553);
            } else {
                i10 = o0Var3.f1410f1;
            }
            o0Var3.f1429r0 = i10;
            o0Var3.f1431s0 = null;
            Paint paint3 = o0Var3.f1398b0;
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
            o0Var3.f1406e0.setColor(w06);
            o0Var3.invalidate();
            this.f1352s.setSendIconColor(n6.w0(n6.Tf, i6Var));
        }
        b2 b2Var = this.F;
        if (b2Var != null) {
            b2Var.c(t(n6.w0(i17, i6Var), w02, c10), n6.w0(n6.Le, i6Var), c10);
        }
        i1 i1Var = this.f1357w;
        if (i1Var != null) {
            i1Var.e();
        }
    }

    public final void K(boolean z10) {
        long[] jArr;
        String str;
        boolean z11;
        if (!DictationAsr.K(new long[2])) {
            str = null;
        } else {
            str = " " + gd.a0(null, null, 2131745063, Long.valueOf(Math.round(jArr[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(jArr[1] / 1048576.0d))));
        }
        if (!z10 && TextUtils.equals(str, this.f1344l0)) {
            return;
        }
        this.f1344l0 = str;
        rf rfVar = this.f1337f;
        if (str == null) {
            rfVar.f39289a.N1(gd.N0(2131745056, null), true);
            return;
        }
        String N0 = gd.N0(2131745062, null);
        ChatActivityEnterView chatActivityEnterView = rfVar.f39289a;
        CharSequence charSequence = chatActivityEnterView.f32668e;
        if (charSequence != null && charSequence.toString().startsWith(N0.toString())) {
            z11 = true;
        } else {
            z11 = false;
        }
        chatActivityEnterView.N1(TextUtils.concat(N0, str), !z11);
    }

    @Override
    public final void M(int i7, String str) {
        int max;
        if (!n()) {
            return;
        }
        this.f1349q0 = SystemClock.uptimeMillis();
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

    @Override
    public final void P(String str) {
        String F;
        i1 i1Var = this.f1357w;
        if (i1Var != null) {
            if (str == null) {
                F = null;
            } else {
                F = F(str);
            }
            i1Var.setLanguage(F);
        }
    }

    @Override
    public final void a(String str, String str2) {
        if (!n()) {
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
        b2 b2Var = this.F;
        Editable editableText = b2Var.f1130a.getEditableText();
        if (editableText != null) {
            b2Var.d(editableText, editableText.length());
        }
        rf rfVar = this.f1337f;
        hf hfVar = rfVar.f39289a.F0;
        InputMethodManager inputMethodManager = (InputMethodManager) this.h.getSystemService("input_method");
        if (inputMethodManager != null && hfVar != null) {
            inputMethodManager.restartInput(hfVar);
        }
        this.G = null;
        if (str2 != null) {
            Log.d("Dictation", "stopped with error: ".concat(str2));
        }
        if (v() <= 0 && (this.N <= 0 || rfVar.f39289a.F0.getText().toString().trim().length() <= 0)) {
            h();
            I();
            this.f1357w.setIsland(false);
            this.f1357w.setSettings(false);
            this.f1357w.setStopMode(false);
            C();
            this.f1350r = 0;
            rfVar.b();
            return;
        }
        this.f1350r = 3;
        rfVar.b();
        this.I = 0;
        this.f1352s.setCancelShown(false);
        if (!this.f1347o0) {
            e();
        }
        this.f1352s.setHandOff(true);
        this.f1352s.setRightMode(2);
        rfVar.f39289a.N1(null, true);
        B(false);
        this.P = 0.0f;
        org.telegram.messenger.g0.h3(this.f1354t0, 460L);
        this.f1357w.setStopMode(false);
        this.f1357w.d(gd.N0(2131745060, null), false);
        hf hfVar2 = rfVar.f39289a.F0;
        hfVar2.setSelection(hfVar2.length());
        if (!this.f1347o0) {
            hfVar2.requestFocus();
            org.telegram.messenger.g0.h3(new a3.f(hfVar2, 6), 120L);
        }
        org.telegram.messenger.g0.h3(new x(this, 7), 90L);
    }

    public final void b(float f10, long j3, TimeInterpolator timeInterpolator) {
        ValueAnimator valueAnimator = this.f1333c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f1331b0, f10);
        this.f1333c0 = ofFloat;
        ofFloat.addUpdateListener(new y(this, 1));
        this.f1333c0.setDuration(j3);
        this.f1333c0.setInterpolator(timeInterpolator);
        this.f1333c0.start();
    }

    public final void c(c cVar) {
        boolean z10;
        String a02;
        if (this.f1350r == 3) {
            if (this.I > this.f1337f.f39289a.F0.length()) {
                this.I = 0;
            }
            String str = this.J;
            if (str != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (str == null) {
                this.J = x();
            }
            String str2 = this.J;
            if (TextUtils.isEmpty(str2.trim())) {
                if (!z10) {
                    this.J = null;
                    return;
                }
                return;
            }
            this.f1350r = 4;
            this.f1330b = 0L;
            this.V = SystemClock.uptimeMillis();
            i1 i1Var = this.f1357w;
            if (cVar.d) {
                a02 = gd.N0(2131745059, null);
            } else {
                a02 = gd.a0(null, null, 2131745069, cVar.a());
            }
            i1Var.d(a02, true);
            this.F.a();
            this.F.f(true);
            this.f1359x.f();
            o0 o0Var = this.f1352s;
            if (o0Var != null) {
                o0Var.R0 = SystemClock.uptimeMillis();
                o0Var.setVisibility(0);
                o0Var.f1439y = true;
                o0Var.E = false;
                o0Var.R = false;
                o0Var.A0 = false;
                o0Var.L0 = false;
                o0Var.f1421l0 = false;
                o0Var.l1 = false;
                o0Var.F.e(true, 1.0f);
                o0Var.G.e(true, 0.0f);
                o0Var.H.e(true, 0.0f);
                o0Var.I.e(true, 0.0f);
                o0Var.J.e(true, 1.0f);
                o0Var.O0.e(true, 0.0f);
                o0Var.f1399b1 = 0L;
                o0Var.N0.e(true, 1.0f);
                o0Var.L = 3;
                o0Var.invalidate();
            }
            jh.f fVar = this.f1329a0;
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
        ofFloat.addUpdateListener(new y(this, 0));
        this.A0.setDuration(220L);
        this.A0.setInterpolator(kr.f36859g);
        this.A0.start();
    }

    @Override
    public final void f(float f10) {
        ChatActivityEnterView chatActivityEnterView;
        ChatActivityEnterView.RecordCircle recordCircle;
        this.P = f10;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (f10 > 0.38f) {
            if (this.f1348p0 == 0) {
                this.f1348p0 = uptimeMillis;
            }
            if (uptimeMillis - this.f1348p0 >= 150) {
                this.U = uptimeMillis;
            }
        } else {
            this.f1348p0 = 0L;
        }
        o0 o0Var = this.f1352s;
        if (o0Var != null) {
            o0Var.setLevel(f10);
        }
        if (this.f1347o0 && (recordCircle = (chatActivityEnterView = this.f1337f.f39289a).D2) != null && chatActivityEnterView.f32800v3) {
            recordCircle.setAmplitude(f10 * 1800.0f);
        }
    }

    public final void g(long j3, long j10) {
        o0 o0Var = this.f1352s;
        if (o0Var == null) {
            return;
        }
        if (o0Var.L == 3) {
            o0Var.f1399b1 = SystemClock.uptimeMillis() + j3;
            o0Var.f1402c1 = Math.max(1L, j10);
            o0Var.invalidate();
        }
        org.telegram.messenger.g0.h3(new x(this, 6), j3 + j10 + 60);
    }

    public final void h() {
        org.telegram.messenger.g0.r(this.f1353s0);
        o0 o0Var = this.f1352s;
        if (o0Var != null) {
            o0Var.setStopIsland(false);
        }
        org.telegram.messenger.g0.r(this.f1354t0);
        org.telegram.messenger.g0.r(this.f1343k0);
        x xVar = this.f1355u0;
        org.telegram.messenger.g0.r(xVar);
        x xVar2 = this.f1356v0;
        org.telegram.messenger.g0.r(xVar2);
        o0 o0Var2 = this.f1352s;
        o0Var2.L0 = true;
        o0Var2.R = false;
        SystemClock.uptimeMillis();
        if (o0Var2.J0 == null) {
            Drawable mutate = o0Var2.getResources().getDrawable(2131231511).mutate();
            o0Var2.J0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        o0Var2.invalidate();
        if (!this.f1347o0) {
            e();
        }
        B(false);
        this.P = 0.0f;
        org.telegram.messenger.g0.h3(xVar, 30L);
        org.telegram.messenger.g0.h3(xVar2, 310L);
    }

    public final void i() {
        fh.g gVar;
        gh.a aVar;
        c6 c6Var;
        rf rfVar = this.f1337f;
        cu0 cu0Var = rfVar.f39289a.f32655c2;
        o0 o0Var = this.f1352s;
        Context context = this.h;
        if (o0Var == null) {
            o0 o0Var2 = new o0(context, this);
            this.f1352s = o0Var2;
            o0Var2.setBorderColorSource(new w(this, 0));
            this.f1352s.setVisibility(8);
        }
        if (this.f1352s.getParent() != cu0Var) {
            org.telegram.messenger.g0.E2(this.f1352s);
            cu0Var.addView(this.f1352s, na.e(-1, -1, 80));
        } else {
            this.f1352s.bringToFront();
        }
        o0 o0Var3 = this.f1352s;
        ChatActivityEnterView chatActivityEnterView = rfVar.f39289a;
        ge geVar = chatActivityEnterView.R0;
        pe peVar = chatActivityEnterView.f32636a1;
        o0Var3.f1397b = geVar;
        o0Var3.f1400c = peVar;
        o0Var3.setBubbleProvider(new cb.c(this, 4));
        if (this.f1357w == null) {
            this.f1357w = new i1(context, this.f1345n, this);
        }
        if (this.f1357w.getParent() != cu0Var) {
            org.telegram.messenger.g0.E2(this.f1357w);
            cu0Var.addView(this.f1357w, na.e(-1, -1, 80));
        } else {
            this.f1357w.bringToFront();
        }
        ChatActivityEnterView chatActivityEnterView2 = rfVar.f39289a;
        int i7 = ChatActivityEnterView.f32633s7;
        jh.f D0 = chatActivityEnterView2.D0();
        jh.f fVar = this.f1329a0;
        if (D0 != fVar) {
            c6 c6Var2 = null;
            if (fVar != null) {
                fVar.f17873f = null;
            }
            this.f1329a0 = D0;
            if (D0 != null) {
                c6Var = new c6(D0, 0L, 380L, new kr(0.22d, 0.61d, 0.36d, 1.0d));
            } else {
                c6Var = null;
            }
            this.Y = c6Var;
            if (D0 != null) {
                c6Var2 = new c6(D0, 1L, 300L, kr.f36859g);
            }
            this.f1335e = c6Var2;
        }
        jh.f fVar2 = this.f1329a0;
        if (fVar2 != null) {
            fVar2.f17873f = new w(this, 2);
            dh.c cVar = rfVar.f39289a.L1;
            if (cVar != null && (gVar = fVar2.f17874n) != null && (aVar = gVar.f11665w) != null) {
                fh.g c10 = cVar.c(this.f1357w, aVar, false);
                fh.g c11 = cVar.c(this.f1357w, this.f1329a0.f17874n.f11665w, false);
                i1 i1Var = this.f1357w;
                fh.g c12 = cVar.c(i1Var, this.f1329a0.f17874n.f11665w, false);
                i1Var.I = c10;
                i1Var.J = c11;
                i1Var.K = c12;
                c10.r(org.telegram.messenger.g0.L(18.0f));
                c11.r(org.telegram.messenger.g0.L(18.0f));
                c12.r(org.telegram.messenger.g0.L(18.0f));
                i1 i1Var2 = this.f1357w;
                i1Var2.setGearGlass(cVar.c(i1Var2, this.f1329a0.f17874n.f11665w, false));
                o0 o0Var4 = this.f1352s;
                if (o0Var4 != null) {
                    o0Var4.setStopGlass(cVar.c(o0Var4, new qb.a(2), false));
                }
            }
        }
        hf hfVar = rfVar.f39289a.F0;
        if (this.F == null) {
            b2 b2Var = new b2(hfVar);
            this.F = b2Var;
            b2Var.h = new w(this, 4);
            this.f1328a = new j1(hfVar);
            hfVar.addTextChangedListener(this.f1339g0);
        }
        if (this.H == null) {
            this.H = new d(rfVar.f39289a.R);
        }
        J();
    }

    public final void j() {
        rf rfVar = this.f1337f;
        hf hfVar = rfVar.f39289a.F0;
        if (hfVar != null) {
            hfVar.n1 = false;
        }
        w1 w1Var = this.G;
        if (w1Var != null) {
            w1Var.c();
        }
        this.G = null;
        d dVar = this.H;
        if (dVar != null) {
            dVar.b();
        }
        if (n()) {
            h();
        }
        i1 i1Var = this.f1357w;
        if (i1Var != null) {
            i1Var.a();
            this.f1357w.setIsland(false);
            this.f1357w.setRevert(false);
            this.f1357w.setSettings(false);
        }
        this.J = null;
        this.f1350r = 0;
        B(false);
        j1 j1Var = this.f1328a;
        if (j1Var != null) {
            j1Var.c();
        }
        ChatActivityEnterView chatActivityEnterView = rfVar.f39289a;
        chatActivityEnterView.G1 = 0L;
        chatActivityEnterView.H1 = null;
        o0 o0Var = this.f1352s;
        if (o0Var != null && o0Var.getRightMode() == 3) {
            this.f1352s.e();
        }
        b2 b2Var = this.F;
        if (b2Var != null) {
            b2Var.f(false);
        }
        A(false);
        C();
        rfVar.b();
    }

    public final boolean k(RectF rectF) {
        fh.g gVar;
        jh.f fVar = this.f1329a0;
        if (fVar == null || (gVar = fVar.f17874n) == null) {
            return false;
        }
        Rect rect = gVar.R.f11640m;
        if (rect.isEmpty()) {
            return false;
        }
        jh.f fVar2 = this.f1329a0;
        int[] iArr = this.E;
        fVar2.getLocationInWindow(iArr);
        rectF.set(rect);
        rectF.offset(iArr[0], iArr[1]);
        return true;
    }

    public final boolean l() {
        if (this.f1350r != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (this.f1347o0 && this.f1350r != 0) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        int i7 = this.f1350r;
        if (i7 == 1 || i7 == 2) {
            return true;
        }
        return false;
    }

    public final boolean p(float[] fArr) {
        hf hfVar = this.f1337f.f39289a.F0;
        if (this.f1329a0 == null || hfVar == null || hfVar.getLayout() == null) {
            return false;
        }
        jh.f fVar = this.f1329a0;
        int[] iArr = this.B0;
        fVar.getLocationInWindow(iArr);
        int[] iArr2 = this.C0;
        hfVar.getLocationInWindow(iArr2);
        fArr[0] = (hfVar.getTotalPaddingLeft() + (iArr2[0] - iArr[0])) - hfVar.getScrollX();
        fArr[1] = (hfVar.getTotalPaddingTop() + (iArr2[1] - iArr[1])) - hfVar.getScrollY();
        return true;
    }

    public final void q() {
        if (!n()) {
            return;
        }
        w1 w1Var = this.G;
        if (w1Var != null) {
            w1Var.c();
        }
        this.G = null;
        rf rfVar = this.f1337f;
        Editable text = rfVar.f39289a.F0.getText();
        if (text != null && this.I <= text.length()) {
            this.L = true;
            this.F.a();
            text.delete(this.I, text.length());
            this.L = false;
        }
        I();
        h();
        A(false);
        this.f1357w.setIsland(false);
        this.f1357w.setSettings(false);
        this.f1357w.setStopMode(false);
        C();
        this.f1350r = 0;
        rfVar.b();
    }

    @Override
    public final void r(String str) {
        M(-1, str);
    }

    public final void s() {
        if (this.f1350r == 1) {
            org.telegram.messenger.g0.r(this.f1353s0);
            this.f1350r = 2;
            this.f1352s.setStopIsland(false);
            this.f1352s.setRightMode(1);
            this.f1352s.setCancelShown(false);
            w1 w1Var = this.G;
            if (w1Var != null) {
                w1Var.m();
            }
        }
    }

    public final void u(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l0.u(java.lang.String):void");
    }

    public final int v() {
        Editable text = this.f1337f.f39289a.F0.getText();
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

    public final String x() {
        Editable text = this.f1337f.f39289a.F0.getText();
        if (text == null) {
            return "";
        }
        return text.subSequence(Math.min(this.I, text.length()), text.length()).toString();
    }

    public final void y(String str) {
        w1 w1Var;
        DictationAsr.a0(str);
        DictationAsr.v(DictationAsr.M(str));
        this.f1357w.setLanguage(F(str));
        if (this.f1350r == 1 && (w1Var = this.G) != null) {
            w1Var.j(str);
        }
    }

    public final void z() {
        Log.d("Dictation", "send from listening (" + v() + " chars)");
        w1 w1Var = this.G;
        if (w1Var != null) {
            w1Var.c();
        }
        this.G = null;
        org.telegram.messenger.g0.r(this.f1353s0);
        this.F.a();
        this.f1352s.setStopIsland(false);
        rf rfVar = this.f1337f;
        rfVar.f39289a.N1(null, true);
        B(false);
        this.P = 0.0f;
        this.f1357w.setIsland(false);
        this.f1357w.setSettings(false);
        this.f1357w.setStopMode(false);
        C();
        A(false);
        this.f1350r = 0;
        this.f1331b0 = 0.0f;
        ValueAnimator valueAnimator = this.f1333c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        rfVar.d(0.0f);
        this.f1352s.e();
        rfVar.b();
        rfVar.f39289a.w1();
    }
}
