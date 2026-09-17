package i0;

import android.graphics.Path;
import android.util.Log;
import v7.g8;
public final class e {
    public char f11429a;
    public final float[] f11430b;

    public e(char c10, float[] fArr) {
        this.f11429a = c10;
        this.f11430b = fArr;
    }

    public static void a(Path path, float f7, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11) {
        double d;
        double d10;
        boolean z12;
        double radians = Math.toRadians(f15);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d11 = f7;
        double d12 = f10;
        double d13 = f13;
        double d14 = ((d12 * sin) + (d11 * cos)) / d13;
        double d15 = f14;
        double d16 = ((d12 * cos) + ((-f7) * sin)) / d15;
        double d17 = f12;
        double d18 = ((d17 * sin) + (f11 * cos)) / d13;
        double d19 = ((d17 * cos) + ((-f11) * sin)) / d15;
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
            a(path, f7, f10, f11, f12, f13 * sqrt, sqrt * f14, f15, z10, z11);
            return;
        }
        double sqrt2 = Math.sqrt(d25);
        double d26 = sqrt2 * d20;
        double d27 = sqrt2 * d21;
        if (z10 == z11) {
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
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
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

    public static void b(e[] eVarArr, Path path) {
        int i10;
        float[] fArr;
        int i11;
        e eVar;
        int i12;
        char c10;
        boolean z10;
        boolean z11;
        float f7;
        float f10;
        e eVar2;
        boolean z12;
        boolean z13;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        e[] eVarArr2 = eVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = eVarArr2.length;
        char c11 = 0;
        char c12 = 'm';
        int i13 = 0;
        while (i13 < length) {
            e eVar3 = eVarArr2[i13];
            char c13 = eVar3.f11429a;
            float[] fArr3 = eVar3.f11430b;
            float f19 = fArr2[c11];
            float f20 = fArr2[1];
            float f21 = fArr2[2];
            float f22 = fArr2[3];
            float f23 = fArr2[4];
            float f24 = fArr2[5];
            switch (c13) {
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
                    path2.moveTo(f23, f24);
                    f19 = f23;
                    f21 = f19;
                    f20 = f24;
                    f22 = f20;
                default:
                    i10 = 2;
                    break;
            }
            float f25 = f23;
            float f26 = f24;
            float f27 = f19;
            float f28 = f20;
            int i14 = 0;
            while (i14 < fArr3.length) {
                if (c13 != 'A') {
                    if (c13 != 'C') {
                        if (c13 != 'H') {
                            if (c13 != 'Q') {
                                if (c13 != 'V') {
                                    if (c13 != 'a') {
                                        if (c13 != 'c') {
                                            if (c13 != 'h') {
                                                if (c13 != 'q') {
                                                    if (c13 != 'v') {
                                                        if (c13 != 'L') {
                                                            if (c13 != 'M') {
                                                                if (c13 != 'S') {
                                                                    if (c13 != 'T') {
                                                                        if (c13 != 'l') {
                                                                            if (c13 != 'm') {
                                                                                if (c13 != 's') {
                                                                                    if (c13 != 't') {
                                                                                        fArr = fArr3;
                                                                                        i11 = i14;
                                                                                        eVar = eVar3;
                                                                                        f10 = f27;
                                                                                    } else {
                                                                                        if (c12 != 'q' && c12 != 't' && c12 != 'Q' && c12 != 'T') {
                                                                                            f18 = 0.0f;
                                                                                            f17 = 0.0f;
                                                                                        } else {
                                                                                            f17 = f27 - f21;
                                                                                            f18 = f28 - f22;
                                                                                        }
                                                                                        int i15 = i14 + 1;
                                                                                        path2.rQuadTo(f17, f18, fArr3[i14], fArr3[i15]);
                                                                                        float f29 = f17 + f27;
                                                                                        float f30 = f18 + f28;
                                                                                        float f31 = f27 + fArr3[i14];
                                                                                        f28 += fArr3[i15];
                                                                                        f22 = f30;
                                                                                        fArr = fArr3;
                                                                                        i11 = i14;
                                                                                        eVar = eVar3;
                                                                                        f10 = f31;
                                                                                        f21 = f29;
                                                                                    }
                                                                                    f7 = f28;
                                                                                } else {
                                                                                    if (c12 != 'c' && c12 != 's' && c12 != 'C' && c12 != 'S') {
                                                                                        f16 = 0.0f;
                                                                                        f15 = 0.0f;
                                                                                    } else {
                                                                                        f15 = f28 - f22;
                                                                                        f16 = f27 - f21;
                                                                                    }
                                                                                    int i16 = i14;
                                                                                    int i17 = i16 + 1;
                                                                                    int i18 = i16 + 2;
                                                                                    int i19 = i16 + 3;
                                                                                    fArr = fArr3;
                                                                                    i11 = i16;
                                                                                    path2.rCubicTo(f16, f15, fArr3[i16], fArr3[i17], fArr3[i18], fArr3[i19]);
                                                                                    f11 = fArr[i11] + f27;
                                                                                    f12 = fArr[i17] + f28;
                                                                                    f27 += fArr[i18];
                                                                                    f13 = fArr[i19];
                                                                                }
                                                                            } else {
                                                                                fArr = fArr3;
                                                                                i11 = i14;
                                                                                float f32 = fArr[i11];
                                                                                f27 += f32;
                                                                                float f33 = fArr[i11 + 1];
                                                                                f28 += f33;
                                                                                if (i11 > 0) {
                                                                                    path2.rLineTo(f32, f33);
                                                                                } else {
                                                                                    path2.rMoveTo(f32, f33);
                                                                                    eVar = eVar3;
                                                                                    f10 = f27;
                                                                                    f25 = f10;
                                                                                    f7 = f28;
                                                                                    f26 = f7;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            fArr = fArr3;
                                                                            i11 = i14;
                                                                            int i20 = i11 + 1;
                                                                            path2.rLineTo(fArr[i11], fArr[i20]);
                                                                            f27 += fArr[i11];
                                                                            f14 = fArr[i20];
                                                                        }
                                                                    } else {
                                                                        fArr = fArr3;
                                                                        i11 = i14;
                                                                        if (c12 == 'q' || c12 == 't' || c12 == 'Q' || c12 == 'T') {
                                                                            f27 = (f27 * 2.0f) - f21;
                                                                            f28 = (f28 * 2.0f) - f22;
                                                                        }
                                                                        int i21 = i11 + 1;
                                                                        path2.quadTo(f27, f28, fArr[i11], fArr[i21]);
                                                                        f10 = fArr[i11];
                                                                        f7 = fArr[i21];
                                                                        eVar = eVar3;
                                                                        f21 = f27;
                                                                        f22 = f28;
                                                                    }
                                                                    i12 = i13;
                                                                    c10 = c13;
                                                                } else {
                                                                    fArr = fArr3;
                                                                    i11 = i14;
                                                                    if (c12 == 'c' || c12 == 's' || c12 == 'C' || c12 == 'S') {
                                                                        f27 = (f27 * 2.0f) - f21;
                                                                        f28 = (f28 * 2.0f) - f22;
                                                                    }
                                                                    float f34 = f27;
                                                                    float f35 = f28;
                                                                    int i22 = i11 + 1;
                                                                    int i23 = i11 + 2;
                                                                    int i24 = i11 + 3;
                                                                    path2.cubicTo(f34, f35, fArr[i11], fArr[i22], fArr[i23], fArr[i24]);
                                                                    float f36 = fArr[i11];
                                                                    float f37 = fArr[i22];
                                                                    f21 = f36;
                                                                    f22 = f37;
                                                                    f10 = fArr[i23];
                                                                    f7 = fArr[i24];
                                                                }
                                                            } else {
                                                                fArr = fArr3;
                                                                i11 = i14;
                                                                f10 = fArr[i11];
                                                                f7 = fArr[i11 + 1];
                                                                if (i11 > 0) {
                                                                    path2.lineTo(f10, f7);
                                                                } else {
                                                                    path2.moveTo(f10, f7);
                                                                    f25 = f10;
                                                                    f26 = f7;
                                                                }
                                                            }
                                                        } else {
                                                            fArr = fArr3;
                                                            i11 = i14;
                                                            int i25 = i11 + 1;
                                                            path2.lineTo(fArr[i11], fArr[i25]);
                                                            f10 = fArr[i11];
                                                            f7 = fArr[i25];
                                                        }
                                                        i12 = i13;
                                                        eVar = eVar3;
                                                        c10 = c13;
                                                    } else {
                                                        fArr = fArr3;
                                                        i11 = i14;
                                                        path2.rLineTo(0.0f, fArr[i11]);
                                                        f14 = fArr[i11];
                                                    }
                                                    f28 += f14;
                                                } else {
                                                    fArr = fArr3;
                                                    i11 = i14;
                                                    int i26 = i11 + 1;
                                                    int i27 = i11 + 2;
                                                    int i28 = i11 + 3;
                                                    path2.rQuadTo(fArr[i11], fArr[i26], fArr[i27], fArr[i28]);
                                                    f11 = fArr[i11] + f27;
                                                    f12 = fArr[i26] + f28;
                                                    f27 += fArr[i27];
                                                    f13 = fArr[i28];
                                                }
                                                f28 += f13;
                                                f21 = f11;
                                                f22 = f12;
                                            } else {
                                                fArr = fArr3;
                                                i11 = i14;
                                                path2.rLineTo(fArr[i11], 0.0f);
                                                f27 += fArr[i11];
                                            }
                                        } else {
                                            fArr = fArr3;
                                            i11 = i14;
                                            int i29 = i11 + 2;
                                            int i30 = i11 + 3;
                                            int i31 = i11 + 4;
                                            int i32 = i11 + 5;
                                            path2.rCubicTo(fArr[i11], fArr[i11 + 1], fArr[i29], fArr[i30], fArr[i31], fArr[i32]);
                                            float f38 = fArr[i29] + f27;
                                            float f39 = fArr[i30] + f28;
                                            f27 += fArr[i31];
                                            f28 += fArr[i32];
                                            f21 = f38;
                                            f22 = f39;
                                        }
                                        eVar = eVar3;
                                        f10 = f27;
                                        f7 = f28;
                                        i12 = i13;
                                        c10 = c13;
                                    } else {
                                        fArr = fArr3;
                                        i11 = i14;
                                        int i33 = i11 + 5;
                                        float f40 = fArr[i33] + f27;
                                        int i34 = i11 + 6;
                                        float f41 = fArr[i34] + f28;
                                        float f42 = fArr[i11];
                                        float f43 = fArr[i11 + 1];
                                        float f44 = fArr[i11 + 2];
                                        if (fArr[i11 + 3] != 0.0f) {
                                            eVar2 = eVar3;
                                            z12 = true;
                                        } else {
                                            eVar2 = eVar3;
                                            z12 = false;
                                        }
                                        eVar = eVar2;
                                        float f45 = f27;
                                        c10 = c13;
                                        if (fArr[i11 + 4] != 0.0f) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        float f46 = f28;
                                        i12 = i13;
                                        a(path, f45, f46, f40, f41, f42, f43, f44, z12, z13);
                                        f10 = f45 + fArr[i33];
                                        f7 = f46 + fArr[i34];
                                        f21 = f10;
                                        f22 = f7;
                                    }
                                } else {
                                    fArr = fArr3;
                                    i11 = i14;
                                    i12 = i13;
                                    eVar = eVar3;
                                    f10 = f27;
                                    c10 = c13;
                                    path2.lineTo(f10, fArr[i11]);
                                    f7 = fArr[i11];
                                }
                            } else {
                                fArr = fArr3;
                                i11 = i14;
                                i12 = i13;
                                eVar = eVar3;
                                c10 = c13;
                                int i35 = i11 + 1;
                                int i36 = i11 + 2;
                                int i37 = i11 + 3;
                                path2.quadTo(fArr[i11], fArr[i35], fArr[i36], fArr[i37]);
                                float f47 = fArr[i11];
                                float f48 = fArr[i35];
                                float f49 = fArr[i36];
                                float f50 = fArr[i37];
                                f21 = f47;
                                f22 = f48;
                                f10 = f49;
                                f7 = f50;
                            }
                        } else {
                            fArr = fArr3;
                            i11 = i14;
                            eVar = eVar3;
                            c10 = c13;
                            f7 = f28;
                            i12 = i13;
                            path2.lineTo(fArr[i11], f7);
                            f10 = fArr[i11];
                        }
                    } else {
                        fArr = fArr3;
                        i11 = i14;
                        i12 = i13;
                        eVar = eVar3;
                        c10 = c13;
                        int i38 = i11 + 2;
                        int i39 = i11 + 3;
                        int i40 = i11 + 4;
                        int i41 = i11 + 5;
                        path2.cubicTo(fArr[i11], fArr[i11 + 1], fArr[i38], fArr[i39], fArr[i40], fArr[i41]);
                        float f51 = fArr[i40];
                        float f52 = fArr[i41];
                        f21 = fArr[i38];
                        f22 = fArr[i39];
                        f7 = f52;
                        f10 = f51;
                    }
                } else {
                    fArr = fArr3;
                    i11 = i14;
                    eVar = eVar3;
                    float f53 = f27;
                    float f54 = f28;
                    i12 = i13;
                    c10 = c13;
                    int i42 = i11 + 5;
                    float f55 = fArr[i42];
                    int i43 = i11 + 6;
                    float f56 = fArr[i43];
                    float f57 = fArr[i11];
                    float f58 = fArr[i11 + 1];
                    float f59 = fArr[i11 + 2];
                    if (fArr[i11 + 3] != 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (fArr[i11 + 4] != 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a(path, f53, f54, f55, f56, f57, f58, f59, z10, z11);
                    f21 = fArr[i42];
                    f7 = fArr[i43];
                    f22 = f7;
                    f10 = f21;
                }
                i14 = i11 + i10;
                path2 = path;
                eVar3 = eVar;
                c13 = c10;
                i13 = i12;
                f27 = f10;
                f28 = f7;
                c12 = c13;
                fArr3 = fArr;
            }
            fArr2[0] = f27;
            fArr2[1] = f28;
            fArr2[2] = f21;
            fArr2[3] = f22;
            fArr2[4] = f25;
            fArr2[5] = f26;
            c12 = eVar3.f11429a;
            i13++;
            eVarArr2 = eVarArr;
            path2 = path;
            c11 = 0;
        }
    }

    public e(e eVar) {
        this.f11429a = eVar.f11429a;
        float[] fArr = eVar.f11430b;
        this.f11430b = g8.b(fArr, fArr.length);
    }
}
