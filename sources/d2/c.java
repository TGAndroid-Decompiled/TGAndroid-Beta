package d2;

import a0.k;
import android.graphics.Color;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
public final class c {
    public static final a f4267f = new a(0);
    public static final d f4268g = new Object();
    public final Object f4269a;
    public final Object f4270b;
    public final Object f4271c;
    public final Cloneable d;
    public final Object f4272e;

    public c(int[] iArr, int i9, d[] dVarArr) {
        b bVar;
        this.f4272e = new float[3];
        this.d = dVarArr;
        int[] iArr2 = new int[32768];
        this.f4270b = iArr2;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            int b10 = b(Color.blue(i11), 8, 5) | (b(Color.red(i11), 8, 5) << 10) | (b(Color.green(i11), 8, 5) << 5);
            iArr[i10] = b10;
            iArr2[b10] = iArr2[b10] + 1;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 32768; i13++) {
            if (iArr2[i13] > 0) {
                int rgb = Color.rgb(b((i13 >> 10) & 31, 5, 8), b((i13 >> 5) & 31, 5, 8), b(i13 & 31, 5, 8));
                float[] fArr = (float[]) this.f4272e;
                ThreadLocal threadLocal = i0.a.f10846a;
                i0.a.b(fArr, Color.red(rgb), Color.green(rgb), Color.blue(rgb));
                if (c(fArr)) {
                    iArr2[i13] = 0;
                }
            }
            if (iArr2[i13] > 0) {
                i12++;
            }
        }
        int[] iArr3 = new int[i12];
        this.f4269a = iArr3;
        int i14 = 0;
        for (int i15 = 0; i15 < 32768; i15++) {
            if (iArr2[i15] > 0) {
                iArr3[i14] = i15;
                i14++;
            }
        }
        if (i12 <= i9) {
            this.f4271c = new ArrayList();
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = iArr3[i16];
                ((ArrayList) this.f4271c).add(new e(Color.rgb(b((i17 >> 10) & 31, 5, 8), b((i17 >> 5) & 31, 5, 8), b(i17 & 31, 5, 8)), iArr2[i17]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i9, f4267f);
        priorityQueue.offer(new b(this, 0, ((int[]) this.f4269a).length - 1));
        while (priorityQueue.size() < i9 && (bVar = (b) priorityQueue.poll()) != null) {
            int i18 = bVar.f4260b;
            int i19 = bVar.f4259a;
            if ((i18 + 1) - i19 <= 1) {
                break;
            }
            c cVar = bVar.f4266j;
            if ((i18 + 1) - i19 > 1) {
                int i20 = bVar.f4262e - bVar.d;
                int i21 = bVar.f4264g - bVar.f4263f;
                int i22 = bVar.f4265i - bVar.h;
                int i23 = (i20 < i21 || i20 < i22) ? (i21 < i20 || i21 < i22) ? -1 : -2 : -3;
                int[] iArr4 = (int[]) cVar.f4269a;
                int[] iArr5 = (int[]) cVar.f4270b;
                a(i23, i19, i18, iArr4);
                Arrays.sort(iArr4, i19, bVar.f4260b + 1);
                a(i23, i19, bVar.f4260b, iArr4);
                int i24 = bVar.f4261c / 2;
                int i25 = i19;
                int i26 = 0;
                while (true) {
                    int i27 = bVar.f4260b;
                    if (i25 > i27) {
                        break;
                    }
                    i26 += iArr5[iArr4[i25]];
                    if (i26 >= i24) {
                        i19 = Math.min(i27 - 1, i25);
                        break;
                    }
                    i25++;
                }
                b bVar2 = new b(cVar, i19 + 1, bVar.f4260b);
                bVar.f4260b = i19;
                bVar.a();
                priorityQueue.offer(bVar2);
                priorityQueue.offer(bVar);
            } else {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            b bVar3 = (b) it.next();
            c cVar2 = bVar3.f4266j;
            int[] iArr6 = (int[]) cVar2.f4269a;
            int[] iArr7 = (int[]) cVar2.f4270b;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            for (int i32 = bVar3.f4259a; i32 <= bVar3.f4260b; i32++) {
                int i33 = iArr6[i32];
                int i34 = iArr7[i33];
                i29 += i34;
                i28 = (((i33 >> 10) & 31) * i34) + i28;
                i30 = (((i33 >> 5) & 31) * i34) + i30;
                i31 += i34 * (i33 & 31);
            }
            float f10 = i29;
            e eVar = new e(Color.rgb(b(Math.round(i28 / f10), 5, 8), b(Math.round(i30 / f10), 5, 8), b(Math.round(i31 / f10), 5, 8)), i29);
            if (!c(eVar.b())) {
                arrayList.add(eVar);
            }
        }
        this.f4271c = arrayList;
    }

    public static void a(int i9, int i10, int i11, int[] iArr) {
        if (i9 != -2) {
            if (i9 == -1) {
                while (i10 <= i11) {
                    int i12 = iArr[i10];
                    iArr[i10] = ((i12 >> 10) & 31) | ((i12 & 31) << 10) | (((i12 >> 5) & 31) << 5);
                    i10++;
                }
                return;
            }
            return;
        }
        while (i10 <= i11) {
            int i13 = iArr[i10];
            iArr[i10] = (i13 & 31) | (((i13 >> 5) & 31) << 10) | (((i13 >> 10) & 31) << 5);
            i10++;
        }
    }

    public static int b(int i9, int i10, int i11) {
        int i12;
        if (i11 > i10) {
            i12 = i9 << (i11 - i10);
        } else {
            i12 = i9 >> (i10 - i11);
        }
        return i12 & ((1 << i11) - 1);
    }

    public boolean c(float[] fArr) {
        d[] dVarArr = (d[]) this.d;
        if (dVarArr != null && dVarArr.length > 0) {
            for (d dVar : dVarArr) {
                dVar.getClass();
                float f10 = fArr[2];
                if (f10 < 0.95f && f10 > 0.05f) {
                    float f11 = fArr[0];
                    if (f11 < 10.0f || f11 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public c(ArrayList arrayList, List list) {
        this.f4269a = list;
        this.f4270b = arrayList;
        this.d = new SparseBooleanArray();
        this.f4271c = new k(0);
        int size = list.size();
        int i9 = Integer.MIN_VALUE;
        e eVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar2 = (e) list.get(i10);
            int i11 = eVar2.f4276e;
            if (i11 > i9) {
                eVar = eVar2;
                i9 = i11;
            }
        }
        this.f4272e = eVar;
    }
}
