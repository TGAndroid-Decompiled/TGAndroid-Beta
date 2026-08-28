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
    public static final RectF f16949l = new RectF();
    public static final ConcurrentHashMap f16950m = new ConcurrentHashMap();
    public int f16951a = 0;
    public boolean f16952b = false;
    public float f16953c = -1.0f;
    public float d = -1.0f;
    public float f16954e = -1.0f;
    public int[] f16955f = new int[0];
    public boolean f16956g = false;
    public TextPaint h;
    public final TextView f16957i;
    public final Context f16958j;
    public final g1 f16959k;

    static {
        new ConcurrentHashMap();
    }

    public h1(TextView textView) {
        this.f16957i = textView;
        this.f16958j = textView.getContext();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            this.f16959k = new f1();
        } else if (i9 >= 23) {
            this.f16959k = new e1();
        } else {
            this.f16959k = new g1();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i9 : iArr) {
                if (i9 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i9)) < 0) {
                    arrayList.add(Integer.valueOf(i9));
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
            ConcurrentHashMap concurrentHashMap = f16950m;
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
            if (this.f16952b) {
                if (this.f16957i.getMeasuredHeight() > 0 && this.f16957i.getMeasuredWidth() > 0) {
                    if (this.f16959k.b(this.f16957i)) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.f16957i.getMeasuredWidth() - this.f16957i.getTotalPaddingLeft()) - this.f16957i.getTotalPaddingRight();
                    }
                    int height = (this.f16957i.getHeight() - this.f16957i.getCompoundPaddingBottom()) - this.f16957i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f16949l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = measuredWidth;
                                rectF.bottom = height;
                                float c10 = c(rectF);
                                if (c10 != this.f16957i.getTextSize()) {
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
            this.f16952b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence charSequence;
        StaticLayout a2;
        CharSequence transformation;
        int length = this.f16955f.length;
        if (length != 0) {
            int i9 = length - 1;
            int i10 = 1;
            int i11 = 0;
            while (i10 <= i9) {
                int i12 = (i10 + i9) / 2;
                int i13 = this.f16955f[i12];
                TextView textView = this.f16957i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    charSequence = transformation;
                } else {
                    charSequence = text;
                }
                int i14 = Build.VERSION.SDK_INT;
                int b10 = b1.b(textView);
                TextPaint textPaint = this.h;
                if (textPaint == null) {
                    this.h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.h.set(textView.getPaint());
                this.h.setTextSize(i13);
                Layout.Alignment alignment = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                int round = Math.round(rectF.right);
                if (i14 >= 23) {
                    a2 = d1.a(charSequence, alignment, round, b10, this.f16957i, this.h, this.f16959k);
                } else {
                    a2 = b1.a(charSequence, alignment, round, textView, this.h);
                }
                if ((b10 != -1 && (a2.getLineCount() > b10 || a2.getLineEnd(a2.getLineCount() - 1) != charSequence.length())) || a2.getHeight() > rectF.bottom) {
                    i11 = i12 - 1;
                    i9 = i11;
                } else {
                    int i15 = i12 + 1;
                    i11 = i10;
                    i10 = i15;
                }
            }
            return this.f16955f[i11];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean f() {
        if (j() && this.f16951a != 0) {
            return true;
        }
        return false;
    }

    public final void g(float f10, int i9) {
        Resources resources;
        Context context = this.f16958j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i9, f10, resources.getDisplayMetrics());
        TextView textView = this.f16957i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a2 = c1.a(textView);
            if (textView.getLayout() != null) {
                this.f16952b = false;
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
        if (j() && this.f16951a == 1) {
            if (!this.f16956g || this.f16955f.length == 0) {
                int floor = ((int) Math.floor((this.f16954e - this.d) / this.f16953c)) + 1;
                int[] iArr = new int[floor];
                for (int i9 = 0; i9 < floor; i9++) {
                    iArr[i9] = Math.round((i9 * this.f16953c) + this.d);
                }
                this.f16955f = b(iArr);
            }
            this.f16952b = true;
        } else {
            this.f16952b = false;
        }
        return this.f16952b;
    }

    public final boolean i() {
        boolean z10;
        int[] iArr = this.f16955f;
        int length = iArr.length;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16956g = z10;
        if (z10) {
            this.f16951a = 1;
            this.d = iArr[0];
            this.f16954e = iArr[length - 1];
            this.f16953c = -1.0f;
        }
        return z10;
    }

    public final boolean j() {
        return !(this.f16957i instanceof t);
    }

    public final void k(float f10, float f11, float f12) {
        if (f10 > 0.0f) {
            if (f11 > f10) {
                if (f12 > 0.0f) {
                    this.f16951a = 1;
                    this.d = f10;
                    this.f16954e = f11;
                    this.f16953c = f12;
                    this.f16956g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
    }
}
