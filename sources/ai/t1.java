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
import bi.t9;
import di.f3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.d3;
public final class t1 extends View {
    public static int[] E9;
    public static int[] F9;
    public static int[] G9;
    public static String K9;
    public static g L9;
    public static volatile byte[] O9;
    public static int P9;
    public static int Q9;
    public static int R9;
    public boolean A0;
    public final Paint A1;
    public int A2;
    public Bitmap A3;
    public final Paint A4;
    public final float[] A5;
    public boolean A6;
    public final RectF A7;
    public long A8;
    public final float[] A9;
    public float B0;
    public final Paint B1;
    public boolean B2;
    public int[] B3;
    public final float B4;
    public final boolean[] B5;
    public boolean B6;
    public final LinearGradient B7;
    public long B8;
    public final Rect[] B9;
    public float C0;
    public final TextPaint C1;
    public float C2;
    public final Paint C3;
    public final Paint C4;
    public int C5;
    public int C6;
    public final Paint C7;
    public float C8;
    public float D0;
    public final TextPaint D1;
    public float D2;
    public final RectF D3;
    public final Paint D4;
    public final LinearGradient D5;
    public final SweepGradient[] D6;
    public final Matrix D7;
    public float D8;
    public final Matrix E;
    public long E0;
    public final Path E1;
    public float E2;
    public boolean E3;
    public final RectF E4;
    public final Paint E5;
    public float E6;
    public final RectF[] E7;
    public float E8;
    public q1 F;
    public boolean F0;
    public final RectF F1;
    public long F2;
    public float F3;
    public final float[] F4;
    public final Path F5;
    public float F6;
    public float F7;
    public float F8;
    public q1 G;
    public float G0;
    public Object G1;
    public long G2;
    public float G3;
    public final float[] G4;
    public final TextPaint G5;
    public float G6;
    public float G7;
    public float G8;
    public long H;
    public final TextPaint H0;
    public Object H1;
    public boolean H2;
    public float H3;
    public final float[] H4;
    public Drawable H5;
    public float H6;
    public boolean H7;
    public float H8;
    public final ArrayList I;
    public String I0;
    public int I1;
    public long I2;
    public float I3;
    public final float[] I4;
    public StaticLayout I5;
    public float I6;
    public int I7;
    public float I8;
    public final HashMap J;
    public String J0;
    public final Drawable J1;
    public float J2;
    public float J3;
    public final float[] J4;
    public int J5;
    public float J6;
    public final RectF J7;
    public final Path J8;
    public float K;
    public boolean K0;
    public final Drawable K1;
    public float K2;
    public float K3;
    public final long[] K4;
    public final RectF K5;
    public float K6;
    public final HashMap K7;
    public final RectF K8;
    public float L;
    public final r6 L0;
    public final Drawable L1;
    public float L2;
    public float L3;
    public int L4;
    public final RectF L5;
    public float L6;
    public final HashMap L7;
    public final RectF L8;
    public float M;
    public final float[] M0;
    public final Drawable M1;
    public long M2;
    public final p1 M3;
    public float M4;
    public final Path M5;
    public boolean M6;
    public int M7;
    public final RectF M8;
    public float N;
    public final float[] N0;
    public final Drawable N1;
    public long N2;
    public float N3;
    public float N4;
    public final float[] N5;
    public long N6;
    public int N7;
    public long N8;
    public float O;
    public final float[] O0;
    public final Drawable O1;
    public String O2;
    public float O3;
    public final Paint O4;
    public float O5;
    public SensorManager O6;
    public float O7;
    public boolean O8;
    public float P;
    public final float[] P0;
    public final Drawable P1;
    public float P2;
    public float P3;
    public final Paint P4;
    public final Matrix P5;
    public final o1 P6;
    public float P7;
    public Bitmap P8;
    public float Q;
    public final float[] Q0;
    public final Drawable Q1;
    public long Q2;
    public float Q3;
    public final RectF Q4;
    public final Matrix Q5;
    public float Q6;
    public int Q7;
    public Bitmap Q8;
    public boolean R;
    public final float[] R0;
    public final Drawable R1;
    public Bitmap R2;
    public float R3;
    public float R4;
    public final LinearGradient R5;
    public float R6;
    public int R7;
    public final Paint R8;
    public boolean S;
    public final float[] S0;
    public final Drawable S1;
    public final Paint S2;
    public final Path S3;
    public float S4;
    public final LongSparseArray S5;
    public float S6;
    public long S7;
    public final Paint S8;
    public boolean T;
    public final float[] T0;
    public final u1 T1;
    public boolean T2;
    public Bitmap T3;
    public boolean T4;
    public final Path T5;
    public float T6;
    public long T7;
    public final RectF T8;
    public boolean U;
    public final float[] U0;
    public final Paint U1;
    public int U2;
    public Bitmap U3;
    public boolean U4;
    public boolean U5;
    public long U6;
    public long U7;
    public int U8;
    public long V;
    public final float[] V0;
    public final String V1;
    public boolean V2;
    public float V3;
    public float V4;
    public final RectF V5;
    public long V6;
    public final float V7;
    public String V8;
    public long W;
    public final float[] W0;
    public final j2 W1;
    public long W2;
    public float W3;
    public boolean W4;
    public final RectF W5;
    public boolean W6;
    public int W7;
    public boolean W8;
    public final float[] X0;
    public final yj0 X1;
    public float X2;
    public float X3;
    public Bitmap X4;
    public final RectF X5;
    public final Matrix X6;
    public long X7;
    public int X8;
    public final float[] Y0;
    public final Paint Y1;
    public Bitmap Y2;
    public final Paint Y3;
    public int[] Y4;
    public final LinearGradient Y5;
    public final Path Y6;
    public long Y7;
    public long Y8;
    public final float[] Z0;
    public boolean Z1;
    public Bitmap Z2;
    public final int[] Z3;
    public int Z4;
    public final LinearGradient Z5;
    public final RectF Z6;
    public float Z7;
    public yj0 Z8;
    public boolean f1680a;
    public float f1681a0;
    public final byte[] f1682a1;
    public int a2;
    public BitmapShader f1683a3;
    public final int[] f1684a4;
    public final Paint f1685a5;
    public final Matrix f1686a6;
    public final Path f1687a7;
    public final RectF f1688a8;
    public yj0 f1689a9;
    public final int f1690b;
    public float f1691b0;
    public final boolean[] f1692b1;
    public int f1693b2;
    public final Paint f1694b3;
    public final float[] f1695b4;
    public final Rect f1696b5;
    public final Paint f1697b6;
    public final Path f1698b7;
    public final TextPaint f1699b8;
    public yj0 f1700b9;
    public final rb.c f1701c;
    public float f1702c0;
    public int f1703c1;
    public final HashMap f1704c2;
    public final Paint f1705c3;
    public final float[] f1706c4;
    public final RectF f1707c5;
    public float f1708c6;
    public int f1709c7;
    public final TextPaint f1710c8;
    public Object f1711c9;
    public String d;
    public float f1712d0;
    public boolean f1713d1;
    public Runnable f1714d2;
    public final Matrix f1715d3;
    public final float[] f1716d4;
    public final int[] f1717d5;
    public long f1718d6;
    public final RectF f1719d7;
    public final TextPaint f1720d8;
    public float f1721d9;
    public String e;
    public float f1722e0;
    public final Random f1723e1;
    public boolean f1724e2;
    public final RectF f1725e3;
    public final float[] f1726e4;
    public final float[] f1727e5;
    public long f1728e6;
    public final Matrix f1729e7;
    public TextPaint f1730e8;
    public String f1731e9;
    public String f1732f;
    public float f1733f0;
    public float f1734f1;
    public boolean f1735f2;
    public float f1736f3;
    public int f1737f4;
    public final float[] f1738f5;
    public boolean f1739f6;
    public final SparseArray f7;
    public final TextPaint f1740f8;
    public long f1741f9;
    public float f1742g0;
    public float f1743g1;
    public Bitmap f1744g2;
    public boolean f1745g3;
    public float[] f1746g4;
    public final float[] f1747g5;
    public boolean f1748g6;
    public final Drawable[] g7;
    public StaticLayout f1749g8;
    public float f1750g9;
    public boolean h;
    public float f1751h0;
    public int f1752h1;
    public final int[] f1753h2;
    public boolean f1754h3;
    public float[] f1755h4;
    public final float[] f1756h5;
    public int f1757h6;
    public final RectF f1758h7;
    public int f1759h8;
    public boolean f1760h9;
    public float f1761i0;
    public float f1762i1;
    public t9 f1763i2;
    public int f1764i3;
    public float[] f1765i4;
    public final float[] f1766i5;
    public int f1767i6;
    public final RectF f1768i7;
    public boolean f1769i8;
    public float f1770i9;
    public float f1771j0;
    public float f1772j1;
    public final k1 f1773j2;
    public final float[] f1774j3;
    public int f1775j4;
    public final boolean[] f1776j5;
    public int f1777j6;
    public final RectF f1778j7;
    public final String f1779j8;
    public float f1780j9;
    public VelocityTracker f1781k0;
    public float f1782k1;
    public final l1 f1783k2;
    public final float[] f1784k3;
    public int f1785k4;
    public int f1786k5;
    public float f1787k6;
    public final RectF f1788k7;
    public final String f1789k8;
    public float f1790k9;
    public float f1791l0;
    public float l1;
    public boolean f1792l2;
    public final int[] f1793l3;
    public PorterDuffColorFilter l4;
    public float f1794l5;
    public float f1795l6;
    public final RectF f1796l7;
    public t5 f1797l8;
    public final OverScroller f1798l9;
    public float m0;
    public String f1799m1;
    public long f1800m2;
    public final int[] f1801m3;
    public int f1802m4;
    public float f1803m5;
    public float f1804m6;
    public boolean f1805m7;
    public yj0 f1806m8;
    public final ViewConfiguration f1807m9;
    public r1 f1808n;
    public float f1809n0;
    public int f1810n1;
    public long f1811n2;
    public final float[] f1812n3;
    public float f1813n4;
    public StaticLayout f1814n5;
    public float f1815n6;
    public boolean f1816n7;
    public long f1817n8;
    public VelocityTracker f1818n9;
    public float f1819o0;
    public String f1820o1;
    public long f1821o2;
    public final float[] f1822o3;
    public float f1823o4;
    public boolean f1824o5;
    public final float[] f1825o6;
    public float f1826o7;
    public boolean f1827o8;
    public boolean f1828o9;
    public float f1829p0;
    public String f1830p1;
    public float f1831p2;
    public float f1832p3;
    public float f1833p4;
    public final float[] f1834p5;
    public final Paint f1835p6;
    public float f1836p7;
    public TLRPC.TL_inputStickerSetShortName f1837p8;
    public boolean f1838p9;
    public int f1839q0;
    public final RectF f1840q1;
    public long f1841q2;
    public final double[] f1842q3;
    public float f1843q4;
    public final float[] q5;
    public float f1844q6;
    public long f1845q7;
    public TLRPC.Document f1846q8;
    public final l1 q9;
    public r1 f1847r;
    public long f1848r0;
    public boolean f1849r1;
    public final RectF f1850r2;
    public final double[] f1851r3;
    public float f1852r4;
    public final float[] f1853r5;
    public boolean r6;
    public boolean f1854r7;
    public long f1855r8;
    public final RippleDrawable[] f1856r9;
    public float f1857s;
    public final h f1858s0;
    public float f1859s1;
    public boolean f1860s2;
    public final double[] f1861s3;
    public float f1862s4;
    public final float[] f1863s5;
    public float f1864s6;
    public float f1865s7;
    public LinearGradient[] f1866s8;
    public int f1867s9;
    public g f1868t0;
    public float f1869t1;
    public float f1870t2;
    public final ArrayList f1871t3;
    public final long[] f1872t4;
    public final float[] f1873t5;
    public boolean f1874t6;
    public float f1875t7;
    public int[] f1876t8;
    public final Paint f1877t9;
    public g f1878u0;
    public long f1879u1;
    public String f1880u2;
    public int f1881u3;
    public final float[] f1882u4;
    public final float[] f1883u5;
    public Object f1884u6;
    public long f1885u7;
    public final v1 f1886u8;
    public final Path f1887u9;
    public long v;
    public boolean f1888v0;
    public final ArrayList f1889v1;
    public String f1890v2;
    public int f1891v3;
    public final float[] f1892v4;
    public final float[] f1893v5;
    public float f1894v6;
    public final RectF f1895v7;
    public int f1896v8;
    public final float[] f1897v9;
    public float f1898w;
    public boolean f1899w0;
    public long f1900w1;
    public String f1901w2;
    public float f1902w3;
    public final float[] f1903w4;
    public final float[] f1904w5;
    public int f1905w6;
    public long f1906w7;
    public int f1907w8;
    public final float[] f1908w9;
    public float f1909x;
    public boolean f1910x0;
    public boolean f1911x1;
    public String f1912x2;
    public float f1913x3;
    public final float[] f1914x4;
    public final float[] f1915x5;
    public int f1916x6;
    public float f1917x7;
    public float f1918x8;
    public final long[] x9;
    public final long f1919y;
    public boolean f1920y0;
    public final HashMap f1921y1;
    public final TextPaint f1922y2;
    public float y3;
    public final long[] f1923y4;
    public final float[] f1924y5;
    public final SparseIntArray f1925y6;
    public float f1926y7;
    public float f1927y8;
    public final long[] f1928y9;
    public long f1929z0;
    public final Paint f1930z1;
    public String f1931z2;
    public boolean f1932z3;
    public final boolean[] f1933z4;
    public final float[] f1934z5;
    public int f1935z6;
    public float f1936z7;
    public final RectF[] f1937z8;
    public final float[] f1938z9;
    public static final String[] C9 = {"❤️", "🔥", "🎉", "😎", "🚀", "💎", "💙", "✨", "⭐", "🍀", "🐸", "🦄", "🌈", "🍕", "👻", "🍒", "🌸", "⚡", "🏆", "🎁", "👀", "😍", "🥳", "🤩", "🐱", "🐶", "🦋", "🌙", "☀️", "🍓", "🍩", "🎈", "🎮", "🎧", "💜", "🌊"};
    public static final float D9 = (float) Math.atan2(-5.5d, -3.5d);
    public static int H9 = a.b("Black");
    public static int I9 = a.b("Neon Blue");
    public static final int J9 = AndroidUtilities.dp(70.0f);
    public static final float M9 = (float) Math.sin(Math.toRadians(18.0d));
    public static final float N9 = (float) Math.cos(Math.toRadians(18.0d));
    public static final ds S9 = new ds(0.16d, 1.0d, 0.3d, 1.0d);

    public t1(Context context, int i10, String str, String str2, boolean z10, rb.c cVar) {
        super(context);
        g gVar;
        this.f1680a = true;
        this.f1857s = 1.0f;
        this.f1919y = AnimationUtils.currentAnimationTimeMillis();
        this.E = new Matrix();
        this.F = new q1();
        this.I = new ArrayList();
        this.J = new HashMap();
        Paint paint = new Paint(3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.M = -1.0f;
        this.f1858s0 = new h();
        this.f1899w0 = true;
        this.f1910x0 = true;
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
        this.f1682a1 = new byte[320];
        this.f1692b1 = new boolean[320];
        this.f1723e1 = new Random();
        this.f1752h1 = 0;
        this.f1840q1 = new RectF();
        this.f1889v1 = new ArrayList();
        this.f1921y1 = new HashMap();
        this.f1930z1 = new Paint(1);
        this.A1 = new Paint(1);
        this.B1 = new Paint(1);
        this.C1 = new TextPaint(1);
        this.D1 = new TextPaint(1);
        this.E1 = new Path();
        new Path();
        this.F1 = new RectF();
        this.I1 = -1;
        this.U1 = new Paint(1);
        this.V1 = LocaleController.getString(R.string.QrScanQr);
        this.Y1 = new Paint(1);
        this.a2 = 1;
        this.f1704c2 = new HashMap();
        this.f1753h2 = new int[3];
        this.f1773j2 = new NotificationCenter.NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                t1 t1Var = t1.this;
                t1Var.getClass();
                if (objArr.length > 1 && objArr[1] == t1Var.f1763i2) {
                    t1Var.y0();
                }
            }
        };
        this.f1783k2 = new Runnable(this) {
            public final t1 f1570b;

            {
                this.f1570b = this;
            }

            @Override
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int dp;
                switch (r2) {
                    case 0:
                        t1 t1Var = this.f1570b;
                        ArrayList arrayList = t1Var.f1889v1;
                        for (int i11 = 0; i11 < Math.min(arrayList.size(), 9); i11++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i11);
                            ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
                            int size = arrayList2.size();
                            int i12 = 0;
                            while (i12 < size) {
                                TL_stars.StarGiftAttribute starGiftAttribute = arrayList2.get(i12);
                                i12++;
                                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                                if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                                    t1Var.g0(tL_starGiftUnique.f22257id, document);
                                }
                            }
                            t1Var.m1(tL_starGiftUnique);
                        }
                        return;
                    default:
                        t1 t1Var2 = this.f1570b;
                        ArrayList arrayList3 = t1Var2.I;
                        if (t1Var2.f1734f1 >= 0.5f && t1Var2.f1752h1 == 1 && !t1Var2.f1838p9) {
                            float f7 = t1Var2.f1770i9;
                            float f10 = t1Var2.f1780j9;
                            float width = (t1Var2.getWidth() - AndroidUtilities.dp(28.0f)) / 6.0f;
                            RectF rectF = t1Var2.f1895v7;
                            float dp2 = (t1Var2.f1772j1 + f10) - (rectF.top + AndroidUtilities.dp(16.0f));
                            int i13 = -1;
                            if (dp2 >= 0.0f && f7 >= AndroidUtilities.dp(14.0f) && f10 >= rectF.top + AndroidUtilities.dp(8.0f) && (dp = (((int) (dp2 / width)) * 6) + ((int) ((f7 - AndroidUtilities.dp(14.0f)) / width))) >= 0 && dp < 36) {
                                i13 = dp;
                            }
                            if (i13 >= 0) {
                                String[] strArr = t1.C9;
                                if (arrayList3.contains(strArr[i13]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i13])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    t1Var2.c();
                                    t1Var2.i0();
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
        this.f1831p2 = 1.0f;
        this.f1850r2 = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f1922y2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        this.A2 = -1;
        this.E2 = -1.0f;
        this.L2 = -1.0f;
        this.N2 = -1L;
        this.O2 = "";
        this.P2 = -1.0f;
        this.S2 = new Paint(3);
        this.X2 = 1.0f;
        this.f1694b3 = new Paint(2);
        this.f1705c3 = new Paint(3);
        this.f1715d3 = new Matrix();
        this.f1725e3 = new RectF();
        this.f1774j3 = new float[14];
        this.f1784k3 = new float[14];
        this.f1793l3 = new int[7];
        this.f1801m3 = new int[7];
        this.f1812n3 = new float[15];
        this.f1822o3 = new float[15];
        this.f1832p3 = -1.0f;
        this.f1842q3 = new double[3];
        this.f1851r3 = new double[3];
        this.f1861s3 = new double[3];
        this.f1871t3 = new ArrayList();
        this.f1881u3 = AndroidUtilities.statusBarHeight;
        this.f1891v3 = AndroidUtilities.navigationBarHeight;
        this.C3 = new Paint(2);
        this.D3 = new RectF();
        this.H3 = 5.0f;
        this.I3 = -0.7071f;
        this.J3 = 0.7071f;
        this.M3 = new p1();
        this.O3 = 1.0f;
        this.Q3 = -1.0f;
        this.S3 = new Path();
        this.V3 = -1.0f;
        this.W3 = -1.0f;
        this.X3 = -1.0f;
        Paint paint2 = new Paint(2);
        this.Y3 = paint2;
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode2));
        this.Z3 = new int[1024];
        this.f1684a4 = new int[1024];
        this.f1695b4 = new float[1024];
        this.f1706c4 = new float[1024];
        this.f1716d4 = new float[1024];
        this.f1726e4 = new float[1024];
        this.f1785k4 = -1;
        this.f1802m4 = -1;
        this.f1872t4 = new long[2048];
        this.f1882u4 = new float[2048];
        this.f1892v4 = new float[2048];
        this.f1903w4 = new float[2048];
        this.f1914x4 = new float[2048];
        this.f1923y4 = new long[2048];
        this.f1933z4 = new boolean[2048];
        Paint paint3 = new Paint(2);
        this.A4 = paint3;
        paint3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.B4 = (float) Math.random();
        this.C4 = new Paint(2);
        this.D4 = new Paint(2);
        this.E4 = new RectF();
        this.F4 = new float[96];
        this.G4 = new float[96];
        this.H4 = new float[96];
        this.I4 = new float[96];
        this.J4 = new float[96];
        this.K4 = new long[96];
        this.O4 = new Paint(2);
        Paint paint4 = new Paint(2);
        this.P4 = paint4;
        paint4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.Q4 = new RectF();
        this.R4 = 1.0f;
        this.S4 = 1.0f;
        this.U4 = true;
        this.V4 = 1.0f;
        this.f1685a5 = new Paint(2);
        this.f1696b5 = new Rect();
        this.f1707c5 = new RectF();
        this.f1717d5 = new int[4];
        this.f1727e5 = new float[4];
        this.f1738f5 = new float[4];
        this.f1747g5 = new float[240];
        this.f1756h5 = new float[240];
        this.f1766i5 = new float[240];
        this.f1776j5 = new boolean[240];
        this.f1834p5 = new float[240];
        this.q5 = new float[240];
        this.f1853r5 = new float[240];
        this.f1863s5 = new float[240];
        this.f1873t5 = new float[240];
        this.f1883u5 = new float[240];
        this.f1893v5 = new float[240];
        this.f1904w5 = new float[240];
        this.f1915x5 = new float[240];
        this.f1924y5 = new float[240];
        this.f1934z5 = new float[240];
        this.A5 = new float[240];
        this.B5 = new boolean[240];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, tileMode);
        this.D5 = linearGradient;
        Paint paint5 = new Paint(1);
        this.E5 = paint5;
        paint5.setShader(linearGradient);
        paint5.setXfermode(new PorterDuffXfermode(mode2));
        this.F5 = new Path();
        this.G5 = new TextPaint(65);
        this.K5 = new RectF();
        this.L5 = new RectF();
        this.M5 = new Path();
        this.N5 = new float[7];
        this.P5 = new Matrix();
        this.Q5 = new Matrix();
        this.R5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, new float[]{0.0f, 0.88f, 1.0f}, tileMode);
        this.S5 = new LongSparseArray();
        this.T5 = new Path();
        this.V5 = new RectF();
        this.W5 = new RectF();
        this.X5 = new RectF();
        this.Y5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 16777215, -1, tileMode);
        this.Z5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, tileMode);
        this.f1686a6 = new Matrix();
        this.f1697b6 = new Paint();
        this.f1804m6 = 0.85f;
        this.f1825o6 = new float[320];
        Paint paint6 = new Paint();
        this.f1835p6 = paint6;
        PorterDuff.Mode mode3 = PorterDuff.Mode.DST_IN;
        paint6.setXfermode(new PorterDuffXfermode(mode3));
        this.f1844q6 = 1.0f;
        this.r6 = true;
        this.f1894v6 = -1.0f;
        this.f1905w6 = -1;
        this.f1925y6 = new SparseIntArray();
        this.f1935z6 = -1;
        this.C6 = -1;
        this.D6 = new SweepGradient[4];
        this.P6 = new o1(this);
        this.X6 = new Matrix();
        this.Y6 = new Path();
        this.Z6 = new RectF();
        this.f1687a7 = new Path();
        this.f1698b7 = new Path();
        this.f1709c7 = -1;
        this.f1719d7 = new RectF();
        this.f1729e7 = new Matrix();
        this.f7 = new SparseArray();
        this.f1758h7 = new RectF();
        this.f1768i7 = new RectF();
        this.f1778j7 = new RectF();
        this.f1788k7 = new RectF();
        this.f1796l7 = new RectF();
        this.f1826o7 = 1.0f;
        this.f1836p7 = 1.0f;
        this.f1865s7 = 1.0f;
        this.f1875t7 = 1.0f;
        this.f1895v7 = new RectF();
        this.A7 = new RectF();
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{0, 805306368, -1627389952, -285212672, -16777216}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f}, tileMode);
        this.B7 = linearGradient2;
        Paint paint7 = new Paint();
        this.C7 = paint7;
        paint7.setXfermode(new PorterDuffXfermode(mode3));
        paint7.setShader(linearGradient2);
        this.D7 = new Matrix();
        this.E7 = new RectF[]{new RectF(), new RectF(), new RectF(), new RectF(), new RectF(), new RectF()};
        this.F7 = -1.0f;
        this.G7 = -1.0f;
        this.J7 = new RectF();
        this.K7 = new HashMap();
        this.L7 = new HashMap();
        this.M7 = -1;
        this.N7 = H9;
        this.Q7 = -1;
        this.R7 = -1;
        this.V7 = AndroidUtilities.dp(20.17f);
        this.W7 = -1;
        this.Y7 = -1L;
        this.Z7 = 1.0f;
        this.f1688a8 = new RectF();
        this.f1699b8 = new TextPaint(1);
        this.f1710c8 = new TextPaint(1);
        this.f1720d8 = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(129);
        this.f1740f8 = textPaint2;
        textPaint2.setXfermode(new PorterDuffXfermode(mode2));
        this.f1779j8 = LocaleController.getString(R.string.QrNoGiftsTitle);
        this.f1789k8 = LocaleController.getString(R.string.QrBrowseGifts);
        int[] iArr = a.f1416b;
        this.f1866s8 = new LinearGradient[iArr.length];
        this.f1876t8 = new int[iArr.length];
        this.f1886u8 = new v1(0);
        this.f1896v8 = -100;
        this.f1907w8 = -100;
        this.f1937z8 = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.J8 = new Path();
        this.K8 = new RectF();
        this.L8 = new RectF();
        this.M8 = new RectF();
        this.R8 = new Paint(3);
        this.S8 = new Paint(1);
        this.T8 = new RectF();
        this.f1721d9 = -1.0f;
        this.f1798l9 = new OverScroller(getContext());
        this.f1807m9 = ViewConfiguration.get(getContext());
        this.q9 = new Runnable(this) {
            public final t1 f1570b;

            {
                this.f1570b = this;
            }

            @Override
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int dp;
                switch (r2) {
                    case 0:
                        t1 t1Var = this.f1570b;
                        ArrayList arrayList = t1Var.f1889v1;
                        for (int i11 = 0; i11 < Math.min(arrayList.size(), 9); i11++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i11);
                            ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
                            int size = arrayList2.size();
                            int i12 = 0;
                            while (i12 < size) {
                                TL_stars.StarGiftAttribute starGiftAttribute = arrayList2.get(i12);
                                i12++;
                                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                                if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                                    t1Var.g0(tL_starGiftUnique.f22257id, document);
                                }
                            }
                            t1Var.m1(tL_starGiftUnique);
                        }
                        return;
                    default:
                        t1 t1Var2 = this.f1570b;
                        ArrayList arrayList3 = t1Var2.I;
                        if (t1Var2.f1734f1 >= 0.5f && t1Var2.f1752h1 == 1 && !t1Var2.f1838p9) {
                            float f7 = t1Var2.f1770i9;
                            float f10 = t1Var2.f1780j9;
                            float width = (t1Var2.getWidth() - AndroidUtilities.dp(28.0f)) / 6.0f;
                            RectF rectF = t1Var2.f1895v7;
                            float dp2 = (t1Var2.f1772j1 + f10) - (rectF.top + AndroidUtilities.dp(16.0f));
                            int i13 = -1;
                            if (dp2 >= 0.0f && f7 >= AndroidUtilities.dp(14.0f) && f10 >= rectF.top + AndroidUtilities.dp(8.0f) && (dp = (((int) (dp2 / width)) * 6) + ((int) ((f7 - AndroidUtilities.dp(14.0f)) / width))) >= 0 && dp < 36) {
                                i13 = dp;
                            }
                            if (i13 >= 0) {
                                String[] strArr = t1.C9;
                                if (arrayList3.contains(strArr[i13]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i13])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    t1Var2.c();
                                    t1Var2.i0();
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
        this.f1856r9 = new RippleDrawable[12];
        ColorStateList.valueOf(738197503);
        ColorStateList.valueOf(335544320);
        this.f1867s9 = -1;
        this.f1877t9 = new Paint(1);
        this.f1887u9 = new Path();
        this.f1897v9 = new float[12];
        this.f1908w9 = new float[12];
        this.x9 = new long[12];
        this.f1928y9 = new long[12];
        this.f1938z9 = new float[12];
        this.A9 = new float[12];
        this.B9 = new Rect[12];
        for (int i11 = 0; i11 < 12; i11++) {
            this.B9[i11] = new Rect();
        }
        this.f1690b = i10;
        this.d = str;
        this.f1732f = str2;
        this.h = z10;
        this.f1701c = cVar;
        this.L1 = w(R.drawable.msg_share);
        this.M1 = w(R.drawable.msg_download);
        this.N1 = w(R.drawable.msg_qr_scan);
        this.U1.setTypeface(AndroidUtilities.bold());
        Drawable w10 = w(R.drawable.msg_colors);
        this.O1 = w10;
        Drawable w11 = w(R.drawable.input_smile);
        this.P1 = w11;
        Drawable w12 = w(R.drawable.menu_gift);
        this.Q1 = w12;
        this.W1 = new j2(true);
        this.R1 = w(R.drawable.msg_retry);
        this.S1 = w(R.drawable.msg_recent);
        this.T1 = new u1();
        this.J1 = w(R.drawable.msg_copy);
        this.K1 = w(R.drawable.menu_premium_main);
        this.g7 = new Drawable[]{w10, w11, w12};
        yj0 yj0Var = new yj0(R.raw.plane_logo_plain, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
        this.X1 = yj0Var;
        yj0Var.R(this);
        yj0Var.K(1);
        yj0Var.setCallback(this);
        yj0Var.start();
        Paint paint8 = this.Y1;
        Paint.Style style = Paint.Style.STROKE;
        paint8.setStyle(style);
        this.Y1.setStrokeCap(Paint.Cap.ROUND);
        this.Y1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.C1.setTextSize(AndroidUtilities.dp(11.0f));
        this.D1.setTypeface(AndroidUtilities.bold());
        this.A1.setStyle(style);
        r6 r6Var = new r6(false, true, true);
        this.L0 = r6Var;
        r6Var.w(AndroidUtilities.dp(11.0f));
        r6Var.n(0.35f, 280L, ds.h);
        r6Var.setCallback(this);
        r6Var.f32142b = 3;
        r1 t10 = t(H9);
        this.f1808n = t10;
        this.f1709c7 = W0(t10.f1665c);
        if (str != null) {
            String str3 = this.d;
            if (str3.equals(K9) && (gVar = L9) != null) {
                this.f1868t0 = gVar;
            } else {
                g c10 = h.c(str3, AndroidUtilities.dp(240.0f), jc.c.M, 0.75f, null);
                this.f1868t0 = c10;
                L9 = c10;
                K9 = str3;
            }
            this.f1858s0.a(this.f1868t0);
        }
        u1(false);
    }

    public static void C0(double d, double d10, double d11, double[] dArr) {
        double d12 = (0.2158037573d * d11) + (0.3963377774d * d10) + d;
        double d13 = (d - (0.1055613458d * d10)) - (0.0638541728d * d11);
        double d14 = (d - (d10 * 0.0894841775d)) - (d11 * 1.291485548d);
        double d15 = d12 * d12 * d12;
        double d16 = d13 * d13 * d13;
        double d17 = d14 * d14 * d14;
        dArr[0] = (0.2309699292d * d17) + ((4.0767416621d * d15) - (3.3077115913d * d16));
        dArr[1] = ((2.6097574011d * d16) + ((-1.2684380046d) * d15)) - (0.3413193965d * d17);
        dArr[2] = (d17 * 1.707614701d) + ((d15 * (-0.0041960863d)) - (d16 * 0.7034186147d));
    }

    public static int D0(float f7, float f10, float f11, int i10) {
        float f12;
        float i12 = i1(Color.red(i10));
        float i13 = i1(Color.green(i10));
        float i14 = i1(Color.blue(i10));
        float cbrt = (float) Math.cbrt((0.051445995f * i14) + (0.53633255f * i13) + (0.41222146f * i12));
        float cbrt2 = (float) Math.cbrt((0.10739696f * i14) + (0.6806995f * i13) + (0.2119035f * i12));
        float f13 = i14 * 0.6299787f;
        float cbrt3 = (float) Math.cbrt(f13 + (i13 * 0.28171885f) + (i12 * 0.08830246f));
        float f14 = (0.4505937f * cbrt3) + ((1.9779985f * cbrt) - (2.4285922f * cbrt2));
        float f15 = ((cbrt2 * 0.78277177f) + (cbrt * 0.025904037f)) - (cbrt3 * 0.80867577f);
        float hypot = (float) Math.hypot(f14, f15);
        if (hypot > 1.0E-5f) {
            f12 = Math.min(f11, f10 * hypot) / hypot;
        } else {
            f12 = 0.0f;
        }
        float f16 = f14 * f12;
        float f17 = f15 * f12;
        float f18 = (0.21580376f * f17) + (0.39633778f * f16) + f7;
        float f19 = (f7 - (0.105561346f * f16)) - (0.06385417f * f17);
        float f20 = (f7 - (f16 * 0.08948418f)) - (f17 * 1.2914855f);
        float f21 = f18 * f18 * f18;
        float f22 = f19 * f19 * f19;
        float f23 = f20 * f20 * f20;
        return Color.rgb(w0((0.23096994f * f23) + ((4.0767417f * f21) - (3.3077116f * f22))), w0(((2.6097574f * f22) + ((-1.268438f) * f21)) - (0.34131938f * f23)), w0((f23 * 1.7076147f) + ((f21 * (-0.0041960864f)) - (f22 * 0.7034186f))));
    }

    public static float S(float f7, float f10) {
        float f11 = f7 - 1.0f;
        return c3.h0.u(f10, f11, f11, ((f10 + 1.0f) * f11 * f11 * f11) + 1.0f);
    }

    public static int W0(int i10) {
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        o1(i10, dArr);
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            return -1;
        }
        b0(0.96d, Math.min(0.06d, hypot * 0.7d), Math.atan2(dArr[2], dArr[1]), dArr2);
        return Color.rgb((int) Math.round(r(d0(r(dArr2[0]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[1]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[2]))) * 255.0d));
    }

    public static int Z0(int i10) {
        double[] dArr = new double[3];
        i0.a.j(i10, dArr);
        return i0.a.o(i0.a.b(Math.min(96.0d, dArr[0] + 24.0d), dArr[1] * 0.75d, dArr[2] * 0.75d), 26);
    }

    public static int a(float f7, int i10) {
        return i0.a.o(i10, (int) (Utilities.clamp01(f7) * Color.alpha(i10)));
    }

    public static void b0(double d, double d10, double d11, double[] dArr) {
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        C0(d, d10 * cos, d10 * sin, dArr);
        if (p0(dArr)) {
            return;
        }
        double d12 = 0.0d;
        double d13 = d10;
        for (int i10 = 0; i10 < 14; i10++) {
            double d14 = (d12 + d13) / 2.0d;
            C0(d, d14 * cos, d14 * sin, dArr);
            if (p0(dArr)) {
                d12 = d14;
            } else {
                d13 = d14;
            }
        }
        C0(d, d12 * cos, d12 * sin, dArr);
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

    public static int e1(int i10) {
        if (a.h != null) {
            return i10;
        }
        if (a.f1419g == null) {
            int length = a.f1415a.length;
            int[] iArr = new int[length];
            boolean[] zArr = new boolean[length];
            int i11 = 0;
            for (int i12 = 0; i12 < 80; i12++) {
                int b10 = a.b(a.f1418f[i12]);
                if (b10 >= 0 && !zArr[b10]) {
                    zArr[b10] = true;
                    iArr[i11] = b10;
                    i11++;
                }
            }
            for (int i13 = 0; i13 < length; i13++) {
                if (!zArr[i13]) {
                    iArr[i11] = i13;
                    i11++;
                }
            }
            a.f1419g = iArr;
        }
        return a.f1419g[i10];
    }

    public static float f1(boolean z10, boolean z11, float f7) {
        if (z10) {
            if (f7 > 0.0f) {
                return d3.v(f7, 0.18f, 1.0f, 0.0f);
            }
        } else {
            if (!z11) {
                f7 -= 0.135f;
            }
            if (f7 <= 0.0f) {
                return 0.0f;
            }
            if (f7 < 0.315f) {
                return h(f7 / 0.315f);
            }
        }
        return 1.0f;
    }

    public static int g(float f7, int i10) {
        return (((int) (Math.max(0.0f, Math.min(1.0f, f7)) * 255.0f)) << 24) | (i10 & 16777215);
    }

    public static float g1(float f7, float f10, float f11) {
        float clamp01 = Utilities.clamp01((f11 - f7) / (f10 - f7));
        return c3.h0.D(clamp01, 2.0f, 3.0f, clamp01 * clamp01);
    }

    public static float h(float f7) {
        float f10 = f7 - 1.0f;
        return c3.h0.u(f10, 1.70158f, f10, (2.70158f * f10 * f10 * f10) + 1.0f);
    }

    public static double h1(double d, double d10, double d11) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d12 = 6.283185307179586d / d11;
        double d13 = 1.0d - (d10 * d10);
        double sqrt = Math.sqrt(d13) * d12;
        double d14 = sqrt * d;
        return 1.0d - (((Math.sin(d14) * (d10 / Math.sqrt(d13))) + Math.cos(d14)) * Math.exp(((-d10) * d12) * d));
    }

    public static boolean i() {
        if (b0.f() && LiteMode.isEnabled(256)) {
            return true;
        }
        return false;
    }

    public static float i1(int i10) {
        float f7 = i10 / 255.0f;
        if (f7 <= 0.04045f) {
            return f7 / 12.92f;
        }
        return (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float j(long j10, float f7, float f10) {
        if (j10 == 0) {
            return 1.0f;
        }
        float currentAnimationTimeMillis = ((float) (AnimationUtils.currentAnimationTimeMillis() - j10)) / 320.0f;
        if (currentAnimationTimeMillis <= 0.0f || currentAnimationTimeMillis >= 1.0f) {
            return 1.0f;
        }
        if (currentAnimationTimeMillis < 0.25f) {
            return (f7 * ((float) Math.sin((currentAnimationTimeMillis * 1.5707963267948966d) / 0.25d))) + 1.0f;
        }
        if (currentAnimationTimeMillis < 0.6f) {
            float f11 = (currentAnimationTimeMillis - 0.25f) / 0.35f;
            return AndroidUtilities.lerp(f7 + 1.0f, 1.0f - f10, c3.h0.D(f11, 2.0f, 3.0f, f11 * f11));
        }
        float f12 = (currentAnimationTimeMillis - 0.6f) / 0.4f;
        return AndroidUtilities.lerp(1.0f - f10, 1.0f, c3.h0.D(f12, 2.0f, 3.0f, f12 * f12));
    }

    public static void k() {
        if (E9 == null) {
            int length = a.f1416b.length;
            E9 = new int[length];
            F9 = new int[length];
            G9 = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                E9[i10] = x(a.f1416b[i10], false);
                F9[i10] = x(a.f1417c[i10], true);
                G9[i10] = v(E9[i10], F9[i10]);
            }
        }
    }

    public static float k0(int i10, int i11, int i12) {
        int i13 = i12 * 1442695041;
        int i14 = i13 + (i11 * 668265263) + (i10 * 374761393);
        int i15 = ((i14 >>> 13) ^ i14) * 1274126177;
        return ((i15 ^ (i15 >>> 16)) & 65535) / 65535.0f;
    }

    public static int l1(int i10, int i11) {
        int i12 = i10 | (-16777216);
        int i13 = i11 | (-16777216);
        if (i0.a.g(i12, i13) < 1.15d) {
            double[] dArr = new double[3];
            i0.a.j(i12, dArr);
            for (int i14 = 0; i14 < 40 && i0.a.g(i12, i13) < 1.15d; i14++) {
                double max = Math.max(0.0d, dArr[0] - 2.0d);
                dArr[0] = max;
                i12 = i0.a.b(max, dArr[1], dArr[2]);
            }
        }
        return i0.a.o(i12, 95);
    }

    public static boolean m0(RectF rectF, float f7, float f10) {
        float dp = AndroidUtilities.dp(8.0f);
        if (!rectF.isEmpty() && f7 >= rectF.left - dp && f7 <= rectF.right + dp && f10 >= rectF.top - dp && f10 <= rectF.bottom + dp) {
            return true;
        }
        return false;
    }

    public static void o1(int i10, double[] dArr) {
        double v02 = v0(Color.red(i10) / 255.0d);
        double v03 = v0(Color.green(i10) / 255.0d);
        double v04 = v0(Color.blue(i10) / 255.0d);
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
            double d10 = dArr[1];
            if (d10 >= -1.0E-4d && d10 <= 1.0001d) {
                double d11 = dArr[2];
                if (d11 >= -1.0E-4d && d11 <= 1.0001d) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Bitmap q0(Bitmap bitmap, Bitmap bitmap2, int i10) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i11 = width * height;
        int[] iArr = new int[i11];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i12 = 16777215 & i10;
        int i13 = i10 >>> 24;
        for (int i14 = 0; i14 < i11; i14++) {
            iArr[i14] = ((((iArr[i14] >>> 24) * i13) / 255) << 24) | i12;
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

    public static Bitmap r0(q1 q1Var, Bitmap bitmap, boolean z10) {
        if (z10) {
            Bitmap bitmap2 = q1Var.f1646m;
            if (bitmap2 == null || q1Var.f1647n != bitmap || q1Var.f1649p != q1Var.f1643j) {
                q1Var.f1646m = q0(bitmap, bitmap2, q1Var.f1643j);
                q1Var.f1647n = bitmap;
                q1Var.f1649p = q1Var.f1643j;
            }
            return q1Var.f1646m;
        }
        Bitmap bitmap3 = q1Var.f1644k;
        if (bitmap3 == null || q1Var.f1645l != bitmap || q1Var.f1648o != q1Var.f1643j) {
            q1Var.f1644k = q0(bitmap, bitmap3, q1Var.f1643j);
            q1Var.f1645l = bitmap;
            q1Var.f1648o = q1Var.f1643j;
        }
        return q1Var.f1644k;
    }

    public static void s(int[] iArr, byte[] bArr, int i10) {
        int i11 = 16777215 & i10;
        int i12 = i10 >>> 24;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            iArr[i13] = ((((bArr[i13] & 255) * i12) / 255) << 24) | i11;
        }
    }

    private void setPattern(q1 q1Var) {
        boolean z10;
        if (this.f1735f2) {
            q1 q1Var2 = this.G;
            if (q1Var2 != null && q1Var2 != this.F) {
                P0(q1Var2);
            }
            q1 q1Var3 = this.F;
            if (q1Var3 != q1Var) {
                P0(q1Var3);
            }
            this.G = null;
            this.F = q1Var;
            if (q1Var.f1637a == 2) {
                Z(q1Var);
                if (q1Var.e == null) {
                    q1Var.f1640f = this.f1744g2;
                }
            }
            this.H = AnimationUtils.currentAnimationTimeMillis() - 10000;
            invalidate();
            return;
        }
        if (this.f1857s < 1.0f && this.f1847r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        q1Var.h = z10;
        if (q1Var.f1637a == 2) {
            Z(q1Var);
            if (q1Var.e == null) {
                q1Var.f1640f = this.f1744g2;
            }
        }
        q1 q1Var4 = this.G;
        if (q1Var4 != null && q1Var4 != this.F) {
            P0(q1Var4);
        }
        this.G = this.F;
        this.F = q1Var;
        this.H = AnimationUtils.currentAnimationTimeMillis();
        invalidate();
    }

    private void setSceneFromCard(r1 r1Var) {
        Y0(r1Var, getWidth() / 2.0f, (l() / 2.0f) + m());
        if (this.f1735f2) {
            return;
        }
        this.f1831p2 = j(this.f1811n2, 0.03f, 0.005f);
        this.f1811n2 = AnimationUtils.currentAnimationTimeMillis();
    }

    public static r1 t(int i10) {
        ?? obj = new Object();
        obj.f1663a = 0;
        obj.f1666f = i10;
        if (i10 == I9) {
            obj.f1664b = -12602881;
            obj.f1665c = -15308082;
            obj.d = a.d[i10];
        } else {
            obj.f1664b = x(a.f1416b[i10], false);
            obj.f1665c = x(a.f1417c[i10], true);
            obj.d = a.d[i10];
        }
        if (i10 == I9) {
            obj.e = -16747023;
        } else {
            k();
            obj.e = G9[i10];
        }
        obj.h = Z0(obj.f1664b);
        obj.f1667g = h.k(0.5f, obj.f1664b, obj.f1665c);
        return obj;
    }

    public static float t1(float f7, float f10, float f11) {
        float dpf2 = (f7 - f11) / AndroidUtilities.dpf2(1.7f);
        float dpf22 = f10 / AndroidUtilities.dpf2(3.2f);
        float w12 = w1(dpf2 * 2.6f, dpf22 * 1.7f, 91) * 0.32f;
        return AndroidUtilities.dpf2(3.6f) * ((w12 + (w1(dpf2, dpf22, 17) * 0.68f)) - 0.5f);
    }

    public static int u(r1 r1Var) {
        int i10;
        double d;
        int i11;
        if (r1Var != null) {
            i10 = i0.a.f(0.5f, r1Var.f1664b, r1Var.f1665c);
        } else {
            i10 = -16777216;
        }
        if (r1Var != null) {
            d = i0.a.h(r1Var.f1664b);
        } else {
            d = 0.3d;
        }
        float[] fArr = w1.f1965b;
        float max = (fArr[10] / 100.0f) * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - d) / 0.45d)));
        float f7 = (fArr[11] / 100.0f) + 1.0f;
        float f10 = ((0.5f - (f7 * 0.5f)) + max) * 255.0f;
        int k10 = i0.a.k(g((fArr[3] + fArr[9]) / 100.0f, 16777215), Color.rgb(Math.max(0, Math.min(255, Math.round((Color.red(i10) * f7) + f10))), Math.max(0, Math.min(255, Math.round((Color.green(i10) * f7) + f10))), Math.max(0, Math.min(255, Math.round((f7 * Color.blue(i10)) + f10)))));
        if (r1Var != null) {
            i11 = r1Var.h;
        } else {
            i11 = 1073741824;
        }
        return i0.a.k(i11, k10);
    }

    public static double u0(int i10, int i11) {
        long j10 = (i11 * (-4417276706812531889L)) ^ (i10 * (-7046029254386353131L));
        long j11 = (j10 ^ (j10 >>> 31)) * (-4658895280553007687L);
        long j12 = (j11 ^ (j11 >>> 27)) * (-7723592293110705685L);
        return ((j12 ^ (j12 >>> 31)) >>> 11) / 9.007199254740992E15d;
    }

    public static int v(int i10, int i11) {
        double d;
        double d10;
        double atan2;
        double min;
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        double[] dArr3 = new double[3];
        o1(i11, dArr);
        o1(i10, dArr2);
        double d11 = dArr[0];
        if (d11 < 0.45d) {
            d = d11 - 0.03d;
        } else {
            d = 2.0d;
        }
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            double d12 = (dArr[1] * 0.6d) + (dArr2[1] * 0.4d);
            double d13 = (dArr[2] * 0.6d) + (dArr2[2] * 0.4d);
            atan2 = Math.atan2(d13, d12);
            d10 = 2.0d;
            min = Math.min(0.012d, Math.hypot(d12, d13));
        } else {
            d10 = 2.0d;
            atan2 = Math.atan2(dArr[2], dArr[1]);
            min = Math.min((hypot * 1.25d) + 0.02d, 0.2d);
        }
        double d14 = 0.9d;
        double d15 = 0.2d;
        int i12 = 0;
        while (i12 < 12) {
            double d16 = (d15 + d14) / d10;
            double d17 = atan2;
            double d18 = min;
            b0(d16, d18, d17, dArr3);
            if (1.05d / (((r(dArr3[2]) * 0.0722d) + ((r(dArr3[1]) * 0.7152d) + (r(dArr3[0]) * 0.2126d))) + 0.05d) > 4.4d) {
                d15 = d16;
            } else {
                d14 = d16;
            }
            i12++;
            min = d18;
            atan2 = d17;
        }
        double d19 = atan2;
        double d20 = min;
        double d21 = (d15 + d14) / d10;
        if (d21 > d) {
            d21 = Math.max(0.05d, d);
        }
        b0(d21, d20, d19, dArr3);
        return Color.rgb((int) Math.round(r(d0(r(dArr3[0]))) * 255.0d), (int) Math.round(r(d0(r(dArr3[1]))) * 255.0d), (int) Math.round(r(d0(r(dArr3[2]))) * 255.0d));
    }

    public static double v0(double d) {
        if (d <= 0.04045d) {
            return d / 12.92d;
        }
        return Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    public static float v1(float f7) {
        int floor = (int) Math.floor(f7);
        float f10 = f7 - floor;
        float D = c3.h0.D(f10, 2.0f, 3.0f, f10 * f10);
        float c02 = c0(Math.sin(floor * 127.1d) * 43758.5453d);
        return ((c0(Math.sin((floor + 1) * 127.1d) * 43758.5453d) - c02) * D) + c02;
    }

    public static int w0(float f7) {
        float pow;
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        if (max <= 0.0031308f) {
            pow = max * 12.92f;
        } else {
            pow = (((float) Math.pow(max, 0.4166666567325592d)) * 1.055f) - 0.055f;
        }
        return Math.round(Math.max(0.0f, Math.min(1.0f, pow)) * 255.0f);
    }

    public static float w1(float f7, float f10, int i10) {
        int floor = (int) Math.floor(f7);
        int floor2 = (int) Math.floor(f10);
        float f11 = f7 - floor;
        float f12 = f10 - floor2;
        float D = c3.h0.D(f11, 2.0f, 3.0f, f11 * f11);
        float D2 = c3.h0.D(f12, 2.0f, 3.0f, f12 * f12);
        float k02 = k0(floor, floor2, i10);
        int i11 = floor + 1;
        float k03 = k0(i11, floor2, i10);
        int i12 = floor2 + 1;
        float k04 = k0(floor, i12, i10);
        float k05 = k0(i11, i12, i10);
        float z10 = c3.h0.z(k03, k02, D, k02);
        return (((((k05 - k04) * D) + k04) - z10) * D2) + z10;
    }

    public static int x(int i10, boolean z10) {
        double[] dArr = new double[3];
        i0.a.j(i10, dArr);
        if (!z10) {
            return i10;
        }
        double max = Math.max(0.0d, dArr[0] - 3.0d);
        dArr[0] = max;
        double d = dArr[1] * 1.03d;
        dArr[1] = d;
        double d10 = dArr[2] * 1.03d;
        dArr[2] = d10;
        return i0.a.b(max, d, d10);
    }

    public static PorterDuffColorFilter x0(q1 q1Var) {
        float[] fArr = w1.f1965b;
        int i10 = ((int) (fArr[14] * 10.0f)) ^ q1Var.f1652s;
        if (q1Var.f1654u == null || q1Var.f1653t != i10) {
            q1Var.f1653t = i10;
            q1Var.f1654u = new PorterDuffColorFilter(i0.a.f(fArr[14] / 100.0f, q1Var.f1652s, -1), PorterDuff.Mode.SRC_IN);
        }
        return q1Var.f1654u;
    }

    public static float y1(float f7) {
        return 1.0f - ((float) Math.pow(1.0f - f7, 2.4000000953674316d));
    }

    public final void A(android.graphics.Canvas r48, int r49) {
        throw new UnsupportedOperationException("Method not decompiled: ai.t1.A(android.graphics.Canvas, int):void");
    }

    public final PorterDuffColorFilter A0(q1 q1Var) {
        float[] fArr = w1.f1965b;
        int i10 = ((int) (fArr[30] * 10.0f)) ^ (q1Var.f1652s * 31);
        if (this.l4 == null || this.f1802m4 != i10) {
            this.f1802m4 = i10;
            this.l4 = new PorterDuffColorFilter(i0.a.f(fArr[30] / 100.0f, q1Var.f1652s, -1), PorterDuff.Mode.SRC_IN);
        }
        return this.l4;
    }

    public final void B(android.graphics.Canvas r79, int r80) {
        throw new UnsupportedOperationException("Method not decompiled: ai.t1.B(android.graphics.Canvas, int):void");
    }

    public final void B0() {
        rb.c cVar;
        f1 f1Var;
        if (!this.f1724e2 && (cVar = this.f1701c) != null && (f1Var = ((z0) cVar.f47358b).e) != null) {
            f1Var.i();
        }
    }

    public final void C(Canvas canvas, Path path, RectF rectF, float f7, float f10) {
        float f11;
        int i10;
        int i11;
        RectF rectF2;
        float f12;
        float f13;
        float[][] fArr;
        float f14;
        float f15;
        int i12;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        int i13;
        int i14;
        int i15;
        Path path2 = path;
        int i16 = 1;
        if (path2 == null) {
            if (this.A6) {
                i15 = 1;
            } else if (this.B6) {
                i15 = 2;
            } else {
                i15 = 0;
            }
            if (a0.a(canvas, rectF, f7, i15, f10)) {
                return;
            }
        }
        int i17 = this.C6;
        SweepGradient[] sweepGradientArr = this.D6;
        int i18 = 4;
        float[][] fArr2 = w1.f1964a;
        if (i17 != 1) {
            this.C6 = 1;
            int i19 = 0;
            while (i19 < i18) {
                float[] fArr3 = fArr2[i19];
                int i20 = i18;
                int[] iArr = new int[73];
                int i21 = i16;
                float[] fArr4 = new float[73];
                int i22 = 0;
                for (int i23 = 73; i22 < i23; i23 = 73) {
                    int i24 = i19;
                    double radians = Math.toRadians(i22 * 5);
                    float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr3[6]);
                    if (((float) Math.sin(radians)) < 0.0f) {
                        f11 = fArr3[11];
                    } else {
                        f11 = fArr3[12];
                    }
                    float f22 = f11 / 100.0f;
                    iArr[i22] = g(Math.min(1.0f, (((fArr3[5] / 100.0f) - f22) * pow) + f22), 0);
                    fArr4[i22] = i22 / 72.0f;
                    i22++;
                    i19 = i24;
                }
                int i25 = i19;
                sweepGradientArr[i25] = new SweepGradient(0.0f, 0.0f, iArr, fArr4);
                i19 = i25 + 1;
                i18 = i20;
                i16 = i21;
            }
        }
        int i26 = i16;
        int i27 = i18;
        if (this.A6) {
            i10 = i26;
        } else if (this.B6) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        float[] fArr5 = fArr2[i10];
        float f23 = this.E6;
        float[] fArr6 = w1.f1965b;
        float f24 = f23 * fArr6[0];
        float f25 = (this.F6 * fArr6[i26]) / 100.0f;
        float dpf2 = AndroidUtilities.dpf2(fArr5[8]);
        if (dpf2 != 0.0f) {
            rectF2 = this.f1719d7;
            rectF2.set(rectF);
            rectF2.inset(dpf2, dpf2);
            if (path2 != null) {
                float width = rectF2.width() / Math.max(1.0f, rectF.width());
                float height = rectF2.height() / Math.max(1.0f, rectF.height());
                float centerX = rectF.centerX();
                float centerY = rectF.centerY();
                i11 = i10;
                Matrix matrix = this.X6;
                matrix.setScale(width, height, centerX, centerY);
                Path path3 = this.Y6;
                path2.transform(matrix, path3);
                path2 = path3;
            } else {
                i11 = i10;
            }
            f12 = Math.max(0.0f, f7 - dpf2);
        } else {
            i11 = i10;
            rectF2 = rectF;
            f12 = f7;
        }
        Matrix matrix2 = this.f1729e7;
        matrix2.setRotate(f24);
        matrix2.postScale(rectF2.width() / Math.max(1.0f, rectF2.height()), 1.0f);
        matrix2.postTranslate(rectF2.centerX(), rectF2.centerY());
        float dpf22 = AndroidUtilities.dpf2(fArr5[i27]);
        if (dpf22 > 0.05f) {
            SweepGradient sweepGradient = sweepGradientArr[i11];
            sweepGradient.setLocalMatrix(matrix2);
            Paint paint = this.A1;
            paint.setShader(sweepGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f10 * 255.0f));
            if (path2 == null) {
                paint.setStrokeWidth(dpf22);
                RectF rectF3 = this.W5;
                rectF3.set(rectF2);
                float f26 = (-dpf22) / 2.0f;
                rectF3.inset(f26, f26);
                float f27 = (dpf22 / 2.0f) + f12;
                canvas.drawRoundRect(rectF3, f27, f27, paint);
            } else {
                canvas.save();
                b0.b(canvas, path2);
                paint.setStrokeWidth(dpf22 * 2.0f);
                canvas.drawPath(path2, paint);
                canvas.restore();
            }
            paint.setShader(null);
            paint.setAlpha(255);
        }
        double radians2 = Math.toRadians(f24);
        float f28 = (float) (-Math.sin(radians2));
        float cos = (float) Math.cos(radians2);
        float dpf23 = AndroidUtilities.dpf2(fArr5[0]);
        float dpf24 = AndroidUtilities.dpf2(fArr5[2]);
        if (this.B6) {
            f13 = 0.0f;
        } else {
            f13 = this.f1708c6 * ((fArr6[21] * 1.25f) / 100.0f);
        }
        int i28 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
        if (i28 > 0 && this.f1932z3) {
            fArr = fArr2;
            f14 = c1(rectF2.centerX(), rectF2.top, getWidth(), getHeight());
        } else {
            fArr = fArr2;
            f14 = 0.0f;
        }
        if (i28 > 0 && this.f1932z3) {
            f15 = c1(rectF2.centerX(), rectF2.bottom, getWidth(), getHeight());
        } else {
            f15 = 0.0f;
        }
        float min = Math.min(1.0f, ((f14 * f13) + 1.0f) * (f25 + 1.0f) * (fArr5[i26] / 100.0f));
        float min2 = Math.min(1.0f, ((f13 * f15) + 1.0f) * (1.0f - f25) * (fArr5[3] / 100.0f));
        if (Build.VERSION.SDK_INT >= 29) {
            i12 = i26;
        } else {
            i12 = 0;
        }
        int i29 = 0;
        for (int i30 = 2; i29 < i30; i30 = 2) {
            if (i29 == 0) {
                f16 = dpf23;
            } else {
                f16 = -dpf24;
            }
            if (i29 == 0) {
                f17 = min;
            } else {
                f17 = min2;
            }
            if (f17 <= 0.004f || Math.abs(f16) < 0.1f) {
                f18 = f12;
                f19 = min;
                f20 = min2;
                f21 = f28;
                i13 = i12;
                i14 = i26;
            } else {
                canvas.save();
                Path path4 = this.f1687a7;
                f19 = min;
                Path path5 = this.f1698b7;
                if (path2 == null) {
                    f20 = min2;
                    f21 = f28;
                    float min3 = Math.min(f12, Math.min(rectF2.width(), rectF2.height()) / 2.0f);
                    path4.rewind();
                    Path.Direction direction = Path.Direction.CW;
                    path4.addRoundRect(rectF2, min3, min3, direction);
                    f18 = f12;
                    RectF rectF4 = this.Z6;
                    rectF4.set(rectF2);
                    i13 = i12;
                    rectF4.offset(f21 * f16, f16 * cos);
                    path5.rewind();
                    path5.addRoundRect(rectF4, min3, min3, direction);
                } else {
                    f18 = f12;
                    f20 = min2;
                    f21 = f28;
                    i13 = i12;
                    path4.set(path2);
                    path5.set(path2);
                    path5.offset(f21 * f16, f16 * cos);
                }
                b0.b(canvas, path5);
                Paint paint2 = this.f1930z1;
                if (i13 == 0) {
                    float f29 = fArr[i11][10];
                    int i31 = this.f1709c7;
                    paint2.setColor(Color.rgb(Math.max(0, Math.min(255, Math.round(((Color.red(i31) - 255) * f29) + 255.0f))), Math.max(0, Math.min(255, Math.round(((Color.green(i31) - 255) * f29) + 255.0f))), Math.max(0, Math.min(255, Math.round(((Color.blue(i31) - 255) * f29) + 255.0f)))));
                    paint2.setAlpha((int) (f17 * 255.0f * f10));
                    i14 = i26;
                } else {
                    int round = Math.round(Math.max(0.0f, Math.min(1.0f, f17)) * 255.0f);
                    paint2.setColor(round | (round << 16) | (-16777216) | (round << 8));
                    paint2.setAlpha((int) (f10 * 255.0f));
                    i14 = i26;
                    b0.i(paint2, i14);
                }
                canvas.drawPath(path4, paint2);
                if (i13 != 0) {
                    b0.i(paint2, 0);
                }
                canvas.restore();
            }
            i29++;
            i26 = i14;
            min = f19;
            min2 = f20;
            f28 = f21;
            f12 = f18;
            i12 = i13;
        }
    }

    public final void D(android.graphics.Canvas r18, ai.q1 r19, int r20, float r21, float r22, float r23, float r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: ai.t1.D(android.graphics.Canvas, ai.q1, int, float, float, float, float, float):void");
    }

    public final void E(Canvas canvas, int i10, int i11, q1 q1Var, q1 q1Var2, float f7, boolean z10, boolean z11) {
        float f10;
        float f11;
        boolean z12;
        float f12;
        int i12;
        float f13;
        boolean z13;
        float f14;
        float f15;
        int i13;
        int i14;
        t1 t1Var = this;
        q1 q1Var3 = q1Var;
        q1 q1Var4 = q1Var2;
        t1Var.X(q1Var3);
        t1Var.X(q1Var4);
        float dp = AndroidUtilities.dp(86.0f);
        float dp2 = AndroidUtilities.dp(70.0f);
        float dp3 = AndroidUtilities.dp(90.0f) * 1.3f;
        float f16 = t1Var.K + t1Var.N;
        float f17 = t1Var.L + t1Var.O;
        float f18 = -dp3;
        boolean z14 = true;
        int ceil = ((int) Math.ceil(((i11 + dp3) - f17) / dp2)) + 1;
        AndroidUtilities.dp(24.0f);
        int floor = ((int) Math.floor((f18 - f17) / dp2)) - 1;
        while (floor <= ceil) {
            int i15 = floor & 1;
            if (i15 == 0) {
                f10 = 0.0f;
            } else {
                f10 = dp / 2.0f;
            }
            boolean z15 = z14;
            int floor2 = ((int) Math.floor(((f18 - f16) - f10) / dp)) - 1;
            int i16 = i10;
            float f19 = dp3;
            int ceil2 = ((int) Math.ceil((((i16 + dp3) - f16) - f10) / dp)) + 1;
            while (floor2 <= ceil2) {
                float f20 = dp2;
                int i17 = ceil2;
                double u02 = u0(floor, floor2);
                if (c0(53.1d * u02) < 0.2f) {
                    f11 = f16;
                    i14 = floor2;
                    i12 = ceil;
                    i13 = floor;
                    f14 = f10;
                    f13 = dp;
                    z13 = z15;
                    f15 = f18;
                } else {
                    t1Var.G0(u02, 3.0f, 10.0f);
                    float f21 = f18;
                    float f22 = (float) (2.0d * u02 * 3.141592653589793d);
                    f11 = f16;
                    float e = t1Var.M4 + b10.e(floor2, dp, f10, f16);
                    float sin = (((float) Math.sin((t1Var.N3 * 0.45f) + f22)) * AndroidUtilities.dp(3.0f)) + (floor * f20) + f17 + t1Var.N4;
                    if (i15 == 0) {
                        z12 = z15;
                    } else {
                        z12 = false;
                    }
                    float dp4 = AndroidUtilities.dp(38.0f);
                    if (z12) {
                        f12 = 1.3f;
                    } else {
                        f12 = 0.9f;
                    }
                    float f23 = dp4 * f12;
                    i12 = ceil;
                    float f24 = (float) u02;
                    float C = c3.h0.C(f24, 0.16f, 0.92f, f23);
                    f13 = dp;
                    z13 = z15;
                    f14 = f10;
                    f15 = f21;
                    int i18 = floor2;
                    i13 = floor;
                    i14 = i18;
                    if (J0(e, sin, C, i16, i11, 0, floor, i18, (Math.max(0.0f, (C / AndroidUtilities.dp(24.0f)) - 1.0f) * 0.8f) + 1.0f)) {
                        if (z12) {
                            C *= 0.9f;
                        }
                        float f25 = C;
                        float sin2 = (((float) Math.sin((this.N3 * 0.3f) + f22)) * 4.0f) + ((f24 - 0.5f) * 26.0f);
                        float c02 = c0(59.3d * u02) * 0.3f;
                        int i19 = (i14 - ((i13 - i15) / 2)) - i13;
                        int length = q1Var4.f1638b.length;
                        int i20 = ((i19 % length) + length) % length;
                        float c03 = c0(71.9d * u02);
                        if (q1Var3 == null) {
                            D(canvas, q1Var4, i20, f25, sin2, f22 * 2.0f, f1(z10, z11, f7 - c02), c03);
                        } else {
                            q1 q1Var5 = q1Var4;
                            Drawable[] drawableArr = q1Var3.f1638b;
                            int length2 = drawableArr.length;
                            int i21 = ((i19 % length2) + length2) % length2;
                            if (drawableArr[i21] == q1Var5.f1638b[i20]) {
                                D(canvas, q1Var5, i20, f25, sin2, f22 * 2.0f, 1.0f, c03);
                            } else {
                                float f26 = f22 * 2.0f;
                                float f27 = f7 - c02;
                                D(canvas, q1Var3, i21, f25, sin2, f26, f1(z13, false, f27), c03);
                                D(canvas, q1Var2, i20, f25, sin2, f26, f1(false, false, f27), c03);
                            }
                        }
                    }
                }
                floor2 = i14 + 1;
                t1Var = this;
                i16 = i10;
                q1Var3 = q1Var;
                q1Var4 = q1Var2;
                floor = i13;
                f18 = f15;
                ceil2 = i17;
                f10 = f14;
                f16 = f11;
                ceil = i12;
                dp = f13;
                z15 = z13;
                dp2 = f20;
            }
            floor++;
            t1Var = this;
            q1Var3 = q1Var;
            q1Var4 = q1Var2;
            z14 = z15;
            dp2 = dp2;
            dp3 = f19;
        }
    }

    public final void E0(q1 q1Var, Bitmap bitmap) {
        q1Var.e = bitmap;
        if (bitmap != null) {
            if (w1.f1965b[35] > 0.5f) {
                Y(bitmap);
            }
            x0(q1Var);
        }
        q1Var.f1641g = AnimationUtils.currentAnimationTimeMillis();
        this.f1744g2 = bitmap;
        invalidate();
    }

    public final void F(android.graphics.Canvas r96, int r97, int r98, ai.q1 r99, boolean r100, boolean r101, float r102) {
        throw new UnsupportedOperationException("Method not decompiled: ai.t1.F(android.graphics.Canvas, int, int, ai.q1, boolean, boolean, float):void");
    }

    public final void F0(int i10) {
        if (!this.f1680a) {
            return;
        }
        if (i10 == 2 && !UserConfig.getInstance(this.f1690b).isPremium()) {
            d1(0, LocaleController.getString(R.string.QrPremiumGiftsToast), LocaleController.getString(R.string.QrPremiumSubscribe));
            i0();
            return;
        }
        if (i10 == 2 && (this.f1752h1 != i10 || this.f1734f1 < 0.5f)) {
            AnimationUtils.currentAnimationTimeMillis();
        }
        this.f1752h1 = i10;
        this.f1762i1 = i10;
        this.f1772j1 = 0.0f;
        this.f1798l9.forceFinished(true);
        if (this.f1734f1 > 0.5f) {
            this.f1718d6 = AnimationUtils.currentAnimationTimeMillis();
        }
        if (this.f1743g1 < 0.5f) {
            this.I2 = AnimationUtils.currentAnimationTimeMillis();
        }
        this.f1743g1 = 1.0f;
        l0();
        if (this.f1752h1 == 2) {
            y0();
        }
        i0();
    }

    public final void G(Canvas canvas, RectF rectF, int i10) {
        float centerY = rectF.centerY();
        float dp = AndroidUtilities.dp(12.0f);
        r6 r6Var = this.L0;
        float c10 = r6Var.c() + AndroidUtilities.dp(2.0f) + dp;
        float dp2 = rectF.left + AndroidUtilities.dp(8.0f);
        O(canvas, dp2, centerY, dp, i10, true);
        r6Var.u(i10);
        r6Var.setBounds((int) (dp2 + dp + AndroidUtilities.dp(2.0f)), (int) (centerY - AndroidUtilities.dp(8.0f)), (int) (dp2 + c10 + AndroidUtilities.dp(40.0f)), (int) (centerY + AndroidUtilities.dp(8.0f)));
        r6Var.draw(canvas);
    }

    public final void G0(double d, float f7, float f10) {
        double d10;
        float c02 = ((c0(31.7d * d) * (f10 - f7)) + f7) * AndroidUtilities.dp(1.0f);
        float c03 = (c0(37.1d * d) * 11.0f) + 9.0f;
        if (c0(43.3d * d) < 0.5f) {
            d10 = -1.0d;
        } else {
            d10 = 1.0d;
        }
        double d11 = (d * 6.283d) + ((((d10 * 2.0d) * 3.141592653589793d) * this.N3) / c03);
        this.M4 = ((float) Math.cos(d11)) * c02;
        this.N4 = c02 * ((float) Math.sin(d11));
    }

    public final void H(Canvas canvas, RectF rectF, float f7) {
        int i10;
        r1 r1Var = this.f1808n;
        if (r1Var != null) {
            i10 = i0.a.f(0.5f, r1Var.f1664b, r1Var.f1665c);
        } else {
            i10 = -12947803;
        }
        Paint paint = this.f1930z1;
        paint.setColor(i10 | (-16777216));
        paint.setAlpha((int) (Utilities.clamp01(f7) * 224.4f));
        canvas.drawRect(rectF, paint);
    }

    public final float H0() {
        return (a1() - b1()) + AndroidUtilities.dp(8.0f);
    }

    public final void I(android.graphics.Canvas r29, int r30, org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r31, float r32, float r33, float r34, float r35) {
        throw new UnsupportedOperationException("Method not decompiled: ai.t1.I(android.graphics.Canvas, int, org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, float, float, float, float):void");
    }

    public final void I0(float f7, float f10, int i10) {
        Path path;
        int i11;
        int i12;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f1889v1.get(i10);
        ?? obj = new Object();
        obj.f1663a = 2;
        obj.f1666f = i10;
        final q1 q1Var = new q1();
        q1Var.f1637a = 2;
        q1Var.f1650q = i10;
        long j10 = tL_starGiftUnique.f22257id;
        q1Var.f1651r = (int) (j10 ^ (j10 >>> 32));
        ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
        int size = arrayList.size();
        int i13 = 0;
        int i14 = 0;
        while (i14 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i14);
            i14++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) && (document2 = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document) != null) {
                q1Var.A = document2;
                q1Var.f1639c = t5.m(this.f1690b, 9, document2);
            } else if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                q1Var.f1658z = document;
                q1Var.d = t5.m(this.f1690b, 24, document);
            }
        }
        e0(i10, this.f1753h2);
        obj.f1664b = x(this.f1753h2[0], false);
        int x9 = x(this.f1753h2[1], true);
        obj.f1665c = x9;
        obj.d = this.f1753h2[2];
        obj.e = v(obj.f1664b, x9);
        obj.h = Z0(obj.f1664b);
        obj.f1667g = h.k(0.5f, obj.f1664b, obj.f1665c);
        q1Var.f1643j = l1(obj.d, obj.f1664b);
        i0.a.j(l1(obj.d, obj.f1664b) | (-16777216), r9);
        double min = Math.min(97.0d, r9[0] + 20.0d);
        double[] dArr = {min};
        Color.colorToHSV(i0.a.b(min, dArr[1], dArr[2]), r3);
        float[] fArr = {0.0f, Math.min(1.0f, fArr[1] * 1.15f)};
        q1Var.f1652s = Color.HSVToColor(fArr) | (-16777216);
        q1Var.v.setColorFilter(new PorterDuffColorFilter(q1Var.f1652s, PorterDuff.Mode.SRC_IN));
        q1Var.f1653t = -1;
        q1Var.B = tL_starGiftUnique;
        t5 t5Var = q1Var.f1639c;
        if (t5Var != null) {
            t5Var.a(this);
        }
        t5 t5Var2 = q1Var.d;
        if (t5Var2 != null) {
            t5Var2.a(this);
        }
        TLRPC.Document document3 = q1Var.f1658z;
        if (document3 != null) {
            int i15 = 0;
            while (true) {
                if (i15 < document3.thumbs.size()) {
                    if (document3.thumbs.get(i15) instanceof TLRPC.TL_photoPathSize) {
                        path = ((TLRPC.TL_photoPathSize) document3.thumbs.get(i15)).svgPath;
                        break;
                    }
                    i15++;
                } else {
                    path = null;
                    break;
                }
            }
            if (path != null) {
                while (true) {
                    if (i13 < document3.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = document3.attributes.get(i13);
                        if (((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) && (i11 = documentAttribute.f22035w) > 0 && (i12 = documentAttribute.h) > 0) {
                            break;
                        }
                        i13++;
                    } else {
                        i11 = 512;
                        i12 = 512;
                        break;
                    }
                }
                final Path path2 = new Path(path);
                float f11 = J9;
                final float f12 = f11 / i11;
                final float f13 = f11 / i12;
                final int i16 = q1Var.f1643j;
                Utilities.globalQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap;
                        float f14 = f12;
                        float f15 = f13;
                        int i17 = i16;
                        Path path3 = path2;
                        try {
                            int i18 = t1.J9;
                            bitmap = Bitmap.createBitmap(i18, i18, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmap);
                            canvas.scale(f14, f15);
                            Paint paint = new Paint(1);
                            paint.setColor(i17);
                            canvas.drawPath(path3, paint);
                            bitmap.prepareToDraw();
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            bitmap = null;
                        }
                        AndroidUtilities.runOnUIThread(new a3.l0(t1.this, q1Var, bitmap, 2));
                    }
                });
            }
        }
        this.I.clear();
        Y0(obj, f7, f10);
        if (!this.f1735f2) {
            this.f1831p2 = j(this.f1811n2, 0.03f, 0.005f);
            this.f1811n2 = AnimationUtils.currentAnimationTimeMillis();
        }
        setPattern(q1Var);
    }

    public final void J(Canvas canvas, RectF rectF, float f7, float f10) {
        RectF rectF2;
        float f11;
        RectF rectF3;
        boolean z10;
        float f12;
        char c10;
        char c11;
        int i10;
        double d;
        float f13;
        float f14;
        if (f10 <= 0.0f) {
            return;
        }
        if (this.B6) {
            float min = Math.min(0.0f, AndroidUtilities.dpf2(w1.f1964a[2][8]));
            rectF3 = this.X5;
            rectF2 = rectF;
            rectF3.set(rectF2);
            rectF3.inset(min, min);
            f11 = f7 - min;
        } else {
            rectF2 = rectF;
            f11 = f7;
            rectF3 = rectF2;
        }
        if (!j0(canvas) && this.Y2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.Y2 != null && this.f1683a3 != null) {
            float f15 = this.f1736f3;
            Matrix matrix = this.f1715d3;
            matrix.setScale(f15, f15);
            float f16 = (-f15) / 2.0f;
            matrix.postTranslate(f16, f16);
            this.f1683a3.setLocalMatrix(matrix);
            Paint paint = this.f1705c3;
            paint.setAlpha((int) (Utilities.clamp01(f10) * 255.0f));
            canvas.drawRoundRect(rectF3, f11, f11, paint);
            paint.setAlpha(255);
        }
        Path path = this.E1;
        path.rewind();
        path.addRoundRect(rectF3, f11, f11, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        float[] fArr = w1.f1965b;
        if (z10) {
            f12 = 0.0f;
            c10 = '\t';
            c11 = 3;
        } else if (b0.f() && j0(canvas)) {
            int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            f12 = 0.0f;
            if (i11 < 0) {
                canvas.saveLayerAlpha(rectF3, (int) (f10 * 255.0f));
            }
            if (this.f1874t6 && this.f1864s6 > 0.004f) {
                canvas.save();
                canvas.scale(8.0f, 8.0f);
                if (this.f1884u6 == null) {
                    this.f1884u6 = android.support.v4.media.session.x.d("qrSheetLift");
                }
                float round = Math.round(this.f1864s6 * 50.0f) / 50.0f;
                c10 = '\t';
                r1 r1Var = this.f1808n;
                if (r1Var != null) {
                    i10 = r1Var.f1664b;
                } else {
                    i10 = 0;
                }
                if (round == this.f1894v6 && this.f1905w6 == 1 && this.f1916x6 == i10) {
                    c11 = 3;
                } else {
                    this.f1894v6 = round;
                    this.f1905w6 = 1;
                    this.f1916x6 = i10;
                    Object obj = this.f1884u6;
                    if (r1Var != null) {
                        d = i0.a.h(r1Var.f1664b);
                    } else {
                        d = 0.3d;
                    }
                    c11 = 3;
                    float c12 = a1.g.c(fArr[11], 100.0f, round, 1.0f);
                    float max = ((0.5f - (c12 * 0.5f)) + ((fArr[10] / 100.0f) * round * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - d) / 0.45d))))) * 255.0f;
                    b0.k(obj, Math.max(0.5f, AndroidUtilities.dpf2(AndroidUtilities.lerp(fArr[2], fArr[12], round)) / 8.0f), new float[]{c12, 0.0f, 0.0f, 0.0f, max, 0.0f, c12, 0.0f, 0.0f, max, 0.0f, 0.0f, c12, 0.0f, max, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                }
                Canvas a2 = b0.a((getWidth() + 7) / 8, (getHeight() + 7) / 8, this.f1884u6);
                a2.scale(0.125f, 0.125f);
                b0.c(a2, this.G1);
                b0.d(this.f1884u6);
                b0.c(canvas, this.f1884u6);
                canvas.restore();
            } else {
                c10 = '\t';
                c11 = 3;
                Object obj2 = this.H1;
                canvas.save();
                canvas.scale(9.0f, 9.0f);
                b0.c(canvas, obj2);
                canvas.restore();
            }
            if (i11 < 0) {
                canvas.restore();
            }
        } else {
            f12 = 0.0f;
            c10 = '\t';
            c11 = 3;
            H(canvas, rectF3, f10);
        }
        int i12 = this.U8;
        if (i12 == 0) {
            float f17 = fArr[c11];
            if (this.f1874t6) {
                f14 = fArr[c10] * this.f1864s6;
            } else {
                f14 = f12;
            }
            i12 = g((f17 + f14) / 100.0f, 16777215);
        }
        Paint paint2 = this.f1930z1;
        paint2.setColor(i12);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * f10));
        canvas.drawRect(rectF3, paint2);
        a0.b(canvas, rectF3, f10);
        boolean z11 = this.f1874t6;
        if (!z11 && !this.B6) {
            f13 = (fArr[21] / 100.0f) * this.f1708c6;
        } else {
            f13 = f12;
        }
        if ((f13 > f12 || fArr[39] > f12) && this.f1932z3 && !z11 && !this.B6) {
            int width = getWidth();
            int height = getHeight();
            float c13 = c1(rectF3.left, rectF3.centerY(), width, height);
            float c14 = c1(rectF3.centerX(), rectF3.centerY(), width, height);
            float c15 = c1(rectF3.right, rectF3.centerY(), width, height);
            if (c13 + c14 + c15 > 0.01f) {
                float f18 = ((fArr[39] * 1.25f) / 100.0f) * this.f1708c6 * 0.1f;
                float f19 = c14 * f18 * f10;
                float centerX = rectF3.centerX();
                L(rectF3.left, centerX, c13 * f18 * f10, f19, canvas, rectF3);
                L(centerX, rectF3.right, f19, f18 * c15 * f10, canvas, rectF3);
            }
        }
        canvas.restore();
        C(canvas, null, rectF2, f7, f10);
    }

    public final boolean J0(float r39, float r40, float r41, int r42, int r43, int r44, int r45, int r46, float r47) {
        throw new UnsupportedOperationException("Method not decompiled: ai.t1.J0(float, float, float, int, int, int, int, int, float):boolean");
    }

    public final void K(Canvas canvas) {
        float f7;
        float dp;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float g12;
        int i12;
        Bitmap bitmap;
        float f13;
        float dp2;
        Canvas canvas2 = canvas;
        if (this.f1782k1 <= 0.001f) {
            return;
        }
        float dp3 = AndroidUtilities.dp(222.0f);
        float dp4 = AndroidUtilities.dp(46.0f);
        float dp5 = AndroidUtilities.dp(54.0f);
        AndroidUtilities.dp(8.0f);
        if (this.f1920y0) {
            f7 = dp4 + dp4;
        } else {
            f7 = dp4 + dp5 + dp4;
        }
        int i13 = (this.f1734f1 > 0.5f ? 1 : (this.f1734f1 == 0.5f ? 0 : -1));
        RectF rectF = this.K5;
        if (i13 > 0) {
            dp = (rectF.bottom + AndroidUtilities.dp(6.0f)) - f7;
        } else {
            dp = rectF.top - AndroidUtilities.dp(6.0f);
        }
        float f14 = dp;
        float width = (getWidth() - dp3) / 2.0f;
        RectF rectF2 = this.L8;
        rectF2.set(width, f14, dp3 + width, f7 + f14);
        float f15 = this.F8;
        float f16 = this.G8;
        float clamp01 = Utilities.clamp01(this.f1782k1);
        float lerp = AndroidUtilities.lerp(rectF.left, rectF2.left, f15);
        float lerp2 = AndroidUtilities.lerp(rectF.top, rectF2.top, f16);
        float lerp3 = AndroidUtilities.lerp(rectF.right, rectF2.right, f15);
        float lerp4 = AndroidUtilities.lerp(rectF.bottom, rectF2.bottom, f16);
        RectF rectF3 = this.K8;
        rectF3.set(lerp, lerp2, lerp3, lerp4);
        float min = Math.min(rectF3.height() / 2.0f, Math.min(rectF3.width() / 2.0f, AndroidUtilities.lerp(rectF.height() / 2.0f, AndroidUtilities.dp(22.0f), Utilities.clamp01(f16))));
        float max = Math.max(-0.25f, Math.min(1.0f, this.H8 / 9.0f)) * AndroidUtilities.dp(5.0f);
        float f17 = rectF3.left;
        float f18 = rectF3.top;
        float f19 = rectF3.right;
        float f20 = 1.0f;
        float f21 = rectF3.bottom;
        float centerX = rectF3.centerX();
        Path path = this.J8;
        path.rewind();
        float f22 = f17 + min;
        path.moveTo(f22, f18);
        float f23 = f19 - min;
        path.lineTo(f23, f18);
        float f24 = f18 + min;
        path.quadTo(f19, f18, f19, f24);
        float f25 = f21 - min;
        path.lineTo(f19, f25);
        path.quadTo(f19, f21, f23, f21);
        float f26 = f21 + max;
        path.cubicTo(AndroidUtilities.lerp(f23, centerX, 0.55f), f26, AndroidUtilities.lerp(f22, centerX, 0.55f), f26, f22, f21);
        path.quadTo(f17, f21, f17, f25);
        path.lineTo(f17, f24);
        path.quadTo(f17, f18, f22, f18);
        path.close();
        RectF rectF4 = this.F1;
        rectF4.set(f17, f18, f19, Math.max(0.0f, max) + f21);
        canvas2.save();
        canvas2.clipPath(path);
        float f27 = 255.0f;
        if (b0.f() && j0(canvas)) {
            Object obj = this.H1;
            canvas2.save();
            canvas2.scale(9.0f, 9.0f);
            b0.c(canvas2, obj);
            canvas2.restore();
        } else if (this.Y2 != null) {
            Paint paint = this.f1694b3;
            paint.setAlpha((int) (Utilities.clamp01(1.0f) * 255.0f));
            Bitmap bitmap2 = this.Y2;
            if (bitmap2 != null) {
                y(canvas2, bitmap2);
            }
            paint.setAlpha(255);
        } else {
            H(canvas2, rectF4, 1.0f);
        }
        Paint paint2 = this.f1930z1;
        paint2.setColor(352321535);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * 1.0f));
        canvas2.drawRect(rectF4, paint2);
        a0.b(canvas2, rectF4, 1.0f);
        canvas2.restore();
        C(canvas2, path, rectF4, 0.0f, 1.0f);
        canvas2.save();
        canvas2.clipPath(path);
        float f28 = clamp01 / 0.3f;
        float clamp012 = 1.0f - Utilities.clamp01(f28);
        float f29 = 0.004f;
        float f30 = 0.15f;
        boolean z10 = false;
        int i14 = 1;
        if (clamp012 > 0.004f) {
            canvas2.saveLayerAlpha(rectF4, (int) (clamp012 * 255.0f));
            float clamp013 = 1.0f - (Utilities.clamp01(f28) * 0.15f);
            canvas2.scale(clamp013, clamp013, rectF.centerX(), rectF.centerY());
            this.U5 = true;
            int width2 = getWidth();
            System.currentTimeMillis();
            B(canvas2, width2);
            this.U5 = false;
            canvas2.restore();
        }
        float centerX2 = rectF3.centerX() - rectF2.centerX();
        float f31 = rectF3.top - rectF2.top;
        float f32 = 0.6f;
        if (Math.abs(this.H8) < 0.6f) {
            centerX2 = Math.round(centerX2);
            f31 = Math.round(f31);
        }
        canvas2.save();
        canvas2.translate(centerX2, f31);
        TextPaint textPaint = this.C1;
        textPaint.setSubpixelText(true);
        textPaint.setLinearText(false);
        boolean z11 = this.f1910x0;
        String string = LocaleController.getString(R.string.QrNoPaidMenuReset);
        if (z11) {
            i10 = R.string.QrNoPaidMenuDisableTimer;
        } else {
            i10 = R.string.QrNoPaidMenuEnableTimer;
        }
        String[] strArr = {string, LocaleController.getString(i10), LocaleController.getString(R.string.QrNoPaidMenuRestoreFee)};
        if (this.f1910x0) {
            i11 = R.string.QrNoPaidMenuDisableTimerInfo;
        } else {
            i11 = R.string.QrNoPaidMenuEnableTimerInfo;
        }
        String[] strArr2 = {null, LocaleController.getString(i11), null};
        int i15 = 0;
        float f33 = f14;
        while (i15 < 3) {
            RectF[] rectFArr = this.f1937z8;
            if (i15 == i14 && this.f1920y0) {
                rectFArr[i15].setEmpty();
                i12 = i15;
                f11 = f27;
                f12 = f29;
            } else {
                if (strArr2[i15] != null) {
                    f10 = dp5;
                } else {
                    f10 = dp4;
                }
                f11 = f27;
                f12 = f29;
                float f34 = f33 + f10;
                rectFArr[i15].set(rectF2.left, f33, rectF2.right, f34);
                if (this.l1 > 0.5f) {
                    g12 = g1(f30, f32, clamp01);
                } else {
                    g12 = g1(f32, f20, clamp01);
                }
                if (g12 <= f12) {
                    i12 = i15;
                } else {
                    M(canvas2, i15, rectFArr[i15], z10);
                    canvas2.save();
                    float f35 = (f10 / 2.0f) + f33;
                    if (i15 == 2) {
                        i12 = i15;
                        o0(canvas2, this.K1, rectF2.left + AndroidUtilities.dp(26.0f), f35, AndroidUtilities.dp(20.0f), g12);
                        canvas2 = canvas;
                    } else {
                        i12 = i15;
                        if (i12 == 0) {
                            canvas2 = canvas;
                            o0(canvas2, this.R1, rectF2.left + AndroidUtilities.dp(26.0f), f35, AndroidUtilities.dp(20.0f), g12);
                        } else {
                            canvas2 = canvas;
                            boolean z12 = this.f1910x0;
                            if (z12) {
                                bitmap = this.P8;
                            } else {
                                bitmap = this.Q8;
                            }
                            if (bitmap != null) {
                                f13 = 26.0f;
                            } else {
                                int round = Math.round(AndroidUtilities.dp(22.4f));
                                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ALPHA_8);
                                f13 = 26.0f;
                                Canvas canvas3 = new Canvas(createBitmap);
                                float f36 = round / 24.0f;
                                canvas3.scale(f36, f36);
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
                                if (z12) {
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
                                    this.P8 = createBitmap;
                                } else {
                                    this.Q8 = createBitmap;
                                }
                                bitmap = createBitmap;
                            }
                            float dp6 = rectF2.left + AndroidUtilities.dp(f13);
                            Paint paint6 = this.R8;
                            paint6.setColor(-1);
                            paint6.setAlpha((int) (Color.alpha(-1) * g12));
                            canvas2.drawBitmap(bitmap, dp6 - (bitmap.getWidth() / 2.0f), f35 - (bitmap.getHeight() / 2.0f), paint6);
                        }
                    }
                    textPaint.setTextSize(AndroidUtilities.dp(15.0f));
                    textPaint.setColor(-1);
                    textPaint.setAlpha((int) (g12 * f11));
                    String str = strArr[i12];
                    float dp7 = rectF2.left + AndroidUtilities.dp(52.0f);
                    if (strArr2[i12] != null) {
                        dp2 = f35 - AndroidUtilities.dp(2.0f);
                    } else {
                        dp2 = AndroidUtilities.dp(5.0f) + f35;
                    }
                    canvas2.drawText(str, dp7, dp2, textPaint);
                    if (strArr2[i12] != null) {
                        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                        textPaint.setColor(-1493172225);
                        textPaint.setAlpha((int) (Color.alpha(-1493172225) * g12));
                        canvas2.drawText(strArr2[i12], rectF2.left + AndroidUtilities.dp(52.0f), f35 + AndroidUtilities.dp(14.0f), textPaint);
                    }
                    canvas2.restore();
                }
                f33 = f34;
            }
            i15 = i12 + 1;
            f27 = f11;
            f29 = f12;
            f30 = 0.15f;
            f32 = 0.6f;
            z10 = false;
            i14 = 1;
            f20 = 1.0f;
        }
        canvas2.restore();
        canvas2.restore();
    }

    public final void K0() {
        if (this.X4 == null && !this.W4) {
            this.W4 = true;
            Utilities.globalQueue.postRunnable(new g1(this, i0.a.o(i0.a.f(0.4f, N0(), -16777216), 16), 0));
        }
    }

    public final void L(float f7, float f10, float f11, float f12, Canvas canvas, RectF rectF) {
        LinearGradient linearGradient;
        float min = Math.min(f11, f12);
        float max = Math.max(f11, f12);
        int i10 = (min > 0.002f ? 1 : (min == 0.002f ? 0 : -1));
        Paint paint = this.f1697b6;
        if (i10 > 0) {
            paint.setShader(null);
            paint.setColor(g(min, 16777215));
            canvas.drawRect(f7, rectF.top, f10, rectF.bottom, paint);
        }
        float f13 = max - min;
        if (f13 > 0.002f) {
            if (f12 >= f11) {
                linearGradient = this.Y5;
            } else {
                linearGradient = this.Z5;
            }
            Matrix matrix = this.f1686a6;
            matrix.setScale(f10 - f7, 1.0f);
            matrix.postTranslate(f7, 0.0f);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f13 * 255.0f));
            canvas.drawRect(f7, rectF.top, f10, rectF.bottom, paint);
            paint.setShader(null);
        }
    }

    public final float L0(float f7) {
        if (!this.f1932z3 || this.f1862s4 <= 0.001f) {
            return 0.0f;
        }
        float f10 = this.f1852r4;
        float[] fArr = w1.f1965b;
        float max = f10 / Math.max(0.3f, fArr[50]);
        if (max > 4.0f || max < -4.0f) {
            return 0.0f;
        }
        return Math.min(AndroidUtilities.dpf2(fArr[42]), (AndroidUtilities.dp(3.5f) / 2.0f) / 0.607f) * f7 * max * ((float) Math.exp((-0.5f) * max * max)) * this.f1862s4;
    }

    public final void M(Canvas canvas, int i10, RectF rectF, boolean z10) {
        boolean z11;
        float exp;
        int i11;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.f1867s9 == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        long[] jArr = this.f1928y9;
        if (!z11 && jArr[i10] == 0) {
            return;
        }
        if (z11) {
            exp = X0(i10, currentAnimationTimeMillis);
        } else {
            exp = this.f1938z9[i10] * ((float) Math.exp(((float) (-(currentAnimationTimeMillis - jArr[i10]))) / 180.0f));
        }
        if (!z11 && exp < 0.004f) {
            jArr[i10] = 0;
            return;
        }
        float D = c3.h0.D(exp, 2.0f, 3.0f, exp * exp);
        float min = Math.min(1.0f, ((float) (currentAnimationTimeMillis - this.x9[i10])) / 320.0f);
        float f7 = 1.0f - min;
        float A = d3.A(f7, f7, f7, 1.0f);
        if (!z11 || exp < 0.996f || min < 1.0f) {
            invalidate();
        }
        float max = Math.max(rectF.left, Math.min(rectF.right, this.f1897v9[i10]));
        float max2 = Math.max(rectF.top, Math.min(rectF.bottom, this.f1908w9[i10]));
        float max3 = (float) Math.max(Math.hypot(max - rectF.left, max2 - rectF.top), Math.max(Math.hypot(max - rectF.right, max2 - rectF.top), Math.max(Math.hypot(max - rectF.left, max2 - rectF.bottom), Math.hypot(max - rectF.right, max2 - rectF.bottom))));
        if (z10) {
            i11 = 335544320;
        } else {
            i11 = 738197503;
        }
        int i12 = (((int) ((i11 >>> 24) * D)) << 24) | (16777215 & i11);
        Paint paint = this.f1877t9;
        paint.setColor(i12);
        Path path = this.f1887u9;
        path.rewind();
        if (i10 != 3 && i10 != 4 && i10 != 11) {
            if (i10 < 6 && i10 != 5) {
                path.addRect(rectF, Path.Direction.CW);
            } else {
                float min2 = Math.min(AndroidUtilities.dp(20.0f), rectF.height() / 2.0f);
                path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
            }
        } else {
            path.addOval(rectF, Path.Direction.CW);
        }
        canvas.save();
        canvas.clipPath(path);
        canvas.drawCircle(max, max2, Math.max(AndroidUtilities.dp(6.0f), max3 * A), paint);
        canvas.restore();
    }

    public final void M0(int i10, r1 r1Var, int i11, int i12) {
        int i13 = i10 * 7;
        int i14 = r1Var.f1663a;
        float[] fArr = this.f1774j3;
        if (i14 == 0 && r1Var.f1666f == I9) {
            fArr[i13] = 0.0f;
            fArr[i13 + 1] = 0.0f;
            fArr[i13 + 2] = 0.0f;
            float f7 = M9;
            fArr[i13 + 3] = f7;
            float f10 = N9;
            fArr[i13 + 4] = f10;
            fArr[i13 + 5] = 1.0f / ((i12 * f10) + (i11 * f7));
            fArr[i13 + 6] = 0.5f;
        } else {
            fArr[i13] = 1.0f;
            fArr[i13 + 1] = i11 / 2.0f;
            fArr[i13 + 2] = (l() / 2.0f) + m();
            fArr[i13 + 3] = 0.0f;
            fArr[i13 + 4] = 0.0f;
            fArr[i13 + 5] = 1.0f / (((float) Math.hypot(i11, i12)) * 0.62f);
            fArr[i13 + 6] = 0.55f;
        }
        int i15 = i10 * 3;
        int i16 = r1Var.f1664b;
        int[] iArr = this.f1793l3;
        iArr[i15] = i16;
        iArr[i15 + 1] = r1Var.f1667g;
        iArr[i15 + 2] = r1Var.f1665c;
    }

    public final void N(android.graphics.Canvas r57, int r58, int r59) {
        throw new UnsupportedOperationException("Method not decompiled: ai.t1.N(android.graphics.Canvas, int, int):void");
    }

    public final int N0() {
        r1 r1Var = this.f1808n;
        if (r1Var == null) {
            return -16777216;
        }
        if (this.f1857s < 1.0f && this.f1847r != null) {
            float l4 = (l() / 2.0f) + m();
            float clamp01 = Utilities.clamp01(((((((float) Math.hypot(Math.max(this.f1898w, getWidth() - this.f1898w), Math.max(this.f1909x, getHeight() - this.f1909x))) + AndroidUtilities.dp(60.0f)) * y1(this.f1857s)) - ((float) Math.hypot((getWidth() / 2.0f) - this.f1898w, l4 - this.f1909x))) + AndroidUtilities.dp(80.0f)) / AndroidUtilities.dp(160.0f));
            int i10 = this.f1847r.e;
            int i11 = this.f1808n.e;
            float D = c3.h0.D(clamp01, 2.0f, 3.0f, clamp01 * clamp01);
            double[] dArr = this.f1842q3;
            i0.a.j(i10, dArr);
            double[] dArr2 = this.f1851r3;
            i0.a.j(i11, dArr2);
            double d = D;
            double[] dArr3 = this.f1861s3;
            if (dArr3.length == 3) {
                double d10 = 1.0d - d;
                double d11 = (dArr2[0] * d) + (dArr[0] * d10);
                dArr3[0] = d11;
                double d12 = (dArr2[1] * d) + (dArr[1] * d10);
                dArr3[1] = d12;
                double d13 = (dArr2[2] * d) + (dArr[2] * d10);
                dArr3[2] = d13;
                return i0.a.b(d11, d12, d13);
            }
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        return r1Var.e;
    }

    public final void O(Canvas canvas, float f7, float f10, float f11, int i10, boolean z10) {
        PorterDuffColorFilter n12 = n1(i10);
        u1 u1Var = this.T1;
        u1Var.setColorFilter(n12);
        u1Var.setAlpha(255);
        float f12 = f11 / 2.0f;
        float f13 = f10 - f12;
        float f14 = f7 + f11;
        float f15 = f10 + f12;
        u1Var.setBounds((int) f7, (int) f13, (int) f14, (int) f15);
        if (!z10) {
            u1Var.draw(canvas);
            return;
        }
        float f16 = f11 * 0.095f;
        float f17 = (0.28f * f11) + f7;
        float f18 = f10 - (0.21f * f11);
        float f19 = (0.74f * f11) + f7;
        float f20 = (0.25f * f11) + f10;
        float dp = f7 - AndroidUtilities.dp(2.0f);
        float dp2 = f13 - AndroidUtilities.dp(2.0f);
        float dp3 = f14 + AndroidUtilities.dp(2.0f);
        float dp4 = f15 + AndroidUtilities.dp(2.0f);
        RectF rectF = this.W5;
        rectF.set(dp, dp2, dp3, dp4);
        canvas.saveLayer(rectF, null);
        u1Var.draw(canvas);
        Paint paint = this.Y1;
        paint.setStrokeWidth((0.065f * f11 * 2.0f) + f16);
        canvas.drawLine(f17, f18, f19, f20, paint);
        canvas.restore();
        Paint paint2 = this.A1;
        paint2.setColor(i10);
        paint2.setStrokeWidth(f16);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawLine(f17, f18, f19, f20, paint2);
        paint2.setStrokeCap(Paint.Cap.BUTT);
    }

    public final void O0() {
        this.X1.C(false);
        Bitmap bitmap = this.R2;
        if (bitmap != null) {
            bitmap.recycle();
            this.R2 = null;
        }
        yj0 yj0Var = this.f1700b9;
        if (yj0Var != null) {
            yj0Var.C(false);
            this.f1700b9 = null;
        }
        yj0 yj0Var2 = this.f1806m8;
        if (yj0Var2 != null) {
            yj0Var2.C(false);
            this.f1806m8 = null;
        }
        t5 t5Var = this.f1797l8;
        if (t5Var != null) {
            t5Var.o(this);
            this.f1797l8 = null;
            this.f1817n8 = 0L;
        }
        P0(this.F);
        P0(this.G);
        removeCallbacks(this.q9);
        t9 t9Var = this.f1763i2;
        if (t9Var != null) {
            t9Var.a();
        }
        VelocityTracker velocityTracker = this.f1781k0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1781k0 = null;
        }
        VelocityTracker velocityTracker2 = this.f1818n9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f1818n9 = null;
        }
        HashMap hashMap = this.K7;
        for (t5 t5Var2 : hashMap.values()) {
            t5Var2.o(this);
        }
        for (Drawable drawable : this.J.values()) {
            if (drawable instanceof t5) {
                ((t5) drawable).o(this);
            }
        }
        hashMap.clear();
        HashMap hashMap2 = this.L7;
        for (s1 s1Var : hashMap2.values()) {
            r5 r5Var = s1Var.f1672a;
            if (r5Var != null) {
                r5Var.b();
            }
        }
        hashMap2.clear();
    }

    public final void P(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.f1830p1 != null && f12 > 0.004f) {
            TextPaint textPaint = this.f1922y2;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint.setColor(-1);
            textPaint.setAlpha((int) (f12 * 255.0f));
            canvas.drawText(this.f1830p1, ((f7 + f11) - AndroidUtilities.dp(16.0f)) - textPaint.measureText(this.f1830p1), f10 + AndroidUtilities.dp(5.0f), textPaint);
            textPaint.setAlpha(255);
        }
    }

    public final void P0(q1 q1Var) {
        if (q1Var != null) {
            t5 t5Var = q1Var.f1639c;
            if (t5Var != null) {
                t5Var.o(this);
            }
            t5 t5Var2 = q1Var.d;
            if (t5Var2 != null && !this.K7.containsValue(t5Var2)) {
                q1Var.d.o(this);
            }
            q1Var.G = true;
            z zVar = q1Var.F;
            if (zVar != null) {
                zVar.e = true;
                NotificationCenter.getInstance(zVar.f1982a).removeObserver(zVar, NotificationCenter.fileLoaded);
                q1Var.F = null;
            }
        }
    }

    public final void Q(float f7, float f10, float f11, Canvas canvas, boolean z10) {
        Canvas canvas2;
        Drawable drawable;
        float f12;
        float f13;
        if (this.X8 != 0) {
            if (z10) {
                float dp = f10 - AndroidUtilities.dp(10.0f);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint = this.S8;
                paint.setStyle(style);
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                paint.setColor(-1);
                float f14 = 1.0f;
                paint.setAlpha((int) (Color.alpha(-1) * 1.0f));
                float dp2 = ((AndroidUtilities.dp(26.0f) + f7) - AndroidUtilities.dp(10.0f)) + AndroidUtilities.dp(10.0f);
                float dp3 = dp + AndroidUtilities.dp(11.0f);
                float dp4 = AndroidUtilities.dp(7.25f);
                if (f11 >= 0.0f) {
                    float clamp01 = 1.0f - Utilities.clamp01(f11 / 0.42f);
                    float A = d3.A(clamp01, clamp01, clamp01, 1.0f);
                    if (f11 < 0.6f) {
                        float f15 = 1.0f - (f11 / 0.6f);
                        f13 = (1.0f - ((f15 * f15) * f15)) * 364.0f;
                    } else {
                        float clamp012 = Utilities.clamp01((f11 - 0.6f) / 0.12f);
                        f13 = 364.0f - ((3.0f - (clamp012 * 2.0f)) * ((4.0f * clamp012) * clamp012));
                    }
                    f12 = f13;
                    f14 = A;
                } else {
                    f12 = 0.0f;
                }
                float f16 = dp3 - dp4;
                RectF rectF = this.T8;
                rectF.set(dp2 - dp4, f16, dp2 + dp4, dp4 + dp3);
                canvas.drawArc(rectF, -82.0f, f14 * 344.0f, false, paint);
                canvas.drawLine(dp2, f16, dp2, dp + AndroidUtilities.dp(2.2f), paint);
                double radians = Math.toRadians(f12 - 90.0f);
                canvas2 = canvas;
                canvas2.drawLine(dp2, dp3, d3.c(3.8f, (float) Math.cos(radians), dp2), d3.c(3.8f, (float) Math.sin(radians), dp3), paint);
                paint.setStyle(Paint.Style.FILL);
                canvas2.drawCircle(dp2, dp3, AndroidUtilities.dpf2(1.2f), paint);
            } else {
                canvas2 = canvas;
                if (n()) {
                    yj0 p12 = p1();
                    int dp5 = AndroidUtilities.dp(28.0f);
                    float f17 = dp5 / 2.0f;
                    int i10 = (int) (f10 - f17);
                    p12.setBounds((int) ((AndroidUtilities.dp(26.0f) + f7) - f17), i10, ((int) ((AndroidUtilities.dp(26.0f) + f7) - f17)) + dp5, dp5 + i10);
                    p12.draw(canvas2);
                } else {
                    int i11 = this.X8;
                    if (i11 == R.drawable.msg_download) {
                        yj0 q12 = q1();
                        int dp6 = AndroidUtilities.dp(28.0f);
                        float f18 = dp6 / 2.0f;
                        int i12 = (int) (f10 - f18);
                        q12.setBounds((int) ((AndroidUtilities.dp(26.0f) + f7) - f18), i12, ((int) ((AndroidUtilities.dp(26.0f) + f7) - f18)) + dp6, dp6 + i12);
                        q12.draw(canvas2);
                    } else {
                        if (i11 == R.drawable.msg_retry) {
                            drawable = this.R1;
                        } else if (i11 == R.drawable.msg_copy) {
                            drawable = this.J1;
                        } else {
                            drawable = this.S1;
                        }
                        o0(canvas2, drawable, f7 + AndroidUtilities.dp(26.0f), f10, AndroidUtilities.dp(20.0f), 1.0f);
                        canvas2 = canvas2;
                    }
                }
            }
        } else {
            canvas2 = canvas;
            yj0 r12 = r1();
            int dp7 = AndroidUtilities.dp(27.0f);
            float f19 = dp7 / 2.0f;
            int i13 = (int) (f10 - f19);
            r12.setBounds((int) ((AndroidUtilities.dp(26.0f) + f7) - f19), i13, ((int) ((AndroidUtilities.dp(26.0f) + f7) - f19)) + dp7, dp7 + i13);
            r12.draw(canvas2);
        }
        TextPaint textPaint = this.C1;
        textPaint.setColor(-1);
        float f20 = this.f1859s1;
        if (f20 <= 0.0f) {
            f20 = AndroidUtilities.dp(15.0f);
        }
        textPaint.setTextSize(f20);
        String str = this.V8;
        float dp8 = f7 + AndroidUtilities.dp(48.0f);
        float dp9 = AndroidUtilities.dp(5.0f) + f10;
        int indexOf = str.indexOf(10);
        if (indexOf >= 0) {
            canvas2.drawText(str, 0, indexOf, dp8, dp9 - AndroidUtilities.dp(9.0f), (Paint) textPaint);
            canvas.drawText(str, indexOf + 1, str.length(), dp8, dp9 + AndroidUtilities.dp(9.0f), (Paint) textPaint);
        } else if (!s0(str)) {
            canvas2.drawText(str, dp8, dp9, textPaint);
        } else {
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = this.f1922y2;
            textPaint2.setTextSize(textSize);
            textPaint2.setColor(textPaint.getColor());
            canvas2.drawText(this.f1890v2, dp8, dp9, textPaint);
            float measureText = textPaint.measureText(this.f1890v2) + dp8;
            canvas2.drawText(this.f1901w2, measureText, dp9, textPaint2);
            canvas2.drawText(this.f1912x2, textPaint2.measureText(this.f1901w2) + measureText, dp9, textPaint);
        }
    }

    public final void Q0() {
        int i10 = this.f1867s9;
        if (i10 >= 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1938z9[i10] = X0(i10, currentAnimationTimeMillis);
            this.f1928y9[i10] = currentAnimationTimeMillis;
            invalidate();
        }
        this.f1867s9 = -1;
    }

    public final void R(android.graphics.Canvas r30, int r31, long r32) {
        throw new UnsupportedOperationException("Method not decompiled: ai.t1.R(android.graphics.Canvas, int, long):void");
    }

    public final void R0() {
        float f7 = this.f1722e0;
        if (f7 == 0.0f && this.f1733f0 == 0.0f) {
            return;
        }
        this.f1761i0 = f7;
        this.f1771j0 = this.f1733f0;
        this.W = AnimationUtils.currentAnimationTimeMillis();
        this.U = true;
    }

    public final void S0() {
        int i10 = this.W7;
        if (i10 >= 0 && this.Y7 < this.X7) {
            this.Z7 = k1(i10);
            this.Y7 = AnimationUtils.currentAnimationTimeMillis();
            invalidate();
        }
    }

    public final float T(float f7) {
        float f10;
        if (this.R4 >= 1.0f) {
            return 1.0f;
        }
        if (this.U4) {
            f10 = 0.85f;
        } else {
            f10 = 0.92f;
        }
        return AndroidUtilities.lerp(f10, 1.0f, f7);
    }

    public final android.graphics.Bitmap T0() {
        throw new UnsupportedOperationException("Method not decompiled: ai.t1.T0():android.graphics.Bitmap");
    }

    public final Drawable U(String str) {
        HashMap hashMap = this.J;
        Drawable drawable = (Drawable) hashMap.get(str);
        if (drawable == null) {
            drawable = Emoji.getEmojiDrawable(str);
            if (drawable == null) {
                drawable = Emoji.getEmojiDrawable(str.replace("️", ""));
            }
            if (drawable != null) {
                hashMap.put(str, drawable);
            }
        }
        return drawable;
    }

    public final void U0(String str) {
        boolean z10;
        if (this.f1888v0) {
            int dp = AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(8.0f);
            this.f1870t2 = this.L0.c() + AndroidUtilities.dp(2.0f) + dp + AndroidUtilities.dp(11.0f);
            this.f1888v0 = false;
            this.A0 = false;
            if (this.B0 * this.G0 > 0.001f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f1860s2 = z10;
            this.f1841q2 = AnimationUtils.currentAnimationTimeMillis();
            this.C0 = this.B0;
            this.D0 = 0.0f;
            this.E0 = System.currentTimeMillis();
            g gVar = this.f1868t0;
            if (gVar != null) {
                j1(gVar);
            }
            u1(true);
            if (str != null) {
                d1(0, str, null);
            }
            i0();
            this.e = null;
            this.f1878u0 = null;
            rb.c cVar = this.f1701c;
            if (cVar != null) {
                cVar.n(0);
            }
        }
    }

    public final Bitmap V(t5 t5Var) {
        Bitmap bitmap;
        f3 f3Var = t5Var.f32860k;
        if (f3Var != null) {
            yj0 lottieAnimation = f3Var.getLottieAnimation();
            if (lottieAnimation != null) {
                if (!this.T2) {
                    lottieAnimation.V(0L);
                }
                if (lottieAnimation.u()) {
                    if (lottieAnimation.Q != null) {
                        return lottieAnimation.Q;
                    }
                    if (lottieAnimation.R == null) {
                        return null;
                    }
                    return lottieAnimation.R;
                }
            } else {
                g6 animation = f3Var.getAnimation();
                if (animation != null) {
                    if (!this.T2) {
                        animation.D(System.currentTimeMillis());
                    }
                    if (animation.s()) {
                        return animation.m();
                    }
                } else if (f3Var.hasImageLoaded() && f3Var.hasNotThumb() && (bitmap = f3Var.getBitmap()) != null && !bitmap.isRecycled()) {
                    return bitmap;
                }
            }
        }
        return null;
    }

    public final float V0() {
        if (this.f1743g1 < 0.5f) {
            return 1.0f;
        }
        return Utilities.clamp01(((float) (AnimationUtils.currentAnimationTimeMillis() - this.I2)) / 420.0f);
    }

    public final ai.q1 W() {
        throw new UnsupportedOperationException("Method not decompiled: ai.t1.W():ai.q1");
    }

    public final void X(q1 q1Var) {
        TLRPC.Document document;
        if (q1Var != null && !q1Var.G && q1Var.f1637a == 2 && q1Var.F == null && (document = q1Var.A) != null) {
            q1Var.F = new z(this.f1690b, document, q1Var.B, AndroidUtilities.dp(48.0f), new n1(0, this, q1Var));
        }
    }

    public final float X0(int i10, long j10) {
        return 1.0f - ((1.0f - this.A9[i10]) * ((float) Math.exp(((float) (-(j10 - this.x9[i10]))) / 90.0f)));
    }

    public final boolean Y(Bitmap bitmap) {
        float[] fArr = w1.f1965b;
        float f7 = fArr[36];
        float f10 = fArr[38];
        float f11 = fArr[24];
        if (this.T3 != null && this.U3 == bitmap && f7 == this.V3 && f10 == this.W3 && f11 == this.X3) {
            return true;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        this.U3 = bitmap;
        this.V3 = f7;
        this.W3 = f10;
        this.X3 = f11;
        Bitmap bitmap2 = this.T3;
        if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || this.T3.getHeight() != bitmap.getHeight()) {
            this.T3 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        this.T3.eraseColor(0);
        Canvas canvas = new Canvas(this.T3);
        double radians = Math.toRadians(f11);
        float f12 = (float) (-Math.cos(radians));
        float f13 = (float) (-Math.sin(radians));
        float dpf2 = AndroidUtilities.dpf2(f7);
        float dpf22 = AndroidUtilities.dpf2(f10);
        float f14 = f12 * dpf22;
        float f15 = dpf22 * f13;
        canvas.drawBitmap(bitmap, f14, f15, (Paint) null);
        canvas.drawBitmap(bitmap, f14 - (f12 * dpf2), f15 - (f13 * dpf2), this.Y3);
        return true;
    }

    public final void Y0(r1 r1Var, float f7, float f10) {
        if (r1Var != null) {
            this.f1709c7 = W0(r1Var.f1665c);
        }
        if (this.f1735f2) {
            if (this.f1847r != null) {
                this.f1847r = null;
            }
            this.f1808n = r1Var;
            this.f1857s = 1.0f;
            invalidate();
            return;
        }
        this.f1847r = this.f1808n;
        this.f1808n = r1Var;
        this.f1857s = 0.0f;
        this.v = System.currentTimeMillis();
        this.f1898w = f7;
        this.f1909x = f10;
        this.f1839q0++;
        i0();
        invalidate();
    }

    public final void Z(q1 q1Var) {
        t5 t5Var;
        f3 f3Var;
        if (q1Var != null && q1Var.e == null && (t5Var = q1Var.f1639c) != null) {
            z zVar = q1Var.F;
            if ((zVar == null || zVar.h) && (f3Var = t5Var.f32860k) != null && f3Var.hasImageLoaded() && f3Var.hasNotThumb()) {
                int dp = AndroidUtilities.dp(48.0f);
                Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                q1Var.f1639c.setBounds(0, 0, dp, dp);
                q1Var.f1639c.setColorFilter(null);
                q1Var.f1639c.setAlpha(255);
                f3Var.setCurrentAlpha(1.0f);
                q1Var.f1639c.draw(canvas);
                E0(q1Var, createBitmap);
            }
        }
    }

    public final String a0() {
        String string = LocaleController.getString(R.string.QrNoPaidToastExpires);
        if (!string.equals(this.f1880u2)) {
            this.f1880u2 = string;
            Matcher matcher = Pattern.compile("\\d+").matcher(string);
            if (matcher.find()) {
                this.f1890v2 = string.substring(0, matcher.start());
                this.f1901w2 = matcher.group();
                this.f1912x2 = string.substring(matcher.end());
            } else {
                this.f1890v2 = string;
                this.f1912x2 = "";
                this.f1901w2 = "";
            }
        }
        return this.f1880u2;
    }

    public final float a1() {
        return (getHeight() - this.f1891v3) - AndroidUtilities.dp(10.0f);
    }

    public final float b(double d) {
        float f7 = this.B4;
        double sin = Math.sin((f7 * 78.233d) + (((f7 * 17.31d) + d) * 12.9898d)) * 43758.5453d;
        return ((float) (sin - Math.floor(sin))) * 300.0f;
    }

    public final float b1() {
        float dp;
        float max = Math.max(AndroidUtilities.dp(160.0f), a1() - ((((l() + (AndroidUtilities.dp(51.0f) + this.f1881u3)) + AndroidUtilities.dp(24.0f)) + AndroidUtilities.dp(11.0f)) + AndroidUtilities.dp(13.0f)));
        if (this.f1752h1 == 2 && this.f1911x1) {
            ArrayList arrayList = this.f1889v1;
            if (arrayList.size() <= 3) {
                float C = (wh.C(10.0f, 2, getWidth()) - AndroidUtilities.dp(8.0f)) / 3.0f;
                if (arrayList.isEmpty()) {
                    dp = AndroidUtilities.dp(286.0f);
                } else {
                    dp = AndroidUtilities.dp(8.0f) + C;
                }
                max = Math.min(max, dp);
            }
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f7 = this.P2;
        if (f7 >= 0.0f && this.f1734f1 >= 0.01f) {
            if (f7 != max) {
                long min = Math.min(64L, Math.max(0L, currentAnimationTimeMillis - this.Q2));
                float f10 = this.P2;
                float z10 = c3.h0.z(1.0f, (float) Math.exp(((float) (-min)) / 140.0f), max - f10, f10);
                this.P2 = z10;
                if (Math.abs(max - z10) < 0.5f) {
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
        r1 r1Var;
        Runnable runnable = this.f1714d2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f1724e2 && !this.I.isEmpty() && (r1Var = this.f1808n) != null && (r1Var.f1663a != 0 || this.F.f1637a == 2)) {
            this.U7 = AnimationUtils.currentAnimationTimeMillis();
            this.R7 = -1;
            this.P7 = 0.0f;
            setSceneFromCard(t(this.N7));
        }
        setPattern(W());
        if (!this.f1735f2) {
            this.f1848r0 = AnimationUtils.currentAnimationTimeMillis();
        }
        B0();
    }

    public final float c1(float f7, float f10, int i10, int i11) {
        float f11;
        float f12;
        float f13;
        float f14;
        int i12;
        float f15;
        float f16;
        float asin;
        if (!this.f1932z3) {
            return 0.0f;
        }
        float f17 = i10;
        float f18 = f7 - (f17 / 2.0f);
        float f19 = this.I3;
        float f20 = i11;
        float f21 = f10 - (f20 / 2.0f);
        float f22 = (this.J3 * f21) + (f18 * f19);
        float f23 = 1.0f;
        float max = Math.max(1.0f, ((Math.abs(this.J3) * f20) + (Math.abs(f19) * f17)) / 2.0f);
        float[] fArr = w1.f1965b;
        float f24 = fArr[19] / 100.0f;
        if (f24 > 0.0f) {
            float f25 = this.J3;
            float max2 = ((f21 * this.I3) + (f18 * (-f25))) / Math.max(1.0f, ((Math.abs(this.I3) * f20) + (Math.abs(f25) * f17)) / 2.0f);
            f22 -= ((f24 * f17) * max2) * max2;
        }
        float f26 = (f22 - this.f1913x3) / this.y3;
        float f27 = fArr[20] / 100.0f;
        if (f27 > 0.0f) {
            f26 += (((((float) Math.asin(Math.max(-1.0f, Math.min(1.0f, f22 / max)))) - Math.max(-2.1991148f, Math.min(2.1991148f, (this.f1913x3 / max) * 1.5707964f))) / ((this.y3 / max) * 1.5707964f)) - f26) * f27;
            f11 = ic.a.d(1.0f, (float) Math.cos(Math.max(-1.5707964f, Math.min(1.5707964f, asin))), (f27 * fArr[31]) / 100.0f, 1.0f);
        } else {
            f11 = 1.0f;
        }
        this.f1833p4 = f26;
        float f28 = this.F3;
        this.f1843q4 = f28 * f11;
        float f29 = fArr[34] / 100.0f;
        int i13 = (f26 > 4.0f ? 1 : (f26 == 4.0f ? 0 : -1));
        if ((i13 > 0 || f26 < -4.0f) && f29 <= 0.0f) {
            this.f1813n4 = 0.0f;
            return 0.0f;
        }
        float f30 = fArr[32];
        float f31 = f26 / fArr[29];
        q1 q1Var = this.F;
        if (q1Var != null && q1Var.f1637a == 1) {
            f23 = 0.7f;
        }
        float f32 = f11 * f23;
        if (f31 > 4.0f || f31 < -4.0f) {
            f12 = 0.0f;
            f13 = f32;
            f14 = 4.0f;
            i12 = i13;
            f15 = 0.0f;
        } else {
            float abs = Math.abs(f31);
            f12 = 0.0f;
            f13 = f32;
            f14 = 4.0f;
            i12 = i13;
            f15 = f28 * f32 * ((float) Math.exp(Math.pow(abs, f30) * (-0.5d)));
        }
        this.f1813n4 = f15;
        float f33 = fArr[28] / 100.0f;
        if (i12 <= 0 && f26 >= -4.0f) {
            f16 = (float) Math.exp(Math.pow(Math.abs(f26), f30) * (-0.5d));
        } else {
            f16 = f12;
        }
        float f34 = f33 * f16;
        if (f29 > f12) {
            float f35 = f26 - fArr[33];
            if (f35 < f14 && f35 > -4.0f) {
                f34 += f29 * ((float) Math.exp(Math.pow(Math.abs(f35), f30) * (-0.5d)));
            }
        }
        return this.F3 * f13 * f34;
    }

    public final void d(int i10) {
        boolean z10 = true;
        this.f1724e2 = true;
        if (this.F.f1637a == 0) {
            z10 = false;
        }
        this.I.clear();
        this.P7 = 0.0f;
        this.N7 = i10;
        r1 r1Var = this.f1808n;
        if (r1Var == null || r1Var.f1663a != 0 || r1Var.f1666f != i10) {
            setSceneFromCard(t(i10));
        }
        if (z10) {
            setPattern(new q1());
        }
        Runnable runnable = this.f1714d2;
        if (runnable != null) {
            runnable.run();
        }
        this.f1724e2 = false;
    }

    public final void d1(int i10, String str, String str2) {
        int i11;
        long currentTimeMillis = 0 - System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            postDelayed(new h1((Object) this, i10, (Object) str, (Object) str2, 0), currentTimeMillis);
            return;
        }
        this.f1810n1 = i10;
        this.f1799m1 = str;
        this.f1820o1 = str2;
        long currentTimeMillis2 = System.currentTimeMillis();
        if (str2 != null) {
            i11 = 4000;
        } else {
            i11 = 2800;
        }
        this.f1879u1 = currentTimeMillis2 + i11;
        invalidate();
    }

    public final void e(int i10, ArrayList arrayList, boolean z10) {
        String str;
        int i11 = -1;
        if (z10 && a.h != null) {
            int i12 = 0;
            while (true) {
                int[] iArr = a.h;
                if (i12 >= iArr.length) {
                    break;
                } else if (iArr[i12] == i10) {
                    i11 = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (i11 < 0) {
            i11 = H9;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f1724e2 = true;
            this.N7 = i11;
            r1 r1Var = this.f1808n;
            if (r1Var == null || r1Var.f1663a != 0 || r1Var.f1666f != i11) {
                setSceneFromCard(t(i11));
            }
            this.P7 = 0.0f;
            ArrayList arrayList2 = this.I;
            arrayList2.clear();
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                TLRPC.Reaction reaction = (TLRPC.Reaction) obj;
                if (arrayList2.size() >= 6) {
                    break;
                } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                    long j10 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                    String o10 = a1.g.o(j10, "c:");
                    HashMap hashMap = this.J;
                    if (!hashMap.containsKey(o10)) {
                        t5 n10 = t5.n(this.f1690b, j10, null, 2);
                        n10.a(this);
                        hashMap.put(o10, n10);
                    }
                    if (!arrayList2.contains(o10)) {
                        arrayList2.add(o10);
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
                        this.f1704c2.put(str, str2);
                        if (!arrayList2.contains(str)) {
                            arrayList2.add(str);
                        }
                    }
                }
            }
            c();
            this.f1724e2 = false;
            return;
        }
        d(i11);
    }

    public final void e0(int i10, int[] iArr) {
        iArr[0] = -7829368;
        iArr[1] = -11184811;
        iArr[2] = -13421773;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = ((TL_stars.TL_starGiftUnique) this.f1889v1.get(i10)).attributes;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i11);
            i11++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
                iArr[0] = stargiftattributebackdrop.center_color | (-16777216);
                iArr[1] = stargiftattributebackdrop.edge_color | (-16777216);
                iArr[2] = stargiftattributebackdrop.pattern_color | (-16777216);
            }
        }
    }

    public final float f(float f7, float f10, float f11) {
        float z10 = c3.h0.z(f10, f7, 1.0f - ((float) Math.pow(1.0f - f11, this.X2)), f7);
        if (Math.abs(f10 - z10) < 0.002f) {
            return f10;
        }
        return z10;
    }

    public final int f0() {
        int size = this.f1889v1.size();
        if (!this.f1911x1 || size <= 0 || size >= 3) {
            return 3;
        }
        return size;
    }

    public final t5 g0(long j10, TLRPC.Document document) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.K7;
        t5 t5Var = (t5) hashMap.get(valueOf);
        if (t5Var == null) {
            t5 m10 = t5.m(this.f1690b, 24, document);
            m10.a(this);
            hashMap.put(Long.valueOf(j10), m10);
            return m10;
        }
        return t5Var;
    }

    public String getCurrentLink() {
        String str;
        if (this.f1888v0 && (str = this.e) != null && this.f1878u0 != null) {
            return str;
        }
        if (this.f1868t0 != null) {
            return this.d;
        }
        return null;
    }

    public ArrayList<TLRPC.Reaction> getPickedEmoji() {
        ArrayList<TLRPC.Reaction> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.I;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
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
                String str2 = (String) this.f1704c2.get(str);
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
        r1 r1Var = this.f1808n;
        if (r1Var != null && r1Var.f1663a == 0) {
            return r1Var.f1666f;
        }
        return -1;
    }

    public TL_stars.TL_starGiftUnique getThemeGift() {
        int i10;
        q1 q1Var = this.F;
        if (q1Var.f1637a == 2 && (i10 = q1Var.f1650q) >= 0) {
            ArrayList arrayList = this.f1889v1;
            if (i10 < arrayList.size()) {
                return (TL_stars.TL_starGiftUnique) arrayList.get(this.F.f1650q);
            }
            return null;
        }
        return null;
    }

    public long getThemeGiftSavedId() {
        Long l4;
        TL_stars.TL_starGiftUnique themeGift = getThemeGift();
        if (themeGift != null) {
            l4 = (Long) this.f1921y1.get(Long.valueOf(themeGift.f22257id));
        } else {
            l4 = null;
        }
        if (l4 != null) {
            return l4.longValue();
        }
        return 0L;
    }

    public final boolean h0() {
        if (this.f1911x1 && this.f1889v1.isEmpty()) {
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
            if ((this.T4 || this.Z1) && canvas.isHardwareAccelerated() && b0.e(this.H1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void j1(g gVar) {
        h hVar = this.f1858s0;
        if (hVar.f1530q == 2 && hVar.f1528o < 1.0f) {
            hVar.f1526m = gVar;
            invalidate();
            return;
        }
        postDelayed(new a1.f(16, this, gVar), 40L);
    }

    public final float k1(int i10) {
        if (i10 != this.W7) {
            return 1.0f;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j10 = this.Y7;
        long j11 = this.X7;
        if (j10 < j11) {
            float clamp01 = 1.0f - Utilities.clamp01(((float) (currentAnimationTimeMillis - j11)) / 110.0f);
            return 1.0f - ((1.0f - (clamp01 * clamp01)) * 0.08f);
        }
        double h12 = h1(((float) (currentAnimationTimeMillis - j10)) / 1000.0f, 0.6d, 0.28d);
        if (currentAnimationTimeMillis - this.Y7 > 900) {
            this.W7 = -1;
            return 1.0f;
        }
        float f7 = this.Z7;
        return ((1.0f - f7) * ((float) h12)) + f7;
    }

    public final float l() {
        return AndroidUtilities.lerp(1.07f, 1.0f, this.C2) * getWidth() * 0.745f;
    }

    public final void l0() {
        if (this.V8 == null) {
            this.f1879u1 = 0L;
            return;
        }
        this.f1879u1 = 0L;
        if (this.O8) {
            this.O8 = false;
            this.N8 = AnimationUtils.currentAnimationTimeMillis();
        }
        this.W8 = true;
        invalidate();
    }

    public final float m() {
        float max = ((1.0f - Math.max(this.J2, this.C2)) * AndroidUtilities.dp(16.0f)) + (((getHeight() * 0.468f) - (l() / 2.0f)) - AndroidUtilities.dp(15.0f));
        float a12 = (((a1() - b1()) - AndroidUtilities.dp(13.0f)) - (AndroidUtilities.dp(35.0f) * Math.max(this.J2, this.C2))) - l();
        return AndroidUtilities.lerp(max, Math.max(AndroidUtilities.dp(51.0f) + this.f1881u3, Math.min(max, a12)), this.f1734f1);
    }

    public final s1 m1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        Long valueOf = Long.valueOf(tL_starGiftUnique.f22257id);
        HashMap hashMap = this.L7;
        s1 s1Var = (s1) hashMap.get(valueOf);
        s1 s1Var2 = s1Var;
        if (s1Var == null) {
            ?? obj = new Object();
            ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
            int size = arrayList.size();
            TLRPC.Document document = null;
            int i10 = 0;
            while (i10 < size) {
                TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i10);
                i10++;
                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                    document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                }
            }
            if (document != null) {
                r5 r5Var = new r5(AndroidUtilities.dp(28.0f), this);
                obj.f1672a = r5Var;
                r5Var.i(document, false);
                obj.f1672a.a();
                obj.f1673b = document.f22034id;
            }
            hashMap.put(Long.valueOf(tL_starGiftUnique.f22257id), obj);
            s1Var2 = obj;
        }
        return s1Var2;
    }

    public final boolean n() {
        String str;
        if (this.X8 == R.drawable.msg_retry && (str = this.V8) != null && !s0(str)) {
            return true;
        }
        return false;
    }

    public final boolean n0(float f7, float f10) {
        if (this.f1830p1 != null && this.O8) {
            RectF rectF = this.M8;
            if (!rectF.isEmpty()) {
                float f11 = rectF.right;
                TextPaint textPaint = this.f1922y2;
                textPaint.setTextSize(AndroidUtilities.dp(15.0f));
                float dp = rectF.bottom + AndroidUtilities.dp(6.0f);
                RectF rectF2 = this.f1840q1;
                rectF2.set((f11 - textPaint.measureText(this.f1830p1)) - AndroidUtilities.dp(28.0f), rectF.top - AndroidUtilities.dp(6.0f), rectF.right + AndroidUtilities.dp(6.0f), dp);
                return rectF2.contains(f7, f10);
            }
            return false;
        }
        return false;
    }

    public final PorterDuffColorFilter n1(int i10) {
        SparseArray sparseArray = this.f7;
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) sparseArray.get(i10);
        if (porterDuffColorFilter == null) {
            if (sparseArray.size() > 96) {
                sparseArray.clear();
            }
            PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            sparseArray.put(i10, porterDuffColorFilter2);
            return porterDuffColorFilter2;
        }
        return porterDuffColorFilter;
    }

    public final float o() {
        return l() + m() + AndroidUtilities.dp(24.0f);
    }

    public final void o0(Canvas canvas, Drawable drawable, float f7, float f10, float f11, float f12) {
        drawable.setColorFilter(n1(-1));
        drawable.setAlpha((int) (f12 * 255.0f));
        float f13 = f11 / 2.0f;
        drawable.setBounds((int) (f7 - f13), (int) (f10 - f13), (int) (f7 + f13), (int) (f10 + f13));
        drawable.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        Sensor sensor;
        super.onAttachedToWindow();
        K0();
        int i10 = this.f1935z6;
        SparseIntArray sparseIntArray = this.f1925y6;
        if (i10 != 1) {
            sparseIntArray.clear();
            this.f1935z6 = 1;
        }
        int i11 = 0;
        while (true) {
            int[] iArr = a.f1416b;
            if (i11 >= iArr.length) {
                break;
            }
            ?? obj = new Object();
            int i12 = iArr[i11] | (-16777216);
            obj.f1664b = i12;
            obj.f1665c = (-16777216) | a.f1417c[i11];
            obj.h = Z0(i12);
            if (sparseIntArray.indexOfKey(obj.f1664b) < 0) {
                sparseIntArray.put(obj.f1664b, u(obj));
            }
            i11++;
        }
        NotificationCenter.getInstance(this.f1690b).addWeakObserver(this.f1773j2, NotificationCenter.starUserGiftsLoaded);
        y0();
        SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
        this.O6 = sensorManager;
        if (sensorManager != null) {
            sensor = sensorManager.getDefaultSensor(9);
        } else {
            sensor = null;
        }
        if (sensor != null) {
            this.O6.registerListener(this.P6, sensor, 1);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f1690b).removeObserver(this.f1773j2, NotificationCenter.starUserGiftsLoaded);
        removeCallbacks(this.f1783k2);
        SensorManager sensorManager = this.O6;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.P6);
        }
        this.M6 = false;
        this.f1867s9 = -1;
        Arrays.fill(this.f1928y9, 0L);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r47) {
        throw new UnsupportedOperationException("Method not decompiled: ai.t1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int top;
        int top2;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = AndroidUtilities.statusBarHeight;
        View view = this;
        int i15 = 0;
        while (true) {
            top = view.getTop() + i15;
            if (!(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
            i15 = top - view.getScrollY();
        }
        this.f1881u3 = Math.max(Math.max(0, i14 - top), (AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(9.0f)) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2));
        int height = getRootView().getHeight();
        View view2 = this;
        int i16 = 0;
        while (true) {
            top2 = view2.getTop() + i16;
            if (!(view2.getParent() instanceof View)) {
                break;
            }
            view2 = (View) view2.getParent();
            i16 = top2 - view2.getScrollY();
        }
        this.f1891v3 = org.telegram.messenger.t.c(20.0f, AndroidUtilities.dp(22.0f), Math.max(0, AndroidUtilities.navigationBarHeight - (height - (getHeight() + top2))));
        if (Build.VERSION.SDK_INT >= 29 && z10) {
            int i17 = i12 - i10;
            int l4 = (int) ((l() / 2.0f) + m());
            int dp = AndroidUtilities.dp(100.0f);
            int dp2 = AndroidUtilities.dp(24.0f);
            ArrayList arrayList = this.f1871t3;
            arrayList.clear();
            int i18 = l4 - dp;
            int i19 = l4 + dp;
            arrayList.add(new Rect(0, i18, dp2, i19));
            arrayList.add(new Rect(i17 - dp2, i18, i17, i19));
            setSystemGestureExclusionRects(arrayList);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (i10 > 0 && i11 > 0) {
            float dp = AndroidUtilities.dp(12.0f);
            int ceil = ((int) Math.ceil(i10 / dp)) + 1;
            int ceil2 = ((int) Math.ceil(i11 / dp)) + 1;
            Bitmap bitmap = this.A3;
            if (bitmap == null || bitmap.getWidth() != ceil || this.A3.getHeight() != ceil2) {
                this.A3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                this.B3 = new int[ceil * ceil2];
            }
        }
        super.onSizeChanged(i10, i11, i12, i13);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r40) {
        throw new UnsupportedOperationException("Method not decompiled: ai.t1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(float f7, float f10, float f11) {
        int i10;
        float dp;
        float nextFloat;
        float f12;
        float c10;
        int i11 = this.f1703c1;
        if (i11 >= 320) {
            return;
        }
        this.f1703c1 = i11 + 1;
        Random random = this.f1723e1;
        float nextFloat2 = random.nextFloat();
        if (nextFloat2 < 0.65f) {
            i10 = 0;
        } else if (nextFloat2 < 0.9f) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        byte[] bArr = this.f1682a1;
        bArr[i11] = (byte) i10;
        this.f1692b1[i11] = false;
        this.M0[i11] = ((random.nextFloat() - 0.5f) * AndroidUtilities.dp(4.0f)) + f7;
        this.N0[i11] = f10;
        byte b10 = bArr[i11];
        if (b10 == 0) {
            dp = AndroidUtilities.dp(1.4f);
            nextFloat = random.nextFloat();
            f12 = 1.6f;
        } else if (b10 == 1) {
            c10 = d3.c(0.7f, random.nextFloat(), AndroidUtilities.dpf2(0.7f));
            this.S0[i11] = c10;
            this.O0[i11] = (random.nextFloat() * AndroidUtilities.dp(80.0f)) + (-AndroidUtilities.dp(30.0f));
            this.P0[i11] = (-AndroidUtilities.dp(50.0f)) - (random.nextFloat() * AndroidUtilities.dp(100.0f));
            this.Q0[i11] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f11));
            this.R0[i11] = 0.0f;
            this.T0[i11] = random.nextFloat() * 90.0f;
            this.U0[i11] = (random.nextFloat() - 0.5f) * 1080.0f;
        } else {
            dp = AndroidUtilities.dp(3.0f);
            nextFloat = random.nextFloat();
            f12 = 1.5f;
        }
        c10 = (nextFloat * AndroidUtilities.dp(f12)) + dp;
        this.S0[i11] = c10;
        this.O0[i11] = (random.nextFloat() * AndroidUtilities.dp(80.0f)) + (-AndroidUtilities.dp(30.0f));
        this.P0[i11] = (-AndroidUtilities.dp(50.0f)) - (random.nextFloat() * AndroidUtilities.dp(100.0f));
        this.Q0[i11] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f11));
        this.R0[i11] = 0.0f;
        this.T0[i11] = random.nextFloat() * 90.0f;
        this.U0[i11] = (random.nextFloat() - 0.5f) * 1080.0f;
    }

    public final yj0 p1() {
        if (this.f1689a9 == null) {
            yj0 yj0Var = new yj0(R.raw.contact_check, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f));
            this.f1689a9 = yj0Var;
            yj0Var.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.2126f, 0.7152f, 0.0722f, 1.0f, -255.0f}));
            this.f1689a9.K(0);
            this.f1689a9.R(this);
            this.f1689a9.J(true);
        }
        return this.f1689a9;
    }

    public final void q(float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
        float f17;
        int i10 = this.f1703c1;
        if (i10 >= 320) {
            return;
        }
        this.f1703c1 = i10 + 1;
        this.f1682a1[i10] = z10 ? (byte) 1 : (byte) 0;
        this.f1692b1[i10] = true;
        this.M0[i10] = f7;
        this.N0[i10] = f10;
        this.O0[i10] = f11;
        this.P0[i10] = f12;
        this.V0[i10] = f7;
        this.W0[i10] = f10;
        this.X0[i10] = f13;
        Random random = this.f1723e1;
        if (z11) {
            f17 = d3.f(random, 3.0f, 4.0f);
        } else {
            f17 = 0.0f;
        }
        this.Y0[i10] = f17;
        this.Z0[i10] = random.nextFloat() * 6.2832f;
        this.S0[i10] = f14;
        this.Q0[i10] = f15;
        this.R0[i10] = 0.0f;
        this.T0[i10] = f16;
        this.U0[i10] = 0.0f;
    }

    public final yj0 q1() {
        if (this.f1700b9 == null) {
            yj0 yj0Var = new yj0(R.raw.ic_save_to_gallery, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f));
            this.f1700b9 = yj0Var;
            yj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.f1700b9.K(0);
            this.f1700b9.R(this);
            this.f1700b9.J(true);
        }
        return this.f1700b9;
    }

    public final yj0 r1() {
        if (this.Z8 == null) {
            yj0 yj0Var = new yj0(R.raw.star_premium_2, AndroidUtilities.dp(27.0f), AndroidUtilities.dp(27.0f));
            this.Z8 = yj0Var;
            yj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.Z8.K(0);
            this.Z8.R(this);
            this.Z8.J(true);
        }
        return this.Z8;
    }

    public final boolean s0(String str) {
        if (str != null && str.equals(this.f1880u2)) {
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
        TextPaint textPaint2 = this.f1922y2;
        textPaint2.setTextSize(textSize);
        return textPaint.measureText(this.f1912x2) + textPaint2.measureText(this.f1901w2) + textPaint.measureText(this.f1890v2);
    }

    public void setFeeStars(long j10) {
        boolean z10;
        String str;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K0 = z10;
        String str2 = "";
        if (i10 <= 0) {
            str = "";
        } else {
            str = LocaleController.formatString(R.string.QrNoPaidRemoveStarsFee, LocaleController.formatNumber(j10, ','));
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
        if (!this.K0 && this.f1888v0) {
            U0(null);
        }
        invalidate();
    }

    public void setFreeLink(String str) {
        if (TextUtils.equals(this.e, str)) {
            return;
        }
        this.e = str;
        if (str == null) {
            this.f1878u0 = null;
            return;
        }
        Utilities.globalQueue.postRunnable(new j1(str, new i1(this, str, 1)));
    }

    public void setGiftsOwner(long j10) {
        if (this.f1900w1 == j10) {
            return;
        }
        this.f1900w1 = j10;
        t9 t9Var = this.f1763i2;
        if (t9Var != null) {
            t9Var.a();
        }
        t9 t9Var2 = new t9(this.f1690b, j10, false);
        this.f1763i2 = t9Var2;
        t9Var2.f5467g = 776;
        t9Var2.e = true;
        t9Var2.j(true);
        y0();
    }

    public void setImmediateOnOpen(boolean z10) {
        this.Z1 = z10;
    }

    public void setInstantTheme(boolean z10) {
        this.f1735f2 = z10;
    }

    public void setLinkExpires(long j10) {
        long j11 = this.G2;
        if (j11 == j10) {
            return;
        }
        if (j11 != 0 && j10 != 0) {
            i0();
        }
        this.G2 = j10;
        this.N2 = -1L;
        invalidate();
    }

    public void setOnPicksChanged(Runnable runnable) {
        this.f1714d2 = runnable;
    }

    public void setReveal(float f7) {
        float f10;
        boolean z10;
        float f11;
        int i10;
        float sin;
        this.R4 = f7;
        float f12 = 1.0f;
        if (this.U4) {
            double d = f7 * 0.86d;
            double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d;
            if (f7 >= 1.0f) {
                sin = 1.0f;
            } else {
                double d10 = sqrt * d;
                sin = (float) (1.0d - (((Math.sin(d10) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(d10)) * Math.exp((-9.120752865260691d) * d)));
            }
            float clamp01 = Utilities.clamp01((f7 - 0.85f) / 0.15f);
            f10 = c3.h0.z(1.0f, sin, c3.h0.D(clamp01, 2.0f, 3.0f, clamp01 * clamp01), sin);
        } else {
            float f13 = 1.0f - f7;
            f10 = 1.0f - (f13 * f13);
        }
        this.V4 = f10;
        int i11 = 0;
        if (f7 < 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.T4 = true;
        }
        if (z10) {
            f11 = Math.round((1.0f - f10) * AndroidUtilities.dp(64.0f));
        } else {
            f11 = 0.0f;
        }
        setTranslationY(f11);
        if (z10) {
            f12 = Utilities.clamp01(f10 / 0.35f);
        }
        setAlpha(f12);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (z10) {
                i10 = a(f10, 1073741824);
            } else {
                i10 = 0;
            }
            view.setBackgroundColor(i10);
        }
        float f14 = -1.0f;
        if (!z10) {
            this.f1832p3 = -1.0f;
        }
        if (z10 && this.U4) {
            f14 = Utilities.clamp01(f10);
        }
        this.f1858s0.D = f14;
        if (z10) {
            i11 = 2;
        }
        if (getLayerType() != i11) {
            setLayerType(i11, null);
        }
        invalidate();
    }

    public void setRevealOpening(boolean z10) {
        this.U4 = z10;
    }

    public void setScanHidden(boolean z10) {
        if (this.f1805m7 != z10) {
            this.f1805m7 = z10;
            invalidate();
        }
    }

    public void setTemporaryLink(boolean z10) {
        float f7;
        if (this.B2 == z10) {
            return;
        }
        this.B2 = z10;
        if (!this.H2) {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.E2 = f7;
            this.C2 = f7;
        }
        invalidate();
    }

    public void setThemeEditable(boolean z10) {
        if (this.f1680a != z10) {
            this.f1680a = z10;
            invalidate();
        }
    }

    public void setTimerOnly(boolean z10) {
        this.f1920y0 = z10;
    }

    public final int t0() {
        int i10;
        int i11 = this.f1935z6;
        SparseIntArray sparseIntArray = this.f1925y6;
        if (i11 != 1) {
            sparseIntArray.clear();
            this.f1935z6 = 1;
        }
        r1 r1Var = this.f1808n;
        if (r1Var != null) {
            i10 = r1Var.f1664b;
        } else {
            i10 = 0;
        }
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        int u10 = u(this.f1808n);
        sparseIntArray.put(i10, u10);
        return u10;
    }

    public final void u1(boolean z10) {
        long max;
        String sb2;
        if (this.f1888v0) {
            if (!this.f1899w0) {
                StringBuilder sb3 = new StringBuilder();
                d3.p(R.string.QrNoPaidFree, " · ", sb3);
                sb2 = org.telegram.messenger.t.h(R.string.QrNoPaidNoTimeLimit, sb3);
                this.A2 = -1;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.A0) {
                    max = 60000;
                } else {
                    max = Math.max(0L, this.f1929z0 - currentTimeMillis);
                }
                int ceil = (int) Math.ceil(max / 1000.0d);
                if (ceil != this.A2 || this.f1931z2 == null) {
                    this.A2 = ceil;
                    StringBuilder sb4 = new StringBuilder();
                    d3.p(R.string.QrNoPaidFree, " · ", sb4);
                    sb4.append(LocaleController.formatString(R.string.QrNoPaidExpiresIn, String.format(Locale.US, "%d:%02d", Integer.valueOf(ceil / 60), Integer.valueOf(ceil % 60))));
                    sb2 = sb4.toString();
                } else {
                    return;
                }
            }
            if (!sb2.equals(this.f1931z2)) {
                this.f1931z2 = sb2;
                this.L0.t(sb2, z10, true);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        yj0 yj0Var;
        if ((drawable instanceof RippleDrawable) || drawable == this.L0 || drawable == this.X1 || (((yj0Var = this.f1806m8) != null && drawable == yj0Var) || super.verifyDrawable(drawable))) {
            return true;
        }
        return false;
    }

    public final Drawable w(int i10) {
        return getContext().getResources().getDrawable(i10).mutate();
    }

    public final float x1(float f7, float f10, int i10, int i11) {
        float f11 = this.f1898w;
        double max = Math.max(f11, i10 - f11);
        float f12 = this.f1909x;
        return (((1.0f - ((float) Math.pow(1.0f - Utilities.clamp01(((float) Math.hypot(f7 - this.f1898w, f10 - this.f1909x)) / (((float) Math.hypot(max, Math.max(f12, i11 - f12))) + AndroidUtilities.dp(60.0f))), 0.4166666567325592d))) * 600.0f) / 1000.0f) - 0.03f;
    }

    public final void y(Canvas canvas, Bitmap bitmap) {
        float f7 = this.f1736f3;
        float f10 = (-f7) / 2.0f;
        float width = (bitmap.getWidth() - 0.5f) * f7;
        float height = (bitmap.getHeight() - 0.5f) * f7;
        RectF rectF = this.f1725e3;
        rectF.set(f10, f10, width, height);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, this.f1694b3);
    }

    public final void y0() {
        long j10;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i10;
        t9 t9Var = this.f1763i2;
        if (t9Var == null) {
            return;
        }
        q1 q1Var = this.F;
        int i11 = q1Var.f1637a;
        ArrayList arrayList = this.f1889v1;
        if (i11 == 2 && (i10 = q1Var.f1650q) >= 0 && i10 < arrayList.size()) {
            j10 = ((TL_stars.TL_starGiftUnique) arrayList.get(this.F.f1650q)).f22257id;
        } else {
            j10 = 0;
        }
        if (j10 != 0) {
            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(this.F.f1650q);
        } else {
            tL_starGiftUnique = null;
        }
        arrayList.clear();
        HashMap hashMap = this.f1921y1;
        hashMap.clear();
        ArrayList arrayList2 = t9Var.f5471l;
        int size = arrayList2.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            TL_stars.StarGift starGift = savedStarGift.gift;
            if ((starGift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift.refunded) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) starGift;
                if (!tL_starGiftUnique2.burned) {
                    arrayList.add(tL_starGiftUnique2);
                    hashMap.put(Long.valueOf(savedStarGift.gift.f22257id), Long.valueOf(savedStarGift.saved_id));
                }
            }
        }
        if (tL_starGiftUnique != null) {
            int i14 = 0;
            while (true) {
                if (i14 < arrayList.size()) {
                    if (((TL_stars.TL_starGiftUnique) arrayList.get(i14)).f22257id == j10) {
                        break;
                    }
                    i14++;
                } else {
                    i14 = -1;
                    break;
                }
            }
            if (i14 < 0) {
                arrayList.add(0, tL_starGiftUnique);
            } else {
                i12 = i14;
            }
            this.F.f1650q = i12;
            this.M7 = i12;
        }
        boolean z10 = t9Var.f5469j;
        this.f1911x1 = z10;
        if (!z10 && !t9Var.f5468i) {
            t9Var.b();
        }
        if (!arrayList.isEmpty() && !this.f1792l2) {
            this.f1792l2 = true;
            l1 l1Var = this.f1783k2;
            removeCallbacks(l1Var);
            postDelayed(l1Var, 900L);
        }
        invalidate();
    }

    public final void z(android.graphics.Canvas r45, int r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: ai.t1.z(android.graphics.Canvas, int, int):void");
    }

    public final float z0() {
        float f7;
        int f02;
        int dp;
        int dp2;
        float f10;
        float C = wh.C(10.0f, 2, getWidth()) - AndroidUtilities.dp(8.0f);
        int i10 = this.f1752h1;
        if (i10 == 0) {
            f7 = C / 6.0f;
            f02 = (a.f1416b.length + 5) / 6;
            dp = AndroidUtilities.dp(4.0f) - AndroidUtilities.dp(32.0f);
            dp2 = AndroidUtilities.dp(4.0f);
        } else {
            if (i10 == 1) {
                f7 = C / 6.0f;
                f10 = 0.0f;
            } else if (h0()) {
                f7 = 0.0f;
                f10 = 0.0f;
            } else {
                f7 = C / 3.0f;
                f02 = ((f0() + this.f1889v1.size()) - 1) / f0();
                dp = AndroidUtilities.dp(4.0f) - AndroidUtilities.dp(32.0f);
                dp2 = AndroidUtilities.dp(4.0f);
            }
            f02 = 0;
            return Math.max(0.0f, (((f02 * f7) + f10) + AndroidUtilities.dp(32.0f)) - b1());
        }
        f10 = dp2 + dp;
        return Math.max(0.0f, (((f02 * f7) + f10) + AndroidUtilities.dp(32.0f)) - b1());
    }
}
