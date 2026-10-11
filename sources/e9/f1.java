package e9;

import j$.util.Objects;
import java.util.Arrays;
public final class f1 extends k0 {
    public static final f1 h = new f1(null, new Object[0], 0);
    public final transient Object d;
    public final transient Object[] f8736e;
    public final transient int f8737f;

    public f1(Object obj, Object[] objArr, int i10) {
        this.d = obj;
        this.f8736e = objArr;
        this.f8737f = i10;
    }

    public static Object f(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        j0 j0Var = null;
        int i14 = 1;
        if (i10 == 1) {
            Objects.requireNonNull(objArr[i12]);
            Objects.requireNonNull(objArr[i12 ^ 1]);
            return null;
        }
        int i15 = i11 - 1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i16 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                int i18 = (i17 * 2) + i12;
                int i19 = (i16 * 2) + i12;
                Object obj = objArr[i18];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i18 ^ 1];
                Objects.requireNonNull(obj2);
                int s10 = q.s(obj.hashCode());
                while (true) {
                    int i20 = s10 & i15;
                    int i21 = bArr[i20] & 255;
                    if (i21 == 255) {
                        bArr[i20] = (byte) i19;
                        if (i16 < i17) {
                            objArr[i19] = obj;
                            objArr[i19 ^ 1] = obj2;
                        }
                        i16++;
                    } else if (obj.equals(objArr[i21])) {
                        int i22 = i21 ^ 1;
                        Object obj3 = objArr[i22];
                        Objects.requireNonNull(obj3);
                        j0Var = new j0(obj, obj2, obj3);
                        objArr[i22] = obj2;
                        break;
                    } else {
                        s10 = i20 + 1;
                    }
                }
            }
            if (i16 == i10) {
                return bArr;
            }
            return new Object[]{bArr, Integer.valueOf(i16), j0Var};
        } else if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i23 = 0;
            for (int i24 = 0; i24 < i10; i24++) {
                int i25 = (i24 * 2) + i12;
                int i26 = (i23 * 2) + i12;
                Object obj4 = objArr[i25];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i25 ^ 1];
                Objects.requireNonNull(obj5);
                int s11 = q.s(obj4.hashCode());
                while (true) {
                    int i27 = s11 & i15;
                    int i28 = sArr[i27] & 65535;
                    if (i28 == 65535) {
                        sArr[i27] = (short) i26;
                        if (i23 < i24) {
                            objArr[i26] = obj4;
                            objArr[i26 ^ 1] = obj5;
                        }
                        i23++;
                    } else if (obj4.equals(objArr[i28])) {
                        int i29 = i28 ^ 1;
                        Object obj6 = objArr[i29];
                        Objects.requireNonNull(obj6);
                        j0Var = new j0(obj4, obj5, obj6);
                        objArr[i29] = obj5;
                        break;
                    } else {
                        s11 = i27 + 1;
                    }
                }
            }
            if (i23 == i10) {
                return sArr;
            }
            return new Object[]{sArr, Integer.valueOf(i23), j0Var};
        } else {
            int[] iArr = new int[i11];
            Arrays.fill(iArr, -1);
            int i30 = 0;
            int i31 = 0;
            while (i30 < i10) {
                int i32 = (i30 * 2) + i12;
                int i33 = (i31 * 2) + i12;
                Object obj7 = objArr[i32];
                Objects.requireNonNull(obj7);
                Object obj8 = objArr[i32 ^ i14];
                Objects.requireNonNull(obj8);
                int s12 = q.s(obj7.hashCode());
                while (true) {
                    int i34 = s12 & i15;
                    int i35 = iArr[i34];
                    if (i35 == -1) {
                        iArr[i34] = i33;
                        if (i31 < i30) {
                            objArr[i33] = obj7;
                            objArr[i33 ^ 1] = obj8;
                        }
                        i31++;
                        i13 = i14;
                    } else {
                        i13 = i14;
                        if (obj7.equals(objArr[i35])) {
                            int i36 = i35 ^ 1;
                            Object obj9 = objArr[i36];
                            Objects.requireNonNull(obj9);
                            j0Var = new j0(obj7, obj8, obj9);
                            objArr[i36] = obj8;
                            break;
                        }
                        s12 = i34 + 1;
                        i14 = i13;
                    }
                }
                i30++;
                i14 = i13;
            }
            int i37 = i14;
            if (i31 == i10) {
                return iArr;
            }
            Integer valueOf = Integer.valueOf(i31);
            Object[] objArr2 = new Object[3];
            objArr2[0] = iArr;
            objArr2[i37] = valueOf;
            objArr2[2] = j0Var;
            return objArr2;
        }
    }

    public static Object g(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 != null) {
            if (i10 == 1) {
                Object obj3 = objArr[i11];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj2)) {
                    Object obj4 = objArr[i11 ^ 1];
                    Objects.requireNonNull(obj4);
                    return obj4;
                }
                return null;
            } else if (obj != null) {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length - 1;
                    int s10 = q.s(obj2.hashCode());
                    while (true) {
                        int i12 = s10 & length;
                        int i13 = bArr[i12] & 255;
                        if (i13 != 255) {
                            if (obj2.equals(objArr[i13])) {
                                return objArr[i13 ^ 1];
                            }
                            s10 = i12 + 1;
                        } else {
                            return null;
                        }
                    }
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    int length2 = sArr.length - 1;
                    int s11 = q.s(obj2.hashCode());
                    while (true) {
                        int i14 = s11 & length2;
                        int i15 = sArr[i14] & 65535;
                        if (i15 != 65535) {
                            if (obj2.equals(objArr[i15])) {
                                return objArr[i15 ^ 1];
                            }
                            s11 = i14 + 1;
                        } else {
                            return null;
                        }
                    }
                } else {
                    int[] iArr = (int[]) obj;
                    int length3 = iArr.length - 1;
                    int s12 = q.s(obj2.hashCode());
                    while (true) {
                        int i16 = s12 & length3;
                        int i17 = iArr[i16];
                        if (i17 == -1) {
                            return null;
                        }
                        if (obj2.equals(objArr[i17])) {
                            return objArr[i17 ^ 1];
                        }
                        s12 = i16 + 1;
                    }
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public final c1 b() {
        return new c1(this, this.f8736e, 0, this.f8737f);
    }

    @Override
    public final d1 c() {
        return new d1(this, new e1(0, this.f8737f, this.f8736e));
    }

    @Override
    public final d0 d() {
        return new e1(1, this.f8737f, this.f8736e);
    }

    @Override
    public final Object get(Object obj) {
        Object g10 = g(this.d, this.f8736e, this.f8737f, 0, obj);
        if (g10 == null) {
            return null;
        }
        return g10;
    }

    @Override
    public final int size() {
        return this.f8737f;
    }
}
