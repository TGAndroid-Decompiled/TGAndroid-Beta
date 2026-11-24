package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import org.telegram.messenger.Utilities;
public final class tna {
    public static tna q;
    public Bitmap e;
    public Canvas f;
    public Paint g;
    public long h;
    public ArrayList i;
    public boolean j;
    public final int k;
    public boolean l;
    public boolean p;
    public final np3 a = new np3("SpoilerEffectBitmapFactory", 3);
    public final de[] b = new de[rna.C.length];
    public final mj4[] c = new mj4[2];
    public int d = 0;
    public final Rect m = new Rect();
    public final gr4 n = new gr4(this, (byte) 4);
    public final Rect o = new Rect();

    public tna() {
        float f;
        if (gda.o() == 2) {
            f = 150.0f;
        } else {
            f = 100.0f;
        }
        int L = gm.L(f);
        Point point = gm.q;
        int min = (int) Math.min(Math.min(point.x, point.y) * 0.5f, L);
        this.k = min < gm.L(80.0f) ? gm.L(80.0f) : min;
        int i = 0;
        while (true) {
            de[] deVarArr = this.b;
            if (i < deVarArr.length) {
                de deVar = new de((byte) 18, false);
                deVar.c = new float[64];
                deVar.b = 0;
                deVarArr[i] = deVar;
                i++;
            } else {
                return;
            }
        }
    }

    public final void a(Canvas canvas, Rect rect) {
        ArrayList arrayList;
        int i;
        float[][] fArr;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        nna nnaVar;
        z0d z0dVar;
        float f;
        int i6;
        boolean z;
        tna tnaVar = this;
        Rect rect2 = rect;
        de[] deVarArr = tnaVar.b;
        int i7 = 0;
        for (de deVar : deVarArr) {
            deVar.b = 0;
        }
        int i8 = 0;
        while (true) {
            arrayList = tnaVar.i;
            if (i8 >= 100) {
                break;
            }
            rna rnaVar = (rna) arrayList.get(i8);
            if (Rect.intersects(rnaVar.getBounds(), rect2)) {
                float[][] fArr2 = rna.D;
                int[] iArr2 = rnaVar.f;
                float[] fArr3 = rnaVar.e;
                int length = deVarArr.length;
                float[] fArr4 = rna.C;
                if (length == fArr4.length) {
                    long currentTimeMillis = System.currentTimeMillis();
                    rnaVar.j = currentTimeMillis;
                    ArrayList arrayList2 = rnaVar.h;
                    Stack stack = rnaVar.c;
                    int i9 = rnaVar.d;
                    int length2 = fArr4.length;
                    Rect bounds = rnaVar.getBounds();
                    float f2 = bounds.left;
                    float f3 = bounds.top;
                    float width = bounds.width();
                    float height = bounds.height();
                    RectF rectF = rnaVar.z;
                    i = i8;
                    float f4 = rectF.left;
                    float f5 = rectF.top;
                    float f6 = rectF.right;
                    float f7 = rectF.bottom;
                    float N = gm.N(1.0f);
                    float f8 = rect2.left - N;
                    float f9 = rect2.top - N;
                    float f10 = rect2.right + N;
                    float f11 = rect2.bottom + N;
                    float min = (int) Math.min(currentTimeMillis - rnaVar.j, 34L);
                    float f12 = min / 500.0f;
                    int size = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = size;
                        nna nnaVar2 = (nna) arrayList2.get(i10);
                        float f13 = f6;
                        float f14 = min;
                        float min2 = Math.min(nnaVar2.g + min, nnaVar2.f);
                        nnaVar2.g = min2;
                        float f15 = nnaVar2.a;
                        float f16 = nnaVar2.b;
                        if (f15 >= f4 && f15 <= f13 && f16 >= f5 && f16 <= f7) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (min2 < nnaVar2.f && !z) {
                            float f17 = nnaVar2.e * f12;
                            nnaVar2.a = (nnaVar2.c * f17) + f15;
                            nnaVar2.b = (nnaVar2.d * f17) + f16;
                            size = i11;
                        } else {
                            if (stack.size() < i9) {
                                stack.push(nnaVar2);
                            }
                            int i12 = i11 - 1;
                            if (i10 != i12) {
                                arrayList2.set(i10, (nna) arrayList2.get(i12));
                            }
                            arrayList2.remove(i12);
                            size = i11 - 1;
                            i10--;
                        }
                        i10++;
                        f6 = f13;
                        min = f14;
                    }
                    float f18 = f6;
                    int size2 = arrayList2.size();
                    if (size2 < i9) {
                        int i13 = i9 - size2;
                        int i14 = 14;
                        float f19 = -1.0f;
                        Arrays.fill(fArr3, 0, Math.min(i13, 14), -1.0f);
                        float f20 = f3;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < i13) {
                            float f21 = fArr3[i16];
                            if (f21 == f19) {
                                f21 = Utilities.c.nextFloat();
                                fArr3[i16] = f21;
                            }
                            float f22 = f21;
                            int i17 = i16 + 1;
                            if (i17 == i14) {
                                i16 = 0;
                            } else {
                                i16 = i17;
                            }
                            if (!stack.isEmpty()) {
                                nnaVar = (nna) stack.pop();
                            } else {
                                nnaVar = new Object();
                            }
                            int i18 = 0;
                            while (true) {
                                z0dVar = Utilities.c;
                                f = f20;
                                nnaVar.a = (z0dVar.nextFloat() * width) + f2;
                                float nextFloat = (z0dVar.nextFloat() * height) + f;
                                nnaVar.b = nextFloat;
                                int i19 = i18 + 1;
                                i6 = i15;
                                float f23 = nnaVar.a;
                                if ((f23 < f4 || f23 > f18 || nextFloat < f5 || nextFloat > f7) && i19 < 4) {
                                    i15 = i6;
                                    i18 = i19;
                                    f20 = f;
                                }
                            }
                            float[][] fArr5 = fArr2;
                            double d = ((f22 * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                            nnaVar.c = (float) Math.cos(d);
                            nnaVar.d = (float) Math.sin(d);
                            nnaVar.g = 0.0f;
                            nnaVar.f = z0dVar.nextInt(2000) + 1000;
                            nnaVar.e = (f22 * 6.0f) + 4.0f;
                            nnaVar.h = z0dVar.nextInt(length2);
                            arrayList2.add(nnaVar);
                            i15 = i6 + 1;
                            iArr2 = iArr2;
                            f20 = f;
                            fArr2 = fArr5;
                            i14 = 14;
                            f19 = -1.0f;
                        }
                        fArr = fArr2;
                        iArr = iArr2;
                        size2 = arrayList2.size();
                    } else {
                        fArr = fArr2;
                        iArr = iArr2;
                    }
                    for (int i20 = 0; i20 < length2; i20++) {
                        iArr[i20] = 0;
                    }
                    int i21 = rnaVar.x;
                    int i22 = 0;
                    while (i22 < size2) {
                        nna nnaVar3 = (nna) arrayList2.get(i22);
                        float f24 = nnaVar3.a;
                        float f25 = nnaVar3.b;
                        if (f24 >= f8 && f24 <= f10 && f25 >= f9 && f25 <= f11) {
                            int i23 = nnaVar3.h;
                            float[] fArr6 = fArr[i23];
                            int i24 = iArr[i23];
                            int i25 = i24 + 1;
                            if (i25 < fArr6.length) {
                                fArr6[i24] = f24;
                                fArr6[i25] = f25;
                                int i26 = i24 + 2;
                                float f26 = rnaVar.b[i23];
                                if (f24 < f26 && (i5 = i24 + 3) < fArr6.length) {
                                    fArr6[i26] = i21 + f24;
                                    fArr6[i5] = f25;
                                    i26 = i24 + 4;
                                }
                                float f27 = i21;
                                float f28 = f27 - f26;
                                if (f24 > f28) {
                                    int i27 = i26 + 1;
                                    i2 = size2;
                                    if (i27 < fArr6.length) {
                                        fArr6[i26] = f24 - f27;
                                        fArr6[i27] = f25;
                                        i26 += 2;
                                    }
                                } else {
                                    i2 = size2;
                                }
                                if (f25 < f26 && (i4 = i26 + 1) < fArr6.length) {
                                    fArr6[i26] = f24;
                                    fArr6[i4] = f25 + f27;
                                    i26 += 2;
                                }
                                if (f25 > f28 && (i3 = i26 + 1) < fArr6.length) {
                                    fArr6[i26] = f24;
                                    fArr6[i3] = f25 - f27;
                                    i26 += 2;
                                }
                                iArr[i23] = i26;
                                i22++;
                                size2 = i2;
                            }
                        }
                        i2 = size2;
                        i22++;
                        size2 = i2;
                    }
                    for (int i28 = 0; i28 < length2; i28++) {
                        de deVar2 = deVarArr[i28];
                        float[] fArr7 = fArr[i28];
                        int i29 = iArr[i28];
                        int i30 = deVar2.b + i29;
                        float[] fArr8 = (float[]) deVar2.c;
                        if (i30 > fArr8.length) {
                            fArr8 = Arrays.copyOf((float[]) deVar2.c, Math.max(i30, fArr8.length << 1));
                            deVar2.c = fArr8;
                        }
                        System.arraycopy(fArr7, 0, fArr8, deVar2.b, i29);
                        deVar2.b += i29;
                    }
                    i8 = i + 1;
                    tnaVar = this;
                    rect2 = rect;
                    i7 = 0;
                }
            }
            i = i8;
            i8 = i + 1;
            tnaVar = this;
            rect2 = rect;
            i7 = 0;
        }
        rna rnaVar2 = (rna) arrayList.get(i7);
        rnaVar2.getClass();
        float[] fArr9 = rna.C;
        if (deVarArr.length == fArr9.length) {
            for (int i31 = 0; i31 < fArr9.length; i31++) {
                de deVar3 = deVarArr[i31];
                Paint paint = rnaVar2.a[i31];
                int i32 = deVar3.b;
                if (i32 > 0) {
                    canvas.drawPoints((float[]) deVar3.c, 0, i32, paint);
                }
            }
        }
    }
}
