package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.os.SystemClock;
import android.text.Layout;
import android.text.TextUtils;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import j$.util.Comparator$CC;
import j$.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Wallet.c;
public final class wsc extends View {
    public static final int J1 = 0;
    public float A0;
    public final es1 A1;
    public float B0;
    public final msc B1;
    public float C0;
    public final msc C1;
    public float D0;
    public long D1;
    public final Paint E;
    public float E0;
    public boolean E1;
    public final RectF F;
    public float F0;
    public final rsc F1;
    public final Paint G;
    public float G0;
    public final RectF G1;
    public final Paint H;
    public float H0;
    public final Paint H1;
    public final RectF I;
    public float I0;
    public final Rect I1;
    public final Path J;
    public float J0;
    public final float[] K;
    public float K0;
    public final int[] L;
    public byte L0;
    public final qsc M;
    public boolean M0;
    public final psc N;
    public long N0;
    public final usc O;
    public long O0;
    public final usc P;
    public VelocityTracker P0;
    public final usc Q;
    public String Q0;
    public final usc R;
    public String R0;
    public final usc S;
    public long S0;
    public final ArrayList T;
    public vsc T0;
    public final Path U;
    public vsc U0;
    public final Paint V;
    public float V0;
    public final LinearGradient W;
    public float W0;
    public float X0;
    public boolean Y0;
    public float Z0;
    public final e a;
    public final Matrix a0;
    public float a1;
    public final boolean b;
    public float b0;
    public boolean b1;
    public final frc c;
    public float c0;
    public TL_wallet.card c1;
    public final k7b d;
    public final usc d0;
    public String d1;
    public final SharedPreferences e;
    public final Paint e0;
    public boolean e1;
    public final LinkedHashMap f;
    public final b29 f0;
    public boolean f1;
    public boolean g0;
    public int g1;
    public final ArrayList h;
    public vsc h0;
    public final msc h1;
    public vsc i0;
    public boolean i1;
    public boolean j0;
    public boolean j1;
    public final Paint k0;
    public boolean k1;
    public final Paint l0;
    public vsc l1;
    public final Paint m0;
    public ksc m1;
    public final ArrayList n;
    public boolean n0;
    public float[] n1;
    public boolean o0;
    public float o1;
    public boolean p0;
    public final float[] p1;
    public boolean q0;
    public final usc q1;
    public final Matrix r;
    public boolean r0;
    public final usc r1;
    public final Matrix s;
    public boolean s0;
    public final Paint s1;
    public boolean t0;
    public final Paint t1;
    public boolean u0;
    public final Matrix u1;
    public boolean v0;
    public final Path v1;
    public final Matrix w;
    public int w0;
    public final RectF w1;
    public final Matrix x;
    public float x0;
    public kg5 x1;
    public final Paint y;
    public float y0;
    public kg5 y1;
    public float z0;
    public final cd z1;

    public wsc(e eVar, frc frcVar, k7b k7bVar, TL_wallet.card cardVar) {
        super(eVar.getContext());
        SharedPreferences sharedPreferences;
        this.f = new LinkedHashMap();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new Matrix();
        this.s = new Matrix();
        this.w = new Matrix();
        this.x = new Matrix();
        this.y = new Paint(3);
        this.E = new Paint(3);
        this.F = new RectF();
        Paint paint = new Paint(1);
        this.G = paint;
        Paint paint2 = new Paint(1);
        this.H = paint2;
        this.I = new RectF();
        this.J = new Path();
        this.K = new float[450];
        this.L = new int[225];
        this.O = new usc(0.0f, 260.0f, 0.78f);
        this.P = new usc(0.0f, 420.0f, 0.72f);
        this.Q = new usc(1.0f, 420.0f, 0.38f);
        this.R = new usc(0.0f, 170.0f, 0.42f);
        this.S = new usc(0.0f, 170.0f, 0.42f);
        this.T = new ArrayList();
        this.U = new Path();
        Paint paint3 = new Paint(1);
        this.V = paint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, 16777215, 352321535, 16777215, 16777215}, new float[]{0.0f, 0.36f, 0.5f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.W = linearGradient;
        this.a0 = new Matrix();
        this.d0 = new usc(0.0f, 120.0f, 1.0f);
        this.e0 = new Paint(1);
        this.k0 = new Paint(1);
        this.l0 = new Paint(1);
        this.m0 = new Paint(1);
        this.V0 = 1.0f;
        this.W0 = 0.5f;
        this.X0 = 0.5f;
        this.h1 = new msc(this, (byte) 1);
        this.p1 = new float[3];
        this.q1 = new usc(0.0f, 260.0f, 1.0f);
        this.r1 = new usc(0.0f, 220.0f, 1.0f);
        Paint paint4 = new Paint(1);
        this.s1 = paint4;
        Paint paint5 = new Paint(1);
        this.t1 = paint5;
        this.u1 = new Matrix();
        this.v1 = new Path();
        this.w1 = new RectF();
        this.z1 = new cd(this, (byte) 3);
        this.A1 = new es1(this, (byte) 9);
        this.B1 = new msc(this, (byte) 2);
        this.C1 = new msc(this, (byte) 3);
        this.F1 = new rsc(this);
        this.G1 = new RectF();
        Paint paint6 = new Paint(1);
        this.H1 = paint6;
        paint6.setColor(-16777216);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.I1 = new Rect();
        this.a = eVar;
        boolean z = cardVar != null;
        this.b = z;
        b29 b29Var = new b29(2131624353, hl.L(42.0f), hl.L(42.0f), true, null);
        this.f0 = b29Var;
        b29Var.M(this);
        this.c = frcVar;
        this.d = k7bVar;
        paint3.setShader(linearGradient);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        if (z) {
            sharedPreferences = null;
        } else {
            sharedPreferences = getContext().getSharedPreferences("wallet_card_stickers_" + eVar.getCurrentAccount() + "_" + c.C(eVar.getCurrentAccount()).x(), 0);
        }
        this.e = sharedPreferences;
        this.Q0 = z ? null : sharedPreferences.getString("style", null);
        this.i1 = (z || uc7.e1().getBoolean("walletcardstickerhint", false)) ? false : true;
        Paint.Style style = Paint.Style.STROKE;
        paint4.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint4.setStrokeCap(cap);
        paint4.setStrokeJoin(Paint.Join.ROUND);
        paint5.setColor(-1);
        setImportantForAccessibility(2);
        setTranslationZ(hl.L(24.0f));
        paint.setStyle(style);
        paint.setStrokeCap(cap);
        paint2.setTypeface(hl.o());
        psc pscVar = new psc(this, getContext());
        this.N = pscVar;
        qsc qscVar = new qsc(this, getContext());
        this.M = qscVar;
        pscVar.setTag(zqc.o0);
        frcVar.getFrontFace().addView(pscVar, 0, tre.c(-1.0f, -1));
        frcVar.getFrontFace().addView(qscVar, frcVar.getStickerLayerIndex(), tre.c(-1.0f, -1));
        if (z) {
            qscVar.addOnLayoutChangeListener(new pk1(this, (byte) 8));
            d(cardVar);
            return;
        }
        int currentAccount = eVar.getCurrentAccount();
        uc7 s1 = uc7.s1(currentAccount);
        long e = yac.h(currentAccount).e();
        TLRPC.UserFull Y1 = s1.Y1(e);
        if (Y1 != null) {
            this.D1 = SystemClock.elapsedRealtime();
            TL_wallet.card cardVar2 = Y1.wallet_card;
            d(cardVar2 == null ? new TL_wallet.card() : cardVar2);
            return;
        }
        s1.f3(s1.X1(Long.valueOf(e)), 0, true, new sh9(this, (byte) 27));
    }

    public static boolean F(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf(45);
            Set set = uc7.s1(i).k4.y0.f;
            if (set != null) {
                if (lastIndexOf > 0) {
                    str = str.substring(0, lastIndexOf);
                }
                if (set.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Path H(vsc vscVar) {
        Bitmap bitmap;
        int i;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        if (vscVar != null && vscVar.F == null && (bitmap = vscVar.u) != null) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 128, 128, true);
            int[] iArr = new int[16384];
            createScaledBitmap.getPixels(iArr, 0, 128, 0, 0, 128, 128);
            if (createScaledBitmap != vscVar.u) {
                createScaledBitmap.recycle();
            }
            boolean[] zArr = new boolean[16384];
            int i4 = -1;
            for (int i5 = 0; i5 < 16384; i5++) {
                if ((iArr[i5] >>> 24) >= 110) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zArr[i5] = z2;
                if (i4 < 0 && z2) {
                    i4 = i5;
                }
            }
            if (i4 >= 0) {
                int i6 = 8;
                int[] iArr2 = {-1, -1, 0, 1, 1, 1, 0, -1};
                int[] iArr3 = {0, -1, -1, -1, 0, 1, 1, 1};
                int i7 = i4 % 128;
                int i8 = i4 / 128;
                int i9 = i7 - 1;
                float[] fArr = new float[512];
                int i10 = i8;
                int i11 = i10;
                int i12 = i7;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i13 < 20000) {
                        int i15 = i14 << 1;
                        i = 0;
                        if (i15 + 2 > fArr.length) {
                            fArr = Arrays.copyOf(fArr, fArr.length << 1);
                        }
                        fArr[i15] = i12 + 0.5f;
                        fArr[i15 + 1] = i10 + 0.5f;
                        i14++;
                        int i16 = 0;
                        while (i16 < i6 && (iArr2[i16] != i9 - i12 || iArr3[i16] != i11 - i10)) {
                            i16++;
                        }
                        int i17 = 1;
                        while (true) {
                            if (i17 <= i6) {
                                int i18 = (i16 + i17) % i6;
                                i2 = i6;
                                int i19 = i12 + iArr2[i18];
                                int i20 = i16;
                                int i21 = i10 + iArr3[i18];
                                if (i19 >= 0 && i21 >= 0) {
                                    i3 = i17;
                                    if (i19 < 128 && i21 < 128 && zArr[(i21 << 7) + i19]) {
                                        int i22 = (i18 + 7) % 8;
                                        i11 = i10 + iArr3[i22];
                                        i10 = i21;
                                        i9 = i12 + iArr2[i22];
                                        i12 = i19;
                                        z = true;
                                        break;
                                    }
                                } else {
                                    i3 = i17;
                                }
                                i17 = i3 + 1;
                                i6 = i2;
                                i16 = i20;
                            } else {
                                i2 = i6;
                                z = false;
                                break;
                            }
                        }
                        if (!z || (i12 == i7 && i10 == i8)) {
                            break;
                        }
                        i13++;
                        i6 = i2;
                    } else {
                        i = 0;
                        break;
                    }
                }
                int i23 = (i14 + 1) / 2;
                if (i23 >= 3) {
                    float[] fArr2 = new float[i23 << 1];
                    for (int i24 = i; i24 < i14; i24 += 2) {
                        float f = 0.0f;
                        float f2 = 0.0f;
                        for (int i25 = -3; i25 <= 3; i25++) {
                            int i26 = ((((i24 + i25) % i14) + i14) % i14) << 1;
                            f += fArr[i26];
                            f2 += fArr[i26 + 1];
                        }
                        fArr2[i24] = ((f / 7.0f) / 128.0f) - 0.5f;
                        fArr2[i24 + 1] = ((f2 / 7.0f) / 128.0f) - 0.5f;
                    }
                    Path path = new Path();
                    path.moveTo((fArr2[i] + fArr2[2]) / 2.0f, (fArr2[1] + fArr2[3]) / 2.0f);
                    int i27 = 1;
                    while (i27 <= i23) {
                        int i28 = i27 % i23;
                        i27++;
                        int i29 = i28 << 1;
                        float f3 = fArr2[i29];
                        float f4 = fArr2[i29 + 1];
                        int i30 = (i27 % i23) << 1;
                        path.quadTo(f3, f4, (fArr2[i30] + f3) / 2.0f, (fArr2[i30 + 1] + f4) / 2.0f);
                    }
                    path.close();
                    vscVar.F = path;
                    return path;
                }
                return null;
            }
            return null;
        } else if (vscVar == null) {
            return null;
        } else {
            return vscVar.F;
        }
    }

    public static void J(kg5 kg5Var, float f, float f2) {
        o(kg5Var, 3);
        kg5Var.o(0.0f, f - kg5Var.getPaddingLeft());
        kg5Var.setTranslationY(f2 - kg5Var.getLayoutParams().height);
        kg5Var.invalidate();
    }

    public static double N(float f) {
        return Math.round(f * 100.0f) / 100.0d;
    }

    public static String T(TL_wallet.card cardVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        ArrayList<TL_wallet.cardSticker> arrayList = cardVar.stickers;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TL_wallet.cardSticker cardsticker = arrayList.get(i);
                i++;
                TL_wallet.cardSticker cardsticker2 = cardsticker;
                TL_wallet.nftItem nftitem = cardsticker2.nft;
                if (nftitem != null) {
                    sb.append(nftitem.address);
                    sb.append(':');
                    sb.append(y(cardsticker2.coordinates));
                    sb.append(';');
                }
            }
        }
        sb.append("bg:");
        TL_wallet.nftItem nftitem2 = cardVar.bg_nft_item;
        if (nftitem2 == null) {
            str = null;
        } else {
            str = nftitem2.address;
        }
        sb.append(str);
        return sb.toString();
    }

    public static boolean b(vsc vscVar) {
        TL_wallet.nftItem nftitem;
        if (vscVar != null && (nftitem = vscVar.b) != null && nftitem.gift != null) {
            return true;
        }
        return false;
    }

    public static float c(float f) {
        float f2 = f % 360.0f;
        if (f2 > 180.0f) {
            f2 -= 360.0f;
        }
        if (f2 < -180.0f) {
            return f2 + 360.0f;
        }
        return f2;
    }

    public static void e0(int i, TL_wallet.card cardVar) {
        TLRPC.UserFull Y1 = uc7.s1(i).Y1(yac.h(i).e());
        if (Y1 == null) {
            return;
        }
        Y1.wallet_card = cardVar;
        jf7.Y(i).g2(Y1, false);
    }

    public static float n(RectF rectF, RectF rectF2) {
        float min = Math.min(rectF.right, rectF2.right) - Math.max(rectF.left, rectF2.left);
        float min2 = Math.min(rectF.bottom, rectF2.bottom) - Math.max(rectF.top, rectF2.top);
        if (min <= 0.0f || min2 <= 0.0f || rectF2.width() <= 0.0f || rectF2.height() <= 0.0f) {
            return 0.0f;
        }
        return Utilities.l(((min * min2) / (rectF2.height() * rectF2.width())) * 4.0f);
    }

    public static void o(kg5 kg5Var, int i) {
        if ((kg5Var.getTag() instanceof Integer) && ((Integer) kg5Var.getTag()).intValue() == i) {
            return;
        }
        kg5Var.setTag(Integer.valueOf(i));
        kg5Var.a = i;
        kg5Var.o(1.0f, 0.0f);
    }

    public static float u(float f, float f2, float f3) {
        float l = Utilities.l((f - f2) / (f3 - f2));
        return xnb.B(l, 2.0f, 3.0f, l * l);
    }

    public static String y(TL_stories.MediaAreaCoordinates mediaAreaCoordinates) {
        if (mediaAreaCoordinates == null) {
            return "";
        }
        return String.format(Locale.US, "%.2f,%.2f,%.2f,%.2f", Double.valueOf(mediaAreaCoordinates.x), Double.valueOf(mediaAreaCoordinates.y), Double.valueOf(mediaAreaCoordinates.w), Double.valueOf(mediaAreaCoordinates.rotation % 360.0d));
    }

    public final boolean A() {
        frc frcVar = this.c;
        this.Z0 = frcVar.getFrontFace().getWidth();
        float height = frcVar.getFrontFace().getHeight();
        this.a1 = height;
        if (this.Z0 > 0.0f && height > 0.0f) {
            Matrix matrix = this.r;
            if (frcVar.g(this, matrix) && matrix.invert(this.s)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final kg5 B(int i, boolean z) {
        float f;
        kg5 kg5Var = new kg5(getContext(), 3);
        kg5Var.p(true);
        if (z) {
            f = 15.0f;
        } else {
            f = 11.0f;
        }
        kg5Var.m(11.0f, 6.0f, f, 7.0f);
        kg5Var.j(z);
        kg5Var.L = Layout.Alignment.ALIGN_NORMAL;
        kg5Var.q(12.0f);
        kg5Var.d = -1L;
        String M0 = ob6.M0(i, null);
        kg5Var.h = kg5.a(M0, kg5Var.getTextPaint());
        kg5Var.t(M0);
        kg5Var.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        kg5Var.setTranslationZ(getTranslationZ() + 1.0f);
        ((ViewGroup) getParent()).addView(kg5Var, tre.e(-1, 150, 48));
        return kg5Var;
    }

    public final boolean C() {
        Path H;
        if (this.n1 == null) {
            H = null;
        } else {
            H = H(this.l1);
        }
        if (H == null) {
            return false;
        }
        float U = U() * this.n1[2];
        Matrix matrix = this.u1;
        matrix.setScale(U, U);
        float[] fArr = this.n1;
        matrix.postTranslate(fArr[0], fArr[1]);
        H.transform(matrix, this.v1);
        return true;
    }

    public final float[] D(float f) {
        float[] fArr = this.p1;
        fArr[0] = (u(f, 0.45f, 0.82f) - u(f, 1.3f, 1.72f)) * 0.9f;
        fArr[1] = (((float) Math.sin(Utilities.l((f - 0.92f) / 0.26f) * 3.141592653589793d)) * 0.035f) + (u(f, 0.6f, 0.92f) - u(f, 1.18f, 1.46f));
        fArr[2] = u(f, 1.58f, 1.7f) - u(f, 1.7f, 1.92f);
        return fArr;
    }

    public final void E(vsc vscVar) {
        float f;
        float f2;
        float f3;
        float f4;
        vscVar.J = 0L;
        usc uscVar = vscVar.h;
        usc uscVar2 = vscVar.f;
        usc uscVar3 = vscVar.e;
        if (vscVar.a.equals(this.Q0)) {
            l();
        }
        if (vscVar.b()) {
            float[] L = L(uscVar3.a, uscVar2.a);
            uscVar3.a(L[0]);
            uscVar2.a(L[1]);
        }
        vscVar.H = (byte) 4;
        vscVar.W = 0.0f;
        vscVar.X = uscVar3.a;
        vscVar.Y = uscVar2.a;
        vscVar.Z = vscVar.g.a * uscVar.a;
        vscVar.a0 = vscVar.i.a;
        if (this.x0 > hl.L(650.0f)) {
            f = 0.32f;
        } else {
            f = 0.44f;
        }
        vscVar.b0 = f;
        this.x0 = 0.0f;
        ksc j = j(vscVar);
        if (j != null) {
            j.animate().cancel();
            j.o();
            f2 = j.getScaleX();
        } else {
            f2 = 1.0f;
        }
        vscVar.c0 = f2;
        RectF Z = Z(vscVar);
        if (Z != null) {
            float centerX = Z.centerX() - vscVar.X;
            float centerY = Z.centerY() - vscVar.Y;
            float hypot = (float) Math.hypot(centerX, centerY);
            if (hypot > hl.L(6.0f)) {
                f3 = centerX / hypot;
            } else {
                f3 = 0.0f;
            }
            vscVar.U = f3;
            if (hypot > hl.L(6.0f)) {
                f4 = centerY / hypot;
            } else {
                f4 = 1.0f;
            }
            vscVar.V = f4;
        }
        vscVar.l.a(0.0f);
        uscVar.a(1.0f);
        long j2 = this.O0 + 1;
        this.O0 = j2;
        vscVar.I = j2;
        O();
        f0();
    }

    public final ArrayList G() {
        ArrayList arrayList = new ArrayList(this.f.values());
        List.EL.sort(arrayList, Comparator$CC.comparingLong(new fh((byte) 5)));
        return arrayList;
    }

    public final void I(vsc vscVar, float[] fArr, float[] fArr2, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        long j = vscVar.J;
        usc uscVar = vscVar.o;
        usc uscVar2 = vscVar.n;
        if (j == 0) {
            long j2 = this.S0 + 1;
            this.S0 = j2;
            vscVar.J = j2;
            ArrayList arrayList = new ArrayList();
            for (vsc vscVar2 : this.f.values()) {
                if (vscVar2 != vscVar && vscVar2.b()) {
                    arrayList.add(vscVar2);
                }
            }
            if (arrayList.size() >= 10) {
                List.EL.sort(arrayList, Comparator$CC.comparingLong(new fh((byte) 6)));
                for (int i = 0; i <= arrayList.size() - 10; i++) {
                    vsc vscVar3 = (vsc) arrayList.get(i);
                    if (this.d.o()) {
                        E(vscVar3);
                    } else {
                        V(vscVar3);
                    }
                }
                k();
            }
        }
        vscVar.H = (byte) 1;
        vscVar.Q = false;
        vscVar.M = false;
        vscVar.L = false;
        vscVar.P = z;
        vscVar.O = z;
        long j3 = this.O0 + 1;
        this.O0 = j3;
        vscVar.I = j3;
        uscVar2.a(0.0f);
        uscVar.a(0.0f);
        usc uscVar3 = vscVar.e;
        float f5 = 500.0f;
        float f6 = 0.82f;
        float f7 = 150.0f;
        float f8 = 1.0f;
        if (z) {
            f2 = 0.82f;
            f = 150.0f;
        } else {
            f = 500.0f;
            f2 = 1.0f;
        }
        uscVar3.d = f;
        uscVar3.e = f2;
        uscVar3.a(fArr[0]);
        uscVar3.b = fArr2[0];
        usc uscVar4 = vscVar.f;
        if (z) {
            f5 = 150.0f;
        } else {
            f6 = 1.0f;
        }
        uscVar4.d = f5;
        uscVar4.e = f6;
        uscVar4.a(fArr[1]);
        float f9 = fArr2[1];
        uscVar4.b = f9;
        vscVar.h.b = fArr2[2];
        usc uscVar5 = vscVar.g;
        uscVar5.d = 300.0f;
        uscVar5.e = 0.5f;
        uscVar5.b = 1.0f;
        usc uscVar6 = vscVar.j;
        if (z) {
            f7 = 110.0f;
        }
        uscVar6.d = f7;
        uscVar6.e = 0.9f;
        uscVar6.b = 0.0f;
        vscVar.m.b = 1.0f;
        vscVar.l.b = 0.0f;
        float f10 = fArr2[0] - fArr[0];
        float f11 = f9 - fArr[1];
        float max = Math.max(1.0f, (float) Math.hypot(f10, f11));
        if (max > hl.L(6.0f)) {
            f3 = f10 / max;
        } else {
            f3 = 0.0f;
        }
        vscVar.U = f3;
        if (max > hl.L(6.0f)) {
            f4 = f11 / max;
        } else {
            f4 = 1.0f;
        }
        vscVar.V = f4;
        usc uscVar7 = vscVar.k;
        uscVar7.a(0.9f);
        uscVar7.b = 0.0f;
        if (z) {
            float min = Math.min(hl.L(110.0f), 0.32f * max);
            if (f10 >= 0.0f) {
                f8 = -1.0f;
            }
            uscVar2.a(0.0f);
            uscVar2.c = ((-f11) / max) * min * f8 * 20.0f;
            uscVar.a(0.0f);
            uscVar.c = xnb.B(min, 0.5f, (f10 / max) * min * f8, 20.0f);
        }
        O();
        f0();
    }

    public final void K(vsc vscVar, TL_stories.MediaAreaCoordinates mediaAreaCoordinates, boolean z) {
        vscVar.h.a((float) (mediaAreaCoordinates.w / 23.100000381469727d));
        vscVar.i.a(c((float) mediaAreaCoordinates.rotation));
        vscVar.N = z;
        vscVar.e.a((((float) mediaAreaCoordinates.x) / 100.0f) * this.Z0);
        vscVar.f.a((((float) mediaAreaCoordinates.y) / 100.0f) * this.a1);
        vscVar.g.a(1.0f);
        vscVar.j.a(0.0f);
        vscVar.k.a(0.0f);
        vscVar.n.a(0.0f);
        vscVar.o.a(0.0f);
        vscVar.l.a(0.0f);
        vscVar.H = (byte) 2;
        long j = this.O0 + 1;
        this.O0 = j;
        vscVar.I = j;
        vscVar.m.a(1.0f);
        if (vscVar.J == 0) {
            long j2 = this.S0 + 1;
            this.S0 = j2;
            vscVar.J = j2;
        }
        if (vscVar.a.equals(this.Q0)) {
            this.U0 = vscVar;
            this.T0 = vscVar;
            this.V0 = 1.0f;
            e();
        }
    }

    public final float[] L(float f, float f2) {
        float[] fArr = {f, f2};
        this.r.mapPoints(fArr);
        return fArr;
    }

    public final void M(vsc vscVar, float f, float f2) {
        float A;
        usc uscVar = vscVar.e;
        usc uscVar2 = vscVar.h;
        float[] L = L(uscVar.a, vscVar.f.a);
        boolean z = false;
        float t = Utilities.t(f, f2, L[0], L[1]);
        if (Float.isNaN(this.F0)) {
            this.F0 = t;
            this.G0 = uscVar2.b;
        }
        if (Math.abs(t - this.F0) > hl.L(5.0f)) {
            usc uscVar3 = vscVar.q;
            uscVar3.d = 700.0f;
            uscVar3.e = 1.0f;
            uscVar3.b = 1.0f;
        }
        float L2 = hl.L(32.0f) / U();
        boolean z2 = this.j0;
        float f3 = this.G0;
        float f4 = this.F0;
        if (z2) {
            A = (f3 * t) / Math.max(1.0f, f4);
        } else {
            A = qd4.A(1.21f, L2, (t - f4) / hl.L(110.0f), f3);
        }
        uscVar2.d = 900.0f;
        uscVar2.e = 1.0f;
        uscVar2.b = Math.max(L2, Math.min(1.21f, A));
        if (t < hl.L(14.0f)) {
            this.C0 = Float.NaN;
            return;
        }
        float degrees = (float) Math.toDegrees(Math.atan2(f2 - L[1], f - L[0]));
        if (!Float.isNaN(this.C0)) {
            this.D0 = c(degrees - this.C0) + this.D0;
        }
        this.C0 = degrees;
        float f5 = this.E0 + this.D0;
        float round = Math.round(f5 / 90.0f) * 90;
        if (Math.abs(f5 - round) < 5.0f) {
            z = true;
        }
        if (z && !this.M0) {
            performHapticFeedback(4);
        }
        this.M0 = z;
        usc uscVar4 = vscVar.i;
        uscVar4.d = 900.0f;
        uscVar4.e = 0.95f;
        if (z) {
            f5 = round;
        }
        uscVar4.b = f5;
    }

    public final void O() {
        if (!this.b && this.Z0 > 0.0f && this.a1 > 0.0f) {
            SharedPreferences.Editor edit = this.e.edit();
            for (vsc vscVar : this.f.values()) {
                boolean b = vscVar.b();
                String str = vscVar.a;
                if (b) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", vscVar.e.b / this.Z0);
                        jSONObject.put("y", vscVar.f.b / this.a1);
                        jSONObject.put("r", vscVar.i.b);
                        jSONObject.put("s", vscVar.h.b);
                        jSONObject.put("q", vscVar.N);
                        edit.putString(str, jSONObject.toString());
                    } catch (Exception unused) {
                    }
                } else {
                    edit.remove(str);
                }
            }
            String str2 = this.Q0;
            if (str2 == null) {
                edit.remove("style");
            } else {
                edit.putString("style", str2);
            }
            edit.apply();
        }
    }

    public final float P(vsc vscVar) {
        return (((1.0f - (vscVar.q.a * 0.9f)) * vscVar.l.a * 0.04f) + 1.0f) * U() * vscVar.g.a * vscVar.h.a;
    }

    public final void Q() {
        if (!this.e1 || this.g1 != 0) {
            return;
        }
        if (!this.b1 && (this.q0 || !A())) {
            hl.d3(this.h1, 1000L);
            return;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList G = G();
        int size = G.size();
        String str = null;
        int i = 0;
        while (i < size) {
            Object obj = G.get(i);
            i++;
            vsc vscVar = (vsc) obj;
            boolean b = vscVar.b();
            String str2 = vscVar.a;
            if (b) {
                sb.append(str2);
                sb.append(':');
                sb.append(y(a0(vscVar)));
                sb.append(';');
                if (str2.equals(this.Q0) && m(vscVar)) {
                    str = str2;
                }
            }
        }
        if (c00.k(sb, "bg:", str).equals(this.d1)) {
            this.e1 = false;
            return;
        }
        TL_wallet.setCardStickers setcardstickers = new TL_wallet.setCardStickers();
        ArrayList G2 = G();
        int size2 = G2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = G2.get(i2);
            i2++;
            vsc vscVar2 = (vsc) obj2;
            boolean b2 = vscVar2.b();
            String str3 = vscVar2.a;
            if (b2) {
                TL_wallet.inputWalletCardSticker inputwalletcardsticker = new TL_wallet.inputWalletCardSticker();
                inputwalletcardsticker.nft_address = str3;
                inputwalletcardsticker.coordinates = a0(vscVar2);
                setcardstickers.stickers.add(inputwalletcardsticker);
                if (str3.equals(this.Q0) && m(vscVar2)) {
                    setcardstickers.bg_nft_address = str3;
                }
            }
        }
        this.e1 = false;
        int currentAccount = this.a.getCurrentAccount();
        TL_wallet.card cardVar = this.c1;
        TL_wallet.card cardVar2 = new TL_wallet.card();
        TL_wallet.card cardVar3 = this.c1;
        if (cardVar3 != null) {
            cardVar2.address = cardVar3.address;
            cardVar2.balance = cardVar3.balance;
        }
        ArrayList<TL_wallet.inputWalletCardSticker> arrayList = setcardstickers.stickers;
        int size3 = arrayList.size();
        int i3 = 0;
        while (i3 < size3) {
            TL_wallet.inputWalletCardSticker inputwalletcardsticker2 = arrayList.get(i3);
            i3++;
            TL_wallet.inputWalletCardSticker inputwalletcardsticker3 = inputwalletcardsticker2;
            vsc vscVar3 = (vsc) this.f.get(inputwalletcardsticker3.nft_address);
            if (vscVar3 != null && vscVar3.b != null) {
                TL_wallet.cardSticker cardsticker = new TL_wallet.cardSticker();
                cardsticker.nft = vscVar3.b;
                cardsticker.coordinates = inputwalletcardsticker3.coordinates;
                cardVar2.stickers.add(cardsticker);
                if (inputwalletcardsticker3.nft_address.equals(setcardstickers.bg_nft_address)) {
                    cardVar2.bg_nft_item = vscVar3.b;
                }
            }
        }
        e0(currentAccount, cardVar2);
        this.g1 = ConnectionsManager.getInstance(currentAccount).sendRequestTyped(setcardstickers, new ic((byte) 0), new pn1(this, currentAccount, cardVar, (byte) 5));
    }

    public final TL_wallet.cardSticker R(String str) {
        ArrayList<TL_wallet.cardSticker> arrayList;
        TL_wallet.card cardVar = this.c1;
        if (cardVar != null && (arrayList = cardVar.stickers) != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TL_wallet.cardSticker cardsticker = arrayList.get(i);
                i++;
                TL_wallet.cardSticker cardsticker2 = cardsticker;
                TL_wallet.nftItem nftitem = cardsticker2.nft;
                if (nftitem != null && str.equals(nftitem.address)) {
                    return cardsticker2;
                }
            }
        }
        return null;
    }

    public final void S(ksc kscVar) {
        int i;
        int i2;
        removeCallbacks(this.B1);
        this.t0 = true;
        this.q0 = false;
        getParent().requestDisallowInterceptTouchEvent(false);
        VelocityTracker velocityTracker = this.P0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.P0 = null;
        }
        kscVar.animate().cancel();
        kscVar.n(kscVar.getScaleX() * kscVar.z0);
        kscVar.setScaleX(1.0f);
        kscVar.setScaleY(1.0f);
        kscVar.m(1.0f, 150L, null);
        final vsc v = v(kscVar.x0);
        String str = v.a;
        if (!b(v) && !v.b()) {
            this.t0 = false;
            return;
        }
        fu5 J = fu5.J(this.a, kscVar);
        J.s = (short) 51;
        if (m(v) || str.equals(this.Q0)) {
            if (str.equals(this.Q0)) {
                i = 2131742753;
            } else {
                i = 2131742759;
            }
            J.b(2131232102, ob6.M0(i, null), new Runnable(this) {
                public final wsc b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    vsc vscVar = v;
                    wsc wscVar = this.b;
                    switch (b) {
                        case 0:
                            wscVar.c0(vscVar);
                            return;
                        default:
                            wscVar.b0(vscVar.b);
                            return;
                    }
                }
            }, false);
        }
        if (v.b()) {
            i2 = 2131742752;
        } else {
            i2 = 2131742760;
        }
        J.b(2131232387, ob6.M0(i2, null), new Runnable(this) {
            public final wsc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                vsc vscVar = v;
                wsc wscVar = this.b;
                switch (b) {
                    case 0:
                        wscVar.c0(vscVar);
                        return;
                    default:
                        wscVar.b0(vscVar.b);
                        return;
                }
            }
        }, false);
        J.p = new msc(this, (byte) 0);
        J.a0();
        performHapticFeedback(0);
    }

    public final float U() {
        return this.Z0 * 0.231f;
    }

    public final void V(vsc vscVar) {
        if (vscVar.a.equals(this.Q0)) {
            l();
        }
        vscVar.N = false;
        g(vscVar);
        ksc j = j(vscVar);
        if (j != null) {
            j.setScaleX(0.93f);
            j.setScaleY(0.93f);
            j.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
        }
        performHapticFeedback(3);
        O();
        f0();
    }

    public final void W(vsc vscVar, float f, float f2) {
        boolean z;
        float[] fArr;
        boolean z2;
        this.i0 = null;
        this.n0 = true;
        if (this.L0 == 2) {
            z = true;
        } else {
            z = false;
        }
        this.p0 = z;
        if (this.i1) {
            if (vscVar == this.l1 && !z) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.j1 = z2;
            this.k1 = false;
            this.i1 = false;
            uc7.e1().edit().putBoolean("walletcardstickerhint", true).apply();
        }
        boolean z3 = vscVar.N;
        usc uscVar = vscVar.m;
        usc uscVar2 = vscVar.f;
        usc uscVar3 = vscVar.e;
        float f3 = 1.0f;
        if (z3) {
            vscVar.N = false;
            usc uscVar4 = vscVar.h;
            uscVar4.d = 420.0f;
            uscVar4.e = 0.8f;
            uscVar4.b = 1.0f;
        }
        ksc j = j(vscVar);
        if (j != null) {
            j.animate().scaleX(1.0f).scaleY(1.0f).setDuration(220L).start();
        }
        this.u0 = false;
        if (this.p0) {
            fArr = L(uscVar3.a, uscVar2.a);
        } else {
            RectF Z = Z(vscVar);
            if (Z == null) {
                return;
            }
            float[] fArr2 = {Z.centerX(), Z.centerY()};
            usc uscVar5 = vscVar.g;
            uscVar5.d = 500.0f;
            uscVar5.e = 0.75f;
            uscVar5.a((f(vscVar) * Z.width()) / U());
            uscVar.a(0.0f);
            ((uqc) this.d.c).R0(0L);
            fArr = fArr2;
        }
        uscVar3.d = 1100.0f;
        uscVar3.e = 0.9f;
        uscVar3.a(fArr[0]);
        uscVar2.d = 1100.0f;
        uscVar2.e = 0.9f;
        uscVar2.a(fArr[1]);
        vscVar.H = (byte) 3;
        long j2 = this.O0 + 1;
        this.O0 = j2;
        vscVar.I = j2;
        uscVar.b = 1.0f;
        usc uscVar6 = vscVar.j;
        uscVar6.d = 320.0f;
        uscVar6.e = 0.75f;
        uscVar6.b = 1.0f;
        vscVar.l.a(0.0f);
        this.A0 = fArr[0] - f;
        this.B0 = fArr[1] - f2;
        if (!this.p0) {
            f3 = 0.0f;
        }
        this.O.b = f3;
        performHapticFeedback(3);
    }

    public final void X(vsc vscVar, boolean z) {
        this.T0 = this.U0;
        this.U0 = vscVar;
        this.V0 = 0.0f;
        this.Y0 = z;
        if (vscVar != null) {
            this.W0 = vscVar.e.b / this.Z0;
            this.X0 = vscVar.f.b / this.a1;
        }
        f0();
    }

    public final void Y(defpackage.x25 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsc.Y(x25):void");
    }

    public final RectF Z(vsc vscVar) {
        ksc j = j(vscVar);
        if (j != null && j.isShown()) {
            Matrix matrix = this.w;
            frc.k(j, matrix);
            Matrix matrix2 = this.x;
            frc.k(this, matrix2);
            if (!matrix2.invert(matrix2)) {
                return null;
            }
            matrix.postConcat(matrix2);
            RectF rectF = new RectF(0.0f, 0.0f, j.getWidth(), j.getHeight());
            matrix.mapRect(rectF);
            if (rectF.bottom > 0.0f && rectF.top < getHeight()) {
                return rectF;
            }
        }
        return null;
    }

    public final void a() {
        this.r0 = false;
        removeCallbacks(this.C1);
        removeCallbacks(this.B1);
        this.h0 = null;
        VelocityTracker velocityTracker = this.P0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.P0 = null;
        }
        f0();
    }

    public final TL_stories.TL_mediaAreaCoordinates a0(vsc vscVar) {
        TL_stories.TL_mediaAreaCoordinates tL_mediaAreaCoordinates = new TL_stories.TL_mediaAreaCoordinates();
        float U = U() * vscVar.h.b;
        tL_mediaAreaCoordinates.x = N((vscVar.e.b / this.Z0) * 100.0f);
        tL_mediaAreaCoordinates.y = N((vscVar.f.b / this.a1) * 100.0f);
        tL_mediaAreaCoordinates.w = N((U / this.Z0) * 100.0f);
        tL_mediaAreaCoordinates.h = N((U / this.a1) * 100.0f);
        float f = vscVar.i.b % 360.0f;
        if (f < 0.0f) {
            f += 360.0f;
        }
        tL_mediaAreaCoordinates.rotation = N(f);
        return tL_mediaAreaCoordinates;
    }

    public final void b0(TL_wallet.nftItem nftitem) {
        if (!A()) {
            return;
        }
        vsc v = v(nftitem);
        if (v.b()) {
            if (this.d.o()) {
                E(v);
            } else {
                V(v);
            }
        } else if (v.H == 0 && b(v)) {
            d0(v);
        }
        k();
    }

    public final void c0(vsc vscVar) {
        String str = vscVar.a;
        if (str.equals(this.Q0)) {
            l();
        } else if (m(vscVar)) {
            this.Q0 = str;
            if (vscVar.b()) {
                X(vscVar, false);
                k();
            } else {
                this.R0 = str;
                d0(vscVar);
                if (vscVar.H == 0) {
                    this.R0 = null;
                    this.Q0 = null;
                } else {
                    k();
                }
            }
            O();
        }
    }

    public final void d(TL_wallet.card cardVar) {
        String str;
        vsc vscVar;
        vsc vscVar2;
        byte b;
        this.c1 = cardVar;
        this.d1 = T(cardVar);
        if (!this.e1 && this.g1 == 0 && !this.q0) {
            TL_wallet.nftItem nftitem = cardVar.bg_nft_item;
            vsc vscVar3 = null;
            if (nftitem == null) {
                str = null;
            } else {
                str = nftitem.address;
            }
            boolean equals = TextUtils.equals(str, this.Q0);
            if (!equals) {
                this.Q0 = str;
                this.R0 = null;
            }
            ArrayList<TL_wallet.cardSticker> arrayList = cardVar.stickers;
            if (arrayList != null) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    TL_wallet.cardSticker cardsticker = arrayList.get(i);
                    i++;
                    TL_wallet.nftItem nftitem2 = cardsticker.nft;
                    if (nftitem2 != null && nftitem2.gift != null) {
                        v(nftitem2);
                    }
                }
            }
            if (this.b) {
                TL_wallet.nftItem nftitem3 = cardVar.bg_nft_item;
                if (nftitem3 != null && nftitem3.gift != null) {
                    vscVar3 = v(nftitem3);
                }
                this.T0 = vscVar3;
                this.U0 = vscVar3;
                this.V0 = 1.0f;
                e();
                f0();
            } else if (!A()) {
                f0();
            } else {
                this.f1 = true;
                ArrayList G = G();
                int size2 = G.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj = G.get(i2);
                    i2++;
                    vsc vscVar4 = (vsc) obj;
                    if (vscVar4.K && (b = vscVar4.H) != 3 && b != 4 && b != 5) {
                        TL_wallet.cardSticker R = R(vscVar4.a);
                        if (R != null) {
                            if (!vscVar4.b() || !y(a0(vscVar4)).equals(y(R.coordinates))) {
                                K(vscVar4, R.coordinates, vscVar4.N);
                            }
                        } else if (vscVar4.b()) {
                            E(vscVar4);
                        }
                    }
                }
                ArrayList<TL_wallet.cardSticker> arrayList2 = cardVar.stickers;
                LinkedHashMap linkedHashMap = this.f;
                if (arrayList2 != null) {
                    int size3 = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        TL_wallet.cardSticker cardsticker2 = arrayList2.get(i3);
                        i3++;
                        TL_wallet.nftItem nftitem4 = cardsticker2.nft;
                        if (nftitem4 == null) {
                            vscVar2 = null;
                        } else {
                            vscVar2 = (vsc) linkedHashMap.get(nftitem4.address);
                        }
                        if (vscVar2 != null && vscVar2.H == 2) {
                            long j = this.O0 + 1;
                            this.O0 = j;
                            vscVar2.I = j;
                        }
                    }
                }
                if (!equals) {
                    String str2 = this.Q0;
                    if (str2 == null) {
                        vscVar = null;
                    } else {
                        vscVar = (vsc) linkedHashMap.get(str2);
                    }
                    if (vscVar != null && vscVar.b()) {
                        X(vscVar, false);
                    } else {
                        X(null, true);
                    }
                }
                this.f1 = false;
                O();
                f0();
            }
        }
    }

    public final void d0(vsc vscVar) {
        ((uqc) this.d.c).R0(2600L);
        if (A()) {
            float[] x = x(vscVar, Float.NaN, Float.NaN, true);
            RectF Z = Z(vscVar);
            if (x != null && Z != null) {
                vscVar.g.a((f(vscVar) * Z.width()) / U());
                vscVar.m.a(0.0f);
                vscVar.j.a(1.0f);
                float[] fArr = {Z.centerX(), Z.centerY()};
                this.s.mapPoints(fArr);
                I(vscVar, fArr, x, true);
                performHapticFeedback(3);
                return;
            }
            ksc j = j(vscVar);
            if (j != null) {
                j.animate().rotation(3.0f).setDuration(90L).withEndAction(new nsc(j, (byte) 0)).start();
            }
        }
    }

    public final void e() {
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2;
        float pow;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4;
        vsc vscVar = this.T0;
        if (vscVar == null) {
            stargiftattributebackdrop = null;
        } else {
            stargiftattributebackdrop = vscVar.t;
        }
        float[] i = lsc.i(stargiftattributebackdrop);
        vsc vscVar2 = this.U0;
        if (vscVar2 == null) {
            stargiftattributebackdrop2 = null;
        } else {
            stargiftattributebackdrop2 = vscVar2.t;
        }
        float[] i2 = lsc.i(stargiftattributebackdrop2);
        boolean z = this.Y0;
        float f = this.V0;
        float f2 = 1.0f;
        if (z) {
            pow = xnb.B(f, 2.0f, 3.0f, f * f);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - f, 4.0d));
        }
        float[] fArr = new float[18];
        float f3 = i[0];
        float f4 = i[1];
        float f5 = i[2];
        float f6 = i2[0];
        float f7 = i2[1];
        float f8 = i2[2];
        float f9 = this.W0;
        float f10 = this.X0;
        if (!this.Y0) {
            f2 = 0.0f;
        }
        System.arraycopy(new float[]{f3, f4, f5, f6, f7, f8, f9, f10, pow, f2}, 0, fArr, 0, 10);
        vsc vscVar3 = this.T0;
        if (vscVar3 == null) {
            stargiftattributebackdrop3 = null;
        } else {
            stargiftattributebackdrop3 = vscVar3.t;
        }
        lsc.m(fArr, 0, stargiftattributebackdrop3);
        vsc vscVar4 = this.U0;
        if (vscVar4 == null) {
            stargiftattributebackdrop4 = null;
        } else {
            stargiftattributebackdrop4 = vscVar4.t;
        }
        lsc.m(fArr, 1, stargiftattributebackdrop4);
        this.c.setStickerStyle(fArr);
    }

    public final float f(vsc vscVar) {
        ksc j = j(vscVar);
        if (j != null) {
            de0 de0Var = j.E;
            if (j.getWidth() > 0 && de0Var.getWidth() > 0) {
                return ((de0Var.getWidth() / j.getWidth()) * 288.0f) / 268.0f;
            }
            return 0.77f;
        }
        return 0.77f;
    }

    public final void f0() {
        if (!this.b1 && isAttachedToWindow()) {
            rsc rscVar = this.F1;
            removeCallbacks(rscVar);
            postOnAnimation(rscVar);
        }
    }

    public final void g(vsc vscVar) {
        vscVar.H = (byte) 0;
        vscVar.J = 0L;
        vscVar.g.a(1.0f);
        vscVar.h.a(1.0f);
        vscVar.i.a(0.0f);
        vscVar.m.a(0.0f);
        vscVar.j.a(0.0f);
        vscVar.k.a(0.0f);
        ksc j = j(vscVar);
        if (j != null) {
            j.animate().cancel();
            j.setScaleX(1.0f);
            j.setScaleY(1.0f);
        }
    }

    public final float h() {
        return (getHeight() - hl.L(64.0f)) - hl.n;
    }

    public final void i(ksc kscVar) {
        float f;
        ArrayList arrayList = this.h;
        if (!arrayList.contains(kscVar)) {
            arrayList.add(kscVar);
        }
        vsc v = v(kscVar.x0);
        if (v.H == 0) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        kscVar.k(v.R, false, f);
        f0();
    }

    public final ksc j(vsc vscVar) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ksc kscVar = (ksc) obj;
            if (kscVar.isAttachedToWindow() && kscVar.x0.address.equals(vscVar.a)) {
                return kscVar;
            }
        }
        return null;
    }

    public final void k() {
        if (!this.b && !this.f1) {
            this.e1 = true;
            msc mscVar = this.h1;
            hl.r(mscVar);
            hl.d3(mscVar, 1500L);
        }
    }

    public final void l() {
        this.R0 = null;
        this.Q0 = null;
        X(null, true);
        O();
        k();
    }

    public final boolean m(vsc vscVar) {
        if (b(vscVar) && F(this.a.getCurrentAccount(), vscVar.b.gift.slug)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.z1);
        getViewTreeObserver().addOnPreDrawListener(this.A1);
        for (vsc vscVar : this.f.values()) {
            vscVar.c.I();
            vscVar.d.I();
        }
        f0();
    }

    @Override
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnScrollChangedListener(this.z1);
        getViewTreeObserver().removeOnPreDrawListener(this.A1);
        removeCallbacks(this.F1);
        removeCallbacks(this.B1);
        for (vsc vscVar : this.f.values()) {
            vscVar.c.K();
            vscVar.d.K();
        }
        this.N0 = 0L;
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        float f5;
        int i2;
        Paint paint;
        ArrayList arrayList;
        RectF rectF;
        Rect rect;
        float f6;
        float f7;
        vsc vscVar;
        wsc wscVar = this;
        Canvas canvas2 = canvas;
        if (wscVar.A()) {
            float f8 = wscVar.O.a;
            int i3 = (f8 > 0.01f ? 1 : (f8 == 0.01f ? 0 : -1));
            RectF rectF2 = wscVar.I;
            ?? r10 = 0;
            Paint paint2 = wscVar.y;
            if (i3 < 0) {
                f2 = 0.0f;
                i = 0;
                f = 0.4f;
                f3 = 2.0f;
                f4 = 0.6f;
            } else {
                float max = Math.max(0.0f, Math.min(1.2f, wscVar.P.a));
                float l = Utilities.l(max);
                f = 0.4f;
                Paint paint3 = wscVar.H;
                paint3.setTextSize(hl.L(15.0f));
                f2 = 0.0f;
                f3 = 2.0f;
                float measureText = (((paint3.measureText(ob6.M0(2131746048, null)) + hl.L(72.0f)) - hl.L(56.0f)) * max) + hl.L(56.0f);
                canvas2.save();
                f4 = 0.6f;
                canvas2.translate(wscVar.getWidth() / 2.0f, ((1.0f - f8) * hl.L(90.0f)) + wscVar.h());
                float f9 = (f8 * 0.4f) + 0.6f;
                canvas2.scale(f9, f9);
                int i4 = aob.d6;
                e eVar = wscVar.a;
                paint2.setColor(vm2.f(l, aob.v0(i4, eVar.getResourceProvider()), -1750963));
                paint2.setAlpha((int) (Utilities.l(f8) * 255.0f));
                float f10 = (-measureText) / 2.0f;
                float f11 = measureText / 2.0f;
                rectF2.set(f10, -hl.L(28.0f), f11, hl.L(28.0f));
                canvas2.drawRoundRect(rectF2, hl.L(28.0f), hl.L(28.0f), paint2);
                float L = (f10 + hl.L(30.0f)) * l;
                float L2 = hl.L(21.0f);
                int round = Math.round(wscVar.d0.a);
                b29 b29Var = wscVar.f0;
                b29Var.I(round, false, false);
                float f12 = L - L2;
                i = 0;
                float f13 = -L2;
                float f14 = L + L2;
                b29Var.setBounds((int) f12, (int) f13, (int) f14, (int) L2);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(vm2.f(l, aob.v0(aob.G6, eVar.getResourceProvider()), -1), PorterDuff.Mode.SRC_IN);
                Paint paint4 = wscVar.e0;
                paint4.setColorFilter(porterDuffColorFilter);
                paint4.setAlpha((int) (Utilities.l(f8) * 255.0f));
                canvas2 = canvas;
                int saveLayer = canvas2.saveLayer(f12, f13, f14, L2, paint4);
                b29Var.draw(canvas2);
                canvas2.restoreToCount(saveLayer);
                if (l > 0.02f) {
                    paint3.setColor(-1);
                    paint3.setAlpha((int) (Utilities.l((l - 0.4f) / 0.6f) * 255.0f));
                    Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
                    canvas2.save();
                    canvas2.clipRect(hl.L(22.0f) + L, -hl.L(28.0f), f11 - hl.L(16.0f), hl.L(28.0f));
                    canvas2.drawText(ob6.M0(2131746048, null), L + hl.L(22.0f), (-(fontMetrics.ascent + fontMetrics.descent)) / 2.0f, paint3);
                    canvas2.restore();
                }
                canvas2.restore();
                r10 = 0;
            }
            paint2.setShader(r10);
            paint2.setColorFilter(r10);
            paint2.setAlpha(255);
            ArrayList G = wscVar.G();
            int size = G.size();
            int i5 = i;
            while (i5 < size) {
                int i6 = i5 + 1;
                vsc vscVar2 = (vsc) G.get(i5);
                usc uscVar = vscVar2.e;
                usc uscVar2 = vscVar2.i;
                float f15 = uscVar.a;
                float f16 = vscVar2.f.a;
                float U = wscVar.U() * vscVar2.g.a * vscVar2.h.a;
                float f17 = vscVar2.j.a;
                byte b = vscVar2.H;
                if (b == 1 && vscVar2.O && f17 > 0.3f) {
                    float[] L3 = wscVar.L(f15 + vscVar2.n.a, f16 + vscVar2.o.a);
                    float f18 = L3[i];
                    float f19 = L3[1];
                    U = xnb.z(f17, 0.15f, 1.0f, U);
                    f5 = f19;
                    f15 = f18;
                } else if (b == 3 || b == 4 || b == 5) {
                    f5 = f16;
                } else {
                    i5 = i6;
                }
                float f20 = U;
                Bitmap a = vscVar2.a();
                if (a != null) {
                    if (f20 >= 1.0f) {
                        canvas2.save();
                        canvas2.rotate(uscVar2.a, f15, f5);
                        Paint paint5 = paint2;
                        wscVar.t(canvas2, vscVar2, f15, (hl.L(5.0f) * f17) + hl.L(1.5f) + f5, xnb.z(f17, 0.04f, 1.0f, f20), f17, 0.0f, 1.0f);
                        canvas.restore();
                        float l2 = Utilities.l(vscVar2.m.a);
                        if (vscVar2.H == 4 && vscVar2.W > f4 && wscVar.j(vscVar2) != null) {
                            float l3 = Utilities.l((vscVar2.W - f4) / f);
                            float f21 = (1.0f - ((3.0f - (l3 * f3)) * (l3 * l3))) * 0.45f;
                            float l4 = (1.0f - (Utilities.l(-vscVar2.V) * f4)) * 0.55f;
                            if (l2 < 1.0f) {
                                paint5.setAlpha((int) ((1.0f - l2) * 255.0f));
                                i2 = size;
                                paint = paint5;
                                f7 = f20;
                                arrayList = G;
                                rectF = rectF2;
                                f6 = f5;
                                vscVar = vscVar2;
                                wscVar.r(canvas, vscVar2.v, f15, f6, f7, f21, l4, uscVar2.a, vscVar2.U, vscVar2.V);
                            } else {
                                f6 = f5;
                                i2 = size;
                                f7 = f20;
                                vscVar = vscVar2;
                                paint = paint5;
                                arrayList = G;
                                rectF = rectF2;
                            }
                            if (l2 > f2) {
                                paint.setAlpha((int) (l2 * 255.0f));
                                canvas2 = canvas;
                                r(canvas2, a, f15, f6, f7, f21, l4, uscVar2.a, vscVar.U, vscVar.V);
                            } else {
                                canvas2 = canvas;
                            }
                            paint.setAlpha(255);
                        } else {
                            float f22 = f5;
                            i2 = size;
                            paint = paint5;
                            arrayList = G;
                            canvas2 = canvas;
                            rectF = rectF2;
                            canvas2.save();
                            canvas2.rotate(uscVar2.a, f15, f22);
                            float f23 = f20 / f3;
                            rectF.set(f15 - f23, f22 - f23, f15 + f23, f23 + f22);
                            if (l2 < 1.0f) {
                                paint.setAlpha((int) ((1.0f - l2) * 255.0f));
                                rect = null;
                                canvas2.drawBitmap(vscVar2.v, (Rect) null, rectF, paint);
                            } else {
                                rect = null;
                            }
                            if (l2 > f2) {
                                paint.setAlpha((int) (l2 * 255.0f));
                                canvas2.drawBitmap(a, rect, rectF, paint);
                            }
                            paint.setAlpha(255);
                            canvas2.restore();
                        }
                        rectF2 = rectF;
                        paint2 = paint;
                        i5 = i6;
                        G = arrayList;
                        size = i2;
                        wscVar = this;
                    }
                } else {
                    wscVar = this;
                }
                i5 = i6;
            }
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        f0();
    }

    public final void p() {
        hl.B2(this.x1);
        hl.B2(this.y1);
        this.y1 = null;
        this.x1 = null;
        O();
        hl.r(this.h1);
        this.i0 = null;
        this.b1 = true;
        if (this.e1) {
            Q();
        }
        this.f0.x(false);
        removeCallbacks(this.F1);
        removeCallbacks(this.B1);
        removeCallbacks(this.C1);
        VelocityTracker velocityTracker = this.P0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.P0 = null;
        }
        for (vsc vscVar : this.f.values()) {
            vscVar.c.K();
            vscVar.d.K();
        }
        this.h.clear();
    }

    public final void q(defpackage.vsc r12, float r13, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsc.q(vsc, float, float):void");
    }

    public final void r(Canvas canvas, Bitmap bitmap, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9;
        float f10;
        float f11 = f3;
        float f12 = (f11 * f4) + ((-f11) / 2.0f);
        float f13 = 0.3f * f11;
        float f14 = 3.2f * f11;
        float f15 = 0.72f * f5;
        float f16 = f13 * f15;
        double d = f6;
        float cos = (float) Math.cos(Math.toRadians(d));
        float sin = (float) Math.sin(Math.toRadians(d));
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i <= 14) {
                int i3 = 0;
                for (int i4 = 14; i3 <= i4; i4 = 14) {
                    float f17 = ((i3 / 14.0f) - 0.5f) * f11;
                    float f18 = ((i / 14.0f) - 0.5f) * f11;
                    float f19 = (f17 * cos) - (f18 * sin);
                    float f20 = (f18 * cos) + (f17 * sin);
                    float f21 = (f20 * f8) + (f19 * f7);
                    float f22 = (f20 * f7) + ((-f19) * f8);
                    float f23 = f12 - f21;
                    float f24 = 0.0f;
                    float f25 = 1.0f;
                    if (f23 > 0.0f) {
                        float min = Math.min(f15, f23 / f13);
                        float max = Math.max(0.0f, f23 - f16);
                        f9 = f13;
                        f10 = f12;
                        double d2 = min;
                        float sin2 = (f10 - (((float) Math.sin(d2)) * f9)) - (((float) Math.cos(d2)) * max);
                        float sin3 = (max * ((float) Math.sin(d2))) + ((1.0f - ((float) Math.cos(d2))) * f9);
                        f25 = (((float) Math.cos(d2)) * 0.38f) + 0.62f;
                        f21 = sin2;
                        f24 = sin3;
                    } else {
                        f9 = f13;
                        f10 = f12;
                    }
                    float f26 = f14 / (f14 - f24);
                    int i5 = i2 << 1;
                    float[] fArr = this.K;
                    fArr[i5] = (((f21 * f7) - (f22 * f8)) * f26) + f;
                    fArr[i5 + 1] = bp1.g(f22, f7, f21 * f8, f26, f2) - (f24 * 0.15f);
                    int i6 = (int) (255.0f * f25);
                    this.L[i2] = Color.rgb(i6, i6, i6);
                    i3++;
                    f11 = f3;
                    i2++;
                    f12 = f10;
                    f13 = f9;
                }
                i++;
                f11 = f3;
                f12 = f12;
            } else {
                canvas.drawBitmapMesh(bitmap, 14, 14, this.K, 0, this.L, 0, this.y);
                return;
            }
        }
    }

    public final void s(Canvas canvas, vsc vscVar, float f, float f2, boolean z) {
        float f3;
        ImageReceiver imageReceiver = vscVar.d;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = vscVar.t;
        Bitmap n = imageReceiver.n();
        if (n != null && stargiftattributebackdrop != null) {
            canvas.save();
            float f4 = this.Z0;
            float f5 = this.a1;
            Path path = this.J;
            path.rewind();
            float f6 = 0.15f;
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(0.0f, 0.0f, f4, f5, (f4 * 0.15f) / 2.0f, (f5 * 0.15f) / 1.212122f, direction);
            canvas.clipPath(path);
            this.c.h(path, this.Z0, this.a1);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i >= 0 && !z) {
                path.rewind();
                path.addCircle(this.W0 * this.Z0, this.X0 * this.a1, f2, direction);
                canvas.clipPath(path);
            }
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(stargiftattributebackdrop.pattern_color | (-16777216), PorterDuff.Mode.SRC_IN);
            Paint paint = this.y;
            paint.setColorFilter(porterDuffColorFilter);
            float f7 = this.Z0 / 336.0f;
            float f8 = this.a1 / 205.0f;
            int i2 = 16;
            int i3 = 0;
            int i4 = 16;
            while (i4 < 336) {
                int i5 = ((i3 % 2) * 18) + i2;
                while (i5 < 205) {
                    float f9 = i4 * f7;
                    float f10 = i5 * f8;
                    float f11 = f6;
                    float f12 = f7 * 12.0f;
                    float l = Utilities.l(Math.min(Math.min(i4, 336 - i4), Math.min(i5, 205 - i5)) / 48.0f);
                    float f13 = f7;
                    float B = f * f11 * xnb.B(l, 2.0f, 3.0f, l * l);
                    if (i >= 0) {
                        float l2 = Utilities.l((f2 - Utilities.t(f9, f10, this.W0 * this.Z0, this.X0 * this.a1)) / hl.L(120.0f));
                        if (z) {
                            f12 = xnb.B(l2, 0.8f, 1.0f, f12);
                            B *= 1.0f - Utilities.l(l2 * 1.6f);
                        } else {
                            f3 = f9;
                            f12 *= (((((float) Math.sin(l2 * 3.141592653589793d)) * 0.28f) + l2) * 0.8f) + 0.2f;
                            B *= Utilities.l(l2 * 1.6f);
                            paint.setAlpha((int) (B * 255.0f));
                            float f14 = f12 / 2.0f;
                            RectF rectF = this.I;
                            rectF.set(f3 - f14, f10 - f14, f3 + f14, f10 + f14);
                            canvas.drawBitmap(n, (Rect) null, rectF, paint);
                            i5 += 37;
                            f6 = f11;
                            f7 = f13;
                        }
                    }
                    f3 = f9;
                    paint.setAlpha((int) (B * 255.0f));
                    float f142 = f12 / 2.0f;
                    RectF rectF2 = this.I;
                    rectF2.set(f3 - f142, f10 - f142, f3 + f142, f10 + f142);
                    canvas.drawBitmap(n, (Rect) null, rectF2, paint);
                    i5 += 37;
                    f6 = f11;
                    f7 = f13;
                }
                i4 += 33;
                i3++;
                i2 = 16;
            }
            paint.setColorFilter(null);
            paint.setAlpha(255);
            canvas.restore();
        }
    }

    public final void t(Canvas canvas, vsc vscVar, float f, float f2, float f3, float f4, float f5, float f6) {
        if (f6 > 0.01f && vscVar.w != null) {
            float f7 = (((0.05f * f4) + 1.0f) * ((f3 * 176.0f) / 128.0f)) / 2.0f;
            float f8 = f - f7;
            float f9 = f2 - f7;
            float f10 = f + f7;
            float f11 = f2 + f7;
            RectF rectF = this.I;
            rectF.set(f8, f9, f10, f11);
            Paint paint = this.y;
            int alpha = paint.getAlpha();
            paint.setColor(-16044452);
            float l = Utilities.l(vscVar.m.a);
            paint.setAlpha((int) (l * Utilities.l((f5 * 0.12f) + (f4 * (-0.049999997f)) + 0.16f) * 255.0f * f6));
            canvas.drawBitmap(vscVar.w, (Rect) null, rectF, paint);
            paint.setColor(-1);
            paint.setAlpha(alpha);
        }
    }

    public final vsc v(TL_wallet.nftItem nftitem) {
        String str = nftitem.address;
        LinkedHashMap linkedHashMap = this.f;
        vsc vscVar = (vsc) linkedHashMap.get(str);
        if (vscVar == null) {
            vscVar = new vsc(this, nftitem);
            linkedHashMap.put(nftitem.address, vscVar);
        }
        vscVar.b = nftitem;
        return vscVar;
    }

    public final void w(float r19, float r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsc.w(float, float, boolean):void");
    }

    public final float[] x(vsc vscVar, float f, float f2, boolean z) {
        float f3;
        float f4;
        float f5;
        ArrayList arrayList;
        float nextFloat;
        if (!z) {
            vscVar.N = false;
            return new float[]{f, f2, vscVar.h.b};
        }
        ArrayList<RectF> stickerObstacles = this.c.getStickerObstacles();
        float f6 = this.Z0 * 0.012f;
        int size = stickerObstacles.size();
        int i = 0;
        while (i < size) {
            RectF rectF = stickerObstacles.get(i);
            i++;
            float f7 = -f6;
            rectF.inset(f7, f7);
        }
        stickerObstacles.get(2).left -= this.Z0 * 0.035f;
        float L = hl.L(32.0f) / U();
        float f8 = vscVar.h.b;
        vscVar.N = false;
        ArrayList arrayList2 = new ArrayList();
        for (vsc vscVar2 : this.f.values()) {
            if (vscVar2 != vscVar && vscVar2.b()) {
                arrayList2.add(vscVar2);
            }
        }
        boolean z2 = (Float.isNaN(f) || Float.isNaN(f2)) ? false : true;
        if (z2 || vscVar != this.l1 || this.n1 == null || !arrayList2.isEmpty()) {
            if (z2) {
                f3 = f;
                f4 = f2;
            } else {
                f3 = this.Z0 * 0.6f;
                f4 = this.a1 * 0.68f;
            }
            Random random = new Random((System.nanoTime() / 400000000) + (arrayList2.size() * 31) + (vscVar.a.hashCode() * 7919));
            float e = ik8.e(random, 0.04f, 0.05f);
            float f9 = 0.5f;
            float nextFloat2 = (((random.nextFloat() - 0.5f) * 0.08f) + 0.5f) * this.Z0;
            float nextFloat3 = this.a1 * (((random.nextFloat() - 0.5f) * 0.08f) + 0.55f);
            float U = U() * L * 0.5f;
            float f10 = -3.4028235E38f;
            float[] fArr = null;
            float f11 = U;
            while (f11 <= this.a1 - U) {
                float f12 = f9;
                float f13 = U;
                while (true) {
                    float f14 = this.Z0;
                    if (f13 <= f14 - U) {
                        float min = Math.min(Math.min(f13, f14 - f13), Math.min(f11, this.a1 - f11));
                        float f15 = e;
                        float min2 = Math.min(Math.max(0.74f, 1.0f - (arrayList2.size() * e)) * f8, min / (U() * f12));
                        int size2 = stickerObstacles.size();
                        float f16 = L;
                        float f17 = f8;
                        int i2 = 0;
                        float f18 = Float.MAX_VALUE;
                        while (i2 < size2) {
                            ArrayList<RectF> arrayList3 = stickerObstacles;
                            RectF rectF2 = stickerObstacles.get(i2);
                            f18 = Math.min(f18, Utilities.t(f13, f11, Math.max(rectF2.left, Math.min(rectF2.right, f13)), Math.max(rectF2.top, Math.min(rectF2.bottom, f11))));
                            i2++;
                            stickerObstacles = arrayList3;
                            z2 = z2;
                        }
                        ArrayList<RectF> arrayList4 = stickerObstacles;
                        boolean z3 = z2;
                        float min3 = Math.min(min2, f18 / (U() * 0.44f));
                        int i3 = 0;
                        for (int size3 = arrayList2.size(); i3 < size3; size3 = size3) {
                            Object obj = arrayList2.get(i3);
                            i3++;
                            vsc vscVar3 = (vsc) obj;
                            min3 = Math.min(min3, (Utilities.t(f13, f11, vscVar3.e.b, vscVar3.f.b) / (U() * 0.29f)) - vscVar3.h.b);
                        }
                        float l = ((Utilities.l((min - ((U() * f12) * min3)) / hl.L(14.0f)) * 0.1f) + 0.9f) * min3;
                        if (l < f16) {
                            arrayList = arrayList2;
                        } else {
                            if (arrayList2.isEmpty()) {
                                float f19 = this.Z0 * 0.6f;
                                float A = qd4.A(f3, f19, 0.2f, f19);
                                float f20 = this.a1 * 0.68f;
                                nextFloat = (random.nextFloat() * hl.L(5.0f)) + (U() * 1.1f * l) + (Utilities.t(f13, f11, A, qd4.A(f4, f20, 0.2f, f20)) * (-0.45f));
                                f5 = l;
                                arrayList = arrayList2;
                            } else {
                                float f21 = f11 * l * l;
                                float f22 = l * l;
                                int size4 = arrayList2.size();
                                float f23 = f13 * l * l;
                                int i4 = 0;
                                float f24 = Float.MAX_VALUE;
                                float f25 = 0.0f;
                                while (i4 < size4) {
                                    Object obj2 = arrayList2.get(i4);
                                    int i5 = i4 + 1;
                                    vsc vscVar4 = (vsc) obj2;
                                    float f26 = l;
                                    usc uscVar = vscVar4.e;
                                    int i6 = size4;
                                    usc uscVar2 = vscVar4.h;
                                    ArrayList arrayList5 = arrayList2;
                                    usc uscVar3 = vscVar4.f;
                                    f24 = Math.min(f24, Utilities.t(f13, f11, uscVar.b, uscVar3.b) - ((uscVar2.b + f26) * (U() * 0.4f)));
                                    float f27 = uscVar2.b;
                                    float f28 = f27 * f27;
                                    float f29 = vscVar4.e.b;
                                    f23 = (f29 * f28) + f23;
                                    f21 = (uscVar3.b * f28) + f21;
                                    f22 += f28;
                                    f25 = Math.max(0.0f, 1.0f - (Math.abs(uscVar3.b - f11) / (U() * 0.12f))) + Math.max(0.0f, 1.0f - (Math.abs(f29 - f13) / (U() * 0.12f))) + f25;
                                    l = f26;
                                    i4 = i5;
                                    size4 = i6;
                                    arrayList2 = arrayList5;
                                }
                                f5 = l;
                                arrayList = arrayList2;
                                nextFloat = ((random.nextFloat() * hl.L(10.0f)) + (((((Math.min(Math.min(min, f18), U()) * 0.2f) + ((U() * (f5 * 0.9f)) + ((f24 < 0.0f ? f24 * 2.5f : Math.min(f24, U() * 0.3f)) * 1.2f))) - (Utilities.t(f23 / f22, f21 / f22, nextFloat2, nextFloat3) * 0.35f)) - ((U() * f25) * 0.08f)) - (Utilities.t(f13, f11, this.Z0 * f12, this.a1 * 0.55f) * 0.04f))) - (z3 ? Utilities.t(f13, f11, f3, f4) * 0.04f : 0.0f);
                            }
                            if (nextFloat > f10) {
                                f10 = nextFloat;
                                fArr = new float[]{f13, f11, f5};
                            }
                        }
                        f13 += hl.L(5.0f);
                        e = f15;
                        L = f16;
                        f8 = f17;
                        stickerObstacles = arrayList4;
                        z2 = z3;
                        arrayList2 = arrayList;
                    }
                }
                f11 += hl.L(5.0f);
                f9 = f12;
                e = e;
            }
            return fArr;
        }
        return (float[]) this.n1.clone();
    }

    public final boolean z(ksc kscVar) {
        if (kscVar.isShown()) {
            Rect rect = this.I1;
            if (kscVar.getGlobalVisibleRect(rect) && rect.width() >= kscVar.getWidth() - 1 && rect.height() >= kscVar.getHeight() - 1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
