package jh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import p2.v;
public final class m {
    public static m f10159q;
    public Bitmap f10163e;
    public Canvas f10164f;
    public Paint f10165g;
    public long h;
    public ArrayList f10166i;
    public boolean f10167j;
    public final int f10168k;
    public boolean f10169l;
    public boolean f10173p;
    public final DispatchQueue f10160a = new DispatchQueue("SpoilerEffectBitmapFactory", true, 3);
    public final v[] f10161b = new v[k.C.length];
    public final f7.b[] f10162c = new f7.b[2];
    public int d = 0;
    public final Rect f10170m = new Rect();
    public final cf.b f10171n = new cf.b(this, 2);
    public final Rect f10172o = new Rect();

    public m() {
        float f10;
        if (SharedConfig.getDevicePerformanceClass() == 2) {
            f10 = 150.0f;
        } else {
            f10 = 100.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        Point point = AndroidUtilities.displaySize;
        int min = (int) Math.min(Math.min(point.x, point.y) * 0.5f, dp);
        this.f10168k = min < AndroidUtilities.dp(80.0f) ? AndroidUtilities.dp(80.0f) : min;
        int i10 = 0;
        while (true) {
            v[] vVarArr = this.f10161b;
            if (i10 < vVarArr.length) {
                v vVar = new v((char) 0, 7);
                vVar.f44183c = new float[Math.max(64, 2)];
                vVar.f44182b = 0;
                vVarArr[i10] = vVar;
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
        int[] iArr2;
        float f10;
        int i12;
        int i13;
        e eVar;
        float f11;
        boolean z4;
        Rect rect2 = rect;
        v[] vVarArr = this.f10161b;
        for (v vVar : vVarArr) {
            vVar.f44182b = 0;
        }
        int i14 = 0;
        while (i14 < 100) {
            k kVar = (k) this.f10166i.get(i14);
            if (Rect.intersects(kVar.getBounds(), rect2)) {
                float[][] fArr = k.D;
                int[] iArr3 = kVar.f10137f;
                float[] fArr2 = kVar.f10136e;
                if (vVarArr != null) {
                    int length = vVarArr.length;
                    float[] fArr3 = k.C;
                    if (length == fArr3.length) {
                        long currentTimeMillis = System.currentTimeMillis();
                        int min = (int) Math.min(currentTimeMillis - kVar.f10140j, 34L);
                        kVar.f10140j = currentTimeMillis;
                        ArrayList arrayList = kVar.h;
                        Stack stack = kVar.f10135c;
                        int i15 = kVar.d;
                        int length2 = fArr3.length;
                        Rect bounds = kVar.getBounds();
                        float f12 = bounds.left;
                        float f13 = bounds.top;
                        i10 = i14;
                        float width = bounds.width();
                        float height = bounds.height();
                        RectF rectF = kVar.f10155z;
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
                        int i16 = 0;
                        while (i16 < size) {
                            int i17 = size;
                            e eVar2 = (e) arrayList.get(i16);
                            float f24 = f22;
                            float f25 = f16;
                            float min2 = Math.min(eVar2.f10104g + f24, eVar2.f10103f);
                            eVar2.f10104g = min2;
                            float f26 = eVar2.f10099a;
                            float f27 = eVar2.f10100b;
                            if (f26 >= f14 && f26 <= f25 && f27 >= f15 && f27 <= f17) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (min2 < eVar2.f10103f && !z4) {
                                float f28 = eVar2.f10102e * f23;
                                eVar2.f10099a = (eVar2.f10101c * f28) + f26;
                                eVar2.f10100b = (eVar2.d * f28) + f27;
                                size = i17;
                            } else {
                                if (stack.size() < i15) {
                                    stack.push(eVar2);
                                }
                                int i18 = i17 - 1;
                                if (i16 != i18) {
                                    arrayList.set(i16, (e) arrayList.get(i18));
                                }
                                arrayList.remove(i18);
                                size = i17 - 1;
                                i16--;
                            }
                            i16++;
                            f22 = f24;
                            f16 = f25;
                        }
                        float f29 = f16;
                        int size2 = arrayList.size();
                        if (size2 < i15) {
                            int i19 = i15 - size2;
                            int i20 = 14;
                            float f30 = -1.0f;
                            Arrays.fill(fArr2, 0, Math.min(i19, 14), -1.0f);
                            float f31 = f13;
                            int i21 = 0;
                            int i22 = 0;
                            while (i21 < i19) {
                                float f32 = fArr2[i22];
                                if (f32 == f30) {
                                    f32 = Utilities.fastRandom.nextFloat();
                                    fArr2[i22] = f32;
                                }
                                float f33 = f32;
                                int i23 = i22 + 1;
                                if (i23 == i20) {
                                    i22 = 0;
                                } else {
                                    i22 = i23;
                                }
                                if (!stack.isEmpty()) {
                                    eVar = (e) stack.pop();
                                } else {
                                    eVar = new Object();
                                }
                                int i24 = 0;
                                while (true) {
                                    eVar.f10099a = (Utilities.fastRandom.nextFloat() * width) + f12;
                                    float nextFloat = (Utilities.fastRandom.nextFloat() * height) + f31;
                                    eVar.f10100b = nextFloat;
                                    int i25 = i24 + 1;
                                    f11 = f31;
                                    float f34 = eVar.f10099a;
                                    if ((f34 < f14 || f34 > f29 || nextFloat < f15 || nextFloat > f17) && i25 < 4) {
                                        f31 = f11;
                                        i24 = i25;
                                    }
                                }
                                int i26 = i21;
                                int[] iArr4 = iArr3;
                                double d = ((f33 * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                                eVar.f10101c = (float) Math.cos(d);
                                eVar.d = (float) Math.sin(d);
                                eVar.f10104g = 0.0f;
                                eVar.f10103f = Utilities.fastRandom.nextInt(2000) + 1000;
                                eVar.f10102e = (f33 * 6.0f) + 4.0f;
                                eVar.h = Utilities.fastRandom.nextInt(length2);
                                arrayList.add(eVar);
                                i21 = i26 + 1;
                                iArr3 = iArr4;
                                f31 = f11;
                                i20 = 14;
                                f30 = -1.0f;
                            }
                            iArr = iArr3;
                            size2 = arrayList.size();
                        } else {
                            iArr = iArr3;
                        }
                        for (int i27 = 0; i27 < length2; i27++) {
                            iArr[i27] = 0;
                        }
                        int i28 = kVar.f10153x;
                        int i29 = 0;
                        while (i29 < size2) {
                            e eVar3 = (e) arrayList.get(i29);
                            float f35 = eVar3.f10099a;
                            float f36 = eVar3.f10100b;
                            if (f35 >= f18 && f35 <= f20 && f36 >= f19 && f36 <= f21) {
                                int i30 = eVar3.h;
                                float[] fArr4 = fArr[i30];
                                int i31 = iArr[i30];
                                int i32 = i31 + 1;
                                if (i32 < fArr4.length) {
                                    fArr4[i31] = f35;
                                    fArr4[i32] = f36;
                                    int i33 = i31 + 2;
                                    float f37 = kVar.f10134b[i30];
                                    if (f35 < f37) {
                                        i11 = size2;
                                        int i34 = i31 + 3;
                                        iArr2 = iArr;
                                        if (i34 < fArr4.length) {
                                            fArr4[i33] = i28 + f35;
                                            fArr4[i34] = f36;
                                            i33 = i31 + 4;
                                        }
                                    } else {
                                        i11 = size2;
                                        iArr2 = iArr;
                                    }
                                    float f38 = i28;
                                    float f39 = f38 - f37;
                                    if (f35 > f39) {
                                        int i35 = i33 + 1;
                                        f10 = f38;
                                        if (i35 < fArr4.length) {
                                            fArr4[i33] = f35 - f10;
                                            fArr4[i35] = f36;
                                            i33 += 2;
                                        }
                                    } else {
                                        f10 = f38;
                                    }
                                    if (f36 < f37 && (i13 = i33 + 1) < fArr4.length) {
                                        fArr4[i33] = f35;
                                        fArr4[i13] = f36 + f10;
                                        i33 += 2;
                                    }
                                    if (f36 > f39 && (i12 = i33 + 1) < fArr4.length) {
                                        fArr4[i33] = f35;
                                        fArr4[i12] = f36 - f10;
                                        i33 += 2;
                                    }
                                    iArr2[i30] = i33;
                                    i29++;
                                    size2 = i11;
                                    iArr = iArr2;
                                }
                            }
                            i11 = size2;
                            iArr2 = iArr;
                            i29++;
                            size2 = i11;
                            iArr = iArr2;
                        }
                        int[] iArr5 = iArr;
                        for (int i36 = 0; i36 < length2; i36++) {
                            v vVar2 = vVarArr[i36];
                            float[] fArr5 = fArr[i36];
                            int i37 = iArr5[i36];
                            int i38 = vVar2.f44182b + i37;
                            float[] fArr6 = (float[]) vVar2.f44183c;
                            if (i38 > fArr6.length) {
                                vVar2.f44183c = Arrays.copyOf((float[]) vVar2.f44183c, Math.max(i38, fArr6.length * 2));
                            }
                            System.arraycopy(fArr5, 0, (float[]) vVar2.f44183c, vVar2.f44182b, i37);
                            vVar2.f44182b += i37;
                        }
                        i14 = i10 + 1;
                        rect2 = rect;
                    }
                }
            }
            i10 = i14;
            i14 = i10 + 1;
            rect2 = rect;
        }
        k kVar2 = (k) this.f10166i.get(0);
        kVar2.getClass();
        float[] fArr7 = k.C;
        if (vVarArr != null && vVarArr.length == fArr7.length) {
            for (int i39 = 0; i39 < fArr7.length; i39++) {
                v vVar3 = vVarArr[i39];
                Paint paint = kVar2.f10133a[i39];
                int i40 = vVar3.f44182b;
                if (i40 > 0) {
                    canvas.drawPoints((float[]) vVar3.f44183c, 0, i40, paint);
                }
            }
        }
    }
}
