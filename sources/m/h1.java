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
public final class h1 {
    public static final RectF f19105l = new RectF();
    public static final ConcurrentHashMap f19106m = new ConcurrentHashMap();
    public int f19107a = 0;
    public boolean f19108b = false;
    public float f19109c = -1.0f;
    public float d = -1.0f;
    public float f19110e = -1.0f;
    public int[] f19111f = new int[0];
    public boolean f19112g = false;
    public TextPaint h;
    public final TextView f19113i;
    public final Context f19114j;
    public final e1 f19115k;

    static {
        new ConcurrentHashMap();
    }

    public h1(TextView textView) {
        this.f19113i = textView;
        this.f19114j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f19115k = new f1();
        } else {
            this.f19115k = new e1();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i7 : iArr) {
                if (i7 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i7)) < 0) {
                    arrayList.add(Integer.valueOf(i7));
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
            ConcurrentHashMap concurrentHashMap = f19106m;
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
            if (this.f19108b) {
                if (this.f19113i.getMeasuredHeight() > 0 && this.f19113i.getMeasuredWidth() > 0) {
                    if (this.f19115k.b(this.f19113i)) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.f19113i.getMeasuredWidth() - this.f19113i.getTotalPaddingLeft()) - this.f19113i.getTotalPaddingRight();
                    }
                    int height = (this.f19113i.getHeight() - this.f19113i.getCompoundPaddingBottom()) - this.f19113i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f19105l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = measuredWidth;
                                rectF.bottom = height;
                                float c10 = c(rectF);
                                if (c10 != this.f19113i.getTextSize()) {
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
            this.f19108b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence charSequence;
        CharSequence transformation;
        int length = this.f19111f.length;
        if (length != 0) {
            int i7 = length - 1;
            int i10 = 0;
            int i11 = 1;
            while (i11 <= i7) {
                int i12 = (i11 + i7) / 2;
                int i13 = this.f19111f[i12];
                TextView textView = this.f19113i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    charSequence = transformation;
                } else {
                    charSequence = text;
                }
                int b10 = b1.b(textView);
                TextPaint textPaint = this.h;
                if (textPaint == null) {
                    this.h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.h.set(textView.getPaint());
                this.h.setTextSize(i13);
                StaticLayout a10 = d1.a(charSequence, (Layout.Alignment) e("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b10, this.f19113i, this.h, this.f19115k);
                if ((b10 != -1 && (a10.getLineCount() > b10 || a10.getLineEnd(a10.getLineCount() - 1) != charSequence.length())) || a10.getHeight() > rectF.bottom) {
                    i10 = i12 - 1;
                    i7 = i10;
                } else {
                    int i14 = i12 + 1;
                    i10 = i11;
                    i11 = i14;
                }
            }
            return this.f19111f[i10];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean f() {
        if (j() && this.f19107a != 0) {
            return true;
        }
        return false;
    }

    public final void g(float f10, int i7) {
        Resources resources;
        Context context = this.f19114j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i7, f10, resources.getDisplayMetrics());
        TextView textView = this.f19113i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a10 = c1.a(textView);
            if (textView.getLayout() != null) {
                this.f19108b = false;
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
        if (j() && this.f19107a == 1) {
            if (!this.f19112g || this.f19111f.length == 0) {
                int floor = ((int) Math.floor((this.f19110e - this.d) / this.f19109c)) + 1;
                int[] iArr = new int[floor];
                for (int i7 = 0; i7 < floor; i7++) {
                    iArr[i7] = Math.round((i7 * this.f19109c) + this.d);
                }
                this.f19111f = b(iArr);
            }
            this.f19108b = true;
        } else {
            this.f19108b = false;
        }
        return this.f19108b;
    }

    public final boolean i() {
        int[] iArr;
        int length;
        boolean z9;
        if (this.f19111f.length > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f19112g = z9;
        if (z9) {
            this.f19107a = 1;
            this.d = iArr[0];
            this.f19110e = iArr[length - 1];
            this.f19109c = -1.0f;
        }
        return z9;
    }

    public final boolean j() {
        return !(this.f19113i instanceof t);
    }

    public final void k(float f10, float f11, float f12) {
        if (f10 > 0.0f) {
            if (f11 > f10) {
                if (f12 > 0.0f) {
                    this.f19107a = 1;
                    this.d = f10;
                    this.f19110e = f11;
                    this.f19109c = f12;
                    this.f19112g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
    }
}
