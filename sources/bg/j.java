package bg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.g6;

public final class j {

    public static final String[] f2139a0 = {"models/star.binobj"};

    public static final String[] f2140b0 = {"models/diamond_outer_2.binobj", "models/diamond_outer.binobj", "models/diamond.binobj"};

    public static final String[] f2141c0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/coin_logo.binobj", "models/coin_stars.binobj"};

    public static final String[] f2142d0 = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/deal_logo.binobj", "models/coin_stars.binobj"};
    public boolean D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final Bitmap U;
    public Bitmap V;
    public final int W;
    public final int X;
    public final int[] Y;

    public final int f2143a;

    public final int f2144b;

    public final int f2145c;
    public final FloatBuffer[] d;

    public final FloatBuffer[] f2146e;

    public final FloatBuffer[] f2147f;

    public final int f2148g;
    public final int h;

    public final int f2149i;

    public final int f2150j;

    public final int f2151k;

    public final int f2152l;

    public final int f2153m;

    public final int f2154n;

    public final int f2155o;

    public final int f2156p;

    public final int f2157q;

    public final int f2158r;

    public float f2159s;

    public final int[] f2160t;

    public int f2164y;

    public int f2165z;

    public float f2161u = 0.0f;
    public float v = 2.0f;

    public float f2162w = 0.13f;

    public float f2163x = 1.0f;
    public float A = 0.2f;
    public int B = -1;
    public int C = -1;
    public float Z = 0.0f;

    public j(Context context, int i10) {
        String[] strArr;
        String[] strArr2;
        float f10;
        int i11;
        float[] fArr;
        String str;
        int i12;
        FloatBuffer[] floatBufferArr;
        FloatBuffer[] floatBufferArr2;
        FloatBuffer[] floatBufferArr3;
        int i13;
        int i14;
        int i15;
        Bitmap bitmapDecodeStream;
        int[] iArr;
        Bitmap bitmap;
        char c10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        float[] fArr2;
        float[] fArr3;
        DataInputStream dataInputStream;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        ArrayList arrayList4;
        float fFloatValue;
        int i28;
        float fFloatValue2;
        this.X = i10;
        try {
            if (i10 == 1) {
                strArr = f2141c0;
            } else if (i10 == 3) {
                strArr = f2142d0;
            } else {
                if (i10 != 0 && i10 != 2) {
                    if (i10 == 4) {
                        strArr2 = f2140b0;
                        f10 = 8.0f;
                    } else {
                        strArr = new String[0];
                    }
                    int length = strArr2.length;
                    this.W = length;
                    this.d = new FloatBuffer[length];
                    this.f2146e = new FloatBuffer[length];
                    this.f2147f = new FloatBuffer[length];
                    this.f2160t = new int[length];
                    i11 = 0;
                    while (true) {
                        fArr = null;
                        if (i11 < this.W) {
                            break;
                        }
                        String str2 = strArr2[i11];
                        arrayList = new ArrayList();
                        arrayList2 = new ArrayList();
                        arrayList3 = new ArrayList();
                        try {
                            try {
                                dataInputStream = new DataInputStream(context.getAssets().open(str2));
                                i16 = dataInputStream.readInt();
                                for (i17 = 0; i17 < i16; i17++) {
                                    try {
                                        arrayList.add(Float.valueOf(dataInputStream.readFloat()));
                                    } catch (IOException e9) {
                                        e = e9;
                                        fArr2 = null;
                                        fArr3 = null;
                                        e.printStackTrace();
                                        this.d[i11] = rl.f(ByteBuffer.allocateDirect(fArr.length * 4));
                                        this.d[i11].put(fArr).position(0);
                                        this.f2146e[i11] = rl.f(ByteBuffer.allocateDirect(fArr2.length * 4));
                                        this.f2146e[i11].put(fArr2).position(0);
                                        this.f2147f[i11] = rl.f(ByteBuffer.allocateDirect(fArr3.length * 4));
                                        this.f2147f[i11].put(fArr3).position(0);
                                        this.f2160t[i11] = fArr.length;
                                        i11++;
                                    }
                                }
                                i18 = dataInputStream.readInt();
                                for (i19 = 0; i19 < i18; i19++) {
                                    arrayList3.add(Float.valueOf(dataInputStream.readFloat()));
                                }
                                i20 = dataInputStream.readInt();
                                for (i21 = 0; i21 < i20; i21++) {
                                    arrayList2.add(Float.valueOf(dataInputStream.readFloat()));
                                }
                                i22 = dataInputStream.readInt();
                                int i29 = i22 * 3;
                                fArr3 = new float[i29];
                                try {
                                    fArr2 = new float[i22 * 2];
                                    try {
                                        fArr = new float[i29];
                                        i23 = 0;
                                        i24 = 0;
                                        i25 = 0;
                                        i26 = 0;
                                        while (i23 < i22) {
                                            int i30 = dataInputStream.readInt() * 3;
                                            int i31 = i22;
                                            fArr[i24] = ((Float) arrayList.get(i30)).floatValue() * f10;
                                            int i32 = i24 + 2;
                                            fArr[i24 + 1] = ((Float) arrayList.get(i30 + 1)).floatValue() * f10;
                                            i24 += 3;
                                            fArr[i32] = ((Float) arrayList.get(i30 + 2)).floatValue() * f10;
                                            i27 = dataInputStream.readInt() * 2;
                                            int i33 = i25 + 1;
                                            if (i27 >= 0) {
                                                arrayList4 = arrayList;
                                                if (i27 >= arrayList3.size()) {
                                                    fFloatValue = ((Float) arrayList3.get(i27)).floatValue();
                                                }
                                                fArr2[i25] = fFloatValue;
                                                i28 = i27 + 1;
                                                i25 += 2;
                                                if (i28 >= 0 || i28 >= arrayList3.size()) {
                                                    fFloatValue2 = 0.0f;
                                                } else {
                                                    fFloatValue2 = 1.0f - ((Float) arrayList3.get(i28)).floatValue();
                                                }
                                                fArr2[i33] = fFloatValue2;
                                                int i34 = dataInputStream.readInt() * 3;
                                                fArr3[i26] = ((Float) arrayList2.get(i34)).floatValue();
                                                int i35 = i26 + 2;
                                                fArr3[i26 + 1] = ((Float) arrayList2.get(i34 + 1)).floatValue();
                                                i26 += 3;
                                                fArr3[i35] = ((Float) arrayList2.get(i34 + 2)).floatValue();
                                                i23++;
                                                arrayList = arrayList4;
                                                i22 = i31;
                                            } else {
                                                arrayList4 = arrayList;
                                            }
                                            fFloatValue = 0.0f;
                                            fArr2[i25] = fFloatValue;
                                            i28 = i27 + 1;
                                            i25 += 2;
                                            if (i28 >= 0) {
                                                fFloatValue2 = 0.0f;
                                            } else {
                                                fFloatValue2 = 0.0f;
                                            }
                                            fArr2[i33] = fFloatValue2;
                                            int i36 = dataInputStream.readInt() * 3;
                                            fArr3[i26] = ((Float) arrayList2.get(i36)).floatValue();
                                            int i37 = i26 + 2;
                                            fArr3[i26 + 1] = ((Float) arrayList2.get(i36 + 1)).floatValue();
                                            i26 += 3;
                                            fArr3[i37] = ((Float) arrayList2.get(i36 + 2)).floatValue();
                                            i23++;
                                            arrayList = arrayList4;
                                            i22 = i31;
                                        }
                                    } catch (IOException e10) {
                                        e = e10;
                                        e.printStackTrace();
                                    }
                                } catch (IOException e11) {
                                    e = e11;
                                    fArr2 = null;
                                }
                            } catch (IOException e12) {
                                e = e12;
                                fArr2 = null;
                                fArr3 = null;
                                e.printStackTrace();
                                this.d[i11] = rl.f(ByteBuffer.allocateDirect(fArr.length * 4));
                                this.d[i11].put(fArr).position(0);
                                this.f2146e[i11] = rl.f(ByteBuffer.allocateDirect(fArr2.length * 4));
                                this.f2146e[i11].put(fArr2).position(0);
                                this.f2147f[i11] = rl.f(ByteBuffer.allocateDirect(fArr3.length * 4));
                                this.f2147f[i11].put(fArr3).position(0);
                                this.f2160t[i11] = fArr.length;
                                i11++;
                            }
                        } catch (IOException e13) {
                            e = e13;
                        }
                        this.d[i11] = rl.f(ByteBuffer.allocateDirect(fArr.length * 4));
                        this.d[i11].put(fArr).position(0);
                        this.f2146e[i11] = rl.f(ByteBuffer.allocateDirect(fArr2.length * 4));
                        this.f2146e[i11].put(fArr2).position(0);
                        this.f2147f[i11] = rl.f(ByteBuffer.allocateDirect(fArr3.length * 4));
                        this.f2147f[i11].put(fArr3).position(0);
                        this.f2160t[i11] = fArr.length;
                        i11++;
                    }
                    this.U = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(this.U);
                    Paint paint = new Paint();
                    paint.setShader(new LinearGradient(0.0f, 100.0f, 150.0f, 0.0f, new int[]{g6.w0(null, g6.Lj, false), g6.w0(null, g6.Mj, false), g6.w0(null, g6.Nj, false), g6.w0(null, g6.Oj, false)}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP));
                    canvas.drawRect(0.0f, 0.0f, 100.0f, 100.0f, paint);
                    int[] iArr2 = new int[1];
                    GLES20.glGenTextures(1, iArr2, 0);
                    GLES20.glBindTexture(3553, iArr2[0]);
                    GLES20.glTexParameteri(3553, 10241, 9728);
                    GLES20.glTexParameteri(3553, 10240, 9728);
                    GLUtils.texImage2D(3553, 0, this.U, 0);
                    this.f2156p = iArr2[0];
                    int[] iArr3 = new int[1];
                    if (i10 != 0 || i10 == 2) {
                        str = "shaders/fragment4.glsl";
                    } else {
                        str = i10 == 4 ? "shaders/fragment5.glsl" : "shaders/fragment3.glsl";
                    }
                    int iA = a.a(35633, c(b(context, "shaders/vertex2.glsl")));
                    int iA2 = a.a(35632, c(b(context, str)));
                    int iGlCreateProgram = GLES20.glCreateProgram();
                    GLES20.glAttachShader(iGlCreateProgram, iA);
                    GLES20.glAttachShader(iGlCreateProgram, iA2);
                    GLES20.glLinkProgram(iGlCreateProgram);
                    GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr3, 0);
                    this.f2143a = iGlCreateProgram;
                    i12 = this.X;
                    floatBufferArr = this.d;
                    floatBufferArr2 = this.f2147f;
                    floatBufferArr3 = this.f2146e;
                    GLES20.glUseProgram(iGlCreateProgram);
                    this.f2151k = GLES20.glGetAttribLocation(iGlCreateProgram, "vPosition");
                    this.f2152l = GLES20.glGetAttribLocation(iGlCreateProgram, "a_TexCoordinate");
                    this.f2153m = GLES20.glGetAttribLocation(iGlCreateProgram, "a_Normal");
                    this.f2148g = GLES20.glGetUniformLocation(iGlCreateProgram, "u_Texture");
                    this.h = GLES20.glGetUniformLocation(iGlCreateProgram, "u_NormalMap");
                    this.f2149i = GLES20.glGetUniformLocation(iGlCreateProgram, "u_BackgroundTexture");
                    this.f2154n = GLES20.glGetUniformLocation(iGlCreateProgram, "f_xOffset");
                    this.f2155o = GLES20.glGetUniformLocation(iGlCreateProgram, "f_alpha");
                    this.f2144b = GLES20.glGetUniformLocation(iGlCreateProgram, "uMVPMatrix");
                    this.f2145c = GLES20.glGetUniformLocation(iGlCreateProgram, "world");
                    this.f2157q = GLES20.glGetUniformLocation(iGlCreateProgram, "white");
                    this.f2158r = GLES20.glGetUniformLocation(iGlCreateProgram, "golden");
                    this.E = GLES20.glGetUniformLocation(iGlCreateProgram, "spec1");
                    this.F = GLES20.glGetUniformLocation(iGlCreateProgram, "spec2");
                    this.G = GLES20.glGetUniformLocation(iGlCreateProgram, "u_diffuse");
                    this.H = GLES20.glGetUniformLocation(iGlCreateProgram, "gradientColor1");
                    this.I = GLES20.glGetUniformLocation(iGlCreateProgram, "gradientColor2");
                    this.K = GLES20.glGetUniformLocation(iGlCreateProgram, "normalSpecColor");
                    this.J = GLES20.glGetUniformLocation(iGlCreateProgram, "normalSpec");
                    this.L = GLES20.glGetUniformLocation(iGlCreateProgram, "specColor");
                    this.M = GLES20.glGetUniformLocation(iGlCreateProgram, "resolution");
                    this.N = GLES20.glGetUniformLocation(iGlCreateProgram, "gradientPosition");
                    this.O = GLES20.glGetUniformLocation(iGlCreateProgram, "modelIndex");
                    this.P = GLES20.glGetUniformLocation(iGlCreateProgram, "modelIndex2");
                    this.Q = GLES20.glGetUniformLocation(iGlCreateProgram, "behind");
                    this.R = GLES20.glGetUniformLocation(iGlCreateProgram, "type");
                    this.S = GLES20.glGetUniformLocation(iGlCreateProgram, "night");
                    this.T = GLES20.glGetUniformLocation(iGlCreateProgram, "time");
                    i13 = this.W;
                    int i38 = i13 * 3;
                    int[] iArr4 = new int[i38];
                    this.Y = iArr4;
                    i14 = 0;
                    GLES20.glGenBuffers(i38, iArr4, 0);
                    i15 = 0;
                    while (i15 < i13) {
                        int i39 = i15 * 3;
                        GLES20.glBindBuffer(34962, this.Y[i39]);
                        floatBufferArr3[i15].position(i14);
                        GLES20.glBufferData(34962, floatBufferArr3[i15].capacity() * 4, floatBufferArr3[i15], 35044);
                        GLES20.glEnableVertexAttribArray(this.f2152l);
                        floatBufferArr3[i15].clear();
                        GLES20.glBindBuffer(34962, this.Y[i39 + 1]);
                        floatBufferArr2[i15].position(0);
                        GLES20.glBufferData(34962, floatBufferArr2[i15].capacity() * 4, floatBufferArr2[i15], 35044);
                        GLES20.glEnableVertexAttribArray(this.f2153m);
                        floatBufferArr2[i15].clear();
                        GLES20.glBindBuffer(34962, this.Y[i39 + 2]);
                        floatBufferArr[i15].position(0);
                        GLES20.glBufferData(34962, floatBufferArr[i15].capacity() * 4, floatBufferArr[i15], 35044);
                        GLES20.glEnableVertexAttribArray(this.f2151k);
                        floatBufferArr[i15].clear();
                        i15++;
                        i14 = 0;
                    }
                    GLES20.glBindBuffer(34962, 0);
                    int[] iArr5 = new int[1];
                    GLES20.glGenTextures(1, iArr5, 0);
                    int i40 = iArr5[0];
                    this.f2156p = i40;
                    GLES20.glBindTexture(3553, i40);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glBindTexture(3553, this.f2156p);
                    bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open("flecks.png"));
                    iArr = new int[1];
                    GLES20.glGenTextures(1, iArr, 0);
                    GLES20.glBindTexture(3553, iArr[0]);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLUtils.texImage2D(3553, 0, bitmapDecodeStream, 0);
                    bitmapDecodeStream.recycle();
                    int[] iArr6 = new int[1];
                    GLES20.glGenTextures(1, iArr6, 0);
                    int i41 = iArr6[0];
                    this.f2150j = i41;
                    GLES20.glBindTexture(3553, i41);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glBindTexture(3553, this.f2150j);
                    if (i12 != 0 || i12 == 2) {
                        bitmap = SvgHelper.getBitmap(R.raw.start_texture, 240, 240, -1);
                    } else {
                        try {
                            if (i12 == 1) {
                                bitmap = BitmapFactory.decodeStream(context.getAssets().open("models/coin_border.png"));
                            } else if (i12 == 3) {
                                bitmap = BitmapFactory.decodeStream(context.getAssets().open("models/deal_border.png"));
                            } else {
                                bitmap = null;
                            }
                        } catch (IOException unused) {
                        }
                    }
                    if (bitmap != null) {
                        int[] iArr7 = new int[1];
                        c10 = 0;
                        GLES20.glGenTextures(1, iArr7, 0);
                        GLES20.glBindTexture(3553, iArr7[0]);
                        GLES20.glTexParameteri(3553, 10241, 9729);
                        GLES20.glTexParameteri(3553, 10240, 9729);
                        GLUtils.texImage2D(3553, 0, bitmap, 0);
                        bitmap.recycle();
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, iArr7[0]);
                        GLES20.glUniform1i(this.f2148g, 0);
                        GLES20.glActiveTexture(33985);
                        GLES20.glBindTexture(3553, iArr[0]);
                        GLES20.glUniform1i(this.h, 1);
                    } else {
                        c10 = 0;
                    }
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, iArr6[c10]);
                    GLES20.glUniform1i(this.f2149i, 2);
                    if (i12 == 4) {
                        GLES20.glEnable(2884);
                        GLES20.glEnable(3042);
                        GLES20.glBlendFunc(770, 771);
                    }
                }
                strArr = f2139a0;
            }
            bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open("flecks.png"));
        } catch (IOException unused2) {
            bitmapDecodeStream = null;
        }
        strArr2 = strArr;
        f10 = 1.0f;
        int length2 = strArr2.length;
        this.W = length2;
        this.d = new FloatBuffer[length2];
        this.f2146e = new FloatBuffer[length2];
        this.f2147f = new FloatBuffer[length2];
        this.f2160t = new int[length2];
        i11 = 0;
        while (true) {
            fArr = null;
            if (i11 < this.W) {
                break;
                break;
            }
            String str3 = strArr2[i11];
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            arrayList3 = new ArrayList();
            dataInputStream = new DataInputStream(context.getAssets().open(str3));
            i16 = dataInputStream.readInt();
            while (i17 < i16) {
                arrayList.add(Float.valueOf(dataInputStream.readFloat()));
            }
            i18 = dataInputStream.readInt();
            while (i19 < i18) {
                arrayList3.add(Float.valueOf(dataInputStream.readFloat()));
            }
            i20 = dataInputStream.readInt();
            while (i21 < i20) {
                arrayList2.add(Float.valueOf(dataInputStream.readFloat()));
            }
            i22 = dataInputStream.readInt();
            int i210 = i22 * 3;
            fArr3 = new float[i210];
            fArr2 = new float[i22 * 2];
            fArr = new float[i210];
            i23 = 0;
            i24 = 0;
            i25 = 0;
            i26 = 0;
            while (i23 < i22) {
                int i310 = dataInputStream.readInt() * 3;
                int i311 = i22;
                fArr[i24] = ((Float) arrayList.get(i310)).floatValue() * f10;
                int i312 = i24 + 2;
                fArr[i24 + 1] = ((Float) arrayList.get(i310 + 1)).floatValue() * f10;
                i24 += 3;
                fArr[i312] = ((Float) arrayList.get(i310 + 2)).floatValue() * f10;
                i27 = dataInputStream.readInt() * 2;
                int i313 = i25 + 1;
                if (i27 >= 0) {
                    arrayList4 = arrayList;
                    if (i27 >= arrayList3.size()) {
                        fFloatValue = ((Float) arrayList3.get(i27)).floatValue();
                    }
                    fArr2[i25] = fFloatValue;
                    i28 = i27 + 1;
                    i25 += 2;
                    if (i28 >= 0) {
                        fFloatValue2 = 0.0f;
                    } else {
                        fFloatValue2 = 0.0f;
                    }
                    fArr2[i313] = fFloatValue2;
                    int i314 = dataInputStream.readInt() * 3;
                    fArr3[i26] = ((Float) arrayList2.get(i314)).floatValue();
                    int i315 = i26 + 2;
                    fArr3[i26 + 1] = ((Float) arrayList2.get(i314 + 1)).floatValue();
                    i26 += 3;
                    fArr3[i315] = ((Float) arrayList2.get(i314 + 2)).floatValue();
                    i23++;
                    arrayList = arrayList4;
                    i22 = i311;
                } else {
                    arrayList4 = arrayList;
                }
                fFloatValue = 0.0f;
                fArr2[i25] = fFloatValue;
                i28 = i27 + 1;
                i25 += 2;
                if (i28 >= 0) {
                    fFloatValue2 = 0.0f;
                } else {
                    fFloatValue2 = 0.0f;
                }
                fArr2[i313] = fFloatValue2;
                int i316 = dataInputStream.readInt() * 3;
                fArr3[i26] = ((Float) arrayList2.get(i316)).floatValue();
                int i317 = i26 + 2;
                fArr3[i26 + 1] = ((Float) arrayList2.get(i316 + 1)).floatValue();
                i26 += 3;
                fArr3[i317] = ((Float) arrayList2.get(i316 + 2)).floatValue();
                i23++;
                arrayList = arrayList4;
                i22 = i311;
            }
            this.d[i11] = rl.f(ByteBuffer.allocateDirect(fArr.length * 4));
            this.d[i11].put(fArr).position(0);
            this.f2146e[i11] = rl.f(ByteBuffer.allocateDirect(fArr2.length * 4));
            this.f2146e[i11].put(fArr2).position(0);
            this.f2147f[i11] = rl.f(ByteBuffer.allocateDirect(fArr3.length * 4));
            this.f2147f[i11].put(fArr3).position(0);
            this.f2160t[i11] = fArr.length;
            i11++;
        }
        this.U = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(this.U);
        Paint paint2 = new Paint();
        paint2.setShader(new LinearGradient(0.0f, 100.0f, 150.0f, 0.0f, new int[]{g6.w0(null, g6.Lj, false), g6.w0(null, g6.Mj, false), g6.w0(null, g6.Nj, false), g6.w0(null, g6.Oj, false)}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP));
        canvas2.drawRect(0.0f, 0.0f, 100.0f, 100.0f, paint2);
        int[] iArr8 = new int[1];
        GLES20.glGenTextures(1, iArr8, 0);
        GLES20.glBindTexture(3553, iArr8[0]);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLUtils.texImage2D(3553, 0, this.U, 0);
        this.f2156p = iArr8[0];
        int[] iArr9 = new int[1];
        if (i10 != 0) {
            str = "shaders/fragment4.glsl";
        } else {
            str = "shaders/fragment4.glsl";
        }
        int iA3 = a.a(35633, c(b(context, "shaders/vertex2.glsl")));
        int iA4 = a.a(35632, c(b(context, str)));
        int iGlCreateProgram2 = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram2, iA3);
        GLES20.glAttachShader(iGlCreateProgram2, iA4);
        GLES20.glLinkProgram(iGlCreateProgram2);
        GLES20.glGetProgramiv(iGlCreateProgram2, 35714, iArr9, 0);
        this.f2143a = iGlCreateProgram2;
        i12 = this.X;
        floatBufferArr = this.d;
        floatBufferArr2 = this.f2147f;
        floatBufferArr3 = this.f2146e;
        GLES20.glUseProgram(iGlCreateProgram2);
        this.f2151k = GLES20.glGetAttribLocation(iGlCreateProgram2, "vPosition");
        this.f2152l = GLES20.glGetAttribLocation(iGlCreateProgram2, "a_TexCoordinate");
        this.f2153m = GLES20.glGetAttribLocation(iGlCreateProgram2, "a_Normal");
        this.f2148g = GLES20.glGetUniformLocation(iGlCreateProgram2, "u_Texture");
        this.h = GLES20.glGetUniformLocation(iGlCreateProgram2, "u_NormalMap");
        this.f2149i = GLES20.glGetUniformLocation(iGlCreateProgram2, "u_BackgroundTexture");
        this.f2154n = GLES20.glGetUniformLocation(iGlCreateProgram2, "f_xOffset");
        this.f2155o = GLES20.glGetUniformLocation(iGlCreateProgram2, "f_alpha");
        this.f2144b = GLES20.glGetUniformLocation(iGlCreateProgram2, "uMVPMatrix");
        this.f2145c = GLES20.glGetUniformLocation(iGlCreateProgram2, "world");
        this.f2157q = GLES20.glGetUniformLocation(iGlCreateProgram2, "white");
        this.f2158r = GLES20.glGetUniformLocation(iGlCreateProgram2, "golden");
        this.E = GLES20.glGetUniformLocation(iGlCreateProgram2, "spec1");
        this.F = GLES20.glGetUniformLocation(iGlCreateProgram2, "spec2");
        this.G = GLES20.glGetUniformLocation(iGlCreateProgram2, "u_diffuse");
        this.H = GLES20.glGetUniformLocation(iGlCreateProgram2, "gradientColor1");
        this.I = GLES20.glGetUniformLocation(iGlCreateProgram2, "gradientColor2");
        this.K = GLES20.glGetUniformLocation(iGlCreateProgram2, "normalSpecColor");
        this.J = GLES20.glGetUniformLocation(iGlCreateProgram2, "normalSpec");
        this.L = GLES20.glGetUniformLocation(iGlCreateProgram2, "specColor");
        this.M = GLES20.glGetUniformLocation(iGlCreateProgram2, "resolution");
        this.N = GLES20.glGetUniformLocation(iGlCreateProgram2, "gradientPosition");
        this.O = GLES20.glGetUniformLocation(iGlCreateProgram2, "modelIndex");
        this.P = GLES20.glGetUniformLocation(iGlCreateProgram2, "modelIndex2");
        this.Q = GLES20.glGetUniformLocation(iGlCreateProgram2, "behind");
        this.R = GLES20.glGetUniformLocation(iGlCreateProgram2, "type");
        this.S = GLES20.glGetUniformLocation(iGlCreateProgram2, "night");
        this.T = GLES20.glGetUniformLocation(iGlCreateProgram2, "time");
        i13 = this.W;
        int i318 = i13 * 3;
        int[] iArr10 = new int[i318];
        this.Y = iArr10;
        i14 = 0;
        GLES20.glGenBuffers(i318, iArr10, 0);
        i15 = 0;
        while (i15 < i13) {
            int i319 = i15 * 3;
            GLES20.glBindBuffer(34962, this.Y[i319]);
            floatBufferArr3[i15].position(i14);
            GLES20.glBufferData(34962, floatBufferArr3[i15].capacity() * 4, floatBufferArr3[i15], 35044);
            GLES20.glEnableVertexAttribArray(this.f2152l);
            floatBufferArr3[i15].clear();
            GLES20.glBindBuffer(34962, this.Y[i319 + 1]);
            floatBufferArr2[i15].position(0);
            GLES20.glBufferData(34962, floatBufferArr2[i15].capacity() * 4, floatBufferArr2[i15], 35044);
            GLES20.glEnableVertexAttribArray(this.f2153m);
            floatBufferArr2[i15].clear();
            GLES20.glBindBuffer(34962, this.Y[i319 + 2]);
            floatBufferArr[i15].position(0);
            GLES20.glBufferData(34962, floatBufferArr[i15].capacity() * 4, floatBufferArr[i15], 35044);
            GLES20.glEnableVertexAttribArray(this.f2151k);
            floatBufferArr[i15].clear();
            i15++;
            i14 = 0;
        }
        GLES20.glBindBuffer(34962, 0);
        int[] iArr11 = new int[1];
        GLES20.glGenTextures(1, iArr11, 0);
        int i42 = iArr11[0];
        this.f2156p = i42;
        GLES20.glBindTexture(3553, i42);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glBindTexture(3553, this.f2156p);
        iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLUtils.texImage2D(3553, 0, bitmapDecodeStream, 0);
        bitmapDecodeStream.recycle();
        int[] iArr12 = new int[1];
        GLES20.glGenTextures(1, iArr12, 0);
        int i43 = iArr12[0];
        this.f2150j = i43;
        GLES20.glBindTexture(3553, i43);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glBindTexture(3553, this.f2150j);
        if (i12 != 0) {
            bitmap = SvgHelper.getBitmap(R.raw.start_texture, 240, 240, -1);
        } else {
            bitmap = SvgHelper.getBitmap(R.raw.start_texture, 240, 240, -1);
        }
        if (bitmap != null) {
            int[] iArr13 = new int[1];
            c10 = 0;
            GLES20.glGenTextures(1, iArr13, 0);
            GLES20.glBindTexture(3553, iArr13[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            bitmap.recycle();
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr13[0]);
            GLES20.glUniform1i(this.f2148g, 0);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glUniform1i(this.h, 1);
        } else {
            c10 = 0;
        }
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, iArr12[c10]);
        GLES20.glUniform1i(this.f2149i, 2);
        if (i12 == 4) {
            GLES20.glEnable(2884);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
        }
    }

    public static String b(Context context, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, StandardCharsets.UTF_8));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
                sb2.append("\n");
            }
            bufferedReader.close();
            inputStreamOpen.close();
        } catch (IOException e9) {
            e9.printStackTrace();
        }
        return sb2.toString();
    }

    public static String c(String str) {
        Matcher matcher = Pattern.compile("RGB#([0-9a-fA-F]{6})").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            matcher.appendReplacement(stringBuffer, String.format(Locale.US, "vec3(%.3f, %.3f, %.3f)", Double.valueOf(((double) Integer.parseInt(strGroup.substring(0, 2), 16)) / 255.0d), Double.valueOf(((double) Integer.parseInt(strGroup.substring(2, 4), 16)) / 255.0d), Double.valueOf(((double) Integer.parseInt(strGroup.substring(4, 6), 16)) / 255.0d)));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public final void a(int i10, boolean z10) {
        int i11 = i10 * 3;
        GLES20.glBindBuffer(34962, this.Y[i11]);
        GLES20.glVertexAttribPointer(this.f2152l, 2, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.Y[i11 + 1]);
        GLES20.glVertexAttribPointer(this.f2153m, 3, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.Y[i11 + 2]);
        GLES20.glVertexAttribPointer(this.f2151k, 3, 5126, false, 0, 0);
        GLES20.glUniform1i(this.O, i10);
        GLES20.glUniform1i(this.P, i10);
        GLES20.glUniform1i(this.Q, z10 ? 1 : 0);
        GLES20.glUniform1i(this.R, this.X);
        GLES20.glDrawArrays(4, 0, this.f2160t[i10] / 3);
    }
}
