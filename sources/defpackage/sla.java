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
public final class sla {
    public static sla q;
    public Bitmap e;
    public Canvas f;
    public Paint g;
    public long h;
    public ArrayList i;
    public boolean j;
    public final int k;
    public boolean l;
    public boolean p;
    public final do3 a = new do3("SpoilerEffectBitmapFactory", 3);
    public final dd[] b = new dd[qla.C.length];
    public final sk4[] c = new sk4[2];
    public int d = 0;
    public final Rect m = new Rect();
    public final fp4 n = new fp4(this, (byte) 4);
    public final Rect o = new Rect();

    public sla() {
        float f;
        if (gba.o() == 2) {
            f = 150.0f;
        } else {
            f = 100.0f;
        }
        int L = gl.L(f);
        Point point = gl.q;
        int min = (int) Math.min(Math.min(point.x, point.y) * 0.5f, L);
        this.k = min < gl.L(80.0f) ? gl.L(80.0f) : min;
        int i = 0;
        while (true) {
            dd[] ddVarArr = this.b;
            if (i < ddVarArr.length) {
                dd ddVar = new dd((byte) 18, false);
                ddVar.c = new float[64];
                ddVar.b = 0;
                ddVarArr[i] = ddVar;
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
        mla mlaVar;
        yyc yycVar;
        float f;
        int i6;
        boolean z;
        sla slaVar = this;
        Rect rect2 = rect;
        dd[] ddVarArr = slaVar.b;
        int i7 = 0;
        for (dd ddVar : ddVarArr) {
            ddVar.b = 0;
        }
        int i8 = 0;
        while (true) {
            arrayList = slaVar.i;
            if (i8 >= 100) {
                break;
            }
            qla qlaVar = (qla) arrayList.get(i8);
            if (Rect.intersects(qlaVar.getBounds(), rect2)) {
                float[][] fArr2 = qla.D;
                int[] iArr2 = qlaVar.f;
                float[] fArr3 = qlaVar.e;
                int length = ddVarArr.length;
                float[] fArr4 = qla.C;
                if (length == fArr4.length) {
                    long currentTimeMillis = System.currentTimeMillis();
                    qlaVar.j = currentTimeMillis;
                    ArrayList arrayList2 = qlaVar.h;
                    Stack stack = qlaVar.c;
                    int i9 = qlaVar.d;
                    int length2 = fArr4.length;
                    Rect bounds = qlaVar.getBounds();
                    float f2 = bounds.left;
                    float f3 = bounds.top;
                    float width = bounds.width();
                    float height = bounds.height();
                    RectF rectF = qlaVar.z;
                    i = i8;
                    float f4 = rectF.left;
                    float f5 = rectF.top;
                    float f6 = rectF.right;
                    float f7 = rectF.bottom;
                    float N = gl.N(1.0f);
                    float f8 = rect2.left - N;
                    float f9 = rect2.top - N;
                    float f10 = rect2.right + N;
                    float f11 = rect2.bottom + N;
                    float min = (int) Math.min(currentTimeMillis - qlaVar.j, 34L);
                    float f12 = min / 500.0f;
                    int size = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = size;
                        mla mlaVar2 = (mla) arrayList2.get(i10);
                        float f13 = f6;
                        float f14 = min;
                        float min2 = Math.min(mlaVar2.g + min, mlaVar2.f);
                        mlaVar2.g = min2;
                        float f15 = mlaVar2.a;
                        float f16 = mlaVar2.b;
                        if (f15 >= f4 && f15 <= f13 && f16 >= f5 && f16 <= f7) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (min2 < mlaVar2.f && !z) {
                            float f17 = mlaVar2.e * f12;
                            mlaVar2.a = (mlaVar2.c * f17) + f15;
                            mlaVar2.b = (mlaVar2.d * f17) + f16;
                            size = i11;
                        } else {
                            if (stack.size() < i9) {
                                stack.push(mlaVar2);
                            }
                            int i12 = i11 - 1;
                            if (i10 != i12) {
                                arrayList2.set(i10, (mla) arrayList2.get(i12));
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
                                mlaVar = (mla) stack.pop();
                            } else {
                                mlaVar = new Object();
                            }
                            int i18 = 0;
                            while (true) {
                                yycVar = Utilities.c;
                                f = f20;
                                mlaVar.a = (yycVar.nextFloat() * width) + f2;
                                float nextFloat = (yycVar.nextFloat() * height) + f;
                                mlaVar.b = nextFloat;
                                int i19 = i18 + 1;
                                i6 = i15;
                                float f23 = mlaVar.a;
                                if ((f23 < f4 || f23 > f18 || nextFloat < f5 || nextFloat > f7) && i19 < 4) {
                                    i15 = i6;
                                    i18 = i19;
                                    f20 = f;
                                }
                            }
                            float[][] fArr5 = fArr2;
                            double d = ((f22 * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                            mlaVar.c = (float) Math.cos(d);
                            mlaVar.d = (float) Math.sin(d);
                            mlaVar.g = 0.0f;
                            mlaVar.f = yycVar.nextInt(2000) + 1000;
                            mlaVar.e = (f22 * 6.0f) + 4.0f;
                            mlaVar.h = yycVar.nextInt(length2);
                            arrayList2.add(mlaVar);
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
                    int i21 = qlaVar.x;
                    int i22 = 0;
                    while (i22 < size2) {
                        mla mlaVar3 = (mla) arrayList2.get(i22);
                        float f24 = mlaVar3.a;
                        float f25 = mlaVar3.b;
                        if (f24 >= f8 && f24 <= f10 && f25 >= f9 && f25 <= f11) {
                            int i23 = mlaVar3.h;
                            float[] fArr6 = fArr[i23];
                            int i24 = iArr[i23];
                            int i25 = i24 + 1;
                            if (i25 < fArr6.length) {
                                fArr6[i24] = f24;
                                fArr6[i25] = f25;
                                int i26 = i24 + 2;
                                float f26 = qlaVar.b[i23];
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
                        dd ddVar2 = ddVarArr[i28];
                        float[] fArr7 = fArr[i28];
                        int i29 = iArr[i28];
                        int i30 = ddVar2.b + i29;
                        float[] fArr8 = (float[]) ddVar2.c;
                        if (i30 > fArr8.length) {
                            fArr8 = Arrays.copyOf((float[]) ddVar2.c, Math.max(i30, fArr8.length << 1));
                            ddVar2.c = fArr8;
                        }
                        System.arraycopy(fArr7, 0, fArr8, ddVar2.b, i29);
                        ddVar2.b += i29;
                    }
                    i8 = i + 1;
                    slaVar = this;
                    rect2 = rect;
                    i7 = 0;
                }
            }
            i = i8;
            i8 = i + 1;
            slaVar = this;
            rect2 = rect;
            i7 = 0;
        }
        qla qlaVar2 = (qla) arrayList.get(i7);
        qlaVar2.getClass();
        float[] fArr9 = qla.C;
        if (ddVarArr.length == fArr9.length) {
            for (int i31 = 0; i31 < fArr9.length; i31++) {
                dd ddVar3 = ddVarArr[i31];
                Paint paint = qlaVar2.a[i31];
                int i32 = ddVar3.b;
                if (i32 > 0) {
                    canvas.drawPoints((float[]) ddVar3.c, 0, i32, paint);
                }
            }
        }
    }
}
