package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.StateSet;
public abstract class sjb {
    public static final int a = bkb.c6;
    public static float[] b;

    public static float[] a(float... fArr) {
        if (fArr.length == 0) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        return fArr.length == 1 ? new float[]{gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[0])} : fArr.length == 2 ? new float[]{gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[1]), gl.L(fArr[1]), gl.L(fArr[1]), gl.L(fArr[1])} : fArr.length == 3 ? new float[]{gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[1]), gl.L(fArr[1]), gl.L(fArr[2]), gl.L(fArr[2]), gl.L(fArr[2]), gl.L(fArr[2])} : fArr.length < 8 ? new float[]{gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[1]), gl.L(fArr[1]), gl.L(fArr[2]), gl.L(fArr[2]), gl.L(fArr[3]), gl.L(fArr[3])} : new float[]{gl.L(fArr[0]), gl.L(fArr[1]), gl.L(fArr[2]), gl.L(fArr[3]), gl.L(fArr[4]), gl.L(fArr[5]), gl.L(fArr[6]), gl.L(fArr[7])};
    }

    public static int b(int i) {
        float f;
        float f2;
        float f3;
        float[] fArr = b;
        if (fArr == null) {
            fArr = new float[3];
            b = fArr;
        }
        Color.colorToHSV(i, fArr);
        float[] fArr2 = b;
        float f4 = fArr2[1];
        if (f4 > 0.01f) {
            if (bkb.I.o()) {
                f2 = 0.25f;
            } else {
                f2 = -0.25f;
            }
            fArr2[1] = Math.min(1.0f, Math.max(0.0f, f4 + f2));
            float[] fArr3 = b;
            float f5 = fArr3[2];
            if (bkb.I.o()) {
                f3 = 0.05f;
            } else {
                f3 = -0.05f;
            }
            fArr3[2] = Math.min(1.0f, Math.max(0.0f, f5 + f3));
        } else {
            float f6 = fArr2[2];
            if (bkb.I.o()) {
                f = 0.1f;
            } else {
                f = -0.1f;
            }
            fArr2[2] = Math.min(1.0f, Math.max(0.0f, f6 + f));
        }
        return Color.HSVToColor(127, b);
    }

    public static ff0 c(wl9 wl9Var, int i) {
        ColorStateList colorStateList = new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i});
        wl9 wl9Var2 = new wl9((byte) 1);
        if (wl9.c == null) {
            Paint paint = new Paint(1);
            wl9.c = paint;
            paint.setColor(-1);
        }
        wl9Var2.b = wl9.c;
        return new RippleDrawable(colorStateList, wl9Var, wl9Var2);
    }

    public static ff0 d(int i, int i2, float... fArr) {
        ShapeDrawable shapeDrawable;
        ShapeDrawable shapeDrawable2;
        if (i != 0) {
            int i3 = 0;
            while (true) {
                if (i3 < Math.min(8, fArr.length)) {
                    if (fArr[i3] > 0.0f) {
                        ShapeDrawable shapeDrawable3 = new ShapeDrawable(new RoundRectShape(a(fArr), null, null));
                        shapeDrawable3.getPaint().setColor(i);
                        shapeDrawable = shapeDrawable3;
                        break;
                    }
                    i3++;
                } else {
                    shapeDrawable = new ColorDrawable(i);
                    break;
                }
            }
        } else {
            shapeDrawable = null;
        }
        int i4 = 0;
        while (true) {
            if (i4 < Math.min(8, fArr.length)) {
                if (fArr[i4] > 0.0f) {
                    shapeDrawable2 = new ShapeDrawable(new RoundRectShape(a(fArr), null, null));
                    shapeDrawable2.getPaint().setColor(-1);
                    break;
                }
                i4++;
            } else {
                shapeDrawable2 = new ShapeDrawable(new RectShape());
                shapeDrawable2.getPaint().setColor(-1);
                break;
            }
        }
        return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i2}), shapeDrawable, shapeDrawable2);
    }

    public static ff0 e(int i, float... fArr) {
        return d(i, b(i), fArr);
    }

    public static ff0 f(int i, float... fArr) {
        return e(bkb.w0(null, i, false), fArr);
    }
}
