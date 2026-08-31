package i0;

import android.graphics.Path;
import android.util.Log;
import j7.z7;
public final class d {
    public char f7761a;
    public final float[] f7762b;

    public d(char c3, float[] fArr) {
        this.f7761a = c3;
        this.f7762b = fArr;
    }

    public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, boolean z10) {
        double d;
        double d10;
        boolean z11;
        double radians = Math.toRadians(f16);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d11 = f10;
        double d12 = f11;
        double d13 = f14;
        double d14 = ((d12 * sin) + (d11 * cos)) / d13;
        double d15 = f15;
        double d16 = ((d12 * cos) + ((-f10) * sin)) / d15;
        double d17 = f13;
        double d18 = ((d17 * sin) + (f12 * cos)) / d13;
        double d19 = ((d17 * cos) + ((-f12) * sin)) / d15;
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
            float sqrt = (float) (Math.sqrt(d24) / 1.99999d);
            a(path, f10, f11, f12, f13, f14 * sqrt, sqrt * f15, f16, z4, z10);
            return;
        }
        double sqrt2 = Math.sqrt(d25);
        double d26 = sqrt2 * d20;
        double d27 = sqrt2 * d21;
        if (z4 == z10) {
            d = d22 - d27;
            d10 = d23 + d26;
        } else {
            d = d22 + d27;
            d10 = d23 - d26;
        }
        double atan2 = Math.atan2(d16 - d10, d14 - d);
        double atan22 = Math.atan2(d19 - d10, d18 - d) - atan2;
        int i10 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (i10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            if (i10 > 0) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d28 = d * d13;
        double d29 = d10 * d15;
        double d30 = (d28 * cos) - (d29 * sin);
        double d31 = (d29 * cos) + (d28 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d32 = d12;
        double d33 = -d13;
        double d34 = d33 * cos2;
        double d35 = d15 * sin2;
        double d36 = (d34 * sin3) - (d35 * cos3);
        double d37 = d33 * sin2;
        double d38 = d15 * cos2;
        double d39 = (cos3 * d38) + (sin3 * d37);
        double d40 = atan22 / ceil;
        double d41 = atan2;
        int i11 = 0;
        while (i11 < ceil) {
            double d42 = d41 + d40;
            double sin4 = Math.sin(d42);
            double cos4 = Math.cos(d42);
            int i12 = ceil;
            double d43 = (((d13 * cos2) * cos4) + d30) - (d35 * sin4);
            double d44 = d37;
            double d45 = (d38 * sin4) + (d13 * sin2 * cos4) + d31;
            double d46 = (d34 * sin4) - (d35 * cos4);
            double d47 = (cos4 * d38) + (sin4 * d44);
            double d48 = d42 - d41;
            double tan = Math.tan(d48 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d48)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d36 * sqrt3) + d11), (float) ((d39 * sqrt3) + d32), (float) (d43 - (sqrt3 * d46)), (float) (d45 - (sqrt3 * d47)), (float) d43, (float) d45);
            i11++;
            d11 = d43;
            d32 = d45;
            d30 = d30;
            d41 = d42;
            cos2 = cos2;
            d39 = d47;
            d36 = d46;
            ceil = i12;
            d40 = d40;
            d37 = d44;
        }
    }

    public static void b(d[] dVarArr, Path path) {
        int i10;
        float[] fArr;
        int i11;
        d dVar;
        int i12;
        char c3;
        boolean z4;
        boolean z10;
        float f10;
        float f11;
        d dVar2;
        boolean z11;
        boolean z12;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        d[] dVarArr2 = dVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = dVarArr2.length;
        char c10 = 0;
        char c11 = 'm';
        int i13 = 0;
        while (i13 < length) {
            d dVar3 = dVarArr2[i13];
            char c12 = dVar3.f7761a;
            float[] fArr3 = dVar3.f7762b;
            float f20 = fArr2[c10];
            float f21 = fArr2[1];
            float f22 = fArr2[2];
            float f23 = fArr2[3];
            float f24 = fArr2[4];
            float f25 = fArr2[5];
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
                    path2.close();
                    path2.moveTo(f24, f25);
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
            int i14 = 0;
            while (i14 < fArr3.length) {
                if (c12 != 'A') {
                    if (c12 != 'C') {
                        if (c12 != 'H') {
                            if (c12 != 'Q') {
                                if (c12 != 'V') {
                                    if (c12 != 'a') {
                                        if (c12 != 'c') {
                                            if (c12 != 'h') {
                                                if (c12 != 'q') {
                                                    if (c12 != 'v') {
                                                        if (c12 != 'L') {
                                                            if (c12 != 'M') {
                                                                if (c12 != 'S') {
                                                                    if (c12 != 'T') {
                                                                        if (c12 != 'l') {
                                                                            if (c12 != 'm') {
                                                                                if (c12 != 's') {
                                                                                    if (c12 != 't') {
                                                                                        fArr = fArr3;
                                                                                        i11 = i14;
                                                                                        dVar = dVar3;
                                                                                        f11 = f28;
                                                                                    } else {
                                                                                        if (c11 != 'q' && c11 != 't' && c11 != 'Q' && c11 != 'T') {
                                                                                            f19 = 0.0f;
                                                                                            f18 = 0.0f;
                                                                                        } else {
                                                                                            f18 = f28 - f22;
                                                                                            f19 = f29 - f23;
                                                                                        }
                                                                                        int i15 = i14 + 1;
                                                                                        path2.rQuadTo(f18, f19, fArr3[i14], fArr3[i15]);
                                                                                        float f30 = f18 + f28;
                                                                                        float f31 = f19 + f29;
                                                                                        float f32 = f28 + fArr3[i14];
                                                                                        f29 += fArr3[i15];
                                                                                        f23 = f31;
                                                                                        fArr = fArr3;
                                                                                        i11 = i14;
                                                                                        dVar = dVar3;
                                                                                        f11 = f32;
                                                                                        f22 = f30;
                                                                                    }
                                                                                    f10 = f29;
                                                                                } else {
                                                                                    if (c11 != 'c' && c11 != 's' && c11 != 'C' && c11 != 'S') {
                                                                                        f17 = 0.0f;
                                                                                        f16 = 0.0f;
                                                                                    } else {
                                                                                        f16 = f29 - f23;
                                                                                        f17 = f28 - f22;
                                                                                    }
                                                                                    int i16 = i14;
                                                                                    int i17 = i16 + 1;
                                                                                    int i18 = i16 + 2;
                                                                                    int i19 = i16 + 3;
                                                                                    fArr = fArr3;
                                                                                    i11 = i16;
                                                                                    path2.rCubicTo(f17, f16, fArr3[i16], fArr3[i17], fArr3[i18], fArr3[i19]);
                                                                                    f12 = fArr[i11] + f28;
                                                                                    f13 = fArr[i17] + f29;
                                                                                    f28 += fArr[i18];
                                                                                    f14 = fArr[i19];
                                                                                }
                                                                            } else {
                                                                                fArr = fArr3;
                                                                                i11 = i14;
                                                                                float f33 = fArr[i11];
                                                                                f28 += f33;
                                                                                float f34 = fArr[i11 + 1];
                                                                                f29 += f34;
                                                                                if (i11 > 0) {
                                                                                    path2.rLineTo(f33, f34);
                                                                                } else {
                                                                                    path2.rMoveTo(f33, f34);
                                                                                    dVar = dVar3;
                                                                                    f11 = f28;
                                                                                    f26 = f11;
                                                                                    f10 = f29;
                                                                                    f27 = f10;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            fArr = fArr3;
                                                                            i11 = i14;
                                                                            int i20 = i11 + 1;
                                                                            path2.rLineTo(fArr[i11], fArr[i20]);
                                                                            f28 += fArr[i11];
                                                                            f15 = fArr[i20];
                                                                        }
                                                                    } else {
                                                                        fArr = fArr3;
                                                                        i11 = i14;
                                                                        if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                                            f28 = (f28 * 2.0f) - f22;
                                                                            f29 = (f29 * 2.0f) - f23;
                                                                        }
                                                                        int i21 = i11 + 1;
                                                                        path2.quadTo(f28, f29, fArr[i11], fArr[i21]);
                                                                        f11 = fArr[i11];
                                                                        f10 = fArr[i21];
                                                                        dVar = dVar3;
                                                                        f22 = f28;
                                                                        f23 = f29;
                                                                    }
                                                                    i12 = i13;
                                                                    c3 = c12;
                                                                } else {
                                                                    fArr = fArr3;
                                                                    i11 = i14;
                                                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                                                        f28 = (f28 * 2.0f) - f22;
                                                                        f29 = (f29 * 2.0f) - f23;
                                                                    }
                                                                    float f35 = f28;
                                                                    float f36 = f29;
                                                                    int i22 = i11 + 1;
                                                                    int i23 = i11 + 2;
                                                                    int i24 = i11 + 3;
                                                                    path2.cubicTo(f35, f36, fArr[i11], fArr[i22], fArr[i23], fArr[i24]);
                                                                    float f37 = fArr[i11];
                                                                    float f38 = fArr[i22];
                                                                    f22 = f37;
                                                                    f23 = f38;
                                                                    f11 = fArr[i23];
                                                                    f10 = fArr[i24];
                                                                }
                                                            } else {
                                                                fArr = fArr3;
                                                                i11 = i14;
                                                                f11 = fArr[i11];
                                                                f10 = fArr[i11 + 1];
                                                                if (i11 > 0) {
                                                                    path2.lineTo(f11, f10);
                                                                } else {
                                                                    path2.moveTo(f11, f10);
                                                                    f26 = f11;
                                                                    f27 = f10;
                                                                }
                                                            }
                                                        } else {
                                                            fArr = fArr3;
                                                            i11 = i14;
                                                            int i25 = i11 + 1;
                                                            path2.lineTo(fArr[i11], fArr[i25]);
                                                            f11 = fArr[i11];
                                                            f10 = fArr[i25];
                                                        }
                                                        i12 = i13;
                                                        dVar = dVar3;
                                                        c3 = c12;
                                                    } else {
                                                        fArr = fArr3;
                                                        i11 = i14;
                                                        path2.rLineTo(0.0f, fArr[i11]);
                                                        f15 = fArr[i11];
                                                    }
                                                    f29 += f15;
                                                } else {
                                                    fArr = fArr3;
                                                    i11 = i14;
                                                    int i26 = i11 + 1;
                                                    int i27 = i11 + 2;
                                                    int i28 = i11 + 3;
                                                    path2.rQuadTo(fArr[i11], fArr[i26], fArr[i27], fArr[i28]);
                                                    f12 = fArr[i11] + f28;
                                                    f13 = fArr[i26] + f29;
                                                    f28 += fArr[i27];
                                                    f14 = fArr[i28];
                                                }
                                                f29 += f14;
                                                f22 = f12;
                                                f23 = f13;
                                            } else {
                                                fArr = fArr3;
                                                i11 = i14;
                                                path2.rLineTo(fArr[i11], 0.0f);
                                                f28 += fArr[i11];
                                            }
                                        } else {
                                            fArr = fArr3;
                                            i11 = i14;
                                            int i29 = i11 + 2;
                                            int i30 = i11 + 3;
                                            int i31 = i11 + 4;
                                            int i32 = i11 + 5;
                                            path2.rCubicTo(fArr[i11], fArr[i11 + 1], fArr[i29], fArr[i30], fArr[i31], fArr[i32]);
                                            float f39 = fArr[i29] + f28;
                                            float f40 = fArr[i30] + f29;
                                            f28 += fArr[i31];
                                            f29 += fArr[i32];
                                            f22 = f39;
                                            f23 = f40;
                                        }
                                        dVar = dVar3;
                                        f11 = f28;
                                        f10 = f29;
                                        i12 = i13;
                                        c3 = c12;
                                    } else {
                                        fArr = fArr3;
                                        i11 = i14;
                                        int i33 = i11 + 5;
                                        float f41 = fArr[i33] + f28;
                                        int i34 = i11 + 6;
                                        float f42 = fArr[i34] + f29;
                                        float f43 = fArr[i11];
                                        float f44 = fArr[i11 + 1];
                                        float f45 = fArr[i11 + 2];
                                        if (fArr[i11 + 3] != 0.0f) {
                                            dVar2 = dVar3;
                                            z11 = true;
                                        } else {
                                            dVar2 = dVar3;
                                            z11 = false;
                                        }
                                        dVar = dVar2;
                                        float f46 = f28;
                                        c3 = c12;
                                        if (fArr[i11 + 4] != 0.0f) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        float f47 = f29;
                                        i12 = i13;
                                        a(path, f46, f47, f41, f42, f43, f44, f45, z11, z12);
                                        f11 = f46 + fArr[i33];
                                        f10 = f47 + fArr[i34];
                                        f22 = f11;
                                        f23 = f10;
                                    }
                                } else {
                                    fArr = fArr3;
                                    i11 = i14;
                                    i12 = i13;
                                    dVar = dVar3;
                                    f11 = f28;
                                    c3 = c12;
                                    path2.lineTo(f11, fArr[i11]);
                                    f10 = fArr[i11];
                                }
                            } else {
                                fArr = fArr3;
                                i11 = i14;
                                i12 = i13;
                                dVar = dVar3;
                                c3 = c12;
                                int i35 = i11 + 1;
                                int i36 = i11 + 2;
                                int i37 = i11 + 3;
                                path2.quadTo(fArr[i11], fArr[i35], fArr[i36], fArr[i37]);
                                float f48 = fArr[i11];
                                float f49 = fArr[i35];
                                float f50 = fArr[i36];
                                float f51 = fArr[i37];
                                f22 = f48;
                                f23 = f49;
                                f11 = f50;
                                f10 = f51;
                            }
                        } else {
                            fArr = fArr3;
                            i11 = i14;
                            dVar = dVar3;
                            c3 = c12;
                            f10 = f29;
                            i12 = i13;
                            path2.lineTo(fArr[i11], f10);
                            f11 = fArr[i11];
                        }
                    } else {
                        fArr = fArr3;
                        i11 = i14;
                        i12 = i13;
                        dVar = dVar3;
                        c3 = c12;
                        int i38 = i11 + 2;
                        int i39 = i11 + 3;
                        int i40 = i11 + 4;
                        int i41 = i11 + 5;
                        path2.cubicTo(fArr[i11], fArr[i11 + 1], fArr[i38], fArr[i39], fArr[i40], fArr[i41]);
                        float f52 = fArr[i40];
                        float f53 = fArr[i41];
                        f22 = fArr[i38];
                        f23 = fArr[i39];
                        f10 = f53;
                        f11 = f52;
                    }
                } else {
                    fArr = fArr3;
                    i11 = i14;
                    dVar = dVar3;
                    float f54 = f28;
                    float f55 = f29;
                    i12 = i13;
                    c3 = c12;
                    int i42 = i11 + 5;
                    float f56 = fArr[i42];
                    int i43 = i11 + 6;
                    float f57 = fArr[i43];
                    float f58 = fArr[i11];
                    float f59 = fArr[i11 + 1];
                    float f60 = fArr[i11 + 2];
                    if (fArr[i11 + 3] != 0.0f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (fArr[i11 + 4] != 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a(path, f54, f55, f56, f57, f58, f59, f60, z4, z10);
                    f22 = fArr[i42];
                    f10 = fArr[i43];
                    f23 = f10;
                    f11 = f22;
                }
                i14 = i11 + i10;
                path2 = path;
                dVar3 = dVar;
                c12 = c3;
                i13 = i12;
                f28 = f11;
                f29 = f10;
                c11 = c12;
                fArr3 = fArr;
            }
            fArr2[0] = f28;
            fArr2[1] = f29;
            fArr2[2] = f22;
            fArr2[3] = f23;
            fArr2[4] = f26;
            fArr2[5] = f27;
            c11 = dVar3.f7761a;
            i13++;
            dVarArr2 = dVarArr;
            path2 = path;
            c10 = 0;
        }
    }

    public d(d dVar) {
        this.f7761a = dVar.f7761a;
        float[] fArr = dVar.f7762b;
        this.f7762b = z7.b(fArr, fArr.length);
    }
}
