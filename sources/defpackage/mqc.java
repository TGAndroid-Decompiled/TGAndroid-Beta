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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Wallet.c;
public final class mqc extends View {
    public static final int J1 = 0;
    public float A0;
    public final cc A1;
    public float B0;
    public final cqc B1;
    public float C0;
    public final cqc C1;
    public float D0;
    public long D1;
    public final Paint E;
    public float E0;
    public boolean E1;
    public final RectF F;
    public float F0;
    public final hqc F1;
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
    public final gqc M;
    public boolean M0;
    public final fqc N;
    public long N0;
    public final kqc O;
    public long O0;
    public final kqc P;
    public VelocityTracker P0;
    public final kqc Q;
    public String Q0;
    public final kqc R;
    public String R0;
    public final kqc S;
    public long S0;
    public final ArrayList T;
    public lqc T0;
    public final Path U;
    public lqc U0;
    public final Paint V;
    public float V0;
    public final LinearGradient W;
    public float W0;
    public float X0;
    public boolean Y0;
    public float Z0;
    public final d a;
    public final Matrix a0;
    public float a1;
    public final boolean b;
    public float b0;
    public boolean b1;
    public final soc c;
    public float c0;
    public TL_wallet.card c1;
    public final xab d;
    public final kqc d0;
    public String d1;
    public final SharedPreferences e;
    public final Paint e0;
    public boolean e1;
    public final LinkedHashMap f;
    public final p09 f0;
    public boolean f1;
    public boolean g0;
    public int g1;
    public final ArrayList h;
    public lqc h0;
    public final cqc h1;
    public lqc i0;
    public boolean i1;
    public boolean j0;
    public boolean j1;
    public final Paint k0;
    public boolean k1;
    public final Paint l0;
    public lqc l1;
    public final Paint m0;
    public aqc m1;
    public final ArrayList n;
    public boolean n0;
    public float[] n1;
    public boolean o0;
    public float o1;
    public boolean p0;
    public final float[] p1;
    public boolean q0;
    public final kqc q1;
    public final Matrix r;
    public boolean r0;
    public final kqc r1;
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
    public hg5 x1;
    public final Paint y;
    public float y0;
    public hg5 y1;
    public float z0;
    public final be z1;

    public mqc(d dVar, soc socVar, xab xabVar, TL_wallet.card cardVar) {
        super(dVar.getContext());
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
        this.O = new kqc(0.0f, 260.0f, 0.78f);
        this.P = new kqc(0.0f, 420.0f, 0.72f);
        this.Q = new kqc(1.0f, 420.0f, 0.38f);
        this.R = new kqc(0.0f, 170.0f, 0.42f);
        this.S = new kqc(0.0f, 170.0f, 0.42f);
        this.T = new ArrayList();
        this.U = new Path();
        Paint paint3 = new Paint(1);
        this.V = paint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, 16777215, 352321535, 16777215, 16777215}, new float[]{0.0f, 0.36f, 0.5f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.W = linearGradient;
        this.a0 = new Matrix();
        this.d0 = new kqc(0.0f, 120.0f, 1.0f);
        this.e0 = new Paint(1);
        this.k0 = new Paint(1);
        this.l0 = new Paint(1);
        this.m0 = new Paint(1);
        this.V0 = 1.0f;
        this.W0 = 0.5f;
        this.X0 = 0.5f;
        this.h1 = new cqc(this, (byte) 2);
        this.p1 = new float[3];
        this.q1 = new kqc(0.0f, 260.0f, 1.0f);
        this.r1 = new kqc(0.0f, 220.0f, 1.0f);
        Paint paint4 = new Paint(1);
        this.s1 = paint4;
        Paint paint5 = new Paint(1);
        this.t1 = paint5;
        this.u1 = new Matrix();
        this.v1 = new Path();
        this.w1 = new RectF();
        this.z1 = new be(this, (byte) 3);
        this.A1 = new cc(this, (byte) 11);
        this.B1 = new cqc(this, (byte) 3);
        this.C1 = new cqc(this, (byte) 0);
        this.F1 = new hqc(this);
        this.G1 = new RectF();
        Paint paint6 = new Paint(1);
        this.H1 = paint6;
        paint6.setColor(-16777216);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.I1 = new Rect();
        this.a = dVar;
        boolean z = cardVar != null;
        this.b = z;
        p09 p09Var = new p09(2131624353, gm.L(42.0f), gm.L(42.0f), true, null);
        this.f0 = p09Var;
        p09Var.M(this);
        this.c = socVar;
        this.d = xabVar;
        paint3.setShader(linearGradient);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        if (z) {
            sharedPreferences = null;
        } else {
            sharedPreferences = getContext().getSharedPreferences("wallet_card_stickers_" + dVar.getCurrentAccount() + "_" + c.C(dVar.getCurrentAccount()).x(), 0);
        }
        this.e = sharedPreferences;
        this.Q0 = z ? null : sharedPreferences.getString("style", null);
        this.i1 = (z || oc7.d1().getBoolean("walletcardstickerhint", false)) ? false : true;
        Paint.Style style = Paint.Style.STROKE;
        paint4.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint4.setStrokeCap(cap);
        paint4.setStrokeJoin(Paint.Join.ROUND);
        paint5.setColor(-1);
        setImportantForAccessibility(2);
        setTranslationZ(gm.L(24.0f));
        paint.setStyle(style);
        paint.setStrokeCap(cap);
        paint2.setTypeface(gm.o());
        fqc fqcVar = new fqc(this, getContext());
        this.N = fqcVar;
        gqc gqcVar = new gqc(this, getContext());
        this.M = gqcVar;
        fqcVar.setTag(moc.o0);
        socVar.getFrontFace().addView(fqcVar, 0, qoe.c(-1.0f, -1));
        socVar.getFrontFace().addView(gqcVar, socVar.getStickerLayerIndex(), qoe.c(-1.0f, -1));
        if (z) {
            gqcVar.addOnLayoutChangeListener(new ol1(this, (byte) 8));
            d(cardVar);
            return;
        }
        int currentAccount = dVar.getCurrentAccount();
        oc7 r1 = oc7.r1(currentAccount);
        long e = z8c.h(currentAccount).e();
        TLRPC.UserFull X1 = r1.X1(e);
        if (X1 != null) {
            this.D1 = SystemClock.elapsedRealtime();
            TL_wallet.card cardVar2 = X1.wallet_card;
            d(cardVar2 == null ? new TL_wallet.card() : cardVar2);
            return;
        }
        r1.b3(r1.W1(Long.valueOf(e)), 0, true, new eg9(this, (byte) 27));
    }

    public static boolean F(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf(45);
            Set set = oc7.r1(i).l4.q0.f;
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

    public static Path H(lqc lqcVar) {
        Bitmap bitmap;
        int i;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        if (lqcVar != null && lqcVar.F == null && (bitmap = lqcVar.u) != null) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 128, 128, true);
            int[] iArr = new int[16384];
            createScaledBitmap.getPixels(iArr, 0, 128, 0, 0, 128, 128);
            if (createScaledBitmap != lqcVar.u) {
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
                    lqcVar.F = path;
                    return path;
                }
                return null;
            }
            return null;
        } else if (lqcVar == null) {
            return null;
        } else {
            return lqcVar.F;
        }
    }

    public static void J(hg5 hg5Var, float f, float f2) {
        o(hg5Var, 3);
        hg5Var.o(0.0f, f - hg5Var.getPaddingLeft());
        hg5Var.setTranslationY(f2 - hg5Var.getLayoutParams().height);
        hg5Var.invalidate();
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

    public static boolean b(lqc lqcVar) {
        TL_wallet.nftItem nftitem;
        if (lqcVar != null && (nftitem = lqcVar.b) != null && nftitem.gift != null) {
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
        TLRPC.UserFull X1 = oc7.r1(i).X1(z8c.h(i).e());
        if (X1 == null) {
            return;
        }
        X1.wallet_card = cardVar;
        cf7.Y(i).g2(X1, false);
    }

    public static float n(RectF rectF, RectF rectF2) {
        float min = Math.min(rectF.right, rectF2.right) - Math.max(rectF.left, rectF2.left);
        float min2 = Math.min(rectF.bottom, rectF2.bottom) - Math.max(rectF.top, rectF2.top);
        if (min <= 0.0f || min2 <= 0.0f || rectF2.width() <= 0.0f || rectF2.height() <= 0.0f) {
            return 0.0f;
        }
        return Utilities.l(((min * min2) / (rectF2.height() * rectF2.width())) * 4.0f);
    }

    public static void o(hg5 hg5Var, int i) {
        if ((hg5Var.getTag() instanceof Integer) && ((Integer) hg5Var.getTag()).intValue() == i) {
            return;
        }
        hg5Var.setTag(Integer.valueOf(i));
        hg5Var.a = i;
        hg5Var.o(1.0f, 0.0f);
    }

    public static float u(float f, float f2, float f3) {
        float l = Utilities.l((f - f2) / (f3 - f2));
        return mlb.B(l, 2.0f, 3.0f, l * l);
    }

    public static String y(TL_stories.MediaAreaCoordinates mediaAreaCoordinates) {
        if (mediaAreaCoordinates == null) {
            return "";
        }
        return String.format(Locale.US, "%.2f,%.2f,%.2f,%.2f", Double.valueOf(mediaAreaCoordinates.x), Double.valueOf(mediaAreaCoordinates.y), Double.valueOf(mediaAreaCoordinates.w), Double.valueOf(mediaAreaCoordinates.rotation % 360.0d));
    }

    public final boolean A() {
        soc socVar = this.c;
        this.Z0 = socVar.getFrontFace().getWidth();
        float height = socVar.getFrontFace().getHeight();
        this.a1 = height;
        if (this.Z0 > 0.0f && height > 0.0f) {
            Matrix matrix = this.r;
            if (socVar.g(this, matrix) && matrix.invert(this.s)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final hg5 B(int i, boolean z) {
        float f;
        hg5 hg5Var = new hg5(getContext(), 3);
        hg5Var.p(true);
        if (z) {
            f = 15.0f;
        } else {
            f = 11.0f;
        }
        hg5Var.m(11.0f, 6.0f, f, 7.0f);
        hg5Var.j(z);
        hg5Var.L = Layout.Alignment.ALIGN_NORMAL;
        hg5Var.q(12.0f);
        hg5Var.d = -1L;
        String M0 = jb6.M0(i, null);
        hg5Var.h = hg5.a(M0, hg5Var.getTextPaint());
        hg5Var.t(M0);
        hg5Var.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        hg5Var.setTranslationZ(getTranslationZ() + 1.0f);
        ((ViewGroup) getParent()).addView(hg5Var, qoe.e(-1, 150, 48));
        return hg5Var;
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

    public final void E(lqc lqcVar) {
        float f;
        float f2;
        float f3;
        float f4;
        lqcVar.J = 0L;
        kqc kqcVar = lqcVar.h;
        kqc kqcVar2 = lqcVar.f;
        kqc kqcVar3 = lqcVar.e;
        if (lqcVar.a.equals(this.Q0)) {
            l();
        }
        if (lqcVar.b()) {
            float[] L = L(kqcVar3.a, kqcVar2.a);
            kqcVar3.a(L[0]);
            kqcVar2.a(L[1]);
        }
        lqcVar.H = (byte) 4;
        lqcVar.W = 0.0f;
        lqcVar.X = kqcVar3.a;
        lqcVar.Y = kqcVar2.a;
        lqcVar.Z = lqcVar.g.a * kqcVar.a;
        lqcVar.a0 = lqcVar.i.a;
        if (this.x0 > gm.L(650.0f)) {
            f = 0.32f;
        } else {
            f = 0.44f;
        }
        lqcVar.b0 = f;
        this.x0 = 0.0f;
        aqc j = j(lqcVar);
        if (j != null) {
            j.animate().cancel();
            j.o();
            f2 = j.getScaleX();
        } else {
            f2 = 1.0f;
        }
        lqcVar.c0 = f2;
        RectF Z = Z(lqcVar);
        if (Z != null) {
            float centerX = Z.centerX() - lqcVar.X;
            float centerY = Z.centerY() - lqcVar.Y;
            float hypot = (float) Math.hypot(centerX, centerY);
            if (hypot > gm.L(6.0f)) {
                f3 = centerX / hypot;
            } else {
                f3 = 0.0f;
            }
            lqcVar.U = f3;
            if (hypot > gm.L(6.0f)) {
                f4 = centerY / hypot;
            } else {
                f4 = 1.0f;
            }
            lqcVar.V = f4;
        }
        lqcVar.l.a(0.0f);
        kqcVar.a(1.0f);
        long j2 = this.O0 + 1;
        this.O0 = j2;
        lqcVar.I = j2;
        O();
        f0();
    }

    public final ArrayList G() {
        ArrayList arrayList = new ArrayList(this.f.values());
        List.EL.sort(arrayList, Comparator$CC.comparingLong(new te((byte) 5)));
        return arrayList;
    }

    public final void I(lqc lqcVar, float[] fArr, float[] fArr2, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        long j = lqcVar.J;
        kqc kqcVar = lqcVar.o;
        kqc kqcVar2 = lqcVar.n;
        if (j == 0) {
            long j2 = this.S0 + 1;
            this.S0 = j2;
            lqcVar.J = j2;
            ArrayList arrayList = new ArrayList();
            for (lqc lqcVar2 : this.f.values()) {
                if (lqcVar2 != lqcVar && lqcVar2.b()) {
                    arrayList.add(lqcVar2);
                }
            }
            if (arrayList.size() >= 10) {
                List.EL.sort(arrayList, Comparator$CC.comparingLong(new te((byte) 6)));
                for (int i = 0; i <= arrayList.size() - 10; i++) {
                    lqc lqcVar3 = (lqc) arrayList.get(i);
                    if (this.d.l()) {
                        E(lqcVar3);
                    } else {
                        V(lqcVar3);
                    }
                }
                k();
            }
        }
        lqcVar.H = (byte) 1;
        lqcVar.Q = false;
        lqcVar.M = false;
        lqcVar.L = false;
        lqcVar.P = z;
        lqcVar.O = z;
        long j3 = this.O0 + 1;
        this.O0 = j3;
        lqcVar.I = j3;
        kqcVar2.a(0.0f);
        kqcVar.a(0.0f);
        kqc kqcVar3 = lqcVar.e;
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
        kqcVar3.d = f;
        kqcVar3.e = f2;
        kqcVar3.a(fArr[0]);
        kqcVar3.b = fArr2[0];
        kqc kqcVar4 = lqcVar.f;
        if (z) {
            f5 = 150.0f;
        } else {
            f6 = 1.0f;
        }
        kqcVar4.d = f5;
        kqcVar4.e = f6;
        kqcVar4.a(fArr[1]);
        float f9 = fArr2[1];
        kqcVar4.b = f9;
        lqcVar.h.b = fArr2[2];
        kqc kqcVar5 = lqcVar.g;
        kqcVar5.d = 300.0f;
        kqcVar5.e = 0.5f;
        kqcVar5.b = 1.0f;
        kqc kqcVar6 = lqcVar.j;
        if (z) {
            f7 = 110.0f;
        }
        kqcVar6.d = f7;
        kqcVar6.e = 0.9f;
        kqcVar6.b = 0.0f;
        lqcVar.m.b = 1.0f;
        lqcVar.l.b = 0.0f;
        float f10 = fArr2[0] - fArr[0];
        float f11 = f9 - fArr[1];
        float max = Math.max(1.0f, (float) Math.hypot(f10, f11));
        if (max > gm.L(6.0f)) {
            f3 = f10 / max;
        } else {
            f3 = 0.0f;
        }
        lqcVar.U = f3;
        if (max > gm.L(6.0f)) {
            f4 = f11 / max;
        } else {
            f4 = 1.0f;
        }
        lqcVar.V = f4;
        kqc kqcVar7 = lqcVar.k;
        kqcVar7.a(0.9f);
        kqcVar7.b = 0.0f;
        if (z) {
            float min = Math.min(gm.L(110.0f), 0.32f * max);
            if (f10 >= 0.0f) {
                f8 = -1.0f;
            }
            kqcVar2.a(0.0f);
            kqcVar2.c = ((-f11) / max) * min * f8 * 20.0f;
            kqcVar.a(0.0f);
            kqcVar.c = mlb.B(min, 0.5f, (f10 / max) * min * f8, 20.0f);
        }
        O();
        f0();
    }

    public final void K(lqc lqcVar, TL_stories.MediaAreaCoordinates mediaAreaCoordinates, boolean z) {
        lqcVar.h.a((float) (mediaAreaCoordinates.w / 23.100000381469727d));
        lqcVar.i.a(c((float) mediaAreaCoordinates.rotation));
        lqcVar.N = z;
        lqcVar.e.a((((float) mediaAreaCoordinates.x) / 100.0f) * this.Z0);
        lqcVar.f.a((((float) mediaAreaCoordinates.y) / 100.0f) * this.a1);
        lqcVar.g.a(1.0f);
        lqcVar.j.a(0.0f);
        lqcVar.k.a(0.0f);
        lqcVar.n.a(0.0f);
        lqcVar.o.a(0.0f);
        lqcVar.l.a(0.0f);
        lqcVar.H = (byte) 2;
        long j = this.O0 + 1;
        this.O0 = j;
        lqcVar.I = j;
        lqcVar.m.a(1.0f);
        if (lqcVar.J == 0) {
            long j2 = this.S0 + 1;
            this.S0 = j2;
            lqcVar.J = j2;
        }
        if (lqcVar.a.equals(this.Q0)) {
            this.U0 = lqcVar;
            this.T0 = lqcVar;
            this.V0 = 1.0f;
            e();
        }
    }

    public final float[] L(float f, float f2) {
        float[] fArr = {f, f2};
        this.r.mapPoints(fArr);
        return fArr;
    }

    public final void M(lqc lqcVar, float f, float f2) {
        float A;
        kqc kqcVar = lqcVar.e;
        kqc kqcVar2 = lqcVar.h;
        float[] L = L(kqcVar.a, lqcVar.f.a);
        boolean z = false;
        float t = Utilities.t(f, f2, L[0], L[1]);
        if (Float.isNaN(this.F0)) {
            this.F0 = t;
            this.G0 = kqcVar2.b;
        }
        if (Math.abs(t - this.F0) > gm.L(5.0f)) {
            kqc kqcVar3 = lqcVar.q;
            kqcVar3.d = 700.0f;
            kqcVar3.e = 1.0f;
            kqcVar3.b = 1.0f;
        }
        float L2 = gm.L(32.0f) / U();
        boolean z2 = this.j0;
        float f3 = this.G0;
        float f4 = this.F0;
        if (z2) {
            A = (f3 * t) / Math.max(1.0f, f4);
        } else {
            A = td4.A(1.21f, L2, (t - f4) / gm.L(110.0f), f3);
        }
        kqcVar2.d = 900.0f;
        kqcVar2.e = 1.0f;
        kqcVar2.b = Math.max(L2, Math.min(1.21f, A));
        if (t < gm.L(14.0f)) {
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
        kqc kqcVar4 = lqcVar.i;
        kqcVar4.d = 900.0f;
        kqcVar4.e = 0.95f;
        if (z) {
            f5 = round;
        }
        kqcVar4.b = f5;
    }

    public final void O() {
        if (!this.b && this.Z0 > 0.0f && this.a1 > 0.0f) {
            SharedPreferences.Editor edit = this.e.edit();
            for (lqc lqcVar : this.f.values()) {
                boolean b = lqcVar.b();
                String str = lqcVar.a;
                if (b) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", lqcVar.e.b / this.Z0);
                        jSONObject.put("y", lqcVar.f.b / this.a1);
                        jSONObject.put("r", lqcVar.i.b);
                        jSONObject.put("s", lqcVar.h.b);
                        jSONObject.put("q", lqcVar.N);
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

    public final float P(lqc lqcVar) {
        return (((1.0f - (lqcVar.q.a * 0.9f)) * lqcVar.l.a * 0.04f) + 1.0f) * U() * lqcVar.g.a * lqcVar.h.a;
    }

    public final void Q() {
        if (!this.e1 || this.g1 != 0) {
            return;
        }
        if (!this.b1 && (this.q0 || !A())) {
            gm.d3(this.h1, 1000L);
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
            lqc lqcVar = (lqc) obj;
            boolean b = lqcVar.b();
            String str2 = lqcVar.a;
            if (b) {
                sb.append(str2);
                sb.append(':');
                sb.append(y(a0(lqcVar)));
                sb.append(';');
                if (str2.equals(this.Q0) && m(lqcVar)) {
                    str = str2;
                }
            }
        }
        if (b10.j(sb, "bg:", str).equals(this.d1)) {
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
            lqc lqcVar2 = (lqc) obj2;
            boolean b2 = lqcVar2.b();
            String str3 = lqcVar2.a;
            if (b2) {
                TL_wallet.inputWalletCardSticker inputwalletcardsticker = new TL_wallet.inputWalletCardSticker();
                inputwalletcardsticker.nft_address = str3;
                inputwalletcardsticker.coordinates = a0(lqcVar2);
                setcardstickers.stickers.add(inputwalletcardsticker);
                if (str3.equals(this.Q0) && m(lqcVar2)) {
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
            lqc lqcVar3 = (lqc) this.f.get(inputwalletcardsticker3.nft_address);
            if (lqcVar3 != null && lqcVar3.b != null) {
                TL_wallet.cardSticker cardsticker = new TL_wallet.cardSticker();
                cardsticker.nft = lqcVar3.b;
                cardsticker.coordinates = inputwalletcardsticker3.coordinates;
                cardVar2.stickers.add(cardsticker);
                if (inputwalletcardsticker3.nft_address.equals(setcardstickers.bg_nft_address)) {
                    cardVar2.bg_nft_item = lqcVar3.b;
                }
            }
        }
        e0(currentAccount, cardVar2);
        this.g1 = ConnectionsManager.getInstance(currentAccount).sendRequestTyped(setcardstickers, new kc((byte) 0), new ro1(this, currentAccount, cardVar, (byte) 5));
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

    public final void S(aqc aqcVar) {
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
        aqcVar.animate().cancel();
        aqcVar.n(aqcVar.getScaleX() * aqcVar.z0);
        aqcVar.setScaleX(1.0f);
        aqcVar.setScaleY(1.0f);
        aqcVar.m(1.0f, 150L, null);
        final lqc v = v(aqcVar.x0);
        String str = v.a;
        if (!b(v) && !v.b()) {
            this.t0 = false;
            return;
        }
        bu5 J = bu5.J(this.a, aqcVar);
        J.s = (short) 51;
        if (m(v) || str.equals(this.Q0)) {
            if (str.equals(this.Q0)) {
                i = 2131742785;
            } else {
                i = 2131742791;
            }
            J.b(2131232103, jb6.M0(i, null), new Runnable(this) {
                public final mqc b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    lqc lqcVar = v;
                    mqc mqcVar = this.b;
                    switch (b) {
                        case 0:
                            mqcVar.c0(lqcVar);
                            return;
                        default:
                            mqcVar.b0(lqcVar.b);
                            return;
                    }
                }
            }, false);
        }
        if (v.b()) {
            i2 = 2131742784;
        } else {
            i2 = 2131742792;
        }
        J.b(2131232388, jb6.M0(i2, null), new Runnable(this) {
            public final mqc b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                lqc lqcVar = v;
                mqc mqcVar = this.b;
                switch (b) {
                    case 0:
                        mqcVar.c0(lqcVar);
                        return;
                    default:
                        mqcVar.b0(lqcVar.b);
                        return;
                }
            }
        }, false);
        J.p = new cqc(this, (byte) 1);
        J.a0();
        performHapticFeedback(0);
    }

    public final float U() {
        return this.Z0 * 0.231f;
    }

    public final void V(lqc lqcVar) {
        if (lqcVar.a.equals(this.Q0)) {
            l();
        }
        lqcVar.N = false;
        g(lqcVar);
        aqc j = j(lqcVar);
        if (j != null) {
            j.setScaleX(0.93f);
            j.setScaleY(0.93f);
            j.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
        }
        performHapticFeedback(3);
        O();
        f0();
    }

    public final void W(lqc lqcVar, float f, float f2) {
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
            if (lqcVar == this.l1 && !z) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.j1 = z2;
            this.k1 = false;
            this.i1 = false;
            oc7.d1().edit().putBoolean("walletcardstickerhint", true).apply();
        }
        boolean z3 = lqcVar.N;
        kqc kqcVar = lqcVar.m;
        kqc kqcVar2 = lqcVar.f;
        kqc kqcVar3 = lqcVar.e;
        float f3 = 1.0f;
        if (z3) {
            lqcVar.N = false;
            kqc kqcVar4 = lqcVar.h;
            kqcVar4.d = 420.0f;
            kqcVar4.e = 0.8f;
            kqcVar4.b = 1.0f;
        }
        aqc j = j(lqcVar);
        if (j != null) {
            j.animate().scaleX(1.0f).scaleY(1.0f).setDuration(220L).start();
        }
        this.u0 = false;
        if (this.p0) {
            fArr = L(kqcVar3.a, kqcVar2.a);
        } else {
            RectF Z = Z(lqcVar);
            if (Z == null) {
                return;
            }
            float[] fArr2 = {Z.centerX(), Z.centerY()};
            kqc kqcVar5 = lqcVar.g;
            kqcVar5.d = 500.0f;
            kqcVar5.e = 0.75f;
            kqcVar5.a((f(lqcVar) * Z.width()) / U());
            kqcVar.a(0.0f);
            ((goc) this.d.c).S0(0L);
            fArr = fArr2;
        }
        kqcVar3.d = 1100.0f;
        kqcVar3.e = 0.9f;
        kqcVar3.a(fArr[0]);
        kqcVar2.d = 1100.0f;
        kqcVar2.e = 0.9f;
        kqcVar2.a(fArr[1]);
        lqcVar.H = (byte) 3;
        long j2 = this.O0 + 1;
        this.O0 = j2;
        lqcVar.I = j2;
        kqcVar.b = 1.0f;
        kqc kqcVar6 = lqcVar.j;
        kqcVar6.d = 320.0f;
        kqcVar6.e = 0.75f;
        kqcVar6.b = 1.0f;
        lqcVar.l.a(0.0f);
        this.A0 = fArr[0] - f;
        this.B0 = fArr[1] - f2;
        if (!this.p0) {
            f3 = 0.0f;
        }
        this.O.b = f3;
        performHapticFeedback(3);
    }

    public final void X(lqc lqcVar, boolean z) {
        this.T0 = this.U0;
        this.U0 = lqcVar;
        this.V0 = 0.0f;
        this.Y0 = z;
        if (lqcVar != null) {
            this.W0 = lqcVar.e.b / this.Z0;
            this.X0 = lqcVar.f.b / this.a1;
        }
        f0();
    }

    public final void Y(defpackage.t25 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqc.Y(t25):void");
    }

    public final RectF Z(lqc lqcVar) {
        aqc j = j(lqcVar);
        if (j != null && j.isShown()) {
            Matrix matrix = this.w;
            soc.k(j, matrix);
            Matrix matrix2 = this.x;
            soc.k(this, matrix2);
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

    public final TL_stories.TL_mediaAreaCoordinates a0(lqc lqcVar) {
        TL_stories.TL_mediaAreaCoordinates tL_mediaAreaCoordinates = new TL_stories.TL_mediaAreaCoordinates();
        float U = U() * lqcVar.h.b;
        tL_mediaAreaCoordinates.x = N((lqcVar.e.b / this.Z0) * 100.0f);
        tL_mediaAreaCoordinates.y = N((lqcVar.f.b / this.a1) * 100.0f);
        tL_mediaAreaCoordinates.w = N((U / this.Z0) * 100.0f);
        tL_mediaAreaCoordinates.h = N((U / this.a1) * 100.0f);
        float f = lqcVar.i.b % 360.0f;
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
        lqc v = v(nftitem);
        if (v.b()) {
            if (this.d.l()) {
                E(v);
            } else {
                V(v);
            }
        } else if (v.H == 0 && b(v)) {
            d0(v);
        }
        k();
    }

    public final void c0(lqc lqcVar) {
        String str = lqcVar.a;
        if (str.equals(this.Q0)) {
            l();
        } else if (m(lqcVar)) {
            this.Q0 = str;
            if (lqcVar.b()) {
                X(lqcVar, false);
                k();
            } else {
                this.R0 = str;
                d0(lqcVar);
                if (lqcVar.H == 0) {
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
        lqc lqcVar;
        lqc lqcVar2;
        byte b;
        this.c1 = cardVar;
        this.d1 = T(cardVar);
        if (!this.e1 && this.g1 == 0 && !this.q0) {
            TL_wallet.nftItem nftitem = cardVar.bg_nft_item;
            lqc lqcVar3 = null;
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
                    lqcVar3 = v(nftitem3);
                }
                this.T0 = lqcVar3;
                this.U0 = lqcVar3;
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
                    lqc lqcVar4 = (lqc) obj;
                    if (lqcVar4.K && (b = lqcVar4.H) != 3 && b != 4 && b != 5) {
                        TL_wallet.cardSticker R = R(lqcVar4.a);
                        if (R != null) {
                            if (!lqcVar4.b() || !y(a0(lqcVar4)).equals(y(R.coordinates))) {
                                K(lqcVar4, R.coordinates, lqcVar4.N);
                            }
                        } else if (lqcVar4.b()) {
                            E(lqcVar4);
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
                            lqcVar2 = null;
                        } else {
                            lqcVar2 = (lqc) linkedHashMap.get(nftitem4.address);
                        }
                        if (lqcVar2 != null && lqcVar2.H == 2) {
                            long j = this.O0 + 1;
                            this.O0 = j;
                            lqcVar2.I = j;
                        }
                    }
                }
                if (!equals) {
                    String str2 = this.Q0;
                    if (str2 == null) {
                        lqcVar = null;
                    } else {
                        lqcVar = (lqc) linkedHashMap.get(str2);
                    }
                    if (lqcVar != null && lqcVar.b()) {
                        X(lqcVar, false);
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

    public final void d0(lqc lqcVar) {
        ((goc) this.d.c).S0(2600L);
        if (A()) {
            float[] x = x(lqcVar, Float.NaN, Float.NaN, true);
            RectF Z = Z(lqcVar);
            if (x != null && Z != null) {
                lqcVar.g.a((f(lqcVar) * Z.width()) / U());
                lqcVar.m.a(0.0f);
                lqcVar.j.a(1.0f);
                float[] fArr = {Z.centerX(), Z.centerY()};
                this.s.mapPoints(fArr);
                I(lqcVar, fArr, x, true);
                performHapticFeedback(3);
                return;
            }
            aqc j = j(lqcVar);
            if (j != null) {
                j.animate().rotation(3.0f).setDuration(90L).withEndAction(new dqc(j, (byte) 0)).start();
            }
        }
    }

    public final void e() {
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2;
        float pow;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4;
        lqc lqcVar = this.T0;
        if (lqcVar == null) {
            stargiftattributebackdrop = null;
        } else {
            stargiftattributebackdrop = lqcVar.t;
        }
        float[] i = bqc.i(stargiftattributebackdrop);
        lqc lqcVar2 = this.U0;
        if (lqcVar2 == null) {
            stargiftattributebackdrop2 = null;
        } else {
            stargiftattributebackdrop2 = lqcVar2.t;
        }
        float[] i2 = bqc.i(stargiftattributebackdrop2);
        boolean z = this.Y0;
        float f = this.V0;
        float f2 = 1.0f;
        if (z) {
            pow = mlb.B(f, 2.0f, 3.0f, f * f);
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
        lqc lqcVar3 = this.T0;
        if (lqcVar3 == null) {
            stargiftattributebackdrop3 = null;
        } else {
            stargiftattributebackdrop3 = lqcVar3.t;
        }
        bqc.m(fArr, 0, stargiftattributebackdrop3);
        lqc lqcVar4 = this.U0;
        if (lqcVar4 == null) {
            stargiftattributebackdrop4 = null;
        } else {
            stargiftattributebackdrop4 = lqcVar4.t;
        }
        bqc.m(fArr, 1, stargiftattributebackdrop4);
        this.c.setStickerStyle(fArr);
    }

    public final float f(lqc lqcVar) {
        aqc j = j(lqcVar);
        if (j != null) {
            bf0 bf0Var = j.E;
            if (j.getWidth() > 0 && bf0Var.getWidth() > 0) {
                return ((bf0Var.getWidth() / j.getWidth()) * 288.0f) / 268.0f;
            }
            return 0.77f;
        }
        return 0.77f;
    }

    public final void f0() {
        if (!this.b1 && isAttachedToWindow()) {
            hqc hqcVar = this.F1;
            removeCallbacks(hqcVar);
            postOnAnimation(hqcVar);
        }
    }

    public final void g(lqc lqcVar) {
        lqcVar.H = (byte) 0;
        lqcVar.J = 0L;
        lqcVar.g.a(1.0f);
        lqcVar.h.a(1.0f);
        lqcVar.i.a(0.0f);
        lqcVar.m.a(0.0f);
        lqcVar.j.a(0.0f);
        lqcVar.k.a(0.0f);
        aqc j = j(lqcVar);
        if (j != null) {
            j.animate().cancel();
            j.setScaleX(1.0f);
            j.setScaleY(1.0f);
        }
    }

    public final float h() {
        return (getHeight() - gm.L(64.0f)) - gm.n;
    }

    public final void i(aqc aqcVar) {
        float f;
        ArrayList arrayList = this.h;
        if (!arrayList.contains(aqcVar)) {
            arrayList.add(aqcVar);
        }
        lqc v = v(aqcVar.x0);
        if (v.H == 0) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        aqcVar.k(v.R, false, f);
        f0();
    }

    public final aqc j(lqc lqcVar) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            aqc aqcVar = (aqc) obj;
            if (aqcVar.isAttachedToWindow() && aqcVar.x0.address.equals(lqcVar.a)) {
                return aqcVar;
            }
        }
        return null;
    }

    public final void k() {
        if (!this.b && !this.f1) {
            this.e1 = true;
            cqc cqcVar = this.h1;
            gm.r(cqcVar);
            gm.d3(cqcVar, 1500L);
        }
    }

    public final void l() {
        this.R0 = null;
        this.Q0 = null;
        X(null, true);
        O();
        k();
    }

    public final boolean m(lqc lqcVar) {
        if (b(lqcVar) && F(this.a.getCurrentAccount(), lqcVar.b.gift.slug)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.z1);
        getViewTreeObserver().addOnPreDrawListener(this.A1);
        for (lqc lqcVar : this.f.values()) {
            lqcVar.c.I();
            lqcVar.d.I();
        }
        f0();
    }

    @Override
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnScrollChangedListener(this.z1);
        getViewTreeObserver().removeOnPreDrawListener(this.A1);
        removeCallbacks(this.F1);
        removeCallbacks(this.B1);
        for (lqc lqcVar : this.f.values()) {
            lqcVar.c.K();
            lqcVar.d.K();
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
        lqc lqcVar;
        mqc mqcVar = this;
        Canvas canvas2 = canvas;
        if (mqcVar.A()) {
            float f8 = mqcVar.O.a;
            int i3 = (f8 > 0.01f ? 1 : (f8 == 0.01f ? 0 : -1));
            RectF rectF2 = mqcVar.I;
            ?? r10 = 0;
            Paint paint2 = mqcVar.y;
            if (i3 < 0) {
                f2 = 0.0f;
                i = 0;
                f = 0.4f;
                f3 = 2.0f;
                f4 = 0.6f;
            } else {
                float max = Math.max(0.0f, Math.min(1.2f, mqcVar.P.a));
                float l = Utilities.l(max);
                f = 0.4f;
                Paint paint3 = mqcVar.H;
                paint3.setTextSize(gm.L(15.0f));
                f2 = 0.0f;
                f3 = 2.0f;
                float measureText = (((paint3.measureText(jb6.M0(2131746054, null)) + gm.L(72.0f)) - gm.L(56.0f)) * max) + gm.L(56.0f);
                canvas2.save();
                f4 = 0.6f;
                canvas2.translate(mqcVar.getWidth() / 2.0f, ((1.0f - f8) * gm.L(90.0f)) + mqcVar.h());
                float f9 = (f8 * 0.4f) + 0.6f;
                canvas2.scale(f9, f9);
                int i4 = cmb.c6;
                d dVar = mqcVar.a;
                paint2.setColor(on2.f(l, cmb.v0(i4, dVar.getResourceProvider()), -1750963));
                paint2.setAlpha((int) (Utilities.l(f8) * 255.0f));
                float f10 = (-measureText) / 2.0f;
                float f11 = measureText / 2.0f;
                rectF2.set(f10, -gm.L(28.0f), f11, gm.L(28.0f));
                canvas2.drawRoundRect(rectF2, gm.L(28.0f), gm.L(28.0f), paint2);
                float L = (f10 + gm.L(30.0f)) * l;
                float L2 = gm.L(21.0f);
                int round = Math.round(mqcVar.d0.a);
                p09 p09Var = mqcVar.f0;
                p09Var.I(round, false, false);
                float f12 = L - L2;
                i = 0;
                float f13 = -L2;
                float f14 = L + L2;
                p09Var.setBounds((int) f12, (int) f13, (int) f14, (int) L2);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(on2.f(l, cmb.v0(cmb.F6, dVar.getResourceProvider()), -1), PorterDuff.Mode.SRC_IN);
                Paint paint4 = mqcVar.e0;
                paint4.setColorFilter(porterDuffColorFilter);
                paint4.setAlpha((int) (Utilities.l(f8) * 255.0f));
                canvas2 = canvas;
                int saveLayer = canvas2.saveLayer(f12, f13, f14, L2, paint4);
                p09Var.draw(canvas2);
                canvas2.restoreToCount(saveLayer);
                if (l > 0.02f) {
                    paint3.setColor(-1);
                    paint3.setAlpha((int) (Utilities.l((l - 0.4f) / 0.6f) * 255.0f));
                    Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
                    canvas2.save();
                    canvas2.clipRect(gm.L(22.0f) + L, -gm.L(28.0f), f11 - gm.L(16.0f), gm.L(28.0f));
                    canvas2.drawText(jb6.M0(2131746054, null), L + gm.L(22.0f), (-(fontMetrics.ascent + fontMetrics.descent)) / 2.0f, paint3);
                    canvas2.restore();
                }
                canvas2.restore();
                r10 = 0;
            }
            paint2.setShader(r10);
            paint2.setColorFilter(r10);
            paint2.setAlpha(255);
            ArrayList G = mqcVar.G();
            int size = G.size();
            int i5 = i;
            while (i5 < size) {
                int i6 = i5 + 1;
                lqc lqcVar2 = (lqc) G.get(i5);
                kqc kqcVar = lqcVar2.e;
                kqc kqcVar2 = lqcVar2.i;
                float f15 = kqcVar.a;
                float f16 = lqcVar2.f.a;
                float U = mqcVar.U() * lqcVar2.g.a * lqcVar2.h.a;
                float f17 = lqcVar2.j.a;
                byte b = lqcVar2.H;
                if (b == 1 && lqcVar2.O && f17 > 0.3f) {
                    float[] L3 = mqcVar.L(f15 + lqcVar2.n.a, f16 + lqcVar2.o.a);
                    float f18 = L3[i];
                    float f19 = L3[1];
                    U = mlb.A(f17, 0.15f, 1.0f, U);
                    f5 = f19;
                    f15 = f18;
                } else if (b == 3 || b == 4 || b == 5) {
                    f5 = f16;
                } else {
                    i5 = i6;
                }
                float f20 = U;
                Bitmap a = lqcVar2.a();
                if (a != null) {
                    if (f20 >= 1.0f) {
                        canvas2.save();
                        canvas2.rotate(kqcVar2.a, f15, f5);
                        Paint paint5 = paint2;
                        mqcVar.t(canvas2, lqcVar2, f15, (gm.L(5.0f) * f17) + gm.L(1.5f) + f5, mlb.A(f17, 0.04f, 1.0f, f20), f17, 0.0f, 1.0f);
                        canvas.restore();
                        float l2 = Utilities.l(lqcVar2.m.a);
                        if (lqcVar2.H == 4 && lqcVar2.W > f4 && mqcVar.j(lqcVar2) != null) {
                            float l3 = Utilities.l((lqcVar2.W - f4) / f);
                            float f21 = (1.0f - ((3.0f - (l3 * f3)) * (l3 * l3))) * 0.45f;
                            float l4 = (1.0f - (Utilities.l(-lqcVar2.V) * f4)) * 0.55f;
                            if (l2 < 1.0f) {
                                paint5.setAlpha((int) ((1.0f - l2) * 255.0f));
                                i2 = size;
                                paint = paint5;
                                f7 = f20;
                                arrayList = G;
                                rectF = rectF2;
                                f6 = f5;
                                lqcVar = lqcVar2;
                                mqcVar.r(canvas, lqcVar2.v, f15, f6, f7, f21, l4, kqcVar2.a, lqcVar2.U, lqcVar2.V);
                            } else {
                                f6 = f5;
                                i2 = size;
                                f7 = f20;
                                lqcVar = lqcVar2;
                                paint = paint5;
                                arrayList = G;
                                rectF = rectF2;
                            }
                            if (l2 > f2) {
                                paint.setAlpha((int) (l2 * 255.0f));
                                canvas2 = canvas;
                                r(canvas2, a, f15, f6, f7, f21, l4, kqcVar2.a, lqcVar.U, lqcVar.V);
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
                            canvas2.rotate(kqcVar2.a, f15, f22);
                            float f23 = f20 / f3;
                            rectF.set(f15 - f23, f22 - f23, f15 + f23, f23 + f22);
                            if (l2 < 1.0f) {
                                paint.setAlpha((int) ((1.0f - l2) * 255.0f));
                                rect = null;
                                canvas2.drawBitmap(lqcVar2.v, (Rect) null, rectF, paint);
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
                        mqcVar = this;
                    }
                } else {
                    mqcVar = this;
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
        gm.B2(this.x1);
        gm.B2(this.y1);
        this.y1 = null;
        this.x1 = null;
        O();
        gm.r(this.h1);
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
        for (lqc lqcVar : this.f.values()) {
            lqcVar.c.K();
            lqcVar.d.K();
        }
        this.h.clear();
    }

    public final void q(defpackage.lqc r12, float r13, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqc.q(lqc, float, float):void");
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
                    fArr[i5 + 1] = aq1.g(f22, f7, f21 * f8, f26, f2) - (f24 * 0.15f);
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

    public final void s(Canvas canvas, lqc lqcVar, float f, float f2, boolean z) {
        float f3;
        ImageReceiver imageReceiver = lqcVar.d;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = lqcVar.t;
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
                    float B = f * f11 * mlb.B(l, 2.0f, 3.0f, l * l);
                    if (i >= 0) {
                        float l2 = Utilities.l((f2 - Utilities.t(f9, f10, this.W0 * this.Z0, this.X0 * this.a1)) / gm.L(120.0f));
                        if (z) {
                            f12 = mlb.B(l2, 0.8f, 1.0f, f12);
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

    public final void t(Canvas canvas, lqc lqcVar, float f, float f2, float f3, float f4, float f5, float f6) {
        if (f6 > 0.01f && lqcVar.w != null) {
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
            float l = Utilities.l(lqcVar.m.a);
            paint.setAlpha((int) (l * Utilities.l((f5 * 0.12f) + (f4 * (-0.049999997f)) + 0.16f) * 255.0f * f6));
            canvas.drawBitmap(lqcVar.w, (Rect) null, rectF, paint);
            paint.setColor(-1);
            paint.setAlpha(alpha);
        }
    }

    public final lqc v(TL_wallet.nftItem nftitem) {
        String str = nftitem.address;
        LinkedHashMap linkedHashMap = this.f;
        lqc lqcVar = (lqc) linkedHashMap.get(str);
        if (lqcVar == null) {
            lqcVar = new lqc(this, nftitem);
            linkedHashMap.put(nftitem.address, lqcVar);
        }
        lqcVar.b = nftitem;
        return lqcVar;
    }

    public final void w(float r19, float r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqc.w(float, float, boolean):void");
    }

    public final float[] x(lqc lqcVar, float f, float f2, boolean z) {
        float f3;
        float f4;
        float f5;
        ArrayList arrayList;
        float nextFloat;
        if (!z) {
            lqcVar.N = false;
            return new float[]{f, f2, lqcVar.h.b};
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
        float L = gm.L(32.0f) / U();
        float f8 = lqcVar.h.b;
        lqcVar.N = false;
        ArrayList arrayList2 = new ArrayList();
        for (lqc lqcVar2 : this.f.values()) {
            if (lqcVar2 != lqcVar && lqcVar2.b()) {
                arrayList2.add(lqcVar2);
            }
        }
        boolean z2 = (Float.isNaN(f) || Float.isNaN(f2)) ? false : true;
        if (z2 || lqcVar != this.l1 || this.n1 == null || !arrayList2.isEmpty()) {
            if (z2) {
                f3 = f;
                f4 = f2;
            } else {
                f3 = this.Z0 * 0.6f;
                f4 = this.a1 * 0.68f;
            }
            Random random = new Random((System.nanoTime() / 400000000) + (arrayList2.size() * 31) + (lqcVar.a.hashCode() * 7919));
            float e = wi8.e(random, 0.04f, 0.05f);
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
                            lqc lqcVar3 = (lqc) obj;
                            min3 = Math.min(min3, (Utilities.t(f13, f11, lqcVar3.e.b, lqcVar3.f.b) / (U() * 0.29f)) - lqcVar3.h.b);
                        }
                        float l = ((Utilities.l((min - ((U() * f12) * min3)) / gm.L(14.0f)) * 0.1f) + 0.9f) * min3;
                        if (l < f16) {
                            arrayList = arrayList2;
                        } else {
                            if (arrayList2.isEmpty()) {
                                float f19 = this.Z0 * 0.6f;
                                float A = td4.A(f3, f19, 0.2f, f19);
                                float f20 = this.a1 * 0.68f;
                                nextFloat = (random.nextFloat() * gm.L(5.0f)) + (U() * 1.1f * l) + (Utilities.t(f13, f11, A, td4.A(f4, f20, 0.2f, f20)) * (-0.45f));
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
                                    lqc lqcVar4 = (lqc) obj2;
                                    float f26 = l;
                                    kqc kqcVar = lqcVar4.e;
                                    int i6 = size4;
                                    kqc kqcVar2 = lqcVar4.h;
                                    ArrayList arrayList5 = arrayList2;
                                    kqc kqcVar3 = lqcVar4.f;
                                    f24 = Math.min(f24, Utilities.t(f13, f11, kqcVar.b, kqcVar3.b) - ((kqcVar2.b + f26) * (U() * 0.4f)));
                                    float f27 = kqcVar2.b;
                                    float f28 = f27 * f27;
                                    float f29 = lqcVar4.e.b;
                                    f23 = (f29 * f28) + f23;
                                    f21 = (kqcVar3.b * f28) + f21;
                                    f22 += f28;
                                    f25 = Math.max(0.0f, 1.0f - (Math.abs(kqcVar3.b - f11) / (U() * 0.12f))) + Math.max(0.0f, 1.0f - (Math.abs(f29 - f13) / (U() * 0.12f))) + f25;
                                    l = f26;
                                    i4 = i5;
                                    size4 = i6;
                                    arrayList2 = arrayList5;
                                }
                                f5 = l;
                                arrayList = arrayList2;
                                nextFloat = ((random.nextFloat() * gm.L(10.0f)) + (((((Math.min(Math.min(min, f18), U()) * 0.2f) + ((U() * (f5 * 0.9f)) + ((f24 < 0.0f ? f24 * 2.5f : Math.min(f24, U() * 0.3f)) * 1.2f))) - (Utilities.t(f23 / f22, f21 / f22, nextFloat2, nextFloat3) * 0.35f)) - ((U() * f25) * 0.08f)) - (Utilities.t(f13, f11, this.Z0 * f12, this.a1 * 0.55f) * 0.04f))) - (z3 ? Utilities.t(f13, f11, f3, f4) * 0.04f : 0.0f);
                            }
                            if (nextFloat > f10) {
                                f10 = nextFloat;
                                fArr = new float[]{f13, f11, f5};
                            }
                        }
                        f13 += gm.L(5.0f);
                        e = f15;
                        L = f16;
                        f8 = f17;
                        stickerObstacles = arrayList4;
                        z2 = z3;
                        arrayList2 = arrayList;
                    }
                }
                f11 += gm.L(5.0f);
                f9 = f12;
                e = e;
            }
            return fArr;
        }
        return (float[]) this.n1.clone();
    }

    public final boolean z(aqc aqcVar) {
        if (aqcVar.isShown()) {
            Rect rect = this.I1;
            if (aqcVar.getGlobalVisibleRect(rect) && rect.width() >= aqcVar.getWidth() - 1 && rect.height() >= aqcVar.getHeight() - 1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
