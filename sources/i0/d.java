package i0;

import android.graphics.Path;
import android.util.Log;
import f7.i8;
public final class d {
    public char f10852a;
    public final float[] f10853b;

    public d(char c10, float[] fArr) {
        this.f10852a = c10;
        this.f10853b = fArr;
    }

    public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
        double d;
        double d9;
        boolean z12;
        double radians = Math.toRadians(f16);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d10 = f10;
        double d11 = f11;
        double d12 = f14;
        double d13 = ((d11 * sin) + (d10 * cos)) / d12;
        double d14 = f15;
        double d15 = ((d11 * cos) + ((-f10) * sin)) / d14;
        double d16 = f13;
        double d17 = ((d16 * sin) + (f12 * cos)) / d12;
        double d18 = ((d16 * cos) + ((-f12) * sin)) / d14;
        double d19 = d13 - d17;
        double d20 = d15 - d18;
        double d21 = (d13 + d17) / 2.0d;
        double d22 = (d15 + d18) / 2.0d;
        double d23 = (d20 * d20) + (d19 * d19);
        if (d23 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d24 = (1.0d / d23) - 0.25d;
        if (d24 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d23);
            float sqrt = (float) (Math.sqrt(d23) / 1.99999d);
            a(path, f10, f11, f12, f13, f14 * sqrt, sqrt * f15, f16, z10, z11);
            return;
        }
        double sqrt2 = Math.sqrt(d24);
        double d25 = sqrt2 * d19;
        double d26 = sqrt2 * d20;
        if (z10 == z11) {
            d = d21 - d26;
            d9 = d22 + d25;
        } else {
            d = d21 + d26;
            d9 = d22 - d25;
        }
        double atan2 = Math.atan2(d15 - d9, d13 - d);
        double atan22 = Math.atan2(d18 - d9, d17 - d) - atan2;
        int i9 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (i9 >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            if (i9 > 0) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d27 = d * d12;
        double d28 = d9 * d14;
        double d29 = (d27 * cos) - (d28 * sin);
        double d30 = (d28 * cos) + (d27 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d31 = d11;
        double d32 = -d12;
        double d33 = d32 * cos2;
        double d34 = d14 * sin2;
        double d35 = (d33 * sin3) - (d34 * cos3);
        double d36 = d32 * sin2;
        double d37 = d14 * cos2;
        double d38 = (cos3 * d37) + (sin3 * d36);
        double d39 = atan22 / ceil;
        double d40 = atan2;
        int i10 = 0;
        while (i10 < ceil) {
            double d41 = d40 + d39;
            double sin4 = Math.sin(d41);
            double cos4 = Math.cos(d41);
            int i11 = ceil;
            double d42 = (((d12 * cos2) * cos4) + d29) - (d34 * sin4);
            double d43 = d36;
            double d44 = (d37 * sin4) + (d12 * sin2 * cos4) + d30;
            double d45 = (d33 * sin4) - (d34 * cos4);
            double d46 = (cos4 * d37) + (sin4 * d43);
            double d47 = d41 - d40;
            double tan = Math.tan(d47 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d47)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d35 * sqrt3) + d10), (float) ((d38 * sqrt3) + d31), (float) (d42 - (sqrt3 * d45)), (float) (d44 - (sqrt3 * d46)), (float) d42, (float) d44);
            i10++;
            d10 = d42;
            d31 = d44;
            d29 = d29;
            d40 = d41;
            cos2 = cos2;
            d38 = d46;
            d35 = d45;
            ceil = i11;
            d39 = d39;
            d36 = d43;
        }
    }

    public static void b(d[] dVarArr, Path path) {
        int i9;
        float[] fArr;
        int i10;
        d dVar;
        int i11;
        char c10;
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        d dVar2;
        boolean z12;
        boolean z13;
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
        char c11 = 0;
        char c12 = 'm';
        int i12 = 0;
        while (i12 < length) {
            d dVar3 = dVarArr2[i12];
            char c13 = dVar3.f10852a;
            float[] fArr3 = dVar3.f10853b;
            float f20 = fArr2[c11];
            float f21 = fArr2[1];
            float f22 = fArr2[2];
            float f23 = fArr2[3];
            float f24 = fArr2[4];
            float f25 = fArr2[5];
            switch (c13) {
                case 'A':
                case 'a':
                    i9 = 7;
                    break;
                case 'C':
                case 'c':
                    i9 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i9 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i9 = 4;
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
                    i9 = 2;
                    break;
            }
            float f26 = f24;
            float f27 = f25;
            float f28 = f20;
            float f29 = f21;
            int i13 = 0;
            while (i13 < fArr3.length) {
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
                                                                                        i10 = i13;
                                                                                        dVar = dVar3;
                                                                                        f11 = f28;
                                                                                    } else {
                                                                                        if (c12 != 'q' && c12 != 't' && c12 != 'Q' && c12 != 'T') {
                                                                                            f19 = 0.0f;
                                                                                            f18 = 0.0f;
                                                                                        } else {
                                                                                            f18 = f28 - f22;
                                                                                            f19 = f29 - f23;
                                                                                        }
                                                                                        int i14 = i13 + 1;
                                                                                        path2.rQuadTo(f18, f19, fArr3[i13], fArr3[i14]);
                                                                                        float f30 = f18 + f28;
                                                                                        float f31 = f19 + f29;
                                                                                        float f32 = f28 + fArr3[i13];
                                                                                        f29 += fArr3[i14];
                                                                                        f23 = f31;
                                                                                        fArr = fArr3;
                                                                                        i10 = i13;
                                                                                        dVar = dVar3;
                                                                                        f11 = f32;
                                                                                        f22 = f30;
                                                                                    }
                                                                                    f10 = f29;
                                                                                } else {
                                                                                    if (c12 != 'c' && c12 != 's' && c12 != 'C' && c12 != 'S') {
                                                                                        f17 = 0.0f;
                                                                                        f16 = 0.0f;
                                                                                    } else {
                                                                                        f16 = f29 - f23;
                                                                                        f17 = f28 - f22;
                                                                                    }
                                                                                    int i15 = i13;
                                                                                    int i16 = i15 + 1;
                                                                                    int i17 = i15 + 2;
                                                                                    int i18 = i15 + 3;
                                                                                    fArr = fArr3;
                                                                                    i10 = i15;
                                                                                    path2.rCubicTo(f17, f16, fArr3[i15], fArr3[i16], fArr3[i17], fArr3[i18]);
                                                                                    f12 = fArr[i10] + f28;
                                                                                    f13 = fArr[i16] + f29;
                                                                                    f28 += fArr[i17];
                                                                                    f14 = fArr[i18];
                                                                                }
                                                                            } else {
                                                                                fArr = fArr3;
                                                                                i10 = i13;
                                                                                float f33 = fArr[i10];
                                                                                f28 += f33;
                                                                                float f34 = fArr[i10 + 1];
                                                                                f29 += f34;
                                                                                if (i10 > 0) {
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
                                                                            i10 = i13;
                                                                            int i19 = i10 + 1;
                                                                            path2.rLineTo(fArr[i10], fArr[i19]);
                                                                            f28 += fArr[i10];
                                                                            f15 = fArr[i19];
                                                                        }
                                                                    } else {
                                                                        fArr = fArr3;
                                                                        i10 = i13;
                                                                        if (c12 == 'q' || c12 == 't' || c12 == 'Q' || c12 == 'T') {
                                                                            f28 = (f28 * 2.0f) - f22;
                                                                            f29 = (f29 * 2.0f) - f23;
                                                                        }
                                                                        int i20 = i10 + 1;
                                                                        path2.quadTo(f28, f29, fArr[i10], fArr[i20]);
                                                                        f11 = fArr[i10];
                                                                        f10 = fArr[i20];
                                                                        dVar = dVar3;
                                                                        f22 = f28;
                                                                        f23 = f29;
                                                                    }
                                                                    i11 = i12;
                                                                    c10 = c13;
                                                                } else {
                                                                    fArr = fArr3;
                                                                    i10 = i13;
                                                                    if (c12 == 'c' || c12 == 's' || c12 == 'C' || c12 == 'S') {
                                                                        f28 = (f28 * 2.0f) - f22;
                                                                        f29 = (f29 * 2.0f) - f23;
                                                                    }
                                                                    float f35 = f28;
                                                                    float f36 = f29;
                                                                    int i21 = i10 + 1;
                                                                    int i22 = i10 + 2;
                                                                    int i23 = i10 + 3;
                                                                    path2.cubicTo(f35, f36, fArr[i10], fArr[i21], fArr[i22], fArr[i23]);
                                                                    float f37 = fArr[i10];
                                                                    float f38 = fArr[i21];
                                                                    f22 = f37;
                                                                    f23 = f38;
                                                                    f11 = fArr[i22];
                                                                    f10 = fArr[i23];
                                                                }
                                                            } else {
                                                                fArr = fArr3;
                                                                i10 = i13;
                                                                f11 = fArr[i10];
                                                                f10 = fArr[i10 + 1];
                                                                if (i10 > 0) {
                                                                    path2.lineTo(f11, f10);
                                                                } else {
                                                                    path2.moveTo(f11, f10);
                                                                    f26 = f11;
                                                                    f27 = f10;
                                                                }
                                                            }
                                                        } else {
                                                            fArr = fArr3;
                                                            i10 = i13;
                                                            int i24 = i10 + 1;
                                                            path2.lineTo(fArr[i10], fArr[i24]);
                                                            f11 = fArr[i10];
                                                            f10 = fArr[i24];
                                                        }
                                                        i11 = i12;
                                                        dVar = dVar3;
                                                        c10 = c13;
                                                    } else {
                                                        fArr = fArr3;
                                                        i10 = i13;
                                                        path2.rLineTo(0.0f, fArr[i10]);
                                                        f15 = fArr[i10];
                                                    }
                                                    f29 += f15;
                                                } else {
                                                    fArr = fArr3;
                                                    i10 = i13;
                                                    int i25 = i10 + 1;
                                                    int i26 = i10 + 2;
                                                    int i27 = i10 + 3;
                                                    path2.rQuadTo(fArr[i10], fArr[i25], fArr[i26], fArr[i27]);
                                                    f12 = fArr[i10] + f28;
                                                    f13 = fArr[i25] + f29;
                                                    f28 += fArr[i26];
                                                    f14 = fArr[i27];
                                                }
                                                f29 += f14;
                                                f22 = f12;
                                                f23 = f13;
                                            } else {
                                                fArr = fArr3;
                                                i10 = i13;
                                                path2.rLineTo(fArr[i10], 0.0f);
                                                f28 += fArr[i10];
                                            }
                                        } else {
                                            fArr = fArr3;
                                            i10 = i13;
                                            int i28 = i10 + 2;
                                            int i29 = i10 + 3;
                                            int i30 = i10 + 4;
                                            int i31 = i10 + 5;
                                            path2.rCubicTo(fArr[i10], fArr[i10 + 1], fArr[i28], fArr[i29], fArr[i30], fArr[i31]);
                                            float f39 = fArr[i28] + f28;
                                            float f40 = fArr[i29] + f29;
                                            f28 += fArr[i30];
                                            f29 += fArr[i31];
                                            f22 = f39;
                                            f23 = f40;
                                        }
                                        dVar = dVar3;
                                        f11 = f28;
                                        f10 = f29;
                                        i11 = i12;
                                        c10 = c13;
                                    } else {
                                        fArr = fArr3;
                                        i10 = i13;
                                        int i32 = i10 + 5;
                                        float f41 = fArr[i32] + f28;
                                        int i33 = i10 + 6;
                                        float f42 = fArr[i33] + f29;
                                        float f43 = fArr[i10];
                                        float f44 = fArr[i10 + 1];
                                        float f45 = fArr[i10 + 2];
                                        if (fArr[i10 + 3] != 0.0f) {
                                            dVar2 = dVar3;
                                            z12 = true;
                                        } else {
                                            dVar2 = dVar3;
                                            z12 = false;
                                        }
                                        dVar = dVar2;
                                        float f46 = f28;
                                        c10 = c13;
                                        if (fArr[i10 + 4] != 0.0f) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        float f47 = f29;
                                        i11 = i12;
                                        a(path, f46, f47, f41, f42, f43, f44, f45, z12, z13);
                                        f11 = f46 + fArr[i32];
                                        f10 = f47 + fArr[i33];
                                        f22 = f11;
                                        f23 = f10;
                                    }
                                } else {
                                    fArr = fArr3;
                                    i10 = i13;
                                    i11 = i12;
                                    dVar = dVar3;
                                    f11 = f28;
                                    c10 = c13;
                                    path2.lineTo(f11, fArr[i10]);
                                    f10 = fArr[i10];
                                }
                            } else {
                                fArr = fArr3;
                                i10 = i13;
                                i11 = i12;
                                dVar = dVar3;
                                c10 = c13;
                                int i34 = i10 + 1;
                                int i35 = i10 + 2;
                                int i36 = i10 + 3;
                                path2.quadTo(fArr[i10], fArr[i34], fArr[i35], fArr[i36]);
                                float f48 = fArr[i10];
                                float f49 = fArr[i34];
                                float f50 = fArr[i35];
                                float f51 = fArr[i36];
                                f22 = f48;
                                f23 = f49;
                                f11 = f50;
                                f10 = f51;
                            }
                        } else {
                            fArr = fArr3;
                            i10 = i13;
                            dVar = dVar3;
                            c10 = c13;
                            f10 = f29;
                            i11 = i12;
                            path2.lineTo(fArr[i10], f10);
                            f11 = fArr[i10];
                        }
                    } else {
                        fArr = fArr3;
                        i10 = i13;
                        i11 = i12;
                        dVar = dVar3;
                        c10 = c13;
                        int i37 = i10 + 2;
                        int i38 = i10 + 3;
                        int i39 = i10 + 4;
                        int i40 = i10 + 5;
                        path2.cubicTo(fArr[i10], fArr[i10 + 1], fArr[i37], fArr[i38], fArr[i39], fArr[i40]);
                        float f52 = fArr[i39];
                        float f53 = fArr[i40];
                        f22 = fArr[i37];
                        f23 = fArr[i38];
                        f10 = f53;
                        f11 = f52;
                    }
                } else {
                    fArr = fArr3;
                    i10 = i13;
                    dVar = dVar3;
                    float f54 = f28;
                    float f55 = f29;
                    i11 = i12;
                    c10 = c13;
                    int i41 = i10 + 5;
                    float f56 = fArr[i41];
                    int i42 = i10 + 6;
                    float f57 = fArr[i42];
                    float f58 = fArr[i10];
                    float f59 = fArr[i10 + 1];
                    float f60 = fArr[i10 + 2];
                    if (fArr[i10 + 3] != 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (fArr[i10 + 4] != 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a(path, f54, f55, f56, f57, f58, f59, f60, z10, z11);
                    f22 = fArr[i41];
                    f10 = fArr[i42];
                    f23 = f10;
                    f11 = f22;
                }
                i13 = i10 + i9;
                path2 = path;
                dVar3 = dVar;
                c13 = c10;
                i12 = i11;
                f28 = f11;
                f29 = f10;
                c12 = c13;
                fArr3 = fArr;
            }
            fArr2[0] = f28;
            fArr2[1] = f29;
            fArr2[2] = f22;
            fArr2[3] = f23;
            fArr2[4] = f26;
            fArr2[5] = f27;
            c12 = dVar3.f10852a;
            i12++;
            dVarArr2 = dVarArr;
            path2 = path;
            c11 = 0;
        }
    }

    public d(d dVar) {
        this.f10852a = dVar.f10852a;
        float[] fArr = dVar.f10853b;
        this.f10853b = i8.b(fArr, fArr.length);
    }
}
