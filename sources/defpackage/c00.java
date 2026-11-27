package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.opengl.GLUtils;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.webrtc.TextureBufferImpl;
public abstract class c00 {
    public static int A(float f, int i, int i2) {
        return (i - hl.L(f)) + i2;
    }

    public static float B(float f, float f2, float f3, float f4) {
        return ((f / f2) * f3) + f4;
    }

    public static String C(int i) {
        switch (i) {
            case 1:
                return "IDLE";
            case 2:
                return "STARTING";
            case 3:
                return "RECORDING";
            case 4:
                return "PAUSING";
            case 5:
                return "PREVIEWING";
            case 6:
                return "RESUMING";
            case 7:
                return "FINISHING";
            case 8:
                return "COMPLETED";
            case 9:
                return "ERROR";
            case 10:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static TextureBufferImpl a(TextureBufferImpl textureBufferImpl, boolean z, int i) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        if (z) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preRotate(i);
        matrix.preTranslate(-0.5f, -0.5f);
        return textureBufferImpl.applyTransformMatrix(matrix, textureBufferImpl.getWidth(), textureBufferImpl.getHeight());
    }

    public static int b(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    return 0;
                }
                return 270;
            }
            return 180;
        }
        return 90;
    }

    public static float c(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) / f4;
    }

    public static int d(float f, int i, int i2) {
        return Math.max(i2, i - hl.L(f));
    }

    public static Drawable e(Context context, int i) {
        return context.getResources().getDrawable(i).mutate();
    }

    public static CharSequence f(ema emaVar, String str, boolean z, int[] iArr, int i) {
        return pv3.m(str, emaVar.getPaint().getFontMetricsInt(), z, iArr, i);
    }

    public static Object g(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String h(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static String j(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String k(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder l(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        return sb;
    }

    public static HashMap m(Class cls, wx wxVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, wxVar);
        return hashMap;
    }

    public static Map n(HashMap hashMap) {
        return DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void o(float f, ValueAnimator valueAnimator) {
        valueAnimator.setInterpolator(new OvershootInterpolator(f));
    }

    public static void p(int i, String str, String str2) {
        efd.f(str2, str + i);
    }

    public static void q(int i, StringBuilder sb) {
        sb.append(i);
        cc4.b(sb.toString());
    }

    public static void r(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(Integer.valueOf(i), str);
        hashMap.put(Integer.valueOf(i2), str2);
    }

    public static void s(String str, int i, ArrayList arrayList, int i2, ArrayList arrayList2) {
        arrayList.add(ob6.M0(i, str));
        arrayList2.add(Integer.valueOf(i2));
    }

    public static void t(String str, int i, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(ob6.M0(i, str));
        arrayList2.add(num);
    }

    public static void u(String str, int i, AlertDialog$Builder alertDialog$Builder, fd fdVar) {
        alertDialog$Builder.j(ob6.M0(i, str), fdVar);
        alertDialog$Builder.o();
    }

    public static void v(String str, d31 d31Var, int i, int i2) {
        d31Var.Q(i, i2, hl.S2(str)).j();
    }

    public static void w(EGL10 egl10, StringBuilder sb) {
        sb.append(GLUtils.getEGLErrorString(egl10.eglGetError()));
        cc4.d(sb.toString());
    }

    public static float x(float f, float f2, float f3, float f4) {
        return (f * f2 * f3) + f4;
    }

    public static int y(float f, int i, int i2) {
        return Math.min(i2, i - hl.L(f));
    }

    public static float z(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) / f4;
    }
}
