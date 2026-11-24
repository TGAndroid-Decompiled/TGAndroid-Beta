package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.LaunchActivity;
public final class va5 extends ViewGroup {
    public final ua5 E;
    public float F;
    public long G;
    public long H;
    public int[] I;
    public final o04 J;
    public final za5 K;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final TextView d;
    public final ImageView e;
    public final oa1 f;
    public final int h;
    public float n;
    public float r;
    public ValueAnimator s;
    public boolean w;
    public long x;
    public boolean y;

    public va5(za5 za5Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.K = za5Var;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.h = gm.L(2.0f);
        this.r = 1.0f;
        this.E = new ua5(this, (byte) 1);
        this.J = new o04(this, (byte) 12);
        setBackgroundColor(-16777216);
        setChildrenDrawingOrderEnabled(true);
        this.n = za5Var.c;
        ImageView imageView = new ImageView(launchActivity);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(-1);
        imageView.setBackground(cmb.K(gm.L(28.0f), 1711276032));
        addView(imageView);
        TextView textView = new TextView(launchActivity);
        this.d = textView;
        textView.setTextColor(-1275068417);
        textView.setTextSize(1, 11.0f);
        textView.setSingleLine();
        textView.setGravity(1);
        textView.setShadowLayer(gm.L(2.0f), 0.0f, 0.0f, Integer.MIN_VALUE);
        textView.setVisibility(8);
        addView(textView);
        oa1 oa1Var = new oa1(launchActivity);
        this.f = oa1Var;
        addView(oa1Var);
    }

    public final void a() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ya5 ya5Var = (ya5) obj;
            ya5Var.b();
            removeView(ya5Var);
        }
        arrayList.clear();
        this.I = null;
    }

    public final boolean b() {
        Activity W = gm.W(getContext());
        if (W != null && gm.F1(W) && SystemClock.elapsedRealtime() - this.x > 1000) {
            return true;
        }
        return false;
    }

    public final void c(ya5 ya5Var, int i, int i2) {
        float f;
        float f2;
        float f3;
        float[] fArr = ya5Var.P;
        float f4 = this.r;
        for (int i3 = 0; i3 < 4; i3++) {
            float f5 = ya5Var.N[i3];
            fArr[i3] = td4.A(ya5Var.O[i3], f5, f4, f5);
        }
        float f6 = this.h / 2.0f;
        float f7 = fArr[0];
        float f8 = i;
        float f9 = f7 * f8;
        if (f7 > 0.001f) {
            f = f6;
        } else {
            f = 0.0f;
        }
        int round = Math.round(f9 + f);
        float f10 = fArr[1];
        float f11 = i2;
        float f12 = f10 * f11;
        if (f10 > 0.001f) {
            f2 = f6;
        } else {
            f2 = 0.0f;
        }
        int round2 = Math.round(f12 + f2);
        float f13 = fArr[2];
        float f14 = f8 * f13;
        if (f13 < 0.999f) {
            f3 = f6;
        } else {
            f3 = 0.0f;
        }
        int round3 = Math.round(f14 - f3);
        float f15 = fArr[3];
        float f16 = f11 * f15;
        if (f15 >= 0.999f) {
            f6 = 0.0f;
        }
        int round4 = Math.round(f16 - f6);
        int max = Math.max(1, round3 - round);
        int max2 = Math.max(1, round4 - round2);
        if (ya5Var.getMeasuredWidth() != max || ya5Var.getMeasuredHeight() != max2 || ya5Var.isLayoutRequested()) {
            ya5Var.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(max2, 1073741824));
        }
        ya5Var.layout(round, round2, max + round, max2 + round2);
        float f17 = this.r;
        float f18 = ya5Var.Q;
        float f19 = ((ya5Var.R - f18) * f17) + f18;
        ya5Var.setAlpha(f19);
        float f20 = (f19 * 0.2f) + 0.8f;
        ya5Var.setScaleX(f20);
        ya5Var.setScaleY(f20);
    }

    public final void d() {
        int width = getWidth();
        int height = getHeight();
        if (width != 0 && height != 0) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                c((ya5) obj, width, height);
            }
            ArrayList arrayList2 = this.a;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                c((ya5) obj2, width, height);
            }
            invalidate();
        }
    }

    public final boolean e(int i, int i2) {
        if (Math.abs(Math.log((i / i2) / this.n)) < 0.06d) {
            return true;
        }
        return false;
    }

    public final void f(boolean z) {
        float f;
        boolean z2;
        int i;
        boolean z3;
        float f2;
        String str;
        float f3;
        int i2;
        boolean z4;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int[] iArr = new int[size];
        boolean z5 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ya5 ya5Var = (ya5) arrayList.get(i3);
            float f4 = ya5Var.K;
            fArr[i3] = f4;
            rd2 rd2Var = ya5Var.b;
            if (rd2Var != null && rd2Var.b) {
                f3 = 2.0f;
            } else {
                f3 = 1.0f;
            }
            fArr2[i3] = f3;
            boolean z6 = ya5Var.M;
            if (z6) {
                i2 = i3;
            } else {
                i2 = -1;
            }
            iArr[i3] = i2;
            if (z6 && ya5Var.L <= 0.0f && f4 > 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 |= z4;
        }
        if (z5) {
            f = 0.0f;
        } else {
            f = this.n;
        }
        yg7 a = gre.a(fArr, fArr2, 0.45f, 2.35f, iArr, f);
        int width = getWidth();
        int height = getHeight();
        float f5 = 0.001f;
        if (Math.abs(a.a - this.n) <= 0.001f && width > 0 && height > 0 && !e(width, height) && b()) {
            float f6 = width / height;
            a = gre.a(fArr, fArr2, f6, f6, iArr, 0.0f);
            z2 = true;
        } else {
            z2 = false;
        }
        this.F = a.a;
        if (e21.a) {
            StringBuilder sb = new StringBuilder("group call pip: mosaic ");
            sb.append(Arrays.toString(fArr));
            if (z2) {
                str = " in the window";
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(" -> ");
            sb.append(a);
            fc4.b(sb.toString());
        }
        int size2 = arrayList.size();
        int i4 = 0;
        while (true) {
            i = 4;
            if (i4 >= size2) {
                break;
            }
            Object obj = arrayList.get(i4);
            i4++;
            ya5 ya5Var2 = (ya5) obj;
            float f7 = this.r;
            float f8 = f5;
            float[] fArr3 = ya5Var2.N;
            for (int i5 = 0; i5 < 4; i5++) {
                float f9 = fArr3[i5];
                fArr3[i5] = td4.A(ya5Var2.O[i5], f9, f7, f9);
            }
            float f10 = ya5Var2.Q;
            ya5Var2.Q = td4.A(ya5Var2.R, f10, f7, f10);
            f5 = f8;
        }
        float f11 = f5;
        ArrayList arrayList2 = this.b;
        int size3 = arrayList2.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj2 = arrayList2.get(i6);
            i6++;
            ya5 ya5Var3 = (ya5) obj2;
            float f12 = this.r;
            float[] fArr4 = ya5Var3.N;
            float[] fArr5 = ya5Var3.O;
            int i7 = 0;
            while (i7 < i) {
                float f13 = fArr4[i7];
                fArr4[i7] = td4.A(fArr5[i7], f13, f12, f13);
                i7++;
                i = 4;
            }
            float f14 = ya5Var3.Q;
            ya5Var3.Q = td4.A(ya5Var3.R, f14, f12, f14);
            System.arraycopy(ya5Var3.N, 0, fArr5, 0, 4);
            ya5Var3.R = 0.0f;
            i = 4;
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            ya5 ya5Var4 = (ya5) arrayList.get(i8);
            System.arraycopy(a.b, i8 << 2, ya5Var4.O, 0, 4);
            ya5Var4.R = 1.0f;
            ya5Var4.L = fArr[i8];
            if (!ya5Var4.M || !z) {
                System.arraycopy(ya5Var4.O, 0, ya5Var4.N, 0, 4);
                if (z) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                ya5Var4.Q = f2;
                ya5Var4.M = true;
            }
        }
        for (int i9 : a.c) {
            arrayList3.add((ya5) arrayList.get(i9));
        }
        arrayList.clear();
        arrayList.addAll(arrayList3);
        this.I = null;
        if (!z2 && Math.abs(a.a - this.n) > f11) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.n = a.a;
            ad8 ad8Var = this.K.a;
            if (ad8Var != null) {
                ad8Var.d();
            }
        }
        j();
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.s.cancel();
            this.s = null;
        }
        this.y = false;
        ua5 ua5Var = this.E;
        gm.r(ua5Var);
        if (z) {
            this.r = 0.0f;
            if (z3 && getWidth() > 0 && getHeight() > 0 && !e(getWidth(), getHeight())) {
                this.y = true;
                gm.d3(ua5Var, 500L);
            } else {
                g();
            }
        } else {
            this.r = 1.0f;
            a();
        }
        d();
    }

    public final void g() {
        this.y = false;
        gm.r(this.E);
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.s.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.s = ofFloat;
        ofFloat.setDuration(420L);
        this.s.setInterpolator(d53.h);
        this.s.addUpdateListener(new fh4(this, (byte) 9));
        this.s.addListener(new v85(this, (byte) 2));
        this.s.start();
    }

    @Override
    public final int getChildDrawingOrder(int i, int i2) {
        int[] iArr = this.I;
        if (iArr == null || iArr.length != i) {
            iArr = new int[i];
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                int indexOfChild = indexOfChild((ya5) obj);
                if (indexOfChild >= 0 && i3 < i) {
                    iArr[i3] = indexOfChild;
                    i3++;
                }
            }
            ArrayList arrayList2 = this.b;
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList2.get(i5);
                i5++;
                int indexOfChild2 = indexOfChild((ya5) obj2);
                if (indexOfChild2 >= 0 && i3 < i) {
                    iArr[i3] = indexOfChild2;
                    i3++;
                }
            }
            ArrayList arrayList3 = this.a;
            int size3 = arrayList3.size();
            int i6 = 0;
            while (i6 < size3) {
                Object obj3 = arrayList3.get(i6);
                i6++;
                int indexOfChild3 = indexOfChild((ya5) obj3);
                if (indexOfChild3 >= 0 && i3 < i) {
                    iArr[i3] = indexOfChild3;
                    i3++;
                }
            }
            for (int i7 = 0; i7 < i && i3 < i; i7++) {
                if (!(getChildAt(i7) instanceof ya5)) {
                    iArr[i3] = i7;
                    i3++;
                }
            }
            if (i3 != i) {
                for (int i8 = 0; i8 < i; i8++) {
                    iArr[i8] = i8;
                }
            }
            this.I = iArr;
        }
        return iArr[i2];
    }

    public final void h() {
        if (!this.w) {
            return;
        }
        int i = 0;
        this.w = false;
        gm.r(this.J);
        this.f.b();
        this.y = false;
        gm.r(this.E);
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.s.cancel();
            this.s = null;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ya5 ya5Var = (ya5) obj;
            ya5Var.b();
            removeView(ya5Var);
        }
        ArrayList arrayList2 = this.b;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            ya5 ya5Var2 = (ya5) obj2;
            ya5Var2.b();
            removeView(ya5Var2);
        }
        ArrayList arrayList3 = this.c;
        int size3 = arrayList3.size();
        while (i < size3) {
            Object obj3 = arrayList3.get(i);
            i++;
            ya5 ya5Var3 = (ya5) obj3;
            ya5Var3.b();
            removeView(ya5Var3);
        }
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
        this.r = 1.0f;
    }

    public final void i(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va5.i(boolean):void");
    }

    public final void j() {
        int width = getWidth();
        int height = getHeight();
        if (width != 0 && height != 0) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ya5 ya5Var = (ya5) obj;
                float[] fArr = ya5Var.O;
                int round = Math.round((fArr[2] - fArr[0]) * width);
                float[] fArr2 = ya5Var.O;
                int round2 = Math.round((fArr2[3] - fArr2[1]) * height);
                int max = Math.max(1, round);
                int max2 = Math.max(1, round2);
                float f = ya5Var.K;
                if (f > 0.0f) {
                    float f2 = max;
                    float f3 = max2;
                    if (f2 / f3 > f) {
                        max2 = Math.round(f2 / f);
                    } else {
                        max = Math.round(f3 * f);
                    }
                }
                if (max != ya5Var.S || max2 != ya5Var.T) {
                    ya5Var.S = max;
                    ya5Var.T = max2;
                    ya5Var.requestLayout();
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L = gm.L(6.0f);
        int L2 = gm.L(6.0f);
        int L3 = gm.L(6.0f);
        ImageView imageView = this.e;
        imageView.layout(L, L2, imageView.getMeasuredWidth() + L3, imageView.getMeasuredHeight() + gm.L(6.0f));
        int i5 = i3 - i;
        TextView textView = this.d;
        int measuredWidth = (i5 - textView.getMeasuredWidth()) / 2;
        textView.layout(measuredWidth, gm.L(8.0f), textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight() + gm.L(8.0f));
        this.f.layout(0, 0, i5, i4 - i2);
        d();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        this.e.measure(View.MeasureSpec.makeMeasureSpec(gm.L(28.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(28.0f), 1073741824));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - gm.L(64.0f)), 1073741824), 0);
        this.f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        j();
        if (this.y && i > 0 && i2 > 0 && e(i, i2)) {
            post(this.E);
        } else if (!this.y) {
            post(new ua5(this, (byte) 0));
        }
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.I = null;
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.I = null;
    }
}
