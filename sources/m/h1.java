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
    public static final RectF f13516l = new RectF();
    public static final ConcurrentHashMap f13517m = new ConcurrentHashMap();
    public int f13518a = 0;
    public boolean f13519b = false;
    public float f13520c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f13521f = new int[0];
    public boolean f13522g = false;
    public TextPaint h;
    public final TextView f13523i;
    public final Context f13524j;
    public final g1 f13525k;

    static {
        new ConcurrentHashMap();
    }

    public h1(TextView textView) {
        this.f13523i = textView;
        this.f13524j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            this.f13525k = new f1();
        } else if (i10 >= 23) {
            this.f13525k = new e1();
        } else {
            this.f13525k = new g1();
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
            ConcurrentHashMap concurrentHashMap = f13517m;
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
            if (this.f13519b) {
                if (this.f13523i.getMeasuredHeight() > 0 && this.f13523i.getMeasuredWidth() > 0) {
                    if (this.f13525k.b(this.f13523i)) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.f13523i.getMeasuredWidth() - this.f13523i.getTotalPaddingLeft()) - this.f13523i.getTotalPaddingRight();
                    }
                    int height = (this.f13523i.getHeight() - this.f13523i.getCompoundPaddingBottom()) - this.f13523i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f13516l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = measuredWidth;
                                rectF.bottom = height;
                                float c3 = c(rectF);
                                if (c3 != this.f13523i.getTextSize()) {
                                    g(c3, 0);
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
            this.f13519b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence charSequence;
        StaticLayout a2;
        CharSequence transformation;
        int length = this.f13521f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                int i14 = this.f13521f[i13];
                TextView textView = this.f13523i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    charSequence = transformation;
                } else {
                    charSequence = text;
                }
                int i15 = Build.VERSION.SDK_INT;
                int b10 = b1.b(textView);
                TextPaint textPaint = this.h;
                if (textPaint == null) {
                    this.h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.h.set(textView.getPaint());
                this.h.setTextSize(i14);
                Layout.Alignment alignment = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                int round = Math.round(rectF.right);
                if (i15 >= 23) {
                    a2 = d1.a(charSequence, alignment, round, b10, this.f13523i, this.h, this.f13525k);
                } else {
                    a2 = b1.a(charSequence, alignment, round, textView, this.h);
                }
                if ((b10 != -1 && (a2.getLineCount() > b10 || a2.getLineEnd(a2.getLineCount() - 1) != charSequence.length())) || a2.getHeight() > rectF.bottom) {
                    i12 = i13 - 1;
                    i10 = i12;
                } else {
                    int i16 = i13 + 1;
                    i12 = i11;
                    i11 = i16;
                }
            }
            return this.f13521f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean f() {
        if (j() && this.f13518a != 0) {
            return true;
        }
        return false;
    }

    public final void g(float f10, int i10) {
        Resources resources;
        Context context = this.f13524j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics());
        TextView textView = this.f13523i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a2 = c1.a(textView);
            if (textView.getLayout() != null) {
                this.f13519b = false;
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
        if (j() && this.f13518a == 1) {
            if (!this.f13522g || this.f13521f.length == 0) {
                int floor = ((int) Math.floor((this.e - this.d) / this.f13520c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f13520c) + this.d);
                }
                this.f13521f = b(iArr);
            }
            this.f13519b = true;
        } else {
            this.f13519b = false;
        }
        return this.f13519b;
    }

    public final boolean i() {
        boolean z4;
        int[] iArr = this.f13521f;
        int length = iArr.length;
        if (length > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f13522g = z4;
        if (z4) {
            this.f13518a = 1;
            this.d = iArr[0];
            this.e = iArr[length - 1];
            this.f13520c = -1.0f;
        }
        return z4;
    }

    public final boolean j() {
        return !(this.f13523i instanceof s);
    }

    public final void k(float f10, float f11, float f12) {
        if (f10 > 0.0f) {
            if (f11 > f10) {
                if (f12 > 0.0f) {
                    this.f13518a = 1;
                    this.d = f10;
                    this.e = f11;
                    this.f13520c = f12;
                    this.f13522g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
    }
}
