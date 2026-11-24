package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.opengl.GLUtils;
import android.view.animation.OvershootInterpolator;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.webrtc.TextureBufferImpl;
public abstract class b10 {
    public static float A(float f, float f2, float f3, float f4) {
        return ((f / f2) * f3) + f4;
    }

    public static String B(int i) {
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

    public static float b(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) / f4;
    }

    public static int c(float f, int i, int i2) {
        return Math.max(i2, i - gm.L(f));
    }

    public static Drawable d(Context context, int i) {
        return context.getResources().getDrawable(i).mutate();
    }

    public static CharSequence e(lka lkaVar, String str, boolean z, int[] iArr, int i) {
        return gw3.m(str, lkaVar.getPaint().getFontMetricsInt(), z, iArr, i);
    }

    public static Object f(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String g(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static String i(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String j(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder k(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        return sb;
    }

    public static HashMap l(Class cls, wy wyVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, wyVar);
        return hashMap;
    }

    public static Map m(HashMap hashMap) {
        return DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void n(float f, ValueAnimator valueAnimator) {
        valueAnimator.setInterpolator(new OvershootInterpolator(f));
    }

    public static void o(int i, String str, String str2) {
        ncd.f(str2, str + i);
    }

    public static void p(int i, StringBuilder sb) {
        sb.append(i);
        fc4.b(sb.toString());
    }

    public static void q(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(Integer.valueOf(i), str);
        hashMap.put(Integer.valueOf(i2), str2);
    }

    public static void r(String str, int i, ArrayList arrayList, int i2, ArrayList arrayList2) {
        arrayList.add(jb6.M0(i, str));
        arrayList2.add(Integer.valueOf(i2));
    }

    public static void s(String str, int i, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        arrayList.add(jb6.M0(i, str));
        arrayList2.add(num);
    }

    public static void t(String str, int i, AlertDialog$Builder alertDialog$Builder, ee eeVar) {
        alertDialog$Builder.j(jb6.M0(i, str), eeVar);
        alertDialog$Builder.o();
    }

    public static void u(String str, c41 c41Var, int i, int i2) {
        c41Var.Q(i, i2, gm.S2(str)).j();
    }

    public static void v(EGL10 egl10, StringBuilder sb) {
        sb.append(GLUtils.getEGLErrorString(egl10.eglGetError()));
        fc4.d(sb.toString());
    }

    public static float w(float f, float f2, float f3, float f4) {
        return (f * f2 * f3) + f4;
    }

    public static int x(float f, int i, int i2) {
        return Math.min(i2, i - gm.L(f));
    }

    public static float y(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) / f4;
    }

    public static int z(float f, int i, int i2) {
        return (i - gm.L(f)) + i2;
    }
}
