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
public final class ppa {
    public static ppa q;
    public Bitmap e;
    public Canvas f;
    public Paint g;
    public long h;
    public ArrayList i;
    public boolean j;
    public final int k;
    public boolean l;
    public boolean p;
    public final uo3 a = new uo3("SpoilerEffectBitmapFactory", 3);
    public final ed[] b = new ed[npa.C.length];
    public final ym4[] c = new ym4[2];
    public int d = 0;
    public final Rect m = new Rect();
    public final jr4 n = new jr4(this, (byte) 4);
    public final Rect o = new Rect();

    public ppa() {
        float f;
        if (xea.o() == 2) {
            f = 150.0f;
        } else {
            f = 100.0f;
        }
        int L = hl.L(f);
        Point point = hl.q;
        int min = (int) Math.min(Math.min(point.x, point.y) * 0.5f, L);
        this.k = min < hl.L(80.0f) ? hl.L(80.0f) : min;
        int i = 0;
        while (true) {
            ed[] edVarArr = this.b;
            if (i < edVarArr.length) {
                ed edVar = new ed((byte) 18, false);
                edVar.c = new float[64];
                edVar.b = 0;
                edVarArr[i] = edVar;
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
        jpa jpaVar;
        o3d o3dVar;
        float f;
        int i6;
        boolean z;
        ppa ppaVar = this;
        Rect rect2 = rect;
        ed[] edVarArr = ppaVar.b;
        int i7 = 0;
        for (ed edVar : edVarArr) {
            edVar.b = 0;
        }
        int i8 = 0;
        while (true) {
            arrayList = ppaVar.i;
            if (i8 >= 100) {
                break;
            }
            npa npaVar = (npa) arrayList.get(i8);
            if (Rect.intersects(npaVar.getBounds(), rect2)) {
                float[][] fArr2 = npa.D;
                int[] iArr2 = npaVar.f;
                float[] fArr3 = npaVar.e;
                int length = edVarArr.length;
                float[] fArr4 = npa.C;
                if (length == fArr4.length) {
                    long currentTimeMillis = System.currentTimeMillis();
                    npaVar.j = currentTimeMillis;
                    ArrayList arrayList2 = npaVar.h;
                    Stack stack = npaVar.c;
                    int i9 = npaVar.d;
                    int length2 = fArr4.length;
                    Rect bounds = npaVar.getBounds();
                    float f2 = bounds.left;
                    float f3 = bounds.top;
                    float width = bounds.width();
                    float height = bounds.height();
                    RectF rectF = npaVar.z;
                    i = i8;
                    float f4 = rectF.left;
                    float f5 = rectF.top;
                    float f6 = rectF.right;
                    float f7 = rectF.bottom;
                    float N = hl.N(1.0f);
                    float f8 = rect2.left - N;
                    float f9 = rect2.top - N;
                    float f10 = rect2.right + N;
                    float f11 = rect2.bottom + N;
                    float min = (int) Math.min(currentTimeMillis - npaVar.j, 34L);
                    float f12 = min / 500.0f;
                    int size = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = size;
                        jpa jpaVar2 = (jpa) arrayList2.get(i10);
                        float f13 = f6;
                        float f14 = min;
                        float min2 = Math.min(jpaVar2.g + min, jpaVar2.f);
                        jpaVar2.g = min2;
                        float f15 = jpaVar2.a;
                        float f16 = jpaVar2.b;
                        if (f15 >= f4 && f15 <= f13 && f16 >= f5 && f16 <= f7) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (min2 < jpaVar2.f && !z) {
                            float f17 = jpaVar2.e * f12;
                            jpaVar2.a = (jpaVar2.c * f17) + f15;
                            jpaVar2.b = (jpaVar2.d * f17) + f16;
                            size = i11;
                        } else {
                            if (stack.size() < i9) {
                                stack.push(jpaVar2);
                            }
                            int i12 = i11 - 1;
                            if (i10 != i12) {
                                arrayList2.set(i10, (jpa) arrayList2.get(i12));
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
                                jpaVar = (jpa) stack.pop();
                            } else {
                                jpaVar = new Object();
                            }
                            int i18 = 0;
                            while (true) {
                                o3dVar = Utilities.c;
                                f = f20;
                                jpaVar.a = (o3dVar.nextFloat() * width) + f2;
                                float nextFloat = (o3dVar.nextFloat() * height) + f;
                                jpaVar.b = nextFloat;
                                int i19 = i18 + 1;
                                i6 = i15;
                                float f23 = jpaVar.a;
                                if ((f23 < f4 || f23 > f18 || nextFloat < f5 || nextFloat > f7) && i19 < 4) {
                                    i15 = i6;
                                    i18 = i19;
                                    f20 = f;
                                }
                            }
                            float[][] fArr5 = fArr2;
                            double d = ((f22 * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                            jpaVar.c = (float) Math.cos(d);
                            jpaVar.d = (float) Math.sin(d);
                            jpaVar.g = 0.0f;
                            jpaVar.f = o3dVar.nextInt(2000) + 1000;
                            jpaVar.e = (f22 * 6.0f) + 4.0f;
                            jpaVar.h = o3dVar.nextInt(length2);
                            arrayList2.add(jpaVar);
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
                    int i21 = npaVar.x;
                    int i22 = 0;
                    while (i22 < size2) {
                        jpa jpaVar3 = (jpa) arrayList2.get(i22);
                        float f24 = jpaVar3.a;
                        float f25 = jpaVar3.b;
                        if (f24 >= f8 && f24 <= f10 && f25 >= f9 && f25 <= f11) {
                            int i23 = jpaVar3.h;
                            float[] fArr6 = fArr[i23];
                            int i24 = iArr[i23];
                            int i25 = i24 + 1;
                            if (i25 < fArr6.length) {
                                fArr6[i24] = f24;
                                fArr6[i25] = f25;
                                int i26 = i24 + 2;
                                float f26 = npaVar.b[i23];
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
                        ed edVar2 = edVarArr[i28];
                        float[] fArr7 = fArr[i28];
                        int i29 = iArr[i28];
                        int i30 = edVar2.b + i29;
                        float[] fArr8 = (float[]) edVar2.c;
                        if (i30 > fArr8.length) {
                            fArr8 = Arrays.copyOf((float[]) edVar2.c, Math.max(i30, fArr8.length << 1));
                            edVar2.c = fArr8;
                        }
                        System.arraycopy(fArr7, 0, fArr8, edVar2.b, i29);
                        edVar2.b += i29;
                    }
                    i8 = i + 1;
                    ppaVar = this;
                    rect2 = rect;
                    i7 = 0;
                }
            }
            i = i8;
            i8 = i + 1;
            ppaVar = this;
            rect2 = rect;
            i7 = 0;
        }
        npa npaVar2 = (npa) arrayList.get(i7);
        npaVar2.getClass();
        float[] fArr9 = npa.C;
        if (edVarArr.length == fArr9.length) {
            for (int i31 = 0; i31 < fArr9.length; i31++) {
                ed edVar3 = edVarArr[i31];
                Paint paint = npaVar2.a[i31];
                int i32 = edVar3.b;
                if (i32 > 0) {
                    canvas.drawPoints((float[]) edVar3.c, 0, i32, paint);
                }
            }
        }
    }
}
