package e9;

import j$.util.Objects;
import java.util.Arrays;
public final class f1 extends k0 {
    public static final f1 h = new f1(null, new Object[0], 0);
    public final transient Object d;
    public final transient Object[] f8970e;
    public final transient int f8971f;

    public f1(Object obj, Object[] objArr, int i10) {
        this.d = obj;
        this.f8970e = objArr;
        this.f8971f = i10;
    }

    public static Object f(Object[] objArr, int i10, int i11, int i12) {
        j0 j0Var = null;
        int i13 = 1;
        if (i10 == 1) {
            Objects.requireNonNull(objArr[i12]);
            Objects.requireNonNull(objArr[i12 ^ 1]);
            return null;
        }
        int i14 = i11 - 1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = (i16 * 2) + i12;
                int i18 = (i15 * 2) + i12;
                Object obj = objArr[i17];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i17 ^ 1];
                Objects.requireNonNull(obj2);
                int s10 = q.s(obj.hashCode());
                while (true) {
                    int i19 = s10 & i14;
                    int i20 = bArr[i19] & 255;
                    if (i20 == 255) {
                        bArr[i19] = (byte) i18;
                        if (i15 < i16) {
                            objArr[i18] = obj;
                            objArr[i18 ^ 1] = obj2;
                        }
                        i15++;
                    } else if (obj.equals(objArr[i20])) {
                        int i21 = i20 ^ 1;
                        Object obj3 = objArr[i21];
                        Objects.requireNonNull(obj3);
                        j0Var = new j0(obj, obj2, obj3);
                        objArr[i21] = obj2;
                        break;
                    } else {
                        s10 = i19 + 1;
                    }
                }
            }
            if (i15 == i10) {
                return bArr;
            }
            return new Object[]{bArr, Integer.valueOf(i15), j0Var};
        } else if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i22 = 0;
            for (int i23 = 0; i23 < i10; i23++) {
                int i24 = (i23 * 2) + i12;
                int i25 = (i22 * 2) + i12;
                Object obj4 = objArr[i24];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i24 ^ 1];
                Objects.requireNonNull(obj5);
                int s11 = q.s(obj4.hashCode());
                while (true) {
                    int i26 = s11 & i14;
                    int i27 = sArr[i26] & 65535;
                    if (i27 == 65535) {
                        sArr[i26] = (short) i25;
                        if (i22 < i23) {
                            objArr[i25] = obj4;
                            objArr[i25 ^ 1] = obj5;
                        }
                        i22++;
                    } else if (obj4.equals(objArr[i27])) {
                        int i28 = i27 ^ 1;
                        Object obj6 = objArr[i28];
                        Objects.requireNonNull(obj6);
                        j0Var = new j0(obj4, obj5, obj6);
                        objArr[i28] = obj5;
                        break;
                    } else {
                        s11 = i26 + 1;
                    }
                }
            }
            if (i22 == i10) {
                return sArr;
            }
            return new Object[]{sArr, Integer.valueOf(i22), j0Var};
        } else {
            int[] iArr = new int[i11];
            Arrays.fill(iArr, -1);
            int i29 = 0;
            int i30 = 0;
            while (i29 < i10) {
                int i31 = (i29 * 2) + i12;
                int i32 = (i30 * 2) + i12;
                Object obj7 = objArr[i31];
                Objects.requireNonNull(obj7);
                Object obj8 = objArr[i31 ^ i13];
                Objects.requireNonNull(obj8);
                int s12 = q.s(obj7.hashCode());
                while (true) {
                    int i33 = s12 & i14;
                    int i34 = iArr[i33];
                    if (i34 == -1) {
                        iArr[i33] = i32;
                        if (i30 < i29) {
                            objArr[i32] = obj7;
                            objArr[i32 ^ 1] = obj8;
                        }
                        i30++;
                    } else if (obj7.equals(objArr[i34])) {
                        int i35 = i34 ^ 1;
                        Object obj9 = objArr[i35];
                        Objects.requireNonNull(obj9);
                        j0Var = new j0(obj7, obj8, obj9);
                        objArr[i35] = obj8;
                        break;
                    } else {
                        s12 = i33 + 1;
                    }
                }
                i29++;
                i13 = 1;
            }
            if (i30 == i10) {
                return iArr;
            }
            return new Object[]{iArr, Integer.valueOf(i30), j0Var};
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
        return new c1(this, this.f8970e, 0, this.f8971f);
    }

    @Override
    public final d1 c() {
        return new d1(this, new e1(0, this.f8971f, this.f8970e));
    }

    @Override
    public final d0 d() {
        return new e1(1, this.f8971f, this.f8970e);
    }

    @Override
    public final Object get(Object obj) {
        Object g10 = g(this.d, this.f8970e, this.f8971f, 0, obj);
        if (g10 == null) {
            return null;
        }
        return g10;
    }

    @Override
    public final int size() {
        return this.f8971f;
    }
}
