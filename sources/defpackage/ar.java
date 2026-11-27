package defpackage;

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
public final class ar {
    public static final RectF l = new RectF();
    public static final ConcurrentHashMap m = new ConcurrentHashMap();
    public int a = 0;
    public boolean b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public TextPaint h;
    public final TextView i;
    public final Context j;
    public final xq k;

    public ar(TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.k = new yq();
        } else {
            this.k = new xq();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
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
            if (this.b) {
                if (this.i.getMeasuredHeight() > 0 && this.i.getMeasuredWidth() > 0) {
                    if (this.k.b(this.i)) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                    }
                    int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = measuredWidth;
                            rectF.bottom = height;
                            float c = c(rectF);
                            if (c != this.i.getTextSize()) {
                                g(c, 0);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence charSequence;
        CharSequence transformation;
        int length = this.f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 0;
            int i3 = 1;
            while (true) {
                int[] iArr = this.f;
                if (i3 <= i) {
                    int i4 = (i3 + i) / 2;
                    int i5 = iArr[i4];
                    TextView textView = this.i;
                    CharSequence text = textView.getText();
                    TransformationMethod transformationMethod = textView.getTransformationMethod();
                    if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                        charSequence = transformation;
                    } else {
                        charSequence = text;
                    }
                    int b = uq.b(textView);
                    TextPaint textPaint = this.h;
                    if (textPaint == null) {
                        this.h = new TextPaint();
                    } else {
                        textPaint.reset();
                    }
                    this.h.set(textView.getPaint());
                    this.h.setTextSize(i5);
                    StaticLayout a = wq.a(charSequence, (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), b, this.i, this.h, this.k);
                    if ((b != -1 && (a.getLineCount() > b || a.getLineEnd(a.getLineCount() - 1) != charSequence.length())) || a.getHeight() > rectF.bottom) {
                        i2 = i4 - 1;
                        i = i2;
                    } else {
                        int i6 = i4 + 1;
                        i2 = i3;
                        i3 = i6;
                    }
                } else {
                    return iArr[i2];
                }
            }
        } else {
            grb.i("No available text sizes to choose from.");
            return 0;
        }
    }

    public final boolean f() {
        if (j() && this.a != 0) {
            return true;
        }
        return false;
    }

    public final void g(float f, int i) {
        Resources resources;
        Context context = this.j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        TextView textView = this.i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a = vq.a(textView);
            if (textView.getLayout() != null) {
                this.b = false;
                try {
                    Method d = d("nullLayouts");
                    if (d != null) {
                        d.invoke(textView, null);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!a) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.a == 1) {
            if (!this.g || this.f.length == 0) {
                int floor = ((int) Math.floor((this.e - this.d) / this.c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.c) + this.d);
                }
                this.f = b(iArr);
            }
            this.b = true;
            return true;
        }
        this.b = false;
        return false;
    }

    public final boolean i() {
        int[] iArr;
        int length;
        boolean z;
        if (this.f.length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        if (z) {
            this.a = 1;
            this.d = iArr[0];
            this.e = iArr[length - 1];
            this.c = -1.0f;
        }
        return z;
    }

    public final boolean j() {
        return !(this.i instanceof ip);
    }

    public final void k(float f, float f2, float f3) {
        if (f > 0.0f) {
            if (f2 > f) {
                if (f3 > 0.0f) {
                    this.a = 1;
                    this.d = f;
                    this.e = f2;
                    this.c = f3;
                    this.g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
    }
}
