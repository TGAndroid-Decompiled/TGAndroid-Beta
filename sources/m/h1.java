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
    public static final RectF f16548l = new RectF();
    public static final ConcurrentHashMap f16549m = new ConcurrentHashMap();
    public int f16550a = 0;
    public boolean f16551b = false;
    public float f16552c = -1.0f;
    public float d = -1.0f;
    public float f16553e = -1.0f;
    public int[] f16554f = new int[0];
    public boolean f16555g = false;
    public TextPaint h;
    public final TextView f16556i;
    public final Context f16557j;
    public final g1 f16558k;

    static {
        new ConcurrentHashMap();
    }

    public h1(TextView textView) {
        this.f16556i = textView;
        this.f16557j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            this.f16558k = new f1();
        } else if (i10 >= 23) {
            this.f16558k = new e1();
        } else {
            this.f16558k = new g1();
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
            ConcurrentHashMap concurrentHashMap = f16549m;
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

    public static Object e(Object obj, String str, Object obj2) {
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
            if (this.f16551b) {
                if (this.f16556i.getMeasuredHeight() > 0 && this.f16556i.getMeasuredWidth() > 0) {
                    if (this.f16558k.b(this.f16556i)) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.f16556i.getMeasuredWidth() - this.f16556i.getTotalPaddingLeft()) - this.f16556i.getTotalPaddingRight();
                    }
                    int height = (this.f16556i.getHeight() - this.f16556i.getCompoundPaddingBottom()) - this.f16556i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f16548l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = measuredWidth;
                                rectF.bottom = height;
                                float c3 = c(rectF);
                                if (c3 != this.f16556i.getTextSize()) {
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
            this.f16551b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence charSequence;
        StaticLayout a2;
        CharSequence transformation;
        int length = this.f16554f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                int i14 = this.f16554f[i13];
                TextView textView = this.f16556i;
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
                    a2 = d1.a(charSequence, alignment, round, b10, this.f16556i, this.h, this.f16558k);
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
            return this.f16554f[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean f() {
        if (j() && this.f16550a != 0) {
            return true;
        }
        return false;
    }

    public final void g(float f9, int i10) {
        Resources resources;
        Context context = this.f16557j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i10, f9, resources.getDisplayMetrics());
        TextView textView = this.f16556i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a2 = c1.a(textView);
            if (textView.getLayout() != null) {
                this.f16551b = false;
                try {
                    Method d = d("nullLayouts");
                    if (d != null) {
                        d.invoke(textView, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
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
        if (j() && this.f16550a == 1) {
            if (!this.f16555g || this.f16554f.length == 0) {
                int floor = ((int) Math.floor((this.f16553e - this.d) / this.f16552c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f16552c) + this.d);
                }
                this.f16554f = b(iArr);
            }
            this.f16551b = true;
        } else {
            this.f16551b = false;
        }
        return this.f16551b;
    }

    public final boolean i() {
        boolean z10;
        int[] iArr = this.f16554f;
        int length = iArr.length;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16555g = z10;
        if (z10) {
            this.f16550a = 1;
            this.d = iArr[0];
            this.f16553e = iArr[length - 1];
            this.f16552c = -1.0f;
        }
        return z10;
    }

    public final boolean j() {
        return !(this.f16556i instanceof t);
    }

    public final void k(float f9, float f10, float f11) {
        if (f9 > 0.0f) {
            if (f10 > f9) {
                if (f11 > 0.0f) {
                    this.f16550a = 1;
                    this.d = f9;
                    this.f16553e = f10;
                    this.f16552c = f11;
                    this.f16555g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f9 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f9 + "px) is less or equal to (0px)");
    }
}
