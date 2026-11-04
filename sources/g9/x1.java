package g9;

import b8.kg;
import b8.zb;
import j$.util.Objects;
import java.util.Arrays;
public final class x1 extends l0 {
    public static final x1 h = new x1(null, new Object[0], 0);
    public final transient Object d;
    public final transient Object[] f12168e;
    public final transient int f12169f;

    public x1(Object obj, Object[] objArr, int i3) {
        this.d = obj;
        this.f12168e = objArr;
        this.f12169f = i3;
    }

    public static x1 g(int i3, Object[] objArr, kg kgVar) {
        if (i3 == 0) {
            return h;
        }
        if (i3 == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new x1(null, objArr, 1);
        }
        zb.m(i3, objArr.length >> 1);
        Object h7 = h(objArr, i3, t0.o(i3), 0);
        if (h7 instanceof Object[]) {
            Object[] objArr2 = (Object[]) h7;
            k0 k0Var = (k0) objArr2[2];
            if (kgVar != null) {
                kgVar.d = k0Var;
                Object obj = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue * 2);
                h7 = obj;
                i3 = intValue;
            } else {
                throw k0Var.a();
            }
        }
        return new x1(h7, objArr, i3);
    }

    public static Object h(Object[] objArr, int i3, int i10, int i11) {
        int i12;
        k0 k0Var = null;
        int i13 = 1;
        if (i3 == 1) {
            Objects.requireNonNull(objArr[i11]);
            Objects.requireNonNull(objArr[i11 ^ 1]);
            return null;
        }
        int i14 = i10 - 1;
        if (i10 <= 128) {
            byte[] bArr = new byte[i10];
            Arrays.fill(bArr, (byte) -1);
            int i15 = 0;
            for (int i16 = 0; i16 < i3; i16++) {
                int i17 = (i16 * 2) + i11;
                int i18 = (i15 * 2) + i11;
                Object obj = objArr[i17];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i17 ^ 1];
                Objects.requireNonNull(obj2);
                int u10 = o.u(obj.hashCode());
                while (true) {
                    int i19 = u10 & i14;
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
                        k0Var = new k0(obj, obj2, obj3);
                        objArr[i21] = obj2;
                        break;
                    } else {
                        u10 = i19 + 1;
                    }
                }
            }
            if (i15 == i3) {
                return bArr;
            }
            return new Object[]{bArr, Integer.valueOf(i15), k0Var};
        } else if (i10 <= 32768) {
            short[] sArr = new short[i10];
            Arrays.fill(sArr, (short) -1);
            int i22 = 0;
            for (int i23 = 0; i23 < i3; i23++) {
                int i24 = (i23 * 2) + i11;
                int i25 = (i22 * 2) + i11;
                Object obj4 = objArr[i24];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i24 ^ 1];
                Objects.requireNonNull(obj5);
                int u11 = o.u(obj4.hashCode());
                while (true) {
                    int i26 = u11 & i14;
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
                        k0Var = new k0(obj4, obj5, obj6);
                        objArr[i28] = obj5;
                        break;
                    } else {
                        u11 = i26 + 1;
                    }
                }
            }
            if (i22 == i3) {
                return sArr;
            }
            return new Object[]{sArr, Integer.valueOf(i22), k0Var};
        } else {
            int[] iArr = new int[i10];
            Arrays.fill(iArr, -1);
            int i29 = 0;
            int i30 = 0;
            while (i29 < i3) {
                int i31 = (i29 * 2) + i11;
                int i32 = (i30 * 2) + i11;
                Object obj7 = objArr[i31];
                Objects.requireNonNull(obj7);
                Object obj8 = objArr[i31 ^ i13];
                Objects.requireNonNull(obj8);
                int u12 = o.u(obj7.hashCode());
                while (true) {
                    int i33 = u12 & i14;
                    int i34 = iArr[i33];
                    if (i34 == -1) {
                        iArr[i33] = i32;
                        if (i30 < i29) {
                            objArr[i32] = obj7;
                            objArr[i32 ^ 1] = obj8;
                        }
                        i30++;
                        i12 = i13;
                    } else {
                        i12 = i13;
                        if (obj7.equals(objArr[i34])) {
                            int i35 = i34 ^ 1;
                            Object obj9 = objArr[i35];
                            Objects.requireNonNull(obj9);
                            k0Var = new k0(obj7, obj8, obj9);
                            objArr[i35] = obj8;
                            break;
                        }
                        u12 = i33 + 1;
                        i13 = i12;
                    }
                }
                i29++;
                i13 = i12;
            }
            int i36 = i13;
            if (i30 == i3) {
                return iArr;
            }
            Integer valueOf = Integer.valueOf(i30);
            Object[] objArr2 = new Object[3];
            objArr2[0] = iArr;
            objArr2[i36] = valueOf;
            objArr2[2] = k0Var;
            return objArr2;
        }
    }

    public static Object i(Object obj, Object[] objArr, int i3, int i10, Object obj2) {
        if (obj2 != null) {
            if (i3 == 1) {
                Object obj3 = objArr[i10];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj2)) {
                    Object obj4 = objArr[i10 ^ 1];
                    Objects.requireNonNull(obj4);
                    return obj4;
                }
                return null;
            } else if (obj != null) {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length - 1;
                    int u10 = o.u(obj2.hashCode());
                    while (true) {
                        int i11 = u10 & length;
                        int i12 = bArr[i11] & 255;
                        if (i12 != 255) {
                            if (obj2.equals(objArr[i12])) {
                                return objArr[i12 ^ 1];
                            }
                            u10 = i11 + 1;
                        } else {
                            return null;
                        }
                    }
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    int length2 = sArr.length - 1;
                    int u11 = o.u(obj2.hashCode());
                    while (true) {
                        int i13 = u11 & length2;
                        int i14 = sArr[i13] & 65535;
                        if (i14 != 65535) {
                            if (obj2.equals(objArr[i14])) {
                                return objArr[i14 ^ 1];
                            }
                            u11 = i13 + 1;
                        } else {
                            return null;
                        }
                    }
                } else {
                    int[] iArr = (int[]) obj;
                    int length3 = iArr.length - 1;
                    int u12 = o.u(obj2.hashCode());
                    while (true) {
                        int i15 = u12 & length3;
                        int i16 = iArr[i15];
                        if (i16 == -1) {
                            return null;
                        }
                        if (obj2.equals(objArr[i16])) {
                            return objArr[i16 ^ 1];
                        }
                        u12 = i15 + 1;
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
    public final u1 c() {
        return new u1(this, this.f12168e, 0, this.f12169f);
    }

    @Override
    public final v1 d() {
        return new v1(this, new w1(0, this.f12169f, this.f12168e));
    }

    @Override
    public final d0 e() {
        return new w1(1, this.f12169f, this.f12168e);
    }

    @Override
    public final Object get(Object obj) {
        Object i3 = i(this.d, this.f12168e, this.f12169f, 0, obj);
        if (i3 == null) {
            return null;
        }
        return i3;
    }

    @Override
    public final int size() {
        return this.f12169f;
    }
}
