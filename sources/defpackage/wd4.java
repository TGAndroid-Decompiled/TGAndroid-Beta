package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.Utilities;
public final class wd4 {
    public int A;
    public int A0;
    public int B;
    public int B0;
    public int C;
    public int C0;
    public int D;
    public int D0;
    public int E;
    public int E0;
    public int F;
    public int F0;
    public int G;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public int L;
    public int L0;
    public int M;
    public int M0;
    public int N;
    public int N0;
    public int O;
    public int O0;
    public int P;
    public float[] P0;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int[] U0;
    public int V;
    public int W;
    public boolean W0;
    public int X;
    public int X0;
    public int Y;
    public int Y0;
    public int Z;
    public final FloatBuffer Z0;
    public int a0;
    public final FloatBuffer a1;
    public int b0;
    public final FloatBuffer b1;
    public boolean c;
    public int c0;
    public ByteBuffer c1;
    public boolean d;
    public int d0;
    public ByteBuffer d1;
    public ud4 e;
    public int e0;
    public ByteBuffer e1;
    public float f;
    public int f0;
    public vd4 f1;
    public ud4 g;
    public int g0;
    public final boolean g1;
    public boolean h;
    public int h0;
    public e4b h1;
    public int i;
    public int i0;
    public int j;
    public int j0;
    public int k;
    public int k0;
    public int l;
    public int l0;
    public int m;
    public int m0;
    public int n;
    public int n0;
    public lc1 o;
    public int o0;
    public int p;
    public int p0;
    public int q;
    public int q0;
    public int r;
    public int r0;
    public int s;
    public int s0;
    public int t;
    public int t0;
    public int u;
    public int u0;
    public int v;
    public int v0;
    public int w;
    public int w0;
    public int x;
    public int x0;
    public int y;
    public int y0;
    public int z;
    public int z0;
    public boolean a = true;
    public boolean b = true;
    public final int[] H = new int[2];
    public final int[] I = new int[2];
    public final int[] J = new int[2];
    public final int[] K = new int[2];
    public final int[] Q0 = new int[2];
    public final int[] R0 = new int[1];
    public final int[] S0 = new int[4];
    public final int[] T0 = new int[1];
    public final int[] V0 = new int[1];
    public boolean i1 = true;

    public wd4(boolean z, e4b e4bVar) {
        this.g1 = z;
        this.h1 = e4bVar;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.Z0 = asFloatBuffer;
        asFloatBuffer.put(new float[]{-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f});
        asFloatBuffer.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.b1 = asFloatBuffer2;
        asFloatBuffer2.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer2.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.a1 = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer3.position(0);
    }

    public static int h(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            if (w01.a) {
                fa4.d(GLES20.glGetShaderInfoLog(glCreateShader));
                fa4.d("shader code:\n " + str);
            }
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public final boolean a() {
        int[] iArr = this.V0;
        GLES20.glGenTextures(1, iArr, 0);
        int[] iArr2 = this.Q0;
        GLES20.glGenTextures(2, iArr2, 0);
        GLES20.glGenFramebuffers(1, this.R0, 0);
        GLES20.glBindTexture(3553, iArr2[1]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        int[] iArr3 = new int[1];
        int h = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
        int h2 = h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;uniform highp float width;uniform highp float height;uniform sampler2D curvesImage;uniform lowp float skipTone;uniform lowp float shadows;const mediump vec3 hsLuminanceWeighting = vec3(0.3, 0.3, 0.3);uniform lowp float highlights;uniform lowp float contrast;uniform lowp float fadeAmount;const mediump vec3 satLuminanceWeighting = vec3(0.2126, 0.7152, 0.0722);uniform lowp float saturation;uniform lowp float shadowsTintIntensity;uniform lowp float highlightsTintIntensity;uniform lowp vec3 shadowsTintColor;uniform lowp vec3 highlightsTintColor;uniform lowp float exposure;uniform lowp float warmth;uniform lowp float grain;const lowp float permTexUnit = 1.0 / 256.0;const lowp float permTexUnitHalf = 0.5 / 256.0;const lowp float grainsize = 2.3;uniform lowp float vignette;highp float getLuma(highp vec3 rgbP) {return (0.299 * rgbP.r) + (0.587 * rgbP.g) + (0.114 * rgbP.b);}lowp vec3 rgbToHsv(lowp vec3 c) {highp vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);highp vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);highp vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);highp float d = q.x - min(q.w, q.y);highp float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}lowp vec3 hsvToRgb(lowp vec3 c) {highp vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);highp vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);}highp vec3 rgbToHsl(highp vec3 color) {highp vec3 hsl;highp float fmin = min(min(color.r, color.g), color.b);highp float fmax = max(max(color.r, color.g), color.b);highp float delta = fmax - fmin;hsl.z = (fmax + fmin) / 2.0;if (delta == 0.0) {hsl.x = 0.0;hsl.y = 0.0;} else {if (hsl.z < 0.5) {hsl.y = delta / (fmax + fmin);} else {hsl.y = delta / (2.0 - fmax - fmin);}highp float deltaR = (((fmax - color.r) / 6.0) + (delta / 2.0)) / delta;highp float deltaG = (((fmax - color.g) / 6.0) + (delta / 2.0)) / delta;highp float deltaB = (((fmax - color.b) / 6.0) + (delta / 2.0)) / delta;if (color.r == fmax) {hsl.x = deltaB - deltaG;} else if (color.g == fmax) {hsl.x = (1.0 / 3.0) + deltaR - deltaB;} else if (color.b == fmax) {hsl.x = (2.0 / 3.0) + deltaG - deltaR;}if (hsl.x < 0.0) {hsl.x += 1.0;} else if (hsl.x > 1.0) {hsl.x -= 1.0;}}return hsl;}highp float hueToRgb(highp float f1, highp float f2, highp float hue) {if (hue < 0.0) {hue += 1.0;} else if (hue > 1.0) {hue -= 1.0;}highp float res;if ((6.0 * hue) < 1.0) {res = f1 + (f2 - f1) * 6.0 * hue;} else if ((2.0 * hue) < 1.0) {res = f2;} else if ((3.0 * hue) < 2.0) {res = f1 + (f2 - f1) * ((2.0 / 3.0) - hue) * 6.0;} else {res = f1;}return res;}highp vec3 hslToRgb(highp vec3 hsl) {if (hsl.y == 0.0) {return vec3(hsl.z);} else {highp float f2;if (hsl.z < 0.5) {f2 = hsl.z * (1.0 + hsl.y);} else {f2 = (hsl.z + hsl.y) - (hsl.y * hsl.z);}highp float f1 = 2.0 * hsl.z - f2;return vec3(hueToRgb(f1, f2, hsl.x + (1.0/3.0)), hueToRgb(f1, f2, hsl.x), hueToRgb(f1, f2, hsl.x - (1.0/3.0)));}}highp vec3 rgbToYuv(highp vec3 inP) {highp float luma = getLuma(inP);return vec3(luma, (1.0 / 1.772) * (inP.b - luma), (1.0 / 1.402) * (inP.r - luma));}lowp vec3 yuvToRgb(highp vec3 inP) {return vec3(1.402 * inP.b + inP.r, (inP.r - (0.299 * 1.402 / 0.587) * inP.b - (0.114 * 1.772 / 0.587) * inP.g), 1.772 * inP.g + inP.r);}lowp float easeInOutSigmoid(lowp float value, lowp float strength) {if (value > 0.5) {return 1.0 - pow(2.0 - 2.0 * value, 1.0 / (1.0 - strength)) * 0.5;} else {return pow(2.0 * value, 1.0 / (1.0 - strength)) * 0.5;}}lowp vec3 applyLuminanceCurve(lowp vec3 pixel) {highp float index = floor(clamp(pixel.z / (1.0 / 200.0), 0.0, 199.0));pixel.y = mix(0.0, pixel.y, smoothstep(0.0, 0.1, pixel.z) * (1.0 - smoothstep(0.8, 1.0, pixel.z)));pixel.z = texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).a;return pixel;}lowp vec3 applyRGBCurve(lowp vec3 pixel) {highp float index = floor(clamp(pixel.r / (1.0 / 200.0), 0.0, 199.0));pixel.r = texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).r;index = floor(clamp(pixel.g / (1.0 / 200.0), 0.0, 199.0));pixel.g = clamp(texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).g, 0.0, 1.0);index = floor(clamp(pixel.b / (1.0 / 200.0), 0.0, 199.0));pixel.b = clamp(texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).b, 0.0, 1.0);return pixel;}highp vec3 fadeAdjust(highp vec3 color, highp float fadeVal) {return (color * (1.0 - fadeVal)) + ((color + (vec3(-0.9772) * pow(vec3(color), vec3(3.0)) + vec3(1.708) * pow(vec3(color), vec3(2.0)) + vec3(-0.1603) * vec3(color) + vec3(0.2878) - color * vec3(0.9))) * fadeVal);}lowp vec3 tintRaiseShadowsCurve(lowp vec3 color) {return vec3(-0.003671) * pow(color, vec3(3.0)) + vec3(0.3842) * pow(color, vec3(2.0)) + vec3(0.3764) * color + vec3(0.2515);}lowp vec3 tintShadows(lowp vec3 texel, lowp vec3 tintColor, lowp float tintAmount) {return clamp(mix(texel, mix(texel, tintRaiseShadowsCurve(texel), tintColor), tintAmount), 0.0, 1.0);} lowp vec3 tintHighlights(lowp vec3 texel, lowp vec3 tintColor, lowp float tintAmount) {return clamp(mix(texel, mix(texel, vec3(1.0) - tintRaiseShadowsCurve(vec3(1.0) - texel), (vec3(1.0) - tintColor)), tintAmount), 0.0, 1.0);}highp vec4 rnm(in highp vec2 tc) {highp float noise = sin(dot(tc, vec2(12.9898, 78.233))) * 43758.5453;return vec4(fract(noise), fract(noise * 1.2154), fract(noise * 1.3453), fract(noise * 1.3647)) * 2.0 - 1.0;}highp float fade(in highp float t) {return t * t * t * (t * (t * 6.0 - 15.0) + 10.0);}highp float pnoise3D(in highp vec3 p) {highp vec3 pi = permTexUnit * floor(p) + permTexUnitHalf;highp vec3 pf = fract(p);highp float perm = rnm(pi.xy).a;highp float n000 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf);highp float n001 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(0.0, 0.0, 1.0));perm = rnm(pi.xy + vec2(0.0, permTexUnit)).a;highp float n010 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(0.0, 1.0, 0.0));highp float n011 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(0.0, 1.0, 1.0));perm = rnm(pi.xy + vec2(permTexUnit, 0.0)).a;highp float n100 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(1.0, 0.0, 0.0));highp float n101 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(1.0, 0.0, 1.0));perm = rnm(pi.xy + vec2(permTexUnit, permTexUnit)).a;highp float n110 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(1.0, 1.0, 0.0));highp float n111 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(1.0, 1.0, 1.0));highp vec4 n_x = mix(vec4(n000, n001, n010, n011), vec4(n100, n101, n110, n111), fade(pf.x));highp vec2 n_xy = mix(n_x.xy, n_x.zw, fade(pf.y));return mix(n_xy.x, n_xy.y, fade(pf.z));}lowp vec2 coordRot(in lowp vec2 tc, in lowp float angle) {return vec2(((tc.x * 2.0 - 1.0) * cos(angle) - (tc.y * 2.0 - 1.0) * sin(angle)) * 0.5 + 0.5, ((tc.y * 2.0 - 1.0) * cos(angle) + (tc.x * 2.0 - 1.0) * sin(angle)) * 0.5 + 0.5);}void main() {lowp vec4 source = texture2D(sTexture, vTextureCoord);lowp vec4 result = source;const lowp float toolEpsilon = 0.005;if (skipTone < toolEpsilon) {result = vec4(applyRGBCurve(hslToRgb(applyLuminanceCurve(rgbToHsl(result.rgb)))), result.a);}mediump float hsLuminance = dot(result.rgb, hsLuminanceWeighting);mediump float shadow = clamp((pow(hsLuminance, 1.0 / shadows) + (-0.76) * pow(hsLuminance, 2.0 / shadows)) - hsLuminance, 0.0, 1.0);mediump float highlight = clamp((1.0 - (pow(1.0 - hsLuminance, 1.0 / (2.0 - highlights)) + (-0.8) * pow(1.0 - hsLuminance, 2.0 / (2.0 - highlights)))) - hsLuminance, -1.0, 0.0);lowp vec3 hsresult = vec3(0.0, 0.0, 0.0) + ((hsLuminance + shadow + highlight) - 0.0) * ((result.rgb - vec3(0.0, 0.0, 0.0)) / (hsLuminance - 0.0));mediump float contrastedLuminance = ((hsLuminance - 0.5) * 1.5) + 0.5;mediump float whiteInterp = contrastedLuminance * contrastedLuminance * contrastedLuminance;mediump float whiteTarget = clamp(highlights, 1.0, 2.0) - 1.0;hsresult = mix(hsresult, vec3(1.0), whiteInterp * whiteTarget);mediump float invContrastedLuminance = 1.0 - contrastedLuminance;mediump float blackInterp = invContrastedLuminance * invContrastedLuminance * invContrastedLuminance;mediump float blackTarget = 1.0 - clamp(shadows, 0.0, 1.0);hsresult = mix(hsresult, vec3(0.0), blackInterp * blackTarget);result = vec4(hsresult.rgb, result.a);result = vec4(clamp(((result.rgb - vec3(0.5)) * contrast + vec3(0.5)), 0.0, 1.0), result.a);if (abs(fadeAmount) > toolEpsilon) {result.rgb = fadeAdjust(result.rgb, fadeAmount);}lowp float satLuminance = dot(result.rgb, satLuminanceWeighting);lowp vec3 greyScaleColor = vec3(satLuminance);result = vec4(clamp(mix(greyScaleColor, result.rgb, saturation), 0.0, 1.0), result.a);if (abs(shadowsTintIntensity) > toolEpsilon) {result.rgb = tintShadows(result.rgb, shadowsTintColor, shadowsTintIntensity * 2.0);}if (abs(highlightsTintIntensity) > toolEpsilon) {result.rgb = tintHighlights(result.rgb, highlightsTintColor, highlightsTintIntensity * 2.0);}if (abs(exposure) > toolEpsilon) {mediump float mag = exposure * 1.045;mediump float exppower = 1.0 + abs(mag);if (mag < 0.0) {exppower = 1.0 / exppower;}result.r = 1.0 - pow((1.0 - result.r), exppower);result.g = 1.0 - pow((1.0 - result.g), exppower);result.b = 1.0 - pow((1.0 - result.b), exppower);}if (abs(warmth) > toolEpsilon) {highp vec3 yuvVec;if (warmth > 0.0 ) {yuvVec = vec3(0.1765, -0.1255, 0.0902);} else {yuvVec = -vec3(0.0588, 0.1569, -0.1255);}highp vec3 yuvColor = rgbToYuv(result.rgb);highp float luma = yuvColor.r;highp float curveScale = sin(luma * 3.14159);yuvColor += 0.375 * warmth * curveScale * yuvVec;result.rgb = yuvToRgb(yuvColor);}if (abs(grain) > toolEpsilon) {highp vec3 rotOffset = vec3(1.425, 3.892, 5.835);highp vec2 rotCoordsR = coordRot(vTextureCoord, rotOffset.x);highp vec3 noise = vec3(pnoise3D(vec3(rotCoordsR * vec2(width / grainsize, height / grainsize),0.0)));lowp vec3 lumcoeff = vec3(0.299,0.587,0.114);lowp float luminance = dot(result.rgb, lumcoeff);lowp float lum = smoothstep(0.2, 0.0, luminance);lum += luminance;noise = mix(noise,vec3(0.0),pow(lum,4.0));result.rgb = result.rgb + noise * grain;}if (abs(vignette) > toolEpsilon) {const lowp float midpoint = 0.7;const lowp float fuzziness = 0.62;lowp float radDist = length(vTextureCoord - 0.5) / sqrt(0.5);lowp float mag = easeInOutSigmoid(radDist * midpoint, fuzziness) * vignette * 0.645;result.rgb = mix(pow(result.rgb, vec3(1.0 / (1.0 - mag))), vec3(0.0), mag * mag);}gl_FragColor = result;}");
        if (h != 0 && h2 != 0) {
            int glCreateProgram = GLES20.glCreateProgram();
            this.T = glCreateProgram;
            GLES20.glAttachShader(glCreateProgram, h);
            GLES20.glAttachShader(this.T, h2);
            GLES20.glBindAttribLocation(this.T, 0, "position");
            GLES20.glBindAttribLocation(this.T, 1, "inputTexCoord");
            GLES20.glLinkProgram(this.T);
            GLES20.glGetProgramiv(this.T, 35714, iArr3, 0);
            int i = iArr3[0];
            int i2 = this.T;
            if (i == 0) {
                GLES20.glDeleteProgram(i2);
                this.T = 0;
            } else {
                this.U = GLES20.glGetAttribLocation(i2, "position");
                this.V = GLES20.glGetAttribLocation(this.T, "inputTexCoord");
                this.W = GLES20.glGetUniformLocation(this.T, "sTexture");
                this.X = GLES20.glGetUniformLocation(this.T, "shadows");
                this.Y = GLES20.glGetUniformLocation(this.T, "highlights");
                this.Z = GLES20.glGetUniformLocation(this.T, "exposure");
                this.a0 = GLES20.glGetUniformLocation(this.T, "contrast");
                this.b0 = GLES20.glGetUniformLocation(this.T, "saturation");
                this.c0 = GLES20.glGetUniformLocation(this.T, "warmth");
                this.d0 = GLES20.glGetUniformLocation(this.T, "vignette");
                this.e0 = GLES20.glGetUniformLocation(this.T, "grain");
                this.f0 = GLES20.glGetUniformLocation(this.T, "width");
                this.g0 = GLES20.glGetUniformLocation(this.T, "height");
                this.h0 = GLES20.glGetUniformLocation(this.T, "curvesImage");
                this.i0 = GLES20.glGetUniformLocation(this.T, "skipTone");
                this.j0 = GLES20.glGetUniformLocation(this.T, "fadeAmount");
                this.k0 = GLES20.glGetUniformLocation(this.T, "shadowsTintIntensity");
                this.l0 = GLES20.glGetUniformLocation(this.T, "highlightsTintIntensity");
                this.m0 = GLES20.glGetUniformLocation(this.T, "shadowsTintColor");
                this.n0 = GLES20.glGetUniformLocation(this.T, "highlightsTintColor");
            }
            int h3 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;uniform highp float inputWidth;uniform highp float inputHeight;varying vec2 leftTexCoord;varying vec2 rightTexCoord;varying vec2 topTexCoord;varying vec2 bottomTexCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;highp vec2 widthStep = vec2(1.0 / inputWidth, 0.0);highp vec2 heightStep = vec2(0.0, 1.0 / inputHeight);leftTexCoord = inputTexCoord - widthStep;rightTexCoord = inputTexCoord + widthStep;topTexCoord = inputTexCoord + heightStep;bottomTexCoord = inputTexCoord - heightStep;}");
            int h4 = h(35632, "precision highp float;varying vec2 vTextureCoord;varying vec2 leftTexCoord;varying vec2 rightTexCoord;varying vec2 topTexCoord;varying vec2 bottomTexCoord;uniform sampler2D sTexture;uniform float sharpen;void main() {vec4 result = texture2D(sTexture, vTextureCoord);vec3 leftTextureColor = texture2D(sTexture, leftTexCoord).rgb;vec3 rightTextureColor = texture2D(sTexture, rightTexCoord).rgb;vec3 topTextureColor = texture2D(sTexture, topTexCoord).rgb;vec3 bottomTextureColor = texture2D(sTexture, bottomTexCoord).rgb;result.rgb = result.rgb * (1.0 + 4.0 * sharpen) - (leftTextureColor + rightTextureColor + topTextureColor + bottomTextureColor) * sharpen;gl_FragColor = result;}");
            if (h3 != 0 && h4 != 0) {
                int glCreateProgram2 = GLES20.glCreateProgram();
                this.H0 = glCreateProgram2;
                GLES20.glAttachShader(glCreateProgram2, h3);
                GLES20.glAttachShader(this.H0, h4);
                GLES20.glBindAttribLocation(this.H0, 0, "position");
                GLES20.glBindAttribLocation(this.H0, 1, "inputTexCoord");
                GLES20.glLinkProgram(this.H0);
                GLES20.glGetProgramiv(this.H0, 35714, iArr3, 0);
                int i3 = iArr3[0];
                int i4 = this.H0;
                if (i3 == 0) {
                    GLES20.glDeleteProgram(i4);
                    this.H0 = 0;
                } else {
                    this.L0 = GLES20.glGetAttribLocation(i4, "position");
                    this.M0 = GLES20.glGetAttribLocation(this.H0, "inputTexCoord");
                    this.N0 = GLES20.glGetUniformLocation(this.H0, "sTexture");
                    this.J0 = GLES20.glGetUniformLocation(this.H0, "inputWidth");
                    this.K0 = GLES20.glGetUniformLocation(this.H0, "inputHeight");
                    this.I0 = GLES20.glGetUniformLocation(this.H0, "sharpen");
                }
                ud4 ud4Var = new ud4(8.0f, 3.0f, false);
                this.g = ud4Var;
                if (ud4Var.a() && j()) {
                    int h5 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                    int h6 = h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float angle;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sTexture, vTextureCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, vTextureCoord);highp vec2 texCoordToUse = vec2(vTextureCoord.x, (vTextureCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = abs((texCoordToUse.x - excludePoint.x) * aspectRatio * cos(angle) + (texCoordToUse.y - excludePoint.y) * sin(angle));gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
                    if (h5 != 0 && h6 != 0) {
                        int glCreateProgram3 = GLES20.glCreateProgram();
                        this.o0 = glCreateProgram3;
                        GLES20.glAttachShader(glCreateProgram3, h5);
                        GLES20.glAttachShader(this.o0, h6);
                        GLES20.glBindAttribLocation(this.o0, 0, "position");
                        GLES20.glBindAttribLocation(this.o0, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.o0);
                        GLES20.glGetProgramiv(this.o0, 35714, iArr3, 0);
                        int i5 = iArr3[0];
                        int i6 = this.o0;
                        if (i5 == 0) {
                            GLES20.glDeleteProgram(i6);
                            this.o0 = 0;
                        } else {
                            this.p0 = GLES20.glGetAttribLocation(i6, "position");
                            this.q0 = GLES20.glGetAttribLocation(this.o0, "inputTexCoord");
                            this.r0 = GLES20.glGetUniformLocation(this.o0, "sTexture");
                            this.s0 = GLES20.glGetUniformLocation(this.o0, "inputImageTexture2");
                            this.t0 = GLES20.glGetUniformLocation(this.o0, "excludeSize");
                            this.u0 = GLES20.glGetUniformLocation(this.o0, "excludePoint");
                            this.v0 = GLES20.glGetUniformLocation(this.o0, "excludeBlurSize");
                            this.w0 = GLES20.glGetUniformLocation(this.o0, "angle");
                            this.x0 = GLES20.glGetUniformLocation(this.o0, "aspectRatio");
                        }
                        int h7 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                        int h8 = h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sTexture, vTextureCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, vTextureCoord);highp vec2 texCoordToUse = vec2(vTextureCoord.x, (vTextureCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = distance(excludePoint, texCoordToUse);gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
                        if (h7 != 0 && h8 != 0) {
                            int glCreateProgram4 = GLES20.glCreateProgram();
                            this.y0 = glCreateProgram4;
                            GLES20.glAttachShader(glCreateProgram4, h7);
                            GLES20.glAttachShader(this.y0, h8);
                            GLES20.glBindAttribLocation(this.y0, 0, "position");
                            GLES20.glBindAttribLocation(this.y0, 1, "inputTexCoord");
                            GLES20.glLinkProgram(this.y0);
                            GLES20.glGetProgramiv(this.y0, 35714, iArr3, 0);
                            int i7 = iArr3[0];
                            int i8 = this.y0;
                            if (i7 == 0) {
                                GLES20.glDeleteProgram(i8);
                                this.y0 = 0;
                            } else {
                                this.z0 = GLES20.glGetAttribLocation(i8, "position");
                                this.A0 = GLES20.glGetAttribLocation(this.y0, "inputTexCoord");
                                this.B0 = GLES20.glGetUniformLocation(this.y0, "sTexture");
                                this.C0 = GLES20.glGetUniformLocation(this.y0, "inputImageTexture2");
                                this.D0 = GLES20.glGetUniformLocation(this.y0, "excludeSize");
                                this.E0 = GLES20.glGetUniformLocation(this.y0, "excludePoint");
                                this.F0 = GLES20.glGetUniformLocation(this.y0, "excludeBlurSize");
                                this.G0 = GLES20.glGetUniformLocation(this.y0, "aspectRatio");
                            }
                            int h9 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                            int h10 = h(35632, "precision highp float;varying vec2 vTextureCoord;uniform sampler2D sTexture;uniform sampler2D inputImageTexture2;uniform float intensity;float enhance(float value) {const vec2 offset = vec2(0.001953125, 0.03125);value = value + offset.x;vec2 coord = (clamp(vTextureCoord, 0.125, 1.0 - 0.125001) - 0.125) * 4.0;vec2 frac = fract(coord);coord = floor(coord);float p00 = float(coord.y * 4.0 + coord.x) * 0.0625 + offset.y;float p01 = float(coord.y * 4.0 + coord.x + 1.0) * 0.0625 + offset.y;float p10 = float((coord.y + 1.0) * 4.0 + coord.x) * 0.0625 + offset.y;float p11 = float((coord.y + 1.0) * 4.0 + coord.x + 1.0) * 0.0625 + offset.y;vec3 c00 = texture2D(inputImageTexture2, vec2(value, p00)).rgb;vec3 c01 = texture2D(inputImageTexture2, vec2(value, p01)).rgb;vec3 c10 = texture2D(inputImageTexture2, vec2(value, p10)).rgb;vec3 c11 = texture2D(inputImageTexture2, vec2(value, p11)).rgb;float c1 = ((c00.r - c00.g) / (c00.b - c00.g));float c2 = ((c01.r - c01.g) / (c01.b - c01.g));float c3 = ((c10.r - c10.g) / (c10.b - c10.g));float c4 = ((c11.r - c11.g) / (c11.b - c11.g));float c1_2 = mix(c1, c2, frac.x);float c3_4 = mix(c3, c4, frac.x);return mix(c1_2, c3_4, frac.y);}vec3 hsv_to_rgb(vec3 c) {vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);}void main() {vec4 texel = texture2D(sTexture, vTextureCoord);vec4 hsv = texel;hsv.y = min(1.0, hsv.y * 1.2);hsv.z = min(1.0, enhance(hsv.z) * 1.1);gl_FragColor = vec4(hsv_to_rgb(mix(texel.xyz, hsv.xyz, intensity)), texel.w);}");
                            if (h9 != 0 && h10 != 0) {
                                int glCreateProgram5 = GLES20.glCreateProgram();
                                this.N = glCreateProgram5;
                                GLES20.glAttachShader(glCreateProgram5, h9);
                                GLES20.glAttachShader(this.N, h10);
                                GLES20.glBindAttribLocation(this.N, 0, "position");
                                GLES20.glBindAttribLocation(this.N, 1, "inputTexCoord");
                                GLES20.glLinkProgram(this.N);
                                GLES20.glGetProgramiv(this.N, 35714, iArr3, 0);
                                int i9 = iArr3[0];
                                int i10 = this.N;
                                if (i9 == 0) {
                                    GLES20.glDeleteProgram(i10);
                                    this.N = 0;
                                } else {
                                    this.O = GLES20.glGetAttribLocation(i10, "position");
                                    this.P = GLES20.glGetAttribLocation(this.N, "inputTexCoord");
                                    this.Q = GLES20.glGetUniformLocation(this.N, "sTexture");
                                    this.R = GLES20.glGetUniformLocation(this.N, "intensity");
                                    this.S = GLES20.glGetUniformLocation(this.N, "inputImageTexture2");
                                }
                                int h11 = h(35632, "precision lowp float;varying highp vec2 vTextureCoord;varying highp vec2 texCoord2;uniform sampler2D sTexture;uniform sampler2D inputImageTexture2;void main() {vec4 image = texture2D(sTexture, vTextureCoord);vec4 blurredImage = texture2D(inputImageTexture2, texCoord2);gl_FragColor = vec4((image.rgb - blurredImage.rgb + vec3(0.5,0.5,0.5)), image.a);}");
                                int h12 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;varying vec2 texCoord2;void main() {gl_Position = position;vTextureCoord = inputTexCoord;texCoord2 = inputTexCoord;}");
                                if (h12 != 0 && h11 != 0) {
                                    int glCreateProgram6 = GLES20.glCreateProgram();
                                    this.p = glCreateProgram6;
                                    GLES20.glAttachShader(glCreateProgram6, h12);
                                    GLES20.glAttachShader(this.p, h11);
                                    GLES20.glBindAttribLocation(this.p, 0, "position");
                                    GLES20.glBindAttribLocation(this.p, 1, "inputTexCoord");
                                    GLES20.glLinkProgram(this.p);
                                    GLES20.glGetProgramiv(this.p, 35714, iArr3, 0);
                                    int i11 = iArr3[0];
                                    int i12 = this.p;
                                    if (i11 == 0) {
                                        GLES20.glDeleteProgram(i12);
                                        this.p = 0;
                                    } else {
                                        this.q = GLES20.glGetAttribLocation(i12, "position");
                                        this.r = GLES20.glGetAttribLocation(this.p, "inputTexCoord");
                                        this.s = GLES20.glGetUniformLocation(this.p, "sTexture");
                                        this.t = GLES20.glGetUniformLocation(this.p, "inputImageTexture2");
                                    }
                                    int h13 = h(35632, "precision lowp float;varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {vec4 color = texture2D(sTexture, vTextureCoord);float hardLightColor = color.b;for (int i = 0; i < 3; ++i){if (hardLightColor < 0.5) {hardLightColor = hardLightColor * hardLightColor * 2.0;} else {hardLightColor = 1.0 - (1.0 - hardLightColor) * (1.0 - hardLightColor) * 2.0;}}float k = 255.0 / (164.0 - 75.0);hardLightColor = (hardLightColor - 75.0 / 255.0) * k;gl_FragColor = vec4(vec3(hardLightColor), color.a);}");
                                    int h14 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                    if (h14 != 0 && h13 != 0) {
                                        int glCreateProgram7 = GLES20.glCreateProgram();
                                        this.D = glCreateProgram7;
                                        GLES20.glAttachShader(glCreateProgram7, h14);
                                        GLES20.glAttachShader(this.D, h13);
                                        GLES20.glBindAttribLocation(this.D, 0, "position");
                                        GLES20.glBindAttribLocation(this.D, 1, "inputTexCoord");
                                        GLES20.glLinkProgram(this.D);
                                        GLES20.glGetProgramiv(this.D, 35714, iArr3, 0);
                                        int i13 = iArr3[0];
                                        int i14 = this.D;
                                        if (i13 == 0) {
                                            GLES20.glDeleteProgram(i14);
                                            this.D = 0;
                                        } else {
                                            this.E = GLES20.glGetAttribLocation(i14, "position");
                                            this.F = GLES20.glGetAttribLocation(this.D, "inputTexCoord");
                                            this.G = GLES20.glGetUniformLocation(this.D, "sTexture");
                                        }
                                        ?? obj = new Object();
                                        int[] iArr4 = new int[1];
                                        obj.a = iArr4;
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(new PointF(0.0f, 0.0f));
                                        arrayList.add(new PointF(0.5f, 0.5f));
                                        arrayList.add(new PointF(1.0f, 1.0f));
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(new PointF(0.0f, 0.0f));
                                        arrayList2.add(new PointF(0.47f, 0.57f));
                                        arrayList2.add(new PointF(1.0f, 1.0f));
                                        float[] a = lc1.a(arrayList2);
                                        float[] a2 = lc1.a(arrayList);
                                        GLES20.glGenTextures(1, iArr4, 0);
                                        GLES20.glBindTexture(3553, iArr4[0]);
                                        GLES20.glTexParameteri(3553, 10241, 9729);
                                        GLES20.glTexParameteri(3553, 10240, 9729);
                                        GLES20.glTexParameteri(3553, 10242, 33071);
                                        GLES20.glTexParameteri(3553, 10243, 33071);
                                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1024);
                                        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                                        if (a2.length >= 256 && a2.length >= 256 && a2.length >= 256 && a.length >= 256) {
                                            for (int i15 = 0; i15 < 256; i15++) {
                                                float f = i15;
                                                int min = (int) Math.min(Math.max(a2[i15] + f, 0.0f), 255.0f);
                                                int min2 = (int) Math.min(Math.max(a2[i15] + f, 0.0f), 255.0f);
                                                int min3 = (int) Math.min(Math.max(f + a2[i15], 0.0f), 255.0f);
                                                allocateDirect.put((byte) Math.min(Math.max(min3 + a[min3], 0.0f), 255.0f));
                                                allocateDirect.put((byte) Math.min(Math.max(min2 + a[min2], 0.0f), 255.0f));
                                                allocateDirect.put((byte) Math.min(Math.max(min + a[min], 0.0f), 255.0f));
                                                allocateDirect.put((byte) -1);
                                            }
                                            allocateDirect.position(0);
                                            GLES20.glTexImage2D(3553, 0, 6408, 256, 1, 0, 6408, 5121, allocateDirect);
                                        }
                                        this.o = obj;
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean b() {
        int i;
        vd4 vd4Var;
        vd4 vd4Var2 = this.f1;
        if (vd4Var2 != null) {
            i = vd4Var2.getBlurType();
        } else {
            i = 0;
        }
        if (this.g1 || (vd4Var = this.f1) == null || vd4Var.m() || i == 0) {
            return false;
        }
        boolean z = this.a;
        int[] iArr = this.S0;
        if (z) {
            if (!this.c) {
                GLES20.glBindTexture(3553, iArr[2]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLES20.glTexImage2D(3553, 0, 6408, this.X0, this.Y0, 0, 6408, 5121, null);
                this.c = true;
            }
            GLES20.glUseProgram(this.g.c);
            GLES20.glUniform1i(this.g.f, 0);
            GLES20.glEnableVertexAttribArray(this.g.e);
            GLES20.glVertexAttribPointer(this.g.e, 2, 5126, false, 8, (Buffer) this.a1);
            GLES20.glEnableVertexAttribArray(this.g.d);
            GLES20.glVertexAttribPointer(this.g.d, 2, 5126, false, 8, (Buffer) this.b1);
            GLES20.glBindFramebuffer(36160, this.U0[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr[1]);
            GLES20.glUniform1f(this.g.g, 0.0f);
            GLES20.glUniform1f(this.g.h, 1.0f / this.Y0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.U0[2]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[2], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glUniform1f(this.g.g, 1.0f / this.X0);
            GLES20.glUniform1f(this.g.h, 0.0f);
            GLES20.glDrawArrays(5, 0, 4);
            this.a = false;
        }
        GLES20.glBindFramebuffer(36160, this.U0[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
        if (i == 1) {
            GLES20.glUseProgram(this.y0);
            GLES20.glUniform1i(this.B0, 0);
            GLES20.glUniform1i(this.C0, 1);
            GLES20.glUniform1f(this.D0, this.f1.getBlurExcludeSize());
            GLES20.glUniform1f(this.F0, this.f1.getBlurExcludeBlurSize());
            PointF blurExcludePoint = this.f1.getBlurExcludePoint();
            GLES20.glUniform2f(this.E0, blurExcludePoint.x, blurExcludePoint.y);
            GLES20.glUniform1f(this.G0, this.Y0 / this.X0);
            GLES20.glEnableVertexAttribArray(this.A0);
            GLES20.glVertexAttribPointer(this.A0, 2, 5126, false, 8, (Buffer) this.a1);
            GLES20.glEnableVertexAttribArray(this.z0);
            GLES20.glVertexAttribPointer(this.z0, 2, 5126, false, 8, (Buffer) this.b1);
        } else if (i == 2) {
            GLES20.glUseProgram(this.o0);
            GLES20.glUniform1i(this.r0, 0);
            GLES20.glUniform1i(this.s0, 1);
            GLES20.glUniform1f(this.t0, this.f1.getBlurExcludeSize());
            GLES20.glUniform1f(this.v0, this.f1.getBlurExcludeBlurSize());
            GLES20.glUniform1f(this.w0, this.f1.getBlurAngle());
            PointF blurExcludePoint2 = this.f1.getBlurExcludePoint();
            GLES20.glUniform2f(this.u0, blurExcludePoint2.x, blurExcludePoint2.y);
            GLES20.glUniform1f(this.x0, this.Y0 / this.X0);
            GLES20.glEnableVertexAttribArray(this.q0);
            GLES20.glVertexAttribPointer(this.q0, 2, 5126, false, 8, (Buffer) this.a1);
            GLES20.glEnableVertexAttribArray(this.p0);
            GLES20.glVertexAttribPointer(this.p0, 2, 5126, false, 8, (Buffer) this.b1);
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[1]);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, iArr[2]);
        GLES20.glDrawArrays(5, 0, 4);
        return true;
    }

    public final void c() {
        int[] iArr = this.U0;
        boolean z = this.g1;
        int i = !z ? 1 : 0;
        GLES20.glBindFramebuffer(36160, iArr[i]);
        int[] iArr2 = this.S0;
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[i], 0);
        GLES20.glUseProgram(this.T);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr2[z ? 1 : 0]);
        GLES20.glUniform1i(this.W, 0);
        vd4 vd4Var = this.f1;
        float f = 1.0f;
        if (vd4Var != null && !vd4Var.m()) {
            GLES20.glUniform1f(this.X, this.f1.getShadowsValue());
            GLES20.glUniform1f(this.Y, this.f1.getHighlightsValue());
            GLES20.glUniform1f(this.Z, this.f1.getExposureValue());
            GLES20.glUniform1f(this.a0, this.f1.getContrastValue());
            GLES20.glUniform1f(this.b0, this.f1.getSaturationValue());
            GLES20.glUniform1f(this.c0, this.f1.getWarmthValue());
            GLES20.glUniform1f(this.d0, this.f1.getVignetteValue());
            GLES20.glUniform1f(this.e0, this.f1.getGrainValue());
            GLES20.glUniform1f(this.j0, this.f1.getFadeValue());
            int tintHighlightsColor = this.f1.getTintHighlightsColor();
            int tintShadowsColor = this.f1.getTintShadowsColor();
            GLES20.glUniform3f(this.n0, ((tintHighlightsColor >> 16) & 255) / 255.0f, ((tintHighlightsColor >> 8) & 255) / 255.0f, (tintHighlightsColor & 255) / 255.0f);
            GLES20.glUniform1f(this.l0, this.f1.getTintHighlightsIntensityValue());
            GLES20.glUniform3f(this.m0, ((tintShadowsColor >> 16) & 255) / 255.0f, ((tintShadowsColor >> 8) & 255) / 255.0f, (tintShadowsColor & 255) / 255.0f);
            GLES20.glUniform1f(this.k0, this.f1.getTintShadowsIntensityValue());
            boolean t = this.f1.t();
            int i2 = this.i0;
            if (t) {
                f = 0.0f;
            }
            GLES20.glUniform1f(i2, f);
            if (t) {
                ByteBuffer b = this.f1.b();
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, this.V0[0]);
                GLES20.glTexImage2D(3553, 0, 6408, 200, 1, 0, 6408, 5121, b);
                GLES20.glUniform1i(this.h0, 1);
            }
        } else {
            GLES20.glUniform1f(this.X, 1.0f);
            GLES20.glUniform1f(this.Y, 1.0f);
            GLES20.glUniform1f(this.Z, 0.0f);
            GLES20.glUniform1f(this.a0, 1.0f);
            GLES20.glUniform1f(this.b0, 1.0f);
            GLES20.glUniform1f(this.c0, 0.0f);
            GLES20.glUniform1f(this.d0, 0.0f);
            GLES20.glUniform1f(this.e0, 0.0f);
            GLES20.glUniform1f(this.j0, 0.0f);
            GLES20.glUniform3f(this.n0, 0.0f, 0.0f, 0.0f);
            GLES20.glUniform1f(this.l0, 0.0f);
            GLES20.glUniform3f(this.m0, 0.0f, 0.0f, 0.0f);
            GLES20.glUniform1f(this.k0, 0.0f);
            GLES20.glUniform1f(this.i0, 1.0f);
        }
        GLES20.glUniform1f(this.f0, this.X0);
        GLES20.glUniform1f(this.g0, this.Y0);
        GLES20.glEnableVertexAttribArray(this.V);
        GLES20.glVertexAttribPointer(this.V, 2, 5126, false, 8, (Buffer) this.a1);
        GLES20.glEnableVertexAttribArray(this.U);
        GLES20.glVertexAttribPointer(this.U, 2, 5126, false, 8, (Buffer) this.b1);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void d() {
        boolean z;
        int i;
        int i2;
        char c;
        FloatBuffer floatBuffer;
        boolean z2 = this.g1;
        if (z2) {
            z = true;
        } else {
            z = !this.W0;
        }
        int[] iArr = this.S0;
        int[] iArr2 = this.Q0;
        if (z) {
            int[] iArr3 = this.H;
            if (z2 && !this.h) {
                GLES20.glUseProgram(iArr3[1]);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, this.O0);
                GLES20.glUniformMatrix4fv(this.L, 1, false, this.P0, 0);
                int i3 = this.M;
                if (i3 != -1) {
                    GLES20.glUniform2f(i3, this.X0, this.Y0);
                }
                c = 1;
            } else {
                GLES20.glUseProgram(iArr3[0]);
                GLES20.glActiveTexture(33984);
                if (this.h) {
                    i2 = iArr[1];
                } else {
                    i2 = this.T0[0];
                }
                GLES20.glBindTexture(3553, i2);
                c = 0;
            }
            GLES20.glUniform1i(this.K[c], 0);
            int[] iArr4 = this.J;
            GLES20.glEnableVertexAttribArray(iArr4[c]);
            GLES20.glVertexAttribPointer(iArr4[c], 2, 5126, false, 8, (Buffer) this.a1);
            int[] iArr5 = this.I;
            GLES20.glEnableVertexAttribArray(iArr5[c]);
            int i4 = iArr5[c];
            if (z2) {
                floatBuffer = this.b1;
            } else {
                floatBuffer = this.Z0;
            }
            GLES20.glVertexAttribPointer(i4, 2, 5126, false, 8, (Buffer) floatBuffer);
            GLES20.glBindFramebuffer(36160, this.R0[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (!this.W0) {
            int i5 = (this.X0 * this.Y0) << 2;
            ByteBuffer byteBuffer = this.c1;
            if (byteBuffer == null || i5 > byteBuffer.capacity()) {
                this.c1 = ByteBuffer.allocateDirect(i5);
            }
            if (this.d1 == null) {
                this.d1 = ByteBuffer.allocateDirect(16384);
            }
            if (this.e1 == null) {
                this.e1 = ByteBuffer.allocateDirect(32896);
            }
            GLES20.glReadPixels(0, 0, this.X0, this.Y0, 6408, 5121, this.c1);
            i = 33984;
            Utilities.calcCDT(this.c1, this.X0, this.Y0, this.d1, this.e1);
            GLES20.glBindTexture(3553, iArr2[1]);
            GLES20.glTexImage2D(3553, 0, 6408, 256, 16, 0, 6408, 5121, this.d1);
            if (!z2) {
                this.c1 = null;
                this.d1 = null;
                this.e1 = null;
            }
            this.W0 = true;
        } else {
            i = 33984;
        }
        GLES20.glBindFramebuffer(36160, this.U0[1]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], 0);
        GLES20.glUseProgram(this.N);
        GLES20.glActiveTexture(i);
        GLES20.glBindTexture(3553, iArr2[0]);
        GLES20.glUniform1i(this.Q, 0);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, iArr2[1]);
        GLES20.glUniform1i(this.S, 1);
        vd4 vd4Var = this.f1;
        if (vd4Var != null && !vd4Var.m()) {
            GLES20.glUniform1f(this.R, this.f1.getEnhanceValue());
        } else {
            GLES20.glUniform1f(this.R, 0.0f);
        }
        GLES20.glEnableVertexAttribArray(this.P);
        GLES20.glVertexAttribPointer(this.P, 2, 5126, false, 8, (Buffer) this.a1);
        GLES20.glEnableVertexAttribArray(this.O);
        GLES20.glVertexAttribPointer(this.O, 2, 5126, false, 8, (Buffer) this.Z0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void e() {
        if (this.g1) {
            return;
        }
        GLES20.glBindFramebuffer(36160, this.U0[0]);
        int[] iArr = this.S0;
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
        GLES20.glUseProgram(this.H0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[1]);
        GLES20.glUniform1i(this.N0, 0);
        vd4 vd4Var = this.f1;
        if (vd4Var != null && !vd4Var.m()) {
            GLES20.glUniform1f(this.I0, this.f1.getSharpenValue());
        } else {
            GLES20.glUniform1f(this.I0, 0.0f);
        }
        GLES20.glUniform1f(this.J0, this.X0);
        GLES20.glUniform1f(this.K0, this.Y0);
        GLES20.glEnableVertexAttribArray(this.M0);
        GLES20.glVertexAttribPointer(this.M0, 2, 5126, false, 8, (Buffer) this.a1);
        GLES20.glEnableVertexAttribArray(this.L0);
        GLES20.glVertexAttribPointer(this.L0, 2, 5126, false, 8, (Buffer) this.b1);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void f() {
        int i;
        int i2;
        vd4 vd4Var = this.f1;
        if (vd4Var != null && !vd4Var.m() && this.f1.getSoftenSkinValue() > 0.0f && (i = this.X0) > 0 && this.Y0 > 0) {
            boolean z = this.b;
            int[] iArr = this.T0;
            boolean z2 = this.g1;
            int[] iArr2 = this.S0;
            if (z || z2) {
                float f = i * 0.006f;
                if (this.e == null || Math.abs(this.f - f) > 1.0E-4d) {
                    ud4 ud4Var = this.e;
                    if (ud4Var != null && (i2 = ud4Var.c) != 0) {
                        GLES20.glDeleteProgram(i2);
                        ud4Var.c = 0;
                    }
                    this.f = f;
                    ud4 ud4Var2 = new ud4(f, 2.0f, true);
                    this.e = ud4Var2;
                    ud4Var2.a();
                }
                if (!this.d) {
                    GLES20.glBindTexture(3553, iArr2[3]);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glTexParameteri(3553, 10242, 33071);
                    GLES20.glTexParameteri(3553, 10243, 33071);
                    GLES20.glTexImage2D(3553, 0, 6408, this.X0, this.Y0, 0, 6408, 5121, null);
                    this.d = true;
                }
                GLES20.glUseProgram(this.i);
                GLES20.glUniform1i(this.l, 0);
                GLES20.glEnableVertexAttribArray(this.k);
                GLES20.glVertexAttribPointer(this.k, 2, 5126, false, 8, (Buffer) this.a1);
                GLES20.glEnableVertexAttribArray(this.j);
                if (z2) {
                    GLES20.glUniformMatrix4fv(this.m, 1, false, this.P0, 0);
                    int i3 = this.n;
                    if (i3 != -1) {
                        GLES20.glUniform2f(i3, this.X0, this.Y0);
                    }
                }
                GLES20.glVertexAttribPointer(this.j, 2, 5126, false, 8, (Buffer) this.b1);
                GLES20.glBindFramebuffer(36160, this.U0[0]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
                GLES20.glActiveTexture(33984);
                if (z2) {
                    GLES20.glBindTexture(36197, this.O0);
                } else {
                    GLES20.glBindTexture(3553, iArr[0]);
                }
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glUseProgram(this.e.c);
                GLES20.glUniform1i(this.e.f, 0);
                GLES20.glEnableVertexAttribArray(this.e.e);
                GLES20.glVertexAttribPointer(this.e.e, 2, 5126, false, 8, (Buffer) this.a1);
                GLES20.glEnableVertexAttribArray(this.e.d);
                GLES20.glVertexAttribPointer(this.e.d, 2, 5126, false, 8, (Buffer) this.b1);
                GLES20.glBindFramebuffer(36160, this.U0[1]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[1], 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, iArr2[0]);
                GLES20.glUniform1f(this.e.g, 0.0f);
                GLES20.glUniform1f(this.e.h, 1.0f / this.Y0);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glBindFramebuffer(36160, this.U0[3]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[3], 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, iArr2[1]);
                GLES20.glUniform1f(this.e.g, 1.0f / this.X0);
                GLES20.glUniform1f(this.e.h, 0.0f);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glUseProgram(this.p);
                GLES20.glUniform1i(this.s, 0);
                GLES20.glUniform1i(this.t, 1);
                GLES20.glEnableVertexAttribArray(this.r);
                GLES20.glVertexAttribPointer(this.r, 2, 5126, false, 8, (Buffer) this.a1);
                GLES20.glEnableVertexAttribArray(this.q);
                GLES20.glVertexAttribPointer(this.q, 2, 5126, false, 8, (Buffer) this.b1);
                GLES20.glBindFramebuffer(36160, this.U0[1]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[1], 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, iArr2[0]);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, iArr2[3]);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glUseProgram(this.D);
                GLES20.glUniform1i(this.G, 0);
                GLES20.glEnableVertexAttribArray(this.F);
                GLES20.glVertexAttribPointer(this.F, 2, 5126, false, 8, (Buffer) this.a1);
                GLES20.glEnableVertexAttribArray(this.E);
                GLES20.glVertexAttribPointer(this.E, 2, 5126, false, 8, (Buffer) this.b1);
                GLES20.glBindFramebuffer(36160, this.U0[3]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[3], 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, iArr2[1]);
                GLES20.glDrawArrays(5, 0, 4);
                this.b = false;
            }
            this.h = true;
            this.W0 = false;
            GLES20.glUseProgram(this.u);
            GLES20.glUniform1i(this.x, 0);
            GLES20.glUniform1i(this.y, 1);
            GLES20.glUniform1i(this.z, 2);
            GLES20.glUniform1f(this.A, this.f1.getSoftenSkinValue());
            GLES20.glEnableVertexAttribArray(this.w);
            GLES20.glVertexAttribPointer(this.w, 2, 5126, false, 8, (Buffer) this.a1);
            GLES20.glEnableVertexAttribArray(this.v);
            GLES20.glVertexAttribPointer(this.v, 2, 5126, false, 8, (Buffer) this.b1);
            if (z2) {
                GLES20.glUniformMatrix4fv(this.B, 1, false, this.P0, 0);
                int i4 = this.C;
                if (i4 != -1) {
                    GLES20.glUniform2f(i4, this.X0, this.Y0);
                }
            }
            GLES20.glBindFramebuffer(36160, this.U0[1]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[1], 0);
            GLES20.glActiveTexture(33984);
            if (z2) {
                GLES20.glBindTexture(36197, this.O0);
            } else {
                GLES20.glBindTexture(3553, iArr[0]);
            }
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, iArr2[3]);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.o.a[0]);
            GLES20.glDrawArrays(5, 0, 4);
        } else if (this.h) {
            this.W0 = false;
            this.h = false;
        }
    }

    public final int g(int i) {
        char c;
        boolean z = this.g1;
        int[] iArr = this.S0;
        if (z) {
            if (i == 0) {
                c = 1;
            } else {
                c = 0;
            }
            return iArr[c];
        }
        return iArr[i];
    }

    public final void i(Bitmap bitmap, int i, int i2, int i3, int i4) {
        Bitmap bitmap2;
        float f;
        this.X0 = i3;
        this.Y0 = i4;
        int[] iArr = this.U0;
        int[] iArr2 = this.S0;
        if (iArr == null) {
            int[] iArr3 = new int[4];
            this.U0 = iArr3;
            GLES20.glGenFramebuffers(4, iArr3, 0);
            GLES20.glGenTextures(4, iArr2, 0);
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            int[] iArr4 = this.T0;
            GLES20.glGenTextures(1, iArr4, 0);
            float Y0 = gl.Y0(true);
            boolean z = this.i1;
            if ((z && (this.X0 > Y0 || this.Y0 > Y0)) || i % 360 != 0) {
                if (z && (this.X0 > Y0 || this.Y0 > Y0)) {
                    f = Y0 / bitmap.getWidth();
                    float height = Y0 / bitmap.getHeight();
                    int i5 = (int) Y0;
                    if (f < height) {
                        this.X0 = i5;
                        this.Y0 = (int) (bitmap.getHeight() * f);
                    } else {
                        this.Y0 = i5;
                        this.X0 = (int) (bitmap.getWidth() * height);
                        f = height;
                    }
                } else {
                    f = 1.0f;
                }
                int i6 = i % 360;
                if (i6 == 90 || i6 == 270) {
                    int i7 = this.X0;
                    this.X0 = this.Y0;
                    this.Y0 = i7;
                }
                Matrix matrix = new Matrix();
                matrix.setScale(f, f);
                matrix.postRotate(i);
                bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } else {
                bitmap2 = bitmap;
            }
            GLES20.glBindTexture(3553, iArr4[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLUtils.texImage2D(3553, 0, bitmap2, 0);
        }
        for (int i8 = 0; i8 < 2; i8++) {
            GLES20.glBindTexture(3553, iArr2[i8]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexImage2D(3553, 0, 6408, this.X0, this.Y0, 0, 6408, 5121, null);
        }
        this.O0 = i2;
        GLES20.glBindTexture(3553, this.Q0[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, this.X0, this.Y0, 0, 6408, 5121, null);
    }

    public final boolean j() {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        int h;
        int h2;
        int i3;
        int i4;
        int h3;
        int h4;
        String str4;
        int h5;
        int h6;
        e4b e4bVar = this.h1;
        if (e4bVar != null) {
            i = e4bVar.a();
        } else {
            i = 0;
        }
        int i5 = 2;
        int i6 = 1;
        String str5 = "";
        if (i == 1) {
            str = gl.v2(null, 2131624046);
        } else if (i != 2) {
            str = "";
        } else {
            str = gl.v2(null, 2131624047);
        }
        String str6 = "sampler2D";
        boolean z = this.g1;
        if (!z) {
            str2 = "";
            str3 = "sampler2D";
        } else {
            str2 = "#extension GL_OES_EGL_image_external : require";
            str3 = "samplerExternalOES";
        }
        int[] iArr = new int[1];
        int i7 = 0;
        while (true) {
            if (z) {
                i2 = i5;
            } else {
                i2 = i6;
            }
            int i8 = i;
            String str7 = str;
            String str8 = str5;
            if (i7 < i2) {
                if (i7 == 1 && z) {
                    if (i8 != 0) {
                        h5 = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                        str4 = str6;
                        h6 = h(35632, String.format(Locale.US, "%1$s\nprecision highp float;varying vec2 vTextureCoord;vec3 rgb_to_hsv(vec3 c) {vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);float d = q.x - min(q.w, q.y);float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}void main() {vec4 texel = TEX(vTextureCoord);gl_FragColor = vec4(rgb_to_hsv(texel.rgb), texel.a);}", str7));
                    } else {
                        str4 = str6;
                        h6 = 0;
                        h5 = 0;
                    }
                    if (h5 == 0 || h6 == 0) {
                        h5 = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                        h6 = h(35632, String.format(Locale.US, "%1$s\nprecision highp float;varying vec2 vTextureCoord;uniform %2$s sTexture;vec3 rgb_to_hsv(vec3 c) {vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);float d = q.x - min(q.w, q.y);float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}void main() {vec4 texel = texture2D(sTexture, vTextureCoord);gl_FragColor = vec4(rgb_to_hsv(texel.rgb), texel.a);}", str2, str3));
                    }
                } else {
                    str4 = str6;
                    h5 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                    h6 = h(35632, String.format(Locale.US, "%1$s\nprecision highp float;varying vec2 vTextureCoord;uniform %2$s sTexture;vec3 rgb_to_hsv(vec3 c) {vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);float d = q.x - min(q.w, q.y);float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}void main() {vec4 texel = texture2D(sTexture, vTextureCoord);gl_FragColor = vec4(rgb_to_hsv(texel.rgb), texel.a);}", str8, str4));
                }
                int i9 = h5;
                int[] iArr2 = this.H;
                GLES20.glDeleteProgram(iArr2[i7]);
                if (i9 != 0 && h6 != 0) {
                    int glCreateProgram = GLES20.glCreateProgram();
                    iArr2[i7] = glCreateProgram;
                    GLES20.glAttachShader(glCreateProgram, i9);
                    GLES20.glAttachShader(iArr2[i7], h6);
                    GLES20.glBindAttribLocation(iArr2[i7], 0, "position");
                    GLES20.glBindAttribLocation(iArr2[i7], 1, "inputTexCoord");
                    GLES20.glLinkProgram(iArr2[i7]);
                    GLES20.glGetProgramiv(iArr2[i7], 35714, iArr, 0);
                    if (iArr[0] == 0) {
                        GLES20.glDeleteProgram(iArr2[i7]);
                        iArr2[i7] = 0;
                    } else {
                        this.I[i7] = GLES20.glGetAttribLocation(iArr2[i7], "position");
                        this.J[i7] = GLES20.glGetAttribLocation(iArr2[i7], "inputTexCoord");
                        this.K[i7] = GLES20.glGetUniformLocation(iArr2[i7], "sTexture");
                        if (i7 == 1) {
                            this.L = GLES20.glGetUniformLocation(iArr2[i7], "videoMatrix");
                            this.M = GLES20.glGetUniformLocation(iArr2[i7], "texSize");
                        }
                    }
                    i7++;
                    i = i8;
                    str = str7;
                    str5 = str8;
                    str6 = str4;
                    i5 = 2;
                    i6 = 1;
                } else {
                    return false;
                }
            } else {
                if (z) {
                    if (i8 != 0) {
                        i3 = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                        i4 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;void main() {vec4 inp = TEX(vTextureCoord);vec4 image = vec4(inp.rgb * pow(2.0, -1.0), inp.w);vec4 base = vec4(image.g, image.g, image.g, 1.0);vec4 overlay = vec4(image.b, image.b, image.b, 1.0);float ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);gl_FragColor = vec4(ba,ba,ba,image.a);}", str7));
                    } else {
                        i3 = 0;
                        i4 = 0;
                    }
                    if (i3 == 0 || i4 == 0) {
                        h = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                        h2 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;uniform %2$s sTexture;void main() {vec4 inp = texture2D(sTexture, vTextureCoord);vec4 image = vec4(inp.rgb * pow(2.0, -1.0), inp.w);vec4 base = vec4(image.g, image.g, image.g, 1.0);vec4 overlay = vec4(image.b, image.b, image.b, 1.0);float ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);gl_FragColor = vec4(ba,ba,ba,image.a);}", str2, str3));
                    }
                    GLES20.glDeleteProgram(this.i);
                    if (i3 == 0 && i4 != 0) {
                        int glCreateProgram2 = GLES20.glCreateProgram();
                        this.i = glCreateProgram2;
                        GLES20.glAttachShader(glCreateProgram2, i3);
                        GLES20.glAttachShader(this.i, i4);
                        GLES20.glBindAttribLocation(this.i, 0, "position");
                        GLES20.glBindAttribLocation(this.i, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.i);
                        GLES20.glGetProgramiv(this.i, 35714, iArr, 0);
                        int i10 = iArr[0];
                        int i11 = this.i;
                        if (i10 == 0) {
                            GLES20.glDeleteProgram(i11);
                            this.i = 0;
                        } else {
                            this.j = GLES20.glGetAttribLocation(i11, "position");
                            this.k = GLES20.glGetAttribLocation(this.i, "inputTexCoord");
                            this.l = GLES20.glGetUniformLocation(this.i, "sTexture");
                            if (z) {
                                this.m = GLES20.glGetUniformLocation(this.i, "videoMatrix");
                                this.n = GLES20.glGetUniformLocation(this.i, "texSize");
                            }
                        }
                        if (z) {
                            if (i8 != 0) {
                                h3 = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;varying vec2 texCoord2;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;texCoord2 = inputTexCoord.xy;}");
                                h4 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;varying highp vec2 texCoord2;uniform sampler2D toneCurveTexture;uniform sampler2D inputImageTexture3;uniform lowp float mixturePercent;void main() {vec4 image = TEX(vTextureCoord);vec4 mask = texture2D(inputImageTexture3, texCoord2);float redCurveValue = texture2D(toneCurveTexture, vec2(image.r, 0.0)).r;float greenCurveValue = texture2D(toneCurveTexture, vec2(image.g, 0.0)).g;float blueCurveValue = texture2D(toneCurveTexture, vec2(image.b, 0.0)).b;vec4 result = vec4(redCurveValue, greenCurveValue, blueCurveValue, image.a);vec4 tone = mix(image, result, mixturePercent);gl_FragColor = vec4(mix(image.rgb, tone.rgb, 1.0 - mask.b), 1.0);}", str7));
                            } else {
                                h3 = 0;
                                h4 = 0;
                            }
                            if (h3 == 0 || h4 == 0) {
                                h3 = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;varying vec2 texCoord2;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;texCoord2 = inputTexCoord.xy;}");
                                h4 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;varying highp vec2 texCoord2;uniform %2$s sTexture;uniform sampler2D toneCurveTexture;uniform sampler2D inputImageTexture3;uniform lowp float mixturePercent;void main() {vec4 image = texture2D(sTexture, vTextureCoord);vec4 mask = texture2D(inputImageTexture3, texCoord2);float redCurveValue = texture2D(toneCurveTexture, vec2(image.r, 0.0)).r;float greenCurveValue = texture2D(toneCurveTexture, vec2(image.g, 0.0)).g;float blueCurveValue = texture2D(toneCurveTexture, vec2(image.b, 0.0)).b;vec4 result = vec4(redCurveValue, greenCurveValue, blueCurveValue, image.a);vec4 tone = mix(image, result, mixturePercent);gl_FragColor = vec4(mix(image.rgb, tone.rgb, 1.0 - mask.b), 1.0);}", str2, str3));
                            }
                        } else {
                            h3 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;varying vec2 texCoord2;void main() {gl_Position = position;vTextureCoord = inputTexCoord;texCoord2 = inputTexCoord;}");
                            h4 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;varying highp vec2 texCoord2;uniform %2$s sTexture;uniform sampler2D toneCurveTexture;uniform sampler2D inputImageTexture3;uniform lowp float mixturePercent;void main() {vec4 image = texture2D(sTexture, vTextureCoord);vec4 mask = texture2D(inputImageTexture3, texCoord2);float redCurveValue = texture2D(toneCurveTexture, vec2(image.r, 0.0)).r;float greenCurveValue = texture2D(toneCurveTexture, vec2(image.g, 0.0)).g;float blueCurveValue = texture2D(toneCurveTexture, vec2(image.b, 0.0)).b;vec4 result = vec4(redCurveValue, greenCurveValue, blueCurveValue, image.a);vec4 tone = mix(image, result, mixturePercent);gl_FragColor = vec4(mix(image.rgb, tone.rgb, 1.0 - mask.b), 1.0);}", str2, str3));
                        }
                        GLES20.glDeleteProgram(this.u);
                        if (h3 != 0 && h4 != 0) {
                            int glCreateProgram3 = GLES20.glCreateProgram();
                            this.u = glCreateProgram3;
                            GLES20.glAttachShader(glCreateProgram3, h3);
                            GLES20.glAttachShader(this.u, h4);
                            GLES20.glBindAttribLocation(this.u, 0, "position");
                            GLES20.glBindAttribLocation(this.u, 1, "inputTexCoord");
                            GLES20.glLinkProgram(this.u);
                            GLES20.glGetProgramiv(this.u, 35714, iArr, 0);
                            int i12 = iArr[0];
                            int i13 = this.u;
                            if (i12 == 0) {
                                GLES20.glDeleteProgram(i13);
                                this.u = 0;
                                return true;
                            }
                            this.v = GLES20.glGetAttribLocation(i13, "position");
                            this.w = GLES20.glGetAttribLocation(this.u, "inputTexCoord");
                            this.x = GLES20.glGetUniformLocation(this.u, "sTexture");
                            this.y = GLES20.glGetUniformLocation(this.u, "inputImageTexture3");
                            this.z = GLES20.glGetUniformLocation(this.u, "toneCurveTexture");
                            this.A = GLES20.glGetUniformLocation(this.u, "mixturePercent");
                            if (z) {
                                this.B = GLES20.glGetUniformLocation(this.u, "videoMatrix");
                                this.C = GLES20.glGetUniformLocation(this.u, "texSize");
                                return true;
                            }
                            return true;
                        }
                        return false;
                    }
                }
                h = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                h2 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;uniform %2$s sTexture;void main() {vec4 inp = texture2D(sTexture, vTextureCoord);vec4 image = vec4(inp.rgb * pow(2.0, -1.0), inp.w);vec4 base = vec4(image.g, image.g, image.g, 1.0);vec4 overlay = vec4(image.b, image.b, image.b, 1.0);float ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);gl_FragColor = vec4(ba,ba,ba,image.a);}", str2, str3));
                i3 = h;
                i4 = h2;
                GLES20.glDeleteProgram(this.i);
                return i3 == 0 ? false : false;
            }
        }
    }
}
