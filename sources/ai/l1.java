package ai;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.widget.OverScroller;
import bi.v9;
import di.z2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.rc;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
public final class l1 extends View {
    public static int[] D9;
    public static int[] E9;
    public static int[] F9;
    public static String J9;
    public static g K9;
    public static volatile byte[] N9;
    public static int O9;
    public static int P9;
    public static int Q9;
    public boolean A0;
    public final Paint A1;
    public int A2;
    public int[] A3;
    public final float A4;
    public final boolean[] A5;
    public boolean A6;
    public final LinearGradient A7;
    public long A8;
    public final Rect[] A9;
    public float B0;
    public final Paint B1;
    public boolean B2;
    public final Paint B3;
    public final Paint B4;
    public int B5;
    public int B6;
    public final Paint B7;
    public float B8;
    public float C0;
    public final TextPaint C1;
    public float C2;
    public final RectF C3;
    public final Paint C4;
    public final LinearGradient C5;
    public final SweepGradient[] C6;
    public final Matrix C7;
    public float C8;
    public final long D;
    public float D0;
    public final TextPaint D1;
    public float D2;
    public boolean D3;
    public final RectF D4;
    public final Paint D5;
    public float D6;
    public final RectF[] D7;
    public float D8;
    public final Matrix E;
    public long E0;
    public final Path E1;
    public float E2;
    public float E3;
    public final float[] E4;
    public final Path E5;
    public float E6;
    public float E7;
    public float E8;
    public i1 F;
    public boolean F0;
    public final RectF F1;
    public long F2;
    public float F3;
    public final float[] F4;
    public final TextPaint F5;
    public float F6;
    public float F7;
    public float F8;
    public i1 G;
    public float G0;
    public Object G1;
    public long G2;
    public float G3;
    public final float[] G4;
    public Drawable G5;
    public float G6;
    public boolean G7;
    public float G8;
    public long H;
    public final TextPaint H0;
    public Object H1;
    public boolean H2;
    public float H3;
    public final float[] H4;
    public StaticLayout H5;
    public float H6;
    public int H7;
    public float H8;
    public final ArrayList I;
    public String I0;
    public int I1;
    public long I2;
    public float I3;
    public final float[] I4;
    public int I5;
    public float I6;
    public final RectF I7;
    public final Path I8;
    public final HashMap J;
    public String J0;
    public final Drawable J1;
    public float J2;
    public float J3;
    public final long[] J4;
    public final RectF J5;
    public float J6;
    public final HashMap J7;
    public final RectF J8;
    public float K;
    public boolean K0;
    public final Drawable K1;
    public float K2;
    public float K3;
    public int K4;
    public final RectF K5;
    public float K6;
    public final HashMap K7;
    public final RectF K8;
    public float L;
    public final i6 L0;
    public final Drawable L1;
    public float L2;
    public final h1 L3;
    public float L4;
    public final Path L5;
    public boolean L6;
    public int L7;
    public final RectF L8;
    public float M;
    public final float[] M0;
    public final Drawable M1;
    public long M2;
    public float M3;
    public float M4;
    public final float[] M5;
    public long M6;
    public int M7;
    public long M8;
    public float N;
    public final float[] N0;
    public final Drawable N1;
    public long N2;
    public float N3;
    public final Paint N4;
    public float N5;
    public SensorManager N6;
    public float N7;
    public boolean N8;
    public float O;
    public final float[] O0;
    public final Drawable O1;
    public String O2;
    public float O3;
    public final Paint O4;
    public final Matrix O5;
    public final g1 O6;
    public float O7;
    public Bitmap O8;
    public float P;
    public final float[] P0;
    public final Drawable P1;
    public float P2;
    public float P3;
    public final RectF P4;
    public final Matrix P5;
    public float P6;
    public int P7;
    public Bitmap P8;
    public float Q;
    public final float[] Q0;
    public final Drawable Q1;
    public long Q2;
    public float Q3;
    public float Q4;
    public final LinearGradient Q5;
    public float Q6;
    public int Q7;
    public final Paint Q8;
    public boolean R;
    public final float[] R0;
    public final Drawable R1;
    public Bitmap R2;
    public final Path R3;
    public float R4;
    public final LongSparseArray R5;
    public float R6;
    public long R7;
    public final Paint R8;
    public boolean S;
    public final float[] S0;
    public final Drawable S1;
    public final Paint S2;
    public Bitmap S3;
    public boolean S4;
    public final Path S5;
    public float S6;
    public long S7;
    public final RectF S8;
    public boolean T;
    public final float[] T0;
    public final m1 T1;
    public boolean T2;
    public Bitmap T3;
    public boolean T4;
    public boolean T5;
    public long T6;
    public long T7;
    public int T8;
    public boolean U;
    public final float[] U0;
    public final Paint U1;
    public int U2;
    public float U3;
    public float U4;
    public final RectF U5;
    public long U6;
    public final float U7;
    public String U8;
    public long V;
    public final float[] V0;
    public final String V1;
    public boolean V2;
    public float V3;
    public boolean V4;
    public final RectF V5;
    public boolean V6;
    public int V7;
    public boolean V8;
    public long W;
    public final float[] W0;
    public final y1 W1;
    public long W2;
    public float W3;
    public Bitmap W4;
    public final RectF W5;
    public final Matrix W6;
    public long W7;
    public int W8;
    public final float[] X0;
    public final zg0 X1;
    public float X2;
    public final Paint X3;
    public int[] X4;
    public final LinearGradient X5;
    public final Path X6;
    public long X7;
    public long X8;
    public final float[] Y0;
    public final Paint Y1;
    public Bitmap Y2;
    public final int[] Y3;
    public int Y4;
    public final LinearGradient Y5;
    public final RectF Y6;
    public float Y7;
    public zg0 Y8;
    public final float[] Z0;
    public boolean Z1;
    public Bitmap Z2;
    public final int[] Z3;
    public final Paint Z4;
    public final Matrix Z5;
    public final Path Z6;
    public final RectF Z7;
    public zg0 Z8;
    public boolean f1317a;
    public float f1318a0;
    public final byte[] f1319a1;
    public int f1320a2;
    public BitmapShader f1321a3;
    public final float[] f1322a4;
    public final Rect f1323a5;
    public final Paint f1324a6;
    public final Path f1325a7;
    public final TextPaint f1326a8;
    public zg0 f1327a9;
    public final int f1328b;
    public float f1329b0;
    public final boolean[] f1330b1;
    public int f1331b2;
    public final Paint f1332b3;
    public final float[] f1333b4;
    public final RectF f1334b5;
    public float f1335b6;
    public int f1336b7;
    public final TextPaint f1337b8;
    public Object f1338b9;
    public final cb.c f1339c;
    public float f1340c0;
    public int f1341c1;
    public final HashMap f1342c2;
    public final Paint f1343c3;
    public final float[] f1344c4;
    public final int[] f1345c5;
    public long f1346c6;
    public final RectF f1347c7;
    public final TextPaint f1348c8;
    public float f1349c9;
    public String d;
    public float f1350d0;
    public boolean f1351d1;
    public Runnable d2;
    public final Matrix f1352d3;
    public final float[] f1353d4;
    public final float[] f1354d5;
    public long f1355d6;
    public final Matrix f1356d7;
    public TextPaint f1357d8;
    public String f1358d9;
    public String f1359e;
    public float f1360e0;
    public final Random f1361e1;
    public boolean f1362e2;
    public final RectF f1363e3;
    public int f1364e4;
    public final float[] f1365e5;
    public boolean f1366e6;
    public final SparseArray f1367e7;
    public final TextPaint f1368e8;
    public long f1369e9;
    public String f1370f;
    public float f1371f0;
    public float f1372f1;
    public boolean f1373f2;
    public float f1374f3;
    public float[] f1375f4;
    public final float[] f1376f5;
    public boolean f1377f6;
    public final Drawable[] f1378f7;
    public StaticLayout f1379f8;
    public float f1380f9;
    public float f1381g0;
    public float f1382g1;
    public Bitmap f1383g2;
    public boolean f1384g3;
    public float[] f1385g4;
    public final float[] f1386g5;
    public int f1387g6;
    public final RectF f1388g7;
    public int f1389g8;
    public boolean f1390g9;
    public boolean h;
    public float f1391h0;
    public int f1392h1;
    public final int[] f1393h2;
    public boolean f1394h3;
    public float[] f1395h4;
    public final float[] f1396h5;
    public int f1397h6;
    public final RectF h7;
    public boolean f1398h8;
    public float f1399h9;
    public float f1400i0;
    public float f1401i1;
    public v9 f1402i2;
    public int f1403i3;
    public int f1404i4;
    public final boolean[] f1405i5;
    public int f1406i6;
    public final RectF i7;
    public final String f1407i8;
    public float f1408i9;
    public float f1409j0;
    public float f1410j1;
    public final c1 f1411j2;
    public final float[] j3;
    public int f1412j4;
    public int f1413j5;
    public float f1414j6;
    public final RectF f1415j7;
    public final String f1416j8;
    public float f1417j9;
    public VelocityTracker f1418k0;
    public float f1419k1;
    public final d1 f1420k2;
    public final float[] f1421k3;
    public PorterDuffColorFilter f1422k4;
    public float f1423k5;
    public float f1424k6;
    public final RectF f1425k7;
    public i5 f1426k8;
    public final OverScroller f1427k9;
    public float f1428l0;
    public float l1;
    public boolean f1429l2;
    public final int[] f1430l3;
    public int f1431l4;
    public float f1432l5;
    public float f1433l6;
    public boolean f1434l7;
    public zg0 f1435l8;
    public final ViewConfiguration f1436l9;
    public float m0;
    public String f1437m1;
    public long f1438m2;
    public final int[] f1439m3;
    public float f1440m4;
    public StaticLayout f1441m5;
    public float f1442m6;
    public boolean f1443m7;
    public long f1444m8;
    public VelocityTracker f1445m9;
    public j1 f1446n;
    public float f1447n0;
    public int n1;
    public long f1448n2;
    public final float[] f1449n3;
    public float f1450n4;
    public boolean f1451n5;
    public final float[] f1452n6;
    public float f1453n7;
    public boolean f1454n8;
    public boolean f1455n9;
    public float f1456o0;
    public String f1457o1;
    public long f1458o2;
    public final float[] f1459o3;
    public float o4;
    public final float[] f1460o5;
    public final Paint f1461o6;
    public float f1462o7;
    public TLRPC.TL_inputStickerSetShortName f1463o8;
    public boolean f1464o9;
    public float f1465p0;
    public String f1466p1;
    public float f1467p2;
    public float f1468p3;
    public float f1469p4;
    public final float[] f1470p5;
    public float f1471p6;
    public long f1472p7;
    public TLRPC.Document f1473p8;
    public final d1 f1474p9;
    public int f1475q0;
    public final RectF f1476q1;
    public long f1477q2;
    public final double[] f1478q3;
    public float f1479q4;
    public final float[] f1480q5;
    public boolean f1481q6;
    public boolean f1482q7;
    public long f1483q8;
    public final RippleDrawable[] f1484q9;
    public j1 f1485r;
    public long f1486r0;
    public boolean f1487r1;
    public final RectF f1488r2;
    public final double[] f1489r3;
    public float f1490r4;
    public final float[] f1491r5;
    public float f1492r6;
    public float f1493r7;
    public LinearGradient[] f1494r8;
    public int f1495r9;
    public float f1496s;
    public final h f1497s0;
    public float f1498s1;
    public boolean f1499s2;
    public final double[] f1500s3;
    public final long[] f1501s4;
    public final float[] s5;
    public boolean f1502s6;
    public float f1503s7;
    public int[] f1504s8;
    public final Paint s9;
    public g f1505t0;
    public float f1506t1;
    public float f1507t2;
    public int f1508t3;
    public final float[] f1509t4;
    public final float[] f1510t5;
    public Object t6;
    public long f1511t7;
    public final n1 f1512t8;
    public final Path f1513t9;
    public g f1514u0;
    public long f1515u1;
    public String f1516u2;
    public int f1517u3;
    public final float[] f1518u4;
    public final float[] f1519u5;
    public float f1520u6;
    public final RectF f1521u7;
    public int f1522u8;
    public final float[] f1523u9;
    public boolean f1524v0;
    public final ArrayList f1525v1;
    public String f1526v2;
    public float f1527v3;
    public final float[] f1528v4;
    public final float[] f1529v5;
    public int f1530v6;
    public long f1531v7;
    public int f1532v8;
    public final float[] f1533v9;
    public long f1534w;
    public boolean f1535w0;
    public long f1536w1;
    public String f1537w2;
    public float f1538w3;
    public final float[] f1539w4;
    public final float[] f1540w5;
    public int f1541w6;
    public float f1542w7;
    public float f1543w8;
    public final long[] f1544w9;
    public float f1545x;
    public boolean f1546x0;
    public boolean f1547x1;
    public String f1548x2;
    public float f1549x3;
    public final long[] f1550x4;
    public final float[] f1551x5;
    public final SparseIntArray f1552x6;
    public float f1553x7;
    public float f1554x8;
    public final long[] f1555x9;
    public float f1556y;
    public boolean f1557y0;
    public final HashMap f1558y1;
    public final TextPaint f1559y2;
    public boolean f1560y3;
    public final boolean[] f1561y4;
    public final float[] f1562y5;
    public int f1563y6;
    public float f1564y7;
    public final RectF[] f1565y8;
    public final float[] f1566y9;
    public long f1567z0;
    public final Paint f1568z1;
    public String f1569z2;
    public Bitmap f1570z3;
    public final Paint f1571z4;
    public final float[] f1572z5;
    public boolean f1573z6;
    public final RectF f1574z7;
    public long f1575z8;
    public final float[] z9;
    public static final String[] B9 = {"❤️", "🔥", "🎉", "😎", "🚀", "💎", "💙", "✨", "⭐", "🍀", "🐸", "🦄", "🌈", "🍕", "👻", "🍒", "🌸", "⚡", "🏆", "🎁", "👀", "😍", "🥳", "🤩", "🐱", "🐶", "🦋", "🌙", "☀️", "🍓", "🍩", "🎈", "🎮", "🎧", "💜", "🌊"};
    public static final float C9 = (float) Math.atan2(-5.5d, -3.5d);
    public static int G9 = a.b("Black");
    public static int H9 = a.b("Neon Blue");
    public static final int I9 = org.telegram.messenger.g0.L(70.0f);
    public static final float L9 = (float) Math.sin(Math.toRadians(18.0d));
    public static final float M9 = (float) Math.cos(Math.toRadians(18.0d));
    public static final xq R9 = new xq(0.16d, 1.0d, 0.3d, 1.0d);

    public l1(Context context, int i7, String str, String str2, boolean z9, cb.c cVar) {
        super(context);
        g gVar;
        this.f1317a = true;
        this.f1496s = 1.0f;
        this.D = AnimationUtils.currentAnimationTimeMillis();
        this.E = new Matrix();
        this.F = new i1();
        this.I = new ArrayList();
        this.J = new HashMap();
        Paint paint = new Paint(3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.M = -1.0f;
        this.f1497s0 = new h();
        this.f1535w0 = true;
        this.f1546x0 = true;
        this.D0 = 0.0f;
        this.G0 = 1.0f;
        this.H0 = new TextPaint(1);
        this.I0 = "";
        this.J0 = "";
        this.M0 = new float[320];
        this.N0 = new float[320];
        this.O0 = new float[320];
        this.P0 = new float[320];
        this.Q0 = new float[320];
        this.R0 = new float[320];
        this.S0 = new float[320];
        this.T0 = new float[320];
        this.U0 = new float[320];
        this.V0 = new float[320];
        this.W0 = new float[320];
        this.X0 = new float[320];
        this.Y0 = new float[320];
        this.Z0 = new float[320];
        this.f1319a1 = new byte[320];
        this.f1330b1 = new boolean[320];
        this.f1361e1 = new Random();
        this.f1392h1 = 0;
        this.f1476q1 = new RectF();
        this.f1525v1 = new ArrayList();
        this.f1558y1 = new HashMap();
        this.f1568z1 = new Paint(1);
        this.A1 = new Paint(1);
        this.B1 = new Paint(1);
        this.C1 = new TextPaint(1);
        this.D1 = new TextPaint(1);
        this.E1 = new Path();
        new Path();
        this.F1 = new RectF();
        this.I1 = -1;
        this.U1 = new Paint(1);
        this.V1 = hd.M0(2131746469, null);
        this.Y1 = new Paint(1);
        this.f1320a2 = 1;
        this.f1342c2 = new HashMap();
        this.f1393h2 = new int[3];
        this.f1411j2 = new ls() {
            @Override
            public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                if (objArr.length > 1) {
                    Object obj = objArr[1];
                    l1 l1Var = l1.this;
                    if (obj == l1Var.f1402i2) {
                        l1Var.y0();
                    }
                }
            }
        };
        this.f1420k2 = new Runnable(this) {
            public final l1 f1160b;

            {
                this.f1160b = this;
            }

            @Override
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int L;
                switch (r2) {
                    case 0:
                        l1 l1Var = this.f1160b;
                        ArrayList arrayList = l1Var.f1525v1;
                        for (int i10 = 0; i10 < Math.min(arrayList.size(), 9); i10++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i10);
                            ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
                            int size = arrayList2.size();
                            int i11 = 0;
                            while (i11 < size) {
                                TL_stars.StarGiftAttribute starGiftAttribute = arrayList2.get(i11);
                                i11++;
                                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                                if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                                    l1Var.g0(tL_starGiftUnique.f27181id, document);
                                }
                            }
                            l1Var.m1(tL_starGiftUnique);
                        }
                        return;
                    default:
                        l1 l1Var2 = this.f1160b;
                        ArrayList arrayList3 = l1Var2.I;
                        if (l1Var2.f1372f1 >= 0.5f && l1Var2.f1392h1 == 1 && !l1Var2.f1464o9) {
                            float f10 = l1Var2.f1399h9;
                            float f11 = l1Var2.f1408i9;
                            float width = (l1Var2.getWidth() - org.telegram.messenger.g0.L(28.0f)) / 6.0f;
                            RectF rectF = l1Var2.f1521u7;
                            float L2 = (l1Var2.f1410j1 + f11) - (rectF.top + org.telegram.messenger.g0.L(16.0f));
                            int i12 = -1;
                            if (L2 >= 0.0f && f10 >= org.telegram.messenger.g0.L(14.0f) && f11 >= rectF.top + org.telegram.messenger.g0.L(8.0f) && (L = (((int) (L2 / width)) * 6) + ((int) ((f10 - org.telegram.messenger.g0.L(14.0f)) / width))) >= 0 && L < 36) {
                                i12 = L;
                            }
                            if (i12 >= 0) {
                                String[] strArr = l1.B9;
                                if (arrayList3.contains(strArr[i12]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i12])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    l1Var2.c();
                                    l1Var2.i0();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f1467p2 = 1.0f;
        this.f1488r2 = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f1559y2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.A2 = -1;
        this.E2 = -1.0f;
        this.L2 = -1.0f;
        this.N2 = -1L;
        this.O2 = "";
        this.P2 = -1.0f;
        this.S2 = new Paint(3);
        this.X2 = 1.0f;
        this.f1332b3 = new Paint(2);
        this.f1343c3 = new Paint(3);
        this.f1352d3 = new Matrix();
        this.f1363e3 = new RectF();
        this.j3 = new float[14];
        this.f1421k3 = new float[14];
        this.f1430l3 = new int[7];
        this.f1439m3 = new int[7];
        this.f1449n3 = new float[15];
        this.f1459o3 = new float[15];
        this.f1468p3 = -1.0f;
        this.f1478q3 = new double[3];
        this.f1489r3 = new double[3];
        this.f1500s3 = new double[3];
        this.f1508t3 = org.telegram.messenger.g0.f22531m;
        this.f1517u3 = org.telegram.messenger.g0.f22532n;
        this.B3 = new Paint(2);
        this.C3 = new RectF();
        this.G3 = 5.0f;
        this.H3 = -0.7071f;
        this.I3 = 0.7071f;
        this.L3 = new h1();
        this.N3 = 1.0f;
        this.P3 = -1.0f;
        this.R3 = new Path();
        this.U3 = -1.0f;
        this.V3 = -1.0f;
        this.W3 = -1.0f;
        Paint paint2 = new Paint(2);
        this.X3 = paint2;
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode2));
        this.Y3 = new int[1024];
        this.Z3 = new int[1024];
        this.f1322a4 = new float[1024];
        this.f1333b4 = new float[1024];
        this.f1344c4 = new float[1024];
        this.f1353d4 = new float[1024];
        this.f1412j4 = -1;
        this.f1431l4 = -1;
        this.f1501s4 = new long[2048];
        this.f1509t4 = new float[2048];
        this.f1518u4 = new float[2048];
        this.f1528v4 = new float[2048];
        this.f1539w4 = new float[2048];
        this.f1550x4 = new long[2048];
        this.f1561y4 = new boolean[2048];
        Paint paint3 = new Paint(2);
        this.f1571z4 = paint3;
        paint3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.A4 = (float) Math.random();
        this.B4 = new Paint(2);
        this.C4 = new Paint(2);
        this.D4 = new RectF();
        this.E4 = new float[96];
        this.F4 = new float[96];
        this.G4 = new float[96];
        this.H4 = new float[96];
        this.I4 = new float[96];
        this.J4 = new long[96];
        this.N4 = new Paint(2);
        Paint paint4 = new Paint(2);
        this.O4 = paint4;
        paint4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.P4 = new RectF();
        this.Q4 = 1.0f;
        this.R4 = 1.0f;
        this.T4 = true;
        this.U4 = 1.0f;
        this.Z4 = new Paint(2);
        this.f1323a5 = new Rect();
        this.f1334b5 = new RectF();
        this.f1345c5 = new int[4];
        this.f1354d5 = new float[4];
        this.f1365e5 = new float[4];
        this.f1376f5 = new float[240];
        this.f1386g5 = new float[240];
        this.f1396h5 = new float[240];
        this.f1405i5 = new boolean[240];
        this.f1460o5 = new float[240];
        this.f1470p5 = new float[240];
        this.f1480q5 = new float[240];
        this.f1491r5 = new float[240];
        this.s5 = new float[240];
        this.f1510t5 = new float[240];
        this.f1519u5 = new float[240];
        this.f1529v5 = new float[240];
        this.f1540w5 = new float[240];
        this.f1551x5 = new float[240];
        this.f1562y5 = new float[240];
        this.f1572z5 = new float[240];
        this.A5 = new boolean[240];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, tileMode);
        this.C5 = linearGradient;
        Paint paint5 = new Paint(1);
        this.D5 = paint5;
        paint5.setShader(linearGradient);
        paint5.setXfermode(new PorterDuffXfermode(mode2));
        this.E5 = new Path();
        this.F5 = new TextPaint(65);
        this.J5 = new RectF();
        this.K5 = new RectF();
        this.L5 = new Path();
        this.M5 = new float[7];
        this.O5 = new Matrix();
        this.P5 = new Matrix();
        this.Q5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, new float[]{0.0f, 0.88f, 1.0f}, tileMode);
        this.R5 = new LongSparseArray();
        this.S5 = new Path();
        this.U5 = new RectF();
        this.V5 = new RectF();
        this.W5 = new RectF();
        this.X5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 16777215, -1, tileMode);
        this.Y5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, tileMode);
        this.Z5 = new Matrix();
        this.f1324a6 = new Paint();
        this.f1433l6 = 0.85f;
        this.f1452n6 = new float[320];
        Paint paint6 = new Paint();
        this.f1461o6 = paint6;
        PorterDuff.Mode mode3 = PorterDuff.Mode.DST_IN;
        paint6.setXfermode(new PorterDuffXfermode(mode3));
        this.f1471p6 = 1.0f;
        this.f1481q6 = true;
        this.f1520u6 = -1.0f;
        this.f1530v6 = -1;
        this.f1552x6 = new SparseIntArray();
        this.f1563y6 = -1;
        this.B6 = -1;
        this.C6 = new SweepGradient[4];
        this.O6 = new g1(this);
        this.W6 = new Matrix();
        this.X6 = new Path();
        this.Y6 = new RectF();
        this.Z6 = new Path();
        this.f1325a7 = new Path();
        this.f1336b7 = -1;
        this.f1347c7 = new RectF();
        this.f1356d7 = new Matrix();
        this.f1367e7 = new SparseArray();
        this.f1388g7 = new RectF();
        this.h7 = new RectF();
        this.i7 = new RectF();
        this.f1415j7 = new RectF();
        this.f1425k7 = new RectF();
        this.f1453n7 = 1.0f;
        this.f1462o7 = 1.0f;
        this.f1493r7 = 1.0f;
        this.f1503s7 = 1.0f;
        this.f1521u7 = new RectF();
        this.f1574z7 = new RectF();
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{0, 805306368, -1627389952, -285212672, -16777216}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f}, tileMode);
        this.A7 = linearGradient2;
        Paint paint7 = new Paint();
        this.B7 = paint7;
        paint7.setXfermode(new PorterDuffXfermode(mode3));
        paint7.setShader(linearGradient2);
        this.C7 = new Matrix();
        this.D7 = new RectF[]{new RectF(), new RectF(), new RectF(), new RectF(), new RectF(), new RectF()};
        this.E7 = -1.0f;
        this.F7 = -1.0f;
        this.I7 = new RectF();
        this.J7 = new HashMap();
        this.K7 = new HashMap();
        this.L7 = -1;
        this.M7 = G9;
        this.P7 = -1;
        this.Q7 = -1;
        this.U7 = org.telegram.messenger.g0.L(20.17f);
        this.V7 = -1;
        this.X7 = -1L;
        this.Y7 = 1.0f;
        this.Z7 = new RectF();
        this.f1326a8 = new TextPaint(1);
        this.f1337b8 = new TextPaint(1);
        this.f1348c8 = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(129);
        this.f1368e8 = textPaint2;
        textPaint2.setXfermode(new PorterDuffXfermode(mode2));
        this.f1407i8 = hd.M0(2131746491, null);
        this.f1416j8 = hd.M0(2131746501, null);
        int[] iArr = a.f1115b;
        this.f1494r8 = new LinearGradient[iArr.length];
        this.f1504s8 = new int[iArr.length];
        this.f1512t8 = new n1(0);
        this.f1522u8 = -100;
        this.f1532v8 = -100;
        this.f1565y8 = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.I8 = new Path();
        this.J8 = new RectF();
        this.K8 = new RectF();
        this.L8 = new RectF();
        this.Q8 = new Paint(3);
        this.R8 = new Paint(1);
        this.S8 = new RectF();
        this.f1349c9 = -1.0f;
        this.f1427k9 = new OverScroller(getContext());
        this.f1436l9 = ViewConfiguration.get(getContext());
        this.f1474p9 = new Runnable(this) {
            public final l1 f1160b;

            {
                this.f1160b = this;
            }

            @Override
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int L;
                switch (r2) {
                    case 0:
                        l1 l1Var = this.f1160b;
                        ArrayList arrayList = l1Var.f1525v1;
                        for (int i10 = 0; i10 < Math.min(arrayList.size(), 9); i10++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i10);
                            ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
                            int size = arrayList2.size();
                            int i11 = 0;
                            while (i11 < size) {
                                TL_stars.StarGiftAttribute starGiftAttribute = arrayList2.get(i11);
                                i11++;
                                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                                if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                                    l1Var.g0(tL_starGiftUnique.f27181id, document);
                                }
                            }
                            l1Var.m1(tL_starGiftUnique);
                        }
                        return;
                    default:
                        l1 l1Var2 = this.f1160b;
                        ArrayList arrayList3 = l1Var2.I;
                        if (l1Var2.f1372f1 >= 0.5f && l1Var2.f1392h1 == 1 && !l1Var2.f1464o9) {
                            float f10 = l1Var2.f1399h9;
                            float f11 = l1Var2.f1408i9;
                            float width = (l1Var2.getWidth() - org.telegram.messenger.g0.L(28.0f)) / 6.0f;
                            RectF rectF = l1Var2.f1521u7;
                            float L2 = (l1Var2.f1410j1 + f11) - (rectF.top + org.telegram.messenger.g0.L(16.0f));
                            int i12 = -1;
                            if (L2 >= 0.0f && f10 >= org.telegram.messenger.g0.L(14.0f) && f11 >= rectF.top + org.telegram.messenger.g0.L(8.0f) && (L = (((int) (L2 / width)) * 6) + ((int) ((f10 - org.telegram.messenger.g0.L(14.0f)) / width))) >= 0 && L < 36) {
                                i12 = L;
                            }
                            if (i12 >= 0) {
                                String[] strArr = l1.B9;
                                if (arrayList3.contains(strArr[i12]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i12])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    l1Var2.c();
                                    l1Var2.i0();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f1484q9 = new RippleDrawable[12];
        ColorStateList.valueOf(738197503);
        ColorStateList.valueOf(335544320);
        this.f1495r9 = -1;
        this.s9 = new Paint(1);
        this.f1513t9 = new Path();
        this.f1523u9 = new float[12];
        this.f1533v9 = new float[12];
        this.f1544w9 = new long[12];
        this.f1555x9 = new long[12];
        this.f1566y9 = new float[12];
        this.z9 = new float[12];
        this.A9 = new Rect[12];
        for (int i10 = 0; i10 < 12; i10++) {
            this.A9[i10] = new Rect();
        }
        this.f1328b = i7;
        this.d = str;
        this.f1370f = str2;
        this.h = z9;
        this.f1339c = cVar;
        this.L1 = w(2131232363);
        this.M1 = w(2131232114);
        this.N1 = w(2131232319);
        this.U1.setTypeface(org.telegram.messenger.g0.o());
        Drawable w10 = w(2131232097);
        this.O1 = w10;
        Drawable w11 = w(2131231512);
        this.P1 = w11;
        Drawable w12 = w(2131231827);
        this.Q1 = w12;
        this.W1 = new y1(true);
        this.R1 = w(2131232342);
        this.S1 = w(2131232327);
        this.T1 = new m1();
        this.J1 = w(2131232103);
        this.K1 = w(2131231857);
        this.f1378f7 = new Drawable[]{w10, w11, w12};
        zg0 zg0Var = new zg0(2131624136, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null);
        this.X1 = zg0Var;
        zg0Var.R(this);
        zg0Var.K(1);
        zg0Var.setCallback(this);
        zg0Var.start();
        Paint paint8 = this.Y1;
        Paint.Style style = Paint.Style.STROKE;
        paint8.setStyle(style);
        this.Y1.setStrokeCap(Paint.Cap.ROUND);
        this.Y1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.C1.setTextSize(org.telegram.messenger.g0.L(11.0f));
        this.D1.setTypeface(org.telegram.messenger.g0.o());
        this.A1.setStyle(style);
        i6 i6Var = new i6(false, true, true);
        this.L0 = i6Var;
        i6Var.w(org.telegram.messenger.g0.L(11.0f));
        i6Var.n(0.35f, 280L, xq.h);
        i6Var.setCallback(this);
        i6Var.f34477b = 3;
        j1 t6 = t(G9);
        this.f1446n = t6;
        this.f1336b7 = W0(t6.f1301c);
        if (str != null) {
            String str3 = this.d;
            if (str3.equals(J9) && (gVar = K9) != null) {
                this.f1505t0 = gVar;
            } else {
                g c10 = h.c(str3, org.telegram.messenger.g0.L(240.0f), gc.b.M, 0.75f, null);
                this.f1505t0 = c10;
                K9 = c10;
                J9 = str3;
            }
            this.f1497s0.a(this.f1505t0);
        }
        u1(false);
    }

    public static void C0(double d, double d2, double d10, double[] dArr) {
        double d11 = (0.2158037573d * d10) + (0.3963377774d * d2) + d;
        double d12 = (d - (0.1055613458d * d2)) - (0.0638541728d * d10);
        double d13 = (d - (d2 * 0.0894841775d)) - (d10 * 1.291485548d);
        double d14 = d11 * d11 * d11;
        double d15 = d12 * d12 * d12;
        double d16 = d13 * d13 * d13;
        dArr[0] = (0.2309699292d * d16) + ((4.0767416621d * d14) - (3.3077115913d * d15));
        dArr[1] = ((2.6097574011d * d15) + ((-1.2684380046d) * d14)) - (0.3413193965d * d16);
        dArr[2] = (d16 * 1.707614701d) + ((d14 * (-0.0041960863d)) - (d15 * 0.7034186147d));
    }

    public static int D0(float f10, float f11, float f12, int i7) {
        float f13;
        float i12 = i1(Color.red(i7));
        float i13 = i1(Color.green(i7));
        float i14 = i1(Color.blue(i7));
        float cbrt = (float) Math.cbrt((0.051445995f * i14) + (0.53633255f * i13) + (0.41222146f * i12));
        float cbrt2 = (float) Math.cbrt((0.10739696f * i14) + (0.6806995f * i13) + (0.2119035f * i12));
        float f14 = i14 * 0.6299787f;
        float cbrt3 = (float) Math.cbrt(f14 + (i13 * 0.28171885f) + (i12 * 0.08830246f));
        float f15 = (0.4505937f * cbrt3) + ((1.9779985f * cbrt) - (2.4285922f * cbrt2));
        float f16 = ((cbrt2 * 0.78277177f) + (cbrt * 0.025904037f)) - (cbrt3 * 0.80867577f);
        float hypot = (float) Math.hypot(f15, f16);
        if (hypot > 1.0E-5f) {
            f13 = Math.min(f12, f11 * hypot) / hypot;
        } else {
            f13 = 0.0f;
        }
        float f17 = f15 * f13;
        float f18 = f16 * f13;
        float f19 = (0.21580376f * f18) + (0.39633778f * f17) + f10;
        float f20 = (f10 - (0.105561346f * f17)) - (0.06385417f * f18);
        float f21 = (f10 - (f17 * 0.08948418f)) - (f18 * 1.2914855f);
        float f22 = f19 * f19 * f19;
        float f23 = f20 * f20 * f20;
        float f24 = f21 * f21 * f21;
        return Color.rgb(w0((0.23096994f * f24) + ((4.0767417f * f22) - (3.3077116f * f23))), w0(((2.6097574f * f23) + ((-1.268438f) * f22)) - (0.34131938f * f24)), w0((f24 * 1.7076147f) + ((f22 * (-0.0041960864f)) - (f23 * 0.7034186f))));
    }

    public static float S(float f10, float f11) {
        float f12 = f10 - 1.0f;
        return com.google.android.recaptcha.internal.a.x(f11, f12, f12, ((f11 + 1.0f) * f12 * f12 * f12) + 1.0f);
    }

    public static int W0(int i7) {
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        o1(i7, dArr);
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            return -1;
        }
        b0(0.96d, Math.min(0.06d, hypot * 0.7d), Math.atan2(dArr[2], dArr[1]), dArr2);
        return Color.rgb((int) Math.round(r(d0(r(dArr2[0]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[1]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[2]))) * 255.0d));
    }

    public static int Z0(int i7) {
        double[] dArr = new double[3];
        i0.a.j(i7, dArr);
        return i0.a.o(i0.a.b(Math.min(96.0d, dArr[0] + 24.0d), dArr[1] * 0.75d, dArr[2] * 0.75d), 26);
    }

    public static int a(float f10, int i7) {
        return i0.a.o(i7, (int) (Utilities.l(f10) * Color.alpha(i7)));
    }

    public static void b0(double d, double d2, double d10, double[] dArr) {
        double cos = Math.cos(d10);
        double sin = Math.sin(d10);
        C0(d, d2 * cos, d2 * sin, dArr);
        if (p0(dArr)) {
            return;
        }
        double d11 = 0.0d;
        double d12 = d2;
        for (int i7 = 0; i7 < 14; i7++) {
            double d13 = (d11 + d12) / 2.0d;
            C0(d, d13 * cos, d13 * sin, dArr);
            if (p0(dArr)) {
                d11 = d13;
            } else {
                d12 = d13;
            }
        }
        C0(d, d11 * cos, d11 * sin, dArr);
    }

    public static float c0(double d) {
        return (float) (d - Math.floor(d));
    }

    public static double d0(double d) {
        if (d <= 0.0031308d) {
            return d * 12.92d;
        }
        return (Math.pow(d, 0.4166666666666667d) * 1.055d) - 0.055d;
    }

    public static int e1(int i7) {
        if (a.h != null) {
            return i7;
        }
        if (a.f1119g == null) {
            int length = a.f1114a.length;
            int[] iArr = new int[length];
            boolean[] zArr = new boolean[length];
            int i10 = 0;
            for (int i11 = 0; i11 < 80; i11++) {
                int b10 = a.b(a.f1118f[i11]);
                if (b10 >= 0 && !zArr[b10]) {
                    zArr[b10] = true;
                    iArr[i10] = b10;
                    i10++;
                }
            }
            for (int i12 = 0; i12 < length; i12++) {
                if (!zArr[i12]) {
                    iArr[i10] = i12;
                    i10++;
                }
            }
            a.f1119g = iArr;
        }
        return a.f1119g[i7];
    }

    public static float f1(boolean z9, boolean z10, float f10) {
        if (z9) {
            if (f10 > 0.0f) {
                return org.telegram.ui.Cells.f1.v(f10, 0.18f, 1.0f, 0.0f);
            }
        } else {
            if (!z10) {
                f10 -= 0.135f;
            }
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            if (f10 < 0.315f) {
                return h(f10 / 0.315f);
            }
        }
        return 1.0f;
    }

    public static int g(float f10, int i7) {
        return (((int) (Math.max(0.0f, Math.min(1.0f, f10)) * 255.0f)) << 24) | (i7 & 16777215);
    }

    public static float g1(float f10, float f11, float f12) {
        float l10 = Utilities.l((f12 - f10) / (f11 - f10));
        return com.google.android.recaptcha.internal.a.C(l10, 2.0f, 3.0f, l10 * l10);
    }

    public static float h(float f10) {
        float f11 = f10 - 1.0f;
        return com.google.android.recaptcha.internal.a.x(f11, 1.70158f, f11, (2.70158f * f11 * f11 * f11) + 1.0f);
    }

    public static double h1(double d, double d2, double d10) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d11 = 6.283185307179586d / d10;
        double d12 = 1.0d - (d2 * d2);
        double sqrt = Math.sqrt(d12) * d11;
        double d13 = sqrt * d;
        return 1.0d - (((Math.sin(d13) * (d2 / Math.sqrt(d12))) + Math.cos(d13)) * Math.exp(((-d2) * d11) * d));
    }

    public static boolean i() {
        if (a0.f() && rc.e(256)) {
            return true;
        }
        return false;
    }

    public static float i1(int i7) {
        float f10 = i7 / 255.0f;
        if (f10 <= 0.04045f) {
            return f10 / 12.92f;
        }
        return (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float j(long j3, float f10, float f11) {
        if (j3 == 0) {
            return 1.0f;
        }
        float currentAnimationTimeMillis = ((float) (AnimationUtils.currentAnimationTimeMillis() - j3)) / 320.0f;
        if (currentAnimationTimeMillis <= 0.0f || currentAnimationTimeMillis >= 1.0f) {
            return 1.0f;
        }
        if (currentAnimationTimeMillis < 0.25f) {
            return (f10 * ((float) Math.sin((currentAnimationTimeMillis * 1.5707963267948966d) / 0.25d))) + 1.0f;
        }
        if (currentAnimationTimeMillis < 0.6f) {
            float f12 = (currentAnimationTimeMillis - 0.25f) / 0.35f;
            return org.telegram.messenger.g0.T1(f10 + 1.0f, 1.0f - f11, com.google.android.recaptcha.internal.a.C(f12, 2.0f, 3.0f, f12 * f12));
        }
        float f13 = (currentAnimationTimeMillis - 0.6f) / 0.4f;
        return org.telegram.messenger.g0.T1(1.0f - f11, 1.0f, com.google.android.recaptcha.internal.a.C(f13, 2.0f, 3.0f, f13 * f13));
    }

    public static void k() {
        if (D9 == null) {
            int length = a.f1115b.length;
            D9 = new int[length];
            E9 = new int[length];
            F9 = new int[length];
            for (int i7 = 0; i7 < length; i7++) {
                D9[i7] = x(a.f1115b[i7], false);
                E9[i7] = x(a.f1116c[i7], true);
                F9[i7] = v(D9[i7], E9[i7]);
            }
        }
    }

    public static float k0(int i7, int i10, int i11) {
        int i12 = i11 * 1442695041;
        int i13 = i12 + (i10 * 668265263) + (i7 * 374761393);
        int i14 = ((i13 >>> 13) ^ i13) * 1274126177;
        return ((i14 ^ (i14 >>> 16)) & 65535) / 65535.0f;
    }

    public static int l1(int i7, int i10) {
        int i11 = i7 | (-16777216);
        int i12 = i10 | (-16777216);
        if (i0.a.g(i11, i12) < 1.15d) {
            double[] dArr = new double[3];
            i0.a.j(i11, dArr);
            for (int i13 = 0; i13 < 40 && i0.a.g(i11, i12) < 1.15d; i13++) {
                double max = Math.max(0.0d, dArr[0] - 2.0d);
                dArr[0] = max;
                i11 = i0.a.b(max, dArr[1], dArr[2]);
            }
        }
        return i0.a.o(i11, 95);
    }

    public static boolean m0(RectF rectF, float f10, float f11) {
        float L = org.telegram.messenger.g0.L(8.0f);
        if (!rectF.isEmpty() && f10 >= rectF.left - L && f10 <= rectF.right + L && f11 >= rectF.top - L && f11 <= rectF.bottom + L) {
            return true;
        }
        return false;
    }

    public static void o1(int i7, double[] dArr) {
        double v02 = v0(Color.red(i7) / 255.0d);
        double v03 = v0(Color.green(i7) / 255.0d);
        double v04 = v0(Color.blue(i7) / 255.0d);
        double cbrt = Math.cbrt((0.0514459929d * v04) + (0.5363325363d * v03) + (0.4122214708d * v02));
        double cbrt2 = Math.cbrt((0.1073969566d * v04) + (0.6806995451d * v03) + (0.2119034982d * v02));
        double d = v04 * 0.6299787005d;
        double cbrt3 = Math.cbrt(d + (v03 * 0.2817188376d) + (v02 * 0.0883024619d));
        dArr[0] = ((0.793617785d * cbrt2) + (0.2104542553d * cbrt)) - (0.0040720468d * cbrt3);
        dArr[1] = (0.4505937099d * cbrt3) + ((1.9779984951d * cbrt) - (2.428592205d * cbrt2));
        dArr[2] = ((cbrt2 * 0.7827717662d) + (cbrt * 0.0259040371d)) - (cbrt3 * 0.808675766d);
    }

    public static boolean p0(double[] dArr) {
        double d = dArr[0];
        if (d >= -1.0E-4d && d <= 1.0001d) {
            double d2 = dArr[1];
            if (d2 >= -1.0E-4d && d2 <= 1.0001d) {
                double d10 = dArr[2];
                if (d10 >= -1.0E-4d && d10 <= 1.0001d) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Bitmap q0(Bitmap bitmap, Bitmap bitmap2, int i7) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i11 = 16777215 & i7;
        int i12 = i7 >>> 24;
        for (int i13 = 0; i13 < i10; i13++) {
            iArr[i13] = ((((iArr[i13] >>> 24) * i12) / 255) << 24) | i11;
        }
        if (bitmap2 == null || !bitmap2.isMutable() || bitmap2.getWidth() != width || bitmap2.getHeight() != height) {
            bitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap3 = bitmap2;
        bitmap3.setPixels(iArr, 0, width, 0, 0, width, height);
        bitmap3.setHasMipMap(bitmap.hasMipMap());
        return bitmap3;
    }

    public static double r(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        if (d > 1.0d) {
            return 1.0d;
        }
        return d;
    }

    public static Bitmap r0(i1 i1Var, Bitmap bitmap, boolean z9) {
        if (z9) {
            Bitmap bitmap2 = i1Var.f1284m;
            if (bitmap2 == null || i1Var.f1285n != bitmap || i1Var.f1287p != i1Var.f1281j) {
                i1Var.f1284m = q0(bitmap, bitmap2, i1Var.f1281j);
                i1Var.f1285n = bitmap;
                i1Var.f1287p = i1Var.f1281j;
            }
            return i1Var.f1284m;
        }
        Bitmap bitmap3 = i1Var.f1282k;
        if (bitmap3 == null || i1Var.f1283l != bitmap || i1Var.f1286o != i1Var.f1281j) {
            i1Var.f1282k = q0(bitmap, bitmap3, i1Var.f1281j);
            i1Var.f1283l = bitmap;
            i1Var.f1286o = i1Var.f1281j;
        }
        return i1Var.f1282k;
    }

    public static void s(int[] iArr, byte[] bArr, int i7) {
        int i10 = 16777215 & i7;
        int i11 = i7 >>> 24;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            iArr[i12] = ((((bArr[i12] & 255) * i11) / 255) << 24) | i10;
        }
    }

    private void setPattern(i1 i1Var) {
        boolean z9;
        if (this.f1373f2) {
            i1 i1Var2 = this.G;
            if (i1Var2 != null && i1Var2 != this.F) {
                P0(i1Var2);
            }
            i1 i1Var3 = this.F;
            if (i1Var3 != i1Var) {
                P0(i1Var3);
            }
            this.G = null;
            this.F = i1Var;
            if (i1Var.f1274a == 2) {
                Z(i1Var);
                if (i1Var.f1277e == null) {
                    i1Var.f1278f = this.f1383g2;
                }
            }
            this.H = AnimationUtils.currentAnimationTimeMillis() - 10000;
            invalidate();
            return;
        }
        if (this.f1496s < 1.0f && this.f1485r != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        i1Var.h = z9;
        if (i1Var.f1274a == 2) {
            Z(i1Var);
            if (i1Var.f1277e == null) {
                i1Var.f1278f = this.f1383g2;
            }
        }
        i1 i1Var4 = this.G;
        if (i1Var4 != null && i1Var4 != this.F) {
            P0(i1Var4);
        }
        this.G = this.F;
        this.F = i1Var;
        this.H = AnimationUtils.currentAnimationTimeMillis();
        invalidate();
    }

    private void setSceneFromCard(j1 j1Var) {
        Y0(j1Var, getWidth() / 2.0f, (l() / 2.0f) + m());
        if (this.f1373f2) {
            return;
        }
        this.f1467p2 = j(this.f1448n2, 0.03f, 0.005f);
        this.f1448n2 = AnimationUtils.currentAnimationTimeMillis();
    }

    public static j1 t(int i7) {
        ?? obj = new Object();
        obj.f1299a = 0;
        obj.f1303f = i7;
        if (i7 == H9) {
            obj.f1300b = -12602881;
            obj.f1301c = -15308082;
            obj.d = a.d[i7];
        } else {
            obj.f1300b = x(a.f1115b[i7], false);
            obj.f1301c = x(a.f1116c[i7], true);
            obj.d = a.d[i7];
        }
        if (i7 == H9) {
            obj.f1302e = -16747023;
        } else {
            k();
            obj.f1302e = F9[i7];
        }
        obj.h = Z0(obj.f1300b);
        obj.f1304g = h.k(0.5f, obj.f1300b, obj.f1301c);
        return obj;
    }

    public static float t1(float f10, float f11, float f12) {
        float N = (f10 - f12) / org.telegram.messenger.g0.N(1.7f);
        float N2 = f11 / org.telegram.messenger.g0.N(3.2f);
        float w12 = w1(N * 2.6f, N2 * 1.7f, 91) * 0.32f;
        return org.telegram.messenger.g0.N(3.6f) * ((w12 + (w1(N, N2, 17) * 0.68f)) - 0.5f);
    }

    public static int u(j1 j1Var) {
        int i7;
        double d;
        int i10;
        if (j1Var != null) {
            i7 = i0.a.f(0.5f, j1Var.f1300b, j1Var.f1301c);
        } else {
            i7 = -16777216;
        }
        if (j1Var != null) {
            d = i0.a.h(j1Var.f1300b);
        } else {
            d = 0.3d;
        }
        float[] fArr = o1.f1596b;
        float max = (fArr[10] / 100.0f) * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - d) / 0.45d)));
        float f10 = (fArr[11] / 100.0f) + 1.0f;
        float f11 = ((0.5f - (f10 * 0.5f)) + max) * 255.0f;
        int k10 = i0.a.k(g((fArr[3] + fArr[9]) / 100.0f, 16777215), Color.rgb(Math.max(0, Math.min(255, Math.round((Color.red(i7) * f10) + f11))), Math.max(0, Math.min(255, Math.round((Color.green(i7) * f10) + f11))), Math.max(0, Math.min(255, Math.round((f10 * Color.blue(i7)) + f11)))));
        if (j1Var != null) {
            i10 = j1Var.h;
        } else {
            i10 = 1073741824;
        }
        return i0.a.k(i10, k10);
    }

    public static double u0(int i7, int i10) {
        long j3 = (i10 * (-4417276706812531889L)) ^ (i7 * (-7046029254386353131L));
        long j10 = (j3 ^ (j3 >>> 31)) * (-4658895280553007687L);
        long j11 = (j10 ^ (j10 >>> 27)) * (-7723592293110705685L);
        return ((j11 ^ (j11 >>> 31)) >>> 11) / 9.007199254740992E15d;
    }

    public static int v(int i7, int i10) {
        double d;
        double d2;
        double atan2;
        double min;
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        double[] dArr3 = new double[3];
        o1(i10, dArr);
        o1(i7, dArr2);
        double d10 = dArr[0];
        if (d10 < 0.45d) {
            d = d10 - 0.03d;
        } else {
            d = 2.0d;
        }
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            double d11 = (dArr[1] * 0.6d) + (dArr2[1] * 0.4d);
            double d12 = (dArr[2] * 0.6d) + (dArr2[2] * 0.4d);
            atan2 = Math.atan2(d12, d11);
            d2 = 2.0d;
            min = Math.min(0.012d, Math.hypot(d11, d12));
        } else {
            d2 = 2.0d;
            atan2 = Math.atan2(dArr[2], dArr[1]);
            min = Math.min((hypot * 1.25d) + 0.02d, 0.2d);
        }
        double d13 = 0.9d;
        double d14 = 0.2d;
        int i11 = 0;
        while (i11 < 12) {
            double d15 = (d14 + d13) / d2;
            double d16 = atan2;
            double d17 = min;
            b0(d15, d17, d16, dArr3);
            if (1.05d / (((r(dArr3[2]) * 0.0722d) + ((r(dArr3[1]) * 0.7152d) + (r(dArr3[0]) * 0.2126d))) + 0.05d) > 4.4d) {
                d14 = d15;
            } else {
                d13 = d15;
            }
            i11++;
            min = d17;
            atan2 = d16;
        }
        double d18 = atan2;
        double d19 = min;
        double d20 = (d14 + d13) / d2;
        if (d20 > d) {
            d20 = Math.max(0.05d, d);
        }
        b0(d20, d19, d18, dArr3);
        return Color.rgb((int) Math.round(r(d0(r(dArr3[0]))) * 255.0d), (int) Math.round(r(d0(r(dArr3[1]))) * 255.0d), (int) Math.round(r(d0(r(dArr3[2]))) * 255.0d));
    }

    public static double v0(double d) {
        if (d <= 0.04045d) {
            return d / 12.92d;
        }
        return Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    public static float v1(float f10) {
        int floor = (int) Math.floor(f10);
        float f11 = f10 - floor;
        float C = com.google.android.recaptcha.internal.a.C(f11, 2.0f, 3.0f, f11 * f11);
        float c02 = c0(Math.sin(floor * 127.1d) * 43758.5453d);
        return ((c0(Math.sin((floor + 1) * 127.1d) * 43758.5453d) - c02) * C) + c02;
    }

    public static int w0(float f10) {
        float pow;
        float max = Math.max(0.0f, Math.min(1.0f, f10));
        if (max <= 0.0031308f) {
            pow = max * 12.92f;
        } else {
            pow = (((float) Math.pow(max, 0.4166666567325592d)) * 1.055f) - 0.055f;
        }
        return Math.round(Math.max(0.0f, Math.min(1.0f, pow)) * 255.0f);
    }

    public static float w1(float f10, float f11, int i7) {
        int floor = (int) Math.floor(f10);
        int floor2 = (int) Math.floor(f11);
        float f12 = f10 - floor;
        float f13 = f11 - floor2;
        float C = com.google.android.recaptcha.internal.a.C(f12, 2.0f, 3.0f, f12 * f12);
        float C2 = com.google.android.recaptcha.internal.a.C(f13, 2.0f, 3.0f, f13 * f13);
        float k02 = k0(floor, floor2, i7);
        int i10 = floor + 1;
        float k03 = k0(i10, floor2, i7);
        int i11 = floor2 + 1;
        float k04 = k0(floor, i11, i7);
        float k05 = k0(i10, i11, i7);
        float z9 = com.google.android.recaptcha.internal.a.z(k03, k02, C, k02);
        return (((((k05 - k04) * C) + k04) - z9) * C2) + z9;
    }

    public static int x(int i7, boolean z9) {
        double[] dArr = new double[3];
        i0.a.j(i7, dArr);
        if (!z9) {
            return i7;
        }
        double max = Math.max(0.0d, dArr[0] - 3.0d);
        dArr[0] = max;
        double d = dArr[1] * 1.03d;
        dArr[1] = d;
        double d2 = dArr[2] * 1.03d;
        dArr[2] = d2;
        return i0.a.b(max, d, d2);
    }

    public static PorterDuffColorFilter x0(i1 i1Var) {
        float[] fArr = o1.f1596b;
        int i7 = ((int) (fArr[14] * 10.0f)) ^ i1Var.f1290s;
        if (i1Var.f1292u == null || i1Var.f1291t != i7) {
            i1Var.f1291t = i7;
            i1Var.f1292u = new PorterDuffColorFilter(i0.a.f(fArr[14] / 100.0f, i1Var.f1290s, -1), PorterDuff.Mode.SRC_IN);
        }
        return i1Var.f1292u;
    }

    public static float y1(float f10) {
        return 1.0f - ((float) Math.pow(1.0f - f10, 2.4000000953674316d));
    }

    public final void A(android.graphics.Canvas r47, int r48) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l1.A(android.graphics.Canvas, int):void");
    }

    public final PorterDuffColorFilter A0(i1 i1Var) {
        float[] fArr = o1.f1596b;
        int i7 = ((int) (fArr[30] * 10.0f)) ^ (i1Var.f1290s * 31);
        if (this.f1422k4 == null || this.f1431l4 != i7) {
            this.f1431l4 = i7;
            this.f1422k4 = new PorterDuffColorFilter(i0.a.f(fArr[30] / 100.0f, i1Var.f1290s, -1), PorterDuff.Mode.SRC_IN);
        }
        return this.f1422k4;
    }

    public final void B(android.graphics.Canvas r79, int r80) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l1.B(android.graphics.Canvas, int):void");
    }

    public final void B0() {
        cb.c cVar;
        y0 y0Var;
        if (!this.f1362e2 && (cVar = this.f1339c) != null && (y0Var = ((s0) cVar.f6040b).f1620e) != null) {
            y0Var.j();
        }
    }

    public final void C(Canvas canvas, Path path, RectF rectF, float f10, float f11) {
        float f12;
        int i7;
        int i10;
        RectF rectF2;
        float f13;
        float f14;
        float[][] fArr;
        float f15;
        float f16;
        int i11;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        int i12;
        int i13;
        int i14;
        Path path2 = path;
        int i15 = 1;
        if (path2 == null) {
            if (this.f1573z6) {
                i14 = 1;
            } else if (this.A6) {
                i14 = 2;
            } else {
                i14 = 0;
            }
            if (z.a(f10, f11, i14, canvas, rectF)) {
                return;
            }
        }
        int i16 = this.B6;
        SweepGradient[] sweepGradientArr = this.C6;
        int i17 = 4;
        float[][] fArr2 = o1.f1595a;
        if (i16 != 1) {
            this.B6 = 1;
            int i18 = 0;
            while (i18 < i17) {
                float[] fArr3 = fArr2[i18];
                int i19 = i17;
                int[] iArr = new int[73];
                int i20 = i15;
                float[] fArr4 = new float[73];
                int i21 = 0;
                for (int i22 = 73; i21 < i22; i22 = 73) {
                    int i23 = i18;
                    double radians = Math.toRadians(i21 * 5);
                    float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr3[6]);
                    if (((float) Math.sin(radians)) < 0.0f) {
                        f12 = fArr3[11];
                    } else {
                        f12 = fArr3[12];
                    }
                    float f23 = f12 / 100.0f;
                    iArr[i21] = g(Math.min(1.0f, (((fArr3[5] / 100.0f) - f23) * pow) + f23), 0);
                    fArr4[i21] = i21 / 72.0f;
                    i21++;
                    i18 = i23;
                }
                int i24 = i18;
                sweepGradientArr[i24] = new SweepGradient(0.0f, 0.0f, iArr, fArr4);
                i18 = i24 + 1;
                i17 = i19;
                i15 = i20;
            }
        }
        int i25 = i15;
        int i26 = i17;
        if (this.f1573z6) {
            i7 = i25;
        } else if (this.A6) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        float[] fArr5 = fArr2[i7];
        float f24 = this.D6;
        float[] fArr6 = o1.f1596b;
        float f25 = f24 * fArr6[0];
        float f26 = (this.E6 * fArr6[i25]) / 100.0f;
        float N = org.telegram.messenger.g0.N(fArr5[8]);
        if (N != 0.0f) {
            rectF2 = this.f1347c7;
            rectF2.set(rectF);
            rectF2.inset(N, N);
            if (path2 != null) {
                float width = rectF2.width() / Math.max(1.0f, rectF.width());
                float height = rectF2.height() / Math.max(1.0f, rectF.height());
                float centerX = rectF.centerX();
                float centerY = rectF.centerY();
                i10 = i7;
                Matrix matrix = this.W6;
                matrix.setScale(width, height, centerX, centerY);
                Path path3 = this.X6;
                path2.transform(matrix, path3);
                path2 = path3;
            } else {
                i10 = i7;
            }
            f13 = Math.max(0.0f, f10 - N);
        } else {
            i10 = i7;
            rectF2 = rectF;
            f13 = f10;
        }
        Matrix matrix2 = this.f1356d7;
        matrix2.setRotate(f25);
        matrix2.postScale(rectF2.width() / Math.max(1.0f, rectF2.height()), 1.0f);
        matrix2.postTranslate(rectF2.centerX(), rectF2.centerY());
        float N2 = org.telegram.messenger.g0.N(fArr5[i26]);
        if (N2 > 0.05f) {
            SweepGradient sweepGradient = sweepGradientArr[i10];
            sweepGradient.setLocalMatrix(matrix2);
            Paint paint = this.A1;
            paint.setShader(sweepGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f11 * 255.0f));
            if (path2 == null) {
                paint.setStrokeWidth(N2);
                RectF rectF3 = this.V5;
                rectF3.set(rectF2);
                float f27 = (-N2) / 2.0f;
                rectF3.inset(f27, f27);
                float f28 = (N2 / 2.0f) + f13;
                canvas.drawRoundRect(rectF3, f28, f28, paint);
            } else {
                canvas.save();
                a0.b(canvas, path2);
                paint.setStrokeWidth(N2 * 2.0f);
                canvas.drawPath(path2, paint);
                canvas.restore();
            }
            paint.setShader(null);
            paint.setAlpha(255);
        }
        double radians2 = Math.toRadians(f25);
        float f29 = (float) (-Math.sin(radians2));
        float cos = (float) Math.cos(radians2);
        float N3 = org.telegram.messenger.g0.N(fArr5[0]);
        float N4 = org.telegram.messenger.g0.N(fArr5[2]);
        if (this.A6) {
            f14 = 0.0f;
        } else {
            f14 = this.f1335b6 * ((fArr6[21] * 1.25f) / 100.0f);
        }
        int i27 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
        if (i27 > 0 && this.f1560y3) {
            fArr = fArr2;
            f15 = c1(rectF2.centerX(), rectF2.top, getWidth(), getHeight());
        } else {
            fArr = fArr2;
            f15 = 0.0f;
        }
        if (i27 > 0 && this.f1560y3) {
            f16 = c1(rectF2.centerX(), rectF2.bottom, getWidth(), getHeight());
        } else {
            f16 = 0.0f;
        }
        float min = Math.min(1.0f, ((f15 * f14) + 1.0f) * (f26 + 1.0f) * (fArr5[i25] / 100.0f));
        float min2 = Math.min(1.0f, ((f14 * f16) + 1.0f) * (1.0f - f26) * (fArr5[3] / 100.0f));
        if (Build.VERSION.SDK_INT >= 29) {
            i11 = i25;
        } else {
            i11 = 0;
        }
        int i28 = 0;
        for (int i29 = 2; i28 < i29; i29 = 2) {
            if (i28 == 0) {
                f17 = N3;
            } else {
                f17 = -N4;
            }
            if (i28 == 0) {
                f18 = min;
            } else {
                f18 = min2;
            }
            if (f18 <= 0.004f || Math.abs(f17) < 0.1f) {
                f19 = f13;
                f20 = min;
                f21 = min2;
                f22 = f29;
                i12 = i11;
                i13 = i25;
            } else {
                canvas.save();
                Path path4 = this.Z6;
                f20 = min;
                Path path5 = this.f1325a7;
                if (path2 == null) {
                    f21 = min2;
                    f22 = f29;
                    float min3 = Math.min(f13, Math.min(rectF2.width(), rectF2.height()) / 2.0f);
                    path4.rewind();
                    Path.Direction direction = Path.Direction.CW;
                    path4.addRoundRect(rectF2, min3, min3, direction);
                    f19 = f13;
                    RectF rectF4 = this.Y6;
                    rectF4.set(rectF2);
                    i12 = i11;
                    rectF4.offset(f22 * f17, f17 * cos);
                    path5.rewind();
                    path5.addRoundRect(rectF4, min3, min3, direction);
                } else {
                    f19 = f13;
                    f21 = min2;
                    f22 = f29;
                    i12 = i11;
                    path4.set(path2);
                    path5.set(path2);
                    path5.offset(f22 * f17, f17 * cos);
                }
                a0.b(canvas, path5);
                Paint paint2 = this.f1568z1;
                if (i12 == 0) {
                    float f30 = fArr[i10][10];
                    int i30 = this.f1336b7;
                    paint2.setColor(Color.rgb(Math.max(0, Math.min(255, Math.round(((Color.red(i30) - 255) * f30) + 255.0f))), Math.max(0, Math.min(255, Math.round(((Color.green(i30) - 255) * f30) + 255.0f))), Math.max(0, Math.min(255, Math.round(((Color.blue(i30) - 255) * f30) + 255.0f)))));
                    paint2.setAlpha((int) (f18 * 255.0f * f11));
                    i13 = i25;
                } else {
                    int round = Math.round(Math.max(0.0f, Math.min(1.0f, f18)) * 255.0f);
                    paint2.setColor(round | (round << 16) | (-16777216) | (round << 8));
                    paint2.setAlpha((int) (f11 * 255.0f));
                    i13 = i25;
                    a0.i(i13, paint2);
                }
                canvas.drawPath(path4, paint2);
                if (i12 != 0) {
                    a0.i(0, paint2);
                }
                canvas.restore();
            }
            i28++;
            i25 = i13;
            min = f20;
            min2 = f21;
            f29 = f22;
            f13 = f19;
            i11 = i12;
        }
    }

    public final void D(android.graphics.Canvas r18, ai.i1 r19, int r20, float r21, float r22, float r23, float r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l1.D(android.graphics.Canvas, ai.i1, int, float, float, float, float, float):void");
    }

    public final void E(Canvas canvas, int i7, int i10, i1 i1Var, i1 i1Var2, float f10, boolean z9, boolean z10) {
        float f11;
        float f12;
        boolean z11;
        float f13;
        int i11;
        float f14;
        boolean z12;
        float f15;
        float f16;
        int i12;
        int i13;
        l1 l1Var = this;
        i1 i1Var3 = i1Var;
        i1 i1Var4 = i1Var2;
        l1Var.X(i1Var3);
        l1Var.X(i1Var4);
        float L = org.telegram.messenger.g0.L(86.0f);
        float L2 = org.telegram.messenger.g0.L(70.0f);
        float L3 = org.telegram.messenger.g0.L(90.0f) * 1.3f;
        float f17 = l1Var.K + l1Var.N;
        float f18 = l1Var.L + l1Var.O;
        float f19 = -L3;
        boolean z13 = true;
        int ceil = ((int) Math.ceil(((i10 + L3) - f18) / L2)) + 1;
        org.telegram.messenger.g0.L(24.0f);
        int floor = ((int) Math.floor((f19 - f18) / L2)) - 1;
        while (floor <= ceil) {
            int i14 = floor & 1;
            if (i14 == 0) {
                f11 = 0.0f;
            } else {
                f11 = L / 2.0f;
            }
            boolean z14 = z13;
            int floor2 = ((int) Math.floor(((f19 - f17) - f11) / L)) - 1;
            int i15 = i7;
            float f20 = L3;
            int ceil2 = ((int) Math.ceil((((i15 + L3) - f17) - f11) / L)) + 1;
            while (floor2 <= ceil2) {
                float f21 = L2;
                int i16 = ceil2;
                double u02 = u0(floor, floor2);
                if (c0(53.1d * u02) < 0.2f) {
                    f12 = f17;
                    i13 = floor2;
                    i11 = ceil;
                    i12 = floor;
                    f15 = f11;
                    f14 = L;
                    z12 = z14;
                    f16 = f19;
                } else {
                    l1Var.G0(u02, 3.0f, 10.0f);
                    float f22 = f19;
                    float f23 = (float) (2.0d * u02 * 3.141592653589793d);
                    f12 = f17;
                    float d = l1Var.L4 + rf.b.d(floor2, L, f11, f17);
                    float sin = (((float) Math.sin((l1Var.M3 * 0.45f) + f23)) * org.telegram.messenger.g0.L(3.0f)) + (floor * f21) + f18 + l1Var.M4;
                    if (i14 == 0) {
                        z11 = z14;
                    } else {
                        z11 = false;
                    }
                    float L4 = org.telegram.messenger.g0.L(38.0f);
                    if (z11) {
                        f13 = 1.3f;
                    } else {
                        f13 = 0.9f;
                    }
                    float f24 = L4 * f13;
                    i11 = ceil;
                    float f25 = (float) u02;
                    float B = com.google.android.recaptcha.internal.a.B(f25, 0.16f, 0.92f, f24);
                    f14 = L;
                    z12 = z14;
                    f15 = f11;
                    f16 = f22;
                    int i17 = floor2;
                    i12 = floor;
                    i13 = i17;
                    if (J0(d, sin, B, i15, i10, 0, floor, i17, (Math.max(0.0f, (B / org.telegram.messenger.g0.L(24.0f)) - 1.0f) * 0.8f) + 1.0f)) {
                        if (z11) {
                            B *= 0.9f;
                        }
                        float f26 = B;
                        float sin2 = (((float) Math.sin((this.M3 * 0.3f) + f23)) * 4.0f) + ((f25 - 0.5f) * 26.0f);
                        float c02 = c0(59.3d * u02) * 0.3f;
                        int i18 = (i13 - ((i12 - i14) / 2)) - i12;
                        int length = i1Var4.f1275b.length;
                        int i19 = ((i18 % length) + length) % length;
                        float c03 = c0(71.9d * u02);
                        if (i1Var3 == null) {
                            D(canvas, i1Var4, i19, f26, sin2, f23 * 2.0f, f1(z9, z10, f10 - c02), c03);
                        } else {
                            i1 i1Var5 = i1Var4;
                            Drawable[] drawableArr = i1Var3.f1275b;
                            int length2 = drawableArr.length;
                            int i20 = ((i18 % length2) + length2) % length2;
                            if (drawableArr[i20] == i1Var5.f1275b[i19]) {
                                D(canvas, i1Var5, i19, f26, sin2, f23 * 2.0f, 1.0f, c03);
                            } else {
                                float f27 = f23 * 2.0f;
                                float f28 = f10 - c02;
                                D(canvas, i1Var3, i20, f26, sin2, f27, f1(z12, false, f28), c03);
                                D(canvas, i1Var2, i19, f26, sin2, f27, f1(false, false, f28), c03);
                            }
                        }
                    }
                }
                floor2 = i13 + 1;
                l1Var = this;
                i15 = i7;
                i1Var3 = i1Var;
                i1Var4 = i1Var2;
                floor = i12;
                f19 = f16;
                ceil2 = i16;
                f11 = f15;
                f17 = f12;
                ceil = i11;
                L = f14;
                z14 = z12;
                L2 = f21;
            }
            floor++;
            l1Var = this;
            i1Var3 = i1Var;
            i1Var4 = i1Var2;
            z13 = z14;
            L2 = L2;
            L3 = f20;
        }
    }

    public final void E0(i1 i1Var, Bitmap bitmap) {
        i1Var.f1277e = bitmap;
        if (bitmap != null) {
            if (o1.f1596b[35] > 0.5f) {
                Y(bitmap);
            }
            x0(i1Var);
        }
        i1Var.f1279g = AnimationUtils.currentAnimationTimeMillis();
        this.f1383g2 = bitmap;
        invalidate();
    }

    public final void F(android.graphics.Canvas r96, int r97, int r98, ai.i1 r99, boolean r100, boolean r101, float r102) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l1.F(android.graphics.Canvas, int, int, ai.i1, boolean, boolean, float):void");
    }

    public final void F0(int i7) {
        if (!this.f1317a) {
            return;
        }
        if (i7 == 2 && !p10.i(this.f1328b).q()) {
            d1(0, hd.M0(2131746473, null), hd.M0(2131746472, null));
            i0();
            return;
        }
        if (i7 == 2 && (this.f1392h1 != i7 || this.f1372f1 < 0.5f)) {
            AnimationUtils.currentAnimationTimeMillis();
        }
        this.f1392h1 = i7;
        this.f1401i1 = i7;
        this.f1410j1 = 0.0f;
        this.f1427k9.forceFinished(true);
        if (this.f1372f1 > 0.5f) {
            this.f1346c6 = AnimationUtils.currentAnimationTimeMillis();
        }
        if (this.f1382g1 < 0.5f) {
            this.I2 = AnimationUtils.currentAnimationTimeMillis();
        }
        this.f1382g1 = 1.0f;
        l0();
        if (this.f1392h1 == 2) {
            y0();
        }
        i0();
    }

    public final void G(Canvas canvas, RectF rectF, int i7) {
        float centerY = rectF.centerY();
        float L = org.telegram.messenger.g0.L(12.0f);
        i6 i6Var = this.L0;
        float c10 = i6Var.c() + org.telegram.messenger.g0.L(2.0f) + L;
        float L2 = rectF.left + org.telegram.messenger.g0.L(8.0f);
        O(canvas, L2, centerY, L, i7, true);
        i6Var.u(i7);
        i6Var.setBounds((int) (L2 + L + org.telegram.messenger.g0.L(2.0f)), (int) (centerY - org.telegram.messenger.g0.L(8.0f)), (int) (L2 + c10 + org.telegram.messenger.g0.L(40.0f)), (int) (centerY + org.telegram.messenger.g0.L(8.0f)));
        i6Var.draw(canvas);
    }

    public final void G0(double d, float f10, float f11) {
        double d2;
        float c02 = ((c0(31.7d * d) * (f11 - f10)) + f10) * org.telegram.messenger.g0.L(1.0f);
        float c03 = (c0(37.1d * d) * 11.0f) + 9.0f;
        if (c0(43.3d * d) < 0.5f) {
            d2 = -1.0d;
        } else {
            d2 = 1.0d;
        }
        double d10 = (d * 6.283d) + ((((d2 * 2.0d) * 3.141592653589793d) * this.M3) / c03);
        this.L4 = ((float) Math.cos(d10)) * c02;
        this.M4 = c02 * ((float) Math.sin(d10));
    }

    public final void H(Canvas canvas, RectF rectF, float f10) {
        int i7;
        j1 j1Var = this.f1446n;
        if (j1Var != null) {
            i7 = i0.a.f(0.5f, j1Var.f1300b, j1Var.f1301c);
        } else {
            i7 = -12947803;
        }
        Paint paint = this.f1568z1;
        paint.setColor(i7 | (-16777216));
        paint.setAlpha((int) (Utilities.l(f10) * 224.4f));
        canvas.drawRect(rectF, paint);
    }

    public final float H0() {
        return (a1() - b1()) + org.telegram.messenger.g0.L(8.0f);
    }

    public final void I(android.graphics.Canvas r29, int r30, org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r31, float r32, float r33, float r34, float r35) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l1.I(android.graphics.Canvas, int, org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, float, float, float, float):void");
    }

    public final void I0(float f10, float f11, int i7) {
        Path path;
        int i10;
        int i11;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f1525v1.get(i7);
        ?? obj = new Object();
        obj.f1299a = 2;
        obj.f1303f = i7;
        final i1 i1Var = new i1();
        i1Var.f1274a = 2;
        i1Var.f1288q = i7;
        long j3 = tL_starGiftUnique.f27181id;
        i1Var.f1289r = (int) (j3 ^ (j3 >>> 32));
        ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i13);
            i13++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) && (document2 = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document) != null) {
                i1Var.A = document2;
                i1Var.f1276c = i5.l(this.f1328b, 9, document2);
            } else if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                i1Var.f1296z = document;
                i1Var.d = i5.l(this.f1328b, 24, document);
            }
        }
        e0(this.f1393h2, i7);
        obj.f1300b = x(this.f1393h2[0], false);
        int x10 = x(this.f1393h2[1], true);
        obj.f1301c = x10;
        obj.d = this.f1393h2[2];
        obj.f1302e = v(obj.f1300b, x10);
        obj.h = Z0(obj.f1300b);
        obj.f1304g = h.k(0.5f, obj.f1300b, obj.f1301c);
        i1Var.f1281j = l1(obj.d, obj.f1300b);
        i0.a.j(l1(obj.d, obj.f1300b) | (-16777216), r9);
        double min = Math.min(97.0d, r9[0] + 20.0d);
        double[] dArr = {min};
        Color.colorToHSV(i0.a.b(min, dArr[1], dArr[2]), r3);
        float[] fArr = {0.0f, Math.min(1.0f, fArr[1] * 1.15f)};
        i1Var.f1290s = Color.HSVToColor(fArr) | (-16777216);
        i1Var.v.setColorFilter(new PorterDuffColorFilter(i1Var.f1290s, PorterDuff.Mode.SRC_IN));
        i1Var.f1291t = -1;
        i1Var.B = tL_starGiftUnique;
        i5 i5Var = i1Var.f1276c;
        if (i5Var != null) {
            i5Var.a(this);
        }
        i5 i5Var2 = i1Var.d;
        if (i5Var2 != null) {
            i5Var2.a(this);
        }
        TLRPC.Document document3 = i1Var.f1296z;
        if (document3 != null) {
            int i14 = 0;
            while (true) {
                if (i14 < document3.thumbs.size()) {
                    if (document3.thumbs.get(i14) instanceof TLRPC.TL_photoPathSize) {
                        path = ((TLRPC.TL_photoPathSize) document3.thumbs.get(i14)).svgPath;
                        break;
                    }
                    i14++;
                } else {
                    path = null;
                    break;
                }
            }
            if (path != null) {
                while (true) {
                    if (i12 < document3.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = document3.attributes.get(i12);
                        if (((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) && (i10 = documentAttribute.f26959w) > 0 && (i11 = documentAttribute.h) > 0) {
                            break;
                        }
                        i12++;
                    } else {
                        i10 = 512;
                        i11 = 512;
                        break;
                    }
                }
                final Path path2 = new Path(path);
                float f12 = I9;
                final float f13 = f12 / i10;
                final float f14 = f12 / i11;
                final int i15 = i1Var.f1281j;
                Utilities.f21333e.c(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap;
                        float f15 = f13;
                        float f16 = f14;
                        int i16 = i15;
                        Path path3 = path2;
                        try {
                            int i17 = l1.I9;
                            bitmap = Bitmap.createBitmap(i17, i17, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmap);
                            canvas.scale(f15, f16);
                            Paint paint = new Paint(1);
                            paint.setColor(i16);
                            canvas.drawPath(path3, paint);
                            bitmap.prepareToDraw();
                        } catch (Throwable th2) {
                            a8.g(th2, true);
                            bitmap = null;
                        }
                        org.telegram.messenger.g0.h3(new aa.s(l1.this, i1Var, bitmap, 3));
                    }
                });
            }
        }
        this.I.clear();
        Y0(obj, f10, f11);
        if (!this.f1373f2) {
            this.f1467p2 = j(this.f1448n2, 0.03f, 0.005f);
            this.f1448n2 = AnimationUtils.currentAnimationTimeMillis();
        }
        setPattern(i1Var);
    }

    public final void J(Canvas canvas, RectF rectF, float f10, float f11) {
        RectF rectF2;
        float f12;
        RectF rectF3;
        boolean z9;
        float f13;
        char c10;
        char c11;
        int i7;
        double d;
        float f14;
        float f15;
        if (f11 <= 0.0f) {
            return;
        }
        if (this.A6) {
            float min = Math.min(0.0f, org.telegram.messenger.g0.N(o1.f1595a[2][8]));
            rectF3 = this.W5;
            rectF2 = rectF;
            rectF3.set(rectF2);
            rectF3.inset(min, min);
            f12 = f10 - min;
        } else {
            rectF2 = rectF;
            f12 = f10;
            rectF3 = rectF2;
        }
        if (!j0(canvas) && this.Y2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && this.Y2 != null && this.f1321a3 != null) {
            float f16 = this.f1374f3;
            Matrix matrix = this.f1352d3;
            matrix.setScale(f16, f16);
            float f17 = (-f16) / 2.0f;
            matrix.postTranslate(f17, f17);
            this.f1321a3.setLocalMatrix(matrix);
            Paint paint = this.f1343c3;
            paint.setAlpha((int) (Utilities.l(f11) * 255.0f));
            canvas.drawRoundRect(rectF3, f12, f12, paint);
            paint.setAlpha(255);
        }
        Path path = this.E1;
        path.rewind();
        path.addRoundRect(rectF3, f12, f12, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        float[] fArr = o1.f1596b;
        if (z9) {
            f13 = 0.0f;
            c10 = '\t';
            c11 = 3;
        } else if (a0.f() && j0(canvas)) {
            int i10 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
            f13 = 0.0f;
            if (i10 < 0) {
                canvas.saveLayerAlpha(rectF3, (int) (f11 * 255.0f));
            }
            if (this.f1502s6 && this.f1492r6 > 0.004f) {
                canvas.save();
                canvas.scale(8.0f, 8.0f);
                if (this.t6 == null) {
                    this.t6 = android.support.v4.media.session.w.d("qrSheetLift");
                }
                float round = Math.round(this.f1492r6 * 50.0f) / 50.0f;
                c10 = '\t';
                j1 j1Var = this.f1446n;
                if (j1Var != null) {
                    i7 = j1Var.f1300b;
                } else {
                    i7 = 0;
                }
                if (round == this.f1520u6 && this.f1530v6 == 1 && this.f1541w6 == i7) {
                    c11 = 3;
                } else {
                    this.f1520u6 = round;
                    this.f1530v6 = 1;
                    this.f1541w6 = i7;
                    Object obj = this.t6;
                    if (j1Var != null) {
                        d = i0.a.h(j1Var.f1300b);
                    } else {
                        d = 0.3d;
                    }
                    c11 = 3;
                    float c12 = com.google.android.recaptcha.internal.a.c(fArr[11], 100.0f, round, 1.0f);
                    float max = ((0.5f - (c12 * 0.5f)) + ((fArr[10] / 100.0f) * round * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - d) / 0.45d))))) * 255.0f;
                    a0.k(obj, Math.max(0.5f, org.telegram.messenger.g0.N(org.telegram.messenger.g0.T1(fArr[2], fArr[12], round)) / 8.0f), new float[]{c12, 0.0f, 0.0f, 0.0f, max, 0.0f, c12, 0.0f, 0.0f, max, 0.0f, 0.0f, c12, 0.0f, max, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                }
                Canvas a10 = a0.a((getWidth() + 7) / 8, (getHeight() + 7) / 8, this.t6);
                a10.scale(0.125f, 0.125f);
                a0.c(a10, this.G1);
                a0.d(this.t6);
                a0.c(canvas, this.t6);
                canvas.restore();
            } else {
                c10 = '\t';
                c11 = 3;
                Object obj2 = this.H1;
                canvas.save();
                canvas.scale(9.0f, 9.0f);
                a0.c(canvas, obj2);
                canvas.restore();
            }
            if (i10 < 0) {
                canvas.restore();
            }
        } else {
            f13 = 0.0f;
            c10 = '\t';
            c11 = 3;
            H(canvas, rectF3, f11);
        }
        int i11 = this.T8;
        if (i11 == 0) {
            float f18 = fArr[c11];
            if (this.f1502s6) {
                f15 = fArr[c10] * this.f1492r6;
            } else {
                f15 = f13;
            }
            i11 = g((f18 + f15) / 100.0f, 16777215);
        }
        Paint paint2 = this.f1568z1;
        paint2.setColor(i11);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * f11));
        canvas.drawRect(rectF3, paint2);
        z.b(canvas, rectF3, f11);
        boolean z10 = this.f1502s6;
        if (!z10 && !this.A6) {
            f14 = (fArr[21] / 100.0f) * this.f1335b6;
        } else {
            f14 = f13;
        }
        if ((f14 > f13 || fArr[39] > f13) && this.f1560y3 && !z10 && !this.A6) {
            int width = getWidth();
            int height = getHeight();
            float c13 = c1(rectF3.left, rectF3.centerY(), width, height);
            float c14 = c1(rectF3.centerX(), rectF3.centerY(), width, height);
            float c15 = c1(rectF3.right, rectF3.centerY(), width, height);
            if (c13 + c14 + c15 > 0.01f) {
                float f19 = ((fArr[39] * 1.25f) / 100.0f) * this.f1335b6 * 0.1f;
                float f20 = c14 * f19 * f11;
                float centerX = rectF3.centerX();
                L(rectF3.left, centerX, c13 * f19 * f11, f20, canvas, rectF3);
                L(centerX, rectF3.right, f20, f19 * c15 * f11, canvas, rectF3);
            }
        }
        canvas.restore();
        C(canvas, null, rectF2, f10, f11);
    }

    public final boolean J0(float r39, float r40, float r41, int r42, int r43, int r44, int r45, int r46, float r47) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l1.J0(float, float, float, int, int, int, int, int, float):boolean");
    }

    public final void K(Canvas canvas) {
        float f10;
        float L;
        int i7;
        int i10;
        float f11;
        float f12;
        float f13;
        float g12;
        int i11;
        Bitmap bitmap;
        float f14;
        float L2;
        Canvas canvas2 = canvas;
        if (this.f1419k1 <= 0.001f) {
            return;
        }
        float L3 = org.telegram.messenger.g0.L(222.0f);
        float L4 = org.telegram.messenger.g0.L(46.0f);
        float L5 = org.telegram.messenger.g0.L(54.0f);
        org.telegram.messenger.g0.L(8.0f);
        if (this.f1557y0) {
            f10 = L4 + L4;
        } else {
            f10 = L4 + L5 + L4;
        }
        int i12 = (this.f1372f1 > 0.5f ? 1 : (this.f1372f1 == 0.5f ? 0 : -1));
        RectF rectF = this.J5;
        if (i12 > 0) {
            L = (rectF.bottom + org.telegram.messenger.g0.L(6.0f)) - f10;
        } else {
            L = rectF.top - org.telegram.messenger.g0.L(6.0f);
        }
        float f15 = L;
        float width = (getWidth() - L3) / 2.0f;
        RectF rectF2 = this.K8;
        rectF2.set(width, f15, L3 + width, f10 + f15);
        float f16 = this.E8;
        float f17 = this.F8;
        float l10 = Utilities.l(this.f1419k1);
        float T1 = org.telegram.messenger.g0.T1(rectF.left, rectF2.left, f16);
        float T12 = org.telegram.messenger.g0.T1(rectF.top, rectF2.top, f17);
        float T13 = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, f16);
        float T14 = org.telegram.messenger.g0.T1(rectF.bottom, rectF2.bottom, f17);
        RectF rectF3 = this.J8;
        rectF3.set(T1, T12, T13, T14);
        float min = Math.min(rectF3.height() / 2.0f, Math.min(rectF3.width() / 2.0f, org.telegram.messenger.g0.T1(rectF.height() / 2.0f, org.telegram.messenger.g0.L(22.0f), Utilities.l(f17))));
        float max = Math.max(-0.25f, Math.min(1.0f, this.G8 / 9.0f)) * org.telegram.messenger.g0.L(5.0f);
        float f18 = rectF3.left;
        float f19 = rectF3.top;
        float f20 = rectF3.right;
        float f21 = 1.0f;
        float f22 = rectF3.bottom;
        float centerX = rectF3.centerX();
        Path path = this.I8;
        path.rewind();
        float f23 = f18 + min;
        path.moveTo(f23, f19);
        float f24 = f20 - min;
        path.lineTo(f24, f19);
        float f25 = f19 + min;
        path.quadTo(f20, f19, f20, f25);
        float f26 = f22 - min;
        path.lineTo(f20, f26);
        path.quadTo(f20, f22, f24, f22);
        float f27 = f22 + max;
        path.cubicTo(org.telegram.messenger.g0.T1(f24, centerX, 0.55f), f27, org.telegram.messenger.g0.T1(f23, centerX, 0.55f), f27, f23, f22);
        path.quadTo(f18, f22, f18, f26);
        path.lineTo(f18, f25);
        path.quadTo(f18, f19, f23, f19);
        path.close();
        RectF rectF4 = this.F1;
        rectF4.set(f18, f19, f20, Math.max(0.0f, max) + f22);
        canvas2.save();
        canvas2.clipPath(path);
        float f28 = 255.0f;
        if (a0.f() && j0(canvas)) {
            Object obj = this.H1;
            canvas2.save();
            canvas2.scale(9.0f, 9.0f);
            a0.c(canvas2, obj);
            canvas2.restore();
        } else if (this.Y2 != null) {
            Paint paint = this.f1332b3;
            paint.setAlpha((int) (Utilities.l(1.0f) * 255.0f));
            Bitmap bitmap2 = this.Y2;
            if (bitmap2 != null) {
                y(canvas2, bitmap2);
            }
            paint.setAlpha(255);
        } else {
            H(canvas2, rectF4, 1.0f);
        }
        Paint paint2 = this.f1568z1;
        paint2.setColor(352321535);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * 1.0f));
        canvas2.drawRect(rectF4, paint2);
        z.b(canvas2, rectF4, 1.0f);
        canvas2.restore();
        C(canvas2, path, rectF4, 0.0f, 1.0f);
        canvas2.save();
        canvas2.clipPath(path);
        float f29 = l10 / 0.3f;
        float l11 = 1.0f - Utilities.l(f29);
        float f30 = 0.004f;
        float f31 = 0.15f;
        boolean z9 = false;
        int i13 = 1;
        if (l11 > 0.004f) {
            canvas2.saveLayerAlpha(rectF4, (int) (l11 * 255.0f));
            float l12 = 1.0f - (Utilities.l(f29) * 0.15f);
            canvas2.scale(l12, l12, rectF.centerX(), rectF.centerY());
            this.T5 = true;
            int width2 = getWidth();
            System.currentTimeMillis();
            B(canvas2, width2);
            this.T5 = false;
            canvas2.restore();
        }
        float centerX2 = rectF3.centerX() - rectF2.centerX();
        float f32 = rectF3.top - rectF2.top;
        float f33 = 0.6f;
        if (Math.abs(this.G8) < 0.6f) {
            centerX2 = Math.round(centerX2);
            f32 = Math.round(f32);
        }
        canvas2.save();
        canvas2.translate(centerX2, f32);
        TextPaint textPaint = this.C1;
        textPaint.setSubpixelText(true);
        textPaint.setLinearText(false);
        boolean z10 = this.f1546x0;
        String M0 = hd.M0(2131746484, null);
        if (z10) {
            i7 = 2131746488;
        } else {
            i7 = 2131746486;
        }
        String[] strArr = {M0, hd.M0(i7, null), hd.M0(2131746483, null)};
        if (this.f1546x0) {
            i10 = 2131746487;
        } else {
            i10 = 2131746485;
        }
        String[] strArr2 = {null, hd.M0(i10, null), null};
        int i14 = 0;
        float f34 = f15;
        while (i14 < 3) {
            RectF[] rectFArr = this.f1565y8;
            if (i14 == i13 && this.f1557y0) {
                rectFArr[i14].setEmpty();
                i11 = i14;
                f12 = f28;
                f13 = f30;
            } else {
                if (strArr2[i14] != null) {
                    f11 = L5;
                } else {
                    f11 = L4;
                }
                f12 = f28;
                f13 = f30;
                float f35 = f34 + f11;
                rectFArr[i14].set(rectF2.left, f34, rectF2.right, f35);
                if (this.l1 > 0.5f) {
                    g12 = g1(f31, f33, l10);
                } else {
                    g12 = g1(f33, f21, l10);
                }
                if (g12 <= f13) {
                    i11 = i14;
                } else {
                    M(canvas2, i14, rectFArr[i14], z9);
                    canvas2.save();
                    float f36 = (f11 / 2.0f) + f34;
                    if (i14 == 2) {
                        i11 = i14;
                        o0(canvas2, this.K1, rectF2.left + org.telegram.messenger.g0.L(26.0f), f36, org.telegram.messenger.g0.L(20.0f), g12);
                        canvas2 = canvas;
                    } else {
                        i11 = i14;
                        if (i11 == 0) {
                            canvas2 = canvas;
                            o0(canvas2, this.R1, rectF2.left + org.telegram.messenger.g0.L(26.0f), f36, org.telegram.messenger.g0.L(20.0f), g12);
                        } else {
                            canvas2 = canvas;
                            boolean z11 = this.f1546x0;
                            if (z11) {
                                bitmap = this.O8;
                            } else {
                                bitmap = this.P8;
                            }
                            if (bitmap != null) {
                                f14 = 26.0f;
                            } else {
                                int round = Math.round(org.telegram.messenger.g0.L(22.4f));
                                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ALPHA_8);
                                f14 = 26.0f;
                                Canvas canvas3 = new Canvas(createBitmap);
                                float f37 = round / 24.0f;
                                canvas3.scale(f37, f37);
                                Paint paint3 = new Paint(1);
                                Paint.Style style = Paint.Style.STROKE;
                                paint3.setStyle(style);
                                paint3.setStrokeWidth(1.66f);
                                Paint.Cap cap = Paint.Cap.ROUND;
                                paint3.setStrokeCap(cap);
                                paint3.setStrokeJoin(Paint.Join.ROUND);
                                paint3.setColor(-16777216);
                                canvas3.drawCircle(11.0f, 11.0f, 8.0f, paint3);
                                canvas3.drawLine(11.0f, 11.0f, 11.0f, 6.6f, paint3);
                                canvas3.drawLine(11.0f, 11.0f, 7.8f, 11.0f, paint3);
                                if (z11) {
                                    Paint paint4 = new Paint(1);
                                    paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                    canvas3.drawCircle(18.2f, 18.2f, 5.7f, paint4);
                                    Paint paint5 = new Paint(1);
                                    paint5.setColor(-16777216);
                                    canvas3.drawCircle(18.2f, 18.2f, 4.4f, paint5);
                                    paint4.setStyle(style);
                                    paint4.setStrokeWidth(1.4f);
                                    paint4.setStrokeCap(cap);
                                    canvas3.drawLine(16.6f, 16.6f, 19.8f, 19.8f, paint4);
                                    canvas3.drawLine(19.8f, 16.6f, 16.6f, 19.8f, paint4);
                                    this.O8 = createBitmap;
                                } else {
                                    this.P8 = createBitmap;
                                }
                                bitmap = createBitmap;
                            }
                            float L6 = rectF2.left + org.telegram.messenger.g0.L(f14);
                            Paint paint6 = this.Q8;
                            paint6.setColor(-1);
                            paint6.setAlpha((int) (Color.alpha(-1) * g12));
                            canvas2.drawBitmap(bitmap, L6 - (bitmap.getWidth() / 2.0f), f36 - (bitmap.getHeight() / 2.0f), paint6);
                        }
                    }
                    textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
                    textPaint.setColor(-1);
                    textPaint.setAlpha((int) (g12 * f12));
                    String str = strArr[i11];
                    float L7 = rectF2.left + org.telegram.messenger.g0.L(52.0f);
                    if (strArr2[i11] != null) {
                        L2 = f36 - org.telegram.messenger.g0.L(2.0f);
                    } else {
                        L2 = org.telegram.messenger.g0.L(5.0f) + f36;
                    }
                    canvas2.drawText(str, L7, L2, textPaint);
                    if (strArr2[i11] != null) {
                        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                        textPaint.setColor(-1493172225);
                        textPaint.setAlpha((int) (Color.alpha(-1493172225) * g12));
                        canvas2.drawText(strArr2[i11], rectF2.left + org.telegram.messenger.g0.L(52.0f), f36 + org.telegram.messenger.g0.L(14.0f), textPaint);
                    }
                    canvas2.restore();
                }
                f34 = f35;
            }
            i14 = i11 + 1;
            f28 = f12;
            f30 = f13;
            f31 = 0.15f;
            f33 = 0.6f;
            z9 = false;
            i13 = 1;
            f21 = 1.0f;
        }
        canvas2.restore();
        canvas2.restore();
    }

    public final void K0() {
        if (this.W4 == null && !this.V4) {
            this.V4 = true;
            Utilities.f21333e.c(new z0(this, i0.a.o(i0.a.f(0.4f, N0(), -16777216), 16), 0));
        }
    }

    public final void L(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF) {
        LinearGradient linearGradient;
        float min = Math.min(f12, f13);
        float max = Math.max(f12, f13);
        int i7 = (min > 0.002f ? 1 : (min == 0.002f ? 0 : -1));
        Paint paint = this.f1324a6;
        if (i7 > 0) {
            paint.setShader(null);
            paint.setColor(g(min, 16777215));
            canvas.drawRect(f10, rectF.top, f11, rectF.bottom, paint);
        }
        float f14 = max - min;
        if (f14 > 0.002f) {
            if (f13 >= f12) {
                linearGradient = this.X5;
            } else {
                linearGradient = this.Y5;
            }
            Matrix matrix = this.Z5;
            matrix.setScale(f11 - f10, 1.0f);
            matrix.postTranslate(f10, 0.0f);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f14 * 255.0f));
            canvas.drawRect(f10, rectF.top, f11, rectF.bottom, paint);
            paint.setShader(null);
        }
    }

    public final float L0(float f10) {
        if (!this.f1560y3 || this.f1490r4 <= 0.001f) {
            return 0.0f;
        }
        float f11 = this.f1479q4;
        float[] fArr = o1.f1596b;
        float max = f11 / Math.max(0.3f, fArr[50]);
        if (max > 4.0f || max < -4.0f) {
            return 0.0f;
        }
        return Math.min(org.telegram.messenger.g0.N(fArr[42]), (org.telegram.messenger.g0.L(3.5f) / 2.0f) / 0.607f) * f10 * max * ((float) Math.exp((-0.5f) * max * max)) * this.f1490r4;
    }

    public final void M(Canvas canvas, int i7, RectF rectF, boolean z9) {
        boolean z10;
        float exp;
        int i10;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.f1495r9 == i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        long[] jArr = this.f1555x9;
        if (!z10 && jArr[i7] == 0) {
            return;
        }
        if (z10) {
            exp = X0(i7, currentAnimationTimeMillis);
        } else {
            exp = this.f1566y9[i7] * ((float) Math.exp(((float) (-(currentAnimationTimeMillis - jArr[i7]))) / 180.0f));
        }
        if (!z10 && exp < 0.004f) {
            jArr[i7] = 0;
            return;
        }
        float C = com.google.android.recaptcha.internal.a.C(exp, 2.0f, 3.0f, exp * exp);
        float min = Math.min(1.0f, ((float) (currentAnimationTimeMillis - this.f1544w9[i7])) / 320.0f);
        float f10 = 1.0f - min;
        float x10 = org.telegram.ui.Cells.f1.x(f10, f10, f10, 1.0f);
        if (!z10 || exp < 0.996f || min < 1.0f) {
            invalidate();
        }
        float max = Math.max(rectF.left, Math.min(rectF.right, this.f1523u9[i7]));
        float max2 = Math.max(rectF.top, Math.min(rectF.bottom, this.f1533v9[i7]));
        float max3 = (float) Math.max(Math.hypot(max - rectF.left, max2 - rectF.top), Math.max(Math.hypot(max - rectF.right, max2 - rectF.top), Math.max(Math.hypot(max - rectF.left, max2 - rectF.bottom), Math.hypot(max - rectF.right, max2 - rectF.bottom))));
        if (z9) {
            i10 = 335544320;
        } else {
            i10 = 738197503;
        }
        int i11 = (((int) ((i10 >>> 24) * C)) << 24) | (16777215 & i10);
        Paint paint = this.s9;
        paint.setColor(i11);
        Path path = this.f1513t9;
        path.rewind();
        if (i7 != 3 && i7 != 4 && i7 != 11) {
            if (i7 < 6 && i7 != 5) {
                path.addRect(rectF, Path.Direction.CW);
            } else {
                float min2 = Math.min(org.telegram.messenger.g0.L(20.0f), rectF.height() / 2.0f);
                path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
            }
        } else {
            path.addOval(rectF, Path.Direction.CW);
        }
        canvas.save();
        canvas.clipPath(path);
        canvas.drawCircle(max, max2, Math.max(org.telegram.messenger.g0.L(6.0f), max3 * x10), paint);
        canvas.restore();
    }

    public final void M0(int i7, j1 j1Var, int i10, int i11) {
        int i12 = i7 * 7;
        int i13 = j1Var.f1299a;
        float[] fArr = this.j3;
        if (i13 == 0 && j1Var.f1303f == H9) {
            fArr[i12] = 0.0f;
            fArr[i12 + 1] = 0.0f;
            fArr[i12 + 2] = 0.0f;
            float f10 = L9;
            fArr[i12 + 3] = f10;
            float f11 = M9;
            fArr[i12 + 4] = f11;
            fArr[i12 + 5] = 1.0f / ((i11 * f11) + (i10 * f10));
            fArr[i12 + 6] = 0.5f;
        } else {
            fArr[i12] = 1.0f;
            fArr[i12 + 1] = i10 / 2.0f;
            fArr[i12 + 2] = (l() / 2.0f) + m();
            fArr[i12 + 3] = 0.0f;
            fArr[i12 + 4] = 0.0f;
            fArr[i12 + 5] = 1.0f / (((float) Math.hypot(i10, i11)) * 0.62f);
            fArr[i12 + 6] = 0.55f;
        }
        int i14 = i7 * 3;
        int i15 = j1Var.f1300b;
        int[] iArr = this.f1430l3;
        iArr[i14] = i15;
        iArr[i14 + 1] = j1Var.f1304g;
        iArr[i14 + 2] = j1Var.f1301c;
    }

    public final void N(android.graphics.Canvas r61, int r62, int r63) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l1.N(android.graphics.Canvas, int, int):void");
    }

    public final int N0() {
        j1 j1Var = this.f1446n;
        if (j1Var == null) {
            return -16777216;
        }
        if (this.f1496s < 1.0f && this.f1485r != null) {
            float l10 = (l() / 2.0f) + m();
            float l11 = Utilities.l(((((((float) Math.hypot(Math.max(this.f1545x, getWidth() - this.f1545x), Math.max(this.f1556y, getHeight() - this.f1556y))) + org.telegram.messenger.g0.L(60.0f)) * y1(this.f1496s)) - ((float) Math.hypot((getWidth() / 2.0f) - this.f1545x, l10 - this.f1556y))) + org.telegram.messenger.g0.L(80.0f)) / org.telegram.messenger.g0.L(160.0f));
            int i7 = this.f1485r.f1302e;
            int i10 = this.f1446n.f1302e;
            float C = com.google.android.recaptcha.internal.a.C(l11, 2.0f, 3.0f, l11 * l11);
            double[] dArr = this.f1478q3;
            i0.a.j(i7, dArr);
            double[] dArr2 = this.f1489r3;
            i0.a.j(i10, dArr2);
            double d = C;
            double[] dArr3 = this.f1500s3;
            if (dArr3.length == 3) {
                double d2 = 1.0d - d;
                double d10 = (dArr2[0] * d) + (dArr[0] * d2);
                dArr3[0] = d10;
                double d11 = (dArr2[1] * d) + (dArr[1] * d2);
                dArr3[1] = d11;
                double d12 = (dArr2[2] * d) + (dArr[2] * d2);
                dArr3[2] = d12;
                return i0.a.b(d10, d11, d12);
            }
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        return j1Var.f1302e;
    }

    public final void O(Canvas canvas, float f10, float f11, float f12, int i7, boolean z9) {
        PorterDuffColorFilter n1 = n1(i7);
        m1 m1Var = this.T1;
        m1Var.setColorFilter(n1);
        m1Var.setAlpha(255);
        float f13 = f12 / 2.0f;
        float f14 = f11 - f13;
        float f15 = f10 + f12;
        float f16 = f11 + f13;
        m1Var.setBounds((int) f10, (int) f14, (int) f15, (int) f16);
        if (!z9) {
            m1Var.draw(canvas);
            return;
        }
        float f17 = f12 * 0.095f;
        float f18 = (0.28f * f12) + f10;
        float f19 = f11 - (0.21f * f12);
        float f20 = (0.74f * f12) + f10;
        float f21 = (0.25f * f12) + f11;
        float L = f10 - org.telegram.messenger.g0.L(2.0f);
        float L2 = f14 - org.telegram.messenger.g0.L(2.0f);
        float L3 = f15 + org.telegram.messenger.g0.L(2.0f);
        float L4 = f16 + org.telegram.messenger.g0.L(2.0f);
        RectF rectF = this.V5;
        rectF.set(L, L2, L3, L4);
        canvas.saveLayer(rectF, null);
        m1Var.draw(canvas);
        Paint paint = this.Y1;
        paint.setStrokeWidth((0.065f * f12 * 2.0f) + f17);
        canvas.drawLine(f18, f19, f20, f21, paint);
        canvas.restore();
        Paint paint2 = this.A1;
        paint2.setColor(i7);
        paint2.setStrokeWidth(f17);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawLine(f18, f19, f20, f21, paint2);
        paint2.setStrokeCap(Paint.Cap.BUTT);
    }

    public final void O0() {
        this.X1.C(false);
        Bitmap bitmap = this.R2;
        if (bitmap != null) {
            bitmap.recycle();
            this.R2 = null;
        }
        zg0 zg0Var = this.f1327a9;
        if (zg0Var != null) {
            zg0Var.C(false);
            this.f1327a9 = null;
        }
        zg0 zg0Var2 = this.f1435l8;
        if (zg0Var2 != null) {
            zg0Var2.C(false);
            this.f1435l8 = null;
        }
        i5 i5Var = this.f1426k8;
        if (i5Var != null) {
            i5Var.n(this);
            this.f1426k8 = null;
            this.f1444m8 = 0L;
        }
        P0(this.F);
        P0(this.G);
        removeCallbacks(this.f1474p9);
        v9 v9Var = this.f1402i2;
        if (v9Var != null) {
            v9Var.f();
        }
        VelocityTracker velocityTracker = this.f1418k0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1418k0 = null;
        }
        VelocityTracker velocityTracker2 = this.f1445m9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f1445m9 = null;
        }
        HashMap hashMap = this.J7;
        for (i5 i5Var2 : hashMap.values()) {
            i5Var2.n(this);
        }
        for (Drawable drawable : this.J.values()) {
            if (drawable instanceof i5) {
                ((i5) drawable).n(this);
            }
        }
        hashMap.clear();
        HashMap hashMap2 = this.K7;
        for (k1 k1Var : hashMap2.values()) {
            g5 g5Var = k1Var.f1310a;
            if (g5Var != null) {
                g5Var.b();
            }
        }
        hashMap2.clear();
    }

    public final void P(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (this.f1466p1 != null && f13 > 0.004f) {
            TextPaint textPaint = this.f1559y2;
            textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint.setColor(-1);
            textPaint.setAlpha((int) (f13 * 255.0f));
            canvas.drawText(this.f1466p1, ((f10 + f12) - org.telegram.messenger.g0.L(16.0f)) - textPaint.measureText(this.f1466p1), f11 + org.telegram.messenger.g0.L(5.0f), textPaint);
            textPaint.setAlpha(255);
        }
    }

    public final void P0(i1 i1Var) {
        if (i1Var != null) {
            i5 i5Var = i1Var.f1276c;
            if (i5Var != null) {
                i5Var.n(this);
            }
            i5 i5Var2 = i1Var.d;
            if (i5Var2 != null && !this.J7.containsValue(i5Var2)) {
                i1Var.d.n(this);
            }
            i1Var.G = true;
            y yVar = i1Var.F;
            if (yVar != null) {
                yVar.f1687e = true;
                qs.f(yVar.f1684a).n(yVar, qs.Y1);
                i1Var.F = null;
            }
        }
    }

    public final void Q(float f10, float f11, float f12, Canvas canvas, boolean z9) {
        Canvas canvas2;
        Drawable drawable;
        float f13;
        float f14;
        if (this.W8 != 0) {
            if (z9) {
                float L = f11 - org.telegram.messenger.g0.L(10.0f);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint = this.R8;
                paint.setStyle(style);
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                paint.setColor(-1);
                float f15 = 1.0f;
                paint.setAlpha((int) (Color.alpha(-1) * 1.0f));
                float L2 = ((org.telegram.messenger.g0.L(26.0f) + f10) - org.telegram.messenger.g0.L(10.0f)) + org.telegram.messenger.g0.L(10.0f);
                float L3 = L + org.telegram.messenger.g0.L(11.0f);
                float L4 = org.telegram.messenger.g0.L(7.25f);
                if (f12 >= 0.0f) {
                    float l10 = 1.0f - Utilities.l(f12 / 0.42f);
                    float x10 = org.telegram.ui.Cells.f1.x(l10, l10, l10, 1.0f);
                    if (f12 < 0.6f) {
                        float f16 = 1.0f - (f12 / 0.6f);
                        f14 = (1.0f - ((f16 * f16) * f16)) * 364.0f;
                    } else {
                        float l11 = Utilities.l((f12 - 0.6f) / 0.12f);
                        f14 = 364.0f - ((3.0f - (l11 * 2.0f)) * ((4.0f * l11) * l11));
                    }
                    f13 = f14;
                    f15 = x10;
                } else {
                    f13 = 0.0f;
                }
                float f17 = L3 - L4;
                RectF rectF = this.S8;
                rectF.set(L2 - L4, f17, L2 + L4, L4 + L3);
                canvas.drawArc(rectF, -82.0f, f15 * 344.0f, false, paint);
                canvas.drawLine(L2, f17, L2, L + org.telegram.messenger.g0.L(2.2f), paint);
                double radians = Math.toRadians(f13 - 90.0f);
                canvas2 = canvas;
                canvas2.drawLine(L2, L3, org.telegram.ui.Cells.f1.d(3.8f, (float) Math.cos(radians), L2), org.telegram.ui.Cells.f1.d(3.8f, (float) Math.sin(radians), L3), paint);
                paint.setStyle(Paint.Style.FILL);
                canvas2.drawCircle(L2, L3, org.telegram.messenger.g0.N(1.2f), paint);
            } else {
                canvas2 = canvas;
                if (n()) {
                    zg0 p12 = p1();
                    int L5 = org.telegram.messenger.g0.L(28.0f);
                    float f18 = L5 / 2.0f;
                    int i7 = (int) (f11 - f18);
                    p12.setBounds((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f18), i7, ((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f18)) + L5, L5 + i7);
                    p12.draw(canvas2);
                } else {
                    int i10 = this.W8;
                    if (i10 == 2131232114) {
                        zg0 q12 = q1();
                        int L6 = org.telegram.messenger.g0.L(28.0f);
                        float f19 = L6 / 2.0f;
                        int i11 = (int) (f11 - f19);
                        q12.setBounds((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f19), i11, ((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f19)) + L6, L6 + i11);
                        q12.draw(canvas2);
                    } else {
                        if (i10 == 2131232342) {
                            drawable = this.R1;
                        } else if (i10 == 2131232103) {
                            drawable = this.J1;
                        } else {
                            drawable = this.S1;
                        }
                        o0(canvas2, drawable, f10 + org.telegram.messenger.g0.L(26.0f), f11, org.telegram.messenger.g0.L(20.0f), 1.0f);
                        canvas2 = canvas2;
                    }
                }
            }
        } else {
            canvas2 = canvas;
            zg0 r12 = r1();
            int L7 = org.telegram.messenger.g0.L(27.0f);
            float f20 = L7 / 2.0f;
            int i12 = (int) (f11 - f20);
            r12.setBounds((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f20), i12, ((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f20)) + L7, L7 + i12);
            r12.draw(canvas2);
        }
        TextPaint textPaint = this.C1;
        textPaint.setColor(-1);
        float f21 = this.f1498s1;
        if (f21 <= 0.0f) {
            f21 = org.telegram.messenger.g0.L(15.0f);
        }
        textPaint.setTextSize(f21);
        String str = this.U8;
        float L8 = f10 + org.telegram.messenger.g0.L(48.0f);
        float L10 = org.telegram.messenger.g0.L(5.0f) + f11;
        int indexOf = str.indexOf(10);
        if (indexOf >= 0) {
            canvas2.drawText(str, 0, indexOf, L8, L10 - org.telegram.messenger.g0.L(9.0f), (Paint) textPaint);
            canvas.drawText(str, indexOf + 1, str.length(), L8, L10 + org.telegram.messenger.g0.L(9.0f), (Paint) textPaint);
        } else if (!s0(str)) {
            canvas2.drawText(str, L8, L10, textPaint);
        } else {
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = this.f1559y2;
            textPaint2.setTextSize(textSize);
            textPaint2.setColor(textPaint.getColor());
            canvas2.drawText(this.f1526v2, L8, L10, textPaint);
            float measureText = textPaint.measureText(this.f1526v2) + L8;
            canvas2.drawText(this.f1537w2, measureText, L10, textPaint2);
            canvas2.drawText(this.f1548x2, textPaint2.measureText(this.f1537w2) + measureText, L10, textPaint);
        }
    }

    public final void Q0() {
        int i7 = this.f1495r9;
        if (i7 >= 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1566y9[i7] = X0(i7, currentAnimationTimeMillis);
            this.f1555x9[i7] = currentAnimationTimeMillis;
            invalidate();
        }
        this.f1495r9 = -1;
    }

    public final void R(android.graphics.Canvas r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l1.R(android.graphics.Canvas, int, long):void");
    }

    public final void R0() {
        float f10 = this.f1360e0;
        if (f10 == 0.0f && this.f1371f0 == 0.0f) {
            return;
        }
        this.f1400i0 = f10;
        this.f1409j0 = this.f1371f0;
        this.W = AnimationUtils.currentAnimationTimeMillis();
        this.U = true;
    }

    public final void S0() {
        int i7 = this.V7;
        if (i7 >= 0 && this.X7 < this.W7) {
            this.Y7 = k1(i7);
            this.X7 = AnimationUtils.currentAnimationTimeMillis();
            invalidate();
        }
    }

    public final float T(float f10) {
        float f11;
        if (this.Q4 >= 1.0f) {
            return 1.0f;
        }
        if (this.T4) {
            f11 = 0.85f;
        } else {
            f11 = 0.92f;
        }
        return org.telegram.messenger.g0.T1(f11, 1.0f, f10);
    }

    public final android.graphics.Bitmap T0() {
        throw new UnsupportedOperationException("Method not decompiled: ai.l1.T0():android.graphics.Bitmap");
    }

    public final Drawable U(String str) {
        HashMap hashMap = this.J;
        Drawable drawable = (Drawable) hashMap.get(str);
        if (drawable == null) {
            drawable = org.telegram.messenger.i6.g(str);
            if (drawable == null) {
                drawable = org.telegram.messenger.i6.g(str.replace("️", ""));
            }
            if (drawable != null) {
                hashMap.put(str, drawable);
            }
        }
        return drawable;
    }

    public final void U0(String str) {
        boolean z9;
        if (this.f1524v0) {
            int L = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(8.0f);
            this.f1507t2 = this.L0.c() + org.telegram.messenger.g0.L(2.0f) + L + org.telegram.messenger.g0.L(11.0f);
            this.f1524v0 = false;
            this.A0 = false;
            if (this.B0 * this.G0 > 0.001f) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f1499s2 = z9;
            this.f1477q2 = AnimationUtils.currentAnimationTimeMillis();
            this.C0 = this.B0;
            this.D0 = 0.0f;
            this.E0 = System.currentTimeMillis();
            g gVar = this.f1505t0;
            if (gVar != null) {
                j1(gVar);
            }
            u1(true);
            if (str != null) {
                d1(0, str, null);
            }
            i0();
            this.f1359e = null;
            this.f1514u0 = null;
            cb.c cVar = this.f1339c;
            if (cVar != null) {
                cVar.w(0);
            }
        }
    }

    public final Bitmap V(i5 i5Var) {
        Bitmap n10;
        z2 z2Var = i5Var.f34450k;
        if (z2Var != null) {
            zg0 B = z2Var.B();
            if (B != null) {
                if (!this.T2) {
                    B.V(0L);
                }
                if (B.u()) {
                    if (B.Q != null) {
                        return B.Q;
                    }
                    if (B.R == null) {
                        return null;
                    }
                    return B.R;
                }
            } else {
                v5 m10 = z2Var.m();
                if (m10 != null) {
                    if (!this.T2) {
                        m10.D(System.currentTimeMillis());
                    }
                    if (m10.s()) {
                        return m10.m();
                    }
                } else if (z2Var.J() && z2Var.L() && (n10 = z2Var.n()) != null && !n10.isRecycled()) {
                    return n10;
                }
            }
        }
        return null;
    }

    public final float V0() {
        if (this.f1382g1 < 0.5f) {
            return 1.0f;
        }
        return Utilities.l(((float) (AnimationUtils.currentAnimationTimeMillis() - this.I2)) / 420.0f);
    }

    public final ai.i1 W() {
        throw new UnsupportedOperationException("Method not decompiled: ai.l1.W():ai.i1");
    }

    public final void X(i1 i1Var) {
        TLRPC.Document document;
        if (i1Var != null && !i1Var.G && i1Var.f1274a == 2 && i1Var.F == null && (document = i1Var.A) != null) {
            i1Var.F = new y(this.f1328b, document, i1Var.B, org.telegram.messenger.g0.L(48.0f), new f1(0, this, i1Var));
        }
    }

    public final float X0(int i7, long j3) {
        return 1.0f - ((1.0f - this.z9[i7]) * ((float) Math.exp(((float) (-(j3 - this.f1544w9[i7]))) / 90.0f)));
    }

    public final boolean Y(Bitmap bitmap) {
        float[] fArr = o1.f1596b;
        float f10 = fArr[36];
        float f11 = fArr[38];
        float f12 = fArr[24];
        if (this.S3 != null && this.T3 == bitmap && f10 == this.U3 && f11 == this.V3 && f12 == this.W3) {
            return true;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        this.T3 = bitmap;
        this.U3 = f10;
        this.V3 = f11;
        this.W3 = f12;
        Bitmap bitmap2 = this.S3;
        if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || this.S3.getHeight() != bitmap.getHeight()) {
            this.S3 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        this.S3.eraseColor(0);
        Canvas canvas = new Canvas(this.S3);
        double radians = Math.toRadians(f12);
        float f13 = (float) (-Math.cos(radians));
        float f14 = (float) (-Math.sin(radians));
        float N = org.telegram.messenger.g0.N(f10);
        float N2 = org.telegram.messenger.g0.N(f11);
        float f15 = f13 * N2;
        float f16 = N2 * f14;
        canvas.drawBitmap(bitmap, f15, f16, (Paint) null);
        canvas.drawBitmap(bitmap, f15 - (f13 * N), f16 - (f14 * N), this.X3);
        return true;
    }

    public final void Y0(j1 j1Var, float f10, float f11) {
        if (j1Var != null) {
            this.f1336b7 = W0(j1Var.f1301c);
        }
        if (this.f1373f2) {
            if (this.f1485r != null) {
                this.f1485r = null;
            }
            this.f1446n = j1Var;
            this.f1496s = 1.0f;
            invalidate();
            return;
        }
        this.f1485r = this.f1446n;
        this.f1446n = j1Var;
        this.f1496s = 0.0f;
        this.f1534w = System.currentTimeMillis();
        this.f1545x = f10;
        this.f1556y = f11;
        this.f1475q0++;
        i0();
        invalidate();
    }

    public final void Z(i1 i1Var) {
        i5 i5Var;
        z2 z2Var;
        if (i1Var != null && i1Var.f1277e == null && (i5Var = i1Var.f1276c) != null) {
            y yVar = i1Var.F;
            if ((yVar == null || yVar.h) && (z2Var = i5Var.f34450k) != null && z2Var.J() && z2Var.L()) {
                int L = org.telegram.messenger.g0.L(48.0f);
                Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                i1Var.f1276c.setBounds(0, 0, L, L);
                i1Var.f1276c.setColorFilter(null);
                i1Var.f1276c.setAlpha(255);
                z2Var.f21194h1 = 1.0f;
                i1Var.f1276c.draw(canvas);
                E0(i1Var, createBitmap);
            }
        }
    }

    public final String a0() {
        String M0 = hd.M0(2131746478, null);
        if (!M0.equals(this.f1516u2)) {
            this.f1516u2 = M0;
            Matcher matcher = Pattern.compile("\\d+").matcher(M0);
            if (matcher.find()) {
                this.f1526v2 = M0.substring(0, matcher.start());
                this.f1537w2 = matcher.group();
                this.f1548x2 = M0.substring(matcher.end());
            } else {
                this.f1526v2 = M0;
                this.f1548x2 = "";
                this.f1537w2 = "";
            }
        }
        return this.f1516u2;
    }

    public final float a1() {
        return (getHeight() - this.f1517u3) - org.telegram.messenger.g0.L(10.0f);
    }

    public final float b(double d) {
        float f10 = this.A4;
        double sin = Math.sin((f10 * 78.233d) + (((f10 * 17.31d) + d) * 12.9898d)) * 43758.5453d;
        return ((float) (sin - Math.floor(sin))) * 300.0f;
    }

    public final float b1() {
        float L;
        float max = Math.max(org.telegram.messenger.g0.L(160.0f), a1() - ((((l() + (org.telegram.messenger.g0.L(51.0f) + this.f1508t3)) + org.telegram.messenger.g0.L(24.0f)) + org.telegram.messenger.g0.L(11.0f)) + org.telegram.messenger.g0.L(13.0f)));
        if (this.f1392h1 == 2 && this.f1547x1) {
            ArrayList arrayList = this.f1525v1;
            if (arrayList.size() <= 3) {
                float A = (org.telegram.messenger.camera.q.A(10.0f, 2, getWidth()) - org.telegram.messenger.g0.L(8.0f)) / 3.0f;
                if (arrayList.isEmpty()) {
                    L = org.telegram.messenger.g0.L(286.0f);
                } else {
                    L = org.telegram.messenger.g0.L(8.0f) + A;
                }
                max = Math.min(max, L);
            }
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f10 = this.P2;
        if (f10 >= 0.0f && this.f1372f1 >= 0.01f) {
            if (f10 != max) {
                long min = Math.min(64L, Math.max(0L, currentAnimationTimeMillis - this.Q2));
                float f11 = this.P2;
                float z9 = com.google.android.recaptcha.internal.a.z(1.0f, (float) Math.exp(((float) (-min)) / 140.0f), max - f11, f11);
                this.P2 = z9;
                if (Math.abs(max - z9) < 0.5f) {
                    this.P2 = max;
                } else {
                    invalidate();
                }
            }
        } else {
            this.P2 = max;
        }
        this.Q2 = currentAnimationTimeMillis;
        return this.P2;
    }

    public final void c() {
        j1 j1Var;
        Runnable runnable = this.d2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f1362e2 && !this.I.isEmpty() && (j1Var = this.f1446n) != null && (j1Var.f1299a != 0 || this.F.f1274a == 2)) {
            this.T7 = AnimationUtils.currentAnimationTimeMillis();
            this.Q7 = -1;
            this.O7 = 0.0f;
            setSceneFromCard(t(this.M7));
        }
        setPattern(W());
        if (!this.f1373f2) {
            this.f1486r0 = AnimationUtils.currentAnimationTimeMillis();
        }
        B0();
    }

    public final float c1(float f10, float f11, int i7, int i10) {
        float f12;
        float f13;
        float f14;
        float f15;
        int i11;
        float f16;
        float f17;
        float asin;
        if (!this.f1560y3) {
            return 0.0f;
        }
        float f18 = i7;
        float f19 = f10 - (f18 / 2.0f);
        float f20 = this.H3;
        float f21 = i10;
        float f22 = f11 - (f21 / 2.0f);
        float f23 = (this.I3 * f22) + (f19 * f20);
        float f24 = 1.0f;
        float max = Math.max(1.0f, ((Math.abs(this.I3) * f21) + (Math.abs(f20) * f18)) / 2.0f);
        float[] fArr = o1.f1596b;
        float f25 = fArr[19] / 100.0f;
        if (f25 > 0.0f) {
            float f26 = this.I3;
            float max2 = ((f22 * this.H3) + (f19 * (-f26))) / Math.max(1.0f, ((Math.abs(this.H3) * f21) + (Math.abs(f26) * f18)) / 2.0f);
            f23 -= ((f25 * f18) * max2) * max2;
        }
        float f27 = (f23 - this.f1538w3) / this.f1549x3;
        float f28 = fArr[20] / 100.0f;
        if (f28 > 0.0f) {
            f27 += (((((float) Math.asin(Math.max(-1.0f, Math.min(1.0f, f23 / max)))) - Math.max(-2.1991148f, Math.min(2.1991148f, (this.f1538w3 / max) * 1.5707964f))) / ((this.f1549x3 / max) * 1.5707964f)) - f27) * f28;
            f12 = com.google.android.recaptcha.internal.a.v(1.0f, (float) Math.cos(Math.max(-1.5707964f, Math.min(1.5707964f, asin))), (f28 * fArr[31]) / 100.0f, 1.0f);
        } else {
            f12 = 1.0f;
        }
        this.o4 = f27;
        float f29 = this.E3;
        this.f1469p4 = f29 * f12;
        float f30 = fArr[34] / 100.0f;
        int i12 = (f27 > 4.0f ? 1 : (f27 == 4.0f ? 0 : -1));
        if ((i12 > 0 || f27 < -4.0f) && f30 <= 0.0f) {
            this.f1440m4 = 0.0f;
            return 0.0f;
        }
        float f31 = fArr[32];
        float f32 = f27 / fArr[29];
        i1 i1Var = this.F;
        if (i1Var != null && i1Var.f1274a == 1) {
            f24 = 0.7f;
        }
        float f33 = f12 * f24;
        if (f32 > 4.0f || f32 < -4.0f) {
            f13 = 0.0f;
            f14 = f33;
            f15 = 4.0f;
            i11 = i12;
            f16 = 0.0f;
        } else {
            float abs = Math.abs(f32);
            f13 = 0.0f;
            f14 = f33;
            f15 = 4.0f;
            i11 = i12;
            f16 = f29 * f33 * ((float) Math.exp(Math.pow(abs, f31) * (-0.5d)));
        }
        this.f1440m4 = f16;
        float f34 = fArr[28] / 100.0f;
        if (i11 <= 0 && f27 >= -4.0f) {
            f17 = (float) Math.exp(Math.pow(Math.abs(f27), f31) * (-0.5d));
        } else {
            f17 = f13;
        }
        float f35 = f34 * f17;
        if (f30 > f13) {
            float f36 = f27 - fArr[33];
            if (f36 < f15 && f36 > -4.0f) {
                f35 += f30 * ((float) Math.exp(Math.pow(Math.abs(f36), f31) * (-0.5d)));
            }
        }
        return this.E3 * f14 * f35;
    }

    public final void d(int i7) {
        boolean z9 = true;
        this.f1362e2 = true;
        if (this.F.f1274a == 0) {
            z9 = false;
        }
        this.I.clear();
        this.O7 = 0.0f;
        this.M7 = i7;
        j1 j1Var = this.f1446n;
        if (j1Var == null || j1Var.f1299a != 0 || j1Var.f1303f != i7) {
            setSceneFromCard(t(i7));
        }
        if (z9) {
            setPattern(new i1());
        }
        Runnable runnable = this.d2;
        if (runnable != null) {
            runnable.run();
        }
        this.f1362e2 = false;
    }

    public final void d1(int i7, String str, String str2) {
        int i10;
        long currentTimeMillis = 0 - System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            postDelayed(new a1((Object) this, i7, (Object) str, (Object) str2, 0), currentTimeMillis);
            return;
        }
        this.n1 = i7;
        this.f1437m1 = str;
        this.f1457o1 = str2;
        long currentTimeMillis2 = System.currentTimeMillis();
        if (str2 != null) {
            i10 = 4000;
        } else {
            i10 = 2800;
        }
        this.f1515u1 = currentTimeMillis2 + i10;
        invalidate();
    }

    public final void e(int i7, ArrayList arrayList, boolean z9) {
        String str;
        int i10 = -1;
        if (z9 && a.h != null) {
            int i11 = 0;
            while (true) {
                int[] iArr = a.h;
                if (i11 >= iArr.length) {
                    break;
                } else if (iArr[i11] == i7) {
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (i10 < 0) {
            i10 = G9;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f1362e2 = true;
            this.M7 = i10;
            j1 j1Var = this.f1446n;
            if (j1Var == null || j1Var.f1299a != 0 || j1Var.f1303f != i10) {
                setSceneFromCard(t(i10));
            }
            this.O7 = 0.0f;
            ArrayList arrayList2 = this.I;
            arrayList2.clear();
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                TLRPC.Reaction reaction = (TLRPC.Reaction) obj;
                if (arrayList2.size() >= 6) {
                    break;
                } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                    long j3 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                    String o4 = a8.p0.o(j3, "c:");
                    HashMap hashMap = this.J;
                    if (!hashMap.containsKey(o4)) {
                        i5 m10 = i5.m(this.f1328b, j3, null, 2);
                        m10.a(this);
                        hashMap.put(o4, m10);
                    }
                    if (!arrayList2.contains(o4)) {
                        arrayList2.add(o4);
                    }
                } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
                    TLRPC.TL_reactionEmoji tL_reactionEmoji = (TLRPC.TL_reactionEmoji) reaction;
                    if (!TextUtils.isEmpty(tL_reactionEmoji.emoticon)) {
                        String str2 = tL_reactionEmoji.emoticon;
                        if (str2 != null && !str2.startsWith("c:")) {
                            str = str2.replace("️", "");
                        } else {
                            str = str2;
                        }
                        this.f1342c2.put(str, str2);
                        if (!arrayList2.contains(str)) {
                            arrayList2.add(str);
                        }
                    }
                }
            }
            c();
            this.f1362e2 = false;
            return;
        }
        d(i10);
    }

    public final void e0(int[] iArr, int i7) {
        iArr[0] = -7829368;
        iArr[1] = -11184811;
        iArr[2] = -13421773;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = ((TL_stars.TL_starGiftUnique) this.f1525v1.get(i7)).attributes;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i10);
            i10++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
                iArr[0] = stargiftattributebackdrop.center_color | (-16777216);
                iArr[1] = stargiftattributebackdrop.edge_color | (-16777216);
                iArr[2] = stargiftattributebackdrop.pattern_color | (-16777216);
            }
        }
    }

    public final float f(float f10, float f11, float f12) {
        float z9 = com.google.android.recaptcha.internal.a.z(f11, f10, 1.0f - ((float) Math.pow(1.0f - f12, this.X2)), f10);
        if (Math.abs(f11 - z9) < 0.002f) {
            return f11;
        }
        return z9;
    }

    public final int f0() {
        int size = this.f1525v1.size();
        if (!this.f1547x1 || size <= 0 || size >= 3) {
            return 3;
        }
        return size;
    }

    public final i5 g0(long j3, TLRPC.Document document) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.J7;
        i5 i5Var = (i5) hashMap.get(valueOf);
        if (i5Var == null) {
            i5 l10 = i5.l(this.f1328b, 24, document);
            l10.a(this);
            hashMap.put(Long.valueOf(j3), l10);
            return l10;
        }
        return i5Var;
    }

    public String getCurrentLink() {
        String str;
        if (this.f1524v0 && (str = this.f1359e) != null && this.f1514u0 != null) {
            return str;
        }
        if (this.f1505t0 != null) {
            return this.d;
        }
        return null;
    }

    public ArrayList<TLRPC.Reaction> getPickedEmoji() {
        ArrayList<TLRPC.Reaction> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.I;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            String str = (String) obj;
            if (str.startsWith("c:")) {
                try {
                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                    tL_reactionCustomEmoji.document_id = Long.parseLong(str.substring(2));
                    arrayList.add(tL_reactionCustomEmoji);
                } catch (NumberFormatException unused) {
                }
            } else {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                String str2 = (String) this.f1342c2.get(str);
                if (str2 != null) {
                    str = str2;
                }
                tL_reactionEmoji.emoticon = str;
                arrayList.add(tL_reactionEmoji);
            }
        }
        return arrayList;
    }

    public int getThemeBackdropIndex() {
        j1 j1Var = this.f1446n;
        if (j1Var != null && j1Var.f1299a == 0) {
            return j1Var.f1303f;
        }
        return -1;
    }

    public TL_stars.TL_starGiftUnique getThemeGift() {
        int i7;
        i1 i1Var = this.F;
        if (i1Var.f1274a == 2 && (i7 = i1Var.f1288q) >= 0) {
            ArrayList arrayList = this.f1525v1;
            if (i7 < arrayList.size()) {
                return (TL_stars.TL_starGiftUnique) arrayList.get(this.F.f1288q);
            }
            return null;
        }
        return null;
    }

    public long getThemeGiftSavedId() {
        Long l10;
        TL_stars.TL_starGiftUnique themeGift = getThemeGift();
        if (themeGift != null) {
            l10 = (Long) this.f1558y1.get(Long.valueOf(themeGift.f27181id));
        } else {
            l10 = null;
        }
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public final boolean h0() {
        if (this.f1547x1 && this.f1525v1.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i0() {
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final boolean j0(Canvas canvas) {
        if (i()) {
            if ((this.S4 || this.Z1) && canvas.isHardwareAccelerated() && a0.e(this.H1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void j1(g gVar) {
        h hVar = this.f1497s0;
        if (hVar.f1216q == 2 && hVar.f1214o < 1.0f) {
            hVar.f1212m = gVar;
            invalidate();
            return;
        }
        postDelayed(new a1.e(17, this, gVar), 40L);
    }

    public final float k1(int i7) {
        if (i7 != this.V7) {
            return 1.0f;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j3 = this.X7;
        long j10 = this.W7;
        if (j3 < j10) {
            float l10 = 1.0f - Utilities.l(((float) (currentAnimationTimeMillis - j10)) / 110.0f);
            return 1.0f - ((1.0f - (l10 * l10)) * 0.08f);
        }
        double h12 = h1(((float) (currentAnimationTimeMillis - j3)) / 1000.0f, 0.6d, 0.28d);
        if (currentAnimationTimeMillis - this.X7 > 900) {
            this.V7 = -1;
            return 1.0f;
        }
        float f10 = this.Y7;
        return ((1.0f - f10) * ((float) h12)) + f10;
    }

    public final float l() {
        return org.telegram.messenger.g0.T1(1.07f, 1.0f, this.C2) * getWidth() * 0.745f;
    }

    public final void l0() {
        if (this.U8 == null) {
            this.f1515u1 = 0L;
            return;
        }
        this.f1515u1 = 0L;
        if (this.N8) {
            this.N8 = false;
            this.M8 = AnimationUtils.currentAnimationTimeMillis();
        }
        this.V8 = true;
        invalidate();
    }

    public final float m() {
        float max = ((1.0f - Math.max(this.J2, this.C2)) * org.telegram.messenger.g0.L(16.0f)) + (((getHeight() * 0.468f) - (l() / 2.0f)) - org.telegram.messenger.g0.L(15.0f));
        float a12 = (((a1() - b1()) - org.telegram.messenger.g0.L(13.0f)) - (org.telegram.messenger.g0.L(35.0f) * Math.max(this.J2, this.C2))) - l();
        return org.telegram.messenger.g0.T1(max, Math.max(org.telegram.messenger.g0.L(51.0f) + this.f1508t3, Math.min(max, a12)), this.f1372f1);
    }

    public final k1 m1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        Long valueOf = Long.valueOf(tL_starGiftUnique.f27181id);
        HashMap hashMap = this.K7;
        k1 k1Var = (k1) hashMap.get(valueOf);
        k1 k1Var2 = k1Var;
        if (k1Var == null) {
            ?? obj = new Object();
            ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
            int size = arrayList.size();
            TLRPC.Document document = null;
            int i7 = 0;
            while (i7 < size) {
                TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i7);
                i7++;
                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                    document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                }
            }
            if (document != null) {
                g5 g5Var = new g5(org.telegram.messenger.g0.L(28.0f), this);
                obj.f1310a = g5Var;
                g5Var.i(document, false);
                obj.f1310a.a();
                obj.f1311b = document.f26958id;
            }
            hashMap.put(Long.valueOf(tL_starGiftUnique.f27181id), obj);
            k1Var2 = obj;
        }
        return k1Var2;
    }

    public final boolean n() {
        String str;
        if (this.W8 == 2131232342 && (str = this.U8) != null && !s0(str)) {
            return true;
        }
        return false;
    }

    public final boolean n0(float f10, float f11) {
        if (this.f1466p1 != null && this.N8) {
            RectF rectF = this.L8;
            if (!rectF.isEmpty()) {
                float f12 = rectF.right;
                TextPaint textPaint = this.f1559y2;
                textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
                float L = rectF.bottom + org.telegram.messenger.g0.L(6.0f);
                RectF rectF2 = this.f1476q1;
                rectF2.set((f12 - textPaint.measureText(this.f1466p1)) - org.telegram.messenger.g0.L(28.0f), rectF.top - org.telegram.messenger.g0.L(6.0f), rectF.right + org.telegram.messenger.g0.L(6.0f), L);
                return rectF2.contains(f10, f11);
            }
            return false;
        }
        return false;
    }

    public final PorterDuffColorFilter n1(int i7) {
        SparseArray sparseArray = this.f1367e7;
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) sparseArray.get(i7);
        if (porterDuffColorFilter == null) {
            if (sparseArray.size() > 96) {
                sparseArray.clear();
            }
            PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
            sparseArray.put(i7, porterDuffColorFilter2);
            return porterDuffColorFilter2;
        }
        return porterDuffColorFilter;
    }

    public final float o() {
        return l() + m() + org.telegram.messenger.g0.L(24.0f);
    }

    public final void o0(Canvas canvas, Drawable drawable, float f10, float f11, float f12, float f13) {
        drawable.setColorFilter(n1(-1));
        drawable.setAlpha((int) (f13 * 255.0f));
        float f14 = f12 / 2.0f;
        drawable.setBounds((int) (f10 - f14), (int) (f11 - f14), (int) (f10 + f14), (int) (f11 + f14));
        drawable.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        Sensor sensor;
        super.onAttachedToWindow();
        K0();
        int i7 = this.f1563y6;
        SparseIntArray sparseIntArray = this.f1552x6;
        if (i7 != 1) {
            sparseIntArray.clear();
            this.f1563y6 = 1;
        }
        int i10 = 0;
        while (true) {
            int[] iArr = a.f1115b;
            if (i10 >= iArr.length) {
                break;
            }
            ?? obj = new Object();
            int i11 = iArr[i10] | (-16777216);
            obj.f1300b = i11;
            obj.f1301c = (-16777216) | a.f1116c[i10];
            obj.h = Z0(i11);
            if (sparseIntArray.indexOfKey(obj.f1300b) < 0) {
                sparseIntArray.put(obj.f1300b, u(obj));
            }
            i10++;
        }
        qs.f(this.f1328b).c(this.f1411j2, qs.G3);
        y0();
        SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
        this.N6 = sensorManager;
        if (sensorManager != null) {
            sensor = sensorManager.getDefaultSensor(9);
        } else {
            sensor = null;
        }
        if (sensor != null) {
            this.N6.registerListener(this.O6, sensor, 1);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f1328b).n(this.f1411j2, qs.G3);
        removeCallbacks(this.f1420k2);
        SensorManager sensorManager = this.N6;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.O6);
        }
        this.L6 = false;
        this.f1495r9 = -1;
        Arrays.fill(this.f1555x9, 0L);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r47) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int top;
        super.onLayout(z9, i7, i10, i11, i12);
        int i13 = org.telegram.messenger.g0.f22531m;
        View view = this;
        int i14 = 0;
        while (true) {
            top = view.getTop() + i14;
            if (!(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
            i14 = top - view.getScrollY();
        }
        this.f1508t3 = Math.max(Math.max(0, i13 - top), (org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(9.0f)) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2));
        int height = getRootView().getHeight();
        View view2 = this;
        int i15 = 0;
        while (true) {
            int top2 = view2.getTop() + i15;
            if (!(view2.getParent() instanceof View)) {
                this.f1517u3 = jg.g.e(20.0f, org.telegram.messenger.g0.L(22.0f), Math.max(0, org.telegram.messenger.g0.f22532n - (height - (getHeight() + top2))));
                return;
            }
            view2 = (View) view2.getParent();
            i15 = top2 - view2.getScrollY();
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (i7 > 0 && i10 > 0) {
            float L = org.telegram.messenger.g0.L(12.0f);
            int ceil = ((int) Math.ceil(i7 / L)) + 1;
            int ceil2 = ((int) Math.ceil(i10 / L)) + 1;
            Bitmap bitmap = this.f1570z3;
            if (bitmap == null || bitmap.getWidth() != ceil || this.f1570z3.getHeight() != ceil2) {
                this.f1570z3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                this.A3 = new int[ceil * ceil2];
            }
        }
        super.onSizeChanged(i7, i10, i11, i12);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r40) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(float f10, float f11, float f12) {
        int i7;
        float L;
        float nextFloat;
        float f13;
        float d;
        int i10 = this.f1341c1;
        if (i10 >= 320) {
            return;
        }
        this.f1341c1 = i10 + 1;
        Random random = this.f1361e1;
        float nextFloat2 = random.nextFloat();
        if (nextFloat2 < 0.65f) {
            i7 = 0;
        } else if (nextFloat2 < 0.9f) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        byte[] bArr = this.f1319a1;
        bArr[i10] = (byte) i7;
        this.f1330b1[i10] = false;
        this.M0[i10] = ((random.nextFloat() - 0.5f) * org.telegram.messenger.g0.L(4.0f)) + f10;
        this.N0[i10] = f11;
        byte b10 = bArr[i10];
        if (b10 == 0) {
            L = org.telegram.messenger.g0.L(1.4f);
            nextFloat = random.nextFloat();
            f13 = 1.6f;
        } else if (b10 == 1) {
            d = org.telegram.ui.Cells.f1.d(0.7f, random.nextFloat(), org.telegram.messenger.g0.N(0.7f));
            this.S0[i10] = d;
            this.O0[i10] = (random.nextFloat() * org.telegram.messenger.g0.L(80.0f)) + (-org.telegram.messenger.g0.L(30.0f));
            this.P0[i10] = (-org.telegram.messenger.g0.L(50.0f)) - (random.nextFloat() * org.telegram.messenger.g0.L(100.0f));
            this.Q0[i10] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f12));
            this.R0[i10] = 0.0f;
            this.T0[i10] = random.nextFloat() * 90.0f;
            this.U0[i10] = (random.nextFloat() - 0.5f) * 1080.0f;
        } else {
            L = org.telegram.messenger.g0.L(3.0f);
            nextFloat = random.nextFloat();
            f13 = 1.5f;
        }
        d = (nextFloat * org.telegram.messenger.g0.L(f13)) + L;
        this.S0[i10] = d;
        this.O0[i10] = (random.nextFloat() * org.telegram.messenger.g0.L(80.0f)) + (-org.telegram.messenger.g0.L(30.0f));
        this.P0[i10] = (-org.telegram.messenger.g0.L(50.0f)) - (random.nextFloat() * org.telegram.messenger.g0.L(100.0f));
        this.Q0[i10] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f12));
        this.R0[i10] = 0.0f;
        this.T0[i10] = random.nextFloat() * 90.0f;
        this.U0[i10] = (random.nextFloat() - 0.5f) * 1080.0f;
    }

    public final zg0 p1() {
        if (this.Z8 == null) {
            zg0 zg0Var = new zg0(2131623989, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f));
            this.Z8 = zg0Var;
            zg0Var.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.2126f, 0.7152f, 0.0722f, 1.0f, -255.0f}));
            this.Z8.K(0);
            this.Z8.R(this);
            this.Z8.J(true);
        }
        return this.Z8;
    }

    public final void q(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, boolean z9, boolean z10) {
        float f18;
        int i7 = this.f1341c1;
        if (i7 >= 320) {
            return;
        }
        this.f1341c1 = i7 + 1;
        this.f1319a1[i7] = z9 ? (byte) 1 : (byte) 0;
        this.f1330b1[i7] = true;
        this.M0[i7] = f10;
        this.N0[i7] = f11;
        this.O0[i7] = f12;
        this.P0[i7] = f13;
        this.V0[i7] = f10;
        this.W0[i7] = f11;
        this.X0[i7] = f14;
        Random random = this.f1361e1;
        if (z10) {
            f18 = (random.nextFloat() * 3.0f) + 4.0f;
        } else {
            f18 = 0.0f;
        }
        this.Y0[i7] = f18;
        this.Z0[i7] = random.nextFloat() * 6.2832f;
        this.S0[i7] = f15;
        this.Q0[i7] = f16;
        this.R0[i7] = 0.0f;
        this.T0[i7] = f17;
        this.U0[i7] = 0.0f;
    }

    public final zg0 q1() {
        if (this.f1327a9 == null) {
            zg0 zg0Var = new zg0(2131624055, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f));
            this.f1327a9 = zg0Var;
            zg0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.f1327a9.K(0);
            this.f1327a9.R(this);
            this.f1327a9.J(true);
        }
        return this.f1327a9;
    }

    public final zg0 r1() {
        if (this.Y8 == null) {
            zg0 zg0Var = new zg0(2131624216, org.telegram.messenger.g0.L(27.0f), org.telegram.messenger.g0.L(27.0f));
            this.Y8 = zg0Var;
            zg0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.Y8.K(0);
            this.Y8.R(this);
            this.Y8.J(true);
        }
        return this.Y8;
    }

    public final boolean s0(String str) {
        if (str != null && str.equals(this.f1516u2)) {
            return true;
        }
        return false;
    }

    public final float s1(String str) {
        int indexOf = str.indexOf(10);
        TextPaint textPaint = this.C1;
        if (indexOf >= 0) {
            return Math.max(textPaint.measureText(str, 0, indexOf), textPaint.measureText(str, indexOf + 1, str.length()));
        }
        if (!s0(str)) {
            return textPaint.measureText(str);
        }
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = this.f1559y2;
        textPaint2.setTextSize(textSize);
        return textPaint.measureText(this.f1548x2) + textPaint2.measureText(this.f1537w2) + textPaint.measureText(this.f1526v2);
    }

    public void setFeeStars(long j3) {
        boolean z9;
        String str;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.K0 = z9;
        String str2 = "";
        if (i7 <= 0) {
            str = "";
        } else {
            str = hd.a0(null, null, 2131746480, hd.E(j3, ','));
        }
        int indexOf = str.indexOf(9733);
        if (indexOf >= 0) {
            str2 = str.substring(0, indexOf);
        }
        this.I0 = str2;
        if (indexOf >= 0) {
            str = str.substring(indexOf + 1);
        }
        this.J0 = str;
        if (!this.K0 && this.f1524v0) {
            U0(null);
        }
        invalidate();
    }

    public void setFreeLink(String str) {
        if (TextUtils.equals(this.f1359e, str)) {
            return;
        }
        this.f1359e = str;
        if (str == null) {
            this.f1514u0 = null;
            return;
        }
        Utilities.f21333e.c(new a1.e(18, str, new b1(this, str, 1)));
    }

    public void setGiftsOwner(long j3) {
        if (this.f1536w1 == j3) {
            return;
        }
        this.f1536w1 = j3;
        v9 v9Var = this.f1402i2;
        if (v9Var != null) {
            v9Var.f();
        }
        v9 v9Var2 = new v9(this.f1328b, j3, false);
        this.f1402i2 = v9Var2;
        v9Var2.f4911g = 776;
        v9Var2.f4909e = true;
        v9Var2.j(true);
        y0();
    }

    public void setImmediateOnOpen(boolean z9) {
        this.Z1 = z9;
    }

    public void setInstantTheme(boolean z9) {
        this.f1373f2 = z9;
    }

    public void setLinkExpires(long j3) {
        long j10 = this.G2;
        if (j10 == j3) {
            return;
        }
        if (j10 != 0 && j3 != 0) {
            i0();
        }
        this.G2 = j3;
        this.N2 = -1L;
        invalidate();
    }

    public void setOnPicksChanged(Runnable runnable) {
        this.d2 = runnable;
    }

    public void setReveal(float f10) {
        float f11;
        boolean z9;
        float f12;
        int i7;
        float sin;
        this.Q4 = f10;
        float f13 = 1.0f;
        if (this.T4) {
            double d = f10 * 0.86d;
            double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d;
            if (f10 >= 1.0f) {
                sin = 1.0f;
            } else {
                double d2 = sqrt * d;
                sin = (float) (1.0d - (((Math.sin(d2) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(d2)) * Math.exp((-9.120752865260691d) * d)));
            }
            float l10 = Utilities.l((f10 - 0.85f) / 0.15f);
            f11 = com.google.android.recaptcha.internal.a.z(1.0f, sin, com.google.android.recaptcha.internal.a.C(l10, 2.0f, 3.0f, l10 * l10), sin);
        } else {
            float f14 = 1.0f - f10;
            f11 = 1.0f - (f14 * f14);
        }
        this.U4 = f11;
        int i10 = 0;
        if (f10 < 1.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            this.S4 = true;
        }
        if (z9) {
            f12 = Math.round((1.0f - f11) * org.telegram.messenger.g0.L(64.0f));
        } else {
            f12 = 0.0f;
        }
        setTranslationY(f12);
        if (z9) {
            f13 = Utilities.l(f11 / 0.35f);
        }
        setAlpha(f13);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (z9) {
                i7 = a(f11, 1073741824);
            } else {
                i7 = 0;
            }
            view.setBackgroundColor(i7);
        }
        float f15 = -1.0f;
        if (!z9) {
            this.f1468p3 = -1.0f;
        }
        if (z9 && this.T4) {
            f15 = Utilities.l(f11);
        }
        this.f1497s0.D = f15;
        if (z9) {
            i10 = 2;
        }
        if (getLayerType() != i10) {
            setLayerType(i10, null);
        }
        invalidate();
    }

    public void setRevealOpening(boolean z9) {
        this.T4 = z9;
    }

    public void setScanHidden(boolean z9) {
        if (this.f1434l7 != z9) {
            this.f1434l7 = z9;
            invalidate();
        }
    }

    public void setTemporaryLink(boolean z9) {
        float f10;
        if (this.B2 == z9) {
            return;
        }
        this.B2 = z9;
        if (!this.H2) {
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.E2 = f10;
            this.C2 = f10;
        }
        invalidate();
    }

    public void setThemeEditable(boolean z9) {
        if (this.f1317a != z9) {
            this.f1317a = z9;
            invalidate();
        }
    }

    public void setTimerOnly(boolean z9) {
        this.f1557y0 = z9;
    }

    public final int t0() {
        int i7;
        int i10 = this.f1563y6;
        SparseIntArray sparseIntArray = this.f1552x6;
        if (i10 != 1) {
            sparseIntArray.clear();
            this.f1563y6 = 1;
        }
        j1 j1Var = this.f1446n;
        if (j1Var != null) {
            i7 = j1Var.f1300b;
        } else {
            i7 = 0;
        }
        int indexOfKey = sparseIntArray.indexOfKey(i7);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        int u10 = u(this.f1446n);
        sparseIntArray.put(i7, u10);
        return u10;
    }

    public final void u1(boolean z9) {
        long max;
        String sb2;
        if (this.f1524v0) {
            if (!this.f1535w0) {
                StringBuilder sb3 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131746489, sb3, " · ");
                sb2 = jg.g.l(2131746482, null, sb3);
                this.A2 = -1;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.A0) {
                    max = 60000;
                } else {
                    max = Math.max(0L, this.f1567z0 - currentTimeMillis);
                }
                int ceil = (int) Math.ceil(max / 1000.0d);
                if (ceil != this.A2 || this.f1569z2 == null) {
                    this.A2 = ceil;
                    StringBuilder sb4 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131746489, sb4, " · ");
                    sb4.append(hd.a0(null, null, 2131746490, String.format(Locale.US, "%d:%02d", Integer.valueOf(ceil / 60), Integer.valueOf(ceil % 60))));
                    sb2 = sb4.toString();
                } else {
                    return;
                }
            }
            if (!sb2.equals(this.f1569z2)) {
                this.f1569z2 = sb2;
                this.L0.t(sb2, z9, true);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        zg0 zg0Var;
        if ((drawable instanceof RippleDrawable) || drawable == this.L0 || drawable == this.X1 || (((zg0Var = this.f1435l8) != null && drawable == zg0Var) || super.verifyDrawable(drawable))) {
            return true;
        }
        return false;
    }

    public final Drawable w(int i7) {
        return getContext().getResources().getDrawable(i7).mutate();
    }

    public final float x1(float f10, float f11, int i7, int i10) {
        float f12 = this.f1545x;
        double max = Math.max(f12, i7 - f12);
        float f13 = this.f1556y;
        return (((1.0f - ((float) Math.pow(1.0f - Utilities.l(((float) Math.hypot(f10 - this.f1545x, f11 - this.f1556y)) / (((float) Math.hypot(max, Math.max(f13, i10 - f13))) + org.telegram.messenger.g0.L(60.0f))), 0.4166666567325592d))) * 600.0f) / 1000.0f) - 0.03f;
    }

    public final void y(Canvas canvas, Bitmap bitmap) {
        float f10 = this.f1374f3;
        float f11 = (-f10) / 2.0f;
        float width = (bitmap.getWidth() - 0.5f) * f10;
        float height = (bitmap.getHeight() - 0.5f) * f10;
        RectF rectF = this.f1363e3;
        rectF.set(f11, f11, width, height);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, this.f1332b3);
    }

    public final void y0() {
        long j3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i7;
        v9 v9Var = this.f1402i2;
        if (v9Var == null) {
            return;
        }
        i1 i1Var = this.F;
        int i10 = i1Var.f1274a;
        ArrayList arrayList = this.f1525v1;
        if (i10 == 2 && (i7 = i1Var.f1288q) >= 0 && i7 < arrayList.size()) {
            j3 = ((TL_stars.TL_starGiftUnique) arrayList.get(this.F.f1288q)).f27181id;
        } else {
            j3 = 0;
        }
        if (j3 != 0) {
            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(this.F.f1288q);
        } else {
            tL_starGiftUnique = null;
        }
        arrayList.clear();
        HashMap hashMap = this.f1558y1;
        hashMap.clear();
        ArrayList arrayList2 = v9Var.f4915l;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            TL_stars.StarGift starGift = savedStarGift.gift;
            if ((starGift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift.refunded) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) starGift;
                if (!tL_starGiftUnique2.burned) {
                    arrayList.add(tL_starGiftUnique2);
                    hashMap.put(Long.valueOf(savedStarGift.gift.f27181id), Long.valueOf(savedStarGift.saved_id));
                }
            }
        }
        if (tL_starGiftUnique != null) {
            int i13 = 0;
            while (true) {
                if (i13 < arrayList.size()) {
                    if (((TL_stars.TL_starGiftUnique) arrayList.get(i13)).f27181id == j3) {
                        break;
                    }
                    i13++;
                } else {
                    i13 = -1;
                    break;
                }
            }
            if (i13 < 0) {
                arrayList.add(0, tL_starGiftUnique);
            } else {
                i11 = i13;
            }
            this.F.f1288q = i11;
            this.L7 = i11;
        }
        boolean z9 = v9Var.f4913j;
        this.f1547x1 = z9;
        if (!z9 && !v9Var.f4912i) {
            v9Var.a();
        }
        if (!arrayList.isEmpty() && !this.f1429l2) {
            this.f1429l2 = true;
            d1 d1Var = this.f1420k2;
            removeCallbacks(d1Var);
            postDelayed(d1Var, 900L);
        }
        invalidate();
    }

    public final void z(android.graphics.Canvas r45, int r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l1.z(android.graphics.Canvas, int, int):void");
    }

    public final float z0() {
        float f10;
        int f02;
        int L;
        int L2;
        float f11;
        float A = org.telegram.messenger.camera.q.A(10.0f, 2, getWidth()) - org.telegram.messenger.g0.L(8.0f);
        int i7 = this.f1392h1;
        if (i7 == 0) {
            f10 = A / 6.0f;
            f02 = (a.f1115b.length + 5) / 6;
            L = org.telegram.messenger.g0.L(4.0f) - org.telegram.messenger.g0.L(32.0f);
            L2 = org.telegram.messenger.g0.L(4.0f);
        } else {
            if (i7 == 1) {
                f10 = A / 6.0f;
                f11 = 0.0f;
            } else if (h0()) {
                f10 = 0.0f;
                f11 = 0.0f;
            } else {
                f10 = A / 3.0f;
                f02 = ((f0() + this.f1525v1.size()) - 1) / f0();
                L = org.telegram.messenger.g0.L(4.0f) - org.telegram.messenger.g0.L(32.0f);
                L2 = org.telegram.messenger.g0.L(4.0f);
            }
            f02 = 0;
            return Math.max(0.0f, (((f02 * f10) + f11) + org.telegram.messenger.g0.L(32.0f)) - b1());
        }
        f11 = L2 + L;
        return Math.max(0.0f, (((f02 * f10) + f11) + org.telegram.messenger.g0.L(32.0f)) - b1());
    }
}
