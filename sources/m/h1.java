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

    public static final RectF f17324l = new RectF();

    public static final ConcurrentHashMap f17325m = new ConcurrentHashMap();

    public int f17326a = 0;

    public boolean f17327b = false;

    public float f17328c = -1.0f;
    public float d = -1.0f;

    public float f17329e = -1.0f;

    public int[] f17330f = new int[0];

    public boolean f17331g = false;
    public TextPaint h;

    public final TextView f17332i;

    public final Context f17333j;

    public final g1 f17334k;

    static {
        new ConcurrentHashMap();
    }

    public h1(TextView textView) {
        this.f17332i = textView;
        this.f17333j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            this.f17334k = new f1();
        } else if (i10 >= 23) {
            this.f17334k = new e1();
        } else {
            this.f17334k = new g1();
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
            ConcurrentHashMap concurrentHashMap = f17325m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e9) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e9);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e9) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e9);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f17327b) {
                if (this.f17332i.getMeasuredHeight() <= 0 || this.f17332i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f17334k.b(this.f17332i) ? 1048576 : (this.f17332i.getMeasuredWidth() - this.f17332i.getTotalPaddingLeft()) - this.f17332i.getTotalPaddingRight();
                int height = (this.f17332i.getHeight() - this.f17332i.getCompoundPaddingBottom()) - this.f17332i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f17324l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f17332i.getTextSize()) {
                            g(fC, 0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f17327b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f17330f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = length - 1;
        int i11 = 1;
        int i12 = 0;
        while (i11 <= i10) {
            int i13 = (i11 + i10) / 2;
            int i14 = this.f17330f[i13];
            TextView textView = this.f17332i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int i15 = Build.VERSION.SDK_INT;
            int iB = b1.b(textView);
            TextPaint textPaint = this.h;
            if (textPaint == null) {
                this.h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.h.set(textView.getPaint());
            this.h.setTextSize(i14);
            Layout.Alignment alignment = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            int iRound = Math.round(rectF.right);
            StaticLayout staticLayoutA = i15 >= 23 ? d1.a(charSequence, alignment, iRound, iB, this.f17332i, this.h, this.f17334k) : b1.a(charSequence, alignment, iRound, textView, this.h);
            if ((iB == -1 || (staticLayoutA.getLineCount() <= iB && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == charSequence.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i16 = i13 + 1;
                i12 = i11;
                i11 = i16;
            } else {
                i12 = i13 - 1;
                i10 = i12;
            }
        }
        return this.f17330f[i12];
    }

    public final boolean f() {
        return j() && this.f17326a != 0;
    }

    public final void g(float f10, int i10) {
        Context context = this.f17333j;
        float fApplyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f17332i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zA = c1.a(textView);
            if (textView.getLayout() != null) {
                this.f17327b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e9) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e9);
                }
                if (zA) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f17326a == 1) {
            if (!this.f17331g || this.f17330f.length == 0) {
                int iFloor = ((int) Math.floor((this.f17329e - this.d) / this.f17328c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f17328c) + this.d);
                }
                this.f17330f = b(iArr);
            }
            this.f17327b = true;
        } else {
            this.f17327b = false;
        }
        return this.f17327b;
    }

    public final boolean i() {
        int[] iArr = this.f17330f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f17331g = z10;
        if (z10) {
            this.f17326a = 1;
            this.d = iArr[0];
            this.f17329e = iArr[length - 1];
            this.f17328c = -1.0f;
        }
        return z10;
    }

    public final boolean j() {
        return !(this.f17332i instanceof t);
    }

    public final void k(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f17326a = 1;
        this.d = f10;
        this.f17329e = f11;
        this.f17328c = f12;
        this.f17331g = false;
    }
}
