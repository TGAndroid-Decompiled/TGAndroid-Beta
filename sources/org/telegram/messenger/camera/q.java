package org.telegram.messenger.camera;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.opengl.GLUtils;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.d3;
public abstract class q {
    public static int A(float f10, int i3, int i10) {
        return i10 - (g0.L(f10) * i3);
    }

    public static int B(float f10, int i3, int i10) {
        return View.MeasureSpec.makeMeasureSpec(g0.L(f10) + i3, i10);
    }

    public static int C(float f10, int i3, int i10) {
        return Math.min(i10, i3 - g0.L(f10));
    }

    public static int D(float f10, int i3, int i10) {
        return (i3 - g0.L(f10)) + i10;
    }

    public static int a(d3 d3Var) {
        int boundLeft = d3Var.getBoundLeft();
        int boundRight = d3Var.getBoundRight();
        if (boundLeft >= 0 && boundRight >= 0 && boundRight >= boundLeft) {
            return boundRight - boundLeft;
        }
        return -1;
    }

    public static float b(float f10, float f11, float f12, float f13) {
        return ((f10 + f11) * f12) + f13;
    }

    public static int c(float f10, int i3, int i10) {
        return View.MeasureSpec.makeMeasureSpec(i3 - g0.L(f10), i10);
    }

    public static TextPaint d(TextPaint textPaint, int i3) {
        textPaint.setTypeface(g0.o());
        return new TextPaint(i3);
    }

    public static ImageView e(Context context, int i3) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i3);
        return imageView;
    }

    public static TextView f(LinearLayout linearLayout, TextView textView, LinearLayout.LayoutParams layoutParams, Context context) {
        linearLayout.addView(textView, layoutParams);
        return new TextView(context);
    }

    public static FloatBuffer g(ByteBuffer byteBuffer) {
        return byteBuffer.order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static t2 h(Activity activity, boolean z10, int i3, e6 e6Var) {
        t2 t2Var = new t2(i3, activity, e6Var, z10);
        t2Var.N();
        return t2Var;
    }

    public static void i(float f10, ValueAnimator valueAnimator) {
        valueAnimator.setInterpolator(new OvershootInterpolator(f10));
    }

    public static void j(int i3, d2 d2Var) {
        d2Var.presentFragment(new ThemeActivity(i3));
    }

    public static void k(ViewPropertyAnimator viewPropertyAnimator, float f10, long j10) {
        viewPropertyAnimator.alpha(f10).setDuration(j10).start();
    }

    public static void l(ViewPropertyAnimator viewPropertyAnimator, xq xqVar, long j10) {
        viewPropertyAnimator.setInterpolator(xqVar).setDuration(j10).start();
    }

    public static void m(TextView textView, int i3, float f10) {
        textView.setTypeface(g0.o());
        textView.setTextSize(i3, f10);
    }

    public static void n(TextView textView, int i3, float f10, int i10, int i11) {
        textView.setTextSize(i3, f10);
        textView.setLines(i10);
        textView.setMaxLines(i11);
    }

    public static void o(TextView textView, int i3, e6 e6Var, String str, int i10) {
        r6.V(textView, i3, e6Var);
        textView.setText(bd.M0(i10, str));
    }

    public static void p(gh.g gVar, float f10, float f11) {
        gVar.r(f10);
        gVar.q(g0.L(f11));
    }

    public static void q(String str, int i3, StringBuilder sb2, String str2) {
        sb2.append(bd.M0(i3, str));
        sb2.append(str2);
    }

    public static void r(String str, int i3, fc fcVar) {
        fcVar.i(bd.M0(i3, str)).j();
    }

    public static void s(String str, fc fcVar, int i3, int i10) {
        fcVar.Q(i3, i10, g0.X2(str)).j();
    }

    public static void t(EGL10 egl10, StringBuilder sb2) {
        sb2.append(GLUtils.getEGLErrorString(egl10.eglGetError()));
        a8.d(sb2.toString());
    }

    public static boolean u(TLRPC.TL_game tL_game) {
        if (tL_game != null) {
            return true;
        }
        return false;
    }

    public static float v(float f10, float f11, float f12, float f13) {
        return f13 - ((f10 / f11) * f12);
    }

    public static int w(float f10, int i3, int i10) {
        return i10 - (g0.L(f10) + i3);
    }

    public static float x(float f10, float f11, float f12, float f13) {
        return (f12 - (f10 / f11)) * f13;
    }

    public static int y(float f10, int i3, int i10) {
        return (i3 - g0.L(f10)) / i10;
    }

    public static float z(float f10, float f11, float f12, float f13) {
        return Math.max(f13, Math.min(f12, f10 + f11));
    }
}
