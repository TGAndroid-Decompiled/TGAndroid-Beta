package dh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import n2.w;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class o {
    public static o f4641q;
    public Bitmap f4645e;
    public Canvas f4646f;
    public Paint f4647g;
    public long h;
    public ArrayList f4648i;
    public boolean f4649j;
    public final int f4650k;
    public boolean f4651l;
    public boolean f4655p;
    public final DispatchQueue f4642a = new DispatchQueue("SpoilerEffectBitmapFactory", true, 3);
    public final w[] f4643b = new w[l.C.length];
    public final we.b[] f4644c = new we.b[2];
    public int d = 0;
    public final Rect f4652m = new Rect();
    public final m f4653n = new m(this, 0);
    public final Rect f4654o = new Rect();

    public o() {
        float f10;
        if (SharedConfig.getDevicePerformanceClass() == 2) {
            f10 = 150.0f;
        } else {
            f10 = 100.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        Point point = AndroidUtilities.displaySize;
        int min = (int) Math.min(Math.min(point.x, point.y) * 0.5f, dp);
        this.f4650k = min < AndroidUtilities.dp(80.0f) ? AndroidUtilities.dp(80.0f) : min;
        int i9 = 0;
        while (true) {
            w[] wVarArr = this.f4643b;
            if (i9 < wVarArr.length) {
                w wVar = new w((char) 0, 4);
                wVar.f18361c = new float[Math.max(64, 2)];
                wVar.f18360b = 0;
                wVarArr[i9] = wVar;
                i9++;
            } else {
                return;
            }
        }
    }

    public final void a(Canvas canvas, Rect rect) {
        int i9;
        int[] iArr;
        int i10;
        int[] iArr2;
        float f10;
        int i11;
        int i12;
        e eVar;
        float f11;
        boolean z10;
        Rect rect2 = rect;
        w[] wVarArr = this.f4643b;
        for (w wVar : wVarArr) {
            wVar.f18360b = 0;
        }
        int i13 = 0;
        while (i13 < 100) {
            l lVar = (l) this.f4648i.get(i13);
            if (Rect.intersects(lVar.getBounds(), rect2)) {
                float[][] fArr = l.D;
                int[] iArr3 = lVar.f4617f;
                float[] fArr2 = lVar.f4616e;
                if (wVarArr != null) {
                    int length = wVarArr.length;
                    float[] fArr3 = l.C;
                    if (length == fArr3.length) {
                        long currentTimeMillis = System.currentTimeMillis();
                        int min = (int) Math.min(currentTimeMillis - lVar.f4620j, 34L);
                        lVar.f4620j = currentTimeMillis;
                        ArrayList arrayList = lVar.h;
                        Stack stack = lVar.f4615c;
                        int i14 = lVar.d;
                        int length2 = fArr3.length;
                        Rect bounds = lVar.getBounds();
                        float f12 = bounds.left;
                        float f13 = bounds.top;
                        i9 = i13;
                        float width = bounds.width();
                        float height = bounds.height();
                        RectF rectF = lVar.f4635z;
                        float f14 = rectF.left;
                        float f15 = rectF.top;
                        float f16 = rectF.right;
                        float f17 = rectF.bottom;
                        float dpf2 = AndroidUtilities.dpf2(1.0f);
                        float f18 = rect2.left - dpf2;
                        float f19 = rect2.top - dpf2;
                        float f20 = rect2.right + dpf2;
                        float f21 = rect2.bottom + dpf2;
                        float f22 = min;
                        float f23 = f22 / 500.0f;
                        int size = arrayList.size();
                        int i15 = 0;
                        while (i15 < size) {
                            int i16 = size;
                            e eVar2 = (e) arrayList.get(i15);
                            float f24 = f22;
                            float f25 = f16;
                            float min2 = Math.min(eVar2.f4583g + f24, eVar2.f4582f);
                            eVar2.f4583g = min2;
                            float f26 = eVar2.f4578a;
                            float f27 = eVar2.f4579b;
                            if (f26 >= f14 && f26 <= f25 && f27 >= f15 && f27 <= f17) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (min2 < eVar2.f4582f && !z10) {
                                float f28 = eVar2.f4581e * f23;
                                eVar2.f4578a = (eVar2.f4580c * f28) + f26;
                                eVar2.f4579b = (eVar2.d * f28) + f27;
                                size = i16;
                            } else {
                                if (stack.size() < i14) {
                                    stack.push(eVar2);
                                }
                                int i17 = i16 - 1;
                                if (i15 != i17) {
                                    arrayList.set(i15, (e) arrayList.get(i17));
                                }
                                arrayList.remove(i17);
                                size = i16 - 1;
                                i15--;
                            }
                            i15++;
                            f22 = f24;
                            f16 = f25;
                        }
                        float f29 = f16;
                        int size2 = arrayList.size();
                        if (size2 < i14) {
                            int i18 = i14 - size2;
                            int i19 = 14;
                            float f30 = -1.0f;
                            Arrays.fill(fArr2, 0, Math.min(i18, 14), -1.0f);
                            float f31 = f13;
                            int i20 = 0;
                            int i21 = 0;
                            while (i20 < i18) {
                                float f32 = fArr2[i21];
                                if (f32 == f30) {
                                    f32 = Utilities.fastRandom.nextFloat();
                                    fArr2[i21] = f32;
                                }
                                float f33 = f32;
                                int i22 = i21 + 1;
                                if (i22 == i19) {
                                    i21 = 0;
                                } else {
                                    i21 = i22;
                                }
                                if (!stack.isEmpty()) {
                                    eVar = (e) stack.pop();
                                } else {
                                    eVar = new Object();
                                }
                                int i23 = 0;
                                while (true) {
                                    eVar.f4578a = (Utilities.fastRandom.nextFloat() * width) + f12;
                                    float nextFloat = (Utilities.fastRandom.nextFloat() * height) + f31;
                                    eVar.f4579b = nextFloat;
                                    int i24 = i23 + 1;
                                    f11 = f31;
                                    float f34 = eVar.f4578a;
                                    if ((f34 < f14 || f34 > f29 || nextFloat < f15 || nextFloat > f17) && i24 < 4) {
                                        f31 = f11;
                                        i23 = i24;
                                    }
                                }
                                int i25 = i20;
                                int[] iArr4 = iArr3;
                                double d = ((f33 * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                                eVar.f4580c = (float) Math.cos(d);
                                eVar.d = (float) Math.sin(d);
                                eVar.f4583g = 0.0f;
                                eVar.f4582f = Utilities.fastRandom.nextInt(2000) + 1000;
                                eVar.f4581e = (f33 * 6.0f) + 4.0f;
                                eVar.h = Utilities.fastRandom.nextInt(length2);
                                arrayList.add(eVar);
                                i20 = i25 + 1;
                                iArr3 = iArr4;
                                f31 = f11;
                                i19 = 14;
                                f30 = -1.0f;
                            }
                            iArr = iArr3;
                            size2 = arrayList.size();
                        } else {
                            iArr = iArr3;
                        }
                        for (int i26 = 0; i26 < length2; i26++) {
                            iArr[i26] = 0;
                        }
                        int i27 = lVar.f4633x;
                        int i28 = 0;
                        while (i28 < size2) {
                            e eVar3 = (e) arrayList.get(i28);
                            float f35 = eVar3.f4578a;
                            float f36 = eVar3.f4579b;
                            if (f35 >= f18 && f35 <= f20 && f36 >= f19 && f36 <= f21) {
                                int i29 = eVar3.h;
                                float[] fArr4 = fArr[i29];
                                int i30 = iArr[i29];
                                int i31 = i30 + 1;
                                if (i31 < fArr4.length) {
                                    fArr4[i30] = f35;
                                    fArr4[i31] = f36;
                                    int i32 = i30 + 2;
                                    float f37 = lVar.f4614b[i29];
                                    if (f35 < f37) {
                                        i10 = size2;
                                        int i33 = i30 + 3;
                                        iArr2 = iArr;
                                        if (i33 < fArr4.length) {
                                            fArr4[i32] = i27 + f35;
                                            fArr4[i33] = f36;
                                            i32 = i30 + 4;
                                        }
                                    } else {
                                        i10 = size2;
                                        iArr2 = iArr;
                                    }
                                    float f38 = i27;
                                    float f39 = f38 - f37;
                                    if (f35 > f39) {
                                        int i34 = i32 + 1;
                                        f10 = f38;
                                        if (i34 < fArr4.length) {
                                            fArr4[i32] = f35 - f10;
                                            fArr4[i34] = f36;
                                            i32 += 2;
                                        }
                                    } else {
                                        f10 = f38;
                                    }
                                    if (f36 < f37 && (i12 = i32 + 1) < fArr4.length) {
                                        fArr4[i32] = f35;
                                        fArr4[i12] = f36 + f10;
                                        i32 += 2;
                                    }
                                    if (f36 > f39 && (i11 = i32 + 1) < fArr4.length) {
                                        fArr4[i32] = f35;
                                        fArr4[i11] = f36 - f10;
                                        i32 += 2;
                                    }
                                    iArr2[i29] = i32;
                                    i28++;
                                    size2 = i10;
                                    iArr = iArr2;
                                }
                            }
                            i10 = size2;
                            iArr2 = iArr;
                            i28++;
                            size2 = i10;
                            iArr = iArr2;
                        }
                        int[] iArr5 = iArr;
                        for (int i35 = 0; i35 < length2; i35++) {
                            w wVar2 = wVarArr[i35];
                            float[] fArr5 = fArr[i35];
                            int i36 = iArr5[i35];
                            int i37 = wVar2.f18360b + i36;
                            float[] fArr6 = (float[]) wVar2.f18361c;
                            if (i37 > fArr6.length) {
                                wVar2.f18361c = Arrays.copyOf((float[]) wVar2.f18361c, Math.max(i37, fArr6.length * 2));
                            }
                            System.arraycopy(fArr5, 0, (float[]) wVar2.f18361c, wVar2.f18360b, i36);
                            wVar2.f18360b += i36;
                        }
                        i13 = i9 + 1;
                        rect2 = rect;
                    }
                }
            }
            i9 = i13;
            i13 = i9 + 1;
            rect2 = rect;
        }
        l lVar2 = (l) this.f4648i.get(0);
        lVar2.getClass();
        float[] fArr7 = l.C;
        if (wVarArr != null && wVarArr.length == fArr7.length) {
            for (int i38 = 0; i38 < fArr7.length; i38++) {
                w wVar3 = wVarArr[i38];
                Paint paint = lVar2.f4613a[i38];
                int i39 = wVar3.f18360b;
                if (i39 > 0) {
                    canvas.drawPoints((float[]) wVar3.f18361c, 0, i39, paint);
                }
            }
        }
    }
}
