package hi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
public final class j7 implements ai.p {
    public final r7 f14736a;
    public final int f14737b;
    public final k7 f14738c;
    public final long d;
    public final long f14739e;
    public final long f14740f;

    public j7(r7 r7Var, int i7, k7 k7Var, long j3, long j10, long j11) {
        this.f14736a = r7Var;
        this.f14737b = i7;
        this.f14738c = k7Var;
        this.d = j3;
        this.f14739e = j10;
        this.f14740f = j11;
    }

    @Override
    public final void a(String str, int[] iArr, boolean z10) {
        int length;
        int i7;
        ArrayList arrayList;
        int length2;
        long j3;
        ?? r13;
        ArrayList arrayList2;
        int i10;
        int[] iArr2;
        int[] iArr3;
        boolean z11;
        boolean z12;
        int i11;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i12;
        float f10;
        float f11;
        float f12;
        int i13;
        int i14;
        float f13;
        float f14;
        char charAt;
        int[] iArr4;
        long j10;
        int[] iArr5;
        boolean z13;
        boolean z14;
        float f15;
        float f16;
        int[] iArr6;
        int i15;
        StringBuilder sb2;
        String str2;
        int i16;
        int i17;
        r7 r7Var = this.f14736a;
        if (!r7Var.h && this.f14737b == r7Var.f15305g) {
            r7Var.j();
            k7 k7Var = this.f14738c;
            if (str == null) {
                r7Var.f15319w = null;
                r7Var.f15313p = false;
                if (!r7Var.f15314q) {
                    r7Var.f15312o = false;
                    l7 l7Var = r7Var.f15317t;
                    if (l7Var != null) {
                        l7Var.p();
                        return;
                    }
                    return;
                }
                k7Var.f14783c = true;
                r7Var.f();
                return;
            }
            r7Var.f15314q = true;
            StringBuilder sb3 = new StringBuilder();
            if (iArr == null) {
                length = 0;
            } else {
                length = iArr.length;
            }
            int[] iArr7 = new int[length];
            int i18 = 0;
            int i19 = 0;
            int i20 = -1;
            while (true) {
                if (iArr != null) {
                    i7 = 2;
                    if (i18 + 3 >= iArr.length) {
                        break;
                    }
                    int i21 = i18 + 2;
                    StringBuilder sb4 = sb3;
                    long j11 = this.d;
                    long j12 = ((iArr[i21] + iArr[i15]) / 2) + j11;
                    int i22 = i18;
                    if (j12 >= this.f14739e && j12 < this.f14740f && iArr[i22] >= 0) {
                        int i23 = i22 + 1;
                        if (iArr[i23] <= str.length() && iArr[i22] < iArr[i23]) {
                            if (sb4.length() > 0) {
                                if (i20 == i22 - 4 && (i16 = iArr[i22 - 3]) <= (i17 = iArr[i22])) {
                                    str2 = str.substring(i16, i17);
                                } else {
                                    str2 = " ";
                                }
                                sb2 = sb4;
                                sb2.append(str2);
                            } else {
                                sb2 = sb4;
                            }
                            iArr7[i19] = sb2.length();
                            sb2.append((CharSequence) str, iArr[i22], iArr[i23]);
                            iArr7[i19 + 1] = sb2.length();
                            int i24 = i19 + 3;
                            iArr7[i19 + 2] = (int) (iArr[i21] + j11);
                            i19 += 4;
                            iArr7[i24] = (int) (j11 + iArr[i15]);
                            i20 = i22;
                            i18 = i22 + 4;
                            sb3 = sb2;
                        }
                    }
                    sb2 = sb4;
                    i18 = i22 + 4;
                    sb3 = sb2;
                } else {
                    i7 = 2;
                    break;
                }
            }
            k7Var.f14781a = sb3.toString();
            k7Var.f14782b = Arrays.copyOf(iArr7, i19);
            if (z10) {
                k7Var.f14783c = true;
                r7Var.f15319w = null;
                r7Var.f15313p = false;
            }
            ArrayList arrayList5 = r7Var.f15316s;
            StringBuilder sb5 = new StringBuilder();
            TreeMap treeMap = r7Var.f15306i;
            int i25 = 0;
            for (k7 k7Var2 : treeMap.values()) {
                int[] iArr8 = k7Var2.f14782b;
                if (iArr8 != null) {
                    i25 += iArr8.length;
                }
            }
            int[] iArr9 = new int[i25];
            int i26 = 0;
            for (k7 k7Var3 : treeMap.values()) {
                if (k7Var3.f14781a != null && (iArr6 = k7Var3.f14782b) != null && iArr6.length != 0) {
                    if (sb5.length() > 0) {
                        sb5.append(' ');
                    }
                    int length3 = sb5.length();
                    sb5.append(k7Var3.f14781a);
                    int i27 = 0;
                    while (true) {
                        int i28 = i27 + 3;
                        int[] iArr10 = k7Var3.f14782b;
                        if (i28 < iArr10.length) {
                            iArr9[i26] = length3 + iArr10[i27];
                            iArr9[i26 + 1] = length3 + iArr10[i27 + 1];
                            int i29 = i26 + 3;
                            iArr9[i26 + 2] = iArr10[i27 + 2];
                            i26 += 4;
                            iArr9[i29] = iArr10[i28];
                            i27 += 4;
                        }
                    }
                }
            }
            String sb6 = sb5.toString();
            if (i26 != i25) {
                iArr9 = Arrays.copyOf(iArr9, i26);
            }
            m7 m7Var = r7Var.f15318u;
            float f17 = r7Var.v;
            ArrayList arrayList6 = new ArrayList(arrayList5);
            arrayList5.clear();
            if (sb6 == null || iArr9 == null || (length2 = iArr9.length / 4) == 0) {
                arrayList = arrayList5;
            } else {
                float f18 = 0.0f;
                f17 = (m7Var == null || f17 <= 0.0f) ? 36.0f : 36.0f;
                float[] fArr = new float[length2 + 1];
                float[] fArr2 = new float[length2];
                int i30 = 0;
                while (i30 < length2) {
                    int i31 = i30 * 4;
                    int i32 = iArr9[i31];
                    int i33 = iArr9[i31 + 1];
                    if (i30 > 0) {
                        int i34 = iArr9[i31 - 3];
                        if (i34 >= i32) {
                            f16 = 0.0f;
                        } else if (m7Var != null) {
                            f16 = m7Var.m(sb6.subSequence(i34, i32));
                        } else {
                            f16 = i32 - i34;
                        }
                        fArr2[i30] = f16;
                    }
                    int i35 = i30 + 1;
                    float f19 = fArr[i30] + fArr2[i30];
                    if (m7Var != null) {
                        f15 = m7Var.m(sb6.subSequence(i32, i33));
                    } else {
                        f15 = i33 - i32;
                    }
                    fArr[i35] = f19 + f15;
                    i30 = i35;
                }
                ArrayList arrayList7 = new ArrayList();
                int i36 = 0;
                int i37 = 0;
                while (true) {
                    j3 = 700;
                    if (i37 >= length2) {
                        break;
                    }
                    float f20 = f18;
                    if (i37 != length2 - 1 && r7.d(iArr9, i37) <= 700) {
                        int i38 = i37 * 4;
                        CharSequence subSequence = sb6.subSequence(iArr9[i38], iArr9[i38 + 1]);
                        if (subSequence.length() != 0) {
                            char charAt2 = subSequence.charAt(subSequence.length() - 1);
                            if (charAt2 != '.' && charAt2 != '!' && charAt2 != '?' && charAt2 != 8230 && charAt2 != 12290 && charAt2 != 65281 && charAt2 != 65311 && charAt2 != 1748) {
                            }
                        }
                        i37++;
                        f18 = f20;
                    }
                    arrayList7.add(new int[]{i36, i37});
                    i36 = i37 + 1;
                    i37++;
                    f18 = f20;
                }
                float f21 = f18;
                int i39 = 0;
                while (i39 < arrayList7.size()) {
                    int[] iArr11 = (int[]) arrayList7.get(i39);
                    if (iArr11[1] - iArr11[0] > 1) {
                        j10 = j3;
                    } else {
                        if (i39 > 0) {
                            iArr4 = (int[]) arrayList7.get(i39 - 1);
                        } else {
                            iArr4 = null;
                        }
                        int i40 = i39 + 1;
                        j10 = j3;
                        if (i40 < arrayList7.size()) {
                            iArr5 = (int[]) arrayList7.get(i40);
                        } else {
                            iArr5 = null;
                        }
                        if (iArr4 != null && r7.d(iArr9, iArr4[1]) <= j10 && r7.k(fArr, fArr2, iArr4[0], iArr11[1]) <= f17) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (iArr5 != null && r7.d(iArr9, iArr11[1]) <= j10 && r7.k(fArr, fArr2, iArr11[0], iArr5[1]) <= f17) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z13 && (!z14 || r7.d(iArr9, iArr4[1]) <= r7.d(iArr9, iArr11[1]))) {
                            iArr4[1] = iArr11[1];
                            arrayList7.remove(i39);
                            i39 = Math.max(-1, i39 - 2);
                        } else if (z14) {
                            iArr5[0] = iArr11[0];
                            arrayList7.remove(i39);
                            i39 = Math.max(-1, i39 - 1);
                        }
                    }
                    i39++;
                    j3 = j10;
                }
                long j13 = j3;
                ArrayList arrayList8 = new ArrayList();
                int size = arrayList7.size();
                int i41 = 0;
                while (i41 < size) {
                    Object obj = arrayList7.get(i41);
                    i41++;
                    int[] iArr12 = (int[]) obj;
                    int i42 = iArr12[0];
                    int i43 = iArr12[1];
                    if (i42 == i43 || r7.k(fArr, fArr2, i42, i43) <= f17) {
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList5;
                        i12 = size;
                        f10 = f17;
                        arrayList8.add(iArr12);
                    } else {
                        int i44 = iArr12[0];
                        int i45 = iArr12[1];
                        int i46 = i45 - i44;
                        int i47 = i46 + 1;
                        float k10 = r7.k(fArr, fArr2, i44, i45);
                        int i48 = i46 + 2;
                        arrayList3 = arrayList7;
                        float[] fArr3 = new float[i48];
                        int i49 = 1;
                        while (i49 < i47) {
                            int i50 = i49;
                            int i51 = (i44 + i49) - 1;
                            int i52 = i51 * 4;
                            int i53 = size;
                            float f22 = f17;
                            CharSequence subSequence2 = sb6.subSequence(iArr9[i52], iArr9[i52 + 1]);
                            if (subSequence2.length() != 0 && ((charAt = subSequence2.charAt(subSequence2.length() - 1)) == ',' || charAt == ';' || charAt == ':' || charAt == 8212 || charAt == 8211 || charAt == 1548 || charAt == 12289 || charAt == 65292)) {
                                fArr3[i50] = fArr3[i50] - 0.3f;
                            }
                            fArr3[i50] = fArr3[i50] - ((((float) Math.min(500L, Math.max(0L, r7.d(iArr9, i51)))) * 0.3f) / 500.0f);
                            i49 = i50 + 1;
                            i44 = i44;
                            size = i53;
                            f17 = f22;
                            i48 = i48;
                            arrayList5 = arrayList5;
                        }
                        arrayList4 = arrayList5;
                        i12 = size;
                        f10 = f17;
                        int i54 = i44;
                        int i55 = i48;
                        int i56 = i7;
                        int max = Math.max(i56, (int) Math.ceil(k10 / f10));
                        while (true) {
                            if (max <= i47) {
                                float f23 = k10 / max;
                                int i57 = max + 1;
                                int[] iArr13 = new int[i56];
                                iArr13[1] = i55;
                                iArr13[0] = i57;
                                float[][] fArr4 = (float[][]) Array.newInstance(Float.TYPE, iArr13);
                                int[][] iArr14 = (int[][]) Array.newInstance(Integer.TYPE, i57, i55);
                                int length4 = fArr4.length;
                                int i58 = 0;
                                while (true) {
                                    f11 = Float.MAX_VALUE;
                                    if (i58 >= length4) {
                                        break;
                                    }
                                    int i59 = i58;
                                    Arrays.fill(fArr4[i59], Float.MAX_VALUE);
                                    i58 = i59 + 1;
                                }
                                fArr4[0][0] = f21;
                                int i60 = 1;
                                while (i60 <= max) {
                                    int i61 = i60;
                                    while (true) {
                                        f12 = f11;
                                        if (i61 <= i47 - (max - i60)) {
                                            int i62 = i60 - 1;
                                            int i63 = i60;
                                            int i64 = i62;
                                            while (i64 < i61) {
                                                if (fArr4[i62][i64] == f12) {
                                                    i13 = i64;
                                                    i14 = i62;
                                                } else {
                                                    i13 = i64;
                                                    i14 = i62;
                                                    float k11 = r7.k(fArr, fArr2, i54 + i13, (i54 + i61) - 1);
                                                    if (k11 > f10) {
                                                        f13 = k11;
                                                        if (i61 - i13 > 1) {
                                                        }
                                                    } else {
                                                        f13 = k11;
                                                    }
                                                    float f24 = (f13 - f23) / f10;
                                                    float f25 = (f24 * f24) + fArr4[i14][i13] + fArr3[i61];
                                                    if (i61 - i13 == 1 && i47 > max) {
                                                        f14 = f25 + 1.0f;
                                                    } else {
                                                        f14 = f25;
                                                    }
                                                    float[] fArr5 = fArr4[i63];
                                                    if (f14 < fArr5[i61]) {
                                                        fArr5[i61] = f14;
                                                        iArr14[i63][i61] = i13;
                                                    }
                                                }
                                                i64 = i13 + 1;
                                                i62 = i14;
                                            }
                                            i61++;
                                            i60 = i63;
                                            f11 = f12;
                                        }
                                    }
                                    i60++;
                                    f11 = f12;
                                }
                                if (fArr4[max][i47] == f11) {
                                    max = i57;
                                    i56 = 2;
                                } else {
                                    int size2 = arrayList8.size();
                                    while (max >= 1) {
                                        int i65 = iArr14[max][i47];
                                        arrayList8.add(size2, new int[]{i54 + i65, (i47 + i54) - 1});
                                        max--;
                                        i47 = i65;
                                    }
                                }
                            } else {
                                for (int i66 = i54; i66 <= i45; i66++) {
                                    arrayList8.add(new int[]{i66, i66});
                                }
                            }
                        }
                    }
                    arrayList7 = arrayList3;
                    size = i12;
                    f17 = f10;
                    arrayList5 = arrayList4;
                    i7 = 2;
                }
                ArrayList arrayList9 = arrayList5;
                float f26 = f17;
                int i67 = 0;
                while (i67 < arrayList8.size()) {
                    int[] iArr15 = (int[]) arrayList8.get(i67);
                    if (iArr15[0] == iArr15[1]) {
                        if (i67 > 0) {
                            iArr2 = (int[]) arrayList8.get(i67 - 1);
                        } else {
                            iArr2 = null;
                        }
                        int i68 = i67 + 1;
                        if (i68 < arrayList8.size()) {
                            iArr3 = (int[]) arrayList8.get(i68);
                        } else {
                            iArr3 = null;
                        }
                        if (iArr2 != null && r7.d(iArr9, iArr2[1]) <= j13 && r7.k(fArr, fArr2, iArr2[0], iArr15[1]) <= f26) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (iArr3 != null && r7.d(iArr9, iArr15[1]) <= j13 && r7.k(fArr, fArr2, iArr15[0], iArr3[1]) <= f26) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11 && (!z12 || r7.d(iArr9, iArr2[1]) <= r7.d(iArr9, iArr15[1]))) {
                            iArr2[1] = iArr15[1];
                            i11 = i67 - 1;
                            arrayList8.remove(i67);
                        } else if (z12) {
                            iArr3[0] = iArr15[0];
                            i11 = i67 - 1;
                            arrayList8.remove(i67);
                        }
                        i67 = i11;
                    }
                    i67++;
                }
                char c10 = 1;
                int size3 = arrayList8.size();
                int i69 = 0;
                while (i69 < size3) {
                    Object obj2 = arrayList8.get(i69);
                    i69++;
                    int[] iArr16 = (int[]) obj2;
                    int i70 = iArr16[0];
                    int i71 = iArr16[c10];
                    int i72 = i70 * 4;
                    long j14 = iArr9[i72 + 2];
                    int i73 = 0;
                    while (true) {
                        if (i73 < arrayList6.size()) {
                            if (((o7) arrayList6.get(i73)).f15159a == j14) {
                                r13 = (o7) arrayList6.get(i73);
                                break;
                            }
                            i73++;
                        } else {
                            r13 = 0;
                            break;
                        }
                    }
                    if (r13 == 0) {
                        r13 = new Object();
                        r13.f15159a = j14;
                    }
                    int i74 = i71 * 4;
                    r13.f15160b = iArr9[i74 + 3] + 300;
                    if (!r13.f15162e) {
                        String substring = sb6.substring(iArr9[i72], iArr9[i74 + 1]);
                        CharSequence charSequence = r13.f15161c;
                        if (charSequence == null || !substring.contentEquals(charSequence)) {
                            r13.f15161c = substring;
                        }
                        c10 = 1;
                        int[] iArr17 = new int[((i71 - i70) + 1) * 4];
                        int i75 = i70;
                        while (i75 <= i71) {
                            int i76 = (i75 - i70) * 4;
                            int i77 = i75 * 4;
                            iArr17[i76] = iArr9[i77] - iArr9[i72];
                            iArr17[i76 + 1] = iArr9[i77 + 1] - iArr9[i72];
                            iArr17[i76 + 2] = iArr9[i77 + 2];
                            iArr17[i76 + 3] = iArr9[i77 + 3];
                            i75++;
                            arrayList8 = arrayList8;
                            size3 = size3;
                        }
                        arrayList2 = arrayList8;
                        i10 = size3;
                        r13.d = iArr17;
                    } else {
                        arrayList2 = arrayList8;
                        i10 = size3;
                        c10 = 1;
                    }
                    ArrayList arrayList10 = arrayList9;
                    arrayList10.add(r13);
                    size3 = i10;
                    arrayList9 = arrayList10;
                    arrayList8 = arrayList2;
                }
                arrayList = arrayList9;
                int i78 = 0;
                while (true) {
                    int i79 = i78 + 1;
                    if (i79 >= arrayList.size()) {
                        break;
                    }
                    ((o7) arrayList.get(i78)).f15160b = Math.max(((o7) arrayList.get(i78)).f15159a, Math.min(((o7) arrayList.get(i78)).f15160b, ((o7) arrayList.get(i79)).f15159a));
                    i78 = i79;
                }
            }
            l7 l7Var2 = r7Var.f15317t;
            if (l7Var2 != null) {
                l7Var2.g(arrayList);
            }
            if (z10) {
                r7Var.f();
            }
        }
    }
}
