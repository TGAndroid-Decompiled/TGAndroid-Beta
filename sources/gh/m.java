package gh;

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
import p2.u;
public final class m {
    public static m f7429q;
    public Bitmap f7433e;
    public Canvas f7434f;
    public Paint f7435g;
    public long h;
    public ArrayList f7436i;
    public boolean f7437j;
    public final int f7438k;
    public boolean f7439l;
    public boolean f7443p;
    public final DispatchQueue f7430a = new DispatchQueue("SpoilerEffectBitmapFactory", true, 3);
    public final u[] f7431b = new u[k.C.length];
    public final g9.l[] f7432c = new g9.l[2];
    public int d = 0;
    public final Rect f7440m = new Rect();
    public final af.b f7441n = new af.b(this, 2);
    public final Rect f7442o = new Rect();

    public m() {
        float f9;
        if (SharedConfig.getDevicePerformanceClass() == 2) {
            f9 = 150.0f;
        } else {
            f9 = 100.0f;
        }
        int dp = AndroidUtilities.dp(f9);
        Point point = AndroidUtilities.displaySize;
        int min = (int) Math.min(Math.min(point.x, point.y) * 0.5f, dp);
        this.f7438k = min < AndroidUtilities.dp(80.0f) ? AndroidUtilities.dp(80.0f) : min;
        int i10 = 0;
        while (true) {
            u[] uVarArr = this.f7431b;
            if (i10 < uVarArr.length) {
                u uVar = new u((char) 0, 6);
                uVar.f45495c = new float[Math.max(64, 2)];
                uVar.f45494b = 0;
                uVarArr[i10] = uVar;
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
        float f9;
        int i12;
        int i13;
        e eVar;
        float f10;
        boolean z10;
        Rect rect2 = rect;
        u[] uVarArr = this.f7431b;
        for (u uVar : uVarArr) {
            uVar.f45494b = 0;
        }
        int i14 = 0;
        while (i14 < 100) {
            k kVar = (k) this.f7436i.get(i14);
            if (Rect.intersects(kVar.getBounds(), rect2)) {
                float[][] fArr = k.D;
                int[] iArr3 = kVar.f7407f;
                float[] fArr2 = kVar.f7406e;
                if (uVarArr != null) {
                    int length = uVarArr.length;
                    float[] fArr3 = k.C;
                    if (length == fArr3.length) {
                        long currentTimeMillis = System.currentTimeMillis();
                        int min = (int) Math.min(currentTimeMillis - kVar.f7410j, 34L);
                        kVar.f7410j = currentTimeMillis;
                        ArrayList arrayList = kVar.h;
                        Stack stack = kVar.f7405c;
                        int i15 = kVar.d;
                        int length2 = fArr3.length;
                        Rect bounds = kVar.getBounds();
                        float f11 = bounds.left;
                        float f12 = bounds.top;
                        i10 = i14;
                        float width = bounds.width();
                        float height = bounds.height();
                        RectF rectF = kVar.f7425z;
                        float f13 = rectF.left;
                        float f14 = rectF.top;
                        float f15 = rectF.right;
                        float f16 = rectF.bottom;
                        float dpf2 = AndroidUtilities.dpf2(1.0f);
                        float f17 = rect2.left - dpf2;
                        float f18 = rect2.top - dpf2;
                        float f19 = rect2.right + dpf2;
                        float f20 = rect2.bottom + dpf2;
                        float f21 = min;
                        float f22 = f21 / 500.0f;
                        int size = arrayList.size();
                        int i16 = 0;
                        while (i16 < size) {
                            int i17 = size;
                            e eVar2 = (e) arrayList.get(i16);
                            float f23 = f21;
                            float f24 = f15;
                            float min2 = Math.min(eVar2.f7374g + f23, eVar2.f7373f);
                            eVar2.f7374g = min2;
                            float f25 = eVar2.f7369a;
                            float f26 = eVar2.f7370b;
                            if (f25 >= f13 && f25 <= f24 && f26 >= f14 && f26 <= f16) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (min2 < eVar2.f7373f && !z10) {
                                float f27 = eVar2.f7372e * f22;
                                eVar2.f7369a = (eVar2.f7371c * f27) + f25;
                                eVar2.f7370b = (eVar2.d * f27) + f26;
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
                            f21 = f23;
                            f15 = f24;
                        }
                        float f28 = f15;
                        int size2 = arrayList.size();
                        if (size2 < i15) {
                            int i19 = i15 - size2;
                            int i20 = 14;
                            float f29 = -1.0f;
                            Arrays.fill(fArr2, 0, Math.min(i19, 14), -1.0f);
                            float f30 = f12;
                            int i21 = 0;
                            int i22 = 0;
                            while (i21 < i19) {
                                float f31 = fArr2[i22];
                                if (f31 == f29) {
                                    f31 = Utilities.fastRandom.nextFloat();
                                    fArr2[i22] = f31;
                                }
                                float f32 = f31;
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
                                    eVar.f7369a = (Utilities.fastRandom.nextFloat() * width) + f11;
                                    float nextFloat = (Utilities.fastRandom.nextFloat() * height) + f30;
                                    eVar.f7370b = nextFloat;
                                    int i25 = i24 + 1;
                                    f10 = f30;
                                    float f33 = eVar.f7369a;
                                    if ((f33 < f13 || f33 > f28 || nextFloat < f14 || nextFloat > f16) && i25 < 4) {
                                        f30 = f10;
                                        i24 = i25;
                                    }
                                }
                                int i26 = i21;
                                int[] iArr4 = iArr3;
                                double d = ((f32 * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                                eVar.f7371c = (float) Math.cos(d);
                                eVar.d = (float) Math.sin(d);
                                eVar.f7374g = 0.0f;
                                eVar.f7373f = Utilities.fastRandom.nextInt(2000) + 1000;
                                eVar.f7372e = (f32 * 6.0f) + 4.0f;
                                eVar.h = Utilities.fastRandom.nextInt(length2);
                                arrayList.add(eVar);
                                i21 = i26 + 1;
                                iArr3 = iArr4;
                                f30 = f10;
                                i20 = 14;
                                f29 = -1.0f;
                            }
                            iArr = iArr3;
                            size2 = arrayList.size();
                        } else {
                            iArr = iArr3;
                        }
                        for (int i27 = 0; i27 < length2; i27++) {
                            iArr[i27] = 0;
                        }
                        int i28 = kVar.f7423x;
                        int i29 = 0;
                        while (i29 < size2) {
                            e eVar3 = (e) arrayList.get(i29);
                            float f34 = eVar3.f7369a;
                            float f35 = eVar3.f7370b;
                            if (f34 >= f17 && f34 <= f19 && f35 >= f18 && f35 <= f20) {
                                int i30 = eVar3.h;
                                float[] fArr4 = fArr[i30];
                                int i31 = iArr[i30];
                                int i32 = i31 + 1;
                                if (i32 < fArr4.length) {
                                    fArr4[i31] = f34;
                                    fArr4[i32] = f35;
                                    int i33 = i31 + 2;
                                    float f36 = kVar.f7404b[i30];
                                    if (f34 < f36) {
                                        i11 = size2;
                                        int i34 = i31 + 3;
                                        iArr2 = iArr;
                                        if (i34 < fArr4.length) {
                                            fArr4[i33] = i28 + f34;
                                            fArr4[i34] = f35;
                                            i33 = i31 + 4;
                                        }
                                    } else {
                                        i11 = size2;
                                        iArr2 = iArr;
                                    }
                                    float f37 = i28;
                                    float f38 = f37 - f36;
                                    if (f34 > f38) {
                                        int i35 = i33 + 1;
                                        f9 = f37;
                                        if (i35 < fArr4.length) {
                                            fArr4[i33] = f34 - f9;
                                            fArr4[i35] = f35;
                                            i33 += 2;
                                        }
                                    } else {
                                        f9 = f37;
                                    }
                                    if (f35 < f36 && (i13 = i33 + 1) < fArr4.length) {
                                        fArr4[i33] = f34;
                                        fArr4[i13] = f35 + f9;
                                        i33 += 2;
                                    }
                                    if (f35 > f38 && (i12 = i33 + 1) < fArr4.length) {
                                        fArr4[i33] = f34;
                                        fArr4[i12] = f35 - f9;
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
                            u uVar2 = uVarArr[i36];
                            float[] fArr5 = fArr[i36];
                            int i37 = iArr5[i36];
                            int i38 = uVar2.f45494b + i37;
                            float[] fArr6 = (float[]) uVar2.f45495c;
                            if (i38 > fArr6.length) {
                                uVar2.f45495c = Arrays.copyOf((float[]) uVar2.f45495c, Math.max(i38, fArr6.length * 2));
                            }
                            System.arraycopy(fArr5, 0, (float[]) uVar2.f45495c, uVar2.f45494b, i37);
                            uVar2.f45494b += i37;
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
        k kVar2 = (k) this.f7436i.get(0);
        kVar2.getClass();
        float[] fArr7 = k.C;
        if (uVarArr != null && uVarArr.length == fArr7.length) {
            for (int i39 = 0; i39 < fArr7.length; i39++) {
                u uVar3 = uVarArr[i39];
                Paint paint = kVar2.f7403a[i39];
                int i40 = uVar3.f45494b;
                if (i40 > 0) {
                    canvas.drawPoints((float[]) uVar3.f45495c, 0, i40, paint);
                }
            }
        }
    }
}
