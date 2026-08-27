package e7;

import com.google.android.gms.internal.cast.i0;
import g7.s6;
import g7.u6;
import j$.util.Objects;
import java.util.Arrays;

public final class l extends i0 {

    public static final l f5332n = new l(null, new Object[0], 0);

    public final transient Object f5333e;

    public final transient Object[] f5334f;
    public final transient int h;

    public l(Object obj, Object[] objArr, int i10) {
        super(2);
        this.f5333e = obj;
        this.f5334f = objArr;
        this.h = i10;
    }

    public static l b(int i10, Object[] objArr, b6.a aVar) {
        int iHighestOneBit;
        char c10;
        char c11;
        char c12;
        ?? r10;
        short[] sArr;
        boolean z10;
        ?? r11;
        Object[] objArr2;
        e eVar;
        int i11 = i10;
        Object[] objArrCopyOf = objArr;
        if (i11 == 0) {
            return f5332n;
        }
        e eVar2 = null;
        ?? r12 = 0;
        e eVar3 = null;
        e eVar4 = null;
        int i12 = 1;
        if (i11 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new l(null, objArrCopyOf, 1);
        }
        s6.b(i11, objArrCopyOf.length >> 1);
        int iMax = Math.max(i11, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i11 != 1) {
            int i13 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i14 = 0;
                int i15 = 0;
                while (i14 < i11) {
                    int i16 = i15 + i15;
                    int i17 = i14 + i14;
                    Object obj = objArrCopyOf[i17];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i17 ^ i12];
                    Objects.requireNonNull(obj2);
                    int iA = u6.a(obj.hashCode());
                    while (true) {
                        int i18 = iA & i13;
                        int i19 = bArr[i18] & 255;
                        if (i19 == 255) {
                            bArr[i18] = (byte) i16;
                            if (i15 < i14) {
                                objArrCopyOf[i16] = obj;
                                objArrCopyOf[i16 ^ 1] = obj2;
                            }
                            i15++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i19 == true ? 1 : 0])) {
                            int i20 = ~i19;
                            Object obj3 = objArrCopyOf[i20 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            e eVar5 = new e(obj, obj2, obj3);
                            objArrCopyOf[i20 == true ? 1 : 0] = obj2;
                            eVar3 = eVar5;
                            break;
                        }
                        iA = i18 + 1;
                    }
                    i14++;
                    i12 = 1;
                }
                c10 = 0;
                c11 = 1;
                if (i15 == i11) {
                    r12 = bArr;
                } else {
                    sArr = new Object[]{bArr, Integer.valueOf(i15), eVar3};
                }
            } else {
                c10 = 0;
                c11 = 1;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i21 = 0;
                    for (int i22 = 0; i22 < i11; i22++) {
                        int i23 = i21 + i21;
                        int i24 = i22 + i22;
                        Object obj4 = objArrCopyOf[i24];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i24 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iA2 = u6.a(obj4.hashCode());
                        while (true) {
                            int i25 = iA2 & i13;
                            char c13 = (char) sArr[i25];
                            if (c13 == 65535) {
                                sArr[i25] = (short) i23;
                                if (i21 < i22) {
                                    objArrCopyOf[i23] = obj4;
                                    objArrCopyOf[i23 ^ 1] = obj5;
                                }
                                i21++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[c13])) {
                                int i26 = c13 ^ 1;
                                Object obj6 = objArrCopyOf[i26 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                e eVar6 = new e(obj4, obj5, obj6);
                                objArrCopyOf[i26 == true ? 1 : 0] = obj5;
                                eVar4 = eVar6;
                                break;
                            }
                            iA2 = i25 + 1;
                        }
                    }
                    r12 = i21 == i11 ? sArr : new Object[]{sArr, Integer.valueOf(i21), eVar4};
                } else {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i27 = 0;
                    for (int i28 = 0; i28 < i11; i28++) {
                        int i29 = i27 + i27;
                        int i30 = i28 + i28;
                        Object obj7 = objArrCopyOf[i30];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i30 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iA3 = u6.a(obj7.hashCode());
                        while (true) {
                            int i31 = iA3 & i13;
                            int i32 = iArr[i31];
                            if (i32 == -1) {
                                iArr[i31] = i29;
                                if (i27 < i28) {
                                    objArrCopyOf[i29] = obj7;
                                    objArrCopyOf[i29 ^ 1] = obj8;
                                }
                                i27++;
                                break;
                            }
                            if (obj7.equals(objArrCopyOf[i32])) {
                                int i33 = i32 ^ 1;
                                Object obj9 = objArrCopyOf[i33];
                                Objects.requireNonNull(obj9);
                                e eVar7 = new e(obj7, obj8, obj9);
                                objArrCopyOf[i33] = obj8;
                                eVar2 = eVar7;
                                break;
                            }
                            iA3 = i31 + 1;
                        }
                    }
                    c12 = 2;
                    r10 = i27 == i11 ? iArr : new Object[]{iArr, Integer.valueOf(i27), eVar2};
                }
            }
            z10 = r10 instanceof Object[];
            r11 = r10;
            if (z10) {
                objArr2 = (Object[]) r10;
                eVar = (e) objArr2[c12];
                if (aVar != null) {
                    throw eVar.a();
                }
                aVar.d = eVar;
                Object obj10 = objArr2[c10];
                int iIntValue = ((Integer) objArr2[c11]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r11 = obj10;
                i11 = iIntValue;
            }
            return new l(r11, objArrCopyOf, i11);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        i11 = 1;
        c10 = 0;
        c11 = 1;
        c12 = 2;
        r10 = r12;
        z10 = r10 instanceof Object[];
        r11 = r10;
        if (z10) {
            objArr2 = (Object[]) r10;
            eVar = (e) objArr2[c12];
            if (aVar != null) {
                throw eVar.a();
            }
            aVar.d = eVar;
            Object obj11 = objArr2[c10];
            int iIntValue2 = ((Integer) objArr2[c11]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r11 = obj11;
            i11 = iIntValue2;
        }
        return new l(r11, objArrCopyOf, i11);
    }

    @Override
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i10 = this.h;
            Object[] objArr = this.f5334f;
            if (i10 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f5333e;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iA = u6.a(obj.hashCode());
                    while (true) {
                        int i11 = iA & length;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            obj2 = objArr[i12 ^ 1];
                        } else {
                            iA = i11 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iA2 = u6.a(obj.hashCode());
                    while (true) {
                        int i13 = iA2 & length2;
                        char c10 = (char) sArr[i13];
                        if (c10 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c10])) {
                            obj2 = objArr[c10 ^ 1];
                        } else {
                            iA2 = i13 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iA3 = u6.a(obj.hashCode());
                    while (true) {
                        int i14 = iA3 & length3;
                        int i15 = iArr[i14];
                        if (i15 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            obj2 = objArr[i15 ^ 1];
                        } else {
                            iA3 = i14 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override
    public final int size() {
        return this.h;
    }
}
