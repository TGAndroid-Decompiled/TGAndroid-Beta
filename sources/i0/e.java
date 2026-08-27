package i0;

import android.graphics.Path;
import android.util.Log;
import g7.w7;

public final class e {

    public char f10493a;

    public final float[] f10494b;

    public e(char c10, float[] fArr) {
        this.f10493a = c10;
        this.f10494b = fArr;
    }

    public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
        double d;
        double d10;
        double radians = Math.toRadians(f16);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d11 = f10;
        double d12 = f11;
        double d13 = f14;
        double d14 = ((d12 * dSin) + (d11 * dCos)) / d13;
        double d15 = f15;
        double d16 = ((d12 * dCos) + (((double) (-f10)) * dSin)) / d15;
        double d17 = f13;
        double d18 = ((d17 * dSin) + (((double) f12) * dCos)) / d13;
        double d19 = ((d17 * dCos) + (((double) (-f12)) * dSin)) / d15;
        double d20 = d14 - d18;
        double d21 = d16 - d19;
        double d22 = (d14 + d18) / 2.0d;
        double d23 = (d16 + d19) / 2.0d;
        double d24 = (d21 * d21) + (d20 * d20);
        if (d24 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d25 = (1.0d / d24) - 0.25d;
        if (d25 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d24);
            float fSqrt = (float) (Math.sqrt(d24) / 1.99999d);
            a(path, f10, f11, f12, f13, f14 * fSqrt, fSqrt * f15, f16, z10, z11);
            return;
        }
        double dSqrt = Math.sqrt(d25);
        double d26 = dSqrt * d20;
        double d27 = dSqrt * d21;
        if (z10 == z11) {
            d = d22 - d27;
            d10 = d23 + d26;
        } else {
            d = d22 + d27;
            d10 = d23 - d26;
        }
        double dAtan2 = Math.atan2(d16 - d10, d14 - d);
        double dAtan3 = Math.atan2(d19 - d10, d18 - d) - dAtan2;
        if (z11 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d28 = d * d13;
        double d29 = d10 * d15;
        double d30 = (d28 * dCos) - (d29 * dSin);
        double d31 = (d29 * dCos) + (d28 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d32 = d12;
        double d33 = -d13;
        double d34 = d33 * dCos2;
        double d35 = d15 * dSin2;
        double d36 = (d34 * dSin3) - (d35 * dCos3);
        double d37 = d33 * dSin2;
        double d38 = d15 * dCos2;
        double d39 = (dCos3 * d38) + (dSin3 * d37);
        double d40 = dAtan3 / ((double) iCeil);
        double d41 = dAtan2;
        int i10 = 0;
        while (i10 < iCeil) {
            double d42 = d41 + d40;
            double dSin4 = Math.sin(d42);
            double dCos4 = Math.cos(d42);
            int i11 = iCeil;
            double d43 = (((d13 * dCos2) * dCos4) + d30) - (d35 * dSin4);
            double d44 = d37;
            double d45 = (d38 * dSin4) + (d13 * dSin2 * dCos4) + d31;
            double d46 = (d34 * dSin4) - (d35 * dCos4);
            double d47 = (dCos4 * d38) + (dSin4 * d44);
            double d48 = d42 - d41;
            double dTan = Math.tan(d48 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d48)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d36 * dSqrt2) + d11), (float) ((d39 * dSqrt2) + d32), (float) (d43 - (dSqrt2 * d46)), (float) (d45 - (dSqrt2 * d47)), (float) d43, (float) d45);
            i10++;
            d11 = d43;
            d32 = d45;
            d30 = d30;
            d41 = d42;
            dCos2 = dCos2;
            d39 = d47;
            d36 = d46;
            iCeil = i11;
            d40 = d40;
            d37 = d44;
        }
    }

    public static void b(e[] eVarArr, Path path) {
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        e[] eVarArr2 = eVarArr;
        float[] fArr = new float[6];
        int length = eVarArr2.length;
        char c10 = 0;
        char c11 = 'm';
        int i11 = 0;
        while (i11 < length) {
            e eVar = eVarArr2[i11];
            char c12 = eVar.f10493a;
            float[] fArr2 = eVar.f10494b;
            float f20 = fArr[c10];
            float f21 = fArr[1];
            float f22 = fArr[2];
            float f23 = fArr[3];
            float f24 = fArr[4];
            float f25 = fArr[5];
            switch (c12) {
                case 'A':
                case 'a':
                    i10 = 7;
                    break;
                case 'C':
                case 'c':
                    i10 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i10 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i10 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f24, f25);
                    f20 = f24;
                    f22 = f20;
                    f21 = f25;
                    f23 = f21;
                default:
                    i10 = 2;
                    break;
            }
            float f26 = f24;
            float f27 = f25;
            float f28 = f20;
            float f29 = f21;
            int i12 = 0;
            while (i12 < fArr2.length) {
                if (c12 == 'A') {
                    fArr2 = fArr2;
                    i12 = i12;
                    eVar = eVar;
                    float f30 = f29;
                    i11 = i11;
                    int i13 = i12 + 5;
                    int i14 = i12 + 6;
                    a(path, f28, f30, fArr2[i13], fArr2[i14], fArr2[i12], fArr2[i12 + 1], fArr2[i12 + 2], fArr2[i12 + 3] != 0.0f, fArr2[i12 + 4] != 0.0f);
                    f22 = fArr2[i13];
                    f10 = fArr2[i14];
                    f23 = f10;
                    f11 = f22;
                } else if (c12 == 'C') {
                    fArr2 = fArr2;
                    i12 = i12;
                    i11 = i11;
                    eVar = eVar;
                    int i15 = i12 + 2;
                    int i16 = i12 + 3;
                    int i17 = i12 + 4;
                    int i18 = i12 + 5;
                    path.cubicTo(fArr2[i12], fArr2[i12 + 1], fArr2[i15], fArr2[i16], fArr2[i17], fArr2[i18]);
                    float f31 = fArr2[i17];
                    float f32 = fArr2[i18];
                    f22 = fArr2[i15];
                    f23 = fArr2[i16];
                    f10 = f32;
                    f11 = f31;
                } else if (c12 == 'H') {
                    fArr2 = fArr2;
                    i12 = i12;
                    eVar = eVar;
                    f10 = f29;
                    i11 = i11;
                    path.lineTo(fArr2[i12], f10);
                    f11 = fArr2[i12];
                } else if (c12 == 'Q') {
                    fArr2 = fArr2;
                    i12 = i12;
                    i11 = i11;
                    eVar = eVar;
                    int i19 = i12 + 1;
                    int i20 = i12 + 2;
                    int i21 = i12 + 3;
                    path.quadTo(fArr2[i12], fArr2[i19], fArr2[i20], fArr2[i21]);
                    float f33 = fArr2[i12];
                    float f34 = fArr2[i19];
                    float f35 = fArr2[i20];
                    float f36 = fArr2[i21];
                    f22 = f33;
                    f23 = f34;
                    f11 = f35;
                    f10 = f36;
                } else if (c12 == 'V') {
                    fArr2 = fArr2;
                    i12 = i12;
                    i11 = i11;
                    eVar = eVar;
                    f11 = f28;
                    path.lineTo(f11, fArr2[i12]);
                    f10 = fArr2[i12];
                } else if (c12 != 'a') {
                    if (c12 == 'c') {
                        fArr2 = fArr2;
                        i12 = i12;
                        int i22 = i12 + 2;
                        int i23 = i12 + 3;
                        int i24 = i12 + 4;
                        int i25 = i12 + 5;
                        path.rCubicTo(fArr2[i12], fArr2[i12 + 1], fArr2[i22], fArr2[i23], fArr2[i24], fArr2[i25]);
                        float f37 = fArr2[i22] + f28;
                        float f38 = fArr2[i23] + f29;
                        f28 += fArr2[i24];
                        f29 += fArr2[i25];
                        f22 = f37;
                        f23 = f38;
                    } else if (c12 != 'h') {
                        if (c12 != 'q') {
                            if (c12 != 'v') {
                                if (c12 == 'L') {
                                    fArr2 = fArr2;
                                    i12 = i12;
                                    int i26 = i12 + 1;
                                    path.lineTo(fArr2[i12], fArr2[i26]);
                                    f11 = fArr2[i12];
                                    f10 = fArr2[i26];
                                } else if (c12 == 'M') {
                                    fArr2 = fArr2;
                                    i12 = i12;
                                    f11 = fArr2[i12];
                                    f10 = fArr2[i12 + 1];
                                    if (i12 > 0) {
                                        path.lineTo(f11, f10);
                                    } else {
                                        path.moveTo(f11, f10);
                                        f26 = f11;
                                        f27 = f10;
                                    }
                                } else if (c12 == 'S') {
                                    fArr2 = fArr2;
                                    i12 = i12;
                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                        f28 = (f28 * 2.0f) - f22;
                                        f29 = (f29 * 2.0f) - f23;
                                    }
                                    float f39 = f28;
                                    float f40 = f29;
                                    int i27 = i12 + 1;
                                    int i28 = i12 + 2;
                                    int i29 = i12 + 3;
                                    path.cubicTo(f39, f40, fArr2[i12], fArr2[i27], fArr2[i28], fArr2[i29]);
                                    float f41 = fArr2[i12];
                                    f22 = f41;
                                    f23 = fArr2[i27];
                                    f11 = fArr2[i28];
                                    f10 = fArr2[i29];
                                } else if (c12 == 'T') {
                                    fArr2 = fArr2;
                                    i12 = i12;
                                    if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                        f28 = (f28 * 2.0f) - f22;
                                        f29 = (f29 * 2.0f) - f23;
                                    }
                                    int i30 = i12 + 1;
                                    path.quadTo(f28, f29, fArr2[i12], fArr2[i30]);
                                    f11 = fArr2[i12];
                                    f10 = fArr2[i30];
                                    eVar = eVar;
                                    f22 = f28;
                                    f23 = f29;
                                } else if (c12 == 'l') {
                                    fArr2 = fArr2;
                                    i12 = i12;
                                    int i31 = i12 + 1;
                                    path.rLineTo(fArr2[i12], fArr2[i31]);
                                    f28 += fArr2[i12];
                                    f15 = fArr2[i31];
                                } else if (c12 == 'm') {
                                    fArr2 = fArr2;
                                    i12 = i12;
                                    float f42 = fArr2[i12];
                                    f28 += f42;
                                    float f43 = fArr2[i12 + 1];
                                    f29 += f43;
                                    if (i12 > 0) {
                                        path.rLineTo(f42, f43);
                                    } else {
                                        path.rMoveTo(f42, f43);
                                        eVar = eVar;
                                        f11 = f28;
                                        f26 = f11;
                                        f10 = f29;
                                        f27 = f10;
                                    }
                                } else if (c12 != 's') {
                                    if (c12 != 't') {
                                        f11 = f28;
                                    } else {
                                        if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                            f18 = f28 - f22;
                                            f19 = f29 - f23;
                                        } else {
                                            f19 = 0.0f;
                                            f18 = 0.0f;
                                        }
                                        int i32 = i12 + 1;
                                        path.rQuadTo(f18, f19, fArr2[i12], fArr2[i32]);
                                        float f44 = f18 + f28;
                                        float f45 = f19 + f29;
                                        float f46 = f28 + fArr2[i12];
                                        f29 += fArr2[i32];
                                        f23 = f45;
                                        f11 = f46;
                                        f22 = f44;
                                    }
                                    f10 = f29;
                                } else {
                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                        f16 = f29 - f23;
                                        f17 = f28 - f22;
                                    } else {
                                        f17 = 0.0f;
                                        f16 = 0.0f;
                                    }
                                    int i33 = i12;
                                    int i34 = i33 + 1;
                                    int i35 = i33 + 2;
                                    int i36 = i33 + 3;
                                    fArr2 = fArr2;
                                    i12 = i33;
                                    path.rCubicTo(f17, f16, fArr2[i33], fArr2[i34], fArr2[i35], fArr2[i36]);
                                    f12 = fArr2[i12] + f28;
                                    f13 = fArr2[i34] + f29;
                                    f28 += fArr2[i35];
                                    f14 = fArr2[i36];
                                }
                                eVar = eVar;
                            } else {
                                fArr2 = fArr2;
                                i12 = i12;
                                path.rLineTo(0.0f, fArr2[i12]);
                                f15 = fArr2[i12];
                            }
                            f29 += f15;
                        } else {
                            fArr2 = fArr2;
                            i12 = i12;
                            int i37 = i12 + 1;
                            int i38 = i12 + 2;
                            int i39 = i12 + 3;
                            path.rQuadTo(fArr2[i12], fArr2[i37], fArr2[i38], fArr2[i39]);
                            f12 = fArr2[i12] + f28;
                            f13 = fArr2[i37] + f29;
                            f28 += fArr2[i38];
                            f14 = fArr2[i39];
                        }
                        f29 += f14;
                        f22 = f12;
                        f23 = f13;
                    } else {
                        fArr2 = fArr2;
                        i12 = i12;
                        path.rLineTo(fArr2[i12], 0.0f);
                        f28 += fArr2[i12];
                    }
                    eVar = eVar;
                    f11 = f28;
                    f10 = f29;
                } else {
                    fArr2 = fArr2;
                    i12 = i12;
                    int i40 = i12 + 5;
                    float f47 = fArr2[i40] + f28;
                    int i41 = i12 + 6;
                    float f48 = fArr2[i41] + f29;
                    eVar = eVar;
                    float f49 = f28;
                    float f50 = f29;
                    i11 = i11;
                    a(path, f49, f50, f47, f48, fArr2[i12], fArr2[i12 + 1], fArr2[i12 + 2], fArr2[i12 + 3] != 0.0f, fArr2[i12 + 4] != 0.0f);
                    f11 = f49 + fArr2[i40];
                    f10 = f50 + fArr2[i41];
                    f22 = f11;
                    f23 = f10;
                }
                i12 += i10;
                path = path;
                eVar = eVar;
                c12 = c12;
                i11 = i11;
                f28 = f11;
                f29 = f10;
                c11 = c12;
                fArr2 = fArr2;
            }
            fArr[0] = f28;
            fArr[1] = f29;
            fArr[2] = f22;
            fArr[3] = f23;
            fArr[4] = f26;
            fArr[5] = f27;
            c11 = eVar.f10493a;
            i11++;
            eVarArr2 = eVarArr;
            c10 = 0;
        }
    }

    public e(e eVar) {
        this.f10493a = eVar.f10493a;
        float[] fArr = eVar.f10494b;
        this.f10494b = w7.b(fArr, fArr.length);
    }
}
