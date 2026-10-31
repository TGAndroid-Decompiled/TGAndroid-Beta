package nh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import c5.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i0;
import org.telegram.messenger.s5;
import org.telegram.messenger.tz;
public final class k {
    public static k f13864q;
    public Bitmap e;
    public Canvas f13868f;
    public Paint f13869g;
    public long h;
    public ArrayList f13870i;
    public boolean f13871j;
    public final int f13872k;
    public boolean f13873l;
    public boolean f13877p;
    public final s5 f13865a = new s5("SpoilerEffectBitmapFactory", 3);
    public final x[] f13866b = new x[i.C.length];
    public final m4.c[] f13867c = new m4.c[2];
    public int d = 0;
    public final Rect f13874m = new Rect();
    public final jf.b f13875n = new jf.b(this, 1);
    public final Rect f13876o = new Rect();

    public k() {
        float f7;
        if (tz.o() == 2) {
            f7 = 150.0f;
        } else {
            f7 = 100.0f;
        }
        int L = i0.L(f7);
        Point point = i0.f16026q;
        int min = (int) Math.min(Math.min(point.x, point.y) * 0.5f, L);
        this.f13872k = min < i0.L(80.0f) ? i0.L(80.0f) : min;
        int i10 = 0;
        while (true) {
            x[] xVarArr = this.f13866b;
            if (i10 < xVarArr.length) {
                x xVar = new x(11, false, false);
                xVar.f3828c = new float[Math.max(64, 2)];
                xVar.f3827b = 0;
                xVarArr[i10] = xVar;
                i10++;
            } else {
                return;
            }
        }
    }

    public final void a(Canvas canvas, Rect rect) {
        int i10;
        int[] iArr;
        int i11;
        float f7;
        int i12;
        int i13;
        d dVar;
        d5.a aVar;
        float f10;
        int i14;
        boolean z10;
        Rect rect2 = rect;
        x[] xVarArr = this.f13866b;
        for (x xVar : xVarArr) {
            xVar.f3827b = 0;
        }
        int i15 = 0;
        while (i15 < 100) {
            i iVar = (i) this.f13870i.get(i15);
            if (Rect.intersects(iVar.getBounds(), rect2)) {
                float[][] fArr = i.D;
                int[] iArr2 = iVar.f13842f;
                float[] fArr2 = iVar.e;
                int length = xVarArr.length;
                float[] fArr3 = i.C;
                if (length == fArr3.length) {
                    long currentTimeMillis = System.currentTimeMillis();
                    iVar.f13845j = currentTimeMillis;
                    ArrayList arrayList = iVar.h;
                    Stack stack = iVar.f13841c;
                    int i16 = iVar.d;
                    int length2 = fArr3.length;
                    Rect bounds = iVar.getBounds();
                    float f11 = bounds.left;
                    float f12 = bounds.top;
                    i10 = i15;
                    float width = bounds.width();
                    float height = bounds.height();
                    RectF rectF = iVar.f13860z;
                    float f13 = rectF.left;
                    float f14 = rectF.top;
                    float f15 = rectF.right;
                    float f16 = rectF.bottom;
                    float N = i0.N(1.0f);
                    float f17 = rect2.left - N;
                    float f18 = rect2.top - N;
                    float f19 = rect2.right + N;
                    float f20 = rect2.bottom + N;
                    float min = (int) Math.min(currentTimeMillis - iVar.f13845j, 34L);
                    float f21 = min / 500.0f;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        int i18 = size;
                        d dVar2 = (d) arrayList.get(i17);
                        float f22 = min;
                        float f23 = f15;
                        float min2 = Math.min(dVar2.f13813g + f22, dVar2.f13812f);
                        dVar2.f13813g = min2;
                        float f24 = dVar2.f13809a;
                        float f25 = dVar2.f13810b;
                        if (f24 >= f13 && f24 <= f23 && f25 >= f14 && f25 <= f16) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (min2 < dVar2.f13812f && !z10) {
                            float f26 = dVar2.e * f21;
                            dVar2.f13809a = (dVar2.f13811c * f26) + f24;
                            dVar2.f13810b = (dVar2.d * f26) + f25;
                            size = i18;
                        } else {
                            if (stack.size() < i16) {
                                stack.push(dVar2);
                            }
                            int i19 = i18 - 1;
                            if (i17 != i19) {
                                arrayList.set(i17, (d) arrayList.get(i19));
                            }
                            arrayList.remove(i19);
                            size = i18 - 1;
                            i17--;
                        }
                        i17++;
                        min = f22;
                        f15 = f23;
                    }
                    float f27 = f15;
                    int size2 = arrayList.size();
                    if (size2 < i16) {
                        int i20 = i16 - size2;
                        int i21 = 14;
                        float f28 = -1.0f;
                        Arrays.fill(fArr2, 0, Math.min(i20, 14), -1.0f);
                        float f29 = f12;
                        int i22 = 0;
                        int i23 = 0;
                        while (i22 < i20) {
                            float f30 = fArr2[i23];
                            if (f30 == f28) {
                                f30 = Utilities.f14520c.nextFloat();
                                fArr2[i23] = f30;
                            }
                            float f31 = f30;
                            int i24 = i23 + 1;
                            if (i24 == i21) {
                                i23 = 0;
                            } else {
                                i23 = i24;
                            }
                            if (!stack.isEmpty()) {
                                dVar = (d) stack.pop();
                            } else {
                                dVar = new Object();
                            }
                            int i25 = 0;
                            while (true) {
                                aVar = Utilities.f14520c;
                                f10 = f29;
                                dVar.f13809a = (aVar.nextFloat() * width) + f11;
                                float nextFloat = (aVar.nextFloat() * height) + f10;
                                dVar.f13810b = nextFloat;
                                int i26 = i25 + 1;
                                i14 = i22;
                                float f32 = dVar.f13809a;
                                if ((f32 < f13 || f32 > f27 || nextFloat < f14 || nextFloat > f16) && i26 < 4) {
                                    i22 = i14;
                                    i25 = i26;
                                    f29 = f10;
                                }
                            }
                            int[] iArr3 = iArr2;
                            double d = ((f31 * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                            dVar.f13811c = (float) Math.cos(d);
                            dVar.d = (float) Math.sin(d);
                            dVar.f13813g = 0.0f;
                            dVar.f13812f = aVar.nextInt(2000) + 1000;
                            dVar.e = (f31 * 6.0f) + 4.0f;
                            dVar.h = aVar.nextInt(length2);
                            arrayList.add(dVar);
                            i22 = i14 + 1;
                            iArr2 = iArr3;
                            f29 = f10;
                            i21 = 14;
                            f28 = -1.0f;
                        }
                        iArr = iArr2;
                        size2 = arrayList.size();
                    } else {
                        iArr = iArr2;
                    }
                    for (int i27 = 0; i27 < length2; i27++) {
                        iArr[i27] = 0;
                    }
                    int i28 = iVar.f13858x;
                    int i29 = 0;
                    while (i29 < size2) {
                        d dVar3 = (d) arrayList.get(i29);
                        float f33 = dVar3.f13809a;
                        float f34 = dVar3.f13810b;
                        if (f33 >= f17 && f33 <= f19 && f34 >= f18 && f34 <= f20) {
                            int i30 = dVar3.h;
                            float[] fArr4 = fArr[i30];
                            int i31 = iArr[i30];
                            int i32 = i31 + 1;
                            if (i32 < fArr4.length) {
                                fArr4[i31] = f33;
                                fArr4[i32] = f34;
                                int i33 = i31 + 2;
                                float f35 = iVar.f13840b[i30];
                                if (f33 < f35) {
                                    int i34 = i31 + 3;
                                    i11 = size2;
                                    if (i34 < fArr4.length) {
                                        fArr4[i33] = i28 + f33;
                                        fArr4[i34] = f34;
                                        i33 = i31 + 4;
                                    }
                                } else {
                                    i11 = size2;
                                }
                                float f36 = i28;
                                float f37 = f36 - f35;
                                if (f33 > f37) {
                                    int i35 = i33 + 1;
                                    f7 = f36;
                                    if (i35 < fArr4.length) {
                                        fArr4[i33] = f33 - f7;
                                        fArr4[i35] = f34;
                                        i33 += 2;
                                    }
                                } else {
                                    f7 = f36;
                                }
                                if (f34 < f35 && (i13 = i33 + 1) < fArr4.length) {
                                    fArr4[i33] = f33;
                                    fArr4[i13] = f34 + f7;
                                    i33 += 2;
                                }
                                if (f34 > f37 && (i12 = i33 + 1) < fArr4.length) {
                                    fArr4[i33] = f33;
                                    fArr4[i12] = f34 - f7;
                                    i33 += 2;
                                }
                                iArr[i30] = i33;
                                i29++;
                                size2 = i11;
                            }
                        }
                        i11 = size2;
                        i29++;
                        size2 = i11;
                    }
                    for (int i36 = 0; i36 < length2; i36++) {
                        x xVar2 = xVarArr[i36];
                        float[] fArr5 = fArr[i36];
                        int i37 = iArr[i36];
                        int i38 = xVar2.f3827b + i37;
                        float[] fArr6 = (float[]) xVar2.f3828c;
                        if (i38 > fArr6.length) {
                            xVar2.f3828c = Arrays.copyOf((float[]) xVar2.f3828c, Math.max(i38, fArr6.length * 2));
                        }
                        System.arraycopy(fArr5, 0, (float[]) xVar2.f3828c, xVar2.f3827b, i37);
                        xVar2.f3827b += i37;
                    }
                    i15 = i10 + 1;
                    rect2 = rect;
                }
            }
            i10 = i15;
            i15 = i10 + 1;
            rect2 = rect;
        }
        i iVar2 = (i) this.f13870i.get(0);
        iVar2.getClass();
        float[] fArr7 = i.C;
        if (xVarArr.length == fArr7.length) {
            for (int i39 = 0; i39 < fArr7.length; i39++) {
                x xVar3 = xVarArr[i39];
                Paint paint = iVar2.f13839a[i39];
                int i40 = xVar3.f3827b;
                if (i40 > 0) {
                    canvas.drawPoints((float[]) xVar3.f3828c, 0, i40, paint);
                }
            }
        }
    }
}
