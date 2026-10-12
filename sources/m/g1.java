package m;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public final class g1 {
    public static final RectF f15102l = new RectF();
    public static final ConcurrentHashMap f15103m = new ConcurrentHashMap();
    public int f15104a = 0;
    public boolean f15105b = false;
    public float f15106c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f15107f = new int[0];
    public boolean f15108g = false;
    public TextPaint h;
    public final TextView f15109i;
    public final Context f15110j;
    public final d1 f15111k;

    static {
        new ConcurrentHashMap();
    }

    public g1(TextView textView) {
        this.f15109i = textView;
        this.f15110j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f15111k = new e1();
        } else {
            this.f15111k = new d1();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f15103m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
                return method;
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    public final void a() {
        int measuredWidth;
        if (f()) {
            if (this.f15105b) {
                if (this.f15109i.getMeasuredHeight() > 0 && this.f15109i.getMeasuredWidth() > 0) {
                    if (this.f15111k.b(this.f15109i)) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.f15109i.getMeasuredWidth() - this.f15109i.getTotalPaddingLeft()) - this.f15109i.getTotalPaddingRight();
                    }
                    int height = (this.f15109i.getHeight() - this.f15109i.getCompoundPaddingBottom()) - this.f15109i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f15102l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = measuredWidth;
                                rectF.bottom = height;
                                float c10 = c(rectF);
                                if (c10 != this.f15109i.getTextSize()) {
                                    g(c10, 0);
                                }
                            } finally {
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f15105b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence charSequence;
        CharSequence transformation;
        int length = this.f15107f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 0;
            int i12 = 1;
            while (i12 <= i10) {
                int i13 = (i12 + i10) / 2;
                int i14 = this.f15107f[i13];
                TextView textView = this.f15109i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    charSequence = transformation;
                } else {
                    charSequence = text;
                }
                int b10 = a1.b(textView);
                TextPaint textPaint = this.h;
                if (textPaint == null) {
                    this.h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.h.set(textView.getPaint());
                this.h.setTextSize(i14);
                StaticLayout a2 = c1.a(charSequence, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b10, this.f15109i, this.h, this.f15111k);
                if ((b10 != -1 && (a2.getLineCount() > b10 || a2.getLineEnd(a2.getLineCount() - 1) != charSequence.length())) || a2.getHeight() > rectF.bottom) {
                    i11 = i13 - 1;
                    i10 = i11;
                } else {
                    int i15 = i13 + 1;
                    i11 = i12;
                    i12 = i15;
                }
            }
            return this.f15107f[i11];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean f() {
        if (j() && this.f15104a != 0) {
            return true;
        }
        return false;
    }

    public final void g(float f7, int i10) {
        Resources resources;
        Context context = this.f15110j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i10, f7, resources.getDisplayMetrics());
        TextView textView = this.f15109i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a2 = b1.a(textView);
            if (textView.getLayout() != null) {
                this.f15105b = false;
                try {
                    Method d = d("nullLayouts");
                    if (d != null) {
                        d.invoke(textView, null);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!a2) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f15104a == 1) {
            if (!this.f15108g || this.f15107f.length == 0) {
                int floor = ((int) Math.floor((this.e - this.d) / this.f15106c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f15106c) + this.d);
                }
                this.f15107f = b(iArr);
            }
            this.f15105b = true;
        } else {
            this.f15105b = false;
        }
        return this.f15105b;
    }

    public final boolean i() {
        int[] iArr;
        int length;
        boolean z10;
        if (this.f15107f.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15108g = z10;
        if (z10) {
            this.f15104a = 1;
            this.d = iArr[0];
            this.e = iArr[length - 1];
            this.f15106c = -1.0f;
        }
        return z10;
    }

    public final boolean j() {
        return !(this.f15109i instanceof s);
    }

    public final void k(float f7, float f10, float f11) {
        if (f7 > 0.0f) {
            if (f10 > f7) {
                if (f11 > 0.0f) {
                    this.f15104a = 1;
                    this.d = f7;
                    this.e = f10;
                    this.f15106c = f11;
                    this.f15108g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f7 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f7 + "px) is less or equal to (0px)");
    }
}
