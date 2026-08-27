package d2;

import android.graphics.Color;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public final class c {

    public static final a f4709f = new a(0);

    public static final d f4710g = new d();

    public final Object f4711a;

    public final Object f4712b;

    public final Object f4713c;
    public final Cloneable d;

    public final Object f4714e;

    public c(int[] iArr, int i10, d[] dVarArr) {
        b bVar;
        this.f4714e = new float[3];
        this.d = dVarArr;
        int[] iArr2 = new int[32768];
        this.f4712b = iArr2;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            int iB = b(Color.blue(i12), 8, 5) | (b(Color.red(i12), 8, 5) << 10) | (b(Color.green(i12), 8, 5) << 5);
            iArr[i11] = iB;
            iArr2[iB] = iArr2[iB] + 1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 32768; i14++) {
            if (iArr2[i14] > 0) {
                int iRgb = Color.rgb(b((i14 >> 10) & 31, 5, 8), b((i14 >> 5) & 31, 5, 8), b(i14 & 31, 5, 8));
                float[] fArr = (float[]) this.f4714e;
                ThreadLocal threadLocal = i0.b.f10487a;
                i0.b.b(fArr, Color.red(iRgb), Color.green(iRgb), Color.blue(iRgb));
                if (c(fArr)) {
                    iArr2[i14] = 0;
                }
            }
            if (iArr2[i14] > 0) {
                i13++;
            }
        }
        int[] iArr3 = new int[i13];
        this.f4711a = iArr3;
        int i15 = 0;
        for (int i16 = 0; i16 < 32768; i16++) {
            if (iArr2[i16] > 0) {
                iArr3[i15] = i16;
                i15++;
            }
        }
        if (i13 <= i10) {
            this.f4713c = new ArrayList();
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = iArr3[i17];
                ((ArrayList) this.f4713c).add(new e(Color.rgb(b((i18 >> 10) & 31, 5, 8), b((i18 >> 5) & 31, 5, 8), b(i18 & 31, 5, 8)), iArr2[i18]));
            }
            return;
        }
        PriorityQueue<b> priorityQueue = new PriorityQueue(i10, f4709f);
        priorityQueue.offer(new b(this, 0, ((int[]) this.f4711a).length - 1));
        while (priorityQueue.size() < i10 && (bVar = (b) priorityQueue.poll()) != null) {
            int i19 = bVar.f4702b;
            int iMin = bVar.f4701a;
            if ((i19 + 1) - iMin <= 1) {
                break;
            }
            c cVar = bVar.f4708j;
            if ((i19 + 1) - iMin <= 1) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int i20 = bVar.f4704e - bVar.d;
            int i21 = bVar.f4706g - bVar.f4705f;
            int i22 = bVar.f4707i - bVar.h;
            int i23 = (i20 < i21 || i20 < i22) ? (i21 < i20 || i21 < i22) ? -1 : -2 : -3;
            int[] iArr4 = (int[]) cVar.f4711a;
            int[] iArr5 = (int[]) cVar.f4712b;
            a(i23, iMin, i19, iArr4);
            Arrays.sort(iArr4, iMin, bVar.f4702b + 1);
            a(i23, iMin, bVar.f4702b, iArr4);
            int i24 = bVar.f4703c / 2;
            int i25 = iMin;
            int i26 = 0;
            while (true) {
                int i27 = bVar.f4702b;
                if (i25 > i27) {
                    break;
                }
                i26 += iArr5[iArr4[i25]];
                if (i26 >= i24) {
                    iMin = Math.min(i27 - 1, i25);
                    break;
                }
                i25++;
            }
            b bVar2 = new b(cVar, iMin + 1, bVar.f4702b);
            bVar.f4702b = iMin;
            bVar.a();
            priorityQueue.offer(bVar2);
            priorityQueue.offer(bVar);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        for (b bVar3 : priorityQueue) {
            c cVar2 = bVar3.f4708j;
            int[] iArr6 = (int[]) cVar2.f4711a;
            int[] iArr7 = (int[]) cVar2.f4712b;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            for (int i32 = bVar3.f4701a; i32 <= bVar3.f4702b; i32++) {
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
        this.f4713c = arrayList;
    }

    public static void a(int i10, int i11, int i12, int[] iArr) {
        if (i10 == -2) {
            while (i11 <= i12) {
                int i13 = iArr[i11];
                iArr[i11] = (i13 & 31) | (((i13 >> 5) & 31) << 10) | (((i13 >> 10) & 31) << 5);
                i11++;
            }
            return;
        }
        if (i10 != -1) {
            return;
        }
        while (i11 <= i12) {
            int i14 = iArr[i11];
            iArr[i11] = ((i14 >> 10) & 31) | ((i14 & 31) << 10) | (((i14 >> 5) & 31) << 5);
            i11++;
        }
    }

    public static int b(int i10, int i11, int i12) {
        return (i12 > i11 ? i10 << (i12 - i11) : i10 >> (i11 - i12)) & ((1 << i12) - 1);
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
        this.f4711a = list;
        this.f4712b = arrayList;
        this.d = new SparseBooleanArray();
        this.f4713c = new a0.f(0);
        int size = list.size();
        int i10 = Integer.MIN_VALUE;
        e eVar = null;
        for (int i11 = 0; i11 < size; i11++) {
            e eVar2 = (e) list.get(i11);
            int i12 = eVar2.f4718e;
            if (i12 > i10) {
                eVar = eVar2;
                i10 = i12;
            }
        }
        this.f4714e = eVar;
    }
}
