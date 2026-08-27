package eh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import n2.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

public final class m {

    public static m f5537q;

    public Bitmap f5541e;

    public Canvas f5542f;

    public Paint f5543g;
    public long h;

    public ArrayList f5544i;

    public boolean f5545j;

    public final int f5546k;

    public boolean f5547l;

    public boolean f5551p;

    public final DispatchQueue f5538a = new DispatchQueue("SpoilerEffectBitmapFactory", true, 3);

    public final v[] f5539b = new v[k.C.length];

    public final xe.b[] f5540c = new xe.b[2];
    public int d = 0;

    public final Rect f5548m = new Rect();

    public final e2.f f5549n = new e2.f(this, 1);

    public final Rect f5550o = new Rect();

    public m() {
        int iDp = AndroidUtilities.dp(SharedConfig.getDevicePerformanceClass() == 2 ? 150.0f : 100.0f);
        Point point = AndroidUtilities.displaySize;
        int iMin = (int) Math.min(Math.min(point.x, point.y) * 0.5f, iDp);
        this.f5546k = iMin < AndroidUtilities.dp(80.0f) ? AndroidUtilities.dp(80.0f) : iMin;
        int i10 = 0;
        while (true) {
            v[] vVarArr = this.f5539b;
            if (i10 >= vVarArr.length) {
                return;
            }
            v vVar = new v((char) 0, 4);
            vVar.f18187c = new float[Math.max(64, 2)];
            vVar.f18186b = 0;
            vVarArr[i10] = vVar;
            i10++;
        }
    }

    public final void a(Canvas canvas, Rect rect) {
        int[] iArr;
        int i10;
        int[] iArr2;
        float f10;
        int i11;
        int i12;
        float f11;
        v[] vVarArr = this.f5539b;
        for (v vVar : vVarArr) {
            vVar.f18186b = 0;
        }
        for (int i13 = 0; i13 < 100; i13++) {
            k kVar = (k) this.f5544i.get(i13);
            if (Rect.intersects(kVar.getBounds(), rect)) {
                float[][] fArr = k.D;
                int[] iArr3 = kVar.f5515f;
                float[] fArr2 = kVar.f5514e;
                if (vVarArr != null) {
                    int length = vVarArr.length;
                    float[] fArr3 = k.C;
                    if (length == fArr3.length) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int iMin = (int) Math.min(jCurrentTimeMillis - kVar.f5518j, 34L);
                        kVar.f5518j = jCurrentTimeMillis;
                        ArrayList arrayList = kVar.h;
                        Stack stack = kVar.f5513c;
                        int i14 = kVar.d;
                        int length2 = fArr3.length;
                        Rect bounds = kVar.getBounds();
                        float f12 = bounds.left;
                        float f13 = bounds.top;
                        float fWidth = bounds.width();
                        float fHeight = bounds.height();
                        RectF rectF = kVar.f5533z;
                        float f14 = rectF.left;
                        float f15 = rectF.top;
                        float f16 = rectF.right;
                        float f17 = rectF.bottom;
                        float fDpf2 = AndroidUtilities.dpf2(1.0f);
                        float f18 = rect.left - fDpf2;
                        float f19 = rect.top - fDpf2;
                        float f20 = rect.right + fDpf2;
                        float f21 = rect.bottom + fDpf2;
                        float f22 = iMin;
                        float f23 = f22 / 500.0f;
                        int size = arrayList.size();
                        int i15 = 0;
                        while (i15 < size) {
                            int i16 = size;
                            e eVar = (e) arrayList.get(i15);
                            float f24 = f22;
                            float f25 = f16;
                            float fMin = Math.min(eVar.f5482g + f24, eVar.f5481f);
                            eVar.f5482g = fMin;
                            float f26 = eVar.f5477a;
                            float f27 = eVar.f5478b;
                            boolean z10 = f26 < f14 || f26 > f25 || f27 < f15 || f27 > f17;
                            if (fMin >= eVar.f5481f || z10) {
                                if (stack.size() < i14) {
                                    stack.push(eVar);
                                }
                                int i17 = i16 - 1;
                                if (i15 != i17) {
                                    arrayList.set(i15, (e) arrayList.get(i17));
                                }
                                arrayList.remove(i17);
                                size = i16 - 1;
                                i15--;
                            } else {
                                float f28 = eVar.f5480e * f23;
                                eVar.f5477a = (eVar.f5479c * f28) + f26;
                                eVar.f5478b = (eVar.d * f28) + f27;
                                size = i16;
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
                                float fNextFloat = fArr2[i21];
                                if (fNextFloat == f30) {
                                    fNextFloat = Utilities.fastRandom.nextFloat();
                                    fArr2[i21] = fNextFloat;
                                }
                                float f32 = fNextFloat;
                                int i22 = i21 + 1;
                                i21 = i22 == i19 ? 0 : i22;
                                e eVar2 = !stack.isEmpty() ? (e) stack.pop() : new e();
                                int i23 = 0;
                                while (true) {
                                    eVar2.f5477a = (Utilities.fastRandom.nextFloat() * fWidth) + f12;
                                    float fNextFloat2 = (Utilities.fastRandom.nextFloat() * fHeight) + f31;
                                    eVar2.f5478b = fNextFloat2;
                                    int i24 = i23 + 1;
                                    f11 = f31;
                                    float f33 = eVar2.f5477a;
                                    if ((f33 >= f14 && f33 <= f29 && fNextFloat2 >= f15 && fNextFloat2 <= f17) || i24 >= 4) {
                                        break;
                                    }
                                    f31 = f11;
                                    i23 = i24;
                                }
                                int i25 = i20;
                                int[] iArr4 = iArr3;
                                double d = ((((double) f32) * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                                eVar2.f5479c = (float) Math.cos(d);
                                eVar2.d = (float) Math.sin(d);
                                eVar2.f5482g = 0.0f;
                                eVar2.f5481f = Utilities.fastRandom.nextInt(2000) + 1000;
                                eVar2.f5480e = (f32 * 6.0f) + 4.0f;
                                eVar2.h = Utilities.fastRandom.nextInt(length2);
                                arrayList.add(eVar2);
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
                        int i27 = kVar.f5531x;
                        int i28 = 0;
                        while (i28 < size2) {
                            e eVar3 = (e) arrayList.get(i28);
                            float f34 = eVar3.f5477a;
                            float f35 = eVar3.f5478b;
                            if (f34 < f18 || f34 > f20 || f35 < f19 || f35 > f21) {
                                i10 = size2;
                                iArr2 = iArr;
                            } else {
                                int i29 = eVar3.h;
                                float[] fArr4 = fArr[i29];
                                int i30 = iArr[i29];
                                int i31 = i30 + 1;
                                if (i31 >= fArr4.length) {
                                    i10 = size2;
                                    iArr2 = iArr;
                                } else {
                                    fArr4[i30] = f34;
                                    fArr4[i31] = f35;
                                    int i32 = i30 + 2;
                                    float f36 = kVar.f5512b[i29];
                                    if (f34 < f36) {
                                        i10 = size2;
                                        int i33 = i30 + 3;
                                        iArr2 = iArr;
                                        if (i33 < fArr4.length) {
                                            fArr4[i32] = i27 + f34;
                                            fArr4[i33] = f35;
                                            i32 = i30 + 4;
                                        }
                                    } else {
                                        i10 = size2;
                                        iArr2 = iArr;
                                    }
                                    float f37 = i27;
                                    float f38 = f37 - f36;
                                    if (f34 > f38) {
                                        int i34 = i32 + 1;
                                        f10 = f37;
                                        if (i34 < fArr4.length) {
                                            fArr4[i32] = f34 - f10;
                                            fArr4[i34] = f35;
                                            i32 += 2;
                                        }
                                    } else {
                                        f10 = f37;
                                    }
                                    if (f35 < f36 && (i12 = i32 + 1) < fArr4.length) {
                                        fArr4[i32] = f34;
                                        fArr4[i12] = f35 + f10;
                                        i32 += 2;
                                    }
                                    if (f35 > f38 && (i11 = i32 + 1) < fArr4.length) {
                                        fArr4[i32] = f34;
                                        fArr4[i11] = f35 - f10;
                                        i32 += 2;
                                    }
                                    iArr2[i29] = i32;
                                }
                            }
                            i28++;
                            size2 = i10;
                            iArr = iArr2;
                        }
                        int[] iArr5 = iArr;
                        for (int i35 = 0; i35 < length2; i35++) {
                            v vVar2 = vVarArr[i35];
                            float[] fArr5 = fArr[i35];
                            int i36 = iArr5[i35];
                            int i37 = vVar2.f18186b + i36;
                            float[] fArr6 = (float[]) vVar2.f18187c;
                            if (i37 > fArr6.length) {
                                vVar2.f18187c = Arrays.copyOf((float[]) vVar2.f18187c, Math.max(i37, fArr6.length * 2));
                            }
                            System.arraycopy(fArr5, 0, (float[]) vVar2.f18187c, vVar2.f18186b, i36);
                            vVar2.f18186b += i36;
                        }
                    }
                }
            }
        }
        k kVar2 = (k) this.f5544i.get(0);
        kVar2.getClass();
        float[] fArr7 = k.C;
        if (vVarArr == null || vVarArr.length != fArr7.length) {
            return;
        }
        for (int i38 = 0; i38 < fArr7.length; i38++) {
            v vVar3 = vVarArr[i38];
            Paint paint = kVar2.f5511a[i38];
            int i39 = vVar3.f18186b;
            if (i39 > 0) {
                canvas.drawPoints((float[]) vVar3.f18187c, 0, i39, paint);
            }
        }
    }
}
