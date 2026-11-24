package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Random;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class ug8 {
    public static final int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138};

    public static boolean A(Object obj) {
        if (obj != null) {
            return true;
        }
        return false;
    }

    public static int B(float f, int i, int i2) {
        return i2 - (gl.L(f) + i);
    }

    public static int C(vg5 vg5Var, float f, int i) {
        vg5Var.getClass();
        return gl.L(f) + i;
    }

    public static int D(float f, int i, int i2) {
        return (i - gl.L(f)) / i2;
    }

    public static int E(float f, int i, int i2) {
        return View.MeasureSpec.makeMeasureSpec(gl.L(f) + i, i2);
    }

    public static int F(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static int[] G(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }

    public static int a(dw dwVar) {
        int boundLeft = dwVar.getBoundLeft();
        int boundRight = dwVar.getBoundRight();
        if (boundLeft >= 0 && boundRight >= 0 && boundRight >= boundLeft) {
            return boundRight - boundLeft;
        }
        return -1;
    }

    public static Integer b(int i) {
        if (i == 0) {
            return null;
        }
        return Integer.valueOf(i - 1);
    }

    public static boolean c(int i, int i2) {
        if (i != 0) {
            if (i == i2) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public static double d(double d, double d2, double d3) {
        return (Math.cos(d) * d2) + d3;
    }

    public static float e(Random random, float f, float f2) {
        return (random.nextFloat() * f) + f2;
    }

    public static int f(float f, int i, int i2) {
        return View.MeasureSpec.makeMeasureSpec(i - gl.L(f), i2);
    }

    public static int g(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }

    public static int h(vg5 vg5Var, float f, int i) {
        vg5Var.getClass();
        return i - gl.L(f);
    }

    public static fx0 i(Activity activity, boolean z, int i, wjb wjbVar) {
        fx0 fx0Var = new fx0(i, wjbVar, activity, z);
        fx0Var.K();
        return fx0Var;
    }

    public static kr2 j(String str, int i, int i2, int i3, qr2 qr2Var) {
        jr2 b = ir2.b();
        b.b = str;
        b.v(i);
        b.w(i2, i3);
        return b.u(qr2Var);
    }

    public static kr2 k(String str, String str2, int i, qr2 qr2Var) {
        jr2 b = ir2.b();
        b.b = str;
        b.c = str2;
        b.v(i);
        return b.u(qr2Var);
    }

    public static TextView l(FrameLayout frameLayout, TextView textView, FrameLayout.LayoutParams layoutParams, Context context) {
        frameLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static TextView m(LinearLayout linearLayout, TextView textView, LinearLayout.LayoutParams layoutParams, Context context) {
        linearLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static String n(long j, String str, String str2) {
        return str + j + str2;
    }

    public static StringBuilder o(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder p(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void q(long j, StringBuilder sb) {
        sb.append(j);
        fa4.b(sb.toString());
    }

    public static void r(il0 il0Var, float f, float f2) {
        il0Var.r(f);
        il0Var.q(gl.L(f2));
    }

    public static void s(ViewPropertyAnimator viewPropertyAnimator, float f, long j) {
        viewPropertyAnimator.alpha(f).setDuration(j).start();
    }

    public static void t(ViewPropertyAnimator viewPropertyAnimator, s33 s33Var, long j) {
        viewPropertyAnimator.setInterpolator(s33Var).setDuration(j).start();
    }

    public static void u(FrameLayout frameLayout, wjb wjbVar, TLRPC.TL_error tL_error, boolean z) {
        new u21(frameLayout, wjbVar).g0(tL_error, z);
    }

    public static void v(TextView textView, int i, float f) {
        textView.setTypeface(gl.o());
        textView.setTextSize(i, f);
    }

    public static void w(TextView textView, int i, float f, int i2, int i3) {
        textView.setTextSize(i, f);
        textView.setLines(i2);
        textView.setMaxLines(i3);
    }

    public static void x(TextView textView, int i, wjb wjbVar, String str, int i2) {
        zkb.X(textView, i, wjbVar);
        textView.setText(k96.M0(i2, str));
    }

    public static void y(String str, int i, AlertDialog$Builder alertDialog$Builder, ed edVar) {
        alertDialog$Builder.g(k96.M0(i, str), edVar);
        alertDialog$Builder.o();
    }

    public static void z(String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }
}
