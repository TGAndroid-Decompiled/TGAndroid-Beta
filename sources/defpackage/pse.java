package defpackage;

import android.graphics.Path;
public abstract class pse {
    public static boolean a(m08[] m08VarArr, m08[] m08VarArr2) {
        if (m08VarArr != null && m08VarArr2 != null && m08VarArr.length == m08VarArr2.length) {
            for (int i = 0; i < m08VarArr.length; i++) {
                m08 m08Var = m08VarArr[i];
                char c = m08Var.a;
                m08 m08Var2 = m08VarArr2[i];
                if (c == m08Var2.a && m08Var.b.length == m08Var2.b.length) {
                }
            }
            return true;
        }
        return false;
    }

    public static float[] b(int i, float[] fArr) {
        if (i >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i, length);
                float[] fArr2 = new float[i];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        i98.g();
        return null;
    }

    public static defpackage.m08[] c(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pse.c(java.lang.String):m08[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        try {
            f(c(str), path);
            return path;
        } catch (RuntimeException e) {
            rjb.k("Error in parsing ".concat(str), e);
            return null;
        }
    }

    public static m08[] e(m08[] m08VarArr) {
        m08[] m08VarArr2 = new m08[m08VarArr.length];
        for (int i = 0; i < m08VarArr.length; i++) {
            m08VarArr2[i] = new m08(m08VarArr[i]);
        }
        return m08VarArr2;
    }

    public static void f(m08[] m08VarArr, Path path) {
        int i;
        float[] fArr;
        int i2;
        m08 m08Var;
        int i3;
        char c;
        boolean z;
        boolean z2;
        float f;
        float f2;
        m08 m08Var2;
        boolean z3;
        boolean z4;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        m08[] m08VarArr2 = m08VarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = m08VarArr2.length;
        int i4 = 0;
        int i5 = 0;
        char c2 = 'm';
        while (i5 < length) {
            m08 m08Var3 = m08VarArr2[i5];
            char c3 = m08Var3.a;
            float[] fArr3 = m08Var3.b;
            float f11 = fArr2[i4];
            float f12 = fArr2[1];
            float f13 = fArr2[2];
            float f14 = fArr2[3];
            float f15 = fArr2[4];
            int i6 = i4;
            float f16 = fArr2[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f15, f16);
                    f11 = f15;
                    f13 = f11;
                    f12 = f16;
                    f14 = f12;
                default:
                    i = 2;
                    break;
            }
            float f17 = f15;
            float f18 = f16;
            float f19 = f11;
            float f20 = f12;
            int i7 = i6;
            while (i7 < fArr3.length) {
                if (c3 != 'A') {
                    if (c3 != 'C') {
                        if (c3 != 'H') {
                            if (c3 != 'Q') {
                                if (c3 != 'V') {
                                    if (c3 != 'a') {
                                        if (c3 != 'c') {
                                            if (c3 != 'h') {
                                                if (c3 != 'q') {
                                                    if (c3 != 'v') {
                                                        if (c3 != 'L') {
                                                            if (c3 != 'M') {
                                                                if (c3 != 'S') {
                                                                    if (c3 != 'T') {
                                                                        if (c3 != 'l') {
                                                                            if (c3 != 'm') {
                                                                                if (c3 != 's') {
                                                                                    if (c3 != 't') {
                                                                                        fArr = fArr3;
                                                                                        i2 = i7;
                                                                                    } else {
                                                                                        if (c2 != 'q' && c2 != 't' && c2 != 'Q' && c2 != 'T') {
                                                                                            f10 = 0.0f;
                                                                                            f9 = 0.0f;
                                                                                        } else {
                                                                                            f9 = f19 - f13;
                                                                                            f10 = f20 - f14;
                                                                                        }
                                                                                        int i8 = i7 + 1;
                                                                                        path2.rQuadTo(f9, f10, fArr3[i7], fArr3[i8]);
                                                                                        float f21 = f9 + f19;
                                                                                        float f22 = f10 + f20;
                                                                                        float f23 = f19 + fArr3[i7];
                                                                                        f20 += fArr3[i8];
                                                                                        f14 = f22;
                                                                                        fArr = fArr3;
                                                                                        i2 = i7;
                                                                                        m08Var = m08Var3;
                                                                                        f2 = f23;
                                                                                        f13 = f21;
                                                                                        f = f20;
                                                                                    }
                                                                                } else {
                                                                                    if (c2 != 'c' && c2 != 's' && c2 != 'C' && c2 != 'S') {
                                                                                        f8 = 0.0f;
                                                                                        f7 = 0.0f;
                                                                                    } else {
                                                                                        f7 = f20 - f14;
                                                                                        f8 = f19 - f13;
                                                                                    }
                                                                                    int i9 = i7;
                                                                                    int i10 = i9 + 1;
                                                                                    int i11 = i9 + 2;
                                                                                    int i12 = i9 + 3;
                                                                                    fArr = fArr3;
                                                                                    i2 = i9;
                                                                                    path2.rCubicTo(f8, f7, fArr3[i9], fArr3[i10], fArr3[i11], fArr3[i12]);
                                                                                    f3 = fArr[i2] + f19;
                                                                                    f4 = fArr[i10] + f20;
                                                                                    f19 += fArr[i11];
                                                                                    f5 = fArr[i12];
                                                                                }
                                                                            } else {
                                                                                fArr = fArr3;
                                                                                i2 = i7;
                                                                                float f24 = fArr[i2];
                                                                                f19 += f24;
                                                                                float f25 = fArr[i2 + 1];
                                                                                f20 += f25;
                                                                                if (i2 > 0) {
                                                                                    path2.rLineTo(f24, f25);
                                                                                } else {
                                                                                    path2.rMoveTo(f24, f25);
                                                                                    m08Var = m08Var3;
                                                                                    f2 = f19;
                                                                                    f17 = f2;
                                                                                    f = f20;
                                                                                    f18 = f;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            fArr = fArr3;
                                                                            i2 = i7;
                                                                            int i13 = i2 + 1;
                                                                            path2.rLineTo(fArr[i2], fArr[i13]);
                                                                            f19 += fArr[i2];
                                                                            f6 = fArr[i13];
                                                                        }
                                                                    } else {
                                                                        fArr = fArr3;
                                                                        i2 = i7;
                                                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                                            f19 = (f19 * 2.0f) - f13;
                                                                            f20 = (f20 * 2.0f) - f14;
                                                                        }
                                                                        int i14 = i2 + 1;
                                                                        path2.quadTo(f19, f20, fArr[i2], fArr[i14]);
                                                                        f2 = fArr[i2];
                                                                        f = fArr[i14];
                                                                        m08Var = m08Var3;
                                                                        f13 = f19;
                                                                        f14 = f20;
                                                                    }
                                                                    i3 = i5;
                                                                    c = c3;
                                                                } else {
                                                                    fArr = fArr3;
                                                                    i2 = i7;
                                                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                                                        f19 = (f19 * 2.0f) - f13;
                                                                        f20 = (f20 * 2.0f) - f14;
                                                                    }
                                                                    float f26 = f19;
                                                                    float f27 = f20;
                                                                    int i15 = i2 + 1;
                                                                    int i16 = i2 + 2;
                                                                    int i17 = i2 + 3;
                                                                    path2.cubicTo(f26, f27, fArr[i2], fArr[i15], fArr[i16], fArr[i17]);
                                                                    float f28 = fArr[i2];
                                                                    f13 = f28;
                                                                    f14 = fArr[i15];
                                                                    f2 = fArr[i16];
                                                                    f = fArr[i17];
                                                                }
                                                            } else {
                                                                fArr = fArr3;
                                                                i2 = i7;
                                                                f2 = fArr[i2];
                                                                f = fArr[i2 + 1];
                                                                if (i2 > 0) {
                                                                    path2.lineTo(f2, f);
                                                                } else {
                                                                    path2.moveTo(f2, f);
                                                                    f17 = f2;
                                                                    f18 = f;
                                                                }
                                                            }
                                                        } else {
                                                            fArr = fArr3;
                                                            i2 = i7;
                                                            int i18 = i2 + 1;
                                                            path2.lineTo(fArr[i2], fArr[i18]);
                                                            f2 = fArr[i2];
                                                            f = fArr[i18];
                                                        }
                                                        i3 = i5;
                                                        m08Var = m08Var3;
                                                        c = c3;
                                                    } else {
                                                        fArr = fArr3;
                                                        i2 = i7;
                                                        path2.rLineTo(0.0f, fArr[i2]);
                                                        f6 = fArr[i2];
                                                    }
                                                    f20 += f6;
                                                } else {
                                                    fArr = fArr3;
                                                    i2 = i7;
                                                    int i19 = i2 + 1;
                                                    int i20 = i2 + 2;
                                                    int i21 = i2 + 3;
                                                    path2.rQuadTo(fArr[i2], fArr[i19], fArr[i20], fArr[i21]);
                                                    f3 = fArr[i2] + f19;
                                                    f4 = fArr[i19] + f20;
                                                    f19 += fArr[i20];
                                                    f5 = fArr[i21];
                                                }
                                                f20 += f5;
                                                f13 = f3;
                                                f14 = f4;
                                            } else {
                                                fArr = fArr3;
                                                i2 = i7;
                                                path2.rLineTo(fArr[i2], 0.0f);
                                                f19 += fArr[i2];
                                            }
                                        } else {
                                            fArr = fArr3;
                                            i2 = i7;
                                            int i22 = i2 + 2;
                                            int i23 = i2 + 3;
                                            int i24 = i2 + 4;
                                            int i25 = i2 + 5;
                                            path2.rCubicTo(fArr[i2], fArr[i2 + 1], fArr[i22], fArr[i23], fArr[i24], fArr[i25]);
                                            float f29 = fArr[i22] + f19;
                                            float f30 = fArr[i23] + f20;
                                            f19 += fArr[i24];
                                            f20 += fArr[i25];
                                            f13 = f29;
                                            f14 = f30;
                                        }
                                        m08Var = m08Var3;
                                        f2 = f19;
                                        f = f20;
                                        i3 = i5;
                                        c = c3;
                                    } else {
                                        fArr = fArr3;
                                        i2 = i7;
                                        int i26 = i2 + 5;
                                        float f31 = fArr[i26] + f19;
                                        int i27 = i2 + 6;
                                        float f32 = fArr[i27] + f20;
                                        float f33 = fArr[i2];
                                        float f34 = fArr[i2 + 1];
                                        float f35 = fArr[i2 + 2];
                                        if (fArr[i2 + 3] != 0.0f) {
                                            m08Var2 = m08Var3;
                                            z3 = 1;
                                        } else {
                                            m08Var2 = m08Var3;
                                            z3 = i6;
                                        }
                                        m08Var = m08Var2;
                                        float f36 = f19;
                                        c = c3;
                                        if (fArr[i2 + 4] != 0.0f) {
                                            z4 = 1;
                                        } else {
                                            z4 = i6;
                                        }
                                        float f37 = f20;
                                        i3 = i5;
                                        m08.a(path, f36, f37, f31, f32, f33, f34, f35, z3, z4);
                                        f2 = f36 + fArr[i26];
                                        f = f37 + fArr[i27];
                                        f13 = f2;
                                        f14 = f;
                                    }
                                } else {
                                    fArr = fArr3;
                                    i2 = i7;
                                    i3 = i5;
                                    m08Var = m08Var3;
                                    f2 = f19;
                                    c = c3;
                                    path2.lineTo(f2, fArr[i2]);
                                    f = fArr[i2];
                                }
                            } else {
                                fArr = fArr3;
                                i2 = i7;
                                i3 = i5;
                                m08Var = m08Var3;
                                c = c3;
                                int i28 = i2 + 1;
                                int i29 = i2 + 2;
                                int i30 = i2 + 3;
                                path2.quadTo(fArr[i2], fArr[i28], fArr[i29], fArr[i30]);
                                float f38 = fArr[i2];
                                float f39 = fArr[i28];
                                float f40 = fArr[i29];
                                float f41 = fArr[i30];
                                f13 = f38;
                                f14 = f39;
                                f2 = f40;
                                f = f41;
                            }
                        } else {
                            fArr = fArr3;
                            i2 = i7;
                            m08Var = m08Var3;
                            c = c3;
                            f = f20;
                            i3 = i5;
                            path2.lineTo(fArr[i2], f);
                            f2 = fArr[i2];
                        }
                    } else {
                        fArr = fArr3;
                        i2 = i7;
                        i3 = i5;
                        m08Var = m08Var3;
                        c = c3;
                        int i31 = i2 + 2;
                        int i32 = i2 + 3;
                        int i33 = i2 + 4;
                        int i34 = i2 + 5;
                        path2.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i31], fArr[i32], fArr[i33], fArr[i34]);
                        float f42 = fArr[i33];
                        float f43 = fArr[i34];
                        f13 = fArr[i31];
                        f14 = fArr[i32];
                        f = f43;
                        f2 = f42;
                    }
                } else {
                    fArr = fArr3;
                    i2 = i7;
                    m08Var = m08Var3;
                    float f44 = f19;
                    float f45 = f20;
                    i3 = i5;
                    c = c3;
                    int i35 = i2 + 5;
                    float f46 = fArr[i35];
                    int i36 = i2 + 6;
                    float f47 = fArr[i36];
                    float f48 = fArr[i2];
                    float f49 = fArr[i2 + 1];
                    float f50 = fArr[i2 + 2];
                    if (fArr[i2 + 3] != 0.0f) {
                        z = 1;
                    } else {
                        z = i6;
                    }
                    if (fArr[i2 + 4] != 0.0f) {
                        z2 = 1;
                    } else {
                        z2 = i6;
                    }
                    m08.a(path, f44, f45, f46, f47, f48, f49, f50, z, z2);
                    f13 = fArr[i35];
                    f = fArr[i36];
                    f14 = f;
                    f2 = f13;
                }
                i7 = i2 + i;
                path2 = path;
                m08Var3 = m08Var;
                c3 = c;
                i5 = i3;
                f19 = f2;
                f20 = f;
                c2 = c3;
                fArr3 = fArr;
            }
            fArr2[i6] = f19;
            fArr2[1] = f20;
            fArr2[2] = f13;
            fArr2[3] = f14;
            fArr2[4] = f17;
            fArr2[5] = f18;
            c2 = m08Var3.a;
            i5++;
            m08VarArr2 = m08VarArr;
            path2 = path;
            i4 = i6;
        }
    }
}
