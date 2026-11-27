package defpackage;

import j$.util.Objects;
import java.util.Arrays;
public final class o99 extends to5 {
    public static final o99 h = new o99(null, new Object[0], 0);
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;

    public o99(Object obj, Object[] objArr, int i) {
        this.d = obj;
        this.e = objArr;
        this.f = i;
    }

    public static o99 g(int i, Object[] objArr, lp lpVar) {
        if (i == 0) {
            return h;
        }
        if (i == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new o99(null, objArr, 1);
        }
        yve.m(i, objArr.length >> 1);
        Object h2 = h(objArr, i, bp5.o(i), 0);
        if (h2 instanceof Object[]) {
            Object[] objArr2 = (Object[]) h2;
            so5 so5Var = (so5) objArr2[2];
            if (lpVar != null) {
                lpVar.d = so5Var;
                Object obj = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue << 1);
                h2 = obj;
                i = intValue;
            } else {
                throw so5Var.a();
            }
        }
        return new o99(h2, objArr, i);
    }

    public static Object h(Object[] objArr, int i, int i2, int i3) {
        int i4;
        so5 so5Var = null;
        int i5 = 1;
        if (i == 1) {
            Objects.requireNonNull(objArr[i3]);
            Objects.requireNonNull(objArr[i3 ^ 1]);
            return null;
        }
        int i6 = i2 - 1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i7 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = (i8 << 1) + i3;
                int i10 = (i7 << 1) + i3;
                Object obj = objArr[i9];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i9 ^ 1];
                Objects.requireNonNull(obj2);
                int a = yne.a(obj.hashCode());
                while (true) {
                    int i11 = a & i6;
                    int i12 = bArr[i11] & 255;
                    if (i12 == 255) {
                        bArr[i11] = (byte) i10;
                        if (i7 < i8) {
                            objArr[i10] = obj;
                            objArr[i10 ^ 1] = obj2;
                        }
                        i7++;
                    } else if (obj.equals(objArr[i12])) {
                        int i13 = i12 ^ 1;
                        Object obj3 = objArr[i13];
                        Objects.requireNonNull(obj3);
                        so5Var = new so5(obj, obj2, obj3);
                        objArr[i13] = obj2;
                        break;
                    } else {
                        a = i11 + 1;
                    }
                }
            }
            if (i7 == i) {
                return bArr;
            }
            return new Object[]{bArr, Integer.valueOf(i7), so5Var};
        } else if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i14 = 0;
            for (int i15 = 0; i15 < i; i15++) {
                int i16 = (i15 << 1) + i3;
                int i17 = (i14 << 1) + i3;
                Object obj4 = objArr[i16];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i16 ^ 1];
                Objects.requireNonNull(obj5);
                int a2 = yne.a(obj4.hashCode());
                while (true) {
                    int i18 = a2 & i6;
                    int i19 = sArr[i18] & 65535;
                    if (i19 == 65535) {
                        sArr[i18] = (short) i17;
                        if (i14 < i15) {
                            objArr[i17] = obj4;
                            objArr[i17 ^ 1] = obj5;
                        }
                        i14++;
                    } else if (obj4.equals(objArr[i19])) {
                        int i20 = i19 ^ 1;
                        Object obj6 = objArr[i20];
                        Objects.requireNonNull(obj6);
                        so5Var = new so5(obj4, obj5, obj6);
                        objArr[i20] = obj5;
                        break;
                    } else {
                        a2 = i18 + 1;
                    }
                }
            }
            if (i14 == i) {
                return sArr;
            }
            return new Object[]{sArr, Integer.valueOf(i14), so5Var};
        } else {
            int[] iArr = new int[i2];
            Arrays.fill(iArr, -1);
            int i21 = 0;
            int i22 = 0;
            while (i21 < i) {
                int i23 = (i21 << 1) + i3;
                int i24 = (i22 << 1) + i3;
                Object obj7 = objArr[i23];
                Objects.requireNonNull(obj7);
                Object obj8 = objArr[i23 ^ i5];
                Objects.requireNonNull(obj8);
                int a3 = yne.a(obj7.hashCode());
                while (true) {
                    int i25 = a3 & i6;
                    int i26 = iArr[i25];
                    if (i26 == -1) {
                        iArr[i25] = i24;
                        if (i22 < i21) {
                            objArr[i24] = obj7;
                            objArr[i24 ^ 1] = obj8;
                        }
                        i22++;
                        i4 = i5;
                    } else {
                        i4 = i5;
                        if (obj7.equals(objArr[i26])) {
                            int i27 = i26 ^ 1;
                            Object obj9 = objArr[i27];
                            Objects.requireNonNull(obj9);
                            so5Var = new so5(obj7, obj8, obj9);
                            objArr[i27] = obj8;
                            break;
                        }
                        a3 = i25 + 1;
                        i5 = i4;
                    }
                }
                i21++;
                i5 = i4;
            }
            int i28 = i5;
            if (i22 == i) {
                return iArr;
            }
            Integer valueOf = Integer.valueOf(i22);
            Object[] objArr2 = new Object[3];
            objArr2[0] = iArr;
            objArr2[i28] = valueOf;
            objArr2[2] = so5Var;
            return objArr2;
        }
    }

    public static Object i(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 != null) {
            if (i == 1) {
                Object obj3 = objArr[i2];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj2)) {
                    Object obj4 = objArr[i2 ^ 1];
                    Objects.requireNonNull(obj4);
                    return obj4;
                }
                return null;
            } else if (obj != null) {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length - 1;
                    int a = yne.a(obj2.hashCode());
                    while (true) {
                        int i3 = a & length;
                        int i4 = bArr[i3] & 255;
                        if (i4 != 255) {
                            if (obj2.equals(objArr[i4])) {
                                return objArr[i4 ^ 1];
                            }
                            a = i3 + 1;
                        } else {
                            return null;
                        }
                    }
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    int length2 = sArr.length - 1;
                    int a2 = yne.a(obj2.hashCode());
                    while (true) {
                        int i5 = a2 & length2;
                        int i6 = sArr[i5] & 65535;
                        if (i6 != 65535) {
                            if (obj2.equals(objArr[i6])) {
                                return objArr[i6 ^ 1];
                            }
                            a2 = i5 + 1;
                        } else {
                            return null;
                        }
                    }
                } else {
                    int[] iArr = (int[]) obj;
                    int length3 = iArr.length - 1;
                    int a3 = yne.a(obj2.hashCode());
                    while (true) {
                        int i7 = a3 & length3;
                        int i8 = iArr[i7];
                        if (i8 == -1) {
                            return null;
                        }
                        if (obj2.equals(objArr[i8])) {
                            return objArr[i8 ^ 1];
                        }
                        a3 = i7 + 1;
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
    public final l99 c() {
        return new l99(this, this.e, 0, this.f);
    }

    @Override
    public final m99 d() {
        return new m99(this, new n99(0, this.f, this.e));
    }

    @Override
    public final jo5 e() {
        return new n99(1, this.f, this.e);
    }

    @Override
    public final Object get(Object obj) {
        Object i = i(this.d, this.e, this.f, 0, obj);
        if (i == null) {
            return null;
        }
        return i;
    }

    @Override
    public final int size() {
        return this.f;
    }
}
