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
    public static final RectF f18579l = new RectF();
    public static final ConcurrentHashMap f18580m = new ConcurrentHashMap();
    public int f18581a = 0;
    public boolean f18582b = false;
    public float f18583c = -1.0f;
    public float d = -1.0f;
    public float f18584e = -1.0f;
    public int[] f18585f = new int[0];
    public boolean f18586g = false;
    public TextPaint h;
    public final TextView f18587i;
    public final Context f18588j;
    public final d1 f18589k;

    static {
        new ConcurrentHashMap();
    }

    public g1(TextView textView) {
        this.f18587i = textView;
        this.f18588j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f18589k = new e1();
        } else {
            this.f18589k = new d1();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i3 : iArr) {
                if (i3 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i3)) < 0) {
                    arrayList.add(Integer.valueOf(i3));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr2[i10] = ((Integer) arrayList.get(i10)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f18580m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
                return method;
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static Object e(String str, Object obj, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public final void a() {
        int measuredWidth;
        if (f()) {
            if (this.f18582b) {
                if (this.f18587i.getMeasuredHeight() > 0 && this.f18587i.getMeasuredWidth() > 0) {
                    if (this.f18589k.b(this.f18587i)) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.f18587i.getMeasuredWidth() - this.f18587i.getTotalPaddingLeft()) - this.f18587i.getTotalPaddingRight();
                    }
                    int height = (this.f18587i.getHeight() - this.f18587i.getCompoundPaddingBottom()) - this.f18587i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f18579l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = measuredWidth;
                                rectF.bottom = height;
                                float c2 = c(rectF);
                                if (c2 != this.f18587i.getTextSize()) {
                                    g(c2, 0);
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
            this.f18582b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence charSequence;
        CharSequence transformation;
        int length = this.f18585f.length;
        if (length != 0) {
            int i3 = length - 1;
            int i10 = 0;
            int i11 = 1;
            while (i11 <= i3) {
                int i12 = (i11 + i3) / 2;
                int i13 = this.f18585f[i12];
                TextView textView = this.f18587i;
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
                this.h.setTextSize(i13);
                StaticLayout a10 = c1.a(charSequence, (Layout.Alignment) e("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b10, this.f18587i, this.h, this.f18589k);
                if ((b10 != -1 && (a10.getLineCount() > b10 || a10.getLineEnd(a10.getLineCount() - 1) != charSequence.length())) || a10.getHeight() > rectF.bottom) {
                    i10 = i12 - 1;
                    i3 = i10;
                } else {
                    int i14 = i12 + 1;
                    i10 = i11;
                    i11 = i14;
                }
            }
            return this.f18585f[i10];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean f() {
        if (j() && this.f18581a != 0) {
            return true;
        }
        return false;
    }

    public final void g(float f10, int i3) {
        Resources resources;
        Context context = this.f18588j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i3, f10, resources.getDisplayMetrics());
        TextView textView = this.f18587i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a10 = b1.a(textView);
            if (textView.getLayout() != null) {
                this.f18582b = false;
                try {
                    Method d = d("nullLayouts");
                    if (d != null) {
                        d.invoke(textView, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!a10) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f18581a == 1) {
            if (!this.f18586g || this.f18585f.length == 0) {
                int floor = ((int) Math.floor((this.f18584e - this.d) / this.f18583c)) + 1;
                int[] iArr = new int[floor];
                for (int i3 = 0; i3 < floor; i3++) {
                    iArr[i3] = Math.round((i3 * this.f18583c) + this.d);
                }
                this.f18585f = b(iArr);
            }
            this.f18582b = true;
        } else {
            this.f18582b = false;
        }
        return this.f18582b;
    }

    public final boolean i() {
        int[] iArr;
        int length;
        boolean z10;
        if (this.f18585f.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18586g = z10;
        if (z10) {
            this.f18581a = 1;
            this.d = iArr[0];
            this.f18584e = iArr[length - 1];
            this.f18583c = -1.0f;
        }
        return z10;
    }

    public final boolean j() {
        return !(this.f18587i instanceof s);
    }

    public final void k(float f10, float f11, float f12) {
        if (f10 > 0.0f) {
            if (f11 > f10) {
                if (f12 > 0.0f) {
                    this.f18581a = 1;
                    this.d = f10;
                    this.f18584e = f11;
                    this.f18583c = f12;
                    this.f18586g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
    }
}
